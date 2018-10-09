package ac.soton.bsharp.rewriteAST;

import ac.soton.bsharp.bSharp.Bracket;
import ac.soton.bsharp.bSharp.Expression;
import ac.soton.bsharp.bSharp.FunctionDecl;
import ac.soton.bsharp.bSharp.Infix;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.emf.ecore.EObject;

/**
 * This class is a set of functions used to rewrite the abstract syntax tree into a simpler form
 * For instance adding the correct type annotations to typed variables or re-ordering a tree of
 * infix operators.
 */
@SuppressWarnings("all")
public class ASTRewriter {
  /**
   * Given a tree of Infix expressions this will rewrite the tree based on the
   * precedence of the operators. Due to Xtexts lazy linking approach this is
   * impossible at parse time as it is not possible to get the operator precedence.
   * However we have not thrown any information out so there is no need to panic!
   * I am making an assumption that this is only used on a copy of the
   * original tree (it only works on flat trees). There is another way that is
   * to mark the tree as already reordered, this means trusting the parser to
   * re-parse the whole expression when a change is made.
   */
  private final static Map<String, Integer> inbuiltPrecedence = ASTRewriter.createMap();
  
  public static Map<String, Integer> createMap() {
    final HashMap<String, Integer> map = new HashMap<String, Integer>();
    map.put("⇔", Integer.valueOf(50));
    map.put("⇒", Integer.valueOf(50));
    map.put("=", Integer.valueOf(50));
    map.put("≠", Integer.valueOf(50));
    map.put("∧", Integer.valueOf(50));
    map.put("∨", Integer.valueOf(50));
    return ((Map<String, Integer>) map);
  }
  
  public static Integer getInfixPrecedence(final Infix tree) {
    int precedence = 500;
    String _opName = tree.getOpName();
    boolean _tripleNotEquals = (_opName != null);
    if (_tripleNotEquals) {
      precedence = (ASTRewriter.inbuiltPrecedence.get(tree.getOpName())).intValue();
    } else {
      EObject _eContainer = tree.getFuncName().eContainer();
      int _precedence = ((FunctionDecl) _eContainer).getPrecedence();
      boolean _notEquals = (_precedence != 0);
      if (_notEquals) {
        EObject _eContainer_1 = tree.getFuncName().eContainer();
        precedence = ((FunctionDecl) _eContainer_1).getPrecedence();
      }
    }
    return Integer.valueOf(precedence);
  }
  
  public static Infix reorderInfixTree(final Infix tree) {
    Expression _left = tree.getLeft();
    if ((_left instanceof Infix)) {
      Expression _left_1 = tree.getLeft();
      tree.setLeft(ASTRewriter.reorderInfixTree(((Infix) _left_1)));
    }
    Expression _right = tree.getRight();
    if ((_right instanceof Bracket)) {
      Expression _right_1 = tree.getRight();
      final Bracket bracket = ((Bracket) _right_1);
      Expression _child = bracket.getChild();
      if ((_child instanceof Infix)) {
        Expression _child_1 = bracket.getChild();
        tree.setRight(ASTRewriter.reorderInfixTree(((Infix) _child_1)));
      } else {
        tree.setRight(bracket.getChild());
      }
    }
    Expression _left_2 = tree.getLeft();
    if ((_left_2 instanceof Bracket)) {
      Expression _left_3 = tree.getLeft();
      final Bracket bracket_1 = ((Bracket) _left_3);
      Expression _child_2 = bracket_1.getChild();
      if ((_child_2 instanceof Infix)) {
        Expression _child_3 = bracket_1.getChild();
        tree.setLeft(ASTRewriter.reorderInfixTree(((Infix) _child_3)));
      } else {
        tree.setLeft(bracket_1.getChild());
      }
      return tree;
    }
    Expression _left_4 = tree.getLeft();
    if ((_left_4 instanceof Infix)) {
      Expression _left_5 = tree.getLeft();
      Infix leftInfix = ((Infix) _left_5);
      final Integer myPrec = ASTRewriter.getInfixPrecedence(tree);
      final Integer leftPrec = ASTRewriter.getInfixPrecedence(leftInfix);
      boolean _greaterThan = (myPrec.compareTo(leftPrec) > 0);
      if (_greaterThan) {
        tree.setLeft(leftInfix.getRight());
        leftInfix.setRight(tree);
        return leftInfix;
      }
    }
    return tree;
  }
}
