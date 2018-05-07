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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'$$'", "'AnnArbor'", "'Antibes'", "'Bergen'", "'Berkeley'", "'Berlin'", "'Boadilla'", "'boxes'", "'CambridgeUS'", "'Copenhagen'", "'Darmstadt'", "'default'", "'Dresden'", "'Frankfurt'", "'Goettingen'", "'Hannover'", "'Ilmanau'", "'JuanLesPins'", "'Luebeck'", "'Madrid'", "'Malmoe'", "'Marburg'", "'Montpellier'", "'PaloAlto'", "'Pittsburgh'", "'Rochester'", "'Singapore'", "'Szeged'", "'Warsaw'", "'albatros'", "'beaver'", "'beetle'", "'crane'", "'dolphin'", "'dove'", "'fly'", "'lily'", "'orchid'", "'rose'", "'seagull'", "'seahorse'", "'sidebartab'", "'structure'", "'whale'", "'wolverine'", "'author'", "'authors'", "'topleft'", "'top'", "'topright'", "'left'", "'center'", "'right'", "'bottomleft'", "'bottom'", "'bottomright'", "'cm'", "'em'", "'mm'", "'presentation'", "'{'", "'}'", "'('", "')'", "'theme'", "'color'", "','", "'institute'", "'date'", "'*'", "'slide'", "'**'", "'***'", "'ToC'", "'block'", "'#list'", "'&list'", "'-'", "'img'", "'src'", "'%'", "'width'", "'height'", "'tab'", "'['", "']'", "'```'", "'animate'", "'to'", "'move'", "'jump'"
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
    // InternalSlideOMatic.g:287:1: ruleContent : ( ( rule__Content__Group__0 ) ) ;
    public final void ruleContent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:291:2: ( ( ( rule__Content__Group__0 ) ) )
            // InternalSlideOMatic.g:292:2: ( ( rule__Content__Group__0 ) )
            {
            // InternalSlideOMatic.g:292:2: ( ( rule__Content__Group__0 ) )
            // InternalSlideOMatic.g:293:3: ( rule__Content__Group__0 )
            {
             before(grammarAccess.getContentAccess().getGroup()); 
            // InternalSlideOMatic.g:294:3: ( rule__Content__Group__0 )
            // InternalSlideOMatic.g:294:4: rule__Content__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Content__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getContentAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleToC"
    // InternalSlideOMatic.g:303:1: entryRuleToC : ruleToC EOF ;
    public final void entryRuleToC() throws RecognitionException {
        try {
            // InternalSlideOMatic.g:304:1: ( ruleToC EOF )
            // InternalSlideOMatic.g:305:1: ruleToC EOF
            {
             before(grammarAccess.getToCRule()); 
            pushFollow(FOLLOW_1);
            ruleToC();

            state._fsp--;

             after(grammarAccess.getToCRule()); 
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
    // $ANTLR end "entryRuleToC"


    // $ANTLR start "ruleToC"
    // InternalSlideOMatic.g:312:1: ruleToC : ( ( rule__ToC__Alternatives ) ) ;
    public final void ruleToC() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:316:2: ( ( ( rule__ToC__Alternatives ) ) )
            // InternalSlideOMatic.g:317:2: ( ( rule__ToC__Alternatives ) )
            {
            // InternalSlideOMatic.g:317:2: ( ( rule__ToC__Alternatives ) )
            // InternalSlideOMatic.g:318:3: ( rule__ToC__Alternatives )
            {
             before(grammarAccess.getToCAccess().getAlternatives()); 
            // InternalSlideOMatic.g:319:3: ( rule__ToC__Alternatives )
            // InternalSlideOMatic.g:319:4: rule__ToC__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ToC__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getToCAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleToC"


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
    // InternalSlideOMatic.g:337:1: ruleText : ( ( rule__Text__TextAssignment ) ) ;
    public final void ruleText() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:341:2: ( ( ( rule__Text__TextAssignment ) ) )
            // InternalSlideOMatic.g:342:2: ( ( rule__Text__TextAssignment ) )
            {
            // InternalSlideOMatic.g:342:2: ( ( rule__Text__TextAssignment ) )
            // InternalSlideOMatic.g:343:3: ( rule__Text__TextAssignment )
            {
             before(grammarAccess.getTextAccess().getTextAssignment()); 
            // InternalSlideOMatic.g:344:3: ( rule__Text__TextAssignment )
            // InternalSlideOMatic.g:344:4: rule__Text__TextAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Text__TextAssignment();

            state._fsp--;


            }

             after(grammarAccess.getTextAccess().getTextAssignment()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleImage"
    // InternalSlideOMatic.g:478:1: entryRuleImage : ruleImage EOF ;
    public final void entryRuleImage() throws RecognitionException {
        try {
            // InternalSlideOMatic.g:479:1: ( ruleImage EOF )
            // InternalSlideOMatic.g:480:1: ruleImage EOF
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
    // InternalSlideOMatic.g:487:1: ruleImage : ( ( rule__Image__Group__0 ) ) ;
    public final void ruleImage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:491:2: ( ( ( rule__Image__Group__0 ) ) )
            // InternalSlideOMatic.g:492:2: ( ( rule__Image__Group__0 ) )
            {
            // InternalSlideOMatic.g:492:2: ( ( rule__Image__Group__0 ) )
            // InternalSlideOMatic.g:493:3: ( rule__Image__Group__0 )
            {
             before(grammarAccess.getImageAccess().getGroup()); 
            // InternalSlideOMatic.g:494:3: ( rule__Image__Group__0 )
            // InternalSlideOMatic.g:494:4: rule__Image__Group__0
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
    // InternalSlideOMatic.g:503:1: entryRuleAlignment : ruleAlignment EOF ;
    public final void entryRuleAlignment() throws RecognitionException {
        try {
            // InternalSlideOMatic.g:504:1: ( ruleAlignment EOF )
            // InternalSlideOMatic.g:505:1: ruleAlignment EOF
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
    // InternalSlideOMatic.g:512:1: ruleAlignment : ( ( rule__Alignment__Alternatives ) ) ;
    public final void ruleAlignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:516:2: ( ( ( rule__Alignment__Alternatives ) ) )
            // InternalSlideOMatic.g:517:2: ( ( rule__Alignment__Alternatives ) )
            {
            // InternalSlideOMatic.g:517:2: ( ( rule__Alignment__Alternatives ) )
            // InternalSlideOMatic.g:518:3: ( rule__Alignment__Alternatives )
            {
             before(grammarAccess.getAlignmentAccess().getAlternatives()); 
            // InternalSlideOMatic.g:519:3: ( rule__Alignment__Alternatives )
            // InternalSlideOMatic.g:519:4: rule__Alignment__Alternatives
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
    // InternalSlideOMatic.g:528:1: entryRuleSize : ruleSize EOF ;
    public final void entryRuleSize() throws RecognitionException {
        try {
            // InternalSlideOMatic.g:529:1: ( ruleSize EOF )
            // InternalSlideOMatic.g:530:1: ruleSize EOF
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
    // InternalSlideOMatic.g:537:1: ruleSize : ( ( rule__Size__Alternatives ) ) ;
    public final void ruleSize() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:541:2: ( ( ( rule__Size__Alternatives ) ) )
            // InternalSlideOMatic.g:542:2: ( ( rule__Size__Alternatives ) )
            {
            // InternalSlideOMatic.g:542:2: ( ( rule__Size__Alternatives ) )
            // InternalSlideOMatic.g:543:3: ( rule__Size__Alternatives )
            {
             before(grammarAccess.getSizeAccess().getAlternatives()); 
            // InternalSlideOMatic.g:544:3: ( rule__Size__Alternatives )
            // InternalSlideOMatic.g:544:4: rule__Size__Alternatives
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


    // $ANTLR start "entryRuleWay"
    // InternalSlideOMatic.g:553:1: entryRuleWay : ruleWay EOF ;
    public final void entryRuleWay() throws RecognitionException {
        try {
            // InternalSlideOMatic.g:554:1: ( ruleWay EOF )
            // InternalSlideOMatic.g:555:1: ruleWay EOF
            {
             before(grammarAccess.getWayRule()); 
            pushFollow(FOLLOW_1);
            ruleWay();

            state._fsp--;

             after(grammarAccess.getWayRule()); 
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
    // $ANTLR end "entryRuleWay"


    // $ANTLR start "ruleWay"
    // InternalSlideOMatic.g:562:1: ruleWay : ( ( rule__Way__Alternatives ) ) ;
    public final void ruleWay() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:566:2: ( ( ( rule__Way__Alternatives ) ) )
            // InternalSlideOMatic.g:567:2: ( ( rule__Way__Alternatives ) )
            {
            // InternalSlideOMatic.g:567:2: ( ( rule__Way__Alternatives ) )
            // InternalSlideOMatic.g:568:3: ( rule__Way__Alternatives )
            {
             before(grammarAccess.getWayAccess().getAlternatives()); 
            // InternalSlideOMatic.g:569:3: ( rule__Way__Alternatives )
            // InternalSlideOMatic.g:569:4: rule__Way__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Way__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getWayAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWay"


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


    // $ANTLR start "rule__Authors__Alternatives_0"
    // InternalSlideOMatic.g:1036:1: rule__Authors__Alternatives_0 : ( ( 'author' ) | ( 'authors' ) );
    public final void rule__Authors__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1040:1: ( ( 'author' ) | ( 'authors' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==56) ) {
                alt4=1;
            }
            else if ( (LA4_0==57) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalSlideOMatic.g:1041:2: ( 'author' )
                    {
                    // InternalSlideOMatic.g:1041:2: ( 'author' )
                    // InternalSlideOMatic.g:1042:3: 'author'
                    {
                     before(grammarAccess.getAuthorsAccess().getAuthorKeyword_0_0()); 
                    match(input,56,FOLLOW_2); 
                     after(grammarAccess.getAuthorsAccess().getAuthorKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSlideOMatic.g:1047:2: ( 'authors' )
                    {
                    // InternalSlideOMatic.g:1047:2: ( 'authors' )
                    // InternalSlideOMatic.g:1048:3: 'authors'
                    {
                     before(grammarAccess.getAuthorsAccess().getAuthorsKeyword_0_1()); 
                    match(input,57,FOLLOW_2); 
                     after(grammarAccess.getAuthorsAccess().getAuthorsKeyword_0_1()); 

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
    // $ANTLR end "rule__Authors__Alternatives_0"


    // $ANTLR start "rule__Date__Alternatives_1"
    // InternalSlideOMatic.g:1057:1: rule__Date__Alternatives_1 : ( ( ( rule__Date__DateAssignment_1_0 ) ) | ( ( rule__Date__Group_1_1__0 ) ) );
    public final void rule__Date__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1061:1: ( ( ( rule__Date__DateAssignment_1_0 ) ) | ( ( rule__Date__Group_1_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            else if ( (LA5_0==80) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalSlideOMatic.g:1062:2: ( ( rule__Date__DateAssignment_1_0 ) )
                    {
                    // InternalSlideOMatic.g:1062:2: ( ( rule__Date__DateAssignment_1_0 ) )
                    // InternalSlideOMatic.g:1063:3: ( rule__Date__DateAssignment_1_0 )
                    {
                     before(grammarAccess.getDateAccess().getDateAssignment_1_0()); 
                    // InternalSlideOMatic.g:1064:3: ( rule__Date__DateAssignment_1_0 )
                    // InternalSlideOMatic.g:1064:4: rule__Date__DateAssignment_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Date__DateAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDateAccess().getDateAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSlideOMatic.g:1068:2: ( ( rule__Date__Group_1_1__0 ) )
                    {
                    // InternalSlideOMatic.g:1068:2: ( ( rule__Date__Group_1_1__0 ) )
                    // InternalSlideOMatic.g:1069:3: ( rule__Date__Group_1_1__0 )
                    {
                     before(grammarAccess.getDateAccess().getGroup_1_1()); 
                    // InternalSlideOMatic.g:1070:3: ( rule__Date__Group_1_1__0 )
                    // InternalSlideOMatic.g:1070:4: rule__Date__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Date__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDateAccess().getGroup_1_1()); 

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
    // $ANTLR end "rule__Date__Alternatives_1"


    // $ANTLR start "rule__Slide__Alternatives_1"
    // InternalSlideOMatic.g:1078:1: rule__Slide__Alternatives_1 : ( ( ( rule__Slide__Group_1_0__0 ) ) | ( ( rule__Slide__NameAssignment_1_1 ) ) );
    public final void rule__Slide__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1082:1: ( ( ( rule__Slide__Group_1_0__0 ) ) | ( ( rule__Slide__NameAssignment_1_1 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==80||(LA6_0>=82 && LA6_0<=83)) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_STRING) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalSlideOMatic.g:1083:2: ( ( rule__Slide__Group_1_0__0 ) )
                    {
                    // InternalSlideOMatic.g:1083:2: ( ( rule__Slide__Group_1_0__0 ) )
                    // InternalSlideOMatic.g:1084:3: ( rule__Slide__Group_1_0__0 )
                    {
                     before(grammarAccess.getSlideAccess().getGroup_1_0()); 
                    // InternalSlideOMatic.g:1085:3: ( rule__Slide__Group_1_0__0 )
                    // InternalSlideOMatic.g:1085:4: rule__Slide__Group_1_0__0
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
                    // InternalSlideOMatic.g:1089:2: ( ( rule__Slide__NameAssignment_1_1 ) )
                    {
                    // InternalSlideOMatic.g:1089:2: ( ( rule__Slide__NameAssignment_1_1 ) )
                    // InternalSlideOMatic.g:1090:3: ( rule__Slide__NameAssignment_1_1 )
                    {
                     before(grammarAccess.getSlideAccess().getNameAssignment_1_1()); 
                    // InternalSlideOMatic.g:1091:3: ( rule__Slide__NameAssignment_1_1 )
                    // InternalSlideOMatic.g:1091:4: rule__Slide__NameAssignment_1_1
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
    // InternalSlideOMatic.g:1099:1: rule__Section__Alternatives : ( ( ( rule__Section__Group_0__0 ) ) | ( ( rule__Section__Group_1__0 ) ) | ( ( rule__Section__Group_2__0 ) ) );
    public final void rule__Section__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1103:1: ( ( ( rule__Section__Group_0__0 ) ) | ( ( rule__Section__Group_1__0 ) ) | ( ( rule__Section__Group_2__0 ) ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 80:
                {
                alt7=1;
                }
                break;
            case 82:
                {
                alt7=2;
                }
                break;
            case 83:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalSlideOMatic.g:1104:2: ( ( rule__Section__Group_0__0 ) )
                    {
                    // InternalSlideOMatic.g:1104:2: ( ( rule__Section__Group_0__0 ) )
                    // InternalSlideOMatic.g:1105:3: ( rule__Section__Group_0__0 )
                    {
                     before(grammarAccess.getSectionAccess().getGroup_0()); 
                    // InternalSlideOMatic.g:1106:3: ( rule__Section__Group_0__0 )
                    // InternalSlideOMatic.g:1106:4: rule__Section__Group_0__0
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
                    // InternalSlideOMatic.g:1110:2: ( ( rule__Section__Group_1__0 ) )
                    {
                    // InternalSlideOMatic.g:1110:2: ( ( rule__Section__Group_1__0 ) )
                    // InternalSlideOMatic.g:1111:3: ( rule__Section__Group_1__0 )
                    {
                     before(grammarAccess.getSectionAccess().getGroup_1()); 
                    // InternalSlideOMatic.g:1112:3: ( rule__Section__Group_1__0 )
                    // InternalSlideOMatic.g:1112:4: rule__Section__Group_1__0
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
                    // InternalSlideOMatic.g:1116:2: ( ( rule__Section__Group_2__0 ) )
                    {
                    // InternalSlideOMatic.g:1116:2: ( ( rule__Section__Group_2__0 ) )
                    // InternalSlideOMatic.g:1117:3: ( rule__Section__Group_2__0 )
                    {
                     before(grammarAccess.getSectionAccess().getGroup_2()); 
                    // InternalSlideOMatic.g:1118:3: ( rule__Section__Group_2__0 )
                    // InternalSlideOMatic.g:1118:4: rule__Section__Group_2__0
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


    // $ANTLR start "rule__Content__Alternatives_0"
    // InternalSlideOMatic.g:1126:1: rule__Content__Alternatives_0 : ( ( ruleToC ) | ( ruleText ) | ( ruleBlock ) | ( ruleList ) | ( ruleImage ) | ( ruleTable ) | ( ruleCode ) );
    public final void rule__Content__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1130:1: ( ( ruleToC ) | ( ruleText ) | ( ruleBlock ) | ( ruleList ) | ( ruleImage ) | ( ruleTable ) | ( ruleCode ) )
            int alt8=7;
            switch ( input.LA(1) ) {
            case 84:
                {
                alt8=1;
                }
                break;
            case RULE_STRING:
                {
                alt8=2;
                }
                break;
            case 85:
                {
                alt8=3;
                }
                break;
            case 86:
            case 87:
                {
                alt8=4;
                }
                break;
            case 89:
                {
                alt8=5;
                }
                break;
            case 94:
                {
                alt8=6;
                }
                break;
            case 97:
                {
                alt8=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalSlideOMatic.g:1131:2: ( ruleToC )
                    {
                    // InternalSlideOMatic.g:1131:2: ( ruleToC )
                    // InternalSlideOMatic.g:1132:3: ruleToC
                    {
                     before(grammarAccess.getContentAccess().getToCParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleToC();

                    state._fsp--;

                     after(grammarAccess.getContentAccess().getToCParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSlideOMatic.g:1137:2: ( ruleText )
                    {
                    // InternalSlideOMatic.g:1137:2: ( ruleText )
                    // InternalSlideOMatic.g:1138:3: ruleText
                    {
                     before(grammarAccess.getContentAccess().getTextParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleText();

                    state._fsp--;

                     after(grammarAccess.getContentAccess().getTextParserRuleCall_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSlideOMatic.g:1143:2: ( ruleBlock )
                    {
                    // InternalSlideOMatic.g:1143:2: ( ruleBlock )
                    // InternalSlideOMatic.g:1144:3: ruleBlock
                    {
                     before(grammarAccess.getContentAccess().getBlockParserRuleCall_0_2()); 
                    pushFollow(FOLLOW_2);
                    ruleBlock();

                    state._fsp--;

                     after(grammarAccess.getContentAccess().getBlockParserRuleCall_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSlideOMatic.g:1149:2: ( ruleList )
                    {
                    // InternalSlideOMatic.g:1149:2: ( ruleList )
                    // InternalSlideOMatic.g:1150:3: ruleList
                    {
                     before(grammarAccess.getContentAccess().getListParserRuleCall_0_3()); 
                    pushFollow(FOLLOW_2);
                    ruleList();

                    state._fsp--;

                     after(grammarAccess.getContentAccess().getListParserRuleCall_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSlideOMatic.g:1155:2: ( ruleImage )
                    {
                    // InternalSlideOMatic.g:1155:2: ( ruleImage )
                    // InternalSlideOMatic.g:1156:3: ruleImage
                    {
                     before(grammarAccess.getContentAccess().getImageParserRuleCall_0_4()); 
                    pushFollow(FOLLOW_2);
                    ruleImage();

                    state._fsp--;

                     after(grammarAccess.getContentAccess().getImageParserRuleCall_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalSlideOMatic.g:1161:2: ( ruleTable )
                    {
                    // InternalSlideOMatic.g:1161:2: ( ruleTable )
                    // InternalSlideOMatic.g:1162:3: ruleTable
                    {
                     before(grammarAccess.getContentAccess().getTableParserRuleCall_0_5()); 
                    pushFollow(FOLLOW_2);
                    ruleTable();

                    state._fsp--;

                     after(grammarAccess.getContentAccess().getTableParserRuleCall_0_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalSlideOMatic.g:1167:2: ( ruleCode )
                    {
                    // InternalSlideOMatic.g:1167:2: ( ruleCode )
                    // InternalSlideOMatic.g:1168:3: ruleCode
                    {
                     before(grammarAccess.getContentAccess().getCodeParserRuleCall_0_6()); 
                    pushFollow(FOLLOW_2);
                    ruleCode();

                    state._fsp--;

                     after(grammarAccess.getContentAccess().getCodeParserRuleCall_0_6()); 

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
    // $ANTLR end "rule__Content__Alternatives_0"


    // $ANTLR start "rule__ToC__Alternatives"
    // InternalSlideOMatic.g:1177:1: rule__ToC__Alternatives : ( ( ( rule__ToC__Group_0__0 ) ) | ( ( rule__ToC__Group_1__0 ) ) );
    public final void rule__ToC__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1181:1: ( ( ( rule__ToC__Group_0__0 ) ) | ( ( rule__ToC__Group_1__0 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==84) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==80) ) {
                    alt9=2;
                }
                else if ( (LA9_1==EOF||LA9_1==RULE_STRING||LA9_1==11||LA9_1==72||(LA9_1>=84 && LA9_1<=87)||LA9_1==89||LA9_1==94||LA9_1==97) ) {
                    alt9=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalSlideOMatic.g:1182:2: ( ( rule__ToC__Group_0__0 ) )
                    {
                    // InternalSlideOMatic.g:1182:2: ( ( rule__ToC__Group_0__0 ) )
                    // InternalSlideOMatic.g:1183:3: ( rule__ToC__Group_0__0 )
                    {
                     before(grammarAccess.getToCAccess().getGroup_0()); 
                    // InternalSlideOMatic.g:1184:3: ( rule__ToC__Group_0__0 )
                    // InternalSlideOMatic.g:1184:4: rule__ToC__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ToC__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getToCAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSlideOMatic.g:1188:2: ( ( rule__ToC__Group_1__0 ) )
                    {
                    // InternalSlideOMatic.g:1188:2: ( ( rule__ToC__Group_1__0 ) )
                    // InternalSlideOMatic.g:1189:3: ( rule__ToC__Group_1__0 )
                    {
                     before(grammarAccess.getToCAccess().getGroup_1()); 
                    // InternalSlideOMatic.g:1190:3: ( rule__ToC__Group_1__0 )
                    // InternalSlideOMatic.g:1190:4: rule__ToC__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ToC__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getToCAccess().getGroup_1()); 

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
    // $ANTLR end "rule__ToC__Alternatives"


    // $ANTLR start "rule__List__Alternatives"
    // InternalSlideOMatic.g:1198:1: rule__List__Alternatives : ( ( ruleNumberedList ) | ( ruleUnNumberedList ) );
    public final void rule__List__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1202:1: ( ( ruleNumberedList ) | ( ruleUnNumberedList ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==86) ) {
                alt10=1;
            }
            else if ( (LA10_0==87) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalSlideOMatic.g:1203:2: ( ruleNumberedList )
                    {
                    // InternalSlideOMatic.g:1203:2: ( ruleNumberedList )
                    // InternalSlideOMatic.g:1204:3: ruleNumberedList
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
                    // InternalSlideOMatic.g:1209:2: ( ruleUnNumberedList )
                    {
                    // InternalSlideOMatic.g:1209:2: ( ruleUnNumberedList )
                    // InternalSlideOMatic.g:1210:3: ruleUnNumberedList
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


    // $ANTLR start "rule__Alignment__Alternatives"
    // InternalSlideOMatic.g:1219:1: rule__Alignment__Alternatives : ( ( 'topleft' ) | ( 'top' ) | ( 'topright' ) | ( 'left' ) | ( 'center' ) | ( 'right' ) | ( 'bottomleft' ) | ( 'bottom' ) | ( 'bottomright' ) );
    public final void rule__Alignment__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1223:1: ( ( 'topleft' ) | ( 'top' ) | ( 'topright' ) | ( 'left' ) | ( 'center' ) | ( 'right' ) | ( 'bottomleft' ) | ( 'bottom' ) | ( 'bottomright' ) )
            int alt11=9;
            switch ( input.LA(1) ) {
            case 58:
                {
                alt11=1;
                }
                break;
            case 59:
                {
                alt11=2;
                }
                break;
            case 60:
                {
                alt11=3;
                }
                break;
            case 61:
                {
                alt11=4;
                }
                break;
            case 62:
                {
                alt11=5;
                }
                break;
            case 63:
                {
                alt11=6;
                }
                break;
            case 64:
                {
                alt11=7;
                }
                break;
            case 65:
                {
                alt11=8;
                }
                break;
            case 66:
                {
                alt11=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalSlideOMatic.g:1224:2: ( 'topleft' )
                    {
                    // InternalSlideOMatic.g:1224:2: ( 'topleft' )
                    // InternalSlideOMatic.g:1225:3: 'topleft'
                    {
                     before(grammarAccess.getAlignmentAccess().getTopleftKeyword_0()); 
                    match(input,58,FOLLOW_2); 
                     after(grammarAccess.getAlignmentAccess().getTopleftKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSlideOMatic.g:1230:2: ( 'top' )
                    {
                    // InternalSlideOMatic.g:1230:2: ( 'top' )
                    // InternalSlideOMatic.g:1231:3: 'top'
                    {
                     before(grammarAccess.getAlignmentAccess().getTopKeyword_1()); 
                    match(input,59,FOLLOW_2); 
                     after(grammarAccess.getAlignmentAccess().getTopKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSlideOMatic.g:1236:2: ( 'topright' )
                    {
                    // InternalSlideOMatic.g:1236:2: ( 'topright' )
                    // InternalSlideOMatic.g:1237:3: 'topright'
                    {
                     before(grammarAccess.getAlignmentAccess().getToprightKeyword_2()); 
                    match(input,60,FOLLOW_2); 
                     after(grammarAccess.getAlignmentAccess().getToprightKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSlideOMatic.g:1242:2: ( 'left' )
                    {
                    // InternalSlideOMatic.g:1242:2: ( 'left' )
                    // InternalSlideOMatic.g:1243:3: 'left'
                    {
                     before(grammarAccess.getAlignmentAccess().getLeftKeyword_3()); 
                    match(input,61,FOLLOW_2); 
                     after(grammarAccess.getAlignmentAccess().getLeftKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSlideOMatic.g:1248:2: ( 'center' )
                    {
                    // InternalSlideOMatic.g:1248:2: ( 'center' )
                    // InternalSlideOMatic.g:1249:3: 'center'
                    {
                     before(grammarAccess.getAlignmentAccess().getCenterKeyword_4()); 
                    match(input,62,FOLLOW_2); 
                     after(grammarAccess.getAlignmentAccess().getCenterKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalSlideOMatic.g:1254:2: ( 'right' )
                    {
                    // InternalSlideOMatic.g:1254:2: ( 'right' )
                    // InternalSlideOMatic.g:1255:3: 'right'
                    {
                     before(grammarAccess.getAlignmentAccess().getRightKeyword_5()); 
                    match(input,63,FOLLOW_2); 
                     after(grammarAccess.getAlignmentAccess().getRightKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalSlideOMatic.g:1260:2: ( 'bottomleft' )
                    {
                    // InternalSlideOMatic.g:1260:2: ( 'bottomleft' )
                    // InternalSlideOMatic.g:1261:3: 'bottomleft'
                    {
                     before(grammarAccess.getAlignmentAccess().getBottomleftKeyword_6()); 
                    match(input,64,FOLLOW_2); 
                     after(grammarAccess.getAlignmentAccess().getBottomleftKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalSlideOMatic.g:1266:2: ( 'bottom' )
                    {
                    // InternalSlideOMatic.g:1266:2: ( 'bottom' )
                    // InternalSlideOMatic.g:1267:3: 'bottom'
                    {
                     before(grammarAccess.getAlignmentAccess().getBottomKeyword_7()); 
                    match(input,65,FOLLOW_2); 
                     after(grammarAccess.getAlignmentAccess().getBottomKeyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalSlideOMatic.g:1272:2: ( 'bottomright' )
                    {
                    // InternalSlideOMatic.g:1272:2: ( 'bottomright' )
                    // InternalSlideOMatic.g:1273:3: 'bottomright'
                    {
                     before(grammarAccess.getAlignmentAccess().getBottomrightKeyword_8()); 
                    match(input,66,FOLLOW_2); 
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
    // InternalSlideOMatic.g:1282:1: rule__Size__Alternatives : ( ( ( rule__Size__Group_0__0 ) ) | ( ( rule__Size__Group_1__0 ) ) );
    public final void rule__Size__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1286:1: ( ( ( rule__Size__Group_0__0 ) ) | ( ( rule__Size__Group_1__0 ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=92 && LA12_0<=93)) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_INT) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalSlideOMatic.g:1287:2: ( ( rule__Size__Group_0__0 ) )
                    {
                    // InternalSlideOMatic.g:1287:2: ( ( rule__Size__Group_0__0 ) )
                    // InternalSlideOMatic.g:1288:3: ( rule__Size__Group_0__0 )
                    {
                     before(grammarAccess.getSizeAccess().getGroup_0()); 
                    // InternalSlideOMatic.g:1289:3: ( rule__Size__Group_0__0 )
                    // InternalSlideOMatic.g:1289:4: rule__Size__Group_0__0
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
                    // InternalSlideOMatic.g:1293:2: ( ( rule__Size__Group_1__0 ) )
                    {
                    // InternalSlideOMatic.g:1293:2: ( ( rule__Size__Group_1__0 ) )
                    // InternalSlideOMatic.g:1294:3: ( rule__Size__Group_1__0 )
                    {
                     before(grammarAccess.getSizeAccess().getGroup_1()); 
                    // InternalSlideOMatic.g:1295:3: ( rule__Size__Group_1__0 )
                    // InternalSlideOMatic.g:1295:4: rule__Size__Group_1__0
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


    // $ANTLR start "rule__Size__UnitAlternatives_1_2_0"
    // InternalSlideOMatic.g:1303:1: rule__Size__UnitAlternatives_1_2_0 : ( ( 'cm' ) | ( 'em' ) | ( 'mm' ) );
    public final void rule__Size__UnitAlternatives_1_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1307:1: ( ( 'cm' ) | ( 'em' ) | ( 'mm' ) )
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
                    // InternalSlideOMatic.g:1308:2: ( 'cm' )
                    {
                    // InternalSlideOMatic.g:1308:2: ( 'cm' )
                    // InternalSlideOMatic.g:1309:3: 'cm'
                    {
                     before(grammarAccess.getSizeAccess().getUnitCmKeyword_1_2_0_0()); 
                    match(input,67,FOLLOW_2); 
                     after(grammarAccess.getSizeAccess().getUnitCmKeyword_1_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSlideOMatic.g:1314:2: ( 'em' )
                    {
                    // InternalSlideOMatic.g:1314:2: ( 'em' )
                    // InternalSlideOMatic.g:1315:3: 'em'
                    {
                     before(grammarAccess.getSizeAccess().getUnitEmKeyword_1_2_0_1()); 
                    match(input,68,FOLLOW_2); 
                     after(grammarAccess.getSizeAccess().getUnitEmKeyword_1_2_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSlideOMatic.g:1320:2: ( 'mm' )
                    {
                    // InternalSlideOMatic.g:1320:2: ( 'mm' )
                    // InternalSlideOMatic.g:1321:3: 'mm'
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


    // $ANTLR start "rule__Way__Alternatives"
    // InternalSlideOMatic.g:1330:1: rule__Way__Alternatives : ( ( ( rule__Way__Group_0__0 ) ) | ( ( rule__Way__Group_1__0 ) ) );
    public final void rule__Way__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1334:1: ( ( ( rule__Way__Group_0__0 ) ) | ( ( rule__Way__Group_1__0 ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==92) ) {
                alt14=1;
            }
            else if ( (LA14_0==93) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalSlideOMatic.g:1335:2: ( ( rule__Way__Group_0__0 ) )
                    {
                    // InternalSlideOMatic.g:1335:2: ( ( rule__Way__Group_0__0 ) )
                    // InternalSlideOMatic.g:1336:3: ( rule__Way__Group_0__0 )
                    {
                     before(grammarAccess.getWayAccess().getGroup_0()); 
                    // InternalSlideOMatic.g:1337:3: ( rule__Way__Group_0__0 )
                    // InternalSlideOMatic.g:1337:4: rule__Way__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Way__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getWayAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSlideOMatic.g:1341:2: ( ( rule__Way__Group_1__0 ) )
                    {
                    // InternalSlideOMatic.g:1341:2: ( ( rule__Way__Group_1__0 ) )
                    // InternalSlideOMatic.g:1342:3: ( rule__Way__Group_1__0 )
                    {
                     before(grammarAccess.getWayAccess().getGroup_1()); 
                    // InternalSlideOMatic.g:1343:3: ( rule__Way__Group_1__0 )
                    // InternalSlideOMatic.g:1343:4: rule__Way__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Way__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getWayAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Way__Alternatives"


    // $ANTLR start "rule__AnimationType__Alternatives"
    // InternalSlideOMatic.g:1351:1: rule__AnimationType__Alternatives : ( ( ( rule__AnimationType__Group_0__0 ) ) | ( ( rule__AnimationType__Group_1__0 ) ) );
    public final void rule__AnimationType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1355:1: ( ( ( rule__AnimationType__Group_0__0 ) ) | ( ( rule__AnimationType__Group_1__0 ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==100) ) {
                alt15=1;
            }
            else if ( (LA15_0==101) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalSlideOMatic.g:1356:2: ( ( rule__AnimationType__Group_0__0 ) )
                    {
                    // InternalSlideOMatic.g:1356:2: ( ( rule__AnimationType__Group_0__0 ) )
                    // InternalSlideOMatic.g:1357:3: ( rule__AnimationType__Group_0__0 )
                    {
                     before(grammarAccess.getAnimationTypeAccess().getGroup_0()); 
                    // InternalSlideOMatic.g:1358:3: ( rule__AnimationType__Group_0__0 )
                    // InternalSlideOMatic.g:1358:4: rule__AnimationType__Group_0__0
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
                    // InternalSlideOMatic.g:1362:2: ( ( rule__AnimationType__Group_1__0 ) )
                    {
                    // InternalSlideOMatic.g:1362:2: ( ( rule__AnimationType__Group_1__0 ) )
                    // InternalSlideOMatic.g:1363:3: ( rule__AnimationType__Group_1__0 )
                    {
                     before(grammarAccess.getAnimationTypeAccess().getGroup_1()); 
                    // InternalSlideOMatic.g:1364:3: ( rule__AnimationType__Group_1__0 )
                    // InternalSlideOMatic.g:1364:4: rule__AnimationType__Group_1__0
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
    // InternalSlideOMatic.g:1372:1: rule__Presentation__Group__0 : rule__Presentation__Group__0__Impl rule__Presentation__Group__1 ;
    public final void rule__Presentation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1376:1: ( rule__Presentation__Group__0__Impl rule__Presentation__Group__1 )
            // InternalSlideOMatic.g:1377:2: rule__Presentation__Group__0__Impl rule__Presentation__Group__1
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
    // InternalSlideOMatic.g:1384:1: rule__Presentation__Group__0__Impl : ( 'presentation' ) ;
    public final void rule__Presentation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1388:1: ( ( 'presentation' ) )
            // InternalSlideOMatic.g:1389:1: ( 'presentation' )
            {
            // InternalSlideOMatic.g:1389:1: ( 'presentation' )
            // InternalSlideOMatic.g:1390:2: 'presentation'
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
    // InternalSlideOMatic.g:1399:1: rule__Presentation__Group__1 : rule__Presentation__Group__1__Impl rule__Presentation__Group__2 ;
    public final void rule__Presentation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1403:1: ( rule__Presentation__Group__1__Impl rule__Presentation__Group__2 )
            // InternalSlideOMatic.g:1404:2: rule__Presentation__Group__1__Impl rule__Presentation__Group__2
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
    // InternalSlideOMatic.g:1411:1: rule__Presentation__Group__1__Impl : ( ( rule__Presentation__NameAssignment_1 ) ) ;
    public final void rule__Presentation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1415:1: ( ( ( rule__Presentation__NameAssignment_1 ) ) )
            // InternalSlideOMatic.g:1416:1: ( ( rule__Presentation__NameAssignment_1 ) )
            {
            // InternalSlideOMatic.g:1416:1: ( ( rule__Presentation__NameAssignment_1 ) )
            // InternalSlideOMatic.g:1417:2: ( rule__Presentation__NameAssignment_1 )
            {
             before(grammarAccess.getPresentationAccess().getNameAssignment_1()); 
            // InternalSlideOMatic.g:1418:2: ( rule__Presentation__NameAssignment_1 )
            // InternalSlideOMatic.g:1418:3: rule__Presentation__NameAssignment_1
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
    // InternalSlideOMatic.g:1426:1: rule__Presentation__Group__2 : rule__Presentation__Group__2__Impl rule__Presentation__Group__3 ;
    public final void rule__Presentation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1430:1: ( rule__Presentation__Group__2__Impl rule__Presentation__Group__3 )
            // InternalSlideOMatic.g:1431:2: rule__Presentation__Group__2__Impl rule__Presentation__Group__3
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
    // InternalSlideOMatic.g:1438:1: rule__Presentation__Group__2__Impl : ( ( rule__Presentation__SubtitleAssignment_2 )? ) ;
    public final void rule__Presentation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1442:1: ( ( ( rule__Presentation__SubtitleAssignment_2 )? ) )
            // InternalSlideOMatic.g:1443:1: ( ( rule__Presentation__SubtitleAssignment_2 )? )
            {
            // InternalSlideOMatic.g:1443:1: ( ( rule__Presentation__SubtitleAssignment_2 )? )
            // InternalSlideOMatic.g:1444:2: ( rule__Presentation__SubtitleAssignment_2 )?
            {
             before(grammarAccess.getPresentationAccess().getSubtitleAssignment_2()); 
            // InternalSlideOMatic.g:1445:2: ( rule__Presentation__SubtitleAssignment_2 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_STRING) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalSlideOMatic.g:1445:3: rule__Presentation__SubtitleAssignment_2
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
    // InternalSlideOMatic.g:1453:1: rule__Presentation__Group__3 : rule__Presentation__Group__3__Impl rule__Presentation__Group__4 ;
    public final void rule__Presentation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1457:1: ( rule__Presentation__Group__3__Impl rule__Presentation__Group__4 )
            // InternalSlideOMatic.g:1458:2: rule__Presentation__Group__3__Impl rule__Presentation__Group__4
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
    // InternalSlideOMatic.g:1465:1: rule__Presentation__Group__3__Impl : ( '{' ) ;
    public final void rule__Presentation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1469:1: ( ( '{' ) )
            // InternalSlideOMatic.g:1470:1: ( '{' )
            {
            // InternalSlideOMatic.g:1470:1: ( '{' )
            // InternalSlideOMatic.g:1471:2: '{'
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
    // InternalSlideOMatic.g:1480:1: rule__Presentation__Group__4 : rule__Presentation__Group__4__Impl rule__Presentation__Group__5 ;
    public final void rule__Presentation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1484:1: ( rule__Presentation__Group__4__Impl rule__Presentation__Group__5 )
            // InternalSlideOMatic.g:1485:2: rule__Presentation__Group__4__Impl rule__Presentation__Group__5
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
    // InternalSlideOMatic.g:1492:1: rule__Presentation__Group__4__Impl : ( ( rule__Presentation__Group_4__0 )? ) ;
    public final void rule__Presentation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1496:1: ( ( ( rule__Presentation__Group_4__0 )? ) )
            // InternalSlideOMatic.g:1497:1: ( ( rule__Presentation__Group_4__0 )? )
            {
            // InternalSlideOMatic.g:1497:1: ( ( rule__Presentation__Group_4__0 )? )
            // InternalSlideOMatic.g:1498:2: ( rule__Presentation__Group_4__0 )?
            {
             before(grammarAccess.getPresentationAccess().getGroup_4()); 
            // InternalSlideOMatic.g:1499:2: ( rule__Presentation__Group_4__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==73) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalSlideOMatic.g:1499:3: rule__Presentation__Group_4__0
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
    // InternalSlideOMatic.g:1507:1: rule__Presentation__Group__5 : rule__Presentation__Group__5__Impl rule__Presentation__Group__6 ;
    public final void rule__Presentation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1511:1: ( rule__Presentation__Group__5__Impl rule__Presentation__Group__6 )
            // InternalSlideOMatic.g:1512:2: rule__Presentation__Group__5__Impl rule__Presentation__Group__6
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
    // InternalSlideOMatic.g:1519:1: rule__Presentation__Group__5__Impl : ( ( rule__Presentation__Alternatives_5 )* ) ;
    public final void rule__Presentation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1523:1: ( ( ( rule__Presentation__Alternatives_5 )* ) )
            // InternalSlideOMatic.g:1524:1: ( ( rule__Presentation__Alternatives_5 )* )
            {
            // InternalSlideOMatic.g:1524:1: ( ( rule__Presentation__Alternatives_5 )* )
            // InternalSlideOMatic.g:1525:2: ( rule__Presentation__Alternatives_5 )*
            {
             before(grammarAccess.getPresentationAccess().getAlternatives_5()); 
            // InternalSlideOMatic.g:1526:2: ( rule__Presentation__Alternatives_5 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==81||LA18_0==98) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalSlideOMatic.g:1526:3: rule__Presentation__Alternatives_5
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Presentation__Alternatives_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // InternalSlideOMatic.g:1534:1: rule__Presentation__Group__6 : rule__Presentation__Group__6__Impl ;
    public final void rule__Presentation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1538:1: ( rule__Presentation__Group__6__Impl )
            // InternalSlideOMatic.g:1539:2: rule__Presentation__Group__6__Impl
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
    // InternalSlideOMatic.g:1545:1: rule__Presentation__Group__6__Impl : ( '}' ) ;
    public final void rule__Presentation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1549:1: ( ( '}' ) )
            // InternalSlideOMatic.g:1550:1: ( '}' )
            {
            // InternalSlideOMatic.g:1550:1: ( '}' )
            // InternalSlideOMatic.g:1551:2: '}'
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
    // InternalSlideOMatic.g:1561:1: rule__Presentation__Group_4__0 : rule__Presentation__Group_4__0__Impl rule__Presentation__Group_4__1 ;
    public final void rule__Presentation__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1565:1: ( rule__Presentation__Group_4__0__Impl rule__Presentation__Group_4__1 )
            // InternalSlideOMatic.g:1566:2: rule__Presentation__Group_4__0__Impl rule__Presentation__Group_4__1
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
    // InternalSlideOMatic.g:1573:1: rule__Presentation__Group_4__0__Impl : ( '(' ) ;
    public final void rule__Presentation__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1577:1: ( ( '(' ) )
            // InternalSlideOMatic.g:1578:1: ( '(' )
            {
            // InternalSlideOMatic.g:1578:1: ( '(' )
            // InternalSlideOMatic.g:1579:2: '('
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
    // InternalSlideOMatic.g:1588:1: rule__Presentation__Group_4__1 : rule__Presentation__Group_4__1__Impl rule__Presentation__Group_4__2 ;
    public final void rule__Presentation__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1592:1: ( rule__Presentation__Group_4__1__Impl rule__Presentation__Group_4__2 )
            // InternalSlideOMatic.g:1593:2: rule__Presentation__Group_4__1__Impl rule__Presentation__Group_4__2
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
    // InternalSlideOMatic.g:1600:1: rule__Presentation__Group_4__1__Impl : ( ( rule__Presentation__ThemeAssignment_4_1 )? ) ;
    public final void rule__Presentation__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1604:1: ( ( ( rule__Presentation__ThemeAssignment_4_1 )? ) )
            // InternalSlideOMatic.g:1605:1: ( ( rule__Presentation__ThemeAssignment_4_1 )? )
            {
            // InternalSlideOMatic.g:1605:1: ( ( rule__Presentation__ThemeAssignment_4_1 )? )
            // InternalSlideOMatic.g:1606:2: ( rule__Presentation__ThemeAssignment_4_1 )?
            {
             before(grammarAccess.getPresentationAccess().getThemeAssignment_4_1()); 
            // InternalSlideOMatic.g:1607:2: ( rule__Presentation__ThemeAssignment_4_1 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==75) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalSlideOMatic.g:1607:3: rule__Presentation__ThemeAssignment_4_1
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
    // InternalSlideOMatic.g:1615:1: rule__Presentation__Group_4__2 : rule__Presentation__Group_4__2__Impl rule__Presentation__Group_4__3 ;
    public final void rule__Presentation__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1619:1: ( rule__Presentation__Group_4__2__Impl rule__Presentation__Group_4__3 )
            // InternalSlideOMatic.g:1620:2: rule__Presentation__Group_4__2__Impl rule__Presentation__Group_4__3
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
    // InternalSlideOMatic.g:1627:1: rule__Presentation__Group_4__2__Impl : ( ( rule__Presentation__AuthorsAssignment_4_2 )? ) ;
    public final void rule__Presentation__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1631:1: ( ( ( rule__Presentation__AuthorsAssignment_4_2 )? ) )
            // InternalSlideOMatic.g:1632:1: ( ( rule__Presentation__AuthorsAssignment_4_2 )? )
            {
            // InternalSlideOMatic.g:1632:1: ( ( rule__Presentation__AuthorsAssignment_4_2 )? )
            // InternalSlideOMatic.g:1633:2: ( rule__Presentation__AuthorsAssignment_4_2 )?
            {
             before(grammarAccess.getPresentationAccess().getAuthorsAssignment_4_2()); 
            // InternalSlideOMatic.g:1634:2: ( rule__Presentation__AuthorsAssignment_4_2 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=56 && LA20_0<=57)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalSlideOMatic.g:1634:3: rule__Presentation__AuthorsAssignment_4_2
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
    // InternalSlideOMatic.g:1642:1: rule__Presentation__Group_4__3 : rule__Presentation__Group_4__3__Impl rule__Presentation__Group_4__4 ;
    public final void rule__Presentation__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1646:1: ( rule__Presentation__Group_4__3__Impl rule__Presentation__Group_4__4 )
            // InternalSlideOMatic.g:1647:2: rule__Presentation__Group_4__3__Impl rule__Presentation__Group_4__4
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
    // InternalSlideOMatic.g:1654:1: rule__Presentation__Group_4__3__Impl : ( ( rule__Presentation__InstituteAssignment_4_3 )? ) ;
    public final void rule__Presentation__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1658:1: ( ( ( rule__Presentation__InstituteAssignment_4_3 )? ) )
            // InternalSlideOMatic.g:1659:1: ( ( rule__Presentation__InstituteAssignment_4_3 )? )
            {
            // InternalSlideOMatic.g:1659:1: ( ( rule__Presentation__InstituteAssignment_4_3 )? )
            // InternalSlideOMatic.g:1660:2: ( rule__Presentation__InstituteAssignment_4_3 )?
            {
             before(grammarAccess.getPresentationAccess().getInstituteAssignment_4_3()); 
            // InternalSlideOMatic.g:1661:2: ( rule__Presentation__InstituteAssignment_4_3 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==78) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalSlideOMatic.g:1661:3: rule__Presentation__InstituteAssignment_4_3
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
    // InternalSlideOMatic.g:1669:1: rule__Presentation__Group_4__4 : rule__Presentation__Group_4__4__Impl rule__Presentation__Group_4__5 ;
    public final void rule__Presentation__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1673:1: ( rule__Presentation__Group_4__4__Impl rule__Presentation__Group_4__5 )
            // InternalSlideOMatic.g:1674:2: rule__Presentation__Group_4__4__Impl rule__Presentation__Group_4__5
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
    // InternalSlideOMatic.g:1681:1: rule__Presentation__Group_4__4__Impl : ( ( rule__Presentation__DateAssignment_4_4 )? ) ;
    public final void rule__Presentation__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1685:1: ( ( ( rule__Presentation__DateAssignment_4_4 )? ) )
            // InternalSlideOMatic.g:1686:1: ( ( rule__Presentation__DateAssignment_4_4 )? )
            {
            // InternalSlideOMatic.g:1686:1: ( ( rule__Presentation__DateAssignment_4_4 )? )
            // InternalSlideOMatic.g:1687:2: ( rule__Presentation__DateAssignment_4_4 )?
            {
             before(grammarAccess.getPresentationAccess().getDateAssignment_4_4()); 
            // InternalSlideOMatic.g:1688:2: ( rule__Presentation__DateAssignment_4_4 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==79) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalSlideOMatic.g:1688:3: rule__Presentation__DateAssignment_4_4
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
    // InternalSlideOMatic.g:1696:1: rule__Presentation__Group_4__5 : rule__Presentation__Group_4__5__Impl ;
    public final void rule__Presentation__Group_4__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1700:1: ( rule__Presentation__Group_4__5__Impl )
            // InternalSlideOMatic.g:1701:2: rule__Presentation__Group_4__5__Impl
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
    // InternalSlideOMatic.g:1707:1: rule__Presentation__Group_4__5__Impl : ( ')' ) ;
    public final void rule__Presentation__Group_4__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1711:1: ( ( ')' ) )
            // InternalSlideOMatic.g:1712:1: ( ')' )
            {
            // InternalSlideOMatic.g:1712:1: ( ')' )
            // InternalSlideOMatic.g:1713:2: ')'
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
    // InternalSlideOMatic.g:1723:1: rule__Theme__Group__0 : rule__Theme__Group__0__Impl rule__Theme__Group__1 ;
    public final void rule__Theme__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1727:1: ( rule__Theme__Group__0__Impl rule__Theme__Group__1 )
            // InternalSlideOMatic.g:1728:2: rule__Theme__Group__0__Impl rule__Theme__Group__1
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
    // InternalSlideOMatic.g:1735:1: rule__Theme__Group__0__Impl : ( 'theme' ) ;
    public final void rule__Theme__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1739:1: ( ( 'theme' ) )
            // InternalSlideOMatic.g:1740:1: ( 'theme' )
            {
            // InternalSlideOMatic.g:1740:1: ( 'theme' )
            // InternalSlideOMatic.g:1741:2: 'theme'
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
    // InternalSlideOMatic.g:1750:1: rule__Theme__Group__1 : rule__Theme__Group__1__Impl rule__Theme__Group__2 ;
    public final void rule__Theme__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1754:1: ( rule__Theme__Group__1__Impl rule__Theme__Group__2 )
            // InternalSlideOMatic.g:1755:2: rule__Theme__Group__1__Impl rule__Theme__Group__2
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
    // InternalSlideOMatic.g:1762:1: rule__Theme__Group__1__Impl : ( ( rule__Theme__ThemeAssignment_1 ) ) ;
    public final void rule__Theme__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1766:1: ( ( ( rule__Theme__ThemeAssignment_1 ) ) )
            // InternalSlideOMatic.g:1767:1: ( ( rule__Theme__ThemeAssignment_1 ) )
            {
            // InternalSlideOMatic.g:1767:1: ( ( rule__Theme__ThemeAssignment_1 ) )
            // InternalSlideOMatic.g:1768:2: ( rule__Theme__ThemeAssignment_1 )
            {
             before(grammarAccess.getThemeAccess().getThemeAssignment_1()); 
            // InternalSlideOMatic.g:1769:2: ( rule__Theme__ThemeAssignment_1 )
            // InternalSlideOMatic.g:1769:3: rule__Theme__ThemeAssignment_1
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
    // InternalSlideOMatic.g:1777:1: rule__Theme__Group__2 : rule__Theme__Group__2__Impl ;
    public final void rule__Theme__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1781:1: ( rule__Theme__Group__2__Impl )
            // InternalSlideOMatic.g:1782:2: rule__Theme__Group__2__Impl
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
    // InternalSlideOMatic.g:1788:1: rule__Theme__Group__2__Impl : ( ( rule__Theme__Group_2__0 )? ) ;
    public final void rule__Theme__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1792:1: ( ( ( rule__Theme__Group_2__0 )? ) )
            // InternalSlideOMatic.g:1793:1: ( ( rule__Theme__Group_2__0 )? )
            {
            // InternalSlideOMatic.g:1793:1: ( ( rule__Theme__Group_2__0 )? )
            // InternalSlideOMatic.g:1794:2: ( rule__Theme__Group_2__0 )?
            {
             before(grammarAccess.getThemeAccess().getGroup_2()); 
            // InternalSlideOMatic.g:1795:2: ( rule__Theme__Group_2__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==76) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalSlideOMatic.g:1795:3: rule__Theme__Group_2__0
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
    // InternalSlideOMatic.g:1804:1: rule__Theme__Group_2__0 : rule__Theme__Group_2__0__Impl rule__Theme__Group_2__1 ;
    public final void rule__Theme__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1808:1: ( rule__Theme__Group_2__0__Impl rule__Theme__Group_2__1 )
            // InternalSlideOMatic.g:1809:2: rule__Theme__Group_2__0__Impl rule__Theme__Group_2__1
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
    // InternalSlideOMatic.g:1816:1: rule__Theme__Group_2__0__Impl : ( 'color' ) ;
    public final void rule__Theme__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1820:1: ( ( 'color' ) )
            // InternalSlideOMatic.g:1821:1: ( 'color' )
            {
            // InternalSlideOMatic.g:1821:1: ( 'color' )
            // InternalSlideOMatic.g:1822:2: 'color'
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
    // InternalSlideOMatic.g:1831:1: rule__Theme__Group_2__1 : rule__Theme__Group_2__1__Impl ;
    public final void rule__Theme__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1835:1: ( rule__Theme__Group_2__1__Impl )
            // InternalSlideOMatic.g:1836:2: rule__Theme__Group_2__1__Impl
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
    // InternalSlideOMatic.g:1842:1: rule__Theme__Group_2__1__Impl : ( ( rule__Theme__ThemeColorAssignment_2_1 ) ) ;
    public final void rule__Theme__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1846:1: ( ( ( rule__Theme__ThemeColorAssignment_2_1 ) ) )
            // InternalSlideOMatic.g:1847:1: ( ( rule__Theme__ThemeColorAssignment_2_1 ) )
            {
            // InternalSlideOMatic.g:1847:1: ( ( rule__Theme__ThemeColorAssignment_2_1 ) )
            // InternalSlideOMatic.g:1848:2: ( rule__Theme__ThemeColorAssignment_2_1 )
            {
             before(grammarAccess.getThemeAccess().getThemeColorAssignment_2_1()); 
            // InternalSlideOMatic.g:1849:2: ( rule__Theme__ThemeColorAssignment_2_1 )
            // InternalSlideOMatic.g:1849:3: rule__Theme__ThemeColorAssignment_2_1
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
    // InternalSlideOMatic.g:1858:1: rule__Authors__Group__0 : rule__Authors__Group__0__Impl rule__Authors__Group__1 ;
    public final void rule__Authors__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1862:1: ( rule__Authors__Group__0__Impl rule__Authors__Group__1 )
            // InternalSlideOMatic.g:1863:2: rule__Authors__Group__0__Impl rule__Authors__Group__1
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
    // InternalSlideOMatic.g:1870:1: rule__Authors__Group__0__Impl : ( ( rule__Authors__Alternatives_0 ) ) ;
    public final void rule__Authors__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1874:1: ( ( ( rule__Authors__Alternatives_0 ) ) )
            // InternalSlideOMatic.g:1875:1: ( ( rule__Authors__Alternatives_0 ) )
            {
            // InternalSlideOMatic.g:1875:1: ( ( rule__Authors__Alternatives_0 ) )
            // InternalSlideOMatic.g:1876:2: ( rule__Authors__Alternatives_0 )
            {
             before(grammarAccess.getAuthorsAccess().getAlternatives_0()); 
            // InternalSlideOMatic.g:1877:2: ( rule__Authors__Alternatives_0 )
            // InternalSlideOMatic.g:1877:3: rule__Authors__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Authors__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getAuthorsAccess().getAlternatives_0()); 

            }


            }

        }
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
    // InternalSlideOMatic.g:1885:1: rule__Authors__Group__1 : rule__Authors__Group__1__Impl rule__Authors__Group__2 ;
    public final void rule__Authors__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1889:1: ( rule__Authors__Group__1__Impl rule__Authors__Group__2 )
            // InternalSlideOMatic.g:1890:2: rule__Authors__Group__1__Impl rule__Authors__Group__2
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
    // InternalSlideOMatic.g:1897:1: rule__Authors__Group__1__Impl : ( ( rule__Authors__NamesAssignment_1 ) ) ;
    public final void rule__Authors__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1901:1: ( ( ( rule__Authors__NamesAssignment_1 ) ) )
            // InternalSlideOMatic.g:1902:1: ( ( rule__Authors__NamesAssignment_1 ) )
            {
            // InternalSlideOMatic.g:1902:1: ( ( rule__Authors__NamesAssignment_1 ) )
            // InternalSlideOMatic.g:1903:2: ( rule__Authors__NamesAssignment_1 )
            {
             before(grammarAccess.getAuthorsAccess().getNamesAssignment_1()); 
            // InternalSlideOMatic.g:1904:2: ( rule__Authors__NamesAssignment_1 )
            // InternalSlideOMatic.g:1904:3: rule__Authors__NamesAssignment_1
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
    // InternalSlideOMatic.g:1912:1: rule__Authors__Group__2 : rule__Authors__Group__2__Impl ;
    public final void rule__Authors__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1916:1: ( rule__Authors__Group__2__Impl )
            // InternalSlideOMatic.g:1917:2: rule__Authors__Group__2__Impl
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
    // InternalSlideOMatic.g:1923:1: rule__Authors__Group__2__Impl : ( ( rule__Authors__Group_2__0 )* ) ;
    public final void rule__Authors__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1927:1: ( ( ( rule__Authors__Group_2__0 )* ) )
            // InternalSlideOMatic.g:1928:1: ( ( rule__Authors__Group_2__0 )* )
            {
            // InternalSlideOMatic.g:1928:1: ( ( rule__Authors__Group_2__0 )* )
            // InternalSlideOMatic.g:1929:2: ( rule__Authors__Group_2__0 )*
            {
             before(grammarAccess.getAuthorsAccess().getGroup_2()); 
            // InternalSlideOMatic.g:1930:2: ( rule__Authors__Group_2__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==77) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalSlideOMatic.g:1930:3: rule__Authors__Group_2__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Authors__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // InternalSlideOMatic.g:1939:1: rule__Authors__Group_2__0 : rule__Authors__Group_2__0__Impl rule__Authors__Group_2__1 ;
    public final void rule__Authors__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1943:1: ( rule__Authors__Group_2__0__Impl rule__Authors__Group_2__1 )
            // InternalSlideOMatic.g:1944:2: rule__Authors__Group_2__0__Impl rule__Authors__Group_2__1
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
    // InternalSlideOMatic.g:1951:1: rule__Authors__Group_2__0__Impl : ( ',' ) ;
    public final void rule__Authors__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1955:1: ( ( ',' ) )
            // InternalSlideOMatic.g:1956:1: ( ',' )
            {
            // InternalSlideOMatic.g:1956:1: ( ',' )
            // InternalSlideOMatic.g:1957:2: ','
            {
             before(grammarAccess.getAuthorsAccess().getCommaKeyword_2_0()); 
            match(input,77,FOLLOW_2); 
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
    // InternalSlideOMatic.g:1966:1: rule__Authors__Group_2__1 : rule__Authors__Group_2__1__Impl ;
    public final void rule__Authors__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1970:1: ( rule__Authors__Group_2__1__Impl )
            // InternalSlideOMatic.g:1971:2: rule__Authors__Group_2__1__Impl
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
    // InternalSlideOMatic.g:1977:1: rule__Authors__Group_2__1__Impl : ( ( rule__Authors__NamesAssignment_2_1 ) ) ;
    public final void rule__Authors__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1981:1: ( ( ( rule__Authors__NamesAssignment_2_1 ) ) )
            // InternalSlideOMatic.g:1982:1: ( ( rule__Authors__NamesAssignment_2_1 ) )
            {
            // InternalSlideOMatic.g:1982:1: ( ( rule__Authors__NamesAssignment_2_1 ) )
            // InternalSlideOMatic.g:1983:2: ( rule__Authors__NamesAssignment_2_1 )
            {
             before(grammarAccess.getAuthorsAccess().getNamesAssignment_2_1()); 
            // InternalSlideOMatic.g:1984:2: ( rule__Authors__NamesAssignment_2_1 )
            // InternalSlideOMatic.g:1984:3: rule__Authors__NamesAssignment_2_1
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
    // InternalSlideOMatic.g:1993:1: rule__Institute__Group__0 : rule__Institute__Group__0__Impl rule__Institute__Group__1 ;
    public final void rule__Institute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1997:1: ( rule__Institute__Group__0__Impl rule__Institute__Group__1 )
            // InternalSlideOMatic.g:1998:2: rule__Institute__Group__0__Impl rule__Institute__Group__1
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
    // InternalSlideOMatic.g:2005:1: rule__Institute__Group__0__Impl : ( 'institute' ) ;
    public final void rule__Institute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2009:1: ( ( 'institute' ) )
            // InternalSlideOMatic.g:2010:1: ( 'institute' )
            {
            // InternalSlideOMatic.g:2010:1: ( 'institute' )
            // InternalSlideOMatic.g:2011:2: 'institute'
            {
             before(grammarAccess.getInstituteAccess().getInstituteKeyword_0()); 
            match(input,78,FOLLOW_2); 
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
    // InternalSlideOMatic.g:2020:1: rule__Institute__Group__1 : rule__Institute__Group__1__Impl ;
    public final void rule__Institute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2024:1: ( rule__Institute__Group__1__Impl )
            // InternalSlideOMatic.g:2025:2: rule__Institute__Group__1__Impl
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
    // InternalSlideOMatic.g:2031:1: rule__Institute__Group__1__Impl : ( ( rule__Institute__NameAssignment_1 ) ) ;
    public final void rule__Institute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2035:1: ( ( ( rule__Institute__NameAssignment_1 ) ) )
            // InternalSlideOMatic.g:2036:1: ( ( rule__Institute__NameAssignment_1 ) )
            {
            // InternalSlideOMatic.g:2036:1: ( ( rule__Institute__NameAssignment_1 ) )
            // InternalSlideOMatic.g:2037:2: ( rule__Institute__NameAssignment_1 )
            {
             before(grammarAccess.getInstituteAccess().getNameAssignment_1()); 
            // InternalSlideOMatic.g:2038:2: ( rule__Institute__NameAssignment_1 )
            // InternalSlideOMatic.g:2038:3: rule__Institute__NameAssignment_1
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
    // InternalSlideOMatic.g:2047:1: rule__Date__Group__0 : rule__Date__Group__0__Impl rule__Date__Group__1 ;
    public final void rule__Date__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2051:1: ( rule__Date__Group__0__Impl rule__Date__Group__1 )
            // InternalSlideOMatic.g:2052:2: rule__Date__Group__0__Impl rule__Date__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalSlideOMatic.g:2059:1: rule__Date__Group__0__Impl : ( 'date' ) ;
    public final void rule__Date__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2063:1: ( ( 'date' ) )
            // InternalSlideOMatic.g:2064:1: ( 'date' )
            {
            // InternalSlideOMatic.g:2064:1: ( 'date' )
            // InternalSlideOMatic.g:2065:2: 'date'
            {
             before(grammarAccess.getDateAccess().getDateKeyword_0()); 
            match(input,79,FOLLOW_2); 
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
    // InternalSlideOMatic.g:2074:1: rule__Date__Group__1 : rule__Date__Group__1__Impl ;
    public final void rule__Date__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2078:1: ( rule__Date__Group__1__Impl )
            // InternalSlideOMatic.g:2079:2: rule__Date__Group__1__Impl
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
    // InternalSlideOMatic.g:2085:1: rule__Date__Group__1__Impl : ( ( rule__Date__Alternatives_1 ) ) ;
    public final void rule__Date__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2089:1: ( ( ( rule__Date__Alternatives_1 ) ) )
            // InternalSlideOMatic.g:2090:1: ( ( rule__Date__Alternatives_1 ) )
            {
            // InternalSlideOMatic.g:2090:1: ( ( rule__Date__Alternatives_1 ) )
            // InternalSlideOMatic.g:2091:2: ( rule__Date__Alternatives_1 )
            {
             before(grammarAccess.getDateAccess().getAlternatives_1()); 
            // InternalSlideOMatic.g:2092:2: ( rule__Date__Alternatives_1 )
            // InternalSlideOMatic.g:2092:3: rule__Date__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__Date__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getDateAccess().getAlternatives_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Date__Group_1_1__0"
    // InternalSlideOMatic.g:2101:1: rule__Date__Group_1_1__0 : rule__Date__Group_1_1__0__Impl rule__Date__Group_1_1__1 ;
    public final void rule__Date__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2105:1: ( rule__Date__Group_1_1__0__Impl rule__Date__Group_1_1__1 )
            // InternalSlideOMatic.g:2106:2: rule__Date__Group_1_1__0__Impl rule__Date__Group_1_1__1
            {
            pushFollow(FOLLOW_13);
            rule__Date__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Date__Group_1_1__1();

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
    // $ANTLR end "rule__Date__Group_1_1__0"


    // $ANTLR start "rule__Date__Group_1_1__0__Impl"
    // InternalSlideOMatic.g:2113:1: rule__Date__Group_1_1__0__Impl : ( () ) ;
    public final void rule__Date__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2117:1: ( ( () ) )
            // InternalSlideOMatic.g:2118:1: ( () )
            {
            // InternalSlideOMatic.g:2118:1: ( () )
            // InternalSlideOMatic.g:2119:2: ()
            {
             before(grammarAccess.getDateAccess().getCompileDateAction_1_1_0()); 
            // InternalSlideOMatic.g:2120:2: ()
            // InternalSlideOMatic.g:2120:3: 
            {
            }

             after(grammarAccess.getDateAccess().getCompileDateAction_1_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group_1_1__0__Impl"


    // $ANTLR start "rule__Date__Group_1_1__1"
    // InternalSlideOMatic.g:2128:1: rule__Date__Group_1_1__1 : rule__Date__Group_1_1__1__Impl ;
    public final void rule__Date__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2132:1: ( rule__Date__Group_1_1__1__Impl )
            // InternalSlideOMatic.g:2133:2: rule__Date__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Date__Group_1_1__1__Impl();

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
    // $ANTLR end "rule__Date__Group_1_1__1"


    // $ANTLR start "rule__Date__Group_1_1__1__Impl"
    // InternalSlideOMatic.g:2139:1: rule__Date__Group_1_1__1__Impl : ( '*' ) ;
    public final void rule__Date__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2143:1: ( ( '*' ) )
            // InternalSlideOMatic.g:2144:1: ( '*' )
            {
            // InternalSlideOMatic.g:2144:1: ( '*' )
            // InternalSlideOMatic.g:2145:2: '*'
            {
             before(grammarAccess.getDateAccess().getAsteriskKeyword_1_1_1()); 
            match(input,80,FOLLOW_2); 
             after(grammarAccess.getDateAccess().getAsteriskKeyword_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group_1_1__1__Impl"


    // $ANTLR start "rule__Slide__Group__0"
    // InternalSlideOMatic.g:2155:1: rule__Slide__Group__0 : rule__Slide__Group__0__Impl rule__Slide__Group__1 ;
    public final void rule__Slide__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2159:1: ( rule__Slide__Group__0__Impl rule__Slide__Group__1 )
            // InternalSlideOMatic.g:2160:2: rule__Slide__Group__0__Impl rule__Slide__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalSlideOMatic.g:2167:1: rule__Slide__Group__0__Impl : ( 'slide' ) ;
    public final void rule__Slide__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2171:1: ( ( 'slide' ) )
            // InternalSlideOMatic.g:2172:1: ( 'slide' )
            {
            // InternalSlideOMatic.g:2172:1: ( 'slide' )
            // InternalSlideOMatic.g:2173:2: 'slide'
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
    // InternalSlideOMatic.g:2182:1: rule__Slide__Group__1 : rule__Slide__Group__1__Impl rule__Slide__Group__2 ;
    public final void rule__Slide__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2186:1: ( rule__Slide__Group__1__Impl rule__Slide__Group__2 )
            // InternalSlideOMatic.g:2187:2: rule__Slide__Group__1__Impl rule__Slide__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalSlideOMatic.g:2194:1: rule__Slide__Group__1__Impl : ( ( rule__Slide__Alternatives_1 )? ) ;
    public final void rule__Slide__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2198:1: ( ( ( rule__Slide__Alternatives_1 )? ) )
            // InternalSlideOMatic.g:2199:1: ( ( rule__Slide__Alternatives_1 )? )
            {
            // InternalSlideOMatic.g:2199:1: ( ( rule__Slide__Alternatives_1 )? )
            // InternalSlideOMatic.g:2200:2: ( rule__Slide__Alternatives_1 )?
            {
             before(grammarAccess.getSlideAccess().getAlternatives_1()); 
            // InternalSlideOMatic.g:2201:2: ( rule__Slide__Alternatives_1 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_STRING||LA25_0==80||(LA25_0>=82 && LA25_0<=83)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalSlideOMatic.g:2201:3: rule__Slide__Alternatives_1
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
    // InternalSlideOMatic.g:2209:1: rule__Slide__Group__2 : rule__Slide__Group__2__Impl rule__Slide__Group__3 ;
    public final void rule__Slide__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2213:1: ( rule__Slide__Group__2__Impl rule__Slide__Group__3 )
            // InternalSlideOMatic.g:2214:2: rule__Slide__Group__2__Impl rule__Slide__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalSlideOMatic.g:2221:1: rule__Slide__Group__2__Impl : ( '{' ) ;
    public final void rule__Slide__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2225:1: ( ( '{' ) )
            // InternalSlideOMatic.g:2226:1: ( '{' )
            {
            // InternalSlideOMatic.g:2226:1: ( '{' )
            // InternalSlideOMatic.g:2227:2: '{'
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
    // InternalSlideOMatic.g:2236:1: rule__Slide__Group__3 : rule__Slide__Group__3__Impl rule__Slide__Group__4 ;
    public final void rule__Slide__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2240:1: ( rule__Slide__Group__3__Impl rule__Slide__Group__4 )
            // InternalSlideOMatic.g:2241:2: rule__Slide__Group__3__Impl rule__Slide__Group__4
            {
            pushFollow(FOLLOW_16);
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
    // InternalSlideOMatic.g:2248:1: rule__Slide__Group__3__Impl : ( ( ( rule__Slide__ContentsAssignment_3 ) ) ( ( rule__Slide__ContentsAssignment_3 )* ) ) ;
    public final void rule__Slide__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2252:1: ( ( ( ( rule__Slide__ContentsAssignment_3 ) ) ( ( rule__Slide__ContentsAssignment_3 )* ) ) )
            // InternalSlideOMatic.g:2253:1: ( ( ( rule__Slide__ContentsAssignment_3 ) ) ( ( rule__Slide__ContentsAssignment_3 )* ) )
            {
            // InternalSlideOMatic.g:2253:1: ( ( ( rule__Slide__ContentsAssignment_3 ) ) ( ( rule__Slide__ContentsAssignment_3 )* ) )
            // InternalSlideOMatic.g:2254:2: ( ( rule__Slide__ContentsAssignment_3 ) ) ( ( rule__Slide__ContentsAssignment_3 )* )
            {
            // InternalSlideOMatic.g:2254:2: ( ( rule__Slide__ContentsAssignment_3 ) )
            // InternalSlideOMatic.g:2255:3: ( rule__Slide__ContentsAssignment_3 )
            {
             before(grammarAccess.getSlideAccess().getContentsAssignment_3()); 
            // InternalSlideOMatic.g:2256:3: ( rule__Slide__ContentsAssignment_3 )
            // InternalSlideOMatic.g:2256:4: rule__Slide__ContentsAssignment_3
            {
            pushFollow(FOLLOW_17);
            rule__Slide__ContentsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSlideAccess().getContentsAssignment_3()); 

            }

            // InternalSlideOMatic.g:2259:2: ( ( rule__Slide__ContentsAssignment_3 )* )
            // InternalSlideOMatic.g:2260:3: ( rule__Slide__ContentsAssignment_3 )*
            {
             before(grammarAccess.getSlideAccess().getContentsAssignment_3()); 
            // InternalSlideOMatic.g:2261:3: ( rule__Slide__ContentsAssignment_3 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_STRING||(LA26_0>=84 && LA26_0<=87)||LA26_0==89||LA26_0==94||LA26_0==97) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalSlideOMatic.g:2261:4: rule__Slide__ContentsAssignment_3
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Slide__ContentsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
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
    // InternalSlideOMatic.g:2270:1: rule__Slide__Group__4 : rule__Slide__Group__4__Impl ;
    public final void rule__Slide__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2274:1: ( rule__Slide__Group__4__Impl )
            // InternalSlideOMatic.g:2275:2: rule__Slide__Group__4__Impl
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
    // InternalSlideOMatic.g:2281:1: rule__Slide__Group__4__Impl : ( '}' ) ;
    public final void rule__Slide__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2285:1: ( ( '}' ) )
            // InternalSlideOMatic.g:2286:1: ( '}' )
            {
            // InternalSlideOMatic.g:2286:1: ( '}' )
            // InternalSlideOMatic.g:2287:2: '}'
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
    // InternalSlideOMatic.g:2297:1: rule__Slide__Group_1_0__0 : rule__Slide__Group_1_0__0__Impl rule__Slide__Group_1_0__1 ;
    public final void rule__Slide__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2301:1: ( rule__Slide__Group_1_0__0__Impl rule__Slide__Group_1_0__1 )
            // InternalSlideOMatic.g:2302:2: rule__Slide__Group_1_0__0__Impl rule__Slide__Group_1_0__1
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
    // InternalSlideOMatic.g:2309:1: rule__Slide__Group_1_0__0__Impl : ( ( rule__Slide__SecAssignment_1_0_0 ) ) ;
    public final void rule__Slide__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2313:1: ( ( ( rule__Slide__SecAssignment_1_0_0 ) ) )
            // InternalSlideOMatic.g:2314:1: ( ( rule__Slide__SecAssignment_1_0_0 ) )
            {
            // InternalSlideOMatic.g:2314:1: ( ( rule__Slide__SecAssignment_1_0_0 ) )
            // InternalSlideOMatic.g:2315:2: ( rule__Slide__SecAssignment_1_0_0 )
            {
             before(grammarAccess.getSlideAccess().getSecAssignment_1_0_0()); 
            // InternalSlideOMatic.g:2316:2: ( rule__Slide__SecAssignment_1_0_0 )
            // InternalSlideOMatic.g:2316:3: rule__Slide__SecAssignment_1_0_0
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
    // InternalSlideOMatic.g:2324:1: rule__Slide__Group_1_0__1 : rule__Slide__Group_1_0__1__Impl ;
    public final void rule__Slide__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2328:1: ( rule__Slide__Group_1_0__1__Impl )
            // InternalSlideOMatic.g:2329:2: rule__Slide__Group_1_0__1__Impl
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
    // InternalSlideOMatic.g:2335:1: rule__Slide__Group_1_0__1__Impl : ( ( rule__Slide__NameAssignment_1_0_1 ) ) ;
    public final void rule__Slide__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2339:1: ( ( ( rule__Slide__NameAssignment_1_0_1 ) ) )
            // InternalSlideOMatic.g:2340:1: ( ( rule__Slide__NameAssignment_1_0_1 ) )
            {
            // InternalSlideOMatic.g:2340:1: ( ( rule__Slide__NameAssignment_1_0_1 ) )
            // InternalSlideOMatic.g:2341:2: ( rule__Slide__NameAssignment_1_0_1 )
            {
             before(grammarAccess.getSlideAccess().getNameAssignment_1_0_1()); 
            // InternalSlideOMatic.g:2342:2: ( rule__Slide__NameAssignment_1_0_1 )
            // InternalSlideOMatic.g:2342:3: rule__Slide__NameAssignment_1_0_1
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
    // InternalSlideOMatic.g:2351:1: rule__Section__Group_0__0 : rule__Section__Group_0__0__Impl rule__Section__Group_0__1 ;
    public final void rule__Section__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2355:1: ( rule__Section__Group_0__0__Impl rule__Section__Group_0__1 )
            // InternalSlideOMatic.g:2356:2: rule__Section__Group_0__0__Impl rule__Section__Group_0__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalSlideOMatic.g:2363:1: rule__Section__Group_0__0__Impl : ( () ) ;
    public final void rule__Section__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2367:1: ( ( () ) )
            // InternalSlideOMatic.g:2368:1: ( () )
            {
            // InternalSlideOMatic.g:2368:1: ( () )
            // InternalSlideOMatic.g:2369:2: ()
            {
             before(grammarAccess.getSectionAccess().getSecAction_0_0()); 
            // InternalSlideOMatic.g:2370:2: ()
            // InternalSlideOMatic.g:2370:3: 
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
    // InternalSlideOMatic.g:2378:1: rule__Section__Group_0__1 : rule__Section__Group_0__1__Impl ;
    public final void rule__Section__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2382:1: ( rule__Section__Group_0__1__Impl )
            // InternalSlideOMatic.g:2383:2: rule__Section__Group_0__1__Impl
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
    // InternalSlideOMatic.g:2389:1: rule__Section__Group_0__1__Impl : ( '*' ) ;
    public final void rule__Section__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2393:1: ( ( '*' ) )
            // InternalSlideOMatic.g:2394:1: ( '*' )
            {
            // InternalSlideOMatic.g:2394:1: ( '*' )
            // InternalSlideOMatic.g:2395:2: '*'
            {
             before(grammarAccess.getSectionAccess().getAsteriskKeyword_0_1()); 
            match(input,80,FOLLOW_2); 
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
    // InternalSlideOMatic.g:2405:1: rule__Section__Group_1__0 : rule__Section__Group_1__0__Impl rule__Section__Group_1__1 ;
    public final void rule__Section__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2409:1: ( rule__Section__Group_1__0__Impl rule__Section__Group_1__1 )
            // InternalSlideOMatic.g:2410:2: rule__Section__Group_1__0__Impl rule__Section__Group_1__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalSlideOMatic.g:2417:1: rule__Section__Group_1__0__Impl : ( () ) ;
    public final void rule__Section__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2421:1: ( ( () ) )
            // InternalSlideOMatic.g:2422:1: ( () )
            {
            // InternalSlideOMatic.g:2422:1: ( () )
            // InternalSlideOMatic.g:2423:2: ()
            {
             before(grammarAccess.getSectionAccess().getSubSecAction_1_0()); 
            // InternalSlideOMatic.g:2424:2: ()
            // InternalSlideOMatic.g:2424:3: 
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
    // InternalSlideOMatic.g:2432:1: rule__Section__Group_1__1 : rule__Section__Group_1__1__Impl ;
    public final void rule__Section__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2436:1: ( rule__Section__Group_1__1__Impl )
            // InternalSlideOMatic.g:2437:2: rule__Section__Group_1__1__Impl
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
    // InternalSlideOMatic.g:2443:1: rule__Section__Group_1__1__Impl : ( '**' ) ;
    public final void rule__Section__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2447:1: ( ( '**' ) )
            // InternalSlideOMatic.g:2448:1: ( '**' )
            {
            // InternalSlideOMatic.g:2448:1: ( '**' )
            // InternalSlideOMatic.g:2449:2: '**'
            {
             before(grammarAccess.getSectionAccess().getAsteriskAsteriskKeyword_1_1()); 
            match(input,82,FOLLOW_2); 
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
    // InternalSlideOMatic.g:2459:1: rule__Section__Group_2__0 : rule__Section__Group_2__0__Impl rule__Section__Group_2__1 ;
    public final void rule__Section__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2463:1: ( rule__Section__Group_2__0__Impl rule__Section__Group_2__1 )
            // InternalSlideOMatic.g:2464:2: rule__Section__Group_2__0__Impl rule__Section__Group_2__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalSlideOMatic.g:2471:1: rule__Section__Group_2__0__Impl : ( () ) ;
    public final void rule__Section__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2475:1: ( ( () ) )
            // InternalSlideOMatic.g:2476:1: ( () )
            {
            // InternalSlideOMatic.g:2476:1: ( () )
            // InternalSlideOMatic.g:2477:2: ()
            {
             before(grammarAccess.getSectionAccess().getSubSubSecAction_2_0()); 
            // InternalSlideOMatic.g:2478:2: ()
            // InternalSlideOMatic.g:2478:3: 
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
    // InternalSlideOMatic.g:2486:1: rule__Section__Group_2__1 : rule__Section__Group_2__1__Impl ;
    public final void rule__Section__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2490:1: ( rule__Section__Group_2__1__Impl )
            // InternalSlideOMatic.g:2491:2: rule__Section__Group_2__1__Impl
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
    // InternalSlideOMatic.g:2497:1: rule__Section__Group_2__1__Impl : ( '***' ) ;
    public final void rule__Section__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2501:1: ( ( '***' ) )
            // InternalSlideOMatic.g:2502:1: ( '***' )
            {
            // InternalSlideOMatic.g:2502:1: ( '***' )
            // InternalSlideOMatic.g:2503:2: '***'
            {
             before(grammarAccess.getSectionAccess().getAsteriskAsteriskAsteriskKeyword_2_1()); 
            match(input,83,FOLLOW_2); 
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


    // $ANTLR start "rule__Content__Group__0"
    // InternalSlideOMatic.g:2513:1: rule__Content__Group__0 : rule__Content__Group__0__Impl rule__Content__Group__1 ;
    public final void rule__Content__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2517:1: ( rule__Content__Group__0__Impl rule__Content__Group__1 )
            // InternalSlideOMatic.g:2518:2: rule__Content__Group__0__Impl rule__Content__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__Content__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Content__Group__1();

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
    // $ANTLR end "rule__Content__Group__0"


    // $ANTLR start "rule__Content__Group__0__Impl"
    // InternalSlideOMatic.g:2525:1: rule__Content__Group__0__Impl : ( ( rule__Content__Alternatives_0 ) ) ;
    public final void rule__Content__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2529:1: ( ( ( rule__Content__Alternatives_0 ) ) )
            // InternalSlideOMatic.g:2530:1: ( ( rule__Content__Alternatives_0 ) )
            {
            // InternalSlideOMatic.g:2530:1: ( ( rule__Content__Alternatives_0 ) )
            // InternalSlideOMatic.g:2531:2: ( rule__Content__Alternatives_0 )
            {
             before(grammarAccess.getContentAccess().getAlternatives_0()); 
            // InternalSlideOMatic.g:2532:2: ( rule__Content__Alternatives_0 )
            // InternalSlideOMatic.g:2532:3: rule__Content__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Content__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getContentAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Content__Group__0__Impl"


    // $ANTLR start "rule__Content__Group__1"
    // InternalSlideOMatic.g:2540:1: rule__Content__Group__1 : rule__Content__Group__1__Impl ;
    public final void rule__Content__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2544:1: ( rule__Content__Group__1__Impl )
            // InternalSlideOMatic.g:2545:2: rule__Content__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Content__Group__1__Impl();

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
    // $ANTLR end "rule__Content__Group__1"


    // $ANTLR start "rule__Content__Group__1__Impl"
    // InternalSlideOMatic.g:2551:1: rule__Content__Group__1__Impl : ( ( rule__Content__ClickAssignment_1 )? ) ;
    public final void rule__Content__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2555:1: ( ( ( rule__Content__ClickAssignment_1 )? ) )
            // InternalSlideOMatic.g:2556:1: ( ( rule__Content__ClickAssignment_1 )? )
            {
            // InternalSlideOMatic.g:2556:1: ( ( rule__Content__ClickAssignment_1 )? )
            // InternalSlideOMatic.g:2557:2: ( rule__Content__ClickAssignment_1 )?
            {
             before(grammarAccess.getContentAccess().getClickAssignment_1()); 
            // InternalSlideOMatic.g:2558:2: ( rule__Content__ClickAssignment_1 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==11) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalSlideOMatic.g:2558:3: rule__Content__ClickAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Content__ClickAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getContentAccess().getClickAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Content__Group__1__Impl"


    // $ANTLR start "rule__ToC__Group_0__0"
    // InternalSlideOMatic.g:2567:1: rule__ToC__Group_0__0 : rule__ToC__Group_0__0__Impl rule__ToC__Group_0__1 ;
    public final void rule__ToC__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2571:1: ( rule__ToC__Group_0__0__Impl rule__ToC__Group_0__1 )
            // InternalSlideOMatic.g:2572:2: rule__ToC__Group_0__0__Impl rule__ToC__Group_0__1
            {
            pushFollow(FOLLOW_22);
            rule__ToC__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ToC__Group_0__1();

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
    // $ANTLR end "rule__ToC__Group_0__0"


    // $ANTLR start "rule__ToC__Group_0__0__Impl"
    // InternalSlideOMatic.g:2579:1: rule__ToC__Group_0__0__Impl : ( () ) ;
    public final void rule__ToC__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2583:1: ( ( () ) )
            // InternalSlideOMatic.g:2584:1: ( () )
            {
            // InternalSlideOMatic.g:2584:1: ( () )
            // InternalSlideOMatic.g:2585:2: ()
            {
             before(grammarAccess.getToCAccess().getToCAction_0_0()); 
            // InternalSlideOMatic.g:2586:2: ()
            // InternalSlideOMatic.g:2586:3: 
            {
            }

             after(grammarAccess.getToCAccess().getToCAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ToC__Group_0__0__Impl"


    // $ANTLR start "rule__ToC__Group_0__1"
    // InternalSlideOMatic.g:2594:1: rule__ToC__Group_0__1 : rule__ToC__Group_0__1__Impl ;
    public final void rule__ToC__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2598:1: ( rule__ToC__Group_0__1__Impl )
            // InternalSlideOMatic.g:2599:2: rule__ToC__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ToC__Group_0__1__Impl();

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
    // $ANTLR end "rule__ToC__Group_0__1"


    // $ANTLR start "rule__ToC__Group_0__1__Impl"
    // InternalSlideOMatic.g:2605:1: rule__ToC__Group_0__1__Impl : ( 'ToC' ) ;
    public final void rule__ToC__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2609:1: ( ( 'ToC' ) )
            // InternalSlideOMatic.g:2610:1: ( 'ToC' )
            {
            // InternalSlideOMatic.g:2610:1: ( 'ToC' )
            // InternalSlideOMatic.g:2611:2: 'ToC'
            {
             before(grammarAccess.getToCAccess().getToCKeyword_0_1()); 
            match(input,84,FOLLOW_2); 
             after(grammarAccess.getToCAccess().getToCKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ToC__Group_0__1__Impl"


    // $ANTLR start "rule__ToC__Group_1__0"
    // InternalSlideOMatic.g:2621:1: rule__ToC__Group_1__0 : rule__ToC__Group_1__0__Impl rule__ToC__Group_1__1 ;
    public final void rule__ToC__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2625:1: ( rule__ToC__Group_1__0__Impl rule__ToC__Group_1__1 )
            // InternalSlideOMatic.g:2626:2: rule__ToC__Group_1__0__Impl rule__ToC__Group_1__1
            {
            pushFollow(FOLLOW_22);
            rule__ToC__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ToC__Group_1__1();

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
    // $ANTLR end "rule__ToC__Group_1__0"


    // $ANTLR start "rule__ToC__Group_1__0__Impl"
    // InternalSlideOMatic.g:2633:1: rule__ToC__Group_1__0__Impl : ( () ) ;
    public final void rule__ToC__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2637:1: ( ( () ) )
            // InternalSlideOMatic.g:2638:1: ( () )
            {
            // InternalSlideOMatic.g:2638:1: ( () )
            // InternalSlideOMatic.g:2639:2: ()
            {
             before(grammarAccess.getToCAccess().getCurrentSecToCAction_1_0()); 
            // InternalSlideOMatic.g:2640:2: ()
            // InternalSlideOMatic.g:2640:3: 
            {
            }

             after(grammarAccess.getToCAccess().getCurrentSecToCAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ToC__Group_1__0__Impl"


    // $ANTLR start "rule__ToC__Group_1__1"
    // InternalSlideOMatic.g:2648:1: rule__ToC__Group_1__1 : rule__ToC__Group_1__1__Impl rule__ToC__Group_1__2 ;
    public final void rule__ToC__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2652:1: ( rule__ToC__Group_1__1__Impl rule__ToC__Group_1__2 )
            // InternalSlideOMatic.g:2653:2: rule__ToC__Group_1__1__Impl rule__ToC__Group_1__2
            {
            pushFollow(FOLLOW_18);
            rule__ToC__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ToC__Group_1__2();

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
    // $ANTLR end "rule__ToC__Group_1__1"


    // $ANTLR start "rule__ToC__Group_1__1__Impl"
    // InternalSlideOMatic.g:2660:1: rule__ToC__Group_1__1__Impl : ( 'ToC' ) ;
    public final void rule__ToC__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2664:1: ( ( 'ToC' ) )
            // InternalSlideOMatic.g:2665:1: ( 'ToC' )
            {
            // InternalSlideOMatic.g:2665:1: ( 'ToC' )
            // InternalSlideOMatic.g:2666:2: 'ToC'
            {
             before(grammarAccess.getToCAccess().getToCKeyword_1_1()); 
            match(input,84,FOLLOW_2); 
             after(grammarAccess.getToCAccess().getToCKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ToC__Group_1__1__Impl"


    // $ANTLR start "rule__ToC__Group_1__2"
    // InternalSlideOMatic.g:2675:1: rule__ToC__Group_1__2 : rule__ToC__Group_1__2__Impl ;
    public final void rule__ToC__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2679:1: ( rule__ToC__Group_1__2__Impl )
            // InternalSlideOMatic.g:2680:2: rule__ToC__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ToC__Group_1__2__Impl();

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
    // $ANTLR end "rule__ToC__Group_1__2"


    // $ANTLR start "rule__ToC__Group_1__2__Impl"
    // InternalSlideOMatic.g:2686:1: rule__ToC__Group_1__2__Impl : ( '*' ) ;
    public final void rule__ToC__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2690:1: ( ( '*' ) )
            // InternalSlideOMatic.g:2691:1: ( '*' )
            {
            // InternalSlideOMatic.g:2691:1: ( '*' )
            // InternalSlideOMatic.g:2692:2: '*'
            {
             before(grammarAccess.getToCAccess().getAsteriskKeyword_1_2()); 
            match(input,80,FOLLOW_2); 
             after(grammarAccess.getToCAccess().getAsteriskKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ToC__Group_1__2__Impl"


    // $ANTLR start "rule__Block__Group__0"
    // InternalSlideOMatic.g:2702:1: rule__Block__Group__0 : rule__Block__Group__0__Impl rule__Block__Group__1 ;
    public final void rule__Block__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2706:1: ( rule__Block__Group__0__Impl rule__Block__Group__1 )
            // InternalSlideOMatic.g:2707:2: rule__Block__Group__0__Impl rule__Block__Group__1
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
    // InternalSlideOMatic.g:2714:1: rule__Block__Group__0__Impl : ( 'block' ) ;
    public final void rule__Block__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2718:1: ( ( 'block' ) )
            // InternalSlideOMatic.g:2719:1: ( 'block' )
            {
            // InternalSlideOMatic.g:2719:1: ( 'block' )
            // InternalSlideOMatic.g:2720:2: 'block'
            {
             before(grammarAccess.getBlockAccess().getBlockKeyword_0()); 
            match(input,85,FOLLOW_2); 
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
    // InternalSlideOMatic.g:2729:1: rule__Block__Group__1 : rule__Block__Group__1__Impl rule__Block__Group__2 ;
    public final void rule__Block__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2733:1: ( rule__Block__Group__1__Impl rule__Block__Group__2 )
            // InternalSlideOMatic.g:2734:2: rule__Block__Group__1__Impl rule__Block__Group__2
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
    // InternalSlideOMatic.g:2741:1: rule__Block__Group__1__Impl : ( ( rule__Block__NameAssignment_1 )? ) ;
    public final void rule__Block__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2745:1: ( ( ( rule__Block__NameAssignment_1 )? ) )
            // InternalSlideOMatic.g:2746:1: ( ( rule__Block__NameAssignment_1 )? )
            {
            // InternalSlideOMatic.g:2746:1: ( ( rule__Block__NameAssignment_1 )? )
            // InternalSlideOMatic.g:2747:2: ( rule__Block__NameAssignment_1 )?
            {
             before(grammarAccess.getBlockAccess().getNameAssignment_1()); 
            // InternalSlideOMatic.g:2748:2: ( rule__Block__NameAssignment_1 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_STRING) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalSlideOMatic.g:2748:3: rule__Block__NameAssignment_1
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
    // InternalSlideOMatic.g:2756:1: rule__Block__Group__2 : rule__Block__Group__2__Impl rule__Block__Group__3 ;
    public final void rule__Block__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2760:1: ( rule__Block__Group__2__Impl rule__Block__Group__3 )
            // InternalSlideOMatic.g:2761:2: rule__Block__Group__2__Impl rule__Block__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalSlideOMatic.g:2768:1: rule__Block__Group__2__Impl : ( '{' ) ;
    public final void rule__Block__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2772:1: ( ( '{' ) )
            // InternalSlideOMatic.g:2773:1: ( '{' )
            {
            // InternalSlideOMatic.g:2773:1: ( '{' )
            // InternalSlideOMatic.g:2774:2: '{'
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
    // InternalSlideOMatic.g:2783:1: rule__Block__Group__3 : rule__Block__Group__3__Impl rule__Block__Group__4 ;
    public final void rule__Block__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2787:1: ( rule__Block__Group__3__Impl rule__Block__Group__4 )
            // InternalSlideOMatic.g:2788:2: rule__Block__Group__3__Impl rule__Block__Group__4
            {
            pushFollow(FOLLOW_16);
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
    // InternalSlideOMatic.g:2795:1: rule__Block__Group__3__Impl : ( ( ( rule__Block__ContentAssignment_3 ) ) ( ( rule__Block__ContentAssignment_3 )* ) ) ;
    public final void rule__Block__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2799:1: ( ( ( ( rule__Block__ContentAssignment_3 ) ) ( ( rule__Block__ContentAssignment_3 )* ) ) )
            // InternalSlideOMatic.g:2800:1: ( ( ( rule__Block__ContentAssignment_3 ) ) ( ( rule__Block__ContentAssignment_3 )* ) )
            {
            // InternalSlideOMatic.g:2800:1: ( ( ( rule__Block__ContentAssignment_3 ) ) ( ( rule__Block__ContentAssignment_3 )* ) )
            // InternalSlideOMatic.g:2801:2: ( ( rule__Block__ContentAssignment_3 ) ) ( ( rule__Block__ContentAssignment_3 )* )
            {
            // InternalSlideOMatic.g:2801:2: ( ( rule__Block__ContentAssignment_3 ) )
            // InternalSlideOMatic.g:2802:3: ( rule__Block__ContentAssignment_3 )
            {
             before(grammarAccess.getBlockAccess().getContentAssignment_3()); 
            // InternalSlideOMatic.g:2803:3: ( rule__Block__ContentAssignment_3 )
            // InternalSlideOMatic.g:2803:4: rule__Block__ContentAssignment_3
            {
            pushFollow(FOLLOW_17);
            rule__Block__ContentAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getBlockAccess().getContentAssignment_3()); 

            }

            // InternalSlideOMatic.g:2806:2: ( ( rule__Block__ContentAssignment_3 )* )
            // InternalSlideOMatic.g:2807:3: ( rule__Block__ContentAssignment_3 )*
            {
             before(grammarAccess.getBlockAccess().getContentAssignment_3()); 
            // InternalSlideOMatic.g:2808:3: ( rule__Block__ContentAssignment_3 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_STRING||(LA29_0>=84 && LA29_0<=87)||LA29_0==89||LA29_0==94||LA29_0==97) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalSlideOMatic.g:2808:4: rule__Block__ContentAssignment_3
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Block__ContentAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getBlockAccess().getContentAssignment_3()); 

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
    // $ANTLR end "rule__Block__Group__3__Impl"


    // $ANTLR start "rule__Block__Group__4"
    // InternalSlideOMatic.g:2817:1: rule__Block__Group__4 : rule__Block__Group__4__Impl ;
    public final void rule__Block__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2821:1: ( rule__Block__Group__4__Impl )
            // InternalSlideOMatic.g:2822:2: rule__Block__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Block__Group__4__Impl();

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
    // InternalSlideOMatic.g:2828:1: rule__Block__Group__4__Impl : ( '}' ) ;
    public final void rule__Block__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2832:1: ( ( '}' ) )
            // InternalSlideOMatic.g:2833:1: ( '}' )
            {
            // InternalSlideOMatic.g:2833:1: ( '}' )
            // InternalSlideOMatic.g:2834:2: '}'
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


    // $ANTLR start "rule__NumberedList__Group__0"
    // InternalSlideOMatic.g:2844:1: rule__NumberedList__Group__0 : rule__NumberedList__Group__0__Impl rule__NumberedList__Group__1 ;
    public final void rule__NumberedList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2848:1: ( rule__NumberedList__Group__0__Impl rule__NumberedList__Group__1 )
            // InternalSlideOMatic.g:2849:2: rule__NumberedList__Group__0__Impl rule__NumberedList__Group__1
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
    // InternalSlideOMatic.g:2856:1: rule__NumberedList__Group__0__Impl : ( '#list' ) ;
    public final void rule__NumberedList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2860:1: ( ( '#list' ) )
            // InternalSlideOMatic.g:2861:1: ( '#list' )
            {
            // InternalSlideOMatic.g:2861:1: ( '#list' )
            // InternalSlideOMatic.g:2862:2: '#list'
            {
             before(grammarAccess.getNumberedListAccess().getListKeyword_0()); 
            match(input,86,FOLLOW_2); 
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
    // InternalSlideOMatic.g:2871:1: rule__NumberedList__Group__1 : rule__NumberedList__Group__1__Impl ;
    public final void rule__NumberedList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2875:1: ( rule__NumberedList__Group__1__Impl )
            // InternalSlideOMatic.g:2876:2: rule__NumberedList__Group__1__Impl
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
    // InternalSlideOMatic.g:2882:1: rule__NumberedList__Group__1__Impl : ( ( ( rule__NumberedList__ItemsAssignment_1 ) ) ( ( rule__NumberedList__ItemsAssignment_1 )* ) ) ;
    public final void rule__NumberedList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2886:1: ( ( ( ( rule__NumberedList__ItemsAssignment_1 ) ) ( ( rule__NumberedList__ItemsAssignment_1 )* ) ) )
            // InternalSlideOMatic.g:2887:1: ( ( ( rule__NumberedList__ItemsAssignment_1 ) ) ( ( rule__NumberedList__ItemsAssignment_1 )* ) )
            {
            // InternalSlideOMatic.g:2887:1: ( ( ( rule__NumberedList__ItemsAssignment_1 ) ) ( ( rule__NumberedList__ItemsAssignment_1 )* ) )
            // InternalSlideOMatic.g:2888:2: ( ( rule__NumberedList__ItemsAssignment_1 ) ) ( ( rule__NumberedList__ItemsAssignment_1 )* )
            {
            // InternalSlideOMatic.g:2888:2: ( ( rule__NumberedList__ItemsAssignment_1 ) )
            // InternalSlideOMatic.g:2889:3: ( rule__NumberedList__ItemsAssignment_1 )
            {
             before(grammarAccess.getNumberedListAccess().getItemsAssignment_1()); 
            // InternalSlideOMatic.g:2890:3: ( rule__NumberedList__ItemsAssignment_1 )
            // InternalSlideOMatic.g:2890:4: rule__NumberedList__ItemsAssignment_1
            {
            pushFollow(FOLLOW_24);
            rule__NumberedList__ItemsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNumberedListAccess().getItemsAssignment_1()); 

            }

            // InternalSlideOMatic.g:2893:2: ( ( rule__NumberedList__ItemsAssignment_1 )* )
            // InternalSlideOMatic.g:2894:3: ( rule__NumberedList__ItemsAssignment_1 )*
            {
             before(grammarAccess.getNumberedListAccess().getItemsAssignment_1()); 
            // InternalSlideOMatic.g:2895:3: ( rule__NumberedList__ItemsAssignment_1 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==88) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalSlideOMatic.g:2895:4: rule__NumberedList__ItemsAssignment_1
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__NumberedList__ItemsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
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
    // InternalSlideOMatic.g:2905:1: rule__UnNumberedList__Group__0 : rule__UnNumberedList__Group__0__Impl rule__UnNumberedList__Group__1 ;
    public final void rule__UnNumberedList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2909:1: ( rule__UnNumberedList__Group__0__Impl rule__UnNumberedList__Group__1 )
            // InternalSlideOMatic.g:2910:2: rule__UnNumberedList__Group__0__Impl rule__UnNumberedList__Group__1
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
    // InternalSlideOMatic.g:2917:1: rule__UnNumberedList__Group__0__Impl : ( '&list' ) ;
    public final void rule__UnNumberedList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2921:1: ( ( '&list' ) )
            // InternalSlideOMatic.g:2922:1: ( '&list' )
            {
            // InternalSlideOMatic.g:2922:1: ( '&list' )
            // InternalSlideOMatic.g:2923:2: '&list'
            {
             before(grammarAccess.getUnNumberedListAccess().getListKeyword_0()); 
            match(input,87,FOLLOW_2); 
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
    // InternalSlideOMatic.g:2932:1: rule__UnNumberedList__Group__1 : rule__UnNumberedList__Group__1__Impl ;
    public final void rule__UnNumberedList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2936:1: ( rule__UnNumberedList__Group__1__Impl )
            // InternalSlideOMatic.g:2937:2: rule__UnNumberedList__Group__1__Impl
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
    // InternalSlideOMatic.g:2943:1: rule__UnNumberedList__Group__1__Impl : ( ( ( rule__UnNumberedList__ItemsAssignment_1 ) ) ( ( rule__UnNumberedList__ItemsAssignment_1 )* ) ) ;
    public final void rule__UnNumberedList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2947:1: ( ( ( ( rule__UnNumberedList__ItemsAssignment_1 ) ) ( ( rule__UnNumberedList__ItemsAssignment_1 )* ) ) )
            // InternalSlideOMatic.g:2948:1: ( ( ( rule__UnNumberedList__ItemsAssignment_1 ) ) ( ( rule__UnNumberedList__ItemsAssignment_1 )* ) )
            {
            // InternalSlideOMatic.g:2948:1: ( ( ( rule__UnNumberedList__ItemsAssignment_1 ) ) ( ( rule__UnNumberedList__ItemsAssignment_1 )* ) )
            // InternalSlideOMatic.g:2949:2: ( ( rule__UnNumberedList__ItemsAssignment_1 ) ) ( ( rule__UnNumberedList__ItemsAssignment_1 )* )
            {
            // InternalSlideOMatic.g:2949:2: ( ( rule__UnNumberedList__ItemsAssignment_1 ) )
            // InternalSlideOMatic.g:2950:3: ( rule__UnNumberedList__ItemsAssignment_1 )
            {
             before(grammarAccess.getUnNumberedListAccess().getItemsAssignment_1()); 
            // InternalSlideOMatic.g:2951:3: ( rule__UnNumberedList__ItemsAssignment_1 )
            // InternalSlideOMatic.g:2951:4: rule__UnNumberedList__ItemsAssignment_1
            {
            pushFollow(FOLLOW_24);
            rule__UnNumberedList__ItemsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getUnNumberedListAccess().getItemsAssignment_1()); 

            }

            // InternalSlideOMatic.g:2954:2: ( ( rule__UnNumberedList__ItemsAssignment_1 )* )
            // InternalSlideOMatic.g:2955:3: ( rule__UnNumberedList__ItemsAssignment_1 )*
            {
             before(grammarAccess.getUnNumberedListAccess().getItemsAssignment_1()); 
            // InternalSlideOMatic.g:2956:3: ( rule__UnNumberedList__ItemsAssignment_1 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==88) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalSlideOMatic.g:2956:4: rule__UnNumberedList__ItemsAssignment_1
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__UnNumberedList__ItemsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
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
    // InternalSlideOMatic.g:2966:1: rule__ListItem__Group__0 : rule__ListItem__Group__0__Impl rule__ListItem__Group__1 ;
    public final void rule__ListItem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2970:1: ( rule__ListItem__Group__0__Impl rule__ListItem__Group__1 )
            // InternalSlideOMatic.g:2971:2: rule__ListItem__Group__0__Impl rule__ListItem__Group__1
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
    // InternalSlideOMatic.g:2978:1: rule__ListItem__Group__0__Impl : ( '-' ) ;
    public final void rule__ListItem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2982:1: ( ( '-' ) )
            // InternalSlideOMatic.g:2983:1: ( '-' )
            {
            // InternalSlideOMatic.g:2983:1: ( '-' )
            // InternalSlideOMatic.g:2984:2: '-'
            {
             before(grammarAccess.getListItemAccess().getHyphenMinusKeyword_0()); 
            match(input,88,FOLLOW_2); 
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
    // InternalSlideOMatic.g:2993:1: rule__ListItem__Group__1 : rule__ListItem__Group__1__Impl rule__ListItem__Group__2 ;
    public final void rule__ListItem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2997:1: ( rule__ListItem__Group__1__Impl rule__ListItem__Group__2 )
            // InternalSlideOMatic.g:2998:2: rule__ListItem__Group__1__Impl rule__ListItem__Group__2
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
    // InternalSlideOMatic.g:3005:1: rule__ListItem__Group__1__Impl : ( ( rule__ListItem__ItemAssignment_1 ) ) ;
    public final void rule__ListItem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3009:1: ( ( ( rule__ListItem__ItemAssignment_1 ) ) )
            // InternalSlideOMatic.g:3010:1: ( ( rule__ListItem__ItemAssignment_1 ) )
            {
            // InternalSlideOMatic.g:3010:1: ( ( rule__ListItem__ItemAssignment_1 ) )
            // InternalSlideOMatic.g:3011:2: ( rule__ListItem__ItemAssignment_1 )
            {
             before(grammarAccess.getListItemAccess().getItemAssignment_1()); 
            // InternalSlideOMatic.g:3012:2: ( rule__ListItem__ItemAssignment_1 )
            // InternalSlideOMatic.g:3012:3: rule__ListItem__ItemAssignment_1
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
    // InternalSlideOMatic.g:3020:1: rule__ListItem__Group__2 : rule__ListItem__Group__2__Impl rule__ListItem__Group__3 ;
    public final void rule__ListItem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3024:1: ( rule__ListItem__Group__2__Impl rule__ListItem__Group__3 )
            // InternalSlideOMatic.g:3025:2: rule__ListItem__Group__2__Impl rule__ListItem__Group__3
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
    // InternalSlideOMatic.g:3032:1: rule__ListItem__Group__2__Impl : ( ( rule__ListItem__Group_2__0 )? ) ;
    public final void rule__ListItem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3036:1: ( ( ( rule__ListItem__Group_2__0 )? ) )
            // InternalSlideOMatic.g:3037:1: ( ( rule__ListItem__Group_2__0 )? )
            {
            // InternalSlideOMatic.g:3037:1: ( ( rule__ListItem__Group_2__0 )? )
            // InternalSlideOMatic.g:3038:2: ( rule__ListItem__Group_2__0 )?
            {
             before(grammarAccess.getListItemAccess().getGroup_2()); 
            // InternalSlideOMatic.g:3039:2: ( rule__ListItem__Group_2__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==73) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalSlideOMatic.g:3039:3: rule__ListItem__Group_2__0
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
    // InternalSlideOMatic.g:3047:1: rule__ListItem__Group__3 : rule__ListItem__Group__3__Impl ;
    public final void rule__ListItem__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3051:1: ( rule__ListItem__Group__3__Impl )
            // InternalSlideOMatic.g:3052:2: rule__ListItem__Group__3__Impl
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
    // InternalSlideOMatic.g:3058:1: rule__ListItem__Group__3__Impl : ( ( rule__ListItem__ClickAssignment_3 )? ) ;
    public final void rule__ListItem__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3062:1: ( ( ( rule__ListItem__ClickAssignment_3 )? ) )
            // InternalSlideOMatic.g:3063:1: ( ( rule__ListItem__ClickAssignment_3 )? )
            {
            // InternalSlideOMatic.g:3063:1: ( ( rule__ListItem__ClickAssignment_3 )? )
            // InternalSlideOMatic.g:3064:2: ( rule__ListItem__ClickAssignment_3 )?
            {
             before(grammarAccess.getListItemAccess().getClickAssignment_3()); 
            // InternalSlideOMatic.g:3065:2: ( rule__ListItem__ClickAssignment_3 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==11) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalSlideOMatic.g:3065:3: rule__ListItem__ClickAssignment_3
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
    // InternalSlideOMatic.g:3074:1: rule__ListItem__Group_2__0 : rule__ListItem__Group_2__0__Impl rule__ListItem__Group_2__1 ;
    public final void rule__ListItem__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3078:1: ( rule__ListItem__Group_2__0__Impl rule__ListItem__Group_2__1 )
            // InternalSlideOMatic.g:3079:2: rule__ListItem__Group_2__0__Impl rule__ListItem__Group_2__1
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
    // InternalSlideOMatic.g:3086:1: rule__ListItem__Group_2__0__Impl : ( '(' ) ;
    public final void rule__ListItem__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3090:1: ( ( '(' ) )
            // InternalSlideOMatic.g:3091:1: ( '(' )
            {
            // InternalSlideOMatic.g:3091:1: ( '(' )
            // InternalSlideOMatic.g:3092:2: '('
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
    // InternalSlideOMatic.g:3101:1: rule__ListItem__Group_2__1 : rule__ListItem__Group_2__1__Impl rule__ListItem__Group_2__2 ;
    public final void rule__ListItem__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3105:1: ( rule__ListItem__Group_2__1__Impl rule__ListItem__Group_2__2 )
            // InternalSlideOMatic.g:3106:2: rule__ListItem__Group_2__1__Impl rule__ListItem__Group_2__2
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
    // InternalSlideOMatic.g:3113:1: rule__ListItem__Group_2__1__Impl : ( ( rule__ListItem__NestedListAssignment_2_1 ) ) ;
    public final void rule__ListItem__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3117:1: ( ( ( rule__ListItem__NestedListAssignment_2_1 ) ) )
            // InternalSlideOMatic.g:3118:1: ( ( rule__ListItem__NestedListAssignment_2_1 ) )
            {
            // InternalSlideOMatic.g:3118:1: ( ( rule__ListItem__NestedListAssignment_2_1 ) )
            // InternalSlideOMatic.g:3119:2: ( rule__ListItem__NestedListAssignment_2_1 )
            {
             before(grammarAccess.getListItemAccess().getNestedListAssignment_2_1()); 
            // InternalSlideOMatic.g:3120:2: ( rule__ListItem__NestedListAssignment_2_1 )
            // InternalSlideOMatic.g:3120:3: rule__ListItem__NestedListAssignment_2_1
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
    // InternalSlideOMatic.g:3128:1: rule__ListItem__Group_2__2 : rule__ListItem__Group_2__2__Impl ;
    public final void rule__ListItem__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3132:1: ( rule__ListItem__Group_2__2__Impl )
            // InternalSlideOMatic.g:3133:2: rule__ListItem__Group_2__2__Impl
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
    // InternalSlideOMatic.g:3139:1: rule__ListItem__Group_2__2__Impl : ( ')' ) ;
    public final void rule__ListItem__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3143:1: ( ( ')' ) )
            // InternalSlideOMatic.g:3144:1: ( ')' )
            {
            // InternalSlideOMatic.g:3144:1: ( ')' )
            // InternalSlideOMatic.g:3145:2: ')'
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
    // InternalSlideOMatic.g:3155:1: rule__Image__Group__0 : rule__Image__Group__0__Impl rule__Image__Group__1 ;
    public final void rule__Image__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3159:1: ( rule__Image__Group__0__Impl rule__Image__Group__1 )
            // InternalSlideOMatic.g:3160:2: rule__Image__Group__0__Impl rule__Image__Group__1
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
    // InternalSlideOMatic.g:3167:1: rule__Image__Group__0__Impl : ( 'img' ) ;
    public final void rule__Image__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3171:1: ( ( 'img' ) )
            // InternalSlideOMatic.g:3172:1: ( 'img' )
            {
            // InternalSlideOMatic.g:3172:1: ( 'img' )
            // InternalSlideOMatic.g:3173:2: 'img'
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
    // InternalSlideOMatic.g:3182:1: rule__Image__Group__1 : rule__Image__Group__1__Impl rule__Image__Group__2 ;
    public final void rule__Image__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3186:1: ( rule__Image__Group__1__Impl rule__Image__Group__2 )
            // InternalSlideOMatic.g:3187:2: rule__Image__Group__1__Impl rule__Image__Group__2
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
    // InternalSlideOMatic.g:3194:1: rule__Image__Group__1__Impl : ( ( rule__Image__NameAssignment_1 ) ) ;
    public final void rule__Image__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3198:1: ( ( ( rule__Image__NameAssignment_1 ) ) )
            // InternalSlideOMatic.g:3199:1: ( ( rule__Image__NameAssignment_1 ) )
            {
            // InternalSlideOMatic.g:3199:1: ( ( rule__Image__NameAssignment_1 ) )
            // InternalSlideOMatic.g:3200:2: ( rule__Image__NameAssignment_1 )
            {
             before(grammarAccess.getImageAccess().getNameAssignment_1()); 
            // InternalSlideOMatic.g:3201:2: ( rule__Image__NameAssignment_1 )
            // InternalSlideOMatic.g:3201:3: rule__Image__NameAssignment_1
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
    // InternalSlideOMatic.g:3209:1: rule__Image__Group__2 : rule__Image__Group__2__Impl rule__Image__Group__3 ;
    public final void rule__Image__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3213:1: ( rule__Image__Group__2__Impl rule__Image__Group__3 )
            // InternalSlideOMatic.g:3214:2: rule__Image__Group__2__Impl rule__Image__Group__3
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
    // InternalSlideOMatic.g:3221:1: rule__Image__Group__2__Impl : ( 'src' ) ;
    public final void rule__Image__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3225:1: ( ( 'src' ) )
            // InternalSlideOMatic.g:3226:1: ( 'src' )
            {
            // InternalSlideOMatic.g:3226:1: ( 'src' )
            // InternalSlideOMatic.g:3227:2: 'src'
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
    // InternalSlideOMatic.g:3236:1: rule__Image__Group__3 : rule__Image__Group__3__Impl rule__Image__Group__4 ;
    public final void rule__Image__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3240:1: ( rule__Image__Group__3__Impl rule__Image__Group__4 )
            // InternalSlideOMatic.g:3241:2: rule__Image__Group__3__Impl rule__Image__Group__4
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
    // InternalSlideOMatic.g:3248:1: rule__Image__Group__3__Impl : ( ( rule__Image__SrcAssignment_3 ) ) ;
    public final void rule__Image__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3252:1: ( ( ( rule__Image__SrcAssignment_3 ) ) )
            // InternalSlideOMatic.g:3253:1: ( ( rule__Image__SrcAssignment_3 ) )
            {
            // InternalSlideOMatic.g:3253:1: ( ( rule__Image__SrcAssignment_3 ) )
            // InternalSlideOMatic.g:3254:2: ( rule__Image__SrcAssignment_3 )
            {
             before(grammarAccess.getImageAccess().getSrcAssignment_3()); 
            // InternalSlideOMatic.g:3255:2: ( rule__Image__SrcAssignment_3 )
            // InternalSlideOMatic.g:3255:3: rule__Image__SrcAssignment_3
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
    // InternalSlideOMatic.g:3263:1: rule__Image__Group__4 : rule__Image__Group__4__Impl rule__Image__Group__5 ;
    public final void rule__Image__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3267:1: ( rule__Image__Group__4__Impl rule__Image__Group__5 )
            // InternalSlideOMatic.g:3268:2: rule__Image__Group__4__Impl rule__Image__Group__5
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
    // InternalSlideOMatic.g:3275:1: rule__Image__Group__4__Impl : ( ( rule__Image__AlignmentAssignment_4 )? ) ;
    public final void rule__Image__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3279:1: ( ( ( rule__Image__AlignmentAssignment_4 )? ) )
            // InternalSlideOMatic.g:3280:1: ( ( rule__Image__AlignmentAssignment_4 )? )
            {
            // InternalSlideOMatic.g:3280:1: ( ( rule__Image__AlignmentAssignment_4 )? )
            // InternalSlideOMatic.g:3281:2: ( rule__Image__AlignmentAssignment_4 )?
            {
             before(grammarAccess.getImageAccess().getAlignmentAssignment_4()); 
            // InternalSlideOMatic.g:3282:2: ( rule__Image__AlignmentAssignment_4 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=58 && LA34_0<=66)) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalSlideOMatic.g:3282:3: rule__Image__AlignmentAssignment_4
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
    // InternalSlideOMatic.g:3290:1: rule__Image__Group__5 : rule__Image__Group__5__Impl ;
    public final void rule__Image__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3294:1: ( rule__Image__Group__5__Impl )
            // InternalSlideOMatic.g:3295:2: rule__Image__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Image__Group__5__Impl();

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
    // InternalSlideOMatic.g:3301:1: rule__Image__Group__5__Impl : ( ( rule__Image__SizeAssignment_5 ) ) ;
    public final void rule__Image__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3305:1: ( ( ( rule__Image__SizeAssignment_5 ) ) )
            // InternalSlideOMatic.g:3306:1: ( ( rule__Image__SizeAssignment_5 ) )
            {
            // InternalSlideOMatic.g:3306:1: ( ( rule__Image__SizeAssignment_5 ) )
            // InternalSlideOMatic.g:3307:2: ( rule__Image__SizeAssignment_5 )
            {
             before(grammarAccess.getImageAccess().getSizeAssignment_5()); 
            // InternalSlideOMatic.g:3308:2: ( rule__Image__SizeAssignment_5 )
            // InternalSlideOMatic.g:3308:3: rule__Image__SizeAssignment_5
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


    // $ANTLR start "rule__Size__Group_0__0"
    // InternalSlideOMatic.g:3317:1: rule__Size__Group_0__0 : rule__Size__Group_0__0__Impl rule__Size__Group_0__1 ;
    public final void rule__Size__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3321:1: ( rule__Size__Group_0__0__Impl rule__Size__Group_0__1 )
            // InternalSlideOMatic.g:3322:2: rule__Size__Group_0__0__Impl rule__Size__Group_0__1
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
    // InternalSlideOMatic.g:3329:1: rule__Size__Group_0__0__Impl : ( () ) ;
    public final void rule__Size__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3333:1: ( ( () ) )
            // InternalSlideOMatic.g:3334:1: ( () )
            {
            // InternalSlideOMatic.g:3334:1: ( () )
            // InternalSlideOMatic.g:3335:2: ()
            {
             before(grammarAccess.getSizeAccess().getProportionalSizeAction_0_0()); 
            // InternalSlideOMatic.g:3336:2: ()
            // InternalSlideOMatic.g:3336:3: 
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
    // InternalSlideOMatic.g:3344:1: rule__Size__Group_0__1 : rule__Size__Group_0__1__Impl rule__Size__Group_0__2 ;
    public final void rule__Size__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3348:1: ( rule__Size__Group_0__1__Impl rule__Size__Group_0__2 )
            // InternalSlideOMatic.g:3349:2: rule__Size__Group_0__1__Impl rule__Size__Group_0__2
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
    // InternalSlideOMatic.g:3356:1: rule__Size__Group_0__1__Impl : ( ( rule__Size__WayAssignment_0_1 ) ) ;
    public final void rule__Size__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3360:1: ( ( ( rule__Size__WayAssignment_0_1 ) ) )
            // InternalSlideOMatic.g:3361:1: ( ( rule__Size__WayAssignment_0_1 ) )
            {
            // InternalSlideOMatic.g:3361:1: ( ( rule__Size__WayAssignment_0_1 ) )
            // InternalSlideOMatic.g:3362:2: ( rule__Size__WayAssignment_0_1 )
            {
             before(grammarAccess.getSizeAccess().getWayAssignment_0_1()); 
            // InternalSlideOMatic.g:3363:2: ( rule__Size__WayAssignment_0_1 )
            // InternalSlideOMatic.g:3363:3: rule__Size__WayAssignment_0_1
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
    // InternalSlideOMatic.g:3371:1: rule__Size__Group_0__2 : rule__Size__Group_0__2__Impl rule__Size__Group_0__3 ;
    public final void rule__Size__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3375:1: ( rule__Size__Group_0__2__Impl rule__Size__Group_0__3 )
            // InternalSlideOMatic.g:3376:2: rule__Size__Group_0__2__Impl rule__Size__Group_0__3
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
    // InternalSlideOMatic.g:3383:1: rule__Size__Group_0__2__Impl : ( ( rule__Size__ScaleAssignment_0_2 ) ) ;
    public final void rule__Size__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3387:1: ( ( ( rule__Size__ScaleAssignment_0_2 ) ) )
            // InternalSlideOMatic.g:3388:1: ( ( rule__Size__ScaleAssignment_0_2 ) )
            {
            // InternalSlideOMatic.g:3388:1: ( ( rule__Size__ScaleAssignment_0_2 ) )
            // InternalSlideOMatic.g:3389:2: ( rule__Size__ScaleAssignment_0_2 )
            {
             before(grammarAccess.getSizeAccess().getScaleAssignment_0_2()); 
            // InternalSlideOMatic.g:3390:2: ( rule__Size__ScaleAssignment_0_2 )
            // InternalSlideOMatic.g:3390:3: rule__Size__ScaleAssignment_0_2
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
    // InternalSlideOMatic.g:3398:1: rule__Size__Group_0__3 : rule__Size__Group_0__3__Impl ;
    public final void rule__Size__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3402:1: ( rule__Size__Group_0__3__Impl )
            // InternalSlideOMatic.g:3403:2: rule__Size__Group_0__3__Impl
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
    // InternalSlideOMatic.g:3409:1: rule__Size__Group_0__3__Impl : ( '%' ) ;
    public final void rule__Size__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3413:1: ( ( '%' ) )
            // InternalSlideOMatic.g:3414:1: ( '%' )
            {
            // InternalSlideOMatic.g:3414:1: ( '%' )
            // InternalSlideOMatic.g:3415:2: '%'
            {
             before(grammarAccess.getSizeAccess().getPercentSignKeyword_0_3()); 
            match(input,91,FOLLOW_2); 
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
    // InternalSlideOMatic.g:3425:1: rule__Size__Group_1__0 : rule__Size__Group_1__0__Impl rule__Size__Group_1__1 ;
    public final void rule__Size__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3429:1: ( rule__Size__Group_1__0__Impl rule__Size__Group_1__1 )
            // InternalSlideOMatic.g:3430:2: rule__Size__Group_1__0__Impl rule__Size__Group_1__1
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
    // InternalSlideOMatic.g:3437:1: rule__Size__Group_1__0__Impl : ( () ) ;
    public final void rule__Size__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3441:1: ( ( () ) )
            // InternalSlideOMatic.g:3442:1: ( () )
            {
            // InternalSlideOMatic.g:3442:1: ( () )
            // InternalSlideOMatic.g:3443:2: ()
            {
             before(grammarAccess.getSizeAccess().getExactSizeAction_1_0()); 
            // InternalSlideOMatic.g:3444:2: ()
            // InternalSlideOMatic.g:3444:3: 
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
    // InternalSlideOMatic.g:3452:1: rule__Size__Group_1__1 : rule__Size__Group_1__1__Impl rule__Size__Group_1__2 ;
    public final void rule__Size__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3456:1: ( rule__Size__Group_1__1__Impl rule__Size__Group_1__2 )
            // InternalSlideOMatic.g:3457:2: rule__Size__Group_1__1__Impl rule__Size__Group_1__2
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
    // InternalSlideOMatic.g:3464:1: rule__Size__Group_1__1__Impl : ( ( rule__Size__SizeAssignment_1_1 ) ) ;
    public final void rule__Size__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3468:1: ( ( ( rule__Size__SizeAssignment_1_1 ) ) )
            // InternalSlideOMatic.g:3469:1: ( ( rule__Size__SizeAssignment_1_1 ) )
            {
            // InternalSlideOMatic.g:3469:1: ( ( rule__Size__SizeAssignment_1_1 ) )
            // InternalSlideOMatic.g:3470:2: ( rule__Size__SizeAssignment_1_1 )
            {
             before(grammarAccess.getSizeAccess().getSizeAssignment_1_1()); 
            // InternalSlideOMatic.g:3471:2: ( rule__Size__SizeAssignment_1_1 )
            // InternalSlideOMatic.g:3471:3: rule__Size__SizeAssignment_1_1
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
    // InternalSlideOMatic.g:3479:1: rule__Size__Group_1__2 : rule__Size__Group_1__2__Impl ;
    public final void rule__Size__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3483:1: ( rule__Size__Group_1__2__Impl )
            // InternalSlideOMatic.g:3484:2: rule__Size__Group_1__2__Impl
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
    // InternalSlideOMatic.g:3490:1: rule__Size__Group_1__2__Impl : ( ( rule__Size__UnitAssignment_1_2 ) ) ;
    public final void rule__Size__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3494:1: ( ( ( rule__Size__UnitAssignment_1_2 ) ) )
            // InternalSlideOMatic.g:3495:1: ( ( rule__Size__UnitAssignment_1_2 ) )
            {
            // InternalSlideOMatic.g:3495:1: ( ( rule__Size__UnitAssignment_1_2 ) )
            // InternalSlideOMatic.g:3496:2: ( rule__Size__UnitAssignment_1_2 )
            {
             before(grammarAccess.getSizeAccess().getUnitAssignment_1_2()); 
            // InternalSlideOMatic.g:3497:2: ( rule__Size__UnitAssignment_1_2 )
            // InternalSlideOMatic.g:3497:3: rule__Size__UnitAssignment_1_2
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


    // $ANTLR start "rule__Way__Group_0__0"
    // InternalSlideOMatic.g:3506:1: rule__Way__Group_0__0 : rule__Way__Group_0__0__Impl rule__Way__Group_0__1 ;
    public final void rule__Way__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3510:1: ( rule__Way__Group_0__0__Impl rule__Way__Group_0__1 )
            // InternalSlideOMatic.g:3511:2: rule__Way__Group_0__0__Impl rule__Way__Group_0__1
            {
            pushFollow(FOLLOW_35);
            rule__Way__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Way__Group_0__1();

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
    // $ANTLR end "rule__Way__Group_0__0"


    // $ANTLR start "rule__Way__Group_0__0__Impl"
    // InternalSlideOMatic.g:3518:1: rule__Way__Group_0__0__Impl : ( () ) ;
    public final void rule__Way__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3522:1: ( ( () ) )
            // InternalSlideOMatic.g:3523:1: ( () )
            {
            // InternalSlideOMatic.g:3523:1: ( () )
            // InternalSlideOMatic.g:3524:2: ()
            {
             before(grammarAccess.getWayAccess().getWidthAction_0_0()); 
            // InternalSlideOMatic.g:3525:2: ()
            // InternalSlideOMatic.g:3525:3: 
            {
            }

             after(grammarAccess.getWayAccess().getWidthAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Way__Group_0__0__Impl"


    // $ANTLR start "rule__Way__Group_0__1"
    // InternalSlideOMatic.g:3533:1: rule__Way__Group_0__1 : rule__Way__Group_0__1__Impl ;
    public final void rule__Way__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3537:1: ( rule__Way__Group_0__1__Impl )
            // InternalSlideOMatic.g:3538:2: rule__Way__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Way__Group_0__1__Impl();

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
    // $ANTLR end "rule__Way__Group_0__1"


    // $ANTLR start "rule__Way__Group_0__1__Impl"
    // InternalSlideOMatic.g:3544:1: rule__Way__Group_0__1__Impl : ( 'width' ) ;
    public final void rule__Way__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3548:1: ( ( 'width' ) )
            // InternalSlideOMatic.g:3549:1: ( 'width' )
            {
            // InternalSlideOMatic.g:3549:1: ( 'width' )
            // InternalSlideOMatic.g:3550:2: 'width'
            {
             before(grammarAccess.getWayAccess().getWidthKeyword_0_1()); 
            match(input,92,FOLLOW_2); 
             after(grammarAccess.getWayAccess().getWidthKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Way__Group_0__1__Impl"


    // $ANTLR start "rule__Way__Group_1__0"
    // InternalSlideOMatic.g:3560:1: rule__Way__Group_1__0 : rule__Way__Group_1__0__Impl rule__Way__Group_1__1 ;
    public final void rule__Way__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3564:1: ( rule__Way__Group_1__0__Impl rule__Way__Group_1__1 )
            // InternalSlideOMatic.g:3565:2: rule__Way__Group_1__0__Impl rule__Way__Group_1__1
            {
            pushFollow(FOLLOW_31);
            rule__Way__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Way__Group_1__1();

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
    // $ANTLR end "rule__Way__Group_1__0"


    // $ANTLR start "rule__Way__Group_1__0__Impl"
    // InternalSlideOMatic.g:3572:1: rule__Way__Group_1__0__Impl : ( () ) ;
    public final void rule__Way__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3576:1: ( ( () ) )
            // InternalSlideOMatic.g:3577:1: ( () )
            {
            // InternalSlideOMatic.g:3577:1: ( () )
            // InternalSlideOMatic.g:3578:2: ()
            {
             before(grammarAccess.getWayAccess().getHeightAction_1_0()); 
            // InternalSlideOMatic.g:3579:2: ()
            // InternalSlideOMatic.g:3579:3: 
            {
            }

             after(grammarAccess.getWayAccess().getHeightAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Way__Group_1__0__Impl"


    // $ANTLR start "rule__Way__Group_1__1"
    // InternalSlideOMatic.g:3587:1: rule__Way__Group_1__1 : rule__Way__Group_1__1__Impl ;
    public final void rule__Way__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3591:1: ( rule__Way__Group_1__1__Impl )
            // InternalSlideOMatic.g:3592:2: rule__Way__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Way__Group_1__1__Impl();

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
    // $ANTLR end "rule__Way__Group_1__1"


    // $ANTLR start "rule__Way__Group_1__1__Impl"
    // InternalSlideOMatic.g:3598:1: rule__Way__Group_1__1__Impl : ( 'height' ) ;
    public final void rule__Way__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3602:1: ( ( 'height' ) )
            // InternalSlideOMatic.g:3603:1: ( 'height' )
            {
            // InternalSlideOMatic.g:3603:1: ( 'height' )
            // InternalSlideOMatic.g:3604:2: 'height'
            {
             before(grammarAccess.getWayAccess().getHeightKeyword_1_1()); 
            match(input,93,FOLLOW_2); 
             after(grammarAccess.getWayAccess().getHeightKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Way__Group_1__1__Impl"


    // $ANTLR start "rule__Table__Group__0"
    // InternalSlideOMatic.g:3614:1: rule__Table__Group__0 : rule__Table__Group__0__Impl rule__Table__Group__1 ;
    public final void rule__Table__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3618:1: ( rule__Table__Group__0__Impl rule__Table__Group__1 )
            // InternalSlideOMatic.g:3619:2: rule__Table__Group__0__Impl rule__Table__Group__1
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
    // InternalSlideOMatic.g:3626:1: rule__Table__Group__0__Impl : ( 'tab' ) ;
    public final void rule__Table__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3630:1: ( ( 'tab' ) )
            // InternalSlideOMatic.g:3631:1: ( 'tab' )
            {
            // InternalSlideOMatic.g:3631:1: ( 'tab' )
            // InternalSlideOMatic.g:3632:2: 'tab'
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
    // InternalSlideOMatic.g:3641:1: rule__Table__Group__1 : rule__Table__Group__1__Impl rule__Table__Group__2 ;
    public final void rule__Table__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3645:1: ( rule__Table__Group__1__Impl rule__Table__Group__2 )
            // InternalSlideOMatic.g:3646:2: rule__Table__Group__1__Impl rule__Table__Group__2
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
    // InternalSlideOMatic.g:3653:1: rule__Table__Group__1__Impl : ( ( rule__Table__NameAssignment_1 ) ) ;
    public final void rule__Table__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3657:1: ( ( ( rule__Table__NameAssignment_1 ) ) )
            // InternalSlideOMatic.g:3658:1: ( ( rule__Table__NameAssignment_1 ) )
            {
            // InternalSlideOMatic.g:3658:1: ( ( rule__Table__NameAssignment_1 ) )
            // InternalSlideOMatic.g:3659:2: ( rule__Table__NameAssignment_1 )
            {
             before(grammarAccess.getTableAccess().getNameAssignment_1()); 
            // InternalSlideOMatic.g:3660:2: ( rule__Table__NameAssignment_1 )
            // InternalSlideOMatic.g:3660:3: rule__Table__NameAssignment_1
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
    // InternalSlideOMatic.g:3668:1: rule__Table__Group__2 : rule__Table__Group__2__Impl rule__Table__Group__3 ;
    public final void rule__Table__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3672:1: ( rule__Table__Group__2__Impl rule__Table__Group__3 )
            // InternalSlideOMatic.g:3673:2: rule__Table__Group__2__Impl rule__Table__Group__3
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
    // InternalSlideOMatic.g:3680:1: rule__Table__Group__2__Impl : ( '[' ) ;
    public final void rule__Table__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3684:1: ( ( '[' ) )
            // InternalSlideOMatic.g:3685:1: ( '[' )
            {
            // InternalSlideOMatic.g:3685:1: ( '[' )
            // InternalSlideOMatic.g:3686:2: '['
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
    // InternalSlideOMatic.g:3695:1: rule__Table__Group__3 : rule__Table__Group__3__Impl rule__Table__Group__4 ;
    public final void rule__Table__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3699:1: ( rule__Table__Group__3__Impl rule__Table__Group__4 )
            // InternalSlideOMatic.g:3700:2: rule__Table__Group__3__Impl rule__Table__Group__4
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
    // InternalSlideOMatic.g:3707:1: rule__Table__Group__3__Impl : ( ( rule__Table__RowsAssignment_3 ) ) ;
    public final void rule__Table__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3711:1: ( ( ( rule__Table__RowsAssignment_3 ) ) )
            // InternalSlideOMatic.g:3712:1: ( ( rule__Table__RowsAssignment_3 ) )
            {
            // InternalSlideOMatic.g:3712:1: ( ( rule__Table__RowsAssignment_3 ) )
            // InternalSlideOMatic.g:3713:2: ( rule__Table__RowsAssignment_3 )
            {
             before(grammarAccess.getTableAccess().getRowsAssignment_3()); 
            // InternalSlideOMatic.g:3714:2: ( rule__Table__RowsAssignment_3 )
            // InternalSlideOMatic.g:3714:3: rule__Table__RowsAssignment_3
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
    // InternalSlideOMatic.g:3722:1: rule__Table__Group__4 : rule__Table__Group__4__Impl rule__Table__Group__5 ;
    public final void rule__Table__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3726:1: ( rule__Table__Group__4__Impl rule__Table__Group__5 )
            // InternalSlideOMatic.g:3727:2: rule__Table__Group__4__Impl rule__Table__Group__5
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
    // InternalSlideOMatic.g:3734:1: rule__Table__Group__4__Impl : ( ( rule__Table__Group_4__0 )* ) ;
    public final void rule__Table__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3738:1: ( ( ( rule__Table__Group_4__0 )* ) )
            // InternalSlideOMatic.g:3739:1: ( ( rule__Table__Group_4__0 )* )
            {
            // InternalSlideOMatic.g:3739:1: ( ( rule__Table__Group_4__0 )* )
            // InternalSlideOMatic.g:3740:2: ( rule__Table__Group_4__0 )*
            {
             before(grammarAccess.getTableAccess().getGroup_4()); 
            // InternalSlideOMatic.g:3741:2: ( rule__Table__Group_4__0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==77) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalSlideOMatic.g:3741:3: rule__Table__Group_4__0
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
    // InternalSlideOMatic.g:3749:1: rule__Table__Group__5 : rule__Table__Group__5__Impl ;
    public final void rule__Table__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3753:1: ( rule__Table__Group__5__Impl )
            // InternalSlideOMatic.g:3754:2: rule__Table__Group__5__Impl
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
    // InternalSlideOMatic.g:3760:1: rule__Table__Group__5__Impl : ( ']' ) ;
    public final void rule__Table__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3764:1: ( ( ']' ) )
            // InternalSlideOMatic.g:3765:1: ( ']' )
            {
            // InternalSlideOMatic.g:3765:1: ( ']' )
            // InternalSlideOMatic.g:3766:2: ']'
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
    // InternalSlideOMatic.g:3776:1: rule__Table__Group_4__0 : rule__Table__Group_4__0__Impl rule__Table__Group_4__1 ;
    public final void rule__Table__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3780:1: ( rule__Table__Group_4__0__Impl rule__Table__Group_4__1 )
            // InternalSlideOMatic.g:3781:2: rule__Table__Group_4__0__Impl rule__Table__Group_4__1
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
    // InternalSlideOMatic.g:3788:1: rule__Table__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Table__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3792:1: ( ( ',' ) )
            // InternalSlideOMatic.g:3793:1: ( ',' )
            {
            // InternalSlideOMatic.g:3793:1: ( ',' )
            // InternalSlideOMatic.g:3794:2: ','
            {
             before(grammarAccess.getTableAccess().getCommaKeyword_4_0()); 
            match(input,77,FOLLOW_2); 
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
    // InternalSlideOMatic.g:3803:1: rule__Table__Group_4__1 : rule__Table__Group_4__1__Impl ;
    public final void rule__Table__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3807:1: ( rule__Table__Group_4__1__Impl )
            // InternalSlideOMatic.g:3808:2: rule__Table__Group_4__1__Impl
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
    // InternalSlideOMatic.g:3814:1: rule__Table__Group_4__1__Impl : ( ( rule__Table__RowsAssignment_4_1 ) ) ;
    public final void rule__Table__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3818:1: ( ( ( rule__Table__RowsAssignment_4_1 ) ) )
            // InternalSlideOMatic.g:3819:1: ( ( rule__Table__RowsAssignment_4_1 ) )
            {
            // InternalSlideOMatic.g:3819:1: ( ( rule__Table__RowsAssignment_4_1 ) )
            // InternalSlideOMatic.g:3820:2: ( rule__Table__RowsAssignment_4_1 )
            {
             before(grammarAccess.getTableAccess().getRowsAssignment_4_1()); 
            // InternalSlideOMatic.g:3821:2: ( rule__Table__RowsAssignment_4_1 )
            // InternalSlideOMatic.g:3821:3: rule__Table__RowsAssignment_4_1
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
    // InternalSlideOMatic.g:3830:1: rule__TableRow__Group__0 : rule__TableRow__Group__0__Impl rule__TableRow__Group__1 ;
    public final void rule__TableRow__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3834:1: ( rule__TableRow__Group__0__Impl rule__TableRow__Group__1 )
            // InternalSlideOMatic.g:3835:2: rule__TableRow__Group__0__Impl rule__TableRow__Group__1
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
    // InternalSlideOMatic.g:3842:1: rule__TableRow__Group__0__Impl : ( '[' ) ;
    public final void rule__TableRow__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3846:1: ( ( '[' ) )
            // InternalSlideOMatic.g:3847:1: ( '[' )
            {
            // InternalSlideOMatic.g:3847:1: ( '[' )
            // InternalSlideOMatic.g:3848:2: '['
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
    // InternalSlideOMatic.g:3857:1: rule__TableRow__Group__1 : rule__TableRow__Group__1__Impl rule__TableRow__Group__2 ;
    public final void rule__TableRow__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3861:1: ( rule__TableRow__Group__1__Impl rule__TableRow__Group__2 )
            // InternalSlideOMatic.g:3862:2: rule__TableRow__Group__1__Impl rule__TableRow__Group__2
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
    // InternalSlideOMatic.g:3869:1: rule__TableRow__Group__1__Impl : ( ( rule__TableRow__ValuesAssignment_1 ) ) ;
    public final void rule__TableRow__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3873:1: ( ( ( rule__TableRow__ValuesAssignment_1 ) ) )
            // InternalSlideOMatic.g:3874:1: ( ( rule__TableRow__ValuesAssignment_1 ) )
            {
            // InternalSlideOMatic.g:3874:1: ( ( rule__TableRow__ValuesAssignment_1 ) )
            // InternalSlideOMatic.g:3875:2: ( rule__TableRow__ValuesAssignment_1 )
            {
             before(grammarAccess.getTableRowAccess().getValuesAssignment_1()); 
            // InternalSlideOMatic.g:3876:2: ( rule__TableRow__ValuesAssignment_1 )
            // InternalSlideOMatic.g:3876:3: rule__TableRow__ValuesAssignment_1
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
    // InternalSlideOMatic.g:3884:1: rule__TableRow__Group__2 : rule__TableRow__Group__2__Impl rule__TableRow__Group__3 ;
    public final void rule__TableRow__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3888:1: ( rule__TableRow__Group__2__Impl rule__TableRow__Group__3 )
            // InternalSlideOMatic.g:3889:2: rule__TableRow__Group__2__Impl rule__TableRow__Group__3
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
    // InternalSlideOMatic.g:3896:1: rule__TableRow__Group__2__Impl : ( ( rule__TableRow__Group_2__0 )* ) ;
    public final void rule__TableRow__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3900:1: ( ( ( rule__TableRow__Group_2__0 )* ) )
            // InternalSlideOMatic.g:3901:1: ( ( rule__TableRow__Group_2__0 )* )
            {
            // InternalSlideOMatic.g:3901:1: ( ( rule__TableRow__Group_2__0 )* )
            // InternalSlideOMatic.g:3902:2: ( rule__TableRow__Group_2__0 )*
            {
             before(grammarAccess.getTableRowAccess().getGroup_2()); 
            // InternalSlideOMatic.g:3903:2: ( rule__TableRow__Group_2__0 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==77) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalSlideOMatic.g:3903:3: rule__TableRow__Group_2__0
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
    // InternalSlideOMatic.g:3911:1: rule__TableRow__Group__3 : rule__TableRow__Group__3__Impl ;
    public final void rule__TableRow__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3915:1: ( rule__TableRow__Group__3__Impl )
            // InternalSlideOMatic.g:3916:2: rule__TableRow__Group__3__Impl
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
    // InternalSlideOMatic.g:3922:1: rule__TableRow__Group__3__Impl : ( ']' ) ;
    public final void rule__TableRow__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3926:1: ( ( ']' ) )
            // InternalSlideOMatic.g:3927:1: ( ']' )
            {
            // InternalSlideOMatic.g:3927:1: ( ']' )
            // InternalSlideOMatic.g:3928:2: ']'
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
    // InternalSlideOMatic.g:3938:1: rule__TableRow__Group_2__0 : rule__TableRow__Group_2__0__Impl rule__TableRow__Group_2__1 ;
    public final void rule__TableRow__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3942:1: ( rule__TableRow__Group_2__0__Impl rule__TableRow__Group_2__1 )
            // InternalSlideOMatic.g:3943:2: rule__TableRow__Group_2__0__Impl rule__TableRow__Group_2__1
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
    // InternalSlideOMatic.g:3950:1: rule__TableRow__Group_2__0__Impl : ( ',' ) ;
    public final void rule__TableRow__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3954:1: ( ( ',' ) )
            // InternalSlideOMatic.g:3955:1: ( ',' )
            {
            // InternalSlideOMatic.g:3955:1: ( ',' )
            // InternalSlideOMatic.g:3956:2: ','
            {
             before(grammarAccess.getTableRowAccess().getCommaKeyword_2_0()); 
            match(input,77,FOLLOW_2); 
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
    // InternalSlideOMatic.g:3965:1: rule__TableRow__Group_2__1 : rule__TableRow__Group_2__1__Impl ;
    public final void rule__TableRow__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3969:1: ( rule__TableRow__Group_2__1__Impl )
            // InternalSlideOMatic.g:3970:2: rule__TableRow__Group_2__1__Impl
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
    // InternalSlideOMatic.g:3976:1: rule__TableRow__Group_2__1__Impl : ( ( rule__TableRow__ValuesAssignment_2_1 ) ) ;
    public final void rule__TableRow__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3980:1: ( ( ( rule__TableRow__ValuesAssignment_2_1 ) ) )
            // InternalSlideOMatic.g:3981:1: ( ( rule__TableRow__ValuesAssignment_2_1 ) )
            {
            // InternalSlideOMatic.g:3981:1: ( ( rule__TableRow__ValuesAssignment_2_1 ) )
            // InternalSlideOMatic.g:3982:2: ( rule__TableRow__ValuesAssignment_2_1 )
            {
             before(grammarAccess.getTableRowAccess().getValuesAssignment_2_1()); 
            // InternalSlideOMatic.g:3983:2: ( rule__TableRow__ValuesAssignment_2_1 )
            // InternalSlideOMatic.g:3983:3: rule__TableRow__ValuesAssignment_2_1
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
    // InternalSlideOMatic.g:3992:1: rule__Code__Group__0 : rule__Code__Group__0__Impl rule__Code__Group__1 ;
    public final void rule__Code__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3996:1: ( rule__Code__Group__0__Impl rule__Code__Group__1 )
            // InternalSlideOMatic.g:3997:2: rule__Code__Group__0__Impl rule__Code__Group__1
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
    // InternalSlideOMatic.g:4004:1: rule__Code__Group__0__Impl : ( '```' ) ;
    public final void rule__Code__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4008:1: ( ( '```' ) )
            // InternalSlideOMatic.g:4009:1: ( '```' )
            {
            // InternalSlideOMatic.g:4009:1: ( '```' )
            // InternalSlideOMatic.g:4010:2: '```'
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
    // InternalSlideOMatic.g:4019:1: rule__Code__Group__1 : rule__Code__Group__1__Impl rule__Code__Group__2 ;
    public final void rule__Code__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4023:1: ( rule__Code__Group__1__Impl rule__Code__Group__2 )
            // InternalSlideOMatic.g:4024:2: rule__Code__Group__1__Impl rule__Code__Group__2
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
    // InternalSlideOMatic.g:4031:1: rule__Code__Group__1__Impl : ( ( rule__Code__LangAssignment_1 ) ) ;
    public final void rule__Code__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4035:1: ( ( ( rule__Code__LangAssignment_1 ) ) )
            // InternalSlideOMatic.g:4036:1: ( ( rule__Code__LangAssignment_1 ) )
            {
            // InternalSlideOMatic.g:4036:1: ( ( rule__Code__LangAssignment_1 ) )
            // InternalSlideOMatic.g:4037:2: ( rule__Code__LangAssignment_1 )
            {
             before(grammarAccess.getCodeAccess().getLangAssignment_1()); 
            // InternalSlideOMatic.g:4038:2: ( rule__Code__LangAssignment_1 )
            // InternalSlideOMatic.g:4038:3: rule__Code__LangAssignment_1
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
    // InternalSlideOMatic.g:4046:1: rule__Code__Group__2 : rule__Code__Group__2__Impl rule__Code__Group__3 ;
    public final void rule__Code__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4050:1: ( rule__Code__Group__2__Impl rule__Code__Group__3 )
            // InternalSlideOMatic.g:4051:2: rule__Code__Group__2__Impl rule__Code__Group__3
            {
            pushFollow(FOLLOW_38);
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
    // InternalSlideOMatic.g:4058:1: rule__Code__Group__2__Impl : ( ( rule__Code__CodeAssignment_2 ) ) ;
    public final void rule__Code__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4062:1: ( ( ( rule__Code__CodeAssignment_2 ) ) )
            // InternalSlideOMatic.g:4063:1: ( ( rule__Code__CodeAssignment_2 ) )
            {
            // InternalSlideOMatic.g:4063:1: ( ( rule__Code__CodeAssignment_2 ) )
            // InternalSlideOMatic.g:4064:2: ( rule__Code__CodeAssignment_2 )
            {
             before(grammarAccess.getCodeAccess().getCodeAssignment_2()); 
            // InternalSlideOMatic.g:4065:2: ( rule__Code__CodeAssignment_2 )
            // InternalSlideOMatic.g:4065:3: rule__Code__CodeAssignment_2
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
    // InternalSlideOMatic.g:4073:1: rule__Code__Group__3 : rule__Code__Group__3__Impl ;
    public final void rule__Code__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4077:1: ( rule__Code__Group__3__Impl )
            // InternalSlideOMatic.g:4078:2: rule__Code__Group__3__Impl
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
    // InternalSlideOMatic.g:4084:1: rule__Code__Group__3__Impl : ( '```' ) ;
    public final void rule__Code__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4088:1: ( ( '```' ) )
            // InternalSlideOMatic.g:4089:1: ( '```' )
            {
            // InternalSlideOMatic.g:4089:1: ( '```' )
            // InternalSlideOMatic.g:4090:2: '```'
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
    // InternalSlideOMatic.g:4100:1: rule__Animation__Group__0 : rule__Animation__Group__0__Impl rule__Animation__Group__1 ;
    public final void rule__Animation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4104:1: ( rule__Animation__Group__0__Impl rule__Animation__Group__1 )
            // InternalSlideOMatic.g:4105:2: rule__Animation__Group__0__Impl rule__Animation__Group__1
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
    // InternalSlideOMatic.g:4112:1: rule__Animation__Group__0__Impl : ( 'animate' ) ;
    public final void rule__Animation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4116:1: ( ( 'animate' ) )
            // InternalSlideOMatic.g:4117:1: ( 'animate' )
            {
            // InternalSlideOMatic.g:4117:1: ( 'animate' )
            // InternalSlideOMatic.g:4118:2: 'animate'
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
    // InternalSlideOMatic.g:4127:1: rule__Animation__Group__1 : rule__Animation__Group__1__Impl rule__Animation__Group__2 ;
    public final void rule__Animation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4131:1: ( rule__Animation__Group__1__Impl rule__Animation__Group__2 )
            // InternalSlideOMatic.g:4132:2: rule__Animation__Group__1__Impl rule__Animation__Group__2
            {
            pushFollow(FOLLOW_39);
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
    // InternalSlideOMatic.g:4139:1: rule__Animation__Group__1__Impl : ( ( rule__Animation__TargetAssignment_1 ) ) ;
    public final void rule__Animation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4143:1: ( ( ( rule__Animation__TargetAssignment_1 ) ) )
            // InternalSlideOMatic.g:4144:1: ( ( rule__Animation__TargetAssignment_1 ) )
            {
            // InternalSlideOMatic.g:4144:1: ( ( rule__Animation__TargetAssignment_1 ) )
            // InternalSlideOMatic.g:4145:2: ( rule__Animation__TargetAssignment_1 )
            {
             before(grammarAccess.getAnimationAccess().getTargetAssignment_1()); 
            // InternalSlideOMatic.g:4146:2: ( rule__Animation__TargetAssignment_1 )
            // InternalSlideOMatic.g:4146:3: rule__Animation__TargetAssignment_1
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
    // InternalSlideOMatic.g:4154:1: rule__Animation__Group__2 : rule__Animation__Group__2__Impl rule__Animation__Group__3 ;
    public final void rule__Animation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4158:1: ( rule__Animation__Group__2__Impl rule__Animation__Group__3 )
            // InternalSlideOMatic.g:4159:2: rule__Animation__Group__2__Impl rule__Animation__Group__3
            {
            pushFollow(FOLLOW_40);
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
    // InternalSlideOMatic.g:4166:1: rule__Animation__Group__2__Impl : ( ( rule__Animation__TypeAssignment_2 ) ) ;
    public final void rule__Animation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4170:1: ( ( ( rule__Animation__TypeAssignment_2 ) ) )
            // InternalSlideOMatic.g:4171:1: ( ( rule__Animation__TypeAssignment_2 ) )
            {
            // InternalSlideOMatic.g:4171:1: ( ( rule__Animation__TypeAssignment_2 ) )
            // InternalSlideOMatic.g:4172:2: ( rule__Animation__TypeAssignment_2 )
            {
             before(grammarAccess.getAnimationAccess().getTypeAssignment_2()); 
            // InternalSlideOMatic.g:4173:2: ( rule__Animation__TypeAssignment_2 )
            // InternalSlideOMatic.g:4173:3: rule__Animation__TypeAssignment_2
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
    // InternalSlideOMatic.g:4181:1: rule__Animation__Group__3 : rule__Animation__Group__3__Impl rule__Animation__Group__4 ;
    public final void rule__Animation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4185:1: ( rule__Animation__Group__3__Impl rule__Animation__Group__4 )
            // InternalSlideOMatic.g:4186:2: rule__Animation__Group__3__Impl rule__Animation__Group__4
            {
            pushFollow(FOLLOW_41);
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
    // InternalSlideOMatic.g:4193:1: rule__Animation__Group__3__Impl : ( 'to' ) ;
    public final void rule__Animation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4197:1: ( ( 'to' ) )
            // InternalSlideOMatic.g:4198:1: ( 'to' )
            {
            // InternalSlideOMatic.g:4198:1: ( 'to' )
            // InternalSlideOMatic.g:4199:2: 'to'
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
    // InternalSlideOMatic.g:4208:1: rule__Animation__Group__4 : rule__Animation__Group__4__Impl rule__Animation__Group__5 ;
    public final void rule__Animation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4212:1: ( rule__Animation__Group__4__Impl rule__Animation__Group__5 )
            // InternalSlideOMatic.g:4213:2: rule__Animation__Group__4__Impl rule__Animation__Group__5
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
    // InternalSlideOMatic.g:4220:1: rule__Animation__Group__4__Impl : ( ( rule__Animation__LocationAssignment_4 ) ) ;
    public final void rule__Animation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4224:1: ( ( ( rule__Animation__LocationAssignment_4 ) ) )
            // InternalSlideOMatic.g:4225:1: ( ( rule__Animation__LocationAssignment_4 ) )
            {
            // InternalSlideOMatic.g:4225:1: ( ( rule__Animation__LocationAssignment_4 ) )
            // InternalSlideOMatic.g:4226:2: ( rule__Animation__LocationAssignment_4 )
            {
             before(grammarAccess.getAnimationAccess().getLocationAssignment_4()); 
            // InternalSlideOMatic.g:4227:2: ( rule__Animation__LocationAssignment_4 )
            // InternalSlideOMatic.g:4227:3: rule__Animation__LocationAssignment_4
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
    // InternalSlideOMatic.g:4235:1: rule__Animation__Group__5 : rule__Animation__Group__5__Impl ;
    public final void rule__Animation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4239:1: ( rule__Animation__Group__5__Impl )
            // InternalSlideOMatic.g:4240:2: rule__Animation__Group__5__Impl
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
    // InternalSlideOMatic.g:4246:1: rule__Animation__Group__5__Impl : ( ( rule__Animation__SizeAssignment_5 )? ) ;
    public final void rule__Animation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4250:1: ( ( ( rule__Animation__SizeAssignment_5 )? ) )
            // InternalSlideOMatic.g:4251:1: ( ( rule__Animation__SizeAssignment_5 )? )
            {
            // InternalSlideOMatic.g:4251:1: ( ( rule__Animation__SizeAssignment_5 )? )
            // InternalSlideOMatic.g:4252:2: ( rule__Animation__SizeAssignment_5 )?
            {
             before(grammarAccess.getAnimationAccess().getSizeAssignment_5()); 
            // InternalSlideOMatic.g:4253:2: ( rule__Animation__SizeAssignment_5 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_INT||(LA37_0>=92 && LA37_0<=93)) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalSlideOMatic.g:4253:3: rule__Animation__SizeAssignment_5
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
    // InternalSlideOMatic.g:4262:1: rule__AnimationType__Group_0__0 : rule__AnimationType__Group_0__0__Impl rule__AnimationType__Group_0__1 ;
    public final void rule__AnimationType__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4266:1: ( rule__AnimationType__Group_0__0__Impl rule__AnimationType__Group_0__1 )
            // InternalSlideOMatic.g:4267:2: rule__AnimationType__Group_0__0__Impl rule__AnimationType__Group_0__1
            {
            pushFollow(FOLLOW_42);
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
    // InternalSlideOMatic.g:4274:1: rule__AnimationType__Group_0__0__Impl : ( () ) ;
    public final void rule__AnimationType__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4278:1: ( ( () ) )
            // InternalSlideOMatic.g:4279:1: ( () )
            {
            // InternalSlideOMatic.g:4279:1: ( () )
            // InternalSlideOMatic.g:4280:2: ()
            {
             before(grammarAccess.getAnimationTypeAccess().getMoveAction_0_0()); 
            // InternalSlideOMatic.g:4281:2: ()
            // InternalSlideOMatic.g:4281:3: 
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
    // InternalSlideOMatic.g:4289:1: rule__AnimationType__Group_0__1 : rule__AnimationType__Group_0__1__Impl ;
    public final void rule__AnimationType__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4293:1: ( rule__AnimationType__Group_0__1__Impl )
            // InternalSlideOMatic.g:4294:2: rule__AnimationType__Group_0__1__Impl
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
    // InternalSlideOMatic.g:4300:1: rule__AnimationType__Group_0__1__Impl : ( 'move' ) ;
    public final void rule__AnimationType__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4304:1: ( ( 'move' ) )
            // InternalSlideOMatic.g:4305:1: ( 'move' )
            {
            // InternalSlideOMatic.g:4305:1: ( 'move' )
            // InternalSlideOMatic.g:4306:2: 'move'
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
    // InternalSlideOMatic.g:4316:1: rule__AnimationType__Group_1__0 : rule__AnimationType__Group_1__0__Impl rule__AnimationType__Group_1__1 ;
    public final void rule__AnimationType__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4320:1: ( rule__AnimationType__Group_1__0__Impl rule__AnimationType__Group_1__1 )
            // InternalSlideOMatic.g:4321:2: rule__AnimationType__Group_1__0__Impl rule__AnimationType__Group_1__1
            {
            pushFollow(FOLLOW_39);
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
    // InternalSlideOMatic.g:4328:1: rule__AnimationType__Group_1__0__Impl : ( () ) ;
    public final void rule__AnimationType__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4332:1: ( ( () ) )
            // InternalSlideOMatic.g:4333:1: ( () )
            {
            // InternalSlideOMatic.g:4333:1: ( () )
            // InternalSlideOMatic.g:4334:2: ()
            {
             before(grammarAccess.getAnimationTypeAccess().getJumpAction_1_0()); 
            // InternalSlideOMatic.g:4335:2: ()
            // InternalSlideOMatic.g:4335:3: 
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
    // InternalSlideOMatic.g:4343:1: rule__AnimationType__Group_1__1 : rule__AnimationType__Group_1__1__Impl ;
    public final void rule__AnimationType__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4347:1: ( rule__AnimationType__Group_1__1__Impl )
            // InternalSlideOMatic.g:4348:2: rule__AnimationType__Group_1__1__Impl
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
    // InternalSlideOMatic.g:4354:1: rule__AnimationType__Group_1__1__Impl : ( 'jump' ) ;
    public final void rule__AnimationType__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4358:1: ( ( 'jump' ) )
            // InternalSlideOMatic.g:4359:1: ( 'jump' )
            {
            // InternalSlideOMatic.g:4359:1: ( 'jump' )
            // InternalSlideOMatic.g:4360:2: 'jump'
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
    // InternalSlideOMatic.g:4370:1: rule__Presentation__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Presentation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4374:1: ( ( RULE_STRING ) )
            // InternalSlideOMatic.g:4375:2: ( RULE_STRING )
            {
            // InternalSlideOMatic.g:4375:2: ( RULE_STRING )
            // InternalSlideOMatic.g:4376:3: RULE_STRING
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
    // InternalSlideOMatic.g:4385:1: rule__Presentation__SubtitleAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Presentation__SubtitleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4389:1: ( ( RULE_STRING ) )
            // InternalSlideOMatic.g:4390:2: ( RULE_STRING )
            {
            // InternalSlideOMatic.g:4390:2: ( RULE_STRING )
            // InternalSlideOMatic.g:4391:3: RULE_STRING
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
    // InternalSlideOMatic.g:4400:1: rule__Presentation__ThemeAssignment_4_1 : ( ruleTheme ) ;
    public final void rule__Presentation__ThemeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4404:1: ( ( ruleTheme ) )
            // InternalSlideOMatic.g:4405:2: ( ruleTheme )
            {
            // InternalSlideOMatic.g:4405:2: ( ruleTheme )
            // InternalSlideOMatic.g:4406:3: ruleTheme
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
    // InternalSlideOMatic.g:4415:1: rule__Presentation__AuthorsAssignment_4_2 : ( ruleAuthors ) ;
    public final void rule__Presentation__AuthorsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4419:1: ( ( ruleAuthors ) )
            // InternalSlideOMatic.g:4420:2: ( ruleAuthors )
            {
            // InternalSlideOMatic.g:4420:2: ( ruleAuthors )
            // InternalSlideOMatic.g:4421:3: ruleAuthors
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
    // InternalSlideOMatic.g:4430:1: rule__Presentation__InstituteAssignment_4_3 : ( ruleInstitute ) ;
    public final void rule__Presentation__InstituteAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4434:1: ( ( ruleInstitute ) )
            // InternalSlideOMatic.g:4435:2: ( ruleInstitute )
            {
            // InternalSlideOMatic.g:4435:2: ( ruleInstitute )
            // InternalSlideOMatic.g:4436:3: ruleInstitute
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
    // InternalSlideOMatic.g:4445:1: rule__Presentation__DateAssignment_4_4 : ( ruleDate ) ;
    public final void rule__Presentation__DateAssignment_4_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4449:1: ( ( ruleDate ) )
            // InternalSlideOMatic.g:4450:2: ( ruleDate )
            {
            // InternalSlideOMatic.g:4450:2: ( ruleDate )
            // InternalSlideOMatic.g:4451:3: ruleDate
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
    // InternalSlideOMatic.g:4460:1: rule__Presentation__SlidesAssignment_5_0 : ( ruleSlide ) ;
    public final void rule__Presentation__SlidesAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4464:1: ( ( ruleSlide ) )
            // InternalSlideOMatic.g:4465:2: ( ruleSlide )
            {
            // InternalSlideOMatic.g:4465:2: ( ruleSlide )
            // InternalSlideOMatic.g:4466:3: ruleSlide
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
    // InternalSlideOMatic.g:4475:1: rule__Presentation__AnimationsAssignment_5_1 : ( ruleAnimation ) ;
    public final void rule__Presentation__AnimationsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4479:1: ( ( ruleAnimation ) )
            // InternalSlideOMatic.g:4480:2: ( ruleAnimation )
            {
            // InternalSlideOMatic.g:4480:2: ( ruleAnimation )
            // InternalSlideOMatic.g:4481:3: ruleAnimation
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
    // InternalSlideOMatic.g:4490:1: rule__Theme__ThemeAssignment_1 : ( ruleBeamerTheme ) ;
    public final void rule__Theme__ThemeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4494:1: ( ( ruleBeamerTheme ) )
            // InternalSlideOMatic.g:4495:2: ( ruleBeamerTheme )
            {
            // InternalSlideOMatic.g:4495:2: ( ruleBeamerTheme )
            // InternalSlideOMatic.g:4496:3: ruleBeamerTheme
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
    // InternalSlideOMatic.g:4505:1: rule__Theme__ThemeColorAssignment_2_1 : ( ruleThemeColor ) ;
    public final void rule__Theme__ThemeColorAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4509:1: ( ( ruleThemeColor ) )
            // InternalSlideOMatic.g:4510:2: ( ruleThemeColor )
            {
            // InternalSlideOMatic.g:4510:2: ( ruleThemeColor )
            // InternalSlideOMatic.g:4511:3: ruleThemeColor
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
    // InternalSlideOMatic.g:4520:1: rule__Authors__NamesAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Authors__NamesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4524:1: ( ( RULE_STRING ) )
            // InternalSlideOMatic.g:4525:2: ( RULE_STRING )
            {
            // InternalSlideOMatic.g:4525:2: ( RULE_STRING )
            // InternalSlideOMatic.g:4526:3: RULE_STRING
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
    // InternalSlideOMatic.g:4535:1: rule__Authors__NamesAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__Authors__NamesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4539:1: ( ( RULE_STRING ) )
            // InternalSlideOMatic.g:4540:2: ( RULE_STRING )
            {
            // InternalSlideOMatic.g:4540:2: ( RULE_STRING )
            // InternalSlideOMatic.g:4541:3: RULE_STRING
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
    // InternalSlideOMatic.g:4550:1: rule__Institute__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Institute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4554:1: ( ( RULE_STRING ) )
            // InternalSlideOMatic.g:4555:2: ( RULE_STRING )
            {
            // InternalSlideOMatic.g:4555:2: ( RULE_STRING )
            // InternalSlideOMatic.g:4556:3: RULE_STRING
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


    // $ANTLR start "rule__Date__DateAssignment_1_0"
    // InternalSlideOMatic.g:4565:1: rule__Date__DateAssignment_1_0 : ( RULE_STRING ) ;
    public final void rule__Date__DateAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4569:1: ( ( RULE_STRING ) )
            // InternalSlideOMatic.g:4570:2: ( RULE_STRING )
            {
            // InternalSlideOMatic.g:4570:2: ( RULE_STRING )
            // InternalSlideOMatic.g:4571:3: RULE_STRING
            {
             before(grammarAccess.getDateAccess().getDateSTRINGTerminalRuleCall_1_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDateAccess().getDateSTRINGTerminalRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__DateAssignment_1_0"


    // $ANTLR start "rule__Slide__SecAssignment_1_0_0"
    // InternalSlideOMatic.g:4580:1: rule__Slide__SecAssignment_1_0_0 : ( ruleSection ) ;
    public final void rule__Slide__SecAssignment_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4584:1: ( ( ruleSection ) )
            // InternalSlideOMatic.g:4585:2: ( ruleSection )
            {
            // InternalSlideOMatic.g:4585:2: ( ruleSection )
            // InternalSlideOMatic.g:4586:3: ruleSection
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
    // InternalSlideOMatic.g:4595:1: rule__Slide__NameAssignment_1_0_1 : ( RULE_STRING ) ;
    public final void rule__Slide__NameAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4599:1: ( ( RULE_STRING ) )
            // InternalSlideOMatic.g:4600:2: ( RULE_STRING )
            {
            // InternalSlideOMatic.g:4600:2: ( RULE_STRING )
            // InternalSlideOMatic.g:4601:3: RULE_STRING
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
    // InternalSlideOMatic.g:4610:1: rule__Slide__NameAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__Slide__NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4614:1: ( ( RULE_STRING ) )
            // InternalSlideOMatic.g:4615:2: ( RULE_STRING )
            {
            // InternalSlideOMatic.g:4615:2: ( RULE_STRING )
            // InternalSlideOMatic.g:4616:3: RULE_STRING
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
    // InternalSlideOMatic.g:4625:1: rule__Slide__ContentsAssignment_3 : ( ruleContent ) ;
    public final void rule__Slide__ContentsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4629:1: ( ( ruleContent ) )
            // InternalSlideOMatic.g:4630:2: ( ruleContent )
            {
            // InternalSlideOMatic.g:4630:2: ( ruleContent )
            // InternalSlideOMatic.g:4631:3: ruleContent
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


    // $ANTLR start "rule__Content__ClickAssignment_1"
    // InternalSlideOMatic.g:4640:1: rule__Content__ClickAssignment_1 : ( ruleClick ) ;
    public final void rule__Content__ClickAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4644:1: ( ( ruleClick ) )
            // InternalSlideOMatic.g:4645:2: ( ruleClick )
            {
            // InternalSlideOMatic.g:4645:2: ( ruleClick )
            // InternalSlideOMatic.g:4646:3: ruleClick
            {
             before(grammarAccess.getContentAccess().getClickClickParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleClick();

            state._fsp--;

             after(grammarAccess.getContentAccess().getClickClickParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Content__ClickAssignment_1"


    // $ANTLR start "rule__Text__TextAssignment"
    // InternalSlideOMatic.g:4655:1: rule__Text__TextAssignment : ( RULE_STRING ) ;
    public final void rule__Text__TextAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4659:1: ( ( RULE_STRING ) )
            // InternalSlideOMatic.g:4660:2: ( RULE_STRING )
            {
            // InternalSlideOMatic.g:4660:2: ( RULE_STRING )
            // InternalSlideOMatic.g:4661:3: RULE_STRING
            {
             before(grammarAccess.getTextAccess().getTextSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTextAccess().getTextSTRINGTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__TextAssignment"


    // $ANTLR start "rule__Block__NameAssignment_1"
    // InternalSlideOMatic.g:4670:1: rule__Block__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Block__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4674:1: ( ( RULE_STRING ) )
            // InternalSlideOMatic.g:4675:2: ( RULE_STRING )
            {
            // InternalSlideOMatic.g:4675:2: ( RULE_STRING )
            // InternalSlideOMatic.g:4676:3: RULE_STRING
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
    // InternalSlideOMatic.g:4685:1: rule__Block__ContentAssignment_3 : ( ruleContent ) ;
    public final void rule__Block__ContentAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4689:1: ( ( ruleContent ) )
            // InternalSlideOMatic.g:4690:2: ( ruleContent )
            {
            // InternalSlideOMatic.g:4690:2: ( ruleContent )
            // InternalSlideOMatic.g:4691:3: ruleContent
            {
             before(grammarAccess.getBlockAccess().getContentContentParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleContent();

            state._fsp--;

             after(grammarAccess.getBlockAccess().getContentContentParserRuleCall_3_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__NumberedList__ItemsAssignment_1"
    // InternalSlideOMatic.g:4700:1: rule__NumberedList__ItemsAssignment_1 : ( ruleListItem ) ;
    public final void rule__NumberedList__ItemsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4704:1: ( ( ruleListItem ) )
            // InternalSlideOMatic.g:4705:2: ( ruleListItem )
            {
            // InternalSlideOMatic.g:4705:2: ( ruleListItem )
            // InternalSlideOMatic.g:4706:3: ruleListItem
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
    // InternalSlideOMatic.g:4715:1: rule__UnNumberedList__ItemsAssignment_1 : ( ruleListItem ) ;
    public final void rule__UnNumberedList__ItemsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4719:1: ( ( ruleListItem ) )
            // InternalSlideOMatic.g:4720:2: ( ruleListItem )
            {
            // InternalSlideOMatic.g:4720:2: ( ruleListItem )
            // InternalSlideOMatic.g:4721:3: ruleListItem
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
    // InternalSlideOMatic.g:4730:1: rule__ListItem__ItemAssignment_1 : ( RULE_STRING ) ;
    public final void rule__ListItem__ItemAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4734:1: ( ( RULE_STRING ) )
            // InternalSlideOMatic.g:4735:2: ( RULE_STRING )
            {
            // InternalSlideOMatic.g:4735:2: ( RULE_STRING )
            // InternalSlideOMatic.g:4736:3: RULE_STRING
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
    // InternalSlideOMatic.g:4745:1: rule__ListItem__NestedListAssignment_2_1 : ( ruleList ) ;
    public final void rule__ListItem__NestedListAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4749:1: ( ( ruleList ) )
            // InternalSlideOMatic.g:4750:2: ( ruleList )
            {
            // InternalSlideOMatic.g:4750:2: ( ruleList )
            // InternalSlideOMatic.g:4751:3: ruleList
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
    // InternalSlideOMatic.g:4760:1: rule__ListItem__ClickAssignment_3 : ( ruleClick ) ;
    public final void rule__ListItem__ClickAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4764:1: ( ( ruleClick ) )
            // InternalSlideOMatic.g:4765:2: ( ruleClick )
            {
            // InternalSlideOMatic.g:4765:2: ( ruleClick )
            // InternalSlideOMatic.g:4766:3: ruleClick
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
    // InternalSlideOMatic.g:4775:1: rule__Image__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Image__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4779:1: ( ( RULE_ID ) )
            // InternalSlideOMatic.g:4780:2: ( RULE_ID )
            {
            // InternalSlideOMatic.g:4780:2: ( RULE_ID )
            // InternalSlideOMatic.g:4781:3: RULE_ID
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
    // InternalSlideOMatic.g:4790:1: rule__Image__SrcAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Image__SrcAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4794:1: ( ( RULE_STRING ) )
            // InternalSlideOMatic.g:4795:2: ( RULE_STRING )
            {
            // InternalSlideOMatic.g:4795:2: ( RULE_STRING )
            // InternalSlideOMatic.g:4796:3: RULE_STRING
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
    // InternalSlideOMatic.g:4805:1: rule__Image__AlignmentAssignment_4 : ( ruleAlignment ) ;
    public final void rule__Image__AlignmentAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4809:1: ( ( ruleAlignment ) )
            // InternalSlideOMatic.g:4810:2: ( ruleAlignment )
            {
            // InternalSlideOMatic.g:4810:2: ( ruleAlignment )
            // InternalSlideOMatic.g:4811:3: ruleAlignment
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
    // InternalSlideOMatic.g:4820:1: rule__Image__SizeAssignment_5 : ( ruleSize ) ;
    public final void rule__Image__SizeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4824:1: ( ( ruleSize ) )
            // InternalSlideOMatic.g:4825:2: ( ruleSize )
            {
            // InternalSlideOMatic.g:4825:2: ( ruleSize )
            // InternalSlideOMatic.g:4826:3: ruleSize
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


    // $ANTLR start "rule__Size__WayAssignment_0_1"
    // InternalSlideOMatic.g:4835:1: rule__Size__WayAssignment_0_1 : ( ruleWay ) ;
    public final void rule__Size__WayAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4839:1: ( ( ruleWay ) )
            // InternalSlideOMatic.g:4840:2: ( ruleWay )
            {
            // InternalSlideOMatic.g:4840:2: ( ruleWay )
            // InternalSlideOMatic.g:4841:3: ruleWay
            {
             before(grammarAccess.getSizeAccess().getWayWayParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleWay();

            state._fsp--;

             after(grammarAccess.getSizeAccess().getWayWayParserRuleCall_0_1_0()); 

            }


            }

        }
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
    // InternalSlideOMatic.g:4850:1: rule__Size__ScaleAssignment_0_2 : ( RULE_INT ) ;
    public final void rule__Size__ScaleAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4854:1: ( ( RULE_INT ) )
            // InternalSlideOMatic.g:4855:2: ( RULE_INT )
            {
            // InternalSlideOMatic.g:4855:2: ( RULE_INT )
            // InternalSlideOMatic.g:4856:3: RULE_INT
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
    // InternalSlideOMatic.g:4865:1: rule__Size__SizeAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__Size__SizeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4869:1: ( ( RULE_INT ) )
            // InternalSlideOMatic.g:4870:2: ( RULE_INT )
            {
            // InternalSlideOMatic.g:4870:2: ( RULE_INT )
            // InternalSlideOMatic.g:4871:3: RULE_INT
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
    // InternalSlideOMatic.g:4880:1: rule__Size__UnitAssignment_1_2 : ( ( rule__Size__UnitAlternatives_1_2_0 ) ) ;
    public final void rule__Size__UnitAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4884:1: ( ( ( rule__Size__UnitAlternatives_1_2_0 ) ) )
            // InternalSlideOMatic.g:4885:2: ( ( rule__Size__UnitAlternatives_1_2_0 ) )
            {
            // InternalSlideOMatic.g:4885:2: ( ( rule__Size__UnitAlternatives_1_2_0 ) )
            // InternalSlideOMatic.g:4886:3: ( rule__Size__UnitAlternatives_1_2_0 )
            {
             before(grammarAccess.getSizeAccess().getUnitAlternatives_1_2_0()); 
            // InternalSlideOMatic.g:4887:3: ( rule__Size__UnitAlternatives_1_2_0 )
            // InternalSlideOMatic.g:4887:4: rule__Size__UnitAlternatives_1_2_0
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
    // InternalSlideOMatic.g:4895:1: rule__Table__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Table__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4899:1: ( ( RULE_ID ) )
            // InternalSlideOMatic.g:4900:2: ( RULE_ID )
            {
            // InternalSlideOMatic.g:4900:2: ( RULE_ID )
            // InternalSlideOMatic.g:4901:3: RULE_ID
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
    // InternalSlideOMatic.g:4910:1: rule__Table__RowsAssignment_3 : ( ruleTableRow ) ;
    public final void rule__Table__RowsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4914:1: ( ( ruleTableRow ) )
            // InternalSlideOMatic.g:4915:2: ( ruleTableRow )
            {
            // InternalSlideOMatic.g:4915:2: ( ruleTableRow )
            // InternalSlideOMatic.g:4916:3: ruleTableRow
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
    // InternalSlideOMatic.g:4925:1: rule__Table__RowsAssignment_4_1 : ( ruleTableRow ) ;
    public final void rule__Table__RowsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4929:1: ( ( ruleTableRow ) )
            // InternalSlideOMatic.g:4930:2: ( ruleTableRow )
            {
            // InternalSlideOMatic.g:4930:2: ( ruleTableRow )
            // InternalSlideOMatic.g:4931:3: ruleTableRow
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
    // InternalSlideOMatic.g:4940:1: rule__TableRow__ValuesAssignment_1 : ( RULE_STRING ) ;
    public final void rule__TableRow__ValuesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4944:1: ( ( RULE_STRING ) )
            // InternalSlideOMatic.g:4945:2: ( RULE_STRING )
            {
            // InternalSlideOMatic.g:4945:2: ( RULE_STRING )
            // InternalSlideOMatic.g:4946:3: RULE_STRING
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
    // InternalSlideOMatic.g:4955:1: rule__TableRow__ValuesAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__TableRow__ValuesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4959:1: ( ( RULE_STRING ) )
            // InternalSlideOMatic.g:4960:2: ( RULE_STRING )
            {
            // InternalSlideOMatic.g:4960:2: ( RULE_STRING )
            // InternalSlideOMatic.g:4961:3: RULE_STRING
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
    // InternalSlideOMatic.g:4970:1: rule__Code__LangAssignment_1 : ( RULE_ID ) ;
    public final void rule__Code__LangAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4974:1: ( ( RULE_ID ) )
            // InternalSlideOMatic.g:4975:2: ( RULE_ID )
            {
            // InternalSlideOMatic.g:4975:2: ( RULE_ID )
            // InternalSlideOMatic.g:4976:3: RULE_ID
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
    // InternalSlideOMatic.g:4985:1: rule__Code__CodeAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Code__CodeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4989:1: ( ( RULE_STRING ) )
            // InternalSlideOMatic.g:4990:2: ( RULE_STRING )
            {
            // InternalSlideOMatic.g:4990:2: ( RULE_STRING )
            // InternalSlideOMatic.g:4991:3: RULE_STRING
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
    // InternalSlideOMatic.g:5000:1: rule__Animation__TargetAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Animation__TargetAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5004:1: ( ( ( RULE_ID ) ) )
            // InternalSlideOMatic.g:5005:2: ( ( RULE_ID ) )
            {
            // InternalSlideOMatic.g:5005:2: ( ( RULE_ID ) )
            // InternalSlideOMatic.g:5006:3: ( RULE_ID )
            {
             before(grammarAccess.getAnimationAccess().getTargetImageCrossReference_1_0()); 
            // InternalSlideOMatic.g:5007:3: ( RULE_ID )
            // InternalSlideOMatic.g:5008:4: RULE_ID
            {
             before(grammarAccess.getAnimationAccess().getTargetImageIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAnimationAccess().getTargetImageIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getAnimationAccess().getTargetImageCrossReference_1_0()); 

            }


            }

        }
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
    // InternalSlideOMatic.g:5019:1: rule__Animation__TypeAssignment_2 : ( ruleAnimationType ) ;
    public final void rule__Animation__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5023:1: ( ( ruleAnimationType ) )
            // InternalSlideOMatic.g:5024:2: ( ruleAnimationType )
            {
            // InternalSlideOMatic.g:5024:2: ( ruleAnimationType )
            // InternalSlideOMatic.g:5025:3: ruleAnimationType
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
    // InternalSlideOMatic.g:5034:1: rule__Animation__LocationAssignment_4 : ( ruleAlignment ) ;
    public final void rule__Animation__LocationAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5038:1: ( ( ruleAlignment ) )
            // InternalSlideOMatic.g:5039:2: ( ruleAlignment )
            {
            // InternalSlideOMatic.g:5039:2: ( ruleAlignment )
            // InternalSlideOMatic.g:5040:3: ruleAlignment
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
    // InternalSlideOMatic.g:5049:1: rule__Animation__SizeAssignment_5 : ( ruleSize ) ;
    public final void rule__Animation__SizeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5053:1: ( ( ruleSize ) )
            // InternalSlideOMatic.g:5054:2: ( ruleSize )
            {
            // InternalSlideOMatic.g:5054:2: ( ruleSize )
            // InternalSlideOMatic.g:5055:3: ruleSize
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
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0300000000000000L,0x000000000000CC00L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000FFFFFFF000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00FFFF0000400000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000010L,0x0000000000010000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000010L,0x00000000000D0080L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000010L,0x0000000242F00000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000012L,0x0000000242F00000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000000L,0x00000000000D0000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000800L,0x0000000000000200L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000000L,0x0000000000C00000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0xFC00000000000040L,0x0000000030000007L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000000L,0x0000000030000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000038L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000000L,0x0000000100002000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000000L,0x0000003000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0xFC00000000000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});

}