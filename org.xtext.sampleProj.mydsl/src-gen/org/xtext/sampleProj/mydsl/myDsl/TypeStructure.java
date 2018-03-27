/**
 * generated by Xtext 2.13.0
 */
package org.xtext.sampleProj.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.sampleProj.mydsl.myDsl.TypeStructure#getVariables <em>Variables</em>}</li>
 * </ul>
 *
 * @see org.xtext.sampleProj.mydsl.myDsl.MyDslPackage#getTypeStructure()
 * @model
 * @generated
 */
public interface TypeStructure extends EObject
{
  /**
   * Returns the value of the '<em><b>Variables</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variables</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variables</em>' containment reference.
   * @see #setVariables(TypedVariableList)
   * @see org.xtext.sampleProj.mydsl.myDsl.MyDslPackage#getTypeStructure_Variables()
   * @model containment="true"
   * @generated
   */
  TypedVariableList getVariables();

  /**
   * Sets the value of the '{@link org.xtext.sampleProj.mydsl.myDsl.TypeStructure#getVariables <em>Variables</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variables</em>' containment reference.
   * @see #getVariables()
   * @generated
   */
  void setVariables(TypedVariableList value);

} // TypeStructure