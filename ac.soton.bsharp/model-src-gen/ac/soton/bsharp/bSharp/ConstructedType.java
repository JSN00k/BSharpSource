/**
 * generated by Xtext 2.14.0
 */
package ac.soton.bsharp.bSharp;

import java.util.ArrayList;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constructed Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ac.soton.bsharp.bSharp.ConstructedType#getConstructor <em>Constructor</em>}</li>
 *   <li>{@link ac.soton.bsharp.bSharp.ConstructedType#getLeft <em>Left</em>}</li>
 *   <li>{@link ac.soton.bsharp.bSharp.ConstructedType#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see ac.soton.bsharp.bSharp.BSharpPackage#getConstructedType()
 * @model
 * @generated
 */
public interface ConstructedType extends EObject {
	/**
	 * Returns the value of the '<em><b>Constructor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constructor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constructor</em>' attribute.
	 * @see #setConstructor(String)
	 * @see ac.soton.bsharp.bSharp.BSharpPackage#getConstructedType_Constructor()
	 * @model
	 * @generated
	 */
	String getConstructor();

	/**
	 * Sets the value of the '{@link ac.soton.bsharp.bSharp.ConstructedType#getConstructor <em>Constructor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constructor</em>' attribute.
	 * @see #getConstructor()
	 * @generated
	 */
	void setConstructor(String value);

	/**
	 * Returns the value of the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' containment reference.
	 * @see #setLeft(ConstructedType)
	 * @see ac.soton.bsharp.bSharp.BSharpPackage#getConstructedType_Left()
	 * @model containment="true"
	 * @generated
	 */
	ConstructedType getLeft();

	/**
	 * Sets the value of the '{@link ac.soton.bsharp.bSharp.ConstructedType#getLeft <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' containment reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(ConstructedType value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' containment reference.
	 * @see #setRight(ConstructedType)
	 * @see ac.soton.bsharp.bSharp.BSharpPackage#getConstructedType_Right()
	 * @model containment="true"
	 * @generated
	 */
	ConstructedType getRight();

	/**
	 * Sets the value of the '{@link ac.soton.bsharp.bSharp.ConstructedType#getRight <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' containment reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(ConstructedType value);
	
	/* Returns the number of polymorphic types used within the constructed type. */
	int inferredTypeCount();
	
	String buildEventBType(ArrayList<String> inferredTypes);

} // ConstructedType
