package ac.soton.bsharp.bSharp.util;

import java.util.ArrayList;

import ac.soton.bsharp.bSharp.ClassDecl;

public class ConcreteTypeInstance implements ITypeInstance {
	
	protected ClassDecl type;
	
	public ConcreteTypeInstance(ClassDecl t) {
		type = t;
	}

	@Override
	public ClassDecl bSharpType() {
		return type;
	}

	@Override
	public ArrayList<String> typeConstructionTypes() {
		ArrayList<String> result = new ArrayList<String>();
		result.add(type.getName());
		return result;
	}

	@Override
	public ArrayList<Tuple2<String, String>> typeConstructionTypesTyped() {
		/* Not sure that this is ever used in this instance. As I'm not currently
		 * supporting methods on concrete types.
		 */
		return null;
	}

	@Override
	public String eventBTypeInstance() {
		return type.getName();
	}

	@Override
	public String eventBTypeInstanceForType(ClassDecl otherType) {
		if (otherType == type ||  otherType.getName().equals(type.getName())) {
			return type.getName();
		}
		
		return type.getName() + "_" + otherType.getName();
	}

}
