/**
 * generated by Xtext 2.13.0
 */
package org.xtext.sampleProj.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Constructor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.sampleProj.mydsl.myDsl.TypeConstructor#getTypeName <em>Type Name</em>}</li>
 *   <li>{@link org.xtext.sampleProj.mydsl.myDsl.TypeConstructor#getContext <em>Context</em>}</li>
 * </ul>
 *
 * @see org.xtext.sampleProj.mydsl.myDsl.MyDslPackage#getTypeConstructor()
 * @model
 * @generated
 */
public interface TypeConstructor extends EObject
{
  /**
   * Returns the value of the '<em><b>Type Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type Name</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type Name</em>' reference.
   * @see #setTypeName(Name)
   * @see org.xtext.sampleProj.mydsl.myDsl.MyDslPackage#getTypeConstructor_TypeName()
   * @model
   * @generated
   */
  Name getTypeName();

  /**
   * Sets the value of the '{@link org.xtext.sampleProj.mydsl.myDsl.TypeConstructor#getTypeName <em>Type Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type Name</em>' reference.
   * @see #getTypeName()
   * @generated
   */
  void setTypeName(Name value);

  /**
   * Returns the value of the '<em><b>Context</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.sampleProj.mydsl.myDsl.TypeDeclContext}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Context</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Context</em>' containment reference list.
   * @see org.xtext.sampleProj.mydsl.myDsl.MyDslPackage#getTypeConstructor_Context()
   * @model containment="true"
   * @generated
   */
  EList<TypeDeclContext> getContext();

} // TypeConstructor
