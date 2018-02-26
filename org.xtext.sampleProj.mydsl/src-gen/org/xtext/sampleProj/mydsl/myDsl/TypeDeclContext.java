/**
 * generated by Xtext 2.12.0
 */
package org.xtext.sampleProj.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Decl Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.sampleProj.mydsl.myDsl.TypeDeclContext#getTypeName <em>Type Name</em>}</li>
 * </ul>
 *
 * @see org.xtext.sampleProj.mydsl.myDsl.MyDslPackage#getTypeDeclContext()
 * @model
 * @generated
 */
public interface TypeDeclContext extends EObject
{
  /**
   * Returns the value of the '<em><b>Type Name</b></em>' reference list.
   * The list contents are of type {@link org.xtext.sampleProj.mydsl.myDsl.TypeName}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type Name</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type Name</em>' reference list.
   * @see org.xtext.sampleProj.mydsl.myDsl.MyDslPackage#getTypeDeclContext_TypeName()
   * @model
   * @generated
   */
  EList<TypeName> getTypeName();

} // TypeDeclContext
