/**
 * generated by Xtext 2.14.0
 */
package ac.soton.bsharp.bSharp;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Theorem Body</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ac.soton.bsharp.bSharp.TheoremBody#getTheoremDecl <em>Theorem Decl</em>}</li>
 * </ul>
 *
 * @see ac.soton.bsharp.bSharp.BSharpPackage#getTheoremBody()
 * @model
 * @generated
 */
public interface TheoremBody extends EObject {
	/**
	 * Returns the value of the '<em><b>Theorem Decl</b></em>' containment reference list.
	 * The list contents are of type {@link ac.soton.bsharp.bSharp.TheoremDecl}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Theorem Decl</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Theorem Decl</em>' containment reference list.
	 * @see ac.soton.bsharp.bSharp.BSharpPackage#getTheoremBody_TheoremDecl()
	 * @model containment="true"
	 * @generated
	 */
	EList<TheoremDecl> getTheoremDecl();

} // TheoremBody