/*
 * generated by Xtext 2.12.0
 */
grammar InternalSlideOMatic;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package dk.sdu.mmmi.mdsd.f18.dsl.external.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package dk.sdu.mmmi.mdsd.f18.dsl.external.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import dk.sdu.mmmi.mdsd.f18.dsl.external.services.SlideOMaticGrammarAccess;

}

@parser::members {

 	private SlideOMaticGrammarAccess grammarAccess;

    public InternalSlideOMaticParser(TokenStream input, SlideOMaticGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Model";
   	}

   	@Override
   	protected SlideOMaticGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	iv_ruleModel=ruleModel
	{ $current=$iv_ruleModel.current; }
	EOF;

// Rule Model
ruleModel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getModelAccess().getPresentationPresentationParserRuleCall_0());
			}
			lv_presentation_0_0=rulePresentation
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getModelRule());
				}
				set(
					$current,
					"presentation",
					lv_presentation_0_0,
					"dk.sdu.mmmi.mdsd.f18.dsl.external.SlideOMatic.Presentation");
				afterParserOrEnumRuleCall();
			}
		)
	)
;

// Entry rule entryRulePresentation
entryRulePresentation returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPresentationRule()); }
	iv_rulePresentation=rulePresentation
	{ $current=$iv_rulePresentation.current; }
	EOF;

// Rule Presentation
rulePresentation returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='presentation'
		{
			newLeafNode(otherlv_0, grammarAccess.getPresentationAccess().getPresentationKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getPresentationAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPresentationRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getPresentationAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			otherlv_3='('
			{
				newLeafNode(otherlv_3, grammarAccess.getPresentationAccess().getLeftParenthesisKeyword_3_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getPresentationAccess().getSettingsSettingParserRuleCall_3_1_0());
					}
					lv_settings_4_0=ruleSetting
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getPresentationRule());
						}
						add(
							$current,
							"settings",
							lv_settings_4_0,
							"dk.sdu.mmmi.mdsd.f18.dsl.external.SlideOMatic.Setting");
						afterParserOrEnumRuleCall();
					}
				)
			)*
			otherlv_5=')'
			{
				newLeafNode(otherlv_5, grammarAccess.getPresentationAccess().getRightParenthesisKeyword_3_2());
			}
		)+
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getPresentationAccess().getSlidesSlideParserRuleCall_4_0_0());
					}
					lv_slides_6_0=ruleSlide
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getPresentationRule());
						}
						add(
							$current,
							"slides",
							lv_slides_6_0,
							"dk.sdu.mmmi.mdsd.f18.dsl.external.SlideOMatic.Slide");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getPresentationAccess().getAnimationsAnimationParserRuleCall_4_1_0());
					}
					lv_animations_7_0=ruleAnimation
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getPresentationRule());
						}
						add(
							$current,
							"animations",
							lv_animations_7_0,
							"dk.sdu.mmmi.mdsd.f18.dsl.external.SlideOMatic.Animation");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_8='}'
		{
			newLeafNode(otherlv_8, grammarAccess.getPresentationAccess().getRightCurlyBracketKeyword_5());
		}
	)
;

// Entry rule entryRuleSetting
entryRuleSetting returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSettingRule()); }
	iv_ruleSetting=ruleSetting
	{ $current=$iv_ruleSetting.current; }
	EOF;

// Rule Setting
ruleSetting returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getSettingAccess().getThemeParserRuleCall_0());
		}
		this_Theme_0=ruleTheme
		{
			$current = $this_Theme_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getSettingAccess().getAuthorParserRuleCall_1());
		}
		this_Author_1=ruleAuthor
		{
			$current = $this_Author_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getSettingAccess().getDateParserRuleCall_2());
		}
		this_Date_2=ruleDate
		{
			$current = $this_Date_2.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleTheme
entryRuleTheme returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getThemeRule()); }
	iv_ruleTheme=ruleTheme
	{ $current=$iv_ruleTheme.current; }
	EOF;

