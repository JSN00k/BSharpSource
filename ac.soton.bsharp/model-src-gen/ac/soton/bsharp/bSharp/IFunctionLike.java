package ac.soton.bsharp.bSharp;

import java.util.Collection;

/*
 * Encapsulate the similarities between Quantifiers and lambdas and function declarations
 * In a sense quantifiers are function declarations with a known name and return type (Pred).
 * Lambdas as expected are nameless function declarations where the return type is inferred 
 * from the type that the expression expects.
 */
public interface IFunctionLike extends IVariableProvider, IPolyTypeProvider {

	public String getFuncName();
	public Collection<TypedVariable> getVariablesNames();
	public Expression getExpr();
}
