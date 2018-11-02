/**
 * generated by Xtext 2.14.0
 */
package ac.soton.bsharp.bSharp;

import java.util.ArrayList;
import java.util.Map;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import ac.soton.bsharp.bSharp.util.Tuple2;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Typed Variable List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ac.soton.bsharp.bSharp.TypedVariableList#getVariablesOfType <em>Variables Of Type</em>}</li>
 * </ul>
 *
 * @see ac.soton.bsharp.bSharp.BSharpPackage#getTypedVariableList()
 * @model
 * @generated
 */
public interface TypedVariableList extends EObject {
	/**
	 * Returns the value of the '<em><b>Variables Of Type</b></em>' containment reference list.
	 * The list contents are of type {@link ac.soton.bsharp.bSharp.VariableTyping}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variables Of Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variables Of Type</em>' containment reference list.
	 * @see ac.soton.bsharp.bSharp.BSharpPackage#getTypedVariableList_VariablesOfType()
	 * @model containment="true"
	 * @generated
	 */
	EList<VariableTyping> getVariablesOfType();

	
	/* Returns the type variables such that each variable is mapped to its type,
	 * In a TypedVariableList each of the VariableTyping can contain multiple variables
	 * each with the same type, this unwraps the variable typings.
	 */
	ArrayList<Tuple2<String, String>> getCompiledVariablesAndTypes();


	int varCount();
} // TypedVariableList