// Rule Theme
ruleTheme returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='theme'
		{
			newLeafNode(otherlv_0, grammarAccess.getThemeAccess().getThemeKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getThemeAccess().getThemeBeamerThemeParserRuleCall_1_0());
				}
				lv_theme_1_0=ruleBeamerTheme
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getThemeRule());
					}
					set(
						$current,
						"theme",
						lv_theme_1_0,
						"dk.sdu.mmmi.mdsd.f18.dsl.external.SlideOMatic.BeamerTheme");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_2='color'
			{
				newLeafNode(otherlv_2, grammarAccess.getThemeAccess().getColorKeyword_2_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getThemeAccess().getThemeColorThemeColorParserRuleCall_2_1_0());
					}
					lv_themeColor_3_0=ruleThemeColor
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getThemeRule());
						}
						set(
							$current,
							"themeColor",
							lv_themeColor_3_0,
							"dk.sdu.mmmi.mdsd.f18.dsl.external.SlideOMatic.ThemeColor");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
	)
;

// Entry rule entryRuleBeamerTheme
entryRuleBeamerTheme returns [String current=null]:
	{ newCompositeNode(grammarAccess.getBeamerThemeRule()); }
	iv_ruleBeamerTheme=ruleBeamerTheme
	{ $current=$iv_ruleBeamerTheme.current.getText(); }
	EOF;

// Rule BeamerTheme
ruleBeamerTheme returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='AnnArbor'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getBeamerThemeAccess().getAnnArborKeyword_0());
		}
		    |
		kw='Antibes'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getBeamerThemeAccess().getAntibesKeyword_1());
		}
		    |
		kw='Bergen'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getBeamerThemeAccess().getBergenKeyword_2());
		}
		    |
		kw='Berkeley'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getBeamerThemeAccess().getBerkeleyKeyword_3());
		}
		    |
		kw='Berlin'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getBeamerThemeAccess().getBerlinKeyword_4());
		}
		    |
		kw='Boadilla'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getBeamerThemeAccess().getBoadillaKeyword_5());
		}
		    |
		kw='boxes'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getBeamerThemeAccess().getBoxesKeyword_6());
		}
		    |
		kw='CambridgeUS'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getBeamerThemeAccess().getCambridgeUSKeyword_7());
		}
		    |
		kw='Copenhagen'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getBeamerThemeAccess().getCopenhagenKeyword_8());
		}
		    |
		kw='Darmstadt'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getBeamerThemeAccess().getDarmstadtKeyword_9());
		}
		    |
		kw='default'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getBeamerThemeAccess().getDefaultKeyword_10());
		}
		    |
		kw='Dresden'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getBeamerThemeAccess().getDresdenKeyword_11());
		}
		    |
		kw='Frankfurt'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getBeamerThemeAccess().getFrankfurtKeyword_12());
		}
		    |
		kw='Goettingen'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getBeamerThemeAccess().getGoettingenKeyword_13());
		}
		    |
		kw='Hannover'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getBeamerThemeAccess().getHannoverKeyword_14());
		}
		    |
		kw='Ilmanau'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getBeamerThemeAccess().getIlmanauKeyword_15());
		}
		    |
		kw='JuanLesPins'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getBeamerThemeAccess().getJuanLesPinsKeyword_16());
		}
		    |
		kw='Luebeck'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getBeamerThemeAccess().getLuebeckKeyword_17());
		}
		    |
		kw='Madrid'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getBeamerThemeAccess().getMadridKeyword_18());
		}
		    |
		kw='Malmoe'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getBeamerThemeAccess().getMalmoeKeyword_19());
		}
		    |
		kw='Marburg'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getBeamerThemeAccess().getMarburgKeyword_20());
		}
		    |
		kw='Montpellier'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getBeamerThemeAccess().getMontpellierKeyword_21());
		}
		    |
		kw='PaloAlto'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getBeamerThemeAccess().getPaloAltoKeyword_22());
		}
		    |
		kw='Pittsburgh'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getBeamerThemeAccess().getPittsburghKeyword_23());
		}
		    |
		kw='Rochester'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getBeamerThemeAccess().getRochesterKeyword_24());
		}
		    |
		kw='Singapore'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getBeamerThemeAccess().getSingaporeKeyword_25());
		}
		    |
		kw='Szeged'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getBeamerThemeAccess().getSzegedKeyword_26());
		}
		    |
		kw='Warsaw'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getBeamerThemeAccess().getWarsawKeyword_27());
		}
	)
;

// Entry rule entryRuleThemeColor
entryRuleThemeColor returns [String current=null]:
	{ newCompositeNode(grammarAccess.getThemeColorRule()); }
	iv_ruleThemeColor=ruleThemeColor
	{ $current=$iv_ruleThemeColor.current.getText(); }
	EOF;

