/**
 * generated by Xtext 2.14.0
 */
package ac.soton.bsharp.bSharp;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Typing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ac.soton.bsharp.bSharp.VariableTyping#getTypeVar <em>Type Var</em>}</li>
 *   <li>{@link ac.soton.bsharp.bSharp.VariableTyping#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see ac.soton.bsharp.bSharp.BSharpPackage#getVariableTyping()
 * @model
 * @generated
 */
public interface VariableTyping extends EObject {
	/**
	 * Returns the value of the '<em><b>Type Var</b></em>' containment reference list.
	 * The list contents are of type {@link ac.soton.bsharp.bSharp.TypedVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Var</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Var</em>' containment reference list.
	 * @see ac.soton.bsharp.bSharp.BSharpPackage#getVariableTyping_TypeVar()
	 * @model containment="true"
	 * @generated
	 */
	EList<TypedVariable> getTypeVar();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(ConstructedType)
	 * @see ac.soton.bsharp.bSharp.BSharpPackage#getVariableTyping_Type()
	 * @model containment="true"
	 * @generated
	 */
	ConstructedType getType();

	/**
	 * Sets the value of the '{@link ac.soton.bsharp.bSharp.VariableTyping#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(ConstructedType value);

} // VariableTyping
