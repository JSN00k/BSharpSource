/**
 * generated by Xtext 2.14.0
 */
package ac.soton.bsharp.bSharp;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.ecore.EObject;

import ac.soton.bsharp.bSharp.impl.MatchStatementImpl;
import ac.soton.bsharp.bSharp.util.Tuple2;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IVariable Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see ac.soton.bsharp.bSharp.BSharpPackage#getIVariableProvider()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IVariableProvider extends EObject {
	
	/*
	 * This Interface is for any type that provides variables that can be used lower within the
	 * scope. Having an interface for it allows easy iteration up through the tree to find the
	 * variable names.
	 */
	public Collection<EObject> getVariablesNames();
	
	/* If there is a call like AssocOp<Monoid> anywhere within the Monoid type class
	 * this call will get the arguments to the AssocOp_T operator. Note that this will
	 * be different depending on context, e.g., the variables may be named differently
	 * when included in a function than they are within the where statment of the type 
	 * class. In the example above AssocOps declaration is AssocOp(T : Setoid), and
	 * Setoid is passed into this method as it is the type that needs to be passed.
	 */
	String inferredPolyTypeArgsForType(ClassDecl t);

	public String opNameForMatchStatement(MatchStatementImpl match);

	public Collection<? extends Tuple2<String, String>> inScopeTypedVariables();
} // IVariableProvider
