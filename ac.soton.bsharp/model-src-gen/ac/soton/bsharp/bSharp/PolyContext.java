/**
 * generated by Xtext 2.14.0
 */
package ac.soton.bsharp.bSharp;

import java.util.ArrayList;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
import ac.soton.bsharp.bSharp.util.Tuple2;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Poly Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ac.soton.bsharp.bSharp.PolyContext#getPolyTypes <em>Poly Types</em>}</li>
 * </ul>
 *
 * @see ac.soton.bsharp.bSharp.BSharpPackage#getPolyContext()
 * @model
 * @generated
 */
public interface PolyContext extends EObject {
	/**
	 * Returns the value of the '<em><b>Poly Types</b></em>' containment reference list.
	 * The list contents are of type {@link ac.soton.bsharp.bSharp.PolyType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Poly Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Poly Types</em>' containment reference list.
	 * @see ac.soton.bsharp.bSharp.BSharpPackage#getPolyContext_PolyTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<PolyType> getPolyTypes();
	
	Integer eventBPolyVarCount();
	
	/* Returns the number of types declared in the polyContext. */
	int polyTypesCount();

	/* Something with a context has been called with the context arguments, it is necessary to 
	 * resolve types properly, searching for the correct supertypes to fill the context in EventB
	 * This method does that.
	 */
	String compileCallWithTypeContext(TypeDeclContext ctx) throws Exception;

	ArrayList<Tuple2<String, String>> namesAndTypesForPolyContext();

} // PolyContext
