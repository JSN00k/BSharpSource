package ac.soton.bsharp.scoping

import org.eclipse.xtext.linking.lazy.LazyLinkingResource
import java.io.IOException
import java.io.InputStream
import java.util.Map
import org.eclipse.xtext.parser.IParseResult
import ac.soton.bsharp.bSharp.TopLevel

class BSharpResource extends LazyLinkingResource {
	override doLoad(InputStream inputStream, Map<?, ?> options) throws IOException {
		setEncodingFromOptions(options)
		var IParseResult result;
		if (entryPoint === null) {
			result = parser.parse(createReader(inputStream));
		} else {
			result = parser.parse(entryPoint, createReader(inputStream));
		}
		
		val fileNameFull = uri.segments.last.toString()
		(result.rootASTElement as TopLevel).topLevelFile.name = fileNameFull.substring(0, fileNameFull.lastIndexOf('.'))
		
		updateInternalState(this.parseResult, result);
	}
}