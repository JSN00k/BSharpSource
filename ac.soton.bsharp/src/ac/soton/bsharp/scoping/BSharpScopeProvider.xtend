package ac.soton.bsharp.scoping

import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider
import org.eclipse.xtext.scoping.IScope
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.EcoreUtil2
import ac.soton.bsharp.bSharp.ClassDecl
import ac.soton.bsharp.bSharp.Datatype
import ac.soton.bsharp.util.EcoreUtilJ
import org.eclipse.xtext.scoping.Scopes
import ac.soton.bsharp.bSharp.IPolyTypeProvider
import ac.soton.bsharp.bSharp.TopLevel
import ac.soton.bsharp.bSharp.IVariableProvider
import ac.soton.bsharp.bSharp.MatchCase
import ac.soton.bsharp.bSharp.MatchStatement
import ac.soton.bsharp.bSharp.DatatypeConstructor
import ac.soton.bsharp.util.BSharpUtil
import ac.soton.bsharp.bSharp.TypedVariable
import java.util.ArrayList
import ac.soton.bsharp.bSharp.ClassVarDecl
import ac.soton.bsharp.bSharp.PolyType
import ac.soton.bsharp.bSharp.BSClass
import ac.soton.bsharp.bSharp.FunctionDecl
import java.lang.reflect.Array
import ac.soton.bsharp.bSharp.GenName
import ac.soton.bsharp.bSharp.Extend
import ac.soton.bsharp.bSharp.TypedVariableList
import ac.soton.bsharp.bSharp.VariableTyping
import ac.soton.bsharp.bSharp.TypeConstructor
import ac.soton.bsharp.bSharp.ExpressionVariable
import ac.soton.bsharp.bSharp.Instance
import ac.soton.bsharp.bSharp.IClassInstance
import ac.soton.bsharp.bSharp.TopLevelInstance
import org.eclipse.xtext.parser.packrat.tokens.AssignmentToken.End
import ac.soton.bsharp.bSharp.FileImport
import ac.soton.bsharp.bSharp.util.CompilationUtil
import java.util.List
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.xtext.naming.IQualifiedNameProvider
import javax.inject.Inject
import ac.soton.bsharp.bSharp.BSharpBlock
import org.eclipse.xtext.resource.IEObjectDescription
import ac.soton.bsharp.bSharp.ReferencingFunc

class BSharpScopeProvider extends AbstractDeclarativeScopeProvider {
	
	@Inject extension IQualifiedNameProvider
	
	def IScope scope_TopLevelFile(EObject context, EReference reference) {
		/* We only want objects from the global scope. */
		var scope = delegateGetScope(context, reference)
		
		return scope
	}
	
	def IScope scope_GenName(EObject context, EReference reference) {		
		var parent = delegateGetScope(context, reference)
		/* Gen_Name is used when we know that the type found is either a Type or a 
		 * Type Variable. It is necessary to find any polymorphic types, or any type 
		 * names from the local scope here.
		 */
		 var polyScope = getPolyScopeFor(context, parent)
		 
		 /* Find the top level element that the GenName is declared within */
		 var EObject typeContainer
		 if (context instanceof TopLevel)
		 	typeContainer = context
		 else
		 	typeContainer = EcoreUtilJ.eContainerMatchingLambda(context, [obj | obj instanceof TopLevel])
		 	
		 val typeContainerFinal = typeContainer
		 val rootElement = EcoreUtil2.getRootContainer(context)
		 
		 var ArrayList<GenName> elements = EcoreUtilJ.eFilterUpToWith(rootElement, [object | object == typeContainerFinal], 
			[object | object instanceof ClassDecl]) as ArrayList<GenName>
			
		val bsClass = EcoreUtil2.getContainerOfType(context, BSClass)
		if (bsClass !== null) {
			elements.add(bsClass.instName)
		}
		
		val extend = EcoreUtil2.getContainerOfType(context, Extend)
		if (extend !== null) {
			val extendedClass = extend.extendedClass
			if (extendedClass instanceof BSClass)
				elements.add((extendedClass as BSClass).instName)
		}

		return Scopes.scopeFor(elements, polyScope)
	}
	
