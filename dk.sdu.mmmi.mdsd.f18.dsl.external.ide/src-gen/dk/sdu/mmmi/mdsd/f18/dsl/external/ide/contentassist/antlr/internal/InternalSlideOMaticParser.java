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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'$$'", "'AnnArbor'", "'Antibes'", "'Bergen'", "'Berkeley'", "'Berlin'", "'Boadilla'", "'boxes'", "'CambridgeUS'", "'Copenhagen'", "'Darmstadt'", "'default'", "'Dresden'", "'Frankfurt'", "'Goettingen'", "'Hannover'", "'Ilmanau'", "'JuanLesPins'", "'Luebeck'", "'Madrid'", "'Malmoe'", "'Marburg'", "'Montpellier'", "'PaloAlto'", "'Pittsburgh'", "'Rochester'", "'Singapore'", "'Szeged'", "'Warsaw'", "'albatros'", "'beaver'", "'beetle'", "'crane'", "'dolphin'", "'dove'", "'fly'", "'lily'", "'orchid'", "'rose'", "'seagull'", "'seahorse'", "'sidebartab'", "'structure'", "'whale'", "'wolverine'", "'topleft'", "'top'", "'topright'", "'left'", "'center'", "'right'", "'bottomleft'", "'bottom'", "'bottomright'", "'width'", "'height'", "'cm'", "'em'", "'mm'", "'presentation'", "'{'", "'}'", "'('", "')'", "'theme'", "'color'", "'author'", "','", "'institute'", "'date'", "'slide'", "'*'", "'**'", "'***'", "'ToC'", "'>'", "'block'", "'#list'", "'&list'", "'-'", "'img'", "'src'", "'%'", "'tab'", "'['", "']'", "'```'", "'animate'", "'to'", "'move'", "'jump'"
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


    // $ANTLR start "entryRuleBlockableContent"
    // InternalSlideOMatic.g:303:1: entryRuleBlockableContent : ruleBlockableContent EOF ;
    public final void entryRuleBlockableContent() throws RecognitionException {
        try {
            // InternalSlideOMatic.g:304:1: ( ruleBlockableContent EOF )
            // InternalSlideOMatic.g:305:1: ruleBlockableContent EOF
            {
             before(grammarAccess.getBlockableContentRule()); 
            pushFollow(FOLLOW_1);
            ruleBlockableContent();

            state._fsp--;

             after(grammarAccess.getBlockableContentRule()); 
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
    // $ANTLR end "entryRuleBlockableContent"


    // $ANTLR start "ruleBlockableContent"
    // InternalSlideOMatic.g:312:1: ruleBlockableContent : ( ( rule__BlockableContent__Alternatives ) ) ;
    public final void ruleBlockableContent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:316:2: ( ( ( rule__BlockableContent__Alternatives ) ) )
            // InternalSlideOMatic.g:317:2: ( ( rule__BlockableContent__Alternatives ) )
            {
            // InternalSlideOMatic.g:317:2: ( ( rule__BlockableContent__Alternatives ) )
            // InternalSlideOMatic.g:318:3: ( rule__BlockableContent__Alternatives )
            {
             before(grammarAccess.getBlockableContentAccess().getAlternatives()); 
            // InternalSlideOMatic.g:319:3: ( rule__BlockableContent__Alternatives )
            // InternalSlideOMatic.g:319:4: rule__BlockableContent__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BlockableContent__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBlockableContentAccess().getAlternatives()); 

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
    // $ANTLR end "ruleBlockableContent"


    // $ANTLR start "entryRuleText"
    // InternalSlideOMatic.g:328:1: entryRuleText : ruleText EOF ;
    public final void entryRuleText() throws RecognitionException {
        try {
            // InternalSlideOMatic.g:329:1: ( ruleText EOF )
            // InternalSlideOMatic.g:330:1: ruleText EOF
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
    // InternalSlideOMatic.g:337:1: ruleText : ( ( rule__Text__Group__0 ) ) ;
    public final void ruleText() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:341:2: ( ( ( rule__Text__Group__0 ) ) )
            // InternalSlideOMatic.g:342:2: ( ( rule__Text__Group__0 ) )
            {
            // InternalSlideOMatic.g:342:2: ( ( rule__Text__Group__0 ) )
            // InternalSlideOMatic.g:343:3: ( rule__Text__Group__0 )
            {
             before(grammarAccess.getTextAccess().getGroup()); 
            // InternalSlideOMatic.g:344:3: ( rule__Text__Group__0 )
            // InternalSlideOMatic.g:344:4: rule__Text__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Text__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTextAccess().getGroup()); 

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


    // $ANTLR start "entryRuleBlock"
    // InternalSlideOMatic.g:353:1: entryRuleBlock : ruleBlock EOF ;
    public final void entryRuleBlock() throws RecognitionException {
        try {
            // InternalSlideOMatic.g:354:1: ( ruleBlock EOF )
            // InternalSlideOMatic.g:355:1: ruleBlock EOF
            {
             before(grammarAccess.getBlockRule()); 
            pushFollow(FOLLOW_1);
            ruleBlock();

            state._fsp--;

             after(grammarAccess.getBlockRule()); 
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
    // $ANTLR end "entryRuleBlock"


    // $ANTLR start "ruleBlock"
    // InternalSlideOMatic.g:362:1: ruleBlock : ( ( rule__Block__Group__0 ) ) ;
    public final void ruleBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:366:2: ( ( ( rule__Block__Group__0 ) ) )
            // InternalSlideOMatic.g:367:2: ( ( rule__Block__Group__0 ) )
            {
            // InternalSlideOMatic.g:367:2: ( ( rule__Block__Group__0 ) )
            // InternalSlideOMatic.g:368:3: ( rule__Block__Group__0 )
            {
             before(grammarAccess.getBlockAccess().getGroup()); 
            // InternalSlideOMatic.g:369:3: ( rule__Block__Group__0 )
            // InternalSlideOMatic.g:369:4: rule__Block__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Block__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBlockAccess().getGroup()); 

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
    // $ANTLR end "ruleBlock"


    // $ANTLR start "entryRuleList"
    // InternalSlideOMatic.g:378:1: entryRuleList : ruleList EOF ;
    public final void entryRuleList() throws RecognitionException {
        try {
            // InternalSlideOMatic.g:379:1: ( ruleList EOF )
            // InternalSlideOMatic.g:380:1: ruleList EOF
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
    // InternalSlideOMatic.g:387:1: ruleList : ( ( rule__List__Alternatives ) ) ;
    public final void ruleList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:391:2: ( ( ( rule__List__Alternatives ) ) )
            // InternalSlideOMatic.g:392:2: ( ( rule__List__Alternatives ) )
            {
            // InternalSlideOMatic.g:392:2: ( ( rule__List__Alternatives ) )
            // InternalSlideOMatic.g:393:3: ( rule__List__Alternatives )
            {
             before(grammarAccess.getListAccess().getAlternatives()); 
            // InternalSlideOMatic.g:394:3: ( rule__List__Alternatives )
            // InternalSlideOMatic.g:394:4: rule__List__Alternatives
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


    // $ANTLR start "entryRuleNumberedList"
    // InternalSlideOMatic.g:403:1: entryRuleNumberedList : ruleNumberedList EOF ;
    public final void entryRuleNumberedList() throws RecognitionException {
        try {
            // InternalSlideOMatic.g:404:1: ( ruleNumberedList EOF )
            // InternalSlideOMatic.g:405:1: ruleNumberedList EOF
            {
             before(grammarAccess.getNumberedListRule()); 
            pushFollow(FOLLOW_1);
            ruleNumberedList();

            state._fsp--;

             after(grammarAccess.getNumberedListRule()); 
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
    // $ANTLR end "entryRuleNumberedList"


    // $ANTLR start "ruleNumberedList"
    // InternalSlideOMatic.g:412:1: ruleNumberedList : ( ( rule__NumberedList__Group__0 ) ) ;
    public final void ruleNumberedList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:416:2: ( ( ( rule__NumberedList__Group__0 ) ) )
            // InternalSlideOMatic.g:417:2: ( ( rule__NumberedList__Group__0 ) )
            {
            // InternalSlideOMatic.g:417:2: ( ( rule__NumberedList__Group__0 ) )
            // InternalSlideOMatic.g:418:3: ( rule__NumberedList__Group__0 )
            {
             before(grammarAccess.getNumberedListAccess().getGroup()); 
            // InternalSlideOMatic.g:419:3: ( rule__NumberedList__Group__0 )
            // InternalSlideOMatic.g:419:4: rule__NumberedList__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NumberedList__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNumberedListAccess().getGroup()); 

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
    // $ANTLR end "ruleNumberedList"


    // $ANTLR start "entryRuleUnNumberedList"
    // InternalSlideOMatic.g:428:1: entryRuleUnNumberedList : ruleUnNumberedList EOF ;
    public final void entryRuleUnNumberedList() throws RecognitionException {
        try {
            // InternalSlideOMatic.g:429:1: ( ruleUnNumberedList EOF )
            // InternalSlideOMatic.g:430:1: ruleUnNumberedList EOF
            {
             before(grammarAccess.getUnNumberedListRule()); 
            pushFollow(FOLLOW_1);
            ruleUnNumberedList();

            state._fsp--;

             after(grammarAccess.getUnNumberedListRule()); 
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
    // $ANTLR end "entryRuleUnNumberedList"


    // $ANTLR start "ruleUnNumberedList"
    // InternalSlideOMatic.g:437:1: ruleUnNumberedList : ( ( rule__UnNumberedList__Group__0 ) ) ;
    public final void ruleUnNumberedList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:441:2: ( ( ( rule__UnNumberedList__Group__0 ) ) )
            // InternalSlideOMatic.g:442:2: ( ( rule__UnNumberedList__Group__0 ) )
            {
            // InternalSlideOMatic.g:442:2: ( ( rule__UnNumberedList__Group__0 ) )
            // InternalSlideOMatic.g:443:3: ( rule__UnNumberedList__Group__0 )
            {
             before(grammarAccess.getUnNumberedListAccess().getGroup()); 
            // InternalSlideOMatic.g:444:3: ( rule__UnNumberedList__Group__0 )
            // InternalSlideOMatic.g:444:4: rule__UnNumberedList__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__UnNumberedList__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUnNumberedListAccess().getGroup()); 

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
    // $ANTLR end "ruleUnNumberedList"


    // $ANTLR start "entryRuleListItem"
    // InternalSlideOMatic.g:453:1: entryRuleListItem : ruleListItem EOF ;
    public final void entryRuleListItem() throws RecognitionException {
        try {
            // InternalSlideOMatic.g:454:1: ( ruleListItem EOF )
            // InternalSlideOMatic.g:455:1: ruleListItem EOF
            {
             before(grammarAccess.getListItemRule()); 
            pushFollow(FOLLOW_1);
            ruleListItem();

            state._fsp--;

             after(grammarAccess.getListItemRule()); 
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
    // $ANTLR end "entryRuleListItem"


    // $ANTLR start "ruleListItem"
    // InternalSlideOMatic.g:462:1: ruleListItem : ( ( rule__ListItem__Group__0 ) ) ;
    public final void ruleListItem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:466:2: ( ( ( rule__ListItem__Group__0 ) ) )
            // InternalSlideOMatic.g:467:2: ( ( rule__ListItem__Group__0 ) )
            {
            // InternalSlideOMatic.g:467:2: ( ( rule__ListItem__Group__0 ) )
            // InternalSlideOMatic.g:468:3: ( rule__ListItem__Group__0 )
            {
             before(grammarAccess.getListItemAccess().getGroup()); 
            // InternalSlideOMatic.g:469:3: ( rule__ListItem__Group__0 )
            // InternalSlideOMatic.g:469:4: rule__ListItem__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ListItem__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getListItemAccess().getGroup()); 

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
    // $ANTLR end "ruleListItem"


    // $ANTLR start "entryRuleFloats"
    // InternalSlideOMatic.g:478:1: entryRuleFloats : ruleFloats EOF ;
    public final void entryRuleFloats() throws RecognitionException {
        try {
            // InternalSlideOMatic.g:479:1: ( ruleFloats EOF )
            // InternalSlideOMatic.g:480:1: ruleFloats EOF
            {
             before(grammarAccess.getFloatsRule()); 
            pushFollow(FOLLOW_1);
            ruleFloats();

            state._fsp--;

             after(grammarAccess.getFloatsRule()); 
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
    // $ANTLR end "entryRuleFloats"


    // $ANTLR start "ruleFloats"
    // InternalSlideOMatic.g:487:1: ruleFloats : ( ( rule__Floats__Alternatives ) ) ;
    public final void ruleFloats() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:491:2: ( ( ( rule__Floats__Alternatives ) ) )
            // InternalSlideOMatic.g:492:2: ( ( rule__Floats__Alternatives ) )
            {
            // InternalSlideOMatic.g:492:2: ( ( rule__Floats__Alternatives ) )
            // InternalSlideOMatic.g:493:3: ( rule__Floats__Alternatives )
            {
             before(grammarAccess.getFloatsAccess().getAlternatives()); 
            // InternalSlideOMatic.g:494:3: ( rule__Floats__Alternatives )
            // InternalSlideOMatic.g:494:4: rule__Floats__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Floats__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFloatsAccess().getAlternatives()); 

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
    // $ANTLR end "ruleFloats"


    // $ANTLR start "entryRuleImage"
    // InternalSlideOMatic.g:503:1: entryRuleImage : ruleImage EOF ;
    public final void entryRuleImage() throws RecognitionException {
        try {
            // InternalSlideOMatic.g:504:1: ( ruleImage EOF )
            // InternalSlideOMatic.g:505:1: ruleImage EOF
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
    // InternalSlideOMatic.g:512:1: ruleImage : ( ( rule__Image__Group__0 ) ) ;
    public final void ruleImage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:516:2: ( ( ( rule__Image__Group__0 ) ) )
            // InternalSlideOMatic.g:517:2: ( ( rule__Image__Group__0 ) )
            {
            // InternalSlideOMatic.g:517:2: ( ( rule__Image__Group__0 ) )
            // InternalSlideOMatic.g:518:3: ( rule__Image__Group__0 )
            {
             before(grammarAccess.getImageAccess().getGroup()); 
            // InternalSlideOMatic.g:519:3: ( rule__Image__Group__0 )
            // InternalSlideOMatic.g:519:4: rule__Image__Group__0
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
    // InternalSlideOMatic.g:528:1: entryRuleAlignment : ruleAlignment EOF ;
    public final void entryRuleAlignment() throws RecognitionException {
        try {
            // InternalSlideOMatic.g:529:1: ( ruleAlignment EOF )
            // InternalSlideOMatic.g:530:1: ruleAlignment EOF
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
    // InternalSlideOMatic.g:537:1: ruleAlignment : ( ( rule__Alignment__Alternatives ) ) ;
    public final void ruleAlignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:541:2: ( ( ( rule__Alignment__Alternatives ) ) )
            // InternalSlideOMatic.g:542:2: ( ( rule__Alignment__Alternatives ) )
            {
            // InternalSlideOMatic.g:542:2: ( ( rule__Alignment__Alternatives ) )
            // InternalSlideOMatic.g:543:3: ( rule__Alignment__Alternatives )
            {
             before(grammarAccess.getAlignmentAccess().getAlternatives()); 
            // InternalSlideOMatic.g:544:3: ( rule__Alignment__Alternatives )
            // InternalSlideOMatic.g:544:4: rule__Alignment__Alternatives
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
    // InternalSlideOMatic.g:553:1: entryRuleSize : ruleSize EOF ;
    public final void entryRuleSize() throws RecognitionException {
        try {
            // InternalSlideOMatic.g:554:1: ( ruleSize EOF )
            // InternalSlideOMatic.g:555:1: ruleSize EOF
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
    // InternalSlideOMatic.g:562:1: ruleSize : ( ( rule__Size__Alternatives ) ) ;
    public final void ruleSize() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:566:2: ( ( ( rule__Size__Alternatives ) ) )
            // InternalSlideOMatic.g:567:2: ( ( rule__Size__Alternatives ) )
            {
            // InternalSlideOMatic.g:567:2: ( ( rule__Size__Alternatives ) )
            // InternalSlideOMatic.g:568:3: ( rule__Size__Alternatives )
            {
             before(grammarAccess.getSizeAccess().getAlternatives()); 
            // InternalSlideOMatic.g:569:3: ( rule__Size__Alternatives )
            // InternalSlideOMatic.g:569:4: rule__Size__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Size__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSizeAccess().getAlternatives()); 

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
    // InternalSlideOMatic.g:578:1: entryRuleTable : ruleTable EOF ;
    public final void entryRuleTable() throws RecognitionException {
        try {
            // InternalSlideOMatic.g:579:1: ( ruleTable EOF )
            // InternalSlideOMatic.g:580:1: ruleTable EOF
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
    // InternalSlideOMatic.g:587:1: ruleTable : ( ( rule__Table__Group__0 ) ) ;
    public final void ruleTable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:591:2: ( ( ( rule__Table__Group__0 ) ) )
            // InternalSlideOMatic.g:592:2: ( ( rule__Table__Group__0 ) )
            {
            // InternalSlideOMatic.g:592:2: ( ( rule__Table__Group__0 ) )
            // InternalSlideOMatic.g:593:3: ( rule__Table__Group__0 )
            {
             before(grammarAccess.getTableAccess().getGroup()); 
            // InternalSlideOMatic.g:594:3: ( rule__Table__Group__0 )
            // InternalSlideOMatic.g:594:4: rule__Table__Group__0
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
    // InternalSlideOMatic.g:603:1: entryRuleTableRow : ruleTableRow EOF ;
    public final void entryRuleTableRow() throws RecognitionException {
        try {
            // InternalSlideOMatic.g:604:1: ( ruleTableRow EOF )
            // InternalSlideOMatic.g:605:1: ruleTableRow EOF
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
    // InternalSlideOMatic.g:612:1: ruleTableRow : ( ( rule__TableRow__Group__0 ) ) ;
    public final void ruleTableRow() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:616:2: ( ( ( rule__TableRow__Group__0 ) ) )
            // InternalSlideOMatic.g:617:2: ( ( rule__TableRow__Group__0 ) )
            {
            // InternalSlideOMatic.g:617:2: ( ( rule__TableRow__Group__0 ) )
            // InternalSlideOMatic.g:618:3: ( rule__TableRow__Group__0 )
            {
             before(grammarAccess.getTableRowAccess().getGroup()); 
            // InternalSlideOMatic.g:619:3: ( rule__TableRow__Group__0 )
            // InternalSlideOMatic.g:619:4: rule__TableRow__Group__0
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


    // $ANTLR start "entryRuleCode"
    // InternalSlideOMatic.g:628:1: entryRuleCode : ruleCode EOF ;
    public final void entryRuleCode() throws RecognitionException {
        try {
            // InternalSlideOMatic.g:629:1: ( ruleCode EOF )
            // InternalSlideOMatic.g:630:1: ruleCode EOF
            {
             before(grammarAccess.getCodeRule()); 
            pushFollow(FOLLOW_1);
            ruleCode();

            state._fsp--;

             after(grammarAccess.getCodeRule()); 
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
    // $ANTLR end "entryRuleCode"


    // $ANTLR start "ruleCode"
    // InternalSlideOMatic.g:637:1: ruleCode : ( ( rule__Code__Group__0 ) ) ;
    public final void ruleCode() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:641:2: ( ( ( rule__Code__Group__0 ) ) )
            // InternalSlideOMatic.g:642:2: ( ( rule__Code__Group__0 ) )
            {
            // InternalSlideOMatic.g:642:2: ( ( rule__Code__Group__0 ) )
            // InternalSlideOMatic.g:643:3: ( rule__Code__Group__0 )
            {
             before(grammarAccess.getCodeAccess().getGroup()); 
            // InternalSlideOMatic.g:644:3: ( rule__Code__Group__0 )
            // InternalSlideOMatic.g:644:4: rule__Code__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Code__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCodeAccess().getGroup()); 

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
    // $ANTLR end "ruleCode"


    // $ANTLR start "entryRuleClick"
    // InternalSlideOMatic.g:653:1: entryRuleClick : ruleClick EOF ;
    public final void entryRuleClick() throws RecognitionException {
        try {
            // InternalSlideOMatic.g:654:1: ( ruleClick EOF )
            // InternalSlideOMatic.g:655:1: ruleClick EOF
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
    // InternalSlideOMatic.g:662:1: ruleClick : ( '$$' ) ;
    public final void ruleClick() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:666:2: ( ( '$$' ) )
            // InternalSlideOMatic.g:667:2: ( '$$' )
            {
            // InternalSlideOMatic.g:667:2: ( '$$' )
            // InternalSlideOMatic.g:668:3: '$$'
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
    // InternalSlideOMatic.g:678:1: entryRuleAnimation : ruleAnimation EOF ;
    public final void entryRuleAnimation() throws RecognitionException {
        try {
            // InternalSlideOMatic.g:679:1: ( ruleAnimation EOF )
            // InternalSlideOMatic.g:680:1: ruleAnimation EOF
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
    // InternalSlideOMatic.g:687:1: ruleAnimation : ( ( rule__Animation__Group__0 ) ) ;
    public final void ruleAnimation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:691:2: ( ( ( rule__Animation__Group__0 ) ) )
            // InternalSlideOMatic.g:692:2: ( ( rule__Animation__Group__0 ) )
            {
            // InternalSlideOMatic.g:692:2: ( ( rule__Animation__Group__0 ) )
            // InternalSlideOMatic.g:693:3: ( rule__Animation__Group__0 )
            {
             before(grammarAccess.getAnimationAccess().getGroup()); 
            // InternalSlideOMatic.g:694:3: ( rule__Animation__Group__0 )
            // InternalSlideOMatic.g:694:4: rule__Animation__Group__0
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
    // InternalSlideOMatic.g:703:1: entryRuleAnimationType : ruleAnimationType EOF ;
    public final void entryRuleAnimationType() throws RecognitionException {
        try {
            // InternalSlideOMatic.g:704:1: ( ruleAnimationType EOF )
            // InternalSlideOMatic.g:705:1: ruleAnimationType EOF
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
    // InternalSlideOMatic.g:712:1: ruleAnimationType : ( ( rule__AnimationType__Alternatives ) ) ;
    public final void ruleAnimationType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:716:2: ( ( ( rule__AnimationType__Alternatives ) ) )
            // InternalSlideOMatic.g:717:2: ( ( rule__AnimationType__Alternatives ) )
            {
            // InternalSlideOMatic.g:717:2: ( ( rule__AnimationType__Alternatives ) )
            // InternalSlideOMatic.g:718:3: ( rule__AnimationType__Alternatives )
            {
             before(grammarAccess.getAnimationTypeAccess().getAlternatives()); 
            // InternalSlideOMatic.g:719:3: ( rule__AnimationType__Alternatives )
            // InternalSlideOMatic.g:719:4: rule__AnimationType__Alternatives
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


    // $ANTLR start "rule__Presentation__Alternatives_5"
    // InternalSlideOMatic.g:727:1: rule__Presentation__Alternatives_5 : ( ( ( rule__Presentation__SlidesAssignment_5_0 ) ) | ( ( rule__Presentation__AnimationsAssignment_5_1 ) ) );
    public final void rule__Presentation__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:731:1: ( ( ( rule__Presentation__SlidesAssignment_5_0 ) ) | ( ( rule__Presentation__AnimationsAssignment_5_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==81) ) {
                alt1=1;
            }
            else if ( (LA1_0==98) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalSlideOMatic.g:732:2: ( ( rule__Presentation__SlidesAssignment_5_0 ) )
                    {
                    // InternalSlideOMatic.g:732:2: ( ( rule__Presentation__SlidesAssignment_5_0 ) )
                    // InternalSlideOMatic.g:733:3: ( rule__Presentation__SlidesAssignment_5_0 )
                    {
                     before(grammarAccess.getPresentationAccess().getSlidesAssignment_5_0()); 
                    // InternalSlideOMatic.g:734:3: ( rule__Presentation__SlidesAssignment_5_0 )
                    // InternalSlideOMatic.g:734:4: rule__Presentation__SlidesAssignment_5_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Presentation__SlidesAssignment_5_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPresentationAccess().getSlidesAssignment_5_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSlideOMatic.g:738:2: ( ( rule__Presentation__AnimationsAssignment_5_1 ) )
                    {
                    // InternalSlideOMatic.g:738:2: ( ( rule__Presentation__AnimationsAssignment_5_1 ) )
                    // InternalSlideOMatic.g:739:3: ( rule__Presentation__AnimationsAssignment_5_1 )
                    {
                     before(grammarAccess.getPresentationAccess().getAnimationsAssignment_5_1()); 
                    // InternalSlideOMatic.g:740:3: ( rule__Presentation__AnimationsAssignment_5_1 )
                    // InternalSlideOMatic.g:740:4: rule__Presentation__AnimationsAssignment_5_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Presentation__AnimationsAssignment_5_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getPresentationAccess().getAnimationsAssignment_5_1()); 

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
    // $ANTLR end "rule__Presentation__Alternatives_5"


    // $ANTLR start "rule__BeamerTheme__Alternatives"
    // InternalSlideOMatic.g:748:1: rule__BeamerTheme__Alternatives : ( ( 'AnnArbor' ) | ( 'Antibes' ) | ( 'Bergen' ) | ( 'Berkeley' ) | ( 'Berlin' ) | ( 'Boadilla' ) | ( 'boxes' ) | ( 'CambridgeUS' ) | ( 'Copenhagen' ) | ( 'Darmstadt' ) | ( 'default' ) | ( 'Dresden' ) | ( 'Frankfurt' ) | ( 'Goettingen' ) | ( 'Hannover' ) | ( 'Ilmanau' ) | ( 'JuanLesPins' ) | ( 'Luebeck' ) | ( 'Madrid' ) | ( 'Malmoe' ) | ( 'Marburg' ) | ( 'Montpellier' ) | ( 'PaloAlto' ) | ( 'Pittsburgh' ) | ( 'Rochester' ) | ( 'Singapore' ) | ( 'Szeged' ) | ( 'Warsaw' ) );
    public final void rule__BeamerTheme__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:752:1: ( ( 'AnnArbor' ) | ( 'Antibes' ) | ( 'Bergen' ) | ( 'Berkeley' ) | ( 'Berlin' ) | ( 'Boadilla' ) | ( 'boxes' ) | ( 'CambridgeUS' ) | ( 'Copenhagen' ) | ( 'Darmstadt' ) | ( 'default' ) | ( 'Dresden' ) | ( 'Frankfurt' ) | ( 'Goettingen' ) | ( 'Hannover' ) | ( 'Ilmanau' ) | ( 'JuanLesPins' ) | ( 'Luebeck' ) | ( 'Madrid' ) | ( 'Malmoe' ) | ( 'Marburg' ) | ( 'Montpellier' ) | ( 'PaloAlto' ) | ( 'Pittsburgh' ) | ( 'Rochester' ) | ( 'Singapore' ) | ( 'Szeged' ) | ( 'Warsaw' ) )
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
                    // InternalSlideOMatic.g:753:2: ( 'AnnArbor' )
                    {
                    // InternalSlideOMatic.g:753:2: ( 'AnnArbor' )
                    // InternalSlideOMatic.g:754:3: 'AnnArbor'
                    {
                     before(grammarAccess.getBeamerThemeAccess().getAnnArborKeyword_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getBeamerThemeAccess().getAnnArborKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSlideOMatic.g:759:2: ( 'Antibes' )
                    {
                    // InternalSlideOMatic.g:759:2: ( 'Antibes' )
                    // InternalSlideOMatic.g:760:3: 'Antibes'
                    {
                     before(grammarAccess.getBeamerThemeAccess().getAntibesKeyword_1()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getBeamerThemeAccess().getAntibesKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSlideOMatic.g:765:2: ( 'Bergen' )
                    {
                    // InternalSlideOMatic.g:765:2: ( 'Bergen' )
                    // InternalSlideOMatic.g:766:3: 'Bergen'
                    {
                     before(grammarAccess.getBeamerThemeAccess().getBergenKeyword_2()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getBeamerThemeAccess().getBergenKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSlideOMatic.g:771:2: ( 'Berkeley' )
                    {
                    // InternalSlideOMatic.g:771:2: ( 'Berkeley' )
                    // InternalSlideOMatic.g:772:3: 'Berkeley'
                    {
                     before(grammarAccess.getBeamerThemeAccess().getBerkeleyKeyword_3()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getBeamerThemeAccess().getBerkeleyKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSlideOMatic.g:777:2: ( 'Berlin' )
                    {
                    // InternalSlideOMatic.g:777:2: ( 'Berlin' )
                    // InternalSlideOMatic.g:778:3: 'Berlin'
                    {
                     before(grammarAccess.getBeamerThemeAccess().getBerlinKeyword_4()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getBeamerThemeAccess().getBerlinKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalSlideOMatic.g:783:2: ( 'Boadilla' )
                    {
                    // InternalSlideOMatic.g:783:2: ( 'Boadilla' )
                    // InternalSlideOMatic.g:784:3: 'Boadilla'
                    {
                     before(grammarAccess.getBeamerThemeAccess().getBoadillaKeyword_5()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getBeamerThemeAccess().getBoadillaKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalSlideOMatic.g:789:2: ( 'boxes' )
                    {
                    // InternalSlideOMatic.g:789:2: ( 'boxes' )
                    // InternalSlideOMatic.g:790:3: 'boxes'
                    {
                     before(grammarAccess.getBeamerThemeAccess().getBoxesKeyword_6()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getBeamerThemeAccess().getBoxesKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalSlideOMatic.g:795:2: ( 'CambridgeUS' )
                    {
                    // InternalSlideOMatic.g:795:2: ( 'CambridgeUS' )
                    // InternalSlideOMatic.g:796:3: 'CambridgeUS'
                    {
                     before(grammarAccess.getBeamerThemeAccess().getCambridgeUSKeyword_7()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getBeamerThemeAccess().getCambridgeUSKeyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalSlideOMatic.g:801:2: ( 'Copenhagen' )
                    {
                    // InternalSlideOMatic.g:801:2: ( 'Copenhagen' )
                    // InternalSlideOMatic.g:802:3: 'Copenhagen'
                    {
                     before(grammarAccess.getBeamerThemeAccess().getCopenhagenKeyword_8()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getBeamerThemeAccess().getCopenhagenKeyword_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalSlideOMatic.g:807:2: ( 'Darmstadt' )
                    {
                    // InternalSlideOMatic.g:807:2: ( 'Darmstadt' )
                    // InternalSlideOMatic.g:808:3: 'Darmstadt'
                    {
                     before(grammarAccess.getBeamerThemeAccess().getDarmstadtKeyword_9()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getBeamerThemeAccess().getDarmstadtKeyword_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalSlideOMatic.g:813:2: ( 'default' )
                    {
                    // InternalSlideOMatic.g:813:2: ( 'default' )
                    // InternalSlideOMatic.g:814:3: 'default'
                    {
                     before(grammarAccess.getBeamerThemeAccess().getDefaultKeyword_10()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getBeamerThemeAccess().getDefaultKeyword_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalSlideOMatic.g:819:2: ( 'Dresden' )
                    {
                    // InternalSlideOMatic.g:819:2: ( 'Dresden' )
                    // InternalSlideOMatic.g:820:3: 'Dresden'
                    {
                     before(grammarAccess.getBeamerThemeAccess().getDresdenKeyword_11()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getBeamerThemeAccess().getDresdenKeyword_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalSlideOMatic.g:825:2: ( 'Frankfurt' )
                    {
                    // InternalSlideOMatic.g:825:2: ( 'Frankfurt' )
                    // InternalSlideOMatic.g:826:3: 'Frankfurt'
                    {
                     before(grammarAccess.getBeamerThemeAccess().getFrankfurtKeyword_12()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getBeamerThemeAccess().getFrankfurtKeyword_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalSlideOMatic.g:831:2: ( 'Goettingen' )
                    {
                    // InternalSlideOMatic.g:831:2: ( 'Goettingen' )
                    // InternalSlideOMatic.g:832:3: 'Goettingen'
                    {
                     before(grammarAccess.getBeamerThemeAccess().getGoettingenKeyword_13()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getBeamerThemeAccess().getGoettingenKeyword_13()); 

                    }


                    }
                    break;
                case 15 :
                    // InternalSlideOMatic.g:837:2: ( 'Hannover' )
                    {
                    // InternalSlideOMatic.g:837:2: ( 'Hannover' )
                    // InternalSlideOMatic.g:838:3: 'Hannover'
                    {
                     before(grammarAccess.getBeamerThemeAccess().getHannoverKeyword_14()); 
                    match(input,26,FOLLOW_2); 
                     after(grammarAccess.getBeamerThemeAccess().getHannoverKeyword_14()); 

                    }


                    }
                    break;
                case 16 :
                    // InternalSlideOMatic.g:843:2: ( 'Ilmanau' )
                    {
                    // InternalSlideOMatic.g:843:2: ( 'Ilmanau' )
                    // InternalSlideOMatic.g:844:3: 'Ilmanau'
                    {
                     before(grammarAccess.getBeamerThemeAccess().getIlmanauKeyword_15()); 
                    match(input,27,FOLLOW_2); 
                     after(grammarAccess.getBeamerThemeAccess().getIlmanauKeyword_15()); 

                    }


                    }
                    break;
                case 17 :
                    // InternalSlideOMatic.g:849:2: ( 'JuanLesPins' )
                    {
                    // InternalSlideOMatic.g:849:2: ( 'JuanLesPins' )
                    // InternalSlideOMatic.g:850:3: 'JuanLesPins'
                    {
                     before(grammarAccess.getBeamerThemeAccess().getJuanLesPinsKeyword_16()); 
                    match(input,28,FOLLOW_2); 
                     after(grammarAccess.getBeamerThemeAccess().getJuanLesPinsKeyword_16()); 

                    }


                    }
                    break;
                case 18 :
                    // InternalSlideOMatic.g:855:2: ( 'Luebeck' )
                    {
                    // InternalSlideOMatic.g:855:2: ( 'Luebeck' )
                    // InternalSlideOMatic.g:856:3: 'Luebeck'
                    {
                     before(grammarAccess.getBeamerThemeAccess().getLuebeckKeyword_17()); 
                    match(input,29,FOLLOW_2); 
                     after(grammarAccess.getBeamerThemeAccess().getLuebeckKeyword_17()); 

                    }


                    }
                    break;
                case 19 :
                    // InternalSlideOMatic.g:861:2: ( 'Madrid' )
                    {
                    // InternalSlideOMatic.g:861:2: ( 'Madrid' )
                    // InternalSlideOMatic.g:862:3: 'Madrid'
                    {
                     before(grammarAccess.getBeamerThemeAccess().getMadridKeyword_18()); 
                    match(input,30,FOLLOW_2); 
                     after(grammarAccess.getBeamerThemeAccess().getMadridKeyword_18()); 

                    }


                    }
                    break;
                case 20 :
                    // InternalSlideOMatic.g:867:2: ( 'Malmoe' )
                    {
                    // InternalSlideOMatic.g:867:2: ( 'Malmoe' )
                    // InternalSlideOMatic.g:868:3: 'Malmoe'
                    {
                     before(grammarAccess.getBeamerThemeAccess().getMalmoeKeyword_19()); 
                    match(input,31,FOLLOW_2); 
                     after(grammarAccess.getBeamerThemeAccess().getMalmoeKeyword_19()); 

                    }


                    }
                    break;
                case 21 :
                    // InternalSlideOMatic.g:873:2: ( 'Marburg' )
                    {
                    // InternalSlideOMatic.g:873:2: ( 'Marburg' )
                    // InternalSlideOMatic.g:874:3: 'Marburg'
                    {
                     before(grammarAccess.getBeamerThemeAccess().getMarburgKeyword_20()); 
                    match(input,32,FOLLOW_2); 
                     after(grammarAccess.getBeamerThemeAccess().getMarburgKeyword_20()); 

                    }


                    }
                    break;
                case 22 :
                    // InternalSlideOMatic.g:879:2: ( 'Montpellier' )
                    {
                    // InternalSlideOMatic.g:879:2: ( 'Montpellier' )
                    // InternalSlideOMatic.g:880:3: 'Montpellier'
                    {
                     before(grammarAccess.getBeamerThemeAccess().getMontpellierKeyword_21()); 
                    match(input,33,FOLLOW_2); 
                     after(grammarAccess.getBeamerThemeAccess().getMontpellierKeyword_21()); 

                    }


                    }
                    break;
                case 23 :
                    // InternalSlideOMatic.g:885:2: ( 'PaloAlto' )
                    {
                    // InternalSlideOMatic.g:885:2: ( 'PaloAlto' )
                    // InternalSlideOMatic.g:886:3: 'PaloAlto'
                    {
                     before(grammarAccess.getBeamerThemeAccess().getPaloAltoKeyword_22()); 
                    match(input,34,FOLLOW_2); 
                     after(grammarAccess.getBeamerThemeAccess().getPaloAltoKeyword_22()); 

                    }


                    }
                    break;
                case 24 :
                    // InternalSlideOMatic.g:891:2: ( 'Pittsburgh' )
                    {
                    // InternalSlideOMatic.g:891:2: ( 'Pittsburgh' )
                    // InternalSlideOMatic.g:892:3: 'Pittsburgh'
                    {
                     before(grammarAccess.getBeamerThemeAccess().getPittsburghKeyword_23()); 
                    match(input,35,FOLLOW_2); 
                     after(grammarAccess.getBeamerThemeAccess().getPittsburghKeyword_23()); 

                    }


                    }
                    break;
                case 25 :
                    // InternalSlideOMatic.g:897:2: ( 'Rochester' )
                    {
                    // InternalSlideOMatic.g:897:2: ( 'Rochester' )
                    // InternalSlideOMatic.g:898:3: 'Rochester'
                    {
                     before(grammarAccess.getBeamerThemeAccess().getRochesterKeyword_24()); 
                    match(input,36,FOLLOW_2); 
                     after(grammarAccess.getBeamerThemeAccess().getRochesterKeyword_24()); 

                    }


                    }
                    break;
                case 26 :
                    // InternalSlideOMatic.g:903:2: ( 'Singapore' )
                    {
                    // InternalSlideOMatic.g:903:2: ( 'Singapore' )
                    // InternalSlideOMatic.g:904:3: 'Singapore'
                    {
                     before(grammarAccess.getBeamerThemeAccess().getSingaporeKeyword_25()); 
                    match(input,37,FOLLOW_2); 
                     after(grammarAccess.getBeamerThemeAccess().getSingaporeKeyword_25()); 

                    }


                    }
                    break;
                case 27 :
                    // InternalSlideOMatic.g:909:2: ( 'Szeged' )
                    {
                    // InternalSlideOMatic.g:909:2: ( 'Szeged' )
                    // InternalSlideOMatic.g:910:3: 'Szeged'
                    {
                     before(grammarAccess.getBeamerThemeAccess().getSzegedKeyword_26()); 
                    match(input,38,FOLLOW_2); 
                     after(grammarAccess.getBeamerThemeAccess().getSzegedKeyword_26()); 

                    }


                    }
                    break;
                case 28 :
                    // InternalSlideOMatic.g:915:2: ( 'Warsaw' )
                    {
                    // InternalSlideOMatic.g:915:2: ( 'Warsaw' )
                    // InternalSlideOMatic.g:916:3: 'Warsaw'
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
    // InternalSlideOMatic.g:925:1: rule__ThemeColor__Alternatives : ( ( 'albatros' ) | ( 'beaver' ) | ( 'beetle' ) | ( 'crane' ) | ( 'default' ) | ( 'dolphin' ) | ( 'dove' ) | ( 'fly' ) | ( 'lily' ) | ( 'orchid' ) | ( 'rose' ) | ( 'seagull' ) | ( 'seahorse' ) | ( 'sidebartab' ) | ( 'structure' ) | ( 'whale' ) | ( 'wolverine' ) );
    public final void rule__ThemeColor__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:929:1: ( ( 'albatros' ) | ( 'beaver' ) | ( 'beetle' ) | ( 'crane' ) | ( 'default' ) | ( 'dolphin' ) | ( 'dove' ) | ( 'fly' ) | ( 'lily' ) | ( 'orchid' ) | ( 'rose' ) | ( 'seagull' ) | ( 'seahorse' ) | ( 'sidebartab' ) | ( 'structure' ) | ( 'whale' ) | ( 'wolverine' ) )
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
                    // InternalSlideOMatic.g:930:2: ( 'albatros' )
                    {
                    // InternalSlideOMatic.g:930:2: ( 'albatros' )
                    // InternalSlideOMatic.g:931:3: 'albatros'
                    {
                     before(grammarAccess.getThemeColorAccess().getAlbatrosKeyword_0()); 
                    match(input,40,FOLLOW_2); 
                     after(grammarAccess.getThemeColorAccess().getAlbatrosKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSlideOMatic.g:936:2: ( 'beaver' )
                    {
                    // InternalSlideOMatic.g:936:2: ( 'beaver' )
                    // InternalSlideOMatic.g:937:3: 'beaver'
                    {
                     before(grammarAccess.getThemeColorAccess().getBeaverKeyword_1()); 
                    match(input,41,FOLLOW_2); 
                     after(grammarAccess.getThemeColorAccess().getBeaverKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSlideOMatic.g:942:2: ( 'beetle' )
                    {
                    // InternalSlideOMatic.g:942:2: ( 'beetle' )
                    // InternalSlideOMatic.g:943:3: 'beetle'
                    {
                     before(grammarAccess.getThemeColorAccess().getBeetleKeyword_2()); 
                    match(input,42,FOLLOW_2); 
                     after(grammarAccess.getThemeColorAccess().getBeetleKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSlideOMatic.g:948:2: ( 'crane' )
                    {
                    // InternalSlideOMatic.g:948:2: ( 'crane' )
                    // InternalSlideOMatic.g:949:3: 'crane'
                    {
                     before(grammarAccess.getThemeColorAccess().getCraneKeyword_3()); 
                    match(input,43,FOLLOW_2); 
                     after(grammarAccess.getThemeColorAccess().getCraneKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSlideOMatic.g:954:2: ( 'default' )
                    {
                    // InternalSlideOMatic.g:954:2: ( 'default' )
                    // InternalSlideOMatic.g:955:3: 'default'
                    {
                     before(grammarAccess.getThemeColorAccess().getDefaultKeyword_4()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getThemeColorAccess().getDefaultKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalSlideOMatic.g:960:2: ( 'dolphin' )
                    {
                    // InternalSlideOMatic.g:960:2: ( 'dolphin' )
                    // InternalSlideOMatic.g:961:3: 'dolphin'
                    {
                     before(grammarAccess.getThemeColorAccess().getDolphinKeyword_5()); 
                    match(input,44,FOLLOW_2); 
                     after(grammarAccess.getThemeColorAccess().getDolphinKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalSlideOMatic.g:966:2: ( 'dove' )
                    {
                    // InternalSlideOMatic.g:966:2: ( 'dove' )
                    // InternalSlideOMatic.g:967:3: 'dove'
                    {
                     before(grammarAccess.getThemeColorAccess().getDoveKeyword_6()); 
                    match(input,45,FOLLOW_2); 
                     after(grammarAccess.getThemeColorAccess().getDoveKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalSlideOMatic.g:972:2: ( 'fly' )
                    {
                    // InternalSlideOMatic.g:972:2: ( 'fly' )
                    // InternalSlideOMatic.g:973:3: 'fly'
                    {
                     before(grammarAccess.getThemeColorAccess().getFlyKeyword_7()); 
                    match(input,46,FOLLOW_2); 
                     after(grammarAccess.getThemeColorAccess().getFlyKeyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalSlideOMatic.g:978:2: ( 'lily' )
                    {
                    // InternalSlideOMatic.g:978:2: ( 'lily' )
                    // InternalSlideOMatic.g:979:3: 'lily'
                    {
                     before(grammarAccess.getThemeColorAccess().getLilyKeyword_8()); 
                    match(input,47,FOLLOW_2); 
                     after(grammarAccess.getThemeColorAccess().getLilyKeyword_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalSlideOMatic.g:984:2: ( 'orchid' )
                    {
                    // InternalSlideOMatic.g:984:2: ( 'orchid' )
                    // InternalSlideOMatic.g:985:3: 'orchid'
                    {
                     before(grammarAccess.getThemeColorAccess().getOrchidKeyword_9()); 
                    match(input,48,FOLLOW_2); 
                     after(grammarAccess.getThemeColorAccess().getOrchidKeyword_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalSlideOMatic.g:990:2: ( 'rose' )
                    {
                    // InternalSlideOMatic.g:990:2: ( 'rose' )
                    // InternalSlideOMatic.g:991:3: 'rose'
                    {
                     before(grammarAccess.getThemeColorAccess().getRoseKeyword_10()); 
                    match(input,49,FOLLOW_2); 
                     after(grammarAccess.getThemeColorAccess().getRoseKeyword_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalSlideOMatic.g:996:2: ( 'seagull' )
                    {
                    // InternalSlideOMatic.g:996:2: ( 'seagull' )
                    // InternalSlideOMatic.g:997:3: 'seagull'
                    {
                     before(grammarAccess.getThemeColorAccess().getSeagullKeyword_11()); 
                    match(input,50,FOLLOW_2); 
                     after(grammarAccess.getThemeColorAccess().getSeagullKeyword_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalSlideOMatic.g:1002:2: ( 'seahorse' )
                    {
                    // InternalSlideOMatic.g:1002:2: ( 'seahorse' )
                    // InternalSlideOMatic.g:1003:3: 'seahorse'
                    {
                     before(grammarAccess.getThemeColorAccess().getSeahorseKeyword_12()); 
                    match(input,51,FOLLOW_2); 
                     after(grammarAccess.getThemeColorAccess().getSeahorseKeyword_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalSlideOMatic.g:1008:2: ( 'sidebartab' )
                    {
                    // InternalSlideOMatic.g:1008:2: ( 'sidebartab' )
                    // InternalSlideOMatic.g:1009:3: 'sidebartab'
                    {
                     before(grammarAccess.getThemeColorAccess().getSidebartabKeyword_13()); 
                    match(input,52,FOLLOW_2); 
                     after(grammarAccess.getThemeColorAccess().getSidebartabKeyword_13()); 

                    }


                    }
                    break;
                case 15 :
                    // InternalSlideOMatic.g:1014:2: ( 'structure' )
                    {
                    // InternalSlideOMatic.g:1014:2: ( 'structure' )
                    // InternalSlideOMatic.g:1015:3: 'structure'
                    {
                     before(grammarAccess.getThemeColorAccess().getStructureKeyword_14()); 
                    match(input,53,FOLLOW_2); 
                     after(grammarAccess.getThemeColorAccess().getStructureKeyword_14()); 

                    }


                    }
                    break;
                case 16 :
                    // InternalSlideOMatic.g:1020:2: ( 'whale' )
                    {
                    // InternalSlideOMatic.g:1020:2: ( 'whale' )
                    // InternalSlideOMatic.g:1021:3: 'whale'
                    {
                     before(grammarAccess.getThemeColorAccess().getWhaleKeyword_15()); 
                    match(input,54,FOLLOW_2); 
                     after(grammarAccess.getThemeColorAccess().getWhaleKeyword_15()); 

                    }


                    }
                    break;
                case 17 :
                    // InternalSlideOMatic.g:1026:2: ( 'wolverine' )
                    {
                    // InternalSlideOMatic.g:1026:2: ( 'wolverine' )
                    // InternalSlideOMatic.g:1027:3: 'wolverine'
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
    // InternalSlideOMatic.g:1036:1: rule__Slide__Alternatives_1 : ( ( ( rule__Slide__Group_1_0__0 ) ) | ( ( rule__Slide__NameAssignment_1_1 ) ) );
    public final void rule__Slide__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1040:1: ( ( ( rule__Slide__Group_1_0__0 ) ) | ( ( rule__Slide__NameAssignment_1_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=82 && LA4_0<=84)) ) {
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
                    // InternalSlideOMatic.g:1041:2: ( ( rule__Slide__Group_1_0__0 ) )
                    {
                    // InternalSlideOMatic.g:1041:2: ( ( rule__Slide__Group_1_0__0 ) )
                    // InternalSlideOMatic.g:1042:3: ( rule__Slide__Group_1_0__0 )
                    {
                     before(grammarAccess.getSlideAccess().getGroup_1_0()); 
                    // InternalSlideOMatic.g:1043:3: ( rule__Slide__Group_1_0__0 )
                    // InternalSlideOMatic.g:1043:4: rule__Slide__Group_1_0__0
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
                    // InternalSlideOMatic.g:1047:2: ( ( rule__Slide__NameAssignment_1_1 ) )
                    {
                    // InternalSlideOMatic.g:1047:2: ( ( rule__Slide__NameAssignment_1_1 ) )
                    // InternalSlideOMatic.g:1048:3: ( rule__Slide__NameAssignment_1_1 )
                    {
                     before(grammarAccess.getSlideAccess().getNameAssignment_1_1()); 
                    // InternalSlideOMatic.g:1049:3: ( rule__Slide__NameAssignment_1_1 )
                    // InternalSlideOMatic.g:1049:4: rule__Slide__NameAssignment_1_1
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
    // InternalSlideOMatic.g:1057:1: rule__Section__Alternatives : ( ( ( rule__Section__Group_0__0 ) ) | ( ( rule__Section__Group_1__0 ) ) | ( ( rule__Section__Group_2__0 ) ) );
    public final void rule__Section__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1061:1: ( ( ( rule__Section__Group_0__0 ) ) | ( ( rule__Section__Group_1__0 ) ) | ( ( rule__Section__Group_2__0 ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 82:
                {
                alt5=1;
                }
                break;
            case 83:
                {
                alt5=2;
                }
                break;
            case 84:
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
                    // InternalSlideOMatic.g:1062:2: ( ( rule__Section__Group_0__0 ) )
                    {
                    // InternalSlideOMatic.g:1062:2: ( ( rule__Section__Group_0__0 ) )
                    // InternalSlideOMatic.g:1063:3: ( rule__Section__Group_0__0 )
                    {
                     before(grammarAccess.getSectionAccess().getGroup_0()); 
                    // InternalSlideOMatic.g:1064:3: ( rule__Section__Group_0__0 )
                    // InternalSlideOMatic.g:1064:4: rule__Section__Group_0__0
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
                    // InternalSlideOMatic.g:1068:2: ( ( rule__Section__Group_1__0 ) )
                    {
                    // InternalSlideOMatic.g:1068:2: ( ( rule__Section__Group_1__0 ) )
                    // InternalSlideOMatic.g:1069:3: ( rule__Section__Group_1__0 )
                    {
                     before(grammarAccess.getSectionAccess().getGroup_1()); 
                    // InternalSlideOMatic.g:1070:3: ( rule__Section__Group_1__0 )
                    // InternalSlideOMatic.g:1070:4: rule__Section__Group_1__0
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
                    // InternalSlideOMatic.g:1074:2: ( ( rule__Section__Group_2__0 ) )
                    {
                    // InternalSlideOMatic.g:1074:2: ( ( rule__Section__Group_2__0 ) )
                    // InternalSlideOMatic.g:1075:3: ( rule__Section__Group_2__0 )
                    {
                     before(grammarAccess.getSectionAccess().getGroup_2()); 
                    // InternalSlideOMatic.g:1076:3: ( rule__Section__Group_2__0 )
                    // InternalSlideOMatic.g:1076:4: rule__Section__Group_2__0
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
    // InternalSlideOMatic.g:1084:1: rule__Content__Alternatives : ( ( ( rule__Content__Group_0__0 ) ) | ( ruleBlockableContent ) | ( ruleCode ) );
    public final void rule__Content__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1088:1: ( ( ( rule__Content__Group_0__0 ) ) | ( ruleBlockableContent ) | ( ruleCode ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 85:
                {
                alt6=1;
                }
                break;
            case 86:
            case 87:
            case 88:
            case 89:
            case 91:
            case 94:
                {
                alt6=2;
                }
                break;
            case 97:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalSlideOMatic.g:1089:2: ( ( rule__Content__Group_0__0 ) )
                    {
                    // InternalSlideOMatic.g:1089:2: ( ( rule__Content__Group_0__0 ) )
                    // InternalSlideOMatic.g:1090:3: ( rule__Content__Group_0__0 )
                    {
                     before(grammarAccess.getContentAccess().getGroup_0()); 
                    // InternalSlideOMatic.g:1091:3: ( rule__Content__Group_0__0 )
                    // InternalSlideOMatic.g:1091:4: rule__Content__Group_0__0
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
                    // InternalSlideOMatic.g:1095:2: ( ruleBlockableContent )
                    {
                    // InternalSlideOMatic.g:1095:2: ( ruleBlockableContent )
                    // InternalSlideOMatic.g:1096:3: ruleBlockableContent
                    {
                     before(grammarAccess.getContentAccess().getBlockableContentParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleBlockableContent();

                    state._fsp--;

                     after(grammarAccess.getContentAccess().getBlockableContentParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSlideOMatic.g:1101:2: ( ruleCode )
                    {
                    // InternalSlideOMatic.g:1101:2: ( ruleCode )
                    // InternalSlideOMatic.g:1102:3: ruleCode
                    {
                     before(grammarAccess.getContentAccess().getCodeParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleCode();

                    state._fsp--;

                     after(grammarAccess.getContentAccess().getCodeParserRuleCall_2()); 

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


    // $ANTLR start "rule__BlockableContent__Alternatives"
    // InternalSlideOMatic.g:1111:1: rule__BlockableContent__Alternatives : ( ( ruleText ) | ( ruleBlock ) | ( ruleList ) | ( ruleFloats ) );
    public final void rule__BlockableContent__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1115:1: ( ( ruleText ) | ( ruleBlock ) | ( ruleList ) | ( ruleFloats ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 86:
                {
                alt7=1;
                }
                break;
            case 87:
                {
                alt7=2;
                }
                break;
            case 88:
            case 89:
                {
                alt7=3;
                }
                break;
            case 91:
            case 94:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalSlideOMatic.g:1116:2: ( ruleText )
                    {
                    // InternalSlideOMatic.g:1116:2: ( ruleText )
                    // InternalSlideOMatic.g:1117:3: ruleText
                    {
                     before(grammarAccess.getBlockableContentAccess().getTextParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleText();

                    state._fsp--;

                     after(grammarAccess.getBlockableContentAccess().getTextParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSlideOMatic.g:1122:2: ( ruleBlock )
                    {
                    // InternalSlideOMatic.g:1122:2: ( ruleBlock )
                    // InternalSlideOMatic.g:1123:3: ruleBlock
                    {
                     before(grammarAccess.getBlockableContentAccess().getBlockParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleBlock();

                    state._fsp--;

                     after(grammarAccess.getBlockableContentAccess().getBlockParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSlideOMatic.g:1128:2: ( ruleList )
                    {
                    // InternalSlideOMatic.g:1128:2: ( ruleList )
                    // InternalSlideOMatic.g:1129:3: ruleList
                    {
                     before(grammarAccess.getBlockableContentAccess().getListParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleList();

                    state._fsp--;

                     after(grammarAccess.getBlockableContentAccess().getListParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSlideOMatic.g:1134:2: ( ruleFloats )
                    {
                    // InternalSlideOMatic.g:1134:2: ( ruleFloats )
                    // InternalSlideOMatic.g:1135:3: ruleFloats
                    {
                     before(grammarAccess.getBlockableContentAccess().getFloatsParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleFloats();

                    state._fsp--;

                     after(grammarAccess.getBlockableContentAccess().getFloatsParserRuleCall_3()); 

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
    // $ANTLR end "rule__BlockableContent__Alternatives"


    // $ANTLR start "rule__List__Alternatives"
    // InternalSlideOMatic.g:1144:1: rule__List__Alternatives : ( ( ruleNumberedList ) | ( ruleUnNumberedList ) );
    public final void rule__List__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1148:1: ( ( ruleNumberedList ) | ( ruleUnNumberedList ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==88) ) {
                alt8=1;
            }
            else if ( (LA8_0==89) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalSlideOMatic.g:1149:2: ( ruleNumberedList )
                    {
                    // InternalSlideOMatic.g:1149:2: ( ruleNumberedList )
                    // InternalSlideOMatic.g:1150:3: ruleNumberedList
                    {
                     before(grammarAccess.getListAccess().getNumberedListParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleNumberedList();

                    state._fsp--;

                     after(grammarAccess.getListAccess().getNumberedListParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSlideOMatic.g:1155:2: ( ruleUnNumberedList )
                    {
                    // InternalSlideOMatic.g:1155:2: ( ruleUnNumberedList )
                    // InternalSlideOMatic.g:1156:3: ruleUnNumberedList
                    {
                     before(grammarAccess.getListAccess().getUnNumberedListParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleUnNumberedList();

                    state._fsp--;

                     after(grammarAccess.getListAccess().getUnNumberedListParserRuleCall_1()); 

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


    // $ANTLR start "rule__Floats__Alternatives"
    // InternalSlideOMatic.g:1165:1: rule__Floats__Alternatives : ( ( ruleImage ) | ( ruleTable ) );
    public final void rule__Floats__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1169:1: ( ( ruleImage ) | ( ruleTable ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==91) ) {
                alt9=1;
            }
            else if ( (LA9_0==94) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalSlideOMatic.g:1170:2: ( ruleImage )
                    {
                    // InternalSlideOMatic.g:1170:2: ( ruleImage )
                    // InternalSlideOMatic.g:1171:3: ruleImage
                    {
                     before(grammarAccess.getFloatsAccess().getImageParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleImage();

                    state._fsp--;

                     after(grammarAccess.getFloatsAccess().getImageParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSlideOMatic.g:1176:2: ( ruleTable )
                    {
                    // InternalSlideOMatic.g:1176:2: ( ruleTable )
                    // InternalSlideOMatic.g:1177:3: ruleTable
                    {
                     before(grammarAccess.getFloatsAccess().getTableParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleTable();

                    state._fsp--;

                     after(grammarAccess.getFloatsAccess().getTableParserRuleCall_1()); 

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
    // $ANTLR end "rule__Floats__Alternatives"


    // $ANTLR start "rule__Alignment__Alternatives"
    // InternalSlideOMatic.g:1186:1: rule__Alignment__Alternatives : ( ( 'topleft' ) | ( 'top' ) | ( 'topright' ) | ( 'left' ) | ( 'center' ) | ( 'right' ) | ( 'bottomleft' ) | ( 'bottom' ) | ( 'bottomright' ) );
    public final void rule__Alignment__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1190:1: ( ( 'topleft' ) | ( 'top' ) | ( 'topright' ) | ( 'left' ) | ( 'center' ) | ( 'right' ) | ( 'bottomleft' ) | ( 'bottom' ) | ( 'bottomright' ) )
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
                    // InternalSlideOMatic.g:1191:2: ( 'topleft' )
                    {
                    // InternalSlideOMatic.g:1191:2: ( 'topleft' )
                    // InternalSlideOMatic.g:1192:3: 'topleft'
                    {
                     before(grammarAccess.getAlignmentAccess().getTopleftKeyword_0()); 
                    match(input,56,FOLLOW_2); 
                     after(grammarAccess.getAlignmentAccess().getTopleftKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSlideOMatic.g:1197:2: ( 'top' )
                    {
                    // InternalSlideOMatic.g:1197:2: ( 'top' )
                    // InternalSlideOMatic.g:1198:3: 'top'
                    {
                     before(grammarAccess.getAlignmentAccess().getTopKeyword_1()); 
                    match(input,57,FOLLOW_2); 
                     after(grammarAccess.getAlignmentAccess().getTopKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSlideOMatic.g:1203:2: ( 'topright' )
                    {
                    // InternalSlideOMatic.g:1203:2: ( 'topright' )
                    // InternalSlideOMatic.g:1204:3: 'topright'
                    {
                     before(grammarAccess.getAlignmentAccess().getToprightKeyword_2()); 
                    match(input,58,FOLLOW_2); 
                     after(grammarAccess.getAlignmentAccess().getToprightKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSlideOMatic.g:1209:2: ( 'left' )
                    {
                    // InternalSlideOMatic.g:1209:2: ( 'left' )
                    // InternalSlideOMatic.g:1210:3: 'left'
                    {
                     before(grammarAccess.getAlignmentAccess().getLeftKeyword_3()); 
                    match(input,59,FOLLOW_2); 
                     after(grammarAccess.getAlignmentAccess().getLeftKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSlideOMatic.g:1215:2: ( 'center' )
                    {
                    // InternalSlideOMatic.g:1215:2: ( 'center' )
                    // InternalSlideOMatic.g:1216:3: 'center'
                    {
                     before(grammarAccess.getAlignmentAccess().getCenterKeyword_4()); 
                    match(input,60,FOLLOW_2); 
                     after(grammarAccess.getAlignmentAccess().getCenterKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalSlideOMatic.g:1221:2: ( 'right' )
                    {
                    // InternalSlideOMatic.g:1221:2: ( 'right' )
                    // InternalSlideOMatic.g:1222:3: 'right'
                    {
                     before(grammarAccess.getAlignmentAccess().getRightKeyword_5()); 
                    match(input,61,FOLLOW_2); 
                     after(grammarAccess.getAlignmentAccess().getRightKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalSlideOMatic.g:1227:2: ( 'bottomleft' )
                    {
                    // InternalSlideOMatic.g:1227:2: ( 'bottomleft' )
                    // InternalSlideOMatic.g:1228:3: 'bottomleft'
                    {
                     before(grammarAccess.getAlignmentAccess().getBottomleftKeyword_6()); 
                    match(input,62,FOLLOW_2); 
                     after(grammarAccess.getAlignmentAccess().getBottomleftKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalSlideOMatic.g:1233:2: ( 'bottom' )
                    {
                    // InternalSlideOMatic.g:1233:2: ( 'bottom' )
                    // InternalSlideOMatic.g:1234:3: 'bottom'
                    {
                     before(grammarAccess.getAlignmentAccess().getBottomKeyword_7()); 
                    match(input,63,FOLLOW_2); 
                     after(grammarAccess.getAlignmentAccess().getBottomKeyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalSlideOMatic.g:1239:2: ( 'bottomright' )
                    {
                    // InternalSlideOMatic.g:1239:2: ( 'bottomright' )
                    // InternalSlideOMatic.g:1240:3: 'bottomright'
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


    // $ANTLR start "rule__Size__Alternatives"
    // InternalSlideOMatic.g:1249:1: rule__Size__Alternatives : ( ( ( rule__Size__Group_0__0 ) ) | ( ( rule__Size__Group_1__0 ) ) );
    public final void rule__Size__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1253:1: ( ( ( rule__Size__Group_0__0 ) ) | ( ( rule__Size__Group_1__0 ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=65 && LA11_0<=66)) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_INT) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalSlideOMatic.g:1254:2: ( ( rule__Size__Group_0__0 ) )
                    {
                    // InternalSlideOMatic.g:1254:2: ( ( rule__Size__Group_0__0 ) )
                    // InternalSlideOMatic.g:1255:3: ( rule__Size__Group_0__0 )
                    {
                     before(grammarAccess.getSizeAccess().getGroup_0()); 
                    // InternalSlideOMatic.g:1256:3: ( rule__Size__Group_0__0 )
                    // InternalSlideOMatic.g:1256:4: rule__Size__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Size__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSizeAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSlideOMatic.g:1260:2: ( ( rule__Size__Group_1__0 ) )
                    {
                    // InternalSlideOMatic.g:1260:2: ( ( rule__Size__Group_1__0 ) )
                    // InternalSlideOMatic.g:1261:3: ( rule__Size__Group_1__0 )
                    {
                     before(grammarAccess.getSizeAccess().getGroup_1()); 
                    // InternalSlideOMatic.g:1262:3: ( rule__Size__Group_1__0 )
                    // InternalSlideOMatic.g:1262:4: rule__Size__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Size__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSizeAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Size__Alternatives"


    // $ANTLR start "rule__Size__WayAlternatives_0_1_0"
    // InternalSlideOMatic.g:1270:1: rule__Size__WayAlternatives_0_1_0 : ( ( 'width' ) | ( 'height' ) );
    public final void rule__Size__WayAlternatives_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1274:1: ( ( 'width' ) | ( 'height' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==65) ) {
                alt12=1;
            }
            else if ( (LA12_0==66) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalSlideOMatic.g:1275:2: ( 'width' )
                    {
                    // InternalSlideOMatic.g:1275:2: ( 'width' )
                    // InternalSlideOMatic.g:1276:3: 'width'
                    {
                     before(grammarAccess.getSizeAccess().getWayWidthKeyword_0_1_0_0()); 
                    match(input,65,FOLLOW_2); 
                     after(grammarAccess.getSizeAccess().getWayWidthKeyword_0_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSlideOMatic.g:1281:2: ( 'height' )
                    {
                    // InternalSlideOMatic.g:1281:2: ( 'height' )
                    // InternalSlideOMatic.g:1282:3: 'height'
                    {
                     before(grammarAccess.getSizeAccess().getWayHeightKeyword_0_1_0_1()); 
                    match(input,66,FOLLOW_2); 
                     after(grammarAccess.getSizeAccess().getWayHeightKeyword_0_1_0_1()); 

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
    // $ANTLR end "rule__Size__WayAlternatives_0_1_0"


    // $ANTLR start "rule__Size__UnitAlternatives_1_2_0"
    // InternalSlideOMatic.g:1291:1: rule__Size__UnitAlternatives_1_2_0 : ( ( 'cm' ) | ( 'em' ) | ( 'mm' ) );
    public final void rule__Size__UnitAlternatives_1_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1295:1: ( ( 'cm' ) | ( 'em' ) | ( 'mm' ) )
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
                    // InternalSlideOMatic.g:1296:2: ( 'cm' )
                    {
                    // InternalSlideOMatic.g:1296:2: ( 'cm' )
                    // InternalSlideOMatic.g:1297:3: 'cm'
                    {
                     before(grammarAccess.getSizeAccess().getUnitCmKeyword_1_2_0_0()); 
                    match(input,67,FOLLOW_2); 
                     after(grammarAccess.getSizeAccess().getUnitCmKeyword_1_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSlideOMatic.g:1302:2: ( 'em' )
                    {
                    // InternalSlideOMatic.g:1302:2: ( 'em' )
                    // InternalSlideOMatic.g:1303:3: 'em'
                    {
                     before(grammarAccess.getSizeAccess().getUnitEmKeyword_1_2_0_1()); 
                    match(input,68,FOLLOW_2); 
                     after(grammarAccess.getSizeAccess().getUnitEmKeyword_1_2_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSlideOMatic.g:1308:2: ( 'mm' )
                    {
                    // InternalSlideOMatic.g:1308:2: ( 'mm' )
                    // InternalSlideOMatic.g:1309:3: 'mm'
                    {
                     before(grammarAccess.getSizeAccess().getUnitMmKeyword_1_2_0_2()); 
                    match(input,69,FOLLOW_2); 
                     after(grammarAccess.getSizeAccess().getUnitMmKeyword_1_2_0_2()); 

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
    // $ANTLR end "rule__Size__UnitAlternatives_1_2_0"


    // $ANTLR start "rule__AnimationType__Alternatives"
    // InternalSlideOMatic.g:1318:1: rule__AnimationType__Alternatives : ( ( ( rule__AnimationType__Group_0__0 ) ) | ( ( rule__AnimationType__Group_1__0 ) ) );
    public final void rule__AnimationType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1322:1: ( ( ( rule__AnimationType__Group_0__0 ) ) | ( ( rule__AnimationType__Group_1__0 ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==100) ) {
                alt14=1;
            }
            else if ( (LA14_0==101) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalSlideOMatic.g:1323:2: ( ( rule__AnimationType__Group_0__0 ) )
                    {
                    // InternalSlideOMatic.g:1323:2: ( ( rule__AnimationType__Group_0__0 ) )
                    // InternalSlideOMatic.g:1324:3: ( rule__AnimationType__Group_0__0 )
                    {
                     before(grammarAccess.getAnimationTypeAccess().getGroup_0()); 
                    // InternalSlideOMatic.g:1325:3: ( rule__AnimationType__Group_0__0 )
                    // InternalSlideOMatic.g:1325:4: rule__AnimationType__Group_0__0
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
                    // InternalSlideOMatic.g:1329:2: ( ( rule__AnimationType__Group_1__0 ) )
                    {
                    // InternalSlideOMatic.g:1329:2: ( ( rule__AnimationType__Group_1__0 ) )
                    // InternalSlideOMatic.g:1330:3: ( rule__AnimationType__Group_1__0 )
                    {
                     before(grammarAccess.getAnimationTypeAccess().getGroup_1()); 
                    // InternalSlideOMatic.g:1331:3: ( rule__AnimationType__Group_1__0 )
                    // InternalSlideOMatic.g:1331:4: rule__AnimationType__Group_1__0
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
    // InternalSlideOMatic.g:1339:1: rule__Presentation__Group__0 : rule__Presentation__Group__0__Impl rule__Presentation__Group__1 ;
    public final void rule__Presentation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1343:1: ( rule__Presentation__Group__0__Impl rule__Presentation__Group__1 )
            // InternalSlideOMatic.g:1344:2: rule__Presentation__Group__0__Impl rule__Presentation__Group__1
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
    // InternalSlideOMatic.g:1351:1: rule__Presentation__Group__0__Impl : ( 'presentation' ) ;
    public final void rule__Presentation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1355:1: ( ( 'presentation' ) )
            // InternalSlideOMatic.g:1356:1: ( 'presentation' )
            {
            // InternalSlideOMatic.g:1356:1: ( 'presentation' )
            // InternalSlideOMatic.g:1357:2: 'presentation'
            {
             before(grammarAccess.getPresentationAccess().getPresentationKeyword_0()); 
            match(input,70,FOLLOW_2); 
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
    // InternalSlideOMatic.g:1366:1: rule__Presentation__Group__1 : rule__Presentation__Group__1__Impl rule__Presentation__Group__2 ;
    public final void rule__Presentation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1370:1: ( rule__Presentation__Group__1__Impl rule__Presentation__Group__2 )
            // InternalSlideOMatic.g:1371:2: rule__Presentation__Group__1__Impl rule__Presentation__Group__2
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
    // InternalSlideOMatic.g:1378:1: rule__Presentation__Group__1__Impl : ( ( rule__Presentation__NameAssignment_1 ) ) ;
    public final void rule__Presentation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1382:1: ( ( ( rule__Presentation__NameAssignment_1 ) ) )
            // InternalSlideOMatic.g:1383:1: ( ( rule__Presentation__NameAssignment_1 ) )
            {
            // InternalSlideOMatic.g:1383:1: ( ( rule__Presentation__NameAssignment_1 ) )
            // InternalSlideOMatic.g:1384:2: ( rule__Presentation__NameAssignment_1 )
            {
             before(grammarAccess.getPresentationAccess().getNameAssignment_1()); 
            // InternalSlideOMatic.g:1385:2: ( rule__Presentation__NameAssignment_1 )
            // InternalSlideOMatic.g:1385:3: rule__Presentation__NameAssignment_1
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
    // InternalSlideOMatic.g:1393:1: rule__Presentation__Group__2 : rule__Presentation__Group__2__Impl rule__Presentation__Group__3 ;
    public final void rule__Presentation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1397:1: ( rule__Presentation__Group__2__Impl rule__Presentation__Group__3 )
            // InternalSlideOMatic.g:1398:2: rule__Presentation__Group__2__Impl rule__Presentation__Group__3
            {
            pushFollow(FOLLOW_4);
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
    // InternalSlideOMatic.g:1405:1: rule__Presentation__Group__2__Impl : ( ( rule__Presentation__SubtitleAssignment_2 )? ) ;
    public final void rule__Presentation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1409:1: ( ( ( rule__Presentation__SubtitleAssignment_2 )? ) )
            // InternalSlideOMatic.g:1410:1: ( ( rule__Presentation__SubtitleAssignment_2 )? )
            {
            // InternalSlideOMatic.g:1410:1: ( ( rule__Presentation__SubtitleAssignment_2 )? )
            // InternalSlideOMatic.g:1411:2: ( rule__Presentation__SubtitleAssignment_2 )?
            {
             before(grammarAccess.getPresentationAccess().getSubtitleAssignment_2()); 
            // InternalSlideOMatic.g:1412:2: ( rule__Presentation__SubtitleAssignment_2 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_STRING) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalSlideOMatic.g:1412:3: rule__Presentation__SubtitleAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Presentation__SubtitleAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPresentationAccess().getSubtitleAssignment_2()); 

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
    // InternalSlideOMatic.g:1420:1: rule__Presentation__Group__3 : rule__Presentation__Group__3__Impl rule__Presentation__Group__4 ;
    public final void rule__Presentation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1424:1: ( rule__Presentation__Group__3__Impl rule__Presentation__Group__4 )
            // InternalSlideOMatic.g:1425:2: rule__Presentation__Group__3__Impl rule__Presentation__Group__4
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
    // InternalSlideOMatic.g:1432:1: rule__Presentation__Group__3__Impl : ( '{' ) ;
    public final void rule__Presentation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1436:1: ( ( '{' ) )
            // InternalSlideOMatic.g:1437:1: ( '{' )
            {
            // InternalSlideOMatic.g:1437:1: ( '{' )
            // InternalSlideOMatic.g:1438:2: '{'
            {
             before(grammarAccess.getPresentationAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,71,FOLLOW_2); 
             after(grammarAccess.getPresentationAccess().getLeftCurlyBracketKeyword_3()); 

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
    // InternalSlideOMatic.g:1447:1: rule__Presentation__Group__4 : rule__Presentation__Group__4__Impl rule__Presentation__Group__5 ;
    public final void rule__Presentation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1451:1: ( rule__Presentation__Group__4__Impl rule__Presentation__Group__5 )
            // InternalSlideOMatic.g:1452:2: rule__Presentation__Group__4__Impl rule__Presentation__Group__5
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
    // InternalSlideOMatic.g:1459:1: rule__Presentation__Group__4__Impl : ( ( rule__Presentation__Group_4__0 )? ) ;
    public final void rule__Presentation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1463:1: ( ( ( rule__Presentation__Group_4__0 )? ) )
            // InternalSlideOMatic.g:1464:1: ( ( rule__Presentation__Group_4__0 )? )
            {
            // InternalSlideOMatic.g:1464:1: ( ( rule__Presentation__Group_4__0 )? )
            // InternalSlideOMatic.g:1465:2: ( rule__Presentation__Group_4__0 )?
            {
             before(grammarAccess.getPresentationAccess().getGroup_4()); 
            // InternalSlideOMatic.g:1466:2: ( rule__Presentation__Group_4__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==73) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalSlideOMatic.g:1466:3: rule__Presentation__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Presentation__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPresentationAccess().getGroup_4()); 

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
    // InternalSlideOMatic.g:1474:1: rule__Presentation__Group__5 : rule__Presentation__Group__5__Impl rule__Presentation__Group__6 ;
    public final void rule__Presentation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1478:1: ( rule__Presentation__Group__5__Impl rule__Presentation__Group__6 )
            // InternalSlideOMatic.g:1479:2: rule__Presentation__Group__5__Impl rule__Presentation__Group__6
            {
            pushFollow(FOLLOW_5);
            rule__Presentation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Presentation__Group__6();

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
    // InternalSlideOMatic.g:1486:1: rule__Presentation__Group__5__Impl : ( ( rule__Presentation__Alternatives_5 )* ) ;
    public final void rule__Presentation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1490:1: ( ( ( rule__Presentation__Alternatives_5 )* ) )
            // InternalSlideOMatic.g:1491:1: ( ( rule__Presentation__Alternatives_5 )* )
            {
            // InternalSlideOMatic.g:1491:1: ( ( rule__Presentation__Alternatives_5 )* )
            // InternalSlideOMatic.g:1492:2: ( rule__Presentation__Alternatives_5 )*
            {
             before(grammarAccess.getPresentationAccess().getAlternatives_5()); 
            // InternalSlideOMatic.g:1493:2: ( rule__Presentation__Alternatives_5 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==81||LA17_0==98) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalSlideOMatic.g:1493:3: rule__Presentation__Alternatives_5
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Presentation__Alternatives_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getPresentationAccess().getAlternatives_5()); 

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


    // $ANTLR start "rule__Presentation__Group__6"
    // InternalSlideOMatic.g:1501:1: rule__Presentation__Group__6 : rule__Presentation__Group__6__Impl ;
    public final void rule__Presentation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1505:1: ( rule__Presentation__Group__6__Impl )
            // InternalSlideOMatic.g:1506:2: rule__Presentation__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Presentation__Group__6__Impl();

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
    // $ANTLR end "rule__Presentation__Group__6"


    // $ANTLR start "rule__Presentation__Group__6__Impl"
    // InternalSlideOMatic.g:1512:1: rule__Presentation__Group__6__Impl : ( '}' ) ;
    public final void rule__Presentation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1516:1: ( ( '}' ) )
            // InternalSlideOMatic.g:1517:1: ( '}' )
            {
            // InternalSlideOMatic.g:1517:1: ( '}' )
            // InternalSlideOMatic.g:1518:2: '}'
            {
             before(grammarAccess.getPresentationAccess().getRightCurlyBracketKeyword_6()); 
            match(input,72,FOLLOW_2); 
             after(grammarAccess.getPresentationAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__Presentation__Group__6__Impl"


    // $ANTLR start "rule__Presentation__Group_4__0"
    // InternalSlideOMatic.g:1528:1: rule__Presentation__Group_4__0 : rule__Presentation__Group_4__0__Impl rule__Presentation__Group_4__1 ;
    public final void rule__Presentation__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1532:1: ( rule__Presentation__Group_4__0__Impl rule__Presentation__Group_4__1 )
            // InternalSlideOMatic.g:1533:2: rule__Presentation__Group_4__0__Impl rule__Presentation__Group_4__1
            {
            pushFollow(FOLLOW_7);
            rule__Presentation__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Presentation__Group_4__1();

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
    // $ANTLR end "rule__Presentation__Group_4__0"


    // $ANTLR start "rule__Presentation__Group_4__0__Impl"
    // InternalSlideOMatic.g:1540:1: rule__Presentation__Group_4__0__Impl : ( '(' ) ;
    public final void rule__Presentation__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1544:1: ( ( '(' ) )
            // InternalSlideOMatic.g:1545:1: ( '(' )
            {
            // InternalSlideOMatic.g:1545:1: ( '(' )
            // InternalSlideOMatic.g:1546:2: '('
            {
             before(grammarAccess.getPresentationAccess().getLeftParenthesisKeyword_4_0()); 
            match(input,73,FOLLOW_2); 
             after(grammarAccess.getPresentationAccess().getLeftParenthesisKeyword_4_0()); 

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
    // $ANTLR end "rule__Presentation__Group_4__0__Impl"


    // $ANTLR start "rule__Presentation__Group_4__1"
    // InternalSlideOMatic.g:1555:1: rule__Presentation__Group_4__1 : rule__Presentation__Group_4__1__Impl rule__Presentation__Group_4__2 ;
    public final void rule__Presentation__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1559:1: ( rule__Presentation__Group_4__1__Impl rule__Presentation__Group_4__2 )
            // InternalSlideOMatic.g:1560:2: rule__Presentation__Group_4__1__Impl rule__Presentation__Group_4__2
            {
            pushFollow(FOLLOW_7);
            rule__Presentation__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Presentation__Group_4__2();

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
    // $ANTLR end "rule__Presentation__Group_4__1"


    // $ANTLR start "rule__Presentation__Group_4__1__Impl"
    // InternalSlideOMatic.g:1567:1: rule__Presentation__Group_4__1__Impl : ( ( rule__Presentation__ThemeAssignment_4_1 )? ) ;
    public final void rule__Presentation__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1571:1: ( ( ( rule__Presentation__ThemeAssignment_4_1 )? ) )
            // InternalSlideOMatic.g:1572:1: ( ( rule__Presentation__ThemeAssignment_4_1 )? )
            {
            // InternalSlideOMatic.g:1572:1: ( ( rule__Presentation__ThemeAssignment_4_1 )? )
            // InternalSlideOMatic.g:1573:2: ( rule__Presentation__ThemeAssignment_4_1 )?
            {
             before(grammarAccess.getPresentationAccess().getThemeAssignment_4_1()); 
            // InternalSlideOMatic.g:1574:2: ( rule__Presentation__ThemeAssignment_4_1 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==75) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalSlideOMatic.g:1574:3: rule__Presentation__ThemeAssignment_4_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Presentation__ThemeAssignment_4_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPresentationAccess().getThemeAssignment_4_1()); 

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
    // $ANTLR end "rule__Presentation__Group_4__1__Impl"


    // $ANTLR start "rule__Presentation__Group_4__2"
    // InternalSlideOMatic.g:1582:1: rule__Presentation__Group_4__2 : rule__Presentation__Group_4__2__Impl rule__Presentation__Group_4__3 ;
    public final void rule__Presentation__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1586:1: ( rule__Presentation__Group_4__2__Impl rule__Presentation__Group_4__3 )
            // InternalSlideOMatic.g:1587:2: rule__Presentation__Group_4__2__Impl rule__Presentation__Group_4__3
            {
            pushFollow(FOLLOW_7);
            rule__Presentation__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Presentation__Group_4__3();

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
    // $ANTLR end "rule__Presentation__Group_4__2"


    // $ANTLR start "rule__Presentation__Group_4__2__Impl"
    // InternalSlideOMatic.g:1594:1: rule__Presentation__Group_4__2__Impl : ( ( rule__Presentation__AuthorsAssignment_4_2 )? ) ;
    public final void rule__Presentation__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1598:1: ( ( ( rule__Presentation__AuthorsAssignment_4_2 )? ) )
            // InternalSlideOMatic.g:1599:1: ( ( rule__Presentation__AuthorsAssignment_4_2 )? )
            {
            // InternalSlideOMatic.g:1599:1: ( ( rule__Presentation__AuthorsAssignment_4_2 )? )
            // InternalSlideOMatic.g:1600:2: ( rule__Presentation__AuthorsAssignment_4_2 )?
            {
             before(grammarAccess.getPresentationAccess().getAuthorsAssignment_4_2()); 
            // InternalSlideOMatic.g:1601:2: ( rule__Presentation__AuthorsAssignment_4_2 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==77) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalSlideOMatic.g:1601:3: rule__Presentation__AuthorsAssignment_4_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Presentation__AuthorsAssignment_4_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPresentationAccess().getAuthorsAssignment_4_2()); 

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
    // $ANTLR end "rule__Presentation__Group_4__2__Impl"


    // $ANTLR start "rule__Presentation__Group_4__3"
    // InternalSlideOMatic.g:1609:1: rule__Presentation__Group_4__3 : rule__Presentation__Group_4__3__Impl rule__Presentation__Group_4__4 ;
    public final void rule__Presentation__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1613:1: ( rule__Presentation__Group_4__3__Impl rule__Presentation__Group_4__4 )
            // InternalSlideOMatic.g:1614:2: rule__Presentation__Group_4__3__Impl rule__Presentation__Group_4__4
            {
            pushFollow(FOLLOW_7);
            rule__Presentation__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Presentation__Group_4__4();

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
    // $ANTLR end "rule__Presentation__Group_4__3"


    // $ANTLR start "rule__Presentation__Group_4__3__Impl"
    // InternalSlideOMatic.g:1621:1: rule__Presentation__Group_4__3__Impl : ( ( rule__Presentation__InstituteAssignment_4_3 )? ) ;
    public final void rule__Presentation__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1625:1: ( ( ( rule__Presentation__InstituteAssignment_4_3 )? ) )
            // InternalSlideOMatic.g:1626:1: ( ( rule__Presentation__InstituteAssignment_4_3 )? )
            {
            // InternalSlideOMatic.g:1626:1: ( ( rule__Presentation__InstituteAssignment_4_3 )? )
            // InternalSlideOMatic.g:1627:2: ( rule__Presentation__InstituteAssignment_4_3 )?
            {
             before(grammarAccess.getPresentationAccess().getInstituteAssignment_4_3()); 
            // InternalSlideOMatic.g:1628:2: ( rule__Presentation__InstituteAssignment_4_3 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==79) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalSlideOMatic.g:1628:3: rule__Presentation__InstituteAssignment_4_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Presentation__InstituteAssignment_4_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPresentationAccess().getInstituteAssignment_4_3()); 

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
    // $ANTLR end "rule__Presentation__Group_4__3__Impl"


    // $ANTLR start "rule__Presentation__Group_4__4"
    // InternalSlideOMatic.g:1636:1: rule__Presentation__Group_4__4 : rule__Presentation__Group_4__4__Impl rule__Presentation__Group_4__5 ;
    public final void rule__Presentation__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1640:1: ( rule__Presentation__Group_4__4__Impl rule__Presentation__Group_4__5 )
            // InternalSlideOMatic.g:1641:2: rule__Presentation__Group_4__4__Impl rule__Presentation__Group_4__5
            {
            pushFollow(FOLLOW_7);
            rule__Presentation__Group_4__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Presentation__Group_4__5();

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
    // $ANTLR end "rule__Presentation__Group_4__4"


    // $ANTLR start "rule__Presentation__Group_4__4__Impl"
    // InternalSlideOMatic.g:1648:1: rule__Presentation__Group_4__4__Impl : ( ( rule__Presentation__DateAssignment_4_4 )? ) ;
    public final void rule__Presentation__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1652:1: ( ( ( rule__Presentation__DateAssignment_4_4 )? ) )
            // InternalSlideOMatic.g:1653:1: ( ( rule__Presentation__DateAssignment_4_4 )? )
            {
            // InternalSlideOMatic.g:1653:1: ( ( rule__Presentation__DateAssignment_4_4 )? )
            // InternalSlideOMatic.g:1654:2: ( rule__Presentation__DateAssignment_4_4 )?
            {
             before(grammarAccess.getPresentationAccess().getDateAssignment_4_4()); 
            // InternalSlideOMatic.g:1655:2: ( rule__Presentation__DateAssignment_4_4 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==80) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalSlideOMatic.g:1655:3: rule__Presentation__DateAssignment_4_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Presentation__DateAssignment_4_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPresentationAccess().getDateAssignment_4_4()); 

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
    // $ANTLR end "rule__Presentation__Group_4__4__Impl"


    // $ANTLR start "rule__Presentation__Group_4__5"
    // InternalSlideOMatic.g:1663:1: rule__Presentation__Group_4__5 : rule__Presentation__Group_4__5__Impl ;
    public final void rule__Presentation__Group_4__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1667:1: ( rule__Presentation__Group_4__5__Impl )
            // InternalSlideOMatic.g:1668:2: rule__Presentation__Group_4__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Presentation__Group_4__5__Impl();

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
    // $ANTLR end "rule__Presentation__Group_4__5"


    // $ANTLR start "rule__Presentation__Group_4__5__Impl"
    // InternalSlideOMatic.g:1674:1: rule__Presentation__Group_4__5__Impl : ( ')' ) ;
    public final void rule__Presentation__Group_4__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1678:1: ( ( ')' ) )
            // InternalSlideOMatic.g:1679:1: ( ')' )
            {
            // InternalSlideOMatic.g:1679:1: ( ')' )
            // InternalSlideOMatic.g:1680:2: ')'
            {
             before(grammarAccess.getPresentationAccess().getRightParenthesisKeyword_4_5()); 
            match(input,74,FOLLOW_2); 
             after(grammarAccess.getPresentationAccess().getRightParenthesisKeyword_4_5()); 

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
    // $ANTLR end "rule__Presentation__Group_4__5__Impl"


    // $ANTLR start "rule__Theme__Group__0"
    // InternalSlideOMatic.g:1690:1: rule__Theme__Group__0 : rule__Theme__Group__0__Impl rule__Theme__Group__1 ;
    public final void rule__Theme__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1694:1: ( rule__Theme__Group__0__Impl rule__Theme__Group__1 )
            // InternalSlideOMatic.g:1695:2: rule__Theme__Group__0__Impl rule__Theme__Group__1
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
    // InternalSlideOMatic.g:1702:1: rule__Theme__Group__0__Impl : ( 'theme' ) ;
    public final void rule__Theme__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1706:1: ( ( 'theme' ) )
            // InternalSlideOMatic.g:1707:1: ( 'theme' )
            {
            // InternalSlideOMatic.g:1707:1: ( 'theme' )
            // InternalSlideOMatic.g:1708:2: 'theme'
            {
             before(grammarAccess.getThemeAccess().getThemeKeyword_0()); 
            match(input,75,FOLLOW_2); 
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
    // InternalSlideOMatic.g:1717:1: rule__Theme__Group__1 : rule__Theme__Group__1__Impl rule__Theme__Group__2 ;
    public final void rule__Theme__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1721:1: ( rule__Theme__Group__1__Impl rule__Theme__Group__2 )
            // InternalSlideOMatic.g:1722:2: rule__Theme__Group__1__Impl rule__Theme__Group__2
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
    // InternalSlideOMatic.g:1729:1: rule__Theme__Group__1__Impl : ( ( rule__Theme__ThemeAssignment_1 ) ) ;
    public final void rule__Theme__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1733:1: ( ( ( rule__Theme__ThemeAssignment_1 ) ) )
            // InternalSlideOMatic.g:1734:1: ( ( rule__Theme__ThemeAssignment_1 ) )
            {
            // InternalSlideOMatic.g:1734:1: ( ( rule__Theme__ThemeAssignment_1 ) )
            // InternalSlideOMatic.g:1735:2: ( rule__Theme__ThemeAssignment_1 )
            {
             before(grammarAccess.getThemeAccess().getThemeAssignment_1()); 
            // InternalSlideOMatic.g:1736:2: ( rule__Theme__ThemeAssignment_1 )
            // InternalSlideOMatic.g:1736:3: rule__Theme__ThemeAssignment_1
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
    // InternalSlideOMatic.g:1744:1: rule__Theme__Group__2 : rule__Theme__Group__2__Impl ;
    public final void rule__Theme__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1748:1: ( rule__Theme__Group__2__Impl )
            // InternalSlideOMatic.g:1749:2: rule__Theme__Group__2__Impl
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
    // InternalSlideOMatic.g:1755:1: rule__Theme__Group__2__Impl : ( ( rule__Theme__Group_2__0 )? ) ;
    public final void rule__Theme__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1759:1: ( ( ( rule__Theme__Group_2__0 )? ) )
            // InternalSlideOMatic.g:1760:1: ( ( rule__Theme__Group_2__0 )? )
            {
            // InternalSlideOMatic.g:1760:1: ( ( rule__Theme__Group_2__0 )? )
            // InternalSlideOMatic.g:1761:2: ( rule__Theme__Group_2__0 )?
            {
             before(grammarAccess.getThemeAccess().getGroup_2()); 
            // InternalSlideOMatic.g:1762:2: ( rule__Theme__Group_2__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==76) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalSlideOMatic.g:1762:3: rule__Theme__Group_2__0
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
    // InternalSlideOMatic.g:1771:1: rule__Theme__Group_2__0 : rule__Theme__Group_2__0__Impl rule__Theme__Group_2__1 ;
    public final void rule__Theme__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1775:1: ( rule__Theme__Group_2__0__Impl rule__Theme__Group_2__1 )
            // InternalSlideOMatic.g:1776:2: rule__Theme__Group_2__0__Impl rule__Theme__Group_2__1
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
    // InternalSlideOMatic.g:1783:1: rule__Theme__Group_2__0__Impl : ( 'color' ) ;
    public final void rule__Theme__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1787:1: ( ( 'color' ) )
            // InternalSlideOMatic.g:1788:1: ( 'color' )
            {
            // InternalSlideOMatic.g:1788:1: ( 'color' )
            // InternalSlideOMatic.g:1789:2: 'color'
            {
             before(grammarAccess.getThemeAccess().getColorKeyword_2_0()); 
            match(input,76,FOLLOW_2); 
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
    // InternalSlideOMatic.g:1798:1: rule__Theme__Group_2__1 : rule__Theme__Group_2__1__Impl ;
    public final void rule__Theme__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1802:1: ( rule__Theme__Group_2__1__Impl )
            // InternalSlideOMatic.g:1803:2: rule__Theme__Group_2__1__Impl
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
    // InternalSlideOMatic.g:1809:1: rule__Theme__Group_2__1__Impl : ( ( rule__Theme__ThemeColorAssignment_2_1 ) ) ;
    public final void rule__Theme__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1813:1: ( ( ( rule__Theme__ThemeColorAssignment_2_1 ) ) )
            // InternalSlideOMatic.g:1814:1: ( ( rule__Theme__ThemeColorAssignment_2_1 ) )
            {
            // InternalSlideOMatic.g:1814:1: ( ( rule__Theme__ThemeColorAssignment_2_1 ) )
            // InternalSlideOMatic.g:1815:2: ( rule__Theme__ThemeColorAssignment_2_1 )
            {
             before(grammarAccess.getThemeAccess().getThemeColorAssignment_2_1()); 
            // InternalSlideOMatic.g:1816:2: ( rule__Theme__ThemeColorAssignment_2_1 )
            // InternalSlideOMatic.g:1816:3: rule__Theme__ThemeColorAssignment_2_1
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
    // InternalSlideOMatic.g:1825:1: rule__Authors__Group__0 : rule__Authors__Group__0__Impl rule__Authors__Group__1 ;
    public final void rule__Authors__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1829:1: ( rule__Authors__Group__0__Impl rule__Authors__Group__1 )
            // InternalSlideOMatic.g:1830:2: rule__Authors__Group__0__Impl rule__Authors__Group__1
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
    // InternalSlideOMatic.g:1837:1: rule__Authors__Group__0__Impl : ( 'author' ) ;
    public final void rule__Authors__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1841:1: ( ( 'author' ) )
            // InternalSlideOMatic.g:1842:1: ( 'author' )
            {
            // InternalSlideOMatic.g:1842:1: ( 'author' )
            // InternalSlideOMatic.g:1843:2: 'author'
            {
             before(grammarAccess.getAuthorsAccess().getAuthorKeyword_0()); 
            match(input,77,FOLLOW_2); 
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
    // InternalSlideOMatic.g:1852:1: rule__Authors__Group__1 : rule__Authors__Group__1__Impl rule__Authors__Group__2 ;
    public final void rule__Authors__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1856:1: ( rule__Authors__Group__1__Impl rule__Authors__Group__2 )
            // InternalSlideOMatic.g:1857:2: rule__Authors__Group__1__Impl rule__Authors__Group__2
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
    // InternalSlideOMatic.g:1864:1: rule__Authors__Group__1__Impl : ( ( rule__Authors__NamesAssignment_1 ) ) ;
    public final void rule__Authors__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1868:1: ( ( ( rule__Authors__NamesAssignment_1 ) ) )
            // InternalSlideOMatic.g:1869:1: ( ( rule__Authors__NamesAssignment_1 ) )
            {
            // InternalSlideOMatic.g:1869:1: ( ( rule__Authors__NamesAssignment_1 ) )
            // InternalSlideOMatic.g:1870:2: ( rule__Authors__NamesAssignment_1 )
            {
             before(grammarAccess.getAuthorsAccess().getNamesAssignment_1()); 
            // InternalSlideOMatic.g:1871:2: ( rule__Authors__NamesAssignment_1 )
            // InternalSlideOMatic.g:1871:3: rule__Authors__NamesAssignment_1
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
    // InternalSlideOMatic.g:1879:1: rule__Authors__Group__2 : rule__Authors__Group__2__Impl ;
    public final void rule__Authors__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1883:1: ( rule__Authors__Group__2__Impl )
            // InternalSlideOMatic.g:1884:2: rule__Authors__Group__2__Impl
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
    // InternalSlideOMatic.g:1890:1: rule__Authors__Group__2__Impl : ( ( rule__Authors__Group_2__0 )* ) ;
    public final void rule__Authors__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1894:1: ( ( ( rule__Authors__Group_2__0 )* ) )
            // InternalSlideOMatic.g:1895:1: ( ( rule__Authors__Group_2__0 )* )
            {
            // InternalSlideOMatic.g:1895:1: ( ( rule__Authors__Group_2__0 )* )
            // InternalSlideOMatic.g:1896:2: ( rule__Authors__Group_2__0 )*
            {
             before(grammarAccess.getAuthorsAccess().getGroup_2()); 
            // InternalSlideOMatic.g:1897:2: ( rule__Authors__Group_2__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==78) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalSlideOMatic.g:1897:3: rule__Authors__Group_2__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Authors__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // InternalSlideOMatic.g:1906:1: rule__Authors__Group_2__0 : rule__Authors__Group_2__0__Impl rule__Authors__Group_2__1 ;
    public final void rule__Authors__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1910:1: ( rule__Authors__Group_2__0__Impl rule__Authors__Group_2__1 )
            // InternalSlideOMatic.g:1911:2: rule__Authors__Group_2__0__Impl rule__Authors__Group_2__1
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
    // InternalSlideOMatic.g:1918:1: rule__Authors__Group_2__0__Impl : ( ',' ) ;
    public final void rule__Authors__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1922:1: ( ( ',' ) )
            // InternalSlideOMatic.g:1923:1: ( ',' )
            {
            // InternalSlideOMatic.g:1923:1: ( ',' )
            // InternalSlideOMatic.g:1924:2: ','
            {
             before(grammarAccess.getAuthorsAccess().getCommaKeyword_2_0()); 
            match(input,78,FOLLOW_2); 
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
    // InternalSlideOMatic.g:1933:1: rule__Authors__Group_2__1 : rule__Authors__Group_2__1__Impl ;
    public final void rule__Authors__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1937:1: ( rule__Authors__Group_2__1__Impl )
            // InternalSlideOMatic.g:1938:2: rule__Authors__Group_2__1__Impl
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
    // InternalSlideOMatic.g:1944:1: rule__Authors__Group_2__1__Impl : ( ( rule__Authors__NamesAssignment_2_1 ) ) ;
    public final void rule__Authors__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1948:1: ( ( ( rule__Authors__NamesAssignment_2_1 ) ) )
            // InternalSlideOMatic.g:1949:1: ( ( rule__Authors__NamesAssignment_2_1 ) )
            {
            // InternalSlideOMatic.g:1949:1: ( ( rule__Authors__NamesAssignment_2_1 ) )
            // InternalSlideOMatic.g:1950:2: ( rule__Authors__NamesAssignment_2_1 )
            {
             before(grammarAccess.getAuthorsAccess().getNamesAssignment_2_1()); 
            // InternalSlideOMatic.g:1951:2: ( rule__Authors__NamesAssignment_2_1 )
            // InternalSlideOMatic.g:1951:3: rule__Authors__NamesAssignment_2_1
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
    // InternalSlideOMatic.g:1960:1: rule__Institute__Group__0 : rule__Institute__Group__0__Impl rule__Institute__Group__1 ;
    public final void rule__Institute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1964:1: ( rule__Institute__Group__0__Impl rule__Institute__Group__1 )
            // InternalSlideOMatic.g:1965:2: rule__Institute__Group__0__Impl rule__Institute__Group__1
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
    // InternalSlideOMatic.g:1972:1: rule__Institute__Group__0__Impl : ( 'institute' ) ;
    public final void rule__Institute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1976:1: ( ( 'institute' ) )
            // InternalSlideOMatic.g:1977:1: ( 'institute' )
            {
            // InternalSlideOMatic.g:1977:1: ( 'institute' )
            // InternalSlideOMatic.g:1978:2: 'institute'
            {
             before(grammarAccess.getInstituteAccess().getInstituteKeyword_0()); 
            match(input,79,FOLLOW_2); 
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
    // InternalSlideOMatic.g:1987:1: rule__Institute__Group__1 : rule__Institute__Group__1__Impl ;
    public final void rule__Institute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1991:1: ( rule__Institute__Group__1__Impl )
            // InternalSlideOMatic.g:1992:2: rule__Institute__Group__1__Impl
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
    // InternalSlideOMatic.g:1998:1: rule__Institute__Group__1__Impl : ( ( rule__Institute__NameAssignment_1 ) ) ;
    public final void rule__Institute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2002:1: ( ( ( rule__Institute__NameAssignment_1 ) ) )
            // InternalSlideOMatic.g:2003:1: ( ( rule__Institute__NameAssignment_1 ) )
            {
            // InternalSlideOMatic.g:2003:1: ( ( rule__Institute__NameAssignment_1 ) )
            // InternalSlideOMatic.g:2004:2: ( rule__Institute__NameAssignment_1 )
            {
             before(grammarAccess.getInstituteAccess().getNameAssignment_1()); 
            // InternalSlideOMatic.g:2005:2: ( rule__Institute__NameAssignment_1 )
            // InternalSlideOMatic.g:2005:3: rule__Institute__NameAssignment_1
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
    // InternalSlideOMatic.g:2014:1: rule__Date__Group__0 : rule__Date__Group__0__Impl rule__Date__Group__1 ;
    public final void rule__Date__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2018:1: ( rule__Date__Group__0__Impl rule__Date__Group__1 )
            // InternalSlideOMatic.g:2019:2: rule__Date__Group__0__Impl rule__Date__Group__1
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
    // InternalSlideOMatic.g:2026:1: rule__Date__Group__0__Impl : ( 'date' ) ;
    public final void rule__Date__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2030:1: ( ( 'date' ) )
            // InternalSlideOMatic.g:2031:1: ( 'date' )
            {
            // InternalSlideOMatic.g:2031:1: ( 'date' )
            // InternalSlideOMatic.g:2032:2: 'date'
            {
             before(grammarAccess.getDateAccess().getDateKeyword_0()); 
            match(input,80,FOLLOW_2); 
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
    // InternalSlideOMatic.g:2041:1: rule__Date__Group__1 : rule__Date__Group__1__Impl ;
    public final void rule__Date__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2045:1: ( rule__Date__Group__1__Impl )
            // InternalSlideOMatic.g:2046:2: rule__Date__Group__1__Impl
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
    // InternalSlideOMatic.g:2052:1: rule__Date__Group__1__Impl : ( ( rule__Date__DateAssignment_1 ) ) ;
    public final void rule__Date__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2056:1: ( ( ( rule__Date__DateAssignment_1 ) ) )
            // InternalSlideOMatic.g:2057:1: ( ( rule__Date__DateAssignment_1 ) )
            {
            // InternalSlideOMatic.g:2057:1: ( ( rule__Date__DateAssignment_1 ) )
            // InternalSlideOMatic.g:2058:2: ( rule__Date__DateAssignment_1 )
            {
             before(grammarAccess.getDateAccess().getDateAssignment_1()); 
            // InternalSlideOMatic.g:2059:2: ( rule__Date__DateAssignment_1 )
            // InternalSlideOMatic.g:2059:3: rule__Date__DateAssignment_1
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
    // InternalSlideOMatic.g:2068:1: rule__Slide__Group__0 : rule__Slide__Group__0__Impl rule__Slide__Group__1 ;
    public final void rule__Slide__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2072:1: ( rule__Slide__Group__0__Impl rule__Slide__Group__1 )
            // InternalSlideOMatic.g:2073:2: rule__Slide__Group__0__Impl rule__Slide__Group__1
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
    // InternalSlideOMatic.g:2080:1: rule__Slide__Group__0__Impl : ( 'slide' ) ;
    public final void rule__Slide__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2084:1: ( ( 'slide' ) )
            // InternalSlideOMatic.g:2085:1: ( 'slide' )
            {
            // InternalSlideOMatic.g:2085:1: ( 'slide' )
            // InternalSlideOMatic.g:2086:2: 'slide'
            {
             before(grammarAccess.getSlideAccess().getSlideKeyword_0()); 
            match(input,81,FOLLOW_2); 
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
    // InternalSlideOMatic.g:2095:1: rule__Slide__Group__1 : rule__Slide__Group__1__Impl rule__Slide__Group__2 ;
    public final void rule__Slide__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2099:1: ( rule__Slide__Group__1__Impl rule__Slide__Group__2 )
            // InternalSlideOMatic.g:2100:2: rule__Slide__Group__1__Impl rule__Slide__Group__2
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
    // InternalSlideOMatic.g:2107:1: rule__Slide__Group__1__Impl : ( ( rule__Slide__Alternatives_1 )? ) ;
    public final void rule__Slide__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2111:1: ( ( ( rule__Slide__Alternatives_1 )? ) )
            // InternalSlideOMatic.g:2112:1: ( ( rule__Slide__Alternatives_1 )? )
            {
            // InternalSlideOMatic.g:2112:1: ( ( rule__Slide__Alternatives_1 )? )
            // InternalSlideOMatic.g:2113:2: ( rule__Slide__Alternatives_1 )?
            {
             before(grammarAccess.getSlideAccess().getAlternatives_1()); 
            // InternalSlideOMatic.g:2114:2: ( rule__Slide__Alternatives_1 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_STRING||(LA24_0>=82 && LA24_0<=84)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalSlideOMatic.g:2114:3: rule__Slide__Alternatives_1
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
    // InternalSlideOMatic.g:2122:1: rule__Slide__Group__2 : rule__Slide__Group__2__Impl rule__Slide__Group__3 ;
    public final void rule__Slide__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2126:1: ( rule__Slide__Group__2__Impl rule__Slide__Group__3 )
            // InternalSlideOMatic.g:2127:2: rule__Slide__Group__2__Impl rule__Slide__Group__3
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
    // InternalSlideOMatic.g:2134:1: rule__Slide__Group__2__Impl : ( '{' ) ;
    public final void rule__Slide__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2138:1: ( ( '{' ) )
            // InternalSlideOMatic.g:2139:1: ( '{' )
            {
            // InternalSlideOMatic.g:2139:1: ( '{' )
            // InternalSlideOMatic.g:2140:2: '{'
            {
             before(grammarAccess.getSlideAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,71,FOLLOW_2); 
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
    // InternalSlideOMatic.g:2149:1: rule__Slide__Group__3 : rule__Slide__Group__3__Impl rule__Slide__Group__4 ;
    public final void rule__Slide__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2153:1: ( rule__Slide__Group__3__Impl rule__Slide__Group__4 )
            // InternalSlideOMatic.g:2154:2: rule__Slide__Group__3__Impl rule__Slide__Group__4
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
    // InternalSlideOMatic.g:2161:1: rule__Slide__Group__3__Impl : ( ( ( rule__Slide__ContentsAssignment_3 ) ) ( ( rule__Slide__ContentsAssignment_3 )* ) ) ;
    public final void rule__Slide__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2165:1: ( ( ( ( rule__Slide__ContentsAssignment_3 ) ) ( ( rule__Slide__ContentsAssignment_3 )* ) ) )
            // InternalSlideOMatic.g:2166:1: ( ( ( rule__Slide__ContentsAssignment_3 ) ) ( ( rule__Slide__ContentsAssignment_3 )* ) )
            {
            // InternalSlideOMatic.g:2166:1: ( ( ( rule__Slide__ContentsAssignment_3 ) ) ( ( rule__Slide__ContentsAssignment_3 )* ) )
            // InternalSlideOMatic.g:2167:2: ( ( rule__Slide__ContentsAssignment_3 ) ) ( ( rule__Slide__ContentsAssignment_3 )* )
            {
            // InternalSlideOMatic.g:2167:2: ( ( rule__Slide__ContentsAssignment_3 ) )
            // InternalSlideOMatic.g:2168:3: ( rule__Slide__ContentsAssignment_3 )
            {
             before(grammarAccess.getSlideAccess().getContentsAssignment_3()); 
            // InternalSlideOMatic.g:2169:3: ( rule__Slide__ContentsAssignment_3 )
            // InternalSlideOMatic.g:2169:4: rule__Slide__ContentsAssignment_3
            {
            pushFollow(FOLLOW_16);
            rule__Slide__ContentsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSlideAccess().getContentsAssignment_3()); 

            }

            // InternalSlideOMatic.g:2172:2: ( ( rule__Slide__ContentsAssignment_3 )* )
            // InternalSlideOMatic.g:2173:3: ( rule__Slide__ContentsAssignment_3 )*
            {
             before(grammarAccess.getSlideAccess().getContentsAssignment_3()); 
            // InternalSlideOMatic.g:2174:3: ( rule__Slide__ContentsAssignment_3 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=85 && LA25_0<=89)||LA25_0==91||LA25_0==94||LA25_0==97) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalSlideOMatic.g:2174:4: rule__Slide__ContentsAssignment_3
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__Slide__ContentsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // InternalSlideOMatic.g:2183:1: rule__Slide__Group__4 : rule__Slide__Group__4__Impl ;
    public final void rule__Slide__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2187:1: ( rule__Slide__Group__4__Impl )
            // InternalSlideOMatic.g:2188:2: rule__Slide__Group__4__Impl
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
    // InternalSlideOMatic.g:2194:1: rule__Slide__Group__4__Impl : ( '}' ) ;
    public final void rule__Slide__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2198:1: ( ( '}' ) )
            // InternalSlideOMatic.g:2199:1: ( '}' )
            {
            // InternalSlideOMatic.g:2199:1: ( '}' )
            // InternalSlideOMatic.g:2200:2: '}'
            {
             before(grammarAccess.getSlideAccess().getRightCurlyBracketKeyword_4()); 
            match(input,72,FOLLOW_2); 
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
    // InternalSlideOMatic.g:2210:1: rule__Slide__Group_1_0__0 : rule__Slide__Group_1_0__0__Impl rule__Slide__Group_1_0__1 ;
    public final void rule__Slide__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2214:1: ( rule__Slide__Group_1_0__0__Impl rule__Slide__Group_1_0__1 )
            // InternalSlideOMatic.g:2215:2: rule__Slide__Group_1_0__0__Impl rule__Slide__Group_1_0__1
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
    // InternalSlideOMatic.g:2222:1: rule__Slide__Group_1_0__0__Impl : ( ( rule__Slide__SecAssignment_1_0_0 ) ) ;
    public final void rule__Slide__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2226:1: ( ( ( rule__Slide__SecAssignment_1_0_0 ) ) )
            // InternalSlideOMatic.g:2227:1: ( ( rule__Slide__SecAssignment_1_0_0 ) )
            {
            // InternalSlideOMatic.g:2227:1: ( ( rule__Slide__SecAssignment_1_0_0 ) )
            // InternalSlideOMatic.g:2228:2: ( rule__Slide__SecAssignment_1_0_0 )
            {
             before(grammarAccess.getSlideAccess().getSecAssignment_1_0_0()); 
            // InternalSlideOMatic.g:2229:2: ( rule__Slide__SecAssignment_1_0_0 )
            // InternalSlideOMatic.g:2229:3: rule__Slide__SecAssignment_1_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Slide__SecAssignment_1_0_0();

            state._fsp--;


            }

             after(grammarAccess.getSlideAccess().getSecAssignment_1_0_0()); 

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
    // InternalSlideOMatic.g:2237:1: rule__Slide__Group_1_0__1 : rule__Slide__Group_1_0__1__Impl ;
    public final void rule__Slide__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2241:1: ( rule__Slide__Group_1_0__1__Impl )
            // InternalSlideOMatic.g:2242:2: rule__Slide__Group_1_0__1__Impl
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
    // InternalSlideOMatic.g:2248:1: rule__Slide__Group_1_0__1__Impl : ( ( rule__Slide__NameAssignment_1_0_1 ) ) ;
    public final void rule__Slide__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2252:1: ( ( ( rule__Slide__NameAssignment_1_0_1 ) ) )
            // InternalSlideOMatic.g:2253:1: ( ( rule__Slide__NameAssignment_1_0_1 ) )
            {
            // InternalSlideOMatic.g:2253:1: ( ( rule__Slide__NameAssignment_1_0_1 ) )
            // InternalSlideOMatic.g:2254:2: ( rule__Slide__NameAssignment_1_0_1 )
            {
             before(grammarAccess.getSlideAccess().getNameAssignment_1_0_1()); 
            // InternalSlideOMatic.g:2255:2: ( rule__Slide__NameAssignment_1_0_1 )
            // InternalSlideOMatic.g:2255:3: rule__Slide__NameAssignment_1_0_1
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
    // InternalSlideOMatic.g:2264:1: rule__Section__Group_0__0 : rule__Section__Group_0__0__Impl rule__Section__Group_0__1 ;
    public final void rule__Section__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2268:1: ( rule__Section__Group_0__0__Impl rule__Section__Group_0__1 )
            // InternalSlideOMatic.g:2269:2: rule__Section__Group_0__0__Impl rule__Section__Group_0__1
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
    // InternalSlideOMatic.g:2276:1: rule__Section__Group_0__0__Impl : ( () ) ;
    public final void rule__Section__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2280:1: ( ( () ) )
            // InternalSlideOMatic.g:2281:1: ( () )
            {
            // InternalSlideOMatic.g:2281:1: ( () )
            // InternalSlideOMatic.g:2282:2: ()
            {
             before(grammarAccess.getSectionAccess().getSecAction_0_0()); 
            // InternalSlideOMatic.g:2283:2: ()
            // InternalSlideOMatic.g:2283:3: 
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
    // InternalSlideOMatic.g:2291:1: rule__Section__Group_0__1 : rule__Section__Group_0__1__Impl ;
    public final void rule__Section__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2295:1: ( rule__Section__Group_0__1__Impl )
            // InternalSlideOMatic.g:2296:2: rule__Section__Group_0__1__Impl
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
    // InternalSlideOMatic.g:2302:1: rule__Section__Group_0__1__Impl : ( '*' ) ;
    public final void rule__Section__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2306:1: ( ( '*' ) )
            // InternalSlideOMatic.g:2307:1: ( '*' )
            {
            // InternalSlideOMatic.g:2307:1: ( '*' )
            // InternalSlideOMatic.g:2308:2: '*'
            {
             before(grammarAccess.getSectionAccess().getAsteriskKeyword_0_1()); 
            match(input,82,FOLLOW_2); 
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
    // InternalSlideOMatic.g:2318:1: rule__Section__Group_1__0 : rule__Section__Group_1__0__Impl rule__Section__Group_1__1 ;
    public final void rule__Section__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2322:1: ( rule__Section__Group_1__0__Impl rule__Section__Group_1__1 )
            // InternalSlideOMatic.g:2323:2: rule__Section__Group_1__0__Impl rule__Section__Group_1__1
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
    // InternalSlideOMatic.g:2330:1: rule__Section__Group_1__0__Impl : ( () ) ;
    public final void rule__Section__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2334:1: ( ( () ) )
            // InternalSlideOMatic.g:2335:1: ( () )
            {
            // InternalSlideOMatic.g:2335:1: ( () )
            // InternalSlideOMatic.g:2336:2: ()
            {
             before(grammarAccess.getSectionAccess().getSubSecAction_1_0()); 
            // InternalSlideOMatic.g:2337:2: ()
            // InternalSlideOMatic.g:2337:3: 
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
    // InternalSlideOMatic.g:2345:1: rule__Section__Group_1__1 : rule__Section__Group_1__1__Impl ;
    public final void rule__Section__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2349:1: ( rule__Section__Group_1__1__Impl )
            // InternalSlideOMatic.g:2350:2: rule__Section__Group_1__1__Impl
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
    // InternalSlideOMatic.g:2356:1: rule__Section__Group_1__1__Impl : ( '**' ) ;
    public final void rule__Section__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2360:1: ( ( '**' ) )
            // InternalSlideOMatic.g:2361:1: ( '**' )
            {
            // InternalSlideOMatic.g:2361:1: ( '**' )
            // InternalSlideOMatic.g:2362:2: '**'
            {
             before(grammarAccess.getSectionAccess().getAsteriskAsteriskKeyword_1_1()); 
            match(input,83,FOLLOW_2); 
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
    // InternalSlideOMatic.g:2372:1: rule__Section__Group_2__0 : rule__Section__Group_2__0__Impl rule__Section__Group_2__1 ;
    public final void rule__Section__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2376:1: ( rule__Section__Group_2__0__Impl rule__Section__Group_2__1 )
            // InternalSlideOMatic.g:2377:2: rule__Section__Group_2__0__Impl rule__Section__Group_2__1
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
    // InternalSlideOMatic.g:2384:1: rule__Section__Group_2__0__Impl : ( () ) ;
    public final void rule__Section__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2388:1: ( ( () ) )
            // InternalSlideOMatic.g:2389:1: ( () )
            {
            // InternalSlideOMatic.g:2389:1: ( () )
            // InternalSlideOMatic.g:2390:2: ()
            {
             before(grammarAccess.getSectionAccess().getSubSubSecAction_2_0()); 
            // InternalSlideOMatic.g:2391:2: ()
            // InternalSlideOMatic.g:2391:3: 
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
    // InternalSlideOMatic.g:2399:1: rule__Section__Group_2__1 : rule__Section__Group_2__1__Impl ;
    public final void rule__Section__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2403:1: ( rule__Section__Group_2__1__Impl )
            // InternalSlideOMatic.g:2404:2: rule__Section__Group_2__1__Impl
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
    // InternalSlideOMatic.g:2410:1: rule__Section__Group_2__1__Impl : ( '***' ) ;
    public final void rule__Section__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2414:1: ( ( '***' ) )
            // InternalSlideOMatic.g:2415:1: ( '***' )
            {
            // InternalSlideOMatic.g:2415:1: ( '***' )
            // InternalSlideOMatic.g:2416:2: '***'
            {
             before(grammarAccess.getSectionAccess().getAsteriskAsteriskAsteriskKeyword_2_1()); 
            match(input,84,FOLLOW_2); 
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
    // InternalSlideOMatic.g:2426:1: rule__Content__Group_0__0 : rule__Content__Group_0__0__Impl rule__Content__Group_0__1 ;
    public final void rule__Content__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2430:1: ( rule__Content__Group_0__0__Impl rule__Content__Group_0__1 )
            // InternalSlideOMatic.g:2431:2: rule__Content__Group_0__0__Impl rule__Content__Group_0__1
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
    // InternalSlideOMatic.g:2438:1: rule__Content__Group_0__0__Impl : ( () ) ;
    public final void rule__Content__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2442:1: ( ( () ) )
            // InternalSlideOMatic.g:2443:1: ( () )
            {
            // InternalSlideOMatic.g:2443:1: ( () )
            // InternalSlideOMatic.g:2444:2: ()
            {
             before(grammarAccess.getContentAccess().getTOCAction_0_0()); 
            // InternalSlideOMatic.g:2445:2: ()
            // InternalSlideOMatic.g:2445:3: 
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
    // InternalSlideOMatic.g:2453:1: rule__Content__Group_0__1 : rule__Content__Group_0__1__Impl ;
    public final void rule__Content__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2457:1: ( rule__Content__Group_0__1__Impl )
            // InternalSlideOMatic.g:2458:2: rule__Content__Group_0__1__Impl
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
    // InternalSlideOMatic.g:2464:1: rule__Content__Group_0__1__Impl : ( 'ToC' ) ;
    public final void rule__Content__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2468:1: ( ( 'ToC' ) )
            // InternalSlideOMatic.g:2469:1: ( 'ToC' )
            {
            // InternalSlideOMatic.g:2469:1: ( 'ToC' )
            // InternalSlideOMatic.g:2470:2: 'ToC'
            {
             before(grammarAccess.getContentAccess().getToCKeyword_0_1()); 
            match(input,85,FOLLOW_2); 
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


    // $ANTLR start "rule__Text__Group__0"
    // InternalSlideOMatic.g:2480:1: rule__Text__Group__0 : rule__Text__Group__0__Impl rule__Text__Group__1 ;
    public final void rule__Text__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2484:1: ( rule__Text__Group__0__Impl rule__Text__Group__1 )
            // InternalSlideOMatic.g:2485:2: rule__Text__Group__0__Impl rule__Text__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Text__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Text__Group__1();

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
    // $ANTLR end "rule__Text__Group__0"


    // $ANTLR start "rule__Text__Group__0__Impl"
    // InternalSlideOMatic.g:2492:1: rule__Text__Group__0__Impl : ( '>' ) ;
    public final void rule__Text__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2496:1: ( ( '>' ) )
            // InternalSlideOMatic.g:2497:1: ( '>' )
            {
            // InternalSlideOMatic.g:2497:1: ( '>' )
            // InternalSlideOMatic.g:2498:2: '>'
            {
             before(grammarAccess.getTextAccess().getGreaterThanSignKeyword_0()); 
            match(input,86,FOLLOW_2); 
             after(grammarAccess.getTextAccess().getGreaterThanSignKeyword_0()); 

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
    // $ANTLR end "rule__Text__Group__0__Impl"


    // $ANTLR start "rule__Text__Group__1"
    // InternalSlideOMatic.g:2507:1: rule__Text__Group__1 : rule__Text__Group__1__Impl rule__Text__Group__2 ;
    public final void rule__Text__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2511:1: ( rule__Text__Group__1__Impl rule__Text__Group__2 )
            // InternalSlideOMatic.g:2512:2: rule__Text__Group__1__Impl rule__Text__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__Text__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Text__Group__2();

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
    // $ANTLR end "rule__Text__Group__1"


    // $ANTLR start "rule__Text__Group__1__Impl"
    // InternalSlideOMatic.g:2519:1: rule__Text__Group__1__Impl : ( ( rule__Text__TextAssignment_1 ) ) ;
    public final void rule__Text__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2523:1: ( ( ( rule__Text__TextAssignment_1 ) ) )
            // InternalSlideOMatic.g:2524:1: ( ( rule__Text__TextAssignment_1 ) )
            {
            // InternalSlideOMatic.g:2524:1: ( ( rule__Text__TextAssignment_1 ) )
            // InternalSlideOMatic.g:2525:2: ( rule__Text__TextAssignment_1 )
            {
             before(grammarAccess.getTextAccess().getTextAssignment_1()); 
            // InternalSlideOMatic.g:2526:2: ( rule__Text__TextAssignment_1 )
            // InternalSlideOMatic.g:2526:3: rule__Text__TextAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Text__TextAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTextAccess().getTextAssignment_1()); 

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
    // $ANTLR end "rule__Text__Group__1__Impl"


    // $ANTLR start "rule__Text__Group__2"
    // InternalSlideOMatic.g:2534:1: rule__Text__Group__2 : rule__Text__Group__2__Impl ;
    public final void rule__Text__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2538:1: ( rule__Text__Group__2__Impl )
            // InternalSlideOMatic.g:2539:2: rule__Text__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Text__Group__2__Impl();

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
    // $ANTLR end "rule__Text__Group__2"


    // $ANTLR start "rule__Text__Group__2__Impl"
    // InternalSlideOMatic.g:2545:1: rule__Text__Group__2__Impl : ( ( rule__Text__ClickAssignment_2 )? ) ;
    public final void rule__Text__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2549:1: ( ( ( rule__Text__ClickAssignment_2 )? ) )
            // InternalSlideOMatic.g:2550:1: ( ( rule__Text__ClickAssignment_2 )? )
            {
            // InternalSlideOMatic.g:2550:1: ( ( rule__Text__ClickAssignment_2 )? )
            // InternalSlideOMatic.g:2551:2: ( rule__Text__ClickAssignment_2 )?
            {
             before(grammarAccess.getTextAccess().getClickAssignment_2()); 
            // InternalSlideOMatic.g:2552:2: ( rule__Text__ClickAssignment_2 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==11) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalSlideOMatic.g:2552:3: rule__Text__ClickAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Text__ClickAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTextAccess().getClickAssignment_2()); 

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
    // $ANTLR end "rule__Text__Group__2__Impl"


    // $ANTLR start "rule__Block__Group__0"
    // InternalSlideOMatic.g:2561:1: rule__Block__Group__0 : rule__Block__Group__0__Impl rule__Block__Group__1 ;
    public final void rule__Block__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2565:1: ( rule__Block__Group__0__Impl rule__Block__Group__1 )
            // InternalSlideOMatic.g:2566:2: rule__Block__Group__0__Impl rule__Block__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Block__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Block__Group__1();

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
    // $ANTLR end "rule__Block__Group__0"


    // $ANTLR start "rule__Block__Group__0__Impl"
    // InternalSlideOMatic.g:2573:1: rule__Block__Group__0__Impl : ( 'block' ) ;
    public final void rule__Block__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2577:1: ( ( 'block' ) )
            // InternalSlideOMatic.g:2578:1: ( 'block' )
            {
            // InternalSlideOMatic.g:2578:1: ( 'block' )
            // InternalSlideOMatic.g:2579:2: 'block'
            {
             before(grammarAccess.getBlockAccess().getBlockKeyword_0()); 
            match(input,87,FOLLOW_2); 
             after(grammarAccess.getBlockAccess().getBlockKeyword_0()); 

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
    // $ANTLR end "rule__Block__Group__0__Impl"


    // $ANTLR start "rule__Block__Group__1"
    // InternalSlideOMatic.g:2588:1: rule__Block__Group__1 : rule__Block__Group__1__Impl rule__Block__Group__2 ;
    public final void rule__Block__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2592:1: ( rule__Block__Group__1__Impl rule__Block__Group__2 )
            // InternalSlideOMatic.g:2593:2: rule__Block__Group__1__Impl rule__Block__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Block__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Block__Group__2();

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
    // $ANTLR end "rule__Block__Group__1"


    // $ANTLR start "rule__Block__Group__1__Impl"
    // InternalSlideOMatic.g:2600:1: rule__Block__Group__1__Impl : ( ( rule__Block__NameAssignment_1 )? ) ;
    public final void rule__Block__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2604:1: ( ( ( rule__Block__NameAssignment_1 )? ) )
            // InternalSlideOMatic.g:2605:1: ( ( rule__Block__NameAssignment_1 )? )
            {
            // InternalSlideOMatic.g:2605:1: ( ( rule__Block__NameAssignment_1 )? )
            // InternalSlideOMatic.g:2606:2: ( rule__Block__NameAssignment_1 )?
            {
             before(grammarAccess.getBlockAccess().getNameAssignment_1()); 
            // InternalSlideOMatic.g:2607:2: ( rule__Block__NameAssignment_1 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_STRING) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalSlideOMatic.g:2607:3: rule__Block__NameAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Block__NameAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBlockAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Block__Group__1__Impl"


    // $ANTLR start "rule__Block__Group__2"
    // InternalSlideOMatic.g:2615:1: rule__Block__Group__2 : rule__Block__Group__2__Impl rule__Block__Group__3 ;
    public final void rule__Block__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2619:1: ( rule__Block__Group__2__Impl rule__Block__Group__3 )
            // InternalSlideOMatic.g:2620:2: rule__Block__Group__2__Impl rule__Block__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__Block__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Block__Group__3();

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
    // $ANTLR end "rule__Block__Group__2"


    // $ANTLR start "rule__Block__Group__2__Impl"
    // InternalSlideOMatic.g:2627:1: rule__Block__Group__2__Impl : ( '{' ) ;
    public final void rule__Block__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2631:1: ( ( '{' ) )
            // InternalSlideOMatic.g:2632:1: ( '{' )
            {
            // InternalSlideOMatic.g:2632:1: ( '{' )
            // InternalSlideOMatic.g:2633:2: '{'
            {
             before(grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,71,FOLLOW_2); 
             after(grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Block__Group__2__Impl"


    // $ANTLR start "rule__Block__Group__3"
    // InternalSlideOMatic.g:2642:1: rule__Block__Group__3 : rule__Block__Group__3__Impl rule__Block__Group__4 ;
    public final void rule__Block__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2646:1: ( rule__Block__Group__3__Impl rule__Block__Group__4 )
            // InternalSlideOMatic.g:2647:2: rule__Block__Group__3__Impl rule__Block__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__Block__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Block__Group__4();

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
    // $ANTLR end "rule__Block__Group__3"


    // $ANTLR start "rule__Block__Group__3__Impl"
    // InternalSlideOMatic.g:2654:1: rule__Block__Group__3__Impl : ( ( rule__Block__ContentAssignment_3 ) ) ;
    public final void rule__Block__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2658:1: ( ( ( rule__Block__ContentAssignment_3 ) ) )
            // InternalSlideOMatic.g:2659:1: ( ( rule__Block__ContentAssignment_3 ) )
            {
            // InternalSlideOMatic.g:2659:1: ( ( rule__Block__ContentAssignment_3 ) )
            // InternalSlideOMatic.g:2660:2: ( rule__Block__ContentAssignment_3 )
            {
             before(grammarAccess.getBlockAccess().getContentAssignment_3()); 
            // InternalSlideOMatic.g:2661:2: ( rule__Block__ContentAssignment_3 )
            // InternalSlideOMatic.g:2661:3: rule__Block__ContentAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Block__ContentAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getBlockAccess().getContentAssignment_3()); 

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
    // $ANTLR end "rule__Block__Group__3__Impl"


    // $ANTLR start "rule__Block__Group__4"
    // InternalSlideOMatic.g:2669:1: rule__Block__Group__4 : rule__Block__Group__4__Impl rule__Block__Group__5 ;
    public final void rule__Block__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2673:1: ( rule__Block__Group__4__Impl rule__Block__Group__5 )
            // InternalSlideOMatic.g:2674:2: rule__Block__Group__4__Impl rule__Block__Group__5
            {
            pushFollow(FOLLOW_21);
            rule__Block__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Block__Group__5();

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
    // $ANTLR end "rule__Block__Group__4"


    // $ANTLR start "rule__Block__Group__4__Impl"
    // InternalSlideOMatic.g:2681:1: rule__Block__Group__4__Impl : ( '}' ) ;
    public final void rule__Block__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2685:1: ( ( '}' ) )
            // InternalSlideOMatic.g:2686:1: ( '}' )
            {
            // InternalSlideOMatic.g:2686:1: ( '}' )
            // InternalSlideOMatic.g:2687:2: '}'
            {
             before(grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_4()); 
            match(input,72,FOLLOW_2); 
             after(grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Block__Group__4__Impl"


    // $ANTLR start "rule__Block__Group__5"
    // InternalSlideOMatic.g:2696:1: rule__Block__Group__5 : rule__Block__Group__5__Impl ;
    public final void rule__Block__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2700:1: ( rule__Block__Group__5__Impl )
            // InternalSlideOMatic.g:2701:2: rule__Block__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Block__Group__5__Impl();

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
    // $ANTLR end "rule__Block__Group__5"


    // $ANTLR start "rule__Block__Group__5__Impl"
    // InternalSlideOMatic.g:2707:1: rule__Block__Group__5__Impl : ( ( rule__Block__ClickAssignment_5 )? ) ;
    public final void rule__Block__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2711:1: ( ( ( rule__Block__ClickAssignment_5 )? ) )
            // InternalSlideOMatic.g:2712:1: ( ( rule__Block__ClickAssignment_5 )? )
            {
            // InternalSlideOMatic.g:2712:1: ( ( rule__Block__ClickAssignment_5 )? )
            // InternalSlideOMatic.g:2713:2: ( rule__Block__ClickAssignment_5 )?
            {
             before(grammarAccess.getBlockAccess().getClickAssignment_5()); 
            // InternalSlideOMatic.g:2714:2: ( rule__Block__ClickAssignment_5 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==11) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalSlideOMatic.g:2714:3: rule__Block__ClickAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__Block__ClickAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBlockAccess().getClickAssignment_5()); 

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
    // $ANTLR end "rule__Block__Group__5__Impl"


    // $ANTLR start "rule__NumberedList__Group__0"
    // InternalSlideOMatic.g:2723:1: rule__NumberedList__Group__0 : rule__NumberedList__Group__0__Impl rule__NumberedList__Group__1 ;
    public final void rule__NumberedList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2727:1: ( rule__NumberedList__Group__0__Impl rule__NumberedList__Group__1 )
            // InternalSlideOMatic.g:2728:2: rule__NumberedList__Group__0__Impl rule__NumberedList__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__NumberedList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NumberedList__Group__1();

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
    // $ANTLR end "rule__NumberedList__Group__0"


    // $ANTLR start "rule__NumberedList__Group__0__Impl"
    // InternalSlideOMatic.g:2735:1: rule__NumberedList__Group__0__Impl : ( '#list' ) ;
    public final void rule__NumberedList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2739:1: ( ( '#list' ) )
            // InternalSlideOMatic.g:2740:1: ( '#list' )
            {
            // InternalSlideOMatic.g:2740:1: ( '#list' )
            // InternalSlideOMatic.g:2741:2: '#list'
            {
             before(grammarAccess.getNumberedListAccess().getListKeyword_0()); 
            match(input,88,FOLLOW_2); 
             after(grammarAccess.getNumberedListAccess().getListKeyword_0()); 

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
    // $ANTLR end "rule__NumberedList__Group__0__Impl"


    // $ANTLR start "rule__NumberedList__Group__1"
    // InternalSlideOMatic.g:2750:1: rule__NumberedList__Group__1 : rule__NumberedList__Group__1__Impl ;
    public final void rule__NumberedList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2754:1: ( rule__NumberedList__Group__1__Impl )
            // InternalSlideOMatic.g:2755:2: rule__NumberedList__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NumberedList__Group__1__Impl();

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
    // $ANTLR end "rule__NumberedList__Group__1"


    // $ANTLR start "rule__NumberedList__Group__1__Impl"
    // InternalSlideOMatic.g:2761:1: rule__NumberedList__Group__1__Impl : ( ( ( rule__NumberedList__ItemsAssignment_1 ) ) ( ( rule__NumberedList__ItemsAssignment_1 )* ) ) ;
    public final void rule__NumberedList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2765:1: ( ( ( ( rule__NumberedList__ItemsAssignment_1 ) ) ( ( rule__NumberedList__ItemsAssignment_1 )* ) ) )
            // InternalSlideOMatic.g:2766:1: ( ( ( rule__NumberedList__ItemsAssignment_1 ) ) ( ( rule__NumberedList__ItemsAssignment_1 )* ) )
            {
            // InternalSlideOMatic.g:2766:1: ( ( ( rule__NumberedList__ItemsAssignment_1 ) ) ( ( rule__NumberedList__ItemsAssignment_1 )* ) )
            // InternalSlideOMatic.g:2767:2: ( ( rule__NumberedList__ItemsAssignment_1 ) ) ( ( rule__NumberedList__ItemsAssignment_1 )* )
            {
            // InternalSlideOMatic.g:2767:2: ( ( rule__NumberedList__ItemsAssignment_1 ) )
            // InternalSlideOMatic.g:2768:3: ( rule__NumberedList__ItemsAssignment_1 )
            {
             before(grammarAccess.getNumberedListAccess().getItemsAssignment_1()); 
            // InternalSlideOMatic.g:2769:3: ( rule__NumberedList__ItemsAssignment_1 )
            // InternalSlideOMatic.g:2769:4: rule__NumberedList__ItemsAssignment_1
            {
            pushFollow(FOLLOW_24);
            rule__NumberedList__ItemsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNumberedListAccess().getItemsAssignment_1()); 

            }

            // InternalSlideOMatic.g:2772:2: ( ( rule__NumberedList__ItemsAssignment_1 )* )
            // InternalSlideOMatic.g:2773:3: ( rule__NumberedList__ItemsAssignment_1 )*
            {
             before(grammarAccess.getNumberedListAccess().getItemsAssignment_1()); 
            // InternalSlideOMatic.g:2774:3: ( rule__NumberedList__ItemsAssignment_1 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==90) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalSlideOMatic.g:2774:4: rule__NumberedList__ItemsAssignment_1
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__NumberedList__ItemsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getNumberedListAccess().getItemsAssignment_1()); 

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
    // $ANTLR end "rule__NumberedList__Group__1__Impl"


    // $ANTLR start "rule__UnNumberedList__Group__0"
    // InternalSlideOMatic.g:2784:1: rule__UnNumberedList__Group__0 : rule__UnNumberedList__Group__0__Impl rule__UnNumberedList__Group__1 ;
    public final void rule__UnNumberedList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2788:1: ( rule__UnNumberedList__Group__0__Impl rule__UnNumberedList__Group__1 )
            // InternalSlideOMatic.g:2789:2: rule__UnNumberedList__Group__0__Impl rule__UnNumberedList__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__UnNumberedList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnNumberedList__Group__1();

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
    // $ANTLR end "rule__UnNumberedList__Group__0"


    // $ANTLR start "rule__UnNumberedList__Group__0__Impl"
    // InternalSlideOMatic.g:2796:1: rule__UnNumberedList__Group__0__Impl : ( '&list' ) ;
    public final void rule__UnNumberedList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2800:1: ( ( '&list' ) )
            // InternalSlideOMatic.g:2801:1: ( '&list' )
            {
            // InternalSlideOMatic.g:2801:1: ( '&list' )
            // InternalSlideOMatic.g:2802:2: '&list'
            {
             before(grammarAccess.getUnNumberedListAccess().getListKeyword_0()); 
            match(input,89,FOLLOW_2); 
             after(grammarAccess.getUnNumberedListAccess().getListKeyword_0()); 

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
    // $ANTLR end "rule__UnNumberedList__Group__0__Impl"


    // $ANTLR start "rule__UnNumberedList__Group__1"
    // InternalSlideOMatic.g:2811:1: rule__UnNumberedList__Group__1 : rule__UnNumberedList__Group__1__Impl ;
    public final void rule__UnNumberedList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2815:1: ( rule__UnNumberedList__Group__1__Impl )
            // InternalSlideOMatic.g:2816:2: rule__UnNumberedList__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UnNumberedList__Group__1__Impl();

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
    // $ANTLR end "rule__UnNumberedList__Group__1"


    // $ANTLR start "rule__UnNumberedList__Group__1__Impl"
    // InternalSlideOMatic.g:2822:1: rule__UnNumberedList__Group__1__Impl : ( ( ( rule__UnNumberedList__ItemsAssignment_1 ) ) ( ( rule__UnNumberedList__ItemsAssignment_1 )* ) ) ;
    public final void rule__UnNumberedList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2826:1: ( ( ( ( rule__UnNumberedList__ItemsAssignment_1 ) ) ( ( rule__UnNumberedList__ItemsAssignment_1 )* ) ) )
            // InternalSlideOMatic.g:2827:1: ( ( ( rule__UnNumberedList__ItemsAssignment_1 ) ) ( ( rule__UnNumberedList__ItemsAssignment_1 )* ) )
            {
            // InternalSlideOMatic.g:2827:1: ( ( ( rule__UnNumberedList__ItemsAssignment_1 ) ) ( ( rule__UnNumberedList__ItemsAssignment_1 )* ) )
            // InternalSlideOMatic.g:2828:2: ( ( rule__UnNumberedList__ItemsAssignment_1 ) ) ( ( rule__UnNumberedList__ItemsAssignment_1 )* )
            {
            // InternalSlideOMatic.g:2828:2: ( ( rule__UnNumberedList__ItemsAssignment_1 ) )
            // InternalSlideOMatic.g:2829:3: ( rule__UnNumberedList__ItemsAssignment_1 )
            {
             before(grammarAccess.getUnNumberedListAccess().getItemsAssignment_1()); 
            // InternalSlideOMatic.g:2830:3: ( rule__UnNumberedList__ItemsAssignment_1 )
            // InternalSlideOMatic.g:2830:4: rule__UnNumberedList__ItemsAssignment_1
            {
            pushFollow(FOLLOW_24);
            rule__UnNumberedList__ItemsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getUnNumberedListAccess().getItemsAssignment_1()); 

            }

            // InternalSlideOMatic.g:2833:2: ( ( rule__UnNumberedList__ItemsAssignment_1 )* )
            // InternalSlideOMatic.g:2834:3: ( rule__UnNumberedList__ItemsAssignment_1 )*
            {
             before(grammarAccess.getUnNumberedListAccess().getItemsAssignment_1()); 
            // InternalSlideOMatic.g:2835:3: ( rule__UnNumberedList__ItemsAssignment_1 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==90) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalSlideOMatic.g:2835:4: rule__UnNumberedList__ItemsAssignment_1
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__UnNumberedList__ItemsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getUnNumberedListAccess().getItemsAssignment_1()); 

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
    // $ANTLR end "rule__UnNumberedList__Group__1__Impl"


    // $ANTLR start "rule__ListItem__Group__0"
    // InternalSlideOMatic.g:2845:1: rule__ListItem__Group__0 : rule__ListItem__Group__0__Impl rule__ListItem__Group__1 ;
    public final void rule__ListItem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2849:1: ( rule__ListItem__Group__0__Impl rule__ListItem__Group__1 )
            // InternalSlideOMatic.g:2850:2: rule__ListItem__Group__0__Impl rule__ListItem__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ListItem__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListItem__Group__1();

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
    // $ANTLR end "rule__ListItem__Group__0"


    // $ANTLR start "rule__ListItem__Group__0__Impl"
    // InternalSlideOMatic.g:2857:1: rule__ListItem__Group__0__Impl : ( '-' ) ;
    public final void rule__ListItem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2861:1: ( ( '-' ) )
            // InternalSlideOMatic.g:2862:1: ( '-' )
            {
            // InternalSlideOMatic.g:2862:1: ( '-' )
            // InternalSlideOMatic.g:2863:2: '-'
            {
             before(grammarAccess.getListItemAccess().getHyphenMinusKeyword_0()); 
            match(input,90,FOLLOW_2); 
             after(grammarAccess.getListItemAccess().getHyphenMinusKeyword_0()); 

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
    // $ANTLR end "rule__ListItem__Group__0__Impl"


    // $ANTLR start "rule__ListItem__Group__1"
    // InternalSlideOMatic.g:2872:1: rule__ListItem__Group__1 : rule__ListItem__Group__1__Impl rule__ListItem__Group__2 ;
    public final void rule__ListItem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2876:1: ( rule__ListItem__Group__1__Impl rule__ListItem__Group__2 )
            // InternalSlideOMatic.g:2877:2: rule__ListItem__Group__1__Impl rule__ListItem__Group__2
            {
            pushFollow(FOLLOW_25);
            rule__ListItem__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListItem__Group__2();

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
    // $ANTLR end "rule__ListItem__Group__1"


    // $ANTLR start "rule__ListItem__Group__1__Impl"
    // InternalSlideOMatic.g:2884:1: rule__ListItem__Group__1__Impl : ( ( rule__ListItem__ItemAssignment_1 ) ) ;
    public final void rule__ListItem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2888:1: ( ( ( rule__ListItem__ItemAssignment_1 ) ) )
            // InternalSlideOMatic.g:2889:1: ( ( rule__ListItem__ItemAssignment_1 ) )
            {
            // InternalSlideOMatic.g:2889:1: ( ( rule__ListItem__ItemAssignment_1 ) )
            // InternalSlideOMatic.g:2890:2: ( rule__ListItem__ItemAssignment_1 )
            {
             before(grammarAccess.getListItemAccess().getItemAssignment_1()); 
            // InternalSlideOMatic.g:2891:2: ( rule__ListItem__ItemAssignment_1 )
            // InternalSlideOMatic.g:2891:3: rule__ListItem__ItemAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ListItem__ItemAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getListItemAccess().getItemAssignment_1()); 

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
    // $ANTLR end "rule__ListItem__Group__1__Impl"


    // $ANTLR start "rule__ListItem__Group__2"
    // InternalSlideOMatic.g:2899:1: rule__ListItem__Group__2 : rule__ListItem__Group__2__Impl rule__ListItem__Group__3 ;
    public final void rule__ListItem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2903:1: ( rule__ListItem__Group__2__Impl rule__ListItem__Group__3 )
            // InternalSlideOMatic.g:2904:2: rule__ListItem__Group__2__Impl rule__ListItem__Group__3
            {
            pushFollow(FOLLOW_25);
            rule__ListItem__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListItem__Group__3();

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
    // $ANTLR end "rule__ListItem__Group__2"


    // $ANTLR start "rule__ListItem__Group__2__Impl"
    // InternalSlideOMatic.g:2911:1: rule__ListItem__Group__2__Impl : ( ( rule__ListItem__Group_2__0 )? ) ;
    public final void rule__ListItem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2915:1: ( ( ( rule__ListItem__Group_2__0 )? ) )
            // InternalSlideOMatic.g:2916:1: ( ( rule__ListItem__Group_2__0 )? )
            {
            // InternalSlideOMatic.g:2916:1: ( ( rule__ListItem__Group_2__0 )? )
            // InternalSlideOMatic.g:2917:2: ( rule__ListItem__Group_2__0 )?
            {
             before(grammarAccess.getListItemAccess().getGroup_2()); 
            // InternalSlideOMatic.g:2918:2: ( rule__ListItem__Group_2__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==73) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalSlideOMatic.g:2918:3: rule__ListItem__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ListItem__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getListItemAccess().getGroup_2()); 

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
    // $ANTLR end "rule__ListItem__Group__2__Impl"


    // $ANTLR start "rule__ListItem__Group__3"
    // InternalSlideOMatic.g:2926:1: rule__ListItem__Group__3 : rule__ListItem__Group__3__Impl ;
    public final void rule__ListItem__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2930:1: ( rule__ListItem__Group__3__Impl )
            // InternalSlideOMatic.g:2931:2: rule__ListItem__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ListItem__Group__3__Impl();

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
    // $ANTLR end "rule__ListItem__Group__3"


    // $ANTLR start "rule__ListItem__Group__3__Impl"
    // InternalSlideOMatic.g:2937:1: rule__ListItem__Group__3__Impl : ( ( rule__ListItem__ClickAssignment_3 )? ) ;
    public final void rule__ListItem__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2941:1: ( ( ( rule__ListItem__ClickAssignment_3 )? ) )
            // InternalSlideOMatic.g:2942:1: ( ( rule__ListItem__ClickAssignment_3 )? )
            {
            // InternalSlideOMatic.g:2942:1: ( ( rule__ListItem__ClickAssignment_3 )? )
            // InternalSlideOMatic.g:2943:2: ( rule__ListItem__ClickAssignment_3 )?
            {
             before(grammarAccess.getListItemAccess().getClickAssignment_3()); 
            // InternalSlideOMatic.g:2944:2: ( rule__ListItem__ClickAssignment_3 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==11) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalSlideOMatic.g:2944:3: rule__ListItem__ClickAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__ListItem__ClickAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getListItemAccess().getClickAssignment_3()); 

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
    // $ANTLR end "rule__ListItem__Group__3__Impl"


    // $ANTLR start "rule__ListItem__Group_2__0"
    // InternalSlideOMatic.g:2953:1: rule__ListItem__Group_2__0 : rule__ListItem__Group_2__0__Impl rule__ListItem__Group_2__1 ;
    public final void rule__ListItem__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2957:1: ( rule__ListItem__Group_2__0__Impl rule__ListItem__Group_2__1 )
            // InternalSlideOMatic.g:2958:2: rule__ListItem__Group_2__0__Impl rule__ListItem__Group_2__1
            {
            pushFollow(FOLLOW_26);
            rule__ListItem__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListItem__Group_2__1();

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
    // $ANTLR end "rule__ListItem__Group_2__0"


    // $ANTLR start "rule__ListItem__Group_2__0__Impl"
    // InternalSlideOMatic.g:2965:1: rule__ListItem__Group_2__0__Impl : ( '(' ) ;
    public final void rule__ListItem__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2969:1: ( ( '(' ) )
            // InternalSlideOMatic.g:2970:1: ( '(' )
            {
            // InternalSlideOMatic.g:2970:1: ( '(' )
            // InternalSlideOMatic.g:2971:2: '('
            {
             before(grammarAccess.getListItemAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,73,FOLLOW_2); 
             after(grammarAccess.getListItemAccess().getLeftParenthesisKeyword_2_0()); 

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
    // $ANTLR end "rule__ListItem__Group_2__0__Impl"


    // $ANTLR start "rule__ListItem__Group_2__1"
    // InternalSlideOMatic.g:2980:1: rule__ListItem__Group_2__1 : rule__ListItem__Group_2__1__Impl rule__ListItem__Group_2__2 ;
    public final void rule__ListItem__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2984:1: ( rule__ListItem__Group_2__1__Impl rule__ListItem__Group_2__2 )
            // InternalSlideOMatic.g:2985:2: rule__ListItem__Group_2__1__Impl rule__ListItem__Group_2__2
            {
            pushFollow(FOLLOW_27);
            rule__ListItem__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListItem__Group_2__2();

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
    // $ANTLR end "rule__ListItem__Group_2__1"


    // $ANTLR start "rule__ListItem__Group_2__1__Impl"
    // InternalSlideOMatic.g:2992:1: rule__ListItem__Group_2__1__Impl : ( ( rule__ListItem__NestedListAssignment_2_1 ) ) ;
    public final void rule__ListItem__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2996:1: ( ( ( rule__ListItem__NestedListAssignment_2_1 ) ) )
            // InternalSlideOMatic.g:2997:1: ( ( rule__ListItem__NestedListAssignment_2_1 ) )
            {
            // InternalSlideOMatic.g:2997:1: ( ( rule__ListItem__NestedListAssignment_2_1 ) )
            // InternalSlideOMatic.g:2998:2: ( rule__ListItem__NestedListAssignment_2_1 )
            {
             before(grammarAccess.getListItemAccess().getNestedListAssignment_2_1()); 
            // InternalSlideOMatic.g:2999:2: ( rule__ListItem__NestedListAssignment_2_1 )
            // InternalSlideOMatic.g:2999:3: rule__ListItem__NestedListAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ListItem__NestedListAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getListItemAccess().getNestedListAssignment_2_1()); 

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
    // $ANTLR end "rule__ListItem__Group_2__1__Impl"


    // $ANTLR start "rule__ListItem__Group_2__2"
    // InternalSlideOMatic.g:3007:1: rule__ListItem__Group_2__2 : rule__ListItem__Group_2__2__Impl ;
    public final void rule__ListItem__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3011:1: ( rule__ListItem__Group_2__2__Impl )
            // InternalSlideOMatic.g:3012:2: rule__ListItem__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ListItem__Group_2__2__Impl();

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
    // $ANTLR end "rule__ListItem__Group_2__2"


    // $ANTLR start "rule__ListItem__Group_2__2__Impl"
    // InternalSlideOMatic.g:3018:1: rule__ListItem__Group_2__2__Impl : ( ')' ) ;
    public final void rule__ListItem__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3022:1: ( ( ')' ) )
            // InternalSlideOMatic.g:3023:1: ( ')' )
            {
            // InternalSlideOMatic.g:3023:1: ( ')' )
            // InternalSlideOMatic.g:3024:2: ')'
            {
             before(grammarAccess.getListItemAccess().getRightParenthesisKeyword_2_2()); 
            match(input,74,FOLLOW_2); 
             after(grammarAccess.getListItemAccess().getRightParenthesisKeyword_2_2()); 

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
    // $ANTLR end "rule__ListItem__Group_2__2__Impl"


    // $ANTLR start "rule__Image__Group__0"
    // InternalSlideOMatic.g:3034:1: rule__Image__Group__0 : rule__Image__Group__0__Impl rule__Image__Group__1 ;
    public final void rule__Image__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3038:1: ( rule__Image__Group__0__Impl rule__Image__Group__1 )
            // InternalSlideOMatic.g:3039:2: rule__Image__Group__0__Impl rule__Image__Group__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalSlideOMatic.g:3046:1: rule__Image__Group__0__Impl : ( 'img' ) ;
    public final void rule__Image__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3050:1: ( ( 'img' ) )
            // InternalSlideOMatic.g:3051:1: ( 'img' )
            {
            // InternalSlideOMatic.g:3051:1: ( 'img' )
            // InternalSlideOMatic.g:3052:2: 'img'
            {
             before(grammarAccess.getImageAccess().getImgKeyword_0()); 
            match(input,91,FOLLOW_2); 
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
    // InternalSlideOMatic.g:3061:1: rule__Image__Group__1 : rule__Image__Group__1__Impl rule__Image__Group__2 ;
    public final void rule__Image__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3065:1: ( rule__Image__Group__1__Impl rule__Image__Group__2 )
            // InternalSlideOMatic.g:3066:2: rule__Image__Group__1__Impl rule__Image__Group__2
            {
            pushFollow(FOLLOW_29);
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
    // InternalSlideOMatic.g:3073:1: rule__Image__Group__1__Impl : ( ( rule__Image__NameAssignment_1 ) ) ;
    public final void rule__Image__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3077:1: ( ( ( rule__Image__NameAssignment_1 ) ) )
            // InternalSlideOMatic.g:3078:1: ( ( rule__Image__NameAssignment_1 ) )
            {
            // InternalSlideOMatic.g:3078:1: ( ( rule__Image__NameAssignment_1 ) )
            // InternalSlideOMatic.g:3079:2: ( rule__Image__NameAssignment_1 )
            {
             before(grammarAccess.getImageAccess().getNameAssignment_1()); 
            // InternalSlideOMatic.g:3080:2: ( rule__Image__NameAssignment_1 )
            // InternalSlideOMatic.g:3080:3: rule__Image__NameAssignment_1
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
    // InternalSlideOMatic.g:3088:1: rule__Image__Group__2 : rule__Image__Group__2__Impl rule__Image__Group__3 ;
    public final void rule__Image__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3092:1: ( rule__Image__Group__2__Impl rule__Image__Group__3 )
            // InternalSlideOMatic.g:3093:2: rule__Image__Group__2__Impl rule__Image__Group__3
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
    // InternalSlideOMatic.g:3100:1: rule__Image__Group__2__Impl : ( 'src' ) ;
    public final void rule__Image__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3104:1: ( ( 'src' ) )
            // InternalSlideOMatic.g:3105:1: ( 'src' )
            {
            // InternalSlideOMatic.g:3105:1: ( 'src' )
            // InternalSlideOMatic.g:3106:2: 'src'
            {
             before(grammarAccess.getImageAccess().getSrcKeyword_2()); 
            match(input,92,FOLLOW_2); 
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
    // InternalSlideOMatic.g:3115:1: rule__Image__Group__3 : rule__Image__Group__3__Impl rule__Image__Group__4 ;
    public final void rule__Image__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3119:1: ( rule__Image__Group__3__Impl rule__Image__Group__4 )
            // InternalSlideOMatic.g:3120:2: rule__Image__Group__3__Impl rule__Image__Group__4
            {
            pushFollow(FOLLOW_30);
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
    // InternalSlideOMatic.g:3127:1: rule__Image__Group__3__Impl : ( ( rule__Image__SrcAssignment_3 ) ) ;
    public final void rule__Image__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3131:1: ( ( ( rule__Image__SrcAssignment_3 ) ) )
            // InternalSlideOMatic.g:3132:1: ( ( rule__Image__SrcAssignment_3 ) )
            {
            // InternalSlideOMatic.g:3132:1: ( ( rule__Image__SrcAssignment_3 ) )
            // InternalSlideOMatic.g:3133:2: ( rule__Image__SrcAssignment_3 )
            {
             before(grammarAccess.getImageAccess().getSrcAssignment_3()); 
            // InternalSlideOMatic.g:3134:2: ( rule__Image__SrcAssignment_3 )
            // InternalSlideOMatic.g:3134:3: rule__Image__SrcAssignment_3
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
    // InternalSlideOMatic.g:3142:1: rule__Image__Group__4 : rule__Image__Group__4__Impl rule__Image__Group__5 ;
    public final void rule__Image__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3146:1: ( rule__Image__Group__4__Impl rule__Image__Group__5 )
            // InternalSlideOMatic.g:3147:2: rule__Image__Group__4__Impl rule__Image__Group__5
            {
            pushFollow(FOLLOW_30);
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
    // InternalSlideOMatic.g:3154:1: rule__Image__Group__4__Impl : ( ( rule__Image__AlignmentAssignment_4 )? ) ;
    public final void rule__Image__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3158:1: ( ( ( rule__Image__AlignmentAssignment_4 )? ) )
            // InternalSlideOMatic.g:3159:1: ( ( rule__Image__AlignmentAssignment_4 )? )
            {
            // InternalSlideOMatic.g:3159:1: ( ( rule__Image__AlignmentAssignment_4 )? )
            // InternalSlideOMatic.g:3160:2: ( rule__Image__AlignmentAssignment_4 )?
            {
             before(grammarAccess.getImageAccess().getAlignmentAssignment_4()); 
            // InternalSlideOMatic.g:3161:2: ( rule__Image__AlignmentAssignment_4 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( ((LA33_0>=56 && LA33_0<=64)) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalSlideOMatic.g:3161:3: rule__Image__AlignmentAssignment_4
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
    // InternalSlideOMatic.g:3169:1: rule__Image__Group__5 : rule__Image__Group__5__Impl rule__Image__Group__6 ;
    public final void rule__Image__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3173:1: ( rule__Image__Group__5__Impl rule__Image__Group__6 )
            // InternalSlideOMatic.g:3174:2: rule__Image__Group__5__Impl rule__Image__Group__6
            {
            pushFollow(FOLLOW_21);
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
    // InternalSlideOMatic.g:3181:1: rule__Image__Group__5__Impl : ( ( rule__Image__SizeAssignment_5 ) ) ;
    public final void rule__Image__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3185:1: ( ( ( rule__Image__SizeAssignment_5 ) ) )
            // InternalSlideOMatic.g:3186:1: ( ( rule__Image__SizeAssignment_5 ) )
            {
            // InternalSlideOMatic.g:3186:1: ( ( rule__Image__SizeAssignment_5 ) )
            // InternalSlideOMatic.g:3187:2: ( rule__Image__SizeAssignment_5 )
            {
             before(grammarAccess.getImageAccess().getSizeAssignment_5()); 
            // InternalSlideOMatic.g:3188:2: ( rule__Image__SizeAssignment_5 )
            // InternalSlideOMatic.g:3188:3: rule__Image__SizeAssignment_5
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
    // InternalSlideOMatic.g:3196:1: rule__Image__Group__6 : rule__Image__Group__6__Impl ;
    public final void rule__Image__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3200:1: ( rule__Image__Group__6__Impl )
            // InternalSlideOMatic.g:3201:2: rule__Image__Group__6__Impl
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
    // InternalSlideOMatic.g:3207:1: rule__Image__Group__6__Impl : ( ( rule__Image__ClickAssignment_6 )? ) ;
    public final void rule__Image__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3211:1: ( ( ( rule__Image__ClickAssignment_6 )? ) )
            // InternalSlideOMatic.g:3212:1: ( ( rule__Image__ClickAssignment_6 )? )
            {
            // InternalSlideOMatic.g:3212:1: ( ( rule__Image__ClickAssignment_6 )? )
            // InternalSlideOMatic.g:3213:2: ( rule__Image__ClickAssignment_6 )?
            {
             before(grammarAccess.getImageAccess().getClickAssignment_6()); 
            // InternalSlideOMatic.g:3214:2: ( rule__Image__ClickAssignment_6 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==11) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalSlideOMatic.g:3214:3: rule__Image__ClickAssignment_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__Image__ClickAssignment_6();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getImageAccess().getClickAssignment_6()); 

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


    // $ANTLR start "rule__Size__Group_0__0"
    // InternalSlideOMatic.g:3223:1: rule__Size__Group_0__0 : rule__Size__Group_0__0__Impl rule__Size__Group_0__1 ;
    public final void rule__Size__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3227:1: ( rule__Size__Group_0__0__Impl rule__Size__Group_0__1 )
            // InternalSlideOMatic.g:3228:2: rule__Size__Group_0__0__Impl rule__Size__Group_0__1
            {
            pushFollow(FOLLOW_31);
            rule__Size__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Size__Group_0__1();

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
    // $ANTLR end "rule__Size__Group_0__0"


    // $ANTLR start "rule__Size__Group_0__0__Impl"
    // InternalSlideOMatic.g:3235:1: rule__Size__Group_0__0__Impl : ( () ) ;
    public final void rule__Size__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3239:1: ( ( () ) )
            // InternalSlideOMatic.g:3240:1: ( () )
            {
            // InternalSlideOMatic.g:3240:1: ( () )
            // InternalSlideOMatic.g:3241:2: ()
            {
             before(grammarAccess.getSizeAccess().getProportionalSizeAction_0_0()); 
            // InternalSlideOMatic.g:3242:2: ()
            // InternalSlideOMatic.g:3242:3: 
            {
            }

             after(grammarAccess.getSizeAccess().getProportionalSizeAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Size__Group_0__0__Impl"


    // $ANTLR start "rule__Size__Group_0__1"
    // InternalSlideOMatic.g:3250:1: rule__Size__Group_0__1 : rule__Size__Group_0__1__Impl rule__Size__Group_0__2 ;
    public final void rule__Size__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3254:1: ( rule__Size__Group_0__1__Impl rule__Size__Group_0__2 )
            // InternalSlideOMatic.g:3255:2: rule__Size__Group_0__1__Impl rule__Size__Group_0__2
            {
            pushFollow(FOLLOW_32);
            rule__Size__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Size__Group_0__2();

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
    // $ANTLR end "rule__Size__Group_0__1"


    // $ANTLR start "rule__Size__Group_0__1__Impl"
    // InternalSlideOMatic.g:3262:1: rule__Size__Group_0__1__Impl : ( ( rule__Size__WayAssignment_0_1 ) ) ;
    public final void rule__Size__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3266:1: ( ( ( rule__Size__WayAssignment_0_1 ) ) )
            // InternalSlideOMatic.g:3267:1: ( ( rule__Size__WayAssignment_0_1 ) )
            {
            // InternalSlideOMatic.g:3267:1: ( ( rule__Size__WayAssignment_0_1 ) )
            // InternalSlideOMatic.g:3268:2: ( rule__Size__WayAssignment_0_1 )
            {
             before(grammarAccess.getSizeAccess().getWayAssignment_0_1()); 
            // InternalSlideOMatic.g:3269:2: ( rule__Size__WayAssignment_0_1 )
            // InternalSlideOMatic.g:3269:3: rule__Size__WayAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Size__WayAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getSizeAccess().getWayAssignment_0_1()); 

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
    // $ANTLR end "rule__Size__Group_0__1__Impl"


    // $ANTLR start "rule__Size__Group_0__2"
    // InternalSlideOMatic.g:3277:1: rule__Size__Group_0__2 : rule__Size__Group_0__2__Impl rule__Size__Group_0__3 ;
    public final void rule__Size__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3281:1: ( rule__Size__Group_0__2__Impl rule__Size__Group_0__3 )
            // InternalSlideOMatic.g:3282:2: rule__Size__Group_0__2__Impl rule__Size__Group_0__3
            {
            pushFollow(FOLLOW_33);
            rule__Size__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Size__Group_0__3();

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
    // $ANTLR end "rule__Size__Group_0__2"


    // $ANTLR start "rule__Size__Group_0__2__Impl"
    // InternalSlideOMatic.g:3289:1: rule__Size__Group_0__2__Impl : ( ( rule__Size__ScaleAssignment_0_2 ) ) ;
    public final void rule__Size__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3293:1: ( ( ( rule__Size__ScaleAssignment_0_2 ) ) )
            // InternalSlideOMatic.g:3294:1: ( ( rule__Size__ScaleAssignment_0_2 ) )
            {
            // InternalSlideOMatic.g:3294:1: ( ( rule__Size__ScaleAssignment_0_2 ) )
            // InternalSlideOMatic.g:3295:2: ( rule__Size__ScaleAssignment_0_2 )
            {
             before(grammarAccess.getSizeAccess().getScaleAssignment_0_2()); 
            // InternalSlideOMatic.g:3296:2: ( rule__Size__ScaleAssignment_0_2 )
            // InternalSlideOMatic.g:3296:3: rule__Size__ScaleAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__Size__ScaleAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getSizeAccess().getScaleAssignment_0_2()); 

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
    // $ANTLR end "rule__Size__Group_0__2__Impl"


    // $ANTLR start "rule__Size__Group_0__3"
    // InternalSlideOMatic.g:3304:1: rule__Size__Group_0__3 : rule__Size__Group_0__3__Impl ;
    public final void rule__Size__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3308:1: ( rule__Size__Group_0__3__Impl )
            // InternalSlideOMatic.g:3309:2: rule__Size__Group_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Size__Group_0__3__Impl();

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
    // $ANTLR end "rule__Size__Group_0__3"


    // $ANTLR start "rule__Size__Group_0__3__Impl"
    // InternalSlideOMatic.g:3315:1: rule__Size__Group_0__3__Impl : ( '%' ) ;
    public final void rule__Size__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3319:1: ( ( '%' ) )
            // InternalSlideOMatic.g:3320:1: ( '%' )
            {
            // InternalSlideOMatic.g:3320:1: ( '%' )
            // InternalSlideOMatic.g:3321:2: '%'
            {
             before(grammarAccess.getSizeAccess().getPercentSignKeyword_0_3()); 
            match(input,93,FOLLOW_2); 
             after(grammarAccess.getSizeAccess().getPercentSignKeyword_0_3()); 

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
    // $ANTLR end "rule__Size__Group_0__3__Impl"


    // $ANTLR start "rule__Size__Group_1__0"
    // InternalSlideOMatic.g:3331:1: rule__Size__Group_1__0 : rule__Size__Group_1__0__Impl rule__Size__Group_1__1 ;
    public final void rule__Size__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3335:1: ( rule__Size__Group_1__0__Impl rule__Size__Group_1__1 )
            // InternalSlideOMatic.g:3336:2: rule__Size__Group_1__0__Impl rule__Size__Group_1__1
            {
            pushFollow(FOLLOW_30);
            rule__Size__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Size__Group_1__1();

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
    // $ANTLR end "rule__Size__Group_1__0"


    // $ANTLR start "rule__Size__Group_1__0__Impl"
    // InternalSlideOMatic.g:3343:1: rule__Size__Group_1__0__Impl : ( () ) ;
    public final void rule__Size__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3347:1: ( ( () ) )
            // InternalSlideOMatic.g:3348:1: ( () )
            {
            // InternalSlideOMatic.g:3348:1: ( () )
            // InternalSlideOMatic.g:3349:2: ()
            {
             before(grammarAccess.getSizeAccess().getExactSizeAction_1_0()); 
            // InternalSlideOMatic.g:3350:2: ()
            // InternalSlideOMatic.g:3350:3: 
            {
            }

             after(grammarAccess.getSizeAccess().getExactSizeAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Size__Group_1__0__Impl"


    // $ANTLR start "rule__Size__Group_1__1"
    // InternalSlideOMatic.g:3358:1: rule__Size__Group_1__1 : rule__Size__Group_1__1__Impl rule__Size__Group_1__2 ;
    public final void rule__Size__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3362:1: ( rule__Size__Group_1__1__Impl rule__Size__Group_1__2 )
            // InternalSlideOMatic.g:3363:2: rule__Size__Group_1__1__Impl rule__Size__Group_1__2
            {
            pushFollow(FOLLOW_34);
            rule__Size__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Size__Group_1__2();

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
    // $ANTLR end "rule__Size__Group_1__1"


    // $ANTLR start "rule__Size__Group_1__1__Impl"
    // InternalSlideOMatic.g:3370:1: rule__Size__Group_1__1__Impl : ( ( rule__Size__SizeAssignment_1_1 ) ) ;
    public final void rule__Size__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3374:1: ( ( ( rule__Size__SizeAssignment_1_1 ) ) )
            // InternalSlideOMatic.g:3375:1: ( ( rule__Size__SizeAssignment_1_1 ) )
            {
            // InternalSlideOMatic.g:3375:1: ( ( rule__Size__SizeAssignment_1_1 ) )
            // InternalSlideOMatic.g:3376:2: ( rule__Size__SizeAssignment_1_1 )
            {
             before(grammarAccess.getSizeAccess().getSizeAssignment_1_1()); 
            // InternalSlideOMatic.g:3377:2: ( rule__Size__SizeAssignment_1_1 )
            // InternalSlideOMatic.g:3377:3: rule__Size__SizeAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Size__SizeAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSizeAccess().getSizeAssignment_1_1()); 

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
    // $ANTLR end "rule__Size__Group_1__1__Impl"


    // $ANTLR start "rule__Size__Group_1__2"
    // InternalSlideOMatic.g:3385:1: rule__Size__Group_1__2 : rule__Size__Group_1__2__Impl ;
    public final void rule__Size__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3389:1: ( rule__Size__Group_1__2__Impl )
            // InternalSlideOMatic.g:3390:2: rule__Size__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Size__Group_1__2__Impl();

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
    // $ANTLR end "rule__Size__Group_1__2"


    // $ANTLR start "rule__Size__Group_1__2__Impl"
    // InternalSlideOMatic.g:3396:1: rule__Size__Group_1__2__Impl : ( ( rule__Size__UnitAssignment_1_2 ) ) ;
    public final void rule__Size__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3400:1: ( ( ( rule__Size__UnitAssignment_1_2 ) ) )
            // InternalSlideOMatic.g:3401:1: ( ( rule__Size__UnitAssignment_1_2 ) )
            {
            // InternalSlideOMatic.g:3401:1: ( ( rule__Size__UnitAssignment_1_2 ) )
            // InternalSlideOMatic.g:3402:2: ( rule__Size__UnitAssignment_1_2 )
            {
             before(grammarAccess.getSizeAccess().getUnitAssignment_1_2()); 
            // InternalSlideOMatic.g:3403:2: ( rule__Size__UnitAssignment_1_2 )
            // InternalSlideOMatic.g:3403:3: rule__Size__UnitAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Size__UnitAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getSizeAccess().getUnitAssignment_1_2()); 

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
    // $ANTLR end "rule__Size__Group_1__2__Impl"


    // $ANTLR start "rule__Table__Group__0"
    // InternalSlideOMatic.g:3412:1: rule__Table__Group__0 : rule__Table__Group__0__Impl rule__Table__Group__1 ;
    public final void rule__Table__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3416:1: ( rule__Table__Group__0__Impl rule__Table__Group__1 )
            // InternalSlideOMatic.g:3417:2: rule__Table__Group__0__Impl rule__Table__Group__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalSlideOMatic.g:3424:1: rule__Table__Group__0__Impl : ( 'tab' ) ;
    public final void rule__Table__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3428:1: ( ( 'tab' ) )
            // InternalSlideOMatic.g:3429:1: ( 'tab' )
            {
            // InternalSlideOMatic.g:3429:1: ( 'tab' )
            // InternalSlideOMatic.g:3430:2: 'tab'
            {
             before(grammarAccess.getTableAccess().getTabKeyword_0()); 
            match(input,94,FOLLOW_2); 
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
    // InternalSlideOMatic.g:3439:1: rule__Table__Group__1 : rule__Table__Group__1__Impl rule__Table__Group__2 ;
    public final void rule__Table__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3443:1: ( rule__Table__Group__1__Impl rule__Table__Group__2 )
            // InternalSlideOMatic.g:3444:2: rule__Table__Group__1__Impl rule__Table__Group__2
            {
            pushFollow(FOLLOW_35);
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
    // InternalSlideOMatic.g:3451:1: rule__Table__Group__1__Impl : ( ( rule__Table__NameAssignment_1 ) ) ;
    public final void rule__Table__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3455:1: ( ( ( rule__Table__NameAssignment_1 ) ) )
            // InternalSlideOMatic.g:3456:1: ( ( rule__Table__NameAssignment_1 ) )
            {
            // InternalSlideOMatic.g:3456:1: ( ( rule__Table__NameAssignment_1 ) )
            // InternalSlideOMatic.g:3457:2: ( rule__Table__NameAssignment_1 )
            {
             before(grammarAccess.getTableAccess().getNameAssignment_1()); 
            // InternalSlideOMatic.g:3458:2: ( rule__Table__NameAssignment_1 )
            // InternalSlideOMatic.g:3458:3: rule__Table__NameAssignment_1
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
    // InternalSlideOMatic.g:3466:1: rule__Table__Group__2 : rule__Table__Group__2__Impl rule__Table__Group__3 ;
    public final void rule__Table__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3470:1: ( rule__Table__Group__2__Impl rule__Table__Group__3 )
            // InternalSlideOMatic.g:3471:2: rule__Table__Group__2__Impl rule__Table__Group__3
            {
            pushFollow(FOLLOW_35);
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
    // InternalSlideOMatic.g:3478:1: rule__Table__Group__2__Impl : ( '[' ) ;
    public final void rule__Table__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3482:1: ( ( '[' ) )
            // InternalSlideOMatic.g:3483:1: ( '[' )
            {
            // InternalSlideOMatic.g:3483:1: ( '[' )
            // InternalSlideOMatic.g:3484:2: '['
            {
             before(grammarAccess.getTableAccess().getLeftSquareBracketKeyword_2()); 
            match(input,95,FOLLOW_2); 
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
    // InternalSlideOMatic.g:3493:1: rule__Table__Group__3 : rule__Table__Group__3__Impl rule__Table__Group__4 ;
    public final void rule__Table__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3497:1: ( rule__Table__Group__3__Impl rule__Table__Group__4 )
            // InternalSlideOMatic.g:3498:2: rule__Table__Group__3__Impl rule__Table__Group__4
            {
            pushFollow(FOLLOW_36);
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
    // InternalSlideOMatic.g:3505:1: rule__Table__Group__3__Impl : ( ( rule__Table__RowsAssignment_3 ) ) ;
    public final void rule__Table__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3509:1: ( ( ( rule__Table__RowsAssignment_3 ) ) )
            // InternalSlideOMatic.g:3510:1: ( ( rule__Table__RowsAssignment_3 ) )
            {
            // InternalSlideOMatic.g:3510:1: ( ( rule__Table__RowsAssignment_3 ) )
            // InternalSlideOMatic.g:3511:2: ( rule__Table__RowsAssignment_3 )
            {
             before(grammarAccess.getTableAccess().getRowsAssignment_3()); 
            // InternalSlideOMatic.g:3512:2: ( rule__Table__RowsAssignment_3 )
            // InternalSlideOMatic.g:3512:3: rule__Table__RowsAssignment_3
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
    // InternalSlideOMatic.g:3520:1: rule__Table__Group__4 : rule__Table__Group__4__Impl rule__Table__Group__5 ;
    public final void rule__Table__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3524:1: ( rule__Table__Group__4__Impl rule__Table__Group__5 )
            // InternalSlideOMatic.g:3525:2: rule__Table__Group__4__Impl rule__Table__Group__5
            {
            pushFollow(FOLLOW_36);
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
    // InternalSlideOMatic.g:3532:1: rule__Table__Group__4__Impl : ( ( rule__Table__Group_4__0 )* ) ;
    public final void rule__Table__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3536:1: ( ( ( rule__Table__Group_4__0 )* ) )
            // InternalSlideOMatic.g:3537:1: ( ( rule__Table__Group_4__0 )* )
            {
            // InternalSlideOMatic.g:3537:1: ( ( rule__Table__Group_4__0 )* )
            // InternalSlideOMatic.g:3538:2: ( rule__Table__Group_4__0 )*
            {
             before(grammarAccess.getTableAccess().getGroup_4()); 
            // InternalSlideOMatic.g:3539:2: ( rule__Table__Group_4__0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==78) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalSlideOMatic.g:3539:3: rule__Table__Group_4__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Table__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
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
    // InternalSlideOMatic.g:3547:1: rule__Table__Group__5 : rule__Table__Group__5__Impl ;
    public final void rule__Table__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3551:1: ( rule__Table__Group__5__Impl )
            // InternalSlideOMatic.g:3552:2: rule__Table__Group__5__Impl
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
    // InternalSlideOMatic.g:3558:1: rule__Table__Group__5__Impl : ( ']' ) ;
    public final void rule__Table__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3562:1: ( ( ']' ) )
            // InternalSlideOMatic.g:3563:1: ( ']' )
            {
            // InternalSlideOMatic.g:3563:1: ( ']' )
            // InternalSlideOMatic.g:3564:2: ']'
            {
             before(grammarAccess.getTableAccess().getRightSquareBracketKeyword_5()); 
            match(input,96,FOLLOW_2); 
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
    // InternalSlideOMatic.g:3574:1: rule__Table__Group_4__0 : rule__Table__Group_4__0__Impl rule__Table__Group_4__1 ;
    public final void rule__Table__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3578:1: ( rule__Table__Group_4__0__Impl rule__Table__Group_4__1 )
            // InternalSlideOMatic.g:3579:2: rule__Table__Group_4__0__Impl rule__Table__Group_4__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalSlideOMatic.g:3586:1: rule__Table__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Table__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3590:1: ( ( ',' ) )
            // InternalSlideOMatic.g:3591:1: ( ',' )
            {
            // InternalSlideOMatic.g:3591:1: ( ',' )
            // InternalSlideOMatic.g:3592:2: ','
            {
             before(grammarAccess.getTableAccess().getCommaKeyword_4_0()); 
            match(input,78,FOLLOW_2); 
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
    // InternalSlideOMatic.g:3601:1: rule__Table__Group_4__1 : rule__Table__Group_4__1__Impl ;
    public final void rule__Table__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3605:1: ( rule__Table__Group_4__1__Impl )
            // InternalSlideOMatic.g:3606:2: rule__Table__Group_4__1__Impl
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
    // InternalSlideOMatic.g:3612:1: rule__Table__Group_4__1__Impl : ( ( rule__Table__RowsAssignment_4_1 ) ) ;
    public final void rule__Table__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3616:1: ( ( ( rule__Table__RowsAssignment_4_1 ) ) )
            // InternalSlideOMatic.g:3617:1: ( ( rule__Table__RowsAssignment_4_1 ) )
            {
            // InternalSlideOMatic.g:3617:1: ( ( rule__Table__RowsAssignment_4_1 ) )
            // InternalSlideOMatic.g:3618:2: ( rule__Table__RowsAssignment_4_1 )
            {
             before(grammarAccess.getTableAccess().getRowsAssignment_4_1()); 
            // InternalSlideOMatic.g:3619:2: ( rule__Table__RowsAssignment_4_1 )
            // InternalSlideOMatic.g:3619:3: rule__Table__RowsAssignment_4_1
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
    // InternalSlideOMatic.g:3628:1: rule__TableRow__Group__0 : rule__TableRow__Group__0__Impl rule__TableRow__Group__1 ;
    public final void rule__TableRow__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3632:1: ( rule__TableRow__Group__0__Impl rule__TableRow__Group__1 )
            // InternalSlideOMatic.g:3633:2: rule__TableRow__Group__0__Impl rule__TableRow__Group__1
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
    // InternalSlideOMatic.g:3640:1: rule__TableRow__Group__0__Impl : ( '[' ) ;
    public final void rule__TableRow__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3644:1: ( ( '[' ) )
            // InternalSlideOMatic.g:3645:1: ( '[' )
            {
            // InternalSlideOMatic.g:3645:1: ( '[' )
            // InternalSlideOMatic.g:3646:2: '['
            {
             before(grammarAccess.getTableRowAccess().getLeftSquareBracketKeyword_0()); 
            match(input,95,FOLLOW_2); 
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
    // InternalSlideOMatic.g:3655:1: rule__TableRow__Group__1 : rule__TableRow__Group__1__Impl rule__TableRow__Group__2 ;
    public final void rule__TableRow__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3659:1: ( rule__TableRow__Group__1__Impl rule__TableRow__Group__2 )
            // InternalSlideOMatic.g:3660:2: rule__TableRow__Group__1__Impl rule__TableRow__Group__2
            {
            pushFollow(FOLLOW_36);
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
    // InternalSlideOMatic.g:3667:1: rule__TableRow__Group__1__Impl : ( ( rule__TableRow__ValuesAssignment_1 ) ) ;
    public final void rule__TableRow__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3671:1: ( ( ( rule__TableRow__ValuesAssignment_1 ) ) )
            // InternalSlideOMatic.g:3672:1: ( ( rule__TableRow__ValuesAssignment_1 ) )
            {
            // InternalSlideOMatic.g:3672:1: ( ( rule__TableRow__ValuesAssignment_1 ) )
            // InternalSlideOMatic.g:3673:2: ( rule__TableRow__ValuesAssignment_1 )
            {
             before(grammarAccess.getTableRowAccess().getValuesAssignment_1()); 
            // InternalSlideOMatic.g:3674:2: ( rule__TableRow__ValuesAssignment_1 )
            // InternalSlideOMatic.g:3674:3: rule__TableRow__ValuesAssignment_1
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
    // InternalSlideOMatic.g:3682:1: rule__TableRow__Group__2 : rule__TableRow__Group__2__Impl rule__TableRow__Group__3 ;
    public final void rule__TableRow__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3686:1: ( rule__TableRow__Group__2__Impl rule__TableRow__Group__3 )
            // InternalSlideOMatic.g:3687:2: rule__TableRow__Group__2__Impl rule__TableRow__Group__3
            {
            pushFollow(FOLLOW_36);
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
    // InternalSlideOMatic.g:3694:1: rule__TableRow__Group__2__Impl : ( ( rule__TableRow__Group_2__0 )* ) ;
    public final void rule__TableRow__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3698:1: ( ( ( rule__TableRow__Group_2__0 )* ) )
            // InternalSlideOMatic.g:3699:1: ( ( rule__TableRow__Group_2__0 )* )
            {
            // InternalSlideOMatic.g:3699:1: ( ( rule__TableRow__Group_2__0 )* )
            // InternalSlideOMatic.g:3700:2: ( rule__TableRow__Group_2__0 )*
            {
             before(grammarAccess.getTableRowAccess().getGroup_2()); 
            // InternalSlideOMatic.g:3701:2: ( rule__TableRow__Group_2__0 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==78) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalSlideOMatic.g:3701:3: rule__TableRow__Group_2__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__TableRow__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop36;
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
    // InternalSlideOMatic.g:3709:1: rule__TableRow__Group__3 : rule__TableRow__Group__3__Impl ;
    public final void rule__TableRow__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3713:1: ( rule__TableRow__Group__3__Impl )
            // InternalSlideOMatic.g:3714:2: rule__TableRow__Group__3__Impl
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
    // InternalSlideOMatic.g:3720:1: rule__TableRow__Group__3__Impl : ( ']' ) ;
    public final void rule__TableRow__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3724:1: ( ( ']' ) )
            // InternalSlideOMatic.g:3725:1: ( ']' )
            {
            // InternalSlideOMatic.g:3725:1: ( ']' )
            // InternalSlideOMatic.g:3726:2: ']'
            {
             before(grammarAccess.getTableRowAccess().getRightSquareBracketKeyword_3()); 
            match(input,96,FOLLOW_2); 
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
    // InternalSlideOMatic.g:3736:1: rule__TableRow__Group_2__0 : rule__TableRow__Group_2__0__Impl rule__TableRow__Group_2__1 ;
    public final void rule__TableRow__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3740:1: ( rule__TableRow__Group_2__0__Impl rule__TableRow__Group_2__1 )
            // InternalSlideOMatic.g:3741:2: rule__TableRow__Group_2__0__Impl rule__TableRow__Group_2__1
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
    // InternalSlideOMatic.g:3748:1: rule__TableRow__Group_2__0__Impl : ( ',' ) ;
    public final void rule__TableRow__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3752:1: ( ( ',' ) )
            // InternalSlideOMatic.g:3753:1: ( ',' )
            {
            // InternalSlideOMatic.g:3753:1: ( ',' )
            // InternalSlideOMatic.g:3754:2: ','
            {
             before(grammarAccess.getTableRowAccess().getCommaKeyword_2_0()); 
            match(input,78,FOLLOW_2); 
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
    // InternalSlideOMatic.g:3763:1: rule__TableRow__Group_2__1 : rule__TableRow__Group_2__1__Impl ;
    public final void rule__TableRow__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3767:1: ( rule__TableRow__Group_2__1__Impl )
            // InternalSlideOMatic.g:3768:2: rule__TableRow__Group_2__1__Impl
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
    // InternalSlideOMatic.g:3774:1: rule__TableRow__Group_2__1__Impl : ( ( rule__TableRow__ValuesAssignment_2_1 ) ) ;
    public final void rule__TableRow__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3778:1: ( ( ( rule__TableRow__ValuesAssignment_2_1 ) ) )
            // InternalSlideOMatic.g:3779:1: ( ( rule__TableRow__ValuesAssignment_2_1 ) )
            {
            // InternalSlideOMatic.g:3779:1: ( ( rule__TableRow__ValuesAssignment_2_1 ) )
            // InternalSlideOMatic.g:3780:2: ( rule__TableRow__ValuesAssignment_2_1 )
            {
             before(grammarAccess.getTableRowAccess().getValuesAssignment_2_1()); 
            // InternalSlideOMatic.g:3781:2: ( rule__TableRow__ValuesAssignment_2_1 )
            // InternalSlideOMatic.g:3781:3: rule__TableRow__ValuesAssignment_2_1
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


    // $ANTLR start "rule__Code__Group__0"
    // InternalSlideOMatic.g:3790:1: rule__Code__Group__0 : rule__Code__Group__0__Impl rule__Code__Group__1 ;
    public final void rule__Code__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3794:1: ( rule__Code__Group__0__Impl rule__Code__Group__1 )
            // InternalSlideOMatic.g:3795:2: rule__Code__Group__0__Impl rule__Code__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__Code__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Code__Group__1();

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
    // $ANTLR end "rule__Code__Group__0"


    // $ANTLR start "rule__Code__Group__0__Impl"
    // InternalSlideOMatic.g:3802:1: rule__Code__Group__0__Impl : ( '```' ) ;
    public final void rule__Code__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3806:1: ( ( '```' ) )
            // InternalSlideOMatic.g:3807:1: ( '```' )
            {
            // InternalSlideOMatic.g:3807:1: ( '```' )
            // InternalSlideOMatic.g:3808:2: '```'
            {
             before(grammarAccess.getCodeAccess().getGraveAccentGraveAccentGraveAccentKeyword_0()); 
            match(input,97,FOLLOW_2); 
             after(grammarAccess.getCodeAccess().getGraveAccentGraveAccentGraveAccentKeyword_0()); 

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
    // $ANTLR end "rule__Code__Group__0__Impl"


    // $ANTLR start "rule__Code__Group__1"
    // InternalSlideOMatic.g:3817:1: rule__Code__Group__1 : rule__Code__Group__1__Impl rule__Code__Group__2 ;
    public final void rule__Code__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3821:1: ( rule__Code__Group__1__Impl rule__Code__Group__2 )
            // InternalSlideOMatic.g:3822:2: rule__Code__Group__1__Impl rule__Code__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Code__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Code__Group__2();

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
    // $ANTLR end "rule__Code__Group__1"


    // $ANTLR start "rule__Code__Group__1__Impl"
    // InternalSlideOMatic.g:3829:1: rule__Code__Group__1__Impl : ( ( rule__Code__LangAssignment_1 ) ) ;
    public final void rule__Code__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3833:1: ( ( ( rule__Code__LangAssignment_1 ) ) )
            // InternalSlideOMatic.g:3834:1: ( ( rule__Code__LangAssignment_1 ) )
            {
            // InternalSlideOMatic.g:3834:1: ( ( rule__Code__LangAssignment_1 ) )
            // InternalSlideOMatic.g:3835:2: ( rule__Code__LangAssignment_1 )
            {
             before(grammarAccess.getCodeAccess().getLangAssignment_1()); 
            // InternalSlideOMatic.g:3836:2: ( rule__Code__LangAssignment_1 )
            // InternalSlideOMatic.g:3836:3: rule__Code__LangAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Code__LangAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCodeAccess().getLangAssignment_1()); 

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
    // $ANTLR end "rule__Code__Group__1__Impl"


    // $ANTLR start "rule__Code__Group__2"
    // InternalSlideOMatic.g:3844:1: rule__Code__Group__2 : rule__Code__Group__2__Impl rule__Code__Group__3 ;
    public final void rule__Code__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3848:1: ( rule__Code__Group__2__Impl rule__Code__Group__3 )
            // InternalSlideOMatic.g:3849:2: rule__Code__Group__2__Impl rule__Code__Group__3
            {
            pushFollow(FOLLOW_37);
            rule__Code__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Code__Group__3();

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
    // $ANTLR end "rule__Code__Group__2"


    // $ANTLR start "rule__Code__Group__2__Impl"
    // InternalSlideOMatic.g:3856:1: rule__Code__Group__2__Impl : ( ( rule__Code__CodeAssignment_2 ) ) ;
    public final void rule__Code__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3860:1: ( ( ( rule__Code__CodeAssignment_2 ) ) )
            // InternalSlideOMatic.g:3861:1: ( ( rule__Code__CodeAssignment_2 ) )
            {
            // InternalSlideOMatic.g:3861:1: ( ( rule__Code__CodeAssignment_2 ) )
            // InternalSlideOMatic.g:3862:2: ( rule__Code__CodeAssignment_2 )
            {
             before(grammarAccess.getCodeAccess().getCodeAssignment_2()); 
            // InternalSlideOMatic.g:3863:2: ( rule__Code__CodeAssignment_2 )
            // InternalSlideOMatic.g:3863:3: rule__Code__CodeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Code__CodeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCodeAccess().getCodeAssignment_2()); 

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
    // $ANTLR end "rule__Code__Group__2__Impl"


    // $ANTLR start "rule__Code__Group__3"
    // InternalSlideOMatic.g:3871:1: rule__Code__Group__3 : rule__Code__Group__3__Impl ;
    public final void rule__Code__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3875:1: ( rule__Code__Group__3__Impl )
            // InternalSlideOMatic.g:3876:2: rule__Code__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Code__Group__3__Impl();

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
    // $ANTLR end "rule__Code__Group__3"


    // $ANTLR start "rule__Code__Group__3__Impl"
    // InternalSlideOMatic.g:3882:1: rule__Code__Group__3__Impl : ( '```' ) ;
    public final void rule__Code__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3886:1: ( ( '```' ) )
            // InternalSlideOMatic.g:3887:1: ( '```' )
            {
            // InternalSlideOMatic.g:3887:1: ( '```' )
            // InternalSlideOMatic.g:3888:2: '```'
            {
             before(grammarAccess.getCodeAccess().getGraveAccentGraveAccentGraveAccentKeyword_3()); 
            match(input,97,FOLLOW_2); 
             after(grammarAccess.getCodeAccess().getGraveAccentGraveAccentGraveAccentKeyword_3()); 

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
    // $ANTLR end "rule__Code__Group__3__Impl"


    // $ANTLR start "rule__Animation__Group__0"
    // InternalSlideOMatic.g:3898:1: rule__Animation__Group__0 : rule__Animation__Group__0__Impl rule__Animation__Group__1 ;
    public final void rule__Animation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3902:1: ( rule__Animation__Group__0__Impl rule__Animation__Group__1 )
            // InternalSlideOMatic.g:3903:2: rule__Animation__Group__0__Impl rule__Animation__Group__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalSlideOMatic.g:3910:1: rule__Animation__Group__0__Impl : ( 'animate' ) ;
    public final void rule__Animation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3914:1: ( ( 'animate' ) )
            // InternalSlideOMatic.g:3915:1: ( 'animate' )
            {
            // InternalSlideOMatic.g:3915:1: ( 'animate' )
            // InternalSlideOMatic.g:3916:2: 'animate'
            {
             before(grammarAccess.getAnimationAccess().getAnimateKeyword_0()); 
            match(input,98,FOLLOW_2); 
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
    // InternalSlideOMatic.g:3925:1: rule__Animation__Group__1 : rule__Animation__Group__1__Impl rule__Animation__Group__2 ;
    public final void rule__Animation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3929:1: ( rule__Animation__Group__1__Impl rule__Animation__Group__2 )
            // InternalSlideOMatic.g:3930:2: rule__Animation__Group__1__Impl rule__Animation__Group__2
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
    // InternalSlideOMatic.g:3937:1: rule__Animation__Group__1__Impl : ( ( rule__Animation__TargetAssignment_1 ) ) ;
    public final void rule__Animation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3941:1: ( ( ( rule__Animation__TargetAssignment_1 ) ) )
            // InternalSlideOMatic.g:3942:1: ( ( rule__Animation__TargetAssignment_1 ) )
            {
            // InternalSlideOMatic.g:3942:1: ( ( rule__Animation__TargetAssignment_1 ) )
            // InternalSlideOMatic.g:3943:2: ( rule__Animation__TargetAssignment_1 )
            {
             before(grammarAccess.getAnimationAccess().getTargetAssignment_1()); 
            // InternalSlideOMatic.g:3944:2: ( rule__Animation__TargetAssignment_1 )
            // InternalSlideOMatic.g:3944:3: rule__Animation__TargetAssignment_1
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
    // InternalSlideOMatic.g:3952:1: rule__Animation__Group__2 : rule__Animation__Group__2__Impl rule__Animation__Group__3 ;
    public final void rule__Animation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3956:1: ( rule__Animation__Group__2__Impl rule__Animation__Group__3 )
            // InternalSlideOMatic.g:3957:2: rule__Animation__Group__2__Impl rule__Animation__Group__3
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
    // InternalSlideOMatic.g:3964:1: rule__Animation__Group__2__Impl : ( ( rule__Animation__TypeAssignment_2 ) ) ;
    public final void rule__Animation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3968:1: ( ( ( rule__Animation__TypeAssignment_2 ) ) )
            // InternalSlideOMatic.g:3969:1: ( ( rule__Animation__TypeAssignment_2 ) )
            {
            // InternalSlideOMatic.g:3969:1: ( ( rule__Animation__TypeAssignment_2 ) )
            // InternalSlideOMatic.g:3970:2: ( rule__Animation__TypeAssignment_2 )
            {
             before(grammarAccess.getAnimationAccess().getTypeAssignment_2()); 
            // InternalSlideOMatic.g:3971:2: ( rule__Animation__TypeAssignment_2 )
            // InternalSlideOMatic.g:3971:3: rule__Animation__TypeAssignment_2
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
    // InternalSlideOMatic.g:3979:1: rule__Animation__Group__3 : rule__Animation__Group__3__Impl rule__Animation__Group__4 ;
    public final void rule__Animation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3983:1: ( rule__Animation__Group__3__Impl rule__Animation__Group__4 )
            // InternalSlideOMatic.g:3984:2: rule__Animation__Group__3__Impl rule__Animation__Group__4
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
    // InternalSlideOMatic.g:3991:1: rule__Animation__Group__3__Impl : ( 'to' ) ;
    public final void rule__Animation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3995:1: ( ( 'to' ) )
            // InternalSlideOMatic.g:3996:1: ( 'to' )
            {
            // InternalSlideOMatic.g:3996:1: ( 'to' )
            // InternalSlideOMatic.g:3997:2: 'to'
            {
             before(grammarAccess.getAnimationAccess().getToKeyword_3()); 
            match(input,99,FOLLOW_2); 
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
    // InternalSlideOMatic.g:4006:1: rule__Animation__Group__4 : rule__Animation__Group__4__Impl rule__Animation__Group__5 ;
    public final void rule__Animation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4010:1: ( rule__Animation__Group__4__Impl rule__Animation__Group__5 )
            // InternalSlideOMatic.g:4011:2: rule__Animation__Group__4__Impl rule__Animation__Group__5
            {
            pushFollow(FOLLOW_30);
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
    // InternalSlideOMatic.g:4018:1: rule__Animation__Group__4__Impl : ( ( rule__Animation__LocationAssignment_4 ) ) ;
    public final void rule__Animation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4022:1: ( ( ( rule__Animation__LocationAssignment_4 ) ) )
            // InternalSlideOMatic.g:4023:1: ( ( rule__Animation__LocationAssignment_4 ) )
            {
            // InternalSlideOMatic.g:4023:1: ( ( rule__Animation__LocationAssignment_4 ) )
            // InternalSlideOMatic.g:4024:2: ( rule__Animation__LocationAssignment_4 )
            {
             before(grammarAccess.getAnimationAccess().getLocationAssignment_4()); 
            // InternalSlideOMatic.g:4025:2: ( rule__Animation__LocationAssignment_4 )
            // InternalSlideOMatic.g:4025:3: rule__Animation__LocationAssignment_4
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
    // InternalSlideOMatic.g:4033:1: rule__Animation__Group__5 : rule__Animation__Group__5__Impl ;
    public final void rule__Animation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4037:1: ( rule__Animation__Group__5__Impl )
            // InternalSlideOMatic.g:4038:2: rule__Animation__Group__5__Impl
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
    // InternalSlideOMatic.g:4044:1: rule__Animation__Group__5__Impl : ( ( rule__Animation__SizeAssignment_5 )? ) ;
    public final void rule__Animation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4048:1: ( ( ( rule__Animation__SizeAssignment_5 )? ) )
            // InternalSlideOMatic.g:4049:1: ( ( rule__Animation__SizeAssignment_5 )? )
            {
            // InternalSlideOMatic.g:4049:1: ( ( rule__Animation__SizeAssignment_5 )? )
            // InternalSlideOMatic.g:4050:2: ( rule__Animation__SizeAssignment_5 )?
            {
             before(grammarAccess.getAnimationAccess().getSizeAssignment_5()); 
            // InternalSlideOMatic.g:4051:2: ( rule__Animation__SizeAssignment_5 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_INT||(LA37_0>=65 && LA37_0<=66)) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalSlideOMatic.g:4051:3: rule__Animation__SizeAssignment_5
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
    // InternalSlideOMatic.g:4060:1: rule__AnimationType__Group_0__0 : rule__AnimationType__Group_0__0__Impl rule__AnimationType__Group_0__1 ;
    public final void rule__AnimationType__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4064:1: ( rule__AnimationType__Group_0__0__Impl rule__AnimationType__Group_0__1 )
            // InternalSlideOMatic.g:4065:2: rule__AnimationType__Group_0__0__Impl rule__AnimationType__Group_0__1
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
    // InternalSlideOMatic.g:4072:1: rule__AnimationType__Group_0__0__Impl : ( () ) ;
    public final void rule__AnimationType__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4076:1: ( ( () ) )
            // InternalSlideOMatic.g:4077:1: ( () )
            {
            // InternalSlideOMatic.g:4077:1: ( () )
            // InternalSlideOMatic.g:4078:2: ()
            {
             before(grammarAccess.getAnimationTypeAccess().getMoveAction_0_0()); 
            // InternalSlideOMatic.g:4079:2: ()
            // InternalSlideOMatic.g:4079:3: 
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
    // InternalSlideOMatic.g:4087:1: rule__AnimationType__Group_0__1 : rule__AnimationType__Group_0__1__Impl ;
    public final void rule__AnimationType__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4091:1: ( rule__AnimationType__Group_0__1__Impl )
            // InternalSlideOMatic.g:4092:2: rule__AnimationType__Group_0__1__Impl
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
    // InternalSlideOMatic.g:4098:1: rule__AnimationType__Group_0__1__Impl : ( 'move' ) ;
    public final void rule__AnimationType__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4102:1: ( ( 'move' ) )
            // InternalSlideOMatic.g:4103:1: ( 'move' )
            {
            // InternalSlideOMatic.g:4103:1: ( 'move' )
            // InternalSlideOMatic.g:4104:2: 'move'
            {
             before(grammarAccess.getAnimationTypeAccess().getMoveKeyword_0_1()); 
            match(input,100,FOLLOW_2); 
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
    // InternalSlideOMatic.g:4114:1: rule__AnimationType__Group_1__0 : rule__AnimationType__Group_1__0__Impl rule__AnimationType__Group_1__1 ;
    public final void rule__AnimationType__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4118:1: ( rule__AnimationType__Group_1__0__Impl rule__AnimationType__Group_1__1 )
            // InternalSlideOMatic.g:4119:2: rule__AnimationType__Group_1__0__Impl rule__AnimationType__Group_1__1
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
    // InternalSlideOMatic.g:4126:1: rule__AnimationType__Group_1__0__Impl : ( () ) ;
    public final void rule__AnimationType__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4130:1: ( ( () ) )
            // InternalSlideOMatic.g:4131:1: ( () )
            {
            // InternalSlideOMatic.g:4131:1: ( () )
            // InternalSlideOMatic.g:4132:2: ()
            {
             before(grammarAccess.getAnimationTypeAccess().getJumpAction_1_0()); 
            // InternalSlideOMatic.g:4133:2: ()
            // InternalSlideOMatic.g:4133:3: 
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
    // InternalSlideOMatic.g:4141:1: rule__AnimationType__Group_1__1 : rule__AnimationType__Group_1__1__Impl ;
    public final void rule__AnimationType__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4145:1: ( rule__AnimationType__Group_1__1__Impl )
            // InternalSlideOMatic.g:4146:2: rule__AnimationType__Group_1__1__Impl
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
    // InternalSlideOMatic.g:4152:1: rule__AnimationType__Group_1__1__Impl : ( 'jump' ) ;
    public final void rule__AnimationType__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4156:1: ( ( 'jump' ) )
            // InternalSlideOMatic.g:4157:1: ( 'jump' )
            {
            // InternalSlideOMatic.g:4157:1: ( 'jump' )
            // InternalSlideOMatic.g:4158:2: 'jump'
            {
             before(grammarAccess.getAnimationTypeAccess().getJumpKeyword_1_1()); 
            match(input,101,FOLLOW_2); 
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
    // InternalSlideOMatic.g:4168:1: rule__Presentation__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Presentation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4172:1: ( ( RULE_STRING ) )
            // InternalSlideOMatic.g:4173:2: ( RULE_STRING )
            {
            // InternalSlideOMatic.g:4173:2: ( RULE_STRING )
            // InternalSlideOMatic.g:4174:3: RULE_STRING
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


    // $ANTLR start "rule__Presentation__SubtitleAssignment_2"
    // InternalSlideOMatic.g:4183:1: rule__Presentation__SubtitleAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Presentation__SubtitleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4187:1: ( ( RULE_STRING ) )
            // InternalSlideOMatic.g:4188:2: ( RULE_STRING )
            {
            // InternalSlideOMatic.g:4188:2: ( RULE_STRING )
            // InternalSlideOMatic.g:4189:3: RULE_STRING
            {
             before(grammarAccess.getPresentationAccess().getSubtitleSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPresentationAccess().getSubtitleSTRINGTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Presentation__SubtitleAssignment_2"


    // $ANTLR start "rule__Presentation__ThemeAssignment_4_1"
    // InternalSlideOMatic.g:4198:1: rule__Presentation__ThemeAssignment_4_1 : ( ruleTheme ) ;
    public final void rule__Presentation__ThemeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4202:1: ( ( ruleTheme ) )
            // InternalSlideOMatic.g:4203:2: ( ruleTheme )
            {
            // InternalSlideOMatic.g:4203:2: ( ruleTheme )
            // InternalSlideOMatic.g:4204:3: ruleTheme
            {
             before(grammarAccess.getPresentationAccess().getThemeThemeParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTheme();

            state._fsp--;

             after(grammarAccess.getPresentationAccess().getThemeThemeParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Presentation__ThemeAssignment_4_1"


    // $ANTLR start "rule__Presentation__AuthorsAssignment_4_2"
    // InternalSlideOMatic.g:4213:1: rule__Presentation__AuthorsAssignment_4_2 : ( ruleAuthors ) ;
    public final void rule__Presentation__AuthorsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4217:1: ( ( ruleAuthors ) )
            // InternalSlideOMatic.g:4218:2: ( ruleAuthors )
            {
            // InternalSlideOMatic.g:4218:2: ( ruleAuthors )
            // InternalSlideOMatic.g:4219:3: ruleAuthors
            {
             before(grammarAccess.getPresentationAccess().getAuthorsAuthorsParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAuthors();

            state._fsp--;

             after(grammarAccess.getPresentationAccess().getAuthorsAuthorsParserRuleCall_4_2_0()); 

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
    // $ANTLR end "rule__Presentation__AuthorsAssignment_4_2"


    // $ANTLR start "rule__Presentation__InstituteAssignment_4_3"
    // InternalSlideOMatic.g:4228:1: rule__Presentation__InstituteAssignment_4_3 : ( ruleInstitute ) ;
    public final void rule__Presentation__InstituteAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4232:1: ( ( ruleInstitute ) )
            // InternalSlideOMatic.g:4233:2: ( ruleInstitute )
            {
            // InternalSlideOMatic.g:4233:2: ( ruleInstitute )
            // InternalSlideOMatic.g:4234:3: ruleInstitute
            {
             before(grammarAccess.getPresentationAccess().getInstituteInstituteParserRuleCall_4_3_0()); 
            pushFollow(FOLLOW_2);
            ruleInstitute();

            state._fsp--;

             after(grammarAccess.getPresentationAccess().getInstituteInstituteParserRuleCall_4_3_0()); 

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
    // $ANTLR end "rule__Presentation__InstituteAssignment_4_3"


    // $ANTLR start "rule__Presentation__DateAssignment_4_4"
    // InternalSlideOMatic.g:4243:1: rule__Presentation__DateAssignment_4_4 : ( ruleDate ) ;
    public final void rule__Presentation__DateAssignment_4_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4247:1: ( ( ruleDate ) )
            // InternalSlideOMatic.g:4248:2: ( ruleDate )
            {
            // InternalSlideOMatic.g:4248:2: ( ruleDate )
            // InternalSlideOMatic.g:4249:3: ruleDate
            {
             before(grammarAccess.getPresentationAccess().getDateDateParserRuleCall_4_4_0()); 
            pushFollow(FOLLOW_2);
            ruleDate();

            state._fsp--;

             after(grammarAccess.getPresentationAccess().getDateDateParserRuleCall_4_4_0()); 

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
    // $ANTLR end "rule__Presentation__DateAssignment_4_4"


    // $ANTLR start "rule__Presentation__SlidesAssignment_5_0"
    // InternalSlideOMatic.g:4258:1: rule__Presentation__SlidesAssignment_5_0 : ( ruleSlide ) ;
    public final void rule__Presentation__SlidesAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4262:1: ( ( ruleSlide ) )
            // InternalSlideOMatic.g:4263:2: ( ruleSlide )
            {
            // InternalSlideOMatic.g:4263:2: ( ruleSlide )
            // InternalSlideOMatic.g:4264:3: ruleSlide
            {
             before(grammarAccess.getPresentationAccess().getSlidesSlideParserRuleCall_5_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSlide();

            state._fsp--;

             after(grammarAccess.getPresentationAccess().getSlidesSlideParserRuleCall_5_0_0()); 

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
    // $ANTLR end "rule__Presentation__SlidesAssignment_5_0"


    // $ANTLR start "rule__Presentation__AnimationsAssignment_5_1"
    // InternalSlideOMatic.g:4273:1: rule__Presentation__AnimationsAssignment_5_1 : ( ruleAnimation ) ;
    public final void rule__Presentation__AnimationsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4277:1: ( ( ruleAnimation ) )
            // InternalSlideOMatic.g:4278:2: ( ruleAnimation )
            {
            // InternalSlideOMatic.g:4278:2: ( ruleAnimation )
            // InternalSlideOMatic.g:4279:3: ruleAnimation
            {
             before(grammarAccess.getPresentationAccess().getAnimationsAnimationParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAnimation();

            state._fsp--;

             after(grammarAccess.getPresentationAccess().getAnimationsAnimationParserRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__Presentation__AnimationsAssignment_5_1"


    // $ANTLR start "rule__Theme__ThemeAssignment_1"
    // InternalSlideOMatic.g:4288:1: rule__Theme__ThemeAssignment_1 : ( ruleBeamerTheme ) ;
    public final void rule__Theme__ThemeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4292:1: ( ( ruleBeamerTheme ) )
            // InternalSlideOMatic.g:4293:2: ( ruleBeamerTheme )
            {
            // InternalSlideOMatic.g:4293:2: ( ruleBeamerTheme )
            // InternalSlideOMatic.g:4294:3: ruleBeamerTheme
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
    // InternalSlideOMatic.g:4303:1: rule__Theme__ThemeColorAssignment_2_1 : ( ruleThemeColor ) ;
    public final void rule__Theme__ThemeColorAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4307:1: ( ( ruleThemeColor ) )
            // InternalSlideOMatic.g:4308:2: ( ruleThemeColor )
            {
            // InternalSlideOMatic.g:4308:2: ( ruleThemeColor )
            // InternalSlideOMatic.g:4309:3: ruleThemeColor
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
    // InternalSlideOMatic.g:4318:1: rule__Authors__NamesAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Authors__NamesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4322:1: ( ( RULE_STRING ) )
            // InternalSlideOMatic.g:4323:2: ( RULE_STRING )
            {
            // InternalSlideOMatic.g:4323:2: ( RULE_STRING )
            // InternalSlideOMatic.g:4324:3: RULE_STRING
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
    // InternalSlideOMatic.g:4333:1: rule__Authors__NamesAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__Authors__NamesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4337:1: ( ( RULE_STRING ) )
            // InternalSlideOMatic.g:4338:2: ( RULE_STRING )
            {
            // InternalSlideOMatic.g:4338:2: ( RULE_STRING )
            // InternalSlideOMatic.g:4339:3: RULE_STRING
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
    // InternalSlideOMatic.g:4348:1: rule__Institute__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Institute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4352:1: ( ( RULE_STRING ) )
            // InternalSlideOMatic.g:4353:2: ( RULE_STRING )
            {
            // InternalSlideOMatic.g:4353:2: ( RULE_STRING )
            // InternalSlideOMatic.g:4354:3: RULE_STRING
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
    // InternalSlideOMatic.g:4363:1: rule__Date__DateAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Date__DateAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4367:1: ( ( RULE_STRING ) )
            // InternalSlideOMatic.g:4368:2: ( RULE_STRING )
            {
            // InternalSlideOMatic.g:4368:2: ( RULE_STRING )
            // InternalSlideOMatic.g:4369:3: RULE_STRING
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


    // $ANTLR start "rule__Slide__SecAssignment_1_0_0"
    // InternalSlideOMatic.g:4378:1: rule__Slide__SecAssignment_1_0_0 : ( ruleSection ) ;
    public final void rule__Slide__SecAssignment_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4382:1: ( ( ruleSection ) )
            // InternalSlideOMatic.g:4383:2: ( ruleSection )
            {
            // InternalSlideOMatic.g:4383:2: ( ruleSection )
            // InternalSlideOMatic.g:4384:3: ruleSection
            {
             before(grammarAccess.getSlideAccess().getSecSectionParserRuleCall_1_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSection();

            state._fsp--;

             after(grammarAccess.getSlideAccess().getSecSectionParserRuleCall_1_0_0_0()); 

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
    // $ANTLR end "rule__Slide__SecAssignment_1_0_0"


    // $ANTLR start "rule__Slide__NameAssignment_1_0_1"
    // InternalSlideOMatic.g:4393:1: rule__Slide__NameAssignment_1_0_1 : ( RULE_STRING ) ;
    public final void rule__Slide__NameAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4397:1: ( ( RULE_STRING ) )
            // InternalSlideOMatic.g:4398:2: ( RULE_STRING )
            {
            // InternalSlideOMatic.g:4398:2: ( RULE_STRING )
            // InternalSlideOMatic.g:4399:3: RULE_STRING
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
    // InternalSlideOMatic.g:4408:1: rule__Slide__NameAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__Slide__NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4412:1: ( ( RULE_STRING ) )
            // InternalSlideOMatic.g:4413:2: ( RULE_STRING )
            {
            // InternalSlideOMatic.g:4413:2: ( RULE_STRING )
            // InternalSlideOMatic.g:4414:3: RULE_STRING
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
    // InternalSlideOMatic.g:4423:1: rule__Slide__ContentsAssignment_3 : ( ruleContent ) ;
    public final void rule__Slide__ContentsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4427:1: ( ( ruleContent ) )
            // InternalSlideOMatic.g:4428:2: ( ruleContent )
            {
            // InternalSlideOMatic.g:4428:2: ( ruleContent )
            // InternalSlideOMatic.g:4429:3: ruleContent
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


    // $ANTLR start "rule__Text__TextAssignment_1"
    // InternalSlideOMatic.g:4438:1: rule__Text__TextAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Text__TextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4442:1: ( ( RULE_STRING ) )
            // InternalSlideOMatic.g:4443:2: ( RULE_STRING )
            {
            // InternalSlideOMatic.g:4443:2: ( RULE_STRING )
            // InternalSlideOMatic.g:4444:3: RULE_STRING
            {
             before(grammarAccess.getTextAccess().getTextSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTextAccess().getTextSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Text__TextAssignment_1"


    // $ANTLR start "rule__Text__ClickAssignment_2"
    // InternalSlideOMatic.g:4453:1: rule__Text__ClickAssignment_2 : ( ruleClick ) ;
    public final void rule__Text__ClickAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4457:1: ( ( ruleClick ) )
            // InternalSlideOMatic.g:4458:2: ( ruleClick )
            {
            // InternalSlideOMatic.g:4458:2: ( ruleClick )
            // InternalSlideOMatic.g:4459:3: ruleClick
            {
             before(grammarAccess.getTextAccess().getClickClickParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleClick();

            state._fsp--;

             after(grammarAccess.getTextAccess().getClickClickParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Text__ClickAssignment_2"


    // $ANTLR start "rule__Block__NameAssignment_1"
    // InternalSlideOMatic.g:4468:1: rule__Block__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Block__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4472:1: ( ( RULE_STRING ) )
            // InternalSlideOMatic.g:4473:2: ( RULE_STRING )
            {
            // InternalSlideOMatic.g:4473:2: ( RULE_STRING )
            // InternalSlideOMatic.g:4474:3: RULE_STRING
            {
             before(grammarAccess.getBlockAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getBlockAccess().getNameSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Block__NameAssignment_1"


    // $ANTLR start "rule__Block__ContentAssignment_3"
    // InternalSlideOMatic.g:4483:1: rule__Block__ContentAssignment_3 : ( ruleBlockableContent ) ;
    public final void rule__Block__ContentAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4487:1: ( ( ruleBlockableContent ) )
            // InternalSlideOMatic.g:4488:2: ( ruleBlockableContent )
            {
            // InternalSlideOMatic.g:4488:2: ( ruleBlockableContent )
            // InternalSlideOMatic.g:4489:3: ruleBlockableContent
            {
             before(grammarAccess.getBlockAccess().getContentBlockableContentParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleBlockableContent();

            state._fsp--;

             after(grammarAccess.getBlockAccess().getContentBlockableContentParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Block__ContentAssignment_3"


    // $ANTLR start "rule__Block__ClickAssignment_5"
    // InternalSlideOMatic.g:4498:1: rule__Block__ClickAssignment_5 : ( ruleClick ) ;
    public final void rule__Block__ClickAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4502:1: ( ( ruleClick ) )
            // InternalSlideOMatic.g:4503:2: ( ruleClick )
            {
            // InternalSlideOMatic.g:4503:2: ( ruleClick )
            // InternalSlideOMatic.g:4504:3: ruleClick
            {
             before(grammarAccess.getBlockAccess().getClickClickParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleClick();

            state._fsp--;

             after(grammarAccess.getBlockAccess().getClickClickParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Block__ClickAssignment_5"


    // $ANTLR start "rule__NumberedList__ItemsAssignment_1"
    // InternalSlideOMatic.g:4513:1: rule__NumberedList__ItemsAssignment_1 : ( ruleListItem ) ;
    public final void rule__NumberedList__ItemsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4517:1: ( ( ruleListItem ) )
            // InternalSlideOMatic.g:4518:2: ( ruleListItem )
            {
            // InternalSlideOMatic.g:4518:2: ( ruleListItem )
            // InternalSlideOMatic.g:4519:3: ruleListItem
            {
             before(grammarAccess.getNumberedListAccess().getItemsListItemParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleListItem();

            state._fsp--;

             after(grammarAccess.getNumberedListAccess().getItemsListItemParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__NumberedList__ItemsAssignment_1"


    // $ANTLR start "rule__UnNumberedList__ItemsAssignment_1"
    // InternalSlideOMatic.g:4528:1: rule__UnNumberedList__ItemsAssignment_1 : ( ruleListItem ) ;
    public final void rule__UnNumberedList__ItemsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4532:1: ( ( ruleListItem ) )
            // InternalSlideOMatic.g:4533:2: ( ruleListItem )
            {
            // InternalSlideOMatic.g:4533:2: ( ruleListItem )
            // InternalSlideOMatic.g:4534:3: ruleListItem
            {
             before(grammarAccess.getUnNumberedListAccess().getItemsListItemParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleListItem();

            state._fsp--;

             after(grammarAccess.getUnNumberedListAccess().getItemsListItemParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__UnNumberedList__ItemsAssignment_1"


    // $ANTLR start "rule__ListItem__ItemAssignment_1"
    // InternalSlideOMatic.g:4543:1: rule__ListItem__ItemAssignment_1 : ( RULE_STRING ) ;
    public final void rule__ListItem__ItemAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4547:1: ( ( RULE_STRING ) )
            // InternalSlideOMatic.g:4548:2: ( RULE_STRING )
            {
            // InternalSlideOMatic.g:4548:2: ( RULE_STRING )
            // InternalSlideOMatic.g:4549:3: RULE_STRING
            {
             before(grammarAccess.getListItemAccess().getItemSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getListItemAccess().getItemSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__ListItem__ItemAssignment_1"


    // $ANTLR start "rule__ListItem__NestedListAssignment_2_1"
    // InternalSlideOMatic.g:4558:1: rule__ListItem__NestedListAssignment_2_1 : ( ruleList ) ;
    public final void rule__ListItem__NestedListAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4562:1: ( ( ruleList ) )
            // InternalSlideOMatic.g:4563:2: ( ruleList )
            {
            // InternalSlideOMatic.g:4563:2: ( ruleList )
            // InternalSlideOMatic.g:4564:3: ruleList
            {
             before(grammarAccess.getListItemAccess().getNestedListListParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleList();

            state._fsp--;

             after(grammarAccess.getListItemAccess().getNestedListListParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__ListItem__NestedListAssignment_2_1"


    // $ANTLR start "rule__ListItem__ClickAssignment_3"
    // InternalSlideOMatic.g:4573:1: rule__ListItem__ClickAssignment_3 : ( ruleClick ) ;
    public final void rule__ListItem__ClickAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4577:1: ( ( ruleClick ) )
            // InternalSlideOMatic.g:4578:2: ( ruleClick )
            {
            // InternalSlideOMatic.g:4578:2: ( ruleClick )
            // InternalSlideOMatic.g:4579:3: ruleClick
            {
             before(grammarAccess.getListItemAccess().getClickClickParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleClick();

            state._fsp--;

             after(grammarAccess.getListItemAccess().getClickClickParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__ListItem__ClickAssignment_3"


    // $ANTLR start "rule__Image__NameAssignment_1"
    // InternalSlideOMatic.g:4588:1: rule__Image__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Image__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4592:1: ( ( RULE_ID ) )
            // InternalSlideOMatic.g:4593:2: ( RULE_ID )
            {
            // InternalSlideOMatic.g:4593:2: ( RULE_ID )
            // InternalSlideOMatic.g:4594:3: RULE_ID
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
    // InternalSlideOMatic.g:4603:1: rule__Image__SrcAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Image__SrcAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4607:1: ( ( RULE_STRING ) )
            // InternalSlideOMatic.g:4608:2: ( RULE_STRING )
            {
            // InternalSlideOMatic.g:4608:2: ( RULE_STRING )
            // InternalSlideOMatic.g:4609:3: RULE_STRING
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
    // InternalSlideOMatic.g:4618:1: rule__Image__AlignmentAssignment_4 : ( ruleAlignment ) ;
    public final void rule__Image__AlignmentAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4622:1: ( ( ruleAlignment ) )
            // InternalSlideOMatic.g:4623:2: ( ruleAlignment )
            {
            // InternalSlideOMatic.g:4623:2: ( ruleAlignment )
            // InternalSlideOMatic.g:4624:3: ruleAlignment
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
    // InternalSlideOMatic.g:4633:1: rule__Image__SizeAssignment_5 : ( ruleSize ) ;
    public final void rule__Image__SizeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4637:1: ( ( ruleSize ) )
            // InternalSlideOMatic.g:4638:2: ( ruleSize )
            {
            // InternalSlideOMatic.g:4638:2: ( ruleSize )
            // InternalSlideOMatic.g:4639:3: ruleSize
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


    // $ANTLR start "rule__Image__ClickAssignment_6"
    // InternalSlideOMatic.g:4648:1: rule__Image__ClickAssignment_6 : ( ruleClick ) ;
    public final void rule__Image__ClickAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4652:1: ( ( ruleClick ) )
            // InternalSlideOMatic.g:4653:2: ( ruleClick )
            {
            // InternalSlideOMatic.g:4653:2: ( ruleClick )
            // InternalSlideOMatic.g:4654:3: ruleClick
            {
             before(grammarAccess.getImageAccess().getClickClickParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleClick();

            state._fsp--;

             after(grammarAccess.getImageAccess().getClickClickParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__Image__ClickAssignment_6"


    // $ANTLR start "rule__Size__WayAssignment_0_1"
    // InternalSlideOMatic.g:4663:1: rule__Size__WayAssignment_0_1 : ( ( rule__Size__WayAlternatives_0_1_0 ) ) ;
    public final void rule__Size__WayAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4667:1: ( ( ( rule__Size__WayAlternatives_0_1_0 ) ) )
            // InternalSlideOMatic.g:4668:2: ( ( rule__Size__WayAlternatives_0_1_0 ) )
            {
            // InternalSlideOMatic.g:4668:2: ( ( rule__Size__WayAlternatives_0_1_0 ) )
            // InternalSlideOMatic.g:4669:3: ( rule__Size__WayAlternatives_0_1_0 )
            {
             before(grammarAccess.getSizeAccess().getWayAlternatives_0_1_0()); 
            // InternalSlideOMatic.g:4670:3: ( rule__Size__WayAlternatives_0_1_0 )
            // InternalSlideOMatic.g:4670:4: rule__Size__WayAlternatives_0_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Size__WayAlternatives_0_1_0();

            state._fsp--;


            }

             after(grammarAccess.getSizeAccess().getWayAlternatives_0_1_0()); 

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
    // $ANTLR end "rule__Size__WayAssignment_0_1"


    // $ANTLR start "rule__Size__ScaleAssignment_0_2"
    // InternalSlideOMatic.g:4678:1: rule__Size__ScaleAssignment_0_2 : ( RULE_INT ) ;
    public final void rule__Size__ScaleAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4682:1: ( ( RULE_INT ) )
            // InternalSlideOMatic.g:4683:2: ( RULE_INT )
            {
            // InternalSlideOMatic.g:4683:2: ( RULE_INT )
            // InternalSlideOMatic.g:4684:3: RULE_INT
            {
             before(grammarAccess.getSizeAccess().getScaleINTTerminalRuleCall_0_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getSizeAccess().getScaleINTTerminalRuleCall_0_2_0()); 

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
    // $ANTLR end "rule__Size__ScaleAssignment_0_2"


    // $ANTLR start "rule__Size__SizeAssignment_1_1"
    // InternalSlideOMatic.g:4693:1: rule__Size__SizeAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__Size__SizeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4697:1: ( ( RULE_INT ) )
            // InternalSlideOMatic.g:4698:2: ( RULE_INT )
            {
            // InternalSlideOMatic.g:4698:2: ( RULE_INT )
            // InternalSlideOMatic.g:4699:3: RULE_INT
            {
             before(grammarAccess.getSizeAccess().getSizeINTTerminalRuleCall_1_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getSizeAccess().getSizeINTTerminalRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Size__SizeAssignment_1_1"


    // $ANTLR start "rule__Size__UnitAssignment_1_2"
    // InternalSlideOMatic.g:4708:1: rule__Size__UnitAssignment_1_2 : ( ( rule__Size__UnitAlternatives_1_2_0 ) ) ;
    public final void rule__Size__UnitAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4712:1: ( ( ( rule__Size__UnitAlternatives_1_2_0 ) ) )
            // InternalSlideOMatic.g:4713:2: ( ( rule__Size__UnitAlternatives_1_2_0 ) )
            {
            // InternalSlideOMatic.g:4713:2: ( ( rule__Size__UnitAlternatives_1_2_0 ) )
            // InternalSlideOMatic.g:4714:3: ( rule__Size__UnitAlternatives_1_2_0 )
            {
             before(grammarAccess.getSizeAccess().getUnitAlternatives_1_2_0()); 
            // InternalSlideOMatic.g:4715:3: ( rule__Size__UnitAlternatives_1_2_0 )
            // InternalSlideOMatic.g:4715:4: rule__Size__UnitAlternatives_1_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Size__UnitAlternatives_1_2_0();

            state._fsp--;


            }

             after(grammarAccess.getSizeAccess().getUnitAlternatives_1_2_0()); 

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
    // $ANTLR end "rule__Size__UnitAssignment_1_2"


    // $ANTLR start "rule__Table__NameAssignment_1"
    // InternalSlideOMatic.g:4723:1: rule__Table__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Table__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4727:1: ( ( RULE_ID ) )
            // InternalSlideOMatic.g:4728:2: ( RULE_ID )
            {
            // InternalSlideOMatic.g:4728:2: ( RULE_ID )
            // InternalSlideOMatic.g:4729:3: RULE_ID
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
    // InternalSlideOMatic.g:4738:1: rule__Table__RowsAssignment_3 : ( ruleTableRow ) ;
    public final void rule__Table__RowsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4742:1: ( ( ruleTableRow ) )
            // InternalSlideOMatic.g:4743:2: ( ruleTableRow )
            {
            // InternalSlideOMatic.g:4743:2: ( ruleTableRow )
            // InternalSlideOMatic.g:4744:3: ruleTableRow
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
    // InternalSlideOMatic.g:4753:1: rule__Table__RowsAssignment_4_1 : ( ruleTableRow ) ;
    public final void rule__Table__RowsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4757:1: ( ( ruleTableRow ) )
            // InternalSlideOMatic.g:4758:2: ( ruleTableRow )
            {
            // InternalSlideOMatic.g:4758:2: ( ruleTableRow )
            // InternalSlideOMatic.g:4759:3: ruleTableRow
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
    // InternalSlideOMatic.g:4768:1: rule__TableRow__ValuesAssignment_1 : ( RULE_STRING ) ;
    public final void rule__TableRow__ValuesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4772:1: ( ( RULE_STRING ) )
            // InternalSlideOMatic.g:4773:2: ( RULE_STRING )
            {
            // InternalSlideOMatic.g:4773:2: ( RULE_STRING )
            // InternalSlideOMatic.g:4774:3: RULE_STRING
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
    // InternalSlideOMatic.g:4783:1: rule__TableRow__ValuesAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__TableRow__ValuesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4787:1: ( ( RULE_STRING ) )
            // InternalSlideOMatic.g:4788:2: ( RULE_STRING )
            {
            // InternalSlideOMatic.g:4788:2: ( RULE_STRING )
            // InternalSlideOMatic.g:4789:3: RULE_STRING
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


    // $ANTLR start "rule__Code__LangAssignment_1"
    // InternalSlideOMatic.g:4798:1: rule__Code__LangAssignment_1 : ( RULE_ID ) ;
    public final void rule__Code__LangAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4802:1: ( ( RULE_ID ) )
            // InternalSlideOMatic.g:4803:2: ( RULE_ID )
            {
            // InternalSlideOMatic.g:4803:2: ( RULE_ID )
            // InternalSlideOMatic.g:4804:3: RULE_ID
            {
             before(grammarAccess.getCodeAccess().getLangIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCodeAccess().getLangIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Code__LangAssignment_1"


    // $ANTLR start "rule__Code__CodeAssignment_2"
    // InternalSlideOMatic.g:4813:1: rule__Code__CodeAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Code__CodeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4817:1: ( ( RULE_STRING ) )
            // InternalSlideOMatic.g:4818:2: ( RULE_STRING )
            {
            // InternalSlideOMatic.g:4818:2: ( RULE_STRING )
            // InternalSlideOMatic.g:4819:3: RULE_STRING
            {
             before(grammarAccess.getCodeAccess().getCodeSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCodeAccess().getCodeSTRINGTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Code__CodeAssignment_2"


    // $ANTLR start "rule__Animation__TargetAssignment_1"
    // InternalSlideOMatic.g:4828:1: rule__Animation__TargetAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Animation__TargetAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4832:1: ( ( ( RULE_ID ) ) )
            // InternalSlideOMatic.g:4833:2: ( ( RULE_ID ) )
            {
            // InternalSlideOMatic.g:4833:2: ( ( RULE_ID ) )
            // InternalSlideOMatic.g:4834:3: ( RULE_ID )
            {
             before(grammarAccess.getAnimationAccess().getTargetFloatsCrossReference_1_0()); 
            // InternalSlideOMatic.g:4835:3: ( RULE_ID )
            // InternalSlideOMatic.g:4836:4: RULE_ID
            {
             before(grammarAccess.getAnimationAccess().getTargetFloatsIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAnimationAccess().getTargetFloatsIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getAnimationAccess().getTargetFloatsCrossReference_1_0()); 

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
    // InternalSlideOMatic.g:4847:1: rule__Animation__TypeAssignment_2 : ( ruleAnimationType ) ;
    public final void rule__Animation__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4851:1: ( ( ruleAnimationType ) )
            // InternalSlideOMatic.g:4852:2: ( ruleAnimationType )
            {
            // InternalSlideOMatic.g:4852:2: ( ruleAnimationType )
            // InternalSlideOMatic.g:4853:3: ruleAnimationType
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
    // InternalSlideOMatic.g:4862:1: rule__Animation__LocationAssignment_4 : ( ruleAlignment ) ;
    public final void rule__Animation__LocationAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4866:1: ( ( ruleAlignment ) )
            // InternalSlideOMatic.g:4867:2: ( ruleAlignment )
            {
            // InternalSlideOMatic.g:4867:2: ( ruleAlignment )
            // InternalSlideOMatic.g:4868:3: ruleAlignment
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
    // InternalSlideOMatic.g:4877:1: rule__Animation__SizeAssignment_5 : ( ruleSize ) ;
    public final void rule__Animation__SizeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4881:1: ( ( ruleSize ) )
            // InternalSlideOMatic.g:4882:2: ( ruleSize )
            {
            // InternalSlideOMatic.g:4882:2: ( ruleSize )
            // InternalSlideOMatic.g:4883:3: ruleSize
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
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000080L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000000L,0x0000000400020300L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000002L,0x0000000400020000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000000L,0x000000000001AC00L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000FFFFFFF000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00FFFF0000400000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000010L,0x00000000001C0080L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000000L,0x000000024BE00000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000002L,0x000000024BE00000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000000L,0x00000000001C0000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000000L,0x000000004BC00000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000800L,0x0000000000000200L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000000L,0x0000000003000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0xFF00000000000040L,0x0000000000000007L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000038L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000000L,0x0000000100004000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000000L,0x0000003000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0xFF00000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});

}