package ac.soton.bsharp.scoping

import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider
import org.eclipse.xtext.scoping.IScope
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.EcoreUtil2
import ac.soton.bsharp.bSharp.ClassDecl
import java.util.ArrayList
import ac.soton.bsharp.bSharp.Datatype
import ac.soton.bsharp.EcoreUtilJ
import org.eclipse.xtext.scoping.Scopes
import ac.soton.bsharp.bSharp.IPolyTypeProvider
import ac.soton.bsharp.bSharp.TopLevel

class BSharpDeclarativeScopProvider extends AbstractDeclarativeScopeProvider {
	def IScope scope_GenName(EObject context, EReference reference) {
		val parent = super.getScope(context, reference)
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
			 
			 var ArrayList<? extends EObject> elements
			 if (typeContainer instanceof Datatype) {
				elements = EcoreUtilJ.eFilterUpToIncludingWith(rootElement, [object | object == typeContainerFinal], 
					[object | object instanceof ClassDecl])
			} else {
				elements = EcoreUtilJ.eFilterUpToWith(rootElement, [object | object == typeContainerFinal], 
					[object | object instanceof ClassDecl])
			}
			
			return Scopes.scopeFor(elements, polyScope)
	}
	
	def IScope scope_ClassDecl(EObject context, EReference reference) {
		val parent = super.getScope(context, reference)
		
		/* Any Class Declaration above the current location can be referenced. */
		
		val rootObj = EcoreUtil2.getRootContainer(context)
		var typeNames = EcoreUtilJ.eFilterUpToIncludingWith(rootObj, [object | object == context], [object | object instanceof ClassDecl])
		return Scopes.scopeFor(typeNames, parent)
	}
	
	

	def IScope getPolyScopeFor(EObject context, IScope parent) {
		val polyProvider = EcoreUtilJ.eContainerMatchingLambda(context, [obj | obj instanceof IPolyTypeProvider]) as IPolyTypeProvider
		
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
}