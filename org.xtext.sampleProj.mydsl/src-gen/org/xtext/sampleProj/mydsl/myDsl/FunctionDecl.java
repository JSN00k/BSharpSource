/**
 * generated by Xtext 2.13.0
 */
package org.xtext.sampleProj.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.sampleProj.mydsl.myDsl.FunctionDecl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.sampleProj.mydsl.myDsl.FunctionDecl#getContext <em>Context</em>}</li>
 *   <li>{@link org.xtext.sampleProj.mydsl.myDsl.FunctionDecl#getVariables <em>Variables</em>}</li>
 *   <li>{@link org.xtext.sampleProj.mydsl.myDsl.FunctionDecl#getBody <em>Body</em>}</li>
 *   <li>{@link org.xtext.sampleProj.mydsl.myDsl.FunctionDecl#getReturnType <em>Return Type</em>}</li>
 * </ul>
 *
 * @see org.xtext.sampleProj.mydsl.myDsl.MyDslPackage#getFunctionDecl()
 * @model
 * @generated
 */
public interface FunctionDecl extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.sampleProj.mydsl.myDsl.FunctionName}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' containment reference list.
   * @see org.xtext.sampleProj.mydsl.myDsl.MyDslPackage#getFunctionDecl_Name()
   * @model containment="true"
   * @generated
   */
  EList<FunctionName> getName();

  /**
   * Returns the value of the '<em><b>Context</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Context</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Context</em>' containment reference.
   * @see #setContext(PolyContext)
   * @see org.xtext.sampleProj.mydsl.myDsl.MyDslPackage#getFunctionDecl_Context()
   * @model containment="true"
   * @generated
   */
  PolyContext getContext();

  /**
   * Sets the value of the '{@link org.xtext.sampleProj.mydsl.myDsl.FunctionDecl#getContext <em>Context</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Context</em>' containment reference.
   * @see #getContext()
   * @generated
   */
  void setContext(PolyContext value);

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
   * @see org.xtext.sampleProj.mydsl.myDsl.MyDslPackage#getFunctionDecl_Variables()
   * @model containment="true"
   * @generated
   */
  TypedVariableList getVariables();

  /**
   * Sets the value of the '{@link org.xtext.sampleProj.mydsl.myDsl.FunctionDecl#getVariables <em>Variables</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variables</em>' containment reference.
   * @see #getVariables()
   * @generated
   */
  void setVariables(TypedVariableList value);

  /**
   * Returns the value of the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Body</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body</em>' containment reference.
   * @see #setBody(FunctionBody)
   * @see org.xtext.sampleProj.mydsl.myDsl.MyDslPackage#getFunctionDecl_Body()
   * @model containment="true"
   * @generated
   */
  FunctionBody getBody();

  /**
   * Sets the value of the '{@link org.xtext.sampleProj.mydsl.myDsl.FunctionDecl#getBody <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body</em>' containment reference.
   * @see #getBody()
   * @generated
   */
  void setBody(FunctionBody value);

  /**
   * Returns the value of the '<em><b>Return Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Return Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Return Type</em>' containment reference.
   * @see #setReturnType(TypeConstructor)
   * @see org.xtext.sampleProj.mydsl.myDsl.MyDslPackage#getFunctionDecl_ReturnType()
   * @model containment="true"
   * @generated
   */
  TypeConstructor getReturnType();

  /**
   * Sets the value of the '{@link org.xtext.sampleProj.mydsl.myDsl.FunctionDecl#getReturnType <em>Return Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Return Type</em>' containment reference.
   * @see #getReturnType()
   * @generated
   */
  void setReturnType(TypeConstructor value);

} // FunctionDecl
