package ac.soton.bsharp.mapletTree;

public class MapletStringLeaf extends AbstractLeaf {
	String name;
	
	public MapletStringLeaf(String n) {
		name = n;
	}
	
	@Override
	public String compileToString() {
		return name;
	}
}
