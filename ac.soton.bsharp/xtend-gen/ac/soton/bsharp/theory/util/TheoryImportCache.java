package ac.soton.bsharp.theory.util;

import ac.soton.bsharp.bSharp.ClassDecl;
import ac.soton.bsharp.bSharp.TopLevel;
import ac.soton.bsharp.bSharp.TopLevelFile;
import ac.soton.bsharp.bSharp.TopLevelImport;
import ac.soton.bsharp.theory.util.TheoryUtils;
import ac.soton.bsharp.util.EcoreUtilJ;
import ch.ethz.eventb.utils.EventBUtils;
import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.ArrayList;
import java.util.HashMap;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eventb.core.IEventBProject;
import org.eventb.theory.core.DatabaseUtilities;
import org.eventb.theory.core.IImportTheoryProject;
import org.eventb.theory.core.ITheoryRoot;
import org.eventb.theory.core.ITypeParameter;
import org.rodinp.core.IRodinProject;

/**
 * A subclass of the TheoryRoot that keeps various additional references in
 * memory to easy the creation of Thy files without unnecessary additional
 * saving and deploying.
 */
@SuppressWarnings("all")
public class TheoryImportCache {
  protected IProgressMonitor nullMonitor = new NullProgressMonitor();
  
  /**
   * This is used to suffix Event-B type variables it results in Event-B code like T : T_EvB
   */
  protected String EventBTypeSuffix = "_EvB";
  
  /**
   * Stores the names of thys that have already been imported as
   * fully qualified names proj.fileName
   */
  private ArrayList<String> alreadyImported;
  
  /**
   * Keeps references to the in memory import blocks (imports are blocked by
   * project) allowing them to be easily appended to.
   */
  public HashMap<String, IImportTheoryProject> thyImportBlocks;
  
  public final ITheoryRoot theory;
  
  private final String localProjName;
  
  /**
   * It is not necessary to create new eventB poly types for every new
   * use of a polytypes. This dictionary keeps references to previously
   * created Event-B polytypes by their names.
   */
  private HashMap<String, ITypeParameter> polyTypeMap = new HashMap<String, ITypeParameter>();
  
  /**
   * This class is designed to be used in conjunction with the BSharpGenerator
   * to cache additional information about the TheoryRoot in memory. prevTheory
   * is used when more than one theory file is created for a single BSharp file,
   * the later files need to import their previous file, this is what is contained
   * in prevTheory.
   */
  public TheoryImportCache(final ITheoryRoot thy, final String projName, final TheoryImportCache prevTheory) {
    this.theory = thy;
    this.localProjName = projName;
    HashMap<String, IImportTheoryProject> _hashMap = new HashMap<String, IImportTheoryProject>();
    this.thyImportBlocks = _hashMap;
    ArrayList<String> _arrayList = new ArrayList<String>();
    this.alreadyImported = _arrayList;
    if ((prevTheory != null)) {
      this.importLocalTheoryCache(prevTheory);
    }
    String _componentName = thy.getComponentName();
    String _plus = ((projName + ".") + _componentName);
    this.alreadyImported.add(_plus);
  }
  
