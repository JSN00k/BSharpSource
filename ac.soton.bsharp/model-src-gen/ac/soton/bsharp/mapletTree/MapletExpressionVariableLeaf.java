package ac.soton.bsharp.mapletTree;

import java.util.ArrayList;

import ac.soton.bsharp.bSharp.ExpressionVariable;

public class MapletExpressionVariableLeaf extends AbstractLeaf {
	
	ExpressionVariable exprVar;
	
	public MapletExpressionVariableLeaf(ExpressionVariable e) {
		exprVar = e;
	}

	@Override
	public String compileToString() {
		return exprVar.getName();
	}

	@Override
	public ArrayList<String> varNames() {
		ArrayList<String> result = new ArrayList<String>();
		result.add(compileToString());
		return result;
	}

	@Override
	public void varNamesIntoArray(ArrayList<String> al) {
		al.add(compileToString());
	}

}
