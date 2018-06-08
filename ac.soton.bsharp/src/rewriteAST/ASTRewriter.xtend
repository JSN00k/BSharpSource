package rewriteAST

import ac.soton.bsharp.bSharp.Infix
import java.util.Map
import java.util.HashMap
import ac.soton.bsharp.bSharp.Bracket
import ac.soton.bsharp.bSharp.FunctionDecl

/* This class is a set of functions used to rewrite the abstract syntax tree into a simpler form
 * For instance adding the correct type annotations to typed variables or re-ordering a tree of 
 * infix operators.
 */
class ASTRewriter {
	/* Given a tree of Infix expressions this will rewrite the tree based on the
	 * precedence of the operators. Due to Xtexts lazy linking approach this is 
	 * impossible at parse time as it is not possible to get the operator precedence.
	 * However we have not thrown any information out so there is no need to panic!
	 * I am making an assumption that this is only used on a copy of the 
	 * original tree (it only works on flat trees). There is another way that is 
	 * to mark the tree as already reordered, this means trusting the parser to 
	 * re-parse the whole expression when a change is made.
	 */
	 
	 private static final Map<String, Integer> inbuiltPrecedence = createMap();
	 
	 def static createMap () {
	 	val map = new HashMap<String, Integer>()
	 	map.put('⇔', 50)
	 	map.put('⇒', 50)
	 	map.put('=', 50)
	 	map.put('≠', 50)
	 	map.put('∧', 50)
	 	map.put('∨', 50)
	 	return map as Map<String, Integer>
	 }
	 
	 def static Integer getInfixPrecedence(Infix tree){
	 			var precedence = 500
		if (tree.opName !== null) {
			precedence = inbuiltPrecedence.get(tree.opName)
		} else {
			/* The infix operator must be an infix function reference scoping should have vaidated it as such
			 * e.g., non-Infix function names are out of scope.
			 */
			if ((tree.funcName.eContainer as FunctionDecl).precedence  != 0) {
				precedence = (tree.funcName.eContainer as FunctionDecl).precedence
			}
		}
		return precedence
	 }
	 
	def static Infix reorderInfixTree(Infix tree) {
		if (tree.left instanceof Infix) {
			tree.left = reorderInfixTree(tree.left as Infix)
		}
		
		if (tree.right instanceof Bracket) {
			val bracket = tree.right as Bracket
			
			if (bracket.child instanceof Infix)
				tree.right = reorderInfixTree(bracket.child as Infix)
			else 
				tree.right = bracket.child
		}
		
		if (tree.left instanceof Bracket) {
			val bracket = tree.left as Bracket
			
			if (bracket.child instanceof Infix)
				tree.left = reorderInfixTree(bracket.child as Infix)
			else 
				tree.left = bracket.child
				
			return tree
		}
		
		if (tree.left instanceof Infix) {
		var leftInfix = tree.left as Infix
		val myPrec = getInfixPrecedence(tree)
		val leftPrec = getInfixPrecedence(leftInfix)
		
		if (myPrec > leftPrec) {
				tree.left = leftInfix.right
				leftInfix.right = tree
				return leftInfix
			}
		}
		
		return tree
	}
}