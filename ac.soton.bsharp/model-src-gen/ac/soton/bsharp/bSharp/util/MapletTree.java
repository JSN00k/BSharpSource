package ac.soton.bsharp.bSharp.util;

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
}
