package ac.soton.bsharp.scoping;

import ac.soton.bsharp.bSharp.BSharpFactory;
import ac.soton.bsharp.bSharp.InbuiltInfix;
import ac.soton.bsharp.bSharp.TopLevel;
import ac.soton.bsharp.bSharp.TopLevelFile;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
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
  
  private ArrayList<InbuiltInfix> addedInbuilts = null;
  
  @Override
  public void doLinking() {
    ArrayList<InbuiltInfix> _arrayList = new ArrayList<InbuiltInfix>();
    this.addedInbuilts = _arrayList;
    Map<String, Integer> _infixPrecedenceMap = InbuiltInfix.getInfixPrecedenceMap();
    final Map<String, Integer> inbuiltPrecMap = ((Map<String, Integer>) _infixPrecedenceMap);
    Set<Map.Entry<String, Integer>> _entrySet = inbuiltPrecMap.entrySet();
    for (final Map.Entry<String, Integer> ib : _entrySet) {
      {
        InbuiltInfix inbuilt = BSharpFactory.eINSTANCE.createInbuiltInfix();
        inbuilt.setName(ib.getKey());
        inbuilt.setPrecedence((ib.getValue()).intValue());
        this.addedInbuilts.add(inbuilt);
        this.getContents().add(inbuilt);
      }
    }
    super.doLinking();
  }
}