// Rule ThemeColor
ruleThemeColor returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='albatros'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getThemeColorAccess().getAlbatrosKeyword_0());
		}
		    |
		kw='beaver'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getThemeColorAccess().getBeaverKeyword_1());
		}
		    |
		kw='beetle'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getThemeColorAccess().getBeetleKeyword_2());
		}
		    |
		kw='crane'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getThemeColorAccess().getCraneKeyword_3());
		}
		    |
		kw='default'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getThemeColorAccess().getDefaultKeyword_4());
		}
		    |
		kw='dolphin'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getThemeColorAccess().getDolphinKeyword_5());
		}
		    |
		kw='dove'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getThemeColorAccess().getDoveKeyword_6());
		}
		    |
		kw='fly'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getThemeColorAccess().getFlyKeyword_7());
		}
		    |
		kw='lily'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getThemeColorAccess().getLilyKeyword_8());
		}
		    |
		kw='orchid'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getThemeColorAccess().getOrchidKeyword_9());
		}
		    |
		kw='rose'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getThemeColorAccess().getRoseKeyword_10());
		}
		    |
		kw='seagull'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getThemeColorAccess().getSeagullKeyword_11());
		}
		    |
		kw='seahorse'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getThemeColorAccess().getSeahorseKeyword_12());
		}
		    |
		kw='sidebartab'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getThemeColorAccess().getSidebartabKeyword_13());
		}
		    |
		kw='structure'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getThemeColorAccess().getStructureKeyword_14());
		}
		    |
		kw='whale'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getThemeColorAccess().getWhaleKeyword_15());
		}
		    |
		kw='wolverine'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getThemeColorAccess().getWolverineKeyword_16());
		}
	)
;

// Entry rule entryRuleAuthor
entryRuleAuthor returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAuthorRule()); }
	iv_ruleAuthor=ruleAuthor
	{ $current=$iv_ruleAuthor.current; }
	EOF;

// Rule Author
ruleAuthor returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='author'
		{
			newLeafNode(otherlv_0, grammarAccess.getAuthorAccess().getAuthorKeyword_0());
		}
		(
			(
				lv_aName_1_0=RULE_STRING
				{
					newLeafNode(lv_aName_1_0, grammarAccess.getAuthorAccess().getANameSTRINGTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAuthorRule());
					}
					setWithLastConsumed(
						$current,
						"aName",
						lv_aName_1_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
	)
;

// Entry rule entryRuleDate
entryRuleDate returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDateRule()); }
	iv_ruleDate=ruleDate
	{ $current=$iv_ruleDate.current; }
	EOF;

// Rule Date
ruleDate returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='date'
		{
			newLeafNode(otherlv_0, grammarAccess.getDateAccess().getDateKeyword_0());
		}
		(
			(
				lv_date_1_0=RULE_STRING
				{
					newLeafNode(lv_date_1_0, grammarAccess.getDateAccess().getDateSTRINGTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDateRule());
					}
					setWithLastConsumed(
						$current,
						"date",
						lv_date_1_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
	)
;

// Entry rule entryRuleSlide
entryRuleSlide returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSlideRule()); }
	iv_ruleSlide=ruleSlide
	{ $current=$iv_ruleSlide.current; }
	EOF;

// Rule Slide
ruleSlide returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='slide'
		{
			newLeafNode(otherlv_0, grammarAccess.getSlideAccess().getSlideKeyword_0());
		}
		(
			{
				newCompositeNode(grammarAccess.getSlideAccess().getSectionParserRuleCall_1());
			}
			this_Section_1=ruleSection
			{
				$current = $this_Section_1.current;
				afterParserOrEnumRuleCall();
			}
		)?
		(
			(
				lv_sName_2_0=RULE_STRING
				{
					newLeafNode(lv_sName_2_0, grammarAccess.getSlideAccess().getSNameSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSlideRule());
					}
					setWithLastConsumed(
						$current,
						"sName",
						lv_sName_2_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)?
		otherlv_3='{'
		{
			newLeafNode(otherlv_3, grammarAccess.getSlideAccess().getLeftCurlyBracketKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getSlideAccess().getContentsContentParserRuleCall_4_0());
				}
				lv_contents_4_0=ruleContent
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSlideRule());
					}
					add(
						$current,
						"contents",
						lv_contents_4_0,
						"dk.sdu.mmmi.mdsd.f18.dsl.external.SlideOMatic.Content");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_5='}'
		{
			newLeafNode(otherlv_5, grammarAccess.getSlideAccess().getRightCurlyBracketKeyword_5());
		}
	)
