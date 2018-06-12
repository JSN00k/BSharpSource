package ac.soton.bsharp.bSharp;

import java.util.Collection;

/*
 * This Interface is for any type that provides variables that can be used lower within the
 * scope. Having a interface for it allows easy iteration up through the tree to find the
 * variable names.
 */

public interface IVariableProvider {
	public Collection<TypedVariable> getVariablesNames();
}
