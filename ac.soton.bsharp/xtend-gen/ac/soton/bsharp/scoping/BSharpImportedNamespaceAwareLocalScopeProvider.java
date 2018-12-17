/**
 * generated by Xtext 2.12.0
 */
package ac.soton.bsharp.scoping;

import ac.soton.bsharp.bSharp.FileImport;
import ac.soton.bsharp.bSharp.GlobalImport;
import ac.soton.bsharp.bSharp.LocalImport;
import ac.soton.bsharp.bSharp.TopLevel;
import ac.soton.bsharp.bSharp.TopLevelImport;
import com.google.common.base.Objects;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.scoping.impl.ImportNormalizer;
import org.eclipse.xtext.scoping.impl.ImportedNamespaceAwareLocalScopeProvider;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Extension;

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
@SuppressWarnings("all")
public class BSharpImportedNamespaceAwareLocalScopeProvider extends ImportedNamespaceAwareLocalScopeProvider {
  @Inject
  @Extension
  private IQualifiedNameProvider _iQualifiedNameProvider;
  
  @Override
  public List<ImportNormalizer> internalGetImportedNamespaceResolvers(final EObject context, final boolean ignoreCase) {
    List<ImportNormalizer> importedNamespaceResolvers = Lists.<ImportNormalizer>newArrayList();
    if ((context instanceof TopLevelImport)) {
      ArrayList<String> _arrayList = new ArrayList<String>();
      BSharpImportedNamespaceAwareLocalScopeProvider.importedFiles = _arrayList;
      TopLevelImport topLevelImport = ((TopLevelImport) context);
      final TopLevel topLevel = EcoreUtil2.<TopLevel>getContainerOfType(topLevelImport, TopLevel.class);
      final QualifiedName packageName = this._iQualifiedNameProvider.getFullyQualifiedName(topLevel);
      final EList<TopLevelImport> importBlocks = topLevel.getTopLevelFile().getTopLevelImports();
      final Iterator<TopLevelImport> iterator = importBlocks.iterator();
      TopLevelImport current = null;
      do {
        {
          current = iterator.next();
          this.addImportsForTopLevelImport(current, importedNamespaceResolvers, packageName, Boolean.valueOf(ignoreCase));
        }
      } while((!Objects.equal(current, context)));
    }
    return importedNamespaceResolvers;
  }
  
  public void addImportsForTopLevelImport(final TopLevelImport topLevel, final List<ImportNormalizer> importedNamespaceResolvers, final QualifiedName packageName, final Boolean ignoreCase) {
    final EList<LocalImport> localImports = topLevel.getLocalImports();
    final EList<GlobalImport> globalImports = topLevel.getGlobalImports();
    if ((localImports != null)) {
      for (final LocalImport localImport : localImports) {
        EList<FileImport> _fileImports = localImport.getFileImports();
        for (final FileImport import_ : _fileImports) {
          this.importFileImportForPackage(packageName.toString(), import_, importedNamespaceResolvers, ignoreCase);
        }
      }
    }
    if ((globalImports != null)) {
      for (final GlobalImport globalImport : globalImports) {
        {
          final String projName = globalImport.getProject();
          EList<FileImport> _fileImports_1 = globalImport.getFileImports();
          for (final FileImport fileImport : _fileImports_1) {
            this.importFileImportForPackage(projName, fileImport, importedNamespaceResolvers, ignoreCase);
          }
        }
      }
    }
  }
  
  public boolean importFileImportForPackage(final String pack, final FileImport fileImport, final List<ImportNormalizer> importedNamespaceResolvers, final Boolean ignoreCase) {
    boolean _xblockexpression = false;
    {
      this.addFileImport(pack, fileImport.getFileName(), importedNamespaceResolvers, ignoreCase);
      String importfileName = fileImport.getFileName();
      this.addFileImport(pack, importfileName, importedNamespaceResolvers, ignoreCase);
      String importString = (((pack + ".") + importfileName) + ".");
      String _type = fileImport.getType();
      boolean _tripleNotEquals = (_type != null);
      if (_tripleNotEquals) {
        String _importString = importString;
        String _type_1 = fileImport.getType();
        importString = (_importString + _type_1);
      } else {
        String _importString_1 = importString;
        importString = (_importString_1 + "*");
      }
      final ImportNormalizer resolver = this.createImportedNamespaceResolver(importString, (ignoreCase).booleanValue());
      boolean _xifexpression = false;
      if ((resolver != null)) {
        _xifexpression = importedNamespaceResolvers.add(resolver);
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  protected static ArrayList<String> importedFiles = null;
  
  public void addFileImport(final String pack, final String fileName, final List<ImportNormalizer> importedNamespaceResolvers, final Boolean ignoreCase) {
    final String importName = ((pack + ".") + fileName);
    boolean _contains = BSharpImportedNamespaceAwareLocalScopeProvider.importedFiles.contains(importName);
    if (_contains) {
      return;
    }
    BSharpImportedNamespaceAwareLocalScopeProvider.importedFiles.add(importName);
    final ImportNormalizer resolver = this.createImportedNamespaceResolver(importName, (ignoreCase).booleanValue());
    if ((resolver != null)) {
      importedNamespaceResolvers.add(resolver);
    }
  }
  
  @Override
  public List<ImportNormalizer> getImplicitImports(final boolean ignoreCase) {
    QualifiedName _create = QualifiedName.create("ac", "soton", "bsharp", "main");
    ImportNormalizer _importNormalizer = new ImportNormalizer(_create, true, ignoreCase);
    return CollectionLiterals.<ImportNormalizer>newArrayList(_importNormalizer);
  }
}
