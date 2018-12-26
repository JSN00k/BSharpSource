package ac.soton.bsharp.mapletTree;

public abstract class AbstractLeaf implements IMapletNode {

	@Override
	public IMapletNode appendNodeToLeft(IMapletNode node) {
		return new MapletTree(node, this);
	}
}
