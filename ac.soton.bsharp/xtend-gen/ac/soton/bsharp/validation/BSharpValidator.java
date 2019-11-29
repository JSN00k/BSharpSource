/**
 * generated by Xtext 2.12.0
 */
package ac.soton.bsharp.validation;

import ac.soton.bsharp.bSharp.BSharpPackage;
import ac.soton.bsharp.bSharp.Expression;
import ac.soton.bsharp.bSharp.ExpressionVariable;
import ac.soton.bsharp.bSharp.FunctionCall;
import ac.soton.bsharp.bSharp.Infix;
import ac.soton.bsharp.bSharp.WrappedInfix;
import ac.soton.bsharp.bSharp.util.CompilationUtil;
import ac.soton.bsharp.bSharp.util.FunctionValidatorUtil;
import ac.soton.bsharp.validation.AbstractBSharpValidator;
import java.util.HashSet;
import java.util.List;
import java.util.function.Predicate;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.xbase.lib.Conversions;

/**
 * This class contains custom validation rules.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@SuppressWarnings("all")
public class BSharpValidator extends AbstractBSharpValidator {
  public static final String UNEXPECTED_POLY_CONTEXT = "unexpectedPolyContext";
  
  public static final String POLYMORPHIC_TYPE_OUT_OF_SCOPE = "PolymorphicTypeOutOfScope";
  
  @Check
  public void checkExpressionTree(final Infix expression) {
    Infix copy = EcoreUtil2.<Infix>copy(expression);
    Expression _reorderExpresionTree = copy.reorderExpresionTree();
    copy = ((Infix) _reorderExpresionTree);
    Infix copy2 = EcoreUtil2.<Infix>copy(expression);
  }
  
  /**
   * It is possible to have multiple functions with the same name in scope.
   * A future implementation could improve this with type inference. However
   * in this implementation we just check the function name is unique in the scope
   * if it is all is good, otherwise the full name is required i.e., add -> Nat.add
   */
  public Object[] visibaleRefencesMatchingFunctionType(final EObject ctx, final ExpressionVariable fd) {
    final HashSet<ExpressionVariable> exprVars = FunctionValidatorUtil.allInscopeExpressionVariables(ctx);
    final Predicate<ExpressionVariable> _function = (ExpressionVariable e) -> {
      return (e.getName().equals(fd.getName()) && FunctionValidatorUtil.isGlobalFuncType(e));
    };
    final Object[] funcArray = exprVars.stream().filter(_function).toArray();
    return funcArray;
  }
  
  public static final String UNREASOLVABLE_FUNCTION_NAME = "unreasolvable function name";
  
  public void errorForUnresolvableFunctionName(final Object[] references) {
    int _size = ((List<Object>)Conversions.doWrapArray(references)).size();
    boolean _equals = (_size == 1);
    if (_equals) {
      return;
    }
    String correctionString = "";
    boolean first = true;
    for (final Object e : references) {
      {
        if ((!first)) {
          String _correctionString = correctionString;
          correctionString = (_correctionString + ", ");
        } else {
          first = false;
        }
        String _correctionString_1 = correctionString;
        String _name = CompilationUtil.getClassDecl(((ExpressionVariable) e)).getName();
        String _plus = (_name + ".");
        String _name_1 = ((ExpressionVariable) e).getName();
        String _plus_1 = (_plus + _name_1);
        correctionString = (_correctionString_1 + _plus_1);
      }
    }
    this.error(("Multiple functions with the same name in scope. Change to one of the following: " + correctionString), 
      ((EStructuralFeature) BSharpPackage.Literals.FUNCTION_CALL), BSharpValidator.UNREASOLVABLE_FUNCTION_NAME);
  }
  
  @Check
  public void checkFunctionCall(final FunctionCall fn) {
    final ExpressionVariable tInst = fn.getTypeInstBasic();
    if (((tInst != null) && FunctionValidatorUtil.isGlobalFuncType(tInst))) {
      final Object[] references = this.visibaleRefencesMatchingFunctionType(fn, tInst);
      this.errorForUnresolvableFunctionName(references);
    }
  }
  
  @Check
  public void checkWrappedInfix(final WrappedInfix infix) {
    final ExpressionVariable tInst = infix.getFuncName();
    if (((tInst != null) && FunctionValidatorUtil.isGlobalFuncType(tInst))) {
      final Object[] references = this.visibaleRefencesMatchingFunctionType(infix, tInst);
      this.errorForUnresolvableFunctionName(references);
    }
  }
}
