package dk.sdu.mmmi.mdsd.f18.dsl.external.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import dk.sdu.mmmi.mdsd.f18.dsl.external.services.SlideOMaticGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSlideOMaticParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'$$'", "'AnnArbor'", "'Antibes'", "'Bergen'", "'Berkeley'", "'Berlin'", "'Boadilla'", "'boxes'", "'CambridgeUS'", "'Copenhagen'", "'Darmstadt'", "'default'", "'Dresden'", "'Frankfurt'", "'Goettingen'", "'Hannover'", "'Ilmanau'", "'JuanLesPins'", "'Luebeck'", "'Madrid'", "'Malmoe'", "'Marburg'", "'Montpellier'", "'PaloAlto'", "'Pittsburgh'", "'Rochester'", "'Singapore'", "'Szeged'", "'Warsaw'", "'albatros'", "'beaver'", "'beetle'", "'crane'", "'dolphin'", "'dove'", "'fly'", "'lily'", "'orchid'", "'rose'", "'seagull'", "'seahorse'", "'sidebartab'", "'structure'", "'whale'", "'wolverine'", "'topleft'", "'top'", "'topright'", "'left'", "'center'", "'right'", "'bottomleft'", "'bottom'", "'bottomright'", "'width'", "'height'", "'presentation'", "'{'", "'}'", "'('", "')'", "'theme'", "'color'", "'author'", "','", "'institute'", "'date'", "'slide'", "'*'", "'**'", "'***'", "'ToC'", "'>'", "'block'", "'#list'", "'-list'", "'##'", "'--'", "'img'", "'src'", "'%'", "'tab'", "'['", "']'", "'animate'", "'to'", "'move'", "'jump'"
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

    	public void setGrammarAccess(SlideOMaticGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRulePresentation"
    // InternalSlideOMatic.g:53:1: entryRulePresentation : rulePresentation EOF ;
    public final void entryRulePresentation() throws RecognitionException {
        try {
            // InternalSlideOMatic.g:54:1: ( rulePresentation EOF )
            // InternalSlideOMatic.g:55:1: rulePresentation EOF
            {
             before(grammarAccess.getPresentationRule()); 
            pushFollow(FOLLOW_1);
            rulePresentation();

            state._fsp--;

             after(grammarAccess.getPresentationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePresentation"


    // $ANTLR start "rulePresentation"
    // InternalSlideOMatic.g:62:1: rulePresentation : ( ( rule__Presentation__Group__0 ) ) ;
    public final void rulePresentation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:66:2: ( ( ( rule__Presentation__Group__0 ) ) )
            // InternalSlideOMatic.g:67:2: ( ( rule__Presentation__Group__0 ) )
            {
            // InternalSlideOMatic.g:67:2: ( ( rule__Presentation__Group__0 ) )
            // InternalSlideOMatic.g:68:3: ( rule__Presentation__Group__0 )
            {
             before(grammarAccess.getPresentationAccess().getGroup()); 
            // InternalSlideOMatic.g:69:3: ( rule__Presentation__Group__0 )
            // InternalSlideOMatic.g:69:4: rule__Presentation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Presentation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPresentationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePresentation"


    // $ANTLR start "entryRuleTheme"
    // InternalSlideOMatic.g:78:1: entryRuleTheme : ruleTheme EOF ;
    public final void entryRuleTheme() throws RecognitionException {
        try {
            // InternalSlideOMatic.g:79:1: ( ruleTheme EOF )
            // InternalSlideOMatic.g:80:1: ruleTheme EOF
            {
             before(grammarAccess.getThemeRule()); 
            pushFollow(FOLLOW_1);
            ruleTheme();

            state._fsp--;

             after(grammarAccess.getThemeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTheme"


    // $ANTLR start "ruleTheme"
    // InternalSlideOMatic.g:87:1: ruleTheme : ( ( rule__Theme__Group__0 ) ) ;
    public final void ruleTheme() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:91:2: ( ( ( rule__Theme__Group__0 ) ) )
            // InternalSlideOMatic.g:92:2: ( ( rule__Theme__Group__0 ) )
            {
            // InternalSlideOMatic.g:92:2: ( ( rule__Theme__Group__0 ) )
            // InternalSlideOMatic.g:93:3: ( rule__Theme__Group__0 )
            {
             before(grammarAccess.getThemeAccess().getGroup()); 
            // InternalSlideOMatic.g:94:3: ( rule__Theme__Group__0 )
            // InternalSlideOMatic.g:94:4: rule__Theme__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Theme__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getThemeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTheme"


    // $ANTLR start "entryRuleBeamerTheme"
    // InternalSlideOMatic.g:103:1: entryRuleBeamerTheme : ruleBeamerTheme EOF ;
    public final void entryRuleBeamerTheme() throws RecognitionException {
        try {
            // InternalSlideOMatic.g:104:1: ( ruleBeamerTheme EOF )
            // InternalSlideOMatic.g:105:1: ruleBeamerTheme EOF
            {
             before(grammarAccess.getBeamerThemeRule()); 
            pushFollow(FOLLOW_1);
            ruleBeamerTheme();

            state._fsp--;

             after(grammarAccess.getBeamerThemeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBeamerTheme"


    // $ANTLR start "ruleBeamerTheme"
    // InternalSlideOMatic.g:112:1: ruleBeamerTheme : ( ( rule__BeamerTheme__Alternatives ) ) ;
    public final void ruleBeamerTheme() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:116:2: ( ( ( rule__BeamerTheme__Alternatives ) ) )
            // InternalSlideOMatic.g:117:2: ( ( rule__BeamerTheme__Alternatives ) )
            {
            // InternalSlideOMatic.g:117:2: ( ( rule__BeamerTheme__Alternatives ) )
            // InternalSlideOMatic.g:118:3: ( rule__BeamerTheme__Alternatives )
            {
             before(grammarAccess.getBeamerThemeAccess().getAlternatives()); 
            // InternalSlideOMatic.g:119:3: ( rule__BeamerTheme__Alternatives )
            // InternalSlideOMatic.g:119:4: rule__BeamerTheme__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BeamerTheme__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBeamerThemeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBeamerTheme"


    // $ANTLR start "entryRuleThemeColor"
    // InternalSlideOMatic.g:128:1: entryRuleThemeColor : ruleThemeColor EOF ;
    public final void entryRuleThemeColor() throws RecognitionException {
        try {
            // InternalSlideOMatic.g:129:1: ( ruleThemeColor EOF )
            // InternalSlideOMatic.g:130:1: ruleThemeColor EOF
            {
             before(grammarAccess.getThemeColorRule()); 
            pushFollow(FOLLOW_1);
            ruleThemeColor();

            state._fsp--;

             after(grammarAccess.getThemeColorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleThemeColor"


    // $ANTLR start "ruleThemeColor"
    // InternalSlideOMatic.g:137:1: ruleThemeColor : ( ( rule__ThemeColor__Alternatives ) ) ;
    public final void ruleThemeColor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:141:2: ( ( ( rule__ThemeColor__Alternatives ) ) )
            // InternalSlideOMatic.g:142:2: ( ( rule__ThemeColor__Alternatives ) )
            {
            // InternalSlideOMatic.g:142:2: ( ( rule__ThemeColor__Alternatives ) )
            // InternalSlideOMatic.g:143:3: ( rule__ThemeColor__Alternatives )
            {
             before(grammarAccess.getThemeColorAccess().getAlternatives()); 
            // InternalSlideOMatic.g:144:3: ( rule__ThemeColor__Alternatives )
            // InternalSlideOMatic.g:144:4: rule__ThemeColor__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ThemeColor__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getThemeColorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleThemeColor"


    // $ANTLR start "entryRuleAuthors"
    // InternalSlideOMatic.g:153:1: entryRuleAuthors : ruleAuthors EOF ;
    public final void entryRuleAuthors() throws RecognitionException {
        try {
            // InternalSlideOMatic.g:154:1: ( ruleAuthors EOF )
            // InternalSlideOMatic.g:155:1: ruleAuthors EOF
            {
             before(grammarAccess.getAuthorsRule()); 
            pushFollow(FOLLOW_1);
            ruleAuthors();

            state._fsp--;

             after(grammarAccess.getAuthorsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAuthors"


    // $ANTLR start "ruleAuthors"
    // InternalSlideOMatic.g:162:1: ruleAuthors : ( ( rule__Authors__Group__0 ) ) ;
    public final void ruleAuthors() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:166:2: ( ( ( rule__Authors__Group__0 ) ) )
            // InternalSlideOMatic.g:167:2: ( ( rule__Authors__Group__0 ) )
            {
            // InternalSlideOMatic.g:167:2: ( ( rule__Authors__Group__0 ) )
            // InternalSlideOMatic.g:168:3: ( rule__Authors__Group__0 )
            {
             before(grammarAccess.getAuthorsAccess().getGroup()); 
            // InternalSlideOMatic.g:169:3: ( rule__Authors__Group__0 )
            // InternalSlideOMatic.g:169:4: rule__Authors__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Authors__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAuthorsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAuthors"


    // $ANTLR start "entryRuleInstitute"
    // InternalSlideOMatic.g:178:1: entryRuleInstitute : ruleInstitute EOF ;
    public final void entryRuleInstitute() throws RecognitionException {
        try {
            // InternalSlideOMatic.g:179:1: ( ruleInstitute EOF )
            // InternalSlideOMatic.g:180:1: ruleInstitute EOF
            {
             before(grammarAccess.getInstituteRule()); 
            pushFollow(FOLLOW_1);
            ruleInstitute();

            state._fsp--;

             after(grammarAccess.getInstituteRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInstitute"


    // $ANTLR start "ruleInstitute"
    // InternalSlideOMatic.g:187:1: ruleInstitute : ( ( rule__Institute__Group__0 ) ) ;
    public final void ruleInstitute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:191:2: ( ( ( rule__Institute__Group__0 ) ) )
            // InternalSlideOMatic.g:192:2: ( ( rule__Institute__Group__0 ) )
            {
            // InternalSlideOMatic.g:192:2: ( ( rule__Institute__Group__0 ) )
            // InternalSlideOMatic.g:193:3: ( rule__Institute__Group__0 )
            {
             before(grammarAccess.getInstituteAccess().getGroup()); 
            // InternalSlideOMatic.g:194:3: ( rule__Institute__Group__0 )
            // InternalSlideOMatic.g:194:4: rule__Institute__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Institute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInstituteAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInstitute"


    // $ANTLR start "entryRuleDate"
    // InternalSlideOMatic.g:203:1: entryRuleDate : ruleDate EOF ;
    public final void entryRuleDate() throws RecognitionException {
        try {
            // InternalSlideOMatic.g:204:1: ( ruleDate EOF )
            // InternalSlideOMatic.g:205:1: ruleDate EOF
            {
             before(grammarAccess.getDateRule()); 
            pushFollow(FOLLOW_1);
            ruleDate();

            state._fsp--;

             after(grammarAccess.getDateRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDate"


    // $ANTLR start "ruleDate"
    // InternalSlideOMatic.g:212:1: ruleDate : ( ( rule__Date__Group__0 ) ) ;
    public final void ruleDate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:216:2: ( ( ( rule__Date__Group__0 ) ) )
            // InternalSlideOMatic.g:217:2: ( ( rule__Date__Group__0 ) )
            {
            // InternalSlideOMatic.g:217:2: ( ( rule__Date__Group__0 ) )
            // InternalSlideOMatic.g:218:3: ( rule__Date__Group__0 )
            {
             before(grammarAccess.getDateAccess().getGroup()); 
            // InternalSlideOMatic.g:219:3: ( rule__Date__Group__0 )
            // InternalSlideOMatic.g:219:4: rule__Date__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Date__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDate"


    // $ANTLR start "entryRuleSlide"
    // InternalSlideOMatic.g:228:1: entryRuleSlide : ruleSlide EOF ;
    public final void entryRuleSlide() throws RecognitionException {
        try {
            // InternalSlideOMatic.g:229:1: ( ruleSlide EOF )
            // InternalSlideOMatic.g:230:1: ruleSlide EOF
            {
             before(grammarAccess.getSlideRule()); 
            pushFollow(FOLLOW_1);
            ruleSlide();

            state._fsp--;

             after(grammarAccess.getSlideRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSlide"


    // $ANTLR start "ruleSlide"
    // InternalSlideOMatic.g:237:1: ruleSlide : ( ( rule__Slide__Group__0 ) ) ;
    public final void ruleSlide() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:241:2: ( ( ( rule__Slide__Group__0 ) ) )
            // InternalSlideOMatic.g:242:2: ( ( rule__Slide__Group__0 ) )
            {
            // InternalSlideOMatic.g:242:2: ( ( rule__Slide__Group__0 ) )
            // InternalSlideOMatic.g:243:3: ( rule__Slide__Group__0 )
            {
             before(grammarAccess.getSlideAccess().getGroup()); 
            // InternalSlideOMatic.g:244:3: ( rule__Slide__Group__0 )
            // InternalSlideOMatic.g:244:4: rule__Slide__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Slide__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSlideAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSlide"


    // $ANTLR start "entryRuleSection"
    // InternalSlideOMatic.g:253:1: entryRuleSection : ruleSection EOF ;
    public final void entryRuleSection() throws RecognitionException {
        try {
            // InternalSlideOMatic.g:254:1: ( ruleSection EOF )
            // InternalSlideOMatic.g:255:1: ruleSection EOF
            {
             before(grammarAccess.getSectionRule()); 
            pushFollow(FOLLOW_1);
            ruleSection();

            state._fsp--;

             after(grammarAccess.getSectionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSection"


    // $ANTLR start "ruleSection"
    // InternalSlideOMatic.g:262:1: ruleSection : ( ( rule__Section__Alternatives ) ) ;
    public final void ruleSection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:266:2: ( ( ( rule__Section__Alternatives ) ) )
            // InternalSlideOMatic.g:267:2: ( ( rule__Section__Alternatives ) )
            {
            // InternalSlideOMatic.g:267:2: ( ( rule__Section__Alternatives ) )
            // InternalSlideOMatic.g:268:3: ( rule__Section__Alternatives )
            {
             before(grammarAccess.getSectionAccess().getAlternatives()); 
            // InternalSlideOMatic.g:269:3: ( rule__Section__Alternatives )
            // InternalSlideOMatic.g:269:4: rule__Section__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Section__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSectionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSection"


    // $ANTLR start "entryRuleContent"
    // InternalSlideOMatic.g:278:1: entryRuleContent : ruleContent EOF ;
    public final void entryRuleContent() throws RecognitionException {
        try {
            // InternalSlideOMatic.g:279:1: ( ruleContent EOF )
            // InternalSlideOMatic.g:280:1: ruleContent EOF
            {
             before(grammarAccess.getContentRule()); 
            pushFollow(FOLLOW_1);
            ruleContent();

            state._fsp--;

             after(grammarAccess.getContentRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleContent"


    // $ANTLR start "ruleContent"
    // InternalSlideOMatic.g:287:1: ruleContent : ( ( rule__Content__Alternatives ) ) ;
    public final void ruleContent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:291:2: ( ( ( rule__Content__Alternatives ) ) )
            // InternalSlideOMatic.g:292:2: ( ( rule__Content__Alternatives ) )
            {
            // InternalSlideOMatic.g:292:2: ( ( rule__Content__Alternatives ) )
            // InternalSlideOMatic.g:293:3: ( rule__Content__Alternatives )
            {
             before(grammarAccess.getContentAccess().getAlternatives()); 
            // InternalSlideOMatic.g:294:3: ( rule__Content__Alternatives )
            // InternalSlideOMatic.g:294:4: rule__Content__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Content__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getContentAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleContent"


    // $ANTLR start "entryRuleText"
    // InternalSlideOMatic.g:303:1: entryRuleText : ruleText EOF ;
    public final void entryRuleText() throws RecognitionException {
        try {
            // InternalSlideOMatic.g:304:1: ( ruleText EOF )
            // InternalSlideOMatic.g:305:1: ruleText EOF
            {
             before(grammarAccess.getTextRule()); 
            pushFollow(FOLLOW_1);
            ruleText();

            state._fsp--;

             after(grammarAccess.getTextRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleText"


    // $ANTLR start "ruleText"
    // InternalSlideOMatic.g:312:1: ruleText : ( ( rule__Text__Alternatives ) ) ;
    public final void ruleText() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:316:2: ( ( ( rule__Text__Alternatives ) ) )
            // InternalSlideOMatic.g:317:2: ( ( rule__Text__Alternatives ) )
            {
            // InternalSlideOMatic.g:317:2: ( ( rule__Text__Alternatives ) )
            // InternalSlideOMatic.g:318:3: ( rule__Text__Alternatives )
            {
             before(grammarAccess.getTextAccess().getAlternatives()); 
            // InternalSlideOMatic.g:319:3: ( rule__Text__Alternatives )
            // InternalSlideOMatic.g:319:4: rule__Text__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Text__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTextAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleText"


    // $ANTLR start "entryRuleList"
    // InternalSlideOMatic.g:328:1: entryRuleList : ruleList EOF ;
    public final void entryRuleList() throws RecognitionException {
        try {
            // InternalSlideOMatic.g:329:1: ( ruleList EOF )
            // InternalSlideOMatic.g:330:1: ruleList EOF
            {
             before(grammarAccess.getListRule()); 
            pushFollow(FOLLOW_1);
            ruleList();

            state._fsp--;

             after(grammarAccess.getListRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleList"


    // $ANTLR start "ruleList"
    // InternalSlideOMatic.g:337:1: ruleList : ( ( rule__List__Alternatives ) ) ;
    public final void ruleList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:341:2: ( ( ( rule__List__Alternatives ) ) )
            // InternalSlideOMatic.g:342:2: ( ( rule__List__Alternatives ) )
            {
            // InternalSlideOMatic.g:342:2: ( ( rule__List__Alternatives ) )
            // InternalSlideOMatic.g:343:3: ( rule__List__Alternatives )
            {
             before(grammarAccess.getListAccess().getAlternatives()); 
            // InternalSlideOMatic.g:344:3: ( rule__List__Alternatives )
            // InternalSlideOMatic.g:344:4: rule__List__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__List__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getListAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleList"


    // $ANTLR start "entryRuleNumberedListItem"
    // InternalSlideOMatic.g:353:1: entryRuleNumberedListItem : ruleNumberedListItem EOF ;
    public final void entryRuleNumberedListItem() throws RecognitionException {
        try {
            // InternalSlideOMatic.g:354:1: ( ruleNumberedListItem EOF )
            // InternalSlideOMatic.g:355:1: ruleNumberedListItem EOF
            {
             before(grammarAccess.getNumberedListItemRule()); 
            pushFollow(FOLLOW_1);
            ruleNumberedListItem();

            state._fsp--;

             after(grammarAccess.getNumberedListItemRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNumberedListItem"


    // $ANTLR start "ruleNumberedListItem"
    // InternalSlideOMatic.g:362:1: ruleNumberedListItem : ( ( rule__NumberedListItem__Group__0 ) ) ;
    public final void ruleNumberedListItem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:366:2: ( ( ( rule__NumberedListItem__Group__0 ) ) )
            // InternalSlideOMatic.g:367:2: ( ( rule__NumberedListItem__Group__0 ) )
            {
            // InternalSlideOMatic.g:367:2: ( ( rule__NumberedListItem__Group__0 ) )
            // InternalSlideOMatic.g:368:3: ( rule__NumberedListItem__Group__0 )
            {
             before(grammarAccess.getNumberedListItemAccess().getGroup()); 
            // InternalSlideOMatic.g:369:3: ( rule__NumberedListItem__Group__0 )
            // InternalSlideOMatic.g:369:4: rule__NumberedListItem__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NumberedListItem__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNumberedListItemAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNumberedListItem"


    // $ANTLR start "entryRuleUnNumberedListItem"
    // InternalSlideOMatic.g:378:1: entryRuleUnNumberedListItem : ruleUnNumberedListItem EOF ;
    public final void entryRuleUnNumberedListItem() throws RecognitionException {
        try {
            // InternalSlideOMatic.g:379:1: ( ruleUnNumberedListItem EOF )
            // InternalSlideOMatic.g:380:1: ruleUnNumberedListItem EOF
            {
             before(grammarAccess.getUnNumberedListItemRule()); 
            pushFollow(FOLLOW_1);
            ruleUnNumberedListItem();

            state._fsp--;

             after(grammarAccess.getUnNumberedListItemRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUnNumberedListItem"


    // $ANTLR start "ruleUnNumberedListItem"
    // InternalSlideOMatic.g:387:1: ruleUnNumberedListItem : ( ( rule__UnNumberedListItem__Group__0 ) ) ;
    public final void ruleUnNumberedListItem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:391:2: ( ( ( rule__UnNumberedListItem__Group__0 ) ) )
            // InternalSlideOMatic.g:392:2: ( ( rule__UnNumberedListItem__Group__0 ) )
            {
            // InternalSlideOMatic.g:392:2: ( ( rule__UnNumberedListItem__Group__0 ) )
            // InternalSlideOMatic.g:393:3: ( rule__UnNumberedListItem__Group__0 )
            {
             before(grammarAccess.getUnNumberedListItemAccess().getGroup()); 
            // InternalSlideOMatic.g:394:3: ( rule__UnNumberedListItem__Group__0 )
            // InternalSlideOMatic.g:394:4: rule__UnNumberedListItem__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__UnNumberedListItem__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUnNumberedListItemAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUnNumberedListItem"


    // $ANTLR start "entryRuleFloat"
    // InternalSlideOMatic.g:403:1: entryRuleFloat : ruleFloat EOF ;
    public final void entryRuleFloat() throws RecognitionException {
        try {
            // InternalSlideOMatic.g:404:1: ( ruleFloat EOF )
            // InternalSlideOMatic.g:405:1: ruleFloat EOF
            {
             before(grammarAccess.getFloatRule()); 
            pushFollow(FOLLOW_1);
            ruleFloat();

            state._fsp--;

             after(grammarAccess.getFloatRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFloat"


    // $ANTLR start "ruleFloat"
    // InternalSlideOMatic.g:412:1: ruleFloat : ( ( rule__Float__Alternatives ) ) ;
    public final void ruleFloat() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:416:2: ( ( ( rule__Float__Alternatives ) ) )
            // InternalSlideOMatic.g:417:2: ( ( rule__Float__Alternatives ) )
            {
            // InternalSlideOMatic.g:417:2: ( ( rule__Float__Alternatives ) )
            // InternalSlideOMatic.g:418:3: ( rule__Float__Alternatives )
            {
             before(grammarAccess.getFloatAccess().getAlternatives()); 
            // InternalSlideOMatic.g:419:3: ( rule__Float__Alternatives )
            // InternalSlideOMatic.g:419:4: rule__Float__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Float__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFloatAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFloat"


    // $ANTLR start "entryRuleImage"
    // InternalSlideOMatic.g:428:1: entryRuleImage : ruleImage EOF ;
    public final void entryRuleImage() throws RecognitionException {
        try {
            // InternalSlideOMatic.g:429:1: ( ruleImage EOF )
            // InternalSlideOMatic.g:430:1: ruleImage EOF
            {
             before(grammarAccess.getImageRule()); 
            pushFollow(FOLLOW_1);
            ruleImage();

            state._fsp--;

             after(grammarAccess.getImageRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleImage"


    // $ANTLR start "ruleImage"
    // InternalSlideOMatic.g:437:1: ruleImage : ( ( rule__Image__Group__0 ) ) ;
    public final void ruleImage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:441:2: ( ( ( rule__Image__Group__0 ) ) )
            // InternalSlideOMatic.g:442:2: ( ( rule__Image__Group__0 ) )
            {
            // InternalSlideOMatic.g:442:2: ( ( rule__Image__Group__0 ) )
            // InternalSlideOMatic.g:443:3: ( rule__Image__Group__0 )
            {
             before(grammarAccess.getImageAccess().getGroup()); 
            // InternalSlideOMatic.g:444:3: ( rule__Image__Group__0 )
            // InternalSlideOMatic.g:444:4: rule__Image__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Image__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImageAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImage"


    // $ANTLR start "entryRuleAlignment"
    // InternalSlideOMatic.g:453:1: entryRuleAlignment : ruleAlignment EOF ;
    public final void entryRuleAlignment() throws RecognitionException {
        try {
            // InternalSlideOMatic.g:454:1: ( ruleAlignment EOF )
            // InternalSlideOMatic.g:455:1: ruleAlignment EOF
            {
             before(grammarAccess.getAlignmentRule()); 
            pushFollow(FOLLOW_1);
            ruleAlignment();

            state._fsp--;

             after(grammarAccess.getAlignmentRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAlignment"


    // $ANTLR start "ruleAlignment"
    // InternalSlideOMatic.g:462:1: ruleAlignment : ( ( rule__Alignment__Alternatives ) ) ;
    public final void ruleAlignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:466:2: ( ( ( rule__Alignment__Alternatives ) ) )
            // InternalSlideOMatic.g:467:2: ( ( rule__Alignment__Alternatives ) )
            {
            // InternalSlideOMatic.g:467:2: ( ( rule__Alignment__Alternatives ) )
            // InternalSlideOMatic.g:468:3: ( rule__Alignment__Alternatives )
            {
             before(grammarAccess.getAlignmentAccess().getAlternatives()); 
            // InternalSlideOMatic.g:469:3: ( rule__Alignment__Alternatives )
            // InternalSlideOMatic.g:469:4: rule__Alignment__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Alignment__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAlignmentAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAlignment"


    // $ANTLR start "entryRuleSize"
    // InternalSlideOMatic.g:478:1: entryRuleSize : ruleSize EOF ;
    public final void entryRuleSize() throws RecognitionException {
        try {
            // InternalSlideOMatic.g:479:1: ( ruleSize EOF )
            // InternalSlideOMatic.g:480:1: ruleSize EOF
            {
             before(grammarAccess.getSizeRule()); 
            pushFollow(FOLLOW_1);
            ruleSize();

            state._fsp--;

             after(grammarAccess.getSizeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSize"


    // $ANTLR start "ruleSize"
    // InternalSlideOMatic.g:487:1: ruleSize : ( ( rule__Size__Group__0 ) ) ;
    public final void ruleSize() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:491:2: ( ( ( rule__Size__Group__0 ) ) )
            // InternalSlideOMatic.g:492:2: ( ( rule__Size__Group__0 ) )
            {
            // InternalSlideOMatic.g:492:2: ( ( rule__Size__Group__0 ) )
            // InternalSlideOMatic.g:493:3: ( rule__Size__Group__0 )
            {
             before(grammarAccess.getSizeAccess().getGroup()); 
            // InternalSlideOMatic.g:494:3: ( rule__Size__Group__0 )
            // InternalSlideOMatic.g:494:4: rule__Size__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Size__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSizeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSize"


    // $ANTLR start "entryRuleTable"
    // InternalSlideOMatic.g:503:1: entryRuleTable : ruleTable EOF ;
    public final void entryRuleTable() throws RecognitionException {
        try {
            // InternalSlideOMatic.g:504:1: ( ruleTable EOF )
            // InternalSlideOMatic.g:505:1: ruleTable EOF
            {
             before(grammarAccess.getTableRule()); 
            pushFollow(FOLLOW_1);
            ruleTable();

            state._fsp--;

             after(grammarAccess.getTableRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTable"


    // $ANTLR start "ruleTable"
    // InternalSlideOMatic.g:512:1: ruleTable : ( ( rule__Table__Group__0 ) ) ;
    public final void ruleTable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:516:2: ( ( ( rule__Table__Group__0 ) ) )
            // InternalSlideOMatic.g:517:2: ( ( rule__Table__Group__0 ) )
            {
            // InternalSlideOMatic.g:517:2: ( ( rule__Table__Group__0 ) )
            // InternalSlideOMatic.g:518:3: ( rule__Table__Group__0 )
            {
             before(grammarAccess.getTableAccess().getGroup()); 
            // InternalSlideOMatic.g:519:3: ( rule__Table__Group__0 )
            // InternalSlideOMatic.g:519:4: rule__Table__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Table__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTableAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTable"


    // $ANTLR start "entryRuleTableRow"
    // InternalSlideOMatic.g:528:1: entryRuleTableRow : ruleTableRow EOF ;
    public final void entryRuleTableRow() throws RecognitionException {
        try {
            // InternalSlideOMatic.g:529:1: ( ruleTableRow EOF )
            // InternalSlideOMatic.g:530:1: ruleTableRow EOF
            {
             before(grammarAccess.getTableRowRule()); 
            pushFollow(FOLLOW_1);
            ruleTableRow();

            state._fsp--;

             after(grammarAccess.getTableRowRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTableRow"


    // $ANTLR start "ruleTableRow"
    // InternalSlideOMatic.g:537:1: ruleTableRow : ( ( rule__TableRow__Group__0 ) ) ;
    public final void ruleTableRow() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:541:2: ( ( ( rule__TableRow__Group__0 ) ) )
            // InternalSlideOMatic.g:542:2: ( ( rule__TableRow__Group__0 ) )
            {
            // InternalSlideOMatic.g:542:2: ( ( rule__TableRow__Group__0 ) )
            // InternalSlideOMatic.g:543:3: ( rule__TableRow__Group__0 )
            {
             before(grammarAccess.getTableRowAccess().getGroup()); 
            // InternalSlideOMatic.g:544:3: ( rule__TableRow__Group__0 )
            // InternalSlideOMatic.g:544:4: rule__TableRow__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TableRow__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTableRowAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTableRow"


    // $ANTLR start "entryRuleClick"
    // InternalSlideOMatic.g:553:1: entryRuleClick : ruleClick EOF ;
    public final void entryRuleClick() throws RecognitionException {
        try {
            // InternalSlideOMatic.g:554:1: ( ruleClick EOF )
            // InternalSlideOMatic.g:555:1: ruleClick EOF
            {
             before(grammarAccess.getClickRule()); 
            pushFollow(FOLLOW_1);
            ruleClick();

            state._fsp--;

             after(grammarAccess.getClickRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleClick"


    // $ANTLR start "ruleClick"
    // InternalSlideOMatic.g:562:1: ruleClick : ( '$$' ) ;
    public final void ruleClick() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:566:2: ( ( '$$' ) )
            // InternalSlideOMatic.g:567:2: ( '$$' )
            {
            // InternalSlideOMatic.g:567:2: ( '$$' )
            // InternalSlideOMatic.g:568:3: '$$'
            {
             before(grammarAccess.getClickAccess().getDollarSignDollarSignKeyword()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getClickAccess().getDollarSignDollarSignKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClick"


    // $ANTLR start "entryRuleAnimation"
    // InternalSlideOMatic.g:578:1: entryRuleAnimation : ruleAnimation EOF ;
    public final void entryRuleAnimation() throws RecognitionException {
        try {
            // InternalSlideOMatic.g:579:1: ( ruleAnimation EOF )
            // InternalSlideOMatic.g:580:1: ruleAnimation EOF
            {
             before(grammarAccess.getAnimationRule()); 
            pushFollow(FOLLOW_1);
            ruleAnimation();

            state._fsp--;

             after(grammarAccess.getAnimationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAnimation"


    // $ANTLR start "ruleAnimation"
    // InternalSlideOMatic.g:587:1: ruleAnimation : ( ( rule__Animation__Group__0 ) ) ;
    public final void ruleAnimation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:591:2: ( ( ( rule__Animation__Group__0 ) ) )
            // InternalSlideOMatic.g:592:2: ( ( rule__Animation__Group__0 ) )
            {
            // InternalSlideOMatic.g:592:2: ( ( rule__Animation__Group__0 ) )
            // InternalSlideOMatic.g:593:3: ( rule__Animation__Group__0 )
            {
             before(grammarAccess.getAnimationAccess().getGroup()); 
            // InternalSlideOMatic.g:594:3: ( rule__Animation__Group__0 )
            // InternalSlideOMatic.g:594:4: rule__Animation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Animation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAnimationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAnimation"


    // $ANTLR start "entryRuleAnimationType"
    // InternalSlideOMatic.g:603:1: entryRuleAnimationType : ruleAnimationType EOF ;
    public final void entryRuleAnimationType() throws RecognitionException {
        try {
            // InternalSlideOMatic.g:604:1: ( ruleAnimationType EOF )
            // InternalSlideOMatic.g:605:1: ruleAnimationType EOF
            {
             before(grammarAccess.getAnimationTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleAnimationType();

            state._fsp--;

             after(grammarAccess.getAnimationTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAnimationType"


    // $ANTLR start "ruleAnimationType"
    // InternalSlideOMatic.g:612:1: ruleAnimationType : ( ( rule__AnimationType__Alternatives ) ) ;
    public final void ruleAnimationType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:616:2: ( ( ( rule__AnimationType__Alternatives ) ) )
            // InternalSlideOMatic.g:617:2: ( ( rule__AnimationType__Alternatives ) )
            {
            // InternalSlideOMatic.g:617:2: ( ( rule__AnimationType__Alternatives ) )
            // InternalSlideOMatic.g:618:3: ( rule__AnimationType__Alternatives )
            {
             before(grammarAccess.getAnimationTypeAccess().getAlternatives()); 
            // InternalSlideOMatic.g:619:3: ( rule__AnimationType__Alternatives )
            // InternalSlideOMatic.g:619:4: rule__AnimationType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AnimationType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAnimationTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAnimationType"


    // $ANTLR start "rule__Presentation__Alternatives_4"
    // InternalSlideOMatic.g:627:1: rule__Presentation__Alternatives_4 : ( ( ( rule__Presentation__SlidesAssignment_4_0 ) ) | ( ( rule__Presentation__AnimationsAssignment_4_1 ) ) );
    public final void rule__Presentation__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:631:1: ( ( ( rule__Presentation__SlidesAssignment_4_0 ) ) | ( ( rule__Presentation__AnimationsAssignment_4_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==78) ) {
                alt1=1;
            }
            else if ( (LA1_0==95) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalSlideOMatic.g:632:2: ( ( rule__Presentation__SlidesAssignment_4_0 ) )
                    {
                    // InternalSlideOMatic.g:632:2: ( ( rule__Presentation__SlidesAssignment_4_0 ) )
                    // InternalSlideOMatic.g:633:3: ( rule__Presentation__SlidesAssignment_4_0 )
                    {
                     before(grammarAccess.getPresentationAccess().getSlidesAssignment_4_0()); 
                    // InternalSlideOMatic.g:634:3: ( rule__Presentation__SlidesAssignment_4_0 )
                    // InternalSlideOMatic.g:634:4: rule__Presentation__SlidesAssignment_4_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Presentation__SlidesAssignment_4_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPresentationAccess().getSlidesAssignment_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSlideOMatic.g:638:2: ( ( rule__Presentation__AnimationsAssignment_4_1 ) )
                    {
                    // InternalSlideOMatic.g:638:2: ( ( rule__Presentation__AnimationsAssignment_4_1 ) )
                    // InternalSlideOMatic.g:639:3: ( rule__Presentation__AnimationsAssignment_4_1 )
                    {
                     before(grammarAccess.getPresentationAccess().getAnimationsAssignment_4_1()); 
                    // InternalSlideOMatic.g:640:3: ( rule__Presentation__AnimationsAssignment_4_1 )
                    // InternalSlideOMatic.g:640:4: rule__Presentation__AnimationsAssignment_4_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Presentation__AnimationsAssignment_4_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getPresentationAccess().getAnimationsAssignment_4_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Presentation__Alternatives_4"


    // $ANTLR start "rule__BeamerTheme__Alternatives"
    // InternalSlideOMatic.g:648:1: rule__BeamerTheme__Alternatives : ( ( 'AnnArbor' ) | ( 'Antibes' ) | ( 'Bergen' ) | ( 'Berkeley' ) | ( 'Berlin' ) | ( 'Boadilla' ) | ( 'boxes' ) | ( 'CambridgeUS' ) | ( 'Copenhagen' ) | ( 'Darmstadt' ) | ( 'default' ) | ( 'Dresden' ) | ( 'Frankfurt' ) | ( 'Goettingen' ) | ( 'Hannover' ) | ( 'Ilmanau' ) | ( 'JuanLesPins' ) | ( 'Luebeck' ) | ( 'Madrid' ) | ( 'Malmoe' ) | ( 'Marburg' ) | ( 'Montpellier' ) | ( 'PaloAlto' ) | ( 'Pittsburgh' ) | ( 'Rochester' ) | ( 'Singapore' ) | ( 'Szeged' ) | ( 'Warsaw' ) );
    public final void rule__BeamerTheme__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:652:1: ( ( 'AnnArbor' ) | ( 'Antibes' ) | ( 'Bergen' ) | ( 'Berkeley' ) | ( 'Berlin' ) | ( 'Boadilla' ) | ( 'boxes' ) | ( 'CambridgeUS' ) | ( 'Copenhagen' ) | ( 'Darmstadt' ) | ( 'default' ) | ( 'Dresden' ) | ( 'Frankfurt' ) | ( 'Goettingen' ) | ( 'Hannover' ) | ( 'Ilmanau' ) | ( 'JuanLesPins' ) | ( 'Luebeck' ) | ( 'Madrid' ) | ( 'Malmoe' ) | ( 'Marburg' ) | ( 'Montpellier' ) | ( 'PaloAlto' ) | ( 'Pittsburgh' ) | ( 'Rochester' ) | ( 'Singapore' ) | ( 'Szeged' ) | ( 'Warsaw' ) )
            int alt2=28;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt2=1;
                }
                break;
            case 13:
                {
                alt2=2;
                }
                break;
            case 14:
                {
                alt2=3;
                }
                break;
            case 15:
                {
                alt2=4;
                }
                break;
            case 16:
                {
                alt2=5;
                }
                break;
            case 17:
                {
                alt2=6;
                }
                break;
            case 18:
                {
                alt2=7;
                }
                break;
            case 19:
                {
                alt2=8;
                }
                break;
            case 20:
                {
                alt2=9;
                }
                break;
            case 21:
                {
                alt2=10;
                }
                break;
            case 22:
                {
                alt2=11;
                }
                break;
            case 23:
                {
                alt2=12;
                }
                break;
            case 24:
                {
                alt2=13;
                }
                break;
            case 25:
                {
                alt2=14;
                }
                break;
            case 26:
                {
                alt2=15;
                }
                break;
            case 27:
                {
                alt2=16;
                }
                break;
            case 28:
                {
                alt2=17;
                }
                break;
            case 29:
                {
                alt2=18;
                }
                break;
            case 30:
                {
                alt2=19;
                }
                break;
            case 31:
                {
                alt2=20;
                }
                break;
            case 32:
                {
                alt2=21;
                }
                break;
            case 33:
                {
                alt2=22;
                }
                break;
            case 34:
                {
                alt2=23;
                }
                break;
            case 35:
                {
                alt2=24;
                }
                break;
            case 36:
                {
                alt2=25;
                }
                break;
            case 37:
                {
                alt2=26;
                }
                break;
            case 38:
                {
                alt2=27;
                }
                break;
            case 39:
                {
                alt2=28;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalSlideOMatic.g:653:2: ( 'AnnArbor' )
                    {
                    // InternalSlideOMatic.g:653:2: ( 'AnnArbor' )
                    // InternalSlideOMatic.g:654:3: 'AnnArbor'
                    {
                     before(grammarAccess.getBeamerThemeAccess().getAnnArborKeyword_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getBeamerThemeAccess().getAnnArborKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSlideOMatic.g:659:2: ( 'Antibes' )
                    {
                    // InternalSlideOMatic.g:659:2: ( 'Antibes' )
                    // InternalSlideOMatic.g:660:3: 'Antibes'
                    {
                     before(grammarAccess.getBeamerThemeAccess().getAntibesKeyword_1()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getBeamerThemeAccess().getAntibesKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSlideOMatic.g:665:2: ( 'Bergen' )
                    {
                    // InternalSlideOMatic.g:665:2: ( 'Bergen' )
                    // InternalSlideOMatic.g:666:3: 'Bergen'
                    {
                     before(grammarAccess.getBeamerThemeAccess().getBergenKeyword_2()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getBeamerThemeAccess().getBergenKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSlideOMatic.g:671:2: ( 'Berkeley' )
                    {
                    // InternalSlideOMatic.g:671:2: ( 'Berkeley' )
                    // InternalSlideOMatic.g:672:3: 'Berkeley'
                    {
                     before(grammarAccess.getBeamerThemeAccess().getBerkeleyKeyword_3()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getBeamerThemeAccess().getBerkeleyKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSlideOMatic.g:677:2: ( 'Berlin' )
                    {
                    // InternalSlideOMatic.g:677:2: ( 'Berlin' )
                    // InternalSlideOMatic.g:678:3: 'Berlin'
                    {
                     before(grammarAccess.getBeamerThemeAccess().getBerlinKeyword_4()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getBeamerThemeAccess().getBerlinKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalSlideOMatic.g:683:2: ( 'Boadilla' )
                    {
                    // InternalSlideOMatic.g:683:2: ( 'Boadilla' )
                    // InternalSlideOMatic.g:684:3: 'Boadilla'
                    {
                     before(grammarAccess.getBeamerThemeAccess().getBoadillaKeyword_5()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getBeamerThemeAccess().getBoadillaKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalSlideOMatic.g:689:2: ( 'boxes' )
                    {
                    // InternalSlideOMatic.g:689:2: ( 'boxes' )
                    // InternalSlideOMatic.g:690:3: 'boxes'
                    {
                     before(grammarAccess.getBeamerThemeAccess().getBoxesKeyword_6()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getBeamerThemeAccess().getBoxesKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalSlideOMatic.g:695:2: ( 'CambridgeUS' )
                    {
                    // InternalSlideOMatic.g:695:2: ( 'CambridgeUS' )
                    // InternalSlideOMatic.g:696:3: 'CambridgeUS'
                    {
                     before(grammarAccess.getBeamerThemeAccess().getCambridgeUSKeyword_7()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getBeamerThemeAccess().getCambridgeUSKeyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalSlideOMatic.g:701:2: ( 'Copenhagen' )
                    {
                    // InternalSlideOMatic.g:701:2: ( 'Copenhagen' )
                    // InternalSlideOMatic.g:702:3: 'Copenhagen'
                    {
                     before(grammarAccess.getBeamerThemeAccess().getCopenhagenKeyword_8()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getBeamerThemeAccess().getCopenhagenKeyword_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalSlideOMatic.g:707:2: ( 'Darmstadt' )
                    {
                    // InternalSlideOMatic.g:707:2: ( 'Darmstadt' )
                    // InternalSlideOMatic.g:708:3: 'Darmstadt'
                    {
                     before(grammarAccess.getBeamerThemeAccess().getDarmstadtKeyword_9()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getBeamerThemeAccess().getDarmstadtKeyword_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalSlideOMatic.g:713:2: ( 'default' )
                    {
                    // InternalSlideOMatic.g:713:2: ( 'default' )
                    // InternalSlideOMatic.g:714:3: 'default'
                    {
                     before(grammarAccess.getBeamerThemeAccess().getDefaultKeyword_10()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getBeamerThemeAccess().getDefaultKeyword_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalSlideOMatic.g:719:2: ( 'Dresden' )
                    {
                    // InternalSlideOMatic.g:719:2: ( 'Dresden' )
                    // InternalSlideOMatic.g:720:3: 'Dresden'
                    {
                     before(grammarAccess.getBeamerThemeAccess().getDresdenKeyword_11()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getBeamerThemeAccess().getDresdenKeyword_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalSlideOMatic.g:725:2: ( 'Frankfurt' )
                    {
                    // InternalSlideOMatic.g:725:2: ( 'Frankfurt' )
                    // InternalSlideOMatic.g:726:3: 'Frankfurt'
                    {
                     before(grammarAccess.getBeamerThemeAccess().getFrankfurtKeyword_12()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getBeamerThemeAccess().getFrankfurtKeyword_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalSlideOMatic.g:731:2: ( 'Goettingen' )
                    {
                    // InternalSlideOMatic.g:731:2: ( 'Goettingen' )
                    // InternalSlideOMatic.g:732:3: 'Goettingen'
                    {
                     before(grammarAccess.getBeamerThemeAccess().getGoettingenKeyword_13()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getBeamerThemeAccess().getGoettingenKeyword_13()); 

                    }


                    }
                    break;
                case 15 :
                    // InternalSlideOMatic.g:737:2: ( 'Hannover' )
                    {
                    // InternalSlideOMatic.g:737:2: ( 'Hannover' )
                    // InternalSlideOMatic.g:738:3: 'Hannover'
                    {
                     before(grammarAccess.getBeamerThemeAccess().getHannoverKeyword_14()); 
                    match(input,26,FOLLOW_2); 
                     after(grammarAccess.getBeamerThemeAccess().getHannoverKeyword_14()); 

                    }


                    }
                    break;
                case 16 :
                    // InternalSlideOMatic.g:743:2: ( 'Ilmanau' )
                    {
                    // InternalSlideOMatic.g:743:2: ( 'Ilmanau' )
                    // InternalSlideOMatic.g:744:3: 'Ilmanau'
                    {
                     before(grammarAccess.getBeamerThemeAccess().getIlmanauKeyword_15()); 
                    match(input,27,FOLLOW_2); 
                     after(grammarAccess.getBeamerThemeAccess().getIlmanauKeyword_15()); 

                    }


                    }
                    break;
                case 17 :
                    // InternalSlideOMatic.g:749:2: ( 'JuanLesPins' )
                    {
                    // InternalSlideOMatic.g:749:2: ( 'JuanLesPins' )
                    // InternalSlideOMatic.g:750:3: 'JuanLesPins'
                    {
                     before(grammarAccess.getBeamerThemeAccess().getJuanLesPinsKeyword_16()); 
                    match(input,28,FOLLOW_2); 
                     after(grammarAccess.getBeamerThemeAccess().getJuanLesPinsKeyword_16()); 

                    }


                    }
                    break;
                case 18 :
                    // InternalSlideOMatic.g:755:2: ( 'Luebeck' )
                    {
                    // InternalSlideOMatic.g:755:2: ( 'Luebeck' )
                    // InternalSlideOMatic.g:756:3: 'Luebeck'
                    {
                     before(grammarAccess.getBeamerThemeAccess().getLuebeckKeyword_17()); 
                    match(input,29,FOLLOW_2); 
                     after(grammarAccess.getBeamerThemeAccess().getLuebeckKeyword_17()); 

                    }


                    }
                    break;
                case 19 :
                    // InternalSlideOMatic.g:761:2: ( 'Madrid' )
                    {
                    // InternalSlideOMatic.g:761:2: ( 'Madrid' )
                    // InternalSlideOMatic.g:762:3: 'Madrid'
                    {
                     before(grammarAccess.getBeamerThemeAccess().getMadridKeyword_18()); 
                    match(input,30,FOLLOW_2); 
                     after(grammarAccess.getBeamerThemeAccess().getMadridKeyword_18()); 

                    }


                    }
                    break;
                case 20 :
                    // InternalSlideOMatic.g:767:2: ( 'Malmoe' )
                    {
                    // InternalSlideOMatic.g:767:2: ( 'Malmoe' )
                    // InternalSlideOMatic.g:768:3: 'Malmoe'
                    {
                     before(grammarAccess.getBeamerThemeAccess().getMalmoeKeyword_19()); 
                    match(input,31,FOLLOW_2); 
                     after(grammarAccess.getBeamerThemeAccess().getMalmoeKeyword_19()); 

                    }


                    }
                    break;
                case 21 :
                    // InternalSlideOMatic.g:773:2: ( 'Marburg' )
                    {
                    // InternalSlideOMatic.g:773:2: ( 'Marburg' )
                    // InternalSlideOMatic.g:774:3: 'Marburg'
                    {
                     before(grammarAccess.getBeamerThemeAccess().getMarburgKeyword_20()); 
                    match(input,32,FOLLOW_2); 
                     after(grammarAccess.getBeamerThemeAccess().getMarburgKeyword_20()); 

                    }


                    }
                    break;
                case 22 :
                    // InternalSlideOMatic.g:779:2: ( 'Montpellier' )
                    {
                    // InternalSlideOMatic.g:779:2: ( 'Montpellier' )
                    // InternalSlideOMatic.g:780:3: 'Montpellier'
                    {
                     before(grammarAccess.getBeamerThemeAccess().getMontpellierKeyword_21()); 
                    match(input,33,FOLLOW_2); 
                     after(grammarAccess.getBeamerThemeAccess().getMontpellierKeyword_21()); 

                    }


                    }
                    break;
                case 23 :
                    // InternalSlideOMatic.g:785:2: ( 'PaloAlto' )
                    {
                    // InternalSlideOMatic.g:785:2: ( 'PaloAlto' )
                    // InternalSlideOMatic.g:786:3: 'PaloAlto'
                    {
                     before(grammarAccess.getBeamerThemeAccess().getPaloAltoKeyword_22()); 
                    match(input,34,FOLLOW_2); 
                     after(grammarAccess.getBeamerThemeAccess().getPaloAltoKeyword_22()); 

                    }


                    }
                    break;
                case 24 :
                    // InternalSlideOMatic.g:791:2: ( 'Pittsburgh' )
                    {
                    // InternalSlideOMatic.g:791:2: ( 'Pittsburgh' )
                    // InternalSlideOMatic.g:792:3: 'Pittsburgh'
                    {
                     before(grammarAccess.getBeamerThemeAccess().getPittsburghKeyword_23()); 
                    match(input,35,FOLLOW_2); 
                     after(grammarAccess.getBeamerThemeAccess().getPittsburghKeyword_23()); 

                    }


                    }
                    break;
                case 25 :
                    // InternalSlideOMatic.g:797:2: ( 'Rochester' )
                    {
                    // InternalSlideOMatic.g:797:2: ( 'Rochester' )
                    // InternalSlideOMatic.g:798:3: 'Rochester'
                    {
                     before(grammarAccess.getBeamerThemeAccess().getRochesterKeyword_24()); 
                    match(input,36,FOLLOW_2); 
                     after(grammarAccess.getBeamerThemeAccess().getRochesterKeyword_24()); 

                    }


                    }
                    break;
                case 26 :
                    // InternalSlideOMatic.g:803:2: ( 'Singapore' )
                    {
                    // InternalSlideOMatic.g:803:2: ( 'Singapore' )
                    // InternalSlideOMatic.g:804:3: 'Singapore'
                    {
                     before(grammarAccess.getBeamerThemeAccess().getSingaporeKeyword_25()); 
                    match(input,37,FOLLOW_2); 
                     after(grammarAccess.getBeamerThemeAccess().getSingaporeKeyword_25()); 

                    }


                    }
                    break;
                case 27 :
                    // InternalSlideOMatic.g:809:2: ( 'Szeged' )
                    {
                    // InternalSlideOMatic.g:809:2: ( 'Szeged' )
                    // InternalSlideOMatic.g:810:3: 'Szeged'
                    {
                     before(grammarAccess.getBeamerThemeAccess().getSzegedKeyword_26()); 
                    match(input,38,FOLLOW_2); 
                     after(grammarAccess.getBeamerThemeAccess().getSzegedKeyword_26()); 

                    }


                    }
                    break;
                case 28 :
                    // InternalSlideOMatic.g:815:2: ( 'Warsaw' )
                    {
                    // InternalSlideOMatic.g:815:2: ( 'Warsaw' )
                    // InternalSlideOMatic.g:816:3: 'Warsaw'
                    {
                     before(grammarAccess.getBeamerThemeAccess().getWarsawKeyword_27()); 
                    match(input,39,FOLLOW_2); 
                     after(grammarAccess.getBeamerThemeAccess().getWarsawKeyword_27()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BeamerTheme__Alternatives"


    // $ANTLR start "rule__ThemeColor__Alternatives"
    // InternalSlideOMatic.g:825:1: rule__ThemeColor__Alternatives : ( ( 'albatros' ) | ( 'beaver' ) | ( 'beetle' ) | ( 'crane' ) | ( 'default' ) | ( 'dolphin' ) | ( 'dove' ) | ( 'fly' ) | ( 'lily' ) | ( 'orchid' ) | ( 'rose' ) | ( 'seagull' ) | ( 'seahorse' ) | ( 'sidebartab' ) | ( 'structure' ) | ( 'whale' ) | ( 'wolverine' ) );
    public final void rule__ThemeColor__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:829:1: ( ( 'albatros' ) | ( 'beaver' ) | ( 'beetle' ) | ( 'crane' ) | ( 'default' ) | ( 'dolphin' ) | ( 'dove' ) | ( 'fly' ) | ( 'lily' ) | ( 'orchid' ) | ( 'rose' ) | ( 'seagull' ) | ( 'seahorse' ) | ( 'sidebartab' ) | ( 'structure' ) | ( 'whale' ) | ( 'wolverine' ) )
            int alt3=17;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt3=1;
                }
                break;
            case 41:
                {
                alt3=2;
                }
                break;
            case 42:
                {
                alt3=3;
                }
                break;
            case 43:
                {
                alt3=4;
                }
                break;
            case 22:
                {
                alt3=5;
                }
                break;
            case 44:
                {
                alt3=6;
                }
                break;
            case 45:
                {
                alt3=7;
                }
                break;
            case 46:
                {
                alt3=8;
                }
                break;
            case 47:
                {
                alt3=9;
                }
                break;
            case 48:
                {
                alt3=10;
                }
                break;
            case 49:
                {
                alt3=11;
                }
                break;
            case 50:
                {
                alt3=12;
                }
                break;
            case 51:
                {
                alt3=13;
                }
                break;
            case 52:
                {
                alt3=14;
                }
                break;
            case 53:
                {
                alt3=15;
                }
                break;
            case 54:
                {
                alt3=16;
                }
                break;
            case 55:
                {
                alt3=17;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalSlideOMatic.g:830:2: ( 'albatros' )
                    {
                    // InternalSlideOMatic.g:830:2: ( 'albatros' )
                    // InternalSlideOMatic.g:831:3: 'albatros'
                    {
                     before(grammarAccess.getThemeColorAccess().getAlbatrosKeyword_0()); 
                    match(input,40,FOLLOW_2); 
                     after(grammarAccess.getThemeColorAccess().getAlbatrosKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSlideOMatic.g:836:2: ( 'beaver' )
                    {
                    // InternalSlideOMatic.g:836:2: ( 'beaver' )
                    // InternalSlideOMatic.g:837:3: 'beaver'
                    {
                     before(grammarAccess.getThemeColorAccess().getBeaverKeyword_1()); 
                    match(input,41,FOLLOW_2); 
                     after(grammarAccess.getThemeColorAccess().getBeaverKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSlideOMatic.g:842:2: ( 'beetle' )
                    {
                    // InternalSlideOMatic.g:842:2: ( 'beetle' )
                    // InternalSlideOMatic.g:843:3: 'beetle'
                    {
                     before(grammarAccess.getThemeColorAccess().getBeetleKeyword_2()); 
                    match(input,42,FOLLOW_2); 
                     after(grammarAccess.getThemeColorAccess().getBeetleKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSlideOMatic.g:848:2: ( 'crane' )
                    {
                    // InternalSlideOMatic.g:848:2: ( 'crane' )
                    // InternalSlideOMatic.g:849:3: 'crane'
                    {
                     before(grammarAccess.getThemeColorAccess().getCraneKeyword_3()); 
                    match(input,43,FOLLOW_2); 
                     after(grammarAccess.getThemeColorAccess().getCraneKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSlideOMatic.g:854:2: ( 'default' )
                    {
                    // InternalSlideOMatic.g:854:2: ( 'default' )
                    // InternalSlideOMatic.g:855:3: 'default'
                    {
                     before(grammarAccess.getThemeColorAccess().getDefaultKeyword_4()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getThemeColorAccess().getDefaultKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalSlideOMatic.g:860:2: ( 'dolphin' )
                    {
                    // InternalSlideOMatic.g:860:2: ( 'dolphin' )
                    // InternalSlideOMatic.g:861:3: 'dolphin'
                    {
                     before(grammarAccess.getThemeColorAccess().getDolphinKeyword_5()); 
                    match(input,44,FOLLOW_2); 
                     after(grammarAccess.getThemeColorAccess().getDolphinKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalSlideOMatic.g:866:2: ( 'dove' )
                    {
                    // InternalSlideOMatic.g:866:2: ( 'dove' )
                    // InternalSlideOMatic.g:867:3: 'dove'
                    {
                     before(grammarAccess.getThemeColorAccess().getDoveKeyword_6()); 
                    match(input,45,FOLLOW_2); 
                     after(grammarAccess.getThemeColorAccess().getDoveKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalSlideOMatic.g:872:2: ( 'fly' )
                    {
                    // InternalSlideOMatic.g:872:2: ( 'fly' )
                    // InternalSlideOMatic.g:873:3: 'fly'
                    {
                     before(grammarAccess.getThemeColorAccess().getFlyKeyword_7()); 
                    match(input,46,FOLLOW_2); 
                     after(grammarAccess.getThemeColorAccess().getFlyKeyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalSlideOMatic.g:878:2: ( 'lily' )
                    {
                    // InternalSlideOMatic.g:878:2: ( 'lily' )
                    // InternalSlideOMatic.g:879:3: 'lily'
                    {
                     before(grammarAccess.getThemeColorAccess().getLilyKeyword_8()); 
                    match(input,47,FOLLOW_2); 
                     after(grammarAccess.getThemeColorAccess().getLilyKeyword_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalSlideOMatic.g:884:2: ( 'orchid' )
                    {
                    // InternalSlideOMatic.g:884:2: ( 'orchid' )
                    // InternalSlideOMatic.g:885:3: 'orchid'
                    {
                     before(grammarAccess.getThemeColorAccess().getOrchidKeyword_9()); 
                    match(input,48,FOLLOW_2); 
                     after(grammarAccess.getThemeColorAccess().getOrchidKeyword_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalSlideOMatic.g:890:2: ( 'rose' )
                    {
                    // InternalSlideOMatic.g:890:2: ( 'rose' )
                    // InternalSlideOMatic.g:891:3: 'rose'
                    {
                     before(grammarAccess.getThemeColorAccess().getRoseKeyword_10()); 
                    match(input,49,FOLLOW_2); 
                     after(grammarAccess.getThemeColorAccess().getRoseKeyword_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalSlideOMatic.g:896:2: ( 'seagull' )
                    {
                    // InternalSlideOMatic.g:896:2: ( 'seagull' )
                    // InternalSlideOMatic.g:897:3: 'seagull'
                    {
                     before(grammarAccess.getThemeColorAccess().getSeagullKeyword_11()); 
                    match(input,50,FOLLOW_2); 
                     after(grammarAccess.getThemeColorAccess().getSeagullKeyword_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalSlideOMatic.g:902:2: ( 'seahorse' )
                    {
                    // InternalSlideOMatic.g:902:2: ( 'seahorse' )
                    // InternalSlideOMatic.g:903:3: 'seahorse'
                    {
                     before(grammarAccess.getThemeColorAccess().getSeahorseKeyword_12()); 
                    match(input,51,FOLLOW_2); 
                     after(grammarAccess.getThemeColorAccess().getSeahorseKeyword_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalSlideOMatic.g:908:2: ( 'sidebartab' )
                    {
                    // InternalSlideOMatic.g:908:2: ( 'sidebartab' )
                    // InternalSlideOMatic.g:909:3: 'sidebartab'
                    {
                     before(grammarAccess.getThemeColorAccess().getSidebartabKeyword_13()); 
                    match(input,52,FOLLOW_2); 
                     after(grammarAccess.getThemeColorAccess().getSidebartabKeyword_13()); 

                    }


                    }
                    break;
                case 15 :
                    // InternalSlideOMatic.g:914:2: ( 'structure' )
                    {
                    // InternalSlideOMatic.g:914:2: ( 'structure' )
                    // InternalSlideOMatic.g:915:3: 'structure'
                    {
                     before(grammarAccess.getThemeColorAccess().getStructureKeyword_14()); 
                    match(input,53,FOLLOW_2); 
                     after(grammarAccess.getThemeColorAccess().getStructureKeyword_14()); 

                    }


                    }
                    break;
                case 16 :
                    // InternalSlideOMatic.g:920:2: ( 'whale' )
                    {
                    // InternalSlideOMatic.g:920:2: ( 'whale' )
                    // InternalSlideOMatic.g:921:3: 'whale'
                    {
                     before(grammarAccess.getThemeColorAccess().getWhaleKeyword_15()); 
                    match(input,54,FOLLOW_2); 
                     after(grammarAccess.getThemeColorAccess().getWhaleKeyword_15()); 

                    }


                    }
                    break;
                case 17 :
                    // InternalSlideOMatic.g:926:2: ( 'wolverine' )
                    {
                    // InternalSlideOMatic.g:926:2: ( 'wolverine' )
                    // InternalSlideOMatic.g:927:3: 'wolverine'
                    {
                     before(grammarAccess.getThemeColorAccess().getWolverineKeyword_16()); 
                    match(input,55,FOLLOW_2); 
                     after(grammarAccess.getThemeColorAccess().getWolverineKeyword_16()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ThemeColor__Alternatives"


    // $ANTLR start "rule__Slide__Alternatives_1"
    // InternalSlideOMatic.g:936:1: rule__Slide__Alternatives_1 : ( ( ( rule__Slide__Group_1_0__0 ) ) | ( ( rule__Slide__NameAssignment_1_1 ) ) );
    public final void rule__Slide__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:940:1: ( ( ( rule__Slide__Group_1_0__0 ) ) | ( ( rule__Slide__NameAssignment_1_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=79 && LA4_0<=81)) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_STRING) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalSlideOMatic.g:941:2: ( ( rule__Slide__Group_1_0__0 ) )
                    {
                    // InternalSlideOMatic.g:941:2: ( ( rule__Slide__Group_1_0__0 ) )
                    // InternalSlideOMatic.g:942:3: ( rule__Slide__Group_1_0__0 )
                    {
                     before(grammarAccess.getSlideAccess().getGroup_1_0()); 
                    // InternalSlideOMatic.g:943:3: ( rule__Slide__Group_1_0__0 )
                    // InternalSlideOMatic.g:943:4: rule__Slide__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Slide__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSlideAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSlideOMatic.g:947:2: ( ( rule__Slide__NameAssignment_1_1 ) )
                    {
                    // InternalSlideOMatic.g:947:2: ( ( rule__Slide__NameAssignment_1_1 ) )
                    // InternalSlideOMatic.g:948:3: ( rule__Slide__NameAssignment_1_1 )
                    {
                     before(grammarAccess.getSlideAccess().getNameAssignment_1_1()); 
                    // InternalSlideOMatic.g:949:3: ( rule__Slide__NameAssignment_1_1 )
                    // InternalSlideOMatic.g:949:4: rule__Slide__NameAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Slide__NameAssignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getSlideAccess().getNameAssignment_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slide__Alternatives_1"


    // $ANTLR start "rule__Section__Alternatives"
    // InternalSlideOMatic.g:957:1: rule__Section__Alternatives : ( ( ( rule__Section__Group_0__0 ) ) | ( ( rule__Section__Group_1__0 ) ) | ( ( rule__Section__Group_2__0 ) ) );
    public final void rule__Section__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:961:1: ( ( ( rule__Section__Group_0__0 ) ) | ( ( rule__Section__Group_1__0 ) ) | ( ( rule__Section__Group_2__0 ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 79:
                {
                alt5=1;
                }
                break;
            case 80:
                {
                alt5=2;
                }
                break;
            case 81:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalSlideOMatic.g:962:2: ( ( rule__Section__Group_0__0 ) )
                    {
                    // InternalSlideOMatic.g:962:2: ( ( rule__Section__Group_0__0 ) )
                    // InternalSlideOMatic.g:963:3: ( rule__Section__Group_0__0 )
                    {
                     before(grammarAccess.getSectionAccess().getGroup_0()); 
                    // InternalSlideOMatic.g:964:3: ( rule__Section__Group_0__0 )
                    // InternalSlideOMatic.g:964:4: rule__Section__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Section__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSectionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSlideOMatic.g:968:2: ( ( rule__Section__Group_1__0 ) )
                    {
                    // InternalSlideOMatic.g:968:2: ( ( rule__Section__Group_1__0 ) )
                    // InternalSlideOMatic.g:969:3: ( rule__Section__Group_1__0 )
                    {
                     before(grammarAccess.getSectionAccess().getGroup_1()); 
                    // InternalSlideOMatic.g:970:3: ( rule__Section__Group_1__0 )
                    // InternalSlideOMatic.g:970:4: rule__Section__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Section__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSectionAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSlideOMatic.g:974:2: ( ( rule__Section__Group_2__0 ) )
                    {
                    // InternalSlideOMatic.g:974:2: ( ( rule__Section__Group_2__0 ) )
                    // InternalSlideOMatic.g:975:3: ( rule__Section__Group_2__0 )
                    {
                     before(grammarAccess.getSectionAccess().getGroup_2()); 
                    // InternalSlideOMatic.g:976:3: ( rule__Section__Group_2__0 )
                    // InternalSlideOMatic.g:976:4: rule__Section__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Section__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSectionAccess().getGroup_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Alternatives"


    // $ANTLR start "rule__Content__Alternatives"
    // InternalSlideOMatic.g:984:1: rule__Content__Alternatives : ( ( ( rule__Content__Group_0__0 ) ) | ( ruleText ) | ( ruleList ) | ( ruleFloat ) );
    public final void rule__Content__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:988:1: ( ( ( rule__Content__Group_0__0 ) ) | ( ruleText ) | ( ruleList ) | ( ruleFloat ) )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 82:
                {
                alt6=1;
                }
                break;
            case 83:
            case 84:
                {
                alt6=2;
                }
                break;
            case 85:
            case 86:
                {
                alt6=3;
                }
                break;
            case 89:
            case 92:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalSlideOMatic.g:989:2: ( ( rule__Content__Group_0__0 ) )
                    {
                    // InternalSlideOMatic.g:989:2: ( ( rule__Content__Group_0__0 ) )
                    // InternalSlideOMatic.g:990:3: ( rule__Content__Group_0__0 )
                    {
                     before(grammarAccess.getContentAccess().getGroup_0()); 
                    // InternalSlideOMatic.g:991:3: ( rule__Content__Group_0__0 )
                    // InternalSlideOMatic.g:991:4: rule__Content__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Content__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getContentAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSlideOMatic.g:995:2: ( ruleText )
                    {
                    // InternalSlideOMatic.g:995:2: ( ruleText )
                    // InternalSlideOMatic.g:996:3: ruleText
                    {
                     before(grammarAccess.getContentAccess().getTextParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleText();

                    state._fsp--;

                     after(grammarAccess.getContentAccess().getTextParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSlideOMatic.g:1001:2: ( ruleList )
                    {
                    // InternalSlideOMatic.g:1001:2: ( ruleList )
                    // InternalSlideOMatic.g:1002:3: ruleList
                    {
                     before(grammarAccess.getContentAccess().getListParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleList();

                    state._fsp--;

                     after(grammarAccess.getContentAccess().getListParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSlideOMatic.g:1007:2: ( ruleFloat )
                    {
                    // InternalSlideOMatic.g:1007:2: ( ruleFloat )
                    // InternalSlideOMatic.g:1008:3: ruleFloat
                    {
                     before(grammarAccess.getContentAccess().getFloatParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleFloat();

                    state._fsp--;

                     after(grammarAccess.getContentAccess().getFloatParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Content__Alternatives"


    // $ANTLR start "rule__Text__Alternatives"
    // InternalSlideOMatic.g:1017:1: rule__Text__Alternatives : ( ( ( rule__Text__Group_0__0 ) ) | ( ( rule__Text__Group_1__0 ) ) );
    public final void rule__Text__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1021:1: ( ( ( rule__Text__Group_0__0 ) ) | ( ( rule__Text__Group_1__0 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==83) ) {
                alt7=1;
            }
            else if ( (LA7_0==84) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalSlideOMatic.g:1022:2: ( ( rule__Text__Group_0__0 ) )
                    {
                    // InternalSlideOMatic.g:1022:2: ( ( rule__Text__Group_0__0 ) )
                    // InternalSlideOMatic.g:1023:3: ( rule__Text__Group_0__0 )
                    {
                     before(grammarAccess.getTextAccess().getGroup_0()); 
                    // InternalSlideOMatic.g:1024:3: ( rule__Text__Group_0__0 )
                    // InternalSlideOMatic.g:1024:4: rule__Text__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Text__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTextAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSlideOMatic.g:1028:2: ( ( rule__Text__Group_1__0 ) )
                    {
                    // InternalSlideOMatic.g:1028:2: ( ( rule__Text__Group_1__0 ) )
                    // InternalSlideOMatic.g:1029:3: ( rule__Text__Group_1__0 )
                    {
                     before(grammarAccess.getTextAccess().getGroup_1()); 
                    // InternalSlideOMatic.g:1030:3: ( rule__Text__Group_1__0 )
                    // InternalSlideOMatic.g:1030:4: rule__Text__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Text__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTextAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__Alternatives"


    // $ANTLR start "rule__List__Alternatives"
    // InternalSlideOMatic.g:1038:1: rule__List__Alternatives : ( ( ( rule__List__Group_0__0 ) ) | ( ( rule__List__Group_1__0 ) ) );
    public final void rule__List__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1042:1: ( ( ( rule__List__Group_0__0 ) ) | ( ( rule__List__Group_1__0 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==85) ) {
                alt8=1;
            }
            else if ( (LA8_0==86) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalSlideOMatic.g:1043:2: ( ( rule__List__Group_0__0 ) )
                    {
                    // InternalSlideOMatic.g:1043:2: ( ( rule__List__Group_0__0 ) )
                    // InternalSlideOMatic.g:1044:3: ( rule__List__Group_0__0 )
                    {
                     before(grammarAccess.getListAccess().getGroup_0()); 
                    // InternalSlideOMatic.g:1045:3: ( rule__List__Group_0__0 )
                    // InternalSlideOMatic.g:1045:4: rule__List__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__List__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getListAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSlideOMatic.g:1049:2: ( ( rule__List__Group_1__0 ) )
                    {
                    // InternalSlideOMatic.g:1049:2: ( ( rule__List__Group_1__0 ) )
                    // InternalSlideOMatic.g:1050:3: ( rule__List__Group_1__0 )
                    {
                     before(grammarAccess.getListAccess().getGroup_1()); 
                    // InternalSlideOMatic.g:1051:3: ( rule__List__Group_1__0 )
                    // InternalSlideOMatic.g:1051:4: rule__List__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__List__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getListAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__List__Alternatives"


    // $ANTLR start "rule__Float__Alternatives"
    // InternalSlideOMatic.g:1059:1: rule__Float__Alternatives : ( ( ruleImage ) | ( ruleTable ) );
    public final void rule__Float__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1063:1: ( ( ruleImage ) | ( ruleTable ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==89) ) {
                alt9=1;
            }
            else if ( (LA9_0==92) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalSlideOMatic.g:1064:2: ( ruleImage )
                    {
                    // InternalSlideOMatic.g:1064:2: ( ruleImage )
                    // InternalSlideOMatic.g:1065:3: ruleImage
                    {
                     before(grammarAccess.getFloatAccess().getImageParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleImage();

                    state._fsp--;

                     after(grammarAccess.getFloatAccess().getImageParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSlideOMatic.g:1070:2: ( ruleTable )
                    {
                    // InternalSlideOMatic.g:1070:2: ( ruleTable )
                    // InternalSlideOMatic.g:1071:3: ruleTable
                    {
                     before(grammarAccess.getFloatAccess().getTableParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleTable();

                    state._fsp--;

                     after(grammarAccess.getFloatAccess().getTableParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Float__Alternatives"


    // $ANTLR start "rule__Alignment__Alternatives"
    // InternalSlideOMatic.g:1080:1: rule__Alignment__Alternatives : ( ( 'topleft' ) | ( 'top' ) | ( 'topright' ) | ( 'left' ) | ( 'center' ) | ( 'right' ) | ( 'bottomleft' ) | ( 'bottom' ) | ( 'bottomright' ) );
    public final void rule__Alignment__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1084:1: ( ( 'topleft' ) | ( 'top' ) | ( 'topright' ) | ( 'left' ) | ( 'center' ) | ( 'right' ) | ( 'bottomleft' ) | ( 'bottom' ) | ( 'bottomright' ) )
            int alt10=9;
            switch ( input.LA(1) ) {
            case 56:
                {
                alt10=1;
                }
                break;
            case 57:
                {
                alt10=2;
                }
                break;
            case 58:
                {
                alt10=3;
                }
                break;
            case 59:
                {
                alt10=4;
                }
                break;
            case 60:
                {
                alt10=5;
                }
                break;
            case 61:
                {
                alt10=6;
                }
                break;
            case 62:
                {
                alt10=7;
                }
                break;
            case 63:
                {
                alt10=8;
                }
                break;
            case 64:
                {
                alt10=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalSlideOMatic.g:1085:2: ( 'topleft' )
                    {
                    // InternalSlideOMatic.g:1085:2: ( 'topleft' )
                    // InternalSlideOMatic.g:1086:3: 'topleft'
                    {
                     before(grammarAccess.getAlignmentAccess().getTopleftKeyword_0()); 
                    match(input,56,FOLLOW_2); 
                     after(grammarAccess.getAlignmentAccess().getTopleftKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSlideOMatic.g:1091:2: ( 'top' )
                    {
                    // InternalSlideOMatic.g:1091:2: ( 'top' )
                    // InternalSlideOMatic.g:1092:3: 'top'
                    {
                     before(grammarAccess.getAlignmentAccess().getTopKeyword_1()); 
                    match(input,57,FOLLOW_2); 
                     after(grammarAccess.getAlignmentAccess().getTopKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSlideOMatic.g:1097:2: ( 'topright' )
                    {
                    // InternalSlideOMatic.g:1097:2: ( 'topright' )
                    // InternalSlideOMatic.g:1098:3: 'topright'
                    {
                     before(grammarAccess.getAlignmentAccess().getToprightKeyword_2()); 
                    match(input,58,FOLLOW_2); 
                     after(grammarAccess.getAlignmentAccess().getToprightKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSlideOMatic.g:1103:2: ( 'left' )
                    {
                    // InternalSlideOMatic.g:1103:2: ( 'left' )
                    // InternalSlideOMatic.g:1104:3: 'left'
                    {
                     before(grammarAccess.getAlignmentAccess().getLeftKeyword_3()); 
                    match(input,59,FOLLOW_2); 
                     after(grammarAccess.getAlignmentAccess().getLeftKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSlideOMatic.g:1109:2: ( 'center' )
                    {
                    // InternalSlideOMatic.g:1109:2: ( 'center' )
                    // InternalSlideOMatic.g:1110:3: 'center'
                    {
                     before(grammarAccess.getAlignmentAccess().getCenterKeyword_4()); 
                    match(input,60,FOLLOW_2); 
                     after(grammarAccess.getAlignmentAccess().getCenterKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalSlideOMatic.g:1115:2: ( 'right' )
                    {
                    // InternalSlideOMatic.g:1115:2: ( 'right' )
                    // InternalSlideOMatic.g:1116:3: 'right'
                    {
                     before(grammarAccess.getAlignmentAccess().getRightKeyword_5()); 
                    match(input,61,FOLLOW_2); 
                     after(grammarAccess.getAlignmentAccess().getRightKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalSlideOMatic.g:1121:2: ( 'bottomleft' )
                    {
                    // InternalSlideOMatic.g:1121:2: ( 'bottomleft' )
                    // InternalSlideOMatic.g:1122:3: 'bottomleft'
                    {
                     before(grammarAccess.getAlignmentAccess().getBottomleftKeyword_6()); 
                    match(input,62,FOLLOW_2); 
                     after(grammarAccess.getAlignmentAccess().getBottomleftKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalSlideOMatic.g:1127:2: ( 'bottom' )
                    {
                    // InternalSlideOMatic.g:1127:2: ( 'bottom' )
                    // InternalSlideOMatic.g:1128:3: 'bottom'
                    {
                     before(grammarAccess.getAlignmentAccess().getBottomKeyword_7()); 
                    match(input,63,FOLLOW_2); 
                     after(grammarAccess.getAlignmentAccess().getBottomKeyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalSlideOMatic.g:1133:2: ( 'bottomright' )
                    {
                    // InternalSlideOMatic.g:1133:2: ( 'bottomright' )
                    // InternalSlideOMatic.g:1134:3: 'bottomright'
                    {
                     before(grammarAccess.getAlignmentAccess().getBottomrightKeyword_8()); 
                    match(input,64,FOLLOW_2); 
                     after(grammarAccess.getAlignmentAccess().getBottomrightKeyword_8()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alignment__Alternatives"


    // $ANTLR start "rule__Size__Alternatives_0"
    // InternalSlideOMatic.g:1143:1: rule__Size__Alternatives_0 : ( ( 'width' ) | ( 'height' ) );
    public final void rule__Size__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1147:1: ( ( 'width' ) | ( 'height' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==65) ) {
                alt11=1;
            }
            else if ( (LA11_0==66) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalSlideOMatic.g:1148:2: ( 'width' )
                    {
                    // InternalSlideOMatic.g:1148:2: ( 'width' )
                    // InternalSlideOMatic.g:1149:3: 'width'
                    {
                     before(grammarAccess.getSizeAccess().getWidthKeyword_0_0()); 
                    match(input,65,FOLLOW_2); 
                     after(grammarAccess.getSizeAccess().getWidthKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSlideOMatic.g:1154:2: ( 'height' )
                    {
                    // InternalSlideOMatic.g:1154:2: ( 'height' )
                    // InternalSlideOMatic.g:1155:3: 'height'
                    {
                     before(grammarAccess.getSizeAccess().getHeightKeyword_0_1()); 
                    match(input,66,FOLLOW_2); 
                     after(grammarAccess.getSizeAccess().getHeightKeyword_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Size__Alternatives_0"


    // $ANTLR start "rule__AnimationType__Alternatives"
    // InternalSlideOMatic.g:1164:1: rule__AnimationType__Alternatives : ( ( ( rule__AnimationType__Group_0__0 ) ) | ( ( rule__AnimationType__Group_1__0 ) ) );
    public final void rule__AnimationType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1168:1: ( ( ( rule__AnimationType__Group_0__0 ) ) | ( ( rule__AnimationType__Group_1__0 ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==97) ) {
                alt12=1;
            }
            else if ( (LA12_0==98) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalSlideOMatic.g:1169:2: ( ( rule__AnimationType__Group_0__0 ) )
                    {
                    // InternalSlideOMatic.g:1169:2: ( ( rule__AnimationType__Group_0__0 ) )
                    // InternalSlideOMatic.g:1170:3: ( rule__AnimationType__Group_0__0 )
                    {
                     before(grammarAccess.getAnimationTypeAccess().getGroup_0()); 
                    // InternalSlideOMatic.g:1171:3: ( rule__AnimationType__Group_0__0 )
                    // InternalSlideOMatic.g:1171:4: rule__AnimationType__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AnimationType__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAnimationTypeAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSlideOMatic.g:1175:2: ( ( rule__AnimationType__Group_1__0 ) )
                    {
                    // InternalSlideOMatic.g:1175:2: ( ( rule__AnimationType__Group_1__0 ) )
                    // InternalSlideOMatic.g:1176:3: ( rule__AnimationType__Group_1__0 )
                    {
                     before(grammarAccess.getAnimationTypeAccess().getGroup_1()); 
                    // InternalSlideOMatic.g:1177:3: ( rule__AnimationType__Group_1__0 )
                    // InternalSlideOMatic.g:1177:4: rule__AnimationType__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AnimationType__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAnimationTypeAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnimationType__Alternatives"


    // $ANTLR start "rule__Presentation__Group__0"
    // InternalSlideOMatic.g:1185:1: rule__Presentation__Group__0 : rule__Presentation__Group__0__Impl rule__Presentation__Group__1 ;
    public final void rule__Presentation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1189:1: ( rule__Presentation__Group__0__Impl rule__Presentation__Group__1 )
            // InternalSlideOMatic.g:1190:2: rule__Presentation__Group__0__Impl rule__Presentation__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Presentation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Presentation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Presentation__Group__0"


    // $ANTLR start "rule__Presentation__Group__0__Impl"
    // InternalSlideOMatic.g:1197:1: rule__Presentation__Group__0__Impl : ( 'presentation' ) ;
    public final void rule__Presentation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1201:1: ( ( 'presentation' ) )
            // InternalSlideOMatic.g:1202:1: ( 'presentation' )
            {
            // InternalSlideOMatic.g:1202:1: ( 'presentation' )
            // InternalSlideOMatic.g:1203:2: 'presentation'
            {
             before(grammarAccess.getPresentationAccess().getPresentationKeyword_0()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getPresentationAccess().getPresentationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Presentation__Group__0__Impl"


    // $ANTLR start "rule__Presentation__Group__1"
    // InternalSlideOMatic.g:1212:1: rule__Presentation__Group__1 : rule__Presentation__Group__1__Impl rule__Presentation__Group__2 ;
    public final void rule__Presentation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1216:1: ( rule__Presentation__Group__1__Impl rule__Presentation__Group__2 )
            // InternalSlideOMatic.g:1217:2: rule__Presentation__Group__1__Impl rule__Presentation__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Presentation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Presentation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Presentation__Group__1"


    // $ANTLR start "rule__Presentation__Group__1__Impl"
    // InternalSlideOMatic.g:1224:1: rule__Presentation__Group__1__Impl : ( ( rule__Presentation__NameAssignment_1 ) ) ;
    public final void rule__Presentation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1228:1: ( ( ( rule__Presentation__NameAssignment_1 ) ) )
            // InternalSlideOMatic.g:1229:1: ( ( rule__Presentation__NameAssignment_1 ) )
            {
            // InternalSlideOMatic.g:1229:1: ( ( rule__Presentation__NameAssignment_1 ) )
            // InternalSlideOMatic.g:1230:2: ( rule__Presentation__NameAssignment_1 )
            {
             before(grammarAccess.getPresentationAccess().getNameAssignment_1()); 
            // InternalSlideOMatic.g:1231:2: ( rule__Presentation__NameAssignment_1 )
            // InternalSlideOMatic.g:1231:3: rule__Presentation__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Presentation__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPresentationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Presentation__Group__1__Impl"


    // $ANTLR start "rule__Presentation__Group__2"
    // InternalSlideOMatic.g:1239:1: rule__Presentation__Group__2 : rule__Presentation__Group__2__Impl rule__Presentation__Group__3 ;
    public final void rule__Presentation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1243:1: ( rule__Presentation__Group__2__Impl rule__Presentation__Group__3 )
            // InternalSlideOMatic.g:1244:2: rule__Presentation__Group__2__Impl rule__Presentation__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Presentation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Presentation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Presentation__Group__2"


    // $ANTLR start "rule__Presentation__Group__2__Impl"
    // InternalSlideOMatic.g:1251:1: rule__Presentation__Group__2__Impl : ( '{' ) ;
    public final void rule__Presentation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1255:1: ( ( '{' ) )
            // InternalSlideOMatic.g:1256:1: ( '{' )
            {
            // InternalSlideOMatic.g:1256:1: ( '{' )
            // InternalSlideOMatic.g:1257:2: '{'
            {
             before(grammarAccess.getPresentationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,68,FOLLOW_2); 
             after(grammarAccess.getPresentationAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Presentation__Group__2__Impl"


    // $ANTLR start "rule__Presentation__Group__3"
    // InternalSlideOMatic.g:1266:1: rule__Presentation__Group__3 : rule__Presentation__Group__3__Impl rule__Presentation__Group__4 ;
    public final void rule__Presentation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1270:1: ( rule__Presentation__Group__3__Impl rule__Presentation__Group__4 )
            // InternalSlideOMatic.g:1271:2: rule__Presentation__Group__3__Impl rule__Presentation__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Presentation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Presentation__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Presentation__Group__3"


    // $ANTLR start "rule__Presentation__Group__3__Impl"
    // InternalSlideOMatic.g:1278:1: rule__Presentation__Group__3__Impl : ( ( rule__Presentation__Group_3__0 )? ) ;
    public final void rule__Presentation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1282:1: ( ( ( rule__Presentation__Group_3__0 )? ) )
            // InternalSlideOMatic.g:1283:1: ( ( rule__Presentation__Group_3__0 )? )
            {
            // InternalSlideOMatic.g:1283:1: ( ( rule__Presentation__Group_3__0 )? )
            // InternalSlideOMatic.g:1284:2: ( rule__Presentation__Group_3__0 )?
            {
             before(grammarAccess.getPresentationAccess().getGroup_3()); 
            // InternalSlideOMatic.g:1285:2: ( rule__Presentation__Group_3__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==70) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalSlideOMatic.g:1285:3: rule__Presentation__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Presentation__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPresentationAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Presentation__Group__3__Impl"


    // $ANTLR start "rule__Presentation__Group__4"
    // InternalSlideOMatic.g:1293:1: rule__Presentation__Group__4 : rule__Presentation__Group__4__Impl rule__Presentation__Group__5 ;
    public final void rule__Presentation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1297:1: ( rule__Presentation__Group__4__Impl rule__Presentation__Group__5 )
            // InternalSlideOMatic.g:1298:2: rule__Presentation__Group__4__Impl rule__Presentation__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__Presentation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Presentation__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Presentation__Group__4"


    // $ANTLR start "rule__Presentation__Group__4__Impl"
    // InternalSlideOMatic.g:1305:1: rule__Presentation__Group__4__Impl : ( ( rule__Presentation__Alternatives_4 )* ) ;
    public final void rule__Presentation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1309:1: ( ( ( rule__Presentation__Alternatives_4 )* ) )
            // InternalSlideOMatic.g:1310:1: ( ( rule__Presentation__Alternatives_4 )* )
            {
            // InternalSlideOMatic.g:1310:1: ( ( rule__Presentation__Alternatives_4 )* )
            // InternalSlideOMatic.g:1311:2: ( rule__Presentation__Alternatives_4 )*
            {
             before(grammarAccess.getPresentationAccess().getAlternatives_4()); 
            // InternalSlideOMatic.g:1312:2: ( rule__Presentation__Alternatives_4 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==78||LA14_0==95) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalSlideOMatic.g:1312:3: rule__Presentation__Alternatives_4
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Presentation__Alternatives_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getPresentationAccess().getAlternatives_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Presentation__Group__4__Impl"


    // $ANTLR start "rule__Presentation__Group__5"
    // InternalSlideOMatic.g:1320:1: rule__Presentation__Group__5 : rule__Presentation__Group__5__Impl ;
    public final void rule__Presentation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1324:1: ( rule__Presentation__Group__5__Impl )
            // InternalSlideOMatic.g:1325:2: rule__Presentation__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Presentation__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Presentation__Group__5"


    // $ANTLR start "rule__Presentation__Group__5__Impl"
    // InternalSlideOMatic.g:1331:1: rule__Presentation__Group__5__Impl : ( '}' ) ;
    public final void rule__Presentation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1335:1: ( ( '}' ) )
            // InternalSlideOMatic.g:1336:1: ( '}' )
            {
            // InternalSlideOMatic.g:1336:1: ( '}' )
            // InternalSlideOMatic.g:1337:2: '}'
            {
             before(grammarAccess.getPresentationAccess().getRightCurlyBracketKeyword_5()); 
            match(input,69,FOLLOW_2); 
             after(grammarAccess.getPresentationAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Presentation__Group__5__Impl"


    // $ANTLR start "rule__Presentation__Group_3__0"
    // InternalSlideOMatic.g:1347:1: rule__Presentation__Group_3__0 : rule__Presentation__Group_3__0__Impl rule__Presentation__Group_3__1 ;
    public final void rule__Presentation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1351:1: ( rule__Presentation__Group_3__0__Impl rule__Presentation__Group_3__1 )
            // InternalSlideOMatic.g:1352:2: rule__Presentation__Group_3__0__Impl rule__Presentation__Group_3__1
            {
            pushFollow(FOLLOW_7);
            rule__Presentation__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Presentation__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Presentation__Group_3__0"


    // $ANTLR start "rule__Presentation__Group_3__0__Impl"
    // InternalSlideOMatic.g:1359:1: rule__Presentation__Group_3__0__Impl : ( '(' ) ;
    public final void rule__Presentation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1363:1: ( ( '(' ) )
            // InternalSlideOMatic.g:1364:1: ( '(' )
            {
            // InternalSlideOMatic.g:1364:1: ( '(' )
            // InternalSlideOMatic.g:1365:2: '('
            {
             before(grammarAccess.getPresentationAccess().getLeftParenthesisKeyword_3_0()); 
            match(input,70,FOLLOW_2); 
             after(grammarAccess.getPresentationAccess().getLeftParenthesisKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Presentation__Group_3__0__Impl"


    // $ANTLR start "rule__Presentation__Group_3__1"
    // InternalSlideOMatic.g:1374:1: rule__Presentation__Group_3__1 : rule__Presentation__Group_3__1__Impl rule__Presentation__Group_3__2 ;
    public final void rule__Presentation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1378:1: ( rule__Presentation__Group_3__1__Impl rule__Presentation__Group_3__2 )
            // InternalSlideOMatic.g:1379:2: rule__Presentation__Group_3__1__Impl rule__Presentation__Group_3__2
            {
            pushFollow(FOLLOW_7);
            rule__Presentation__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Presentation__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Presentation__Group_3__1"


    // $ANTLR start "rule__Presentation__Group_3__1__Impl"
    // InternalSlideOMatic.g:1386:1: rule__Presentation__Group_3__1__Impl : ( ( rule__Presentation__ThemeAssignment_3_1 )? ) ;
    public final void rule__Presentation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1390:1: ( ( ( rule__Presentation__ThemeAssignment_3_1 )? ) )
            // InternalSlideOMatic.g:1391:1: ( ( rule__Presentation__ThemeAssignment_3_1 )? )
            {
            // InternalSlideOMatic.g:1391:1: ( ( rule__Presentation__ThemeAssignment_3_1 )? )
            // InternalSlideOMatic.g:1392:2: ( rule__Presentation__ThemeAssignment_3_1 )?
            {
             before(grammarAccess.getPresentationAccess().getThemeAssignment_3_1()); 
            // InternalSlideOMatic.g:1393:2: ( rule__Presentation__ThemeAssignment_3_1 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==72) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalSlideOMatic.g:1393:3: rule__Presentation__ThemeAssignment_3_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Presentation__ThemeAssignment_3_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPresentationAccess().getThemeAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Presentation__Group_3__1__Impl"


    // $ANTLR start "rule__Presentation__Group_3__2"
    // InternalSlideOMatic.g:1401:1: rule__Presentation__Group_3__2 : rule__Presentation__Group_3__2__Impl rule__Presentation__Group_3__3 ;
    public final void rule__Presentation__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1405:1: ( rule__Presentation__Group_3__2__Impl rule__Presentation__Group_3__3 )
            // InternalSlideOMatic.g:1406:2: rule__Presentation__Group_3__2__Impl rule__Presentation__Group_3__3
            {
            pushFollow(FOLLOW_7);
            rule__Presentation__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Presentation__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Presentation__Group_3__2"


    // $ANTLR start "rule__Presentation__Group_3__2__Impl"
    // InternalSlideOMatic.g:1413:1: rule__Presentation__Group_3__2__Impl : ( ( rule__Presentation__AuthorsAssignment_3_2 )? ) ;
    public final void rule__Presentation__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1417:1: ( ( ( rule__Presentation__AuthorsAssignment_3_2 )? ) )
            // InternalSlideOMatic.g:1418:1: ( ( rule__Presentation__AuthorsAssignment_3_2 )? )
            {
            // InternalSlideOMatic.g:1418:1: ( ( rule__Presentation__AuthorsAssignment_3_2 )? )
            // InternalSlideOMatic.g:1419:2: ( rule__Presentation__AuthorsAssignment_3_2 )?
            {
             before(grammarAccess.getPresentationAccess().getAuthorsAssignment_3_2()); 
            // InternalSlideOMatic.g:1420:2: ( rule__Presentation__AuthorsAssignment_3_2 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==74) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalSlideOMatic.g:1420:3: rule__Presentation__AuthorsAssignment_3_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Presentation__AuthorsAssignment_3_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPresentationAccess().getAuthorsAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Presentation__Group_3__2__Impl"


    // $ANTLR start "rule__Presentation__Group_3__3"
    // InternalSlideOMatic.g:1428:1: rule__Presentation__Group_3__3 : rule__Presentation__Group_3__3__Impl rule__Presentation__Group_3__4 ;
    public final void rule__Presentation__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1432:1: ( rule__Presentation__Group_3__3__Impl rule__Presentation__Group_3__4 )
            // InternalSlideOMatic.g:1433:2: rule__Presentation__Group_3__3__Impl rule__Presentation__Group_3__4
            {
            pushFollow(FOLLOW_7);
            rule__Presentation__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Presentation__Group_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Presentation__Group_3__3"


    // $ANTLR start "rule__Presentation__Group_3__3__Impl"
    // InternalSlideOMatic.g:1440:1: rule__Presentation__Group_3__3__Impl : ( ( rule__Presentation__InstituteAssignment_3_3 )? ) ;
    public final void rule__Presentation__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1444:1: ( ( ( rule__Presentation__InstituteAssignment_3_3 )? ) )
            // InternalSlideOMatic.g:1445:1: ( ( rule__Presentation__InstituteAssignment_3_3 )? )
            {
            // InternalSlideOMatic.g:1445:1: ( ( rule__Presentation__InstituteAssignment_3_3 )? )
            // InternalSlideOMatic.g:1446:2: ( rule__Presentation__InstituteAssignment_3_3 )?
            {
             before(grammarAccess.getPresentationAccess().getInstituteAssignment_3_3()); 
            // InternalSlideOMatic.g:1447:2: ( rule__Presentation__InstituteAssignment_3_3 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==76) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalSlideOMatic.g:1447:3: rule__Presentation__InstituteAssignment_3_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Presentation__InstituteAssignment_3_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPresentationAccess().getInstituteAssignment_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Presentation__Group_3__3__Impl"


    // $ANTLR start "rule__Presentation__Group_3__4"
    // InternalSlideOMatic.g:1455:1: rule__Presentation__Group_3__4 : rule__Presentation__Group_3__4__Impl rule__Presentation__Group_3__5 ;
    public final void rule__Presentation__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1459:1: ( rule__Presentation__Group_3__4__Impl rule__Presentation__Group_3__5 )
            // InternalSlideOMatic.g:1460:2: rule__Presentation__Group_3__4__Impl rule__Presentation__Group_3__5
            {
            pushFollow(FOLLOW_7);
            rule__Presentation__Group_3__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Presentation__Group_3__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Presentation__Group_3__4"


    // $ANTLR start "rule__Presentation__Group_3__4__Impl"
    // InternalSlideOMatic.g:1467:1: rule__Presentation__Group_3__4__Impl : ( ( rule__Presentation__DateAssignment_3_4 )? ) ;
    public final void rule__Presentation__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1471:1: ( ( ( rule__Presentation__DateAssignment_3_4 )? ) )
            // InternalSlideOMatic.g:1472:1: ( ( rule__Presentation__DateAssignment_3_4 )? )
            {
            // InternalSlideOMatic.g:1472:1: ( ( rule__Presentation__DateAssignment_3_4 )? )
            // InternalSlideOMatic.g:1473:2: ( rule__Presentation__DateAssignment_3_4 )?
            {
             before(grammarAccess.getPresentationAccess().getDateAssignment_3_4()); 
            // InternalSlideOMatic.g:1474:2: ( rule__Presentation__DateAssignment_3_4 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==77) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalSlideOMatic.g:1474:3: rule__Presentation__DateAssignment_3_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Presentation__DateAssignment_3_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPresentationAccess().getDateAssignment_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Presentation__Group_3__4__Impl"


    // $ANTLR start "rule__Presentation__Group_3__5"
    // InternalSlideOMatic.g:1482:1: rule__Presentation__Group_3__5 : rule__Presentation__Group_3__5__Impl ;
    public final void rule__Presentation__Group_3__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1486:1: ( rule__Presentation__Group_3__5__Impl )
            // InternalSlideOMatic.g:1487:2: rule__Presentation__Group_3__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Presentation__Group_3__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Presentation__Group_3__5"


    // $ANTLR start "rule__Presentation__Group_3__5__Impl"
    // InternalSlideOMatic.g:1493:1: rule__Presentation__Group_3__5__Impl : ( ')' ) ;
    public final void rule__Presentation__Group_3__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1497:1: ( ( ')' ) )
            // InternalSlideOMatic.g:1498:1: ( ')' )
            {
            // InternalSlideOMatic.g:1498:1: ( ')' )
            // InternalSlideOMatic.g:1499:2: ')'
            {
             before(grammarAccess.getPresentationAccess().getRightParenthesisKeyword_3_5()); 
            match(input,71,FOLLOW_2); 
             after(grammarAccess.getPresentationAccess().getRightParenthesisKeyword_3_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Presentation__Group_3__5__Impl"


    // $ANTLR start "rule__Theme__Group__0"
    // InternalSlideOMatic.g:1509:1: rule__Theme__Group__0 : rule__Theme__Group__0__Impl rule__Theme__Group__1 ;
    public final void rule__Theme__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1513:1: ( rule__Theme__Group__0__Impl rule__Theme__Group__1 )
            // InternalSlideOMatic.g:1514:2: rule__Theme__Group__0__Impl rule__Theme__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Theme__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Theme__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theme__Group__0"


    // $ANTLR start "rule__Theme__Group__0__Impl"
    // InternalSlideOMatic.g:1521:1: rule__Theme__Group__0__Impl : ( 'theme' ) ;
    public final void rule__Theme__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1525:1: ( ( 'theme' ) )
            // InternalSlideOMatic.g:1526:1: ( 'theme' )
            {
            // InternalSlideOMatic.g:1526:1: ( 'theme' )
            // InternalSlideOMatic.g:1527:2: 'theme'
            {
             before(grammarAccess.getThemeAccess().getThemeKeyword_0()); 
            match(input,72,FOLLOW_2); 
             after(grammarAccess.getThemeAccess().getThemeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theme__Group__0__Impl"


    // $ANTLR start "rule__Theme__Group__1"
    // InternalSlideOMatic.g:1536:1: rule__Theme__Group__1 : rule__Theme__Group__1__Impl rule__Theme__Group__2 ;
    public final void rule__Theme__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1540:1: ( rule__Theme__Group__1__Impl rule__Theme__Group__2 )
            // InternalSlideOMatic.g:1541:2: rule__Theme__Group__1__Impl rule__Theme__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Theme__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Theme__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theme__Group__1"


    // $ANTLR start "rule__Theme__Group__1__Impl"
    // InternalSlideOMatic.g:1548:1: rule__Theme__Group__1__Impl : ( ( rule__Theme__ThemeAssignment_1 ) ) ;
    public final void rule__Theme__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1552:1: ( ( ( rule__Theme__ThemeAssignment_1 ) ) )
            // InternalSlideOMatic.g:1553:1: ( ( rule__Theme__ThemeAssignment_1 ) )
            {
            // InternalSlideOMatic.g:1553:1: ( ( rule__Theme__ThemeAssignment_1 ) )
            // InternalSlideOMatic.g:1554:2: ( rule__Theme__ThemeAssignment_1 )
            {
             before(grammarAccess.getThemeAccess().getThemeAssignment_1()); 
            // InternalSlideOMatic.g:1555:2: ( rule__Theme__ThemeAssignment_1 )
            // InternalSlideOMatic.g:1555:3: rule__Theme__ThemeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Theme__ThemeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getThemeAccess().getThemeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theme__Group__1__Impl"


    // $ANTLR start "rule__Theme__Group__2"
    // InternalSlideOMatic.g:1563:1: rule__Theme__Group__2 : rule__Theme__Group__2__Impl ;
    public final void rule__Theme__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1567:1: ( rule__Theme__Group__2__Impl )
            // InternalSlideOMatic.g:1568:2: rule__Theme__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Theme__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theme__Group__2"


    // $ANTLR start "rule__Theme__Group__2__Impl"
    // InternalSlideOMatic.g:1574:1: rule__Theme__Group__2__Impl : ( ( rule__Theme__Group_2__0 )? ) ;
    public final void rule__Theme__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1578:1: ( ( ( rule__Theme__Group_2__0 )? ) )
            // InternalSlideOMatic.g:1579:1: ( ( rule__Theme__Group_2__0 )? )
            {
            // InternalSlideOMatic.g:1579:1: ( ( rule__Theme__Group_2__0 )? )
            // InternalSlideOMatic.g:1580:2: ( rule__Theme__Group_2__0 )?
            {
             before(grammarAccess.getThemeAccess().getGroup_2()); 
            // InternalSlideOMatic.g:1581:2: ( rule__Theme__Group_2__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==73) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalSlideOMatic.g:1581:3: rule__Theme__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Theme__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getThemeAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theme__Group__2__Impl"


    // $ANTLR start "rule__Theme__Group_2__0"
    // InternalSlideOMatic.g:1590:1: rule__Theme__Group_2__0 : rule__Theme__Group_2__0__Impl rule__Theme__Group_2__1 ;
    public final void rule__Theme__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1594:1: ( rule__Theme__Group_2__0__Impl rule__Theme__Group_2__1 )
            // InternalSlideOMatic.g:1595:2: rule__Theme__Group_2__0__Impl rule__Theme__Group_2__1
            {
            pushFollow(FOLLOW_10);
            rule__Theme__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Theme__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theme__Group_2__0"


    // $ANTLR start "rule__Theme__Group_2__0__Impl"
    // InternalSlideOMatic.g:1602:1: rule__Theme__Group_2__0__Impl : ( 'color' ) ;
    public final void rule__Theme__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1606:1: ( ( 'color' ) )
            // InternalSlideOMatic.g:1607:1: ( 'color' )
            {
            // InternalSlideOMatic.g:1607:1: ( 'color' )
            // InternalSlideOMatic.g:1608:2: 'color'
            {
             before(grammarAccess.getThemeAccess().getColorKeyword_2_0()); 
            match(input,73,FOLLOW_2); 
             after(grammarAccess.getThemeAccess().getColorKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theme__Group_2__0__Impl"


    // $ANTLR start "rule__Theme__Group_2__1"
    // InternalSlideOMatic.g:1617:1: rule__Theme__Group_2__1 : rule__Theme__Group_2__1__Impl ;
    public final void rule__Theme__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1621:1: ( rule__Theme__Group_2__1__Impl )
            // InternalSlideOMatic.g:1622:2: rule__Theme__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Theme__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theme__Group_2__1"


    // $ANTLR start "rule__Theme__Group_2__1__Impl"
    // InternalSlideOMatic.g:1628:1: rule__Theme__Group_2__1__Impl : ( ( rule__Theme__ThemeColorAssignment_2_1 ) ) ;
    public final void rule__Theme__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1632:1: ( ( ( rule__Theme__ThemeColorAssignment_2_1 ) ) )
            // InternalSlideOMatic.g:1633:1: ( ( rule__Theme__ThemeColorAssignment_2_1 ) )
            {
            // InternalSlideOMatic.g:1633:1: ( ( rule__Theme__ThemeColorAssignment_2_1 ) )
            // InternalSlideOMatic.g:1634:2: ( rule__Theme__ThemeColorAssignment_2_1 )
            {
             before(grammarAccess.getThemeAccess().getThemeColorAssignment_2_1()); 
            // InternalSlideOMatic.g:1635:2: ( rule__Theme__ThemeColorAssignment_2_1 )
            // InternalSlideOMatic.g:1635:3: rule__Theme__ThemeColorAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Theme__ThemeColorAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getThemeAccess().getThemeColorAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theme__Group_2__1__Impl"


    // $ANTLR start "rule__Authors__Group__0"
    // InternalSlideOMatic.g:1644:1: rule__Authors__Group__0 : rule__Authors__Group__0__Impl rule__Authors__Group__1 ;
    public final void rule__Authors__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1648:1: ( rule__Authors__Group__0__Impl rule__Authors__Group__1 )
            // InternalSlideOMatic.g:1649:2: rule__Authors__Group__0__Impl rule__Authors__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Authors__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Authors__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Authors__Group__0"


    // $ANTLR start "rule__Authors__Group__0__Impl"
    // InternalSlideOMatic.g:1656:1: rule__Authors__Group__0__Impl : ( 'author' ) ;
    public final void rule__Authors__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1660:1: ( ( 'author' ) )
            // InternalSlideOMatic.g:1661:1: ( 'author' )
            {
            // InternalSlideOMatic.g:1661:1: ( 'author' )
            // InternalSlideOMatic.g:1662:2: 'author'
            {
             before(grammarAccess.getAuthorsAccess().getAuthorKeyword_0()); 
            match(input,74,FOLLOW_2); 
             after(grammarAccess.getAuthorsAccess().getAuthorKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Authors__Group__0__Impl"


    // $ANTLR start "rule__Authors__Group__1"
    // InternalSlideOMatic.g:1671:1: rule__Authors__Group__1 : rule__Authors__Group__1__Impl rule__Authors__Group__2 ;
    public final void rule__Authors__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1675:1: ( rule__Authors__Group__1__Impl rule__Authors__Group__2 )
            // InternalSlideOMatic.g:1676:2: rule__Authors__Group__1__Impl rule__Authors__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Authors__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Authors__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Authors__Group__1"


    // $ANTLR start "rule__Authors__Group__1__Impl"
    // InternalSlideOMatic.g:1683:1: rule__Authors__Group__1__Impl : ( ( rule__Authors__NamesAssignment_1 ) ) ;
    public final void rule__Authors__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1687:1: ( ( ( rule__Authors__NamesAssignment_1 ) ) )
            // InternalSlideOMatic.g:1688:1: ( ( rule__Authors__NamesAssignment_1 ) )
            {
            // InternalSlideOMatic.g:1688:1: ( ( rule__Authors__NamesAssignment_1 ) )
            // InternalSlideOMatic.g:1689:2: ( rule__Authors__NamesAssignment_1 )
            {
             before(grammarAccess.getAuthorsAccess().getNamesAssignment_1()); 
            // InternalSlideOMatic.g:1690:2: ( rule__Authors__NamesAssignment_1 )
            // InternalSlideOMatic.g:1690:3: rule__Authors__NamesAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Authors__NamesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAuthorsAccess().getNamesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Authors__Group__1__Impl"


    // $ANTLR start "rule__Authors__Group__2"
    // InternalSlideOMatic.g:1698:1: rule__Authors__Group__2 : rule__Authors__Group__2__Impl ;
    public final void rule__Authors__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1702:1: ( rule__Authors__Group__2__Impl )
            // InternalSlideOMatic.g:1703:2: rule__Authors__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Authors__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Authors__Group__2"


    // $ANTLR start "rule__Authors__Group__2__Impl"
    // InternalSlideOMatic.g:1709:1: rule__Authors__Group__2__Impl : ( ( rule__Authors__Group_2__0 )* ) ;
    public final void rule__Authors__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1713:1: ( ( ( rule__Authors__Group_2__0 )* ) )
            // InternalSlideOMatic.g:1714:1: ( ( rule__Authors__Group_2__0 )* )
            {
            // InternalSlideOMatic.g:1714:1: ( ( rule__Authors__Group_2__0 )* )
            // InternalSlideOMatic.g:1715:2: ( rule__Authors__Group_2__0 )*
            {
             before(grammarAccess.getAuthorsAccess().getGroup_2()); 
            // InternalSlideOMatic.g:1716:2: ( rule__Authors__Group_2__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==75) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalSlideOMatic.g:1716:3: rule__Authors__Group_2__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Authors__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getAuthorsAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Authors__Group__2__Impl"


    // $ANTLR start "rule__Authors__Group_2__0"
    // InternalSlideOMatic.g:1725:1: rule__Authors__Group_2__0 : rule__Authors__Group_2__0__Impl rule__Authors__Group_2__1 ;
    public final void rule__Authors__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1729:1: ( rule__Authors__Group_2__0__Impl rule__Authors__Group_2__1 )
            // InternalSlideOMatic.g:1730:2: rule__Authors__Group_2__0__Impl rule__Authors__Group_2__1
            {
            pushFollow(FOLLOW_3);
            rule__Authors__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Authors__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Authors__Group_2__0"


    // $ANTLR start "rule__Authors__Group_2__0__Impl"
    // InternalSlideOMatic.g:1737:1: rule__Authors__Group_2__0__Impl : ( ',' ) ;
    public final void rule__Authors__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1741:1: ( ( ',' ) )
            // InternalSlideOMatic.g:1742:1: ( ',' )
            {
            // InternalSlideOMatic.g:1742:1: ( ',' )
            // InternalSlideOMatic.g:1743:2: ','
            {
             before(grammarAccess.getAuthorsAccess().getCommaKeyword_2_0()); 
            match(input,75,FOLLOW_2); 
             after(grammarAccess.getAuthorsAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Authors__Group_2__0__Impl"


    // $ANTLR start "rule__Authors__Group_2__1"
    // InternalSlideOMatic.g:1752:1: rule__Authors__Group_2__1 : rule__Authors__Group_2__1__Impl ;
    public final void rule__Authors__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1756:1: ( rule__Authors__Group_2__1__Impl )
            // InternalSlideOMatic.g:1757:2: rule__Authors__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Authors__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Authors__Group_2__1"


    // $ANTLR start "rule__Authors__Group_2__1__Impl"
    // InternalSlideOMatic.g:1763:1: rule__Authors__Group_2__1__Impl : ( ( rule__Authors__NamesAssignment_2_1 ) ) ;
    public final void rule__Authors__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1767:1: ( ( ( rule__Authors__NamesAssignment_2_1 ) ) )
            // InternalSlideOMatic.g:1768:1: ( ( rule__Authors__NamesAssignment_2_1 ) )
            {
            // InternalSlideOMatic.g:1768:1: ( ( rule__Authors__NamesAssignment_2_1 ) )
            // InternalSlideOMatic.g:1769:2: ( rule__Authors__NamesAssignment_2_1 )
            {
             before(grammarAccess.getAuthorsAccess().getNamesAssignment_2_1()); 
            // InternalSlideOMatic.g:1770:2: ( rule__Authors__NamesAssignment_2_1 )
            // InternalSlideOMatic.g:1770:3: rule__Authors__NamesAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Authors__NamesAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getAuthorsAccess().getNamesAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Authors__Group_2__1__Impl"


    // $ANTLR start "rule__Institute__Group__0"
    // InternalSlideOMatic.g:1779:1: rule__Institute__Group__0 : rule__Institute__Group__0__Impl rule__Institute__Group__1 ;
    public final void rule__Institute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1783:1: ( rule__Institute__Group__0__Impl rule__Institute__Group__1 )
            // InternalSlideOMatic.g:1784:2: rule__Institute__Group__0__Impl rule__Institute__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Institute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Institute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Institute__Group__0"


    // $ANTLR start "rule__Institute__Group__0__Impl"
    // InternalSlideOMatic.g:1791:1: rule__Institute__Group__0__Impl : ( 'institute' ) ;
    public final void rule__Institute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1795:1: ( ( 'institute' ) )
            // InternalSlideOMatic.g:1796:1: ( 'institute' )
            {
            // InternalSlideOMatic.g:1796:1: ( 'institute' )
            // InternalSlideOMatic.g:1797:2: 'institute'
            {
             before(grammarAccess.getInstituteAccess().getInstituteKeyword_0()); 
            match(input,76,FOLLOW_2); 
             after(grammarAccess.getInstituteAccess().getInstituteKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Institute__Group__0__Impl"


    // $ANTLR start "rule__Institute__Group__1"
    // InternalSlideOMatic.g:1806:1: rule__Institute__Group__1 : rule__Institute__Group__1__Impl ;
    public final void rule__Institute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1810:1: ( rule__Institute__Group__1__Impl )
            // InternalSlideOMatic.g:1811:2: rule__Institute__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Institute__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Institute__Group__1"


    // $ANTLR start "rule__Institute__Group__1__Impl"
    // InternalSlideOMatic.g:1817:1: rule__Institute__Group__1__Impl : ( ( rule__Institute__NameAssignment_1 ) ) ;
    public final void rule__Institute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1821:1: ( ( ( rule__Institute__NameAssignment_1 ) ) )
            // InternalSlideOMatic.g:1822:1: ( ( rule__Institute__NameAssignment_1 ) )
            {
            // InternalSlideOMatic.g:1822:1: ( ( rule__Institute__NameAssignment_1 ) )
            // InternalSlideOMatic.g:1823:2: ( rule__Institute__NameAssignment_1 )
            {
             before(grammarAccess.getInstituteAccess().getNameAssignment_1()); 
            // InternalSlideOMatic.g:1824:2: ( rule__Institute__NameAssignment_1 )
            // InternalSlideOMatic.g:1824:3: rule__Institute__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Institute__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInstituteAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Institute__Group__1__Impl"


    // $ANTLR start "rule__Date__Group__0"
    // InternalSlideOMatic.g:1833:1: rule__Date__Group__0 : rule__Date__Group__0__Impl rule__Date__Group__1 ;
    public final void rule__Date__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1837:1: ( rule__Date__Group__0__Impl rule__Date__Group__1 )
            // InternalSlideOMatic.g:1838:2: rule__Date__Group__0__Impl rule__Date__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Date__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Date__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group__0"


    // $ANTLR start "rule__Date__Group__0__Impl"
    // InternalSlideOMatic.g:1845:1: rule__Date__Group__0__Impl : ( 'date' ) ;
    public final void rule__Date__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1849:1: ( ( 'date' ) )
            // InternalSlideOMatic.g:1850:1: ( 'date' )
            {
            // InternalSlideOMatic.g:1850:1: ( 'date' )
            // InternalSlideOMatic.g:1851:2: 'date'
            {
             before(grammarAccess.getDateAccess().getDateKeyword_0()); 
            match(input,77,FOLLOW_2); 
             after(grammarAccess.getDateAccess().getDateKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group__0__Impl"


    // $ANTLR start "rule__Date__Group__1"
    // InternalSlideOMatic.g:1860:1: rule__Date__Group__1 : rule__Date__Group__1__Impl ;
    public final void rule__Date__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1864:1: ( rule__Date__Group__1__Impl )
            // InternalSlideOMatic.g:1865:2: rule__Date__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Date__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group__1"


    // $ANTLR start "rule__Date__Group__1__Impl"
    // InternalSlideOMatic.g:1871:1: rule__Date__Group__1__Impl : ( ( rule__Date__DateAssignment_1 ) ) ;
    public final void rule__Date__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1875:1: ( ( ( rule__Date__DateAssignment_1 ) ) )
            // InternalSlideOMatic.g:1876:1: ( ( rule__Date__DateAssignment_1 ) )
            {
            // InternalSlideOMatic.g:1876:1: ( ( rule__Date__DateAssignment_1 ) )
            // InternalSlideOMatic.g:1877:2: ( rule__Date__DateAssignment_1 )
            {
             before(grammarAccess.getDateAccess().getDateAssignment_1()); 
            // InternalSlideOMatic.g:1878:2: ( rule__Date__DateAssignment_1 )
            // InternalSlideOMatic.g:1878:3: rule__Date__DateAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Date__DateAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDateAccess().getDateAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group__1__Impl"


    // $ANTLR start "rule__Slide__Group__0"
    // InternalSlideOMatic.g:1887:1: rule__Slide__Group__0 : rule__Slide__Group__0__Impl rule__Slide__Group__1 ;
    public final void rule__Slide__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1891:1: ( rule__Slide__Group__0__Impl rule__Slide__Group__1 )
            // InternalSlideOMatic.g:1892:2: rule__Slide__Group__0__Impl rule__Slide__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Slide__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Slide__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slide__Group__0"


    // $ANTLR start "rule__Slide__Group__0__Impl"
    // InternalSlideOMatic.g:1899:1: rule__Slide__Group__0__Impl : ( 'slide' ) ;
    public final void rule__Slide__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1903:1: ( ( 'slide' ) )
            // InternalSlideOMatic.g:1904:1: ( 'slide' )
            {
            // InternalSlideOMatic.g:1904:1: ( 'slide' )
            // InternalSlideOMatic.g:1905:2: 'slide'
            {
             before(grammarAccess.getSlideAccess().getSlideKeyword_0()); 
            match(input,78,FOLLOW_2); 
             after(grammarAccess.getSlideAccess().getSlideKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slide__Group__0__Impl"


    // $ANTLR start "rule__Slide__Group__1"
    // InternalSlideOMatic.g:1914:1: rule__Slide__Group__1 : rule__Slide__Group__1__Impl rule__Slide__Group__2 ;
    public final void rule__Slide__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1918:1: ( rule__Slide__Group__1__Impl rule__Slide__Group__2 )
            // InternalSlideOMatic.g:1919:2: rule__Slide__Group__1__Impl rule__Slide__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Slide__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Slide__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slide__Group__1"


    // $ANTLR start "rule__Slide__Group__1__Impl"
    // InternalSlideOMatic.g:1926:1: rule__Slide__Group__1__Impl : ( ( rule__Slide__Alternatives_1 )? ) ;
    public final void rule__Slide__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1930:1: ( ( ( rule__Slide__Alternatives_1 )? ) )
            // InternalSlideOMatic.g:1931:1: ( ( rule__Slide__Alternatives_1 )? )
            {
            // InternalSlideOMatic.g:1931:1: ( ( rule__Slide__Alternatives_1 )? )
            // InternalSlideOMatic.g:1932:2: ( rule__Slide__Alternatives_1 )?
            {
             before(grammarAccess.getSlideAccess().getAlternatives_1()); 
            // InternalSlideOMatic.g:1933:2: ( rule__Slide__Alternatives_1 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_STRING||(LA21_0>=79 && LA21_0<=81)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalSlideOMatic.g:1933:3: rule__Slide__Alternatives_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Slide__Alternatives_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSlideAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slide__Group__1__Impl"


    // $ANTLR start "rule__Slide__Group__2"
    // InternalSlideOMatic.g:1941:1: rule__Slide__Group__2 : rule__Slide__Group__2__Impl rule__Slide__Group__3 ;
    public final void rule__Slide__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1945:1: ( rule__Slide__Group__2__Impl rule__Slide__Group__3 )
            // InternalSlideOMatic.g:1946:2: rule__Slide__Group__2__Impl rule__Slide__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__Slide__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Slide__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slide__Group__2"


    // $ANTLR start "rule__Slide__Group__2__Impl"
    // InternalSlideOMatic.g:1953:1: rule__Slide__Group__2__Impl : ( '{' ) ;
    public final void rule__Slide__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1957:1: ( ( '{' ) )
            // InternalSlideOMatic.g:1958:1: ( '{' )
            {
            // InternalSlideOMatic.g:1958:1: ( '{' )
            // InternalSlideOMatic.g:1959:2: '{'
            {
             before(grammarAccess.getSlideAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,68,FOLLOW_2); 
             after(grammarAccess.getSlideAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slide__Group__2__Impl"


    // $ANTLR start "rule__Slide__Group__3"
    // InternalSlideOMatic.g:1968:1: rule__Slide__Group__3 : rule__Slide__Group__3__Impl rule__Slide__Group__4 ;
    public final void rule__Slide__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1972:1: ( rule__Slide__Group__3__Impl rule__Slide__Group__4 )
            // InternalSlideOMatic.g:1973:2: rule__Slide__Group__3__Impl rule__Slide__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__Slide__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Slide__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slide__Group__3"


    // $ANTLR start "rule__Slide__Group__3__Impl"
    // InternalSlideOMatic.g:1980:1: rule__Slide__Group__3__Impl : ( ( ( rule__Slide__ContentsAssignment_3 ) ) ( ( rule__Slide__ContentsAssignment_3 )* ) ) ;
    public final void rule__Slide__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1984:1: ( ( ( ( rule__Slide__ContentsAssignment_3 ) ) ( ( rule__Slide__ContentsAssignment_3 )* ) ) )
            // InternalSlideOMatic.g:1985:1: ( ( ( rule__Slide__ContentsAssignment_3 ) ) ( ( rule__Slide__ContentsAssignment_3 )* ) )
            {
            // InternalSlideOMatic.g:1985:1: ( ( ( rule__Slide__ContentsAssignment_3 ) ) ( ( rule__Slide__ContentsAssignment_3 )* ) )
            // InternalSlideOMatic.g:1986:2: ( ( rule__Slide__ContentsAssignment_3 ) ) ( ( rule__Slide__ContentsAssignment_3 )* )
            {
            // InternalSlideOMatic.g:1986:2: ( ( rule__Slide__ContentsAssignment_3 ) )
            // InternalSlideOMatic.g:1987:3: ( rule__Slide__ContentsAssignment_3 )
            {
             before(grammarAccess.getSlideAccess().getContentsAssignment_3()); 
            // InternalSlideOMatic.g:1988:3: ( rule__Slide__ContentsAssignment_3 )
            // InternalSlideOMatic.g:1988:4: rule__Slide__ContentsAssignment_3
            {
            pushFollow(FOLLOW_16);
            rule__Slide__ContentsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSlideAccess().getContentsAssignment_3()); 

            }

            // InternalSlideOMatic.g:1991:2: ( ( rule__Slide__ContentsAssignment_3 )* )
            // InternalSlideOMatic.g:1992:3: ( rule__Slide__ContentsAssignment_3 )*
            {
             before(grammarAccess.getSlideAccess().getContentsAssignment_3()); 
            // InternalSlideOMatic.g:1993:3: ( rule__Slide__ContentsAssignment_3 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=82 && LA22_0<=86)||LA22_0==89||LA22_0==92) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalSlideOMatic.g:1993:4: rule__Slide__ContentsAssignment_3
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__Slide__ContentsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getSlideAccess().getContentsAssignment_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slide__Group__3__Impl"


    // $ANTLR start "rule__Slide__Group__4"
    // InternalSlideOMatic.g:2002:1: rule__Slide__Group__4 : rule__Slide__Group__4__Impl ;
    public final void rule__Slide__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2006:1: ( rule__Slide__Group__4__Impl )
            // InternalSlideOMatic.g:2007:2: rule__Slide__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Slide__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slide__Group__4"


    // $ANTLR start "rule__Slide__Group__4__Impl"
    // InternalSlideOMatic.g:2013:1: rule__Slide__Group__4__Impl : ( '}' ) ;
    public final void rule__Slide__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2017:1: ( ( '}' ) )
            // InternalSlideOMatic.g:2018:1: ( '}' )
            {
            // InternalSlideOMatic.g:2018:1: ( '}' )
            // InternalSlideOMatic.g:2019:2: '}'
            {
             before(grammarAccess.getSlideAccess().getRightCurlyBracketKeyword_4()); 
            match(input,69,FOLLOW_2); 
             after(grammarAccess.getSlideAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slide__Group__4__Impl"


    // $ANTLR start "rule__Slide__Group_1_0__0"
    // InternalSlideOMatic.g:2029:1: rule__Slide__Group_1_0__0 : rule__Slide__Group_1_0__0__Impl rule__Slide__Group_1_0__1 ;
    public final void rule__Slide__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2033:1: ( rule__Slide__Group_1_0__0__Impl rule__Slide__Group_1_0__1 )
            // InternalSlideOMatic.g:2034:2: rule__Slide__Group_1_0__0__Impl rule__Slide__Group_1_0__1
            {
            pushFollow(FOLLOW_3);
            rule__Slide__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Slide__Group_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slide__Group_1_0__0"


    // $ANTLR start "rule__Slide__Group_1_0__0__Impl"
    // InternalSlideOMatic.g:2041:1: rule__Slide__Group_1_0__0__Impl : ( ruleSection ) ;
    public final void rule__Slide__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2045:1: ( ( ruleSection ) )
            // InternalSlideOMatic.g:2046:1: ( ruleSection )
            {
            // InternalSlideOMatic.g:2046:1: ( ruleSection )
            // InternalSlideOMatic.g:2047:2: ruleSection
            {
             before(grammarAccess.getSlideAccess().getSectionParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSection();

            state._fsp--;

             after(grammarAccess.getSlideAccess().getSectionParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slide__Group_1_0__0__Impl"


    // $ANTLR start "rule__Slide__Group_1_0__1"
    // InternalSlideOMatic.g:2056:1: rule__Slide__Group_1_0__1 : rule__Slide__Group_1_0__1__Impl ;
    public final void rule__Slide__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2060:1: ( rule__Slide__Group_1_0__1__Impl )
            // InternalSlideOMatic.g:2061:2: rule__Slide__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Slide__Group_1_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slide__Group_1_0__1"


    // $ANTLR start "rule__Slide__Group_1_0__1__Impl"
    // InternalSlideOMatic.g:2067:1: rule__Slide__Group_1_0__1__Impl : ( ( rule__Slide__NameAssignment_1_0_1 ) ) ;
    public final void rule__Slide__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2071:1: ( ( ( rule__Slide__NameAssignment_1_0_1 ) ) )
            // InternalSlideOMatic.g:2072:1: ( ( rule__Slide__NameAssignment_1_0_1 ) )
            {
            // InternalSlideOMatic.g:2072:1: ( ( rule__Slide__NameAssignment_1_0_1 ) )
            // InternalSlideOMatic.g:2073:2: ( rule__Slide__NameAssignment_1_0_1 )
            {
             before(grammarAccess.getSlideAccess().getNameAssignment_1_0_1()); 
            // InternalSlideOMatic.g:2074:2: ( rule__Slide__NameAssignment_1_0_1 )
            // InternalSlideOMatic.g:2074:3: rule__Slide__NameAssignment_1_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Slide__NameAssignment_1_0_1();

            state._fsp--;


            }

             after(grammarAccess.getSlideAccess().getNameAssignment_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slide__Group_1_0__1__Impl"


    // $ANTLR start "rule__Section__Group_0__0"
    // InternalSlideOMatic.g:2083:1: rule__Section__Group_0__0 : rule__Section__Group_0__0__Impl rule__Section__Group_0__1 ;
    public final void rule__Section__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2087:1: ( rule__Section__Group_0__0__Impl rule__Section__Group_0__1 )
            // InternalSlideOMatic.g:2088:2: rule__Section__Group_0__0__Impl rule__Section__Group_0__1
            {
            pushFollow(FOLLOW_17);
            rule__Section__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Section__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group_0__0"


    // $ANTLR start "rule__Section__Group_0__0__Impl"
    // InternalSlideOMatic.g:2095:1: rule__Section__Group_0__0__Impl : ( () ) ;
    public final void rule__Section__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2099:1: ( ( () ) )
            // InternalSlideOMatic.g:2100:1: ( () )
            {
            // InternalSlideOMatic.g:2100:1: ( () )
            // InternalSlideOMatic.g:2101:2: ()
            {
             before(grammarAccess.getSectionAccess().getSecAction_0_0()); 
            // InternalSlideOMatic.g:2102:2: ()
            // InternalSlideOMatic.g:2102:3: 
            {
            }

             after(grammarAccess.getSectionAccess().getSecAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group_0__0__Impl"


    // $ANTLR start "rule__Section__Group_0__1"
    // InternalSlideOMatic.g:2110:1: rule__Section__Group_0__1 : rule__Section__Group_0__1__Impl ;
    public final void rule__Section__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2114:1: ( rule__Section__Group_0__1__Impl )
            // InternalSlideOMatic.g:2115:2: rule__Section__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Section__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group_0__1"


    // $ANTLR start "rule__Section__Group_0__1__Impl"
    // InternalSlideOMatic.g:2121:1: rule__Section__Group_0__1__Impl : ( '*' ) ;
    public final void rule__Section__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2125:1: ( ( '*' ) )
            // InternalSlideOMatic.g:2126:1: ( '*' )
            {
            // InternalSlideOMatic.g:2126:1: ( '*' )
            // InternalSlideOMatic.g:2127:2: '*'
            {
             before(grammarAccess.getSectionAccess().getAsteriskKeyword_0_1()); 
            match(input,79,FOLLOW_2); 
             after(grammarAccess.getSectionAccess().getAsteriskKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group_0__1__Impl"


    // $ANTLR start "rule__Section__Group_1__0"
    // InternalSlideOMatic.g:2137:1: rule__Section__Group_1__0 : rule__Section__Group_1__0__Impl rule__Section__Group_1__1 ;
    public final void rule__Section__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2141:1: ( rule__Section__Group_1__0__Impl rule__Section__Group_1__1 )
            // InternalSlideOMatic.g:2142:2: rule__Section__Group_1__0__Impl rule__Section__Group_1__1
            {
            pushFollow(FOLLOW_18);
            rule__Section__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Section__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group_1__0"


    // $ANTLR start "rule__Section__Group_1__0__Impl"
    // InternalSlideOMatic.g:2149:1: rule__Section__Group_1__0__Impl : ( () ) ;
    public final void rule__Section__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2153:1: ( ( () ) )
            // InternalSlideOMatic.g:2154:1: ( () )
            {
            // InternalSlideOMatic.g:2154:1: ( () )
            // InternalSlideOMatic.g:2155:2: ()
            {
             before(grammarAccess.getSectionAccess().getSubSecAction_1_0()); 
            // InternalSlideOMatic.g:2156:2: ()
            // InternalSlideOMatic.g:2156:3: 
            {
            }

             after(grammarAccess.getSectionAccess().getSubSecAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group_1__0__Impl"


    // $ANTLR start "rule__Section__Group_1__1"
    // InternalSlideOMatic.g:2164:1: rule__Section__Group_1__1 : rule__Section__Group_1__1__Impl ;
    public final void rule__Section__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2168:1: ( rule__Section__Group_1__1__Impl )
            // InternalSlideOMatic.g:2169:2: rule__Section__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Section__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group_1__1"


    // $ANTLR start "rule__Section__Group_1__1__Impl"
    // InternalSlideOMatic.g:2175:1: rule__Section__Group_1__1__Impl : ( '**' ) ;
    public final void rule__Section__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2179:1: ( ( '**' ) )
            // InternalSlideOMatic.g:2180:1: ( '**' )
            {
            // InternalSlideOMatic.g:2180:1: ( '**' )
            // InternalSlideOMatic.g:2181:2: '**'
            {
             before(grammarAccess.getSectionAccess().getAsteriskAsteriskKeyword_1_1()); 
            match(input,80,FOLLOW_2); 
             after(grammarAccess.getSectionAccess().getAsteriskAsteriskKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group_1__1__Impl"


    // $ANTLR start "rule__Section__Group_2__0"
    // InternalSlideOMatic.g:2191:1: rule__Section__Group_2__0 : rule__Section__Group_2__0__Impl rule__Section__Group_2__1 ;
    public final void rule__Section__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2195:1: ( rule__Section__Group_2__0__Impl rule__Section__Group_2__1 )
            // InternalSlideOMatic.g:2196:2: rule__Section__Group_2__0__Impl rule__Section__Group_2__1
            {
            pushFollow(FOLLOW_19);
            rule__Section__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Section__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group_2__0"


    // $ANTLR start "rule__Section__Group_2__0__Impl"
    // InternalSlideOMatic.g:2203:1: rule__Section__Group_2__0__Impl : ( () ) ;
    public final void rule__Section__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2207:1: ( ( () ) )
            // InternalSlideOMatic.g:2208:1: ( () )
            {
            // InternalSlideOMatic.g:2208:1: ( () )
            // InternalSlideOMatic.g:2209:2: ()
            {
             before(grammarAccess.getSectionAccess().getSubSubSecAction_2_0()); 
            // InternalSlideOMatic.g:2210:2: ()
            // InternalSlideOMatic.g:2210:3: 
            {
            }

             after(grammarAccess.getSectionAccess().getSubSubSecAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group_2__0__Impl"


    // $ANTLR start "rule__Section__Group_2__1"
    // InternalSlideOMatic.g:2218:1: rule__Section__Group_2__1 : rule__Section__Group_2__1__Impl ;
    public final void rule__Section__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2222:1: ( rule__Section__Group_2__1__Impl )
            // InternalSlideOMatic.g:2223:2: rule__Section__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Section__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group_2__1"


    // $ANTLR start "rule__Section__Group_2__1__Impl"
    // InternalSlideOMatic.g:2229:1: rule__Section__Group_2__1__Impl : ( '***' ) ;
    public final void rule__Section__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2233:1: ( ( '***' ) )
            // InternalSlideOMatic.g:2234:1: ( '***' )
            {
            // InternalSlideOMatic.g:2234:1: ( '***' )
            // InternalSlideOMatic.g:2235:2: '***'
            {
             before(grammarAccess.getSectionAccess().getAsteriskAsteriskAsteriskKeyword_2_1()); 
            match(input,81,FOLLOW_2); 
             after(grammarAccess.getSectionAccess().getAsteriskAsteriskAsteriskKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group_2__1__Impl"


    // $ANTLR start "rule__Content__Group_0__0"
    // InternalSlideOMatic.g:2245:1: rule__Content__Group_0__0 : rule__Content__Group_0__0__Impl rule__Content__Group_0__1 ;
    public final void rule__Content__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2249:1: ( rule__Content__Group_0__0__Impl rule__Content__Group_0__1 )
            // InternalSlideOMatic.g:2250:2: rule__Content__Group_0__0__Impl rule__Content__Group_0__1
            {
            pushFollow(FOLLOW_20);
            rule__Content__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Content__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Content__Group_0__0"


    // $ANTLR start "rule__Content__Group_0__0__Impl"
    // InternalSlideOMatic.g:2257:1: rule__Content__Group_0__0__Impl : ( () ) ;
    public final void rule__Content__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2261:1: ( ( () ) )
            // InternalSlideOMatic.g:2262:1: ( () )
            {
            // InternalSlideOMatic.g:2262:1: ( () )
            // InternalSlideOMatic.g:2263:2: ()
            {
             before(grammarAccess.getContentAccess().getTOCAction_0_0()); 
            // InternalSlideOMatic.g:2264:2: ()
            // InternalSlideOMatic.g:2264:3: 
            {
            }

             after(grammarAccess.getContentAccess().getTOCAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Content__Group_0__0__Impl"


    // $ANTLR start "rule__Content__Group_0__1"
    // InternalSlideOMatic.g:2272:1: rule__Content__Group_0__1 : rule__Content__Group_0__1__Impl ;
    public final void rule__Content__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2276:1: ( rule__Content__Group_0__1__Impl )
            // InternalSlideOMatic.g:2277:2: rule__Content__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Content__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Content__Group_0__1"


    // $ANTLR start "rule__Content__Group_0__1__Impl"
    // InternalSlideOMatic.g:2283:1: rule__Content__Group_0__1__Impl : ( 'ToC' ) ;
    public final void rule__Content__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2287:1: ( ( 'ToC' ) )
            // InternalSlideOMatic.g:2288:1: ( 'ToC' )
            {
            // InternalSlideOMatic.g:2288:1: ( 'ToC' )
            // InternalSlideOMatic.g:2289:2: 'ToC'
            {
             before(grammarAccess.getContentAccess().getToCKeyword_0_1()); 
            match(input,82,FOLLOW_2); 
             after(grammarAccess.getContentAccess().getToCKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Content__Group_0__1__Impl"


    // $ANTLR start "rule__Text__Group_0__0"
    // InternalSlideOMatic.g:2299:1: rule__Text__Group_0__0 : rule__Text__Group_0__0__Impl rule__Text__Group_0__1 ;
    public final void rule__Text__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2303:1: ( rule__Text__Group_0__0__Impl rule__Text__Group_0__1 )
            // InternalSlideOMatic.g:2304:2: rule__Text__Group_0__0__Impl rule__Text__Group_0__1
            {
            pushFollow(FOLLOW_21);
            rule__Text__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Text__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__Group_0__0"


    // $ANTLR start "rule__Text__Group_0__0__Impl"
    // InternalSlideOMatic.g:2311:1: rule__Text__Group_0__0__Impl : ( () ) ;
    public final void rule__Text__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2315:1: ( ( () ) )
            // InternalSlideOMatic.g:2316:1: ( () )
            {
            // InternalSlideOMatic.g:2316:1: ( () )
            // InternalSlideOMatic.g:2317:2: ()
            {
             before(grammarAccess.getTextAccess().getParagraphAction_0_0()); 
            // InternalSlideOMatic.g:2318:2: ()
            // InternalSlideOMatic.g:2318:3: 
            {
            }

             after(grammarAccess.getTextAccess().getParagraphAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__Group_0__0__Impl"


    // $ANTLR start "rule__Text__Group_0__1"
    // InternalSlideOMatic.g:2326:1: rule__Text__Group_0__1 : rule__Text__Group_0__1__Impl rule__Text__Group_0__2 ;
    public final void rule__Text__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2330:1: ( rule__Text__Group_0__1__Impl rule__Text__Group_0__2 )
            // InternalSlideOMatic.g:2331:2: rule__Text__Group_0__1__Impl rule__Text__Group_0__2
            {
            pushFollow(FOLLOW_3);
            rule__Text__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Text__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__Group_0__1"


    // $ANTLR start "rule__Text__Group_0__1__Impl"
    // InternalSlideOMatic.g:2338:1: rule__Text__Group_0__1__Impl : ( '>' ) ;
    public final void rule__Text__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2342:1: ( ( '>' ) )
            // InternalSlideOMatic.g:2343:1: ( '>' )
            {
            // InternalSlideOMatic.g:2343:1: ( '>' )
            // InternalSlideOMatic.g:2344:2: '>'
            {
             before(grammarAccess.getTextAccess().getGreaterThanSignKeyword_0_1()); 
            match(input,83,FOLLOW_2); 
             after(grammarAccess.getTextAccess().getGreaterThanSignKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__Group_0__1__Impl"


    // $ANTLR start "rule__Text__Group_0__2"
    // InternalSlideOMatic.g:2353:1: rule__Text__Group_0__2 : rule__Text__Group_0__2__Impl rule__Text__Group_0__3 ;
    public final void rule__Text__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2357:1: ( rule__Text__Group_0__2__Impl rule__Text__Group_0__3 )
            // InternalSlideOMatic.g:2358:2: rule__Text__Group_0__2__Impl rule__Text__Group_0__3
            {
            pushFollow(FOLLOW_22);
            rule__Text__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Text__Group_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__Group_0__2"


    // $ANTLR start "rule__Text__Group_0__2__Impl"
    // InternalSlideOMatic.g:2365:1: rule__Text__Group_0__2__Impl : ( ( rule__Text__TextAssignment_0_2 ) ) ;
    public final void rule__Text__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2369:1: ( ( ( rule__Text__TextAssignment_0_2 ) ) )
            // InternalSlideOMatic.g:2370:1: ( ( rule__Text__TextAssignment_0_2 ) )
            {
            // InternalSlideOMatic.g:2370:1: ( ( rule__Text__TextAssignment_0_2 ) )
            // InternalSlideOMatic.g:2371:2: ( rule__Text__TextAssignment_0_2 )
            {
             before(grammarAccess.getTextAccess().getTextAssignment_0_2()); 
            // InternalSlideOMatic.g:2372:2: ( rule__Text__TextAssignment_0_2 )
            // InternalSlideOMatic.g:2372:3: rule__Text__TextAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__Text__TextAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getTextAccess().getTextAssignment_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__Group_0__2__Impl"


    // $ANTLR start "rule__Text__Group_0__3"
    // InternalSlideOMatic.g:2380:1: rule__Text__Group_0__3 : rule__Text__Group_0__3__Impl ;
    public final void rule__Text__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2384:1: ( rule__Text__Group_0__3__Impl )
            // InternalSlideOMatic.g:2385:2: rule__Text__Group_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Text__Group_0__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__Group_0__3"


    // $ANTLR start "rule__Text__Group_0__3__Impl"
    // InternalSlideOMatic.g:2391:1: rule__Text__Group_0__3__Impl : ( ( ruleClick )? ) ;
    public final void rule__Text__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2395:1: ( ( ( ruleClick )? ) )
            // InternalSlideOMatic.g:2396:1: ( ( ruleClick )? )
            {
            // InternalSlideOMatic.g:2396:1: ( ( ruleClick )? )
            // InternalSlideOMatic.g:2397:2: ( ruleClick )?
            {
             before(grammarAccess.getTextAccess().getClickParserRuleCall_0_3()); 
            // InternalSlideOMatic.g:2398:2: ( ruleClick )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==11) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalSlideOMatic.g:2398:3: ruleClick
                    {
                    pushFollow(FOLLOW_2);
                    ruleClick();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTextAccess().getClickParserRuleCall_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__Group_0__3__Impl"


    // $ANTLR start "rule__Text__Group_1__0"
    // InternalSlideOMatic.g:2407:1: rule__Text__Group_1__0 : rule__Text__Group_1__0__Impl rule__Text__Group_1__1 ;
    public final void rule__Text__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2411:1: ( rule__Text__Group_1__0__Impl rule__Text__Group_1__1 )
            // InternalSlideOMatic.g:2412:2: rule__Text__Group_1__0__Impl rule__Text__Group_1__1
            {
            pushFollow(FOLLOW_23);
            rule__Text__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Text__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__Group_1__0"


    // $ANTLR start "rule__Text__Group_1__0__Impl"
    // InternalSlideOMatic.g:2419:1: rule__Text__Group_1__0__Impl : ( () ) ;
    public final void rule__Text__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2423:1: ( ( () ) )
            // InternalSlideOMatic.g:2424:1: ( () )
            {
            // InternalSlideOMatic.g:2424:1: ( () )
            // InternalSlideOMatic.g:2425:2: ()
            {
             before(grammarAccess.getTextAccess().getBlockAction_1_0()); 
            // InternalSlideOMatic.g:2426:2: ()
            // InternalSlideOMatic.g:2426:3: 
            {
            }

             after(grammarAccess.getTextAccess().getBlockAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__Group_1__0__Impl"


    // $ANTLR start "rule__Text__Group_1__1"
    // InternalSlideOMatic.g:2434:1: rule__Text__Group_1__1 : rule__Text__Group_1__1__Impl rule__Text__Group_1__2 ;
    public final void rule__Text__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2438:1: ( rule__Text__Group_1__1__Impl rule__Text__Group_1__2 )
            // InternalSlideOMatic.g:2439:2: rule__Text__Group_1__1__Impl rule__Text__Group_1__2
            {
            pushFollow(FOLLOW_24);
            rule__Text__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Text__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__Group_1__1"


    // $ANTLR start "rule__Text__Group_1__1__Impl"
    // InternalSlideOMatic.g:2446:1: rule__Text__Group_1__1__Impl : ( 'block' ) ;
    public final void rule__Text__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2450:1: ( ( 'block' ) )
            // InternalSlideOMatic.g:2451:1: ( 'block' )
            {
            // InternalSlideOMatic.g:2451:1: ( 'block' )
            // InternalSlideOMatic.g:2452:2: 'block'
            {
             before(grammarAccess.getTextAccess().getBlockKeyword_1_1()); 
            match(input,84,FOLLOW_2); 
             after(grammarAccess.getTextAccess().getBlockKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__Group_1__1__Impl"


    // $ANTLR start "rule__Text__Group_1__2"
    // InternalSlideOMatic.g:2461:1: rule__Text__Group_1__2 : rule__Text__Group_1__2__Impl rule__Text__Group_1__3 ;
    public final void rule__Text__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2465:1: ( rule__Text__Group_1__2__Impl rule__Text__Group_1__3 )
            // InternalSlideOMatic.g:2466:2: rule__Text__Group_1__2__Impl rule__Text__Group_1__3
            {
            pushFollow(FOLLOW_24);
            rule__Text__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Text__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__Group_1__2"


    // $ANTLR start "rule__Text__Group_1__2__Impl"
    // InternalSlideOMatic.g:2473:1: rule__Text__Group_1__2__Impl : ( ( rule__Text__NameAssignment_1_2 )? ) ;
    public final void rule__Text__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2477:1: ( ( ( rule__Text__NameAssignment_1_2 )? ) )
            // InternalSlideOMatic.g:2478:1: ( ( rule__Text__NameAssignment_1_2 )? )
            {
            // InternalSlideOMatic.g:2478:1: ( ( rule__Text__NameAssignment_1_2 )? )
            // InternalSlideOMatic.g:2479:2: ( rule__Text__NameAssignment_1_2 )?
            {
             before(grammarAccess.getTextAccess().getNameAssignment_1_2()); 
            // InternalSlideOMatic.g:2480:2: ( rule__Text__NameAssignment_1_2 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_STRING) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalSlideOMatic.g:2480:3: rule__Text__NameAssignment_1_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Text__NameAssignment_1_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTextAccess().getNameAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__Group_1__2__Impl"


    // $ANTLR start "rule__Text__Group_1__3"
    // InternalSlideOMatic.g:2488:1: rule__Text__Group_1__3 : rule__Text__Group_1__3__Impl rule__Text__Group_1__4 ;
    public final void rule__Text__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2492:1: ( rule__Text__Group_1__3__Impl rule__Text__Group_1__4 )
            // InternalSlideOMatic.g:2493:2: rule__Text__Group_1__3__Impl rule__Text__Group_1__4
            {
            pushFollow(FOLLOW_3);
            rule__Text__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Text__Group_1__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__Group_1__3"


    // $ANTLR start "rule__Text__Group_1__3__Impl"
    // InternalSlideOMatic.g:2500:1: rule__Text__Group_1__3__Impl : ( '{' ) ;
    public final void rule__Text__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2504:1: ( ( '{' ) )
            // InternalSlideOMatic.g:2505:1: ( '{' )
            {
            // InternalSlideOMatic.g:2505:1: ( '{' )
            // InternalSlideOMatic.g:2506:2: '{'
            {
             before(grammarAccess.getTextAccess().getLeftCurlyBracketKeyword_1_3()); 
            match(input,68,FOLLOW_2); 
             after(grammarAccess.getTextAccess().getLeftCurlyBracketKeyword_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__Group_1__3__Impl"


    // $ANTLR start "rule__Text__Group_1__4"
    // InternalSlideOMatic.g:2515:1: rule__Text__Group_1__4 : rule__Text__Group_1__4__Impl rule__Text__Group_1__5 ;
    public final void rule__Text__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2519:1: ( rule__Text__Group_1__4__Impl rule__Text__Group_1__5 )
            // InternalSlideOMatic.g:2520:2: rule__Text__Group_1__4__Impl rule__Text__Group_1__5
            {
            pushFollow(FOLLOW_15);
            rule__Text__Group_1__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Text__Group_1__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__Group_1__4"


    // $ANTLR start "rule__Text__Group_1__4__Impl"
    // InternalSlideOMatic.g:2527:1: rule__Text__Group_1__4__Impl : ( ( rule__Text__TextAssignment_1_4 ) ) ;
    public final void rule__Text__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2531:1: ( ( ( rule__Text__TextAssignment_1_4 ) ) )
            // InternalSlideOMatic.g:2532:1: ( ( rule__Text__TextAssignment_1_4 ) )
            {
            // InternalSlideOMatic.g:2532:1: ( ( rule__Text__TextAssignment_1_4 ) )
            // InternalSlideOMatic.g:2533:2: ( rule__Text__TextAssignment_1_4 )
            {
             before(grammarAccess.getTextAccess().getTextAssignment_1_4()); 
            // InternalSlideOMatic.g:2534:2: ( rule__Text__TextAssignment_1_4 )
            // InternalSlideOMatic.g:2534:3: rule__Text__TextAssignment_1_4
            {
            pushFollow(FOLLOW_2);
            rule__Text__TextAssignment_1_4();

            state._fsp--;


            }

             after(grammarAccess.getTextAccess().getTextAssignment_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__Group_1__4__Impl"


    // $ANTLR start "rule__Text__Group_1__5"
    // InternalSlideOMatic.g:2542:1: rule__Text__Group_1__5 : rule__Text__Group_1__5__Impl rule__Text__Group_1__6 ;
    public final void rule__Text__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2546:1: ( rule__Text__Group_1__5__Impl rule__Text__Group_1__6 )
            // InternalSlideOMatic.g:2547:2: rule__Text__Group_1__5__Impl rule__Text__Group_1__6
            {
            pushFollow(FOLLOW_22);
            rule__Text__Group_1__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Text__Group_1__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__Group_1__5"


    // $ANTLR start "rule__Text__Group_1__5__Impl"
    // InternalSlideOMatic.g:2554:1: rule__Text__Group_1__5__Impl : ( '}' ) ;
    public final void rule__Text__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2558:1: ( ( '}' ) )
            // InternalSlideOMatic.g:2559:1: ( '}' )
            {
            // InternalSlideOMatic.g:2559:1: ( '}' )
            // InternalSlideOMatic.g:2560:2: '}'
            {
             before(grammarAccess.getTextAccess().getRightCurlyBracketKeyword_1_5()); 
            match(input,69,FOLLOW_2); 
             after(grammarAccess.getTextAccess().getRightCurlyBracketKeyword_1_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__Group_1__5__Impl"


    // $ANTLR start "rule__Text__Group_1__6"
    // InternalSlideOMatic.g:2569:1: rule__Text__Group_1__6 : rule__Text__Group_1__6__Impl ;
    public final void rule__Text__Group_1__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2573:1: ( rule__Text__Group_1__6__Impl )
            // InternalSlideOMatic.g:2574:2: rule__Text__Group_1__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Text__Group_1__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__Group_1__6"


    // $ANTLR start "rule__Text__Group_1__6__Impl"
    // InternalSlideOMatic.g:2580:1: rule__Text__Group_1__6__Impl : ( ( ruleClick )? ) ;
    public final void rule__Text__Group_1__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2584:1: ( ( ( ruleClick )? ) )
            // InternalSlideOMatic.g:2585:1: ( ( ruleClick )? )
            {
            // InternalSlideOMatic.g:2585:1: ( ( ruleClick )? )
            // InternalSlideOMatic.g:2586:2: ( ruleClick )?
            {
             before(grammarAccess.getTextAccess().getClickParserRuleCall_1_6()); 
            // InternalSlideOMatic.g:2587:2: ( ruleClick )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==11) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalSlideOMatic.g:2587:3: ruleClick
                    {
                    pushFollow(FOLLOW_2);
                    ruleClick();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTextAccess().getClickParserRuleCall_1_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__Group_1__6__Impl"


    // $ANTLR start "rule__List__Group_0__0"
    // InternalSlideOMatic.g:2596:1: rule__List__Group_0__0 : rule__List__Group_0__0__Impl rule__List__Group_0__1 ;
    public final void rule__List__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2600:1: ( rule__List__Group_0__0__Impl rule__List__Group_0__1 )
            // InternalSlideOMatic.g:2601:2: rule__List__Group_0__0__Impl rule__List__Group_0__1
            {
            pushFollow(FOLLOW_25);
            rule__List__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__List__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__List__Group_0__0"


    // $ANTLR start "rule__List__Group_0__0__Impl"
    // InternalSlideOMatic.g:2608:1: rule__List__Group_0__0__Impl : ( () ) ;
    public final void rule__List__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2612:1: ( ( () ) )
            // InternalSlideOMatic.g:2613:1: ( () )
            {
            // InternalSlideOMatic.g:2613:1: ( () )
            // InternalSlideOMatic.g:2614:2: ()
            {
             before(grammarAccess.getListAccess().getNumberedListAction_0_0()); 
            // InternalSlideOMatic.g:2615:2: ()
            // InternalSlideOMatic.g:2615:3: 
            {
            }

             after(grammarAccess.getListAccess().getNumberedListAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__List__Group_0__0__Impl"


    // $ANTLR start "rule__List__Group_0__1"
    // InternalSlideOMatic.g:2623:1: rule__List__Group_0__1 : rule__List__Group_0__1__Impl rule__List__Group_0__2 ;
    public final void rule__List__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2627:1: ( rule__List__Group_0__1__Impl rule__List__Group_0__2 )
            // InternalSlideOMatic.g:2628:2: rule__List__Group_0__1__Impl rule__List__Group_0__2
            {
            pushFollow(FOLLOW_26);
            rule__List__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__List__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__List__Group_0__1"


    // $ANTLR start "rule__List__Group_0__1__Impl"
    // InternalSlideOMatic.g:2635:1: rule__List__Group_0__1__Impl : ( '#list' ) ;
    public final void rule__List__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2639:1: ( ( '#list' ) )
            // InternalSlideOMatic.g:2640:1: ( '#list' )
            {
            // InternalSlideOMatic.g:2640:1: ( '#list' )
            // InternalSlideOMatic.g:2641:2: '#list'
            {
             before(grammarAccess.getListAccess().getListKeyword_0_1()); 
            match(input,85,FOLLOW_2); 
             after(grammarAccess.getListAccess().getListKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__List__Group_0__1__Impl"


    // $ANTLR start "rule__List__Group_0__2"
    // InternalSlideOMatic.g:2650:1: rule__List__Group_0__2 : rule__List__Group_0__2__Impl ;
    public final void rule__List__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2654:1: ( rule__List__Group_0__2__Impl )
            // InternalSlideOMatic.g:2655:2: rule__List__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__List__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__List__Group_0__2"


    // $ANTLR start "rule__List__Group_0__2__Impl"
    // InternalSlideOMatic.g:2661:1: rule__List__Group_0__2__Impl : ( ( ( rule__List__ListItemsAssignment_0_2 ) ) ( ( rule__List__ListItemsAssignment_0_2 )* ) ) ;
    public final void rule__List__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2665:1: ( ( ( ( rule__List__ListItemsAssignment_0_2 ) ) ( ( rule__List__ListItemsAssignment_0_2 )* ) ) )
            // InternalSlideOMatic.g:2666:1: ( ( ( rule__List__ListItemsAssignment_0_2 ) ) ( ( rule__List__ListItemsAssignment_0_2 )* ) )
            {
            // InternalSlideOMatic.g:2666:1: ( ( ( rule__List__ListItemsAssignment_0_2 ) ) ( ( rule__List__ListItemsAssignment_0_2 )* ) )
            // InternalSlideOMatic.g:2667:2: ( ( rule__List__ListItemsAssignment_0_2 ) ) ( ( rule__List__ListItemsAssignment_0_2 )* )
            {
            // InternalSlideOMatic.g:2667:2: ( ( rule__List__ListItemsAssignment_0_2 ) )
            // InternalSlideOMatic.g:2668:3: ( rule__List__ListItemsAssignment_0_2 )
            {
             before(grammarAccess.getListAccess().getListItemsAssignment_0_2()); 
            // InternalSlideOMatic.g:2669:3: ( rule__List__ListItemsAssignment_0_2 )
            // InternalSlideOMatic.g:2669:4: rule__List__ListItemsAssignment_0_2
            {
            pushFollow(FOLLOW_27);
            rule__List__ListItemsAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getListAccess().getListItemsAssignment_0_2()); 

            }

            // InternalSlideOMatic.g:2672:2: ( ( rule__List__ListItemsAssignment_0_2 )* )
            // InternalSlideOMatic.g:2673:3: ( rule__List__ListItemsAssignment_0_2 )*
            {
             before(grammarAccess.getListAccess().getListItemsAssignment_0_2()); 
            // InternalSlideOMatic.g:2674:3: ( rule__List__ListItemsAssignment_0_2 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==87) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalSlideOMatic.g:2674:4: rule__List__ListItemsAssignment_0_2
            	    {
            	    pushFollow(FOLLOW_27);
            	    rule__List__ListItemsAssignment_0_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getListAccess().getListItemsAssignment_0_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__List__Group_0__2__Impl"


    // $ANTLR start "rule__List__Group_1__0"
    // InternalSlideOMatic.g:2684:1: rule__List__Group_1__0 : rule__List__Group_1__0__Impl rule__List__Group_1__1 ;
    public final void rule__List__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2688:1: ( rule__List__Group_1__0__Impl rule__List__Group_1__1 )
            // InternalSlideOMatic.g:2689:2: rule__List__Group_1__0__Impl rule__List__Group_1__1
            {
            pushFollow(FOLLOW_28);
            rule__List__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__List__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__List__Group_1__0"


    // $ANTLR start "rule__List__Group_1__0__Impl"
    // InternalSlideOMatic.g:2696:1: rule__List__Group_1__0__Impl : ( () ) ;
    public final void rule__List__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2700:1: ( ( () ) )
            // InternalSlideOMatic.g:2701:1: ( () )
            {
            // InternalSlideOMatic.g:2701:1: ( () )
            // InternalSlideOMatic.g:2702:2: ()
            {
             before(grammarAccess.getListAccess().getUnNumberedListAction_1_0()); 
            // InternalSlideOMatic.g:2703:2: ()
            // InternalSlideOMatic.g:2703:3: 
            {
            }

             after(grammarAccess.getListAccess().getUnNumberedListAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__List__Group_1__0__Impl"


    // $ANTLR start "rule__List__Group_1__1"
    // InternalSlideOMatic.g:2711:1: rule__List__Group_1__1 : rule__List__Group_1__1__Impl rule__List__Group_1__2 ;
    public final void rule__List__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2715:1: ( rule__List__Group_1__1__Impl rule__List__Group_1__2 )
            // InternalSlideOMatic.g:2716:2: rule__List__Group_1__1__Impl rule__List__Group_1__2
            {
            pushFollow(FOLLOW_29);
            rule__List__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__List__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__List__Group_1__1"


    // $ANTLR start "rule__List__Group_1__1__Impl"
    // InternalSlideOMatic.g:2723:1: rule__List__Group_1__1__Impl : ( '-list' ) ;
    public final void rule__List__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2727:1: ( ( '-list' ) )
            // InternalSlideOMatic.g:2728:1: ( '-list' )
            {
            // InternalSlideOMatic.g:2728:1: ( '-list' )
            // InternalSlideOMatic.g:2729:2: '-list'
            {
             before(grammarAccess.getListAccess().getListKeyword_1_1()); 
            match(input,86,FOLLOW_2); 
             after(grammarAccess.getListAccess().getListKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__List__Group_1__1__Impl"


    // $ANTLR start "rule__List__Group_1__2"
    // InternalSlideOMatic.g:2738:1: rule__List__Group_1__2 : rule__List__Group_1__2__Impl ;
    public final void rule__List__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2742:1: ( rule__List__Group_1__2__Impl )
            // InternalSlideOMatic.g:2743:2: rule__List__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__List__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__List__Group_1__2"


    // $ANTLR start "rule__List__Group_1__2__Impl"
    // InternalSlideOMatic.g:2749:1: rule__List__Group_1__2__Impl : ( ( ( rule__List__ListItemsAssignment_1_2 ) ) ( ( rule__List__ListItemsAssignment_1_2 )* ) ) ;
    public final void rule__List__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2753:1: ( ( ( ( rule__List__ListItemsAssignment_1_2 ) ) ( ( rule__List__ListItemsAssignment_1_2 )* ) ) )
            // InternalSlideOMatic.g:2754:1: ( ( ( rule__List__ListItemsAssignment_1_2 ) ) ( ( rule__List__ListItemsAssignment_1_2 )* ) )
            {
            // InternalSlideOMatic.g:2754:1: ( ( ( rule__List__ListItemsAssignment_1_2 ) ) ( ( rule__List__ListItemsAssignment_1_2 )* ) )
            // InternalSlideOMatic.g:2755:2: ( ( rule__List__ListItemsAssignment_1_2 ) ) ( ( rule__List__ListItemsAssignment_1_2 )* )
            {
            // InternalSlideOMatic.g:2755:2: ( ( rule__List__ListItemsAssignment_1_2 ) )
            // InternalSlideOMatic.g:2756:3: ( rule__List__ListItemsAssignment_1_2 )
            {
             before(grammarAccess.getListAccess().getListItemsAssignment_1_2()); 
            // InternalSlideOMatic.g:2757:3: ( rule__List__ListItemsAssignment_1_2 )
            // InternalSlideOMatic.g:2757:4: rule__List__ListItemsAssignment_1_2
            {
            pushFollow(FOLLOW_30);
            rule__List__ListItemsAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getListAccess().getListItemsAssignment_1_2()); 

            }

            // InternalSlideOMatic.g:2760:2: ( ( rule__List__ListItemsAssignment_1_2 )* )
            // InternalSlideOMatic.g:2761:3: ( rule__List__ListItemsAssignment_1_2 )*
            {
             before(grammarAccess.getListAccess().getListItemsAssignment_1_2()); 
            // InternalSlideOMatic.g:2762:3: ( rule__List__ListItemsAssignment_1_2 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==88) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalSlideOMatic.g:2762:4: rule__List__ListItemsAssignment_1_2
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__List__ListItemsAssignment_1_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getListAccess().getListItemsAssignment_1_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__List__Group_1__2__Impl"


    // $ANTLR start "rule__NumberedListItem__Group__0"
    // InternalSlideOMatic.g:2772:1: rule__NumberedListItem__Group__0 : rule__NumberedListItem__Group__0__Impl rule__NumberedListItem__Group__1 ;
    public final void rule__NumberedListItem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2776:1: ( rule__NumberedListItem__Group__0__Impl rule__NumberedListItem__Group__1 )
            // InternalSlideOMatic.g:2777:2: rule__NumberedListItem__Group__0__Impl rule__NumberedListItem__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__NumberedListItem__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NumberedListItem__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberedListItem__Group__0"


    // $ANTLR start "rule__NumberedListItem__Group__0__Impl"
    // InternalSlideOMatic.g:2784:1: rule__NumberedListItem__Group__0__Impl : ( '##' ) ;
    public final void rule__NumberedListItem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2788:1: ( ( '##' ) )
            // InternalSlideOMatic.g:2789:1: ( '##' )
            {
            // InternalSlideOMatic.g:2789:1: ( '##' )
            // InternalSlideOMatic.g:2790:2: '##'
            {
             before(grammarAccess.getNumberedListItemAccess().getNumberSignNumberSignKeyword_0()); 
            match(input,87,FOLLOW_2); 
             after(grammarAccess.getNumberedListItemAccess().getNumberSignNumberSignKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberedListItem__Group__0__Impl"


    // $ANTLR start "rule__NumberedListItem__Group__1"
    // InternalSlideOMatic.g:2799:1: rule__NumberedListItem__Group__1 : rule__NumberedListItem__Group__1__Impl rule__NumberedListItem__Group__2 ;
    public final void rule__NumberedListItem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2803:1: ( rule__NumberedListItem__Group__1__Impl rule__NumberedListItem__Group__2 )
            // InternalSlideOMatic.g:2804:2: rule__NumberedListItem__Group__1__Impl rule__NumberedListItem__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__NumberedListItem__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NumberedListItem__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberedListItem__Group__1"


    // $ANTLR start "rule__NumberedListItem__Group__1__Impl"
    // InternalSlideOMatic.g:2811:1: rule__NumberedListItem__Group__1__Impl : ( ( rule__NumberedListItem__ItemAssignment_1 ) ) ;
    public final void rule__NumberedListItem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2815:1: ( ( ( rule__NumberedListItem__ItemAssignment_1 ) ) )
            // InternalSlideOMatic.g:2816:1: ( ( rule__NumberedListItem__ItemAssignment_1 ) )
            {
            // InternalSlideOMatic.g:2816:1: ( ( rule__NumberedListItem__ItemAssignment_1 ) )
            // InternalSlideOMatic.g:2817:2: ( rule__NumberedListItem__ItemAssignment_1 )
            {
             before(grammarAccess.getNumberedListItemAccess().getItemAssignment_1()); 
            // InternalSlideOMatic.g:2818:2: ( rule__NumberedListItem__ItemAssignment_1 )
            // InternalSlideOMatic.g:2818:3: rule__NumberedListItem__ItemAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__NumberedListItem__ItemAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNumberedListItemAccess().getItemAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberedListItem__Group__1__Impl"


    // $ANTLR start "rule__NumberedListItem__Group__2"
    // InternalSlideOMatic.g:2826:1: rule__NumberedListItem__Group__2 : rule__NumberedListItem__Group__2__Impl ;
    public final void rule__NumberedListItem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2830:1: ( rule__NumberedListItem__Group__2__Impl )
            // InternalSlideOMatic.g:2831:2: rule__NumberedListItem__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NumberedListItem__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberedListItem__Group__2"


    // $ANTLR start "rule__NumberedListItem__Group__2__Impl"
    // InternalSlideOMatic.g:2837:1: rule__NumberedListItem__Group__2__Impl : ( ( ruleClick )? ) ;
    public final void rule__NumberedListItem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2841:1: ( ( ( ruleClick )? ) )
            // InternalSlideOMatic.g:2842:1: ( ( ruleClick )? )
            {
            // InternalSlideOMatic.g:2842:1: ( ( ruleClick )? )
            // InternalSlideOMatic.g:2843:2: ( ruleClick )?
            {
             before(grammarAccess.getNumberedListItemAccess().getClickParserRuleCall_2()); 
            // InternalSlideOMatic.g:2844:2: ( ruleClick )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==11) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalSlideOMatic.g:2844:3: ruleClick
                    {
                    pushFollow(FOLLOW_2);
                    ruleClick();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNumberedListItemAccess().getClickParserRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberedListItem__Group__2__Impl"


    // $ANTLR start "rule__UnNumberedListItem__Group__0"
    // InternalSlideOMatic.g:2853:1: rule__UnNumberedListItem__Group__0 : rule__UnNumberedListItem__Group__0__Impl rule__UnNumberedListItem__Group__1 ;
    public final void rule__UnNumberedListItem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2857:1: ( rule__UnNumberedListItem__Group__0__Impl rule__UnNumberedListItem__Group__1 )
            // InternalSlideOMatic.g:2858:2: rule__UnNumberedListItem__Group__0__Impl rule__UnNumberedListItem__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__UnNumberedListItem__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnNumberedListItem__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnNumberedListItem__Group__0"


    // $ANTLR start "rule__UnNumberedListItem__Group__0__Impl"
    // InternalSlideOMatic.g:2865:1: rule__UnNumberedListItem__Group__0__Impl : ( '--' ) ;
    public final void rule__UnNumberedListItem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2869:1: ( ( '--' ) )
            // InternalSlideOMatic.g:2870:1: ( '--' )
            {
            // InternalSlideOMatic.g:2870:1: ( '--' )
            // InternalSlideOMatic.g:2871:2: '--'
            {
             before(grammarAccess.getUnNumberedListItemAccess().getHyphenMinusHyphenMinusKeyword_0()); 
            match(input,88,FOLLOW_2); 
             after(grammarAccess.getUnNumberedListItemAccess().getHyphenMinusHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnNumberedListItem__Group__0__Impl"


    // $ANTLR start "rule__UnNumberedListItem__Group__1"
    // InternalSlideOMatic.g:2880:1: rule__UnNumberedListItem__Group__1 : rule__UnNumberedListItem__Group__1__Impl rule__UnNumberedListItem__Group__2 ;
    public final void rule__UnNumberedListItem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2884:1: ( rule__UnNumberedListItem__Group__1__Impl rule__UnNumberedListItem__Group__2 )
            // InternalSlideOMatic.g:2885:2: rule__UnNumberedListItem__Group__1__Impl rule__UnNumberedListItem__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__UnNumberedListItem__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnNumberedListItem__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnNumberedListItem__Group__1"


    // $ANTLR start "rule__UnNumberedListItem__Group__1__Impl"
    // InternalSlideOMatic.g:2892:1: rule__UnNumberedListItem__Group__1__Impl : ( ( rule__UnNumberedListItem__ItemAssignment_1 ) ) ;
    public final void rule__UnNumberedListItem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2896:1: ( ( ( rule__UnNumberedListItem__ItemAssignment_1 ) ) )
            // InternalSlideOMatic.g:2897:1: ( ( rule__UnNumberedListItem__ItemAssignment_1 ) )
            {
            // InternalSlideOMatic.g:2897:1: ( ( rule__UnNumberedListItem__ItemAssignment_1 ) )
            // InternalSlideOMatic.g:2898:2: ( rule__UnNumberedListItem__ItemAssignment_1 )
            {
             before(grammarAccess.getUnNumberedListItemAccess().getItemAssignment_1()); 
            // InternalSlideOMatic.g:2899:2: ( rule__UnNumberedListItem__ItemAssignment_1 )
            // InternalSlideOMatic.g:2899:3: rule__UnNumberedListItem__ItemAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__UnNumberedListItem__ItemAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getUnNumberedListItemAccess().getItemAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnNumberedListItem__Group__1__Impl"


    // $ANTLR start "rule__UnNumberedListItem__Group__2"
    // InternalSlideOMatic.g:2907:1: rule__UnNumberedListItem__Group__2 : rule__UnNumberedListItem__Group__2__Impl ;
    public final void rule__UnNumberedListItem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2911:1: ( rule__UnNumberedListItem__Group__2__Impl )
            // InternalSlideOMatic.g:2912:2: rule__UnNumberedListItem__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UnNumberedListItem__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnNumberedListItem__Group__2"


    // $ANTLR start "rule__UnNumberedListItem__Group__2__Impl"
    // InternalSlideOMatic.g:2918:1: rule__UnNumberedListItem__Group__2__Impl : ( ( ruleClick )? ) ;
    public final void rule__UnNumberedListItem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2922:1: ( ( ( ruleClick )? ) )
            // InternalSlideOMatic.g:2923:1: ( ( ruleClick )? )
            {
            // InternalSlideOMatic.g:2923:1: ( ( ruleClick )? )
            // InternalSlideOMatic.g:2924:2: ( ruleClick )?
            {
             before(grammarAccess.getUnNumberedListItemAccess().getClickParserRuleCall_2()); 
            // InternalSlideOMatic.g:2925:2: ( ruleClick )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==11) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalSlideOMatic.g:2925:3: ruleClick
                    {
                    pushFollow(FOLLOW_2);
                    ruleClick();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUnNumberedListItemAccess().getClickParserRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnNumberedListItem__Group__2__Impl"


    // $ANTLR start "rule__Image__Group__0"
    // InternalSlideOMatic.g:2934:1: rule__Image__Group__0 : rule__Image__Group__0__Impl rule__Image__Group__1 ;
    public final void rule__Image__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2938:1: ( rule__Image__Group__0__Impl rule__Image__Group__1 )
            // InternalSlideOMatic.g:2939:2: rule__Image__Group__0__Impl rule__Image__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__Image__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Image__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Image__Group__0"


    // $ANTLR start "rule__Image__Group__0__Impl"
    // InternalSlideOMatic.g:2946:1: rule__Image__Group__0__Impl : ( 'img' ) ;
    public final void rule__Image__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2950:1: ( ( 'img' ) )
            // InternalSlideOMatic.g:2951:1: ( 'img' )
            {
            // InternalSlideOMatic.g:2951:1: ( 'img' )
            // InternalSlideOMatic.g:2952:2: 'img'
            {
             before(grammarAccess.getImageAccess().getImgKeyword_0()); 
            match(input,89,FOLLOW_2); 
             after(grammarAccess.getImageAccess().getImgKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Image__Group__0__Impl"


    // $ANTLR start "rule__Image__Group__1"
    // InternalSlideOMatic.g:2961:1: rule__Image__Group__1 : rule__Image__Group__1__Impl rule__Image__Group__2 ;
    public final void rule__Image__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2965:1: ( rule__Image__Group__1__Impl rule__Image__Group__2 )
            // InternalSlideOMatic.g:2966:2: rule__Image__Group__1__Impl rule__Image__Group__2
            {
            pushFollow(FOLLOW_32);
            rule__Image__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Image__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Image__Group__1"


    // $ANTLR start "rule__Image__Group__1__Impl"
    // InternalSlideOMatic.g:2973:1: rule__Image__Group__1__Impl : ( ( rule__Image__NameAssignment_1 ) ) ;
    public final void rule__Image__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2977:1: ( ( ( rule__Image__NameAssignment_1 ) ) )
            // InternalSlideOMatic.g:2978:1: ( ( rule__Image__NameAssignment_1 ) )
            {
            // InternalSlideOMatic.g:2978:1: ( ( rule__Image__NameAssignment_1 ) )
            // InternalSlideOMatic.g:2979:2: ( rule__Image__NameAssignment_1 )
            {
             before(grammarAccess.getImageAccess().getNameAssignment_1()); 
            // InternalSlideOMatic.g:2980:2: ( rule__Image__NameAssignment_1 )
            // InternalSlideOMatic.g:2980:3: rule__Image__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Image__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getImageAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Image__Group__1__Impl"


    // $ANTLR start "rule__Image__Group__2"
    // InternalSlideOMatic.g:2988:1: rule__Image__Group__2 : rule__Image__Group__2__Impl rule__Image__Group__3 ;
    public final void rule__Image__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2992:1: ( rule__Image__Group__2__Impl rule__Image__Group__3 )
            // InternalSlideOMatic.g:2993:2: rule__Image__Group__2__Impl rule__Image__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Image__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Image__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Image__Group__2"


    // $ANTLR start "rule__Image__Group__2__Impl"
    // InternalSlideOMatic.g:3000:1: rule__Image__Group__2__Impl : ( 'src' ) ;
    public final void rule__Image__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3004:1: ( ( 'src' ) )
            // InternalSlideOMatic.g:3005:1: ( 'src' )
            {
            // InternalSlideOMatic.g:3005:1: ( 'src' )
            // InternalSlideOMatic.g:3006:2: 'src'
            {
             before(grammarAccess.getImageAccess().getSrcKeyword_2()); 
            match(input,90,FOLLOW_2); 
             after(grammarAccess.getImageAccess().getSrcKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Image__Group__2__Impl"


    // $ANTLR start "rule__Image__Group__3"
    // InternalSlideOMatic.g:3015:1: rule__Image__Group__3 : rule__Image__Group__3__Impl rule__Image__Group__4 ;
    public final void rule__Image__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3019:1: ( rule__Image__Group__3__Impl rule__Image__Group__4 )
            // InternalSlideOMatic.g:3020:2: rule__Image__Group__3__Impl rule__Image__Group__4
            {
            pushFollow(FOLLOW_33);
            rule__Image__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Image__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Image__Group__3"


    // $ANTLR start "rule__Image__Group__3__Impl"
    // InternalSlideOMatic.g:3027:1: rule__Image__Group__3__Impl : ( ( rule__Image__SrcAssignment_3 ) ) ;
    public final void rule__Image__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3031:1: ( ( ( rule__Image__SrcAssignment_3 ) ) )
            // InternalSlideOMatic.g:3032:1: ( ( rule__Image__SrcAssignment_3 ) )
            {
            // InternalSlideOMatic.g:3032:1: ( ( rule__Image__SrcAssignment_3 ) )
            // InternalSlideOMatic.g:3033:2: ( rule__Image__SrcAssignment_3 )
            {
             before(grammarAccess.getImageAccess().getSrcAssignment_3()); 
            // InternalSlideOMatic.g:3034:2: ( rule__Image__SrcAssignment_3 )
            // InternalSlideOMatic.g:3034:3: rule__Image__SrcAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Image__SrcAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getImageAccess().getSrcAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Image__Group__3__Impl"


    // $ANTLR start "rule__Image__Group__4"
    // InternalSlideOMatic.g:3042:1: rule__Image__Group__4 : rule__Image__Group__4__Impl rule__Image__Group__5 ;
    public final void rule__Image__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3046:1: ( rule__Image__Group__4__Impl rule__Image__Group__5 )
            // InternalSlideOMatic.g:3047:2: rule__Image__Group__4__Impl rule__Image__Group__5
            {
            pushFollow(FOLLOW_33);
            rule__Image__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Image__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Image__Group__4"


    // $ANTLR start "rule__Image__Group__4__Impl"
    // InternalSlideOMatic.g:3054:1: rule__Image__Group__4__Impl : ( ( rule__Image__AlignmentAssignment_4 )? ) ;
    public final void rule__Image__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3058:1: ( ( ( rule__Image__AlignmentAssignment_4 )? ) )
            // InternalSlideOMatic.g:3059:1: ( ( rule__Image__AlignmentAssignment_4 )? )
            {
            // InternalSlideOMatic.g:3059:1: ( ( rule__Image__AlignmentAssignment_4 )? )
            // InternalSlideOMatic.g:3060:2: ( rule__Image__AlignmentAssignment_4 )?
            {
             before(grammarAccess.getImageAccess().getAlignmentAssignment_4()); 
            // InternalSlideOMatic.g:3061:2: ( rule__Image__AlignmentAssignment_4 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>=56 && LA30_0<=64)) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalSlideOMatic.g:3061:3: rule__Image__AlignmentAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Image__AlignmentAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getImageAccess().getAlignmentAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Image__Group__4__Impl"


    // $ANTLR start "rule__Image__Group__5"
    // InternalSlideOMatic.g:3069:1: rule__Image__Group__5 : rule__Image__Group__5__Impl rule__Image__Group__6 ;
    public final void rule__Image__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3073:1: ( rule__Image__Group__5__Impl rule__Image__Group__6 )
            // InternalSlideOMatic.g:3074:2: rule__Image__Group__5__Impl rule__Image__Group__6
            {
            pushFollow(FOLLOW_22);
            rule__Image__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Image__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Image__Group__5"


    // $ANTLR start "rule__Image__Group__5__Impl"
    // InternalSlideOMatic.g:3081:1: rule__Image__Group__5__Impl : ( ( rule__Image__SizeAssignment_5 ) ) ;
    public final void rule__Image__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3085:1: ( ( ( rule__Image__SizeAssignment_5 ) ) )
            // InternalSlideOMatic.g:3086:1: ( ( rule__Image__SizeAssignment_5 ) )
            {
            // InternalSlideOMatic.g:3086:1: ( ( rule__Image__SizeAssignment_5 ) )
            // InternalSlideOMatic.g:3087:2: ( rule__Image__SizeAssignment_5 )
            {
             before(grammarAccess.getImageAccess().getSizeAssignment_5()); 
            // InternalSlideOMatic.g:3088:2: ( rule__Image__SizeAssignment_5 )
            // InternalSlideOMatic.g:3088:3: rule__Image__SizeAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Image__SizeAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getImageAccess().getSizeAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Image__Group__5__Impl"


    // $ANTLR start "rule__Image__Group__6"
    // InternalSlideOMatic.g:3096:1: rule__Image__Group__6 : rule__Image__Group__6__Impl ;
    public final void rule__Image__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3100:1: ( rule__Image__Group__6__Impl )
            // InternalSlideOMatic.g:3101:2: rule__Image__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Image__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Image__Group__6"


    // $ANTLR start "rule__Image__Group__6__Impl"
    // InternalSlideOMatic.g:3107:1: rule__Image__Group__6__Impl : ( ( ruleClick )? ) ;
    public final void rule__Image__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3111:1: ( ( ( ruleClick )? ) )
            // InternalSlideOMatic.g:3112:1: ( ( ruleClick )? )
            {
            // InternalSlideOMatic.g:3112:1: ( ( ruleClick )? )
            // InternalSlideOMatic.g:3113:2: ( ruleClick )?
            {
             before(grammarAccess.getImageAccess().getClickParserRuleCall_6()); 
            // InternalSlideOMatic.g:3114:2: ( ruleClick )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==11) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalSlideOMatic.g:3114:3: ruleClick
                    {
                    pushFollow(FOLLOW_2);
                    ruleClick();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getImageAccess().getClickParserRuleCall_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Image__Group__6__Impl"


    // $ANTLR start "rule__Size__Group__0"
    // InternalSlideOMatic.g:3123:1: rule__Size__Group__0 : rule__Size__Group__0__Impl rule__Size__Group__1 ;
    public final void rule__Size__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3127:1: ( rule__Size__Group__0__Impl rule__Size__Group__1 )
            // InternalSlideOMatic.g:3128:2: rule__Size__Group__0__Impl rule__Size__Group__1
            {
            pushFollow(FOLLOW_34);
            rule__Size__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Size__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Size__Group__0"


    // $ANTLR start "rule__Size__Group__0__Impl"
    // InternalSlideOMatic.g:3135:1: rule__Size__Group__0__Impl : ( ( rule__Size__Alternatives_0 ) ) ;
    public final void rule__Size__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3139:1: ( ( ( rule__Size__Alternatives_0 ) ) )
            // InternalSlideOMatic.g:3140:1: ( ( rule__Size__Alternatives_0 ) )
            {
            // InternalSlideOMatic.g:3140:1: ( ( rule__Size__Alternatives_0 ) )
            // InternalSlideOMatic.g:3141:2: ( rule__Size__Alternatives_0 )
            {
             before(grammarAccess.getSizeAccess().getAlternatives_0()); 
            // InternalSlideOMatic.g:3142:2: ( rule__Size__Alternatives_0 )
            // InternalSlideOMatic.g:3142:3: rule__Size__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Size__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getSizeAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Size__Group__0__Impl"


    // $ANTLR start "rule__Size__Group__1"
    // InternalSlideOMatic.g:3150:1: rule__Size__Group__1 : rule__Size__Group__1__Impl rule__Size__Group__2 ;
    public final void rule__Size__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3154:1: ( rule__Size__Group__1__Impl rule__Size__Group__2 )
            // InternalSlideOMatic.g:3155:2: rule__Size__Group__1__Impl rule__Size__Group__2
            {
            pushFollow(FOLLOW_35);
            rule__Size__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Size__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Size__Group__1"


    // $ANTLR start "rule__Size__Group__1__Impl"
    // InternalSlideOMatic.g:3162:1: rule__Size__Group__1__Impl : ( ( rule__Size__ScaleAssignment_1 ) ) ;
    public final void rule__Size__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3166:1: ( ( ( rule__Size__ScaleAssignment_1 ) ) )
            // InternalSlideOMatic.g:3167:1: ( ( rule__Size__ScaleAssignment_1 ) )
            {
            // InternalSlideOMatic.g:3167:1: ( ( rule__Size__ScaleAssignment_1 ) )
            // InternalSlideOMatic.g:3168:2: ( rule__Size__ScaleAssignment_1 )
            {
             before(grammarAccess.getSizeAccess().getScaleAssignment_1()); 
            // InternalSlideOMatic.g:3169:2: ( rule__Size__ScaleAssignment_1 )
            // InternalSlideOMatic.g:3169:3: rule__Size__ScaleAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Size__ScaleAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSizeAccess().getScaleAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Size__Group__1__Impl"


    // $ANTLR start "rule__Size__Group__2"
    // InternalSlideOMatic.g:3177:1: rule__Size__Group__2 : rule__Size__Group__2__Impl ;
    public final void rule__Size__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3181:1: ( rule__Size__Group__2__Impl )
            // InternalSlideOMatic.g:3182:2: rule__Size__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Size__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Size__Group__2"


    // $ANTLR start "rule__Size__Group__2__Impl"
    // InternalSlideOMatic.g:3188:1: rule__Size__Group__2__Impl : ( '%' ) ;
    public final void rule__Size__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3192:1: ( ( '%' ) )
            // InternalSlideOMatic.g:3193:1: ( '%' )
            {
            // InternalSlideOMatic.g:3193:1: ( '%' )
            // InternalSlideOMatic.g:3194:2: '%'
            {
             before(grammarAccess.getSizeAccess().getPercentSignKeyword_2()); 
            match(input,91,FOLLOW_2); 
             after(grammarAccess.getSizeAccess().getPercentSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Size__Group__2__Impl"


    // $ANTLR start "rule__Table__Group__0"
    // InternalSlideOMatic.g:3204:1: rule__Table__Group__0 : rule__Table__Group__0__Impl rule__Table__Group__1 ;
    public final void rule__Table__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3208:1: ( rule__Table__Group__0__Impl rule__Table__Group__1 )
            // InternalSlideOMatic.g:3209:2: rule__Table__Group__0__Impl rule__Table__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__Table__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__0"


    // $ANTLR start "rule__Table__Group__0__Impl"
    // InternalSlideOMatic.g:3216:1: rule__Table__Group__0__Impl : ( 'tab' ) ;
    public final void rule__Table__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3220:1: ( ( 'tab' ) )
            // InternalSlideOMatic.g:3221:1: ( 'tab' )
            {
            // InternalSlideOMatic.g:3221:1: ( 'tab' )
            // InternalSlideOMatic.g:3222:2: 'tab'
            {
             before(grammarAccess.getTableAccess().getTabKeyword_0()); 
            match(input,92,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getTabKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__0__Impl"


    // $ANTLR start "rule__Table__Group__1"
    // InternalSlideOMatic.g:3231:1: rule__Table__Group__1 : rule__Table__Group__1__Impl rule__Table__Group__2 ;
    public final void rule__Table__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3235:1: ( rule__Table__Group__1__Impl rule__Table__Group__2 )
            // InternalSlideOMatic.g:3236:2: rule__Table__Group__1__Impl rule__Table__Group__2
            {
            pushFollow(FOLLOW_36);
            rule__Table__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__1"


    // $ANTLR start "rule__Table__Group__1__Impl"
    // InternalSlideOMatic.g:3243:1: rule__Table__Group__1__Impl : ( ( rule__Table__NameAssignment_1 ) ) ;
    public final void rule__Table__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3247:1: ( ( ( rule__Table__NameAssignment_1 ) ) )
            // InternalSlideOMatic.g:3248:1: ( ( rule__Table__NameAssignment_1 ) )
            {
            // InternalSlideOMatic.g:3248:1: ( ( rule__Table__NameAssignment_1 ) )
            // InternalSlideOMatic.g:3249:2: ( rule__Table__NameAssignment_1 )
            {
             before(grammarAccess.getTableAccess().getNameAssignment_1()); 
            // InternalSlideOMatic.g:3250:2: ( rule__Table__NameAssignment_1 )
            // InternalSlideOMatic.g:3250:3: rule__Table__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Table__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTableAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__1__Impl"


    // $ANTLR start "rule__Table__Group__2"
    // InternalSlideOMatic.g:3258:1: rule__Table__Group__2 : rule__Table__Group__2__Impl rule__Table__Group__3 ;
    public final void rule__Table__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3262:1: ( rule__Table__Group__2__Impl rule__Table__Group__3 )
            // InternalSlideOMatic.g:3263:2: rule__Table__Group__2__Impl rule__Table__Group__3
            {
            pushFollow(FOLLOW_36);
            rule__Table__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__2"


    // $ANTLR start "rule__Table__Group__2__Impl"
    // InternalSlideOMatic.g:3270:1: rule__Table__Group__2__Impl : ( '[' ) ;
    public final void rule__Table__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3274:1: ( ( '[' ) )
            // InternalSlideOMatic.g:3275:1: ( '[' )
            {
            // InternalSlideOMatic.g:3275:1: ( '[' )
            // InternalSlideOMatic.g:3276:2: '['
            {
             before(grammarAccess.getTableAccess().getLeftSquareBracketKeyword_2()); 
            match(input,93,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getLeftSquareBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__2__Impl"


    // $ANTLR start "rule__Table__Group__3"
    // InternalSlideOMatic.g:3285:1: rule__Table__Group__3 : rule__Table__Group__3__Impl rule__Table__Group__4 ;
    public final void rule__Table__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3289:1: ( rule__Table__Group__3__Impl rule__Table__Group__4 )
            // InternalSlideOMatic.g:3290:2: rule__Table__Group__3__Impl rule__Table__Group__4
            {
            pushFollow(FOLLOW_37);
            rule__Table__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__3"


    // $ANTLR start "rule__Table__Group__3__Impl"
    // InternalSlideOMatic.g:3297:1: rule__Table__Group__3__Impl : ( ( rule__Table__RowsAssignment_3 ) ) ;
    public final void rule__Table__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3301:1: ( ( ( rule__Table__RowsAssignment_3 ) ) )
            // InternalSlideOMatic.g:3302:1: ( ( rule__Table__RowsAssignment_3 ) )
            {
            // InternalSlideOMatic.g:3302:1: ( ( rule__Table__RowsAssignment_3 ) )
            // InternalSlideOMatic.g:3303:2: ( rule__Table__RowsAssignment_3 )
            {
             before(grammarAccess.getTableAccess().getRowsAssignment_3()); 
            // InternalSlideOMatic.g:3304:2: ( rule__Table__RowsAssignment_3 )
            // InternalSlideOMatic.g:3304:3: rule__Table__RowsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Table__RowsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTableAccess().getRowsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__3__Impl"


    // $ANTLR start "rule__Table__Group__4"
    // InternalSlideOMatic.g:3312:1: rule__Table__Group__4 : rule__Table__Group__4__Impl rule__Table__Group__5 ;
    public final void rule__Table__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3316:1: ( rule__Table__Group__4__Impl rule__Table__Group__5 )
            // InternalSlideOMatic.g:3317:2: rule__Table__Group__4__Impl rule__Table__Group__5
            {
            pushFollow(FOLLOW_37);
            rule__Table__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__4"


    // $ANTLR start "rule__Table__Group__4__Impl"
    // InternalSlideOMatic.g:3324:1: rule__Table__Group__4__Impl : ( ( rule__Table__Group_4__0 )* ) ;
    public final void rule__Table__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3328:1: ( ( ( rule__Table__Group_4__0 )* ) )
            // InternalSlideOMatic.g:3329:1: ( ( rule__Table__Group_4__0 )* )
            {
            // InternalSlideOMatic.g:3329:1: ( ( rule__Table__Group_4__0 )* )
            // InternalSlideOMatic.g:3330:2: ( rule__Table__Group_4__0 )*
            {
             before(grammarAccess.getTableAccess().getGroup_4()); 
            // InternalSlideOMatic.g:3331:2: ( rule__Table__Group_4__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==75) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalSlideOMatic.g:3331:3: rule__Table__Group_4__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Table__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

             after(grammarAccess.getTableAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__4__Impl"


    // $ANTLR start "rule__Table__Group__5"
    // InternalSlideOMatic.g:3339:1: rule__Table__Group__5 : rule__Table__Group__5__Impl ;
    public final void rule__Table__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3343:1: ( rule__Table__Group__5__Impl )
            // InternalSlideOMatic.g:3344:2: rule__Table__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Table__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__5"


    // $ANTLR start "rule__Table__Group__5__Impl"
    // InternalSlideOMatic.g:3350:1: rule__Table__Group__5__Impl : ( ']' ) ;
    public final void rule__Table__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3354:1: ( ( ']' ) )
            // InternalSlideOMatic.g:3355:1: ( ']' )
            {
            // InternalSlideOMatic.g:3355:1: ( ']' )
            // InternalSlideOMatic.g:3356:2: ']'
            {
             before(grammarAccess.getTableAccess().getRightSquareBracketKeyword_5()); 
            match(input,94,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getRightSquareBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__5__Impl"


    // $ANTLR start "rule__Table__Group_4__0"
    // InternalSlideOMatic.g:3366:1: rule__Table__Group_4__0 : rule__Table__Group_4__0__Impl rule__Table__Group_4__1 ;
    public final void rule__Table__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3370:1: ( rule__Table__Group_4__0__Impl rule__Table__Group_4__1 )
            // InternalSlideOMatic.g:3371:2: rule__Table__Group_4__0__Impl rule__Table__Group_4__1
            {
            pushFollow(FOLLOW_36);
            rule__Table__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group_4__0"


    // $ANTLR start "rule__Table__Group_4__0__Impl"
    // InternalSlideOMatic.g:3378:1: rule__Table__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Table__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3382:1: ( ( ',' ) )
            // InternalSlideOMatic.g:3383:1: ( ',' )
            {
            // InternalSlideOMatic.g:3383:1: ( ',' )
            // InternalSlideOMatic.g:3384:2: ','
            {
             before(grammarAccess.getTableAccess().getCommaKeyword_4_0()); 
            match(input,75,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group_4__0__Impl"


    // $ANTLR start "rule__Table__Group_4__1"
    // InternalSlideOMatic.g:3393:1: rule__Table__Group_4__1 : rule__Table__Group_4__1__Impl ;
    public final void rule__Table__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3397:1: ( rule__Table__Group_4__1__Impl )
            // InternalSlideOMatic.g:3398:2: rule__Table__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Table__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group_4__1"


    // $ANTLR start "rule__Table__Group_4__1__Impl"
    // InternalSlideOMatic.g:3404:1: rule__Table__Group_4__1__Impl : ( ( rule__Table__RowsAssignment_4_1 ) ) ;
    public final void rule__Table__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3408:1: ( ( ( rule__Table__RowsAssignment_4_1 ) ) )
            // InternalSlideOMatic.g:3409:1: ( ( rule__Table__RowsAssignment_4_1 ) )
            {
            // InternalSlideOMatic.g:3409:1: ( ( rule__Table__RowsAssignment_4_1 ) )
            // InternalSlideOMatic.g:3410:2: ( rule__Table__RowsAssignment_4_1 )
            {
             before(grammarAccess.getTableAccess().getRowsAssignment_4_1()); 
            // InternalSlideOMatic.g:3411:2: ( rule__Table__RowsAssignment_4_1 )
            // InternalSlideOMatic.g:3411:3: rule__Table__RowsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Table__RowsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getTableAccess().getRowsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group_4__1__Impl"


    // $ANTLR start "rule__TableRow__Group__0"
    // InternalSlideOMatic.g:3420:1: rule__TableRow__Group__0 : rule__TableRow__Group__0__Impl rule__TableRow__Group__1 ;
    public final void rule__TableRow__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3424:1: ( rule__TableRow__Group__0__Impl rule__TableRow__Group__1 )
            // InternalSlideOMatic.g:3425:2: rule__TableRow__Group__0__Impl rule__TableRow__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__TableRow__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TableRow__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableRow__Group__0"


    // $ANTLR start "rule__TableRow__Group__0__Impl"
    // InternalSlideOMatic.g:3432:1: rule__TableRow__Group__0__Impl : ( '[' ) ;
    public final void rule__TableRow__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3436:1: ( ( '[' ) )
            // InternalSlideOMatic.g:3437:1: ( '[' )
            {
            // InternalSlideOMatic.g:3437:1: ( '[' )
            // InternalSlideOMatic.g:3438:2: '['
            {
             before(grammarAccess.getTableRowAccess().getLeftSquareBracketKeyword_0()); 
            match(input,93,FOLLOW_2); 
             after(grammarAccess.getTableRowAccess().getLeftSquareBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableRow__Group__0__Impl"


    // $ANTLR start "rule__TableRow__Group__1"
    // InternalSlideOMatic.g:3447:1: rule__TableRow__Group__1 : rule__TableRow__Group__1__Impl rule__TableRow__Group__2 ;
    public final void rule__TableRow__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3451:1: ( rule__TableRow__Group__1__Impl rule__TableRow__Group__2 )
            // InternalSlideOMatic.g:3452:2: rule__TableRow__Group__1__Impl rule__TableRow__Group__2
            {
            pushFollow(FOLLOW_37);
            rule__TableRow__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TableRow__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableRow__Group__1"


    // $ANTLR start "rule__TableRow__Group__1__Impl"
    // InternalSlideOMatic.g:3459:1: rule__TableRow__Group__1__Impl : ( ( rule__TableRow__ValuesAssignment_1 ) ) ;
    public final void rule__TableRow__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3463:1: ( ( ( rule__TableRow__ValuesAssignment_1 ) ) )
            // InternalSlideOMatic.g:3464:1: ( ( rule__TableRow__ValuesAssignment_1 ) )
            {
            // InternalSlideOMatic.g:3464:1: ( ( rule__TableRow__ValuesAssignment_1 ) )
            // InternalSlideOMatic.g:3465:2: ( rule__TableRow__ValuesAssignment_1 )
            {
             before(grammarAccess.getTableRowAccess().getValuesAssignment_1()); 
            // InternalSlideOMatic.g:3466:2: ( rule__TableRow__ValuesAssignment_1 )
            // InternalSlideOMatic.g:3466:3: rule__TableRow__ValuesAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TableRow__ValuesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTableRowAccess().getValuesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableRow__Group__1__Impl"


    // $ANTLR start "rule__TableRow__Group__2"
    // InternalSlideOMatic.g:3474:1: rule__TableRow__Group__2 : rule__TableRow__Group__2__Impl rule__TableRow__Group__3 ;
    public final void rule__TableRow__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3478:1: ( rule__TableRow__Group__2__Impl rule__TableRow__Group__3 )
            // InternalSlideOMatic.g:3479:2: rule__TableRow__Group__2__Impl rule__TableRow__Group__3
            {
            pushFollow(FOLLOW_37);
            rule__TableRow__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TableRow__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableRow__Group__2"


    // $ANTLR start "rule__TableRow__Group__2__Impl"
    // InternalSlideOMatic.g:3486:1: rule__TableRow__Group__2__Impl : ( ( rule__TableRow__Group_2__0 )* ) ;
    public final void rule__TableRow__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3490:1: ( ( ( rule__TableRow__Group_2__0 )* ) )
            // InternalSlideOMatic.g:3491:1: ( ( rule__TableRow__Group_2__0 )* )
            {
            // InternalSlideOMatic.g:3491:1: ( ( rule__TableRow__Group_2__0 )* )
            // InternalSlideOMatic.g:3492:2: ( rule__TableRow__Group_2__0 )*
            {
             before(grammarAccess.getTableRowAccess().getGroup_2()); 
            // InternalSlideOMatic.g:3493:2: ( rule__TableRow__Group_2__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==75) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalSlideOMatic.g:3493:3: rule__TableRow__Group_2__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__TableRow__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getTableRowAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableRow__Group__2__Impl"


    // $ANTLR start "rule__TableRow__Group__3"
    // InternalSlideOMatic.g:3501:1: rule__TableRow__Group__3 : rule__TableRow__Group__3__Impl ;
    public final void rule__TableRow__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3505:1: ( rule__TableRow__Group__3__Impl )
            // InternalSlideOMatic.g:3506:2: rule__TableRow__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TableRow__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableRow__Group__3"


    // $ANTLR start "rule__TableRow__Group__3__Impl"
    // InternalSlideOMatic.g:3512:1: rule__TableRow__Group__3__Impl : ( ']' ) ;
    public final void rule__TableRow__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3516:1: ( ( ']' ) )
            // InternalSlideOMatic.g:3517:1: ( ']' )
            {
            // InternalSlideOMatic.g:3517:1: ( ']' )
            // InternalSlideOMatic.g:3518:2: ']'
            {
             before(grammarAccess.getTableRowAccess().getRightSquareBracketKeyword_3()); 
            match(input,94,FOLLOW_2); 
             after(grammarAccess.getTableRowAccess().getRightSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableRow__Group__3__Impl"


    // $ANTLR start "rule__TableRow__Group_2__0"
    // InternalSlideOMatic.g:3528:1: rule__TableRow__Group_2__0 : rule__TableRow__Group_2__0__Impl rule__TableRow__Group_2__1 ;
    public final void rule__TableRow__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3532:1: ( rule__TableRow__Group_2__0__Impl rule__TableRow__Group_2__1 )
            // InternalSlideOMatic.g:3533:2: rule__TableRow__Group_2__0__Impl rule__TableRow__Group_2__1
            {
            pushFollow(FOLLOW_3);
            rule__TableRow__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TableRow__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableRow__Group_2__0"


    // $ANTLR start "rule__TableRow__Group_2__0__Impl"
    // InternalSlideOMatic.g:3540:1: rule__TableRow__Group_2__0__Impl : ( ',' ) ;
    public final void rule__TableRow__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3544:1: ( ( ',' ) )
            // InternalSlideOMatic.g:3545:1: ( ',' )
            {
            // InternalSlideOMatic.g:3545:1: ( ',' )
            // InternalSlideOMatic.g:3546:2: ','
            {
             before(grammarAccess.getTableRowAccess().getCommaKeyword_2_0()); 
            match(input,75,FOLLOW_2); 
             after(grammarAccess.getTableRowAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableRow__Group_2__0__Impl"


    // $ANTLR start "rule__TableRow__Group_2__1"
    // InternalSlideOMatic.g:3555:1: rule__TableRow__Group_2__1 : rule__TableRow__Group_2__1__Impl ;
    public final void rule__TableRow__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3559:1: ( rule__TableRow__Group_2__1__Impl )
            // InternalSlideOMatic.g:3560:2: rule__TableRow__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TableRow__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableRow__Group_2__1"


    // $ANTLR start "rule__TableRow__Group_2__1__Impl"
    // InternalSlideOMatic.g:3566:1: rule__TableRow__Group_2__1__Impl : ( ( rule__TableRow__ValuesAssignment_2_1 ) ) ;
    public final void rule__TableRow__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3570:1: ( ( ( rule__TableRow__ValuesAssignment_2_1 ) ) )
            // InternalSlideOMatic.g:3571:1: ( ( rule__TableRow__ValuesAssignment_2_1 ) )
            {
            // InternalSlideOMatic.g:3571:1: ( ( rule__TableRow__ValuesAssignment_2_1 ) )
            // InternalSlideOMatic.g:3572:2: ( rule__TableRow__ValuesAssignment_2_1 )
            {
             before(grammarAccess.getTableRowAccess().getValuesAssignment_2_1()); 
            // InternalSlideOMatic.g:3573:2: ( rule__TableRow__ValuesAssignment_2_1 )
            // InternalSlideOMatic.g:3573:3: rule__TableRow__ValuesAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__TableRow__ValuesAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getTableRowAccess().getValuesAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableRow__Group_2__1__Impl"


    // $ANTLR start "rule__Animation__Group__0"
    // InternalSlideOMatic.g:3582:1: rule__Animation__Group__0 : rule__Animation__Group__0__Impl rule__Animation__Group__1 ;
    public final void rule__Animation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3586:1: ( rule__Animation__Group__0__Impl rule__Animation__Group__1 )
            // InternalSlideOMatic.g:3587:2: rule__Animation__Group__0__Impl rule__Animation__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__Animation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Animation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Animation__Group__0"


    // $ANTLR start "rule__Animation__Group__0__Impl"
    // InternalSlideOMatic.g:3594:1: rule__Animation__Group__0__Impl : ( 'animate' ) ;
    public final void rule__Animation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3598:1: ( ( 'animate' ) )
            // InternalSlideOMatic.g:3599:1: ( 'animate' )
            {
            // InternalSlideOMatic.g:3599:1: ( 'animate' )
            // InternalSlideOMatic.g:3600:2: 'animate'
            {
             before(grammarAccess.getAnimationAccess().getAnimateKeyword_0()); 
            match(input,95,FOLLOW_2); 
             after(grammarAccess.getAnimationAccess().getAnimateKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Animation__Group__0__Impl"


    // $ANTLR start "rule__Animation__Group__1"
    // InternalSlideOMatic.g:3609:1: rule__Animation__Group__1 : rule__Animation__Group__1__Impl rule__Animation__Group__2 ;
    public final void rule__Animation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3613:1: ( rule__Animation__Group__1__Impl rule__Animation__Group__2 )
            // InternalSlideOMatic.g:3614:2: rule__Animation__Group__1__Impl rule__Animation__Group__2
            {
            pushFollow(FOLLOW_38);
            rule__Animation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Animation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Animation__Group__1"


    // $ANTLR start "rule__Animation__Group__1__Impl"
    // InternalSlideOMatic.g:3621:1: rule__Animation__Group__1__Impl : ( ( rule__Animation__TargetAssignment_1 ) ) ;
    public final void rule__Animation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3625:1: ( ( ( rule__Animation__TargetAssignment_1 ) ) )
            // InternalSlideOMatic.g:3626:1: ( ( rule__Animation__TargetAssignment_1 ) )
            {
            // InternalSlideOMatic.g:3626:1: ( ( rule__Animation__TargetAssignment_1 ) )
            // InternalSlideOMatic.g:3627:2: ( rule__Animation__TargetAssignment_1 )
            {
             before(grammarAccess.getAnimationAccess().getTargetAssignment_1()); 
            // InternalSlideOMatic.g:3628:2: ( rule__Animation__TargetAssignment_1 )
            // InternalSlideOMatic.g:3628:3: rule__Animation__TargetAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Animation__TargetAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAnimationAccess().getTargetAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Animation__Group__1__Impl"


    // $ANTLR start "rule__Animation__Group__2"
    // InternalSlideOMatic.g:3636:1: rule__Animation__Group__2 : rule__Animation__Group__2__Impl rule__Animation__Group__3 ;
    public final void rule__Animation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3640:1: ( rule__Animation__Group__2__Impl rule__Animation__Group__3 )
            // InternalSlideOMatic.g:3641:2: rule__Animation__Group__2__Impl rule__Animation__Group__3
            {
            pushFollow(FOLLOW_39);
            rule__Animation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Animation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Animation__Group__2"


    // $ANTLR start "rule__Animation__Group__2__Impl"
    // InternalSlideOMatic.g:3648:1: rule__Animation__Group__2__Impl : ( ( rule__Animation__TypeAssignment_2 ) ) ;
    public final void rule__Animation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3652:1: ( ( ( rule__Animation__TypeAssignment_2 ) ) )
            // InternalSlideOMatic.g:3653:1: ( ( rule__Animation__TypeAssignment_2 ) )
            {
            // InternalSlideOMatic.g:3653:1: ( ( rule__Animation__TypeAssignment_2 ) )
            // InternalSlideOMatic.g:3654:2: ( rule__Animation__TypeAssignment_2 )
            {
             before(grammarAccess.getAnimationAccess().getTypeAssignment_2()); 
            // InternalSlideOMatic.g:3655:2: ( rule__Animation__TypeAssignment_2 )
            // InternalSlideOMatic.g:3655:3: rule__Animation__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Animation__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAnimationAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Animation__Group__2__Impl"


    // $ANTLR start "rule__Animation__Group__3"
    // InternalSlideOMatic.g:3663:1: rule__Animation__Group__3 : rule__Animation__Group__3__Impl rule__Animation__Group__4 ;
    public final void rule__Animation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3667:1: ( rule__Animation__Group__3__Impl rule__Animation__Group__4 )
            // InternalSlideOMatic.g:3668:2: rule__Animation__Group__3__Impl rule__Animation__Group__4
            {
            pushFollow(FOLLOW_40);
            rule__Animation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Animation__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Animation__Group__3"


    // $ANTLR start "rule__Animation__Group__3__Impl"
    // InternalSlideOMatic.g:3675:1: rule__Animation__Group__3__Impl : ( 'to' ) ;
    public final void rule__Animation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3679:1: ( ( 'to' ) )
            // InternalSlideOMatic.g:3680:1: ( 'to' )
            {
            // InternalSlideOMatic.g:3680:1: ( 'to' )
            // InternalSlideOMatic.g:3681:2: 'to'
            {
             before(grammarAccess.getAnimationAccess().getToKeyword_3()); 
            match(input,96,FOLLOW_2); 
             after(grammarAccess.getAnimationAccess().getToKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Animation__Group__3__Impl"


    // $ANTLR start "rule__Animation__Group__4"
    // InternalSlideOMatic.g:3690:1: rule__Animation__Group__4 : rule__Animation__Group__4__Impl rule__Animation__Group__5 ;
    public final void rule__Animation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3694:1: ( rule__Animation__Group__4__Impl rule__Animation__Group__5 )
            // InternalSlideOMatic.g:3695:2: rule__Animation__Group__4__Impl rule__Animation__Group__5
            {
            pushFollow(FOLLOW_33);
            rule__Animation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Animation__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Animation__Group__4"


    // $ANTLR start "rule__Animation__Group__4__Impl"
    // InternalSlideOMatic.g:3702:1: rule__Animation__Group__4__Impl : ( ( rule__Animation__LocationAssignment_4 ) ) ;
    public final void rule__Animation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3706:1: ( ( ( rule__Animation__LocationAssignment_4 ) ) )
            // InternalSlideOMatic.g:3707:1: ( ( rule__Animation__LocationAssignment_4 ) )
            {
            // InternalSlideOMatic.g:3707:1: ( ( rule__Animation__LocationAssignment_4 ) )
            // InternalSlideOMatic.g:3708:2: ( rule__Animation__LocationAssignment_4 )
            {
             before(grammarAccess.getAnimationAccess().getLocationAssignment_4()); 
            // InternalSlideOMatic.g:3709:2: ( rule__Animation__LocationAssignment_4 )
            // InternalSlideOMatic.g:3709:3: rule__Animation__LocationAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Animation__LocationAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getAnimationAccess().getLocationAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Animation__Group__4__Impl"


    // $ANTLR start "rule__Animation__Group__5"
    // InternalSlideOMatic.g:3717:1: rule__Animation__Group__5 : rule__Animation__Group__5__Impl ;
    public final void rule__Animation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3721:1: ( rule__Animation__Group__5__Impl )
            // InternalSlideOMatic.g:3722:2: rule__Animation__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Animation__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Animation__Group__5"


    // $ANTLR start "rule__Animation__Group__5__Impl"
    // InternalSlideOMatic.g:3728:1: rule__Animation__Group__5__Impl : ( ( rule__Animation__SizeAssignment_5 )? ) ;
    public final void rule__Animation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3732:1: ( ( ( rule__Animation__SizeAssignment_5 )? ) )
            // InternalSlideOMatic.g:3733:1: ( ( rule__Animation__SizeAssignment_5 )? )
            {
            // InternalSlideOMatic.g:3733:1: ( ( rule__Animation__SizeAssignment_5 )? )
            // InternalSlideOMatic.g:3734:2: ( rule__Animation__SizeAssignment_5 )?
            {
             before(grammarAccess.getAnimationAccess().getSizeAssignment_5()); 
            // InternalSlideOMatic.g:3735:2: ( rule__Animation__SizeAssignment_5 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=65 && LA34_0<=66)) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalSlideOMatic.g:3735:3: rule__Animation__SizeAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__Animation__SizeAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAnimationAccess().getSizeAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Animation__Group__5__Impl"


    // $ANTLR start "rule__AnimationType__Group_0__0"
    // InternalSlideOMatic.g:3744:1: rule__AnimationType__Group_0__0 : rule__AnimationType__Group_0__0__Impl rule__AnimationType__Group_0__1 ;
    public final void rule__AnimationType__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3748:1: ( rule__AnimationType__Group_0__0__Impl rule__AnimationType__Group_0__1 )
            // InternalSlideOMatic.g:3749:2: rule__AnimationType__Group_0__0__Impl rule__AnimationType__Group_0__1
            {
            pushFollow(FOLLOW_41);
            rule__AnimationType__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AnimationType__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnimationType__Group_0__0"


    // $ANTLR start "rule__AnimationType__Group_0__0__Impl"
    // InternalSlideOMatic.g:3756:1: rule__AnimationType__Group_0__0__Impl : ( () ) ;
    public final void rule__AnimationType__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3760:1: ( ( () ) )
            // InternalSlideOMatic.g:3761:1: ( () )
            {
            // InternalSlideOMatic.g:3761:1: ( () )
            // InternalSlideOMatic.g:3762:2: ()
            {
             before(grammarAccess.getAnimationTypeAccess().getMoveAction_0_0()); 
            // InternalSlideOMatic.g:3763:2: ()
            // InternalSlideOMatic.g:3763:3: 
            {
            }

             after(grammarAccess.getAnimationTypeAccess().getMoveAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnimationType__Group_0__0__Impl"


    // $ANTLR start "rule__AnimationType__Group_0__1"
    // InternalSlideOMatic.g:3771:1: rule__AnimationType__Group_0__1 : rule__AnimationType__Group_0__1__Impl ;
    public final void rule__AnimationType__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3775:1: ( rule__AnimationType__Group_0__1__Impl )
            // InternalSlideOMatic.g:3776:2: rule__AnimationType__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AnimationType__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnimationType__Group_0__1"


    // $ANTLR start "rule__AnimationType__Group_0__1__Impl"
    // InternalSlideOMatic.g:3782:1: rule__AnimationType__Group_0__1__Impl : ( 'move' ) ;
    public final void rule__AnimationType__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3786:1: ( ( 'move' ) )
            // InternalSlideOMatic.g:3787:1: ( 'move' )
            {
            // InternalSlideOMatic.g:3787:1: ( 'move' )
            // InternalSlideOMatic.g:3788:2: 'move'
            {
             before(grammarAccess.getAnimationTypeAccess().getMoveKeyword_0_1()); 
            match(input,97,FOLLOW_2); 
             after(grammarAccess.getAnimationTypeAccess().getMoveKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnimationType__Group_0__1__Impl"


    // $ANTLR start "rule__AnimationType__Group_1__0"
    // InternalSlideOMatic.g:3798:1: rule__AnimationType__Group_1__0 : rule__AnimationType__Group_1__0__Impl rule__AnimationType__Group_1__1 ;
    public final void rule__AnimationType__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3802:1: ( rule__AnimationType__Group_1__0__Impl rule__AnimationType__Group_1__1 )
            // InternalSlideOMatic.g:3803:2: rule__AnimationType__Group_1__0__Impl rule__AnimationType__Group_1__1
            {
            pushFollow(FOLLOW_38);
            rule__AnimationType__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AnimationType__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnimationType__Group_1__0"


    // $ANTLR start "rule__AnimationType__Group_1__0__Impl"
    // InternalSlideOMatic.g:3810:1: rule__AnimationType__Group_1__0__Impl : ( () ) ;
    public final void rule__AnimationType__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3814:1: ( ( () ) )
            // InternalSlideOMatic.g:3815:1: ( () )
            {
            // InternalSlideOMatic.g:3815:1: ( () )
            // InternalSlideOMatic.g:3816:2: ()
            {
             before(grammarAccess.getAnimationTypeAccess().getJumpAction_1_0()); 
            // InternalSlideOMatic.g:3817:2: ()
            // InternalSlideOMatic.g:3817:3: 
            {
            }

             after(grammarAccess.getAnimationTypeAccess().getJumpAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnimationType__Group_1__0__Impl"


    // $ANTLR start "rule__AnimationType__Group_1__1"
    // InternalSlideOMatic.g:3825:1: rule__AnimationType__Group_1__1 : rule__AnimationType__Group_1__1__Impl ;
    public final void rule__AnimationType__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3829:1: ( rule__AnimationType__Group_1__1__Impl )
            // InternalSlideOMatic.g:3830:2: rule__AnimationType__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AnimationType__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnimationType__Group_1__1"


    // $ANTLR start "rule__AnimationType__Group_1__1__Impl"
    // InternalSlideOMatic.g:3836:1: rule__AnimationType__Group_1__1__Impl : ( 'jump' ) ;
    public final void rule__AnimationType__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3840:1: ( ( 'jump' ) )
            // InternalSlideOMatic.g:3841:1: ( 'jump' )
            {
            // InternalSlideOMatic.g:3841:1: ( 'jump' )
            // InternalSlideOMatic.g:3842:2: 'jump'
            {
             before(grammarAccess.getAnimationTypeAccess().getJumpKeyword_1_1()); 
            match(input,98,FOLLOW_2); 
             after(grammarAccess.getAnimationTypeAccess().getJumpKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnimationType__Group_1__1__Impl"


    // $ANTLR start "rule__Presentation__NameAssignment_1"
    // InternalSlideOMatic.g:3852:1: rule__Presentation__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Presentation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3856:1: ( ( RULE_STRING ) )
            // InternalSlideOMatic.g:3857:2: ( RULE_STRING )
            {
            // InternalSlideOMatic.g:3857:2: ( RULE_STRING )
            // InternalSlideOMatic.g:3858:3: RULE_STRING
            {
             before(grammarAccess.getPresentationAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPresentationAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Presentation__NameAssignment_1"


    // $ANTLR start "rule__Presentation__ThemeAssignment_3_1"
    // InternalSlideOMatic.g:3867:1: rule__Presentation__ThemeAssignment_3_1 : ( ruleTheme ) ;
    public final void rule__Presentation__ThemeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3871:1: ( ( ruleTheme ) )
            // InternalSlideOMatic.g:3872:2: ( ruleTheme )
            {
            // InternalSlideOMatic.g:3872:2: ( ruleTheme )
            // InternalSlideOMatic.g:3873:3: ruleTheme
            {
             before(grammarAccess.getPresentationAccess().getThemeThemeParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTheme();

            state._fsp--;

             after(grammarAccess.getPresentationAccess().getThemeThemeParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Presentation__ThemeAssignment_3_1"


    // $ANTLR start "rule__Presentation__AuthorsAssignment_3_2"
    // InternalSlideOMatic.g:3882:1: rule__Presentation__AuthorsAssignment_3_2 : ( ruleAuthors ) ;
    public final void rule__Presentation__AuthorsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3886:1: ( ( ruleAuthors ) )
            // InternalSlideOMatic.g:3887:2: ( ruleAuthors )
            {
            // InternalSlideOMatic.g:3887:2: ( ruleAuthors )
            // InternalSlideOMatic.g:3888:3: ruleAuthors
            {
             before(grammarAccess.getPresentationAccess().getAuthorsAuthorsParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAuthors();

            state._fsp--;

             after(grammarAccess.getPresentationAccess().getAuthorsAuthorsParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Presentation__AuthorsAssignment_3_2"


    // $ANTLR start "rule__Presentation__InstituteAssignment_3_3"
    // InternalSlideOMatic.g:3897:1: rule__Presentation__InstituteAssignment_3_3 : ( ruleInstitute ) ;
    public final void rule__Presentation__InstituteAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3901:1: ( ( ruleInstitute ) )
            // InternalSlideOMatic.g:3902:2: ( ruleInstitute )
            {
            // InternalSlideOMatic.g:3902:2: ( ruleInstitute )
            // InternalSlideOMatic.g:3903:3: ruleInstitute
            {
             before(grammarAccess.getPresentationAccess().getInstituteInstituteParserRuleCall_3_3_0()); 
            pushFollow(FOLLOW_2);
            ruleInstitute();

            state._fsp--;

             after(grammarAccess.getPresentationAccess().getInstituteInstituteParserRuleCall_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Presentation__InstituteAssignment_3_3"


    // $ANTLR start "rule__Presentation__DateAssignment_3_4"
    // InternalSlideOMatic.g:3912:1: rule__Presentation__DateAssignment_3_4 : ( ruleDate ) ;
    public final void rule__Presentation__DateAssignment_3_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3916:1: ( ( ruleDate ) )
            // InternalSlideOMatic.g:3917:2: ( ruleDate )
            {
            // InternalSlideOMatic.g:3917:2: ( ruleDate )
            // InternalSlideOMatic.g:3918:3: ruleDate
            {
             before(grammarAccess.getPresentationAccess().getDateDateParserRuleCall_3_4_0()); 
            pushFollow(FOLLOW_2);
            ruleDate();

            state._fsp--;

             after(grammarAccess.getPresentationAccess().getDateDateParserRuleCall_3_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Presentation__DateAssignment_3_4"


    // $ANTLR start "rule__Presentation__SlidesAssignment_4_0"
    // InternalSlideOMatic.g:3927:1: rule__Presentation__SlidesAssignment_4_0 : ( ruleSlide ) ;
    public final void rule__Presentation__SlidesAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3931:1: ( ( ruleSlide ) )
            // InternalSlideOMatic.g:3932:2: ( ruleSlide )
            {
            // InternalSlideOMatic.g:3932:2: ( ruleSlide )
            // InternalSlideOMatic.g:3933:3: ruleSlide
            {
             before(grammarAccess.getPresentationAccess().getSlidesSlideParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSlide();

            state._fsp--;

             after(grammarAccess.getPresentationAccess().getSlidesSlideParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Presentation__SlidesAssignment_4_0"


    // $ANTLR start "rule__Presentation__AnimationsAssignment_4_1"
    // InternalSlideOMatic.g:3942:1: rule__Presentation__AnimationsAssignment_4_1 : ( ruleAnimation ) ;
    public final void rule__Presentation__AnimationsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3946:1: ( ( ruleAnimation ) )
            // InternalSlideOMatic.g:3947:2: ( ruleAnimation )
            {
            // InternalSlideOMatic.g:3947:2: ( ruleAnimation )
            // InternalSlideOMatic.g:3948:3: ruleAnimation
            {
             before(grammarAccess.getPresentationAccess().getAnimationsAnimationParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAnimation();

            state._fsp--;

             after(grammarAccess.getPresentationAccess().getAnimationsAnimationParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Presentation__AnimationsAssignment_4_1"


    // $ANTLR start "rule__Theme__ThemeAssignment_1"
    // InternalSlideOMatic.g:3957:1: rule__Theme__ThemeAssignment_1 : ( ruleBeamerTheme ) ;
    public final void rule__Theme__ThemeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3961:1: ( ( ruleBeamerTheme ) )
            // InternalSlideOMatic.g:3962:2: ( ruleBeamerTheme )
            {
            // InternalSlideOMatic.g:3962:2: ( ruleBeamerTheme )
            // InternalSlideOMatic.g:3963:3: ruleBeamerTheme
            {
             before(grammarAccess.getThemeAccess().getThemeBeamerThemeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBeamerTheme();

            state._fsp--;

             after(grammarAccess.getThemeAccess().getThemeBeamerThemeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theme__ThemeAssignment_1"


    // $ANTLR start "rule__Theme__ThemeColorAssignment_2_1"
    // InternalSlideOMatic.g:3972:1: rule__Theme__ThemeColorAssignment_2_1 : ( ruleThemeColor ) ;
    public final void rule__Theme__ThemeColorAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3976:1: ( ( ruleThemeColor ) )
            // InternalSlideOMatic.g:3977:2: ( ruleThemeColor )
            {
            // InternalSlideOMatic.g:3977:2: ( ruleThemeColor )
            // InternalSlideOMatic.g:3978:3: ruleThemeColor
            {
             before(grammarAccess.getThemeAccess().getThemeColorThemeColorParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleThemeColor();

            state._fsp--;

             after(grammarAccess.getThemeAccess().getThemeColorThemeColorParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theme__ThemeColorAssignment_2_1"


    // $ANTLR start "rule__Authors__NamesAssignment_1"
    // InternalSlideOMatic.g:3987:1: rule__Authors__NamesAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Authors__NamesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3991:1: ( ( RULE_STRING ) )
            // InternalSlideOMatic.g:3992:2: ( RULE_STRING )
            {
            // InternalSlideOMatic.g:3992:2: ( RULE_STRING )
            // InternalSlideOMatic.g:3993:3: RULE_STRING
            {
             before(grammarAccess.getAuthorsAccess().getNamesSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getAuthorsAccess().getNamesSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Authors__NamesAssignment_1"


    // $ANTLR start "rule__Authors__NamesAssignment_2_1"
    // InternalSlideOMatic.g:4002:1: rule__Authors__NamesAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__Authors__NamesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4006:1: ( ( RULE_STRING ) )
            // InternalSlideOMatic.g:4007:2: ( RULE_STRING )
            {
            // InternalSlideOMatic.g:4007:2: ( RULE_STRING )
            // InternalSlideOMatic.g:4008:3: RULE_STRING
            {
             before(grammarAccess.getAuthorsAccess().getNamesSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getAuthorsAccess().getNamesSTRINGTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Authors__NamesAssignment_2_1"


    // $ANTLR start "rule__Institute__NameAssignment_1"
    // InternalSlideOMatic.g:4017:1: rule__Institute__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Institute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4021:1: ( ( RULE_STRING ) )
            // InternalSlideOMatic.g:4022:2: ( RULE_STRING )
            {
            // InternalSlideOMatic.g:4022:2: ( RULE_STRING )
            // InternalSlideOMatic.g:4023:3: RULE_STRING
            {
             before(grammarAccess.getInstituteAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getInstituteAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Institute__NameAssignment_1"


    // $ANTLR start "rule__Date__DateAssignment_1"
    // InternalSlideOMatic.g:4032:1: rule__Date__DateAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Date__DateAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4036:1: ( ( RULE_STRING ) )
            // InternalSlideOMatic.g:4037:2: ( RULE_STRING )
            {
            // InternalSlideOMatic.g:4037:2: ( RULE_STRING )
            // InternalSlideOMatic.g:4038:3: RULE_STRING
            {
             before(grammarAccess.getDateAccess().getDateSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDateAccess().getDateSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__DateAssignment_1"


    // $ANTLR start "rule__Slide__NameAssignment_1_0_1"
    // InternalSlideOMatic.g:4047:1: rule__Slide__NameAssignment_1_0_1 : ( RULE_STRING ) ;
    public final void rule__Slide__NameAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4051:1: ( ( RULE_STRING ) )
            // InternalSlideOMatic.g:4052:2: ( RULE_STRING )
            {
            // InternalSlideOMatic.g:4052:2: ( RULE_STRING )
            // InternalSlideOMatic.g:4053:3: RULE_STRING
            {
             before(grammarAccess.getSlideAccess().getNameSTRINGTerminalRuleCall_1_0_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSlideAccess().getNameSTRINGTerminalRuleCall_1_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slide__NameAssignment_1_0_1"


    // $ANTLR start "rule__Slide__NameAssignment_1_1"
    // InternalSlideOMatic.g:4062:1: rule__Slide__NameAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__Slide__NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4066:1: ( ( RULE_STRING ) )
            // InternalSlideOMatic.g:4067:2: ( RULE_STRING )
            {
            // InternalSlideOMatic.g:4067:2: ( RULE_STRING )
            // InternalSlideOMatic.g:4068:3: RULE_STRING
            {
             before(grammarAccess.getSlideAccess().getNameSTRINGTerminalRuleCall_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSlideAccess().getNameSTRINGTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slide__NameAssignment_1_1"


    // $ANTLR start "rule__Slide__ContentsAssignment_3"
    // InternalSlideOMatic.g:4077:1: rule__Slide__ContentsAssignment_3 : ( ruleContent ) ;
    public final void rule__Slide__ContentsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4081:1: ( ( ruleContent ) )
            // InternalSlideOMatic.g:4082:2: ( ruleContent )
            {
            // InternalSlideOMatic.g:4082:2: ( ruleContent )
            // InternalSlideOMatic.g:4083:3: ruleContent
            {
             before(grammarAccess.getSlideAccess().getContentsContentParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleContent();

            state._fsp--;

             after(grammarAccess.getSlideAccess().getContentsContentParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slide__ContentsAssignment_3"


    // $ANTLR start "rule__Text__TextAssignment_0_2"
    // InternalSlideOMatic.g:4092:1: rule__Text__TextAssignment_0_2 : ( RULE_STRING ) ;
    public final void rule__Text__TextAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4096:1: ( ( RULE_STRING ) )
            // InternalSlideOMatic.g:4097:2: ( RULE_STRING )
            {
            // InternalSlideOMatic.g:4097:2: ( RULE_STRING )
            // InternalSlideOMatic.g:4098:3: RULE_STRING
            {
             before(grammarAccess.getTextAccess().getTextSTRINGTerminalRuleCall_0_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTextAccess().getTextSTRINGTerminalRuleCall_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__TextAssignment_0_2"


    // $ANTLR start "rule__Text__NameAssignment_1_2"
    // InternalSlideOMatic.g:4107:1: rule__Text__NameAssignment_1_2 : ( RULE_STRING ) ;
    public final void rule__Text__NameAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4111:1: ( ( RULE_STRING ) )
            // InternalSlideOMatic.g:4112:2: ( RULE_STRING )
            {
            // InternalSlideOMatic.g:4112:2: ( RULE_STRING )
            // InternalSlideOMatic.g:4113:3: RULE_STRING
            {
             before(grammarAccess.getTextAccess().getNameSTRINGTerminalRuleCall_1_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTextAccess().getNameSTRINGTerminalRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__NameAssignment_1_2"


    // $ANTLR start "rule__Text__TextAssignment_1_4"
    // InternalSlideOMatic.g:4122:1: rule__Text__TextAssignment_1_4 : ( RULE_STRING ) ;
    public final void rule__Text__TextAssignment_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4126:1: ( ( RULE_STRING ) )
            // InternalSlideOMatic.g:4127:2: ( RULE_STRING )
            {
            // InternalSlideOMatic.g:4127:2: ( RULE_STRING )
            // InternalSlideOMatic.g:4128:3: RULE_STRING
            {
             before(grammarAccess.getTextAccess().getTextSTRINGTerminalRuleCall_1_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTextAccess().getTextSTRINGTerminalRuleCall_1_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__TextAssignment_1_4"


    // $ANTLR start "rule__List__ListItemsAssignment_0_2"
    // InternalSlideOMatic.g:4137:1: rule__List__ListItemsAssignment_0_2 : ( ruleNumberedListItem ) ;
    public final void rule__List__ListItemsAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4141:1: ( ( ruleNumberedListItem ) )
            // InternalSlideOMatic.g:4142:2: ( ruleNumberedListItem )
            {
            // InternalSlideOMatic.g:4142:2: ( ruleNumberedListItem )
            // InternalSlideOMatic.g:4143:3: ruleNumberedListItem
            {
             before(grammarAccess.getListAccess().getListItemsNumberedListItemParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleNumberedListItem();

            state._fsp--;

             after(grammarAccess.getListAccess().getListItemsNumberedListItemParserRuleCall_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__List__ListItemsAssignment_0_2"


    // $ANTLR start "rule__List__ListItemsAssignment_1_2"
    // InternalSlideOMatic.g:4152:1: rule__List__ListItemsAssignment_1_2 : ( ruleUnNumberedListItem ) ;
    public final void rule__List__ListItemsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4156:1: ( ( ruleUnNumberedListItem ) )
            // InternalSlideOMatic.g:4157:2: ( ruleUnNumberedListItem )
            {
            // InternalSlideOMatic.g:4157:2: ( ruleUnNumberedListItem )
            // InternalSlideOMatic.g:4158:3: ruleUnNumberedListItem
            {
             before(grammarAccess.getListAccess().getListItemsUnNumberedListItemParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleUnNumberedListItem();

            state._fsp--;

             after(grammarAccess.getListAccess().getListItemsUnNumberedListItemParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__List__ListItemsAssignment_1_2"


    // $ANTLR start "rule__NumberedListItem__ItemAssignment_1"
    // InternalSlideOMatic.g:4167:1: rule__NumberedListItem__ItemAssignment_1 : ( RULE_STRING ) ;
    public final void rule__NumberedListItem__ItemAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4171:1: ( ( RULE_STRING ) )
            // InternalSlideOMatic.g:4172:2: ( RULE_STRING )
            {
            // InternalSlideOMatic.g:4172:2: ( RULE_STRING )
            // InternalSlideOMatic.g:4173:3: RULE_STRING
            {
             before(grammarAccess.getNumberedListItemAccess().getItemSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getNumberedListItemAccess().getItemSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberedListItem__ItemAssignment_1"


    // $ANTLR start "rule__UnNumberedListItem__ItemAssignment_1"
    // InternalSlideOMatic.g:4182:1: rule__UnNumberedListItem__ItemAssignment_1 : ( RULE_STRING ) ;
    public final void rule__UnNumberedListItem__ItemAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4186:1: ( ( RULE_STRING ) )
            // InternalSlideOMatic.g:4187:2: ( RULE_STRING )
            {
            // InternalSlideOMatic.g:4187:2: ( RULE_STRING )
            // InternalSlideOMatic.g:4188:3: RULE_STRING
            {
             before(grammarAccess.getUnNumberedListItemAccess().getItemSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getUnNumberedListItemAccess().getItemSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnNumberedListItem__ItemAssignment_1"


    // $ANTLR start "rule__Image__NameAssignment_1"
    // InternalSlideOMatic.g:4197:1: rule__Image__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Image__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4201:1: ( ( RULE_ID ) )
            // InternalSlideOMatic.g:4202:2: ( RULE_ID )
            {
            // InternalSlideOMatic.g:4202:2: ( RULE_ID )
            // InternalSlideOMatic.g:4203:3: RULE_ID
            {
             before(grammarAccess.getImageAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getImageAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Image__NameAssignment_1"


    // $ANTLR start "rule__Image__SrcAssignment_3"
    // InternalSlideOMatic.g:4212:1: rule__Image__SrcAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Image__SrcAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4216:1: ( ( RULE_STRING ) )
            // InternalSlideOMatic.g:4217:2: ( RULE_STRING )
            {
            // InternalSlideOMatic.g:4217:2: ( RULE_STRING )
            // InternalSlideOMatic.g:4218:3: RULE_STRING
            {
             before(grammarAccess.getImageAccess().getSrcSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getImageAccess().getSrcSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Image__SrcAssignment_3"


    // $ANTLR start "rule__Image__AlignmentAssignment_4"
    // InternalSlideOMatic.g:4227:1: rule__Image__AlignmentAssignment_4 : ( ruleAlignment ) ;
    public final void rule__Image__AlignmentAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4231:1: ( ( ruleAlignment ) )
            // InternalSlideOMatic.g:4232:2: ( ruleAlignment )
            {
            // InternalSlideOMatic.g:4232:2: ( ruleAlignment )
            // InternalSlideOMatic.g:4233:3: ruleAlignment
            {
             before(grammarAccess.getImageAccess().getAlignmentAlignmentParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleAlignment();

            state._fsp--;

             after(grammarAccess.getImageAccess().getAlignmentAlignmentParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Image__AlignmentAssignment_4"


    // $ANTLR start "rule__Image__SizeAssignment_5"
    // InternalSlideOMatic.g:4242:1: rule__Image__SizeAssignment_5 : ( ruleSize ) ;
    public final void rule__Image__SizeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4246:1: ( ( ruleSize ) )
            // InternalSlideOMatic.g:4247:2: ( ruleSize )
            {
            // InternalSlideOMatic.g:4247:2: ( ruleSize )
            // InternalSlideOMatic.g:4248:3: ruleSize
            {
             before(grammarAccess.getImageAccess().getSizeSizeParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleSize();

            state._fsp--;

             after(grammarAccess.getImageAccess().getSizeSizeParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Image__SizeAssignment_5"


    // $ANTLR start "rule__Size__ScaleAssignment_1"
    // InternalSlideOMatic.g:4257:1: rule__Size__ScaleAssignment_1 : ( RULE_INT ) ;
    public final void rule__Size__ScaleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4261:1: ( ( RULE_INT ) )
            // InternalSlideOMatic.g:4262:2: ( RULE_INT )
            {
            // InternalSlideOMatic.g:4262:2: ( RULE_INT )
            // InternalSlideOMatic.g:4263:3: RULE_INT
            {
             before(grammarAccess.getSizeAccess().getScaleINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getSizeAccess().getScaleINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Size__ScaleAssignment_1"


    // $ANTLR start "rule__Table__NameAssignment_1"
    // InternalSlideOMatic.g:4272:1: rule__Table__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Table__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4276:1: ( ( RULE_ID ) )
            // InternalSlideOMatic.g:4277:2: ( RULE_ID )
            {
            // InternalSlideOMatic.g:4277:2: ( RULE_ID )
            // InternalSlideOMatic.g:4278:3: RULE_ID
            {
             before(grammarAccess.getTableAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__NameAssignment_1"


    // $ANTLR start "rule__Table__RowsAssignment_3"
    // InternalSlideOMatic.g:4287:1: rule__Table__RowsAssignment_3 : ( ruleTableRow ) ;
    public final void rule__Table__RowsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4291:1: ( ( ruleTableRow ) )
            // InternalSlideOMatic.g:4292:2: ( ruleTableRow )
            {
            // InternalSlideOMatic.g:4292:2: ( ruleTableRow )
            // InternalSlideOMatic.g:4293:3: ruleTableRow
            {
             before(grammarAccess.getTableAccess().getRowsTableRowParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleTableRow();

            state._fsp--;

             after(grammarAccess.getTableAccess().getRowsTableRowParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__RowsAssignment_3"


    // $ANTLR start "rule__Table__RowsAssignment_4_1"
    // InternalSlideOMatic.g:4302:1: rule__Table__RowsAssignment_4_1 : ( ruleTableRow ) ;
    public final void rule__Table__RowsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4306:1: ( ( ruleTableRow ) )
            // InternalSlideOMatic.g:4307:2: ( ruleTableRow )
            {
            // InternalSlideOMatic.g:4307:2: ( ruleTableRow )
            // InternalSlideOMatic.g:4308:3: ruleTableRow
            {
             before(grammarAccess.getTableAccess().getRowsTableRowParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTableRow();

            state._fsp--;

             after(grammarAccess.getTableAccess().getRowsTableRowParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__RowsAssignment_4_1"


    // $ANTLR start "rule__TableRow__ValuesAssignment_1"
    // InternalSlideOMatic.g:4317:1: rule__TableRow__ValuesAssignment_1 : ( RULE_STRING ) ;
    public final void rule__TableRow__ValuesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4321:1: ( ( RULE_STRING ) )
            // InternalSlideOMatic.g:4322:2: ( RULE_STRING )
            {
            // InternalSlideOMatic.g:4322:2: ( RULE_STRING )
            // InternalSlideOMatic.g:4323:3: RULE_STRING
            {
             before(grammarAccess.getTableRowAccess().getValuesSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTableRowAccess().getValuesSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableRow__ValuesAssignment_1"


    // $ANTLR start "rule__TableRow__ValuesAssignment_2_1"
    // InternalSlideOMatic.g:4332:1: rule__TableRow__ValuesAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__TableRow__ValuesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4336:1: ( ( RULE_STRING ) )
            // InternalSlideOMatic.g:4337:2: ( RULE_STRING )
            {
            // InternalSlideOMatic.g:4337:2: ( RULE_STRING )
            // InternalSlideOMatic.g:4338:3: RULE_STRING
            {
             before(grammarAccess.getTableRowAccess().getValuesSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTableRowAccess().getValuesSTRINGTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableRow__ValuesAssignment_2_1"


    // $ANTLR start "rule__Animation__TargetAssignment_1"
    // InternalSlideOMatic.g:4347:1: rule__Animation__TargetAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Animation__TargetAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4351:1: ( ( ( RULE_ID ) ) )
            // InternalSlideOMatic.g:4352:2: ( ( RULE_ID ) )
            {
            // InternalSlideOMatic.g:4352:2: ( ( RULE_ID ) )
            // InternalSlideOMatic.g:4353:3: ( RULE_ID )
            {
             before(grammarAccess.getAnimationAccess().getTargetFloatCrossReference_1_0()); 
            // InternalSlideOMatic.g:4354:3: ( RULE_ID )
            // InternalSlideOMatic.g:4355:4: RULE_ID
            {
             before(grammarAccess.getAnimationAccess().getTargetFloatIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAnimationAccess().getTargetFloatIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getAnimationAccess().getTargetFloatCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Animation__TargetAssignment_1"


    // $ANTLR start "rule__Animation__TypeAssignment_2"
    // InternalSlideOMatic.g:4366:1: rule__Animation__TypeAssignment_2 : ( ruleAnimationType ) ;
    public final void rule__Animation__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4370:1: ( ( ruleAnimationType ) )
            // InternalSlideOMatic.g:4371:2: ( ruleAnimationType )
            {
            // InternalSlideOMatic.g:4371:2: ( ruleAnimationType )
            // InternalSlideOMatic.g:4372:3: ruleAnimationType
            {
             before(grammarAccess.getAnimationAccess().getTypeAnimationTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAnimationType();

            state._fsp--;

             after(grammarAccess.getAnimationAccess().getTypeAnimationTypeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Animation__TypeAssignment_2"


    // $ANTLR start "rule__Animation__LocationAssignment_4"
    // InternalSlideOMatic.g:4381:1: rule__Animation__LocationAssignment_4 : ( ruleAlignment ) ;
    public final void rule__Animation__LocationAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4385:1: ( ( ruleAlignment ) )
            // InternalSlideOMatic.g:4386:2: ( ruleAlignment )
            {
            // InternalSlideOMatic.g:4386:2: ( ruleAlignment )
            // InternalSlideOMatic.g:4387:3: ruleAlignment
            {
             before(grammarAccess.getAnimationAccess().getLocationAlignmentParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleAlignment();

            state._fsp--;

             after(grammarAccess.getAnimationAccess().getLocationAlignmentParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Animation__LocationAssignment_4"


    // $ANTLR start "rule__Animation__SizeAssignment_5"
    // InternalSlideOMatic.g:4396:1: rule__Animation__SizeAssignment_5 : ( ruleSize ) ;
    public final void rule__Animation__SizeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4400:1: ( ( ruleSize ) )
            // InternalSlideOMatic.g:4401:2: ( ruleSize )
            {
            // InternalSlideOMatic.g:4401:2: ( ruleSize )
            // InternalSlideOMatic.g:4402:3: ruleSize
            {
             before(grammarAccess.getAnimationAccess().getSizeSizeParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleSize();

            state._fsp--;

             after(grammarAccess.getAnimationAccess().getSizeSizeParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Animation__SizeAssignment_5"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000000L,0x0000000080004060L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000002L,0x0000000080004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000000L,0x0000000000003580L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000FFFFFFF000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00FFFF0000400000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000010L,0x0000000000038010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000000L,0x00000000127C0000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000002L,0x00000000127C0000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000000L,0x0000000000038000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000000L,0x0000000000180000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000010L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000000L,0x0000000000600000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0xFF00000000000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000800L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000000L,0x0000000600000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0xFF00000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});

}