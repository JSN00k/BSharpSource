package ac.soton.bsharp.bSharp.util;

import java.util.ArrayList;

import ac.soton.bsharp.bSharp.BSClass;
import ac.soton.bsharp.bSharp.ClassDecl;
import ac.soton.bsharp.bSharp.Datatype;

public class StringTypeInstance implements ITypeInstance {
	
	protected ClassDecl classDecl;
	protected ArrayList<Tuple2<String, String>> constructingTypesTyped;
	protected ArrayList<String> constructingTypes = null;
	
	public StringTypeInstance(ClassDecl decl, ArrayList<Tuple2<String, String>> constrTypes) {
		classDecl = decl;
		constructingTypesTyped = constrTypes;
	}

	@Override
	public ClassDecl bSharpType() {
		return classDecl;
	}

	@Override
	public ArrayList<String> typeConstructionTypes() {
		if (constructingTypes == null) {
			constructingTypes = new ArrayList<String>();
			for (Tuple2<String, String> typedArg : constructingTypesTyped) {
				constructingTypes.add(typedArg.x);
			}
		}
		
		return constructingTypes;
	}

	@Override
	public String eventBTypeInstance() {
		return constructingTypesTyped.get(0).x;
	}

	@Override
	public String eventBTypeInstanceForType(ClassDecl type) {
		int prjsRequired;
		if (type instanceof Datatype && classDecl instanceof Datatype) {
			return eventBTypeInstance();
		}
		
		if (type instanceof Datatype) {
			prjsRequired = ((BSClass)type).prjsRequiredForBaseType();
		} else {
			prjsRequired = ((BSClass)type).prjsRequiredForSupertype((BSClass)classDecl);
		}
		
		return CompilationUtil.wrapNameInPrj1s(eventBTypeInstance(), prjsRequired);
	}

	@Override
	public ArrayList<Tuple2<String, String>> typeConstructionTypesTyped() {
		// TODO Auto-generated method stub
		return constructingTypesTyped;
	}

}
