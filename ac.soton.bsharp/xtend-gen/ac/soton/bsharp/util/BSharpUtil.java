package ac.soton.bsharp.util;

import ac.soton.bsharp.bSharp.BSClass;
import ac.soton.bsharp.bSharp.ClassDecl;
import ac.soton.bsharp.bSharp.ConstructedType;
import ac.soton.bsharp.bSharp.Datatype;
import ac.soton.bsharp.bSharp.GenName;
import ac.soton.bsharp.bSharp.SuperTypeList;
import ac.soton.bsharp.bSharp.TypeConstrBracket;
import ac.soton.bsharp.bSharp.TypeConstructor;
import com.google.common.collect.Iterables;
import java.util.ArrayList;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Conversions;

@SuppressWarnings("all")
public class BSharpUtil {
  /**
   * This function simply finds all of the supertypes. It doesn't do any work to
   * unify them.
   */
  public static void superClassesInternal(final BSClass c, final ArrayList<EObject> list) {
    final SuperTypeList superclasses = c.getSupertypes();
    EList<ConstructedType> _superTypes = superclasses.getSuperTypes();
    for (final ConstructedType superclass : _superTypes) {
      if ((superclass instanceof TypeConstructor)) {
        final GenName type = ((TypeConstructor) superclass).getTypeName();
        if (((type instanceof ConstructedType) || (type instanceof Datatype))) {
          int _length = ((Object[])Conversions.unwrapArray(superclasses.getSuperTypes(), Object.class)).length;
          boolean _notEquals = (_length != 1);
          if (_notEquals) {
            return;
          }
          boolean _contains = list.contains(type);
          boolean _not = (!_contains);
          if (_not) {
            list.add(type);
            return;
          }
        }
        if ((type instanceof BSClass)) {
          boolean _contains_1 = list.contains(type);
          boolean _not_1 = (!_contains_1);
          if (_not_1) {
            list.add(((ClassDecl) type));
            BSharpUtil.superClassesInternal(((BSClass) type), list);
          }
        }
      }
    }
  }
  
  public static ArrayList<EObject> expandConstraintTypes(final Collection<ClassDecl> constraints) {
    ArrayList<EObject> result = new ArrayList<EObject>();
    Iterables.<EObject>addAll(result, constraints);
    for (final ClassDecl superClass : constraints) {
      BSharpUtil.superClassesInternal(((BSClass) superClass), result);
    }
    return result;
  }
  
  public static ArrayList<EObject> superClasses(final BSClass c) {
    ArrayList<EObject> list = new ArrayList<EObject>();
    BSharpUtil.superClassesInternal(c, list);
    return list;
  }
  
  public static ConstructedType reverseLeftHandedConstructedType(final ConstructedType ct) {
    if ((ct instanceof TypeConstructor)) {
      return ct;
    }
    ConstructedType _left = ct.getLeft();
    if ((_left instanceof TypeConstructor)) {
      return ct;
    }
    if ((ct instanceof TypeConstrBracket)) {
      ((TypeConstrBracket)ct).setChild(BSharpUtil.reverseLeftHandedConstructedType(((TypeConstrBracket)ct).getChild()));
    }
    final ConstructedType left = ct.getLeft();
    final ConstructedType newLeft = left.getRight();
    left.setRight(ct);
    ct.setLeft(newLeft);
    return BSharpUtil.reverseLeftHandedConstructedType(left);
  }
}
