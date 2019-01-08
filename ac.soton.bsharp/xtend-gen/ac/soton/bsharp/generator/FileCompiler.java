package ac.soton.bsharp.generator;

import ac.soton.bsharp.bSharp.TopLevelInstance;
import ac.soton.bsharp.bSharp.util.CompilationUtil;
import ac.soton.bsharp.theory.util.TheoryImportCache;
import org.eclipse.core.resources.IWorkspaceRunnable;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.rodinp.core.RodinCore;

/**
 * Does the work to compile to a single EventB file from the body elements in
 * that file
 */
@SuppressWarnings("all")
public class FileCompiler {
  private final EList<TopLevelInstance> elements;
  
  public FileCompiler(final EList<TopLevelInstance> elem) {
    this.elements = elem;
  }
  
  protected IProgressMonitor nullMonitor = new NullProgressMonitor();
  
  public void compile() {
    try {
      boolean _isEmpty = this.elements.isEmpty();
      if (_isEmpty) {
        return;
      }
      final IWorkspaceRunnable wsRunnable = new IWorkspaceRunnable() {
        @Override
        public void run(final IProgressMonitor monitor) throws CoreException {
          TheoryImportCache theoryCache = CompilationUtil.getTheoryCacheForElement(FileCompiler.this.elements.get(0));
          for (final TopLevelInstance element : FileCompiler.this.elements) {
            try {
              element.compile(FileCompiler.this.nullMonitor);
            } catch (final Throwable _t) {
              if (_t instanceof Exception) {
                final Exception exception = (Exception)_t;
                String _message = exception.getMessage();
                String _plus = ("Compilation failed with error: " + _message);
                System.err.println(_plus);
              } else {
                throw Exceptions.sneakyThrow(_t);
              }
            }
          }
          theoryCache.save();
        }
      };
      NullProgressMonitor _nullProgressMonitor = new NullProgressMonitor();
      RodinCore.run(wsRunnable, _nullProgressMonitor);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
