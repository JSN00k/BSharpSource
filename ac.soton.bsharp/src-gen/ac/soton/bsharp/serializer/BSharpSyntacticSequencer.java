/*
 * generated by Xtext 2.14.0
 */
package ac.soton.bsharp.serializer;

import ac.soton.bsharp.services.BSharpGrammarAccess;
import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class BSharpSyntacticSequencer extends AbstractSyntacticSequencer {

	protected BSharpGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Class_SemicolonKeyword_6_q;
	protected AbstractElementAlias match_ConstructedType_LeftRightArrowKeyword_1_0_4_or_MultiplicationSignKeyword_1_0_0_or_PrivateUseAreaE100Keyword_1_0_3_or_PrivateUseAreaE102Keyword_1_0_2_or_RightwardsArrowKeyword_1_0_1_or_RightwardsArrowWithTailKeyword_1_0_7_or_RightwardsArrowWithVerticalStrokeKeyword_1_0_6_or_RightwardsTwoHeadedArrowKeyword_1_0_9_or_RightwardsTwoHeadedArrowWithTailKeyword_1_0_5_or_RightwardsTwoHeadedArrowWithVerticalStrokeKeyword_1_0_8;
	protected AbstractElementAlias match_FunctionCall___LeftParenthesisKeyword_1_0_RightParenthesisKeyword_1_3__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (BSharpGrammarAccess) access;
		match_Class_SemicolonKeyword_6_q = new TokenAlias(false, true, grammarAccess.getClassAccess().getSemicolonKeyword_6());
		match_ConstructedType_LeftRightArrowKeyword_1_0_4_or_MultiplicationSignKeyword_1_0_0_or_PrivateUseAreaE100Keyword_1_0_3_or_PrivateUseAreaE102Keyword_1_0_2_or_RightwardsArrowKeyword_1_0_1_or_RightwardsArrowWithTailKeyword_1_0_7_or_RightwardsArrowWithVerticalStrokeKeyword_1_0_6_or_RightwardsTwoHeadedArrowKeyword_1_0_9_or_RightwardsTwoHeadedArrowWithTailKeyword_1_0_5_or_RightwardsTwoHeadedArrowWithVerticalStrokeKeyword_1_0_8 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getConstructedTypeAccess().getLeftRightArrowKeyword_1_0_4()), new TokenAlias(false, false, grammarAccess.getConstructedTypeAccess().getMultiplicationSignKeyword_1_0_0()), new TokenAlias(false, false, grammarAccess.getConstructedTypeAccess().getPrivateUseAreaE100Keyword_1_0_3()), new TokenAlias(false, false, grammarAccess.getConstructedTypeAccess().getPrivateUseAreaE102Keyword_1_0_2()), new TokenAlias(false, false, grammarAccess.getConstructedTypeAccess().getRightwardsArrowKeyword_1_0_1()), new TokenAlias(false, false, grammarAccess.getConstructedTypeAccess().getRightwardsArrowWithTailKeyword_1_0_7()), new TokenAlias(false, false, grammarAccess.getConstructedTypeAccess().getRightwardsArrowWithVerticalStrokeKeyword_1_0_6()), new TokenAlias(false, false, grammarAccess.getConstructedTypeAccess().getRightwardsTwoHeadedArrowKeyword_1_0_9()), new TokenAlias(false, false, grammarAccess.getConstructedTypeAccess().getRightwardsTwoHeadedArrowWithTailKeyword_1_0_5()), new TokenAlias(false, false, grammarAccess.getConstructedTypeAccess().getRightwardsTwoHeadedArrowWithVerticalStrokeKeyword_1_0_8()));
		match_FunctionCall___LeftParenthesisKeyword_1_0_RightParenthesisKeyword_1_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getFunctionCallAccess().getRightParenthesisKeyword_1_3()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_Class_SemicolonKeyword_6_q.equals(syntax))
				emit_Class_SemicolonKeyword_6_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_ConstructedType_LeftRightArrowKeyword_1_0_4_or_MultiplicationSignKeyword_1_0_0_or_PrivateUseAreaE100Keyword_1_0_3_or_PrivateUseAreaE102Keyword_1_0_2_or_RightwardsArrowKeyword_1_0_1_or_RightwardsArrowWithTailKeyword_1_0_7_or_RightwardsArrowWithVerticalStrokeKeyword_1_0_6_or_RightwardsTwoHeadedArrowKeyword_1_0_9_or_RightwardsTwoHeadedArrowWithTailKeyword_1_0_5_or_RightwardsTwoHeadedArrowWithVerticalStrokeKeyword_1_0_8.equals(syntax))
				emit_ConstructedType_LeftRightArrowKeyword_1_0_4_or_MultiplicationSignKeyword_1_0_0_or_PrivateUseAreaE100Keyword_1_0_3_or_PrivateUseAreaE102Keyword_1_0_2_or_RightwardsArrowKeyword_1_0_1_or_RightwardsArrowWithTailKeyword_1_0_7_or_RightwardsArrowWithVerticalStrokeKeyword_1_0_6_or_RightwardsTwoHeadedArrowKeyword_1_0_9_or_RightwardsTwoHeadedArrowWithTailKeyword_1_0_5_or_RightwardsTwoHeadedArrowWithVerticalStrokeKeyword_1_0_8(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_FunctionCall___LeftParenthesisKeyword_1_0_RightParenthesisKeyword_1_3__q.equals(syntax))
				emit_FunctionCall___LeftParenthesisKeyword_1_0_RightParenthesisKeyword_1_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     context=PolyContext (ambiguity) '{' '}' (rule end)
	 *     context=PolyContext (ambiguity) '{' bodyElements+=TypeBodyElements
	 *     supertypes=SuperTypeList (ambiguity) '{' '}' (rule end)
	 *     supertypes=SuperTypeList (ambiguity) '{' bodyElements+=TypeBodyElements
	 *     typeName=TypeName (ambiguity) '{' '}' (rule end)
	 *     typeName=TypeName (ambiguity) '{' bodyElements+=TypeBodyElements
	 *     varList=TypeStructure (ambiguity) '{' '}' (rule end)
	 *     varList=TypeStructure (ambiguity) '{' bodyElements+=TypeBodyElements
	 *     where=Where (ambiguity) '{' '}' (rule end)
	 *     where=Where (ambiguity) '{' bodyElements+=TypeBodyElements
	 */
	protected void emit_Class_SemicolonKeyword_6_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     (
	  *         '×' | 
	  *         '→' | 
	  *         '' | 
	  *         '' | 
	  *         '↔' | 
	  *         '⤖' | 
	  *         '⇸' | 
	  *         '↣' | 
	  *         '⤀' | 
	  *         '↠'
	  *     )
	 *
	 * This ambiguous syntax occurs at:
	 *     type+=TypeConstructor (ambiguity) type+=ConstructedType
	 */
	protected void emit_ConstructedType_LeftRightArrowKeyword_1_0_4_or_MultiplicationSignKeyword_1_0_0_or_PrivateUseAreaE100Keyword_1_0_3_or_PrivateUseAreaE102Keyword_1_0_2_or_RightwardsArrowKeyword_1_0_1_or_RightwardsArrowWithTailKeyword_1_0_7_or_RightwardsArrowWithVerticalStrokeKeyword_1_0_6_or_RightwardsTwoHeadedArrowKeyword_1_0_9_or_RightwardsTwoHeadedArrowWithTailKeyword_1_0_5_or_RightwardsTwoHeadedArrowWithVerticalStrokeKeyword_1_0_8(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('(' ')')?
	 *
	 * This ambiguous syntax occurs at:
	 *     typeInst=TypeInstance (ambiguity) (rule end)
	 */
	protected void emit_FunctionCall___LeftParenthesisKeyword_1_0_RightParenthesisKeyword_1_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
