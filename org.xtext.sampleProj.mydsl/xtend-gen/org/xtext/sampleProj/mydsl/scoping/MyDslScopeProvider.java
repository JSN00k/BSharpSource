/**
 * generated by Xtext 2.12.0
 */
package org.xtext.sampleProj.mydsl.scoping;

import com.google.common.base.Objects;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.xtext.sampleProj.mydsl.EcoreUtilJ;
import org.xtext.sampleProj.mydsl.myDsl.BppClass;
import org.xtext.sampleProj.mydsl.myDsl.ClassDecl;
import org.xtext.sampleProj.mydsl.myDsl.Datatype;
import org.xtext.sampleProj.mydsl.myDsl.Extend;
import org.xtext.sampleProj.mydsl.myDsl.FunctionDecl;
import org.xtext.sampleProj.mydsl.myDsl.FunctionName;
import org.xtext.sampleProj.mydsl.myDsl.GenName;
import org.xtext.sampleProj.mydsl.myDsl.MyDslPackage;
import org.xtext.sampleProj.mydsl.myDsl.PolyContext;
import org.xtext.sampleProj.mydsl.myDsl.PolymorphicTypeName;
import org.xtext.sampleProj.mydsl.myDsl.QuantLambda;
import org.xtext.sampleProj.mydsl.myDsl.TypeConstructor;
import org.xtext.sampleProj.mydsl.myDsl.TypeName;
import org.xtext.sampleProj.mydsl.myDsl.TypeStructure;
import org.xtext.sampleProj.mydsl.myDsl.TypedVariable;
import org.xtext.sampleProj.mydsl.scoping.AbstractMyDslScopeProvider;

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
@SuppressWarnings("all")
public class MyDslScopeProvider extends AbstractMyDslScopeProvider {
  private enum PolyOrVariable {
    POLY,
    
    VARIABLE;
  }
  
  @Override
  public IScope getScope(final EObject context, final EReference reference) {
    if (((context instanceof TypeConstructor) && Objects.equal(reference.getEReferenceType(), MyDslPackage.Literals.GEN_NAME))) {
      ClassDecl classDecl = EcoreUtil2.<ClassDecl>getContainerOfType(context, ClassDecl.class);
      if ((classDecl == null)) {
        final Extend extend = EcoreUtil2.<Extend>getContainerOfType(context, Extend.class);
        if ((extend != null)) {
          EObject _eContainer = extend.getName().eContainer();
          classDecl = ((ClassDecl) _eContainer);
        }
      }
      if ((classDecl != null)) {
        final ClassDecl finalClassDecl = classDecl;
        final ArrayList<GenName> allElems = new ArrayList<GenName>();
        PolyContext _context = classDecl.getContext();
        boolean _tripleNotEquals = (_context != null);
        if (_tripleNotEquals) {
          allElems.addAll(EcoreUtil2.<PolymorphicTypeName>getAllContentsOfType(classDecl.getContext(), PolymorphicTypeName.class));
        }
        final EObject rootElement = EcoreUtil2.getRootContainer(context);
        if ((classDecl instanceof Datatype)) {
          final Function1<EObject, Boolean> _function = (EObject object) -> {
            return Boolean.valueOf(Objects.equal(object, finalClassDecl));
          };
          final Function1<EObject, Boolean> _function_1 = (EObject object) -> {
            return Boolean.valueOf((object instanceof TypeName));
          };
          ArrayList<? extends EObject> _eFilterUpToIncludingWith = EcoreUtilJ.eFilterUpToIncludingWith(rootElement, _function, _function_1);
          allElems.addAll(((Collection<TypeName>) _eFilterUpToIncludingWith));
        } else {
          final Function1<EObject, Boolean> _function_2 = (EObject object) -> {
            return Boolean.valueOf(Objects.equal(object, finalClassDecl));
          };
          final Function1<EObject, Boolean> _function_3 = (EObject object) -> {
            return Boolean.valueOf((object instanceof TypeName));
          };
          ArrayList<? extends EObject> _eFilterUpToWith = EcoreUtilJ.eFilterUpToWith(rootElement, _function_2, _function_3);
          allElems.addAll(((Collection<TypeName>) _eFilterUpToWith));
        }
        final IScope scope = Scopes.scopeFor(allElems);
        return scope;
      }
    } else {
      EClass _eReferenceType = reference.getEReferenceType();
      boolean _equals = Objects.equal(_eReferenceType, MyDslPackage.Literals.TYPE_NAME);
      if (_equals) {
        final EObject rootObj = EcoreUtil2.getRootContainer(context);
        final Function1<EObject, Boolean> _function_4 = (EObject object) -> {
          return Boolean.valueOf(Objects.equal(object, context));
        };
        final Function1<EObject, Boolean> _function_5 = (EObject object) -> {
          return Boolean.valueOf((object instanceof TypeName));
        };
        ArrayList<? extends EObject> typeNames = EcoreUtilJ.eFilterUpToIncludingWith(rootObj, _function_4, _function_5);
        return Scopes.scopeFor(typeNames);
      } else {
        EClass _eReferenceType_1 = reference.getEReferenceType();
        boolean _equals_1 = Objects.equal(_eReferenceType_1, MyDslPackage.Literals.EXPRESSION_VARIABLE);
        if (_equals_1) {
          final EObject rootObj_1 = EcoreUtil2.getRootContainer(context);
          final ClassDecl currentClass = EcoreUtil2.<ClassDecl>getContainerOfType(context, ClassDecl.class);
          final Function1<EObject, Boolean> _function_6 = (EObject object) -> {
            return Boolean.valueOf(Objects.equal(object, currentClass));
          };
          final Function1<EObject, Boolean> _function_7 = (EObject object) -> {
            return Boolean.valueOf((object instanceof FunctionName));
          };
          ArrayList<? extends EObject> functionNames = EcoreUtilJ.eFilterUpToIncludingWith(rootObj_1, _function_6, _function_7);
          IScope scope_1 = this.getLocalVariableScopeForContext(context);
          if ((scope_1 != null)) {
            return Scopes.scopeFor(functionNames, scope_1);
          } else {
            return Scopes.scopeFor(functionNames);
          }
        } else {
          boolean _equals_2 = Objects.equal(reference, MyDslPackage.Literals.FUNC_INDUCTIVE__VARIABLE_NAME);
          if (_equals_2) {
            InputOutput.<EReference>print(reference);
          }
        }
      }
    }
    return super.getScope(context, reference);
  }
  