;

// Entry rule entryRuleSection
entryRuleSection returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSectionRule()); }
	iv_ruleSection=ruleSection
	{ $current=$iv_ruleSection.current; }
	EOF;

// Rule Section
ruleSection returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getSectionAccess().getSectionAction_0_0(),
						$current);
				}
			)
			otherlv_1='*'
			{
				newLeafNode(otherlv_1, grammarAccess.getSectionAccess().getAsteriskKeyword_0_1());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getSectionAccess().getSubSectionAction_1_0(),
						$current);
				}
			)
			otherlv_3='**'
			{
				newLeafNode(otherlv_3, grammarAccess.getSectionAccess().getAsteriskAsteriskKeyword_1_1());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getSectionAccess().getSubSubSectionAction_2_0(),
						$current);
				}
			)
			otherlv_5='***'
			{
				newLeafNode(otherlv_5, grammarAccess.getSectionAccess().getAsteriskAsteriskAsteriskKeyword_2_1());
			}
		)
	)
;

// Entry rule entryRuleContent
entryRuleContent returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getContentRule()); }
	iv_ruleContent=ruleContent
	{ $current=$iv_ruleContent.current; }
	EOF;

// Rule Content
ruleContent returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getContentAccess().getTOCAction_0_0(),
						$current);
				}
			)
			otherlv_1='ToC'
			{
				newLeafNode(otherlv_1, grammarAccess.getContentAccess().getToCKeyword_0_1());
			}
		)
		    |
		{
			newCompositeNode(grammarAccess.getContentAccess().getTextParserRuleCall_1());
		}
		this_Text_2=ruleText
		{
			$current = $this_Text_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getContentAccess().getListParserRuleCall_2());
		}
		this_List_3=ruleList
		{
			$current = $this_List_3.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getContentAccess().getFloatParserRuleCall_3());
		}
		this_Float_4=ruleFloat
		{
			$current = $this_Float_4.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleText
entryRuleText returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTextRule()); }
	iv_ruleText=ruleText
	{ $current=$iv_ruleText.current; }
	EOF;

// Rule Text
ruleText returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getTextAccess().getParagraphAction_0_0(),
						$current);
				}
			)
			otherlv_1='>'
			{
				newLeafNode(otherlv_1, grammarAccess.getTextAccess().getGreaterThanSignKeyword_0_1());
			}
			(
				(
					lv_text_2_0=RULE_STRING
					{
						newLeafNode(lv_text_2_0, grammarAccess.getTextAccess().getTextSTRINGTerminalRuleCall_0_2_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getTextRule());
						}
						setWithLastConsumed(
							$current,
							"text",
							lv_text_2_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
			(
				{
					newCompositeNode(grammarAccess.getTextAccess().getClickParserRuleCall_0_3());
				}
				ruleClick
				{
					afterParserOrEnumRuleCall();
				}
			)?
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getTextAccess().getBlockAction_1_0(),
						$current);
				}
			)
			otherlv_5='Block'
			{
				newLeafNode(otherlv_5, grammarAccess.getTextAccess().getBlockKeyword_1_1());
			}
			(
				(
					lv_name_6_0=RULE_ID
					{
						newLeafNode(lv_name_6_0, grammarAccess.getTextAccess().getNameIDTerminalRuleCall_1_2_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getTextRule());
						}
						setWithLastConsumed(
							$current,
							"name",
							lv_name_6_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)?
			otherlv_7='{'
			{
				newLeafNode(otherlv_7, grammarAccess.getTextAccess().getLeftCurlyBracketKeyword_1_3());
			}
			(
				(
					lv_text_8_0=RULE_STRING
					{
						newLeafNode(lv_text_8_0, grammarAccess.getTextAccess().getTextSTRINGTerminalRuleCall_1_4_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getTextRule());
						}
						setWithLastConsumed(
							$current,
							"text",
							lv_text_8_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
			otherlv_9='}'
			{
				newLeafNode(otherlv_9, grammarAccess.getTextAccess().getRightCurlyBracketKeyword_1_5());
			}
			(
				{
					newCompositeNode(grammarAccess.getTextAccess().getClickParserRuleCall_1_6());
				}
				ruleClick
				{
					afterParserOrEnumRuleCall();
				}
			)?
		)
	)
;

// Entry rule entryRuleList
entryRuleList returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getListRule()); }
	iv_ruleList=ruleList
	{ $current=$iv_ruleList.current; }
	EOF;

// Rule List
ruleList returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getListAccess().getListItemsNumberedListItemParserRuleCall_0_0());
				}
				lv_ListItems_0_0=ruleNumberedListItem
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getListRule());
					}
					add(
						$current,
						"ListItems",
						lv_ListItems_0_0,
						"dk.sdu.mmmi.mdsd.f18.dsl.external.SlideOMatic.NumberedListItem");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getListAccess().getListItemsUnNumberedListParserRuleCall_1_0());
				}
				lv_ListItems_1_0=ruleUnNumberedList
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getListRule());
					}
					add(
						$current,
						"ListItems",
						lv_ListItems_1_0,
						"dk.sdu.mmmi.mdsd.f18.dsl.external.SlideOMatic.UnNumberedList");
					afterParserOrEnumRuleCall();
				}
			)
		)+
	)
