package ac.soton.bsharp.mapletTree;

import ac.soton.bsharp.bSharp.Expression;

public class MapletExpressionLeaf extends AbstractLeaf {
	
	Expression expr;
	
	public MapletExpressionLeaf(Expression expr) {
		this.expr = expr;
	}

	@Override
	public String compileToString() {
		try {
			return expr.compileToEventBString(false);
		} catch (Exception e) {
			System.err.println("Failed to compile expression in MapletExpressionLeaf with error: " + e.getMessage());
			return "compilationError";
		}
		
	}
}
