/**
 * generated by Xtext 2.14.0
 */
package ac.soton.bsharp.bSharp;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extend</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ac.soton.bsharp.bSharp.Extend#getName <em>Name</em>}</li>
 *   <li>{@link ac.soton.bsharp.bSharp.Extend#getExtension <em>Extension</em>}</li>
 *   <li>{@link ac.soton.bsharp.bSharp.Extend#getBodyElements <em>Body Elements</em>}</li>
 * </ul>
 *
 * @see ac.soton.bsharp.bSharp.BSharpPackage#getExtend()
 * @model
 */
public interface Extend extends TopLevel {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' reference.
	 * @see #setName(TypeName)
	 * @see ac.soton.bsharp.bSharp.BSharpPackage#getExtend_Name()
	 * @model
	 * @generated
	 */
	TypeName getName();

	/**
	 * Sets the value of the '{@link ac.soton.bsharp.bSharp.Extend#getName <em>Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(TypeName value);

	/**
	 * Returns the value of the '<em><b>Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extension</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extension</em>' attribute.
	 * @see #setExtension(String)
	 * @see ac.soton.bsharp.bSharp.BSharpPackage#getExtend_Extension()
	 * @model
	 * @generated
	 */
	String getExtension();

	/**
	 * Sets the value of the '{@link ac.soton.bsharp.bSharp.Extend#getExtension <em>Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extension</em>' attribute.
	 * @see #getExtension()
	 * @generated
	 */
	void setExtension(String value);

	/**
	 * Returns the value of the '<em><b>Body Elements</b></em>' containment reference list.
	 * The list contents are of type {@link ac.soton.bsharp.bSharp.TypeBodyElements}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body Elements</em>' containment reference list.
	 * @see ac.soton.bsharp.bSharp.BSharpPackage#getExtend_BodyElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<TypeBodyElements> getBodyElements();

} // Extend