;

// Entry rule entryRuleNumberedListItem
entryRuleNumberedListItem returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNumberedListItemRule()); }
	iv_ruleNumberedListItem=ruleNumberedListItem
	{ $current=$iv_ruleNumberedListItem.current; }
	EOF;

// Rule NumberedListItem
ruleNumberedListItem returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='##'
		{
			newLeafNode(otherlv_0, grammarAccess.getNumberedListItemAccess().getNumberSignNumberSignKeyword_0());
		}
		(
			(
				lv_item_1_0=RULE_STRING
				{
					newLeafNode(lv_item_1_0, grammarAccess.getNumberedListItemAccess().getItemSTRINGTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getNumberedListItemRule());
					}
					setWithLastConsumed(
						$current,
						"item",
						lv_item_1_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		(
			{
				newCompositeNode(grammarAccess.getNumberedListItemAccess().getClickParserRuleCall_2());
			}
			ruleClick
			{
				afterParserOrEnumRuleCall();
			}
		)?
	)
;

// Entry rule entryRuleUnNumberedList
entryRuleUnNumberedList returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getUnNumberedListRule()); }
	iv_ruleUnNumberedList=ruleUnNumberedList
	{ $current=$iv_ruleUnNumberedList.current; }
	EOF;

// Rule UnNumberedList
ruleUnNumberedList returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='--'
		{
			newLeafNode(otherlv_0, grammarAccess.getUnNumberedListAccess().getHyphenMinusHyphenMinusKeyword_0());
		}
		(
			(
				lv_item_1_0=RULE_STRING
				{
					newLeafNode(lv_item_1_0, grammarAccess.getUnNumberedListAccess().getItemSTRINGTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getUnNumberedListRule());
					}
					setWithLastConsumed(
						$current,
						"item",
						lv_item_1_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		(
			{
				newCompositeNode(grammarAccess.getUnNumberedListAccess().getClickParserRuleCall_2());
			}
			ruleClick
			{
				afterParserOrEnumRuleCall();
			}
		)?
	)
;

// Entry rule entryRuleFloat
entryRuleFloat returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFloatRule()); }
	iv_ruleFloat=ruleFloat
	{ $current=$iv_ruleFloat.current; }
	EOF;

// Rule Float
ruleFloat returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getFloatAccess().getImageParserRuleCall_0());
		}
		this_Image_0=ruleImage
		{
			$current = $this_Image_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getFloatAccess().getTableParserRuleCall_1());
		}
		this_Table_1=ruleTable
		{
			$current = $this_Table_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleImage
entryRuleImage returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getImageRule()); }
	iv_ruleImage=ruleImage
	{ $current=$iv_ruleImage.current; }
	EOF;

