/**
 * generated by Xtext 2.14.0
 */
package ac.soton.bsharp.bSharp.impl;

import ac.soton.bsharp.bSharp.BSharpFactory;
import ac.soton.bsharp.bSharp.BSharpPackage;
import ac.soton.bsharp.bSharp.Datatype;
import ac.soton.bsharp.bSharp.Expression;
import ac.soton.bsharp.bSharp.FunctionCall;
import ac.soton.bsharp.bSharp.InbuiltInfix;
import ac.soton.bsharp.bSharp.Infix;
import ac.soton.bsharp.bSharp.TypeBuilder;
import ac.soton.bsharp.bSharp.TypeConstructor;
import ac.soton.bsharp.bSharp.TypeDeclContext;
import ac.soton.bsharp.bSharp.util.ExprPredEnum;
import ac.soton.bsharp.bSharp.util.Tuple2;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.xtext.EcoreUtil2;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inbuilt Infix</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class InbuiltInfixImpl extends InfixFuncImpl implements InbuiltInfix {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InbuiltInfixImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BSharpPackage.Literals.INBUILT_INFIX;
	}

	@Override
	public TypeBuilder calculateType() {
		// Need to work out how the polymorphic information should be passed here.
		return null;
	}

	@Override
	public TypeBuilder calculateReturnType() {
		Datatype dt = BSharpFactory.eINSTANCE.createDatatype();
		dt.setName("Bool");
		TypeConstructor tc = BSharpFactory.eINSTANCE.createTypeConstructor();
		tc.setTypeName(dt);
		return tc;
	}
	
	static Map<String, Integer> getInfixPrecedenceMap() {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("⇔", 50);
	 	map.put("⇒", 50);
	 	map.put("=", 70);
	 	map.put("≠", 70);
	 	map.put("∧", 60);
	 	map.put("∨", 60);
	 	return map;
	}
	
	protected final Map<String, Integer> inbuiltPrecedence = getInfixPrecedenceMap();

	@Override
	public String eventBName(ExprPredEnum exprPred) {
		return name;
	}

	@Override
	public ExprPredEnum compilationResultType(ExprPredEnum desiredType) {
		return ExprPredEnum.PREDICATE;
	}

	@Override
	public boolean hasEventBInfixOp() {
		return true;
	}

	@Override
	public String latexName() {
		if (name.equals("⇔")) {
			return "\\Leftrightarrow";
		} else if (name.equals("⇒")) {
			return "\\implies";
		} else if (name.equals("≠")) {
			return "\\neq";
		} else if (name.equals("∧")) {
			return "\\land";
		} else if (name.equals("∨")) {
			return "\\lor";
		}
		
		return name;
	}

	@Override
	public Tuple2<ExprPredEnum, ExprPredEnum> infixArgumentExprPredTypes() {
		if (name.equals("=") || name.contentEquals("≠"))
			return new Tuple2<ExprPredEnum, ExprPredEnum>(ExprPredEnum.EXPRESSION, ExprPredEnum.EXPRESSION) ;
			
		return new Tuple2<ExprPredEnum, ExprPredEnum>(ExprPredEnum.PREDICATE, ExprPredEnum.PREDICATE);
	}
	
	@Override
	public Integer bSharpPrecedence() {
		return inbuiltPrecedence.get(getName());
	}
	
	@Override
	public String compileToStringWithContextAndArguments(FunctionCall fc, Boolean asPred) throws Exception {
		TypeDeclContext ctx = fc.getContext();
		
		if (ctx != null) {
			/* I don't believe that there is any way that an inbuiltInfix can have a context */
			throw new Exception("Validate against this, a type variable shouldn't be able to have" +
			" a poly context applied to it.");
		}
		
		EList<Expression> exprs = fc.getArguments();
		if (exprs != null && !exprs.isEmpty()) {
			/* wouldn't function currying be fun at this point! Anyhow I'm not doing that yet, although it could be achieved
			 * by making an some sort of instance of the function that remembers the arguments already sent to 
			 * it then only calling the function when all of the arguments had been given.
			 */
			if (exprs.size() != 2) {
				throw new Exception("inbuilt infix called with incorrect number of arguments");
			}
			
			/* An infix object already has all of the code to compile this. */
			Infix infix = BSharpFactory.eINSTANCE.createInfix();
			infix.setOpName(getName());
			infix.setLeft(EcoreUtil2.copy(exprs.get(0)));
			infix.setRight(EcoreUtil2.copy(exprs.get(1)));
			
			/* When a new pbject is created for compilation it needs to be attached to the current tree so references can be resolved
			 * by searching above the tree. The function call object is the object with the correct context for this as the inbuilt 
			 * infix could potentially be a reference.
			 */
			fc.setCompilationObject(infix);
			String result = infix.compileToEventBString(asPred);
			fc.setCompilationObject(null);
			return result;
		}
		
		return "(λx ↦ y·⊤ ∣ bool(x " + getName() + " y))";

	}
	
} //InbuiltInfixImpl
