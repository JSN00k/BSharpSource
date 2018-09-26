/**
 * generated by Xtext 2.14.0
 */
package ac.soton.bsharp.bSharp;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ac.soton.bsharp.bSharp.Expression#getTypeInst <em>Type Inst</em>}</li>
 * </ul>
 *
 * @see ac.soton.bsharp.bSharp.BSharpPackage#getExpression()
 * @model
 */
public interface Expression extends EObject {

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
	 * @see ac.soton.bsharp.bSharp.BSharpPackage#getExpression_TypeInst()
	 * @model
	 * @generated
	 */
	ExpressionVariable getTypeInst();

	/**
	 * Sets the value of the '{@link ac.soton.bsharp.bSharp.Expression#getTypeInst <em>Type Inst</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Inst</em>' reference.
	 * @see #getTypeInst()
	 * @generated
	 */
	void setTypeInst(ExpressionVariable value);

	/**
	 * Returns a latex \Tree expression that represents the expression tree.
	 * @return Returns a latex \Tree expression that represents the expression tree.
	 */
	String constructLatexExpressionTree(String indent);

} // Expression