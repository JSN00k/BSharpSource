/**
 * generated by Xtext 2.14.0
 */
package ac.soton.bsharp.bSharp;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import ac.soton.bsharp.theory.util.TheoryImportCache;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Super Type List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ac.soton.bsharp.bSharp.SuperTypeList#getSuperTypes <em>Super Types</em>}</li>
 * </ul>
 *
 * @see ac.soton.bsharp.bSharp.BSharpPackage#getSuperTypeList()
 * @model
 * @generated
 */
public interface SuperTypeList extends EObject {
	/**
	 * Returns the value of the '<em><b>Super Types</b></em>' containment reference list.
	 * The list contents are of type {@link ac.soton.bsharp.bSharp.TypeBuilder}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Types</em>' containment reference list.
	 * @see ac.soton.bsharp.bSharp.BSharpPackage#getSuperTypeList_SuperTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<TypeBuilder> getSuperTypes();	
	
	ConstructedType getFirst();
} // SuperTypeList
