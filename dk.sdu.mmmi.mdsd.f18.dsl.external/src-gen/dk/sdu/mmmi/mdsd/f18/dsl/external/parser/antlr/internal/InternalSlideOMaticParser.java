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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSlideOMaticParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'presentation'", "'{'", "'('", "')'", "'}'", "'theme'", "'color'", "'AnnArbor'", "'Antibes'", "'Bergen'", "'Berkeley'", "'Berlin'", "'Boadilla'", "'boxes'", "'CambridgeUS'", "'Copenhagen'", "'Darmstadt'", "'default'", "'Dresden'", "'Frankfurt'", "'Goettingen'", "'Hannover'", "'Ilmanau'", "'JuanLesPins'", "'Luebeck'", "'Madrid'", "'Malmoe'", "'Marburg'", "'Montpellier'", "'PaloAlto'", "'Pittsburgh'", "'Rochester'", "'Singapore'", "'Szeged'", "'Warsaw'", "'albatros'", "'beaver'", "'beetle'", "'crane'", "'dolphin'", "'dove'", "'fly'", "'lily'", "'orchid'", "'rose'", "'seagull'", "'seahorse'", "'sidebartab'", "'structure'", "'whale'", "'wolverine'", "'author'", "','", "'institute'", "'date'", "'slide'", "'*'", "'**'", "'***'", "'ToC'", "'>'", "'block'", "'#list'", "'-list'", "'##'", "'--'", "'img'", "'src'", "'topleft'", "'top'", "'topright'", "'left'", "'center'", "'right'", "'bottomleft'", "'bottom'", "'bottomright'", "'width'", "'height'", "'%'", "'tab'", "'['", "']'", "'$$'", "'animate'", "'to'", "'move'", "'jump'"
    };
    public static final int T__50=50;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int RULE_INT=6;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int T__84=84;
    public static final int T__85=85;
    public static final int T__86=86;
    public static final int T__87=87;

    // delegates
    // delegators


        public InternalSlideOMaticParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSlideOMaticParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSlideOMaticParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSlideOMatic.g"; }



     	private SlideOMaticGrammarAccess grammarAccess;

        public InternalSlideOMaticParser(TokenStream input, SlideOMaticGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Presentation";
       	}

       	@Override
       	protected SlideOMaticGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRulePresentation"
    // InternalSlideOMatic.g:64:1: entryRulePresentation returns [EObject current=null] : iv_rulePresentation= rulePresentation EOF ;
    public final EObject entryRulePresentation() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePresentation = null;


        try {
            // InternalSlideOMatic.g:64:53: (iv_rulePresentation= rulePresentation EOF )
            // InternalSlideOMatic.g:65:2: iv_rulePresentation= rulePresentation EOF
            {
             newCompositeNode(grammarAccess.getPresentationRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePresentation=rulePresentation();

            state._fsp--;

             current =iv_rulePresentation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePresentation"


    // $ANTLR start "rulePresentation"
    // InternalSlideOMatic.g:71:1: rulePresentation returns [EObject current=null] : (otherlv_0= 'presentation' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' (otherlv_3= '(' ( (lv_theme_4_0= ruleTheme ) )? ( (lv_authors_5_0= ruleAuthors ) )? ( (lv_institute_6_0= ruleInstitute ) )? ( (lv_date_7_0= ruleDate ) )? otherlv_8= ')' )? ( ( (lv_slides_9_0= ruleSlide ) ) | ( (lv_animations_10_0= ruleAnimation ) ) )* otherlv_11= '}' ) ;
    public final EObject rulePresentation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        EObject lv_theme_4_0 = null;

        EObject lv_authors_5_0 = null;

        EObject lv_institute_6_0 = null;

        EObject lv_date_7_0 = null;

        EObject lv_slides_9_0 = null;

        EObject lv_animations_10_0 = null;



        	enterRule();

        try {
            // InternalSlideOMatic.g:77:2: ( (otherlv_0= 'presentation' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' (otherlv_3= '(' ( (lv_theme_4_0= ruleTheme ) )? ( (lv_authors_5_0= ruleAuthors ) )? ( (lv_institute_6_0= ruleInstitute ) )? ( (lv_date_7_0= ruleDate ) )? otherlv_8= ')' )? ( ( (lv_slides_9_0= ruleSlide ) ) | ( (lv_animations_10_0= ruleAnimation ) ) )* otherlv_11= '}' ) )
            // InternalSlideOMatic.g:78:2: (otherlv_0= 'presentation' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' (otherlv_3= '(' ( (lv_theme_4_0= ruleTheme ) )? ( (lv_authors_5_0= ruleAuthors ) )? ( (lv_institute_6_0= ruleInstitute ) )? ( (lv_date_7_0= ruleDate ) )? otherlv_8= ')' )? ( ( (lv_slides_9_0= ruleSlide ) ) | ( (lv_animations_10_0= ruleAnimation ) ) )* otherlv_11= '}' )
            {
            // InternalSlideOMatic.g:78:2: (otherlv_0= 'presentation' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' (otherlv_3= '(' ( (lv_theme_4_0= ruleTheme ) )? ( (lv_authors_5_0= ruleAuthors ) )? ( (lv_institute_6_0= ruleInstitute ) )? ( (lv_date_7_0= ruleDate ) )? otherlv_8= ')' )? ( ( (lv_slides_9_0= ruleSlide ) ) | ( (lv_animations_10_0= ruleAnimation ) ) )* otherlv_11= '}' )
            // InternalSlideOMatic.g:79:3: otherlv_0= 'presentation' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' (otherlv_3= '(' ( (lv_theme_4_0= ruleTheme ) )? ( (lv_authors_5_0= ruleAuthors ) )? ( (lv_institute_6_0= ruleInstitute ) )? ( (lv_date_7_0= ruleDate ) )? otherlv_8= ')' )? ( ( (lv_slides_9_0= ruleSlide ) ) | ( (lv_animations_10_0= ruleAnimation ) ) )* otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPresentationAccess().getPresentationKeyword_0());
            		
            // InternalSlideOMatic.g:83:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalSlideOMatic.g:84:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalSlideOMatic.g:84:4: (lv_name_1_0= RULE_STRING )
            // InternalSlideOMatic.g:85:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPresentationAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPresentationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getPresentationAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSlideOMatic.g:105:3: (otherlv_3= '(' ( (lv_theme_4_0= ruleTheme ) )? ( (lv_authors_5_0= ruleAuthors ) )? ( (lv_institute_6_0= ruleInstitute ) )? ( (lv_date_7_0= ruleDate ) )? otherlv_8= ')' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalSlideOMatic.g:106:4: otherlv_3= '(' ( (lv_theme_4_0= ruleTheme ) )? ( (lv_authors_5_0= ruleAuthors ) )? ( (lv_institute_6_0= ruleInstitute ) )? ( (lv_date_7_0= ruleDate ) )? otherlv_8= ')'
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_6); 

                    				newLeafNode(otherlv_3, grammarAccess.getPresentationAccess().getLeftParenthesisKeyword_3_0());
                    			
                    // InternalSlideOMatic.g:110:4: ( (lv_theme_4_0= ruleTheme ) )?
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0==16) ) {
                        alt1=1;
                    }
                    switch (alt1) {
                        case 1 :
                            // InternalSlideOMatic.g:111:5: (lv_theme_4_0= ruleTheme )
                            {
                            // InternalSlideOMatic.g:111:5: (lv_theme_4_0= ruleTheme )
                            // InternalSlideOMatic.g:112:6: lv_theme_4_0= ruleTheme
                            {

                            						newCompositeNode(grammarAccess.getPresentationAccess().getThemeThemeParserRuleCall_3_1_0());
                            					
                            pushFollow(FOLLOW_7);
                            lv_theme_4_0=ruleTheme();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getPresentationRule());
                            						}
                            						set(
                            							current,
                            							"theme",
                            							lv_theme_4_0,
                            							"dk.sdu.mmmi.mdsd.f18.dsl.external.SlideOMatic.Theme");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    // InternalSlideOMatic.g:129:4: ( (lv_authors_5_0= ruleAuthors ) )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==62) ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // InternalSlideOMatic.g:130:5: (lv_authors_5_0= ruleAuthors )
                            {
                            // InternalSlideOMatic.g:130:5: (lv_authors_5_0= ruleAuthors )
                            // InternalSlideOMatic.g:131:6: lv_authors_5_0= ruleAuthors
                            {

                            						newCompositeNode(grammarAccess.getPresentationAccess().getAuthorsAuthorsParserRuleCall_3_2_0());
                            					
                            pushFollow(FOLLOW_8);
                            lv_authors_5_0=ruleAuthors();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getPresentationRule());
                            						}
                            						set(
                            							current,
                            							"authors",
                            							lv_authors_5_0,
                            							"dk.sdu.mmmi.mdsd.f18.dsl.external.SlideOMatic.Authors");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    // InternalSlideOMatic.g:148:4: ( (lv_institute_6_0= ruleInstitute ) )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==64) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // InternalSlideOMatic.g:149:5: (lv_institute_6_0= ruleInstitute )
                            {
                            // InternalSlideOMatic.g:149:5: (lv_institute_6_0= ruleInstitute )
                            // InternalSlideOMatic.g:150:6: lv_institute_6_0= ruleInstitute
                            {

                            						newCompositeNode(grammarAccess.getPresentationAccess().getInstituteInstituteParserRuleCall_3_3_0());
                            					
                            pushFollow(FOLLOW_9);
                            lv_institute_6_0=ruleInstitute();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getPresentationRule());
                            						}
                            						set(
                            							current,
                            							"institute",
                            							lv_institute_6_0,
                            							"dk.sdu.mmmi.mdsd.f18.dsl.external.SlideOMatic.Institute");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    // InternalSlideOMatic.g:167:4: ( (lv_date_7_0= ruleDate ) )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==65) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // InternalSlideOMatic.g:168:5: (lv_date_7_0= ruleDate )
                            {
                            // InternalSlideOMatic.g:168:5: (lv_date_7_0= ruleDate )
                            // InternalSlideOMatic.g:169:6: lv_date_7_0= ruleDate
                            {

                            						newCompositeNode(grammarAccess.getPresentationAccess().getDateDateParserRuleCall_3_4_0());
                            					
                            pushFollow(FOLLOW_10);
                            lv_date_7_0=ruleDate();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getPresentationRule());
                            						}
                            						set(
                            							current,
                            							"date",
                            							lv_date_7_0,
                            							"dk.sdu.mmmi.mdsd.f18.dsl.external.SlideOMatic.Date");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    otherlv_8=(Token)match(input,14,FOLLOW_11); 

                    				newLeafNode(otherlv_8, grammarAccess.getPresentationAccess().getRightParenthesisKeyword_3_5());
                    			

                    }
                    break;

            }

            // InternalSlideOMatic.g:191:3: ( ( (lv_slides_9_0= ruleSlide ) ) | ( (lv_animations_10_0= ruleAnimation ) ) )*
            loop6:
            do {
                int alt6=3;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==66) ) {
                    alt6=1;
                }
                else if ( (LA6_0==95) ) {
                    alt6=2;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalSlideOMatic.g:192:4: ( (lv_slides_9_0= ruleSlide ) )
            	    {
            	    // InternalSlideOMatic.g:192:4: ( (lv_slides_9_0= ruleSlide ) )
            	    // InternalSlideOMatic.g:193:5: (lv_slides_9_0= ruleSlide )
            	    {
            	    // InternalSlideOMatic.g:193:5: (lv_slides_9_0= ruleSlide )
            	    // InternalSlideOMatic.g:194:6: lv_slides_9_0= ruleSlide
            	    {

            	    						newCompositeNode(grammarAccess.getPresentationAccess().getSlidesSlideParserRuleCall_4_0_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_slides_9_0=ruleSlide();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPresentationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"slides",
            	    							lv_slides_9_0,
            	    							"dk.sdu.mmmi.mdsd.f18.dsl.external.SlideOMatic.Slide");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalSlideOMatic.g:212:4: ( (lv_animations_10_0= ruleAnimation ) )
            	    {
            	    // InternalSlideOMatic.g:212:4: ( (lv_animations_10_0= ruleAnimation ) )
            	    // InternalSlideOMatic.g:213:5: (lv_animations_10_0= ruleAnimation )
            	    {
            	    // InternalSlideOMatic.g:213:5: (lv_animations_10_0= ruleAnimation )
            	    // InternalSlideOMatic.g:214:6: lv_animations_10_0= ruleAnimation
            	    {

            	    						newCompositeNode(grammarAccess.getPresentationAccess().getAnimationsAnimationParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_animations_10_0=ruleAnimation();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPresentationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"animations",
            	    							lv_animations_10_0,
            	    							"dk.sdu.mmmi.mdsd.f18.dsl.external.SlideOMatic.Animation");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_11=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getPresentationAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePresentation"


    // $ANTLR start "entryRuleTheme"
    // InternalSlideOMatic.g:240:1: entryRuleTheme returns [EObject current=null] : iv_ruleTheme= ruleTheme EOF ;
    public final EObject entryRuleTheme() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTheme = null;


        try {
            // InternalSlideOMatic.g:240:46: (iv_ruleTheme= ruleTheme EOF )
            // InternalSlideOMatic.g:241:2: iv_ruleTheme= ruleTheme EOF
            {
             newCompositeNode(grammarAccess.getThemeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTheme=ruleTheme();

            state._fsp--;

             current =iv_ruleTheme; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTheme"


    // $ANTLR start "ruleTheme"
    // InternalSlideOMatic.g:247:1: ruleTheme returns [EObject current=null] : (otherlv_0= 'theme' ( (lv_theme_1_0= ruleBeamerTheme ) ) (otherlv_2= 'color' ( (lv_themeColor_3_0= ruleThemeColor ) ) )? ) ;
    public final EObject ruleTheme() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_theme_1_0 = null;

        AntlrDatatypeRuleToken lv_themeColor_3_0 = null;



        	enterRule();

        try {
            // InternalSlideOMatic.g:253:2: ( (otherlv_0= 'theme' ( (lv_theme_1_0= ruleBeamerTheme ) ) (otherlv_2= 'color' ( (lv_themeColor_3_0= ruleThemeColor ) ) )? ) )
            // InternalSlideOMatic.g:254:2: (otherlv_0= 'theme' ( (lv_theme_1_0= ruleBeamerTheme ) ) (otherlv_2= 'color' ( (lv_themeColor_3_0= ruleThemeColor ) ) )? )
            {
            // InternalSlideOMatic.g:254:2: (otherlv_0= 'theme' ( (lv_theme_1_0= ruleBeamerTheme ) ) (otherlv_2= 'color' ( (lv_themeColor_3_0= ruleThemeColor ) ) )? )
            // InternalSlideOMatic.g:255:3: otherlv_0= 'theme' ( (lv_theme_1_0= ruleBeamerTheme ) ) (otherlv_2= 'color' ( (lv_themeColor_3_0= ruleThemeColor ) ) )?
            {
            otherlv_0=(Token)match(input,16,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getThemeAccess().getThemeKeyword_0());
            		
            // InternalSlideOMatic.g:259:3: ( (lv_theme_1_0= ruleBeamerTheme ) )
            // InternalSlideOMatic.g:260:4: (lv_theme_1_0= ruleBeamerTheme )
            {
            // InternalSlideOMatic.g:260:4: (lv_theme_1_0= ruleBeamerTheme )
            // InternalSlideOMatic.g:261:5: lv_theme_1_0= ruleBeamerTheme
            {

            					newCompositeNode(grammarAccess.getThemeAccess().getThemeBeamerThemeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_13);
            lv_theme_1_0=ruleBeamerTheme();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getThemeRule());
            					}
            					set(
            						current,
            						"theme",
            						lv_theme_1_0,
            						"dk.sdu.mmmi.mdsd.f18.dsl.external.SlideOMatic.BeamerTheme");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSlideOMatic.g:278:3: (otherlv_2= 'color' ( (lv_themeColor_3_0= ruleThemeColor ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalSlideOMatic.g:279:4: otherlv_2= 'color' ( (lv_themeColor_3_0= ruleThemeColor ) )
                    {
                    otherlv_2=(Token)match(input,17,FOLLOW_14); 

                    				newLeafNode(otherlv_2, grammarAccess.getThemeAccess().getColorKeyword_2_0());
                    			
                    // InternalSlideOMatic.g:283:4: ( (lv_themeColor_3_0= ruleThemeColor ) )
                    // InternalSlideOMatic.g:284:5: (lv_themeColor_3_0= ruleThemeColor )
                    {
                    // InternalSlideOMatic.g:284:5: (lv_themeColor_3_0= ruleThemeColor )
                    // InternalSlideOMatic.g:285:6: lv_themeColor_3_0= ruleThemeColor
                    {

                    						newCompositeNode(grammarAccess.getThemeAccess().getThemeColorThemeColorParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_themeColor_3_0=ruleThemeColor();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getThemeRule());
                    						}
                    						set(
                    							current,
                    							"themeColor",
                    							lv_themeColor_3_0,
                    							"dk.sdu.mmmi.mdsd.f18.dsl.external.SlideOMatic.ThemeColor");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTheme"


    // $ANTLR start "entryRuleBeamerTheme"
    // InternalSlideOMatic.g:307:1: entryRuleBeamerTheme returns [String current=null] : iv_ruleBeamerTheme= ruleBeamerTheme EOF ;
    public final String entryRuleBeamerTheme() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBeamerTheme = null;


        try {
            // InternalSlideOMatic.g:307:51: (iv_ruleBeamerTheme= ruleBeamerTheme EOF )
            // InternalSlideOMatic.g:308:2: iv_ruleBeamerTheme= ruleBeamerTheme EOF
            {
             newCompositeNode(grammarAccess.getBeamerThemeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBeamerTheme=ruleBeamerTheme();

            state._fsp--;

             current =iv_ruleBeamerTheme.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBeamerTheme"


    // $ANTLR start "ruleBeamerTheme"
    // InternalSlideOMatic.g:314:1: ruleBeamerTheme returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'AnnArbor' | kw= 'Antibes' | kw= 'Bergen' | kw= 'Berkeley' | kw= 'Berlin' | kw= 'Boadilla' | kw= 'boxes' | kw= 'CambridgeUS' | kw= 'Copenhagen' | kw= 'Darmstadt' | kw= 'default' | kw= 'Dresden' | kw= 'Frankfurt' | kw= 'Goettingen' | kw= 'Hannover' | kw= 'Ilmanau' | kw= 'JuanLesPins' | kw= 'Luebeck' | kw= 'Madrid' | kw= 'Malmoe' | kw= 'Marburg' | kw= 'Montpellier' | kw= 'PaloAlto' | kw= 'Pittsburgh' | kw= 'Rochester' | kw= 'Singapore' | kw= 'Szeged' | kw= 'Warsaw' ) ;
    public final AntlrDatatypeRuleToken ruleBeamerTheme() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSlideOMatic.g:320:2: ( (kw= 'AnnArbor' | kw= 'Antibes' | kw= 'Bergen' | kw= 'Berkeley' | kw= 'Berlin' | kw= 'Boadilla' | kw= 'boxes' | kw= 'CambridgeUS' | kw= 'Copenhagen' | kw= 'Darmstadt' | kw= 'default' | kw= 'Dresden' | kw= 'Frankfurt' | kw= 'Goettingen' | kw= 'Hannover' | kw= 'Ilmanau' | kw= 'JuanLesPins' | kw= 'Luebeck' | kw= 'Madrid' | kw= 'Malmoe' | kw= 'Marburg' | kw= 'Montpellier' | kw= 'PaloAlto' | kw= 'Pittsburgh' | kw= 'Rochester' | kw= 'Singapore' | kw= 'Szeged' | kw= 'Warsaw' ) )
            // InternalSlideOMatic.g:321:2: (kw= 'AnnArbor' | kw= 'Antibes' | kw= 'Bergen' | kw= 'Berkeley' | kw= 'Berlin' | kw= 'Boadilla' | kw= 'boxes' | kw= 'CambridgeUS' | kw= 'Copenhagen' | kw= 'Darmstadt' | kw= 'default' | kw= 'Dresden' | kw= 'Frankfurt' | kw= 'Goettingen' | kw= 'Hannover' | kw= 'Ilmanau' | kw= 'JuanLesPins' | kw= 'Luebeck' | kw= 'Madrid' | kw= 'Malmoe' | kw= 'Marburg' | kw= 'Montpellier' | kw= 'PaloAlto' | kw= 'Pittsburgh' | kw= 'Rochester' | kw= 'Singapore' | kw= 'Szeged' | kw= 'Warsaw' )
            {
            // InternalSlideOMatic.g:321:2: (kw= 'AnnArbor' | kw= 'Antibes' | kw= 'Bergen' | kw= 'Berkeley' | kw= 'Berlin' | kw= 'Boadilla' | kw= 'boxes' | kw= 'CambridgeUS' | kw= 'Copenhagen' | kw= 'Darmstadt' | kw= 'default' | kw= 'Dresden' | kw= 'Frankfurt' | kw= 'Goettingen' | kw= 'Hannover' | kw= 'Ilmanau' | kw= 'JuanLesPins' | kw= 'Luebeck' | kw= 'Madrid' | kw= 'Malmoe' | kw= 'Marburg' | kw= 'Montpellier' | kw= 'PaloAlto' | kw= 'Pittsburgh' | kw= 'Rochester' | kw= 'Singapore' | kw= 'Szeged' | kw= 'Warsaw' )
            int alt8=28;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt8=1;
                }
                break;
            case 19:
                {
                alt8=2;
                }
                break;
            case 20:
                {
                alt8=3;
                }
                break;
            case 21:
                {
                alt8=4;
                }
                break;
            case 22:
                {
                alt8=5;
                }
                break;
            case 23:
                {
                alt8=6;
                }
                break;
            case 24:
                {
                alt8=7;
                }
                break;
            case 25:
                {
                alt8=8;
                }
                break;
            case 26:
                {
                alt8=9;
                }
                break;
            case 27:
                {
                alt8=10;
                }
                break;
            case 28:
                {
                alt8=11;
                }
                break;
            case 29:
                {
                alt8=12;
                }
                break;
            case 30:
                {
                alt8=13;
                }
                break;
            case 31:
                {
                alt8=14;
                }
                break;
            case 32:
                {
                alt8=15;
                }
                break;
            case 33:
                {
                alt8=16;
                }
                break;
            case 34:
                {
                alt8=17;
                }
                break;
            case 35:
                {
                alt8=18;
                }
                break;
            case 36:
                {
                alt8=19;
                }
                break;
            case 37:
                {
                alt8=20;
                }
                break;
            case 38:
                {
                alt8=21;
                }
                break;
            case 39:
                {
                alt8=22;
                }
                break;
            case 40:
                {
                alt8=23;
                }
                break;
            case 41:
                {
                alt8=24;
                }
                break;
            case 42:
                {
                alt8=25;
                }
                break;
            case 43:
                {
                alt8=26;
                }
                break;
            case 44:
                {
                alt8=27;
                }
                break;
            case 45:
                {
                alt8=28;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalSlideOMatic.g:322:3: kw= 'AnnArbor'
                    {
                    kw=(Token)match(input,18,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBeamerThemeAccess().getAnnArborKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSlideOMatic.g:328:3: kw= 'Antibes'
                    {
                    kw=(Token)match(input,19,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBeamerThemeAccess().getAntibesKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalSlideOMatic.g:334:3: kw= 'Bergen'
                    {
                    kw=(Token)match(input,20,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBeamerThemeAccess().getBergenKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalSlideOMatic.g:340:3: kw= 'Berkeley'
                    {
                    kw=(Token)match(input,21,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBeamerThemeAccess().getBerkeleyKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalSlideOMatic.g:346:3: kw= 'Berlin'
                    {
                    kw=(Token)match(input,22,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBeamerThemeAccess().getBerlinKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalSlideOMatic.g:352:3: kw= 'Boadilla'
                    {
                    kw=(Token)match(input,23,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBeamerThemeAccess().getBoadillaKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalSlideOMatic.g:358:3: kw= 'boxes'
                    {
                    kw=(Token)match(input,24,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBeamerThemeAccess().getBoxesKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalSlideOMatic.g:364:3: kw= 'CambridgeUS'
                    {
                    kw=(Token)match(input,25,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBeamerThemeAccess().getCambridgeUSKeyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalSlideOMatic.g:370:3: kw= 'Copenhagen'
                    {
                    kw=(Token)match(input,26,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBeamerThemeAccess().getCopenhagenKeyword_8());
                    		

                    }
                    break;
                case 10 :
                    // InternalSlideOMatic.g:376:3: kw= 'Darmstadt'
                    {
                    kw=(Token)match(input,27,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBeamerThemeAccess().getDarmstadtKeyword_9());
                    		

                    }
                    break;
                case 11 :
                    // InternalSlideOMatic.g:382:3: kw= 'default'
                    {
                    kw=(Token)match(input,28,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBeamerThemeAccess().getDefaultKeyword_10());
                    		

                    }
                    break;
                case 12 :
                    // InternalSlideOMatic.g:388:3: kw= 'Dresden'
                    {
                    kw=(Token)match(input,29,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBeamerThemeAccess().getDresdenKeyword_11());
                    		

                    }
                    break;
                case 13 :
                    // InternalSlideOMatic.g:394:3: kw= 'Frankfurt'
                    {
                    kw=(Token)match(input,30,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBeamerThemeAccess().getFrankfurtKeyword_12());
                    		

                    }
                    break;
                case 14 :
                    // InternalSlideOMatic.g:400:3: kw= 'Goettingen'
                    {
                    kw=(Token)match(input,31,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBeamerThemeAccess().getGoettingenKeyword_13());
                    		

                    }
                    break;
                case 15 :
                    // InternalSlideOMatic.g:406:3: kw= 'Hannover'
                    {
                    kw=(Token)match(input,32,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBeamerThemeAccess().getHannoverKeyword_14());
                    		

                    }
                    break;
                case 16 :
                    // InternalSlideOMatic.g:412:3: kw= 'Ilmanau'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBeamerThemeAccess().getIlmanauKeyword_15());
                    		

                    }
                    break;
                case 17 :
                    // InternalSlideOMatic.g:418:3: kw= 'JuanLesPins'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBeamerThemeAccess().getJuanLesPinsKeyword_16());
                    		

                    }
                    break;
                case 18 :
                    // InternalSlideOMatic.g:424:3: kw= 'Luebeck'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBeamerThemeAccess().getLuebeckKeyword_17());
                    		

                    }
                    break;
                case 19 :
                    // InternalSlideOMatic.g:430:3: kw= 'Madrid'
                    {
                    kw=(Token)match(input,36,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBeamerThemeAccess().getMadridKeyword_18());
                    		

                    }
                    break;
                case 20 :
                    // InternalSlideOMatic.g:436:3: kw= 'Malmoe'
                    {
                    kw=(Token)match(input,37,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBeamerThemeAccess().getMalmoeKeyword_19());
                    		

                    }
                    break;
                case 21 :
                    // InternalSlideOMatic.g:442:3: kw= 'Marburg'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBeamerThemeAccess().getMarburgKeyword_20());
                    		

                    }
                    break;
                case 22 :
                    // InternalSlideOMatic.g:448:3: kw= 'Montpellier'
                    {
                    kw=(Token)match(input,39,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBeamerThemeAccess().getMontpellierKeyword_21());
                    		

                    }
                    break;
                case 23 :
                    // InternalSlideOMatic.g:454:3: kw= 'PaloAlto'
                    {
                    kw=(Token)match(input,40,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBeamerThemeAccess().getPaloAltoKeyword_22());
                    		

                    }
                    break;
                case 24 :
                    // InternalSlideOMatic.g:460:3: kw= 'Pittsburgh'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBeamerThemeAccess().getPittsburghKeyword_23());
                    		

                    }
                    break;
                case 25 :
                    // InternalSlideOMatic.g:466:3: kw= 'Rochester'
                    {
                    kw=(Token)match(input,42,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBeamerThemeAccess().getRochesterKeyword_24());
                    		

                    }
                    break;
                case 26 :
                    // InternalSlideOMatic.g:472:3: kw= 'Singapore'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBeamerThemeAccess().getSingaporeKeyword_25());
                    		

                    }
                    break;
                case 27 :
                    // InternalSlideOMatic.g:478:3: kw= 'Szeged'
                    {
                    kw=(Token)match(input,44,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBeamerThemeAccess().getSzegedKeyword_26());
                    		

                    }
                    break;
                case 28 :
                    // InternalSlideOMatic.g:484:3: kw= 'Warsaw'
                    {
                    kw=(Token)match(input,45,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBeamerThemeAccess().getWarsawKeyword_27());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBeamerTheme"


    // $ANTLR start "entryRuleThemeColor"
    // InternalSlideOMatic.g:493:1: entryRuleThemeColor returns [String current=null] : iv_ruleThemeColor= ruleThemeColor EOF ;
    public final String entryRuleThemeColor() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleThemeColor = null;


        try {
            // InternalSlideOMatic.g:493:50: (iv_ruleThemeColor= ruleThemeColor EOF )
            // InternalSlideOMatic.g:494:2: iv_ruleThemeColor= ruleThemeColor EOF
            {
             newCompositeNode(grammarAccess.getThemeColorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleThemeColor=ruleThemeColor();

            state._fsp--;

             current =iv_ruleThemeColor.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleThemeColor"


    // $ANTLR start "ruleThemeColor"
    // InternalSlideOMatic.g:500:1: ruleThemeColor returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'albatros' | kw= 'beaver' | kw= 'beetle' | kw= 'crane' | kw= 'default' | kw= 'dolphin' | kw= 'dove' | kw= 'fly' | kw= 'lily' | kw= 'orchid' | kw= 'rose' | kw= 'seagull' | kw= 'seahorse' | kw= 'sidebartab' | kw= 'structure' | kw= 'whale' | kw= 'wolverine' ) ;
    public final AntlrDatatypeRuleToken ruleThemeColor() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSlideOMatic.g:506:2: ( (kw= 'albatros' | kw= 'beaver' | kw= 'beetle' | kw= 'crane' | kw= 'default' | kw= 'dolphin' | kw= 'dove' | kw= 'fly' | kw= 'lily' | kw= 'orchid' | kw= 'rose' | kw= 'seagull' | kw= 'seahorse' | kw= 'sidebartab' | kw= 'structure' | kw= 'whale' | kw= 'wolverine' ) )
            // InternalSlideOMatic.g:507:2: (kw= 'albatros' | kw= 'beaver' | kw= 'beetle' | kw= 'crane' | kw= 'default' | kw= 'dolphin' | kw= 'dove' | kw= 'fly' | kw= 'lily' | kw= 'orchid' | kw= 'rose' | kw= 'seagull' | kw= 'seahorse' | kw= 'sidebartab' | kw= 'structure' | kw= 'whale' | kw= 'wolverine' )
            {
            // InternalSlideOMatic.g:507:2: (kw= 'albatros' | kw= 'beaver' | kw= 'beetle' | kw= 'crane' | kw= 'default' | kw= 'dolphin' | kw= 'dove' | kw= 'fly' | kw= 'lily' | kw= 'orchid' | kw= 'rose' | kw= 'seagull' | kw= 'seahorse' | kw= 'sidebartab' | kw= 'structure' | kw= 'whale' | kw= 'wolverine' )
            int alt9=17;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt9=1;
                }
                break;
            case 47:
                {
                alt9=2;
                }
                break;
            case 48:
                {
                alt9=3;
                }
                break;
            case 49:
                {
                alt9=4;
                }
                break;
            case 28:
                {
                alt9=5;
                }
                break;
            case 50:
                {
                alt9=6;
                }
                break;
            case 51:
                {
                alt9=7;
                }
                break;
            case 52:
                {
                alt9=8;
                }
                break;
            case 53:
                {
                alt9=9;
                }
                break;
            case 54:
                {
                alt9=10;
                }
                break;
            case 55:
                {
                alt9=11;
                }
                break;
            case 56:
                {
                alt9=12;
                }
                break;
            case 57:
                {
                alt9=13;
                }
                break;
            case 58:
                {
                alt9=14;
                }
                break;
            case 59:
                {
                alt9=15;
                }
                break;
            case 60:
                {
                alt9=16;
                }
                break;
            case 61:
                {
                alt9=17;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalSlideOMatic.g:508:3: kw= 'albatros'
                    {
                    kw=(Token)match(input,46,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getThemeColorAccess().getAlbatrosKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSlideOMatic.g:514:3: kw= 'beaver'
                    {
                    kw=(Token)match(input,47,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getThemeColorAccess().getBeaverKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalSlideOMatic.g:520:3: kw= 'beetle'
                    {
                    kw=(Token)match(input,48,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getThemeColorAccess().getBeetleKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalSlideOMatic.g:526:3: kw= 'crane'
                    {
                    kw=(Token)match(input,49,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getThemeColorAccess().getCraneKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalSlideOMatic.g:532:3: kw= 'default'
                    {
                    kw=(Token)match(input,28,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getThemeColorAccess().getDefaultKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalSlideOMatic.g:538:3: kw= 'dolphin'
                    {
                    kw=(Token)match(input,50,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getThemeColorAccess().getDolphinKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalSlideOMatic.g:544:3: kw= 'dove'
                    {
                    kw=(Token)match(input,51,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getThemeColorAccess().getDoveKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalSlideOMatic.g:550:3: kw= 'fly'
                    {
                    kw=(Token)match(input,52,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getThemeColorAccess().getFlyKeyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalSlideOMatic.g:556:3: kw= 'lily'
                    {
                    kw=(Token)match(input,53,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getThemeColorAccess().getLilyKeyword_8());
                    		

                    }
                    break;
                case 10 :
                    // InternalSlideOMatic.g:562:3: kw= 'orchid'
                    {
                    kw=(Token)match(input,54,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getThemeColorAccess().getOrchidKeyword_9());
                    		

                    }
                    break;
                case 11 :
                    // InternalSlideOMatic.g:568:3: kw= 'rose'
                    {
                    kw=(Token)match(input,55,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getThemeColorAccess().getRoseKeyword_10());
                    		

                    }
                    break;
                case 12 :
                    // InternalSlideOMatic.g:574:3: kw= 'seagull'
                    {
                    kw=(Token)match(input,56,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getThemeColorAccess().getSeagullKeyword_11());
                    		

                    }
                    break;
                case 13 :
                    // InternalSlideOMatic.g:580:3: kw= 'seahorse'
                    {
                    kw=(Token)match(input,57,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getThemeColorAccess().getSeahorseKeyword_12());
                    		

                    }
                    break;
                case 14 :
                    // InternalSlideOMatic.g:586:3: kw= 'sidebartab'
                    {
                    kw=(Token)match(input,58,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getThemeColorAccess().getSidebartabKeyword_13());
                    		

                    }
                    break;
                case 15 :
                    // InternalSlideOMatic.g:592:3: kw= 'structure'
                    {
                    kw=(Token)match(input,59,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getThemeColorAccess().getStructureKeyword_14());
                    		

                    }
                    break;
                case 16 :
                    // InternalSlideOMatic.g:598:3: kw= 'whale'
                    {
                    kw=(Token)match(input,60,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getThemeColorAccess().getWhaleKeyword_15());
                    		

                    }
                    break;
                case 17 :
                    // InternalSlideOMatic.g:604:3: kw= 'wolverine'
                    {
                    kw=(Token)match(input,61,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getThemeColorAccess().getWolverineKeyword_16());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleThemeColor"


    // $ANTLR start "entryRuleAuthors"
    // InternalSlideOMatic.g:613:1: entryRuleAuthors returns [EObject current=null] : iv_ruleAuthors= ruleAuthors EOF ;
    public final EObject entryRuleAuthors() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAuthors = null;


        try {
            // InternalSlideOMatic.g:613:48: (iv_ruleAuthors= ruleAuthors EOF )
            // InternalSlideOMatic.g:614:2: iv_ruleAuthors= ruleAuthors EOF
            {
             newCompositeNode(grammarAccess.getAuthorsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAuthors=ruleAuthors();

            state._fsp--;

             current =iv_ruleAuthors; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAuthors"


    // $ANTLR start "ruleAuthors"
    // InternalSlideOMatic.g:620:1: ruleAuthors returns [EObject current=null] : (otherlv_0= 'author' ( (lv_names_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_names_3_0= RULE_STRING ) ) )* ) ;
    public final EObject ruleAuthors() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_names_1_0=null;
        Token otherlv_2=null;
        Token lv_names_3_0=null;


        	enterRule();

        try {
            // InternalSlideOMatic.g:626:2: ( (otherlv_0= 'author' ( (lv_names_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_names_3_0= RULE_STRING ) ) )* ) )
            // InternalSlideOMatic.g:627:2: (otherlv_0= 'author' ( (lv_names_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_names_3_0= RULE_STRING ) ) )* )
            {
            // InternalSlideOMatic.g:627:2: (otherlv_0= 'author' ( (lv_names_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_names_3_0= RULE_STRING ) ) )* )
            // InternalSlideOMatic.g:628:3: otherlv_0= 'author' ( (lv_names_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_names_3_0= RULE_STRING ) ) )*
            {
            otherlv_0=(Token)match(input,62,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAuthorsAccess().getAuthorKeyword_0());
            		
            // InternalSlideOMatic.g:632:3: ( (lv_names_1_0= RULE_STRING ) )
            // InternalSlideOMatic.g:633:4: (lv_names_1_0= RULE_STRING )
            {
            // InternalSlideOMatic.g:633:4: (lv_names_1_0= RULE_STRING )
            // InternalSlideOMatic.g:634:5: lv_names_1_0= RULE_STRING
            {
            lv_names_1_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

            					newLeafNode(lv_names_1_0, grammarAccess.getAuthorsAccess().getNamesSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAuthorsRule());
            					}
            					addWithLastConsumed(
            						current,
            						"names",
            						lv_names_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalSlideOMatic.g:650:3: (otherlv_2= ',' ( (lv_names_3_0= RULE_STRING ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==63) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalSlideOMatic.g:651:4: otherlv_2= ',' ( (lv_names_3_0= RULE_STRING ) )
            	    {
            	    otherlv_2=(Token)match(input,63,FOLLOW_3); 

            	    				newLeafNode(otherlv_2, grammarAccess.getAuthorsAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalSlideOMatic.g:655:4: ( (lv_names_3_0= RULE_STRING ) )
            	    // InternalSlideOMatic.g:656:5: (lv_names_3_0= RULE_STRING )
            	    {
            	    // InternalSlideOMatic.g:656:5: (lv_names_3_0= RULE_STRING )
            	    // InternalSlideOMatic.g:657:6: lv_names_3_0= RULE_STRING
            	    {
            	    lv_names_3_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

            	    						newLeafNode(lv_names_3_0, grammarAccess.getAuthorsAccess().getNamesSTRINGTerminalRuleCall_2_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getAuthorsRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"names",
            	    							lv_names_3_0,
            	    							"org.eclipse.xtext.common.Terminals.STRING");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAuthors"


    // $ANTLR start "entryRuleInstitute"
    // InternalSlideOMatic.g:678:1: entryRuleInstitute returns [EObject current=null] : iv_ruleInstitute= ruleInstitute EOF ;
    public final EObject entryRuleInstitute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstitute = null;


        try {
            // InternalSlideOMatic.g:678:50: (iv_ruleInstitute= ruleInstitute EOF )
            // InternalSlideOMatic.g:679:2: iv_ruleInstitute= ruleInstitute EOF
            {
             newCompositeNode(grammarAccess.getInstituteRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInstitute=ruleInstitute();

            state._fsp--;

             current =iv_ruleInstitute; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInstitute"


    // $ANTLR start "ruleInstitute"
    // InternalSlideOMatic.g:685:1: ruleInstitute returns [EObject current=null] : (otherlv_0= 'institute' ( (lv_name_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleInstitute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalSlideOMatic.g:691:2: ( (otherlv_0= 'institute' ( (lv_name_1_0= RULE_STRING ) ) ) )
            // InternalSlideOMatic.g:692:2: (otherlv_0= 'institute' ( (lv_name_1_0= RULE_STRING ) ) )
            {
            // InternalSlideOMatic.g:692:2: (otherlv_0= 'institute' ( (lv_name_1_0= RULE_STRING ) ) )
            // InternalSlideOMatic.g:693:3: otherlv_0= 'institute' ( (lv_name_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,64,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getInstituteAccess().getInstituteKeyword_0());
            		
            // InternalSlideOMatic.g:697:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalSlideOMatic.g:698:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalSlideOMatic.g:698:4: (lv_name_1_0= RULE_STRING )
            // InternalSlideOMatic.g:699:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getInstituteAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInstituteRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInstitute"


    // $ANTLR start "entryRuleDate"
    // InternalSlideOMatic.g:719:1: entryRuleDate returns [EObject current=null] : iv_ruleDate= ruleDate EOF ;
    public final EObject entryRuleDate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDate = null;


        try {
            // InternalSlideOMatic.g:719:45: (iv_ruleDate= ruleDate EOF )
            // InternalSlideOMatic.g:720:2: iv_ruleDate= ruleDate EOF
            {
             newCompositeNode(grammarAccess.getDateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDate=ruleDate();

            state._fsp--;

             current =iv_ruleDate; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDate"


    // $ANTLR start "ruleDate"
    // InternalSlideOMatic.g:726:1: ruleDate returns [EObject current=null] : (otherlv_0= 'date' ( (lv_date_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleDate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_date_1_0=null;


        	enterRule();

        try {
            // InternalSlideOMatic.g:732:2: ( (otherlv_0= 'date' ( (lv_date_1_0= RULE_STRING ) ) ) )
            // InternalSlideOMatic.g:733:2: (otherlv_0= 'date' ( (lv_date_1_0= RULE_STRING ) ) )
            {
            // InternalSlideOMatic.g:733:2: (otherlv_0= 'date' ( (lv_date_1_0= RULE_STRING ) ) )
            // InternalSlideOMatic.g:734:3: otherlv_0= 'date' ( (lv_date_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,65,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDateAccess().getDateKeyword_0());
            		
            // InternalSlideOMatic.g:738:3: ( (lv_date_1_0= RULE_STRING ) )
            // InternalSlideOMatic.g:739:4: (lv_date_1_0= RULE_STRING )
            {
            // InternalSlideOMatic.g:739:4: (lv_date_1_0= RULE_STRING )
            // InternalSlideOMatic.g:740:5: lv_date_1_0= RULE_STRING
            {
            lv_date_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_date_1_0, grammarAccess.getDateAccess().getDateSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDateRule());
            					}
            					setWithLastConsumed(
            						current,
            						"date",
            						lv_date_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDate"


    // $ANTLR start "entryRuleSlide"
    // InternalSlideOMatic.g:760:1: entryRuleSlide returns [EObject current=null] : iv_ruleSlide= ruleSlide EOF ;
    public final EObject entryRuleSlide() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlide = null;


        try {
            // InternalSlideOMatic.g:760:46: (iv_ruleSlide= ruleSlide EOF )
            // InternalSlideOMatic.g:761:2: iv_ruleSlide= ruleSlide EOF
            {
             newCompositeNode(grammarAccess.getSlideRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSlide=ruleSlide();

            state._fsp--;

             current =iv_ruleSlide; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSlide"


    // $ANTLR start "ruleSlide"
    // InternalSlideOMatic.g:767:1: ruleSlide returns [EObject current=null] : (otherlv_0= 'slide' ( (this_Section_1= ruleSection ( (lv_name_2_0= RULE_STRING ) ) ) | ( (lv_name_3_0= RULE_STRING ) ) )? otherlv_4= '{' ( (lv_contents_5_0= ruleContent ) )+ otherlv_6= '}' ) ;
    public final EObject ruleSlide() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject this_Section_1 = null;

        EObject lv_contents_5_0 = null;



        	enterRule();

        try {
            // InternalSlideOMatic.g:773:2: ( (otherlv_0= 'slide' ( (this_Section_1= ruleSection ( (lv_name_2_0= RULE_STRING ) ) ) | ( (lv_name_3_0= RULE_STRING ) ) )? otherlv_4= '{' ( (lv_contents_5_0= ruleContent ) )+ otherlv_6= '}' ) )
            // InternalSlideOMatic.g:774:2: (otherlv_0= 'slide' ( (this_Section_1= ruleSection ( (lv_name_2_0= RULE_STRING ) ) ) | ( (lv_name_3_0= RULE_STRING ) ) )? otherlv_4= '{' ( (lv_contents_5_0= ruleContent ) )+ otherlv_6= '}' )
            {
            // InternalSlideOMatic.g:774:2: (otherlv_0= 'slide' ( (this_Section_1= ruleSection ( (lv_name_2_0= RULE_STRING ) ) ) | ( (lv_name_3_0= RULE_STRING ) ) )? otherlv_4= '{' ( (lv_contents_5_0= ruleContent ) )+ otherlv_6= '}' )
            // InternalSlideOMatic.g:775:3: otherlv_0= 'slide' ( (this_Section_1= ruleSection ( (lv_name_2_0= RULE_STRING ) ) ) | ( (lv_name_3_0= RULE_STRING ) ) )? otherlv_4= '{' ( (lv_contents_5_0= ruleContent ) )+ otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,66,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getSlideAccess().getSlideKeyword_0());
            		
            // InternalSlideOMatic.g:779:3: ( (this_Section_1= ruleSection ( (lv_name_2_0= RULE_STRING ) ) ) | ( (lv_name_3_0= RULE_STRING ) ) )?
            int alt11=3;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=67 && LA11_0<=69)) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_STRING) ) {
                alt11=2;
            }
            switch (alt11) {
                case 1 :
                    // InternalSlideOMatic.g:780:4: (this_Section_1= ruleSection ( (lv_name_2_0= RULE_STRING ) ) )
                    {
                    // InternalSlideOMatic.g:780:4: (this_Section_1= ruleSection ( (lv_name_2_0= RULE_STRING ) ) )
                    // InternalSlideOMatic.g:781:5: this_Section_1= ruleSection ( (lv_name_2_0= RULE_STRING ) )
                    {

                    					newCompositeNode(grammarAccess.getSlideAccess().getSectionParserRuleCall_1_0_0());
                    				
                    pushFollow(FOLLOW_3);
                    this_Section_1=ruleSection();

                    state._fsp--;


                    					current = this_Section_1;
                    					afterParserOrEnumRuleCall();
                    				
                    // InternalSlideOMatic.g:789:5: ( (lv_name_2_0= RULE_STRING ) )
                    // InternalSlideOMatic.g:790:6: (lv_name_2_0= RULE_STRING )
                    {
                    // InternalSlideOMatic.g:790:6: (lv_name_2_0= RULE_STRING )
                    // InternalSlideOMatic.g:791:7: lv_name_2_0= RULE_STRING
                    {
                    lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

                    							newLeafNode(lv_name_2_0, grammarAccess.getSlideAccess().getNameSTRINGTerminalRuleCall_1_0_1_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getSlideRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"name",
                    								lv_name_2_0,
                    								"org.eclipse.xtext.common.Terminals.STRING");
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSlideOMatic.g:809:4: ( (lv_name_3_0= RULE_STRING ) )
                    {
                    // InternalSlideOMatic.g:809:4: ( (lv_name_3_0= RULE_STRING ) )
                    // InternalSlideOMatic.g:810:5: (lv_name_3_0= RULE_STRING )
                    {
                    // InternalSlideOMatic.g:810:5: (lv_name_3_0= RULE_STRING )
                    // InternalSlideOMatic.g:811:6: lv_name_3_0= RULE_STRING
                    {
                    lv_name_3_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

                    						newLeafNode(lv_name_3_0, grammarAccess.getSlideAccess().getNameSTRINGTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSlideRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_3_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_4, grammarAccess.getSlideAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSlideOMatic.g:832:3: ( (lv_contents_5_0= ruleContent ) )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=70 && LA12_0<=74)||LA12_0==77||LA12_0==91) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalSlideOMatic.g:833:4: (lv_contents_5_0= ruleContent )
            	    {
            	    // InternalSlideOMatic.g:833:4: (lv_contents_5_0= ruleContent )
            	    // InternalSlideOMatic.g:834:5: lv_contents_5_0= ruleContent
            	    {

            	    					newCompositeNode(grammarAccess.getSlideAccess().getContentsContentParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_18);
            	    lv_contents_5_0=ruleContent();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSlideRule());
            	    					}
            	    					add(
            	    						current,
            	    						"contents",
            	    						lv_contents_5_0,
            	    						"dk.sdu.mmmi.mdsd.f18.dsl.external.SlideOMatic.Content");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getSlideAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSlide"


    // $ANTLR start "entryRuleSection"
    // InternalSlideOMatic.g:859:1: entryRuleSection returns [EObject current=null] : iv_ruleSection= ruleSection EOF ;
    public final EObject entryRuleSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSection = null;


        try {
            // InternalSlideOMatic.g:859:48: (iv_ruleSection= ruleSection EOF )
            // InternalSlideOMatic.g:860:2: iv_ruleSection= ruleSection EOF
            {
             newCompositeNode(grammarAccess.getSectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSection=ruleSection();

            state._fsp--;

             current =iv_ruleSection; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSection"


    // $ANTLR start "ruleSection"
    // InternalSlideOMatic.g:866:1: ruleSection returns [EObject current=null] : ( ( () otherlv_1= '*' ) | ( () otherlv_3= '**' ) | ( () otherlv_5= '***' ) ) ;
    public final EObject ruleSection() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalSlideOMatic.g:872:2: ( ( ( () otherlv_1= '*' ) | ( () otherlv_3= '**' ) | ( () otherlv_5= '***' ) ) )
            // InternalSlideOMatic.g:873:2: ( ( () otherlv_1= '*' ) | ( () otherlv_3= '**' ) | ( () otherlv_5= '***' ) )
            {
            // InternalSlideOMatic.g:873:2: ( ( () otherlv_1= '*' ) | ( () otherlv_3= '**' ) | ( () otherlv_5= '***' ) )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 67:
                {
                alt13=1;
                }
                break;
            case 68:
                {
                alt13=2;
                }
                break;
            case 69:
                {
                alt13=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalSlideOMatic.g:874:3: ( () otherlv_1= '*' )
                    {
                    // InternalSlideOMatic.g:874:3: ( () otherlv_1= '*' )
                    // InternalSlideOMatic.g:875:4: () otherlv_1= '*'
                    {
                    // InternalSlideOMatic.g:875:4: ()
                    // InternalSlideOMatic.g:876:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSectionAccess().getSecAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,67,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getSectionAccess().getAsteriskKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSlideOMatic.g:888:3: ( () otherlv_3= '**' )
                    {
                    // InternalSlideOMatic.g:888:3: ( () otherlv_3= '**' )
                    // InternalSlideOMatic.g:889:4: () otherlv_3= '**'
                    {
                    // InternalSlideOMatic.g:889:4: ()
                    // InternalSlideOMatic.g:890:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSectionAccess().getSubSecAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_3=(Token)match(input,68,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getSectionAccess().getAsteriskAsteriskKeyword_1_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSlideOMatic.g:902:3: ( () otherlv_5= '***' )
                    {
                    // InternalSlideOMatic.g:902:3: ( () otherlv_5= '***' )
                    // InternalSlideOMatic.g:903:4: () otherlv_5= '***'
                    {
                    // InternalSlideOMatic.g:903:4: ()
                    // InternalSlideOMatic.g:904:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSectionAccess().getSubSubSecAction_2_0(),
                    						current);
                    				

                    }

                    otherlv_5=(Token)match(input,69,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getSectionAccess().getAsteriskAsteriskAsteriskKeyword_2_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSection"


    // $ANTLR start "entryRuleContent"
    // InternalSlideOMatic.g:919:1: entryRuleContent returns [EObject current=null] : iv_ruleContent= ruleContent EOF ;
    public final EObject entryRuleContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContent = null;


        try {
            // InternalSlideOMatic.g:919:48: (iv_ruleContent= ruleContent EOF )
            // InternalSlideOMatic.g:920:2: iv_ruleContent= ruleContent EOF
            {
             newCompositeNode(grammarAccess.getContentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContent=ruleContent();

            state._fsp--;

             current =iv_ruleContent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleContent"


    // $ANTLR start "ruleContent"
    // InternalSlideOMatic.g:926:1: ruleContent returns [EObject current=null] : ( ( () otherlv_1= 'ToC' ) | this_Text_2= ruleText | this_List_3= ruleList | this_Float_4= ruleFloat ) ;
    public final EObject ruleContent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_Text_2 = null;

        EObject this_List_3 = null;

        EObject this_Float_4 = null;



        	enterRule();

        try {
            // InternalSlideOMatic.g:932:2: ( ( ( () otherlv_1= 'ToC' ) | this_Text_2= ruleText | this_List_3= ruleList | this_Float_4= ruleFloat ) )
            // InternalSlideOMatic.g:933:2: ( ( () otherlv_1= 'ToC' ) | this_Text_2= ruleText | this_List_3= ruleList | this_Float_4= ruleFloat )
            {
            // InternalSlideOMatic.g:933:2: ( ( () otherlv_1= 'ToC' ) | this_Text_2= ruleText | this_List_3= ruleList | this_Float_4= ruleFloat )
            int alt14=4;
            switch ( input.LA(1) ) {
            case 70:
                {
                alt14=1;
                }
                break;
            case 71:
            case 72:
                {
                alt14=2;
                }
                break;
            case 73:
            case 74:
                {
                alt14=3;
                }
                break;
            case 77:
            case 91:
                {
                alt14=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalSlideOMatic.g:934:3: ( () otherlv_1= 'ToC' )
                    {
                    // InternalSlideOMatic.g:934:3: ( () otherlv_1= 'ToC' )
                    // InternalSlideOMatic.g:935:4: () otherlv_1= 'ToC'
                    {
                    // InternalSlideOMatic.g:935:4: ()
                    // InternalSlideOMatic.g:936:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getContentAccess().getTOCAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,70,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getContentAccess().getToCKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSlideOMatic.g:948:3: this_Text_2= ruleText
                    {

                    			newCompositeNode(grammarAccess.getContentAccess().getTextParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Text_2=ruleText();

                    state._fsp--;


                    			current = this_Text_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSlideOMatic.g:957:3: this_List_3= ruleList
                    {

                    			newCompositeNode(grammarAccess.getContentAccess().getListParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_List_3=ruleList();

                    state._fsp--;


                    			current = this_List_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalSlideOMatic.g:966:3: this_Float_4= ruleFloat
                    {

                    			newCompositeNode(grammarAccess.getContentAccess().getFloatParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Float_4=ruleFloat();

                    state._fsp--;


                    			current = this_Float_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleContent"


    // $ANTLR start "entryRuleText"
    // InternalSlideOMatic.g:978:1: entryRuleText returns [EObject current=null] : iv_ruleText= ruleText EOF ;
    public final EObject entryRuleText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleText = null;


        try {
            // InternalSlideOMatic.g:978:45: (iv_ruleText= ruleText EOF )
            // InternalSlideOMatic.g:979:2: iv_ruleText= ruleText EOF
            {
             newCompositeNode(grammarAccess.getTextRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleText=ruleText();

            state._fsp--;

             current =iv_ruleText; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleText"


    // $ANTLR start "ruleText"
    // InternalSlideOMatic.g:985:1: ruleText returns [EObject current=null] : ( ( () otherlv_1= '>' ( (lv_text_2_0= RULE_STRING ) ) ( ruleClick )? ) | ( () otherlv_5= 'block' ( (lv_name_6_0= RULE_STRING ) )? otherlv_7= '{' ( (lv_text_8_0= RULE_STRING ) ) otherlv_9= '}' ( ruleClick )? ) ) ;
    public final EObject ruleText() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_text_2_0=null;
        Token otherlv_5=null;
        Token lv_name_6_0=null;
        Token otherlv_7=null;
        Token lv_text_8_0=null;
        Token otherlv_9=null;


        	enterRule();

        try {
            // InternalSlideOMatic.g:991:2: ( ( ( () otherlv_1= '>' ( (lv_text_2_0= RULE_STRING ) ) ( ruleClick )? ) | ( () otherlv_5= 'block' ( (lv_name_6_0= RULE_STRING ) )? otherlv_7= '{' ( (lv_text_8_0= RULE_STRING ) ) otherlv_9= '}' ( ruleClick )? ) ) )
            // InternalSlideOMatic.g:992:2: ( ( () otherlv_1= '>' ( (lv_text_2_0= RULE_STRING ) ) ( ruleClick )? ) | ( () otherlv_5= 'block' ( (lv_name_6_0= RULE_STRING ) )? otherlv_7= '{' ( (lv_text_8_0= RULE_STRING ) ) otherlv_9= '}' ( ruleClick )? ) )
            {
            // InternalSlideOMatic.g:992:2: ( ( () otherlv_1= '>' ( (lv_text_2_0= RULE_STRING ) ) ( ruleClick )? ) | ( () otherlv_5= 'block' ( (lv_name_6_0= RULE_STRING ) )? otherlv_7= '{' ( (lv_text_8_0= RULE_STRING ) ) otherlv_9= '}' ( ruleClick )? ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==71) ) {
                alt18=1;
            }
            else if ( (LA18_0==72) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalSlideOMatic.g:993:3: ( () otherlv_1= '>' ( (lv_text_2_0= RULE_STRING ) ) ( ruleClick )? )
                    {
                    // InternalSlideOMatic.g:993:3: ( () otherlv_1= '>' ( (lv_text_2_0= RULE_STRING ) ) ( ruleClick )? )
                    // InternalSlideOMatic.g:994:4: () otherlv_1= '>' ( (lv_text_2_0= RULE_STRING ) ) ( ruleClick )?
                    {
                    // InternalSlideOMatic.g:994:4: ()
                    // InternalSlideOMatic.g:995:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTextAccess().getParagraphAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,71,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getTextAccess().getGreaterThanSignKeyword_0_1());
                    			
                    // InternalSlideOMatic.g:1005:4: ( (lv_text_2_0= RULE_STRING ) )
                    // InternalSlideOMatic.g:1006:5: (lv_text_2_0= RULE_STRING )
                    {
                    // InternalSlideOMatic.g:1006:5: (lv_text_2_0= RULE_STRING )
                    // InternalSlideOMatic.g:1007:6: lv_text_2_0= RULE_STRING
                    {
                    lv_text_2_0=(Token)match(input,RULE_STRING,FOLLOW_19); 

                    						newLeafNode(lv_text_2_0, grammarAccess.getTextAccess().getTextSTRINGTerminalRuleCall_0_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTextRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"text",
                    							lv_text_2_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    // InternalSlideOMatic.g:1023:4: ( ruleClick )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==94) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalSlideOMatic.g:1024:5: ruleClick
                            {

                            					newCompositeNode(grammarAccess.getTextAccess().getClickParserRuleCall_0_3());
                            				
                            pushFollow(FOLLOW_2);
                            ruleClick();

                            state._fsp--;


                            					afterParserOrEnumRuleCall();
                            				

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSlideOMatic.g:1034:3: ( () otherlv_5= 'block' ( (lv_name_6_0= RULE_STRING ) )? otherlv_7= '{' ( (lv_text_8_0= RULE_STRING ) ) otherlv_9= '}' ( ruleClick )? )
                    {
                    // InternalSlideOMatic.g:1034:3: ( () otherlv_5= 'block' ( (lv_name_6_0= RULE_STRING ) )? otherlv_7= '{' ( (lv_text_8_0= RULE_STRING ) ) otherlv_9= '}' ( ruleClick )? )
                    // InternalSlideOMatic.g:1035:4: () otherlv_5= 'block' ( (lv_name_6_0= RULE_STRING ) )? otherlv_7= '{' ( (lv_text_8_0= RULE_STRING ) ) otherlv_9= '}' ( ruleClick )?
                    {
                    // InternalSlideOMatic.g:1035:4: ()
                    // InternalSlideOMatic.g:1036:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTextAccess().getBlockAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_5=(Token)match(input,72,FOLLOW_20); 

                    				newLeafNode(otherlv_5, grammarAccess.getTextAccess().getBlockKeyword_1_1());
                    			
                    // InternalSlideOMatic.g:1046:4: ( (lv_name_6_0= RULE_STRING ) )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==RULE_STRING) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalSlideOMatic.g:1047:5: (lv_name_6_0= RULE_STRING )
                            {
                            // InternalSlideOMatic.g:1047:5: (lv_name_6_0= RULE_STRING )
                            // InternalSlideOMatic.g:1048:6: lv_name_6_0= RULE_STRING
                            {
                            lv_name_6_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

                            						newLeafNode(lv_name_6_0, grammarAccess.getTextAccess().getNameSTRINGTerminalRuleCall_1_2_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getTextRule());
                            						}
                            						setWithLastConsumed(
                            							current,
                            							"name",
                            							lv_name_6_0,
                            							"org.eclipse.xtext.common.Terminals.STRING");
                            					

                            }


                            }
                            break;

                    }

                    otherlv_7=(Token)match(input,12,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getTextAccess().getLeftCurlyBracketKeyword_1_3());
                    			
                    // InternalSlideOMatic.g:1068:4: ( (lv_text_8_0= RULE_STRING ) )
                    // InternalSlideOMatic.g:1069:5: (lv_text_8_0= RULE_STRING )
                    {
                    // InternalSlideOMatic.g:1069:5: (lv_text_8_0= RULE_STRING )
                    // InternalSlideOMatic.g:1070:6: lv_text_8_0= RULE_STRING
                    {
                    lv_text_8_0=(Token)match(input,RULE_STRING,FOLLOW_21); 

                    						newLeafNode(lv_text_8_0, grammarAccess.getTextAccess().getTextSTRINGTerminalRuleCall_1_4_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTextRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"text",
                    							lv_text_8_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    otherlv_9=(Token)match(input,15,FOLLOW_19); 

                    				newLeafNode(otherlv_9, grammarAccess.getTextAccess().getRightCurlyBracketKeyword_1_5());
                    			
                    // InternalSlideOMatic.g:1090:4: ( ruleClick )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==94) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // InternalSlideOMatic.g:1091:5: ruleClick
                            {

                            					newCompositeNode(grammarAccess.getTextAccess().getClickParserRuleCall_1_6());
                            				
                            pushFollow(FOLLOW_2);
                            ruleClick();

                            state._fsp--;


                            					afterParserOrEnumRuleCall();
                            				

                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleText"


    // $ANTLR start "entryRuleList"
    // InternalSlideOMatic.g:1104:1: entryRuleList returns [EObject current=null] : iv_ruleList= ruleList EOF ;
    public final EObject entryRuleList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleList = null;


        try {
            // InternalSlideOMatic.g:1104:45: (iv_ruleList= ruleList EOF )
            // InternalSlideOMatic.g:1105:2: iv_ruleList= ruleList EOF
            {
             newCompositeNode(grammarAccess.getListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleList=ruleList();

            state._fsp--;

             current =iv_ruleList; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleList"


    // $ANTLR start "ruleList"
    // InternalSlideOMatic.g:1111:1: ruleList returns [EObject current=null] : ( ( () otherlv_1= '#list' ( (lv_ListItems_2_0= ruleNumberedListItem ) )+ ) | ( () otherlv_4= '-list' ( (lv_ListItems_5_0= ruleUnNumberedListItem ) )+ ) ) ;
    public final EObject ruleList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_ListItems_2_0 = null;

        EObject lv_ListItems_5_0 = null;



        	enterRule();

        try {
            // InternalSlideOMatic.g:1117:2: ( ( ( () otherlv_1= '#list' ( (lv_ListItems_2_0= ruleNumberedListItem ) )+ ) | ( () otherlv_4= '-list' ( (lv_ListItems_5_0= ruleUnNumberedListItem ) )+ ) ) )
            // InternalSlideOMatic.g:1118:2: ( ( () otherlv_1= '#list' ( (lv_ListItems_2_0= ruleNumberedListItem ) )+ ) | ( () otherlv_4= '-list' ( (lv_ListItems_5_0= ruleUnNumberedListItem ) )+ ) )
            {
            // InternalSlideOMatic.g:1118:2: ( ( () otherlv_1= '#list' ( (lv_ListItems_2_0= ruleNumberedListItem ) )+ ) | ( () otherlv_4= '-list' ( (lv_ListItems_5_0= ruleUnNumberedListItem ) )+ ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==73) ) {
                alt21=1;
            }
            else if ( (LA21_0==74) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalSlideOMatic.g:1119:3: ( () otherlv_1= '#list' ( (lv_ListItems_2_0= ruleNumberedListItem ) )+ )
                    {
                    // InternalSlideOMatic.g:1119:3: ( () otherlv_1= '#list' ( (lv_ListItems_2_0= ruleNumberedListItem ) )+ )
                    // InternalSlideOMatic.g:1120:4: () otherlv_1= '#list' ( (lv_ListItems_2_0= ruleNumberedListItem ) )+
                    {
                    // InternalSlideOMatic.g:1120:4: ()
                    // InternalSlideOMatic.g:1121:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getListAccess().getNumberedListAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,73,FOLLOW_22); 

                    				newLeafNode(otherlv_1, grammarAccess.getListAccess().getListKeyword_0_1());
                    			
                    // InternalSlideOMatic.g:1131:4: ( (lv_ListItems_2_0= ruleNumberedListItem ) )+
                    int cnt19=0;
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==75) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalSlideOMatic.g:1132:5: (lv_ListItems_2_0= ruleNumberedListItem )
                    	    {
                    	    // InternalSlideOMatic.g:1132:5: (lv_ListItems_2_0= ruleNumberedListItem )
                    	    // InternalSlideOMatic.g:1133:6: lv_ListItems_2_0= ruleNumberedListItem
                    	    {

                    	    						newCompositeNode(grammarAccess.getListAccess().getListItemsNumberedListItemParserRuleCall_0_2_0());
                    	    					
                    	    pushFollow(FOLLOW_23);
                    	    lv_ListItems_2_0=ruleNumberedListItem();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getListRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"ListItems",
                    	    							lv_ListItems_2_0,
                    	    							"dk.sdu.mmmi.mdsd.f18.dsl.external.SlideOMatic.NumberedListItem");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt19 >= 1 ) break loop19;
                                EarlyExitException eee =
                                    new EarlyExitException(19, input);
                                throw eee;
                        }
                        cnt19++;
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalSlideOMatic.g:1152:3: ( () otherlv_4= '-list' ( (lv_ListItems_5_0= ruleUnNumberedListItem ) )+ )
                    {
                    // InternalSlideOMatic.g:1152:3: ( () otherlv_4= '-list' ( (lv_ListItems_5_0= ruleUnNumberedListItem ) )+ )
                    // InternalSlideOMatic.g:1153:4: () otherlv_4= '-list' ( (lv_ListItems_5_0= ruleUnNumberedListItem ) )+
                    {
                    // InternalSlideOMatic.g:1153:4: ()
                    // InternalSlideOMatic.g:1154:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getListAccess().getUnNumberedListAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_4=(Token)match(input,74,FOLLOW_24); 

                    				newLeafNode(otherlv_4, grammarAccess.getListAccess().getListKeyword_1_1());
                    			
                    // InternalSlideOMatic.g:1164:4: ( (lv_ListItems_5_0= ruleUnNumberedListItem ) )+
                    int cnt20=0;
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==76) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalSlideOMatic.g:1165:5: (lv_ListItems_5_0= ruleUnNumberedListItem )
                    	    {
                    	    // InternalSlideOMatic.g:1165:5: (lv_ListItems_5_0= ruleUnNumberedListItem )
                    	    // InternalSlideOMatic.g:1166:6: lv_ListItems_5_0= ruleUnNumberedListItem
                    	    {

                    	    						newCompositeNode(grammarAccess.getListAccess().getListItemsUnNumberedListItemParserRuleCall_1_2_0());
                    	    					
                    	    pushFollow(FOLLOW_25);
                    	    lv_ListItems_5_0=ruleUnNumberedListItem();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getListRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"ListItems",
                    	    							lv_ListItems_5_0,
                    	    							"dk.sdu.mmmi.mdsd.f18.dsl.external.SlideOMatic.UnNumberedListItem");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt20 >= 1 ) break loop20;
                                EarlyExitException eee =
                                    new EarlyExitException(20, input);
                                throw eee;
                        }
                        cnt20++;
                    } while (true);


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleList"


    // $ANTLR start "entryRuleNumberedListItem"
    // InternalSlideOMatic.g:1188:1: entryRuleNumberedListItem returns [EObject current=null] : iv_ruleNumberedListItem= ruleNumberedListItem EOF ;
    public final EObject entryRuleNumberedListItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberedListItem = null;


        try {
            // InternalSlideOMatic.g:1188:57: (iv_ruleNumberedListItem= ruleNumberedListItem EOF )
            // InternalSlideOMatic.g:1189:2: iv_ruleNumberedListItem= ruleNumberedListItem EOF
            {
             newCompositeNode(grammarAccess.getNumberedListItemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumberedListItem=ruleNumberedListItem();

            state._fsp--;

             current =iv_ruleNumberedListItem; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumberedListItem"


    // $ANTLR start "ruleNumberedListItem"
    // InternalSlideOMatic.g:1195:1: ruleNumberedListItem returns [EObject current=null] : (otherlv_0= '##' ( (lv_item_1_0= RULE_STRING ) ) ( ruleClick )? ) ;
    public final EObject ruleNumberedListItem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_item_1_0=null;


        	enterRule();

        try {
            // InternalSlideOMatic.g:1201:2: ( (otherlv_0= '##' ( (lv_item_1_0= RULE_STRING ) ) ( ruleClick )? ) )
            // InternalSlideOMatic.g:1202:2: (otherlv_0= '##' ( (lv_item_1_0= RULE_STRING ) ) ( ruleClick )? )
            {
            // InternalSlideOMatic.g:1202:2: (otherlv_0= '##' ( (lv_item_1_0= RULE_STRING ) ) ( ruleClick )? )
            // InternalSlideOMatic.g:1203:3: otherlv_0= '##' ( (lv_item_1_0= RULE_STRING ) ) ( ruleClick )?
            {
            otherlv_0=(Token)match(input,75,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getNumberedListItemAccess().getNumberSignNumberSignKeyword_0());
            		
            // InternalSlideOMatic.g:1207:3: ( (lv_item_1_0= RULE_STRING ) )
            // InternalSlideOMatic.g:1208:4: (lv_item_1_0= RULE_STRING )
            {
            // InternalSlideOMatic.g:1208:4: (lv_item_1_0= RULE_STRING )
            // InternalSlideOMatic.g:1209:5: lv_item_1_0= RULE_STRING
            {
            lv_item_1_0=(Token)match(input,RULE_STRING,FOLLOW_19); 

            					newLeafNode(lv_item_1_0, grammarAccess.getNumberedListItemAccess().getItemSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNumberedListItemRule());
            					}
            					setWithLastConsumed(
            						current,
            						"item",
            						lv_item_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalSlideOMatic.g:1225:3: ( ruleClick )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==94) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalSlideOMatic.g:1226:4: ruleClick
                    {

                    				newCompositeNode(grammarAccess.getNumberedListItemAccess().getClickParserRuleCall_2());
                    			
                    pushFollow(FOLLOW_2);
                    ruleClick();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumberedListItem"


    // $ANTLR start "entryRuleUnNumberedListItem"
    // InternalSlideOMatic.g:1238:1: entryRuleUnNumberedListItem returns [EObject current=null] : iv_ruleUnNumberedListItem= ruleUnNumberedListItem EOF ;
    public final EObject entryRuleUnNumberedListItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnNumberedListItem = null;


        try {
            // InternalSlideOMatic.g:1238:59: (iv_ruleUnNumberedListItem= ruleUnNumberedListItem EOF )
            // InternalSlideOMatic.g:1239:2: iv_ruleUnNumberedListItem= ruleUnNumberedListItem EOF
            {
             newCompositeNode(grammarAccess.getUnNumberedListItemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnNumberedListItem=ruleUnNumberedListItem();

            state._fsp--;

             current =iv_ruleUnNumberedListItem; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnNumberedListItem"


    // $ANTLR start "ruleUnNumberedListItem"
    // InternalSlideOMatic.g:1245:1: ruleUnNumberedListItem returns [EObject current=null] : (otherlv_0= '--' ( (lv_item_1_0= RULE_STRING ) ) ( ruleClick )? ) ;
    public final EObject ruleUnNumberedListItem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_item_1_0=null;


        	enterRule();

        try {
            // InternalSlideOMatic.g:1251:2: ( (otherlv_0= '--' ( (lv_item_1_0= RULE_STRING ) ) ( ruleClick )? ) )
            // InternalSlideOMatic.g:1252:2: (otherlv_0= '--' ( (lv_item_1_0= RULE_STRING ) ) ( ruleClick )? )
            {
            // InternalSlideOMatic.g:1252:2: (otherlv_0= '--' ( (lv_item_1_0= RULE_STRING ) ) ( ruleClick )? )
            // InternalSlideOMatic.g:1253:3: otherlv_0= '--' ( (lv_item_1_0= RULE_STRING ) ) ( ruleClick )?
            {
            otherlv_0=(Token)match(input,76,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getUnNumberedListItemAccess().getHyphenMinusHyphenMinusKeyword_0());
            		
            // InternalSlideOMatic.g:1257:3: ( (lv_item_1_0= RULE_STRING ) )
            // InternalSlideOMatic.g:1258:4: (lv_item_1_0= RULE_STRING )
            {
            // InternalSlideOMatic.g:1258:4: (lv_item_1_0= RULE_STRING )
            // InternalSlideOMatic.g:1259:5: lv_item_1_0= RULE_STRING
            {
            lv_item_1_0=(Token)match(input,RULE_STRING,FOLLOW_19); 

            					newLeafNode(lv_item_1_0, grammarAccess.getUnNumberedListItemAccess().getItemSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUnNumberedListItemRule());
            					}
            					setWithLastConsumed(
            						current,
            						"item",
            						lv_item_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalSlideOMatic.g:1275:3: ( ruleClick )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==94) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalSlideOMatic.g:1276:4: ruleClick
                    {

                    				newCompositeNode(grammarAccess.getUnNumberedListItemAccess().getClickParserRuleCall_2());
                    			
                    pushFollow(FOLLOW_2);
                    ruleClick();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnNumberedListItem"


    // $ANTLR start "entryRuleFloat"
    // InternalSlideOMatic.g:1288:1: entryRuleFloat returns [EObject current=null] : iv_ruleFloat= ruleFloat EOF ;
    public final EObject entryRuleFloat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloat = null;


        try {
            // InternalSlideOMatic.g:1288:46: (iv_ruleFloat= ruleFloat EOF )
            // InternalSlideOMatic.g:1289:2: iv_ruleFloat= ruleFloat EOF
            {
             newCompositeNode(grammarAccess.getFloatRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFloat=ruleFloat();

            state._fsp--;

             current =iv_ruleFloat; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFloat"


    // $ANTLR start "ruleFloat"
    // InternalSlideOMatic.g:1295:1: ruleFloat returns [EObject current=null] : (this_Image_0= ruleImage | this_Table_1= ruleTable ) ;
    public final EObject ruleFloat() throws RecognitionException {
        EObject current = null;

        EObject this_Image_0 = null;

        EObject this_Table_1 = null;



        	enterRule();

        try {
            // InternalSlideOMatic.g:1301:2: ( (this_Image_0= ruleImage | this_Table_1= ruleTable ) )
            // InternalSlideOMatic.g:1302:2: (this_Image_0= ruleImage | this_Table_1= ruleTable )
            {
            // InternalSlideOMatic.g:1302:2: (this_Image_0= ruleImage | this_Table_1= ruleTable )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==77) ) {
                alt24=1;
            }
            else if ( (LA24_0==91) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalSlideOMatic.g:1303:3: this_Image_0= ruleImage
                    {

                    			newCompositeNode(grammarAccess.getFloatAccess().getImageParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Image_0=ruleImage();

                    state._fsp--;


                    			current = this_Image_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSlideOMatic.g:1312:3: this_Table_1= ruleTable
                    {

                    			newCompositeNode(grammarAccess.getFloatAccess().getTableParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Table_1=ruleTable();

                    state._fsp--;


                    			current = this_Table_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFloat"


    // $ANTLR start "entryRuleImage"
    // InternalSlideOMatic.g:1324:1: entryRuleImage returns [EObject current=null] : iv_ruleImage= ruleImage EOF ;
    public final EObject entryRuleImage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImage = null;


        try {
            // InternalSlideOMatic.g:1324:46: (iv_ruleImage= ruleImage EOF )
            // InternalSlideOMatic.g:1325:2: iv_ruleImage= ruleImage EOF
            {
             newCompositeNode(grammarAccess.getImageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImage=ruleImage();

            state._fsp--;

             current =iv_ruleImage; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImage"


    // $ANTLR start "ruleImage"
    // InternalSlideOMatic.g:1331:1: ruleImage returns [EObject current=null] : (otherlv_0= 'img' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'src' ( (lv_src_3_0= RULE_STRING ) ) ( (lv_alignment_4_0= ruleAlignment ) )? ( (lv_size_5_0= ruleSize ) ) ( ruleClick )? ) ;
    public final EObject ruleImage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_src_3_0=null;
        AntlrDatatypeRuleToken lv_alignment_4_0 = null;

        EObject lv_size_5_0 = null;



        	enterRule();

        try {
            // InternalSlideOMatic.g:1337:2: ( (otherlv_0= 'img' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'src' ( (lv_src_3_0= RULE_STRING ) ) ( (lv_alignment_4_0= ruleAlignment ) )? ( (lv_size_5_0= ruleSize ) ) ( ruleClick )? ) )
            // InternalSlideOMatic.g:1338:2: (otherlv_0= 'img' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'src' ( (lv_src_3_0= RULE_STRING ) ) ( (lv_alignment_4_0= ruleAlignment ) )? ( (lv_size_5_0= ruleSize ) ) ( ruleClick )? )
            {
            // InternalSlideOMatic.g:1338:2: (otherlv_0= 'img' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'src' ( (lv_src_3_0= RULE_STRING ) ) ( (lv_alignment_4_0= ruleAlignment ) )? ( (lv_size_5_0= ruleSize ) ) ( ruleClick )? )
            // InternalSlideOMatic.g:1339:3: otherlv_0= 'img' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'src' ( (lv_src_3_0= RULE_STRING ) ) ( (lv_alignment_4_0= ruleAlignment ) )? ( (lv_size_5_0= ruleSize ) ) ( ruleClick )?
            {
            otherlv_0=(Token)match(input,77,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getImageAccess().getImgKeyword_0());
            		
            // InternalSlideOMatic.g:1343:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSlideOMatic.g:1344:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSlideOMatic.g:1344:4: (lv_name_1_0= RULE_ID )
            // InternalSlideOMatic.g:1345:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_27); 

            					newLeafNode(lv_name_1_0, grammarAccess.getImageAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getImageRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,78,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getImageAccess().getSrcKeyword_2());
            		
            // InternalSlideOMatic.g:1365:3: ( (lv_src_3_0= RULE_STRING ) )
            // InternalSlideOMatic.g:1366:4: (lv_src_3_0= RULE_STRING )
            {
            // InternalSlideOMatic.g:1366:4: (lv_src_3_0= RULE_STRING )
            // InternalSlideOMatic.g:1367:5: lv_src_3_0= RULE_STRING
            {
            lv_src_3_0=(Token)match(input,RULE_STRING,FOLLOW_28); 

            					newLeafNode(lv_src_3_0, grammarAccess.getImageAccess().getSrcSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getImageRule());
            					}
            					setWithLastConsumed(
            						current,
            						"src",
            						lv_src_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalSlideOMatic.g:1383:3: ( (lv_alignment_4_0= ruleAlignment ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=79 && LA25_0<=87)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalSlideOMatic.g:1384:4: (lv_alignment_4_0= ruleAlignment )
                    {
                    // InternalSlideOMatic.g:1384:4: (lv_alignment_4_0= ruleAlignment )
                    // InternalSlideOMatic.g:1385:5: lv_alignment_4_0= ruleAlignment
                    {

                    					newCompositeNode(grammarAccess.getImageAccess().getAlignmentAlignmentParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_28);
                    lv_alignment_4_0=ruleAlignment();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getImageRule());
                    					}
                    					set(
                    						current,
                    						"alignment",
                    						lv_alignment_4_0,
                    						"dk.sdu.mmmi.mdsd.f18.dsl.external.SlideOMatic.Alignment");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalSlideOMatic.g:1402:3: ( (lv_size_5_0= ruleSize ) )
            // InternalSlideOMatic.g:1403:4: (lv_size_5_0= ruleSize )
            {
            // InternalSlideOMatic.g:1403:4: (lv_size_5_0= ruleSize )
            // InternalSlideOMatic.g:1404:5: lv_size_5_0= ruleSize
            {

            					newCompositeNode(grammarAccess.getImageAccess().getSizeSizeParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_19);
            lv_size_5_0=ruleSize();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImageRule());
            					}
            					set(
            						current,
            						"size",
            						lv_size_5_0,
            						"dk.sdu.mmmi.mdsd.f18.dsl.external.SlideOMatic.Size");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSlideOMatic.g:1421:3: ( ruleClick )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==94) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalSlideOMatic.g:1422:4: ruleClick
                    {

                    				newCompositeNode(grammarAccess.getImageAccess().getClickParserRuleCall_6());
                    			
                    pushFollow(FOLLOW_2);
                    ruleClick();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImage"


    // $ANTLR start "entryRuleAlignment"
    // InternalSlideOMatic.g:1434:1: entryRuleAlignment returns [String current=null] : iv_ruleAlignment= ruleAlignment EOF ;
    public final String entryRuleAlignment() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAlignment = null;


        try {
            // InternalSlideOMatic.g:1434:49: (iv_ruleAlignment= ruleAlignment EOF )
            // InternalSlideOMatic.g:1435:2: iv_ruleAlignment= ruleAlignment EOF
            {
             newCompositeNode(grammarAccess.getAlignmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAlignment=ruleAlignment();

            state._fsp--;

             current =iv_ruleAlignment.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAlignment"


    // $ANTLR start "ruleAlignment"
    // InternalSlideOMatic.g:1441:1: ruleAlignment returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'topleft' | kw= 'top' | kw= 'topright' | kw= 'left' | kw= 'center' | kw= 'right' | kw= 'bottomleft' | kw= 'bottom' | kw= 'bottomright' ) ;
    public final AntlrDatatypeRuleToken ruleAlignment() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSlideOMatic.g:1447:2: ( (kw= 'topleft' | kw= 'top' | kw= 'topright' | kw= 'left' | kw= 'center' | kw= 'right' | kw= 'bottomleft' | kw= 'bottom' | kw= 'bottomright' ) )
            // InternalSlideOMatic.g:1448:2: (kw= 'topleft' | kw= 'top' | kw= 'topright' | kw= 'left' | kw= 'center' | kw= 'right' | kw= 'bottomleft' | kw= 'bottom' | kw= 'bottomright' )
            {
            // InternalSlideOMatic.g:1448:2: (kw= 'topleft' | kw= 'top' | kw= 'topright' | kw= 'left' | kw= 'center' | kw= 'right' | kw= 'bottomleft' | kw= 'bottom' | kw= 'bottomright' )
            int alt27=9;
            switch ( input.LA(1) ) {
            case 79:
                {
                alt27=1;
                }
                break;
            case 80:
                {
                alt27=2;
                }
                break;
            case 81:
                {
                alt27=3;
                }
                break;
            case 82:
                {
                alt27=4;
                }
                break;
            case 83:
                {
                alt27=5;
                }
                break;
            case 84:
                {
                alt27=6;
                }
                break;
            case 85:
                {
                alt27=7;
                }
                break;
            case 86:
                {
                alt27=8;
                }
                break;
            case 87:
                {
                alt27=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // InternalSlideOMatic.g:1449:3: kw= 'topleft'
                    {
                    kw=(Token)match(input,79,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAlignmentAccess().getTopleftKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSlideOMatic.g:1455:3: kw= 'top'
                    {
                    kw=(Token)match(input,80,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAlignmentAccess().getTopKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalSlideOMatic.g:1461:3: kw= 'topright'
                    {
                    kw=(Token)match(input,81,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAlignmentAccess().getToprightKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalSlideOMatic.g:1467:3: kw= 'left'
                    {
                    kw=(Token)match(input,82,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAlignmentAccess().getLeftKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalSlideOMatic.g:1473:3: kw= 'center'
                    {
                    kw=(Token)match(input,83,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAlignmentAccess().getCenterKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalSlideOMatic.g:1479:3: kw= 'right'
                    {
                    kw=(Token)match(input,84,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAlignmentAccess().getRightKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalSlideOMatic.g:1485:3: kw= 'bottomleft'
                    {
                    kw=(Token)match(input,85,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAlignmentAccess().getBottomleftKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalSlideOMatic.g:1491:3: kw= 'bottom'
                    {
                    kw=(Token)match(input,86,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAlignmentAccess().getBottomKeyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalSlideOMatic.g:1497:3: kw= 'bottomright'
                    {
                    kw=(Token)match(input,87,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAlignmentAccess().getBottomrightKeyword_8());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAlignment"


    // $ANTLR start "entryRuleSize"
    // InternalSlideOMatic.g:1506:1: entryRuleSize returns [EObject current=null] : iv_ruleSize= ruleSize EOF ;
    public final EObject entryRuleSize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSize = null;


        try {
            // InternalSlideOMatic.g:1506:45: (iv_ruleSize= ruleSize EOF )
            // InternalSlideOMatic.g:1507:2: iv_ruleSize= ruleSize EOF
            {
             newCompositeNode(grammarAccess.getSizeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSize=ruleSize();

            state._fsp--;

             current =iv_ruleSize; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSize"


    // $ANTLR start "ruleSize"
    // InternalSlideOMatic.g:1513:1: ruleSize returns [EObject current=null] : ( (otherlv_0= 'width' | otherlv_1= 'height' ) ( (lv_scale_2_0= RULE_INT ) ) otherlv_3= '%' ) ;
    public final EObject ruleSize() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_scale_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalSlideOMatic.g:1519:2: ( ( (otherlv_0= 'width' | otherlv_1= 'height' ) ( (lv_scale_2_0= RULE_INT ) ) otherlv_3= '%' ) )
            // InternalSlideOMatic.g:1520:2: ( (otherlv_0= 'width' | otherlv_1= 'height' ) ( (lv_scale_2_0= RULE_INT ) ) otherlv_3= '%' )
            {
            // InternalSlideOMatic.g:1520:2: ( (otherlv_0= 'width' | otherlv_1= 'height' ) ( (lv_scale_2_0= RULE_INT ) ) otherlv_3= '%' )
            // InternalSlideOMatic.g:1521:3: (otherlv_0= 'width' | otherlv_1= 'height' ) ( (lv_scale_2_0= RULE_INT ) ) otherlv_3= '%'
            {
            // InternalSlideOMatic.g:1521:3: (otherlv_0= 'width' | otherlv_1= 'height' )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==88) ) {
                alt28=1;
            }
            else if ( (LA28_0==89) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalSlideOMatic.g:1522:4: otherlv_0= 'width'
                    {
                    otherlv_0=(Token)match(input,88,FOLLOW_29); 

                    				newLeafNode(otherlv_0, grammarAccess.getSizeAccess().getWidthKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalSlideOMatic.g:1527:4: otherlv_1= 'height'
                    {
                    otherlv_1=(Token)match(input,89,FOLLOW_29); 

                    				newLeafNode(otherlv_1, grammarAccess.getSizeAccess().getHeightKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalSlideOMatic.g:1532:3: ( (lv_scale_2_0= RULE_INT ) )
            // InternalSlideOMatic.g:1533:4: (lv_scale_2_0= RULE_INT )
            {
            // InternalSlideOMatic.g:1533:4: (lv_scale_2_0= RULE_INT )
            // InternalSlideOMatic.g:1534:5: lv_scale_2_0= RULE_INT
            {
            lv_scale_2_0=(Token)match(input,RULE_INT,FOLLOW_30); 

            					newLeafNode(lv_scale_2_0, grammarAccess.getSizeAccess().getScaleINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSizeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"scale",
            						lv_scale_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_3=(Token)match(input,90,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getSizeAccess().getPercentSignKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSize"


    // $ANTLR start "entryRuleTable"
    // InternalSlideOMatic.g:1558:1: entryRuleTable returns [EObject current=null] : iv_ruleTable= ruleTable EOF ;
    public final EObject entryRuleTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTable = null;


        try {
            // InternalSlideOMatic.g:1558:46: (iv_ruleTable= ruleTable EOF )
            // InternalSlideOMatic.g:1559:2: iv_ruleTable= ruleTable EOF
            {
             newCompositeNode(grammarAccess.getTableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTable=ruleTable();

            state._fsp--;

             current =iv_ruleTable; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTable"


    // $ANTLR start "ruleTable"
    // InternalSlideOMatic.g:1565:1: ruleTable returns [EObject current=null] : (otherlv_0= 'tab' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (lv_rows_3_0= ruleTableRow ) ) (otherlv_4= ',' ( (lv_rows_5_0= ruleTableRow ) ) )* otherlv_6= ']' ) ;
    public final EObject ruleTable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_rows_3_0 = null;

        EObject lv_rows_5_0 = null;



        	enterRule();

        try {
            // InternalSlideOMatic.g:1571:2: ( (otherlv_0= 'tab' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (lv_rows_3_0= ruleTableRow ) ) (otherlv_4= ',' ( (lv_rows_5_0= ruleTableRow ) ) )* otherlv_6= ']' ) )
            // InternalSlideOMatic.g:1572:2: (otherlv_0= 'tab' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (lv_rows_3_0= ruleTableRow ) ) (otherlv_4= ',' ( (lv_rows_5_0= ruleTableRow ) ) )* otherlv_6= ']' )
            {
            // InternalSlideOMatic.g:1572:2: (otherlv_0= 'tab' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (lv_rows_3_0= ruleTableRow ) ) (otherlv_4= ',' ( (lv_rows_5_0= ruleTableRow ) ) )* otherlv_6= ']' )
            // InternalSlideOMatic.g:1573:3: otherlv_0= 'tab' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (lv_rows_3_0= ruleTableRow ) ) (otherlv_4= ',' ( (lv_rows_5_0= ruleTableRow ) ) )* otherlv_6= ']'
            {
            otherlv_0=(Token)match(input,91,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getTableAccess().getTabKeyword_0());
            		
            // InternalSlideOMatic.g:1577:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSlideOMatic.g:1578:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSlideOMatic.g:1578:4: (lv_name_1_0= RULE_ID )
            // InternalSlideOMatic.g:1579:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_31); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTableAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,92,FOLLOW_31); 

            			newLeafNode(otherlv_2, grammarAccess.getTableAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalSlideOMatic.g:1599:3: ( (lv_rows_3_0= ruleTableRow ) )
            // InternalSlideOMatic.g:1600:4: (lv_rows_3_0= ruleTableRow )
            {
            // InternalSlideOMatic.g:1600:4: (lv_rows_3_0= ruleTableRow )
            // InternalSlideOMatic.g:1601:5: lv_rows_3_0= ruleTableRow
            {

            					newCompositeNode(grammarAccess.getTableAccess().getRowsTableRowParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_32);
            lv_rows_3_0=ruleTableRow();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTableRule());
            					}
            					add(
            						current,
            						"rows",
            						lv_rows_3_0,
            						"dk.sdu.mmmi.mdsd.f18.dsl.external.SlideOMatic.TableRow");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSlideOMatic.g:1618:3: (otherlv_4= ',' ( (lv_rows_5_0= ruleTableRow ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==63) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalSlideOMatic.g:1619:4: otherlv_4= ',' ( (lv_rows_5_0= ruleTableRow ) )
            	    {
            	    otherlv_4=(Token)match(input,63,FOLLOW_31); 

            	    				newLeafNode(otherlv_4, grammarAccess.getTableAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalSlideOMatic.g:1623:4: ( (lv_rows_5_0= ruleTableRow ) )
            	    // InternalSlideOMatic.g:1624:5: (lv_rows_5_0= ruleTableRow )
            	    {
            	    // InternalSlideOMatic.g:1624:5: (lv_rows_5_0= ruleTableRow )
            	    // InternalSlideOMatic.g:1625:6: lv_rows_5_0= ruleTableRow
            	    {

            	    						newCompositeNode(grammarAccess.getTableAccess().getRowsTableRowParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_32);
            	    lv_rows_5_0=ruleTableRow();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTableRule());
            	    						}
            	    						add(
            	    							current,
            	    							"rows",
            	    							lv_rows_5_0,
            	    							"dk.sdu.mmmi.mdsd.f18.dsl.external.SlideOMatic.TableRow");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            otherlv_6=(Token)match(input,93,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getTableAccess().getRightSquareBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTable"


    // $ANTLR start "entryRuleTableRow"
    // InternalSlideOMatic.g:1651:1: entryRuleTableRow returns [EObject current=null] : iv_ruleTableRow= ruleTableRow EOF ;
    public final EObject entryRuleTableRow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTableRow = null;


        try {
            // InternalSlideOMatic.g:1651:49: (iv_ruleTableRow= ruleTableRow EOF )
            // InternalSlideOMatic.g:1652:2: iv_ruleTableRow= ruleTableRow EOF
            {
             newCompositeNode(grammarAccess.getTableRowRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTableRow=ruleTableRow();

            state._fsp--;

             current =iv_ruleTableRow; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTableRow"


    // $ANTLR start "ruleTableRow"
    // InternalSlideOMatic.g:1658:1: ruleTableRow returns [EObject current=null] : (otherlv_0= '[' ( (lv_values_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_values_3_0= RULE_STRING ) ) )* otherlv_4= ']' ) ;
    public final EObject ruleTableRow() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_values_1_0=null;
        Token otherlv_2=null;
        Token lv_values_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalSlideOMatic.g:1664:2: ( (otherlv_0= '[' ( (lv_values_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_values_3_0= RULE_STRING ) ) )* otherlv_4= ']' ) )
            // InternalSlideOMatic.g:1665:2: (otherlv_0= '[' ( (lv_values_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_values_3_0= RULE_STRING ) ) )* otherlv_4= ']' )
            {
            // InternalSlideOMatic.g:1665:2: (otherlv_0= '[' ( (lv_values_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_values_3_0= RULE_STRING ) ) )* otherlv_4= ']' )
            // InternalSlideOMatic.g:1666:3: otherlv_0= '[' ( (lv_values_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_values_3_0= RULE_STRING ) ) )* otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,92,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTableRowAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalSlideOMatic.g:1670:3: ( (lv_values_1_0= RULE_STRING ) )
            // InternalSlideOMatic.g:1671:4: (lv_values_1_0= RULE_STRING )
            {
            // InternalSlideOMatic.g:1671:4: (lv_values_1_0= RULE_STRING )
            // InternalSlideOMatic.g:1672:5: lv_values_1_0= RULE_STRING
            {
            lv_values_1_0=(Token)match(input,RULE_STRING,FOLLOW_32); 

            					newLeafNode(lv_values_1_0, grammarAccess.getTableRowAccess().getValuesSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTableRowRule());
            					}
            					addWithLastConsumed(
            						current,
            						"values",
            						lv_values_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalSlideOMatic.g:1688:3: (otherlv_2= ',' ( (lv_values_3_0= RULE_STRING ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==63) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalSlideOMatic.g:1689:4: otherlv_2= ',' ( (lv_values_3_0= RULE_STRING ) )
            	    {
            	    otherlv_2=(Token)match(input,63,FOLLOW_3); 

            	    				newLeafNode(otherlv_2, grammarAccess.getTableRowAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalSlideOMatic.g:1693:4: ( (lv_values_3_0= RULE_STRING ) )
            	    // InternalSlideOMatic.g:1694:5: (lv_values_3_0= RULE_STRING )
            	    {
            	    // InternalSlideOMatic.g:1694:5: (lv_values_3_0= RULE_STRING )
            	    // InternalSlideOMatic.g:1695:6: lv_values_3_0= RULE_STRING
            	    {
            	    lv_values_3_0=(Token)match(input,RULE_STRING,FOLLOW_32); 

            	    						newLeafNode(lv_values_3_0, grammarAccess.getTableRowAccess().getValuesSTRINGTerminalRuleCall_2_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getTableRowRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"values",
            	    							lv_values_3_0,
            	    							"org.eclipse.xtext.common.Terminals.STRING");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            otherlv_4=(Token)match(input,93,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getTableRowAccess().getRightSquareBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTableRow"


    // $ANTLR start "entryRuleClick"
    // InternalSlideOMatic.g:1720:1: entryRuleClick returns [String current=null] : iv_ruleClick= ruleClick EOF ;
    public final String entryRuleClick() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleClick = null;


        try {
            // InternalSlideOMatic.g:1720:45: (iv_ruleClick= ruleClick EOF )
            // InternalSlideOMatic.g:1721:2: iv_ruleClick= ruleClick EOF
            {
             newCompositeNode(grammarAccess.getClickRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClick=ruleClick();

            state._fsp--;

             current =iv_ruleClick.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClick"


    // $ANTLR start "ruleClick"
    // InternalSlideOMatic.g:1727:1: ruleClick returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '$$' ;
    public final AntlrDatatypeRuleToken ruleClick() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSlideOMatic.g:1733:2: (kw= '$$' )
            // InternalSlideOMatic.g:1734:2: kw= '$$'
            {
            kw=(Token)match(input,94,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getClickAccess().getDollarSignDollarSignKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClick"


    // $ANTLR start "entryRuleAnimation"
    // InternalSlideOMatic.g:1742:1: entryRuleAnimation returns [EObject current=null] : iv_ruleAnimation= ruleAnimation EOF ;
    public final EObject entryRuleAnimation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnimation = null;


        try {
            // InternalSlideOMatic.g:1742:50: (iv_ruleAnimation= ruleAnimation EOF )
            // InternalSlideOMatic.g:1743:2: iv_ruleAnimation= ruleAnimation EOF
            {
             newCompositeNode(grammarAccess.getAnimationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnimation=ruleAnimation();

            state._fsp--;

             current =iv_ruleAnimation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnimation"


    // $ANTLR start "ruleAnimation"
    // InternalSlideOMatic.g:1749:1: ruleAnimation returns [EObject current=null] : (otherlv_0= 'animate' ( (otherlv_1= RULE_ID ) ) ( (lv_type_2_0= ruleAnimationType ) ) otherlv_3= 'to' ( (lv_location_4_0= ruleAlignment ) ) ( (lv_size_5_0= ruleSize ) )? ) ;
    public final EObject ruleAnimation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_type_2_0 = null;

        AntlrDatatypeRuleToken lv_location_4_0 = null;

        EObject lv_size_5_0 = null;



        	enterRule();

        try {
            // InternalSlideOMatic.g:1755:2: ( (otherlv_0= 'animate' ( (otherlv_1= RULE_ID ) ) ( (lv_type_2_0= ruleAnimationType ) ) otherlv_3= 'to' ( (lv_location_4_0= ruleAlignment ) ) ( (lv_size_5_0= ruleSize ) )? ) )
            // InternalSlideOMatic.g:1756:2: (otherlv_0= 'animate' ( (otherlv_1= RULE_ID ) ) ( (lv_type_2_0= ruleAnimationType ) ) otherlv_3= 'to' ( (lv_location_4_0= ruleAlignment ) ) ( (lv_size_5_0= ruleSize ) )? )
            {
            // InternalSlideOMatic.g:1756:2: (otherlv_0= 'animate' ( (otherlv_1= RULE_ID ) ) ( (lv_type_2_0= ruleAnimationType ) ) otherlv_3= 'to' ( (lv_location_4_0= ruleAlignment ) ) ( (lv_size_5_0= ruleSize ) )? )
            // InternalSlideOMatic.g:1757:3: otherlv_0= 'animate' ( (otherlv_1= RULE_ID ) ) ( (lv_type_2_0= ruleAnimationType ) ) otherlv_3= 'to' ( (lv_location_4_0= ruleAlignment ) ) ( (lv_size_5_0= ruleSize ) )?
            {
            otherlv_0=(Token)match(input,95,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getAnimationAccess().getAnimateKeyword_0());
            		
            // InternalSlideOMatic.g:1761:3: ( (otherlv_1= RULE_ID ) )
            // InternalSlideOMatic.g:1762:4: (otherlv_1= RULE_ID )
            {
            // InternalSlideOMatic.g:1762:4: (otherlv_1= RULE_ID )
            // InternalSlideOMatic.g:1763:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAnimationRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_33); 

            					newLeafNode(otherlv_1, grammarAccess.getAnimationAccess().getTargetFloatCrossReference_1_0());
            				

            }


            }

            // InternalSlideOMatic.g:1774:3: ( (lv_type_2_0= ruleAnimationType ) )
            // InternalSlideOMatic.g:1775:4: (lv_type_2_0= ruleAnimationType )
            {
            // InternalSlideOMatic.g:1775:4: (lv_type_2_0= ruleAnimationType )
            // InternalSlideOMatic.g:1776:5: lv_type_2_0= ruleAnimationType
            {

            					newCompositeNode(grammarAccess.getAnimationAccess().getTypeAnimationTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_34);
            lv_type_2_0=ruleAnimationType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAnimationRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"dk.sdu.mmmi.mdsd.f18.dsl.external.SlideOMatic.AnimationType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,96,FOLLOW_35); 

            			newLeafNode(otherlv_3, grammarAccess.getAnimationAccess().getToKeyword_3());
            		
            // InternalSlideOMatic.g:1797:3: ( (lv_location_4_0= ruleAlignment ) )
            // InternalSlideOMatic.g:1798:4: (lv_location_4_0= ruleAlignment )
            {
            // InternalSlideOMatic.g:1798:4: (lv_location_4_0= ruleAlignment )
            // InternalSlideOMatic.g:1799:5: lv_location_4_0= ruleAlignment
            {

            					newCompositeNode(grammarAccess.getAnimationAccess().getLocationAlignmentParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_36);
            lv_location_4_0=ruleAlignment();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAnimationRule());
            					}
            					set(
            						current,
            						"location",
            						lv_location_4_0,
            						"dk.sdu.mmmi.mdsd.f18.dsl.external.SlideOMatic.Alignment");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSlideOMatic.g:1816:3: ( (lv_size_5_0= ruleSize ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>=88 && LA31_0<=89)) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalSlideOMatic.g:1817:4: (lv_size_5_0= ruleSize )
                    {
                    // InternalSlideOMatic.g:1817:4: (lv_size_5_0= ruleSize )
                    // InternalSlideOMatic.g:1818:5: lv_size_5_0= ruleSize
                    {

                    					newCompositeNode(grammarAccess.getAnimationAccess().getSizeSizeParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_size_5_0=ruleSize();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAnimationRule());
                    					}
                    					set(
                    						current,
                    						"size",
                    						lv_size_5_0,
                    						"dk.sdu.mmmi.mdsd.f18.dsl.external.SlideOMatic.Size");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnimation"


    // $ANTLR start "entryRuleAnimationType"
    // InternalSlideOMatic.g:1839:1: entryRuleAnimationType returns [EObject current=null] : iv_ruleAnimationType= ruleAnimationType EOF ;
    public final EObject entryRuleAnimationType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnimationType = null;


        try {
            // InternalSlideOMatic.g:1839:54: (iv_ruleAnimationType= ruleAnimationType EOF )
            // InternalSlideOMatic.g:1840:2: iv_ruleAnimationType= ruleAnimationType EOF
            {
             newCompositeNode(grammarAccess.getAnimationTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnimationType=ruleAnimationType();

            state._fsp--;

             current =iv_ruleAnimationType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnimationType"


    // $ANTLR start "ruleAnimationType"
    // InternalSlideOMatic.g:1846:1: ruleAnimationType returns [EObject current=null] : ( ( () otherlv_1= 'move' ) | ( () otherlv_3= 'jump' ) ) ;
    public final EObject ruleAnimationType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalSlideOMatic.g:1852:2: ( ( ( () otherlv_1= 'move' ) | ( () otherlv_3= 'jump' ) ) )
            // InternalSlideOMatic.g:1853:2: ( ( () otherlv_1= 'move' ) | ( () otherlv_3= 'jump' ) )
            {
            // InternalSlideOMatic.g:1853:2: ( ( () otherlv_1= 'move' ) | ( () otherlv_3= 'jump' ) )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==97) ) {
                alt32=1;
            }
            else if ( (LA32_0==98) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // InternalSlideOMatic.g:1854:3: ( () otherlv_1= 'move' )
                    {
                    // InternalSlideOMatic.g:1854:3: ( () otherlv_1= 'move' )
                    // InternalSlideOMatic.g:1855:4: () otherlv_1= 'move'
                    {
                    // InternalSlideOMatic.g:1855:4: ()
                    // InternalSlideOMatic.g:1856:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAnimationTypeAccess().getMoveAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,97,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getAnimationTypeAccess().getMoveKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSlideOMatic.g:1868:3: ( () otherlv_3= 'jump' )
                    {
                    // InternalSlideOMatic.g:1868:3: ( () otherlv_3= 'jump' )
                    // InternalSlideOMatic.g:1869:4: () otherlv_3= 'jump'
                    {
                    // InternalSlideOMatic.g:1869:4: ()
                    // InternalSlideOMatic.g:1870:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAnimationTypeAccess().getJumpAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_3=(Token)match(input,98,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getAnimationTypeAccess().getJumpKeyword_1_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnimationType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000000A000L,0x0000000080000004L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x4000000000014000L,0x0000000000000003L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x4000000000004000L,0x0000000000000003L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L,0x0000000000000003L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004000L,0x0000000000000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000008000L,0x0000000080000004L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00003FFFFFFC0000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x3FFFC00010000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000001010L,0x0000000000000038L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000000L,0x00000000080027C0L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000008000L,0x00000000080027C0L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000002L,0x0000000040000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000000L,0x0000000003FF8000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x8000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000000L,0x0000000600000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000000L,0x0000000000FF8000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000002L,0x0000000003FF8000L});

}