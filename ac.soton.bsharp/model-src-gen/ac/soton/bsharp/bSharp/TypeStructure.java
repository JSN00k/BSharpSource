/**
 * generated by Xtext 2.14.0
 */
package ac.soton.bsharp.bSharp;

import java.util.ArrayList;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.mwe2.runtime.IFactory;

import ac.soton.bsharp.bSharp.util.Tuple2;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ac.soton.bsharp.bSharp.TypeStructure#getVariables <em>Variables</em>}</li>
 * </ul>
 *
 * @see ac.soton.bsharp.bSharp.BSharpPackage#getTypeStructure()
 * @model
 * @generated
 */
public interface TypeStructure extends EObject {
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
	 * @see ac.soton.bsharp.bSharp.BSharpPackage#getTypeStructure_Variables()
	 * @model containment="true"
	 * @generated
	 */
	TypedVariableList getVariables();

	/**
	 * Sets the value of the '{@link ac.soton.bsharp.bSharp.TypeStructure#getVariables <em>Variables</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variables</em>' containment reference.
	 * @see #getVariables()
	 * @generated
	 */
	void setVariables(TypedVariableList value);
	
	/* If a type class has the var list (a : AssocOp<T>, b : T) the var list will compile to the
	 * following:
	 * { ... |-> a |-> b ... | ... /\ a ∈ AssocOp(T) /\ b ∈ T ... }
	 * The first of the methods below creates the a |-> b section of the compilation
	 * The second method creates a ∈ AssocOp(T) /\ b ∈ T part of the EventB type.
	 */
	
	/* Makes a string of variables mapped together used to define the type class */ 
	String stringForArgsToSetCompVarList();
	
	String typedArgsForTypeClass();

	ArrayList<Tuple2<String, String>> getEventBVariablesAndTypes(); 

} // TypeStructure
