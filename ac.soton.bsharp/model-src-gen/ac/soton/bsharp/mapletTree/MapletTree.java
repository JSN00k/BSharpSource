package ac.soton.bsharp.mapletTree;

import java.util.ArrayList;

public class MapletTree implements IMapletNode {
	public IMapletNode left;
	public IMapletNode right;
	
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

	@Override
	public IMapletNode appendNodeToLeft(IMapletNode node) {
		left = left.appendNodeToLeft(node);
		return this;
	}
	
	@Override
	public String toString() {
		return compileToString();
	}
}
