package ac.soton.bsharp.util;

import ac.soton.bsharp.bSharp.BSClass;
import ac.soton.bsharp.bSharp.ClassDecl;
import ac.soton.bsharp.bSharp.ConstructedType;
import ac.soton.bsharp.bSharp.Datatype;
import ac.soton.bsharp.bSharp.SuperTypeList;
import ac.soton.bsharp.bSharp.TypeConstructor;
import com.google.common.collect.Iterables;
import java.util.ArrayList;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class BSharpUtil {
  /**
   * Constructed types can be a genuine constructed type (e.g., they are created with a
   * type constructor), or they can act as a wrapper around a a Type Constructor (which
   * can simply be a type or a type constructor with arguments. This is because the
   * definition of a constructed type is:
   * 
   * ConstructedType:
   *   type+=TypeConstructor
   * 		(constructors+=('×' | '→' | '' | '' | '↔' | '⤖' | '⇸' | '↣' | '⤀' | '↠') type+=ConstructedType)?
   * ;
   * If there is nothing in the constructors section then there is only a Type Constructor wrapped in a ConstructedType
   * flatternConstructedType(ConstructedType t) unpacks the ConstructedType if it is just acting as a wrapper.
   */
  public static EObject flatternConstructedType(final ConstructedType t) {
    if (((t.getConstructors() == null) || t.getConstructors().isEmpty())) {
      EObject _head = IterableExtensions.<EObject>head(t.getType());
      return ((TypeConstructor) _head).getTypeName();
    }
    return t;
  }
  
  /**
   * This function simply finds all of the supertypes. It doesn't do any work to
   * unify them.
   */
  public static void superClassesInternal(final BSClass c, final ArrayList<EObject> list) {
    final SuperTypeList superclasses = c.getSupertypes();
    EList<ConstructedType> _superTypes = superclasses.getSuperTypes();
    for (final ConstructedType superclass : _superTypes) {
      {
        final EObject type = BSharpUtil.flatternConstructedType(superclass);
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
}
