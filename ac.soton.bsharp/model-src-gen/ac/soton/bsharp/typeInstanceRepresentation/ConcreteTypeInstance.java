package ac.soton.bsharp.typeInstanceRepresentation;

import java.util.ArrayList;

import ac.soton.bsharp.bSharp.ClassDecl;
import ac.soton.bsharp.bSharp.util.Tuple2;

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
