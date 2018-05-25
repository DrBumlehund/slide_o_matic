/*
 * generated by Xtext 2.13.0
 */
package dk.sdu.mmmi.mdsd.f18.dsl.external.parser.antlr;

import com.google.inject.Inject;
import dk.sdu.mmmi.mdsd.f18.dsl.external.parser.antlr.internal.InternalSlideOMaticParser;
import dk.sdu.mmmi.mdsd.f18.dsl.external.services.SlideOMaticGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class SlideOMaticParser extends AbstractAntlrParser {

	@Inject
	private SlideOMaticGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalSlideOMaticParser createParser(XtextTokenStream stream) {
		return new InternalSlideOMaticParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Presentation";
	}

	public SlideOMaticGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(SlideOMaticGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
