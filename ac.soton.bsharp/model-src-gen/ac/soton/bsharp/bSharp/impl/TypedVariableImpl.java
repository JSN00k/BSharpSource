/**
 * generated by Xtext 2.14.0
 */
package ac.soton.bsharp.bSharp.impl;

import ac.soton.bsharp.bSharp.BSClass;
import ac.soton.bsharp.bSharp.BSharpPackage;
import ac.soton.bsharp.bSharp.ClassDecl;
import ac.soton.bsharp.bSharp.ConstructedType;
import ac.soton.bsharp.bSharp.Datatype;
import ac.soton.bsharp.bSharp.Expression;
import ac.soton.bsharp.bSharp.FunctionCall;
import ac.soton.bsharp.bSharp.FunctionDecl;
import ac.soton.bsharp.bSharp.IVariableProvider;
import ac.soton.bsharp.bSharp.SuperTypeList;
import ac.soton.bsharp.bSharp.TheoremDecl;
import ac.soton.bsharp.bSharp.TypeBuilder;
import ac.soton.bsharp.bSharp.TypeConstructor;
import ac.soton.bsharp.bSharp.TypedVariable;
import ac.soton.bsharp.bSharp.TypedVariableList;
import ac.soton.bsharp.bSharp.VariableTyping;
import ac.soton.bsharp.bSharp.util.CompilationUtil;
import ac.soton.bsharp.typeInstanceRepresentation.ITypeInstance;

import java.util.ArrayList;

import org.eclipse.emf.common.util.EList;
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
		TypeBuilder type = ((VariableTyping)eContainer()).getType();
		
		return (type instanceof TypeConstructor) && ((TypeConstructor)type).getTypeName().getName().equals("Bool");
	}

	@Override
	public Boolean isTypeClassVariable() {
		TypedVariableList varList = EcoreUtil2.getContainerOfType(this, TypedVariableList.class);
		
		if (varList == null)
			return false;
		
		return varList.eContainer() instanceof BSClass;
	}
	
	@Override 
	public String compileToStringWithContextAndArguments(FunctionCall fc, Boolean asPred)  throws Exception {
		if (!isTypeClassVariable())
			return super.compileToStringWithContextAndArguments(fc, asPred);
		
		ITypeInstance typeInst = CompilationUtil.getTypeInstance(fc);
		return typeInst.compileFunctionCallOfTypeInstance(fc, asPred, this);
	}

	@Override
	public TypeBuilder calculateReturnType() {
		/*TODO: Need some test cases. The type could be a wrapped type class, so may need more logic here. */
		TypeBuilder type = getType();
		
		if (type instanceof ConstructedType) {
			return ((ConstructedType) type).getRight();
		}
		
		return null;
	}

	@Override
	public TypeBuilder calculateType() {
		return getType();
	}

} //TypedVariableImpl
