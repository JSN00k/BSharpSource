package ac.soton.bsharp.generator;

import ac.soton.bsharp.bSharp.BSClass;
import ac.soton.bsharp.bSharp.BodyElements;
import ac.soton.bsharp.bSharp.Datatype;
import ac.soton.bsharp.bSharp.util.CompilationUtil;
import ac.soton.bsharp.theory.util.TheoryImportCache;
import org.eclipse.core.resources.IWorkspaceRunnable;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.rodinp.core.RodinCore;

/**
 * Does the work to compile to a single EventB file from the body elements in
 * that file
 */
@SuppressWarnings("all")
public class FileCompiler {
  private final BodyElements elements;
  
  public FileCompiler(final BodyElements elem) {
    this.elements = elem;
  }
  
  public void compile() {
    try {
      final IWorkspaceRunnable wsRunnable = new IWorkspaceRunnable() {
        @Override
        public void run(final IProgressMonitor monitor) throws CoreException {
          try {
            TheoryImportCache theoryCache = CompilationUtil.getTheoryCacheForElement(FileCompiler.this.elements);
            EList<EObject> _eContents = FileCompiler.this.elements.eContents();
            for (final EObject element : _eContents) {
              if ((element instanceof BSClass)) {
                final BSClass bsClass = ((BSClass) element);
                bsClass.compile();
              } else {
                if ((element instanceof Datatype)) {
                  final Datatype datatype = ((Datatype) element);
                  datatype.compile();
                } else {
                }
              }
            }
            theoryCache.save();
          } catch (Throwable _e) {
            throw Exceptions.sneakyThrow(_e);
          }
        }
      };
      NullProgressMonitor _nullProgressMonitor = new NullProgressMonitor();
      RodinCore.run(wsRunnable, _nullProgressMonitor);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
