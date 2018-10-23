/**
 * generated by Xtext 2.14.0
 */
package ac.soton.bsharp.bSharp;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Global Import</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ac.soton.bsharp.bSharp.GlobalImport#getFileImports <em>File Imports</em>}</li>
 *   <li>{@link ac.soton.bsharp.bSharp.GlobalImport#getProject <em>Project</em>}</li>
 * </ul>
 *
 * @see ac.soton.bsharp.bSharp.BSharpPackage#getGlobalImport()
 * @model
 * @generated
 */
public interface GlobalImport extends EObject {
	/**
	 * Returns the value of the '<em><b>File Imports</b></em>' containment reference list.
	 * The list contents are of type {@link ac.soton.bsharp.bSharp.FileImport}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File Imports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Imports</em>' containment reference list.
	 * @see ac.soton.bsharp.bSharp.BSharpPackage#getGlobalImport_FileImports()
	 * @model containment="true"
	 * @generated
	 */
	EList<FileImport> getFileImports();

	/**
	 * Returns the value of the '<em><b>Project</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Project</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project</em>' attribute.
	 * @see #setProject(String)
	 * @see ac.soton.bsharp.bSharp.BSharpPackage#getGlobalImport_Project()
	 * @model
	 * @generated
	 */
	String getProject();

	/**
	 * Sets the value of the '{@link ac.soton.bsharp.bSharp.GlobalImport#getProject <em>Project</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project</em>' attribute.
	 * @see #getProject()
	 * @generated
	 */
	void setProject(String value);

} // GlobalImport