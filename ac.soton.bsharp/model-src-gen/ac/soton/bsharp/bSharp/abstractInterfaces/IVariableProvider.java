package ac.soton.bsharp.bSharp.abstractInterfaces;

import java.util.Collection;

import org.eclipse.emf.ecore.EObject;

/*
 * This Interface is for any type that provides variables that can be used lower within the
 * scope. Having an interface for it allows easy iteration up through the tree to find the
 * variable names.
 */

public interface IVariableProvider {
	public Collection<EObject> getVariablesNames();
}
