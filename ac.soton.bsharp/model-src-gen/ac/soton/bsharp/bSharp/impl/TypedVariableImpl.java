/**
 * generated by Xtext 2.14.0
 */
package ac.soton.bsharp.bSharp.impl;

import ac.soton.bsharp.bSharp.BSharpPackage;
import ac.soton.bsharp.bSharp.ConstructedType;
import ac.soton.bsharp.bSharp.TypeBuilder;
import ac.soton.bsharp.bSharp.TypeConstructor;
import ac.soton.bsharp.bSharp.TypedVariable;
import ac.soton.bsharp.bSharp.VariableTyping;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.xtext.EcoreUtil2;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Typed Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class TypedVariableImpl extends ExpressionVariableImpl implements TypedVariable {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypedVariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BSharpPackage.Literals.TYPED_VARIABLE;
	}
	
	@Override
	public TypeBuilder getType() {
		return ((VariableTyping)eContainer()).getType();
	}
	
	@Override
	public Boolean isPredicateVariable() {
		ConstructedType type = ((VariableTyping)eContainer()).getType();
		
		return (type instanceof TypeConstructor) && ((TypeConstructor)type).getTypeName().getName().equals("Bool");
	}


} //TypedVariableImpl