	def IScope scope_ClassDecl(EObject context, EReference reference) {
		val parent = delegateGetScope(context, reference)
		
		/* Any Class Declaration above the current location can be referenced. */
		
		val rootObj = EcoreUtil2.getRootContainer(context)
		var typeNames = EcoreUtilJ.eFilterUpToIncludingWith(rootObj, [object | object == context], 
			[object | object instanceof ClassDecl]
		)
		return Scopes.scopeFor(typeNames, parent)
	}
	
	def IScope scope_ExpressionVariable(ClassVarDecl ctx, EReference reference) {
		/* In this case it is necessary to check the class referenced from GenName, then
		 * finding it's referencable variables
		 */
		 
		 var genName = ctx.ownerType
		 if (genName instanceof PolyType) {
		 	val polyType = genName as PolyType
		 	if (polyType.superTypes !== null && !polyType.superTypes.empty) {
		 		/* We now need to iterate over the constraints and find the applicable
		 		 * member variables and functions.
		 		 */
		 		 val superClasses = BSharpUtil.expandConstraintTypes(polyType.superTypes)
		 		 var result = IScope.NULLSCOPE
		 		 for (superClass : superClasses) {
		 		 	result = getVariableScopeIncludingForCtxInclusive(superClass, result)
		 		 }
		 		 
		 		 return result
		 	}
		 }
		 
		 return IScope.NULLSCOPE
	}
	
	def IScope scope_ExpressionVariable(EObject context, EReference reference) {
		/* The definition of an expression variable is 
		 * ExpressionVariable:
	 	 *	FunctionName | TypedVariable | ClassDecl
		 *  ; 
		 *  Classes that provide expression variables implement the IVariableProvider
		 *  interface making it easier to find them all.
		 * 
		 * Function names are a special case as they can be cousins of the referenced variable
		 */
		 
		var parent = delegateGetScope(context, reference)

		var classDeclTmp = EcoreUtil2.getContainerOfType(context, ClassDecl)
		var BSharpBlock currentBlock
		
		if (classDeclTmp === null) {
			var extend = EcoreUtil2.getContainerOfType(context, Extend)
			currentBlock = extend.block
			classDeclTmp = extend.extendedClass
		} else {
			currentBlock = classDeclTmp.block
		}
		
		val classDecl = classDeclTmp

		var ArrayList<ExpressionVariable> variables = new ArrayList

		if (classDecl !== null) {
			if (classDecl instanceof BSClass) {
				for (sc : BSharpUtil.superClasses(classDecl)) {
					if (sc instanceof BSClass) {
						val superClass = sc as BSClass
						if (superClass.getVarList !== null)
							variables += EcoreUtil2.getAllContentsOfType(superClass.getVarList, TypedVariable)
					}
				}
			} else {
				// classDecl is an instance of Datatype
				variables += (classDecl as Datatype).constructors
			}
			parent = Scopes.scopeFor(variables, parent)
		}

		val rootObj = EcoreUtil2.getRootContainer(context)

		/* FunctionName can be any function within the current body, or any body above. */
		val functionNames = EcoreUtilJ.eFilterUpToIncludingWith(rootObj, [object|object == classDecl], [ object |
			object instanceof FunctionDecl
		])

		var scope = getVariableScopeFor(context, parent)
		scope = Scopes.scopeFor(functionNames, scope)

		return scope;
	}
	
	def IScope scope_TypedVariable(MatchCase context, EReference reference) {
		val parent = IScope.NULLSCOPE
		/* Assumes we're in a function declaration, as there isn't anywhere else for a match statement
		 * yet. */
		val datatype = EcoreUtil2.getContainerOfType((context.eContainer as MatchStatement).match, Datatype)
			
		if (datatype !== null) {
			val  matches = EcoreUtil2.getAllContentsOfType(datatype, DatatypeConstructor)
			return Scopes.scopeFor(matches, parent)
		}
		
		return parent
	}
	
	def IScope scope_DatatypeConstructor(MatchCase context, EReference reference) {		
		val matchStatement = EcoreUtil2.getContainerOfType(context, MatchStatement)
		val wrappedDType = matchStatement.match.calculateType
		
		if (!wrappedDType.isDatatype) {
			return IScope.NULLSCOPE
		}
		
		val dType = wrappedDType.getDatatype;
		val elements = dType.getConstructors()
		
		return Scopes.scopeFor(elements, IScope.NULLSCOPE)
	}
	
