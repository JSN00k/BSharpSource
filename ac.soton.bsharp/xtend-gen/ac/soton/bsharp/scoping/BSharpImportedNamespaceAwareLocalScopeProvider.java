/**
 * generated by Xtext 2.12.0
 */
package ac.soton.bsharp.scoping;

import ac.soton.bsharp.EcoreUtilJ;
import ac.soton.bsharp.bSharp.BSharpPackage;
import ac.soton.bsharp.bSharp.ClassDecl;
import ac.soton.bsharp.bSharp.Datatype;
import ac.soton.bsharp.bSharp.Extend;
import ac.soton.bsharp.bSharp.FunctionName;
import ac.soton.bsharp.bSharp.GenName;
import ac.soton.bsharp.bSharp.IPolyTypeProvider;
import ac.soton.bsharp.bSharp.IVariableProvider;
import ac.soton.bsharp.bSharp.MatchCase;
import ac.soton.bsharp.bSharp.MatchStatement;
import ac.soton.bsharp.bSharp.PolyContext;
import ac.soton.bsharp.bSharp.PolymorphicTypeName;
import ac.soton.bsharp.bSharp.TypeConstructor;
import ac.soton.bsharp.bSharp.TypeName;
import com.google.common.base.Objects;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.scoping.impl.ImportNormalizer;
import org.eclipse.xtext.scoping.impl.ImportedNamespaceAwareLocalScopeProvider;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
@SuppressWarnings("all")
public class BSharpImportedNamespaceAwareLocalScopeProvider extends ImportedNamespaceAwareLocalScopeProvider {
  @Override
  public IScope getLocalElementsScope(final IScope parent, final EObject context, final EReference reference) {
    if (((context instanceof TypeConstructor) && Objects.equal(reference.getEReferenceType(), BSharpPackage.Literals.GEN_NAME))) {
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
        final IScope scope = Scopes.scopeFor(allElems, parent);
        return scope;
      }
    } else {
      EClass _eReferenceType = reference.getEReferenceType();
      boolean _equals = Objects.equal(_eReferenceType, BSharpPackage.Literals.TYPE_NAME);
      if (_equals) {
        final EObject rootObj = EcoreUtil2.getRootContainer(context);
        final Function1<EObject, Boolean> _function_4 = (EObject object) -> {
          return Boolean.valueOf(Objects.equal(object, context));
        };
        final Function1<EObject, Boolean> _function_5 = (EObject object) -> {
          return Boolean.valueOf((object instanceof TypeName));
        };
        ArrayList<? extends EObject> typeNames = EcoreUtilJ.eFilterUpToIncludingWith(rootObj, _function_4, _function_5);
        return Scopes.scopeFor(typeNames, parent);
      } else {
        EClass _eReferenceType_1 = reference.getEReferenceType();
        boolean _equals_1 = Objects.equal(_eReferenceType_1, BSharpPackage.Literals.EXPRESSION_VARIABLE);
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
          IScope scope_1 = this.getVariableScopeFor(context, parent);
          if ((scope_1 != null)) {
            return Scopes.scopeFor(functionNames, scope_1);
          } else {
            return Scopes.scopeFor(functionNames, parent);
          }
        } else {
          if ((Objects.equal(reference.getEReferenceType(), BSharpPackage.Literals.TYPED_VARIABLE) && (context instanceof MatchCase))) {
            EObject _eContainer_1 = context.eContainer();
            final Datatype datatype = EcoreUtil2.<Datatype>getContainerOfType(((MatchStatement) _eContainer_1).getMatch(), Datatype.class);
            if ((datatype != null)) {
              final ArrayList<EObject> allResults = new ArrayList<EObject>();
              return Scopes.scopeFor(allResults, parent);
            }
          } else {
            boolean _equals_2 = Objects.equal(reference, BSharpPackage.Literals.MATCH_CASE);
            if (_equals_2) {
              InputOutput.<EReference>print(reference);
            }
          }
        }
      }
    }
    return super.getLocalElementsScope(parent, context, reference);
  }
  
  @Override
  public List<ImportNormalizer> internalGetImportedNamespaceResolvers(final EObject context, final boolean ignoreCase) {
    List<ImportNormalizer> importedNamespaceResolvers = Lists.<ImportNormalizer>newArrayList();
    EList<EObject> eContents = context.eContents();
    for (final EObject child : eContents) {
      {
        final EStructuralFeature feature = child.eClass().getEStructuralFeature("imports");
        if (((feature != null) && String.class.equals(feature.getEType().getInstanceClass()))) {
          Object _eGet = child.eGet(feature);
          final EList<String> list = ((EList<String>) _eGet);
          for (final String importString : list) {
            {
              final ImportNormalizer resolver = this.createImportedNamespaceResolver(importString, ignoreCase);
              if ((resolver != null)) {
                importedNamespaceResolvers.add(resolver);
              }
            }
          }
        }
      }
    }
    return importedNamespaceResolvers;
  }
  
  /**
   * This method is overridden as imports are only from files imported above the
   * current location where this code is declared.
   */
  public IScope getVariableScopeFor(final EObject context, final IScope parent) {
    final Function1<EObject, Boolean> _function = (EObject obj) -> {
      return Boolean.valueOf((obj instanceof IVariableProvider));
    };
    EObject _eContainerMatchingLambda = EcoreUtilJ.eContainerMatchingLambda(context, _function);
    final IVariableProvider polyProvider = ((IVariableProvider) _eContainerMatchingLambda);
    if ((polyProvider == null)) {
      return null;
    }
    final IScope parentScope = this.getVariableScopeFor(((EObject) polyProvider), parent);
    Collection<EObject> _variablesNames = polyProvider.getVariablesNames();
    boolean _tripleEquals = (_variablesNames == null);
    if (_tripleEquals) {
      return parentScope;
    }
    if ((parentScope == null)) {
      return Scopes.scopeFor(polyProvider.getVariablesNames());
    } else {
      return Scopes.scopeFor(polyProvider.getVariablesNames(), parentScope);
    }
  }
  
  public IScope getTypeScope(final EObject context) {
    return null;
  }
  
  public IScope getPolyScopeFor(final EObject context, final IScope parent) {
    final Function1<EObject, Boolean> _function = (EObject obj) -> {
      return Boolean.valueOf((obj instanceof IVariableProvider));
    };
    EObject _eContainerMatchingLambda = EcoreUtilJ.eContainerMatchingLambda(context, _function);
    final IPolyTypeProvider variableProvider = ((IPolyTypeProvider) _eContainerMatchingLambda);
    if ((variableProvider == null)) {
      return null;
    }
    final IScope parentScope = this.getVariableScopeFor(((EObject) variableProvider), parent);
    if ((parentScope == null)) {
      return Scopes.scopeFor(variableProvider.getPolyTypeNames());
    } else {
      return Scopes.scopeFor(variableProvider.getPolyTypeNames(), parentScope);
    }
  }
}
