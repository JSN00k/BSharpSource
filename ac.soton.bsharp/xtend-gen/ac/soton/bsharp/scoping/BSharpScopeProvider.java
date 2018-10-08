package ac.soton.bsharp.scoping;

import ac.soton.bsharp.bSharp.BppClass;
import ac.soton.bsharp.bSharp.ClassDecl;
import ac.soton.bsharp.bSharp.Datatype;
import ac.soton.bsharp.bSharp.DatatypeConstructor;
import ac.soton.bsharp.bSharp.FunctionName;
import ac.soton.bsharp.bSharp.IPolyTypeProvider;
import ac.soton.bsharp.bSharp.IVariableProvider;
import ac.soton.bsharp.bSharp.MatchCase;
import ac.soton.bsharp.bSharp.MatchStatement;
import ac.soton.bsharp.bSharp.TopLevel;
import ac.soton.bsharp.bSharp.TypeStructure;
import ac.soton.bsharp.bSharp.TypedVariable;
import ac.soton.bsharp.util.BSharpUtil;
import ac.soton.bsharp.util.EcoreUtilJ;
import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;
import org.eclipse.xtext.xbase.lib.Functions.Function1;

@SuppressWarnings("all")
public class BSharpScopeProvider extends AbstractDeclarativeScopeProvider {
  public IScope scope_GenName(final EObject context, final EReference reference) {
    IScope parent = this.delegateGetScope(context, reference);
    IScope polyScope = this.getPolyScopeFor(context, parent);
    BppClass bppClass = EcoreUtil2.<BppClass>getContainerOfType(context, BppClass.class);
    ArrayList<TypedVariable> variables = new ArrayList<TypedVariable>();
    if ((bppClass != null)) {
      ArrayList<EObject> _superClasses = BSharpUtil.superClasses(bppClass);
      for (final EObject st : _superClasses) {
        TypeStructure _varList = bppClass.getVarList();
        boolean _tripleNotEquals = (_varList != null);
        if (_tripleNotEquals) {
          List<TypedVariable> _allContentsOfType = EcoreUtil2.<TypedVariable>getAllContentsOfType(bppClass.getVarList(), TypedVariable.class);
          Iterables.<TypedVariable>addAll(variables, _allContentsOfType);
        }
      }
      polyScope = Scopes.scopeFor(variables, polyScope);
    }
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
    final ArrayList<? extends EObject> elements = EcoreUtilJ.eFilterUpToIncludingWith(rootElement, _function_1, _function_2);
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
  
  public IScope scope_ExpressionVariable(final EObject context, final EReference reference) {
    final IScope parent = this.delegateGetScope(context, reference);
    final EObject rootObj = EcoreUtil2.getRootContainer(context);
    final ClassDecl currentClass = EcoreUtil2.<ClassDecl>getContainerOfType(context, ClassDecl.class);
    final Function1<EObject, Boolean> _function = (EObject object) -> {
      return Boolean.valueOf(Objects.equal(object, currentClass));
    };
    final Function1<EObject, Boolean> _function_1 = (EObject object) -> {
      return Boolean.valueOf((object instanceof FunctionName));
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
