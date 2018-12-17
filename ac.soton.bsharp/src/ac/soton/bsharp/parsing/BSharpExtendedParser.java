package ac.soton.bsharp.parsing;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;

import ac.soton.bsharp.parser.antlr.BSharpParser;
import ac.soton.bsharp.parser.antlr.internal.InternalBSharpParser;

public class BSharpExtendedParser extends BSharpParser {
	@Override
	protected InternalBSharpParser createParser(XtextTokenStream stream) {
		return new BSharpExtendedInternalParser(stream, getGrammarAccess());
	}
}
