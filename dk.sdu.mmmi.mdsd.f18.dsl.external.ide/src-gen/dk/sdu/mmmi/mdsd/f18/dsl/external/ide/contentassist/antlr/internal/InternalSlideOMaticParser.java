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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'$$'", "'AnnArbor'", "'Antibes'", "'Bergen'", "'Berkeley'", "'Berlin'", "'Boadilla'", "'boxes'", "'CambridgeUS'", "'Copenhagen'", "'Darmstadt'", "'default'", "'Dresden'", "'Frankfurt'", "'Goettingen'", "'Hannover'", "'Ilmanau'", "'JuanLesPins'", "'Luebeck'", "'Madrid'", "'Malmoe'", "'Marburg'", "'Montpellier'", "'PaloAlto'", "'Pittsburgh'", "'Rochester'", "'Singapore'", "'Szeged'", "'Warsaw'", "'albatros'", "'beaver'", "'beetle'", "'crane'", "'dolphin'", "'dove'", "'fly'", "'lily'", "'orchid'", "'rose'", "'seagull'", "'seahorse'", "'sidebartab'", "'structure'", "'whale'", "'wolverine'", "'topleft'", "'top'", "'topright'", "'left'", "'center'", "'right'", "'bottomleft'", "'bottom'", "'bottomright'", "'width'", "'height'", "'presentation'", "'{'", "'}'", "'('", "')'", "'theme'", "'color'", "'author'", "'date'", "'slide'", "'*'", "'**'", "'***'", "'ToC'", "'>'", "'Block'", "'##'", "'--'", "'img'", "'src'", "'%'", "'tab'", "'['", "']'", "','", "'animate'", "'to'", "'move'", "'jump'"
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
    public static final int RULE_ID=4;
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
    public static final int RULE_STRING=5;
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



    // $ANTLR start "entryRuleModel"
    // InternalSlideOMatic.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalSlideOMatic.g:54:1: ( ruleModel EOF )
            // InternalSlideOMatic.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalSlideOMatic.g:62:1: ruleModel : ( ( rule__Model__PresentationAssignment ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:66:2: ( ( ( rule__Model__PresentationAssignment ) ) )
            // InternalSlideOMatic.g:67:2: ( ( rule__Model__PresentationAssignment ) )
            {
            // InternalSlideOMatic.g:67:2: ( ( rule__Model__PresentationAssignment ) )
            // InternalSlideOMatic.g:68:3: ( rule__Model__PresentationAssignment )
            {
             before(grammarAccess.getModelAccess().getPresentationAssignment()); 
            // InternalSlideOMatic.g:69:3: ( rule__Model__PresentationAssignment )
            // InternalSlideOMatic.g:69:4: rule__Model__PresentationAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Model__PresentationAssignment();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getPresentationAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRulePresentation"
    // InternalSlideOMatic.g:78:1: entryRulePresentation : rulePresentation EOF ;
    public final void entryRulePresentation() throws RecognitionException {
        try {
            // InternalSlideOMatic.g:79:1: ( rulePresentation EOF )
            // InternalSlideOMatic.g:80:1: rulePresentation EOF
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
    // InternalSlideOMatic.g:87:1: rulePresentation : ( ( rule__Presentation__Group__0 ) ) ;
    public final void rulePresentation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:91:2: ( ( ( rule__Presentation__Group__0 ) ) )
            // InternalSlideOMatic.g:92:2: ( ( rule__Presentation__Group__0 ) )
            {
            // InternalSlideOMatic.g:92:2: ( ( rule__Presentation__Group__0 ) )
            // InternalSlideOMatic.g:93:3: ( rule__Presentation__Group__0 )
            {
             before(grammarAccess.getPresentationAccess().getGroup()); 
            // InternalSlideOMatic.g:94:3: ( rule__Presentation__Group__0 )
            // InternalSlideOMatic.g:94:4: rule__Presentation__Group__0
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


    // $ANTLR start "entryRuleSetting"
    // InternalSlideOMatic.g:103:1: entryRuleSetting : ruleSetting EOF ;
    public final void entryRuleSetting() throws RecognitionException {
        try {
            // InternalSlideOMatic.g:104:1: ( ruleSetting EOF )
            // InternalSlideOMatic.g:105:1: ruleSetting EOF
            {
             before(grammarAccess.getSettingRule()); 
            pushFollow(FOLLOW_1);
            ruleSetting();

            state._fsp--;

             after(grammarAccess.getSettingRule()); 
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
    // $ANTLR end "entryRuleSetting"


    // $ANTLR start "ruleSetting"
    // InternalSlideOMatic.g:112:1: ruleSetting : ( ( rule__Setting__Alternatives ) ) ;
    public final void ruleSetting() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:116:2: ( ( ( rule__Setting__Alternatives ) ) )
            // InternalSlideOMatic.g:117:2: ( ( rule__Setting__Alternatives ) )
            {
            // InternalSlideOMatic.g:117:2: ( ( rule__Setting__Alternatives ) )
            // InternalSlideOMatic.g:118:3: ( rule__Setting__Alternatives )
            {
             before(grammarAccess.getSettingAccess().getAlternatives()); 
            // InternalSlideOMatic.g:119:3: ( rule__Setting__Alternatives )
            // InternalSlideOMatic.g:119:4: rule__Setting__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Setting__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSettingAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSetting"


    // $ANTLR start "entryRuleTheme"
    // InternalSlideOMatic.g:128:1: entryRuleTheme : ruleTheme EOF ;
    public final void entryRuleTheme() throws RecognitionException {
        try {
            // InternalSlideOMatic.g:129:1: ( ruleTheme EOF )
            // InternalSlideOMatic.g:130:1: ruleTheme EOF
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
    // InternalSlideOMatic.g:137:1: ruleTheme : ( ( rule__Theme__Group__0 ) ) ;
    public final void ruleTheme() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:141:2: ( ( ( rule__Theme__Group__0 ) ) )
            // InternalSlideOMatic.g:142:2: ( ( rule__Theme__Group__0 ) )
            {
            // InternalSlideOMatic.g:142:2: ( ( rule__Theme__Group__0 ) )
            // InternalSlideOMatic.g:143:3: ( rule__Theme__Group__0 )
            {
             before(grammarAccess.getThemeAccess().getGroup()); 
            // InternalSlideOMatic.g:144:3: ( rule__Theme__Group__0 )
            // InternalSlideOMatic.g:144:4: rule__Theme__Group__0
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
    // InternalSlideOMatic.g:153:1: entryRuleBeamerTheme : ruleBeamerTheme EOF ;
    public final void entryRuleBeamerTheme() throws RecognitionException {
        try {
            // InternalSlideOMatic.g:154:1: ( ruleBeamerTheme EOF )
            // InternalSlideOMatic.g:155:1: ruleBeamerTheme EOF
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
    // InternalSlideOMatic.g:162:1: ruleBeamerTheme : ( ( rule__BeamerTheme__Alternatives ) ) ;
    public final void ruleBeamerTheme() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:166:2: ( ( ( rule__BeamerTheme__Alternatives ) ) )
            // InternalSlideOMatic.g:167:2: ( ( rule__BeamerTheme__Alternatives ) )
            {
            // InternalSlideOMatic.g:167:2: ( ( rule__BeamerTheme__Alternatives ) )
            // InternalSlideOMatic.g:168:3: ( rule__BeamerTheme__Alternatives )
            {
             before(grammarAccess.getBeamerThemeAccess().getAlternatives()); 
            // InternalSlideOMatic.g:169:3: ( rule__BeamerTheme__Alternatives )
            // InternalSlideOMatic.g:169:4: rule__BeamerTheme__Alternatives
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
    // InternalSlideOMatic.g:178:1: entryRuleThemeColor : ruleThemeColor EOF ;
    public final void entryRuleThemeColor() throws RecognitionException {
        try {
            // InternalSlideOMatic.g:179:1: ( ruleThemeColor EOF )
            // InternalSlideOMatic.g:180:1: ruleThemeColor EOF
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
    // InternalSlideOMatic.g:187:1: ruleThemeColor : ( ( rule__ThemeColor__Alternatives ) ) ;
    public final void ruleThemeColor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:191:2: ( ( ( rule__ThemeColor__Alternatives ) ) )
            // InternalSlideOMatic.g:192:2: ( ( rule__ThemeColor__Alternatives ) )
            {
            // InternalSlideOMatic.g:192:2: ( ( rule__ThemeColor__Alternatives ) )
            // InternalSlideOMatic.g:193:3: ( rule__ThemeColor__Alternatives )
            {
             before(grammarAccess.getThemeColorAccess().getAlternatives()); 
            // InternalSlideOMatic.g:194:3: ( rule__ThemeColor__Alternatives )
            // InternalSlideOMatic.g:194:4: rule__ThemeColor__Alternatives
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


    // $ANTLR start "entryRuleAuthor"
    // InternalSlideOMatic.g:203:1: entryRuleAuthor : ruleAuthor EOF ;
    public final void entryRuleAuthor() throws RecognitionException {
        try {
            // InternalSlideOMatic.g:204:1: ( ruleAuthor EOF )
            // InternalSlideOMatic.g:205:1: ruleAuthor EOF
            {
             before(grammarAccess.getAuthorRule()); 
            pushFollow(FOLLOW_1);
            ruleAuthor();

            state._fsp--;

             after(grammarAccess.getAuthorRule()); 
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
    // $ANTLR end "entryRuleAuthor"


    // $ANTLR start "ruleAuthor"
    // InternalSlideOMatic.g:212:1: ruleAuthor : ( ( rule__Author__Group__0 ) ) ;
    public final void ruleAuthor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:216:2: ( ( ( rule__Author__Group__0 ) ) )
            // InternalSlideOMatic.g:217:2: ( ( rule__Author__Group__0 ) )
            {
            // InternalSlideOMatic.g:217:2: ( ( rule__Author__Group__0 ) )
            // InternalSlideOMatic.g:218:3: ( rule__Author__Group__0 )
            {
             before(grammarAccess.getAuthorAccess().getGroup()); 
            // InternalSlideOMatic.g:219:3: ( rule__Author__Group__0 )
            // InternalSlideOMatic.g:219:4: rule__Author__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Author__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAuthorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAuthor"


    // $ANTLR start "entryRuleDate"
    // InternalSlideOMatic.g:228:1: entryRuleDate : ruleDate EOF ;
    public final void entryRuleDate() throws RecognitionException {
        try {
            // InternalSlideOMatic.g:229:1: ( ruleDate EOF )
            // InternalSlideOMatic.g:230:1: ruleDate EOF
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
    // InternalSlideOMatic.g:237:1: ruleDate : ( ( rule__Date__Group__0 ) ) ;
    public final void ruleDate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:241:2: ( ( ( rule__Date__Group__0 ) ) )
            // InternalSlideOMatic.g:242:2: ( ( rule__Date__Group__0 ) )
            {
            // InternalSlideOMatic.g:242:2: ( ( rule__Date__Group__0 ) )
            // InternalSlideOMatic.g:243:3: ( rule__Date__Group__0 )
            {
             before(grammarAccess.getDateAccess().getGroup()); 
            // InternalSlideOMatic.g:244:3: ( rule__Date__Group__0 )
            // InternalSlideOMatic.g:244:4: rule__Date__Group__0
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
    // InternalSlideOMatic.g:253:1: entryRuleSlide : ruleSlide EOF ;
    public final void entryRuleSlide() throws RecognitionException {
        try {
            // InternalSlideOMatic.g:254:1: ( ruleSlide EOF )
            // InternalSlideOMatic.g:255:1: ruleSlide EOF
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
    // InternalSlideOMatic.g:262:1: ruleSlide : ( ( rule__Slide__Group__0 ) ) ;
    public final void ruleSlide() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:266:2: ( ( ( rule__Slide__Group__0 ) ) )
            // InternalSlideOMatic.g:267:2: ( ( rule__Slide__Group__0 ) )
            {
            // InternalSlideOMatic.g:267:2: ( ( rule__Slide__Group__0 ) )
            // InternalSlideOMatic.g:268:3: ( rule__Slide__Group__0 )
            {
             before(grammarAccess.getSlideAccess().getGroup()); 
            // InternalSlideOMatic.g:269:3: ( rule__Slide__Group__0 )
            // InternalSlideOMatic.g:269:4: rule__Slide__Group__0
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
    // InternalSlideOMatic.g:278:1: entryRuleSection : ruleSection EOF ;
    public final void entryRuleSection() throws RecognitionException {
        try {
            // InternalSlideOMatic.g:279:1: ( ruleSection EOF )
            // InternalSlideOMatic.g:280:1: ruleSection EOF
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
    // InternalSlideOMatic.g:287:1: ruleSection : ( ( rule__Section__Alternatives ) ) ;
    public final void ruleSection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:291:2: ( ( ( rule__Section__Alternatives ) ) )
            // InternalSlideOMatic.g:292:2: ( ( rule__Section__Alternatives ) )
            {
            // InternalSlideOMatic.g:292:2: ( ( rule__Section__Alternatives ) )
            // InternalSlideOMatic.g:293:3: ( rule__Section__Alternatives )
            {
             before(grammarAccess.getSectionAccess().getAlternatives()); 
            // InternalSlideOMatic.g:294:3: ( rule__Section__Alternatives )
            // InternalSlideOMatic.g:294:4: rule__Section__Alternatives
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
    // InternalSlideOMatic.g:303:1: entryRuleContent : ruleContent EOF ;
    public final void entryRuleContent() throws RecognitionException {
        try {
            // InternalSlideOMatic.g:304:1: ( ruleContent EOF )
            // InternalSlideOMatic.g:305:1: ruleContent EOF
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
    // InternalSlideOMatic.g:312:1: ruleContent : ( ( rule__Content__Alternatives ) ) ;
    public final void ruleContent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:316:2: ( ( ( rule__Content__Alternatives ) ) )
            // InternalSlideOMatic.g:317:2: ( ( rule__Content__Alternatives ) )
            {
            // InternalSlideOMatic.g:317:2: ( ( rule__Content__Alternatives ) )
            // InternalSlideOMatic.g:318:3: ( rule__Content__Alternatives )
            {
             before(grammarAccess.getContentAccess().getAlternatives()); 
            // InternalSlideOMatic.g:319:3: ( rule__Content__Alternatives )
            // InternalSlideOMatic.g:319:4: rule__Content__Alternatives
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
    // InternalSlideOMatic.g:337:1: ruleText : ( ( rule__Text__Alternatives ) ) ;
    public final void ruleText() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:341:2: ( ( ( rule__Text__Alternatives ) ) )
            // InternalSlideOMatic.g:342:2: ( ( rule__Text__Alternatives ) )
            {
            // InternalSlideOMatic.g:342:2: ( ( rule__Text__Alternatives ) )
            // InternalSlideOMatic.g:343:3: ( rule__Text__Alternatives )
            {
             before(grammarAccess.getTextAccess().getAlternatives()); 
            // InternalSlideOMatic.g:344:3: ( rule__Text__Alternatives )
            // InternalSlideOMatic.g:344:4: rule__Text__Alternatives
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
    // InternalSlideOMatic.g:353:1: entryRuleList : ruleList EOF ;
    public final void entryRuleList() throws RecognitionException {
        try {
            // InternalSlideOMatic.g:354:1: ( ruleList EOF )
            // InternalSlideOMatic.g:355:1: ruleList EOF
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
    // InternalSlideOMatic.g:362:1: ruleList : ( ( rule__List__Alternatives ) ) ;
    public final void ruleList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:366:2: ( ( ( rule__List__Alternatives ) ) )
            // InternalSlideOMatic.g:367:2: ( ( rule__List__Alternatives ) )
            {
            // InternalSlideOMatic.g:367:2: ( ( rule__List__Alternatives ) )
            // InternalSlideOMatic.g:368:3: ( rule__List__Alternatives )
            {
             before(grammarAccess.getListAccess().getAlternatives()); 
            // InternalSlideOMatic.g:369:3: ( rule__List__Alternatives )
            // InternalSlideOMatic.g:369:4: rule__List__Alternatives
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
    // InternalSlideOMatic.g:378:1: entryRuleNumberedListItem : ruleNumberedListItem EOF ;
    public final void entryRuleNumberedListItem() throws RecognitionException {
        try {
            // InternalSlideOMatic.g:379:1: ( ruleNumberedListItem EOF )
            // InternalSlideOMatic.g:380:1: ruleNumberedListItem EOF
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
    // InternalSlideOMatic.g:387:1: ruleNumberedListItem : ( ( rule__NumberedListItem__Group__0 ) ) ;
    public final void ruleNumberedListItem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:391:2: ( ( ( rule__NumberedListItem__Group__0 ) ) )
            // InternalSlideOMatic.g:392:2: ( ( rule__NumberedListItem__Group__0 ) )
            {
            // InternalSlideOMatic.g:392:2: ( ( rule__NumberedListItem__Group__0 ) )
            // InternalSlideOMatic.g:393:3: ( rule__NumberedListItem__Group__0 )
            {
             before(grammarAccess.getNumberedListItemAccess().getGroup()); 
            // InternalSlideOMatic.g:394:3: ( rule__NumberedListItem__Group__0 )
            // InternalSlideOMatic.g:394:4: rule__NumberedListItem__Group__0
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


    // $ANTLR start "entryRuleUnNumberedList"
    // InternalSlideOMatic.g:403:1: entryRuleUnNumberedList : ruleUnNumberedList EOF ;
    public final void entryRuleUnNumberedList() throws RecognitionException {
        try {
            // InternalSlideOMatic.g:404:1: ( ruleUnNumberedList EOF )
            // InternalSlideOMatic.g:405:1: ruleUnNumberedList EOF
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
    // InternalSlideOMatic.g:412:1: ruleUnNumberedList : ( ( rule__UnNumberedList__Group__0 ) ) ;
    public final void ruleUnNumberedList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:416:2: ( ( ( rule__UnNumberedList__Group__0 ) ) )
            // InternalSlideOMatic.g:417:2: ( ( rule__UnNumberedList__Group__0 ) )
            {
            // InternalSlideOMatic.g:417:2: ( ( rule__UnNumberedList__Group__0 ) )
            // InternalSlideOMatic.g:418:3: ( rule__UnNumberedList__Group__0 )
            {
             before(grammarAccess.getUnNumberedListAccess().getGroup()); 
            // InternalSlideOMatic.g:419:3: ( rule__UnNumberedList__Group__0 )
            // InternalSlideOMatic.g:419:4: rule__UnNumberedList__Group__0
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


    // $ANTLR start "entryRuleFloat"
    // InternalSlideOMatic.g:428:1: entryRuleFloat : ruleFloat EOF ;
    public final void entryRuleFloat() throws RecognitionException {
        try {
            // InternalSlideOMatic.g:429:1: ( ruleFloat EOF )
            // InternalSlideOMatic.g:430:1: ruleFloat EOF
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
    // InternalSlideOMatic.g:437:1: ruleFloat : ( ( rule__Float__Alternatives ) ) ;
    public final void ruleFloat() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:441:2: ( ( ( rule__Float__Alternatives ) ) )
            // InternalSlideOMatic.g:442:2: ( ( rule__Float__Alternatives ) )
            {
            // InternalSlideOMatic.g:442:2: ( ( rule__Float__Alternatives ) )
            // InternalSlideOMatic.g:443:3: ( rule__Float__Alternatives )
            {
             before(grammarAccess.getFloatAccess().getAlternatives()); 
            // InternalSlideOMatic.g:444:3: ( rule__Float__Alternatives )
            // InternalSlideOMatic.g:444:4: rule__Float__Alternatives
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
    // InternalSlideOMatic.g:453:1: entryRuleImage : ruleImage EOF ;
    public final void entryRuleImage() throws RecognitionException {
        try {
            // InternalSlideOMatic.g:454:1: ( ruleImage EOF )
            // InternalSlideOMatic.g:455:1: ruleImage EOF
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
    // InternalSlideOMatic.g:462:1: ruleImage : ( ( rule__Image__Group__0 ) ) ;
    public final void ruleImage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:466:2: ( ( ( rule__Image__Group__0 ) ) )
            // InternalSlideOMatic.g:467:2: ( ( rule__Image__Group__0 ) )
            {
            // InternalSlideOMatic.g:467:2: ( ( rule__Image__Group__0 ) )
            // InternalSlideOMatic.g:468:3: ( rule__Image__Group__0 )
            {
             before(grammarAccess.getImageAccess().getGroup()); 
            // InternalSlideOMatic.g:469:3: ( rule__Image__Group__0 )
            // InternalSlideOMatic.g:469:4: rule__Image__Group__0
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
    // InternalSlideOMatic.g:478:1: entryRuleAlignment : ruleAlignment EOF ;
    public final void entryRuleAlignment() throws RecognitionException {
        try {
            // InternalSlideOMatic.g:479:1: ( ruleAlignment EOF )
            // InternalSlideOMatic.g:480:1: ruleAlignment EOF
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
    // InternalSlideOMatic.g:487:1: ruleAlignment : ( ( rule__Alignment__Alternatives ) ) ;
    public final void ruleAlignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:491:2: ( ( ( rule__Alignment__Alternatives ) ) )
            // InternalSlideOMatic.g:492:2: ( ( rule__Alignment__Alternatives ) )
            {
            // InternalSlideOMatic.g:492:2: ( ( rule__Alignment__Alternatives ) )
            // InternalSlideOMatic.g:493:3: ( rule__Alignment__Alternatives )
            {
             before(grammarAccess.getAlignmentAccess().getAlternatives()); 
            // InternalSlideOMatic.g:494:3: ( rule__Alignment__Alternatives )
            // InternalSlideOMatic.g:494:4: rule__Alignment__Alternatives
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
    // InternalSlideOMatic.g:503:1: entryRuleSize : ruleSize EOF ;
    public final void entryRuleSize() throws RecognitionException {
        try {
            // InternalSlideOMatic.g:504:1: ( ruleSize EOF )
            // InternalSlideOMatic.g:505:1: ruleSize EOF
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
    // InternalSlideOMatic.g:512:1: ruleSize : ( ( rule__Size__Group__0 ) ) ;
    public final void ruleSize() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:516:2: ( ( ( rule__Size__Group__0 ) ) )
            // InternalSlideOMatic.g:517:2: ( ( rule__Size__Group__0 ) )
            {
            // InternalSlideOMatic.g:517:2: ( ( rule__Size__Group__0 ) )
            // InternalSlideOMatic.g:518:3: ( rule__Size__Group__0 )
            {
             before(grammarAccess.getSizeAccess().getGroup()); 
            // InternalSlideOMatic.g:519:3: ( rule__Size__Group__0 )
            // InternalSlideOMatic.g:519:4: rule__Size__Group__0
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
    // InternalSlideOMatic.g:528:1: entryRuleTable : ruleTable EOF ;
    public final void entryRuleTable() throws RecognitionException {
        try {
            // InternalSlideOMatic.g:529:1: ( ruleTable EOF )
            // InternalSlideOMatic.g:530:1: ruleTable EOF
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
    // InternalSlideOMatic.g:537:1: ruleTable : ( ( rule__Table__Group__0 ) ) ;
    public final void ruleTable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:541:2: ( ( ( rule__Table__Group__0 ) ) )
            // InternalSlideOMatic.g:542:2: ( ( rule__Table__Group__0 ) )
            {
            // InternalSlideOMatic.g:542:2: ( ( rule__Table__Group__0 ) )
            // InternalSlideOMatic.g:543:3: ( rule__Table__Group__0 )
            {
             before(grammarAccess.getTableAccess().getGroup()); 
            // InternalSlideOMatic.g:544:3: ( rule__Table__Group__0 )
            // InternalSlideOMatic.g:544:4: rule__Table__Group__0
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
    // InternalSlideOMatic.g:553:1: entryRuleTableRow : ruleTableRow EOF ;
    public final void entryRuleTableRow() throws RecognitionException {
        try {
            // InternalSlideOMatic.g:554:1: ( ruleTableRow EOF )
            // InternalSlideOMatic.g:555:1: ruleTableRow EOF
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
    // InternalSlideOMatic.g:562:1: ruleTableRow : ( ( rule__TableRow__Group__0 ) ) ;
    public final void ruleTableRow() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:566:2: ( ( ( rule__TableRow__Group__0 ) ) )
            // InternalSlideOMatic.g:567:2: ( ( rule__TableRow__Group__0 ) )
            {
            // InternalSlideOMatic.g:567:2: ( ( rule__TableRow__Group__0 ) )
            // InternalSlideOMatic.g:568:3: ( rule__TableRow__Group__0 )
            {
             before(grammarAccess.getTableRowAccess().getGroup()); 
            // InternalSlideOMatic.g:569:3: ( rule__TableRow__Group__0 )
            // InternalSlideOMatic.g:569:4: rule__TableRow__Group__0
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
    // InternalSlideOMatic.g:578:1: entryRuleClick : ruleClick EOF ;
    public final void entryRuleClick() throws RecognitionException {
        try {
            // InternalSlideOMatic.g:579:1: ( ruleClick EOF )
            // InternalSlideOMatic.g:580:1: ruleClick EOF
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
    // InternalSlideOMatic.g:587:1: ruleClick : ( '$$' ) ;
    public final void ruleClick() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:591:2: ( ( '$$' ) )
            // InternalSlideOMatic.g:592:2: ( '$$' )
            {
            // InternalSlideOMatic.g:592:2: ( '$$' )
            // InternalSlideOMatic.g:593:3: '$$'
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
    // InternalSlideOMatic.g:603:1: entryRuleAnimation : ruleAnimation EOF ;
    public final void entryRuleAnimation() throws RecognitionException {
        try {
            // InternalSlideOMatic.g:604:1: ( ruleAnimation EOF )
            // InternalSlideOMatic.g:605:1: ruleAnimation EOF
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
    // InternalSlideOMatic.g:612:1: ruleAnimation : ( ( rule__Animation__Group__0 ) ) ;
    public final void ruleAnimation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:616:2: ( ( ( rule__Animation__Group__0 ) ) )
            // InternalSlideOMatic.g:617:2: ( ( rule__Animation__Group__0 ) )
            {
            // InternalSlideOMatic.g:617:2: ( ( rule__Animation__Group__0 ) )
            // InternalSlideOMatic.g:618:3: ( rule__Animation__Group__0 )
            {
             before(grammarAccess.getAnimationAccess().getGroup()); 
            // InternalSlideOMatic.g:619:3: ( rule__Animation__Group__0 )
            // InternalSlideOMatic.g:619:4: rule__Animation__Group__0
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
    // InternalSlideOMatic.g:628:1: entryRuleAnimationType : ruleAnimationType EOF ;
    public final void entryRuleAnimationType() throws RecognitionException {
        try {
            // InternalSlideOMatic.g:629:1: ( ruleAnimationType EOF )
            // InternalSlideOMatic.g:630:1: ruleAnimationType EOF
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
    // InternalSlideOMatic.g:637:1: ruleAnimationType : ( ( rule__AnimationType__Alternatives ) ) ;
    public final void ruleAnimationType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:641:2: ( ( ( rule__AnimationType__Alternatives ) ) )
            // InternalSlideOMatic.g:642:2: ( ( rule__AnimationType__Alternatives ) )
            {
            // InternalSlideOMatic.g:642:2: ( ( rule__AnimationType__Alternatives ) )
            // InternalSlideOMatic.g:643:3: ( rule__AnimationType__Alternatives )
            {
             before(grammarAccess.getAnimationTypeAccess().getAlternatives()); 
            // InternalSlideOMatic.g:644:3: ( rule__AnimationType__Alternatives )
            // InternalSlideOMatic.g:644:4: rule__AnimationType__Alternatives
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
    // InternalSlideOMatic.g:652:1: rule__Presentation__Alternatives_4 : ( ( ( rule__Presentation__SlidesAssignment_4_0 ) ) | ( ( rule__Presentation__AnimationsAssignment_4_1 ) ) );
    public final void rule__Presentation__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:656:1: ( ( ( rule__Presentation__SlidesAssignment_4_0 ) ) | ( ( rule__Presentation__AnimationsAssignment_4_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==76) ) {
                alt1=1;
            }
            else if ( (LA1_0==92) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalSlideOMatic.g:657:2: ( ( rule__Presentation__SlidesAssignment_4_0 ) )
                    {
                    // InternalSlideOMatic.g:657:2: ( ( rule__Presentation__SlidesAssignment_4_0 ) )
                    // InternalSlideOMatic.g:658:3: ( rule__Presentation__SlidesAssignment_4_0 )
                    {
                     before(grammarAccess.getPresentationAccess().getSlidesAssignment_4_0()); 
                    // InternalSlideOMatic.g:659:3: ( rule__Presentation__SlidesAssignment_4_0 )
                    // InternalSlideOMatic.g:659:4: rule__Presentation__SlidesAssignment_4_0
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
                    // InternalSlideOMatic.g:663:2: ( ( rule__Presentation__AnimationsAssignment_4_1 ) )
                    {
                    // InternalSlideOMatic.g:663:2: ( ( rule__Presentation__AnimationsAssignment_4_1 ) )
                    // InternalSlideOMatic.g:664:3: ( rule__Presentation__AnimationsAssignment_4_1 )
                    {
                     before(grammarAccess.getPresentationAccess().getAnimationsAssignment_4_1()); 
                    // InternalSlideOMatic.g:665:3: ( rule__Presentation__AnimationsAssignment_4_1 )
                    // InternalSlideOMatic.g:665:4: rule__Presentation__AnimationsAssignment_4_1
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


    // $ANTLR start "rule__Setting__Alternatives"
    // InternalSlideOMatic.g:673:1: rule__Setting__Alternatives : ( ( ruleTheme ) | ( ruleAuthor ) | ( ruleDate ) );
    public final void rule__Setting__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:677:1: ( ( ruleTheme ) | ( ruleAuthor ) | ( ruleDate ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 72:
                {
                alt2=1;
                }
                break;
            case 74:
                {
                alt2=2;
                }
                break;
            case 75:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalSlideOMatic.g:678:2: ( ruleTheme )
                    {
                    // InternalSlideOMatic.g:678:2: ( ruleTheme )
                    // InternalSlideOMatic.g:679:3: ruleTheme
                    {
                     before(grammarAccess.getSettingAccess().getThemeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleTheme();

                    state._fsp--;

                     after(grammarAccess.getSettingAccess().getThemeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSlideOMatic.g:684:2: ( ruleAuthor )
                    {
                    // InternalSlideOMatic.g:684:2: ( ruleAuthor )
                    // InternalSlideOMatic.g:685:3: ruleAuthor
                    {
                     before(grammarAccess.getSettingAccess().getAuthorParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleAuthor();

                    state._fsp--;

                     after(grammarAccess.getSettingAccess().getAuthorParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSlideOMatic.g:690:2: ( ruleDate )
                    {
                    // InternalSlideOMatic.g:690:2: ( ruleDate )
                    // InternalSlideOMatic.g:691:3: ruleDate
                    {
                     before(grammarAccess.getSettingAccess().getDateParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleDate();

                    state._fsp--;

                     after(grammarAccess.getSettingAccess().getDateParserRuleCall_2()); 

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
    // $ANTLR end "rule__Setting__Alternatives"


    // $ANTLR start "rule__BeamerTheme__Alternatives"
    // InternalSlideOMatic.g:700:1: rule__BeamerTheme__Alternatives : ( ( 'AnnArbor' ) | ( 'Antibes' ) | ( 'Bergen' ) | ( 'Berkeley' ) | ( 'Berlin' ) | ( 'Boadilla' ) | ( 'boxes' ) | ( 'CambridgeUS' ) | ( 'Copenhagen' ) | ( 'Darmstadt' ) | ( 'default' ) | ( 'Dresden' ) | ( 'Frankfurt' ) | ( 'Goettingen' ) | ( 'Hannover' ) | ( 'Ilmanau' ) | ( 'JuanLesPins' ) | ( 'Luebeck' ) | ( 'Madrid' ) | ( 'Malmoe' ) | ( 'Marburg' ) | ( 'Montpellier' ) | ( 'PaloAlto' ) | ( 'Pittsburgh' ) | ( 'Rochester' ) | ( 'Singapore' ) | ( 'Szeged' ) | ( 'Warsaw' ) );
    public final void rule__BeamerTheme__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:704:1: ( ( 'AnnArbor' ) | ( 'Antibes' ) | ( 'Bergen' ) | ( 'Berkeley' ) | ( 'Berlin' ) | ( 'Boadilla' ) | ( 'boxes' ) | ( 'CambridgeUS' ) | ( 'Copenhagen' ) | ( 'Darmstadt' ) | ( 'default' ) | ( 'Dresden' ) | ( 'Frankfurt' ) | ( 'Goettingen' ) | ( 'Hannover' ) | ( 'Ilmanau' ) | ( 'JuanLesPins' ) | ( 'Luebeck' ) | ( 'Madrid' ) | ( 'Malmoe' ) | ( 'Marburg' ) | ( 'Montpellier' ) | ( 'PaloAlto' ) | ( 'Pittsburgh' ) | ( 'Rochester' ) | ( 'Singapore' ) | ( 'Szeged' ) | ( 'Warsaw' ) )
            int alt3=28;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt3=1;
                }
                break;
            case 13:
                {
                alt3=2;
                }
                break;
            case 14:
                {
                alt3=3;
                }
                break;
            case 15:
                {
                alt3=4;
                }
                break;
            case 16:
                {
                alt3=5;
                }
                break;
            case 17:
                {
                alt3=6;
                }
                break;
            case 18:
                {
                alt3=7;
                }
                break;
            case 19:
                {
                alt3=8;
                }
                break;
            case 20:
                {
                alt3=9;
                }
                break;
            case 21:
                {
                alt3=10;
                }
                break;
            case 22:
                {
                alt3=11;
                }
                break;
            case 23:
                {
                alt3=12;
                }
                break;
            case 24:
                {
                alt3=13;
                }
                break;
            case 25:
                {
                alt3=14;
                }
                break;
            case 26:
                {
                alt3=15;
                }
                break;
            case 27:
                {
                alt3=16;
                }
                break;
            case 28:
                {
                alt3=17;
                }
                break;
            case 29:
                {
                alt3=18;
                }
                break;
            case 30:
                {
                alt3=19;
                }
                break;
            case 31:
                {
                alt3=20;
                }
                break;
            case 32:
                {
                alt3=21;
                }
                break;
            case 33:
                {
                alt3=22;
                }
                break;
            case 34:
                {
                alt3=23;
                }
                break;
            case 35:
                {
                alt3=24;
                }
                break;
            case 36:
                {
                alt3=25;
                }
                break;
            case 37:
                {
                alt3=26;
                }
                break;
            case 38:
                {
                alt3=27;
                }
                break;
            case 39:
                {
                alt3=28;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalSlideOMatic.g:705:2: ( 'AnnArbor' )
                    {
                    // InternalSlideOMatic.g:705:2: ( 'AnnArbor' )
                    // InternalSlideOMatic.g:706:3: 'AnnArbor'
                    {
                     before(grammarAccess.getBeamerThemeAccess().getAnnArborKeyword_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getBeamerThemeAccess().getAnnArborKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSlideOMatic.g:711:2: ( 'Antibes' )
                    {
                    // InternalSlideOMatic.g:711:2: ( 'Antibes' )
                    // InternalSlideOMatic.g:712:3: 'Antibes'
                    {
                     before(grammarAccess.getBeamerThemeAccess().getAntibesKeyword_1()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getBeamerThemeAccess().getAntibesKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSlideOMatic.g:717:2: ( 'Bergen' )
                    {
                    // InternalSlideOMatic.g:717:2: ( 'Bergen' )
                    // InternalSlideOMatic.g:718:3: 'Bergen'
                    {
                     before(grammarAccess.getBeamerThemeAccess().getBergenKeyword_2()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getBeamerThemeAccess().getBergenKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSlideOMatic.g:723:2: ( 'Berkeley' )
                    {
                    // InternalSlideOMatic.g:723:2: ( 'Berkeley' )
                    // InternalSlideOMatic.g:724:3: 'Berkeley'
                    {
                     before(grammarAccess.getBeamerThemeAccess().getBerkeleyKeyword_3()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getBeamerThemeAccess().getBerkeleyKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSlideOMatic.g:729:2: ( 'Berlin' )
                    {
                    // InternalSlideOMatic.g:729:2: ( 'Berlin' )
                    // InternalSlideOMatic.g:730:3: 'Berlin'
                    {
                     before(grammarAccess.getBeamerThemeAccess().getBerlinKeyword_4()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getBeamerThemeAccess().getBerlinKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalSlideOMatic.g:735:2: ( 'Boadilla' )
                    {
                    // InternalSlideOMatic.g:735:2: ( 'Boadilla' )
                    // InternalSlideOMatic.g:736:3: 'Boadilla'
                    {
                     before(grammarAccess.getBeamerThemeAccess().getBoadillaKeyword_5()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getBeamerThemeAccess().getBoadillaKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalSlideOMatic.g:741:2: ( 'boxes' )
                    {
                    // InternalSlideOMatic.g:741:2: ( 'boxes' )
                    // InternalSlideOMatic.g:742:3: 'boxes'
                    {
                     before(grammarAccess.getBeamerThemeAccess().getBoxesKeyword_6()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getBeamerThemeAccess().getBoxesKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalSlideOMatic.g:747:2: ( 'CambridgeUS' )
                    {
                    // InternalSlideOMatic.g:747:2: ( 'CambridgeUS' )
                    // InternalSlideOMatic.g:748:3: 'CambridgeUS'
                    {
                     before(grammarAccess.getBeamerThemeAccess().getCambridgeUSKeyword_7()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getBeamerThemeAccess().getCambridgeUSKeyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalSlideOMatic.g:753:2: ( 'Copenhagen' )
                    {
                    // InternalSlideOMatic.g:753:2: ( 'Copenhagen' )
                    // InternalSlideOMatic.g:754:3: 'Copenhagen'
                    {
                     before(grammarAccess.getBeamerThemeAccess().getCopenhagenKeyword_8()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getBeamerThemeAccess().getCopenhagenKeyword_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalSlideOMatic.g:759:2: ( 'Darmstadt' )
                    {
                    // InternalSlideOMatic.g:759:2: ( 'Darmstadt' )
                    // InternalSlideOMatic.g:760:3: 'Darmstadt'
                    {
                     before(grammarAccess.getBeamerThemeAccess().getDarmstadtKeyword_9()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getBeamerThemeAccess().getDarmstadtKeyword_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalSlideOMatic.g:765:2: ( 'default' )
                    {
                    // InternalSlideOMatic.g:765:2: ( 'default' )
                    // InternalSlideOMatic.g:766:3: 'default'
                    {
                     before(grammarAccess.getBeamerThemeAccess().getDefaultKeyword_10()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getBeamerThemeAccess().getDefaultKeyword_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalSlideOMatic.g:771:2: ( 'Dresden' )
                    {
                    // InternalSlideOMatic.g:771:2: ( 'Dresden' )
                    // InternalSlideOMatic.g:772:3: 'Dresden'
                    {
                     before(grammarAccess.getBeamerThemeAccess().getDresdenKeyword_11()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getBeamerThemeAccess().getDresdenKeyword_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalSlideOMatic.g:777:2: ( 'Frankfurt' )
                    {
                    // InternalSlideOMatic.g:777:2: ( 'Frankfurt' )
                    // InternalSlideOMatic.g:778:3: 'Frankfurt'
                    {
                     before(grammarAccess.getBeamerThemeAccess().getFrankfurtKeyword_12()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getBeamerThemeAccess().getFrankfurtKeyword_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalSlideOMatic.g:783:2: ( 'Goettingen' )
                    {
                    // InternalSlideOMatic.g:783:2: ( 'Goettingen' )
                    // InternalSlideOMatic.g:784:3: 'Goettingen'
                    {
                     before(grammarAccess.getBeamerThemeAccess().getGoettingenKeyword_13()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getBeamerThemeAccess().getGoettingenKeyword_13()); 

                    }


                    }
                    break;
                case 15 :
                    // InternalSlideOMatic.g:789:2: ( 'Hannover' )
                    {
                    // InternalSlideOMatic.g:789:2: ( 'Hannover' )
                    // InternalSlideOMatic.g:790:3: 'Hannover'
                    {
                     before(grammarAccess.getBeamerThemeAccess().getHannoverKeyword_14()); 
                    match(input,26,FOLLOW_2); 
                     after(grammarAccess.getBeamerThemeAccess().getHannoverKeyword_14()); 

                    }


                    }
                    break;
                case 16 :
                    // InternalSlideOMatic.g:795:2: ( 'Ilmanau' )
                    {
                    // InternalSlideOMatic.g:795:2: ( 'Ilmanau' )
                    // InternalSlideOMatic.g:796:3: 'Ilmanau'
                    {
                     before(grammarAccess.getBeamerThemeAccess().getIlmanauKeyword_15()); 
                    match(input,27,FOLLOW_2); 
                     after(grammarAccess.getBeamerThemeAccess().getIlmanauKeyword_15()); 

                    }


                    }
                    break;
                case 17 :
                    // InternalSlideOMatic.g:801:2: ( 'JuanLesPins' )
                    {
                    // InternalSlideOMatic.g:801:2: ( 'JuanLesPins' )
                    // InternalSlideOMatic.g:802:3: 'JuanLesPins'
                    {
                     before(grammarAccess.getBeamerThemeAccess().getJuanLesPinsKeyword_16()); 
                    match(input,28,FOLLOW_2); 
                     after(grammarAccess.getBeamerThemeAccess().getJuanLesPinsKeyword_16()); 

                    }


                    }
                    break;
                case 18 :
                    // InternalSlideOMatic.g:807:2: ( 'Luebeck' )
                    {
                    // InternalSlideOMatic.g:807:2: ( 'Luebeck' )
                    // InternalSlideOMatic.g:808:3: 'Luebeck'
                    {
                     before(grammarAccess.getBeamerThemeAccess().getLuebeckKeyword_17()); 
                    match(input,29,FOLLOW_2); 
                     after(grammarAccess.getBeamerThemeAccess().getLuebeckKeyword_17()); 

                    }


                    }
                    break;
                case 19 :
                    // InternalSlideOMatic.g:813:2: ( 'Madrid' )
                    {
                    // InternalSlideOMatic.g:813:2: ( 'Madrid' )
                    // InternalSlideOMatic.g:814:3: 'Madrid'
                    {
                     before(grammarAccess.getBeamerThemeAccess().getMadridKeyword_18()); 
                    match(input,30,FOLLOW_2); 
                     after(grammarAccess.getBeamerThemeAccess().getMadridKeyword_18()); 

                    }


                    }
                    break;
                case 20 :
                    // InternalSlideOMatic.g:819:2: ( 'Malmoe' )
                    {
                    // InternalSlideOMatic.g:819:2: ( 'Malmoe' )
                    // InternalSlideOMatic.g:820:3: 'Malmoe'
                    {
                     before(grammarAccess.getBeamerThemeAccess().getMalmoeKeyword_19()); 
                    match(input,31,FOLLOW_2); 
                     after(grammarAccess.getBeamerThemeAccess().getMalmoeKeyword_19()); 

                    }


                    }
                    break;
                case 21 :
                    // InternalSlideOMatic.g:825:2: ( 'Marburg' )
                    {
                    // InternalSlideOMatic.g:825:2: ( 'Marburg' )
                    // InternalSlideOMatic.g:826:3: 'Marburg'
                    {
                     before(grammarAccess.getBeamerThemeAccess().getMarburgKeyword_20()); 
                    match(input,32,FOLLOW_2); 
                     after(grammarAccess.getBeamerThemeAccess().getMarburgKeyword_20()); 

                    }


                    }
                    break;
                case 22 :
                    // InternalSlideOMatic.g:831:2: ( 'Montpellier' )
                    {
                    // InternalSlideOMatic.g:831:2: ( 'Montpellier' )
                    // InternalSlideOMatic.g:832:3: 'Montpellier'
                    {
                     before(grammarAccess.getBeamerThemeAccess().getMontpellierKeyword_21()); 
                    match(input,33,FOLLOW_2); 
                     after(grammarAccess.getBeamerThemeAccess().getMontpellierKeyword_21()); 

                    }


                    }
                    break;
                case 23 :
                    // InternalSlideOMatic.g:837:2: ( 'PaloAlto' )
                    {
                    // InternalSlideOMatic.g:837:2: ( 'PaloAlto' )
                    // InternalSlideOMatic.g:838:3: 'PaloAlto'
                    {
                     before(grammarAccess.getBeamerThemeAccess().getPaloAltoKeyword_22()); 
                    match(input,34,FOLLOW_2); 
                     after(grammarAccess.getBeamerThemeAccess().getPaloAltoKeyword_22()); 

                    }


                    }
                    break;
                case 24 :
                    // InternalSlideOMatic.g:843:2: ( 'Pittsburgh' )
                    {
                    // InternalSlideOMatic.g:843:2: ( 'Pittsburgh' )
                    // InternalSlideOMatic.g:844:3: 'Pittsburgh'
                    {
                     before(grammarAccess.getBeamerThemeAccess().getPittsburghKeyword_23()); 
                    match(input,35,FOLLOW_2); 
                     after(grammarAccess.getBeamerThemeAccess().getPittsburghKeyword_23()); 

                    }


                    }
                    break;
                case 25 :
                    // InternalSlideOMatic.g:849:2: ( 'Rochester' )
                    {
                    // InternalSlideOMatic.g:849:2: ( 'Rochester' )
                    // InternalSlideOMatic.g:850:3: 'Rochester'
                    {
                     before(grammarAccess.getBeamerThemeAccess().getRochesterKeyword_24()); 
                    match(input,36,FOLLOW_2); 
                     after(grammarAccess.getBeamerThemeAccess().getRochesterKeyword_24()); 

                    }


                    }
                    break;
                case 26 :
                    // InternalSlideOMatic.g:855:2: ( 'Singapore' )
                    {
                    // InternalSlideOMatic.g:855:2: ( 'Singapore' )
                    // InternalSlideOMatic.g:856:3: 'Singapore'
                    {
                     before(grammarAccess.getBeamerThemeAccess().getSingaporeKeyword_25()); 
                    match(input,37,FOLLOW_2); 
                     after(grammarAccess.getBeamerThemeAccess().getSingaporeKeyword_25()); 

                    }


                    }
                    break;
                case 27 :
                    // InternalSlideOMatic.g:861:2: ( 'Szeged' )
                    {
                    // InternalSlideOMatic.g:861:2: ( 'Szeged' )
                    // InternalSlideOMatic.g:862:3: 'Szeged'
                    {
                     before(grammarAccess.getBeamerThemeAccess().getSzegedKeyword_26()); 
                    match(input,38,FOLLOW_2); 
                     after(grammarAccess.getBeamerThemeAccess().getSzegedKeyword_26()); 

                    }


                    }
                    break;
                case 28 :
                    // InternalSlideOMatic.g:867:2: ( 'Warsaw' )
                    {
                    // InternalSlideOMatic.g:867:2: ( 'Warsaw' )
                    // InternalSlideOMatic.g:868:3: 'Warsaw'
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
    // InternalSlideOMatic.g:877:1: rule__ThemeColor__Alternatives : ( ( 'albatros' ) | ( 'beaver' ) | ( 'beetle' ) | ( 'crane' ) | ( 'default' ) | ( 'dolphin' ) | ( 'dove' ) | ( 'fly' ) | ( 'lily' ) | ( 'orchid' ) | ( 'rose' ) | ( 'seagull' ) | ( 'seahorse' ) | ( 'sidebartab' ) | ( 'structure' ) | ( 'whale' ) | ( 'wolverine' ) );
    public final void rule__ThemeColor__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:881:1: ( ( 'albatros' ) | ( 'beaver' ) | ( 'beetle' ) | ( 'crane' ) | ( 'default' ) | ( 'dolphin' ) | ( 'dove' ) | ( 'fly' ) | ( 'lily' ) | ( 'orchid' ) | ( 'rose' ) | ( 'seagull' ) | ( 'seahorse' ) | ( 'sidebartab' ) | ( 'structure' ) | ( 'whale' ) | ( 'wolverine' ) )
            int alt4=17;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt4=1;
                }
                break;
            case 41:
                {
                alt4=2;
                }
                break;
            case 42:
                {
                alt4=3;
                }
                break;
            case 43:
                {
                alt4=4;
                }
                break;
            case 22:
                {
                alt4=5;
                }
                break;
            case 44:
                {
                alt4=6;
                }
                break;
            case 45:
                {
                alt4=7;
                }
                break;
            case 46:
                {
                alt4=8;
                }
                break;
            case 47:
                {
                alt4=9;
                }
                break;
            case 48:
                {
                alt4=10;
                }
                break;
            case 49:
                {
                alt4=11;
                }
                break;
            case 50:
                {
                alt4=12;
                }
                break;
            case 51:
                {
                alt4=13;
                }
                break;
            case 52:
                {
                alt4=14;
                }
                break;
            case 53:
                {
                alt4=15;
                }
                break;
            case 54:
                {
                alt4=16;
                }
                break;
            case 55:
                {
                alt4=17;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalSlideOMatic.g:882:2: ( 'albatros' )
                    {
                    // InternalSlideOMatic.g:882:2: ( 'albatros' )
                    // InternalSlideOMatic.g:883:3: 'albatros'
                    {
                     before(grammarAccess.getThemeColorAccess().getAlbatrosKeyword_0()); 
                    match(input,40,FOLLOW_2); 
                     after(grammarAccess.getThemeColorAccess().getAlbatrosKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSlideOMatic.g:888:2: ( 'beaver' )
                    {
                    // InternalSlideOMatic.g:888:2: ( 'beaver' )
                    // InternalSlideOMatic.g:889:3: 'beaver'
                    {
                     before(grammarAccess.getThemeColorAccess().getBeaverKeyword_1()); 
                    match(input,41,FOLLOW_2); 
                     after(grammarAccess.getThemeColorAccess().getBeaverKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSlideOMatic.g:894:2: ( 'beetle' )
                    {
                    // InternalSlideOMatic.g:894:2: ( 'beetle' )
                    // InternalSlideOMatic.g:895:3: 'beetle'
                    {
                     before(grammarAccess.getThemeColorAccess().getBeetleKeyword_2()); 
                    match(input,42,FOLLOW_2); 
                     after(grammarAccess.getThemeColorAccess().getBeetleKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSlideOMatic.g:900:2: ( 'crane' )
                    {
                    // InternalSlideOMatic.g:900:2: ( 'crane' )
                    // InternalSlideOMatic.g:901:3: 'crane'
                    {
                     before(grammarAccess.getThemeColorAccess().getCraneKeyword_3()); 
                    match(input,43,FOLLOW_2); 
                     after(grammarAccess.getThemeColorAccess().getCraneKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSlideOMatic.g:906:2: ( 'default' )
                    {
                    // InternalSlideOMatic.g:906:2: ( 'default' )
                    // InternalSlideOMatic.g:907:3: 'default'
                    {
                     before(grammarAccess.getThemeColorAccess().getDefaultKeyword_4()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getThemeColorAccess().getDefaultKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalSlideOMatic.g:912:2: ( 'dolphin' )
                    {
                    // InternalSlideOMatic.g:912:2: ( 'dolphin' )
                    // InternalSlideOMatic.g:913:3: 'dolphin'
                    {
                     before(grammarAccess.getThemeColorAccess().getDolphinKeyword_5()); 
                    match(input,44,FOLLOW_2); 
                     after(grammarAccess.getThemeColorAccess().getDolphinKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalSlideOMatic.g:918:2: ( 'dove' )
                    {
                    // InternalSlideOMatic.g:918:2: ( 'dove' )
                    // InternalSlideOMatic.g:919:3: 'dove'
                    {
                     before(grammarAccess.getThemeColorAccess().getDoveKeyword_6()); 
                    match(input,45,FOLLOW_2); 
                     after(grammarAccess.getThemeColorAccess().getDoveKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalSlideOMatic.g:924:2: ( 'fly' )
                    {
                    // InternalSlideOMatic.g:924:2: ( 'fly' )
                    // InternalSlideOMatic.g:925:3: 'fly'
                    {
                     before(grammarAccess.getThemeColorAccess().getFlyKeyword_7()); 
                    match(input,46,FOLLOW_2); 
                     after(grammarAccess.getThemeColorAccess().getFlyKeyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalSlideOMatic.g:930:2: ( 'lily' )
                    {
                    // InternalSlideOMatic.g:930:2: ( 'lily' )
                    // InternalSlideOMatic.g:931:3: 'lily'
                    {
                     before(grammarAccess.getThemeColorAccess().getLilyKeyword_8()); 
                    match(input,47,FOLLOW_2); 
                     after(grammarAccess.getThemeColorAccess().getLilyKeyword_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalSlideOMatic.g:936:2: ( 'orchid' )
                    {
                    // InternalSlideOMatic.g:936:2: ( 'orchid' )
                    // InternalSlideOMatic.g:937:3: 'orchid'
                    {
                     before(grammarAccess.getThemeColorAccess().getOrchidKeyword_9()); 
                    match(input,48,FOLLOW_2); 
                     after(grammarAccess.getThemeColorAccess().getOrchidKeyword_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalSlideOMatic.g:942:2: ( 'rose' )
                    {
                    // InternalSlideOMatic.g:942:2: ( 'rose' )
                    // InternalSlideOMatic.g:943:3: 'rose'
                    {
                     before(grammarAccess.getThemeColorAccess().getRoseKeyword_10()); 
                    match(input,49,FOLLOW_2); 
                     after(grammarAccess.getThemeColorAccess().getRoseKeyword_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalSlideOMatic.g:948:2: ( 'seagull' )
                    {
                    // InternalSlideOMatic.g:948:2: ( 'seagull' )
                    // InternalSlideOMatic.g:949:3: 'seagull'
                    {
                     before(grammarAccess.getThemeColorAccess().getSeagullKeyword_11()); 
                    match(input,50,FOLLOW_2); 
                     after(grammarAccess.getThemeColorAccess().getSeagullKeyword_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalSlideOMatic.g:954:2: ( 'seahorse' )
                    {
                    // InternalSlideOMatic.g:954:2: ( 'seahorse' )
                    // InternalSlideOMatic.g:955:3: 'seahorse'
                    {
                     before(grammarAccess.getThemeColorAccess().getSeahorseKeyword_12()); 
                    match(input,51,FOLLOW_2); 
                     after(grammarAccess.getThemeColorAccess().getSeahorseKeyword_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalSlideOMatic.g:960:2: ( 'sidebartab' )
                    {
                    // InternalSlideOMatic.g:960:2: ( 'sidebartab' )
                    // InternalSlideOMatic.g:961:3: 'sidebartab'
                    {
                     before(grammarAccess.getThemeColorAccess().getSidebartabKeyword_13()); 
                    match(input,52,FOLLOW_2); 
                     after(grammarAccess.getThemeColorAccess().getSidebartabKeyword_13()); 

                    }


                    }
                    break;
                case 15 :
                    // InternalSlideOMatic.g:966:2: ( 'structure' )
                    {
                    // InternalSlideOMatic.g:966:2: ( 'structure' )
                    // InternalSlideOMatic.g:967:3: 'structure'
                    {
                     before(grammarAccess.getThemeColorAccess().getStructureKeyword_14()); 
                    match(input,53,FOLLOW_2); 
                     after(grammarAccess.getThemeColorAccess().getStructureKeyword_14()); 

                    }


                    }
                    break;
                case 16 :
                    // InternalSlideOMatic.g:972:2: ( 'whale' )
                    {
                    // InternalSlideOMatic.g:972:2: ( 'whale' )
                    // InternalSlideOMatic.g:973:3: 'whale'
                    {
                     before(grammarAccess.getThemeColorAccess().getWhaleKeyword_15()); 
                    match(input,54,FOLLOW_2); 
                     after(grammarAccess.getThemeColorAccess().getWhaleKeyword_15()); 

                    }


                    }
                    break;
                case 17 :
                    // InternalSlideOMatic.g:978:2: ( 'wolverine' )
                    {
                    // InternalSlideOMatic.g:978:2: ( 'wolverine' )
                    // InternalSlideOMatic.g:979:3: 'wolverine'
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


    // $ANTLR start "rule__Section__Alternatives"
    // InternalSlideOMatic.g:988:1: rule__Section__Alternatives : ( ( ( rule__Section__Group_0__0 ) ) | ( ( rule__Section__Group_1__0 ) ) | ( ( rule__Section__Group_2__0 ) ) );
    public final void rule__Section__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:992:1: ( ( ( rule__Section__Group_0__0 ) ) | ( ( rule__Section__Group_1__0 ) ) | ( ( rule__Section__Group_2__0 ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 77:
                {
                alt5=1;
                }
                break;
            case 78:
                {
                alt5=2;
                }
                break;
            case 79:
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
                    // InternalSlideOMatic.g:993:2: ( ( rule__Section__Group_0__0 ) )
                    {
                    // InternalSlideOMatic.g:993:2: ( ( rule__Section__Group_0__0 ) )
                    // InternalSlideOMatic.g:994:3: ( rule__Section__Group_0__0 )
                    {
                     before(grammarAccess.getSectionAccess().getGroup_0()); 
                    // InternalSlideOMatic.g:995:3: ( rule__Section__Group_0__0 )
                    // InternalSlideOMatic.g:995:4: rule__Section__Group_0__0
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
                    // InternalSlideOMatic.g:999:2: ( ( rule__Section__Group_1__0 ) )
                    {
                    // InternalSlideOMatic.g:999:2: ( ( rule__Section__Group_1__0 ) )
                    // InternalSlideOMatic.g:1000:3: ( rule__Section__Group_1__0 )
                    {
                     before(grammarAccess.getSectionAccess().getGroup_1()); 
                    // InternalSlideOMatic.g:1001:3: ( rule__Section__Group_1__0 )
                    // InternalSlideOMatic.g:1001:4: rule__Section__Group_1__0
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
                    // InternalSlideOMatic.g:1005:2: ( ( rule__Section__Group_2__0 ) )
                    {
                    // InternalSlideOMatic.g:1005:2: ( ( rule__Section__Group_2__0 ) )
                    // InternalSlideOMatic.g:1006:3: ( rule__Section__Group_2__0 )
                    {
                     before(grammarAccess.getSectionAccess().getGroup_2()); 
                    // InternalSlideOMatic.g:1007:3: ( rule__Section__Group_2__0 )
                    // InternalSlideOMatic.g:1007:4: rule__Section__Group_2__0
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
    // InternalSlideOMatic.g:1015:1: rule__Content__Alternatives : ( ( ( rule__Content__Group_0__0 ) ) | ( ruleText ) | ( ruleList ) | ( ruleFloat ) );
    public final void rule__Content__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1019:1: ( ( ( rule__Content__Group_0__0 ) ) | ( ruleText ) | ( ruleList ) | ( ruleFloat ) )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 80:
                {
                alt6=1;
                }
                break;
            case 81:
            case 82:
                {
                alt6=2;
                }
                break;
            case 83:
            case 84:
                {
                alt6=3;
                }
                break;
            case 85:
            case 88:
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
                    // InternalSlideOMatic.g:1020:2: ( ( rule__Content__Group_0__0 ) )
                    {
                    // InternalSlideOMatic.g:1020:2: ( ( rule__Content__Group_0__0 ) )
                    // InternalSlideOMatic.g:1021:3: ( rule__Content__Group_0__0 )
                    {
                     before(grammarAccess.getContentAccess().getGroup_0()); 
                    // InternalSlideOMatic.g:1022:3: ( rule__Content__Group_0__0 )
                    // InternalSlideOMatic.g:1022:4: rule__Content__Group_0__0
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
                    // InternalSlideOMatic.g:1026:2: ( ruleText )
                    {
                    // InternalSlideOMatic.g:1026:2: ( ruleText )
                    // InternalSlideOMatic.g:1027:3: ruleText
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
                    // InternalSlideOMatic.g:1032:2: ( ruleList )
                    {
                    // InternalSlideOMatic.g:1032:2: ( ruleList )
                    // InternalSlideOMatic.g:1033:3: ruleList
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
                    // InternalSlideOMatic.g:1038:2: ( ruleFloat )
                    {
                    // InternalSlideOMatic.g:1038:2: ( ruleFloat )
                    // InternalSlideOMatic.g:1039:3: ruleFloat
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
    // InternalSlideOMatic.g:1048:1: rule__Text__Alternatives : ( ( ( rule__Text__Group_0__0 ) ) | ( ( rule__Text__Group_1__0 ) ) );
    public final void rule__Text__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1052:1: ( ( ( rule__Text__Group_0__0 ) ) | ( ( rule__Text__Group_1__0 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==81) ) {
                alt7=1;
            }
            else if ( (LA7_0==82) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalSlideOMatic.g:1053:2: ( ( rule__Text__Group_0__0 ) )
                    {
                    // InternalSlideOMatic.g:1053:2: ( ( rule__Text__Group_0__0 ) )
                    // InternalSlideOMatic.g:1054:3: ( rule__Text__Group_0__0 )
                    {
                     before(grammarAccess.getTextAccess().getGroup_0()); 
                    // InternalSlideOMatic.g:1055:3: ( rule__Text__Group_0__0 )
                    // InternalSlideOMatic.g:1055:4: rule__Text__Group_0__0
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
                    // InternalSlideOMatic.g:1059:2: ( ( rule__Text__Group_1__0 ) )
                    {
                    // InternalSlideOMatic.g:1059:2: ( ( rule__Text__Group_1__0 ) )
                    // InternalSlideOMatic.g:1060:3: ( rule__Text__Group_1__0 )
                    {
                     before(grammarAccess.getTextAccess().getGroup_1()); 
                    // InternalSlideOMatic.g:1061:3: ( rule__Text__Group_1__0 )
                    // InternalSlideOMatic.g:1061:4: rule__Text__Group_1__0
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
    // InternalSlideOMatic.g:1069:1: rule__List__Alternatives : ( ( ( ( rule__List__ListItemsAssignment_0 ) ) ( ( rule__List__ListItemsAssignment_0 )* ) ) | ( ( ( rule__List__ListItemsAssignment_1 ) ) ( ( rule__List__ListItemsAssignment_1 )* ) ) );
    public final void rule__List__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1073:1: ( ( ( ( rule__List__ListItemsAssignment_0 ) ) ( ( rule__List__ListItemsAssignment_0 )* ) ) | ( ( ( rule__List__ListItemsAssignment_1 ) ) ( ( rule__List__ListItemsAssignment_1 )* ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==83) ) {
                alt10=1;
            }
            else if ( (LA10_0==84) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalSlideOMatic.g:1074:2: ( ( ( rule__List__ListItemsAssignment_0 ) ) ( ( rule__List__ListItemsAssignment_0 )* ) )
                    {
                    // InternalSlideOMatic.g:1074:2: ( ( ( rule__List__ListItemsAssignment_0 ) ) ( ( rule__List__ListItemsAssignment_0 )* ) )
                    // InternalSlideOMatic.g:1075:3: ( ( rule__List__ListItemsAssignment_0 ) ) ( ( rule__List__ListItemsAssignment_0 )* )
                    {
                    // InternalSlideOMatic.g:1075:3: ( ( rule__List__ListItemsAssignment_0 ) )
                    // InternalSlideOMatic.g:1076:4: ( rule__List__ListItemsAssignment_0 )
                    {
                     before(grammarAccess.getListAccess().getListItemsAssignment_0()); 
                    // InternalSlideOMatic.g:1077:4: ( rule__List__ListItemsAssignment_0 )
                    // InternalSlideOMatic.g:1077:5: rule__List__ListItemsAssignment_0
                    {
                    pushFollow(FOLLOW_3);
                    rule__List__ListItemsAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getListAccess().getListItemsAssignment_0()); 

                    }

                    // InternalSlideOMatic.g:1080:3: ( ( rule__List__ListItemsAssignment_0 )* )
                    // InternalSlideOMatic.g:1081:4: ( rule__List__ListItemsAssignment_0 )*
                    {
                     before(grammarAccess.getListAccess().getListItemsAssignment_0()); 
                    // InternalSlideOMatic.g:1082:4: ( rule__List__ListItemsAssignment_0 )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==83) ) {
                            int LA8_2 = input.LA(2);

                            if ( (LA8_2==RULE_STRING) ) {
                                alt8=1;
                            }


                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalSlideOMatic.g:1082:5: rule__List__ListItemsAssignment_0
                    	    {
                    	    pushFollow(FOLLOW_3);
                    	    rule__List__ListItemsAssignment_0();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                     after(grammarAccess.getListAccess().getListItemsAssignment_0()); 

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSlideOMatic.g:1087:2: ( ( ( rule__List__ListItemsAssignment_1 ) ) ( ( rule__List__ListItemsAssignment_1 )* ) )
                    {
                    // InternalSlideOMatic.g:1087:2: ( ( ( rule__List__ListItemsAssignment_1 ) ) ( ( rule__List__ListItemsAssignment_1 )* ) )
                    // InternalSlideOMatic.g:1088:3: ( ( rule__List__ListItemsAssignment_1 ) ) ( ( rule__List__ListItemsAssignment_1 )* )
                    {
                    // InternalSlideOMatic.g:1088:3: ( ( rule__List__ListItemsAssignment_1 ) )
                    // InternalSlideOMatic.g:1089:4: ( rule__List__ListItemsAssignment_1 )
                    {
                     before(grammarAccess.getListAccess().getListItemsAssignment_1()); 
                    // InternalSlideOMatic.g:1090:4: ( rule__List__ListItemsAssignment_1 )
                    // InternalSlideOMatic.g:1090:5: rule__List__ListItemsAssignment_1
                    {
                    pushFollow(FOLLOW_4);
                    rule__List__ListItemsAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getListAccess().getListItemsAssignment_1()); 

                    }

                    // InternalSlideOMatic.g:1093:3: ( ( rule__List__ListItemsAssignment_1 )* )
                    // InternalSlideOMatic.g:1094:4: ( rule__List__ListItemsAssignment_1 )*
                    {
                     before(grammarAccess.getListAccess().getListItemsAssignment_1()); 
                    // InternalSlideOMatic.g:1095:4: ( rule__List__ListItemsAssignment_1 )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==84) ) {
                            int LA9_2 = input.LA(2);

                            if ( (LA9_2==RULE_STRING) ) {
                                alt9=1;
                            }


                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalSlideOMatic.g:1095:5: rule__List__ListItemsAssignment_1
                    	    {
                    	    pushFollow(FOLLOW_4);
                    	    rule__List__ListItemsAssignment_1();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                     after(grammarAccess.getListAccess().getListItemsAssignment_1()); 

                    }


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
    // InternalSlideOMatic.g:1104:1: rule__Float__Alternatives : ( ( ruleImage ) | ( ruleTable ) );
    public final void rule__Float__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1108:1: ( ( ruleImage ) | ( ruleTable ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==85) ) {
                alt11=1;
            }
            else if ( (LA11_0==88) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalSlideOMatic.g:1109:2: ( ruleImage )
                    {
                    // InternalSlideOMatic.g:1109:2: ( ruleImage )
                    // InternalSlideOMatic.g:1110:3: ruleImage
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
                    // InternalSlideOMatic.g:1115:2: ( ruleTable )
                    {
                    // InternalSlideOMatic.g:1115:2: ( ruleTable )
                    // InternalSlideOMatic.g:1116:3: ruleTable
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
    // InternalSlideOMatic.g:1125:1: rule__Alignment__Alternatives : ( ( 'topleft' ) | ( 'top' ) | ( 'topright' ) | ( 'left' ) | ( 'center' ) | ( 'right' ) | ( 'bottomleft' ) | ( 'bottom' ) | ( 'bottomright' ) );
    public final void rule__Alignment__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1129:1: ( ( 'topleft' ) | ( 'top' ) | ( 'topright' ) | ( 'left' ) | ( 'center' ) | ( 'right' ) | ( 'bottomleft' ) | ( 'bottom' ) | ( 'bottomright' ) )
            int alt12=9;
            switch ( input.LA(1) ) {
            case 56:
                {
                alt12=1;
                }
                break;
            case 57:
                {
                alt12=2;
                }
                break;
            case 58:
                {
                alt12=3;
                }
                break;
            case 59:
                {
                alt12=4;
                }
                break;
            case 60:
                {
                alt12=5;
                }
                break;
            case 61:
                {
                alt12=6;
                }
                break;
            case 62:
                {
                alt12=7;
                }
                break;
            case 63:
                {
                alt12=8;
                }
                break;
            case 64:
                {
                alt12=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalSlideOMatic.g:1130:2: ( 'topleft' )
                    {
                    // InternalSlideOMatic.g:1130:2: ( 'topleft' )
                    // InternalSlideOMatic.g:1131:3: 'topleft'
                    {
                     before(grammarAccess.getAlignmentAccess().getTopleftKeyword_0()); 
                    match(input,56,FOLLOW_2); 
                     after(grammarAccess.getAlignmentAccess().getTopleftKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSlideOMatic.g:1136:2: ( 'top' )
                    {
                    // InternalSlideOMatic.g:1136:2: ( 'top' )
                    // InternalSlideOMatic.g:1137:3: 'top'
                    {
                     before(grammarAccess.getAlignmentAccess().getTopKeyword_1()); 
                    match(input,57,FOLLOW_2); 
                     after(grammarAccess.getAlignmentAccess().getTopKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSlideOMatic.g:1142:2: ( 'topright' )
                    {
                    // InternalSlideOMatic.g:1142:2: ( 'topright' )
                    // InternalSlideOMatic.g:1143:3: 'topright'
                    {
                     before(grammarAccess.getAlignmentAccess().getToprightKeyword_2()); 
                    match(input,58,FOLLOW_2); 
                     after(grammarAccess.getAlignmentAccess().getToprightKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSlideOMatic.g:1148:2: ( 'left' )
                    {
                    // InternalSlideOMatic.g:1148:2: ( 'left' )
                    // InternalSlideOMatic.g:1149:3: 'left'
                    {
                     before(grammarAccess.getAlignmentAccess().getLeftKeyword_3()); 
                    match(input,59,FOLLOW_2); 
                     after(grammarAccess.getAlignmentAccess().getLeftKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSlideOMatic.g:1154:2: ( 'center' )
                    {
                    // InternalSlideOMatic.g:1154:2: ( 'center' )
                    // InternalSlideOMatic.g:1155:3: 'center'
                    {
                     before(grammarAccess.getAlignmentAccess().getCenterKeyword_4()); 
                    match(input,60,FOLLOW_2); 
                     after(grammarAccess.getAlignmentAccess().getCenterKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalSlideOMatic.g:1160:2: ( 'right' )
                    {
                    // InternalSlideOMatic.g:1160:2: ( 'right' )
                    // InternalSlideOMatic.g:1161:3: 'right'
                    {
                     before(grammarAccess.getAlignmentAccess().getRightKeyword_5()); 
                    match(input,61,FOLLOW_2); 
                     after(grammarAccess.getAlignmentAccess().getRightKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalSlideOMatic.g:1166:2: ( 'bottomleft' )
                    {
                    // InternalSlideOMatic.g:1166:2: ( 'bottomleft' )
                    // InternalSlideOMatic.g:1167:3: 'bottomleft'
                    {
                     before(grammarAccess.getAlignmentAccess().getBottomleftKeyword_6()); 
                    match(input,62,FOLLOW_2); 
                     after(grammarAccess.getAlignmentAccess().getBottomleftKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalSlideOMatic.g:1172:2: ( 'bottom' )
                    {
                    // InternalSlideOMatic.g:1172:2: ( 'bottom' )
                    // InternalSlideOMatic.g:1173:3: 'bottom'
                    {
                     before(grammarAccess.getAlignmentAccess().getBottomKeyword_7()); 
                    match(input,63,FOLLOW_2); 
                     after(grammarAccess.getAlignmentAccess().getBottomKeyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalSlideOMatic.g:1178:2: ( 'bottomright' )
                    {
                    // InternalSlideOMatic.g:1178:2: ( 'bottomright' )
                    // InternalSlideOMatic.g:1179:3: 'bottomright'
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
    // InternalSlideOMatic.g:1188:1: rule__Size__Alternatives_0 : ( ( 'width' ) | ( 'height' ) );
    public final void rule__Size__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1192:1: ( ( 'width' ) | ( 'height' ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==65) ) {
                alt13=1;
            }
            else if ( (LA13_0==66) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalSlideOMatic.g:1193:2: ( 'width' )
                    {
                    // InternalSlideOMatic.g:1193:2: ( 'width' )
                    // InternalSlideOMatic.g:1194:3: 'width'
                    {
                     before(grammarAccess.getSizeAccess().getWidthKeyword_0_0()); 
                    match(input,65,FOLLOW_2); 
                     after(grammarAccess.getSizeAccess().getWidthKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSlideOMatic.g:1199:2: ( 'height' )
                    {
                    // InternalSlideOMatic.g:1199:2: ( 'height' )
                    // InternalSlideOMatic.g:1200:3: 'height'
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
    // InternalSlideOMatic.g:1209:1: rule__AnimationType__Alternatives : ( ( ( rule__AnimationType__Group_0__0 ) ) | ( ( rule__AnimationType__Group_1__0 ) ) );
    public final void rule__AnimationType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1213:1: ( ( ( rule__AnimationType__Group_0__0 ) ) | ( ( rule__AnimationType__Group_1__0 ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==94) ) {
                alt14=1;
            }
            else if ( (LA14_0==95) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalSlideOMatic.g:1214:2: ( ( rule__AnimationType__Group_0__0 ) )
                    {
                    // InternalSlideOMatic.g:1214:2: ( ( rule__AnimationType__Group_0__0 ) )
                    // InternalSlideOMatic.g:1215:3: ( rule__AnimationType__Group_0__0 )
                    {
                     before(grammarAccess.getAnimationTypeAccess().getGroup_0()); 
                    // InternalSlideOMatic.g:1216:3: ( rule__AnimationType__Group_0__0 )
                    // InternalSlideOMatic.g:1216:4: rule__AnimationType__Group_0__0
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
                    // InternalSlideOMatic.g:1220:2: ( ( rule__AnimationType__Group_1__0 ) )
                    {
                    // InternalSlideOMatic.g:1220:2: ( ( rule__AnimationType__Group_1__0 ) )
                    // InternalSlideOMatic.g:1221:3: ( rule__AnimationType__Group_1__0 )
                    {
                     before(grammarAccess.getAnimationTypeAccess().getGroup_1()); 
                    // InternalSlideOMatic.g:1222:3: ( rule__AnimationType__Group_1__0 )
                    // InternalSlideOMatic.g:1222:4: rule__AnimationType__Group_1__0
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
    // InternalSlideOMatic.g:1230:1: rule__Presentation__Group__0 : rule__Presentation__Group__0__Impl rule__Presentation__Group__1 ;
    public final void rule__Presentation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1234:1: ( rule__Presentation__Group__0__Impl rule__Presentation__Group__1 )
            // InternalSlideOMatic.g:1235:2: rule__Presentation__Group__0__Impl rule__Presentation__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalSlideOMatic.g:1242:1: rule__Presentation__Group__0__Impl : ( 'presentation' ) ;
    public final void rule__Presentation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1246:1: ( ( 'presentation' ) )
            // InternalSlideOMatic.g:1247:1: ( 'presentation' )
            {
            // InternalSlideOMatic.g:1247:1: ( 'presentation' )
            // InternalSlideOMatic.g:1248:2: 'presentation'
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
    // InternalSlideOMatic.g:1257:1: rule__Presentation__Group__1 : rule__Presentation__Group__1__Impl rule__Presentation__Group__2 ;
    public final void rule__Presentation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1261:1: ( rule__Presentation__Group__1__Impl rule__Presentation__Group__2 )
            // InternalSlideOMatic.g:1262:2: rule__Presentation__Group__1__Impl rule__Presentation__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalSlideOMatic.g:1269:1: rule__Presentation__Group__1__Impl : ( ( rule__Presentation__NameAssignment_1 ) ) ;
    public final void rule__Presentation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1273:1: ( ( ( rule__Presentation__NameAssignment_1 ) ) )
            // InternalSlideOMatic.g:1274:1: ( ( rule__Presentation__NameAssignment_1 ) )
            {
            // InternalSlideOMatic.g:1274:1: ( ( rule__Presentation__NameAssignment_1 ) )
            // InternalSlideOMatic.g:1275:2: ( rule__Presentation__NameAssignment_1 )
            {
             before(grammarAccess.getPresentationAccess().getNameAssignment_1()); 
            // InternalSlideOMatic.g:1276:2: ( rule__Presentation__NameAssignment_1 )
            // InternalSlideOMatic.g:1276:3: rule__Presentation__NameAssignment_1
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
    // InternalSlideOMatic.g:1284:1: rule__Presentation__Group__2 : rule__Presentation__Group__2__Impl rule__Presentation__Group__3 ;
    public final void rule__Presentation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1288:1: ( rule__Presentation__Group__2__Impl rule__Presentation__Group__3 )
            // InternalSlideOMatic.g:1289:2: rule__Presentation__Group__2__Impl rule__Presentation__Group__3
            {
            pushFollow(FOLLOW_7);
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
    // InternalSlideOMatic.g:1296:1: rule__Presentation__Group__2__Impl : ( '{' ) ;
    public final void rule__Presentation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1300:1: ( ( '{' ) )
            // InternalSlideOMatic.g:1301:1: ( '{' )
            {
            // InternalSlideOMatic.g:1301:1: ( '{' )
            // InternalSlideOMatic.g:1302:2: '{'
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
    // InternalSlideOMatic.g:1311:1: rule__Presentation__Group__3 : rule__Presentation__Group__3__Impl rule__Presentation__Group__4 ;
    public final void rule__Presentation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1315:1: ( rule__Presentation__Group__3__Impl rule__Presentation__Group__4 )
            // InternalSlideOMatic.g:1316:2: rule__Presentation__Group__3__Impl rule__Presentation__Group__4
            {
            pushFollow(FOLLOW_8);
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
    // InternalSlideOMatic.g:1323:1: rule__Presentation__Group__3__Impl : ( ( ( rule__Presentation__Group_3__0 ) ) ( ( rule__Presentation__Group_3__0 )* ) ) ;
    public final void rule__Presentation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1327:1: ( ( ( ( rule__Presentation__Group_3__0 ) ) ( ( rule__Presentation__Group_3__0 )* ) ) )
            // InternalSlideOMatic.g:1328:1: ( ( ( rule__Presentation__Group_3__0 ) ) ( ( rule__Presentation__Group_3__0 )* ) )
            {
            // InternalSlideOMatic.g:1328:1: ( ( ( rule__Presentation__Group_3__0 ) ) ( ( rule__Presentation__Group_3__0 )* ) )
            // InternalSlideOMatic.g:1329:2: ( ( rule__Presentation__Group_3__0 ) ) ( ( rule__Presentation__Group_3__0 )* )
            {
            // InternalSlideOMatic.g:1329:2: ( ( rule__Presentation__Group_3__0 ) )
            // InternalSlideOMatic.g:1330:3: ( rule__Presentation__Group_3__0 )
            {
             before(grammarAccess.getPresentationAccess().getGroup_3()); 
            // InternalSlideOMatic.g:1331:3: ( rule__Presentation__Group_3__0 )
            // InternalSlideOMatic.g:1331:4: rule__Presentation__Group_3__0
            {
            pushFollow(FOLLOW_9);
            rule__Presentation__Group_3__0();

            state._fsp--;


            }

             after(grammarAccess.getPresentationAccess().getGroup_3()); 

            }

            // InternalSlideOMatic.g:1334:2: ( ( rule__Presentation__Group_3__0 )* )
            // InternalSlideOMatic.g:1335:3: ( rule__Presentation__Group_3__0 )*
            {
             before(grammarAccess.getPresentationAccess().getGroup_3()); 
            // InternalSlideOMatic.g:1336:3: ( rule__Presentation__Group_3__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==70) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalSlideOMatic.g:1336:4: rule__Presentation__Group_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Presentation__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getPresentationAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Presentation__Group__3__Impl"


    // $ANTLR start "rule__Presentation__Group__4"
    // InternalSlideOMatic.g:1345:1: rule__Presentation__Group__4 : rule__Presentation__Group__4__Impl rule__Presentation__Group__5 ;
    public final void rule__Presentation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1349:1: ( rule__Presentation__Group__4__Impl rule__Presentation__Group__5 )
            // InternalSlideOMatic.g:1350:2: rule__Presentation__Group__4__Impl rule__Presentation__Group__5
            {
            pushFollow(FOLLOW_8);
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
    // InternalSlideOMatic.g:1357:1: rule__Presentation__Group__4__Impl : ( ( rule__Presentation__Alternatives_4 )* ) ;
    public final void rule__Presentation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1361:1: ( ( ( rule__Presentation__Alternatives_4 )* ) )
            // InternalSlideOMatic.g:1362:1: ( ( rule__Presentation__Alternatives_4 )* )
            {
            // InternalSlideOMatic.g:1362:1: ( ( rule__Presentation__Alternatives_4 )* )
            // InternalSlideOMatic.g:1363:2: ( rule__Presentation__Alternatives_4 )*
            {
             before(grammarAccess.getPresentationAccess().getAlternatives_4()); 
            // InternalSlideOMatic.g:1364:2: ( rule__Presentation__Alternatives_4 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==76||LA16_0==92) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalSlideOMatic.g:1364:3: rule__Presentation__Alternatives_4
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Presentation__Alternatives_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalSlideOMatic.g:1372:1: rule__Presentation__Group__5 : rule__Presentation__Group__5__Impl ;
    public final void rule__Presentation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1376:1: ( rule__Presentation__Group__5__Impl )
            // InternalSlideOMatic.g:1377:2: rule__Presentation__Group__5__Impl
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
    // InternalSlideOMatic.g:1383:1: rule__Presentation__Group__5__Impl : ( '}' ) ;
    public final void rule__Presentation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1387:1: ( ( '}' ) )
            // InternalSlideOMatic.g:1388:1: ( '}' )
            {
            // InternalSlideOMatic.g:1388:1: ( '}' )
            // InternalSlideOMatic.g:1389:2: '}'
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
    // InternalSlideOMatic.g:1399:1: rule__Presentation__Group_3__0 : rule__Presentation__Group_3__0__Impl rule__Presentation__Group_3__1 ;
    public final void rule__Presentation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1403:1: ( rule__Presentation__Group_3__0__Impl rule__Presentation__Group_3__1 )
            // InternalSlideOMatic.g:1404:2: rule__Presentation__Group_3__0__Impl rule__Presentation__Group_3__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalSlideOMatic.g:1411:1: rule__Presentation__Group_3__0__Impl : ( '(' ) ;
    public final void rule__Presentation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1415:1: ( ( '(' ) )
            // InternalSlideOMatic.g:1416:1: ( '(' )
            {
            // InternalSlideOMatic.g:1416:1: ( '(' )
            // InternalSlideOMatic.g:1417:2: '('
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
    // InternalSlideOMatic.g:1426:1: rule__Presentation__Group_3__1 : rule__Presentation__Group_3__1__Impl rule__Presentation__Group_3__2 ;
    public final void rule__Presentation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1430:1: ( rule__Presentation__Group_3__1__Impl rule__Presentation__Group_3__2 )
            // InternalSlideOMatic.g:1431:2: rule__Presentation__Group_3__1__Impl rule__Presentation__Group_3__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalSlideOMatic.g:1438:1: rule__Presentation__Group_3__1__Impl : ( ( rule__Presentation__SettingsAssignment_3_1 )* ) ;
    public final void rule__Presentation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1442:1: ( ( ( rule__Presentation__SettingsAssignment_3_1 )* ) )
            // InternalSlideOMatic.g:1443:1: ( ( rule__Presentation__SettingsAssignment_3_1 )* )
            {
            // InternalSlideOMatic.g:1443:1: ( ( rule__Presentation__SettingsAssignment_3_1 )* )
            // InternalSlideOMatic.g:1444:2: ( rule__Presentation__SettingsAssignment_3_1 )*
            {
             before(grammarAccess.getPresentationAccess().getSettingsAssignment_3_1()); 
            // InternalSlideOMatic.g:1445:2: ( rule__Presentation__SettingsAssignment_3_1 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==72||(LA17_0>=74 && LA17_0<=75)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalSlideOMatic.g:1445:3: rule__Presentation__SettingsAssignment_3_1
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Presentation__SettingsAssignment_3_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getPresentationAccess().getSettingsAssignment_3_1()); 

            }


            }

        }
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
    // InternalSlideOMatic.g:1453:1: rule__Presentation__Group_3__2 : rule__Presentation__Group_3__2__Impl ;
    public final void rule__Presentation__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1457:1: ( rule__Presentation__Group_3__2__Impl )
            // InternalSlideOMatic.g:1458:2: rule__Presentation__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Presentation__Group_3__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalSlideOMatic.g:1464:1: rule__Presentation__Group_3__2__Impl : ( ')' ) ;
    public final void rule__Presentation__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1468:1: ( ( ')' ) )
            // InternalSlideOMatic.g:1469:1: ( ')' )
            {
            // InternalSlideOMatic.g:1469:1: ( ')' )
            // InternalSlideOMatic.g:1470:2: ')'
            {
             before(grammarAccess.getPresentationAccess().getRightParenthesisKeyword_3_2()); 
            match(input,71,FOLLOW_2); 
             after(grammarAccess.getPresentationAccess().getRightParenthesisKeyword_3_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Theme__Group__0"
    // InternalSlideOMatic.g:1480:1: rule__Theme__Group__0 : rule__Theme__Group__0__Impl rule__Theme__Group__1 ;
    public final void rule__Theme__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1484:1: ( rule__Theme__Group__0__Impl rule__Theme__Group__1 )
            // InternalSlideOMatic.g:1485:2: rule__Theme__Group__0__Impl rule__Theme__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalSlideOMatic.g:1492:1: rule__Theme__Group__0__Impl : ( 'theme' ) ;
    public final void rule__Theme__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1496:1: ( ( 'theme' ) )
            // InternalSlideOMatic.g:1497:1: ( 'theme' )
            {
            // InternalSlideOMatic.g:1497:1: ( 'theme' )
            // InternalSlideOMatic.g:1498:2: 'theme'
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
    // InternalSlideOMatic.g:1507:1: rule__Theme__Group__1 : rule__Theme__Group__1__Impl rule__Theme__Group__2 ;
    public final void rule__Theme__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1511:1: ( rule__Theme__Group__1__Impl rule__Theme__Group__2 )
            // InternalSlideOMatic.g:1512:2: rule__Theme__Group__1__Impl rule__Theme__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalSlideOMatic.g:1519:1: rule__Theme__Group__1__Impl : ( ( rule__Theme__ThemeAssignment_1 ) ) ;
    public final void rule__Theme__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1523:1: ( ( ( rule__Theme__ThemeAssignment_1 ) ) )
            // InternalSlideOMatic.g:1524:1: ( ( rule__Theme__ThemeAssignment_1 ) )
            {
            // InternalSlideOMatic.g:1524:1: ( ( rule__Theme__ThemeAssignment_1 ) )
            // InternalSlideOMatic.g:1525:2: ( rule__Theme__ThemeAssignment_1 )
            {
             before(grammarAccess.getThemeAccess().getThemeAssignment_1()); 
            // InternalSlideOMatic.g:1526:2: ( rule__Theme__ThemeAssignment_1 )
            // InternalSlideOMatic.g:1526:3: rule__Theme__ThemeAssignment_1
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
    // InternalSlideOMatic.g:1534:1: rule__Theme__Group__2 : rule__Theme__Group__2__Impl ;
    public final void rule__Theme__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1538:1: ( rule__Theme__Group__2__Impl )
            // InternalSlideOMatic.g:1539:2: rule__Theme__Group__2__Impl
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
    // InternalSlideOMatic.g:1545:1: rule__Theme__Group__2__Impl : ( ( rule__Theme__Group_2__0 )? ) ;
    public final void rule__Theme__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1549:1: ( ( ( rule__Theme__Group_2__0 )? ) )
            // InternalSlideOMatic.g:1550:1: ( ( rule__Theme__Group_2__0 )? )
            {
            // InternalSlideOMatic.g:1550:1: ( ( rule__Theme__Group_2__0 )? )
            // InternalSlideOMatic.g:1551:2: ( rule__Theme__Group_2__0 )?
            {
             before(grammarAccess.getThemeAccess().getGroup_2()); 
            // InternalSlideOMatic.g:1552:2: ( rule__Theme__Group_2__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==73) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalSlideOMatic.g:1552:3: rule__Theme__Group_2__0
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
    // InternalSlideOMatic.g:1561:1: rule__Theme__Group_2__0 : rule__Theme__Group_2__0__Impl rule__Theme__Group_2__1 ;
    public final void rule__Theme__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1565:1: ( rule__Theme__Group_2__0__Impl rule__Theme__Group_2__1 )
            // InternalSlideOMatic.g:1566:2: rule__Theme__Group_2__0__Impl rule__Theme__Group_2__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalSlideOMatic.g:1573:1: rule__Theme__Group_2__0__Impl : ( 'color' ) ;
    public final void rule__Theme__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1577:1: ( ( 'color' ) )
            // InternalSlideOMatic.g:1578:1: ( 'color' )
            {
            // InternalSlideOMatic.g:1578:1: ( 'color' )
            // InternalSlideOMatic.g:1579:2: 'color'
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
    // InternalSlideOMatic.g:1588:1: rule__Theme__Group_2__1 : rule__Theme__Group_2__1__Impl ;
    public final void rule__Theme__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1592:1: ( rule__Theme__Group_2__1__Impl )
            // InternalSlideOMatic.g:1593:2: rule__Theme__Group_2__1__Impl
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
    // InternalSlideOMatic.g:1599:1: rule__Theme__Group_2__1__Impl : ( ( rule__Theme__ThemeColorAssignment_2_1 ) ) ;
    public final void rule__Theme__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1603:1: ( ( ( rule__Theme__ThemeColorAssignment_2_1 ) ) )
            // InternalSlideOMatic.g:1604:1: ( ( rule__Theme__ThemeColorAssignment_2_1 ) )
            {
            // InternalSlideOMatic.g:1604:1: ( ( rule__Theme__ThemeColorAssignment_2_1 ) )
            // InternalSlideOMatic.g:1605:2: ( rule__Theme__ThemeColorAssignment_2_1 )
            {
             before(grammarAccess.getThemeAccess().getThemeColorAssignment_2_1()); 
            // InternalSlideOMatic.g:1606:2: ( rule__Theme__ThemeColorAssignment_2_1 )
            // InternalSlideOMatic.g:1606:3: rule__Theme__ThemeColorAssignment_2_1
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


    // $ANTLR start "rule__Author__Group__0"
    // InternalSlideOMatic.g:1615:1: rule__Author__Group__0 : rule__Author__Group__0__Impl rule__Author__Group__1 ;
    public final void rule__Author__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1619:1: ( rule__Author__Group__0__Impl rule__Author__Group__1 )
            // InternalSlideOMatic.g:1620:2: rule__Author__Group__0__Impl rule__Author__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Author__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Author__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Author__Group__0"


    // $ANTLR start "rule__Author__Group__0__Impl"
    // InternalSlideOMatic.g:1627:1: rule__Author__Group__0__Impl : ( 'author' ) ;
    public final void rule__Author__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1631:1: ( ( 'author' ) )
            // InternalSlideOMatic.g:1632:1: ( 'author' )
            {
            // InternalSlideOMatic.g:1632:1: ( 'author' )
            // InternalSlideOMatic.g:1633:2: 'author'
            {
             before(grammarAccess.getAuthorAccess().getAuthorKeyword_0()); 
            match(input,74,FOLLOW_2); 
             after(grammarAccess.getAuthorAccess().getAuthorKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Author__Group__0__Impl"


    // $ANTLR start "rule__Author__Group__1"
    // InternalSlideOMatic.g:1642:1: rule__Author__Group__1 : rule__Author__Group__1__Impl ;
    public final void rule__Author__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1646:1: ( rule__Author__Group__1__Impl )
            // InternalSlideOMatic.g:1647:2: rule__Author__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Author__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Author__Group__1"


    // $ANTLR start "rule__Author__Group__1__Impl"
    // InternalSlideOMatic.g:1653:1: rule__Author__Group__1__Impl : ( ( rule__Author__ANameAssignment_1 ) ) ;
    public final void rule__Author__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1657:1: ( ( ( rule__Author__ANameAssignment_1 ) ) )
            // InternalSlideOMatic.g:1658:1: ( ( rule__Author__ANameAssignment_1 ) )
            {
            // InternalSlideOMatic.g:1658:1: ( ( rule__Author__ANameAssignment_1 ) )
            // InternalSlideOMatic.g:1659:2: ( rule__Author__ANameAssignment_1 )
            {
             before(grammarAccess.getAuthorAccess().getANameAssignment_1()); 
            // InternalSlideOMatic.g:1660:2: ( rule__Author__ANameAssignment_1 )
            // InternalSlideOMatic.g:1660:3: rule__Author__ANameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Author__ANameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAuthorAccess().getANameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Author__Group__1__Impl"


    // $ANTLR start "rule__Date__Group__0"
    // InternalSlideOMatic.g:1669:1: rule__Date__Group__0 : rule__Date__Group__0__Impl rule__Date__Group__1 ;
    public final void rule__Date__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1673:1: ( rule__Date__Group__0__Impl rule__Date__Group__1 )
            // InternalSlideOMatic.g:1674:2: rule__Date__Group__0__Impl rule__Date__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalSlideOMatic.g:1681:1: rule__Date__Group__0__Impl : ( 'date' ) ;
    public final void rule__Date__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1685:1: ( ( 'date' ) )
            // InternalSlideOMatic.g:1686:1: ( 'date' )
            {
            // InternalSlideOMatic.g:1686:1: ( 'date' )
            // InternalSlideOMatic.g:1687:2: 'date'
            {
             before(grammarAccess.getDateAccess().getDateKeyword_0()); 
            match(input,75,FOLLOW_2); 
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
    // InternalSlideOMatic.g:1696:1: rule__Date__Group__1 : rule__Date__Group__1__Impl ;
    public final void rule__Date__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1700:1: ( rule__Date__Group__1__Impl )
            // InternalSlideOMatic.g:1701:2: rule__Date__Group__1__Impl
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
    // InternalSlideOMatic.g:1707:1: rule__Date__Group__1__Impl : ( ( rule__Date__DateAssignment_1 ) ) ;
    public final void rule__Date__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1711:1: ( ( ( rule__Date__DateAssignment_1 ) ) )
            // InternalSlideOMatic.g:1712:1: ( ( rule__Date__DateAssignment_1 ) )
            {
            // InternalSlideOMatic.g:1712:1: ( ( rule__Date__DateAssignment_1 ) )
            // InternalSlideOMatic.g:1713:2: ( rule__Date__DateAssignment_1 )
            {
             before(grammarAccess.getDateAccess().getDateAssignment_1()); 
            // InternalSlideOMatic.g:1714:2: ( rule__Date__DateAssignment_1 )
            // InternalSlideOMatic.g:1714:3: rule__Date__DateAssignment_1
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
    // InternalSlideOMatic.g:1723:1: rule__Slide__Group__0 : rule__Slide__Group__0__Impl rule__Slide__Group__1 ;
    public final void rule__Slide__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1727:1: ( rule__Slide__Group__0__Impl rule__Slide__Group__1 )
            // InternalSlideOMatic.g:1728:2: rule__Slide__Group__0__Impl rule__Slide__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalSlideOMatic.g:1735:1: rule__Slide__Group__0__Impl : ( 'slide' ) ;
    public final void rule__Slide__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1739:1: ( ( 'slide' ) )
            // InternalSlideOMatic.g:1740:1: ( 'slide' )
            {
            // InternalSlideOMatic.g:1740:1: ( 'slide' )
            // InternalSlideOMatic.g:1741:2: 'slide'
            {
             before(grammarAccess.getSlideAccess().getSlideKeyword_0()); 
            match(input,76,FOLLOW_2); 
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
    // InternalSlideOMatic.g:1750:1: rule__Slide__Group__1 : rule__Slide__Group__1__Impl rule__Slide__Group__2 ;
    public final void rule__Slide__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1754:1: ( rule__Slide__Group__1__Impl rule__Slide__Group__2 )
            // InternalSlideOMatic.g:1755:2: rule__Slide__Group__1__Impl rule__Slide__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalSlideOMatic.g:1762:1: rule__Slide__Group__1__Impl : ( ( ruleSection )? ) ;
    public final void rule__Slide__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1766:1: ( ( ( ruleSection )? ) )
            // InternalSlideOMatic.g:1767:1: ( ( ruleSection )? )
            {
            // InternalSlideOMatic.g:1767:1: ( ( ruleSection )? )
            // InternalSlideOMatic.g:1768:2: ( ruleSection )?
            {
             before(grammarAccess.getSlideAccess().getSectionParserRuleCall_1()); 
            // InternalSlideOMatic.g:1769:2: ( ruleSection )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=77 && LA19_0<=79)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalSlideOMatic.g:1769:3: ruleSection
                    {
                    pushFollow(FOLLOW_2);
                    ruleSection();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSlideAccess().getSectionParserRuleCall_1()); 

            }


            }

        }
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
    // InternalSlideOMatic.g:1777:1: rule__Slide__Group__2 : rule__Slide__Group__2__Impl rule__Slide__Group__3 ;
    public final void rule__Slide__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1781:1: ( rule__Slide__Group__2__Impl rule__Slide__Group__3 )
            // InternalSlideOMatic.g:1782:2: rule__Slide__Group__2__Impl rule__Slide__Group__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalSlideOMatic.g:1789:1: rule__Slide__Group__2__Impl : ( ( rule__Slide__SNameAssignment_2 )? ) ;
    public final void rule__Slide__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1793:1: ( ( ( rule__Slide__SNameAssignment_2 )? ) )
            // InternalSlideOMatic.g:1794:1: ( ( rule__Slide__SNameAssignment_2 )? )
            {
            // InternalSlideOMatic.g:1794:1: ( ( rule__Slide__SNameAssignment_2 )? )
            // InternalSlideOMatic.g:1795:2: ( rule__Slide__SNameAssignment_2 )?
            {
             before(grammarAccess.getSlideAccess().getSNameAssignment_2()); 
            // InternalSlideOMatic.g:1796:2: ( rule__Slide__SNameAssignment_2 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_STRING) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalSlideOMatic.g:1796:3: rule__Slide__SNameAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Slide__SNameAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSlideAccess().getSNameAssignment_2()); 

            }


            }

        }
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
    // InternalSlideOMatic.g:1804:1: rule__Slide__Group__3 : rule__Slide__Group__3__Impl rule__Slide__Group__4 ;
    public final void rule__Slide__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1808:1: ( rule__Slide__Group__3__Impl rule__Slide__Group__4 )
            // InternalSlideOMatic.g:1809:2: rule__Slide__Group__3__Impl rule__Slide__Group__4
            {
            pushFollow(FOLLOW_18);
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
    // InternalSlideOMatic.g:1816:1: rule__Slide__Group__3__Impl : ( '{' ) ;
    public final void rule__Slide__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1820:1: ( ( '{' ) )
            // InternalSlideOMatic.g:1821:1: ( '{' )
            {
            // InternalSlideOMatic.g:1821:1: ( '{' )
            // InternalSlideOMatic.g:1822:2: '{'
            {
             before(grammarAccess.getSlideAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,68,FOLLOW_2); 
             after(grammarAccess.getSlideAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
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
    // InternalSlideOMatic.g:1831:1: rule__Slide__Group__4 : rule__Slide__Group__4__Impl rule__Slide__Group__5 ;
    public final void rule__Slide__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1835:1: ( rule__Slide__Group__4__Impl rule__Slide__Group__5 )
            // InternalSlideOMatic.g:1836:2: rule__Slide__Group__4__Impl rule__Slide__Group__5
            {
            pushFollow(FOLLOW_19);
            rule__Slide__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Slide__Group__5();

            state._fsp--;


            }

        }
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
    // InternalSlideOMatic.g:1843:1: rule__Slide__Group__4__Impl : ( ( ( rule__Slide__ContentsAssignment_4 ) ) ( ( rule__Slide__ContentsAssignment_4 )* ) ) ;
    public final void rule__Slide__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1847:1: ( ( ( ( rule__Slide__ContentsAssignment_4 ) ) ( ( rule__Slide__ContentsAssignment_4 )* ) ) )
            // InternalSlideOMatic.g:1848:1: ( ( ( rule__Slide__ContentsAssignment_4 ) ) ( ( rule__Slide__ContentsAssignment_4 )* ) )
            {
            // InternalSlideOMatic.g:1848:1: ( ( ( rule__Slide__ContentsAssignment_4 ) ) ( ( rule__Slide__ContentsAssignment_4 )* ) )
            // InternalSlideOMatic.g:1849:2: ( ( rule__Slide__ContentsAssignment_4 ) ) ( ( rule__Slide__ContentsAssignment_4 )* )
            {
            // InternalSlideOMatic.g:1849:2: ( ( rule__Slide__ContentsAssignment_4 ) )
            // InternalSlideOMatic.g:1850:3: ( rule__Slide__ContentsAssignment_4 )
            {
             before(grammarAccess.getSlideAccess().getContentsAssignment_4()); 
            // InternalSlideOMatic.g:1851:3: ( rule__Slide__ContentsAssignment_4 )
            // InternalSlideOMatic.g:1851:4: rule__Slide__ContentsAssignment_4
            {
            pushFollow(FOLLOW_20);
            rule__Slide__ContentsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSlideAccess().getContentsAssignment_4()); 

            }

            // InternalSlideOMatic.g:1854:2: ( ( rule__Slide__ContentsAssignment_4 )* )
            // InternalSlideOMatic.g:1855:3: ( rule__Slide__ContentsAssignment_4 )*
            {
             before(grammarAccess.getSlideAccess().getContentsAssignment_4()); 
            // InternalSlideOMatic.g:1856:3: ( rule__Slide__ContentsAssignment_4 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=80 && LA21_0<=85)||LA21_0==88) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalSlideOMatic.g:1856:4: rule__Slide__ContentsAssignment_4
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Slide__ContentsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getSlideAccess().getContentsAssignment_4()); 

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
    // $ANTLR end "rule__Slide__Group__4__Impl"


    // $ANTLR start "rule__Slide__Group__5"
    // InternalSlideOMatic.g:1865:1: rule__Slide__Group__5 : rule__Slide__Group__5__Impl ;
    public final void rule__Slide__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1869:1: ( rule__Slide__Group__5__Impl )
            // InternalSlideOMatic.g:1870:2: rule__Slide__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Slide__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slide__Group__5"


    // $ANTLR start "rule__Slide__Group__5__Impl"
    // InternalSlideOMatic.g:1876:1: rule__Slide__Group__5__Impl : ( '}' ) ;
    public final void rule__Slide__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1880:1: ( ( '}' ) )
            // InternalSlideOMatic.g:1881:1: ( '}' )
            {
            // InternalSlideOMatic.g:1881:1: ( '}' )
            // InternalSlideOMatic.g:1882:2: '}'
            {
             before(grammarAccess.getSlideAccess().getRightCurlyBracketKeyword_5()); 
            match(input,69,FOLLOW_2); 
             after(grammarAccess.getSlideAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slide__Group__5__Impl"


    // $ANTLR start "rule__Section__Group_0__0"
    // InternalSlideOMatic.g:1892:1: rule__Section__Group_0__0 : rule__Section__Group_0__0__Impl rule__Section__Group_0__1 ;
    public final void rule__Section__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1896:1: ( rule__Section__Group_0__0__Impl rule__Section__Group_0__1 )
            // InternalSlideOMatic.g:1897:2: rule__Section__Group_0__0__Impl rule__Section__Group_0__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalSlideOMatic.g:1904:1: rule__Section__Group_0__0__Impl : ( () ) ;
    public final void rule__Section__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1908:1: ( ( () ) )
            // InternalSlideOMatic.g:1909:1: ( () )
            {
            // InternalSlideOMatic.g:1909:1: ( () )
            // InternalSlideOMatic.g:1910:2: ()
            {
             before(grammarAccess.getSectionAccess().getSectionAction_0_0()); 
            // InternalSlideOMatic.g:1911:2: ()
            // InternalSlideOMatic.g:1911:3: 
            {
            }

             after(grammarAccess.getSectionAccess().getSectionAction_0_0()); 

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
    // InternalSlideOMatic.g:1919:1: rule__Section__Group_0__1 : rule__Section__Group_0__1__Impl ;
    public final void rule__Section__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1923:1: ( rule__Section__Group_0__1__Impl )
            // InternalSlideOMatic.g:1924:2: rule__Section__Group_0__1__Impl
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
    // InternalSlideOMatic.g:1930:1: rule__Section__Group_0__1__Impl : ( '*' ) ;
    public final void rule__Section__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1934:1: ( ( '*' ) )
            // InternalSlideOMatic.g:1935:1: ( '*' )
            {
            // InternalSlideOMatic.g:1935:1: ( '*' )
            // InternalSlideOMatic.g:1936:2: '*'
            {
             before(grammarAccess.getSectionAccess().getAsteriskKeyword_0_1()); 
            match(input,77,FOLLOW_2); 
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
    // InternalSlideOMatic.g:1946:1: rule__Section__Group_1__0 : rule__Section__Group_1__0__Impl rule__Section__Group_1__1 ;
    public final void rule__Section__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1950:1: ( rule__Section__Group_1__0__Impl rule__Section__Group_1__1 )
            // InternalSlideOMatic.g:1951:2: rule__Section__Group_1__0__Impl rule__Section__Group_1__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalSlideOMatic.g:1958:1: rule__Section__Group_1__0__Impl : ( () ) ;
    public final void rule__Section__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1962:1: ( ( () ) )
            // InternalSlideOMatic.g:1963:1: ( () )
            {
            // InternalSlideOMatic.g:1963:1: ( () )
            // InternalSlideOMatic.g:1964:2: ()
            {
             before(grammarAccess.getSectionAccess().getSubSectionAction_1_0()); 
            // InternalSlideOMatic.g:1965:2: ()
            // InternalSlideOMatic.g:1965:3: 
            {
            }

             after(grammarAccess.getSectionAccess().getSubSectionAction_1_0()); 

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
    // InternalSlideOMatic.g:1973:1: rule__Section__Group_1__1 : rule__Section__Group_1__1__Impl ;
    public final void rule__Section__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1977:1: ( rule__Section__Group_1__1__Impl )
            // InternalSlideOMatic.g:1978:2: rule__Section__Group_1__1__Impl
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
    // InternalSlideOMatic.g:1984:1: rule__Section__Group_1__1__Impl : ( '**' ) ;
    public final void rule__Section__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:1988:1: ( ( '**' ) )
            // InternalSlideOMatic.g:1989:1: ( '**' )
            {
            // InternalSlideOMatic.g:1989:1: ( '**' )
            // InternalSlideOMatic.g:1990:2: '**'
            {
             before(grammarAccess.getSectionAccess().getAsteriskAsteriskKeyword_1_1()); 
            match(input,78,FOLLOW_2); 
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
    // InternalSlideOMatic.g:2000:1: rule__Section__Group_2__0 : rule__Section__Group_2__0__Impl rule__Section__Group_2__1 ;
    public final void rule__Section__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2004:1: ( rule__Section__Group_2__0__Impl rule__Section__Group_2__1 )
            // InternalSlideOMatic.g:2005:2: rule__Section__Group_2__0__Impl rule__Section__Group_2__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalSlideOMatic.g:2012:1: rule__Section__Group_2__0__Impl : ( () ) ;
    public final void rule__Section__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2016:1: ( ( () ) )
            // InternalSlideOMatic.g:2017:1: ( () )
            {
            // InternalSlideOMatic.g:2017:1: ( () )
            // InternalSlideOMatic.g:2018:2: ()
            {
             before(grammarAccess.getSectionAccess().getSubSubSectionAction_2_0()); 
            // InternalSlideOMatic.g:2019:2: ()
            // InternalSlideOMatic.g:2019:3: 
            {
            }

             after(grammarAccess.getSectionAccess().getSubSubSectionAction_2_0()); 

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
    // InternalSlideOMatic.g:2027:1: rule__Section__Group_2__1 : rule__Section__Group_2__1__Impl ;
    public final void rule__Section__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2031:1: ( rule__Section__Group_2__1__Impl )
            // InternalSlideOMatic.g:2032:2: rule__Section__Group_2__1__Impl
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
    // InternalSlideOMatic.g:2038:1: rule__Section__Group_2__1__Impl : ( '***' ) ;
    public final void rule__Section__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2042:1: ( ( '***' ) )
            // InternalSlideOMatic.g:2043:1: ( '***' )
            {
            // InternalSlideOMatic.g:2043:1: ( '***' )
            // InternalSlideOMatic.g:2044:2: '***'
            {
             before(grammarAccess.getSectionAccess().getAsteriskAsteriskAsteriskKeyword_2_1()); 
            match(input,79,FOLLOW_2); 
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
    // InternalSlideOMatic.g:2054:1: rule__Content__Group_0__0 : rule__Content__Group_0__0__Impl rule__Content__Group_0__1 ;
    public final void rule__Content__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2058:1: ( rule__Content__Group_0__0__Impl rule__Content__Group_0__1 )
            // InternalSlideOMatic.g:2059:2: rule__Content__Group_0__0__Impl rule__Content__Group_0__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalSlideOMatic.g:2066:1: rule__Content__Group_0__0__Impl : ( () ) ;
    public final void rule__Content__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2070:1: ( ( () ) )
            // InternalSlideOMatic.g:2071:1: ( () )
            {
            // InternalSlideOMatic.g:2071:1: ( () )
            // InternalSlideOMatic.g:2072:2: ()
            {
             before(grammarAccess.getContentAccess().getTOCAction_0_0()); 
            // InternalSlideOMatic.g:2073:2: ()
            // InternalSlideOMatic.g:2073:3: 
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
    // InternalSlideOMatic.g:2081:1: rule__Content__Group_0__1 : rule__Content__Group_0__1__Impl ;
    public final void rule__Content__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2085:1: ( rule__Content__Group_0__1__Impl )
            // InternalSlideOMatic.g:2086:2: rule__Content__Group_0__1__Impl
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
    // InternalSlideOMatic.g:2092:1: rule__Content__Group_0__1__Impl : ( 'ToC' ) ;
    public final void rule__Content__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2096:1: ( ( 'ToC' ) )
            // InternalSlideOMatic.g:2097:1: ( 'ToC' )
            {
            // InternalSlideOMatic.g:2097:1: ( 'ToC' )
            // InternalSlideOMatic.g:2098:2: 'ToC'
            {
             before(grammarAccess.getContentAccess().getToCKeyword_0_1()); 
            match(input,80,FOLLOW_2); 
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
    // InternalSlideOMatic.g:2108:1: rule__Text__Group_0__0 : rule__Text__Group_0__0__Impl rule__Text__Group_0__1 ;
    public final void rule__Text__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2112:1: ( rule__Text__Group_0__0__Impl rule__Text__Group_0__1 )
            // InternalSlideOMatic.g:2113:2: rule__Text__Group_0__0__Impl rule__Text__Group_0__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalSlideOMatic.g:2120:1: rule__Text__Group_0__0__Impl : ( () ) ;
    public final void rule__Text__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2124:1: ( ( () ) )
            // InternalSlideOMatic.g:2125:1: ( () )
            {
            // InternalSlideOMatic.g:2125:1: ( () )
            // InternalSlideOMatic.g:2126:2: ()
            {
             before(grammarAccess.getTextAccess().getParagraphAction_0_0()); 
            // InternalSlideOMatic.g:2127:2: ()
            // InternalSlideOMatic.g:2127:3: 
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
    // InternalSlideOMatic.g:2135:1: rule__Text__Group_0__1 : rule__Text__Group_0__1__Impl rule__Text__Group_0__2 ;
    public final void rule__Text__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2139:1: ( rule__Text__Group_0__1__Impl rule__Text__Group_0__2 )
            // InternalSlideOMatic.g:2140:2: rule__Text__Group_0__1__Impl rule__Text__Group_0__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalSlideOMatic.g:2147:1: rule__Text__Group_0__1__Impl : ( '>' ) ;
    public final void rule__Text__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2151:1: ( ( '>' ) )
            // InternalSlideOMatic.g:2152:1: ( '>' )
            {
            // InternalSlideOMatic.g:2152:1: ( '>' )
            // InternalSlideOMatic.g:2153:2: '>'
            {
             before(grammarAccess.getTextAccess().getGreaterThanSignKeyword_0_1()); 
            match(input,81,FOLLOW_2); 
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
    // InternalSlideOMatic.g:2162:1: rule__Text__Group_0__2 : rule__Text__Group_0__2__Impl rule__Text__Group_0__3 ;
    public final void rule__Text__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2166:1: ( rule__Text__Group_0__2__Impl rule__Text__Group_0__3 )
            // InternalSlideOMatic.g:2167:2: rule__Text__Group_0__2__Impl rule__Text__Group_0__3
            {
            pushFollow(FOLLOW_26);
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
    // InternalSlideOMatic.g:2174:1: rule__Text__Group_0__2__Impl : ( ( rule__Text__TextAssignment_0_2 ) ) ;
    public final void rule__Text__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2178:1: ( ( ( rule__Text__TextAssignment_0_2 ) ) )
            // InternalSlideOMatic.g:2179:1: ( ( rule__Text__TextAssignment_0_2 ) )
            {
            // InternalSlideOMatic.g:2179:1: ( ( rule__Text__TextAssignment_0_2 ) )
            // InternalSlideOMatic.g:2180:2: ( rule__Text__TextAssignment_0_2 )
            {
             before(grammarAccess.getTextAccess().getTextAssignment_0_2()); 
            // InternalSlideOMatic.g:2181:2: ( rule__Text__TextAssignment_0_2 )
            // InternalSlideOMatic.g:2181:3: rule__Text__TextAssignment_0_2
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
    // InternalSlideOMatic.g:2189:1: rule__Text__Group_0__3 : rule__Text__Group_0__3__Impl ;
    public final void rule__Text__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2193:1: ( rule__Text__Group_0__3__Impl )
            // InternalSlideOMatic.g:2194:2: rule__Text__Group_0__3__Impl
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
    // InternalSlideOMatic.g:2200:1: rule__Text__Group_0__3__Impl : ( ( ruleClick )? ) ;
    public final void rule__Text__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2204:1: ( ( ( ruleClick )? ) )
            // InternalSlideOMatic.g:2205:1: ( ( ruleClick )? )
            {
            // InternalSlideOMatic.g:2205:1: ( ( ruleClick )? )
            // InternalSlideOMatic.g:2206:2: ( ruleClick )?
            {
             before(grammarAccess.getTextAccess().getClickParserRuleCall_0_3()); 
            // InternalSlideOMatic.g:2207:2: ( ruleClick )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==11) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalSlideOMatic.g:2207:3: ruleClick
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
    // InternalSlideOMatic.g:2216:1: rule__Text__Group_1__0 : rule__Text__Group_1__0__Impl rule__Text__Group_1__1 ;
    public final void rule__Text__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2220:1: ( rule__Text__Group_1__0__Impl rule__Text__Group_1__1 )
            // InternalSlideOMatic.g:2221:2: rule__Text__Group_1__0__Impl rule__Text__Group_1__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalSlideOMatic.g:2228:1: rule__Text__Group_1__0__Impl : ( () ) ;
    public final void rule__Text__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2232:1: ( ( () ) )
            // InternalSlideOMatic.g:2233:1: ( () )
            {
            // InternalSlideOMatic.g:2233:1: ( () )
            // InternalSlideOMatic.g:2234:2: ()
            {
             before(grammarAccess.getTextAccess().getBlockAction_1_0()); 
            // InternalSlideOMatic.g:2235:2: ()
            // InternalSlideOMatic.g:2235:3: 
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
    // InternalSlideOMatic.g:2243:1: rule__Text__Group_1__1 : rule__Text__Group_1__1__Impl rule__Text__Group_1__2 ;
    public final void rule__Text__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2247:1: ( rule__Text__Group_1__1__Impl rule__Text__Group_1__2 )
            // InternalSlideOMatic.g:2248:2: rule__Text__Group_1__1__Impl rule__Text__Group_1__2
            {
            pushFollow(FOLLOW_28);
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
    // InternalSlideOMatic.g:2255:1: rule__Text__Group_1__1__Impl : ( 'Block' ) ;
    public final void rule__Text__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2259:1: ( ( 'Block' ) )
            // InternalSlideOMatic.g:2260:1: ( 'Block' )
            {
            // InternalSlideOMatic.g:2260:1: ( 'Block' )
            // InternalSlideOMatic.g:2261:2: 'Block'
            {
             before(grammarAccess.getTextAccess().getBlockKeyword_1_1()); 
            match(input,82,FOLLOW_2); 
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
    // InternalSlideOMatic.g:2270:1: rule__Text__Group_1__2 : rule__Text__Group_1__2__Impl rule__Text__Group_1__3 ;
    public final void rule__Text__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2274:1: ( rule__Text__Group_1__2__Impl rule__Text__Group_1__3 )
            // InternalSlideOMatic.g:2275:2: rule__Text__Group_1__2__Impl rule__Text__Group_1__3
            {
            pushFollow(FOLLOW_28);
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
    // InternalSlideOMatic.g:2282:1: rule__Text__Group_1__2__Impl : ( ( rule__Text__NameAssignment_1_2 )? ) ;
    public final void rule__Text__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2286:1: ( ( ( rule__Text__NameAssignment_1_2 )? ) )
            // InternalSlideOMatic.g:2287:1: ( ( rule__Text__NameAssignment_1_2 )? )
            {
            // InternalSlideOMatic.g:2287:1: ( ( rule__Text__NameAssignment_1_2 )? )
            // InternalSlideOMatic.g:2288:2: ( rule__Text__NameAssignment_1_2 )?
            {
             before(grammarAccess.getTextAccess().getNameAssignment_1_2()); 
            // InternalSlideOMatic.g:2289:2: ( rule__Text__NameAssignment_1_2 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ID) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalSlideOMatic.g:2289:3: rule__Text__NameAssignment_1_2
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
    // InternalSlideOMatic.g:2297:1: rule__Text__Group_1__3 : rule__Text__Group_1__3__Impl rule__Text__Group_1__4 ;
    public final void rule__Text__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2301:1: ( rule__Text__Group_1__3__Impl rule__Text__Group_1__4 )
            // InternalSlideOMatic.g:2302:2: rule__Text__Group_1__3__Impl rule__Text__Group_1__4
            {
            pushFollow(FOLLOW_16);
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
    // InternalSlideOMatic.g:2309:1: rule__Text__Group_1__3__Impl : ( '{' ) ;
    public final void rule__Text__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2313:1: ( ( '{' ) )
            // InternalSlideOMatic.g:2314:1: ( '{' )
            {
            // InternalSlideOMatic.g:2314:1: ( '{' )
            // InternalSlideOMatic.g:2315:2: '{'
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
    // InternalSlideOMatic.g:2324:1: rule__Text__Group_1__4 : rule__Text__Group_1__4__Impl rule__Text__Group_1__5 ;
    public final void rule__Text__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2328:1: ( rule__Text__Group_1__4__Impl rule__Text__Group_1__5 )
            // InternalSlideOMatic.g:2329:2: rule__Text__Group_1__4__Impl rule__Text__Group_1__5
            {
            pushFollow(FOLLOW_19);
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
    // InternalSlideOMatic.g:2336:1: rule__Text__Group_1__4__Impl : ( ( rule__Text__TextAssignment_1_4 ) ) ;
    public final void rule__Text__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2340:1: ( ( ( rule__Text__TextAssignment_1_4 ) ) )
            // InternalSlideOMatic.g:2341:1: ( ( rule__Text__TextAssignment_1_4 ) )
            {
            // InternalSlideOMatic.g:2341:1: ( ( rule__Text__TextAssignment_1_4 ) )
            // InternalSlideOMatic.g:2342:2: ( rule__Text__TextAssignment_1_4 )
            {
             before(grammarAccess.getTextAccess().getTextAssignment_1_4()); 
            // InternalSlideOMatic.g:2343:2: ( rule__Text__TextAssignment_1_4 )
            // InternalSlideOMatic.g:2343:3: rule__Text__TextAssignment_1_4
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
    // InternalSlideOMatic.g:2351:1: rule__Text__Group_1__5 : rule__Text__Group_1__5__Impl rule__Text__Group_1__6 ;
    public final void rule__Text__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2355:1: ( rule__Text__Group_1__5__Impl rule__Text__Group_1__6 )
            // InternalSlideOMatic.g:2356:2: rule__Text__Group_1__5__Impl rule__Text__Group_1__6
            {
            pushFollow(FOLLOW_26);
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
    // InternalSlideOMatic.g:2363:1: rule__Text__Group_1__5__Impl : ( '}' ) ;
    public final void rule__Text__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2367:1: ( ( '}' ) )
            // InternalSlideOMatic.g:2368:1: ( '}' )
            {
            // InternalSlideOMatic.g:2368:1: ( '}' )
            // InternalSlideOMatic.g:2369:2: '}'
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
    // InternalSlideOMatic.g:2378:1: rule__Text__Group_1__6 : rule__Text__Group_1__6__Impl ;
    public final void rule__Text__Group_1__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2382:1: ( rule__Text__Group_1__6__Impl )
            // InternalSlideOMatic.g:2383:2: rule__Text__Group_1__6__Impl
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
    // InternalSlideOMatic.g:2389:1: rule__Text__Group_1__6__Impl : ( ( ruleClick )? ) ;
    public final void rule__Text__Group_1__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2393:1: ( ( ( ruleClick )? ) )
            // InternalSlideOMatic.g:2394:1: ( ( ruleClick )? )
            {
            // InternalSlideOMatic.g:2394:1: ( ( ruleClick )? )
            // InternalSlideOMatic.g:2395:2: ( ruleClick )?
            {
             before(grammarAccess.getTextAccess().getClickParserRuleCall_1_6()); 
            // InternalSlideOMatic.g:2396:2: ( ruleClick )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==11) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalSlideOMatic.g:2396:3: ruleClick
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


    // $ANTLR start "rule__NumberedListItem__Group__0"
    // InternalSlideOMatic.g:2405:1: rule__NumberedListItem__Group__0 : rule__NumberedListItem__Group__0__Impl rule__NumberedListItem__Group__1 ;
    public final void rule__NumberedListItem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2409:1: ( rule__NumberedListItem__Group__0__Impl rule__NumberedListItem__Group__1 )
            // InternalSlideOMatic.g:2410:2: rule__NumberedListItem__Group__0__Impl rule__NumberedListItem__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalSlideOMatic.g:2417:1: rule__NumberedListItem__Group__0__Impl : ( '##' ) ;
    public final void rule__NumberedListItem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2421:1: ( ( '##' ) )
            // InternalSlideOMatic.g:2422:1: ( '##' )
            {
            // InternalSlideOMatic.g:2422:1: ( '##' )
            // InternalSlideOMatic.g:2423:2: '##'
            {
             before(grammarAccess.getNumberedListItemAccess().getNumberSignNumberSignKeyword_0()); 
            match(input,83,FOLLOW_2); 
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
    // InternalSlideOMatic.g:2432:1: rule__NumberedListItem__Group__1 : rule__NumberedListItem__Group__1__Impl rule__NumberedListItem__Group__2 ;
    public final void rule__NumberedListItem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2436:1: ( rule__NumberedListItem__Group__1__Impl rule__NumberedListItem__Group__2 )
            // InternalSlideOMatic.g:2437:2: rule__NumberedListItem__Group__1__Impl rule__NumberedListItem__Group__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalSlideOMatic.g:2444:1: rule__NumberedListItem__Group__1__Impl : ( ( rule__NumberedListItem__ItemAssignment_1 ) ) ;
    public final void rule__NumberedListItem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2448:1: ( ( ( rule__NumberedListItem__ItemAssignment_1 ) ) )
            // InternalSlideOMatic.g:2449:1: ( ( rule__NumberedListItem__ItemAssignment_1 ) )
            {
            // InternalSlideOMatic.g:2449:1: ( ( rule__NumberedListItem__ItemAssignment_1 ) )
            // InternalSlideOMatic.g:2450:2: ( rule__NumberedListItem__ItemAssignment_1 )
            {
             before(grammarAccess.getNumberedListItemAccess().getItemAssignment_1()); 
            // InternalSlideOMatic.g:2451:2: ( rule__NumberedListItem__ItemAssignment_1 )
            // InternalSlideOMatic.g:2451:3: rule__NumberedListItem__ItemAssignment_1
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
    // InternalSlideOMatic.g:2459:1: rule__NumberedListItem__Group__2 : rule__NumberedListItem__Group__2__Impl ;
    public final void rule__NumberedListItem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2463:1: ( rule__NumberedListItem__Group__2__Impl )
            // InternalSlideOMatic.g:2464:2: rule__NumberedListItem__Group__2__Impl
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
    // InternalSlideOMatic.g:2470:1: rule__NumberedListItem__Group__2__Impl : ( ( ruleClick )? ) ;
    public final void rule__NumberedListItem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2474:1: ( ( ( ruleClick )? ) )
            // InternalSlideOMatic.g:2475:1: ( ( ruleClick )? )
            {
            // InternalSlideOMatic.g:2475:1: ( ( ruleClick )? )
            // InternalSlideOMatic.g:2476:2: ( ruleClick )?
            {
             before(grammarAccess.getNumberedListItemAccess().getClickParserRuleCall_2()); 
            // InternalSlideOMatic.g:2477:2: ( ruleClick )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==11) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalSlideOMatic.g:2477:3: ruleClick
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


    // $ANTLR start "rule__UnNumberedList__Group__0"
    // InternalSlideOMatic.g:2486:1: rule__UnNumberedList__Group__0 : rule__UnNumberedList__Group__0__Impl rule__UnNumberedList__Group__1 ;
    public final void rule__UnNumberedList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2490:1: ( rule__UnNumberedList__Group__0__Impl rule__UnNumberedList__Group__1 )
            // InternalSlideOMatic.g:2491:2: rule__UnNumberedList__Group__0__Impl rule__UnNumberedList__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalSlideOMatic.g:2498:1: rule__UnNumberedList__Group__0__Impl : ( '--' ) ;
    public final void rule__UnNumberedList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2502:1: ( ( '--' ) )
            // InternalSlideOMatic.g:2503:1: ( '--' )
            {
            // InternalSlideOMatic.g:2503:1: ( '--' )
            // InternalSlideOMatic.g:2504:2: '--'
            {
             before(grammarAccess.getUnNumberedListAccess().getHyphenMinusHyphenMinusKeyword_0()); 
            match(input,84,FOLLOW_2); 
             after(grammarAccess.getUnNumberedListAccess().getHyphenMinusHyphenMinusKeyword_0()); 

            }


            }

        }
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
    // InternalSlideOMatic.g:2513:1: rule__UnNumberedList__Group__1 : rule__UnNumberedList__Group__1__Impl rule__UnNumberedList__Group__2 ;
    public final void rule__UnNumberedList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2517:1: ( rule__UnNumberedList__Group__1__Impl rule__UnNumberedList__Group__2 )
            // InternalSlideOMatic.g:2518:2: rule__UnNumberedList__Group__1__Impl rule__UnNumberedList__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__UnNumberedList__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnNumberedList__Group__2();

            state._fsp--;


            }

        }
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
    // InternalSlideOMatic.g:2525:1: rule__UnNumberedList__Group__1__Impl : ( ( rule__UnNumberedList__ItemAssignment_1 ) ) ;
    public final void rule__UnNumberedList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2529:1: ( ( ( rule__UnNumberedList__ItemAssignment_1 ) ) )
            // InternalSlideOMatic.g:2530:1: ( ( rule__UnNumberedList__ItemAssignment_1 ) )
            {
            // InternalSlideOMatic.g:2530:1: ( ( rule__UnNumberedList__ItemAssignment_1 ) )
            // InternalSlideOMatic.g:2531:2: ( rule__UnNumberedList__ItemAssignment_1 )
            {
             before(grammarAccess.getUnNumberedListAccess().getItemAssignment_1()); 
            // InternalSlideOMatic.g:2532:2: ( rule__UnNumberedList__ItemAssignment_1 )
            // InternalSlideOMatic.g:2532:3: rule__UnNumberedList__ItemAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__UnNumberedList__ItemAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getUnNumberedListAccess().getItemAssignment_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__UnNumberedList__Group__2"
    // InternalSlideOMatic.g:2540:1: rule__UnNumberedList__Group__2 : rule__UnNumberedList__Group__2__Impl ;
    public final void rule__UnNumberedList__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2544:1: ( rule__UnNumberedList__Group__2__Impl )
            // InternalSlideOMatic.g:2545:2: rule__UnNumberedList__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UnNumberedList__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnNumberedList__Group__2"


    // $ANTLR start "rule__UnNumberedList__Group__2__Impl"
    // InternalSlideOMatic.g:2551:1: rule__UnNumberedList__Group__2__Impl : ( ( ruleClick )? ) ;
    public final void rule__UnNumberedList__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2555:1: ( ( ( ruleClick )? ) )
            // InternalSlideOMatic.g:2556:1: ( ( ruleClick )? )
            {
            // InternalSlideOMatic.g:2556:1: ( ( ruleClick )? )
            // InternalSlideOMatic.g:2557:2: ( ruleClick )?
            {
             before(grammarAccess.getUnNumberedListAccess().getClickParserRuleCall_2()); 
            // InternalSlideOMatic.g:2558:2: ( ruleClick )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==11) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalSlideOMatic.g:2558:3: ruleClick
                    {
                    pushFollow(FOLLOW_2);
                    ruleClick();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUnNumberedListAccess().getClickParserRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnNumberedList__Group__2__Impl"


    // $ANTLR start "rule__Image__Group__0"
    // InternalSlideOMatic.g:2567:1: rule__Image__Group__0 : rule__Image__Group__0__Impl rule__Image__Group__1 ;
    public final void rule__Image__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2571:1: ( rule__Image__Group__0__Impl rule__Image__Group__1 )
            // InternalSlideOMatic.g:2572:2: rule__Image__Group__0__Impl rule__Image__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalSlideOMatic.g:2579:1: rule__Image__Group__0__Impl : ( 'img' ) ;
    public final void rule__Image__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2583:1: ( ( 'img' ) )
            // InternalSlideOMatic.g:2584:1: ( 'img' )
            {
            // InternalSlideOMatic.g:2584:1: ( 'img' )
            // InternalSlideOMatic.g:2585:2: 'img'
            {
             before(grammarAccess.getImageAccess().getImgKeyword_0()); 
            match(input,85,FOLLOW_2); 
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
    // InternalSlideOMatic.g:2594:1: rule__Image__Group__1 : rule__Image__Group__1__Impl rule__Image__Group__2 ;
    public final void rule__Image__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2598:1: ( rule__Image__Group__1__Impl rule__Image__Group__2 )
            // InternalSlideOMatic.g:2599:2: rule__Image__Group__1__Impl rule__Image__Group__2
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
    // InternalSlideOMatic.g:2606:1: rule__Image__Group__1__Impl : ( ( rule__Image__NameAssignment_1 ) ) ;
    public final void rule__Image__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2610:1: ( ( ( rule__Image__NameAssignment_1 ) ) )
            // InternalSlideOMatic.g:2611:1: ( ( rule__Image__NameAssignment_1 ) )
            {
            // InternalSlideOMatic.g:2611:1: ( ( rule__Image__NameAssignment_1 ) )
            // InternalSlideOMatic.g:2612:2: ( rule__Image__NameAssignment_1 )
            {
             before(grammarAccess.getImageAccess().getNameAssignment_1()); 
            // InternalSlideOMatic.g:2613:2: ( rule__Image__NameAssignment_1 )
            // InternalSlideOMatic.g:2613:3: rule__Image__NameAssignment_1
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
    // InternalSlideOMatic.g:2621:1: rule__Image__Group__2 : rule__Image__Group__2__Impl rule__Image__Group__3 ;
    public final void rule__Image__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2625:1: ( rule__Image__Group__2__Impl rule__Image__Group__3 )
            // InternalSlideOMatic.g:2626:2: rule__Image__Group__2__Impl rule__Image__Group__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalSlideOMatic.g:2633:1: rule__Image__Group__2__Impl : ( 'src' ) ;
    public final void rule__Image__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2637:1: ( ( 'src' ) )
            // InternalSlideOMatic.g:2638:1: ( 'src' )
            {
            // InternalSlideOMatic.g:2638:1: ( 'src' )
            // InternalSlideOMatic.g:2639:2: 'src'
            {
             before(grammarAccess.getImageAccess().getSrcKeyword_2()); 
            match(input,86,FOLLOW_2); 
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
    // InternalSlideOMatic.g:2648:1: rule__Image__Group__3 : rule__Image__Group__3__Impl rule__Image__Group__4 ;
    public final void rule__Image__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2652:1: ( rule__Image__Group__3__Impl rule__Image__Group__4 )
            // InternalSlideOMatic.g:2653:2: rule__Image__Group__3__Impl rule__Image__Group__4
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
    // InternalSlideOMatic.g:2660:1: rule__Image__Group__3__Impl : ( ( rule__Image__SrcAssignment_3 ) ) ;
    public final void rule__Image__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2664:1: ( ( ( rule__Image__SrcAssignment_3 ) ) )
            // InternalSlideOMatic.g:2665:1: ( ( rule__Image__SrcAssignment_3 ) )
            {
            // InternalSlideOMatic.g:2665:1: ( ( rule__Image__SrcAssignment_3 ) )
            // InternalSlideOMatic.g:2666:2: ( rule__Image__SrcAssignment_3 )
            {
             before(grammarAccess.getImageAccess().getSrcAssignment_3()); 
            // InternalSlideOMatic.g:2667:2: ( rule__Image__SrcAssignment_3 )
            // InternalSlideOMatic.g:2667:3: rule__Image__SrcAssignment_3
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
    // InternalSlideOMatic.g:2675:1: rule__Image__Group__4 : rule__Image__Group__4__Impl rule__Image__Group__5 ;
    public final void rule__Image__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2679:1: ( rule__Image__Group__4__Impl rule__Image__Group__5 )
            // InternalSlideOMatic.g:2680:2: rule__Image__Group__4__Impl rule__Image__Group__5
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
    // InternalSlideOMatic.g:2687:1: rule__Image__Group__4__Impl : ( ( rule__Image__AlignmentAssignment_4 )? ) ;
    public final void rule__Image__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2691:1: ( ( ( rule__Image__AlignmentAssignment_4 )? ) )
            // InternalSlideOMatic.g:2692:1: ( ( rule__Image__AlignmentAssignment_4 )? )
            {
            // InternalSlideOMatic.g:2692:1: ( ( rule__Image__AlignmentAssignment_4 )? )
            // InternalSlideOMatic.g:2693:2: ( rule__Image__AlignmentAssignment_4 )?
            {
             before(grammarAccess.getImageAccess().getAlignmentAssignment_4()); 
            // InternalSlideOMatic.g:2694:2: ( rule__Image__AlignmentAssignment_4 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=56 && LA27_0<=64)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalSlideOMatic.g:2694:3: rule__Image__AlignmentAssignment_4
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
    // InternalSlideOMatic.g:2702:1: rule__Image__Group__5 : rule__Image__Group__5__Impl rule__Image__Group__6 ;
    public final void rule__Image__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2706:1: ( rule__Image__Group__5__Impl rule__Image__Group__6 )
            // InternalSlideOMatic.g:2707:2: rule__Image__Group__5__Impl rule__Image__Group__6
            {
            pushFollow(FOLLOW_26);
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
    // InternalSlideOMatic.g:2714:1: rule__Image__Group__5__Impl : ( ( rule__Image__SizeAssignment_5 ) ) ;
    public final void rule__Image__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2718:1: ( ( ( rule__Image__SizeAssignment_5 ) ) )
            // InternalSlideOMatic.g:2719:1: ( ( rule__Image__SizeAssignment_5 ) )
            {
            // InternalSlideOMatic.g:2719:1: ( ( rule__Image__SizeAssignment_5 ) )
            // InternalSlideOMatic.g:2720:2: ( rule__Image__SizeAssignment_5 )
            {
             before(grammarAccess.getImageAccess().getSizeAssignment_5()); 
            // InternalSlideOMatic.g:2721:2: ( rule__Image__SizeAssignment_5 )
            // InternalSlideOMatic.g:2721:3: rule__Image__SizeAssignment_5
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
    // InternalSlideOMatic.g:2729:1: rule__Image__Group__6 : rule__Image__Group__6__Impl ;
    public final void rule__Image__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2733:1: ( rule__Image__Group__6__Impl )
            // InternalSlideOMatic.g:2734:2: rule__Image__Group__6__Impl
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
    // InternalSlideOMatic.g:2740:1: rule__Image__Group__6__Impl : ( ( ruleClick )? ) ;
    public final void rule__Image__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2744:1: ( ( ( ruleClick )? ) )
            // InternalSlideOMatic.g:2745:1: ( ( ruleClick )? )
            {
            // InternalSlideOMatic.g:2745:1: ( ( ruleClick )? )
            // InternalSlideOMatic.g:2746:2: ( ruleClick )?
            {
             before(grammarAccess.getImageAccess().getClickParserRuleCall_6()); 
            // InternalSlideOMatic.g:2747:2: ( ruleClick )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==11) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalSlideOMatic.g:2747:3: ruleClick
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
    // InternalSlideOMatic.g:2756:1: rule__Size__Group__0 : rule__Size__Group__0__Impl rule__Size__Group__1 ;
    public final void rule__Size__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2760:1: ( rule__Size__Group__0__Impl rule__Size__Group__1 )
            // InternalSlideOMatic.g:2761:2: rule__Size__Group__0__Impl rule__Size__Group__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalSlideOMatic.g:2768:1: rule__Size__Group__0__Impl : ( ( rule__Size__Alternatives_0 ) ) ;
    public final void rule__Size__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2772:1: ( ( ( rule__Size__Alternatives_0 ) ) )
            // InternalSlideOMatic.g:2773:1: ( ( rule__Size__Alternatives_0 ) )
            {
            // InternalSlideOMatic.g:2773:1: ( ( rule__Size__Alternatives_0 ) )
            // InternalSlideOMatic.g:2774:2: ( rule__Size__Alternatives_0 )
            {
             before(grammarAccess.getSizeAccess().getAlternatives_0()); 
            // InternalSlideOMatic.g:2775:2: ( rule__Size__Alternatives_0 )
            // InternalSlideOMatic.g:2775:3: rule__Size__Alternatives_0
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
    // InternalSlideOMatic.g:2783:1: rule__Size__Group__1 : rule__Size__Group__1__Impl rule__Size__Group__2 ;
    public final void rule__Size__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2787:1: ( rule__Size__Group__1__Impl rule__Size__Group__2 )
            // InternalSlideOMatic.g:2788:2: rule__Size__Group__1__Impl rule__Size__Group__2
            {
            pushFollow(FOLLOW_32);
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
    // InternalSlideOMatic.g:2795:1: rule__Size__Group__1__Impl : ( ( rule__Size__ScaleAssignment_1 ) ) ;
    public final void rule__Size__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2799:1: ( ( ( rule__Size__ScaleAssignment_1 ) ) )
            // InternalSlideOMatic.g:2800:1: ( ( rule__Size__ScaleAssignment_1 ) )
            {
            // InternalSlideOMatic.g:2800:1: ( ( rule__Size__ScaleAssignment_1 ) )
            // InternalSlideOMatic.g:2801:2: ( rule__Size__ScaleAssignment_1 )
            {
             before(grammarAccess.getSizeAccess().getScaleAssignment_1()); 
            // InternalSlideOMatic.g:2802:2: ( rule__Size__ScaleAssignment_1 )
            // InternalSlideOMatic.g:2802:3: rule__Size__ScaleAssignment_1
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
    // InternalSlideOMatic.g:2810:1: rule__Size__Group__2 : rule__Size__Group__2__Impl ;
    public final void rule__Size__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2814:1: ( rule__Size__Group__2__Impl )
            // InternalSlideOMatic.g:2815:2: rule__Size__Group__2__Impl
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
    // InternalSlideOMatic.g:2821:1: rule__Size__Group__2__Impl : ( '%' ) ;
    public final void rule__Size__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2825:1: ( ( '%' ) )
            // InternalSlideOMatic.g:2826:1: ( '%' )
            {
            // InternalSlideOMatic.g:2826:1: ( '%' )
            // InternalSlideOMatic.g:2827:2: '%'
            {
             before(grammarAccess.getSizeAccess().getPercentSignKeyword_2()); 
            match(input,87,FOLLOW_2); 
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
    // InternalSlideOMatic.g:2837:1: rule__Table__Group__0 : rule__Table__Group__0__Impl rule__Table__Group__1 ;
    public final void rule__Table__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2841:1: ( rule__Table__Group__0__Impl rule__Table__Group__1 )
            // InternalSlideOMatic.g:2842:2: rule__Table__Group__0__Impl rule__Table__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalSlideOMatic.g:2849:1: rule__Table__Group__0__Impl : ( 'tab' ) ;
    public final void rule__Table__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2853:1: ( ( 'tab' ) )
            // InternalSlideOMatic.g:2854:1: ( 'tab' )
            {
            // InternalSlideOMatic.g:2854:1: ( 'tab' )
            // InternalSlideOMatic.g:2855:2: 'tab'
            {
             before(grammarAccess.getTableAccess().getTabKeyword_0()); 
            match(input,88,FOLLOW_2); 
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
    // InternalSlideOMatic.g:2864:1: rule__Table__Group__1 : rule__Table__Group__1__Impl rule__Table__Group__2 ;
    public final void rule__Table__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2868:1: ( rule__Table__Group__1__Impl rule__Table__Group__2 )
            // InternalSlideOMatic.g:2869:2: rule__Table__Group__1__Impl rule__Table__Group__2
            {
            pushFollow(FOLLOW_33);
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
    // InternalSlideOMatic.g:2876:1: rule__Table__Group__1__Impl : ( ( rule__Table__NameAssignment_1 ) ) ;
    public final void rule__Table__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2880:1: ( ( ( rule__Table__NameAssignment_1 ) ) )
            // InternalSlideOMatic.g:2881:1: ( ( rule__Table__NameAssignment_1 ) )
            {
            // InternalSlideOMatic.g:2881:1: ( ( rule__Table__NameAssignment_1 ) )
            // InternalSlideOMatic.g:2882:2: ( rule__Table__NameAssignment_1 )
            {
             before(grammarAccess.getTableAccess().getNameAssignment_1()); 
            // InternalSlideOMatic.g:2883:2: ( rule__Table__NameAssignment_1 )
            // InternalSlideOMatic.g:2883:3: rule__Table__NameAssignment_1
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
    // InternalSlideOMatic.g:2891:1: rule__Table__Group__2 : rule__Table__Group__2__Impl rule__Table__Group__3 ;
    public final void rule__Table__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2895:1: ( rule__Table__Group__2__Impl rule__Table__Group__3 )
            // InternalSlideOMatic.g:2896:2: rule__Table__Group__2__Impl rule__Table__Group__3
            {
            pushFollow(FOLLOW_33);
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
    // InternalSlideOMatic.g:2903:1: rule__Table__Group__2__Impl : ( '[' ) ;
    public final void rule__Table__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2907:1: ( ( '[' ) )
            // InternalSlideOMatic.g:2908:1: ( '[' )
            {
            // InternalSlideOMatic.g:2908:1: ( '[' )
            // InternalSlideOMatic.g:2909:2: '['
            {
             before(grammarAccess.getTableAccess().getLeftSquareBracketKeyword_2()); 
            match(input,89,FOLLOW_2); 
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
    // InternalSlideOMatic.g:2918:1: rule__Table__Group__3 : rule__Table__Group__3__Impl rule__Table__Group__4 ;
    public final void rule__Table__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2922:1: ( rule__Table__Group__3__Impl rule__Table__Group__4 )
            // InternalSlideOMatic.g:2923:2: rule__Table__Group__3__Impl rule__Table__Group__4
            {
            pushFollow(FOLLOW_34);
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
    // InternalSlideOMatic.g:2930:1: rule__Table__Group__3__Impl : ( ( rule__Table__RowsAssignment_3 ) ) ;
    public final void rule__Table__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2934:1: ( ( ( rule__Table__RowsAssignment_3 ) ) )
            // InternalSlideOMatic.g:2935:1: ( ( rule__Table__RowsAssignment_3 ) )
            {
            // InternalSlideOMatic.g:2935:1: ( ( rule__Table__RowsAssignment_3 ) )
            // InternalSlideOMatic.g:2936:2: ( rule__Table__RowsAssignment_3 )
            {
             before(grammarAccess.getTableAccess().getRowsAssignment_3()); 
            // InternalSlideOMatic.g:2937:2: ( rule__Table__RowsAssignment_3 )
            // InternalSlideOMatic.g:2937:3: rule__Table__RowsAssignment_3
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
    // InternalSlideOMatic.g:2945:1: rule__Table__Group__4 : rule__Table__Group__4__Impl rule__Table__Group__5 ;
    public final void rule__Table__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2949:1: ( rule__Table__Group__4__Impl rule__Table__Group__5 )
            // InternalSlideOMatic.g:2950:2: rule__Table__Group__4__Impl rule__Table__Group__5
            {
            pushFollow(FOLLOW_34);
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
    // InternalSlideOMatic.g:2957:1: rule__Table__Group__4__Impl : ( ( rule__Table__Group_4__0 )* ) ;
    public final void rule__Table__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2961:1: ( ( ( rule__Table__Group_4__0 )* ) )
            // InternalSlideOMatic.g:2962:1: ( ( rule__Table__Group_4__0 )* )
            {
            // InternalSlideOMatic.g:2962:1: ( ( rule__Table__Group_4__0 )* )
            // InternalSlideOMatic.g:2963:2: ( rule__Table__Group_4__0 )*
            {
             before(grammarAccess.getTableAccess().getGroup_4()); 
            // InternalSlideOMatic.g:2964:2: ( rule__Table__Group_4__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==91) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalSlideOMatic.g:2964:3: rule__Table__Group_4__0
            	    {
            	    pushFollow(FOLLOW_35);
            	    rule__Table__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
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
    // InternalSlideOMatic.g:2972:1: rule__Table__Group__5 : rule__Table__Group__5__Impl ;
    public final void rule__Table__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2976:1: ( rule__Table__Group__5__Impl )
            // InternalSlideOMatic.g:2977:2: rule__Table__Group__5__Impl
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
    // InternalSlideOMatic.g:2983:1: rule__Table__Group__5__Impl : ( ']' ) ;
    public final void rule__Table__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:2987:1: ( ( ']' ) )
            // InternalSlideOMatic.g:2988:1: ( ']' )
            {
            // InternalSlideOMatic.g:2988:1: ( ']' )
            // InternalSlideOMatic.g:2989:2: ']'
            {
             before(grammarAccess.getTableAccess().getRightSquareBracketKeyword_5()); 
            match(input,90,FOLLOW_2); 
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
    // InternalSlideOMatic.g:2999:1: rule__Table__Group_4__0 : rule__Table__Group_4__0__Impl rule__Table__Group_4__1 ;
    public final void rule__Table__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3003:1: ( rule__Table__Group_4__0__Impl rule__Table__Group_4__1 )
            // InternalSlideOMatic.g:3004:2: rule__Table__Group_4__0__Impl rule__Table__Group_4__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalSlideOMatic.g:3011:1: rule__Table__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Table__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3015:1: ( ( ',' ) )
            // InternalSlideOMatic.g:3016:1: ( ',' )
            {
            // InternalSlideOMatic.g:3016:1: ( ',' )
            // InternalSlideOMatic.g:3017:2: ','
            {
             before(grammarAccess.getTableAccess().getCommaKeyword_4_0()); 
            match(input,91,FOLLOW_2); 
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
    // InternalSlideOMatic.g:3026:1: rule__Table__Group_4__1 : rule__Table__Group_4__1__Impl ;
    public final void rule__Table__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3030:1: ( rule__Table__Group_4__1__Impl )
            // InternalSlideOMatic.g:3031:2: rule__Table__Group_4__1__Impl
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
    // InternalSlideOMatic.g:3037:1: rule__Table__Group_4__1__Impl : ( ( rule__Table__RowsAssignment_4_1 ) ) ;
    public final void rule__Table__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3041:1: ( ( ( rule__Table__RowsAssignment_4_1 ) ) )
            // InternalSlideOMatic.g:3042:1: ( ( rule__Table__RowsAssignment_4_1 ) )
            {
            // InternalSlideOMatic.g:3042:1: ( ( rule__Table__RowsAssignment_4_1 ) )
            // InternalSlideOMatic.g:3043:2: ( rule__Table__RowsAssignment_4_1 )
            {
             before(grammarAccess.getTableAccess().getRowsAssignment_4_1()); 
            // InternalSlideOMatic.g:3044:2: ( rule__Table__RowsAssignment_4_1 )
            // InternalSlideOMatic.g:3044:3: rule__Table__RowsAssignment_4_1
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
    // InternalSlideOMatic.g:3053:1: rule__TableRow__Group__0 : rule__TableRow__Group__0__Impl rule__TableRow__Group__1 ;
    public final void rule__TableRow__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3057:1: ( rule__TableRow__Group__0__Impl rule__TableRow__Group__1 )
            // InternalSlideOMatic.g:3058:2: rule__TableRow__Group__0__Impl rule__TableRow__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalSlideOMatic.g:3065:1: rule__TableRow__Group__0__Impl : ( '[' ) ;
    public final void rule__TableRow__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3069:1: ( ( '[' ) )
            // InternalSlideOMatic.g:3070:1: ( '[' )
            {
            // InternalSlideOMatic.g:3070:1: ( '[' )
            // InternalSlideOMatic.g:3071:2: '['
            {
             before(grammarAccess.getTableRowAccess().getLeftSquareBracketKeyword_0()); 
            match(input,89,FOLLOW_2); 
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
    // InternalSlideOMatic.g:3080:1: rule__TableRow__Group__1 : rule__TableRow__Group__1__Impl rule__TableRow__Group__2 ;
    public final void rule__TableRow__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3084:1: ( rule__TableRow__Group__1__Impl rule__TableRow__Group__2 )
            // InternalSlideOMatic.g:3085:2: rule__TableRow__Group__1__Impl rule__TableRow__Group__2
            {
            pushFollow(FOLLOW_34);
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
    // InternalSlideOMatic.g:3092:1: rule__TableRow__Group__1__Impl : ( ( rule__TableRow__ValuesAssignment_1 ) ) ;
    public final void rule__TableRow__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3096:1: ( ( ( rule__TableRow__ValuesAssignment_1 ) ) )
            // InternalSlideOMatic.g:3097:1: ( ( rule__TableRow__ValuesAssignment_1 ) )
            {
            // InternalSlideOMatic.g:3097:1: ( ( rule__TableRow__ValuesAssignment_1 ) )
            // InternalSlideOMatic.g:3098:2: ( rule__TableRow__ValuesAssignment_1 )
            {
             before(grammarAccess.getTableRowAccess().getValuesAssignment_1()); 
            // InternalSlideOMatic.g:3099:2: ( rule__TableRow__ValuesAssignment_1 )
            // InternalSlideOMatic.g:3099:3: rule__TableRow__ValuesAssignment_1
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
    // InternalSlideOMatic.g:3107:1: rule__TableRow__Group__2 : rule__TableRow__Group__2__Impl rule__TableRow__Group__3 ;
    public final void rule__TableRow__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3111:1: ( rule__TableRow__Group__2__Impl rule__TableRow__Group__3 )
            // InternalSlideOMatic.g:3112:2: rule__TableRow__Group__2__Impl rule__TableRow__Group__3
            {
            pushFollow(FOLLOW_34);
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
    // InternalSlideOMatic.g:3119:1: rule__TableRow__Group__2__Impl : ( ( rule__TableRow__Group_2__0 )* ) ;
    public final void rule__TableRow__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3123:1: ( ( ( rule__TableRow__Group_2__0 )* ) )
            // InternalSlideOMatic.g:3124:1: ( ( rule__TableRow__Group_2__0 )* )
            {
            // InternalSlideOMatic.g:3124:1: ( ( rule__TableRow__Group_2__0 )* )
            // InternalSlideOMatic.g:3125:2: ( rule__TableRow__Group_2__0 )*
            {
             before(grammarAccess.getTableRowAccess().getGroup_2()); 
            // InternalSlideOMatic.g:3126:2: ( rule__TableRow__Group_2__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==91) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalSlideOMatic.g:3126:3: rule__TableRow__Group_2__0
            	    {
            	    pushFollow(FOLLOW_35);
            	    rule__TableRow__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
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
    // InternalSlideOMatic.g:3134:1: rule__TableRow__Group__3 : rule__TableRow__Group__3__Impl ;
    public final void rule__TableRow__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3138:1: ( rule__TableRow__Group__3__Impl )
            // InternalSlideOMatic.g:3139:2: rule__TableRow__Group__3__Impl
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
    // InternalSlideOMatic.g:3145:1: rule__TableRow__Group__3__Impl : ( ']' ) ;
    public final void rule__TableRow__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3149:1: ( ( ']' ) )
            // InternalSlideOMatic.g:3150:1: ( ']' )
            {
            // InternalSlideOMatic.g:3150:1: ( ']' )
            // InternalSlideOMatic.g:3151:2: ']'
            {
             before(grammarAccess.getTableRowAccess().getRightSquareBracketKeyword_3()); 
            match(input,90,FOLLOW_2); 
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
    // InternalSlideOMatic.g:3161:1: rule__TableRow__Group_2__0 : rule__TableRow__Group_2__0__Impl rule__TableRow__Group_2__1 ;
    public final void rule__TableRow__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3165:1: ( rule__TableRow__Group_2__0__Impl rule__TableRow__Group_2__1 )
            // InternalSlideOMatic.g:3166:2: rule__TableRow__Group_2__0__Impl rule__TableRow__Group_2__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalSlideOMatic.g:3173:1: rule__TableRow__Group_2__0__Impl : ( ',' ) ;
    public final void rule__TableRow__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3177:1: ( ( ',' ) )
            // InternalSlideOMatic.g:3178:1: ( ',' )
            {
            // InternalSlideOMatic.g:3178:1: ( ',' )
            // InternalSlideOMatic.g:3179:2: ','
            {
             before(grammarAccess.getTableRowAccess().getCommaKeyword_2_0()); 
            match(input,91,FOLLOW_2); 
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
    // InternalSlideOMatic.g:3188:1: rule__TableRow__Group_2__1 : rule__TableRow__Group_2__1__Impl ;
    public final void rule__TableRow__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3192:1: ( rule__TableRow__Group_2__1__Impl )
            // InternalSlideOMatic.g:3193:2: rule__TableRow__Group_2__1__Impl
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
    // InternalSlideOMatic.g:3199:1: rule__TableRow__Group_2__1__Impl : ( ( rule__TableRow__ValuesAssignment_2_1 ) ) ;
    public final void rule__TableRow__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3203:1: ( ( ( rule__TableRow__ValuesAssignment_2_1 ) ) )
            // InternalSlideOMatic.g:3204:1: ( ( rule__TableRow__ValuesAssignment_2_1 ) )
            {
            // InternalSlideOMatic.g:3204:1: ( ( rule__TableRow__ValuesAssignment_2_1 ) )
            // InternalSlideOMatic.g:3205:2: ( rule__TableRow__ValuesAssignment_2_1 )
            {
             before(grammarAccess.getTableRowAccess().getValuesAssignment_2_1()); 
            // InternalSlideOMatic.g:3206:2: ( rule__TableRow__ValuesAssignment_2_1 )
            // InternalSlideOMatic.g:3206:3: rule__TableRow__ValuesAssignment_2_1
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
    // InternalSlideOMatic.g:3215:1: rule__Animation__Group__0 : rule__Animation__Group__0__Impl rule__Animation__Group__1 ;
    public final void rule__Animation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3219:1: ( rule__Animation__Group__0__Impl rule__Animation__Group__1 )
            // InternalSlideOMatic.g:3220:2: rule__Animation__Group__0__Impl rule__Animation__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalSlideOMatic.g:3227:1: rule__Animation__Group__0__Impl : ( 'animate' ) ;
    public final void rule__Animation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3231:1: ( ( 'animate' ) )
            // InternalSlideOMatic.g:3232:1: ( 'animate' )
            {
            // InternalSlideOMatic.g:3232:1: ( 'animate' )
            // InternalSlideOMatic.g:3233:2: 'animate'
            {
             before(grammarAccess.getAnimationAccess().getAnimateKeyword_0()); 
            match(input,92,FOLLOW_2); 
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
    // InternalSlideOMatic.g:3242:1: rule__Animation__Group__1 : rule__Animation__Group__1__Impl rule__Animation__Group__2 ;
    public final void rule__Animation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3246:1: ( rule__Animation__Group__1__Impl rule__Animation__Group__2 )
            // InternalSlideOMatic.g:3247:2: rule__Animation__Group__1__Impl rule__Animation__Group__2
            {
            pushFollow(FOLLOW_36);
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
    // InternalSlideOMatic.g:3254:1: rule__Animation__Group__1__Impl : ( ( rule__Animation__TargetAssignment_1 ) ) ;
    public final void rule__Animation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3258:1: ( ( ( rule__Animation__TargetAssignment_1 ) ) )
            // InternalSlideOMatic.g:3259:1: ( ( rule__Animation__TargetAssignment_1 ) )
            {
            // InternalSlideOMatic.g:3259:1: ( ( rule__Animation__TargetAssignment_1 ) )
            // InternalSlideOMatic.g:3260:2: ( rule__Animation__TargetAssignment_1 )
            {
             before(grammarAccess.getAnimationAccess().getTargetAssignment_1()); 
            // InternalSlideOMatic.g:3261:2: ( rule__Animation__TargetAssignment_1 )
            // InternalSlideOMatic.g:3261:3: rule__Animation__TargetAssignment_1
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
    // InternalSlideOMatic.g:3269:1: rule__Animation__Group__2 : rule__Animation__Group__2__Impl rule__Animation__Group__3 ;
    public final void rule__Animation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3273:1: ( rule__Animation__Group__2__Impl rule__Animation__Group__3 )
            // InternalSlideOMatic.g:3274:2: rule__Animation__Group__2__Impl rule__Animation__Group__3
            {
            pushFollow(FOLLOW_37);
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
    // InternalSlideOMatic.g:3281:1: rule__Animation__Group__2__Impl : ( ( rule__Animation__TypeAssignment_2 ) ) ;
    public final void rule__Animation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3285:1: ( ( ( rule__Animation__TypeAssignment_2 ) ) )
            // InternalSlideOMatic.g:3286:1: ( ( rule__Animation__TypeAssignment_2 ) )
            {
            // InternalSlideOMatic.g:3286:1: ( ( rule__Animation__TypeAssignment_2 ) )
            // InternalSlideOMatic.g:3287:2: ( rule__Animation__TypeAssignment_2 )
            {
             before(grammarAccess.getAnimationAccess().getTypeAssignment_2()); 
            // InternalSlideOMatic.g:3288:2: ( rule__Animation__TypeAssignment_2 )
            // InternalSlideOMatic.g:3288:3: rule__Animation__TypeAssignment_2
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
    // InternalSlideOMatic.g:3296:1: rule__Animation__Group__3 : rule__Animation__Group__3__Impl rule__Animation__Group__4 ;
    public final void rule__Animation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3300:1: ( rule__Animation__Group__3__Impl rule__Animation__Group__4 )
            // InternalSlideOMatic.g:3301:2: rule__Animation__Group__3__Impl rule__Animation__Group__4
            {
            pushFollow(FOLLOW_38);
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
    // InternalSlideOMatic.g:3308:1: rule__Animation__Group__3__Impl : ( 'to' ) ;
    public final void rule__Animation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3312:1: ( ( 'to' ) )
            // InternalSlideOMatic.g:3313:1: ( 'to' )
            {
            // InternalSlideOMatic.g:3313:1: ( 'to' )
            // InternalSlideOMatic.g:3314:2: 'to'
            {
             before(grammarAccess.getAnimationAccess().getToKeyword_3()); 
            match(input,93,FOLLOW_2); 
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
    // InternalSlideOMatic.g:3323:1: rule__Animation__Group__4 : rule__Animation__Group__4__Impl rule__Animation__Group__5 ;
    public final void rule__Animation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3327:1: ( rule__Animation__Group__4__Impl rule__Animation__Group__5 )
            // InternalSlideOMatic.g:3328:2: rule__Animation__Group__4__Impl rule__Animation__Group__5
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
    // InternalSlideOMatic.g:3335:1: rule__Animation__Group__4__Impl : ( ( rule__Animation__LocationAssignment_4 ) ) ;
    public final void rule__Animation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3339:1: ( ( ( rule__Animation__LocationAssignment_4 ) ) )
            // InternalSlideOMatic.g:3340:1: ( ( rule__Animation__LocationAssignment_4 ) )
            {
            // InternalSlideOMatic.g:3340:1: ( ( rule__Animation__LocationAssignment_4 ) )
            // InternalSlideOMatic.g:3341:2: ( rule__Animation__LocationAssignment_4 )
            {
             before(grammarAccess.getAnimationAccess().getLocationAssignment_4()); 
            // InternalSlideOMatic.g:3342:2: ( rule__Animation__LocationAssignment_4 )
            // InternalSlideOMatic.g:3342:3: rule__Animation__LocationAssignment_4
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
    // InternalSlideOMatic.g:3350:1: rule__Animation__Group__5 : rule__Animation__Group__5__Impl ;
    public final void rule__Animation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3354:1: ( rule__Animation__Group__5__Impl )
            // InternalSlideOMatic.g:3355:2: rule__Animation__Group__5__Impl
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
    // InternalSlideOMatic.g:3361:1: rule__Animation__Group__5__Impl : ( ( rule__Animation__SizeAssignment_5 )? ) ;
    public final void rule__Animation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3365:1: ( ( ( rule__Animation__SizeAssignment_5 )? ) )
            // InternalSlideOMatic.g:3366:1: ( ( rule__Animation__SizeAssignment_5 )? )
            {
            // InternalSlideOMatic.g:3366:1: ( ( rule__Animation__SizeAssignment_5 )? )
            // InternalSlideOMatic.g:3367:2: ( rule__Animation__SizeAssignment_5 )?
            {
             before(grammarAccess.getAnimationAccess().getSizeAssignment_5()); 
            // InternalSlideOMatic.g:3368:2: ( rule__Animation__SizeAssignment_5 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>=65 && LA31_0<=66)) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalSlideOMatic.g:3368:3: rule__Animation__SizeAssignment_5
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
    // InternalSlideOMatic.g:3377:1: rule__AnimationType__Group_0__0 : rule__AnimationType__Group_0__0__Impl rule__AnimationType__Group_0__1 ;
    public final void rule__AnimationType__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3381:1: ( rule__AnimationType__Group_0__0__Impl rule__AnimationType__Group_0__1 )
            // InternalSlideOMatic.g:3382:2: rule__AnimationType__Group_0__0__Impl rule__AnimationType__Group_0__1
            {
            pushFollow(FOLLOW_39);
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
    // InternalSlideOMatic.g:3389:1: rule__AnimationType__Group_0__0__Impl : ( () ) ;
    public final void rule__AnimationType__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3393:1: ( ( () ) )
            // InternalSlideOMatic.g:3394:1: ( () )
            {
            // InternalSlideOMatic.g:3394:1: ( () )
            // InternalSlideOMatic.g:3395:2: ()
            {
             before(grammarAccess.getAnimationTypeAccess().getMoveAction_0_0()); 
            // InternalSlideOMatic.g:3396:2: ()
            // InternalSlideOMatic.g:3396:3: 
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
    // InternalSlideOMatic.g:3404:1: rule__AnimationType__Group_0__1 : rule__AnimationType__Group_0__1__Impl ;
    public final void rule__AnimationType__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3408:1: ( rule__AnimationType__Group_0__1__Impl )
            // InternalSlideOMatic.g:3409:2: rule__AnimationType__Group_0__1__Impl
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
    // InternalSlideOMatic.g:3415:1: rule__AnimationType__Group_0__1__Impl : ( 'move' ) ;
    public final void rule__AnimationType__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3419:1: ( ( 'move' ) )
            // InternalSlideOMatic.g:3420:1: ( 'move' )
            {
            // InternalSlideOMatic.g:3420:1: ( 'move' )
            // InternalSlideOMatic.g:3421:2: 'move'
            {
             before(grammarAccess.getAnimationTypeAccess().getMoveKeyword_0_1()); 
            match(input,94,FOLLOW_2); 
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
    // InternalSlideOMatic.g:3431:1: rule__AnimationType__Group_1__0 : rule__AnimationType__Group_1__0__Impl rule__AnimationType__Group_1__1 ;
    public final void rule__AnimationType__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3435:1: ( rule__AnimationType__Group_1__0__Impl rule__AnimationType__Group_1__1 )
            // InternalSlideOMatic.g:3436:2: rule__AnimationType__Group_1__0__Impl rule__AnimationType__Group_1__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalSlideOMatic.g:3443:1: rule__AnimationType__Group_1__0__Impl : ( () ) ;
    public final void rule__AnimationType__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3447:1: ( ( () ) )
            // InternalSlideOMatic.g:3448:1: ( () )
            {
            // InternalSlideOMatic.g:3448:1: ( () )
            // InternalSlideOMatic.g:3449:2: ()
            {
             before(grammarAccess.getAnimationTypeAccess().getJumpAction_1_0()); 
            // InternalSlideOMatic.g:3450:2: ()
            // InternalSlideOMatic.g:3450:3: 
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
    // InternalSlideOMatic.g:3458:1: rule__AnimationType__Group_1__1 : rule__AnimationType__Group_1__1__Impl ;
    public final void rule__AnimationType__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3462:1: ( rule__AnimationType__Group_1__1__Impl )
            // InternalSlideOMatic.g:3463:2: rule__AnimationType__Group_1__1__Impl
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
    // InternalSlideOMatic.g:3469:1: rule__AnimationType__Group_1__1__Impl : ( 'jump' ) ;
    public final void rule__AnimationType__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3473:1: ( ( 'jump' ) )
            // InternalSlideOMatic.g:3474:1: ( 'jump' )
            {
            // InternalSlideOMatic.g:3474:1: ( 'jump' )
            // InternalSlideOMatic.g:3475:2: 'jump'
            {
             before(grammarAccess.getAnimationTypeAccess().getJumpKeyword_1_1()); 
            match(input,95,FOLLOW_2); 
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


    // $ANTLR start "rule__Model__PresentationAssignment"
    // InternalSlideOMatic.g:3485:1: rule__Model__PresentationAssignment : ( rulePresentation ) ;
    public final void rule__Model__PresentationAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3489:1: ( ( rulePresentation ) )
            // InternalSlideOMatic.g:3490:2: ( rulePresentation )
            {
            // InternalSlideOMatic.g:3490:2: ( rulePresentation )
            // InternalSlideOMatic.g:3491:3: rulePresentation
            {
             before(grammarAccess.getModelAccess().getPresentationPresentationParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulePresentation();

            state._fsp--;

             after(grammarAccess.getModelAccess().getPresentationPresentationParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__PresentationAssignment"


    // $ANTLR start "rule__Presentation__NameAssignment_1"
    // InternalSlideOMatic.g:3500:1: rule__Presentation__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Presentation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3504:1: ( ( RULE_ID ) )
            // InternalSlideOMatic.g:3505:2: ( RULE_ID )
            {
            // InternalSlideOMatic.g:3505:2: ( RULE_ID )
            // InternalSlideOMatic.g:3506:3: RULE_ID
            {
             before(grammarAccess.getPresentationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPresentationAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__Presentation__SettingsAssignment_3_1"
    // InternalSlideOMatic.g:3515:1: rule__Presentation__SettingsAssignment_3_1 : ( ruleSetting ) ;
    public final void rule__Presentation__SettingsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3519:1: ( ( ruleSetting ) )
            // InternalSlideOMatic.g:3520:2: ( ruleSetting )
            {
            // InternalSlideOMatic.g:3520:2: ( ruleSetting )
            // InternalSlideOMatic.g:3521:3: ruleSetting
            {
             before(grammarAccess.getPresentationAccess().getSettingsSettingParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSetting();

            state._fsp--;

             after(grammarAccess.getPresentationAccess().getSettingsSettingParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Presentation__SettingsAssignment_3_1"


    // $ANTLR start "rule__Presentation__SlidesAssignment_4_0"
    // InternalSlideOMatic.g:3530:1: rule__Presentation__SlidesAssignment_4_0 : ( ruleSlide ) ;
    public final void rule__Presentation__SlidesAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3534:1: ( ( ruleSlide ) )
            // InternalSlideOMatic.g:3535:2: ( ruleSlide )
            {
            // InternalSlideOMatic.g:3535:2: ( ruleSlide )
            // InternalSlideOMatic.g:3536:3: ruleSlide
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
    // InternalSlideOMatic.g:3545:1: rule__Presentation__AnimationsAssignment_4_1 : ( ruleAnimation ) ;
    public final void rule__Presentation__AnimationsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3549:1: ( ( ruleAnimation ) )
            // InternalSlideOMatic.g:3550:2: ( ruleAnimation )
            {
            // InternalSlideOMatic.g:3550:2: ( ruleAnimation )
            // InternalSlideOMatic.g:3551:3: ruleAnimation
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
    // InternalSlideOMatic.g:3560:1: rule__Theme__ThemeAssignment_1 : ( ruleBeamerTheme ) ;
    public final void rule__Theme__ThemeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3564:1: ( ( ruleBeamerTheme ) )
            // InternalSlideOMatic.g:3565:2: ( ruleBeamerTheme )
            {
            // InternalSlideOMatic.g:3565:2: ( ruleBeamerTheme )
            // InternalSlideOMatic.g:3566:3: ruleBeamerTheme
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
    // InternalSlideOMatic.g:3575:1: rule__Theme__ThemeColorAssignment_2_1 : ( ruleThemeColor ) ;
    public final void rule__Theme__ThemeColorAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3579:1: ( ( ruleThemeColor ) )
            // InternalSlideOMatic.g:3580:2: ( ruleThemeColor )
            {
            // InternalSlideOMatic.g:3580:2: ( ruleThemeColor )
            // InternalSlideOMatic.g:3581:3: ruleThemeColor
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


    // $ANTLR start "rule__Author__ANameAssignment_1"
    // InternalSlideOMatic.g:3590:1: rule__Author__ANameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Author__ANameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3594:1: ( ( RULE_STRING ) )
            // InternalSlideOMatic.g:3595:2: ( RULE_STRING )
            {
            // InternalSlideOMatic.g:3595:2: ( RULE_STRING )
            // InternalSlideOMatic.g:3596:3: RULE_STRING
            {
             before(grammarAccess.getAuthorAccess().getANameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getAuthorAccess().getANameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Author__ANameAssignment_1"


    // $ANTLR start "rule__Date__DateAssignment_1"
    // InternalSlideOMatic.g:3605:1: rule__Date__DateAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Date__DateAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3609:1: ( ( RULE_STRING ) )
            // InternalSlideOMatic.g:3610:2: ( RULE_STRING )
            {
            // InternalSlideOMatic.g:3610:2: ( RULE_STRING )
            // InternalSlideOMatic.g:3611:3: RULE_STRING
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


    // $ANTLR start "rule__Slide__SNameAssignment_2"
    // InternalSlideOMatic.g:3620:1: rule__Slide__SNameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Slide__SNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3624:1: ( ( RULE_STRING ) )
            // InternalSlideOMatic.g:3625:2: ( RULE_STRING )
            {
            // InternalSlideOMatic.g:3625:2: ( RULE_STRING )
            // InternalSlideOMatic.g:3626:3: RULE_STRING
            {
             before(grammarAccess.getSlideAccess().getSNameSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSlideAccess().getSNameSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slide__SNameAssignment_2"


    // $ANTLR start "rule__Slide__ContentsAssignment_4"
    // InternalSlideOMatic.g:3635:1: rule__Slide__ContentsAssignment_4 : ( ruleContent ) ;
    public final void rule__Slide__ContentsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3639:1: ( ( ruleContent ) )
            // InternalSlideOMatic.g:3640:2: ( ruleContent )
            {
            // InternalSlideOMatic.g:3640:2: ( ruleContent )
            // InternalSlideOMatic.g:3641:3: ruleContent
            {
             before(grammarAccess.getSlideAccess().getContentsContentParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleContent();

            state._fsp--;

             after(grammarAccess.getSlideAccess().getContentsContentParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slide__ContentsAssignment_4"


    // $ANTLR start "rule__Text__TextAssignment_0_2"
    // InternalSlideOMatic.g:3650:1: rule__Text__TextAssignment_0_2 : ( RULE_STRING ) ;
    public final void rule__Text__TextAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3654:1: ( ( RULE_STRING ) )
            // InternalSlideOMatic.g:3655:2: ( RULE_STRING )
            {
            // InternalSlideOMatic.g:3655:2: ( RULE_STRING )
            // InternalSlideOMatic.g:3656:3: RULE_STRING
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
    // InternalSlideOMatic.g:3665:1: rule__Text__NameAssignment_1_2 : ( RULE_ID ) ;
    public final void rule__Text__NameAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3669:1: ( ( RULE_ID ) )
            // InternalSlideOMatic.g:3670:2: ( RULE_ID )
            {
            // InternalSlideOMatic.g:3670:2: ( RULE_ID )
            // InternalSlideOMatic.g:3671:3: RULE_ID
            {
             before(grammarAccess.getTextAccess().getNameIDTerminalRuleCall_1_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTextAccess().getNameIDTerminalRuleCall_1_2_0()); 

            }


            }

        }
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
    // InternalSlideOMatic.g:3680:1: rule__Text__TextAssignment_1_4 : ( RULE_STRING ) ;
    public final void rule__Text__TextAssignment_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3684:1: ( ( RULE_STRING ) )
            // InternalSlideOMatic.g:3685:2: ( RULE_STRING )
            {
            // InternalSlideOMatic.g:3685:2: ( RULE_STRING )
            // InternalSlideOMatic.g:3686:3: RULE_STRING
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


    // $ANTLR start "rule__List__ListItemsAssignment_0"
    // InternalSlideOMatic.g:3695:1: rule__List__ListItemsAssignment_0 : ( ruleNumberedListItem ) ;
    public final void rule__List__ListItemsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3699:1: ( ( ruleNumberedListItem ) )
            // InternalSlideOMatic.g:3700:2: ( ruleNumberedListItem )
            {
            // InternalSlideOMatic.g:3700:2: ( ruleNumberedListItem )
            // InternalSlideOMatic.g:3701:3: ruleNumberedListItem
            {
             before(grammarAccess.getListAccess().getListItemsNumberedListItemParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleNumberedListItem();

            state._fsp--;

             after(grammarAccess.getListAccess().getListItemsNumberedListItemParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__List__ListItemsAssignment_0"


    // $ANTLR start "rule__List__ListItemsAssignment_1"
    // InternalSlideOMatic.g:3710:1: rule__List__ListItemsAssignment_1 : ( ruleUnNumberedList ) ;
    public final void rule__List__ListItemsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3714:1: ( ( ruleUnNumberedList ) )
            // InternalSlideOMatic.g:3715:2: ( ruleUnNumberedList )
            {
            // InternalSlideOMatic.g:3715:2: ( ruleUnNumberedList )
            // InternalSlideOMatic.g:3716:3: ruleUnNumberedList
            {
             before(grammarAccess.getListAccess().getListItemsUnNumberedListParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleUnNumberedList();

            state._fsp--;

             after(grammarAccess.getListAccess().getListItemsUnNumberedListParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__List__ListItemsAssignment_1"


    // $ANTLR start "rule__NumberedListItem__ItemAssignment_1"
    // InternalSlideOMatic.g:3725:1: rule__NumberedListItem__ItemAssignment_1 : ( RULE_STRING ) ;
    public final void rule__NumberedListItem__ItemAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3729:1: ( ( RULE_STRING ) )
            // InternalSlideOMatic.g:3730:2: ( RULE_STRING )
            {
            // InternalSlideOMatic.g:3730:2: ( RULE_STRING )
            // InternalSlideOMatic.g:3731:3: RULE_STRING
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


    // $ANTLR start "rule__UnNumberedList__ItemAssignment_1"
    // InternalSlideOMatic.g:3740:1: rule__UnNumberedList__ItemAssignment_1 : ( RULE_STRING ) ;
    public final void rule__UnNumberedList__ItemAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3744:1: ( ( RULE_STRING ) )
            // InternalSlideOMatic.g:3745:2: ( RULE_STRING )
            {
            // InternalSlideOMatic.g:3745:2: ( RULE_STRING )
            // InternalSlideOMatic.g:3746:3: RULE_STRING
            {
             before(grammarAccess.getUnNumberedListAccess().getItemSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getUnNumberedListAccess().getItemSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnNumberedList__ItemAssignment_1"


    // $ANTLR start "rule__Image__NameAssignment_1"
    // InternalSlideOMatic.g:3755:1: rule__Image__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Image__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3759:1: ( ( RULE_ID ) )
            // InternalSlideOMatic.g:3760:2: ( RULE_ID )
            {
            // InternalSlideOMatic.g:3760:2: ( RULE_ID )
            // InternalSlideOMatic.g:3761:3: RULE_ID
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
    // InternalSlideOMatic.g:3770:1: rule__Image__SrcAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Image__SrcAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3774:1: ( ( RULE_STRING ) )
            // InternalSlideOMatic.g:3775:2: ( RULE_STRING )
            {
            // InternalSlideOMatic.g:3775:2: ( RULE_STRING )
            // InternalSlideOMatic.g:3776:3: RULE_STRING
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
    // InternalSlideOMatic.g:3785:1: rule__Image__AlignmentAssignment_4 : ( ruleAlignment ) ;
    public final void rule__Image__AlignmentAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3789:1: ( ( ruleAlignment ) )
            // InternalSlideOMatic.g:3790:2: ( ruleAlignment )
            {
            // InternalSlideOMatic.g:3790:2: ( ruleAlignment )
            // InternalSlideOMatic.g:3791:3: ruleAlignment
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
    // InternalSlideOMatic.g:3800:1: rule__Image__SizeAssignment_5 : ( ruleSize ) ;
    public final void rule__Image__SizeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3804:1: ( ( ruleSize ) )
            // InternalSlideOMatic.g:3805:2: ( ruleSize )
            {
            // InternalSlideOMatic.g:3805:2: ( ruleSize )
            // InternalSlideOMatic.g:3806:3: ruleSize
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
    // InternalSlideOMatic.g:3815:1: rule__Size__ScaleAssignment_1 : ( RULE_INT ) ;
    public final void rule__Size__ScaleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3819:1: ( ( RULE_INT ) )
            // InternalSlideOMatic.g:3820:2: ( RULE_INT )
            {
            // InternalSlideOMatic.g:3820:2: ( RULE_INT )
            // InternalSlideOMatic.g:3821:3: RULE_INT
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
    // InternalSlideOMatic.g:3830:1: rule__Table__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Table__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3834:1: ( ( RULE_ID ) )
            // InternalSlideOMatic.g:3835:2: ( RULE_ID )
            {
            // InternalSlideOMatic.g:3835:2: ( RULE_ID )
            // InternalSlideOMatic.g:3836:3: RULE_ID
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
    // InternalSlideOMatic.g:3845:1: rule__Table__RowsAssignment_3 : ( ruleTableRow ) ;
    public final void rule__Table__RowsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3849:1: ( ( ruleTableRow ) )
            // InternalSlideOMatic.g:3850:2: ( ruleTableRow )
            {
            // InternalSlideOMatic.g:3850:2: ( ruleTableRow )
            // InternalSlideOMatic.g:3851:3: ruleTableRow
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
    // InternalSlideOMatic.g:3860:1: rule__Table__RowsAssignment_4_1 : ( ruleTableRow ) ;
    public final void rule__Table__RowsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3864:1: ( ( ruleTableRow ) )
            // InternalSlideOMatic.g:3865:2: ( ruleTableRow )
            {
            // InternalSlideOMatic.g:3865:2: ( ruleTableRow )
            // InternalSlideOMatic.g:3866:3: ruleTableRow
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
    // InternalSlideOMatic.g:3875:1: rule__TableRow__ValuesAssignment_1 : ( RULE_STRING ) ;
    public final void rule__TableRow__ValuesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3879:1: ( ( RULE_STRING ) )
            // InternalSlideOMatic.g:3880:2: ( RULE_STRING )
            {
            // InternalSlideOMatic.g:3880:2: ( RULE_STRING )
            // InternalSlideOMatic.g:3881:3: RULE_STRING
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
    // InternalSlideOMatic.g:3890:1: rule__TableRow__ValuesAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__TableRow__ValuesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3894:1: ( ( RULE_STRING ) )
            // InternalSlideOMatic.g:3895:2: ( RULE_STRING )
            {
            // InternalSlideOMatic.g:3895:2: ( RULE_STRING )
            // InternalSlideOMatic.g:3896:3: RULE_STRING
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
    // InternalSlideOMatic.g:3905:1: rule__Animation__TargetAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Animation__TargetAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3909:1: ( ( ( RULE_ID ) ) )
            // InternalSlideOMatic.g:3910:2: ( ( RULE_ID ) )
            {
            // InternalSlideOMatic.g:3910:2: ( ( RULE_ID ) )
            // InternalSlideOMatic.g:3911:3: ( RULE_ID )
            {
             before(grammarAccess.getAnimationAccess().getTargetFloatCrossReference_1_0()); 
            // InternalSlideOMatic.g:3912:3: ( RULE_ID )
            // InternalSlideOMatic.g:3913:4: RULE_ID
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
    // InternalSlideOMatic.g:3924:1: rule__Animation__TypeAssignment_2 : ( ruleAnimationType ) ;
    public final void rule__Animation__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3928:1: ( ( ruleAnimationType ) )
            // InternalSlideOMatic.g:3929:2: ( ruleAnimationType )
            {
            // InternalSlideOMatic.g:3929:2: ( ruleAnimationType )
            // InternalSlideOMatic.g:3930:3: ruleAnimationType
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
    // InternalSlideOMatic.g:3939:1: rule__Animation__LocationAssignment_4 : ( ruleAlignment ) ;
    public final void rule__Animation__LocationAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3943:1: ( ( ruleAlignment ) )
            // InternalSlideOMatic.g:3944:2: ( ruleAlignment )
            {
            // InternalSlideOMatic.g:3944:2: ( ruleAlignment )
            // InternalSlideOMatic.g:3945:3: ruleAlignment
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
    // InternalSlideOMatic.g:3954:1: rule__Animation__SizeAssignment_5 : ( ruleSize ) ;
    public final void rule__Animation__SizeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSlideOMatic.g:3958:1: ( ( ruleSize ) )
            // InternalSlideOMatic.g:3959:2: ( ruleSize )
            {
            // InternalSlideOMatic.g:3959:2: ( ruleSize )
            // InternalSlideOMatic.g:3960:3: ruleSize
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000000L,0x0000000010001020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000002L,0x0000000010001000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000D80L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000D00L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000FFFFFFF000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00FFFF0000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000020L,0x000000000000E010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000000L,0x00000000013F0000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000002L,0x00000000013F0000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000000L,0x000000000000E000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000000L,0x0000000000060000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000010L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0xFF00000000000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000000L,0x000000000C000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000000L,0x00000000C0000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0xFF00000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});

}