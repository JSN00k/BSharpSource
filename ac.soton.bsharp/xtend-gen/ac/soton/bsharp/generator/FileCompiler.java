package ac.soton.bsharp.generator;

import ac.soton.bsharp.bSharp.BSClass;
import ac.soton.bsharp.bSharp.BodyElements;
import ac.soton.bsharp.bSharp.ClassDecl;
import ac.soton.bsharp.bSharp.ConstructedType;
import ac.soton.bsharp.bSharp.Datatype;
import ac.soton.bsharp.bSharp.Extend;
import ac.soton.bsharp.bSharp.PolyContext;
import ac.soton.bsharp.bSharp.PolyType;
import ac.soton.bsharp.bSharp.SuperTypeList;
import ac.soton.bsharp.theory.util.TheoryImportCache;
import ac.soton.bsharp.theory.util.TheoryUtils;
import com.google.common.base.Objects;
import java.util.HashMap;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eventb.core.ast.extension.IOperatorProperties;
import org.eventb.theory.core.INewOperatorDefinition;
import org.eventb.theory.core.ITheoryRoot;
import org.eventb.theory.core.ITypeParameter;

/**
 * Does the work to compile to a single EventB file from the body elements in
 * that file
 */
@SuppressWarnings("all")
public class FileCompiler {
  protected IProgressMonitor nullMonitor = new NullProgressMonitor();
  
  /**
   * This is used to suffix Event-B type variables it results in Event-B code like T : T_EvB
   */
  protected String EventBTypeSuffix = "_EvB";
  
  private final BodyElements elements;
  
  private final TheoryImportCache theoryCache;
  
  private final ITheoryRoot thy;
  
  /**
   * Maps the name of a Type parameter to the type paramenter,
   * allowing the reuse of type parameters.
   */
  private HashMap<String, ITypeParameter> polyTypeMap = new HashMap<String, ITypeParameter>();
  
  public FileCompiler(final BodyElements elem, final TheoryImportCache cache) {
    this.elements = elem;
    this.theoryCache = cache;
    this.thy = cache.theory;
  }
  
  public void compile() {
    EList<EObject> _eContents = this.elements.eContents();
    for (final EObject element : _eContents) {
      if ((element instanceof BSClass)) {
        this.compileBSClass(((BSClass) element));
      } else {
        if ((element instanceof Datatype)) {
          this.compileDatatype(((Datatype) element));
        } else {
          this.compileExtend(((Extend) element));
        }
      }
    }
  }
  
  public void compileBSClass(final BSClass bsClass) {
    try {
      INewOperatorDefinition op = TheoryUtils.createOperator(this.thy, bsClass.getName(), false, false, IOperatorProperties.FormulaType.EXPRESSION, IOperatorProperties.Notation.PREFIX, null, this.nullMonitor);
      String opString = "{ ";
      final PolyContext context = bsClass.getContext();
      if ((context != null)) {
        this.createPolyTypesFromPolyContext(bsClass.getContext(), opString, op);
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void compileDatatype(final Datatype datatype) {
    String _name = datatype.getName();
    boolean _equals = Objects.equal(_name, "Pred");
    if (_equals) {
      return;
    }
  }
  
  public Object compileExtend(final Extend extend) {
    return null;
  }
  
  /**
   * -------------------------------------------------------------------
   */
  public void createPolyTypesFromPolyContext(final PolyContext context, final String opString, final INewOperatorDefinition op) {
    try {
      EList<PolyType> _polyTypes = context.getPolyTypes();
      for (final PolyType polyType : _polyTypes) {
        {
          final String name = polyType.getName();
          final ITypeParameter typeParam = this.polyTypeMap.get(name);
          if ((typeParam == null)) {
            final ITypeParameter newTypeParam = TheoryUtils.createTypeParameter(this.thy, (name + this.EventBTypeSuffix), null, this.nullMonitor);
            this.polyTypeMap.put(polyType.getName(), newTypeParam);
          }
          TheoryUtils.createArgument(op, name, ((("ℙ(" + name) + this.EventBTypeSuffix) + ")"), null, this.nullMonitor);
          final EList<ClassDecl> superTypes = polyType.getSuperTypes();
          if ((superTypes != null)) {
            for (final ClassDecl supertype : superTypes) {
              String _name = supertype.getName();
              String _name_1 = supertype.getName();
              String _plus = (_name_1 + "(");
              String _plus_1 = (_plus + name);
              String _plus_2 = (_plus_1 + ")");
              TheoryUtils.createArgument(op, _name, _plus_2, null, this.nullMonitor);
            }
          }
        }
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void compileSuperTypes(final SuperTypeList superTypeList) {
    EList<ConstructedType> _superTypes = superTypeList.getSuperTypes();
    for (final ConstructedType constructedType : _superTypes) {
    }
  }
}
