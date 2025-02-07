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
	protected AbstractElementAlias match_Authors_AuthorKeyword_0_0_or_AuthorsKeyword_0_1;
	protected AbstractElementAlias match_Parenthesis_LeftParenthesisKeyword_0_a;
	protected AbstractElementAlias match_Parenthesis_LeftParenthesisKeyword_0_p;
	protected AbstractElementAlias match_Presentation___LeftParenthesisKeyword_4_0_RightParenthesisKeyword_4_5__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (SlideOMaticGrammarAccess) access;
		match_Authors_AuthorKeyword_0_0_or_AuthorsKeyword_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getAuthorsAccess().getAuthorKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getAuthorsAccess().getAuthorsKeyword_0_1()));
		match_Parenthesis_LeftParenthesisKeyword_0_a = new TokenAlias(true, true, grammarAccess.getParenthesisAccess().getLeftParenthesisKeyword_0());
		match_Parenthesis_LeftParenthesisKeyword_0_p = new TokenAlias(true, false, grammarAccess.getParenthesisAccess().getLeftParenthesisKeyword_0());
		match_Presentation___LeftParenthesisKeyword_4_0_RightParenthesisKeyword_4_5__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getPresentationAccess().getLeftParenthesisKeyword_4_0()), new TokenAlias(false, false, grammarAccess.getPresentationAccess().getRightParenthesisKeyword_4_5()));
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
			if (match_Authors_AuthorKeyword_0_0_or_AuthorsKeyword_0_1.equals(syntax))
				emit_Authors_AuthorKeyword_0_0_or_AuthorsKeyword_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Parenthesis_LeftParenthesisKeyword_0_a.equals(syntax))
				emit_Parenthesis_LeftParenthesisKeyword_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Parenthesis_LeftParenthesisKeyword_0_p.equals(syntax))
				emit_Parenthesis_LeftParenthesisKeyword_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Presentation___LeftParenthesisKeyword_4_0_RightParenthesisKeyword_4_5__q.equals(syntax))
				emit_Presentation___LeftParenthesisKeyword_4_0_RightParenthesisKeyword_4_5__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     'author' | 'authors'
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) names+=STRING
	 */
	protected void emit_Authors_AuthorKeyword_0_0_or_AuthorsKeyword_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '('*
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) 'let' id=ID
	 *     (rule start) (ambiguity) id=ID
	 *     (rule start) (ambiguity) value=INT
	 *     (rule start) (ambiguity) {Div.left=}
	 *     (rule start) (ambiguity) {Minus.left=}
	 *     (rule start) (ambiguity) {Mult.left=}
	 *     (rule start) (ambiguity) {Plus.left=}
	 *     (rule start) (ambiguity) {Pow.left=}
	 */
	protected void emit_Parenthesis_LeftParenthesisKeyword_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '('+
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) 'let' id=ID
	 *     (rule start) (ambiguity) id=ID
	 *     (rule start) (ambiguity) value=INT
	 *     (rule start) (ambiguity) {Div.left=}
	 *     (rule start) (ambiguity) {Minus.left=}
	 *     (rule start) (ambiguity) {Mult.left=}
	 *     (rule start) (ambiguity) {Plus.left=}
	 *     (rule start) (ambiguity) {Pow.left=}
	 */
	protected void emit_Parenthesis_LeftParenthesisKeyword_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('(' ')')?
	 *
	 * This ambiguous syntax occurs at:
	 *     name=STRING '{' (ambiguity) '}' (rule end)
	 *     name=STRING '{' (ambiguity) slides+=Slide
	 *     subtitle=STRING '{' (ambiguity) '}' (rule end)
	 *     subtitle=STRING '{' (ambiguity) slides+=Slide
	 */
	protected void emit_Presentation___LeftParenthesisKeyword_4_0_RightParenthesisKeyword_4_5__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
