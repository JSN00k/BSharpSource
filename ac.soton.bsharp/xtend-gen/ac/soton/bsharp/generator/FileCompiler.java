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
import ac.soton.bsharp.bSharp.TypeConstrBracket;
import ac.soton.bsharp.bSharp.TypeConstructor;
import ac.soton.bsharp.bSharp.TypeStructure;
import ac.soton.bsharp.theory.util.TheoryImportCache;
import ac.soton.bsharp.theory.util.TheoryUtils;
import ac.soton.bsharp.util.BSharpUtil;
import com.google.common.base.Objects;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eventb.core.ast.extension.IOperatorProperties;
import org.eventb.theory.core.IDirectOperatorDefinition;
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
  
  public IDirectOperatorDefinition compileBSClass(final BSClass bsClass) {
    try {
      IDirectOperatorDefinition _xblockexpression = null;
      {
        INewOperatorDefinition op = TheoryUtils.createOperator(this.thy, bsClass.getName(), false, false, IOperatorProperties.FormulaType.EXPRESSION, IOperatorProperties.Notation.PREFIX, null, this.nullMonitor);
        String opString = "{ ";
        final PolyContext context = bsClass.getContext();
        if ((context != null)) {
          this.createPolyTypesFromPolyContext(bsClass.getContext(), opString, op);
        }
        final SuperTypeList supertypes = bsClass.getSupertypes();
        if ((supertypes != null)) {
          opString = this.compileSuperTypes(bsClass, opString);
        }
        _xblockexpression = TheoryUtils.createDirectDefinition(op, opString, null, this.nullMonitor);
      }
      return _xblockexpression;
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
  
  public String compileSuperTypes(final BSClass bsClass, final String opString) {
    String resultString = opString;
    final SuperTypeList superTypeList = bsClass.getSupertypes();
    LinkedHashMap<String, String> typeStringForName = new LinkedHashMap<String, String>();
    EList<ConstructedType> _superTypes = superTypeList.getSuperTypes();
    for (final ConstructedType constructedType : _superTypes) {
      {
        ConstructedType reversed = EcoreUtil2.<ConstructedType>copy(constructedType);
        reversed = BSharpUtil.reverseLeftHandedConstructedType(reversed);
        if ((reversed instanceof TypeConstructor)) {
          typeStringForName.put(((TypeConstructor) reversed).getTypeName().getName(), this.compileConstructedType(reversed));
        } else {
          typeStringForName.put(bsClass.getName(), this.compileConstructedType(reversed));
        }
      }
    }
    boolean first = true;
    Set<String> _keySet = typeStringForName.keySet();
    for (final String name : _keySet) {
      {
        if (first) {
          String _resultString = resultString;
          resultString = (_resultString + name);
        } else {
          String _resultString_1 = resultString;
          resultString = (_resultString_1 + ("∧" + name));
        }
        first = false;
      }
    }
    TypeStructure _varList = bsClass.getVarList();
    boolean _tripleNotEquals = (_varList != null);
    if (_tripleNotEquals) {
      String _resultString = resultString;
      Object _compileVarListNames = this.compileVarListNames(bsClass.getVarList());
      resultString = (_resultString + _compileVarListNames);
    }
    String _resultString_1 = resultString;
    resultString = (_resultString_1 + "|");
    first = true;
    Set<String> _keySet_1 = typeStringForName.keySet();
    for (final String name_1 : _keySet_1) {
      {
        if ((!first)) {
          String _resultString_2 = resultString;
          resultString = (_resultString_2 + "∧");
        } else {
          first = false;
        }
        String _resultString_3 = resultString;
        String _get = typeStringForName.get(name_1);
        String _plus = ((name_1 + "∈") + _get);
        resultString = (_resultString_3 + _plus);
      }
    }
    TypeStructure _varList_1 = bsClass.getVarList();
    boolean _tripleNotEquals_1 = (_varList_1 != null);
    if (_tripleNotEquals_1) {
      String _resultString_2 = resultString;
      Object _compileVarListTyping = this.compileVarListTyping(bsClass.getVarList());
      resultString = (_resultString_2 + _compileVarListTyping);
    }
    return resultString;
  }
  
  public String compileConstructedType(final ConstructedType constrType) {
    if ((constrType instanceof TypeConstructor)) {
      return this.compileTypeConstructor(((TypeConstructor) constrType));
    }
    if ((constrType instanceof TypeConstrBracket)) {
      String _compileConstructedType = this.compileConstructedType(((TypeConstrBracket) constrType).getChild());
      String _plus = ("(" + _compileConstructedType);
      return (_plus + ")");
    }
    String _compileConstructedType_1 = this.compileConstructedType(constrType.getLeft());
    String _constructor = constrType.getConstructor();
    String _plus_1 = (_compileConstructedType_1 + _constructor);
    String _compileConstructedType_2 = this.compileConstructedType(constrType.getRight());
    return (_plus_1 + _compileConstructedType_2);
  }
  
  public String compileTypeConstructor(final TypeConstructor constr) {
    if (((constr.getContext() == null) || (((Object[])Conversions.unwrapArray(constr.getContext(), Object.class)).length == 0))) {
      String _name = constr.getTypeName().getName();
      boolean _equals = Objects.equal(_name, "Pred");
      if (_equals) {
        return "BOOL";
      }
      return constr.getTypeName().getName();
    }
    return "";
  }
  
  public Object compileVarListNames(final TypeStructure varList) {
    return null;
  }
  
  public Object compileVarListTyping(final TypeStructure varList) {
    return null;
  }
}
