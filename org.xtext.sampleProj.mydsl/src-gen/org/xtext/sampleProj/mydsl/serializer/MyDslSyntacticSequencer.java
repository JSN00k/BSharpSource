/*
 * generated by Xtext 2.13.0
 */
package org.xtext.sampleProj.mydsl.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.xtext.sampleProj.mydsl.services.MyDslGrammarAccess;

@SuppressWarnings("all")
public class MyDslSyntacticSequencer extends AbstractSyntacticSequencer {

	protected MyDslGrammarAccess grammarAccess;
	protected AbstractElementAlias match_ConstructedType_LeftRightArrowKeyword_1_0_4_or_MultiplicationSignKeyword_1_0_0_or_PrivateUseAreaE100Keyword_1_0_3_or_PrivateUseAreaE102Keyword_1_0_2_or_RightwardsArrowKeyword_1_0_1_or_RightwardsArrowWithTailKeyword_1_0_7_or_RightwardsArrowWithVerticalStrokeKeyword_1_0_6_or_RightwardsTwoHeadedArrowKeyword_1_0_9_or_RightwardsTwoHeadedArrowWithTailKeyword_1_0_5_or_RightwardsTwoHeadedArrowWithVerticalStrokeKeyword_1_0_8;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (MyDslGrammarAccess) access;
		match_ConstructedType_LeftRightArrowKeyword_1_0_4_or_MultiplicationSignKeyword_1_0_0_or_PrivateUseAreaE100Keyword_1_0_3_or_PrivateUseAreaE102Keyword_1_0_2_or_RightwardsArrowKeyword_1_0_1_or_RightwardsArrowWithTailKeyword_1_0_7_or_RightwardsArrowWithVerticalStrokeKeyword_1_0_6_or_RightwardsTwoHeadedArrowKeyword_1_0_9_or_RightwardsTwoHeadedArrowWithTailKeyword_1_0_5_or_RightwardsTwoHeadedArrowWithVerticalStrokeKeyword_1_0_8 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getConstructedTypeAccess().getLeftRightArrowKeyword_1_0_4()), new TokenAlias(false, false, grammarAccess.getConstructedTypeAccess().getMultiplicationSignKeyword_1_0_0()), new TokenAlias(false, false, grammarAccess.getConstructedTypeAccess().getPrivateUseAreaE100Keyword_1_0_3()), new TokenAlias(false, false, grammarAccess.getConstructedTypeAccess().getPrivateUseAreaE102Keyword_1_0_2()), new TokenAlias(false, false, grammarAccess.getConstructedTypeAccess().getRightwardsArrowKeyword_1_0_1()), new TokenAlias(false, false, grammarAccess.getConstructedTypeAccess().getRightwardsArrowWithTailKeyword_1_0_7()), new TokenAlias(false, false, grammarAccess.getConstructedTypeAccess().getRightwardsArrowWithVerticalStrokeKeyword_1_0_6()), new TokenAlias(false, false, grammarAccess.getConstructedTypeAccess().getRightwardsTwoHeadedArrowKeyword_1_0_9()), new TokenAlias(false, false, grammarAccess.getConstructedTypeAccess().getRightwardsTwoHeadedArrowWithTailKeyword_1_0_5()), new TokenAlias(false, false, grammarAccess.getConstructedTypeAccess().getRightwardsTwoHeadedArrowWithVerticalStrokeKeyword_1_0_8()));
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
			if (match_ConstructedType_LeftRightArrowKeyword_1_0_4_or_MultiplicationSignKeyword_1_0_0_or_PrivateUseAreaE100Keyword_1_0_3_or_PrivateUseAreaE102Keyword_1_0_2_or_RightwardsArrowKeyword_1_0_1_or_RightwardsArrowWithTailKeyword_1_0_7_or_RightwardsArrowWithVerticalStrokeKeyword_1_0_6_or_RightwardsTwoHeadedArrowKeyword_1_0_9_or_RightwardsTwoHeadedArrowWithTailKeyword_1_0_5_or_RightwardsTwoHeadedArrowWithVerticalStrokeKeyword_1_0_8.equals(syntax))
				emit_ConstructedType_LeftRightArrowKeyword_1_0_4_or_MultiplicationSignKeyword_1_0_0_or_PrivateUseAreaE100Keyword_1_0_3_or_PrivateUseAreaE102Keyword_1_0_2_or_RightwardsArrowKeyword_1_0_1_or_RightwardsArrowWithTailKeyword_1_0_7_or_RightwardsArrowWithVerticalStrokeKeyword_1_0_6_or_RightwardsTwoHeadedArrowKeyword_1_0_9_or_RightwardsTwoHeadedArrowWithTailKeyword_1_0_5_or_RightwardsTwoHeadedArrowWithVerticalStrokeKeyword_1_0_8(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
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
	
}
