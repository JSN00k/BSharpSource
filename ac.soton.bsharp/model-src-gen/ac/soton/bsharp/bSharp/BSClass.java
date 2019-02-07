/**
 * generated by Xtext 2.14.0
 */
package ac.soton.bsharp.bSharp;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import ac.soton.bsharp.bSharp.util.Tuple2;
import ac.soton.bsharp.mapletTree.IMapletNode;
import ac.soton.bsharp.theory.util.TheoryImportCache;
import ac.soton.bsharp.typeInstanceRepresentation.ITypeInstance;

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
 *   <li>{@link ac.soton.bsharp.bSharp.BSClass#getInstName <em>Inst Name</em>}</li>
 * </ul>
 *
 * @see ac.soton.bsharp.bSharp.BSharpPackage#getBSClass()
 * @model
 * @generated
 */
public interface BSClass extends ClassDecl, IExpressionContainer {
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

	/**
	 * Returns the value of the '<em><b>Inst Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inst Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inst Name</em>' containment reference.
	 * @see #setInstName(InstName)
	 * @see ac.soton.bsharp.bSharp.BSharpPackage#getBSClass_InstName()
	 * @model containment="true"
	 * @generated
	 */
	InstName getInstName();

	/**
	 * Sets the value of the '{@link ac.soton.bsharp.bSharp.BSClass#getInstName <em>Inst Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inst Name</em>' containment reference.
	 * @see #getInstName()
	 * @generated
	 */
	void setInstName(InstName value);

	Integer eventBRequiredPolyTypes();
	 
	String instanceName();

	ArrayList<String> getterOperatorSuffixes();

	ArrayList<Tuple2<String, String>> polyArgumentsToConstructGenericTypeClass(TheoryImportCache thyCache) throws Exception;

	Boolean isTypeClass();

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

	/* Used in the theorems, currently can't be used to create functions with deconstructed types because
	 * not enough type information is stored.
	 */
	ITypeInstance deconstructedTypeInstance(EObject context, String instName);
	
	/* If the current typeclasses supertype is a typeclass this type class is returned. */
	ClassDecl getFirstSupertypeTypeClass();

	boolean isDirectSuperType(ClassDecl possibleSType);

	boolean isSuperType(ClassDecl possibleSType);

	IMapletNode concreteTypeMapletTree(List<IClassInstance> types, List<Expression> args, Instance declInst,
			EObject context);

	/* When a type instance is declared it will have a number of arguments, these arguments are 
	 * consumed making instances of the type class. After this a default class is searched for
	 * if this is necessary. This method works out all of the type classes that will be created
	 * using the arguments. It is useful for the instance declaration to be able to get hold of
	 * these classes as it allows it to get the theorems/methods for only these types and compile them 
	 * appropriately.
	 */
	void typeClassesConstructableFromArgCount(int argsCount, ArrayList<BSClass> result);
	List<BSClass> typeClassesConstructableWithArgs(List<Expression> args);

	List<Integer> prjsForTypedVariable(TypedVariable typedVariable);

	int variablesCount();
} // BppClass
