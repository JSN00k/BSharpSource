/*
 * generated by Xtext 2.14.0
 */
package ac.soton.bsharp.ui.tests;

import ac.soton.bsharp.ui.internal.BsharpActivator;
import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;

public class BSharpUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return BsharpActivator.getInstance().getInjector("ac.soton.bsharp.BSharp");
	}

}