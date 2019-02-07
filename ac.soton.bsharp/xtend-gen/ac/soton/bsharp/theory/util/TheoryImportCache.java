package ac.soton.bsharp.theory.util;

import ac.soton.bsharp.bSharp.TopLevelImport;
import ac.soton.bsharp.bSharp.util.ComparatorHashSet;
import ac.soton.bsharp.bSharp.util.EventBFQNImport;
import ac.soton.bsharp.theory.util.TheoryUtils;
import ch.ethz.eventb.utils.EventBUtils;
import java.util.HashMap;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function2;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eventb.core.IEventBProject;
import org.eventb.theory.core.DatabaseUtilities;
import org.eventb.theory.core.IImportTheory;
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
  private ComparatorHashSet<EventBFQNImport> alreadyImported;
  
  private final Function2<EventBFQNImport, Object, Boolean> comparator = ((Function2<EventBFQNImport, Object, Boolean>) (EventBFQNImport containedObj, Object other) -> {
    if ((!(other instanceof EventBFQNImport))) {
      return Boolean.valueOf(false);
    }
    return Boolean.valueOf(containedObj.isInferredImporterOf(((EventBFQNImport) other)));
  });
  
  /**
   * Keeps references to the in memory import blocks (imports are blocked by
   * project) allowing them to be easily appended to.
   */
  public HashMap<String, IImportTheoryProject> thyImportBlocks;
  
  public final ITheoryRoot theory;
  
  public final EventBFQNImport evBFQN;
  
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
  public TheoryImportCache(final IRodinProject proj, final EventBFQNImport evBFqn, final TheoryImportCache prevTheory) {
    try {
      this.evBFQN = evBFqn;
      this.theory = TheoryUtils.createTheory(proj, evBFqn.fileName(), null);
      HashMap<String, IImportTheoryProject> _hashMap = new HashMap<String, IImportTheoryProject>();
      this.thyImportBlocks = _hashMap;
      if ((prevTheory != null)) {
        Object _clone = prevTheory.alreadyImported.clone();
        this.alreadyImported = ((ComparatorHashSet<EventBFQNImport>) _clone);
        this.importEventBFQNInternal(prevTheory.evBFQN);
      } else {
        ComparatorHashSet<EventBFQNImport> _comparatorHashSet = new ComparatorHashSet<EventBFQNImport>(this.comparator);
        this.alreadyImported = _comparatorHashSet;
      }
      this.alreadyImported.add(evBFqn);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public TheoryImportCache(final IRodinProject proj, final TopLevelImport imports, final EventBFQNImport fileFQN, final TheoryImportCache prevTheory) {
    try {
      this.evBFQN = fileFQN;
      this.theory = TheoryUtils.createTheory(proj, fileFQN.fileName(), null);
      HashMap<String, IImportTheoryProject> _hashMap = new HashMap<String, IImportTheoryProject>();
      this.thyImportBlocks = _hashMap;
      if ((prevTheory != null)) {
        Object _clone = prevTheory.alreadyImported.clone();
        this.alreadyImported = ((ComparatorHashSet<EventBFQNImport>) _clone);
      } else {
        ComparatorHashSet<EventBFQNImport> _comparatorHashSet = new ComparatorHashSet<EventBFQNImport>(this.comparator);
        this.alreadyImported = _comparatorHashSet;
      }
      ComparatorHashSet<EventBFQNImport> newImports = new ComparatorHashSet<EventBFQNImport>(this.comparator);
      imports.addAllEventBImportsToNewImports(this.alreadyImported, newImports);
      if (((prevTheory != null) && (!this.alreadyImported.contains(prevTheory.evBFQN)))) {
        this.alreadyImported.add(prevTheory.evBFQN);
        newImports.add(prevTheory.evBFQN);
      }
      for (final EventBFQNImport imp : newImports) {
        this.importEventBFQNInternal(imp);
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * Only call if you're certain that this has not already been imported.
   * DOES NOT CHECK AGAINST ALREADY IMPORTED
   */
  private IImportTheory importEventBFQNInternal(final EventBFQNImport fqn) {
    try {
      IImportTheory _xblockexpression = null;
      {
        final IEventBProject evBProj = EventBUtils.getEventBProject(fqn.getProjName());
        final IRodinProject rodProj = evBProj.getRodinProject();
        final IImportTheoryProject importBlock = this.getImportBlockForProj(fqn, rodProj);
        final ITheoryRoot thyRoot = DatabaseUtilities.getTheory(fqn.fileName(), rodProj);
        _xblockexpression = TheoryUtils.createImportTheory(importBlock, thyRoot, this.nullMonitor);
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * Finds an instance of the type to be imported and imports the theory of that type
   */
  public IImportTheoryProject getImportBlockForProj(final EventBFQNImport fqn, final IRodinProject rodProj) {
    try {
      final String projName = fqn.getProjName();
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
