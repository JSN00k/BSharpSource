package ac.soton.bsharp.mapletTree;

import java.util.ArrayList;

public abstract class AbstractLeaf implements IMapletNode {
	
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
	
	@Override
	public IMapletNode appendNodeToLeft(IMapletNode node) {
		return new MapletTree(node, this);
	}
}
