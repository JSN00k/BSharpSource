/**
 * generated by Xtext 2.14.0
 */
package ac.soton.bsharp.bSharp;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extend</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ac.soton.bsharp.bSharp.Extend#getName <em>Name</em>}</li>
 *   <li>{@link ac.soton.bsharp.bSharp.Extend#getExtension <em>Extension</em>}</li>
 *   <li>{@link ac.soton.bsharp.bSharp.Extend#getBodyElements <em>Body Elements</em>}</li>
 * </ul>
 *
 * @see ac.soton.bsharp.bSharp.BSharpPackage#getExtend()
 * @model
 */
public interface Extend extends TopLevelInstance, IVariableProvider, IPolyTypeProvider, IEventBPrefixProvider {
	/**
	 * Returns the value of the '<em><b>Extended Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extended Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extended Class</em>' reference.
	 * @see #setExtendedClass(ClassDecl)
	 * @see ac.soton.bsharp.bSharp.BSharpPackage#getExtend_ExtendedClass()
	 * @model
	 * @generated
	 */
	ClassDecl getExtendedClass();

	/**
	 * Sets the value of the '{@link ac.soton.bsharp.bSharp.Extend#getExtendedClass <em>Extended Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extended Class</em>' reference.
	 * @see #getExtendedClass()
	 * @generated
	 */
	void setExtendedClass(ClassDecl value);

	/**
	 * Returns the value of the '<em><b>Extended Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extended Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extended Class Name</em>' attribute.
	 * @see #setExtendedClassName(String)
	 * @see ac.soton.bsharp.bSharp.BSharpPackage#getExtend_ExtendedClassName()
	 * @model
	 * @generated
	 */
	String getExtendedClassName();

	/**
	 * Sets the value of the '{@link ac.soton.bsharp.bSharp.Extend#getExtendedClassName <em>Extended Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extended Class Name</em>' attribute.
	 * @see #getExtendedClassName()
	 * @generated
	 */
	void setExtendedClassName(String value);

} // Extend