// Rule Image
ruleImage returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='img'
		{
			newLeafNode(otherlv_0, grammarAccess.getImageAccess().getImgKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getImageAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getImageRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='src'
		{
			newLeafNode(otherlv_2, grammarAccess.getImageAccess().getSrcKeyword_2());
		}
		(
			(
				lv_src_3_0=RULE_STRING
				{
					newLeafNode(lv_src_3_0, grammarAccess.getImageAccess().getSrcSTRINGTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getImageRule());
					}
					setWithLastConsumed(
						$current,
						"src",
						lv_src_3_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getImageAccess().getAlignmentAlignmentParserRuleCall_4_0());
				}
				lv_alignment_4_0=ruleAlignment
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getImageRule());
					}
					set(
						$current,
						"alignment",
						lv_alignment_4_0,
						"dk.sdu.mmmi.mdsd.f18.dsl.external.SlideOMatic.Alignment");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getImageAccess().getSizeSizeParserRuleCall_5_0());
				}
				lv_size_5_0=ruleSize
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getImageRule());
					}
					set(
						$current,
						"size",
						lv_size_5_0,
						"dk.sdu.mmmi.mdsd.f18.dsl.external.SlideOMatic.Size");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			{
				newCompositeNode(grammarAccess.getImageAccess().getClickParserRuleCall_6());
			}
			ruleClick
			{
				afterParserOrEnumRuleCall();
			}
		)?
	)
;

// Entry rule entryRuleAlignment
entryRuleAlignment returns [String current=null]:
	{ newCompositeNode(grammarAccess.getAlignmentRule()); }
	iv_ruleAlignment=ruleAlignment
	{ $current=$iv_ruleAlignment.current.getText(); }
	EOF;

// Rule Alignment
ruleAlignment returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='topleft'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getAlignmentAccess().getTopleftKeyword_0());
		}
		    |
		kw='top'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getAlignmentAccess().getTopKeyword_1());
		}
		    |
		kw='topright'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getAlignmentAccess().getToprightKeyword_2());
		}
		    |
		kw='left'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getAlignmentAccess().getLeftKeyword_3());
		}
		    |
		kw='center'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getAlignmentAccess().getCenterKeyword_4());
		}
		    |
		kw='right'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getAlignmentAccess().getRightKeyword_5());
		}
		    |
		kw='bottomleft'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getAlignmentAccess().getBottomleftKeyword_6());
		}
		    |
		kw='bottom'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getAlignmentAccess().getBottomKeyword_7());
		}
		    |
		kw='bottomright'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getAlignmentAccess().getBottomrightKeyword_8());
		}
	)
;

// Entry rule entryRuleSize
entryRuleSize returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSizeRule()); }
	iv_ruleSize=ruleSize
	{ $current=$iv_ruleSize.current; }
	EOF;

// Rule Size
ruleSize returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			otherlv_0='width'
			{
				newLeafNode(otherlv_0, grammarAccess.getSizeAccess().getWidthKeyword_0_0());
			}
			    |
			otherlv_1='height'
			{
				newLeafNode(otherlv_1, grammarAccess.getSizeAccess().getHeightKeyword_0_1());
			}
		)
		(
			(
				lv_scale_2_0=RULE_INT
				{
					newLeafNode(lv_scale_2_0, grammarAccess.getSizeAccess().getScaleINTTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSizeRule());
					}
					setWithLastConsumed(
						$current,
						"scale",
						lv_scale_2_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		otherlv_3='%'
		{
			newLeafNode(otherlv_3, grammarAccess.getSizeAccess().getPercentSignKeyword_2());
		}
	)
;

// Entry rule entryRuleTable
entryRuleTable returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTableRule()); }
	iv_ruleTable=ruleTable
	{ $current=$iv_ruleTable.current; }
	EOF;

// Rule Table
ruleTable returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='tab'
		{
			newLeafNode(otherlv_0, grammarAccess.getTableAccess().getTabKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getTableAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTableRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='['
		{
			newLeafNode(otherlv_2, grammarAccess.getTableAccess().getLeftSquareBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTableAccess().getRowsTableRowParserRuleCall_3_0());
				}
				lv_rows_3_0=ruleTableRow
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTableRule());
					}
					add(
						$current,
						"rows",
						lv_rows_3_0,
						"dk.sdu.mmmi.mdsd.f18.dsl.external.SlideOMatic.TableRow");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_4=','
			{
				newLeafNode(otherlv_4, grammarAccess.getTableAccess().getCommaKeyword_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getTableAccess().getRowsTableRowParserRuleCall_4_1_0());
					}
					lv_rows_5_0=ruleTableRow
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTableRule());
						}
						add(
							$current,
							"rows",
							lv_rows_5_0,
							"dk.sdu.mmmi.mdsd.f18.dsl.external.SlideOMatic.TableRow");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_6=']'
		{
			newLeafNode(otherlv_6, grammarAccess.getTableAccess().getRightSquareBracketKeyword_5());
		}
	)
