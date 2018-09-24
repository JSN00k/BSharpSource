package ac.soton.bsharp.scoping;

import ac.soton.bsharp.EcoreUtilJ;
import ac.soton.bsharp.bSharp.ClassDecl;
import ac.soton.bsharp.bSharp.Datatype;
import ac.soton.bsharp.bSharp.IPolyTypeProvider;
import ac.soton.bsharp.bSharp.TopLevel;
import com.google.common.base.Objects;
import java.util.ArrayList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;
import org.eclipse.xtext.xbase.lib.Functions.Function1;

@SuppressWarnings("all")
public class BSharpDeclarativeScopProvider extends AbstractDeclarativeScopeProvider {
  public IScope scope_GenName(final EObject context, final EReference reference) {
    final IScope parent = super.getScope(context, reference);
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
    ArrayList<? extends EObject> elements = null;
    if ((typeContainer instanceof Datatype)) {
      final Function1<EObject, Boolean> _function_1 = (EObject object) -> {
        return Boolean.valueOf(Objects.equal(object, typeContainerFinal));
      };
      final Function1<EObject, Boolean> _function_2 = (EObject object) -> {
        return Boolean.valueOf((object instanceof ClassDecl));
      };
      elements = EcoreUtilJ.eFilterUpToIncludingWith(rootElement, _function_1, _function_2);
    } else {
      final Function1<EObject, Boolean> _function_3 = (EObject object) -> {
        return Boolean.valueOf(Objects.equal(object, typeContainerFinal));
      };
      final Function1<EObject, Boolean> _function_4 = (EObject object) -> {
        return Boolean.valueOf((object instanceof ClassDecl));
      };
      elements = EcoreUtilJ.eFilterUpToWith(rootElement, _function_3, _function_4);
    }
    return Scopes.scopeFor(elements, polyScope);
  }
  
  public IScope scope_ClassDecl(final EObject context, final EReference reference) {
    final IScope parent = super.getScope(context, reference);
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
}
