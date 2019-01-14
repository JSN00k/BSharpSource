package ac.soton.bsharp.typeInstanceRepresentation;

import java.util.ArrayList;

import org.eclipse.emf.ecore.EObject;

import ac.soton.bsharp.bSharp.BSClass;
import ac.soton.bsharp.bSharp.ClassDecl;
import ac.soton.bsharp.bSharp.Datatype;
import ac.soton.bsharp.bSharp.TypedVariable;
import ac.soton.bsharp.bSharp.util.CompilationUtil;
import ac.soton.bsharp.bSharp.util.Tuple2;

public class StringTypeInstance extends TypeInstanceAbstract implements ITypeInstanceOpArgs {
	
	protected ClassDecl classDecl;
	protected ArrayList<Tuple2<String, String>> constructingTypesTyped;
	protected ArrayList<String> constructingTypesAndVariables = null;
	protected ArrayList<String> constructingTypesNames = null;
	protected String instanceName;
	
	protected String baseTypeString;
	
	public StringTypeInstance(ClassDecl decl, ArrayList<Tuple2<String, String>> constrTypes, String instName, EObject context) {
		this.context = context;
		classDecl = decl;
		constructingTypesTyped = constrTypes;
		instanceName = instName;
		this.baseTypeString = baseTypeString;
	}

	@Override
	public ClassDecl bSharpType() {
		return classDecl;
	}
	
	@Override
	public String baseTypeString() {
		if (baseTypeString == null) {
			baseTypeString = constructingTypesTyped.get(constructingTypesTyped.size() - 1).x;
		}
		
		return baseTypeString;
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
		return constructingTypesTyped.get(constructingTypesTyped.size() - 1).x;
	}

	@Override
	public String eventBTypeInstanceForType(ClassDecl type) {
		int prjsRequired;
		if (type instanceof Datatype && classDecl instanceof Datatype) {
			return eventBTypeInstance();
		}
		
		if (type instanceof Datatype) {
			prjsRequired = ((BSClass)classDecl).prjsRequiredForBaseType();
		} else {
			prjsRequired = ((BSClass)classDecl).prjsRequiredForSupertype((BSClass)type);
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
	
	@Override
	public String compiledTypeVariable(TypedVariable typedVariable) {
		ClassDecl bSharpType = bSharpType();
		String getterOp = ((BSClass)bSharpType).getterForOpName(typedVariable.getName()) + "(";
		
		getterOp += CompilationUtil.compileTypedVariablesToNameListWithSeparator(typingStatementForInstance(), ", ", true) + ")";
		return getterOp;
	}
}
