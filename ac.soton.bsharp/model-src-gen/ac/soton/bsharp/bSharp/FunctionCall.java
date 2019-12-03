/**
 * generated by Xtext 2.14.0
 */
package ac.soton.bsharp.bSharp;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ac.soton.bsharp.bSharp.FunctionCall#getOwnerType <em>Owner Type</em>}</li>
 *   <li>{@link ac.soton.bsharp.bSharp.FunctionCall#getClassVarDecl <em>Class Var Decl</em>}</li>
 *   <li>{@link ac.soton.bsharp.bSharp.FunctionCall#getContext <em>Context</em>}</li>
 *   <li>{@link ac.soton.bsharp.bSharp.FunctionCall#getWrapped <em>Wrapped</em>}</li>
 *   <li>{@link ac.soton.bsharp.bSharp.FunctionCall#getCompilationObject <em>Compilation Object</em>}</li>
 *   <li>{@link ac.soton.bsharp.bSharp.FunctionCall#getFuncCallArgs <em>Func Call Args</em>}</li>
 * </ul>
 *
 * @see ac.soton.bsharp.bSharp.BSharpPackage#getFunctionCall()
 * @model
 * @generated
 */
public interface FunctionCall extends Expression {

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
	 * @see ac.soton.bsharp.bSharp.BSharpPackage#getFunctionCall_OwnerType()
	 * @model
	 * @generated
	 */
	GenName getOwnerType();

	/**
	 * Sets the value of the '{@link ac.soton.bsharp.bSharp.FunctionCall#getOwnerType <em>Owner Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner Type</em>' reference.
	 * @see #getOwnerType()
	 * @generated
	 */
	void setOwnerType(GenName value);

	/**
	 * Returns the value of the '<em><b>Class Var Decl</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Var Decl</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Var Decl</em>' containment reference.
	 * @see #setClassVarDecl(ClassVarDecl)
	 * @see ac.soton.bsharp.bSharp.BSharpPackage#getFunctionCall_ClassVarDecl()
	 * @model containment="true"
	 * @generated
	 */
	ClassVarDecl getClassVarDecl();

	/**
	 * Sets the value of the '{@link ac.soton.bsharp.bSharp.FunctionCall#getClassVarDecl <em>Class Var Decl</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Var Decl</em>' containment reference.
	 * @see #getClassVarDecl()
	 * @generated
	 */
	void setClassVarDecl(ClassVarDecl value);

	/**
	 * Returns the value of the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' containment reference.
	 * @see #setContext(TypeDeclContext)
	 * @see ac.soton.bsharp.bSharp.BSharpPackage#getFunctionCall_Context()
	 * @model containment="true"
	 * @generated
	 */
	TypeDeclContext getContext();

	/**
	 * Sets the value of the '{@link ac.soton.bsharp.bSharp.FunctionCall#getContext <em>Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' containment reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(TypeDeclContext value);

	/**
	 * Returns the value of the '<em><b>Wrapped</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wrapped</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wrapped</em>' containment reference.
	 * @see #setWrapped(WrappedInfix)
	 * @see ac.soton.bsharp.bSharp.BSharpPackage#getFunctionCall_Wrapped()
	 * @model containment="true"
	 * @generated
	 */
	WrappedInfix getWrapped();

	/**
	 * Sets the value of the '{@link ac.soton.bsharp.bSharp.FunctionCall#getWrapped <em>Wrapped</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wrapped</em>' containment reference.
	 * @see #getWrapped()
	 * @generated
	 */
	void setWrapped(WrappedInfix value);

	/**
	 * Returns the value of the '<em><b>Compilation Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compilation Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compilation Object</em>' containment reference.
	 * @see #setCompilationObject(EObject)
	 * @see ac.soton.bsharp.bSharp.BSharpPackage#getFunctionCall_CompilationObject()
	 * @model containment="true"
	 * @generated
	 */
	EObject getCompilationObject();

	/**
	 * Sets the value of the '{@link ac.soton.bsharp.bSharp.FunctionCall#getCompilationObject <em>Compilation Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compilation Object</em>' containment reference.
	 * @see #getCompilationObject()
	 * @generated
	 */
	void setCompilationObject(EObject value);

	/**
	 * Returns the value of the '<em><b>Func Call Args</b></em>' containment reference list.
	 * The list contents are of type {@link ac.soton.bsharp.bSharp.FuncCallArgs}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Func Call Args</em>' containment reference list.
	 * @see ac.soton.bsharp.bSharp.BSharpPackage#getFunctionCall_FuncCallArgs()
	 * @model containment="true"
	 * @generated
	 */
	EList<FuncCallArgs> getFuncCallArgs();

	String compileToStringWithContextAndArguments(FunctionCall fc, Boolean asPredicate) throws Exception;
	
	
	public ExpressionVariable getTypeInstBasic();

} // FunctionCall
