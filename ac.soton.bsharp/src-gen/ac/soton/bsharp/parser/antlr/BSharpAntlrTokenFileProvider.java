/*
 * generated by Xtext 2.14.0
 */
package ac.soton.bsharp.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class BSharpAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("ac/soton/bsharp/parser/antlr/internal/InternalBSharp.tokens");
	}
}
