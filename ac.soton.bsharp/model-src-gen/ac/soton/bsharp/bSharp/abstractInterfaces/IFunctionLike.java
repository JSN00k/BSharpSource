package ac.soton.bsharp.bSharp.abstractInterfaces;

import java.util.Collection;

import org.eclipse.emf.ecore.EObject;

import ac.soton.bsharp.bSharp.Expression;

/*
 * Encapsulate the similarities between Quantifiers and lambdas and function declarations
 * In a sense quantifiers are function declarations with a known name and return type (Pred).
 * Lambdas as expected are nameless function declarations where the return type is inferred 
 * from the type that the expression expects.
 */
public interface IFunctionLike extends IVariableProvider, IPolyTypeProvider {

	public String getFuncName();
	public Collection<EObject> getVariablesNames();
	public Expression getExpr();
}
