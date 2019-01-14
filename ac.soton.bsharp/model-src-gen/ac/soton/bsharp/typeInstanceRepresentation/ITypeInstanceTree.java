package ac.soton.bsharp.typeInstanceRepresentation;

import ac.soton.bsharp.bSharp.ClassDecl;
import ac.soton.bsharp.mapletTree.IMapletNode;

public interface ITypeInstanceTree extends ITypeInstance {
	IMapletNode getTree();
	IMapletNode treeForType(ClassDecl type);
}
