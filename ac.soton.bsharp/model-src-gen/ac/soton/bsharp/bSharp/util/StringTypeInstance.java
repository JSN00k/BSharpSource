package ac.soton.bsharp.bSharp.util;

import java.util.ArrayList;

import ac.soton.bsharp.bSharp.BSClass;
import ac.soton.bsharp.bSharp.ClassDecl;
import ac.soton.bsharp.bSharp.Datatype;

public class StringTypeInstance implements ITypeInstanceOpArgs {
	
	protected ClassDecl classDecl;
	protected ArrayList<Tuple2<String, String>> constructingTypesTyped;
	protected ArrayList<String> constructingTypesAndVariables = null;
	protected ArrayList<String> constructingTypesNames = null;
	protected String instanceName;
	
	public StringTypeInstance(ClassDecl decl, ArrayList<Tuple2<String, String>> constrTypes, String instName) {
		classDecl = decl;
		constructingTypesTyped = constrTypes;
		instanceName = instName;
	}

	@Override
	public ClassDecl bSharpType() {
		return classDecl;
	}
	
	@Override
	public ArrayList<String> typeAndVariableNames() {
		if (constructingTypesAndVariables == null) {
			constructingTypesAndVariables = new ArrayList<String>();
			for (Tuple2<String, String> typedArg : constructingTypesTyped) {
				constructingTypesAndVariables.add(typedArg.x);
			}
			
			constructingTypesAndVariables.add(instanceName);
		}
		
		return constructingTypesAndVariables;
	}

	@Override
	public ArrayList<String> typeConstructionTypes() {
		if (constructingTypesNames == null) {
			constructingTypesNames = new ArrayList<String>();
			for (Tuple2<String, String> typedArg : constructingTypesTyped) {
				constructingTypesNames.add(typedArg.x);
			}
			
			constructingTypesNames.add(instanceName);
		}
		
		return constructingTypesNames;
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
	public ArrayList<Tuple2<String, String>> typingStatementForInstance() {
		ArrayList<Tuple2<String, String>> result = new ArrayList<Tuple2<String,String>>(constructingTypesTyped);
		String argsForConstructor = "(" + CompilationUtil.compileTypedVariablesToNameListWithSeparator(constructingTypesTyped, ", ", true) + ")";
		
		result.add(new Tuple2<String, String>(instanceName, classDecl.eventBPolymorphicTypeConstructorName() + argsForConstructor));
		return result;
	}

	@Override
	public ArrayList<Tuple2<String, String>> individuallyTypedConstructionArgs() {
		return typingStatementForInstance();
	}


}
