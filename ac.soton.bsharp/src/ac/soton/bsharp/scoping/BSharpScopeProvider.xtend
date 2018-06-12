/*
 * generated by Xtext 2.12.0
 */
package ac.soton.bsharp.scoping

import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.scoping.Scopes
import ac.soton.bsharp.bSharp.PolymorphicTypeName
import org.eclipse.xtext.EcoreUtil2
import ac.soton.bsharp.bSharp.TypeName
import ac.soton.bsharp.bSharp.GenName
import ac.soton.bsharp.bSharp.BppClass
import ac.soton.bsharp.bSharp.BSharpPackage
import java.util.ArrayList
import org.eclipse.xtext.xbase.lib.Functions.Function1
import ac.soton.bsharp.bSharp.ClassDecl
import ac.soton.bsharp.bSharp.FunctionName
import org.eclipse.xtext.scoping.IScope
import ac.soton.bsharp.bSharp.QuantLambda
import ac.soton.bsharp.bSharp.FunctionDecl
import ac.soton.bsharp.bSharp.Extend
import java.util.List
import ac.soton.bsharp.bSharp.TypedVariable
import ac.soton.bsharp.bSharp.TypeConstructor
import ac.soton.bsharp.bSharp.Datatype
import java.util.Collection
import ac.soton.bsharp.EcoreUtilJ
import ac.soton.bsharp.bSharp.MatchCase
import ac.soton.bsharp.bSharp.MatchStatement

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
class BSharpScopeProvider extends AbstractBSharpScopeProvider {
	
	override getScope(EObject context, EReference reference) {
		/* This doesn't work, I believe that the issue is that  */
		if (context instanceof TypeConstructor && reference.getEReferenceType() == BSharpPackage.Literals.GEN_NAME) {
			/* Get scope for the class, and use it to check for polymorphic variable. Care needs to 
			 * be taken here  as this is not complete, and will need to be added to when declaring 
			 * functions and methods. */
			var classDecl = EcoreUtil2.getContainerOfType(context, ClassDecl)
			if (classDecl === null) {
				val extend = EcoreUtil2.getContainerOfType(context, Extend)
				if (extend !== null) {
					classDecl = extend.name.eContainer as ClassDecl
				}
			}
			
			if (classDecl !== null) {
				val finalClassDecl = classDecl
				val allElems = new ArrayList<GenName>()
				if (classDecl.context !== null) {
					allElems.addAll(EcoreUtil2.getAllContentsOfType(classDecl.context, PolymorphicTypeName))
				 }

				/* TODO: Turn this into a look up that includes imports */
				val rootElement = EcoreUtil2.getRootContainer(context)
				/* Predictably The Class elements returned from the statement above are in the
				 * order in which they appear in the file. I can therefore simply remove any elements
				 * from the returned list that appear after the current ndx.
				 */
				 
				 if (classDecl instanceof Datatype) {
				   allElems.addAll(EcoreUtilJ.eFilterUpToIncludingWith(rootElement, [object | object==finalClassDecl],
					[object | object instanceof TypeName]) as Collection<TypeName>)
				} else {
					allElems.addAll(EcoreUtilJ.eFilterUpToWith(rootElement, [object | object==finalClassDecl],
					[object | object instanceof TypeName]) as Collection<TypeName>)
				}

				val scope = Scopes.scopeFor(allElems)
				return scope
			}
		} else if (reference.getEReferenceType == BSharpPackage.Literals.TYPE_NAME) {
			/* Only allow type names above the current typename
			 * TODO: Need to include global imports.
			 */
			 
			 val rootObj = EcoreUtil2.getRootContainer(context)
			 var typeNames = EcoreUtilJ.eFilterUpToIncludingWith(rootObj, [object | object == context], [object | object instanceof TypeName])
			 return Scopes.scopeFor(typeNames)
		} else if (reference.getEReferenceType == BSharpPackage.Literals.EXPRESSION_VARIABLE) {
			/* Here's the definition:
			 * ExpressionVariable:
			 *	 FunctionName | TypedVariable | TypeName
			 *  ;
			 * 
			 * I can use scoping to check for obvious mistakes in these references. However, believe that I 
			 * will need to use validation to do the more complicated type checking. Currently this only checks
			 * that the names are available to me.
			 */
			 
			 /* If this becomes to computationally expensive it is possible to do this in a 
			  * single iteration of the tree, however it's harder to write the code, so first 
			  * attempt users multiple iterations.
			  * 
			  * TODO: Global scope it all!
			  */
			 
			 val rootObj = EcoreUtil2.getRootContainer(context)
			 val currentClass = EcoreUtil2.getContainerOfType(context, ClassDecl)
			 
			 /* FunctionName can be any function within the current body, or any body above. 
			  */
			 var functionNames = EcoreUtilJ.eFilterUpToIncludingWith(rootObj, [object | object == currentClass], [object | object instanceof FunctionName])
			 
			 /* TypedVariableScope */
			 var scope = getLocalVariableScopeForContext(context)
			 
			 if (scope !== null)
			 	return Scopes.scopeFor(functionNames, scope)
			 else
			 	return Scopes.scopeFor(functionNames)
		} else if (reference.getEReferenceType() == BSharpPackage.Literals.TYPED_VARIABLE && context instanceof MatchCase){
			/* Assumes we're in a function declaration, as there isn't anywhere else for a match statement
			 * yet. */
			val datatype = EcoreUtil2.getContainerOfType((context.eContainer as MatchStatement).match, Datatype)
			
			if (datatype !== null) {
				val allResults = new ArrayList<EObject>
				
				datatype.varList.forEach[obj | allResults.addAll(EcoreUtil2.getAllContentsOfType(obj, TypedVariable))]
				return Scopes.scopeFor(allResults)
			}
		} else if (reference == BSharpPackage.Literals.MATCH_CASE) {
			print (reference)
		}
		
		

		return super.getScope(context, reference)
	}
	
