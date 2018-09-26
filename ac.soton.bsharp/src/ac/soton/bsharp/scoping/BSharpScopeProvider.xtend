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
import ac.soton.bsharp.bSharp.FunctionName
import ac.soton.bsharp.bSharp.IVariableProvider
import ac.soton.bsharp.bSharp.MatchCase
import ac.soton.bsharp.bSharp.MatchStatement
import ac.soton.bsharp.bSharp.DatatypeConstructor
import ac.soton.bsharp.util.BSharpInbuiltTypeProvider

class BSharpScopeProvider extends AbstractDeclarativeScopeProvider {
	def IScope scope_GenName(EObject context, EReference reference) {
		var parent = delegateGetScope(context, reference)
		/* Gen_Name is used when we know that the type found is either a Type or a 
		 * Type Variable. It is necessary to find any polymorphic types, or any type 
		 * names from the local scope here.
		 */
		 parent = Scopes.scopeFor(BSharpInbuiltTypeProvider.allInbuiltTypes(), parent)
		 
		 var polyScope = getPolyScopeFor(context, parent)
		 
		 /* Find the top level element that the GenName is declared within */
		 var EObject typeContainer
		 if (context instanceof TopLevel)
		 	typeContainer = context
		 else
		 	typeContainer = EcoreUtilJ.eContainerMatchingLambda(context, [obj | obj instanceof TopLevel])
		 	
		 val typeContainerFinal = typeContainer
		 val rootElement = EcoreUtil2.getRootContainer(context)
		 
		 val elements = EcoreUtilJ.eFilterUpToIncludingWith(rootElement, [object | object == typeContainerFinal], 
			[object | object instanceof ClassDecl])

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
		 
		val parent = delegateGetScope(context, reference)
		val rootObj = EcoreUtil2.getRootContainer(context)
		val currentClass = EcoreUtil2.getContainerOfType(context, ClassDecl)
		
		/* FunctionName can be any function within the current body, or any body above. */
		var functionNames = EcoreUtilJ.eFilterUpToIncludingWith(rootObj, 
			[object | object == currentClass], [object | object instanceof FunctionName])
		
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