	def IScope scope_IClassInstance(Instance context, EReference ref) {
		/* It's either got to be an instance variable declared above the current location in an extension
		 * of the same type, we're currently in, or it has to be the type that we're currently in.
		 */
		
		var ArrayList<EObject> classInstances  = new ArrayList()
		
		/* find the class name */
		var ClassDecl associatedClassTmp;
		val container = EcoreUtil2.getContainerOfType(context, TopLevelInstance)
		if (container instanceof ClassDecl) {
			associatedClassTmp = container as ClassDecl
		} else {
			associatedClassTmp = (container as Extend).extendedClass
		}
		
		val associatedClass = associatedClassTmp
		
		classInstances.add(associatedClass)
		
		classInstances.addAll(CompilationUtil.filterInscopeBSharpBlocks(context, [EObject e | 
		 	if (e instanceof Extend) {
		 		return (e as Extend).extendedClass.equals(associatedClass)
		 	}
		 	
		 	return false
		 ]))
		 
		return Scopes.scopeFor(classInstances)
	}
	
	def List<FunctionDecl> getImportedFuncs(EObject context) {
		val topLevels = CompilationUtil.getAllImportedTopLevelInstances(context)
		val ArrayList<FunctionDecl> importedFuncs = newArrayList
		
		for (topLevel : topLevels) {
			importedFuncs += EcoreUtil2.getAllContentsOfType(topLevel, FunctionDecl)
		}
		
		return importedFuncs
	}
	
	/* I'm not sure that this function will get called above the scope_ExpressionVariable
	 * function, so it may be necessary to move this logic into the scope_ExpressionVariable.
	 * I definitely need to implement logic like this for datatype constructors and destructors.
	 */
	def IScope scope_FunctionDecl(ReferencingFunc context, EReference ref) {
		/* We want all the function in the super types, all of the functions from the imported types,
		 *  and all of the functions declared above this point in this file. Much of this work is 
		 * already done in scope_ExpressionVariable, We still need to add the imported functions
		 */
		 val parent = scope_ExpressionVariable(context, ref)
		/* Get all imports */
		var importedFuncs = getImportedFuncs(context)
		
		Scopes.scopeFor(importedFuncs, parent)
		
		return parent
	}
	
	def IScope scope_InfixFunc(EObject context, EReference ref) {
		val ArrayList<FunctionDecl> functions = newArrayList
		functions += EcoreUtilJ.eFindAllInstancesBefore(context, FunctionDecl)
		functions += getImportedFuncs(context)
		
		var result = functions.filter[object | return object.getInfix == "INFIX"]
		return Scopes.scopeFor(result)
	}

	def IScope getPolyScopeFor(EObject context, IScope parent) {
		val polyProvider = EcoreUtilJ.eContainerMatchingLambda(context, 
			[obj | obj instanceof IPolyTypeProvider]) as IPolyTypeProvider
		
		if (polyProvider === null) {
			return parent
		}
		
		val parentScope = getPolyScopeFor(polyProvider as EObject, parent)
		
		if (parentScope === null) {
			return Scopes.scopeFor(polyProvider.polyTypeNames)
		} else {
			return Scopes.scopeFor(polyProvider.polyTypeNames, parentScope)
		}
	}
	
	def IScope getVariableScopeIncludingForCtxInclusive(EObject ctx, IScope scope) {
		val parentScope = getVariableScopeFor(ctx, scope)
		if (ctx instanceof IVariableProvider) {
			val varProv = ctx as IVariableProvider
			val variableNames = varProv.variablesNames
			
			if (variableNames === null)
				return parentScope
			else
				return Scopes.scopeFor(variableNames, parentScope)
		}
		
		return parentScope
	}
	
	def IScope getVariableScopeFor(EObject context, IScope parent) {
		val variableProvider = EcoreUtilJ.eContainerMatchingLambda(context, 
			[obj | obj instanceof IVariableProvider]) as IVariableProvider
		
		if (variableProvider === null) {
			return parent
		}
		
		val parentScope = getVariableScopeFor(variableProvider as EObject, parent)
		
		if (variableProvider.variablesNames === null) {
			return parentScope;
		}
		
		if (parentScope === null) {
			return Scopes.scopeFor(variableProvider.variablesNames)
		} else {
			return Scopes.scopeFor(variableProvider.variablesNames, parentScope)
		}
	}
}