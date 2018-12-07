package ac.soton.bsharp.bSharp.util;

public class MapletStringLeaf implements IMapletNode {
	String name;
	
	public MapletStringLeaf(String n) {
		name = n;
	}
	
	@Override
	public String compileToString() {
		return name;
	}
}
