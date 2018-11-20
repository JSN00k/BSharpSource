/**
 * generated by Xtext 2.14.0
 */
package ac.soton.bsharp.bSharp;

import java.util.ArrayList;

import org.eclipse.emf.common.util.EList;

import org.eventb.theory.core.INewOperatorDefinition;

import ac.soton.bsharp.bSharp.util.Tuple2;
import ac.soton.bsharp.theory.util.TheoryImportCache;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Poly Context Types</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ac.soton.bsharp.bSharp.PolyType#getSuperTypes <em>Super Types</em>}</li>
 * </ul>
 *
 * @see ac.soton.bsharp.bSharp.BSharpPackage#getPolyType()
 * @model
 * @generated
 */
public interface PolyType extends GenName {
	/**
	 * Returns the value of the '<em><b>Super Types</b></em>' reference list.
	 * The list contents are of type {@link ac.soton.bsharp.bSharp.ClassDecl}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Types</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Types</em>' reference list.
	 * @see ac.soton.bsharp.bSharp.BSharpPackage#getPolyType_SuperTypes()
	 * @model
	 * @generated
	 */
	EList<ClassDecl> getSuperTypes();

	/* A type in BSharp may require several EventB types when constructed with a polymorphic context
	 * This method uses the prj functions to deconstruct the correct types to fill in the arguments.
	 */
	String deconstructTypeToArguments(TypeBuilder typeBuilder, ClassDecl containerType);

	String baseTypeString();

	ArrayList<String> typeNames();

	/* thyCache can be null provided the types are in the same file as is currently being compiled.
	 * 
	 */
	ArrayList<Tuple2<String, String>> eBNamesAndTypes(TheoryImportCache thyCache);

} // PolyContextTypes
