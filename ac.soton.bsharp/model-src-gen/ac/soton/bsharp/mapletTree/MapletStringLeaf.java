package ac.soton.bsharp.mapletTree;

import java.util.ArrayList;

public class MapletStringLeaf implements IMapletNode {
	String name;
	
	public MapletStringLeaf(String n) {
		name = n;
	}
	
	@Override
	public String compileToString() {
		return name;
	}

	@Override
	public ArrayList<String> varNames() {
		ArrayList<String> result = new ArrayList<String>();
		result.add(name);
		return result;
	}

	@Override
	public void varNamesIntoArray(ArrayList<String> al) {
		al.add(name);
	}
}
