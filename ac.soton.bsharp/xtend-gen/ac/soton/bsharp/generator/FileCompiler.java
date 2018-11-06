package ac.soton.bsharp.generator;

import ac.soton.bsharp.bSharp.BSClass;
import ac.soton.bsharp.bSharp.BodyElements;
import ac.soton.bsharp.bSharp.Datatype;
import java.util.HashMap;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eventb.theory.core.ITypeParameter;

/**
 * Does the work to compile to a single EventB file from the body elements in
 * that file
 */
@SuppressWarnings("all")
public class FileCompiler {
  protected IProgressMonitor nullMonitor = new NullProgressMonitor();
  
  protected String EventBTypeSuffix = "_EvB";
  
  private final BodyElements elements;
  
  /**
   * Maps the name of a Type parameter to the type paramenter,
   * allowing the reuse of type parameters.
   */
  private HashMap<String, ITypeParameter> polyTypeMap = new HashMap<String, ITypeParameter>();
  
  public FileCompiler(final BodyElements elem) {
    this.elements = elem;
  }
  
  public void compile() {
    try {
      EList<EObject> _eContents = this.elements.eContents();
      for (final EObject element : _eContents) {
        if ((element instanceof BSClass)) {
          final BSClass bsClass = ((BSClass) element);
          bsClass.compile();
        } else {
          if ((element instanceof Datatype)) {
          } else {
          }
        }
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
