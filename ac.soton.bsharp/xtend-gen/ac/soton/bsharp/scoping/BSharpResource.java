package ac.soton.bsharp.scoping;

import ac.soton.bsharp.bSharp.TopLevel;
import ac.soton.bsharp.bSharp.TopLevelFile;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.linking.lazy.LazyLinkingResource;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class BSharpResource extends LazyLinkingResource {
  @Override
  public void doLoad(final InputStream inputStream, final Map<?, ?> options) throws IOException {
    this.setEncodingFromOptions(options);
    IParseResult result = null;
    ParserRule _entryPoint = this.getEntryPoint();
    boolean _tripleEquals = (_entryPoint == null);
    if (_tripleEquals) {
      result = this.getParser().parse(this.createReader(inputStream));
    } else {
      result = this.getParser().parse(this.getEntryPoint(), this.createReader(inputStream));
    }
    final EObject rootAST = result.getRootASTElement();
    if ((rootAST != null)) {
      final String fileNameFull = IterableExtensions.<String>last(((Iterable<String>)Conversions.doWrapArray(this.uri.segments()))).toString();
      final TopLevelFile topLevelFile = ((TopLevel) rootAST).getTopLevelFile();
      if ((topLevelFile != null)) {
        topLevelFile.setName(fileNameFull.substring(0, fileNameFull.lastIndexOf(".")));
      }
    }
    this.updateInternalState(this.getParseResult(), result);
    if (((options != null) && Boolean.TRUE.equals(options.get(XtextResource.OPTION_RESOLVE_ALL)))) {
      EcoreUtil.resolveAll(this);
    }
  }
}
