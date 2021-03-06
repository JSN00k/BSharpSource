package ac.soton.bsharp.scoping;

import ac.soton.bsharp.bSharp.BSClass;
import ac.soton.bsharp.bSharp.ClassDecl;
import ac.soton.bsharp.bSharp.ConstructedType;
import ac.soton.bsharp.bSharp.Datatype;
import ac.soton.bsharp.bSharp.DatatypeConstructor;
import ac.soton.bsharp.bSharp.ExpressionVariable;
import ac.soton.bsharp.bSharp.Extend;
import ac.soton.bsharp.bSharp.FunctionCall;
import ac.soton.bsharp.bSharp.FunctionDecl;
import ac.soton.bsharp.bSharp.GenName;
import ac.soton.bsharp.bSharp.IPolyTypeProvider;
import ac.soton.bsharp.bSharp.IVariableProvider;
import ac.soton.bsharp.bSharp.InstName;
import ac.soton.bsharp.bSharp.Instance;
import ac.soton.bsharp.bSharp.MatchCase;
import ac.soton.bsharp.bSharp.MatchStatement;
import ac.soton.bsharp.bSharp.PolyType;
import ac.soton.bsharp.bSharp.ReferencingFunc;
import ac.soton.bsharp.bSharp.TopLevel;
import ac.soton.bsharp.bSharp.TopLevelInstance;
import ac.soton.bsharp.bSharp.TypeBuilder;
import ac.soton.bsharp.bSharp.TypedVariable;
import ac.soton.bsharp.bSharp.impl.FunctionCallImpl;
import ac.soton.bsharp.bSharp.util.CompilationUtil;
import ac.soton.bsharp.bSharp.util.FunctionValidatorUtil;
import ac.soton.bsharp.util.EcoreUtilJ;
import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class BSharpScopeProvider extends AbstractDeclarativeScopeProvider {
  public IScope scope_TopLevelFile(final EObject context, final EReference reference) {
    IScope scope = this.delegateGetScope(context, reference);
    return scope;
  }
  
  public IScope scope_GenName(final EObject context, final EReference reference) {
    IScope parent = this.delegateGetScope(context, reference);
    IScope polyScope = this.getPolyScopeFor(context, parent);
    EObject typeContainer = null;
    if ((context instanceof TopLevel)) {
      typeContainer = context;
    } else {
      final Function1<EObject, Boolean> _function = (EObject obj) -> {
        return Boolean.valueOf((obj instanceof TopLevel));
      };
      typeContainer = EcoreUtilJ.eContainerMatchingLambda(context, _function);
    }
    final EObject typeContainerFinal = typeContainer;
    final EObject rootElement = EcoreUtil2.getRootContainer(context);
    final Function1<EObject, Boolean> _function_1 = (EObject object) -> {
      return Boolean.valueOf(Objects.equal(object, typeContainerFinal));
    };
    final Function1<EObject, Boolean> _function_2 = (EObject object) -> {
      return Boolean.valueOf((object instanceof ClassDecl));
    };
    ArrayList<? extends EObject> _eFilterUpToWith = EcoreUtilJ.eFilterUpToWith(rootElement, _function_1, _function_2);
    ArrayList<GenName> elements = ((ArrayList<GenName>) _eFilterUpToWith);
    final BSClass bsClass = EcoreUtil2.<BSClass>getContainerOfType(context, BSClass.class);
    if ((bsClass != null)) {
      elements.add(bsClass.getInstName());
    }
    final Extend extend = EcoreUtil2.<Extend>getContainerOfType(context, Extend.class);
    if ((extend != null)) {
      final ClassDecl extendedClass = extend.getExtendedClass();
      if ((extendedClass instanceof BSClass)) {
        elements.add(((BSClass) extendedClass).getInstName());
      }
    }
    return Scopes.scopeFor(elements, polyScope);
  }
  
  public IScope scope_ClassDecl(final EObject context, final EReference reference) {
    final IScope parent = this.delegateGetScope(context, reference);
    final EObject rootObj = EcoreUtil2.getRootContainer(context);
    final Function1<EObject, Boolean> _function = (EObject object) -> {
      return Boolean.valueOf(Objects.equal(object, context));
    };
    final Function1<EObject, Boolean> _function_1 = (EObject object) -> {
      return Boolean.valueOf((object instanceof ClassDecl));
    };
    ArrayList<? extends EObject> typeNames = EcoreUtilJ.eFilterUpToIncludingWith(rootObj, _function, _function_1);
    return Scopes.scopeFor(typeNames, parent);
  }
  
  public IScope scopeGetterExpressionVariable(final EObject ctx, final GenName genName, final EReference reference) {
    if ((genName instanceof ClassDecl)) {
      final HashSet<ExpressionVariable> inscope = FunctionValidatorUtil.allInscopeExpressionVariablesAssociatedWithClass(ctx, ((ClassDecl) genName));
      return Scopes.scopeFor(inscope);
    }
    if ((genName instanceof InstName)) {
      final BSClass clss = EcoreUtil2.<BSClass>getContainerOfType(genName, BSClass.class);
      final HashSet<ExpressionVariable> inscope_1 = FunctionValidatorUtil.allInscopeExpressionVariablesAssociatedWithClass(ctx, clss);
      return Scopes.scopeFor(inscope_1);
    }
    if ((genName instanceof PolyType)) {
      final PolyType polyType = ((PolyType) genName);
      final EList<ClassDecl> superTypes = polyType.getSuperTypes();
      if (((superTypes != null) && (!superTypes.isEmpty()))) {
        HashSet<ExpressionVariable> variables = new HashSet<ExpressionVariable>();
        for (final ClassDecl superClass : superTypes) {
          variables.addAll(FunctionValidatorUtil.allInscopeExpressionVariablesAssociatedWithClass(ctx, superClass));
        }
        return Scopes.scopeFor(variables);
      }
    }
    return IScope.NULLSCOPE;
  }
  
  public IScope scope_ExpressionVariable(final EObject context, final EReference reference) {
    if ((((context instanceof FunctionCall) && Objects.equal(reference.getName(), "typeInst")) && (((FunctionCallImpl) context).basicGetGetter() != null))) {
      IScope result = this.scope_GenName(context, reference);
      ClassDecl classDecl = CompilationUtil.getClassDecl(context);
      final HashSet<ExpressionVariable> classTypedVars = FunctionValidatorUtil.allInscopeExpressionVariablesAssociatedWithClass(context, classDecl);
      return Scopes.scopeFor(classTypedVars, result);
    }
    if (((context instanceof FunctionCall) && Objects.equal(reference.getName(), "getter"))) {
      final ExpressionVariable typeInst = ((FunctionCall) context).getTypeInst();
      if ((typeInst != null)) {
        GenName genName = null;
        if ((typeInst instanceof TypedVariable)) {
          genName = ((TypedVariable) typeInst).getType().getClassDecl();
        } else {
          if ((typeInst instanceof ConstructedType)) {
            genName = ((ConstructedType) typeInst).getClassDecl();
          } else {
            if ((typeInst instanceof PolyType)) {
              genName = ((PolyType) typeInst);
            }
          }
        }
        if ((genName != null)) {
          return this.scopeGetterExpressionVariable(context, genName, reference);
        }
        return IScope.NULLSCOPE;
      }
      if ((!(typeInst instanceof ConstructedType))) {
        return IScope.NULLSCOPE;
      }
      return this.scopeGetterExpressionVariable(context, ((ConstructedType) typeInst).getClassDecl(), reference);
    }
    final HashSet<ExpressionVariable> inscope = FunctionValidatorUtil.allInscopeExpressionVariables(context);
    if ((inscope == null)) {
      return IScope.NULLSCOPE;
    } else {
      return Scopes.scopeFor(inscope);
    }
  }
  
  public IScope scope_TypedVariable(final MatchCase context, final EReference reference) {
    final IScope parent = IScope.NULLSCOPE;
    EObject _eContainer = context.eContainer();
    final Datatype datatype = EcoreUtil2.<Datatype>getContainerOfType(((MatchStatement) _eContainer).getMatch(), Datatype.class);
    if ((datatype != null)) {
      final List<DatatypeConstructor> matches = EcoreUtil2.<DatatypeConstructor>getAllContentsOfType(datatype, DatatypeConstructor.class);
      return Scopes.scopeFor(matches, parent);
    }
    return parent;
  }
  
  public IScope scope_DatatypeConstructor(final MatchCase context, final EReference reference) {
    final MatchStatement matchStatement = EcoreUtil2.<MatchStatement>getContainerOfType(context, MatchStatement.class);
    final TypeBuilder wrappedDType = matchStatement.getMatch().calculateType();
    boolean _isDatatype = wrappedDType.isDatatype();
    boolean _not = (!_isDatatype);
    if (_not) {
      return IScope.NULLSCOPE;
    }
    final Datatype dType = wrappedDType.getDatatype();
    final EList<DatatypeConstructor> elements = dType.getConstructors();
    return Scopes.scopeFor(elements, IScope.NULLSCOPE);
  }
  
  public IScope scope_IClassInstance(final Instance context, final EReference ref) {
    ArrayList<EObject> classInstances = new ArrayList<EObject>();
    ClassDecl associatedClassTmp = null;
    final TopLevelInstance container = EcoreUtil2.<TopLevelInstance>getContainerOfType(context, TopLevelInstance.class);
    if ((container instanceof ClassDecl)) {
      associatedClassTmp = ((ClassDecl) container);
    } else {
      associatedClassTmp = ((Extend) container).getExtendedClass();
    }
    final ClassDecl associatedClass = associatedClassTmp;
    classInstances.add(associatedClass);
    final Function1<EObject, Boolean> _function = (EObject e) -> {
      if ((e instanceof Extend)) {
        return Boolean.valueOf(((Extend) e).getExtendedClass().equals(associatedClass));
      }
      return Boolean.valueOf(false);
    };
    classInstances.addAll(CompilationUtil.filterInscopeBSharpBlocks(context, _function));
    return Scopes.scopeFor(classInstances);
  }
  
  public List<FunctionDecl> getImportedFuncs(final EObject context) {
    final List<TopLevelInstance> topLevels = CompilationUtil.getAllImportedTopLevelInstances(context);
    final ArrayList<FunctionDecl> importedFuncs = CollectionLiterals.<FunctionDecl>newArrayList();
    for (final TopLevelInstance topLevel : topLevels) {
      List<FunctionDecl> _allContentsOfType = EcoreUtil2.<FunctionDecl>getAllContentsOfType(topLevel, FunctionDecl.class);
      Iterables.<FunctionDecl>addAll(importedFuncs, _allContentsOfType);
    }
    return importedFuncs;
  }
  
  /**
   * I'm not sure that this function will get called above the scope_ExpressionVariable
   * function, so it may be necessary to move this logic into the scope_ExpressionVariable.
   * I definitely need to implement logic like this for datatype constructors and destructors.
   */
  public IScope scope_FunctionDecl(final ReferencingFunc context, final EReference ref) {
    final IScope parent = this.scope_ExpressionVariable(context, ref);
    List<FunctionDecl> importedFuncs = this.getImportedFuncs(context);
    Scopes.scopeFor(importedFuncs, parent);
    return parent;
  }
  
  public IScope scope_InfixFunc(final EObject context, final EReference ref) {
    final ArrayList<FunctionDecl> functions = CollectionLiterals.<FunctionDecl>newArrayList();
    ArrayList<FunctionDecl> _eFindAllInstancesBefore = EcoreUtilJ.<FunctionDecl>eFindAllInstancesBefore(context, FunctionDecl.class);
    Iterables.<FunctionDecl>addAll(functions, _eFindAllInstancesBefore);
    List<FunctionDecl> _importedFuncs = this.getImportedFuncs(context);
    Iterables.<FunctionDecl>addAll(functions, _importedFuncs);
    final Function1<FunctionDecl, Boolean> _function = (FunctionDecl object) -> {
      String _infix = object.getInfix();
      return Boolean.valueOf(Objects.equal(_infix, "INFIX"));
    };
    Iterable<FunctionDecl> result = IterableExtensions.<FunctionDecl>filter(functions, _function);
    return Scopes.scopeFor(result);
  }
  
  public IScope getPolyScopeFor(final EObject context, final IScope parent) {
    final Function1<EObject, Boolean> _function = (EObject obj) -> {
      return Boolean.valueOf((obj instanceof IPolyTypeProvider));
    };
    EObject _eContainerMatchingLambda = EcoreUtilJ.eContainerMatchingLambda(context, _function);
    final IPolyTypeProvider polyProvider = ((IPolyTypeProvider) _eContainerMatchingLambda);
    if ((polyProvider == null)) {
      return parent;
    }
    final IScope parentScope = this.getPolyScopeFor(((EObject) polyProvider), parent);
    if ((parentScope == null)) {
      return Scopes.scopeFor(polyProvider.getPolyTypeNames());
    } else {
      return Scopes.scopeFor(polyProvider.getPolyTypeNames(), parentScope);
    }
  }
  
  public IScope getVariableScopeIncludingForCtxInclusive(final EObject ctx, final IScope scope) {
    final IScope parentScope = this.getVariableScopeFor(ctx, scope);
    if ((ctx instanceof IVariableProvider)) {
      final IVariableProvider varProv = ((IVariableProvider) ctx);
      final Collection<ExpressionVariable> variableNames = varProv.getVariablesNames();
      if ((variableNames == null)) {
        return parentScope;
      } else {
        return Scopes.scopeFor(variableNames, parentScope);
      }
    }
    return parentScope;
  }
  
  public IScope getVariableScopeFor(final EObject context, final IScope parent) {
    final Function1<EObject, Boolean> _function = (EObject obj) -> {
      return Boolean.valueOf((obj instanceof IVariableProvider));
    };
    EObject _eContainerMatchingLambda = EcoreUtilJ.eContainerMatchingLambda(context, _function);
    final IVariableProvider variableProvider = ((IVariableProvider) _eContainerMatchingLambda);
    if ((variableProvider == null)) {
      return parent;
    }
    final IScope parentScope = this.getVariableScopeFor(((EObject) variableProvider), parent);
    Collection<ExpressionVariable> _variablesNames = variableProvider.getVariablesNames();
    boolean _tripleEquals = (_variablesNames == null);
    if (_tripleEquals) {
      return parentScope;
    }
    if ((parentScope == null)) {
      return Scopes.scopeFor(variableProvider.getVariablesNames());
    } else {
      return Scopes.scopeFor(variableProvider.getVariablesNames(), parentScope);
    }
  }
}
