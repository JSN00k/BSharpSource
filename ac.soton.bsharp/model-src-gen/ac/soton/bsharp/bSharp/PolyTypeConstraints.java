/**
 * generated by Xtext 2.14.0
 */
package ac.soton.bsharp.bSharp;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Poly Type Constraints</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ac.soton.bsharp.bSharp.PolyTypeConstraints#getTypeName <em>Type Name</em>}</li>
 * </ul>
 *
 * @see ac.soton.bsharp.bSharp.BSharpPackage#getPolyTypeConstraints()
 * @model
 * @generated
 */
public interface PolyTypeConstraints extends EObject {
	/**
	 * Returns the value of the '<em><b>Type Name</b></em>' reference list.
	 * The list contents are of type {@link ac.soton.bsharp.bSharp.ClassDecl}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Name</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Name</em>' reference list.
	 * @see ac.soton.bsharp.bSharp.BSharpPackage#getPolyTypeConstraints_TypeName()
	 * @model
	 * @generated
	 */
	EList<ClassDecl> getTypeName();

} // PolyTypeConstraints
