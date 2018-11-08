/**
 * generated by Xtext 2.14.0
 */
package ac.soton.bsharp.bSharp;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Builder</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see ac.soton.bsharp.bSharp.BSharpPackage#getTypeBuilder()
 * @model abstract="true"
 * @generated
 */
public interface TypeBuilder extends EObject {
	/* Returns the number of polymorphic types used within the constructed type. */
	Integer inferredTypeCount();
	
	String buildEventBType();

	/* If the Constructed type wraps a type class without a polymorphic context, this returns true. */
	boolean isAbstractTypeClass();

	/* This method will return null if the Constructed type is not wrapping a type class. */
	BSClass getTypeClass();
	boolean isBoolType();
	
} // TypeBuilder
