/**
 * generated by Xtext 2.14.0
 */
package ac.soton.bsharp.bSharp;

import org.eclipse.emf.ecore.EObject;

import ac.soton.bsharp.bSharp.impl.TypedVariableImpl;
import ac.soton.bsharp.typeInstanceRepresentation.ITypeInstance;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Theorem Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ac.soton.bsharp.bSharp.TheoremDecl#getName <em>Name</em>}</li>
 *   <li>{@link ac.soton.bsharp.bSharp.TheoremDecl#getExpr <em>Expr</em>}</li>
 *   <li>{@link ac.soton.bsharp.bSharp.TheoremDecl#getGeneratedQuants <em>Generated Quants</em>}</li>
 * </ul>
 *
 * @see ac.soton.bsharp.bSharp.BSharpPackage#getTheoremDecl()
 * @model
 * @generated
 */
public interface TheoremDecl extends IExpressionContainer {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ac.soton.bsharp.bSharp.BSharpPackage#getTheoremDecl_Name()
	 * @model id="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ac.soton.bsharp.bSharp.TheoremDecl#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see ac.soton.bsharp.bSharp.BSharpPackage#getTheoremDecl_Expr()
	 * @model containment="true"
	 * @generated
	 */
	Expression getExpr();

	/**
	 * Sets the value of the '{@link ac.soton.bsharp.bSharp.TheoremDecl#getExpr <em>Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expr</em>' containment reference.
	 * @see #getExpr()
	 * @generated
	 */
	void setExpr(Expression value);

	/**
	 * Returns the value of the '<em><b>Generated Quants</b></em>' containment reference list.
	 * The list contents are of type {@link ac.soton.bsharp.bSharp.QuantLambda}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generated Quants</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Quants</em>' containment reference list.
	 * @see ac.soton.bsharp.bSharp.BSharpPackage#getTheoremDecl_GeneratedQuants()
	 * @model containment="true"
	 * @generated
	 */
	EList<QuantLambda> getGeneratedQuants();

	void compile();

	String baseTypeForBSClass(BSClass typeName);

	String getNameExpressionForVariable(TypedVariable typedVariableImpl);

	void compileWithTypeInstancesForInferredType(ITypeInstance typeInstance);

	void compileWithTypeInstancesForInferredType(ITypeInstance typeInstance, String theoremPrefix);
} // TheoremDecl