  public void importThyFromProjectWithName(final ITheoryRoot thy, final String projName) {
    try {
      String _componentName = thy.getComponentName();
      final String fqn = ((projName + ".") + _componentName);
      boolean _contains = this.alreadyImported.contains(fqn);
      if (_contains) {
        return;
      }
      final IEventBProject eventBProj = EventBUtils.getEventBProject(projName);
      final IRodinProject rodinProj = eventBProj.getRodinProject();
      final IImportTheoryProject importBlock = this.getImportBlockForProj(projName, rodinProj);
      TheoryUtils.createImportTheory(importBlock, thy, this.nullMonitor);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public boolean importLocalTheoryCache(final TheoryImportCache thyCache) {
    boolean _xblockexpression = false;
    {
      this.importThyFromProjectWithName(thyCache.theory, this.localProjName);
      _xblockexpression = Iterables.<String>addAll(this.alreadyImported, thyCache.alreadyImported);
    }
    return _xblockexpression;
  }
  
  public void importLocalTheoryWithName(final String thyName) {
    try {
      final IImportTheoryProject localProjBlock = this.thyImportBlocks.get(this.localProjName);
      if ((localProjBlock == null)) {
        final IImportTheoryProject localBlock = TheoryUtils.createImportTheoryProject(this.theory, this.theory.getRodinProject(), this.nullMonitor);
        this.thyImportBlocks.put(this.localProjName, localBlock);
      }
      this.importTheoryWithNameFromProjectWithName(thyName, this.localProjName);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void importTheoryWithNameFromProjectWithName(final String thyName, final String projName) {
    try {
      final String fqn = ((projName + ".") + thyName);
      boolean _contains = this.alreadyImported.contains(fqn);
      if (_contains) {
        return;
      }
      final IEventBProject eventBProj = EventBUtils.getEventBProject(projName);
      final IRodinProject rodinProj = eventBProj.getRodinProject();
      final IImportTheoryProject importBlock = this.getImportBlockForProj(projName, rodinProj);
      final ITheoryRoot thyRoot = DatabaseUtilities.getTheory(thyName, rodinProj);
      TheoryUtils.createImportTheory(importBlock, thyRoot, this.nullMonitor);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * Finds an instance of the type to be imported and imports the theory of that type
   */
  public void importTheoryForTypeNameInTree(final String typeName, final EObject tree) {
    final Function1<EObject, Boolean> _function = (EObject eObj) -> {
      EList<EObject> _eCrossReferences = eObj.eCrossReferences();
      for (final EObject crossRef : _eCrossReferences) {
        if (((crossRef instanceof ClassDecl) && Objects.equal(((ClassDecl) crossRef).getName(), typeName))) {
          return Boolean.valueOf(true);
        }
      }
      return Boolean.valueOf(false);
    };
    final EObject container = EcoreUtilJ.getObjectMatchingLambda(tree, _function);
    final Function1<EObject, Boolean> _function_1 = (EObject obj) -> {
      return Boolean.valueOf(((obj instanceof ClassDecl) && Objects.equal(((ClassDecl) obj).getName(), typeName)));
    };
    final EObject classDecl = IterableExtensions.<EObject>findFirst(container.eCrossReferences(), _function_1);
    final TopLevel topLevel = EcoreUtil2.<TopLevel>getContainerOfType(classDecl, TopLevel.class);
    String _name = topLevel.getName();
    final String projName = (_name + "-gen");
    String fileName = null;
    final TopLevelFile topLevelFile = topLevel.getTopLevelFile();
    final String bSharpFileName = topLevelFile.getName();
    final EList<TopLevelImport> imports = topLevelFile.getTopLevelImports();
    if (((imports == null) || imports.isEmpty())) {
      fileName = bSharpFileName;
    } else {
      int fileNdx = 0;
      if (((topLevelFile.getNoImportElements() != null) && (!topLevelFile.getNoImportElements().isEmpty()))) {
        fileNdx = 1;
      }
      final TopLevelImport topLevelImport = EcoreUtil2.<TopLevelImport>getContainerOfType(classDecl, TopLevelImport.class);
      if ((topLevelImport == null)) {
        String _string = Integer.valueOf(0).toString();
        String _plus = (bSharpFileName + _string);
        fileName = _plus;
      } else {
        TopLevelImport _last = IterableExtensions.<TopLevelImport>last(imports);
        boolean _tripleEquals = (_last == topLevelImport);
        if (_tripleEquals) {
          fileName = bSharpFileName;
        } else {
          int _indexOf = imports.indexOf(topLevelImport);
          String _string_1 = Integer.valueOf((_indexOf + fileNdx)).toString();
          String _plus_1 = (bSharpFileName + _string_1);
          fileName = _plus_1;
        }
      }
    }
    this.importTheoryWithNameFromProjectWithName(fileName, projName);
  }
  
  public IImportTheoryProject getImportBlockForProj(final String projName, final IRodinProject rodProj) {
    try {
      IImportTheoryProject importBlock = this.thyImportBlocks.get(projName);
      if ((importBlock != null)) {
        return importBlock;
      }
      boolean _exists = rodProj.exists();
      boolean _not = (!_exists);
      if (_not) {
        InputOutput.<String>print(("Roin project unexpectedly doesn\'t exist, presuamably it has not " + "been deployed after comilation"));
      }
      importBlock = TheoryUtils.createImportTheoryProject(this.theory, rodProj, this.nullMonitor);
      this.thyImportBlocks.put(projName, importBlock);
      return importBlock;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void save() {
    try {
      this.theory.getRodinFile().save(this.nullMonitor, true);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * If an Event-B polytype for that name already exists that polytype is returned
   * otherwise a new polytype is created and added to the cache.
   */
  public String getEventBTypeParamNameForName(final String name) {
    try {
      final String typeParamName = (name + this.EventBTypeSuffix);
      final ITypeParameter polytype = this.polyTypeMap.get(name);
      if ((polytype != null)) {
        return typeParamName;
      }
      final ITypeParameter typeParam = TheoryUtils.createTypeParameter(this.theory, typeParamName, null, this.nullMonitor);
      this.polyTypeMap.put(name, typeParam);
      return typeParamName;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
