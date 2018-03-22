/**
 * generated by Xtext 2.13.0
 */
package org.xtext.sampleProj.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Import Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.sampleProj.mydsl.myDsl.ImportStatement#getImports <em>Imports</em>}</li>
 * </ul>
 *
 * @see org.xtext.sampleProj.mydsl.myDsl.MyDslPackage#getImportStatement()
 * @model
 * @generated
 */
public interface ImportStatement extends TopLevel
{
  /**
   * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.sampleProj.mydsl.myDsl.Import}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports</em>' containment reference list.
   * @see org.xtext.sampleProj.mydsl.myDsl.MyDslPackage#getImportStatement_Imports()
   * @model containment="true"
   * @generated
   */
  EList<Import> getImports();

} // ImportStatement