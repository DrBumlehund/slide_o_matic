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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'presentation'", "'{'", "'('", "')'", "'}'", "'theme'", "'color'", "'AnnArbor'", "'Antibes'", "'Bergen'", "'Berkeley'", "'Berlin'", "'Boadilla'", "'boxes'", "'CambridgeUS'", "'Copenhagen'", "'Darmstadt'", "'default'", "'Dresden'", "'Frankfurt'", "'Goettingen'", "'Hannover'", "'Ilmanau'", "'JuanLesPins'", "'Luebeck'", "'Madrid'", "'Malmoe'", "'Marburg'", "'Montpellier'", "'PaloAlto'", "'Pittsburgh'", "'Rochester'", "'Singapore'", "'Szeged'", "'Warsaw'", "'albatros'", "'beaver'", "'beetle'", "'crane'", "'dolphin'", "'dove'", "'fly'", "'lily'", "'orchid'", "'rose'", "'seagull'", "'seahorse'", "'sidebartab'", "'structure'", "'whale'", "'wolverine'", "'author'", "'authors'", "','", "'institute'", "'date'", "'*'", "'slide'", "'**'", "'***'", "'ToC'", "'b'", "'i'", "'u'", "'fnote'", "'url'", "'block'", "'#list'", "'&list'", "'-'", "'img'", "'src'", "'showimg'", "'left'", "'center'", "'right'", "'%'", "'cm'", "'em'", "'mm'", "'width'", "'height'", "'tab'", "'['", "']'", "'code'", "'end'", "'filecode'", "'show'", "':'", "'$$'", "'animate'", "'from'", "'to'", "'via'", "'math'", "'eval'", "'+'", "'/'", "'^'", "'let'", "'='", "'in'"
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
    // InternalSlideOMatic.g:71:1: rulePresentation returns [EObject current=null] : (otherlv_0= 'presentation' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_subtitle_2_0= RULE_STRING ) )? otherlv_3= '{' (otherlv_4= '(' ( (lv_theme_5_0= ruleTheme ) )? ( (lv_authors_6_0= ruleAuthors ) )? ( (lv_institute_7_0= ruleInstitute ) )? ( (lv_date_8_0= ruleDate ) )? otherlv_9= ')' )? ( ( (lv_slides_10_0= ruleSlide ) ) | ( (lv_images_11_0= ruleImage ) ) )* otherlv_12= '}' ) ;
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

        EObject lv_images_11_0 = null;



        	enterRule();

        try {
            // InternalSlideOMatic.g:77:2: ( (otherlv_0= 'presentation' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_subtitle_2_0= RULE_STRING ) )? otherlv_3= '{' (otherlv_4= '(' ( (lv_theme_5_0= ruleTheme ) )? ( (lv_authors_6_0= ruleAuthors ) )? ( (lv_institute_7_0= ruleInstitute ) )? ( (lv_date_8_0= ruleDate ) )? otherlv_9= ')' )? ( ( (lv_slides_10_0= ruleSlide ) ) | ( (lv_images_11_0= ruleImage ) ) )* otherlv_12= '}' ) )
            // InternalSlideOMatic.g:78:2: (otherlv_0= 'presentation' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_subtitle_2_0= RULE_STRING ) )? otherlv_3= '{' (otherlv_4= '(' ( (lv_theme_5_0= ruleTheme ) )? ( (lv_authors_6_0= ruleAuthors ) )? ( (lv_institute_7_0= ruleInstitute ) )? ( (lv_date_8_0= ruleDate ) )? otherlv_9= ')' )? ( ( (lv_slides_10_0= ruleSlide ) ) | ( (lv_images_11_0= ruleImage ) ) )* otherlv_12= '}' )
            {
            // InternalSlideOMatic.g:78:2: (otherlv_0= 'presentation' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_subtitle_2_0= RULE_STRING ) )? otherlv_3= '{' (otherlv_4= '(' ( (lv_theme_5_0= ruleTheme ) )? ( (lv_authors_6_0= ruleAuthors ) )? ( (lv_institute_7_0= ruleInstitute ) )? ( (lv_date_8_0= ruleDate ) )? otherlv_9= ')' )? ( ( (lv_slides_10_0= ruleSlide ) ) | ( (lv_images_11_0= ruleImage ) ) )* otherlv_12= '}' )
            // InternalSlideOMatic.g:79:3: otherlv_0= 'presentation' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_subtitle_2_0= RULE_STRING ) )? otherlv_3= '{' (otherlv_4= '(' ( (lv_theme_5_0= ruleTheme ) )? ( (lv_authors_6_0= ruleAuthors ) )? ( (lv_institute_7_0= ruleInstitute ) )? ( (lv_date_8_0= ruleDate ) )? otherlv_9= ')' )? ( ( (lv_slides_10_0= ruleSlide ) ) | ( (lv_images_11_0= ruleImage ) ) )* otherlv_12= '}'
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

            // InternalSlideOMatic.g:209:3: ( ( (lv_slides_10_0= ruleSlide ) ) | ( (lv_images_11_0= ruleImage ) ) )*
            loop7:
            do {
                int alt7=3;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==68) ) {
                    alt7=1;
                }
                else if ( (LA7_0==81) ) {
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
            	    // InternalSlideOMatic.g:230:4: ( (lv_images_11_0= ruleImage ) )
            	    {
            	    // InternalSlideOMatic.g:230:4: ( (lv_images_11_0= ruleImage ) )
            	    // InternalSlideOMatic.g:231:5: (lv_images_11_0= ruleImage )
            	    {
            	    // InternalSlideOMatic.g:231:5: (lv_images_11_0= ruleImage )
            	    // InternalSlideOMatic.g:232:6: lv_images_11_0= ruleImage
            	    {

            	    						newCompositeNode(grammarAccess.getPresentationAccess().getImagesImageParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_images_11_0=ruleImage();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPresentationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"images",
            	    							lv_images_11_0,
            	    							"dk.sdu.mmmi.mdsd.f18.dsl.external.SlideOMatic.Image");
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

                if ( (LA15_0==RULE_STRING||(LA15_0>=71 && LA15_0<=79)||LA15_0==83||LA15_0==93||LA15_0==96||LA15_0==98||LA15_0==102||LA15_0==106) ) {
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
    // InternalSlideOMatic.g:978:1: ruleContent returns [EObject current=null] : ( (this_ToC_0= ruleToC | this_Text_1= ruleText | this_Block_2= ruleBlock | this_List_3= ruleList | this_ShowImage_4= ruleShowImage | this_Table_5= ruleTable | this_Code_6= ruleCode | this_MathExp_7= ruleMathExp | this_Animation_8= ruleAnimation ) ( (lv_click_9_0= ruleClick ) )? ) ;
    public final EObject ruleContent() throws RecognitionException {
        EObject current = null;

        EObject this_ToC_0 = null;

        EObject this_Text_1 = null;

        EObject this_Block_2 = null;

        EObject this_List_3 = null;

        EObject this_ShowImage_4 = null;

        EObject this_Table_5 = null;

        EObject this_Code_6 = null;

        EObject this_MathExp_7 = null;

        EObject this_Animation_8 = null;

        AntlrDatatypeRuleToken lv_click_9_0 = null;



        	enterRule();

        try {
            // InternalSlideOMatic.g:984:2: ( ( (this_ToC_0= ruleToC | this_Text_1= ruleText | this_Block_2= ruleBlock | this_List_3= ruleList | this_ShowImage_4= ruleShowImage | this_Table_5= ruleTable | this_Code_6= ruleCode | this_MathExp_7= ruleMathExp | this_Animation_8= ruleAnimation ) ( (lv_click_9_0= ruleClick ) )? ) )
            // InternalSlideOMatic.g:985:2: ( (this_ToC_0= ruleToC | this_Text_1= ruleText | this_Block_2= ruleBlock | this_List_3= ruleList | this_ShowImage_4= ruleShowImage | this_Table_5= ruleTable | this_Code_6= ruleCode | this_MathExp_7= ruleMathExp | this_Animation_8= ruleAnimation ) ( (lv_click_9_0= ruleClick ) )? )
            {
            // InternalSlideOMatic.g:985:2: ( (this_ToC_0= ruleToC | this_Text_1= ruleText | this_Block_2= ruleBlock | this_List_3= ruleList | this_ShowImage_4= ruleShowImage | this_Table_5= ruleTable | this_Code_6= ruleCode | this_MathExp_7= ruleMathExp | this_Animation_8= ruleAnimation ) ( (lv_click_9_0= ruleClick ) )? )
            // InternalSlideOMatic.g:986:3: (this_ToC_0= ruleToC | this_Text_1= ruleText | this_Block_2= ruleBlock | this_List_3= ruleList | this_ShowImage_4= ruleShowImage | this_Table_5= ruleTable | this_Code_6= ruleCode | this_MathExp_7= ruleMathExp | this_Animation_8= ruleAnimation ) ( (lv_click_9_0= ruleClick ) )?
            {
            // InternalSlideOMatic.g:986:3: (this_ToC_0= ruleToC | this_Text_1= ruleText | this_Block_2= ruleBlock | this_List_3= ruleList | this_ShowImage_4= ruleShowImage | this_Table_5= ruleTable | this_Code_6= ruleCode | this_MathExp_7= ruleMathExp | this_Animation_8= ruleAnimation )
            int alt17=9;
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
            case 83:
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
            case 98:
                {
                alt17=7;
                }
                break;
            case 106:
                {
                alt17=8;
                }
                break;
            case 102:
                {
                alt17=9;
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
                    // InternalSlideOMatic.g:1023:4: this_ShowImage_4= ruleShowImage
                    {

                    				newCompositeNode(grammarAccess.getContentAccess().getShowImageParserRuleCall_0_4());
                    			
                    pushFollow(FOLLOW_21);
                    this_ShowImage_4=ruleShowImage();

                    state._fsp--;


                    				current = this_ShowImage_4;
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
                case 8 :
                    // InternalSlideOMatic.g:1050:4: this_MathExp_7= ruleMathExp
                    {

                    				newCompositeNode(grammarAccess.getContentAccess().getMathExpParserRuleCall_0_7());
                    			
                    pushFollow(FOLLOW_21);
                    this_MathExp_7=ruleMathExp();

                    state._fsp--;


                    				current = this_MathExp_7;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 9 :
                    // InternalSlideOMatic.g:1059:4: this_Animation_8= ruleAnimation
                    {

                    				newCompositeNode(grammarAccess.getContentAccess().getAnimationParserRuleCall_0_8());
                    			
                    pushFollow(FOLLOW_21);
                    this_Animation_8=ruleAnimation();

                    state._fsp--;


                    				current = this_Animation_8;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalSlideOMatic.g:1068:3: ( (lv_click_9_0= ruleClick ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==101) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalSlideOMatic.g:1069:4: (lv_click_9_0= ruleClick )
                    {
                    // InternalSlideOMatic.g:1069:4: (lv_click_9_0= ruleClick )
                    // InternalSlideOMatic.g:1070:5: lv_click_9_0= ruleClick
                    {

                    					newCompositeNode(grammarAccess.getContentAccess().getClickClickParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_click_9_0=ruleClick();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getContentRule());
                    					}
                    					set(
                    						current,
                    						"click",
                    						lv_click_9_0,
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
    // InternalSlideOMatic.g:1091:1: entryRuleToC returns [EObject current=null] : iv_ruleToC= ruleToC EOF ;
    public final EObject entryRuleToC() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleToC = null;


        try {
            // InternalSlideOMatic.g:1091:44: (iv_ruleToC= ruleToC EOF )
            // InternalSlideOMatic.g:1092:2: iv_ruleToC= ruleToC EOF
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
    // InternalSlideOMatic.g:1098:1: ruleToC returns [EObject current=null] : ( ( () otherlv_1= 'ToC' ) | ( () otherlv_3= 'ToC' otherlv_4= '*' ) ) ;
    public final EObject ruleToC() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalSlideOMatic.g:1104:2: ( ( ( () otherlv_1= 'ToC' ) | ( () otherlv_3= 'ToC' otherlv_4= '*' ) ) )
            // InternalSlideOMatic.g:1105:2: ( ( () otherlv_1= 'ToC' ) | ( () otherlv_3= 'ToC' otherlv_4= '*' ) )
            {
            // InternalSlideOMatic.g:1105:2: ( ( () otherlv_1= 'ToC' ) | ( () otherlv_3= 'ToC' otherlv_4= '*' ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==71) ) {
                int LA19_1 = input.LA(2);

                if ( (LA19_1==67) ) {
                    alt19=2;
                }
                else if ( (LA19_1==EOF||LA19_1==RULE_STRING||LA19_1==15||(LA19_1>=71 && LA19_1<=79)||LA19_1==83||LA19_1==93||LA19_1==96||LA19_1==98||(LA19_1>=101 && LA19_1<=102)||LA19_1==106) ) {
                    alt19=1;
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
                    // InternalSlideOMatic.g:1106:3: ( () otherlv_1= 'ToC' )
                    {
                    // InternalSlideOMatic.g:1106:3: ( () otherlv_1= 'ToC' )
                    // InternalSlideOMatic.g:1107:4: () otherlv_1= 'ToC'
                    {
                    // InternalSlideOMatic.g:1107:4: ()
                    // InternalSlideOMatic.g:1108:5: 
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
                    // InternalSlideOMatic.g:1120:3: ( () otherlv_3= 'ToC' otherlv_4= '*' )
                    {
                    // InternalSlideOMatic.g:1120:3: ( () otherlv_3= 'ToC' otherlv_4= '*' )
                    // InternalSlideOMatic.g:1121:4: () otherlv_3= 'ToC' otherlv_4= '*'
                    {
                    // InternalSlideOMatic.g:1121:4: ()
                    // InternalSlideOMatic.g:1122:5: 
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
    // InternalSlideOMatic.g:1141:1: entryRuleText returns [EObject current=null] : iv_ruleText= ruleText EOF ;
    public final EObject entryRuleText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleText = null;


        try {
            // InternalSlideOMatic.g:1141:45: (iv_ruleText= ruleText EOF )
            // InternalSlideOMatic.g:1142:2: iv_ruleText= ruleText EOF
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
    // InternalSlideOMatic.g:1148:1: ruleText returns [EObject current=null] : ( ( (lv_types_0_0= ruleTextType ) )* ( (lv_text_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleText() throws RecognitionException {
        EObject current = null;

        Token lv_text_1_0=null;
        EObject lv_types_0_0 = null;



        	enterRule();

        try {
            // InternalSlideOMatic.g:1154:2: ( ( ( (lv_types_0_0= ruleTextType ) )* ( (lv_text_1_0= RULE_STRING ) ) ) )
            // InternalSlideOMatic.g:1155:2: ( ( (lv_types_0_0= ruleTextType ) )* ( (lv_text_1_0= RULE_STRING ) ) )
            {
            // InternalSlideOMatic.g:1155:2: ( ( (lv_types_0_0= ruleTextType ) )* ( (lv_text_1_0= RULE_STRING ) ) )
            // InternalSlideOMatic.g:1156:3: ( (lv_types_0_0= ruleTextType ) )* ( (lv_text_1_0= RULE_STRING ) )
            {
            // InternalSlideOMatic.g:1156:3: ( (lv_types_0_0= ruleTextType ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=72 && LA20_0<=76)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalSlideOMatic.g:1157:4: (lv_types_0_0= ruleTextType )
            	    {
            	    // InternalSlideOMatic.g:1157:4: (lv_types_0_0= ruleTextType )
            	    // InternalSlideOMatic.g:1158:5: lv_types_0_0= ruleTextType
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

            // InternalSlideOMatic.g:1175:3: ( (lv_text_1_0= RULE_STRING ) )
            // InternalSlideOMatic.g:1176:4: (lv_text_1_0= RULE_STRING )
            {
            // InternalSlideOMatic.g:1176:4: (lv_text_1_0= RULE_STRING )
            // InternalSlideOMatic.g:1177:5: lv_text_1_0= RULE_STRING
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
    // InternalSlideOMatic.g:1197:1: entryRuleTextType returns [EObject current=null] : iv_ruleTextType= ruleTextType EOF ;
    public final EObject entryRuleTextType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextType = null;


        try {
            // InternalSlideOMatic.g:1197:49: (iv_ruleTextType= ruleTextType EOF )
            // InternalSlideOMatic.g:1198:2: iv_ruleTextType= ruleTextType EOF
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
    // InternalSlideOMatic.g:1204:1: ruleTextType returns [EObject current=null] : ( ( () otherlv_1= 'b' ) | ( () otherlv_3= 'i' ) | ( () otherlv_5= 'u' ) | ( () otherlv_7= 'fnote' ) | ( () otherlv_9= 'url' ) ) ;
    public final EObject ruleTextType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;


        	enterRule();

        try {
            // InternalSlideOMatic.g:1210:2: ( ( ( () otherlv_1= 'b' ) | ( () otherlv_3= 'i' ) | ( () otherlv_5= 'u' ) | ( () otherlv_7= 'fnote' ) | ( () otherlv_9= 'url' ) ) )
            // InternalSlideOMatic.g:1211:2: ( ( () otherlv_1= 'b' ) | ( () otherlv_3= 'i' ) | ( () otherlv_5= 'u' ) | ( () otherlv_7= 'fnote' ) | ( () otherlv_9= 'url' ) )
            {
            // InternalSlideOMatic.g:1211:2: ( ( () otherlv_1= 'b' ) | ( () otherlv_3= 'i' ) | ( () otherlv_5= 'u' ) | ( () otherlv_7= 'fnote' ) | ( () otherlv_9= 'url' ) )
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
                    // InternalSlideOMatic.g:1212:3: ( () otherlv_1= 'b' )
                    {
                    // InternalSlideOMatic.g:1212:3: ( () otherlv_1= 'b' )
                    // InternalSlideOMatic.g:1213:4: () otherlv_1= 'b'
                    {
                    // InternalSlideOMatic.g:1213:4: ()
                    // InternalSlideOMatic.g:1214:5: 
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
                    // InternalSlideOMatic.g:1226:3: ( () otherlv_3= 'i' )
                    {
                    // InternalSlideOMatic.g:1226:3: ( () otherlv_3= 'i' )
                    // InternalSlideOMatic.g:1227:4: () otherlv_3= 'i'
                    {
                    // InternalSlideOMatic.g:1227:4: ()
                    // InternalSlideOMatic.g:1228:5: 
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
                    // InternalSlideOMatic.g:1240:3: ( () otherlv_5= 'u' )
                    {
                    // InternalSlideOMatic.g:1240:3: ( () otherlv_5= 'u' )
                    // InternalSlideOMatic.g:1241:4: () otherlv_5= 'u'
                    {
                    // InternalSlideOMatic.g:1241:4: ()
                    // InternalSlideOMatic.g:1242:5: 
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
                    // InternalSlideOMatic.g:1254:3: ( () otherlv_7= 'fnote' )
                    {
                    // InternalSlideOMatic.g:1254:3: ( () otherlv_7= 'fnote' )
                    // InternalSlideOMatic.g:1255:4: () otherlv_7= 'fnote'
                    {
                    // InternalSlideOMatic.g:1255:4: ()
                    // InternalSlideOMatic.g:1256:5: 
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
                    // InternalSlideOMatic.g:1268:3: ( () otherlv_9= 'url' )
                    {
                    // InternalSlideOMatic.g:1268:3: ( () otherlv_9= 'url' )
                    // InternalSlideOMatic.g:1269:4: () otherlv_9= 'url'
                    {
                    // InternalSlideOMatic.g:1269:4: ()
                    // InternalSlideOMatic.g:1270:5: 
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
    // InternalSlideOMatic.g:1285:1: entryRuleBlock returns [EObject current=null] : iv_ruleBlock= ruleBlock EOF ;
    public final EObject entryRuleBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlock = null;


        try {
            // InternalSlideOMatic.g:1285:46: (iv_ruleBlock= ruleBlock EOF )
            // InternalSlideOMatic.g:1286:2: iv_ruleBlock= ruleBlock EOF
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
    // InternalSlideOMatic.g:1292:1: ruleBlock returns [EObject current=null] : (otherlv_0= 'block' ( (lv_name_1_0= RULE_STRING ) )? otherlv_2= '{' ( (lv_content_3_0= ruleContent ) )+ otherlv_4= '}' ) ;
    public final EObject ruleBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_content_3_0 = null;



        	enterRule();

        try {
            // InternalSlideOMatic.g:1298:2: ( (otherlv_0= 'block' ( (lv_name_1_0= RULE_STRING ) )? otherlv_2= '{' ( (lv_content_3_0= ruleContent ) )+ otherlv_4= '}' ) )
            // InternalSlideOMatic.g:1299:2: (otherlv_0= 'block' ( (lv_name_1_0= RULE_STRING ) )? otherlv_2= '{' ( (lv_content_3_0= ruleContent ) )+ otherlv_4= '}' )
            {
            // InternalSlideOMatic.g:1299:2: (otherlv_0= 'block' ( (lv_name_1_0= RULE_STRING ) )? otherlv_2= '{' ( (lv_content_3_0= ruleContent ) )+ otherlv_4= '}' )
            // InternalSlideOMatic.g:1300:3: otherlv_0= 'block' ( (lv_name_1_0= RULE_STRING ) )? otherlv_2= '{' ( (lv_content_3_0= ruleContent ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,77,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getBlockAccess().getBlockKeyword_0());
            		
            // InternalSlideOMatic.g:1304:3: ( (lv_name_1_0= RULE_STRING ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_STRING) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalSlideOMatic.g:1305:4: (lv_name_1_0= RULE_STRING )
                    {
                    // InternalSlideOMatic.g:1305:4: (lv_name_1_0= RULE_STRING )
                    // InternalSlideOMatic.g:1306:5: lv_name_1_0= RULE_STRING
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
            		
            // InternalSlideOMatic.g:1326:3: ( (lv_content_3_0= ruleContent ) )+
            int cnt23=0;
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_STRING||(LA23_0>=71 && LA23_0<=79)||LA23_0==83||LA23_0==93||LA23_0==96||LA23_0==98||LA23_0==102||LA23_0==106) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalSlideOMatic.g:1327:4: (lv_content_3_0= ruleContent )
            	    {
            	    // InternalSlideOMatic.g:1327:4: (lv_content_3_0= ruleContent )
            	    // InternalSlideOMatic.g:1328:5: lv_content_3_0= ruleContent
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
    // InternalSlideOMatic.g:1353:1: entryRuleList returns [EObject current=null] : iv_ruleList= ruleList EOF ;
    public final EObject entryRuleList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleList = null;


        try {
            // InternalSlideOMatic.g:1353:45: (iv_ruleList= ruleList EOF )
            // InternalSlideOMatic.g:1354:2: iv_ruleList= ruleList EOF
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
    // InternalSlideOMatic.g:1360:1: ruleList returns [EObject current=null] : (this_NumberedList_0= ruleNumberedList | this_UnNumberedList_1= ruleUnNumberedList ) ;
    public final EObject ruleList() throws RecognitionException {
        EObject current = null;

        EObject this_NumberedList_0 = null;

        EObject this_UnNumberedList_1 = null;



        	enterRule();

        try {
            // InternalSlideOMatic.g:1366:2: ( (this_NumberedList_0= ruleNumberedList | this_UnNumberedList_1= ruleUnNumberedList ) )
            // InternalSlideOMatic.g:1367:2: (this_NumberedList_0= ruleNumberedList | this_UnNumberedList_1= ruleUnNumberedList )
            {
            // InternalSlideOMatic.g:1367:2: (this_NumberedList_0= ruleNumberedList | this_UnNumberedList_1= ruleUnNumberedList )
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
                    // InternalSlideOMatic.g:1368:3: this_NumberedList_0= ruleNumberedList
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
                    // InternalSlideOMatic.g:1377:3: this_UnNumberedList_1= ruleUnNumberedList
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
    // InternalSlideOMatic.g:1389:1: entryRuleNumberedList returns [EObject current=null] : iv_ruleNumberedList= ruleNumberedList EOF ;
    public final EObject entryRuleNumberedList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberedList = null;


        try {
            // InternalSlideOMatic.g:1389:53: (iv_ruleNumberedList= ruleNumberedList EOF )
            // InternalSlideOMatic.g:1390:2: iv_ruleNumberedList= ruleNumberedList EOF
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
    // InternalSlideOMatic.g:1396:1: ruleNumberedList returns [EObject current=null] : (otherlv_0= '#list' ( (lv_items_1_0= ruleListItem ) )+ ) ;
    public final EObject ruleNumberedList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_items_1_0 = null;



        	enterRule();

        try {
            // InternalSlideOMatic.g:1402:2: ( (otherlv_0= '#list' ( (lv_items_1_0= ruleListItem ) )+ ) )
            // InternalSlideOMatic.g:1403:2: (otherlv_0= '#list' ( (lv_items_1_0= ruleListItem ) )+ )
            {
            // InternalSlideOMatic.g:1403:2: (otherlv_0= '#list' ( (lv_items_1_0= ruleListItem ) )+ )
            // InternalSlideOMatic.g:1404:3: otherlv_0= '#list' ( (lv_items_1_0= ruleListItem ) )+
            {
            otherlv_0=(Token)match(input,78,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getNumberedListAccess().getListKeyword_0());
            		
            // InternalSlideOMatic.g:1408:3: ( (lv_items_1_0= ruleListItem ) )+
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
            	    // InternalSlideOMatic.g:1409:4: (lv_items_1_0= ruleListItem )
            	    {
            	    // InternalSlideOMatic.g:1409:4: (lv_items_1_0= ruleListItem )
            	    // InternalSlideOMatic.g:1410:5: lv_items_1_0= ruleListItem
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
    // InternalSlideOMatic.g:1431:1: entryRuleUnNumberedList returns [EObject current=null] : iv_ruleUnNumberedList= ruleUnNumberedList EOF ;
    public final EObject entryRuleUnNumberedList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnNumberedList = null;


        try {
            // InternalSlideOMatic.g:1431:55: (iv_ruleUnNumberedList= ruleUnNumberedList EOF )
            // InternalSlideOMatic.g:1432:2: iv_ruleUnNumberedList= ruleUnNumberedList EOF
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
    // InternalSlideOMatic.g:1438:1: ruleUnNumberedList returns [EObject current=null] : (otherlv_0= '&list' ( (lv_items_1_0= ruleListItem ) )+ ) ;
    public final EObject ruleUnNumberedList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_items_1_0 = null;



        	enterRule();

        try {
            // InternalSlideOMatic.g:1444:2: ( (otherlv_0= '&list' ( (lv_items_1_0= ruleListItem ) )+ ) )
            // InternalSlideOMatic.g:1445:2: (otherlv_0= '&list' ( (lv_items_1_0= ruleListItem ) )+ )
            {
            // InternalSlideOMatic.g:1445:2: (otherlv_0= '&list' ( (lv_items_1_0= ruleListItem ) )+ )
            // InternalSlideOMatic.g:1446:3: otherlv_0= '&list' ( (lv_items_1_0= ruleListItem ) )+
            {
            otherlv_0=(Token)match(input,79,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getUnNumberedListAccess().getListKeyword_0());
            		
            // InternalSlideOMatic.g:1450:3: ( (lv_items_1_0= ruleListItem ) )+
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
            	    // InternalSlideOMatic.g:1451:4: (lv_items_1_0= ruleListItem )
            	    {
            	    // InternalSlideOMatic.g:1451:4: (lv_items_1_0= ruleListItem )
            	    // InternalSlideOMatic.g:1452:5: lv_items_1_0= ruleListItem
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
    // InternalSlideOMatic.g:1473:1: entryRuleListItem returns [EObject current=null] : iv_ruleListItem= ruleListItem EOF ;
    public final EObject entryRuleListItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListItem = null;


        try {
            // InternalSlideOMatic.g:1473:49: (iv_ruleListItem= ruleListItem EOF )
            // InternalSlideOMatic.g:1474:2: iv_ruleListItem= ruleListItem EOF
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
    // InternalSlideOMatic.g:1480:1: ruleListItem returns [EObject current=null] : (otherlv_0= '-' ( (lv_item_1_0= RULE_STRING ) ) (otherlv_2= '(' ( (lv_nestedList_3_0= ruleList ) ) otherlv_4= ')' )? ( (lv_click_5_0= ruleClick ) )? ) ;
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
            // InternalSlideOMatic.g:1486:2: ( (otherlv_0= '-' ( (lv_item_1_0= RULE_STRING ) ) (otherlv_2= '(' ( (lv_nestedList_3_0= ruleList ) ) otherlv_4= ')' )? ( (lv_click_5_0= ruleClick ) )? ) )
            // InternalSlideOMatic.g:1487:2: (otherlv_0= '-' ( (lv_item_1_0= RULE_STRING ) ) (otherlv_2= '(' ( (lv_nestedList_3_0= ruleList ) ) otherlv_4= ')' )? ( (lv_click_5_0= ruleClick ) )? )
            {
            // InternalSlideOMatic.g:1487:2: (otherlv_0= '-' ( (lv_item_1_0= RULE_STRING ) ) (otherlv_2= '(' ( (lv_nestedList_3_0= ruleList ) ) otherlv_4= ')' )? ( (lv_click_5_0= ruleClick ) )? )
            // InternalSlideOMatic.g:1488:3: otherlv_0= '-' ( (lv_item_1_0= RULE_STRING ) ) (otherlv_2= '(' ( (lv_nestedList_3_0= ruleList ) ) otherlv_4= ')' )? ( (lv_click_5_0= ruleClick ) )?
            {
            otherlv_0=(Token)match(input,80,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getListItemAccess().getHyphenMinusKeyword_0());
            		
            // InternalSlideOMatic.g:1492:3: ( (lv_item_1_0= RULE_STRING ) )
            // InternalSlideOMatic.g:1493:4: (lv_item_1_0= RULE_STRING )
            {
            // InternalSlideOMatic.g:1493:4: (lv_item_1_0= RULE_STRING )
            // InternalSlideOMatic.g:1494:5: lv_item_1_0= RULE_STRING
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

            // InternalSlideOMatic.g:1510:3: (otherlv_2= '(' ( (lv_nestedList_3_0= ruleList ) ) otherlv_4= ')' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==13) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalSlideOMatic.g:1511:4: otherlv_2= '(' ( (lv_nestedList_3_0= ruleList ) ) otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_27); 

                    				newLeafNode(otherlv_2, grammarAccess.getListItemAccess().getLeftParenthesisKeyword_2_0());
                    			
                    // InternalSlideOMatic.g:1515:4: ( (lv_nestedList_3_0= ruleList ) )
                    // InternalSlideOMatic.g:1516:5: (lv_nestedList_3_0= ruleList )
                    {
                    // InternalSlideOMatic.g:1516:5: (lv_nestedList_3_0= ruleList )
                    // InternalSlideOMatic.g:1517:6: lv_nestedList_3_0= ruleList
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

            // InternalSlideOMatic.g:1539:3: ( (lv_click_5_0= ruleClick ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==101) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalSlideOMatic.g:1540:4: (lv_click_5_0= ruleClick )
                    {
                    // InternalSlideOMatic.g:1540:4: (lv_click_5_0= ruleClick )
                    // InternalSlideOMatic.g:1541:5: lv_click_5_0= ruleClick
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
    // InternalSlideOMatic.g:1562:1: entryRuleImage returns [EObject current=null] : iv_ruleImage= ruleImage EOF ;
    public final EObject entryRuleImage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImage = null;


        try {
            // InternalSlideOMatic.g:1562:46: (iv_ruleImage= ruleImage EOF )
            // InternalSlideOMatic.g:1563:2: iv_ruleImage= ruleImage EOF
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
    // InternalSlideOMatic.g:1569:1: ruleImage returns [EObject current=null] : (otherlv_0= 'img' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'src' ( (lv_src_3_0= RULE_STRING ) ) ( (lv_angle_4_0= RULE_INT ) )? ( (lv_alignment_5_0= ruleAlignment ) )? ( (lv_size_6_0= ruleSize ) ) ) ;
    public final EObject ruleImage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_src_3_0=null;
        Token lv_angle_4_0=null;
        AntlrDatatypeRuleToken lv_alignment_5_0 = null;

        EObject lv_size_6_0 = null;



        	enterRule();

        try {
            // InternalSlideOMatic.g:1575:2: ( (otherlv_0= 'img' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'src' ( (lv_src_3_0= RULE_STRING ) ) ( (lv_angle_4_0= RULE_INT ) )? ( (lv_alignment_5_0= ruleAlignment ) )? ( (lv_size_6_0= ruleSize ) ) ) )
            // InternalSlideOMatic.g:1576:2: (otherlv_0= 'img' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'src' ( (lv_src_3_0= RULE_STRING ) ) ( (lv_angle_4_0= RULE_INT ) )? ( (lv_alignment_5_0= ruleAlignment ) )? ( (lv_size_6_0= ruleSize ) ) )
            {
            // InternalSlideOMatic.g:1576:2: (otherlv_0= 'img' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'src' ( (lv_src_3_0= RULE_STRING ) ) ( (lv_angle_4_0= RULE_INT ) )? ( (lv_alignment_5_0= ruleAlignment ) )? ( (lv_size_6_0= ruleSize ) ) )
            // InternalSlideOMatic.g:1577:3: otherlv_0= 'img' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'src' ( (lv_src_3_0= RULE_STRING ) ) ( (lv_angle_4_0= RULE_INT ) )? ( (lv_alignment_5_0= ruleAlignment ) )? ( (lv_size_6_0= ruleSize ) )
            {
            otherlv_0=(Token)match(input,81,FOLLOW_28); 

            			newLeafNode(otherlv_0, grammarAccess.getImageAccess().getImgKeyword_0());
            		
            // InternalSlideOMatic.g:1581:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSlideOMatic.g:1582:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSlideOMatic.g:1582:4: (lv_name_1_0= RULE_ID )
            // InternalSlideOMatic.g:1583:5: lv_name_1_0= RULE_ID
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
            		
            // InternalSlideOMatic.g:1603:3: ( (lv_src_3_0= RULE_STRING ) )
            // InternalSlideOMatic.g:1604:4: (lv_src_3_0= RULE_STRING )
            {
            // InternalSlideOMatic.g:1604:4: (lv_src_3_0= RULE_STRING )
            // InternalSlideOMatic.g:1605:5: lv_src_3_0= RULE_STRING
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

            // InternalSlideOMatic.g:1621:3: ( (lv_angle_4_0= RULE_INT ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_INT) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalSlideOMatic.g:1622:4: (lv_angle_4_0= RULE_INT )
                    {
                    // InternalSlideOMatic.g:1622:4: (lv_angle_4_0= RULE_INT )
                    // InternalSlideOMatic.g:1623:5: lv_angle_4_0= RULE_INT
                    {
                    lv_angle_4_0=(Token)match(input,RULE_INT,FOLLOW_30); 

                    					newLeafNode(lv_angle_4_0, grammarAccess.getImageAccess().getAngleINTTerminalRuleCall_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getImageRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"angle",
                    						lv_angle_4_0,
                    						"org.eclipse.xtext.common.Terminals.INT");
                    				

                    }


                    }
                    break;

            }

            // InternalSlideOMatic.g:1639:3: ( (lv_alignment_5_0= ruleAlignment ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>=84 && LA30_0<=86)) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalSlideOMatic.g:1640:4: (lv_alignment_5_0= ruleAlignment )
                    {
                    // InternalSlideOMatic.g:1640:4: (lv_alignment_5_0= ruleAlignment )
                    // InternalSlideOMatic.g:1641:5: lv_alignment_5_0= ruleAlignment
                    {

                    					newCompositeNode(grammarAccess.getImageAccess().getAlignmentAlignmentParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_30);
                    lv_alignment_5_0=ruleAlignment();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getImageRule());
                    					}
                    					set(
                    						current,
                    						"alignment",
                    						lv_alignment_5_0,
                    						"dk.sdu.mmmi.mdsd.f18.dsl.external.SlideOMatic.Alignment");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalSlideOMatic.g:1658:3: ( (lv_size_6_0= ruleSize ) )
            // InternalSlideOMatic.g:1659:4: (lv_size_6_0= ruleSize )
            {
            // InternalSlideOMatic.g:1659:4: (lv_size_6_0= ruleSize )
            // InternalSlideOMatic.g:1660:5: lv_size_6_0= ruleSize
            {

            					newCompositeNode(grammarAccess.getImageAccess().getSizeSizeParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_2);
            lv_size_6_0=ruleSize();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImageRule());
            					}
            					set(
            						current,
            						"size",
            						lv_size_6_0,
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


    // $ANTLR start "entryRuleShowImage"
    // InternalSlideOMatic.g:1681:1: entryRuleShowImage returns [EObject current=null] : iv_ruleShowImage= ruleShowImage EOF ;
    public final EObject entryRuleShowImage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShowImage = null;


        try {
            // InternalSlideOMatic.g:1681:50: (iv_ruleShowImage= ruleShowImage EOF )
            // InternalSlideOMatic.g:1682:2: iv_ruleShowImage= ruleShowImage EOF
            {
             newCompositeNode(grammarAccess.getShowImageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleShowImage=ruleShowImage();

            state._fsp--;

             current =iv_ruleShowImage; 
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
    // $ANTLR end "entryRuleShowImage"


    // $ANTLR start "ruleShowImage"
    // InternalSlideOMatic.g:1688:1: ruleShowImage returns [EObject current=null] : (otherlv_0= 'showimg' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleShowImage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalSlideOMatic.g:1694:2: ( (otherlv_0= 'showimg' ( (otherlv_1= RULE_ID ) ) ) )
            // InternalSlideOMatic.g:1695:2: (otherlv_0= 'showimg' ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalSlideOMatic.g:1695:2: (otherlv_0= 'showimg' ( (otherlv_1= RULE_ID ) ) )
            // InternalSlideOMatic.g:1696:3: otherlv_0= 'showimg' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,83,FOLLOW_28); 

            			newLeafNode(otherlv_0, grammarAccess.getShowImageAccess().getShowimgKeyword_0());
            		
            // InternalSlideOMatic.g:1700:3: ( (otherlv_1= RULE_ID ) )
            // InternalSlideOMatic.g:1701:4: (otherlv_1= RULE_ID )
            {
            // InternalSlideOMatic.g:1701:4: (otherlv_1= RULE_ID )
            // InternalSlideOMatic.g:1702:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getShowImageRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getShowImageAccess().getImageImageCrossReference_1_0());
            				

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
    // $ANTLR end "ruleShowImage"


    // $ANTLR start "entryRuleAlignment"
    // InternalSlideOMatic.g:1717:1: entryRuleAlignment returns [String current=null] : iv_ruleAlignment= ruleAlignment EOF ;
    public final String entryRuleAlignment() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAlignment = null;


        try {
            // InternalSlideOMatic.g:1717:49: (iv_ruleAlignment= ruleAlignment EOF )
            // InternalSlideOMatic.g:1718:2: iv_ruleAlignment= ruleAlignment EOF
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
    // InternalSlideOMatic.g:1724:1: ruleAlignment returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'left' | kw= 'center' | kw= 'right' ) ;
    public final AntlrDatatypeRuleToken ruleAlignment() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSlideOMatic.g:1730:2: ( (kw= 'left' | kw= 'center' | kw= 'right' ) )
            // InternalSlideOMatic.g:1731:2: (kw= 'left' | kw= 'center' | kw= 'right' )
            {
            // InternalSlideOMatic.g:1731:2: (kw= 'left' | kw= 'center' | kw= 'right' )
            int alt31=3;
            switch ( input.LA(1) ) {
            case 84:
                {
                alt31=1;
                }
                break;
            case 85:
                {
                alt31=2;
                }
                break;
            case 86:
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
                    // InternalSlideOMatic.g:1732:3: kw= 'left'
                    {
                    kw=(Token)match(input,84,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAlignmentAccess().getLeftKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSlideOMatic.g:1738:3: kw= 'center'
                    {
                    kw=(Token)match(input,85,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAlignmentAccess().getCenterKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalSlideOMatic.g:1744:3: kw= 'right'
                    {
                    kw=(Token)match(input,86,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAlignmentAccess().getRightKeyword_2());
                    		

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
    // InternalSlideOMatic.g:1753:1: entryRuleSize returns [EObject current=null] : iv_ruleSize= ruleSize EOF ;
    public final EObject entryRuleSize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSize = null;


        try {
            // InternalSlideOMatic.g:1753:45: (iv_ruleSize= ruleSize EOF )
            // InternalSlideOMatic.g:1754:2: iv_ruleSize= ruleSize EOF
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
    // InternalSlideOMatic.g:1760:1: ruleSize returns [EObject current=null] : ( ( () ( (lv_way_1_0= ruleWay ) ) ( (lv_scale_2_0= RULE_INT ) ) otherlv_3= '%' ) | ( () ( (lv_way_5_0= ruleWay ) ) ( (lv_size_6_0= RULE_INT ) ) ( ( (lv_unit_7_1= 'cm' | lv_unit_7_2= 'em' | lv_unit_7_3= 'mm' ) ) ) ) ) ;
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
            // InternalSlideOMatic.g:1766:2: ( ( ( () ( (lv_way_1_0= ruleWay ) ) ( (lv_scale_2_0= RULE_INT ) ) otherlv_3= '%' ) | ( () ( (lv_way_5_0= ruleWay ) ) ( (lv_size_6_0= RULE_INT ) ) ( ( (lv_unit_7_1= 'cm' | lv_unit_7_2= 'em' | lv_unit_7_3= 'mm' ) ) ) ) ) )
            // InternalSlideOMatic.g:1767:2: ( ( () ( (lv_way_1_0= ruleWay ) ) ( (lv_scale_2_0= RULE_INT ) ) otherlv_3= '%' ) | ( () ( (lv_way_5_0= ruleWay ) ) ( (lv_size_6_0= RULE_INT ) ) ( ( (lv_unit_7_1= 'cm' | lv_unit_7_2= 'em' | lv_unit_7_3= 'mm' ) ) ) ) )
            {
            // InternalSlideOMatic.g:1767:2: ( ( () ( (lv_way_1_0= ruleWay ) ) ( (lv_scale_2_0= RULE_INT ) ) otherlv_3= '%' ) | ( () ( (lv_way_5_0= ruleWay ) ) ( (lv_size_6_0= RULE_INT ) ) ( ( (lv_unit_7_1= 'cm' | lv_unit_7_2= 'em' | lv_unit_7_3= 'mm' ) ) ) ) )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==91) ) {
                int LA33_1 = input.LA(2);

                if ( (LA33_1==RULE_INT) ) {
                    int LA33_3 = input.LA(3);

                    if ( ((LA33_3>=88 && LA33_3<=90)) ) {
                        alt33=2;
                    }
                    else if ( (LA33_3==87) ) {
                        alt33=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 33, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA33_0==92) ) {
                int LA33_2 = input.LA(2);

                if ( (LA33_2==RULE_INT) ) {
                    int LA33_3 = input.LA(3);

                    if ( ((LA33_3>=88 && LA33_3<=90)) ) {
                        alt33=2;
                    }
                    else if ( (LA33_3==87) ) {
                        alt33=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 33, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // InternalSlideOMatic.g:1768:3: ( () ( (lv_way_1_0= ruleWay ) ) ( (lv_scale_2_0= RULE_INT ) ) otherlv_3= '%' )
                    {
                    // InternalSlideOMatic.g:1768:3: ( () ( (lv_way_1_0= ruleWay ) ) ( (lv_scale_2_0= RULE_INT ) ) otherlv_3= '%' )
                    // InternalSlideOMatic.g:1769:4: () ( (lv_way_1_0= ruleWay ) ) ( (lv_scale_2_0= RULE_INT ) ) otherlv_3= '%'
                    {
                    // InternalSlideOMatic.g:1769:4: ()
                    // InternalSlideOMatic.g:1770:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSizeAccess().getProportionalSizeAction_0_0(),
                    						current);
                    				

                    }

                    // InternalSlideOMatic.g:1776:4: ( (lv_way_1_0= ruleWay ) )
                    // InternalSlideOMatic.g:1777:5: (lv_way_1_0= ruleWay )
                    {
                    // InternalSlideOMatic.g:1777:5: (lv_way_1_0= ruleWay )
                    // InternalSlideOMatic.g:1778:6: lv_way_1_0= ruleWay
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

                    // InternalSlideOMatic.g:1795:4: ( (lv_scale_2_0= RULE_INT ) )
                    // InternalSlideOMatic.g:1796:5: (lv_scale_2_0= RULE_INT )
                    {
                    // InternalSlideOMatic.g:1796:5: (lv_scale_2_0= RULE_INT )
                    // InternalSlideOMatic.g:1797:6: lv_scale_2_0= RULE_INT
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

                    otherlv_3=(Token)match(input,87,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getSizeAccess().getPercentSignKeyword_0_3());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSlideOMatic.g:1819:3: ( () ( (lv_way_5_0= ruleWay ) ) ( (lv_size_6_0= RULE_INT ) ) ( ( (lv_unit_7_1= 'cm' | lv_unit_7_2= 'em' | lv_unit_7_3= 'mm' ) ) ) )
                    {
                    // InternalSlideOMatic.g:1819:3: ( () ( (lv_way_5_0= ruleWay ) ) ( (lv_size_6_0= RULE_INT ) ) ( ( (lv_unit_7_1= 'cm' | lv_unit_7_2= 'em' | lv_unit_7_3= 'mm' ) ) ) )
                    // InternalSlideOMatic.g:1820:4: () ( (lv_way_5_0= ruleWay ) ) ( (lv_size_6_0= RULE_INT ) ) ( ( (lv_unit_7_1= 'cm' | lv_unit_7_2= 'em' | lv_unit_7_3= 'mm' ) ) )
                    {
                    // InternalSlideOMatic.g:1820:4: ()
                    // InternalSlideOMatic.g:1821:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSizeAccess().getExactSizeAction_1_0(),
                    						current);
                    				

                    }

                    // InternalSlideOMatic.g:1827:4: ( (lv_way_5_0= ruleWay ) )
                    // InternalSlideOMatic.g:1828:5: (lv_way_5_0= ruleWay )
                    {
                    // InternalSlideOMatic.g:1828:5: (lv_way_5_0= ruleWay )
                    // InternalSlideOMatic.g:1829:6: lv_way_5_0= ruleWay
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

                    // InternalSlideOMatic.g:1846:4: ( (lv_size_6_0= RULE_INT ) )
                    // InternalSlideOMatic.g:1847:5: (lv_size_6_0= RULE_INT )
                    {
                    // InternalSlideOMatic.g:1847:5: (lv_size_6_0= RULE_INT )
                    // InternalSlideOMatic.g:1848:6: lv_size_6_0= RULE_INT
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

                    // InternalSlideOMatic.g:1864:4: ( ( (lv_unit_7_1= 'cm' | lv_unit_7_2= 'em' | lv_unit_7_3= 'mm' ) ) )
                    // InternalSlideOMatic.g:1865:5: ( (lv_unit_7_1= 'cm' | lv_unit_7_2= 'em' | lv_unit_7_3= 'mm' ) )
                    {
                    // InternalSlideOMatic.g:1865:5: ( (lv_unit_7_1= 'cm' | lv_unit_7_2= 'em' | lv_unit_7_3= 'mm' ) )
                    // InternalSlideOMatic.g:1866:6: (lv_unit_7_1= 'cm' | lv_unit_7_2= 'em' | lv_unit_7_3= 'mm' )
                    {
                    // InternalSlideOMatic.g:1866:6: (lv_unit_7_1= 'cm' | lv_unit_7_2= 'em' | lv_unit_7_3= 'mm' )
                    int alt32=3;
                    switch ( input.LA(1) ) {
                    case 88:
                        {
                        alt32=1;
                        }
                        break;
                    case 89:
                        {
                        alt32=2;
                        }
                        break;
                    case 90:
                        {
                        alt32=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 32, 0, input);

                        throw nvae;
                    }

                    switch (alt32) {
                        case 1 :
                            // InternalSlideOMatic.g:1867:7: lv_unit_7_1= 'cm'
                            {
                            lv_unit_7_1=(Token)match(input,88,FOLLOW_2); 

                            							newLeafNode(lv_unit_7_1, grammarAccess.getSizeAccess().getUnitCmKeyword_1_3_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getSizeRule());
                            							}
                            							setWithLastConsumed(current, "unit", lv_unit_7_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalSlideOMatic.g:1878:7: lv_unit_7_2= 'em'
                            {
                            lv_unit_7_2=(Token)match(input,89,FOLLOW_2); 

                            							newLeafNode(lv_unit_7_2, grammarAccess.getSizeAccess().getUnitEmKeyword_1_3_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getSizeRule());
                            							}
                            							setWithLastConsumed(current, "unit", lv_unit_7_2, null);
                            						

                            }
                            break;
                        case 3 :
                            // InternalSlideOMatic.g:1889:7: lv_unit_7_3= 'mm'
                            {
                            lv_unit_7_3=(Token)match(input,90,FOLLOW_2); 

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
    // InternalSlideOMatic.g:1907:1: entryRuleWay returns [EObject current=null] : iv_ruleWay= ruleWay EOF ;
    public final EObject entryRuleWay() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWay = null;


        try {
            // InternalSlideOMatic.g:1907:44: (iv_ruleWay= ruleWay EOF )
            // InternalSlideOMatic.g:1908:2: iv_ruleWay= ruleWay EOF
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
    // InternalSlideOMatic.g:1914:1: ruleWay returns [EObject current=null] : ( ( () otherlv_1= 'width' ) | ( () otherlv_3= 'height' ) ) ;
    public final EObject ruleWay() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalSlideOMatic.g:1920:2: ( ( ( () otherlv_1= 'width' ) | ( () otherlv_3= 'height' ) ) )
            // InternalSlideOMatic.g:1921:2: ( ( () otherlv_1= 'width' ) | ( () otherlv_3= 'height' ) )
            {
            // InternalSlideOMatic.g:1921:2: ( ( () otherlv_1= 'width' ) | ( () otherlv_3= 'height' ) )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==91) ) {
                alt34=1;
            }
            else if ( (LA34_0==92) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // InternalSlideOMatic.g:1922:3: ( () otherlv_1= 'width' )
                    {
                    // InternalSlideOMatic.g:1922:3: ( () otherlv_1= 'width' )
                    // InternalSlideOMatic.g:1923:4: () otherlv_1= 'width'
                    {
                    // InternalSlideOMatic.g:1923:4: ()
                    // InternalSlideOMatic.g:1924:5: 
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
                    // InternalSlideOMatic.g:1936:3: ( () otherlv_3= 'height' )
                    {
                    // InternalSlideOMatic.g:1936:3: ( () otherlv_3= 'height' )
                    // InternalSlideOMatic.g:1937:4: () otherlv_3= 'height'
                    {
                    // InternalSlideOMatic.g:1937:4: ()
                    // InternalSlideOMatic.g:1938:5: 
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
    // InternalSlideOMatic.g:1953:1: entryRuleTable returns [EObject current=null] : iv_ruleTable= ruleTable EOF ;
    public final EObject entryRuleTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTable = null;


        try {
            // InternalSlideOMatic.g:1953:46: (iv_ruleTable= ruleTable EOF )
            // InternalSlideOMatic.g:1954:2: iv_ruleTable= ruleTable EOF
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
    // InternalSlideOMatic.g:1960:1: ruleTable returns [EObject current=null] : (otherlv_0= 'tab' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (lv_rows_3_0= ruleTableRow ) ) (otherlv_4= ',' ( (lv_rows_5_0= ruleTableRow ) ) )* otherlv_6= ']' ) ;
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
            // InternalSlideOMatic.g:1966:2: ( (otherlv_0= 'tab' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (lv_rows_3_0= ruleTableRow ) ) (otherlv_4= ',' ( (lv_rows_5_0= ruleTableRow ) ) )* otherlv_6= ']' ) )
            // InternalSlideOMatic.g:1967:2: (otherlv_0= 'tab' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (lv_rows_3_0= ruleTableRow ) ) (otherlv_4= ',' ( (lv_rows_5_0= ruleTableRow ) ) )* otherlv_6= ']' )
            {
            // InternalSlideOMatic.g:1967:2: (otherlv_0= 'tab' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (lv_rows_3_0= ruleTableRow ) ) (otherlv_4= ',' ( (lv_rows_5_0= ruleTableRow ) ) )* otherlv_6= ']' )
            // InternalSlideOMatic.g:1968:3: otherlv_0= 'tab' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (lv_rows_3_0= ruleTableRow ) ) (otherlv_4= ',' ( (lv_rows_5_0= ruleTableRow ) ) )* otherlv_6= ']'
            {
            otherlv_0=(Token)match(input,93,FOLLOW_28); 

            			newLeafNode(otherlv_0, grammarAccess.getTableAccess().getTabKeyword_0());
            		
            // InternalSlideOMatic.g:1972:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSlideOMatic.g:1973:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSlideOMatic.g:1973:4: (lv_name_1_0= RULE_ID )
            // InternalSlideOMatic.g:1974:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,94,FOLLOW_34); 

            			newLeafNode(otherlv_2, grammarAccess.getTableAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalSlideOMatic.g:1994:3: ( (lv_rows_3_0= ruleTableRow ) )
            // InternalSlideOMatic.g:1995:4: (lv_rows_3_0= ruleTableRow )
            {
            // InternalSlideOMatic.g:1995:4: (lv_rows_3_0= ruleTableRow )
            // InternalSlideOMatic.g:1996:5: lv_rows_3_0= ruleTableRow
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

            // InternalSlideOMatic.g:2013:3: (otherlv_4= ',' ( (lv_rows_5_0= ruleTableRow ) ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==64) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalSlideOMatic.g:2014:4: otherlv_4= ',' ( (lv_rows_5_0= ruleTableRow ) )
            	    {
            	    otherlv_4=(Token)match(input,64,FOLLOW_34); 

            	    				newLeafNode(otherlv_4, grammarAccess.getTableAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalSlideOMatic.g:2018:4: ( (lv_rows_5_0= ruleTableRow ) )
            	    // InternalSlideOMatic.g:2019:5: (lv_rows_5_0= ruleTableRow )
            	    {
            	    // InternalSlideOMatic.g:2019:5: (lv_rows_5_0= ruleTableRow )
            	    // InternalSlideOMatic.g:2020:6: lv_rows_5_0= ruleTableRow
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
            	    break loop35;
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
    // InternalSlideOMatic.g:2046:1: entryRuleTableRow returns [EObject current=null] : iv_ruleTableRow= ruleTableRow EOF ;
    public final EObject entryRuleTableRow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTableRow = null;


        try {
            // InternalSlideOMatic.g:2046:49: (iv_ruleTableRow= ruleTableRow EOF )
            // InternalSlideOMatic.g:2047:2: iv_ruleTableRow= ruleTableRow EOF
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
    // InternalSlideOMatic.g:2053:1: ruleTableRow returns [EObject current=null] : (otherlv_0= '[' ( (lv_values_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_values_3_0= RULE_STRING ) ) )* otherlv_4= ']' ) ;
    public final EObject ruleTableRow() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_values_1_0=null;
        Token otherlv_2=null;
        Token lv_values_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalSlideOMatic.g:2059:2: ( (otherlv_0= '[' ( (lv_values_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_values_3_0= RULE_STRING ) ) )* otherlv_4= ']' ) )
            // InternalSlideOMatic.g:2060:2: (otherlv_0= '[' ( (lv_values_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_values_3_0= RULE_STRING ) ) )* otherlv_4= ']' )
            {
            // InternalSlideOMatic.g:2060:2: (otherlv_0= '[' ( (lv_values_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_values_3_0= RULE_STRING ) ) )* otherlv_4= ']' )
            // InternalSlideOMatic.g:2061:3: otherlv_0= '[' ( (lv_values_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_values_3_0= RULE_STRING ) ) )* otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,94,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTableRowAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalSlideOMatic.g:2065:3: ( (lv_values_1_0= RULE_STRING ) )
            // InternalSlideOMatic.g:2066:4: (lv_values_1_0= RULE_STRING )
            {
            // InternalSlideOMatic.g:2066:4: (lv_values_1_0= RULE_STRING )
            // InternalSlideOMatic.g:2067:5: lv_values_1_0= RULE_STRING
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

            // InternalSlideOMatic.g:2083:3: (otherlv_2= ',' ( (lv_values_3_0= RULE_STRING ) ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==64) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalSlideOMatic.g:2084:4: otherlv_2= ',' ( (lv_values_3_0= RULE_STRING ) )
            	    {
            	    otherlv_2=(Token)match(input,64,FOLLOW_3); 

            	    				newLeafNode(otherlv_2, grammarAccess.getTableRowAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalSlideOMatic.g:2088:4: ( (lv_values_3_0= RULE_STRING ) )
            	    // InternalSlideOMatic.g:2089:5: (lv_values_3_0= RULE_STRING )
            	    {
            	    // InternalSlideOMatic.g:2089:5: (lv_values_3_0= RULE_STRING )
            	    // InternalSlideOMatic.g:2090:6: lv_values_3_0= RULE_STRING
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
            	    break loop36;
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
    // InternalSlideOMatic.g:2115:1: entryRuleCode returns [EObject current=null] : iv_ruleCode= ruleCode EOF ;
    public final EObject entryRuleCode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCode = null;


        try {
            // InternalSlideOMatic.g:2115:45: (iv_ruleCode= ruleCode EOF )
            // InternalSlideOMatic.g:2116:2: iv_ruleCode= ruleCode EOF
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
    // InternalSlideOMatic.g:2122:1: ruleCode returns [EObject current=null] : ( ( () otherlv_1= 'code' ( (lv_lang_2_0= RULE_ID ) ) ( (lv_code_3_0= RULE_STRING ) ) otherlv_4= 'end' ) | ( () otherlv_6= 'filecode' ( (lv_lang_7_0= RULE_ID ) ) ( (lv_src_8_0= RULE_STRING ) ) (otherlv_9= 'show' otherlv_10= '[' ( (lv_lines_11_0= ruleLineSequence ) ) otherlv_12= ']' (otherlv_13= ',' otherlv_14= '[' ( (lv_lines_15_0= ruleLineSequence ) ) otherlv_16= ']' )* )? otherlv_17= 'end' ) ) ;
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
            // InternalSlideOMatic.g:2128:2: ( ( ( () otherlv_1= 'code' ( (lv_lang_2_0= RULE_ID ) ) ( (lv_code_3_0= RULE_STRING ) ) otherlv_4= 'end' ) | ( () otherlv_6= 'filecode' ( (lv_lang_7_0= RULE_ID ) ) ( (lv_src_8_0= RULE_STRING ) ) (otherlv_9= 'show' otherlv_10= '[' ( (lv_lines_11_0= ruleLineSequence ) ) otherlv_12= ']' (otherlv_13= ',' otherlv_14= '[' ( (lv_lines_15_0= ruleLineSequence ) ) otherlv_16= ']' )* )? otherlv_17= 'end' ) ) )
            // InternalSlideOMatic.g:2129:2: ( ( () otherlv_1= 'code' ( (lv_lang_2_0= RULE_ID ) ) ( (lv_code_3_0= RULE_STRING ) ) otherlv_4= 'end' ) | ( () otherlv_6= 'filecode' ( (lv_lang_7_0= RULE_ID ) ) ( (lv_src_8_0= RULE_STRING ) ) (otherlv_9= 'show' otherlv_10= '[' ( (lv_lines_11_0= ruleLineSequence ) ) otherlv_12= ']' (otherlv_13= ',' otherlv_14= '[' ( (lv_lines_15_0= ruleLineSequence ) ) otherlv_16= ']' )* )? otherlv_17= 'end' ) )
            {
            // InternalSlideOMatic.g:2129:2: ( ( () otherlv_1= 'code' ( (lv_lang_2_0= RULE_ID ) ) ( (lv_code_3_0= RULE_STRING ) ) otherlv_4= 'end' ) | ( () otherlv_6= 'filecode' ( (lv_lang_7_0= RULE_ID ) ) ( (lv_src_8_0= RULE_STRING ) ) (otherlv_9= 'show' otherlv_10= '[' ( (lv_lines_11_0= ruleLineSequence ) ) otherlv_12= ']' (otherlv_13= ',' otherlv_14= '[' ( (lv_lines_15_0= ruleLineSequence ) ) otherlv_16= ']' )* )? otherlv_17= 'end' ) )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==96) ) {
                alt39=1;
            }
            else if ( (LA39_0==98) ) {
                alt39=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // InternalSlideOMatic.g:2130:3: ( () otherlv_1= 'code' ( (lv_lang_2_0= RULE_ID ) ) ( (lv_code_3_0= RULE_STRING ) ) otherlv_4= 'end' )
                    {
                    // InternalSlideOMatic.g:2130:3: ( () otherlv_1= 'code' ( (lv_lang_2_0= RULE_ID ) ) ( (lv_code_3_0= RULE_STRING ) ) otherlv_4= 'end' )
                    // InternalSlideOMatic.g:2131:4: () otherlv_1= 'code' ( (lv_lang_2_0= RULE_ID ) ) ( (lv_code_3_0= RULE_STRING ) ) otherlv_4= 'end'
                    {
                    // InternalSlideOMatic.g:2131:4: ()
                    // InternalSlideOMatic.g:2132:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getCodeAccess().getInlineCodeAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,96,FOLLOW_28); 

                    				newLeafNode(otherlv_1, grammarAccess.getCodeAccess().getCodeKeyword_0_1());
                    			
                    // InternalSlideOMatic.g:2142:4: ( (lv_lang_2_0= RULE_ID ) )
                    // InternalSlideOMatic.g:2143:5: (lv_lang_2_0= RULE_ID )
                    {
                    // InternalSlideOMatic.g:2143:5: (lv_lang_2_0= RULE_ID )
                    // InternalSlideOMatic.g:2144:6: lv_lang_2_0= RULE_ID
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

                    // InternalSlideOMatic.g:2160:4: ( (lv_code_3_0= RULE_STRING ) )
                    // InternalSlideOMatic.g:2161:5: (lv_code_3_0= RULE_STRING )
                    {
                    // InternalSlideOMatic.g:2161:5: (lv_code_3_0= RULE_STRING )
                    // InternalSlideOMatic.g:2162:6: lv_code_3_0= RULE_STRING
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

                    otherlv_4=(Token)match(input,97,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getCodeAccess().getEndKeyword_0_4());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSlideOMatic.g:2184:3: ( () otherlv_6= 'filecode' ( (lv_lang_7_0= RULE_ID ) ) ( (lv_src_8_0= RULE_STRING ) ) (otherlv_9= 'show' otherlv_10= '[' ( (lv_lines_11_0= ruleLineSequence ) ) otherlv_12= ']' (otherlv_13= ',' otherlv_14= '[' ( (lv_lines_15_0= ruleLineSequence ) ) otherlv_16= ']' )* )? otherlv_17= 'end' )
                    {
                    // InternalSlideOMatic.g:2184:3: ( () otherlv_6= 'filecode' ( (lv_lang_7_0= RULE_ID ) ) ( (lv_src_8_0= RULE_STRING ) ) (otherlv_9= 'show' otherlv_10= '[' ( (lv_lines_11_0= ruleLineSequence ) ) otherlv_12= ']' (otherlv_13= ',' otherlv_14= '[' ( (lv_lines_15_0= ruleLineSequence ) ) otherlv_16= ']' )* )? otherlv_17= 'end' )
                    // InternalSlideOMatic.g:2185:4: () otherlv_6= 'filecode' ( (lv_lang_7_0= RULE_ID ) ) ( (lv_src_8_0= RULE_STRING ) ) (otherlv_9= 'show' otherlv_10= '[' ( (lv_lines_11_0= ruleLineSequence ) ) otherlv_12= ']' (otherlv_13= ',' otherlv_14= '[' ( (lv_lines_15_0= ruleLineSequence ) ) otherlv_16= ']' )* )? otherlv_17= 'end'
                    {
                    // InternalSlideOMatic.g:2185:4: ()
                    // InternalSlideOMatic.g:2186:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getCodeAccess().getFileCodeAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_6=(Token)match(input,98,FOLLOW_28); 

                    				newLeafNode(otherlv_6, grammarAccess.getCodeAccess().getFilecodeKeyword_1_1());
                    			
                    // InternalSlideOMatic.g:2196:4: ( (lv_lang_7_0= RULE_ID ) )
                    // InternalSlideOMatic.g:2197:5: (lv_lang_7_0= RULE_ID )
                    {
                    // InternalSlideOMatic.g:2197:5: (lv_lang_7_0= RULE_ID )
                    // InternalSlideOMatic.g:2198:6: lv_lang_7_0= RULE_ID
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

                    // InternalSlideOMatic.g:2214:4: ( (lv_src_8_0= RULE_STRING ) )
                    // InternalSlideOMatic.g:2215:5: (lv_src_8_0= RULE_STRING )
                    {
                    // InternalSlideOMatic.g:2215:5: (lv_src_8_0= RULE_STRING )
                    // InternalSlideOMatic.g:2216:6: lv_src_8_0= RULE_STRING
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

                    // InternalSlideOMatic.g:2232:4: (otherlv_9= 'show' otherlv_10= '[' ( (lv_lines_11_0= ruleLineSequence ) ) otherlv_12= ']' (otherlv_13= ',' otherlv_14= '[' ( (lv_lines_15_0= ruleLineSequence ) ) otherlv_16= ']' )* )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==99) ) {
                        alt38=1;
                    }
                    switch (alt38) {
                        case 1 :
                            // InternalSlideOMatic.g:2233:5: otherlv_9= 'show' otherlv_10= '[' ( (lv_lines_11_0= ruleLineSequence ) ) otherlv_12= ']' (otherlv_13= ',' otherlv_14= '[' ( (lv_lines_15_0= ruleLineSequence ) ) otherlv_16= ']' )*
                            {
                            otherlv_9=(Token)match(input,99,FOLLOW_34); 

                            					newLeafNode(otherlv_9, grammarAccess.getCodeAccess().getShowKeyword_1_4_0());
                            				
                            otherlv_10=(Token)match(input,94,FOLLOW_31); 

                            					newLeafNode(otherlv_10, grammarAccess.getCodeAccess().getLeftSquareBracketKeyword_1_4_1());
                            				
                            // InternalSlideOMatic.g:2241:5: ( (lv_lines_11_0= ruleLineSequence ) )
                            // InternalSlideOMatic.g:2242:6: (lv_lines_11_0= ruleLineSequence )
                            {
                            // InternalSlideOMatic.g:2242:6: (lv_lines_11_0= ruleLineSequence )
                            // InternalSlideOMatic.g:2243:7: lv_lines_11_0= ruleLineSequence
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

                            otherlv_12=(Token)match(input,95,FOLLOW_39); 

                            					newLeafNode(otherlv_12, grammarAccess.getCodeAccess().getRightSquareBracketKeyword_1_4_3());
                            				
                            // InternalSlideOMatic.g:2264:5: (otherlv_13= ',' otherlv_14= '[' ( (lv_lines_15_0= ruleLineSequence ) ) otherlv_16= ']' )*
                            loop37:
                            do {
                                int alt37=2;
                                int LA37_0 = input.LA(1);

                                if ( (LA37_0==64) ) {
                                    alt37=1;
                                }


                                switch (alt37) {
                            	case 1 :
                            	    // InternalSlideOMatic.g:2265:6: otherlv_13= ',' otherlv_14= '[' ( (lv_lines_15_0= ruleLineSequence ) ) otherlv_16= ']'
                            	    {
                            	    otherlv_13=(Token)match(input,64,FOLLOW_34); 

                            	    						newLeafNode(otherlv_13, grammarAccess.getCodeAccess().getCommaKeyword_1_4_4_0());
                            	    					
                            	    otherlv_14=(Token)match(input,94,FOLLOW_31); 

                            	    						newLeafNode(otherlv_14, grammarAccess.getCodeAccess().getLeftSquareBracketKeyword_1_4_4_1());
                            	    					
                            	    // InternalSlideOMatic.g:2273:6: ( (lv_lines_15_0= ruleLineSequence ) )
                            	    // InternalSlideOMatic.g:2274:7: (lv_lines_15_0= ruleLineSequence )
                            	    {
                            	    // InternalSlideOMatic.g:2274:7: (lv_lines_15_0= ruleLineSequence )
                            	    // InternalSlideOMatic.g:2275:8: lv_lines_15_0= ruleLineSequence
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

                            	    otherlv_16=(Token)match(input,95,FOLLOW_39); 

                            	    						newLeafNode(otherlv_16, grammarAccess.getCodeAccess().getRightSquareBracketKeyword_1_4_4_3());
                            	    					

                            	    }
                            	    break;

                            	default :
                            	    break loop37;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_17=(Token)match(input,97,FOLLOW_2); 

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
    // InternalSlideOMatic.g:2307:1: entryRuleLineSequence returns [EObject current=null] : iv_ruleLineSequence= ruleLineSequence EOF ;
    public final EObject entryRuleLineSequence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLineSequence = null;


        try {
            // InternalSlideOMatic.g:2307:53: (iv_ruleLineSequence= ruleLineSequence EOF )
            // InternalSlideOMatic.g:2308:2: iv_ruleLineSequence= ruleLineSequence EOF
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
    // InternalSlideOMatic.g:2314:1: ruleLineSequence returns [EObject current=null] : ( ( (lv_lower_0_0= RULE_INT ) ) (otherlv_1= ':' ( (lv_upper_2_0= RULE_INT ) ) )? (otherlv_3= ',' ( (lv_additional_4_0= ruleLineSequence ) ) )? ) ;
    public final EObject ruleLineSequence() throws RecognitionException {
        EObject current = null;

        Token lv_lower_0_0=null;
        Token otherlv_1=null;
        Token lv_upper_2_0=null;
        Token otherlv_3=null;
        EObject lv_additional_4_0 = null;



        	enterRule();

        try {
            // InternalSlideOMatic.g:2320:2: ( ( ( (lv_lower_0_0= RULE_INT ) ) (otherlv_1= ':' ( (lv_upper_2_0= RULE_INT ) ) )? (otherlv_3= ',' ( (lv_additional_4_0= ruleLineSequence ) ) )? ) )
            // InternalSlideOMatic.g:2321:2: ( ( (lv_lower_0_0= RULE_INT ) ) (otherlv_1= ':' ( (lv_upper_2_0= RULE_INT ) ) )? (otherlv_3= ',' ( (lv_additional_4_0= ruleLineSequence ) ) )? )
            {
            // InternalSlideOMatic.g:2321:2: ( ( (lv_lower_0_0= RULE_INT ) ) (otherlv_1= ':' ( (lv_upper_2_0= RULE_INT ) ) )? (otherlv_3= ',' ( (lv_additional_4_0= ruleLineSequence ) ) )? )
            // InternalSlideOMatic.g:2322:3: ( (lv_lower_0_0= RULE_INT ) ) (otherlv_1= ':' ( (lv_upper_2_0= RULE_INT ) ) )? (otherlv_3= ',' ( (lv_additional_4_0= ruleLineSequence ) ) )?
            {
            // InternalSlideOMatic.g:2322:3: ( (lv_lower_0_0= RULE_INT ) )
            // InternalSlideOMatic.g:2323:4: (lv_lower_0_0= RULE_INT )
            {
            // InternalSlideOMatic.g:2323:4: (lv_lower_0_0= RULE_INT )
            // InternalSlideOMatic.g:2324:5: lv_lower_0_0= RULE_INT
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

            // InternalSlideOMatic.g:2340:3: (otherlv_1= ':' ( (lv_upper_2_0= RULE_INT ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==100) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalSlideOMatic.g:2341:4: otherlv_1= ':' ( (lv_upper_2_0= RULE_INT ) )
                    {
                    otherlv_1=(Token)match(input,100,FOLLOW_31); 

                    				newLeafNode(otherlv_1, grammarAccess.getLineSequenceAccess().getColonKeyword_1_0());
                    			
                    // InternalSlideOMatic.g:2345:4: ( (lv_upper_2_0= RULE_INT ) )
                    // InternalSlideOMatic.g:2346:5: (lv_upper_2_0= RULE_INT )
                    {
                    // InternalSlideOMatic.g:2346:5: (lv_upper_2_0= RULE_INT )
                    // InternalSlideOMatic.g:2347:6: lv_upper_2_0= RULE_INT
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

            // InternalSlideOMatic.g:2364:3: (otherlv_3= ',' ( (lv_additional_4_0= ruleLineSequence ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==64) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalSlideOMatic.g:2365:4: otherlv_3= ',' ( (lv_additional_4_0= ruleLineSequence ) )
                    {
                    otherlv_3=(Token)match(input,64,FOLLOW_31); 

                    				newLeafNode(otherlv_3, grammarAccess.getLineSequenceAccess().getCommaKeyword_2_0());
                    			
                    // InternalSlideOMatic.g:2369:4: ( (lv_additional_4_0= ruleLineSequence ) )
                    // InternalSlideOMatic.g:2370:5: (lv_additional_4_0= ruleLineSequence )
                    {
                    // InternalSlideOMatic.g:2370:5: (lv_additional_4_0= ruleLineSequence )
                    // InternalSlideOMatic.g:2371:6: lv_additional_4_0= ruleLineSequence
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
    // InternalSlideOMatic.g:2393:1: entryRuleClick returns [String current=null] : iv_ruleClick= ruleClick EOF ;
    public final String entryRuleClick() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleClick = null;


        try {
            // InternalSlideOMatic.g:2393:45: (iv_ruleClick= ruleClick EOF )
            // InternalSlideOMatic.g:2394:2: iv_ruleClick= ruleClick EOF
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
    // InternalSlideOMatic.g:2400:1: ruleClick returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '$$' ;
    public final AntlrDatatypeRuleToken ruleClick() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSlideOMatic.g:2406:2: (kw= '$$' )
            // InternalSlideOMatic.g:2407:2: kw= '$$'
            {
            kw=(Token)match(input,101,FOLLOW_2); 

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
    // InternalSlideOMatic.g:2415:1: entryRuleAnimation returns [EObject current=null] : iv_ruleAnimation= ruleAnimation EOF ;
    public final EObject entryRuleAnimation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnimation = null;


        try {
            // InternalSlideOMatic.g:2415:50: (iv_ruleAnimation= ruleAnimation EOF )
            // InternalSlideOMatic.g:2416:2: iv_ruleAnimation= ruleAnimation EOF
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
    // InternalSlideOMatic.g:2422:1: ruleAnimation returns [EObject current=null] : (otherlv_0= 'animate' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'from' ( (lv_fromLocation_3_0= ruleAlignment ) ) otherlv_4= 'to' ( (lv_finalLocation_5_0= ruleAlignment ) ) (otherlv_6= 'via' ( (lv_viaLocation_7_0= ruleAlignment ) ) )? ) ;
    public final EObject ruleAnimation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_fromLocation_3_0 = null;

        AntlrDatatypeRuleToken lv_finalLocation_5_0 = null;

        AntlrDatatypeRuleToken lv_viaLocation_7_0 = null;



        	enterRule();

        try {
            // InternalSlideOMatic.g:2428:2: ( (otherlv_0= 'animate' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'from' ( (lv_fromLocation_3_0= ruleAlignment ) ) otherlv_4= 'to' ( (lv_finalLocation_5_0= ruleAlignment ) ) (otherlv_6= 'via' ( (lv_viaLocation_7_0= ruleAlignment ) ) )? ) )
            // InternalSlideOMatic.g:2429:2: (otherlv_0= 'animate' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'from' ( (lv_fromLocation_3_0= ruleAlignment ) ) otherlv_4= 'to' ( (lv_finalLocation_5_0= ruleAlignment ) ) (otherlv_6= 'via' ( (lv_viaLocation_7_0= ruleAlignment ) ) )? )
            {
            // InternalSlideOMatic.g:2429:2: (otherlv_0= 'animate' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'from' ( (lv_fromLocation_3_0= ruleAlignment ) ) otherlv_4= 'to' ( (lv_finalLocation_5_0= ruleAlignment ) ) (otherlv_6= 'via' ( (lv_viaLocation_7_0= ruleAlignment ) ) )? )
            // InternalSlideOMatic.g:2430:3: otherlv_0= 'animate' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'from' ( (lv_fromLocation_3_0= ruleAlignment ) ) otherlv_4= 'to' ( (lv_finalLocation_5_0= ruleAlignment ) ) (otherlv_6= 'via' ( (lv_viaLocation_7_0= ruleAlignment ) ) )?
            {
            otherlv_0=(Token)match(input,102,FOLLOW_28); 

            			newLeafNode(otherlv_0, grammarAccess.getAnimationAccess().getAnimateKeyword_0());
            		
            // InternalSlideOMatic.g:2434:3: ( (otherlv_1= RULE_ID ) )
            // InternalSlideOMatic.g:2435:4: (otherlv_1= RULE_ID )
            {
            // InternalSlideOMatic.g:2435:4: (otherlv_1= RULE_ID )
            // InternalSlideOMatic.g:2436:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAnimationRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_41); 

            					newLeafNode(otherlv_1, grammarAccess.getAnimationAccess().getTargetImageCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,103,FOLLOW_42); 

            			newLeafNode(otherlv_2, grammarAccess.getAnimationAccess().getFromKeyword_2());
            		
            // InternalSlideOMatic.g:2451:3: ( (lv_fromLocation_3_0= ruleAlignment ) )
            // InternalSlideOMatic.g:2452:4: (lv_fromLocation_3_0= ruleAlignment )
            {
            // InternalSlideOMatic.g:2452:4: (lv_fromLocation_3_0= ruleAlignment )
            // InternalSlideOMatic.g:2453:5: lv_fromLocation_3_0= ruleAlignment
            {

            					newCompositeNode(grammarAccess.getAnimationAccess().getFromLocationAlignmentParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_43);
            lv_fromLocation_3_0=ruleAlignment();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAnimationRule());
            					}
            					set(
            						current,
            						"fromLocation",
            						lv_fromLocation_3_0,
            						"dk.sdu.mmmi.mdsd.f18.dsl.external.SlideOMatic.Alignment");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,104,FOLLOW_42); 

            			newLeafNode(otherlv_4, grammarAccess.getAnimationAccess().getToKeyword_4());
            		
            // InternalSlideOMatic.g:2474:3: ( (lv_finalLocation_5_0= ruleAlignment ) )
            // InternalSlideOMatic.g:2475:4: (lv_finalLocation_5_0= ruleAlignment )
            {
            // InternalSlideOMatic.g:2475:4: (lv_finalLocation_5_0= ruleAlignment )
            // InternalSlideOMatic.g:2476:5: lv_finalLocation_5_0= ruleAlignment
            {

            					newCompositeNode(grammarAccess.getAnimationAccess().getFinalLocationAlignmentParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_44);
            lv_finalLocation_5_0=ruleAlignment();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAnimationRule());
            					}
            					set(
            						current,
            						"finalLocation",
            						lv_finalLocation_5_0,
            						"dk.sdu.mmmi.mdsd.f18.dsl.external.SlideOMatic.Alignment");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSlideOMatic.g:2493:3: (otherlv_6= 'via' ( (lv_viaLocation_7_0= ruleAlignment ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==105) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalSlideOMatic.g:2494:4: otherlv_6= 'via' ( (lv_viaLocation_7_0= ruleAlignment ) )
                    {
                    otherlv_6=(Token)match(input,105,FOLLOW_42); 

                    				newLeafNode(otherlv_6, grammarAccess.getAnimationAccess().getViaKeyword_6_0());
                    			
                    // InternalSlideOMatic.g:2498:4: ( (lv_viaLocation_7_0= ruleAlignment ) )
                    // InternalSlideOMatic.g:2499:5: (lv_viaLocation_7_0= ruleAlignment )
                    {
                    // InternalSlideOMatic.g:2499:5: (lv_viaLocation_7_0= ruleAlignment )
                    // InternalSlideOMatic.g:2500:6: lv_viaLocation_7_0= ruleAlignment
                    {

                    						newCompositeNode(grammarAccess.getAnimationAccess().getViaLocationAlignmentParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_viaLocation_7_0=ruleAlignment();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAnimationRule());
                    						}
                    						set(
                    							current,
                    							"viaLocation",
                    							lv_viaLocation_7_0,
                    							"dk.sdu.mmmi.mdsd.f18.dsl.external.SlideOMatic.Alignment");
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
    // $ANTLR end "ruleAnimation"


    // $ANTLR start "entryRuleMathExp"
    // InternalSlideOMatic.g:2522:1: entryRuleMathExp returns [EObject current=null] : iv_ruleMathExp= ruleMathExp EOF ;
    public final EObject entryRuleMathExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMathExp = null;


        try {
            // InternalSlideOMatic.g:2522:48: (iv_ruleMathExp= ruleMathExp EOF )
            // InternalSlideOMatic.g:2523:2: iv_ruleMathExp= ruleMathExp EOF
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
    // InternalSlideOMatic.g:2529:1: ruleMathExp returns [EObject current=null] : (otherlv_0= 'math' ( (lv_eval_1_0= 'eval' ) )? ( (lv_exp_2_0= ruleExp ) ) ) ;
    public final EObject ruleMathExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_eval_1_0=null;
        EObject lv_exp_2_0 = null;



        	enterRule();

        try {
            // InternalSlideOMatic.g:2535:2: ( (otherlv_0= 'math' ( (lv_eval_1_0= 'eval' ) )? ( (lv_exp_2_0= ruleExp ) ) ) )
            // InternalSlideOMatic.g:2536:2: (otherlv_0= 'math' ( (lv_eval_1_0= 'eval' ) )? ( (lv_exp_2_0= ruleExp ) ) )
            {
            // InternalSlideOMatic.g:2536:2: (otherlv_0= 'math' ( (lv_eval_1_0= 'eval' ) )? ( (lv_exp_2_0= ruleExp ) ) )
            // InternalSlideOMatic.g:2537:3: otherlv_0= 'math' ( (lv_eval_1_0= 'eval' ) )? ( (lv_exp_2_0= ruleExp ) )
            {
            otherlv_0=(Token)match(input,106,FOLLOW_45); 

            			newLeafNode(otherlv_0, grammarAccess.getMathExpAccess().getMathKeyword_0());
            		
            // InternalSlideOMatic.g:2541:3: ( (lv_eval_1_0= 'eval' ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==107) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalSlideOMatic.g:2542:4: (lv_eval_1_0= 'eval' )
                    {
                    // InternalSlideOMatic.g:2542:4: (lv_eval_1_0= 'eval' )
                    // InternalSlideOMatic.g:2543:5: lv_eval_1_0= 'eval'
                    {
                    lv_eval_1_0=(Token)match(input,107,FOLLOW_45); 

                    					newLeafNode(lv_eval_1_0, grammarAccess.getMathExpAccess().getEvalEvalKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMathExpRule());
                    					}
                    					setWithLastConsumed(current, "eval", lv_eval_1_0, "eval");
                    				

                    }


                    }
                    break;

            }

            // InternalSlideOMatic.g:2555:3: ( (lv_exp_2_0= ruleExp ) )
            // InternalSlideOMatic.g:2556:4: (lv_exp_2_0= ruleExp )
            {
            // InternalSlideOMatic.g:2556:4: (lv_exp_2_0= ruleExp )
            // InternalSlideOMatic.g:2557:5: lv_exp_2_0= ruleExp
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
    // InternalSlideOMatic.g:2578:1: entryRuleExp returns [EObject current=null] : iv_ruleExp= ruleExp EOF ;
    public final EObject entryRuleExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExp = null;


        try {
            // InternalSlideOMatic.g:2578:44: (iv_ruleExp= ruleExp EOF )
            // InternalSlideOMatic.g:2579:2: iv_ruleExp= ruleExp EOF
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
    // InternalSlideOMatic.g:2585:1: ruleExp returns [EObject current=null] : (this_Factor_0= ruleFactor ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleFactor ) ) )* ) ;
    public final EObject ruleExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_Factor_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalSlideOMatic.g:2591:2: ( (this_Factor_0= ruleFactor ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleFactor ) ) )* ) )
            // InternalSlideOMatic.g:2592:2: (this_Factor_0= ruleFactor ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleFactor ) ) )* )
            {
            // InternalSlideOMatic.g:2592:2: (this_Factor_0= ruleFactor ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleFactor ) ) )* )
            // InternalSlideOMatic.g:2593:3: this_Factor_0= ruleFactor ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleFactor ) ) )*
            {

            			newCompositeNode(grammarAccess.getExpAccess().getFactorParserRuleCall_0());
            		
            pushFollow(FOLLOW_46);
            this_Factor_0=ruleFactor();

            state._fsp--;


            			current = this_Factor_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalSlideOMatic.g:2601:3: ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleFactor ) ) )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==80||LA45_0==108) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalSlideOMatic.g:2602:4: ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleFactor ) )
            	    {
            	    // InternalSlideOMatic.g:2602:4: ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) )
            	    int alt44=2;
            	    int LA44_0 = input.LA(1);

            	    if ( (LA44_0==108) ) {
            	        alt44=1;
            	    }
            	    else if ( (LA44_0==80) ) {
            	        alt44=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 44, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt44) {
            	        case 1 :
            	            // InternalSlideOMatic.g:2603:5: (otherlv_1= '+' () )
            	            {
            	            // InternalSlideOMatic.g:2603:5: (otherlv_1= '+' () )
            	            // InternalSlideOMatic.g:2604:6: otherlv_1= '+' ()
            	            {
            	            otherlv_1=(Token)match(input,108,FOLLOW_45); 

            	            						newLeafNode(otherlv_1, grammarAccess.getExpAccess().getPlusSignKeyword_1_0_0_0());
            	            					
            	            // InternalSlideOMatic.g:2608:6: ()
            	            // InternalSlideOMatic.g:2609:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getExpAccess().getPlusLeftAction_1_0_0_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalSlideOMatic.g:2617:5: (otherlv_3= '-' () )
            	            {
            	            // InternalSlideOMatic.g:2617:5: (otherlv_3= '-' () )
            	            // InternalSlideOMatic.g:2618:6: otherlv_3= '-' ()
            	            {
            	            otherlv_3=(Token)match(input,80,FOLLOW_45); 

            	            						newLeafNode(otherlv_3, grammarAccess.getExpAccess().getHyphenMinusKeyword_1_0_1_0());
            	            					
            	            // InternalSlideOMatic.g:2622:6: ()
            	            // InternalSlideOMatic.g:2623:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getExpAccess().getMinusLeftAction_1_0_1_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // InternalSlideOMatic.g:2631:4: ( (lv_right_5_0= ruleFactor ) )
            	    // InternalSlideOMatic.g:2632:5: (lv_right_5_0= ruleFactor )
            	    {
            	    // InternalSlideOMatic.g:2632:5: (lv_right_5_0= ruleFactor )
            	    // InternalSlideOMatic.g:2633:6: lv_right_5_0= ruleFactor
            	    {

            	    						newCompositeNode(grammarAccess.getExpAccess().getRightFactorParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_46);
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
    // $ANTLR end "ruleExp"


    // $ANTLR start "entryRuleFactor"
    // InternalSlideOMatic.g:2655:1: entryRuleFactor returns [EObject current=null] : iv_ruleFactor= ruleFactor EOF ;
    public final EObject entryRuleFactor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFactor = null;


        try {
            // InternalSlideOMatic.g:2655:47: (iv_ruleFactor= ruleFactor EOF )
            // InternalSlideOMatic.g:2656:2: iv_ruleFactor= ruleFactor EOF
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
    // InternalSlideOMatic.g:2662:1: ruleFactor returns [EObject current=null] : (this_Pow_0= rulePow ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= rulePow ) ) )* ) ;
    public final EObject ruleFactor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_Pow_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalSlideOMatic.g:2668:2: ( (this_Pow_0= rulePow ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= rulePow ) ) )* ) )
            // InternalSlideOMatic.g:2669:2: (this_Pow_0= rulePow ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= rulePow ) ) )* )
            {
            // InternalSlideOMatic.g:2669:2: (this_Pow_0= rulePow ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= rulePow ) ) )* )
            // InternalSlideOMatic.g:2670:3: this_Pow_0= rulePow ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= rulePow ) ) )*
            {

            			newCompositeNode(grammarAccess.getFactorAccess().getPowParserRuleCall_0());
            		
            pushFollow(FOLLOW_47);
            this_Pow_0=rulePow();

            state._fsp--;


            			current = this_Pow_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalSlideOMatic.g:2678:3: ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= rulePow ) ) )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==67||LA47_0==109) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalSlideOMatic.g:2679:4: ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= rulePow ) )
            	    {
            	    // InternalSlideOMatic.g:2679:4: ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) )
            	    int alt46=2;
            	    int LA46_0 = input.LA(1);

            	    if ( (LA46_0==67) ) {
            	        alt46=1;
            	    }
            	    else if ( (LA46_0==109) ) {
            	        alt46=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 46, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt46) {
            	        case 1 :
            	            // InternalSlideOMatic.g:2680:5: (otherlv_1= '*' () )
            	            {
            	            // InternalSlideOMatic.g:2680:5: (otherlv_1= '*' () )
            	            // InternalSlideOMatic.g:2681:6: otherlv_1= '*' ()
            	            {
            	            otherlv_1=(Token)match(input,67,FOLLOW_45); 

            	            						newLeafNode(otherlv_1, grammarAccess.getFactorAccess().getAsteriskKeyword_1_0_0_0());
            	            					
            	            // InternalSlideOMatic.g:2685:6: ()
            	            // InternalSlideOMatic.g:2686:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getFactorAccess().getMultLeftAction_1_0_0_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalSlideOMatic.g:2694:5: (otherlv_3= '/' () )
            	            {
            	            // InternalSlideOMatic.g:2694:5: (otherlv_3= '/' () )
            	            // InternalSlideOMatic.g:2695:6: otherlv_3= '/' ()
            	            {
            	            otherlv_3=(Token)match(input,109,FOLLOW_45); 

            	            						newLeafNode(otherlv_3, grammarAccess.getFactorAccess().getSolidusKeyword_1_0_1_0());
            	            					
            	            // InternalSlideOMatic.g:2699:6: ()
            	            // InternalSlideOMatic.g:2700:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getFactorAccess().getDivLeftAction_1_0_1_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // InternalSlideOMatic.g:2708:4: ( (lv_right_5_0= rulePow ) )
            	    // InternalSlideOMatic.g:2709:5: (lv_right_5_0= rulePow )
            	    {
            	    // InternalSlideOMatic.g:2709:5: (lv_right_5_0= rulePow )
            	    // InternalSlideOMatic.g:2710:6: lv_right_5_0= rulePow
            	    {

            	    						newCompositeNode(grammarAccess.getFactorAccess().getRightPowParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_47);
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
            	    break loop47;
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
    // InternalSlideOMatic.g:2732:1: entryRulePow returns [EObject current=null] : iv_rulePow= rulePow EOF ;
    public final EObject entryRulePow() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePow = null;


        try {
            // InternalSlideOMatic.g:2732:44: (iv_rulePow= rulePow EOF )
            // InternalSlideOMatic.g:2733:2: iv_rulePow= rulePow EOF
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
    // InternalSlideOMatic.g:2739:1: rulePow returns [EObject current=null] : (this_Primary_0= rulePrimary ( () otherlv_2= '^' ( (lv_right_3_0= rulePrimary ) ) )? ) ;
    public final EObject rulePow() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Primary_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalSlideOMatic.g:2745:2: ( (this_Primary_0= rulePrimary ( () otherlv_2= '^' ( (lv_right_3_0= rulePrimary ) ) )? ) )
            // InternalSlideOMatic.g:2746:2: (this_Primary_0= rulePrimary ( () otherlv_2= '^' ( (lv_right_3_0= rulePrimary ) ) )? )
            {
            // InternalSlideOMatic.g:2746:2: (this_Primary_0= rulePrimary ( () otherlv_2= '^' ( (lv_right_3_0= rulePrimary ) ) )? )
            // InternalSlideOMatic.g:2747:3: this_Primary_0= rulePrimary ( () otherlv_2= '^' ( (lv_right_3_0= rulePrimary ) ) )?
            {

            			newCompositeNode(grammarAccess.getPowAccess().getPrimaryParserRuleCall_0());
            		
            pushFollow(FOLLOW_48);
            this_Primary_0=rulePrimary();

            state._fsp--;


            			current = this_Primary_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalSlideOMatic.g:2755:3: ( () otherlv_2= '^' ( (lv_right_3_0= rulePrimary ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==110) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalSlideOMatic.g:2756:4: () otherlv_2= '^' ( (lv_right_3_0= rulePrimary ) )
                    {
                    // InternalSlideOMatic.g:2756:4: ()
                    // InternalSlideOMatic.g:2757:5: 
                    {

                    					current = forceCreateModelElementAndSet(
                    						grammarAccess.getPowAccess().getPowLeftAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_2=(Token)match(input,110,FOLLOW_45); 

                    				newLeafNode(otherlv_2, grammarAccess.getPowAccess().getCircumflexAccentKeyword_1_1());
                    			
                    // InternalSlideOMatic.g:2767:4: ( (lv_right_3_0= rulePrimary ) )
                    // InternalSlideOMatic.g:2768:5: (lv_right_3_0= rulePrimary )
                    {
                    // InternalSlideOMatic.g:2768:5: (lv_right_3_0= rulePrimary )
                    // InternalSlideOMatic.g:2769:6: lv_right_3_0= rulePrimary
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
    // InternalSlideOMatic.g:2791:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalSlideOMatic.g:2791:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalSlideOMatic.g:2792:2: iv_rulePrimary= rulePrimary EOF
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
    // InternalSlideOMatic.g:2798:1: rulePrimary returns [EObject current=null] : (this_Number_0= ruleNumber | this_Parenthesis_1= ruleParenthesis | this_VariableBinding_2= ruleVariableBinding | this_VariableUse_3= ruleVariableUse ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        EObject this_Number_0 = null;

        EObject this_Parenthesis_1 = null;

        EObject this_VariableBinding_2 = null;

        EObject this_VariableUse_3 = null;



        	enterRule();

        try {
            // InternalSlideOMatic.g:2804:2: ( (this_Number_0= ruleNumber | this_Parenthesis_1= ruleParenthesis | this_VariableBinding_2= ruleVariableBinding | this_VariableUse_3= ruleVariableUse ) )
            // InternalSlideOMatic.g:2805:2: (this_Number_0= ruleNumber | this_Parenthesis_1= ruleParenthesis | this_VariableBinding_2= ruleVariableBinding | this_VariableUse_3= ruleVariableUse )
            {
            // InternalSlideOMatic.g:2805:2: (this_Number_0= ruleNumber | this_Parenthesis_1= ruleParenthesis | this_VariableBinding_2= ruleVariableBinding | this_VariableUse_3= ruleVariableUse )
            int alt49=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt49=1;
                }
                break;
            case 13:
                {
                alt49=2;
                }
                break;
            case 111:
                {
                alt49=3;
                }
                break;
            case RULE_ID:
                {
                alt49=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }

            switch (alt49) {
                case 1 :
                    // InternalSlideOMatic.g:2806:3: this_Number_0= ruleNumber
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
                    // InternalSlideOMatic.g:2815:3: this_Parenthesis_1= ruleParenthesis
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
                    // InternalSlideOMatic.g:2824:3: this_VariableBinding_2= ruleVariableBinding
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
                    // InternalSlideOMatic.g:2833:3: this_VariableUse_3= ruleVariableUse
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
    // InternalSlideOMatic.g:2845:1: entryRuleVariableUse returns [EObject current=null] : iv_ruleVariableUse= ruleVariableUse EOF ;
    public final EObject entryRuleVariableUse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableUse = null;


        try {
            // InternalSlideOMatic.g:2845:52: (iv_ruleVariableUse= ruleVariableUse EOF )
            // InternalSlideOMatic.g:2846:2: iv_ruleVariableUse= ruleVariableUse EOF
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
    // InternalSlideOMatic.g:2852:1: ruleVariableUse returns [EObject current=null] : ( () ( (lv_id_1_0= RULE_ID ) ) ) ;
    public final EObject ruleVariableUse() throws RecognitionException {
        EObject current = null;

        Token lv_id_1_0=null;


        	enterRule();

        try {
            // InternalSlideOMatic.g:2858:2: ( ( () ( (lv_id_1_0= RULE_ID ) ) ) )
            // InternalSlideOMatic.g:2859:2: ( () ( (lv_id_1_0= RULE_ID ) ) )
            {
            // InternalSlideOMatic.g:2859:2: ( () ( (lv_id_1_0= RULE_ID ) ) )
            // InternalSlideOMatic.g:2860:3: () ( (lv_id_1_0= RULE_ID ) )
            {
            // InternalSlideOMatic.g:2860:3: ()
            // InternalSlideOMatic.g:2861:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVariableUseAccess().getVarAction_0(),
            					current);
            			

            }

            // InternalSlideOMatic.g:2867:3: ( (lv_id_1_0= RULE_ID ) )
            // InternalSlideOMatic.g:2868:4: (lv_id_1_0= RULE_ID )
            {
            // InternalSlideOMatic.g:2868:4: (lv_id_1_0= RULE_ID )
            // InternalSlideOMatic.g:2869:5: lv_id_1_0= RULE_ID
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
    // InternalSlideOMatic.g:2889:1: entryRuleVariableBinding returns [EObject current=null] : iv_ruleVariableBinding= ruleVariableBinding EOF ;
    public final EObject entryRuleVariableBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableBinding = null;


        try {
            // InternalSlideOMatic.g:2889:56: (iv_ruleVariableBinding= ruleVariableBinding EOF )
            // InternalSlideOMatic.g:2890:2: iv_ruleVariableBinding= ruleVariableBinding EOF
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
    // InternalSlideOMatic.g:2896:1: ruleVariableBinding returns [EObject current=null] : ( () otherlv_1= 'let' ( (lv_id_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_binding_4_0= ruleExp ) ) otherlv_5= 'in' ( (lv_body_6_0= ruleExp ) ) otherlv_7= 'end' ) ;
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
            // InternalSlideOMatic.g:2902:2: ( ( () otherlv_1= 'let' ( (lv_id_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_binding_4_0= ruleExp ) ) otherlv_5= 'in' ( (lv_body_6_0= ruleExp ) ) otherlv_7= 'end' ) )
            // InternalSlideOMatic.g:2903:2: ( () otherlv_1= 'let' ( (lv_id_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_binding_4_0= ruleExp ) ) otherlv_5= 'in' ( (lv_body_6_0= ruleExp ) ) otherlv_7= 'end' )
            {
            // InternalSlideOMatic.g:2903:2: ( () otherlv_1= 'let' ( (lv_id_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_binding_4_0= ruleExp ) ) otherlv_5= 'in' ( (lv_body_6_0= ruleExp ) ) otherlv_7= 'end' )
            // InternalSlideOMatic.g:2904:3: () otherlv_1= 'let' ( (lv_id_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_binding_4_0= ruleExp ) ) otherlv_5= 'in' ( (lv_body_6_0= ruleExp ) ) otherlv_7= 'end'
            {
            // InternalSlideOMatic.g:2904:3: ()
            // InternalSlideOMatic.g:2905:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVariableBindingAccess().getLetAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,111,FOLLOW_28); 

            			newLeafNode(otherlv_1, grammarAccess.getVariableBindingAccess().getLetKeyword_1());
            		
            // InternalSlideOMatic.g:2915:3: ( (lv_id_2_0= RULE_ID ) )
            // InternalSlideOMatic.g:2916:4: (lv_id_2_0= RULE_ID )
            {
            // InternalSlideOMatic.g:2916:4: (lv_id_2_0= RULE_ID )
            // InternalSlideOMatic.g:2917:5: lv_id_2_0= RULE_ID
            {
            lv_id_2_0=(Token)match(input,RULE_ID,FOLLOW_49); 

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

            otherlv_3=(Token)match(input,112,FOLLOW_45); 

            			newLeafNode(otherlv_3, grammarAccess.getVariableBindingAccess().getEqualsSignKeyword_3());
            		
            // InternalSlideOMatic.g:2937:3: ( (lv_binding_4_0= ruleExp ) )
            // InternalSlideOMatic.g:2938:4: (lv_binding_4_0= ruleExp )
            {
            // InternalSlideOMatic.g:2938:4: (lv_binding_4_0= ruleExp )
            // InternalSlideOMatic.g:2939:5: lv_binding_4_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getVariableBindingAccess().getBindingExpParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_50);
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

            otherlv_5=(Token)match(input,113,FOLLOW_45); 

            			newLeafNode(otherlv_5, grammarAccess.getVariableBindingAccess().getInKeyword_5());
            		
            // InternalSlideOMatic.g:2960:3: ( (lv_body_6_0= ruleExp ) )
            // InternalSlideOMatic.g:2961:4: (lv_body_6_0= ruleExp )
            {
            // InternalSlideOMatic.g:2961:4: (lv_body_6_0= ruleExp )
            // InternalSlideOMatic.g:2962:5: lv_body_6_0= ruleExp
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

            otherlv_7=(Token)match(input,97,FOLLOW_2); 

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
    // InternalSlideOMatic.g:2987:1: entryRuleParenthesis returns [EObject current=null] : iv_ruleParenthesis= ruleParenthesis EOF ;
    public final EObject entryRuleParenthesis() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParenthesis = null;


        try {
            // InternalSlideOMatic.g:2987:52: (iv_ruleParenthesis= ruleParenthesis EOF )
            // InternalSlideOMatic.g:2988:2: iv_ruleParenthesis= ruleParenthesis EOF
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
    // InternalSlideOMatic.g:2994:1: ruleParenthesis returns [EObject current=null] : (otherlv_0= '(' this_Exp_1= ruleExp otherlv_2= ')' ) ;
    public final EObject ruleParenthesis() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Exp_1 = null;



        	enterRule();

        try {
            // InternalSlideOMatic.g:3000:2: ( (otherlv_0= '(' this_Exp_1= ruleExp otherlv_2= ')' ) )
            // InternalSlideOMatic.g:3001:2: (otherlv_0= '(' this_Exp_1= ruleExp otherlv_2= ')' )
            {
            // InternalSlideOMatic.g:3001:2: (otherlv_0= '(' this_Exp_1= ruleExp otherlv_2= ')' )
            // InternalSlideOMatic.g:3002:3: otherlv_0= '(' this_Exp_1= ruleExp otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_45); 

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
    // InternalSlideOMatic.g:3022:1: entryRuleNumber returns [EObject current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final EObject entryRuleNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumber = null;


        try {
            // InternalSlideOMatic.g:3022:47: (iv_ruleNumber= ruleNumber EOF )
            // InternalSlideOMatic.g:3023:2: iv_ruleNumber= ruleNumber EOF
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
    // InternalSlideOMatic.g:3029:1: ruleNumber returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleNumber() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalSlideOMatic.g:3035:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) )
            // InternalSlideOMatic.g:3036:2: ( () ( (lv_value_1_0= RULE_INT ) ) )
            {
            // InternalSlideOMatic.g:3036:2: ( () ( (lv_value_1_0= RULE_INT ) ) )
            // InternalSlideOMatic.g:3037:3: () ( (lv_value_1_0= RULE_INT ) )
            {
            // InternalSlideOMatic.g:3037:3: ()
            // InternalSlideOMatic.g:3038:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNumberAccess().getNumAction_0(),
            					current);
            			

            }

            // InternalSlideOMatic.g:3044:3: ( (lv_value_1_0= RULE_INT ) )
            // InternalSlideOMatic.g:3045:4: (lv_value_1_0= RULE_INT )
            {
            // InternalSlideOMatic.g:3045:4: (lv_value_1_0= RULE_INT )
            // InternalSlideOMatic.g:3046:5: lv_value_1_0= RULE_INT
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
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000A000L,0x0000000000020010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0xC000000000014000L,0x0000000000000006L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0xC000000000004000L,0x0000000000000006L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004000L,0x0000000000000006L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000004000L,0x0000000000000004L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000008000L,0x0000000000020010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00003FFFFFFC0000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x3FFFC00010000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000008L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000001010L,0x0000000000000068L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000010L,0x000004452008FF80L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000008010L,0x000004452008FF80L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000002L,0x0000002000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000010L,0x0000000000001F00L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000002002L,0x0000002000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000000L,0x000000000000C000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000040L,0x0000000018700000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000000L,0x0000000007000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000001L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000000L,0x0000000A00000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000001L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000002L,0x0000001000000001L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000000L,0x0000000000700000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000002L,0x0000020000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000002060L,0x0000880000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000002L,0x0000100000010000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000002L,0x0000200000000008L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000002L,0x0000400000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});

}