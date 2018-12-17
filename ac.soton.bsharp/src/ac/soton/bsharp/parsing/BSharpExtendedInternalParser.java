package ac.soton.bsharp.parsing;

import java.awt.List;

import org.antlr.runtime.TokenStream;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.ILeafNode;
import org.eclipse.xtext.nodemodel.INode;

import ac.soton.bsharp.bSharp.FileImport;
import ac.soton.bsharp.parser.antlr.internal.InternalBSharpParser;
import ac.soton.bsharp.services.BSharpGrammarAccess;

public class BSharpExtendedInternalParser extends InternalBSharpParser {

	public BSharpExtendedInternalParser(TokenStream input) {
		super(input);
	}
	
	public BSharpExtendedInternalParser(TokenStream input, BSharpGrammarAccess grammarAccess) {
		super(input, grammarAccess);
	}
	

	@Override
	public void afterParserOrEnumRuleCall() {
		INode current = getCurrentNode();
		INode parent = current.getParent();
		
		EObject elem = current.getGrammarElement();
		EObject parentElem = parent.getGrammarElement();
		
		if (elem instanceof CrossReference && parentElem instanceof FileImport) {
			((FileImport)parentElem).setFileName(current.getText());
		}

		super.afterParserOrEnumRuleCall();	
	}
	
	@Override
	public void leaveRule() {
		INode current = getCurrentNode();
		if (current instanceof ICompositeNode) {
			ICompositeNode compNode = (ICompositeNode)current;
			
			if (compNode.hasDirectSemanticElement()) {
				EObject semElem = compNode.getSemanticElement();
				if (semElem instanceof FileImport) {
					/* Find the cross reference */
					Iterable<ILeafNode> leafNodes = current.getLeafNodes();
					for (ILeafNode node : leafNodes) {
						if (!node.isHidden() && node.getGrammarElement() instanceof CrossReference) {
							((FileImport) semElem).setFileName(node.getText());
						}
					}
				}
			}
		}
	}
}
