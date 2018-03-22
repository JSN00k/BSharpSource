/*
 * generated by Xtext 2.12.0
 */
package org.xtext.sampleProj.mydsl.scoping
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.scoping.Scopes
import org.xtext.sampleProj.mydsl.myDsl.PolymorphicTypeName
import org.eclipse.xtext.EcoreUtil2
import org.xtext.sampleProj.mydsl.myDsl.ClassDecl

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
class MyDslScopeProvider extends AbstractMyDslScopeProvider {
	override getScope (EObject context, EReference reference) {
		if (reference instanceof PolymorphicTypeName) {
			/* Get scope for the class, and use it to cech for polymorphic variable. Care needs to 
			 * be taken here  as this is not complete, and will need to be added to when declaring 
			 * functions and methods. */
			val classAncestor = EcoreUtil2.getContainerOfType(context, ClassDecl) as ClassDecl
			if (classAncestor !== null) {
				var polyTypes = EcoreUtil2.getAllContentsOfType(classAncestor, PolymorphicTypeName)
				return Scopes.scopeFor(polyTypes)
			} 
		}
		
		return super.getScope(context, reference)
	}
}
