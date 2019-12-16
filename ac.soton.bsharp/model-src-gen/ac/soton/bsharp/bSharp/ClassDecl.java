/**
 * generated by Xtext 2.14.0
 */
package ac.soton.bsharp.bSharp;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import ac.soton.bsharp.bSharp.util.Tuple2;
import ac.soton.bsharp.theory.util.TheoryImportCache;
import ac.soton.bsharp.typeInstanceRepresentation.ITypeInstance;
import ac.soton.bsharp.typeInstanceRepresentation.ITypeInstanceOpArgs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ac.soton.bsharp.bSharp.ClassDecl#getTypeName <em>Type Name</em>}</li>
 *   <li>{@link ac.soton.bsharp.bSharp.ClassDecl#getContext <em>Context</em>}</li>
 *   <li>{@link ac.soton.bsharp.bSharp.ClassDecl#getBodyElements <em>Body Elements</em>}</li>
 * </ul>
 *
 * @see ac.soton.bsharp.bSharp.BSharpPackage#getClassDecl()
 * @model
 */
public interface ClassDecl extends TopLevelInstance, GenName, ExpressionVariable, IVariableProvider, IPolyTypeProvider, IEventBPrefixProvider, IClassInstance {
	/**
	 * Returns the value of the '<em><b>Raw Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Raw Context</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Raw Context</em>' containment reference.
	 * @see #setRawContext(PolyContext)
	 * @see ac.soton.bsharp.bSharp.BSharpPackage#getClassDecl_RawContext()
	 * @model containment="true"
	 * @generated
	 */
	PolyContext getRawContext();

	/**
	 * Sets the value of the '{@link ac.soton.bsharp.bSharp.ClassDecl#getRawContext <em>Raw Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Raw Context</em>' containment reference.
	 * @see #getRawContext()
	 * @generated
	 */
	void setRawContext(PolyContext value);
	
	PolyContext getContext();

	String eventBPolymorphicTypeConstructorName();
	String constructWithTypeContext(TypeDeclContext context);

	/*Delete if found. */
//	/* Given a polytype T : Setoid this deals with a call like T.equ(a, b) 
//	 * ownerType would be T, typeInst would be equ, function call contains a polytype and 
//	 */
//	String applyMemberOrFuncGetter(ExpressionVariable typeInst, PolyType ownerType, FunctionCall fc, Boolean asPred);

	ITypeInstanceOpArgs genericTypeInstance(EObject context);

	String constructorArgsForTypeInstance(ITypeInstance typeInst);

	String constructWithTypeInstances(List<ITypeInstance> instList);

	TypeBuilder baseTypeForTypeDeclarationContext(TypeDeclContext tdContext);

} // ClassDecl
