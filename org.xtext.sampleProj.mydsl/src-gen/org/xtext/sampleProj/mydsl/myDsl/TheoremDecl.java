/**
 * generated by Xtext 2.13.0
 */
package org.xtext.sampleProj.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Theorem Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.sampleProj.mydsl.myDsl.TheoremDecl#getThmName <em>Thm Name</em>}</li>
 * </ul>
 *
 * @see org.xtext.sampleProj.mydsl.myDsl.MyDslPackage#getTheoremDecl()
 * @model
 * @generated
 */
public interface TheoremDecl extends EObject
{
  /**
   * Returns the value of the '<em><b>Thm Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Thm Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Thm Name</em>' attribute.
   * @see #setThmName(String)
   * @see org.xtext.sampleProj.mydsl.myDsl.MyDslPackage#getTheoremDecl_ThmName()
   * @model
   * @generated
   */
  String getThmName();

  /**
   * Sets the value of the '{@link org.xtext.sampleProj.mydsl.myDsl.TheoremDecl#getThmName <em>Thm Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Thm Name</em>' attribute.
   * @see #getThmName()
   * @generated
   */
  void setThmName(String value);

} // TheoremDecl