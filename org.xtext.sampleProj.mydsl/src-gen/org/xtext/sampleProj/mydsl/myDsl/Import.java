/**
 * generated by Xtext 2.13.0
 */
package org.xtext.sampleProj.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Import</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.sampleProj.mydsl.myDsl.Import#getImportName <em>Import Name</em>}</li>
 * </ul>
 *
 * @see org.xtext.sampleProj.mydsl.myDsl.MyDslPackage#getImport()
 * @model
 * @generated
 */
public interface Import extends EObject
{
  /**
   * Returns the value of the '<em><b>Import Name</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.sampleProj.mydsl.myDsl.ImportComponent}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Import Name</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Import Name</em>' containment reference list.
   * @see org.xtext.sampleProj.mydsl.myDsl.MyDslPackage#getImport_ImportName()
   * @model containment="true"
   * @generated
   */
  EList<ImportComponent> getImportName();

} // Import
