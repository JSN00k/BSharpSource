package ac.soton.bsharp.scoping;

import ac.soton.bsharp.bSharp.BSClass;
import ac.soton.bsharp.bSharp.ClassDecl;
import ac.soton.bsharp.bSharp.ClassVarDecl;
import ac.soton.bsharp.bSharp.Datatype;
import ac.soton.bsharp.bSharp.DatatypeConstructor;
import ac.soton.bsharp.bSharp.ExpressionVariable;
import ac.soton.bsharp.bSharp.Extend;
import ac.soton.bsharp.bSharp.FunctionDecl;
import ac.soton.bsharp.bSharp.GenName;
import ac.soton.bsharp.bSharp.IPolyTypeProvider;
import ac.soton.bsharp.bSharp.IVariableProvider;
import ac.soton.bsharp.bSharp.MatchCase;
import ac.soton.bsharp.bSharp.MatchStatement;
import ac.soton.bsharp.bSharp.PolyType;
import ac.soton.bsharp.bSharp.TopLevel;
import ac.soton.bsharp.bSharp.TypeBuilder;
import ac.soton.bsharp.bSharp.TypedVariable;
import ac.soton.bsharp.bSharp.TypedVariableList;
import ac.soton.bsharp.util.BSharpUtil;
import ac.soton.bsharp.util.EcoreUtilJ;
import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;
import org.eclipse.xtext.xbase.lib.Functions.Function1;

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
  
  public IScope scope_ExpressionVariable(final ClassVarDecl ctx, final EReference reference) {
    GenName genName = ctx.getOwnerType();
    if ((genName instanceof PolyType)) {
      final PolyType polyType = ((PolyType) genName);
      if (((polyType.getSuperTypes() != null) && (!polyType.getSuperTypes().isEmpty()))) {
        final ArrayList<EObject> superClasses = BSharpUtil.expandConstraintTypes(polyType.getSuperTypes());
        IScope result = IScope.NULLSCOPE;
        for (final EObject superClass : superClasses) {
          result = this.getVariableScopeIncludingForCtxInclusive(superClass, result);
        }
        return result;
      }
    }
    return IScope.NULLSCOPE;
  }
  
  public IScope scope_ExpressionVariable(final EObject context, final EReference reference) {
    IScope parent = this.delegateGetScope(context, reference);
    ClassDecl classDecl = EcoreUtil2.<ClassDecl>getContainerOfType(context, ClassDecl.class);
    if ((classDecl == null)) {
      Extend extend = EcoreUtil2.<Extend>getContainerOfType(context, Extend.class);
      classDecl = extend.getExtendedClass();
    }
    ArrayList<ExpressionVariable> variables = new ArrayList<ExpressionVariable>();
    if ((classDecl != null)) {
      if ((classDecl instanceof BSClass)) {
        ArrayList<EObject> _superClasses = BSharpUtil.superClasses(((BSClass)classDecl));
        for (final EObject sc : _superClasses) {
          if ((sc instanceof BSClass)) {
            final BSClass superClass = ((BSClass) sc);
            TypedVariableList _varList = superClass.getVarList();
            boolean _tripleNotEquals = (_varList != null);
            if (_tripleNotEquals) {
              List<TypedVariable> _allContentsOfType = EcoreUtil2.<TypedVariable>getAllContentsOfType(superClass.getVarList(), TypedVariable.class);
              Iterables.<ExpressionVariable>addAll(variables, _allContentsOfType);
            }
          }
        }
      } else {
        EList<DatatypeConstructor> _constructors = ((Datatype) classDecl).getConstructors();
        Iterables.<ExpressionVariable>addAll(variables, _constructors);
      }
      parent = Scopes.scopeFor(variables, parent);
    }
    final EObject rootObj = EcoreUtil2.getRootContainer(context);
    final ClassDecl currentClass = EcoreUtil2.<ClassDecl>getContainerOfType(context, ClassDecl.class);
    final Function1<EObject, Boolean> _function = (EObject object) -> {
      return Boolean.valueOf(Objects.equal(object, currentClass));
    };
    final Function1<EObject, Boolean> _function_1 = (EObject object) -> {
      return Boolean.valueOf((object instanceof FunctionDecl));
    };
    ArrayList<? extends EObject> functionNames = EcoreUtilJ.eFilterUpToIncludingWith(rootObj, _function, _function_1);
    IScope scope = this.getVariableScopeFor(context, parent);
    scope = Scopes.scopeFor(functionNames, scope);
    return scope;
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
      final Collection<EObject> variableNames = varProv.getVariablesNames();
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
    Collection<EObject> _variablesNames = variableProvider.getVariablesNames();
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
