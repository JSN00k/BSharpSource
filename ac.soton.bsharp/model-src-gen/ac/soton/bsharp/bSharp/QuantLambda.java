/**
 * generated by Xtext 2.14.0
 */
package ac.soton.bsharp.bSharp;

import ac.soton.bsharp.bSharp.impl.QuantLambdaImpl.QuantLambdaType;
import ac.soton.bsharp.typeInstanceRepresentation.ITypeInstance;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quant Lambda</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ac.soton.bsharp.bSharp.QuantLambda#getQType <em>QType</em>}</li>
 *   <li>{@link ac.soton.bsharp.bSharp.QuantLambda#getContext <em>Context</em>}</li>
 *   <li>{@link ac.soton.bsharp.bSharp.QuantLambda#getVarList <em>Var List</em>}</li>
 *   <li>{@link ac.soton.bsharp.bSharp.QuantLambda#getExpr <em>Expr</em>}</li>
 * </ul>
 *
 * @see ac.soton.bsharp.bSharp.BSharpPackage#getQuantLambda()
 * @model
 */
public interface QuantLambda extends Expression, IVariableProvider, IPolyTypeProvider {
	/**
	 * Returns the value of the '<em><b>QType</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>QType</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>QType</em>' attribute.
	 * @see #setQType(String)
	 * @see ac.soton.bsharp.bSharp.BSharpPackage#getQuantLambda_QType()
	 * @model
	 * @generated
	 */
	String getQType();

	/**
	 * Sets the value of the '{@link ac.soton.bsharp.bSharp.QuantLambda#getQType <em>QType</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>QType</em>' attribute.
	 * @see #getQType()
	 * @generated
	 */
	void setQType(String value);

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
	 * @see ac.soton.bsharp.bSharp.BSharpPackage#getQuantLambda_Context()
	 * @model containment="true"
	 * @generated
	 */
	PolyContext getContext();

	/**
	 * Sets the value of the '{@link ac.soton.bsharp.bSharp.QuantLambda#getContext <em>Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' containment reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(PolyContext value);

	/**
	 * Returns the value of the '<em><b>Var List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Var List</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var List</em>' containment reference.
	 * @see #setVarList(TypedVariableList)
	 * @see ac.soton.bsharp.bSharp.BSharpPackage#getQuantLambda_VarList()
	 * @model containment="true"
	 * @generated
	 */
	TypedVariableList getVarList();

	/**
	 * Sets the value of the '{@link ac.soton.bsharp.bSharp.QuantLambda#getVarList <em>Var List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Var List</em>' containment reference.
	 * @see #getVarList()
	 * @generated
	 */
	void setVarList(TypedVariableList value);

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
	 * @see ac.soton.bsharp.bSharp.BSharpPackage#getQuantLambda_Expr()
	 * @model containment="true"
	 * @generated
	 */
	Expression getExpr();

	/**
	 * Sets the value of the '{@link ac.soton.bsharp.bSharp.QuantLambda#getExpr <em>Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expr</em>' containment reference.
	 * @see #getExpr()
	 * @generated
	 */
	void setExpr(Expression value);

	String baseTypeForBSClass(BSClass typeName);

	String getNameExpressionForVariable(TypedVariable typedVariable);

	ITypeInstance getClassTypeInst();

	QuantLambdaType quantLambdaType();

	void setQuantLambdaType(QuantLambdaType type);

	String compileToEventBStringWithInferredTypeArgs(Boolean asPredicate, Boolean addTypeInstArgs) throws Exception;

} // QuantLambda