	def IScope getLocalVariableScopeForContext(EObject context) {
		return getPolyOrVariableScopeFor(context, PolyOrVariable.VARIABLE )
	}
	
	def IScope getPolymorphicScopeForContext(EObject context) {
		return getPolyOrVariableScopeFor(context, PolyOrVariable.POLY)
	}
	
	private enum PolyOrVariable { POLY, VARIABLE}
	
	private def IScope getPolyOrVariableScopeFor(EObject context, PolyOrVariable polyOrVar) {
		var nameGetter = null as Function1<EObject, List<? extends EObject>>
		if (polyOrVar == PolyOrVariable.VARIABLE){
		nameGetter = [object | 
			 	/* I'm not experienced enough with Xtext/Java to work out how to give the 
			 	 * object a shared interface, so I'm going to be really bad and use 
			 	 * reflection instead. This relies on all variable lists being called
			 	 * "varList"
			 	 */
			 	val method = object.getClass().getMethod("getVarList", null)
			 	val varList = method.invoke(object, null) as EObject
			 		
			 	var allResults = new ArrayList<EObject>
			 	
			 	if (varList !== null)
			 		allResults.addAll(EcoreUtil2.getAllContentsOfType(varList, TypedVariable))
			 	
			 	if (object instanceof BppClass) {
			 		allResults.add((object as BppClass).typeName)
			 	}
			 	
			 	return  allResults
			 ]
		} else {
			nameGetter = [object | 
			 	/* I'm not experienced enough with Xtext/Java to work out how to give the 
			 	 * object a shared interface, so I'm going to be really bad and use 
			 	 * reflection instead. This relies on all variable lists being called
			 	 * "varList"
			 	 */
			 	 val method = object.getClass().getMethod("getContext", null)
			 	val polyContext = method.invoke(object, null) as EObject
			 	if (polyContext === null)
			 		return null
			 		
			 	return EcoreUtil2.getAllContentsOfType(polyContext, PolymorphicTypeName)
			 ]
		}
		
		/* Typed variable scopes can come from any ancestor that declares typed variables.
		 * This includes Lambdas, Quantifiers, FunctionDeclarations, and Class Declarations */
		 val containerWithTypeVariable = EcoreUtilJ.eContainerMatchingLambda(context, [object | object instanceof QuantLambda
		 	|| object instanceof FunctionDecl || object instanceof BppClass || object instanceof Extend
		 ])
		 
		 if (containerWithTypeVariable === null)
		 	return null
//		 
		 if (containerWithTypeVariable instanceof Extend) {
		 	/* An Extend declaration is the end of the recursion. There's nowhere higher that
		 	 * TypeVariables could be declared.
		 	 */ 
		 	val extend = containerWithTypeVariable as Extend
		 	if (extend.name.eContainer instanceof BppClass) {
		 		val bppClass = extend.name.eContainer as BppClass
		 		if (polyOrVar == PolyOrVariable.VARIABLE) {
		 			var scopeVars = new ArrayList<EObject>
		 			if (bppClass.varList !== null)
		 				scopeVars.addAll(EcoreUtil2.getAllContentsOfType(bppClass.varList, TypedVariable))
		 				
		 			scopeVars.add(bppClass.typeName)
		 			return Scopes.scopeFor(scopeVars)
		 		} else {
		 			return Scopes.scopeFor(EcoreUtil2.getAllContentsOfType(bppClass.context, PolymorphicTypeName))
		 		}	
		 	}
		 	
		 	return null
		 }

		val names = nameGetter.apply(containerWithTypeVariable)
		val parentScope = getPolyOrVariableScopeFor(containerWithTypeVariable, polyOrVar)
		

		if (parentScope === null) {
			if (names === null)
				return null
			else
				return Scopes.scopeFor(names)
		} else {
			if (names === null)
				return parentScope
			else
				return Scopes.scopeFor(names, parentScope)
		}
	}
	

}
