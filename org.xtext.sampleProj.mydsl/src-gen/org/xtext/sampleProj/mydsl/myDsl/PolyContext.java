/**
 * generated by Xtext 2.13.0
 */
package org.xtext.sampleProj.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Poly Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.sampleProj.mydsl.myDsl.PolyContext#getPolyTypes <em>Poly Types</em>}</li>
 * </ul>
 *
 * @see org.xtext.sampleProj.mydsl.myDsl.MyDslPackage#getPolyContext()
 * @model
 * @generated
 */
public interface PolyContext extends EObject
{
  /**
   * Returns the value of the '<em><b>Poly Types</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.sampleProj.mydsl.myDsl.PolyContextTypes}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Poly Types</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Poly Types</em>' containment reference list.
   * @see org.xtext.sampleProj.mydsl.myDsl.MyDslPackage#getPolyContext_PolyTypes()
   * @model containment="true"
   * @generated
   */
  EList<PolyContextTypes> getPolyTypes();

} // PolyContext
