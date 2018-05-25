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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'presentation'", "'{'", "'('", "')'", "'}'", "'theme'", "'color'", "'AnnArbor'", "'Antibes'", "'Bergen'", "'Berkeley'", "'Berlin'", "'Boadilla'", "'boxes'", "'CambridgeUS'", "'Copenhagen'", "'Darmstadt'", "'default'", "'Dresden'", "'Frankfurt'", "'Goettingen'", "'Hannover'", "'Ilmanau'", "'JuanLesPins'", "'Luebeck'", "'Madrid'", "'Malmoe'", "'Marburg'", "'Montpellier'", "'PaloAlto'", "'Pittsburgh'", "'Rochester'", "'Singapore'", "'Szeged'", "'Warsaw'", "'albatros'", "'beaver'", "'beetle'", "'crane'", "'dolphin'", "'dove'", "'fly'", "'lily'", "'orchid'", "'rose'", "'seagull'", "'seahorse'", "'sidebartab'", "'structure'", "'whale'", "'wolverine'", "'author'", "'authors'", "','", "'institute'", "'date'", "'*'", "'slide'", "'**'", "'***'", "'ToC'", "'b'", "'i'", "'u'", "'fnote'", "'url'", "'block'", "'#list'", "'&list'", "'-'", "'img'", "'src'", "'topleft'", "'top'", "'topright'", "'left'", "'center'", "'right'", "'bottomleft'", "'bottom'", "'bottomright'", "'%'", "'cm'", "'em'", "'mm'", "'width'", "'height'", "'tab'", "'['", "']'", "'code'", "'end'", "'filecode'", "'show'", "':'", "'$$'", "'math'", "'eval'", "'+'", "'/'", "'^'", "'let'", "'='", "'in'"
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
    public static final int T__102=102;
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
    public static final int T__114=114;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__111=111;
    public static final int T__81=81;
    public static final int T__110=110;
    public static final int T__82=82;
    public static final int T__113=113;
    public static final int T__83=83;
    public static final int T__112=112;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__88=88;
    public static final int T__108=108;
    public static final int T__89=89;
    public static final int T__107=107;
    public static final int T__109=109;
    public static final int T__84=84;
    public static final int T__104=104;
    public static final int T__85=85;
    public static final int T__103=103;
    public static final int T__86=86;
    public static final int T__106=106;
    public static final int T__87=87;
    public static final int T__105=105;

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
    // InternalSlideOMatic.g:71:1: rulePresentation returns [EObject current=null] : (otherlv_0= 'presentation' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_subtitle_2_0= RULE_STRING ) )? otherlv_3= '{' (otherlv_4= '(' ( (lv_theme_5_0= ruleTheme ) )? ( (lv_authors_6_0= ruleAuthors ) )? ( (lv_institute_7_0= ruleInstitute ) )? ( (lv_date_8_0= ruleDate ) )? otherlv_9= ')' )? ( (lv_slides_10_0= ruleSlide ) )* otherlv_11= '}' ) ;
    public final EObject rulePresentation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_subtitle_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_theme_5_0 = null;

        EObject lv_authors_6_0 = null;

        EObject lv_institute_7_0 = null;

        EObject lv_date_8_0 = null;

        EObject lv_slides_10_0 = null;



        	enterRule();

        try {
            // InternalSlideOMatic.g:77:2: ( (otherlv_0= 'presentation' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_subtitle_2_0= RULE_STRING ) )? otherlv_3= '{' (otherlv_4= '(' ( (lv_theme_5_0= ruleTheme ) )? ( (lv_authors_6_0= ruleAuthors ) )? ( (lv_institute_7_0= ruleInstitute ) )? ( (lv_date_8_0= ruleDate ) )? otherlv_9= ')' )? ( (lv_slides_10_0= ruleSlide ) )* otherlv_11= '}' ) )
            // InternalSlideOMatic.g:78:2: (otherlv_0= 'presentation' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_subtitle_2_0= RULE_STRING ) )? otherlv_3= '{' (otherlv_4= '(' ( (lv_theme_5_0= ruleTheme ) )? ( (lv_authors_6_0= ruleAuthors ) )? ( (lv_institute_7_0= ruleInstitute ) )? ( (lv_date_8_0= ruleDate ) )? otherlv_9= ')' )? ( (lv_slides_10_0= ruleSlide ) )* otherlv_11= '}' )
            {
            // InternalSlideOMatic.g:78:2: (otherlv_0= 'presentation' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_subtitle_2_0= RULE_STRING ) )? otherlv_3= '{' (otherlv_4= '(' ( (lv_theme_5_0= ruleTheme ) )? ( (lv_authors_6_0= ruleAuthors ) )? ( (lv_institute_7_0= ruleInstitute ) )? ( (lv_date_8_0= ruleDate ) )? otherlv_9= ')' )? ( (lv_slides_10_0= ruleSlide ) )* otherlv_11= '}' )
            // InternalSlideOMatic.g:79:3: otherlv_0= 'presentation' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_subtitle_2_0= RULE_STRING ) )? otherlv_3= '{' (otherlv_4= '(' ( (lv_theme_5_0= ruleTheme ) )? ( (lv_authors_6_0= ruleAuthors ) )? ( (lv_institute_7_0= ruleInstitute ) )? ( (lv_date_8_0= ruleDate ) )? otherlv_9= ')' )? ( (lv_slides_10_0= ruleSlide ) )* otherlv_11= '}'
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

            // InternalSlideOMatic.g:209:3: ( (lv_slides_10_0= ruleSlide ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==68) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSlideOMatic.g:210:4: (lv_slides_10_0= ruleSlide )
            	    {
            	    // InternalSlideOMatic.g:210:4: (lv_slides_10_0= ruleSlide )
            	    // InternalSlideOMatic.g:211:5: lv_slides_10_0= ruleSlide
            	    {

            	    					newCompositeNode(grammarAccess.getPresentationAccess().getSlidesSlideParserRuleCall_5_0());
            	    				
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
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_11=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getPresentationAccess().getRightCurlyBracketKeyword_6());
            		

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
    // InternalSlideOMatic.g:236:1: entryRuleTheme returns [EObject current=null] : iv_ruleTheme= ruleTheme EOF ;
    public final EObject entryRuleTheme() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTheme = null;


        try {
            // InternalSlideOMatic.g:236:46: (iv_ruleTheme= ruleTheme EOF )
            // InternalSlideOMatic.g:237:2: iv_ruleTheme= ruleTheme EOF
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
    // InternalSlideOMatic.g:243:1: ruleTheme returns [EObject current=null] : (otherlv_0= 'theme' ( (lv_theme_1_0= ruleBeamerTheme ) ) (otherlv_2= 'color' ( (lv_themeColor_3_0= ruleThemeColor ) ) )? ) ;
    public final EObject ruleTheme() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_theme_1_0 = null;

        AntlrDatatypeRuleToken lv_themeColor_3_0 = null;



        	enterRule();

        try {
            // InternalSlideOMatic.g:249:2: ( (otherlv_0= 'theme' ( (lv_theme_1_0= ruleBeamerTheme ) ) (otherlv_2= 'color' ( (lv_themeColor_3_0= ruleThemeColor ) ) )? ) )
            // InternalSlideOMatic.g:250:2: (otherlv_0= 'theme' ( (lv_theme_1_0= ruleBeamerTheme ) ) (otherlv_2= 'color' ( (lv_themeColor_3_0= ruleThemeColor ) ) )? )
            {
            // InternalSlideOMatic.g:250:2: (otherlv_0= 'theme' ( (lv_theme_1_0= ruleBeamerTheme ) ) (otherlv_2= 'color' ( (lv_themeColor_3_0= ruleThemeColor ) ) )? )
            // InternalSlideOMatic.g:251:3: otherlv_0= 'theme' ( (lv_theme_1_0= ruleBeamerTheme ) ) (otherlv_2= 'color' ( (lv_themeColor_3_0= ruleThemeColor ) ) )?
            {
            otherlv_0=(Token)match(input,16,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getThemeAccess().getThemeKeyword_0());
            		
            // InternalSlideOMatic.g:255:3: ( (lv_theme_1_0= ruleBeamerTheme ) )
            // InternalSlideOMatic.g:256:4: (lv_theme_1_0= ruleBeamerTheme )
            {
            // InternalSlideOMatic.g:256:4: (lv_theme_1_0= ruleBeamerTheme )
            // InternalSlideOMatic.g:257:5: lv_theme_1_0= ruleBeamerTheme
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

            // InternalSlideOMatic.g:274:3: (otherlv_2= 'color' ( (lv_themeColor_3_0= ruleThemeColor ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==17) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalSlideOMatic.g:275:4: otherlv_2= 'color' ( (lv_themeColor_3_0= ruleThemeColor ) )
                    {
                    otherlv_2=(Token)match(input,17,FOLLOW_15); 

                    				newLeafNode(otherlv_2, grammarAccess.getThemeAccess().getColorKeyword_2_0());
                    			
                    // InternalSlideOMatic.g:279:4: ( (lv_themeColor_3_0= ruleThemeColor ) )
                    // InternalSlideOMatic.g:280:5: (lv_themeColor_3_0= ruleThemeColor )
                    {
                    // InternalSlideOMatic.g:280:5: (lv_themeColor_3_0= ruleThemeColor )
                    // InternalSlideOMatic.g:281:6: lv_themeColor_3_0= ruleThemeColor
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
    // InternalSlideOMatic.g:303:1: entryRuleBeamerTheme returns [String current=null] : iv_ruleBeamerTheme= ruleBeamerTheme EOF ;
    public final String entryRuleBeamerTheme() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBeamerTheme = null;


        try {
            // InternalSlideOMatic.g:303:51: (iv_ruleBeamerTheme= ruleBeamerTheme EOF )
            // InternalSlideOMatic.g:304:2: iv_ruleBeamerTheme= ruleBeamerTheme EOF
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
    // InternalSlideOMatic.g:310:1: ruleBeamerTheme returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'AnnArbor' | kw= 'Antibes' | kw= 'Bergen' | kw= 'Berkeley' | kw= 'Berlin' | kw= 'Boadilla' | kw= 'boxes' | kw= 'CambridgeUS' | kw= 'Copenhagen' | kw= 'Darmstadt' | kw= 'default' | kw= 'Dresden' | kw= 'Frankfurt' | kw= 'Goettingen' | kw= 'Hannover' | kw= 'Ilmanau' | kw= 'JuanLesPins' | kw= 'Luebeck' | kw= 'Madrid' | kw= 'Malmoe' | kw= 'Marburg' | kw= 'Montpellier' | kw= 'PaloAlto' | kw= 'Pittsburgh' | kw= 'Rochester' | kw= 'Singapore' | kw= 'Szeged' | kw= 'Warsaw' ) ;
    public final AntlrDatatypeRuleToken ruleBeamerTheme() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSlideOMatic.g:316:2: ( (kw= 'AnnArbor' | kw= 'Antibes' | kw= 'Bergen' | kw= 'Berkeley' | kw= 'Berlin' | kw= 'Boadilla' | kw= 'boxes' | kw= 'CambridgeUS' | kw= 'Copenhagen' | kw= 'Darmstadt' | kw= 'default' | kw= 'Dresden' | kw= 'Frankfurt' | kw= 'Goettingen' | kw= 'Hannover' | kw= 'Ilmanau' | kw= 'JuanLesPins' | kw= 'Luebeck' | kw= 'Madrid' | kw= 'Malmoe' | kw= 'Marburg' | kw= 'Montpellier' | kw= 'PaloAlto' | kw= 'Pittsburgh' | kw= 'Rochester' | kw= 'Singapore' | kw= 'Szeged' | kw= 'Warsaw' ) )
            // InternalSlideOMatic.g:317:2: (kw= 'AnnArbor' | kw= 'Antibes' | kw= 'Bergen' | kw= 'Berkeley' | kw= 'Berlin' | kw= 'Boadilla' | kw= 'boxes' | kw= 'CambridgeUS' | kw= 'Copenhagen' | kw= 'Darmstadt' | kw= 'default' | kw= 'Dresden' | kw= 'Frankfurt' | kw= 'Goettingen' | kw= 'Hannover' | kw= 'Ilmanau' | kw= 'JuanLesPins' | kw= 'Luebeck' | kw= 'Madrid' | kw= 'Malmoe' | kw= 'Marburg' | kw= 'Montpellier' | kw= 'PaloAlto' | kw= 'Pittsburgh' | kw= 'Rochester' | kw= 'Singapore' | kw= 'Szeged' | kw= 'Warsaw' )
            {
            // InternalSlideOMatic.g:317:2: (kw= 'AnnArbor' | kw= 'Antibes' | kw= 'Bergen' | kw= 'Berkeley' | kw= 'Berlin' | kw= 'Boadilla' | kw= 'boxes' | kw= 'CambridgeUS' | kw= 'Copenhagen' | kw= 'Darmstadt' | kw= 'default' | kw= 'Dresden' | kw= 'Frankfurt' | kw= 'Goettingen' | kw= 'Hannover' | kw= 'Ilmanau' | kw= 'JuanLesPins' | kw= 'Luebeck' | kw= 'Madrid' | kw= 'Malmoe' | kw= 'Marburg' | kw= 'Montpellier' | kw= 'PaloAlto' | kw= 'Pittsburgh' | kw= 'Rochester' | kw= 'Singapore' | kw= 'Szeged' | kw= 'Warsaw' )
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
                    // InternalSlideOMatic.g:318:3: kw= 'AnnArbor'
                    {
                    kw=(Token)match(input,18,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBeamerThemeAccess().getAnnArborKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSlideOMatic.g:324:3: kw= 'Antibes'
                    {
                    kw=(Token)match(input,19,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBeamerThemeAccess().getAntibesKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalSlideOMatic.g:330:3: kw= 'Bergen'
                    {
                    kw=(Token)match(input,20,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBeamerThemeAccess().getBergenKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalSlideOMatic.g:336:3: kw= 'Berkeley'
                    {
                    kw=(Token)match(input,21,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBeamerThemeAccess().getBerkeleyKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalSlideOMatic.g:342:3: kw= 'Berlin'
                    {
                    kw=(Token)match(input,22,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBeamerThemeAccess().getBerlinKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalSlideOMatic.g:348:3: kw= 'Boadilla'
                    {
                    kw=(Token)match(input,23,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBeamerThemeAccess().getBoadillaKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalSlideOMatic.g:354:3: kw= 'boxes'
                    {
                    kw=(Token)match(input,24,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBeamerThemeAccess().getBoxesKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalSlideOMatic.g:360:3: kw= 'CambridgeUS'
                    {
                    kw=(Token)match(input,25,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBeamerThemeAccess().getCambridgeUSKeyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalSlideOMatic.g:366:3: kw= 'Copenhagen'
                    {
                    kw=(Token)match(input,26,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBeamerThemeAccess().getCopenhagenKeyword_8());
                    		

                    }
                    break;
                case 10 :
                    // InternalSlideOMatic.g:372:3: kw= 'Darmstadt'
                    {
                    kw=(Token)match(input,27,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBeamerThemeAccess().getDarmstadtKeyword_9());
                    		

                    }
                    break;
                case 11 :
                    // InternalSlideOMatic.g:378:3: kw= 'default'
                    {
                    kw=(Token)match(input,28,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBeamerThemeAccess().getDefaultKeyword_10());
                    		

                    }
                    break;
                case 12 :
                    // InternalSlideOMatic.g:384:3: kw= 'Dresden'
                    {
                    kw=(Token)match(input,29,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBeamerThemeAccess().getDresdenKeyword_11());
                    		

                    }
                    break;
                case 13 :
                    // InternalSlideOMatic.g:390:3: kw= 'Frankfurt'
                    {
                    kw=(Token)match(input,30,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBeamerThemeAccess().getFrankfurtKeyword_12());
                    		

                    }
                    break;
                case 14 :
                    // InternalSlideOMatic.g:396:3: kw= 'Goettingen'
                    {
                    kw=(Token)match(input,31,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBeamerThemeAccess().getGoettingenKeyword_13());
                    		

                    }
                    break;
                case 15 :
                    // InternalSlideOMatic.g:402:3: kw= 'Hannover'
                    {
                    kw=(Token)match(input,32,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBeamerThemeAccess().getHannoverKeyword_14());
                    		

                    }
                    break;
                case 16 :
                    // InternalSlideOMatic.g:408:3: kw= 'Ilmanau'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBeamerThemeAccess().getIlmanauKeyword_15());
                    		

                    }
                    break;
                case 17 :
                    // InternalSlideOMatic.g:414:3: kw= 'JuanLesPins'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBeamerThemeAccess().getJuanLesPinsKeyword_16());
                    		

                    }
                    break;
                case 18 :
                    // InternalSlideOMatic.g:420:3: kw= 'Luebeck'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBeamerThemeAccess().getLuebeckKeyword_17());
                    		

                    }
                    break;
                case 19 :
                    // InternalSlideOMatic.g:426:3: kw= 'Madrid'
                    {
                    kw=(Token)match(input,36,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBeamerThemeAccess().getMadridKeyword_18());
                    		

                    }
                    break;
                case 20 :
                    // InternalSlideOMatic.g:432:3: kw= 'Malmoe'
                    {
                    kw=(Token)match(input,37,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBeamerThemeAccess().getMalmoeKeyword_19());
                    		

                    }
                    break;
                case 21 :
                    // InternalSlideOMatic.g:438:3: kw= 'Marburg'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBeamerThemeAccess().getMarburgKeyword_20());
                    		

                    }
                    break;
                case 22 :
                    // InternalSlideOMatic.g:444:3: kw= 'Montpellier'
                    {
                    kw=(Token)match(input,39,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBeamerThemeAccess().getMontpellierKeyword_21());
                    		

                    }
                    break;
                case 23 :
                    // InternalSlideOMatic.g:450:3: kw= 'PaloAlto'
                    {
                    kw=(Token)match(input,40,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBeamerThemeAccess().getPaloAltoKeyword_22());
                    		

                    }
                    break;
                case 24 :
                    // InternalSlideOMatic.g:456:3: kw= 'Pittsburgh'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBeamerThemeAccess().getPittsburghKeyword_23());
                    		

                    }
                    break;
                case 25 :
                    // InternalSlideOMatic.g:462:3: kw= 'Rochester'
                    {
                    kw=(Token)match(input,42,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBeamerThemeAccess().getRochesterKeyword_24());
                    		

                    }
                    break;
                case 26 :
                    // InternalSlideOMatic.g:468:3: kw= 'Singapore'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBeamerThemeAccess().getSingaporeKeyword_25());
                    		

                    }
                    break;
                case 27 :
                    // InternalSlideOMatic.g:474:3: kw= 'Szeged'
                    {
                    kw=(Token)match(input,44,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBeamerThemeAccess().getSzegedKeyword_26());
                    		

                    }
                    break;
                case 28 :
                    // InternalSlideOMatic.g:480:3: kw= 'Warsaw'
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
    // InternalSlideOMatic.g:489:1: entryRuleThemeColor returns [String current=null] : iv_ruleThemeColor= ruleThemeColor EOF ;
    public final String entryRuleThemeColor() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleThemeColor = null;


        try {
            // InternalSlideOMatic.g:489:50: (iv_ruleThemeColor= ruleThemeColor EOF )
            // InternalSlideOMatic.g:490:2: iv_ruleThemeColor= ruleThemeColor EOF
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
    // InternalSlideOMatic.g:496:1: ruleThemeColor returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'albatros' | kw= 'beaver' | kw= 'beetle' | kw= 'crane' | kw= 'default' | kw= 'dolphin' | kw= 'dove' | kw= 'fly' | kw= 'lily' | kw= 'orchid' | kw= 'rose' | kw= 'seagull' | kw= 'seahorse' | kw= 'sidebartab' | kw= 'structure' | kw= 'whale' | kw= 'wolverine' ) ;
    public final AntlrDatatypeRuleToken ruleThemeColor() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSlideOMatic.g:502:2: ( (kw= 'albatros' | kw= 'beaver' | kw= 'beetle' | kw= 'crane' | kw= 'default' | kw= 'dolphin' | kw= 'dove' | kw= 'fly' | kw= 'lily' | kw= 'orchid' | kw= 'rose' | kw= 'seagull' | kw= 'seahorse' | kw= 'sidebartab' | kw= 'structure' | kw= 'whale' | kw= 'wolverine' ) )
            // InternalSlideOMatic.g:503:2: (kw= 'albatros' | kw= 'beaver' | kw= 'beetle' | kw= 'crane' | kw= 'default' | kw= 'dolphin' | kw= 'dove' | kw= 'fly' | kw= 'lily' | kw= 'orchid' | kw= 'rose' | kw= 'seagull' | kw= 'seahorse' | kw= 'sidebartab' | kw= 'structure' | kw= 'whale' | kw= 'wolverine' )
            {
            // InternalSlideOMatic.g:503:2: (kw= 'albatros' | kw= 'beaver' | kw= 'beetle' | kw= 'crane' | kw= 'default' | kw= 'dolphin' | kw= 'dove' | kw= 'fly' | kw= 'lily' | kw= 'orchid' | kw= 'rose' | kw= 'seagull' | kw= 'seahorse' | kw= 'sidebartab' | kw= 'structure' | kw= 'whale' | kw= 'wolverine' )
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
                    // InternalSlideOMatic.g:504:3: kw= 'albatros'
                    {
                    kw=(Token)match(input,46,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getThemeColorAccess().getAlbatrosKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSlideOMatic.g:510:3: kw= 'beaver'
                    {
                    kw=(Token)match(input,47,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getThemeColorAccess().getBeaverKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalSlideOMatic.g:516:3: kw= 'beetle'
                    {
                    kw=(Token)match(input,48,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getThemeColorAccess().getBeetleKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalSlideOMatic.g:522:3: kw= 'crane'
                    {
                    kw=(Token)match(input,49,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getThemeColorAccess().getCraneKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalSlideOMatic.g:528:3: kw= 'default'
                    {
                    kw=(Token)match(input,28,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getThemeColorAccess().getDefaultKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalSlideOMatic.g:534:3: kw= 'dolphin'
                    {
                    kw=(Token)match(input,50,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getThemeColorAccess().getDolphinKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalSlideOMatic.g:540:3: kw= 'dove'
                    {
                    kw=(Token)match(input,51,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getThemeColorAccess().getDoveKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalSlideOMatic.g:546:3: kw= 'fly'
                    {
                    kw=(Token)match(input,52,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getThemeColorAccess().getFlyKeyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalSlideOMatic.g:552:3: kw= 'lily'
                    {
                    kw=(Token)match(input,53,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getThemeColorAccess().getLilyKeyword_8());
                    		

                    }
                    break;
                case 10 :
                    // InternalSlideOMatic.g:558:3: kw= 'orchid'
                    {
                    kw=(Token)match(input,54,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getThemeColorAccess().getOrchidKeyword_9());
                    		

                    }
                    break;
                case 11 :
                    // InternalSlideOMatic.g:564:3: kw= 'rose'
                    {
                    kw=(Token)match(input,55,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getThemeColorAccess().getRoseKeyword_10());
                    		

                    }
                    break;
                case 12 :
                    // InternalSlideOMatic.g:570:3: kw= 'seagull'
                    {
                    kw=(Token)match(input,56,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getThemeColorAccess().getSeagullKeyword_11());
                    		

                    }
                    break;
                case 13 :
                    // InternalSlideOMatic.g:576:3: kw= 'seahorse'
                    {
                    kw=(Token)match(input,57,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getThemeColorAccess().getSeahorseKeyword_12());
                    		

                    }
                    break;
                case 14 :
                    // InternalSlideOMatic.g:582:3: kw= 'sidebartab'
                    {
                    kw=(Token)match(input,58,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getThemeColorAccess().getSidebartabKeyword_13());
                    		

                    }
                    break;
                case 15 :
                    // InternalSlideOMatic.g:588:3: kw= 'structure'
                    {
                    kw=(Token)match(input,59,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getThemeColorAccess().getStructureKeyword_14());
                    		

                    }
                    break;
                case 16 :
                    // InternalSlideOMatic.g:594:3: kw= 'whale'
                    {
                    kw=(Token)match(input,60,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getThemeColorAccess().getWhaleKeyword_15());
                    		

                    }
                    break;
                case 17 :
                    // InternalSlideOMatic.g:600:3: kw= 'wolverine'
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
    // InternalSlideOMatic.g:609:1: entryRuleAuthors returns [EObject current=null] : iv_ruleAuthors= ruleAuthors EOF ;
    public final EObject entryRuleAuthors() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAuthors = null;


        try {
            // InternalSlideOMatic.g:609:48: (iv_ruleAuthors= ruleAuthors EOF )
            // InternalSlideOMatic.g:610:2: iv_ruleAuthors= ruleAuthors EOF
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
    // InternalSlideOMatic.g:616:1: ruleAuthors returns [EObject current=null] : ( (otherlv_0= 'author' | otherlv_1= 'authors' ) ( (lv_names_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_names_4_0= RULE_STRING ) ) )* ) ;
    public final EObject ruleAuthors() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_names_2_0=null;
        Token otherlv_3=null;
        Token lv_names_4_0=null;


        	enterRule();

        try {
            // InternalSlideOMatic.g:622:2: ( ( (otherlv_0= 'author' | otherlv_1= 'authors' ) ( (lv_names_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_names_4_0= RULE_STRING ) ) )* ) )
            // InternalSlideOMatic.g:623:2: ( (otherlv_0= 'author' | otherlv_1= 'authors' ) ( (lv_names_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_names_4_0= RULE_STRING ) ) )* )
            {
            // InternalSlideOMatic.g:623:2: ( (otherlv_0= 'author' | otherlv_1= 'authors' ) ( (lv_names_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_names_4_0= RULE_STRING ) ) )* )
            // InternalSlideOMatic.g:624:3: (otherlv_0= 'author' | otherlv_1= 'authors' ) ( (lv_names_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_names_4_0= RULE_STRING ) ) )*
            {
            // InternalSlideOMatic.g:624:3: (otherlv_0= 'author' | otherlv_1= 'authors' )
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
                    // InternalSlideOMatic.g:625:4: otherlv_0= 'author'
                    {
                    otherlv_0=(Token)match(input,62,FOLLOW_3); 

                    				newLeafNode(otherlv_0, grammarAccess.getAuthorsAccess().getAuthorKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalSlideOMatic.g:630:4: otherlv_1= 'authors'
                    {
                    otherlv_1=(Token)match(input,63,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getAuthorsAccess().getAuthorsKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalSlideOMatic.g:635:3: ( (lv_names_2_0= RULE_STRING ) )
            // InternalSlideOMatic.g:636:4: (lv_names_2_0= RULE_STRING )
            {
            // InternalSlideOMatic.g:636:4: (lv_names_2_0= RULE_STRING )
            // InternalSlideOMatic.g:637:5: lv_names_2_0= RULE_STRING
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

            // InternalSlideOMatic.g:653:3: (otherlv_3= ',' ( (lv_names_4_0= RULE_STRING ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==64) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalSlideOMatic.g:654:4: otherlv_3= ',' ( (lv_names_4_0= RULE_STRING ) )
            	    {
            	    otherlv_3=(Token)match(input,64,FOLLOW_3); 

            	    				newLeafNode(otherlv_3, grammarAccess.getAuthorsAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalSlideOMatic.g:658:4: ( (lv_names_4_0= RULE_STRING ) )
            	    // InternalSlideOMatic.g:659:5: (lv_names_4_0= RULE_STRING )
            	    {
            	    // InternalSlideOMatic.g:659:5: (lv_names_4_0= RULE_STRING )
            	    // InternalSlideOMatic.g:660:6: lv_names_4_0= RULE_STRING
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
    // InternalSlideOMatic.g:681:1: entryRuleInstitute returns [EObject current=null] : iv_ruleInstitute= ruleInstitute EOF ;
    public final EObject entryRuleInstitute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstitute = null;


        try {
            // InternalSlideOMatic.g:681:50: (iv_ruleInstitute= ruleInstitute EOF )
            // InternalSlideOMatic.g:682:2: iv_ruleInstitute= ruleInstitute EOF
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
    // InternalSlideOMatic.g:688:1: ruleInstitute returns [EObject current=null] : (otherlv_0= 'institute' ( (lv_name_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleInstitute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalSlideOMatic.g:694:2: ( (otherlv_0= 'institute' ( (lv_name_1_0= RULE_STRING ) ) ) )
            // InternalSlideOMatic.g:695:2: (otherlv_0= 'institute' ( (lv_name_1_0= RULE_STRING ) ) )
            {
            // InternalSlideOMatic.g:695:2: (otherlv_0= 'institute' ( (lv_name_1_0= RULE_STRING ) ) )
            // InternalSlideOMatic.g:696:3: otherlv_0= 'institute' ( (lv_name_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,65,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getInstituteAccess().getInstituteKeyword_0());
            		
            // InternalSlideOMatic.g:700:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalSlideOMatic.g:701:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalSlideOMatic.g:701:4: (lv_name_1_0= RULE_STRING )
            // InternalSlideOMatic.g:702:5: lv_name_1_0= RULE_STRING
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
    // InternalSlideOMatic.g:722:1: entryRuleDate returns [EObject current=null] : iv_ruleDate= ruleDate EOF ;
    public final EObject entryRuleDate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDate = null;


        try {
            // InternalSlideOMatic.g:722:45: (iv_ruleDate= ruleDate EOF )
            // InternalSlideOMatic.g:723:2: iv_ruleDate= ruleDate EOF
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
    // InternalSlideOMatic.g:729:1: ruleDate returns [EObject current=null] : (otherlv_0= 'date' ( ( (lv_date_1_0= RULE_STRING ) ) | ( () otherlv_3= '*' ) ) ) ;
    public final EObject ruleDate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_date_1_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalSlideOMatic.g:735:2: ( (otherlv_0= 'date' ( ( (lv_date_1_0= RULE_STRING ) ) | ( () otherlv_3= '*' ) ) ) )
            // InternalSlideOMatic.g:736:2: (otherlv_0= 'date' ( ( (lv_date_1_0= RULE_STRING ) ) | ( () otherlv_3= '*' ) ) )
            {
            // InternalSlideOMatic.g:736:2: (otherlv_0= 'date' ( ( (lv_date_1_0= RULE_STRING ) ) | ( () otherlv_3= '*' ) ) )
            // InternalSlideOMatic.g:737:3: otherlv_0= 'date' ( ( (lv_date_1_0= RULE_STRING ) ) | ( () otherlv_3= '*' ) )
            {
            otherlv_0=(Token)match(input,66,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getDateAccess().getDateKeyword_0());
            		
            // InternalSlideOMatic.g:741:3: ( ( (lv_date_1_0= RULE_STRING ) ) | ( () otherlv_3= '*' ) )
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
                    // InternalSlideOMatic.g:742:4: ( (lv_date_1_0= RULE_STRING ) )
                    {
                    // InternalSlideOMatic.g:742:4: ( (lv_date_1_0= RULE_STRING ) )
                    // InternalSlideOMatic.g:743:5: (lv_date_1_0= RULE_STRING )
                    {
                    // InternalSlideOMatic.g:743:5: (lv_date_1_0= RULE_STRING )
                    // InternalSlideOMatic.g:744:6: lv_date_1_0= RULE_STRING
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
                    // InternalSlideOMatic.g:761:4: ( () otherlv_3= '*' )
                    {
                    // InternalSlideOMatic.g:761:4: ( () otherlv_3= '*' )
                    // InternalSlideOMatic.g:762:5: () otherlv_3= '*'
                    {
                    // InternalSlideOMatic.g:762:5: ()
                    // InternalSlideOMatic.g:763:6: 
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
    // InternalSlideOMatic.g:779:1: entryRuleSlide returns [EObject current=null] : iv_ruleSlide= ruleSlide EOF ;
    public final EObject entryRuleSlide() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlide = null;


        try {
            // InternalSlideOMatic.g:779:46: (iv_ruleSlide= ruleSlide EOF )
            // InternalSlideOMatic.g:780:2: iv_ruleSlide= ruleSlide EOF
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
    // InternalSlideOMatic.g:786:1: ruleSlide returns [EObject current=null] : (otherlv_0= 'slide' ( ( ( (lv_sec_1_0= ruleSection ) ) ( (lv_name_2_0= RULE_STRING ) ) ) | ( (lv_name_3_0= RULE_STRING ) ) )? otherlv_4= '{' ( (lv_contents_5_0= ruleContent ) )+ otherlv_6= '}' ) ;
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
            // InternalSlideOMatic.g:792:2: ( (otherlv_0= 'slide' ( ( ( (lv_sec_1_0= ruleSection ) ) ( (lv_name_2_0= RULE_STRING ) ) ) | ( (lv_name_3_0= RULE_STRING ) ) )? otherlv_4= '{' ( (lv_contents_5_0= ruleContent ) )+ otherlv_6= '}' ) )
            // InternalSlideOMatic.g:793:2: (otherlv_0= 'slide' ( ( ( (lv_sec_1_0= ruleSection ) ) ( (lv_name_2_0= RULE_STRING ) ) ) | ( (lv_name_3_0= RULE_STRING ) ) )? otherlv_4= '{' ( (lv_contents_5_0= ruleContent ) )+ otherlv_6= '}' )
            {
            // InternalSlideOMatic.g:793:2: (otherlv_0= 'slide' ( ( ( (lv_sec_1_0= ruleSection ) ) ( (lv_name_2_0= RULE_STRING ) ) ) | ( (lv_name_3_0= RULE_STRING ) ) )? otherlv_4= '{' ( (lv_contents_5_0= ruleContent ) )+ otherlv_6= '}' )
            // InternalSlideOMatic.g:794:3: otherlv_0= 'slide' ( ( ( (lv_sec_1_0= ruleSection ) ) ( (lv_name_2_0= RULE_STRING ) ) ) | ( (lv_name_3_0= RULE_STRING ) ) )? otherlv_4= '{' ( (lv_contents_5_0= ruleContent ) )+ otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,68,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getSlideAccess().getSlideKeyword_0());
            		
            // InternalSlideOMatic.g:798:3: ( ( ( (lv_sec_1_0= ruleSection ) ) ( (lv_name_2_0= RULE_STRING ) ) ) | ( (lv_name_3_0= RULE_STRING ) ) )?
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
                    // InternalSlideOMatic.g:799:4: ( ( (lv_sec_1_0= ruleSection ) ) ( (lv_name_2_0= RULE_STRING ) ) )
                    {
                    // InternalSlideOMatic.g:799:4: ( ( (lv_sec_1_0= ruleSection ) ) ( (lv_name_2_0= RULE_STRING ) ) )
                    // InternalSlideOMatic.g:800:5: ( (lv_sec_1_0= ruleSection ) ) ( (lv_name_2_0= RULE_STRING ) )
                    {
                    // InternalSlideOMatic.g:800:5: ( (lv_sec_1_0= ruleSection ) )
                    // InternalSlideOMatic.g:801:6: (lv_sec_1_0= ruleSection )
                    {
                    // InternalSlideOMatic.g:801:6: (lv_sec_1_0= ruleSection )
                    // InternalSlideOMatic.g:802:7: lv_sec_1_0= ruleSection
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

                    // InternalSlideOMatic.g:819:5: ( (lv_name_2_0= RULE_STRING ) )
                    // InternalSlideOMatic.g:820:6: (lv_name_2_0= RULE_STRING )
                    {
                    // InternalSlideOMatic.g:820:6: (lv_name_2_0= RULE_STRING )
                    // InternalSlideOMatic.g:821:7: lv_name_2_0= RULE_STRING
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
                    // InternalSlideOMatic.g:839:4: ( (lv_name_3_0= RULE_STRING ) )
                    {
                    // InternalSlideOMatic.g:839:4: ( (lv_name_3_0= RULE_STRING ) )
                    // InternalSlideOMatic.g:840:5: (lv_name_3_0= RULE_STRING )
                    {
                    // InternalSlideOMatic.g:840:5: (lv_name_3_0= RULE_STRING )
                    // InternalSlideOMatic.g:841:6: lv_name_3_0= RULE_STRING
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
            		
            // InternalSlideOMatic.g:862:3: ( (lv_contents_5_0= ruleContent ) )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_STRING||(LA15_0>=71 && LA15_0<=79)||LA15_0==81||LA15_0==98||LA15_0==101||LA15_0==103||LA15_0==107) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalSlideOMatic.g:863:4: (lv_contents_5_0= ruleContent )
            	    {
            	    // InternalSlideOMatic.g:863:4: (lv_contents_5_0= ruleContent )
            	    // InternalSlideOMatic.g:864:5: lv_contents_5_0= ruleContent
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
    // InternalSlideOMatic.g:889:1: entryRuleSection returns [EObject current=null] : iv_ruleSection= ruleSection EOF ;
    public final EObject entryRuleSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSection = null;


        try {
            // InternalSlideOMatic.g:889:48: (iv_ruleSection= ruleSection EOF )
            // InternalSlideOMatic.g:890:2: iv_ruleSection= ruleSection EOF
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
    // InternalSlideOMatic.g:896:1: ruleSection returns [EObject current=null] : ( ( () otherlv_1= '*' ) | ( () otherlv_3= '**' ) | ( () otherlv_5= '***' ) ) ;
    public final EObject ruleSection() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalSlideOMatic.g:902:2: ( ( ( () otherlv_1= '*' ) | ( () otherlv_3= '**' ) | ( () otherlv_5= '***' ) ) )
            // InternalSlideOMatic.g:903:2: ( ( () otherlv_1= '*' ) | ( () otherlv_3= '**' ) | ( () otherlv_5= '***' ) )
            {
            // InternalSlideOMatic.g:903:2: ( ( () otherlv_1= '*' ) | ( () otherlv_3= '**' ) | ( () otherlv_5= '***' ) )
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
                    // InternalSlideOMatic.g:904:3: ( () otherlv_1= '*' )
                    {
                    // InternalSlideOMatic.g:904:3: ( () otherlv_1= '*' )
                    // InternalSlideOMatic.g:905:4: () otherlv_1= '*'
                    {
                    // InternalSlideOMatic.g:905:4: ()
                    // InternalSlideOMatic.g:906:5: 
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
                    // InternalSlideOMatic.g:918:3: ( () otherlv_3= '**' )
                    {
                    // InternalSlideOMatic.g:918:3: ( () otherlv_3= '**' )
                    // InternalSlideOMatic.g:919:4: () otherlv_3= '**'
                    {
                    // InternalSlideOMatic.g:919:4: ()
                    // InternalSlideOMatic.g:920:5: 
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
                    // InternalSlideOMatic.g:932:3: ( () otherlv_5= '***' )
                    {
                    // InternalSlideOMatic.g:932:3: ( () otherlv_5= '***' )
                    // InternalSlideOMatic.g:933:4: () otherlv_5= '***'
                    {
                    // InternalSlideOMatic.g:933:4: ()
                    // InternalSlideOMatic.g:934:5: 
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
    // InternalSlideOMatic.g:949:1: entryRuleContent returns [EObject current=null] : iv_ruleContent= ruleContent EOF ;
    public final EObject entryRuleContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContent = null;


        try {
            // InternalSlideOMatic.g:949:48: (iv_ruleContent= ruleContent EOF )
            // InternalSlideOMatic.g:950:2: iv_ruleContent= ruleContent EOF
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
    // InternalSlideOMatic.g:956:1: ruleContent returns [EObject current=null] : ( (this_ToC_0= ruleToC | this_Text_1= ruleText | this_Block_2= ruleBlock | this_List_3= ruleList | this_Image_4= ruleImage | this_Table_5= ruleTable | this_Code_6= ruleCode | this_MathExp_7= ruleMathExp ) ( (lv_click_8_0= ruleClick ) )? ) ;
    public final EObject ruleContent() throws RecognitionException {
        EObject current = null;

        EObject this_ToC_0 = null;

        EObject this_Text_1 = null;

        EObject this_Block_2 = null;

        EObject this_List_3 = null;

        EObject this_Image_4 = null;

        EObject this_Table_5 = null;

        EObject this_Code_6 = null;

        EObject this_MathExp_7 = null;

        AntlrDatatypeRuleToken lv_click_8_0 = null;



        	enterRule();

        try {
            // InternalSlideOMatic.g:962:2: ( ( (this_ToC_0= ruleToC | this_Text_1= ruleText | this_Block_2= ruleBlock | this_List_3= ruleList | this_Image_4= ruleImage | this_Table_5= ruleTable | this_Code_6= ruleCode | this_MathExp_7= ruleMathExp ) ( (lv_click_8_0= ruleClick ) )? ) )
            // InternalSlideOMatic.g:963:2: ( (this_ToC_0= ruleToC | this_Text_1= ruleText | this_Block_2= ruleBlock | this_List_3= ruleList | this_Image_4= ruleImage | this_Table_5= ruleTable | this_Code_6= ruleCode | this_MathExp_7= ruleMathExp ) ( (lv_click_8_0= ruleClick ) )? )
            {
            // InternalSlideOMatic.g:963:2: ( (this_ToC_0= ruleToC | this_Text_1= ruleText | this_Block_2= ruleBlock | this_List_3= ruleList | this_Image_4= ruleImage | this_Table_5= ruleTable | this_Code_6= ruleCode | this_MathExp_7= ruleMathExp ) ( (lv_click_8_0= ruleClick ) )? )
            // InternalSlideOMatic.g:964:3: (this_ToC_0= ruleToC | this_Text_1= ruleText | this_Block_2= ruleBlock | this_List_3= ruleList | this_Image_4= ruleImage | this_Table_5= ruleTable | this_Code_6= ruleCode | this_MathExp_7= ruleMathExp ) ( (lv_click_8_0= ruleClick ) )?
            {
            // InternalSlideOMatic.g:964:3: (this_ToC_0= ruleToC | this_Text_1= ruleText | this_Block_2= ruleBlock | this_List_3= ruleList | this_Image_4= ruleImage | this_Table_5= ruleTable | this_Code_6= ruleCode | this_MathExp_7= ruleMathExp )
            int alt17=8;
            switch ( input.LA(1) ) {
            case 71:
                {
                alt17=1;
                }
                break;
            case RULE_STRING:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
                {
                alt17=2;
                }
                break;
            case 77:
                {
                alt17=3;
                }
                break;
            case 78:
            case 79:
                {
                alt17=4;
                }
                break;
            case 81:
                {
                alt17=5;
                }
                break;
            case 98:
                {
                alt17=6;
                }
                break;
            case 101:
            case 103:
                {
                alt17=7;
                }
                break;
            case 107:
                {
                alt17=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalSlideOMatic.g:965:4: this_ToC_0= ruleToC
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
                    // InternalSlideOMatic.g:974:4: this_Text_1= ruleText
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
                    // InternalSlideOMatic.g:983:4: this_Block_2= ruleBlock
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
                    // InternalSlideOMatic.g:992:4: this_List_3= ruleList
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
                    // InternalSlideOMatic.g:1001:4: this_Image_4= ruleImage
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
                    // InternalSlideOMatic.g:1010:4: this_Table_5= ruleTable
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
                    // InternalSlideOMatic.g:1019:4: this_Code_6= ruleCode
                    {

                    				newCompositeNode(grammarAccess.getContentAccess().getCodeParserRuleCall_0_6());
                    			
                    pushFollow(FOLLOW_21);
                    this_Code_6=ruleCode();

                    state._fsp--;


                    				current = this_Code_6;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 8 :
                    // InternalSlideOMatic.g:1028:4: this_MathExp_7= ruleMathExp
                    {

                    				newCompositeNode(grammarAccess.getContentAccess().getMathExpParserRuleCall_0_7());
                    			
                    pushFollow(FOLLOW_21);
                    this_MathExp_7=ruleMathExp();

                    state._fsp--;


                    				current = this_MathExp_7;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalSlideOMatic.g:1037:3: ( (lv_click_8_0= ruleClick ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==106) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalSlideOMatic.g:1038:4: (lv_click_8_0= ruleClick )
                    {
                    // InternalSlideOMatic.g:1038:4: (lv_click_8_0= ruleClick )
                    // InternalSlideOMatic.g:1039:5: lv_click_8_0= ruleClick
                    {

                    					newCompositeNode(grammarAccess.getContentAccess().getClickClickParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_click_8_0=ruleClick();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getContentRule());
                    					}
                    					set(
                    						current,
                    						"click",
                    						lv_click_8_0,
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
    // InternalSlideOMatic.g:1060:1: entryRuleToC returns [EObject current=null] : iv_ruleToC= ruleToC EOF ;
    public final EObject entryRuleToC() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleToC = null;


        try {
            // InternalSlideOMatic.g:1060:44: (iv_ruleToC= ruleToC EOF )
            // InternalSlideOMatic.g:1061:2: iv_ruleToC= ruleToC EOF
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
    // InternalSlideOMatic.g:1067:1: ruleToC returns [EObject current=null] : ( ( () otherlv_1= 'ToC' ) | ( () otherlv_3= 'ToC' otherlv_4= '*' ) ) ;
    public final EObject ruleToC() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalSlideOMatic.g:1073:2: ( ( ( () otherlv_1= 'ToC' ) | ( () otherlv_3= 'ToC' otherlv_4= '*' ) ) )
            // InternalSlideOMatic.g:1074:2: ( ( () otherlv_1= 'ToC' ) | ( () otherlv_3= 'ToC' otherlv_4= '*' ) )
            {
            // InternalSlideOMatic.g:1074:2: ( ( () otherlv_1= 'ToC' ) | ( () otherlv_3= 'ToC' otherlv_4= '*' ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==71) ) {
                int LA19_1 = input.LA(2);

                if ( (LA19_1==EOF||LA19_1==RULE_STRING||LA19_1==15||(LA19_1>=71 && LA19_1<=79)||LA19_1==81||LA19_1==98||LA19_1==101||LA19_1==103||(LA19_1>=106 && LA19_1<=107)) ) {
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
                    // InternalSlideOMatic.g:1075:3: ( () otherlv_1= 'ToC' )
                    {
                    // InternalSlideOMatic.g:1075:3: ( () otherlv_1= 'ToC' )
                    // InternalSlideOMatic.g:1076:4: () otherlv_1= 'ToC'
                    {
                    // InternalSlideOMatic.g:1076:4: ()
                    // InternalSlideOMatic.g:1077:5: 
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
                    // InternalSlideOMatic.g:1089:3: ( () otherlv_3= 'ToC' otherlv_4= '*' )
                    {
                    // InternalSlideOMatic.g:1089:3: ( () otherlv_3= 'ToC' otherlv_4= '*' )
                    // InternalSlideOMatic.g:1090:4: () otherlv_3= 'ToC' otherlv_4= '*'
                    {
                    // InternalSlideOMatic.g:1090:4: ()
                    // InternalSlideOMatic.g:1091:5: 
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
    // InternalSlideOMatic.g:1110:1: entryRuleText returns [EObject current=null] : iv_ruleText= ruleText EOF ;
    public final EObject entryRuleText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleText = null;


        try {
            // InternalSlideOMatic.g:1110:45: (iv_ruleText= ruleText EOF )
            // InternalSlideOMatic.g:1111:2: iv_ruleText= ruleText EOF
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
    // InternalSlideOMatic.g:1117:1: ruleText returns [EObject current=null] : ( ( (lv_types_0_0= ruleTextType ) )* ( (lv_text_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleText() throws RecognitionException {
        EObject current = null;

        Token lv_text_1_0=null;
        EObject lv_types_0_0 = null;



        	enterRule();

        try {
            // InternalSlideOMatic.g:1123:2: ( ( ( (lv_types_0_0= ruleTextType ) )* ( (lv_text_1_0= RULE_STRING ) ) ) )
            // InternalSlideOMatic.g:1124:2: ( ( (lv_types_0_0= ruleTextType ) )* ( (lv_text_1_0= RULE_STRING ) ) )
            {
            // InternalSlideOMatic.g:1124:2: ( ( (lv_types_0_0= ruleTextType ) )* ( (lv_text_1_0= RULE_STRING ) ) )
            // InternalSlideOMatic.g:1125:3: ( (lv_types_0_0= ruleTextType ) )* ( (lv_text_1_0= RULE_STRING ) )
            {
            // InternalSlideOMatic.g:1125:3: ( (lv_types_0_0= ruleTextType ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=72 && LA20_0<=76)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalSlideOMatic.g:1126:4: (lv_types_0_0= ruleTextType )
            	    {
            	    // InternalSlideOMatic.g:1126:4: (lv_types_0_0= ruleTextType )
            	    // InternalSlideOMatic.g:1127:5: lv_types_0_0= ruleTextType
            	    {

            	    					newCompositeNode(grammarAccess.getTextAccess().getTypesTextTypeParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_23);
            	    lv_types_0_0=ruleTextType();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTextRule());
            	    					}
            	    					add(
            	    						current,
            	    						"types",
            	    						lv_types_0_0,
            	    						"dk.sdu.mmmi.mdsd.f18.dsl.external.SlideOMatic.TextType");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            // InternalSlideOMatic.g:1144:3: ( (lv_text_1_0= RULE_STRING ) )
            // InternalSlideOMatic.g:1145:4: (lv_text_1_0= RULE_STRING )
            {
            // InternalSlideOMatic.g:1145:4: (lv_text_1_0= RULE_STRING )
            // InternalSlideOMatic.g:1146:5: lv_text_1_0= RULE_STRING
            {
            lv_text_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_text_1_0, grammarAccess.getTextAccess().getTextSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTextRule());
            					}
            					setWithLastConsumed(
            						current,
            						"text",
            						lv_text_1_0,
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
    // $ANTLR end "ruleText"


    // $ANTLR start "entryRuleTextType"
    // InternalSlideOMatic.g:1166:1: entryRuleTextType returns [EObject current=null] : iv_ruleTextType= ruleTextType EOF ;
    public final EObject entryRuleTextType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextType = null;


        try {
            // InternalSlideOMatic.g:1166:49: (iv_ruleTextType= ruleTextType EOF )
            // InternalSlideOMatic.g:1167:2: iv_ruleTextType= ruleTextType EOF
            {
             newCompositeNode(grammarAccess.getTextTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTextType=ruleTextType();

            state._fsp--;

             current =iv_ruleTextType; 
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
    // $ANTLR end "entryRuleTextType"


    // $ANTLR start "ruleTextType"
    // InternalSlideOMatic.g:1173:1: ruleTextType returns [EObject current=null] : ( ( () otherlv_1= 'b' ) | ( () otherlv_3= 'i' ) | ( () otherlv_5= 'u' ) | ( () otherlv_7= 'fnote' ) | ( () otherlv_9= 'url' ) ) ;
    public final EObject ruleTextType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;


        	enterRule();

        try {
            // InternalSlideOMatic.g:1179:2: ( ( ( () otherlv_1= 'b' ) | ( () otherlv_3= 'i' ) | ( () otherlv_5= 'u' ) | ( () otherlv_7= 'fnote' ) | ( () otherlv_9= 'url' ) ) )
            // InternalSlideOMatic.g:1180:2: ( ( () otherlv_1= 'b' ) | ( () otherlv_3= 'i' ) | ( () otherlv_5= 'u' ) | ( () otherlv_7= 'fnote' ) | ( () otherlv_9= 'url' ) )
            {
            // InternalSlideOMatic.g:1180:2: ( ( () otherlv_1= 'b' ) | ( () otherlv_3= 'i' ) | ( () otherlv_5= 'u' ) | ( () otherlv_7= 'fnote' ) | ( () otherlv_9= 'url' ) )
            int alt21=5;
            switch ( input.LA(1) ) {
            case 72:
                {
                alt21=1;
                }
                break;
            case 73:
                {
                alt21=2;
                }
                break;
            case 74:
                {
                alt21=3;
                }
                break;
            case 75:
                {
                alt21=4;
                }
                break;
            case 76:
                {
                alt21=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // InternalSlideOMatic.g:1181:3: ( () otherlv_1= 'b' )
                    {
                    // InternalSlideOMatic.g:1181:3: ( () otherlv_1= 'b' )
                    // InternalSlideOMatic.g:1182:4: () otherlv_1= 'b'
                    {
                    // InternalSlideOMatic.g:1182:4: ()
                    // InternalSlideOMatic.g:1183:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTextTypeAccess().getBoldAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,72,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getTextTypeAccess().getBKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSlideOMatic.g:1195:3: ( () otherlv_3= 'i' )
                    {
                    // InternalSlideOMatic.g:1195:3: ( () otherlv_3= 'i' )
                    // InternalSlideOMatic.g:1196:4: () otherlv_3= 'i'
                    {
                    // InternalSlideOMatic.g:1196:4: ()
                    // InternalSlideOMatic.g:1197:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTextTypeAccess().getItalicAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_3=(Token)match(input,73,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getTextTypeAccess().getIKeyword_1_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSlideOMatic.g:1209:3: ( () otherlv_5= 'u' )
                    {
                    // InternalSlideOMatic.g:1209:3: ( () otherlv_5= 'u' )
                    // InternalSlideOMatic.g:1210:4: () otherlv_5= 'u'
                    {
                    // InternalSlideOMatic.g:1210:4: ()
                    // InternalSlideOMatic.g:1211:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTextTypeAccess().getUnderlineAction_2_0(),
                    						current);
                    				

                    }

                    otherlv_5=(Token)match(input,74,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getTextTypeAccess().getUKeyword_2_1());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSlideOMatic.g:1223:3: ( () otherlv_7= 'fnote' )
                    {
                    // InternalSlideOMatic.g:1223:3: ( () otherlv_7= 'fnote' )
                    // InternalSlideOMatic.g:1224:4: () otherlv_7= 'fnote'
                    {
                    // InternalSlideOMatic.g:1224:4: ()
                    // InternalSlideOMatic.g:1225:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTextTypeAccess().getFootNoteAction_3_0(),
                    						current);
                    				

                    }

                    otherlv_7=(Token)match(input,75,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getTextTypeAccess().getFnoteKeyword_3_1());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalSlideOMatic.g:1237:3: ( () otherlv_9= 'url' )
                    {
                    // InternalSlideOMatic.g:1237:3: ( () otherlv_9= 'url' )
                    // InternalSlideOMatic.g:1238:4: () otherlv_9= 'url'
                    {
                    // InternalSlideOMatic.g:1238:4: ()
                    // InternalSlideOMatic.g:1239:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTextTypeAccess().getURLAction_4_0(),
                    						current);
                    				

                    }

                    otherlv_9=(Token)match(input,76,FOLLOW_2); 

                    				newLeafNode(otherlv_9, grammarAccess.getTextTypeAccess().getUrlKeyword_4_1());
                    			

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
    // $ANTLR end "ruleTextType"


    // $ANTLR start "entryRuleBlock"
    // InternalSlideOMatic.g:1254:1: entryRuleBlock returns [EObject current=null] : iv_ruleBlock= ruleBlock EOF ;
    public final EObject entryRuleBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlock = null;


        try {
            // InternalSlideOMatic.g:1254:46: (iv_ruleBlock= ruleBlock EOF )
            // InternalSlideOMatic.g:1255:2: iv_ruleBlock= ruleBlock EOF
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
    // InternalSlideOMatic.g:1261:1: ruleBlock returns [EObject current=null] : (otherlv_0= 'block' ( (lv_name_1_0= RULE_STRING ) )? otherlv_2= '{' ( (lv_content_3_0= ruleContent ) )+ otherlv_4= '}' ) ;
    public final EObject ruleBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_content_3_0 = null;



        	enterRule();

        try {
            // InternalSlideOMatic.g:1267:2: ( (otherlv_0= 'block' ( (lv_name_1_0= RULE_STRING ) )? otherlv_2= '{' ( (lv_content_3_0= ruleContent ) )+ otherlv_4= '}' ) )
            // InternalSlideOMatic.g:1268:2: (otherlv_0= 'block' ( (lv_name_1_0= RULE_STRING ) )? otherlv_2= '{' ( (lv_content_3_0= ruleContent ) )+ otherlv_4= '}' )
            {
            // InternalSlideOMatic.g:1268:2: (otherlv_0= 'block' ( (lv_name_1_0= RULE_STRING ) )? otherlv_2= '{' ( (lv_content_3_0= ruleContent ) )+ otherlv_4= '}' )
            // InternalSlideOMatic.g:1269:3: otherlv_0= 'block' ( (lv_name_1_0= RULE_STRING ) )? otherlv_2= '{' ( (lv_content_3_0= ruleContent ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,77,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getBlockAccess().getBlockKeyword_0());
            		
            // InternalSlideOMatic.g:1273:3: ( (lv_name_1_0= RULE_STRING ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_STRING) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalSlideOMatic.g:1274:4: (lv_name_1_0= RULE_STRING )
                    {
                    // InternalSlideOMatic.g:1274:4: (lv_name_1_0= RULE_STRING )
                    // InternalSlideOMatic.g:1275:5: lv_name_1_0= RULE_STRING
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
            		
            // InternalSlideOMatic.g:1295:3: ( (lv_content_3_0= ruleContent ) )+
            int cnt23=0;
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_STRING||(LA23_0>=71 && LA23_0<=79)||LA23_0==81||LA23_0==98||LA23_0==101||LA23_0==103||LA23_0==107) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalSlideOMatic.g:1296:4: (lv_content_3_0= ruleContent )
            	    {
            	    // InternalSlideOMatic.g:1296:4: (lv_content_3_0= ruleContent )
            	    // InternalSlideOMatic.g:1297:5: lv_content_3_0= ruleContent
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
            	    if ( cnt23 >= 1 ) break loop23;
                        EarlyExitException eee =
                            new EarlyExitException(23, input);
                        throw eee;
                }
                cnt23++;
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
    // InternalSlideOMatic.g:1322:1: entryRuleList returns [EObject current=null] : iv_ruleList= ruleList EOF ;
    public final EObject entryRuleList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleList = null;


        try {
            // InternalSlideOMatic.g:1322:45: (iv_ruleList= ruleList EOF )
            // InternalSlideOMatic.g:1323:2: iv_ruleList= ruleList EOF
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
    // InternalSlideOMatic.g:1329:1: ruleList returns [EObject current=null] : (this_NumberedList_0= ruleNumberedList | this_UnNumberedList_1= ruleUnNumberedList ) ;
    public final EObject ruleList() throws RecognitionException {
        EObject current = null;

        EObject this_NumberedList_0 = null;

        EObject this_UnNumberedList_1 = null;



        	enterRule();

        try {
            // InternalSlideOMatic.g:1335:2: ( (this_NumberedList_0= ruleNumberedList | this_UnNumberedList_1= ruleUnNumberedList ) )
            // InternalSlideOMatic.g:1336:2: (this_NumberedList_0= ruleNumberedList | this_UnNumberedList_1= ruleUnNumberedList )
            {
            // InternalSlideOMatic.g:1336:2: (this_NumberedList_0= ruleNumberedList | this_UnNumberedList_1= ruleUnNumberedList )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==78) ) {
                alt24=1;
            }
            else if ( (LA24_0==79) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalSlideOMatic.g:1337:3: this_NumberedList_0= ruleNumberedList
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
                    // InternalSlideOMatic.g:1346:3: this_UnNumberedList_1= ruleUnNumberedList
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
    // InternalSlideOMatic.g:1358:1: entryRuleNumberedList returns [EObject current=null] : iv_ruleNumberedList= ruleNumberedList EOF ;
    public final EObject entryRuleNumberedList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberedList = null;


        try {
            // InternalSlideOMatic.g:1358:53: (iv_ruleNumberedList= ruleNumberedList EOF )
            // InternalSlideOMatic.g:1359:2: iv_ruleNumberedList= ruleNumberedList EOF
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
    // InternalSlideOMatic.g:1365:1: ruleNumberedList returns [EObject current=null] : (otherlv_0= '#list' ( (lv_items_1_0= ruleListItem ) )+ ) ;
    public final EObject ruleNumberedList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_items_1_0 = null;



        	enterRule();

        try {
            // InternalSlideOMatic.g:1371:2: ( (otherlv_0= '#list' ( (lv_items_1_0= ruleListItem ) )+ ) )
            // InternalSlideOMatic.g:1372:2: (otherlv_0= '#list' ( (lv_items_1_0= ruleListItem ) )+ )
            {
            // InternalSlideOMatic.g:1372:2: (otherlv_0= '#list' ( (lv_items_1_0= ruleListItem ) )+ )
            // InternalSlideOMatic.g:1373:3: otherlv_0= '#list' ( (lv_items_1_0= ruleListItem ) )+
            {
            otherlv_0=(Token)match(input,78,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getNumberedListAccess().getListKeyword_0());
            		
            // InternalSlideOMatic.g:1377:3: ( (lv_items_1_0= ruleListItem ) )+
            int cnt25=0;
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==80) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalSlideOMatic.g:1378:4: (lv_items_1_0= ruleListItem )
            	    {
            	    // InternalSlideOMatic.g:1378:4: (lv_items_1_0= ruleListItem )
            	    // InternalSlideOMatic.g:1379:5: lv_items_1_0= ruleListItem
            	    {

            	    					newCompositeNode(grammarAccess.getNumberedListAccess().getItemsListItemParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_25);
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
            	    if ( cnt25 >= 1 ) break loop25;
                        EarlyExitException eee =
                            new EarlyExitException(25, input);
                        throw eee;
                }
                cnt25++;
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
    // InternalSlideOMatic.g:1400:1: entryRuleUnNumberedList returns [EObject current=null] : iv_ruleUnNumberedList= ruleUnNumberedList EOF ;
    public final EObject entryRuleUnNumberedList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnNumberedList = null;


        try {
            // InternalSlideOMatic.g:1400:55: (iv_ruleUnNumberedList= ruleUnNumberedList EOF )
            // InternalSlideOMatic.g:1401:2: iv_ruleUnNumberedList= ruleUnNumberedList EOF
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
    // InternalSlideOMatic.g:1407:1: ruleUnNumberedList returns [EObject current=null] : (otherlv_0= '&list' ( (lv_items_1_0= ruleListItem ) )+ ) ;
    public final EObject ruleUnNumberedList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_items_1_0 = null;



        	enterRule();

        try {
            // InternalSlideOMatic.g:1413:2: ( (otherlv_0= '&list' ( (lv_items_1_0= ruleListItem ) )+ ) )
            // InternalSlideOMatic.g:1414:2: (otherlv_0= '&list' ( (lv_items_1_0= ruleListItem ) )+ )
            {
            // InternalSlideOMatic.g:1414:2: (otherlv_0= '&list' ( (lv_items_1_0= ruleListItem ) )+ )
            // InternalSlideOMatic.g:1415:3: otherlv_0= '&list' ( (lv_items_1_0= ruleListItem ) )+
            {
            otherlv_0=(Token)match(input,79,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getUnNumberedListAccess().getListKeyword_0());
            		
            // InternalSlideOMatic.g:1419:3: ( (lv_items_1_0= ruleListItem ) )+
            int cnt26=0;
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==80) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalSlideOMatic.g:1420:4: (lv_items_1_0= ruleListItem )
            	    {
            	    // InternalSlideOMatic.g:1420:4: (lv_items_1_0= ruleListItem )
            	    // InternalSlideOMatic.g:1421:5: lv_items_1_0= ruleListItem
            	    {

            	    					newCompositeNode(grammarAccess.getUnNumberedListAccess().getItemsListItemParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_25);
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
            	    if ( cnt26 >= 1 ) break loop26;
                        EarlyExitException eee =
                            new EarlyExitException(26, input);
                        throw eee;
                }
                cnt26++;
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
    // InternalSlideOMatic.g:1442:1: entryRuleListItem returns [EObject current=null] : iv_ruleListItem= ruleListItem EOF ;
    public final EObject entryRuleListItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListItem = null;


        try {
            // InternalSlideOMatic.g:1442:49: (iv_ruleListItem= ruleListItem EOF )
            // InternalSlideOMatic.g:1443:2: iv_ruleListItem= ruleListItem EOF
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
    // InternalSlideOMatic.g:1449:1: ruleListItem returns [EObject current=null] : (otherlv_0= '-' ( (lv_item_1_0= RULE_STRING ) ) (otherlv_2= '(' ( (lv_nestedList_3_0= ruleList ) ) otherlv_4= ')' )? ( (lv_click_5_0= ruleClick ) )? ) ;
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
            // InternalSlideOMatic.g:1455:2: ( (otherlv_0= '-' ( (lv_item_1_0= RULE_STRING ) ) (otherlv_2= '(' ( (lv_nestedList_3_0= ruleList ) ) otherlv_4= ')' )? ( (lv_click_5_0= ruleClick ) )? ) )
            // InternalSlideOMatic.g:1456:2: (otherlv_0= '-' ( (lv_item_1_0= RULE_STRING ) ) (otherlv_2= '(' ( (lv_nestedList_3_0= ruleList ) ) otherlv_4= ')' )? ( (lv_click_5_0= ruleClick ) )? )
            {
            // InternalSlideOMatic.g:1456:2: (otherlv_0= '-' ( (lv_item_1_0= RULE_STRING ) ) (otherlv_2= '(' ( (lv_nestedList_3_0= ruleList ) ) otherlv_4= ')' )? ( (lv_click_5_0= ruleClick ) )? )
            // InternalSlideOMatic.g:1457:3: otherlv_0= '-' ( (lv_item_1_0= RULE_STRING ) ) (otherlv_2= '(' ( (lv_nestedList_3_0= ruleList ) ) otherlv_4= ')' )? ( (lv_click_5_0= ruleClick ) )?
            {
            otherlv_0=(Token)match(input,80,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getListItemAccess().getHyphenMinusKeyword_0());
            		
            // InternalSlideOMatic.g:1461:3: ( (lv_item_1_0= RULE_STRING ) )
            // InternalSlideOMatic.g:1462:4: (lv_item_1_0= RULE_STRING )
            {
            // InternalSlideOMatic.g:1462:4: (lv_item_1_0= RULE_STRING )
            // InternalSlideOMatic.g:1463:5: lv_item_1_0= RULE_STRING
            {
            lv_item_1_0=(Token)match(input,RULE_STRING,FOLLOW_26); 

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

            // InternalSlideOMatic.g:1479:3: (otherlv_2= '(' ( (lv_nestedList_3_0= ruleList ) ) otherlv_4= ')' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==13) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalSlideOMatic.g:1480:4: otherlv_2= '(' ( (lv_nestedList_3_0= ruleList ) ) otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_27); 

                    				newLeafNode(otherlv_2, grammarAccess.getListItemAccess().getLeftParenthesisKeyword_2_0());
                    			
                    // InternalSlideOMatic.g:1484:4: ( (lv_nestedList_3_0= ruleList ) )
                    // InternalSlideOMatic.g:1485:5: (lv_nestedList_3_0= ruleList )
                    {
                    // InternalSlideOMatic.g:1485:5: (lv_nestedList_3_0= ruleList )
                    // InternalSlideOMatic.g:1486:6: lv_nestedList_3_0= ruleList
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

            // InternalSlideOMatic.g:1508:3: ( (lv_click_5_0= ruleClick ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==106) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalSlideOMatic.g:1509:4: (lv_click_5_0= ruleClick )
                    {
                    // InternalSlideOMatic.g:1509:4: (lv_click_5_0= ruleClick )
                    // InternalSlideOMatic.g:1510:5: lv_click_5_0= ruleClick
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
    // InternalSlideOMatic.g:1531:1: entryRuleImage returns [EObject current=null] : iv_ruleImage= ruleImage EOF ;
    public final EObject entryRuleImage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImage = null;


        try {
            // InternalSlideOMatic.g:1531:46: (iv_ruleImage= ruleImage EOF )
            // InternalSlideOMatic.g:1532:2: iv_ruleImage= ruleImage EOF
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
    // InternalSlideOMatic.g:1538:1: ruleImage returns [EObject current=null] : (otherlv_0= 'img' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'src' ( (lv_src_3_0= RULE_STRING ) ) ( (lv_alignment_4_0= ruleAlignment ) )? ( (lv_size_5_0= ruleSize ) ) ) ;
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
            // InternalSlideOMatic.g:1544:2: ( (otherlv_0= 'img' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'src' ( (lv_src_3_0= RULE_STRING ) ) ( (lv_alignment_4_0= ruleAlignment ) )? ( (lv_size_5_0= ruleSize ) ) ) )
            // InternalSlideOMatic.g:1545:2: (otherlv_0= 'img' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'src' ( (lv_src_3_0= RULE_STRING ) ) ( (lv_alignment_4_0= ruleAlignment ) )? ( (lv_size_5_0= ruleSize ) ) )
            {
            // InternalSlideOMatic.g:1545:2: (otherlv_0= 'img' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'src' ( (lv_src_3_0= RULE_STRING ) ) ( (lv_alignment_4_0= ruleAlignment ) )? ( (lv_size_5_0= ruleSize ) ) )
            // InternalSlideOMatic.g:1546:3: otherlv_0= 'img' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'src' ( (lv_src_3_0= RULE_STRING ) ) ( (lv_alignment_4_0= ruleAlignment ) )? ( (lv_size_5_0= ruleSize ) )
            {
            otherlv_0=(Token)match(input,81,FOLLOW_28); 

            			newLeafNode(otherlv_0, grammarAccess.getImageAccess().getImgKeyword_0());
            		
            // InternalSlideOMatic.g:1550:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSlideOMatic.g:1551:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSlideOMatic.g:1551:4: (lv_name_1_0= RULE_ID )
            // InternalSlideOMatic.g:1552:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_29); 

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

            otherlv_2=(Token)match(input,82,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getImageAccess().getSrcKeyword_2());
            		
            // InternalSlideOMatic.g:1572:3: ( (lv_src_3_0= RULE_STRING ) )
            // InternalSlideOMatic.g:1573:4: (lv_src_3_0= RULE_STRING )
            {
            // InternalSlideOMatic.g:1573:4: (lv_src_3_0= RULE_STRING )
            // InternalSlideOMatic.g:1574:5: lv_src_3_0= RULE_STRING
            {
            lv_src_3_0=(Token)match(input,RULE_STRING,FOLLOW_30); 

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

            // InternalSlideOMatic.g:1590:3: ( (lv_alignment_4_0= ruleAlignment ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=83 && LA29_0<=91)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalSlideOMatic.g:1591:4: (lv_alignment_4_0= ruleAlignment )
                    {
                    // InternalSlideOMatic.g:1591:4: (lv_alignment_4_0= ruleAlignment )
                    // InternalSlideOMatic.g:1592:5: lv_alignment_4_0= ruleAlignment
                    {

                    					newCompositeNode(grammarAccess.getImageAccess().getAlignmentAlignmentParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_30);
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

            // InternalSlideOMatic.g:1609:3: ( (lv_size_5_0= ruleSize ) )
            // InternalSlideOMatic.g:1610:4: (lv_size_5_0= ruleSize )
            {
            // InternalSlideOMatic.g:1610:4: (lv_size_5_0= ruleSize )
            // InternalSlideOMatic.g:1611:5: lv_size_5_0= ruleSize
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
    // InternalSlideOMatic.g:1632:1: entryRuleAlignment returns [String current=null] : iv_ruleAlignment= ruleAlignment EOF ;
    public final String entryRuleAlignment() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAlignment = null;


        try {
            // InternalSlideOMatic.g:1632:49: (iv_ruleAlignment= ruleAlignment EOF )
            // InternalSlideOMatic.g:1633:2: iv_ruleAlignment= ruleAlignment EOF
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
    // InternalSlideOMatic.g:1639:1: ruleAlignment returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'topleft' | kw= 'top' | kw= 'topright' | kw= 'left' | kw= 'center' | kw= 'right' | kw= 'bottomleft' | kw= 'bottom' | kw= 'bottomright' ) ;
    public final AntlrDatatypeRuleToken ruleAlignment() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSlideOMatic.g:1645:2: ( (kw= 'topleft' | kw= 'top' | kw= 'topright' | kw= 'left' | kw= 'center' | kw= 'right' | kw= 'bottomleft' | kw= 'bottom' | kw= 'bottomright' ) )
            // InternalSlideOMatic.g:1646:2: (kw= 'topleft' | kw= 'top' | kw= 'topright' | kw= 'left' | kw= 'center' | kw= 'right' | kw= 'bottomleft' | kw= 'bottom' | kw= 'bottomright' )
            {
            // InternalSlideOMatic.g:1646:2: (kw= 'topleft' | kw= 'top' | kw= 'topright' | kw= 'left' | kw= 'center' | kw= 'right' | kw= 'bottomleft' | kw= 'bottom' | kw= 'bottomright' )
            int alt30=9;
            switch ( input.LA(1) ) {
            case 83:
                {
                alt30=1;
                }
                break;
            case 84:
                {
                alt30=2;
                }
                break;
            case 85:
                {
                alt30=3;
                }
                break;
            case 86:
                {
                alt30=4;
                }
                break;
            case 87:
                {
                alt30=5;
                }
                break;
            case 88:
                {
                alt30=6;
                }
                break;
            case 89:
                {
                alt30=7;
                }
                break;
            case 90:
                {
                alt30=8;
                }
                break;
            case 91:
                {
                alt30=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // InternalSlideOMatic.g:1647:3: kw= 'topleft'
                    {
                    kw=(Token)match(input,83,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAlignmentAccess().getTopleftKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSlideOMatic.g:1653:3: kw= 'top'
                    {
                    kw=(Token)match(input,84,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAlignmentAccess().getTopKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalSlideOMatic.g:1659:3: kw= 'topright'
                    {
                    kw=(Token)match(input,85,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAlignmentAccess().getToprightKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalSlideOMatic.g:1665:3: kw= 'left'
                    {
                    kw=(Token)match(input,86,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAlignmentAccess().getLeftKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalSlideOMatic.g:1671:3: kw= 'center'
                    {
                    kw=(Token)match(input,87,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAlignmentAccess().getCenterKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalSlideOMatic.g:1677:3: kw= 'right'
                    {
                    kw=(Token)match(input,88,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAlignmentAccess().getRightKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalSlideOMatic.g:1683:3: kw= 'bottomleft'
                    {
                    kw=(Token)match(input,89,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAlignmentAccess().getBottomleftKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalSlideOMatic.g:1689:3: kw= 'bottom'
                    {
                    kw=(Token)match(input,90,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAlignmentAccess().getBottomKeyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalSlideOMatic.g:1695:3: kw= 'bottomright'
                    {
                    kw=(Token)match(input,91,FOLLOW_2); 

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
    // InternalSlideOMatic.g:1704:1: entryRuleSize returns [EObject current=null] : iv_ruleSize= ruleSize EOF ;
    public final EObject entryRuleSize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSize = null;


        try {
            // InternalSlideOMatic.g:1704:45: (iv_ruleSize= ruleSize EOF )
            // InternalSlideOMatic.g:1705:2: iv_ruleSize= ruleSize EOF
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
    // InternalSlideOMatic.g:1711:1: ruleSize returns [EObject current=null] : ( ( () ( (lv_way_1_0= ruleWay ) ) ( (lv_scale_2_0= RULE_INT ) ) otherlv_3= '%' ) | ( () ( (lv_way_5_0= ruleWay ) ) ( (lv_size_6_0= RULE_INT ) ) ( ( (lv_unit_7_1= 'cm' | lv_unit_7_2= 'em' | lv_unit_7_3= 'mm' ) ) ) ) ) ;
    public final EObject ruleSize() throws RecognitionException {
        EObject current = null;

        Token lv_scale_2_0=null;
        Token otherlv_3=null;
        Token lv_size_6_0=null;
        Token lv_unit_7_1=null;
        Token lv_unit_7_2=null;
        Token lv_unit_7_3=null;
        EObject lv_way_1_0 = null;

        EObject lv_way_5_0 = null;



        	enterRule();

        try {
            // InternalSlideOMatic.g:1717:2: ( ( ( () ( (lv_way_1_0= ruleWay ) ) ( (lv_scale_2_0= RULE_INT ) ) otherlv_3= '%' ) | ( () ( (lv_way_5_0= ruleWay ) ) ( (lv_size_6_0= RULE_INT ) ) ( ( (lv_unit_7_1= 'cm' | lv_unit_7_2= 'em' | lv_unit_7_3= 'mm' ) ) ) ) ) )
            // InternalSlideOMatic.g:1718:2: ( ( () ( (lv_way_1_0= ruleWay ) ) ( (lv_scale_2_0= RULE_INT ) ) otherlv_3= '%' ) | ( () ( (lv_way_5_0= ruleWay ) ) ( (lv_size_6_0= RULE_INT ) ) ( ( (lv_unit_7_1= 'cm' | lv_unit_7_2= 'em' | lv_unit_7_3= 'mm' ) ) ) ) )
            {
            // InternalSlideOMatic.g:1718:2: ( ( () ( (lv_way_1_0= ruleWay ) ) ( (lv_scale_2_0= RULE_INT ) ) otherlv_3= '%' ) | ( () ( (lv_way_5_0= ruleWay ) ) ( (lv_size_6_0= RULE_INT ) ) ( ( (lv_unit_7_1= 'cm' | lv_unit_7_2= 'em' | lv_unit_7_3= 'mm' ) ) ) ) )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==96) ) {
                int LA32_1 = input.LA(2);

                if ( (LA32_1==RULE_INT) ) {
                    int LA32_3 = input.LA(3);

                    if ( ((LA32_3>=93 && LA32_3<=95)) ) {
                        alt32=2;
                    }
                    else if ( (LA32_3==92) ) {
                        alt32=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 32, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 32, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA32_0==97) ) {
                int LA32_2 = input.LA(2);

                if ( (LA32_2==RULE_INT) ) {
                    int LA32_3 = input.LA(3);

                    if ( ((LA32_3>=93 && LA32_3<=95)) ) {
                        alt32=2;
                    }
                    else if ( (LA32_3==92) ) {
                        alt32=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 32, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 32, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // InternalSlideOMatic.g:1719:3: ( () ( (lv_way_1_0= ruleWay ) ) ( (lv_scale_2_0= RULE_INT ) ) otherlv_3= '%' )
                    {
                    // InternalSlideOMatic.g:1719:3: ( () ( (lv_way_1_0= ruleWay ) ) ( (lv_scale_2_0= RULE_INT ) ) otherlv_3= '%' )
                    // InternalSlideOMatic.g:1720:4: () ( (lv_way_1_0= ruleWay ) ) ( (lv_scale_2_0= RULE_INT ) ) otherlv_3= '%'
                    {
                    // InternalSlideOMatic.g:1720:4: ()
                    // InternalSlideOMatic.g:1721:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSizeAccess().getProportionalSizeAction_0_0(),
                    						current);
                    				

                    }

                    // InternalSlideOMatic.g:1727:4: ( (lv_way_1_0= ruleWay ) )
                    // InternalSlideOMatic.g:1728:5: (lv_way_1_0= ruleWay )
                    {
                    // InternalSlideOMatic.g:1728:5: (lv_way_1_0= ruleWay )
                    // InternalSlideOMatic.g:1729:6: lv_way_1_0= ruleWay
                    {

                    						newCompositeNode(grammarAccess.getSizeAccess().getWayWayParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_31);
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

                    // InternalSlideOMatic.g:1746:4: ( (lv_scale_2_0= RULE_INT ) )
                    // InternalSlideOMatic.g:1747:5: (lv_scale_2_0= RULE_INT )
                    {
                    // InternalSlideOMatic.g:1747:5: (lv_scale_2_0= RULE_INT )
                    // InternalSlideOMatic.g:1748:6: lv_scale_2_0= RULE_INT
                    {
                    lv_scale_2_0=(Token)match(input,RULE_INT,FOLLOW_32); 

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

                    otherlv_3=(Token)match(input,92,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getSizeAccess().getPercentSignKeyword_0_3());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSlideOMatic.g:1770:3: ( () ( (lv_way_5_0= ruleWay ) ) ( (lv_size_6_0= RULE_INT ) ) ( ( (lv_unit_7_1= 'cm' | lv_unit_7_2= 'em' | lv_unit_7_3= 'mm' ) ) ) )
                    {
                    // InternalSlideOMatic.g:1770:3: ( () ( (lv_way_5_0= ruleWay ) ) ( (lv_size_6_0= RULE_INT ) ) ( ( (lv_unit_7_1= 'cm' | lv_unit_7_2= 'em' | lv_unit_7_3= 'mm' ) ) ) )
                    // InternalSlideOMatic.g:1771:4: () ( (lv_way_5_0= ruleWay ) ) ( (lv_size_6_0= RULE_INT ) ) ( ( (lv_unit_7_1= 'cm' | lv_unit_7_2= 'em' | lv_unit_7_3= 'mm' ) ) )
                    {
                    // InternalSlideOMatic.g:1771:4: ()
                    // InternalSlideOMatic.g:1772:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSizeAccess().getExactSizeAction_1_0(),
                    						current);
                    				

                    }

                    // InternalSlideOMatic.g:1778:4: ( (lv_way_5_0= ruleWay ) )
                    // InternalSlideOMatic.g:1779:5: (lv_way_5_0= ruleWay )
                    {
                    // InternalSlideOMatic.g:1779:5: (lv_way_5_0= ruleWay )
                    // InternalSlideOMatic.g:1780:6: lv_way_5_0= ruleWay
                    {

                    						newCompositeNode(grammarAccess.getSizeAccess().getWayWayParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_way_5_0=ruleWay();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSizeRule());
                    						}
                    						set(
                    							current,
                    							"way",
                    							lv_way_5_0,
                    							"dk.sdu.mmmi.mdsd.f18.dsl.external.SlideOMatic.Way");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSlideOMatic.g:1797:4: ( (lv_size_6_0= RULE_INT ) )
                    // InternalSlideOMatic.g:1798:5: (lv_size_6_0= RULE_INT )
                    {
                    // InternalSlideOMatic.g:1798:5: (lv_size_6_0= RULE_INT )
                    // InternalSlideOMatic.g:1799:6: lv_size_6_0= RULE_INT
                    {
                    lv_size_6_0=(Token)match(input,RULE_INT,FOLLOW_33); 

                    						newLeafNode(lv_size_6_0, grammarAccess.getSizeAccess().getSizeINTTerminalRuleCall_1_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSizeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"size",
                    							lv_size_6_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    // InternalSlideOMatic.g:1815:4: ( ( (lv_unit_7_1= 'cm' | lv_unit_7_2= 'em' | lv_unit_7_3= 'mm' ) ) )
                    // InternalSlideOMatic.g:1816:5: ( (lv_unit_7_1= 'cm' | lv_unit_7_2= 'em' | lv_unit_7_3= 'mm' ) )
                    {
                    // InternalSlideOMatic.g:1816:5: ( (lv_unit_7_1= 'cm' | lv_unit_7_2= 'em' | lv_unit_7_3= 'mm' ) )
                    // InternalSlideOMatic.g:1817:6: (lv_unit_7_1= 'cm' | lv_unit_7_2= 'em' | lv_unit_7_3= 'mm' )
                    {
                    // InternalSlideOMatic.g:1817:6: (lv_unit_7_1= 'cm' | lv_unit_7_2= 'em' | lv_unit_7_3= 'mm' )
                    int alt31=3;
                    switch ( input.LA(1) ) {
                    case 93:
                        {
                        alt31=1;
                        }
                        break;
                    case 94:
                        {
                        alt31=2;
                        }
                        break;
                    case 95:
                        {
                        alt31=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 31, 0, input);

                        throw nvae;
                    }

                    switch (alt31) {
                        case 1 :
                            // InternalSlideOMatic.g:1818:7: lv_unit_7_1= 'cm'
                            {
                            lv_unit_7_1=(Token)match(input,93,FOLLOW_2); 

                            							newLeafNode(lv_unit_7_1, grammarAccess.getSizeAccess().getUnitCmKeyword_1_3_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getSizeRule());
                            							}
                            							setWithLastConsumed(current, "unit", lv_unit_7_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalSlideOMatic.g:1829:7: lv_unit_7_2= 'em'
                            {
                            lv_unit_7_2=(Token)match(input,94,FOLLOW_2); 

                            							newLeafNode(lv_unit_7_2, grammarAccess.getSizeAccess().getUnitEmKeyword_1_3_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getSizeRule());
                            							}
                            							setWithLastConsumed(current, "unit", lv_unit_7_2, null);
                            						

                            }
                            break;
                        case 3 :
                            // InternalSlideOMatic.g:1840:7: lv_unit_7_3= 'mm'
                            {
                            lv_unit_7_3=(Token)match(input,95,FOLLOW_2); 

                            							newLeafNode(lv_unit_7_3, grammarAccess.getSizeAccess().getUnitMmKeyword_1_3_0_2());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getSizeRule());
                            							}
                            							setWithLastConsumed(current, "unit", lv_unit_7_3, null);
                            						

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
    // InternalSlideOMatic.g:1858:1: entryRuleWay returns [EObject current=null] : iv_ruleWay= ruleWay EOF ;
    public final EObject entryRuleWay() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWay = null;


        try {
            // InternalSlideOMatic.g:1858:44: (iv_ruleWay= ruleWay EOF )
            // InternalSlideOMatic.g:1859:2: iv_ruleWay= ruleWay EOF
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
    // InternalSlideOMatic.g:1865:1: ruleWay returns [EObject current=null] : ( ( () otherlv_1= 'width' ) | ( () otherlv_3= 'height' ) ) ;
    public final EObject ruleWay() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalSlideOMatic.g:1871:2: ( ( ( () otherlv_1= 'width' ) | ( () otherlv_3= 'height' ) ) )
            // InternalSlideOMatic.g:1872:2: ( ( () otherlv_1= 'width' ) | ( () otherlv_3= 'height' ) )
            {
            // InternalSlideOMatic.g:1872:2: ( ( () otherlv_1= 'width' ) | ( () otherlv_3= 'height' ) )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==96) ) {
                alt33=1;
            }
            else if ( (LA33_0==97) ) {
                alt33=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // InternalSlideOMatic.g:1873:3: ( () otherlv_1= 'width' )
                    {
                    // InternalSlideOMatic.g:1873:3: ( () otherlv_1= 'width' )
                    // InternalSlideOMatic.g:1874:4: () otherlv_1= 'width'
                    {
                    // InternalSlideOMatic.g:1874:4: ()
                    // InternalSlideOMatic.g:1875:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getWayAccess().getWidthAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,96,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getWayAccess().getWidthKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSlideOMatic.g:1887:3: ( () otherlv_3= 'height' )
                    {
                    // InternalSlideOMatic.g:1887:3: ( () otherlv_3= 'height' )
                    // InternalSlideOMatic.g:1888:4: () otherlv_3= 'height'
                    {
                    // InternalSlideOMatic.g:1888:4: ()
                    // InternalSlideOMatic.g:1889:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getWayAccess().getHeightAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_3=(Token)match(input,97,FOLLOW_2); 

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
    // InternalSlideOMatic.g:1904:1: entryRuleTable returns [EObject current=null] : iv_ruleTable= ruleTable EOF ;
    public final EObject entryRuleTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTable = null;


        try {
            // InternalSlideOMatic.g:1904:46: (iv_ruleTable= ruleTable EOF )
            // InternalSlideOMatic.g:1905:2: iv_ruleTable= ruleTable EOF
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
    // InternalSlideOMatic.g:1911:1: ruleTable returns [EObject current=null] : (otherlv_0= 'tab' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (lv_rows_3_0= ruleTableRow ) ) (otherlv_4= ',' ( (lv_rows_5_0= ruleTableRow ) ) )* otherlv_6= ']' ) ;
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
            // InternalSlideOMatic.g:1917:2: ( (otherlv_0= 'tab' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (lv_rows_3_0= ruleTableRow ) ) (otherlv_4= ',' ( (lv_rows_5_0= ruleTableRow ) ) )* otherlv_6= ']' ) )
            // InternalSlideOMatic.g:1918:2: (otherlv_0= 'tab' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (lv_rows_3_0= ruleTableRow ) ) (otherlv_4= ',' ( (lv_rows_5_0= ruleTableRow ) ) )* otherlv_6= ']' )
            {
            // InternalSlideOMatic.g:1918:2: (otherlv_0= 'tab' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (lv_rows_3_0= ruleTableRow ) ) (otherlv_4= ',' ( (lv_rows_5_0= ruleTableRow ) ) )* otherlv_6= ']' )
            // InternalSlideOMatic.g:1919:3: otherlv_0= 'tab' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (lv_rows_3_0= ruleTableRow ) ) (otherlv_4= ',' ( (lv_rows_5_0= ruleTableRow ) ) )* otherlv_6= ']'
            {
            otherlv_0=(Token)match(input,98,FOLLOW_28); 

            			newLeafNode(otherlv_0, grammarAccess.getTableAccess().getTabKeyword_0());
            		
            // InternalSlideOMatic.g:1923:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSlideOMatic.g:1924:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSlideOMatic.g:1924:4: (lv_name_1_0= RULE_ID )
            // InternalSlideOMatic.g:1925:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_34); 

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

            otherlv_2=(Token)match(input,99,FOLLOW_34); 

            			newLeafNode(otherlv_2, grammarAccess.getTableAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalSlideOMatic.g:1945:3: ( (lv_rows_3_0= ruleTableRow ) )
            // InternalSlideOMatic.g:1946:4: (lv_rows_3_0= ruleTableRow )
            {
            // InternalSlideOMatic.g:1946:4: (lv_rows_3_0= ruleTableRow )
            // InternalSlideOMatic.g:1947:5: lv_rows_3_0= ruleTableRow
            {

            					newCompositeNode(grammarAccess.getTableAccess().getRowsTableRowParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_35);
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

            // InternalSlideOMatic.g:1964:3: (otherlv_4= ',' ( (lv_rows_5_0= ruleTableRow ) ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==64) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalSlideOMatic.g:1965:4: otherlv_4= ',' ( (lv_rows_5_0= ruleTableRow ) )
            	    {
            	    otherlv_4=(Token)match(input,64,FOLLOW_34); 

            	    				newLeafNode(otherlv_4, grammarAccess.getTableAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalSlideOMatic.g:1969:4: ( (lv_rows_5_0= ruleTableRow ) )
            	    // InternalSlideOMatic.g:1970:5: (lv_rows_5_0= ruleTableRow )
            	    {
            	    // InternalSlideOMatic.g:1970:5: (lv_rows_5_0= ruleTableRow )
            	    // InternalSlideOMatic.g:1971:6: lv_rows_5_0= ruleTableRow
            	    {

            	    						newCompositeNode(grammarAccess.getTableAccess().getRowsTableRowParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_35);
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
            	    break loop34;
                }
            } while (true);

            otherlv_6=(Token)match(input,100,FOLLOW_2); 

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
    // InternalSlideOMatic.g:1997:1: entryRuleTableRow returns [EObject current=null] : iv_ruleTableRow= ruleTableRow EOF ;
    public final EObject entryRuleTableRow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTableRow = null;


        try {
            // InternalSlideOMatic.g:1997:49: (iv_ruleTableRow= ruleTableRow EOF )
            // InternalSlideOMatic.g:1998:2: iv_ruleTableRow= ruleTableRow EOF
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
    // InternalSlideOMatic.g:2004:1: ruleTableRow returns [EObject current=null] : (otherlv_0= '[' ( (lv_values_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_values_3_0= RULE_STRING ) ) )* otherlv_4= ']' ) ;
    public final EObject ruleTableRow() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_values_1_0=null;
        Token otherlv_2=null;
        Token lv_values_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalSlideOMatic.g:2010:2: ( (otherlv_0= '[' ( (lv_values_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_values_3_0= RULE_STRING ) ) )* otherlv_4= ']' ) )
            // InternalSlideOMatic.g:2011:2: (otherlv_0= '[' ( (lv_values_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_values_3_0= RULE_STRING ) ) )* otherlv_4= ']' )
            {
            // InternalSlideOMatic.g:2011:2: (otherlv_0= '[' ( (lv_values_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_values_3_0= RULE_STRING ) ) )* otherlv_4= ']' )
            // InternalSlideOMatic.g:2012:3: otherlv_0= '[' ( (lv_values_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_values_3_0= RULE_STRING ) ) )* otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,99,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTableRowAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalSlideOMatic.g:2016:3: ( (lv_values_1_0= RULE_STRING ) )
            // InternalSlideOMatic.g:2017:4: (lv_values_1_0= RULE_STRING )
            {
            // InternalSlideOMatic.g:2017:4: (lv_values_1_0= RULE_STRING )
            // InternalSlideOMatic.g:2018:5: lv_values_1_0= RULE_STRING
            {
            lv_values_1_0=(Token)match(input,RULE_STRING,FOLLOW_35); 

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

            // InternalSlideOMatic.g:2034:3: (otherlv_2= ',' ( (lv_values_3_0= RULE_STRING ) ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==64) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalSlideOMatic.g:2035:4: otherlv_2= ',' ( (lv_values_3_0= RULE_STRING ) )
            	    {
            	    otherlv_2=(Token)match(input,64,FOLLOW_3); 

            	    				newLeafNode(otherlv_2, grammarAccess.getTableRowAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalSlideOMatic.g:2039:4: ( (lv_values_3_0= RULE_STRING ) )
            	    // InternalSlideOMatic.g:2040:5: (lv_values_3_0= RULE_STRING )
            	    {
            	    // InternalSlideOMatic.g:2040:5: (lv_values_3_0= RULE_STRING )
            	    // InternalSlideOMatic.g:2041:6: lv_values_3_0= RULE_STRING
            	    {
            	    lv_values_3_0=(Token)match(input,RULE_STRING,FOLLOW_35); 

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
            	    break loop35;
                }
            } while (true);

            otherlv_4=(Token)match(input,100,FOLLOW_2); 

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
    // InternalSlideOMatic.g:2066:1: entryRuleCode returns [EObject current=null] : iv_ruleCode= ruleCode EOF ;
    public final EObject entryRuleCode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCode = null;


        try {
            // InternalSlideOMatic.g:2066:45: (iv_ruleCode= ruleCode EOF )
            // InternalSlideOMatic.g:2067:2: iv_ruleCode= ruleCode EOF
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
    // InternalSlideOMatic.g:2073:1: ruleCode returns [EObject current=null] : ( ( () otherlv_1= 'code' ( (lv_lang_2_0= RULE_ID ) ) ( (lv_code_3_0= RULE_STRING ) ) otherlv_4= 'end' ) | ( () otherlv_6= 'filecode' ( (lv_lang_7_0= RULE_ID ) ) ( (lv_src_8_0= RULE_STRING ) ) (otherlv_9= 'show' otherlv_10= '[' ( (lv_lines_11_0= ruleLineSequence ) ) otherlv_12= ']' (otherlv_13= ',' otherlv_14= '[' ( (lv_lines_15_0= ruleLineSequence ) ) otherlv_16= ']' )* )? otherlv_17= 'end' ) ) ;
    public final EObject ruleCode() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_lang_2_0=null;
        Token lv_code_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token lv_lang_7_0=null;
        Token lv_src_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        EObject lv_lines_11_0 = null;

        EObject lv_lines_15_0 = null;



        	enterRule();

        try {
            // InternalSlideOMatic.g:2079:2: ( ( ( () otherlv_1= 'code' ( (lv_lang_2_0= RULE_ID ) ) ( (lv_code_3_0= RULE_STRING ) ) otherlv_4= 'end' ) | ( () otherlv_6= 'filecode' ( (lv_lang_7_0= RULE_ID ) ) ( (lv_src_8_0= RULE_STRING ) ) (otherlv_9= 'show' otherlv_10= '[' ( (lv_lines_11_0= ruleLineSequence ) ) otherlv_12= ']' (otherlv_13= ',' otherlv_14= '[' ( (lv_lines_15_0= ruleLineSequence ) ) otherlv_16= ']' )* )? otherlv_17= 'end' ) ) )
            // InternalSlideOMatic.g:2080:2: ( ( () otherlv_1= 'code' ( (lv_lang_2_0= RULE_ID ) ) ( (lv_code_3_0= RULE_STRING ) ) otherlv_4= 'end' ) | ( () otherlv_6= 'filecode' ( (lv_lang_7_0= RULE_ID ) ) ( (lv_src_8_0= RULE_STRING ) ) (otherlv_9= 'show' otherlv_10= '[' ( (lv_lines_11_0= ruleLineSequence ) ) otherlv_12= ']' (otherlv_13= ',' otherlv_14= '[' ( (lv_lines_15_0= ruleLineSequence ) ) otherlv_16= ']' )* )? otherlv_17= 'end' ) )
            {
            // InternalSlideOMatic.g:2080:2: ( ( () otherlv_1= 'code' ( (lv_lang_2_0= RULE_ID ) ) ( (lv_code_3_0= RULE_STRING ) ) otherlv_4= 'end' ) | ( () otherlv_6= 'filecode' ( (lv_lang_7_0= RULE_ID ) ) ( (lv_src_8_0= RULE_STRING ) ) (otherlv_9= 'show' otherlv_10= '[' ( (lv_lines_11_0= ruleLineSequence ) ) otherlv_12= ']' (otherlv_13= ',' otherlv_14= '[' ( (lv_lines_15_0= ruleLineSequence ) ) otherlv_16= ']' )* )? otherlv_17= 'end' ) )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==101) ) {
                alt38=1;
            }
            else if ( (LA38_0==103) ) {
                alt38=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // InternalSlideOMatic.g:2081:3: ( () otherlv_1= 'code' ( (lv_lang_2_0= RULE_ID ) ) ( (lv_code_3_0= RULE_STRING ) ) otherlv_4= 'end' )
                    {
                    // InternalSlideOMatic.g:2081:3: ( () otherlv_1= 'code' ( (lv_lang_2_0= RULE_ID ) ) ( (lv_code_3_0= RULE_STRING ) ) otherlv_4= 'end' )
                    // InternalSlideOMatic.g:2082:4: () otherlv_1= 'code' ( (lv_lang_2_0= RULE_ID ) ) ( (lv_code_3_0= RULE_STRING ) ) otherlv_4= 'end'
                    {
                    // InternalSlideOMatic.g:2082:4: ()
                    // InternalSlideOMatic.g:2083:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getCodeAccess().getInlineCodeAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,101,FOLLOW_28); 

                    				newLeafNode(otherlv_1, grammarAccess.getCodeAccess().getCodeKeyword_0_1());
                    			
                    // InternalSlideOMatic.g:2093:4: ( (lv_lang_2_0= RULE_ID ) )
                    // InternalSlideOMatic.g:2094:5: (lv_lang_2_0= RULE_ID )
                    {
                    // InternalSlideOMatic.g:2094:5: (lv_lang_2_0= RULE_ID )
                    // InternalSlideOMatic.g:2095:6: lv_lang_2_0= RULE_ID
                    {
                    lv_lang_2_0=(Token)match(input,RULE_ID,FOLLOW_3); 

                    						newLeafNode(lv_lang_2_0, grammarAccess.getCodeAccess().getLangIDTerminalRuleCall_0_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCodeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"lang",
                    							lv_lang_2_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    // InternalSlideOMatic.g:2111:4: ( (lv_code_3_0= RULE_STRING ) )
                    // InternalSlideOMatic.g:2112:5: (lv_code_3_0= RULE_STRING )
                    {
                    // InternalSlideOMatic.g:2112:5: (lv_code_3_0= RULE_STRING )
                    // InternalSlideOMatic.g:2113:6: lv_code_3_0= RULE_STRING
                    {
                    lv_code_3_0=(Token)match(input,RULE_STRING,FOLLOW_36); 

                    						newLeafNode(lv_code_3_0, grammarAccess.getCodeAccess().getCodeSTRINGTerminalRuleCall_0_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCodeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"code",
                    							lv_code_3_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,102,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getCodeAccess().getEndKeyword_0_4());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSlideOMatic.g:2135:3: ( () otherlv_6= 'filecode' ( (lv_lang_7_0= RULE_ID ) ) ( (lv_src_8_0= RULE_STRING ) ) (otherlv_9= 'show' otherlv_10= '[' ( (lv_lines_11_0= ruleLineSequence ) ) otherlv_12= ']' (otherlv_13= ',' otherlv_14= '[' ( (lv_lines_15_0= ruleLineSequence ) ) otherlv_16= ']' )* )? otherlv_17= 'end' )
                    {
                    // InternalSlideOMatic.g:2135:3: ( () otherlv_6= 'filecode' ( (lv_lang_7_0= RULE_ID ) ) ( (lv_src_8_0= RULE_STRING ) ) (otherlv_9= 'show' otherlv_10= '[' ( (lv_lines_11_0= ruleLineSequence ) ) otherlv_12= ']' (otherlv_13= ',' otherlv_14= '[' ( (lv_lines_15_0= ruleLineSequence ) ) otherlv_16= ']' )* )? otherlv_17= 'end' )
                    // InternalSlideOMatic.g:2136:4: () otherlv_6= 'filecode' ( (lv_lang_7_0= RULE_ID ) ) ( (lv_src_8_0= RULE_STRING ) ) (otherlv_9= 'show' otherlv_10= '[' ( (lv_lines_11_0= ruleLineSequence ) ) otherlv_12= ']' (otherlv_13= ',' otherlv_14= '[' ( (lv_lines_15_0= ruleLineSequence ) ) otherlv_16= ']' )* )? otherlv_17= 'end'
                    {
                    // InternalSlideOMatic.g:2136:4: ()
                    // InternalSlideOMatic.g:2137:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getCodeAccess().getFileCodeAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_6=(Token)match(input,103,FOLLOW_28); 

                    				newLeafNode(otherlv_6, grammarAccess.getCodeAccess().getFilecodeKeyword_1_1());
                    			
                    // InternalSlideOMatic.g:2147:4: ( (lv_lang_7_0= RULE_ID ) )
                    // InternalSlideOMatic.g:2148:5: (lv_lang_7_0= RULE_ID )
                    {
                    // InternalSlideOMatic.g:2148:5: (lv_lang_7_0= RULE_ID )
                    // InternalSlideOMatic.g:2149:6: lv_lang_7_0= RULE_ID
                    {
                    lv_lang_7_0=(Token)match(input,RULE_ID,FOLLOW_3); 

                    						newLeafNode(lv_lang_7_0, grammarAccess.getCodeAccess().getLangIDTerminalRuleCall_1_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCodeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"lang",
                    							lv_lang_7_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    // InternalSlideOMatic.g:2165:4: ( (lv_src_8_0= RULE_STRING ) )
                    // InternalSlideOMatic.g:2166:5: (lv_src_8_0= RULE_STRING )
                    {
                    // InternalSlideOMatic.g:2166:5: (lv_src_8_0= RULE_STRING )
                    // InternalSlideOMatic.g:2167:6: lv_src_8_0= RULE_STRING
                    {
                    lv_src_8_0=(Token)match(input,RULE_STRING,FOLLOW_37); 

                    						newLeafNode(lv_src_8_0, grammarAccess.getCodeAccess().getSrcSTRINGTerminalRuleCall_1_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCodeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"src",
                    							lv_src_8_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    // InternalSlideOMatic.g:2183:4: (otherlv_9= 'show' otherlv_10= '[' ( (lv_lines_11_0= ruleLineSequence ) ) otherlv_12= ']' (otherlv_13= ',' otherlv_14= '[' ( (lv_lines_15_0= ruleLineSequence ) ) otherlv_16= ']' )* )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==104) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // InternalSlideOMatic.g:2184:5: otherlv_9= 'show' otherlv_10= '[' ( (lv_lines_11_0= ruleLineSequence ) ) otherlv_12= ']' (otherlv_13= ',' otherlv_14= '[' ( (lv_lines_15_0= ruleLineSequence ) ) otherlv_16= ']' )*
                            {
                            otherlv_9=(Token)match(input,104,FOLLOW_34); 

                            					newLeafNode(otherlv_9, grammarAccess.getCodeAccess().getShowKeyword_1_4_0());
                            				
                            otherlv_10=(Token)match(input,99,FOLLOW_31); 

                            					newLeafNode(otherlv_10, grammarAccess.getCodeAccess().getLeftSquareBracketKeyword_1_4_1());
                            				
                            // InternalSlideOMatic.g:2192:5: ( (lv_lines_11_0= ruleLineSequence ) )
                            // InternalSlideOMatic.g:2193:6: (lv_lines_11_0= ruleLineSequence )
                            {
                            // InternalSlideOMatic.g:2193:6: (lv_lines_11_0= ruleLineSequence )
                            // InternalSlideOMatic.g:2194:7: lv_lines_11_0= ruleLineSequence
                            {

                            							newCompositeNode(grammarAccess.getCodeAccess().getLinesLineSequenceParserRuleCall_1_4_2_0());
                            						
                            pushFollow(FOLLOW_38);
                            lv_lines_11_0=ruleLineSequence();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getCodeRule());
                            							}
                            							add(
                            								current,
                            								"lines",
                            								lv_lines_11_0,
                            								"dk.sdu.mmmi.mdsd.f18.dsl.external.SlideOMatic.LineSequence");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            otherlv_12=(Token)match(input,100,FOLLOW_39); 

                            					newLeafNode(otherlv_12, grammarAccess.getCodeAccess().getRightSquareBracketKeyword_1_4_3());
                            				
                            // InternalSlideOMatic.g:2215:5: (otherlv_13= ',' otherlv_14= '[' ( (lv_lines_15_0= ruleLineSequence ) ) otherlv_16= ']' )*
                            loop36:
                            do {
                                int alt36=2;
                                int LA36_0 = input.LA(1);

                                if ( (LA36_0==64) ) {
                                    alt36=1;
                                }


                                switch (alt36) {
                            	case 1 :
                            	    // InternalSlideOMatic.g:2216:6: otherlv_13= ',' otherlv_14= '[' ( (lv_lines_15_0= ruleLineSequence ) ) otherlv_16= ']'
                            	    {
                            	    otherlv_13=(Token)match(input,64,FOLLOW_34); 

                            	    						newLeafNode(otherlv_13, grammarAccess.getCodeAccess().getCommaKeyword_1_4_4_0());
                            	    					
                            	    otherlv_14=(Token)match(input,99,FOLLOW_31); 

                            	    						newLeafNode(otherlv_14, grammarAccess.getCodeAccess().getLeftSquareBracketKeyword_1_4_4_1());
                            	    					
                            	    // InternalSlideOMatic.g:2224:6: ( (lv_lines_15_0= ruleLineSequence ) )
                            	    // InternalSlideOMatic.g:2225:7: (lv_lines_15_0= ruleLineSequence )
                            	    {
                            	    // InternalSlideOMatic.g:2225:7: (lv_lines_15_0= ruleLineSequence )
                            	    // InternalSlideOMatic.g:2226:8: lv_lines_15_0= ruleLineSequence
                            	    {

                            	    								newCompositeNode(grammarAccess.getCodeAccess().getLinesLineSequenceParserRuleCall_1_4_4_2_0());
                            	    							
                            	    pushFollow(FOLLOW_38);
                            	    lv_lines_15_0=ruleLineSequence();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getCodeRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"lines",
                            	    									lv_lines_15_0,
                            	    									"dk.sdu.mmmi.mdsd.f18.dsl.external.SlideOMatic.LineSequence");
                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }

                            	    otherlv_16=(Token)match(input,100,FOLLOW_39); 

                            	    						newLeafNode(otherlv_16, grammarAccess.getCodeAccess().getRightSquareBracketKeyword_1_4_4_3());
                            	    					

                            	    }
                            	    break;

                            	default :
                            	    break loop36;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_17=(Token)match(input,102,FOLLOW_2); 

                    				newLeafNode(otherlv_17, grammarAccess.getCodeAccess().getEndKeyword_1_5());
                    			

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
    // $ANTLR end "ruleCode"


    // $ANTLR start "entryRuleLineSequence"
    // InternalSlideOMatic.g:2258:1: entryRuleLineSequence returns [EObject current=null] : iv_ruleLineSequence= ruleLineSequence EOF ;
    public final EObject entryRuleLineSequence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLineSequence = null;


        try {
            // InternalSlideOMatic.g:2258:53: (iv_ruleLineSequence= ruleLineSequence EOF )
            // InternalSlideOMatic.g:2259:2: iv_ruleLineSequence= ruleLineSequence EOF
            {
             newCompositeNode(grammarAccess.getLineSequenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLineSequence=ruleLineSequence();

            state._fsp--;

             current =iv_ruleLineSequence; 
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
    // $ANTLR end "entryRuleLineSequence"


    // $ANTLR start "ruleLineSequence"
    // InternalSlideOMatic.g:2265:1: ruleLineSequence returns [EObject current=null] : ( ( (lv_lower_0_0= RULE_INT ) ) (otherlv_1= ':' ( (lv_upper_2_0= RULE_INT ) ) )? (otherlv_3= ',' ( (lv_additional_4_0= ruleLineSequence ) ) )? ) ;
    public final EObject ruleLineSequence() throws RecognitionException {
        EObject current = null;

        Token lv_lower_0_0=null;
        Token otherlv_1=null;
        Token lv_upper_2_0=null;
        Token otherlv_3=null;
        EObject lv_additional_4_0 = null;



        	enterRule();

        try {
            // InternalSlideOMatic.g:2271:2: ( ( ( (lv_lower_0_0= RULE_INT ) ) (otherlv_1= ':' ( (lv_upper_2_0= RULE_INT ) ) )? (otherlv_3= ',' ( (lv_additional_4_0= ruleLineSequence ) ) )? ) )
            // InternalSlideOMatic.g:2272:2: ( ( (lv_lower_0_0= RULE_INT ) ) (otherlv_1= ':' ( (lv_upper_2_0= RULE_INT ) ) )? (otherlv_3= ',' ( (lv_additional_4_0= ruleLineSequence ) ) )? )
            {
            // InternalSlideOMatic.g:2272:2: ( ( (lv_lower_0_0= RULE_INT ) ) (otherlv_1= ':' ( (lv_upper_2_0= RULE_INT ) ) )? (otherlv_3= ',' ( (lv_additional_4_0= ruleLineSequence ) ) )? )
            // InternalSlideOMatic.g:2273:3: ( (lv_lower_0_0= RULE_INT ) ) (otherlv_1= ':' ( (lv_upper_2_0= RULE_INT ) ) )? (otherlv_3= ',' ( (lv_additional_4_0= ruleLineSequence ) ) )?
            {
            // InternalSlideOMatic.g:2273:3: ( (lv_lower_0_0= RULE_INT ) )
            // InternalSlideOMatic.g:2274:4: (lv_lower_0_0= RULE_INT )
            {
            // InternalSlideOMatic.g:2274:4: (lv_lower_0_0= RULE_INT )
            // InternalSlideOMatic.g:2275:5: lv_lower_0_0= RULE_INT
            {
            lv_lower_0_0=(Token)match(input,RULE_INT,FOLLOW_40); 

            					newLeafNode(lv_lower_0_0, grammarAccess.getLineSequenceAccess().getLowerINTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLineSequenceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"lower",
            						lv_lower_0_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalSlideOMatic.g:2291:3: (otherlv_1= ':' ( (lv_upper_2_0= RULE_INT ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==105) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalSlideOMatic.g:2292:4: otherlv_1= ':' ( (lv_upper_2_0= RULE_INT ) )
                    {
                    otherlv_1=(Token)match(input,105,FOLLOW_31); 

                    				newLeafNode(otherlv_1, grammarAccess.getLineSequenceAccess().getColonKeyword_1_0());
                    			
                    // InternalSlideOMatic.g:2296:4: ( (lv_upper_2_0= RULE_INT ) )
                    // InternalSlideOMatic.g:2297:5: (lv_upper_2_0= RULE_INT )
                    {
                    // InternalSlideOMatic.g:2297:5: (lv_upper_2_0= RULE_INT )
                    // InternalSlideOMatic.g:2298:6: lv_upper_2_0= RULE_INT
                    {
                    lv_upper_2_0=(Token)match(input,RULE_INT,FOLLOW_16); 

                    						newLeafNode(lv_upper_2_0, grammarAccess.getLineSequenceAccess().getUpperINTTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLineSequenceRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"upper",
                    							lv_upper_2_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSlideOMatic.g:2315:3: (otherlv_3= ',' ( (lv_additional_4_0= ruleLineSequence ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==64) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalSlideOMatic.g:2316:4: otherlv_3= ',' ( (lv_additional_4_0= ruleLineSequence ) )
                    {
                    otherlv_3=(Token)match(input,64,FOLLOW_31); 

                    				newLeafNode(otherlv_3, grammarAccess.getLineSequenceAccess().getCommaKeyword_2_0());
                    			
                    // InternalSlideOMatic.g:2320:4: ( (lv_additional_4_0= ruleLineSequence ) )
                    // InternalSlideOMatic.g:2321:5: (lv_additional_4_0= ruleLineSequence )
                    {
                    // InternalSlideOMatic.g:2321:5: (lv_additional_4_0= ruleLineSequence )
                    // InternalSlideOMatic.g:2322:6: lv_additional_4_0= ruleLineSequence
                    {

                    						newCompositeNode(grammarAccess.getLineSequenceAccess().getAdditionalLineSequenceParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_additional_4_0=ruleLineSequence();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLineSequenceRule());
                    						}
                    						set(
                    							current,
                    							"additional",
                    							lv_additional_4_0,
                    							"dk.sdu.mmmi.mdsd.f18.dsl.external.SlideOMatic.LineSequence");
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
    // $ANTLR end "ruleLineSequence"


    // $ANTLR start "entryRuleClick"
    // InternalSlideOMatic.g:2344:1: entryRuleClick returns [String current=null] : iv_ruleClick= ruleClick EOF ;
    public final String entryRuleClick() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleClick = null;


        try {
            // InternalSlideOMatic.g:2344:45: (iv_ruleClick= ruleClick EOF )
            // InternalSlideOMatic.g:2345:2: iv_ruleClick= ruleClick EOF
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
    // InternalSlideOMatic.g:2351:1: ruleClick returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '$$' ;
    public final AntlrDatatypeRuleToken ruleClick() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSlideOMatic.g:2357:2: (kw= '$$' )
            // InternalSlideOMatic.g:2358:2: kw= '$$'
            {
            kw=(Token)match(input,106,FOLLOW_2); 

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


    // $ANTLR start "entryRuleMathExp"
    // InternalSlideOMatic.g:2366:1: entryRuleMathExp returns [EObject current=null] : iv_ruleMathExp= ruleMathExp EOF ;
    public final EObject entryRuleMathExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMathExp = null;


        try {
            // InternalSlideOMatic.g:2366:48: (iv_ruleMathExp= ruleMathExp EOF )
            // InternalSlideOMatic.g:2367:2: iv_ruleMathExp= ruleMathExp EOF
            {
             newCompositeNode(grammarAccess.getMathExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMathExp=ruleMathExp();

            state._fsp--;

             current =iv_ruleMathExp; 
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
    // $ANTLR end "entryRuleMathExp"


    // $ANTLR start "ruleMathExp"
    // InternalSlideOMatic.g:2373:1: ruleMathExp returns [EObject current=null] : (otherlv_0= 'math' ( (lv_eval_1_0= 'eval' ) )? ( (lv_exp_2_0= ruleExp ) ) ) ;
    public final EObject ruleMathExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_eval_1_0=null;
        EObject lv_exp_2_0 = null;



        	enterRule();

        try {
            // InternalSlideOMatic.g:2379:2: ( (otherlv_0= 'math' ( (lv_eval_1_0= 'eval' ) )? ( (lv_exp_2_0= ruleExp ) ) ) )
            // InternalSlideOMatic.g:2380:2: (otherlv_0= 'math' ( (lv_eval_1_0= 'eval' ) )? ( (lv_exp_2_0= ruleExp ) ) )
            {
            // InternalSlideOMatic.g:2380:2: (otherlv_0= 'math' ( (lv_eval_1_0= 'eval' ) )? ( (lv_exp_2_0= ruleExp ) ) )
            // InternalSlideOMatic.g:2381:3: otherlv_0= 'math' ( (lv_eval_1_0= 'eval' ) )? ( (lv_exp_2_0= ruleExp ) )
            {
            otherlv_0=(Token)match(input,107,FOLLOW_41); 

            			newLeafNode(otherlv_0, grammarAccess.getMathExpAccess().getMathKeyword_0());
            		
            // InternalSlideOMatic.g:2385:3: ( (lv_eval_1_0= 'eval' ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==108) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalSlideOMatic.g:2386:4: (lv_eval_1_0= 'eval' )
                    {
                    // InternalSlideOMatic.g:2386:4: (lv_eval_1_0= 'eval' )
                    // InternalSlideOMatic.g:2387:5: lv_eval_1_0= 'eval'
                    {
                    lv_eval_1_0=(Token)match(input,108,FOLLOW_41); 

                    					newLeafNode(lv_eval_1_0, grammarAccess.getMathExpAccess().getEvalEvalKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMathExpRule());
                    					}
                    					setWithLastConsumed(current, "eval", lv_eval_1_0, "eval");
                    				

                    }


                    }
                    break;

            }

            // InternalSlideOMatic.g:2399:3: ( (lv_exp_2_0= ruleExp ) )
            // InternalSlideOMatic.g:2400:4: (lv_exp_2_0= ruleExp )
            {
            // InternalSlideOMatic.g:2400:4: (lv_exp_2_0= ruleExp )
            // InternalSlideOMatic.g:2401:5: lv_exp_2_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getMathExpAccess().getExpExpParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_exp_2_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMathExpRule());
            					}
            					set(
            						current,
            						"exp",
            						lv_exp_2_0,
            						"dk.sdu.mmmi.mdsd.f18.dsl.external.SlideOMatic.Exp");
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
    // $ANTLR end "ruleMathExp"


    // $ANTLR start "entryRuleExp"
    // InternalSlideOMatic.g:2422:1: entryRuleExp returns [EObject current=null] : iv_ruleExp= ruleExp EOF ;
    public final EObject entryRuleExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExp = null;


        try {
            // InternalSlideOMatic.g:2422:44: (iv_ruleExp= ruleExp EOF )
            // InternalSlideOMatic.g:2423:2: iv_ruleExp= ruleExp EOF
            {
             newCompositeNode(grammarAccess.getExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExp=ruleExp();

            state._fsp--;

             current =iv_ruleExp; 
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
    // $ANTLR end "entryRuleExp"


    // $ANTLR start "ruleExp"
    // InternalSlideOMatic.g:2429:1: ruleExp returns [EObject current=null] : (this_Factor_0= ruleFactor ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleFactor ) ) )* ) ;
    public final EObject ruleExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_Factor_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalSlideOMatic.g:2435:2: ( (this_Factor_0= ruleFactor ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleFactor ) ) )* ) )
            // InternalSlideOMatic.g:2436:2: (this_Factor_0= ruleFactor ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleFactor ) ) )* )
            {
            // InternalSlideOMatic.g:2436:2: (this_Factor_0= ruleFactor ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleFactor ) ) )* )
            // InternalSlideOMatic.g:2437:3: this_Factor_0= ruleFactor ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleFactor ) ) )*
            {

            			newCompositeNode(grammarAccess.getExpAccess().getFactorParserRuleCall_0());
            		
            pushFollow(FOLLOW_42);
            this_Factor_0=ruleFactor();

            state._fsp--;


            			current = this_Factor_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalSlideOMatic.g:2445:3: ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleFactor ) ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==80||LA43_0==109) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalSlideOMatic.g:2446:4: ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleFactor ) )
            	    {
            	    // InternalSlideOMatic.g:2446:4: ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) )
            	    int alt42=2;
            	    int LA42_0 = input.LA(1);

            	    if ( (LA42_0==109) ) {
            	        alt42=1;
            	    }
            	    else if ( (LA42_0==80) ) {
            	        alt42=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 42, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt42) {
            	        case 1 :
            	            // InternalSlideOMatic.g:2447:5: (otherlv_1= '+' () )
            	            {
            	            // InternalSlideOMatic.g:2447:5: (otherlv_1= '+' () )
            	            // InternalSlideOMatic.g:2448:6: otherlv_1= '+' ()
            	            {
            	            otherlv_1=(Token)match(input,109,FOLLOW_41); 

            	            						newLeafNode(otherlv_1, grammarAccess.getExpAccess().getPlusSignKeyword_1_0_0_0());
            	            					
            	            // InternalSlideOMatic.g:2452:6: ()
            	            // InternalSlideOMatic.g:2453:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getExpAccess().getPlusLeftAction_1_0_0_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalSlideOMatic.g:2461:5: (otherlv_3= '-' () )
            	            {
            	            // InternalSlideOMatic.g:2461:5: (otherlv_3= '-' () )
            	            // InternalSlideOMatic.g:2462:6: otherlv_3= '-' ()
            	            {
            	            otherlv_3=(Token)match(input,80,FOLLOW_41); 

            	            						newLeafNode(otherlv_3, grammarAccess.getExpAccess().getHyphenMinusKeyword_1_0_1_0());
            	            					
            	            // InternalSlideOMatic.g:2466:6: ()
            	            // InternalSlideOMatic.g:2467:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getExpAccess().getMinusLeftAction_1_0_1_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // InternalSlideOMatic.g:2475:4: ( (lv_right_5_0= ruleFactor ) )
            	    // InternalSlideOMatic.g:2476:5: (lv_right_5_0= ruleFactor )
            	    {
            	    // InternalSlideOMatic.g:2476:5: (lv_right_5_0= ruleFactor )
            	    // InternalSlideOMatic.g:2477:6: lv_right_5_0= ruleFactor
            	    {

            	    						newCompositeNode(grammarAccess.getExpAccess().getRightFactorParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_42);
            	    lv_right_5_0=ruleFactor();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExpRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_5_0,
            	    							"dk.sdu.mmmi.mdsd.f18.dsl.external.SlideOMatic.Factor");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop43;
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
    // $ANTLR end "ruleExp"


    // $ANTLR start "entryRuleFactor"
    // InternalSlideOMatic.g:2499:1: entryRuleFactor returns [EObject current=null] : iv_ruleFactor= ruleFactor EOF ;
    public final EObject entryRuleFactor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFactor = null;


        try {
            // InternalSlideOMatic.g:2499:47: (iv_ruleFactor= ruleFactor EOF )
            // InternalSlideOMatic.g:2500:2: iv_ruleFactor= ruleFactor EOF
            {
             newCompositeNode(grammarAccess.getFactorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFactor=ruleFactor();

            state._fsp--;

             current =iv_ruleFactor; 
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
    // $ANTLR end "entryRuleFactor"


    // $ANTLR start "ruleFactor"
    // InternalSlideOMatic.g:2506:1: ruleFactor returns [EObject current=null] : (this_Pow_0= rulePow ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= rulePow ) ) )* ) ;
    public final EObject ruleFactor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_Pow_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalSlideOMatic.g:2512:2: ( (this_Pow_0= rulePow ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= rulePow ) ) )* ) )
            // InternalSlideOMatic.g:2513:2: (this_Pow_0= rulePow ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= rulePow ) ) )* )
            {
            // InternalSlideOMatic.g:2513:2: (this_Pow_0= rulePow ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= rulePow ) ) )* )
            // InternalSlideOMatic.g:2514:3: this_Pow_0= rulePow ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= rulePow ) ) )*
            {

            			newCompositeNode(grammarAccess.getFactorAccess().getPowParserRuleCall_0());
            		
            pushFollow(FOLLOW_43);
            this_Pow_0=rulePow();

            state._fsp--;


            			current = this_Pow_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalSlideOMatic.g:2522:3: ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= rulePow ) ) )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==67||LA45_0==110) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalSlideOMatic.g:2523:4: ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= rulePow ) )
            	    {
            	    // InternalSlideOMatic.g:2523:4: ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) )
            	    int alt44=2;
            	    int LA44_0 = input.LA(1);

            	    if ( (LA44_0==67) ) {
            	        alt44=1;
            	    }
            	    else if ( (LA44_0==110) ) {
            	        alt44=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 44, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt44) {
            	        case 1 :
            	            // InternalSlideOMatic.g:2524:5: (otherlv_1= '*' () )
            	            {
            	            // InternalSlideOMatic.g:2524:5: (otherlv_1= '*' () )
            	            // InternalSlideOMatic.g:2525:6: otherlv_1= '*' ()
            	            {
            	            otherlv_1=(Token)match(input,67,FOLLOW_41); 

            	            						newLeafNode(otherlv_1, grammarAccess.getFactorAccess().getAsteriskKeyword_1_0_0_0());
            	            					
            	            // InternalSlideOMatic.g:2529:6: ()
            	            // InternalSlideOMatic.g:2530:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getFactorAccess().getMultLeftAction_1_0_0_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalSlideOMatic.g:2538:5: (otherlv_3= '/' () )
            	            {
            	            // InternalSlideOMatic.g:2538:5: (otherlv_3= '/' () )
            	            // InternalSlideOMatic.g:2539:6: otherlv_3= '/' ()
            	            {
            	            otherlv_3=(Token)match(input,110,FOLLOW_41); 

            	            						newLeafNode(otherlv_3, grammarAccess.getFactorAccess().getSolidusKeyword_1_0_1_0());
            	            					
            	            // InternalSlideOMatic.g:2543:6: ()
            	            // InternalSlideOMatic.g:2544:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getFactorAccess().getDivLeftAction_1_0_1_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // InternalSlideOMatic.g:2552:4: ( (lv_right_5_0= rulePow ) )
            	    // InternalSlideOMatic.g:2553:5: (lv_right_5_0= rulePow )
            	    {
            	    // InternalSlideOMatic.g:2553:5: (lv_right_5_0= rulePow )
            	    // InternalSlideOMatic.g:2554:6: lv_right_5_0= rulePow
            	    {

            	    						newCompositeNode(grammarAccess.getFactorAccess().getRightPowParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_43);
            	    lv_right_5_0=rulePow();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFactorRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_5_0,
            	    							"dk.sdu.mmmi.mdsd.f18.dsl.external.SlideOMatic.Pow");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop45;
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
    // $ANTLR end "ruleFactor"


    // $ANTLR start "entryRulePow"
    // InternalSlideOMatic.g:2576:1: entryRulePow returns [EObject current=null] : iv_rulePow= rulePow EOF ;
    public final EObject entryRulePow() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePow = null;


        try {
            // InternalSlideOMatic.g:2576:44: (iv_rulePow= rulePow EOF )
            // InternalSlideOMatic.g:2577:2: iv_rulePow= rulePow EOF
            {
             newCompositeNode(grammarAccess.getPowRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePow=rulePow();

            state._fsp--;

             current =iv_rulePow; 
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
    // $ANTLR end "entryRulePow"


    // $ANTLR start "rulePow"
    // InternalSlideOMatic.g:2583:1: rulePow returns [EObject current=null] : (this_Primary_0= rulePrimary ( () otherlv_2= '^' ( (lv_right_3_0= rulePrimary ) ) )? ) ;
    public final EObject rulePow() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Primary_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalSlideOMatic.g:2589:2: ( (this_Primary_0= rulePrimary ( () otherlv_2= '^' ( (lv_right_3_0= rulePrimary ) ) )? ) )
            // InternalSlideOMatic.g:2590:2: (this_Primary_0= rulePrimary ( () otherlv_2= '^' ( (lv_right_3_0= rulePrimary ) ) )? )
            {
            // InternalSlideOMatic.g:2590:2: (this_Primary_0= rulePrimary ( () otherlv_2= '^' ( (lv_right_3_0= rulePrimary ) ) )? )
            // InternalSlideOMatic.g:2591:3: this_Primary_0= rulePrimary ( () otherlv_2= '^' ( (lv_right_3_0= rulePrimary ) ) )?
            {

            			newCompositeNode(grammarAccess.getPowAccess().getPrimaryParserRuleCall_0());
            		
            pushFollow(FOLLOW_44);
            this_Primary_0=rulePrimary();

            state._fsp--;


            			current = this_Primary_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalSlideOMatic.g:2599:3: ( () otherlv_2= '^' ( (lv_right_3_0= rulePrimary ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==111) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalSlideOMatic.g:2600:4: () otherlv_2= '^' ( (lv_right_3_0= rulePrimary ) )
                    {
                    // InternalSlideOMatic.g:2600:4: ()
                    // InternalSlideOMatic.g:2601:5: 
                    {

                    					current = forceCreateModelElementAndSet(
                    						grammarAccess.getPowAccess().getPowLeftAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_2=(Token)match(input,111,FOLLOW_41); 

                    				newLeafNode(otherlv_2, grammarAccess.getPowAccess().getCircumflexAccentKeyword_1_1());
                    			
                    // InternalSlideOMatic.g:2611:4: ( (lv_right_3_0= rulePrimary ) )
                    // InternalSlideOMatic.g:2612:5: (lv_right_3_0= rulePrimary )
                    {
                    // InternalSlideOMatic.g:2612:5: (lv_right_3_0= rulePrimary )
                    // InternalSlideOMatic.g:2613:6: lv_right_3_0= rulePrimary
                    {

                    						newCompositeNode(grammarAccess.getPowAccess().getRightPrimaryParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_right_3_0=rulePrimary();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPowRule());
                    						}
                    						set(
                    							current,
                    							"right",
                    							lv_right_3_0,
                    							"dk.sdu.mmmi.mdsd.f18.dsl.external.SlideOMatic.Primary");
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
    // $ANTLR end "rulePow"


    // $ANTLR start "entryRulePrimary"
    // InternalSlideOMatic.g:2635:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalSlideOMatic.g:2635:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalSlideOMatic.g:2636:2: iv_rulePrimary= rulePrimary EOF
            {
             newCompositeNode(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimary=rulePrimary();

            state._fsp--;

             current =iv_rulePrimary; 
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
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalSlideOMatic.g:2642:1: rulePrimary returns [EObject current=null] : (this_Number_0= ruleNumber | this_Parenthesis_1= ruleParenthesis | this_VariableBinding_2= ruleVariableBinding | this_VariableUse_3= ruleVariableUse ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        EObject this_Number_0 = null;

        EObject this_Parenthesis_1 = null;

        EObject this_VariableBinding_2 = null;

        EObject this_VariableUse_3 = null;



        	enterRule();

        try {
            // InternalSlideOMatic.g:2648:2: ( (this_Number_0= ruleNumber | this_Parenthesis_1= ruleParenthesis | this_VariableBinding_2= ruleVariableBinding | this_VariableUse_3= ruleVariableUse ) )
            // InternalSlideOMatic.g:2649:2: (this_Number_0= ruleNumber | this_Parenthesis_1= ruleParenthesis | this_VariableBinding_2= ruleVariableBinding | this_VariableUse_3= ruleVariableUse )
            {
            // InternalSlideOMatic.g:2649:2: (this_Number_0= ruleNumber | this_Parenthesis_1= ruleParenthesis | this_VariableBinding_2= ruleVariableBinding | this_VariableUse_3= ruleVariableUse )
            int alt47=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt47=1;
                }
                break;
            case 13:
                {
                alt47=2;
                }
                break;
            case 112:
                {
                alt47=3;
                }
                break;
            case RULE_ID:
                {
                alt47=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }

            switch (alt47) {
                case 1 :
                    // InternalSlideOMatic.g:2650:3: this_Number_0= ruleNumber
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getNumberParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Number_0=ruleNumber();

                    state._fsp--;


                    			current = this_Number_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSlideOMatic.g:2659:3: this_Parenthesis_1= ruleParenthesis
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getParenthesisParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Parenthesis_1=ruleParenthesis();

                    state._fsp--;


                    			current = this_Parenthesis_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSlideOMatic.g:2668:3: this_VariableBinding_2= ruleVariableBinding
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getVariableBindingParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_VariableBinding_2=ruleVariableBinding();

                    state._fsp--;


                    			current = this_VariableBinding_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalSlideOMatic.g:2677:3: this_VariableUse_3= ruleVariableUse
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getVariableUseParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_VariableUse_3=ruleVariableUse();

                    state._fsp--;


                    			current = this_VariableUse_3;
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
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleVariableUse"
    // InternalSlideOMatic.g:2689:1: entryRuleVariableUse returns [EObject current=null] : iv_ruleVariableUse= ruleVariableUse EOF ;
    public final EObject entryRuleVariableUse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableUse = null;


        try {
            // InternalSlideOMatic.g:2689:52: (iv_ruleVariableUse= ruleVariableUse EOF )
            // InternalSlideOMatic.g:2690:2: iv_ruleVariableUse= ruleVariableUse EOF
            {
             newCompositeNode(grammarAccess.getVariableUseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariableUse=ruleVariableUse();

            state._fsp--;

             current =iv_ruleVariableUse; 
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
    // $ANTLR end "entryRuleVariableUse"


    // $ANTLR start "ruleVariableUse"
    // InternalSlideOMatic.g:2696:1: ruleVariableUse returns [EObject current=null] : ( () ( (lv_id_1_0= RULE_ID ) ) ) ;
    public final EObject ruleVariableUse() throws RecognitionException {
        EObject current = null;

        Token lv_id_1_0=null;


        	enterRule();

        try {
            // InternalSlideOMatic.g:2702:2: ( ( () ( (lv_id_1_0= RULE_ID ) ) ) )
            // InternalSlideOMatic.g:2703:2: ( () ( (lv_id_1_0= RULE_ID ) ) )
            {
            // InternalSlideOMatic.g:2703:2: ( () ( (lv_id_1_0= RULE_ID ) ) )
            // InternalSlideOMatic.g:2704:3: () ( (lv_id_1_0= RULE_ID ) )
            {
            // InternalSlideOMatic.g:2704:3: ()
            // InternalSlideOMatic.g:2705:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVariableUseAccess().getVarAction_0(),
            					current);
            			

            }

            // InternalSlideOMatic.g:2711:3: ( (lv_id_1_0= RULE_ID ) )
            // InternalSlideOMatic.g:2712:4: (lv_id_1_0= RULE_ID )
            {
            // InternalSlideOMatic.g:2712:4: (lv_id_1_0= RULE_ID )
            // InternalSlideOMatic.g:2713:5: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_id_1_0, grammarAccess.getVariableUseAccess().getIdIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableUseRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "ruleVariableUse"


    // $ANTLR start "entryRuleVariableBinding"
    // InternalSlideOMatic.g:2733:1: entryRuleVariableBinding returns [EObject current=null] : iv_ruleVariableBinding= ruleVariableBinding EOF ;
    public final EObject entryRuleVariableBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableBinding = null;


        try {
            // InternalSlideOMatic.g:2733:56: (iv_ruleVariableBinding= ruleVariableBinding EOF )
            // InternalSlideOMatic.g:2734:2: iv_ruleVariableBinding= ruleVariableBinding EOF
            {
             newCompositeNode(grammarAccess.getVariableBindingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariableBinding=ruleVariableBinding();

            state._fsp--;

             current =iv_ruleVariableBinding; 
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
    // $ANTLR end "entryRuleVariableBinding"


    // $ANTLR start "ruleVariableBinding"
    // InternalSlideOMatic.g:2740:1: ruleVariableBinding returns [EObject current=null] : ( () otherlv_1= 'let' ( (lv_id_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_binding_4_0= ruleExp ) ) otherlv_5= 'in' ( (lv_body_6_0= ruleExp ) ) otherlv_7= 'end' ) ;
    public final EObject ruleVariableBinding() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_id_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_binding_4_0 = null;

        EObject lv_body_6_0 = null;



        	enterRule();

        try {
            // InternalSlideOMatic.g:2746:2: ( ( () otherlv_1= 'let' ( (lv_id_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_binding_4_0= ruleExp ) ) otherlv_5= 'in' ( (lv_body_6_0= ruleExp ) ) otherlv_7= 'end' ) )
            // InternalSlideOMatic.g:2747:2: ( () otherlv_1= 'let' ( (lv_id_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_binding_4_0= ruleExp ) ) otherlv_5= 'in' ( (lv_body_6_0= ruleExp ) ) otherlv_7= 'end' )
            {
            // InternalSlideOMatic.g:2747:2: ( () otherlv_1= 'let' ( (lv_id_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_binding_4_0= ruleExp ) ) otherlv_5= 'in' ( (lv_body_6_0= ruleExp ) ) otherlv_7= 'end' )
            // InternalSlideOMatic.g:2748:3: () otherlv_1= 'let' ( (lv_id_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_binding_4_0= ruleExp ) ) otherlv_5= 'in' ( (lv_body_6_0= ruleExp ) ) otherlv_7= 'end'
            {
            // InternalSlideOMatic.g:2748:3: ()
            // InternalSlideOMatic.g:2749:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVariableBindingAccess().getLetAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,112,FOLLOW_28); 

            			newLeafNode(otherlv_1, grammarAccess.getVariableBindingAccess().getLetKeyword_1());
            		
            // InternalSlideOMatic.g:2759:3: ( (lv_id_2_0= RULE_ID ) )
            // InternalSlideOMatic.g:2760:4: (lv_id_2_0= RULE_ID )
            {
            // InternalSlideOMatic.g:2760:4: (lv_id_2_0= RULE_ID )
            // InternalSlideOMatic.g:2761:5: lv_id_2_0= RULE_ID
            {
            lv_id_2_0=(Token)match(input,RULE_ID,FOLLOW_45); 

            					newLeafNode(lv_id_2_0, grammarAccess.getVariableBindingAccess().getIdIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableBindingRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,113,FOLLOW_41); 

            			newLeafNode(otherlv_3, grammarAccess.getVariableBindingAccess().getEqualsSignKeyword_3());
            		
            // InternalSlideOMatic.g:2781:3: ( (lv_binding_4_0= ruleExp ) )
            // InternalSlideOMatic.g:2782:4: (lv_binding_4_0= ruleExp )
            {
            // InternalSlideOMatic.g:2782:4: (lv_binding_4_0= ruleExp )
            // InternalSlideOMatic.g:2783:5: lv_binding_4_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getVariableBindingAccess().getBindingExpParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_46);
            lv_binding_4_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariableBindingRule());
            					}
            					set(
            						current,
            						"binding",
            						lv_binding_4_0,
            						"dk.sdu.mmmi.mdsd.f18.dsl.external.SlideOMatic.Exp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,114,FOLLOW_41); 

            			newLeafNode(otherlv_5, grammarAccess.getVariableBindingAccess().getInKeyword_5());
            		
            // InternalSlideOMatic.g:2804:3: ( (lv_body_6_0= ruleExp ) )
            // InternalSlideOMatic.g:2805:4: (lv_body_6_0= ruleExp )
            {
            // InternalSlideOMatic.g:2805:4: (lv_body_6_0= ruleExp )
            // InternalSlideOMatic.g:2806:5: lv_body_6_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getVariableBindingAccess().getBodyExpParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_36);
            lv_body_6_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariableBindingRule());
            					}
            					set(
            						current,
            						"body",
            						lv_body_6_0,
            						"dk.sdu.mmmi.mdsd.f18.dsl.external.SlideOMatic.Exp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,102,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getVariableBindingAccess().getEndKeyword_7());
            		

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
    // $ANTLR end "ruleVariableBinding"


    // $ANTLR start "entryRuleParenthesis"
    // InternalSlideOMatic.g:2831:1: entryRuleParenthesis returns [EObject current=null] : iv_ruleParenthesis= ruleParenthesis EOF ;
    public final EObject entryRuleParenthesis() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParenthesis = null;


        try {
            // InternalSlideOMatic.g:2831:52: (iv_ruleParenthesis= ruleParenthesis EOF )
            // InternalSlideOMatic.g:2832:2: iv_ruleParenthesis= ruleParenthesis EOF
            {
             newCompositeNode(grammarAccess.getParenthesisRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParenthesis=ruleParenthesis();

            state._fsp--;

             current =iv_ruleParenthesis; 
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
    // $ANTLR end "entryRuleParenthesis"


    // $ANTLR start "ruleParenthesis"
    // InternalSlideOMatic.g:2838:1: ruleParenthesis returns [EObject current=null] : (otherlv_0= '(' this_Exp_1= ruleExp otherlv_2= ')' ) ;
    public final EObject ruleParenthesis() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Exp_1 = null;



        	enterRule();

        try {
            // InternalSlideOMatic.g:2844:2: ( (otherlv_0= '(' this_Exp_1= ruleExp otherlv_2= ')' ) )
            // InternalSlideOMatic.g:2845:2: (otherlv_0= '(' this_Exp_1= ruleExp otherlv_2= ')' )
            {
            // InternalSlideOMatic.g:2845:2: (otherlv_0= '(' this_Exp_1= ruleExp otherlv_2= ')' )
            // InternalSlideOMatic.g:2846:3: otherlv_0= '(' this_Exp_1= ruleExp otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_41); 

            			newLeafNode(otherlv_0, grammarAccess.getParenthesisAccess().getLeftParenthesisKeyword_0());
            		

            			newCompositeNode(grammarAccess.getParenthesisAccess().getExpParserRuleCall_1());
            		
            pushFollow(FOLLOW_11);
            this_Exp_1=ruleExp();

            state._fsp--;


            			current = this_Exp_1;
            			afterParserOrEnumRuleCall();
            		
            otherlv_2=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getParenthesisAccess().getRightParenthesisKeyword_2());
            		

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
    // $ANTLR end "ruleParenthesis"


    // $ANTLR start "entryRuleNumber"
    // InternalSlideOMatic.g:2866:1: entryRuleNumber returns [EObject current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final EObject entryRuleNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumber = null;


        try {
            // InternalSlideOMatic.g:2866:47: (iv_ruleNumber= ruleNumber EOF )
            // InternalSlideOMatic.g:2867:2: iv_ruleNumber= ruleNumber EOF
            {
             newCompositeNode(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumber=ruleNumber();

            state._fsp--;

             current =iv_ruleNumber; 
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
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // InternalSlideOMatic.g:2873:1: ruleNumber returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleNumber() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalSlideOMatic.g:2879:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) )
            // InternalSlideOMatic.g:2880:2: ( () ( (lv_value_1_0= RULE_INT ) ) )
            {
            // InternalSlideOMatic.g:2880:2: ( () ( (lv_value_1_0= RULE_INT ) ) )
            // InternalSlideOMatic.g:2881:3: () ( (lv_value_1_0= RULE_INT ) )
            {
            // InternalSlideOMatic.g:2881:3: ()
            // InternalSlideOMatic.g:2882:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNumberAccess().getNumAction_0(),
            					current);
            			

            }

            // InternalSlideOMatic.g:2888:3: ( (lv_value_1_0= RULE_INT ) )
            // InternalSlideOMatic.g:2889:4: (lv_value_1_0= RULE_INT )
            {
            // InternalSlideOMatic.g:2889:4: (lv_value_1_0= RULE_INT )
            // InternalSlideOMatic.g:2890:5: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_value_1_0, grammarAccess.getNumberAccess().getValueINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNumberRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

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
    // $ANTLR end "ruleNumber"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000A000L,0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0xC000000000014000L,0x0000000000000006L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0xC000000000004000L,0x0000000000000006L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004000L,0x0000000000000006L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000004000L,0x0000000000000004L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00003FFFFFFC0000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x3FFFC00010000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000008L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000001010L,0x0000000000000068L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000010L,0x000008A40002FF80L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000008010L,0x000008A40002FF80L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000002L,0x0000040000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000010L,0x0000000000001F00L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000002002L,0x0000040000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000000L,0x000000000000C000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000000L,0x000000030FF80000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000000L,0x00000000E0000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000001L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000000L,0x0000014000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000001L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000002L,0x0000020000000001L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000002060L,0x0001100000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000002L,0x0000200000010000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000002L,0x0000400000000008L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000002L,0x0000800000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});

}