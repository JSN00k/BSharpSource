package ac.soton.bsharp.parsing;

import java.awt.List;

import org.antlr.runtime.TokenStream;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.ILeafNode;
import org.eclipse.xtext.nodemodel.INode;

import ac.soton.bsharp.bSharp.Extend;
import ac.soton.bsharp.bSharp.FileImport;
import ac.soton.bsharp.bSharp.Instance;
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
				} else if (semElem instanceof Instance) {
					/*
					 * If the Instance node doesn't have a name find the first cross reference and
					 * set the ClassNameName variable. This allows the finding of the name of the
					 * className without having to resolve the class name reference.
					 */
					Instance inst = (Instance) semElem;
					INode node = ((ICompositeNode) current).getFirstChild();
					while (!(node.getGrammarElement() instanceof CrossReference)) {
						node = node.getNextSibling();
					}

					inst.setClassNameName(node.getText().replaceAll("\\s+", ""));
				} else if (semElem instanceof Extend) {
					Extend extend = (Extend) semElem;
					INode node = ((ICompositeNode) current).getFirstChild();
					while(!(node.getGrammarElement() instanceof CrossReference)) {
						node = node.getNextSibling();
					}
					
					String name = node.getText().replaceAll("\\s+", "");
					extend.setExtendedClassName(name);
				}
			}
		}
	}
}
