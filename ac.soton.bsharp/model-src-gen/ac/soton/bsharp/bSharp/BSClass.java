/**
 * generated by Xtext 2.14.0
 */
package ac.soton.bsharp.bSharp;

import java.util.ArrayList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bpp Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ac.soton.bsharp.bSharp.BSClass#getSupertypes <em>Supertypes</em>}</li>
 *   <li>{@link ac.soton.bsharp.bSharp.BSClass#getVarList <em>Var List</em>}</li>
 *   <li>{@link ac.soton.bsharp.bSharp.BSClass#getWhere <em>Where</em>}</li>
 * </ul>
 *
 * @see ac.soton.bsharp.bSharp.BSharpPackage#getBSClass()
 * @model
 * @generated
 */
public interface BSClass extends ClassDecl {
	/**
	 * Returns the value of the '<em><b>Supertypes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supertypes</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supertypes</em>' containment reference.
	 * @see #setSupertypes(SuperTypeList)
	 * @see ac.soton.bsharp.bSharp.BSharpPackage#getBSClass_Supertypes()
	 * @model containment="true"
	 * @generated
	 */
	SuperTypeList getSupertypes();

	/**
	 * Sets the value of the '{@link ac.soton.bsharp.bSharp.BSClass#getSupertypes <em>Supertypes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supertypes</em>' containment reference.
	 * @see #getSupertypes()
	 * @generated
	 */
	void setSupertypes(SuperTypeList value);

	/**
	 * Returns the value of the '<em><b>Var List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Var List</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var List</em>' containment reference.
	 * @see #setVarList(TypeStructure)
	 * @see ac.soton.bsharp.bSharp.BSharpPackage#getBSClass_VarList()
	 * @model containment="true"
	 * @generated
	 */
	TypeStructure getVarList();

	/**
	 * Sets the value of the '{@link ac.soton.bsharp.bSharp.BSClass#getVarList <em>Var List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Var List</em>' containment reference.
	 * @see #getVarList()
	 * @generated
	 */
	void setVarList(TypeStructure value);

	/**
	 * Returns the value of the '<em><b>Where</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Where</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Where</em>' containment reference.
	 * @see #setWhere(Where)
	 * @see ac.soton.bsharp.bSharp.BSharpPackage#getBSClass_Where()
	 * @model containment="true"
	 * @generated
	 */
	Where getWhere();

	/**
	 * Sets the value of the '{@link ac.soton.bsharp.bSharp.BSClass#getWhere <em>Where</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Where</em>' containment reference.
	 * @see #getWhere()
	 * @generated
	 */
	void setWhere(Where value);
	
	Integer eventBRequiredPolyTypes();
	
	String constructWithEventBPolytypes(ArrayList<String> eventBPolytypes);
} // BppClass
