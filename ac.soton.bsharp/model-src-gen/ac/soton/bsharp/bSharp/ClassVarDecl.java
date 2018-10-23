/**
 * generated by Xtext 2.14.0
 */
package ac.soton.bsharp.bSharp;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Var Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ac.soton.bsharp.bSharp.ClassVarDecl#getOwnerType <em>Owner Type</em>}</li>
 *   <li>{@link ac.soton.bsharp.bSharp.ClassVarDecl#getTypeInst <em>Type Inst</em>}</li>
 * </ul>
 *
 * @see ac.soton.bsharp.bSharp.BSharpPackage#getClassVarDecl()
 * @model
 * @generated
 */
public interface ClassVarDecl extends EObject {
	/**
	 * Returns the value of the '<em><b>Owner Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner Type</em>' reference.
	 * @see #setOwnerType(GenName)
	 * @see ac.soton.bsharp.bSharp.BSharpPackage#getClassVarDecl_OwnerType()
	 * @model
	 * @generated
	 */
	GenName getOwnerType();

	/**
	 * Sets the value of the '{@link ac.soton.bsharp.bSharp.ClassVarDecl#getOwnerType <em>Owner Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner Type</em>' reference.
	 * @see #getOwnerType()
	 * @generated
	 */
	void setOwnerType(GenName value);

	/**
	 * Returns the value of the '<em><b>Type Inst</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Inst</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Inst</em>' reference.
	 * @see #setTypeInst(ExpressionVariable)
	 * @see ac.soton.bsharp.bSharp.BSharpPackage#getClassVarDecl_TypeInst()
	 * @model
	 * @generated
	 */
	ExpressionVariable getTypeInst();

	/**
	 * Sets the value of the '{@link ac.soton.bsharp.bSharp.ClassVarDecl#getTypeInst <em>Type Inst</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Inst</em>' reference.
	 * @see #getTypeInst()
	 * @generated
	 */
	void setTypeInst(ExpressionVariable value);

} // ClassVarDecl