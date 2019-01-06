package ac.soton.bsharp.typeInstanceRepresentation;

import java.util.ArrayList;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Functions.Function1;

import ac.soton.bsharp.bSharp.BSClass;
import ac.soton.bsharp.bSharp.ClassDecl;
import ac.soton.bsharp.bSharp.IClassInstance;
import ac.soton.bsharp.bSharp.Instance;
import ac.soton.bsharp.bSharp.util.CompilationUtil;
import ac.soton.bsharp.bSharp.util.Tuple2;

/* This could be changed into a Concrete type instance that contains a type, and a concrete type instance that contains
 * an Instance.
 */
public class ConcreteTypeInstance implements ITypeInstance {
	
	protected IClassInstance type;
	
	public ConcreteTypeInstance(IClassInstance t) {
		type = t;
	}

	@Override
	public ClassDecl bSharpType() {
		if (type instanceof ClassDecl)
			return (ClassDecl)type;
		else 
			return ((Instance)type).getBaseType();
	}

	@Override
	public ArrayList<String> typeConstructionTypes() {
		ArrayList<String> result = new ArrayList<String>();
		result.add(bSharpType().getName());
		return result;
	}

	@Override
	public String eventBTypeInstance() {
		return bSharpType().getName();
	}

	@Override
	public String eventBTypeInstanceForType(ClassDecl otherType, EObject context) {
		/* If the IClassInstance is a Instance then the first thing to do is check the hierarchy 
		 * of the Instance before checking if there is a possible default type instance that could be used.
		 */
		if (type instanceof Instance) {
			BSClass bsClass = ((Instance)type).getClassName();
			
			if (bsClass.isSuperType(otherType)) {
				ITypeInstance typeInst = ((Instance)type).getTypeInstance();
				return typeInst.eventBTypeInstanceForType(otherType, context);
			}
		}
		
		/* This isn't going to worry about finding an exact match for the other type instead it will
		 * just find the first subtype that uses that extends the class.
		 */
		Instance defaultInst = (Instance) CompilationUtil.findFirstInSupertypeScope(context, new Function1<EObject, Boolean>() {
			
			@Override
			public Boolean apply(EObject p) {
				if (p instanceof Instance) {
					Instance pInst = (Instance)p;
					return pInst.getContext() instanceof BSClass && ((BSClass)type).isSuperType(pInst.getClassName());
				}
				
				return false;
			}
		});
		
		return defaultInst.getTypeInstance().eventBTypeInstanceForType(otherType, context);
	}

	@Override
	public ArrayList<Tuple2<String, String>> typingStatementForInstance() {
		/* Not sure that this is ever used in this instance. As I'm not currently
		 * supporting methods on concrete types.
		 */
		return null;
	}

	@Override
	public ArrayList<String> typeAndVariableNames() {
		/* Not currently sure what to do here. Hopefully it will become clear when I start 
		 * compiling these things!
		 */
		return null;
	}

}
