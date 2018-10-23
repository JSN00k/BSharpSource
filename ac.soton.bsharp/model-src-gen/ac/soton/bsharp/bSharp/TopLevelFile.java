/**
 * generated by Xtext 2.14.0
 */
package ac.soton.bsharp.bSharp;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Top Level File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ac.soton.bsharp.bSharp.TopLevelFile#getName <em>Name</em>}</li>
 *   <li>{@link ac.soton.bsharp.bSharp.TopLevelFile#getTopLevelImports <em>Top Level Imports</em>}</li>
 *   <li>{@link ac.soton.bsharp.bSharp.TopLevelFile#getNoImportElements <em>No Import Elements</em>}</li>
 * </ul>
 *
 * @see ac.soton.bsharp.bSharp.BSharpPackage#getTopLevelFile()
 * @model
 * @generated
 */
public interface TopLevelFile extends EObject {
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
	 * @see ac.soton.bsharp.bSharp.BSharpPackage#getTopLevelFile_Name()
	 * @model id="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ac.soton.bsharp.bSharp.TopLevelFile#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Top Level Imports</b></em>' containment reference list.
	 * The list contents are of type {@link ac.soton.bsharp.bSharp.TopLevelImport}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Top Level Imports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Top Level Imports</em>' containment reference list.
	 * @see ac.soton.bsharp.bSharp.BSharpPackage#getTopLevelFile_TopLevelImports()
	 * @model containment="true"
	 * @generated
	 */
	EList<TopLevelImport> getTopLevelImports();

	/**
	 * Returns the value of the '<em><b>No Import Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>No Import Elements</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>No Import Elements</em>' containment reference.
	 * @see #setNoImportElements(BodyElements)
	 * @see ac.soton.bsharp.bSharp.BSharpPackage#getTopLevelFile_NoImportElements()
	 * @model containment="true"
	 * @generated
	 */
	BodyElements getNoImportElements();

	/**
	 * Sets the value of the '{@link ac.soton.bsharp.bSharp.TopLevelFile#getNoImportElements <em>No Import Elements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>No Import Elements</em>' containment reference.
	 * @see #getNoImportElements()
	 * @generated
	 */
	void setNoImportElements(BodyElements value);

} // TopLevelFile