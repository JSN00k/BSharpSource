package ac.soton.bsharp.theory.util;

import ac.soton.bsharp.util.TheoryUtils;
import ch.ethz.eventb.utils.EventBUtils;
import com.google.common.collect.Iterables;
import java.util.ArrayList;
import java.util.HashMap;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eventb.core.IEventBProject;
import org.eventb.theory.core.DatabaseUtilities;
import org.eventb.theory.core.IImportTheoryProject;
import org.eventb.theory.core.ITheoryRoot;
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
   * This class is designed to be used in conjunction with the BSharpGenerator
   * to cache additional information about the TheoryRoot in memory. prevTheory
   * is used when more than one theory file is created for a single BSharp file,
   * the later files need to import their previous file, this is what is contained
   * in prevTheory.
   */
  public TheoryImportCache(final ITheoryRoot thy, final String projName, final TheoryImportCache prevTheory) {
    try {
      this.theory = thy;
      this.localProjName = projName;
      final IImportTheoryProject localBlock = TheoryUtils.createImportTheoryProject(this.theory, this.theory.getRodinProject(), this.nullMonitor);
      HashMap<String, IImportTheoryProject> _hashMap = new HashMap<String, IImportTheoryProject>();
      this.thyImportBlocks = _hashMap;
      this.thyImportBlocks.put(projName, localBlock);
      ArrayList<String> _arrayList = new ArrayList<String>();
      this.alreadyImported = _arrayList;
      if ((prevTheory != null)) {
        this.importLocalTheoryCache(prevTheory);
      }
      String _componentName = thy.getComponentName();
      String _plus = ((projName + ".") + _componentName);
      this.alreadyImported.add(_plus);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
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
    this.importTheoryWithNameFromProjectWithName(thyName, this.localProjName);
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
  
  public void saveAndDeploy() {
    try {
      this.theory.getRodinFile().save(this.nullMonitor, true);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
