/**
 * generated by Xtext 2.14.0
 */
package ac.soton.bsharp.bSharp;

import java.util.ArrayList;

import org.eclipse.emf.common.util.EList;

import ac.soton.bsharp.bSharp.util.Tuple2;

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
public interface ClassDecl extends GenName, ExpressionVariable, IVariableProvider, IPolyTypeProvider, Type, TopLevelInstance, IEventBPrefixProvider {
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
	 * @see ac.soton.bsharp.bSharp.BSharpPackage#getClassDecl_Context()
	 * @model containment="true"
	 * @generated
	 */
	PolyContext getContext();

	/**
	 * Sets the value of the '{@link ac.soton.bsharp.bSharp.ClassDecl#getContext <em>Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' containment reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(PolyContext value);

	/**
	 * Returns the value of the '<em><b>Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Block</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Block</em>' containment reference.
	 * @see #setBlock(BSharpBlock)
	 * @see ac.soton.bsharp.bSharp.BSharpPackage#getClassDecl_Block()
	 * @model containment="true"
	 * @generated
	 */
	BSharpBlock getBlock();

	/**
	 * Sets the value of the '{@link ac.soton.bsharp.bSharp.ClassDecl#getBlock <em>Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Block</em>' containment reference.
	 * @see #getBlock()
	 * @generated
	 */
	void setBlock(BSharpBlock value);

	String constructWithTypeContext(TypeDeclContext context);
	public String eventBPolymorphicTypeConstructorName();
	void compile() throws Exception;

	String eventBTypeConstructorFromTypes();

	/* Methods within ClassDecl's can use functions declared as part of the type. To allow
	 * this in EventB a polymorphic instance of the type class is passed as an argument to
	 * the EventB operator. 
	 */
	ArrayList<Tuple2<String, String>> typedConstructionArgs();

	/* Given a polytype T : Setoid this deals with a call like T.equ(a, b) 
	 * ownerType would be T, typeInst would be equ, function call contains a polytype and 
	 * */
	String applyMemberOrFuncGetter(ExpressionVariable typeInst, PolyType ownerType, FunctionCall fc, Boolean asPred);

	/* Given an expression such as pNat.times this will expand to the call pNat_times in EventB */
	String appyMemberOrFunc(ExpressionVariable typeInst, FunctionCall fc, Boolean asPred);

} // ClassDecl
