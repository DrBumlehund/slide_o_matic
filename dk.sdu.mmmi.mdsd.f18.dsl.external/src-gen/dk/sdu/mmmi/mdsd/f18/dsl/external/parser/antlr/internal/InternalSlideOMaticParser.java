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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'presentation'", "'{'", "'('", "')'", "'}'", "'theme'", "'color'", "'AnnArbor'", "'Antibes'", "'Bergen'", "'Berkeley'", "'Berlin'", "'Boadilla'", "'boxes'", "'CambridgeUS'", "'Copenhagen'", "'Darmstadt'", "'default'", "'Dresden'", "'Frankfurt'", "'Goettingen'", "'Hannover'", "'Ilmanau'", "'JuanLesPins'", "'Luebeck'", "'Madrid'", "'Malmoe'", "'Marburg'", "'Montpellier'", "'PaloAlto'", "'Pittsburgh'", "'Rochester'", "'Singapore'", "'Szeged'", "'Warsaw'", "'albatros'", "'beaver'", "'beetle'", "'crane'", "'dolphin'", "'dove'", "'fly'", "'lily'", "'orchid'", "'rose'", "'seagull'", "'seahorse'", "'sidebartab'", "'structure'", "'whale'", "'wolverine'", "'author'", "'authors'", "','", "'institute'", "'date'", "'*'", "'slide'", "'**'", "'***'", "'ToC'", "'block'", "'#list'", "'&list'", "'-'", "'img'", "'src'", "'topleft'", "'top'", "'topright'", "'left'", "'center'", "'right'", "'bottomleft'", "'bottom'", "'bottomright'", "'%'", "'cm'", "'em'", "'mm'", "'width'", "'height'", "'tab'", "'['", "']'", "'```'", "'$$'", "'animate'", "'to'", "'move'", "'jump'"
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
    public static final int T__100=100;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__101=101;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__99=99;
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
    // InternalSlideOMatic.g:71:1: rulePresentation returns [EObject current=null] : (otherlv_0= 'presentation' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_subtitle_2_0= RULE_STRING ) )? otherlv_3= '{' (otherlv_4= '(' ( (lv_theme_5_0= ruleTheme ) )? ( (lv_authors_6_0= ruleAuthors ) )? ( (lv_institute_7_0= ruleInstitute ) )? ( (lv_date_8_0= ruleDate ) )? otherlv_9= ')' )? ( ( (lv_slides_10_0= ruleSlide ) ) | ( (lv_animations_11_0= ruleAnimation ) ) )* otherlv_12= '}' ) ;
    public final EObject rulePresentation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_subtitle_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_9=null;
        Token otherlv_12=null;
        EObject lv_theme_5_0 = null;

        EObject lv_authors_6_0 = null;

        EObject lv_institute_7_0 = null;

        EObject lv_date_8_0 = null;

        EObject lv_slides_10_0 = null;

        EObject lv_animations_11_0 = null;



        	enterRule();

        try {
            // InternalSlideOMatic.g:77:2: ( (otherlv_0= 'presentation' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_subtitle_2_0= RULE_STRING ) )? otherlv_3= '{' (otherlv_4= '(' ( (lv_theme_5_0= ruleTheme ) )? ( (lv_authors_6_0= ruleAuthors ) )? ( (lv_institute_7_0= ruleInstitute ) )? ( (lv_date_8_0= ruleDate ) )? otherlv_9= ')' )? ( ( (lv_slides_10_0= ruleSlide ) ) | ( (lv_animations_11_0= ruleAnimation ) ) )* otherlv_12= '}' ) )
            // InternalSlideOMatic.g:78:2: (otherlv_0= 'presentation' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_subtitle_2_0= RULE_STRING ) )? otherlv_3= '{' (otherlv_4= '(' ( (lv_theme_5_0= ruleTheme ) )? ( (lv_authors_6_0= ruleAuthors ) )? ( (lv_institute_7_0= ruleInstitute ) )? ( (lv_date_8_0= ruleDate ) )? otherlv_9= ')' )? ( ( (lv_slides_10_0= ruleSlide ) ) | ( (lv_animations_11_0= ruleAnimation ) ) )* otherlv_12= '}' )
            {
            // InternalSlideOMatic.g:78:2: (otherlv_0= 'presentation' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_subtitle_2_0= RULE_STRING ) )? otherlv_3= '{' (otherlv_4= '(' ( (lv_theme_5_0= ruleTheme ) )? ( (lv_authors_6_0= ruleAuthors ) )? ( (lv_institute_7_0= ruleInstitute ) )? ( (lv_date_8_0= ruleDate ) )? otherlv_9= ')' )? ( ( (lv_slides_10_0= ruleSlide ) ) | ( (lv_animations_11_0= ruleAnimation ) ) )* otherlv_12= '}' )
            // InternalSlideOMatic.g:79:3: otherlv_0= 'presentation' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_subtitle_2_0= RULE_STRING ) )? otherlv_3= '{' (otherlv_4= '(' ( (lv_theme_5_0= ruleTheme ) )? ( (lv_authors_6_0= ruleAuthors ) )? ( (lv_institute_7_0= ruleInstitute ) )? ( (lv_date_8_0= ruleDate ) )? otherlv_9= ')' )? ( ( (lv_slides_10_0= ruleSlide ) ) | ( (lv_animations_11_0= ruleAnimation ) ) )* otherlv_12= '}'
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

            // InternalSlideOMatic.g:101:3: ( (lv_subtitle_2_0= RULE_STRING ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalSlideOMatic.g:102:4: (lv_subtitle_2_0= RULE_STRING )
                    {
                    // InternalSlideOMatic.g:102:4: (lv_subtitle_2_0= RULE_STRING )
                    // InternalSlideOMatic.g:103:5: lv_subtitle_2_0= RULE_STRING
                    {
                    lv_subtitle_2_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

                    					newLeafNode(lv_subtitle_2_0, grammarAccess.getPresentationAccess().getSubtitleSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPresentationRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"subtitle",
                    						lv_subtitle_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getPresentationAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalSlideOMatic.g:123:3: (otherlv_4= '(' ( (lv_theme_5_0= ruleTheme ) )? ( (lv_authors_6_0= ruleAuthors ) )? ( (lv_institute_7_0= ruleInstitute ) )? ( (lv_date_8_0= ruleDate ) )? otherlv_9= ')' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==13) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalSlideOMatic.g:124:4: otherlv_4= '(' ( (lv_theme_5_0= ruleTheme ) )? ( (lv_authors_6_0= ruleAuthors ) )? ( (lv_institute_7_0= ruleInstitute ) )? ( (lv_date_8_0= ruleDate ) )? otherlv_9= ')'
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_7); 

                    				newLeafNode(otherlv_4, grammarAccess.getPresentationAccess().getLeftParenthesisKeyword_4_0());
                    			
                    // InternalSlideOMatic.g:128:4: ( (lv_theme_5_0= ruleTheme ) )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==16) ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // InternalSlideOMatic.g:129:5: (lv_theme_5_0= ruleTheme )
                            {
                            // InternalSlideOMatic.g:129:5: (lv_theme_5_0= ruleTheme )
                            // InternalSlideOMatic.g:130:6: lv_theme_5_0= ruleTheme
                            {

                            						newCompositeNode(grammarAccess.getPresentationAccess().getThemeThemeParserRuleCall_4_1_0());
                            					
                            pushFollow(FOLLOW_8);
                            lv_theme_5_0=ruleTheme();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getPresentationRule());
                            						}
                            						set(
                            							current,
                            							"theme",
                            							lv_theme_5_0,
                            							"dk.sdu.mmmi.mdsd.f18.dsl.external.SlideOMatic.Theme");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    // InternalSlideOMatic.g:147:4: ( (lv_authors_6_0= ruleAuthors ) )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( ((LA3_0>=62 && LA3_0<=63)) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // InternalSlideOMatic.g:148:5: (lv_authors_6_0= ruleAuthors )
                            {
                            // InternalSlideOMatic.g:148:5: (lv_authors_6_0= ruleAuthors )
                            // InternalSlideOMatic.g:149:6: lv_authors_6_0= ruleAuthors
                            {

                            						newCompositeNode(grammarAccess.getPresentationAccess().getAuthorsAuthorsParserRuleCall_4_2_0());
                            					
                            pushFollow(FOLLOW_9);
                            lv_authors_6_0=ruleAuthors();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getPresentationRule());
                            						}
                            						set(
                            							current,
                            							"authors",
                            							lv_authors_6_0,
                            							"dk.sdu.mmmi.mdsd.f18.dsl.external.SlideOMatic.Authors");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    // InternalSlideOMatic.g:166:4: ( (lv_institute_7_0= ruleInstitute ) )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==65) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // InternalSlideOMatic.g:167:5: (lv_institute_7_0= ruleInstitute )
                            {
                            // InternalSlideOMatic.g:167:5: (lv_institute_7_0= ruleInstitute )
                            // InternalSlideOMatic.g:168:6: lv_institute_7_0= ruleInstitute
                            {

                            						newCompositeNode(grammarAccess.getPresentationAccess().getInstituteInstituteParserRuleCall_4_3_0());
                            					
                            pushFollow(FOLLOW_10);
                            lv_institute_7_0=ruleInstitute();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getPresentationRule());
                            						}
                            						set(
                            							current,
                            							"institute",
                            							lv_institute_7_0,
                            							"dk.sdu.mmmi.mdsd.f18.dsl.external.SlideOMatic.Institute");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    // InternalSlideOMatic.g:185:4: ( (lv_date_8_0= ruleDate ) )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==66) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalSlideOMatic.g:186:5: (lv_date_8_0= ruleDate )
                            {
                            // InternalSlideOMatic.g:186:5: (lv_date_8_0= ruleDate )
                            // InternalSlideOMatic.g:187:6: lv_date_8_0= ruleDate
                            {

                            						newCompositeNode(grammarAccess.getPresentationAccess().getDateDateParserRuleCall_4_4_0());
                            					
                            pushFollow(FOLLOW_11);
                            lv_date_8_0=ruleDate();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getPresentationRule());
                            						}
                            						set(
                            							current,
                            							"date",
                            							lv_date_8_0,
                            							"dk.sdu.mmmi.mdsd.f18.dsl.external.SlideOMatic.Date");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    otherlv_9=(Token)match(input,14,FOLLOW_12); 

                    				newLeafNode(otherlv_9, grammarAccess.getPresentationAccess().getRightParenthesisKeyword_4_5());
                    			

                    }
                    break;

            }

            // InternalSlideOMatic.g:209:3: ( ( (lv_slides_10_0= ruleSlide ) ) | ( (lv_animations_11_0= ruleAnimation ) ) )*
            loop7:
            do {
                int alt7=3;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==68) ) {
                    alt7=1;
                }
                else if ( (LA7_0==98) ) {
                    alt7=2;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSlideOMatic.g:210:4: ( (lv_slides_10_0= ruleSlide ) )
            	    {
            	    // InternalSlideOMatic.g:210:4: ( (lv_slides_10_0= ruleSlide ) )
            	    // InternalSlideOMatic.g:211:5: (lv_slides_10_0= ruleSlide )
            	    {
            	    // InternalSlideOMatic.g:211:5: (lv_slides_10_0= ruleSlide )
            	    // InternalSlideOMatic.g:212:6: lv_slides_10_0= ruleSlide
            	    {

            	    						newCompositeNode(grammarAccess.getPresentationAccess().getSlidesSlideParserRuleCall_5_0_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_slides_10_0=ruleSlide();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPresentationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"slides",
            	    							lv_slides_10_0,
            	    							"dk.sdu.mmmi.mdsd.f18.dsl.external.SlideOMatic.Slide");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalSlideOMatic.g:230:4: ( (lv_animations_11_0= ruleAnimation ) )
            	    {
            	    // InternalSlideOMatic.g:230:4: ( (lv_animations_11_0= ruleAnimation ) )
            	    // InternalSlideOMatic.g:231:5: (lv_animations_11_0= ruleAnimation )
            	    {
            	    // InternalSlideOMatic.g:231:5: (lv_animations_11_0= ruleAnimation )
            	    // InternalSlideOMatic.g:232:6: lv_animations_11_0= ruleAnimation
            	    {

            	    						newCompositeNode(grammarAccess.getPresentationAccess().getAnimationsAnimationParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_animations_11_0=ruleAnimation();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPresentationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"animations",
            	    							lv_animations_11_0,
            	    							"dk.sdu.mmmi.mdsd.f18.dsl.external.SlideOMatic.Animation");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_12=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getPresentationAccess().getRightCurlyBracketKeyword_6());
            		

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
    // InternalSlideOMatic.g:258:1: entryRuleTheme returns [EObject current=null] : iv_ruleTheme= ruleTheme EOF ;
    public final EObject entryRuleTheme() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTheme = null;


        try {
            // InternalSlideOMatic.g:258:46: (iv_ruleTheme= ruleTheme EOF )
            // InternalSlideOMatic.g:259:2: iv_ruleTheme= ruleTheme EOF
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
    // InternalSlideOMatic.g:265:1: ruleTheme returns [EObject current=null] : (otherlv_0= 'theme' ( (lv_theme_1_0= ruleBeamerTheme ) ) (otherlv_2= 'color' ( (lv_themeColor_3_0= ruleThemeColor ) ) )? ) ;
    public final EObject ruleTheme() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_theme_1_0 = null;

        AntlrDatatypeRuleToken lv_themeColor_3_0 = null;



        	enterRule();

        try {
            // InternalSlideOMatic.g:271:2: ( (otherlv_0= 'theme' ( (lv_theme_1_0= ruleBeamerTheme ) ) (otherlv_2= 'color' ( (lv_themeColor_3_0= ruleThemeColor ) ) )? ) )
            // InternalSlideOMatic.g:272:2: (otherlv_0= 'theme' ( (lv_theme_1_0= ruleBeamerTheme ) ) (otherlv_2= 'color' ( (lv_themeColor_3_0= ruleThemeColor ) ) )? )
            {
            // InternalSlideOMatic.g:272:2: (otherlv_0= 'theme' ( (lv_theme_1_0= ruleBeamerTheme ) ) (otherlv_2= 'color' ( (lv_themeColor_3_0= ruleThemeColor ) ) )? )
            // InternalSlideOMatic.g:273:3: otherlv_0= 'theme' ( (lv_theme_1_0= ruleBeamerTheme ) ) (otherlv_2= 'color' ( (lv_themeColor_3_0= ruleThemeColor ) ) )?
            {
            otherlv_0=(Token)match(input,16,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getThemeAccess().getThemeKeyword_0());
            		
            // InternalSlideOMatic.g:277:3: ( (lv_theme_1_0= ruleBeamerTheme ) )
            // InternalSlideOMatic.g:278:4: (lv_theme_1_0= ruleBeamerTheme )
            {
            // InternalSlideOMatic.g:278:4: (lv_theme_1_0= ruleBeamerTheme )
            // InternalSlideOMatic.g:279:5: lv_theme_1_0= ruleBeamerTheme
            {

            					newCompositeNode(grammarAccess.getThemeAccess().getThemeBeamerThemeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_14);
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

            // InternalSlideOMatic.g:296:3: (otherlv_2= 'color' ( (lv_themeColor_3_0= ruleThemeColor ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==17) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalSlideOMatic.g:297:4: otherlv_2= 'color' ( (lv_themeColor_3_0= ruleThemeColor ) )
                    {
                    otherlv_2=(Token)match(input,17,FOLLOW_15); 

                    				newLeafNode(otherlv_2, grammarAccess.getThemeAccess().getColorKeyword_2_0());
                    			
                    // InternalSlideOMatic.g:301:4: ( (lv_themeColor_3_0= ruleThemeColor ) )
                    // InternalSlideOMatic.g:302:5: (lv_themeColor_3_0= ruleThemeColor )
                    {
                    // InternalSlideOMatic.g:302:5: (lv_themeColor_3_0= ruleThemeColor )
                    // InternalSlideOMatic.g:303:6: lv_themeColor_3_0= ruleThemeColor
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
    // InternalSlideOMatic.g:325:1: entryRuleBeamerTheme returns [String current=null] : iv_ruleBeamerTheme= ruleBeamerTheme EOF ;
    public final String entryRuleBeamerTheme() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBeamerTheme = null;


        try {
            // InternalSlideOMatic.g:325:51: (iv_ruleBeamerTheme= ruleBeamerTheme EOF )
            // InternalSlideOMatic.g:326:2: iv_ruleBeamerTheme= ruleBeamerTheme EOF
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
    // InternalSlideOMatic.g:332:1: ruleBeamerTheme returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'AnnArbor' | kw= 'Antibes' | kw= 'Bergen' | kw= 'Berkeley' | kw= 'Berlin' | kw= 'Boadilla' | kw= 'boxes' | kw= 'CambridgeUS' | kw= 'Copenhagen' | kw= 'Darmstadt' | kw= 'default' | kw= 'Dresden' | kw= 'Frankfurt' | kw= 'Goettingen' | kw= 'Hannover' | kw= 'Ilmanau' | kw= 'JuanLesPins' | kw= 'Luebeck' | kw= 'Madrid' | kw= 'Malmoe' | kw= 'Marburg' | kw= 'Montpellier' | kw= 'PaloAlto' | kw= 'Pittsburgh' | kw= 'Rochester' | kw= 'Singapore' | kw= 'Szeged' | kw= 'Warsaw' ) ;
    public final AntlrDatatypeRuleToken ruleBeamerTheme() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSlideOMatic.g:338:2: ( (kw= 'AnnArbor' | kw= 'Antibes' | kw= 'Bergen' | kw= 'Berkeley' | kw= 'Berlin' | kw= 'Boadilla' | kw= 'boxes' | kw= 'CambridgeUS' | kw= 'Copenhagen' | kw= 'Darmstadt' | kw= 'default' | kw= 'Dresden' | kw= 'Frankfurt' | kw= 'Goettingen' | kw= 'Hannover' | kw= 'Ilmanau' | kw= 'JuanLesPins' | kw= 'Luebeck' | kw= 'Madrid' | kw= 'Malmoe' | kw= 'Marburg' | kw= 'Montpellier' | kw= 'PaloAlto' | kw= 'Pittsburgh' | kw= 'Rochester' | kw= 'Singapore' | kw= 'Szeged' | kw= 'Warsaw' ) )
            // InternalSlideOMatic.g:339:2: (kw= 'AnnArbor' | kw= 'Antibes' | kw= 'Bergen' | kw= 'Berkeley' | kw= 'Berlin' | kw= 'Boadilla' | kw= 'boxes' | kw= 'CambridgeUS' | kw= 'Copenhagen' | kw= 'Darmstadt' | kw= 'default' | kw= 'Dresden' | kw= 'Frankfurt' | kw= 'Goettingen' | kw= 'Hannover' | kw= 'Ilmanau' | kw= 'JuanLesPins' | kw= 'Luebeck' | kw= 'Madrid' | kw= 'Malmoe' | kw= 'Marburg' | kw= 'Montpellier' | kw= 'PaloAlto' | kw= 'Pittsburgh' | kw= 'Rochester' | kw= 'Singapore' | kw= 'Szeged' | kw= 'Warsaw' )
            {
            // InternalSlideOMatic.g:339:2: (kw= 'AnnArbor' | kw= 'Antibes' | kw= 'Bergen' | kw= 'Berkeley' | kw= 'Berlin' | kw= 'Boadilla' | kw= 'boxes' | kw= 'CambridgeUS' | kw= 'Copenhagen' | kw= 'Darmstadt' | kw= 'default' | kw= 'Dresden' | kw= 'Frankfurt' | kw= 'Goettingen' | kw= 'Hannover' | kw= 'Ilmanau' | kw= 'JuanLesPins' | kw= 'Luebeck' | kw= 'Madrid' | kw= 'Malmoe' | kw= 'Marburg' | kw= 'Montpellier' | kw= 'PaloAlto' | kw= 'Pittsburgh' | kw= 'Rochester' | kw= 'Singapore' | kw= 'Szeged' | kw= 'Warsaw' )
            int alt9=28;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt9=1;
                }
                break;
            case 19:
                {
                alt9=2;
                }
                break;
            case 20:
                {
                alt9=3;
                }
                break;
            case 21:
                {
                alt9=4;
                }
                break;
            case 22:
                {
                alt9=5;
                }
                break;
            case 23:
                {
                alt9=6;
                }
                break;
            case 24:
                {
                alt9=7;
                }
                break;
            case 25:
                {
                alt9=8;
                }
                break;
            case 26:
                {
                alt9=9;
                }
                break;
            case 27:
                {
                alt9=10;
                }
                break;
            case 28:
                {
                alt9=11;
                }
                break;
            case 29:
                {
                alt9=12;
                }
                break;
            case 30:
                {
                alt9=13;
                }
                break;
            case 31:
                {
                alt9=14;
                }
                break;
            case 32:
                {
                alt9=15;
                }
                break;
            case 33:
                {
                alt9=16;
                }
                break;
            case 34:
                {
                alt9=17;
                }
                break;
            case 35:
                {
                alt9=18;
                }
                break;
            case 36:
                {
                alt9=19;
                }
                break;
            case 37:
                {
                alt9=20;
                }
                break;
            case 38:
                {
                alt9=21;
                }
                break;
            case 39:
                {
                alt9=22;
                }
                break;
            case 40:
                {
                alt9=23;
                }
                break;
            case 41:
                {
                alt9=24;
                }
                break;
            case 42:
                {
                alt9=25;
                }
                break;
            case 43:
                {
                alt9=26;
                }
                break;
            case 44:
                {
                alt9=27;
                }
                break;
            case 45:
                {
                alt9=28;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalSlideOMatic.g:340:3: kw= 'AnnArbor'
                    {
                    kw=(Token)match(input,18,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBeamerThemeAccess().getAnnArborKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSlideOMatic.g:346:3: kw= 'Antibes'
                    {
                    kw=(Token)match(input,19,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBeamerThemeAccess().getAntibesKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalSlideOMatic.g:352:3: kw= 'Bergen'
                    {
                    kw=(Token)match(input,20,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBeamerThemeAccess().getBergenKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalSlideOMatic.g:358:3: kw= 'Berkeley'
                    {
                    kw=(Token)match(input,21,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBeamerThemeAccess().getBerkeleyKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalSlideOMatic.g:364:3: kw= 'Berlin'
                    {
                    kw=(Token)match(input,22,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBeamerThemeAccess().getBerlinKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalSlideOMatic.g:370:3: kw= 'Boadilla'
                    {
                    kw=(Token)match(input,23,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBeamerThemeAccess().getBoadillaKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalSlideOMatic.g:376:3: kw= 'boxes'
                    {
                    kw=(Token)match(input,24,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBeamerThemeAccess().getBoxesKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalSlideOMatic.g:382:3: kw= 'CambridgeUS'
                    {
                    kw=(Token)match(input,25,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBeamerThemeAccess().getCambridgeUSKeyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalSlideOMatic.g:388:3: kw= 'Copenhagen'
                    {
                    kw=(Token)match(input,26,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBeamerThemeAccess().getCopenhagenKeyword_8());
                    		

                    }
                    break;
                case 10 :
                    // InternalSlideOMatic.g:394:3: kw= 'Darmstadt'
                    {
                    kw=(Token)match(input,27,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBeamerThemeAccess().getDarmstadtKeyword_9());
                    		

                    }
                    break;
                case 11 :
                    // InternalSlideOMatic.g:400:3: kw= 'default'
                    {
                    kw=(Token)match(input,28,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBeamerThemeAccess().getDefaultKeyword_10());
                    		

                    }
                    break;
                case 12 :
                    // InternalSlideOMatic.g:406:3: kw= 'Dresden'
                    {
                    kw=(Token)match(input,29,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBeamerThemeAccess().getDresdenKeyword_11());
                    		

                    }
                    break;
                case 13 :
                    // InternalSlideOMatic.g:412:3: kw= 'Frankfurt'
                    {
                    kw=(Token)match(input,30,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBeamerThemeAccess().getFrankfurtKeyword_12());
                    		

                    }
                    break;
                case 14 :
                    // InternalSlideOMatic.g:418:3: kw= 'Goettingen'
                    {
                    kw=(Token)match(input,31,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBeamerThemeAccess().getGoettingenKeyword_13());
                    		

                    }
                    break;
                case 15 :
                    // InternalSlideOMatic.g:424:3: kw= 'Hannover'
                    {
                    kw=(Token)match(input,32,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBeamerThemeAccess().getHannoverKeyword_14());
                    		

                    }
                    break;
                case 16 :
                    // InternalSlideOMatic.g:430:3: kw= 'Ilmanau'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBeamerThemeAccess().getIlmanauKeyword_15());
                    		

                    }
                    break;
                case 17 :
                    // InternalSlideOMatic.g:436:3: kw= 'JuanLesPins'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBeamerThemeAccess().getJuanLesPinsKeyword_16());
                    		

                    }
                    break;
                case 18 :
                    // InternalSlideOMatic.g:442:3: kw= 'Luebeck'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBeamerThemeAccess().getLuebeckKeyword_17());
                    		

                    }
                    break;
                case 19 :
                    // InternalSlideOMatic.g:448:3: kw= 'Madrid'
                    {
                    kw=(Token)match(input,36,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBeamerThemeAccess().getMadridKeyword_18());
                    		

                    }
                    break;
                case 20 :
                    // InternalSlideOMatic.g:454:3: kw= 'Malmoe'
                    {
                    kw=(Token)match(input,37,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBeamerThemeAccess().getMalmoeKeyword_19());
                    		

                    }
                    break;
                case 21 :
                    // InternalSlideOMatic.g:460:3: kw= 'Marburg'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBeamerThemeAccess().getMarburgKeyword_20());
                    		

                    }
                    break;
                case 22 :
                    // InternalSlideOMatic.g:466:3: kw= 'Montpellier'
                    {
                    kw=(Token)match(input,39,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBeamerThemeAccess().getMontpellierKeyword_21());
                    		

                    }
                    break;
                case 23 :
                    // InternalSlideOMatic.g:472:3: kw= 'PaloAlto'
                    {
                    kw=(Token)match(input,40,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBeamerThemeAccess().getPaloAltoKeyword_22());
                    		

                    }
                    break;
                case 24 :
                    // InternalSlideOMatic.g:478:3: kw= 'Pittsburgh'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBeamerThemeAccess().getPittsburghKeyword_23());
                    		

                    }
                    break;
                case 25 :
                    // InternalSlideOMatic.g:484:3: kw= 'Rochester'
                    {
                    kw=(Token)match(input,42,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBeamerThemeAccess().getRochesterKeyword_24());
                    		

                    }
                    break;
                case 26 :
                    // InternalSlideOMatic.g:490:3: kw= 'Singapore'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBeamerThemeAccess().getSingaporeKeyword_25());
                    		

                    }
                    break;
                case 27 :
                    // InternalSlideOMatic.g:496:3: kw= 'Szeged'
                    {
                    kw=(Token)match(input,44,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBeamerThemeAccess().getSzegedKeyword_26());
                    		

                    }
                    break;
                case 28 :
                    // InternalSlideOMatic.g:502:3: kw= 'Warsaw'
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
    // InternalSlideOMatic.g:511:1: entryRuleThemeColor returns [String current=null] : iv_ruleThemeColor= ruleThemeColor EOF ;
    public final String entryRuleThemeColor() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleThemeColor = null;


        try {
            // InternalSlideOMatic.g:511:50: (iv_ruleThemeColor= ruleThemeColor EOF )
            // InternalSlideOMatic.g:512:2: iv_ruleThemeColor= ruleThemeColor EOF
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
    // InternalSlideOMatic.g:518:1: ruleThemeColor returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'albatros' | kw= 'beaver' | kw= 'beetle' | kw= 'crane' | kw= 'default' | kw= 'dolphin' | kw= 'dove' | kw= 'fly' | kw= 'lily' | kw= 'orchid' | kw= 'rose' | kw= 'seagull' | kw= 'seahorse' | kw= 'sidebartab' | kw= 'structure' | kw= 'whale' | kw= 'wolverine' ) ;
    public final AntlrDatatypeRuleToken ruleThemeColor() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSlideOMatic.g:524:2: ( (kw= 'albatros' | kw= 'beaver' | kw= 'beetle' | kw= 'crane' | kw= 'default' | kw= 'dolphin' | kw= 'dove' | kw= 'fly' | kw= 'lily' | kw= 'orchid' | kw= 'rose' | kw= 'seagull' | kw= 'seahorse' | kw= 'sidebartab' | kw= 'structure' | kw= 'whale' | kw= 'wolverine' ) )
            // InternalSlideOMatic.g:525:2: (kw= 'albatros' | kw= 'beaver' | kw= 'beetle' | kw= 'crane' | kw= 'default' | kw= 'dolphin' | kw= 'dove' | kw= 'fly' | kw= 'lily' | kw= 'orchid' | kw= 'rose' | kw= 'seagull' | kw= 'seahorse' | kw= 'sidebartab' | kw= 'structure' | kw= 'whale' | kw= 'wolverine' )
            {
            // InternalSlideOMatic.g:525:2: (kw= 'albatros' | kw= 'beaver' | kw= 'beetle' | kw= 'crane' | kw= 'default' | kw= 'dolphin' | kw= 'dove' | kw= 'fly' | kw= 'lily' | kw= 'orchid' | kw= 'rose' | kw= 'seagull' | kw= 'seahorse' | kw= 'sidebartab' | kw= 'structure' | kw= 'whale' | kw= 'wolverine' )
            int alt10=17;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt10=1;
                }
                break;
            case 47:
                {
                alt10=2;
                }
                break;
            case 48:
                {
                alt10=3;
                }
                break;
            case 49:
                {
                alt10=4;
                }
                break;
            case 28:
                {
                alt10=5;
                }
                break;
            case 50:
                {
                alt10=6;
                }
                break;
            case 51:
                {
                alt10=7;
                }
                break;
            case 52:
                {
                alt10=8;
                }
                break;
            case 53:
                {
                alt10=9;
                }
                break;
            case 54:
                {
                alt10=10;
                }
                break;
            case 55:
                {
                alt10=11;
                }
                break;
            case 56:
                {
                alt10=12;
                }
                break;
            case 57:
                {
                alt10=13;
                }
                break;
            case 58:
                {
                alt10=14;
                }
                break;
            case 59:
                {
                alt10=15;
                }
                break;
            case 60:
                {
                alt10=16;
                }
                break;
            case 61:
                {
                alt10=17;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalSlideOMatic.g:526:3: kw= 'albatros'
                    {
                    kw=(Token)match(input,46,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getThemeColorAccess().getAlbatrosKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSlideOMatic.g:532:3: kw= 'beaver'
                    {
                    kw=(Token)match(input,47,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getThemeColorAccess().getBeaverKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalSlideOMatic.g:538:3: kw= 'beetle'
                    {
                    kw=(Token)match(input,48,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getThemeColorAccess().getBeetleKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalSlideOMatic.g:544:3: kw= 'crane'
                    {
                    kw=(Token)match(input,49,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getThemeColorAccess().getCraneKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalSlideOMatic.g:550:3: kw= 'default'
                    {
                    kw=(Token)match(input,28,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getThemeColorAccess().getDefaultKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalSlideOMatic.g:556:3: kw= 'dolphin'
                    {
                    kw=(Token)match(input,50,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getThemeColorAccess().getDolphinKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalSlideOMatic.g:562:3: kw= 'dove'
                    {
                    kw=(Token)match(input,51,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getThemeColorAccess().getDoveKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalSlideOMatic.g:568:3: kw= 'fly'
                    {
                    kw=(Token)match(input,52,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getThemeColorAccess().getFlyKeyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalSlideOMatic.g:574:3: kw= 'lily'
                    {
                    kw=(Token)match(input,53,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getThemeColorAccess().getLilyKeyword_8());
                    		

                    }
                    break;
                case 10 :
                    // InternalSlideOMatic.g:580:3: kw= 'orchid'
                    {
                    kw=(Token)match(input,54,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getThemeColorAccess().getOrchidKeyword_9());
                    		

                    }
                    break;
                case 11 :
                    // InternalSlideOMatic.g:586:3: kw= 'rose'
                    {
                    kw=(Token)match(input,55,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getThemeColorAccess().getRoseKeyword_10());
                    		

                    }
                    break;
                case 12 :
                    // InternalSlideOMatic.g:592:3: kw= 'seagull'
                    {
                    kw=(Token)match(input,56,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getThemeColorAccess().getSeagullKeyword_11());
                    		

                    }
                    break;
                case 13 :
                    // InternalSlideOMatic.g:598:3: kw= 'seahorse'
                    {
                    kw=(Token)match(input,57,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getThemeColorAccess().getSeahorseKeyword_12());
                    		

                    }
                    break;
                case 14 :
                    // InternalSlideOMatic.g:604:3: kw= 'sidebartab'
                    {
                    kw=(Token)match(input,58,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getThemeColorAccess().getSidebartabKeyword_13());
                    		

                    }
                    break;
                case 15 :
                    // InternalSlideOMatic.g:610:3: kw= 'structure'
                    {
                    kw=(Token)match(input,59,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getThemeColorAccess().getStructureKeyword_14());
                    		

                    }
                    break;
                case 16 :
                    // InternalSlideOMatic.g:616:3: kw= 'whale'
                    {
                    kw=(Token)match(input,60,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getThemeColorAccess().getWhaleKeyword_15());
                    		

                    }
                    break;
                case 17 :
                    // InternalSlideOMatic.g:622:3: kw= 'wolverine'
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
    // InternalSlideOMatic.g:631:1: entryRuleAuthors returns [EObject current=null] : iv_ruleAuthors= ruleAuthors EOF ;
    public final EObject entryRuleAuthors() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAuthors = null;


        try {
            // InternalSlideOMatic.g:631:48: (iv_ruleAuthors= ruleAuthors EOF )
            // InternalSlideOMatic.g:632:2: iv_ruleAuthors= ruleAuthors EOF
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
    // InternalSlideOMatic.g:638:1: ruleAuthors returns [EObject current=null] : ( (otherlv_0= 'author' | otherlv_1= 'authors' ) ( (lv_names_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_names_4_0= RULE_STRING ) ) )* ) ;
    public final EObject ruleAuthors() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_names_2_0=null;
        Token otherlv_3=null;
        Token lv_names_4_0=null;


        	enterRule();

        try {
            // InternalSlideOMatic.g:644:2: ( ( (otherlv_0= 'author' | otherlv_1= 'authors' ) ( (lv_names_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_names_4_0= RULE_STRING ) ) )* ) )
            // InternalSlideOMatic.g:645:2: ( (otherlv_0= 'author' | otherlv_1= 'authors' ) ( (lv_names_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_names_4_0= RULE_STRING ) ) )* )
            {
            // InternalSlideOMatic.g:645:2: ( (otherlv_0= 'author' | otherlv_1= 'authors' ) ( (lv_names_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_names_4_0= RULE_STRING ) ) )* )
            // InternalSlideOMatic.g:646:3: (otherlv_0= 'author' | otherlv_1= 'authors' ) ( (lv_names_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_names_4_0= RULE_STRING ) ) )*
            {
            // InternalSlideOMatic.g:646:3: (otherlv_0= 'author' | otherlv_1= 'authors' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==62) ) {
                alt11=1;
            }
            else if ( (LA11_0==63) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalSlideOMatic.g:647:4: otherlv_0= 'author'
                    {
                    otherlv_0=(Token)match(input,62,FOLLOW_3); 

                    				newLeafNode(otherlv_0, grammarAccess.getAuthorsAccess().getAuthorKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalSlideOMatic.g:652:4: otherlv_1= 'authors'
                    {
                    otherlv_1=(Token)match(input,63,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getAuthorsAccess().getAuthorsKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalSlideOMatic.g:657:3: ( (lv_names_2_0= RULE_STRING ) )
            // InternalSlideOMatic.g:658:4: (lv_names_2_0= RULE_STRING )
            {
            // InternalSlideOMatic.g:658:4: (lv_names_2_0= RULE_STRING )
            // InternalSlideOMatic.g:659:5: lv_names_2_0= RULE_STRING
            {
            lv_names_2_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

            					newLeafNode(lv_names_2_0, grammarAccess.getAuthorsAccess().getNamesSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAuthorsRule());
            					}
            					addWithLastConsumed(
            						current,
            						"names",
            						lv_names_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalSlideOMatic.g:675:3: (otherlv_3= ',' ( (lv_names_4_0= RULE_STRING ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==64) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalSlideOMatic.g:676:4: otherlv_3= ',' ( (lv_names_4_0= RULE_STRING ) )
            	    {
            	    otherlv_3=(Token)match(input,64,FOLLOW_3); 

            	    				newLeafNode(otherlv_3, grammarAccess.getAuthorsAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalSlideOMatic.g:680:4: ( (lv_names_4_0= RULE_STRING ) )
            	    // InternalSlideOMatic.g:681:5: (lv_names_4_0= RULE_STRING )
            	    {
            	    // InternalSlideOMatic.g:681:5: (lv_names_4_0= RULE_STRING )
            	    // InternalSlideOMatic.g:682:6: lv_names_4_0= RULE_STRING
            	    {
            	    lv_names_4_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

            	    						newLeafNode(lv_names_4_0, grammarAccess.getAuthorsAccess().getNamesSTRINGTerminalRuleCall_2_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getAuthorsRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"names",
            	    							lv_names_4_0,
            	    							"org.eclipse.xtext.common.Terminals.STRING");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalSlideOMatic.g:703:1: entryRuleInstitute returns [EObject current=null] : iv_ruleInstitute= ruleInstitute EOF ;
    public final EObject entryRuleInstitute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstitute = null;


        try {
            // InternalSlideOMatic.g:703:50: (iv_ruleInstitute= ruleInstitute EOF )
            // InternalSlideOMatic.g:704:2: iv_ruleInstitute= ruleInstitute EOF
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
    // InternalSlideOMatic.g:710:1: ruleInstitute returns [EObject current=null] : (otherlv_0= 'institute' ( (lv_name_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleInstitute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalSlideOMatic.g:716:2: ( (otherlv_0= 'institute' ( (lv_name_1_0= RULE_STRING ) ) ) )
            // InternalSlideOMatic.g:717:2: (otherlv_0= 'institute' ( (lv_name_1_0= RULE_STRING ) ) )
            {
            // InternalSlideOMatic.g:717:2: (otherlv_0= 'institute' ( (lv_name_1_0= RULE_STRING ) ) )
            // InternalSlideOMatic.g:718:3: otherlv_0= 'institute' ( (lv_name_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,65,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getInstituteAccess().getInstituteKeyword_0());
            		
            // InternalSlideOMatic.g:722:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalSlideOMatic.g:723:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalSlideOMatic.g:723:4: (lv_name_1_0= RULE_STRING )
            // InternalSlideOMatic.g:724:5: lv_name_1_0= RULE_STRING
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
    // InternalSlideOMatic.g:744:1: entryRuleDate returns [EObject current=null] : iv_ruleDate= ruleDate EOF ;
    public final EObject entryRuleDate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDate = null;


        try {
            // InternalSlideOMatic.g:744:45: (iv_ruleDate= ruleDate EOF )
            // InternalSlideOMatic.g:745:2: iv_ruleDate= ruleDate EOF
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
    // InternalSlideOMatic.g:751:1: ruleDate returns [EObject current=null] : (otherlv_0= 'date' ( ( (lv_date_1_0= RULE_STRING ) ) | ( () otherlv_3= '*' ) ) ) ;
    public final EObject ruleDate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_date_1_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalSlideOMatic.g:757:2: ( (otherlv_0= 'date' ( ( (lv_date_1_0= RULE_STRING ) ) | ( () otherlv_3= '*' ) ) ) )
            // InternalSlideOMatic.g:758:2: (otherlv_0= 'date' ( ( (lv_date_1_0= RULE_STRING ) ) | ( () otherlv_3= '*' ) ) )
            {
            // InternalSlideOMatic.g:758:2: (otherlv_0= 'date' ( ( (lv_date_1_0= RULE_STRING ) ) | ( () otherlv_3= '*' ) ) )
            // InternalSlideOMatic.g:759:3: otherlv_0= 'date' ( ( (lv_date_1_0= RULE_STRING ) ) | ( () otherlv_3= '*' ) )
            {
            otherlv_0=(Token)match(input,66,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getDateAccess().getDateKeyword_0());
            		
            // InternalSlideOMatic.g:763:3: ( ( (lv_date_1_0= RULE_STRING ) ) | ( () otherlv_3= '*' ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_STRING) ) {
                alt13=1;
            }
            else if ( (LA13_0==67) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalSlideOMatic.g:764:4: ( (lv_date_1_0= RULE_STRING ) )
                    {
                    // InternalSlideOMatic.g:764:4: ( (lv_date_1_0= RULE_STRING ) )
                    // InternalSlideOMatic.g:765:5: (lv_date_1_0= RULE_STRING )
                    {
                    // InternalSlideOMatic.g:765:5: (lv_date_1_0= RULE_STRING )
                    // InternalSlideOMatic.g:766:6: lv_date_1_0= RULE_STRING
                    {
                    lv_date_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_date_1_0, grammarAccess.getDateAccess().getDateSTRINGTerminalRuleCall_1_0_0());
                    					

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
                    break;
                case 2 :
                    // InternalSlideOMatic.g:783:4: ( () otherlv_3= '*' )
                    {
                    // InternalSlideOMatic.g:783:4: ( () otherlv_3= '*' )
                    // InternalSlideOMatic.g:784:5: () otherlv_3= '*'
                    {
                    // InternalSlideOMatic.g:784:5: ()
                    // InternalSlideOMatic.g:785:6: 
                    {

                    						current = forceCreateModelElement(
                    							grammarAccess.getDateAccess().getCompileDateAction_1_1_0(),
                    							current);
                    					

                    }

                    otherlv_3=(Token)match(input,67,FOLLOW_2); 

                    					newLeafNode(otherlv_3, grammarAccess.getDateAccess().getAsteriskKeyword_1_1_1());
                    				

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
    // $ANTLR end "ruleDate"


    // $ANTLR start "entryRuleSlide"
    // InternalSlideOMatic.g:801:1: entryRuleSlide returns [EObject current=null] : iv_ruleSlide= ruleSlide EOF ;
    public final EObject entryRuleSlide() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlide = null;


        try {
            // InternalSlideOMatic.g:801:46: (iv_ruleSlide= ruleSlide EOF )
            // InternalSlideOMatic.g:802:2: iv_ruleSlide= ruleSlide EOF
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
    // InternalSlideOMatic.g:808:1: ruleSlide returns [EObject current=null] : (otherlv_0= 'slide' ( ( ( (lv_sec_1_0= ruleSection ) ) ( (lv_name_2_0= RULE_STRING ) ) ) | ( (lv_name_3_0= RULE_STRING ) ) )? otherlv_4= '{' ( (lv_contents_5_0= ruleContent ) )+ otherlv_6= '}' ) ;
    public final EObject ruleSlide() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_sec_1_0 = null;

        EObject lv_contents_5_0 = null;



        	enterRule();

        try {
            // InternalSlideOMatic.g:814:2: ( (otherlv_0= 'slide' ( ( ( (lv_sec_1_0= ruleSection ) ) ( (lv_name_2_0= RULE_STRING ) ) ) | ( (lv_name_3_0= RULE_STRING ) ) )? otherlv_4= '{' ( (lv_contents_5_0= ruleContent ) )+ otherlv_6= '}' ) )
            // InternalSlideOMatic.g:815:2: (otherlv_0= 'slide' ( ( ( (lv_sec_1_0= ruleSection ) ) ( (lv_name_2_0= RULE_STRING ) ) ) | ( (lv_name_3_0= RULE_STRING ) ) )? otherlv_4= '{' ( (lv_contents_5_0= ruleContent ) )+ otherlv_6= '}' )
            {
            // InternalSlideOMatic.g:815:2: (otherlv_0= 'slide' ( ( ( (lv_sec_1_0= ruleSection ) ) ( (lv_name_2_0= RULE_STRING ) ) ) | ( (lv_name_3_0= RULE_STRING ) ) )? otherlv_4= '{' ( (lv_contents_5_0= ruleContent ) )+ otherlv_6= '}' )
            // InternalSlideOMatic.g:816:3: otherlv_0= 'slide' ( ( ( (lv_sec_1_0= ruleSection ) ) ( (lv_name_2_0= RULE_STRING ) ) ) | ( (lv_name_3_0= RULE_STRING ) ) )? otherlv_4= '{' ( (lv_contents_5_0= ruleContent ) )+ otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,68,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getSlideAccess().getSlideKeyword_0());
            		
            // InternalSlideOMatic.g:820:3: ( ( ( (lv_sec_1_0= ruleSection ) ) ( (lv_name_2_0= RULE_STRING ) ) ) | ( (lv_name_3_0= RULE_STRING ) ) )?
            int alt14=3;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==67||(LA14_0>=69 && LA14_0<=70)) ) {
                alt14=1;
            }
            else if ( (LA14_0==RULE_STRING) ) {
                alt14=2;
            }
            switch (alt14) {
                case 1 :
                    // InternalSlideOMatic.g:821:4: ( ( (lv_sec_1_0= ruleSection ) ) ( (lv_name_2_0= RULE_STRING ) ) )
                    {
                    // InternalSlideOMatic.g:821:4: ( ( (lv_sec_1_0= ruleSection ) ) ( (lv_name_2_0= RULE_STRING ) ) )
                    // InternalSlideOMatic.g:822:5: ( (lv_sec_1_0= ruleSection ) ) ( (lv_name_2_0= RULE_STRING ) )
                    {
                    // InternalSlideOMatic.g:822:5: ( (lv_sec_1_0= ruleSection ) )
                    // InternalSlideOMatic.g:823:6: (lv_sec_1_0= ruleSection )
                    {
                    // InternalSlideOMatic.g:823:6: (lv_sec_1_0= ruleSection )
                    // InternalSlideOMatic.g:824:7: lv_sec_1_0= ruleSection
                    {

                    							newCompositeNode(grammarAccess.getSlideAccess().getSecSectionParserRuleCall_1_0_0_0());
                    						
                    pushFollow(FOLLOW_3);
                    lv_sec_1_0=ruleSection();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getSlideRule());
                    							}
                    							set(
                    								current,
                    								"sec",
                    								lv_sec_1_0,
                    								"dk.sdu.mmmi.mdsd.f18.dsl.external.SlideOMatic.Section");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalSlideOMatic.g:841:5: ( (lv_name_2_0= RULE_STRING ) )
                    // InternalSlideOMatic.g:842:6: (lv_name_2_0= RULE_STRING )
                    {
                    // InternalSlideOMatic.g:842:6: (lv_name_2_0= RULE_STRING )
                    // InternalSlideOMatic.g:843:7: lv_name_2_0= RULE_STRING
                    {
                    lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

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
                    // InternalSlideOMatic.g:861:4: ( (lv_name_3_0= RULE_STRING ) )
                    {
                    // InternalSlideOMatic.g:861:4: ( (lv_name_3_0= RULE_STRING ) )
                    // InternalSlideOMatic.g:862:5: (lv_name_3_0= RULE_STRING )
                    {
                    // InternalSlideOMatic.g:862:5: (lv_name_3_0= RULE_STRING )
                    // InternalSlideOMatic.g:863:6: lv_name_3_0= RULE_STRING
                    {
                    lv_name_3_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

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

            otherlv_4=(Token)match(input,12,FOLLOW_19); 

            			newLeafNode(otherlv_4, grammarAccess.getSlideAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSlideOMatic.g:884:3: ( (lv_contents_5_0= ruleContent ) )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_STRING||(LA15_0>=71 && LA15_0<=74)||LA15_0==76||LA15_0==93||LA15_0==96) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalSlideOMatic.g:885:4: (lv_contents_5_0= ruleContent )
            	    {
            	    // InternalSlideOMatic.g:885:4: (lv_contents_5_0= ruleContent )
            	    // InternalSlideOMatic.g:886:5: lv_contents_5_0= ruleContent
            	    {

            	    					newCompositeNode(grammarAccess.getSlideAccess().getContentsContentParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_20);
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
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
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
    // InternalSlideOMatic.g:911:1: entryRuleSection returns [EObject current=null] : iv_ruleSection= ruleSection EOF ;
    public final EObject entryRuleSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSection = null;


        try {
            // InternalSlideOMatic.g:911:48: (iv_ruleSection= ruleSection EOF )
            // InternalSlideOMatic.g:912:2: iv_ruleSection= ruleSection EOF
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
    // InternalSlideOMatic.g:918:1: ruleSection returns [EObject current=null] : ( ( () otherlv_1= '*' ) | ( () otherlv_3= '**' ) | ( () otherlv_5= '***' ) ) ;
    public final EObject ruleSection() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalSlideOMatic.g:924:2: ( ( ( () otherlv_1= '*' ) | ( () otherlv_3= '**' ) | ( () otherlv_5= '***' ) ) )
            // InternalSlideOMatic.g:925:2: ( ( () otherlv_1= '*' ) | ( () otherlv_3= '**' ) | ( () otherlv_5= '***' ) )
            {
            // InternalSlideOMatic.g:925:2: ( ( () otherlv_1= '*' ) | ( () otherlv_3= '**' ) | ( () otherlv_5= '***' ) )
            int alt16=3;
            switch ( input.LA(1) ) {
            case 67:
                {
                alt16=1;
                }
                break;
            case 69:
                {
                alt16=2;
                }
                break;
            case 70:
                {
                alt16=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalSlideOMatic.g:926:3: ( () otherlv_1= '*' )
                    {
                    // InternalSlideOMatic.g:926:3: ( () otherlv_1= '*' )
                    // InternalSlideOMatic.g:927:4: () otherlv_1= '*'
                    {
                    // InternalSlideOMatic.g:927:4: ()
                    // InternalSlideOMatic.g:928:5: 
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
                    // InternalSlideOMatic.g:940:3: ( () otherlv_3= '**' )
                    {
                    // InternalSlideOMatic.g:940:3: ( () otherlv_3= '**' )
                    // InternalSlideOMatic.g:941:4: () otherlv_3= '**'
                    {
                    // InternalSlideOMatic.g:941:4: ()
                    // InternalSlideOMatic.g:942:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSectionAccess().getSubSecAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_3=(Token)match(input,69,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getSectionAccess().getAsteriskAsteriskKeyword_1_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSlideOMatic.g:954:3: ( () otherlv_5= '***' )
                    {
                    // InternalSlideOMatic.g:954:3: ( () otherlv_5= '***' )
                    // InternalSlideOMatic.g:955:4: () otherlv_5= '***'
                    {
                    // InternalSlideOMatic.g:955:4: ()
                    // InternalSlideOMatic.g:956:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSectionAccess().getSubSubSecAction_2_0(),
                    						current);
                    				

                    }

                    otherlv_5=(Token)match(input,70,FOLLOW_2); 

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
    // InternalSlideOMatic.g:971:1: entryRuleContent returns [EObject current=null] : iv_ruleContent= ruleContent EOF ;
    public final EObject entryRuleContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContent = null;


        try {
            // InternalSlideOMatic.g:971:48: (iv_ruleContent= ruleContent EOF )
            // InternalSlideOMatic.g:972:2: iv_ruleContent= ruleContent EOF
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
    // InternalSlideOMatic.g:978:1: ruleContent returns [EObject current=null] : ( (this_ToC_0= ruleToC | this_Text_1= ruleText | this_Block_2= ruleBlock | this_List_3= ruleList | this_Image_4= ruleImage | this_Table_5= ruleTable | this_Code_6= ruleCode ) ( (lv_click_7_0= ruleClick ) )? ) ;
    public final EObject ruleContent() throws RecognitionException {
        EObject current = null;

        EObject this_ToC_0 = null;

        EObject this_Text_1 = null;

        EObject this_Block_2 = null;

        EObject this_List_3 = null;

        EObject this_Image_4 = null;

        EObject this_Table_5 = null;

        EObject this_Code_6 = null;

        AntlrDatatypeRuleToken lv_click_7_0 = null;



        	enterRule();

        try {
            // InternalSlideOMatic.g:984:2: ( ( (this_ToC_0= ruleToC | this_Text_1= ruleText | this_Block_2= ruleBlock | this_List_3= ruleList | this_Image_4= ruleImage | this_Table_5= ruleTable | this_Code_6= ruleCode ) ( (lv_click_7_0= ruleClick ) )? ) )
            // InternalSlideOMatic.g:985:2: ( (this_ToC_0= ruleToC | this_Text_1= ruleText | this_Block_2= ruleBlock | this_List_3= ruleList | this_Image_4= ruleImage | this_Table_5= ruleTable | this_Code_6= ruleCode ) ( (lv_click_7_0= ruleClick ) )? )
            {
            // InternalSlideOMatic.g:985:2: ( (this_ToC_0= ruleToC | this_Text_1= ruleText | this_Block_2= ruleBlock | this_List_3= ruleList | this_Image_4= ruleImage | this_Table_5= ruleTable | this_Code_6= ruleCode ) ( (lv_click_7_0= ruleClick ) )? )
            // InternalSlideOMatic.g:986:3: (this_ToC_0= ruleToC | this_Text_1= ruleText | this_Block_2= ruleBlock | this_List_3= ruleList | this_Image_4= ruleImage | this_Table_5= ruleTable | this_Code_6= ruleCode ) ( (lv_click_7_0= ruleClick ) )?
            {
            // InternalSlideOMatic.g:986:3: (this_ToC_0= ruleToC | this_Text_1= ruleText | this_Block_2= ruleBlock | this_List_3= ruleList | this_Image_4= ruleImage | this_Table_5= ruleTable | this_Code_6= ruleCode )
            int alt17=7;
            switch ( input.LA(1) ) {
            case 71:
                {
                alt17=1;
                }
                break;
            case RULE_STRING:
                {
                alt17=2;
                }
                break;
            case 72:
                {
                alt17=3;
                }
                break;
            case 73:
            case 74:
                {
                alt17=4;
                }
                break;
            case 76:
                {
                alt17=5;
                }
                break;
            case 93:
                {
                alt17=6;
                }
                break;
            case 96:
                {
                alt17=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalSlideOMatic.g:987:4: this_ToC_0= ruleToC
                    {

                    				newCompositeNode(grammarAccess.getContentAccess().getToCParserRuleCall_0_0());
                    			
                    pushFollow(FOLLOW_21);
                    this_ToC_0=ruleToC();

                    state._fsp--;


                    				current = this_ToC_0;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalSlideOMatic.g:996:4: this_Text_1= ruleText
                    {

                    				newCompositeNode(grammarAccess.getContentAccess().getTextParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_21);
                    this_Text_1=ruleText();

                    state._fsp--;


                    				current = this_Text_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 3 :
                    // InternalSlideOMatic.g:1005:4: this_Block_2= ruleBlock
                    {

                    				newCompositeNode(grammarAccess.getContentAccess().getBlockParserRuleCall_0_2());
                    			
                    pushFollow(FOLLOW_21);
                    this_Block_2=ruleBlock();

                    state._fsp--;


                    				current = this_Block_2;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 4 :
                    // InternalSlideOMatic.g:1014:4: this_List_3= ruleList
                    {

                    				newCompositeNode(grammarAccess.getContentAccess().getListParserRuleCall_0_3());
                    			
                    pushFollow(FOLLOW_21);
                    this_List_3=ruleList();

                    state._fsp--;


                    				current = this_List_3;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 5 :
                    // InternalSlideOMatic.g:1023:4: this_Image_4= ruleImage
                    {

                    				newCompositeNode(grammarAccess.getContentAccess().getImageParserRuleCall_0_4());
                    			
                    pushFollow(FOLLOW_21);
                    this_Image_4=ruleImage();

                    state._fsp--;


                    				current = this_Image_4;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 6 :
                    // InternalSlideOMatic.g:1032:4: this_Table_5= ruleTable
                    {

                    				newCompositeNode(grammarAccess.getContentAccess().getTableParserRuleCall_0_5());
                    			
                    pushFollow(FOLLOW_21);
                    this_Table_5=ruleTable();

                    state._fsp--;


                    				current = this_Table_5;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 7 :
                    // InternalSlideOMatic.g:1041:4: this_Code_6= ruleCode
                    {

                    				newCompositeNode(grammarAccess.getContentAccess().getCodeParserRuleCall_0_6());
                    			
                    pushFollow(FOLLOW_21);
                    this_Code_6=ruleCode();

                    state._fsp--;


                    				current = this_Code_6;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalSlideOMatic.g:1050:3: ( (lv_click_7_0= ruleClick ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==97) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalSlideOMatic.g:1051:4: (lv_click_7_0= ruleClick )
                    {
                    // InternalSlideOMatic.g:1051:4: (lv_click_7_0= ruleClick )
                    // InternalSlideOMatic.g:1052:5: lv_click_7_0= ruleClick
                    {

                    					newCompositeNode(grammarAccess.getContentAccess().getClickClickParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_click_7_0=ruleClick();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getContentRule());
                    					}
                    					set(
                    						current,
                    						"click",
                    						lv_click_7_0,
                    						"dk.sdu.mmmi.mdsd.f18.dsl.external.SlideOMatic.Click");
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
    // $ANTLR end "ruleContent"


    // $ANTLR start "entryRuleToC"
    // InternalSlideOMatic.g:1073:1: entryRuleToC returns [EObject current=null] : iv_ruleToC= ruleToC EOF ;
    public final EObject entryRuleToC() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleToC = null;


        try {
            // InternalSlideOMatic.g:1073:44: (iv_ruleToC= ruleToC EOF )
            // InternalSlideOMatic.g:1074:2: iv_ruleToC= ruleToC EOF
            {
             newCompositeNode(grammarAccess.getToCRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleToC=ruleToC();

            state._fsp--;

             current =iv_ruleToC; 
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
    // $ANTLR end "entryRuleToC"


    // $ANTLR start "ruleToC"
    // InternalSlideOMatic.g:1080:1: ruleToC returns [EObject current=null] : ( ( () otherlv_1= 'ToC' ) | ( () otherlv_3= 'ToC' otherlv_4= '*' ) ) ;
    public final EObject ruleToC() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalSlideOMatic.g:1086:2: ( ( ( () otherlv_1= 'ToC' ) | ( () otherlv_3= 'ToC' otherlv_4= '*' ) ) )
            // InternalSlideOMatic.g:1087:2: ( ( () otherlv_1= 'ToC' ) | ( () otherlv_3= 'ToC' otherlv_4= '*' ) )
            {
            // InternalSlideOMatic.g:1087:2: ( ( () otherlv_1= 'ToC' ) | ( () otherlv_3= 'ToC' otherlv_4= '*' ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==71) ) {
                int LA19_1 = input.LA(2);

                if ( (LA19_1==EOF||LA19_1==RULE_STRING||LA19_1==15||(LA19_1>=71 && LA19_1<=74)||LA19_1==76||LA19_1==93||(LA19_1>=96 && LA19_1<=97)) ) {
                    alt19=1;
                }
                else if ( (LA19_1==67) ) {
                    alt19=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalSlideOMatic.g:1088:3: ( () otherlv_1= 'ToC' )
                    {
                    // InternalSlideOMatic.g:1088:3: ( () otherlv_1= 'ToC' )
                    // InternalSlideOMatic.g:1089:4: () otherlv_1= 'ToC'
                    {
                    // InternalSlideOMatic.g:1089:4: ()
                    // InternalSlideOMatic.g:1090:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getToCAccess().getToCAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,71,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getToCAccess().getToCKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSlideOMatic.g:1102:3: ( () otherlv_3= 'ToC' otherlv_4= '*' )
                    {
                    // InternalSlideOMatic.g:1102:3: ( () otherlv_3= 'ToC' otherlv_4= '*' )
                    // InternalSlideOMatic.g:1103:4: () otherlv_3= 'ToC' otherlv_4= '*'
                    {
                    // InternalSlideOMatic.g:1103:4: ()
                    // InternalSlideOMatic.g:1104:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getToCAccess().getCurrentSecToCAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_3=(Token)match(input,71,FOLLOW_22); 

                    				newLeafNode(otherlv_3, grammarAccess.getToCAccess().getToCKeyword_1_1());
                    			
                    otherlv_4=(Token)match(input,67,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getToCAccess().getAsteriskKeyword_1_2());
                    			

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
    // $ANTLR end "ruleToC"


    // $ANTLR start "entryRuleText"
    // InternalSlideOMatic.g:1123:1: entryRuleText returns [EObject current=null] : iv_ruleText= ruleText EOF ;
    public final EObject entryRuleText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleText = null;


        try {
            // InternalSlideOMatic.g:1123:45: (iv_ruleText= ruleText EOF )
            // InternalSlideOMatic.g:1124:2: iv_ruleText= ruleText EOF
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
    // InternalSlideOMatic.g:1130:1: ruleText returns [EObject current=null] : ( (lv_text_0_0= RULE_STRING ) ) ;
    public final EObject ruleText() throws RecognitionException {
        EObject current = null;

        Token lv_text_0_0=null;


        	enterRule();

        try {
            // InternalSlideOMatic.g:1136:2: ( ( (lv_text_0_0= RULE_STRING ) ) )
            // InternalSlideOMatic.g:1137:2: ( (lv_text_0_0= RULE_STRING ) )
            {
            // InternalSlideOMatic.g:1137:2: ( (lv_text_0_0= RULE_STRING ) )
            // InternalSlideOMatic.g:1138:3: (lv_text_0_0= RULE_STRING )
            {
            // InternalSlideOMatic.g:1138:3: (lv_text_0_0= RULE_STRING )
            // InternalSlideOMatic.g:1139:4: lv_text_0_0= RULE_STRING
            {
            lv_text_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_text_0_0, grammarAccess.getTextAccess().getTextSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getTextRule());
            				}
            				setWithLastConsumed(
            					current,
            					"text",
            					lv_text_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

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
    // $ANTLR end "ruleText"


    // $ANTLR start "entryRuleBlock"
    // InternalSlideOMatic.g:1158:1: entryRuleBlock returns [EObject current=null] : iv_ruleBlock= ruleBlock EOF ;
    public final EObject entryRuleBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlock = null;


        try {
            // InternalSlideOMatic.g:1158:46: (iv_ruleBlock= ruleBlock EOF )
            // InternalSlideOMatic.g:1159:2: iv_ruleBlock= ruleBlock EOF
            {
             newCompositeNode(grammarAccess.getBlockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBlock=ruleBlock();

            state._fsp--;

             current =iv_ruleBlock; 
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
    // $ANTLR end "entryRuleBlock"


    // $ANTLR start "ruleBlock"
    // InternalSlideOMatic.g:1165:1: ruleBlock returns [EObject current=null] : (otherlv_0= 'block' ( (lv_name_1_0= RULE_STRING ) )? otherlv_2= '{' ( (lv_content_3_0= ruleContent ) )+ otherlv_4= '}' ) ;
    public final EObject ruleBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_content_3_0 = null;



        	enterRule();

        try {
            // InternalSlideOMatic.g:1171:2: ( (otherlv_0= 'block' ( (lv_name_1_0= RULE_STRING ) )? otherlv_2= '{' ( (lv_content_3_0= ruleContent ) )+ otherlv_4= '}' ) )
            // InternalSlideOMatic.g:1172:2: (otherlv_0= 'block' ( (lv_name_1_0= RULE_STRING ) )? otherlv_2= '{' ( (lv_content_3_0= ruleContent ) )+ otherlv_4= '}' )
            {
            // InternalSlideOMatic.g:1172:2: (otherlv_0= 'block' ( (lv_name_1_0= RULE_STRING ) )? otherlv_2= '{' ( (lv_content_3_0= ruleContent ) )+ otherlv_4= '}' )
            // InternalSlideOMatic.g:1173:3: otherlv_0= 'block' ( (lv_name_1_0= RULE_STRING ) )? otherlv_2= '{' ( (lv_content_3_0= ruleContent ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,72,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getBlockAccess().getBlockKeyword_0());
            		
            // InternalSlideOMatic.g:1177:3: ( (lv_name_1_0= RULE_STRING ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_STRING) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalSlideOMatic.g:1178:4: (lv_name_1_0= RULE_STRING )
                    {
                    // InternalSlideOMatic.g:1178:4: (lv_name_1_0= RULE_STRING )
                    // InternalSlideOMatic.g:1179:5: lv_name_1_0= RULE_STRING
                    {
                    lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

                    					newLeafNode(lv_name_1_0, grammarAccess.getBlockAccess().getNameSTRINGTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBlockRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_1_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,12,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSlideOMatic.g:1199:3: ( (lv_content_3_0= ruleContent ) )+
            int cnt21=0;
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_STRING||(LA21_0>=71 && LA21_0<=74)||LA21_0==76||LA21_0==93||LA21_0==96) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalSlideOMatic.g:1200:4: (lv_content_3_0= ruleContent )
            	    {
            	    // InternalSlideOMatic.g:1200:4: (lv_content_3_0= ruleContent )
            	    // InternalSlideOMatic.g:1201:5: lv_content_3_0= ruleContent
            	    {

            	    					newCompositeNode(grammarAccess.getBlockAccess().getContentContentParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_20);
            	    lv_content_3_0=ruleContent();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getBlockRule());
            	    					}
            	    					add(
            	    						current,
            	    						"content",
            	    						lv_content_3_0,
            	    						"dk.sdu.mmmi.mdsd.f18.dsl.external.SlideOMatic.Content");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt21 >= 1 ) break loop21;
                        EarlyExitException eee =
                            new EarlyExitException(21, input);
                        throw eee;
                }
                cnt21++;
            } while (true);

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleBlock"


    // $ANTLR start "entryRuleList"
    // InternalSlideOMatic.g:1226:1: entryRuleList returns [EObject current=null] : iv_ruleList= ruleList EOF ;
    public final EObject entryRuleList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleList = null;


        try {
            // InternalSlideOMatic.g:1226:45: (iv_ruleList= ruleList EOF )
            // InternalSlideOMatic.g:1227:2: iv_ruleList= ruleList EOF
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
    // InternalSlideOMatic.g:1233:1: ruleList returns [EObject current=null] : (this_NumberedList_0= ruleNumberedList | this_UnNumberedList_1= ruleUnNumberedList ) ;
    public final EObject ruleList() throws RecognitionException {
        EObject current = null;

        EObject this_NumberedList_0 = null;

        EObject this_UnNumberedList_1 = null;



        	enterRule();

        try {
            // InternalSlideOMatic.g:1239:2: ( (this_NumberedList_0= ruleNumberedList | this_UnNumberedList_1= ruleUnNumberedList ) )
            // InternalSlideOMatic.g:1240:2: (this_NumberedList_0= ruleNumberedList | this_UnNumberedList_1= ruleUnNumberedList )
            {
            // InternalSlideOMatic.g:1240:2: (this_NumberedList_0= ruleNumberedList | this_UnNumberedList_1= ruleUnNumberedList )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==73) ) {
                alt22=1;
            }
            else if ( (LA22_0==74) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalSlideOMatic.g:1241:3: this_NumberedList_0= ruleNumberedList
                    {

                    			newCompositeNode(grammarAccess.getListAccess().getNumberedListParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_NumberedList_0=ruleNumberedList();

                    state._fsp--;


                    			current = this_NumberedList_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSlideOMatic.g:1250:3: this_UnNumberedList_1= ruleUnNumberedList
                    {

                    			newCompositeNode(grammarAccess.getListAccess().getUnNumberedListParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_UnNumberedList_1=ruleUnNumberedList();

                    state._fsp--;


                    			current = this_UnNumberedList_1;
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
    // $ANTLR end "ruleList"


    // $ANTLR start "entryRuleNumberedList"
    // InternalSlideOMatic.g:1262:1: entryRuleNumberedList returns [EObject current=null] : iv_ruleNumberedList= ruleNumberedList EOF ;
    public final EObject entryRuleNumberedList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberedList = null;


        try {
            // InternalSlideOMatic.g:1262:53: (iv_ruleNumberedList= ruleNumberedList EOF )
            // InternalSlideOMatic.g:1263:2: iv_ruleNumberedList= ruleNumberedList EOF
            {
             newCompositeNode(grammarAccess.getNumberedListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumberedList=ruleNumberedList();

            state._fsp--;

             current =iv_ruleNumberedList; 
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
    // $ANTLR end "entryRuleNumberedList"


    // $ANTLR start "ruleNumberedList"
    // InternalSlideOMatic.g:1269:1: ruleNumberedList returns [EObject current=null] : (otherlv_0= '#list' ( (lv_items_1_0= ruleListItem ) )+ ) ;
    public final EObject ruleNumberedList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_items_1_0 = null;



        	enterRule();

        try {
            // InternalSlideOMatic.g:1275:2: ( (otherlv_0= '#list' ( (lv_items_1_0= ruleListItem ) )+ ) )
            // InternalSlideOMatic.g:1276:2: (otherlv_0= '#list' ( (lv_items_1_0= ruleListItem ) )+ )
            {
            // InternalSlideOMatic.g:1276:2: (otherlv_0= '#list' ( (lv_items_1_0= ruleListItem ) )+ )
            // InternalSlideOMatic.g:1277:3: otherlv_0= '#list' ( (lv_items_1_0= ruleListItem ) )+
            {
            otherlv_0=(Token)match(input,73,FOLLOW_23); 

            			newLeafNode(otherlv_0, grammarAccess.getNumberedListAccess().getListKeyword_0());
            		
            // InternalSlideOMatic.g:1281:3: ( (lv_items_1_0= ruleListItem ) )+
            int cnt23=0;
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==75) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalSlideOMatic.g:1282:4: (lv_items_1_0= ruleListItem )
            	    {
            	    // InternalSlideOMatic.g:1282:4: (lv_items_1_0= ruleListItem )
            	    // InternalSlideOMatic.g:1283:5: lv_items_1_0= ruleListItem
            	    {

            	    					newCompositeNode(grammarAccess.getNumberedListAccess().getItemsListItemParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_24);
            	    lv_items_1_0=ruleListItem();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getNumberedListRule());
            	    					}
            	    					add(
            	    						current,
            	    						"items",
            	    						lv_items_1_0,
            	    						"dk.sdu.mmmi.mdsd.f18.dsl.external.SlideOMatic.ListItem");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt23 >= 1 ) break loop23;
                        EarlyExitException eee =
                            new EarlyExitException(23, input);
                        throw eee;
                }
                cnt23++;
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
    // $ANTLR end "ruleNumberedList"


    // $ANTLR start "entryRuleUnNumberedList"
    // InternalSlideOMatic.g:1304:1: entryRuleUnNumberedList returns [EObject current=null] : iv_ruleUnNumberedList= ruleUnNumberedList EOF ;
    public final EObject entryRuleUnNumberedList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnNumberedList = null;


        try {
            // InternalSlideOMatic.g:1304:55: (iv_ruleUnNumberedList= ruleUnNumberedList EOF )
            // InternalSlideOMatic.g:1305:2: iv_ruleUnNumberedList= ruleUnNumberedList EOF
            {
             newCompositeNode(grammarAccess.getUnNumberedListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnNumberedList=ruleUnNumberedList();

            state._fsp--;

             current =iv_ruleUnNumberedList; 
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
    // $ANTLR end "entryRuleUnNumberedList"


    // $ANTLR start "ruleUnNumberedList"
    // InternalSlideOMatic.g:1311:1: ruleUnNumberedList returns [EObject current=null] : (otherlv_0= '&list' ( (lv_items_1_0= ruleListItem ) )+ ) ;
    public final EObject ruleUnNumberedList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_items_1_0 = null;



        	enterRule();

        try {
            // InternalSlideOMatic.g:1317:2: ( (otherlv_0= '&list' ( (lv_items_1_0= ruleListItem ) )+ ) )
            // InternalSlideOMatic.g:1318:2: (otherlv_0= '&list' ( (lv_items_1_0= ruleListItem ) )+ )
            {
            // InternalSlideOMatic.g:1318:2: (otherlv_0= '&list' ( (lv_items_1_0= ruleListItem ) )+ )
            // InternalSlideOMatic.g:1319:3: otherlv_0= '&list' ( (lv_items_1_0= ruleListItem ) )+
            {
            otherlv_0=(Token)match(input,74,FOLLOW_23); 

            			newLeafNode(otherlv_0, grammarAccess.getUnNumberedListAccess().getListKeyword_0());
            		
            // InternalSlideOMatic.g:1323:3: ( (lv_items_1_0= ruleListItem ) )+
            int cnt24=0;
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==75) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalSlideOMatic.g:1324:4: (lv_items_1_0= ruleListItem )
            	    {
            	    // InternalSlideOMatic.g:1324:4: (lv_items_1_0= ruleListItem )
            	    // InternalSlideOMatic.g:1325:5: lv_items_1_0= ruleListItem
            	    {

            	    					newCompositeNode(grammarAccess.getUnNumberedListAccess().getItemsListItemParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_24);
            	    lv_items_1_0=ruleListItem();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getUnNumberedListRule());
            	    					}
            	    					add(
            	    						current,
            	    						"items",
            	    						lv_items_1_0,
            	    						"dk.sdu.mmmi.mdsd.f18.dsl.external.SlideOMatic.ListItem");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt24 >= 1 ) break loop24;
                        EarlyExitException eee =
                            new EarlyExitException(24, input);
                        throw eee;
                }
                cnt24++;
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
    // $ANTLR end "ruleUnNumberedList"


    // $ANTLR start "entryRuleListItem"
    // InternalSlideOMatic.g:1346:1: entryRuleListItem returns [EObject current=null] : iv_ruleListItem= ruleListItem EOF ;
    public final EObject entryRuleListItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListItem = null;


        try {
            // InternalSlideOMatic.g:1346:49: (iv_ruleListItem= ruleListItem EOF )
            // InternalSlideOMatic.g:1347:2: iv_ruleListItem= ruleListItem EOF
            {
             newCompositeNode(grammarAccess.getListItemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleListItem=ruleListItem();

            state._fsp--;

             current =iv_ruleListItem; 
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
    // $ANTLR end "entryRuleListItem"


    // $ANTLR start "ruleListItem"
    // InternalSlideOMatic.g:1353:1: ruleListItem returns [EObject current=null] : (otherlv_0= '-' ( (lv_item_1_0= RULE_STRING ) ) (otherlv_2= '(' ( (lv_nestedList_3_0= ruleList ) ) otherlv_4= ')' )? ( (lv_click_5_0= ruleClick ) )? ) ;
    public final EObject ruleListItem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_item_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_nestedList_3_0 = null;

        AntlrDatatypeRuleToken lv_click_5_0 = null;



        	enterRule();

        try {
            // InternalSlideOMatic.g:1359:2: ( (otherlv_0= '-' ( (lv_item_1_0= RULE_STRING ) ) (otherlv_2= '(' ( (lv_nestedList_3_0= ruleList ) ) otherlv_4= ')' )? ( (lv_click_5_0= ruleClick ) )? ) )
            // InternalSlideOMatic.g:1360:2: (otherlv_0= '-' ( (lv_item_1_0= RULE_STRING ) ) (otherlv_2= '(' ( (lv_nestedList_3_0= ruleList ) ) otherlv_4= ')' )? ( (lv_click_5_0= ruleClick ) )? )
            {
            // InternalSlideOMatic.g:1360:2: (otherlv_0= '-' ( (lv_item_1_0= RULE_STRING ) ) (otherlv_2= '(' ( (lv_nestedList_3_0= ruleList ) ) otherlv_4= ')' )? ( (lv_click_5_0= ruleClick ) )? )
            // InternalSlideOMatic.g:1361:3: otherlv_0= '-' ( (lv_item_1_0= RULE_STRING ) ) (otherlv_2= '(' ( (lv_nestedList_3_0= ruleList ) ) otherlv_4= ')' )? ( (lv_click_5_0= ruleClick ) )?
            {
            otherlv_0=(Token)match(input,75,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getListItemAccess().getHyphenMinusKeyword_0());
            		
            // InternalSlideOMatic.g:1365:3: ( (lv_item_1_0= RULE_STRING ) )
            // InternalSlideOMatic.g:1366:4: (lv_item_1_0= RULE_STRING )
            {
            // InternalSlideOMatic.g:1366:4: (lv_item_1_0= RULE_STRING )
            // InternalSlideOMatic.g:1367:5: lv_item_1_0= RULE_STRING
            {
            lv_item_1_0=(Token)match(input,RULE_STRING,FOLLOW_25); 

            					newLeafNode(lv_item_1_0, grammarAccess.getListItemAccess().getItemSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getListItemRule());
            					}
            					setWithLastConsumed(
            						current,
            						"item",
            						lv_item_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalSlideOMatic.g:1383:3: (otherlv_2= '(' ( (lv_nestedList_3_0= ruleList ) ) otherlv_4= ')' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==13) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalSlideOMatic.g:1384:4: otherlv_2= '(' ( (lv_nestedList_3_0= ruleList ) ) otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_26); 

                    				newLeafNode(otherlv_2, grammarAccess.getListItemAccess().getLeftParenthesisKeyword_2_0());
                    			
                    // InternalSlideOMatic.g:1388:4: ( (lv_nestedList_3_0= ruleList ) )
                    // InternalSlideOMatic.g:1389:5: (lv_nestedList_3_0= ruleList )
                    {
                    // InternalSlideOMatic.g:1389:5: (lv_nestedList_3_0= ruleList )
                    // InternalSlideOMatic.g:1390:6: lv_nestedList_3_0= ruleList
                    {

                    						newCompositeNode(grammarAccess.getListItemAccess().getNestedListListParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_nestedList_3_0=ruleList();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getListItemRule());
                    						}
                    						set(
                    							current,
                    							"nestedList",
                    							lv_nestedList_3_0,
                    							"dk.sdu.mmmi.mdsd.f18.dsl.external.SlideOMatic.List");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,14,FOLLOW_21); 

                    				newLeafNode(otherlv_4, grammarAccess.getListItemAccess().getRightParenthesisKeyword_2_2());
                    			

                    }
                    break;

            }

            // InternalSlideOMatic.g:1412:3: ( (lv_click_5_0= ruleClick ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==97) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalSlideOMatic.g:1413:4: (lv_click_5_0= ruleClick )
                    {
                    // InternalSlideOMatic.g:1413:4: (lv_click_5_0= ruleClick )
                    // InternalSlideOMatic.g:1414:5: lv_click_5_0= ruleClick
                    {

                    					newCompositeNode(grammarAccess.getListItemAccess().getClickClickParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_click_5_0=ruleClick();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getListItemRule());
                    					}
                    					set(
                    						current,
                    						"click",
                    						lv_click_5_0,
                    						"dk.sdu.mmmi.mdsd.f18.dsl.external.SlideOMatic.Click");
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
    // $ANTLR end "ruleListItem"


    // $ANTLR start "entryRuleImage"
    // InternalSlideOMatic.g:1435:1: entryRuleImage returns [EObject current=null] : iv_ruleImage= ruleImage EOF ;
    public final EObject entryRuleImage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImage = null;


        try {
            // InternalSlideOMatic.g:1435:46: (iv_ruleImage= ruleImage EOF )
            // InternalSlideOMatic.g:1436:2: iv_ruleImage= ruleImage EOF
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
    // InternalSlideOMatic.g:1442:1: ruleImage returns [EObject current=null] : (otherlv_0= 'img' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'src' ( (lv_src_3_0= RULE_STRING ) ) ( (lv_alignment_4_0= ruleAlignment ) )? ( (lv_size_5_0= ruleSize ) ) ) ;
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
            // InternalSlideOMatic.g:1448:2: ( (otherlv_0= 'img' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'src' ( (lv_src_3_0= RULE_STRING ) ) ( (lv_alignment_4_0= ruleAlignment ) )? ( (lv_size_5_0= ruleSize ) ) ) )
            // InternalSlideOMatic.g:1449:2: (otherlv_0= 'img' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'src' ( (lv_src_3_0= RULE_STRING ) ) ( (lv_alignment_4_0= ruleAlignment ) )? ( (lv_size_5_0= ruleSize ) ) )
            {
            // InternalSlideOMatic.g:1449:2: (otherlv_0= 'img' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'src' ( (lv_src_3_0= RULE_STRING ) ) ( (lv_alignment_4_0= ruleAlignment ) )? ( (lv_size_5_0= ruleSize ) ) )
            // InternalSlideOMatic.g:1450:3: otherlv_0= 'img' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'src' ( (lv_src_3_0= RULE_STRING ) ) ( (lv_alignment_4_0= ruleAlignment ) )? ( (lv_size_5_0= ruleSize ) )
            {
            otherlv_0=(Token)match(input,76,FOLLOW_27); 

            			newLeafNode(otherlv_0, grammarAccess.getImageAccess().getImgKeyword_0());
            		
            // InternalSlideOMatic.g:1454:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSlideOMatic.g:1455:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSlideOMatic.g:1455:4: (lv_name_1_0= RULE_ID )
            // InternalSlideOMatic.g:1456:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_28); 

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

            otherlv_2=(Token)match(input,77,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getImageAccess().getSrcKeyword_2());
            		
            // InternalSlideOMatic.g:1476:3: ( (lv_src_3_0= RULE_STRING ) )
            // InternalSlideOMatic.g:1477:4: (lv_src_3_0= RULE_STRING )
            {
            // InternalSlideOMatic.g:1477:4: (lv_src_3_0= RULE_STRING )
            // InternalSlideOMatic.g:1478:5: lv_src_3_0= RULE_STRING
            {
            lv_src_3_0=(Token)match(input,RULE_STRING,FOLLOW_29); 

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

            // InternalSlideOMatic.g:1494:3: ( (lv_alignment_4_0= ruleAlignment ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=78 && LA27_0<=86)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalSlideOMatic.g:1495:4: (lv_alignment_4_0= ruleAlignment )
                    {
                    // InternalSlideOMatic.g:1495:4: (lv_alignment_4_0= ruleAlignment )
                    // InternalSlideOMatic.g:1496:5: lv_alignment_4_0= ruleAlignment
                    {

                    					newCompositeNode(grammarAccess.getImageAccess().getAlignmentAlignmentParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_29);
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

            // InternalSlideOMatic.g:1513:3: ( (lv_size_5_0= ruleSize ) )
            // InternalSlideOMatic.g:1514:4: (lv_size_5_0= ruleSize )
            {
            // InternalSlideOMatic.g:1514:4: (lv_size_5_0= ruleSize )
            // InternalSlideOMatic.g:1515:5: lv_size_5_0= ruleSize
            {

            					newCompositeNode(grammarAccess.getImageAccess().getSizeSizeParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
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
    // InternalSlideOMatic.g:1536:1: entryRuleAlignment returns [String current=null] : iv_ruleAlignment= ruleAlignment EOF ;
    public final String entryRuleAlignment() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAlignment = null;


        try {
            // InternalSlideOMatic.g:1536:49: (iv_ruleAlignment= ruleAlignment EOF )
            // InternalSlideOMatic.g:1537:2: iv_ruleAlignment= ruleAlignment EOF
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
    // InternalSlideOMatic.g:1543:1: ruleAlignment returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'topleft' | kw= 'top' | kw= 'topright' | kw= 'left' | kw= 'center' | kw= 'right' | kw= 'bottomleft' | kw= 'bottom' | kw= 'bottomright' ) ;
    public final AntlrDatatypeRuleToken ruleAlignment() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSlideOMatic.g:1549:2: ( (kw= 'topleft' | kw= 'top' | kw= 'topright' | kw= 'left' | kw= 'center' | kw= 'right' | kw= 'bottomleft' | kw= 'bottom' | kw= 'bottomright' ) )
            // InternalSlideOMatic.g:1550:2: (kw= 'topleft' | kw= 'top' | kw= 'topright' | kw= 'left' | kw= 'center' | kw= 'right' | kw= 'bottomleft' | kw= 'bottom' | kw= 'bottomright' )
            {
            // InternalSlideOMatic.g:1550:2: (kw= 'topleft' | kw= 'top' | kw= 'topright' | kw= 'left' | kw= 'center' | kw= 'right' | kw= 'bottomleft' | kw= 'bottom' | kw= 'bottomright' )
            int alt28=9;
            switch ( input.LA(1) ) {
            case 78:
                {
                alt28=1;
                }
                break;
            case 79:
                {
                alt28=2;
                }
                break;
            case 80:
                {
                alt28=3;
                }
                break;
            case 81:
                {
                alt28=4;
                }
                break;
            case 82:
                {
                alt28=5;
                }
                break;
            case 83:
                {
                alt28=6;
                }
                break;
            case 84:
                {
                alt28=7;
                }
                break;
            case 85:
                {
                alt28=8;
                }
                break;
            case 86:
                {
                alt28=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // InternalSlideOMatic.g:1551:3: kw= 'topleft'
                    {
                    kw=(Token)match(input,78,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAlignmentAccess().getTopleftKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSlideOMatic.g:1557:3: kw= 'top'
                    {
                    kw=(Token)match(input,79,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAlignmentAccess().getTopKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalSlideOMatic.g:1563:3: kw= 'topright'
                    {
                    kw=(Token)match(input,80,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAlignmentAccess().getToprightKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalSlideOMatic.g:1569:3: kw= 'left'
                    {
                    kw=(Token)match(input,81,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAlignmentAccess().getLeftKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalSlideOMatic.g:1575:3: kw= 'center'
                    {
                    kw=(Token)match(input,82,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAlignmentAccess().getCenterKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalSlideOMatic.g:1581:3: kw= 'right'
                    {
                    kw=(Token)match(input,83,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAlignmentAccess().getRightKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalSlideOMatic.g:1587:3: kw= 'bottomleft'
                    {
                    kw=(Token)match(input,84,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAlignmentAccess().getBottomleftKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalSlideOMatic.g:1593:3: kw= 'bottom'
                    {
                    kw=(Token)match(input,85,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAlignmentAccess().getBottomKeyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalSlideOMatic.g:1599:3: kw= 'bottomright'
                    {
                    kw=(Token)match(input,86,FOLLOW_2); 

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
    // InternalSlideOMatic.g:1608:1: entryRuleSize returns [EObject current=null] : iv_ruleSize= ruleSize EOF ;
    public final EObject entryRuleSize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSize = null;


        try {
            // InternalSlideOMatic.g:1608:45: (iv_ruleSize= ruleSize EOF )
            // InternalSlideOMatic.g:1609:2: iv_ruleSize= ruleSize EOF
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
    // InternalSlideOMatic.g:1615:1: ruleSize returns [EObject current=null] : ( ( () ( (lv_way_1_0= ruleWay ) ) ( (lv_scale_2_0= RULE_INT ) ) otherlv_3= '%' ) | ( () ( (lv_size_5_0= RULE_INT ) ) ( ( (lv_unit_6_1= 'cm' | lv_unit_6_2= 'em' | lv_unit_6_3= 'mm' ) ) ) ) ) ;
    public final EObject ruleSize() throws RecognitionException {
        EObject current = null;

        Token lv_scale_2_0=null;
        Token otherlv_3=null;
        Token lv_size_5_0=null;
        Token lv_unit_6_1=null;
        Token lv_unit_6_2=null;
        Token lv_unit_6_3=null;
        EObject lv_way_1_0 = null;



        	enterRule();

        try {
            // InternalSlideOMatic.g:1621:2: ( ( ( () ( (lv_way_1_0= ruleWay ) ) ( (lv_scale_2_0= RULE_INT ) ) otherlv_3= '%' ) | ( () ( (lv_size_5_0= RULE_INT ) ) ( ( (lv_unit_6_1= 'cm' | lv_unit_6_2= 'em' | lv_unit_6_3= 'mm' ) ) ) ) ) )
            // InternalSlideOMatic.g:1622:2: ( ( () ( (lv_way_1_0= ruleWay ) ) ( (lv_scale_2_0= RULE_INT ) ) otherlv_3= '%' ) | ( () ( (lv_size_5_0= RULE_INT ) ) ( ( (lv_unit_6_1= 'cm' | lv_unit_6_2= 'em' | lv_unit_6_3= 'mm' ) ) ) ) )
            {
            // InternalSlideOMatic.g:1622:2: ( ( () ( (lv_way_1_0= ruleWay ) ) ( (lv_scale_2_0= RULE_INT ) ) otherlv_3= '%' ) | ( () ( (lv_size_5_0= RULE_INT ) ) ( ( (lv_unit_6_1= 'cm' | lv_unit_6_2= 'em' | lv_unit_6_3= 'mm' ) ) ) ) )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>=91 && LA30_0<=92)) ) {
                alt30=1;
            }
            else if ( (LA30_0==RULE_INT) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalSlideOMatic.g:1623:3: ( () ( (lv_way_1_0= ruleWay ) ) ( (lv_scale_2_0= RULE_INT ) ) otherlv_3= '%' )
                    {
                    // InternalSlideOMatic.g:1623:3: ( () ( (lv_way_1_0= ruleWay ) ) ( (lv_scale_2_0= RULE_INT ) ) otherlv_3= '%' )
                    // InternalSlideOMatic.g:1624:4: () ( (lv_way_1_0= ruleWay ) ) ( (lv_scale_2_0= RULE_INT ) ) otherlv_3= '%'
                    {
                    // InternalSlideOMatic.g:1624:4: ()
                    // InternalSlideOMatic.g:1625:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSizeAccess().getProportionalSizeAction_0_0(),
                    						current);
                    				

                    }

                    // InternalSlideOMatic.g:1631:4: ( (lv_way_1_0= ruleWay ) )
                    // InternalSlideOMatic.g:1632:5: (lv_way_1_0= ruleWay )
                    {
                    // InternalSlideOMatic.g:1632:5: (lv_way_1_0= ruleWay )
                    // InternalSlideOMatic.g:1633:6: lv_way_1_0= ruleWay
                    {

                    						newCompositeNode(grammarAccess.getSizeAccess().getWayWayParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_way_1_0=ruleWay();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSizeRule());
                    						}
                    						set(
                    							current,
                    							"way",
                    							lv_way_1_0,
                    							"dk.sdu.mmmi.mdsd.f18.dsl.external.SlideOMatic.Way");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSlideOMatic.g:1650:4: ( (lv_scale_2_0= RULE_INT ) )
                    // InternalSlideOMatic.g:1651:5: (lv_scale_2_0= RULE_INT )
                    {
                    // InternalSlideOMatic.g:1651:5: (lv_scale_2_0= RULE_INT )
                    // InternalSlideOMatic.g:1652:6: lv_scale_2_0= RULE_INT
                    {
                    lv_scale_2_0=(Token)match(input,RULE_INT,FOLLOW_31); 

                    						newLeafNode(lv_scale_2_0, grammarAccess.getSizeAccess().getScaleINTTerminalRuleCall_0_2_0());
                    					

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

                    otherlv_3=(Token)match(input,87,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getSizeAccess().getPercentSignKeyword_0_3());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSlideOMatic.g:1674:3: ( () ( (lv_size_5_0= RULE_INT ) ) ( ( (lv_unit_6_1= 'cm' | lv_unit_6_2= 'em' | lv_unit_6_3= 'mm' ) ) ) )
                    {
                    // InternalSlideOMatic.g:1674:3: ( () ( (lv_size_5_0= RULE_INT ) ) ( ( (lv_unit_6_1= 'cm' | lv_unit_6_2= 'em' | lv_unit_6_3= 'mm' ) ) ) )
                    // InternalSlideOMatic.g:1675:4: () ( (lv_size_5_0= RULE_INT ) ) ( ( (lv_unit_6_1= 'cm' | lv_unit_6_2= 'em' | lv_unit_6_3= 'mm' ) ) )
                    {
                    // InternalSlideOMatic.g:1675:4: ()
                    // InternalSlideOMatic.g:1676:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSizeAccess().getExactSizeAction_1_0(),
                    						current);
                    				

                    }

                    // InternalSlideOMatic.g:1682:4: ( (lv_size_5_0= RULE_INT ) )
                    // InternalSlideOMatic.g:1683:5: (lv_size_5_0= RULE_INT )
                    {
                    // InternalSlideOMatic.g:1683:5: (lv_size_5_0= RULE_INT )
                    // InternalSlideOMatic.g:1684:6: lv_size_5_0= RULE_INT
                    {
                    lv_size_5_0=(Token)match(input,RULE_INT,FOLLOW_32); 

                    						newLeafNode(lv_size_5_0, grammarAccess.getSizeAccess().getSizeINTTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSizeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"size",
                    							lv_size_5_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    // InternalSlideOMatic.g:1700:4: ( ( (lv_unit_6_1= 'cm' | lv_unit_6_2= 'em' | lv_unit_6_3= 'mm' ) ) )
                    // InternalSlideOMatic.g:1701:5: ( (lv_unit_6_1= 'cm' | lv_unit_6_2= 'em' | lv_unit_6_3= 'mm' ) )
                    {
                    // InternalSlideOMatic.g:1701:5: ( (lv_unit_6_1= 'cm' | lv_unit_6_2= 'em' | lv_unit_6_3= 'mm' ) )
                    // InternalSlideOMatic.g:1702:6: (lv_unit_6_1= 'cm' | lv_unit_6_2= 'em' | lv_unit_6_3= 'mm' )
                    {
                    // InternalSlideOMatic.g:1702:6: (lv_unit_6_1= 'cm' | lv_unit_6_2= 'em' | lv_unit_6_3= 'mm' )
                    int alt29=3;
                    switch ( input.LA(1) ) {
                    case 88:
                        {
                        alt29=1;
                        }
                        break;
                    case 89:
                        {
                        alt29=2;
                        }
                        break;
                    case 90:
                        {
                        alt29=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 29, 0, input);

                        throw nvae;
                    }

                    switch (alt29) {
                        case 1 :
                            // InternalSlideOMatic.g:1703:7: lv_unit_6_1= 'cm'
                            {
                            lv_unit_6_1=(Token)match(input,88,FOLLOW_2); 

                            							newLeafNode(lv_unit_6_1, grammarAccess.getSizeAccess().getUnitCmKeyword_1_2_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getSizeRule());
                            							}
                            							setWithLastConsumed(current, "unit", lv_unit_6_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalSlideOMatic.g:1714:7: lv_unit_6_2= 'em'
                            {
                            lv_unit_6_2=(Token)match(input,89,FOLLOW_2); 

                            							newLeafNode(lv_unit_6_2, grammarAccess.getSizeAccess().getUnitEmKeyword_1_2_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getSizeRule());
                            							}
                            							setWithLastConsumed(current, "unit", lv_unit_6_2, null);
                            						

                            }
                            break;
                        case 3 :
                            // InternalSlideOMatic.g:1725:7: lv_unit_6_3= 'mm'
                            {
                            lv_unit_6_3=(Token)match(input,90,FOLLOW_2); 

                            							newLeafNode(lv_unit_6_3, grammarAccess.getSizeAccess().getUnitMmKeyword_1_2_0_2());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getSizeRule());
                            							}
                            							setWithLastConsumed(current, "unit", lv_unit_6_3, null);
                            						

                            }
                            break;

                    }


                    }


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
    // $ANTLR end "ruleSize"


    // $ANTLR start "entryRuleWay"
    // InternalSlideOMatic.g:1743:1: entryRuleWay returns [EObject current=null] : iv_ruleWay= ruleWay EOF ;
    public final EObject entryRuleWay() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWay = null;


        try {
            // InternalSlideOMatic.g:1743:44: (iv_ruleWay= ruleWay EOF )
            // InternalSlideOMatic.g:1744:2: iv_ruleWay= ruleWay EOF
            {
             newCompositeNode(grammarAccess.getWayRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWay=ruleWay();

            state._fsp--;

             current =iv_ruleWay; 
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
    // $ANTLR end "entryRuleWay"


    // $ANTLR start "ruleWay"
    // InternalSlideOMatic.g:1750:1: ruleWay returns [EObject current=null] : ( ( () otherlv_1= 'width' ) | ( () otherlv_3= 'height' ) ) ;
    public final EObject ruleWay() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalSlideOMatic.g:1756:2: ( ( ( () otherlv_1= 'width' ) | ( () otherlv_3= 'height' ) ) )
            // InternalSlideOMatic.g:1757:2: ( ( () otherlv_1= 'width' ) | ( () otherlv_3= 'height' ) )
            {
            // InternalSlideOMatic.g:1757:2: ( ( () otherlv_1= 'width' ) | ( () otherlv_3= 'height' ) )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==91) ) {
                alt31=1;
            }
            else if ( (LA31_0==92) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // InternalSlideOMatic.g:1758:3: ( () otherlv_1= 'width' )
                    {
                    // InternalSlideOMatic.g:1758:3: ( () otherlv_1= 'width' )
                    // InternalSlideOMatic.g:1759:4: () otherlv_1= 'width'
                    {
                    // InternalSlideOMatic.g:1759:4: ()
                    // InternalSlideOMatic.g:1760:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getWayAccess().getWidthAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,91,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getWayAccess().getWidthKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSlideOMatic.g:1772:3: ( () otherlv_3= 'height' )
                    {
                    // InternalSlideOMatic.g:1772:3: ( () otherlv_3= 'height' )
                    // InternalSlideOMatic.g:1773:4: () otherlv_3= 'height'
                    {
                    // InternalSlideOMatic.g:1773:4: ()
                    // InternalSlideOMatic.g:1774:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getWayAccess().getHeightAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_3=(Token)match(input,92,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getWayAccess().getHeightKeyword_1_1());
                    			

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
    // $ANTLR end "ruleWay"


    // $ANTLR start "entryRuleTable"
    // InternalSlideOMatic.g:1789:1: entryRuleTable returns [EObject current=null] : iv_ruleTable= ruleTable EOF ;
    public final EObject entryRuleTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTable = null;


        try {
            // InternalSlideOMatic.g:1789:46: (iv_ruleTable= ruleTable EOF )
            // InternalSlideOMatic.g:1790:2: iv_ruleTable= ruleTable EOF
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
    // InternalSlideOMatic.g:1796:1: ruleTable returns [EObject current=null] : (otherlv_0= 'tab' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (lv_rows_3_0= ruleTableRow ) ) (otherlv_4= ',' ( (lv_rows_5_0= ruleTableRow ) ) )* otherlv_6= ']' ) ;
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
            // InternalSlideOMatic.g:1802:2: ( (otherlv_0= 'tab' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (lv_rows_3_0= ruleTableRow ) ) (otherlv_4= ',' ( (lv_rows_5_0= ruleTableRow ) ) )* otherlv_6= ']' ) )
            // InternalSlideOMatic.g:1803:2: (otherlv_0= 'tab' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (lv_rows_3_0= ruleTableRow ) ) (otherlv_4= ',' ( (lv_rows_5_0= ruleTableRow ) ) )* otherlv_6= ']' )
            {
            // InternalSlideOMatic.g:1803:2: (otherlv_0= 'tab' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (lv_rows_3_0= ruleTableRow ) ) (otherlv_4= ',' ( (lv_rows_5_0= ruleTableRow ) ) )* otherlv_6= ']' )
            // InternalSlideOMatic.g:1804:3: otherlv_0= 'tab' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (lv_rows_3_0= ruleTableRow ) ) (otherlv_4= ',' ( (lv_rows_5_0= ruleTableRow ) ) )* otherlv_6= ']'
            {
            otherlv_0=(Token)match(input,93,FOLLOW_27); 

            			newLeafNode(otherlv_0, grammarAccess.getTableAccess().getTabKeyword_0());
            		
            // InternalSlideOMatic.g:1808:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSlideOMatic.g:1809:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSlideOMatic.g:1809:4: (lv_name_1_0= RULE_ID )
            // InternalSlideOMatic.g:1810:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_33); 

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

            otherlv_2=(Token)match(input,94,FOLLOW_33); 

            			newLeafNode(otherlv_2, grammarAccess.getTableAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalSlideOMatic.g:1830:3: ( (lv_rows_3_0= ruleTableRow ) )
            // InternalSlideOMatic.g:1831:4: (lv_rows_3_0= ruleTableRow )
            {
            // InternalSlideOMatic.g:1831:4: (lv_rows_3_0= ruleTableRow )
            // InternalSlideOMatic.g:1832:5: lv_rows_3_0= ruleTableRow
            {

            					newCompositeNode(grammarAccess.getTableAccess().getRowsTableRowParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_34);
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

            // InternalSlideOMatic.g:1849:3: (otherlv_4= ',' ( (lv_rows_5_0= ruleTableRow ) ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==64) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalSlideOMatic.g:1850:4: otherlv_4= ',' ( (lv_rows_5_0= ruleTableRow ) )
            	    {
            	    otherlv_4=(Token)match(input,64,FOLLOW_33); 

            	    				newLeafNode(otherlv_4, grammarAccess.getTableAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalSlideOMatic.g:1854:4: ( (lv_rows_5_0= ruleTableRow ) )
            	    // InternalSlideOMatic.g:1855:5: (lv_rows_5_0= ruleTableRow )
            	    {
            	    // InternalSlideOMatic.g:1855:5: (lv_rows_5_0= ruleTableRow )
            	    // InternalSlideOMatic.g:1856:6: lv_rows_5_0= ruleTableRow
            	    {

            	    						newCompositeNode(grammarAccess.getTableAccess().getRowsTableRowParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_34);
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
            	    break loop32;
                }
            } while (true);

            otherlv_6=(Token)match(input,95,FOLLOW_2); 

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
    // InternalSlideOMatic.g:1882:1: entryRuleTableRow returns [EObject current=null] : iv_ruleTableRow= ruleTableRow EOF ;
    public final EObject entryRuleTableRow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTableRow = null;


        try {
            // InternalSlideOMatic.g:1882:49: (iv_ruleTableRow= ruleTableRow EOF )
            // InternalSlideOMatic.g:1883:2: iv_ruleTableRow= ruleTableRow EOF
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
    // InternalSlideOMatic.g:1889:1: ruleTableRow returns [EObject current=null] : (otherlv_0= '[' ( (lv_values_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_values_3_0= RULE_STRING ) ) )* otherlv_4= ']' ) ;
    public final EObject ruleTableRow() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_values_1_0=null;
        Token otherlv_2=null;
        Token lv_values_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalSlideOMatic.g:1895:2: ( (otherlv_0= '[' ( (lv_values_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_values_3_0= RULE_STRING ) ) )* otherlv_4= ']' ) )
            // InternalSlideOMatic.g:1896:2: (otherlv_0= '[' ( (lv_values_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_values_3_0= RULE_STRING ) ) )* otherlv_4= ']' )
            {
            // InternalSlideOMatic.g:1896:2: (otherlv_0= '[' ( (lv_values_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_values_3_0= RULE_STRING ) ) )* otherlv_4= ']' )
            // InternalSlideOMatic.g:1897:3: otherlv_0= '[' ( (lv_values_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_values_3_0= RULE_STRING ) ) )* otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,94,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTableRowAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalSlideOMatic.g:1901:3: ( (lv_values_1_0= RULE_STRING ) )
            // InternalSlideOMatic.g:1902:4: (lv_values_1_0= RULE_STRING )
            {
            // InternalSlideOMatic.g:1902:4: (lv_values_1_0= RULE_STRING )
            // InternalSlideOMatic.g:1903:5: lv_values_1_0= RULE_STRING
            {
            lv_values_1_0=(Token)match(input,RULE_STRING,FOLLOW_34); 

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

            // InternalSlideOMatic.g:1919:3: (otherlv_2= ',' ( (lv_values_3_0= RULE_STRING ) ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==64) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalSlideOMatic.g:1920:4: otherlv_2= ',' ( (lv_values_3_0= RULE_STRING ) )
            	    {
            	    otherlv_2=(Token)match(input,64,FOLLOW_3); 

            	    				newLeafNode(otherlv_2, grammarAccess.getTableRowAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalSlideOMatic.g:1924:4: ( (lv_values_3_0= RULE_STRING ) )
            	    // InternalSlideOMatic.g:1925:5: (lv_values_3_0= RULE_STRING )
            	    {
            	    // InternalSlideOMatic.g:1925:5: (lv_values_3_0= RULE_STRING )
            	    // InternalSlideOMatic.g:1926:6: lv_values_3_0= RULE_STRING
            	    {
            	    lv_values_3_0=(Token)match(input,RULE_STRING,FOLLOW_34); 

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
            	    break loop33;
                }
            } while (true);

            otherlv_4=(Token)match(input,95,FOLLOW_2); 

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


    // $ANTLR start "entryRuleCode"
    // InternalSlideOMatic.g:1951:1: entryRuleCode returns [EObject current=null] : iv_ruleCode= ruleCode EOF ;
    public final EObject entryRuleCode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCode = null;


        try {
            // InternalSlideOMatic.g:1951:45: (iv_ruleCode= ruleCode EOF )
            // InternalSlideOMatic.g:1952:2: iv_ruleCode= ruleCode EOF
            {
             newCompositeNode(grammarAccess.getCodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCode=ruleCode();

            state._fsp--;

             current =iv_ruleCode; 
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
    // $ANTLR end "entryRuleCode"


    // $ANTLR start "ruleCode"
    // InternalSlideOMatic.g:1958:1: ruleCode returns [EObject current=null] : (otherlv_0= '```' ( (lv_lang_1_0= RULE_ID ) ) ( (lv_code_2_0= RULE_STRING ) ) otherlv_3= '```' ) ;
    public final EObject ruleCode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_lang_1_0=null;
        Token lv_code_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalSlideOMatic.g:1964:2: ( (otherlv_0= '```' ( (lv_lang_1_0= RULE_ID ) ) ( (lv_code_2_0= RULE_STRING ) ) otherlv_3= '```' ) )
            // InternalSlideOMatic.g:1965:2: (otherlv_0= '```' ( (lv_lang_1_0= RULE_ID ) ) ( (lv_code_2_0= RULE_STRING ) ) otherlv_3= '```' )
            {
            // InternalSlideOMatic.g:1965:2: (otherlv_0= '```' ( (lv_lang_1_0= RULE_ID ) ) ( (lv_code_2_0= RULE_STRING ) ) otherlv_3= '```' )
            // InternalSlideOMatic.g:1966:3: otherlv_0= '```' ( (lv_lang_1_0= RULE_ID ) ) ( (lv_code_2_0= RULE_STRING ) ) otherlv_3= '```'
            {
            otherlv_0=(Token)match(input,96,FOLLOW_27); 

            			newLeafNode(otherlv_0, grammarAccess.getCodeAccess().getGraveAccentGraveAccentGraveAccentKeyword_0());
            		
            // InternalSlideOMatic.g:1970:3: ( (lv_lang_1_0= RULE_ID ) )
            // InternalSlideOMatic.g:1971:4: (lv_lang_1_0= RULE_ID )
            {
            // InternalSlideOMatic.g:1971:4: (lv_lang_1_0= RULE_ID )
            // InternalSlideOMatic.g:1972:5: lv_lang_1_0= RULE_ID
            {
            lv_lang_1_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_lang_1_0, grammarAccess.getCodeAccess().getLangIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCodeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"lang",
            						lv_lang_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalSlideOMatic.g:1988:3: ( (lv_code_2_0= RULE_STRING ) )
            // InternalSlideOMatic.g:1989:4: (lv_code_2_0= RULE_STRING )
            {
            // InternalSlideOMatic.g:1989:4: (lv_code_2_0= RULE_STRING )
            // InternalSlideOMatic.g:1990:5: lv_code_2_0= RULE_STRING
            {
            lv_code_2_0=(Token)match(input,RULE_STRING,FOLLOW_35); 

            					newLeafNode(lv_code_2_0, grammarAccess.getCodeAccess().getCodeSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCodeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"code",
            						lv_code_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,96,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getCodeAccess().getGraveAccentGraveAccentGraveAccentKeyword_3());
            		

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
    // $ANTLR end "ruleCode"


    // $ANTLR start "entryRuleClick"
    // InternalSlideOMatic.g:2014:1: entryRuleClick returns [String current=null] : iv_ruleClick= ruleClick EOF ;
    public final String entryRuleClick() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleClick = null;


        try {
            // InternalSlideOMatic.g:2014:45: (iv_ruleClick= ruleClick EOF )
            // InternalSlideOMatic.g:2015:2: iv_ruleClick= ruleClick EOF
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
    // InternalSlideOMatic.g:2021:1: ruleClick returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '$$' ;
    public final AntlrDatatypeRuleToken ruleClick() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSlideOMatic.g:2027:2: (kw= '$$' )
            // InternalSlideOMatic.g:2028:2: kw= '$$'
            {
            kw=(Token)match(input,97,FOLLOW_2); 

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
    // InternalSlideOMatic.g:2036:1: entryRuleAnimation returns [EObject current=null] : iv_ruleAnimation= ruleAnimation EOF ;
    public final EObject entryRuleAnimation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnimation = null;


        try {
            // InternalSlideOMatic.g:2036:50: (iv_ruleAnimation= ruleAnimation EOF )
            // InternalSlideOMatic.g:2037:2: iv_ruleAnimation= ruleAnimation EOF
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
    // InternalSlideOMatic.g:2043:1: ruleAnimation returns [EObject current=null] : (otherlv_0= 'animate' ( (otherlv_1= RULE_ID ) ) ( (lv_type_2_0= ruleAnimationType ) ) otherlv_3= 'to' ( (lv_location_4_0= ruleAlignment ) ) ( (lv_size_5_0= ruleSize ) )? ) ;
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
            // InternalSlideOMatic.g:2049:2: ( (otherlv_0= 'animate' ( (otherlv_1= RULE_ID ) ) ( (lv_type_2_0= ruleAnimationType ) ) otherlv_3= 'to' ( (lv_location_4_0= ruleAlignment ) ) ( (lv_size_5_0= ruleSize ) )? ) )
            // InternalSlideOMatic.g:2050:2: (otherlv_0= 'animate' ( (otherlv_1= RULE_ID ) ) ( (lv_type_2_0= ruleAnimationType ) ) otherlv_3= 'to' ( (lv_location_4_0= ruleAlignment ) ) ( (lv_size_5_0= ruleSize ) )? )
            {
            // InternalSlideOMatic.g:2050:2: (otherlv_0= 'animate' ( (otherlv_1= RULE_ID ) ) ( (lv_type_2_0= ruleAnimationType ) ) otherlv_3= 'to' ( (lv_location_4_0= ruleAlignment ) ) ( (lv_size_5_0= ruleSize ) )? )
            // InternalSlideOMatic.g:2051:3: otherlv_0= 'animate' ( (otherlv_1= RULE_ID ) ) ( (lv_type_2_0= ruleAnimationType ) ) otherlv_3= 'to' ( (lv_location_4_0= ruleAlignment ) ) ( (lv_size_5_0= ruleSize ) )?
            {
            otherlv_0=(Token)match(input,98,FOLLOW_27); 

            			newLeafNode(otherlv_0, grammarAccess.getAnimationAccess().getAnimateKeyword_0());
            		
            // InternalSlideOMatic.g:2055:3: ( (otherlv_1= RULE_ID ) )
            // InternalSlideOMatic.g:2056:4: (otherlv_1= RULE_ID )
            {
            // InternalSlideOMatic.g:2056:4: (otherlv_1= RULE_ID )
            // InternalSlideOMatic.g:2057:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAnimationRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_36); 

            					newLeafNode(otherlv_1, grammarAccess.getAnimationAccess().getTargetImageCrossReference_1_0());
            				

            }


            }

            // InternalSlideOMatic.g:2068:3: ( (lv_type_2_0= ruleAnimationType ) )
            // InternalSlideOMatic.g:2069:4: (lv_type_2_0= ruleAnimationType )
            {
            // InternalSlideOMatic.g:2069:4: (lv_type_2_0= ruleAnimationType )
            // InternalSlideOMatic.g:2070:5: lv_type_2_0= ruleAnimationType
            {

            					newCompositeNode(grammarAccess.getAnimationAccess().getTypeAnimationTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_37);
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

            otherlv_3=(Token)match(input,99,FOLLOW_38); 

            			newLeafNode(otherlv_3, grammarAccess.getAnimationAccess().getToKeyword_3());
            		
            // InternalSlideOMatic.g:2091:3: ( (lv_location_4_0= ruleAlignment ) )
            // InternalSlideOMatic.g:2092:4: (lv_location_4_0= ruleAlignment )
            {
            // InternalSlideOMatic.g:2092:4: (lv_location_4_0= ruleAlignment )
            // InternalSlideOMatic.g:2093:5: lv_location_4_0= ruleAlignment
            {

            					newCompositeNode(grammarAccess.getAnimationAccess().getLocationAlignmentParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_39);
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

            // InternalSlideOMatic.g:2110:3: ( (lv_size_5_0= ruleSize ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_INT||(LA34_0>=91 && LA34_0<=92)) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalSlideOMatic.g:2111:4: (lv_size_5_0= ruleSize )
                    {
                    // InternalSlideOMatic.g:2111:4: (lv_size_5_0= ruleSize )
                    // InternalSlideOMatic.g:2112:5: lv_size_5_0= ruleSize
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
    // InternalSlideOMatic.g:2133:1: entryRuleAnimationType returns [EObject current=null] : iv_ruleAnimationType= ruleAnimationType EOF ;
    public final EObject entryRuleAnimationType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnimationType = null;


        try {
            // InternalSlideOMatic.g:2133:54: (iv_ruleAnimationType= ruleAnimationType EOF )
            // InternalSlideOMatic.g:2134:2: iv_ruleAnimationType= ruleAnimationType EOF
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
    // InternalSlideOMatic.g:2140:1: ruleAnimationType returns [EObject current=null] : ( ( () otherlv_1= 'move' ) | ( () otherlv_3= 'jump' ) ) ;
    public final EObject ruleAnimationType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalSlideOMatic.g:2146:2: ( ( ( () otherlv_1= 'move' ) | ( () otherlv_3= 'jump' ) ) )
            // InternalSlideOMatic.g:2147:2: ( ( () otherlv_1= 'move' ) | ( () otherlv_3= 'jump' ) )
            {
            // InternalSlideOMatic.g:2147:2: ( ( () otherlv_1= 'move' ) | ( () otherlv_3= 'jump' ) )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==100) ) {
                alt35=1;
            }
            else if ( (LA35_0==101) ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // InternalSlideOMatic.g:2148:3: ( () otherlv_1= 'move' )
                    {
                    // InternalSlideOMatic.g:2148:3: ( () otherlv_1= 'move' )
                    // InternalSlideOMatic.g:2149:4: () otherlv_1= 'move'
                    {
                    // InternalSlideOMatic.g:2149:4: ()
                    // InternalSlideOMatic.g:2150:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAnimationTypeAccess().getMoveAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,100,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getAnimationTypeAccess().getMoveKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSlideOMatic.g:2162:3: ( () otherlv_3= 'jump' )
                    {
                    // InternalSlideOMatic.g:2162:3: ( () otherlv_3= 'jump' )
                    // InternalSlideOMatic.g:2163:4: () otherlv_3= 'jump'
                    {
                    // InternalSlideOMatic.g:2163:4: ()
                    // InternalSlideOMatic.g:2164:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAnimationTypeAccess().getJumpAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_3=(Token)match(input,101,FOLLOW_2); 

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
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000A000L,0x0000000400000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0xC000000000014000L,0x0000000000000006L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0xC000000000004000L,0x0000000000000006L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004000L,0x0000000000000006L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000004000L,0x0000000000000004L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000008000L,0x0000000400000010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00003FFFFFFC0000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x3FFFC00010000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000008L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000001010L,0x0000000000000068L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000010L,0x0000000120001780L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000008010L,0x0000000120001780L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000002L,0x0000000200000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000002002L,0x0000000200000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000600L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000040L,0x00000000187FC000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000000L,0x0000000007000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000001L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000000L,0x0000003000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000000L,0x00000000007FC000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000042L,0x00000000187FC000L});

}