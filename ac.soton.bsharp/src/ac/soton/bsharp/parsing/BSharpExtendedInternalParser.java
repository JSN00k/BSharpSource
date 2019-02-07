package ac.soton.bsharp.parsing;

import java.awt.List;

import org.antlr.runtime.TokenStream;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.EcoreUtil2;
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
					/* There may be two cross references, the first will always be to the file name
					 * the second if it exists will be to the imported type. */
					boolean first = true;
					
					
					Iterable<ILeafNode> leafNodes = current.getLeafNodes();
					for (ILeafNode node : leafNodes) {
						if (!node.isHidden() && node.getGrammarElement() instanceof CrossReference) {
							String text = node.getText().replaceAll("\\s+", "");
							if (first) {
								((FileImport) semElem).setFileName(text);
								first = false;
							} else {
								((FileImport) semElem).setTypeName(text);
							}
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
