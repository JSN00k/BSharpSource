/**
 * generated by Xtext 2.14.0
 */
package ac.soton.bsharp.bSharp;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ac.soton.bsharp.bSharp.ClassDecl#getTypeName <em>Type Name</em>}</li>
 *   <li>{@link ac.soton.bsharp.bSharp.ClassDecl#getContext <em>Context</em>}</li>
 *   <li>{@link ac.soton.bsharp.bSharp.ClassDecl#getBodyElements <em>Body Elements</em>}</li>
 * </ul>
 *
 * @see ac.soton.bsharp.bSharp.BSharpPackage#getClassDecl()
 * @model
 * @generated
 */
public interface ClassDecl extends TopLevel {
	/**
	 * Returns the value of the '<em><b>Type Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Name</em>' containment reference.
	 * @see #setTypeName(TypeName)
	 * @see ac.soton.bsharp.bSharp.BSharpPackage#getClassDecl_TypeName()
	 * @model containment="true"
	 * @generated
	 */
	TypeName getTypeName();

	/**
	 * Sets the value of the '{@link ac.soton.bsharp.bSharp.ClassDecl#getTypeName <em>Type Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Name</em>' containment reference.
	 * @see #getTypeName()
	 * @generated
	 */
	void setTypeName(TypeName value);

	/**
	 * Returns the value of the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' containment reference.
	 * @see #setContext(PolyContext)
	 * @see ac.soton.bsharp.bSharp.BSharpPackage#getClassDecl_Context()
	 * @model containment="true"
	 * @generated
	 */
	PolyContext getContext();

	/**
	 * Sets the value of the '{@link ac.soton.bsharp.bSharp.ClassDecl#getContext <em>Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' containment reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(PolyContext value);

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
	 * @see ac.soton.bsharp.bSharp.BSharpPackage#getClassDecl_BodyElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<TypeBodyElements> getBodyElements();

} // ClassDecl
