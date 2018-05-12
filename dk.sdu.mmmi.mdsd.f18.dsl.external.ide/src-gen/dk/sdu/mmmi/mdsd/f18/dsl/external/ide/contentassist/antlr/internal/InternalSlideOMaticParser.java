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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'$$'", "'AnnArbor'", "'Antibes'", "'Bergen'", "'Berkeley'", "'Berlin'", "'Boadilla'", "'boxes'", "'CambridgeUS'", "'Copenhagen'", "'Darmstadt'", "'default'", "'Dresden'", "'Frankfurt'", "'Goettingen'", "'Hannover'", "'Ilmanau'", "'JuanLesPins'", "'Luebeck'", "'Madrid'", "'Malmoe'", "'Marburg'", "'Montpellier'", "'PaloAlto'", "'Pittsburgh'", "'Rochester'", "'Singapore'", "'Szeged'", "'Warsaw'", "'albatros'", "'beaver'", "'beetle'", "'crane'", "'dolphin'", "'dove'", "'fly'", "'lily'", "'orchid'", "'rose'", "'seagull'", "'seahorse'", "'sidebartab'", "'structure'", "'whale'", "'wolverine'", "'author'", "'authors'", "'topleft'", "'top'", "'topright'", "'left'", "'center'", "'right'", "'bottomleft'", "'bottom'", "'bottomright'", "'cm'", "'em'", "'mm'", "'presentation'", "'{'", "'}'", "'('", "')'", "'theme'", "'color'", "','", "'institute'", "'date'", "'*'", "'slide'", "'**'", "'***'", "'ToC'", "'block'", "'#list'", "'&list'", "'-'", "'img'", "'src'", "'%'", "'width'", "'height'", "'tab'", "'['", "']'", "'code'", "'end'", "'filecode'", "'show'", "':'", "'animate'", "'to'", "'move'", "'jump'", "'math'", "'+'", "'/'", "'^'", "'let'", "'='", "'in'", "'eval'"
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
    // InternalSlideOMatic.g:637:1: ruleCode : ( ( rule__Code__Alternatives ) ) ;
    public final void ruleCode() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:641:2: ( ( ( rule__Code__Alternatives ) ) )
            // InternalSlideOMatic.g:642:2: ( ( rule__Code__Alternatives ) )
            {
            // InternalSlideOMatic.g:642:2: ( ( rule__Code__Alternatives ) )
            // InternalSlideOMatic.g:643:3: ( rule__Code__Alternatives )
            {
             before(grammarAccess.getCodeAccess().getAlternatives()); 
            // InternalSlideOMatic.g:644:3: ( rule__Code__Alternatives )
            // InternalSlideOMatic.g:644:4: rule__Code__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Code__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCodeAccess().getAlternatives()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleLineSequence"
    // InternalSlideOMatic.g:653:1: entryRuleLineSequence : ruleLineSequence EOF ;
    public final void entryRuleLineSequence() throws RecognitionException {
        try {
            // InternalSlideOMatic.g:654:1: ( ruleLineSequence EOF )
            // InternalSlideOMatic.g:655:1: ruleLineSequence EOF
            {
             before(grammarAccess.getLineSequenceRule()); 
            pushFollow(FOLLOW_1);
            ruleLineSequence();

            state._fsp--;

             after(grammarAccess.getLineSequenceRule()); 
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
    // $ANTLR end "entryRuleLineSequence"


    // $ANTLR start "ruleLineSequence"
    // InternalSlideOMatic.g:662:1: ruleLineSequence : ( ( rule__LineSequence__Group__0 ) ) ;
    public final void ruleLineSequence() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:666:2: ( ( ( rule__LineSequence__Group__0 ) ) )
            // InternalSlideOMatic.g:667:2: ( ( rule__LineSequence__Group__0 ) )
            {
            // InternalSlideOMatic.g:667:2: ( ( rule__LineSequence__Group__0 ) )
            // InternalSlideOMatic.g:668:3: ( rule__LineSequence__Group__0 )
            {
             before(grammarAccess.getLineSequenceAccess().getGroup()); 
            // InternalSlideOMatic.g:669:3: ( rule__LineSequence__Group__0 )
            // InternalSlideOMatic.g:669:4: rule__LineSequence__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LineSequence__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLineSequenceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLineSequence"


    // $ANTLR start "entryRuleClick"
    // InternalSlideOMatic.g:678:1: entryRuleClick : ruleClick EOF ;
    public final void entryRuleClick() throws RecognitionException {
        try {
            // InternalSlideOMatic.g:679:1: ( ruleClick EOF )
            // InternalSlideOMatic.g:680:1: ruleClick EOF
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
    // InternalSlideOMatic.g:687:1: ruleClick : ( '$$' ) ;
    public final void ruleClick() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:691:2: ( ( '$$' ) )
            // InternalSlideOMatic.g:692:2: ( '$$' )
            {
            // InternalSlideOMatic.g:692:2: ( '$$' )
            // InternalSlideOMatic.g:693:3: '$$'
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
    // InternalSlideOMatic.g:703:1: entryRuleAnimation : ruleAnimation EOF ;
    public final void entryRuleAnimation() throws RecognitionException {
        try {
            // InternalSlideOMatic.g:704:1: ( ruleAnimation EOF )
            // InternalSlideOMatic.g:705:1: ruleAnimation EOF
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
    // InternalSlideOMatic.g:712:1: ruleAnimation : ( ( rule__Animation__Group__0 ) ) ;
    public final void ruleAnimation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:716:2: ( ( ( rule__Animation__Group__0 ) ) )
            // InternalSlideOMatic.g:717:2: ( ( rule__Animation__Group__0 ) )
            {
            // InternalSlideOMatic.g:717:2: ( ( rule__Animation__Group__0 ) )
            // InternalSlideOMatic.g:718:3: ( rule__Animation__Group__0 )
            {
             before(grammarAccess.getAnimationAccess().getGroup()); 
            // InternalSlideOMatic.g:719:3: ( rule__Animation__Group__0 )
            // InternalSlideOMatic.g:719:4: rule__Animation__Group__0
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
    // InternalSlideOMatic.g:728:1: entryRuleAnimationType : ruleAnimationType EOF ;
    public final void entryRuleAnimationType() throws RecognitionException {
        try {
            // InternalSlideOMatic.g:729:1: ( ruleAnimationType EOF )
            // InternalSlideOMatic.g:730:1: ruleAnimationType EOF
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
    // InternalSlideOMatic.g:737:1: ruleAnimationType : ( ( rule__AnimationType__Alternatives ) ) ;
    public final void ruleAnimationType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:741:2: ( ( ( rule__AnimationType__Alternatives ) ) )
            // InternalSlideOMatic.g:742:2: ( ( rule__AnimationType__Alternatives ) )
            {
            // InternalSlideOMatic.g:742:2: ( ( rule__AnimationType__Alternatives ) )
            // InternalSlideOMatic.g:743:3: ( rule__AnimationType__Alternatives )
            {
             before(grammarAccess.getAnimationTypeAccess().getAlternatives()); 
            // InternalSlideOMatic.g:744:3: ( rule__AnimationType__Alternatives )
            // InternalSlideOMatic.g:744:4: rule__AnimationType__Alternatives
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


    // $ANTLR start "entryRuleMathExp"
    // InternalSlideOMatic.g:753:1: entryRuleMathExp : ruleMathExp EOF ;
    public final void entryRuleMathExp() throws RecognitionException {
        try {
            // InternalSlideOMatic.g:754:1: ( ruleMathExp EOF )
            // InternalSlideOMatic.g:755:1: ruleMathExp EOF
            {
             before(grammarAccess.getMathExpRule()); 
            pushFollow(FOLLOW_1);
            ruleMathExp();

            state._fsp--;

             after(grammarAccess.getMathExpRule()); 
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
    // $ANTLR end "entryRuleMathExp"


    // $ANTLR start "ruleMathExp"
    // InternalSlideOMatic.g:762:1: ruleMathExp : ( ( rule__MathExp__Group__0 ) ) ;
    public final void ruleMathExp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:766:2: ( ( ( rule__MathExp__Group__0 ) ) )
            // InternalSlideOMatic.g:767:2: ( ( rule__MathExp__Group__0 ) )
            {
            // InternalSlideOMatic.g:767:2: ( ( rule__MathExp__Group__0 ) )
            // InternalSlideOMatic.g:768:3: ( rule__MathExp__Group__0 )
            {
             before(grammarAccess.getMathExpAccess().getGroup()); 
            // InternalSlideOMatic.g:769:3: ( rule__MathExp__Group__0 )
            // InternalSlideOMatic.g:769:4: rule__MathExp__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MathExp__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMathExpAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMathExp"


    // $ANTLR start "entryRuleExp"
    // InternalSlideOMatic.g:778:1: entryRuleExp : ruleExp EOF ;
    public final void entryRuleExp() throws RecognitionException {
        try {
            // InternalSlideOMatic.g:779:1: ( ruleExp EOF )
            // InternalSlideOMatic.g:780:1: ruleExp EOF
            {
             before(grammarAccess.getExpRule()); 
            pushFollow(FOLLOW_1);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getExpRule()); 
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
    // $ANTLR end "entryRuleExp"


    // $ANTLR start "ruleExp"
    // InternalSlideOMatic.g:787:1: ruleExp : ( ( rule__Exp__Group__0 ) ) ;
    public final void ruleExp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:791:2: ( ( ( rule__Exp__Group__0 ) ) )
            // InternalSlideOMatic.g:792:2: ( ( rule__Exp__Group__0 ) )
            {
            // InternalSlideOMatic.g:792:2: ( ( rule__Exp__Group__0 ) )
            // InternalSlideOMatic.g:793:3: ( rule__Exp__Group__0 )
            {
             before(grammarAccess.getExpAccess().getGroup()); 
            // InternalSlideOMatic.g:794:3: ( rule__Exp__Group__0 )
            // InternalSlideOMatic.g:794:4: rule__Exp__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Exp__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExp"


    // $ANTLR start "entryRuleFactor"
    // InternalSlideOMatic.g:803:1: entryRuleFactor : ruleFactor EOF ;
    public final void entryRuleFactor() throws RecognitionException {
        try {
            // InternalSlideOMatic.g:804:1: ( ruleFactor EOF )
            // InternalSlideOMatic.g:805:1: ruleFactor EOF
            {
             before(grammarAccess.getFactorRule()); 
            pushFollow(FOLLOW_1);
            ruleFactor();

            state._fsp--;

             after(grammarAccess.getFactorRule()); 
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
    // $ANTLR end "entryRuleFactor"


    // $ANTLR start "ruleFactor"
    // InternalSlideOMatic.g:812:1: ruleFactor : ( ( rule__Factor__Group__0 ) ) ;
    public final void ruleFactor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:816:2: ( ( ( rule__Factor__Group__0 ) ) )
            // InternalSlideOMatic.g:817:2: ( ( rule__Factor__Group__0 ) )
            {
            // InternalSlideOMatic.g:817:2: ( ( rule__Factor__Group__0 ) )
            // InternalSlideOMatic.g:818:3: ( rule__Factor__Group__0 )
            {
             before(grammarAccess.getFactorAccess().getGroup()); 
            // InternalSlideOMatic.g:819:3: ( rule__Factor__Group__0 )
            // InternalSlideOMatic.g:819:4: rule__Factor__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Factor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFactorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFactor"


    // $ANTLR start "entryRulePow"
    // InternalSlideOMatic.g:828:1: entryRulePow : rulePow EOF ;
    public final void entryRulePow() throws RecognitionException {
        try {
            // InternalSlideOMatic.g:829:1: ( rulePow EOF )
            // InternalSlideOMatic.g:830:1: rulePow EOF
            {
             before(grammarAccess.getPowRule()); 
            pushFollow(FOLLOW_1);
            rulePow();

            state._fsp--;

             after(grammarAccess.getPowRule()); 
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
    // $ANTLR end "entryRulePow"


    // $ANTLR start "rulePow"
    // InternalSlideOMatic.g:837:1: rulePow : ( ( rule__Pow__Group__0 ) ) ;
    public final void rulePow() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:841:2: ( ( ( rule__Pow__Group__0 ) ) )
            // InternalSlideOMatic.g:842:2: ( ( rule__Pow__Group__0 ) )
            {
            // InternalSlideOMatic.g:842:2: ( ( rule__Pow__Group__0 ) )
            // InternalSlideOMatic.g:843:3: ( rule__Pow__Group__0 )
            {
             before(grammarAccess.getPowAccess().getGroup()); 
            // InternalSlideOMatic.g:844:3: ( rule__Pow__Group__0 )
            // InternalSlideOMatic.g:844:4: rule__Pow__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Pow__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPowAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePow"


    // $ANTLR start "entryRulePrimary"
    // InternalSlideOMatic.g:853:1: entryRulePrimary : rulePrimary EOF ;
    public final void entryRulePrimary() throws RecognitionException {
        try {
            // InternalSlideOMatic.g:854:1: ( rulePrimary EOF )
            // InternalSlideOMatic.g:855:1: rulePrimary EOF
            {
             before(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_1);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getPrimaryRule()); 
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
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalSlideOMatic.g:862:1: rulePrimary : ( ( rule__Primary__Alternatives ) ) ;
    public final void rulePrimary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:866:2: ( ( ( rule__Primary__Alternatives ) ) )
            // InternalSlideOMatic.g:867:2: ( ( rule__Primary__Alternatives ) )
            {
            // InternalSlideOMatic.g:867:2: ( ( rule__Primary__Alternatives ) )
            // InternalSlideOMatic.g:868:3: ( rule__Primary__Alternatives )
            {
             before(grammarAccess.getPrimaryAccess().getAlternatives()); 
            // InternalSlideOMatic.g:869:3: ( rule__Primary__Alternatives )
            // InternalSlideOMatic.g:869:4: rule__Primary__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleVariableUse"
    // InternalSlideOMatic.g:878:1: entryRuleVariableUse : ruleVariableUse EOF ;
    public final void entryRuleVariableUse() throws RecognitionException {
        try {
            // InternalSlideOMatic.g:879:1: ( ruleVariableUse EOF )
            // InternalSlideOMatic.g:880:1: ruleVariableUse EOF
            {
             before(grammarAccess.getVariableUseRule()); 
            pushFollow(FOLLOW_1);
            ruleVariableUse();

            state._fsp--;

             after(grammarAccess.getVariableUseRule()); 
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
    // $ANTLR end "entryRuleVariableUse"


    // $ANTLR start "ruleVariableUse"
    // InternalSlideOMatic.g:887:1: ruleVariableUse : ( ( rule__VariableUse__Group__0 ) ) ;
    public final void ruleVariableUse() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:891:2: ( ( ( rule__VariableUse__Group__0 ) ) )
            // InternalSlideOMatic.g:892:2: ( ( rule__VariableUse__Group__0 ) )
            {
            // InternalSlideOMatic.g:892:2: ( ( rule__VariableUse__Group__0 ) )
            // InternalSlideOMatic.g:893:3: ( rule__VariableUse__Group__0 )
            {
             before(grammarAccess.getVariableUseAccess().getGroup()); 
            // InternalSlideOMatic.g:894:3: ( rule__VariableUse__Group__0 )
            // InternalSlideOMatic.g:894:4: rule__VariableUse__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VariableUse__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariableUseAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariableUse"


    // $ANTLR start "entryRuleVariableBinding"
    // InternalSlideOMatic.g:903:1: entryRuleVariableBinding : ruleVariableBinding EOF ;
    public final void entryRuleVariableBinding() throws RecognitionException {
        try {
            // InternalSlideOMatic.g:904:1: ( ruleVariableBinding EOF )
            // InternalSlideOMatic.g:905:1: ruleVariableBinding EOF
            {
             before(grammarAccess.getVariableBindingRule()); 
            pushFollow(FOLLOW_1);
            ruleVariableBinding();

            state._fsp--;

             after(grammarAccess.getVariableBindingRule()); 
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
    // $ANTLR end "entryRuleVariableBinding"


    // $ANTLR start "ruleVariableBinding"
    // InternalSlideOMatic.g:912:1: ruleVariableBinding : ( ( rule__VariableBinding__Group__0 ) ) ;
    public final void ruleVariableBinding() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:916:2: ( ( ( rule__VariableBinding__Group__0 ) ) )
            // InternalSlideOMatic.g:917:2: ( ( rule__VariableBinding__Group__0 ) )
            {
            // InternalSlideOMatic.g:917:2: ( ( rule__VariableBinding__Group__0 ) )
            // InternalSlideOMatic.g:918:3: ( rule__VariableBinding__Group__0 )
            {
             before(grammarAccess.getVariableBindingAccess().getGroup()); 
            // InternalSlideOMatic.g:919:3: ( rule__VariableBinding__Group__0 )
            // InternalSlideOMatic.g:919:4: rule__VariableBinding__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VariableBinding__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariableBindingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariableBinding"


    // $ANTLR start "entryRuleParenthesis"
    // InternalSlideOMatic.g:928:1: entryRuleParenthesis : ruleParenthesis EOF ;
    public final void entryRuleParenthesis() throws RecognitionException {
        try {
            // InternalSlideOMatic.g:929:1: ( ruleParenthesis EOF )
            // InternalSlideOMatic.g:930:1: ruleParenthesis EOF
            {
             before(grammarAccess.getParenthesisRule()); 
            pushFollow(FOLLOW_1);
            ruleParenthesis();

            state._fsp--;

             after(grammarAccess.getParenthesisRule()); 
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
    // $ANTLR end "entryRuleParenthesis"


    // $ANTLR start "ruleParenthesis"
    // InternalSlideOMatic.g:937:1: ruleParenthesis : ( ( rule__Parenthesis__Group__0 ) ) ;
    public final void ruleParenthesis() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:941:2: ( ( ( rule__Parenthesis__Group__0 ) ) )
            // InternalSlideOMatic.g:942:2: ( ( rule__Parenthesis__Group__0 ) )
            {
            // InternalSlideOMatic.g:942:2: ( ( rule__Parenthesis__Group__0 ) )
            // InternalSlideOMatic.g:943:3: ( rule__Parenthesis__Group__0 )
            {
             before(grammarAccess.getParenthesisAccess().getGroup()); 
            // InternalSlideOMatic.g:944:3: ( rule__Parenthesis__Group__0 )
            // InternalSlideOMatic.g:944:4: rule__Parenthesis__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Parenthesis__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParenthesisAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParenthesis"


    // $ANTLR start "entryRuleNumber"
    // InternalSlideOMatic.g:953:1: entryRuleNumber : ruleNumber EOF ;
    public final void entryRuleNumber() throws RecognitionException {
        try {
            // InternalSlideOMatic.g:954:1: ( ruleNumber EOF )
            // InternalSlideOMatic.g:955:1: ruleNumber EOF
            {
             before(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_1);
            ruleNumber();

            state._fsp--;

             after(grammarAccess.getNumberRule()); 
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
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // InternalSlideOMatic.g:962:1: ruleNumber : ( ( rule__Number__Group__0 ) ) ;
    public final void ruleNumber() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:966:2: ( ( ( rule__Number__Group__0 ) ) )
            // InternalSlideOMatic.g:967:2: ( ( rule__Number__Group__0 ) )
            {
            // InternalSlideOMatic.g:967:2: ( ( rule__Number__Group__0 ) )
            // InternalSlideOMatic.g:968:3: ( rule__Number__Group__0 )
            {
             before(grammarAccess.getNumberAccess().getGroup()); 
            // InternalSlideOMatic.g:969:3: ( rule__Number__Group__0 )
            // InternalSlideOMatic.g:969:4: rule__Number__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Number__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNumberAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNumber"


    // $ANTLR start "rule__Presentation__Alternatives_5"
    // InternalSlideOMatic.g:977:1: rule__Presentation__Alternatives_5 : ( ( ( rule__Presentation__SlidesAssignment_5_0 ) ) | ( ( rule__Presentation__AnimationsAssignment_5_1 ) ) );
    public final void rule__Presentation__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:981:1: ( ( ( rule__Presentation__SlidesAssignment_5_0 ) ) | ( ( rule__Presentation__AnimationsAssignment_5_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==81) ) {
                alt1=1;
            }
            else if ( (LA1_0==102) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalSlideOMatic.g:982:2: ( ( rule__Presentation__SlidesAssignment_5_0 ) )
                    {
                    // InternalSlideOMatic.g:982:2: ( ( rule__Presentation__SlidesAssignment_5_0 ) )
                    // InternalSlideOMatic.g:983:3: ( rule__Presentation__SlidesAssignment_5_0 )
                    {
                     before(grammarAccess.getPresentationAccess().getSlidesAssignment_5_0()); 
                    // InternalSlideOMatic.g:984:3: ( rule__Presentation__SlidesAssignment_5_0 )
                    // InternalSlideOMatic.g:984:4: rule__Presentation__SlidesAssignment_5_0
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
                    // InternalSlideOMatic.g:988:2: ( ( rule__Presentation__AnimationsAssignment_5_1 ) )
                    {
                    // InternalSlideOMatic.g:988:2: ( ( rule__Presentation__AnimationsAssignment_5_1 ) )
                    // InternalSlideOMatic.g:989:3: ( rule__Presentation__AnimationsAssignment_5_1 )
                    {
                     before(grammarAccess.getPresentationAccess().getAnimationsAssignment_5_1()); 
                    // InternalSlideOMatic.g:990:3: ( rule__Presentation__AnimationsAssignment_5_1 )
                    // InternalSlideOMatic.g:990:4: rule__Presentation__AnimationsAssignment_5_1
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
    // InternalSlideOMatic.g:998:1: rule__BeamerTheme__Alternatives : ( ( 'AnnArbor' ) | ( 'Antibes' ) | ( 'Bergen' ) | ( 'Berkeley' ) | ( 'Berlin' ) | ( 'Boadilla' ) | ( 'boxes' ) | ( 'CambridgeUS' ) | ( 'Copenhagen' ) | ( 'Darmstadt' ) | ( 'default' ) | ( 'Dresden' ) | ( 'Frankfurt' ) | ( 'Goettingen' ) | ( 'Hannover' ) | ( 'Ilmanau' ) | ( 'JuanLesPins' ) | ( 'Luebeck' ) | ( 'Madrid' ) | ( 'Malmoe' ) | ( 'Marburg' ) | ( 'Montpellier' ) | ( 'PaloAlto' ) | ( 'Pittsburgh' ) | ( 'Rochester' ) | ( 'Singapore' ) | ( 'Szeged' ) | ( 'Warsaw' ) );
    public final void rule__BeamerTheme__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1002:1: ( ( 'AnnArbor' ) | ( 'Antibes' ) | ( 'Bergen' ) | ( 'Berkeley' ) | ( 'Berlin' ) | ( 'Boadilla' ) | ( 'boxes' ) | ( 'CambridgeUS' ) | ( 'Copenhagen' ) | ( 'Darmstadt' ) | ( 'default' ) | ( 'Dresden' ) | ( 'Frankfurt' ) | ( 'Goettingen' ) | ( 'Hannover' ) | ( 'Ilmanau' ) | ( 'JuanLesPins' ) | ( 'Luebeck' ) | ( 'Madrid' ) | ( 'Malmoe' ) | ( 'Marburg' ) | ( 'Montpellier' ) | ( 'PaloAlto' ) | ( 'Pittsburgh' ) | ( 'Rochester' ) | ( 'Singapore' ) | ( 'Szeged' ) | ( 'Warsaw' ) )
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
                    // InternalSlideOMatic.g:1003:2: ( 'AnnArbor' )
                    {
                    // InternalSlideOMatic.g:1003:2: ( 'AnnArbor' )
                    // InternalSlideOMatic.g:1004:3: 'AnnArbor'
                    {
                     before(grammarAccess.getBeamerThemeAccess().getAnnArborKeyword_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getBeamerThemeAccess().getAnnArborKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSlideOMatic.g:1009:2: ( 'Antibes' )
                    {
                    // InternalSlideOMatic.g:1009:2: ( 'Antibes' )
                    // InternalSlideOMatic.g:1010:3: 'Antibes'
                    {
                     before(grammarAccess.getBeamerThemeAccess().getAntibesKeyword_1()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getBeamerThemeAccess().getAntibesKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSlideOMatic.g:1015:2: ( 'Bergen' )
                    {
                    // InternalSlideOMatic.g:1015:2: ( 'Bergen' )
                    // InternalSlideOMatic.g:1016:3: 'Bergen'
                    {
                     before(grammarAccess.getBeamerThemeAccess().getBergenKeyword_2()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getBeamerThemeAccess().getBergenKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSlideOMatic.g:1021:2: ( 'Berkeley' )
                    {
                    // InternalSlideOMatic.g:1021:2: ( 'Berkeley' )
                    // InternalSlideOMatic.g:1022:3: 'Berkeley'
                    {
                     before(grammarAccess.getBeamerThemeAccess().getBerkeleyKeyword_3()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getBeamerThemeAccess().getBerkeleyKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSlideOMatic.g:1027:2: ( 'Berlin' )
                    {
                    // InternalSlideOMatic.g:1027:2: ( 'Berlin' )
                    // InternalSlideOMatic.g:1028:3: 'Berlin'
                    {
                     before(grammarAccess.getBeamerThemeAccess().getBerlinKeyword_4()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getBeamerThemeAccess().getBerlinKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalSlideOMatic.g:1033:2: ( 'Boadilla' )
                    {
                    // InternalSlideOMatic.g:1033:2: ( 'Boadilla' )
                    // InternalSlideOMatic.g:1034:3: 'Boadilla'
                    {
                     before(grammarAccess.getBeamerThemeAccess().getBoadillaKeyword_5()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getBeamerThemeAccess().getBoadillaKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalSlideOMatic.g:1039:2: ( 'boxes' )
                    {
                    // InternalSlideOMatic.g:1039:2: ( 'boxes' )
                    // InternalSlideOMatic.g:1040:3: 'boxes'
                    {
                     before(grammarAccess.getBeamerThemeAccess().getBoxesKeyword_6()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getBeamerThemeAccess().getBoxesKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalSlideOMatic.g:1045:2: ( 'CambridgeUS' )
                    {
                    // InternalSlideOMatic.g:1045:2: ( 'CambridgeUS' )
                    // InternalSlideOMatic.g:1046:3: 'CambridgeUS'
                    {
                     before(grammarAccess.getBeamerThemeAccess().getCambridgeUSKeyword_7()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getBeamerThemeAccess().getCambridgeUSKeyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalSlideOMatic.g:1051:2: ( 'Copenhagen' )
                    {
                    // InternalSlideOMatic.g:1051:2: ( 'Copenhagen' )
                    // InternalSlideOMatic.g:1052:3: 'Copenhagen'
                    {
                     before(grammarAccess.getBeamerThemeAccess().getCopenhagenKeyword_8()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getBeamerThemeAccess().getCopenhagenKeyword_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalSlideOMatic.g:1057:2: ( 'Darmstadt' )
                    {
                    // InternalSlideOMatic.g:1057:2: ( 'Darmstadt' )
                    // InternalSlideOMatic.g:1058:3: 'Darmstadt'
                    {
                     before(grammarAccess.getBeamerThemeAccess().getDarmstadtKeyword_9()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getBeamerThemeAccess().getDarmstadtKeyword_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalSlideOMatic.g:1063:2: ( 'default' )
                    {
                    // InternalSlideOMatic.g:1063:2: ( 'default' )
                    // InternalSlideOMatic.g:1064:3: 'default'
                    {
                     before(grammarAccess.getBeamerThemeAccess().getDefaultKeyword_10()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getBeamerThemeAccess().getDefaultKeyword_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalSlideOMatic.g:1069:2: ( 'Dresden' )
                    {
                    // InternalSlideOMatic.g:1069:2: ( 'Dresden' )
                    // InternalSlideOMatic.g:1070:3: 'Dresden'
                    {
                     before(grammarAccess.getBeamerThemeAccess().getDresdenKeyword_11()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getBeamerThemeAccess().getDresdenKeyword_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalSlideOMatic.g:1075:2: ( 'Frankfurt' )
                    {
                    // InternalSlideOMatic.g:1075:2: ( 'Frankfurt' )
                    // InternalSlideOMatic.g:1076:3: 'Frankfurt'
                    {
                     before(grammarAccess.getBeamerThemeAccess().getFrankfurtKeyword_12()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getBeamerThemeAccess().getFrankfurtKeyword_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalSlideOMatic.g:1081:2: ( 'Goettingen' )
                    {
                    // InternalSlideOMatic.g:1081:2: ( 'Goettingen' )
                    // InternalSlideOMatic.g:1082:3: 'Goettingen'
                    {
                     before(grammarAccess.getBeamerThemeAccess().getGoettingenKeyword_13()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getBeamerThemeAccess().getGoettingenKeyword_13()); 

                    }


                    }
                    break;
                case 15 :
                    // InternalSlideOMatic.g:1087:2: ( 'Hannover' )
                    {
                    // InternalSlideOMatic.g:1087:2: ( 'Hannover' )
                    // InternalSlideOMatic.g:1088:3: 'Hannover'
                    {
                     before(grammarAccess.getBeamerThemeAccess().getHannoverKeyword_14()); 
                    match(input,26,FOLLOW_2); 
                     after(grammarAccess.getBeamerThemeAccess().getHannoverKeyword_14()); 

                    }


                    }
                    break;
                case 16 :
                    // InternalSlideOMatic.g:1093:2: ( 'Ilmanau' )
                    {
                    // InternalSlideOMatic.g:1093:2: ( 'Ilmanau' )
                    // InternalSlideOMatic.g:1094:3: 'Ilmanau'
                    {
                     before(grammarAccess.getBeamerThemeAccess().getIlmanauKeyword_15()); 
                    match(input,27,FOLLOW_2); 
                     after(grammarAccess.getBeamerThemeAccess().getIlmanauKeyword_15()); 

                    }


                    }
                    break;
                case 17 :
                    // InternalSlideOMatic.g:1099:2: ( 'JuanLesPins' )
                    {
                    // InternalSlideOMatic.g:1099:2: ( 'JuanLesPins' )
                    // InternalSlideOMatic.g:1100:3: 'JuanLesPins'
                    {
                     before(grammarAccess.getBeamerThemeAccess().getJuanLesPinsKeyword_16()); 
                    match(input,28,FOLLOW_2); 
                     after(grammarAccess.getBeamerThemeAccess().getJuanLesPinsKeyword_16()); 

                    }


                    }
                    break;
                case 18 :
                    // InternalSlideOMatic.g:1105:2: ( 'Luebeck' )
                    {
                    // InternalSlideOMatic.g:1105:2: ( 'Luebeck' )
                    // InternalSlideOMatic.g:1106:3: 'Luebeck'
                    {
                     before(grammarAccess.getBeamerThemeAccess().getLuebeckKeyword_17()); 
                    match(input,29,FOLLOW_2); 
                     after(grammarAccess.getBeamerThemeAccess().getLuebeckKeyword_17()); 

                    }


                    }
                    break;
                case 19 :
                    // InternalSlideOMatic.g:1111:2: ( 'Madrid' )
                    {
                    // InternalSlideOMatic.g:1111:2: ( 'Madrid' )
                    // InternalSlideOMatic.g:1112:3: 'Madrid'
                    {
                     before(grammarAccess.getBeamerThemeAccess().getMadridKeyword_18()); 
                    match(input,30,FOLLOW_2); 
                     after(grammarAccess.getBeamerThemeAccess().getMadridKeyword_18()); 

                    }


                    }
                    break;
                case 20 :
                    // InternalSlideOMatic.g:1117:2: ( 'Malmoe' )
                    {
                    // InternalSlideOMatic.g:1117:2: ( 'Malmoe' )
                    // InternalSlideOMatic.g:1118:3: 'Malmoe'
                    {
                     before(grammarAccess.getBeamerThemeAccess().getMalmoeKeyword_19()); 
                    match(input,31,FOLLOW_2); 
                     after(grammarAccess.getBeamerThemeAccess().getMalmoeKeyword_19()); 

                    }


                    }
                    break;
                case 21 :
                    // InternalSlideOMatic.g:1123:2: ( 'Marburg' )
                    {
                    // InternalSlideOMatic.g:1123:2: ( 'Marburg' )
                    // InternalSlideOMatic.g:1124:3: 'Marburg'
                    {
                     before(grammarAccess.getBeamerThemeAccess().getMarburgKeyword_20()); 
                    match(input,32,FOLLOW_2); 
                     after(grammarAccess.getBeamerThemeAccess().getMarburgKeyword_20()); 

                    }


                    }
                    break;
                case 22 :
                    // InternalSlideOMatic.g:1129:2: ( 'Montpellier' )
                    {
                    // InternalSlideOMatic.g:1129:2: ( 'Montpellier' )
                    // InternalSlideOMatic.g:1130:3: 'Montpellier'
                    {
                     before(grammarAccess.getBeamerThemeAccess().getMontpellierKeyword_21()); 
                    match(input,33,FOLLOW_2); 
                     after(grammarAccess.getBeamerThemeAccess().getMontpellierKeyword_21()); 

                    }


                    }
                    break;
                case 23 :
                    // InternalSlideOMatic.g:1135:2: ( 'PaloAlto' )
                    {
                    // InternalSlideOMatic.g:1135:2: ( 'PaloAlto' )
                    // InternalSlideOMatic.g:1136:3: 'PaloAlto'
                    {
                     before(grammarAccess.getBeamerThemeAccess().getPaloAltoKeyword_22()); 
                    match(input,34,FOLLOW_2); 
                     after(grammarAccess.getBeamerThemeAccess().getPaloAltoKeyword_22()); 

                    }


                    }
                    break;
                case 24 :
                    // InternalSlideOMatic.g:1141:2: ( 'Pittsburgh' )
                    {
                    // InternalSlideOMatic.g:1141:2: ( 'Pittsburgh' )
                    // InternalSlideOMatic.g:1142:3: 'Pittsburgh'
                    {
                     before(grammarAccess.getBeamerThemeAccess().getPittsburghKeyword_23()); 
                    match(input,35,FOLLOW_2); 
                     after(grammarAccess.getBeamerThemeAccess().getPittsburghKeyword_23()); 

                    }


                    }
                    break;
                case 25 :
                    // InternalSlideOMatic.g:1147:2: ( 'Rochester' )
                    {
                    // InternalSlideOMatic.g:1147:2: ( 'Rochester' )
                    // InternalSlideOMatic.g:1148:3: 'Rochester'
                    {
                     before(grammarAccess.getBeamerThemeAccess().getRochesterKeyword_24()); 
                    match(input,36,FOLLOW_2); 
                     after(grammarAccess.getBeamerThemeAccess().getRochesterKeyword_24()); 

                    }


                    }
                    break;
                case 26 :
                    // InternalSlideOMatic.g:1153:2: ( 'Singapore' )
                    {
                    // InternalSlideOMatic.g:1153:2: ( 'Singapore' )
                    // InternalSlideOMatic.g:1154:3: 'Singapore'
                    {
                     before(grammarAccess.getBeamerThemeAccess().getSingaporeKeyword_25()); 
                    match(input,37,FOLLOW_2); 
                     after(grammarAccess.getBeamerThemeAccess().getSingaporeKeyword_25()); 

                    }


                    }
                    break;
                case 27 :
                    // InternalSlideOMatic.g:1159:2: ( 'Szeged' )
                    {
                    // InternalSlideOMatic.g:1159:2: ( 'Szeged' )
                    // InternalSlideOMatic.g:1160:3: 'Szeged'
                    {
                     before(grammarAccess.getBeamerThemeAccess().getSzegedKeyword_26()); 
                    match(input,38,FOLLOW_2); 
                     after(grammarAccess.getBeamerThemeAccess().getSzegedKeyword_26()); 

                    }


                    }
                    break;
                case 28 :
                    // InternalSlideOMatic.g:1165:2: ( 'Warsaw' )
                    {
                    // InternalSlideOMatic.g:1165:2: ( 'Warsaw' )
                    // InternalSlideOMatic.g:1166:3: 'Warsaw'
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
    // InternalSlideOMatic.g:1175:1: rule__ThemeColor__Alternatives : ( ( 'albatros' ) | ( 'beaver' ) | ( 'beetle' ) | ( 'crane' ) | ( 'default' ) | ( 'dolphin' ) | ( 'dove' ) | ( 'fly' ) | ( 'lily' ) | ( 'orchid' ) | ( 'rose' ) | ( 'seagull' ) | ( 'seahorse' ) | ( 'sidebartab' ) | ( 'structure' ) | ( 'whale' ) | ( 'wolverine' ) );
    public final void rule__ThemeColor__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1179:1: ( ( 'albatros' ) | ( 'beaver' ) | ( 'beetle' ) | ( 'crane' ) | ( 'default' ) | ( 'dolphin' ) | ( 'dove' ) | ( 'fly' ) | ( 'lily' ) | ( 'orchid' ) | ( 'rose' ) | ( 'seagull' ) | ( 'seahorse' ) | ( 'sidebartab' ) | ( 'structure' ) | ( 'whale' ) | ( 'wolverine' ) )
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
                    // InternalSlideOMatic.g:1180:2: ( 'albatros' )
                    {
                    // InternalSlideOMatic.g:1180:2: ( 'albatros' )
                    // InternalSlideOMatic.g:1181:3: 'albatros'
                    {
                     before(grammarAccess.getThemeColorAccess().getAlbatrosKeyword_0()); 
                    match(input,40,FOLLOW_2); 
                     after(grammarAccess.getThemeColorAccess().getAlbatrosKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSlideOMatic.g:1186:2: ( 'beaver' )
                    {
                    // InternalSlideOMatic.g:1186:2: ( 'beaver' )
                    // InternalSlideOMatic.g:1187:3: 'beaver'
                    {
                     before(grammarAccess.getThemeColorAccess().getBeaverKeyword_1()); 
                    match(input,41,FOLLOW_2); 
                     after(grammarAccess.getThemeColorAccess().getBeaverKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSlideOMatic.g:1192:2: ( 'beetle' )
                    {
                    // InternalSlideOMatic.g:1192:2: ( 'beetle' )
                    // InternalSlideOMatic.g:1193:3: 'beetle'
                    {
                     before(grammarAccess.getThemeColorAccess().getBeetleKeyword_2()); 
                    match(input,42,FOLLOW_2); 
                     after(grammarAccess.getThemeColorAccess().getBeetleKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSlideOMatic.g:1198:2: ( 'crane' )
                    {
                    // InternalSlideOMatic.g:1198:2: ( 'crane' )
                    // InternalSlideOMatic.g:1199:3: 'crane'
                    {
                     before(grammarAccess.getThemeColorAccess().getCraneKeyword_3()); 
                    match(input,43,FOLLOW_2); 
                     after(grammarAccess.getThemeColorAccess().getCraneKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSlideOMatic.g:1204:2: ( 'default' )
                    {
                    // InternalSlideOMatic.g:1204:2: ( 'default' )
                    // InternalSlideOMatic.g:1205:3: 'default'
                    {
                     before(grammarAccess.getThemeColorAccess().getDefaultKeyword_4()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getThemeColorAccess().getDefaultKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalSlideOMatic.g:1210:2: ( 'dolphin' )
                    {
                    // InternalSlideOMatic.g:1210:2: ( 'dolphin' )
                    // InternalSlideOMatic.g:1211:3: 'dolphin'
                    {
                     before(grammarAccess.getThemeColorAccess().getDolphinKeyword_5()); 
                    match(input,44,FOLLOW_2); 
                     after(grammarAccess.getThemeColorAccess().getDolphinKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalSlideOMatic.g:1216:2: ( 'dove' )
                    {
                    // InternalSlideOMatic.g:1216:2: ( 'dove' )
                    // InternalSlideOMatic.g:1217:3: 'dove'
                    {
                     before(grammarAccess.getThemeColorAccess().getDoveKeyword_6()); 
                    match(input,45,FOLLOW_2); 
                     after(grammarAccess.getThemeColorAccess().getDoveKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalSlideOMatic.g:1222:2: ( 'fly' )
                    {
                    // InternalSlideOMatic.g:1222:2: ( 'fly' )
                    // InternalSlideOMatic.g:1223:3: 'fly'
                    {
                     before(grammarAccess.getThemeColorAccess().getFlyKeyword_7()); 
                    match(input,46,FOLLOW_2); 
                     after(grammarAccess.getThemeColorAccess().getFlyKeyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalSlideOMatic.g:1228:2: ( 'lily' )
                    {
                    // InternalSlideOMatic.g:1228:2: ( 'lily' )
                    // InternalSlideOMatic.g:1229:3: 'lily'
                    {
                     before(grammarAccess.getThemeColorAccess().getLilyKeyword_8()); 
                    match(input,47,FOLLOW_2); 
                     after(grammarAccess.getThemeColorAccess().getLilyKeyword_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalSlideOMatic.g:1234:2: ( 'orchid' )
                    {
                    // InternalSlideOMatic.g:1234:2: ( 'orchid' )
                    // InternalSlideOMatic.g:1235:3: 'orchid'
                    {
                     before(grammarAccess.getThemeColorAccess().getOrchidKeyword_9()); 
                    match(input,48,FOLLOW_2); 
                     after(grammarAccess.getThemeColorAccess().getOrchidKeyword_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalSlideOMatic.g:1240:2: ( 'rose' )
                    {
                    // InternalSlideOMatic.g:1240:2: ( 'rose' )
                    // InternalSlideOMatic.g:1241:3: 'rose'
                    {
                     before(grammarAccess.getThemeColorAccess().getRoseKeyword_10()); 
                    match(input,49,FOLLOW_2); 
                     after(grammarAccess.getThemeColorAccess().getRoseKeyword_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalSlideOMatic.g:1246:2: ( 'seagull' )
                    {
                    // InternalSlideOMatic.g:1246:2: ( 'seagull' )
                    // InternalSlideOMatic.g:1247:3: 'seagull'
                    {
                     before(grammarAccess.getThemeColorAccess().getSeagullKeyword_11()); 
                    match(input,50,FOLLOW_2); 
                     after(grammarAccess.getThemeColorAccess().getSeagullKeyword_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalSlideOMatic.g:1252:2: ( 'seahorse' )
                    {
                    // InternalSlideOMatic.g:1252:2: ( 'seahorse' )
                    // InternalSlideOMatic.g:1253:3: 'seahorse'
                    {
                     before(grammarAccess.getThemeColorAccess().getSeahorseKeyword_12()); 
                    match(input,51,FOLLOW_2); 
                     after(grammarAccess.getThemeColorAccess().getSeahorseKeyword_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalSlideOMatic.g:1258:2: ( 'sidebartab' )
                    {
                    // InternalSlideOMatic.g:1258:2: ( 'sidebartab' )
                    // InternalSlideOMatic.g:1259:3: 'sidebartab'
                    {
                     before(grammarAccess.getThemeColorAccess().getSidebartabKeyword_13()); 
                    match(input,52,FOLLOW_2); 
                     after(grammarAccess.getThemeColorAccess().getSidebartabKeyword_13()); 

                    }


                    }
                    break;
                case 15 :
                    // InternalSlideOMatic.g:1264:2: ( 'structure' )
                    {
                    // InternalSlideOMatic.g:1264:2: ( 'structure' )
                    // InternalSlideOMatic.g:1265:3: 'structure'
                    {
                     before(grammarAccess.getThemeColorAccess().getStructureKeyword_14()); 
                    match(input,53,FOLLOW_2); 
                     after(grammarAccess.getThemeColorAccess().getStructureKeyword_14()); 

                    }


                    }
                    break;
                case 16 :
                    // InternalSlideOMatic.g:1270:2: ( 'whale' )
                    {
                    // InternalSlideOMatic.g:1270:2: ( 'whale' )
                    // InternalSlideOMatic.g:1271:3: 'whale'
                    {
                     before(grammarAccess.getThemeColorAccess().getWhaleKeyword_15()); 
                    match(input,54,FOLLOW_2); 
                     after(grammarAccess.getThemeColorAccess().getWhaleKeyword_15()); 

                    }


                    }
                    break;
                case 17 :
                    // InternalSlideOMatic.g:1276:2: ( 'wolverine' )
                    {
                    // InternalSlideOMatic.g:1276:2: ( 'wolverine' )
                    // InternalSlideOMatic.g:1277:3: 'wolverine'
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
    // InternalSlideOMatic.g:1286:1: rule__Authors__Alternatives_0 : ( ( 'author' ) | ( 'authors' ) );
    public final void rule__Authors__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1290:1: ( ( 'author' ) | ( 'authors' ) )
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
                    // InternalSlideOMatic.g:1291:2: ( 'author' )
                    {
                    // InternalSlideOMatic.g:1291:2: ( 'author' )
                    // InternalSlideOMatic.g:1292:3: 'author'
                    {
                     before(grammarAccess.getAuthorsAccess().getAuthorKeyword_0_0()); 
                    match(input,56,FOLLOW_2); 
                     after(grammarAccess.getAuthorsAccess().getAuthorKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSlideOMatic.g:1297:2: ( 'authors' )
                    {
                    // InternalSlideOMatic.g:1297:2: ( 'authors' )
                    // InternalSlideOMatic.g:1298:3: 'authors'
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
    // InternalSlideOMatic.g:1307:1: rule__Date__Alternatives_1 : ( ( ( rule__Date__DateAssignment_1_0 ) ) | ( ( rule__Date__Group_1_1__0 ) ) );
    public final void rule__Date__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1311:1: ( ( ( rule__Date__DateAssignment_1_0 ) ) | ( ( rule__Date__Group_1_1__0 ) ) )
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
                    // InternalSlideOMatic.g:1312:2: ( ( rule__Date__DateAssignment_1_0 ) )
                    {
                    // InternalSlideOMatic.g:1312:2: ( ( rule__Date__DateAssignment_1_0 ) )
                    // InternalSlideOMatic.g:1313:3: ( rule__Date__DateAssignment_1_0 )
                    {
                     before(grammarAccess.getDateAccess().getDateAssignment_1_0()); 
                    // InternalSlideOMatic.g:1314:3: ( rule__Date__DateAssignment_1_0 )
                    // InternalSlideOMatic.g:1314:4: rule__Date__DateAssignment_1_0
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
                    // InternalSlideOMatic.g:1318:2: ( ( rule__Date__Group_1_1__0 ) )
                    {
                    // InternalSlideOMatic.g:1318:2: ( ( rule__Date__Group_1_1__0 ) )
                    // InternalSlideOMatic.g:1319:3: ( rule__Date__Group_1_1__0 )
                    {
                     before(grammarAccess.getDateAccess().getGroup_1_1()); 
                    // InternalSlideOMatic.g:1320:3: ( rule__Date__Group_1_1__0 )
                    // InternalSlideOMatic.g:1320:4: rule__Date__Group_1_1__0
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
    // InternalSlideOMatic.g:1328:1: rule__Slide__Alternatives_1 : ( ( ( rule__Slide__Group_1_0__0 ) ) | ( ( rule__Slide__NameAssignment_1_1 ) ) );
    public final void rule__Slide__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1332:1: ( ( ( rule__Slide__Group_1_0__0 ) ) | ( ( rule__Slide__NameAssignment_1_1 ) ) )
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
                    // InternalSlideOMatic.g:1333:2: ( ( rule__Slide__Group_1_0__0 ) )
                    {
                    // InternalSlideOMatic.g:1333:2: ( ( rule__Slide__Group_1_0__0 ) )
                    // InternalSlideOMatic.g:1334:3: ( rule__Slide__Group_1_0__0 )
                    {
                     before(grammarAccess.getSlideAccess().getGroup_1_0()); 
                    // InternalSlideOMatic.g:1335:3: ( rule__Slide__Group_1_0__0 )
                    // InternalSlideOMatic.g:1335:4: rule__Slide__Group_1_0__0
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
                    // InternalSlideOMatic.g:1339:2: ( ( rule__Slide__NameAssignment_1_1 ) )
                    {
                    // InternalSlideOMatic.g:1339:2: ( ( rule__Slide__NameAssignment_1_1 ) )
                    // InternalSlideOMatic.g:1340:3: ( rule__Slide__NameAssignment_1_1 )
                    {
                     before(grammarAccess.getSlideAccess().getNameAssignment_1_1()); 
                    // InternalSlideOMatic.g:1341:3: ( rule__Slide__NameAssignment_1_1 )
                    // InternalSlideOMatic.g:1341:4: rule__Slide__NameAssignment_1_1
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
    // InternalSlideOMatic.g:1349:1: rule__Section__Alternatives : ( ( ( rule__Section__Group_0__0 ) ) | ( ( rule__Section__Group_1__0 ) ) | ( ( rule__Section__Group_2__0 ) ) );
    public final void rule__Section__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1353:1: ( ( ( rule__Section__Group_0__0 ) ) | ( ( rule__Section__Group_1__0 ) ) | ( ( rule__Section__Group_2__0 ) ) )
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
                    // InternalSlideOMatic.g:1354:2: ( ( rule__Section__Group_0__0 ) )
                    {
                    // InternalSlideOMatic.g:1354:2: ( ( rule__Section__Group_0__0 ) )
                    // InternalSlideOMatic.g:1355:3: ( rule__Section__Group_0__0 )
                    {
                     before(grammarAccess.getSectionAccess().getGroup_0()); 
                    // InternalSlideOMatic.g:1356:3: ( rule__Section__Group_0__0 )
                    // InternalSlideOMatic.g:1356:4: rule__Section__Group_0__0
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
                    // InternalSlideOMatic.g:1360:2: ( ( rule__Section__Group_1__0 ) )
                    {
                    // InternalSlideOMatic.g:1360:2: ( ( rule__Section__Group_1__0 ) )
                    // InternalSlideOMatic.g:1361:3: ( rule__Section__Group_1__0 )
                    {
                     before(grammarAccess.getSectionAccess().getGroup_1()); 
                    // InternalSlideOMatic.g:1362:3: ( rule__Section__Group_1__0 )
                    // InternalSlideOMatic.g:1362:4: rule__Section__Group_1__0
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
                    // InternalSlideOMatic.g:1366:2: ( ( rule__Section__Group_2__0 ) )
                    {
                    // InternalSlideOMatic.g:1366:2: ( ( rule__Section__Group_2__0 ) )
                    // InternalSlideOMatic.g:1367:3: ( rule__Section__Group_2__0 )
                    {
                     before(grammarAccess.getSectionAccess().getGroup_2()); 
                    // InternalSlideOMatic.g:1368:3: ( rule__Section__Group_2__0 )
                    // InternalSlideOMatic.g:1368:4: rule__Section__Group_2__0
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
    // InternalSlideOMatic.g:1376:1: rule__Content__Alternatives_0 : ( ( ruleToC ) | ( ruleText ) | ( ruleBlock ) | ( ruleList ) | ( ruleImage ) | ( ruleTable ) | ( ruleCode ) | ( ruleMathExp ) );
    public final void rule__Content__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1380:1: ( ( ruleToC ) | ( ruleText ) | ( ruleBlock ) | ( ruleList ) | ( ruleImage ) | ( ruleTable ) | ( ruleCode ) | ( ruleMathExp ) )
            int alt8=8;
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
            case 99:
                {
                alt8=7;
                }
                break;
            case 106:
                {
                alt8=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalSlideOMatic.g:1381:2: ( ruleToC )
                    {
                    // InternalSlideOMatic.g:1381:2: ( ruleToC )
                    // InternalSlideOMatic.g:1382:3: ruleToC
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
                    // InternalSlideOMatic.g:1387:2: ( ruleText )
                    {
                    // InternalSlideOMatic.g:1387:2: ( ruleText )
                    // InternalSlideOMatic.g:1388:3: ruleText
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
                    // InternalSlideOMatic.g:1393:2: ( ruleBlock )
                    {
                    // InternalSlideOMatic.g:1393:2: ( ruleBlock )
                    // InternalSlideOMatic.g:1394:3: ruleBlock
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
                    // InternalSlideOMatic.g:1399:2: ( ruleList )
                    {
                    // InternalSlideOMatic.g:1399:2: ( ruleList )
                    // InternalSlideOMatic.g:1400:3: ruleList
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
                    // InternalSlideOMatic.g:1405:2: ( ruleImage )
                    {
                    // InternalSlideOMatic.g:1405:2: ( ruleImage )
                    // InternalSlideOMatic.g:1406:3: ruleImage
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
                    // InternalSlideOMatic.g:1411:2: ( ruleTable )
                    {
                    // InternalSlideOMatic.g:1411:2: ( ruleTable )
                    // InternalSlideOMatic.g:1412:3: ruleTable
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
                    // InternalSlideOMatic.g:1417:2: ( ruleCode )
                    {
                    // InternalSlideOMatic.g:1417:2: ( ruleCode )
                    // InternalSlideOMatic.g:1418:3: ruleCode
                    {
                     before(grammarAccess.getContentAccess().getCodeParserRuleCall_0_6()); 
                    pushFollow(FOLLOW_2);
                    ruleCode();

                    state._fsp--;

                     after(grammarAccess.getContentAccess().getCodeParserRuleCall_0_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalSlideOMatic.g:1423:2: ( ruleMathExp )
                    {
                    // InternalSlideOMatic.g:1423:2: ( ruleMathExp )
                    // InternalSlideOMatic.g:1424:3: ruleMathExp
                    {
                     before(grammarAccess.getContentAccess().getMathExpParserRuleCall_0_7()); 
                    pushFollow(FOLLOW_2);
                    ruleMathExp();

                    state._fsp--;

                     after(grammarAccess.getContentAccess().getMathExpParserRuleCall_0_7()); 

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
    // InternalSlideOMatic.g:1433:1: rule__ToC__Alternatives : ( ( ( rule__ToC__Group_0__0 ) ) | ( ( rule__ToC__Group_1__0 ) ) );
    public final void rule__ToC__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1437:1: ( ( ( rule__ToC__Group_0__0 ) ) | ( ( rule__ToC__Group_1__0 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==84) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==EOF||LA9_1==RULE_STRING||LA9_1==11||LA9_1==72||(LA9_1>=84 && LA9_1<=87)||LA9_1==89||LA9_1==94||LA9_1==97||LA9_1==99||LA9_1==106) ) {
                    alt9=1;
                }
                else if ( (LA9_1==80) ) {
                    alt9=2;
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
                    // InternalSlideOMatic.g:1438:2: ( ( rule__ToC__Group_0__0 ) )
                    {
                    // InternalSlideOMatic.g:1438:2: ( ( rule__ToC__Group_0__0 ) )
                    // InternalSlideOMatic.g:1439:3: ( rule__ToC__Group_0__0 )
                    {
                     before(grammarAccess.getToCAccess().getGroup_0()); 
                    // InternalSlideOMatic.g:1440:3: ( rule__ToC__Group_0__0 )
                    // InternalSlideOMatic.g:1440:4: rule__ToC__Group_0__0
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
                    // InternalSlideOMatic.g:1444:2: ( ( rule__ToC__Group_1__0 ) )
                    {
                    // InternalSlideOMatic.g:1444:2: ( ( rule__ToC__Group_1__0 ) )
                    // InternalSlideOMatic.g:1445:3: ( rule__ToC__Group_1__0 )
                    {
                     before(grammarAccess.getToCAccess().getGroup_1()); 
                    // InternalSlideOMatic.g:1446:3: ( rule__ToC__Group_1__0 )
                    // InternalSlideOMatic.g:1446:4: rule__ToC__Group_1__0
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
    // InternalSlideOMatic.g:1454:1: rule__List__Alternatives : ( ( ruleNumberedList ) | ( ruleUnNumberedList ) );
    public final void rule__List__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1458:1: ( ( ruleNumberedList ) | ( ruleUnNumberedList ) )
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
                    // InternalSlideOMatic.g:1459:2: ( ruleNumberedList )
                    {
                    // InternalSlideOMatic.g:1459:2: ( ruleNumberedList )
                    // InternalSlideOMatic.g:1460:3: ruleNumberedList
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
                    // InternalSlideOMatic.g:1465:2: ( ruleUnNumberedList )
                    {
                    // InternalSlideOMatic.g:1465:2: ( ruleUnNumberedList )
                    // InternalSlideOMatic.g:1466:3: ruleUnNumberedList
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
    // InternalSlideOMatic.g:1475:1: rule__Alignment__Alternatives : ( ( 'topleft' ) | ( 'top' ) | ( 'topright' ) | ( 'left' ) | ( 'center' ) | ( 'right' ) | ( 'bottomleft' ) | ( 'bottom' ) | ( 'bottomright' ) );
    public final void rule__Alignment__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1479:1: ( ( 'topleft' ) | ( 'top' ) | ( 'topright' ) | ( 'left' ) | ( 'center' ) | ( 'right' ) | ( 'bottomleft' ) | ( 'bottom' ) | ( 'bottomright' ) )
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
                    // InternalSlideOMatic.g:1480:2: ( 'topleft' )
                    {
                    // InternalSlideOMatic.g:1480:2: ( 'topleft' )
                    // InternalSlideOMatic.g:1481:3: 'topleft'
                    {
                     before(grammarAccess.getAlignmentAccess().getTopleftKeyword_0()); 
                    match(input,58,FOLLOW_2); 
                     after(grammarAccess.getAlignmentAccess().getTopleftKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSlideOMatic.g:1486:2: ( 'top' )
                    {
                    // InternalSlideOMatic.g:1486:2: ( 'top' )
                    // InternalSlideOMatic.g:1487:3: 'top'
                    {
                     before(grammarAccess.getAlignmentAccess().getTopKeyword_1()); 
                    match(input,59,FOLLOW_2); 
                     after(grammarAccess.getAlignmentAccess().getTopKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSlideOMatic.g:1492:2: ( 'topright' )
                    {
                    // InternalSlideOMatic.g:1492:2: ( 'topright' )
                    // InternalSlideOMatic.g:1493:3: 'topright'
                    {
                     before(grammarAccess.getAlignmentAccess().getToprightKeyword_2()); 
                    match(input,60,FOLLOW_2); 
                     after(grammarAccess.getAlignmentAccess().getToprightKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSlideOMatic.g:1498:2: ( 'left' )
                    {
                    // InternalSlideOMatic.g:1498:2: ( 'left' )
                    // InternalSlideOMatic.g:1499:3: 'left'
                    {
                     before(grammarAccess.getAlignmentAccess().getLeftKeyword_3()); 
                    match(input,61,FOLLOW_2); 
                     after(grammarAccess.getAlignmentAccess().getLeftKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSlideOMatic.g:1504:2: ( 'center' )
                    {
                    // InternalSlideOMatic.g:1504:2: ( 'center' )
                    // InternalSlideOMatic.g:1505:3: 'center'
                    {
                     before(grammarAccess.getAlignmentAccess().getCenterKeyword_4()); 
                    match(input,62,FOLLOW_2); 
                     after(grammarAccess.getAlignmentAccess().getCenterKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalSlideOMatic.g:1510:2: ( 'right' )
                    {
                    // InternalSlideOMatic.g:1510:2: ( 'right' )
                    // InternalSlideOMatic.g:1511:3: 'right'
                    {
                     before(grammarAccess.getAlignmentAccess().getRightKeyword_5()); 
                    match(input,63,FOLLOW_2); 
                     after(grammarAccess.getAlignmentAccess().getRightKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalSlideOMatic.g:1516:2: ( 'bottomleft' )
                    {
                    // InternalSlideOMatic.g:1516:2: ( 'bottomleft' )
                    // InternalSlideOMatic.g:1517:3: 'bottomleft'
                    {
                     before(grammarAccess.getAlignmentAccess().getBottomleftKeyword_6()); 
                    match(input,64,FOLLOW_2); 
                     after(grammarAccess.getAlignmentAccess().getBottomleftKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalSlideOMatic.g:1522:2: ( 'bottom' )
                    {
                    // InternalSlideOMatic.g:1522:2: ( 'bottom' )
                    // InternalSlideOMatic.g:1523:3: 'bottom'
                    {
                     before(grammarAccess.getAlignmentAccess().getBottomKeyword_7()); 
                    match(input,65,FOLLOW_2); 
                     after(grammarAccess.getAlignmentAccess().getBottomKeyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalSlideOMatic.g:1528:2: ( 'bottomright' )
                    {
                    // InternalSlideOMatic.g:1528:2: ( 'bottomright' )
                    // InternalSlideOMatic.g:1529:3: 'bottomright'
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
    // InternalSlideOMatic.g:1538:1: rule__Size__Alternatives : ( ( ( rule__Size__Group_0__0 ) ) | ( ( rule__Size__Group_1__0 ) ) );
    public final void rule__Size__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1542:1: ( ( ( rule__Size__Group_0__0 ) ) | ( ( rule__Size__Group_1__0 ) ) )
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
                    // InternalSlideOMatic.g:1543:2: ( ( rule__Size__Group_0__0 ) )
                    {
                    // InternalSlideOMatic.g:1543:2: ( ( rule__Size__Group_0__0 ) )
                    // InternalSlideOMatic.g:1544:3: ( rule__Size__Group_0__0 )
                    {
                     before(grammarAccess.getSizeAccess().getGroup_0()); 
                    // InternalSlideOMatic.g:1545:3: ( rule__Size__Group_0__0 )
                    // InternalSlideOMatic.g:1545:4: rule__Size__Group_0__0
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
                    // InternalSlideOMatic.g:1549:2: ( ( rule__Size__Group_1__0 ) )
                    {
                    // InternalSlideOMatic.g:1549:2: ( ( rule__Size__Group_1__0 ) )
                    // InternalSlideOMatic.g:1550:3: ( rule__Size__Group_1__0 )
                    {
                     before(grammarAccess.getSizeAccess().getGroup_1()); 
                    // InternalSlideOMatic.g:1551:3: ( rule__Size__Group_1__0 )
                    // InternalSlideOMatic.g:1551:4: rule__Size__Group_1__0
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
    // InternalSlideOMatic.g:1559:1: rule__Size__UnitAlternatives_1_2_0 : ( ( 'cm' ) | ( 'em' ) | ( 'mm' ) );
    public final void rule__Size__UnitAlternatives_1_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1563:1: ( ( 'cm' ) | ( 'em' ) | ( 'mm' ) )
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
                    // InternalSlideOMatic.g:1564:2: ( 'cm' )
                    {
                    // InternalSlideOMatic.g:1564:2: ( 'cm' )
                    // InternalSlideOMatic.g:1565:3: 'cm'
                    {
                     before(grammarAccess.getSizeAccess().getUnitCmKeyword_1_2_0_0()); 
                    match(input,67,FOLLOW_2); 
                     after(grammarAccess.getSizeAccess().getUnitCmKeyword_1_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSlideOMatic.g:1570:2: ( 'em' )
                    {
                    // InternalSlideOMatic.g:1570:2: ( 'em' )
                    // InternalSlideOMatic.g:1571:3: 'em'
                    {
                     before(grammarAccess.getSizeAccess().getUnitEmKeyword_1_2_0_1()); 
                    match(input,68,FOLLOW_2); 
                     after(grammarAccess.getSizeAccess().getUnitEmKeyword_1_2_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSlideOMatic.g:1576:2: ( 'mm' )
                    {
                    // InternalSlideOMatic.g:1576:2: ( 'mm' )
                    // InternalSlideOMatic.g:1577:3: 'mm'
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
    // InternalSlideOMatic.g:1586:1: rule__Way__Alternatives : ( ( ( rule__Way__Group_0__0 ) ) | ( ( rule__Way__Group_1__0 ) ) );
    public final void rule__Way__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1590:1: ( ( ( rule__Way__Group_0__0 ) ) | ( ( rule__Way__Group_1__0 ) ) )
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
                    // InternalSlideOMatic.g:1591:2: ( ( rule__Way__Group_0__0 ) )
                    {
                    // InternalSlideOMatic.g:1591:2: ( ( rule__Way__Group_0__0 ) )
                    // InternalSlideOMatic.g:1592:3: ( rule__Way__Group_0__0 )
                    {
                     before(grammarAccess.getWayAccess().getGroup_0()); 
                    // InternalSlideOMatic.g:1593:3: ( rule__Way__Group_0__0 )
                    // InternalSlideOMatic.g:1593:4: rule__Way__Group_0__0
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
                    // InternalSlideOMatic.g:1597:2: ( ( rule__Way__Group_1__0 ) )
                    {
                    // InternalSlideOMatic.g:1597:2: ( ( rule__Way__Group_1__0 ) )
                    // InternalSlideOMatic.g:1598:3: ( rule__Way__Group_1__0 )
                    {
                     before(grammarAccess.getWayAccess().getGroup_1()); 
                    // InternalSlideOMatic.g:1599:3: ( rule__Way__Group_1__0 )
                    // InternalSlideOMatic.g:1599:4: rule__Way__Group_1__0
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


    // $ANTLR start "rule__Code__Alternatives"
    // InternalSlideOMatic.g:1607:1: rule__Code__Alternatives : ( ( ( rule__Code__Group_0__0 ) ) | ( ( rule__Code__Group_1__0 ) ) );
    public final void rule__Code__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1611:1: ( ( ( rule__Code__Group_0__0 ) ) | ( ( rule__Code__Group_1__0 ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==97) ) {
                alt15=1;
            }
            else if ( (LA15_0==99) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalSlideOMatic.g:1612:2: ( ( rule__Code__Group_0__0 ) )
                    {
                    // InternalSlideOMatic.g:1612:2: ( ( rule__Code__Group_0__0 ) )
                    // InternalSlideOMatic.g:1613:3: ( rule__Code__Group_0__0 )
                    {
                     before(grammarAccess.getCodeAccess().getGroup_0()); 
                    // InternalSlideOMatic.g:1614:3: ( rule__Code__Group_0__0 )
                    // InternalSlideOMatic.g:1614:4: rule__Code__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Code__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCodeAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSlideOMatic.g:1618:2: ( ( rule__Code__Group_1__0 ) )
                    {
                    // InternalSlideOMatic.g:1618:2: ( ( rule__Code__Group_1__0 ) )
                    // InternalSlideOMatic.g:1619:3: ( rule__Code__Group_1__0 )
                    {
                     before(grammarAccess.getCodeAccess().getGroup_1()); 
                    // InternalSlideOMatic.g:1620:3: ( rule__Code__Group_1__0 )
                    // InternalSlideOMatic.g:1620:4: rule__Code__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Code__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCodeAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Code__Alternatives"


    // $ANTLR start "rule__AnimationType__Alternatives"
    // InternalSlideOMatic.g:1628:1: rule__AnimationType__Alternatives : ( ( ( rule__AnimationType__Group_0__0 ) ) | ( ( rule__AnimationType__Group_1__0 ) ) );
    public final void rule__AnimationType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1632:1: ( ( ( rule__AnimationType__Group_0__0 ) ) | ( ( rule__AnimationType__Group_1__0 ) ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==104) ) {
                alt16=1;
            }
            else if ( (LA16_0==105) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalSlideOMatic.g:1633:2: ( ( rule__AnimationType__Group_0__0 ) )
                    {
                    // InternalSlideOMatic.g:1633:2: ( ( rule__AnimationType__Group_0__0 ) )
                    // InternalSlideOMatic.g:1634:3: ( rule__AnimationType__Group_0__0 )
                    {
                     before(grammarAccess.getAnimationTypeAccess().getGroup_0()); 
                    // InternalSlideOMatic.g:1635:3: ( rule__AnimationType__Group_0__0 )
                    // InternalSlideOMatic.g:1635:4: rule__AnimationType__Group_0__0
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
                    // InternalSlideOMatic.g:1639:2: ( ( rule__AnimationType__Group_1__0 ) )
                    {
                    // InternalSlideOMatic.g:1639:2: ( ( rule__AnimationType__Group_1__0 ) )
                    // InternalSlideOMatic.g:1640:3: ( rule__AnimationType__Group_1__0 )
                    {
                     before(grammarAccess.getAnimationTypeAccess().getGroup_1()); 
                    // InternalSlideOMatic.g:1641:3: ( rule__AnimationType__Group_1__0 )
                    // InternalSlideOMatic.g:1641:4: rule__AnimationType__Group_1__0
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


    // $ANTLR start "rule__Exp__Alternatives_1_0"
    // InternalSlideOMatic.g:1649:1: rule__Exp__Alternatives_1_0 : ( ( ( rule__Exp__Group_1_0_0__0 ) ) | ( ( rule__Exp__Group_1_0_1__0 ) ) );
    public final void rule__Exp__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1653:1: ( ( ( rule__Exp__Group_1_0_0__0 ) ) | ( ( rule__Exp__Group_1_0_1__0 ) ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==107) ) {
                alt17=1;
            }
            else if ( (LA17_0==88) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalSlideOMatic.g:1654:2: ( ( rule__Exp__Group_1_0_0__0 ) )
                    {
                    // InternalSlideOMatic.g:1654:2: ( ( rule__Exp__Group_1_0_0__0 ) )
                    // InternalSlideOMatic.g:1655:3: ( rule__Exp__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getExpAccess().getGroup_1_0_0()); 
                    // InternalSlideOMatic.g:1656:3: ( rule__Exp__Group_1_0_0__0 )
                    // InternalSlideOMatic.g:1656:4: rule__Exp__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Exp__Group_1_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpAccess().getGroup_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSlideOMatic.g:1660:2: ( ( rule__Exp__Group_1_0_1__0 ) )
                    {
                    // InternalSlideOMatic.g:1660:2: ( ( rule__Exp__Group_1_0_1__0 ) )
                    // InternalSlideOMatic.g:1661:3: ( rule__Exp__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getExpAccess().getGroup_1_0_1()); 
                    // InternalSlideOMatic.g:1662:3: ( rule__Exp__Group_1_0_1__0 )
                    // InternalSlideOMatic.g:1662:4: rule__Exp__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Exp__Group_1_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpAccess().getGroup_1_0_1()); 

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
    // $ANTLR end "rule__Exp__Alternatives_1_0"


    // $ANTLR start "rule__Factor__Alternatives_1_0"
    // InternalSlideOMatic.g:1670:1: rule__Factor__Alternatives_1_0 : ( ( ( rule__Factor__Group_1_0_0__0 ) ) | ( ( rule__Factor__Group_1_0_1__0 ) ) );
    public final void rule__Factor__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1674:1: ( ( ( rule__Factor__Group_1_0_0__0 ) ) | ( ( rule__Factor__Group_1_0_1__0 ) ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==80) ) {
                alt18=1;
            }
            else if ( (LA18_0==108) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalSlideOMatic.g:1675:2: ( ( rule__Factor__Group_1_0_0__0 ) )
                    {
                    // InternalSlideOMatic.g:1675:2: ( ( rule__Factor__Group_1_0_0__0 ) )
                    // InternalSlideOMatic.g:1676:3: ( rule__Factor__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getFactorAccess().getGroup_1_0_0()); 
                    // InternalSlideOMatic.g:1677:3: ( rule__Factor__Group_1_0_0__0 )
                    // InternalSlideOMatic.g:1677:4: rule__Factor__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Factor__Group_1_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFactorAccess().getGroup_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSlideOMatic.g:1681:2: ( ( rule__Factor__Group_1_0_1__0 ) )
                    {
                    // InternalSlideOMatic.g:1681:2: ( ( rule__Factor__Group_1_0_1__0 ) )
                    // InternalSlideOMatic.g:1682:3: ( rule__Factor__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getFactorAccess().getGroup_1_0_1()); 
                    // InternalSlideOMatic.g:1683:3: ( rule__Factor__Group_1_0_1__0 )
                    // InternalSlideOMatic.g:1683:4: rule__Factor__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Factor__Group_1_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFactorAccess().getGroup_1_0_1()); 

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
    // $ANTLR end "rule__Factor__Alternatives_1_0"


    // $ANTLR start "rule__Primary__Alternatives"
    // InternalSlideOMatic.g:1691:1: rule__Primary__Alternatives : ( ( ruleNumber ) | ( ruleParenthesis ) | ( ruleVariableBinding ) | ( ruleVariableUse ) );
    public final void rule__Primary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1695:1: ( ( ruleNumber ) | ( ruleParenthesis ) | ( ruleVariableBinding ) | ( ruleVariableUse ) )
            int alt19=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt19=1;
                }
                break;
            case 73:
                {
                alt19=2;
                }
                break;
            case 110:
                {
                alt19=3;
                }
                break;
            case RULE_ID:
                {
                alt19=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalSlideOMatic.g:1696:2: ( ruleNumber )
                    {
                    // InternalSlideOMatic.g:1696:2: ( ruleNumber )
                    // InternalSlideOMatic.g:1697:3: ruleNumber
                    {
                     before(grammarAccess.getPrimaryAccess().getNumberParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleNumber();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getNumberParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSlideOMatic.g:1702:2: ( ruleParenthesis )
                    {
                    // InternalSlideOMatic.g:1702:2: ( ruleParenthesis )
                    // InternalSlideOMatic.g:1703:3: ruleParenthesis
                    {
                     before(grammarAccess.getPrimaryAccess().getParenthesisParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleParenthesis();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getParenthesisParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSlideOMatic.g:1708:2: ( ruleVariableBinding )
                    {
                    // InternalSlideOMatic.g:1708:2: ( ruleVariableBinding )
                    // InternalSlideOMatic.g:1709:3: ruleVariableBinding
                    {
                     before(grammarAccess.getPrimaryAccess().getVariableBindingParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleVariableBinding();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getVariableBindingParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSlideOMatic.g:1714:2: ( ruleVariableUse )
                    {
                    // InternalSlideOMatic.g:1714:2: ( ruleVariableUse )
                    // InternalSlideOMatic.g:1715:3: ruleVariableUse
                    {
                     before(grammarAccess.getPrimaryAccess().getVariableUseParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleVariableUse();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getVariableUseParserRuleCall_3()); 

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
    // $ANTLR end "rule__Primary__Alternatives"


    // $ANTLR start "rule__Presentation__Group__0"
    // InternalSlideOMatic.g:1724:1: rule__Presentation__Group__0 : rule__Presentation__Group__0__Impl rule__Presentation__Group__1 ;
    public final void rule__Presentation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1728:1: ( rule__Presentation__Group__0__Impl rule__Presentation__Group__1 )
            // InternalSlideOMatic.g:1729:2: rule__Presentation__Group__0__Impl rule__Presentation__Group__1
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
    // InternalSlideOMatic.g:1736:1: rule__Presentation__Group__0__Impl : ( 'presentation' ) ;
    public final void rule__Presentation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1740:1: ( ( 'presentation' ) )
            // InternalSlideOMatic.g:1741:1: ( 'presentation' )
            {
            // InternalSlideOMatic.g:1741:1: ( 'presentation' )
            // InternalSlideOMatic.g:1742:2: 'presentation'
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
    // InternalSlideOMatic.g:1751:1: rule__Presentation__Group__1 : rule__Presentation__Group__1__Impl rule__Presentation__Group__2 ;
    public final void rule__Presentation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1755:1: ( rule__Presentation__Group__1__Impl rule__Presentation__Group__2 )
            // InternalSlideOMatic.g:1756:2: rule__Presentation__Group__1__Impl rule__Presentation__Group__2
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
    // InternalSlideOMatic.g:1763:1: rule__Presentation__Group__1__Impl : ( ( rule__Presentation__NameAssignment_1 ) ) ;
    public final void rule__Presentation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1767:1: ( ( ( rule__Presentation__NameAssignment_1 ) ) )
            // InternalSlideOMatic.g:1768:1: ( ( rule__Presentation__NameAssignment_1 ) )
            {
            // InternalSlideOMatic.g:1768:1: ( ( rule__Presentation__NameAssignment_1 ) )
            // InternalSlideOMatic.g:1769:2: ( rule__Presentation__NameAssignment_1 )
            {
             before(grammarAccess.getPresentationAccess().getNameAssignment_1()); 
            // InternalSlideOMatic.g:1770:2: ( rule__Presentation__NameAssignment_1 )
            // InternalSlideOMatic.g:1770:3: rule__Presentation__NameAssignment_1
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
    // InternalSlideOMatic.g:1778:1: rule__Presentation__Group__2 : rule__Presentation__Group__2__Impl rule__Presentation__Group__3 ;
    public final void rule__Presentation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1782:1: ( rule__Presentation__Group__2__Impl rule__Presentation__Group__3 )
            // InternalSlideOMatic.g:1783:2: rule__Presentation__Group__2__Impl rule__Presentation__Group__3
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
    // InternalSlideOMatic.g:1790:1: rule__Presentation__Group__2__Impl : ( ( rule__Presentation__SubtitleAssignment_2 )? ) ;
    public final void rule__Presentation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1794:1: ( ( ( rule__Presentation__SubtitleAssignment_2 )? ) )
            // InternalSlideOMatic.g:1795:1: ( ( rule__Presentation__SubtitleAssignment_2 )? )
            {
            // InternalSlideOMatic.g:1795:1: ( ( rule__Presentation__SubtitleAssignment_2 )? )
            // InternalSlideOMatic.g:1796:2: ( rule__Presentation__SubtitleAssignment_2 )?
            {
             before(grammarAccess.getPresentationAccess().getSubtitleAssignment_2()); 
            // InternalSlideOMatic.g:1797:2: ( rule__Presentation__SubtitleAssignment_2 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_STRING) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalSlideOMatic.g:1797:3: rule__Presentation__SubtitleAssignment_2
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
    // InternalSlideOMatic.g:1805:1: rule__Presentation__Group__3 : rule__Presentation__Group__3__Impl rule__Presentation__Group__4 ;
    public final void rule__Presentation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1809:1: ( rule__Presentation__Group__3__Impl rule__Presentation__Group__4 )
            // InternalSlideOMatic.g:1810:2: rule__Presentation__Group__3__Impl rule__Presentation__Group__4
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
    // InternalSlideOMatic.g:1817:1: rule__Presentation__Group__3__Impl : ( '{' ) ;
    public final void rule__Presentation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1821:1: ( ( '{' ) )
            // InternalSlideOMatic.g:1822:1: ( '{' )
            {
            // InternalSlideOMatic.g:1822:1: ( '{' )
            // InternalSlideOMatic.g:1823:2: '{'
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
    // InternalSlideOMatic.g:1832:1: rule__Presentation__Group__4 : rule__Presentation__Group__4__Impl rule__Presentation__Group__5 ;
    public final void rule__Presentation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1836:1: ( rule__Presentation__Group__4__Impl rule__Presentation__Group__5 )
            // InternalSlideOMatic.g:1837:2: rule__Presentation__Group__4__Impl rule__Presentation__Group__5
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
    // InternalSlideOMatic.g:1844:1: rule__Presentation__Group__4__Impl : ( ( rule__Presentation__Group_4__0 )? ) ;
    public final void rule__Presentation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1848:1: ( ( ( rule__Presentation__Group_4__0 )? ) )
            // InternalSlideOMatic.g:1849:1: ( ( rule__Presentation__Group_4__0 )? )
            {
            // InternalSlideOMatic.g:1849:1: ( ( rule__Presentation__Group_4__0 )? )
            // InternalSlideOMatic.g:1850:2: ( rule__Presentation__Group_4__0 )?
            {
             before(grammarAccess.getPresentationAccess().getGroup_4()); 
            // InternalSlideOMatic.g:1851:2: ( rule__Presentation__Group_4__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==73) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalSlideOMatic.g:1851:3: rule__Presentation__Group_4__0
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
    // InternalSlideOMatic.g:1859:1: rule__Presentation__Group__5 : rule__Presentation__Group__5__Impl rule__Presentation__Group__6 ;
    public final void rule__Presentation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1863:1: ( rule__Presentation__Group__5__Impl rule__Presentation__Group__6 )
            // InternalSlideOMatic.g:1864:2: rule__Presentation__Group__5__Impl rule__Presentation__Group__6
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
    // InternalSlideOMatic.g:1871:1: rule__Presentation__Group__5__Impl : ( ( rule__Presentation__Alternatives_5 )* ) ;
    public final void rule__Presentation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1875:1: ( ( ( rule__Presentation__Alternatives_5 )* ) )
            // InternalSlideOMatic.g:1876:1: ( ( rule__Presentation__Alternatives_5 )* )
            {
            // InternalSlideOMatic.g:1876:1: ( ( rule__Presentation__Alternatives_5 )* )
            // InternalSlideOMatic.g:1877:2: ( rule__Presentation__Alternatives_5 )*
            {
             before(grammarAccess.getPresentationAccess().getAlternatives_5()); 
            // InternalSlideOMatic.g:1878:2: ( rule__Presentation__Alternatives_5 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==81||LA22_0==102) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalSlideOMatic.g:1878:3: rule__Presentation__Alternatives_5
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Presentation__Alternatives_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // InternalSlideOMatic.g:1886:1: rule__Presentation__Group__6 : rule__Presentation__Group__6__Impl ;
    public final void rule__Presentation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1890:1: ( rule__Presentation__Group__6__Impl )
            // InternalSlideOMatic.g:1891:2: rule__Presentation__Group__6__Impl
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
    // InternalSlideOMatic.g:1897:1: rule__Presentation__Group__6__Impl : ( '}' ) ;
    public final void rule__Presentation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1901:1: ( ( '}' ) )
            // InternalSlideOMatic.g:1902:1: ( '}' )
            {
            // InternalSlideOMatic.g:1902:1: ( '}' )
            // InternalSlideOMatic.g:1903:2: '}'
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
    // InternalSlideOMatic.g:1913:1: rule__Presentation__Group_4__0 : rule__Presentation__Group_4__0__Impl rule__Presentation__Group_4__1 ;
    public final void rule__Presentation__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1917:1: ( rule__Presentation__Group_4__0__Impl rule__Presentation__Group_4__1 )
            // InternalSlideOMatic.g:1918:2: rule__Presentation__Group_4__0__Impl rule__Presentation__Group_4__1
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
    // InternalSlideOMatic.g:1925:1: rule__Presentation__Group_4__0__Impl : ( '(' ) ;
    public final void rule__Presentation__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1929:1: ( ( '(' ) )
            // InternalSlideOMatic.g:1930:1: ( '(' )
            {
            // InternalSlideOMatic.g:1930:1: ( '(' )
            // InternalSlideOMatic.g:1931:2: '('
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
    // InternalSlideOMatic.g:1940:1: rule__Presentation__Group_4__1 : rule__Presentation__Group_4__1__Impl rule__Presentation__Group_4__2 ;
    public final void rule__Presentation__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1944:1: ( rule__Presentation__Group_4__1__Impl rule__Presentation__Group_4__2 )
            // InternalSlideOMatic.g:1945:2: rule__Presentation__Group_4__1__Impl rule__Presentation__Group_4__2
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
    // InternalSlideOMatic.g:1952:1: rule__Presentation__Group_4__1__Impl : ( ( rule__Presentation__ThemeAssignment_4_1 )? ) ;
    public final void rule__Presentation__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1956:1: ( ( ( rule__Presentation__ThemeAssignment_4_1 )? ) )
            // InternalSlideOMatic.g:1957:1: ( ( rule__Presentation__ThemeAssignment_4_1 )? )
            {
            // InternalSlideOMatic.g:1957:1: ( ( rule__Presentation__ThemeAssignment_4_1 )? )
            // InternalSlideOMatic.g:1958:2: ( rule__Presentation__ThemeAssignment_4_1 )?
            {
             before(grammarAccess.getPresentationAccess().getThemeAssignment_4_1()); 
            // InternalSlideOMatic.g:1959:2: ( rule__Presentation__ThemeAssignment_4_1 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==75) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalSlideOMatic.g:1959:3: rule__Presentation__ThemeAssignment_4_1
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
    // InternalSlideOMatic.g:1967:1: rule__Presentation__Group_4__2 : rule__Presentation__Group_4__2__Impl rule__Presentation__Group_4__3 ;
    public final void rule__Presentation__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1971:1: ( rule__Presentation__Group_4__2__Impl rule__Presentation__Group_4__3 )
            // InternalSlideOMatic.g:1972:2: rule__Presentation__Group_4__2__Impl rule__Presentation__Group_4__3
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
    // InternalSlideOMatic.g:1979:1: rule__Presentation__Group_4__2__Impl : ( ( rule__Presentation__AuthorsAssignment_4_2 )? ) ;
    public final void rule__Presentation__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1983:1: ( ( ( rule__Presentation__AuthorsAssignment_4_2 )? ) )
            // InternalSlideOMatic.g:1984:1: ( ( rule__Presentation__AuthorsAssignment_4_2 )? )
            {
            // InternalSlideOMatic.g:1984:1: ( ( rule__Presentation__AuthorsAssignment_4_2 )? )
            // InternalSlideOMatic.g:1985:2: ( rule__Presentation__AuthorsAssignment_4_2 )?
            {
             before(grammarAccess.getPresentationAccess().getAuthorsAssignment_4_2()); 
            // InternalSlideOMatic.g:1986:2: ( rule__Presentation__AuthorsAssignment_4_2 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=56 && LA24_0<=57)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalSlideOMatic.g:1986:3: rule__Presentation__AuthorsAssignment_4_2
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
    // InternalSlideOMatic.g:1994:1: rule__Presentation__Group_4__3 : rule__Presentation__Group_4__3__Impl rule__Presentation__Group_4__4 ;
    public final void rule__Presentation__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1998:1: ( rule__Presentation__Group_4__3__Impl rule__Presentation__Group_4__4 )
            // InternalSlideOMatic.g:1999:2: rule__Presentation__Group_4__3__Impl rule__Presentation__Group_4__4
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
    // InternalSlideOMatic.g:2006:1: rule__Presentation__Group_4__3__Impl : ( ( rule__Presentation__InstituteAssignment_4_3 )? ) ;
    public final void rule__Presentation__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2010:1: ( ( ( rule__Presentation__InstituteAssignment_4_3 )? ) )
            // InternalSlideOMatic.g:2011:1: ( ( rule__Presentation__InstituteAssignment_4_3 )? )
            {
            // InternalSlideOMatic.g:2011:1: ( ( rule__Presentation__InstituteAssignment_4_3 )? )
            // InternalSlideOMatic.g:2012:2: ( rule__Presentation__InstituteAssignment_4_3 )?
            {
             before(grammarAccess.getPresentationAccess().getInstituteAssignment_4_3()); 
            // InternalSlideOMatic.g:2013:2: ( rule__Presentation__InstituteAssignment_4_3 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==78) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalSlideOMatic.g:2013:3: rule__Presentation__InstituteAssignment_4_3
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
    // InternalSlideOMatic.g:2021:1: rule__Presentation__Group_4__4 : rule__Presentation__Group_4__4__Impl rule__Presentation__Group_4__5 ;
    public final void rule__Presentation__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2025:1: ( rule__Presentation__Group_4__4__Impl rule__Presentation__Group_4__5 )
            // InternalSlideOMatic.g:2026:2: rule__Presentation__Group_4__4__Impl rule__Presentation__Group_4__5
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
    // InternalSlideOMatic.g:2033:1: rule__Presentation__Group_4__4__Impl : ( ( rule__Presentation__DateAssignment_4_4 )? ) ;
    public final void rule__Presentation__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2037:1: ( ( ( rule__Presentation__DateAssignment_4_4 )? ) )
            // InternalSlideOMatic.g:2038:1: ( ( rule__Presentation__DateAssignment_4_4 )? )
            {
            // InternalSlideOMatic.g:2038:1: ( ( rule__Presentation__DateAssignment_4_4 )? )
            // InternalSlideOMatic.g:2039:2: ( rule__Presentation__DateAssignment_4_4 )?
            {
             before(grammarAccess.getPresentationAccess().getDateAssignment_4_4()); 
            // InternalSlideOMatic.g:2040:2: ( rule__Presentation__DateAssignment_4_4 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==79) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalSlideOMatic.g:2040:3: rule__Presentation__DateAssignment_4_4
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
    // InternalSlideOMatic.g:2048:1: rule__Presentation__Group_4__5 : rule__Presentation__Group_4__5__Impl ;
    public final void rule__Presentation__Group_4__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2052:1: ( rule__Presentation__Group_4__5__Impl )
            // InternalSlideOMatic.g:2053:2: rule__Presentation__Group_4__5__Impl
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
    // InternalSlideOMatic.g:2059:1: rule__Presentation__Group_4__5__Impl : ( ')' ) ;
    public final void rule__Presentation__Group_4__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2063:1: ( ( ')' ) )
            // InternalSlideOMatic.g:2064:1: ( ')' )
            {
            // InternalSlideOMatic.g:2064:1: ( ')' )
            // InternalSlideOMatic.g:2065:2: ')'
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
    // InternalSlideOMatic.g:2075:1: rule__Theme__Group__0 : rule__Theme__Group__0__Impl rule__Theme__Group__1 ;
    public final void rule__Theme__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2079:1: ( rule__Theme__Group__0__Impl rule__Theme__Group__1 )
            // InternalSlideOMatic.g:2080:2: rule__Theme__Group__0__Impl rule__Theme__Group__1
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
    // InternalSlideOMatic.g:2087:1: rule__Theme__Group__0__Impl : ( 'theme' ) ;
    public final void rule__Theme__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2091:1: ( ( 'theme' ) )
            // InternalSlideOMatic.g:2092:1: ( 'theme' )
            {
            // InternalSlideOMatic.g:2092:1: ( 'theme' )
            // InternalSlideOMatic.g:2093:2: 'theme'
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
    // InternalSlideOMatic.g:2102:1: rule__Theme__Group__1 : rule__Theme__Group__1__Impl rule__Theme__Group__2 ;
    public final void rule__Theme__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2106:1: ( rule__Theme__Group__1__Impl rule__Theme__Group__2 )
            // InternalSlideOMatic.g:2107:2: rule__Theme__Group__1__Impl rule__Theme__Group__2
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
    // InternalSlideOMatic.g:2114:1: rule__Theme__Group__1__Impl : ( ( rule__Theme__ThemeAssignment_1 ) ) ;
    public final void rule__Theme__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2118:1: ( ( ( rule__Theme__ThemeAssignment_1 ) ) )
            // InternalSlideOMatic.g:2119:1: ( ( rule__Theme__ThemeAssignment_1 ) )
            {
            // InternalSlideOMatic.g:2119:1: ( ( rule__Theme__ThemeAssignment_1 ) )
            // InternalSlideOMatic.g:2120:2: ( rule__Theme__ThemeAssignment_1 )
            {
             before(grammarAccess.getThemeAccess().getThemeAssignment_1()); 
            // InternalSlideOMatic.g:2121:2: ( rule__Theme__ThemeAssignment_1 )
            // InternalSlideOMatic.g:2121:3: rule__Theme__ThemeAssignment_1
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
    // InternalSlideOMatic.g:2129:1: rule__Theme__Group__2 : rule__Theme__Group__2__Impl ;
    public final void rule__Theme__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2133:1: ( rule__Theme__Group__2__Impl )
            // InternalSlideOMatic.g:2134:2: rule__Theme__Group__2__Impl
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
    // InternalSlideOMatic.g:2140:1: rule__Theme__Group__2__Impl : ( ( rule__Theme__Group_2__0 )? ) ;
    public final void rule__Theme__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2144:1: ( ( ( rule__Theme__Group_2__0 )? ) )
            // InternalSlideOMatic.g:2145:1: ( ( rule__Theme__Group_2__0 )? )
            {
            // InternalSlideOMatic.g:2145:1: ( ( rule__Theme__Group_2__0 )? )
            // InternalSlideOMatic.g:2146:2: ( rule__Theme__Group_2__0 )?
            {
             before(grammarAccess.getThemeAccess().getGroup_2()); 
            // InternalSlideOMatic.g:2147:2: ( rule__Theme__Group_2__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==76) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalSlideOMatic.g:2147:3: rule__Theme__Group_2__0
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
    // InternalSlideOMatic.g:2156:1: rule__Theme__Group_2__0 : rule__Theme__Group_2__0__Impl rule__Theme__Group_2__1 ;
    public final void rule__Theme__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2160:1: ( rule__Theme__Group_2__0__Impl rule__Theme__Group_2__1 )
            // InternalSlideOMatic.g:2161:2: rule__Theme__Group_2__0__Impl rule__Theme__Group_2__1
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
    // InternalSlideOMatic.g:2168:1: rule__Theme__Group_2__0__Impl : ( 'color' ) ;
    public final void rule__Theme__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2172:1: ( ( 'color' ) )
            // InternalSlideOMatic.g:2173:1: ( 'color' )
            {
            // InternalSlideOMatic.g:2173:1: ( 'color' )
            // InternalSlideOMatic.g:2174:2: 'color'
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
    // InternalSlideOMatic.g:2183:1: rule__Theme__Group_2__1 : rule__Theme__Group_2__1__Impl ;
    public final void rule__Theme__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2187:1: ( rule__Theme__Group_2__1__Impl )
            // InternalSlideOMatic.g:2188:2: rule__Theme__Group_2__1__Impl
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
    // InternalSlideOMatic.g:2194:1: rule__Theme__Group_2__1__Impl : ( ( rule__Theme__ThemeColorAssignment_2_1 ) ) ;
    public final void rule__Theme__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2198:1: ( ( ( rule__Theme__ThemeColorAssignment_2_1 ) ) )
            // InternalSlideOMatic.g:2199:1: ( ( rule__Theme__ThemeColorAssignment_2_1 ) )
            {
            // InternalSlideOMatic.g:2199:1: ( ( rule__Theme__ThemeColorAssignment_2_1 ) )
            // InternalSlideOMatic.g:2200:2: ( rule__Theme__ThemeColorAssignment_2_1 )
            {
             before(grammarAccess.getThemeAccess().getThemeColorAssignment_2_1()); 
            // InternalSlideOMatic.g:2201:2: ( rule__Theme__ThemeColorAssignment_2_1 )
            // InternalSlideOMatic.g:2201:3: rule__Theme__ThemeColorAssignment_2_1
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
    // InternalSlideOMatic.g:2210:1: rule__Authors__Group__0 : rule__Authors__Group__0__Impl rule__Authors__Group__1 ;
    public final void rule__Authors__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2214:1: ( rule__Authors__Group__0__Impl rule__Authors__Group__1 )
            // InternalSlideOMatic.g:2215:2: rule__Authors__Group__0__Impl rule__Authors__Group__1
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
    // InternalSlideOMatic.g:2222:1: rule__Authors__Group__0__Impl : ( ( rule__Authors__Alternatives_0 ) ) ;
    public final void rule__Authors__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2226:1: ( ( ( rule__Authors__Alternatives_0 ) ) )
            // InternalSlideOMatic.g:2227:1: ( ( rule__Authors__Alternatives_0 ) )
            {
            // InternalSlideOMatic.g:2227:1: ( ( rule__Authors__Alternatives_0 ) )
            // InternalSlideOMatic.g:2228:2: ( rule__Authors__Alternatives_0 )
            {
             before(grammarAccess.getAuthorsAccess().getAlternatives_0()); 
            // InternalSlideOMatic.g:2229:2: ( rule__Authors__Alternatives_0 )
            // InternalSlideOMatic.g:2229:3: rule__Authors__Alternatives_0
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
    // InternalSlideOMatic.g:2237:1: rule__Authors__Group__1 : rule__Authors__Group__1__Impl rule__Authors__Group__2 ;
    public final void rule__Authors__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2241:1: ( rule__Authors__Group__1__Impl rule__Authors__Group__2 )
            // InternalSlideOMatic.g:2242:2: rule__Authors__Group__1__Impl rule__Authors__Group__2
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
    // InternalSlideOMatic.g:2249:1: rule__Authors__Group__1__Impl : ( ( rule__Authors__NamesAssignment_1 ) ) ;
    public final void rule__Authors__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2253:1: ( ( ( rule__Authors__NamesAssignment_1 ) ) )
            // InternalSlideOMatic.g:2254:1: ( ( rule__Authors__NamesAssignment_1 ) )
            {
            // InternalSlideOMatic.g:2254:1: ( ( rule__Authors__NamesAssignment_1 ) )
            // InternalSlideOMatic.g:2255:2: ( rule__Authors__NamesAssignment_1 )
            {
             before(grammarAccess.getAuthorsAccess().getNamesAssignment_1()); 
            // InternalSlideOMatic.g:2256:2: ( rule__Authors__NamesAssignment_1 )
            // InternalSlideOMatic.g:2256:3: rule__Authors__NamesAssignment_1
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
    // InternalSlideOMatic.g:2264:1: rule__Authors__Group__2 : rule__Authors__Group__2__Impl ;
    public final void rule__Authors__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2268:1: ( rule__Authors__Group__2__Impl )
            // InternalSlideOMatic.g:2269:2: rule__Authors__Group__2__Impl
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
    // InternalSlideOMatic.g:2275:1: rule__Authors__Group__2__Impl : ( ( rule__Authors__Group_2__0 )* ) ;
    public final void rule__Authors__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2279:1: ( ( ( rule__Authors__Group_2__0 )* ) )
            // InternalSlideOMatic.g:2280:1: ( ( rule__Authors__Group_2__0 )* )
            {
            // InternalSlideOMatic.g:2280:1: ( ( rule__Authors__Group_2__0 )* )
            // InternalSlideOMatic.g:2281:2: ( rule__Authors__Group_2__0 )*
            {
             before(grammarAccess.getAuthorsAccess().getGroup_2()); 
            // InternalSlideOMatic.g:2282:2: ( rule__Authors__Group_2__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==77) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalSlideOMatic.g:2282:3: rule__Authors__Group_2__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Authors__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
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
    // InternalSlideOMatic.g:2291:1: rule__Authors__Group_2__0 : rule__Authors__Group_2__0__Impl rule__Authors__Group_2__1 ;
    public final void rule__Authors__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2295:1: ( rule__Authors__Group_2__0__Impl rule__Authors__Group_2__1 )
            // InternalSlideOMatic.g:2296:2: rule__Authors__Group_2__0__Impl rule__Authors__Group_2__1
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
    // InternalSlideOMatic.g:2303:1: rule__Authors__Group_2__0__Impl : ( ',' ) ;
    public final void rule__Authors__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2307:1: ( ( ',' ) )
            // InternalSlideOMatic.g:2308:1: ( ',' )
            {
            // InternalSlideOMatic.g:2308:1: ( ',' )
            // InternalSlideOMatic.g:2309:2: ','
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
    // InternalSlideOMatic.g:2318:1: rule__Authors__Group_2__1 : rule__Authors__Group_2__1__Impl ;
    public final void rule__Authors__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2322:1: ( rule__Authors__Group_2__1__Impl )
            // InternalSlideOMatic.g:2323:2: rule__Authors__Group_2__1__Impl
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
    // InternalSlideOMatic.g:2329:1: rule__Authors__Group_2__1__Impl : ( ( rule__Authors__NamesAssignment_2_1 ) ) ;
    public final void rule__Authors__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2333:1: ( ( ( rule__Authors__NamesAssignment_2_1 ) ) )
            // InternalSlideOMatic.g:2334:1: ( ( rule__Authors__NamesAssignment_2_1 ) )
            {
            // InternalSlideOMatic.g:2334:1: ( ( rule__Authors__NamesAssignment_2_1 ) )
            // InternalSlideOMatic.g:2335:2: ( rule__Authors__NamesAssignment_2_1 )
            {
             before(grammarAccess.getAuthorsAccess().getNamesAssignment_2_1()); 
            // InternalSlideOMatic.g:2336:2: ( rule__Authors__NamesAssignment_2_1 )
            // InternalSlideOMatic.g:2336:3: rule__Authors__NamesAssignment_2_1
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
    // InternalSlideOMatic.g:2345:1: rule__Institute__Group__0 : rule__Institute__Group__0__Impl rule__Institute__Group__1 ;
    public final void rule__Institute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2349:1: ( rule__Institute__Group__0__Impl rule__Institute__Group__1 )
            // InternalSlideOMatic.g:2350:2: rule__Institute__Group__0__Impl rule__Institute__Group__1
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
    // InternalSlideOMatic.g:2357:1: rule__Institute__Group__0__Impl : ( 'institute' ) ;
    public final void rule__Institute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2361:1: ( ( 'institute' ) )
            // InternalSlideOMatic.g:2362:1: ( 'institute' )
            {
            // InternalSlideOMatic.g:2362:1: ( 'institute' )
            // InternalSlideOMatic.g:2363:2: 'institute'
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
    // InternalSlideOMatic.g:2372:1: rule__Institute__Group__1 : rule__Institute__Group__1__Impl ;
    public final void rule__Institute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2376:1: ( rule__Institute__Group__1__Impl )
            // InternalSlideOMatic.g:2377:2: rule__Institute__Group__1__Impl
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
    // InternalSlideOMatic.g:2383:1: rule__Institute__Group__1__Impl : ( ( rule__Institute__NameAssignment_1 ) ) ;
    public final void rule__Institute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2387:1: ( ( ( rule__Institute__NameAssignment_1 ) ) )
            // InternalSlideOMatic.g:2388:1: ( ( rule__Institute__NameAssignment_1 ) )
            {
            // InternalSlideOMatic.g:2388:1: ( ( rule__Institute__NameAssignment_1 ) )
            // InternalSlideOMatic.g:2389:2: ( rule__Institute__NameAssignment_1 )
            {
             before(grammarAccess.getInstituteAccess().getNameAssignment_1()); 
            // InternalSlideOMatic.g:2390:2: ( rule__Institute__NameAssignment_1 )
            // InternalSlideOMatic.g:2390:3: rule__Institute__NameAssignment_1
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
    // InternalSlideOMatic.g:2399:1: rule__Date__Group__0 : rule__Date__Group__0__Impl rule__Date__Group__1 ;
    public final void rule__Date__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2403:1: ( rule__Date__Group__0__Impl rule__Date__Group__1 )
            // InternalSlideOMatic.g:2404:2: rule__Date__Group__0__Impl rule__Date__Group__1
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
    // InternalSlideOMatic.g:2411:1: rule__Date__Group__0__Impl : ( 'date' ) ;
    public final void rule__Date__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2415:1: ( ( 'date' ) )
            // InternalSlideOMatic.g:2416:1: ( 'date' )
            {
            // InternalSlideOMatic.g:2416:1: ( 'date' )
            // InternalSlideOMatic.g:2417:2: 'date'
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
    // InternalSlideOMatic.g:2426:1: rule__Date__Group__1 : rule__Date__Group__1__Impl ;
    public final void rule__Date__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2430:1: ( rule__Date__Group__1__Impl )
            // InternalSlideOMatic.g:2431:2: rule__Date__Group__1__Impl
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
    // InternalSlideOMatic.g:2437:1: rule__Date__Group__1__Impl : ( ( rule__Date__Alternatives_1 ) ) ;
    public final void rule__Date__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2441:1: ( ( ( rule__Date__Alternatives_1 ) ) )
            // InternalSlideOMatic.g:2442:1: ( ( rule__Date__Alternatives_1 ) )
            {
            // InternalSlideOMatic.g:2442:1: ( ( rule__Date__Alternatives_1 ) )
            // InternalSlideOMatic.g:2443:2: ( rule__Date__Alternatives_1 )
            {
             before(grammarAccess.getDateAccess().getAlternatives_1()); 
            // InternalSlideOMatic.g:2444:2: ( rule__Date__Alternatives_1 )
            // InternalSlideOMatic.g:2444:3: rule__Date__Alternatives_1
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
    // InternalSlideOMatic.g:2453:1: rule__Date__Group_1_1__0 : rule__Date__Group_1_1__0__Impl rule__Date__Group_1_1__1 ;
    public final void rule__Date__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2457:1: ( rule__Date__Group_1_1__0__Impl rule__Date__Group_1_1__1 )
            // InternalSlideOMatic.g:2458:2: rule__Date__Group_1_1__0__Impl rule__Date__Group_1_1__1
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
    // InternalSlideOMatic.g:2465:1: rule__Date__Group_1_1__0__Impl : ( () ) ;
    public final void rule__Date__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2469:1: ( ( () ) )
            // InternalSlideOMatic.g:2470:1: ( () )
            {
            // InternalSlideOMatic.g:2470:1: ( () )
            // InternalSlideOMatic.g:2471:2: ()
            {
             before(grammarAccess.getDateAccess().getCompileDateAction_1_1_0()); 
            // InternalSlideOMatic.g:2472:2: ()
            // InternalSlideOMatic.g:2472:3: 
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
    // InternalSlideOMatic.g:2480:1: rule__Date__Group_1_1__1 : rule__Date__Group_1_1__1__Impl ;
    public final void rule__Date__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2484:1: ( rule__Date__Group_1_1__1__Impl )
            // InternalSlideOMatic.g:2485:2: rule__Date__Group_1_1__1__Impl
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
    // InternalSlideOMatic.g:2491:1: rule__Date__Group_1_1__1__Impl : ( '*' ) ;
    public final void rule__Date__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2495:1: ( ( '*' ) )
            // InternalSlideOMatic.g:2496:1: ( '*' )
            {
            // InternalSlideOMatic.g:2496:1: ( '*' )
            // InternalSlideOMatic.g:2497:2: '*'
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
    // InternalSlideOMatic.g:2507:1: rule__Slide__Group__0 : rule__Slide__Group__0__Impl rule__Slide__Group__1 ;
    public final void rule__Slide__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2511:1: ( rule__Slide__Group__0__Impl rule__Slide__Group__1 )
            // InternalSlideOMatic.g:2512:2: rule__Slide__Group__0__Impl rule__Slide__Group__1
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
    // InternalSlideOMatic.g:2519:1: rule__Slide__Group__0__Impl : ( 'slide' ) ;
    public final void rule__Slide__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2523:1: ( ( 'slide' ) )
            // InternalSlideOMatic.g:2524:1: ( 'slide' )
            {
            // InternalSlideOMatic.g:2524:1: ( 'slide' )
            // InternalSlideOMatic.g:2525:2: 'slide'
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
    // InternalSlideOMatic.g:2534:1: rule__Slide__Group__1 : rule__Slide__Group__1__Impl rule__Slide__Group__2 ;
    public final void rule__Slide__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2538:1: ( rule__Slide__Group__1__Impl rule__Slide__Group__2 )
            // InternalSlideOMatic.g:2539:2: rule__Slide__Group__1__Impl rule__Slide__Group__2
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
    // InternalSlideOMatic.g:2546:1: rule__Slide__Group__1__Impl : ( ( rule__Slide__Alternatives_1 )? ) ;
    public final void rule__Slide__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2550:1: ( ( ( rule__Slide__Alternatives_1 )? ) )
            // InternalSlideOMatic.g:2551:1: ( ( rule__Slide__Alternatives_1 )? )
            {
            // InternalSlideOMatic.g:2551:1: ( ( rule__Slide__Alternatives_1 )? )
            // InternalSlideOMatic.g:2552:2: ( rule__Slide__Alternatives_1 )?
            {
             before(grammarAccess.getSlideAccess().getAlternatives_1()); 
            // InternalSlideOMatic.g:2553:2: ( rule__Slide__Alternatives_1 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_STRING||LA29_0==80||(LA29_0>=82 && LA29_0<=83)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalSlideOMatic.g:2553:3: rule__Slide__Alternatives_1
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
    // InternalSlideOMatic.g:2561:1: rule__Slide__Group__2 : rule__Slide__Group__2__Impl rule__Slide__Group__3 ;
    public final void rule__Slide__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2565:1: ( rule__Slide__Group__2__Impl rule__Slide__Group__3 )
            // InternalSlideOMatic.g:2566:2: rule__Slide__Group__2__Impl rule__Slide__Group__3
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
    // InternalSlideOMatic.g:2573:1: rule__Slide__Group__2__Impl : ( '{' ) ;
    public final void rule__Slide__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2577:1: ( ( '{' ) )
            // InternalSlideOMatic.g:2578:1: ( '{' )
            {
            // InternalSlideOMatic.g:2578:1: ( '{' )
            // InternalSlideOMatic.g:2579:2: '{'
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
    // InternalSlideOMatic.g:2588:1: rule__Slide__Group__3 : rule__Slide__Group__3__Impl rule__Slide__Group__4 ;
    public final void rule__Slide__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2592:1: ( rule__Slide__Group__3__Impl rule__Slide__Group__4 )
            // InternalSlideOMatic.g:2593:2: rule__Slide__Group__3__Impl rule__Slide__Group__4
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
    // InternalSlideOMatic.g:2600:1: rule__Slide__Group__3__Impl : ( ( ( rule__Slide__ContentsAssignment_3 ) ) ( ( rule__Slide__ContentsAssignment_3 )* ) ) ;
    public final void rule__Slide__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2604:1: ( ( ( ( rule__Slide__ContentsAssignment_3 ) ) ( ( rule__Slide__ContentsAssignment_3 )* ) ) )
            // InternalSlideOMatic.g:2605:1: ( ( ( rule__Slide__ContentsAssignment_3 ) ) ( ( rule__Slide__ContentsAssignment_3 )* ) )
            {
            // InternalSlideOMatic.g:2605:1: ( ( ( rule__Slide__ContentsAssignment_3 ) ) ( ( rule__Slide__ContentsAssignment_3 )* ) )
            // InternalSlideOMatic.g:2606:2: ( ( rule__Slide__ContentsAssignment_3 ) ) ( ( rule__Slide__ContentsAssignment_3 )* )
            {
            // InternalSlideOMatic.g:2606:2: ( ( rule__Slide__ContentsAssignment_3 ) )
            // InternalSlideOMatic.g:2607:3: ( rule__Slide__ContentsAssignment_3 )
            {
             before(grammarAccess.getSlideAccess().getContentsAssignment_3()); 
            // InternalSlideOMatic.g:2608:3: ( rule__Slide__ContentsAssignment_3 )
            // InternalSlideOMatic.g:2608:4: rule__Slide__ContentsAssignment_3
            {
            pushFollow(FOLLOW_17);
            rule__Slide__ContentsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSlideAccess().getContentsAssignment_3()); 

            }

            // InternalSlideOMatic.g:2611:2: ( ( rule__Slide__ContentsAssignment_3 )* )
            // InternalSlideOMatic.g:2612:3: ( rule__Slide__ContentsAssignment_3 )*
            {
             before(grammarAccess.getSlideAccess().getContentsAssignment_3()); 
            // InternalSlideOMatic.g:2613:3: ( rule__Slide__ContentsAssignment_3 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_STRING||(LA30_0>=84 && LA30_0<=87)||LA30_0==89||LA30_0==94||LA30_0==97||LA30_0==99||LA30_0==106) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalSlideOMatic.g:2613:4: rule__Slide__ContentsAssignment_3
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Slide__ContentsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
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
    // InternalSlideOMatic.g:2622:1: rule__Slide__Group__4 : rule__Slide__Group__4__Impl ;
    public final void rule__Slide__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2626:1: ( rule__Slide__Group__4__Impl )
            // InternalSlideOMatic.g:2627:2: rule__Slide__Group__4__Impl
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
    // InternalSlideOMatic.g:2633:1: rule__Slide__Group__4__Impl : ( '}' ) ;
    public final void rule__Slide__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2637:1: ( ( '}' ) )
            // InternalSlideOMatic.g:2638:1: ( '}' )
            {
            // InternalSlideOMatic.g:2638:1: ( '}' )
            // InternalSlideOMatic.g:2639:2: '}'
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
    // InternalSlideOMatic.g:2649:1: rule__Slide__Group_1_0__0 : rule__Slide__Group_1_0__0__Impl rule__Slide__Group_1_0__1 ;
    public final void rule__Slide__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2653:1: ( rule__Slide__Group_1_0__0__Impl rule__Slide__Group_1_0__1 )
            // InternalSlideOMatic.g:2654:2: rule__Slide__Group_1_0__0__Impl rule__Slide__Group_1_0__1
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
    // InternalSlideOMatic.g:2661:1: rule__Slide__Group_1_0__0__Impl : ( ( rule__Slide__SecAssignment_1_0_0 ) ) ;
    public final void rule__Slide__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2665:1: ( ( ( rule__Slide__SecAssignment_1_0_0 ) ) )
            // InternalSlideOMatic.g:2666:1: ( ( rule__Slide__SecAssignment_1_0_0 ) )
            {
            // InternalSlideOMatic.g:2666:1: ( ( rule__Slide__SecAssignment_1_0_0 ) )
            // InternalSlideOMatic.g:2667:2: ( rule__Slide__SecAssignment_1_0_0 )
            {
             before(grammarAccess.getSlideAccess().getSecAssignment_1_0_0()); 
            // InternalSlideOMatic.g:2668:2: ( rule__Slide__SecAssignment_1_0_0 )
            // InternalSlideOMatic.g:2668:3: rule__Slide__SecAssignment_1_0_0
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
    // InternalSlideOMatic.g:2676:1: rule__Slide__Group_1_0__1 : rule__Slide__Group_1_0__1__Impl ;
    public final void rule__Slide__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2680:1: ( rule__Slide__Group_1_0__1__Impl )
            // InternalSlideOMatic.g:2681:2: rule__Slide__Group_1_0__1__Impl
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
    // InternalSlideOMatic.g:2687:1: rule__Slide__Group_1_0__1__Impl : ( ( rule__Slide__NameAssignment_1_0_1 ) ) ;
    public final void rule__Slide__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2691:1: ( ( ( rule__Slide__NameAssignment_1_0_1 ) ) )
            // InternalSlideOMatic.g:2692:1: ( ( rule__Slide__NameAssignment_1_0_1 ) )
            {
            // InternalSlideOMatic.g:2692:1: ( ( rule__Slide__NameAssignment_1_0_1 ) )
            // InternalSlideOMatic.g:2693:2: ( rule__Slide__NameAssignment_1_0_1 )
            {
             before(grammarAccess.getSlideAccess().getNameAssignment_1_0_1()); 
            // InternalSlideOMatic.g:2694:2: ( rule__Slide__NameAssignment_1_0_1 )
            // InternalSlideOMatic.g:2694:3: rule__Slide__NameAssignment_1_0_1
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
    // InternalSlideOMatic.g:2703:1: rule__Section__Group_0__0 : rule__Section__Group_0__0__Impl rule__Section__Group_0__1 ;
    public final void rule__Section__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2707:1: ( rule__Section__Group_0__0__Impl rule__Section__Group_0__1 )
            // InternalSlideOMatic.g:2708:2: rule__Section__Group_0__0__Impl rule__Section__Group_0__1
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
    // InternalSlideOMatic.g:2715:1: rule__Section__Group_0__0__Impl : ( () ) ;
    public final void rule__Section__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2719:1: ( ( () ) )
            // InternalSlideOMatic.g:2720:1: ( () )
            {
            // InternalSlideOMatic.g:2720:1: ( () )
            // InternalSlideOMatic.g:2721:2: ()
            {
             before(grammarAccess.getSectionAccess().getSecAction_0_0()); 
            // InternalSlideOMatic.g:2722:2: ()
            // InternalSlideOMatic.g:2722:3: 
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
    // InternalSlideOMatic.g:2730:1: rule__Section__Group_0__1 : rule__Section__Group_0__1__Impl ;
    public final void rule__Section__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2734:1: ( rule__Section__Group_0__1__Impl )
            // InternalSlideOMatic.g:2735:2: rule__Section__Group_0__1__Impl
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
    // InternalSlideOMatic.g:2741:1: rule__Section__Group_0__1__Impl : ( '*' ) ;
    public final void rule__Section__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2745:1: ( ( '*' ) )
            // InternalSlideOMatic.g:2746:1: ( '*' )
            {
            // InternalSlideOMatic.g:2746:1: ( '*' )
            // InternalSlideOMatic.g:2747:2: '*'
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
    // InternalSlideOMatic.g:2757:1: rule__Section__Group_1__0 : rule__Section__Group_1__0__Impl rule__Section__Group_1__1 ;
    public final void rule__Section__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2761:1: ( rule__Section__Group_1__0__Impl rule__Section__Group_1__1 )
            // InternalSlideOMatic.g:2762:2: rule__Section__Group_1__0__Impl rule__Section__Group_1__1
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
    // InternalSlideOMatic.g:2769:1: rule__Section__Group_1__0__Impl : ( () ) ;
    public final void rule__Section__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2773:1: ( ( () ) )
            // InternalSlideOMatic.g:2774:1: ( () )
            {
            // InternalSlideOMatic.g:2774:1: ( () )
            // InternalSlideOMatic.g:2775:2: ()
            {
             before(grammarAccess.getSectionAccess().getSubSecAction_1_0()); 
            // InternalSlideOMatic.g:2776:2: ()
            // InternalSlideOMatic.g:2776:3: 
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
    // InternalSlideOMatic.g:2784:1: rule__Section__Group_1__1 : rule__Section__Group_1__1__Impl ;
    public final void rule__Section__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2788:1: ( rule__Section__Group_1__1__Impl )
            // InternalSlideOMatic.g:2789:2: rule__Section__Group_1__1__Impl
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
    // InternalSlideOMatic.g:2795:1: rule__Section__Group_1__1__Impl : ( '**' ) ;
    public final void rule__Section__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2799:1: ( ( '**' ) )
            // InternalSlideOMatic.g:2800:1: ( '**' )
            {
            // InternalSlideOMatic.g:2800:1: ( '**' )
            // InternalSlideOMatic.g:2801:2: '**'
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
    // InternalSlideOMatic.g:2811:1: rule__Section__Group_2__0 : rule__Section__Group_2__0__Impl rule__Section__Group_2__1 ;
    public final void rule__Section__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2815:1: ( rule__Section__Group_2__0__Impl rule__Section__Group_2__1 )
            // InternalSlideOMatic.g:2816:2: rule__Section__Group_2__0__Impl rule__Section__Group_2__1
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
    // InternalSlideOMatic.g:2823:1: rule__Section__Group_2__0__Impl : ( () ) ;
    public final void rule__Section__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2827:1: ( ( () ) )
            // InternalSlideOMatic.g:2828:1: ( () )
            {
            // InternalSlideOMatic.g:2828:1: ( () )
            // InternalSlideOMatic.g:2829:2: ()
            {
             before(grammarAccess.getSectionAccess().getSubSubSecAction_2_0()); 
            // InternalSlideOMatic.g:2830:2: ()
            // InternalSlideOMatic.g:2830:3: 
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
    // InternalSlideOMatic.g:2838:1: rule__Section__Group_2__1 : rule__Section__Group_2__1__Impl ;
    public final void rule__Section__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2842:1: ( rule__Section__Group_2__1__Impl )
            // InternalSlideOMatic.g:2843:2: rule__Section__Group_2__1__Impl
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
    // InternalSlideOMatic.g:2849:1: rule__Section__Group_2__1__Impl : ( '***' ) ;
    public final void rule__Section__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2853:1: ( ( '***' ) )
            // InternalSlideOMatic.g:2854:1: ( '***' )
            {
            // InternalSlideOMatic.g:2854:1: ( '***' )
            // InternalSlideOMatic.g:2855:2: '***'
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
    // InternalSlideOMatic.g:2865:1: rule__Content__Group__0 : rule__Content__Group__0__Impl rule__Content__Group__1 ;
    public final void rule__Content__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2869:1: ( rule__Content__Group__0__Impl rule__Content__Group__1 )
            // InternalSlideOMatic.g:2870:2: rule__Content__Group__0__Impl rule__Content__Group__1
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
    // InternalSlideOMatic.g:2877:1: rule__Content__Group__0__Impl : ( ( rule__Content__Alternatives_0 ) ) ;
    public final void rule__Content__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2881:1: ( ( ( rule__Content__Alternatives_0 ) ) )
            // InternalSlideOMatic.g:2882:1: ( ( rule__Content__Alternatives_0 ) )
            {
            // InternalSlideOMatic.g:2882:1: ( ( rule__Content__Alternatives_0 ) )
            // InternalSlideOMatic.g:2883:2: ( rule__Content__Alternatives_0 )
            {
             before(grammarAccess.getContentAccess().getAlternatives_0()); 
            // InternalSlideOMatic.g:2884:2: ( rule__Content__Alternatives_0 )
            // InternalSlideOMatic.g:2884:3: rule__Content__Alternatives_0
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
    // InternalSlideOMatic.g:2892:1: rule__Content__Group__1 : rule__Content__Group__1__Impl ;
    public final void rule__Content__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2896:1: ( rule__Content__Group__1__Impl )
            // InternalSlideOMatic.g:2897:2: rule__Content__Group__1__Impl
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
    // InternalSlideOMatic.g:2903:1: rule__Content__Group__1__Impl : ( ( rule__Content__ClickAssignment_1 )? ) ;
    public final void rule__Content__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2907:1: ( ( ( rule__Content__ClickAssignment_1 )? ) )
            // InternalSlideOMatic.g:2908:1: ( ( rule__Content__ClickAssignment_1 )? )
            {
            // InternalSlideOMatic.g:2908:1: ( ( rule__Content__ClickAssignment_1 )? )
            // InternalSlideOMatic.g:2909:2: ( rule__Content__ClickAssignment_1 )?
            {
             before(grammarAccess.getContentAccess().getClickAssignment_1()); 
            // InternalSlideOMatic.g:2910:2: ( rule__Content__ClickAssignment_1 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==11) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalSlideOMatic.g:2910:3: rule__Content__ClickAssignment_1
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
    // InternalSlideOMatic.g:2919:1: rule__ToC__Group_0__0 : rule__ToC__Group_0__0__Impl rule__ToC__Group_0__1 ;
    public final void rule__ToC__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2923:1: ( rule__ToC__Group_0__0__Impl rule__ToC__Group_0__1 )
            // InternalSlideOMatic.g:2924:2: rule__ToC__Group_0__0__Impl rule__ToC__Group_0__1
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
    // InternalSlideOMatic.g:2931:1: rule__ToC__Group_0__0__Impl : ( () ) ;
    public final void rule__ToC__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2935:1: ( ( () ) )
            // InternalSlideOMatic.g:2936:1: ( () )
            {
            // InternalSlideOMatic.g:2936:1: ( () )
            // InternalSlideOMatic.g:2937:2: ()
            {
             before(grammarAccess.getToCAccess().getToCAction_0_0()); 
            // InternalSlideOMatic.g:2938:2: ()
            // InternalSlideOMatic.g:2938:3: 
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
    // InternalSlideOMatic.g:2946:1: rule__ToC__Group_0__1 : rule__ToC__Group_0__1__Impl ;
    public final void rule__ToC__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2950:1: ( rule__ToC__Group_0__1__Impl )
            // InternalSlideOMatic.g:2951:2: rule__ToC__Group_0__1__Impl
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
    // InternalSlideOMatic.g:2957:1: rule__ToC__Group_0__1__Impl : ( 'ToC' ) ;
    public final void rule__ToC__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2961:1: ( ( 'ToC' ) )
            // InternalSlideOMatic.g:2962:1: ( 'ToC' )
            {
            // InternalSlideOMatic.g:2962:1: ( 'ToC' )
            // InternalSlideOMatic.g:2963:2: 'ToC'
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
    // InternalSlideOMatic.g:2973:1: rule__ToC__Group_1__0 : rule__ToC__Group_1__0__Impl rule__ToC__Group_1__1 ;
    public final void rule__ToC__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2977:1: ( rule__ToC__Group_1__0__Impl rule__ToC__Group_1__1 )
            // InternalSlideOMatic.g:2978:2: rule__ToC__Group_1__0__Impl rule__ToC__Group_1__1
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
    // InternalSlideOMatic.g:2985:1: rule__ToC__Group_1__0__Impl : ( () ) ;
    public final void rule__ToC__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2989:1: ( ( () ) )
            // InternalSlideOMatic.g:2990:1: ( () )
            {
            // InternalSlideOMatic.g:2990:1: ( () )
            // InternalSlideOMatic.g:2991:2: ()
            {
             before(grammarAccess.getToCAccess().getCurrentSecToCAction_1_0()); 
            // InternalSlideOMatic.g:2992:2: ()
            // InternalSlideOMatic.g:2992:3: 
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
    // InternalSlideOMatic.g:3000:1: rule__ToC__Group_1__1 : rule__ToC__Group_1__1__Impl rule__ToC__Group_1__2 ;
    public final void rule__ToC__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3004:1: ( rule__ToC__Group_1__1__Impl rule__ToC__Group_1__2 )
            // InternalSlideOMatic.g:3005:2: rule__ToC__Group_1__1__Impl rule__ToC__Group_1__2
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
    // InternalSlideOMatic.g:3012:1: rule__ToC__Group_1__1__Impl : ( 'ToC' ) ;
    public final void rule__ToC__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3016:1: ( ( 'ToC' ) )
            // InternalSlideOMatic.g:3017:1: ( 'ToC' )
            {
            // InternalSlideOMatic.g:3017:1: ( 'ToC' )
            // InternalSlideOMatic.g:3018:2: 'ToC'
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
    // InternalSlideOMatic.g:3027:1: rule__ToC__Group_1__2 : rule__ToC__Group_1__2__Impl ;
    public final void rule__ToC__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3031:1: ( rule__ToC__Group_1__2__Impl )
            // InternalSlideOMatic.g:3032:2: rule__ToC__Group_1__2__Impl
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
    // InternalSlideOMatic.g:3038:1: rule__ToC__Group_1__2__Impl : ( '*' ) ;
    public final void rule__ToC__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3042:1: ( ( '*' ) )
            // InternalSlideOMatic.g:3043:1: ( '*' )
            {
            // InternalSlideOMatic.g:3043:1: ( '*' )
            // InternalSlideOMatic.g:3044:2: '*'
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
    // InternalSlideOMatic.g:3054:1: rule__Block__Group__0 : rule__Block__Group__0__Impl rule__Block__Group__1 ;
    public final void rule__Block__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3058:1: ( rule__Block__Group__0__Impl rule__Block__Group__1 )
            // InternalSlideOMatic.g:3059:2: rule__Block__Group__0__Impl rule__Block__Group__1
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
    // InternalSlideOMatic.g:3066:1: rule__Block__Group__0__Impl : ( 'block' ) ;
    public final void rule__Block__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3070:1: ( ( 'block' ) )
            // InternalSlideOMatic.g:3071:1: ( 'block' )
            {
            // InternalSlideOMatic.g:3071:1: ( 'block' )
            // InternalSlideOMatic.g:3072:2: 'block'
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
    // InternalSlideOMatic.g:3081:1: rule__Block__Group__1 : rule__Block__Group__1__Impl rule__Block__Group__2 ;
    public final void rule__Block__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3085:1: ( rule__Block__Group__1__Impl rule__Block__Group__2 )
            // InternalSlideOMatic.g:3086:2: rule__Block__Group__1__Impl rule__Block__Group__2
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
    // InternalSlideOMatic.g:3093:1: rule__Block__Group__1__Impl : ( ( rule__Block__NameAssignment_1 )? ) ;
    public final void rule__Block__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3097:1: ( ( ( rule__Block__NameAssignment_1 )? ) )
            // InternalSlideOMatic.g:3098:1: ( ( rule__Block__NameAssignment_1 )? )
            {
            // InternalSlideOMatic.g:3098:1: ( ( rule__Block__NameAssignment_1 )? )
            // InternalSlideOMatic.g:3099:2: ( rule__Block__NameAssignment_1 )?
            {
             before(grammarAccess.getBlockAccess().getNameAssignment_1()); 
            // InternalSlideOMatic.g:3100:2: ( rule__Block__NameAssignment_1 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_STRING) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalSlideOMatic.g:3100:3: rule__Block__NameAssignment_1
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
    // InternalSlideOMatic.g:3108:1: rule__Block__Group__2 : rule__Block__Group__2__Impl rule__Block__Group__3 ;
    public final void rule__Block__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3112:1: ( rule__Block__Group__2__Impl rule__Block__Group__3 )
            // InternalSlideOMatic.g:3113:2: rule__Block__Group__2__Impl rule__Block__Group__3
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
    // InternalSlideOMatic.g:3120:1: rule__Block__Group__2__Impl : ( '{' ) ;
    public final void rule__Block__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3124:1: ( ( '{' ) )
            // InternalSlideOMatic.g:3125:1: ( '{' )
            {
            // InternalSlideOMatic.g:3125:1: ( '{' )
            // InternalSlideOMatic.g:3126:2: '{'
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
    // InternalSlideOMatic.g:3135:1: rule__Block__Group__3 : rule__Block__Group__3__Impl rule__Block__Group__4 ;
    public final void rule__Block__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3139:1: ( rule__Block__Group__3__Impl rule__Block__Group__4 )
            // InternalSlideOMatic.g:3140:2: rule__Block__Group__3__Impl rule__Block__Group__4
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
    // InternalSlideOMatic.g:3147:1: rule__Block__Group__3__Impl : ( ( ( rule__Block__ContentAssignment_3 ) ) ( ( rule__Block__ContentAssignment_3 )* ) ) ;
    public final void rule__Block__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3151:1: ( ( ( ( rule__Block__ContentAssignment_3 ) ) ( ( rule__Block__ContentAssignment_3 )* ) ) )
            // InternalSlideOMatic.g:3152:1: ( ( ( rule__Block__ContentAssignment_3 ) ) ( ( rule__Block__ContentAssignment_3 )* ) )
            {
            // InternalSlideOMatic.g:3152:1: ( ( ( rule__Block__ContentAssignment_3 ) ) ( ( rule__Block__ContentAssignment_3 )* ) )
            // InternalSlideOMatic.g:3153:2: ( ( rule__Block__ContentAssignment_3 ) ) ( ( rule__Block__ContentAssignment_3 )* )
            {
            // InternalSlideOMatic.g:3153:2: ( ( rule__Block__ContentAssignment_3 ) )
            // InternalSlideOMatic.g:3154:3: ( rule__Block__ContentAssignment_3 )
            {
             before(grammarAccess.getBlockAccess().getContentAssignment_3()); 
            // InternalSlideOMatic.g:3155:3: ( rule__Block__ContentAssignment_3 )
            // InternalSlideOMatic.g:3155:4: rule__Block__ContentAssignment_3
            {
            pushFollow(FOLLOW_17);
            rule__Block__ContentAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getBlockAccess().getContentAssignment_3()); 

            }

            // InternalSlideOMatic.g:3158:2: ( ( rule__Block__ContentAssignment_3 )* )
            // InternalSlideOMatic.g:3159:3: ( rule__Block__ContentAssignment_3 )*
            {
             before(grammarAccess.getBlockAccess().getContentAssignment_3()); 
            // InternalSlideOMatic.g:3160:3: ( rule__Block__ContentAssignment_3 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==RULE_STRING||(LA33_0>=84 && LA33_0<=87)||LA33_0==89||LA33_0==94||LA33_0==97||LA33_0==99||LA33_0==106) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalSlideOMatic.g:3160:4: rule__Block__ContentAssignment_3
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Block__ContentAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
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
    // InternalSlideOMatic.g:3169:1: rule__Block__Group__4 : rule__Block__Group__4__Impl ;
    public final void rule__Block__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3173:1: ( rule__Block__Group__4__Impl )
            // InternalSlideOMatic.g:3174:2: rule__Block__Group__4__Impl
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
    // InternalSlideOMatic.g:3180:1: rule__Block__Group__4__Impl : ( '}' ) ;
    public final void rule__Block__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3184:1: ( ( '}' ) )
            // InternalSlideOMatic.g:3185:1: ( '}' )
            {
            // InternalSlideOMatic.g:3185:1: ( '}' )
            // InternalSlideOMatic.g:3186:2: '}'
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
    // InternalSlideOMatic.g:3196:1: rule__NumberedList__Group__0 : rule__NumberedList__Group__0__Impl rule__NumberedList__Group__1 ;
    public final void rule__NumberedList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3200:1: ( rule__NumberedList__Group__0__Impl rule__NumberedList__Group__1 )
            // InternalSlideOMatic.g:3201:2: rule__NumberedList__Group__0__Impl rule__NumberedList__Group__1
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
    // InternalSlideOMatic.g:3208:1: rule__NumberedList__Group__0__Impl : ( '#list' ) ;
    public final void rule__NumberedList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3212:1: ( ( '#list' ) )
            // InternalSlideOMatic.g:3213:1: ( '#list' )
            {
            // InternalSlideOMatic.g:3213:1: ( '#list' )
            // InternalSlideOMatic.g:3214:2: '#list'
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
    // InternalSlideOMatic.g:3223:1: rule__NumberedList__Group__1 : rule__NumberedList__Group__1__Impl ;
    public final void rule__NumberedList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3227:1: ( rule__NumberedList__Group__1__Impl )
            // InternalSlideOMatic.g:3228:2: rule__NumberedList__Group__1__Impl
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
    // InternalSlideOMatic.g:3234:1: rule__NumberedList__Group__1__Impl : ( ( ( rule__NumberedList__ItemsAssignment_1 ) ) ( ( rule__NumberedList__ItemsAssignment_1 )* ) ) ;
    public final void rule__NumberedList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3238:1: ( ( ( ( rule__NumberedList__ItemsAssignment_1 ) ) ( ( rule__NumberedList__ItemsAssignment_1 )* ) ) )
            // InternalSlideOMatic.g:3239:1: ( ( ( rule__NumberedList__ItemsAssignment_1 ) ) ( ( rule__NumberedList__ItemsAssignment_1 )* ) )
            {
            // InternalSlideOMatic.g:3239:1: ( ( ( rule__NumberedList__ItemsAssignment_1 ) ) ( ( rule__NumberedList__ItemsAssignment_1 )* ) )
            // InternalSlideOMatic.g:3240:2: ( ( rule__NumberedList__ItemsAssignment_1 ) ) ( ( rule__NumberedList__ItemsAssignment_1 )* )
            {
            // InternalSlideOMatic.g:3240:2: ( ( rule__NumberedList__ItemsAssignment_1 ) )
            // InternalSlideOMatic.g:3241:3: ( rule__NumberedList__ItemsAssignment_1 )
            {
             before(grammarAccess.getNumberedListAccess().getItemsAssignment_1()); 
            // InternalSlideOMatic.g:3242:3: ( rule__NumberedList__ItemsAssignment_1 )
            // InternalSlideOMatic.g:3242:4: rule__NumberedList__ItemsAssignment_1
            {
            pushFollow(FOLLOW_24);
            rule__NumberedList__ItemsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNumberedListAccess().getItemsAssignment_1()); 

            }

            // InternalSlideOMatic.g:3245:2: ( ( rule__NumberedList__ItemsAssignment_1 )* )
            // InternalSlideOMatic.g:3246:3: ( rule__NumberedList__ItemsAssignment_1 )*
            {
             before(grammarAccess.getNumberedListAccess().getItemsAssignment_1()); 
            // InternalSlideOMatic.g:3247:3: ( rule__NumberedList__ItemsAssignment_1 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==88) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalSlideOMatic.g:3247:4: rule__NumberedList__ItemsAssignment_1
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__NumberedList__ItemsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
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
    // InternalSlideOMatic.g:3257:1: rule__UnNumberedList__Group__0 : rule__UnNumberedList__Group__0__Impl rule__UnNumberedList__Group__1 ;
    public final void rule__UnNumberedList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3261:1: ( rule__UnNumberedList__Group__0__Impl rule__UnNumberedList__Group__1 )
            // InternalSlideOMatic.g:3262:2: rule__UnNumberedList__Group__0__Impl rule__UnNumberedList__Group__1
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
    // InternalSlideOMatic.g:3269:1: rule__UnNumberedList__Group__0__Impl : ( '&list' ) ;
    public final void rule__UnNumberedList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3273:1: ( ( '&list' ) )
            // InternalSlideOMatic.g:3274:1: ( '&list' )
            {
            // InternalSlideOMatic.g:3274:1: ( '&list' )
            // InternalSlideOMatic.g:3275:2: '&list'
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
    // InternalSlideOMatic.g:3284:1: rule__UnNumberedList__Group__1 : rule__UnNumberedList__Group__1__Impl ;
    public final void rule__UnNumberedList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3288:1: ( rule__UnNumberedList__Group__1__Impl )
            // InternalSlideOMatic.g:3289:2: rule__UnNumberedList__Group__1__Impl
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
    // InternalSlideOMatic.g:3295:1: rule__UnNumberedList__Group__1__Impl : ( ( ( rule__UnNumberedList__ItemsAssignment_1 ) ) ( ( rule__UnNumberedList__ItemsAssignment_1 )* ) ) ;
    public final void rule__UnNumberedList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3299:1: ( ( ( ( rule__UnNumberedList__ItemsAssignment_1 ) ) ( ( rule__UnNumberedList__ItemsAssignment_1 )* ) ) )
            // InternalSlideOMatic.g:3300:1: ( ( ( rule__UnNumberedList__ItemsAssignment_1 ) ) ( ( rule__UnNumberedList__ItemsAssignment_1 )* ) )
            {
            // InternalSlideOMatic.g:3300:1: ( ( ( rule__UnNumberedList__ItemsAssignment_1 ) ) ( ( rule__UnNumberedList__ItemsAssignment_1 )* ) )
            // InternalSlideOMatic.g:3301:2: ( ( rule__UnNumberedList__ItemsAssignment_1 ) ) ( ( rule__UnNumberedList__ItemsAssignment_1 )* )
            {
            // InternalSlideOMatic.g:3301:2: ( ( rule__UnNumberedList__ItemsAssignment_1 ) )
            // InternalSlideOMatic.g:3302:3: ( rule__UnNumberedList__ItemsAssignment_1 )
            {
             before(grammarAccess.getUnNumberedListAccess().getItemsAssignment_1()); 
            // InternalSlideOMatic.g:3303:3: ( rule__UnNumberedList__ItemsAssignment_1 )
            // InternalSlideOMatic.g:3303:4: rule__UnNumberedList__ItemsAssignment_1
            {
            pushFollow(FOLLOW_24);
            rule__UnNumberedList__ItemsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getUnNumberedListAccess().getItemsAssignment_1()); 

            }

            // InternalSlideOMatic.g:3306:2: ( ( rule__UnNumberedList__ItemsAssignment_1 )* )
            // InternalSlideOMatic.g:3307:3: ( rule__UnNumberedList__ItemsAssignment_1 )*
            {
             before(grammarAccess.getUnNumberedListAccess().getItemsAssignment_1()); 
            // InternalSlideOMatic.g:3308:3: ( rule__UnNumberedList__ItemsAssignment_1 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==88) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalSlideOMatic.g:3308:4: rule__UnNumberedList__ItemsAssignment_1
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__UnNumberedList__ItemsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
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
    // InternalSlideOMatic.g:3318:1: rule__ListItem__Group__0 : rule__ListItem__Group__0__Impl rule__ListItem__Group__1 ;
    public final void rule__ListItem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3322:1: ( rule__ListItem__Group__0__Impl rule__ListItem__Group__1 )
            // InternalSlideOMatic.g:3323:2: rule__ListItem__Group__0__Impl rule__ListItem__Group__1
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
    // InternalSlideOMatic.g:3330:1: rule__ListItem__Group__0__Impl : ( '-' ) ;
    public final void rule__ListItem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3334:1: ( ( '-' ) )
            // InternalSlideOMatic.g:3335:1: ( '-' )
            {
            // InternalSlideOMatic.g:3335:1: ( '-' )
            // InternalSlideOMatic.g:3336:2: '-'
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
    // InternalSlideOMatic.g:3345:1: rule__ListItem__Group__1 : rule__ListItem__Group__1__Impl rule__ListItem__Group__2 ;
    public final void rule__ListItem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3349:1: ( rule__ListItem__Group__1__Impl rule__ListItem__Group__2 )
            // InternalSlideOMatic.g:3350:2: rule__ListItem__Group__1__Impl rule__ListItem__Group__2
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
    // InternalSlideOMatic.g:3357:1: rule__ListItem__Group__1__Impl : ( ( rule__ListItem__ItemAssignment_1 ) ) ;
    public final void rule__ListItem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3361:1: ( ( ( rule__ListItem__ItemAssignment_1 ) ) )
            // InternalSlideOMatic.g:3362:1: ( ( rule__ListItem__ItemAssignment_1 ) )
            {
            // InternalSlideOMatic.g:3362:1: ( ( rule__ListItem__ItemAssignment_1 ) )
            // InternalSlideOMatic.g:3363:2: ( rule__ListItem__ItemAssignment_1 )
            {
             before(grammarAccess.getListItemAccess().getItemAssignment_1()); 
            // InternalSlideOMatic.g:3364:2: ( rule__ListItem__ItemAssignment_1 )
            // InternalSlideOMatic.g:3364:3: rule__ListItem__ItemAssignment_1
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
    // InternalSlideOMatic.g:3372:1: rule__ListItem__Group__2 : rule__ListItem__Group__2__Impl rule__ListItem__Group__3 ;
    public final void rule__ListItem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3376:1: ( rule__ListItem__Group__2__Impl rule__ListItem__Group__3 )
            // InternalSlideOMatic.g:3377:2: rule__ListItem__Group__2__Impl rule__ListItem__Group__3
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
    // InternalSlideOMatic.g:3384:1: rule__ListItem__Group__2__Impl : ( ( rule__ListItem__Group_2__0 )? ) ;
    public final void rule__ListItem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3388:1: ( ( ( rule__ListItem__Group_2__0 )? ) )
            // InternalSlideOMatic.g:3389:1: ( ( rule__ListItem__Group_2__0 )? )
            {
            // InternalSlideOMatic.g:3389:1: ( ( rule__ListItem__Group_2__0 )? )
            // InternalSlideOMatic.g:3390:2: ( rule__ListItem__Group_2__0 )?
            {
             before(grammarAccess.getListItemAccess().getGroup_2()); 
            // InternalSlideOMatic.g:3391:2: ( rule__ListItem__Group_2__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==73) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalSlideOMatic.g:3391:3: rule__ListItem__Group_2__0
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
    // InternalSlideOMatic.g:3399:1: rule__ListItem__Group__3 : rule__ListItem__Group__3__Impl ;
    public final void rule__ListItem__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3403:1: ( rule__ListItem__Group__3__Impl )
            // InternalSlideOMatic.g:3404:2: rule__ListItem__Group__3__Impl
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
    // InternalSlideOMatic.g:3410:1: rule__ListItem__Group__3__Impl : ( ( rule__ListItem__ClickAssignment_3 )? ) ;
    public final void rule__ListItem__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3414:1: ( ( ( rule__ListItem__ClickAssignment_3 )? ) )
            // InternalSlideOMatic.g:3415:1: ( ( rule__ListItem__ClickAssignment_3 )? )
            {
            // InternalSlideOMatic.g:3415:1: ( ( rule__ListItem__ClickAssignment_3 )? )
            // InternalSlideOMatic.g:3416:2: ( rule__ListItem__ClickAssignment_3 )?
            {
             before(grammarAccess.getListItemAccess().getClickAssignment_3()); 
            // InternalSlideOMatic.g:3417:2: ( rule__ListItem__ClickAssignment_3 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==11) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalSlideOMatic.g:3417:3: rule__ListItem__ClickAssignment_3
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
    // InternalSlideOMatic.g:3426:1: rule__ListItem__Group_2__0 : rule__ListItem__Group_2__0__Impl rule__ListItem__Group_2__1 ;
    public final void rule__ListItem__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3430:1: ( rule__ListItem__Group_2__0__Impl rule__ListItem__Group_2__1 )
            // InternalSlideOMatic.g:3431:2: rule__ListItem__Group_2__0__Impl rule__ListItem__Group_2__1
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
    // InternalSlideOMatic.g:3438:1: rule__ListItem__Group_2__0__Impl : ( '(' ) ;
    public final void rule__ListItem__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3442:1: ( ( '(' ) )
            // InternalSlideOMatic.g:3443:1: ( '(' )
            {
            // InternalSlideOMatic.g:3443:1: ( '(' )
            // InternalSlideOMatic.g:3444:2: '('
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
    // InternalSlideOMatic.g:3453:1: rule__ListItem__Group_2__1 : rule__ListItem__Group_2__1__Impl rule__ListItem__Group_2__2 ;
    public final void rule__ListItem__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3457:1: ( rule__ListItem__Group_2__1__Impl rule__ListItem__Group_2__2 )
            // InternalSlideOMatic.g:3458:2: rule__ListItem__Group_2__1__Impl rule__ListItem__Group_2__2
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
    // InternalSlideOMatic.g:3465:1: rule__ListItem__Group_2__1__Impl : ( ( rule__ListItem__NestedListAssignment_2_1 ) ) ;
    public final void rule__ListItem__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3469:1: ( ( ( rule__ListItem__NestedListAssignment_2_1 ) ) )
            // InternalSlideOMatic.g:3470:1: ( ( rule__ListItem__NestedListAssignment_2_1 ) )
            {
            // InternalSlideOMatic.g:3470:1: ( ( rule__ListItem__NestedListAssignment_2_1 ) )
            // InternalSlideOMatic.g:3471:2: ( rule__ListItem__NestedListAssignment_2_1 )
            {
             before(grammarAccess.getListItemAccess().getNestedListAssignment_2_1()); 
            // InternalSlideOMatic.g:3472:2: ( rule__ListItem__NestedListAssignment_2_1 )
            // InternalSlideOMatic.g:3472:3: rule__ListItem__NestedListAssignment_2_1
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
    // InternalSlideOMatic.g:3480:1: rule__ListItem__Group_2__2 : rule__ListItem__Group_2__2__Impl ;
    public final void rule__ListItem__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3484:1: ( rule__ListItem__Group_2__2__Impl )
            // InternalSlideOMatic.g:3485:2: rule__ListItem__Group_2__2__Impl
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
    // InternalSlideOMatic.g:3491:1: rule__ListItem__Group_2__2__Impl : ( ')' ) ;
    public final void rule__ListItem__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3495:1: ( ( ')' ) )
            // InternalSlideOMatic.g:3496:1: ( ')' )
            {
            // InternalSlideOMatic.g:3496:1: ( ')' )
            // InternalSlideOMatic.g:3497:2: ')'
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
    // InternalSlideOMatic.g:3507:1: rule__Image__Group__0 : rule__Image__Group__0__Impl rule__Image__Group__1 ;
    public final void rule__Image__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3511:1: ( rule__Image__Group__0__Impl rule__Image__Group__1 )
            // InternalSlideOMatic.g:3512:2: rule__Image__Group__0__Impl rule__Image__Group__1
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
    // InternalSlideOMatic.g:3519:1: rule__Image__Group__0__Impl : ( 'img' ) ;
    public final void rule__Image__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3523:1: ( ( 'img' ) )
            // InternalSlideOMatic.g:3524:1: ( 'img' )
            {
            // InternalSlideOMatic.g:3524:1: ( 'img' )
            // InternalSlideOMatic.g:3525:2: 'img'
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
    // InternalSlideOMatic.g:3534:1: rule__Image__Group__1 : rule__Image__Group__1__Impl rule__Image__Group__2 ;
    public final void rule__Image__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3538:1: ( rule__Image__Group__1__Impl rule__Image__Group__2 )
            // InternalSlideOMatic.g:3539:2: rule__Image__Group__1__Impl rule__Image__Group__2
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
    // InternalSlideOMatic.g:3546:1: rule__Image__Group__1__Impl : ( ( rule__Image__NameAssignment_1 ) ) ;
    public final void rule__Image__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3550:1: ( ( ( rule__Image__NameAssignment_1 ) ) )
            // InternalSlideOMatic.g:3551:1: ( ( rule__Image__NameAssignment_1 ) )
            {
            // InternalSlideOMatic.g:3551:1: ( ( rule__Image__NameAssignment_1 ) )
            // InternalSlideOMatic.g:3552:2: ( rule__Image__NameAssignment_1 )
            {
             before(grammarAccess.getImageAccess().getNameAssignment_1()); 
            // InternalSlideOMatic.g:3553:2: ( rule__Image__NameAssignment_1 )
            // InternalSlideOMatic.g:3553:3: rule__Image__NameAssignment_1
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
    // InternalSlideOMatic.g:3561:1: rule__Image__Group__2 : rule__Image__Group__2__Impl rule__Image__Group__3 ;
    public final void rule__Image__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3565:1: ( rule__Image__Group__2__Impl rule__Image__Group__3 )
            // InternalSlideOMatic.g:3566:2: rule__Image__Group__2__Impl rule__Image__Group__3
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
    // InternalSlideOMatic.g:3573:1: rule__Image__Group__2__Impl : ( 'src' ) ;
    public final void rule__Image__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3577:1: ( ( 'src' ) )
            // InternalSlideOMatic.g:3578:1: ( 'src' )
            {
            // InternalSlideOMatic.g:3578:1: ( 'src' )
            // InternalSlideOMatic.g:3579:2: 'src'
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
    // InternalSlideOMatic.g:3588:1: rule__Image__Group__3 : rule__Image__Group__3__Impl rule__Image__Group__4 ;
    public final void rule__Image__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3592:1: ( rule__Image__Group__3__Impl rule__Image__Group__4 )
            // InternalSlideOMatic.g:3593:2: rule__Image__Group__3__Impl rule__Image__Group__4
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
    // InternalSlideOMatic.g:3600:1: rule__Image__Group__3__Impl : ( ( rule__Image__SrcAssignment_3 ) ) ;
    public final void rule__Image__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3604:1: ( ( ( rule__Image__SrcAssignment_3 ) ) )
            // InternalSlideOMatic.g:3605:1: ( ( rule__Image__SrcAssignment_3 ) )
            {
            // InternalSlideOMatic.g:3605:1: ( ( rule__Image__SrcAssignment_3 ) )
            // InternalSlideOMatic.g:3606:2: ( rule__Image__SrcAssignment_3 )
            {
             before(grammarAccess.getImageAccess().getSrcAssignment_3()); 
            // InternalSlideOMatic.g:3607:2: ( rule__Image__SrcAssignment_3 )
            // InternalSlideOMatic.g:3607:3: rule__Image__SrcAssignment_3
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
    // InternalSlideOMatic.g:3615:1: rule__Image__Group__4 : rule__Image__Group__4__Impl rule__Image__Group__5 ;
    public final void rule__Image__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3619:1: ( rule__Image__Group__4__Impl rule__Image__Group__5 )
            // InternalSlideOMatic.g:3620:2: rule__Image__Group__4__Impl rule__Image__Group__5
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
    // InternalSlideOMatic.g:3627:1: rule__Image__Group__4__Impl : ( ( rule__Image__AlignmentAssignment_4 )? ) ;
    public final void rule__Image__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3631:1: ( ( ( rule__Image__AlignmentAssignment_4 )? ) )
            // InternalSlideOMatic.g:3632:1: ( ( rule__Image__AlignmentAssignment_4 )? )
            {
            // InternalSlideOMatic.g:3632:1: ( ( rule__Image__AlignmentAssignment_4 )? )
            // InternalSlideOMatic.g:3633:2: ( rule__Image__AlignmentAssignment_4 )?
            {
             before(grammarAccess.getImageAccess().getAlignmentAssignment_4()); 
            // InternalSlideOMatic.g:3634:2: ( rule__Image__AlignmentAssignment_4 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( ((LA38_0>=58 && LA38_0<=66)) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalSlideOMatic.g:3634:3: rule__Image__AlignmentAssignment_4
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
    // InternalSlideOMatic.g:3642:1: rule__Image__Group__5 : rule__Image__Group__5__Impl ;
    public final void rule__Image__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3646:1: ( rule__Image__Group__5__Impl )
            // InternalSlideOMatic.g:3647:2: rule__Image__Group__5__Impl
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
    // InternalSlideOMatic.g:3653:1: rule__Image__Group__5__Impl : ( ( rule__Image__SizeAssignment_5 ) ) ;
    public final void rule__Image__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3657:1: ( ( ( rule__Image__SizeAssignment_5 ) ) )
            // InternalSlideOMatic.g:3658:1: ( ( rule__Image__SizeAssignment_5 ) )
            {
            // InternalSlideOMatic.g:3658:1: ( ( rule__Image__SizeAssignment_5 ) )
            // InternalSlideOMatic.g:3659:2: ( rule__Image__SizeAssignment_5 )
            {
             before(grammarAccess.getImageAccess().getSizeAssignment_5()); 
            // InternalSlideOMatic.g:3660:2: ( rule__Image__SizeAssignment_5 )
            // InternalSlideOMatic.g:3660:3: rule__Image__SizeAssignment_5
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
    // InternalSlideOMatic.g:3669:1: rule__Size__Group_0__0 : rule__Size__Group_0__0__Impl rule__Size__Group_0__1 ;
    public final void rule__Size__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3673:1: ( rule__Size__Group_0__0__Impl rule__Size__Group_0__1 )
            // InternalSlideOMatic.g:3674:2: rule__Size__Group_0__0__Impl rule__Size__Group_0__1
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
    // InternalSlideOMatic.g:3681:1: rule__Size__Group_0__0__Impl : ( () ) ;
    public final void rule__Size__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3685:1: ( ( () ) )
            // InternalSlideOMatic.g:3686:1: ( () )
            {
            // InternalSlideOMatic.g:3686:1: ( () )
            // InternalSlideOMatic.g:3687:2: ()
            {
             before(grammarAccess.getSizeAccess().getProportionalSizeAction_0_0()); 
            // InternalSlideOMatic.g:3688:2: ()
            // InternalSlideOMatic.g:3688:3: 
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
    // InternalSlideOMatic.g:3696:1: rule__Size__Group_0__1 : rule__Size__Group_0__1__Impl rule__Size__Group_0__2 ;
    public final void rule__Size__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3700:1: ( rule__Size__Group_0__1__Impl rule__Size__Group_0__2 )
            // InternalSlideOMatic.g:3701:2: rule__Size__Group_0__1__Impl rule__Size__Group_0__2
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
    // InternalSlideOMatic.g:3708:1: rule__Size__Group_0__1__Impl : ( ( rule__Size__WayAssignment_0_1 ) ) ;
    public final void rule__Size__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3712:1: ( ( ( rule__Size__WayAssignment_0_1 ) ) )
            // InternalSlideOMatic.g:3713:1: ( ( rule__Size__WayAssignment_0_1 ) )
            {
            // InternalSlideOMatic.g:3713:1: ( ( rule__Size__WayAssignment_0_1 ) )
            // InternalSlideOMatic.g:3714:2: ( rule__Size__WayAssignment_0_1 )
            {
             before(grammarAccess.getSizeAccess().getWayAssignment_0_1()); 
            // InternalSlideOMatic.g:3715:2: ( rule__Size__WayAssignment_0_1 )
            // InternalSlideOMatic.g:3715:3: rule__Size__WayAssignment_0_1
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
    // InternalSlideOMatic.g:3723:1: rule__Size__Group_0__2 : rule__Size__Group_0__2__Impl rule__Size__Group_0__3 ;
    public final void rule__Size__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3727:1: ( rule__Size__Group_0__2__Impl rule__Size__Group_0__3 )
            // InternalSlideOMatic.g:3728:2: rule__Size__Group_0__2__Impl rule__Size__Group_0__3
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
    // InternalSlideOMatic.g:3735:1: rule__Size__Group_0__2__Impl : ( ( rule__Size__ScaleAssignment_0_2 ) ) ;
    public final void rule__Size__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3739:1: ( ( ( rule__Size__ScaleAssignment_0_2 ) ) )
            // InternalSlideOMatic.g:3740:1: ( ( rule__Size__ScaleAssignment_0_2 ) )
            {
            // InternalSlideOMatic.g:3740:1: ( ( rule__Size__ScaleAssignment_0_2 ) )
            // InternalSlideOMatic.g:3741:2: ( rule__Size__ScaleAssignment_0_2 )
            {
             before(grammarAccess.getSizeAccess().getScaleAssignment_0_2()); 
            // InternalSlideOMatic.g:3742:2: ( rule__Size__ScaleAssignment_0_2 )
            // InternalSlideOMatic.g:3742:3: rule__Size__ScaleAssignment_0_2
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
    // InternalSlideOMatic.g:3750:1: rule__Size__Group_0__3 : rule__Size__Group_0__3__Impl ;
    public final void rule__Size__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3754:1: ( rule__Size__Group_0__3__Impl )
            // InternalSlideOMatic.g:3755:2: rule__Size__Group_0__3__Impl
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
    // InternalSlideOMatic.g:3761:1: rule__Size__Group_0__3__Impl : ( '%' ) ;
    public final void rule__Size__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3765:1: ( ( '%' ) )
            // InternalSlideOMatic.g:3766:1: ( '%' )
            {
            // InternalSlideOMatic.g:3766:1: ( '%' )
            // InternalSlideOMatic.g:3767:2: '%'
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
    // InternalSlideOMatic.g:3777:1: rule__Size__Group_1__0 : rule__Size__Group_1__0__Impl rule__Size__Group_1__1 ;
    public final void rule__Size__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3781:1: ( rule__Size__Group_1__0__Impl rule__Size__Group_1__1 )
            // InternalSlideOMatic.g:3782:2: rule__Size__Group_1__0__Impl rule__Size__Group_1__1
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
    // InternalSlideOMatic.g:3789:1: rule__Size__Group_1__0__Impl : ( () ) ;
    public final void rule__Size__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3793:1: ( ( () ) )
            // InternalSlideOMatic.g:3794:1: ( () )
            {
            // InternalSlideOMatic.g:3794:1: ( () )
            // InternalSlideOMatic.g:3795:2: ()
            {
             before(grammarAccess.getSizeAccess().getExactSizeAction_1_0()); 
            // InternalSlideOMatic.g:3796:2: ()
            // InternalSlideOMatic.g:3796:3: 
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
    // InternalSlideOMatic.g:3804:1: rule__Size__Group_1__1 : rule__Size__Group_1__1__Impl rule__Size__Group_1__2 ;
    public final void rule__Size__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3808:1: ( rule__Size__Group_1__1__Impl rule__Size__Group_1__2 )
            // InternalSlideOMatic.g:3809:2: rule__Size__Group_1__1__Impl rule__Size__Group_1__2
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
    // InternalSlideOMatic.g:3816:1: rule__Size__Group_1__1__Impl : ( ( rule__Size__SizeAssignment_1_1 ) ) ;
    public final void rule__Size__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3820:1: ( ( ( rule__Size__SizeAssignment_1_1 ) ) )
            // InternalSlideOMatic.g:3821:1: ( ( rule__Size__SizeAssignment_1_1 ) )
            {
            // InternalSlideOMatic.g:3821:1: ( ( rule__Size__SizeAssignment_1_1 ) )
            // InternalSlideOMatic.g:3822:2: ( rule__Size__SizeAssignment_1_1 )
            {
             before(grammarAccess.getSizeAccess().getSizeAssignment_1_1()); 
            // InternalSlideOMatic.g:3823:2: ( rule__Size__SizeAssignment_1_1 )
            // InternalSlideOMatic.g:3823:3: rule__Size__SizeAssignment_1_1
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
    // InternalSlideOMatic.g:3831:1: rule__Size__Group_1__2 : rule__Size__Group_1__2__Impl ;
    public final void rule__Size__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3835:1: ( rule__Size__Group_1__2__Impl )
            // InternalSlideOMatic.g:3836:2: rule__Size__Group_1__2__Impl
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
    // InternalSlideOMatic.g:3842:1: rule__Size__Group_1__2__Impl : ( ( rule__Size__UnitAssignment_1_2 ) ) ;
    public final void rule__Size__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3846:1: ( ( ( rule__Size__UnitAssignment_1_2 ) ) )
            // InternalSlideOMatic.g:3847:1: ( ( rule__Size__UnitAssignment_1_2 ) )
            {
            // InternalSlideOMatic.g:3847:1: ( ( rule__Size__UnitAssignment_1_2 ) )
            // InternalSlideOMatic.g:3848:2: ( rule__Size__UnitAssignment_1_2 )
            {
             before(grammarAccess.getSizeAccess().getUnitAssignment_1_2()); 
            // InternalSlideOMatic.g:3849:2: ( rule__Size__UnitAssignment_1_2 )
            // InternalSlideOMatic.g:3849:3: rule__Size__UnitAssignment_1_2
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
    // InternalSlideOMatic.g:3858:1: rule__Way__Group_0__0 : rule__Way__Group_0__0__Impl rule__Way__Group_0__1 ;
    public final void rule__Way__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3862:1: ( rule__Way__Group_0__0__Impl rule__Way__Group_0__1 )
            // InternalSlideOMatic.g:3863:2: rule__Way__Group_0__0__Impl rule__Way__Group_0__1
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
    // InternalSlideOMatic.g:3870:1: rule__Way__Group_0__0__Impl : ( () ) ;
    public final void rule__Way__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3874:1: ( ( () ) )
            // InternalSlideOMatic.g:3875:1: ( () )
            {
            // InternalSlideOMatic.g:3875:1: ( () )
            // InternalSlideOMatic.g:3876:2: ()
            {
             before(grammarAccess.getWayAccess().getWidthAction_0_0()); 
            // InternalSlideOMatic.g:3877:2: ()
            // InternalSlideOMatic.g:3877:3: 
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
    // InternalSlideOMatic.g:3885:1: rule__Way__Group_0__1 : rule__Way__Group_0__1__Impl ;
    public final void rule__Way__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3889:1: ( rule__Way__Group_0__1__Impl )
            // InternalSlideOMatic.g:3890:2: rule__Way__Group_0__1__Impl
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
    // InternalSlideOMatic.g:3896:1: rule__Way__Group_0__1__Impl : ( 'width' ) ;
    public final void rule__Way__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3900:1: ( ( 'width' ) )
            // InternalSlideOMatic.g:3901:1: ( 'width' )
            {
            // InternalSlideOMatic.g:3901:1: ( 'width' )
            // InternalSlideOMatic.g:3902:2: 'width'
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
    // InternalSlideOMatic.g:3912:1: rule__Way__Group_1__0 : rule__Way__Group_1__0__Impl rule__Way__Group_1__1 ;
    public final void rule__Way__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3916:1: ( rule__Way__Group_1__0__Impl rule__Way__Group_1__1 )
            // InternalSlideOMatic.g:3917:2: rule__Way__Group_1__0__Impl rule__Way__Group_1__1
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
    // InternalSlideOMatic.g:3924:1: rule__Way__Group_1__0__Impl : ( () ) ;
    public final void rule__Way__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3928:1: ( ( () ) )
            // InternalSlideOMatic.g:3929:1: ( () )
            {
            // InternalSlideOMatic.g:3929:1: ( () )
            // InternalSlideOMatic.g:3930:2: ()
            {
             before(grammarAccess.getWayAccess().getHeightAction_1_0()); 
            // InternalSlideOMatic.g:3931:2: ()
            // InternalSlideOMatic.g:3931:3: 
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
    // InternalSlideOMatic.g:3939:1: rule__Way__Group_1__1 : rule__Way__Group_1__1__Impl ;
    public final void rule__Way__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3943:1: ( rule__Way__Group_1__1__Impl )
            // InternalSlideOMatic.g:3944:2: rule__Way__Group_1__1__Impl
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
    // InternalSlideOMatic.g:3950:1: rule__Way__Group_1__1__Impl : ( 'height' ) ;
    public final void rule__Way__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3954:1: ( ( 'height' ) )
            // InternalSlideOMatic.g:3955:1: ( 'height' )
            {
            // InternalSlideOMatic.g:3955:1: ( 'height' )
            // InternalSlideOMatic.g:3956:2: 'height'
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
    // InternalSlideOMatic.g:3966:1: rule__Table__Group__0 : rule__Table__Group__0__Impl rule__Table__Group__1 ;
    public final void rule__Table__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3970:1: ( rule__Table__Group__0__Impl rule__Table__Group__1 )
            // InternalSlideOMatic.g:3971:2: rule__Table__Group__0__Impl rule__Table__Group__1
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
    // InternalSlideOMatic.g:3978:1: rule__Table__Group__0__Impl : ( 'tab' ) ;
    public final void rule__Table__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3982:1: ( ( 'tab' ) )
            // InternalSlideOMatic.g:3983:1: ( 'tab' )
            {
            // InternalSlideOMatic.g:3983:1: ( 'tab' )
            // InternalSlideOMatic.g:3984:2: 'tab'
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
    // InternalSlideOMatic.g:3993:1: rule__Table__Group__1 : rule__Table__Group__1__Impl rule__Table__Group__2 ;
    public final void rule__Table__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3997:1: ( rule__Table__Group__1__Impl rule__Table__Group__2 )
            // InternalSlideOMatic.g:3998:2: rule__Table__Group__1__Impl rule__Table__Group__2
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
    // InternalSlideOMatic.g:4005:1: rule__Table__Group__1__Impl : ( ( rule__Table__NameAssignment_1 ) ) ;
    public final void rule__Table__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4009:1: ( ( ( rule__Table__NameAssignment_1 ) ) )
            // InternalSlideOMatic.g:4010:1: ( ( rule__Table__NameAssignment_1 ) )
            {
            // InternalSlideOMatic.g:4010:1: ( ( rule__Table__NameAssignment_1 ) )
            // InternalSlideOMatic.g:4011:2: ( rule__Table__NameAssignment_1 )
            {
             before(grammarAccess.getTableAccess().getNameAssignment_1()); 
            // InternalSlideOMatic.g:4012:2: ( rule__Table__NameAssignment_1 )
            // InternalSlideOMatic.g:4012:3: rule__Table__NameAssignment_1
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
    // InternalSlideOMatic.g:4020:1: rule__Table__Group__2 : rule__Table__Group__2__Impl rule__Table__Group__3 ;
    public final void rule__Table__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4024:1: ( rule__Table__Group__2__Impl rule__Table__Group__3 )
            // InternalSlideOMatic.g:4025:2: rule__Table__Group__2__Impl rule__Table__Group__3
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
    // InternalSlideOMatic.g:4032:1: rule__Table__Group__2__Impl : ( '[' ) ;
    public final void rule__Table__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4036:1: ( ( '[' ) )
            // InternalSlideOMatic.g:4037:1: ( '[' )
            {
            // InternalSlideOMatic.g:4037:1: ( '[' )
            // InternalSlideOMatic.g:4038:2: '['
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
    // InternalSlideOMatic.g:4047:1: rule__Table__Group__3 : rule__Table__Group__3__Impl rule__Table__Group__4 ;
    public final void rule__Table__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4051:1: ( rule__Table__Group__3__Impl rule__Table__Group__4 )
            // InternalSlideOMatic.g:4052:2: rule__Table__Group__3__Impl rule__Table__Group__4
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
    // InternalSlideOMatic.g:4059:1: rule__Table__Group__3__Impl : ( ( rule__Table__RowsAssignment_3 ) ) ;
    public final void rule__Table__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4063:1: ( ( ( rule__Table__RowsAssignment_3 ) ) )
            // InternalSlideOMatic.g:4064:1: ( ( rule__Table__RowsAssignment_3 ) )
            {
            // InternalSlideOMatic.g:4064:1: ( ( rule__Table__RowsAssignment_3 ) )
            // InternalSlideOMatic.g:4065:2: ( rule__Table__RowsAssignment_3 )
            {
             before(grammarAccess.getTableAccess().getRowsAssignment_3()); 
            // InternalSlideOMatic.g:4066:2: ( rule__Table__RowsAssignment_3 )
            // InternalSlideOMatic.g:4066:3: rule__Table__RowsAssignment_3
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
    // InternalSlideOMatic.g:4074:1: rule__Table__Group__4 : rule__Table__Group__4__Impl rule__Table__Group__5 ;
    public final void rule__Table__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4078:1: ( rule__Table__Group__4__Impl rule__Table__Group__5 )
            // InternalSlideOMatic.g:4079:2: rule__Table__Group__4__Impl rule__Table__Group__5
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
    // InternalSlideOMatic.g:4086:1: rule__Table__Group__4__Impl : ( ( rule__Table__Group_4__0 )* ) ;
    public final void rule__Table__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4090:1: ( ( ( rule__Table__Group_4__0 )* ) )
            // InternalSlideOMatic.g:4091:1: ( ( rule__Table__Group_4__0 )* )
            {
            // InternalSlideOMatic.g:4091:1: ( ( rule__Table__Group_4__0 )* )
            // InternalSlideOMatic.g:4092:2: ( rule__Table__Group_4__0 )*
            {
             before(grammarAccess.getTableAccess().getGroup_4()); 
            // InternalSlideOMatic.g:4093:2: ( rule__Table__Group_4__0 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==77) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalSlideOMatic.g:4093:3: rule__Table__Group_4__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Table__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop39;
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
    // InternalSlideOMatic.g:4101:1: rule__Table__Group__5 : rule__Table__Group__5__Impl ;
    public final void rule__Table__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4105:1: ( rule__Table__Group__5__Impl )
            // InternalSlideOMatic.g:4106:2: rule__Table__Group__5__Impl
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
    // InternalSlideOMatic.g:4112:1: rule__Table__Group__5__Impl : ( ']' ) ;
    public final void rule__Table__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4116:1: ( ( ']' ) )
            // InternalSlideOMatic.g:4117:1: ( ']' )
            {
            // InternalSlideOMatic.g:4117:1: ( ']' )
            // InternalSlideOMatic.g:4118:2: ']'
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
    // InternalSlideOMatic.g:4128:1: rule__Table__Group_4__0 : rule__Table__Group_4__0__Impl rule__Table__Group_4__1 ;
    public final void rule__Table__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4132:1: ( rule__Table__Group_4__0__Impl rule__Table__Group_4__1 )
            // InternalSlideOMatic.g:4133:2: rule__Table__Group_4__0__Impl rule__Table__Group_4__1
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
    // InternalSlideOMatic.g:4140:1: rule__Table__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Table__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4144:1: ( ( ',' ) )
            // InternalSlideOMatic.g:4145:1: ( ',' )
            {
            // InternalSlideOMatic.g:4145:1: ( ',' )
            // InternalSlideOMatic.g:4146:2: ','
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
    // InternalSlideOMatic.g:4155:1: rule__Table__Group_4__1 : rule__Table__Group_4__1__Impl ;
    public final void rule__Table__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4159:1: ( rule__Table__Group_4__1__Impl )
            // InternalSlideOMatic.g:4160:2: rule__Table__Group_4__1__Impl
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
    // InternalSlideOMatic.g:4166:1: rule__Table__Group_4__1__Impl : ( ( rule__Table__RowsAssignment_4_1 ) ) ;
    public final void rule__Table__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4170:1: ( ( ( rule__Table__RowsAssignment_4_1 ) ) )
            // InternalSlideOMatic.g:4171:1: ( ( rule__Table__RowsAssignment_4_1 ) )
            {
            // InternalSlideOMatic.g:4171:1: ( ( rule__Table__RowsAssignment_4_1 ) )
            // InternalSlideOMatic.g:4172:2: ( rule__Table__RowsAssignment_4_1 )
            {
             before(grammarAccess.getTableAccess().getRowsAssignment_4_1()); 
            // InternalSlideOMatic.g:4173:2: ( rule__Table__RowsAssignment_4_1 )
            // InternalSlideOMatic.g:4173:3: rule__Table__RowsAssignment_4_1
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
    // InternalSlideOMatic.g:4182:1: rule__TableRow__Group__0 : rule__TableRow__Group__0__Impl rule__TableRow__Group__1 ;
    public final void rule__TableRow__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4186:1: ( rule__TableRow__Group__0__Impl rule__TableRow__Group__1 )
            // InternalSlideOMatic.g:4187:2: rule__TableRow__Group__0__Impl rule__TableRow__Group__1
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
    // InternalSlideOMatic.g:4194:1: rule__TableRow__Group__0__Impl : ( '[' ) ;
    public final void rule__TableRow__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4198:1: ( ( '[' ) )
            // InternalSlideOMatic.g:4199:1: ( '[' )
            {
            // InternalSlideOMatic.g:4199:1: ( '[' )
            // InternalSlideOMatic.g:4200:2: '['
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
    // InternalSlideOMatic.g:4209:1: rule__TableRow__Group__1 : rule__TableRow__Group__1__Impl rule__TableRow__Group__2 ;
    public final void rule__TableRow__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4213:1: ( rule__TableRow__Group__1__Impl rule__TableRow__Group__2 )
            // InternalSlideOMatic.g:4214:2: rule__TableRow__Group__1__Impl rule__TableRow__Group__2
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
    // InternalSlideOMatic.g:4221:1: rule__TableRow__Group__1__Impl : ( ( rule__TableRow__ValuesAssignment_1 ) ) ;
    public final void rule__TableRow__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4225:1: ( ( ( rule__TableRow__ValuesAssignment_1 ) ) )
            // InternalSlideOMatic.g:4226:1: ( ( rule__TableRow__ValuesAssignment_1 ) )
            {
            // InternalSlideOMatic.g:4226:1: ( ( rule__TableRow__ValuesAssignment_1 ) )
            // InternalSlideOMatic.g:4227:2: ( rule__TableRow__ValuesAssignment_1 )
            {
             before(grammarAccess.getTableRowAccess().getValuesAssignment_1()); 
            // InternalSlideOMatic.g:4228:2: ( rule__TableRow__ValuesAssignment_1 )
            // InternalSlideOMatic.g:4228:3: rule__TableRow__ValuesAssignment_1
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
    // InternalSlideOMatic.g:4236:1: rule__TableRow__Group__2 : rule__TableRow__Group__2__Impl rule__TableRow__Group__3 ;
    public final void rule__TableRow__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4240:1: ( rule__TableRow__Group__2__Impl rule__TableRow__Group__3 )
            // InternalSlideOMatic.g:4241:2: rule__TableRow__Group__2__Impl rule__TableRow__Group__3
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
    // InternalSlideOMatic.g:4248:1: rule__TableRow__Group__2__Impl : ( ( rule__TableRow__Group_2__0 )* ) ;
    public final void rule__TableRow__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4252:1: ( ( ( rule__TableRow__Group_2__0 )* ) )
            // InternalSlideOMatic.g:4253:1: ( ( rule__TableRow__Group_2__0 )* )
            {
            // InternalSlideOMatic.g:4253:1: ( ( rule__TableRow__Group_2__0 )* )
            // InternalSlideOMatic.g:4254:2: ( rule__TableRow__Group_2__0 )*
            {
             before(grammarAccess.getTableRowAccess().getGroup_2()); 
            // InternalSlideOMatic.g:4255:2: ( rule__TableRow__Group_2__0 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==77) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalSlideOMatic.g:4255:3: rule__TableRow__Group_2__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__TableRow__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop40;
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
    // InternalSlideOMatic.g:4263:1: rule__TableRow__Group__3 : rule__TableRow__Group__3__Impl ;
    public final void rule__TableRow__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4267:1: ( rule__TableRow__Group__3__Impl )
            // InternalSlideOMatic.g:4268:2: rule__TableRow__Group__3__Impl
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
    // InternalSlideOMatic.g:4274:1: rule__TableRow__Group__3__Impl : ( ']' ) ;
    public final void rule__TableRow__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4278:1: ( ( ']' ) )
            // InternalSlideOMatic.g:4279:1: ( ']' )
            {
            // InternalSlideOMatic.g:4279:1: ( ']' )
            // InternalSlideOMatic.g:4280:2: ']'
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
    // InternalSlideOMatic.g:4290:1: rule__TableRow__Group_2__0 : rule__TableRow__Group_2__0__Impl rule__TableRow__Group_2__1 ;
    public final void rule__TableRow__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4294:1: ( rule__TableRow__Group_2__0__Impl rule__TableRow__Group_2__1 )
            // InternalSlideOMatic.g:4295:2: rule__TableRow__Group_2__0__Impl rule__TableRow__Group_2__1
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
    // InternalSlideOMatic.g:4302:1: rule__TableRow__Group_2__0__Impl : ( ',' ) ;
    public final void rule__TableRow__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4306:1: ( ( ',' ) )
            // InternalSlideOMatic.g:4307:1: ( ',' )
            {
            // InternalSlideOMatic.g:4307:1: ( ',' )
            // InternalSlideOMatic.g:4308:2: ','
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
    // InternalSlideOMatic.g:4317:1: rule__TableRow__Group_2__1 : rule__TableRow__Group_2__1__Impl ;
    public final void rule__TableRow__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4321:1: ( rule__TableRow__Group_2__1__Impl )
            // InternalSlideOMatic.g:4322:2: rule__TableRow__Group_2__1__Impl
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
    // InternalSlideOMatic.g:4328:1: rule__TableRow__Group_2__1__Impl : ( ( rule__TableRow__ValuesAssignment_2_1 ) ) ;
    public final void rule__TableRow__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4332:1: ( ( ( rule__TableRow__ValuesAssignment_2_1 ) ) )
            // InternalSlideOMatic.g:4333:1: ( ( rule__TableRow__ValuesAssignment_2_1 ) )
            {
            // InternalSlideOMatic.g:4333:1: ( ( rule__TableRow__ValuesAssignment_2_1 ) )
            // InternalSlideOMatic.g:4334:2: ( rule__TableRow__ValuesAssignment_2_1 )
            {
             before(grammarAccess.getTableRowAccess().getValuesAssignment_2_1()); 
            // InternalSlideOMatic.g:4335:2: ( rule__TableRow__ValuesAssignment_2_1 )
            // InternalSlideOMatic.g:4335:3: rule__TableRow__ValuesAssignment_2_1
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


    // $ANTLR start "rule__Code__Group_0__0"
    // InternalSlideOMatic.g:4344:1: rule__Code__Group_0__0 : rule__Code__Group_0__0__Impl rule__Code__Group_0__1 ;
    public final void rule__Code__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4348:1: ( rule__Code__Group_0__0__Impl rule__Code__Group_0__1 )
            // InternalSlideOMatic.g:4349:2: rule__Code__Group_0__0__Impl rule__Code__Group_0__1
            {
            pushFollow(FOLLOW_38);
            rule__Code__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Code__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Code__Group_0__0"


    // $ANTLR start "rule__Code__Group_0__0__Impl"
    // InternalSlideOMatic.g:4356:1: rule__Code__Group_0__0__Impl : ( () ) ;
    public final void rule__Code__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4360:1: ( ( () ) )
            // InternalSlideOMatic.g:4361:1: ( () )
            {
            // InternalSlideOMatic.g:4361:1: ( () )
            // InternalSlideOMatic.g:4362:2: ()
            {
             before(grammarAccess.getCodeAccess().getInlineCodeAction_0_0()); 
            // InternalSlideOMatic.g:4363:2: ()
            // InternalSlideOMatic.g:4363:3: 
            {
            }

             after(grammarAccess.getCodeAccess().getInlineCodeAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Code__Group_0__0__Impl"


    // $ANTLR start "rule__Code__Group_0__1"
    // InternalSlideOMatic.g:4371:1: rule__Code__Group_0__1 : rule__Code__Group_0__1__Impl rule__Code__Group_0__2 ;
    public final void rule__Code__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4375:1: ( rule__Code__Group_0__1__Impl rule__Code__Group_0__2 )
            // InternalSlideOMatic.g:4376:2: rule__Code__Group_0__1__Impl rule__Code__Group_0__2
            {
            pushFollow(FOLLOW_28);
            rule__Code__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Code__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Code__Group_0__1"


    // $ANTLR start "rule__Code__Group_0__1__Impl"
    // InternalSlideOMatic.g:4383:1: rule__Code__Group_0__1__Impl : ( 'code' ) ;
    public final void rule__Code__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4387:1: ( ( 'code' ) )
            // InternalSlideOMatic.g:4388:1: ( 'code' )
            {
            // InternalSlideOMatic.g:4388:1: ( 'code' )
            // InternalSlideOMatic.g:4389:2: 'code'
            {
             before(grammarAccess.getCodeAccess().getCodeKeyword_0_1()); 
            match(input,97,FOLLOW_2); 
             after(grammarAccess.getCodeAccess().getCodeKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Code__Group_0__1__Impl"


    // $ANTLR start "rule__Code__Group_0__2"
    // InternalSlideOMatic.g:4398:1: rule__Code__Group_0__2 : rule__Code__Group_0__2__Impl rule__Code__Group_0__3 ;
    public final void rule__Code__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4402:1: ( rule__Code__Group_0__2__Impl rule__Code__Group_0__3 )
            // InternalSlideOMatic.g:4403:2: rule__Code__Group_0__2__Impl rule__Code__Group_0__3
            {
            pushFollow(FOLLOW_3);
            rule__Code__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Code__Group_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Code__Group_0__2"


    // $ANTLR start "rule__Code__Group_0__2__Impl"
    // InternalSlideOMatic.g:4410:1: rule__Code__Group_0__2__Impl : ( ( rule__Code__LangAssignment_0_2 ) ) ;
    public final void rule__Code__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4414:1: ( ( ( rule__Code__LangAssignment_0_2 ) ) )
            // InternalSlideOMatic.g:4415:1: ( ( rule__Code__LangAssignment_0_2 ) )
            {
            // InternalSlideOMatic.g:4415:1: ( ( rule__Code__LangAssignment_0_2 ) )
            // InternalSlideOMatic.g:4416:2: ( rule__Code__LangAssignment_0_2 )
            {
             before(grammarAccess.getCodeAccess().getLangAssignment_0_2()); 
            // InternalSlideOMatic.g:4417:2: ( rule__Code__LangAssignment_0_2 )
            // InternalSlideOMatic.g:4417:3: rule__Code__LangAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__Code__LangAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getCodeAccess().getLangAssignment_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Code__Group_0__2__Impl"


    // $ANTLR start "rule__Code__Group_0__3"
    // InternalSlideOMatic.g:4425:1: rule__Code__Group_0__3 : rule__Code__Group_0__3__Impl rule__Code__Group_0__4 ;
    public final void rule__Code__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4429:1: ( rule__Code__Group_0__3__Impl rule__Code__Group_0__4 )
            // InternalSlideOMatic.g:4430:2: rule__Code__Group_0__3__Impl rule__Code__Group_0__4
            {
            pushFollow(FOLLOW_39);
            rule__Code__Group_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Code__Group_0__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Code__Group_0__3"


    // $ANTLR start "rule__Code__Group_0__3__Impl"
    // InternalSlideOMatic.g:4437:1: rule__Code__Group_0__3__Impl : ( ( rule__Code__CodeAssignment_0_3 ) ) ;
    public final void rule__Code__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4441:1: ( ( ( rule__Code__CodeAssignment_0_3 ) ) )
            // InternalSlideOMatic.g:4442:1: ( ( rule__Code__CodeAssignment_0_3 ) )
            {
            // InternalSlideOMatic.g:4442:1: ( ( rule__Code__CodeAssignment_0_3 ) )
            // InternalSlideOMatic.g:4443:2: ( rule__Code__CodeAssignment_0_3 )
            {
             before(grammarAccess.getCodeAccess().getCodeAssignment_0_3()); 
            // InternalSlideOMatic.g:4444:2: ( rule__Code__CodeAssignment_0_3 )
            // InternalSlideOMatic.g:4444:3: rule__Code__CodeAssignment_0_3
            {
            pushFollow(FOLLOW_2);
            rule__Code__CodeAssignment_0_3();

            state._fsp--;


            }

             after(grammarAccess.getCodeAccess().getCodeAssignment_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Code__Group_0__3__Impl"


    // $ANTLR start "rule__Code__Group_0__4"
    // InternalSlideOMatic.g:4452:1: rule__Code__Group_0__4 : rule__Code__Group_0__4__Impl ;
    public final void rule__Code__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4456:1: ( rule__Code__Group_0__4__Impl )
            // InternalSlideOMatic.g:4457:2: rule__Code__Group_0__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Code__Group_0__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Code__Group_0__4"


    // $ANTLR start "rule__Code__Group_0__4__Impl"
    // InternalSlideOMatic.g:4463:1: rule__Code__Group_0__4__Impl : ( 'end' ) ;
    public final void rule__Code__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4467:1: ( ( 'end' ) )
            // InternalSlideOMatic.g:4468:1: ( 'end' )
            {
            // InternalSlideOMatic.g:4468:1: ( 'end' )
            // InternalSlideOMatic.g:4469:2: 'end'
            {
             before(grammarAccess.getCodeAccess().getEndKeyword_0_4()); 
            match(input,98,FOLLOW_2); 
             after(grammarAccess.getCodeAccess().getEndKeyword_0_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Code__Group_0__4__Impl"


    // $ANTLR start "rule__Code__Group_1__0"
    // InternalSlideOMatic.g:4479:1: rule__Code__Group_1__0 : rule__Code__Group_1__0__Impl rule__Code__Group_1__1 ;
    public final void rule__Code__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4483:1: ( rule__Code__Group_1__0__Impl rule__Code__Group_1__1 )
            // InternalSlideOMatic.g:4484:2: rule__Code__Group_1__0__Impl rule__Code__Group_1__1
            {
            pushFollow(FOLLOW_40);
            rule__Code__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Code__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Code__Group_1__0"


    // $ANTLR start "rule__Code__Group_1__0__Impl"
    // InternalSlideOMatic.g:4491:1: rule__Code__Group_1__0__Impl : ( () ) ;
    public final void rule__Code__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4495:1: ( ( () ) )
            // InternalSlideOMatic.g:4496:1: ( () )
            {
            // InternalSlideOMatic.g:4496:1: ( () )
            // InternalSlideOMatic.g:4497:2: ()
            {
             before(grammarAccess.getCodeAccess().getFileCodeAction_1_0()); 
            // InternalSlideOMatic.g:4498:2: ()
            // InternalSlideOMatic.g:4498:3: 
            {
            }

             after(grammarAccess.getCodeAccess().getFileCodeAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Code__Group_1__0__Impl"


    // $ANTLR start "rule__Code__Group_1__1"
    // InternalSlideOMatic.g:4506:1: rule__Code__Group_1__1 : rule__Code__Group_1__1__Impl rule__Code__Group_1__2 ;
    public final void rule__Code__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4510:1: ( rule__Code__Group_1__1__Impl rule__Code__Group_1__2 )
            // InternalSlideOMatic.g:4511:2: rule__Code__Group_1__1__Impl rule__Code__Group_1__2
            {
            pushFollow(FOLLOW_28);
            rule__Code__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Code__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Code__Group_1__1"


    // $ANTLR start "rule__Code__Group_1__1__Impl"
    // InternalSlideOMatic.g:4518:1: rule__Code__Group_1__1__Impl : ( 'filecode' ) ;
    public final void rule__Code__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4522:1: ( ( 'filecode' ) )
            // InternalSlideOMatic.g:4523:1: ( 'filecode' )
            {
            // InternalSlideOMatic.g:4523:1: ( 'filecode' )
            // InternalSlideOMatic.g:4524:2: 'filecode'
            {
             before(grammarAccess.getCodeAccess().getFilecodeKeyword_1_1()); 
            match(input,99,FOLLOW_2); 
             after(grammarAccess.getCodeAccess().getFilecodeKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Code__Group_1__1__Impl"


    // $ANTLR start "rule__Code__Group_1__2"
    // InternalSlideOMatic.g:4533:1: rule__Code__Group_1__2 : rule__Code__Group_1__2__Impl rule__Code__Group_1__3 ;
    public final void rule__Code__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4537:1: ( rule__Code__Group_1__2__Impl rule__Code__Group_1__3 )
            // InternalSlideOMatic.g:4538:2: rule__Code__Group_1__2__Impl rule__Code__Group_1__3
            {
            pushFollow(FOLLOW_3);
            rule__Code__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Code__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Code__Group_1__2"


    // $ANTLR start "rule__Code__Group_1__2__Impl"
    // InternalSlideOMatic.g:4545:1: rule__Code__Group_1__2__Impl : ( ( rule__Code__LangAssignment_1_2 ) ) ;
    public final void rule__Code__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4549:1: ( ( ( rule__Code__LangAssignment_1_2 ) ) )
            // InternalSlideOMatic.g:4550:1: ( ( rule__Code__LangAssignment_1_2 ) )
            {
            // InternalSlideOMatic.g:4550:1: ( ( rule__Code__LangAssignment_1_2 ) )
            // InternalSlideOMatic.g:4551:2: ( rule__Code__LangAssignment_1_2 )
            {
             before(grammarAccess.getCodeAccess().getLangAssignment_1_2()); 
            // InternalSlideOMatic.g:4552:2: ( rule__Code__LangAssignment_1_2 )
            // InternalSlideOMatic.g:4552:3: rule__Code__LangAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Code__LangAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getCodeAccess().getLangAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Code__Group_1__2__Impl"


    // $ANTLR start "rule__Code__Group_1__3"
    // InternalSlideOMatic.g:4560:1: rule__Code__Group_1__3 : rule__Code__Group_1__3__Impl rule__Code__Group_1__4 ;
    public final void rule__Code__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4564:1: ( rule__Code__Group_1__3__Impl rule__Code__Group_1__4 )
            // InternalSlideOMatic.g:4565:2: rule__Code__Group_1__3__Impl rule__Code__Group_1__4
            {
            pushFollow(FOLLOW_41);
            rule__Code__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Code__Group_1__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Code__Group_1__3"


    // $ANTLR start "rule__Code__Group_1__3__Impl"
    // InternalSlideOMatic.g:4572:1: rule__Code__Group_1__3__Impl : ( ( rule__Code__SrcAssignment_1_3 ) ) ;
    public final void rule__Code__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4576:1: ( ( ( rule__Code__SrcAssignment_1_3 ) ) )
            // InternalSlideOMatic.g:4577:1: ( ( rule__Code__SrcAssignment_1_3 ) )
            {
            // InternalSlideOMatic.g:4577:1: ( ( rule__Code__SrcAssignment_1_3 ) )
            // InternalSlideOMatic.g:4578:2: ( rule__Code__SrcAssignment_1_3 )
            {
             before(grammarAccess.getCodeAccess().getSrcAssignment_1_3()); 
            // InternalSlideOMatic.g:4579:2: ( rule__Code__SrcAssignment_1_3 )
            // InternalSlideOMatic.g:4579:3: rule__Code__SrcAssignment_1_3
            {
            pushFollow(FOLLOW_2);
            rule__Code__SrcAssignment_1_3();

            state._fsp--;


            }

             after(grammarAccess.getCodeAccess().getSrcAssignment_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Code__Group_1__3__Impl"


    // $ANTLR start "rule__Code__Group_1__4"
    // InternalSlideOMatic.g:4587:1: rule__Code__Group_1__4 : rule__Code__Group_1__4__Impl rule__Code__Group_1__5 ;
    public final void rule__Code__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4591:1: ( rule__Code__Group_1__4__Impl rule__Code__Group_1__5 )
            // InternalSlideOMatic.g:4592:2: rule__Code__Group_1__4__Impl rule__Code__Group_1__5
            {
            pushFollow(FOLLOW_41);
            rule__Code__Group_1__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Code__Group_1__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Code__Group_1__4"


    // $ANTLR start "rule__Code__Group_1__4__Impl"
    // InternalSlideOMatic.g:4599:1: rule__Code__Group_1__4__Impl : ( ( rule__Code__Group_1_4__0 )? ) ;
    public final void rule__Code__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4603:1: ( ( ( rule__Code__Group_1_4__0 )? ) )
            // InternalSlideOMatic.g:4604:1: ( ( rule__Code__Group_1_4__0 )? )
            {
            // InternalSlideOMatic.g:4604:1: ( ( rule__Code__Group_1_4__0 )? )
            // InternalSlideOMatic.g:4605:2: ( rule__Code__Group_1_4__0 )?
            {
             before(grammarAccess.getCodeAccess().getGroup_1_4()); 
            // InternalSlideOMatic.g:4606:2: ( rule__Code__Group_1_4__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==100) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalSlideOMatic.g:4606:3: rule__Code__Group_1_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Code__Group_1_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCodeAccess().getGroup_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Code__Group_1__4__Impl"


    // $ANTLR start "rule__Code__Group_1__5"
    // InternalSlideOMatic.g:4614:1: rule__Code__Group_1__5 : rule__Code__Group_1__5__Impl ;
    public final void rule__Code__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4618:1: ( rule__Code__Group_1__5__Impl )
            // InternalSlideOMatic.g:4619:2: rule__Code__Group_1__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Code__Group_1__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Code__Group_1__5"


    // $ANTLR start "rule__Code__Group_1__5__Impl"
    // InternalSlideOMatic.g:4625:1: rule__Code__Group_1__5__Impl : ( 'end' ) ;
    public final void rule__Code__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4629:1: ( ( 'end' ) )
            // InternalSlideOMatic.g:4630:1: ( 'end' )
            {
            // InternalSlideOMatic.g:4630:1: ( 'end' )
            // InternalSlideOMatic.g:4631:2: 'end'
            {
             before(grammarAccess.getCodeAccess().getEndKeyword_1_5()); 
            match(input,98,FOLLOW_2); 
             after(grammarAccess.getCodeAccess().getEndKeyword_1_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Code__Group_1__5__Impl"


    // $ANTLR start "rule__Code__Group_1_4__0"
    // InternalSlideOMatic.g:4641:1: rule__Code__Group_1_4__0 : rule__Code__Group_1_4__0__Impl rule__Code__Group_1_4__1 ;
    public final void rule__Code__Group_1_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4645:1: ( rule__Code__Group_1_4__0__Impl rule__Code__Group_1_4__1 )
            // InternalSlideOMatic.g:4646:2: rule__Code__Group_1_4__0__Impl rule__Code__Group_1_4__1
            {
            pushFollow(FOLLOW_36);
            rule__Code__Group_1_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Code__Group_1_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Code__Group_1_4__0"


    // $ANTLR start "rule__Code__Group_1_4__0__Impl"
    // InternalSlideOMatic.g:4653:1: rule__Code__Group_1_4__0__Impl : ( 'show' ) ;
    public final void rule__Code__Group_1_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4657:1: ( ( 'show' ) )
            // InternalSlideOMatic.g:4658:1: ( 'show' )
            {
            // InternalSlideOMatic.g:4658:1: ( 'show' )
            // InternalSlideOMatic.g:4659:2: 'show'
            {
             before(grammarAccess.getCodeAccess().getShowKeyword_1_4_0()); 
            match(input,100,FOLLOW_2); 
             after(grammarAccess.getCodeAccess().getShowKeyword_1_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Code__Group_1_4__0__Impl"


    // $ANTLR start "rule__Code__Group_1_4__1"
    // InternalSlideOMatic.g:4668:1: rule__Code__Group_1_4__1 : rule__Code__Group_1_4__1__Impl rule__Code__Group_1_4__2 ;
    public final void rule__Code__Group_1_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4672:1: ( rule__Code__Group_1_4__1__Impl rule__Code__Group_1_4__2 )
            // InternalSlideOMatic.g:4673:2: rule__Code__Group_1_4__1__Impl rule__Code__Group_1_4__2
            {
            pushFollow(FOLLOW_32);
            rule__Code__Group_1_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Code__Group_1_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Code__Group_1_4__1"


    // $ANTLR start "rule__Code__Group_1_4__1__Impl"
    // InternalSlideOMatic.g:4680:1: rule__Code__Group_1_4__1__Impl : ( '[' ) ;
    public final void rule__Code__Group_1_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4684:1: ( ( '[' ) )
            // InternalSlideOMatic.g:4685:1: ( '[' )
            {
            // InternalSlideOMatic.g:4685:1: ( '[' )
            // InternalSlideOMatic.g:4686:2: '['
            {
             before(grammarAccess.getCodeAccess().getLeftSquareBracketKeyword_1_4_1()); 
            match(input,95,FOLLOW_2); 
             after(grammarAccess.getCodeAccess().getLeftSquareBracketKeyword_1_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Code__Group_1_4__1__Impl"


    // $ANTLR start "rule__Code__Group_1_4__2"
    // InternalSlideOMatic.g:4695:1: rule__Code__Group_1_4__2 : rule__Code__Group_1_4__2__Impl rule__Code__Group_1_4__3 ;
    public final void rule__Code__Group_1_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4699:1: ( rule__Code__Group_1_4__2__Impl rule__Code__Group_1_4__3 )
            // InternalSlideOMatic.g:4700:2: rule__Code__Group_1_4__2__Impl rule__Code__Group_1_4__3
            {
            pushFollow(FOLLOW_42);
            rule__Code__Group_1_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Code__Group_1_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Code__Group_1_4__2"


    // $ANTLR start "rule__Code__Group_1_4__2__Impl"
    // InternalSlideOMatic.g:4707:1: rule__Code__Group_1_4__2__Impl : ( ( rule__Code__LinesAssignment_1_4_2 ) ) ;
    public final void rule__Code__Group_1_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4711:1: ( ( ( rule__Code__LinesAssignment_1_4_2 ) ) )
            // InternalSlideOMatic.g:4712:1: ( ( rule__Code__LinesAssignment_1_4_2 ) )
            {
            // InternalSlideOMatic.g:4712:1: ( ( rule__Code__LinesAssignment_1_4_2 ) )
            // InternalSlideOMatic.g:4713:2: ( rule__Code__LinesAssignment_1_4_2 )
            {
             before(grammarAccess.getCodeAccess().getLinesAssignment_1_4_2()); 
            // InternalSlideOMatic.g:4714:2: ( rule__Code__LinesAssignment_1_4_2 )
            // InternalSlideOMatic.g:4714:3: rule__Code__LinesAssignment_1_4_2
            {
            pushFollow(FOLLOW_2);
            rule__Code__LinesAssignment_1_4_2();

            state._fsp--;


            }

             after(grammarAccess.getCodeAccess().getLinesAssignment_1_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Code__Group_1_4__2__Impl"


    // $ANTLR start "rule__Code__Group_1_4__3"
    // InternalSlideOMatic.g:4722:1: rule__Code__Group_1_4__3 : rule__Code__Group_1_4__3__Impl rule__Code__Group_1_4__4 ;
    public final void rule__Code__Group_1_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4726:1: ( rule__Code__Group_1_4__3__Impl rule__Code__Group_1_4__4 )
            // InternalSlideOMatic.g:4727:2: rule__Code__Group_1_4__3__Impl rule__Code__Group_1_4__4
            {
            pushFollow(FOLLOW_11);
            rule__Code__Group_1_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Code__Group_1_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Code__Group_1_4__3"


    // $ANTLR start "rule__Code__Group_1_4__3__Impl"
    // InternalSlideOMatic.g:4734:1: rule__Code__Group_1_4__3__Impl : ( ']' ) ;
    public final void rule__Code__Group_1_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4738:1: ( ( ']' ) )
            // InternalSlideOMatic.g:4739:1: ( ']' )
            {
            // InternalSlideOMatic.g:4739:1: ( ']' )
            // InternalSlideOMatic.g:4740:2: ']'
            {
             before(grammarAccess.getCodeAccess().getRightSquareBracketKeyword_1_4_3()); 
            match(input,96,FOLLOW_2); 
             after(grammarAccess.getCodeAccess().getRightSquareBracketKeyword_1_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Code__Group_1_4__3__Impl"


    // $ANTLR start "rule__Code__Group_1_4__4"
    // InternalSlideOMatic.g:4749:1: rule__Code__Group_1_4__4 : rule__Code__Group_1_4__4__Impl ;
    public final void rule__Code__Group_1_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4753:1: ( rule__Code__Group_1_4__4__Impl )
            // InternalSlideOMatic.g:4754:2: rule__Code__Group_1_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Code__Group_1_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Code__Group_1_4__4"


    // $ANTLR start "rule__Code__Group_1_4__4__Impl"
    // InternalSlideOMatic.g:4760:1: rule__Code__Group_1_4__4__Impl : ( ( rule__Code__Group_1_4_4__0 )* ) ;
    public final void rule__Code__Group_1_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4764:1: ( ( ( rule__Code__Group_1_4_4__0 )* ) )
            // InternalSlideOMatic.g:4765:1: ( ( rule__Code__Group_1_4_4__0 )* )
            {
            // InternalSlideOMatic.g:4765:1: ( ( rule__Code__Group_1_4_4__0 )* )
            // InternalSlideOMatic.g:4766:2: ( rule__Code__Group_1_4_4__0 )*
            {
             before(grammarAccess.getCodeAccess().getGroup_1_4_4()); 
            // InternalSlideOMatic.g:4767:2: ( rule__Code__Group_1_4_4__0 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==77) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalSlideOMatic.g:4767:3: rule__Code__Group_1_4_4__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Code__Group_1_4_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

             after(grammarAccess.getCodeAccess().getGroup_1_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Code__Group_1_4__4__Impl"


    // $ANTLR start "rule__Code__Group_1_4_4__0"
    // InternalSlideOMatic.g:4776:1: rule__Code__Group_1_4_4__0 : rule__Code__Group_1_4_4__0__Impl rule__Code__Group_1_4_4__1 ;
    public final void rule__Code__Group_1_4_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4780:1: ( rule__Code__Group_1_4_4__0__Impl rule__Code__Group_1_4_4__1 )
            // InternalSlideOMatic.g:4781:2: rule__Code__Group_1_4_4__0__Impl rule__Code__Group_1_4_4__1
            {
            pushFollow(FOLLOW_36);
            rule__Code__Group_1_4_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Code__Group_1_4_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Code__Group_1_4_4__0"


    // $ANTLR start "rule__Code__Group_1_4_4__0__Impl"
    // InternalSlideOMatic.g:4788:1: rule__Code__Group_1_4_4__0__Impl : ( ',' ) ;
    public final void rule__Code__Group_1_4_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4792:1: ( ( ',' ) )
            // InternalSlideOMatic.g:4793:1: ( ',' )
            {
            // InternalSlideOMatic.g:4793:1: ( ',' )
            // InternalSlideOMatic.g:4794:2: ','
            {
             before(grammarAccess.getCodeAccess().getCommaKeyword_1_4_4_0()); 
            match(input,77,FOLLOW_2); 
             after(grammarAccess.getCodeAccess().getCommaKeyword_1_4_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Code__Group_1_4_4__0__Impl"


    // $ANTLR start "rule__Code__Group_1_4_4__1"
    // InternalSlideOMatic.g:4803:1: rule__Code__Group_1_4_4__1 : rule__Code__Group_1_4_4__1__Impl rule__Code__Group_1_4_4__2 ;
    public final void rule__Code__Group_1_4_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4807:1: ( rule__Code__Group_1_4_4__1__Impl rule__Code__Group_1_4_4__2 )
            // InternalSlideOMatic.g:4808:2: rule__Code__Group_1_4_4__1__Impl rule__Code__Group_1_4_4__2
            {
            pushFollow(FOLLOW_32);
            rule__Code__Group_1_4_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Code__Group_1_4_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Code__Group_1_4_4__1"


    // $ANTLR start "rule__Code__Group_1_4_4__1__Impl"
    // InternalSlideOMatic.g:4815:1: rule__Code__Group_1_4_4__1__Impl : ( '[' ) ;
    public final void rule__Code__Group_1_4_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4819:1: ( ( '[' ) )
            // InternalSlideOMatic.g:4820:1: ( '[' )
            {
            // InternalSlideOMatic.g:4820:1: ( '[' )
            // InternalSlideOMatic.g:4821:2: '['
            {
             before(grammarAccess.getCodeAccess().getLeftSquareBracketKeyword_1_4_4_1()); 
            match(input,95,FOLLOW_2); 
             after(grammarAccess.getCodeAccess().getLeftSquareBracketKeyword_1_4_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Code__Group_1_4_4__1__Impl"


    // $ANTLR start "rule__Code__Group_1_4_4__2"
    // InternalSlideOMatic.g:4830:1: rule__Code__Group_1_4_4__2 : rule__Code__Group_1_4_4__2__Impl rule__Code__Group_1_4_4__3 ;
    public final void rule__Code__Group_1_4_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4834:1: ( rule__Code__Group_1_4_4__2__Impl rule__Code__Group_1_4_4__3 )
            // InternalSlideOMatic.g:4835:2: rule__Code__Group_1_4_4__2__Impl rule__Code__Group_1_4_4__3
            {
            pushFollow(FOLLOW_42);
            rule__Code__Group_1_4_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Code__Group_1_4_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Code__Group_1_4_4__2"


    // $ANTLR start "rule__Code__Group_1_4_4__2__Impl"
    // InternalSlideOMatic.g:4842:1: rule__Code__Group_1_4_4__2__Impl : ( ( rule__Code__LinesAssignment_1_4_4_2 ) ) ;
    public final void rule__Code__Group_1_4_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4846:1: ( ( ( rule__Code__LinesAssignment_1_4_4_2 ) ) )
            // InternalSlideOMatic.g:4847:1: ( ( rule__Code__LinesAssignment_1_4_4_2 ) )
            {
            // InternalSlideOMatic.g:4847:1: ( ( rule__Code__LinesAssignment_1_4_4_2 ) )
            // InternalSlideOMatic.g:4848:2: ( rule__Code__LinesAssignment_1_4_4_2 )
            {
             before(grammarAccess.getCodeAccess().getLinesAssignment_1_4_4_2()); 
            // InternalSlideOMatic.g:4849:2: ( rule__Code__LinesAssignment_1_4_4_2 )
            // InternalSlideOMatic.g:4849:3: rule__Code__LinesAssignment_1_4_4_2
            {
            pushFollow(FOLLOW_2);
            rule__Code__LinesAssignment_1_4_4_2();

            state._fsp--;


            }

             after(grammarAccess.getCodeAccess().getLinesAssignment_1_4_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Code__Group_1_4_4__2__Impl"


    // $ANTLR start "rule__Code__Group_1_4_4__3"
    // InternalSlideOMatic.g:4857:1: rule__Code__Group_1_4_4__3 : rule__Code__Group_1_4_4__3__Impl ;
    public final void rule__Code__Group_1_4_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4861:1: ( rule__Code__Group_1_4_4__3__Impl )
            // InternalSlideOMatic.g:4862:2: rule__Code__Group_1_4_4__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Code__Group_1_4_4__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Code__Group_1_4_4__3"


    // $ANTLR start "rule__Code__Group_1_4_4__3__Impl"
    // InternalSlideOMatic.g:4868:1: rule__Code__Group_1_4_4__3__Impl : ( ']' ) ;
    public final void rule__Code__Group_1_4_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4872:1: ( ( ']' ) )
            // InternalSlideOMatic.g:4873:1: ( ']' )
            {
            // InternalSlideOMatic.g:4873:1: ( ']' )
            // InternalSlideOMatic.g:4874:2: ']'
            {
             before(grammarAccess.getCodeAccess().getRightSquareBracketKeyword_1_4_4_3()); 
            match(input,96,FOLLOW_2); 
             after(grammarAccess.getCodeAccess().getRightSquareBracketKeyword_1_4_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Code__Group_1_4_4__3__Impl"


    // $ANTLR start "rule__LineSequence__Group__0"
    // InternalSlideOMatic.g:4884:1: rule__LineSequence__Group__0 : rule__LineSequence__Group__0__Impl rule__LineSequence__Group__1 ;
    public final void rule__LineSequence__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4888:1: ( rule__LineSequence__Group__0__Impl rule__LineSequence__Group__1 )
            // InternalSlideOMatic.g:4889:2: rule__LineSequence__Group__0__Impl rule__LineSequence__Group__1
            {
            pushFollow(FOLLOW_43);
            rule__LineSequence__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LineSequence__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineSequence__Group__0"


    // $ANTLR start "rule__LineSequence__Group__0__Impl"
    // InternalSlideOMatic.g:4896:1: rule__LineSequence__Group__0__Impl : ( ( rule__LineSequence__LowerAssignment_0 ) ) ;
    public final void rule__LineSequence__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4900:1: ( ( ( rule__LineSequence__LowerAssignment_0 ) ) )
            // InternalSlideOMatic.g:4901:1: ( ( rule__LineSequence__LowerAssignment_0 ) )
            {
            // InternalSlideOMatic.g:4901:1: ( ( rule__LineSequence__LowerAssignment_0 ) )
            // InternalSlideOMatic.g:4902:2: ( rule__LineSequence__LowerAssignment_0 )
            {
             before(grammarAccess.getLineSequenceAccess().getLowerAssignment_0()); 
            // InternalSlideOMatic.g:4903:2: ( rule__LineSequence__LowerAssignment_0 )
            // InternalSlideOMatic.g:4903:3: rule__LineSequence__LowerAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__LineSequence__LowerAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getLineSequenceAccess().getLowerAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineSequence__Group__0__Impl"


    // $ANTLR start "rule__LineSequence__Group__1"
    // InternalSlideOMatic.g:4911:1: rule__LineSequence__Group__1 : rule__LineSequence__Group__1__Impl rule__LineSequence__Group__2 ;
    public final void rule__LineSequence__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4915:1: ( rule__LineSequence__Group__1__Impl rule__LineSequence__Group__2 )
            // InternalSlideOMatic.g:4916:2: rule__LineSequence__Group__1__Impl rule__LineSequence__Group__2
            {
            pushFollow(FOLLOW_43);
            rule__LineSequence__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LineSequence__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineSequence__Group__1"


    // $ANTLR start "rule__LineSequence__Group__1__Impl"
    // InternalSlideOMatic.g:4923:1: rule__LineSequence__Group__1__Impl : ( ( rule__LineSequence__Group_1__0 )? ) ;
    public final void rule__LineSequence__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4927:1: ( ( ( rule__LineSequence__Group_1__0 )? ) )
            // InternalSlideOMatic.g:4928:1: ( ( rule__LineSequence__Group_1__0 )? )
            {
            // InternalSlideOMatic.g:4928:1: ( ( rule__LineSequence__Group_1__0 )? )
            // InternalSlideOMatic.g:4929:2: ( rule__LineSequence__Group_1__0 )?
            {
             before(grammarAccess.getLineSequenceAccess().getGroup_1()); 
            // InternalSlideOMatic.g:4930:2: ( rule__LineSequence__Group_1__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==101) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalSlideOMatic.g:4930:3: rule__LineSequence__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LineSequence__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLineSequenceAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineSequence__Group__1__Impl"


    // $ANTLR start "rule__LineSequence__Group__2"
    // InternalSlideOMatic.g:4938:1: rule__LineSequence__Group__2 : rule__LineSequence__Group__2__Impl ;
    public final void rule__LineSequence__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4942:1: ( rule__LineSequence__Group__2__Impl )
            // InternalSlideOMatic.g:4943:2: rule__LineSequence__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LineSequence__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineSequence__Group__2"


    // $ANTLR start "rule__LineSequence__Group__2__Impl"
    // InternalSlideOMatic.g:4949:1: rule__LineSequence__Group__2__Impl : ( ( rule__LineSequence__Group_2__0 )* ) ;
    public final void rule__LineSequence__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4953:1: ( ( ( rule__LineSequence__Group_2__0 )* ) )
            // InternalSlideOMatic.g:4954:1: ( ( rule__LineSequence__Group_2__0 )* )
            {
            // InternalSlideOMatic.g:4954:1: ( ( rule__LineSequence__Group_2__0 )* )
            // InternalSlideOMatic.g:4955:2: ( rule__LineSequence__Group_2__0 )*
            {
             before(grammarAccess.getLineSequenceAccess().getGroup_2()); 
            // InternalSlideOMatic.g:4956:2: ( rule__LineSequence__Group_2__0 )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==77) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalSlideOMatic.g:4956:3: rule__LineSequence__Group_2__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__LineSequence__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

             after(grammarAccess.getLineSequenceAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineSequence__Group__2__Impl"


    // $ANTLR start "rule__LineSequence__Group_1__0"
    // InternalSlideOMatic.g:4965:1: rule__LineSequence__Group_1__0 : rule__LineSequence__Group_1__0__Impl rule__LineSequence__Group_1__1 ;
    public final void rule__LineSequence__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4969:1: ( rule__LineSequence__Group_1__0__Impl rule__LineSequence__Group_1__1 )
            // InternalSlideOMatic.g:4970:2: rule__LineSequence__Group_1__0__Impl rule__LineSequence__Group_1__1
            {
            pushFollow(FOLLOW_32);
            rule__LineSequence__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LineSequence__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineSequence__Group_1__0"


    // $ANTLR start "rule__LineSequence__Group_1__0__Impl"
    // InternalSlideOMatic.g:4977:1: rule__LineSequence__Group_1__0__Impl : ( ':' ) ;
    public final void rule__LineSequence__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4981:1: ( ( ':' ) )
            // InternalSlideOMatic.g:4982:1: ( ':' )
            {
            // InternalSlideOMatic.g:4982:1: ( ':' )
            // InternalSlideOMatic.g:4983:2: ':'
            {
             before(grammarAccess.getLineSequenceAccess().getColonKeyword_1_0()); 
            match(input,101,FOLLOW_2); 
             after(grammarAccess.getLineSequenceAccess().getColonKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineSequence__Group_1__0__Impl"


    // $ANTLR start "rule__LineSequence__Group_1__1"
    // InternalSlideOMatic.g:4992:1: rule__LineSequence__Group_1__1 : rule__LineSequence__Group_1__1__Impl ;
    public final void rule__LineSequence__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4996:1: ( rule__LineSequence__Group_1__1__Impl )
            // InternalSlideOMatic.g:4997:2: rule__LineSequence__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LineSequence__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineSequence__Group_1__1"


    // $ANTLR start "rule__LineSequence__Group_1__1__Impl"
    // InternalSlideOMatic.g:5003:1: rule__LineSequence__Group_1__1__Impl : ( ( rule__LineSequence__UpperAssignment_1_1 ) ) ;
    public final void rule__LineSequence__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5007:1: ( ( ( rule__LineSequence__UpperAssignment_1_1 ) ) )
            // InternalSlideOMatic.g:5008:1: ( ( rule__LineSequence__UpperAssignment_1_1 ) )
            {
            // InternalSlideOMatic.g:5008:1: ( ( rule__LineSequence__UpperAssignment_1_1 ) )
            // InternalSlideOMatic.g:5009:2: ( rule__LineSequence__UpperAssignment_1_1 )
            {
             before(grammarAccess.getLineSequenceAccess().getUpperAssignment_1_1()); 
            // InternalSlideOMatic.g:5010:2: ( rule__LineSequence__UpperAssignment_1_1 )
            // InternalSlideOMatic.g:5010:3: rule__LineSequence__UpperAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__LineSequence__UpperAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getLineSequenceAccess().getUpperAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineSequence__Group_1__1__Impl"


    // $ANTLR start "rule__LineSequence__Group_2__0"
    // InternalSlideOMatic.g:5019:1: rule__LineSequence__Group_2__0 : rule__LineSequence__Group_2__0__Impl rule__LineSequence__Group_2__1 ;
    public final void rule__LineSequence__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5023:1: ( rule__LineSequence__Group_2__0__Impl rule__LineSequence__Group_2__1 )
            // InternalSlideOMatic.g:5024:2: rule__LineSequence__Group_2__0__Impl rule__LineSequence__Group_2__1
            {
            pushFollow(FOLLOW_32);
            rule__LineSequence__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LineSequence__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineSequence__Group_2__0"


    // $ANTLR start "rule__LineSequence__Group_2__0__Impl"
    // InternalSlideOMatic.g:5031:1: rule__LineSequence__Group_2__0__Impl : ( ',' ) ;
    public final void rule__LineSequence__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5035:1: ( ( ',' ) )
            // InternalSlideOMatic.g:5036:1: ( ',' )
            {
            // InternalSlideOMatic.g:5036:1: ( ',' )
            // InternalSlideOMatic.g:5037:2: ','
            {
             before(grammarAccess.getLineSequenceAccess().getCommaKeyword_2_0()); 
            match(input,77,FOLLOW_2); 
             after(grammarAccess.getLineSequenceAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineSequence__Group_2__0__Impl"


    // $ANTLR start "rule__LineSequence__Group_2__1"
    // InternalSlideOMatic.g:5046:1: rule__LineSequence__Group_2__1 : rule__LineSequence__Group_2__1__Impl ;
    public final void rule__LineSequence__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5050:1: ( rule__LineSequence__Group_2__1__Impl )
            // InternalSlideOMatic.g:5051:2: rule__LineSequence__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LineSequence__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineSequence__Group_2__1"


    // $ANTLR start "rule__LineSequence__Group_2__1__Impl"
    // InternalSlideOMatic.g:5057:1: rule__LineSequence__Group_2__1__Impl : ( ( rule__LineSequence__AdditionalAssignment_2_1 ) ) ;
    public final void rule__LineSequence__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5061:1: ( ( ( rule__LineSequence__AdditionalAssignment_2_1 ) ) )
            // InternalSlideOMatic.g:5062:1: ( ( rule__LineSequence__AdditionalAssignment_2_1 ) )
            {
            // InternalSlideOMatic.g:5062:1: ( ( rule__LineSequence__AdditionalAssignment_2_1 ) )
            // InternalSlideOMatic.g:5063:2: ( rule__LineSequence__AdditionalAssignment_2_1 )
            {
             before(grammarAccess.getLineSequenceAccess().getAdditionalAssignment_2_1()); 
            // InternalSlideOMatic.g:5064:2: ( rule__LineSequence__AdditionalAssignment_2_1 )
            // InternalSlideOMatic.g:5064:3: rule__LineSequence__AdditionalAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__LineSequence__AdditionalAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getLineSequenceAccess().getAdditionalAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineSequence__Group_2__1__Impl"


    // $ANTLR start "rule__Animation__Group__0"
    // InternalSlideOMatic.g:5073:1: rule__Animation__Group__0 : rule__Animation__Group__0__Impl rule__Animation__Group__1 ;
    public final void rule__Animation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5077:1: ( rule__Animation__Group__0__Impl rule__Animation__Group__1 )
            // InternalSlideOMatic.g:5078:2: rule__Animation__Group__0__Impl rule__Animation__Group__1
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
    // InternalSlideOMatic.g:5085:1: rule__Animation__Group__0__Impl : ( 'animate' ) ;
    public final void rule__Animation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5089:1: ( ( 'animate' ) )
            // InternalSlideOMatic.g:5090:1: ( 'animate' )
            {
            // InternalSlideOMatic.g:5090:1: ( 'animate' )
            // InternalSlideOMatic.g:5091:2: 'animate'
            {
             before(grammarAccess.getAnimationAccess().getAnimateKeyword_0()); 
            match(input,102,FOLLOW_2); 
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
    // InternalSlideOMatic.g:5100:1: rule__Animation__Group__1 : rule__Animation__Group__1__Impl rule__Animation__Group__2 ;
    public final void rule__Animation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5104:1: ( rule__Animation__Group__1__Impl rule__Animation__Group__2 )
            // InternalSlideOMatic.g:5105:2: rule__Animation__Group__1__Impl rule__Animation__Group__2
            {
            pushFollow(FOLLOW_44);
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
    // InternalSlideOMatic.g:5112:1: rule__Animation__Group__1__Impl : ( ( rule__Animation__TargetAssignment_1 ) ) ;
    public final void rule__Animation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5116:1: ( ( ( rule__Animation__TargetAssignment_1 ) ) )
            // InternalSlideOMatic.g:5117:1: ( ( rule__Animation__TargetAssignment_1 ) )
            {
            // InternalSlideOMatic.g:5117:1: ( ( rule__Animation__TargetAssignment_1 ) )
            // InternalSlideOMatic.g:5118:2: ( rule__Animation__TargetAssignment_1 )
            {
             before(grammarAccess.getAnimationAccess().getTargetAssignment_1()); 
            // InternalSlideOMatic.g:5119:2: ( rule__Animation__TargetAssignment_1 )
            // InternalSlideOMatic.g:5119:3: rule__Animation__TargetAssignment_1
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
    // InternalSlideOMatic.g:5127:1: rule__Animation__Group__2 : rule__Animation__Group__2__Impl rule__Animation__Group__3 ;
    public final void rule__Animation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5131:1: ( rule__Animation__Group__2__Impl rule__Animation__Group__3 )
            // InternalSlideOMatic.g:5132:2: rule__Animation__Group__2__Impl rule__Animation__Group__3
            {
            pushFollow(FOLLOW_45);
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
    // InternalSlideOMatic.g:5139:1: rule__Animation__Group__2__Impl : ( ( rule__Animation__TypeAssignment_2 ) ) ;
    public final void rule__Animation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5143:1: ( ( ( rule__Animation__TypeAssignment_2 ) ) )
            // InternalSlideOMatic.g:5144:1: ( ( rule__Animation__TypeAssignment_2 ) )
            {
            // InternalSlideOMatic.g:5144:1: ( ( rule__Animation__TypeAssignment_2 ) )
            // InternalSlideOMatic.g:5145:2: ( rule__Animation__TypeAssignment_2 )
            {
             before(grammarAccess.getAnimationAccess().getTypeAssignment_2()); 
            // InternalSlideOMatic.g:5146:2: ( rule__Animation__TypeAssignment_2 )
            // InternalSlideOMatic.g:5146:3: rule__Animation__TypeAssignment_2
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
    // InternalSlideOMatic.g:5154:1: rule__Animation__Group__3 : rule__Animation__Group__3__Impl rule__Animation__Group__4 ;
    public final void rule__Animation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5158:1: ( rule__Animation__Group__3__Impl rule__Animation__Group__4 )
            // InternalSlideOMatic.g:5159:2: rule__Animation__Group__3__Impl rule__Animation__Group__4
            {
            pushFollow(FOLLOW_46);
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
    // InternalSlideOMatic.g:5166:1: rule__Animation__Group__3__Impl : ( 'to' ) ;
    public final void rule__Animation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5170:1: ( ( 'to' ) )
            // InternalSlideOMatic.g:5171:1: ( 'to' )
            {
            // InternalSlideOMatic.g:5171:1: ( 'to' )
            // InternalSlideOMatic.g:5172:2: 'to'
            {
             before(grammarAccess.getAnimationAccess().getToKeyword_3()); 
            match(input,103,FOLLOW_2); 
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
    // InternalSlideOMatic.g:5181:1: rule__Animation__Group__4 : rule__Animation__Group__4__Impl rule__Animation__Group__5 ;
    public final void rule__Animation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5185:1: ( rule__Animation__Group__4__Impl rule__Animation__Group__5 )
            // InternalSlideOMatic.g:5186:2: rule__Animation__Group__4__Impl rule__Animation__Group__5
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
    // InternalSlideOMatic.g:5193:1: rule__Animation__Group__4__Impl : ( ( rule__Animation__LocationAssignment_4 ) ) ;
    public final void rule__Animation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5197:1: ( ( ( rule__Animation__LocationAssignment_4 ) ) )
            // InternalSlideOMatic.g:5198:1: ( ( rule__Animation__LocationAssignment_4 ) )
            {
            // InternalSlideOMatic.g:5198:1: ( ( rule__Animation__LocationAssignment_4 ) )
            // InternalSlideOMatic.g:5199:2: ( rule__Animation__LocationAssignment_4 )
            {
             before(grammarAccess.getAnimationAccess().getLocationAssignment_4()); 
            // InternalSlideOMatic.g:5200:2: ( rule__Animation__LocationAssignment_4 )
            // InternalSlideOMatic.g:5200:3: rule__Animation__LocationAssignment_4
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
    // InternalSlideOMatic.g:5208:1: rule__Animation__Group__5 : rule__Animation__Group__5__Impl ;
    public final void rule__Animation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5212:1: ( rule__Animation__Group__5__Impl )
            // InternalSlideOMatic.g:5213:2: rule__Animation__Group__5__Impl
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
    // InternalSlideOMatic.g:5219:1: rule__Animation__Group__5__Impl : ( ( rule__Animation__SizeAssignment_5 )? ) ;
    public final void rule__Animation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5223:1: ( ( ( rule__Animation__SizeAssignment_5 )? ) )
            // InternalSlideOMatic.g:5224:1: ( ( rule__Animation__SizeAssignment_5 )? )
            {
            // InternalSlideOMatic.g:5224:1: ( ( rule__Animation__SizeAssignment_5 )? )
            // InternalSlideOMatic.g:5225:2: ( rule__Animation__SizeAssignment_5 )?
            {
             before(grammarAccess.getAnimationAccess().getSizeAssignment_5()); 
            // InternalSlideOMatic.g:5226:2: ( rule__Animation__SizeAssignment_5 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_INT||(LA45_0>=92 && LA45_0<=93)) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalSlideOMatic.g:5226:3: rule__Animation__SizeAssignment_5
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
    // InternalSlideOMatic.g:5235:1: rule__AnimationType__Group_0__0 : rule__AnimationType__Group_0__0__Impl rule__AnimationType__Group_0__1 ;
    public final void rule__AnimationType__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5239:1: ( rule__AnimationType__Group_0__0__Impl rule__AnimationType__Group_0__1 )
            // InternalSlideOMatic.g:5240:2: rule__AnimationType__Group_0__0__Impl rule__AnimationType__Group_0__1
            {
            pushFollow(FOLLOW_47);
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
    // InternalSlideOMatic.g:5247:1: rule__AnimationType__Group_0__0__Impl : ( () ) ;
    public final void rule__AnimationType__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5251:1: ( ( () ) )
            // InternalSlideOMatic.g:5252:1: ( () )
            {
            // InternalSlideOMatic.g:5252:1: ( () )
            // InternalSlideOMatic.g:5253:2: ()
            {
             before(grammarAccess.getAnimationTypeAccess().getMoveAction_0_0()); 
            // InternalSlideOMatic.g:5254:2: ()
            // InternalSlideOMatic.g:5254:3: 
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
    // InternalSlideOMatic.g:5262:1: rule__AnimationType__Group_0__1 : rule__AnimationType__Group_0__1__Impl ;
    public final void rule__AnimationType__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5266:1: ( rule__AnimationType__Group_0__1__Impl )
            // InternalSlideOMatic.g:5267:2: rule__AnimationType__Group_0__1__Impl
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
    // InternalSlideOMatic.g:5273:1: rule__AnimationType__Group_0__1__Impl : ( 'move' ) ;
    public final void rule__AnimationType__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5277:1: ( ( 'move' ) )
            // InternalSlideOMatic.g:5278:1: ( 'move' )
            {
            // InternalSlideOMatic.g:5278:1: ( 'move' )
            // InternalSlideOMatic.g:5279:2: 'move'
            {
             before(grammarAccess.getAnimationTypeAccess().getMoveKeyword_0_1()); 
            match(input,104,FOLLOW_2); 
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
    // InternalSlideOMatic.g:5289:1: rule__AnimationType__Group_1__0 : rule__AnimationType__Group_1__0__Impl rule__AnimationType__Group_1__1 ;
    public final void rule__AnimationType__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5293:1: ( rule__AnimationType__Group_1__0__Impl rule__AnimationType__Group_1__1 )
            // InternalSlideOMatic.g:5294:2: rule__AnimationType__Group_1__0__Impl rule__AnimationType__Group_1__1
            {
            pushFollow(FOLLOW_44);
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
    // InternalSlideOMatic.g:5301:1: rule__AnimationType__Group_1__0__Impl : ( () ) ;
    public final void rule__AnimationType__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5305:1: ( ( () ) )
            // InternalSlideOMatic.g:5306:1: ( () )
            {
            // InternalSlideOMatic.g:5306:1: ( () )
            // InternalSlideOMatic.g:5307:2: ()
            {
             before(grammarAccess.getAnimationTypeAccess().getJumpAction_1_0()); 
            // InternalSlideOMatic.g:5308:2: ()
            // InternalSlideOMatic.g:5308:3: 
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
    // InternalSlideOMatic.g:5316:1: rule__AnimationType__Group_1__1 : rule__AnimationType__Group_1__1__Impl ;
    public final void rule__AnimationType__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5320:1: ( rule__AnimationType__Group_1__1__Impl )
            // InternalSlideOMatic.g:5321:2: rule__AnimationType__Group_1__1__Impl
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
    // InternalSlideOMatic.g:5327:1: rule__AnimationType__Group_1__1__Impl : ( 'jump' ) ;
    public final void rule__AnimationType__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5331:1: ( ( 'jump' ) )
            // InternalSlideOMatic.g:5332:1: ( 'jump' )
            {
            // InternalSlideOMatic.g:5332:1: ( 'jump' )
            // InternalSlideOMatic.g:5333:2: 'jump'
            {
             before(grammarAccess.getAnimationTypeAccess().getJumpKeyword_1_1()); 
            match(input,105,FOLLOW_2); 
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


    // $ANTLR start "rule__MathExp__Group__0"
    // InternalSlideOMatic.g:5343:1: rule__MathExp__Group__0 : rule__MathExp__Group__0__Impl rule__MathExp__Group__1 ;
    public final void rule__MathExp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5347:1: ( rule__MathExp__Group__0__Impl rule__MathExp__Group__1 )
            // InternalSlideOMatic.g:5348:2: rule__MathExp__Group__0__Impl rule__MathExp__Group__1
            {
            pushFollow(FOLLOW_48);
            rule__MathExp__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MathExp__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MathExp__Group__0"


    // $ANTLR start "rule__MathExp__Group__0__Impl"
    // InternalSlideOMatic.g:5355:1: rule__MathExp__Group__0__Impl : ( 'math' ) ;
    public final void rule__MathExp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5359:1: ( ( 'math' ) )
            // InternalSlideOMatic.g:5360:1: ( 'math' )
            {
            // InternalSlideOMatic.g:5360:1: ( 'math' )
            // InternalSlideOMatic.g:5361:2: 'math'
            {
             before(grammarAccess.getMathExpAccess().getMathKeyword_0()); 
            match(input,106,FOLLOW_2); 
             after(grammarAccess.getMathExpAccess().getMathKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MathExp__Group__0__Impl"


    // $ANTLR start "rule__MathExp__Group__1"
    // InternalSlideOMatic.g:5370:1: rule__MathExp__Group__1 : rule__MathExp__Group__1__Impl rule__MathExp__Group__2 ;
    public final void rule__MathExp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5374:1: ( rule__MathExp__Group__1__Impl rule__MathExp__Group__2 )
            // InternalSlideOMatic.g:5375:2: rule__MathExp__Group__1__Impl rule__MathExp__Group__2
            {
            pushFollow(FOLLOW_48);
            rule__MathExp__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MathExp__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MathExp__Group__1"


    // $ANTLR start "rule__MathExp__Group__1__Impl"
    // InternalSlideOMatic.g:5382:1: rule__MathExp__Group__1__Impl : ( ( rule__MathExp__EvalAssignment_1 )? ) ;
    public final void rule__MathExp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5386:1: ( ( ( rule__MathExp__EvalAssignment_1 )? ) )
            // InternalSlideOMatic.g:5387:1: ( ( rule__MathExp__EvalAssignment_1 )? )
            {
            // InternalSlideOMatic.g:5387:1: ( ( rule__MathExp__EvalAssignment_1 )? )
            // InternalSlideOMatic.g:5388:2: ( rule__MathExp__EvalAssignment_1 )?
            {
             before(grammarAccess.getMathExpAccess().getEvalAssignment_1()); 
            // InternalSlideOMatic.g:5389:2: ( rule__MathExp__EvalAssignment_1 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==113) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalSlideOMatic.g:5389:3: rule__MathExp__EvalAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__MathExp__EvalAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMathExpAccess().getEvalAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MathExp__Group__1__Impl"


    // $ANTLR start "rule__MathExp__Group__2"
    // InternalSlideOMatic.g:5397:1: rule__MathExp__Group__2 : rule__MathExp__Group__2__Impl ;
    public final void rule__MathExp__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5401:1: ( rule__MathExp__Group__2__Impl )
            // InternalSlideOMatic.g:5402:2: rule__MathExp__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MathExp__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MathExp__Group__2"


    // $ANTLR start "rule__MathExp__Group__2__Impl"
    // InternalSlideOMatic.g:5408:1: rule__MathExp__Group__2__Impl : ( ( rule__MathExp__ExpAssignment_2 ) ) ;
    public final void rule__MathExp__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5412:1: ( ( ( rule__MathExp__ExpAssignment_2 ) ) )
            // InternalSlideOMatic.g:5413:1: ( ( rule__MathExp__ExpAssignment_2 ) )
            {
            // InternalSlideOMatic.g:5413:1: ( ( rule__MathExp__ExpAssignment_2 ) )
            // InternalSlideOMatic.g:5414:2: ( rule__MathExp__ExpAssignment_2 )
            {
             before(grammarAccess.getMathExpAccess().getExpAssignment_2()); 
            // InternalSlideOMatic.g:5415:2: ( rule__MathExp__ExpAssignment_2 )
            // InternalSlideOMatic.g:5415:3: rule__MathExp__ExpAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__MathExp__ExpAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMathExpAccess().getExpAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MathExp__Group__2__Impl"


    // $ANTLR start "rule__Exp__Group__0"
    // InternalSlideOMatic.g:5424:1: rule__Exp__Group__0 : rule__Exp__Group__0__Impl rule__Exp__Group__1 ;
    public final void rule__Exp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5428:1: ( rule__Exp__Group__0__Impl rule__Exp__Group__1 )
            // InternalSlideOMatic.g:5429:2: rule__Exp__Group__0__Impl rule__Exp__Group__1
            {
            pushFollow(FOLLOW_49);
            rule__Exp__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exp__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__Group__0"


    // $ANTLR start "rule__Exp__Group__0__Impl"
    // InternalSlideOMatic.g:5436:1: rule__Exp__Group__0__Impl : ( ruleFactor ) ;
    public final void rule__Exp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5440:1: ( ( ruleFactor ) )
            // InternalSlideOMatic.g:5441:1: ( ruleFactor )
            {
            // InternalSlideOMatic.g:5441:1: ( ruleFactor )
            // InternalSlideOMatic.g:5442:2: ruleFactor
            {
             before(grammarAccess.getExpAccess().getFactorParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleFactor();

            state._fsp--;

             after(grammarAccess.getExpAccess().getFactorParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__Group__0__Impl"


    // $ANTLR start "rule__Exp__Group__1"
    // InternalSlideOMatic.g:5451:1: rule__Exp__Group__1 : rule__Exp__Group__1__Impl ;
    public final void rule__Exp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5455:1: ( rule__Exp__Group__1__Impl )
            // InternalSlideOMatic.g:5456:2: rule__Exp__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Exp__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__Group__1"


    // $ANTLR start "rule__Exp__Group__1__Impl"
    // InternalSlideOMatic.g:5462:1: rule__Exp__Group__1__Impl : ( ( rule__Exp__Group_1__0 )* ) ;
    public final void rule__Exp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5466:1: ( ( ( rule__Exp__Group_1__0 )* ) )
            // InternalSlideOMatic.g:5467:1: ( ( rule__Exp__Group_1__0 )* )
            {
            // InternalSlideOMatic.g:5467:1: ( ( rule__Exp__Group_1__0 )* )
            // InternalSlideOMatic.g:5468:2: ( rule__Exp__Group_1__0 )*
            {
             before(grammarAccess.getExpAccess().getGroup_1()); 
            // InternalSlideOMatic.g:5469:2: ( rule__Exp__Group_1__0 )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==88||LA47_0==107) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalSlideOMatic.g:5469:3: rule__Exp__Group_1__0
            	    {
            	    pushFollow(FOLLOW_50);
            	    rule__Exp__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

             after(grammarAccess.getExpAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__Group__1__Impl"


    // $ANTLR start "rule__Exp__Group_1__0"
    // InternalSlideOMatic.g:5478:1: rule__Exp__Group_1__0 : rule__Exp__Group_1__0__Impl rule__Exp__Group_1__1 ;
    public final void rule__Exp__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5482:1: ( rule__Exp__Group_1__0__Impl rule__Exp__Group_1__1 )
            // InternalSlideOMatic.g:5483:2: rule__Exp__Group_1__0__Impl rule__Exp__Group_1__1
            {
            pushFollow(FOLLOW_48);
            rule__Exp__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exp__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__Group_1__0"


    // $ANTLR start "rule__Exp__Group_1__0__Impl"
    // InternalSlideOMatic.g:5490:1: rule__Exp__Group_1__0__Impl : ( ( rule__Exp__Alternatives_1_0 ) ) ;
    public final void rule__Exp__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5494:1: ( ( ( rule__Exp__Alternatives_1_0 ) ) )
            // InternalSlideOMatic.g:5495:1: ( ( rule__Exp__Alternatives_1_0 ) )
            {
            // InternalSlideOMatic.g:5495:1: ( ( rule__Exp__Alternatives_1_0 ) )
            // InternalSlideOMatic.g:5496:2: ( rule__Exp__Alternatives_1_0 )
            {
             before(grammarAccess.getExpAccess().getAlternatives_1_0()); 
            // InternalSlideOMatic.g:5497:2: ( rule__Exp__Alternatives_1_0 )
            // InternalSlideOMatic.g:5497:3: rule__Exp__Alternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Exp__Alternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getExpAccess().getAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__Group_1__0__Impl"


    // $ANTLR start "rule__Exp__Group_1__1"
    // InternalSlideOMatic.g:5505:1: rule__Exp__Group_1__1 : rule__Exp__Group_1__1__Impl ;
    public final void rule__Exp__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5509:1: ( rule__Exp__Group_1__1__Impl )
            // InternalSlideOMatic.g:5510:2: rule__Exp__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Exp__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__Group_1__1"


    // $ANTLR start "rule__Exp__Group_1__1__Impl"
    // InternalSlideOMatic.g:5516:1: rule__Exp__Group_1__1__Impl : ( ( rule__Exp__RightAssignment_1_1 ) ) ;
    public final void rule__Exp__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5520:1: ( ( ( rule__Exp__RightAssignment_1_1 ) ) )
            // InternalSlideOMatic.g:5521:1: ( ( rule__Exp__RightAssignment_1_1 ) )
            {
            // InternalSlideOMatic.g:5521:1: ( ( rule__Exp__RightAssignment_1_1 ) )
            // InternalSlideOMatic.g:5522:2: ( rule__Exp__RightAssignment_1_1 )
            {
             before(grammarAccess.getExpAccess().getRightAssignment_1_1()); 
            // InternalSlideOMatic.g:5523:2: ( rule__Exp__RightAssignment_1_1 )
            // InternalSlideOMatic.g:5523:3: rule__Exp__RightAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Exp__RightAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getExpAccess().getRightAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__Group_1__1__Impl"


    // $ANTLR start "rule__Exp__Group_1_0_0__0"
    // InternalSlideOMatic.g:5532:1: rule__Exp__Group_1_0_0__0 : rule__Exp__Group_1_0_0__0__Impl rule__Exp__Group_1_0_0__1 ;
    public final void rule__Exp__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5536:1: ( rule__Exp__Group_1_0_0__0__Impl rule__Exp__Group_1_0_0__1 )
            // InternalSlideOMatic.g:5537:2: rule__Exp__Group_1_0_0__0__Impl rule__Exp__Group_1_0_0__1
            {
            pushFollow(FOLLOW_1);
            rule__Exp__Group_1_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exp__Group_1_0_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__Group_1_0_0__0"


    // $ANTLR start "rule__Exp__Group_1_0_0__0__Impl"
    // InternalSlideOMatic.g:5544:1: rule__Exp__Group_1_0_0__0__Impl : ( '+' ) ;
    public final void rule__Exp__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5548:1: ( ( '+' ) )
            // InternalSlideOMatic.g:5549:1: ( '+' )
            {
            // InternalSlideOMatic.g:5549:1: ( '+' )
            // InternalSlideOMatic.g:5550:2: '+'
            {
             before(grammarAccess.getExpAccess().getPlusSignKeyword_1_0_0_0()); 
            match(input,107,FOLLOW_2); 
             after(grammarAccess.getExpAccess().getPlusSignKeyword_1_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__Exp__Group_1_0_0__1"
    // InternalSlideOMatic.g:5559:1: rule__Exp__Group_1_0_0__1 : rule__Exp__Group_1_0_0__1__Impl ;
    public final void rule__Exp__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5563:1: ( rule__Exp__Group_1_0_0__1__Impl )
            // InternalSlideOMatic.g:5564:2: rule__Exp__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Exp__Group_1_0_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__Group_1_0_0__1"


    // $ANTLR start "rule__Exp__Group_1_0_0__1__Impl"
    // InternalSlideOMatic.g:5570:1: rule__Exp__Group_1_0_0__1__Impl : ( () ) ;
    public final void rule__Exp__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5574:1: ( ( () ) )
            // InternalSlideOMatic.g:5575:1: ( () )
            {
            // InternalSlideOMatic.g:5575:1: ( () )
            // InternalSlideOMatic.g:5576:2: ()
            {
             before(grammarAccess.getExpAccess().getPlusLeftAction_1_0_0_1()); 
            // InternalSlideOMatic.g:5577:2: ()
            // InternalSlideOMatic.g:5577:3: 
            {
            }

             after(grammarAccess.getExpAccess().getPlusLeftAction_1_0_0_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__Exp__Group_1_0_1__0"
    // InternalSlideOMatic.g:5586:1: rule__Exp__Group_1_0_1__0 : rule__Exp__Group_1_0_1__0__Impl rule__Exp__Group_1_0_1__1 ;
    public final void rule__Exp__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5590:1: ( rule__Exp__Group_1_0_1__0__Impl rule__Exp__Group_1_0_1__1 )
            // InternalSlideOMatic.g:5591:2: rule__Exp__Group_1_0_1__0__Impl rule__Exp__Group_1_0_1__1
            {
            pushFollow(FOLLOW_1);
            rule__Exp__Group_1_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exp__Group_1_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__Group_1_0_1__0"


    // $ANTLR start "rule__Exp__Group_1_0_1__0__Impl"
    // InternalSlideOMatic.g:5598:1: rule__Exp__Group_1_0_1__0__Impl : ( '-' ) ;
    public final void rule__Exp__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5602:1: ( ( '-' ) )
            // InternalSlideOMatic.g:5603:1: ( '-' )
            {
            // InternalSlideOMatic.g:5603:1: ( '-' )
            // InternalSlideOMatic.g:5604:2: '-'
            {
             before(grammarAccess.getExpAccess().getHyphenMinusKeyword_1_0_1_0()); 
            match(input,88,FOLLOW_2); 
             after(grammarAccess.getExpAccess().getHyphenMinusKeyword_1_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__Group_1_0_1__0__Impl"


    // $ANTLR start "rule__Exp__Group_1_0_1__1"
    // InternalSlideOMatic.g:5613:1: rule__Exp__Group_1_0_1__1 : rule__Exp__Group_1_0_1__1__Impl ;
    public final void rule__Exp__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5617:1: ( rule__Exp__Group_1_0_1__1__Impl )
            // InternalSlideOMatic.g:5618:2: rule__Exp__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Exp__Group_1_0_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__Group_1_0_1__1"


    // $ANTLR start "rule__Exp__Group_1_0_1__1__Impl"
    // InternalSlideOMatic.g:5624:1: rule__Exp__Group_1_0_1__1__Impl : ( () ) ;
    public final void rule__Exp__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5628:1: ( ( () ) )
            // InternalSlideOMatic.g:5629:1: ( () )
            {
            // InternalSlideOMatic.g:5629:1: ( () )
            // InternalSlideOMatic.g:5630:2: ()
            {
             before(grammarAccess.getExpAccess().getMinusLeftAction_1_0_1_1()); 
            // InternalSlideOMatic.g:5631:2: ()
            // InternalSlideOMatic.g:5631:3: 
            {
            }

             after(grammarAccess.getExpAccess().getMinusLeftAction_1_0_1_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__Group_1_0_1__1__Impl"


    // $ANTLR start "rule__Factor__Group__0"
    // InternalSlideOMatic.g:5640:1: rule__Factor__Group__0 : rule__Factor__Group__0__Impl rule__Factor__Group__1 ;
    public final void rule__Factor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5644:1: ( rule__Factor__Group__0__Impl rule__Factor__Group__1 )
            // InternalSlideOMatic.g:5645:2: rule__Factor__Group__0__Impl rule__Factor__Group__1
            {
            pushFollow(FOLLOW_51);
            rule__Factor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Factor__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group__0"


    // $ANTLR start "rule__Factor__Group__0__Impl"
    // InternalSlideOMatic.g:5652:1: rule__Factor__Group__0__Impl : ( rulePow ) ;
    public final void rule__Factor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5656:1: ( ( rulePow ) )
            // InternalSlideOMatic.g:5657:1: ( rulePow )
            {
            // InternalSlideOMatic.g:5657:1: ( rulePow )
            // InternalSlideOMatic.g:5658:2: rulePow
            {
             before(grammarAccess.getFactorAccess().getPowParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulePow();

            state._fsp--;

             after(grammarAccess.getFactorAccess().getPowParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group__0__Impl"


    // $ANTLR start "rule__Factor__Group__1"
    // InternalSlideOMatic.g:5667:1: rule__Factor__Group__1 : rule__Factor__Group__1__Impl ;
    public final void rule__Factor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5671:1: ( rule__Factor__Group__1__Impl )
            // InternalSlideOMatic.g:5672:2: rule__Factor__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Factor__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group__1"


    // $ANTLR start "rule__Factor__Group__1__Impl"
    // InternalSlideOMatic.g:5678:1: rule__Factor__Group__1__Impl : ( ( rule__Factor__Group_1__0 )* ) ;
    public final void rule__Factor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5682:1: ( ( ( rule__Factor__Group_1__0 )* ) )
            // InternalSlideOMatic.g:5683:1: ( ( rule__Factor__Group_1__0 )* )
            {
            // InternalSlideOMatic.g:5683:1: ( ( rule__Factor__Group_1__0 )* )
            // InternalSlideOMatic.g:5684:2: ( rule__Factor__Group_1__0 )*
            {
             before(grammarAccess.getFactorAccess().getGroup_1()); 
            // InternalSlideOMatic.g:5685:2: ( rule__Factor__Group_1__0 )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==80||LA48_0==108) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalSlideOMatic.g:5685:3: rule__Factor__Group_1__0
            	    {
            	    pushFollow(FOLLOW_52);
            	    rule__Factor__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);

             after(grammarAccess.getFactorAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group__1__Impl"


    // $ANTLR start "rule__Factor__Group_1__0"
    // InternalSlideOMatic.g:5694:1: rule__Factor__Group_1__0 : rule__Factor__Group_1__0__Impl rule__Factor__Group_1__1 ;
    public final void rule__Factor__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5698:1: ( rule__Factor__Group_1__0__Impl rule__Factor__Group_1__1 )
            // InternalSlideOMatic.g:5699:2: rule__Factor__Group_1__0__Impl rule__Factor__Group_1__1
            {
            pushFollow(FOLLOW_48);
            rule__Factor__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Factor__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_1__0"


    // $ANTLR start "rule__Factor__Group_1__0__Impl"
    // InternalSlideOMatic.g:5706:1: rule__Factor__Group_1__0__Impl : ( ( rule__Factor__Alternatives_1_0 ) ) ;
    public final void rule__Factor__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5710:1: ( ( ( rule__Factor__Alternatives_1_0 ) ) )
            // InternalSlideOMatic.g:5711:1: ( ( rule__Factor__Alternatives_1_0 ) )
            {
            // InternalSlideOMatic.g:5711:1: ( ( rule__Factor__Alternatives_1_0 ) )
            // InternalSlideOMatic.g:5712:2: ( rule__Factor__Alternatives_1_0 )
            {
             before(grammarAccess.getFactorAccess().getAlternatives_1_0()); 
            // InternalSlideOMatic.g:5713:2: ( rule__Factor__Alternatives_1_0 )
            // InternalSlideOMatic.g:5713:3: rule__Factor__Alternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Factor__Alternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getFactorAccess().getAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_1__0__Impl"


    // $ANTLR start "rule__Factor__Group_1__1"
    // InternalSlideOMatic.g:5721:1: rule__Factor__Group_1__1 : rule__Factor__Group_1__1__Impl ;
    public final void rule__Factor__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5725:1: ( rule__Factor__Group_1__1__Impl )
            // InternalSlideOMatic.g:5726:2: rule__Factor__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Factor__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_1__1"


    // $ANTLR start "rule__Factor__Group_1__1__Impl"
    // InternalSlideOMatic.g:5732:1: rule__Factor__Group_1__1__Impl : ( ( rule__Factor__RightAssignment_1_1 ) ) ;
    public final void rule__Factor__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5736:1: ( ( ( rule__Factor__RightAssignment_1_1 ) ) )
            // InternalSlideOMatic.g:5737:1: ( ( rule__Factor__RightAssignment_1_1 ) )
            {
            // InternalSlideOMatic.g:5737:1: ( ( rule__Factor__RightAssignment_1_1 ) )
            // InternalSlideOMatic.g:5738:2: ( rule__Factor__RightAssignment_1_1 )
            {
             before(grammarAccess.getFactorAccess().getRightAssignment_1_1()); 
            // InternalSlideOMatic.g:5739:2: ( rule__Factor__RightAssignment_1_1 )
            // InternalSlideOMatic.g:5739:3: rule__Factor__RightAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Factor__RightAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getFactorAccess().getRightAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_1__1__Impl"


    // $ANTLR start "rule__Factor__Group_1_0_0__0"
    // InternalSlideOMatic.g:5748:1: rule__Factor__Group_1_0_0__0 : rule__Factor__Group_1_0_0__0__Impl rule__Factor__Group_1_0_0__1 ;
    public final void rule__Factor__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5752:1: ( rule__Factor__Group_1_0_0__0__Impl rule__Factor__Group_1_0_0__1 )
            // InternalSlideOMatic.g:5753:2: rule__Factor__Group_1_0_0__0__Impl rule__Factor__Group_1_0_0__1
            {
            pushFollow(FOLLOW_1);
            rule__Factor__Group_1_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Factor__Group_1_0_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_1_0_0__0"


    // $ANTLR start "rule__Factor__Group_1_0_0__0__Impl"
    // InternalSlideOMatic.g:5760:1: rule__Factor__Group_1_0_0__0__Impl : ( '*' ) ;
    public final void rule__Factor__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5764:1: ( ( '*' ) )
            // InternalSlideOMatic.g:5765:1: ( '*' )
            {
            // InternalSlideOMatic.g:5765:1: ( '*' )
            // InternalSlideOMatic.g:5766:2: '*'
            {
             before(grammarAccess.getFactorAccess().getAsteriskKeyword_1_0_0_0()); 
            match(input,80,FOLLOW_2); 
             after(grammarAccess.getFactorAccess().getAsteriskKeyword_1_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__Factor__Group_1_0_0__1"
    // InternalSlideOMatic.g:5775:1: rule__Factor__Group_1_0_0__1 : rule__Factor__Group_1_0_0__1__Impl ;
    public final void rule__Factor__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5779:1: ( rule__Factor__Group_1_0_0__1__Impl )
            // InternalSlideOMatic.g:5780:2: rule__Factor__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Factor__Group_1_0_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_1_0_0__1"


    // $ANTLR start "rule__Factor__Group_1_0_0__1__Impl"
    // InternalSlideOMatic.g:5786:1: rule__Factor__Group_1_0_0__1__Impl : ( () ) ;
    public final void rule__Factor__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5790:1: ( ( () ) )
            // InternalSlideOMatic.g:5791:1: ( () )
            {
            // InternalSlideOMatic.g:5791:1: ( () )
            // InternalSlideOMatic.g:5792:2: ()
            {
             before(grammarAccess.getFactorAccess().getMultLeftAction_1_0_0_1()); 
            // InternalSlideOMatic.g:5793:2: ()
            // InternalSlideOMatic.g:5793:3: 
            {
            }

             after(grammarAccess.getFactorAccess().getMultLeftAction_1_0_0_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__Factor__Group_1_0_1__0"
    // InternalSlideOMatic.g:5802:1: rule__Factor__Group_1_0_1__0 : rule__Factor__Group_1_0_1__0__Impl rule__Factor__Group_1_0_1__1 ;
    public final void rule__Factor__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5806:1: ( rule__Factor__Group_1_0_1__0__Impl rule__Factor__Group_1_0_1__1 )
            // InternalSlideOMatic.g:5807:2: rule__Factor__Group_1_0_1__0__Impl rule__Factor__Group_1_0_1__1
            {
            pushFollow(FOLLOW_1);
            rule__Factor__Group_1_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Factor__Group_1_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_1_0_1__0"


    // $ANTLR start "rule__Factor__Group_1_0_1__0__Impl"
    // InternalSlideOMatic.g:5814:1: rule__Factor__Group_1_0_1__0__Impl : ( '/' ) ;
    public final void rule__Factor__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5818:1: ( ( '/' ) )
            // InternalSlideOMatic.g:5819:1: ( '/' )
            {
            // InternalSlideOMatic.g:5819:1: ( '/' )
            // InternalSlideOMatic.g:5820:2: '/'
            {
             before(grammarAccess.getFactorAccess().getSolidusKeyword_1_0_1_0()); 
            match(input,108,FOLLOW_2); 
             after(grammarAccess.getFactorAccess().getSolidusKeyword_1_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_1_0_1__0__Impl"


    // $ANTLR start "rule__Factor__Group_1_0_1__1"
    // InternalSlideOMatic.g:5829:1: rule__Factor__Group_1_0_1__1 : rule__Factor__Group_1_0_1__1__Impl ;
    public final void rule__Factor__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5833:1: ( rule__Factor__Group_1_0_1__1__Impl )
            // InternalSlideOMatic.g:5834:2: rule__Factor__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Factor__Group_1_0_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_1_0_1__1"


    // $ANTLR start "rule__Factor__Group_1_0_1__1__Impl"
    // InternalSlideOMatic.g:5840:1: rule__Factor__Group_1_0_1__1__Impl : ( () ) ;
    public final void rule__Factor__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5844:1: ( ( () ) )
            // InternalSlideOMatic.g:5845:1: ( () )
            {
            // InternalSlideOMatic.g:5845:1: ( () )
            // InternalSlideOMatic.g:5846:2: ()
            {
             before(grammarAccess.getFactorAccess().getDivLeftAction_1_0_1_1()); 
            // InternalSlideOMatic.g:5847:2: ()
            // InternalSlideOMatic.g:5847:3: 
            {
            }

             after(grammarAccess.getFactorAccess().getDivLeftAction_1_0_1_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_1_0_1__1__Impl"


    // $ANTLR start "rule__Pow__Group__0"
    // InternalSlideOMatic.g:5856:1: rule__Pow__Group__0 : rule__Pow__Group__0__Impl rule__Pow__Group__1 ;
    public final void rule__Pow__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5860:1: ( rule__Pow__Group__0__Impl rule__Pow__Group__1 )
            // InternalSlideOMatic.g:5861:2: rule__Pow__Group__0__Impl rule__Pow__Group__1
            {
            pushFollow(FOLLOW_53);
            rule__Pow__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pow__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pow__Group__0"


    // $ANTLR start "rule__Pow__Group__0__Impl"
    // InternalSlideOMatic.g:5868:1: rule__Pow__Group__0__Impl : ( rulePrimary ) ;
    public final void rule__Pow__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5872:1: ( ( rulePrimary ) )
            // InternalSlideOMatic.g:5873:1: ( rulePrimary )
            {
            // InternalSlideOMatic.g:5873:1: ( rulePrimary )
            // InternalSlideOMatic.g:5874:2: rulePrimary
            {
             before(grammarAccess.getPowAccess().getPrimaryParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getPowAccess().getPrimaryParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pow__Group__0__Impl"


    // $ANTLR start "rule__Pow__Group__1"
    // InternalSlideOMatic.g:5883:1: rule__Pow__Group__1 : rule__Pow__Group__1__Impl ;
    public final void rule__Pow__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5887:1: ( rule__Pow__Group__1__Impl )
            // InternalSlideOMatic.g:5888:2: rule__Pow__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pow__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pow__Group__1"


    // $ANTLR start "rule__Pow__Group__1__Impl"
    // InternalSlideOMatic.g:5894:1: rule__Pow__Group__1__Impl : ( ( rule__Pow__Group_1__0 )? ) ;
    public final void rule__Pow__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5898:1: ( ( ( rule__Pow__Group_1__0 )? ) )
            // InternalSlideOMatic.g:5899:1: ( ( rule__Pow__Group_1__0 )? )
            {
            // InternalSlideOMatic.g:5899:1: ( ( rule__Pow__Group_1__0 )? )
            // InternalSlideOMatic.g:5900:2: ( rule__Pow__Group_1__0 )?
            {
             before(grammarAccess.getPowAccess().getGroup_1()); 
            // InternalSlideOMatic.g:5901:2: ( rule__Pow__Group_1__0 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==109) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalSlideOMatic.g:5901:3: rule__Pow__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Pow__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPowAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pow__Group__1__Impl"


    // $ANTLR start "rule__Pow__Group_1__0"
    // InternalSlideOMatic.g:5910:1: rule__Pow__Group_1__0 : rule__Pow__Group_1__0__Impl rule__Pow__Group_1__1 ;
    public final void rule__Pow__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5914:1: ( rule__Pow__Group_1__0__Impl rule__Pow__Group_1__1 )
            // InternalSlideOMatic.g:5915:2: rule__Pow__Group_1__0__Impl rule__Pow__Group_1__1
            {
            pushFollow(FOLLOW_53);
            rule__Pow__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pow__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pow__Group_1__0"


    // $ANTLR start "rule__Pow__Group_1__0__Impl"
    // InternalSlideOMatic.g:5922:1: rule__Pow__Group_1__0__Impl : ( () ) ;
    public final void rule__Pow__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5926:1: ( ( () ) )
            // InternalSlideOMatic.g:5927:1: ( () )
            {
            // InternalSlideOMatic.g:5927:1: ( () )
            // InternalSlideOMatic.g:5928:2: ()
            {
             before(grammarAccess.getPowAccess().getPowLeftAction_1_0()); 
            // InternalSlideOMatic.g:5929:2: ()
            // InternalSlideOMatic.g:5929:3: 
            {
            }

             after(grammarAccess.getPowAccess().getPowLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pow__Group_1__0__Impl"


    // $ANTLR start "rule__Pow__Group_1__1"
    // InternalSlideOMatic.g:5937:1: rule__Pow__Group_1__1 : rule__Pow__Group_1__1__Impl rule__Pow__Group_1__2 ;
    public final void rule__Pow__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5941:1: ( rule__Pow__Group_1__1__Impl rule__Pow__Group_1__2 )
            // InternalSlideOMatic.g:5942:2: rule__Pow__Group_1__1__Impl rule__Pow__Group_1__2
            {
            pushFollow(FOLLOW_48);
            rule__Pow__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pow__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pow__Group_1__1"


    // $ANTLR start "rule__Pow__Group_1__1__Impl"
    // InternalSlideOMatic.g:5949:1: rule__Pow__Group_1__1__Impl : ( '^' ) ;
    public final void rule__Pow__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5953:1: ( ( '^' ) )
            // InternalSlideOMatic.g:5954:1: ( '^' )
            {
            // InternalSlideOMatic.g:5954:1: ( '^' )
            // InternalSlideOMatic.g:5955:2: '^'
            {
             before(grammarAccess.getPowAccess().getCircumflexAccentKeyword_1_1()); 
            match(input,109,FOLLOW_2); 
             after(grammarAccess.getPowAccess().getCircumflexAccentKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pow__Group_1__1__Impl"


    // $ANTLR start "rule__Pow__Group_1__2"
    // InternalSlideOMatic.g:5964:1: rule__Pow__Group_1__2 : rule__Pow__Group_1__2__Impl ;
    public final void rule__Pow__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5968:1: ( rule__Pow__Group_1__2__Impl )
            // InternalSlideOMatic.g:5969:2: rule__Pow__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pow__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pow__Group_1__2"


    // $ANTLR start "rule__Pow__Group_1__2__Impl"
    // InternalSlideOMatic.g:5975:1: rule__Pow__Group_1__2__Impl : ( ( rule__Pow__RightAssignment_1_2 ) ) ;
    public final void rule__Pow__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5979:1: ( ( ( rule__Pow__RightAssignment_1_2 ) ) )
            // InternalSlideOMatic.g:5980:1: ( ( rule__Pow__RightAssignment_1_2 ) )
            {
            // InternalSlideOMatic.g:5980:1: ( ( rule__Pow__RightAssignment_1_2 ) )
            // InternalSlideOMatic.g:5981:2: ( rule__Pow__RightAssignment_1_2 )
            {
             before(grammarAccess.getPowAccess().getRightAssignment_1_2()); 
            // InternalSlideOMatic.g:5982:2: ( rule__Pow__RightAssignment_1_2 )
            // InternalSlideOMatic.g:5982:3: rule__Pow__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Pow__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getPowAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pow__Group_1__2__Impl"


    // $ANTLR start "rule__VariableUse__Group__0"
    // InternalSlideOMatic.g:5991:1: rule__VariableUse__Group__0 : rule__VariableUse__Group__0__Impl rule__VariableUse__Group__1 ;
    public final void rule__VariableUse__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5995:1: ( rule__VariableUse__Group__0__Impl rule__VariableUse__Group__1 )
            // InternalSlideOMatic.g:5996:2: rule__VariableUse__Group__0__Impl rule__VariableUse__Group__1
            {
            pushFollow(FOLLOW_48);
            rule__VariableUse__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableUse__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableUse__Group__0"


    // $ANTLR start "rule__VariableUse__Group__0__Impl"
    // InternalSlideOMatic.g:6003:1: rule__VariableUse__Group__0__Impl : ( () ) ;
    public final void rule__VariableUse__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:6007:1: ( ( () ) )
            // InternalSlideOMatic.g:6008:1: ( () )
            {
            // InternalSlideOMatic.g:6008:1: ( () )
            // InternalSlideOMatic.g:6009:2: ()
            {
             before(grammarAccess.getVariableUseAccess().getVarAction_0()); 
            // InternalSlideOMatic.g:6010:2: ()
            // InternalSlideOMatic.g:6010:3: 
            {
            }

             after(grammarAccess.getVariableUseAccess().getVarAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableUse__Group__0__Impl"


    // $ANTLR start "rule__VariableUse__Group__1"
    // InternalSlideOMatic.g:6018:1: rule__VariableUse__Group__1 : rule__VariableUse__Group__1__Impl ;
    public final void rule__VariableUse__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:6022:1: ( rule__VariableUse__Group__1__Impl )
            // InternalSlideOMatic.g:6023:2: rule__VariableUse__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VariableUse__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableUse__Group__1"


    // $ANTLR start "rule__VariableUse__Group__1__Impl"
    // InternalSlideOMatic.g:6029:1: rule__VariableUse__Group__1__Impl : ( ( rule__VariableUse__IdAssignment_1 ) ) ;
    public final void rule__VariableUse__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:6033:1: ( ( ( rule__VariableUse__IdAssignment_1 ) ) )
            // InternalSlideOMatic.g:6034:1: ( ( rule__VariableUse__IdAssignment_1 ) )
            {
            // InternalSlideOMatic.g:6034:1: ( ( rule__VariableUse__IdAssignment_1 ) )
            // InternalSlideOMatic.g:6035:2: ( rule__VariableUse__IdAssignment_1 )
            {
             before(grammarAccess.getVariableUseAccess().getIdAssignment_1()); 
            // InternalSlideOMatic.g:6036:2: ( rule__VariableUse__IdAssignment_1 )
            // InternalSlideOMatic.g:6036:3: rule__VariableUse__IdAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__VariableUse__IdAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVariableUseAccess().getIdAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableUse__Group__1__Impl"


    // $ANTLR start "rule__VariableBinding__Group__0"
    // InternalSlideOMatic.g:6045:1: rule__VariableBinding__Group__0 : rule__VariableBinding__Group__0__Impl rule__VariableBinding__Group__1 ;
    public final void rule__VariableBinding__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:6049:1: ( rule__VariableBinding__Group__0__Impl rule__VariableBinding__Group__1 )
            // InternalSlideOMatic.g:6050:2: rule__VariableBinding__Group__0__Impl rule__VariableBinding__Group__1
            {
            pushFollow(FOLLOW_54);
            rule__VariableBinding__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableBinding__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableBinding__Group__0"


    // $ANTLR start "rule__VariableBinding__Group__0__Impl"
    // InternalSlideOMatic.g:6057:1: rule__VariableBinding__Group__0__Impl : ( () ) ;
    public final void rule__VariableBinding__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:6061:1: ( ( () ) )
            // InternalSlideOMatic.g:6062:1: ( () )
            {
            // InternalSlideOMatic.g:6062:1: ( () )
            // InternalSlideOMatic.g:6063:2: ()
            {
             before(grammarAccess.getVariableBindingAccess().getLetAction_0()); 
            // InternalSlideOMatic.g:6064:2: ()
            // InternalSlideOMatic.g:6064:3: 
            {
            }

             after(grammarAccess.getVariableBindingAccess().getLetAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableBinding__Group__0__Impl"


    // $ANTLR start "rule__VariableBinding__Group__1"
    // InternalSlideOMatic.g:6072:1: rule__VariableBinding__Group__1 : rule__VariableBinding__Group__1__Impl rule__VariableBinding__Group__2 ;
    public final void rule__VariableBinding__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:6076:1: ( rule__VariableBinding__Group__1__Impl rule__VariableBinding__Group__2 )
            // InternalSlideOMatic.g:6077:2: rule__VariableBinding__Group__1__Impl rule__VariableBinding__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__VariableBinding__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableBinding__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableBinding__Group__1"


    // $ANTLR start "rule__VariableBinding__Group__1__Impl"
    // InternalSlideOMatic.g:6084:1: rule__VariableBinding__Group__1__Impl : ( 'let' ) ;
    public final void rule__VariableBinding__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:6088:1: ( ( 'let' ) )
            // InternalSlideOMatic.g:6089:1: ( 'let' )
            {
            // InternalSlideOMatic.g:6089:1: ( 'let' )
            // InternalSlideOMatic.g:6090:2: 'let'
            {
             before(grammarAccess.getVariableBindingAccess().getLetKeyword_1()); 
            match(input,110,FOLLOW_2); 
             after(grammarAccess.getVariableBindingAccess().getLetKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableBinding__Group__1__Impl"


    // $ANTLR start "rule__VariableBinding__Group__2"
    // InternalSlideOMatic.g:6099:1: rule__VariableBinding__Group__2 : rule__VariableBinding__Group__2__Impl rule__VariableBinding__Group__3 ;
    public final void rule__VariableBinding__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:6103:1: ( rule__VariableBinding__Group__2__Impl rule__VariableBinding__Group__3 )
            // InternalSlideOMatic.g:6104:2: rule__VariableBinding__Group__2__Impl rule__VariableBinding__Group__3
            {
            pushFollow(FOLLOW_55);
            rule__VariableBinding__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableBinding__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableBinding__Group__2"


    // $ANTLR start "rule__VariableBinding__Group__2__Impl"
    // InternalSlideOMatic.g:6111:1: rule__VariableBinding__Group__2__Impl : ( ( rule__VariableBinding__IdAssignment_2 ) ) ;
    public final void rule__VariableBinding__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:6115:1: ( ( ( rule__VariableBinding__IdAssignment_2 ) ) )
            // InternalSlideOMatic.g:6116:1: ( ( rule__VariableBinding__IdAssignment_2 ) )
            {
            // InternalSlideOMatic.g:6116:1: ( ( rule__VariableBinding__IdAssignment_2 ) )
            // InternalSlideOMatic.g:6117:2: ( rule__VariableBinding__IdAssignment_2 )
            {
             before(grammarAccess.getVariableBindingAccess().getIdAssignment_2()); 
            // InternalSlideOMatic.g:6118:2: ( rule__VariableBinding__IdAssignment_2 )
            // InternalSlideOMatic.g:6118:3: rule__VariableBinding__IdAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__VariableBinding__IdAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getVariableBindingAccess().getIdAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableBinding__Group__2__Impl"


    // $ANTLR start "rule__VariableBinding__Group__3"
    // InternalSlideOMatic.g:6126:1: rule__VariableBinding__Group__3 : rule__VariableBinding__Group__3__Impl rule__VariableBinding__Group__4 ;
    public final void rule__VariableBinding__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:6130:1: ( rule__VariableBinding__Group__3__Impl rule__VariableBinding__Group__4 )
            // InternalSlideOMatic.g:6131:2: rule__VariableBinding__Group__3__Impl rule__VariableBinding__Group__4
            {
            pushFollow(FOLLOW_48);
            rule__VariableBinding__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableBinding__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableBinding__Group__3"


    // $ANTLR start "rule__VariableBinding__Group__3__Impl"
    // InternalSlideOMatic.g:6138:1: rule__VariableBinding__Group__3__Impl : ( '=' ) ;
    public final void rule__VariableBinding__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:6142:1: ( ( '=' ) )
            // InternalSlideOMatic.g:6143:1: ( '=' )
            {
            // InternalSlideOMatic.g:6143:1: ( '=' )
            // InternalSlideOMatic.g:6144:2: '='
            {
             before(grammarAccess.getVariableBindingAccess().getEqualsSignKeyword_3()); 
            match(input,111,FOLLOW_2); 
             after(grammarAccess.getVariableBindingAccess().getEqualsSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableBinding__Group__3__Impl"


    // $ANTLR start "rule__VariableBinding__Group__4"
    // InternalSlideOMatic.g:6153:1: rule__VariableBinding__Group__4 : rule__VariableBinding__Group__4__Impl rule__VariableBinding__Group__5 ;
    public final void rule__VariableBinding__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:6157:1: ( rule__VariableBinding__Group__4__Impl rule__VariableBinding__Group__5 )
            // InternalSlideOMatic.g:6158:2: rule__VariableBinding__Group__4__Impl rule__VariableBinding__Group__5
            {
            pushFollow(FOLLOW_56);
            rule__VariableBinding__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableBinding__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableBinding__Group__4"


    // $ANTLR start "rule__VariableBinding__Group__4__Impl"
    // InternalSlideOMatic.g:6165:1: rule__VariableBinding__Group__4__Impl : ( ( rule__VariableBinding__BindingAssignment_4 ) ) ;
    public final void rule__VariableBinding__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:6169:1: ( ( ( rule__VariableBinding__BindingAssignment_4 ) ) )
            // InternalSlideOMatic.g:6170:1: ( ( rule__VariableBinding__BindingAssignment_4 ) )
            {
            // InternalSlideOMatic.g:6170:1: ( ( rule__VariableBinding__BindingAssignment_4 ) )
            // InternalSlideOMatic.g:6171:2: ( rule__VariableBinding__BindingAssignment_4 )
            {
             before(grammarAccess.getVariableBindingAccess().getBindingAssignment_4()); 
            // InternalSlideOMatic.g:6172:2: ( rule__VariableBinding__BindingAssignment_4 )
            // InternalSlideOMatic.g:6172:3: rule__VariableBinding__BindingAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__VariableBinding__BindingAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getVariableBindingAccess().getBindingAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableBinding__Group__4__Impl"


    // $ANTLR start "rule__VariableBinding__Group__5"
    // InternalSlideOMatic.g:6180:1: rule__VariableBinding__Group__5 : rule__VariableBinding__Group__5__Impl rule__VariableBinding__Group__6 ;
    public final void rule__VariableBinding__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:6184:1: ( rule__VariableBinding__Group__5__Impl rule__VariableBinding__Group__6 )
            // InternalSlideOMatic.g:6185:2: rule__VariableBinding__Group__5__Impl rule__VariableBinding__Group__6
            {
            pushFollow(FOLLOW_48);
            rule__VariableBinding__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableBinding__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableBinding__Group__5"


    // $ANTLR start "rule__VariableBinding__Group__5__Impl"
    // InternalSlideOMatic.g:6192:1: rule__VariableBinding__Group__5__Impl : ( 'in' ) ;
    public final void rule__VariableBinding__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:6196:1: ( ( 'in' ) )
            // InternalSlideOMatic.g:6197:1: ( 'in' )
            {
            // InternalSlideOMatic.g:6197:1: ( 'in' )
            // InternalSlideOMatic.g:6198:2: 'in'
            {
             before(grammarAccess.getVariableBindingAccess().getInKeyword_5()); 
            match(input,112,FOLLOW_2); 
             after(grammarAccess.getVariableBindingAccess().getInKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableBinding__Group__5__Impl"


    // $ANTLR start "rule__VariableBinding__Group__6"
    // InternalSlideOMatic.g:6207:1: rule__VariableBinding__Group__6 : rule__VariableBinding__Group__6__Impl rule__VariableBinding__Group__7 ;
    public final void rule__VariableBinding__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:6211:1: ( rule__VariableBinding__Group__6__Impl rule__VariableBinding__Group__7 )
            // InternalSlideOMatic.g:6212:2: rule__VariableBinding__Group__6__Impl rule__VariableBinding__Group__7
            {
            pushFollow(FOLLOW_39);
            rule__VariableBinding__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableBinding__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableBinding__Group__6"


    // $ANTLR start "rule__VariableBinding__Group__6__Impl"
    // InternalSlideOMatic.g:6219:1: rule__VariableBinding__Group__6__Impl : ( ( rule__VariableBinding__BodyAssignment_6 ) ) ;
    public final void rule__VariableBinding__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:6223:1: ( ( ( rule__VariableBinding__BodyAssignment_6 ) ) )
            // InternalSlideOMatic.g:6224:1: ( ( rule__VariableBinding__BodyAssignment_6 ) )
            {
            // InternalSlideOMatic.g:6224:1: ( ( rule__VariableBinding__BodyAssignment_6 ) )
            // InternalSlideOMatic.g:6225:2: ( rule__VariableBinding__BodyAssignment_6 )
            {
             before(grammarAccess.getVariableBindingAccess().getBodyAssignment_6()); 
            // InternalSlideOMatic.g:6226:2: ( rule__VariableBinding__BodyAssignment_6 )
            // InternalSlideOMatic.g:6226:3: rule__VariableBinding__BodyAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__VariableBinding__BodyAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getVariableBindingAccess().getBodyAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableBinding__Group__6__Impl"


    // $ANTLR start "rule__VariableBinding__Group__7"
    // InternalSlideOMatic.g:6234:1: rule__VariableBinding__Group__7 : rule__VariableBinding__Group__7__Impl ;
    public final void rule__VariableBinding__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:6238:1: ( rule__VariableBinding__Group__7__Impl )
            // InternalSlideOMatic.g:6239:2: rule__VariableBinding__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VariableBinding__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableBinding__Group__7"


    // $ANTLR start "rule__VariableBinding__Group__7__Impl"
    // InternalSlideOMatic.g:6245:1: rule__VariableBinding__Group__7__Impl : ( 'end' ) ;
    public final void rule__VariableBinding__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:6249:1: ( ( 'end' ) )
            // InternalSlideOMatic.g:6250:1: ( 'end' )
            {
            // InternalSlideOMatic.g:6250:1: ( 'end' )
            // InternalSlideOMatic.g:6251:2: 'end'
            {
             before(grammarAccess.getVariableBindingAccess().getEndKeyword_7()); 
            match(input,98,FOLLOW_2); 
             after(grammarAccess.getVariableBindingAccess().getEndKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableBinding__Group__7__Impl"


    // $ANTLR start "rule__Parenthesis__Group__0"
    // InternalSlideOMatic.g:6261:1: rule__Parenthesis__Group__0 : rule__Parenthesis__Group__0__Impl rule__Parenthesis__Group__1 ;
    public final void rule__Parenthesis__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:6265:1: ( rule__Parenthesis__Group__0__Impl rule__Parenthesis__Group__1 )
            // InternalSlideOMatic.g:6266:2: rule__Parenthesis__Group__0__Impl rule__Parenthesis__Group__1
            {
            pushFollow(FOLLOW_48);
            rule__Parenthesis__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parenthesis__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parenthesis__Group__0"


    // $ANTLR start "rule__Parenthesis__Group__0__Impl"
    // InternalSlideOMatic.g:6273:1: rule__Parenthesis__Group__0__Impl : ( '(' ) ;
    public final void rule__Parenthesis__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:6277:1: ( ( '(' ) )
            // InternalSlideOMatic.g:6278:1: ( '(' )
            {
            // InternalSlideOMatic.g:6278:1: ( '(' )
            // InternalSlideOMatic.g:6279:2: '('
            {
             before(grammarAccess.getParenthesisAccess().getLeftParenthesisKeyword_0()); 
            match(input,73,FOLLOW_2); 
             after(grammarAccess.getParenthesisAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parenthesis__Group__0__Impl"


    // $ANTLR start "rule__Parenthesis__Group__1"
    // InternalSlideOMatic.g:6288:1: rule__Parenthesis__Group__1 : rule__Parenthesis__Group__1__Impl rule__Parenthesis__Group__2 ;
    public final void rule__Parenthesis__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:6292:1: ( rule__Parenthesis__Group__1__Impl rule__Parenthesis__Group__2 )
            // InternalSlideOMatic.g:6293:2: rule__Parenthesis__Group__1__Impl rule__Parenthesis__Group__2
            {
            pushFollow(FOLLOW_27);
            rule__Parenthesis__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parenthesis__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parenthesis__Group__1"


    // $ANTLR start "rule__Parenthesis__Group__1__Impl"
    // InternalSlideOMatic.g:6300:1: rule__Parenthesis__Group__1__Impl : ( ruleExp ) ;
    public final void rule__Parenthesis__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:6304:1: ( ( ruleExp ) )
            // InternalSlideOMatic.g:6305:1: ( ruleExp )
            {
            // InternalSlideOMatic.g:6305:1: ( ruleExp )
            // InternalSlideOMatic.g:6306:2: ruleExp
            {
             before(grammarAccess.getParenthesisAccess().getExpParserRuleCall_1()); 
            pushFollow(FOLLOW_2);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getParenthesisAccess().getExpParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parenthesis__Group__1__Impl"


    // $ANTLR start "rule__Parenthesis__Group__2"
    // InternalSlideOMatic.g:6315:1: rule__Parenthesis__Group__2 : rule__Parenthesis__Group__2__Impl ;
    public final void rule__Parenthesis__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:6319:1: ( rule__Parenthesis__Group__2__Impl )
            // InternalSlideOMatic.g:6320:2: rule__Parenthesis__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parenthesis__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parenthesis__Group__2"


    // $ANTLR start "rule__Parenthesis__Group__2__Impl"
    // InternalSlideOMatic.g:6326:1: rule__Parenthesis__Group__2__Impl : ( ')' ) ;
    public final void rule__Parenthesis__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:6330:1: ( ( ')' ) )
            // InternalSlideOMatic.g:6331:1: ( ')' )
            {
            // InternalSlideOMatic.g:6331:1: ( ')' )
            // InternalSlideOMatic.g:6332:2: ')'
            {
             before(grammarAccess.getParenthesisAccess().getRightParenthesisKeyword_2()); 
            match(input,74,FOLLOW_2); 
             after(grammarAccess.getParenthesisAccess().getRightParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parenthesis__Group__2__Impl"


    // $ANTLR start "rule__Number__Group__0"
    // InternalSlideOMatic.g:6342:1: rule__Number__Group__0 : rule__Number__Group__0__Impl rule__Number__Group__1 ;
    public final void rule__Number__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:6346:1: ( rule__Number__Group__0__Impl rule__Number__Group__1 )
            // InternalSlideOMatic.g:6347:2: rule__Number__Group__0__Impl rule__Number__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__Number__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Number__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Group__0"


    // $ANTLR start "rule__Number__Group__0__Impl"
    // InternalSlideOMatic.g:6354:1: rule__Number__Group__0__Impl : ( () ) ;
    public final void rule__Number__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:6358:1: ( ( () ) )
            // InternalSlideOMatic.g:6359:1: ( () )
            {
            // InternalSlideOMatic.g:6359:1: ( () )
            // InternalSlideOMatic.g:6360:2: ()
            {
             before(grammarAccess.getNumberAccess().getNumAction_0()); 
            // InternalSlideOMatic.g:6361:2: ()
            // InternalSlideOMatic.g:6361:3: 
            {
            }

             after(grammarAccess.getNumberAccess().getNumAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Group__0__Impl"


    // $ANTLR start "rule__Number__Group__1"
    // InternalSlideOMatic.g:6369:1: rule__Number__Group__1 : rule__Number__Group__1__Impl ;
    public final void rule__Number__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:6373:1: ( rule__Number__Group__1__Impl )
            // InternalSlideOMatic.g:6374:2: rule__Number__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Number__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Group__1"


    // $ANTLR start "rule__Number__Group__1__Impl"
    // InternalSlideOMatic.g:6380:1: rule__Number__Group__1__Impl : ( ( rule__Number__ValueAssignment_1 ) ) ;
    public final void rule__Number__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:6384:1: ( ( ( rule__Number__ValueAssignment_1 ) ) )
            // InternalSlideOMatic.g:6385:1: ( ( rule__Number__ValueAssignment_1 ) )
            {
            // InternalSlideOMatic.g:6385:1: ( ( rule__Number__ValueAssignment_1 ) )
            // InternalSlideOMatic.g:6386:2: ( rule__Number__ValueAssignment_1 )
            {
             before(grammarAccess.getNumberAccess().getValueAssignment_1()); 
            // InternalSlideOMatic.g:6387:2: ( rule__Number__ValueAssignment_1 )
            // InternalSlideOMatic.g:6387:3: rule__Number__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Number__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNumberAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Group__1__Impl"


    // $ANTLR start "rule__Presentation__NameAssignment_1"
    // InternalSlideOMatic.g:6396:1: rule__Presentation__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Presentation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:6400:1: ( ( RULE_STRING ) )
            // InternalSlideOMatic.g:6401:2: ( RULE_STRING )
            {
            // InternalSlideOMatic.g:6401:2: ( RULE_STRING )
            // InternalSlideOMatic.g:6402:3: RULE_STRING
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
    // InternalSlideOMatic.g:6411:1: rule__Presentation__SubtitleAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Presentation__SubtitleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:6415:1: ( ( RULE_STRING ) )
            // InternalSlideOMatic.g:6416:2: ( RULE_STRING )
            {
            // InternalSlideOMatic.g:6416:2: ( RULE_STRING )
            // InternalSlideOMatic.g:6417:3: RULE_STRING
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
    // InternalSlideOMatic.g:6426:1: rule__Presentation__ThemeAssignment_4_1 : ( ruleTheme ) ;
    public final void rule__Presentation__ThemeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:6430:1: ( ( ruleTheme ) )
            // InternalSlideOMatic.g:6431:2: ( ruleTheme )
            {
            // InternalSlideOMatic.g:6431:2: ( ruleTheme )
            // InternalSlideOMatic.g:6432:3: ruleTheme
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
    // InternalSlideOMatic.g:6441:1: rule__Presentation__AuthorsAssignment_4_2 : ( ruleAuthors ) ;
    public final void rule__Presentation__AuthorsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:6445:1: ( ( ruleAuthors ) )
            // InternalSlideOMatic.g:6446:2: ( ruleAuthors )
            {
            // InternalSlideOMatic.g:6446:2: ( ruleAuthors )
            // InternalSlideOMatic.g:6447:3: ruleAuthors
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
    // InternalSlideOMatic.g:6456:1: rule__Presentation__InstituteAssignment_4_3 : ( ruleInstitute ) ;
    public final void rule__Presentation__InstituteAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:6460:1: ( ( ruleInstitute ) )
            // InternalSlideOMatic.g:6461:2: ( ruleInstitute )
            {
            // InternalSlideOMatic.g:6461:2: ( ruleInstitute )
            // InternalSlideOMatic.g:6462:3: ruleInstitute
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
    // InternalSlideOMatic.g:6471:1: rule__Presentation__DateAssignment_4_4 : ( ruleDate ) ;
    public final void rule__Presentation__DateAssignment_4_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:6475:1: ( ( ruleDate ) )
            // InternalSlideOMatic.g:6476:2: ( ruleDate )
            {
            // InternalSlideOMatic.g:6476:2: ( ruleDate )
            // InternalSlideOMatic.g:6477:3: ruleDate
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
    // InternalSlideOMatic.g:6486:1: rule__Presentation__SlidesAssignment_5_0 : ( ruleSlide ) ;
    public final void rule__Presentation__SlidesAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:6490:1: ( ( ruleSlide ) )
            // InternalSlideOMatic.g:6491:2: ( ruleSlide )
            {
            // InternalSlideOMatic.g:6491:2: ( ruleSlide )
            // InternalSlideOMatic.g:6492:3: ruleSlide
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
    // InternalSlideOMatic.g:6501:1: rule__Presentation__AnimationsAssignment_5_1 : ( ruleAnimation ) ;
    public final void rule__Presentation__AnimationsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:6505:1: ( ( ruleAnimation ) )
            // InternalSlideOMatic.g:6506:2: ( ruleAnimation )
            {
            // InternalSlideOMatic.g:6506:2: ( ruleAnimation )
            // InternalSlideOMatic.g:6507:3: ruleAnimation
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
    // InternalSlideOMatic.g:6516:1: rule__Theme__ThemeAssignment_1 : ( ruleBeamerTheme ) ;
    public final void rule__Theme__ThemeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:6520:1: ( ( ruleBeamerTheme ) )
            // InternalSlideOMatic.g:6521:2: ( ruleBeamerTheme )
            {
            // InternalSlideOMatic.g:6521:2: ( ruleBeamerTheme )
            // InternalSlideOMatic.g:6522:3: ruleBeamerTheme
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
    // InternalSlideOMatic.g:6531:1: rule__Theme__ThemeColorAssignment_2_1 : ( ruleThemeColor ) ;
    public final void rule__Theme__ThemeColorAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:6535:1: ( ( ruleThemeColor ) )
            // InternalSlideOMatic.g:6536:2: ( ruleThemeColor )
            {
            // InternalSlideOMatic.g:6536:2: ( ruleThemeColor )
            // InternalSlideOMatic.g:6537:3: ruleThemeColor
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
    // InternalSlideOMatic.g:6546:1: rule__Authors__NamesAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Authors__NamesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:6550:1: ( ( RULE_STRING ) )
            // InternalSlideOMatic.g:6551:2: ( RULE_STRING )
            {
            // InternalSlideOMatic.g:6551:2: ( RULE_STRING )
            // InternalSlideOMatic.g:6552:3: RULE_STRING
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
    // InternalSlideOMatic.g:6561:1: rule__Authors__NamesAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__Authors__NamesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:6565:1: ( ( RULE_STRING ) )
            // InternalSlideOMatic.g:6566:2: ( RULE_STRING )
            {
            // InternalSlideOMatic.g:6566:2: ( RULE_STRING )
            // InternalSlideOMatic.g:6567:3: RULE_STRING
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
    // InternalSlideOMatic.g:6576:1: rule__Institute__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Institute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:6580:1: ( ( RULE_STRING ) )
            // InternalSlideOMatic.g:6581:2: ( RULE_STRING )
            {
            // InternalSlideOMatic.g:6581:2: ( RULE_STRING )
            // InternalSlideOMatic.g:6582:3: RULE_STRING
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
    // InternalSlideOMatic.g:6591:1: rule__Date__DateAssignment_1_0 : ( RULE_STRING ) ;
    public final void rule__Date__DateAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:6595:1: ( ( RULE_STRING ) )
            // InternalSlideOMatic.g:6596:2: ( RULE_STRING )
            {
            // InternalSlideOMatic.g:6596:2: ( RULE_STRING )
            // InternalSlideOMatic.g:6597:3: RULE_STRING
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
    // InternalSlideOMatic.g:6606:1: rule__Slide__SecAssignment_1_0_0 : ( ruleSection ) ;
    public final void rule__Slide__SecAssignment_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:6610:1: ( ( ruleSection ) )
            // InternalSlideOMatic.g:6611:2: ( ruleSection )
            {
            // InternalSlideOMatic.g:6611:2: ( ruleSection )
            // InternalSlideOMatic.g:6612:3: ruleSection
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
    // InternalSlideOMatic.g:6621:1: rule__Slide__NameAssignment_1_0_1 : ( RULE_STRING ) ;
    public final void rule__Slide__NameAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:6625:1: ( ( RULE_STRING ) )
            // InternalSlideOMatic.g:6626:2: ( RULE_STRING )
            {
            // InternalSlideOMatic.g:6626:2: ( RULE_STRING )
            // InternalSlideOMatic.g:6627:3: RULE_STRING
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
    // InternalSlideOMatic.g:6636:1: rule__Slide__NameAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__Slide__NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:6640:1: ( ( RULE_STRING ) )
            // InternalSlideOMatic.g:6641:2: ( RULE_STRING )
            {
            // InternalSlideOMatic.g:6641:2: ( RULE_STRING )
            // InternalSlideOMatic.g:6642:3: RULE_STRING
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
    // InternalSlideOMatic.g:6651:1: rule__Slide__ContentsAssignment_3 : ( ruleContent ) ;
    public final void rule__Slide__ContentsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:6655:1: ( ( ruleContent ) )
            // InternalSlideOMatic.g:6656:2: ( ruleContent )
            {
            // InternalSlideOMatic.g:6656:2: ( ruleContent )
            // InternalSlideOMatic.g:6657:3: ruleContent
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
    // InternalSlideOMatic.g:6666:1: rule__Content__ClickAssignment_1 : ( ruleClick ) ;
    public final void rule__Content__ClickAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:6670:1: ( ( ruleClick ) )
            // InternalSlideOMatic.g:6671:2: ( ruleClick )
            {
            // InternalSlideOMatic.g:6671:2: ( ruleClick )
            // InternalSlideOMatic.g:6672:3: ruleClick
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
    // InternalSlideOMatic.g:6681:1: rule__Text__TextAssignment : ( RULE_STRING ) ;
    public final void rule__Text__TextAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:6685:1: ( ( RULE_STRING ) )
            // InternalSlideOMatic.g:6686:2: ( RULE_STRING )
            {
            // InternalSlideOMatic.g:6686:2: ( RULE_STRING )
            // InternalSlideOMatic.g:6687:3: RULE_STRING
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
    // InternalSlideOMatic.g:6696:1: rule__Block__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Block__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:6700:1: ( ( RULE_STRING ) )
            // InternalSlideOMatic.g:6701:2: ( RULE_STRING )
            {
            // InternalSlideOMatic.g:6701:2: ( RULE_STRING )
            // InternalSlideOMatic.g:6702:3: RULE_STRING
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
    // InternalSlideOMatic.g:6711:1: rule__Block__ContentAssignment_3 : ( ruleContent ) ;
    public final void rule__Block__ContentAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:6715:1: ( ( ruleContent ) )
            // InternalSlideOMatic.g:6716:2: ( ruleContent )
            {
            // InternalSlideOMatic.g:6716:2: ( ruleContent )
            // InternalSlideOMatic.g:6717:3: ruleContent
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
    // InternalSlideOMatic.g:6726:1: rule__NumberedList__ItemsAssignment_1 : ( ruleListItem ) ;
    public final void rule__NumberedList__ItemsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:6730:1: ( ( ruleListItem ) )
            // InternalSlideOMatic.g:6731:2: ( ruleListItem )
            {
            // InternalSlideOMatic.g:6731:2: ( ruleListItem )
            // InternalSlideOMatic.g:6732:3: ruleListItem
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
    // InternalSlideOMatic.g:6741:1: rule__UnNumberedList__ItemsAssignment_1 : ( ruleListItem ) ;
    public final void rule__UnNumberedList__ItemsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:6745:1: ( ( ruleListItem ) )
            // InternalSlideOMatic.g:6746:2: ( ruleListItem )
            {
            // InternalSlideOMatic.g:6746:2: ( ruleListItem )
            // InternalSlideOMatic.g:6747:3: ruleListItem
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
    // InternalSlideOMatic.g:6756:1: rule__ListItem__ItemAssignment_1 : ( RULE_STRING ) ;
    public final void rule__ListItem__ItemAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:6760:1: ( ( RULE_STRING ) )
            // InternalSlideOMatic.g:6761:2: ( RULE_STRING )
            {
            // InternalSlideOMatic.g:6761:2: ( RULE_STRING )
            // InternalSlideOMatic.g:6762:3: RULE_STRING
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
    // InternalSlideOMatic.g:6771:1: rule__ListItem__NestedListAssignment_2_1 : ( ruleList ) ;
    public final void rule__ListItem__NestedListAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:6775:1: ( ( ruleList ) )
            // InternalSlideOMatic.g:6776:2: ( ruleList )
            {
            // InternalSlideOMatic.g:6776:2: ( ruleList )
            // InternalSlideOMatic.g:6777:3: ruleList
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
    // InternalSlideOMatic.g:6786:1: rule__ListItem__ClickAssignment_3 : ( ruleClick ) ;
    public final void rule__ListItem__ClickAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:6790:1: ( ( ruleClick ) )
            // InternalSlideOMatic.g:6791:2: ( ruleClick )
            {
            // InternalSlideOMatic.g:6791:2: ( ruleClick )
            // InternalSlideOMatic.g:6792:3: ruleClick
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
    // InternalSlideOMatic.g:6801:1: rule__Image__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Image__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:6805:1: ( ( RULE_ID ) )
            // InternalSlideOMatic.g:6806:2: ( RULE_ID )
            {
            // InternalSlideOMatic.g:6806:2: ( RULE_ID )
            // InternalSlideOMatic.g:6807:3: RULE_ID
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
    // InternalSlideOMatic.g:6816:1: rule__Image__SrcAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Image__SrcAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:6820:1: ( ( RULE_STRING ) )
            // InternalSlideOMatic.g:6821:2: ( RULE_STRING )
            {
            // InternalSlideOMatic.g:6821:2: ( RULE_STRING )
            // InternalSlideOMatic.g:6822:3: RULE_STRING
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
    // InternalSlideOMatic.g:6831:1: rule__Image__AlignmentAssignment_4 : ( ruleAlignment ) ;
    public final void rule__Image__AlignmentAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:6835:1: ( ( ruleAlignment ) )
            // InternalSlideOMatic.g:6836:2: ( ruleAlignment )
            {
            // InternalSlideOMatic.g:6836:2: ( ruleAlignment )
            // InternalSlideOMatic.g:6837:3: ruleAlignment
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
    // InternalSlideOMatic.g:6846:1: rule__Image__SizeAssignment_5 : ( ruleSize ) ;
    public final void rule__Image__SizeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:6850:1: ( ( ruleSize ) )
            // InternalSlideOMatic.g:6851:2: ( ruleSize )
            {
            // InternalSlideOMatic.g:6851:2: ( ruleSize )
            // InternalSlideOMatic.g:6852:3: ruleSize
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
    // InternalSlideOMatic.g:6861:1: rule__Size__WayAssignment_0_1 : ( ruleWay ) ;
    public final void rule__Size__WayAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:6865:1: ( ( ruleWay ) )
            // InternalSlideOMatic.g:6866:2: ( ruleWay )
            {
            // InternalSlideOMatic.g:6866:2: ( ruleWay )
            // InternalSlideOMatic.g:6867:3: ruleWay
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
    // InternalSlideOMatic.g:6876:1: rule__Size__ScaleAssignment_0_2 : ( RULE_INT ) ;
    public final void rule__Size__ScaleAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:6880:1: ( ( RULE_INT ) )
            // InternalSlideOMatic.g:6881:2: ( RULE_INT )
            {
            // InternalSlideOMatic.g:6881:2: ( RULE_INT )
            // InternalSlideOMatic.g:6882:3: RULE_INT
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
    // InternalSlideOMatic.g:6891:1: rule__Size__SizeAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__Size__SizeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:6895:1: ( ( RULE_INT ) )
            // InternalSlideOMatic.g:6896:2: ( RULE_INT )
            {
            // InternalSlideOMatic.g:6896:2: ( RULE_INT )
            // InternalSlideOMatic.g:6897:3: RULE_INT
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
    // InternalSlideOMatic.g:6906:1: rule__Size__UnitAssignment_1_2 : ( ( rule__Size__UnitAlternatives_1_2_0 ) ) ;
    public final void rule__Size__UnitAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:6910:1: ( ( ( rule__Size__UnitAlternatives_1_2_0 ) ) )
            // InternalSlideOMatic.g:6911:2: ( ( rule__Size__UnitAlternatives_1_2_0 ) )
            {
            // InternalSlideOMatic.g:6911:2: ( ( rule__Size__UnitAlternatives_1_2_0 ) )
            // InternalSlideOMatic.g:6912:3: ( rule__Size__UnitAlternatives_1_2_0 )
            {
             before(grammarAccess.getSizeAccess().getUnitAlternatives_1_2_0()); 
            // InternalSlideOMatic.g:6913:3: ( rule__Size__UnitAlternatives_1_2_0 )
            // InternalSlideOMatic.g:6913:4: rule__Size__UnitAlternatives_1_2_0
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
    // InternalSlideOMatic.g:6921:1: rule__Table__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Table__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:6925:1: ( ( RULE_ID ) )
            // InternalSlideOMatic.g:6926:2: ( RULE_ID )
            {
            // InternalSlideOMatic.g:6926:2: ( RULE_ID )
            // InternalSlideOMatic.g:6927:3: RULE_ID
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
    // InternalSlideOMatic.g:6936:1: rule__Table__RowsAssignment_3 : ( ruleTableRow ) ;
    public final void rule__Table__RowsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:6940:1: ( ( ruleTableRow ) )
            // InternalSlideOMatic.g:6941:2: ( ruleTableRow )
            {
            // InternalSlideOMatic.g:6941:2: ( ruleTableRow )
            // InternalSlideOMatic.g:6942:3: ruleTableRow
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
    // InternalSlideOMatic.g:6951:1: rule__Table__RowsAssignment_4_1 : ( ruleTableRow ) ;
    public final void rule__Table__RowsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:6955:1: ( ( ruleTableRow ) )
            // InternalSlideOMatic.g:6956:2: ( ruleTableRow )
            {
            // InternalSlideOMatic.g:6956:2: ( ruleTableRow )
            // InternalSlideOMatic.g:6957:3: ruleTableRow
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
    // InternalSlideOMatic.g:6966:1: rule__TableRow__ValuesAssignment_1 : ( RULE_STRING ) ;
    public final void rule__TableRow__ValuesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:6970:1: ( ( RULE_STRING ) )
            // InternalSlideOMatic.g:6971:2: ( RULE_STRING )
            {
            // InternalSlideOMatic.g:6971:2: ( RULE_STRING )
            // InternalSlideOMatic.g:6972:3: RULE_STRING
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
    // InternalSlideOMatic.g:6981:1: rule__TableRow__ValuesAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__TableRow__ValuesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:6985:1: ( ( RULE_STRING ) )
            // InternalSlideOMatic.g:6986:2: ( RULE_STRING )
            {
            // InternalSlideOMatic.g:6986:2: ( RULE_STRING )
            // InternalSlideOMatic.g:6987:3: RULE_STRING
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


    // $ANTLR start "rule__Code__LangAssignment_0_2"
    // InternalSlideOMatic.g:6996:1: rule__Code__LangAssignment_0_2 : ( RULE_ID ) ;
    public final void rule__Code__LangAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:7000:1: ( ( RULE_ID ) )
            // InternalSlideOMatic.g:7001:2: ( RULE_ID )
            {
            // InternalSlideOMatic.g:7001:2: ( RULE_ID )
            // InternalSlideOMatic.g:7002:3: RULE_ID
            {
             before(grammarAccess.getCodeAccess().getLangIDTerminalRuleCall_0_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCodeAccess().getLangIDTerminalRuleCall_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Code__LangAssignment_0_2"


    // $ANTLR start "rule__Code__CodeAssignment_0_3"
    // InternalSlideOMatic.g:7011:1: rule__Code__CodeAssignment_0_3 : ( RULE_STRING ) ;
    public final void rule__Code__CodeAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:7015:1: ( ( RULE_STRING ) )
            // InternalSlideOMatic.g:7016:2: ( RULE_STRING )
            {
            // InternalSlideOMatic.g:7016:2: ( RULE_STRING )
            // InternalSlideOMatic.g:7017:3: RULE_STRING
            {
             before(grammarAccess.getCodeAccess().getCodeSTRINGTerminalRuleCall_0_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCodeAccess().getCodeSTRINGTerminalRuleCall_0_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Code__CodeAssignment_0_3"


    // $ANTLR start "rule__Code__LangAssignment_1_2"
    // InternalSlideOMatic.g:7026:1: rule__Code__LangAssignment_1_2 : ( RULE_ID ) ;
    public final void rule__Code__LangAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:7030:1: ( ( RULE_ID ) )
            // InternalSlideOMatic.g:7031:2: ( RULE_ID )
            {
            // InternalSlideOMatic.g:7031:2: ( RULE_ID )
            // InternalSlideOMatic.g:7032:3: RULE_ID
            {
             before(grammarAccess.getCodeAccess().getLangIDTerminalRuleCall_1_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCodeAccess().getLangIDTerminalRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Code__LangAssignment_1_2"


    // $ANTLR start "rule__Code__SrcAssignment_1_3"
    // InternalSlideOMatic.g:7041:1: rule__Code__SrcAssignment_1_3 : ( RULE_STRING ) ;
    public final void rule__Code__SrcAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:7045:1: ( ( RULE_STRING ) )
            // InternalSlideOMatic.g:7046:2: ( RULE_STRING )
            {
            // InternalSlideOMatic.g:7046:2: ( RULE_STRING )
            // InternalSlideOMatic.g:7047:3: RULE_STRING
            {
             before(grammarAccess.getCodeAccess().getSrcSTRINGTerminalRuleCall_1_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCodeAccess().getSrcSTRINGTerminalRuleCall_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Code__SrcAssignment_1_3"


    // $ANTLR start "rule__Code__LinesAssignment_1_4_2"
    // InternalSlideOMatic.g:7056:1: rule__Code__LinesAssignment_1_4_2 : ( ruleLineSequence ) ;
    public final void rule__Code__LinesAssignment_1_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:7060:1: ( ( ruleLineSequence ) )
            // InternalSlideOMatic.g:7061:2: ( ruleLineSequence )
            {
            // InternalSlideOMatic.g:7061:2: ( ruleLineSequence )
            // InternalSlideOMatic.g:7062:3: ruleLineSequence
            {
             before(grammarAccess.getCodeAccess().getLinesLineSequenceParserRuleCall_1_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleLineSequence();

            state._fsp--;

             after(grammarAccess.getCodeAccess().getLinesLineSequenceParserRuleCall_1_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Code__LinesAssignment_1_4_2"


    // $ANTLR start "rule__Code__LinesAssignment_1_4_4_2"
    // InternalSlideOMatic.g:7071:1: rule__Code__LinesAssignment_1_4_4_2 : ( ruleLineSequence ) ;
    public final void rule__Code__LinesAssignment_1_4_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:7075:1: ( ( ruleLineSequence ) )
            // InternalSlideOMatic.g:7076:2: ( ruleLineSequence )
            {
            // InternalSlideOMatic.g:7076:2: ( ruleLineSequence )
            // InternalSlideOMatic.g:7077:3: ruleLineSequence
            {
             before(grammarAccess.getCodeAccess().getLinesLineSequenceParserRuleCall_1_4_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleLineSequence();

            state._fsp--;

             after(grammarAccess.getCodeAccess().getLinesLineSequenceParserRuleCall_1_4_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Code__LinesAssignment_1_4_4_2"


    // $ANTLR start "rule__LineSequence__LowerAssignment_0"
    // InternalSlideOMatic.g:7086:1: rule__LineSequence__LowerAssignment_0 : ( RULE_INT ) ;
    public final void rule__LineSequence__LowerAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:7090:1: ( ( RULE_INT ) )
            // InternalSlideOMatic.g:7091:2: ( RULE_INT )
            {
            // InternalSlideOMatic.g:7091:2: ( RULE_INT )
            // InternalSlideOMatic.g:7092:3: RULE_INT
            {
             before(grammarAccess.getLineSequenceAccess().getLowerINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getLineSequenceAccess().getLowerINTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineSequence__LowerAssignment_0"


    // $ANTLR start "rule__LineSequence__UpperAssignment_1_1"
    // InternalSlideOMatic.g:7101:1: rule__LineSequence__UpperAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__LineSequence__UpperAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:7105:1: ( ( RULE_INT ) )
            // InternalSlideOMatic.g:7106:2: ( RULE_INT )
            {
            // InternalSlideOMatic.g:7106:2: ( RULE_INT )
            // InternalSlideOMatic.g:7107:3: RULE_INT
            {
             before(grammarAccess.getLineSequenceAccess().getUpperINTTerminalRuleCall_1_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getLineSequenceAccess().getUpperINTTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineSequence__UpperAssignment_1_1"


    // $ANTLR start "rule__LineSequence__AdditionalAssignment_2_1"
    // InternalSlideOMatic.g:7116:1: rule__LineSequence__AdditionalAssignment_2_1 : ( ruleLineSequence ) ;
    public final void rule__LineSequence__AdditionalAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:7120:1: ( ( ruleLineSequence ) )
            // InternalSlideOMatic.g:7121:2: ( ruleLineSequence )
            {
            // InternalSlideOMatic.g:7121:2: ( ruleLineSequence )
            // InternalSlideOMatic.g:7122:3: ruleLineSequence
            {
             before(grammarAccess.getLineSequenceAccess().getAdditionalLineSequenceParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLineSequence();

            state._fsp--;

             after(grammarAccess.getLineSequenceAccess().getAdditionalLineSequenceParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineSequence__AdditionalAssignment_2_1"


    // $ANTLR start "rule__Animation__TargetAssignment_1"
    // InternalSlideOMatic.g:7131:1: rule__Animation__TargetAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Animation__TargetAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:7135:1: ( ( ( RULE_ID ) ) )
            // InternalSlideOMatic.g:7136:2: ( ( RULE_ID ) )
            {
            // InternalSlideOMatic.g:7136:2: ( ( RULE_ID ) )
            // InternalSlideOMatic.g:7137:3: ( RULE_ID )
            {
             before(grammarAccess.getAnimationAccess().getTargetImageCrossReference_1_0()); 
            // InternalSlideOMatic.g:7138:3: ( RULE_ID )
            // InternalSlideOMatic.g:7139:4: RULE_ID
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
    // InternalSlideOMatic.g:7150:1: rule__Animation__TypeAssignment_2 : ( ruleAnimationType ) ;
    public final void rule__Animation__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:7154:1: ( ( ruleAnimationType ) )
            // InternalSlideOMatic.g:7155:2: ( ruleAnimationType )
            {
            // InternalSlideOMatic.g:7155:2: ( ruleAnimationType )
            // InternalSlideOMatic.g:7156:3: ruleAnimationType
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
    // InternalSlideOMatic.g:7165:1: rule__Animation__LocationAssignment_4 : ( ruleAlignment ) ;
    public final void rule__Animation__LocationAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:7169:1: ( ( ruleAlignment ) )
            // InternalSlideOMatic.g:7170:2: ( ruleAlignment )
            {
            // InternalSlideOMatic.g:7170:2: ( ruleAlignment )
            // InternalSlideOMatic.g:7171:3: ruleAlignment
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
    // InternalSlideOMatic.g:7180:1: rule__Animation__SizeAssignment_5 : ( ruleSize ) ;
    public final void rule__Animation__SizeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:7184:1: ( ( ruleSize ) )
            // InternalSlideOMatic.g:7185:2: ( ruleSize )
            {
            // InternalSlideOMatic.g:7185:2: ( ruleSize )
            // InternalSlideOMatic.g:7186:3: ruleSize
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


    // $ANTLR start "rule__MathExp__EvalAssignment_1"
    // InternalSlideOMatic.g:7195:1: rule__MathExp__EvalAssignment_1 : ( ( 'eval' ) ) ;
    public final void rule__MathExp__EvalAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:7199:1: ( ( ( 'eval' ) ) )
            // InternalSlideOMatic.g:7200:2: ( ( 'eval' ) )
            {
            // InternalSlideOMatic.g:7200:2: ( ( 'eval' ) )
            // InternalSlideOMatic.g:7201:3: ( 'eval' )
            {
             before(grammarAccess.getMathExpAccess().getEvalEvalKeyword_1_0()); 
            // InternalSlideOMatic.g:7202:3: ( 'eval' )
            // InternalSlideOMatic.g:7203:4: 'eval'
            {
             before(grammarAccess.getMathExpAccess().getEvalEvalKeyword_1_0()); 
            match(input,113,FOLLOW_2); 
             after(grammarAccess.getMathExpAccess().getEvalEvalKeyword_1_0()); 

            }

             after(grammarAccess.getMathExpAccess().getEvalEvalKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MathExp__EvalAssignment_1"


    // $ANTLR start "rule__MathExp__ExpAssignment_2"
    // InternalSlideOMatic.g:7214:1: rule__MathExp__ExpAssignment_2 : ( ruleExp ) ;
    public final void rule__MathExp__ExpAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:7218:1: ( ( ruleExp ) )
            // InternalSlideOMatic.g:7219:2: ( ruleExp )
            {
            // InternalSlideOMatic.g:7219:2: ( ruleExp )
            // InternalSlideOMatic.g:7220:3: ruleExp
            {
             before(grammarAccess.getMathExpAccess().getExpExpParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getMathExpAccess().getExpExpParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MathExp__ExpAssignment_2"


    // $ANTLR start "rule__Exp__RightAssignment_1_1"
    // InternalSlideOMatic.g:7229:1: rule__Exp__RightAssignment_1_1 : ( ruleFactor ) ;
    public final void rule__Exp__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:7233:1: ( ( ruleFactor ) )
            // InternalSlideOMatic.g:7234:2: ( ruleFactor )
            {
            // InternalSlideOMatic.g:7234:2: ( ruleFactor )
            // InternalSlideOMatic.g:7235:3: ruleFactor
            {
             before(grammarAccess.getExpAccess().getRightFactorParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFactor();

            state._fsp--;

             after(grammarAccess.getExpAccess().getRightFactorParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__RightAssignment_1_1"


    // $ANTLR start "rule__Factor__RightAssignment_1_1"
    // InternalSlideOMatic.g:7244:1: rule__Factor__RightAssignment_1_1 : ( rulePow ) ;
    public final void rule__Factor__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:7248:1: ( ( rulePow ) )
            // InternalSlideOMatic.g:7249:2: ( rulePow )
            {
            // InternalSlideOMatic.g:7249:2: ( rulePow )
            // InternalSlideOMatic.g:7250:3: rulePow
            {
             before(grammarAccess.getFactorAccess().getRightPowParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            rulePow();

            state._fsp--;

             after(grammarAccess.getFactorAccess().getRightPowParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__RightAssignment_1_1"


    // $ANTLR start "rule__Pow__RightAssignment_1_2"
    // InternalSlideOMatic.g:7259:1: rule__Pow__RightAssignment_1_2 : ( rulePrimary ) ;
    public final void rule__Pow__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:7263:1: ( ( rulePrimary ) )
            // InternalSlideOMatic.g:7264:2: ( rulePrimary )
            {
            // InternalSlideOMatic.g:7264:2: ( rulePrimary )
            // InternalSlideOMatic.g:7265:3: rulePrimary
            {
             before(grammarAccess.getPowAccess().getRightPrimaryParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getPowAccess().getRightPrimaryParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pow__RightAssignment_1_2"


    // $ANTLR start "rule__VariableUse__IdAssignment_1"
    // InternalSlideOMatic.g:7274:1: rule__VariableUse__IdAssignment_1 : ( RULE_ID ) ;
    public final void rule__VariableUse__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:7278:1: ( ( RULE_ID ) )
            // InternalSlideOMatic.g:7279:2: ( RULE_ID )
            {
            // InternalSlideOMatic.g:7279:2: ( RULE_ID )
            // InternalSlideOMatic.g:7280:3: RULE_ID
            {
             before(grammarAccess.getVariableUseAccess().getIdIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVariableUseAccess().getIdIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableUse__IdAssignment_1"


    // $ANTLR start "rule__VariableBinding__IdAssignment_2"
    // InternalSlideOMatic.g:7289:1: rule__VariableBinding__IdAssignment_2 : ( RULE_ID ) ;
    public final void rule__VariableBinding__IdAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:7293:1: ( ( RULE_ID ) )
            // InternalSlideOMatic.g:7294:2: ( RULE_ID )
            {
            // InternalSlideOMatic.g:7294:2: ( RULE_ID )
            // InternalSlideOMatic.g:7295:3: RULE_ID
            {
             before(grammarAccess.getVariableBindingAccess().getIdIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVariableBindingAccess().getIdIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableBinding__IdAssignment_2"


    // $ANTLR start "rule__VariableBinding__BindingAssignment_4"
    // InternalSlideOMatic.g:7304:1: rule__VariableBinding__BindingAssignment_4 : ( ruleExp ) ;
    public final void rule__VariableBinding__BindingAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:7308:1: ( ( ruleExp ) )
            // InternalSlideOMatic.g:7309:2: ( ruleExp )
            {
            // InternalSlideOMatic.g:7309:2: ( ruleExp )
            // InternalSlideOMatic.g:7310:3: ruleExp
            {
             before(grammarAccess.getVariableBindingAccess().getBindingExpParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getVariableBindingAccess().getBindingExpParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableBinding__BindingAssignment_4"


    // $ANTLR start "rule__VariableBinding__BodyAssignment_6"
    // InternalSlideOMatic.g:7319:1: rule__VariableBinding__BodyAssignment_6 : ( ruleExp ) ;
    public final void rule__VariableBinding__BodyAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:7323:1: ( ( ruleExp ) )
            // InternalSlideOMatic.g:7324:2: ( ruleExp )
            {
            // InternalSlideOMatic.g:7324:2: ( ruleExp )
            // InternalSlideOMatic.g:7325:3: ruleExp
            {
             before(grammarAccess.getVariableBindingAccess().getBodyExpParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getVariableBindingAccess().getBodyExpParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableBinding__BodyAssignment_6"


    // $ANTLR start "rule__Number__ValueAssignment_1"
    // InternalSlideOMatic.g:7334:1: rule__Number__ValueAssignment_1 : ( RULE_INT ) ;
    public final void rule__Number__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:7338:1: ( ( RULE_INT ) )
            // InternalSlideOMatic.g:7339:2: ( RULE_INT )
            {
            // InternalSlideOMatic.g:7339:2: ( RULE_INT )
            // InternalSlideOMatic.g:7340:3: RULE_INT
            {
             before(grammarAccess.getNumberAccess().getValueINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getNumberAccess().getValueINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__ValueAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000080L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000000L,0x0000004000020300L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000002L,0x0000004000020000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0300000000000000L,0x000000000000CC00L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000FFFFFFF000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00FFFF0000400000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000010L,0x0000000000010000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000010L,0x00000000000D0080L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000010L,0x0000040A42F00000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000012L,0x0000040A42F00000L});
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
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000000L,0x0000000A00000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000000L,0x0000001400000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000000L,0x0000002000002000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000000L,0x0000030000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0xFC00000000000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000060L,0x0002400000000200L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000000L,0x0000080001000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000002L,0x0000080001000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000000L,0x0000100000010000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000000002L,0x0000100000010000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});

}