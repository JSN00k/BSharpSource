package ac.soton.bsharp.util;

import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.xbase.lib.Functions.Function1;

@SuppressWarnings("all")
public class EcoreUtilJ extends EcoreUtil2 {
  /**
   * Finds the root of the current context and filters up to the current context using the filter
   */
  public static ArrayList<? extends EObject> eFilterUpToCurrentWith(final EObject context, final Function1<EObject, Boolean> filter) {
    final EObject root = EcoreUtil2.getRootContainer(context);
    final Function1<EObject, Boolean> _function = (EObject object) -> {
      return Boolean.valueOf(Objects.equal(object, context));
    };
    return EcoreUtilJ.eFilterUpToWith(root, _function, filter);
  }
  
  public static EObject eFindFirstWithRoot(final EObject root, final Function1<EObject, Boolean> filter) {
    final TreeIterator<EObject> iterable = root.eAllContents();
    while (iterable.hasNext()) {
      {
        EObject next = iterable.next();
        Boolean _apply = filter.apply(next);
        if ((_apply).booleanValue()) {
          return next;
        }
      }
    }
    return null;
  }
  
  public static EObject eFindFirstBeforeCurrent(final EObject context, final Function1<EObject, Boolean> filter) {
    final EObject root = EcoreUtil2.getRootContainer(context);
    final TreeIterator<EObject> iterable = root.eAllContents();
    boolean _hasNext = iterable.hasNext();
    boolean _not = (!_hasNext);
    if (_not) {
      return null;
    }
    EObject next = iterable.next();
    while ((!Objects.equal(next, context))) {
      {
        Boolean _apply = filter.apply(next);
        if ((_apply).booleanValue()) {
          return next;
        }
        boolean _hasNext_1 = iterable.hasNext();
        boolean _not_1 = (!_hasNext_1);
        if (_not_1) {
          return null;
        }
        next = iterable.next();
      }
    }
    return null;
  }
  
  public static ArrayList<? extends EObject> eFilterUpToIncludingCurrentWith(final EObject context, final Function1<EObject, Boolean> filter) {
    final EObject root = EcoreUtil2.getRootContainer(context);
    final Function1<EObject, Boolean> _function = (EObject object) -> {
      return Boolean.valueOf(Objects.equal(object, context));
    };
    return EcoreUtilJ.eFilterUpToIncludingWith(root, _function, filter);
  }
  
  public static ArrayList<? extends EObject> eFilterUpToWith(final EObject tree, final Function1<EObject, Boolean> stopFilter, final Function1<EObject, Boolean> objectFilter) {
    final TreeIterator<EObject> iterable = tree.eAllContents();
    final ArrayList<EObject> result = new ArrayList<EObject>();
    boolean _hasNext = iterable.hasNext();
    boolean _not = (!_hasNext);
    if (_not) {
      return result;
    }
    EObject next = iterable.next();
    while ((!(stopFilter.apply(next)).booleanValue())) {
      {
        Boolean _apply = objectFilter.apply(next);
        if ((_apply).booleanValue()) {
          result.add(next);
        }
        boolean _hasNext_1 = iterable.hasNext();
        boolean _not_1 = (!_hasNext_1);
        if (_not_1) {
          return result;
        }
        next = iterable.next();
      }
    }
    return result;
  }
  
  public static ArrayList<? extends EObject> eFilter(final EObject tree, final Function1<EObject, Boolean> filter) {
    final TreeIterator<EObject> iterable = tree.eAllContents();
    ArrayList<EObject> result = new ArrayList<EObject>();
    while (iterable.hasNext()) {
      {
        final EObject next = iterable.next();
        Boolean _apply = filter.apply(next);
        if ((_apply).booleanValue()) {
          result.add(next);
        }
      }
    }
    return result;
  }
  
  /**
   * This function iterates over the tree from left to right, and depth first. It will stop after
   * scanning the children of the deepest object that matches the stop filter even if a shallower match has been
   * found.
   */
  public static ArrayList<? extends EObject> eFilterUpToIncludingWith(final EObject tree, final Function1<EObject, Boolean> stopFilter, final Function1<EObject, Boolean> objectFilter) {
    ArrayList<EObject> resultArray = new ArrayList<EObject>();
    EcoreUtilJ.eFilterUpToIncludingWithInternal(tree, stopFilter, objectFilter, resultArray);
    return resultArray;
  }
  
  private static Boolean eFilterUpToIncludingWithInternal(final EObject tree, final Function1<EObject, Boolean> stopFilter, final Function1<EObject, Boolean> objectFilter, final ArrayList<EObject> result) {
    Boolean _apply = objectFilter.apply(tree);
    if ((_apply).booleanValue()) {
      result.add(tree);
    }
    final EList<EObject> contents = tree.eContents();
    if ((contents == null)) {
      return stopFilter.apply(tree);
    }
    final Iterator<EObject> iterable = tree.eContents().iterator();
    EObject next = null;
    do {
      {
        boolean _hasNext = iterable.hasNext();
        boolean _not = (!_hasNext);
        if (_not) {
          return Boolean.valueOf(false);
        }
        next = iterable.next();
        Boolean _eFilterUpToIncludingWithInternal = EcoreUtilJ.eFilterUpToIncludingWithInternal(next, stopFilter, objectFilter, result);
        if ((_eFilterUpToIncludingWithInternal).booleanValue()) {
          return Boolean.valueOf(true);
        }
      }
    } while((!(stopFilter.apply(next)).booleanValue()));
    return Boolean.valueOf(false);
  }
  
  public static <T extends EObject> ArrayList<T> eFindAllInstancesBefore(final EObject context, final Class<T> clazz) {
    final Function1<EObject, Boolean> _function = (EObject e) -> {
      return Boolean.valueOf(clazz.isInstance(e));
    };
    ArrayList<? extends EObject> _eFilterUpToCurrentWith = EcoreUtilJ.eFilterUpToCurrentWith(context, _function);
    return ((ArrayList<T>) _eFilterUpToCurrentWith);
  }
  
  /**
   * Does not scan the current object.
   */
  public static EObject eContainerMatchingLambda(final EObject context, final Function1<EObject, Boolean> criteria) {
    EObject _xblockexpression = null;
    {
      final EObject parent = context.eContainer();
      if ((parent == null)) {
        return null;
      }
      Boolean _apply = criteria.apply(parent);
      if ((_apply).booleanValue()) {
        return parent;
      }
      _xblockexpression = EcoreUtilJ.eContainerMatchingLambda(parent, criteria);
    }
    return _xblockexpression;
  }
  
  public static EObject getObjectMatchingLambda(final EObject context, final Function1<EObject, Boolean> criteria) {
    Boolean _apply = criteria.apply(context);
    if ((_apply).booleanValue()) {
      return context;
    }
    EList<EObject> _eContents = context.eContents();
    boolean _tripleEquals = (_eContents == null);
    if (_tripleEquals) {
      return null;
    }
    EList<EObject> _eContents_1 = context.eContents();
    for (final EObject child : _eContents_1) {
      {
        final EObject res = EcoreUtilJ.getObjectMatchingLambda(child, criteria);
        if ((res != null)) {
          return res;
        }
      }
    }
    return null;
  }
}
