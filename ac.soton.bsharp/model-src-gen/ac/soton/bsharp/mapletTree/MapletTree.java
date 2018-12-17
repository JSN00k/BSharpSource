package ac.soton.bsharp.bSharp.util;

import java.util.ArrayList;

public class MapletTree implements IMapletNode {
	protected IMapletNode left;
	protected IMapletNode right;
	
	public MapletTree(IMapletNode l, IMapletNode r) {
		left = l;
		right = r;
	}
	
	@Override
	public String compileToString() {
		String result = left.compileToString() + " ↦ ";
		
		if (right instanceof MapletTree) {
			return result + "(" + right.compileToString() + ")";
		}
		
		return result + right.compileToString();
	}
	
	@Override
	public void varNamesIntoArray(ArrayList<String> al) {
		left.varNamesIntoArray(al);
		right.varNamesIntoArray(al);
	}

	@Override
	public ArrayList<String> varNames() {
		ArrayList<String> result = new ArrayList<String>();
		varNamesIntoArray(result);
		return result;
	}
}
