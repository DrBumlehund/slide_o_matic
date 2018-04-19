/*
 * generated by Xtext 2.12.0
 */
package dk.sdu.mmmi.mdsd.f18.dsl.external.serializer;

import com.google.inject.Inject;
import dk.sdu.mmmi.mdsd.f18.dsl.external.services.SlideOMaticGrammarAccess;
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
public class SlideOMaticSyntacticSequencer extends AbstractSyntacticSequencer {

	protected SlideOMaticGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Image_ClickParserRuleCall_6_q;
	protected AbstractElementAlias match_NumberedListItem_ClickParserRuleCall_2_q;
	protected AbstractElementAlias match_Presentation___LeftParenthesisKeyword_3_0_RightParenthesisKeyword_3_5__q;
	protected AbstractElementAlias match_Size_HeightKeyword_0_1_or_WidthKeyword_0_0;
	protected AbstractElementAlias match_Text_ClickParserRuleCall_0_3_q;
	protected AbstractElementAlias match_Text_ClickParserRuleCall_1_6_q;
	protected AbstractElementAlias match_UnNumberedListItem_ClickParserRuleCall_2_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (SlideOMaticGrammarAccess) access;
		match_Image_ClickParserRuleCall_6_q = new TokenAlias(false, true, grammarAccess.getImageAccess().getClickParserRuleCall_6());
		match_NumberedListItem_ClickParserRuleCall_2_q = new TokenAlias(false, true, grammarAccess.getNumberedListItemAccess().getClickParserRuleCall_2());
		match_Presentation___LeftParenthesisKeyword_3_0_RightParenthesisKeyword_3_5__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getPresentationAccess().getLeftParenthesisKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getPresentationAccess().getRightParenthesisKeyword_3_5()));
		match_Size_HeightKeyword_0_1_or_WidthKeyword_0_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getSizeAccess().getHeightKeyword_0_1()), new TokenAlias(false, false, grammarAccess.getSizeAccess().getWidthKeyword_0_0()));
		match_Text_ClickParserRuleCall_0_3_q = new TokenAlias(false, true, grammarAccess.getTextAccess().getClickParserRuleCall_0_3());
		match_Text_ClickParserRuleCall_1_6_q = new TokenAlias(false, true, grammarAccess.getTextAccess().getClickParserRuleCall_1_6());
		match_UnNumberedListItem_ClickParserRuleCall_2_q = new TokenAlias(false, true, grammarAccess.getUnNumberedListItemAccess().getClickParserRuleCall_2());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (ruleCall.getRule() == grammarAccess.getClickRule())
			return getClickToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * Click:
	 * 	"$$";
	 */
	protected String getClickToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "$$";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_Image_ClickParserRuleCall_6_q.equals(syntax))
				emit_Image_ClickParserRuleCall_6_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_NumberedListItem_ClickParserRuleCall_2_q.equals(syntax))
				emit_NumberedListItem_ClickParserRuleCall_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Presentation___LeftParenthesisKeyword_3_0_RightParenthesisKeyword_3_5__q.equals(syntax))
				emit_Presentation___LeftParenthesisKeyword_3_0_RightParenthesisKeyword_3_5__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Size_HeightKeyword_0_1_or_WidthKeyword_0_0.equals(syntax))
				emit_Size_HeightKeyword_0_1_or_WidthKeyword_0_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Text_ClickParserRuleCall_0_3_q.equals(syntax))
				emit_Text_ClickParserRuleCall_0_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Text_ClickParserRuleCall_1_6_q.equals(syntax))
				emit_Text_ClickParserRuleCall_1_6_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_UnNumberedListItem_ClickParserRuleCall_2_q.equals(syntax))
				emit_UnNumberedListItem_ClickParserRuleCall_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     Click?
	 *
	 * This ambiguous syntax occurs at:
	 *     size=Size (ambiguity) (rule end)
	 */
	protected void emit_Image_ClickParserRuleCall_6_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     Click?
	 *
	 * This ambiguous syntax occurs at:
	 *     item=STRING (ambiguity) (rule end)
	 */
	protected void emit_NumberedListItem_ClickParserRuleCall_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('(' ')')?
	 *
	 * This ambiguous syntax occurs at:
	 *     name=STRING '{' (ambiguity) '}' (rule end)
	 *     name=STRING '{' (ambiguity) animations+=Animation
	 *     name=STRING '{' (ambiguity) slides+=Slide
	 */
	protected void emit_Presentation___LeftParenthesisKeyword_3_0_RightParenthesisKeyword_3_5__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'width' | 'height'
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) scale=INT
	 */
	protected void emit_Size_HeightKeyword_0_1_or_WidthKeyword_0_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     Click?
	 *
	 * This ambiguous syntax occurs at:
	 *     text=STRING (ambiguity) (rule end)
	 */
	protected void emit_Text_ClickParserRuleCall_0_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     Click?
	 *
	 * This ambiguous syntax occurs at:
	 *     text=STRING '}' (ambiguity) (rule end)
	 */
	protected void emit_Text_ClickParserRuleCall_1_6_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     Click?
	 *
	 * This ambiguous syntax occurs at:
	 *     item=STRING (ambiguity) (rule end)
	 */
	protected void emit_UnNumberedListItem_ClickParserRuleCall_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