;

// Entry rule entryRuleTableRow
entryRuleTableRow returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTableRowRule()); }
	iv_ruleTableRow=ruleTableRow
	{ $current=$iv_ruleTableRow.current; }
	EOF;

// Rule TableRow
ruleTableRow returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='['
		{
			newLeafNode(otherlv_0, grammarAccess.getTableRowAccess().getLeftSquareBracketKeyword_0());
		}
		(
			(
				lv_values_1_0=RULE_STRING
				{
					newLeafNode(lv_values_1_0, grammarAccess.getTableRowAccess().getValuesSTRINGTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTableRowRule());
					}
					addWithLastConsumed(
						$current,
						"values",
						lv_values_1_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		(
			otherlv_2=','
			{
				newLeafNode(otherlv_2, grammarAccess.getTableRowAccess().getCommaKeyword_2_0());
			}
			(
				(
					lv_values_3_0=RULE_STRING
					{
						newLeafNode(lv_values_3_0, grammarAccess.getTableRowAccess().getValuesSTRINGTerminalRuleCall_2_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getTableRowRule());
						}
						addWithLastConsumed(
							$current,
							"values",
							lv_values_3_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
		)*
		otherlv_4=']'
		{
			newLeafNode(otherlv_4, grammarAccess.getTableRowAccess().getRightSquareBracketKeyword_3());
		}
	)
;

// Entry rule entryRuleClick
entryRuleClick returns [String current=null]:
	{ newCompositeNode(grammarAccess.getClickRule()); }
	iv_ruleClick=ruleClick
	{ $current=$iv_ruleClick.current.getText(); }
	EOF;

// Rule Click
ruleClick returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	kw='$$'
	{
		$current.merge(kw);
		newLeafNode(kw, grammarAccess.getClickAccess().getDollarSignDollarSignKeyword());
	}
;

// Entry rule entryRuleAnimation
entryRuleAnimation returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAnimationRule()); }
	iv_ruleAnimation=ruleAnimation
	{ $current=$iv_ruleAnimation.current; }
	EOF;

// Rule Animation
ruleAnimation returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='animate'
		{
			newLeafNode(otherlv_0, grammarAccess.getAnimationAccess().getAnimateKeyword_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAnimationRule());
					}
				}
				otherlv_1=RULE_ID
				{
					newLeafNode(otherlv_1, grammarAccess.getAnimationAccess().getTargetFloatCrossReference_1_0());
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getAnimationAccess().getTypeAnimationTypeParserRuleCall_2_0());
				}
				lv_type_2_0=ruleAnimationType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAnimationRule());
					}
					set(
						$current,
						"type",
						lv_type_2_0,
						"dk.sdu.mmmi.mdsd.f18.dsl.external.SlideOMatic.AnimationType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='to'
		{
			newLeafNode(otherlv_3, grammarAccess.getAnimationAccess().getToKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAnimationAccess().getLocationAlignmentParserRuleCall_4_0());
				}
				lv_location_4_0=ruleAlignment
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAnimationRule());
					}
					set(
						$current,
						"location",
						lv_location_4_0,
						"dk.sdu.mmmi.mdsd.f18.dsl.external.SlideOMatic.Alignment");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getAnimationAccess().getSizeSizeParserRuleCall_5_0());
				}
				lv_size_5_0=ruleSize
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAnimationRule());
					}
					set(
						$current,
						"size",
						lv_size_5_0,
						"dk.sdu.mmmi.mdsd.f18.dsl.external.SlideOMatic.Size");
					afterParserOrEnumRuleCall();
				}
			)
		)?
	)
;

// Entry rule entryRuleAnimationType
entryRuleAnimationType returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAnimationTypeRule()); }
	iv_ruleAnimationType=ruleAnimationType
	{ $current=$iv_ruleAnimationType.current; }
	EOF;

// Rule AnimationType
ruleAnimationType returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getAnimationTypeAccess().getMoveAction_0_0(),
						$current);
				}
			)
			otherlv_1='move'
			{
				newLeafNode(otherlv_1, grammarAccess.getAnimationTypeAccess().getMoveKeyword_0_1());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getAnimationTypeAccess().getJumpAction_1_0(),
						$current);
				}
			)
			otherlv_3='jump'
			{
				newLeafNode(otherlv_3, grammarAccess.getAnimationTypeAccess().getJumpKeyword_1_1());
			}
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
