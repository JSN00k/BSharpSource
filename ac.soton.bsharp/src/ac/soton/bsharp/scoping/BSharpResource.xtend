package ac.soton.bsharp.scoping

import org.eclipse.xtext.linking.lazy.LazyLinkingResource
import java.io.IOException
import java.io.InputStream
import java.util.Map
import org.eclipse.xtext.parser.IParseResult
import ac.soton.bsharp.bSharp.TopLevel
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.xtext.EcoreUtil2
import ac.soton.bsharp.bSharp.FileImport
import org.eclipse.emf.ecore.EcoreFactory
import org.eclipse.xtext.nodemodel.util.NodeModelUtils
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.nodemodel.INode
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.InternalEObject
import org.eclipse.emf.ecore.util.InternalEList
import org.eclipse.xtext.CrossReference
import org.eclipse.xtext.nodemodel.ICompositeNode
import org.eclipse.xtext.RuleCall
import org.eclipse.xtext.AbstractRule
import org.eclipse.xtext.ParserRule

class BSharpResource extends LazyLinkingResource {
	override doLoad(InputStream inputStream, Map<?, ?> options) throws IOException {
		setEncodingFromOptions(options)
		var IParseResult result;
		if (entryPoint === null) {
			result = parser.parse(createReader(inputStream));
		} else {
			result = parser.parse(entryPoint, createReader(inputStream));
		}
		
		val rootAST = result.getRootASTElement()
		
		if (rootAST !== null) {
			val fileNameFull = uri.segments.last.toString()
			val topLevelFile = (rootAST as TopLevel).topLevelFile
			if (topLevelFile !== null) {
				topLevelFile.setName(fileNameFull.substring(0, fileNameFull.lastIndexOf('.')))
			}
		}
		
		updateInternalState(this.parseResult, result);
		
		if (options !== null && Boolean.TRUE.equals(options.get(OPTION_RESOLVE_ALL)))
			EcoreUtil.resolveAll(this);

	}
}