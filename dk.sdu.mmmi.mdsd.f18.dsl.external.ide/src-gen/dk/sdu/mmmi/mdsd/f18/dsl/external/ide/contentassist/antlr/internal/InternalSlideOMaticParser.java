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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'$$'", "'AnnArbor'", "'Antibes'", "'Bergen'", "'Berkeley'", "'Berlin'", "'Boadilla'", "'boxes'", "'CambridgeUS'", "'Copenhagen'", "'Darmstadt'", "'default'", "'Dresden'", "'Frankfurt'", "'Goettingen'", "'Hannover'", "'Ilmanau'", "'JuanLesPins'", "'Luebeck'", "'Madrid'", "'Malmoe'", "'Marburg'", "'Montpellier'", "'PaloAlto'", "'Pittsburgh'", "'Rochester'", "'Singapore'", "'Szeged'", "'Warsaw'", "'albatros'", "'beaver'", "'beetle'", "'crane'", "'dolphin'", "'dove'", "'fly'", "'lily'", "'orchid'", "'rose'", "'seagull'", "'seahorse'", "'sidebartab'", "'structure'", "'whale'", "'wolverine'", "'author'", "'authors'", "'left'", "'center'", "'right'", "'cm'", "'em'", "'mm'", "'presentation'", "'{'", "'}'", "'('", "')'", "'theme'", "'color'", "','", "'institute'", "'date'", "'*'", "'slide'", "'**'", "'***'", "'ToC'", "'b'", "'i'", "'u'", "'fnote'", "'url'", "'block'", "'#list'", "'&list'", "'-'", "'img'", "'src'", "'align'", "'showimg'", "'%'", "'width'", "'height'", "'tab'", "'['", "']'", "'code'", "'end'", "'filecode'", "'show'", "':'", "'animate'", "'from'", "'to'", "'via'", "'math'", "'+'", "'/'", "'^'", "'let'", "'='", "'in'", "'eval'"
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


    // $ANTLR start "entryRuleTextType"
    // InternalSlideOMatic.g:353:1: entryRuleTextType : ruleTextType EOF ;
    public final void entryRuleTextType() throws RecognitionException {
        try {
            // InternalSlideOMatic.g:354:1: ( ruleTextType EOF )
            // InternalSlideOMatic.g:355:1: ruleTextType EOF
            {
             before(grammarAccess.getTextTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleTextType();

            state._fsp--;

             after(grammarAccess.getTextTypeRule()); 
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
    // $ANTLR end "entryRuleTextType"


    // $ANTLR start "ruleTextType"
    // InternalSlideOMatic.g:362:1: ruleTextType : ( ( rule__TextType__Alternatives ) ) ;
    public final void ruleTextType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:366:2: ( ( ( rule__TextType__Alternatives ) ) )
            // InternalSlideOMatic.g:367:2: ( ( rule__TextType__Alternatives ) )
            {
            // InternalSlideOMatic.g:367:2: ( ( rule__TextType__Alternatives ) )
            // InternalSlideOMatic.g:368:3: ( rule__TextType__Alternatives )
            {
             before(grammarAccess.getTextTypeAccess().getAlternatives()); 
            // InternalSlideOMatic.g:369:3: ( rule__TextType__Alternatives )
            // InternalSlideOMatic.g:369:4: rule__TextType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TextType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTextTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTextType"


    // $ANTLR start "entryRuleBlock"
    // InternalSlideOMatic.g:378:1: entryRuleBlock : ruleBlock EOF ;
    public final void entryRuleBlock() throws RecognitionException {
        try {
            // InternalSlideOMatic.g:379:1: ( ruleBlock EOF )
            // InternalSlideOMatic.g:380:1: ruleBlock EOF
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
    // InternalSlideOMatic.g:387:1: ruleBlock : ( ( rule__Block__Group__0 ) ) ;
    public final void ruleBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:391:2: ( ( ( rule__Block__Group__0 ) ) )
            // InternalSlideOMatic.g:392:2: ( ( rule__Block__Group__0 ) )
            {
            // InternalSlideOMatic.g:392:2: ( ( rule__Block__Group__0 ) )
            // InternalSlideOMatic.g:393:3: ( rule__Block__Group__0 )
            {
             before(grammarAccess.getBlockAccess().getGroup()); 
            // InternalSlideOMatic.g:394:3: ( rule__Block__Group__0 )
            // InternalSlideOMatic.g:394:4: rule__Block__Group__0
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
    // InternalSlideOMatic.g:403:1: entryRuleList : ruleList EOF ;
    public final void entryRuleList() throws RecognitionException {
        try {
            // InternalSlideOMatic.g:404:1: ( ruleList EOF )
            // InternalSlideOMatic.g:405:1: ruleList EOF
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
    // InternalSlideOMatic.g:412:1: ruleList : ( ( rule__List__Alternatives ) ) ;
    public final void ruleList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:416:2: ( ( ( rule__List__Alternatives ) ) )
            // InternalSlideOMatic.g:417:2: ( ( rule__List__Alternatives ) )
            {
            // InternalSlideOMatic.g:417:2: ( ( rule__List__Alternatives ) )
            // InternalSlideOMatic.g:418:3: ( rule__List__Alternatives )
            {
             before(grammarAccess.getListAccess().getAlternatives()); 
            // InternalSlideOMatic.g:419:3: ( rule__List__Alternatives )
            // InternalSlideOMatic.g:419:4: rule__List__Alternatives
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
    // InternalSlideOMatic.g:428:1: entryRuleNumberedList : ruleNumberedList EOF ;
    public final void entryRuleNumberedList() throws RecognitionException {
        try {
            // InternalSlideOMatic.g:429:1: ( ruleNumberedList EOF )
            // InternalSlideOMatic.g:430:1: ruleNumberedList EOF
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
    // InternalSlideOMatic.g:437:1: ruleNumberedList : ( ( rule__NumberedList__Group__0 ) ) ;
    public final void ruleNumberedList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:441:2: ( ( ( rule__NumberedList__Group__0 ) ) )
            // InternalSlideOMatic.g:442:2: ( ( rule__NumberedList__Group__0 ) )
            {
            // InternalSlideOMatic.g:442:2: ( ( rule__NumberedList__Group__0 ) )
            // InternalSlideOMatic.g:443:3: ( rule__NumberedList__Group__0 )
            {
             before(grammarAccess.getNumberedListAccess().getGroup()); 
            // InternalSlideOMatic.g:444:3: ( rule__NumberedList__Group__0 )
            // InternalSlideOMatic.g:444:4: rule__NumberedList__Group__0
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
    // InternalSlideOMatic.g:453:1: entryRuleUnNumberedList : ruleUnNumberedList EOF ;
    public final void entryRuleUnNumberedList() throws RecognitionException {
        try {
            // InternalSlideOMatic.g:454:1: ( ruleUnNumberedList EOF )
            // InternalSlideOMatic.g:455:1: ruleUnNumberedList EOF
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
    // InternalSlideOMatic.g:462:1: ruleUnNumberedList : ( ( rule__UnNumberedList__Group__0 ) ) ;
    public final void ruleUnNumberedList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:466:2: ( ( ( rule__UnNumberedList__Group__0 ) ) )
            // InternalSlideOMatic.g:467:2: ( ( rule__UnNumberedList__Group__0 ) )
            {
            // InternalSlideOMatic.g:467:2: ( ( rule__UnNumberedList__Group__0 ) )
            // InternalSlideOMatic.g:468:3: ( rule__UnNumberedList__Group__0 )
            {
             before(grammarAccess.getUnNumberedListAccess().getGroup()); 
            // InternalSlideOMatic.g:469:3: ( rule__UnNumberedList__Group__0 )
            // InternalSlideOMatic.g:469:4: rule__UnNumberedList__Group__0
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
    // InternalSlideOMatic.g:478:1: entryRuleListItem : ruleListItem EOF ;
    public final void entryRuleListItem() throws RecognitionException {
        try {
            // InternalSlideOMatic.g:479:1: ( ruleListItem EOF )
            // InternalSlideOMatic.g:480:1: ruleListItem EOF
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
    // InternalSlideOMatic.g:487:1: ruleListItem : ( ( rule__ListItem__Group__0 ) ) ;
    public final void ruleListItem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:491:2: ( ( ( rule__ListItem__Group__0 ) ) )
            // InternalSlideOMatic.g:492:2: ( ( rule__ListItem__Group__0 ) )
            {
            // InternalSlideOMatic.g:492:2: ( ( rule__ListItem__Group__0 ) )
            // InternalSlideOMatic.g:493:3: ( rule__ListItem__Group__0 )
            {
             before(grammarAccess.getListItemAccess().getGroup()); 
            // InternalSlideOMatic.g:494:3: ( rule__ListItem__Group__0 )
            // InternalSlideOMatic.g:494:4: rule__ListItem__Group__0
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


    // $ANTLR start "entryRuleShowImage"
    // InternalSlideOMatic.g:528:1: entryRuleShowImage : ruleShowImage EOF ;
    public final void entryRuleShowImage() throws RecognitionException {
        try {
            // InternalSlideOMatic.g:529:1: ( ruleShowImage EOF )
            // InternalSlideOMatic.g:530:1: ruleShowImage EOF
            {
             before(grammarAccess.getShowImageRule()); 
            pushFollow(FOLLOW_1);
            ruleShowImage();

            state._fsp--;

             after(grammarAccess.getShowImageRule()); 
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
    // $ANTLR end "entryRuleShowImage"


    // $ANTLR start "ruleShowImage"
    // InternalSlideOMatic.g:537:1: ruleShowImage : ( ( rule__ShowImage__Group__0 ) ) ;
    public final void ruleShowImage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:541:2: ( ( ( rule__ShowImage__Group__0 ) ) )
            // InternalSlideOMatic.g:542:2: ( ( rule__ShowImage__Group__0 ) )
            {
            // InternalSlideOMatic.g:542:2: ( ( rule__ShowImage__Group__0 ) )
            // InternalSlideOMatic.g:543:3: ( rule__ShowImage__Group__0 )
            {
             before(grammarAccess.getShowImageAccess().getGroup()); 
            // InternalSlideOMatic.g:544:3: ( rule__ShowImage__Group__0 )
            // InternalSlideOMatic.g:544:4: rule__ShowImage__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ShowImage__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getShowImageAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleShowImage"


    // $ANTLR start "entryRuleAlignment"
    // InternalSlideOMatic.g:553:1: entryRuleAlignment : ruleAlignment EOF ;
    public final void entryRuleAlignment() throws RecognitionException {
        try {
            // InternalSlideOMatic.g:554:1: ( ruleAlignment EOF )
            // InternalSlideOMatic.g:555:1: ruleAlignment EOF
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
    // InternalSlideOMatic.g:562:1: ruleAlignment : ( ( rule__Alignment__Alternatives ) ) ;
    public final void ruleAlignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:566:2: ( ( ( rule__Alignment__Alternatives ) ) )
            // InternalSlideOMatic.g:567:2: ( ( rule__Alignment__Alternatives ) )
            {
            // InternalSlideOMatic.g:567:2: ( ( rule__Alignment__Alternatives ) )
            // InternalSlideOMatic.g:568:3: ( rule__Alignment__Alternatives )
            {
             before(grammarAccess.getAlignmentAccess().getAlternatives()); 
            // InternalSlideOMatic.g:569:3: ( rule__Alignment__Alternatives )
            // InternalSlideOMatic.g:569:4: rule__Alignment__Alternatives
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
    // InternalSlideOMatic.g:578:1: entryRuleSize : ruleSize EOF ;
    public final void entryRuleSize() throws RecognitionException {
        try {
            // InternalSlideOMatic.g:579:1: ( ruleSize EOF )
            // InternalSlideOMatic.g:580:1: ruleSize EOF
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
    // InternalSlideOMatic.g:587:1: ruleSize : ( ( rule__Size__Alternatives ) ) ;
    public final void ruleSize() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:591:2: ( ( ( rule__Size__Alternatives ) ) )
            // InternalSlideOMatic.g:592:2: ( ( rule__Size__Alternatives ) )
            {
            // InternalSlideOMatic.g:592:2: ( ( rule__Size__Alternatives ) )
            // InternalSlideOMatic.g:593:3: ( rule__Size__Alternatives )
            {
             before(grammarAccess.getSizeAccess().getAlternatives()); 
            // InternalSlideOMatic.g:594:3: ( rule__Size__Alternatives )
            // InternalSlideOMatic.g:594:4: rule__Size__Alternatives
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
    // InternalSlideOMatic.g:603:1: entryRuleWay : ruleWay EOF ;
    public final void entryRuleWay() throws RecognitionException {
        try {
            // InternalSlideOMatic.g:604:1: ( ruleWay EOF )
            // InternalSlideOMatic.g:605:1: ruleWay EOF
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
    // InternalSlideOMatic.g:612:1: ruleWay : ( ( rule__Way__Alternatives ) ) ;
    public final void ruleWay() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:616:2: ( ( ( rule__Way__Alternatives ) ) )
            // InternalSlideOMatic.g:617:2: ( ( rule__Way__Alternatives ) )
            {
            // InternalSlideOMatic.g:617:2: ( ( rule__Way__Alternatives ) )
            // InternalSlideOMatic.g:618:3: ( rule__Way__Alternatives )
            {
             before(grammarAccess.getWayAccess().getAlternatives()); 
            // InternalSlideOMatic.g:619:3: ( rule__Way__Alternatives )
            // InternalSlideOMatic.g:619:4: rule__Way__Alternatives
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
    // InternalSlideOMatic.g:628:1: entryRuleTable : ruleTable EOF ;
    public final void entryRuleTable() throws RecognitionException {
        try {
            // InternalSlideOMatic.g:629:1: ( ruleTable EOF )
            // InternalSlideOMatic.g:630:1: ruleTable EOF
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
    // InternalSlideOMatic.g:637:1: ruleTable : ( ( rule__Table__Group__0 ) ) ;
    public final void ruleTable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:641:2: ( ( ( rule__Table__Group__0 ) ) )
            // InternalSlideOMatic.g:642:2: ( ( rule__Table__Group__0 ) )
            {
            // InternalSlideOMatic.g:642:2: ( ( rule__Table__Group__0 ) )
            // InternalSlideOMatic.g:643:3: ( rule__Table__Group__0 )
            {
             before(grammarAccess.getTableAccess().getGroup()); 
            // InternalSlideOMatic.g:644:3: ( rule__Table__Group__0 )
            // InternalSlideOMatic.g:644:4: rule__Table__Group__0
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
    // InternalSlideOMatic.g:653:1: entryRuleTableRow : ruleTableRow EOF ;
    public final void entryRuleTableRow() throws RecognitionException {
        try {
            // InternalSlideOMatic.g:654:1: ( ruleTableRow EOF )
            // InternalSlideOMatic.g:655:1: ruleTableRow EOF
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
    // InternalSlideOMatic.g:662:1: ruleTableRow : ( ( rule__TableRow__Group__0 ) ) ;
    public final void ruleTableRow() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:666:2: ( ( ( rule__TableRow__Group__0 ) ) )
            // InternalSlideOMatic.g:667:2: ( ( rule__TableRow__Group__0 ) )
            {
            // InternalSlideOMatic.g:667:2: ( ( rule__TableRow__Group__0 ) )
            // InternalSlideOMatic.g:668:3: ( rule__TableRow__Group__0 )
            {
             before(grammarAccess.getTableRowAccess().getGroup()); 
            // InternalSlideOMatic.g:669:3: ( rule__TableRow__Group__0 )
            // InternalSlideOMatic.g:669:4: rule__TableRow__Group__0
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
    // InternalSlideOMatic.g:678:1: entryRuleCode : ruleCode EOF ;
    public final void entryRuleCode() throws RecognitionException {
        try {
            // InternalSlideOMatic.g:679:1: ( ruleCode EOF )
            // InternalSlideOMatic.g:680:1: ruleCode EOF
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
    // InternalSlideOMatic.g:687:1: ruleCode : ( ( rule__Code__Alternatives ) ) ;
    public final void ruleCode() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:691:2: ( ( ( rule__Code__Alternatives ) ) )
            // InternalSlideOMatic.g:692:2: ( ( rule__Code__Alternatives ) )
            {
            // InternalSlideOMatic.g:692:2: ( ( rule__Code__Alternatives ) )
            // InternalSlideOMatic.g:693:3: ( rule__Code__Alternatives )
            {
             before(grammarAccess.getCodeAccess().getAlternatives()); 
            // InternalSlideOMatic.g:694:3: ( rule__Code__Alternatives )
            // InternalSlideOMatic.g:694:4: rule__Code__Alternatives
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
    // InternalSlideOMatic.g:703:1: entryRuleLineSequence : ruleLineSequence EOF ;
    public final void entryRuleLineSequence() throws RecognitionException {
        try {
            // InternalSlideOMatic.g:704:1: ( ruleLineSequence EOF )
            // InternalSlideOMatic.g:705:1: ruleLineSequence EOF
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
    // InternalSlideOMatic.g:712:1: ruleLineSequence : ( ( rule__LineSequence__Group__0 ) ) ;
    public final void ruleLineSequence() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:716:2: ( ( ( rule__LineSequence__Group__0 ) ) )
            // InternalSlideOMatic.g:717:2: ( ( rule__LineSequence__Group__0 ) )
            {
            // InternalSlideOMatic.g:717:2: ( ( rule__LineSequence__Group__0 ) )
            // InternalSlideOMatic.g:718:3: ( rule__LineSequence__Group__0 )
            {
             before(grammarAccess.getLineSequenceAccess().getGroup()); 
            // InternalSlideOMatic.g:719:3: ( rule__LineSequence__Group__0 )
            // InternalSlideOMatic.g:719:4: rule__LineSequence__Group__0
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
    // InternalSlideOMatic.g:728:1: entryRuleClick : ruleClick EOF ;
    public final void entryRuleClick() throws RecognitionException {
        try {
            // InternalSlideOMatic.g:729:1: ( ruleClick EOF )
            // InternalSlideOMatic.g:730:1: ruleClick EOF
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
    // InternalSlideOMatic.g:737:1: ruleClick : ( '$$' ) ;
    public final void ruleClick() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:741:2: ( ( '$$' ) )
            // InternalSlideOMatic.g:742:2: ( '$$' )
            {
            // InternalSlideOMatic.g:742:2: ( '$$' )
            // InternalSlideOMatic.g:743:3: '$$'
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
    // InternalSlideOMatic.g:753:1: entryRuleAnimation : ruleAnimation EOF ;
    public final void entryRuleAnimation() throws RecognitionException {
        try {
            // InternalSlideOMatic.g:754:1: ( ruleAnimation EOF )
            // InternalSlideOMatic.g:755:1: ruleAnimation EOF
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
    // InternalSlideOMatic.g:762:1: ruleAnimation : ( ( rule__Animation__Group__0 ) ) ;
    public final void ruleAnimation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:766:2: ( ( ( rule__Animation__Group__0 ) ) )
            // InternalSlideOMatic.g:767:2: ( ( rule__Animation__Group__0 ) )
            {
            // InternalSlideOMatic.g:767:2: ( ( rule__Animation__Group__0 ) )
            // InternalSlideOMatic.g:768:3: ( rule__Animation__Group__0 )
            {
             before(grammarAccess.getAnimationAccess().getGroup()); 
            // InternalSlideOMatic.g:769:3: ( rule__Animation__Group__0 )
            // InternalSlideOMatic.g:769:4: rule__Animation__Group__0
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


    // $ANTLR start "entryRuleMathExp"
    // InternalSlideOMatic.g:778:1: entryRuleMathExp : ruleMathExp EOF ;
    public final void entryRuleMathExp() throws RecognitionException {
        try {
            // InternalSlideOMatic.g:779:1: ( ruleMathExp EOF )
            // InternalSlideOMatic.g:780:1: ruleMathExp EOF
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
    // InternalSlideOMatic.g:787:1: ruleMathExp : ( ( rule__MathExp__Group__0 ) ) ;
    public final void ruleMathExp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:791:2: ( ( ( rule__MathExp__Group__0 ) ) )
            // InternalSlideOMatic.g:792:2: ( ( rule__MathExp__Group__0 ) )
            {
            // InternalSlideOMatic.g:792:2: ( ( rule__MathExp__Group__0 ) )
            // InternalSlideOMatic.g:793:3: ( rule__MathExp__Group__0 )
            {
             before(grammarAccess.getMathExpAccess().getGroup()); 
            // InternalSlideOMatic.g:794:3: ( rule__MathExp__Group__0 )
            // InternalSlideOMatic.g:794:4: rule__MathExp__Group__0
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
    // InternalSlideOMatic.g:803:1: entryRuleExp : ruleExp EOF ;
    public final void entryRuleExp() throws RecognitionException {
        try {
            // InternalSlideOMatic.g:804:1: ( ruleExp EOF )
            // InternalSlideOMatic.g:805:1: ruleExp EOF
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
    // InternalSlideOMatic.g:812:1: ruleExp : ( ( rule__Exp__Group__0 ) ) ;
    public final void ruleExp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:816:2: ( ( ( rule__Exp__Group__0 ) ) )
            // InternalSlideOMatic.g:817:2: ( ( rule__Exp__Group__0 ) )
            {
            // InternalSlideOMatic.g:817:2: ( ( rule__Exp__Group__0 ) )
            // InternalSlideOMatic.g:818:3: ( rule__Exp__Group__0 )
            {
             before(grammarAccess.getExpAccess().getGroup()); 
            // InternalSlideOMatic.g:819:3: ( rule__Exp__Group__0 )
            // InternalSlideOMatic.g:819:4: rule__Exp__Group__0
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
    // InternalSlideOMatic.g:828:1: entryRuleFactor : ruleFactor EOF ;
    public final void entryRuleFactor() throws RecognitionException {
        try {
            // InternalSlideOMatic.g:829:1: ( ruleFactor EOF )
            // InternalSlideOMatic.g:830:1: ruleFactor EOF
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
    // InternalSlideOMatic.g:837:1: ruleFactor : ( ( rule__Factor__Group__0 ) ) ;
    public final void ruleFactor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:841:2: ( ( ( rule__Factor__Group__0 ) ) )
            // InternalSlideOMatic.g:842:2: ( ( rule__Factor__Group__0 ) )
            {
            // InternalSlideOMatic.g:842:2: ( ( rule__Factor__Group__0 ) )
            // InternalSlideOMatic.g:843:3: ( rule__Factor__Group__0 )
            {
             before(grammarAccess.getFactorAccess().getGroup()); 
            // InternalSlideOMatic.g:844:3: ( rule__Factor__Group__0 )
            // InternalSlideOMatic.g:844:4: rule__Factor__Group__0
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
    // InternalSlideOMatic.g:853:1: entryRulePow : rulePow EOF ;
    public final void entryRulePow() throws RecognitionException {
        try {
            // InternalSlideOMatic.g:854:1: ( rulePow EOF )
            // InternalSlideOMatic.g:855:1: rulePow EOF
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
    // InternalSlideOMatic.g:862:1: rulePow : ( ( rule__Pow__Group__0 ) ) ;
    public final void rulePow() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:866:2: ( ( ( rule__Pow__Group__0 ) ) )
            // InternalSlideOMatic.g:867:2: ( ( rule__Pow__Group__0 ) )
            {
            // InternalSlideOMatic.g:867:2: ( ( rule__Pow__Group__0 ) )
            // InternalSlideOMatic.g:868:3: ( rule__Pow__Group__0 )
            {
             before(grammarAccess.getPowAccess().getGroup()); 
            // InternalSlideOMatic.g:869:3: ( rule__Pow__Group__0 )
            // InternalSlideOMatic.g:869:4: rule__Pow__Group__0
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
    // InternalSlideOMatic.g:878:1: entryRulePrimary : rulePrimary EOF ;
    public final void entryRulePrimary() throws RecognitionException {
        try {
            // InternalSlideOMatic.g:879:1: ( rulePrimary EOF )
            // InternalSlideOMatic.g:880:1: rulePrimary EOF
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
    // InternalSlideOMatic.g:887:1: rulePrimary : ( ( rule__Primary__Alternatives ) ) ;
    public final void rulePrimary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:891:2: ( ( ( rule__Primary__Alternatives ) ) )
            // InternalSlideOMatic.g:892:2: ( ( rule__Primary__Alternatives ) )
            {
            // InternalSlideOMatic.g:892:2: ( ( rule__Primary__Alternatives ) )
            // InternalSlideOMatic.g:893:3: ( rule__Primary__Alternatives )
            {
             before(grammarAccess.getPrimaryAccess().getAlternatives()); 
            // InternalSlideOMatic.g:894:3: ( rule__Primary__Alternatives )
            // InternalSlideOMatic.g:894:4: rule__Primary__Alternatives
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
    // InternalSlideOMatic.g:903:1: entryRuleVariableUse : ruleVariableUse EOF ;
    public final void entryRuleVariableUse() throws RecognitionException {
        try {
            // InternalSlideOMatic.g:904:1: ( ruleVariableUse EOF )
            // InternalSlideOMatic.g:905:1: ruleVariableUse EOF
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
    // InternalSlideOMatic.g:912:1: ruleVariableUse : ( ( rule__VariableUse__Group__0 ) ) ;
    public final void ruleVariableUse() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:916:2: ( ( ( rule__VariableUse__Group__0 ) ) )
            // InternalSlideOMatic.g:917:2: ( ( rule__VariableUse__Group__0 ) )
            {
            // InternalSlideOMatic.g:917:2: ( ( rule__VariableUse__Group__0 ) )
            // InternalSlideOMatic.g:918:3: ( rule__VariableUse__Group__0 )
            {
             before(grammarAccess.getVariableUseAccess().getGroup()); 
            // InternalSlideOMatic.g:919:3: ( rule__VariableUse__Group__0 )
            // InternalSlideOMatic.g:919:4: rule__VariableUse__Group__0
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
    // InternalSlideOMatic.g:928:1: entryRuleVariableBinding : ruleVariableBinding EOF ;
    public final void entryRuleVariableBinding() throws RecognitionException {
        try {
            // InternalSlideOMatic.g:929:1: ( ruleVariableBinding EOF )
            // InternalSlideOMatic.g:930:1: ruleVariableBinding EOF
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
    // InternalSlideOMatic.g:937:1: ruleVariableBinding : ( ( rule__VariableBinding__Group__0 ) ) ;
    public final void ruleVariableBinding() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:941:2: ( ( ( rule__VariableBinding__Group__0 ) ) )
            // InternalSlideOMatic.g:942:2: ( ( rule__VariableBinding__Group__0 ) )
            {
            // InternalSlideOMatic.g:942:2: ( ( rule__VariableBinding__Group__0 ) )
            // InternalSlideOMatic.g:943:3: ( rule__VariableBinding__Group__0 )
            {
             before(grammarAccess.getVariableBindingAccess().getGroup()); 
            // InternalSlideOMatic.g:944:3: ( rule__VariableBinding__Group__0 )
            // InternalSlideOMatic.g:944:4: rule__VariableBinding__Group__0
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
    // InternalSlideOMatic.g:953:1: entryRuleParenthesis : ruleParenthesis EOF ;
    public final void entryRuleParenthesis() throws RecognitionException {
        try {
            // InternalSlideOMatic.g:954:1: ( ruleParenthesis EOF )
            // InternalSlideOMatic.g:955:1: ruleParenthesis EOF
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
    // InternalSlideOMatic.g:962:1: ruleParenthesis : ( ( rule__Parenthesis__Group__0 ) ) ;
    public final void ruleParenthesis() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:966:2: ( ( ( rule__Parenthesis__Group__0 ) ) )
            // InternalSlideOMatic.g:967:2: ( ( rule__Parenthesis__Group__0 ) )
            {
            // InternalSlideOMatic.g:967:2: ( ( rule__Parenthesis__Group__0 ) )
            // InternalSlideOMatic.g:968:3: ( rule__Parenthesis__Group__0 )
            {
             before(grammarAccess.getParenthesisAccess().getGroup()); 
            // InternalSlideOMatic.g:969:3: ( rule__Parenthesis__Group__0 )
            // InternalSlideOMatic.g:969:4: rule__Parenthesis__Group__0
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
    // InternalSlideOMatic.g:978:1: entryRuleNumber : ruleNumber EOF ;
    public final void entryRuleNumber() throws RecognitionException {
        try {
            // InternalSlideOMatic.g:979:1: ( ruleNumber EOF )
            // InternalSlideOMatic.g:980:1: ruleNumber EOF
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
    // InternalSlideOMatic.g:987:1: ruleNumber : ( ( rule__Number__Group__0 ) ) ;
    public final void ruleNumber() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:991:2: ( ( ( rule__Number__Group__0 ) ) )
            // InternalSlideOMatic.g:992:2: ( ( rule__Number__Group__0 ) )
            {
            // InternalSlideOMatic.g:992:2: ( ( rule__Number__Group__0 ) )
            // InternalSlideOMatic.g:993:3: ( rule__Number__Group__0 )
            {
             before(grammarAccess.getNumberAccess().getGroup()); 
            // InternalSlideOMatic.g:994:3: ( rule__Number__Group__0 )
            // InternalSlideOMatic.g:994:4: rule__Number__Group__0
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
    // InternalSlideOMatic.g:1002:1: rule__Presentation__Alternatives_5 : ( ( ( rule__Presentation__SlidesAssignment_5_0 ) ) | ( ( rule__Presentation__ImagesAssignment_5_1 ) ) );
    public final void rule__Presentation__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1006:1: ( ( ( rule__Presentation__SlidesAssignment_5_0 ) ) | ( ( rule__Presentation__ImagesAssignment_5_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==75) ) {
                alt1=1;
            }
            else if ( (LA1_0==88) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalSlideOMatic.g:1007:2: ( ( rule__Presentation__SlidesAssignment_5_0 ) )
                    {
                    // InternalSlideOMatic.g:1007:2: ( ( rule__Presentation__SlidesAssignment_5_0 ) )
                    // InternalSlideOMatic.g:1008:3: ( rule__Presentation__SlidesAssignment_5_0 )
                    {
                     before(grammarAccess.getPresentationAccess().getSlidesAssignment_5_0()); 
                    // InternalSlideOMatic.g:1009:3: ( rule__Presentation__SlidesAssignment_5_0 )
                    // InternalSlideOMatic.g:1009:4: rule__Presentation__SlidesAssignment_5_0
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
                    // InternalSlideOMatic.g:1013:2: ( ( rule__Presentation__ImagesAssignment_5_1 ) )
                    {
                    // InternalSlideOMatic.g:1013:2: ( ( rule__Presentation__ImagesAssignment_5_1 ) )
                    // InternalSlideOMatic.g:1014:3: ( rule__Presentation__ImagesAssignment_5_1 )
                    {
                     before(grammarAccess.getPresentationAccess().getImagesAssignment_5_1()); 
                    // InternalSlideOMatic.g:1015:3: ( rule__Presentation__ImagesAssignment_5_1 )
                    // InternalSlideOMatic.g:1015:4: rule__Presentation__ImagesAssignment_5_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Presentation__ImagesAssignment_5_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getPresentationAccess().getImagesAssignment_5_1()); 

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
    // InternalSlideOMatic.g:1023:1: rule__BeamerTheme__Alternatives : ( ( 'AnnArbor' ) | ( 'Antibes' ) | ( 'Bergen' ) | ( 'Berkeley' ) | ( 'Berlin' ) | ( 'Boadilla' ) | ( 'boxes' ) | ( 'CambridgeUS' ) | ( 'Copenhagen' ) | ( 'Darmstadt' ) | ( 'default' ) | ( 'Dresden' ) | ( 'Frankfurt' ) | ( 'Goettingen' ) | ( 'Hannover' ) | ( 'Ilmanau' ) | ( 'JuanLesPins' ) | ( 'Luebeck' ) | ( 'Madrid' ) | ( 'Malmoe' ) | ( 'Marburg' ) | ( 'Montpellier' ) | ( 'PaloAlto' ) | ( 'Pittsburgh' ) | ( 'Rochester' ) | ( 'Singapore' ) | ( 'Szeged' ) | ( 'Warsaw' ) );
    public final void rule__BeamerTheme__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1027:1: ( ( 'AnnArbor' ) | ( 'Antibes' ) | ( 'Bergen' ) | ( 'Berkeley' ) | ( 'Berlin' ) | ( 'Boadilla' ) | ( 'boxes' ) | ( 'CambridgeUS' ) | ( 'Copenhagen' ) | ( 'Darmstadt' ) | ( 'default' ) | ( 'Dresden' ) | ( 'Frankfurt' ) | ( 'Goettingen' ) | ( 'Hannover' ) | ( 'Ilmanau' ) | ( 'JuanLesPins' ) | ( 'Luebeck' ) | ( 'Madrid' ) | ( 'Malmoe' ) | ( 'Marburg' ) | ( 'Montpellier' ) | ( 'PaloAlto' ) | ( 'Pittsburgh' ) | ( 'Rochester' ) | ( 'Singapore' ) | ( 'Szeged' ) | ( 'Warsaw' ) )
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
                    // InternalSlideOMatic.g:1028:2: ( 'AnnArbor' )
                    {
                    // InternalSlideOMatic.g:1028:2: ( 'AnnArbor' )
                    // InternalSlideOMatic.g:1029:3: 'AnnArbor'
                    {
                     before(grammarAccess.getBeamerThemeAccess().getAnnArborKeyword_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getBeamerThemeAccess().getAnnArborKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSlideOMatic.g:1034:2: ( 'Antibes' )
                    {
                    // InternalSlideOMatic.g:1034:2: ( 'Antibes' )
                    // InternalSlideOMatic.g:1035:3: 'Antibes'
                    {
                     before(grammarAccess.getBeamerThemeAccess().getAntibesKeyword_1()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getBeamerThemeAccess().getAntibesKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSlideOMatic.g:1040:2: ( 'Bergen' )
                    {
                    // InternalSlideOMatic.g:1040:2: ( 'Bergen' )
                    // InternalSlideOMatic.g:1041:3: 'Bergen'
                    {
                     before(grammarAccess.getBeamerThemeAccess().getBergenKeyword_2()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getBeamerThemeAccess().getBergenKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSlideOMatic.g:1046:2: ( 'Berkeley' )
                    {
                    // InternalSlideOMatic.g:1046:2: ( 'Berkeley' )
                    // InternalSlideOMatic.g:1047:3: 'Berkeley'
                    {
                     before(grammarAccess.getBeamerThemeAccess().getBerkeleyKeyword_3()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getBeamerThemeAccess().getBerkeleyKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSlideOMatic.g:1052:2: ( 'Berlin' )
                    {
                    // InternalSlideOMatic.g:1052:2: ( 'Berlin' )
                    // InternalSlideOMatic.g:1053:3: 'Berlin'
                    {
                     before(grammarAccess.getBeamerThemeAccess().getBerlinKeyword_4()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getBeamerThemeAccess().getBerlinKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalSlideOMatic.g:1058:2: ( 'Boadilla' )
                    {
                    // InternalSlideOMatic.g:1058:2: ( 'Boadilla' )
                    // InternalSlideOMatic.g:1059:3: 'Boadilla'
                    {
                     before(grammarAccess.getBeamerThemeAccess().getBoadillaKeyword_5()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getBeamerThemeAccess().getBoadillaKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalSlideOMatic.g:1064:2: ( 'boxes' )
                    {
                    // InternalSlideOMatic.g:1064:2: ( 'boxes' )
                    // InternalSlideOMatic.g:1065:3: 'boxes'
                    {
                     before(grammarAccess.getBeamerThemeAccess().getBoxesKeyword_6()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getBeamerThemeAccess().getBoxesKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalSlideOMatic.g:1070:2: ( 'CambridgeUS' )
                    {
                    // InternalSlideOMatic.g:1070:2: ( 'CambridgeUS' )
                    // InternalSlideOMatic.g:1071:3: 'CambridgeUS'
                    {
                     before(grammarAccess.getBeamerThemeAccess().getCambridgeUSKeyword_7()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getBeamerThemeAccess().getCambridgeUSKeyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalSlideOMatic.g:1076:2: ( 'Copenhagen' )
                    {
                    // InternalSlideOMatic.g:1076:2: ( 'Copenhagen' )
                    // InternalSlideOMatic.g:1077:3: 'Copenhagen'
                    {
                     before(grammarAccess.getBeamerThemeAccess().getCopenhagenKeyword_8()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getBeamerThemeAccess().getCopenhagenKeyword_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalSlideOMatic.g:1082:2: ( 'Darmstadt' )
                    {
                    // InternalSlideOMatic.g:1082:2: ( 'Darmstadt' )
                    // InternalSlideOMatic.g:1083:3: 'Darmstadt'
                    {
                     before(grammarAccess.getBeamerThemeAccess().getDarmstadtKeyword_9()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getBeamerThemeAccess().getDarmstadtKeyword_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalSlideOMatic.g:1088:2: ( 'default' )
                    {
                    // InternalSlideOMatic.g:1088:2: ( 'default' )
                    // InternalSlideOMatic.g:1089:3: 'default'
                    {
                     before(grammarAccess.getBeamerThemeAccess().getDefaultKeyword_10()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getBeamerThemeAccess().getDefaultKeyword_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalSlideOMatic.g:1094:2: ( 'Dresden' )
                    {
                    // InternalSlideOMatic.g:1094:2: ( 'Dresden' )
                    // InternalSlideOMatic.g:1095:3: 'Dresden'
                    {
                     before(grammarAccess.getBeamerThemeAccess().getDresdenKeyword_11()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getBeamerThemeAccess().getDresdenKeyword_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalSlideOMatic.g:1100:2: ( 'Frankfurt' )
                    {
                    // InternalSlideOMatic.g:1100:2: ( 'Frankfurt' )
                    // InternalSlideOMatic.g:1101:3: 'Frankfurt'
                    {
                     before(grammarAccess.getBeamerThemeAccess().getFrankfurtKeyword_12()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getBeamerThemeAccess().getFrankfurtKeyword_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalSlideOMatic.g:1106:2: ( 'Goettingen' )
                    {
                    // InternalSlideOMatic.g:1106:2: ( 'Goettingen' )
                    // InternalSlideOMatic.g:1107:3: 'Goettingen'
                    {
                     before(grammarAccess.getBeamerThemeAccess().getGoettingenKeyword_13()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getBeamerThemeAccess().getGoettingenKeyword_13()); 

                    }


                    }
                    break;
                case 15 :
                    // InternalSlideOMatic.g:1112:2: ( 'Hannover' )
                    {
                    // InternalSlideOMatic.g:1112:2: ( 'Hannover' )
                    // InternalSlideOMatic.g:1113:3: 'Hannover'
                    {
                     before(grammarAccess.getBeamerThemeAccess().getHannoverKeyword_14()); 
                    match(input,26,FOLLOW_2); 
                     after(grammarAccess.getBeamerThemeAccess().getHannoverKeyword_14()); 

                    }


                    }
                    break;
                case 16 :
                    // InternalSlideOMatic.g:1118:2: ( 'Ilmanau' )
                    {
                    // InternalSlideOMatic.g:1118:2: ( 'Ilmanau' )
                    // InternalSlideOMatic.g:1119:3: 'Ilmanau'
                    {
                     before(grammarAccess.getBeamerThemeAccess().getIlmanauKeyword_15()); 
                    match(input,27,FOLLOW_2); 
                     after(grammarAccess.getBeamerThemeAccess().getIlmanauKeyword_15()); 

                    }


                    }
                    break;
                case 17 :
                    // InternalSlideOMatic.g:1124:2: ( 'JuanLesPins' )
                    {
                    // InternalSlideOMatic.g:1124:2: ( 'JuanLesPins' )
                    // InternalSlideOMatic.g:1125:3: 'JuanLesPins'
                    {
                     before(grammarAccess.getBeamerThemeAccess().getJuanLesPinsKeyword_16()); 
                    match(input,28,FOLLOW_2); 
                     after(grammarAccess.getBeamerThemeAccess().getJuanLesPinsKeyword_16()); 

                    }


                    }
                    break;
                case 18 :
                    // InternalSlideOMatic.g:1130:2: ( 'Luebeck' )
                    {
                    // InternalSlideOMatic.g:1130:2: ( 'Luebeck' )
                    // InternalSlideOMatic.g:1131:3: 'Luebeck'
                    {
                     before(grammarAccess.getBeamerThemeAccess().getLuebeckKeyword_17()); 
                    match(input,29,FOLLOW_2); 
                     after(grammarAccess.getBeamerThemeAccess().getLuebeckKeyword_17()); 

                    }


                    }
                    break;
                case 19 :
                    // InternalSlideOMatic.g:1136:2: ( 'Madrid' )
                    {
                    // InternalSlideOMatic.g:1136:2: ( 'Madrid' )
                    // InternalSlideOMatic.g:1137:3: 'Madrid'
                    {
                     before(grammarAccess.getBeamerThemeAccess().getMadridKeyword_18()); 
                    match(input,30,FOLLOW_2); 
                     after(grammarAccess.getBeamerThemeAccess().getMadridKeyword_18()); 

                    }


                    }
                    break;
                case 20 :
                    // InternalSlideOMatic.g:1142:2: ( 'Malmoe' )
                    {
                    // InternalSlideOMatic.g:1142:2: ( 'Malmoe' )
                    // InternalSlideOMatic.g:1143:3: 'Malmoe'
                    {
                     before(grammarAccess.getBeamerThemeAccess().getMalmoeKeyword_19()); 
                    match(input,31,FOLLOW_2); 
                     after(grammarAccess.getBeamerThemeAccess().getMalmoeKeyword_19()); 

                    }


                    }
                    break;
                case 21 :
                    // InternalSlideOMatic.g:1148:2: ( 'Marburg' )
                    {
                    // InternalSlideOMatic.g:1148:2: ( 'Marburg' )
                    // InternalSlideOMatic.g:1149:3: 'Marburg'
                    {
                     before(grammarAccess.getBeamerThemeAccess().getMarburgKeyword_20()); 
                    match(input,32,FOLLOW_2); 
                     after(grammarAccess.getBeamerThemeAccess().getMarburgKeyword_20()); 

                    }


                    }
                    break;
                case 22 :
                    // InternalSlideOMatic.g:1154:2: ( 'Montpellier' )
                    {
                    // InternalSlideOMatic.g:1154:2: ( 'Montpellier' )
                    // InternalSlideOMatic.g:1155:3: 'Montpellier'
                    {
                     before(grammarAccess.getBeamerThemeAccess().getMontpellierKeyword_21()); 
                    match(input,33,FOLLOW_2); 
                     after(grammarAccess.getBeamerThemeAccess().getMontpellierKeyword_21()); 

                    }


                    }
                    break;
                case 23 :
                    // InternalSlideOMatic.g:1160:2: ( 'PaloAlto' )
                    {
                    // InternalSlideOMatic.g:1160:2: ( 'PaloAlto' )
                    // InternalSlideOMatic.g:1161:3: 'PaloAlto'
                    {
                     before(grammarAccess.getBeamerThemeAccess().getPaloAltoKeyword_22()); 
                    match(input,34,FOLLOW_2); 
                     after(grammarAccess.getBeamerThemeAccess().getPaloAltoKeyword_22()); 

                    }


                    }
                    break;
                case 24 :
                    // InternalSlideOMatic.g:1166:2: ( 'Pittsburgh' )
                    {
                    // InternalSlideOMatic.g:1166:2: ( 'Pittsburgh' )
                    // InternalSlideOMatic.g:1167:3: 'Pittsburgh'
                    {
                     before(grammarAccess.getBeamerThemeAccess().getPittsburghKeyword_23()); 
                    match(input,35,FOLLOW_2); 
                     after(grammarAccess.getBeamerThemeAccess().getPittsburghKeyword_23()); 

                    }


                    }
                    break;
                case 25 :
                    // InternalSlideOMatic.g:1172:2: ( 'Rochester' )
                    {
                    // InternalSlideOMatic.g:1172:2: ( 'Rochester' )
                    // InternalSlideOMatic.g:1173:3: 'Rochester'
                    {
                     before(grammarAccess.getBeamerThemeAccess().getRochesterKeyword_24()); 
                    match(input,36,FOLLOW_2); 
                     after(grammarAccess.getBeamerThemeAccess().getRochesterKeyword_24()); 

                    }


                    }
                    break;
                case 26 :
                    // InternalSlideOMatic.g:1178:2: ( 'Singapore' )
                    {
                    // InternalSlideOMatic.g:1178:2: ( 'Singapore' )
                    // InternalSlideOMatic.g:1179:3: 'Singapore'
                    {
                     before(grammarAccess.getBeamerThemeAccess().getSingaporeKeyword_25()); 
                    match(input,37,FOLLOW_2); 
                     after(grammarAccess.getBeamerThemeAccess().getSingaporeKeyword_25()); 

                    }


                    }
                    break;
                case 27 :
                    // InternalSlideOMatic.g:1184:2: ( 'Szeged' )
                    {
                    // InternalSlideOMatic.g:1184:2: ( 'Szeged' )
                    // InternalSlideOMatic.g:1185:3: 'Szeged'
                    {
                     before(grammarAccess.getBeamerThemeAccess().getSzegedKeyword_26()); 
                    match(input,38,FOLLOW_2); 
                     after(grammarAccess.getBeamerThemeAccess().getSzegedKeyword_26()); 

                    }


                    }
                    break;
                case 28 :
                    // InternalSlideOMatic.g:1190:2: ( 'Warsaw' )
                    {
                    // InternalSlideOMatic.g:1190:2: ( 'Warsaw' )
                    // InternalSlideOMatic.g:1191:3: 'Warsaw'
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
    // InternalSlideOMatic.g:1200:1: rule__ThemeColor__Alternatives : ( ( 'albatros' ) | ( 'beaver' ) | ( 'beetle' ) | ( 'crane' ) | ( 'default' ) | ( 'dolphin' ) | ( 'dove' ) | ( 'fly' ) | ( 'lily' ) | ( 'orchid' ) | ( 'rose' ) | ( 'seagull' ) | ( 'seahorse' ) | ( 'sidebartab' ) | ( 'structure' ) | ( 'whale' ) | ( 'wolverine' ) );
    public final void rule__ThemeColor__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1204:1: ( ( 'albatros' ) | ( 'beaver' ) | ( 'beetle' ) | ( 'crane' ) | ( 'default' ) | ( 'dolphin' ) | ( 'dove' ) | ( 'fly' ) | ( 'lily' ) | ( 'orchid' ) | ( 'rose' ) | ( 'seagull' ) | ( 'seahorse' ) | ( 'sidebartab' ) | ( 'structure' ) | ( 'whale' ) | ( 'wolverine' ) )
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
                    // InternalSlideOMatic.g:1205:2: ( 'albatros' )
                    {
                    // InternalSlideOMatic.g:1205:2: ( 'albatros' )
                    // InternalSlideOMatic.g:1206:3: 'albatros'
                    {
                     before(grammarAccess.getThemeColorAccess().getAlbatrosKeyword_0()); 
                    match(input,40,FOLLOW_2); 
                     after(grammarAccess.getThemeColorAccess().getAlbatrosKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSlideOMatic.g:1211:2: ( 'beaver' )
                    {
                    // InternalSlideOMatic.g:1211:2: ( 'beaver' )
                    // InternalSlideOMatic.g:1212:3: 'beaver'
                    {
                     before(grammarAccess.getThemeColorAccess().getBeaverKeyword_1()); 
                    match(input,41,FOLLOW_2); 
                     after(grammarAccess.getThemeColorAccess().getBeaverKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSlideOMatic.g:1217:2: ( 'beetle' )
                    {
                    // InternalSlideOMatic.g:1217:2: ( 'beetle' )
                    // InternalSlideOMatic.g:1218:3: 'beetle'
                    {
                     before(grammarAccess.getThemeColorAccess().getBeetleKeyword_2()); 
                    match(input,42,FOLLOW_2); 
                     after(grammarAccess.getThemeColorAccess().getBeetleKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSlideOMatic.g:1223:2: ( 'crane' )
                    {
                    // InternalSlideOMatic.g:1223:2: ( 'crane' )
                    // InternalSlideOMatic.g:1224:3: 'crane'
                    {
                     before(grammarAccess.getThemeColorAccess().getCraneKeyword_3()); 
                    match(input,43,FOLLOW_2); 
                     after(grammarAccess.getThemeColorAccess().getCraneKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSlideOMatic.g:1229:2: ( 'default' )
                    {
                    // InternalSlideOMatic.g:1229:2: ( 'default' )
                    // InternalSlideOMatic.g:1230:3: 'default'
                    {
                     before(grammarAccess.getThemeColorAccess().getDefaultKeyword_4()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getThemeColorAccess().getDefaultKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalSlideOMatic.g:1235:2: ( 'dolphin' )
                    {
                    // InternalSlideOMatic.g:1235:2: ( 'dolphin' )
                    // InternalSlideOMatic.g:1236:3: 'dolphin'
                    {
                     before(grammarAccess.getThemeColorAccess().getDolphinKeyword_5()); 
                    match(input,44,FOLLOW_2); 
                     after(grammarAccess.getThemeColorAccess().getDolphinKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalSlideOMatic.g:1241:2: ( 'dove' )
                    {
                    // InternalSlideOMatic.g:1241:2: ( 'dove' )
                    // InternalSlideOMatic.g:1242:3: 'dove'
                    {
                     before(grammarAccess.getThemeColorAccess().getDoveKeyword_6()); 
                    match(input,45,FOLLOW_2); 
                     after(grammarAccess.getThemeColorAccess().getDoveKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalSlideOMatic.g:1247:2: ( 'fly' )
                    {
                    // InternalSlideOMatic.g:1247:2: ( 'fly' )
                    // InternalSlideOMatic.g:1248:3: 'fly'
                    {
                     before(grammarAccess.getThemeColorAccess().getFlyKeyword_7()); 
                    match(input,46,FOLLOW_2); 
                     after(grammarAccess.getThemeColorAccess().getFlyKeyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalSlideOMatic.g:1253:2: ( 'lily' )
                    {
                    // InternalSlideOMatic.g:1253:2: ( 'lily' )
                    // InternalSlideOMatic.g:1254:3: 'lily'
                    {
                     before(grammarAccess.getThemeColorAccess().getLilyKeyword_8()); 
                    match(input,47,FOLLOW_2); 
                     after(grammarAccess.getThemeColorAccess().getLilyKeyword_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalSlideOMatic.g:1259:2: ( 'orchid' )
                    {
                    // InternalSlideOMatic.g:1259:2: ( 'orchid' )
                    // InternalSlideOMatic.g:1260:3: 'orchid'
                    {
                     before(grammarAccess.getThemeColorAccess().getOrchidKeyword_9()); 
                    match(input,48,FOLLOW_2); 
                     after(grammarAccess.getThemeColorAccess().getOrchidKeyword_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalSlideOMatic.g:1265:2: ( 'rose' )
                    {
                    // InternalSlideOMatic.g:1265:2: ( 'rose' )
                    // InternalSlideOMatic.g:1266:3: 'rose'
                    {
                     before(grammarAccess.getThemeColorAccess().getRoseKeyword_10()); 
                    match(input,49,FOLLOW_2); 
                     after(grammarAccess.getThemeColorAccess().getRoseKeyword_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalSlideOMatic.g:1271:2: ( 'seagull' )
                    {
                    // InternalSlideOMatic.g:1271:2: ( 'seagull' )
                    // InternalSlideOMatic.g:1272:3: 'seagull'
                    {
                     before(grammarAccess.getThemeColorAccess().getSeagullKeyword_11()); 
                    match(input,50,FOLLOW_2); 
                     after(grammarAccess.getThemeColorAccess().getSeagullKeyword_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalSlideOMatic.g:1277:2: ( 'seahorse' )
                    {
                    // InternalSlideOMatic.g:1277:2: ( 'seahorse' )
                    // InternalSlideOMatic.g:1278:3: 'seahorse'
                    {
                     before(grammarAccess.getThemeColorAccess().getSeahorseKeyword_12()); 
                    match(input,51,FOLLOW_2); 
                     after(grammarAccess.getThemeColorAccess().getSeahorseKeyword_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalSlideOMatic.g:1283:2: ( 'sidebartab' )
                    {
                    // InternalSlideOMatic.g:1283:2: ( 'sidebartab' )
                    // InternalSlideOMatic.g:1284:3: 'sidebartab'
                    {
                     before(grammarAccess.getThemeColorAccess().getSidebartabKeyword_13()); 
                    match(input,52,FOLLOW_2); 
                     after(grammarAccess.getThemeColorAccess().getSidebartabKeyword_13()); 

                    }


                    }
                    break;
                case 15 :
                    // InternalSlideOMatic.g:1289:2: ( 'structure' )
                    {
                    // InternalSlideOMatic.g:1289:2: ( 'structure' )
                    // InternalSlideOMatic.g:1290:3: 'structure'
                    {
                     before(grammarAccess.getThemeColorAccess().getStructureKeyword_14()); 
                    match(input,53,FOLLOW_2); 
                     after(grammarAccess.getThemeColorAccess().getStructureKeyword_14()); 

                    }


                    }
                    break;
                case 16 :
                    // InternalSlideOMatic.g:1295:2: ( 'whale' )
                    {
                    // InternalSlideOMatic.g:1295:2: ( 'whale' )
                    // InternalSlideOMatic.g:1296:3: 'whale'
                    {
                     before(grammarAccess.getThemeColorAccess().getWhaleKeyword_15()); 
                    match(input,54,FOLLOW_2); 
                     after(grammarAccess.getThemeColorAccess().getWhaleKeyword_15()); 

                    }


                    }
                    break;
                case 17 :
                    // InternalSlideOMatic.g:1301:2: ( 'wolverine' )
                    {
                    // InternalSlideOMatic.g:1301:2: ( 'wolverine' )
                    // InternalSlideOMatic.g:1302:3: 'wolverine'
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
    // InternalSlideOMatic.g:1311:1: rule__Authors__Alternatives_0 : ( ( 'author' ) | ( 'authors' ) );
    public final void rule__Authors__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1315:1: ( ( 'author' ) | ( 'authors' ) )
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
                    // InternalSlideOMatic.g:1316:2: ( 'author' )
                    {
                    // InternalSlideOMatic.g:1316:2: ( 'author' )
                    // InternalSlideOMatic.g:1317:3: 'author'
                    {
                     before(grammarAccess.getAuthorsAccess().getAuthorKeyword_0_0()); 
                    match(input,56,FOLLOW_2); 
                     after(grammarAccess.getAuthorsAccess().getAuthorKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSlideOMatic.g:1322:2: ( 'authors' )
                    {
                    // InternalSlideOMatic.g:1322:2: ( 'authors' )
                    // InternalSlideOMatic.g:1323:3: 'authors'
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
    // InternalSlideOMatic.g:1332:1: rule__Date__Alternatives_1 : ( ( ( rule__Date__DateAssignment_1_0 ) ) | ( ( rule__Date__Group_1_1__0 ) ) );
    public final void rule__Date__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1336:1: ( ( ( rule__Date__DateAssignment_1_0 ) ) | ( ( rule__Date__Group_1_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            else if ( (LA5_0==74) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalSlideOMatic.g:1337:2: ( ( rule__Date__DateAssignment_1_0 ) )
                    {
                    // InternalSlideOMatic.g:1337:2: ( ( rule__Date__DateAssignment_1_0 ) )
                    // InternalSlideOMatic.g:1338:3: ( rule__Date__DateAssignment_1_0 )
                    {
                     before(grammarAccess.getDateAccess().getDateAssignment_1_0()); 
                    // InternalSlideOMatic.g:1339:3: ( rule__Date__DateAssignment_1_0 )
                    // InternalSlideOMatic.g:1339:4: rule__Date__DateAssignment_1_0
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
                    // InternalSlideOMatic.g:1343:2: ( ( rule__Date__Group_1_1__0 ) )
                    {
                    // InternalSlideOMatic.g:1343:2: ( ( rule__Date__Group_1_1__0 ) )
                    // InternalSlideOMatic.g:1344:3: ( rule__Date__Group_1_1__0 )
                    {
                     before(grammarAccess.getDateAccess().getGroup_1_1()); 
                    // InternalSlideOMatic.g:1345:3: ( rule__Date__Group_1_1__0 )
                    // InternalSlideOMatic.g:1345:4: rule__Date__Group_1_1__0
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
    // InternalSlideOMatic.g:1353:1: rule__Slide__Alternatives_1 : ( ( ( rule__Slide__Group_1_0__0 ) ) | ( ( rule__Slide__NameAssignment_1_1 ) ) );
    public final void rule__Slide__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1357:1: ( ( ( rule__Slide__Group_1_0__0 ) ) | ( ( rule__Slide__NameAssignment_1_1 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==74||(LA6_0>=76 && LA6_0<=77)) ) {
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
                    // InternalSlideOMatic.g:1358:2: ( ( rule__Slide__Group_1_0__0 ) )
                    {
                    // InternalSlideOMatic.g:1358:2: ( ( rule__Slide__Group_1_0__0 ) )
                    // InternalSlideOMatic.g:1359:3: ( rule__Slide__Group_1_0__0 )
                    {
                     before(grammarAccess.getSlideAccess().getGroup_1_0()); 
                    // InternalSlideOMatic.g:1360:3: ( rule__Slide__Group_1_0__0 )
                    // InternalSlideOMatic.g:1360:4: rule__Slide__Group_1_0__0
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
                    // InternalSlideOMatic.g:1364:2: ( ( rule__Slide__NameAssignment_1_1 ) )
                    {
                    // InternalSlideOMatic.g:1364:2: ( ( rule__Slide__NameAssignment_1_1 ) )
                    // InternalSlideOMatic.g:1365:3: ( rule__Slide__NameAssignment_1_1 )
                    {
                     before(grammarAccess.getSlideAccess().getNameAssignment_1_1()); 
                    // InternalSlideOMatic.g:1366:3: ( rule__Slide__NameAssignment_1_1 )
                    // InternalSlideOMatic.g:1366:4: rule__Slide__NameAssignment_1_1
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
    // InternalSlideOMatic.g:1374:1: rule__Section__Alternatives : ( ( ( rule__Section__Group_0__0 ) ) | ( ( rule__Section__Group_1__0 ) ) | ( ( rule__Section__Group_2__0 ) ) );
    public final void rule__Section__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1378:1: ( ( ( rule__Section__Group_0__0 ) ) | ( ( rule__Section__Group_1__0 ) ) | ( ( rule__Section__Group_2__0 ) ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 74:
                {
                alt7=1;
                }
                break;
            case 76:
                {
                alt7=2;
                }
                break;
            case 77:
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
                    // InternalSlideOMatic.g:1379:2: ( ( rule__Section__Group_0__0 ) )
                    {
                    // InternalSlideOMatic.g:1379:2: ( ( rule__Section__Group_0__0 ) )
                    // InternalSlideOMatic.g:1380:3: ( rule__Section__Group_0__0 )
                    {
                     before(grammarAccess.getSectionAccess().getGroup_0()); 
                    // InternalSlideOMatic.g:1381:3: ( rule__Section__Group_0__0 )
                    // InternalSlideOMatic.g:1381:4: rule__Section__Group_0__0
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
                    // InternalSlideOMatic.g:1385:2: ( ( rule__Section__Group_1__0 ) )
                    {
                    // InternalSlideOMatic.g:1385:2: ( ( rule__Section__Group_1__0 ) )
                    // InternalSlideOMatic.g:1386:3: ( rule__Section__Group_1__0 )
                    {
                     before(grammarAccess.getSectionAccess().getGroup_1()); 
                    // InternalSlideOMatic.g:1387:3: ( rule__Section__Group_1__0 )
                    // InternalSlideOMatic.g:1387:4: rule__Section__Group_1__0
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
                    // InternalSlideOMatic.g:1391:2: ( ( rule__Section__Group_2__0 ) )
                    {
                    // InternalSlideOMatic.g:1391:2: ( ( rule__Section__Group_2__0 ) )
                    // InternalSlideOMatic.g:1392:3: ( rule__Section__Group_2__0 )
                    {
                     before(grammarAccess.getSectionAccess().getGroup_2()); 
                    // InternalSlideOMatic.g:1393:3: ( rule__Section__Group_2__0 )
                    // InternalSlideOMatic.g:1393:4: rule__Section__Group_2__0
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
    // InternalSlideOMatic.g:1401:1: rule__Content__Alternatives_0 : ( ( ruleToC ) | ( ruleText ) | ( ruleBlock ) | ( ruleList ) | ( ruleShowImage ) | ( ruleTable ) | ( ruleCode ) | ( ruleMathExp ) | ( ruleAnimation ) );
    public final void rule__Content__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1405:1: ( ( ruleToC ) | ( ruleText ) | ( ruleBlock ) | ( ruleList ) | ( ruleShowImage ) | ( ruleTable ) | ( ruleCode ) | ( ruleMathExp ) | ( ruleAnimation ) )
            int alt8=9;
            switch ( input.LA(1) ) {
            case 78:
                {
                alt8=1;
                }
                break;
            case RULE_STRING:
            case 79:
            case 80:
            case 81:
            case 82:
            case 83:
                {
                alt8=2;
                }
                break;
            case 84:
                {
                alt8=3;
                }
                break;
            case 85:
            case 86:
                {
                alt8=4;
                }
                break;
            case 91:
                {
                alt8=5;
                }
                break;
            case 95:
                {
                alt8=6;
                }
                break;
            case 98:
            case 100:
                {
                alt8=7;
                }
                break;
            case 107:
                {
                alt8=8;
                }
                break;
            case 103:
                {
                alt8=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalSlideOMatic.g:1406:2: ( ruleToC )
                    {
                    // InternalSlideOMatic.g:1406:2: ( ruleToC )
                    // InternalSlideOMatic.g:1407:3: ruleToC
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
                    // InternalSlideOMatic.g:1412:2: ( ruleText )
                    {
                    // InternalSlideOMatic.g:1412:2: ( ruleText )
                    // InternalSlideOMatic.g:1413:3: ruleText
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
                    // InternalSlideOMatic.g:1418:2: ( ruleBlock )
                    {
                    // InternalSlideOMatic.g:1418:2: ( ruleBlock )
                    // InternalSlideOMatic.g:1419:3: ruleBlock
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
                    // InternalSlideOMatic.g:1424:2: ( ruleList )
                    {
                    // InternalSlideOMatic.g:1424:2: ( ruleList )
                    // InternalSlideOMatic.g:1425:3: ruleList
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
                    // InternalSlideOMatic.g:1430:2: ( ruleShowImage )
                    {
                    // InternalSlideOMatic.g:1430:2: ( ruleShowImage )
                    // InternalSlideOMatic.g:1431:3: ruleShowImage
                    {
                     before(grammarAccess.getContentAccess().getShowImageParserRuleCall_0_4()); 
                    pushFollow(FOLLOW_2);
                    ruleShowImage();

                    state._fsp--;

                     after(grammarAccess.getContentAccess().getShowImageParserRuleCall_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalSlideOMatic.g:1436:2: ( ruleTable )
                    {
                    // InternalSlideOMatic.g:1436:2: ( ruleTable )
                    // InternalSlideOMatic.g:1437:3: ruleTable
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
                    // InternalSlideOMatic.g:1442:2: ( ruleCode )
                    {
                    // InternalSlideOMatic.g:1442:2: ( ruleCode )
                    // InternalSlideOMatic.g:1443:3: ruleCode
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
                    // InternalSlideOMatic.g:1448:2: ( ruleMathExp )
                    {
                    // InternalSlideOMatic.g:1448:2: ( ruleMathExp )
                    // InternalSlideOMatic.g:1449:3: ruleMathExp
                    {
                     before(grammarAccess.getContentAccess().getMathExpParserRuleCall_0_7()); 
                    pushFollow(FOLLOW_2);
                    ruleMathExp();

                    state._fsp--;

                     after(grammarAccess.getContentAccess().getMathExpParserRuleCall_0_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalSlideOMatic.g:1454:2: ( ruleAnimation )
                    {
                    // InternalSlideOMatic.g:1454:2: ( ruleAnimation )
                    // InternalSlideOMatic.g:1455:3: ruleAnimation
                    {
                     before(grammarAccess.getContentAccess().getAnimationParserRuleCall_0_8()); 
                    pushFollow(FOLLOW_2);
                    ruleAnimation();

                    state._fsp--;

                     after(grammarAccess.getContentAccess().getAnimationParserRuleCall_0_8()); 

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
    // InternalSlideOMatic.g:1464:1: rule__ToC__Alternatives : ( ( ( rule__ToC__Group_0__0 ) ) | ( ( rule__ToC__Group_1__0 ) ) );
    public final void rule__ToC__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1468:1: ( ( ( rule__ToC__Group_0__0 ) ) | ( ( rule__ToC__Group_1__0 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==78) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==EOF||LA9_1==RULE_STRING||LA9_1==11||LA9_1==66||(LA9_1>=78 && LA9_1<=86)||LA9_1==91||LA9_1==95||LA9_1==98||LA9_1==100||LA9_1==103||LA9_1==107) ) {
                    alt9=1;
                }
                else if ( (LA9_1==74) ) {
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
                    // InternalSlideOMatic.g:1469:2: ( ( rule__ToC__Group_0__0 ) )
                    {
                    // InternalSlideOMatic.g:1469:2: ( ( rule__ToC__Group_0__0 ) )
                    // InternalSlideOMatic.g:1470:3: ( rule__ToC__Group_0__0 )
                    {
                     before(grammarAccess.getToCAccess().getGroup_0()); 
                    // InternalSlideOMatic.g:1471:3: ( rule__ToC__Group_0__0 )
                    // InternalSlideOMatic.g:1471:4: rule__ToC__Group_0__0
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
                    // InternalSlideOMatic.g:1475:2: ( ( rule__ToC__Group_1__0 ) )
                    {
                    // InternalSlideOMatic.g:1475:2: ( ( rule__ToC__Group_1__0 ) )
                    // InternalSlideOMatic.g:1476:3: ( rule__ToC__Group_1__0 )
                    {
                     before(grammarAccess.getToCAccess().getGroup_1()); 
                    // InternalSlideOMatic.g:1477:3: ( rule__ToC__Group_1__0 )
                    // InternalSlideOMatic.g:1477:4: rule__ToC__Group_1__0
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


    // $ANTLR start "rule__TextType__Alternatives"
    // InternalSlideOMatic.g:1485:1: rule__TextType__Alternatives : ( ( ( rule__TextType__Group_0__0 ) ) | ( ( rule__TextType__Group_1__0 ) ) | ( ( rule__TextType__Group_2__0 ) ) | ( ( rule__TextType__Group_3__0 ) ) | ( ( rule__TextType__Group_4__0 ) ) );
    public final void rule__TextType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1489:1: ( ( ( rule__TextType__Group_0__0 ) ) | ( ( rule__TextType__Group_1__0 ) ) | ( ( rule__TextType__Group_2__0 ) ) | ( ( rule__TextType__Group_3__0 ) ) | ( ( rule__TextType__Group_4__0 ) ) )
            int alt10=5;
            switch ( input.LA(1) ) {
            case 79:
                {
                alt10=1;
                }
                break;
            case 80:
                {
                alt10=2;
                }
                break;
            case 81:
                {
                alt10=3;
                }
                break;
            case 82:
                {
                alt10=4;
                }
                break;
            case 83:
                {
                alt10=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalSlideOMatic.g:1490:2: ( ( rule__TextType__Group_0__0 ) )
                    {
                    // InternalSlideOMatic.g:1490:2: ( ( rule__TextType__Group_0__0 ) )
                    // InternalSlideOMatic.g:1491:3: ( rule__TextType__Group_0__0 )
                    {
                     before(grammarAccess.getTextTypeAccess().getGroup_0()); 
                    // InternalSlideOMatic.g:1492:3: ( rule__TextType__Group_0__0 )
                    // InternalSlideOMatic.g:1492:4: rule__TextType__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TextType__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTextTypeAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSlideOMatic.g:1496:2: ( ( rule__TextType__Group_1__0 ) )
                    {
                    // InternalSlideOMatic.g:1496:2: ( ( rule__TextType__Group_1__0 ) )
                    // InternalSlideOMatic.g:1497:3: ( rule__TextType__Group_1__0 )
                    {
                     before(grammarAccess.getTextTypeAccess().getGroup_1()); 
                    // InternalSlideOMatic.g:1498:3: ( rule__TextType__Group_1__0 )
                    // InternalSlideOMatic.g:1498:4: rule__TextType__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TextType__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTextTypeAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSlideOMatic.g:1502:2: ( ( rule__TextType__Group_2__0 ) )
                    {
                    // InternalSlideOMatic.g:1502:2: ( ( rule__TextType__Group_2__0 ) )
                    // InternalSlideOMatic.g:1503:3: ( rule__TextType__Group_2__0 )
                    {
                     before(grammarAccess.getTextTypeAccess().getGroup_2()); 
                    // InternalSlideOMatic.g:1504:3: ( rule__TextType__Group_2__0 )
                    // InternalSlideOMatic.g:1504:4: rule__TextType__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TextType__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTextTypeAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSlideOMatic.g:1508:2: ( ( rule__TextType__Group_3__0 ) )
                    {
                    // InternalSlideOMatic.g:1508:2: ( ( rule__TextType__Group_3__0 ) )
                    // InternalSlideOMatic.g:1509:3: ( rule__TextType__Group_3__0 )
                    {
                     before(grammarAccess.getTextTypeAccess().getGroup_3()); 
                    // InternalSlideOMatic.g:1510:3: ( rule__TextType__Group_3__0 )
                    // InternalSlideOMatic.g:1510:4: rule__TextType__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TextType__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTextTypeAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSlideOMatic.g:1514:2: ( ( rule__TextType__Group_4__0 ) )
                    {
                    // InternalSlideOMatic.g:1514:2: ( ( rule__TextType__Group_4__0 ) )
                    // InternalSlideOMatic.g:1515:3: ( rule__TextType__Group_4__0 )
                    {
                     before(grammarAccess.getTextTypeAccess().getGroup_4()); 
                    // InternalSlideOMatic.g:1516:3: ( rule__TextType__Group_4__0 )
                    // InternalSlideOMatic.g:1516:4: rule__TextType__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TextType__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTextTypeAccess().getGroup_4()); 

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
    // $ANTLR end "rule__TextType__Alternatives"


    // $ANTLR start "rule__List__Alternatives"
    // InternalSlideOMatic.g:1524:1: rule__List__Alternatives : ( ( ruleNumberedList ) | ( ruleUnNumberedList ) );
    public final void rule__List__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1528:1: ( ( ruleNumberedList ) | ( ruleUnNumberedList ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==85) ) {
                alt11=1;
            }
            else if ( (LA11_0==86) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalSlideOMatic.g:1529:2: ( ruleNumberedList )
                    {
                    // InternalSlideOMatic.g:1529:2: ( ruleNumberedList )
                    // InternalSlideOMatic.g:1530:3: ruleNumberedList
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
                    // InternalSlideOMatic.g:1535:2: ( ruleUnNumberedList )
                    {
                    // InternalSlideOMatic.g:1535:2: ( ruleUnNumberedList )
                    // InternalSlideOMatic.g:1536:3: ruleUnNumberedList
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
    // InternalSlideOMatic.g:1545:1: rule__Alignment__Alternatives : ( ( 'left' ) | ( 'center' ) | ( 'right' ) );
    public final void rule__Alignment__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1549:1: ( ( 'left' ) | ( 'center' ) | ( 'right' ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 58:
                {
                alt12=1;
                }
                break;
            case 59:
                {
                alt12=2;
                }
                break;
            case 60:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalSlideOMatic.g:1550:2: ( 'left' )
                    {
                    // InternalSlideOMatic.g:1550:2: ( 'left' )
                    // InternalSlideOMatic.g:1551:3: 'left'
                    {
                     before(grammarAccess.getAlignmentAccess().getLeftKeyword_0()); 
                    match(input,58,FOLLOW_2); 
                     after(grammarAccess.getAlignmentAccess().getLeftKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSlideOMatic.g:1556:2: ( 'center' )
                    {
                    // InternalSlideOMatic.g:1556:2: ( 'center' )
                    // InternalSlideOMatic.g:1557:3: 'center'
                    {
                     before(grammarAccess.getAlignmentAccess().getCenterKeyword_1()); 
                    match(input,59,FOLLOW_2); 
                     after(grammarAccess.getAlignmentAccess().getCenterKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSlideOMatic.g:1562:2: ( 'right' )
                    {
                    // InternalSlideOMatic.g:1562:2: ( 'right' )
                    // InternalSlideOMatic.g:1563:3: 'right'
                    {
                     before(grammarAccess.getAlignmentAccess().getRightKeyword_2()); 
                    match(input,60,FOLLOW_2); 
                     after(grammarAccess.getAlignmentAccess().getRightKeyword_2()); 

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
    // InternalSlideOMatic.g:1572:1: rule__Size__Alternatives : ( ( ( rule__Size__Group_0__0 ) ) | ( ( rule__Size__Group_1__0 ) ) );
    public final void rule__Size__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1576:1: ( ( ( rule__Size__Group_0__0 ) ) | ( ( rule__Size__Group_1__0 ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==93) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==RULE_INT) ) {
                    int LA13_3 = input.LA(3);

                    if ( ((LA13_3>=61 && LA13_3<=63)) ) {
                        alt13=2;
                    }
                    else if ( (LA13_3==92) ) {
                        alt13=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA13_0==94) ) {
                int LA13_2 = input.LA(2);

                if ( (LA13_2==RULE_INT) ) {
                    int LA13_3 = input.LA(3);

                    if ( ((LA13_3>=61 && LA13_3<=63)) ) {
                        alt13=2;
                    }
                    else if ( (LA13_3==92) ) {
                        alt13=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalSlideOMatic.g:1577:2: ( ( rule__Size__Group_0__0 ) )
                    {
                    // InternalSlideOMatic.g:1577:2: ( ( rule__Size__Group_0__0 ) )
                    // InternalSlideOMatic.g:1578:3: ( rule__Size__Group_0__0 )
                    {
                     before(grammarAccess.getSizeAccess().getGroup_0()); 
                    // InternalSlideOMatic.g:1579:3: ( rule__Size__Group_0__0 )
                    // InternalSlideOMatic.g:1579:4: rule__Size__Group_0__0
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
                    // InternalSlideOMatic.g:1583:2: ( ( rule__Size__Group_1__0 ) )
                    {
                    // InternalSlideOMatic.g:1583:2: ( ( rule__Size__Group_1__0 ) )
                    // InternalSlideOMatic.g:1584:3: ( rule__Size__Group_1__0 )
                    {
                     before(grammarAccess.getSizeAccess().getGroup_1()); 
                    // InternalSlideOMatic.g:1585:3: ( rule__Size__Group_1__0 )
                    // InternalSlideOMatic.g:1585:4: rule__Size__Group_1__0
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


    // $ANTLR start "rule__Size__UnitAlternatives_1_3_0"
    // InternalSlideOMatic.g:1593:1: rule__Size__UnitAlternatives_1_3_0 : ( ( 'cm' ) | ( 'em' ) | ( 'mm' ) );
    public final void rule__Size__UnitAlternatives_1_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1597:1: ( ( 'cm' ) | ( 'em' ) | ( 'mm' ) )
            int alt14=3;
            switch ( input.LA(1) ) {
            case 61:
                {
                alt14=1;
                }
                break;
            case 62:
                {
                alt14=2;
                }
                break;
            case 63:
                {
                alt14=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalSlideOMatic.g:1598:2: ( 'cm' )
                    {
                    // InternalSlideOMatic.g:1598:2: ( 'cm' )
                    // InternalSlideOMatic.g:1599:3: 'cm'
                    {
                     before(grammarAccess.getSizeAccess().getUnitCmKeyword_1_3_0_0()); 
                    match(input,61,FOLLOW_2); 
                     after(grammarAccess.getSizeAccess().getUnitCmKeyword_1_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSlideOMatic.g:1604:2: ( 'em' )
                    {
                    // InternalSlideOMatic.g:1604:2: ( 'em' )
                    // InternalSlideOMatic.g:1605:3: 'em'
                    {
                     before(grammarAccess.getSizeAccess().getUnitEmKeyword_1_3_0_1()); 
                    match(input,62,FOLLOW_2); 
                     after(grammarAccess.getSizeAccess().getUnitEmKeyword_1_3_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSlideOMatic.g:1610:2: ( 'mm' )
                    {
                    // InternalSlideOMatic.g:1610:2: ( 'mm' )
                    // InternalSlideOMatic.g:1611:3: 'mm'
                    {
                     before(grammarAccess.getSizeAccess().getUnitMmKeyword_1_3_0_2()); 
                    match(input,63,FOLLOW_2); 
                     after(grammarAccess.getSizeAccess().getUnitMmKeyword_1_3_0_2()); 

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
    // $ANTLR end "rule__Size__UnitAlternatives_1_3_0"


    // $ANTLR start "rule__Way__Alternatives"
    // InternalSlideOMatic.g:1620:1: rule__Way__Alternatives : ( ( ( rule__Way__Group_0__0 ) ) | ( ( rule__Way__Group_1__0 ) ) );
    public final void rule__Way__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1624:1: ( ( ( rule__Way__Group_0__0 ) ) | ( ( rule__Way__Group_1__0 ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==93) ) {
                alt15=1;
            }
            else if ( (LA15_0==94) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalSlideOMatic.g:1625:2: ( ( rule__Way__Group_0__0 ) )
                    {
                    // InternalSlideOMatic.g:1625:2: ( ( rule__Way__Group_0__0 ) )
                    // InternalSlideOMatic.g:1626:3: ( rule__Way__Group_0__0 )
                    {
                     before(grammarAccess.getWayAccess().getGroup_0()); 
                    // InternalSlideOMatic.g:1627:3: ( rule__Way__Group_0__0 )
                    // InternalSlideOMatic.g:1627:4: rule__Way__Group_0__0
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
                    // InternalSlideOMatic.g:1631:2: ( ( rule__Way__Group_1__0 ) )
                    {
                    // InternalSlideOMatic.g:1631:2: ( ( rule__Way__Group_1__0 ) )
                    // InternalSlideOMatic.g:1632:3: ( rule__Way__Group_1__0 )
                    {
                     before(grammarAccess.getWayAccess().getGroup_1()); 
                    // InternalSlideOMatic.g:1633:3: ( rule__Way__Group_1__0 )
                    // InternalSlideOMatic.g:1633:4: rule__Way__Group_1__0
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
    // InternalSlideOMatic.g:1641:1: rule__Code__Alternatives : ( ( ( rule__Code__Group_0__0 ) ) | ( ( rule__Code__Group_1__0 ) ) );
    public final void rule__Code__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1645:1: ( ( ( rule__Code__Group_0__0 ) ) | ( ( rule__Code__Group_1__0 ) ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==98) ) {
                alt16=1;
            }
            else if ( (LA16_0==100) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalSlideOMatic.g:1646:2: ( ( rule__Code__Group_0__0 ) )
                    {
                    // InternalSlideOMatic.g:1646:2: ( ( rule__Code__Group_0__0 ) )
                    // InternalSlideOMatic.g:1647:3: ( rule__Code__Group_0__0 )
                    {
                     before(grammarAccess.getCodeAccess().getGroup_0()); 
                    // InternalSlideOMatic.g:1648:3: ( rule__Code__Group_0__0 )
                    // InternalSlideOMatic.g:1648:4: rule__Code__Group_0__0
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
                    // InternalSlideOMatic.g:1652:2: ( ( rule__Code__Group_1__0 ) )
                    {
                    // InternalSlideOMatic.g:1652:2: ( ( rule__Code__Group_1__0 ) )
                    // InternalSlideOMatic.g:1653:3: ( rule__Code__Group_1__0 )
                    {
                     before(grammarAccess.getCodeAccess().getGroup_1()); 
                    // InternalSlideOMatic.g:1654:3: ( rule__Code__Group_1__0 )
                    // InternalSlideOMatic.g:1654:4: rule__Code__Group_1__0
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


    // $ANTLR start "rule__Exp__Alternatives_1_0"
    // InternalSlideOMatic.g:1662:1: rule__Exp__Alternatives_1_0 : ( ( ( rule__Exp__Group_1_0_0__0 ) ) | ( ( rule__Exp__Group_1_0_1__0 ) ) );
    public final void rule__Exp__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1666:1: ( ( ( rule__Exp__Group_1_0_0__0 ) ) | ( ( rule__Exp__Group_1_0_1__0 ) ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==108) ) {
                alt17=1;
            }
            else if ( (LA17_0==87) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalSlideOMatic.g:1667:2: ( ( rule__Exp__Group_1_0_0__0 ) )
                    {
                    // InternalSlideOMatic.g:1667:2: ( ( rule__Exp__Group_1_0_0__0 ) )
                    // InternalSlideOMatic.g:1668:3: ( rule__Exp__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getExpAccess().getGroup_1_0_0()); 
                    // InternalSlideOMatic.g:1669:3: ( rule__Exp__Group_1_0_0__0 )
                    // InternalSlideOMatic.g:1669:4: rule__Exp__Group_1_0_0__0
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
                    // InternalSlideOMatic.g:1673:2: ( ( rule__Exp__Group_1_0_1__0 ) )
                    {
                    // InternalSlideOMatic.g:1673:2: ( ( rule__Exp__Group_1_0_1__0 ) )
                    // InternalSlideOMatic.g:1674:3: ( rule__Exp__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getExpAccess().getGroup_1_0_1()); 
                    // InternalSlideOMatic.g:1675:3: ( rule__Exp__Group_1_0_1__0 )
                    // InternalSlideOMatic.g:1675:4: rule__Exp__Group_1_0_1__0
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
    // InternalSlideOMatic.g:1683:1: rule__Factor__Alternatives_1_0 : ( ( ( rule__Factor__Group_1_0_0__0 ) ) | ( ( rule__Factor__Group_1_0_1__0 ) ) );
    public final void rule__Factor__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1687:1: ( ( ( rule__Factor__Group_1_0_0__0 ) ) | ( ( rule__Factor__Group_1_0_1__0 ) ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==74) ) {
                alt18=1;
            }
            else if ( (LA18_0==109) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalSlideOMatic.g:1688:2: ( ( rule__Factor__Group_1_0_0__0 ) )
                    {
                    // InternalSlideOMatic.g:1688:2: ( ( rule__Factor__Group_1_0_0__0 ) )
                    // InternalSlideOMatic.g:1689:3: ( rule__Factor__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getFactorAccess().getGroup_1_0_0()); 
                    // InternalSlideOMatic.g:1690:3: ( rule__Factor__Group_1_0_0__0 )
                    // InternalSlideOMatic.g:1690:4: rule__Factor__Group_1_0_0__0
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
                    // InternalSlideOMatic.g:1694:2: ( ( rule__Factor__Group_1_0_1__0 ) )
                    {
                    // InternalSlideOMatic.g:1694:2: ( ( rule__Factor__Group_1_0_1__0 ) )
                    // InternalSlideOMatic.g:1695:3: ( rule__Factor__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getFactorAccess().getGroup_1_0_1()); 
                    // InternalSlideOMatic.g:1696:3: ( rule__Factor__Group_1_0_1__0 )
                    // InternalSlideOMatic.g:1696:4: rule__Factor__Group_1_0_1__0
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
    // InternalSlideOMatic.g:1704:1: rule__Primary__Alternatives : ( ( ruleNumber ) | ( ruleParenthesis ) | ( ruleVariableBinding ) | ( ruleVariableUse ) );
    public final void rule__Primary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1708:1: ( ( ruleNumber ) | ( ruleParenthesis ) | ( ruleVariableBinding ) | ( ruleVariableUse ) )
            int alt19=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt19=1;
                }
                break;
            case 67:
                {
                alt19=2;
                }
                break;
            case 111:
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
                    // InternalSlideOMatic.g:1709:2: ( ruleNumber )
                    {
                    // InternalSlideOMatic.g:1709:2: ( ruleNumber )
                    // InternalSlideOMatic.g:1710:3: ruleNumber
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
                    // InternalSlideOMatic.g:1715:2: ( ruleParenthesis )
                    {
                    // InternalSlideOMatic.g:1715:2: ( ruleParenthesis )
                    // InternalSlideOMatic.g:1716:3: ruleParenthesis
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
                    // InternalSlideOMatic.g:1721:2: ( ruleVariableBinding )
                    {
                    // InternalSlideOMatic.g:1721:2: ( ruleVariableBinding )
                    // InternalSlideOMatic.g:1722:3: ruleVariableBinding
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
                    // InternalSlideOMatic.g:1727:2: ( ruleVariableUse )
                    {
                    // InternalSlideOMatic.g:1727:2: ( ruleVariableUse )
                    // InternalSlideOMatic.g:1728:3: ruleVariableUse
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
    // InternalSlideOMatic.g:1737:1: rule__Presentation__Group__0 : rule__Presentation__Group__0__Impl rule__Presentation__Group__1 ;
    public final void rule__Presentation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1741:1: ( rule__Presentation__Group__0__Impl rule__Presentation__Group__1 )
            // InternalSlideOMatic.g:1742:2: rule__Presentation__Group__0__Impl rule__Presentation__Group__1
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
    // InternalSlideOMatic.g:1749:1: rule__Presentation__Group__0__Impl : ( 'presentation' ) ;
    public final void rule__Presentation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1753:1: ( ( 'presentation' ) )
            // InternalSlideOMatic.g:1754:1: ( 'presentation' )
            {
            // InternalSlideOMatic.g:1754:1: ( 'presentation' )
            // InternalSlideOMatic.g:1755:2: 'presentation'
            {
             before(grammarAccess.getPresentationAccess().getPresentationKeyword_0()); 
            match(input,64,FOLLOW_2); 
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
    // InternalSlideOMatic.g:1764:1: rule__Presentation__Group__1 : rule__Presentation__Group__1__Impl rule__Presentation__Group__2 ;
    public final void rule__Presentation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1768:1: ( rule__Presentation__Group__1__Impl rule__Presentation__Group__2 )
            // InternalSlideOMatic.g:1769:2: rule__Presentation__Group__1__Impl rule__Presentation__Group__2
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
    // InternalSlideOMatic.g:1776:1: rule__Presentation__Group__1__Impl : ( ( rule__Presentation__NameAssignment_1 ) ) ;
    public final void rule__Presentation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1780:1: ( ( ( rule__Presentation__NameAssignment_1 ) ) )
            // InternalSlideOMatic.g:1781:1: ( ( rule__Presentation__NameAssignment_1 ) )
            {
            // InternalSlideOMatic.g:1781:1: ( ( rule__Presentation__NameAssignment_1 ) )
            // InternalSlideOMatic.g:1782:2: ( rule__Presentation__NameAssignment_1 )
            {
             before(grammarAccess.getPresentationAccess().getNameAssignment_1()); 
            // InternalSlideOMatic.g:1783:2: ( rule__Presentation__NameAssignment_1 )
            // InternalSlideOMatic.g:1783:3: rule__Presentation__NameAssignment_1
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
    // InternalSlideOMatic.g:1791:1: rule__Presentation__Group__2 : rule__Presentation__Group__2__Impl rule__Presentation__Group__3 ;
    public final void rule__Presentation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1795:1: ( rule__Presentation__Group__2__Impl rule__Presentation__Group__3 )
            // InternalSlideOMatic.g:1796:2: rule__Presentation__Group__2__Impl rule__Presentation__Group__3
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
    // InternalSlideOMatic.g:1803:1: rule__Presentation__Group__2__Impl : ( ( rule__Presentation__SubtitleAssignment_2 )? ) ;
    public final void rule__Presentation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1807:1: ( ( ( rule__Presentation__SubtitleAssignment_2 )? ) )
            // InternalSlideOMatic.g:1808:1: ( ( rule__Presentation__SubtitleAssignment_2 )? )
            {
            // InternalSlideOMatic.g:1808:1: ( ( rule__Presentation__SubtitleAssignment_2 )? )
            // InternalSlideOMatic.g:1809:2: ( rule__Presentation__SubtitleAssignment_2 )?
            {
             before(grammarAccess.getPresentationAccess().getSubtitleAssignment_2()); 
            // InternalSlideOMatic.g:1810:2: ( rule__Presentation__SubtitleAssignment_2 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_STRING) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalSlideOMatic.g:1810:3: rule__Presentation__SubtitleAssignment_2
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
    // InternalSlideOMatic.g:1818:1: rule__Presentation__Group__3 : rule__Presentation__Group__3__Impl rule__Presentation__Group__4 ;
    public final void rule__Presentation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1822:1: ( rule__Presentation__Group__3__Impl rule__Presentation__Group__4 )
            // InternalSlideOMatic.g:1823:2: rule__Presentation__Group__3__Impl rule__Presentation__Group__4
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
    // InternalSlideOMatic.g:1830:1: rule__Presentation__Group__3__Impl : ( '{' ) ;
    public final void rule__Presentation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1834:1: ( ( '{' ) )
            // InternalSlideOMatic.g:1835:1: ( '{' )
            {
            // InternalSlideOMatic.g:1835:1: ( '{' )
            // InternalSlideOMatic.g:1836:2: '{'
            {
             before(grammarAccess.getPresentationAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,65,FOLLOW_2); 
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
    // InternalSlideOMatic.g:1845:1: rule__Presentation__Group__4 : rule__Presentation__Group__4__Impl rule__Presentation__Group__5 ;
    public final void rule__Presentation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1849:1: ( rule__Presentation__Group__4__Impl rule__Presentation__Group__5 )
            // InternalSlideOMatic.g:1850:2: rule__Presentation__Group__4__Impl rule__Presentation__Group__5
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
    // InternalSlideOMatic.g:1857:1: rule__Presentation__Group__4__Impl : ( ( rule__Presentation__Group_4__0 )? ) ;
    public final void rule__Presentation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1861:1: ( ( ( rule__Presentation__Group_4__0 )? ) )
            // InternalSlideOMatic.g:1862:1: ( ( rule__Presentation__Group_4__0 )? )
            {
            // InternalSlideOMatic.g:1862:1: ( ( rule__Presentation__Group_4__0 )? )
            // InternalSlideOMatic.g:1863:2: ( rule__Presentation__Group_4__0 )?
            {
             before(grammarAccess.getPresentationAccess().getGroup_4()); 
            // InternalSlideOMatic.g:1864:2: ( rule__Presentation__Group_4__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==67) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalSlideOMatic.g:1864:3: rule__Presentation__Group_4__0
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
    // InternalSlideOMatic.g:1872:1: rule__Presentation__Group__5 : rule__Presentation__Group__5__Impl rule__Presentation__Group__6 ;
    public final void rule__Presentation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1876:1: ( rule__Presentation__Group__5__Impl rule__Presentation__Group__6 )
            // InternalSlideOMatic.g:1877:2: rule__Presentation__Group__5__Impl rule__Presentation__Group__6
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
    // InternalSlideOMatic.g:1884:1: rule__Presentation__Group__5__Impl : ( ( rule__Presentation__Alternatives_5 )* ) ;
    public final void rule__Presentation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1888:1: ( ( ( rule__Presentation__Alternatives_5 )* ) )
            // InternalSlideOMatic.g:1889:1: ( ( rule__Presentation__Alternatives_5 )* )
            {
            // InternalSlideOMatic.g:1889:1: ( ( rule__Presentation__Alternatives_5 )* )
            // InternalSlideOMatic.g:1890:2: ( rule__Presentation__Alternatives_5 )*
            {
             before(grammarAccess.getPresentationAccess().getAlternatives_5()); 
            // InternalSlideOMatic.g:1891:2: ( rule__Presentation__Alternatives_5 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==75||LA22_0==88) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalSlideOMatic.g:1891:3: rule__Presentation__Alternatives_5
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
    // InternalSlideOMatic.g:1899:1: rule__Presentation__Group__6 : rule__Presentation__Group__6__Impl ;
    public final void rule__Presentation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1903:1: ( rule__Presentation__Group__6__Impl )
            // InternalSlideOMatic.g:1904:2: rule__Presentation__Group__6__Impl
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
    // InternalSlideOMatic.g:1910:1: rule__Presentation__Group__6__Impl : ( '}' ) ;
    public final void rule__Presentation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1914:1: ( ( '}' ) )
            // InternalSlideOMatic.g:1915:1: ( '}' )
            {
            // InternalSlideOMatic.g:1915:1: ( '}' )
            // InternalSlideOMatic.g:1916:2: '}'
            {
             before(grammarAccess.getPresentationAccess().getRightCurlyBracketKeyword_6()); 
            match(input,66,FOLLOW_2); 
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
    // InternalSlideOMatic.g:1926:1: rule__Presentation__Group_4__0 : rule__Presentation__Group_4__0__Impl rule__Presentation__Group_4__1 ;
    public final void rule__Presentation__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1930:1: ( rule__Presentation__Group_4__0__Impl rule__Presentation__Group_4__1 )
            // InternalSlideOMatic.g:1931:2: rule__Presentation__Group_4__0__Impl rule__Presentation__Group_4__1
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
    // InternalSlideOMatic.g:1938:1: rule__Presentation__Group_4__0__Impl : ( '(' ) ;
    public final void rule__Presentation__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1942:1: ( ( '(' ) )
            // InternalSlideOMatic.g:1943:1: ( '(' )
            {
            // InternalSlideOMatic.g:1943:1: ( '(' )
            // InternalSlideOMatic.g:1944:2: '('
            {
             before(grammarAccess.getPresentationAccess().getLeftParenthesisKeyword_4_0()); 
            match(input,67,FOLLOW_2); 
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
    // InternalSlideOMatic.g:1953:1: rule__Presentation__Group_4__1 : rule__Presentation__Group_4__1__Impl rule__Presentation__Group_4__2 ;
    public final void rule__Presentation__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1957:1: ( rule__Presentation__Group_4__1__Impl rule__Presentation__Group_4__2 )
            // InternalSlideOMatic.g:1958:2: rule__Presentation__Group_4__1__Impl rule__Presentation__Group_4__2
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
    // InternalSlideOMatic.g:1965:1: rule__Presentation__Group_4__1__Impl : ( ( rule__Presentation__ThemeAssignment_4_1 )? ) ;
    public final void rule__Presentation__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1969:1: ( ( ( rule__Presentation__ThemeAssignment_4_1 )? ) )
            // InternalSlideOMatic.g:1970:1: ( ( rule__Presentation__ThemeAssignment_4_1 )? )
            {
            // InternalSlideOMatic.g:1970:1: ( ( rule__Presentation__ThemeAssignment_4_1 )? )
            // InternalSlideOMatic.g:1971:2: ( rule__Presentation__ThemeAssignment_4_1 )?
            {
             before(grammarAccess.getPresentationAccess().getThemeAssignment_4_1()); 
            // InternalSlideOMatic.g:1972:2: ( rule__Presentation__ThemeAssignment_4_1 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==69) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalSlideOMatic.g:1972:3: rule__Presentation__ThemeAssignment_4_1
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
    // InternalSlideOMatic.g:1980:1: rule__Presentation__Group_4__2 : rule__Presentation__Group_4__2__Impl rule__Presentation__Group_4__3 ;
    public final void rule__Presentation__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1984:1: ( rule__Presentation__Group_4__2__Impl rule__Presentation__Group_4__3 )
            // InternalSlideOMatic.g:1985:2: rule__Presentation__Group_4__2__Impl rule__Presentation__Group_4__3
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
    // InternalSlideOMatic.g:1992:1: rule__Presentation__Group_4__2__Impl : ( ( rule__Presentation__AuthorsAssignment_4_2 )? ) ;
    public final void rule__Presentation__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1996:1: ( ( ( rule__Presentation__AuthorsAssignment_4_2 )? ) )
            // InternalSlideOMatic.g:1997:1: ( ( rule__Presentation__AuthorsAssignment_4_2 )? )
            {
            // InternalSlideOMatic.g:1997:1: ( ( rule__Presentation__AuthorsAssignment_4_2 )? )
            // InternalSlideOMatic.g:1998:2: ( rule__Presentation__AuthorsAssignment_4_2 )?
            {
             before(grammarAccess.getPresentationAccess().getAuthorsAssignment_4_2()); 
            // InternalSlideOMatic.g:1999:2: ( rule__Presentation__AuthorsAssignment_4_2 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=56 && LA24_0<=57)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalSlideOMatic.g:1999:3: rule__Presentation__AuthorsAssignment_4_2
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
    // InternalSlideOMatic.g:2007:1: rule__Presentation__Group_4__3 : rule__Presentation__Group_4__3__Impl rule__Presentation__Group_4__4 ;
    public final void rule__Presentation__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2011:1: ( rule__Presentation__Group_4__3__Impl rule__Presentation__Group_4__4 )
            // InternalSlideOMatic.g:2012:2: rule__Presentation__Group_4__3__Impl rule__Presentation__Group_4__4
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
    // InternalSlideOMatic.g:2019:1: rule__Presentation__Group_4__3__Impl : ( ( rule__Presentation__InstituteAssignment_4_3 )? ) ;
    public final void rule__Presentation__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2023:1: ( ( ( rule__Presentation__InstituteAssignment_4_3 )? ) )
            // InternalSlideOMatic.g:2024:1: ( ( rule__Presentation__InstituteAssignment_4_3 )? )
            {
            // InternalSlideOMatic.g:2024:1: ( ( rule__Presentation__InstituteAssignment_4_3 )? )
            // InternalSlideOMatic.g:2025:2: ( rule__Presentation__InstituteAssignment_4_3 )?
            {
             before(grammarAccess.getPresentationAccess().getInstituteAssignment_4_3()); 
            // InternalSlideOMatic.g:2026:2: ( rule__Presentation__InstituteAssignment_4_3 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==72) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalSlideOMatic.g:2026:3: rule__Presentation__InstituteAssignment_4_3
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
    // InternalSlideOMatic.g:2034:1: rule__Presentation__Group_4__4 : rule__Presentation__Group_4__4__Impl rule__Presentation__Group_4__5 ;
    public final void rule__Presentation__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2038:1: ( rule__Presentation__Group_4__4__Impl rule__Presentation__Group_4__5 )
            // InternalSlideOMatic.g:2039:2: rule__Presentation__Group_4__4__Impl rule__Presentation__Group_4__5
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
    // InternalSlideOMatic.g:2046:1: rule__Presentation__Group_4__4__Impl : ( ( rule__Presentation__DateAssignment_4_4 )? ) ;
    public final void rule__Presentation__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2050:1: ( ( ( rule__Presentation__DateAssignment_4_4 )? ) )
            // InternalSlideOMatic.g:2051:1: ( ( rule__Presentation__DateAssignment_4_4 )? )
            {
            // InternalSlideOMatic.g:2051:1: ( ( rule__Presentation__DateAssignment_4_4 )? )
            // InternalSlideOMatic.g:2052:2: ( rule__Presentation__DateAssignment_4_4 )?
            {
             before(grammarAccess.getPresentationAccess().getDateAssignment_4_4()); 
            // InternalSlideOMatic.g:2053:2: ( rule__Presentation__DateAssignment_4_4 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==73) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalSlideOMatic.g:2053:3: rule__Presentation__DateAssignment_4_4
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
    // InternalSlideOMatic.g:2061:1: rule__Presentation__Group_4__5 : rule__Presentation__Group_4__5__Impl ;
    public final void rule__Presentation__Group_4__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2065:1: ( rule__Presentation__Group_4__5__Impl )
            // InternalSlideOMatic.g:2066:2: rule__Presentation__Group_4__5__Impl
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
    // InternalSlideOMatic.g:2072:1: rule__Presentation__Group_4__5__Impl : ( ')' ) ;
    public final void rule__Presentation__Group_4__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2076:1: ( ( ')' ) )
            // InternalSlideOMatic.g:2077:1: ( ')' )
            {
            // InternalSlideOMatic.g:2077:1: ( ')' )
            // InternalSlideOMatic.g:2078:2: ')'
            {
             before(grammarAccess.getPresentationAccess().getRightParenthesisKeyword_4_5()); 
            match(input,68,FOLLOW_2); 
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
    // InternalSlideOMatic.g:2088:1: rule__Theme__Group__0 : rule__Theme__Group__0__Impl rule__Theme__Group__1 ;
    public final void rule__Theme__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2092:1: ( rule__Theme__Group__0__Impl rule__Theme__Group__1 )
            // InternalSlideOMatic.g:2093:2: rule__Theme__Group__0__Impl rule__Theme__Group__1
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
    // InternalSlideOMatic.g:2100:1: rule__Theme__Group__0__Impl : ( 'theme' ) ;
    public final void rule__Theme__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2104:1: ( ( 'theme' ) )
            // InternalSlideOMatic.g:2105:1: ( 'theme' )
            {
            // InternalSlideOMatic.g:2105:1: ( 'theme' )
            // InternalSlideOMatic.g:2106:2: 'theme'
            {
             before(grammarAccess.getThemeAccess().getThemeKeyword_0()); 
            match(input,69,FOLLOW_2); 
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
    // InternalSlideOMatic.g:2115:1: rule__Theme__Group__1 : rule__Theme__Group__1__Impl rule__Theme__Group__2 ;
    public final void rule__Theme__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2119:1: ( rule__Theme__Group__1__Impl rule__Theme__Group__2 )
            // InternalSlideOMatic.g:2120:2: rule__Theme__Group__1__Impl rule__Theme__Group__2
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
    // InternalSlideOMatic.g:2127:1: rule__Theme__Group__1__Impl : ( ( rule__Theme__ThemeAssignment_1 ) ) ;
    public final void rule__Theme__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2131:1: ( ( ( rule__Theme__ThemeAssignment_1 ) ) )
            // InternalSlideOMatic.g:2132:1: ( ( rule__Theme__ThemeAssignment_1 ) )
            {
            // InternalSlideOMatic.g:2132:1: ( ( rule__Theme__ThemeAssignment_1 ) )
            // InternalSlideOMatic.g:2133:2: ( rule__Theme__ThemeAssignment_1 )
            {
             before(grammarAccess.getThemeAccess().getThemeAssignment_1()); 
            // InternalSlideOMatic.g:2134:2: ( rule__Theme__ThemeAssignment_1 )
            // InternalSlideOMatic.g:2134:3: rule__Theme__ThemeAssignment_1
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
    // InternalSlideOMatic.g:2142:1: rule__Theme__Group__2 : rule__Theme__Group__2__Impl ;
    public final void rule__Theme__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2146:1: ( rule__Theme__Group__2__Impl )
            // InternalSlideOMatic.g:2147:2: rule__Theme__Group__2__Impl
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
    // InternalSlideOMatic.g:2153:1: rule__Theme__Group__2__Impl : ( ( rule__Theme__Group_2__0 )? ) ;
    public final void rule__Theme__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2157:1: ( ( ( rule__Theme__Group_2__0 )? ) )
            // InternalSlideOMatic.g:2158:1: ( ( rule__Theme__Group_2__0 )? )
            {
            // InternalSlideOMatic.g:2158:1: ( ( rule__Theme__Group_2__0 )? )
            // InternalSlideOMatic.g:2159:2: ( rule__Theme__Group_2__0 )?
            {
             before(grammarAccess.getThemeAccess().getGroup_2()); 
            // InternalSlideOMatic.g:2160:2: ( rule__Theme__Group_2__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==70) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalSlideOMatic.g:2160:3: rule__Theme__Group_2__0
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
    // InternalSlideOMatic.g:2169:1: rule__Theme__Group_2__0 : rule__Theme__Group_2__0__Impl rule__Theme__Group_2__1 ;
    public final void rule__Theme__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2173:1: ( rule__Theme__Group_2__0__Impl rule__Theme__Group_2__1 )
            // InternalSlideOMatic.g:2174:2: rule__Theme__Group_2__0__Impl rule__Theme__Group_2__1
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
    // InternalSlideOMatic.g:2181:1: rule__Theme__Group_2__0__Impl : ( 'color' ) ;
    public final void rule__Theme__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2185:1: ( ( 'color' ) )
            // InternalSlideOMatic.g:2186:1: ( 'color' )
            {
            // InternalSlideOMatic.g:2186:1: ( 'color' )
            // InternalSlideOMatic.g:2187:2: 'color'
            {
             before(grammarAccess.getThemeAccess().getColorKeyword_2_0()); 
            match(input,70,FOLLOW_2); 
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
    // InternalSlideOMatic.g:2196:1: rule__Theme__Group_2__1 : rule__Theme__Group_2__1__Impl ;
    public final void rule__Theme__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2200:1: ( rule__Theme__Group_2__1__Impl )
            // InternalSlideOMatic.g:2201:2: rule__Theme__Group_2__1__Impl
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
    // InternalSlideOMatic.g:2207:1: rule__Theme__Group_2__1__Impl : ( ( rule__Theme__ThemeColorAssignment_2_1 ) ) ;
    public final void rule__Theme__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2211:1: ( ( ( rule__Theme__ThemeColorAssignment_2_1 ) ) )
            // InternalSlideOMatic.g:2212:1: ( ( rule__Theme__ThemeColorAssignment_2_1 ) )
            {
            // InternalSlideOMatic.g:2212:1: ( ( rule__Theme__ThemeColorAssignment_2_1 ) )
            // InternalSlideOMatic.g:2213:2: ( rule__Theme__ThemeColorAssignment_2_1 )
            {
             before(grammarAccess.getThemeAccess().getThemeColorAssignment_2_1()); 
            // InternalSlideOMatic.g:2214:2: ( rule__Theme__ThemeColorAssignment_2_1 )
            // InternalSlideOMatic.g:2214:3: rule__Theme__ThemeColorAssignment_2_1
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
    // InternalSlideOMatic.g:2223:1: rule__Authors__Group__0 : rule__Authors__Group__0__Impl rule__Authors__Group__1 ;
    public final void rule__Authors__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2227:1: ( rule__Authors__Group__0__Impl rule__Authors__Group__1 )
            // InternalSlideOMatic.g:2228:2: rule__Authors__Group__0__Impl rule__Authors__Group__1
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
    // InternalSlideOMatic.g:2235:1: rule__Authors__Group__0__Impl : ( ( rule__Authors__Alternatives_0 ) ) ;
    public final void rule__Authors__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2239:1: ( ( ( rule__Authors__Alternatives_0 ) ) )
            // InternalSlideOMatic.g:2240:1: ( ( rule__Authors__Alternatives_0 ) )
            {
            // InternalSlideOMatic.g:2240:1: ( ( rule__Authors__Alternatives_0 ) )
            // InternalSlideOMatic.g:2241:2: ( rule__Authors__Alternatives_0 )
            {
             before(grammarAccess.getAuthorsAccess().getAlternatives_0()); 
            // InternalSlideOMatic.g:2242:2: ( rule__Authors__Alternatives_0 )
            // InternalSlideOMatic.g:2242:3: rule__Authors__Alternatives_0
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
    // InternalSlideOMatic.g:2250:1: rule__Authors__Group__1 : rule__Authors__Group__1__Impl rule__Authors__Group__2 ;
    public final void rule__Authors__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2254:1: ( rule__Authors__Group__1__Impl rule__Authors__Group__2 )
            // InternalSlideOMatic.g:2255:2: rule__Authors__Group__1__Impl rule__Authors__Group__2
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
    // InternalSlideOMatic.g:2262:1: rule__Authors__Group__1__Impl : ( ( rule__Authors__NamesAssignment_1 ) ) ;
    public final void rule__Authors__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2266:1: ( ( ( rule__Authors__NamesAssignment_1 ) ) )
            // InternalSlideOMatic.g:2267:1: ( ( rule__Authors__NamesAssignment_1 ) )
            {
            // InternalSlideOMatic.g:2267:1: ( ( rule__Authors__NamesAssignment_1 ) )
            // InternalSlideOMatic.g:2268:2: ( rule__Authors__NamesAssignment_1 )
            {
             before(grammarAccess.getAuthorsAccess().getNamesAssignment_1()); 
            // InternalSlideOMatic.g:2269:2: ( rule__Authors__NamesAssignment_1 )
            // InternalSlideOMatic.g:2269:3: rule__Authors__NamesAssignment_1
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
    // InternalSlideOMatic.g:2277:1: rule__Authors__Group__2 : rule__Authors__Group__2__Impl ;
    public final void rule__Authors__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2281:1: ( rule__Authors__Group__2__Impl )
            // InternalSlideOMatic.g:2282:2: rule__Authors__Group__2__Impl
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
    // InternalSlideOMatic.g:2288:1: rule__Authors__Group__2__Impl : ( ( rule__Authors__Group_2__0 )* ) ;
    public final void rule__Authors__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2292:1: ( ( ( rule__Authors__Group_2__0 )* ) )
            // InternalSlideOMatic.g:2293:1: ( ( rule__Authors__Group_2__0 )* )
            {
            // InternalSlideOMatic.g:2293:1: ( ( rule__Authors__Group_2__0 )* )
            // InternalSlideOMatic.g:2294:2: ( rule__Authors__Group_2__0 )*
            {
             before(grammarAccess.getAuthorsAccess().getGroup_2()); 
            // InternalSlideOMatic.g:2295:2: ( rule__Authors__Group_2__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==71) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalSlideOMatic.g:2295:3: rule__Authors__Group_2__0
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
    // InternalSlideOMatic.g:2304:1: rule__Authors__Group_2__0 : rule__Authors__Group_2__0__Impl rule__Authors__Group_2__1 ;
    public final void rule__Authors__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2308:1: ( rule__Authors__Group_2__0__Impl rule__Authors__Group_2__1 )
            // InternalSlideOMatic.g:2309:2: rule__Authors__Group_2__0__Impl rule__Authors__Group_2__1
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
    // InternalSlideOMatic.g:2316:1: rule__Authors__Group_2__0__Impl : ( ',' ) ;
    public final void rule__Authors__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2320:1: ( ( ',' ) )
            // InternalSlideOMatic.g:2321:1: ( ',' )
            {
            // InternalSlideOMatic.g:2321:1: ( ',' )
            // InternalSlideOMatic.g:2322:2: ','
            {
             before(grammarAccess.getAuthorsAccess().getCommaKeyword_2_0()); 
            match(input,71,FOLLOW_2); 
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
    // InternalSlideOMatic.g:2331:1: rule__Authors__Group_2__1 : rule__Authors__Group_2__1__Impl ;
    public final void rule__Authors__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2335:1: ( rule__Authors__Group_2__1__Impl )
            // InternalSlideOMatic.g:2336:2: rule__Authors__Group_2__1__Impl
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
    // InternalSlideOMatic.g:2342:1: rule__Authors__Group_2__1__Impl : ( ( rule__Authors__NamesAssignment_2_1 ) ) ;
    public final void rule__Authors__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2346:1: ( ( ( rule__Authors__NamesAssignment_2_1 ) ) )
            // InternalSlideOMatic.g:2347:1: ( ( rule__Authors__NamesAssignment_2_1 ) )
            {
            // InternalSlideOMatic.g:2347:1: ( ( rule__Authors__NamesAssignment_2_1 ) )
            // InternalSlideOMatic.g:2348:2: ( rule__Authors__NamesAssignment_2_1 )
            {
             before(grammarAccess.getAuthorsAccess().getNamesAssignment_2_1()); 
            // InternalSlideOMatic.g:2349:2: ( rule__Authors__NamesAssignment_2_1 )
            // InternalSlideOMatic.g:2349:3: rule__Authors__NamesAssignment_2_1
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
    // InternalSlideOMatic.g:2358:1: rule__Institute__Group__0 : rule__Institute__Group__0__Impl rule__Institute__Group__1 ;
    public final void rule__Institute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2362:1: ( rule__Institute__Group__0__Impl rule__Institute__Group__1 )
            // InternalSlideOMatic.g:2363:2: rule__Institute__Group__0__Impl rule__Institute__Group__1
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
    // InternalSlideOMatic.g:2370:1: rule__Institute__Group__0__Impl : ( 'institute' ) ;
    public final void rule__Institute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2374:1: ( ( 'institute' ) )
            // InternalSlideOMatic.g:2375:1: ( 'institute' )
            {
            // InternalSlideOMatic.g:2375:1: ( 'institute' )
            // InternalSlideOMatic.g:2376:2: 'institute'
            {
             before(grammarAccess.getInstituteAccess().getInstituteKeyword_0()); 
            match(input,72,FOLLOW_2); 
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
    // InternalSlideOMatic.g:2385:1: rule__Institute__Group__1 : rule__Institute__Group__1__Impl ;
    public final void rule__Institute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2389:1: ( rule__Institute__Group__1__Impl )
            // InternalSlideOMatic.g:2390:2: rule__Institute__Group__1__Impl
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
    // InternalSlideOMatic.g:2396:1: rule__Institute__Group__1__Impl : ( ( rule__Institute__NameAssignment_1 ) ) ;
    public final void rule__Institute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2400:1: ( ( ( rule__Institute__NameAssignment_1 ) ) )
            // InternalSlideOMatic.g:2401:1: ( ( rule__Institute__NameAssignment_1 ) )
            {
            // InternalSlideOMatic.g:2401:1: ( ( rule__Institute__NameAssignment_1 ) )
            // InternalSlideOMatic.g:2402:2: ( rule__Institute__NameAssignment_1 )
            {
             before(grammarAccess.getInstituteAccess().getNameAssignment_1()); 
            // InternalSlideOMatic.g:2403:2: ( rule__Institute__NameAssignment_1 )
            // InternalSlideOMatic.g:2403:3: rule__Institute__NameAssignment_1
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
    // InternalSlideOMatic.g:2412:1: rule__Date__Group__0 : rule__Date__Group__0__Impl rule__Date__Group__1 ;
    public final void rule__Date__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2416:1: ( rule__Date__Group__0__Impl rule__Date__Group__1 )
            // InternalSlideOMatic.g:2417:2: rule__Date__Group__0__Impl rule__Date__Group__1
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
    // InternalSlideOMatic.g:2424:1: rule__Date__Group__0__Impl : ( 'date' ) ;
    public final void rule__Date__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2428:1: ( ( 'date' ) )
            // InternalSlideOMatic.g:2429:1: ( 'date' )
            {
            // InternalSlideOMatic.g:2429:1: ( 'date' )
            // InternalSlideOMatic.g:2430:2: 'date'
            {
             before(grammarAccess.getDateAccess().getDateKeyword_0()); 
            match(input,73,FOLLOW_2); 
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
    // InternalSlideOMatic.g:2439:1: rule__Date__Group__1 : rule__Date__Group__1__Impl ;
    public final void rule__Date__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2443:1: ( rule__Date__Group__1__Impl )
            // InternalSlideOMatic.g:2444:2: rule__Date__Group__1__Impl
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
    // InternalSlideOMatic.g:2450:1: rule__Date__Group__1__Impl : ( ( rule__Date__Alternatives_1 ) ) ;
    public final void rule__Date__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2454:1: ( ( ( rule__Date__Alternatives_1 ) ) )
            // InternalSlideOMatic.g:2455:1: ( ( rule__Date__Alternatives_1 ) )
            {
            // InternalSlideOMatic.g:2455:1: ( ( rule__Date__Alternatives_1 ) )
            // InternalSlideOMatic.g:2456:2: ( rule__Date__Alternatives_1 )
            {
             before(grammarAccess.getDateAccess().getAlternatives_1()); 
            // InternalSlideOMatic.g:2457:2: ( rule__Date__Alternatives_1 )
            // InternalSlideOMatic.g:2457:3: rule__Date__Alternatives_1
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
    // InternalSlideOMatic.g:2466:1: rule__Date__Group_1_1__0 : rule__Date__Group_1_1__0__Impl rule__Date__Group_1_1__1 ;
    public final void rule__Date__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2470:1: ( rule__Date__Group_1_1__0__Impl rule__Date__Group_1_1__1 )
            // InternalSlideOMatic.g:2471:2: rule__Date__Group_1_1__0__Impl rule__Date__Group_1_1__1
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
    // InternalSlideOMatic.g:2478:1: rule__Date__Group_1_1__0__Impl : ( () ) ;
    public final void rule__Date__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2482:1: ( ( () ) )
            // InternalSlideOMatic.g:2483:1: ( () )
            {
            // InternalSlideOMatic.g:2483:1: ( () )
            // InternalSlideOMatic.g:2484:2: ()
            {
             before(grammarAccess.getDateAccess().getCompileDateAction_1_1_0()); 
            // InternalSlideOMatic.g:2485:2: ()
            // InternalSlideOMatic.g:2485:3: 
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
    // InternalSlideOMatic.g:2493:1: rule__Date__Group_1_1__1 : rule__Date__Group_1_1__1__Impl ;
    public final void rule__Date__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2497:1: ( rule__Date__Group_1_1__1__Impl )
            // InternalSlideOMatic.g:2498:2: rule__Date__Group_1_1__1__Impl
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
    // InternalSlideOMatic.g:2504:1: rule__Date__Group_1_1__1__Impl : ( '*' ) ;
    public final void rule__Date__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2508:1: ( ( '*' ) )
            // InternalSlideOMatic.g:2509:1: ( '*' )
            {
            // InternalSlideOMatic.g:2509:1: ( '*' )
            // InternalSlideOMatic.g:2510:2: '*'
            {
             before(grammarAccess.getDateAccess().getAsteriskKeyword_1_1_1()); 
            match(input,74,FOLLOW_2); 
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
    // InternalSlideOMatic.g:2520:1: rule__Slide__Group__0 : rule__Slide__Group__0__Impl rule__Slide__Group__1 ;
    public final void rule__Slide__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2524:1: ( rule__Slide__Group__0__Impl rule__Slide__Group__1 )
            // InternalSlideOMatic.g:2525:2: rule__Slide__Group__0__Impl rule__Slide__Group__1
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
    // InternalSlideOMatic.g:2532:1: rule__Slide__Group__0__Impl : ( 'slide' ) ;
    public final void rule__Slide__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2536:1: ( ( 'slide' ) )
            // InternalSlideOMatic.g:2537:1: ( 'slide' )
            {
            // InternalSlideOMatic.g:2537:1: ( 'slide' )
            // InternalSlideOMatic.g:2538:2: 'slide'
            {
             before(grammarAccess.getSlideAccess().getSlideKeyword_0()); 
            match(input,75,FOLLOW_2); 
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
    // InternalSlideOMatic.g:2547:1: rule__Slide__Group__1 : rule__Slide__Group__1__Impl rule__Slide__Group__2 ;
    public final void rule__Slide__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2551:1: ( rule__Slide__Group__1__Impl rule__Slide__Group__2 )
            // InternalSlideOMatic.g:2552:2: rule__Slide__Group__1__Impl rule__Slide__Group__2
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
    // InternalSlideOMatic.g:2559:1: rule__Slide__Group__1__Impl : ( ( rule__Slide__Alternatives_1 )? ) ;
    public final void rule__Slide__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2563:1: ( ( ( rule__Slide__Alternatives_1 )? ) )
            // InternalSlideOMatic.g:2564:1: ( ( rule__Slide__Alternatives_1 )? )
            {
            // InternalSlideOMatic.g:2564:1: ( ( rule__Slide__Alternatives_1 )? )
            // InternalSlideOMatic.g:2565:2: ( rule__Slide__Alternatives_1 )?
            {
             before(grammarAccess.getSlideAccess().getAlternatives_1()); 
            // InternalSlideOMatic.g:2566:2: ( rule__Slide__Alternatives_1 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_STRING||LA29_0==74||(LA29_0>=76 && LA29_0<=77)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalSlideOMatic.g:2566:3: rule__Slide__Alternatives_1
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
    // InternalSlideOMatic.g:2574:1: rule__Slide__Group__2 : rule__Slide__Group__2__Impl rule__Slide__Group__3 ;
    public final void rule__Slide__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2578:1: ( rule__Slide__Group__2__Impl rule__Slide__Group__3 )
            // InternalSlideOMatic.g:2579:2: rule__Slide__Group__2__Impl rule__Slide__Group__3
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
    // InternalSlideOMatic.g:2586:1: rule__Slide__Group__2__Impl : ( '{' ) ;
    public final void rule__Slide__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2590:1: ( ( '{' ) )
            // InternalSlideOMatic.g:2591:1: ( '{' )
            {
            // InternalSlideOMatic.g:2591:1: ( '{' )
            // InternalSlideOMatic.g:2592:2: '{'
            {
             before(grammarAccess.getSlideAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,65,FOLLOW_2); 
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
    // InternalSlideOMatic.g:2601:1: rule__Slide__Group__3 : rule__Slide__Group__3__Impl rule__Slide__Group__4 ;
    public final void rule__Slide__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2605:1: ( rule__Slide__Group__3__Impl rule__Slide__Group__4 )
            // InternalSlideOMatic.g:2606:2: rule__Slide__Group__3__Impl rule__Slide__Group__4
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
    // InternalSlideOMatic.g:2613:1: rule__Slide__Group__3__Impl : ( ( ( rule__Slide__ContentsAssignment_3 ) ) ( ( rule__Slide__ContentsAssignment_3 )* ) ) ;
    public final void rule__Slide__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2617:1: ( ( ( ( rule__Slide__ContentsAssignment_3 ) ) ( ( rule__Slide__ContentsAssignment_3 )* ) ) )
            // InternalSlideOMatic.g:2618:1: ( ( ( rule__Slide__ContentsAssignment_3 ) ) ( ( rule__Slide__ContentsAssignment_3 )* ) )
            {
            // InternalSlideOMatic.g:2618:1: ( ( ( rule__Slide__ContentsAssignment_3 ) ) ( ( rule__Slide__ContentsAssignment_3 )* ) )
            // InternalSlideOMatic.g:2619:2: ( ( rule__Slide__ContentsAssignment_3 ) ) ( ( rule__Slide__ContentsAssignment_3 )* )
            {
            // InternalSlideOMatic.g:2619:2: ( ( rule__Slide__ContentsAssignment_3 ) )
            // InternalSlideOMatic.g:2620:3: ( rule__Slide__ContentsAssignment_3 )
            {
             before(grammarAccess.getSlideAccess().getContentsAssignment_3()); 
            // InternalSlideOMatic.g:2621:3: ( rule__Slide__ContentsAssignment_3 )
            // InternalSlideOMatic.g:2621:4: rule__Slide__ContentsAssignment_3
            {
            pushFollow(FOLLOW_17);
            rule__Slide__ContentsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSlideAccess().getContentsAssignment_3()); 

            }

            // InternalSlideOMatic.g:2624:2: ( ( rule__Slide__ContentsAssignment_3 )* )
            // InternalSlideOMatic.g:2625:3: ( rule__Slide__ContentsAssignment_3 )*
            {
             before(grammarAccess.getSlideAccess().getContentsAssignment_3()); 
            // InternalSlideOMatic.g:2626:3: ( rule__Slide__ContentsAssignment_3 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_STRING||(LA30_0>=78 && LA30_0<=86)||LA30_0==91||LA30_0==95||LA30_0==98||LA30_0==100||LA30_0==103||LA30_0==107) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalSlideOMatic.g:2626:4: rule__Slide__ContentsAssignment_3
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
    // InternalSlideOMatic.g:2635:1: rule__Slide__Group__4 : rule__Slide__Group__4__Impl ;
    public final void rule__Slide__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2639:1: ( rule__Slide__Group__4__Impl )
            // InternalSlideOMatic.g:2640:2: rule__Slide__Group__4__Impl
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
    // InternalSlideOMatic.g:2646:1: rule__Slide__Group__4__Impl : ( '}' ) ;
    public final void rule__Slide__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2650:1: ( ( '}' ) )
            // InternalSlideOMatic.g:2651:1: ( '}' )
            {
            // InternalSlideOMatic.g:2651:1: ( '}' )
            // InternalSlideOMatic.g:2652:2: '}'
            {
             before(grammarAccess.getSlideAccess().getRightCurlyBracketKeyword_4()); 
            match(input,66,FOLLOW_2); 
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
    // InternalSlideOMatic.g:2662:1: rule__Slide__Group_1_0__0 : rule__Slide__Group_1_0__0__Impl rule__Slide__Group_1_0__1 ;
    public final void rule__Slide__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2666:1: ( rule__Slide__Group_1_0__0__Impl rule__Slide__Group_1_0__1 )
            // InternalSlideOMatic.g:2667:2: rule__Slide__Group_1_0__0__Impl rule__Slide__Group_1_0__1
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
    // InternalSlideOMatic.g:2674:1: rule__Slide__Group_1_0__0__Impl : ( ( rule__Slide__SecAssignment_1_0_0 ) ) ;
    public final void rule__Slide__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2678:1: ( ( ( rule__Slide__SecAssignment_1_0_0 ) ) )
            // InternalSlideOMatic.g:2679:1: ( ( rule__Slide__SecAssignment_1_0_0 ) )
            {
            // InternalSlideOMatic.g:2679:1: ( ( rule__Slide__SecAssignment_1_0_0 ) )
            // InternalSlideOMatic.g:2680:2: ( rule__Slide__SecAssignment_1_0_0 )
            {
             before(grammarAccess.getSlideAccess().getSecAssignment_1_0_0()); 
            // InternalSlideOMatic.g:2681:2: ( rule__Slide__SecAssignment_1_0_0 )
            // InternalSlideOMatic.g:2681:3: rule__Slide__SecAssignment_1_0_0
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
    // InternalSlideOMatic.g:2689:1: rule__Slide__Group_1_0__1 : rule__Slide__Group_1_0__1__Impl ;
    public final void rule__Slide__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2693:1: ( rule__Slide__Group_1_0__1__Impl )
            // InternalSlideOMatic.g:2694:2: rule__Slide__Group_1_0__1__Impl
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
    // InternalSlideOMatic.g:2700:1: rule__Slide__Group_1_0__1__Impl : ( ( rule__Slide__NameAssignment_1_0_1 ) ) ;
    public final void rule__Slide__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2704:1: ( ( ( rule__Slide__NameAssignment_1_0_1 ) ) )
            // InternalSlideOMatic.g:2705:1: ( ( rule__Slide__NameAssignment_1_0_1 ) )
            {
            // InternalSlideOMatic.g:2705:1: ( ( rule__Slide__NameAssignment_1_0_1 ) )
            // InternalSlideOMatic.g:2706:2: ( rule__Slide__NameAssignment_1_0_1 )
            {
             before(grammarAccess.getSlideAccess().getNameAssignment_1_0_1()); 
            // InternalSlideOMatic.g:2707:2: ( rule__Slide__NameAssignment_1_0_1 )
            // InternalSlideOMatic.g:2707:3: rule__Slide__NameAssignment_1_0_1
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
    // InternalSlideOMatic.g:2716:1: rule__Section__Group_0__0 : rule__Section__Group_0__0__Impl rule__Section__Group_0__1 ;
    public final void rule__Section__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2720:1: ( rule__Section__Group_0__0__Impl rule__Section__Group_0__1 )
            // InternalSlideOMatic.g:2721:2: rule__Section__Group_0__0__Impl rule__Section__Group_0__1
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
    // InternalSlideOMatic.g:2728:1: rule__Section__Group_0__0__Impl : ( () ) ;
    public final void rule__Section__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2732:1: ( ( () ) )
            // InternalSlideOMatic.g:2733:1: ( () )
            {
            // InternalSlideOMatic.g:2733:1: ( () )
            // InternalSlideOMatic.g:2734:2: ()
            {
             before(grammarAccess.getSectionAccess().getSecAction_0_0()); 
            // InternalSlideOMatic.g:2735:2: ()
            // InternalSlideOMatic.g:2735:3: 
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
    // InternalSlideOMatic.g:2743:1: rule__Section__Group_0__1 : rule__Section__Group_0__1__Impl ;
    public final void rule__Section__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2747:1: ( rule__Section__Group_0__1__Impl )
            // InternalSlideOMatic.g:2748:2: rule__Section__Group_0__1__Impl
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
    // InternalSlideOMatic.g:2754:1: rule__Section__Group_0__1__Impl : ( '*' ) ;
    public final void rule__Section__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2758:1: ( ( '*' ) )
            // InternalSlideOMatic.g:2759:1: ( '*' )
            {
            // InternalSlideOMatic.g:2759:1: ( '*' )
            // InternalSlideOMatic.g:2760:2: '*'
            {
             before(grammarAccess.getSectionAccess().getAsteriskKeyword_0_1()); 
            match(input,74,FOLLOW_2); 
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
    // InternalSlideOMatic.g:2770:1: rule__Section__Group_1__0 : rule__Section__Group_1__0__Impl rule__Section__Group_1__1 ;
    public final void rule__Section__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2774:1: ( rule__Section__Group_1__0__Impl rule__Section__Group_1__1 )
            // InternalSlideOMatic.g:2775:2: rule__Section__Group_1__0__Impl rule__Section__Group_1__1
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
    // InternalSlideOMatic.g:2782:1: rule__Section__Group_1__0__Impl : ( () ) ;
    public final void rule__Section__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2786:1: ( ( () ) )
            // InternalSlideOMatic.g:2787:1: ( () )
            {
            // InternalSlideOMatic.g:2787:1: ( () )
            // InternalSlideOMatic.g:2788:2: ()
            {
             before(grammarAccess.getSectionAccess().getSubSecAction_1_0()); 
            // InternalSlideOMatic.g:2789:2: ()
            // InternalSlideOMatic.g:2789:3: 
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
    // InternalSlideOMatic.g:2797:1: rule__Section__Group_1__1 : rule__Section__Group_1__1__Impl ;
    public final void rule__Section__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2801:1: ( rule__Section__Group_1__1__Impl )
            // InternalSlideOMatic.g:2802:2: rule__Section__Group_1__1__Impl
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
    // InternalSlideOMatic.g:2808:1: rule__Section__Group_1__1__Impl : ( '**' ) ;
    public final void rule__Section__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2812:1: ( ( '**' ) )
            // InternalSlideOMatic.g:2813:1: ( '**' )
            {
            // InternalSlideOMatic.g:2813:1: ( '**' )
            // InternalSlideOMatic.g:2814:2: '**'
            {
             before(grammarAccess.getSectionAccess().getAsteriskAsteriskKeyword_1_1()); 
            match(input,76,FOLLOW_2); 
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
    // InternalSlideOMatic.g:2824:1: rule__Section__Group_2__0 : rule__Section__Group_2__0__Impl rule__Section__Group_2__1 ;
    public final void rule__Section__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2828:1: ( rule__Section__Group_2__0__Impl rule__Section__Group_2__1 )
            // InternalSlideOMatic.g:2829:2: rule__Section__Group_2__0__Impl rule__Section__Group_2__1
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
    // InternalSlideOMatic.g:2836:1: rule__Section__Group_2__0__Impl : ( () ) ;
    public final void rule__Section__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2840:1: ( ( () ) )
            // InternalSlideOMatic.g:2841:1: ( () )
            {
            // InternalSlideOMatic.g:2841:1: ( () )
            // InternalSlideOMatic.g:2842:2: ()
            {
             before(grammarAccess.getSectionAccess().getSubSubSecAction_2_0()); 
            // InternalSlideOMatic.g:2843:2: ()
            // InternalSlideOMatic.g:2843:3: 
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
    // InternalSlideOMatic.g:2851:1: rule__Section__Group_2__1 : rule__Section__Group_2__1__Impl ;
    public final void rule__Section__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2855:1: ( rule__Section__Group_2__1__Impl )
            // InternalSlideOMatic.g:2856:2: rule__Section__Group_2__1__Impl
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
    // InternalSlideOMatic.g:2862:1: rule__Section__Group_2__1__Impl : ( '***' ) ;
    public final void rule__Section__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2866:1: ( ( '***' ) )
            // InternalSlideOMatic.g:2867:1: ( '***' )
            {
            // InternalSlideOMatic.g:2867:1: ( '***' )
            // InternalSlideOMatic.g:2868:2: '***'
            {
             before(grammarAccess.getSectionAccess().getAsteriskAsteriskAsteriskKeyword_2_1()); 
            match(input,77,FOLLOW_2); 
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
    // InternalSlideOMatic.g:2878:1: rule__Content__Group__0 : rule__Content__Group__0__Impl rule__Content__Group__1 ;
    public final void rule__Content__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2882:1: ( rule__Content__Group__0__Impl rule__Content__Group__1 )
            // InternalSlideOMatic.g:2883:2: rule__Content__Group__0__Impl rule__Content__Group__1
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
    // InternalSlideOMatic.g:2890:1: rule__Content__Group__0__Impl : ( ( rule__Content__Alternatives_0 ) ) ;
    public final void rule__Content__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2894:1: ( ( ( rule__Content__Alternatives_0 ) ) )
            // InternalSlideOMatic.g:2895:1: ( ( rule__Content__Alternatives_0 ) )
            {
            // InternalSlideOMatic.g:2895:1: ( ( rule__Content__Alternatives_0 ) )
            // InternalSlideOMatic.g:2896:2: ( rule__Content__Alternatives_0 )
            {
             before(grammarAccess.getContentAccess().getAlternatives_0()); 
            // InternalSlideOMatic.g:2897:2: ( rule__Content__Alternatives_0 )
            // InternalSlideOMatic.g:2897:3: rule__Content__Alternatives_0
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
    // InternalSlideOMatic.g:2905:1: rule__Content__Group__1 : rule__Content__Group__1__Impl ;
    public final void rule__Content__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2909:1: ( rule__Content__Group__1__Impl )
            // InternalSlideOMatic.g:2910:2: rule__Content__Group__1__Impl
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
    // InternalSlideOMatic.g:2916:1: rule__Content__Group__1__Impl : ( ( rule__Content__ClickAssignment_1 )? ) ;
    public final void rule__Content__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2920:1: ( ( ( rule__Content__ClickAssignment_1 )? ) )
            // InternalSlideOMatic.g:2921:1: ( ( rule__Content__ClickAssignment_1 )? )
            {
            // InternalSlideOMatic.g:2921:1: ( ( rule__Content__ClickAssignment_1 )? )
            // InternalSlideOMatic.g:2922:2: ( rule__Content__ClickAssignment_1 )?
            {
             before(grammarAccess.getContentAccess().getClickAssignment_1()); 
            // InternalSlideOMatic.g:2923:2: ( rule__Content__ClickAssignment_1 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==11) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalSlideOMatic.g:2923:3: rule__Content__ClickAssignment_1
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
    // InternalSlideOMatic.g:2932:1: rule__ToC__Group_0__0 : rule__ToC__Group_0__0__Impl rule__ToC__Group_0__1 ;
    public final void rule__ToC__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2936:1: ( rule__ToC__Group_0__0__Impl rule__ToC__Group_0__1 )
            // InternalSlideOMatic.g:2937:2: rule__ToC__Group_0__0__Impl rule__ToC__Group_0__1
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
    // InternalSlideOMatic.g:2944:1: rule__ToC__Group_0__0__Impl : ( () ) ;
    public final void rule__ToC__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2948:1: ( ( () ) )
            // InternalSlideOMatic.g:2949:1: ( () )
            {
            // InternalSlideOMatic.g:2949:1: ( () )
            // InternalSlideOMatic.g:2950:2: ()
            {
             before(grammarAccess.getToCAccess().getToCAction_0_0()); 
            // InternalSlideOMatic.g:2951:2: ()
            // InternalSlideOMatic.g:2951:3: 
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
    // InternalSlideOMatic.g:2959:1: rule__ToC__Group_0__1 : rule__ToC__Group_0__1__Impl ;
    public final void rule__ToC__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2963:1: ( rule__ToC__Group_0__1__Impl )
            // InternalSlideOMatic.g:2964:2: rule__ToC__Group_0__1__Impl
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
    // InternalSlideOMatic.g:2970:1: rule__ToC__Group_0__1__Impl : ( 'ToC' ) ;
    public final void rule__ToC__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2974:1: ( ( 'ToC' ) )
            // InternalSlideOMatic.g:2975:1: ( 'ToC' )
            {
            // InternalSlideOMatic.g:2975:1: ( 'ToC' )
            // InternalSlideOMatic.g:2976:2: 'ToC'
            {
             before(grammarAccess.getToCAccess().getToCKeyword_0_1()); 
            match(input,78,FOLLOW_2); 
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
    // InternalSlideOMatic.g:2986:1: rule__ToC__Group_1__0 : rule__ToC__Group_1__0__Impl rule__ToC__Group_1__1 ;
    public final void rule__ToC__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2990:1: ( rule__ToC__Group_1__0__Impl rule__ToC__Group_1__1 )
            // InternalSlideOMatic.g:2991:2: rule__ToC__Group_1__0__Impl rule__ToC__Group_1__1
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
    // InternalSlideOMatic.g:2998:1: rule__ToC__Group_1__0__Impl : ( () ) ;
    public final void rule__ToC__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3002:1: ( ( () ) )
            // InternalSlideOMatic.g:3003:1: ( () )
            {
            // InternalSlideOMatic.g:3003:1: ( () )
            // InternalSlideOMatic.g:3004:2: ()
            {
             before(grammarAccess.getToCAccess().getCurrentSecToCAction_1_0()); 
            // InternalSlideOMatic.g:3005:2: ()
            // InternalSlideOMatic.g:3005:3: 
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
    // InternalSlideOMatic.g:3013:1: rule__ToC__Group_1__1 : rule__ToC__Group_1__1__Impl rule__ToC__Group_1__2 ;
    public final void rule__ToC__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3017:1: ( rule__ToC__Group_1__1__Impl rule__ToC__Group_1__2 )
            // InternalSlideOMatic.g:3018:2: rule__ToC__Group_1__1__Impl rule__ToC__Group_1__2
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
    // InternalSlideOMatic.g:3025:1: rule__ToC__Group_1__1__Impl : ( 'ToC' ) ;
    public final void rule__ToC__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3029:1: ( ( 'ToC' ) )
            // InternalSlideOMatic.g:3030:1: ( 'ToC' )
            {
            // InternalSlideOMatic.g:3030:1: ( 'ToC' )
            // InternalSlideOMatic.g:3031:2: 'ToC'
            {
             before(grammarAccess.getToCAccess().getToCKeyword_1_1()); 
            match(input,78,FOLLOW_2); 
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
    // InternalSlideOMatic.g:3040:1: rule__ToC__Group_1__2 : rule__ToC__Group_1__2__Impl ;
    public final void rule__ToC__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3044:1: ( rule__ToC__Group_1__2__Impl )
            // InternalSlideOMatic.g:3045:2: rule__ToC__Group_1__2__Impl
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
    // InternalSlideOMatic.g:3051:1: rule__ToC__Group_1__2__Impl : ( '*' ) ;
    public final void rule__ToC__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3055:1: ( ( '*' ) )
            // InternalSlideOMatic.g:3056:1: ( '*' )
            {
            // InternalSlideOMatic.g:3056:1: ( '*' )
            // InternalSlideOMatic.g:3057:2: '*'
            {
             before(grammarAccess.getToCAccess().getAsteriskKeyword_1_2()); 
            match(input,74,FOLLOW_2); 
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


    // $ANTLR start "rule__Text__Group__0"
    // InternalSlideOMatic.g:3067:1: rule__Text__Group__0 : rule__Text__Group__0__Impl rule__Text__Group__1 ;
    public final void rule__Text__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3071:1: ( rule__Text__Group__0__Impl rule__Text__Group__1 )
            // InternalSlideOMatic.g:3072:2: rule__Text__Group__0__Impl rule__Text__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalSlideOMatic.g:3079:1: rule__Text__Group__0__Impl : ( ( rule__Text__TypesAssignment_0 )* ) ;
    public final void rule__Text__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3083:1: ( ( ( rule__Text__TypesAssignment_0 )* ) )
            // InternalSlideOMatic.g:3084:1: ( ( rule__Text__TypesAssignment_0 )* )
            {
            // InternalSlideOMatic.g:3084:1: ( ( rule__Text__TypesAssignment_0 )* )
            // InternalSlideOMatic.g:3085:2: ( rule__Text__TypesAssignment_0 )*
            {
             before(grammarAccess.getTextAccess().getTypesAssignment_0()); 
            // InternalSlideOMatic.g:3086:2: ( rule__Text__TypesAssignment_0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0>=79 && LA32_0<=83)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalSlideOMatic.g:3086:3: rule__Text__TypesAssignment_0
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__Text__TypesAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

             after(grammarAccess.getTextAccess().getTypesAssignment_0()); 

            }


            }

        }
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
    // InternalSlideOMatic.g:3094:1: rule__Text__Group__1 : rule__Text__Group__1__Impl ;
    public final void rule__Text__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3098:1: ( rule__Text__Group__1__Impl )
            // InternalSlideOMatic.g:3099:2: rule__Text__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Text__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalSlideOMatic.g:3105:1: rule__Text__Group__1__Impl : ( ( rule__Text__TextAssignment_1 ) ) ;
    public final void rule__Text__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3109:1: ( ( ( rule__Text__TextAssignment_1 ) ) )
            // InternalSlideOMatic.g:3110:1: ( ( rule__Text__TextAssignment_1 ) )
            {
            // InternalSlideOMatic.g:3110:1: ( ( rule__Text__TextAssignment_1 ) )
            // InternalSlideOMatic.g:3111:2: ( rule__Text__TextAssignment_1 )
            {
             before(grammarAccess.getTextAccess().getTextAssignment_1()); 
            // InternalSlideOMatic.g:3112:2: ( rule__Text__TextAssignment_1 )
            // InternalSlideOMatic.g:3112:3: rule__Text__TextAssignment_1
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


    // $ANTLR start "rule__TextType__Group_0__0"
    // InternalSlideOMatic.g:3121:1: rule__TextType__Group_0__0 : rule__TextType__Group_0__0__Impl rule__TextType__Group_0__1 ;
    public final void rule__TextType__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3125:1: ( rule__TextType__Group_0__0__Impl rule__TextType__Group_0__1 )
            // InternalSlideOMatic.g:3126:2: rule__TextType__Group_0__0__Impl rule__TextType__Group_0__1
            {
            pushFollow(FOLLOW_25);
            rule__TextType__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TextType__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextType__Group_0__0"


    // $ANTLR start "rule__TextType__Group_0__0__Impl"
    // InternalSlideOMatic.g:3133:1: rule__TextType__Group_0__0__Impl : ( () ) ;
    public final void rule__TextType__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3137:1: ( ( () ) )
            // InternalSlideOMatic.g:3138:1: ( () )
            {
            // InternalSlideOMatic.g:3138:1: ( () )
            // InternalSlideOMatic.g:3139:2: ()
            {
             before(grammarAccess.getTextTypeAccess().getBoldAction_0_0()); 
            // InternalSlideOMatic.g:3140:2: ()
            // InternalSlideOMatic.g:3140:3: 
            {
            }

             after(grammarAccess.getTextTypeAccess().getBoldAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextType__Group_0__0__Impl"


    // $ANTLR start "rule__TextType__Group_0__1"
    // InternalSlideOMatic.g:3148:1: rule__TextType__Group_0__1 : rule__TextType__Group_0__1__Impl ;
    public final void rule__TextType__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3152:1: ( rule__TextType__Group_0__1__Impl )
            // InternalSlideOMatic.g:3153:2: rule__TextType__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TextType__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextType__Group_0__1"


    // $ANTLR start "rule__TextType__Group_0__1__Impl"
    // InternalSlideOMatic.g:3159:1: rule__TextType__Group_0__1__Impl : ( 'b' ) ;
    public final void rule__TextType__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3163:1: ( ( 'b' ) )
            // InternalSlideOMatic.g:3164:1: ( 'b' )
            {
            // InternalSlideOMatic.g:3164:1: ( 'b' )
            // InternalSlideOMatic.g:3165:2: 'b'
            {
             before(grammarAccess.getTextTypeAccess().getBKeyword_0_1()); 
            match(input,79,FOLLOW_2); 
             after(grammarAccess.getTextTypeAccess().getBKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextType__Group_0__1__Impl"


    // $ANTLR start "rule__TextType__Group_1__0"
    // InternalSlideOMatic.g:3175:1: rule__TextType__Group_1__0 : rule__TextType__Group_1__0__Impl rule__TextType__Group_1__1 ;
    public final void rule__TextType__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3179:1: ( rule__TextType__Group_1__0__Impl rule__TextType__Group_1__1 )
            // InternalSlideOMatic.g:3180:2: rule__TextType__Group_1__0__Impl rule__TextType__Group_1__1
            {
            pushFollow(FOLLOW_26);
            rule__TextType__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TextType__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextType__Group_1__0"


    // $ANTLR start "rule__TextType__Group_1__0__Impl"
    // InternalSlideOMatic.g:3187:1: rule__TextType__Group_1__0__Impl : ( () ) ;
    public final void rule__TextType__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3191:1: ( ( () ) )
            // InternalSlideOMatic.g:3192:1: ( () )
            {
            // InternalSlideOMatic.g:3192:1: ( () )
            // InternalSlideOMatic.g:3193:2: ()
            {
             before(grammarAccess.getTextTypeAccess().getItalicAction_1_0()); 
            // InternalSlideOMatic.g:3194:2: ()
            // InternalSlideOMatic.g:3194:3: 
            {
            }

             after(grammarAccess.getTextTypeAccess().getItalicAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextType__Group_1__0__Impl"


    // $ANTLR start "rule__TextType__Group_1__1"
    // InternalSlideOMatic.g:3202:1: rule__TextType__Group_1__1 : rule__TextType__Group_1__1__Impl ;
    public final void rule__TextType__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3206:1: ( rule__TextType__Group_1__1__Impl )
            // InternalSlideOMatic.g:3207:2: rule__TextType__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TextType__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextType__Group_1__1"


    // $ANTLR start "rule__TextType__Group_1__1__Impl"
    // InternalSlideOMatic.g:3213:1: rule__TextType__Group_1__1__Impl : ( 'i' ) ;
    public final void rule__TextType__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3217:1: ( ( 'i' ) )
            // InternalSlideOMatic.g:3218:1: ( 'i' )
            {
            // InternalSlideOMatic.g:3218:1: ( 'i' )
            // InternalSlideOMatic.g:3219:2: 'i'
            {
             before(grammarAccess.getTextTypeAccess().getIKeyword_1_1()); 
            match(input,80,FOLLOW_2); 
             after(grammarAccess.getTextTypeAccess().getIKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextType__Group_1__1__Impl"


    // $ANTLR start "rule__TextType__Group_2__0"
    // InternalSlideOMatic.g:3229:1: rule__TextType__Group_2__0 : rule__TextType__Group_2__0__Impl rule__TextType__Group_2__1 ;
    public final void rule__TextType__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3233:1: ( rule__TextType__Group_2__0__Impl rule__TextType__Group_2__1 )
            // InternalSlideOMatic.g:3234:2: rule__TextType__Group_2__0__Impl rule__TextType__Group_2__1
            {
            pushFollow(FOLLOW_27);
            rule__TextType__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TextType__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextType__Group_2__0"


    // $ANTLR start "rule__TextType__Group_2__0__Impl"
    // InternalSlideOMatic.g:3241:1: rule__TextType__Group_2__0__Impl : ( () ) ;
    public final void rule__TextType__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3245:1: ( ( () ) )
            // InternalSlideOMatic.g:3246:1: ( () )
            {
            // InternalSlideOMatic.g:3246:1: ( () )
            // InternalSlideOMatic.g:3247:2: ()
            {
             before(grammarAccess.getTextTypeAccess().getUnderlineAction_2_0()); 
            // InternalSlideOMatic.g:3248:2: ()
            // InternalSlideOMatic.g:3248:3: 
            {
            }

             after(grammarAccess.getTextTypeAccess().getUnderlineAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextType__Group_2__0__Impl"


    // $ANTLR start "rule__TextType__Group_2__1"
    // InternalSlideOMatic.g:3256:1: rule__TextType__Group_2__1 : rule__TextType__Group_2__1__Impl ;
    public final void rule__TextType__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3260:1: ( rule__TextType__Group_2__1__Impl )
            // InternalSlideOMatic.g:3261:2: rule__TextType__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TextType__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextType__Group_2__1"


    // $ANTLR start "rule__TextType__Group_2__1__Impl"
    // InternalSlideOMatic.g:3267:1: rule__TextType__Group_2__1__Impl : ( 'u' ) ;
    public final void rule__TextType__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3271:1: ( ( 'u' ) )
            // InternalSlideOMatic.g:3272:1: ( 'u' )
            {
            // InternalSlideOMatic.g:3272:1: ( 'u' )
            // InternalSlideOMatic.g:3273:2: 'u'
            {
             before(grammarAccess.getTextTypeAccess().getUKeyword_2_1()); 
            match(input,81,FOLLOW_2); 
             after(grammarAccess.getTextTypeAccess().getUKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextType__Group_2__1__Impl"


    // $ANTLR start "rule__TextType__Group_3__0"
    // InternalSlideOMatic.g:3283:1: rule__TextType__Group_3__0 : rule__TextType__Group_3__0__Impl rule__TextType__Group_3__1 ;
    public final void rule__TextType__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3287:1: ( rule__TextType__Group_3__0__Impl rule__TextType__Group_3__1 )
            // InternalSlideOMatic.g:3288:2: rule__TextType__Group_3__0__Impl rule__TextType__Group_3__1
            {
            pushFollow(FOLLOW_28);
            rule__TextType__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TextType__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextType__Group_3__0"


    // $ANTLR start "rule__TextType__Group_3__0__Impl"
    // InternalSlideOMatic.g:3295:1: rule__TextType__Group_3__0__Impl : ( () ) ;
    public final void rule__TextType__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3299:1: ( ( () ) )
            // InternalSlideOMatic.g:3300:1: ( () )
            {
            // InternalSlideOMatic.g:3300:1: ( () )
            // InternalSlideOMatic.g:3301:2: ()
            {
             before(grammarAccess.getTextTypeAccess().getFootNoteAction_3_0()); 
            // InternalSlideOMatic.g:3302:2: ()
            // InternalSlideOMatic.g:3302:3: 
            {
            }

             after(grammarAccess.getTextTypeAccess().getFootNoteAction_3_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextType__Group_3__0__Impl"


    // $ANTLR start "rule__TextType__Group_3__1"
    // InternalSlideOMatic.g:3310:1: rule__TextType__Group_3__1 : rule__TextType__Group_3__1__Impl ;
    public final void rule__TextType__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3314:1: ( rule__TextType__Group_3__1__Impl )
            // InternalSlideOMatic.g:3315:2: rule__TextType__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TextType__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextType__Group_3__1"


    // $ANTLR start "rule__TextType__Group_3__1__Impl"
    // InternalSlideOMatic.g:3321:1: rule__TextType__Group_3__1__Impl : ( 'fnote' ) ;
    public final void rule__TextType__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3325:1: ( ( 'fnote' ) )
            // InternalSlideOMatic.g:3326:1: ( 'fnote' )
            {
            // InternalSlideOMatic.g:3326:1: ( 'fnote' )
            // InternalSlideOMatic.g:3327:2: 'fnote'
            {
             before(grammarAccess.getTextTypeAccess().getFnoteKeyword_3_1()); 
            match(input,82,FOLLOW_2); 
             after(grammarAccess.getTextTypeAccess().getFnoteKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextType__Group_3__1__Impl"


    // $ANTLR start "rule__TextType__Group_4__0"
    // InternalSlideOMatic.g:3337:1: rule__TextType__Group_4__0 : rule__TextType__Group_4__0__Impl rule__TextType__Group_4__1 ;
    public final void rule__TextType__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3341:1: ( rule__TextType__Group_4__0__Impl rule__TextType__Group_4__1 )
            // InternalSlideOMatic.g:3342:2: rule__TextType__Group_4__0__Impl rule__TextType__Group_4__1
            {
            pushFollow(FOLLOW_29);
            rule__TextType__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TextType__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextType__Group_4__0"


    // $ANTLR start "rule__TextType__Group_4__0__Impl"
    // InternalSlideOMatic.g:3349:1: rule__TextType__Group_4__0__Impl : ( () ) ;
    public final void rule__TextType__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3353:1: ( ( () ) )
            // InternalSlideOMatic.g:3354:1: ( () )
            {
            // InternalSlideOMatic.g:3354:1: ( () )
            // InternalSlideOMatic.g:3355:2: ()
            {
             before(grammarAccess.getTextTypeAccess().getURLAction_4_0()); 
            // InternalSlideOMatic.g:3356:2: ()
            // InternalSlideOMatic.g:3356:3: 
            {
            }

             after(grammarAccess.getTextTypeAccess().getURLAction_4_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextType__Group_4__0__Impl"


    // $ANTLR start "rule__TextType__Group_4__1"
    // InternalSlideOMatic.g:3364:1: rule__TextType__Group_4__1 : rule__TextType__Group_4__1__Impl ;
    public final void rule__TextType__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3368:1: ( rule__TextType__Group_4__1__Impl )
            // InternalSlideOMatic.g:3369:2: rule__TextType__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TextType__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextType__Group_4__1"


    // $ANTLR start "rule__TextType__Group_4__1__Impl"
    // InternalSlideOMatic.g:3375:1: rule__TextType__Group_4__1__Impl : ( 'url' ) ;
    public final void rule__TextType__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3379:1: ( ( 'url' ) )
            // InternalSlideOMatic.g:3380:1: ( 'url' )
            {
            // InternalSlideOMatic.g:3380:1: ( 'url' )
            // InternalSlideOMatic.g:3381:2: 'url'
            {
             before(grammarAccess.getTextTypeAccess().getUrlKeyword_4_1()); 
            match(input,83,FOLLOW_2); 
             after(grammarAccess.getTextTypeAccess().getUrlKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextType__Group_4__1__Impl"


    // $ANTLR start "rule__Block__Group__0"
    // InternalSlideOMatic.g:3391:1: rule__Block__Group__0 : rule__Block__Group__0__Impl rule__Block__Group__1 ;
    public final void rule__Block__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3395:1: ( rule__Block__Group__0__Impl rule__Block__Group__1 )
            // InternalSlideOMatic.g:3396:2: rule__Block__Group__0__Impl rule__Block__Group__1
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
    // InternalSlideOMatic.g:3403:1: rule__Block__Group__0__Impl : ( 'block' ) ;
    public final void rule__Block__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3407:1: ( ( 'block' ) )
            // InternalSlideOMatic.g:3408:1: ( 'block' )
            {
            // InternalSlideOMatic.g:3408:1: ( 'block' )
            // InternalSlideOMatic.g:3409:2: 'block'
            {
             before(grammarAccess.getBlockAccess().getBlockKeyword_0()); 
            match(input,84,FOLLOW_2); 
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
    // InternalSlideOMatic.g:3418:1: rule__Block__Group__1 : rule__Block__Group__1__Impl rule__Block__Group__2 ;
    public final void rule__Block__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3422:1: ( rule__Block__Group__1__Impl rule__Block__Group__2 )
            // InternalSlideOMatic.g:3423:2: rule__Block__Group__1__Impl rule__Block__Group__2
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
    // InternalSlideOMatic.g:3430:1: rule__Block__Group__1__Impl : ( ( rule__Block__NameAssignment_1 )? ) ;
    public final void rule__Block__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3434:1: ( ( ( rule__Block__NameAssignment_1 )? ) )
            // InternalSlideOMatic.g:3435:1: ( ( rule__Block__NameAssignment_1 )? )
            {
            // InternalSlideOMatic.g:3435:1: ( ( rule__Block__NameAssignment_1 )? )
            // InternalSlideOMatic.g:3436:2: ( rule__Block__NameAssignment_1 )?
            {
             before(grammarAccess.getBlockAccess().getNameAssignment_1()); 
            // InternalSlideOMatic.g:3437:2: ( rule__Block__NameAssignment_1 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_STRING) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalSlideOMatic.g:3437:3: rule__Block__NameAssignment_1
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
    // InternalSlideOMatic.g:3445:1: rule__Block__Group__2 : rule__Block__Group__2__Impl rule__Block__Group__3 ;
    public final void rule__Block__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3449:1: ( rule__Block__Group__2__Impl rule__Block__Group__3 )
            // InternalSlideOMatic.g:3450:2: rule__Block__Group__2__Impl rule__Block__Group__3
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
    // InternalSlideOMatic.g:3457:1: rule__Block__Group__2__Impl : ( '{' ) ;
    public final void rule__Block__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3461:1: ( ( '{' ) )
            // InternalSlideOMatic.g:3462:1: ( '{' )
            {
            // InternalSlideOMatic.g:3462:1: ( '{' )
            // InternalSlideOMatic.g:3463:2: '{'
            {
             before(grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,65,FOLLOW_2); 
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
    // InternalSlideOMatic.g:3472:1: rule__Block__Group__3 : rule__Block__Group__3__Impl rule__Block__Group__4 ;
    public final void rule__Block__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3476:1: ( rule__Block__Group__3__Impl rule__Block__Group__4 )
            // InternalSlideOMatic.g:3477:2: rule__Block__Group__3__Impl rule__Block__Group__4
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
    // InternalSlideOMatic.g:3484:1: rule__Block__Group__3__Impl : ( ( ( rule__Block__ContentAssignment_3 ) ) ( ( rule__Block__ContentAssignment_3 )* ) ) ;
    public final void rule__Block__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3488:1: ( ( ( ( rule__Block__ContentAssignment_3 ) ) ( ( rule__Block__ContentAssignment_3 )* ) ) )
            // InternalSlideOMatic.g:3489:1: ( ( ( rule__Block__ContentAssignment_3 ) ) ( ( rule__Block__ContentAssignment_3 )* ) )
            {
            // InternalSlideOMatic.g:3489:1: ( ( ( rule__Block__ContentAssignment_3 ) ) ( ( rule__Block__ContentAssignment_3 )* ) )
            // InternalSlideOMatic.g:3490:2: ( ( rule__Block__ContentAssignment_3 ) ) ( ( rule__Block__ContentAssignment_3 )* )
            {
            // InternalSlideOMatic.g:3490:2: ( ( rule__Block__ContentAssignment_3 ) )
            // InternalSlideOMatic.g:3491:3: ( rule__Block__ContentAssignment_3 )
            {
             before(grammarAccess.getBlockAccess().getContentAssignment_3()); 
            // InternalSlideOMatic.g:3492:3: ( rule__Block__ContentAssignment_3 )
            // InternalSlideOMatic.g:3492:4: rule__Block__ContentAssignment_3
            {
            pushFollow(FOLLOW_17);
            rule__Block__ContentAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getBlockAccess().getContentAssignment_3()); 

            }

            // InternalSlideOMatic.g:3495:2: ( ( rule__Block__ContentAssignment_3 )* )
            // InternalSlideOMatic.g:3496:3: ( rule__Block__ContentAssignment_3 )*
            {
             before(grammarAccess.getBlockAccess().getContentAssignment_3()); 
            // InternalSlideOMatic.g:3497:3: ( rule__Block__ContentAssignment_3 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==RULE_STRING||(LA34_0>=78 && LA34_0<=86)||LA34_0==91||LA34_0==95||LA34_0==98||LA34_0==100||LA34_0==103||LA34_0==107) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalSlideOMatic.g:3497:4: rule__Block__ContentAssignment_3
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Block__ContentAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
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
    // InternalSlideOMatic.g:3506:1: rule__Block__Group__4 : rule__Block__Group__4__Impl ;
    public final void rule__Block__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3510:1: ( rule__Block__Group__4__Impl )
            // InternalSlideOMatic.g:3511:2: rule__Block__Group__4__Impl
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
    // InternalSlideOMatic.g:3517:1: rule__Block__Group__4__Impl : ( '}' ) ;
    public final void rule__Block__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3521:1: ( ( '}' ) )
            // InternalSlideOMatic.g:3522:1: ( '}' )
            {
            // InternalSlideOMatic.g:3522:1: ( '}' )
            // InternalSlideOMatic.g:3523:2: '}'
            {
             before(grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_4()); 
            match(input,66,FOLLOW_2); 
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
    // InternalSlideOMatic.g:3533:1: rule__NumberedList__Group__0 : rule__NumberedList__Group__0__Impl rule__NumberedList__Group__1 ;
    public final void rule__NumberedList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3537:1: ( rule__NumberedList__Group__0__Impl rule__NumberedList__Group__1 )
            // InternalSlideOMatic.g:3538:2: rule__NumberedList__Group__0__Impl rule__NumberedList__Group__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalSlideOMatic.g:3545:1: rule__NumberedList__Group__0__Impl : ( '#list' ) ;
    public final void rule__NumberedList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3549:1: ( ( '#list' ) )
            // InternalSlideOMatic.g:3550:1: ( '#list' )
            {
            // InternalSlideOMatic.g:3550:1: ( '#list' )
            // InternalSlideOMatic.g:3551:2: '#list'
            {
             before(grammarAccess.getNumberedListAccess().getListKeyword_0()); 
            match(input,85,FOLLOW_2); 
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
    // InternalSlideOMatic.g:3560:1: rule__NumberedList__Group__1 : rule__NumberedList__Group__1__Impl ;
    public final void rule__NumberedList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3564:1: ( rule__NumberedList__Group__1__Impl )
            // InternalSlideOMatic.g:3565:2: rule__NumberedList__Group__1__Impl
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
    // InternalSlideOMatic.g:3571:1: rule__NumberedList__Group__1__Impl : ( ( ( rule__NumberedList__ItemsAssignment_1 ) ) ( ( rule__NumberedList__ItemsAssignment_1 )* ) ) ;
    public final void rule__NumberedList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3575:1: ( ( ( ( rule__NumberedList__ItemsAssignment_1 ) ) ( ( rule__NumberedList__ItemsAssignment_1 )* ) ) )
            // InternalSlideOMatic.g:3576:1: ( ( ( rule__NumberedList__ItemsAssignment_1 ) ) ( ( rule__NumberedList__ItemsAssignment_1 )* ) )
            {
            // InternalSlideOMatic.g:3576:1: ( ( ( rule__NumberedList__ItemsAssignment_1 ) ) ( ( rule__NumberedList__ItemsAssignment_1 )* ) )
            // InternalSlideOMatic.g:3577:2: ( ( rule__NumberedList__ItemsAssignment_1 ) ) ( ( rule__NumberedList__ItemsAssignment_1 )* )
            {
            // InternalSlideOMatic.g:3577:2: ( ( rule__NumberedList__ItemsAssignment_1 ) )
            // InternalSlideOMatic.g:3578:3: ( rule__NumberedList__ItemsAssignment_1 )
            {
             before(grammarAccess.getNumberedListAccess().getItemsAssignment_1()); 
            // InternalSlideOMatic.g:3579:3: ( rule__NumberedList__ItemsAssignment_1 )
            // InternalSlideOMatic.g:3579:4: rule__NumberedList__ItemsAssignment_1
            {
            pushFollow(FOLLOW_31);
            rule__NumberedList__ItemsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNumberedListAccess().getItemsAssignment_1()); 

            }

            // InternalSlideOMatic.g:3582:2: ( ( rule__NumberedList__ItemsAssignment_1 )* )
            // InternalSlideOMatic.g:3583:3: ( rule__NumberedList__ItemsAssignment_1 )*
            {
             before(grammarAccess.getNumberedListAccess().getItemsAssignment_1()); 
            // InternalSlideOMatic.g:3584:3: ( rule__NumberedList__ItemsAssignment_1 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==87) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalSlideOMatic.g:3584:4: rule__NumberedList__ItemsAssignment_1
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__NumberedList__ItemsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
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
    // InternalSlideOMatic.g:3594:1: rule__UnNumberedList__Group__0 : rule__UnNumberedList__Group__0__Impl rule__UnNumberedList__Group__1 ;
    public final void rule__UnNumberedList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3598:1: ( rule__UnNumberedList__Group__0__Impl rule__UnNumberedList__Group__1 )
            // InternalSlideOMatic.g:3599:2: rule__UnNumberedList__Group__0__Impl rule__UnNumberedList__Group__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalSlideOMatic.g:3606:1: rule__UnNumberedList__Group__0__Impl : ( '&list' ) ;
    public final void rule__UnNumberedList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3610:1: ( ( '&list' ) )
            // InternalSlideOMatic.g:3611:1: ( '&list' )
            {
            // InternalSlideOMatic.g:3611:1: ( '&list' )
            // InternalSlideOMatic.g:3612:2: '&list'
            {
             before(grammarAccess.getUnNumberedListAccess().getListKeyword_0()); 
            match(input,86,FOLLOW_2); 
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
    // InternalSlideOMatic.g:3621:1: rule__UnNumberedList__Group__1 : rule__UnNumberedList__Group__1__Impl ;
    public final void rule__UnNumberedList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3625:1: ( rule__UnNumberedList__Group__1__Impl )
            // InternalSlideOMatic.g:3626:2: rule__UnNumberedList__Group__1__Impl
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
    // InternalSlideOMatic.g:3632:1: rule__UnNumberedList__Group__1__Impl : ( ( ( rule__UnNumberedList__ItemsAssignment_1 ) ) ( ( rule__UnNumberedList__ItemsAssignment_1 )* ) ) ;
    public final void rule__UnNumberedList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3636:1: ( ( ( ( rule__UnNumberedList__ItemsAssignment_1 ) ) ( ( rule__UnNumberedList__ItemsAssignment_1 )* ) ) )
            // InternalSlideOMatic.g:3637:1: ( ( ( rule__UnNumberedList__ItemsAssignment_1 ) ) ( ( rule__UnNumberedList__ItemsAssignment_1 )* ) )
            {
            // InternalSlideOMatic.g:3637:1: ( ( ( rule__UnNumberedList__ItemsAssignment_1 ) ) ( ( rule__UnNumberedList__ItemsAssignment_1 )* ) )
            // InternalSlideOMatic.g:3638:2: ( ( rule__UnNumberedList__ItemsAssignment_1 ) ) ( ( rule__UnNumberedList__ItemsAssignment_1 )* )
            {
            // InternalSlideOMatic.g:3638:2: ( ( rule__UnNumberedList__ItemsAssignment_1 ) )
            // InternalSlideOMatic.g:3639:3: ( rule__UnNumberedList__ItemsAssignment_1 )
            {
             before(grammarAccess.getUnNumberedListAccess().getItemsAssignment_1()); 
            // InternalSlideOMatic.g:3640:3: ( rule__UnNumberedList__ItemsAssignment_1 )
            // InternalSlideOMatic.g:3640:4: rule__UnNumberedList__ItemsAssignment_1
            {
            pushFollow(FOLLOW_31);
            rule__UnNumberedList__ItemsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getUnNumberedListAccess().getItemsAssignment_1()); 

            }

            // InternalSlideOMatic.g:3643:2: ( ( rule__UnNumberedList__ItemsAssignment_1 )* )
            // InternalSlideOMatic.g:3644:3: ( rule__UnNumberedList__ItemsAssignment_1 )*
            {
             before(grammarAccess.getUnNumberedListAccess().getItemsAssignment_1()); 
            // InternalSlideOMatic.g:3645:3: ( rule__UnNumberedList__ItemsAssignment_1 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==87) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalSlideOMatic.g:3645:4: rule__UnNumberedList__ItemsAssignment_1
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__UnNumberedList__ItemsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop36;
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
    // InternalSlideOMatic.g:3655:1: rule__ListItem__Group__0 : rule__ListItem__Group__0__Impl rule__ListItem__Group__1 ;
    public final void rule__ListItem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3659:1: ( rule__ListItem__Group__0__Impl rule__ListItem__Group__1 )
            // InternalSlideOMatic.g:3660:2: rule__ListItem__Group__0__Impl rule__ListItem__Group__1
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
    // InternalSlideOMatic.g:3667:1: rule__ListItem__Group__0__Impl : ( '-' ) ;
    public final void rule__ListItem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3671:1: ( ( '-' ) )
            // InternalSlideOMatic.g:3672:1: ( '-' )
            {
            // InternalSlideOMatic.g:3672:1: ( '-' )
            // InternalSlideOMatic.g:3673:2: '-'
            {
             before(grammarAccess.getListItemAccess().getHyphenMinusKeyword_0()); 
            match(input,87,FOLLOW_2); 
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
    // InternalSlideOMatic.g:3682:1: rule__ListItem__Group__1 : rule__ListItem__Group__1__Impl rule__ListItem__Group__2 ;
    public final void rule__ListItem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3686:1: ( rule__ListItem__Group__1__Impl rule__ListItem__Group__2 )
            // InternalSlideOMatic.g:3687:2: rule__ListItem__Group__1__Impl rule__ListItem__Group__2
            {
            pushFollow(FOLLOW_32);
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
    // InternalSlideOMatic.g:3694:1: rule__ListItem__Group__1__Impl : ( ( rule__ListItem__ItemAssignment_1 ) ) ;
    public final void rule__ListItem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3698:1: ( ( ( rule__ListItem__ItemAssignment_1 ) ) )
            // InternalSlideOMatic.g:3699:1: ( ( rule__ListItem__ItemAssignment_1 ) )
            {
            // InternalSlideOMatic.g:3699:1: ( ( rule__ListItem__ItemAssignment_1 ) )
            // InternalSlideOMatic.g:3700:2: ( rule__ListItem__ItemAssignment_1 )
            {
             before(grammarAccess.getListItemAccess().getItemAssignment_1()); 
            // InternalSlideOMatic.g:3701:2: ( rule__ListItem__ItemAssignment_1 )
            // InternalSlideOMatic.g:3701:3: rule__ListItem__ItemAssignment_1
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
    // InternalSlideOMatic.g:3709:1: rule__ListItem__Group__2 : rule__ListItem__Group__2__Impl rule__ListItem__Group__3 ;
    public final void rule__ListItem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3713:1: ( rule__ListItem__Group__2__Impl rule__ListItem__Group__3 )
            // InternalSlideOMatic.g:3714:2: rule__ListItem__Group__2__Impl rule__ListItem__Group__3
            {
            pushFollow(FOLLOW_32);
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
    // InternalSlideOMatic.g:3721:1: rule__ListItem__Group__2__Impl : ( ( rule__ListItem__Group_2__0 )? ) ;
    public final void rule__ListItem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3725:1: ( ( ( rule__ListItem__Group_2__0 )? ) )
            // InternalSlideOMatic.g:3726:1: ( ( rule__ListItem__Group_2__0 )? )
            {
            // InternalSlideOMatic.g:3726:1: ( ( rule__ListItem__Group_2__0 )? )
            // InternalSlideOMatic.g:3727:2: ( rule__ListItem__Group_2__0 )?
            {
             before(grammarAccess.getListItemAccess().getGroup_2()); 
            // InternalSlideOMatic.g:3728:2: ( rule__ListItem__Group_2__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==67) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalSlideOMatic.g:3728:3: rule__ListItem__Group_2__0
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
    // InternalSlideOMatic.g:3736:1: rule__ListItem__Group__3 : rule__ListItem__Group__3__Impl ;
    public final void rule__ListItem__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3740:1: ( rule__ListItem__Group__3__Impl )
            // InternalSlideOMatic.g:3741:2: rule__ListItem__Group__3__Impl
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
    // InternalSlideOMatic.g:3747:1: rule__ListItem__Group__3__Impl : ( ( rule__ListItem__ClickAssignment_3 )? ) ;
    public final void rule__ListItem__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3751:1: ( ( ( rule__ListItem__ClickAssignment_3 )? ) )
            // InternalSlideOMatic.g:3752:1: ( ( rule__ListItem__ClickAssignment_3 )? )
            {
            // InternalSlideOMatic.g:3752:1: ( ( rule__ListItem__ClickAssignment_3 )? )
            // InternalSlideOMatic.g:3753:2: ( rule__ListItem__ClickAssignment_3 )?
            {
             before(grammarAccess.getListItemAccess().getClickAssignment_3()); 
            // InternalSlideOMatic.g:3754:2: ( rule__ListItem__ClickAssignment_3 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==11) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalSlideOMatic.g:3754:3: rule__ListItem__ClickAssignment_3
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
    // InternalSlideOMatic.g:3763:1: rule__ListItem__Group_2__0 : rule__ListItem__Group_2__0__Impl rule__ListItem__Group_2__1 ;
    public final void rule__ListItem__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3767:1: ( rule__ListItem__Group_2__0__Impl rule__ListItem__Group_2__1 )
            // InternalSlideOMatic.g:3768:2: rule__ListItem__Group_2__0__Impl rule__ListItem__Group_2__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalSlideOMatic.g:3775:1: rule__ListItem__Group_2__0__Impl : ( '(' ) ;
    public final void rule__ListItem__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3779:1: ( ( '(' ) )
            // InternalSlideOMatic.g:3780:1: ( '(' )
            {
            // InternalSlideOMatic.g:3780:1: ( '(' )
            // InternalSlideOMatic.g:3781:2: '('
            {
             before(grammarAccess.getListItemAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,67,FOLLOW_2); 
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
    // InternalSlideOMatic.g:3790:1: rule__ListItem__Group_2__1 : rule__ListItem__Group_2__1__Impl rule__ListItem__Group_2__2 ;
    public final void rule__ListItem__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3794:1: ( rule__ListItem__Group_2__1__Impl rule__ListItem__Group_2__2 )
            // InternalSlideOMatic.g:3795:2: rule__ListItem__Group_2__1__Impl rule__ListItem__Group_2__2
            {
            pushFollow(FOLLOW_34);
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
    // InternalSlideOMatic.g:3802:1: rule__ListItem__Group_2__1__Impl : ( ( rule__ListItem__NestedListAssignment_2_1 ) ) ;
    public final void rule__ListItem__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3806:1: ( ( ( rule__ListItem__NestedListAssignment_2_1 ) ) )
            // InternalSlideOMatic.g:3807:1: ( ( rule__ListItem__NestedListAssignment_2_1 ) )
            {
            // InternalSlideOMatic.g:3807:1: ( ( rule__ListItem__NestedListAssignment_2_1 ) )
            // InternalSlideOMatic.g:3808:2: ( rule__ListItem__NestedListAssignment_2_1 )
            {
             before(grammarAccess.getListItemAccess().getNestedListAssignment_2_1()); 
            // InternalSlideOMatic.g:3809:2: ( rule__ListItem__NestedListAssignment_2_1 )
            // InternalSlideOMatic.g:3809:3: rule__ListItem__NestedListAssignment_2_1
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
    // InternalSlideOMatic.g:3817:1: rule__ListItem__Group_2__2 : rule__ListItem__Group_2__2__Impl ;
    public final void rule__ListItem__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3821:1: ( rule__ListItem__Group_2__2__Impl )
            // InternalSlideOMatic.g:3822:2: rule__ListItem__Group_2__2__Impl
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
    // InternalSlideOMatic.g:3828:1: rule__ListItem__Group_2__2__Impl : ( ')' ) ;
    public final void rule__ListItem__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3832:1: ( ( ')' ) )
            // InternalSlideOMatic.g:3833:1: ( ')' )
            {
            // InternalSlideOMatic.g:3833:1: ( ')' )
            // InternalSlideOMatic.g:3834:2: ')'
            {
             before(grammarAccess.getListItemAccess().getRightParenthesisKeyword_2_2()); 
            match(input,68,FOLLOW_2); 
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
    // InternalSlideOMatic.g:3844:1: rule__Image__Group__0 : rule__Image__Group__0__Impl rule__Image__Group__1 ;
    public final void rule__Image__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3848:1: ( rule__Image__Group__0__Impl rule__Image__Group__1 )
            // InternalSlideOMatic.g:3849:2: rule__Image__Group__0__Impl rule__Image__Group__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalSlideOMatic.g:3856:1: rule__Image__Group__0__Impl : ( 'img' ) ;
    public final void rule__Image__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3860:1: ( ( 'img' ) )
            // InternalSlideOMatic.g:3861:1: ( 'img' )
            {
            // InternalSlideOMatic.g:3861:1: ( 'img' )
            // InternalSlideOMatic.g:3862:2: 'img'
            {
             before(grammarAccess.getImageAccess().getImgKeyword_0()); 
            match(input,88,FOLLOW_2); 
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
    // InternalSlideOMatic.g:3871:1: rule__Image__Group__1 : rule__Image__Group__1__Impl rule__Image__Group__2 ;
    public final void rule__Image__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3875:1: ( rule__Image__Group__1__Impl rule__Image__Group__2 )
            // InternalSlideOMatic.g:3876:2: rule__Image__Group__1__Impl rule__Image__Group__2
            {
            pushFollow(FOLLOW_36);
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
    // InternalSlideOMatic.g:3883:1: rule__Image__Group__1__Impl : ( ( rule__Image__NameAssignment_1 ) ) ;
    public final void rule__Image__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3887:1: ( ( ( rule__Image__NameAssignment_1 ) ) )
            // InternalSlideOMatic.g:3888:1: ( ( rule__Image__NameAssignment_1 ) )
            {
            // InternalSlideOMatic.g:3888:1: ( ( rule__Image__NameAssignment_1 ) )
            // InternalSlideOMatic.g:3889:2: ( rule__Image__NameAssignment_1 )
            {
             before(grammarAccess.getImageAccess().getNameAssignment_1()); 
            // InternalSlideOMatic.g:3890:2: ( rule__Image__NameAssignment_1 )
            // InternalSlideOMatic.g:3890:3: rule__Image__NameAssignment_1
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
    // InternalSlideOMatic.g:3898:1: rule__Image__Group__2 : rule__Image__Group__2__Impl rule__Image__Group__3 ;
    public final void rule__Image__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3902:1: ( rule__Image__Group__2__Impl rule__Image__Group__3 )
            // InternalSlideOMatic.g:3903:2: rule__Image__Group__2__Impl rule__Image__Group__3
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
    // InternalSlideOMatic.g:3910:1: rule__Image__Group__2__Impl : ( 'src' ) ;
    public final void rule__Image__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3914:1: ( ( 'src' ) )
            // InternalSlideOMatic.g:3915:1: ( 'src' )
            {
            // InternalSlideOMatic.g:3915:1: ( 'src' )
            // InternalSlideOMatic.g:3916:2: 'src'
            {
             before(grammarAccess.getImageAccess().getSrcKeyword_2()); 
            match(input,89,FOLLOW_2); 
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
    // InternalSlideOMatic.g:3925:1: rule__Image__Group__3 : rule__Image__Group__3__Impl rule__Image__Group__4 ;
    public final void rule__Image__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3929:1: ( rule__Image__Group__3__Impl rule__Image__Group__4 )
            // InternalSlideOMatic.g:3930:2: rule__Image__Group__3__Impl rule__Image__Group__4
            {
            pushFollow(FOLLOW_37);
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
    // InternalSlideOMatic.g:3937:1: rule__Image__Group__3__Impl : ( ( rule__Image__SrcAssignment_3 ) ) ;
    public final void rule__Image__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3941:1: ( ( ( rule__Image__SrcAssignment_3 ) ) )
            // InternalSlideOMatic.g:3942:1: ( ( rule__Image__SrcAssignment_3 ) )
            {
            // InternalSlideOMatic.g:3942:1: ( ( rule__Image__SrcAssignment_3 ) )
            // InternalSlideOMatic.g:3943:2: ( rule__Image__SrcAssignment_3 )
            {
             before(grammarAccess.getImageAccess().getSrcAssignment_3()); 
            // InternalSlideOMatic.g:3944:2: ( rule__Image__SrcAssignment_3 )
            // InternalSlideOMatic.g:3944:3: rule__Image__SrcAssignment_3
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
    // InternalSlideOMatic.g:3952:1: rule__Image__Group__4 : rule__Image__Group__4__Impl rule__Image__Group__5 ;
    public final void rule__Image__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3956:1: ( rule__Image__Group__4__Impl rule__Image__Group__5 )
            // InternalSlideOMatic.g:3957:2: rule__Image__Group__4__Impl rule__Image__Group__5
            {
            pushFollow(FOLLOW_37);
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
    // InternalSlideOMatic.g:3964:1: rule__Image__Group__4__Impl : ( ( rule__Image__AngleAssignment_4 )? ) ;
    public final void rule__Image__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3968:1: ( ( ( rule__Image__AngleAssignment_4 )? ) )
            // InternalSlideOMatic.g:3969:1: ( ( rule__Image__AngleAssignment_4 )? )
            {
            // InternalSlideOMatic.g:3969:1: ( ( rule__Image__AngleAssignment_4 )? )
            // InternalSlideOMatic.g:3970:2: ( rule__Image__AngleAssignment_4 )?
            {
             before(grammarAccess.getImageAccess().getAngleAssignment_4()); 
            // InternalSlideOMatic.g:3971:2: ( rule__Image__AngleAssignment_4 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_INT) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalSlideOMatic.g:3971:3: rule__Image__AngleAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Image__AngleAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getImageAccess().getAngleAssignment_4()); 

            }


            }

        }
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
    // InternalSlideOMatic.g:3979:1: rule__Image__Group__5 : rule__Image__Group__5__Impl rule__Image__Group__6 ;
    public final void rule__Image__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3983:1: ( rule__Image__Group__5__Impl rule__Image__Group__6 )
            // InternalSlideOMatic.g:3984:2: rule__Image__Group__5__Impl rule__Image__Group__6
            {
            pushFollow(FOLLOW_37);
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
    // InternalSlideOMatic.g:3991:1: rule__Image__Group__5__Impl : ( ( rule__Image__Group_5__0 )? ) ;
    public final void rule__Image__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3995:1: ( ( ( rule__Image__Group_5__0 )? ) )
            // InternalSlideOMatic.g:3996:1: ( ( rule__Image__Group_5__0 )? )
            {
            // InternalSlideOMatic.g:3996:1: ( ( rule__Image__Group_5__0 )? )
            // InternalSlideOMatic.g:3997:2: ( rule__Image__Group_5__0 )?
            {
             before(grammarAccess.getImageAccess().getGroup_5()); 
            // InternalSlideOMatic.g:3998:2: ( rule__Image__Group_5__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==90) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalSlideOMatic.g:3998:3: rule__Image__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Image__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getImageAccess().getGroup_5()); 

            }


            }

        }
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
    // InternalSlideOMatic.g:4006:1: rule__Image__Group__6 : rule__Image__Group__6__Impl ;
    public final void rule__Image__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4010:1: ( rule__Image__Group__6__Impl )
            // InternalSlideOMatic.g:4011:2: rule__Image__Group__6__Impl
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
    // InternalSlideOMatic.g:4017:1: rule__Image__Group__6__Impl : ( ( rule__Image__SizeAssignment_6 ) ) ;
    public final void rule__Image__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4021:1: ( ( ( rule__Image__SizeAssignment_6 ) ) )
            // InternalSlideOMatic.g:4022:1: ( ( rule__Image__SizeAssignment_6 ) )
            {
            // InternalSlideOMatic.g:4022:1: ( ( rule__Image__SizeAssignment_6 ) )
            // InternalSlideOMatic.g:4023:2: ( rule__Image__SizeAssignment_6 )
            {
             before(grammarAccess.getImageAccess().getSizeAssignment_6()); 
            // InternalSlideOMatic.g:4024:2: ( rule__Image__SizeAssignment_6 )
            // InternalSlideOMatic.g:4024:3: rule__Image__SizeAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Image__SizeAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getImageAccess().getSizeAssignment_6()); 

            }


            }

        }
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


    // $ANTLR start "rule__Image__Group_5__0"
    // InternalSlideOMatic.g:4033:1: rule__Image__Group_5__0 : rule__Image__Group_5__0__Impl rule__Image__Group_5__1 ;
    public final void rule__Image__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4037:1: ( rule__Image__Group_5__0__Impl rule__Image__Group_5__1 )
            // InternalSlideOMatic.g:4038:2: rule__Image__Group_5__0__Impl rule__Image__Group_5__1
            {
            pushFollow(FOLLOW_38);
            rule__Image__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Image__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Image__Group_5__0"


    // $ANTLR start "rule__Image__Group_5__0__Impl"
    // InternalSlideOMatic.g:4045:1: rule__Image__Group_5__0__Impl : ( 'align' ) ;
    public final void rule__Image__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4049:1: ( ( 'align' ) )
            // InternalSlideOMatic.g:4050:1: ( 'align' )
            {
            // InternalSlideOMatic.g:4050:1: ( 'align' )
            // InternalSlideOMatic.g:4051:2: 'align'
            {
             before(grammarAccess.getImageAccess().getAlignKeyword_5_0()); 
            match(input,90,FOLLOW_2); 
             after(grammarAccess.getImageAccess().getAlignKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Image__Group_5__0__Impl"


    // $ANTLR start "rule__Image__Group_5__1"
    // InternalSlideOMatic.g:4060:1: rule__Image__Group_5__1 : rule__Image__Group_5__1__Impl ;
    public final void rule__Image__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4064:1: ( rule__Image__Group_5__1__Impl )
            // InternalSlideOMatic.g:4065:2: rule__Image__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Image__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Image__Group_5__1"


    // $ANTLR start "rule__Image__Group_5__1__Impl"
    // InternalSlideOMatic.g:4071:1: rule__Image__Group_5__1__Impl : ( ( rule__Image__AlignmentAssignment_5_1 ) ) ;
    public final void rule__Image__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4075:1: ( ( ( rule__Image__AlignmentAssignment_5_1 ) ) )
            // InternalSlideOMatic.g:4076:1: ( ( rule__Image__AlignmentAssignment_5_1 ) )
            {
            // InternalSlideOMatic.g:4076:1: ( ( rule__Image__AlignmentAssignment_5_1 ) )
            // InternalSlideOMatic.g:4077:2: ( rule__Image__AlignmentAssignment_5_1 )
            {
             before(grammarAccess.getImageAccess().getAlignmentAssignment_5_1()); 
            // InternalSlideOMatic.g:4078:2: ( rule__Image__AlignmentAssignment_5_1 )
            // InternalSlideOMatic.g:4078:3: rule__Image__AlignmentAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Image__AlignmentAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getImageAccess().getAlignmentAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Image__Group_5__1__Impl"


    // $ANTLR start "rule__ShowImage__Group__0"
    // InternalSlideOMatic.g:4087:1: rule__ShowImage__Group__0 : rule__ShowImage__Group__0__Impl rule__ShowImage__Group__1 ;
    public final void rule__ShowImage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4091:1: ( rule__ShowImage__Group__0__Impl rule__ShowImage__Group__1 )
            // InternalSlideOMatic.g:4092:2: rule__ShowImage__Group__0__Impl rule__ShowImage__Group__1
            {
            pushFollow(FOLLOW_35);
            rule__ShowImage__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ShowImage__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShowImage__Group__0"


    // $ANTLR start "rule__ShowImage__Group__0__Impl"
    // InternalSlideOMatic.g:4099:1: rule__ShowImage__Group__0__Impl : ( 'showimg' ) ;
    public final void rule__ShowImage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4103:1: ( ( 'showimg' ) )
            // InternalSlideOMatic.g:4104:1: ( 'showimg' )
            {
            // InternalSlideOMatic.g:4104:1: ( 'showimg' )
            // InternalSlideOMatic.g:4105:2: 'showimg'
            {
             before(grammarAccess.getShowImageAccess().getShowimgKeyword_0()); 
            match(input,91,FOLLOW_2); 
             after(grammarAccess.getShowImageAccess().getShowimgKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShowImage__Group__0__Impl"


    // $ANTLR start "rule__ShowImage__Group__1"
    // InternalSlideOMatic.g:4114:1: rule__ShowImage__Group__1 : rule__ShowImage__Group__1__Impl ;
    public final void rule__ShowImage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4118:1: ( rule__ShowImage__Group__1__Impl )
            // InternalSlideOMatic.g:4119:2: rule__ShowImage__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ShowImage__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShowImage__Group__1"


    // $ANTLR start "rule__ShowImage__Group__1__Impl"
    // InternalSlideOMatic.g:4125:1: rule__ShowImage__Group__1__Impl : ( ( rule__ShowImage__ImageAssignment_1 ) ) ;
    public final void rule__ShowImage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4129:1: ( ( ( rule__ShowImage__ImageAssignment_1 ) ) )
            // InternalSlideOMatic.g:4130:1: ( ( rule__ShowImage__ImageAssignment_1 ) )
            {
            // InternalSlideOMatic.g:4130:1: ( ( rule__ShowImage__ImageAssignment_1 ) )
            // InternalSlideOMatic.g:4131:2: ( rule__ShowImage__ImageAssignment_1 )
            {
             before(grammarAccess.getShowImageAccess().getImageAssignment_1()); 
            // InternalSlideOMatic.g:4132:2: ( rule__ShowImage__ImageAssignment_1 )
            // InternalSlideOMatic.g:4132:3: rule__ShowImage__ImageAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ShowImage__ImageAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getShowImageAccess().getImageAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShowImage__Group__1__Impl"


    // $ANTLR start "rule__Size__Group_0__0"
    // InternalSlideOMatic.g:4141:1: rule__Size__Group_0__0 : rule__Size__Group_0__0__Impl rule__Size__Group_0__1 ;
    public final void rule__Size__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4145:1: ( rule__Size__Group_0__0__Impl rule__Size__Group_0__1 )
            // InternalSlideOMatic.g:4146:2: rule__Size__Group_0__0__Impl rule__Size__Group_0__1
            {
            pushFollow(FOLLOW_39);
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
    // InternalSlideOMatic.g:4153:1: rule__Size__Group_0__0__Impl : ( () ) ;
    public final void rule__Size__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4157:1: ( ( () ) )
            // InternalSlideOMatic.g:4158:1: ( () )
            {
            // InternalSlideOMatic.g:4158:1: ( () )
            // InternalSlideOMatic.g:4159:2: ()
            {
             before(grammarAccess.getSizeAccess().getProportionalSizeAction_0_0()); 
            // InternalSlideOMatic.g:4160:2: ()
            // InternalSlideOMatic.g:4160:3: 
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
    // InternalSlideOMatic.g:4168:1: rule__Size__Group_0__1 : rule__Size__Group_0__1__Impl rule__Size__Group_0__2 ;
    public final void rule__Size__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4172:1: ( rule__Size__Group_0__1__Impl rule__Size__Group_0__2 )
            // InternalSlideOMatic.g:4173:2: rule__Size__Group_0__1__Impl rule__Size__Group_0__2
            {
            pushFollow(FOLLOW_40);
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
    // InternalSlideOMatic.g:4180:1: rule__Size__Group_0__1__Impl : ( ( rule__Size__WayAssignment_0_1 ) ) ;
    public final void rule__Size__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4184:1: ( ( ( rule__Size__WayAssignment_0_1 ) ) )
            // InternalSlideOMatic.g:4185:1: ( ( rule__Size__WayAssignment_0_1 ) )
            {
            // InternalSlideOMatic.g:4185:1: ( ( rule__Size__WayAssignment_0_1 ) )
            // InternalSlideOMatic.g:4186:2: ( rule__Size__WayAssignment_0_1 )
            {
             before(grammarAccess.getSizeAccess().getWayAssignment_0_1()); 
            // InternalSlideOMatic.g:4187:2: ( rule__Size__WayAssignment_0_1 )
            // InternalSlideOMatic.g:4187:3: rule__Size__WayAssignment_0_1
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
    // InternalSlideOMatic.g:4195:1: rule__Size__Group_0__2 : rule__Size__Group_0__2__Impl rule__Size__Group_0__3 ;
    public final void rule__Size__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4199:1: ( rule__Size__Group_0__2__Impl rule__Size__Group_0__3 )
            // InternalSlideOMatic.g:4200:2: rule__Size__Group_0__2__Impl rule__Size__Group_0__3
            {
            pushFollow(FOLLOW_41);
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
    // InternalSlideOMatic.g:4207:1: rule__Size__Group_0__2__Impl : ( ( rule__Size__ScaleAssignment_0_2 ) ) ;
    public final void rule__Size__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4211:1: ( ( ( rule__Size__ScaleAssignment_0_2 ) ) )
            // InternalSlideOMatic.g:4212:1: ( ( rule__Size__ScaleAssignment_0_2 ) )
            {
            // InternalSlideOMatic.g:4212:1: ( ( rule__Size__ScaleAssignment_0_2 ) )
            // InternalSlideOMatic.g:4213:2: ( rule__Size__ScaleAssignment_0_2 )
            {
             before(grammarAccess.getSizeAccess().getScaleAssignment_0_2()); 
            // InternalSlideOMatic.g:4214:2: ( rule__Size__ScaleAssignment_0_2 )
            // InternalSlideOMatic.g:4214:3: rule__Size__ScaleAssignment_0_2
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
    // InternalSlideOMatic.g:4222:1: rule__Size__Group_0__3 : rule__Size__Group_0__3__Impl ;
    public final void rule__Size__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4226:1: ( rule__Size__Group_0__3__Impl )
            // InternalSlideOMatic.g:4227:2: rule__Size__Group_0__3__Impl
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
    // InternalSlideOMatic.g:4233:1: rule__Size__Group_0__3__Impl : ( '%' ) ;
    public final void rule__Size__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4237:1: ( ( '%' ) )
            // InternalSlideOMatic.g:4238:1: ( '%' )
            {
            // InternalSlideOMatic.g:4238:1: ( '%' )
            // InternalSlideOMatic.g:4239:2: '%'
            {
             before(grammarAccess.getSizeAccess().getPercentSignKeyword_0_3()); 
            match(input,92,FOLLOW_2); 
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
    // InternalSlideOMatic.g:4249:1: rule__Size__Group_1__0 : rule__Size__Group_1__0__Impl rule__Size__Group_1__1 ;
    public final void rule__Size__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4253:1: ( rule__Size__Group_1__0__Impl rule__Size__Group_1__1 )
            // InternalSlideOMatic.g:4254:2: rule__Size__Group_1__0__Impl rule__Size__Group_1__1
            {
            pushFollow(FOLLOW_37);
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
    // InternalSlideOMatic.g:4261:1: rule__Size__Group_1__0__Impl : ( () ) ;
    public final void rule__Size__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4265:1: ( ( () ) )
            // InternalSlideOMatic.g:4266:1: ( () )
            {
            // InternalSlideOMatic.g:4266:1: ( () )
            // InternalSlideOMatic.g:4267:2: ()
            {
             before(grammarAccess.getSizeAccess().getExactSizeAction_1_0()); 
            // InternalSlideOMatic.g:4268:2: ()
            // InternalSlideOMatic.g:4268:3: 
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
    // InternalSlideOMatic.g:4276:1: rule__Size__Group_1__1 : rule__Size__Group_1__1__Impl rule__Size__Group_1__2 ;
    public final void rule__Size__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4280:1: ( rule__Size__Group_1__1__Impl rule__Size__Group_1__2 )
            // InternalSlideOMatic.g:4281:2: rule__Size__Group_1__1__Impl rule__Size__Group_1__2
            {
            pushFollow(FOLLOW_40);
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
    // InternalSlideOMatic.g:4288:1: rule__Size__Group_1__1__Impl : ( ( rule__Size__WayAssignment_1_1 ) ) ;
    public final void rule__Size__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4292:1: ( ( ( rule__Size__WayAssignment_1_1 ) ) )
            // InternalSlideOMatic.g:4293:1: ( ( rule__Size__WayAssignment_1_1 ) )
            {
            // InternalSlideOMatic.g:4293:1: ( ( rule__Size__WayAssignment_1_1 ) )
            // InternalSlideOMatic.g:4294:2: ( rule__Size__WayAssignment_1_1 )
            {
             before(grammarAccess.getSizeAccess().getWayAssignment_1_1()); 
            // InternalSlideOMatic.g:4295:2: ( rule__Size__WayAssignment_1_1 )
            // InternalSlideOMatic.g:4295:3: rule__Size__WayAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Size__WayAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSizeAccess().getWayAssignment_1_1()); 

            }


            }

        }
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
    // InternalSlideOMatic.g:4303:1: rule__Size__Group_1__2 : rule__Size__Group_1__2__Impl rule__Size__Group_1__3 ;
    public final void rule__Size__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4307:1: ( rule__Size__Group_1__2__Impl rule__Size__Group_1__3 )
            // InternalSlideOMatic.g:4308:2: rule__Size__Group_1__2__Impl rule__Size__Group_1__3
            {
            pushFollow(FOLLOW_42);
            rule__Size__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Size__Group_1__3();

            state._fsp--;


            }

        }
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
    // InternalSlideOMatic.g:4315:1: rule__Size__Group_1__2__Impl : ( ( rule__Size__SizeAssignment_1_2 ) ) ;
    public final void rule__Size__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4319:1: ( ( ( rule__Size__SizeAssignment_1_2 ) ) )
            // InternalSlideOMatic.g:4320:1: ( ( rule__Size__SizeAssignment_1_2 ) )
            {
            // InternalSlideOMatic.g:4320:1: ( ( rule__Size__SizeAssignment_1_2 ) )
            // InternalSlideOMatic.g:4321:2: ( rule__Size__SizeAssignment_1_2 )
            {
             before(grammarAccess.getSizeAccess().getSizeAssignment_1_2()); 
            // InternalSlideOMatic.g:4322:2: ( rule__Size__SizeAssignment_1_2 )
            // InternalSlideOMatic.g:4322:3: rule__Size__SizeAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Size__SizeAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getSizeAccess().getSizeAssignment_1_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Size__Group_1__3"
    // InternalSlideOMatic.g:4330:1: rule__Size__Group_1__3 : rule__Size__Group_1__3__Impl ;
    public final void rule__Size__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4334:1: ( rule__Size__Group_1__3__Impl )
            // InternalSlideOMatic.g:4335:2: rule__Size__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Size__Group_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Size__Group_1__3"


    // $ANTLR start "rule__Size__Group_1__3__Impl"
    // InternalSlideOMatic.g:4341:1: rule__Size__Group_1__3__Impl : ( ( rule__Size__UnitAssignment_1_3 ) ) ;
    public final void rule__Size__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4345:1: ( ( ( rule__Size__UnitAssignment_1_3 ) ) )
            // InternalSlideOMatic.g:4346:1: ( ( rule__Size__UnitAssignment_1_3 ) )
            {
            // InternalSlideOMatic.g:4346:1: ( ( rule__Size__UnitAssignment_1_3 ) )
            // InternalSlideOMatic.g:4347:2: ( rule__Size__UnitAssignment_1_3 )
            {
             before(grammarAccess.getSizeAccess().getUnitAssignment_1_3()); 
            // InternalSlideOMatic.g:4348:2: ( rule__Size__UnitAssignment_1_3 )
            // InternalSlideOMatic.g:4348:3: rule__Size__UnitAssignment_1_3
            {
            pushFollow(FOLLOW_2);
            rule__Size__UnitAssignment_1_3();

            state._fsp--;


            }

             after(grammarAccess.getSizeAccess().getUnitAssignment_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Size__Group_1__3__Impl"


    // $ANTLR start "rule__Way__Group_0__0"
    // InternalSlideOMatic.g:4357:1: rule__Way__Group_0__0 : rule__Way__Group_0__0__Impl rule__Way__Group_0__1 ;
    public final void rule__Way__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4361:1: ( rule__Way__Group_0__0__Impl rule__Way__Group_0__1 )
            // InternalSlideOMatic.g:4362:2: rule__Way__Group_0__0__Impl rule__Way__Group_0__1
            {
            pushFollow(FOLLOW_43);
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
    // InternalSlideOMatic.g:4369:1: rule__Way__Group_0__0__Impl : ( () ) ;
    public final void rule__Way__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4373:1: ( ( () ) )
            // InternalSlideOMatic.g:4374:1: ( () )
            {
            // InternalSlideOMatic.g:4374:1: ( () )
            // InternalSlideOMatic.g:4375:2: ()
            {
             before(grammarAccess.getWayAccess().getWidthAction_0_0()); 
            // InternalSlideOMatic.g:4376:2: ()
            // InternalSlideOMatic.g:4376:3: 
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
    // InternalSlideOMatic.g:4384:1: rule__Way__Group_0__1 : rule__Way__Group_0__1__Impl ;
    public final void rule__Way__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4388:1: ( rule__Way__Group_0__1__Impl )
            // InternalSlideOMatic.g:4389:2: rule__Way__Group_0__1__Impl
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
    // InternalSlideOMatic.g:4395:1: rule__Way__Group_0__1__Impl : ( 'width' ) ;
    public final void rule__Way__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4399:1: ( ( 'width' ) )
            // InternalSlideOMatic.g:4400:1: ( 'width' )
            {
            // InternalSlideOMatic.g:4400:1: ( 'width' )
            // InternalSlideOMatic.g:4401:2: 'width'
            {
             before(grammarAccess.getWayAccess().getWidthKeyword_0_1()); 
            match(input,93,FOLLOW_2); 
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
    // InternalSlideOMatic.g:4411:1: rule__Way__Group_1__0 : rule__Way__Group_1__0__Impl rule__Way__Group_1__1 ;
    public final void rule__Way__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4415:1: ( rule__Way__Group_1__0__Impl rule__Way__Group_1__1 )
            // InternalSlideOMatic.g:4416:2: rule__Way__Group_1__0__Impl rule__Way__Group_1__1
            {
            pushFollow(FOLLOW_39);
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
    // InternalSlideOMatic.g:4423:1: rule__Way__Group_1__0__Impl : ( () ) ;
    public final void rule__Way__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4427:1: ( ( () ) )
            // InternalSlideOMatic.g:4428:1: ( () )
            {
            // InternalSlideOMatic.g:4428:1: ( () )
            // InternalSlideOMatic.g:4429:2: ()
            {
             before(grammarAccess.getWayAccess().getHeightAction_1_0()); 
            // InternalSlideOMatic.g:4430:2: ()
            // InternalSlideOMatic.g:4430:3: 
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
    // InternalSlideOMatic.g:4438:1: rule__Way__Group_1__1 : rule__Way__Group_1__1__Impl ;
    public final void rule__Way__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4442:1: ( rule__Way__Group_1__1__Impl )
            // InternalSlideOMatic.g:4443:2: rule__Way__Group_1__1__Impl
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
    // InternalSlideOMatic.g:4449:1: rule__Way__Group_1__1__Impl : ( 'height' ) ;
    public final void rule__Way__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4453:1: ( ( 'height' ) )
            // InternalSlideOMatic.g:4454:1: ( 'height' )
            {
            // InternalSlideOMatic.g:4454:1: ( 'height' )
            // InternalSlideOMatic.g:4455:2: 'height'
            {
             before(grammarAccess.getWayAccess().getHeightKeyword_1_1()); 
            match(input,94,FOLLOW_2); 
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
    // InternalSlideOMatic.g:4465:1: rule__Table__Group__0 : rule__Table__Group__0__Impl rule__Table__Group__1 ;
    public final void rule__Table__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4469:1: ( rule__Table__Group__0__Impl rule__Table__Group__1 )
            // InternalSlideOMatic.g:4470:2: rule__Table__Group__0__Impl rule__Table__Group__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalSlideOMatic.g:4477:1: rule__Table__Group__0__Impl : ( 'tab' ) ;
    public final void rule__Table__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4481:1: ( ( 'tab' ) )
            // InternalSlideOMatic.g:4482:1: ( 'tab' )
            {
            // InternalSlideOMatic.g:4482:1: ( 'tab' )
            // InternalSlideOMatic.g:4483:2: 'tab'
            {
             before(grammarAccess.getTableAccess().getTabKeyword_0()); 
            match(input,95,FOLLOW_2); 
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
    // InternalSlideOMatic.g:4492:1: rule__Table__Group__1 : rule__Table__Group__1__Impl rule__Table__Group__2 ;
    public final void rule__Table__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4496:1: ( rule__Table__Group__1__Impl rule__Table__Group__2 )
            // InternalSlideOMatic.g:4497:2: rule__Table__Group__1__Impl rule__Table__Group__2
            {
            pushFollow(FOLLOW_44);
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
    // InternalSlideOMatic.g:4504:1: rule__Table__Group__1__Impl : ( ( rule__Table__NameAssignment_1 ) ) ;
    public final void rule__Table__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4508:1: ( ( ( rule__Table__NameAssignment_1 ) ) )
            // InternalSlideOMatic.g:4509:1: ( ( rule__Table__NameAssignment_1 ) )
            {
            // InternalSlideOMatic.g:4509:1: ( ( rule__Table__NameAssignment_1 ) )
            // InternalSlideOMatic.g:4510:2: ( rule__Table__NameAssignment_1 )
            {
             before(grammarAccess.getTableAccess().getNameAssignment_1()); 
            // InternalSlideOMatic.g:4511:2: ( rule__Table__NameAssignment_1 )
            // InternalSlideOMatic.g:4511:3: rule__Table__NameAssignment_1
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
    // InternalSlideOMatic.g:4519:1: rule__Table__Group__2 : rule__Table__Group__2__Impl rule__Table__Group__3 ;
    public final void rule__Table__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4523:1: ( rule__Table__Group__2__Impl rule__Table__Group__3 )
            // InternalSlideOMatic.g:4524:2: rule__Table__Group__2__Impl rule__Table__Group__3
            {
            pushFollow(FOLLOW_44);
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
    // InternalSlideOMatic.g:4531:1: rule__Table__Group__2__Impl : ( '[' ) ;
    public final void rule__Table__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4535:1: ( ( '[' ) )
            // InternalSlideOMatic.g:4536:1: ( '[' )
            {
            // InternalSlideOMatic.g:4536:1: ( '[' )
            // InternalSlideOMatic.g:4537:2: '['
            {
             before(grammarAccess.getTableAccess().getLeftSquareBracketKeyword_2()); 
            match(input,96,FOLLOW_2); 
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
    // InternalSlideOMatic.g:4546:1: rule__Table__Group__3 : rule__Table__Group__3__Impl rule__Table__Group__4 ;
    public final void rule__Table__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4550:1: ( rule__Table__Group__3__Impl rule__Table__Group__4 )
            // InternalSlideOMatic.g:4551:2: rule__Table__Group__3__Impl rule__Table__Group__4
            {
            pushFollow(FOLLOW_45);
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
    // InternalSlideOMatic.g:4558:1: rule__Table__Group__3__Impl : ( ( rule__Table__RowsAssignment_3 ) ) ;
    public final void rule__Table__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4562:1: ( ( ( rule__Table__RowsAssignment_3 ) ) )
            // InternalSlideOMatic.g:4563:1: ( ( rule__Table__RowsAssignment_3 ) )
            {
            // InternalSlideOMatic.g:4563:1: ( ( rule__Table__RowsAssignment_3 ) )
            // InternalSlideOMatic.g:4564:2: ( rule__Table__RowsAssignment_3 )
            {
             before(grammarAccess.getTableAccess().getRowsAssignment_3()); 
            // InternalSlideOMatic.g:4565:2: ( rule__Table__RowsAssignment_3 )
            // InternalSlideOMatic.g:4565:3: rule__Table__RowsAssignment_3
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
    // InternalSlideOMatic.g:4573:1: rule__Table__Group__4 : rule__Table__Group__4__Impl rule__Table__Group__5 ;
    public final void rule__Table__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4577:1: ( rule__Table__Group__4__Impl rule__Table__Group__5 )
            // InternalSlideOMatic.g:4578:2: rule__Table__Group__4__Impl rule__Table__Group__5
            {
            pushFollow(FOLLOW_45);
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
    // InternalSlideOMatic.g:4585:1: rule__Table__Group__4__Impl : ( ( rule__Table__Group_4__0 )* ) ;
    public final void rule__Table__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4589:1: ( ( ( rule__Table__Group_4__0 )* ) )
            // InternalSlideOMatic.g:4590:1: ( ( rule__Table__Group_4__0 )* )
            {
            // InternalSlideOMatic.g:4590:1: ( ( rule__Table__Group_4__0 )* )
            // InternalSlideOMatic.g:4591:2: ( rule__Table__Group_4__0 )*
            {
             before(grammarAccess.getTableAccess().getGroup_4()); 
            // InternalSlideOMatic.g:4592:2: ( rule__Table__Group_4__0 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==71) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalSlideOMatic.g:4592:3: rule__Table__Group_4__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Table__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop41;
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
    // InternalSlideOMatic.g:4600:1: rule__Table__Group__5 : rule__Table__Group__5__Impl ;
    public final void rule__Table__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4604:1: ( rule__Table__Group__5__Impl )
            // InternalSlideOMatic.g:4605:2: rule__Table__Group__5__Impl
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
    // InternalSlideOMatic.g:4611:1: rule__Table__Group__5__Impl : ( ']' ) ;
    public final void rule__Table__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4615:1: ( ( ']' ) )
            // InternalSlideOMatic.g:4616:1: ( ']' )
            {
            // InternalSlideOMatic.g:4616:1: ( ']' )
            // InternalSlideOMatic.g:4617:2: ']'
            {
             before(grammarAccess.getTableAccess().getRightSquareBracketKeyword_5()); 
            match(input,97,FOLLOW_2); 
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
    // InternalSlideOMatic.g:4627:1: rule__Table__Group_4__0 : rule__Table__Group_4__0__Impl rule__Table__Group_4__1 ;
    public final void rule__Table__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4631:1: ( rule__Table__Group_4__0__Impl rule__Table__Group_4__1 )
            // InternalSlideOMatic.g:4632:2: rule__Table__Group_4__0__Impl rule__Table__Group_4__1
            {
            pushFollow(FOLLOW_44);
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
    // InternalSlideOMatic.g:4639:1: rule__Table__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Table__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4643:1: ( ( ',' ) )
            // InternalSlideOMatic.g:4644:1: ( ',' )
            {
            // InternalSlideOMatic.g:4644:1: ( ',' )
            // InternalSlideOMatic.g:4645:2: ','
            {
             before(grammarAccess.getTableAccess().getCommaKeyword_4_0()); 
            match(input,71,FOLLOW_2); 
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
    // InternalSlideOMatic.g:4654:1: rule__Table__Group_4__1 : rule__Table__Group_4__1__Impl ;
    public final void rule__Table__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4658:1: ( rule__Table__Group_4__1__Impl )
            // InternalSlideOMatic.g:4659:2: rule__Table__Group_4__1__Impl
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
    // InternalSlideOMatic.g:4665:1: rule__Table__Group_4__1__Impl : ( ( rule__Table__RowsAssignment_4_1 ) ) ;
    public final void rule__Table__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4669:1: ( ( ( rule__Table__RowsAssignment_4_1 ) ) )
            // InternalSlideOMatic.g:4670:1: ( ( rule__Table__RowsAssignment_4_1 ) )
            {
            // InternalSlideOMatic.g:4670:1: ( ( rule__Table__RowsAssignment_4_1 ) )
            // InternalSlideOMatic.g:4671:2: ( rule__Table__RowsAssignment_4_1 )
            {
             before(grammarAccess.getTableAccess().getRowsAssignment_4_1()); 
            // InternalSlideOMatic.g:4672:2: ( rule__Table__RowsAssignment_4_1 )
            // InternalSlideOMatic.g:4672:3: rule__Table__RowsAssignment_4_1
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
    // InternalSlideOMatic.g:4681:1: rule__TableRow__Group__0 : rule__TableRow__Group__0__Impl rule__TableRow__Group__1 ;
    public final void rule__TableRow__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4685:1: ( rule__TableRow__Group__0__Impl rule__TableRow__Group__1 )
            // InternalSlideOMatic.g:4686:2: rule__TableRow__Group__0__Impl rule__TableRow__Group__1
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
    // InternalSlideOMatic.g:4693:1: rule__TableRow__Group__0__Impl : ( '[' ) ;
    public final void rule__TableRow__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4697:1: ( ( '[' ) )
            // InternalSlideOMatic.g:4698:1: ( '[' )
            {
            // InternalSlideOMatic.g:4698:1: ( '[' )
            // InternalSlideOMatic.g:4699:2: '['
            {
             before(grammarAccess.getTableRowAccess().getLeftSquareBracketKeyword_0()); 
            match(input,96,FOLLOW_2); 
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
    // InternalSlideOMatic.g:4708:1: rule__TableRow__Group__1 : rule__TableRow__Group__1__Impl rule__TableRow__Group__2 ;
    public final void rule__TableRow__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4712:1: ( rule__TableRow__Group__1__Impl rule__TableRow__Group__2 )
            // InternalSlideOMatic.g:4713:2: rule__TableRow__Group__1__Impl rule__TableRow__Group__2
            {
            pushFollow(FOLLOW_45);
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
    // InternalSlideOMatic.g:4720:1: rule__TableRow__Group__1__Impl : ( ( rule__TableRow__ValuesAssignment_1 ) ) ;
    public final void rule__TableRow__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4724:1: ( ( ( rule__TableRow__ValuesAssignment_1 ) ) )
            // InternalSlideOMatic.g:4725:1: ( ( rule__TableRow__ValuesAssignment_1 ) )
            {
            // InternalSlideOMatic.g:4725:1: ( ( rule__TableRow__ValuesAssignment_1 ) )
            // InternalSlideOMatic.g:4726:2: ( rule__TableRow__ValuesAssignment_1 )
            {
             before(grammarAccess.getTableRowAccess().getValuesAssignment_1()); 
            // InternalSlideOMatic.g:4727:2: ( rule__TableRow__ValuesAssignment_1 )
            // InternalSlideOMatic.g:4727:3: rule__TableRow__ValuesAssignment_1
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
    // InternalSlideOMatic.g:4735:1: rule__TableRow__Group__2 : rule__TableRow__Group__2__Impl rule__TableRow__Group__3 ;
    public final void rule__TableRow__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4739:1: ( rule__TableRow__Group__2__Impl rule__TableRow__Group__3 )
            // InternalSlideOMatic.g:4740:2: rule__TableRow__Group__2__Impl rule__TableRow__Group__3
            {
            pushFollow(FOLLOW_45);
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
    // InternalSlideOMatic.g:4747:1: rule__TableRow__Group__2__Impl : ( ( rule__TableRow__Group_2__0 )* ) ;
    public final void rule__TableRow__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4751:1: ( ( ( rule__TableRow__Group_2__0 )* ) )
            // InternalSlideOMatic.g:4752:1: ( ( rule__TableRow__Group_2__0 )* )
            {
            // InternalSlideOMatic.g:4752:1: ( ( rule__TableRow__Group_2__0 )* )
            // InternalSlideOMatic.g:4753:2: ( rule__TableRow__Group_2__0 )*
            {
             before(grammarAccess.getTableRowAccess().getGroup_2()); 
            // InternalSlideOMatic.g:4754:2: ( rule__TableRow__Group_2__0 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==71) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalSlideOMatic.g:4754:3: rule__TableRow__Group_2__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__TableRow__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop42;
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
    // InternalSlideOMatic.g:4762:1: rule__TableRow__Group__3 : rule__TableRow__Group__3__Impl ;
    public final void rule__TableRow__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4766:1: ( rule__TableRow__Group__3__Impl )
            // InternalSlideOMatic.g:4767:2: rule__TableRow__Group__3__Impl
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
    // InternalSlideOMatic.g:4773:1: rule__TableRow__Group__3__Impl : ( ']' ) ;
    public final void rule__TableRow__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4777:1: ( ( ']' ) )
            // InternalSlideOMatic.g:4778:1: ( ']' )
            {
            // InternalSlideOMatic.g:4778:1: ( ']' )
            // InternalSlideOMatic.g:4779:2: ']'
            {
             before(grammarAccess.getTableRowAccess().getRightSquareBracketKeyword_3()); 
            match(input,97,FOLLOW_2); 
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
    // InternalSlideOMatic.g:4789:1: rule__TableRow__Group_2__0 : rule__TableRow__Group_2__0__Impl rule__TableRow__Group_2__1 ;
    public final void rule__TableRow__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4793:1: ( rule__TableRow__Group_2__0__Impl rule__TableRow__Group_2__1 )
            // InternalSlideOMatic.g:4794:2: rule__TableRow__Group_2__0__Impl rule__TableRow__Group_2__1
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
    // InternalSlideOMatic.g:4801:1: rule__TableRow__Group_2__0__Impl : ( ',' ) ;
    public final void rule__TableRow__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4805:1: ( ( ',' ) )
            // InternalSlideOMatic.g:4806:1: ( ',' )
            {
            // InternalSlideOMatic.g:4806:1: ( ',' )
            // InternalSlideOMatic.g:4807:2: ','
            {
             before(grammarAccess.getTableRowAccess().getCommaKeyword_2_0()); 
            match(input,71,FOLLOW_2); 
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
    // InternalSlideOMatic.g:4816:1: rule__TableRow__Group_2__1 : rule__TableRow__Group_2__1__Impl ;
    public final void rule__TableRow__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4820:1: ( rule__TableRow__Group_2__1__Impl )
            // InternalSlideOMatic.g:4821:2: rule__TableRow__Group_2__1__Impl
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
    // InternalSlideOMatic.g:4827:1: rule__TableRow__Group_2__1__Impl : ( ( rule__TableRow__ValuesAssignment_2_1 ) ) ;
    public final void rule__TableRow__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4831:1: ( ( ( rule__TableRow__ValuesAssignment_2_1 ) ) )
            // InternalSlideOMatic.g:4832:1: ( ( rule__TableRow__ValuesAssignment_2_1 ) )
            {
            // InternalSlideOMatic.g:4832:1: ( ( rule__TableRow__ValuesAssignment_2_1 ) )
            // InternalSlideOMatic.g:4833:2: ( rule__TableRow__ValuesAssignment_2_1 )
            {
             before(grammarAccess.getTableRowAccess().getValuesAssignment_2_1()); 
            // InternalSlideOMatic.g:4834:2: ( rule__TableRow__ValuesAssignment_2_1 )
            // InternalSlideOMatic.g:4834:3: rule__TableRow__ValuesAssignment_2_1
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
    // InternalSlideOMatic.g:4843:1: rule__Code__Group_0__0 : rule__Code__Group_0__0__Impl rule__Code__Group_0__1 ;
    public final void rule__Code__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4847:1: ( rule__Code__Group_0__0__Impl rule__Code__Group_0__1 )
            // InternalSlideOMatic.g:4848:2: rule__Code__Group_0__0__Impl rule__Code__Group_0__1
            {
            pushFollow(FOLLOW_46);
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
    // InternalSlideOMatic.g:4855:1: rule__Code__Group_0__0__Impl : ( () ) ;
    public final void rule__Code__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4859:1: ( ( () ) )
            // InternalSlideOMatic.g:4860:1: ( () )
            {
            // InternalSlideOMatic.g:4860:1: ( () )
            // InternalSlideOMatic.g:4861:2: ()
            {
             before(grammarAccess.getCodeAccess().getInlineCodeAction_0_0()); 
            // InternalSlideOMatic.g:4862:2: ()
            // InternalSlideOMatic.g:4862:3: 
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
    // InternalSlideOMatic.g:4870:1: rule__Code__Group_0__1 : rule__Code__Group_0__1__Impl rule__Code__Group_0__2 ;
    public final void rule__Code__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4874:1: ( rule__Code__Group_0__1__Impl rule__Code__Group_0__2 )
            // InternalSlideOMatic.g:4875:2: rule__Code__Group_0__1__Impl rule__Code__Group_0__2
            {
            pushFollow(FOLLOW_35);
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
    // InternalSlideOMatic.g:4882:1: rule__Code__Group_0__1__Impl : ( 'code' ) ;
    public final void rule__Code__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4886:1: ( ( 'code' ) )
            // InternalSlideOMatic.g:4887:1: ( 'code' )
            {
            // InternalSlideOMatic.g:4887:1: ( 'code' )
            // InternalSlideOMatic.g:4888:2: 'code'
            {
             before(grammarAccess.getCodeAccess().getCodeKeyword_0_1()); 
            match(input,98,FOLLOW_2); 
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
    // InternalSlideOMatic.g:4897:1: rule__Code__Group_0__2 : rule__Code__Group_0__2__Impl rule__Code__Group_0__3 ;
    public final void rule__Code__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4901:1: ( rule__Code__Group_0__2__Impl rule__Code__Group_0__3 )
            // InternalSlideOMatic.g:4902:2: rule__Code__Group_0__2__Impl rule__Code__Group_0__3
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
    // InternalSlideOMatic.g:4909:1: rule__Code__Group_0__2__Impl : ( ( rule__Code__LangAssignment_0_2 ) ) ;
    public final void rule__Code__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4913:1: ( ( ( rule__Code__LangAssignment_0_2 ) ) )
            // InternalSlideOMatic.g:4914:1: ( ( rule__Code__LangAssignment_0_2 ) )
            {
            // InternalSlideOMatic.g:4914:1: ( ( rule__Code__LangAssignment_0_2 ) )
            // InternalSlideOMatic.g:4915:2: ( rule__Code__LangAssignment_0_2 )
            {
             before(grammarAccess.getCodeAccess().getLangAssignment_0_2()); 
            // InternalSlideOMatic.g:4916:2: ( rule__Code__LangAssignment_0_2 )
            // InternalSlideOMatic.g:4916:3: rule__Code__LangAssignment_0_2
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
    // InternalSlideOMatic.g:4924:1: rule__Code__Group_0__3 : rule__Code__Group_0__3__Impl rule__Code__Group_0__4 ;
    public final void rule__Code__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4928:1: ( rule__Code__Group_0__3__Impl rule__Code__Group_0__4 )
            // InternalSlideOMatic.g:4929:2: rule__Code__Group_0__3__Impl rule__Code__Group_0__4
            {
            pushFollow(FOLLOW_47);
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
    // InternalSlideOMatic.g:4936:1: rule__Code__Group_0__3__Impl : ( ( rule__Code__CodeAssignment_0_3 ) ) ;
    public final void rule__Code__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4940:1: ( ( ( rule__Code__CodeAssignment_0_3 ) ) )
            // InternalSlideOMatic.g:4941:1: ( ( rule__Code__CodeAssignment_0_3 ) )
            {
            // InternalSlideOMatic.g:4941:1: ( ( rule__Code__CodeAssignment_0_3 ) )
            // InternalSlideOMatic.g:4942:2: ( rule__Code__CodeAssignment_0_3 )
            {
             before(grammarAccess.getCodeAccess().getCodeAssignment_0_3()); 
            // InternalSlideOMatic.g:4943:2: ( rule__Code__CodeAssignment_0_3 )
            // InternalSlideOMatic.g:4943:3: rule__Code__CodeAssignment_0_3
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
    // InternalSlideOMatic.g:4951:1: rule__Code__Group_0__4 : rule__Code__Group_0__4__Impl ;
    public final void rule__Code__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4955:1: ( rule__Code__Group_0__4__Impl )
            // InternalSlideOMatic.g:4956:2: rule__Code__Group_0__4__Impl
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
    // InternalSlideOMatic.g:4962:1: rule__Code__Group_0__4__Impl : ( 'end' ) ;
    public final void rule__Code__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4966:1: ( ( 'end' ) )
            // InternalSlideOMatic.g:4967:1: ( 'end' )
            {
            // InternalSlideOMatic.g:4967:1: ( 'end' )
            // InternalSlideOMatic.g:4968:2: 'end'
            {
             before(grammarAccess.getCodeAccess().getEndKeyword_0_4()); 
            match(input,99,FOLLOW_2); 
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
    // InternalSlideOMatic.g:4978:1: rule__Code__Group_1__0 : rule__Code__Group_1__0__Impl rule__Code__Group_1__1 ;
    public final void rule__Code__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4982:1: ( rule__Code__Group_1__0__Impl rule__Code__Group_1__1 )
            // InternalSlideOMatic.g:4983:2: rule__Code__Group_1__0__Impl rule__Code__Group_1__1
            {
            pushFollow(FOLLOW_48);
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
    // InternalSlideOMatic.g:4990:1: rule__Code__Group_1__0__Impl : ( () ) ;
    public final void rule__Code__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:4994:1: ( ( () ) )
            // InternalSlideOMatic.g:4995:1: ( () )
            {
            // InternalSlideOMatic.g:4995:1: ( () )
            // InternalSlideOMatic.g:4996:2: ()
            {
             before(grammarAccess.getCodeAccess().getFileCodeAction_1_0()); 
            // InternalSlideOMatic.g:4997:2: ()
            // InternalSlideOMatic.g:4997:3: 
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
    // InternalSlideOMatic.g:5005:1: rule__Code__Group_1__1 : rule__Code__Group_1__1__Impl rule__Code__Group_1__2 ;
    public final void rule__Code__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5009:1: ( rule__Code__Group_1__1__Impl rule__Code__Group_1__2 )
            // InternalSlideOMatic.g:5010:2: rule__Code__Group_1__1__Impl rule__Code__Group_1__2
            {
            pushFollow(FOLLOW_35);
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
    // InternalSlideOMatic.g:5017:1: rule__Code__Group_1__1__Impl : ( 'filecode' ) ;
    public final void rule__Code__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5021:1: ( ( 'filecode' ) )
            // InternalSlideOMatic.g:5022:1: ( 'filecode' )
            {
            // InternalSlideOMatic.g:5022:1: ( 'filecode' )
            // InternalSlideOMatic.g:5023:2: 'filecode'
            {
             before(grammarAccess.getCodeAccess().getFilecodeKeyword_1_1()); 
            match(input,100,FOLLOW_2); 
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
    // InternalSlideOMatic.g:5032:1: rule__Code__Group_1__2 : rule__Code__Group_1__2__Impl rule__Code__Group_1__3 ;
    public final void rule__Code__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5036:1: ( rule__Code__Group_1__2__Impl rule__Code__Group_1__3 )
            // InternalSlideOMatic.g:5037:2: rule__Code__Group_1__2__Impl rule__Code__Group_1__3
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
    // InternalSlideOMatic.g:5044:1: rule__Code__Group_1__2__Impl : ( ( rule__Code__LangAssignment_1_2 ) ) ;
    public final void rule__Code__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5048:1: ( ( ( rule__Code__LangAssignment_1_2 ) ) )
            // InternalSlideOMatic.g:5049:1: ( ( rule__Code__LangAssignment_1_2 ) )
            {
            // InternalSlideOMatic.g:5049:1: ( ( rule__Code__LangAssignment_1_2 ) )
            // InternalSlideOMatic.g:5050:2: ( rule__Code__LangAssignment_1_2 )
            {
             before(grammarAccess.getCodeAccess().getLangAssignment_1_2()); 
            // InternalSlideOMatic.g:5051:2: ( rule__Code__LangAssignment_1_2 )
            // InternalSlideOMatic.g:5051:3: rule__Code__LangAssignment_1_2
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
    // InternalSlideOMatic.g:5059:1: rule__Code__Group_1__3 : rule__Code__Group_1__3__Impl rule__Code__Group_1__4 ;
    public final void rule__Code__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5063:1: ( rule__Code__Group_1__3__Impl rule__Code__Group_1__4 )
            // InternalSlideOMatic.g:5064:2: rule__Code__Group_1__3__Impl rule__Code__Group_1__4
            {
            pushFollow(FOLLOW_49);
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
    // InternalSlideOMatic.g:5071:1: rule__Code__Group_1__3__Impl : ( ( rule__Code__SrcAssignment_1_3 ) ) ;
    public final void rule__Code__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5075:1: ( ( ( rule__Code__SrcAssignment_1_3 ) ) )
            // InternalSlideOMatic.g:5076:1: ( ( rule__Code__SrcAssignment_1_3 ) )
            {
            // InternalSlideOMatic.g:5076:1: ( ( rule__Code__SrcAssignment_1_3 ) )
            // InternalSlideOMatic.g:5077:2: ( rule__Code__SrcAssignment_1_3 )
            {
             before(grammarAccess.getCodeAccess().getSrcAssignment_1_3()); 
            // InternalSlideOMatic.g:5078:2: ( rule__Code__SrcAssignment_1_3 )
            // InternalSlideOMatic.g:5078:3: rule__Code__SrcAssignment_1_3
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
    // InternalSlideOMatic.g:5086:1: rule__Code__Group_1__4 : rule__Code__Group_1__4__Impl rule__Code__Group_1__5 ;
    public final void rule__Code__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5090:1: ( rule__Code__Group_1__4__Impl rule__Code__Group_1__5 )
            // InternalSlideOMatic.g:5091:2: rule__Code__Group_1__4__Impl rule__Code__Group_1__5
            {
            pushFollow(FOLLOW_49);
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
    // InternalSlideOMatic.g:5098:1: rule__Code__Group_1__4__Impl : ( ( rule__Code__Group_1_4__0 )? ) ;
    public final void rule__Code__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5102:1: ( ( ( rule__Code__Group_1_4__0 )? ) )
            // InternalSlideOMatic.g:5103:1: ( ( rule__Code__Group_1_4__0 )? )
            {
            // InternalSlideOMatic.g:5103:1: ( ( rule__Code__Group_1_4__0 )? )
            // InternalSlideOMatic.g:5104:2: ( rule__Code__Group_1_4__0 )?
            {
             before(grammarAccess.getCodeAccess().getGroup_1_4()); 
            // InternalSlideOMatic.g:5105:2: ( rule__Code__Group_1_4__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==101) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalSlideOMatic.g:5105:3: rule__Code__Group_1_4__0
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
    // InternalSlideOMatic.g:5113:1: rule__Code__Group_1__5 : rule__Code__Group_1__5__Impl ;
    public final void rule__Code__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5117:1: ( rule__Code__Group_1__5__Impl )
            // InternalSlideOMatic.g:5118:2: rule__Code__Group_1__5__Impl
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
    // InternalSlideOMatic.g:5124:1: rule__Code__Group_1__5__Impl : ( 'end' ) ;
    public final void rule__Code__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5128:1: ( ( 'end' ) )
            // InternalSlideOMatic.g:5129:1: ( 'end' )
            {
            // InternalSlideOMatic.g:5129:1: ( 'end' )
            // InternalSlideOMatic.g:5130:2: 'end'
            {
             before(grammarAccess.getCodeAccess().getEndKeyword_1_5()); 
            match(input,99,FOLLOW_2); 
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
    // InternalSlideOMatic.g:5140:1: rule__Code__Group_1_4__0 : rule__Code__Group_1_4__0__Impl rule__Code__Group_1_4__1 ;
    public final void rule__Code__Group_1_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5144:1: ( rule__Code__Group_1_4__0__Impl rule__Code__Group_1_4__1 )
            // InternalSlideOMatic.g:5145:2: rule__Code__Group_1_4__0__Impl rule__Code__Group_1_4__1
            {
            pushFollow(FOLLOW_44);
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
    // InternalSlideOMatic.g:5152:1: rule__Code__Group_1_4__0__Impl : ( 'show' ) ;
    public final void rule__Code__Group_1_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5156:1: ( ( 'show' ) )
            // InternalSlideOMatic.g:5157:1: ( 'show' )
            {
            // InternalSlideOMatic.g:5157:1: ( 'show' )
            // InternalSlideOMatic.g:5158:2: 'show'
            {
             before(grammarAccess.getCodeAccess().getShowKeyword_1_4_0()); 
            match(input,101,FOLLOW_2); 
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
    // InternalSlideOMatic.g:5167:1: rule__Code__Group_1_4__1 : rule__Code__Group_1_4__1__Impl rule__Code__Group_1_4__2 ;
    public final void rule__Code__Group_1_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5171:1: ( rule__Code__Group_1_4__1__Impl rule__Code__Group_1_4__2 )
            // InternalSlideOMatic.g:5172:2: rule__Code__Group_1_4__1__Impl rule__Code__Group_1_4__2
            {
            pushFollow(FOLLOW_40);
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
    // InternalSlideOMatic.g:5179:1: rule__Code__Group_1_4__1__Impl : ( '[' ) ;
    public final void rule__Code__Group_1_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5183:1: ( ( '[' ) )
            // InternalSlideOMatic.g:5184:1: ( '[' )
            {
            // InternalSlideOMatic.g:5184:1: ( '[' )
            // InternalSlideOMatic.g:5185:2: '['
            {
             before(grammarAccess.getCodeAccess().getLeftSquareBracketKeyword_1_4_1()); 
            match(input,96,FOLLOW_2); 
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
    // InternalSlideOMatic.g:5194:1: rule__Code__Group_1_4__2 : rule__Code__Group_1_4__2__Impl rule__Code__Group_1_4__3 ;
    public final void rule__Code__Group_1_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5198:1: ( rule__Code__Group_1_4__2__Impl rule__Code__Group_1_4__3 )
            // InternalSlideOMatic.g:5199:2: rule__Code__Group_1_4__2__Impl rule__Code__Group_1_4__3
            {
            pushFollow(FOLLOW_50);
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
    // InternalSlideOMatic.g:5206:1: rule__Code__Group_1_4__2__Impl : ( ( rule__Code__LinesAssignment_1_4_2 ) ) ;
    public final void rule__Code__Group_1_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5210:1: ( ( ( rule__Code__LinesAssignment_1_4_2 ) ) )
            // InternalSlideOMatic.g:5211:1: ( ( rule__Code__LinesAssignment_1_4_2 ) )
            {
            // InternalSlideOMatic.g:5211:1: ( ( rule__Code__LinesAssignment_1_4_2 ) )
            // InternalSlideOMatic.g:5212:2: ( rule__Code__LinesAssignment_1_4_2 )
            {
             before(grammarAccess.getCodeAccess().getLinesAssignment_1_4_2()); 
            // InternalSlideOMatic.g:5213:2: ( rule__Code__LinesAssignment_1_4_2 )
            // InternalSlideOMatic.g:5213:3: rule__Code__LinesAssignment_1_4_2
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
    // InternalSlideOMatic.g:5221:1: rule__Code__Group_1_4__3 : rule__Code__Group_1_4__3__Impl rule__Code__Group_1_4__4 ;
    public final void rule__Code__Group_1_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5225:1: ( rule__Code__Group_1_4__3__Impl rule__Code__Group_1_4__4 )
            // InternalSlideOMatic.g:5226:2: rule__Code__Group_1_4__3__Impl rule__Code__Group_1_4__4
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
    // InternalSlideOMatic.g:5233:1: rule__Code__Group_1_4__3__Impl : ( ']' ) ;
    public final void rule__Code__Group_1_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5237:1: ( ( ']' ) )
            // InternalSlideOMatic.g:5238:1: ( ']' )
            {
            // InternalSlideOMatic.g:5238:1: ( ']' )
            // InternalSlideOMatic.g:5239:2: ']'
            {
             before(grammarAccess.getCodeAccess().getRightSquareBracketKeyword_1_4_3()); 
            match(input,97,FOLLOW_2); 
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
    // InternalSlideOMatic.g:5248:1: rule__Code__Group_1_4__4 : rule__Code__Group_1_4__4__Impl ;
    public final void rule__Code__Group_1_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5252:1: ( rule__Code__Group_1_4__4__Impl )
            // InternalSlideOMatic.g:5253:2: rule__Code__Group_1_4__4__Impl
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
    // InternalSlideOMatic.g:5259:1: rule__Code__Group_1_4__4__Impl : ( ( rule__Code__Group_1_4_4__0 )* ) ;
    public final void rule__Code__Group_1_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5263:1: ( ( ( rule__Code__Group_1_4_4__0 )* ) )
            // InternalSlideOMatic.g:5264:1: ( ( rule__Code__Group_1_4_4__0 )* )
            {
            // InternalSlideOMatic.g:5264:1: ( ( rule__Code__Group_1_4_4__0 )* )
            // InternalSlideOMatic.g:5265:2: ( rule__Code__Group_1_4_4__0 )*
            {
             before(grammarAccess.getCodeAccess().getGroup_1_4_4()); 
            // InternalSlideOMatic.g:5266:2: ( rule__Code__Group_1_4_4__0 )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==71) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalSlideOMatic.g:5266:3: rule__Code__Group_1_4_4__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Code__Group_1_4_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop44;
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
    // InternalSlideOMatic.g:5275:1: rule__Code__Group_1_4_4__0 : rule__Code__Group_1_4_4__0__Impl rule__Code__Group_1_4_4__1 ;
    public final void rule__Code__Group_1_4_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5279:1: ( rule__Code__Group_1_4_4__0__Impl rule__Code__Group_1_4_4__1 )
            // InternalSlideOMatic.g:5280:2: rule__Code__Group_1_4_4__0__Impl rule__Code__Group_1_4_4__1
            {
            pushFollow(FOLLOW_44);
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
    // InternalSlideOMatic.g:5287:1: rule__Code__Group_1_4_4__0__Impl : ( ',' ) ;
    public final void rule__Code__Group_1_4_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5291:1: ( ( ',' ) )
            // InternalSlideOMatic.g:5292:1: ( ',' )
            {
            // InternalSlideOMatic.g:5292:1: ( ',' )
            // InternalSlideOMatic.g:5293:2: ','
            {
             before(grammarAccess.getCodeAccess().getCommaKeyword_1_4_4_0()); 
            match(input,71,FOLLOW_2); 
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
    // InternalSlideOMatic.g:5302:1: rule__Code__Group_1_4_4__1 : rule__Code__Group_1_4_4__1__Impl rule__Code__Group_1_4_4__2 ;
    public final void rule__Code__Group_1_4_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5306:1: ( rule__Code__Group_1_4_4__1__Impl rule__Code__Group_1_4_4__2 )
            // InternalSlideOMatic.g:5307:2: rule__Code__Group_1_4_4__1__Impl rule__Code__Group_1_4_4__2
            {
            pushFollow(FOLLOW_40);
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
    // InternalSlideOMatic.g:5314:1: rule__Code__Group_1_4_4__1__Impl : ( '[' ) ;
    public final void rule__Code__Group_1_4_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5318:1: ( ( '[' ) )
            // InternalSlideOMatic.g:5319:1: ( '[' )
            {
            // InternalSlideOMatic.g:5319:1: ( '[' )
            // InternalSlideOMatic.g:5320:2: '['
            {
             before(grammarAccess.getCodeAccess().getLeftSquareBracketKeyword_1_4_4_1()); 
            match(input,96,FOLLOW_2); 
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
    // InternalSlideOMatic.g:5329:1: rule__Code__Group_1_4_4__2 : rule__Code__Group_1_4_4__2__Impl rule__Code__Group_1_4_4__3 ;
    public final void rule__Code__Group_1_4_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5333:1: ( rule__Code__Group_1_4_4__2__Impl rule__Code__Group_1_4_4__3 )
            // InternalSlideOMatic.g:5334:2: rule__Code__Group_1_4_4__2__Impl rule__Code__Group_1_4_4__3
            {
            pushFollow(FOLLOW_50);
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
    // InternalSlideOMatic.g:5341:1: rule__Code__Group_1_4_4__2__Impl : ( ( rule__Code__LinesAssignment_1_4_4_2 ) ) ;
    public final void rule__Code__Group_1_4_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5345:1: ( ( ( rule__Code__LinesAssignment_1_4_4_2 ) ) )
            // InternalSlideOMatic.g:5346:1: ( ( rule__Code__LinesAssignment_1_4_4_2 ) )
            {
            // InternalSlideOMatic.g:5346:1: ( ( rule__Code__LinesAssignment_1_4_4_2 ) )
            // InternalSlideOMatic.g:5347:2: ( rule__Code__LinesAssignment_1_4_4_2 )
            {
             before(grammarAccess.getCodeAccess().getLinesAssignment_1_4_4_2()); 
            // InternalSlideOMatic.g:5348:2: ( rule__Code__LinesAssignment_1_4_4_2 )
            // InternalSlideOMatic.g:5348:3: rule__Code__LinesAssignment_1_4_4_2
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
    // InternalSlideOMatic.g:5356:1: rule__Code__Group_1_4_4__3 : rule__Code__Group_1_4_4__3__Impl ;
    public final void rule__Code__Group_1_4_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5360:1: ( rule__Code__Group_1_4_4__3__Impl )
            // InternalSlideOMatic.g:5361:2: rule__Code__Group_1_4_4__3__Impl
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
    // InternalSlideOMatic.g:5367:1: rule__Code__Group_1_4_4__3__Impl : ( ']' ) ;
    public final void rule__Code__Group_1_4_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5371:1: ( ( ']' ) )
            // InternalSlideOMatic.g:5372:1: ( ']' )
            {
            // InternalSlideOMatic.g:5372:1: ( ']' )
            // InternalSlideOMatic.g:5373:2: ']'
            {
             before(grammarAccess.getCodeAccess().getRightSquareBracketKeyword_1_4_4_3()); 
            match(input,97,FOLLOW_2); 
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
    // InternalSlideOMatic.g:5383:1: rule__LineSequence__Group__0 : rule__LineSequence__Group__0__Impl rule__LineSequence__Group__1 ;
    public final void rule__LineSequence__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5387:1: ( rule__LineSequence__Group__0__Impl rule__LineSequence__Group__1 )
            // InternalSlideOMatic.g:5388:2: rule__LineSequence__Group__0__Impl rule__LineSequence__Group__1
            {
            pushFollow(FOLLOW_51);
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
    // InternalSlideOMatic.g:5395:1: rule__LineSequence__Group__0__Impl : ( ( rule__LineSequence__LowerAssignment_0 ) ) ;
    public final void rule__LineSequence__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5399:1: ( ( ( rule__LineSequence__LowerAssignment_0 ) ) )
            // InternalSlideOMatic.g:5400:1: ( ( rule__LineSequence__LowerAssignment_0 ) )
            {
            // InternalSlideOMatic.g:5400:1: ( ( rule__LineSequence__LowerAssignment_0 ) )
            // InternalSlideOMatic.g:5401:2: ( rule__LineSequence__LowerAssignment_0 )
            {
             before(grammarAccess.getLineSequenceAccess().getLowerAssignment_0()); 
            // InternalSlideOMatic.g:5402:2: ( rule__LineSequence__LowerAssignment_0 )
            // InternalSlideOMatic.g:5402:3: rule__LineSequence__LowerAssignment_0
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
    // InternalSlideOMatic.g:5410:1: rule__LineSequence__Group__1 : rule__LineSequence__Group__1__Impl rule__LineSequence__Group__2 ;
    public final void rule__LineSequence__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5414:1: ( rule__LineSequence__Group__1__Impl rule__LineSequence__Group__2 )
            // InternalSlideOMatic.g:5415:2: rule__LineSequence__Group__1__Impl rule__LineSequence__Group__2
            {
            pushFollow(FOLLOW_51);
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
    // InternalSlideOMatic.g:5422:1: rule__LineSequence__Group__1__Impl : ( ( rule__LineSequence__Group_1__0 )? ) ;
    public final void rule__LineSequence__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5426:1: ( ( ( rule__LineSequence__Group_1__0 )? ) )
            // InternalSlideOMatic.g:5427:1: ( ( rule__LineSequence__Group_1__0 )? )
            {
            // InternalSlideOMatic.g:5427:1: ( ( rule__LineSequence__Group_1__0 )? )
            // InternalSlideOMatic.g:5428:2: ( rule__LineSequence__Group_1__0 )?
            {
             before(grammarAccess.getLineSequenceAccess().getGroup_1()); 
            // InternalSlideOMatic.g:5429:2: ( rule__LineSequence__Group_1__0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==102) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalSlideOMatic.g:5429:3: rule__LineSequence__Group_1__0
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
    // InternalSlideOMatic.g:5437:1: rule__LineSequence__Group__2 : rule__LineSequence__Group__2__Impl ;
    public final void rule__LineSequence__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5441:1: ( rule__LineSequence__Group__2__Impl )
            // InternalSlideOMatic.g:5442:2: rule__LineSequence__Group__2__Impl
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
    // InternalSlideOMatic.g:5448:1: rule__LineSequence__Group__2__Impl : ( ( rule__LineSequence__Group_2__0 )? ) ;
    public final void rule__LineSequence__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5452:1: ( ( ( rule__LineSequence__Group_2__0 )? ) )
            // InternalSlideOMatic.g:5453:1: ( ( rule__LineSequence__Group_2__0 )? )
            {
            // InternalSlideOMatic.g:5453:1: ( ( rule__LineSequence__Group_2__0 )? )
            // InternalSlideOMatic.g:5454:2: ( rule__LineSequence__Group_2__0 )?
            {
             before(grammarAccess.getLineSequenceAccess().getGroup_2()); 
            // InternalSlideOMatic.g:5455:2: ( rule__LineSequence__Group_2__0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==71) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalSlideOMatic.g:5455:3: rule__LineSequence__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LineSequence__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

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
    // InternalSlideOMatic.g:5464:1: rule__LineSequence__Group_1__0 : rule__LineSequence__Group_1__0__Impl rule__LineSequence__Group_1__1 ;
    public final void rule__LineSequence__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5468:1: ( rule__LineSequence__Group_1__0__Impl rule__LineSequence__Group_1__1 )
            // InternalSlideOMatic.g:5469:2: rule__LineSequence__Group_1__0__Impl rule__LineSequence__Group_1__1
            {
            pushFollow(FOLLOW_40);
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
    // InternalSlideOMatic.g:5476:1: rule__LineSequence__Group_1__0__Impl : ( ':' ) ;
    public final void rule__LineSequence__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5480:1: ( ( ':' ) )
            // InternalSlideOMatic.g:5481:1: ( ':' )
            {
            // InternalSlideOMatic.g:5481:1: ( ':' )
            // InternalSlideOMatic.g:5482:2: ':'
            {
             before(grammarAccess.getLineSequenceAccess().getColonKeyword_1_0()); 
            match(input,102,FOLLOW_2); 
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
    // InternalSlideOMatic.g:5491:1: rule__LineSequence__Group_1__1 : rule__LineSequence__Group_1__1__Impl ;
    public final void rule__LineSequence__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5495:1: ( rule__LineSequence__Group_1__1__Impl )
            // InternalSlideOMatic.g:5496:2: rule__LineSequence__Group_1__1__Impl
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
    // InternalSlideOMatic.g:5502:1: rule__LineSequence__Group_1__1__Impl : ( ( rule__LineSequence__UpperAssignment_1_1 ) ) ;
    public final void rule__LineSequence__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5506:1: ( ( ( rule__LineSequence__UpperAssignment_1_1 ) ) )
            // InternalSlideOMatic.g:5507:1: ( ( rule__LineSequence__UpperAssignment_1_1 ) )
            {
            // InternalSlideOMatic.g:5507:1: ( ( rule__LineSequence__UpperAssignment_1_1 ) )
            // InternalSlideOMatic.g:5508:2: ( rule__LineSequence__UpperAssignment_1_1 )
            {
             before(grammarAccess.getLineSequenceAccess().getUpperAssignment_1_1()); 
            // InternalSlideOMatic.g:5509:2: ( rule__LineSequence__UpperAssignment_1_1 )
            // InternalSlideOMatic.g:5509:3: rule__LineSequence__UpperAssignment_1_1
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
    // InternalSlideOMatic.g:5518:1: rule__LineSequence__Group_2__0 : rule__LineSequence__Group_2__0__Impl rule__LineSequence__Group_2__1 ;
    public final void rule__LineSequence__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5522:1: ( rule__LineSequence__Group_2__0__Impl rule__LineSequence__Group_2__1 )
            // InternalSlideOMatic.g:5523:2: rule__LineSequence__Group_2__0__Impl rule__LineSequence__Group_2__1
            {
            pushFollow(FOLLOW_40);
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
    // InternalSlideOMatic.g:5530:1: rule__LineSequence__Group_2__0__Impl : ( ',' ) ;
    public final void rule__LineSequence__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5534:1: ( ( ',' ) )
            // InternalSlideOMatic.g:5535:1: ( ',' )
            {
            // InternalSlideOMatic.g:5535:1: ( ',' )
            // InternalSlideOMatic.g:5536:2: ','
            {
             before(grammarAccess.getLineSequenceAccess().getCommaKeyword_2_0()); 
            match(input,71,FOLLOW_2); 
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
    // InternalSlideOMatic.g:5545:1: rule__LineSequence__Group_2__1 : rule__LineSequence__Group_2__1__Impl ;
    public final void rule__LineSequence__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5549:1: ( rule__LineSequence__Group_2__1__Impl )
            // InternalSlideOMatic.g:5550:2: rule__LineSequence__Group_2__1__Impl
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
    // InternalSlideOMatic.g:5556:1: rule__LineSequence__Group_2__1__Impl : ( ( rule__LineSequence__AdditionalAssignment_2_1 ) ) ;
    public final void rule__LineSequence__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5560:1: ( ( ( rule__LineSequence__AdditionalAssignment_2_1 ) ) )
            // InternalSlideOMatic.g:5561:1: ( ( rule__LineSequence__AdditionalAssignment_2_1 ) )
            {
            // InternalSlideOMatic.g:5561:1: ( ( rule__LineSequence__AdditionalAssignment_2_1 ) )
            // InternalSlideOMatic.g:5562:2: ( rule__LineSequence__AdditionalAssignment_2_1 )
            {
             before(grammarAccess.getLineSequenceAccess().getAdditionalAssignment_2_1()); 
            // InternalSlideOMatic.g:5563:2: ( rule__LineSequence__AdditionalAssignment_2_1 )
            // InternalSlideOMatic.g:5563:3: rule__LineSequence__AdditionalAssignment_2_1
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
    // InternalSlideOMatic.g:5572:1: rule__Animation__Group__0 : rule__Animation__Group__0__Impl rule__Animation__Group__1 ;
    public final void rule__Animation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5576:1: ( rule__Animation__Group__0__Impl rule__Animation__Group__1 )
            // InternalSlideOMatic.g:5577:2: rule__Animation__Group__0__Impl rule__Animation__Group__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalSlideOMatic.g:5584:1: rule__Animation__Group__0__Impl : ( 'animate' ) ;
    public final void rule__Animation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5588:1: ( ( 'animate' ) )
            // InternalSlideOMatic.g:5589:1: ( 'animate' )
            {
            // InternalSlideOMatic.g:5589:1: ( 'animate' )
            // InternalSlideOMatic.g:5590:2: 'animate'
            {
             before(grammarAccess.getAnimationAccess().getAnimateKeyword_0()); 
            match(input,103,FOLLOW_2); 
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
    // InternalSlideOMatic.g:5599:1: rule__Animation__Group__1 : rule__Animation__Group__1__Impl rule__Animation__Group__2 ;
    public final void rule__Animation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5603:1: ( rule__Animation__Group__1__Impl rule__Animation__Group__2 )
            // InternalSlideOMatic.g:5604:2: rule__Animation__Group__1__Impl rule__Animation__Group__2
            {
            pushFollow(FOLLOW_52);
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
    // InternalSlideOMatic.g:5611:1: rule__Animation__Group__1__Impl : ( ( rule__Animation__TargetAssignment_1 ) ) ;
    public final void rule__Animation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5615:1: ( ( ( rule__Animation__TargetAssignment_1 ) ) )
            // InternalSlideOMatic.g:5616:1: ( ( rule__Animation__TargetAssignment_1 ) )
            {
            // InternalSlideOMatic.g:5616:1: ( ( rule__Animation__TargetAssignment_1 ) )
            // InternalSlideOMatic.g:5617:2: ( rule__Animation__TargetAssignment_1 )
            {
             before(grammarAccess.getAnimationAccess().getTargetAssignment_1()); 
            // InternalSlideOMatic.g:5618:2: ( rule__Animation__TargetAssignment_1 )
            // InternalSlideOMatic.g:5618:3: rule__Animation__TargetAssignment_1
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
    // InternalSlideOMatic.g:5626:1: rule__Animation__Group__2 : rule__Animation__Group__2__Impl rule__Animation__Group__3 ;
    public final void rule__Animation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5630:1: ( rule__Animation__Group__2__Impl rule__Animation__Group__3 )
            // InternalSlideOMatic.g:5631:2: rule__Animation__Group__2__Impl rule__Animation__Group__3
            {
            pushFollow(FOLLOW_38);
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
    // InternalSlideOMatic.g:5638:1: rule__Animation__Group__2__Impl : ( 'from' ) ;
    public final void rule__Animation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5642:1: ( ( 'from' ) )
            // InternalSlideOMatic.g:5643:1: ( 'from' )
            {
            // InternalSlideOMatic.g:5643:1: ( 'from' )
            // InternalSlideOMatic.g:5644:2: 'from'
            {
             before(grammarAccess.getAnimationAccess().getFromKeyword_2()); 
            match(input,104,FOLLOW_2); 
             after(grammarAccess.getAnimationAccess().getFromKeyword_2()); 

            }


            }

        }
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
    // InternalSlideOMatic.g:5653:1: rule__Animation__Group__3 : rule__Animation__Group__3__Impl rule__Animation__Group__4 ;
    public final void rule__Animation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5657:1: ( rule__Animation__Group__3__Impl rule__Animation__Group__4 )
            // InternalSlideOMatic.g:5658:2: rule__Animation__Group__3__Impl rule__Animation__Group__4
            {
            pushFollow(FOLLOW_53);
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
    // InternalSlideOMatic.g:5665:1: rule__Animation__Group__3__Impl : ( ( rule__Animation__FromLocationAssignment_3 ) ) ;
    public final void rule__Animation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5669:1: ( ( ( rule__Animation__FromLocationAssignment_3 ) ) )
            // InternalSlideOMatic.g:5670:1: ( ( rule__Animation__FromLocationAssignment_3 ) )
            {
            // InternalSlideOMatic.g:5670:1: ( ( rule__Animation__FromLocationAssignment_3 ) )
            // InternalSlideOMatic.g:5671:2: ( rule__Animation__FromLocationAssignment_3 )
            {
             before(grammarAccess.getAnimationAccess().getFromLocationAssignment_3()); 
            // InternalSlideOMatic.g:5672:2: ( rule__Animation__FromLocationAssignment_3 )
            // InternalSlideOMatic.g:5672:3: rule__Animation__FromLocationAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Animation__FromLocationAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAnimationAccess().getFromLocationAssignment_3()); 

            }


            }

        }
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
    // InternalSlideOMatic.g:5680:1: rule__Animation__Group__4 : rule__Animation__Group__4__Impl rule__Animation__Group__5 ;
    public final void rule__Animation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5684:1: ( rule__Animation__Group__4__Impl rule__Animation__Group__5 )
            // InternalSlideOMatic.g:5685:2: rule__Animation__Group__4__Impl rule__Animation__Group__5
            {
            pushFollow(FOLLOW_38);
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
    // InternalSlideOMatic.g:5692:1: rule__Animation__Group__4__Impl : ( 'to' ) ;
    public final void rule__Animation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5696:1: ( ( 'to' ) )
            // InternalSlideOMatic.g:5697:1: ( 'to' )
            {
            // InternalSlideOMatic.g:5697:1: ( 'to' )
            // InternalSlideOMatic.g:5698:2: 'to'
            {
             before(grammarAccess.getAnimationAccess().getToKeyword_4()); 
            match(input,105,FOLLOW_2); 
             after(grammarAccess.getAnimationAccess().getToKeyword_4()); 

            }


            }

        }
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
    // InternalSlideOMatic.g:5707:1: rule__Animation__Group__5 : rule__Animation__Group__5__Impl rule__Animation__Group__6 ;
    public final void rule__Animation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5711:1: ( rule__Animation__Group__5__Impl rule__Animation__Group__6 )
            // InternalSlideOMatic.g:5712:2: rule__Animation__Group__5__Impl rule__Animation__Group__6
            {
            pushFollow(FOLLOW_54);
            rule__Animation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Animation__Group__6();

            state._fsp--;


            }

        }
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
    // InternalSlideOMatic.g:5719:1: rule__Animation__Group__5__Impl : ( ( rule__Animation__FinalLocationAssignment_5 ) ) ;
    public final void rule__Animation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5723:1: ( ( ( rule__Animation__FinalLocationAssignment_5 ) ) )
            // InternalSlideOMatic.g:5724:1: ( ( rule__Animation__FinalLocationAssignment_5 ) )
            {
            // InternalSlideOMatic.g:5724:1: ( ( rule__Animation__FinalLocationAssignment_5 ) )
            // InternalSlideOMatic.g:5725:2: ( rule__Animation__FinalLocationAssignment_5 )
            {
             before(grammarAccess.getAnimationAccess().getFinalLocationAssignment_5()); 
            // InternalSlideOMatic.g:5726:2: ( rule__Animation__FinalLocationAssignment_5 )
            // InternalSlideOMatic.g:5726:3: rule__Animation__FinalLocationAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Animation__FinalLocationAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getAnimationAccess().getFinalLocationAssignment_5()); 

            }


            }

        }
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


    // $ANTLR start "rule__Animation__Group__6"
    // InternalSlideOMatic.g:5734:1: rule__Animation__Group__6 : rule__Animation__Group__6__Impl ;
    public final void rule__Animation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5738:1: ( rule__Animation__Group__6__Impl )
            // InternalSlideOMatic.g:5739:2: rule__Animation__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Animation__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Animation__Group__6"


    // $ANTLR start "rule__Animation__Group__6__Impl"
    // InternalSlideOMatic.g:5745:1: rule__Animation__Group__6__Impl : ( ( rule__Animation__Group_6__0 )? ) ;
    public final void rule__Animation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5749:1: ( ( ( rule__Animation__Group_6__0 )? ) )
            // InternalSlideOMatic.g:5750:1: ( ( rule__Animation__Group_6__0 )? )
            {
            // InternalSlideOMatic.g:5750:1: ( ( rule__Animation__Group_6__0 )? )
            // InternalSlideOMatic.g:5751:2: ( rule__Animation__Group_6__0 )?
            {
             before(grammarAccess.getAnimationAccess().getGroup_6()); 
            // InternalSlideOMatic.g:5752:2: ( rule__Animation__Group_6__0 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==106) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalSlideOMatic.g:5752:3: rule__Animation__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Animation__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAnimationAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Animation__Group__6__Impl"


    // $ANTLR start "rule__Animation__Group_6__0"
    // InternalSlideOMatic.g:5761:1: rule__Animation__Group_6__0 : rule__Animation__Group_6__0__Impl rule__Animation__Group_6__1 ;
    public final void rule__Animation__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5765:1: ( rule__Animation__Group_6__0__Impl rule__Animation__Group_6__1 )
            // InternalSlideOMatic.g:5766:2: rule__Animation__Group_6__0__Impl rule__Animation__Group_6__1
            {
            pushFollow(FOLLOW_38);
            rule__Animation__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Animation__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Animation__Group_6__0"


    // $ANTLR start "rule__Animation__Group_6__0__Impl"
    // InternalSlideOMatic.g:5773:1: rule__Animation__Group_6__0__Impl : ( 'via' ) ;
    public final void rule__Animation__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5777:1: ( ( 'via' ) )
            // InternalSlideOMatic.g:5778:1: ( 'via' )
            {
            // InternalSlideOMatic.g:5778:1: ( 'via' )
            // InternalSlideOMatic.g:5779:2: 'via'
            {
             before(grammarAccess.getAnimationAccess().getViaKeyword_6_0()); 
            match(input,106,FOLLOW_2); 
             after(grammarAccess.getAnimationAccess().getViaKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Animation__Group_6__0__Impl"


    // $ANTLR start "rule__Animation__Group_6__1"
    // InternalSlideOMatic.g:5788:1: rule__Animation__Group_6__1 : rule__Animation__Group_6__1__Impl ;
    public final void rule__Animation__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5792:1: ( rule__Animation__Group_6__1__Impl )
            // InternalSlideOMatic.g:5793:2: rule__Animation__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Animation__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Animation__Group_6__1"


    // $ANTLR start "rule__Animation__Group_6__1__Impl"
    // InternalSlideOMatic.g:5799:1: rule__Animation__Group_6__1__Impl : ( ( rule__Animation__ViaLocationAssignment_6_1 ) ) ;
    public final void rule__Animation__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5803:1: ( ( ( rule__Animation__ViaLocationAssignment_6_1 ) ) )
            // InternalSlideOMatic.g:5804:1: ( ( rule__Animation__ViaLocationAssignment_6_1 ) )
            {
            // InternalSlideOMatic.g:5804:1: ( ( rule__Animation__ViaLocationAssignment_6_1 ) )
            // InternalSlideOMatic.g:5805:2: ( rule__Animation__ViaLocationAssignment_6_1 )
            {
             before(grammarAccess.getAnimationAccess().getViaLocationAssignment_6_1()); 
            // InternalSlideOMatic.g:5806:2: ( rule__Animation__ViaLocationAssignment_6_1 )
            // InternalSlideOMatic.g:5806:3: rule__Animation__ViaLocationAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Animation__ViaLocationAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getAnimationAccess().getViaLocationAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Animation__Group_6__1__Impl"


    // $ANTLR start "rule__MathExp__Group__0"
    // InternalSlideOMatic.g:5815:1: rule__MathExp__Group__0 : rule__MathExp__Group__0__Impl rule__MathExp__Group__1 ;
    public final void rule__MathExp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5819:1: ( rule__MathExp__Group__0__Impl rule__MathExp__Group__1 )
            // InternalSlideOMatic.g:5820:2: rule__MathExp__Group__0__Impl rule__MathExp__Group__1
            {
            pushFollow(FOLLOW_55);
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
    // InternalSlideOMatic.g:5827:1: rule__MathExp__Group__0__Impl : ( 'math' ) ;
    public final void rule__MathExp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5831:1: ( ( 'math' ) )
            // InternalSlideOMatic.g:5832:1: ( 'math' )
            {
            // InternalSlideOMatic.g:5832:1: ( 'math' )
            // InternalSlideOMatic.g:5833:2: 'math'
            {
             before(grammarAccess.getMathExpAccess().getMathKeyword_0()); 
            match(input,107,FOLLOW_2); 
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
    // InternalSlideOMatic.g:5842:1: rule__MathExp__Group__1 : rule__MathExp__Group__1__Impl rule__MathExp__Group__2 ;
    public final void rule__MathExp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5846:1: ( rule__MathExp__Group__1__Impl rule__MathExp__Group__2 )
            // InternalSlideOMatic.g:5847:2: rule__MathExp__Group__1__Impl rule__MathExp__Group__2
            {
            pushFollow(FOLLOW_55);
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
    // InternalSlideOMatic.g:5854:1: rule__MathExp__Group__1__Impl : ( ( rule__MathExp__EvalAssignment_1 )? ) ;
    public final void rule__MathExp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5858:1: ( ( ( rule__MathExp__EvalAssignment_1 )? ) )
            // InternalSlideOMatic.g:5859:1: ( ( rule__MathExp__EvalAssignment_1 )? )
            {
            // InternalSlideOMatic.g:5859:1: ( ( rule__MathExp__EvalAssignment_1 )? )
            // InternalSlideOMatic.g:5860:2: ( rule__MathExp__EvalAssignment_1 )?
            {
             before(grammarAccess.getMathExpAccess().getEvalAssignment_1()); 
            // InternalSlideOMatic.g:5861:2: ( rule__MathExp__EvalAssignment_1 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==114) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalSlideOMatic.g:5861:3: rule__MathExp__EvalAssignment_1
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
    // InternalSlideOMatic.g:5869:1: rule__MathExp__Group__2 : rule__MathExp__Group__2__Impl ;
    public final void rule__MathExp__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5873:1: ( rule__MathExp__Group__2__Impl )
            // InternalSlideOMatic.g:5874:2: rule__MathExp__Group__2__Impl
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
    // InternalSlideOMatic.g:5880:1: rule__MathExp__Group__2__Impl : ( ( rule__MathExp__ExpAssignment_2 ) ) ;
    public final void rule__MathExp__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5884:1: ( ( ( rule__MathExp__ExpAssignment_2 ) ) )
            // InternalSlideOMatic.g:5885:1: ( ( rule__MathExp__ExpAssignment_2 ) )
            {
            // InternalSlideOMatic.g:5885:1: ( ( rule__MathExp__ExpAssignment_2 ) )
            // InternalSlideOMatic.g:5886:2: ( rule__MathExp__ExpAssignment_2 )
            {
             before(grammarAccess.getMathExpAccess().getExpAssignment_2()); 
            // InternalSlideOMatic.g:5887:2: ( rule__MathExp__ExpAssignment_2 )
            // InternalSlideOMatic.g:5887:3: rule__MathExp__ExpAssignment_2
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
    // InternalSlideOMatic.g:5896:1: rule__Exp__Group__0 : rule__Exp__Group__0__Impl rule__Exp__Group__1 ;
    public final void rule__Exp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5900:1: ( rule__Exp__Group__0__Impl rule__Exp__Group__1 )
            // InternalSlideOMatic.g:5901:2: rule__Exp__Group__0__Impl rule__Exp__Group__1
            {
            pushFollow(FOLLOW_56);
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
    // InternalSlideOMatic.g:5908:1: rule__Exp__Group__0__Impl : ( ruleFactor ) ;
    public final void rule__Exp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5912:1: ( ( ruleFactor ) )
            // InternalSlideOMatic.g:5913:1: ( ruleFactor )
            {
            // InternalSlideOMatic.g:5913:1: ( ruleFactor )
            // InternalSlideOMatic.g:5914:2: ruleFactor
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
    // InternalSlideOMatic.g:5923:1: rule__Exp__Group__1 : rule__Exp__Group__1__Impl ;
    public final void rule__Exp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5927:1: ( rule__Exp__Group__1__Impl )
            // InternalSlideOMatic.g:5928:2: rule__Exp__Group__1__Impl
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
    // InternalSlideOMatic.g:5934:1: rule__Exp__Group__1__Impl : ( ( rule__Exp__Group_1__0 )* ) ;
    public final void rule__Exp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5938:1: ( ( ( rule__Exp__Group_1__0 )* ) )
            // InternalSlideOMatic.g:5939:1: ( ( rule__Exp__Group_1__0 )* )
            {
            // InternalSlideOMatic.g:5939:1: ( ( rule__Exp__Group_1__0 )* )
            // InternalSlideOMatic.g:5940:2: ( rule__Exp__Group_1__0 )*
            {
             before(grammarAccess.getExpAccess().getGroup_1()); 
            // InternalSlideOMatic.g:5941:2: ( rule__Exp__Group_1__0 )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==87||LA49_0==108) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalSlideOMatic.g:5941:3: rule__Exp__Group_1__0
            	    {
            	    pushFollow(FOLLOW_57);
            	    rule__Exp__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop49;
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
    // InternalSlideOMatic.g:5950:1: rule__Exp__Group_1__0 : rule__Exp__Group_1__0__Impl rule__Exp__Group_1__1 ;
    public final void rule__Exp__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5954:1: ( rule__Exp__Group_1__0__Impl rule__Exp__Group_1__1 )
            // InternalSlideOMatic.g:5955:2: rule__Exp__Group_1__0__Impl rule__Exp__Group_1__1
            {
            pushFollow(FOLLOW_55);
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
    // InternalSlideOMatic.g:5962:1: rule__Exp__Group_1__0__Impl : ( ( rule__Exp__Alternatives_1_0 ) ) ;
    public final void rule__Exp__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5966:1: ( ( ( rule__Exp__Alternatives_1_0 ) ) )
            // InternalSlideOMatic.g:5967:1: ( ( rule__Exp__Alternatives_1_0 ) )
            {
            // InternalSlideOMatic.g:5967:1: ( ( rule__Exp__Alternatives_1_0 ) )
            // InternalSlideOMatic.g:5968:2: ( rule__Exp__Alternatives_1_0 )
            {
             before(grammarAccess.getExpAccess().getAlternatives_1_0()); 
            // InternalSlideOMatic.g:5969:2: ( rule__Exp__Alternatives_1_0 )
            // InternalSlideOMatic.g:5969:3: rule__Exp__Alternatives_1_0
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
    // InternalSlideOMatic.g:5977:1: rule__Exp__Group_1__1 : rule__Exp__Group_1__1__Impl ;
    public final void rule__Exp__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5981:1: ( rule__Exp__Group_1__1__Impl )
            // InternalSlideOMatic.g:5982:2: rule__Exp__Group_1__1__Impl
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
    // InternalSlideOMatic.g:5988:1: rule__Exp__Group_1__1__Impl : ( ( rule__Exp__RightAssignment_1_1 ) ) ;
    public final void rule__Exp__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:5992:1: ( ( ( rule__Exp__RightAssignment_1_1 ) ) )
            // InternalSlideOMatic.g:5993:1: ( ( rule__Exp__RightAssignment_1_1 ) )
            {
            // InternalSlideOMatic.g:5993:1: ( ( rule__Exp__RightAssignment_1_1 ) )
            // InternalSlideOMatic.g:5994:2: ( rule__Exp__RightAssignment_1_1 )
            {
             before(grammarAccess.getExpAccess().getRightAssignment_1_1()); 
            // InternalSlideOMatic.g:5995:2: ( rule__Exp__RightAssignment_1_1 )
            // InternalSlideOMatic.g:5995:3: rule__Exp__RightAssignment_1_1
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
    // InternalSlideOMatic.g:6004:1: rule__Exp__Group_1_0_0__0 : rule__Exp__Group_1_0_0__0__Impl rule__Exp__Group_1_0_0__1 ;
    public final void rule__Exp__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:6008:1: ( rule__Exp__Group_1_0_0__0__Impl rule__Exp__Group_1_0_0__1 )
            // InternalSlideOMatic.g:6009:2: rule__Exp__Group_1_0_0__0__Impl rule__Exp__Group_1_0_0__1
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
    // InternalSlideOMatic.g:6016:1: rule__Exp__Group_1_0_0__0__Impl : ( '+' ) ;
    public final void rule__Exp__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:6020:1: ( ( '+' ) )
            // InternalSlideOMatic.g:6021:1: ( '+' )
            {
            // InternalSlideOMatic.g:6021:1: ( '+' )
            // InternalSlideOMatic.g:6022:2: '+'
            {
             before(grammarAccess.getExpAccess().getPlusSignKeyword_1_0_0_0()); 
            match(input,108,FOLLOW_2); 
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
    // InternalSlideOMatic.g:6031:1: rule__Exp__Group_1_0_0__1 : rule__Exp__Group_1_0_0__1__Impl ;
    public final void rule__Exp__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:6035:1: ( rule__Exp__Group_1_0_0__1__Impl )
            // InternalSlideOMatic.g:6036:2: rule__Exp__Group_1_0_0__1__Impl
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
    // InternalSlideOMatic.g:6042:1: rule__Exp__Group_1_0_0__1__Impl : ( () ) ;
    public final void rule__Exp__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:6046:1: ( ( () ) )
            // InternalSlideOMatic.g:6047:1: ( () )
            {
            // InternalSlideOMatic.g:6047:1: ( () )
            // InternalSlideOMatic.g:6048:2: ()
            {
             before(grammarAccess.getExpAccess().getPlusLeftAction_1_0_0_1()); 
            // InternalSlideOMatic.g:6049:2: ()
            // InternalSlideOMatic.g:6049:3: 
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
    // InternalSlideOMatic.g:6058:1: rule__Exp__Group_1_0_1__0 : rule__Exp__Group_1_0_1__0__Impl rule__Exp__Group_1_0_1__1 ;
    public final void rule__Exp__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:6062:1: ( rule__Exp__Group_1_0_1__0__Impl rule__Exp__Group_1_0_1__1 )
            // InternalSlideOMatic.g:6063:2: rule__Exp__Group_1_0_1__0__Impl rule__Exp__Group_1_0_1__1
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
    // InternalSlideOMatic.g:6070:1: rule__Exp__Group_1_0_1__0__Impl : ( '-' ) ;
    public final void rule__Exp__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:6074:1: ( ( '-' ) )
            // InternalSlideOMatic.g:6075:1: ( '-' )
            {
            // InternalSlideOMatic.g:6075:1: ( '-' )
            // InternalSlideOMatic.g:6076:2: '-'
            {
             before(grammarAccess.getExpAccess().getHyphenMinusKeyword_1_0_1_0()); 
            match(input,87,FOLLOW_2); 
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
    // InternalSlideOMatic.g:6085:1: rule__Exp__Group_1_0_1__1 : rule__Exp__Group_1_0_1__1__Impl ;
    public final void rule__Exp__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:6089:1: ( rule__Exp__Group_1_0_1__1__Impl )
            // InternalSlideOMatic.g:6090:2: rule__Exp__Group_1_0_1__1__Impl
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
    // InternalSlideOMatic.g:6096:1: rule__Exp__Group_1_0_1__1__Impl : ( () ) ;
    public final void rule__Exp__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:6100:1: ( ( () ) )
            // InternalSlideOMatic.g:6101:1: ( () )
            {
            // InternalSlideOMatic.g:6101:1: ( () )
            // InternalSlideOMatic.g:6102:2: ()
            {
             before(grammarAccess.getExpAccess().getMinusLeftAction_1_0_1_1()); 
            // InternalSlideOMatic.g:6103:2: ()
            // InternalSlideOMatic.g:6103:3: 
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
    // InternalSlideOMatic.g:6112:1: rule__Factor__Group__0 : rule__Factor__Group__0__Impl rule__Factor__Group__1 ;
    public final void rule__Factor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:6116:1: ( rule__Factor__Group__0__Impl rule__Factor__Group__1 )
            // InternalSlideOMatic.g:6117:2: rule__Factor__Group__0__Impl rule__Factor__Group__1
            {
            pushFollow(FOLLOW_58);
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
    // InternalSlideOMatic.g:6124:1: rule__Factor__Group__0__Impl : ( rulePow ) ;
    public final void rule__Factor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:6128:1: ( ( rulePow ) )
            // InternalSlideOMatic.g:6129:1: ( rulePow )
            {
            // InternalSlideOMatic.g:6129:1: ( rulePow )
            // InternalSlideOMatic.g:6130:2: rulePow
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
    // InternalSlideOMatic.g:6139:1: rule__Factor__Group__1 : rule__Factor__Group__1__Impl ;
    public final void rule__Factor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:6143:1: ( rule__Factor__Group__1__Impl )
            // InternalSlideOMatic.g:6144:2: rule__Factor__Group__1__Impl
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
    // InternalSlideOMatic.g:6150:1: rule__Factor__Group__1__Impl : ( ( rule__Factor__Group_1__0 )* ) ;
    public final void rule__Factor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:6154:1: ( ( ( rule__Factor__Group_1__0 )* ) )
            // InternalSlideOMatic.g:6155:1: ( ( rule__Factor__Group_1__0 )* )
            {
            // InternalSlideOMatic.g:6155:1: ( ( rule__Factor__Group_1__0 )* )
            // InternalSlideOMatic.g:6156:2: ( rule__Factor__Group_1__0 )*
            {
             before(grammarAccess.getFactorAccess().getGroup_1()); 
            // InternalSlideOMatic.g:6157:2: ( rule__Factor__Group_1__0 )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==74||LA50_0==109) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalSlideOMatic.g:6157:3: rule__Factor__Group_1__0
            	    {
            	    pushFollow(FOLLOW_59);
            	    rule__Factor__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop50;
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
    // InternalSlideOMatic.g:6166:1: rule__Factor__Group_1__0 : rule__Factor__Group_1__0__Impl rule__Factor__Group_1__1 ;
    public final void rule__Factor__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:6170:1: ( rule__Factor__Group_1__0__Impl rule__Factor__Group_1__1 )
            // InternalSlideOMatic.g:6171:2: rule__Factor__Group_1__0__Impl rule__Factor__Group_1__1
            {
            pushFollow(FOLLOW_55);
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
    // InternalSlideOMatic.g:6178:1: rule__Factor__Group_1__0__Impl : ( ( rule__Factor__Alternatives_1_0 ) ) ;
    public final void rule__Factor__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:6182:1: ( ( ( rule__Factor__Alternatives_1_0 ) ) )
            // InternalSlideOMatic.g:6183:1: ( ( rule__Factor__Alternatives_1_0 ) )
            {
            // InternalSlideOMatic.g:6183:1: ( ( rule__Factor__Alternatives_1_0 ) )
            // InternalSlideOMatic.g:6184:2: ( rule__Factor__Alternatives_1_0 )
            {
             before(grammarAccess.getFactorAccess().getAlternatives_1_0()); 
            // InternalSlideOMatic.g:6185:2: ( rule__Factor__Alternatives_1_0 )
            // InternalSlideOMatic.g:6185:3: rule__Factor__Alternatives_1_0
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
    // InternalSlideOMatic.g:6193:1: rule__Factor__Group_1__1 : rule__Factor__Group_1__1__Impl ;
    public final void rule__Factor__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:6197:1: ( rule__Factor__Group_1__1__Impl )
            // InternalSlideOMatic.g:6198:2: rule__Factor__Group_1__1__Impl
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
    // InternalSlideOMatic.g:6204:1: rule__Factor__Group_1__1__Impl : ( ( rule__Factor__RightAssignment_1_1 ) ) ;
    public final void rule__Factor__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:6208:1: ( ( ( rule__Factor__RightAssignment_1_1 ) ) )
            // InternalSlideOMatic.g:6209:1: ( ( rule__Factor__RightAssignment_1_1 ) )
            {
            // InternalSlideOMatic.g:6209:1: ( ( rule__Factor__RightAssignment_1_1 ) )
            // InternalSlideOMatic.g:6210:2: ( rule__Factor__RightAssignment_1_1 )
            {
             before(grammarAccess.getFactorAccess().getRightAssignment_1_1()); 
            // InternalSlideOMatic.g:6211:2: ( rule__Factor__RightAssignment_1_1 )
            // InternalSlideOMatic.g:6211:3: rule__Factor__RightAssignment_1_1
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
    // InternalSlideOMatic.g:6220:1: rule__Factor__Group_1_0_0__0 : rule__Factor__Group_1_0_0__0__Impl rule__Factor__Group_1_0_0__1 ;
    public final void rule__Factor__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:6224:1: ( rule__Factor__Group_1_0_0__0__Impl rule__Factor__Group_1_0_0__1 )
            // InternalSlideOMatic.g:6225:2: rule__Factor__Group_1_0_0__0__Impl rule__Factor__Group_1_0_0__1
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
    // InternalSlideOMatic.g:6232:1: rule__Factor__Group_1_0_0__0__Impl : ( '*' ) ;
    public final void rule__Factor__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:6236:1: ( ( '*' ) )
            // InternalSlideOMatic.g:6237:1: ( '*' )
            {
            // InternalSlideOMatic.g:6237:1: ( '*' )
            // InternalSlideOMatic.g:6238:2: '*'
            {
             before(grammarAccess.getFactorAccess().getAsteriskKeyword_1_0_0_0()); 
            match(input,74,FOLLOW_2); 
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
    // InternalSlideOMatic.g:6247:1: rule__Factor__Group_1_0_0__1 : rule__Factor__Group_1_0_0__1__Impl ;
    public final void rule__Factor__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:6251:1: ( rule__Factor__Group_1_0_0__1__Impl )
            // InternalSlideOMatic.g:6252:2: rule__Factor__Group_1_0_0__1__Impl
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
    // InternalSlideOMatic.g:6258:1: rule__Factor__Group_1_0_0__1__Impl : ( () ) ;
    public final void rule__Factor__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:6262:1: ( ( () ) )
            // InternalSlideOMatic.g:6263:1: ( () )
            {
            // InternalSlideOMatic.g:6263:1: ( () )
            // InternalSlideOMatic.g:6264:2: ()
            {
             before(grammarAccess.getFactorAccess().getMultLeftAction_1_0_0_1()); 
            // InternalSlideOMatic.g:6265:2: ()
            // InternalSlideOMatic.g:6265:3: 
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
    // InternalSlideOMatic.g:6274:1: rule__Factor__Group_1_0_1__0 : rule__Factor__Group_1_0_1__0__Impl rule__Factor__Group_1_0_1__1 ;
    public final void rule__Factor__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:6278:1: ( rule__Factor__Group_1_0_1__0__Impl rule__Factor__Group_1_0_1__1 )
            // InternalSlideOMatic.g:6279:2: rule__Factor__Group_1_0_1__0__Impl rule__Factor__Group_1_0_1__1
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
    // InternalSlideOMatic.g:6286:1: rule__Factor__Group_1_0_1__0__Impl : ( '/' ) ;
    public final void rule__Factor__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:6290:1: ( ( '/' ) )
            // InternalSlideOMatic.g:6291:1: ( '/' )
            {
            // InternalSlideOMatic.g:6291:1: ( '/' )
            // InternalSlideOMatic.g:6292:2: '/'
            {
             before(grammarAccess.getFactorAccess().getSolidusKeyword_1_0_1_0()); 
            match(input,109,FOLLOW_2); 
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
    // InternalSlideOMatic.g:6301:1: rule__Factor__Group_1_0_1__1 : rule__Factor__Group_1_0_1__1__Impl ;
    public final void rule__Factor__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:6305:1: ( rule__Factor__Group_1_0_1__1__Impl )
            // InternalSlideOMatic.g:6306:2: rule__Factor__Group_1_0_1__1__Impl
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
    // InternalSlideOMatic.g:6312:1: rule__Factor__Group_1_0_1__1__Impl : ( () ) ;
    public final void rule__Factor__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:6316:1: ( ( () ) )
            // InternalSlideOMatic.g:6317:1: ( () )
            {
            // InternalSlideOMatic.g:6317:1: ( () )
            // InternalSlideOMatic.g:6318:2: ()
            {
             before(grammarAccess.getFactorAccess().getDivLeftAction_1_0_1_1()); 
            // InternalSlideOMatic.g:6319:2: ()
            // InternalSlideOMatic.g:6319:3: 
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
    // InternalSlideOMatic.g:6328:1: rule__Pow__Group__0 : rule__Pow__Group__0__Impl rule__Pow__Group__1 ;
    public final void rule__Pow__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:6332:1: ( rule__Pow__Group__0__Impl rule__Pow__Group__1 )
            // InternalSlideOMatic.g:6333:2: rule__Pow__Group__0__Impl rule__Pow__Group__1
            {
            pushFollow(FOLLOW_60);
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
    // InternalSlideOMatic.g:6340:1: rule__Pow__Group__0__Impl : ( rulePrimary ) ;
    public final void rule__Pow__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:6344:1: ( ( rulePrimary ) )
            // InternalSlideOMatic.g:6345:1: ( rulePrimary )
            {
            // InternalSlideOMatic.g:6345:1: ( rulePrimary )
            // InternalSlideOMatic.g:6346:2: rulePrimary
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
    // InternalSlideOMatic.g:6355:1: rule__Pow__Group__1 : rule__Pow__Group__1__Impl ;
    public final void rule__Pow__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:6359:1: ( rule__Pow__Group__1__Impl )
            // InternalSlideOMatic.g:6360:2: rule__Pow__Group__1__Impl
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
    // InternalSlideOMatic.g:6366:1: rule__Pow__Group__1__Impl : ( ( rule__Pow__Group_1__0 )? ) ;
    public final void rule__Pow__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:6370:1: ( ( ( rule__Pow__Group_1__0 )? ) )
            // InternalSlideOMatic.g:6371:1: ( ( rule__Pow__Group_1__0 )? )
            {
            // InternalSlideOMatic.g:6371:1: ( ( rule__Pow__Group_1__0 )? )
            // InternalSlideOMatic.g:6372:2: ( rule__Pow__Group_1__0 )?
            {
             before(grammarAccess.getPowAccess().getGroup_1()); 
            // InternalSlideOMatic.g:6373:2: ( rule__Pow__Group_1__0 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==110) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalSlideOMatic.g:6373:3: rule__Pow__Group_1__0
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
    // InternalSlideOMatic.g:6382:1: rule__Pow__Group_1__0 : rule__Pow__Group_1__0__Impl rule__Pow__Group_1__1 ;
    public final void rule__Pow__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:6386:1: ( rule__Pow__Group_1__0__Impl rule__Pow__Group_1__1 )
            // InternalSlideOMatic.g:6387:2: rule__Pow__Group_1__0__Impl rule__Pow__Group_1__1
            {
            pushFollow(FOLLOW_60);
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
    // InternalSlideOMatic.g:6394:1: rule__Pow__Group_1__0__Impl : ( () ) ;
    public final void rule__Pow__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:6398:1: ( ( () ) )
            // InternalSlideOMatic.g:6399:1: ( () )
            {
            // InternalSlideOMatic.g:6399:1: ( () )
            // InternalSlideOMatic.g:6400:2: ()
            {
             before(grammarAccess.getPowAccess().getPowLeftAction_1_0()); 
            // InternalSlideOMatic.g:6401:2: ()
            // InternalSlideOMatic.g:6401:3: 
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
    // InternalSlideOMatic.g:6409:1: rule__Pow__Group_1__1 : rule__Pow__Group_1__1__Impl rule__Pow__Group_1__2 ;
    public final void rule__Pow__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:6413:1: ( rule__Pow__Group_1__1__Impl rule__Pow__Group_1__2 )
            // InternalSlideOMatic.g:6414:2: rule__Pow__Group_1__1__Impl rule__Pow__Group_1__2
            {
            pushFollow(FOLLOW_55);
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
    // InternalSlideOMatic.g:6421:1: rule__Pow__Group_1__1__Impl : ( '^' ) ;
    public final void rule__Pow__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:6425:1: ( ( '^' ) )
            // InternalSlideOMatic.g:6426:1: ( '^' )
            {
            // InternalSlideOMatic.g:6426:1: ( '^' )
            // InternalSlideOMatic.g:6427:2: '^'
            {
             before(grammarAccess.getPowAccess().getCircumflexAccentKeyword_1_1()); 
            match(input,110,FOLLOW_2); 
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
    // InternalSlideOMatic.g:6436:1: rule__Pow__Group_1__2 : rule__Pow__Group_1__2__Impl ;
    public final void rule__Pow__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:6440:1: ( rule__Pow__Group_1__2__Impl )
            // InternalSlideOMatic.g:6441:2: rule__Pow__Group_1__2__Impl
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
    // InternalSlideOMatic.g:6447:1: rule__Pow__Group_1__2__Impl : ( ( rule__Pow__RightAssignment_1_2 ) ) ;
    public final void rule__Pow__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:6451:1: ( ( ( rule__Pow__RightAssignment_1_2 ) ) )
            // InternalSlideOMatic.g:6452:1: ( ( rule__Pow__RightAssignment_1_2 ) )
            {
            // InternalSlideOMatic.g:6452:1: ( ( rule__Pow__RightAssignment_1_2 ) )
            // InternalSlideOMatic.g:6453:2: ( rule__Pow__RightAssignment_1_2 )
            {
             before(grammarAccess.getPowAccess().getRightAssignment_1_2()); 
            // InternalSlideOMatic.g:6454:2: ( rule__Pow__RightAssignment_1_2 )
            // InternalSlideOMatic.g:6454:3: rule__Pow__RightAssignment_1_2
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
    // InternalSlideOMatic.g:6463:1: rule__VariableUse__Group__0 : rule__VariableUse__Group__0__Impl rule__VariableUse__Group__1 ;
    public final void rule__VariableUse__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:6467:1: ( rule__VariableUse__Group__0__Impl rule__VariableUse__Group__1 )
            // InternalSlideOMatic.g:6468:2: rule__VariableUse__Group__0__Impl rule__VariableUse__Group__1
            {
            pushFollow(FOLLOW_55);
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
    // InternalSlideOMatic.g:6475:1: rule__VariableUse__Group__0__Impl : ( () ) ;
    public final void rule__VariableUse__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:6479:1: ( ( () ) )
            // InternalSlideOMatic.g:6480:1: ( () )
            {
            // InternalSlideOMatic.g:6480:1: ( () )
            // InternalSlideOMatic.g:6481:2: ()
            {
             before(grammarAccess.getVariableUseAccess().getVarAction_0()); 
            // InternalSlideOMatic.g:6482:2: ()
            // InternalSlideOMatic.g:6482:3: 
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
    // InternalSlideOMatic.g:6490:1: rule__VariableUse__Group__1 : rule__VariableUse__Group__1__Impl ;
    public final void rule__VariableUse__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:6494:1: ( rule__VariableUse__Group__1__Impl )
            // InternalSlideOMatic.g:6495:2: rule__VariableUse__Group__1__Impl
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
    // InternalSlideOMatic.g:6501:1: rule__VariableUse__Group__1__Impl : ( ( rule__VariableUse__IdAssignment_1 ) ) ;
    public final void rule__VariableUse__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:6505:1: ( ( ( rule__VariableUse__IdAssignment_1 ) ) )
            // InternalSlideOMatic.g:6506:1: ( ( rule__VariableUse__IdAssignment_1 ) )
            {
            // InternalSlideOMatic.g:6506:1: ( ( rule__VariableUse__IdAssignment_1 ) )
            // InternalSlideOMatic.g:6507:2: ( rule__VariableUse__IdAssignment_1 )
            {
             before(grammarAccess.getVariableUseAccess().getIdAssignment_1()); 
            // InternalSlideOMatic.g:6508:2: ( rule__VariableUse__IdAssignment_1 )
            // InternalSlideOMatic.g:6508:3: rule__VariableUse__IdAssignment_1
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
    // InternalSlideOMatic.g:6517:1: rule__VariableBinding__Group__0 : rule__VariableBinding__Group__0__Impl rule__VariableBinding__Group__1 ;
    public final void rule__VariableBinding__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:6521:1: ( rule__VariableBinding__Group__0__Impl rule__VariableBinding__Group__1 )
            // InternalSlideOMatic.g:6522:2: rule__VariableBinding__Group__0__Impl rule__VariableBinding__Group__1
            {
            pushFollow(FOLLOW_61);
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
    // InternalSlideOMatic.g:6529:1: rule__VariableBinding__Group__0__Impl : ( () ) ;
    public final void rule__VariableBinding__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:6533:1: ( ( () ) )
            // InternalSlideOMatic.g:6534:1: ( () )
            {
            // InternalSlideOMatic.g:6534:1: ( () )
            // InternalSlideOMatic.g:6535:2: ()
            {
             before(grammarAccess.getVariableBindingAccess().getLetAction_0()); 
            // InternalSlideOMatic.g:6536:2: ()
            // InternalSlideOMatic.g:6536:3: 
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
    // InternalSlideOMatic.g:6544:1: rule__VariableBinding__Group__1 : rule__VariableBinding__Group__1__Impl rule__VariableBinding__Group__2 ;
    public final void rule__VariableBinding__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:6548:1: ( rule__VariableBinding__Group__1__Impl rule__VariableBinding__Group__2 )
            // InternalSlideOMatic.g:6549:2: rule__VariableBinding__Group__1__Impl rule__VariableBinding__Group__2
            {
            pushFollow(FOLLOW_35);
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
    // InternalSlideOMatic.g:6556:1: rule__VariableBinding__Group__1__Impl : ( 'let' ) ;
    public final void rule__VariableBinding__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:6560:1: ( ( 'let' ) )
            // InternalSlideOMatic.g:6561:1: ( 'let' )
            {
            // InternalSlideOMatic.g:6561:1: ( 'let' )
            // InternalSlideOMatic.g:6562:2: 'let'
            {
             before(grammarAccess.getVariableBindingAccess().getLetKeyword_1()); 
            match(input,111,FOLLOW_2); 
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
    // InternalSlideOMatic.g:6571:1: rule__VariableBinding__Group__2 : rule__VariableBinding__Group__2__Impl rule__VariableBinding__Group__3 ;
    public final void rule__VariableBinding__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:6575:1: ( rule__VariableBinding__Group__2__Impl rule__VariableBinding__Group__3 )
            // InternalSlideOMatic.g:6576:2: rule__VariableBinding__Group__2__Impl rule__VariableBinding__Group__3
            {
            pushFollow(FOLLOW_62);
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
    // InternalSlideOMatic.g:6583:1: rule__VariableBinding__Group__2__Impl : ( ( rule__VariableBinding__IdAssignment_2 ) ) ;
    public final void rule__VariableBinding__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:6587:1: ( ( ( rule__VariableBinding__IdAssignment_2 ) ) )
            // InternalSlideOMatic.g:6588:1: ( ( rule__VariableBinding__IdAssignment_2 ) )
            {
            // InternalSlideOMatic.g:6588:1: ( ( rule__VariableBinding__IdAssignment_2 ) )
            // InternalSlideOMatic.g:6589:2: ( rule__VariableBinding__IdAssignment_2 )
            {
             before(grammarAccess.getVariableBindingAccess().getIdAssignment_2()); 
            // InternalSlideOMatic.g:6590:2: ( rule__VariableBinding__IdAssignment_2 )
            // InternalSlideOMatic.g:6590:3: rule__VariableBinding__IdAssignment_2
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
    // InternalSlideOMatic.g:6598:1: rule__VariableBinding__Group__3 : rule__VariableBinding__Group__3__Impl rule__VariableBinding__Group__4 ;
    public final void rule__VariableBinding__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:6602:1: ( rule__VariableBinding__Group__3__Impl rule__VariableBinding__Group__4 )
            // InternalSlideOMatic.g:6603:2: rule__VariableBinding__Group__3__Impl rule__VariableBinding__Group__4
            {
            pushFollow(FOLLOW_55);
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
    // InternalSlideOMatic.g:6610:1: rule__VariableBinding__Group__3__Impl : ( '=' ) ;
    public final void rule__VariableBinding__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:6614:1: ( ( '=' ) )
            // InternalSlideOMatic.g:6615:1: ( '=' )
            {
            // InternalSlideOMatic.g:6615:1: ( '=' )
            // InternalSlideOMatic.g:6616:2: '='
            {
             before(grammarAccess.getVariableBindingAccess().getEqualsSignKeyword_3()); 
            match(input,112,FOLLOW_2); 
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
    // InternalSlideOMatic.g:6625:1: rule__VariableBinding__Group__4 : rule__VariableBinding__Group__4__Impl rule__VariableBinding__Group__5 ;
    public final void rule__VariableBinding__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:6629:1: ( rule__VariableBinding__Group__4__Impl rule__VariableBinding__Group__5 )
            // InternalSlideOMatic.g:6630:2: rule__VariableBinding__Group__4__Impl rule__VariableBinding__Group__5
            {
            pushFollow(FOLLOW_63);
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
    // InternalSlideOMatic.g:6637:1: rule__VariableBinding__Group__4__Impl : ( ( rule__VariableBinding__BindingAssignment_4 ) ) ;
    public final void rule__VariableBinding__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:6641:1: ( ( ( rule__VariableBinding__BindingAssignment_4 ) ) )
            // InternalSlideOMatic.g:6642:1: ( ( rule__VariableBinding__BindingAssignment_4 ) )
            {
            // InternalSlideOMatic.g:6642:1: ( ( rule__VariableBinding__BindingAssignment_4 ) )
            // InternalSlideOMatic.g:6643:2: ( rule__VariableBinding__BindingAssignment_4 )
            {
             before(grammarAccess.getVariableBindingAccess().getBindingAssignment_4()); 
            // InternalSlideOMatic.g:6644:2: ( rule__VariableBinding__BindingAssignment_4 )
            // InternalSlideOMatic.g:6644:3: rule__VariableBinding__BindingAssignment_4
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
    // InternalSlideOMatic.g:6652:1: rule__VariableBinding__Group__5 : rule__VariableBinding__Group__5__Impl rule__VariableBinding__Group__6 ;
    public final void rule__VariableBinding__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:6656:1: ( rule__VariableBinding__Group__5__Impl rule__VariableBinding__Group__6 )
            // InternalSlideOMatic.g:6657:2: rule__VariableBinding__Group__5__Impl rule__VariableBinding__Group__6
            {
            pushFollow(FOLLOW_55);
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
    // InternalSlideOMatic.g:6664:1: rule__VariableBinding__Group__5__Impl : ( 'in' ) ;
    public final void rule__VariableBinding__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:6668:1: ( ( 'in' ) )
            // InternalSlideOMatic.g:6669:1: ( 'in' )
            {
            // InternalSlideOMatic.g:6669:1: ( 'in' )
            // InternalSlideOMatic.g:6670:2: 'in'
            {
             before(grammarAccess.getVariableBindingAccess().getInKeyword_5()); 
            match(input,113,FOLLOW_2); 
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
    // InternalSlideOMatic.g:6679:1: rule__VariableBinding__Group__6 : rule__VariableBinding__Group__6__Impl rule__VariableBinding__Group__7 ;
    public final void rule__VariableBinding__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:6683:1: ( rule__VariableBinding__Group__6__Impl rule__VariableBinding__Group__7 )
            // InternalSlideOMatic.g:6684:2: rule__VariableBinding__Group__6__Impl rule__VariableBinding__Group__7
            {
            pushFollow(FOLLOW_47);
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
    // InternalSlideOMatic.g:6691:1: rule__VariableBinding__Group__6__Impl : ( ( rule__VariableBinding__BodyAssignment_6 ) ) ;
    public final void rule__VariableBinding__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:6695:1: ( ( ( rule__VariableBinding__BodyAssignment_6 ) ) )
            // InternalSlideOMatic.g:6696:1: ( ( rule__VariableBinding__BodyAssignment_6 ) )
            {
            // InternalSlideOMatic.g:6696:1: ( ( rule__VariableBinding__BodyAssignment_6 ) )
            // InternalSlideOMatic.g:6697:2: ( rule__VariableBinding__BodyAssignment_6 )
            {
             before(grammarAccess.getVariableBindingAccess().getBodyAssignment_6()); 
            // InternalSlideOMatic.g:6698:2: ( rule__VariableBinding__BodyAssignment_6 )
            // InternalSlideOMatic.g:6698:3: rule__VariableBinding__BodyAssignment_6
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
    // InternalSlideOMatic.g:6706:1: rule__VariableBinding__Group__7 : rule__VariableBinding__Group__7__Impl ;
    public final void rule__VariableBinding__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:6710:1: ( rule__VariableBinding__Group__7__Impl )
            // InternalSlideOMatic.g:6711:2: rule__VariableBinding__Group__7__Impl
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
    // InternalSlideOMatic.g:6717:1: rule__VariableBinding__Group__7__Impl : ( 'end' ) ;
    public final void rule__VariableBinding__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:6721:1: ( ( 'end' ) )
            // InternalSlideOMatic.g:6722:1: ( 'end' )
            {
            // InternalSlideOMatic.g:6722:1: ( 'end' )
            // InternalSlideOMatic.g:6723:2: 'end'
            {
             before(grammarAccess.getVariableBindingAccess().getEndKeyword_7()); 
            match(input,99,FOLLOW_2); 
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
    // InternalSlideOMatic.g:6733:1: rule__Parenthesis__Group__0 : rule__Parenthesis__Group__0__Impl rule__Parenthesis__Group__1 ;
    public final void rule__Parenthesis__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:6737:1: ( rule__Parenthesis__Group__0__Impl rule__Parenthesis__Group__1 )
            // InternalSlideOMatic.g:6738:2: rule__Parenthesis__Group__0__Impl rule__Parenthesis__Group__1
            {
            pushFollow(FOLLOW_55);
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
    // InternalSlideOMatic.g:6745:1: rule__Parenthesis__Group__0__Impl : ( '(' ) ;
    public final void rule__Parenthesis__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:6749:1: ( ( '(' ) )
            // InternalSlideOMatic.g:6750:1: ( '(' )
            {
            // InternalSlideOMatic.g:6750:1: ( '(' )
            // InternalSlideOMatic.g:6751:2: '('
            {
             before(grammarAccess.getParenthesisAccess().getLeftParenthesisKeyword_0()); 
            match(input,67,FOLLOW_2); 
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
    // InternalSlideOMatic.g:6760:1: rule__Parenthesis__Group__1 : rule__Parenthesis__Group__1__Impl rule__Parenthesis__Group__2 ;
    public final void rule__Parenthesis__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:6764:1: ( rule__Parenthesis__Group__1__Impl rule__Parenthesis__Group__2 )
            // InternalSlideOMatic.g:6765:2: rule__Parenthesis__Group__1__Impl rule__Parenthesis__Group__2
            {
            pushFollow(FOLLOW_34);
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
    // InternalSlideOMatic.g:6772:1: rule__Parenthesis__Group__1__Impl : ( ruleExp ) ;
    public final void rule__Parenthesis__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:6776:1: ( ( ruleExp ) )
            // InternalSlideOMatic.g:6777:1: ( ruleExp )
            {
            // InternalSlideOMatic.g:6777:1: ( ruleExp )
            // InternalSlideOMatic.g:6778:2: ruleExp
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
    // InternalSlideOMatic.g:6787:1: rule__Parenthesis__Group__2 : rule__Parenthesis__Group__2__Impl ;
    public final void rule__Parenthesis__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:6791:1: ( rule__Parenthesis__Group__2__Impl )
            // InternalSlideOMatic.g:6792:2: rule__Parenthesis__Group__2__Impl
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
    // InternalSlideOMatic.g:6798:1: rule__Parenthesis__Group__2__Impl : ( ')' ) ;
    public final void rule__Parenthesis__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:6802:1: ( ( ')' ) )
            // InternalSlideOMatic.g:6803:1: ( ')' )
            {
            // InternalSlideOMatic.g:6803:1: ( ')' )
            // InternalSlideOMatic.g:6804:2: ')'
            {
             before(grammarAccess.getParenthesisAccess().getRightParenthesisKeyword_2()); 
            match(input,68,FOLLOW_2); 
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
    // InternalSlideOMatic.g:6814:1: rule__Number__Group__0 : rule__Number__Group__0__Impl rule__Number__Group__1 ;
    public final void rule__Number__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:6818:1: ( rule__Number__Group__0__Impl rule__Number__Group__1 )
            // InternalSlideOMatic.g:6819:2: rule__Number__Group__0__Impl rule__Number__Group__1
            {
            pushFollow(FOLLOW_40);
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
    // InternalSlideOMatic.g:6826:1: rule__Number__Group__0__Impl : ( () ) ;
    public final void rule__Number__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:6830:1: ( ( () ) )
            // InternalSlideOMatic.g:6831:1: ( () )
            {
            // InternalSlideOMatic.g:6831:1: ( () )
            // InternalSlideOMatic.g:6832:2: ()
            {
             before(grammarAccess.getNumberAccess().getNumAction_0()); 
            // InternalSlideOMatic.g:6833:2: ()
            // InternalSlideOMatic.g:6833:3: 
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
    // InternalSlideOMatic.g:6841:1: rule__Number__Group__1 : rule__Number__Group__1__Impl ;
    public final void rule__Number__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:6845:1: ( rule__Number__Group__1__Impl )
            // InternalSlideOMatic.g:6846:2: rule__Number__Group__1__Impl
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
    // InternalSlideOMatic.g:6852:1: rule__Number__Group__1__Impl : ( ( rule__Number__ValueAssignment_1 ) ) ;
    public final void rule__Number__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:6856:1: ( ( ( rule__Number__ValueAssignment_1 ) ) )
            // InternalSlideOMatic.g:6857:1: ( ( rule__Number__ValueAssignment_1 ) )
            {
            // InternalSlideOMatic.g:6857:1: ( ( rule__Number__ValueAssignment_1 ) )
            // InternalSlideOMatic.g:6858:2: ( rule__Number__ValueAssignment_1 )
            {
             before(grammarAccess.getNumberAccess().getValueAssignment_1()); 
            // InternalSlideOMatic.g:6859:2: ( rule__Number__ValueAssignment_1 )
            // InternalSlideOMatic.g:6859:3: rule__Number__ValueAssignment_1
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
    // InternalSlideOMatic.g:6868:1: rule__Presentation__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Presentation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:6872:1: ( ( RULE_STRING ) )
            // InternalSlideOMatic.g:6873:2: ( RULE_STRING )
            {
            // InternalSlideOMatic.g:6873:2: ( RULE_STRING )
            // InternalSlideOMatic.g:6874:3: RULE_STRING
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
    // InternalSlideOMatic.g:6883:1: rule__Presentation__SubtitleAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Presentation__SubtitleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:6887:1: ( ( RULE_STRING ) )
            // InternalSlideOMatic.g:6888:2: ( RULE_STRING )
            {
            // InternalSlideOMatic.g:6888:2: ( RULE_STRING )
            // InternalSlideOMatic.g:6889:3: RULE_STRING
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
    // InternalSlideOMatic.g:6898:1: rule__Presentation__ThemeAssignment_4_1 : ( ruleTheme ) ;
    public final void rule__Presentation__ThemeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:6902:1: ( ( ruleTheme ) )
            // InternalSlideOMatic.g:6903:2: ( ruleTheme )
            {
            // InternalSlideOMatic.g:6903:2: ( ruleTheme )
            // InternalSlideOMatic.g:6904:3: ruleTheme
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
    // InternalSlideOMatic.g:6913:1: rule__Presentation__AuthorsAssignment_4_2 : ( ruleAuthors ) ;
    public final void rule__Presentation__AuthorsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:6917:1: ( ( ruleAuthors ) )
            // InternalSlideOMatic.g:6918:2: ( ruleAuthors )
            {
            // InternalSlideOMatic.g:6918:2: ( ruleAuthors )
            // InternalSlideOMatic.g:6919:3: ruleAuthors
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
    // InternalSlideOMatic.g:6928:1: rule__Presentation__InstituteAssignment_4_3 : ( ruleInstitute ) ;
    public final void rule__Presentation__InstituteAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:6932:1: ( ( ruleInstitute ) )
            // InternalSlideOMatic.g:6933:2: ( ruleInstitute )
            {
            // InternalSlideOMatic.g:6933:2: ( ruleInstitute )
            // InternalSlideOMatic.g:6934:3: ruleInstitute
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
    // InternalSlideOMatic.g:6943:1: rule__Presentation__DateAssignment_4_4 : ( ruleDate ) ;
    public final void rule__Presentation__DateAssignment_4_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:6947:1: ( ( ruleDate ) )
            // InternalSlideOMatic.g:6948:2: ( ruleDate )
            {
            // InternalSlideOMatic.g:6948:2: ( ruleDate )
            // InternalSlideOMatic.g:6949:3: ruleDate
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
    // InternalSlideOMatic.g:6958:1: rule__Presentation__SlidesAssignment_5_0 : ( ruleSlide ) ;
    public final void rule__Presentation__SlidesAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:6962:1: ( ( ruleSlide ) )
            // InternalSlideOMatic.g:6963:2: ( ruleSlide )
            {
            // InternalSlideOMatic.g:6963:2: ( ruleSlide )
            // InternalSlideOMatic.g:6964:3: ruleSlide
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


    // $ANTLR start "rule__Presentation__ImagesAssignment_5_1"
    // InternalSlideOMatic.g:6973:1: rule__Presentation__ImagesAssignment_5_1 : ( ruleImage ) ;
    public final void rule__Presentation__ImagesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:6977:1: ( ( ruleImage ) )
            // InternalSlideOMatic.g:6978:2: ( ruleImage )
            {
            // InternalSlideOMatic.g:6978:2: ( ruleImage )
            // InternalSlideOMatic.g:6979:3: ruleImage
            {
             before(grammarAccess.getPresentationAccess().getImagesImageParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleImage();

            state._fsp--;

             after(grammarAccess.getPresentationAccess().getImagesImageParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Presentation__ImagesAssignment_5_1"


    // $ANTLR start "rule__Theme__ThemeAssignment_1"
    // InternalSlideOMatic.g:6988:1: rule__Theme__ThemeAssignment_1 : ( ruleBeamerTheme ) ;
    public final void rule__Theme__ThemeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:6992:1: ( ( ruleBeamerTheme ) )
            // InternalSlideOMatic.g:6993:2: ( ruleBeamerTheme )
            {
            // InternalSlideOMatic.g:6993:2: ( ruleBeamerTheme )
            // InternalSlideOMatic.g:6994:3: ruleBeamerTheme
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
    // InternalSlideOMatic.g:7003:1: rule__Theme__ThemeColorAssignment_2_1 : ( ruleThemeColor ) ;
    public final void rule__Theme__ThemeColorAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:7007:1: ( ( ruleThemeColor ) )
            // InternalSlideOMatic.g:7008:2: ( ruleThemeColor )
            {
            // InternalSlideOMatic.g:7008:2: ( ruleThemeColor )
            // InternalSlideOMatic.g:7009:3: ruleThemeColor
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
    // InternalSlideOMatic.g:7018:1: rule__Authors__NamesAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Authors__NamesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:7022:1: ( ( RULE_STRING ) )
            // InternalSlideOMatic.g:7023:2: ( RULE_STRING )
            {
            // InternalSlideOMatic.g:7023:2: ( RULE_STRING )
            // InternalSlideOMatic.g:7024:3: RULE_STRING
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
    // InternalSlideOMatic.g:7033:1: rule__Authors__NamesAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__Authors__NamesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:7037:1: ( ( RULE_STRING ) )
            // InternalSlideOMatic.g:7038:2: ( RULE_STRING )
            {
            // InternalSlideOMatic.g:7038:2: ( RULE_STRING )
            // InternalSlideOMatic.g:7039:3: RULE_STRING
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
    // InternalSlideOMatic.g:7048:1: rule__Institute__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Institute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:7052:1: ( ( RULE_STRING ) )
            // InternalSlideOMatic.g:7053:2: ( RULE_STRING )
            {
            // InternalSlideOMatic.g:7053:2: ( RULE_STRING )
            // InternalSlideOMatic.g:7054:3: RULE_STRING
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
    // InternalSlideOMatic.g:7063:1: rule__Date__DateAssignment_1_0 : ( RULE_STRING ) ;
    public final void rule__Date__DateAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:7067:1: ( ( RULE_STRING ) )
            // InternalSlideOMatic.g:7068:2: ( RULE_STRING )
            {
            // InternalSlideOMatic.g:7068:2: ( RULE_STRING )
            // InternalSlideOMatic.g:7069:3: RULE_STRING
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
    // InternalSlideOMatic.g:7078:1: rule__Slide__SecAssignment_1_0_0 : ( ruleSection ) ;
    public final void rule__Slide__SecAssignment_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:7082:1: ( ( ruleSection ) )
            // InternalSlideOMatic.g:7083:2: ( ruleSection )
            {
            // InternalSlideOMatic.g:7083:2: ( ruleSection )
            // InternalSlideOMatic.g:7084:3: ruleSection
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
    // InternalSlideOMatic.g:7093:1: rule__Slide__NameAssignment_1_0_1 : ( RULE_STRING ) ;
    public final void rule__Slide__NameAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:7097:1: ( ( RULE_STRING ) )
            // InternalSlideOMatic.g:7098:2: ( RULE_STRING )
            {
            // InternalSlideOMatic.g:7098:2: ( RULE_STRING )
            // InternalSlideOMatic.g:7099:3: RULE_STRING
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
    // InternalSlideOMatic.g:7108:1: rule__Slide__NameAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__Slide__NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:7112:1: ( ( RULE_STRING ) )
            // InternalSlideOMatic.g:7113:2: ( RULE_STRING )
            {
            // InternalSlideOMatic.g:7113:2: ( RULE_STRING )
            // InternalSlideOMatic.g:7114:3: RULE_STRING
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
    // InternalSlideOMatic.g:7123:1: rule__Slide__ContentsAssignment_3 : ( ruleContent ) ;
    public final void rule__Slide__ContentsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:7127:1: ( ( ruleContent ) )
            // InternalSlideOMatic.g:7128:2: ( ruleContent )
            {
            // InternalSlideOMatic.g:7128:2: ( ruleContent )
            // InternalSlideOMatic.g:7129:3: ruleContent
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
    // InternalSlideOMatic.g:7138:1: rule__Content__ClickAssignment_1 : ( ruleClick ) ;
    public final void rule__Content__ClickAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:7142:1: ( ( ruleClick ) )
            // InternalSlideOMatic.g:7143:2: ( ruleClick )
            {
            // InternalSlideOMatic.g:7143:2: ( ruleClick )
            // InternalSlideOMatic.g:7144:3: ruleClick
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


    // $ANTLR start "rule__Text__TypesAssignment_0"
    // InternalSlideOMatic.g:7153:1: rule__Text__TypesAssignment_0 : ( ruleTextType ) ;
    public final void rule__Text__TypesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:7157:1: ( ( ruleTextType ) )
            // InternalSlideOMatic.g:7158:2: ( ruleTextType )
            {
            // InternalSlideOMatic.g:7158:2: ( ruleTextType )
            // InternalSlideOMatic.g:7159:3: ruleTextType
            {
             before(grammarAccess.getTextAccess().getTypesTextTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTextType();

            state._fsp--;

             after(grammarAccess.getTextAccess().getTypesTextTypeParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__TypesAssignment_0"


    // $ANTLR start "rule__Text__TextAssignment_1"
    // InternalSlideOMatic.g:7168:1: rule__Text__TextAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Text__TextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:7172:1: ( ( RULE_STRING ) )
            // InternalSlideOMatic.g:7173:2: ( RULE_STRING )
            {
            // InternalSlideOMatic.g:7173:2: ( RULE_STRING )
            // InternalSlideOMatic.g:7174:3: RULE_STRING
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


    // $ANTLR start "rule__Block__NameAssignment_1"
    // InternalSlideOMatic.g:7183:1: rule__Block__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Block__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:7187:1: ( ( RULE_STRING ) )
            // InternalSlideOMatic.g:7188:2: ( RULE_STRING )
            {
            // InternalSlideOMatic.g:7188:2: ( RULE_STRING )
            // InternalSlideOMatic.g:7189:3: RULE_STRING
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
    // InternalSlideOMatic.g:7198:1: rule__Block__ContentAssignment_3 : ( ruleContent ) ;
    public final void rule__Block__ContentAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:7202:1: ( ( ruleContent ) )
            // InternalSlideOMatic.g:7203:2: ( ruleContent )
            {
            // InternalSlideOMatic.g:7203:2: ( ruleContent )
            // InternalSlideOMatic.g:7204:3: ruleContent
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
    // InternalSlideOMatic.g:7213:1: rule__NumberedList__ItemsAssignment_1 : ( ruleListItem ) ;
    public final void rule__NumberedList__ItemsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:7217:1: ( ( ruleListItem ) )
            // InternalSlideOMatic.g:7218:2: ( ruleListItem )
            {
            // InternalSlideOMatic.g:7218:2: ( ruleListItem )
            // InternalSlideOMatic.g:7219:3: ruleListItem
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
    // InternalSlideOMatic.g:7228:1: rule__UnNumberedList__ItemsAssignment_1 : ( ruleListItem ) ;
    public final void rule__UnNumberedList__ItemsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:7232:1: ( ( ruleListItem ) )
            // InternalSlideOMatic.g:7233:2: ( ruleListItem )
            {
            // InternalSlideOMatic.g:7233:2: ( ruleListItem )
            // InternalSlideOMatic.g:7234:3: ruleListItem
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
    // InternalSlideOMatic.g:7243:1: rule__ListItem__ItemAssignment_1 : ( RULE_STRING ) ;
    public final void rule__ListItem__ItemAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:7247:1: ( ( RULE_STRING ) )
            // InternalSlideOMatic.g:7248:2: ( RULE_STRING )
            {
            // InternalSlideOMatic.g:7248:2: ( RULE_STRING )
            // InternalSlideOMatic.g:7249:3: RULE_STRING
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
    // InternalSlideOMatic.g:7258:1: rule__ListItem__NestedListAssignment_2_1 : ( ruleList ) ;
    public final void rule__ListItem__NestedListAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:7262:1: ( ( ruleList ) )
            // InternalSlideOMatic.g:7263:2: ( ruleList )
            {
            // InternalSlideOMatic.g:7263:2: ( ruleList )
            // InternalSlideOMatic.g:7264:3: ruleList
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
    // InternalSlideOMatic.g:7273:1: rule__ListItem__ClickAssignment_3 : ( ruleClick ) ;
    public final void rule__ListItem__ClickAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:7277:1: ( ( ruleClick ) )
            // InternalSlideOMatic.g:7278:2: ( ruleClick )
            {
            // InternalSlideOMatic.g:7278:2: ( ruleClick )
            // InternalSlideOMatic.g:7279:3: ruleClick
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
    // InternalSlideOMatic.g:7288:1: rule__Image__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Image__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:7292:1: ( ( RULE_ID ) )
            // InternalSlideOMatic.g:7293:2: ( RULE_ID )
            {
            // InternalSlideOMatic.g:7293:2: ( RULE_ID )
            // InternalSlideOMatic.g:7294:3: RULE_ID
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
    // InternalSlideOMatic.g:7303:1: rule__Image__SrcAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Image__SrcAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:7307:1: ( ( RULE_STRING ) )
            // InternalSlideOMatic.g:7308:2: ( RULE_STRING )
            {
            // InternalSlideOMatic.g:7308:2: ( RULE_STRING )
            // InternalSlideOMatic.g:7309:3: RULE_STRING
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


    // $ANTLR start "rule__Image__AngleAssignment_4"
    // InternalSlideOMatic.g:7318:1: rule__Image__AngleAssignment_4 : ( RULE_INT ) ;
    public final void rule__Image__AngleAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:7322:1: ( ( RULE_INT ) )
            // InternalSlideOMatic.g:7323:2: ( RULE_INT )
            {
            // InternalSlideOMatic.g:7323:2: ( RULE_INT )
            // InternalSlideOMatic.g:7324:3: RULE_INT
            {
             before(grammarAccess.getImageAccess().getAngleINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getImageAccess().getAngleINTTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Image__AngleAssignment_4"


    // $ANTLR start "rule__Image__AlignmentAssignment_5_1"
    // InternalSlideOMatic.g:7333:1: rule__Image__AlignmentAssignment_5_1 : ( ruleAlignment ) ;
    public final void rule__Image__AlignmentAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:7337:1: ( ( ruleAlignment ) )
            // InternalSlideOMatic.g:7338:2: ( ruleAlignment )
            {
            // InternalSlideOMatic.g:7338:2: ( ruleAlignment )
            // InternalSlideOMatic.g:7339:3: ruleAlignment
            {
             before(grammarAccess.getImageAccess().getAlignmentAlignmentParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAlignment();

            state._fsp--;

             after(grammarAccess.getImageAccess().getAlignmentAlignmentParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Image__AlignmentAssignment_5_1"


    // $ANTLR start "rule__Image__SizeAssignment_6"
    // InternalSlideOMatic.g:7348:1: rule__Image__SizeAssignment_6 : ( ruleSize ) ;
    public final void rule__Image__SizeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:7352:1: ( ( ruleSize ) )
            // InternalSlideOMatic.g:7353:2: ( ruleSize )
            {
            // InternalSlideOMatic.g:7353:2: ( ruleSize )
            // InternalSlideOMatic.g:7354:3: ruleSize
            {
             before(grammarAccess.getImageAccess().getSizeSizeParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleSize();

            state._fsp--;

             after(grammarAccess.getImageAccess().getSizeSizeParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Image__SizeAssignment_6"


    // $ANTLR start "rule__ShowImage__ImageAssignment_1"
    // InternalSlideOMatic.g:7363:1: rule__ShowImage__ImageAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ShowImage__ImageAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:7367:1: ( ( ( RULE_ID ) ) )
            // InternalSlideOMatic.g:7368:2: ( ( RULE_ID ) )
            {
            // InternalSlideOMatic.g:7368:2: ( ( RULE_ID ) )
            // InternalSlideOMatic.g:7369:3: ( RULE_ID )
            {
             before(grammarAccess.getShowImageAccess().getImageImageCrossReference_1_0()); 
            // InternalSlideOMatic.g:7370:3: ( RULE_ID )
            // InternalSlideOMatic.g:7371:4: RULE_ID
            {
             before(grammarAccess.getShowImageAccess().getImageImageIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getShowImageAccess().getImageImageIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getShowImageAccess().getImageImageCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShowImage__ImageAssignment_1"


    // $ANTLR start "rule__Size__WayAssignment_0_1"
    // InternalSlideOMatic.g:7382:1: rule__Size__WayAssignment_0_1 : ( ruleWay ) ;
    public final void rule__Size__WayAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:7386:1: ( ( ruleWay ) )
            // InternalSlideOMatic.g:7387:2: ( ruleWay )
            {
            // InternalSlideOMatic.g:7387:2: ( ruleWay )
            // InternalSlideOMatic.g:7388:3: ruleWay
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
    // InternalSlideOMatic.g:7397:1: rule__Size__ScaleAssignment_0_2 : ( RULE_INT ) ;
    public final void rule__Size__ScaleAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:7401:1: ( ( RULE_INT ) )
            // InternalSlideOMatic.g:7402:2: ( RULE_INT )
            {
            // InternalSlideOMatic.g:7402:2: ( RULE_INT )
            // InternalSlideOMatic.g:7403:3: RULE_INT
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


    // $ANTLR start "rule__Size__WayAssignment_1_1"
    // InternalSlideOMatic.g:7412:1: rule__Size__WayAssignment_1_1 : ( ruleWay ) ;
    public final void rule__Size__WayAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:7416:1: ( ( ruleWay ) )
            // InternalSlideOMatic.g:7417:2: ( ruleWay )
            {
            // InternalSlideOMatic.g:7417:2: ( ruleWay )
            // InternalSlideOMatic.g:7418:3: ruleWay
            {
             before(grammarAccess.getSizeAccess().getWayWayParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleWay();

            state._fsp--;

             after(grammarAccess.getSizeAccess().getWayWayParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Size__WayAssignment_1_1"


    // $ANTLR start "rule__Size__SizeAssignment_1_2"
    // InternalSlideOMatic.g:7427:1: rule__Size__SizeAssignment_1_2 : ( RULE_INT ) ;
    public final void rule__Size__SizeAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:7431:1: ( ( RULE_INT ) )
            // InternalSlideOMatic.g:7432:2: ( RULE_INT )
            {
            // InternalSlideOMatic.g:7432:2: ( RULE_INT )
            // InternalSlideOMatic.g:7433:3: RULE_INT
            {
             before(grammarAccess.getSizeAccess().getSizeINTTerminalRuleCall_1_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getSizeAccess().getSizeINTTerminalRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Size__SizeAssignment_1_2"


    // $ANTLR start "rule__Size__UnitAssignment_1_3"
    // InternalSlideOMatic.g:7442:1: rule__Size__UnitAssignment_1_3 : ( ( rule__Size__UnitAlternatives_1_3_0 ) ) ;
    public final void rule__Size__UnitAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:7446:1: ( ( ( rule__Size__UnitAlternatives_1_3_0 ) ) )
            // InternalSlideOMatic.g:7447:2: ( ( rule__Size__UnitAlternatives_1_3_0 ) )
            {
            // InternalSlideOMatic.g:7447:2: ( ( rule__Size__UnitAlternatives_1_3_0 ) )
            // InternalSlideOMatic.g:7448:3: ( rule__Size__UnitAlternatives_1_3_0 )
            {
             before(grammarAccess.getSizeAccess().getUnitAlternatives_1_3_0()); 
            // InternalSlideOMatic.g:7449:3: ( rule__Size__UnitAlternatives_1_3_0 )
            // InternalSlideOMatic.g:7449:4: rule__Size__UnitAlternatives_1_3_0
            {
            pushFollow(FOLLOW_2);
            rule__Size__UnitAlternatives_1_3_0();

            state._fsp--;


            }

             after(grammarAccess.getSizeAccess().getUnitAlternatives_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Size__UnitAssignment_1_3"


    // $ANTLR start "rule__Table__NameAssignment_1"
    // InternalSlideOMatic.g:7457:1: rule__Table__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Table__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:7461:1: ( ( RULE_ID ) )
            // InternalSlideOMatic.g:7462:2: ( RULE_ID )
            {
            // InternalSlideOMatic.g:7462:2: ( RULE_ID )
            // InternalSlideOMatic.g:7463:3: RULE_ID
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
    // InternalSlideOMatic.g:7472:1: rule__Table__RowsAssignment_3 : ( ruleTableRow ) ;
    public final void rule__Table__RowsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:7476:1: ( ( ruleTableRow ) )
            // InternalSlideOMatic.g:7477:2: ( ruleTableRow )
            {
            // InternalSlideOMatic.g:7477:2: ( ruleTableRow )
            // InternalSlideOMatic.g:7478:3: ruleTableRow
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
    // InternalSlideOMatic.g:7487:1: rule__Table__RowsAssignment_4_1 : ( ruleTableRow ) ;
    public final void rule__Table__RowsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:7491:1: ( ( ruleTableRow ) )
            // InternalSlideOMatic.g:7492:2: ( ruleTableRow )
            {
            // InternalSlideOMatic.g:7492:2: ( ruleTableRow )
            // InternalSlideOMatic.g:7493:3: ruleTableRow
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
    // InternalSlideOMatic.g:7502:1: rule__TableRow__ValuesAssignment_1 : ( RULE_STRING ) ;
    public final void rule__TableRow__ValuesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:7506:1: ( ( RULE_STRING ) )
            // InternalSlideOMatic.g:7507:2: ( RULE_STRING )
            {
            // InternalSlideOMatic.g:7507:2: ( RULE_STRING )
            // InternalSlideOMatic.g:7508:3: RULE_STRING
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
    // InternalSlideOMatic.g:7517:1: rule__TableRow__ValuesAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__TableRow__ValuesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:7521:1: ( ( RULE_STRING ) )
            // InternalSlideOMatic.g:7522:2: ( RULE_STRING )
            {
            // InternalSlideOMatic.g:7522:2: ( RULE_STRING )
            // InternalSlideOMatic.g:7523:3: RULE_STRING
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
    // InternalSlideOMatic.g:7532:1: rule__Code__LangAssignment_0_2 : ( RULE_ID ) ;
    public final void rule__Code__LangAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:7536:1: ( ( RULE_ID ) )
            // InternalSlideOMatic.g:7537:2: ( RULE_ID )
            {
            // InternalSlideOMatic.g:7537:2: ( RULE_ID )
            // InternalSlideOMatic.g:7538:3: RULE_ID
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
    // InternalSlideOMatic.g:7547:1: rule__Code__CodeAssignment_0_3 : ( RULE_STRING ) ;
    public final void rule__Code__CodeAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:7551:1: ( ( RULE_STRING ) )
            // InternalSlideOMatic.g:7552:2: ( RULE_STRING )
            {
            // InternalSlideOMatic.g:7552:2: ( RULE_STRING )
            // InternalSlideOMatic.g:7553:3: RULE_STRING
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
    // InternalSlideOMatic.g:7562:1: rule__Code__LangAssignment_1_2 : ( RULE_ID ) ;
    public final void rule__Code__LangAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:7566:1: ( ( RULE_ID ) )
            // InternalSlideOMatic.g:7567:2: ( RULE_ID )
            {
            // InternalSlideOMatic.g:7567:2: ( RULE_ID )
            // InternalSlideOMatic.g:7568:3: RULE_ID
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
    // InternalSlideOMatic.g:7577:1: rule__Code__SrcAssignment_1_3 : ( RULE_STRING ) ;
    public final void rule__Code__SrcAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:7581:1: ( ( RULE_STRING ) )
            // InternalSlideOMatic.g:7582:2: ( RULE_STRING )
            {
            // InternalSlideOMatic.g:7582:2: ( RULE_STRING )
            // InternalSlideOMatic.g:7583:3: RULE_STRING
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
    // InternalSlideOMatic.g:7592:1: rule__Code__LinesAssignment_1_4_2 : ( ruleLineSequence ) ;
    public final void rule__Code__LinesAssignment_1_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:7596:1: ( ( ruleLineSequence ) )
            // InternalSlideOMatic.g:7597:2: ( ruleLineSequence )
            {
            // InternalSlideOMatic.g:7597:2: ( ruleLineSequence )
            // InternalSlideOMatic.g:7598:3: ruleLineSequence
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
    // InternalSlideOMatic.g:7607:1: rule__Code__LinesAssignment_1_4_4_2 : ( ruleLineSequence ) ;
    public final void rule__Code__LinesAssignment_1_4_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:7611:1: ( ( ruleLineSequence ) )
            // InternalSlideOMatic.g:7612:2: ( ruleLineSequence )
            {
            // InternalSlideOMatic.g:7612:2: ( ruleLineSequence )
            // InternalSlideOMatic.g:7613:3: ruleLineSequence
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
    // InternalSlideOMatic.g:7622:1: rule__LineSequence__LowerAssignment_0 : ( RULE_INT ) ;
    public final void rule__LineSequence__LowerAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:7626:1: ( ( RULE_INT ) )
            // InternalSlideOMatic.g:7627:2: ( RULE_INT )
            {
            // InternalSlideOMatic.g:7627:2: ( RULE_INT )
            // InternalSlideOMatic.g:7628:3: RULE_INT
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
    // InternalSlideOMatic.g:7637:1: rule__LineSequence__UpperAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__LineSequence__UpperAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:7641:1: ( ( RULE_INT ) )
            // InternalSlideOMatic.g:7642:2: ( RULE_INT )
            {
            // InternalSlideOMatic.g:7642:2: ( RULE_INT )
            // InternalSlideOMatic.g:7643:3: RULE_INT
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
    // InternalSlideOMatic.g:7652:1: rule__LineSequence__AdditionalAssignment_2_1 : ( ruleLineSequence ) ;
    public final void rule__LineSequence__AdditionalAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:7656:1: ( ( ruleLineSequence ) )
            // InternalSlideOMatic.g:7657:2: ( ruleLineSequence )
            {
            // InternalSlideOMatic.g:7657:2: ( ruleLineSequence )
            // InternalSlideOMatic.g:7658:3: ruleLineSequence
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
    // InternalSlideOMatic.g:7667:1: rule__Animation__TargetAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Animation__TargetAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:7671:1: ( ( ( RULE_ID ) ) )
            // InternalSlideOMatic.g:7672:2: ( ( RULE_ID ) )
            {
            // InternalSlideOMatic.g:7672:2: ( ( RULE_ID ) )
            // InternalSlideOMatic.g:7673:3: ( RULE_ID )
            {
             before(grammarAccess.getAnimationAccess().getTargetImageCrossReference_1_0()); 
            // InternalSlideOMatic.g:7674:3: ( RULE_ID )
            // InternalSlideOMatic.g:7675:4: RULE_ID
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


    // $ANTLR start "rule__Animation__FromLocationAssignment_3"
    // InternalSlideOMatic.g:7686:1: rule__Animation__FromLocationAssignment_3 : ( ruleAlignment ) ;
    public final void rule__Animation__FromLocationAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:7690:1: ( ( ruleAlignment ) )
            // InternalSlideOMatic.g:7691:2: ( ruleAlignment )
            {
            // InternalSlideOMatic.g:7691:2: ( ruleAlignment )
            // InternalSlideOMatic.g:7692:3: ruleAlignment
            {
             before(grammarAccess.getAnimationAccess().getFromLocationAlignmentParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAlignment();

            state._fsp--;

             after(grammarAccess.getAnimationAccess().getFromLocationAlignmentParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Animation__FromLocationAssignment_3"


    // $ANTLR start "rule__Animation__FinalLocationAssignment_5"
    // InternalSlideOMatic.g:7701:1: rule__Animation__FinalLocationAssignment_5 : ( ruleAlignment ) ;
    public final void rule__Animation__FinalLocationAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:7705:1: ( ( ruleAlignment ) )
            // InternalSlideOMatic.g:7706:2: ( ruleAlignment )
            {
            // InternalSlideOMatic.g:7706:2: ( ruleAlignment )
            // InternalSlideOMatic.g:7707:3: ruleAlignment
            {
             before(grammarAccess.getAnimationAccess().getFinalLocationAlignmentParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleAlignment();

            state._fsp--;

             after(grammarAccess.getAnimationAccess().getFinalLocationAlignmentParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Animation__FinalLocationAssignment_5"


    // $ANTLR start "rule__Animation__ViaLocationAssignment_6_1"
    // InternalSlideOMatic.g:7716:1: rule__Animation__ViaLocationAssignment_6_1 : ( ruleAlignment ) ;
    public final void rule__Animation__ViaLocationAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:7720:1: ( ( ruleAlignment ) )
            // InternalSlideOMatic.g:7721:2: ( ruleAlignment )
            {
            // InternalSlideOMatic.g:7721:2: ( ruleAlignment )
            // InternalSlideOMatic.g:7722:3: ruleAlignment
            {
             before(grammarAccess.getAnimationAccess().getViaLocationAlignmentParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAlignment();

            state._fsp--;

             after(grammarAccess.getAnimationAccess().getViaLocationAlignmentParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Animation__ViaLocationAssignment_6_1"


    // $ANTLR start "rule__MathExp__EvalAssignment_1"
    // InternalSlideOMatic.g:7731:1: rule__MathExp__EvalAssignment_1 : ( ( 'eval' ) ) ;
    public final void rule__MathExp__EvalAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:7735:1: ( ( ( 'eval' ) ) )
            // InternalSlideOMatic.g:7736:2: ( ( 'eval' ) )
            {
            // InternalSlideOMatic.g:7736:2: ( ( 'eval' ) )
            // InternalSlideOMatic.g:7737:3: ( 'eval' )
            {
             before(grammarAccess.getMathExpAccess().getEvalEvalKeyword_1_0()); 
            // InternalSlideOMatic.g:7738:3: ( 'eval' )
            // InternalSlideOMatic.g:7739:4: 'eval'
            {
             before(grammarAccess.getMathExpAccess().getEvalEvalKeyword_1_0()); 
            match(input,114,FOLLOW_2); 
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
    // InternalSlideOMatic.g:7750:1: rule__MathExp__ExpAssignment_2 : ( ruleExp ) ;
    public final void rule__MathExp__ExpAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:7754:1: ( ( ruleExp ) )
            // InternalSlideOMatic.g:7755:2: ( ruleExp )
            {
            // InternalSlideOMatic.g:7755:2: ( ruleExp )
            // InternalSlideOMatic.g:7756:3: ruleExp
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
    // InternalSlideOMatic.g:7765:1: rule__Exp__RightAssignment_1_1 : ( ruleFactor ) ;
    public final void rule__Exp__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:7769:1: ( ( ruleFactor ) )
            // InternalSlideOMatic.g:7770:2: ( ruleFactor )
            {
            // InternalSlideOMatic.g:7770:2: ( ruleFactor )
            // InternalSlideOMatic.g:7771:3: ruleFactor
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
    // InternalSlideOMatic.g:7780:1: rule__Factor__RightAssignment_1_1 : ( rulePow ) ;
    public final void rule__Factor__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:7784:1: ( ( rulePow ) )
            // InternalSlideOMatic.g:7785:2: ( rulePow )
            {
            // InternalSlideOMatic.g:7785:2: ( rulePow )
            // InternalSlideOMatic.g:7786:3: rulePow
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
    // InternalSlideOMatic.g:7795:1: rule__Pow__RightAssignment_1_2 : ( rulePrimary ) ;
    public final void rule__Pow__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:7799:1: ( ( rulePrimary ) )
            // InternalSlideOMatic.g:7800:2: ( rulePrimary )
            {
            // InternalSlideOMatic.g:7800:2: ( rulePrimary )
            // InternalSlideOMatic.g:7801:3: rulePrimary
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
    // InternalSlideOMatic.g:7810:1: rule__VariableUse__IdAssignment_1 : ( RULE_ID ) ;
    public final void rule__VariableUse__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:7814:1: ( ( RULE_ID ) )
            // InternalSlideOMatic.g:7815:2: ( RULE_ID )
            {
            // InternalSlideOMatic.g:7815:2: ( RULE_ID )
            // InternalSlideOMatic.g:7816:3: RULE_ID
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
    // InternalSlideOMatic.g:7825:1: rule__VariableBinding__IdAssignment_2 : ( RULE_ID ) ;
    public final void rule__VariableBinding__IdAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:7829:1: ( ( RULE_ID ) )
            // InternalSlideOMatic.g:7830:2: ( RULE_ID )
            {
            // InternalSlideOMatic.g:7830:2: ( RULE_ID )
            // InternalSlideOMatic.g:7831:3: RULE_ID
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
    // InternalSlideOMatic.g:7840:1: rule__VariableBinding__BindingAssignment_4 : ( ruleExp ) ;
    public final void rule__VariableBinding__BindingAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:7844:1: ( ( ruleExp ) )
            // InternalSlideOMatic.g:7845:2: ( ruleExp )
            {
            // InternalSlideOMatic.g:7845:2: ( ruleExp )
            // InternalSlideOMatic.g:7846:3: ruleExp
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
    // InternalSlideOMatic.g:7855:1: rule__VariableBinding__BodyAssignment_6 : ( ruleExp ) ;
    public final void rule__VariableBinding__BodyAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:7859:1: ( ( ruleExp ) )
            // InternalSlideOMatic.g:7860:2: ( ruleExp )
            {
            // InternalSlideOMatic.g:7860:2: ( ruleExp )
            // InternalSlideOMatic.g:7861:3: ruleExp
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
    // InternalSlideOMatic.g:7870:1: rule__Number__ValueAssignment_1 : ( RULE_INT ) ;
    public final void rule__Number__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:7874:1: ( ( RULE_INT ) )
            // InternalSlideOMatic.g:7875:2: ( RULE_INT )
            {
            // InternalSlideOMatic.g:7875:2: ( RULE_INT )
            // InternalSlideOMatic.g:7876:3: RULE_INT
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
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000000L,0x000000000100080CL});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000800L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0300000000000000L,0x0000000000000330L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000FFFFFFF000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00FFFF0000400000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000400L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000010L,0x0000000000003402L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000010L,0x00000894887FC000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000012L,0x00000894887FC000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000000L,0x0000000000003400L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000010L,0x00000000000F8000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000002L,0x00000000000F8000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000000L,0x00000000000F8000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000800L,0x0000000000000008L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000000L,0x0000000000600000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000040L,0x0000000064000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x1C00000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000000L,0x0000000060000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0xE000000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000080L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000000L,0x0000001400000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000000L,0x0000002800000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000080L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000000060L,0x0004800000000008L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000000L,0x0000100000800000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000000002L,0x0000100000800000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000400L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000000002L,0x0000200000000400L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});

}