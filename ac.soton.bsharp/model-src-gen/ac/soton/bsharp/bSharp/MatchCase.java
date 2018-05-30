/**
 * generated by Xtext 2.14.0
 */
package ac.soton.bsharp.bSharp;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Match Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ac.soton.bsharp.bSharp.MatchCase#getDeconName <em>Decon Name</em>}</li>
 *   <li>{@link ac.soton.bsharp.bSharp.MatchCase#getVariables <em>Variables</em>}</li>
 *   <li>{@link ac.soton.bsharp.bSharp.MatchCase#getExpr <em>Expr</em>}</li>
 * </ul>
 *
 * @see ac.soton.bsharp.bSharp.BSharpPackage#getMatchCase()
 * @model
 * @generated
 */
public interface MatchCase extends EObject {
	/**
	 * Returns the value of the '<em><b>Decon Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decon Name</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decon Name</em>' reference.
	 * @see #setDeconName(TypedVariable)
	 * @see ac.soton.bsharp.bSharp.BSharpPackage#getMatchCase_DeconName()
	 * @model
	 * @generated
	 */
	TypedVariable getDeconName();

	/**
	 * Sets the value of the '{@link ac.soton.bsharp.bSharp.MatchCase#getDeconName <em>Decon Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decon Name</em>' reference.
	 * @see #getDeconName()
	 * @generated
	 */
	void setDeconName(TypedVariable value);

	/**
	 * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
	 * The list contents are of type {@link ac.soton.bsharp.bSharp.TypedVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variables</em>' containment reference list.
	 * @see ac.soton.bsharp.bSharp.BSharpPackage#getMatchCase_Variables()
	 * @model containment="true"
	 * @generated
	 */
	EList<TypedVariable> getVariables();

	/**
	 * Returns the value of the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expr</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expr</em>' containment reference.
	 * @see #setExpr(Expression)
	 * @see ac.soton.bsharp.bSharp.BSharpPackage#getMatchCase_Expr()
	 * @model containment="true"
	 * @generated
	 */
	Expression getExpr();

	/**
	 * Sets the value of the '{@link ac.soton.bsharp.bSharp.MatchCase#getExpr <em>Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expr</em>' containment reference.
	 * @see #getExpr()
	 * @generated
	 */
	void setExpr(Expression value);

} // MatchCase
