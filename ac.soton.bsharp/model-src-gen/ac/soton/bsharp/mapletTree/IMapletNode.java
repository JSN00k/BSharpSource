package ac.soton.bsharp.mapletTree;

import java.util.ArrayList;

public interface IMapletNode {
	String compileToString();

	public ArrayList<String> varNames();

	void varNamesIntoArray(ArrayList<String> al);
}
