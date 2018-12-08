/**
 * generated by Xtext 2.14.0
 */
package ac.soton.bsharp.bSharp;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ac.soton.bsharp.bSharp.Instance#getClassName <em>Class Name</em>}</li>
 *   <li>{@link ac.soton.bsharp.bSharp.Instance#getContext <em>Context</em>}</li>
 *   <li>{@link ac.soton.bsharp.bSharp.Instance#getArguments <em>Arguments</em>}</li>
 *   <li>{@link ac.soton.bsharp.bSharp.Instance#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see ac.soton.bsharp.bSharp.BSharpPackage#getInstance()
 * @model
 * @generated
 */
public interface Instance extends EObject {
	/**
	 * Returns the value of the '<em><b>Class Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Name</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Name</em>' reference.
	 * @see #setClassName(ClassDecl)
	 * @see ac.soton.bsharp.bSharp.BSharpPackage#getInstance_ClassName()
	 * @model
	 * @generated
	 */
	ClassDecl getClassName();

	/**
	 * Sets the value of the '{@link ac.soton.bsharp.bSharp.Instance#getClassName <em>Class Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Name</em>' reference.
	 * @see #getClassName()
	 * @generated
	 */
	void setClassName(ClassDecl value);

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
	 * @see ac.soton.bsharp.bSharp.BSharpPackage#getInstance_Context()
	 * @model containment="true"
	 * @generated
	 */
	TypeDeclContext getContext();

	/**
	 * Sets the value of the '{@link ac.soton.bsharp.bSharp.Instance#getContext <em>Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' containment reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(TypeDeclContext value);

	/**
	 * Returns the value of the '<em><b>Arguments</b></em>' containment reference list.
	 * The list contents are of type {@link ac.soton.bsharp.bSharp.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arguments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arguments</em>' containment reference list.
	 * @see ac.soton.bsharp.bSharp.BSharpPackage#getInstance_Arguments()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getArguments();

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
	 * @see ac.soton.bsharp.bSharp.BSharpPackage#getInstance_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ac.soton.bsharp.bSharp.Instance#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Instance
