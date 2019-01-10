package ac.soton.bsharp.typeInstanceRepresentation;

import java.util.ArrayList;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Functions.Function1;

import ac.soton.bsharp.bSharp.BSClass;
import ac.soton.bsharp.bSharp.ClassDecl;
import ac.soton.bsharp.bSharp.Datatype;
import ac.soton.bsharp.bSharp.IClassInstance;
import ac.soton.bsharp.bSharp.Instance;
import ac.soton.bsharp.bSharp.util.CompilationUtil;
import ac.soton.bsharp.bSharp.util.Tuple2;
import ac.soton.bsharp.mapletTree.IMapletNode;
import ac.soton.bsharp.mapletTree.MapletTree;

public class ConcreteTypeInstance extends TypeInstanceAbstract implements ITypeInstance {
	
	protected IClassInstance type;
	/* the context is used to know what was in scope when this type variable was created. */
	protected EObject context;
	protected IMapletNode tree = null;
	
	public ConcreteTypeInstance(IClassInstance t, EObject context) {
		type = t;
		this.context = context;
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

	/* Slightly unsure what this should mean in this case, it is unclear without knowing what type 
	 * of class is wanted.
	 */
	@Override
	public String eventBTypeInstance() {
		if (type instanceof ClassDecl)
			return bSharpType().getName();
		
		return bSharpType().getName();
	}
	
	public IMapletNode getTree() {
		if (tree == null)
			tree = ((Instance)type).concreteInstanceMapletTree();
		
		return tree;
	}

	@Override
	public String eventBTypeInstanceForType(ClassDecl otherType) {
		/* If the IClassInstance is a Instance then the first thing to do is check the hierarchy 
		 * of the Instance before checking if there is a possible default type instance that could be used.
		 */
		if (type instanceof Instance) {
			BSClass bsClass = ((Instance)type).getClassName();
			
			if (bsClass == otherType) {
				return getTree().compileToString();
			}
			
			if (bsClass.isSuperType(otherType)) {
				IMapletNode tree = getTree();
				int prjsRequired;
				if (otherType instanceof Datatype) {
					prjsRequired = bsClass.prjsRequiredForBaseType();
				} else {
					prjsRequired = bsClass.prjsRequiredForSupertype((BSClass)otherType);
				}
				
				for (int i = 0; i < prjsRequired; ++i) {
					tree = ((MapletTree)tree).left;
				}
				
				return tree.compileToString();
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
		
		return defaultInst.getInferredTypeInstance(context).eventBTypeInstanceForType(otherType);
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
