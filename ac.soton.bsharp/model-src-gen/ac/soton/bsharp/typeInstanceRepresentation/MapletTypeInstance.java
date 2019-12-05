package ac.soton.bsharp.typeInstanceRepresentation;

import java.util.ArrayList;

import org.eclipse.emf.ecore.EObject;

import ac.soton.bsharp.bSharp.BSClass;
import ac.soton.bsharp.bSharp.ClassDecl;
import ac.soton.bsharp.bSharp.Datatype;
import ac.soton.bsharp.bSharp.util.CompilationUtil;
import ac.soton.bsharp.bSharp.util.Tuple2;
import ac.soton.bsharp.mapletTree.IMapletNode;
import ac.soton.bsharp.mapletTree.MapletTree;

public class MapletTypeInstance extends TypeInstanceTreeAbstract implements ITypeInstance {
	
	protected IMapletNode tree;
	protected ArrayList<Tuple2<String, String>> typedVariableConstructorsTyped;
	protected ClassDecl classDecl;
	
	/* Contains the list of non-eventB type names e.g., T : POW(EVB_T) this will contain T without the type. */
	protected ArrayList<String> untypedTypes = null;
	
	public MapletTypeInstance(ClassDecl classDecl, ArrayList<Tuple2<String, String>> typedTypes, IMapletNode tree, EObject context) {
		this.context = context;
		this.classDecl = classDecl;
		typedVariableConstructorsTyped = typedTypes;
		this.tree = tree;
	}
	
	@Override
	public String toString() {
		return "MapletTypeInstance<Class = " + classDecl.getName() + " repr = " + getTree().compileToString() + ">";
	}
	
	@Override
	public IMapletNode getTree() {
		return tree;
	}

	@Override
	public ClassDecl bSharpType() {
		return classDecl;
	}

	@Override
	public ArrayList<String> typeConstructionTypes() {
		if (untypedTypes != null)
			return untypedTypes;
		
		untypedTypes = new ArrayList<String>();
		for (Tuple2<String, String> typedType : typedVariableConstructorsTyped)
			untypedTypes.add(typedType.x);
		
		return untypedTypes;
	}
	
	@Override
	public ArrayList<Tuple2<String, String>> typingStatementForInstance() {
		ArrayList<Tuple2<String, String>> result = new ArrayList<Tuple2<String,String>>(typedVariableConstructorsTyped);
		
		String argsForConstructor;
		if (typedVariableConstructorsTyped != null && !typedVariableConstructorsTyped.isEmpty()) {
			argsForConstructor = "(" + CompilationUtil.compileTypedVariablesToNameListWithSeparator(typedVariableConstructorsTyped, ", ", true) + ")";
		} else {
			argsForConstructor = "";
		}
		
		if (tree != null) {
			result.add(new Tuple2<String, String>(tree.compileToString(), classDecl.eventBPolymorphicTypeConstructorName() + argsForConstructor));
		}
		
		return result;
	}

	@Override
	public String eventBTypeInstance() {
		return tree.compileToString();
	}

	@Override
	public String eventBTypeInstanceForType(ClassDecl type) {
		if (type instanceof Datatype && classDecl instanceof Datatype) {
			return tree.compileToString();
		}
		
		int prjsRequired;
		if (type instanceof Datatype) {
			prjsRequired = ((BSClass)classDecl).prjsRequiredForBaseType();
		} else {
			prjsRequired = ((BSClass)classDecl).prjsRequiredForSupertype((BSClass)type);
		}
		
		IMapletNode t = tree;
		for (int i = 0; i < prjsRequired; ++i) {
			t = ((MapletTree)t).left;
		}
		
		return t.compileToString();
	}

	@Override
	public ArrayList<String> typeAndVariableNames() {
		ArrayList<String> result = new ArrayList<String>();
		
		for (Tuple2<String, String> typedType : typedVariableConstructorsTyped) {
			result.add(typedType.x);
		}
		
		if (tree != null) {
			/* The maptet tree includes the constructed type (base type) as its leftmost element, 
			 * when the tree.varNames() is called this becomes the first element in the array.
			 * This needs to be removed as it is also included in the typing information. 
			 */
			ArrayList<String> varNames = tree.varNames();
			if (varNames.size() > 1) {
				result.addAll(varNames.subList(1, varNames.size()));
			}
		}
		
		return result;
	}
	
	@Override
	public String baseTypeString() {
		ClassDecl classDecl = bSharpType();
		
		if (classDecl instanceof Datatype) {
			return eventBTypeInstance();
		}
		
		int prjsRequired = ((BSClass)classDecl).prjsRequiredForBaseType();
		
		IMapletNode currentNode = tree;
		for (int i = 0; i < prjsRequired; ++i) {
			currentNode = ((MapletTree)currentNode).left;
		}
		
		return currentNode.compileToString();
	}

}
