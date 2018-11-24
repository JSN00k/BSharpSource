/**
 * generated by Xtext 2.14.0
 */
package ac.soton.bsharp.bSharp;

import java.util.ArrayList;

import ac.soton.bsharp.bSharp.util.Tuple2;
import ac.soton.bsharp.theory.util.TheoryImportCache;

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
	 * @see #setVarList(TypedVariableList)
	 * @see ac.soton.bsharp.bSharp.BSharpPackage#getBSClass_VarList()
	 * @model containment="true"
	 * @generated
	 */
	TypedVariableList getVarList();

	/**
	 * Sets the value of the '{@link ac.soton.bsharp.bSharp.BSClass#getVarList <em>Var List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Var List</em>' containment reference.
	 * @see #getVarList()
	 * @generated
	 */
	void setVarList(TypedVariableList value);

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
	 
	 String superName();

	ArrayList<String> getterOperatorSuffixes();

	ArrayList<Tuple2<String, String>> polyArgumentsToConstructGenericTypeClass() throws Exception;

	String eventBPolymorphicTypeConstructorName();

	Boolean isTypeClass();

	String eventBTypeConstructorFromTypes();

	/* In EventB subtypes are represented by mapping the current type with the current types
	 * with the types for the additional variables, for functions that require the supertype
	 * it is necessary to add the correct number of prj1s onto the type to find the correct 
	 * supertype.
	 */
	Integer prjsRequiredForSupertype(BSClass sType);
	
	/* The base type is the type before any aditional variables have been added to the type. */
	TypeBuilder baseType();

	String deconstructEventBTypeToArguments(String deconstructionType);

	Integer prjsRequiredForBaseType();

	String baseTypeStringForPolymorphicType(PolyType p);

	String baseTypeFromBSContext();

	String getterForOpName(String opName);

	/* Within a type class the super types instance variables can be accessed.
	 * This creates a function to deconstruct the supertype to get instant variable.
	 * for instance declaring a Monoid, we have Monoid : Setoid, and the equ variable
	 * can be referenced. when equ is referenced within a where statement this expands
	 * to Setoid_equ(...) to get the instance variable.
	 */
	String expandSupertypeMemberReferencedInWhere(TypedVariable var);

	/* The Bsharp type expanded so that it doesn't inculde type class declarations within the typing. */
	TypeBuilder identType();

	/* Due to the polymoprhic arguments having to be typed separately, unlike the type variables
	 * it is necessary to return the aruments and the types separately.
	 */
	ArrayList<Tuple2<String, String>> argsAndTypingForDeconstructedType(ArrayList<String> args);

} // BppClass
