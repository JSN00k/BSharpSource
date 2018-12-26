/**
 * generated by Xtext 2.14.0
 */
package ac.soton.bsharp.bSharp;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Infix</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ac.soton.bsharp.bSharp.Infix#getLeft <em>Left</em>}</li>
 *   <li>{@link ac.soton.bsharp.bSharp.Infix#getFuncName <em>Func Name</em>}</li>
 *   <li>{@link ac.soton.bsharp.bSharp.Infix#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see ac.soton.bsharp.bSharp.BSharpPackage#getInfix()
 * @model
 * @generated
 */
public interface Infix extends Expression {
	/**
	 * Returns the value of the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' containment reference.
	 * @see #setLeft(Expression)
	 * @see ac.soton.bsharp.bSharp.BSharpPackage#getInfix_Left()
	 * @model containment="true"
	 * @generated
	 */
	Expression getLeft();

	/**
	 * Sets the value of the '{@link ac.soton.bsharp.bSharp.Infix#getLeft <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' containment reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(Expression value);

	/**
	 * Returns the value of the '<em><b>Func Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Func Name</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Func Name</em>' reference.
	 * @see #setFuncName(InfixFunc)
	 * @see ac.soton.bsharp.bSharp.BSharpPackage#getInfix_FuncName()
	 * @model
	 * @generated
	 */
	InfixFunc getFuncName();

	/**
	 * Sets the value of the '{@link ac.soton.bsharp.bSharp.Infix#getFuncName <em>Func Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Func Name</em>' reference.
	 * @see #getFuncName()
	 * @generated
	 */
	void setFuncName(InfixFunc value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' containment reference.
	 * @see #setRight(Expression)
	 * @see ac.soton.bsharp.bSharp.BSharpPackage#getInfix_Right()
	 * @model containment="true"
	 * @generated
	 */
	Expression getRight();

	/**
	 * Sets the value of the '{@link ac.soton.bsharp.bSharp.Infix#getRight <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' containment reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(Expression value);

} // Infix
