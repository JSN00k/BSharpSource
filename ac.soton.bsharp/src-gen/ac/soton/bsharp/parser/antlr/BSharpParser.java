/*
 * generated by Xtext 2.14.0
 */
package ac.soton.bsharp.parser.antlr;

import ac.soton.bsharp.parser.antlr.internal.InternalBSharpParser;
import ac.soton.bsharp.services.BSharpGrammarAccess;
import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class BSharpParser extends AbstractAntlrParser {

	@Inject
	private BSharpGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalBSharpParser createParser(XtextTokenStream stream) {
		return new InternalBSharpParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "DomainModel";
	}

	public BSharpGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(BSharpGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
