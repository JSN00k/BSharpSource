/**
 * generated by Xtext 2.14.0
 */
package ac.soton.bsharp.bSharp;

import java.util.ArrayList;

import org.eclipse.emf.common.util.EList;
import org.rodinp.core.IInternalElement;

import ac.soton.bsharp.typeInstanceRepresentation.ITypeInstance;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ac.soton.bsharp.bSharp.FunctionDecl#getContext <em>Context</em>}</li>
 *   <li>{@link ac.soton.bsharp.bSharp.FunctionDecl#getVarList <em>Var List</em>}</li>
 *   <li>{@link ac.soton.bsharp.bSharp.FunctionDecl#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link ac.soton.bsharp.bSharp.FunctionDecl#getInfix <em>Infix</em>}</li>
 *   <li>{@link ac.soton.bsharp.bSharp.FunctionDecl#getPrecedence <em>Precedence</em>}</li>
 *   <li>{@link ac.soton.bsharp.bSharp.FunctionDecl#getExpr <em>Expr</em>}</li>
 *   <li>{@link ac.soton.bsharp.bSharp.FunctionDecl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see ac.soton.bsharp.bSharp.BSharpPackage#getFunctionDecl()
 * @model
 */
public interface FunctionDecl extends IVariableProvider, IPolyTypeProvider, IExpressionContainer, InfixFunc {
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
	 * @see ac.soton.bsharp.bSharp.BSharpPackage#getFunctionDecl_Context()
	 * @model containment="true"
	 * @generated
	 */
	PolyContext getContext();

	/**
	 * Sets the value of the '{@link ac.soton.bsharp.bSharp.FunctionDecl#getContext <em>Context</em>}' containment reference.
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
	 * @see ac.soton.bsharp.bSharp.BSharpPackage#getFunctionDecl_VarList()
	 * @model containment="true"
	 * @generated
	 */
	TypedVariableList getVarList();

	/**
	 * Sets the value of the '{@link ac.soton.bsharp.bSharp.FunctionDecl#getVarList <em>Var List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Var List</em>' containment reference.
	 * @see #getVarList()
	 * @generated
	 */
	void setVarList(TypedVariableList value);

	/**
	 * Returns the value of the '<em><b>Return Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Type</em>' containment reference.
	 * @see #setReturnType(TypeConstructor)
	 * @see ac.soton.bsharp.bSharp.BSharpPackage#getFunctionDecl_ReturnType()
	 * @model containment="true"
	 * @generated
	 */
	TypeConstructor getReturnType();

	/**
	 * Sets the value of the '{@link ac.soton.bsharp.bSharp.FunctionDecl#getReturnType <em>Return Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Type</em>' containment reference.
	 * @see #getReturnType()
	 * @generated
	 */
	void setReturnType(TypeConstructor value);

	/**
	 * Returns the value of the '<em><b>Infix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Infix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Infix</em>' attribute.
	 * @see #setInfix(String)
	 * @see ac.soton.bsharp.bSharp.BSharpPackage#getFunctionDecl_Infix()
	 * @model
	 * @generated
	 */
	String getInfix();

	/**
	 * Sets the value of the '{@link ac.soton.bsharp.bSharp.FunctionDecl#getInfix <em>Infix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Infix</em>' attribute.
	 * @see #getInfix()
	 * @generated
	 */
	void setInfix(String value);

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
	 * @see ac.soton.bsharp.bSharp.BSharpPackage#getFunctionDecl_Expr()
	 * @model containment="true"
	 * @generated
	 */
	Expression getExpr();

	/**
	 * Sets the value of the '{@link ac.soton.bsharp.bSharp.FunctionDecl#getExpr <em>Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expr</em>' containment reference.
	 * @see #getExpr()
	 * @generated
	 */
	void setExpr(Expression value);

	/**
	 * Returns the value of the '<em><b>Generated Lambdas</b></em>' containment reference list.
	 * The list contents are of type {@link ac.soton.bsharp.bSharp.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generated Lambdas</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Lambdas</em>' containment reference list.
	 * @see ac.soton.bsharp.bSharp.BSharpPackage#getFunctionDecl_GeneratedLambdas()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getGeneratedLambdas();

	/**
	 * Returns the value of the '<em><b>Typing Theorem</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Typing Theorem</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Typing Theorem</em>' containment reference.
	 * @see #setTypingTheorem(TheoremDecl)
	 * @see ac.soton.bsharp.bSharp.BSharpPackage#getFunctionDecl_TypingTheorem()
	 * @model containment="true"
	 * @generated
	 */
	TheoremDecl getTypingTheorem();

	/**
	 * Sets the value of the '{@link ac.soton.bsharp.bSharp.FunctionDecl#getTypingTheorem <em>Typing Theorem</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Typing Theorem</em>' containment reference.
	 * @see #getTypingTheorem()
	 * @generated
	 */
	void setTypingTheorem(TheoremDecl value);

	String callWithTypeContext(TypeDeclContext context);

	String eventBPredName()  throws Exception;

	boolean hasEventBInfix() throws Exception;

	String eventBExprName();

	void compile();

	boolean isMethod();

	IInternalElement getCurrentCompilingOp();

	boolean hasInferredContext();

	void compileWithTypeInstancesForInferredType(ITypeInstance typeInstance, String thmPrefix);

} // FunctionDecl