  public IScope getLocalVariableScopeForContext(final EObject context) {
    return this.getPolyOrVariableScopeFor(context, MyDslScopeProvider.PolyOrVariable.VARIABLE);
  }
  
  public IScope getPolymorphicScopeForContext(final EObject context) {
    return this.getPolyOrVariableScopeFor(context, MyDslScopeProvider.PolyOrVariable.POLY);
  }
  
  private IScope getPolyOrVariableScopeFor(final EObject context, final MyDslScopeProvider.PolyOrVariable polyOrVar) {
    Function1<EObject, List<? extends EObject>> nameGetter = ((Function1<EObject, List<? extends EObject>>) null);
    boolean _equals = Objects.equal(polyOrVar, MyDslScopeProvider.PolyOrVariable.VARIABLE);
    if (_equals) {
      final Function1<EObject, List<? extends EObject>> _function = (EObject object) -> {
        try {
          final Method method = object.getClass().getMethod("getVarList", null);
          Object _invoke = method.invoke(object, null);
          final EObject varList = ((EObject) _invoke);
          ArrayList<EObject> allResults = new ArrayList<EObject>();
          if ((varList != null)) {
            allResults.addAll(EcoreUtil2.<TypedVariable>getAllContentsOfType(varList, TypedVariable.class));
          }
          if ((object instanceof BppClass)) {
            allResults.add(((BppClass) object).getTypeName());
          }
          return allResults;
        } catch (Throwable _e) {
          throw Exceptions.sneakyThrow(_e);
        }
      };
      nameGetter = _function;
    } else {
      final Function1<EObject, List<? extends EObject>> _function_1 = (EObject object) -> {
        try {
          final Method method = object.getClass().getMethod("getContext", null);
          Object _invoke = method.invoke(object, null);
          final EObject polyContext = ((EObject) _invoke);
          if ((polyContext == null)) {
            return null;
          }
          return EcoreUtil2.<PolymorphicTypeName>getAllContentsOfType(polyContext, PolymorphicTypeName.class);
        } catch (Throwable _e) {
          throw Exceptions.sneakyThrow(_e);
        }
      };
      nameGetter = _function_1;
    }
    final Function1<EObject, Boolean> _function_2 = (EObject object) -> {
      return Boolean.valueOf(((((object instanceof QuantLambda) || (object instanceof FunctionDecl)) || (object instanceof BppClass)) || (object instanceof Extend)));
    };
    final EObject containerWithTypeVariable = EcoreUtilJ.eContainerMatchingLambda(context, _function_2);
    if ((containerWithTypeVariable == null)) {
      return null;
    }
    if ((containerWithTypeVariable instanceof Extend)) {
      final Extend extend = ((Extend) containerWithTypeVariable);
      EObject _eContainer = extend.getName().eContainer();
      if ((_eContainer instanceof BppClass)) {
        EObject _eContainer_1 = extend.getName().eContainer();
        final BppClass bppClass = ((BppClass) _eContainer_1);
        boolean _equals_1 = Objects.equal(polyOrVar, MyDslScopeProvider.PolyOrVariable.VARIABLE);
        if (_equals_1) {
          ArrayList<EObject> scopeVars = new ArrayList<EObject>();
          TypeStructure _varList = bppClass.getVarList();
          boolean _tripleNotEquals = (_varList != null);
          if (_tripleNotEquals) {
            scopeVars.addAll(EcoreUtil2.<TypedVariable>getAllContentsOfType(bppClass.getVarList(), TypedVariable.class));
          }
          scopeVars.add(bppClass.getTypeName());
          return Scopes.scopeFor(scopeVars);
        } else {
          return Scopes.scopeFor(EcoreUtil2.<PolymorphicTypeName>getAllContentsOfType(bppClass.getContext(), PolymorphicTypeName.class));
        }
      }
      return null;
    }
    final List<? extends EObject> names = nameGetter.apply(containerWithTypeVariable);
    final IScope parentScope = this.getPolyOrVariableScopeFor(containerWithTypeVariable, polyOrVar);
    if ((parentScope == null)) {
      if ((names == null)) {
        return null;
      } else {
        return Scopes.scopeFor(names);
      }
    } else {
      if ((names == null)) {
        return parentScope;
      } else {
        return Scopes.scopeFor(names, parentScope);
      }
    }
  }
}
