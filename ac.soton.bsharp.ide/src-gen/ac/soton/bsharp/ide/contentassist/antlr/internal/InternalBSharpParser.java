package ac.soton.bsharp.ide.contentassist.antlr.internal;

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
import ac.soton.bsharp.services.BSharpGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBSharpParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_WS", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ANY_OTHER", "'\\u00AC'", "'*'", "'\\u00D7'", "'\\u2192'", "'\\uE102'", "'\\uE100'", "'\\u2194'", "'\\u2916'", "'\\u21F8'", "'\\u21A3'", "'\\u2900'", "'\\u21A0'", "'\\u2200'", "'\\u2203'", "'\\u21D4'", "'\\u21D2'", "'='", "'\\u2260'", "'\\u2227'", "'\\u2228'", "'\\u2208'", "'package'", "':'", "'.'", "'From'", "'Import'", "'Class'", "';'", "'['", "']'", "'('", "')'", "'<'", "'>'", "','", "'\\u2119'", "'where'", "'Datatype'", "'|'", "'Extend'", "'{'", "'}'", "'match'", "'Theorems'", "'\\u00B7'", "'if'", "'else'", "'Instance'", "'INFIX'", "'\\u03BB'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=6;
    public static final int RULE_ANY_OTHER=10;
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

    // delegates
    // delegators


        public InternalBSharpParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalBSharpParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalBSharpParser.tokenNames; }
    public String getGrammarFileName() { return "InternalBSharp.g"; }


    	private BSharpGrammarAccess grammarAccess;

    	public void setGrammarAccess(BSharpGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleTopLevel"
    // InternalBSharp.g:53:1: entryRuleTopLevel : ruleTopLevel EOF ;
    public final void entryRuleTopLevel() throws RecognitionException {
        try {
            // InternalBSharp.g:54:1: ( ruleTopLevel EOF )
            // InternalBSharp.g:55:1: ruleTopLevel EOF
            {
             before(grammarAccess.getTopLevelRule()); 
            pushFollow(FOLLOW_1);
            ruleTopLevel();

            state._fsp--;

             after(grammarAccess.getTopLevelRule()); 
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
    // $ANTLR end "entryRuleTopLevel"


    // $ANTLR start "ruleTopLevel"
    // InternalBSharp.g:62:1: ruleTopLevel : ( ( rule__TopLevel__Group__0 ) ) ;
    public final void ruleTopLevel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:66:2: ( ( ( rule__TopLevel__Group__0 ) ) )
            // InternalBSharp.g:67:2: ( ( rule__TopLevel__Group__0 ) )
            {
            // InternalBSharp.g:67:2: ( ( rule__TopLevel__Group__0 ) )
            // InternalBSharp.g:68:3: ( rule__TopLevel__Group__0 )
            {
             before(grammarAccess.getTopLevelAccess().getGroup()); 
            // InternalBSharp.g:69:3: ( rule__TopLevel__Group__0 )
            // InternalBSharp.g:69:4: rule__TopLevel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TopLevel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTopLevelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTopLevel"


    // $ANTLR start "entryRuleTHM_NAME"
    // InternalBSharp.g:78:1: entryRuleTHM_NAME : ruleTHM_NAME EOF ;
    public final void entryRuleTHM_NAME() throws RecognitionException {
        try {
            // InternalBSharp.g:79:1: ( ruleTHM_NAME EOF )
            // InternalBSharp.g:80:1: ruleTHM_NAME EOF
            {
             before(grammarAccess.getTHM_NAMERule()); 
            pushFollow(FOLLOW_1);
            ruleTHM_NAME();

            state._fsp--;

             after(grammarAccess.getTHM_NAMERule()); 
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
    // $ANTLR end "entryRuleTHM_NAME"


    // $ANTLR start "ruleTHM_NAME"
    // InternalBSharp.g:87:1: ruleTHM_NAME : ( ( rule__THM_NAME__Group__0 ) ) ;
    public final void ruleTHM_NAME() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:91:2: ( ( ( rule__THM_NAME__Group__0 ) ) )
            // InternalBSharp.g:92:2: ( ( rule__THM_NAME__Group__0 ) )
            {
            // InternalBSharp.g:92:2: ( ( rule__THM_NAME__Group__0 ) )
            // InternalBSharp.g:93:3: ( rule__THM_NAME__Group__0 )
            {
             before(grammarAccess.getTHM_NAMEAccess().getGroup()); 
            // InternalBSharp.g:94:3: ( rule__THM_NAME__Group__0 )
            // InternalBSharp.g:94:4: rule__THM_NAME__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__THM_NAME__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTHM_NAMEAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTHM_NAME"


    // $ANTLR start "entryRuleTopLevelFile"
    // InternalBSharp.g:103:1: entryRuleTopLevelFile : ruleTopLevelFile EOF ;
    public final void entryRuleTopLevelFile() throws RecognitionException {
        try {
            // InternalBSharp.g:104:1: ( ruleTopLevelFile EOF )
            // InternalBSharp.g:105:1: ruleTopLevelFile EOF
            {
             before(grammarAccess.getTopLevelFileRule()); 
            pushFollow(FOLLOW_1);
            ruleTopLevelFile();

            state._fsp--;

             after(grammarAccess.getTopLevelFileRule()); 
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
    // $ANTLR end "entryRuleTopLevelFile"


    // $ANTLR start "ruleTopLevelFile"
    // InternalBSharp.g:112:1: ruleTopLevelFile : ( ( rule__TopLevelFile__Group__0 ) ) ;
    public final void ruleTopLevelFile() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:116:2: ( ( ( rule__TopLevelFile__Group__0 ) ) )
            // InternalBSharp.g:117:2: ( ( rule__TopLevelFile__Group__0 ) )
            {
            // InternalBSharp.g:117:2: ( ( rule__TopLevelFile__Group__0 ) )
            // InternalBSharp.g:118:3: ( rule__TopLevelFile__Group__0 )
            {
             before(grammarAccess.getTopLevelFileAccess().getGroup()); 
            // InternalBSharp.g:119:3: ( rule__TopLevelFile__Group__0 )
            // InternalBSharp.g:119:4: rule__TopLevelFile__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TopLevelFile__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTopLevelFileAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTopLevelFile"


    // $ANTLR start "entryRuleClassDecl"
    // InternalBSharp.g:128:1: entryRuleClassDecl : ruleClassDecl EOF ;
    public final void entryRuleClassDecl() throws RecognitionException {
        try {
            // InternalBSharp.g:129:1: ( ruleClassDecl EOF )
            // InternalBSharp.g:130:1: ruleClassDecl EOF
            {
             before(grammarAccess.getClassDeclRule()); 
            pushFollow(FOLLOW_1);
            ruleClassDecl();

            state._fsp--;

             after(grammarAccess.getClassDeclRule()); 
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
    // $ANTLR end "entryRuleClassDecl"


    // $ANTLR start "ruleClassDecl"
    // InternalBSharp.g:137:1: ruleClassDecl : ( ( rule__ClassDecl__Alternatives ) ) ;
    public final void ruleClassDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:141:2: ( ( ( rule__ClassDecl__Alternatives ) ) )
            // InternalBSharp.g:142:2: ( ( rule__ClassDecl__Alternatives ) )
            {
            // InternalBSharp.g:142:2: ( ( rule__ClassDecl__Alternatives ) )
            // InternalBSharp.g:143:3: ( rule__ClassDecl__Alternatives )
            {
             before(grammarAccess.getClassDeclAccess().getAlternatives()); 
            // InternalBSharp.g:144:3: ( rule__ClassDecl__Alternatives )
            // InternalBSharp.g:144:4: rule__ClassDecl__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ClassDecl__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getClassDeclAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClassDecl"


    // $ANTLR start "entryRuleType"
    // InternalBSharp.g:153:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalBSharp.g:154:1: ( ruleType EOF )
            // InternalBSharp.g:155:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalBSharp.g:162:1: ruleType : ( ruleClassDecl ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:166:2: ( ( ruleClassDecl ) )
            // InternalBSharp.g:167:2: ( ruleClassDecl )
            {
            // InternalBSharp.g:167:2: ( ruleClassDecl )
            // InternalBSharp.g:168:3: ruleClassDecl
            {
             before(grammarAccess.getTypeAccess().getClassDeclParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleClassDecl();

            state._fsp--;

             after(grammarAccess.getTypeAccess().getClassDeclParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalBSharp.g:178:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalBSharp.g:179:1: ( ruleQualifiedName EOF )
            // InternalBSharp.g:180:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalBSharp.g:187:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:191:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalBSharp.g:192:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalBSharp.g:192:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalBSharp.g:193:3: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalBSharp.g:194:3: ( rule__QualifiedName__Group__0 )
            // InternalBSharp.g:194:4: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleTopLevelImport"
    // InternalBSharp.g:203:1: entryRuleTopLevelImport : ruleTopLevelImport EOF ;
    public final void entryRuleTopLevelImport() throws RecognitionException {
        try {
            // InternalBSharp.g:204:1: ( ruleTopLevelImport EOF )
            // InternalBSharp.g:205:1: ruleTopLevelImport EOF
            {
             before(grammarAccess.getTopLevelImportRule()); 
            pushFollow(FOLLOW_1);
            ruleTopLevelImport();

            state._fsp--;

             after(grammarAccess.getTopLevelImportRule()); 
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
    // $ANTLR end "entryRuleTopLevelImport"


    // $ANTLR start "ruleTopLevelImport"
    // InternalBSharp.g:212:1: ruleTopLevelImport : ( ( rule__TopLevelImport__Group__0 ) ) ;
    public final void ruleTopLevelImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:216:2: ( ( ( rule__TopLevelImport__Group__0 ) ) )
            // InternalBSharp.g:217:2: ( ( rule__TopLevelImport__Group__0 ) )
            {
            // InternalBSharp.g:217:2: ( ( rule__TopLevelImport__Group__0 ) )
            // InternalBSharp.g:218:3: ( rule__TopLevelImport__Group__0 )
            {
             before(grammarAccess.getTopLevelImportAccess().getGroup()); 
            // InternalBSharp.g:219:3: ( rule__TopLevelImport__Group__0 )
            // InternalBSharp.g:219:4: rule__TopLevelImport__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TopLevelImport__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTopLevelImportAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTopLevelImport"


    // $ANTLR start "entryRuleTopLevelInstance"
    // InternalBSharp.g:228:1: entryRuleTopLevelInstance : ruleTopLevelInstance EOF ;
    public final void entryRuleTopLevelInstance() throws RecognitionException {
        try {
            // InternalBSharp.g:229:1: ( ruleTopLevelInstance EOF )
            // InternalBSharp.g:230:1: ruleTopLevelInstance EOF
            {
             before(grammarAccess.getTopLevelInstanceRule()); 
            pushFollow(FOLLOW_1);
            ruleTopLevelInstance();

            state._fsp--;

             after(grammarAccess.getTopLevelInstanceRule()); 
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
    // $ANTLR end "entryRuleTopLevelInstance"


    // $ANTLR start "ruleTopLevelInstance"
    // InternalBSharp.g:237:1: ruleTopLevelInstance : ( ( rule__TopLevelInstance__Alternatives ) ) ;
    public final void ruleTopLevelInstance() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:241:2: ( ( ( rule__TopLevelInstance__Alternatives ) ) )
            // InternalBSharp.g:242:2: ( ( rule__TopLevelInstance__Alternatives ) )
            {
            // InternalBSharp.g:242:2: ( ( rule__TopLevelInstance__Alternatives ) )
            // InternalBSharp.g:243:3: ( rule__TopLevelInstance__Alternatives )
            {
             before(grammarAccess.getTopLevelInstanceAccess().getAlternatives()); 
            // InternalBSharp.g:244:3: ( rule__TopLevelInstance__Alternatives )
            // InternalBSharp.g:244:4: rule__TopLevelInstance__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TopLevelInstance__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTopLevelInstanceAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTopLevelInstance"


    // $ANTLR start "entryRuleImport"
    // InternalBSharp.g:253:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // InternalBSharp.g:254:1: ( ruleImport EOF )
            // InternalBSharp.g:255:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getImportRule()); 
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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalBSharp.g:262:1: ruleImport : ( ( rule__Import__Alternatives ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:266:2: ( ( ( rule__Import__Alternatives ) ) )
            // InternalBSharp.g:267:2: ( ( rule__Import__Alternatives ) )
            {
            // InternalBSharp.g:267:2: ( ( rule__Import__Alternatives ) )
            // InternalBSharp.g:268:3: ( rule__Import__Alternatives )
            {
             before(grammarAccess.getImportAccess().getAlternatives()); 
            // InternalBSharp.g:269:3: ( rule__Import__Alternatives )
            // InternalBSharp.g:269:4: rule__Import__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Import__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleGlobalImport"
    // InternalBSharp.g:278:1: entryRuleGlobalImport : ruleGlobalImport EOF ;
    public final void entryRuleGlobalImport() throws RecognitionException {
        try {
            // InternalBSharp.g:279:1: ( ruleGlobalImport EOF )
            // InternalBSharp.g:280:1: ruleGlobalImport EOF
            {
             before(grammarAccess.getGlobalImportRule()); 
            pushFollow(FOLLOW_1);
            ruleGlobalImport();

            state._fsp--;

             after(grammarAccess.getGlobalImportRule()); 
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
    // $ANTLR end "entryRuleGlobalImport"


    // $ANTLR start "ruleGlobalImport"
    // InternalBSharp.g:287:1: ruleGlobalImport : ( ( rule__GlobalImport__Group__0 ) ) ;
    public final void ruleGlobalImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:291:2: ( ( ( rule__GlobalImport__Group__0 ) ) )
            // InternalBSharp.g:292:2: ( ( rule__GlobalImport__Group__0 ) )
            {
            // InternalBSharp.g:292:2: ( ( rule__GlobalImport__Group__0 ) )
            // InternalBSharp.g:293:3: ( rule__GlobalImport__Group__0 )
            {
             before(grammarAccess.getGlobalImportAccess().getGroup()); 
            // InternalBSharp.g:294:3: ( rule__GlobalImport__Group__0 )
            // InternalBSharp.g:294:4: rule__GlobalImport__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GlobalImport__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGlobalImportAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGlobalImport"


    // $ANTLR start "entryRuleFileImport"
    // InternalBSharp.g:303:1: entryRuleFileImport : ruleFileImport EOF ;
    public final void entryRuleFileImport() throws RecognitionException {
        try {
            // InternalBSharp.g:304:1: ( ruleFileImport EOF )
            // InternalBSharp.g:305:1: ruleFileImport EOF
            {
             before(grammarAccess.getFileImportRule()); 
            pushFollow(FOLLOW_1);
            ruleFileImport();

            state._fsp--;

             after(grammarAccess.getFileImportRule()); 
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
    // $ANTLR end "entryRuleFileImport"


    // $ANTLR start "ruleFileImport"
    // InternalBSharp.g:312:1: ruleFileImport : ( ( rule__FileImport__Group__0 ) ) ;
    public final void ruleFileImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:316:2: ( ( ( rule__FileImport__Group__0 ) ) )
            // InternalBSharp.g:317:2: ( ( rule__FileImport__Group__0 ) )
            {
            // InternalBSharp.g:317:2: ( ( rule__FileImport__Group__0 ) )
            // InternalBSharp.g:318:3: ( rule__FileImport__Group__0 )
            {
             before(grammarAccess.getFileImportAccess().getGroup()); 
            // InternalBSharp.g:319:3: ( rule__FileImport__Group__0 )
            // InternalBSharp.g:319:4: rule__FileImport__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FileImport__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFileImportAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFileImport"


    // $ANTLR start "entryRuleLocalImport"
    // InternalBSharp.g:328:1: entryRuleLocalImport : ruleLocalImport EOF ;
    public final void entryRuleLocalImport() throws RecognitionException {
        try {
            // InternalBSharp.g:329:1: ( ruleLocalImport EOF )
            // InternalBSharp.g:330:1: ruleLocalImport EOF
            {
             before(grammarAccess.getLocalImportRule()); 
            pushFollow(FOLLOW_1);
            ruleLocalImport();

            state._fsp--;

             after(grammarAccess.getLocalImportRule()); 
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
    // $ANTLR end "entryRuleLocalImport"


    // $ANTLR start "ruleLocalImport"
    // InternalBSharp.g:337:1: ruleLocalImport : ( ( rule__LocalImport__Group__0 ) ) ;
    public final void ruleLocalImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:341:2: ( ( ( rule__LocalImport__Group__0 ) ) )
            // InternalBSharp.g:342:2: ( ( rule__LocalImport__Group__0 ) )
            {
            // InternalBSharp.g:342:2: ( ( rule__LocalImport__Group__0 ) )
            // InternalBSharp.g:343:3: ( rule__LocalImport__Group__0 )
            {
             before(grammarAccess.getLocalImportAccess().getGroup()); 
            // InternalBSharp.g:344:3: ( rule__LocalImport__Group__0 )
            // InternalBSharp.g:344:4: rule__LocalImport__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LocalImport__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLocalImportAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLocalImport"


    // $ANTLR start "entryRuleClass"
    // InternalBSharp.g:353:1: entryRuleClass : ruleClass EOF ;
    public final void entryRuleClass() throws RecognitionException {
        try {
            // InternalBSharp.g:354:1: ( ruleClass EOF )
            // InternalBSharp.g:355:1: ruleClass EOF
            {
             before(grammarAccess.getClassRule()); 
            pushFollow(FOLLOW_1);
            ruleClass();

            state._fsp--;

             after(grammarAccess.getClassRule()); 
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
    // $ANTLR end "entryRuleClass"


    // $ANTLR start "ruleClass"
    // InternalBSharp.g:362:1: ruleClass : ( ( rule__Class__Group__0 ) ) ;
    public final void ruleClass() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:366:2: ( ( ( rule__Class__Group__0 ) ) )
            // InternalBSharp.g:367:2: ( ( rule__Class__Group__0 ) )
            {
            // InternalBSharp.g:367:2: ( ( rule__Class__Group__0 ) )
            // InternalBSharp.g:368:3: ( rule__Class__Group__0 )
            {
             before(grammarAccess.getClassAccess().getGroup()); 
            // InternalBSharp.g:369:3: ( rule__Class__Group__0 )
            // InternalBSharp.g:369:4: rule__Class__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClass"


    // $ANTLR start "entryRuleInstName"
    // InternalBSharp.g:378:1: entryRuleInstName : ruleInstName EOF ;
    public final void entryRuleInstName() throws RecognitionException {
        try {
            // InternalBSharp.g:379:1: ( ruleInstName EOF )
            // InternalBSharp.g:380:1: ruleInstName EOF
            {
             before(grammarAccess.getInstNameRule()); 
            pushFollow(FOLLOW_1);
            ruleInstName();

            state._fsp--;

             after(grammarAccess.getInstNameRule()); 
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
    // $ANTLR end "entryRuleInstName"


    // $ANTLR start "ruleInstName"
    // InternalBSharp.g:387:1: ruleInstName : ( ( rule__InstName__NameAssignment ) ) ;
    public final void ruleInstName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:391:2: ( ( ( rule__InstName__NameAssignment ) ) )
            // InternalBSharp.g:392:2: ( ( rule__InstName__NameAssignment ) )
            {
            // InternalBSharp.g:392:2: ( ( rule__InstName__NameAssignment ) )
            // InternalBSharp.g:393:3: ( rule__InstName__NameAssignment )
            {
             before(grammarAccess.getInstNameAccess().getNameAssignment()); 
            // InternalBSharp.g:394:3: ( rule__InstName__NameAssignment )
            // InternalBSharp.g:394:4: rule__InstName__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__InstName__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getInstNameAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInstName"


    // $ANTLR start "entryRulePolyContext"
    // InternalBSharp.g:403:1: entryRulePolyContext : rulePolyContext EOF ;
    public final void entryRulePolyContext() throws RecognitionException {
        try {
            // InternalBSharp.g:404:1: ( rulePolyContext EOF )
            // InternalBSharp.g:405:1: rulePolyContext EOF
            {
             before(grammarAccess.getPolyContextRule()); 
            pushFollow(FOLLOW_1);
            rulePolyContext();

            state._fsp--;

             after(grammarAccess.getPolyContextRule()); 
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
    // $ANTLR end "entryRulePolyContext"


    // $ANTLR start "rulePolyContext"
    // InternalBSharp.g:412:1: rulePolyContext : ( ( rule__PolyContext__Group__0 ) ) ;
    public final void rulePolyContext() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:416:2: ( ( ( rule__PolyContext__Group__0 ) ) )
            // InternalBSharp.g:417:2: ( ( rule__PolyContext__Group__0 ) )
            {
            // InternalBSharp.g:417:2: ( ( rule__PolyContext__Group__0 ) )
            // InternalBSharp.g:418:3: ( rule__PolyContext__Group__0 )
            {
             before(grammarAccess.getPolyContextAccess().getGroup()); 
            // InternalBSharp.g:419:3: ( rule__PolyContext__Group__0 )
            // InternalBSharp.g:419:4: rule__PolyContext__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PolyContext__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPolyContextAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePolyContext"


    // $ANTLR start "entryRulePolyType"
    // InternalBSharp.g:428:1: entryRulePolyType : rulePolyType EOF ;
    public final void entryRulePolyType() throws RecognitionException {
        try {
            // InternalBSharp.g:429:1: ( rulePolyType EOF )
            // InternalBSharp.g:430:1: rulePolyType EOF
            {
             before(grammarAccess.getPolyTypeRule()); 
            pushFollow(FOLLOW_1);
            rulePolyType();

            state._fsp--;

             after(grammarAccess.getPolyTypeRule()); 
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
    // $ANTLR end "entryRulePolyType"


    // $ANTLR start "rulePolyType"
    // InternalBSharp.g:437:1: rulePolyType : ( ( rule__PolyType__Group__0 ) ) ;
    public final void rulePolyType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:441:2: ( ( ( rule__PolyType__Group__0 ) ) )
            // InternalBSharp.g:442:2: ( ( rule__PolyType__Group__0 ) )
            {
            // InternalBSharp.g:442:2: ( ( rule__PolyType__Group__0 ) )
            // InternalBSharp.g:443:3: ( rule__PolyType__Group__0 )
            {
             before(grammarAccess.getPolyTypeAccess().getGroup()); 
            // InternalBSharp.g:444:3: ( rule__PolyType__Group__0 )
            // InternalBSharp.g:444:4: rule__PolyType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PolyType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPolyTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePolyType"


    // $ANTLR start "entryRuleSuperTypeList"
    // InternalBSharp.g:453:1: entryRuleSuperTypeList : ruleSuperTypeList EOF ;
    public final void entryRuleSuperTypeList() throws RecognitionException {
        try {
            // InternalBSharp.g:454:1: ( ruleSuperTypeList EOF )
            // InternalBSharp.g:455:1: ruleSuperTypeList EOF
            {
             before(grammarAccess.getSuperTypeListRule()); 
            pushFollow(FOLLOW_1);
            ruleSuperTypeList();

            state._fsp--;

             after(grammarAccess.getSuperTypeListRule()); 
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
    // $ANTLR end "entryRuleSuperTypeList"


    // $ANTLR start "ruleSuperTypeList"
    // InternalBSharp.g:462:1: ruleSuperTypeList : ( ( rule__SuperTypeList__Group__0 ) ) ;
    public final void ruleSuperTypeList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:466:2: ( ( ( rule__SuperTypeList__Group__0 ) ) )
            // InternalBSharp.g:467:2: ( ( rule__SuperTypeList__Group__0 ) )
            {
            // InternalBSharp.g:467:2: ( ( rule__SuperTypeList__Group__0 ) )
            // InternalBSharp.g:468:3: ( rule__SuperTypeList__Group__0 )
            {
             before(grammarAccess.getSuperTypeListAccess().getGroup()); 
            // InternalBSharp.g:469:3: ( rule__SuperTypeList__Group__0 )
            // InternalBSharp.g:469:4: rule__SuperTypeList__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SuperTypeList__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSuperTypeListAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSuperTypeList"


    // $ANTLR start "entryRuleBuiltinTypeInfixOp"
    // InternalBSharp.g:478:1: entryRuleBuiltinTypeInfixOp : ruleBuiltinTypeInfixOp EOF ;
    public final void entryRuleBuiltinTypeInfixOp() throws RecognitionException {
        try {
            // InternalBSharp.g:479:1: ( ruleBuiltinTypeInfixOp EOF )
            // InternalBSharp.g:480:1: ruleBuiltinTypeInfixOp EOF
            {
             before(grammarAccess.getBuiltinTypeInfixOpRule()); 
            pushFollow(FOLLOW_1);
            ruleBuiltinTypeInfixOp();

            state._fsp--;

             after(grammarAccess.getBuiltinTypeInfixOpRule()); 
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
    // $ANTLR end "entryRuleBuiltinTypeInfixOp"


    // $ANTLR start "ruleBuiltinTypeInfixOp"
    // InternalBSharp.g:487:1: ruleBuiltinTypeInfixOp : ( ( rule__BuiltinTypeInfixOp__Alternatives ) ) ;
    public final void ruleBuiltinTypeInfixOp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:491:2: ( ( ( rule__BuiltinTypeInfixOp__Alternatives ) ) )
            // InternalBSharp.g:492:2: ( ( rule__BuiltinTypeInfixOp__Alternatives ) )
            {
            // InternalBSharp.g:492:2: ( ( rule__BuiltinTypeInfixOp__Alternatives ) )
            // InternalBSharp.g:493:3: ( rule__BuiltinTypeInfixOp__Alternatives )
            {
             before(grammarAccess.getBuiltinTypeInfixOpAccess().getAlternatives()); 
            // InternalBSharp.g:494:3: ( rule__BuiltinTypeInfixOp__Alternatives )
            // InternalBSharp.g:494:4: rule__BuiltinTypeInfixOp__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BuiltinTypeInfixOp__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBuiltinTypeInfixOpAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBuiltinTypeInfixOp"


    // $ANTLR start "entryRuleConstructedType"
    // InternalBSharp.g:503:1: entryRuleConstructedType : ruleConstructedType EOF ;
    public final void entryRuleConstructedType() throws RecognitionException {
        try {
            // InternalBSharp.g:504:1: ( ruleConstructedType EOF )
            // InternalBSharp.g:505:1: ruleConstructedType EOF
            {
             before(grammarAccess.getConstructedTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleConstructedType();

            state._fsp--;

             after(grammarAccess.getConstructedTypeRule()); 
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
    // $ANTLR end "entryRuleConstructedType"


    // $ANTLR start "ruleConstructedType"
    // InternalBSharp.g:512:1: ruleConstructedType : ( ( rule__ConstructedType__Group__0 ) ) ;
    public final void ruleConstructedType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:516:2: ( ( ( rule__ConstructedType__Group__0 ) ) )
            // InternalBSharp.g:517:2: ( ( rule__ConstructedType__Group__0 ) )
            {
            // InternalBSharp.g:517:2: ( ( rule__ConstructedType__Group__0 ) )
            // InternalBSharp.g:518:3: ( rule__ConstructedType__Group__0 )
            {
             before(grammarAccess.getConstructedTypeAccess().getGroup()); 
            // InternalBSharp.g:519:3: ( rule__ConstructedType__Group__0 )
            // InternalBSharp.g:519:4: rule__ConstructedType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ConstructedType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConstructedTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConstructedType"


    // $ANTLR start "entryRuleBuilderElem"
    // InternalBSharp.g:528:1: entryRuleBuilderElem : ruleBuilderElem EOF ;
    public final void entryRuleBuilderElem() throws RecognitionException {
        try {
            // InternalBSharp.g:529:1: ( ruleBuilderElem EOF )
            // InternalBSharp.g:530:1: ruleBuilderElem EOF
            {
             before(grammarAccess.getBuilderElemRule()); 
            pushFollow(FOLLOW_1);
            ruleBuilderElem();

            state._fsp--;

             after(grammarAccess.getBuilderElemRule()); 
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
    // $ANTLR end "entryRuleBuilderElem"


    // $ANTLR start "ruleBuilderElem"
    // InternalBSharp.g:537:1: ruleBuilderElem : ( ( rule__BuilderElem__Alternatives ) ) ;
    public final void ruleBuilderElem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:541:2: ( ( ( rule__BuilderElem__Alternatives ) ) )
            // InternalBSharp.g:542:2: ( ( rule__BuilderElem__Alternatives ) )
            {
            // InternalBSharp.g:542:2: ( ( rule__BuilderElem__Alternatives ) )
            // InternalBSharp.g:543:3: ( rule__BuilderElem__Alternatives )
            {
             before(grammarAccess.getBuilderElemAccess().getAlternatives()); 
            // InternalBSharp.g:544:3: ( rule__BuilderElem__Alternatives )
            // InternalBSharp.g:544:4: rule__BuilderElem__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BuilderElem__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBuilderElemAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBuilderElem"


    // $ANTLR start "entryRuleTypeConstructor"
    // InternalBSharp.g:553:1: entryRuleTypeConstructor : ruleTypeConstructor EOF ;
    public final void entryRuleTypeConstructor() throws RecognitionException {
        try {
            // InternalBSharp.g:554:1: ( ruleTypeConstructor EOF )
            // InternalBSharp.g:555:1: ruleTypeConstructor EOF
            {
             before(grammarAccess.getTypeConstructorRule()); 
            pushFollow(FOLLOW_1);
            ruleTypeConstructor();

            state._fsp--;

             after(grammarAccess.getTypeConstructorRule()); 
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
    // $ANTLR end "entryRuleTypeConstructor"


    // $ANTLR start "ruleTypeConstructor"
    // InternalBSharp.g:562:1: ruleTypeConstructor : ( ( rule__TypeConstructor__Group__0 ) ) ;
    public final void ruleTypeConstructor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:566:2: ( ( ( rule__TypeConstructor__Group__0 ) ) )
            // InternalBSharp.g:567:2: ( ( rule__TypeConstructor__Group__0 ) )
            {
            // InternalBSharp.g:567:2: ( ( rule__TypeConstructor__Group__0 ) )
            // InternalBSharp.g:568:3: ( rule__TypeConstructor__Group__0 )
            {
             before(grammarAccess.getTypeConstructorAccess().getGroup()); 
            // InternalBSharp.g:569:3: ( rule__TypeConstructor__Group__0 )
            // InternalBSharp.g:569:4: rule__TypeConstructor__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TypeConstructor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTypeConstructorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypeConstructor"


    // $ANTLR start "entryRuleTypePowerSet"
    // InternalBSharp.g:578:1: entryRuleTypePowerSet : ruleTypePowerSet EOF ;
    public final void entryRuleTypePowerSet() throws RecognitionException {
        try {
            // InternalBSharp.g:579:1: ( ruleTypePowerSet EOF )
            // InternalBSharp.g:580:1: ruleTypePowerSet EOF
            {
             before(grammarAccess.getTypePowerSetRule()); 
            pushFollow(FOLLOW_1);
            ruleTypePowerSet();

            state._fsp--;

             after(grammarAccess.getTypePowerSetRule()); 
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
    // $ANTLR end "entryRuleTypePowerSet"


    // $ANTLR start "ruleTypePowerSet"
    // InternalBSharp.g:587:1: ruleTypePowerSet : ( ( rule__TypePowerSet__Group__0 ) ) ;
    public final void ruleTypePowerSet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:591:2: ( ( ( rule__TypePowerSet__Group__0 ) ) )
            // InternalBSharp.g:592:2: ( ( rule__TypePowerSet__Group__0 ) )
            {
            // InternalBSharp.g:592:2: ( ( rule__TypePowerSet__Group__0 ) )
            // InternalBSharp.g:593:3: ( rule__TypePowerSet__Group__0 )
            {
             before(grammarAccess.getTypePowerSetAccess().getGroup()); 
            // InternalBSharp.g:594:3: ( rule__TypePowerSet__Group__0 )
            // InternalBSharp.g:594:4: rule__TypePowerSet__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TypePowerSet__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTypePowerSetAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypePowerSet"


    // $ANTLR start "entryRuleTypeConstrBracket"
    // InternalBSharp.g:603:1: entryRuleTypeConstrBracket : ruleTypeConstrBracket EOF ;
    public final void entryRuleTypeConstrBracket() throws RecognitionException {
        try {
            // InternalBSharp.g:604:1: ( ruleTypeConstrBracket EOF )
            // InternalBSharp.g:605:1: ruleTypeConstrBracket EOF
            {
             before(grammarAccess.getTypeConstrBracketRule()); 
            pushFollow(FOLLOW_1);
            ruleTypeConstrBracket();

            state._fsp--;

             after(grammarAccess.getTypeConstrBracketRule()); 
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
    // $ANTLR end "entryRuleTypeConstrBracket"


    // $ANTLR start "ruleTypeConstrBracket"
    // InternalBSharp.g:612:1: ruleTypeConstrBracket : ( ( rule__TypeConstrBracket__Group__0 ) ) ;
    public final void ruleTypeConstrBracket() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:616:2: ( ( ( rule__TypeConstrBracket__Group__0 ) ) )
            // InternalBSharp.g:617:2: ( ( rule__TypeConstrBracket__Group__0 ) )
            {
            // InternalBSharp.g:617:2: ( ( rule__TypeConstrBracket__Group__0 ) )
            // InternalBSharp.g:618:3: ( rule__TypeConstrBracket__Group__0 )
            {
             before(grammarAccess.getTypeConstrBracketAccess().getGroup()); 
            // InternalBSharp.g:619:3: ( rule__TypeConstrBracket__Group__0 )
            // InternalBSharp.g:619:4: rule__TypeConstrBracket__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TypeConstrBracket__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTypeConstrBracketAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypeConstrBracket"


    // $ANTLR start "entryRuleTypeDeclContext"
    // InternalBSharp.g:628:1: entryRuleTypeDeclContext : ruleTypeDeclContext EOF ;
    public final void entryRuleTypeDeclContext() throws RecognitionException {
        try {
            // InternalBSharp.g:629:1: ( ruleTypeDeclContext EOF )
            // InternalBSharp.g:630:1: ruleTypeDeclContext EOF
            {
             before(grammarAccess.getTypeDeclContextRule()); 
            pushFollow(FOLLOW_1);
            ruleTypeDeclContext();

            state._fsp--;

             after(grammarAccess.getTypeDeclContextRule()); 
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
    // $ANTLR end "entryRuleTypeDeclContext"


    // $ANTLR start "ruleTypeDeclContext"
    // InternalBSharp.g:637:1: ruleTypeDeclContext : ( ( rule__TypeDeclContext__Group__0 ) ) ;
    public final void ruleTypeDeclContext() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:641:2: ( ( ( rule__TypeDeclContext__Group__0 ) ) )
            // InternalBSharp.g:642:2: ( ( rule__TypeDeclContext__Group__0 ) )
            {
            // InternalBSharp.g:642:2: ( ( rule__TypeDeclContext__Group__0 ) )
            // InternalBSharp.g:643:3: ( rule__TypeDeclContext__Group__0 )
            {
             before(grammarAccess.getTypeDeclContextAccess().getGroup()); 
            // InternalBSharp.g:644:3: ( rule__TypeDeclContext__Group__0 )
            // InternalBSharp.g:644:4: rule__TypeDeclContext__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TypeDeclContext__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTypeDeclContextAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypeDeclContext"


    // $ANTLR start "entryRuleWhere"
    // InternalBSharp.g:653:1: entryRuleWhere : ruleWhere EOF ;
    public final void entryRuleWhere() throws RecognitionException {
        try {
            // InternalBSharp.g:654:1: ( ruleWhere EOF )
            // InternalBSharp.g:655:1: ruleWhere EOF
            {
             before(grammarAccess.getWhereRule()); 
            pushFollow(FOLLOW_1);
            ruleWhere();

            state._fsp--;

             after(grammarAccess.getWhereRule()); 
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
    // $ANTLR end "entryRuleWhere"


    // $ANTLR start "ruleWhere"
    // InternalBSharp.g:662:1: ruleWhere : ( ( rule__Where__Group__0 ) ) ;
    public final void ruleWhere() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:666:2: ( ( ( rule__Where__Group__0 ) ) )
            // InternalBSharp.g:667:2: ( ( rule__Where__Group__0 ) )
            {
            // InternalBSharp.g:667:2: ( ( rule__Where__Group__0 ) )
            // InternalBSharp.g:668:3: ( rule__Where__Group__0 )
            {
             before(grammarAccess.getWhereAccess().getGroup()); 
            // InternalBSharp.g:669:3: ( rule__Where__Group__0 )
            // InternalBSharp.g:669:4: rule__Where__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Where__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWhereAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWhere"


    // $ANTLR start "entryRuleDatatype"
    // InternalBSharp.g:678:1: entryRuleDatatype : ruleDatatype EOF ;
    public final void entryRuleDatatype() throws RecognitionException {
        try {
            // InternalBSharp.g:679:1: ( ruleDatatype EOF )
            // InternalBSharp.g:680:1: ruleDatatype EOF
            {
             before(grammarAccess.getDatatypeRule()); 
            pushFollow(FOLLOW_1);
            ruleDatatype();

            state._fsp--;

             after(grammarAccess.getDatatypeRule()); 
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
    // $ANTLR end "entryRuleDatatype"


    // $ANTLR start "ruleDatatype"
    // InternalBSharp.g:687:1: ruleDatatype : ( ( rule__Datatype__Group__0 ) ) ;
    public final void ruleDatatype() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:691:2: ( ( ( rule__Datatype__Group__0 ) ) )
            // InternalBSharp.g:692:2: ( ( rule__Datatype__Group__0 ) )
            {
            // InternalBSharp.g:692:2: ( ( rule__Datatype__Group__0 ) )
            // InternalBSharp.g:693:3: ( rule__Datatype__Group__0 )
            {
             before(grammarAccess.getDatatypeAccess().getGroup()); 
            // InternalBSharp.g:694:3: ( rule__Datatype__Group__0 )
            // InternalBSharp.g:694:4: rule__Datatype__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Datatype__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDatatypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDatatype"


    // $ANTLR start "entryRuleDatatypeConstructor"
    // InternalBSharp.g:703:1: entryRuleDatatypeConstructor : ruleDatatypeConstructor EOF ;
    public final void entryRuleDatatypeConstructor() throws RecognitionException {
        try {
            // InternalBSharp.g:704:1: ( ruleDatatypeConstructor EOF )
            // InternalBSharp.g:705:1: ruleDatatypeConstructor EOF
            {
             before(grammarAccess.getDatatypeConstructorRule()); 
            pushFollow(FOLLOW_1);
            ruleDatatypeConstructor();

            state._fsp--;

             after(grammarAccess.getDatatypeConstructorRule()); 
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
    // $ANTLR end "entryRuleDatatypeConstructor"


    // $ANTLR start "ruleDatatypeConstructor"
    // InternalBSharp.g:712:1: ruleDatatypeConstructor : ( ( rule__DatatypeConstructor__Group__0 ) ) ;
    public final void ruleDatatypeConstructor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:716:2: ( ( ( rule__DatatypeConstructor__Group__0 ) ) )
            // InternalBSharp.g:717:2: ( ( rule__DatatypeConstructor__Group__0 ) )
            {
            // InternalBSharp.g:717:2: ( ( rule__DatatypeConstructor__Group__0 ) )
            // InternalBSharp.g:718:3: ( rule__DatatypeConstructor__Group__0 )
            {
             before(grammarAccess.getDatatypeConstructorAccess().getGroup()); 
            // InternalBSharp.g:719:3: ( rule__DatatypeConstructor__Group__0 )
            // InternalBSharp.g:719:4: rule__DatatypeConstructor__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DatatypeConstructor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDatatypeConstructorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDatatypeConstructor"


    // $ANTLR start "entryRuleExtend"
    // InternalBSharp.g:728:1: entryRuleExtend : ruleExtend EOF ;
    public final void entryRuleExtend() throws RecognitionException {
        try {
            // InternalBSharp.g:729:1: ( ruleExtend EOF )
            // InternalBSharp.g:730:1: ruleExtend EOF
            {
             before(grammarAccess.getExtendRule()); 
            pushFollow(FOLLOW_1);
            ruleExtend();

            state._fsp--;

             after(grammarAccess.getExtendRule()); 
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
    // $ANTLR end "entryRuleExtend"


    // $ANTLR start "ruleExtend"
    // InternalBSharp.g:737:1: ruleExtend : ( ( rule__Extend__Group__0 ) ) ;
    public final void ruleExtend() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:741:2: ( ( ( rule__Extend__Group__0 ) ) )
            // InternalBSharp.g:742:2: ( ( rule__Extend__Group__0 ) )
            {
            // InternalBSharp.g:742:2: ( ( rule__Extend__Group__0 ) )
            // InternalBSharp.g:743:3: ( rule__Extend__Group__0 )
            {
             before(grammarAccess.getExtendAccess().getGroup()); 
            // InternalBSharp.g:744:3: ( rule__Extend__Group__0 )
            // InternalBSharp.g:744:4: rule__Extend__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Extend__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExtendAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExtend"


    // $ANTLR start "entryRuleBSharpBlock"
    // InternalBSharp.g:753:1: entryRuleBSharpBlock : ruleBSharpBlock EOF ;
    public final void entryRuleBSharpBlock() throws RecognitionException {
        try {
            // InternalBSharp.g:754:1: ( ruleBSharpBlock EOF )
            // InternalBSharp.g:755:1: ruleBSharpBlock EOF
            {
             before(grammarAccess.getBSharpBlockRule()); 
            pushFollow(FOLLOW_1);
            ruleBSharpBlock();

            state._fsp--;

             after(grammarAccess.getBSharpBlockRule()); 
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
    // $ANTLR end "entryRuleBSharpBlock"


    // $ANTLR start "ruleBSharpBlock"
    // InternalBSharp.g:762:1: ruleBSharpBlock : ( ( rule__BSharpBlock__Group__0 ) ) ;
    public final void ruleBSharpBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:766:2: ( ( ( rule__BSharpBlock__Group__0 ) ) )
            // InternalBSharp.g:767:2: ( ( rule__BSharpBlock__Group__0 ) )
            {
            // InternalBSharp.g:767:2: ( ( rule__BSharpBlock__Group__0 ) )
            // InternalBSharp.g:768:3: ( rule__BSharpBlock__Group__0 )
            {
             before(grammarAccess.getBSharpBlockAccess().getGroup()); 
            // InternalBSharp.g:769:3: ( rule__BSharpBlock__Group__0 )
            // InternalBSharp.g:769:4: rule__BSharpBlock__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BSharpBlock__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBSharpBlockAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBSharpBlock"


    // $ANTLR start "entryRuleFunctionDecl"
    // InternalBSharp.g:778:1: entryRuleFunctionDecl : ruleFunctionDecl EOF ;
    public final void entryRuleFunctionDecl() throws RecognitionException {
        try {
            // InternalBSharp.g:779:1: ( ruleFunctionDecl EOF )
            // InternalBSharp.g:780:1: ruleFunctionDecl EOF
            {
             before(grammarAccess.getFunctionDeclRule()); 
            pushFollow(FOLLOW_1);
            ruleFunctionDecl();

            state._fsp--;

             after(grammarAccess.getFunctionDeclRule()); 
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
    // $ANTLR end "entryRuleFunctionDecl"


    // $ANTLR start "ruleFunctionDecl"
    // InternalBSharp.g:787:1: ruleFunctionDecl : ( ( rule__FunctionDecl__Group__0 ) ) ;
    public final void ruleFunctionDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:791:2: ( ( ( rule__FunctionDecl__Group__0 ) ) )
            // InternalBSharp.g:792:2: ( ( rule__FunctionDecl__Group__0 ) )
            {
            // InternalBSharp.g:792:2: ( ( rule__FunctionDecl__Group__0 ) )
            // InternalBSharp.g:793:3: ( rule__FunctionDecl__Group__0 )
            {
             before(grammarAccess.getFunctionDeclAccess().getGroup()); 
            // InternalBSharp.g:794:3: ( rule__FunctionDecl__Group__0 )
            // InternalBSharp.g:794:4: rule__FunctionDecl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FunctionDecl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionDeclAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFunctionDecl"


    // $ANTLR start "entryRuleMatchStatement"
    // InternalBSharp.g:803:1: entryRuleMatchStatement : ruleMatchStatement EOF ;
    public final void entryRuleMatchStatement() throws RecognitionException {
        try {
            // InternalBSharp.g:804:1: ( ruleMatchStatement EOF )
            // InternalBSharp.g:805:1: ruleMatchStatement EOF
            {
             before(grammarAccess.getMatchStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleMatchStatement();

            state._fsp--;

             after(grammarAccess.getMatchStatementRule()); 
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
    // $ANTLR end "entryRuleMatchStatement"


    // $ANTLR start "ruleMatchStatement"
    // InternalBSharp.g:812:1: ruleMatchStatement : ( ( rule__MatchStatement__Group__0 ) ) ;
    public final void ruleMatchStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:816:2: ( ( ( rule__MatchStatement__Group__0 ) ) )
            // InternalBSharp.g:817:2: ( ( rule__MatchStatement__Group__0 ) )
            {
            // InternalBSharp.g:817:2: ( ( rule__MatchStatement__Group__0 ) )
            // InternalBSharp.g:818:3: ( rule__MatchStatement__Group__0 )
            {
             before(grammarAccess.getMatchStatementAccess().getGroup()); 
            // InternalBSharp.g:819:3: ( rule__MatchStatement__Group__0 )
            // InternalBSharp.g:819:4: rule__MatchStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MatchStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMatchStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMatchStatement"


    // $ANTLR start "entryRuleMatchCase"
    // InternalBSharp.g:828:1: entryRuleMatchCase : ruleMatchCase EOF ;
    public final void entryRuleMatchCase() throws RecognitionException {
        try {
            // InternalBSharp.g:829:1: ( ruleMatchCase EOF )
            // InternalBSharp.g:830:1: ruleMatchCase EOF
            {
             before(grammarAccess.getMatchCaseRule()); 
            pushFollow(FOLLOW_1);
            ruleMatchCase();

            state._fsp--;

             after(grammarAccess.getMatchCaseRule()); 
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
    // $ANTLR end "entryRuleMatchCase"


    // $ANTLR start "ruleMatchCase"
    // InternalBSharp.g:837:1: ruleMatchCase : ( ( rule__MatchCase__Group__0 ) ) ;
    public final void ruleMatchCase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:841:2: ( ( ( rule__MatchCase__Group__0 ) ) )
            // InternalBSharp.g:842:2: ( ( rule__MatchCase__Group__0 ) )
            {
            // InternalBSharp.g:842:2: ( ( rule__MatchCase__Group__0 ) )
            // InternalBSharp.g:843:3: ( rule__MatchCase__Group__0 )
            {
             before(grammarAccess.getMatchCaseAccess().getGroup()); 
            // InternalBSharp.g:844:3: ( rule__MatchCase__Group__0 )
            // InternalBSharp.g:844:4: rule__MatchCase__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MatchCase__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMatchCaseAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMatchCase"


    // $ANTLR start "entryRuleTheoremBody"
    // InternalBSharp.g:853:1: entryRuleTheoremBody : ruleTheoremBody EOF ;
    public final void entryRuleTheoremBody() throws RecognitionException {
        try {
            // InternalBSharp.g:854:1: ( ruleTheoremBody EOF )
            // InternalBSharp.g:855:1: ruleTheoremBody EOF
            {
             before(grammarAccess.getTheoremBodyRule()); 
            pushFollow(FOLLOW_1);
            ruleTheoremBody();

            state._fsp--;

             after(grammarAccess.getTheoremBodyRule()); 
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
    // $ANTLR end "entryRuleTheoremBody"


    // $ANTLR start "ruleTheoremBody"
    // InternalBSharp.g:862:1: ruleTheoremBody : ( ( rule__TheoremBody__Group__0 ) ) ;
    public final void ruleTheoremBody() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:866:2: ( ( ( rule__TheoremBody__Group__0 ) ) )
            // InternalBSharp.g:867:2: ( ( rule__TheoremBody__Group__0 ) )
            {
            // InternalBSharp.g:867:2: ( ( rule__TheoremBody__Group__0 ) )
            // InternalBSharp.g:868:3: ( rule__TheoremBody__Group__0 )
            {
             before(grammarAccess.getTheoremBodyAccess().getGroup()); 
            // InternalBSharp.g:869:3: ( rule__TheoremBody__Group__0 )
            // InternalBSharp.g:869:4: rule__TheoremBody__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TheoremBody__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTheoremBodyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTheoremBody"


    // $ANTLR start "entryRuleTheoremDecl"
    // InternalBSharp.g:878:1: entryRuleTheoremDecl : ruleTheoremDecl EOF ;
    public final void entryRuleTheoremDecl() throws RecognitionException {
        try {
            // InternalBSharp.g:879:1: ( ruleTheoremDecl EOF )
            // InternalBSharp.g:880:1: ruleTheoremDecl EOF
            {
             before(grammarAccess.getTheoremDeclRule()); 
            pushFollow(FOLLOW_1);
            ruleTheoremDecl();

            state._fsp--;

             after(grammarAccess.getTheoremDeclRule()); 
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
    // $ANTLR end "entryRuleTheoremDecl"


    // $ANTLR start "ruleTheoremDecl"
    // InternalBSharp.g:887:1: ruleTheoremDecl : ( ( rule__TheoremDecl__Group__0 ) ) ;
    public final void ruleTheoremDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:891:2: ( ( ( rule__TheoremDecl__Group__0 ) ) )
            // InternalBSharp.g:892:2: ( ( rule__TheoremDecl__Group__0 ) )
            {
            // InternalBSharp.g:892:2: ( ( rule__TheoremDecl__Group__0 ) )
            // InternalBSharp.g:893:3: ( rule__TheoremDecl__Group__0 )
            {
             before(grammarAccess.getTheoremDeclAccess().getGroup()); 
            // InternalBSharp.g:894:3: ( rule__TheoremDecl__Group__0 )
            // InternalBSharp.g:894:4: rule__TheoremDecl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TheoremDecl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTheoremDeclAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTheoremDecl"


    // $ANTLR start "entryRuleTypedVariableList"
    // InternalBSharp.g:903:1: entryRuleTypedVariableList : ruleTypedVariableList EOF ;
    public final void entryRuleTypedVariableList() throws RecognitionException {
        try {
            // InternalBSharp.g:904:1: ( ruleTypedVariableList EOF )
            // InternalBSharp.g:905:1: ruleTypedVariableList EOF
            {
             before(grammarAccess.getTypedVariableListRule()); 
            pushFollow(FOLLOW_1);
            ruleTypedVariableList();

            state._fsp--;

             after(grammarAccess.getTypedVariableListRule()); 
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
    // $ANTLR end "entryRuleTypedVariableList"


    // $ANTLR start "ruleTypedVariableList"
    // InternalBSharp.g:912:1: ruleTypedVariableList : ( ( rule__TypedVariableList__Group__0 ) ) ;
    public final void ruleTypedVariableList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:916:2: ( ( ( rule__TypedVariableList__Group__0 ) ) )
            // InternalBSharp.g:917:2: ( ( rule__TypedVariableList__Group__0 ) )
            {
            // InternalBSharp.g:917:2: ( ( rule__TypedVariableList__Group__0 ) )
            // InternalBSharp.g:918:3: ( rule__TypedVariableList__Group__0 )
            {
             before(grammarAccess.getTypedVariableListAccess().getGroup()); 
            // InternalBSharp.g:919:3: ( rule__TypedVariableList__Group__0 )
            // InternalBSharp.g:919:4: rule__TypedVariableList__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TypedVariableList__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTypedVariableListAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypedVariableList"


    // $ANTLR start "entryRuleVariableTyping"
    // InternalBSharp.g:928:1: entryRuleVariableTyping : ruleVariableTyping EOF ;
    public final void entryRuleVariableTyping() throws RecognitionException {
        try {
            // InternalBSharp.g:929:1: ( ruleVariableTyping EOF )
            // InternalBSharp.g:930:1: ruleVariableTyping EOF
            {
             before(grammarAccess.getVariableTypingRule()); 
            pushFollow(FOLLOW_1);
            ruleVariableTyping();

            state._fsp--;

             after(grammarAccess.getVariableTypingRule()); 
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
    // $ANTLR end "entryRuleVariableTyping"


    // $ANTLR start "ruleVariableTyping"
    // InternalBSharp.g:937:1: ruleVariableTyping : ( ( rule__VariableTyping__Group__0 ) ) ;
    public final void ruleVariableTyping() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:941:2: ( ( ( rule__VariableTyping__Group__0 ) ) )
            // InternalBSharp.g:942:2: ( ( rule__VariableTyping__Group__0 ) )
            {
            // InternalBSharp.g:942:2: ( ( rule__VariableTyping__Group__0 ) )
            // InternalBSharp.g:943:3: ( rule__VariableTyping__Group__0 )
            {
             before(grammarAccess.getVariableTypingAccess().getGroup()); 
            // InternalBSharp.g:944:3: ( rule__VariableTyping__Group__0 )
            // InternalBSharp.g:944:4: rule__VariableTyping__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VariableTyping__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariableTypingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariableTyping"


    // $ANTLR start "entryRuleTypedVariable"
    // InternalBSharp.g:953:1: entryRuleTypedVariable : ruleTypedVariable EOF ;
    public final void entryRuleTypedVariable() throws RecognitionException {
        try {
            // InternalBSharp.g:954:1: ( ruleTypedVariable EOF )
            // InternalBSharp.g:955:1: ruleTypedVariable EOF
            {
             before(grammarAccess.getTypedVariableRule()); 
            pushFollow(FOLLOW_1);
            ruleTypedVariable();

            state._fsp--;

             after(grammarAccess.getTypedVariableRule()); 
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
    // $ANTLR end "entryRuleTypedVariable"


    // $ANTLR start "ruleTypedVariable"
    // InternalBSharp.g:962:1: ruleTypedVariable : ( ( rule__TypedVariable__NameAssignment ) ) ;
    public final void ruleTypedVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:966:2: ( ( ( rule__TypedVariable__NameAssignment ) ) )
            // InternalBSharp.g:967:2: ( ( rule__TypedVariable__NameAssignment ) )
            {
            // InternalBSharp.g:967:2: ( ( rule__TypedVariable__NameAssignment ) )
            // InternalBSharp.g:968:3: ( rule__TypedVariable__NameAssignment )
            {
             before(grammarAccess.getTypedVariableAccess().getNameAssignment()); 
            // InternalBSharp.g:969:3: ( rule__TypedVariable__NameAssignment )
            // InternalBSharp.g:969:4: rule__TypedVariable__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__TypedVariable__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getTypedVariableAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypedVariable"


    // $ANTLR start "entryRuleLambda"
    // InternalBSharp.g:978:1: entryRuleLambda : ruleLambda EOF ;
    public final void entryRuleLambda() throws RecognitionException {
        try {
            // InternalBSharp.g:979:1: ( ruleLambda EOF )
            // InternalBSharp.g:980:1: ruleLambda EOF
            {
             before(grammarAccess.getLambdaRule()); 
            pushFollow(FOLLOW_1);
            ruleLambda();

            state._fsp--;

             after(grammarAccess.getLambdaRule()); 
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
    // $ANTLR end "entryRuleLambda"


    // $ANTLR start "ruleLambda"
    // InternalBSharp.g:987:1: ruleLambda : ( ( rule__Lambda__Group__0 ) ) ;
    public final void ruleLambda() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:991:2: ( ( ( rule__Lambda__Group__0 ) ) )
            // InternalBSharp.g:992:2: ( ( rule__Lambda__Group__0 ) )
            {
            // InternalBSharp.g:992:2: ( ( rule__Lambda__Group__0 ) )
            // InternalBSharp.g:993:3: ( rule__Lambda__Group__0 )
            {
             before(grammarAccess.getLambdaAccess().getGroup()); 
            // InternalBSharp.g:994:3: ( rule__Lambda__Group__0 )
            // InternalBSharp.g:994:4: rule__Lambda__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Lambda__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLambdaAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLambda"


    // $ANTLR start "entryRuleQuantifier"
    // InternalBSharp.g:1003:1: entryRuleQuantifier : ruleQuantifier EOF ;
    public final void entryRuleQuantifier() throws RecognitionException {
        try {
            // InternalBSharp.g:1004:1: ( ruleQuantifier EOF )
            // InternalBSharp.g:1005:1: ruleQuantifier EOF
            {
             before(grammarAccess.getQuantifierRule()); 
            pushFollow(FOLLOW_1);
            ruleQuantifier();

            state._fsp--;

             after(grammarAccess.getQuantifierRule()); 
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
    // $ANTLR end "entryRuleQuantifier"


    // $ANTLR start "ruleQuantifier"
    // InternalBSharp.g:1012:1: ruleQuantifier : ( ( rule__Quantifier__Group__0 ) ) ;
    public final void ruleQuantifier() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1016:2: ( ( ( rule__Quantifier__Group__0 ) ) )
            // InternalBSharp.g:1017:2: ( ( rule__Quantifier__Group__0 ) )
            {
            // InternalBSharp.g:1017:2: ( ( rule__Quantifier__Group__0 ) )
            // InternalBSharp.g:1018:3: ( rule__Quantifier__Group__0 )
            {
             before(grammarAccess.getQuantifierAccess().getGroup()); 
            // InternalBSharp.g:1019:3: ( rule__Quantifier__Group__0 )
            // InternalBSharp.g:1019:4: rule__Quantifier__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Quantifier__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQuantifierAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQuantifier"


    // $ANTLR start "entryRuleRootExpression"
    // InternalBSharp.g:1028:1: entryRuleRootExpression : ruleRootExpression EOF ;
    public final void entryRuleRootExpression() throws RecognitionException {
        try {
            // InternalBSharp.g:1029:1: ( ruleRootExpression EOF )
            // InternalBSharp.g:1030:1: ruleRootExpression EOF
            {
             before(grammarAccess.getRootExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleRootExpression();

            state._fsp--;

             after(grammarAccess.getRootExpressionRule()); 
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
    // $ANTLR end "entryRuleRootExpression"


    // $ANTLR start "ruleRootExpression"
    // InternalBSharp.g:1037:1: ruleRootExpression : ( ( rule__RootExpression__Alternatives ) ) ;
    public final void ruleRootExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1041:2: ( ( ( rule__RootExpression__Alternatives ) ) )
            // InternalBSharp.g:1042:2: ( ( rule__RootExpression__Alternatives ) )
            {
            // InternalBSharp.g:1042:2: ( ( rule__RootExpression__Alternatives ) )
            // InternalBSharp.g:1043:3: ( rule__RootExpression__Alternatives )
            {
             before(grammarAccess.getRootExpressionAccess().getAlternatives()); 
            // InternalBSharp.g:1044:3: ( rule__RootExpression__Alternatives )
            // InternalBSharp.g:1044:4: rule__RootExpression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__RootExpression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRootExpressionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRootExpression"


    // $ANTLR start "entryRulePrefix"
    // InternalBSharp.g:1053:1: entryRulePrefix : rulePrefix EOF ;
    public final void entryRulePrefix() throws RecognitionException {
        try {
            // InternalBSharp.g:1054:1: ( rulePrefix EOF )
            // InternalBSharp.g:1055:1: rulePrefix EOF
            {
             before(grammarAccess.getPrefixRule()); 
            pushFollow(FOLLOW_1);
            rulePrefix();

            state._fsp--;

             after(grammarAccess.getPrefixRule()); 
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
    // $ANTLR end "entryRulePrefix"


    // $ANTLR start "rulePrefix"
    // InternalBSharp.g:1062:1: rulePrefix : ( ( rule__Prefix__Group__0 ) ) ;
    public final void rulePrefix() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1066:2: ( ( ( rule__Prefix__Group__0 ) ) )
            // InternalBSharp.g:1067:2: ( ( rule__Prefix__Group__0 ) )
            {
            // InternalBSharp.g:1067:2: ( ( rule__Prefix__Group__0 ) )
            // InternalBSharp.g:1068:3: ( rule__Prefix__Group__0 )
            {
             before(grammarAccess.getPrefixAccess().getGroup()); 
            // InternalBSharp.g:1069:3: ( rule__Prefix__Group__0 )
            // InternalBSharp.g:1069:4: rule__Prefix__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Prefix__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPrefixAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrefix"


    // $ANTLR start "entryRulePrefixBuiltIn"
    // InternalBSharp.g:1078:1: entryRulePrefixBuiltIn : rulePrefixBuiltIn EOF ;
    public final void entryRulePrefixBuiltIn() throws RecognitionException {
        try {
            // InternalBSharp.g:1079:1: ( rulePrefixBuiltIn EOF )
            // InternalBSharp.g:1080:1: rulePrefixBuiltIn EOF
            {
             before(grammarAccess.getPrefixBuiltInRule()); 
            pushFollow(FOLLOW_1);
            rulePrefixBuiltIn();

            state._fsp--;

             after(grammarAccess.getPrefixBuiltInRule()); 
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
    // $ANTLR end "entryRulePrefixBuiltIn"


    // $ANTLR start "rulePrefixBuiltIn"
    // InternalBSharp.g:1087:1: rulePrefixBuiltIn : ( '\\u00AC' ) ;
    public final void rulePrefixBuiltIn() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1091:2: ( ( '\\u00AC' ) )
            // InternalBSharp.g:1092:2: ( '\\u00AC' )
            {
            // InternalBSharp.g:1092:2: ( '\\u00AC' )
            // InternalBSharp.g:1093:3: '\\u00AC'
            {
             before(grammarAccess.getPrefixBuiltInAccess().getNotSignKeyword()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getPrefixBuiltInAccess().getNotSignKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrefixBuiltIn"


    // $ANTLR start "entryRuleInfix"
    // InternalBSharp.g:1103:1: entryRuleInfix : ruleInfix EOF ;
    public final void entryRuleInfix() throws RecognitionException {
        try {
            // InternalBSharp.g:1104:1: ( ruleInfix EOF )
            // InternalBSharp.g:1105:1: ruleInfix EOF
            {
             before(grammarAccess.getInfixRule()); 
            pushFollow(FOLLOW_1);
            ruleInfix();

            state._fsp--;

             after(grammarAccess.getInfixRule()); 
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
    // $ANTLR end "entryRuleInfix"


    // $ANTLR start "ruleInfix"
    // InternalBSharp.g:1112:1: ruleInfix : ( ( rule__Infix__Group__0 ) ) ;
    public final void ruleInfix() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1116:2: ( ( ( rule__Infix__Group__0 ) ) )
            // InternalBSharp.g:1117:2: ( ( rule__Infix__Group__0 ) )
            {
            // InternalBSharp.g:1117:2: ( ( rule__Infix__Group__0 ) )
            // InternalBSharp.g:1118:3: ( rule__Infix__Group__0 )
            {
             before(grammarAccess.getInfixAccess().getGroup()); 
            // InternalBSharp.g:1119:3: ( rule__Infix__Group__0 )
            // InternalBSharp.g:1119:4: rule__Infix__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Infix__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInfixAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInfix"


    // $ANTLR start "entryRuleElement"
    // InternalBSharp.g:1128:1: entryRuleElement : ruleElement EOF ;
    public final void entryRuleElement() throws RecognitionException {
        try {
            // InternalBSharp.g:1129:1: ( ruleElement EOF )
            // InternalBSharp.g:1130:1: ruleElement EOF
            {
             before(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_1);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getElementRule()); 
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
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalBSharp.g:1137:1: ruleElement : ( ( rule__Element__Alternatives ) ) ;
    public final void ruleElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1141:2: ( ( ( rule__Element__Alternatives ) ) )
            // InternalBSharp.g:1142:2: ( ( rule__Element__Alternatives ) )
            {
            // InternalBSharp.g:1142:2: ( ( rule__Element__Alternatives ) )
            // InternalBSharp.g:1143:3: ( rule__Element__Alternatives )
            {
             before(grammarAccess.getElementAccess().getAlternatives()); 
            // InternalBSharp.g:1144:3: ( rule__Element__Alternatives )
            // InternalBSharp.g:1144:4: rule__Element__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Element__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleBracket"
    // InternalBSharp.g:1153:1: entryRuleBracket : ruleBracket EOF ;
    public final void entryRuleBracket() throws RecognitionException {
        try {
            // InternalBSharp.g:1154:1: ( ruleBracket EOF )
            // InternalBSharp.g:1155:1: ruleBracket EOF
            {
             before(grammarAccess.getBracketRule()); 
            pushFollow(FOLLOW_1);
            ruleBracket();

            state._fsp--;

             after(grammarAccess.getBracketRule()); 
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
    // $ANTLR end "entryRuleBracket"


    // $ANTLR start "ruleBracket"
    // InternalBSharp.g:1162:1: ruleBracket : ( ( rule__Bracket__Group__0 ) ) ;
    public final void ruleBracket() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1166:2: ( ( ( rule__Bracket__Group__0 ) ) )
            // InternalBSharp.g:1167:2: ( ( rule__Bracket__Group__0 ) )
            {
            // InternalBSharp.g:1167:2: ( ( rule__Bracket__Group__0 ) )
            // InternalBSharp.g:1168:3: ( rule__Bracket__Group__0 )
            {
             before(grammarAccess.getBracketAccess().getGroup()); 
            // InternalBSharp.g:1169:3: ( rule__Bracket__Group__0 )
            // InternalBSharp.g:1169:4: rule__Bracket__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Bracket__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBracketAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBracket"


    // $ANTLR start "entryRuleFunctionCall"
    // InternalBSharp.g:1178:1: entryRuleFunctionCall : ruleFunctionCall EOF ;
    public final void entryRuleFunctionCall() throws RecognitionException {
        try {
            // InternalBSharp.g:1179:1: ( ruleFunctionCall EOF )
            // InternalBSharp.g:1180:1: ruleFunctionCall EOF
            {
             before(grammarAccess.getFunctionCallRule()); 
            pushFollow(FOLLOW_1);
            ruleFunctionCall();

            state._fsp--;

             after(grammarAccess.getFunctionCallRule()); 
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
    // $ANTLR end "entryRuleFunctionCall"


    // $ANTLR start "ruleFunctionCall"
    // InternalBSharp.g:1187:1: ruleFunctionCall : ( ( rule__FunctionCall__Alternatives ) ) ;
    public final void ruleFunctionCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1191:2: ( ( ( rule__FunctionCall__Alternatives ) ) )
            // InternalBSharp.g:1192:2: ( ( rule__FunctionCall__Alternatives ) )
            {
            // InternalBSharp.g:1192:2: ( ( rule__FunctionCall__Alternatives ) )
            // InternalBSharp.g:1193:3: ( rule__FunctionCall__Alternatives )
            {
             before(grammarAccess.getFunctionCallAccess().getAlternatives()); 
            // InternalBSharp.g:1194:3: ( rule__FunctionCall__Alternatives )
            // InternalBSharp.g:1194:4: rule__FunctionCall__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__FunctionCall__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFunctionCallAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFunctionCall"


    // $ANTLR start "entryRuleFuncCallArgs"
    // InternalBSharp.g:1203:1: entryRuleFuncCallArgs : ruleFuncCallArgs EOF ;
    public final void entryRuleFuncCallArgs() throws RecognitionException {
        try {
            // InternalBSharp.g:1204:1: ( ruleFuncCallArgs EOF )
            // InternalBSharp.g:1205:1: ruleFuncCallArgs EOF
            {
             before(grammarAccess.getFuncCallArgsRule()); 
            pushFollow(FOLLOW_1);
            ruleFuncCallArgs();

            state._fsp--;

             after(grammarAccess.getFuncCallArgsRule()); 
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
    // $ANTLR end "entryRuleFuncCallArgs"


    // $ANTLR start "ruleFuncCallArgs"
    // InternalBSharp.g:1212:1: ruleFuncCallArgs : ( ( rule__FuncCallArgs__Group__0 ) ) ;
    public final void ruleFuncCallArgs() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1216:2: ( ( ( rule__FuncCallArgs__Group__0 ) ) )
            // InternalBSharp.g:1217:2: ( ( rule__FuncCallArgs__Group__0 ) )
            {
            // InternalBSharp.g:1217:2: ( ( rule__FuncCallArgs__Group__0 ) )
            // InternalBSharp.g:1218:3: ( rule__FuncCallArgs__Group__0 )
            {
             before(grammarAccess.getFuncCallArgsAccess().getGroup()); 
            // InternalBSharp.g:1219:3: ( rule__FuncCallArgs__Group__0 )
            // InternalBSharp.g:1219:4: rule__FuncCallArgs__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FuncCallArgs__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFuncCallArgsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFuncCallArgs"


    // $ANTLR start "entryRuleIfElse"
    // InternalBSharp.g:1228:1: entryRuleIfElse : ruleIfElse EOF ;
    public final void entryRuleIfElse() throws RecognitionException {
        try {
            // InternalBSharp.g:1229:1: ( ruleIfElse EOF )
            // InternalBSharp.g:1230:1: ruleIfElse EOF
            {
             before(grammarAccess.getIfElseRule()); 
            pushFollow(FOLLOW_1);
            ruleIfElse();

            state._fsp--;

             after(grammarAccess.getIfElseRule()); 
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
    // $ANTLR end "entryRuleIfElse"


    // $ANTLR start "ruleIfElse"
    // InternalBSharp.g:1237:1: ruleIfElse : ( ( rule__IfElse__Group__0 ) ) ;
    public final void ruleIfElse() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1241:2: ( ( ( rule__IfElse__Group__0 ) ) )
            // InternalBSharp.g:1242:2: ( ( rule__IfElse__Group__0 ) )
            {
            // InternalBSharp.g:1242:2: ( ( rule__IfElse__Group__0 ) )
            // InternalBSharp.g:1243:3: ( rule__IfElse__Group__0 )
            {
             before(grammarAccess.getIfElseAccess().getGroup()); 
            // InternalBSharp.g:1244:3: ( rule__IfElse__Group__0 )
            // InternalBSharp.g:1244:4: rule__IfElse__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IfElse__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIfElseAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIfElse"


    // $ANTLR start "entryRuleClassVarDecl"
    // InternalBSharp.g:1253:1: entryRuleClassVarDecl : ruleClassVarDecl EOF ;
    public final void entryRuleClassVarDecl() throws RecognitionException {
        try {
            // InternalBSharp.g:1254:1: ( ruleClassVarDecl EOF )
            // InternalBSharp.g:1255:1: ruleClassVarDecl EOF
            {
             before(grammarAccess.getClassVarDeclRule()); 
            pushFollow(FOLLOW_1);
            ruleClassVarDecl();

            state._fsp--;

             after(grammarAccess.getClassVarDeclRule()); 
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
    // $ANTLR end "entryRuleClassVarDecl"


    // $ANTLR start "ruleClassVarDecl"
    // InternalBSharp.g:1262:1: ruleClassVarDecl : ( ( rule__ClassVarDecl__Group__0 ) ) ;
    public final void ruleClassVarDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1266:2: ( ( ( rule__ClassVarDecl__Group__0 ) ) )
            // InternalBSharp.g:1267:2: ( ( rule__ClassVarDecl__Group__0 ) )
            {
            // InternalBSharp.g:1267:2: ( ( rule__ClassVarDecl__Group__0 ) )
            // InternalBSharp.g:1268:3: ( rule__ClassVarDecl__Group__0 )
            {
             before(grammarAccess.getClassVarDeclAccess().getGroup()); 
            // InternalBSharp.g:1269:3: ( rule__ClassVarDecl__Group__0 )
            // InternalBSharp.g:1269:4: rule__ClassVarDecl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ClassVarDecl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClassVarDeclAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClassVarDecl"


    // $ANTLR start "entryRuleInbuiltInfix"
    // InternalBSharp.g:1278:1: entryRuleInbuiltInfix : ruleInbuiltInfix EOF ;
    public final void entryRuleInbuiltInfix() throws RecognitionException {
        try {
            // InternalBSharp.g:1279:1: ( ruleInbuiltInfix EOF )
            // InternalBSharp.g:1280:1: ruleInbuiltInfix EOF
            {
             before(grammarAccess.getInbuiltInfixRule()); 
            pushFollow(FOLLOW_1);
            ruleInbuiltInfix();

            state._fsp--;

             after(grammarAccess.getInbuiltInfixRule()); 
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
    // $ANTLR end "entryRuleInbuiltInfix"


    // $ANTLR start "ruleInbuiltInfix"
    // InternalBSharp.g:1287:1: ruleInbuiltInfix : ( ( rule__InbuiltInfix__Alternatives ) ) ;
    public final void ruleInbuiltInfix() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1291:2: ( ( ( rule__InbuiltInfix__Alternatives ) ) )
            // InternalBSharp.g:1292:2: ( ( rule__InbuiltInfix__Alternatives ) )
            {
            // InternalBSharp.g:1292:2: ( ( rule__InbuiltInfix__Alternatives ) )
            // InternalBSharp.g:1293:3: ( rule__InbuiltInfix__Alternatives )
            {
             before(grammarAccess.getInbuiltInfixAccess().getAlternatives()); 
            // InternalBSharp.g:1294:3: ( rule__InbuiltInfix__Alternatives )
            // InternalBSharp.g:1294:4: rule__InbuiltInfix__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__InbuiltInfix__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getInbuiltInfixAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInbuiltInfix"


    // $ANTLR start "entryRuleWrappedInfix"
    // InternalBSharp.g:1303:1: entryRuleWrappedInfix : ruleWrappedInfix EOF ;
    public final void entryRuleWrappedInfix() throws RecognitionException {
        try {
            // InternalBSharp.g:1304:1: ( ruleWrappedInfix EOF )
            // InternalBSharp.g:1305:1: ruleWrappedInfix EOF
            {
             before(grammarAccess.getWrappedInfixRule()); 
            pushFollow(FOLLOW_1);
            ruleWrappedInfix();

            state._fsp--;

             after(grammarAccess.getWrappedInfixRule()); 
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
    // $ANTLR end "entryRuleWrappedInfix"


    // $ANTLR start "ruleWrappedInfix"
    // InternalBSharp.g:1312:1: ruleWrappedInfix : ( ( rule__WrappedInfix__Group__0 ) ) ;
    public final void ruleWrappedInfix() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1316:2: ( ( ( rule__WrappedInfix__Group__0 ) ) )
            // InternalBSharp.g:1317:2: ( ( rule__WrappedInfix__Group__0 ) )
            {
            // InternalBSharp.g:1317:2: ( ( rule__WrappedInfix__Group__0 ) )
            // InternalBSharp.g:1318:3: ( rule__WrappedInfix__Group__0 )
            {
             before(grammarAccess.getWrappedInfixAccess().getGroup()); 
            // InternalBSharp.g:1319:3: ( rule__WrappedInfix__Group__0 )
            // InternalBSharp.g:1319:4: rule__WrappedInfix__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__WrappedInfix__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWrappedInfixAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWrappedInfix"


    // $ANTLR start "entryRuleInstance"
    // InternalBSharp.g:1328:1: entryRuleInstance : ruleInstance EOF ;
    public final void entryRuleInstance() throws RecognitionException {
        try {
            // InternalBSharp.g:1329:1: ( ruleInstance EOF )
            // InternalBSharp.g:1330:1: ruleInstance EOF
            {
             before(grammarAccess.getInstanceRule()); 
            pushFollow(FOLLOW_1);
            ruleInstance();

            state._fsp--;

             after(grammarAccess.getInstanceRule()); 
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
    // $ANTLR end "entryRuleInstance"


    // $ANTLR start "ruleInstance"
    // InternalBSharp.g:1337:1: ruleInstance : ( ( rule__Instance__Group__0 ) ) ;
    public final void ruleInstance() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1341:2: ( ( ( rule__Instance__Group__0 ) ) )
            // InternalBSharp.g:1342:2: ( ( rule__Instance__Group__0 ) )
            {
            // InternalBSharp.g:1342:2: ( ( rule__Instance__Group__0 ) )
            // InternalBSharp.g:1343:3: ( rule__Instance__Group__0 )
            {
             before(grammarAccess.getInstanceAccess().getGroup()); 
            // InternalBSharp.g:1344:3: ( rule__Instance__Group__0 )
            // InternalBSharp.g:1344:4: rule__Instance__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Instance__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInstanceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInstance"


    // $ANTLR start "entryRuleReferencingFunc"
    // InternalBSharp.g:1353:1: entryRuleReferencingFunc : ruleReferencingFunc EOF ;
    public final void entryRuleReferencingFunc() throws RecognitionException {
        try {
            // InternalBSharp.g:1354:1: ( ruleReferencingFunc EOF )
            // InternalBSharp.g:1355:1: ruleReferencingFunc EOF
            {
             before(grammarAccess.getReferencingFuncRule()); 
            pushFollow(FOLLOW_1);
            ruleReferencingFunc();

            state._fsp--;

             after(grammarAccess.getReferencingFuncRule()); 
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
    // $ANTLR end "entryRuleReferencingFunc"


    // $ANTLR start "ruleReferencingFunc"
    // InternalBSharp.g:1362:1: ruleReferencingFunc : ( ( rule__ReferencingFunc__Group__0 ) ) ;
    public final void ruleReferencingFunc() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1366:2: ( ( ( rule__ReferencingFunc__Group__0 ) ) )
            // InternalBSharp.g:1367:2: ( ( rule__ReferencingFunc__Group__0 ) )
            {
            // InternalBSharp.g:1367:2: ( ( rule__ReferencingFunc__Group__0 ) )
            // InternalBSharp.g:1368:3: ( rule__ReferencingFunc__Group__0 )
            {
             before(grammarAccess.getReferencingFuncAccess().getGroup()); 
            // InternalBSharp.g:1369:3: ( rule__ReferencingFunc__Group__0 )
            // InternalBSharp.g:1369:4: rule__ReferencingFunc__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ReferencingFunc__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReferencingFuncAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReferencingFunc"


    // $ANTLR start "rule__THM_NAME__Alternatives_0"
    // InternalBSharp.g:1377:1: rule__THM_NAME__Alternatives_0 : ( ( RULE_INT ) | ( RULE_ID ) | ( RULE_WS ) );
    public final void rule__THM_NAME__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1381:1: ( ( RULE_INT ) | ( RULE_ID ) | ( RULE_WS ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt1=1;
                }
                break;
            case RULE_ID:
                {
                alt1=2;
                }
                break;
            case RULE_WS:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalBSharp.g:1382:2: ( RULE_INT )
                    {
                    // InternalBSharp.g:1382:2: ( RULE_INT )
                    // InternalBSharp.g:1383:3: RULE_INT
                    {
                     before(grammarAccess.getTHM_NAMEAccess().getINTTerminalRuleCall_0_0()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getTHM_NAMEAccess().getINTTerminalRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBSharp.g:1388:2: ( RULE_ID )
                    {
                    // InternalBSharp.g:1388:2: ( RULE_ID )
                    // InternalBSharp.g:1389:3: RULE_ID
                    {
                     before(grammarAccess.getTHM_NAMEAccess().getIDTerminalRuleCall_0_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getTHM_NAMEAccess().getIDTerminalRuleCall_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBSharp.g:1394:2: ( RULE_WS )
                    {
                    // InternalBSharp.g:1394:2: ( RULE_WS )
                    // InternalBSharp.g:1395:3: RULE_WS
                    {
                     before(grammarAccess.getTHM_NAMEAccess().getWSTerminalRuleCall_0_2()); 
                    match(input,RULE_WS,FOLLOW_2); 
                     after(grammarAccess.getTHM_NAMEAccess().getWSTerminalRuleCall_0_2()); 

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
    // $ANTLR end "rule__THM_NAME__Alternatives_0"


    // $ANTLR start "rule__ClassDecl__Alternatives"
    // InternalBSharp.g:1404:1: rule__ClassDecl__Alternatives : ( ( ruleClass ) | ( ruleDatatype ) );
    public final void rule__ClassDecl__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1408:1: ( ( ruleClass ) | ( ruleDatatype ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==37) ) {
                alt2=1;
            }
            else if ( (LA2_0==48) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalBSharp.g:1409:2: ( ruleClass )
                    {
                    // InternalBSharp.g:1409:2: ( ruleClass )
                    // InternalBSharp.g:1410:3: ruleClass
                    {
                     before(grammarAccess.getClassDeclAccess().getClassParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleClass();

                    state._fsp--;

                     after(grammarAccess.getClassDeclAccess().getClassParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBSharp.g:1415:2: ( ruleDatatype )
                    {
                    // InternalBSharp.g:1415:2: ( ruleDatatype )
                    // InternalBSharp.g:1416:3: ruleDatatype
                    {
                     before(grammarAccess.getClassDeclAccess().getDatatypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleDatatype();

                    state._fsp--;

                     after(grammarAccess.getClassDeclAccess().getDatatypeParserRuleCall_1()); 

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
    // $ANTLR end "rule__ClassDecl__Alternatives"


    // $ANTLR start "rule__TopLevelInstance__Alternatives"
    // InternalBSharp.g:1425:1: rule__TopLevelInstance__Alternatives : ( ( ruleClassDecl ) | ( ruleExtend ) );
    public final void rule__TopLevelInstance__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1429:1: ( ( ruleClassDecl ) | ( ruleExtend ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==37||LA3_0==48) ) {
                alt3=1;
            }
            else if ( (LA3_0==50) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalBSharp.g:1430:2: ( ruleClassDecl )
                    {
                    // InternalBSharp.g:1430:2: ( ruleClassDecl )
                    // InternalBSharp.g:1431:3: ruleClassDecl
                    {
                     before(grammarAccess.getTopLevelInstanceAccess().getClassDeclParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleClassDecl();

                    state._fsp--;

                     after(grammarAccess.getTopLevelInstanceAccess().getClassDeclParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBSharp.g:1436:2: ( ruleExtend )
                    {
                    // InternalBSharp.g:1436:2: ( ruleExtend )
                    // InternalBSharp.g:1437:3: ruleExtend
                    {
                     before(grammarAccess.getTopLevelInstanceAccess().getExtendParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleExtend();

                    state._fsp--;

                     after(grammarAccess.getTopLevelInstanceAccess().getExtendParserRuleCall_1()); 

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
    // $ANTLR end "rule__TopLevelInstance__Alternatives"


    // $ANTLR start "rule__Import__Alternatives"
    // InternalBSharp.g:1446:1: rule__Import__Alternatives : ( ( ruleGlobalImport ) | ( ruleLocalImport ) );
    public final void rule__Import__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1450:1: ( ( ruleGlobalImport ) | ( ruleLocalImport ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==35) ) {
                alt4=1;
            }
            else if ( (LA4_0==36) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalBSharp.g:1451:2: ( ruleGlobalImport )
                    {
                    // InternalBSharp.g:1451:2: ( ruleGlobalImport )
                    // InternalBSharp.g:1452:3: ruleGlobalImport
                    {
                     before(grammarAccess.getImportAccess().getGlobalImportParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleGlobalImport();

                    state._fsp--;

                     after(grammarAccess.getImportAccess().getGlobalImportParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBSharp.g:1457:2: ( ruleLocalImport )
                    {
                    // InternalBSharp.g:1457:2: ( ruleLocalImport )
                    // InternalBSharp.g:1458:3: ruleLocalImport
                    {
                     before(grammarAccess.getImportAccess().getLocalImportParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleLocalImport();

                    state._fsp--;

                     after(grammarAccess.getImportAccess().getLocalImportParserRuleCall_1()); 

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
    // $ANTLR end "rule__Import__Alternatives"


    // $ANTLR start "rule__FileImport__Alternatives_1_1"
    // InternalBSharp.g:1467:1: rule__FileImport__Alternatives_1_1 : ( ( '*' ) | ( ( rule__FileImport__TypeAssignment_1_1_1 ) ) );
    public final void rule__FileImport__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1471:1: ( ( '*' ) | ( ( rule__FileImport__TypeAssignment_1_1_1 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==12) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalBSharp.g:1472:2: ( '*' )
                    {
                    // InternalBSharp.g:1472:2: ( '*' )
                    // InternalBSharp.g:1473:3: '*'
                    {
                     before(grammarAccess.getFileImportAccess().getAsteriskKeyword_1_1_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getFileImportAccess().getAsteriskKeyword_1_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBSharp.g:1478:2: ( ( rule__FileImport__TypeAssignment_1_1_1 ) )
                    {
                    // InternalBSharp.g:1478:2: ( ( rule__FileImport__TypeAssignment_1_1_1 ) )
                    // InternalBSharp.g:1479:3: ( rule__FileImport__TypeAssignment_1_1_1 )
                    {
                     before(grammarAccess.getFileImportAccess().getTypeAssignment_1_1_1()); 
                    // InternalBSharp.g:1480:3: ( rule__FileImport__TypeAssignment_1_1_1 )
                    // InternalBSharp.g:1480:4: rule__FileImport__TypeAssignment_1_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__FileImport__TypeAssignment_1_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getFileImportAccess().getTypeAssignment_1_1_1()); 

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
    // $ANTLR end "rule__FileImport__Alternatives_1_1"


    // $ANTLR start "rule__BuiltinTypeInfixOp__Alternatives"
    // InternalBSharp.g:1488:1: rule__BuiltinTypeInfixOp__Alternatives : ( ( '\\u00D7' ) | ( '\\u2192' ) | ( '\\uE102' ) | ( '\\uE100' ) | ( '\\u2194' ) | ( '\\u2916' ) | ( '\\u21F8' ) | ( '\\u21A3' ) | ( '\\u2900' ) | ( '\\u21A0' ) );
    public final void rule__BuiltinTypeInfixOp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1492:1: ( ( '\\u00D7' ) | ( '\\u2192' ) | ( '\\uE102' ) | ( '\\uE100' ) | ( '\\u2194' ) | ( '\\u2916' ) | ( '\\u21F8' ) | ( '\\u21A3' ) | ( '\\u2900' ) | ( '\\u21A0' ) )
            int alt6=10;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt6=1;
                }
                break;
            case 14:
                {
                alt6=2;
                }
                break;
            case 15:
                {
                alt6=3;
                }
                break;
            case 16:
                {
                alt6=4;
                }
                break;
            case 17:
                {
                alt6=5;
                }
                break;
            case 18:
                {
                alt6=6;
                }
                break;
            case 19:
                {
                alt6=7;
                }
                break;
            case 20:
                {
                alt6=8;
                }
                break;
            case 21:
                {
                alt6=9;
                }
                break;
            case 22:
                {
                alt6=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalBSharp.g:1493:2: ( '\\u00D7' )
                    {
                    // InternalBSharp.g:1493:2: ( '\\u00D7' )
                    // InternalBSharp.g:1494:3: '\\u00D7'
                    {
                     before(grammarAccess.getBuiltinTypeInfixOpAccess().getMultiplicationSignKeyword_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getBuiltinTypeInfixOpAccess().getMultiplicationSignKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBSharp.g:1499:2: ( '\\u2192' )
                    {
                    // InternalBSharp.g:1499:2: ( '\\u2192' )
                    // InternalBSharp.g:1500:3: '\\u2192'
                    {
                     before(grammarAccess.getBuiltinTypeInfixOpAccess().getRightwardsArrowKeyword_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getBuiltinTypeInfixOpAccess().getRightwardsArrowKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBSharp.g:1505:2: ( '\\uE102' )
                    {
                    // InternalBSharp.g:1505:2: ( '\\uE102' )
                    // InternalBSharp.g:1506:3: '\\uE102'
                    {
                     before(grammarAccess.getBuiltinTypeInfixOpAccess().getPrivateUseAreaE102Keyword_2()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getBuiltinTypeInfixOpAccess().getPrivateUseAreaE102Keyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalBSharp.g:1511:2: ( '\\uE100' )
                    {
                    // InternalBSharp.g:1511:2: ( '\\uE100' )
                    // InternalBSharp.g:1512:3: '\\uE100'
                    {
                     before(grammarAccess.getBuiltinTypeInfixOpAccess().getPrivateUseAreaE100Keyword_3()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getBuiltinTypeInfixOpAccess().getPrivateUseAreaE100Keyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalBSharp.g:1517:2: ( '\\u2194' )
                    {
                    // InternalBSharp.g:1517:2: ( '\\u2194' )
                    // InternalBSharp.g:1518:3: '\\u2194'
                    {
                     before(grammarAccess.getBuiltinTypeInfixOpAccess().getLeftRightArrowKeyword_4()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getBuiltinTypeInfixOpAccess().getLeftRightArrowKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalBSharp.g:1523:2: ( '\\u2916' )
                    {
                    // InternalBSharp.g:1523:2: ( '\\u2916' )
                    // InternalBSharp.g:1524:3: '\\u2916'
                    {
                     before(grammarAccess.getBuiltinTypeInfixOpAccess().getRightwardsTwoHeadedArrowWithTailKeyword_5()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getBuiltinTypeInfixOpAccess().getRightwardsTwoHeadedArrowWithTailKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalBSharp.g:1529:2: ( '\\u21F8' )
                    {
                    // InternalBSharp.g:1529:2: ( '\\u21F8' )
                    // InternalBSharp.g:1530:3: '\\u21F8'
                    {
                     before(grammarAccess.getBuiltinTypeInfixOpAccess().getRightwardsArrowWithVerticalStrokeKeyword_6()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getBuiltinTypeInfixOpAccess().getRightwardsArrowWithVerticalStrokeKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalBSharp.g:1535:2: ( '\\u21A3' )
                    {
                    // InternalBSharp.g:1535:2: ( '\\u21A3' )
                    // InternalBSharp.g:1536:3: '\\u21A3'
                    {
                     before(grammarAccess.getBuiltinTypeInfixOpAccess().getRightwardsArrowWithTailKeyword_7()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getBuiltinTypeInfixOpAccess().getRightwardsArrowWithTailKeyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalBSharp.g:1541:2: ( '\\u2900' )
                    {
                    // InternalBSharp.g:1541:2: ( '\\u2900' )
                    // InternalBSharp.g:1542:3: '\\u2900'
                    {
                     before(grammarAccess.getBuiltinTypeInfixOpAccess().getRightwardsTwoHeadedArrowWithVerticalStrokeKeyword_8()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getBuiltinTypeInfixOpAccess().getRightwardsTwoHeadedArrowWithVerticalStrokeKeyword_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalBSharp.g:1547:2: ( '\\u21A0' )
                    {
                    // InternalBSharp.g:1547:2: ( '\\u21A0' )
                    // InternalBSharp.g:1548:3: '\\u21A0'
                    {
                     before(grammarAccess.getBuiltinTypeInfixOpAccess().getRightwardsTwoHeadedArrowKeyword_9()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getBuiltinTypeInfixOpAccess().getRightwardsTwoHeadedArrowKeyword_9()); 

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
    // $ANTLR end "rule__BuiltinTypeInfixOp__Alternatives"


    // $ANTLR start "rule__BuilderElem__Alternatives"
    // InternalBSharp.g:1557:1: rule__BuilderElem__Alternatives : ( ( ruleTypeConstructor ) | ( ruleTypeConstrBracket ) | ( ruleTypePowerSet ) );
    public final void rule__BuilderElem__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1561:1: ( ( ruleTypeConstructor ) | ( ruleTypeConstrBracket ) | ( ruleTypePowerSet ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt7=1;
                }
                break;
            case 41:
                {
                alt7=2;
                }
                break;
            case 46:
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
                    // InternalBSharp.g:1562:2: ( ruleTypeConstructor )
                    {
                    // InternalBSharp.g:1562:2: ( ruleTypeConstructor )
                    // InternalBSharp.g:1563:3: ruleTypeConstructor
                    {
                     before(grammarAccess.getBuilderElemAccess().getTypeConstructorParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleTypeConstructor();

                    state._fsp--;

                     after(grammarAccess.getBuilderElemAccess().getTypeConstructorParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBSharp.g:1568:2: ( ruleTypeConstrBracket )
                    {
                    // InternalBSharp.g:1568:2: ( ruleTypeConstrBracket )
                    // InternalBSharp.g:1569:3: ruleTypeConstrBracket
                    {
                     before(grammarAccess.getBuilderElemAccess().getTypeConstrBracketParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleTypeConstrBracket();

                    state._fsp--;

                     after(grammarAccess.getBuilderElemAccess().getTypeConstrBracketParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBSharp.g:1574:2: ( ruleTypePowerSet )
                    {
                    // InternalBSharp.g:1574:2: ( ruleTypePowerSet )
                    // InternalBSharp.g:1575:3: ruleTypePowerSet
                    {
                     before(grammarAccess.getBuilderElemAccess().getTypePowerSetParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleTypePowerSet();

                    state._fsp--;

                     after(grammarAccess.getBuilderElemAccess().getTypePowerSetParserRuleCall_2()); 

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
    // $ANTLR end "rule__BuilderElem__Alternatives"


    // $ANTLR start "rule__BSharpBlock__Alternatives_2"
    // InternalBSharp.g:1584:1: rule__BSharpBlock__Alternatives_2 : ( ( ( rule__BSharpBlock__FunctionsAssignment_2_0 ) ) | ( ( rule__BSharpBlock__TheoremsAssignment_2_1 ) ) | ( ( rule__BSharpBlock__TheoremsAssignment_2_2 ) ) );
    public final void rule__BSharpBlock__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1588:1: ( ( ( rule__BSharpBlock__FunctionsAssignment_2_0 ) ) | ( ( rule__BSharpBlock__TheoremsAssignment_2_1 ) ) | ( ( rule__BSharpBlock__TheoremsAssignment_2_2 ) ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt8=1;
                }
                break;
            case 54:
                {
                alt8=2;
                }
                break;
            case 58:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalBSharp.g:1589:2: ( ( rule__BSharpBlock__FunctionsAssignment_2_0 ) )
                    {
                    // InternalBSharp.g:1589:2: ( ( rule__BSharpBlock__FunctionsAssignment_2_0 ) )
                    // InternalBSharp.g:1590:3: ( rule__BSharpBlock__FunctionsAssignment_2_0 )
                    {
                     before(grammarAccess.getBSharpBlockAccess().getFunctionsAssignment_2_0()); 
                    // InternalBSharp.g:1591:3: ( rule__BSharpBlock__FunctionsAssignment_2_0 )
                    // InternalBSharp.g:1591:4: rule__BSharpBlock__FunctionsAssignment_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BSharpBlock__FunctionsAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBSharpBlockAccess().getFunctionsAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBSharp.g:1595:2: ( ( rule__BSharpBlock__TheoremsAssignment_2_1 ) )
                    {
                    // InternalBSharp.g:1595:2: ( ( rule__BSharpBlock__TheoremsAssignment_2_1 ) )
                    // InternalBSharp.g:1596:3: ( rule__BSharpBlock__TheoremsAssignment_2_1 )
                    {
                     before(grammarAccess.getBSharpBlockAccess().getTheoremsAssignment_2_1()); 
                    // InternalBSharp.g:1597:3: ( rule__BSharpBlock__TheoremsAssignment_2_1 )
                    // InternalBSharp.g:1597:4: rule__BSharpBlock__TheoremsAssignment_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__BSharpBlock__TheoremsAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getBSharpBlockAccess().getTheoremsAssignment_2_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBSharp.g:1601:2: ( ( rule__BSharpBlock__TheoremsAssignment_2_2 ) )
                    {
                    // InternalBSharp.g:1601:2: ( ( rule__BSharpBlock__TheoremsAssignment_2_2 ) )
                    // InternalBSharp.g:1602:3: ( rule__BSharpBlock__TheoremsAssignment_2_2 )
                    {
                     before(grammarAccess.getBSharpBlockAccess().getTheoremsAssignment_2_2()); 
                    // InternalBSharp.g:1603:3: ( rule__BSharpBlock__TheoremsAssignment_2_2 )
                    // InternalBSharp.g:1603:4: rule__BSharpBlock__TheoremsAssignment_2_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__BSharpBlock__TheoremsAssignment_2_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getBSharpBlockAccess().getTheoremsAssignment_2_2()); 

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
    // $ANTLR end "rule__BSharpBlock__Alternatives_2"


    // $ANTLR start "rule__Quantifier__QTypeAlternatives_0_0"
    // InternalBSharp.g:1611:1: rule__Quantifier__QTypeAlternatives_0_0 : ( ( '\\u2200' ) | ( '\\u2203' ) );
    public final void rule__Quantifier__QTypeAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1615:1: ( ( '\\u2200' ) | ( '\\u2203' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==23) ) {
                alt9=1;
            }
            else if ( (LA9_0==24) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalBSharp.g:1616:2: ( '\\u2200' )
                    {
                    // InternalBSharp.g:1616:2: ( '\\u2200' )
                    // InternalBSharp.g:1617:3: '\\u2200'
                    {
                     before(grammarAccess.getQuantifierAccess().getQTypeForAllKeyword_0_0_0()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getQuantifierAccess().getQTypeForAllKeyword_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBSharp.g:1622:2: ( '\\u2203' )
                    {
                    // InternalBSharp.g:1622:2: ( '\\u2203' )
                    // InternalBSharp.g:1623:3: '\\u2203'
                    {
                     before(grammarAccess.getQuantifierAccess().getQTypeThereExistsKeyword_0_0_1()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getQuantifierAccess().getQTypeThereExistsKeyword_0_0_1()); 

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
    // $ANTLR end "rule__Quantifier__QTypeAlternatives_0_0"


    // $ANTLR start "rule__RootExpression__Alternatives"
    // InternalBSharp.g:1632:1: rule__RootExpression__Alternatives : ( ( ruleLambda ) | ( ruleQuantifier ) | ( ruleInfix ) | ( ruleMatchStatement ) | ( ruleIfElse ) );
    public final void rule__RootExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1636:1: ( ( ruleLambda ) | ( ruleQuantifier ) | ( ruleInfix ) | ( ruleMatchStatement ) | ( ruleIfElse ) )
            int alt10=5;
            switch ( input.LA(1) ) {
            case 60:
                {
                alt10=1;
                }
                break;
            case 23:
            case 24:
                {
                alt10=2;
                }
                break;
            case RULE_ID:
            case 11:
            case 39:
            case 41:
                {
                alt10=3;
                }
                break;
            case 53:
                {
                alt10=4;
                }
                break;
            case 56:
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
                    // InternalBSharp.g:1637:2: ( ruleLambda )
                    {
                    // InternalBSharp.g:1637:2: ( ruleLambda )
                    // InternalBSharp.g:1638:3: ruleLambda
                    {
                     before(grammarAccess.getRootExpressionAccess().getLambdaParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleLambda();

                    state._fsp--;

                     after(grammarAccess.getRootExpressionAccess().getLambdaParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBSharp.g:1643:2: ( ruleQuantifier )
                    {
                    // InternalBSharp.g:1643:2: ( ruleQuantifier )
                    // InternalBSharp.g:1644:3: ruleQuantifier
                    {
                     before(grammarAccess.getRootExpressionAccess().getQuantifierParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleQuantifier();

                    state._fsp--;

                     after(grammarAccess.getRootExpressionAccess().getQuantifierParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBSharp.g:1649:2: ( ruleInfix )
                    {
                    // InternalBSharp.g:1649:2: ( ruleInfix )
                    // InternalBSharp.g:1650:3: ruleInfix
                    {
                     before(grammarAccess.getRootExpressionAccess().getInfixParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleInfix();

                    state._fsp--;

                     after(grammarAccess.getRootExpressionAccess().getInfixParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalBSharp.g:1655:2: ( ruleMatchStatement )
                    {
                    // InternalBSharp.g:1655:2: ( ruleMatchStatement )
                    // InternalBSharp.g:1656:3: ruleMatchStatement
                    {
                     before(grammarAccess.getRootExpressionAccess().getMatchStatementParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleMatchStatement();

                    state._fsp--;

                     after(grammarAccess.getRootExpressionAccess().getMatchStatementParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalBSharp.g:1661:2: ( ruleIfElse )
                    {
                    // InternalBSharp.g:1661:2: ( ruleIfElse )
                    // InternalBSharp.g:1662:3: ruleIfElse
                    {
                     before(grammarAccess.getRootExpressionAccess().getIfElseParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleIfElse();

                    state._fsp--;

                     after(grammarAccess.getRootExpressionAccess().getIfElseParserRuleCall_4()); 

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
    // $ANTLR end "rule__RootExpression__Alternatives"


    // $ANTLR start "rule__Infix__Alternatives_1_1"
    // InternalBSharp.g:1671:1: rule__Infix__Alternatives_1_1 : ( ( ( rule__Infix__FuncNameAssignment_1_1_0 ) ) | ( ( rule__Infix__OpNameAssignment_1_1_1 ) ) );
    public final void rule__Infix__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1675:1: ( ( ( rule__Infix__FuncNameAssignment_1_1_0 ) ) | ( ( rule__Infix__OpNameAssignment_1_1_1 ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                alt11=1;
            }
            else if ( ((LA11_0>=25 && LA11_0<=31)) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalBSharp.g:1676:2: ( ( rule__Infix__FuncNameAssignment_1_1_0 ) )
                    {
                    // InternalBSharp.g:1676:2: ( ( rule__Infix__FuncNameAssignment_1_1_0 ) )
                    // InternalBSharp.g:1677:3: ( rule__Infix__FuncNameAssignment_1_1_0 )
                    {
                     before(grammarAccess.getInfixAccess().getFuncNameAssignment_1_1_0()); 
                    // InternalBSharp.g:1678:3: ( rule__Infix__FuncNameAssignment_1_1_0 )
                    // InternalBSharp.g:1678:4: rule__Infix__FuncNameAssignment_1_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Infix__FuncNameAssignment_1_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getInfixAccess().getFuncNameAssignment_1_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBSharp.g:1682:2: ( ( rule__Infix__OpNameAssignment_1_1_1 ) )
                    {
                    // InternalBSharp.g:1682:2: ( ( rule__Infix__OpNameAssignment_1_1_1 ) )
                    // InternalBSharp.g:1683:3: ( rule__Infix__OpNameAssignment_1_1_1 )
                    {
                     before(grammarAccess.getInfixAccess().getOpNameAssignment_1_1_1()); 
                    // InternalBSharp.g:1684:3: ( rule__Infix__OpNameAssignment_1_1_1 )
                    // InternalBSharp.g:1684:4: rule__Infix__OpNameAssignment_1_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Infix__OpNameAssignment_1_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getInfixAccess().getOpNameAssignment_1_1_1()); 

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
    // $ANTLR end "rule__Infix__Alternatives_1_1"


    // $ANTLR start "rule__Element__Alternatives"
    // InternalBSharp.g:1692:1: rule__Element__Alternatives : ( ( ruleBracket ) | ( rulePrefix ) | ( ruleFunctionCall ) );
    public final void rule__Element__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1696:1: ( ( ruleBracket ) | ( rulePrefix ) | ( ruleFunctionCall ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt12=1;
                }
                break;
            case 11:
                {
                alt12=2;
                }
                break;
            case RULE_ID:
            case 39:
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
                    // InternalBSharp.g:1697:2: ( ruleBracket )
                    {
                    // InternalBSharp.g:1697:2: ( ruleBracket )
                    // InternalBSharp.g:1698:3: ruleBracket
                    {
                     before(grammarAccess.getElementAccess().getBracketParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleBracket();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getBracketParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBSharp.g:1703:2: ( rulePrefix )
                    {
                    // InternalBSharp.g:1703:2: ( rulePrefix )
                    // InternalBSharp.g:1704:3: rulePrefix
                    {
                     before(grammarAccess.getElementAccess().getPrefixParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    rulePrefix();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getPrefixParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBSharp.g:1709:2: ( ruleFunctionCall )
                    {
                    // InternalBSharp.g:1709:2: ( ruleFunctionCall )
                    // InternalBSharp.g:1710:3: ruleFunctionCall
                    {
                     before(grammarAccess.getElementAccess().getFunctionCallParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleFunctionCall();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getFunctionCallParserRuleCall_2()); 

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
    // $ANTLR end "rule__Element__Alternatives"


    // $ANTLR start "rule__FunctionCall__Alternatives"
    // InternalBSharp.g:1719:1: rule__FunctionCall__Alternatives : ( ( ( rule__FunctionCall__WrappedAssignment_0 ) ) | ( ( rule__FunctionCall__Group_1__0 ) ) );
    public final void rule__FunctionCall__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1723:1: ( ( ( rule__FunctionCall__WrappedAssignment_0 ) ) | ( ( rule__FunctionCall__Group_1__0 ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==39) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_ID) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalBSharp.g:1724:2: ( ( rule__FunctionCall__WrappedAssignment_0 ) )
                    {
                    // InternalBSharp.g:1724:2: ( ( rule__FunctionCall__WrappedAssignment_0 ) )
                    // InternalBSharp.g:1725:3: ( rule__FunctionCall__WrappedAssignment_0 )
                    {
                     before(grammarAccess.getFunctionCallAccess().getWrappedAssignment_0()); 
                    // InternalBSharp.g:1726:3: ( rule__FunctionCall__WrappedAssignment_0 )
                    // InternalBSharp.g:1726:4: rule__FunctionCall__WrappedAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FunctionCall__WrappedAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFunctionCallAccess().getWrappedAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBSharp.g:1730:2: ( ( rule__FunctionCall__Group_1__0 ) )
                    {
                    // InternalBSharp.g:1730:2: ( ( rule__FunctionCall__Group_1__0 ) )
                    // InternalBSharp.g:1731:3: ( rule__FunctionCall__Group_1__0 )
                    {
                     before(grammarAccess.getFunctionCallAccess().getGroup_1()); 
                    // InternalBSharp.g:1732:3: ( rule__FunctionCall__Group_1__0 )
                    // InternalBSharp.g:1732:4: rule__FunctionCall__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FunctionCall__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFunctionCallAccess().getGroup_1()); 

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
    // $ANTLR end "rule__FunctionCall__Alternatives"


    // $ANTLR start "rule__FunctionCall__Alternatives_1_0"
    // InternalBSharp.g:1740:1: rule__FunctionCall__Alternatives_1_0 : ( ( ( rule__FunctionCall__TypeInstAssignment_1_0_0 ) ) | ( ( rule__FunctionCall__ClassVarDeclAssignment_1_0_1 ) ) );
    public final void rule__FunctionCall__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1744:1: ( ( ( rule__FunctionCall__TypeInstAssignment_1_0_0 ) ) | ( ( rule__FunctionCall__ClassVarDeclAssignment_1_0_1 ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==34) ) {
                    alt14=2;
                }
                else if ( (LA14_1==EOF||LA14_1==RULE_ID||(LA14_1>=25 && LA14_1<=31)||LA14_1==38||(LA14_1>=41 && LA14_1<=43)||LA14_1==45||LA14_1==49||(LA14_1>=51 && LA14_1<=52)||LA14_1==54||LA14_1==58) ) {
                    alt14=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalBSharp.g:1745:2: ( ( rule__FunctionCall__TypeInstAssignment_1_0_0 ) )
                    {
                    // InternalBSharp.g:1745:2: ( ( rule__FunctionCall__TypeInstAssignment_1_0_0 ) )
                    // InternalBSharp.g:1746:3: ( rule__FunctionCall__TypeInstAssignment_1_0_0 )
                    {
                     before(grammarAccess.getFunctionCallAccess().getTypeInstAssignment_1_0_0()); 
                    // InternalBSharp.g:1747:3: ( rule__FunctionCall__TypeInstAssignment_1_0_0 )
                    // InternalBSharp.g:1747:4: rule__FunctionCall__TypeInstAssignment_1_0_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FunctionCall__TypeInstAssignment_1_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFunctionCallAccess().getTypeInstAssignment_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBSharp.g:1751:2: ( ( rule__FunctionCall__ClassVarDeclAssignment_1_0_1 ) )
                    {
                    // InternalBSharp.g:1751:2: ( ( rule__FunctionCall__ClassVarDeclAssignment_1_0_1 ) )
                    // InternalBSharp.g:1752:3: ( rule__FunctionCall__ClassVarDeclAssignment_1_0_1 )
                    {
                     before(grammarAccess.getFunctionCallAccess().getClassVarDeclAssignment_1_0_1()); 
                    // InternalBSharp.g:1753:3: ( rule__FunctionCall__ClassVarDeclAssignment_1_0_1 )
                    // InternalBSharp.g:1753:4: rule__FunctionCall__ClassVarDeclAssignment_1_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__FunctionCall__ClassVarDeclAssignment_1_0_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getFunctionCallAccess().getClassVarDeclAssignment_1_0_1()); 

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
    // $ANTLR end "rule__FunctionCall__Alternatives_1_0"


    // $ANTLR start "rule__InbuiltInfix__Alternatives"
    // InternalBSharp.g:1761:1: rule__InbuiltInfix__Alternatives : ( ( '\\u21D4' ) | ( '\\u21D2' ) | ( '=' ) | ( '\\u2260' ) | ( '\\u2227' ) | ( '\\u2228' ) | ( '\\u2208' ) );
    public final void rule__InbuiltInfix__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1765:1: ( ( '\\u21D4' ) | ( '\\u21D2' ) | ( '=' ) | ( '\\u2260' ) | ( '\\u2227' ) | ( '\\u2228' ) | ( '\\u2208' ) )
            int alt15=7;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt15=1;
                }
                break;
            case 26:
                {
                alt15=2;
                }
                break;
            case 27:
                {
                alt15=3;
                }
                break;
            case 28:
                {
                alt15=4;
                }
                break;
            case 29:
                {
                alt15=5;
                }
                break;
            case 30:
                {
                alt15=6;
                }
                break;
            case 31:
                {
                alt15=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalBSharp.g:1766:2: ( '\\u21D4' )
                    {
                    // InternalBSharp.g:1766:2: ( '\\u21D4' )
                    // InternalBSharp.g:1767:3: '\\u21D4'
                    {
                     before(grammarAccess.getInbuiltInfixAccess().getLeftRightDoubleArrowKeyword_0()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getInbuiltInfixAccess().getLeftRightDoubleArrowKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBSharp.g:1772:2: ( '\\u21D2' )
                    {
                    // InternalBSharp.g:1772:2: ( '\\u21D2' )
                    // InternalBSharp.g:1773:3: '\\u21D2'
                    {
                     before(grammarAccess.getInbuiltInfixAccess().getRightwardsDoubleArrowKeyword_1()); 
                    match(input,26,FOLLOW_2); 
                     after(grammarAccess.getInbuiltInfixAccess().getRightwardsDoubleArrowKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBSharp.g:1778:2: ( '=' )
                    {
                    // InternalBSharp.g:1778:2: ( '=' )
                    // InternalBSharp.g:1779:3: '='
                    {
                     before(grammarAccess.getInbuiltInfixAccess().getEqualsSignKeyword_2()); 
                    match(input,27,FOLLOW_2); 
                     after(grammarAccess.getInbuiltInfixAccess().getEqualsSignKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalBSharp.g:1784:2: ( '\\u2260' )
                    {
                    // InternalBSharp.g:1784:2: ( '\\u2260' )
                    // InternalBSharp.g:1785:3: '\\u2260'
                    {
                     before(grammarAccess.getInbuiltInfixAccess().getNotEqualToKeyword_3()); 
                    match(input,28,FOLLOW_2); 
                     after(grammarAccess.getInbuiltInfixAccess().getNotEqualToKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalBSharp.g:1790:2: ( '\\u2227' )
                    {
                    // InternalBSharp.g:1790:2: ( '\\u2227' )
                    // InternalBSharp.g:1791:3: '\\u2227'
                    {
                     before(grammarAccess.getInbuiltInfixAccess().getLogicalAndKeyword_4()); 
                    match(input,29,FOLLOW_2); 
                     after(grammarAccess.getInbuiltInfixAccess().getLogicalAndKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalBSharp.g:1796:2: ( '\\u2228' )
                    {
                    // InternalBSharp.g:1796:2: ( '\\u2228' )
                    // InternalBSharp.g:1797:3: '\\u2228'
                    {
                     before(grammarAccess.getInbuiltInfixAccess().getLogicalOrKeyword_5()); 
                    match(input,30,FOLLOW_2); 
                     after(grammarAccess.getInbuiltInfixAccess().getLogicalOrKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalBSharp.g:1802:2: ( '\\u2208' )
                    {
                    // InternalBSharp.g:1802:2: ( '\\u2208' )
                    // InternalBSharp.g:1803:3: '\\u2208'
                    {
                     before(grammarAccess.getInbuiltInfixAccess().getElementOfKeyword_6()); 
                    match(input,31,FOLLOW_2); 
                     after(grammarAccess.getInbuiltInfixAccess().getElementOfKeyword_6()); 

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
    // $ANTLR end "rule__InbuiltInfix__Alternatives"


    // $ANTLR start "rule__WrappedInfix__Alternatives_1"
    // InternalBSharp.g:1812:1: rule__WrappedInfix__Alternatives_1 : ( ( ( rule__WrappedInfix__InbuiltAssignment_1_0 ) ) | ( ( rule__WrappedInfix__FuncNameAssignment_1_1 ) ) );
    public final void rule__WrappedInfix__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1816:1: ( ( ( rule__WrappedInfix__InbuiltAssignment_1_0 ) ) | ( ( rule__WrappedInfix__FuncNameAssignment_1_1 ) ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=25 && LA16_0<=31)) ) {
                alt16=1;
            }
            else if ( (LA16_0==RULE_ID) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalBSharp.g:1817:2: ( ( rule__WrappedInfix__InbuiltAssignment_1_0 ) )
                    {
                    // InternalBSharp.g:1817:2: ( ( rule__WrappedInfix__InbuiltAssignment_1_0 ) )
                    // InternalBSharp.g:1818:3: ( rule__WrappedInfix__InbuiltAssignment_1_0 )
                    {
                     before(grammarAccess.getWrappedInfixAccess().getInbuiltAssignment_1_0()); 
                    // InternalBSharp.g:1819:3: ( rule__WrappedInfix__InbuiltAssignment_1_0 )
                    // InternalBSharp.g:1819:4: rule__WrappedInfix__InbuiltAssignment_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__WrappedInfix__InbuiltAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getWrappedInfixAccess().getInbuiltAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBSharp.g:1823:2: ( ( rule__WrappedInfix__FuncNameAssignment_1_1 ) )
                    {
                    // InternalBSharp.g:1823:2: ( ( rule__WrappedInfix__FuncNameAssignment_1_1 ) )
                    // InternalBSharp.g:1824:3: ( rule__WrappedInfix__FuncNameAssignment_1_1 )
                    {
                     before(grammarAccess.getWrappedInfixAccess().getFuncNameAssignment_1_1()); 
                    // InternalBSharp.g:1825:3: ( rule__WrappedInfix__FuncNameAssignment_1_1 )
                    // InternalBSharp.g:1825:4: rule__WrappedInfix__FuncNameAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__WrappedInfix__FuncNameAssignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getWrappedInfixAccess().getFuncNameAssignment_1_1()); 

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
    // $ANTLR end "rule__WrappedInfix__Alternatives_1"


    // $ANTLR start "rule__TopLevel__Group__0"
    // InternalBSharp.g:1833:1: rule__TopLevel__Group__0 : rule__TopLevel__Group__0__Impl rule__TopLevel__Group__1 ;
    public final void rule__TopLevel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1837:1: ( rule__TopLevel__Group__0__Impl rule__TopLevel__Group__1 )
            // InternalBSharp.g:1838:2: rule__TopLevel__Group__0__Impl rule__TopLevel__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__TopLevel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TopLevel__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopLevel__Group__0"


    // $ANTLR start "rule__TopLevel__Group__0__Impl"
    // InternalBSharp.g:1845:1: rule__TopLevel__Group__0__Impl : ( 'package' ) ;
    public final void rule__TopLevel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1849:1: ( ( 'package' ) )
            // InternalBSharp.g:1850:1: ( 'package' )
            {
            // InternalBSharp.g:1850:1: ( 'package' )
            // InternalBSharp.g:1851:2: 'package'
            {
             before(grammarAccess.getTopLevelAccess().getPackageKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getTopLevelAccess().getPackageKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopLevel__Group__0__Impl"


    // $ANTLR start "rule__TopLevel__Group__1"
    // InternalBSharp.g:1860:1: rule__TopLevel__Group__1 : rule__TopLevel__Group__1__Impl rule__TopLevel__Group__2 ;
    public final void rule__TopLevel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1864:1: ( rule__TopLevel__Group__1__Impl rule__TopLevel__Group__2 )
            // InternalBSharp.g:1865:2: rule__TopLevel__Group__1__Impl rule__TopLevel__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__TopLevel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TopLevel__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopLevel__Group__1"


    // $ANTLR start "rule__TopLevel__Group__1__Impl"
    // InternalBSharp.g:1872:1: rule__TopLevel__Group__1__Impl : ( ( rule__TopLevel__NameAssignment_1 ) ) ;
    public final void rule__TopLevel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1876:1: ( ( ( rule__TopLevel__NameAssignment_1 ) ) )
            // InternalBSharp.g:1877:1: ( ( rule__TopLevel__NameAssignment_1 ) )
            {
            // InternalBSharp.g:1877:1: ( ( rule__TopLevel__NameAssignment_1 ) )
            // InternalBSharp.g:1878:2: ( rule__TopLevel__NameAssignment_1 )
            {
             before(grammarAccess.getTopLevelAccess().getNameAssignment_1()); 
            // InternalBSharp.g:1879:2: ( rule__TopLevel__NameAssignment_1 )
            // InternalBSharp.g:1879:3: rule__TopLevel__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TopLevel__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTopLevelAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopLevel__Group__1__Impl"


    // $ANTLR start "rule__TopLevel__Group__2"
    // InternalBSharp.g:1887:1: rule__TopLevel__Group__2 : rule__TopLevel__Group__2__Impl ;
    public final void rule__TopLevel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1891:1: ( rule__TopLevel__Group__2__Impl )
            // InternalBSharp.g:1892:2: rule__TopLevel__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TopLevel__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopLevel__Group__2"


    // $ANTLR start "rule__TopLevel__Group__2__Impl"
    // InternalBSharp.g:1898:1: rule__TopLevel__Group__2__Impl : ( ( rule__TopLevel__TopLevelFileAssignment_2 ) ) ;
    public final void rule__TopLevel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1902:1: ( ( ( rule__TopLevel__TopLevelFileAssignment_2 ) ) )
            // InternalBSharp.g:1903:1: ( ( rule__TopLevel__TopLevelFileAssignment_2 ) )
            {
            // InternalBSharp.g:1903:1: ( ( rule__TopLevel__TopLevelFileAssignment_2 ) )
            // InternalBSharp.g:1904:2: ( rule__TopLevel__TopLevelFileAssignment_2 )
            {
             before(grammarAccess.getTopLevelAccess().getTopLevelFileAssignment_2()); 
            // InternalBSharp.g:1905:2: ( rule__TopLevel__TopLevelFileAssignment_2 )
            // InternalBSharp.g:1905:3: rule__TopLevel__TopLevelFileAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__TopLevel__TopLevelFileAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTopLevelAccess().getTopLevelFileAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopLevel__Group__2__Impl"


    // $ANTLR start "rule__THM_NAME__Group__0"
    // InternalBSharp.g:1914:1: rule__THM_NAME__Group__0 : rule__THM_NAME__Group__0__Impl rule__THM_NAME__Group__1 ;
    public final void rule__THM_NAME__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1918:1: ( rule__THM_NAME__Group__0__Impl rule__THM_NAME__Group__1 )
            // InternalBSharp.g:1919:2: rule__THM_NAME__Group__0__Impl rule__THM_NAME__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__THM_NAME__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__THM_NAME__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__THM_NAME__Group__0"


    // $ANTLR start "rule__THM_NAME__Group__0__Impl"
    // InternalBSharp.g:1926:1: rule__THM_NAME__Group__0__Impl : ( ( rule__THM_NAME__Alternatives_0 )* ) ;
    public final void rule__THM_NAME__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1930:1: ( ( ( rule__THM_NAME__Alternatives_0 )* ) )
            // InternalBSharp.g:1931:1: ( ( rule__THM_NAME__Alternatives_0 )* )
            {
            // InternalBSharp.g:1931:1: ( ( rule__THM_NAME__Alternatives_0 )* )
            // InternalBSharp.g:1932:2: ( rule__THM_NAME__Alternatives_0 )*
            {
             before(grammarAccess.getTHM_NAMEAccess().getAlternatives_0()); 
            // InternalBSharp.g:1933:2: ( rule__THM_NAME__Alternatives_0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=RULE_INT && LA17_0<=RULE_WS)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalBSharp.g:1933:3: rule__THM_NAME__Alternatives_0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__THM_NAME__Alternatives_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getTHM_NAMEAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__THM_NAME__Group__0__Impl"


    // $ANTLR start "rule__THM_NAME__Group__1"
    // InternalBSharp.g:1941:1: rule__THM_NAME__Group__1 : rule__THM_NAME__Group__1__Impl ;
    public final void rule__THM_NAME__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1945:1: ( rule__THM_NAME__Group__1__Impl )
            // InternalBSharp.g:1946:2: rule__THM_NAME__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__THM_NAME__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__THM_NAME__Group__1"


    // $ANTLR start "rule__THM_NAME__Group__1__Impl"
    // InternalBSharp.g:1952:1: rule__THM_NAME__Group__1__Impl : ( ':' ) ;
    public final void rule__THM_NAME__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1956:1: ( ( ':' ) )
            // InternalBSharp.g:1957:1: ( ':' )
            {
            // InternalBSharp.g:1957:1: ( ':' )
            // InternalBSharp.g:1958:2: ':'
            {
             before(grammarAccess.getTHM_NAMEAccess().getColonKeyword_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getTHM_NAMEAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__THM_NAME__Group__1__Impl"


    // $ANTLR start "rule__TopLevelFile__Group__0"
    // InternalBSharp.g:1968:1: rule__TopLevelFile__Group__0 : rule__TopLevelFile__Group__0__Impl rule__TopLevelFile__Group__1 ;
    public final void rule__TopLevelFile__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1972:1: ( rule__TopLevelFile__Group__0__Impl rule__TopLevelFile__Group__1 )
            // InternalBSharp.g:1973:2: rule__TopLevelFile__Group__0__Impl rule__TopLevelFile__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__TopLevelFile__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TopLevelFile__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopLevelFile__Group__0"


    // $ANTLR start "rule__TopLevelFile__Group__0__Impl"
    // InternalBSharp.g:1980:1: rule__TopLevelFile__Group__0__Impl : ( () ) ;
    public final void rule__TopLevelFile__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1984:1: ( ( () ) )
            // InternalBSharp.g:1985:1: ( () )
            {
            // InternalBSharp.g:1985:1: ( () )
            // InternalBSharp.g:1986:2: ()
            {
             before(grammarAccess.getTopLevelFileAccess().getTopLevelFileAction_0()); 
            // InternalBSharp.g:1987:2: ()
            // InternalBSharp.g:1987:3: 
            {
            }

             after(grammarAccess.getTopLevelFileAccess().getTopLevelFileAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopLevelFile__Group__0__Impl"


    // $ANTLR start "rule__TopLevelFile__Group__1"
    // InternalBSharp.g:1995:1: rule__TopLevelFile__Group__1 : rule__TopLevelFile__Group__1__Impl rule__TopLevelFile__Group__2 ;
    public final void rule__TopLevelFile__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1999:1: ( rule__TopLevelFile__Group__1__Impl rule__TopLevelFile__Group__2 )
            // InternalBSharp.g:2000:2: rule__TopLevelFile__Group__1__Impl rule__TopLevelFile__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__TopLevelFile__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TopLevelFile__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopLevelFile__Group__1"


    // $ANTLR start "rule__TopLevelFile__Group__1__Impl"
    // InternalBSharp.g:2007:1: rule__TopLevelFile__Group__1__Impl : ( ( rule__TopLevelFile__NoImportElementsAssignment_1 )* ) ;
    public final void rule__TopLevelFile__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2011:1: ( ( ( rule__TopLevelFile__NoImportElementsAssignment_1 )* ) )
            // InternalBSharp.g:2012:1: ( ( rule__TopLevelFile__NoImportElementsAssignment_1 )* )
            {
            // InternalBSharp.g:2012:1: ( ( rule__TopLevelFile__NoImportElementsAssignment_1 )* )
            // InternalBSharp.g:2013:2: ( rule__TopLevelFile__NoImportElementsAssignment_1 )*
            {
             before(grammarAccess.getTopLevelFileAccess().getNoImportElementsAssignment_1()); 
            // InternalBSharp.g:2014:2: ( rule__TopLevelFile__NoImportElementsAssignment_1 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==37||LA18_0==48||LA18_0==50) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalBSharp.g:2014:3: rule__TopLevelFile__NoImportElementsAssignment_1
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__TopLevelFile__NoImportElementsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getTopLevelFileAccess().getNoImportElementsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopLevelFile__Group__1__Impl"


    // $ANTLR start "rule__TopLevelFile__Group__2"
    // InternalBSharp.g:2022:1: rule__TopLevelFile__Group__2 : rule__TopLevelFile__Group__2__Impl ;
    public final void rule__TopLevelFile__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2026:1: ( rule__TopLevelFile__Group__2__Impl )
            // InternalBSharp.g:2027:2: rule__TopLevelFile__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TopLevelFile__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopLevelFile__Group__2"


    // $ANTLR start "rule__TopLevelFile__Group__2__Impl"
    // InternalBSharp.g:2033:1: rule__TopLevelFile__Group__2__Impl : ( ( rule__TopLevelFile__TopLevelImportsAssignment_2 )* ) ;
    public final void rule__TopLevelFile__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2037:1: ( ( ( rule__TopLevelFile__TopLevelImportsAssignment_2 )* ) )
            // InternalBSharp.g:2038:1: ( ( rule__TopLevelFile__TopLevelImportsAssignment_2 )* )
            {
            // InternalBSharp.g:2038:1: ( ( rule__TopLevelFile__TopLevelImportsAssignment_2 )* )
            // InternalBSharp.g:2039:2: ( rule__TopLevelFile__TopLevelImportsAssignment_2 )*
            {
             before(grammarAccess.getTopLevelFileAccess().getTopLevelImportsAssignment_2()); 
            // InternalBSharp.g:2040:2: ( rule__TopLevelFile__TopLevelImportsAssignment_2 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=35 && LA19_0<=36)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalBSharp.g:2040:3: rule__TopLevelFile__TopLevelImportsAssignment_2
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__TopLevelFile__TopLevelImportsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getTopLevelFileAccess().getTopLevelImportsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopLevelFile__Group__2__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalBSharp.g:2049:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2053:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalBSharp.g:2054:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // InternalBSharp.g:2061:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2065:1: ( ( RULE_ID ) )
            // InternalBSharp.g:2066:1: ( RULE_ID )
            {
            // InternalBSharp.g:2066:1: ( RULE_ID )
            // InternalBSharp.g:2067:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // InternalBSharp.g:2076:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2080:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalBSharp.g:2081:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // InternalBSharp.g:2087:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2091:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalBSharp.g:2092:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalBSharp.g:2092:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalBSharp.g:2093:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalBSharp.g:2094:2: ( rule__QualifiedName__Group_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==34) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalBSharp.g:2094:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // InternalBSharp.g:2103:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2107:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalBSharp.g:2108:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // InternalBSharp.g:2115:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2119:1: ( ( '.' ) )
            // InternalBSharp.g:2120:1: ( '.' )
            {
            // InternalBSharp.g:2120:1: ( '.' )
            // InternalBSharp.g:2121:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // InternalBSharp.g:2130:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2134:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalBSharp.g:2135:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // InternalBSharp.g:2141:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2145:1: ( ( RULE_ID ) )
            // InternalBSharp.g:2146:1: ( RULE_ID )
            {
            // InternalBSharp.g:2146:1: ( RULE_ID )
            // InternalBSharp.g:2147:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__TopLevelImport__Group__0"
    // InternalBSharp.g:2157:1: rule__TopLevelImport__Group__0 : rule__TopLevelImport__Group__0__Impl rule__TopLevelImport__Group__1 ;
    public final void rule__TopLevelImport__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2161:1: ( rule__TopLevelImport__Group__0__Impl rule__TopLevelImport__Group__1 )
            // InternalBSharp.g:2162:2: rule__TopLevelImport__Group__0__Impl rule__TopLevelImport__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__TopLevelImport__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TopLevelImport__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopLevelImport__Group__0"


    // $ANTLR start "rule__TopLevelImport__Group__0__Impl"
    // InternalBSharp.g:2169:1: rule__TopLevelImport__Group__0__Impl : ( ( ( rule__TopLevelImport__ImportsAssignment_0 ) ) ( ( rule__TopLevelImport__ImportsAssignment_0 )* ) ) ;
    public final void rule__TopLevelImport__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2173:1: ( ( ( ( rule__TopLevelImport__ImportsAssignment_0 ) ) ( ( rule__TopLevelImport__ImportsAssignment_0 )* ) ) )
            // InternalBSharp.g:2174:1: ( ( ( rule__TopLevelImport__ImportsAssignment_0 ) ) ( ( rule__TopLevelImport__ImportsAssignment_0 )* ) )
            {
            // InternalBSharp.g:2174:1: ( ( ( rule__TopLevelImport__ImportsAssignment_0 ) ) ( ( rule__TopLevelImport__ImportsAssignment_0 )* ) )
            // InternalBSharp.g:2175:2: ( ( rule__TopLevelImport__ImportsAssignment_0 ) ) ( ( rule__TopLevelImport__ImportsAssignment_0 )* )
            {
            // InternalBSharp.g:2175:2: ( ( rule__TopLevelImport__ImportsAssignment_0 ) )
            // InternalBSharp.g:2176:3: ( rule__TopLevelImport__ImportsAssignment_0 )
            {
             before(grammarAccess.getTopLevelImportAccess().getImportsAssignment_0()); 
            // InternalBSharp.g:2177:3: ( rule__TopLevelImport__ImportsAssignment_0 )
            // InternalBSharp.g:2177:4: rule__TopLevelImport__ImportsAssignment_0
            {
            pushFollow(FOLLOW_8);
            rule__TopLevelImport__ImportsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTopLevelImportAccess().getImportsAssignment_0()); 

            }

            // InternalBSharp.g:2180:2: ( ( rule__TopLevelImport__ImportsAssignment_0 )* )
            // InternalBSharp.g:2181:3: ( rule__TopLevelImport__ImportsAssignment_0 )*
            {
             before(grammarAccess.getTopLevelImportAccess().getImportsAssignment_0()); 
            // InternalBSharp.g:2182:3: ( rule__TopLevelImport__ImportsAssignment_0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=35 && LA21_0<=36)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalBSharp.g:2182:4: rule__TopLevelImport__ImportsAssignment_0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__TopLevelImport__ImportsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getTopLevelImportAccess().getImportsAssignment_0()); 

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
    // $ANTLR end "rule__TopLevelImport__Group__0__Impl"


    // $ANTLR start "rule__TopLevelImport__Group__1"
    // InternalBSharp.g:2191:1: rule__TopLevelImport__Group__1 : rule__TopLevelImport__Group__1__Impl ;
    public final void rule__TopLevelImport__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2195:1: ( rule__TopLevelImport__Group__1__Impl )
            // InternalBSharp.g:2196:2: rule__TopLevelImport__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TopLevelImport__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopLevelImport__Group__1"


    // $ANTLR start "rule__TopLevelImport__Group__1__Impl"
    // InternalBSharp.g:2202:1: rule__TopLevelImport__Group__1__Impl : ( ( ( rule__TopLevelImport__BodyElementsAssignment_1 ) ) ( ( rule__TopLevelImport__BodyElementsAssignment_1 )* ) ) ;
    public final void rule__TopLevelImport__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2206:1: ( ( ( ( rule__TopLevelImport__BodyElementsAssignment_1 ) ) ( ( rule__TopLevelImport__BodyElementsAssignment_1 )* ) ) )
            // InternalBSharp.g:2207:1: ( ( ( rule__TopLevelImport__BodyElementsAssignment_1 ) ) ( ( rule__TopLevelImport__BodyElementsAssignment_1 )* ) )
            {
            // InternalBSharp.g:2207:1: ( ( ( rule__TopLevelImport__BodyElementsAssignment_1 ) ) ( ( rule__TopLevelImport__BodyElementsAssignment_1 )* ) )
            // InternalBSharp.g:2208:2: ( ( rule__TopLevelImport__BodyElementsAssignment_1 ) ) ( ( rule__TopLevelImport__BodyElementsAssignment_1 )* )
            {
            // InternalBSharp.g:2208:2: ( ( rule__TopLevelImport__BodyElementsAssignment_1 ) )
            // InternalBSharp.g:2209:3: ( rule__TopLevelImport__BodyElementsAssignment_1 )
            {
             before(grammarAccess.getTopLevelImportAccess().getBodyElementsAssignment_1()); 
            // InternalBSharp.g:2210:3: ( rule__TopLevelImport__BodyElementsAssignment_1 )
            // InternalBSharp.g:2210:4: rule__TopLevelImport__BodyElementsAssignment_1
            {
            pushFollow(FOLLOW_7);
            rule__TopLevelImport__BodyElementsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTopLevelImportAccess().getBodyElementsAssignment_1()); 

            }

            // InternalBSharp.g:2213:2: ( ( rule__TopLevelImport__BodyElementsAssignment_1 )* )
            // InternalBSharp.g:2214:3: ( rule__TopLevelImport__BodyElementsAssignment_1 )*
            {
             before(grammarAccess.getTopLevelImportAccess().getBodyElementsAssignment_1()); 
            // InternalBSharp.g:2215:3: ( rule__TopLevelImport__BodyElementsAssignment_1 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==37||LA22_0==48||LA22_0==50) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalBSharp.g:2215:4: rule__TopLevelImport__BodyElementsAssignment_1
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__TopLevelImport__BodyElementsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getTopLevelImportAccess().getBodyElementsAssignment_1()); 

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
    // $ANTLR end "rule__TopLevelImport__Group__1__Impl"


    // $ANTLR start "rule__GlobalImport__Group__0"
    // InternalBSharp.g:2225:1: rule__GlobalImport__Group__0 : rule__GlobalImport__Group__0__Impl rule__GlobalImport__Group__1 ;
    public final void rule__GlobalImport__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2229:1: ( rule__GlobalImport__Group__0__Impl rule__GlobalImport__Group__1 )
            // InternalBSharp.g:2230:2: rule__GlobalImport__Group__0__Impl rule__GlobalImport__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__GlobalImport__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GlobalImport__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalImport__Group__0"


    // $ANTLR start "rule__GlobalImport__Group__0__Impl"
    // InternalBSharp.g:2237:1: rule__GlobalImport__Group__0__Impl : ( 'From' ) ;
    public final void rule__GlobalImport__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2241:1: ( ( 'From' ) )
            // InternalBSharp.g:2242:1: ( 'From' )
            {
            // InternalBSharp.g:2242:1: ( 'From' )
            // InternalBSharp.g:2243:2: 'From'
            {
             before(grammarAccess.getGlobalImportAccess().getFromKeyword_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getGlobalImportAccess().getFromKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalImport__Group__0__Impl"


    // $ANTLR start "rule__GlobalImport__Group__1"
    // InternalBSharp.g:2252:1: rule__GlobalImport__Group__1 : rule__GlobalImport__Group__1__Impl rule__GlobalImport__Group__2 ;
    public final void rule__GlobalImport__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2256:1: ( rule__GlobalImport__Group__1__Impl rule__GlobalImport__Group__2 )
            // InternalBSharp.g:2257:2: rule__GlobalImport__Group__1__Impl rule__GlobalImport__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__GlobalImport__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GlobalImport__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalImport__Group__1"


    // $ANTLR start "rule__GlobalImport__Group__1__Impl"
    // InternalBSharp.g:2264:1: rule__GlobalImport__Group__1__Impl : ( ( rule__GlobalImport__ProjectAssignment_1 ) ) ;
    public final void rule__GlobalImport__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2268:1: ( ( ( rule__GlobalImport__ProjectAssignment_1 ) ) )
            // InternalBSharp.g:2269:1: ( ( rule__GlobalImport__ProjectAssignment_1 ) )
            {
            // InternalBSharp.g:2269:1: ( ( rule__GlobalImport__ProjectAssignment_1 ) )
            // InternalBSharp.g:2270:2: ( rule__GlobalImport__ProjectAssignment_1 )
            {
             before(grammarAccess.getGlobalImportAccess().getProjectAssignment_1()); 
            // InternalBSharp.g:2271:2: ( rule__GlobalImport__ProjectAssignment_1 )
            // InternalBSharp.g:2271:3: rule__GlobalImport__ProjectAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__GlobalImport__ProjectAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGlobalImportAccess().getProjectAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalImport__Group__1__Impl"


    // $ANTLR start "rule__GlobalImport__Group__2"
    // InternalBSharp.g:2279:1: rule__GlobalImport__Group__2 : rule__GlobalImport__Group__2__Impl rule__GlobalImport__Group__3 ;
    public final void rule__GlobalImport__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2283:1: ( rule__GlobalImport__Group__2__Impl rule__GlobalImport__Group__3 )
            // InternalBSharp.g:2284:2: rule__GlobalImport__Group__2__Impl rule__GlobalImport__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__GlobalImport__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GlobalImport__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalImport__Group__2"


    // $ANTLR start "rule__GlobalImport__Group__2__Impl"
    // InternalBSharp.g:2291:1: rule__GlobalImport__Group__2__Impl : ( 'Import' ) ;
    public final void rule__GlobalImport__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2295:1: ( ( 'Import' ) )
            // InternalBSharp.g:2296:1: ( 'Import' )
            {
            // InternalBSharp.g:2296:1: ( 'Import' )
            // InternalBSharp.g:2297:2: 'Import'
            {
             before(grammarAccess.getGlobalImportAccess().getImportKeyword_2()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getGlobalImportAccess().getImportKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalImport__Group__2__Impl"


    // $ANTLR start "rule__GlobalImport__Group__3"
    // InternalBSharp.g:2306:1: rule__GlobalImport__Group__3 : rule__GlobalImport__Group__3__Impl ;
    public final void rule__GlobalImport__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2310:1: ( rule__GlobalImport__Group__3__Impl )
            // InternalBSharp.g:2311:2: rule__GlobalImport__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GlobalImport__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalImport__Group__3"


    // $ANTLR start "rule__GlobalImport__Group__3__Impl"
    // InternalBSharp.g:2317:1: rule__GlobalImport__Group__3__Impl : ( ( ( rule__GlobalImport__FileImportsAssignment_3 ) ) ( ( rule__GlobalImport__FileImportsAssignment_3 )* ) ) ;
    public final void rule__GlobalImport__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2321:1: ( ( ( ( rule__GlobalImport__FileImportsAssignment_3 ) ) ( ( rule__GlobalImport__FileImportsAssignment_3 )* ) ) )
            // InternalBSharp.g:2322:1: ( ( ( rule__GlobalImport__FileImportsAssignment_3 ) ) ( ( rule__GlobalImport__FileImportsAssignment_3 )* ) )
            {
            // InternalBSharp.g:2322:1: ( ( ( rule__GlobalImport__FileImportsAssignment_3 ) ) ( ( rule__GlobalImport__FileImportsAssignment_3 )* ) )
            // InternalBSharp.g:2323:2: ( ( rule__GlobalImport__FileImportsAssignment_3 ) ) ( ( rule__GlobalImport__FileImportsAssignment_3 )* )
            {
            // InternalBSharp.g:2323:2: ( ( rule__GlobalImport__FileImportsAssignment_3 ) )
            // InternalBSharp.g:2324:3: ( rule__GlobalImport__FileImportsAssignment_3 )
            {
             before(grammarAccess.getGlobalImportAccess().getFileImportsAssignment_3()); 
            // InternalBSharp.g:2325:3: ( rule__GlobalImport__FileImportsAssignment_3 )
            // InternalBSharp.g:2325:4: rule__GlobalImport__FileImportsAssignment_3
            {
            pushFollow(FOLLOW_13);
            rule__GlobalImport__FileImportsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getGlobalImportAccess().getFileImportsAssignment_3()); 

            }

            // InternalBSharp.g:2328:2: ( ( rule__GlobalImport__FileImportsAssignment_3 )* )
            // InternalBSharp.g:2329:3: ( rule__GlobalImport__FileImportsAssignment_3 )*
            {
             before(grammarAccess.getGlobalImportAccess().getFileImportsAssignment_3()); 
            // InternalBSharp.g:2330:3: ( rule__GlobalImport__FileImportsAssignment_3 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_ID) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalBSharp.g:2330:4: rule__GlobalImport__FileImportsAssignment_3
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__GlobalImport__FileImportsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getGlobalImportAccess().getFileImportsAssignment_3()); 

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
    // $ANTLR end "rule__GlobalImport__Group__3__Impl"


    // $ANTLR start "rule__FileImport__Group__0"
    // InternalBSharp.g:2340:1: rule__FileImport__Group__0 : rule__FileImport__Group__0__Impl rule__FileImport__Group__1 ;
    public final void rule__FileImport__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2344:1: ( rule__FileImport__Group__0__Impl rule__FileImport__Group__1 )
            // InternalBSharp.g:2345:2: rule__FileImport__Group__0__Impl rule__FileImport__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__FileImport__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FileImport__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileImport__Group__0"


    // $ANTLR start "rule__FileImport__Group__0__Impl"
    // InternalBSharp.g:2352:1: rule__FileImport__Group__0__Impl : ( ( rule__FileImport__FileReferenceAssignment_0 ) ) ;
    public final void rule__FileImport__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2356:1: ( ( ( rule__FileImport__FileReferenceAssignment_0 ) ) )
            // InternalBSharp.g:2357:1: ( ( rule__FileImport__FileReferenceAssignment_0 ) )
            {
            // InternalBSharp.g:2357:1: ( ( rule__FileImport__FileReferenceAssignment_0 ) )
            // InternalBSharp.g:2358:2: ( rule__FileImport__FileReferenceAssignment_0 )
            {
             before(grammarAccess.getFileImportAccess().getFileReferenceAssignment_0()); 
            // InternalBSharp.g:2359:2: ( rule__FileImport__FileReferenceAssignment_0 )
            // InternalBSharp.g:2359:3: rule__FileImport__FileReferenceAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__FileImport__FileReferenceAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFileImportAccess().getFileReferenceAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileImport__Group__0__Impl"


    // $ANTLR start "rule__FileImport__Group__1"
    // InternalBSharp.g:2367:1: rule__FileImport__Group__1 : rule__FileImport__Group__1__Impl ;
    public final void rule__FileImport__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2371:1: ( rule__FileImport__Group__1__Impl )
            // InternalBSharp.g:2372:2: rule__FileImport__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FileImport__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileImport__Group__1"


    // $ANTLR start "rule__FileImport__Group__1__Impl"
    // InternalBSharp.g:2378:1: rule__FileImport__Group__1__Impl : ( ( rule__FileImport__Group_1__0 )? ) ;
    public final void rule__FileImport__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2382:1: ( ( ( rule__FileImport__Group_1__0 )? ) )
            // InternalBSharp.g:2383:1: ( ( rule__FileImport__Group_1__0 )? )
            {
            // InternalBSharp.g:2383:1: ( ( rule__FileImport__Group_1__0 )? )
            // InternalBSharp.g:2384:2: ( rule__FileImport__Group_1__0 )?
            {
             before(grammarAccess.getFileImportAccess().getGroup_1()); 
            // InternalBSharp.g:2385:2: ( rule__FileImport__Group_1__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==34) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalBSharp.g:2385:3: rule__FileImport__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FileImport__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFileImportAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileImport__Group__1__Impl"


    // $ANTLR start "rule__FileImport__Group_1__0"
    // InternalBSharp.g:2394:1: rule__FileImport__Group_1__0 : rule__FileImport__Group_1__0__Impl rule__FileImport__Group_1__1 ;
    public final void rule__FileImport__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2398:1: ( rule__FileImport__Group_1__0__Impl rule__FileImport__Group_1__1 )
            // InternalBSharp.g:2399:2: rule__FileImport__Group_1__0__Impl rule__FileImport__Group_1__1
            {
            pushFollow(FOLLOW_14);
            rule__FileImport__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FileImport__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileImport__Group_1__0"


    // $ANTLR start "rule__FileImport__Group_1__0__Impl"
    // InternalBSharp.g:2406:1: rule__FileImport__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FileImport__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2410:1: ( ( '.' ) )
            // InternalBSharp.g:2411:1: ( '.' )
            {
            // InternalBSharp.g:2411:1: ( '.' )
            // InternalBSharp.g:2412:2: '.'
            {
             before(grammarAccess.getFileImportAccess().getFullStopKeyword_1_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getFileImportAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileImport__Group_1__0__Impl"


    // $ANTLR start "rule__FileImport__Group_1__1"
    // InternalBSharp.g:2421:1: rule__FileImport__Group_1__1 : rule__FileImport__Group_1__1__Impl ;
    public final void rule__FileImport__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2425:1: ( rule__FileImport__Group_1__1__Impl )
            // InternalBSharp.g:2426:2: rule__FileImport__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FileImport__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileImport__Group_1__1"


    // $ANTLR start "rule__FileImport__Group_1__1__Impl"
    // InternalBSharp.g:2432:1: rule__FileImport__Group_1__1__Impl : ( ( rule__FileImport__Alternatives_1_1 ) ) ;
    public final void rule__FileImport__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2436:1: ( ( ( rule__FileImport__Alternatives_1_1 ) ) )
            // InternalBSharp.g:2437:1: ( ( rule__FileImport__Alternatives_1_1 ) )
            {
            // InternalBSharp.g:2437:1: ( ( rule__FileImport__Alternatives_1_1 ) )
            // InternalBSharp.g:2438:2: ( rule__FileImport__Alternatives_1_1 )
            {
             before(grammarAccess.getFileImportAccess().getAlternatives_1_1()); 
            // InternalBSharp.g:2439:2: ( rule__FileImport__Alternatives_1_1 )
            // InternalBSharp.g:2439:3: rule__FileImport__Alternatives_1_1
            {
            pushFollow(FOLLOW_2);
            rule__FileImport__Alternatives_1_1();

            state._fsp--;


            }

             after(grammarAccess.getFileImportAccess().getAlternatives_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileImport__Group_1__1__Impl"


    // $ANTLR start "rule__LocalImport__Group__0"
    // InternalBSharp.g:2448:1: rule__LocalImport__Group__0 : rule__LocalImport__Group__0__Impl rule__LocalImport__Group__1 ;
    public final void rule__LocalImport__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2452:1: ( rule__LocalImport__Group__0__Impl rule__LocalImport__Group__1 )
            // InternalBSharp.g:2453:2: rule__LocalImport__Group__0__Impl rule__LocalImport__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__LocalImport__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LocalImport__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalImport__Group__0"


    // $ANTLR start "rule__LocalImport__Group__0__Impl"
    // InternalBSharp.g:2460:1: rule__LocalImport__Group__0__Impl : ( 'Import' ) ;
    public final void rule__LocalImport__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2464:1: ( ( 'Import' ) )
            // InternalBSharp.g:2465:1: ( 'Import' )
            {
            // InternalBSharp.g:2465:1: ( 'Import' )
            // InternalBSharp.g:2466:2: 'Import'
            {
             before(grammarAccess.getLocalImportAccess().getImportKeyword_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getLocalImportAccess().getImportKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalImport__Group__0__Impl"


    // $ANTLR start "rule__LocalImport__Group__1"
    // InternalBSharp.g:2475:1: rule__LocalImport__Group__1 : rule__LocalImport__Group__1__Impl ;
    public final void rule__LocalImport__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2479:1: ( rule__LocalImport__Group__1__Impl )
            // InternalBSharp.g:2480:2: rule__LocalImport__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LocalImport__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalImport__Group__1"


    // $ANTLR start "rule__LocalImport__Group__1__Impl"
    // InternalBSharp.g:2486:1: rule__LocalImport__Group__1__Impl : ( ( ( rule__LocalImport__FileImportsAssignment_1 ) ) ( ( rule__LocalImport__FileImportsAssignment_1 )* ) ) ;
    public final void rule__LocalImport__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2490:1: ( ( ( ( rule__LocalImport__FileImportsAssignment_1 ) ) ( ( rule__LocalImport__FileImportsAssignment_1 )* ) ) )
            // InternalBSharp.g:2491:1: ( ( ( rule__LocalImport__FileImportsAssignment_1 ) ) ( ( rule__LocalImport__FileImportsAssignment_1 )* ) )
            {
            // InternalBSharp.g:2491:1: ( ( ( rule__LocalImport__FileImportsAssignment_1 ) ) ( ( rule__LocalImport__FileImportsAssignment_1 )* ) )
            // InternalBSharp.g:2492:2: ( ( rule__LocalImport__FileImportsAssignment_1 ) ) ( ( rule__LocalImport__FileImportsAssignment_1 )* )
            {
            // InternalBSharp.g:2492:2: ( ( rule__LocalImport__FileImportsAssignment_1 ) )
            // InternalBSharp.g:2493:3: ( rule__LocalImport__FileImportsAssignment_1 )
            {
             before(grammarAccess.getLocalImportAccess().getFileImportsAssignment_1()); 
            // InternalBSharp.g:2494:3: ( rule__LocalImport__FileImportsAssignment_1 )
            // InternalBSharp.g:2494:4: rule__LocalImport__FileImportsAssignment_1
            {
            pushFollow(FOLLOW_13);
            rule__LocalImport__FileImportsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLocalImportAccess().getFileImportsAssignment_1()); 

            }

            // InternalBSharp.g:2497:2: ( ( rule__LocalImport__FileImportsAssignment_1 )* )
            // InternalBSharp.g:2498:3: ( rule__LocalImport__FileImportsAssignment_1 )*
            {
             before(grammarAccess.getLocalImportAccess().getFileImportsAssignment_1()); 
            // InternalBSharp.g:2499:3: ( rule__LocalImport__FileImportsAssignment_1 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_ID) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalBSharp.g:2499:4: rule__LocalImport__FileImportsAssignment_1
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__LocalImport__FileImportsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getLocalImportAccess().getFileImportsAssignment_1()); 

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
    // $ANTLR end "rule__LocalImport__Group__1__Impl"


    // $ANTLR start "rule__Class__Group__0"
    // InternalBSharp.g:2509:1: rule__Class__Group__0 : rule__Class__Group__0__Impl rule__Class__Group__1 ;
    public final void rule__Class__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2513:1: ( rule__Class__Group__0__Impl rule__Class__Group__1 )
            // InternalBSharp.g:2514:2: rule__Class__Group__0__Impl rule__Class__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Class__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__0"


    // $ANTLR start "rule__Class__Group__0__Impl"
    // InternalBSharp.g:2521:1: rule__Class__Group__0__Impl : ( 'Class' ) ;
    public final void rule__Class__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2525:1: ( ( 'Class' ) )
            // InternalBSharp.g:2526:1: ( 'Class' )
            {
            // InternalBSharp.g:2526:1: ( 'Class' )
            // InternalBSharp.g:2527:2: 'Class'
            {
             before(grammarAccess.getClassAccess().getClassKeyword_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getClassKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__0__Impl"


    // $ANTLR start "rule__Class__Group__1"
    // InternalBSharp.g:2536:1: rule__Class__Group__1 : rule__Class__Group__1__Impl rule__Class__Group__2 ;
    public final void rule__Class__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2540:1: ( rule__Class__Group__1__Impl rule__Class__Group__2 )
            // InternalBSharp.g:2541:2: rule__Class__Group__1__Impl rule__Class__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__Class__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__1"


    // $ANTLR start "rule__Class__Group__1__Impl"
    // InternalBSharp.g:2548:1: rule__Class__Group__1__Impl : ( ( rule__Class__NameAssignment_1 ) ) ;
    public final void rule__Class__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2552:1: ( ( ( rule__Class__NameAssignment_1 ) ) )
            // InternalBSharp.g:2553:1: ( ( rule__Class__NameAssignment_1 ) )
            {
            // InternalBSharp.g:2553:1: ( ( rule__Class__NameAssignment_1 ) )
            // InternalBSharp.g:2554:2: ( rule__Class__NameAssignment_1 )
            {
             before(grammarAccess.getClassAccess().getNameAssignment_1()); 
            // InternalBSharp.g:2555:2: ( rule__Class__NameAssignment_1 )
            // InternalBSharp.g:2555:3: rule__Class__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Class__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__1__Impl"


    // $ANTLR start "rule__Class__Group__2"
    // InternalBSharp.g:2563:1: rule__Class__Group__2 : rule__Class__Group__2__Impl rule__Class__Group__3 ;
    public final void rule__Class__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2567:1: ( rule__Class__Group__2__Impl rule__Class__Group__3 )
            // InternalBSharp.g:2568:2: rule__Class__Group__2__Impl rule__Class__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__Class__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__2"


    // $ANTLR start "rule__Class__Group__2__Impl"
    // InternalBSharp.g:2575:1: rule__Class__Group__2__Impl : ( ( rule__Class__RawContextAssignment_2 )? ) ;
    public final void rule__Class__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2579:1: ( ( ( rule__Class__RawContextAssignment_2 )? ) )
            // InternalBSharp.g:2580:1: ( ( rule__Class__RawContextAssignment_2 )? )
            {
            // InternalBSharp.g:2580:1: ( ( rule__Class__RawContextAssignment_2 )? )
            // InternalBSharp.g:2581:2: ( rule__Class__RawContextAssignment_2 )?
            {
             before(grammarAccess.getClassAccess().getRawContextAssignment_2()); 
            // InternalBSharp.g:2582:2: ( rule__Class__RawContextAssignment_2 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==43) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalBSharp.g:2582:3: rule__Class__RawContextAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Class__RawContextAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClassAccess().getRawContextAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__2__Impl"


    // $ANTLR start "rule__Class__Group__3"
    // InternalBSharp.g:2590:1: rule__Class__Group__3 : rule__Class__Group__3__Impl rule__Class__Group__4 ;
    public final void rule__Class__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2594:1: ( rule__Class__Group__3__Impl rule__Class__Group__4 )
            // InternalBSharp.g:2595:2: rule__Class__Group__3__Impl rule__Class__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__Class__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__3"


    // $ANTLR start "rule__Class__Group__3__Impl"
    // InternalBSharp.g:2602:1: rule__Class__Group__3__Impl : ( ( rule__Class__Group_3__0 ) ) ;
    public final void rule__Class__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2606:1: ( ( ( rule__Class__Group_3__0 ) ) )
            // InternalBSharp.g:2607:1: ( ( rule__Class__Group_3__0 ) )
            {
            // InternalBSharp.g:2607:1: ( ( rule__Class__Group_3__0 ) )
            // InternalBSharp.g:2608:2: ( rule__Class__Group_3__0 )
            {
             before(grammarAccess.getClassAccess().getGroup_3()); 
            // InternalBSharp.g:2609:2: ( rule__Class__Group_3__0 )
            // InternalBSharp.g:2609:3: rule__Class__Group_3__0
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group_3__0();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__3__Impl"


    // $ANTLR start "rule__Class__Group__4"
    // InternalBSharp.g:2617:1: rule__Class__Group__4 : rule__Class__Group__4__Impl rule__Class__Group__5 ;
    public final void rule__Class__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2621:1: ( rule__Class__Group__4__Impl rule__Class__Group__5 )
            // InternalBSharp.g:2622:2: rule__Class__Group__4__Impl rule__Class__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__Class__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__4"


    // $ANTLR start "rule__Class__Group__4__Impl"
    // InternalBSharp.g:2629:1: rule__Class__Group__4__Impl : ( ( rule__Class__SupertypesAssignment_4 )? ) ;
    public final void rule__Class__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2633:1: ( ( ( rule__Class__SupertypesAssignment_4 )? ) )
            // InternalBSharp.g:2634:1: ( ( rule__Class__SupertypesAssignment_4 )? )
            {
            // InternalBSharp.g:2634:1: ( ( rule__Class__SupertypesAssignment_4 )? )
            // InternalBSharp.g:2635:2: ( rule__Class__SupertypesAssignment_4 )?
            {
             before(grammarAccess.getClassAccess().getSupertypesAssignment_4()); 
            // InternalBSharp.g:2636:2: ( rule__Class__SupertypesAssignment_4 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==33) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalBSharp.g:2636:3: rule__Class__SupertypesAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Class__SupertypesAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClassAccess().getSupertypesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__4__Impl"


    // $ANTLR start "rule__Class__Group__5"
    // InternalBSharp.g:2644:1: rule__Class__Group__5 : rule__Class__Group__5__Impl rule__Class__Group__6 ;
    public final void rule__Class__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2648:1: ( rule__Class__Group__5__Impl rule__Class__Group__6 )
            // InternalBSharp.g:2649:2: rule__Class__Group__5__Impl rule__Class__Group__6
            {
            pushFollow(FOLLOW_16);
            rule__Class__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__5"


    // $ANTLR start "rule__Class__Group__5__Impl"
    // InternalBSharp.g:2656:1: rule__Class__Group__5__Impl : ( ( rule__Class__Group_5__0 )? ) ;
    public final void rule__Class__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2660:1: ( ( ( rule__Class__Group_5__0 )? ) )
            // InternalBSharp.g:2661:1: ( ( rule__Class__Group_5__0 )? )
            {
            // InternalBSharp.g:2661:1: ( ( rule__Class__Group_5__0 )? )
            // InternalBSharp.g:2662:2: ( rule__Class__Group_5__0 )?
            {
             before(grammarAccess.getClassAccess().getGroup_5()); 
            // InternalBSharp.g:2663:2: ( rule__Class__Group_5__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==41) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalBSharp.g:2663:3: rule__Class__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Class__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClassAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__5__Impl"


    // $ANTLR start "rule__Class__Group__6"
    // InternalBSharp.g:2671:1: rule__Class__Group__6 : rule__Class__Group__6__Impl rule__Class__Group__7 ;
    public final void rule__Class__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2675:1: ( rule__Class__Group__6__Impl rule__Class__Group__7 )
            // InternalBSharp.g:2676:2: rule__Class__Group__6__Impl rule__Class__Group__7
            {
            pushFollow(FOLLOW_16);
            rule__Class__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__6"


    // $ANTLR start "rule__Class__Group__6__Impl"
    // InternalBSharp.g:2683:1: rule__Class__Group__6__Impl : ( ( rule__Class__WhereAssignment_6 )? ) ;
    public final void rule__Class__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2687:1: ( ( ( rule__Class__WhereAssignment_6 )? ) )
            // InternalBSharp.g:2688:1: ( ( rule__Class__WhereAssignment_6 )? )
            {
            // InternalBSharp.g:2688:1: ( ( rule__Class__WhereAssignment_6 )? )
            // InternalBSharp.g:2689:2: ( rule__Class__WhereAssignment_6 )?
            {
             before(grammarAccess.getClassAccess().getWhereAssignment_6()); 
            // InternalBSharp.g:2690:2: ( rule__Class__WhereAssignment_6 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==47) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalBSharp.g:2690:3: rule__Class__WhereAssignment_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__Class__WhereAssignment_6();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClassAccess().getWhereAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__6__Impl"


    // $ANTLR start "rule__Class__Group__7"
    // InternalBSharp.g:2698:1: rule__Class__Group__7 : rule__Class__Group__7__Impl rule__Class__Group__8 ;
    public final void rule__Class__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2702:1: ( rule__Class__Group__7__Impl rule__Class__Group__8 )
            // InternalBSharp.g:2703:2: rule__Class__Group__7__Impl rule__Class__Group__8
            {
            pushFollow(FOLLOW_16);
            rule__Class__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__7"


    // $ANTLR start "rule__Class__Group__7__Impl"
    // InternalBSharp.g:2710:1: rule__Class__Group__7__Impl : ( ( ';' )? ) ;
    public final void rule__Class__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2714:1: ( ( ( ';' )? ) )
            // InternalBSharp.g:2715:1: ( ( ';' )? )
            {
            // InternalBSharp.g:2715:1: ( ( ';' )? )
            // InternalBSharp.g:2716:2: ( ';' )?
            {
             before(grammarAccess.getClassAccess().getSemicolonKeyword_7()); 
            // InternalBSharp.g:2717:2: ( ';' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==38) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalBSharp.g:2717:3: ';'
                    {
                    match(input,38,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getClassAccess().getSemicolonKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__7__Impl"


    // $ANTLR start "rule__Class__Group__8"
    // InternalBSharp.g:2725:1: rule__Class__Group__8 : rule__Class__Group__8__Impl ;
    public final void rule__Class__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2729:1: ( rule__Class__Group__8__Impl )
            // InternalBSharp.g:2730:2: rule__Class__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__8"


    // $ANTLR start "rule__Class__Group__8__Impl"
    // InternalBSharp.g:2736:1: rule__Class__Group__8__Impl : ( ( rule__Class__BlockAssignment_8 ) ) ;
    public final void rule__Class__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2740:1: ( ( ( rule__Class__BlockAssignment_8 ) ) )
            // InternalBSharp.g:2741:1: ( ( rule__Class__BlockAssignment_8 ) )
            {
            // InternalBSharp.g:2741:1: ( ( rule__Class__BlockAssignment_8 ) )
            // InternalBSharp.g:2742:2: ( rule__Class__BlockAssignment_8 )
            {
             before(grammarAccess.getClassAccess().getBlockAssignment_8()); 
            // InternalBSharp.g:2743:2: ( rule__Class__BlockAssignment_8 )
            // InternalBSharp.g:2743:3: rule__Class__BlockAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Class__BlockAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getBlockAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__8__Impl"


    // $ANTLR start "rule__Class__Group_3__0"
    // InternalBSharp.g:2752:1: rule__Class__Group_3__0 : rule__Class__Group_3__0__Impl rule__Class__Group_3__1 ;
    public final void rule__Class__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2756:1: ( rule__Class__Group_3__0__Impl rule__Class__Group_3__1 )
            // InternalBSharp.g:2757:2: rule__Class__Group_3__0__Impl rule__Class__Group_3__1
            {
            pushFollow(FOLLOW_3);
            rule__Class__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_3__0"


    // $ANTLR start "rule__Class__Group_3__0__Impl"
    // InternalBSharp.g:2764:1: rule__Class__Group_3__0__Impl : ( '[' ) ;
    public final void rule__Class__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2768:1: ( ( '[' ) )
            // InternalBSharp.g:2769:1: ( '[' )
            {
            // InternalBSharp.g:2769:1: ( '[' )
            // InternalBSharp.g:2770:2: '['
            {
             before(grammarAccess.getClassAccess().getLeftSquareBracketKeyword_3_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getLeftSquareBracketKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_3__0__Impl"


    // $ANTLR start "rule__Class__Group_3__1"
    // InternalBSharp.g:2779:1: rule__Class__Group_3__1 : rule__Class__Group_3__1__Impl rule__Class__Group_3__2 ;
    public final void rule__Class__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2783:1: ( rule__Class__Group_3__1__Impl rule__Class__Group_3__2 )
            // InternalBSharp.g:2784:2: rule__Class__Group_3__1__Impl rule__Class__Group_3__2
            {
            pushFollow(FOLLOW_17);
            rule__Class__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_3__1"


    // $ANTLR start "rule__Class__Group_3__1__Impl"
    // InternalBSharp.g:2791:1: rule__Class__Group_3__1__Impl : ( ( rule__Class__InstNameAssignment_3_1 ) ) ;
    public final void rule__Class__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2795:1: ( ( ( rule__Class__InstNameAssignment_3_1 ) ) )
            // InternalBSharp.g:2796:1: ( ( rule__Class__InstNameAssignment_3_1 ) )
            {
            // InternalBSharp.g:2796:1: ( ( rule__Class__InstNameAssignment_3_1 ) )
            // InternalBSharp.g:2797:2: ( rule__Class__InstNameAssignment_3_1 )
            {
             before(grammarAccess.getClassAccess().getInstNameAssignment_3_1()); 
            // InternalBSharp.g:2798:2: ( rule__Class__InstNameAssignment_3_1 )
            // InternalBSharp.g:2798:3: rule__Class__InstNameAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Class__InstNameAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getInstNameAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_3__1__Impl"


    // $ANTLR start "rule__Class__Group_3__2"
    // InternalBSharp.g:2806:1: rule__Class__Group_3__2 : rule__Class__Group_3__2__Impl ;
    public final void rule__Class__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2810:1: ( rule__Class__Group_3__2__Impl )
            // InternalBSharp.g:2811:2: rule__Class__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_3__2"


    // $ANTLR start "rule__Class__Group_3__2__Impl"
    // InternalBSharp.g:2817:1: rule__Class__Group_3__2__Impl : ( ']' ) ;
    public final void rule__Class__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2821:1: ( ( ']' ) )
            // InternalBSharp.g:2822:1: ( ']' )
            {
            // InternalBSharp.g:2822:1: ( ']' )
            // InternalBSharp.g:2823:2: ']'
            {
             before(grammarAccess.getClassAccess().getRightSquareBracketKeyword_3_2()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getRightSquareBracketKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_3__2__Impl"


    // $ANTLR start "rule__Class__Group_5__0"
    // InternalBSharp.g:2833:1: rule__Class__Group_5__0 : rule__Class__Group_5__0__Impl rule__Class__Group_5__1 ;
    public final void rule__Class__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2837:1: ( rule__Class__Group_5__0__Impl rule__Class__Group_5__1 )
            // InternalBSharp.g:2838:2: rule__Class__Group_5__0__Impl rule__Class__Group_5__1
            {
            pushFollow(FOLLOW_3);
            rule__Class__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_5__0"


    // $ANTLR start "rule__Class__Group_5__0__Impl"
    // InternalBSharp.g:2845:1: rule__Class__Group_5__0__Impl : ( '(' ) ;
    public final void rule__Class__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2849:1: ( ( '(' ) )
            // InternalBSharp.g:2850:1: ( '(' )
            {
            // InternalBSharp.g:2850:1: ( '(' )
            // InternalBSharp.g:2851:2: '('
            {
             before(grammarAccess.getClassAccess().getLeftParenthesisKeyword_5_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getLeftParenthesisKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_5__0__Impl"


    // $ANTLR start "rule__Class__Group_5__1"
    // InternalBSharp.g:2860:1: rule__Class__Group_5__1 : rule__Class__Group_5__1__Impl rule__Class__Group_5__2 ;
    public final void rule__Class__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2864:1: ( rule__Class__Group_5__1__Impl rule__Class__Group_5__2 )
            // InternalBSharp.g:2865:2: rule__Class__Group_5__1__Impl rule__Class__Group_5__2
            {
            pushFollow(FOLLOW_18);
            rule__Class__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_5__1"


    // $ANTLR start "rule__Class__Group_5__1__Impl"
    // InternalBSharp.g:2872:1: rule__Class__Group_5__1__Impl : ( ( rule__Class__VarListAssignment_5_1 ) ) ;
    public final void rule__Class__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2876:1: ( ( ( rule__Class__VarListAssignment_5_1 ) ) )
            // InternalBSharp.g:2877:1: ( ( rule__Class__VarListAssignment_5_1 ) )
            {
            // InternalBSharp.g:2877:1: ( ( rule__Class__VarListAssignment_5_1 ) )
            // InternalBSharp.g:2878:2: ( rule__Class__VarListAssignment_5_1 )
            {
             before(grammarAccess.getClassAccess().getVarListAssignment_5_1()); 
            // InternalBSharp.g:2879:2: ( rule__Class__VarListAssignment_5_1 )
            // InternalBSharp.g:2879:3: rule__Class__VarListAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Class__VarListAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getVarListAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_5__1__Impl"


    // $ANTLR start "rule__Class__Group_5__2"
    // InternalBSharp.g:2887:1: rule__Class__Group_5__2 : rule__Class__Group_5__2__Impl ;
    public final void rule__Class__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2891:1: ( rule__Class__Group_5__2__Impl )
            // InternalBSharp.g:2892:2: rule__Class__Group_5__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group_5__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_5__2"


    // $ANTLR start "rule__Class__Group_5__2__Impl"
    // InternalBSharp.g:2898:1: rule__Class__Group_5__2__Impl : ( ')' ) ;
    public final void rule__Class__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2902:1: ( ( ')' ) )
            // InternalBSharp.g:2903:1: ( ')' )
            {
            // InternalBSharp.g:2903:1: ( ')' )
            // InternalBSharp.g:2904:2: ')'
            {
             before(grammarAccess.getClassAccess().getRightParenthesisKeyword_5_2()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getRightParenthesisKeyword_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_5__2__Impl"


    // $ANTLR start "rule__PolyContext__Group__0"
    // InternalBSharp.g:2914:1: rule__PolyContext__Group__0 : rule__PolyContext__Group__0__Impl rule__PolyContext__Group__1 ;
    public final void rule__PolyContext__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2918:1: ( rule__PolyContext__Group__0__Impl rule__PolyContext__Group__1 )
            // InternalBSharp.g:2919:2: rule__PolyContext__Group__0__Impl rule__PolyContext__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__PolyContext__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PolyContext__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PolyContext__Group__0"


    // $ANTLR start "rule__PolyContext__Group__0__Impl"
    // InternalBSharp.g:2926:1: rule__PolyContext__Group__0__Impl : ( '<' ) ;
    public final void rule__PolyContext__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2930:1: ( ( '<' ) )
            // InternalBSharp.g:2931:1: ( '<' )
            {
            // InternalBSharp.g:2931:1: ( '<' )
            // InternalBSharp.g:2932:2: '<'
            {
             before(grammarAccess.getPolyContextAccess().getLessThanSignKeyword_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getPolyContextAccess().getLessThanSignKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PolyContext__Group__0__Impl"


    // $ANTLR start "rule__PolyContext__Group__1"
    // InternalBSharp.g:2941:1: rule__PolyContext__Group__1 : rule__PolyContext__Group__1__Impl rule__PolyContext__Group__2 ;
    public final void rule__PolyContext__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2945:1: ( rule__PolyContext__Group__1__Impl rule__PolyContext__Group__2 )
            // InternalBSharp.g:2946:2: rule__PolyContext__Group__1__Impl rule__PolyContext__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__PolyContext__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PolyContext__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PolyContext__Group__1"


    // $ANTLR start "rule__PolyContext__Group__1__Impl"
    // InternalBSharp.g:2953:1: rule__PolyContext__Group__1__Impl : ( ( ( rule__PolyContext__PolyTypesAssignment_1 ) ) ( ( rule__PolyContext__PolyTypesAssignment_1 )* ) ) ;
    public final void rule__PolyContext__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2957:1: ( ( ( ( rule__PolyContext__PolyTypesAssignment_1 ) ) ( ( rule__PolyContext__PolyTypesAssignment_1 )* ) ) )
            // InternalBSharp.g:2958:1: ( ( ( rule__PolyContext__PolyTypesAssignment_1 ) ) ( ( rule__PolyContext__PolyTypesAssignment_1 )* ) )
            {
            // InternalBSharp.g:2958:1: ( ( ( rule__PolyContext__PolyTypesAssignment_1 ) ) ( ( rule__PolyContext__PolyTypesAssignment_1 )* ) )
            // InternalBSharp.g:2959:2: ( ( rule__PolyContext__PolyTypesAssignment_1 ) ) ( ( rule__PolyContext__PolyTypesAssignment_1 )* )
            {
            // InternalBSharp.g:2959:2: ( ( rule__PolyContext__PolyTypesAssignment_1 ) )
            // InternalBSharp.g:2960:3: ( rule__PolyContext__PolyTypesAssignment_1 )
            {
             before(grammarAccess.getPolyContextAccess().getPolyTypesAssignment_1()); 
            // InternalBSharp.g:2961:3: ( rule__PolyContext__PolyTypesAssignment_1 )
            // InternalBSharp.g:2961:4: rule__PolyContext__PolyTypesAssignment_1
            {
            pushFollow(FOLLOW_13);
            rule__PolyContext__PolyTypesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPolyContextAccess().getPolyTypesAssignment_1()); 

            }

            // InternalBSharp.g:2964:2: ( ( rule__PolyContext__PolyTypesAssignment_1 )* )
            // InternalBSharp.g:2965:3: ( rule__PolyContext__PolyTypesAssignment_1 )*
            {
             before(grammarAccess.getPolyContextAccess().getPolyTypesAssignment_1()); 
            // InternalBSharp.g:2966:3: ( rule__PolyContext__PolyTypesAssignment_1 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_ID) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalBSharp.g:2966:4: rule__PolyContext__PolyTypesAssignment_1
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__PolyContext__PolyTypesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getPolyContextAccess().getPolyTypesAssignment_1()); 

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
    // $ANTLR end "rule__PolyContext__Group__1__Impl"


    // $ANTLR start "rule__PolyContext__Group__2"
    // InternalBSharp.g:2975:1: rule__PolyContext__Group__2 : rule__PolyContext__Group__2__Impl ;
    public final void rule__PolyContext__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2979:1: ( rule__PolyContext__Group__2__Impl )
            // InternalBSharp.g:2980:2: rule__PolyContext__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PolyContext__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PolyContext__Group__2"


    // $ANTLR start "rule__PolyContext__Group__2__Impl"
    // InternalBSharp.g:2986:1: rule__PolyContext__Group__2__Impl : ( '>' ) ;
    public final void rule__PolyContext__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2990:1: ( ( '>' ) )
            // InternalBSharp.g:2991:1: ( '>' )
            {
            // InternalBSharp.g:2991:1: ( '>' )
            // InternalBSharp.g:2992:2: '>'
            {
             before(grammarAccess.getPolyContextAccess().getGreaterThanSignKeyword_2()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getPolyContextAccess().getGreaterThanSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PolyContext__Group__2__Impl"


    // $ANTLR start "rule__PolyType__Group__0"
    // InternalBSharp.g:3002:1: rule__PolyType__Group__0 : rule__PolyType__Group__0__Impl rule__PolyType__Group__1 ;
    public final void rule__PolyType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3006:1: ( rule__PolyType__Group__0__Impl rule__PolyType__Group__1 )
            // InternalBSharp.g:3007:2: rule__PolyType__Group__0__Impl rule__PolyType__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__PolyType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PolyType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PolyType__Group__0"


    // $ANTLR start "rule__PolyType__Group__0__Impl"
    // InternalBSharp.g:3014:1: rule__PolyType__Group__0__Impl : ( ( rule__PolyType__NameAssignment_0 ) ) ;
    public final void rule__PolyType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3018:1: ( ( ( rule__PolyType__NameAssignment_0 ) ) )
            // InternalBSharp.g:3019:1: ( ( rule__PolyType__NameAssignment_0 ) )
            {
            // InternalBSharp.g:3019:1: ( ( rule__PolyType__NameAssignment_0 ) )
            // InternalBSharp.g:3020:2: ( rule__PolyType__NameAssignment_0 )
            {
             before(grammarAccess.getPolyTypeAccess().getNameAssignment_0()); 
            // InternalBSharp.g:3021:2: ( rule__PolyType__NameAssignment_0 )
            // InternalBSharp.g:3021:3: rule__PolyType__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__PolyType__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPolyTypeAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PolyType__Group__0__Impl"


    // $ANTLR start "rule__PolyType__Group__1"
    // InternalBSharp.g:3029:1: rule__PolyType__Group__1 : rule__PolyType__Group__1__Impl ;
    public final void rule__PolyType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3033:1: ( rule__PolyType__Group__1__Impl )
            // InternalBSharp.g:3034:2: rule__PolyType__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PolyType__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PolyType__Group__1"


    // $ANTLR start "rule__PolyType__Group__1__Impl"
    // InternalBSharp.g:3040:1: rule__PolyType__Group__1__Impl : ( ( rule__PolyType__Group_1__0 )? ) ;
    public final void rule__PolyType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3044:1: ( ( ( rule__PolyType__Group_1__0 )? ) )
            // InternalBSharp.g:3045:1: ( ( rule__PolyType__Group_1__0 )? )
            {
            // InternalBSharp.g:3045:1: ( ( rule__PolyType__Group_1__0 )? )
            // InternalBSharp.g:3046:2: ( rule__PolyType__Group_1__0 )?
            {
             before(grammarAccess.getPolyTypeAccess().getGroup_1()); 
            // InternalBSharp.g:3047:2: ( rule__PolyType__Group_1__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==33) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalBSharp.g:3047:3: rule__PolyType__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PolyType__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPolyTypeAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PolyType__Group__1__Impl"


    // $ANTLR start "rule__PolyType__Group_1__0"
    // InternalBSharp.g:3056:1: rule__PolyType__Group_1__0 : rule__PolyType__Group_1__0__Impl rule__PolyType__Group_1__1 ;
    public final void rule__PolyType__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3060:1: ( rule__PolyType__Group_1__0__Impl rule__PolyType__Group_1__1 )
            // InternalBSharp.g:3061:2: rule__PolyType__Group_1__0__Impl rule__PolyType__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__PolyType__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PolyType__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PolyType__Group_1__0"


    // $ANTLR start "rule__PolyType__Group_1__0__Impl"
    // InternalBSharp.g:3068:1: rule__PolyType__Group_1__0__Impl : ( ':' ) ;
    public final void rule__PolyType__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3072:1: ( ( ':' ) )
            // InternalBSharp.g:3073:1: ( ':' )
            {
            // InternalBSharp.g:3073:1: ( ':' )
            // InternalBSharp.g:3074:2: ':'
            {
             before(grammarAccess.getPolyTypeAccess().getColonKeyword_1_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getPolyTypeAccess().getColonKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PolyType__Group_1__0__Impl"


    // $ANTLR start "rule__PolyType__Group_1__1"
    // InternalBSharp.g:3083:1: rule__PolyType__Group_1__1 : rule__PolyType__Group_1__1__Impl rule__PolyType__Group_1__2 ;
    public final void rule__PolyType__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3087:1: ( rule__PolyType__Group_1__1__Impl rule__PolyType__Group_1__2 )
            // InternalBSharp.g:3088:2: rule__PolyType__Group_1__1__Impl rule__PolyType__Group_1__2
            {
            pushFollow(FOLLOW_20);
            rule__PolyType__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PolyType__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PolyType__Group_1__1"


    // $ANTLR start "rule__PolyType__Group_1__1__Impl"
    // InternalBSharp.g:3095:1: rule__PolyType__Group_1__1__Impl : ( ( rule__PolyType__SuperTypesAssignment_1_1 ) ) ;
    public final void rule__PolyType__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3099:1: ( ( ( rule__PolyType__SuperTypesAssignment_1_1 ) ) )
            // InternalBSharp.g:3100:1: ( ( rule__PolyType__SuperTypesAssignment_1_1 ) )
            {
            // InternalBSharp.g:3100:1: ( ( rule__PolyType__SuperTypesAssignment_1_1 ) )
            // InternalBSharp.g:3101:2: ( rule__PolyType__SuperTypesAssignment_1_1 )
            {
             before(grammarAccess.getPolyTypeAccess().getSuperTypesAssignment_1_1()); 
            // InternalBSharp.g:3102:2: ( rule__PolyType__SuperTypesAssignment_1_1 )
            // InternalBSharp.g:3102:3: rule__PolyType__SuperTypesAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__PolyType__SuperTypesAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getPolyTypeAccess().getSuperTypesAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PolyType__Group_1__1__Impl"


    // $ANTLR start "rule__PolyType__Group_1__2"
    // InternalBSharp.g:3110:1: rule__PolyType__Group_1__2 : rule__PolyType__Group_1__2__Impl ;
    public final void rule__PolyType__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3114:1: ( rule__PolyType__Group_1__2__Impl )
            // InternalBSharp.g:3115:2: rule__PolyType__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PolyType__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PolyType__Group_1__2"


    // $ANTLR start "rule__PolyType__Group_1__2__Impl"
    // InternalBSharp.g:3121:1: rule__PolyType__Group_1__2__Impl : ( ( rule__PolyType__Group_1_2__0 )* ) ;
    public final void rule__PolyType__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3125:1: ( ( ( rule__PolyType__Group_1_2__0 )* ) )
            // InternalBSharp.g:3126:1: ( ( rule__PolyType__Group_1_2__0 )* )
            {
            // InternalBSharp.g:3126:1: ( ( rule__PolyType__Group_1_2__0 )* )
            // InternalBSharp.g:3127:2: ( rule__PolyType__Group_1_2__0 )*
            {
             before(grammarAccess.getPolyTypeAccess().getGroup_1_2()); 
            // InternalBSharp.g:3128:2: ( rule__PolyType__Group_1_2__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==45) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalBSharp.g:3128:3: rule__PolyType__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__PolyType__Group_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getPolyTypeAccess().getGroup_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PolyType__Group_1__2__Impl"


    // $ANTLR start "rule__PolyType__Group_1_2__0"
    // InternalBSharp.g:3137:1: rule__PolyType__Group_1_2__0 : rule__PolyType__Group_1_2__0__Impl rule__PolyType__Group_1_2__1 ;
    public final void rule__PolyType__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3141:1: ( rule__PolyType__Group_1_2__0__Impl rule__PolyType__Group_1_2__1 )
            // InternalBSharp.g:3142:2: rule__PolyType__Group_1_2__0__Impl rule__PolyType__Group_1_2__1
            {
            pushFollow(FOLLOW_3);
            rule__PolyType__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PolyType__Group_1_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PolyType__Group_1_2__0"


    // $ANTLR start "rule__PolyType__Group_1_2__0__Impl"
    // InternalBSharp.g:3149:1: rule__PolyType__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__PolyType__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3153:1: ( ( ',' ) )
            // InternalBSharp.g:3154:1: ( ',' )
            {
            // InternalBSharp.g:3154:1: ( ',' )
            // InternalBSharp.g:3155:2: ','
            {
             before(grammarAccess.getPolyTypeAccess().getCommaKeyword_1_2_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getPolyTypeAccess().getCommaKeyword_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PolyType__Group_1_2__0__Impl"


    // $ANTLR start "rule__PolyType__Group_1_2__1"
    // InternalBSharp.g:3164:1: rule__PolyType__Group_1_2__1 : rule__PolyType__Group_1_2__1__Impl ;
    public final void rule__PolyType__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3168:1: ( rule__PolyType__Group_1_2__1__Impl )
            // InternalBSharp.g:3169:2: rule__PolyType__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PolyType__Group_1_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PolyType__Group_1_2__1"


    // $ANTLR start "rule__PolyType__Group_1_2__1__Impl"
    // InternalBSharp.g:3175:1: rule__PolyType__Group_1_2__1__Impl : ( ( rule__PolyType__SuperTypesAssignment_1_2_1 ) ) ;
    public final void rule__PolyType__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3179:1: ( ( ( rule__PolyType__SuperTypesAssignment_1_2_1 ) ) )
            // InternalBSharp.g:3180:1: ( ( rule__PolyType__SuperTypesAssignment_1_2_1 ) )
            {
            // InternalBSharp.g:3180:1: ( ( rule__PolyType__SuperTypesAssignment_1_2_1 ) )
            // InternalBSharp.g:3181:2: ( rule__PolyType__SuperTypesAssignment_1_2_1 )
            {
             before(grammarAccess.getPolyTypeAccess().getSuperTypesAssignment_1_2_1()); 
            // InternalBSharp.g:3182:2: ( rule__PolyType__SuperTypesAssignment_1_2_1 )
            // InternalBSharp.g:3182:3: rule__PolyType__SuperTypesAssignment_1_2_1
            {
            pushFollow(FOLLOW_2);
            rule__PolyType__SuperTypesAssignment_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getPolyTypeAccess().getSuperTypesAssignment_1_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PolyType__Group_1_2__1__Impl"


    // $ANTLR start "rule__SuperTypeList__Group__0"
    // InternalBSharp.g:3191:1: rule__SuperTypeList__Group__0 : rule__SuperTypeList__Group__0__Impl rule__SuperTypeList__Group__1 ;
    public final void rule__SuperTypeList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3195:1: ( rule__SuperTypeList__Group__0__Impl rule__SuperTypeList__Group__1 )
            // InternalBSharp.g:3196:2: rule__SuperTypeList__Group__0__Impl rule__SuperTypeList__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__SuperTypeList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SuperTypeList__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SuperTypeList__Group__0"


    // $ANTLR start "rule__SuperTypeList__Group__0__Impl"
    // InternalBSharp.g:3203:1: rule__SuperTypeList__Group__0__Impl : ( ':' ) ;
    public final void rule__SuperTypeList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3207:1: ( ( ':' ) )
            // InternalBSharp.g:3208:1: ( ':' )
            {
            // InternalBSharp.g:3208:1: ( ':' )
            // InternalBSharp.g:3209:2: ':'
            {
             before(grammarAccess.getSuperTypeListAccess().getColonKeyword_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getSuperTypeListAccess().getColonKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SuperTypeList__Group__0__Impl"


    // $ANTLR start "rule__SuperTypeList__Group__1"
    // InternalBSharp.g:3218:1: rule__SuperTypeList__Group__1 : rule__SuperTypeList__Group__1__Impl rule__SuperTypeList__Group__2 ;
    public final void rule__SuperTypeList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3222:1: ( rule__SuperTypeList__Group__1__Impl rule__SuperTypeList__Group__2 )
            // InternalBSharp.g:3223:2: rule__SuperTypeList__Group__1__Impl rule__SuperTypeList__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__SuperTypeList__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SuperTypeList__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SuperTypeList__Group__1"


    // $ANTLR start "rule__SuperTypeList__Group__1__Impl"
    // InternalBSharp.g:3230:1: rule__SuperTypeList__Group__1__Impl : ( ( rule__SuperTypeList__SuperTypesAssignment_1 ) ) ;
    public final void rule__SuperTypeList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3234:1: ( ( ( rule__SuperTypeList__SuperTypesAssignment_1 ) ) )
            // InternalBSharp.g:3235:1: ( ( rule__SuperTypeList__SuperTypesAssignment_1 ) )
            {
            // InternalBSharp.g:3235:1: ( ( rule__SuperTypeList__SuperTypesAssignment_1 ) )
            // InternalBSharp.g:3236:2: ( rule__SuperTypeList__SuperTypesAssignment_1 )
            {
             before(grammarAccess.getSuperTypeListAccess().getSuperTypesAssignment_1()); 
            // InternalBSharp.g:3237:2: ( rule__SuperTypeList__SuperTypesAssignment_1 )
            // InternalBSharp.g:3237:3: rule__SuperTypeList__SuperTypesAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SuperTypeList__SuperTypesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSuperTypeListAccess().getSuperTypesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SuperTypeList__Group__1__Impl"


    // $ANTLR start "rule__SuperTypeList__Group__2"
    // InternalBSharp.g:3245:1: rule__SuperTypeList__Group__2 : rule__SuperTypeList__Group__2__Impl ;
    public final void rule__SuperTypeList__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3249:1: ( rule__SuperTypeList__Group__2__Impl )
            // InternalBSharp.g:3250:2: rule__SuperTypeList__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SuperTypeList__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SuperTypeList__Group__2"


    // $ANTLR start "rule__SuperTypeList__Group__2__Impl"
    // InternalBSharp.g:3256:1: rule__SuperTypeList__Group__2__Impl : ( ( rule__SuperTypeList__Group_2__0 )* ) ;
    public final void rule__SuperTypeList__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3260:1: ( ( ( rule__SuperTypeList__Group_2__0 )* ) )
            // InternalBSharp.g:3261:1: ( ( rule__SuperTypeList__Group_2__0 )* )
            {
            // InternalBSharp.g:3261:1: ( ( rule__SuperTypeList__Group_2__0 )* )
            // InternalBSharp.g:3262:2: ( rule__SuperTypeList__Group_2__0 )*
            {
             before(grammarAccess.getSuperTypeListAccess().getGroup_2()); 
            // InternalBSharp.g:3263:2: ( rule__SuperTypeList__Group_2__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==45) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalBSharp.g:3263:3: rule__SuperTypeList__Group_2__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__SuperTypeList__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

             after(grammarAccess.getSuperTypeListAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SuperTypeList__Group__2__Impl"


    // $ANTLR start "rule__SuperTypeList__Group_2__0"
    // InternalBSharp.g:3272:1: rule__SuperTypeList__Group_2__0 : rule__SuperTypeList__Group_2__0__Impl rule__SuperTypeList__Group_2__1 ;
    public final void rule__SuperTypeList__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3276:1: ( rule__SuperTypeList__Group_2__0__Impl rule__SuperTypeList__Group_2__1 )
            // InternalBSharp.g:3277:2: rule__SuperTypeList__Group_2__0__Impl rule__SuperTypeList__Group_2__1
            {
            pushFollow(FOLLOW_22);
            rule__SuperTypeList__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SuperTypeList__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SuperTypeList__Group_2__0"


    // $ANTLR start "rule__SuperTypeList__Group_2__0__Impl"
    // InternalBSharp.g:3284:1: rule__SuperTypeList__Group_2__0__Impl : ( ',' ) ;
    public final void rule__SuperTypeList__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3288:1: ( ( ',' ) )
            // InternalBSharp.g:3289:1: ( ',' )
            {
            // InternalBSharp.g:3289:1: ( ',' )
            // InternalBSharp.g:3290:2: ','
            {
             before(grammarAccess.getSuperTypeListAccess().getCommaKeyword_2_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getSuperTypeListAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SuperTypeList__Group_2__0__Impl"


    // $ANTLR start "rule__SuperTypeList__Group_2__1"
    // InternalBSharp.g:3299:1: rule__SuperTypeList__Group_2__1 : rule__SuperTypeList__Group_2__1__Impl ;
    public final void rule__SuperTypeList__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3303:1: ( rule__SuperTypeList__Group_2__1__Impl )
            // InternalBSharp.g:3304:2: rule__SuperTypeList__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SuperTypeList__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SuperTypeList__Group_2__1"


    // $ANTLR start "rule__SuperTypeList__Group_2__1__Impl"
    // InternalBSharp.g:3310:1: rule__SuperTypeList__Group_2__1__Impl : ( ( rule__SuperTypeList__SuperTypesAssignment_2_1 ) ) ;
    public final void rule__SuperTypeList__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3314:1: ( ( ( rule__SuperTypeList__SuperTypesAssignment_2_1 ) ) )
            // InternalBSharp.g:3315:1: ( ( rule__SuperTypeList__SuperTypesAssignment_2_1 ) )
            {
            // InternalBSharp.g:3315:1: ( ( rule__SuperTypeList__SuperTypesAssignment_2_1 ) )
            // InternalBSharp.g:3316:2: ( rule__SuperTypeList__SuperTypesAssignment_2_1 )
            {
             before(grammarAccess.getSuperTypeListAccess().getSuperTypesAssignment_2_1()); 
            // InternalBSharp.g:3317:2: ( rule__SuperTypeList__SuperTypesAssignment_2_1 )
            // InternalBSharp.g:3317:3: rule__SuperTypeList__SuperTypesAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__SuperTypeList__SuperTypesAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSuperTypeListAccess().getSuperTypesAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SuperTypeList__Group_2__1__Impl"


    // $ANTLR start "rule__ConstructedType__Group__0"
    // InternalBSharp.g:3326:1: rule__ConstructedType__Group__0 : rule__ConstructedType__Group__0__Impl rule__ConstructedType__Group__1 ;
    public final void rule__ConstructedType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3330:1: ( rule__ConstructedType__Group__0__Impl rule__ConstructedType__Group__1 )
            // InternalBSharp.g:3331:2: rule__ConstructedType__Group__0__Impl rule__ConstructedType__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__ConstructedType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConstructedType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstructedType__Group__0"


    // $ANTLR start "rule__ConstructedType__Group__0__Impl"
    // InternalBSharp.g:3338:1: rule__ConstructedType__Group__0__Impl : ( ruleBuilderElem ) ;
    public final void rule__ConstructedType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3342:1: ( ( ruleBuilderElem ) )
            // InternalBSharp.g:3343:1: ( ruleBuilderElem )
            {
            // InternalBSharp.g:3343:1: ( ruleBuilderElem )
            // InternalBSharp.g:3344:2: ruleBuilderElem
            {
             before(grammarAccess.getConstructedTypeAccess().getBuilderElemParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleBuilderElem();

            state._fsp--;

             after(grammarAccess.getConstructedTypeAccess().getBuilderElemParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstructedType__Group__0__Impl"


    // $ANTLR start "rule__ConstructedType__Group__1"
    // InternalBSharp.g:3353:1: rule__ConstructedType__Group__1 : rule__ConstructedType__Group__1__Impl ;
    public final void rule__ConstructedType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3357:1: ( rule__ConstructedType__Group__1__Impl )
            // InternalBSharp.g:3358:2: rule__ConstructedType__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConstructedType__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstructedType__Group__1"


    // $ANTLR start "rule__ConstructedType__Group__1__Impl"
    // InternalBSharp.g:3364:1: rule__ConstructedType__Group__1__Impl : ( ( rule__ConstructedType__Group_1__0 )* ) ;
    public final void rule__ConstructedType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3368:1: ( ( ( rule__ConstructedType__Group_1__0 )* ) )
            // InternalBSharp.g:3369:1: ( ( rule__ConstructedType__Group_1__0 )* )
            {
            // InternalBSharp.g:3369:1: ( ( rule__ConstructedType__Group_1__0 )* )
            // InternalBSharp.g:3370:2: ( rule__ConstructedType__Group_1__0 )*
            {
             before(grammarAccess.getConstructedTypeAccess().getGroup_1()); 
            // InternalBSharp.g:3371:2: ( rule__ConstructedType__Group_1__0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( ((LA35_0>=13 && LA35_0<=22)) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalBSharp.g:3371:3: rule__ConstructedType__Group_1__0
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__ConstructedType__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

             after(grammarAccess.getConstructedTypeAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstructedType__Group__1__Impl"


    // $ANTLR start "rule__ConstructedType__Group_1__0"
    // InternalBSharp.g:3380:1: rule__ConstructedType__Group_1__0 : rule__ConstructedType__Group_1__0__Impl rule__ConstructedType__Group_1__1 ;
    public final void rule__ConstructedType__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3384:1: ( rule__ConstructedType__Group_1__0__Impl rule__ConstructedType__Group_1__1 )
            // InternalBSharp.g:3385:2: rule__ConstructedType__Group_1__0__Impl rule__ConstructedType__Group_1__1
            {
            pushFollow(FOLLOW_23);
            rule__ConstructedType__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConstructedType__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstructedType__Group_1__0"


    // $ANTLR start "rule__ConstructedType__Group_1__0__Impl"
    // InternalBSharp.g:3392:1: rule__ConstructedType__Group_1__0__Impl : ( () ) ;
    public final void rule__ConstructedType__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3396:1: ( ( () ) )
            // InternalBSharp.g:3397:1: ( () )
            {
            // InternalBSharp.g:3397:1: ( () )
            // InternalBSharp.g:3398:2: ()
            {
             before(grammarAccess.getConstructedTypeAccess().getConstructedTypeLeftAction_1_0()); 
            // InternalBSharp.g:3399:2: ()
            // InternalBSharp.g:3399:3: 
            {
            }

             after(grammarAccess.getConstructedTypeAccess().getConstructedTypeLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstructedType__Group_1__0__Impl"


    // $ANTLR start "rule__ConstructedType__Group_1__1"
    // InternalBSharp.g:3407:1: rule__ConstructedType__Group_1__1 : rule__ConstructedType__Group_1__1__Impl rule__ConstructedType__Group_1__2 ;
    public final void rule__ConstructedType__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3411:1: ( rule__ConstructedType__Group_1__1__Impl rule__ConstructedType__Group_1__2 )
            // InternalBSharp.g:3412:2: rule__ConstructedType__Group_1__1__Impl rule__ConstructedType__Group_1__2
            {
            pushFollow(FOLLOW_22);
            rule__ConstructedType__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConstructedType__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstructedType__Group_1__1"


    // $ANTLR start "rule__ConstructedType__Group_1__1__Impl"
    // InternalBSharp.g:3419:1: rule__ConstructedType__Group_1__1__Impl : ( ( rule__ConstructedType__ConstructorAssignment_1_1 ) ) ;
    public final void rule__ConstructedType__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3423:1: ( ( ( rule__ConstructedType__ConstructorAssignment_1_1 ) ) )
            // InternalBSharp.g:3424:1: ( ( rule__ConstructedType__ConstructorAssignment_1_1 ) )
            {
            // InternalBSharp.g:3424:1: ( ( rule__ConstructedType__ConstructorAssignment_1_1 ) )
            // InternalBSharp.g:3425:2: ( rule__ConstructedType__ConstructorAssignment_1_1 )
            {
             before(grammarAccess.getConstructedTypeAccess().getConstructorAssignment_1_1()); 
            // InternalBSharp.g:3426:2: ( rule__ConstructedType__ConstructorAssignment_1_1 )
            // InternalBSharp.g:3426:3: rule__ConstructedType__ConstructorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ConstructedType__ConstructorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getConstructedTypeAccess().getConstructorAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstructedType__Group_1__1__Impl"


    // $ANTLR start "rule__ConstructedType__Group_1__2"
    // InternalBSharp.g:3434:1: rule__ConstructedType__Group_1__2 : rule__ConstructedType__Group_1__2__Impl ;
    public final void rule__ConstructedType__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3438:1: ( rule__ConstructedType__Group_1__2__Impl )
            // InternalBSharp.g:3439:2: rule__ConstructedType__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConstructedType__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstructedType__Group_1__2"


    // $ANTLR start "rule__ConstructedType__Group_1__2__Impl"
    // InternalBSharp.g:3445:1: rule__ConstructedType__Group_1__2__Impl : ( ( rule__ConstructedType__RightAssignment_1_2 ) ) ;
    public final void rule__ConstructedType__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3449:1: ( ( ( rule__ConstructedType__RightAssignment_1_2 ) ) )
            // InternalBSharp.g:3450:1: ( ( rule__ConstructedType__RightAssignment_1_2 ) )
            {
            // InternalBSharp.g:3450:1: ( ( rule__ConstructedType__RightAssignment_1_2 ) )
            // InternalBSharp.g:3451:2: ( rule__ConstructedType__RightAssignment_1_2 )
            {
             before(grammarAccess.getConstructedTypeAccess().getRightAssignment_1_2()); 
            // InternalBSharp.g:3452:2: ( rule__ConstructedType__RightAssignment_1_2 )
            // InternalBSharp.g:3452:3: rule__ConstructedType__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__ConstructedType__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getConstructedTypeAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstructedType__Group_1__2__Impl"


    // $ANTLR start "rule__TypeConstructor__Group__0"
    // InternalBSharp.g:3461:1: rule__TypeConstructor__Group__0 : rule__TypeConstructor__Group__0__Impl rule__TypeConstructor__Group__1 ;
    public final void rule__TypeConstructor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3465:1: ( rule__TypeConstructor__Group__0__Impl rule__TypeConstructor__Group__1 )
            // InternalBSharp.g:3466:2: rule__TypeConstructor__Group__0__Impl rule__TypeConstructor__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__TypeConstructor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeConstructor__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeConstructor__Group__0"


    // $ANTLR start "rule__TypeConstructor__Group__0__Impl"
    // InternalBSharp.g:3473:1: rule__TypeConstructor__Group__0__Impl : ( ( rule__TypeConstructor__TypeNameAssignment_0 ) ) ;
    public final void rule__TypeConstructor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3477:1: ( ( ( rule__TypeConstructor__TypeNameAssignment_0 ) ) )
            // InternalBSharp.g:3478:1: ( ( rule__TypeConstructor__TypeNameAssignment_0 ) )
            {
            // InternalBSharp.g:3478:1: ( ( rule__TypeConstructor__TypeNameAssignment_0 ) )
            // InternalBSharp.g:3479:2: ( rule__TypeConstructor__TypeNameAssignment_0 )
            {
             before(grammarAccess.getTypeConstructorAccess().getTypeNameAssignment_0()); 
            // InternalBSharp.g:3480:2: ( rule__TypeConstructor__TypeNameAssignment_0 )
            // InternalBSharp.g:3480:3: rule__TypeConstructor__TypeNameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__TypeConstructor__TypeNameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTypeConstructorAccess().getTypeNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeConstructor__Group__0__Impl"


    // $ANTLR start "rule__TypeConstructor__Group__1"
    // InternalBSharp.g:3488:1: rule__TypeConstructor__Group__1 : rule__TypeConstructor__Group__1__Impl ;
    public final void rule__TypeConstructor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3492:1: ( rule__TypeConstructor__Group__1__Impl )
            // InternalBSharp.g:3493:2: rule__TypeConstructor__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TypeConstructor__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeConstructor__Group__1"


    // $ANTLR start "rule__TypeConstructor__Group__1__Impl"
    // InternalBSharp.g:3499:1: rule__TypeConstructor__Group__1__Impl : ( ( rule__TypeConstructor__ContextAssignment_1 )? ) ;
    public final void rule__TypeConstructor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3503:1: ( ( ( rule__TypeConstructor__ContextAssignment_1 )? ) )
            // InternalBSharp.g:3504:1: ( ( rule__TypeConstructor__ContextAssignment_1 )? )
            {
            // InternalBSharp.g:3504:1: ( ( rule__TypeConstructor__ContextAssignment_1 )? )
            // InternalBSharp.g:3505:2: ( rule__TypeConstructor__ContextAssignment_1 )?
            {
             before(grammarAccess.getTypeConstructorAccess().getContextAssignment_1()); 
            // InternalBSharp.g:3506:2: ( rule__TypeConstructor__ContextAssignment_1 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==43) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalBSharp.g:3506:3: rule__TypeConstructor__ContextAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__TypeConstructor__ContextAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTypeConstructorAccess().getContextAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeConstructor__Group__1__Impl"


    // $ANTLR start "rule__TypePowerSet__Group__0"
    // InternalBSharp.g:3515:1: rule__TypePowerSet__Group__0 : rule__TypePowerSet__Group__0__Impl rule__TypePowerSet__Group__1 ;
    public final void rule__TypePowerSet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3519:1: ( rule__TypePowerSet__Group__0__Impl rule__TypePowerSet__Group__1 )
            // InternalBSharp.g:3520:2: rule__TypePowerSet__Group__0__Impl rule__TypePowerSet__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__TypePowerSet__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypePowerSet__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypePowerSet__Group__0"


    // $ANTLR start "rule__TypePowerSet__Group__0__Impl"
    // InternalBSharp.g:3527:1: rule__TypePowerSet__Group__0__Impl : ( '\\u2119' ) ;
    public final void rule__TypePowerSet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3531:1: ( ( '\\u2119' ) )
            // InternalBSharp.g:3532:1: ( '\\u2119' )
            {
            // InternalBSharp.g:3532:1: ( '\\u2119' )
            // InternalBSharp.g:3533:2: '\\u2119'
            {
             before(grammarAccess.getTypePowerSetAccess().getDoubleStruckCapitalPKeyword_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getTypePowerSetAccess().getDoubleStruckCapitalPKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypePowerSet__Group__0__Impl"


    // $ANTLR start "rule__TypePowerSet__Group__1"
    // InternalBSharp.g:3542:1: rule__TypePowerSet__Group__1 : rule__TypePowerSet__Group__1__Impl rule__TypePowerSet__Group__2 ;
    public final void rule__TypePowerSet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3546:1: ( rule__TypePowerSet__Group__1__Impl rule__TypePowerSet__Group__2 )
            // InternalBSharp.g:3547:2: rule__TypePowerSet__Group__1__Impl rule__TypePowerSet__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__TypePowerSet__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypePowerSet__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypePowerSet__Group__1"


    // $ANTLR start "rule__TypePowerSet__Group__1__Impl"
    // InternalBSharp.g:3554:1: rule__TypePowerSet__Group__1__Impl : ( '(' ) ;
    public final void rule__TypePowerSet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3558:1: ( ( '(' ) )
            // InternalBSharp.g:3559:1: ( '(' )
            {
            // InternalBSharp.g:3559:1: ( '(' )
            // InternalBSharp.g:3560:2: '('
            {
             before(grammarAccess.getTypePowerSetAccess().getLeftParenthesisKeyword_1()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getTypePowerSetAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypePowerSet__Group__1__Impl"


    // $ANTLR start "rule__TypePowerSet__Group__2"
    // InternalBSharp.g:3569:1: rule__TypePowerSet__Group__2 : rule__TypePowerSet__Group__2__Impl rule__TypePowerSet__Group__3 ;
    public final void rule__TypePowerSet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3573:1: ( rule__TypePowerSet__Group__2__Impl rule__TypePowerSet__Group__3 )
            // InternalBSharp.g:3574:2: rule__TypePowerSet__Group__2__Impl rule__TypePowerSet__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__TypePowerSet__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypePowerSet__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypePowerSet__Group__2"


    // $ANTLR start "rule__TypePowerSet__Group__2__Impl"
    // InternalBSharp.g:3581:1: rule__TypePowerSet__Group__2__Impl : ( ( rule__TypePowerSet__ChildAssignment_2 ) ) ;
    public final void rule__TypePowerSet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3585:1: ( ( ( rule__TypePowerSet__ChildAssignment_2 ) ) )
            // InternalBSharp.g:3586:1: ( ( rule__TypePowerSet__ChildAssignment_2 ) )
            {
            // InternalBSharp.g:3586:1: ( ( rule__TypePowerSet__ChildAssignment_2 ) )
            // InternalBSharp.g:3587:2: ( rule__TypePowerSet__ChildAssignment_2 )
            {
             before(grammarAccess.getTypePowerSetAccess().getChildAssignment_2()); 
            // InternalBSharp.g:3588:2: ( rule__TypePowerSet__ChildAssignment_2 )
            // InternalBSharp.g:3588:3: rule__TypePowerSet__ChildAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__TypePowerSet__ChildAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTypePowerSetAccess().getChildAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypePowerSet__Group__2__Impl"


    // $ANTLR start "rule__TypePowerSet__Group__3"
    // InternalBSharp.g:3596:1: rule__TypePowerSet__Group__3 : rule__TypePowerSet__Group__3__Impl ;
    public final void rule__TypePowerSet__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3600:1: ( rule__TypePowerSet__Group__3__Impl )
            // InternalBSharp.g:3601:2: rule__TypePowerSet__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TypePowerSet__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypePowerSet__Group__3"


    // $ANTLR start "rule__TypePowerSet__Group__3__Impl"
    // InternalBSharp.g:3607:1: rule__TypePowerSet__Group__3__Impl : ( ')' ) ;
    public final void rule__TypePowerSet__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3611:1: ( ( ')' ) )
            // InternalBSharp.g:3612:1: ( ')' )
            {
            // InternalBSharp.g:3612:1: ( ')' )
            // InternalBSharp.g:3613:2: ')'
            {
             before(grammarAccess.getTypePowerSetAccess().getRightParenthesisKeyword_3()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getTypePowerSetAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypePowerSet__Group__3__Impl"


    // $ANTLR start "rule__TypeConstrBracket__Group__0"
    // InternalBSharp.g:3623:1: rule__TypeConstrBracket__Group__0 : rule__TypeConstrBracket__Group__0__Impl rule__TypeConstrBracket__Group__1 ;
    public final void rule__TypeConstrBracket__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3627:1: ( rule__TypeConstrBracket__Group__0__Impl rule__TypeConstrBracket__Group__1 )
            // InternalBSharp.g:3628:2: rule__TypeConstrBracket__Group__0__Impl rule__TypeConstrBracket__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__TypeConstrBracket__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeConstrBracket__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeConstrBracket__Group__0"


    // $ANTLR start "rule__TypeConstrBracket__Group__0__Impl"
    // InternalBSharp.g:3635:1: rule__TypeConstrBracket__Group__0__Impl : ( '(' ) ;
    public final void rule__TypeConstrBracket__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3639:1: ( ( '(' ) )
            // InternalBSharp.g:3640:1: ( '(' )
            {
            // InternalBSharp.g:3640:1: ( '(' )
            // InternalBSharp.g:3641:2: '('
            {
             before(grammarAccess.getTypeConstrBracketAccess().getLeftParenthesisKeyword_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getTypeConstrBracketAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeConstrBracket__Group__0__Impl"


    // $ANTLR start "rule__TypeConstrBracket__Group__1"
    // InternalBSharp.g:3650:1: rule__TypeConstrBracket__Group__1 : rule__TypeConstrBracket__Group__1__Impl rule__TypeConstrBracket__Group__2 ;
    public final void rule__TypeConstrBracket__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3654:1: ( rule__TypeConstrBracket__Group__1__Impl rule__TypeConstrBracket__Group__2 )
            // InternalBSharp.g:3655:2: rule__TypeConstrBracket__Group__1__Impl rule__TypeConstrBracket__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__TypeConstrBracket__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeConstrBracket__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeConstrBracket__Group__1"


    // $ANTLR start "rule__TypeConstrBracket__Group__1__Impl"
    // InternalBSharp.g:3662:1: rule__TypeConstrBracket__Group__1__Impl : ( ( rule__TypeConstrBracket__ChildAssignment_1 ) ) ;
    public final void rule__TypeConstrBracket__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3666:1: ( ( ( rule__TypeConstrBracket__ChildAssignment_1 ) ) )
            // InternalBSharp.g:3667:1: ( ( rule__TypeConstrBracket__ChildAssignment_1 ) )
            {
            // InternalBSharp.g:3667:1: ( ( rule__TypeConstrBracket__ChildAssignment_1 ) )
            // InternalBSharp.g:3668:2: ( rule__TypeConstrBracket__ChildAssignment_1 )
            {
             before(grammarAccess.getTypeConstrBracketAccess().getChildAssignment_1()); 
            // InternalBSharp.g:3669:2: ( rule__TypeConstrBracket__ChildAssignment_1 )
            // InternalBSharp.g:3669:3: rule__TypeConstrBracket__ChildAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TypeConstrBracket__ChildAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTypeConstrBracketAccess().getChildAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeConstrBracket__Group__1__Impl"


    // $ANTLR start "rule__TypeConstrBracket__Group__2"
    // InternalBSharp.g:3677:1: rule__TypeConstrBracket__Group__2 : rule__TypeConstrBracket__Group__2__Impl ;
    public final void rule__TypeConstrBracket__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3681:1: ( rule__TypeConstrBracket__Group__2__Impl )
            // InternalBSharp.g:3682:2: rule__TypeConstrBracket__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TypeConstrBracket__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeConstrBracket__Group__2"


    // $ANTLR start "rule__TypeConstrBracket__Group__2__Impl"
    // InternalBSharp.g:3688:1: rule__TypeConstrBracket__Group__2__Impl : ( ')' ) ;
    public final void rule__TypeConstrBracket__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3692:1: ( ( ')' ) )
            // InternalBSharp.g:3693:1: ( ')' )
            {
            // InternalBSharp.g:3693:1: ( ')' )
            // InternalBSharp.g:3694:2: ')'
            {
             before(grammarAccess.getTypeConstrBracketAccess().getRightParenthesisKeyword_2()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getTypeConstrBracketAccess().getRightParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeConstrBracket__Group__2__Impl"


    // $ANTLR start "rule__TypeDeclContext__Group__0"
    // InternalBSharp.g:3704:1: rule__TypeDeclContext__Group__0 : rule__TypeDeclContext__Group__0__Impl rule__TypeDeclContext__Group__1 ;
    public final void rule__TypeDeclContext__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3708:1: ( rule__TypeDeclContext__Group__0__Impl rule__TypeDeclContext__Group__1 )
            // InternalBSharp.g:3709:2: rule__TypeDeclContext__Group__0__Impl rule__TypeDeclContext__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__TypeDeclContext__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeDeclContext__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDeclContext__Group__0"


    // $ANTLR start "rule__TypeDeclContext__Group__0__Impl"
    // InternalBSharp.g:3716:1: rule__TypeDeclContext__Group__0__Impl : ( '<' ) ;
    public final void rule__TypeDeclContext__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3720:1: ( ( '<' ) )
            // InternalBSharp.g:3721:1: ( '<' )
            {
            // InternalBSharp.g:3721:1: ( '<' )
            // InternalBSharp.g:3722:2: '<'
            {
             before(grammarAccess.getTypeDeclContextAccess().getLessThanSignKeyword_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getTypeDeclContextAccess().getLessThanSignKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDeclContext__Group__0__Impl"


    // $ANTLR start "rule__TypeDeclContext__Group__1"
    // InternalBSharp.g:3731:1: rule__TypeDeclContext__Group__1 : rule__TypeDeclContext__Group__1__Impl rule__TypeDeclContext__Group__2 ;
    public final void rule__TypeDeclContext__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3735:1: ( rule__TypeDeclContext__Group__1__Impl rule__TypeDeclContext__Group__2 )
            // InternalBSharp.g:3736:2: rule__TypeDeclContext__Group__1__Impl rule__TypeDeclContext__Group__2
            {
            pushFollow(FOLLOW_27);
            rule__TypeDeclContext__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeDeclContext__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDeclContext__Group__1"


    // $ANTLR start "rule__TypeDeclContext__Group__1__Impl"
    // InternalBSharp.g:3743:1: rule__TypeDeclContext__Group__1__Impl : ( ( rule__TypeDeclContext__TypeNameAssignment_1 ) ) ;
    public final void rule__TypeDeclContext__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3747:1: ( ( ( rule__TypeDeclContext__TypeNameAssignment_1 ) ) )
            // InternalBSharp.g:3748:1: ( ( rule__TypeDeclContext__TypeNameAssignment_1 ) )
            {
            // InternalBSharp.g:3748:1: ( ( rule__TypeDeclContext__TypeNameAssignment_1 ) )
            // InternalBSharp.g:3749:2: ( rule__TypeDeclContext__TypeNameAssignment_1 )
            {
             before(grammarAccess.getTypeDeclContextAccess().getTypeNameAssignment_1()); 
            // InternalBSharp.g:3750:2: ( rule__TypeDeclContext__TypeNameAssignment_1 )
            // InternalBSharp.g:3750:3: rule__TypeDeclContext__TypeNameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TypeDeclContext__TypeNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTypeDeclContextAccess().getTypeNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDeclContext__Group__1__Impl"


    // $ANTLR start "rule__TypeDeclContext__Group__2"
    // InternalBSharp.g:3758:1: rule__TypeDeclContext__Group__2 : rule__TypeDeclContext__Group__2__Impl rule__TypeDeclContext__Group__3 ;
    public final void rule__TypeDeclContext__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3762:1: ( rule__TypeDeclContext__Group__2__Impl rule__TypeDeclContext__Group__3 )
            // InternalBSharp.g:3763:2: rule__TypeDeclContext__Group__2__Impl rule__TypeDeclContext__Group__3
            {
            pushFollow(FOLLOW_27);
            rule__TypeDeclContext__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeDeclContext__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDeclContext__Group__2"


    // $ANTLR start "rule__TypeDeclContext__Group__2__Impl"
    // InternalBSharp.g:3770:1: rule__TypeDeclContext__Group__2__Impl : ( ( rule__TypeDeclContext__Group_2__0 )* ) ;
    public final void rule__TypeDeclContext__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3774:1: ( ( ( rule__TypeDeclContext__Group_2__0 )* ) )
            // InternalBSharp.g:3775:1: ( ( rule__TypeDeclContext__Group_2__0 )* )
            {
            // InternalBSharp.g:3775:1: ( ( rule__TypeDeclContext__Group_2__0 )* )
            // InternalBSharp.g:3776:2: ( rule__TypeDeclContext__Group_2__0 )*
            {
             before(grammarAccess.getTypeDeclContextAccess().getGroup_2()); 
            // InternalBSharp.g:3777:2: ( rule__TypeDeclContext__Group_2__0 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==45) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalBSharp.g:3777:3: rule__TypeDeclContext__Group_2__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__TypeDeclContext__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

             after(grammarAccess.getTypeDeclContextAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDeclContext__Group__2__Impl"


    // $ANTLR start "rule__TypeDeclContext__Group__3"
    // InternalBSharp.g:3785:1: rule__TypeDeclContext__Group__3 : rule__TypeDeclContext__Group__3__Impl ;
    public final void rule__TypeDeclContext__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3789:1: ( rule__TypeDeclContext__Group__3__Impl )
            // InternalBSharp.g:3790:2: rule__TypeDeclContext__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TypeDeclContext__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDeclContext__Group__3"


    // $ANTLR start "rule__TypeDeclContext__Group__3__Impl"
    // InternalBSharp.g:3796:1: rule__TypeDeclContext__Group__3__Impl : ( '>' ) ;
    public final void rule__TypeDeclContext__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3800:1: ( ( '>' ) )
            // InternalBSharp.g:3801:1: ( '>' )
            {
            // InternalBSharp.g:3801:1: ( '>' )
            // InternalBSharp.g:3802:2: '>'
            {
             before(grammarAccess.getTypeDeclContextAccess().getGreaterThanSignKeyword_3()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getTypeDeclContextAccess().getGreaterThanSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDeclContext__Group__3__Impl"


    // $ANTLR start "rule__TypeDeclContext__Group_2__0"
    // InternalBSharp.g:3812:1: rule__TypeDeclContext__Group_2__0 : rule__TypeDeclContext__Group_2__0__Impl rule__TypeDeclContext__Group_2__1 ;
    public final void rule__TypeDeclContext__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3816:1: ( rule__TypeDeclContext__Group_2__0__Impl rule__TypeDeclContext__Group_2__1 )
            // InternalBSharp.g:3817:2: rule__TypeDeclContext__Group_2__0__Impl rule__TypeDeclContext__Group_2__1
            {
            pushFollow(FOLLOW_22);
            rule__TypeDeclContext__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeDeclContext__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDeclContext__Group_2__0"


    // $ANTLR start "rule__TypeDeclContext__Group_2__0__Impl"
    // InternalBSharp.g:3824:1: rule__TypeDeclContext__Group_2__0__Impl : ( ',' ) ;
    public final void rule__TypeDeclContext__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3828:1: ( ( ',' ) )
            // InternalBSharp.g:3829:1: ( ',' )
            {
            // InternalBSharp.g:3829:1: ( ',' )
            // InternalBSharp.g:3830:2: ','
            {
             before(grammarAccess.getTypeDeclContextAccess().getCommaKeyword_2_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getTypeDeclContextAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDeclContext__Group_2__0__Impl"


    // $ANTLR start "rule__TypeDeclContext__Group_2__1"
    // InternalBSharp.g:3839:1: rule__TypeDeclContext__Group_2__1 : rule__TypeDeclContext__Group_2__1__Impl ;
    public final void rule__TypeDeclContext__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3843:1: ( rule__TypeDeclContext__Group_2__1__Impl )
            // InternalBSharp.g:3844:2: rule__TypeDeclContext__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TypeDeclContext__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDeclContext__Group_2__1"


    // $ANTLR start "rule__TypeDeclContext__Group_2__1__Impl"
    // InternalBSharp.g:3850:1: rule__TypeDeclContext__Group_2__1__Impl : ( ( rule__TypeDeclContext__TypeNameAssignment_2_1 ) ) ;
    public final void rule__TypeDeclContext__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3854:1: ( ( ( rule__TypeDeclContext__TypeNameAssignment_2_1 ) ) )
            // InternalBSharp.g:3855:1: ( ( rule__TypeDeclContext__TypeNameAssignment_2_1 ) )
            {
            // InternalBSharp.g:3855:1: ( ( rule__TypeDeclContext__TypeNameAssignment_2_1 ) )
            // InternalBSharp.g:3856:2: ( rule__TypeDeclContext__TypeNameAssignment_2_1 )
            {
             before(grammarAccess.getTypeDeclContextAccess().getTypeNameAssignment_2_1()); 
            // InternalBSharp.g:3857:2: ( rule__TypeDeclContext__TypeNameAssignment_2_1 )
            // InternalBSharp.g:3857:3: rule__TypeDeclContext__TypeNameAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__TypeDeclContext__TypeNameAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getTypeDeclContextAccess().getTypeNameAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDeclContext__Group_2__1__Impl"


    // $ANTLR start "rule__Where__Group__0"
    // InternalBSharp.g:3866:1: rule__Where__Group__0 : rule__Where__Group__0__Impl rule__Where__Group__1 ;
    public final void rule__Where__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3870:1: ( rule__Where__Group__0__Impl rule__Where__Group__1 )
            // InternalBSharp.g:3871:2: rule__Where__Group__0__Impl rule__Where__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__Where__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Where__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Where__Group__0"


    // $ANTLR start "rule__Where__Group__0__Impl"
    // InternalBSharp.g:3878:1: rule__Where__Group__0__Impl : ( 'where' ) ;
    public final void rule__Where__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3882:1: ( ( 'where' ) )
            // InternalBSharp.g:3883:1: ( 'where' )
            {
            // InternalBSharp.g:3883:1: ( 'where' )
            // InternalBSharp.g:3884:2: 'where'
            {
             before(grammarAccess.getWhereAccess().getWhereKeyword_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getWhereAccess().getWhereKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Where__Group__0__Impl"


    // $ANTLR start "rule__Where__Group__1"
    // InternalBSharp.g:3893:1: rule__Where__Group__1 : rule__Where__Group__1__Impl rule__Where__Group__2 ;
    public final void rule__Where__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3897:1: ( rule__Where__Group__1__Impl rule__Where__Group__2 )
            // InternalBSharp.g:3898:2: rule__Where__Group__1__Impl rule__Where__Group__2
            {
            pushFollow(FOLLOW_29);
            rule__Where__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Where__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Where__Group__1"


    // $ANTLR start "rule__Where__Group__1__Impl"
    // InternalBSharp.g:3905:1: rule__Where__Group__1__Impl : ( ( rule__Where__ExpressionsAssignment_1 ) ) ;
    public final void rule__Where__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3909:1: ( ( ( rule__Where__ExpressionsAssignment_1 ) ) )
            // InternalBSharp.g:3910:1: ( ( rule__Where__ExpressionsAssignment_1 ) )
            {
            // InternalBSharp.g:3910:1: ( ( rule__Where__ExpressionsAssignment_1 ) )
            // InternalBSharp.g:3911:2: ( rule__Where__ExpressionsAssignment_1 )
            {
             before(grammarAccess.getWhereAccess().getExpressionsAssignment_1()); 
            // InternalBSharp.g:3912:2: ( rule__Where__ExpressionsAssignment_1 )
            // InternalBSharp.g:3912:3: rule__Where__ExpressionsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Where__ExpressionsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getWhereAccess().getExpressionsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Where__Group__1__Impl"


    // $ANTLR start "rule__Where__Group__2"
    // InternalBSharp.g:3920:1: rule__Where__Group__2 : rule__Where__Group__2__Impl ;
    public final void rule__Where__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3924:1: ( rule__Where__Group__2__Impl )
            // InternalBSharp.g:3925:2: rule__Where__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Where__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Where__Group__2"


    // $ANTLR start "rule__Where__Group__2__Impl"
    // InternalBSharp.g:3931:1: rule__Where__Group__2__Impl : ( ( rule__Where__Group_2__0 )* ) ;
    public final void rule__Where__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3935:1: ( ( ( rule__Where__Group_2__0 )* ) )
            // InternalBSharp.g:3936:1: ( ( rule__Where__Group_2__0 )* )
            {
            // InternalBSharp.g:3936:1: ( ( rule__Where__Group_2__0 )* )
            // InternalBSharp.g:3937:2: ( rule__Where__Group_2__0 )*
            {
             before(grammarAccess.getWhereAccess().getGroup_2()); 
            // InternalBSharp.g:3938:2: ( rule__Where__Group_2__0 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==38) ) {
                    int LA38_2 = input.LA(2);

                    if ( (LA38_2==RULE_ID||LA38_2==11||(LA38_2>=23 && LA38_2<=24)||LA38_2==39||LA38_2==41||LA38_2==53||LA38_2==56||LA38_2==60) ) {
                        alt38=1;
                    }


                }


                switch (alt38) {
            	case 1 :
            	    // InternalBSharp.g:3938:3: rule__Where__Group_2__0
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__Where__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

             after(grammarAccess.getWhereAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Where__Group__2__Impl"


    // $ANTLR start "rule__Where__Group_2__0"
    // InternalBSharp.g:3947:1: rule__Where__Group_2__0 : rule__Where__Group_2__0__Impl rule__Where__Group_2__1 ;
    public final void rule__Where__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3951:1: ( rule__Where__Group_2__0__Impl rule__Where__Group_2__1 )
            // InternalBSharp.g:3952:2: rule__Where__Group_2__0__Impl rule__Where__Group_2__1
            {
            pushFollow(FOLLOW_28);
            rule__Where__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Where__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Where__Group_2__0"


    // $ANTLR start "rule__Where__Group_2__0__Impl"
    // InternalBSharp.g:3959:1: rule__Where__Group_2__0__Impl : ( ';' ) ;
    public final void rule__Where__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3963:1: ( ( ';' ) )
            // InternalBSharp.g:3964:1: ( ';' )
            {
            // InternalBSharp.g:3964:1: ( ';' )
            // InternalBSharp.g:3965:2: ';'
            {
             before(grammarAccess.getWhereAccess().getSemicolonKeyword_2_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getWhereAccess().getSemicolonKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Where__Group_2__0__Impl"


    // $ANTLR start "rule__Where__Group_2__1"
    // InternalBSharp.g:3974:1: rule__Where__Group_2__1 : rule__Where__Group_2__1__Impl ;
    public final void rule__Where__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3978:1: ( rule__Where__Group_2__1__Impl )
            // InternalBSharp.g:3979:2: rule__Where__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Where__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Where__Group_2__1"


    // $ANTLR start "rule__Where__Group_2__1__Impl"
    // InternalBSharp.g:3985:1: rule__Where__Group_2__1__Impl : ( ( rule__Where__ExpressionsAssignment_2_1 ) ) ;
    public final void rule__Where__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3989:1: ( ( ( rule__Where__ExpressionsAssignment_2_1 ) ) )
            // InternalBSharp.g:3990:1: ( ( rule__Where__ExpressionsAssignment_2_1 ) )
            {
            // InternalBSharp.g:3990:1: ( ( rule__Where__ExpressionsAssignment_2_1 ) )
            // InternalBSharp.g:3991:2: ( rule__Where__ExpressionsAssignment_2_1 )
            {
             before(grammarAccess.getWhereAccess().getExpressionsAssignment_2_1()); 
            // InternalBSharp.g:3992:2: ( rule__Where__ExpressionsAssignment_2_1 )
            // InternalBSharp.g:3992:3: rule__Where__ExpressionsAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Where__ExpressionsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getWhereAccess().getExpressionsAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Where__Group_2__1__Impl"


    // $ANTLR start "rule__Datatype__Group__0"
    // InternalBSharp.g:4001:1: rule__Datatype__Group__0 : rule__Datatype__Group__0__Impl rule__Datatype__Group__1 ;
    public final void rule__Datatype__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4005:1: ( rule__Datatype__Group__0__Impl rule__Datatype__Group__1 )
            // InternalBSharp.g:4006:2: rule__Datatype__Group__0__Impl rule__Datatype__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Datatype__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Datatype__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Datatype__Group__0"


    // $ANTLR start "rule__Datatype__Group__0__Impl"
    // InternalBSharp.g:4013:1: rule__Datatype__Group__0__Impl : ( 'Datatype' ) ;
    public final void rule__Datatype__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4017:1: ( ( 'Datatype' ) )
            // InternalBSharp.g:4018:1: ( 'Datatype' )
            {
            // InternalBSharp.g:4018:1: ( 'Datatype' )
            // InternalBSharp.g:4019:2: 'Datatype'
            {
             before(grammarAccess.getDatatypeAccess().getDatatypeKeyword_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getDatatypeAccess().getDatatypeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Datatype__Group__0__Impl"


    // $ANTLR start "rule__Datatype__Group__1"
    // InternalBSharp.g:4028:1: rule__Datatype__Group__1 : rule__Datatype__Group__1__Impl rule__Datatype__Group__2 ;
    public final void rule__Datatype__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4032:1: ( rule__Datatype__Group__1__Impl rule__Datatype__Group__2 )
            // InternalBSharp.g:4033:2: rule__Datatype__Group__1__Impl rule__Datatype__Group__2
            {
            pushFollow(FOLLOW_31);
            rule__Datatype__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Datatype__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Datatype__Group__1"


    // $ANTLR start "rule__Datatype__Group__1__Impl"
    // InternalBSharp.g:4040:1: rule__Datatype__Group__1__Impl : ( ( rule__Datatype__NameAssignment_1 ) ) ;
    public final void rule__Datatype__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4044:1: ( ( ( rule__Datatype__NameAssignment_1 ) ) )
            // InternalBSharp.g:4045:1: ( ( rule__Datatype__NameAssignment_1 ) )
            {
            // InternalBSharp.g:4045:1: ( ( rule__Datatype__NameAssignment_1 ) )
            // InternalBSharp.g:4046:2: ( rule__Datatype__NameAssignment_1 )
            {
             before(grammarAccess.getDatatypeAccess().getNameAssignment_1()); 
            // InternalBSharp.g:4047:2: ( rule__Datatype__NameAssignment_1 )
            // InternalBSharp.g:4047:3: rule__Datatype__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Datatype__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDatatypeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Datatype__Group__1__Impl"


    // $ANTLR start "rule__Datatype__Group__2"
    // InternalBSharp.g:4055:1: rule__Datatype__Group__2 : rule__Datatype__Group__2__Impl rule__Datatype__Group__3 ;
    public final void rule__Datatype__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4059:1: ( rule__Datatype__Group__2__Impl rule__Datatype__Group__3 )
            // InternalBSharp.g:4060:2: rule__Datatype__Group__2__Impl rule__Datatype__Group__3
            {
            pushFollow(FOLLOW_31);
            rule__Datatype__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Datatype__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Datatype__Group__2"


    // $ANTLR start "rule__Datatype__Group__2__Impl"
    // InternalBSharp.g:4067:1: rule__Datatype__Group__2__Impl : ( ( rule__Datatype__RawContextAssignment_2 )? ) ;
    public final void rule__Datatype__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4071:1: ( ( ( rule__Datatype__RawContextAssignment_2 )? ) )
            // InternalBSharp.g:4072:1: ( ( rule__Datatype__RawContextAssignment_2 )? )
            {
            // InternalBSharp.g:4072:1: ( ( rule__Datatype__RawContextAssignment_2 )? )
            // InternalBSharp.g:4073:2: ( rule__Datatype__RawContextAssignment_2 )?
            {
             before(grammarAccess.getDatatypeAccess().getRawContextAssignment_2()); 
            // InternalBSharp.g:4074:2: ( rule__Datatype__RawContextAssignment_2 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==43) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalBSharp.g:4074:3: rule__Datatype__RawContextAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Datatype__RawContextAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDatatypeAccess().getRawContextAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Datatype__Group__2__Impl"


    // $ANTLR start "rule__Datatype__Group__3"
    // InternalBSharp.g:4082:1: rule__Datatype__Group__3 : rule__Datatype__Group__3__Impl rule__Datatype__Group__4 ;
    public final void rule__Datatype__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4086:1: ( rule__Datatype__Group__3__Impl rule__Datatype__Group__4 )
            // InternalBSharp.g:4087:2: rule__Datatype__Group__3__Impl rule__Datatype__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__Datatype__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Datatype__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Datatype__Group__3"


    // $ANTLR start "rule__Datatype__Group__3__Impl"
    // InternalBSharp.g:4094:1: rule__Datatype__Group__3__Impl : ( ( ( rule__Datatype__Group_3__0 ) ) ( ( rule__Datatype__Group_3__0 )* ) ) ;
    public final void rule__Datatype__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4098:1: ( ( ( ( rule__Datatype__Group_3__0 ) ) ( ( rule__Datatype__Group_3__0 )* ) ) )
            // InternalBSharp.g:4099:1: ( ( ( rule__Datatype__Group_3__0 ) ) ( ( rule__Datatype__Group_3__0 )* ) )
            {
            // InternalBSharp.g:4099:1: ( ( ( rule__Datatype__Group_3__0 ) ) ( ( rule__Datatype__Group_3__0 )* ) )
            // InternalBSharp.g:4100:2: ( ( rule__Datatype__Group_3__0 ) ) ( ( rule__Datatype__Group_3__0 )* )
            {
            // InternalBSharp.g:4100:2: ( ( rule__Datatype__Group_3__0 ) )
            // InternalBSharp.g:4101:3: ( rule__Datatype__Group_3__0 )
            {
             before(grammarAccess.getDatatypeAccess().getGroup_3()); 
            // InternalBSharp.g:4102:3: ( rule__Datatype__Group_3__0 )
            // InternalBSharp.g:4102:4: rule__Datatype__Group_3__0
            {
            pushFollow(FOLLOW_32);
            rule__Datatype__Group_3__0();

            state._fsp--;


            }

             after(grammarAccess.getDatatypeAccess().getGroup_3()); 

            }

            // InternalBSharp.g:4105:2: ( ( rule__Datatype__Group_3__0 )* )
            // InternalBSharp.g:4106:3: ( rule__Datatype__Group_3__0 )*
            {
             before(grammarAccess.getDatatypeAccess().getGroup_3()); 
            // InternalBSharp.g:4107:3: ( rule__Datatype__Group_3__0 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==49) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalBSharp.g:4107:4: rule__Datatype__Group_3__0
            	    {
            	    pushFollow(FOLLOW_32);
            	    rule__Datatype__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

             after(grammarAccess.getDatatypeAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Datatype__Group__3__Impl"


    // $ANTLR start "rule__Datatype__Group__4"
    // InternalBSharp.g:4116:1: rule__Datatype__Group__4 : rule__Datatype__Group__4__Impl ;
    public final void rule__Datatype__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4120:1: ( rule__Datatype__Group__4__Impl )
            // InternalBSharp.g:4121:2: rule__Datatype__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Datatype__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Datatype__Group__4"


    // $ANTLR start "rule__Datatype__Group__4__Impl"
    // InternalBSharp.g:4127:1: rule__Datatype__Group__4__Impl : ( ( rule__Datatype__BlockAssignment_4 ) ) ;
    public final void rule__Datatype__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4131:1: ( ( ( rule__Datatype__BlockAssignment_4 ) ) )
            // InternalBSharp.g:4132:1: ( ( rule__Datatype__BlockAssignment_4 ) )
            {
            // InternalBSharp.g:4132:1: ( ( rule__Datatype__BlockAssignment_4 ) )
            // InternalBSharp.g:4133:2: ( rule__Datatype__BlockAssignment_4 )
            {
             before(grammarAccess.getDatatypeAccess().getBlockAssignment_4()); 
            // InternalBSharp.g:4134:2: ( rule__Datatype__BlockAssignment_4 )
            // InternalBSharp.g:4134:3: rule__Datatype__BlockAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Datatype__BlockAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getDatatypeAccess().getBlockAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Datatype__Group__4__Impl"


    // $ANTLR start "rule__Datatype__Group_3__0"
    // InternalBSharp.g:4143:1: rule__Datatype__Group_3__0 : rule__Datatype__Group_3__0__Impl rule__Datatype__Group_3__1 ;
    public final void rule__Datatype__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4147:1: ( rule__Datatype__Group_3__0__Impl rule__Datatype__Group_3__1 )
            // InternalBSharp.g:4148:2: rule__Datatype__Group_3__0__Impl rule__Datatype__Group_3__1
            {
            pushFollow(FOLLOW_3);
            rule__Datatype__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Datatype__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Datatype__Group_3__0"


    // $ANTLR start "rule__Datatype__Group_3__0__Impl"
    // InternalBSharp.g:4155:1: rule__Datatype__Group_3__0__Impl : ( '|' ) ;
    public final void rule__Datatype__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4159:1: ( ( '|' ) )
            // InternalBSharp.g:4160:1: ( '|' )
            {
            // InternalBSharp.g:4160:1: ( '|' )
            // InternalBSharp.g:4161:2: '|'
            {
             before(grammarAccess.getDatatypeAccess().getVerticalLineKeyword_3_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getDatatypeAccess().getVerticalLineKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Datatype__Group_3__0__Impl"


    // $ANTLR start "rule__Datatype__Group_3__1"
    // InternalBSharp.g:4170:1: rule__Datatype__Group_3__1 : rule__Datatype__Group_3__1__Impl ;
    public final void rule__Datatype__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4174:1: ( rule__Datatype__Group_3__1__Impl )
            // InternalBSharp.g:4175:2: rule__Datatype__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Datatype__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Datatype__Group_3__1"


    // $ANTLR start "rule__Datatype__Group_3__1__Impl"
    // InternalBSharp.g:4181:1: rule__Datatype__Group_3__1__Impl : ( ( rule__Datatype__ConstructorsAssignment_3_1 ) ) ;
    public final void rule__Datatype__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4185:1: ( ( ( rule__Datatype__ConstructorsAssignment_3_1 ) ) )
            // InternalBSharp.g:4186:1: ( ( rule__Datatype__ConstructorsAssignment_3_1 ) )
            {
            // InternalBSharp.g:4186:1: ( ( rule__Datatype__ConstructorsAssignment_3_1 ) )
            // InternalBSharp.g:4187:2: ( rule__Datatype__ConstructorsAssignment_3_1 )
            {
             before(grammarAccess.getDatatypeAccess().getConstructorsAssignment_3_1()); 
            // InternalBSharp.g:4188:2: ( rule__Datatype__ConstructorsAssignment_3_1 )
            // InternalBSharp.g:4188:3: rule__Datatype__ConstructorsAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Datatype__ConstructorsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getDatatypeAccess().getConstructorsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Datatype__Group_3__1__Impl"


    // $ANTLR start "rule__DatatypeConstructor__Group__0"
    // InternalBSharp.g:4197:1: rule__DatatypeConstructor__Group__0 : rule__DatatypeConstructor__Group__0__Impl rule__DatatypeConstructor__Group__1 ;
    public final void rule__DatatypeConstructor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4201:1: ( rule__DatatypeConstructor__Group__0__Impl rule__DatatypeConstructor__Group__1 )
            // InternalBSharp.g:4202:2: rule__DatatypeConstructor__Group__0__Impl rule__DatatypeConstructor__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__DatatypeConstructor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DatatypeConstructor__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DatatypeConstructor__Group__0"


    // $ANTLR start "rule__DatatypeConstructor__Group__0__Impl"
    // InternalBSharp.g:4209:1: rule__DatatypeConstructor__Group__0__Impl : ( ( rule__DatatypeConstructor__NameAssignment_0 ) ) ;
    public final void rule__DatatypeConstructor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4213:1: ( ( ( rule__DatatypeConstructor__NameAssignment_0 ) ) )
            // InternalBSharp.g:4214:1: ( ( rule__DatatypeConstructor__NameAssignment_0 ) )
            {
            // InternalBSharp.g:4214:1: ( ( rule__DatatypeConstructor__NameAssignment_0 ) )
            // InternalBSharp.g:4215:2: ( rule__DatatypeConstructor__NameAssignment_0 )
            {
             before(grammarAccess.getDatatypeConstructorAccess().getNameAssignment_0()); 
            // InternalBSharp.g:4216:2: ( rule__DatatypeConstructor__NameAssignment_0 )
            // InternalBSharp.g:4216:3: rule__DatatypeConstructor__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__DatatypeConstructor__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDatatypeConstructorAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DatatypeConstructor__Group__0__Impl"


    // $ANTLR start "rule__DatatypeConstructor__Group__1"
    // InternalBSharp.g:4224:1: rule__DatatypeConstructor__Group__1 : rule__DatatypeConstructor__Group__1__Impl ;
    public final void rule__DatatypeConstructor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4228:1: ( rule__DatatypeConstructor__Group__1__Impl )
            // InternalBSharp.g:4229:2: rule__DatatypeConstructor__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DatatypeConstructor__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DatatypeConstructor__Group__1"


    // $ANTLR start "rule__DatatypeConstructor__Group__1__Impl"
    // InternalBSharp.g:4235:1: rule__DatatypeConstructor__Group__1__Impl : ( ( rule__DatatypeConstructor__Group_1__0 )? ) ;
    public final void rule__DatatypeConstructor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4239:1: ( ( ( rule__DatatypeConstructor__Group_1__0 )? ) )
            // InternalBSharp.g:4240:1: ( ( rule__DatatypeConstructor__Group_1__0 )? )
            {
            // InternalBSharp.g:4240:1: ( ( rule__DatatypeConstructor__Group_1__0 )? )
            // InternalBSharp.g:4241:2: ( rule__DatatypeConstructor__Group_1__0 )?
            {
             before(grammarAccess.getDatatypeConstructorAccess().getGroup_1()); 
            // InternalBSharp.g:4242:2: ( rule__DatatypeConstructor__Group_1__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==41) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalBSharp.g:4242:3: rule__DatatypeConstructor__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DatatypeConstructor__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDatatypeConstructorAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DatatypeConstructor__Group__1__Impl"


    // $ANTLR start "rule__DatatypeConstructor__Group_1__0"
    // InternalBSharp.g:4251:1: rule__DatatypeConstructor__Group_1__0 : rule__DatatypeConstructor__Group_1__0__Impl rule__DatatypeConstructor__Group_1__1 ;
    public final void rule__DatatypeConstructor__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4255:1: ( rule__DatatypeConstructor__Group_1__0__Impl rule__DatatypeConstructor__Group_1__1 )
            // InternalBSharp.g:4256:2: rule__DatatypeConstructor__Group_1__0__Impl rule__DatatypeConstructor__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__DatatypeConstructor__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DatatypeConstructor__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DatatypeConstructor__Group_1__0"


    // $ANTLR start "rule__DatatypeConstructor__Group_1__0__Impl"
    // InternalBSharp.g:4263:1: rule__DatatypeConstructor__Group_1__0__Impl : ( '(' ) ;
    public final void rule__DatatypeConstructor__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4267:1: ( ( '(' ) )
            // InternalBSharp.g:4268:1: ( '(' )
            {
            // InternalBSharp.g:4268:1: ( '(' )
            // InternalBSharp.g:4269:2: '('
            {
             before(grammarAccess.getDatatypeConstructorAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getDatatypeConstructorAccess().getLeftParenthesisKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DatatypeConstructor__Group_1__0__Impl"


    // $ANTLR start "rule__DatatypeConstructor__Group_1__1"
    // InternalBSharp.g:4278:1: rule__DatatypeConstructor__Group_1__1 : rule__DatatypeConstructor__Group_1__1__Impl rule__DatatypeConstructor__Group_1__2 ;
    public final void rule__DatatypeConstructor__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4282:1: ( rule__DatatypeConstructor__Group_1__1__Impl rule__DatatypeConstructor__Group_1__2 )
            // InternalBSharp.g:4283:2: rule__DatatypeConstructor__Group_1__1__Impl rule__DatatypeConstructor__Group_1__2
            {
            pushFollow(FOLLOW_18);
            rule__DatatypeConstructor__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DatatypeConstructor__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DatatypeConstructor__Group_1__1"


    // $ANTLR start "rule__DatatypeConstructor__Group_1__1__Impl"
    // InternalBSharp.g:4290:1: rule__DatatypeConstructor__Group_1__1__Impl : ( ( rule__DatatypeConstructor__DeconsAssignment_1_1 ) ) ;
    public final void rule__DatatypeConstructor__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4294:1: ( ( ( rule__DatatypeConstructor__DeconsAssignment_1_1 ) ) )
            // InternalBSharp.g:4295:1: ( ( rule__DatatypeConstructor__DeconsAssignment_1_1 ) )
            {
            // InternalBSharp.g:4295:1: ( ( rule__DatatypeConstructor__DeconsAssignment_1_1 ) )
            // InternalBSharp.g:4296:2: ( rule__DatatypeConstructor__DeconsAssignment_1_1 )
            {
             before(grammarAccess.getDatatypeConstructorAccess().getDeconsAssignment_1_1()); 
            // InternalBSharp.g:4297:2: ( rule__DatatypeConstructor__DeconsAssignment_1_1 )
            // InternalBSharp.g:4297:3: rule__DatatypeConstructor__DeconsAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__DatatypeConstructor__DeconsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getDatatypeConstructorAccess().getDeconsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DatatypeConstructor__Group_1__1__Impl"


    // $ANTLR start "rule__DatatypeConstructor__Group_1__2"
    // InternalBSharp.g:4305:1: rule__DatatypeConstructor__Group_1__2 : rule__DatatypeConstructor__Group_1__2__Impl ;
    public final void rule__DatatypeConstructor__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4309:1: ( rule__DatatypeConstructor__Group_1__2__Impl )
            // InternalBSharp.g:4310:2: rule__DatatypeConstructor__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DatatypeConstructor__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DatatypeConstructor__Group_1__2"


    // $ANTLR start "rule__DatatypeConstructor__Group_1__2__Impl"
    // InternalBSharp.g:4316:1: rule__DatatypeConstructor__Group_1__2__Impl : ( ')' ) ;
    public final void rule__DatatypeConstructor__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4320:1: ( ( ')' ) )
            // InternalBSharp.g:4321:1: ( ')' )
            {
            // InternalBSharp.g:4321:1: ( ')' )
            // InternalBSharp.g:4322:2: ')'
            {
             before(grammarAccess.getDatatypeConstructorAccess().getRightParenthesisKeyword_1_2()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getDatatypeConstructorAccess().getRightParenthesisKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DatatypeConstructor__Group_1__2__Impl"


    // $ANTLR start "rule__Extend__Group__0"
    // InternalBSharp.g:4332:1: rule__Extend__Group__0 : rule__Extend__Group__0__Impl rule__Extend__Group__1 ;
    public final void rule__Extend__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4336:1: ( rule__Extend__Group__0__Impl rule__Extend__Group__1 )
            // InternalBSharp.g:4337:2: rule__Extend__Group__0__Impl rule__Extend__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Extend__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Extend__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extend__Group__0"


    // $ANTLR start "rule__Extend__Group__0__Impl"
    // InternalBSharp.g:4344:1: rule__Extend__Group__0__Impl : ( 'Extend' ) ;
    public final void rule__Extend__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4348:1: ( ( 'Extend' ) )
            // InternalBSharp.g:4349:1: ( 'Extend' )
            {
            // InternalBSharp.g:4349:1: ( 'Extend' )
            // InternalBSharp.g:4350:2: 'Extend'
            {
             before(grammarAccess.getExtendAccess().getExtendKeyword_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getExtendAccess().getExtendKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extend__Group__0__Impl"


    // $ANTLR start "rule__Extend__Group__1"
    // InternalBSharp.g:4359:1: rule__Extend__Group__1 : rule__Extend__Group__1__Impl rule__Extend__Group__2 ;
    public final void rule__Extend__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4363:1: ( rule__Extend__Group__1__Impl rule__Extend__Group__2 )
            // InternalBSharp.g:4364:2: rule__Extend__Group__1__Impl rule__Extend__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__Extend__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Extend__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extend__Group__1"


    // $ANTLR start "rule__Extend__Group__1__Impl"
    // InternalBSharp.g:4371:1: rule__Extend__Group__1__Impl : ( ( rule__Extend__ExtendedClassAssignment_1 ) ) ;
    public final void rule__Extend__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4375:1: ( ( ( rule__Extend__ExtendedClassAssignment_1 ) ) )
            // InternalBSharp.g:4376:1: ( ( rule__Extend__ExtendedClassAssignment_1 ) )
            {
            // InternalBSharp.g:4376:1: ( ( rule__Extend__ExtendedClassAssignment_1 ) )
            // InternalBSharp.g:4377:2: ( rule__Extend__ExtendedClassAssignment_1 )
            {
             before(grammarAccess.getExtendAccess().getExtendedClassAssignment_1()); 
            // InternalBSharp.g:4378:2: ( rule__Extend__ExtendedClassAssignment_1 )
            // InternalBSharp.g:4378:3: rule__Extend__ExtendedClassAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Extend__ExtendedClassAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getExtendAccess().getExtendedClassAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extend__Group__1__Impl"


    // $ANTLR start "rule__Extend__Group__2"
    // InternalBSharp.g:4386:1: rule__Extend__Group__2 : rule__Extend__Group__2__Impl rule__Extend__Group__3 ;
    public final void rule__Extend__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4390:1: ( rule__Extend__Group__2__Impl rule__Extend__Group__3 )
            // InternalBSharp.g:4391:2: rule__Extend__Group__2__Impl rule__Extend__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Extend__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Extend__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extend__Group__2"


    // $ANTLR start "rule__Extend__Group__2__Impl"
    // InternalBSharp.g:4398:1: rule__Extend__Group__2__Impl : ( '(' ) ;
    public final void rule__Extend__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4402:1: ( ( '(' ) )
            // InternalBSharp.g:4403:1: ( '(' )
            {
            // InternalBSharp.g:4403:1: ( '(' )
            // InternalBSharp.g:4404:2: '('
            {
             before(grammarAccess.getExtendAccess().getLeftParenthesisKeyword_2()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getExtendAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extend__Group__2__Impl"


    // $ANTLR start "rule__Extend__Group__3"
    // InternalBSharp.g:4413:1: rule__Extend__Group__3 : rule__Extend__Group__3__Impl rule__Extend__Group__4 ;
    public final void rule__Extend__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4417:1: ( rule__Extend__Group__3__Impl rule__Extend__Group__4 )
            // InternalBSharp.g:4418:2: rule__Extend__Group__3__Impl rule__Extend__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__Extend__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Extend__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extend__Group__3"


    // $ANTLR start "rule__Extend__Group__3__Impl"
    // InternalBSharp.g:4425:1: rule__Extend__Group__3__Impl : ( ( rule__Extend__NameAssignment_3 ) ) ;
    public final void rule__Extend__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4429:1: ( ( ( rule__Extend__NameAssignment_3 ) ) )
            // InternalBSharp.g:4430:1: ( ( rule__Extend__NameAssignment_3 ) )
            {
            // InternalBSharp.g:4430:1: ( ( rule__Extend__NameAssignment_3 ) )
            // InternalBSharp.g:4431:2: ( rule__Extend__NameAssignment_3 )
            {
             before(grammarAccess.getExtendAccess().getNameAssignment_3()); 
            // InternalBSharp.g:4432:2: ( rule__Extend__NameAssignment_3 )
            // InternalBSharp.g:4432:3: rule__Extend__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Extend__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getExtendAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extend__Group__3__Impl"


    // $ANTLR start "rule__Extend__Group__4"
    // InternalBSharp.g:4440:1: rule__Extend__Group__4 : rule__Extend__Group__4__Impl rule__Extend__Group__5 ;
    public final void rule__Extend__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4444:1: ( rule__Extend__Group__4__Impl rule__Extend__Group__5 )
            // InternalBSharp.g:4445:2: rule__Extend__Group__4__Impl rule__Extend__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__Extend__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Extend__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extend__Group__4"


    // $ANTLR start "rule__Extend__Group__4__Impl"
    // InternalBSharp.g:4452:1: rule__Extend__Group__4__Impl : ( ')' ) ;
    public final void rule__Extend__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4456:1: ( ( ')' ) )
            // InternalBSharp.g:4457:1: ( ')' )
            {
            // InternalBSharp.g:4457:1: ( ')' )
            // InternalBSharp.g:4458:2: ')'
            {
             before(grammarAccess.getExtendAccess().getRightParenthesisKeyword_4()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getExtendAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extend__Group__4__Impl"


    // $ANTLR start "rule__Extend__Group__5"
    // InternalBSharp.g:4467:1: rule__Extend__Group__5 : rule__Extend__Group__5__Impl ;
    public final void rule__Extend__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4471:1: ( rule__Extend__Group__5__Impl )
            // InternalBSharp.g:4472:2: rule__Extend__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Extend__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extend__Group__5"


    // $ANTLR start "rule__Extend__Group__5__Impl"
    // InternalBSharp.g:4478:1: rule__Extend__Group__5__Impl : ( ( rule__Extend__BlockAssignment_5 ) ) ;
    public final void rule__Extend__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4482:1: ( ( ( rule__Extend__BlockAssignment_5 ) ) )
            // InternalBSharp.g:4483:1: ( ( rule__Extend__BlockAssignment_5 ) )
            {
            // InternalBSharp.g:4483:1: ( ( rule__Extend__BlockAssignment_5 ) )
            // InternalBSharp.g:4484:2: ( rule__Extend__BlockAssignment_5 )
            {
             before(grammarAccess.getExtendAccess().getBlockAssignment_5()); 
            // InternalBSharp.g:4485:2: ( rule__Extend__BlockAssignment_5 )
            // InternalBSharp.g:4485:3: rule__Extend__BlockAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Extend__BlockAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getExtendAccess().getBlockAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extend__Group__5__Impl"


    // $ANTLR start "rule__BSharpBlock__Group__0"
    // InternalBSharp.g:4494:1: rule__BSharpBlock__Group__0 : rule__BSharpBlock__Group__0__Impl rule__BSharpBlock__Group__1 ;
    public final void rule__BSharpBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4498:1: ( rule__BSharpBlock__Group__0__Impl rule__BSharpBlock__Group__1 )
            // InternalBSharp.g:4499:2: rule__BSharpBlock__Group__0__Impl rule__BSharpBlock__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__BSharpBlock__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BSharpBlock__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSharpBlock__Group__0"


    // $ANTLR start "rule__BSharpBlock__Group__0__Impl"
    // InternalBSharp.g:4506:1: rule__BSharpBlock__Group__0__Impl : ( () ) ;
    public final void rule__BSharpBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4510:1: ( ( () ) )
            // InternalBSharp.g:4511:1: ( () )
            {
            // InternalBSharp.g:4511:1: ( () )
            // InternalBSharp.g:4512:2: ()
            {
             before(grammarAccess.getBSharpBlockAccess().getBSharpBlockAction_0()); 
            // InternalBSharp.g:4513:2: ()
            // InternalBSharp.g:4513:3: 
            {
            }

             after(grammarAccess.getBSharpBlockAccess().getBSharpBlockAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSharpBlock__Group__0__Impl"


    // $ANTLR start "rule__BSharpBlock__Group__1"
    // InternalBSharp.g:4521:1: rule__BSharpBlock__Group__1 : rule__BSharpBlock__Group__1__Impl rule__BSharpBlock__Group__2 ;
    public final void rule__BSharpBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4525:1: ( rule__BSharpBlock__Group__1__Impl rule__BSharpBlock__Group__2 )
            // InternalBSharp.g:4526:2: rule__BSharpBlock__Group__1__Impl rule__BSharpBlock__Group__2
            {
            pushFollow(FOLLOW_33);
            rule__BSharpBlock__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BSharpBlock__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSharpBlock__Group__1"


    // $ANTLR start "rule__BSharpBlock__Group__1__Impl"
    // InternalBSharp.g:4533:1: rule__BSharpBlock__Group__1__Impl : ( '{' ) ;
    public final void rule__BSharpBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4537:1: ( ( '{' ) )
            // InternalBSharp.g:4538:1: ( '{' )
            {
            // InternalBSharp.g:4538:1: ( '{' )
            // InternalBSharp.g:4539:2: '{'
            {
             before(grammarAccess.getBSharpBlockAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getBSharpBlockAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSharpBlock__Group__1__Impl"


    // $ANTLR start "rule__BSharpBlock__Group__2"
    // InternalBSharp.g:4548:1: rule__BSharpBlock__Group__2 : rule__BSharpBlock__Group__2__Impl rule__BSharpBlock__Group__3 ;
    public final void rule__BSharpBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4552:1: ( rule__BSharpBlock__Group__2__Impl rule__BSharpBlock__Group__3 )
            // InternalBSharp.g:4553:2: rule__BSharpBlock__Group__2__Impl rule__BSharpBlock__Group__3
            {
            pushFollow(FOLLOW_33);
            rule__BSharpBlock__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BSharpBlock__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSharpBlock__Group__2"


    // $ANTLR start "rule__BSharpBlock__Group__2__Impl"
    // InternalBSharp.g:4560:1: rule__BSharpBlock__Group__2__Impl : ( ( rule__BSharpBlock__Alternatives_2 )* ) ;
    public final void rule__BSharpBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4564:1: ( ( ( rule__BSharpBlock__Alternatives_2 )* ) )
            // InternalBSharp.g:4565:1: ( ( rule__BSharpBlock__Alternatives_2 )* )
            {
            // InternalBSharp.g:4565:1: ( ( rule__BSharpBlock__Alternatives_2 )* )
            // InternalBSharp.g:4566:2: ( rule__BSharpBlock__Alternatives_2 )*
            {
             before(grammarAccess.getBSharpBlockAccess().getAlternatives_2()); 
            // InternalBSharp.g:4567:2: ( rule__BSharpBlock__Alternatives_2 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==RULE_ID||LA42_0==54||LA42_0==58) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalBSharp.g:4567:3: rule__BSharpBlock__Alternatives_2
            	    {
            	    pushFollow(FOLLOW_34);
            	    rule__BSharpBlock__Alternatives_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

             after(grammarAccess.getBSharpBlockAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSharpBlock__Group__2__Impl"


    // $ANTLR start "rule__BSharpBlock__Group__3"
    // InternalBSharp.g:4575:1: rule__BSharpBlock__Group__3 : rule__BSharpBlock__Group__3__Impl ;
    public final void rule__BSharpBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4579:1: ( rule__BSharpBlock__Group__3__Impl )
            // InternalBSharp.g:4580:2: rule__BSharpBlock__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BSharpBlock__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSharpBlock__Group__3"


    // $ANTLR start "rule__BSharpBlock__Group__3__Impl"
    // InternalBSharp.g:4586:1: rule__BSharpBlock__Group__3__Impl : ( '}' ) ;
    public final void rule__BSharpBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4590:1: ( ( '}' ) )
            // InternalBSharp.g:4591:1: ( '}' )
            {
            // InternalBSharp.g:4591:1: ( '}' )
            // InternalBSharp.g:4592:2: '}'
            {
             before(grammarAccess.getBSharpBlockAccess().getRightCurlyBracketKeyword_3()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getBSharpBlockAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSharpBlock__Group__3__Impl"


    // $ANTLR start "rule__FunctionDecl__Group__0"
    // InternalBSharp.g:4602:1: rule__FunctionDecl__Group__0 : rule__FunctionDecl__Group__0__Impl rule__FunctionDecl__Group__1 ;
    public final void rule__FunctionDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4606:1: ( rule__FunctionDecl__Group__0__Impl rule__FunctionDecl__Group__1 )
            // InternalBSharp.g:4607:2: rule__FunctionDecl__Group__0__Impl rule__FunctionDecl__Group__1
            {
            pushFollow(FOLLOW_35);
            rule__FunctionDecl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionDecl__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDecl__Group__0"


    // $ANTLR start "rule__FunctionDecl__Group__0__Impl"
    // InternalBSharp.g:4614:1: rule__FunctionDecl__Group__0__Impl : ( ( rule__FunctionDecl__NameAssignment_0 ) ) ;
    public final void rule__FunctionDecl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4618:1: ( ( ( rule__FunctionDecl__NameAssignment_0 ) ) )
            // InternalBSharp.g:4619:1: ( ( rule__FunctionDecl__NameAssignment_0 ) )
            {
            // InternalBSharp.g:4619:1: ( ( rule__FunctionDecl__NameAssignment_0 ) )
            // InternalBSharp.g:4620:2: ( rule__FunctionDecl__NameAssignment_0 )
            {
             before(grammarAccess.getFunctionDeclAccess().getNameAssignment_0()); 
            // InternalBSharp.g:4621:2: ( rule__FunctionDecl__NameAssignment_0 )
            // InternalBSharp.g:4621:3: rule__FunctionDecl__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__FunctionDecl__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionDeclAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDecl__Group__0__Impl"


    // $ANTLR start "rule__FunctionDecl__Group__1"
    // InternalBSharp.g:4629:1: rule__FunctionDecl__Group__1 : rule__FunctionDecl__Group__1__Impl rule__FunctionDecl__Group__2 ;
    public final void rule__FunctionDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4633:1: ( rule__FunctionDecl__Group__1__Impl rule__FunctionDecl__Group__2 )
            // InternalBSharp.g:4634:2: rule__FunctionDecl__Group__1__Impl rule__FunctionDecl__Group__2
            {
            pushFollow(FOLLOW_35);
            rule__FunctionDecl__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionDecl__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDecl__Group__1"


    // $ANTLR start "rule__FunctionDecl__Group__1__Impl"
    // InternalBSharp.g:4641:1: rule__FunctionDecl__Group__1__Impl : ( ( rule__FunctionDecl__ContextAssignment_1 )? ) ;
    public final void rule__FunctionDecl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4645:1: ( ( ( rule__FunctionDecl__ContextAssignment_1 )? ) )
            // InternalBSharp.g:4646:1: ( ( rule__FunctionDecl__ContextAssignment_1 )? )
            {
            // InternalBSharp.g:4646:1: ( ( rule__FunctionDecl__ContextAssignment_1 )? )
            // InternalBSharp.g:4647:2: ( rule__FunctionDecl__ContextAssignment_1 )?
            {
             before(grammarAccess.getFunctionDeclAccess().getContextAssignment_1()); 
            // InternalBSharp.g:4648:2: ( rule__FunctionDecl__ContextAssignment_1 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==43) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalBSharp.g:4648:3: rule__FunctionDecl__ContextAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__FunctionDecl__ContextAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFunctionDeclAccess().getContextAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDecl__Group__1__Impl"


    // $ANTLR start "rule__FunctionDecl__Group__2"
    // InternalBSharp.g:4656:1: rule__FunctionDecl__Group__2 : rule__FunctionDecl__Group__2__Impl rule__FunctionDecl__Group__3 ;
    public final void rule__FunctionDecl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4660:1: ( rule__FunctionDecl__Group__2__Impl rule__FunctionDecl__Group__3 )
            // InternalBSharp.g:4661:2: rule__FunctionDecl__Group__2__Impl rule__FunctionDecl__Group__3
            {
            pushFollow(FOLLOW_36);
            rule__FunctionDecl__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionDecl__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDecl__Group__2"


    // $ANTLR start "rule__FunctionDecl__Group__2__Impl"
    // InternalBSharp.g:4668:1: rule__FunctionDecl__Group__2__Impl : ( '(' ) ;
    public final void rule__FunctionDecl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4672:1: ( ( '(' ) )
            // InternalBSharp.g:4673:1: ( '(' )
            {
            // InternalBSharp.g:4673:1: ( '(' )
            // InternalBSharp.g:4674:2: '('
            {
             before(grammarAccess.getFunctionDeclAccess().getLeftParenthesisKeyword_2()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getFunctionDeclAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDecl__Group__2__Impl"


    // $ANTLR start "rule__FunctionDecl__Group__3"
    // InternalBSharp.g:4683:1: rule__FunctionDecl__Group__3 : rule__FunctionDecl__Group__3__Impl rule__FunctionDecl__Group__4 ;
    public final void rule__FunctionDecl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4687:1: ( rule__FunctionDecl__Group__3__Impl rule__FunctionDecl__Group__4 )
            // InternalBSharp.g:4688:2: rule__FunctionDecl__Group__3__Impl rule__FunctionDecl__Group__4
            {
            pushFollow(FOLLOW_36);
            rule__FunctionDecl__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionDecl__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDecl__Group__3"


    // $ANTLR start "rule__FunctionDecl__Group__3__Impl"
    // InternalBSharp.g:4695:1: rule__FunctionDecl__Group__3__Impl : ( ( rule__FunctionDecl__VarListAssignment_3 )? ) ;
    public final void rule__FunctionDecl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4699:1: ( ( ( rule__FunctionDecl__VarListAssignment_3 )? ) )
            // InternalBSharp.g:4700:1: ( ( rule__FunctionDecl__VarListAssignment_3 )? )
            {
            // InternalBSharp.g:4700:1: ( ( rule__FunctionDecl__VarListAssignment_3 )? )
            // InternalBSharp.g:4701:2: ( rule__FunctionDecl__VarListAssignment_3 )?
            {
             before(grammarAccess.getFunctionDeclAccess().getVarListAssignment_3()); 
            // InternalBSharp.g:4702:2: ( rule__FunctionDecl__VarListAssignment_3 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_ID) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalBSharp.g:4702:3: rule__FunctionDecl__VarListAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__FunctionDecl__VarListAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFunctionDeclAccess().getVarListAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDecl__Group__3__Impl"


    // $ANTLR start "rule__FunctionDecl__Group__4"
    // InternalBSharp.g:4710:1: rule__FunctionDecl__Group__4 : rule__FunctionDecl__Group__4__Impl rule__FunctionDecl__Group__5 ;
    public final void rule__FunctionDecl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4714:1: ( rule__FunctionDecl__Group__4__Impl rule__FunctionDecl__Group__5 )
            // InternalBSharp.g:4715:2: rule__FunctionDecl__Group__4__Impl rule__FunctionDecl__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__FunctionDecl__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionDecl__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDecl__Group__4"


    // $ANTLR start "rule__FunctionDecl__Group__4__Impl"
    // InternalBSharp.g:4722:1: rule__FunctionDecl__Group__4__Impl : ( ')' ) ;
    public final void rule__FunctionDecl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4726:1: ( ( ')' ) )
            // InternalBSharp.g:4727:1: ( ')' )
            {
            // InternalBSharp.g:4727:1: ( ')' )
            // InternalBSharp.g:4728:2: ')'
            {
             before(grammarAccess.getFunctionDeclAccess().getRightParenthesisKeyword_4()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getFunctionDeclAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDecl__Group__4__Impl"


    // $ANTLR start "rule__FunctionDecl__Group__5"
    // InternalBSharp.g:4737:1: rule__FunctionDecl__Group__5 : rule__FunctionDecl__Group__5__Impl rule__FunctionDecl__Group__6 ;
    public final void rule__FunctionDecl__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4741:1: ( rule__FunctionDecl__Group__5__Impl rule__FunctionDecl__Group__6 )
            // InternalBSharp.g:4742:2: rule__FunctionDecl__Group__5__Impl rule__FunctionDecl__Group__6
            {
            pushFollow(FOLLOW_3);
            rule__FunctionDecl__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionDecl__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDecl__Group__5"


    // $ANTLR start "rule__FunctionDecl__Group__5__Impl"
    // InternalBSharp.g:4749:1: rule__FunctionDecl__Group__5__Impl : ( ':' ) ;
    public final void rule__FunctionDecl__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4753:1: ( ( ':' ) )
            // InternalBSharp.g:4754:1: ( ':' )
            {
            // InternalBSharp.g:4754:1: ( ':' )
            // InternalBSharp.g:4755:2: ':'
            {
             before(grammarAccess.getFunctionDeclAccess().getColonKeyword_5()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getFunctionDeclAccess().getColonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDecl__Group__5__Impl"


    // $ANTLR start "rule__FunctionDecl__Group__6"
    // InternalBSharp.g:4764:1: rule__FunctionDecl__Group__6 : rule__FunctionDecl__Group__6__Impl rule__FunctionDecl__Group__7 ;
    public final void rule__FunctionDecl__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4768:1: ( rule__FunctionDecl__Group__6__Impl rule__FunctionDecl__Group__7 )
            // InternalBSharp.g:4769:2: rule__FunctionDecl__Group__6__Impl rule__FunctionDecl__Group__7
            {
            pushFollow(FOLLOW_37);
            rule__FunctionDecl__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionDecl__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDecl__Group__6"


    // $ANTLR start "rule__FunctionDecl__Group__6__Impl"
    // InternalBSharp.g:4776:1: rule__FunctionDecl__Group__6__Impl : ( ( rule__FunctionDecl__ReturnTypeAssignment_6 ) ) ;
    public final void rule__FunctionDecl__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4780:1: ( ( ( rule__FunctionDecl__ReturnTypeAssignment_6 ) ) )
            // InternalBSharp.g:4781:1: ( ( rule__FunctionDecl__ReturnTypeAssignment_6 ) )
            {
            // InternalBSharp.g:4781:1: ( ( rule__FunctionDecl__ReturnTypeAssignment_6 ) )
            // InternalBSharp.g:4782:2: ( rule__FunctionDecl__ReturnTypeAssignment_6 )
            {
             before(grammarAccess.getFunctionDeclAccess().getReturnTypeAssignment_6()); 
            // InternalBSharp.g:4783:2: ( rule__FunctionDecl__ReturnTypeAssignment_6 )
            // InternalBSharp.g:4783:3: rule__FunctionDecl__ReturnTypeAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__FunctionDecl__ReturnTypeAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getFunctionDeclAccess().getReturnTypeAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDecl__Group__6__Impl"


    // $ANTLR start "rule__FunctionDecl__Group__7"
    // InternalBSharp.g:4791:1: rule__FunctionDecl__Group__7 : rule__FunctionDecl__Group__7__Impl rule__FunctionDecl__Group__8 ;
    public final void rule__FunctionDecl__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4795:1: ( rule__FunctionDecl__Group__7__Impl rule__FunctionDecl__Group__8 )
            // InternalBSharp.g:4796:2: rule__FunctionDecl__Group__7__Impl rule__FunctionDecl__Group__8
            {
            pushFollow(FOLLOW_37);
            rule__FunctionDecl__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionDecl__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDecl__Group__7"


    // $ANTLR start "rule__FunctionDecl__Group__7__Impl"
    // InternalBSharp.g:4803:1: rule__FunctionDecl__Group__7__Impl : ( ( rule__FunctionDecl__InfixAssignment_7 )? ) ;
    public final void rule__FunctionDecl__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4807:1: ( ( ( rule__FunctionDecl__InfixAssignment_7 )? ) )
            // InternalBSharp.g:4808:1: ( ( rule__FunctionDecl__InfixAssignment_7 )? )
            {
            // InternalBSharp.g:4808:1: ( ( rule__FunctionDecl__InfixAssignment_7 )? )
            // InternalBSharp.g:4809:2: ( rule__FunctionDecl__InfixAssignment_7 )?
            {
             before(grammarAccess.getFunctionDeclAccess().getInfixAssignment_7()); 
            // InternalBSharp.g:4810:2: ( rule__FunctionDecl__InfixAssignment_7 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==59) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalBSharp.g:4810:3: rule__FunctionDecl__InfixAssignment_7
                    {
                    pushFollow(FOLLOW_2);
                    rule__FunctionDecl__InfixAssignment_7();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFunctionDeclAccess().getInfixAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDecl__Group__7__Impl"


    // $ANTLR start "rule__FunctionDecl__Group__8"
    // InternalBSharp.g:4818:1: rule__FunctionDecl__Group__8 : rule__FunctionDecl__Group__8__Impl rule__FunctionDecl__Group__9 ;
    public final void rule__FunctionDecl__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4822:1: ( rule__FunctionDecl__Group__8__Impl rule__FunctionDecl__Group__9 )
            // InternalBSharp.g:4823:2: rule__FunctionDecl__Group__8__Impl rule__FunctionDecl__Group__9
            {
            pushFollow(FOLLOW_37);
            rule__FunctionDecl__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionDecl__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDecl__Group__8"


    // $ANTLR start "rule__FunctionDecl__Group__8__Impl"
    // InternalBSharp.g:4830:1: rule__FunctionDecl__Group__8__Impl : ( ( rule__FunctionDecl__PrecedenceAssignment_8 )? ) ;
    public final void rule__FunctionDecl__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4834:1: ( ( ( rule__FunctionDecl__PrecedenceAssignment_8 )? ) )
            // InternalBSharp.g:4835:1: ( ( rule__FunctionDecl__PrecedenceAssignment_8 )? )
            {
            // InternalBSharp.g:4835:1: ( ( rule__FunctionDecl__PrecedenceAssignment_8 )? )
            // InternalBSharp.g:4836:2: ( rule__FunctionDecl__PrecedenceAssignment_8 )?
            {
             before(grammarAccess.getFunctionDeclAccess().getPrecedenceAssignment_8()); 
            // InternalBSharp.g:4837:2: ( rule__FunctionDecl__PrecedenceAssignment_8 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==RULE_INT) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalBSharp.g:4837:3: rule__FunctionDecl__PrecedenceAssignment_8
                    {
                    pushFollow(FOLLOW_2);
                    rule__FunctionDecl__PrecedenceAssignment_8();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFunctionDeclAccess().getPrecedenceAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDecl__Group__8__Impl"


    // $ANTLR start "rule__FunctionDecl__Group__9"
    // InternalBSharp.g:4845:1: rule__FunctionDecl__Group__9 : rule__FunctionDecl__Group__9__Impl ;
    public final void rule__FunctionDecl__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4849:1: ( rule__FunctionDecl__Group__9__Impl )
            // InternalBSharp.g:4850:2: rule__FunctionDecl__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FunctionDecl__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDecl__Group__9"


    // $ANTLR start "rule__FunctionDecl__Group__9__Impl"
    // InternalBSharp.g:4856:1: rule__FunctionDecl__Group__9__Impl : ( ( rule__FunctionDecl__ExprAssignment_9 ) ) ;
    public final void rule__FunctionDecl__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4860:1: ( ( ( rule__FunctionDecl__ExprAssignment_9 ) ) )
            // InternalBSharp.g:4861:1: ( ( rule__FunctionDecl__ExprAssignment_9 ) )
            {
            // InternalBSharp.g:4861:1: ( ( rule__FunctionDecl__ExprAssignment_9 ) )
            // InternalBSharp.g:4862:2: ( rule__FunctionDecl__ExprAssignment_9 )
            {
             before(grammarAccess.getFunctionDeclAccess().getExprAssignment_9()); 
            // InternalBSharp.g:4863:2: ( rule__FunctionDecl__ExprAssignment_9 )
            // InternalBSharp.g:4863:3: rule__FunctionDecl__ExprAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__FunctionDecl__ExprAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getFunctionDeclAccess().getExprAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDecl__Group__9__Impl"


    // $ANTLR start "rule__MatchStatement__Group__0"
    // InternalBSharp.g:4872:1: rule__MatchStatement__Group__0 : rule__MatchStatement__Group__0__Impl rule__MatchStatement__Group__1 ;
    public final void rule__MatchStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4876:1: ( rule__MatchStatement__Group__0__Impl rule__MatchStatement__Group__1 )
            // InternalBSharp.g:4877:2: rule__MatchStatement__Group__0__Impl rule__MatchStatement__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__MatchStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MatchStatement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchStatement__Group__0"


    // $ANTLR start "rule__MatchStatement__Group__0__Impl"
    // InternalBSharp.g:4884:1: rule__MatchStatement__Group__0__Impl : ( 'match' ) ;
    public final void rule__MatchStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4888:1: ( ( 'match' ) )
            // InternalBSharp.g:4889:1: ( 'match' )
            {
            // InternalBSharp.g:4889:1: ( 'match' )
            // InternalBSharp.g:4890:2: 'match'
            {
             before(grammarAccess.getMatchStatementAccess().getMatchKeyword_0()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getMatchStatementAccess().getMatchKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchStatement__Group__0__Impl"


    // $ANTLR start "rule__MatchStatement__Group__1"
    // InternalBSharp.g:4899:1: rule__MatchStatement__Group__1 : rule__MatchStatement__Group__1__Impl rule__MatchStatement__Group__2 ;
    public final void rule__MatchStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4903:1: ( rule__MatchStatement__Group__1__Impl rule__MatchStatement__Group__2 )
            // InternalBSharp.g:4904:2: rule__MatchStatement__Group__1__Impl rule__MatchStatement__Group__2
            {
            pushFollow(FOLLOW_38);
            rule__MatchStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MatchStatement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchStatement__Group__1"


    // $ANTLR start "rule__MatchStatement__Group__1__Impl"
    // InternalBSharp.g:4911:1: rule__MatchStatement__Group__1__Impl : ( ( rule__MatchStatement__MatchAssignment_1 ) ) ;
    public final void rule__MatchStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4915:1: ( ( ( rule__MatchStatement__MatchAssignment_1 ) ) )
            // InternalBSharp.g:4916:1: ( ( rule__MatchStatement__MatchAssignment_1 ) )
            {
            // InternalBSharp.g:4916:1: ( ( rule__MatchStatement__MatchAssignment_1 ) )
            // InternalBSharp.g:4917:2: ( rule__MatchStatement__MatchAssignment_1 )
            {
             before(grammarAccess.getMatchStatementAccess().getMatchAssignment_1()); 
            // InternalBSharp.g:4918:2: ( rule__MatchStatement__MatchAssignment_1 )
            // InternalBSharp.g:4918:3: rule__MatchStatement__MatchAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MatchStatement__MatchAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMatchStatementAccess().getMatchAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchStatement__Group__1__Impl"


    // $ANTLR start "rule__MatchStatement__Group__2"
    // InternalBSharp.g:4926:1: rule__MatchStatement__Group__2 : rule__MatchStatement__Group__2__Impl rule__MatchStatement__Group__3 ;
    public final void rule__MatchStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4930:1: ( rule__MatchStatement__Group__2__Impl rule__MatchStatement__Group__3 )
            // InternalBSharp.g:4931:2: rule__MatchStatement__Group__2__Impl rule__MatchStatement__Group__3
            {
            pushFollow(FOLLOW_39);
            rule__MatchStatement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MatchStatement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchStatement__Group__2"


    // $ANTLR start "rule__MatchStatement__Group__2__Impl"
    // InternalBSharp.g:4938:1: rule__MatchStatement__Group__2__Impl : ( '{' ) ;
    public final void rule__MatchStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4942:1: ( ( '{' ) )
            // InternalBSharp.g:4943:1: ( '{' )
            {
            // InternalBSharp.g:4943:1: ( '{' )
            // InternalBSharp.g:4944:2: '{'
            {
             before(grammarAccess.getMatchStatementAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getMatchStatementAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchStatement__Group__2__Impl"


    // $ANTLR start "rule__MatchStatement__Group__3"
    // InternalBSharp.g:4953:1: rule__MatchStatement__Group__3 : rule__MatchStatement__Group__3__Impl rule__MatchStatement__Group__4 ;
    public final void rule__MatchStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4957:1: ( rule__MatchStatement__Group__3__Impl rule__MatchStatement__Group__4 )
            // InternalBSharp.g:4958:2: rule__MatchStatement__Group__3__Impl rule__MatchStatement__Group__4
            {
            pushFollow(FOLLOW_40);
            rule__MatchStatement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MatchStatement__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchStatement__Group__3"


    // $ANTLR start "rule__MatchStatement__Group__3__Impl"
    // InternalBSharp.g:4965:1: rule__MatchStatement__Group__3__Impl : ( ( rule__MatchStatement__InductCaseAssignment_3 ) ) ;
    public final void rule__MatchStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4969:1: ( ( ( rule__MatchStatement__InductCaseAssignment_3 ) ) )
            // InternalBSharp.g:4970:1: ( ( rule__MatchStatement__InductCaseAssignment_3 ) )
            {
            // InternalBSharp.g:4970:1: ( ( rule__MatchStatement__InductCaseAssignment_3 ) )
            // InternalBSharp.g:4971:2: ( rule__MatchStatement__InductCaseAssignment_3 )
            {
             before(grammarAccess.getMatchStatementAccess().getInductCaseAssignment_3()); 
            // InternalBSharp.g:4972:2: ( rule__MatchStatement__InductCaseAssignment_3 )
            // InternalBSharp.g:4972:3: rule__MatchStatement__InductCaseAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__MatchStatement__InductCaseAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMatchStatementAccess().getInductCaseAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchStatement__Group__3__Impl"


    // $ANTLR start "rule__MatchStatement__Group__4"
    // InternalBSharp.g:4980:1: rule__MatchStatement__Group__4 : rule__MatchStatement__Group__4__Impl rule__MatchStatement__Group__5 ;
    public final void rule__MatchStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4984:1: ( rule__MatchStatement__Group__4__Impl rule__MatchStatement__Group__5 )
            // InternalBSharp.g:4985:2: rule__MatchStatement__Group__4__Impl rule__MatchStatement__Group__5
            {
            pushFollow(FOLLOW_40);
            rule__MatchStatement__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MatchStatement__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchStatement__Group__4"


    // $ANTLR start "rule__MatchStatement__Group__4__Impl"
    // InternalBSharp.g:4992:1: rule__MatchStatement__Group__4__Impl : ( ( rule__MatchStatement__InductCaseAssignment_4 )* ) ;
    public final void rule__MatchStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4996:1: ( ( ( rule__MatchStatement__InductCaseAssignment_4 )* ) )
            // InternalBSharp.g:4997:1: ( ( rule__MatchStatement__InductCaseAssignment_4 )* )
            {
            // InternalBSharp.g:4997:1: ( ( rule__MatchStatement__InductCaseAssignment_4 )* )
            // InternalBSharp.g:4998:2: ( rule__MatchStatement__InductCaseAssignment_4 )*
            {
             before(grammarAccess.getMatchStatementAccess().getInductCaseAssignment_4()); 
            // InternalBSharp.g:4999:2: ( rule__MatchStatement__InductCaseAssignment_4 )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==49) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalBSharp.g:4999:3: rule__MatchStatement__InductCaseAssignment_4
            	    {
            	    pushFollow(FOLLOW_41);
            	    rule__MatchStatement__InductCaseAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

             after(grammarAccess.getMatchStatementAccess().getInductCaseAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchStatement__Group__4__Impl"


    // $ANTLR start "rule__MatchStatement__Group__5"
    // InternalBSharp.g:5007:1: rule__MatchStatement__Group__5 : rule__MatchStatement__Group__5__Impl ;
    public final void rule__MatchStatement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5011:1: ( rule__MatchStatement__Group__5__Impl )
            // InternalBSharp.g:5012:2: rule__MatchStatement__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MatchStatement__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchStatement__Group__5"


    // $ANTLR start "rule__MatchStatement__Group__5__Impl"
    // InternalBSharp.g:5018:1: rule__MatchStatement__Group__5__Impl : ( '}' ) ;
    public final void rule__MatchStatement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5022:1: ( ( '}' ) )
            // InternalBSharp.g:5023:1: ( '}' )
            {
            // InternalBSharp.g:5023:1: ( '}' )
            // InternalBSharp.g:5024:2: '}'
            {
             before(grammarAccess.getMatchStatementAccess().getRightCurlyBracketKeyword_5()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getMatchStatementAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchStatement__Group__5__Impl"


    // $ANTLR start "rule__MatchCase__Group__0"
    // InternalBSharp.g:5034:1: rule__MatchCase__Group__0 : rule__MatchCase__Group__0__Impl rule__MatchCase__Group__1 ;
    public final void rule__MatchCase__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5038:1: ( rule__MatchCase__Group__0__Impl rule__MatchCase__Group__1 )
            // InternalBSharp.g:5039:2: rule__MatchCase__Group__0__Impl rule__MatchCase__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__MatchCase__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MatchCase__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchCase__Group__0"


    // $ANTLR start "rule__MatchCase__Group__0__Impl"
    // InternalBSharp.g:5046:1: rule__MatchCase__Group__0__Impl : ( '|' ) ;
    public final void rule__MatchCase__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5050:1: ( ( '|' ) )
            // InternalBSharp.g:5051:1: ( '|' )
            {
            // InternalBSharp.g:5051:1: ( '|' )
            // InternalBSharp.g:5052:2: '|'
            {
             before(grammarAccess.getMatchCaseAccess().getVerticalLineKeyword_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getMatchCaseAccess().getVerticalLineKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchCase__Group__0__Impl"


    // $ANTLR start "rule__MatchCase__Group__1"
    // InternalBSharp.g:5061:1: rule__MatchCase__Group__1 : rule__MatchCase__Group__1__Impl rule__MatchCase__Group__2 ;
    public final void rule__MatchCase__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5065:1: ( rule__MatchCase__Group__1__Impl rule__MatchCase__Group__2 )
            // InternalBSharp.g:5066:2: rule__MatchCase__Group__1__Impl rule__MatchCase__Group__2
            {
            pushFollow(FOLLOW_42);
            rule__MatchCase__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MatchCase__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchCase__Group__1"


    // $ANTLR start "rule__MatchCase__Group__1__Impl"
    // InternalBSharp.g:5073:1: rule__MatchCase__Group__1__Impl : ( ( rule__MatchCase__DeconNameAssignment_1 ) ) ;
    public final void rule__MatchCase__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5077:1: ( ( ( rule__MatchCase__DeconNameAssignment_1 ) ) )
            // InternalBSharp.g:5078:1: ( ( rule__MatchCase__DeconNameAssignment_1 ) )
            {
            // InternalBSharp.g:5078:1: ( ( rule__MatchCase__DeconNameAssignment_1 ) )
            // InternalBSharp.g:5079:2: ( rule__MatchCase__DeconNameAssignment_1 )
            {
             before(grammarAccess.getMatchCaseAccess().getDeconNameAssignment_1()); 
            // InternalBSharp.g:5080:2: ( rule__MatchCase__DeconNameAssignment_1 )
            // InternalBSharp.g:5080:3: rule__MatchCase__DeconNameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MatchCase__DeconNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMatchCaseAccess().getDeconNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchCase__Group__1__Impl"


    // $ANTLR start "rule__MatchCase__Group__2"
    // InternalBSharp.g:5088:1: rule__MatchCase__Group__2 : rule__MatchCase__Group__2__Impl rule__MatchCase__Group__3 ;
    public final void rule__MatchCase__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5092:1: ( rule__MatchCase__Group__2__Impl rule__MatchCase__Group__3 )
            // InternalBSharp.g:5093:2: rule__MatchCase__Group__2__Impl rule__MatchCase__Group__3
            {
            pushFollow(FOLLOW_42);
            rule__MatchCase__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MatchCase__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchCase__Group__2"


    // $ANTLR start "rule__MatchCase__Group__2__Impl"
    // InternalBSharp.g:5100:1: rule__MatchCase__Group__2__Impl : ( ( rule__MatchCase__Group_2__0 )? ) ;
    public final void rule__MatchCase__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5104:1: ( ( ( rule__MatchCase__Group_2__0 )? ) )
            // InternalBSharp.g:5105:1: ( ( rule__MatchCase__Group_2__0 )? )
            {
            // InternalBSharp.g:5105:1: ( ( rule__MatchCase__Group_2__0 )? )
            // InternalBSharp.g:5106:2: ( rule__MatchCase__Group_2__0 )?
            {
             before(grammarAccess.getMatchCaseAccess().getGroup_2()); 
            // InternalBSharp.g:5107:2: ( rule__MatchCase__Group_2__0 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==41) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalBSharp.g:5107:3: rule__MatchCase__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MatchCase__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMatchCaseAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchCase__Group__2__Impl"


    // $ANTLR start "rule__MatchCase__Group__3"
    // InternalBSharp.g:5115:1: rule__MatchCase__Group__3 : rule__MatchCase__Group__3__Impl rule__MatchCase__Group__4 ;
    public final void rule__MatchCase__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5119:1: ( rule__MatchCase__Group__3__Impl rule__MatchCase__Group__4 )
            // InternalBSharp.g:5120:2: rule__MatchCase__Group__3__Impl rule__MatchCase__Group__4
            {
            pushFollow(FOLLOW_28);
            rule__MatchCase__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MatchCase__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchCase__Group__3"


    // $ANTLR start "rule__MatchCase__Group__3__Impl"
    // InternalBSharp.g:5127:1: rule__MatchCase__Group__3__Impl : ( ':' ) ;
    public final void rule__MatchCase__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5131:1: ( ( ':' ) )
            // InternalBSharp.g:5132:1: ( ':' )
            {
            // InternalBSharp.g:5132:1: ( ':' )
            // InternalBSharp.g:5133:2: ':'
            {
             before(grammarAccess.getMatchCaseAccess().getColonKeyword_3()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getMatchCaseAccess().getColonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchCase__Group__3__Impl"


    // $ANTLR start "rule__MatchCase__Group__4"
    // InternalBSharp.g:5142:1: rule__MatchCase__Group__4 : rule__MatchCase__Group__4__Impl ;
    public final void rule__MatchCase__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5146:1: ( rule__MatchCase__Group__4__Impl )
            // InternalBSharp.g:5147:2: rule__MatchCase__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MatchCase__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchCase__Group__4"


    // $ANTLR start "rule__MatchCase__Group__4__Impl"
    // InternalBSharp.g:5153:1: rule__MatchCase__Group__4__Impl : ( ( rule__MatchCase__ExprAssignment_4 ) ) ;
    public final void rule__MatchCase__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5157:1: ( ( ( rule__MatchCase__ExprAssignment_4 ) ) )
            // InternalBSharp.g:5158:1: ( ( rule__MatchCase__ExprAssignment_4 ) )
            {
            // InternalBSharp.g:5158:1: ( ( rule__MatchCase__ExprAssignment_4 ) )
            // InternalBSharp.g:5159:2: ( rule__MatchCase__ExprAssignment_4 )
            {
             before(grammarAccess.getMatchCaseAccess().getExprAssignment_4()); 
            // InternalBSharp.g:5160:2: ( rule__MatchCase__ExprAssignment_4 )
            // InternalBSharp.g:5160:3: rule__MatchCase__ExprAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__MatchCase__ExprAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getMatchCaseAccess().getExprAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchCase__Group__4__Impl"


    // $ANTLR start "rule__MatchCase__Group_2__0"
    // InternalBSharp.g:5169:1: rule__MatchCase__Group_2__0 : rule__MatchCase__Group_2__0__Impl rule__MatchCase__Group_2__1 ;
    public final void rule__MatchCase__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5173:1: ( rule__MatchCase__Group_2__0__Impl rule__MatchCase__Group_2__1 )
            // InternalBSharp.g:5174:2: rule__MatchCase__Group_2__0__Impl rule__MatchCase__Group_2__1
            {
            pushFollow(FOLLOW_3);
            rule__MatchCase__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MatchCase__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchCase__Group_2__0"


    // $ANTLR start "rule__MatchCase__Group_2__0__Impl"
    // InternalBSharp.g:5181:1: rule__MatchCase__Group_2__0__Impl : ( '(' ) ;
    public final void rule__MatchCase__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5185:1: ( ( '(' ) )
            // InternalBSharp.g:5186:1: ( '(' )
            {
            // InternalBSharp.g:5186:1: ( '(' )
            // InternalBSharp.g:5187:2: '('
            {
             before(grammarAccess.getMatchCaseAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getMatchCaseAccess().getLeftParenthesisKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchCase__Group_2__0__Impl"


    // $ANTLR start "rule__MatchCase__Group_2__1"
    // InternalBSharp.g:5196:1: rule__MatchCase__Group_2__1 : rule__MatchCase__Group_2__1__Impl rule__MatchCase__Group_2__2 ;
    public final void rule__MatchCase__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5200:1: ( rule__MatchCase__Group_2__1__Impl rule__MatchCase__Group_2__2 )
            // InternalBSharp.g:5201:2: rule__MatchCase__Group_2__1__Impl rule__MatchCase__Group_2__2
            {
            pushFollow(FOLLOW_43);
            rule__MatchCase__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MatchCase__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchCase__Group_2__1"


    // $ANTLR start "rule__MatchCase__Group_2__1__Impl"
    // InternalBSharp.g:5208:1: rule__MatchCase__Group_2__1__Impl : ( ( rule__MatchCase__VariablesAssignment_2_1 ) ) ;
    public final void rule__MatchCase__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5212:1: ( ( ( rule__MatchCase__VariablesAssignment_2_1 ) ) )
            // InternalBSharp.g:5213:1: ( ( rule__MatchCase__VariablesAssignment_2_1 ) )
            {
            // InternalBSharp.g:5213:1: ( ( rule__MatchCase__VariablesAssignment_2_1 ) )
            // InternalBSharp.g:5214:2: ( rule__MatchCase__VariablesAssignment_2_1 )
            {
             before(grammarAccess.getMatchCaseAccess().getVariablesAssignment_2_1()); 
            // InternalBSharp.g:5215:2: ( rule__MatchCase__VariablesAssignment_2_1 )
            // InternalBSharp.g:5215:3: rule__MatchCase__VariablesAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__MatchCase__VariablesAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getMatchCaseAccess().getVariablesAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchCase__Group_2__1__Impl"


    // $ANTLR start "rule__MatchCase__Group_2__2"
    // InternalBSharp.g:5223:1: rule__MatchCase__Group_2__2 : rule__MatchCase__Group_2__2__Impl rule__MatchCase__Group_2__3 ;
    public final void rule__MatchCase__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5227:1: ( rule__MatchCase__Group_2__2__Impl rule__MatchCase__Group_2__3 )
            // InternalBSharp.g:5228:2: rule__MatchCase__Group_2__2__Impl rule__MatchCase__Group_2__3
            {
            pushFollow(FOLLOW_43);
            rule__MatchCase__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MatchCase__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchCase__Group_2__2"


    // $ANTLR start "rule__MatchCase__Group_2__2__Impl"
    // InternalBSharp.g:5235:1: rule__MatchCase__Group_2__2__Impl : ( ( rule__MatchCase__Group_2_2__0 )* ) ;
    public final void rule__MatchCase__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5239:1: ( ( ( rule__MatchCase__Group_2_2__0 )* ) )
            // InternalBSharp.g:5240:1: ( ( rule__MatchCase__Group_2_2__0 )* )
            {
            // InternalBSharp.g:5240:1: ( ( rule__MatchCase__Group_2_2__0 )* )
            // InternalBSharp.g:5241:2: ( rule__MatchCase__Group_2_2__0 )*
            {
             before(grammarAccess.getMatchCaseAccess().getGroup_2_2()); 
            // InternalBSharp.g:5242:2: ( rule__MatchCase__Group_2_2__0 )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==45) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalBSharp.g:5242:3: rule__MatchCase__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__MatchCase__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);

             after(grammarAccess.getMatchCaseAccess().getGroup_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchCase__Group_2__2__Impl"


    // $ANTLR start "rule__MatchCase__Group_2__3"
    // InternalBSharp.g:5250:1: rule__MatchCase__Group_2__3 : rule__MatchCase__Group_2__3__Impl ;
    public final void rule__MatchCase__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5254:1: ( rule__MatchCase__Group_2__3__Impl )
            // InternalBSharp.g:5255:2: rule__MatchCase__Group_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MatchCase__Group_2__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchCase__Group_2__3"


    // $ANTLR start "rule__MatchCase__Group_2__3__Impl"
    // InternalBSharp.g:5261:1: rule__MatchCase__Group_2__3__Impl : ( ')' ) ;
    public final void rule__MatchCase__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5265:1: ( ( ')' ) )
            // InternalBSharp.g:5266:1: ( ')' )
            {
            // InternalBSharp.g:5266:1: ( ')' )
            // InternalBSharp.g:5267:2: ')'
            {
             before(grammarAccess.getMatchCaseAccess().getRightParenthesisKeyword_2_3()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getMatchCaseAccess().getRightParenthesisKeyword_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchCase__Group_2__3__Impl"


    // $ANTLR start "rule__MatchCase__Group_2_2__0"
    // InternalBSharp.g:5277:1: rule__MatchCase__Group_2_2__0 : rule__MatchCase__Group_2_2__0__Impl rule__MatchCase__Group_2_2__1 ;
    public final void rule__MatchCase__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5281:1: ( rule__MatchCase__Group_2_2__0__Impl rule__MatchCase__Group_2_2__1 )
            // InternalBSharp.g:5282:2: rule__MatchCase__Group_2_2__0__Impl rule__MatchCase__Group_2_2__1
            {
            pushFollow(FOLLOW_3);
            rule__MatchCase__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MatchCase__Group_2_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchCase__Group_2_2__0"


    // $ANTLR start "rule__MatchCase__Group_2_2__0__Impl"
    // InternalBSharp.g:5289:1: rule__MatchCase__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__MatchCase__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5293:1: ( ( ',' ) )
            // InternalBSharp.g:5294:1: ( ',' )
            {
            // InternalBSharp.g:5294:1: ( ',' )
            // InternalBSharp.g:5295:2: ','
            {
             before(grammarAccess.getMatchCaseAccess().getCommaKeyword_2_2_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getMatchCaseAccess().getCommaKeyword_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchCase__Group_2_2__0__Impl"


    // $ANTLR start "rule__MatchCase__Group_2_2__1"
    // InternalBSharp.g:5304:1: rule__MatchCase__Group_2_2__1 : rule__MatchCase__Group_2_2__1__Impl ;
    public final void rule__MatchCase__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5308:1: ( rule__MatchCase__Group_2_2__1__Impl )
            // InternalBSharp.g:5309:2: rule__MatchCase__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MatchCase__Group_2_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchCase__Group_2_2__1"


    // $ANTLR start "rule__MatchCase__Group_2_2__1__Impl"
    // InternalBSharp.g:5315:1: rule__MatchCase__Group_2_2__1__Impl : ( ( rule__MatchCase__VariablesAssignment_2_2_1 ) ) ;
    public final void rule__MatchCase__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5319:1: ( ( ( rule__MatchCase__VariablesAssignment_2_2_1 ) ) )
            // InternalBSharp.g:5320:1: ( ( rule__MatchCase__VariablesAssignment_2_2_1 ) )
            {
            // InternalBSharp.g:5320:1: ( ( rule__MatchCase__VariablesAssignment_2_2_1 ) )
            // InternalBSharp.g:5321:2: ( rule__MatchCase__VariablesAssignment_2_2_1 )
            {
             before(grammarAccess.getMatchCaseAccess().getVariablesAssignment_2_2_1()); 
            // InternalBSharp.g:5322:2: ( rule__MatchCase__VariablesAssignment_2_2_1 )
            // InternalBSharp.g:5322:3: rule__MatchCase__VariablesAssignment_2_2_1
            {
            pushFollow(FOLLOW_2);
            rule__MatchCase__VariablesAssignment_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getMatchCaseAccess().getVariablesAssignment_2_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchCase__Group_2_2__1__Impl"


    // $ANTLR start "rule__TheoremBody__Group__0"
    // InternalBSharp.g:5331:1: rule__TheoremBody__Group__0 : rule__TheoremBody__Group__0__Impl rule__TheoremBody__Group__1 ;
    public final void rule__TheoremBody__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5335:1: ( rule__TheoremBody__Group__0__Impl rule__TheoremBody__Group__1 )
            // InternalBSharp.g:5336:2: rule__TheoremBody__Group__0__Impl rule__TheoremBody__Group__1
            {
            pushFollow(FOLLOW_38);
            rule__TheoremBody__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TheoremBody__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TheoremBody__Group__0"


    // $ANTLR start "rule__TheoremBody__Group__0__Impl"
    // InternalBSharp.g:5343:1: rule__TheoremBody__Group__0__Impl : ( 'Theorems' ) ;
    public final void rule__TheoremBody__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5347:1: ( ( 'Theorems' ) )
            // InternalBSharp.g:5348:1: ( 'Theorems' )
            {
            // InternalBSharp.g:5348:1: ( 'Theorems' )
            // InternalBSharp.g:5349:2: 'Theorems'
            {
             before(grammarAccess.getTheoremBodyAccess().getTheoremsKeyword_0()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getTheoremBodyAccess().getTheoremsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TheoremBody__Group__0__Impl"


    // $ANTLR start "rule__TheoremBody__Group__1"
    // InternalBSharp.g:5358:1: rule__TheoremBody__Group__1 : rule__TheoremBody__Group__1__Impl rule__TheoremBody__Group__2 ;
    public final void rule__TheoremBody__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5362:1: ( rule__TheoremBody__Group__1__Impl rule__TheoremBody__Group__2 )
            // InternalBSharp.g:5363:2: rule__TheoremBody__Group__1__Impl rule__TheoremBody__Group__2
            {
            pushFollow(FOLLOW_44);
            rule__TheoremBody__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TheoremBody__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TheoremBody__Group__1"


    // $ANTLR start "rule__TheoremBody__Group__1__Impl"
    // InternalBSharp.g:5370:1: rule__TheoremBody__Group__1__Impl : ( '{' ) ;
    public final void rule__TheoremBody__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5374:1: ( ( '{' ) )
            // InternalBSharp.g:5375:1: ( '{' )
            {
            // InternalBSharp.g:5375:1: ( '{' )
            // InternalBSharp.g:5376:2: '{'
            {
             before(grammarAccess.getTheoremBodyAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getTheoremBodyAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TheoremBody__Group__1__Impl"


    // $ANTLR start "rule__TheoremBody__Group__2"
    // InternalBSharp.g:5385:1: rule__TheoremBody__Group__2 : rule__TheoremBody__Group__2__Impl rule__TheoremBody__Group__3 ;
    public final void rule__TheoremBody__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5389:1: ( rule__TheoremBody__Group__2__Impl rule__TheoremBody__Group__3 )
            // InternalBSharp.g:5390:2: rule__TheoremBody__Group__2__Impl rule__TheoremBody__Group__3
            {
            pushFollow(FOLLOW_45);
            rule__TheoremBody__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TheoremBody__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TheoremBody__Group__2"


    // $ANTLR start "rule__TheoremBody__Group__2__Impl"
    // InternalBSharp.g:5397:1: rule__TheoremBody__Group__2__Impl : ( ( ( rule__TheoremBody__TheoremDeclAssignment_2 ) ) ( ( rule__TheoremBody__TheoremDeclAssignment_2 )* ) ) ;
    public final void rule__TheoremBody__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5401:1: ( ( ( ( rule__TheoremBody__TheoremDeclAssignment_2 ) ) ( ( rule__TheoremBody__TheoremDeclAssignment_2 )* ) ) )
            // InternalBSharp.g:5402:1: ( ( ( rule__TheoremBody__TheoremDeclAssignment_2 ) ) ( ( rule__TheoremBody__TheoremDeclAssignment_2 )* ) )
            {
            // InternalBSharp.g:5402:1: ( ( ( rule__TheoremBody__TheoremDeclAssignment_2 ) ) ( ( rule__TheoremBody__TheoremDeclAssignment_2 )* ) )
            // InternalBSharp.g:5403:2: ( ( rule__TheoremBody__TheoremDeclAssignment_2 ) ) ( ( rule__TheoremBody__TheoremDeclAssignment_2 )* )
            {
            // InternalBSharp.g:5403:2: ( ( rule__TheoremBody__TheoremDeclAssignment_2 ) )
            // InternalBSharp.g:5404:3: ( rule__TheoremBody__TheoremDeclAssignment_2 )
            {
             before(grammarAccess.getTheoremBodyAccess().getTheoremDeclAssignment_2()); 
            // InternalBSharp.g:5405:3: ( rule__TheoremBody__TheoremDeclAssignment_2 )
            // InternalBSharp.g:5405:4: rule__TheoremBody__TheoremDeclAssignment_2
            {
            pushFollow(FOLLOW_6);
            rule__TheoremBody__TheoremDeclAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTheoremBodyAccess().getTheoremDeclAssignment_2()); 

            }

            // InternalBSharp.g:5408:2: ( ( rule__TheoremBody__TheoremDeclAssignment_2 )* )
            // InternalBSharp.g:5409:3: ( rule__TheoremBody__TheoremDeclAssignment_2 )*
            {
             before(grammarAccess.getTheoremBodyAccess().getTheoremDeclAssignment_2()); 
            // InternalBSharp.g:5410:3: ( rule__TheoremBody__TheoremDeclAssignment_2 )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( ((LA50_0>=RULE_INT && LA50_0<=RULE_WS)||LA50_0==33) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalBSharp.g:5410:4: rule__TheoremBody__TheoremDeclAssignment_2
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__TheoremBody__TheoremDeclAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);

             after(grammarAccess.getTheoremBodyAccess().getTheoremDeclAssignment_2()); 

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
    // $ANTLR end "rule__TheoremBody__Group__2__Impl"


    // $ANTLR start "rule__TheoremBody__Group__3"
    // InternalBSharp.g:5419:1: rule__TheoremBody__Group__3 : rule__TheoremBody__Group__3__Impl ;
    public final void rule__TheoremBody__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5423:1: ( rule__TheoremBody__Group__3__Impl )
            // InternalBSharp.g:5424:2: rule__TheoremBody__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TheoremBody__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TheoremBody__Group__3"


    // $ANTLR start "rule__TheoremBody__Group__3__Impl"
    // InternalBSharp.g:5430:1: rule__TheoremBody__Group__3__Impl : ( '}' ) ;
    public final void rule__TheoremBody__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5434:1: ( ( '}' ) )
            // InternalBSharp.g:5435:1: ( '}' )
            {
            // InternalBSharp.g:5435:1: ( '}' )
            // InternalBSharp.g:5436:2: '}'
            {
             before(grammarAccess.getTheoremBodyAccess().getRightCurlyBracketKeyword_3()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getTheoremBodyAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TheoremBody__Group__3__Impl"


    // $ANTLR start "rule__TheoremDecl__Group__0"
    // InternalBSharp.g:5446:1: rule__TheoremDecl__Group__0 : rule__TheoremDecl__Group__0__Impl rule__TheoremDecl__Group__1 ;
    public final void rule__TheoremDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5450:1: ( rule__TheoremDecl__Group__0__Impl rule__TheoremDecl__Group__1 )
            // InternalBSharp.g:5451:2: rule__TheoremDecl__Group__0__Impl rule__TheoremDecl__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__TheoremDecl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TheoremDecl__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TheoremDecl__Group__0"


    // $ANTLR start "rule__TheoremDecl__Group__0__Impl"
    // InternalBSharp.g:5458:1: rule__TheoremDecl__Group__0__Impl : ( ( rule__TheoremDecl__NameAssignment_0 ) ) ;
    public final void rule__TheoremDecl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5462:1: ( ( ( rule__TheoremDecl__NameAssignment_0 ) ) )
            // InternalBSharp.g:5463:1: ( ( rule__TheoremDecl__NameAssignment_0 ) )
            {
            // InternalBSharp.g:5463:1: ( ( rule__TheoremDecl__NameAssignment_0 ) )
            // InternalBSharp.g:5464:2: ( rule__TheoremDecl__NameAssignment_0 )
            {
             before(grammarAccess.getTheoremDeclAccess().getNameAssignment_0()); 
            // InternalBSharp.g:5465:2: ( rule__TheoremDecl__NameAssignment_0 )
            // InternalBSharp.g:5465:3: rule__TheoremDecl__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__TheoremDecl__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTheoremDeclAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TheoremDecl__Group__0__Impl"


    // $ANTLR start "rule__TheoremDecl__Group__1"
    // InternalBSharp.g:5473:1: rule__TheoremDecl__Group__1 : rule__TheoremDecl__Group__1__Impl rule__TheoremDecl__Group__2 ;
    public final void rule__TheoremDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5477:1: ( rule__TheoremDecl__Group__1__Impl rule__TheoremDecl__Group__2 )
            // InternalBSharp.g:5478:2: rule__TheoremDecl__Group__1__Impl rule__TheoremDecl__Group__2
            {
            pushFollow(FOLLOW_29);
            rule__TheoremDecl__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TheoremDecl__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TheoremDecl__Group__1"


    // $ANTLR start "rule__TheoremDecl__Group__1__Impl"
    // InternalBSharp.g:5485:1: rule__TheoremDecl__Group__1__Impl : ( ( rule__TheoremDecl__ExprAssignment_1 ) ) ;
    public final void rule__TheoremDecl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5489:1: ( ( ( rule__TheoremDecl__ExprAssignment_1 ) ) )
            // InternalBSharp.g:5490:1: ( ( rule__TheoremDecl__ExprAssignment_1 ) )
            {
            // InternalBSharp.g:5490:1: ( ( rule__TheoremDecl__ExprAssignment_1 ) )
            // InternalBSharp.g:5491:2: ( rule__TheoremDecl__ExprAssignment_1 )
            {
             before(grammarAccess.getTheoremDeclAccess().getExprAssignment_1()); 
            // InternalBSharp.g:5492:2: ( rule__TheoremDecl__ExprAssignment_1 )
            // InternalBSharp.g:5492:3: rule__TheoremDecl__ExprAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TheoremDecl__ExprAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTheoremDeclAccess().getExprAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TheoremDecl__Group__1__Impl"


    // $ANTLR start "rule__TheoremDecl__Group__2"
    // InternalBSharp.g:5500:1: rule__TheoremDecl__Group__2 : rule__TheoremDecl__Group__2__Impl ;
    public final void rule__TheoremDecl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5504:1: ( rule__TheoremDecl__Group__2__Impl )
            // InternalBSharp.g:5505:2: rule__TheoremDecl__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TheoremDecl__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TheoremDecl__Group__2"


    // $ANTLR start "rule__TheoremDecl__Group__2__Impl"
    // InternalBSharp.g:5511:1: rule__TheoremDecl__Group__2__Impl : ( ';' ) ;
    public final void rule__TheoremDecl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5515:1: ( ( ';' ) )
            // InternalBSharp.g:5516:1: ( ';' )
            {
            // InternalBSharp.g:5516:1: ( ';' )
            // InternalBSharp.g:5517:2: ';'
            {
             before(grammarAccess.getTheoremDeclAccess().getSemicolonKeyword_2()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getTheoremDeclAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TheoremDecl__Group__2__Impl"


    // $ANTLR start "rule__TypedVariableList__Group__0"
    // InternalBSharp.g:5527:1: rule__TypedVariableList__Group__0 : rule__TypedVariableList__Group__0__Impl rule__TypedVariableList__Group__1 ;
    public final void rule__TypedVariableList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5531:1: ( rule__TypedVariableList__Group__0__Impl rule__TypedVariableList__Group__1 )
            // InternalBSharp.g:5532:2: rule__TypedVariableList__Group__0__Impl rule__TypedVariableList__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__TypedVariableList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypedVariableList__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedVariableList__Group__0"


    // $ANTLR start "rule__TypedVariableList__Group__0__Impl"
    // InternalBSharp.g:5539:1: rule__TypedVariableList__Group__0__Impl : ( ( rule__TypedVariableList__VariablesOfTypeAssignment_0 ) ) ;
    public final void rule__TypedVariableList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5543:1: ( ( ( rule__TypedVariableList__VariablesOfTypeAssignment_0 ) ) )
            // InternalBSharp.g:5544:1: ( ( rule__TypedVariableList__VariablesOfTypeAssignment_0 ) )
            {
            // InternalBSharp.g:5544:1: ( ( rule__TypedVariableList__VariablesOfTypeAssignment_0 ) )
            // InternalBSharp.g:5545:2: ( rule__TypedVariableList__VariablesOfTypeAssignment_0 )
            {
             before(grammarAccess.getTypedVariableListAccess().getVariablesOfTypeAssignment_0()); 
            // InternalBSharp.g:5546:2: ( rule__TypedVariableList__VariablesOfTypeAssignment_0 )
            // InternalBSharp.g:5546:3: rule__TypedVariableList__VariablesOfTypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__TypedVariableList__VariablesOfTypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTypedVariableListAccess().getVariablesOfTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedVariableList__Group__0__Impl"


    // $ANTLR start "rule__TypedVariableList__Group__1"
    // InternalBSharp.g:5554:1: rule__TypedVariableList__Group__1 : rule__TypedVariableList__Group__1__Impl ;
    public final void rule__TypedVariableList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5558:1: ( rule__TypedVariableList__Group__1__Impl )
            // InternalBSharp.g:5559:2: rule__TypedVariableList__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TypedVariableList__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedVariableList__Group__1"


    // $ANTLR start "rule__TypedVariableList__Group__1__Impl"
    // InternalBSharp.g:5565:1: rule__TypedVariableList__Group__1__Impl : ( ( rule__TypedVariableList__Group_1__0 )* ) ;
    public final void rule__TypedVariableList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5569:1: ( ( ( rule__TypedVariableList__Group_1__0 )* ) )
            // InternalBSharp.g:5570:1: ( ( rule__TypedVariableList__Group_1__0 )* )
            {
            // InternalBSharp.g:5570:1: ( ( rule__TypedVariableList__Group_1__0 )* )
            // InternalBSharp.g:5571:2: ( rule__TypedVariableList__Group_1__0 )*
            {
             before(grammarAccess.getTypedVariableListAccess().getGroup_1()); 
            // InternalBSharp.g:5572:2: ( rule__TypedVariableList__Group_1__0 )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==45) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // InternalBSharp.g:5572:3: rule__TypedVariableList__Group_1__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__TypedVariableList__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);

             after(grammarAccess.getTypedVariableListAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedVariableList__Group__1__Impl"


    // $ANTLR start "rule__TypedVariableList__Group_1__0"
    // InternalBSharp.g:5581:1: rule__TypedVariableList__Group_1__0 : rule__TypedVariableList__Group_1__0__Impl rule__TypedVariableList__Group_1__1 ;
    public final void rule__TypedVariableList__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5585:1: ( rule__TypedVariableList__Group_1__0__Impl rule__TypedVariableList__Group_1__1 )
            // InternalBSharp.g:5586:2: rule__TypedVariableList__Group_1__0__Impl rule__TypedVariableList__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__TypedVariableList__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypedVariableList__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedVariableList__Group_1__0"


    // $ANTLR start "rule__TypedVariableList__Group_1__0__Impl"
    // InternalBSharp.g:5593:1: rule__TypedVariableList__Group_1__0__Impl : ( ',' ) ;
    public final void rule__TypedVariableList__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5597:1: ( ( ',' ) )
            // InternalBSharp.g:5598:1: ( ',' )
            {
            // InternalBSharp.g:5598:1: ( ',' )
            // InternalBSharp.g:5599:2: ','
            {
             before(grammarAccess.getTypedVariableListAccess().getCommaKeyword_1_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getTypedVariableListAccess().getCommaKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedVariableList__Group_1__0__Impl"


    // $ANTLR start "rule__TypedVariableList__Group_1__1"
    // InternalBSharp.g:5608:1: rule__TypedVariableList__Group_1__1 : rule__TypedVariableList__Group_1__1__Impl ;
    public final void rule__TypedVariableList__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5612:1: ( rule__TypedVariableList__Group_1__1__Impl )
            // InternalBSharp.g:5613:2: rule__TypedVariableList__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TypedVariableList__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedVariableList__Group_1__1"


    // $ANTLR start "rule__TypedVariableList__Group_1__1__Impl"
    // InternalBSharp.g:5619:1: rule__TypedVariableList__Group_1__1__Impl : ( ( rule__TypedVariableList__VariablesOfTypeAssignment_1_1 ) ) ;
    public final void rule__TypedVariableList__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5623:1: ( ( ( rule__TypedVariableList__VariablesOfTypeAssignment_1_1 ) ) )
            // InternalBSharp.g:5624:1: ( ( rule__TypedVariableList__VariablesOfTypeAssignment_1_1 ) )
            {
            // InternalBSharp.g:5624:1: ( ( rule__TypedVariableList__VariablesOfTypeAssignment_1_1 ) )
            // InternalBSharp.g:5625:2: ( rule__TypedVariableList__VariablesOfTypeAssignment_1_1 )
            {
             before(grammarAccess.getTypedVariableListAccess().getVariablesOfTypeAssignment_1_1()); 
            // InternalBSharp.g:5626:2: ( rule__TypedVariableList__VariablesOfTypeAssignment_1_1 )
            // InternalBSharp.g:5626:3: rule__TypedVariableList__VariablesOfTypeAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__TypedVariableList__VariablesOfTypeAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getTypedVariableListAccess().getVariablesOfTypeAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedVariableList__Group_1__1__Impl"


    // $ANTLR start "rule__VariableTyping__Group__0"
    // InternalBSharp.g:5635:1: rule__VariableTyping__Group__0 : rule__VariableTyping__Group__0__Impl rule__VariableTyping__Group__1 ;
    public final void rule__VariableTyping__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5639:1: ( rule__VariableTyping__Group__0__Impl rule__VariableTyping__Group__1 )
            // InternalBSharp.g:5640:2: rule__VariableTyping__Group__0__Impl rule__VariableTyping__Group__1
            {
            pushFollow(FOLLOW_46);
            rule__VariableTyping__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableTyping__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableTyping__Group__0"


    // $ANTLR start "rule__VariableTyping__Group__0__Impl"
    // InternalBSharp.g:5647:1: rule__VariableTyping__Group__0__Impl : ( ( rule__VariableTyping__TypeVarAssignment_0 ) ) ;
    public final void rule__VariableTyping__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5651:1: ( ( ( rule__VariableTyping__TypeVarAssignment_0 ) ) )
            // InternalBSharp.g:5652:1: ( ( rule__VariableTyping__TypeVarAssignment_0 ) )
            {
            // InternalBSharp.g:5652:1: ( ( rule__VariableTyping__TypeVarAssignment_0 ) )
            // InternalBSharp.g:5653:2: ( rule__VariableTyping__TypeVarAssignment_0 )
            {
             before(grammarAccess.getVariableTypingAccess().getTypeVarAssignment_0()); 
            // InternalBSharp.g:5654:2: ( rule__VariableTyping__TypeVarAssignment_0 )
            // InternalBSharp.g:5654:3: rule__VariableTyping__TypeVarAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__VariableTyping__TypeVarAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getVariableTypingAccess().getTypeVarAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableTyping__Group__0__Impl"


    // $ANTLR start "rule__VariableTyping__Group__1"
    // InternalBSharp.g:5662:1: rule__VariableTyping__Group__1 : rule__VariableTyping__Group__1__Impl rule__VariableTyping__Group__2 ;
    public final void rule__VariableTyping__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5666:1: ( rule__VariableTyping__Group__1__Impl rule__VariableTyping__Group__2 )
            // InternalBSharp.g:5667:2: rule__VariableTyping__Group__1__Impl rule__VariableTyping__Group__2
            {
            pushFollow(FOLLOW_46);
            rule__VariableTyping__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableTyping__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableTyping__Group__1"


    // $ANTLR start "rule__VariableTyping__Group__1__Impl"
    // InternalBSharp.g:5674:1: rule__VariableTyping__Group__1__Impl : ( ( rule__VariableTyping__Group_1__0 )* ) ;
    public final void rule__VariableTyping__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5678:1: ( ( ( rule__VariableTyping__Group_1__0 )* ) )
            // InternalBSharp.g:5679:1: ( ( rule__VariableTyping__Group_1__0 )* )
            {
            // InternalBSharp.g:5679:1: ( ( rule__VariableTyping__Group_1__0 )* )
            // InternalBSharp.g:5680:2: ( rule__VariableTyping__Group_1__0 )*
            {
             before(grammarAccess.getVariableTypingAccess().getGroup_1()); 
            // InternalBSharp.g:5681:2: ( rule__VariableTyping__Group_1__0 )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==45) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // InternalBSharp.g:5681:3: rule__VariableTyping__Group_1__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__VariableTyping__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);

             after(grammarAccess.getVariableTypingAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableTyping__Group__1__Impl"


    // $ANTLR start "rule__VariableTyping__Group__2"
    // InternalBSharp.g:5689:1: rule__VariableTyping__Group__2 : rule__VariableTyping__Group__2__Impl rule__VariableTyping__Group__3 ;
    public final void rule__VariableTyping__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5693:1: ( rule__VariableTyping__Group__2__Impl rule__VariableTyping__Group__3 )
            // InternalBSharp.g:5694:2: rule__VariableTyping__Group__2__Impl rule__VariableTyping__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__VariableTyping__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableTyping__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableTyping__Group__2"


    // $ANTLR start "rule__VariableTyping__Group__2__Impl"
    // InternalBSharp.g:5701:1: rule__VariableTyping__Group__2__Impl : ( ':' ) ;
    public final void rule__VariableTyping__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5705:1: ( ( ':' ) )
            // InternalBSharp.g:5706:1: ( ':' )
            {
            // InternalBSharp.g:5706:1: ( ':' )
            // InternalBSharp.g:5707:2: ':'
            {
             before(grammarAccess.getVariableTypingAccess().getColonKeyword_2()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getVariableTypingAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableTyping__Group__2__Impl"


    // $ANTLR start "rule__VariableTyping__Group__3"
    // InternalBSharp.g:5716:1: rule__VariableTyping__Group__3 : rule__VariableTyping__Group__3__Impl ;
    public final void rule__VariableTyping__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5720:1: ( rule__VariableTyping__Group__3__Impl )
            // InternalBSharp.g:5721:2: rule__VariableTyping__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VariableTyping__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableTyping__Group__3"


    // $ANTLR start "rule__VariableTyping__Group__3__Impl"
    // InternalBSharp.g:5727:1: rule__VariableTyping__Group__3__Impl : ( ( rule__VariableTyping__TypeAssignment_3 ) ) ;
    public final void rule__VariableTyping__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5731:1: ( ( ( rule__VariableTyping__TypeAssignment_3 ) ) )
            // InternalBSharp.g:5732:1: ( ( rule__VariableTyping__TypeAssignment_3 ) )
            {
            // InternalBSharp.g:5732:1: ( ( rule__VariableTyping__TypeAssignment_3 ) )
            // InternalBSharp.g:5733:2: ( rule__VariableTyping__TypeAssignment_3 )
            {
             before(grammarAccess.getVariableTypingAccess().getTypeAssignment_3()); 
            // InternalBSharp.g:5734:2: ( rule__VariableTyping__TypeAssignment_3 )
            // InternalBSharp.g:5734:3: rule__VariableTyping__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__VariableTyping__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getVariableTypingAccess().getTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableTyping__Group__3__Impl"


    // $ANTLR start "rule__VariableTyping__Group_1__0"
    // InternalBSharp.g:5743:1: rule__VariableTyping__Group_1__0 : rule__VariableTyping__Group_1__0__Impl rule__VariableTyping__Group_1__1 ;
    public final void rule__VariableTyping__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5747:1: ( rule__VariableTyping__Group_1__0__Impl rule__VariableTyping__Group_1__1 )
            // InternalBSharp.g:5748:2: rule__VariableTyping__Group_1__0__Impl rule__VariableTyping__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__VariableTyping__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableTyping__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableTyping__Group_1__0"


    // $ANTLR start "rule__VariableTyping__Group_1__0__Impl"
    // InternalBSharp.g:5755:1: rule__VariableTyping__Group_1__0__Impl : ( ',' ) ;
    public final void rule__VariableTyping__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5759:1: ( ( ',' ) )
            // InternalBSharp.g:5760:1: ( ',' )
            {
            // InternalBSharp.g:5760:1: ( ',' )
            // InternalBSharp.g:5761:2: ','
            {
             before(grammarAccess.getVariableTypingAccess().getCommaKeyword_1_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getVariableTypingAccess().getCommaKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableTyping__Group_1__0__Impl"


    // $ANTLR start "rule__VariableTyping__Group_1__1"
    // InternalBSharp.g:5770:1: rule__VariableTyping__Group_1__1 : rule__VariableTyping__Group_1__1__Impl ;
    public final void rule__VariableTyping__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5774:1: ( rule__VariableTyping__Group_1__1__Impl )
            // InternalBSharp.g:5775:2: rule__VariableTyping__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VariableTyping__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableTyping__Group_1__1"


    // $ANTLR start "rule__VariableTyping__Group_1__1__Impl"
    // InternalBSharp.g:5781:1: rule__VariableTyping__Group_1__1__Impl : ( ( rule__VariableTyping__TypeVarAssignment_1_1 ) ) ;
    public final void rule__VariableTyping__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5785:1: ( ( ( rule__VariableTyping__TypeVarAssignment_1_1 ) ) )
            // InternalBSharp.g:5786:1: ( ( rule__VariableTyping__TypeVarAssignment_1_1 ) )
            {
            // InternalBSharp.g:5786:1: ( ( rule__VariableTyping__TypeVarAssignment_1_1 ) )
            // InternalBSharp.g:5787:2: ( rule__VariableTyping__TypeVarAssignment_1_1 )
            {
             before(grammarAccess.getVariableTypingAccess().getTypeVarAssignment_1_1()); 
            // InternalBSharp.g:5788:2: ( rule__VariableTyping__TypeVarAssignment_1_1 )
            // InternalBSharp.g:5788:3: rule__VariableTyping__TypeVarAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__VariableTyping__TypeVarAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getVariableTypingAccess().getTypeVarAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableTyping__Group_1__1__Impl"


    // $ANTLR start "rule__Lambda__Group__0"
    // InternalBSharp.g:5797:1: rule__Lambda__Group__0 : rule__Lambda__Group__0__Impl rule__Lambda__Group__1 ;
    public final void rule__Lambda__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5801:1: ( rule__Lambda__Group__0__Impl rule__Lambda__Group__1 )
            // InternalBSharp.g:5802:2: rule__Lambda__Group__0__Impl rule__Lambda__Group__1
            {
            pushFollow(FOLLOW_47);
            rule__Lambda__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lambda__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lambda__Group__0"


    // $ANTLR start "rule__Lambda__Group__0__Impl"
    // InternalBSharp.g:5809:1: rule__Lambda__Group__0__Impl : ( ( rule__Lambda__QTypeAssignment_0 ) ) ;
    public final void rule__Lambda__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5813:1: ( ( ( rule__Lambda__QTypeAssignment_0 ) ) )
            // InternalBSharp.g:5814:1: ( ( rule__Lambda__QTypeAssignment_0 ) )
            {
            // InternalBSharp.g:5814:1: ( ( rule__Lambda__QTypeAssignment_0 ) )
            // InternalBSharp.g:5815:2: ( rule__Lambda__QTypeAssignment_0 )
            {
             before(grammarAccess.getLambdaAccess().getQTypeAssignment_0()); 
            // InternalBSharp.g:5816:2: ( rule__Lambda__QTypeAssignment_0 )
            // InternalBSharp.g:5816:3: rule__Lambda__QTypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Lambda__QTypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getLambdaAccess().getQTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lambda__Group__0__Impl"


    // $ANTLR start "rule__Lambda__Group__1"
    // InternalBSharp.g:5824:1: rule__Lambda__Group__1 : rule__Lambda__Group__1__Impl rule__Lambda__Group__2 ;
    public final void rule__Lambda__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5828:1: ( rule__Lambda__Group__1__Impl rule__Lambda__Group__2 )
            // InternalBSharp.g:5829:2: rule__Lambda__Group__1__Impl rule__Lambda__Group__2
            {
            pushFollow(FOLLOW_47);
            rule__Lambda__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lambda__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lambda__Group__1"


    // $ANTLR start "rule__Lambda__Group__1__Impl"
    // InternalBSharp.g:5836:1: rule__Lambda__Group__1__Impl : ( ( rule__Lambda__ContextAssignment_1 )? ) ;
    public final void rule__Lambda__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5840:1: ( ( ( rule__Lambda__ContextAssignment_1 )? ) )
            // InternalBSharp.g:5841:1: ( ( rule__Lambda__ContextAssignment_1 )? )
            {
            // InternalBSharp.g:5841:1: ( ( rule__Lambda__ContextAssignment_1 )? )
            // InternalBSharp.g:5842:2: ( rule__Lambda__ContextAssignment_1 )?
            {
             before(grammarAccess.getLambdaAccess().getContextAssignment_1()); 
            // InternalBSharp.g:5843:2: ( rule__Lambda__ContextAssignment_1 )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==43) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalBSharp.g:5843:3: rule__Lambda__ContextAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Lambda__ContextAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLambdaAccess().getContextAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lambda__Group__1__Impl"


    // $ANTLR start "rule__Lambda__Group__2"
    // InternalBSharp.g:5851:1: rule__Lambda__Group__2 : rule__Lambda__Group__2__Impl rule__Lambda__Group__3 ;
    public final void rule__Lambda__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5855:1: ( rule__Lambda__Group__2__Impl rule__Lambda__Group__3 )
            // InternalBSharp.g:5856:2: rule__Lambda__Group__2__Impl rule__Lambda__Group__3
            {
            pushFollow(FOLLOW_39);
            rule__Lambda__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lambda__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lambda__Group__2"


    // $ANTLR start "rule__Lambda__Group__2__Impl"
    // InternalBSharp.g:5863:1: rule__Lambda__Group__2__Impl : ( ( rule__Lambda__VarListAssignment_2 ) ) ;
    public final void rule__Lambda__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5867:1: ( ( ( rule__Lambda__VarListAssignment_2 ) ) )
            // InternalBSharp.g:5868:1: ( ( rule__Lambda__VarListAssignment_2 ) )
            {
            // InternalBSharp.g:5868:1: ( ( rule__Lambda__VarListAssignment_2 ) )
            // InternalBSharp.g:5869:2: ( rule__Lambda__VarListAssignment_2 )
            {
             before(grammarAccess.getLambdaAccess().getVarListAssignment_2()); 
            // InternalBSharp.g:5870:2: ( rule__Lambda__VarListAssignment_2 )
            // InternalBSharp.g:5870:3: rule__Lambda__VarListAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Lambda__VarListAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLambdaAccess().getVarListAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lambda__Group__2__Impl"


    // $ANTLR start "rule__Lambda__Group__3"
    // InternalBSharp.g:5878:1: rule__Lambda__Group__3 : rule__Lambda__Group__3__Impl rule__Lambda__Group__4 ;
    public final void rule__Lambda__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5882:1: ( rule__Lambda__Group__3__Impl rule__Lambda__Group__4 )
            // InternalBSharp.g:5883:2: rule__Lambda__Group__3__Impl rule__Lambda__Group__4
            {
            pushFollow(FOLLOW_28);
            rule__Lambda__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lambda__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lambda__Group__3"


    // $ANTLR start "rule__Lambda__Group__3__Impl"
    // InternalBSharp.g:5890:1: rule__Lambda__Group__3__Impl : ( '|' ) ;
    public final void rule__Lambda__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5894:1: ( ( '|' ) )
            // InternalBSharp.g:5895:1: ( '|' )
            {
            // InternalBSharp.g:5895:1: ( '|' )
            // InternalBSharp.g:5896:2: '|'
            {
             before(grammarAccess.getLambdaAccess().getVerticalLineKeyword_3()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getLambdaAccess().getVerticalLineKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lambda__Group__3__Impl"


    // $ANTLR start "rule__Lambda__Group__4"
    // InternalBSharp.g:5905:1: rule__Lambda__Group__4 : rule__Lambda__Group__4__Impl ;
    public final void rule__Lambda__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5909:1: ( rule__Lambda__Group__4__Impl )
            // InternalBSharp.g:5910:2: rule__Lambda__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Lambda__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lambda__Group__4"


    // $ANTLR start "rule__Lambda__Group__4__Impl"
    // InternalBSharp.g:5916:1: rule__Lambda__Group__4__Impl : ( ( rule__Lambda__ExprAssignment_4 ) ) ;
    public final void rule__Lambda__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5920:1: ( ( ( rule__Lambda__ExprAssignment_4 ) ) )
            // InternalBSharp.g:5921:1: ( ( rule__Lambda__ExprAssignment_4 ) )
            {
            // InternalBSharp.g:5921:1: ( ( rule__Lambda__ExprAssignment_4 ) )
            // InternalBSharp.g:5922:2: ( rule__Lambda__ExprAssignment_4 )
            {
             before(grammarAccess.getLambdaAccess().getExprAssignment_4()); 
            // InternalBSharp.g:5923:2: ( rule__Lambda__ExprAssignment_4 )
            // InternalBSharp.g:5923:3: rule__Lambda__ExprAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Lambda__ExprAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getLambdaAccess().getExprAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lambda__Group__4__Impl"


    // $ANTLR start "rule__Quantifier__Group__0"
    // InternalBSharp.g:5932:1: rule__Quantifier__Group__0 : rule__Quantifier__Group__0__Impl rule__Quantifier__Group__1 ;
    public final void rule__Quantifier__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5936:1: ( rule__Quantifier__Group__0__Impl rule__Quantifier__Group__1 )
            // InternalBSharp.g:5937:2: rule__Quantifier__Group__0__Impl rule__Quantifier__Group__1
            {
            pushFollow(FOLLOW_47);
            rule__Quantifier__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Quantifier__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quantifier__Group__0"


    // $ANTLR start "rule__Quantifier__Group__0__Impl"
    // InternalBSharp.g:5944:1: rule__Quantifier__Group__0__Impl : ( ( rule__Quantifier__QTypeAssignment_0 ) ) ;
    public final void rule__Quantifier__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5948:1: ( ( ( rule__Quantifier__QTypeAssignment_0 ) ) )
            // InternalBSharp.g:5949:1: ( ( rule__Quantifier__QTypeAssignment_0 ) )
            {
            // InternalBSharp.g:5949:1: ( ( rule__Quantifier__QTypeAssignment_0 ) )
            // InternalBSharp.g:5950:2: ( rule__Quantifier__QTypeAssignment_0 )
            {
             before(grammarAccess.getQuantifierAccess().getQTypeAssignment_0()); 
            // InternalBSharp.g:5951:2: ( rule__Quantifier__QTypeAssignment_0 )
            // InternalBSharp.g:5951:3: rule__Quantifier__QTypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Quantifier__QTypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getQuantifierAccess().getQTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quantifier__Group__0__Impl"


    // $ANTLR start "rule__Quantifier__Group__1"
    // InternalBSharp.g:5959:1: rule__Quantifier__Group__1 : rule__Quantifier__Group__1__Impl rule__Quantifier__Group__2 ;
    public final void rule__Quantifier__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5963:1: ( rule__Quantifier__Group__1__Impl rule__Quantifier__Group__2 )
            // InternalBSharp.g:5964:2: rule__Quantifier__Group__1__Impl rule__Quantifier__Group__2
            {
            pushFollow(FOLLOW_47);
            rule__Quantifier__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Quantifier__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quantifier__Group__1"


    // $ANTLR start "rule__Quantifier__Group__1__Impl"
    // InternalBSharp.g:5971:1: rule__Quantifier__Group__1__Impl : ( ( rule__Quantifier__ContextAssignment_1 )? ) ;
    public final void rule__Quantifier__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5975:1: ( ( ( rule__Quantifier__ContextAssignment_1 )? ) )
            // InternalBSharp.g:5976:1: ( ( rule__Quantifier__ContextAssignment_1 )? )
            {
            // InternalBSharp.g:5976:1: ( ( rule__Quantifier__ContextAssignment_1 )? )
            // InternalBSharp.g:5977:2: ( rule__Quantifier__ContextAssignment_1 )?
            {
             before(grammarAccess.getQuantifierAccess().getContextAssignment_1()); 
            // InternalBSharp.g:5978:2: ( rule__Quantifier__ContextAssignment_1 )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==43) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalBSharp.g:5978:3: rule__Quantifier__ContextAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Quantifier__ContextAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQuantifierAccess().getContextAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quantifier__Group__1__Impl"


    // $ANTLR start "rule__Quantifier__Group__2"
    // InternalBSharp.g:5986:1: rule__Quantifier__Group__2 : rule__Quantifier__Group__2__Impl rule__Quantifier__Group__3 ;
    public final void rule__Quantifier__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5990:1: ( rule__Quantifier__Group__2__Impl rule__Quantifier__Group__3 )
            // InternalBSharp.g:5991:2: rule__Quantifier__Group__2__Impl rule__Quantifier__Group__3
            {
            pushFollow(FOLLOW_48);
            rule__Quantifier__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Quantifier__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quantifier__Group__2"


    // $ANTLR start "rule__Quantifier__Group__2__Impl"
    // InternalBSharp.g:5998:1: rule__Quantifier__Group__2__Impl : ( ( rule__Quantifier__VarListAssignment_2 ) ) ;
    public final void rule__Quantifier__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6002:1: ( ( ( rule__Quantifier__VarListAssignment_2 ) ) )
            // InternalBSharp.g:6003:1: ( ( rule__Quantifier__VarListAssignment_2 ) )
            {
            // InternalBSharp.g:6003:1: ( ( rule__Quantifier__VarListAssignment_2 ) )
            // InternalBSharp.g:6004:2: ( rule__Quantifier__VarListAssignment_2 )
            {
             before(grammarAccess.getQuantifierAccess().getVarListAssignment_2()); 
            // InternalBSharp.g:6005:2: ( rule__Quantifier__VarListAssignment_2 )
            // InternalBSharp.g:6005:3: rule__Quantifier__VarListAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Quantifier__VarListAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getQuantifierAccess().getVarListAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quantifier__Group__2__Impl"


    // $ANTLR start "rule__Quantifier__Group__3"
    // InternalBSharp.g:6013:1: rule__Quantifier__Group__3 : rule__Quantifier__Group__3__Impl rule__Quantifier__Group__4 ;
    public final void rule__Quantifier__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6017:1: ( rule__Quantifier__Group__3__Impl rule__Quantifier__Group__4 )
            // InternalBSharp.g:6018:2: rule__Quantifier__Group__3__Impl rule__Quantifier__Group__4
            {
            pushFollow(FOLLOW_28);
            rule__Quantifier__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Quantifier__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quantifier__Group__3"


    // $ANTLR start "rule__Quantifier__Group__3__Impl"
    // InternalBSharp.g:6025:1: rule__Quantifier__Group__3__Impl : ( '\\u00B7' ) ;
    public final void rule__Quantifier__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6029:1: ( ( '\\u00B7' ) )
            // InternalBSharp.g:6030:1: ( '\\u00B7' )
            {
            // InternalBSharp.g:6030:1: ( '\\u00B7' )
            // InternalBSharp.g:6031:2: '\\u00B7'
            {
             before(grammarAccess.getQuantifierAccess().getMiddleDotKeyword_3()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getQuantifierAccess().getMiddleDotKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quantifier__Group__3__Impl"


    // $ANTLR start "rule__Quantifier__Group__4"
    // InternalBSharp.g:6040:1: rule__Quantifier__Group__4 : rule__Quantifier__Group__4__Impl ;
    public final void rule__Quantifier__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6044:1: ( rule__Quantifier__Group__4__Impl )
            // InternalBSharp.g:6045:2: rule__Quantifier__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Quantifier__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quantifier__Group__4"


    // $ANTLR start "rule__Quantifier__Group__4__Impl"
    // InternalBSharp.g:6051:1: rule__Quantifier__Group__4__Impl : ( ( rule__Quantifier__ExprAssignment_4 ) ) ;
    public final void rule__Quantifier__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6055:1: ( ( ( rule__Quantifier__ExprAssignment_4 ) ) )
            // InternalBSharp.g:6056:1: ( ( rule__Quantifier__ExprAssignment_4 ) )
            {
            // InternalBSharp.g:6056:1: ( ( rule__Quantifier__ExprAssignment_4 ) )
            // InternalBSharp.g:6057:2: ( rule__Quantifier__ExprAssignment_4 )
            {
             before(grammarAccess.getQuantifierAccess().getExprAssignment_4()); 
            // InternalBSharp.g:6058:2: ( rule__Quantifier__ExprAssignment_4 )
            // InternalBSharp.g:6058:3: rule__Quantifier__ExprAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Quantifier__ExprAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getQuantifierAccess().getExprAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quantifier__Group__4__Impl"


    // $ANTLR start "rule__Prefix__Group__0"
    // InternalBSharp.g:6067:1: rule__Prefix__Group__0 : rule__Prefix__Group__0__Impl rule__Prefix__Group__1 ;
    public final void rule__Prefix__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6071:1: ( rule__Prefix__Group__0__Impl rule__Prefix__Group__1 )
            // InternalBSharp.g:6072:2: rule__Prefix__Group__0__Impl rule__Prefix__Group__1
            {
            pushFollow(FOLLOW_49);
            rule__Prefix__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Prefix__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prefix__Group__0"


    // $ANTLR start "rule__Prefix__Group__0__Impl"
    // InternalBSharp.g:6079:1: rule__Prefix__Group__0__Impl : ( ( rule__Prefix__NameAssignment_0 ) ) ;
    public final void rule__Prefix__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6083:1: ( ( ( rule__Prefix__NameAssignment_0 ) ) )
            // InternalBSharp.g:6084:1: ( ( rule__Prefix__NameAssignment_0 ) )
            {
            // InternalBSharp.g:6084:1: ( ( rule__Prefix__NameAssignment_0 ) )
            // InternalBSharp.g:6085:2: ( rule__Prefix__NameAssignment_0 )
            {
             before(grammarAccess.getPrefixAccess().getNameAssignment_0()); 
            // InternalBSharp.g:6086:2: ( rule__Prefix__NameAssignment_0 )
            // InternalBSharp.g:6086:3: rule__Prefix__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Prefix__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPrefixAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prefix__Group__0__Impl"


    // $ANTLR start "rule__Prefix__Group__1"
    // InternalBSharp.g:6094:1: rule__Prefix__Group__1 : rule__Prefix__Group__1__Impl ;
    public final void rule__Prefix__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6098:1: ( rule__Prefix__Group__1__Impl )
            // InternalBSharp.g:6099:2: rule__Prefix__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Prefix__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prefix__Group__1"


    // $ANTLR start "rule__Prefix__Group__1__Impl"
    // InternalBSharp.g:6105:1: rule__Prefix__Group__1__Impl : ( ( rule__Prefix__ElemAssignment_1 ) ) ;
    public final void rule__Prefix__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6109:1: ( ( ( rule__Prefix__ElemAssignment_1 ) ) )
            // InternalBSharp.g:6110:1: ( ( rule__Prefix__ElemAssignment_1 ) )
            {
            // InternalBSharp.g:6110:1: ( ( rule__Prefix__ElemAssignment_1 ) )
            // InternalBSharp.g:6111:2: ( rule__Prefix__ElemAssignment_1 )
            {
             before(grammarAccess.getPrefixAccess().getElemAssignment_1()); 
            // InternalBSharp.g:6112:2: ( rule__Prefix__ElemAssignment_1 )
            // InternalBSharp.g:6112:3: rule__Prefix__ElemAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Prefix__ElemAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPrefixAccess().getElemAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prefix__Group__1__Impl"


    // $ANTLR start "rule__Infix__Group__0"
    // InternalBSharp.g:6121:1: rule__Infix__Group__0 : rule__Infix__Group__0__Impl rule__Infix__Group__1 ;
    public final void rule__Infix__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6125:1: ( rule__Infix__Group__0__Impl rule__Infix__Group__1 )
            // InternalBSharp.g:6126:2: rule__Infix__Group__0__Impl rule__Infix__Group__1
            {
            pushFollow(FOLLOW_50);
            rule__Infix__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Infix__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Infix__Group__0"


    // $ANTLR start "rule__Infix__Group__0__Impl"
    // InternalBSharp.g:6133:1: rule__Infix__Group__0__Impl : ( ruleElement ) ;
    public final void rule__Infix__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6137:1: ( ( ruleElement ) )
            // InternalBSharp.g:6138:1: ( ruleElement )
            {
            // InternalBSharp.g:6138:1: ( ruleElement )
            // InternalBSharp.g:6139:2: ruleElement
            {
             before(grammarAccess.getInfixAccess().getElementParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getInfixAccess().getElementParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Infix__Group__0__Impl"


    // $ANTLR start "rule__Infix__Group__1"
    // InternalBSharp.g:6148:1: rule__Infix__Group__1 : rule__Infix__Group__1__Impl ;
    public final void rule__Infix__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6152:1: ( rule__Infix__Group__1__Impl )
            // InternalBSharp.g:6153:2: rule__Infix__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Infix__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Infix__Group__1"


    // $ANTLR start "rule__Infix__Group__1__Impl"
    // InternalBSharp.g:6159:1: rule__Infix__Group__1__Impl : ( ( rule__Infix__Group_1__0 )* ) ;
    public final void rule__Infix__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6163:1: ( ( ( rule__Infix__Group_1__0 )* ) )
            // InternalBSharp.g:6164:1: ( ( rule__Infix__Group_1__0 )* )
            {
            // InternalBSharp.g:6164:1: ( ( rule__Infix__Group_1__0 )* )
            // InternalBSharp.g:6165:2: ( rule__Infix__Group_1__0 )*
            {
             before(grammarAccess.getInfixAccess().getGroup_1()); 
            // InternalBSharp.g:6166:2: ( rule__Infix__Group_1__0 )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==RULE_ID) ) {
                    int LA55_2 = input.LA(2);

                    if ( (LA55_2==41) ) {
                        int LA55_4 = input.LA(3);

                        if ( (LA55_4==RULE_ID) ) {
                            int LA55_5 = input.LA(4);

                            if ( (LA55_5==RULE_ID||(LA55_5>=25 && LA55_5<=31)||LA55_5==34||(LA55_5>=41 && LA55_5<=43)) ) {
                                alt55=1;
                            }


                        }
                        else if ( (LA55_4==11||(LA55_4>=23 && LA55_4<=24)||LA55_4==39||LA55_4==41||LA55_4==53||LA55_4==56||LA55_4==60) ) {
                            alt55=1;
                        }


                    }
                    else if ( (LA55_2==RULE_ID||LA55_2==11||LA55_2==39) ) {
                        alt55=1;
                    }


                }
                else if ( ((LA55_0>=25 && LA55_0<=31)) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // InternalBSharp.g:6166:3: rule__Infix__Group_1__0
            	    {
            	    pushFollow(FOLLOW_51);
            	    rule__Infix__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop55;
                }
            } while (true);

             after(grammarAccess.getInfixAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Infix__Group__1__Impl"


    // $ANTLR start "rule__Infix__Group_1__0"
    // InternalBSharp.g:6175:1: rule__Infix__Group_1__0 : rule__Infix__Group_1__0__Impl rule__Infix__Group_1__1 ;
    public final void rule__Infix__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6179:1: ( rule__Infix__Group_1__0__Impl rule__Infix__Group_1__1 )
            // InternalBSharp.g:6180:2: rule__Infix__Group_1__0__Impl rule__Infix__Group_1__1
            {
            pushFollow(FOLLOW_50);
            rule__Infix__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Infix__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Infix__Group_1__0"


    // $ANTLR start "rule__Infix__Group_1__0__Impl"
    // InternalBSharp.g:6187:1: rule__Infix__Group_1__0__Impl : ( () ) ;
    public final void rule__Infix__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6191:1: ( ( () ) )
            // InternalBSharp.g:6192:1: ( () )
            {
            // InternalBSharp.g:6192:1: ( () )
            // InternalBSharp.g:6193:2: ()
            {
             before(grammarAccess.getInfixAccess().getInfixLeftAction_1_0()); 
            // InternalBSharp.g:6194:2: ()
            // InternalBSharp.g:6194:3: 
            {
            }

             after(grammarAccess.getInfixAccess().getInfixLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Infix__Group_1__0__Impl"


    // $ANTLR start "rule__Infix__Group_1__1"
    // InternalBSharp.g:6202:1: rule__Infix__Group_1__1 : rule__Infix__Group_1__1__Impl rule__Infix__Group_1__2 ;
    public final void rule__Infix__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6206:1: ( rule__Infix__Group_1__1__Impl rule__Infix__Group_1__2 )
            // InternalBSharp.g:6207:2: rule__Infix__Group_1__1__Impl rule__Infix__Group_1__2
            {
            pushFollow(FOLLOW_49);
            rule__Infix__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Infix__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Infix__Group_1__1"


    // $ANTLR start "rule__Infix__Group_1__1__Impl"
    // InternalBSharp.g:6214:1: rule__Infix__Group_1__1__Impl : ( ( rule__Infix__Alternatives_1_1 ) ) ;
    public final void rule__Infix__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6218:1: ( ( ( rule__Infix__Alternatives_1_1 ) ) )
            // InternalBSharp.g:6219:1: ( ( rule__Infix__Alternatives_1_1 ) )
            {
            // InternalBSharp.g:6219:1: ( ( rule__Infix__Alternatives_1_1 ) )
            // InternalBSharp.g:6220:2: ( rule__Infix__Alternatives_1_1 )
            {
             before(grammarAccess.getInfixAccess().getAlternatives_1_1()); 
            // InternalBSharp.g:6221:2: ( rule__Infix__Alternatives_1_1 )
            // InternalBSharp.g:6221:3: rule__Infix__Alternatives_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Infix__Alternatives_1_1();

            state._fsp--;


            }

             after(grammarAccess.getInfixAccess().getAlternatives_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Infix__Group_1__1__Impl"


    // $ANTLR start "rule__Infix__Group_1__2"
    // InternalBSharp.g:6229:1: rule__Infix__Group_1__2 : rule__Infix__Group_1__2__Impl ;
    public final void rule__Infix__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6233:1: ( rule__Infix__Group_1__2__Impl )
            // InternalBSharp.g:6234:2: rule__Infix__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Infix__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Infix__Group_1__2"


    // $ANTLR start "rule__Infix__Group_1__2__Impl"
    // InternalBSharp.g:6240:1: rule__Infix__Group_1__2__Impl : ( ( rule__Infix__RightAssignment_1_2 ) ) ;
    public final void rule__Infix__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6244:1: ( ( ( rule__Infix__RightAssignment_1_2 ) ) )
            // InternalBSharp.g:6245:1: ( ( rule__Infix__RightAssignment_1_2 ) )
            {
            // InternalBSharp.g:6245:1: ( ( rule__Infix__RightAssignment_1_2 ) )
            // InternalBSharp.g:6246:2: ( rule__Infix__RightAssignment_1_2 )
            {
             before(grammarAccess.getInfixAccess().getRightAssignment_1_2()); 
            // InternalBSharp.g:6247:2: ( rule__Infix__RightAssignment_1_2 )
            // InternalBSharp.g:6247:3: rule__Infix__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Infix__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getInfixAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Infix__Group_1__2__Impl"


    // $ANTLR start "rule__Bracket__Group__0"
    // InternalBSharp.g:6256:1: rule__Bracket__Group__0 : rule__Bracket__Group__0__Impl rule__Bracket__Group__1 ;
    public final void rule__Bracket__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6260:1: ( rule__Bracket__Group__0__Impl rule__Bracket__Group__1 )
            // InternalBSharp.g:6261:2: rule__Bracket__Group__0__Impl rule__Bracket__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__Bracket__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Bracket__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bracket__Group__0"


    // $ANTLR start "rule__Bracket__Group__0__Impl"
    // InternalBSharp.g:6268:1: rule__Bracket__Group__0__Impl : ( '(' ) ;
    public final void rule__Bracket__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6272:1: ( ( '(' ) )
            // InternalBSharp.g:6273:1: ( '(' )
            {
            // InternalBSharp.g:6273:1: ( '(' )
            // InternalBSharp.g:6274:2: '('
            {
             before(grammarAccess.getBracketAccess().getLeftParenthesisKeyword_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getBracketAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bracket__Group__0__Impl"


    // $ANTLR start "rule__Bracket__Group__1"
    // InternalBSharp.g:6283:1: rule__Bracket__Group__1 : rule__Bracket__Group__1__Impl rule__Bracket__Group__2 ;
    public final void rule__Bracket__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6287:1: ( rule__Bracket__Group__1__Impl rule__Bracket__Group__2 )
            // InternalBSharp.g:6288:2: rule__Bracket__Group__1__Impl rule__Bracket__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__Bracket__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Bracket__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bracket__Group__1"


    // $ANTLR start "rule__Bracket__Group__1__Impl"
    // InternalBSharp.g:6295:1: rule__Bracket__Group__1__Impl : ( ( rule__Bracket__ChildAssignment_1 ) ) ;
    public final void rule__Bracket__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6299:1: ( ( ( rule__Bracket__ChildAssignment_1 ) ) )
            // InternalBSharp.g:6300:1: ( ( rule__Bracket__ChildAssignment_1 ) )
            {
            // InternalBSharp.g:6300:1: ( ( rule__Bracket__ChildAssignment_1 ) )
            // InternalBSharp.g:6301:2: ( rule__Bracket__ChildAssignment_1 )
            {
             before(grammarAccess.getBracketAccess().getChildAssignment_1()); 
            // InternalBSharp.g:6302:2: ( rule__Bracket__ChildAssignment_1 )
            // InternalBSharp.g:6302:3: rule__Bracket__ChildAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Bracket__ChildAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBracketAccess().getChildAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bracket__Group__1__Impl"


    // $ANTLR start "rule__Bracket__Group__2"
    // InternalBSharp.g:6310:1: rule__Bracket__Group__2 : rule__Bracket__Group__2__Impl ;
    public final void rule__Bracket__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6314:1: ( rule__Bracket__Group__2__Impl )
            // InternalBSharp.g:6315:2: rule__Bracket__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Bracket__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bracket__Group__2"


    // $ANTLR start "rule__Bracket__Group__2__Impl"
    // InternalBSharp.g:6321:1: rule__Bracket__Group__2__Impl : ( ')' ) ;
    public final void rule__Bracket__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6325:1: ( ( ')' ) )
            // InternalBSharp.g:6326:1: ( ')' )
            {
            // InternalBSharp.g:6326:1: ( ')' )
            // InternalBSharp.g:6327:2: ')'
            {
             before(grammarAccess.getBracketAccess().getRightParenthesisKeyword_2()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getBracketAccess().getRightParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bracket__Group__2__Impl"


    // $ANTLR start "rule__FunctionCall__Group_1__0"
    // InternalBSharp.g:6337:1: rule__FunctionCall__Group_1__0 : rule__FunctionCall__Group_1__0__Impl rule__FunctionCall__Group_1__1 ;
    public final void rule__FunctionCall__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6341:1: ( rule__FunctionCall__Group_1__0__Impl rule__FunctionCall__Group_1__1 )
            // InternalBSharp.g:6342:2: rule__FunctionCall__Group_1__0__Impl rule__FunctionCall__Group_1__1
            {
            pushFollow(FOLLOW_35);
            rule__FunctionCall__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionCall__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group_1__0"


    // $ANTLR start "rule__FunctionCall__Group_1__0__Impl"
    // InternalBSharp.g:6349:1: rule__FunctionCall__Group_1__0__Impl : ( ( rule__FunctionCall__Alternatives_1_0 ) ) ;
    public final void rule__FunctionCall__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6353:1: ( ( ( rule__FunctionCall__Alternatives_1_0 ) ) )
            // InternalBSharp.g:6354:1: ( ( rule__FunctionCall__Alternatives_1_0 ) )
            {
            // InternalBSharp.g:6354:1: ( ( rule__FunctionCall__Alternatives_1_0 ) )
            // InternalBSharp.g:6355:2: ( rule__FunctionCall__Alternatives_1_0 )
            {
             before(grammarAccess.getFunctionCallAccess().getAlternatives_1_0()); 
            // InternalBSharp.g:6356:2: ( rule__FunctionCall__Alternatives_1_0 )
            // InternalBSharp.g:6356:3: rule__FunctionCall__Alternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__FunctionCall__Alternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionCallAccess().getAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group_1__0__Impl"


    // $ANTLR start "rule__FunctionCall__Group_1__1"
    // InternalBSharp.g:6364:1: rule__FunctionCall__Group_1__1 : rule__FunctionCall__Group_1__1__Impl rule__FunctionCall__Group_1__2 ;
    public final void rule__FunctionCall__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6368:1: ( rule__FunctionCall__Group_1__1__Impl rule__FunctionCall__Group_1__2 )
            // InternalBSharp.g:6369:2: rule__FunctionCall__Group_1__1__Impl rule__FunctionCall__Group_1__2
            {
            pushFollow(FOLLOW_35);
            rule__FunctionCall__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionCall__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group_1__1"


    // $ANTLR start "rule__FunctionCall__Group_1__1__Impl"
    // InternalBSharp.g:6376:1: rule__FunctionCall__Group_1__1__Impl : ( ( rule__FunctionCall__ContextAssignment_1_1 )? ) ;
    public final void rule__FunctionCall__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6380:1: ( ( ( rule__FunctionCall__ContextAssignment_1_1 )? ) )
            // InternalBSharp.g:6381:1: ( ( rule__FunctionCall__ContextAssignment_1_1 )? )
            {
            // InternalBSharp.g:6381:1: ( ( rule__FunctionCall__ContextAssignment_1_1 )? )
            // InternalBSharp.g:6382:2: ( rule__FunctionCall__ContextAssignment_1_1 )?
            {
             before(grammarAccess.getFunctionCallAccess().getContextAssignment_1_1()); 
            // InternalBSharp.g:6383:2: ( rule__FunctionCall__ContextAssignment_1_1 )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==43) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalBSharp.g:6383:3: rule__FunctionCall__ContextAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__FunctionCall__ContextAssignment_1_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFunctionCallAccess().getContextAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group_1__1__Impl"


    // $ANTLR start "rule__FunctionCall__Group_1__2"
    // InternalBSharp.g:6391:1: rule__FunctionCall__Group_1__2 : rule__FunctionCall__Group_1__2__Impl ;
    public final void rule__FunctionCall__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6395:1: ( rule__FunctionCall__Group_1__2__Impl )
            // InternalBSharp.g:6396:2: rule__FunctionCall__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FunctionCall__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group_1__2"


    // $ANTLR start "rule__FunctionCall__Group_1__2__Impl"
    // InternalBSharp.g:6402:1: rule__FunctionCall__Group_1__2__Impl : ( ( rule__FunctionCall__FuncCallArgsAssignment_1_2 )* ) ;
    public final void rule__FunctionCall__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6406:1: ( ( ( rule__FunctionCall__FuncCallArgsAssignment_1_2 )* ) )
            // InternalBSharp.g:6407:1: ( ( rule__FunctionCall__FuncCallArgsAssignment_1_2 )* )
            {
            // InternalBSharp.g:6407:1: ( ( rule__FunctionCall__FuncCallArgsAssignment_1_2 )* )
            // InternalBSharp.g:6408:2: ( rule__FunctionCall__FuncCallArgsAssignment_1_2 )*
            {
             before(grammarAccess.getFunctionCallAccess().getFuncCallArgsAssignment_1_2()); 
            // InternalBSharp.g:6409:2: ( rule__FunctionCall__FuncCallArgsAssignment_1_2 )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==41) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // InternalBSharp.g:6409:3: rule__FunctionCall__FuncCallArgsAssignment_1_2
            	    {
            	    pushFollow(FOLLOW_52);
            	    rule__FunctionCall__FuncCallArgsAssignment_1_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop57;
                }
            } while (true);

             after(grammarAccess.getFunctionCallAccess().getFuncCallArgsAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group_1__2__Impl"


    // $ANTLR start "rule__FuncCallArgs__Group__0"
    // InternalBSharp.g:6418:1: rule__FuncCallArgs__Group__0 : rule__FuncCallArgs__Group__0__Impl rule__FuncCallArgs__Group__1 ;
    public final void rule__FuncCallArgs__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6422:1: ( rule__FuncCallArgs__Group__0__Impl rule__FuncCallArgs__Group__1 )
            // InternalBSharp.g:6423:2: rule__FuncCallArgs__Group__0__Impl rule__FuncCallArgs__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__FuncCallArgs__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FuncCallArgs__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FuncCallArgs__Group__0"


    // $ANTLR start "rule__FuncCallArgs__Group__0__Impl"
    // InternalBSharp.g:6430:1: rule__FuncCallArgs__Group__0__Impl : ( () ) ;
    public final void rule__FuncCallArgs__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6434:1: ( ( () ) )
            // InternalBSharp.g:6435:1: ( () )
            {
            // InternalBSharp.g:6435:1: ( () )
            // InternalBSharp.g:6436:2: ()
            {
             before(grammarAccess.getFuncCallArgsAccess().getFuncCallArgsAction_0()); 
            // InternalBSharp.g:6437:2: ()
            // InternalBSharp.g:6437:3: 
            {
            }

             after(grammarAccess.getFuncCallArgsAccess().getFuncCallArgsAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FuncCallArgs__Group__0__Impl"


    // $ANTLR start "rule__FuncCallArgs__Group__1"
    // InternalBSharp.g:6445:1: rule__FuncCallArgs__Group__1 : rule__FuncCallArgs__Group__1__Impl ;
    public final void rule__FuncCallArgs__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6449:1: ( rule__FuncCallArgs__Group__1__Impl )
            // InternalBSharp.g:6450:2: rule__FuncCallArgs__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FuncCallArgs__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FuncCallArgs__Group__1"


    // $ANTLR start "rule__FuncCallArgs__Group__1__Impl"
    // InternalBSharp.g:6456:1: rule__FuncCallArgs__Group__1__Impl : ( ( rule__FuncCallArgs__Group_1__0 ) ) ;
    public final void rule__FuncCallArgs__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6460:1: ( ( ( rule__FuncCallArgs__Group_1__0 ) ) )
            // InternalBSharp.g:6461:1: ( ( rule__FuncCallArgs__Group_1__0 ) )
            {
            // InternalBSharp.g:6461:1: ( ( rule__FuncCallArgs__Group_1__0 ) )
            // InternalBSharp.g:6462:2: ( rule__FuncCallArgs__Group_1__0 )
            {
             before(grammarAccess.getFuncCallArgsAccess().getGroup_1()); 
            // InternalBSharp.g:6463:2: ( rule__FuncCallArgs__Group_1__0 )
            // InternalBSharp.g:6463:3: rule__FuncCallArgs__Group_1__0
            {
            pushFollow(FOLLOW_2);
            rule__FuncCallArgs__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getFuncCallArgsAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FuncCallArgs__Group__1__Impl"


    // $ANTLR start "rule__FuncCallArgs__Group_1__0"
    // InternalBSharp.g:6472:1: rule__FuncCallArgs__Group_1__0 : rule__FuncCallArgs__Group_1__0__Impl rule__FuncCallArgs__Group_1__1 ;
    public final void rule__FuncCallArgs__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6476:1: ( rule__FuncCallArgs__Group_1__0__Impl rule__FuncCallArgs__Group_1__1 )
            // InternalBSharp.g:6477:2: rule__FuncCallArgs__Group_1__0__Impl rule__FuncCallArgs__Group_1__1
            {
            pushFollow(FOLLOW_53);
            rule__FuncCallArgs__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FuncCallArgs__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FuncCallArgs__Group_1__0"


    // $ANTLR start "rule__FuncCallArgs__Group_1__0__Impl"
    // InternalBSharp.g:6484:1: rule__FuncCallArgs__Group_1__0__Impl : ( '(' ) ;
    public final void rule__FuncCallArgs__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6488:1: ( ( '(' ) )
            // InternalBSharp.g:6489:1: ( '(' )
            {
            // InternalBSharp.g:6489:1: ( '(' )
            // InternalBSharp.g:6490:2: '('
            {
             before(grammarAccess.getFuncCallArgsAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getFuncCallArgsAccess().getLeftParenthesisKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FuncCallArgs__Group_1__0__Impl"


    // $ANTLR start "rule__FuncCallArgs__Group_1__1"
    // InternalBSharp.g:6499:1: rule__FuncCallArgs__Group_1__1 : rule__FuncCallArgs__Group_1__1__Impl rule__FuncCallArgs__Group_1__2 ;
    public final void rule__FuncCallArgs__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6503:1: ( rule__FuncCallArgs__Group_1__1__Impl rule__FuncCallArgs__Group_1__2 )
            // InternalBSharp.g:6504:2: rule__FuncCallArgs__Group_1__1__Impl rule__FuncCallArgs__Group_1__2
            {
            pushFollow(FOLLOW_53);
            rule__FuncCallArgs__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FuncCallArgs__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FuncCallArgs__Group_1__1"


    // $ANTLR start "rule__FuncCallArgs__Group_1__1__Impl"
    // InternalBSharp.g:6511:1: rule__FuncCallArgs__Group_1__1__Impl : ( ( rule__FuncCallArgs__ArgumentsAssignment_1_1 )? ) ;
    public final void rule__FuncCallArgs__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6515:1: ( ( ( rule__FuncCallArgs__ArgumentsAssignment_1_1 )? ) )
            // InternalBSharp.g:6516:1: ( ( rule__FuncCallArgs__ArgumentsAssignment_1_1 )? )
            {
            // InternalBSharp.g:6516:1: ( ( rule__FuncCallArgs__ArgumentsAssignment_1_1 )? )
            // InternalBSharp.g:6517:2: ( rule__FuncCallArgs__ArgumentsAssignment_1_1 )?
            {
             before(grammarAccess.getFuncCallArgsAccess().getArgumentsAssignment_1_1()); 
            // InternalBSharp.g:6518:2: ( rule__FuncCallArgs__ArgumentsAssignment_1_1 )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==RULE_ID||LA58_0==11||(LA58_0>=23 && LA58_0<=24)||LA58_0==39||LA58_0==41||LA58_0==53||LA58_0==56||LA58_0==60) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalBSharp.g:6518:3: rule__FuncCallArgs__ArgumentsAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__FuncCallArgs__ArgumentsAssignment_1_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFuncCallArgsAccess().getArgumentsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FuncCallArgs__Group_1__1__Impl"


    // $ANTLR start "rule__FuncCallArgs__Group_1__2"
    // InternalBSharp.g:6526:1: rule__FuncCallArgs__Group_1__2 : rule__FuncCallArgs__Group_1__2__Impl rule__FuncCallArgs__Group_1__3 ;
    public final void rule__FuncCallArgs__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6530:1: ( rule__FuncCallArgs__Group_1__2__Impl rule__FuncCallArgs__Group_1__3 )
            // InternalBSharp.g:6531:2: rule__FuncCallArgs__Group_1__2__Impl rule__FuncCallArgs__Group_1__3
            {
            pushFollow(FOLLOW_53);
            rule__FuncCallArgs__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FuncCallArgs__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FuncCallArgs__Group_1__2"


    // $ANTLR start "rule__FuncCallArgs__Group_1__2__Impl"
    // InternalBSharp.g:6538:1: rule__FuncCallArgs__Group_1__2__Impl : ( ( rule__FuncCallArgs__Group_1_2__0 )* ) ;
    public final void rule__FuncCallArgs__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6542:1: ( ( ( rule__FuncCallArgs__Group_1_2__0 )* ) )
            // InternalBSharp.g:6543:1: ( ( rule__FuncCallArgs__Group_1_2__0 )* )
            {
            // InternalBSharp.g:6543:1: ( ( rule__FuncCallArgs__Group_1_2__0 )* )
            // InternalBSharp.g:6544:2: ( rule__FuncCallArgs__Group_1_2__0 )*
            {
             before(grammarAccess.getFuncCallArgsAccess().getGroup_1_2()); 
            // InternalBSharp.g:6545:2: ( rule__FuncCallArgs__Group_1_2__0 )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==45) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // InternalBSharp.g:6545:3: rule__FuncCallArgs__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__FuncCallArgs__Group_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop59;
                }
            } while (true);

             after(grammarAccess.getFuncCallArgsAccess().getGroup_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FuncCallArgs__Group_1__2__Impl"


    // $ANTLR start "rule__FuncCallArgs__Group_1__3"
    // InternalBSharp.g:6553:1: rule__FuncCallArgs__Group_1__3 : rule__FuncCallArgs__Group_1__3__Impl ;
    public final void rule__FuncCallArgs__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6557:1: ( rule__FuncCallArgs__Group_1__3__Impl )
            // InternalBSharp.g:6558:2: rule__FuncCallArgs__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FuncCallArgs__Group_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FuncCallArgs__Group_1__3"


    // $ANTLR start "rule__FuncCallArgs__Group_1__3__Impl"
    // InternalBSharp.g:6564:1: rule__FuncCallArgs__Group_1__3__Impl : ( ')' ) ;
    public final void rule__FuncCallArgs__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6568:1: ( ( ')' ) )
            // InternalBSharp.g:6569:1: ( ')' )
            {
            // InternalBSharp.g:6569:1: ( ')' )
            // InternalBSharp.g:6570:2: ')'
            {
             before(grammarAccess.getFuncCallArgsAccess().getRightParenthesisKeyword_1_3()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getFuncCallArgsAccess().getRightParenthesisKeyword_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FuncCallArgs__Group_1__3__Impl"


    // $ANTLR start "rule__FuncCallArgs__Group_1_2__0"
    // InternalBSharp.g:6580:1: rule__FuncCallArgs__Group_1_2__0 : rule__FuncCallArgs__Group_1_2__0__Impl rule__FuncCallArgs__Group_1_2__1 ;
    public final void rule__FuncCallArgs__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6584:1: ( rule__FuncCallArgs__Group_1_2__0__Impl rule__FuncCallArgs__Group_1_2__1 )
            // InternalBSharp.g:6585:2: rule__FuncCallArgs__Group_1_2__0__Impl rule__FuncCallArgs__Group_1_2__1
            {
            pushFollow(FOLLOW_28);
            rule__FuncCallArgs__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FuncCallArgs__Group_1_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FuncCallArgs__Group_1_2__0"


    // $ANTLR start "rule__FuncCallArgs__Group_1_2__0__Impl"
    // InternalBSharp.g:6592:1: rule__FuncCallArgs__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__FuncCallArgs__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6596:1: ( ( ',' ) )
            // InternalBSharp.g:6597:1: ( ',' )
            {
            // InternalBSharp.g:6597:1: ( ',' )
            // InternalBSharp.g:6598:2: ','
            {
             before(grammarAccess.getFuncCallArgsAccess().getCommaKeyword_1_2_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getFuncCallArgsAccess().getCommaKeyword_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FuncCallArgs__Group_1_2__0__Impl"


    // $ANTLR start "rule__FuncCallArgs__Group_1_2__1"
    // InternalBSharp.g:6607:1: rule__FuncCallArgs__Group_1_2__1 : rule__FuncCallArgs__Group_1_2__1__Impl ;
    public final void rule__FuncCallArgs__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6611:1: ( rule__FuncCallArgs__Group_1_2__1__Impl )
            // InternalBSharp.g:6612:2: rule__FuncCallArgs__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FuncCallArgs__Group_1_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FuncCallArgs__Group_1_2__1"


    // $ANTLR start "rule__FuncCallArgs__Group_1_2__1__Impl"
    // InternalBSharp.g:6618:1: rule__FuncCallArgs__Group_1_2__1__Impl : ( ( rule__FuncCallArgs__ArgumentsAssignment_1_2_1 ) ) ;
    public final void rule__FuncCallArgs__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6622:1: ( ( ( rule__FuncCallArgs__ArgumentsAssignment_1_2_1 ) ) )
            // InternalBSharp.g:6623:1: ( ( rule__FuncCallArgs__ArgumentsAssignment_1_2_1 ) )
            {
            // InternalBSharp.g:6623:1: ( ( rule__FuncCallArgs__ArgumentsAssignment_1_2_1 ) )
            // InternalBSharp.g:6624:2: ( rule__FuncCallArgs__ArgumentsAssignment_1_2_1 )
            {
             before(grammarAccess.getFuncCallArgsAccess().getArgumentsAssignment_1_2_1()); 
            // InternalBSharp.g:6625:2: ( rule__FuncCallArgs__ArgumentsAssignment_1_2_1 )
            // InternalBSharp.g:6625:3: rule__FuncCallArgs__ArgumentsAssignment_1_2_1
            {
            pushFollow(FOLLOW_2);
            rule__FuncCallArgs__ArgumentsAssignment_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getFuncCallArgsAccess().getArgumentsAssignment_1_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FuncCallArgs__Group_1_2__1__Impl"


    // $ANTLR start "rule__IfElse__Group__0"
    // InternalBSharp.g:6634:1: rule__IfElse__Group__0 : rule__IfElse__Group__0__Impl rule__IfElse__Group__1 ;
    public final void rule__IfElse__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6638:1: ( rule__IfElse__Group__0__Impl rule__IfElse__Group__1 )
            // InternalBSharp.g:6639:2: rule__IfElse__Group__0__Impl rule__IfElse__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__IfElse__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfElse__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfElse__Group__0"


    // $ANTLR start "rule__IfElse__Group__0__Impl"
    // InternalBSharp.g:6646:1: rule__IfElse__Group__0__Impl : ( 'if' ) ;
    public final void rule__IfElse__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6650:1: ( ( 'if' ) )
            // InternalBSharp.g:6651:1: ( 'if' )
            {
            // InternalBSharp.g:6651:1: ( 'if' )
            // InternalBSharp.g:6652:2: 'if'
            {
             before(grammarAccess.getIfElseAccess().getIfKeyword_0()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getIfElseAccess().getIfKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfElse__Group__0__Impl"


    // $ANTLR start "rule__IfElse__Group__1"
    // InternalBSharp.g:6661:1: rule__IfElse__Group__1 : rule__IfElse__Group__1__Impl rule__IfElse__Group__2 ;
    public final void rule__IfElse__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6665:1: ( rule__IfElse__Group__1__Impl rule__IfElse__Group__2 )
            // InternalBSharp.g:6666:2: rule__IfElse__Group__1__Impl rule__IfElse__Group__2
            {
            pushFollow(FOLLOW_38);
            rule__IfElse__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfElse__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfElse__Group__1"


    // $ANTLR start "rule__IfElse__Group__1__Impl"
    // InternalBSharp.g:6673:1: rule__IfElse__Group__1__Impl : ( ( rule__IfElse__ConditionAssignment_1 ) ) ;
    public final void rule__IfElse__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6677:1: ( ( ( rule__IfElse__ConditionAssignment_1 ) ) )
            // InternalBSharp.g:6678:1: ( ( rule__IfElse__ConditionAssignment_1 ) )
            {
            // InternalBSharp.g:6678:1: ( ( rule__IfElse__ConditionAssignment_1 ) )
            // InternalBSharp.g:6679:2: ( rule__IfElse__ConditionAssignment_1 )
            {
             before(grammarAccess.getIfElseAccess().getConditionAssignment_1()); 
            // InternalBSharp.g:6680:2: ( rule__IfElse__ConditionAssignment_1 )
            // InternalBSharp.g:6680:3: rule__IfElse__ConditionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__IfElse__ConditionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getIfElseAccess().getConditionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfElse__Group__1__Impl"


    // $ANTLR start "rule__IfElse__Group__2"
    // InternalBSharp.g:6688:1: rule__IfElse__Group__2 : rule__IfElse__Group__2__Impl rule__IfElse__Group__3 ;
    public final void rule__IfElse__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6692:1: ( rule__IfElse__Group__2__Impl rule__IfElse__Group__3 )
            // InternalBSharp.g:6693:2: rule__IfElse__Group__2__Impl rule__IfElse__Group__3
            {
            pushFollow(FOLLOW_28);
            rule__IfElse__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfElse__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfElse__Group__2"


    // $ANTLR start "rule__IfElse__Group__2__Impl"
    // InternalBSharp.g:6700:1: rule__IfElse__Group__2__Impl : ( '{' ) ;
    public final void rule__IfElse__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6704:1: ( ( '{' ) )
            // InternalBSharp.g:6705:1: ( '{' )
            {
            // InternalBSharp.g:6705:1: ( '{' )
            // InternalBSharp.g:6706:2: '{'
            {
             before(grammarAccess.getIfElseAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getIfElseAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfElse__Group__2__Impl"


    // $ANTLR start "rule__IfElse__Group__3"
    // InternalBSharp.g:6715:1: rule__IfElse__Group__3 : rule__IfElse__Group__3__Impl rule__IfElse__Group__4 ;
    public final void rule__IfElse__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6719:1: ( rule__IfElse__Group__3__Impl rule__IfElse__Group__4 )
            // InternalBSharp.g:6720:2: rule__IfElse__Group__3__Impl rule__IfElse__Group__4
            {
            pushFollow(FOLLOW_45);
            rule__IfElse__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfElse__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfElse__Group__3"


    // $ANTLR start "rule__IfElse__Group__3__Impl"
    // InternalBSharp.g:6727:1: rule__IfElse__Group__3__Impl : ( ( rule__IfElse__IfTrueExprAssignment_3 ) ) ;
    public final void rule__IfElse__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6731:1: ( ( ( rule__IfElse__IfTrueExprAssignment_3 ) ) )
            // InternalBSharp.g:6732:1: ( ( rule__IfElse__IfTrueExprAssignment_3 ) )
            {
            // InternalBSharp.g:6732:1: ( ( rule__IfElse__IfTrueExprAssignment_3 ) )
            // InternalBSharp.g:6733:2: ( rule__IfElse__IfTrueExprAssignment_3 )
            {
             before(grammarAccess.getIfElseAccess().getIfTrueExprAssignment_3()); 
            // InternalBSharp.g:6734:2: ( rule__IfElse__IfTrueExprAssignment_3 )
            // InternalBSharp.g:6734:3: rule__IfElse__IfTrueExprAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__IfElse__IfTrueExprAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getIfElseAccess().getIfTrueExprAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfElse__Group__3__Impl"


    // $ANTLR start "rule__IfElse__Group__4"
    // InternalBSharp.g:6742:1: rule__IfElse__Group__4 : rule__IfElse__Group__4__Impl rule__IfElse__Group__5 ;
    public final void rule__IfElse__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6746:1: ( rule__IfElse__Group__4__Impl rule__IfElse__Group__5 )
            // InternalBSharp.g:6747:2: rule__IfElse__Group__4__Impl rule__IfElse__Group__5
            {
            pushFollow(FOLLOW_54);
            rule__IfElse__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfElse__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfElse__Group__4"


    // $ANTLR start "rule__IfElse__Group__4__Impl"
    // InternalBSharp.g:6754:1: rule__IfElse__Group__4__Impl : ( '}' ) ;
    public final void rule__IfElse__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6758:1: ( ( '}' ) )
            // InternalBSharp.g:6759:1: ( '}' )
            {
            // InternalBSharp.g:6759:1: ( '}' )
            // InternalBSharp.g:6760:2: '}'
            {
             before(grammarAccess.getIfElseAccess().getRightCurlyBracketKeyword_4()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getIfElseAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfElse__Group__4__Impl"


    // $ANTLR start "rule__IfElse__Group__5"
    // InternalBSharp.g:6769:1: rule__IfElse__Group__5 : rule__IfElse__Group__5__Impl rule__IfElse__Group__6 ;
    public final void rule__IfElse__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6773:1: ( rule__IfElse__Group__5__Impl rule__IfElse__Group__6 )
            // InternalBSharp.g:6774:2: rule__IfElse__Group__5__Impl rule__IfElse__Group__6
            {
            pushFollow(FOLLOW_38);
            rule__IfElse__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfElse__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfElse__Group__5"


    // $ANTLR start "rule__IfElse__Group__5__Impl"
    // InternalBSharp.g:6781:1: rule__IfElse__Group__5__Impl : ( 'else' ) ;
    public final void rule__IfElse__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6785:1: ( ( 'else' ) )
            // InternalBSharp.g:6786:1: ( 'else' )
            {
            // InternalBSharp.g:6786:1: ( 'else' )
            // InternalBSharp.g:6787:2: 'else'
            {
             before(grammarAccess.getIfElseAccess().getElseKeyword_5()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getIfElseAccess().getElseKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfElse__Group__5__Impl"


    // $ANTLR start "rule__IfElse__Group__6"
    // InternalBSharp.g:6796:1: rule__IfElse__Group__6 : rule__IfElse__Group__6__Impl rule__IfElse__Group__7 ;
    public final void rule__IfElse__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6800:1: ( rule__IfElse__Group__6__Impl rule__IfElse__Group__7 )
            // InternalBSharp.g:6801:2: rule__IfElse__Group__6__Impl rule__IfElse__Group__7
            {
            pushFollow(FOLLOW_28);
            rule__IfElse__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfElse__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfElse__Group__6"


    // $ANTLR start "rule__IfElse__Group__6__Impl"
    // InternalBSharp.g:6808:1: rule__IfElse__Group__6__Impl : ( '{' ) ;
    public final void rule__IfElse__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6812:1: ( ( '{' ) )
            // InternalBSharp.g:6813:1: ( '{' )
            {
            // InternalBSharp.g:6813:1: ( '{' )
            // InternalBSharp.g:6814:2: '{'
            {
             before(grammarAccess.getIfElseAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getIfElseAccess().getLeftCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfElse__Group__6__Impl"


    // $ANTLR start "rule__IfElse__Group__7"
    // InternalBSharp.g:6823:1: rule__IfElse__Group__7 : rule__IfElse__Group__7__Impl rule__IfElse__Group__8 ;
    public final void rule__IfElse__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6827:1: ( rule__IfElse__Group__7__Impl rule__IfElse__Group__8 )
            // InternalBSharp.g:6828:2: rule__IfElse__Group__7__Impl rule__IfElse__Group__8
            {
            pushFollow(FOLLOW_45);
            rule__IfElse__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfElse__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfElse__Group__7"


    // $ANTLR start "rule__IfElse__Group__7__Impl"
    // InternalBSharp.g:6835:1: rule__IfElse__Group__7__Impl : ( ( rule__IfElse__IfFalseExprAssignment_7 ) ) ;
    public final void rule__IfElse__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6839:1: ( ( ( rule__IfElse__IfFalseExprAssignment_7 ) ) )
            // InternalBSharp.g:6840:1: ( ( rule__IfElse__IfFalseExprAssignment_7 ) )
            {
            // InternalBSharp.g:6840:1: ( ( rule__IfElse__IfFalseExprAssignment_7 ) )
            // InternalBSharp.g:6841:2: ( rule__IfElse__IfFalseExprAssignment_7 )
            {
             before(grammarAccess.getIfElseAccess().getIfFalseExprAssignment_7()); 
            // InternalBSharp.g:6842:2: ( rule__IfElse__IfFalseExprAssignment_7 )
            // InternalBSharp.g:6842:3: rule__IfElse__IfFalseExprAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__IfElse__IfFalseExprAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getIfElseAccess().getIfFalseExprAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfElse__Group__7__Impl"


    // $ANTLR start "rule__IfElse__Group__8"
    // InternalBSharp.g:6850:1: rule__IfElse__Group__8 : rule__IfElse__Group__8__Impl ;
    public final void rule__IfElse__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6854:1: ( rule__IfElse__Group__8__Impl )
            // InternalBSharp.g:6855:2: rule__IfElse__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IfElse__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfElse__Group__8"


    // $ANTLR start "rule__IfElse__Group__8__Impl"
    // InternalBSharp.g:6861:1: rule__IfElse__Group__8__Impl : ( '}' ) ;
    public final void rule__IfElse__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6865:1: ( ( '}' ) )
            // InternalBSharp.g:6866:1: ( '}' )
            {
            // InternalBSharp.g:6866:1: ( '}' )
            // InternalBSharp.g:6867:2: '}'
            {
             before(grammarAccess.getIfElseAccess().getRightCurlyBracketKeyword_8()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getIfElseAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfElse__Group__8__Impl"


    // $ANTLR start "rule__ClassVarDecl__Group__0"
    // InternalBSharp.g:6877:1: rule__ClassVarDecl__Group__0 : rule__ClassVarDecl__Group__0__Impl rule__ClassVarDecl__Group__1 ;
    public final void rule__ClassVarDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6881:1: ( rule__ClassVarDecl__Group__0__Impl rule__ClassVarDecl__Group__1 )
            // InternalBSharp.g:6882:2: rule__ClassVarDecl__Group__0__Impl rule__ClassVarDecl__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__ClassVarDecl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassVarDecl__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassVarDecl__Group__0"


    // $ANTLR start "rule__ClassVarDecl__Group__0__Impl"
    // InternalBSharp.g:6889:1: rule__ClassVarDecl__Group__0__Impl : ( ( rule__ClassVarDecl__OwnerTypeAssignment_0 ) ) ;
    public final void rule__ClassVarDecl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6893:1: ( ( ( rule__ClassVarDecl__OwnerTypeAssignment_0 ) ) )
            // InternalBSharp.g:6894:1: ( ( rule__ClassVarDecl__OwnerTypeAssignment_0 ) )
            {
            // InternalBSharp.g:6894:1: ( ( rule__ClassVarDecl__OwnerTypeAssignment_0 ) )
            // InternalBSharp.g:6895:2: ( rule__ClassVarDecl__OwnerTypeAssignment_0 )
            {
             before(grammarAccess.getClassVarDeclAccess().getOwnerTypeAssignment_0()); 
            // InternalBSharp.g:6896:2: ( rule__ClassVarDecl__OwnerTypeAssignment_0 )
            // InternalBSharp.g:6896:3: rule__ClassVarDecl__OwnerTypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ClassVarDecl__OwnerTypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getClassVarDeclAccess().getOwnerTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassVarDecl__Group__0__Impl"


    // $ANTLR start "rule__ClassVarDecl__Group__1"
    // InternalBSharp.g:6904:1: rule__ClassVarDecl__Group__1 : rule__ClassVarDecl__Group__1__Impl rule__ClassVarDecl__Group__2 ;
    public final void rule__ClassVarDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6908:1: ( rule__ClassVarDecl__Group__1__Impl rule__ClassVarDecl__Group__2 )
            // InternalBSharp.g:6909:2: rule__ClassVarDecl__Group__1__Impl rule__ClassVarDecl__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__ClassVarDecl__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassVarDecl__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassVarDecl__Group__1"


    // $ANTLR start "rule__ClassVarDecl__Group__1__Impl"
    // InternalBSharp.g:6916:1: rule__ClassVarDecl__Group__1__Impl : ( '.' ) ;
    public final void rule__ClassVarDecl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6920:1: ( ( '.' ) )
            // InternalBSharp.g:6921:1: ( '.' )
            {
            // InternalBSharp.g:6921:1: ( '.' )
            // InternalBSharp.g:6922:2: '.'
            {
             before(grammarAccess.getClassVarDeclAccess().getFullStopKeyword_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getClassVarDeclAccess().getFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassVarDecl__Group__1__Impl"


    // $ANTLR start "rule__ClassVarDecl__Group__2"
    // InternalBSharp.g:6931:1: rule__ClassVarDecl__Group__2 : rule__ClassVarDecl__Group__2__Impl ;
    public final void rule__ClassVarDecl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6935:1: ( rule__ClassVarDecl__Group__2__Impl )
            // InternalBSharp.g:6936:2: rule__ClassVarDecl__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ClassVarDecl__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassVarDecl__Group__2"


    // $ANTLR start "rule__ClassVarDecl__Group__2__Impl"
    // InternalBSharp.g:6942:1: rule__ClassVarDecl__Group__2__Impl : ( ( rule__ClassVarDecl__TypeInstAssignment_2 ) ) ;
    public final void rule__ClassVarDecl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6946:1: ( ( ( rule__ClassVarDecl__TypeInstAssignment_2 ) ) )
            // InternalBSharp.g:6947:1: ( ( rule__ClassVarDecl__TypeInstAssignment_2 ) )
            {
            // InternalBSharp.g:6947:1: ( ( rule__ClassVarDecl__TypeInstAssignment_2 ) )
            // InternalBSharp.g:6948:2: ( rule__ClassVarDecl__TypeInstAssignment_2 )
            {
             before(grammarAccess.getClassVarDeclAccess().getTypeInstAssignment_2()); 
            // InternalBSharp.g:6949:2: ( rule__ClassVarDecl__TypeInstAssignment_2 )
            // InternalBSharp.g:6949:3: rule__ClassVarDecl__TypeInstAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ClassVarDecl__TypeInstAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getClassVarDeclAccess().getTypeInstAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassVarDecl__Group__2__Impl"


    // $ANTLR start "rule__WrappedInfix__Group__0"
    // InternalBSharp.g:6958:1: rule__WrappedInfix__Group__0 : rule__WrappedInfix__Group__0__Impl rule__WrappedInfix__Group__1 ;
    public final void rule__WrappedInfix__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6962:1: ( rule__WrappedInfix__Group__0__Impl rule__WrappedInfix__Group__1 )
            // InternalBSharp.g:6963:2: rule__WrappedInfix__Group__0__Impl rule__WrappedInfix__Group__1
            {
            pushFollow(FOLLOW_50);
            rule__WrappedInfix__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WrappedInfix__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WrappedInfix__Group__0"


    // $ANTLR start "rule__WrappedInfix__Group__0__Impl"
    // InternalBSharp.g:6970:1: rule__WrappedInfix__Group__0__Impl : ( '[' ) ;
    public final void rule__WrappedInfix__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6974:1: ( ( '[' ) )
            // InternalBSharp.g:6975:1: ( '[' )
            {
            // InternalBSharp.g:6975:1: ( '[' )
            // InternalBSharp.g:6976:2: '['
            {
             before(grammarAccess.getWrappedInfixAccess().getLeftSquareBracketKeyword_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getWrappedInfixAccess().getLeftSquareBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WrappedInfix__Group__0__Impl"


    // $ANTLR start "rule__WrappedInfix__Group__1"
    // InternalBSharp.g:6985:1: rule__WrappedInfix__Group__1 : rule__WrappedInfix__Group__1__Impl rule__WrappedInfix__Group__2 ;
    public final void rule__WrappedInfix__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6989:1: ( rule__WrappedInfix__Group__1__Impl rule__WrappedInfix__Group__2 )
            // InternalBSharp.g:6990:2: rule__WrappedInfix__Group__1__Impl rule__WrappedInfix__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__WrappedInfix__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WrappedInfix__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WrappedInfix__Group__1"


    // $ANTLR start "rule__WrappedInfix__Group__1__Impl"
    // InternalBSharp.g:6997:1: rule__WrappedInfix__Group__1__Impl : ( ( rule__WrappedInfix__Alternatives_1 ) ) ;
    public final void rule__WrappedInfix__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7001:1: ( ( ( rule__WrappedInfix__Alternatives_1 ) ) )
            // InternalBSharp.g:7002:1: ( ( rule__WrappedInfix__Alternatives_1 ) )
            {
            // InternalBSharp.g:7002:1: ( ( rule__WrappedInfix__Alternatives_1 ) )
            // InternalBSharp.g:7003:2: ( rule__WrappedInfix__Alternatives_1 )
            {
             before(grammarAccess.getWrappedInfixAccess().getAlternatives_1()); 
            // InternalBSharp.g:7004:2: ( rule__WrappedInfix__Alternatives_1 )
            // InternalBSharp.g:7004:3: rule__WrappedInfix__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__WrappedInfix__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getWrappedInfixAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WrappedInfix__Group__1__Impl"


    // $ANTLR start "rule__WrappedInfix__Group__2"
    // InternalBSharp.g:7012:1: rule__WrappedInfix__Group__2 : rule__WrappedInfix__Group__2__Impl ;
    public final void rule__WrappedInfix__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7016:1: ( rule__WrappedInfix__Group__2__Impl )
            // InternalBSharp.g:7017:2: rule__WrappedInfix__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WrappedInfix__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WrappedInfix__Group__2"


    // $ANTLR start "rule__WrappedInfix__Group__2__Impl"
    // InternalBSharp.g:7023:1: rule__WrappedInfix__Group__2__Impl : ( ']' ) ;
    public final void rule__WrappedInfix__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7027:1: ( ( ']' ) )
            // InternalBSharp.g:7028:1: ( ']' )
            {
            // InternalBSharp.g:7028:1: ( ']' )
            // InternalBSharp.g:7029:2: ']'
            {
             before(grammarAccess.getWrappedInfixAccess().getRightSquareBracketKeyword_2()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getWrappedInfixAccess().getRightSquareBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WrappedInfix__Group__2__Impl"


    // $ANTLR start "rule__Instance__Group__0"
    // InternalBSharp.g:7039:1: rule__Instance__Group__0 : rule__Instance__Group__0__Impl rule__Instance__Group__1 ;
    public final void rule__Instance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7043:1: ( rule__Instance__Group__0__Impl rule__Instance__Group__1 )
            // InternalBSharp.g:7044:2: rule__Instance__Group__0__Impl rule__Instance__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Instance__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Instance__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__Group__0"


    // $ANTLR start "rule__Instance__Group__0__Impl"
    // InternalBSharp.g:7051:1: rule__Instance__Group__0__Impl : ( 'Instance' ) ;
    public final void rule__Instance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7055:1: ( ( 'Instance' ) )
            // InternalBSharp.g:7056:1: ( 'Instance' )
            {
            // InternalBSharp.g:7056:1: ( 'Instance' )
            // InternalBSharp.g:7057:2: 'Instance'
            {
             before(grammarAccess.getInstanceAccess().getInstanceKeyword_0()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getInstanceAccess().getInstanceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__Group__0__Impl"


    // $ANTLR start "rule__Instance__Group__1"
    // InternalBSharp.g:7066:1: rule__Instance__Group__1 : rule__Instance__Group__1__Impl rule__Instance__Group__2 ;
    public final void rule__Instance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7070:1: ( rule__Instance__Group__1__Impl rule__Instance__Group__2 )
            // InternalBSharp.g:7071:2: rule__Instance__Group__1__Impl rule__Instance__Group__2
            {
            pushFollow(FOLLOW_25);
            rule__Instance__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Instance__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__Group__1"


    // $ANTLR start "rule__Instance__Group__1__Impl"
    // InternalBSharp.g:7078:1: rule__Instance__Group__1__Impl : ( ( rule__Instance__ClassNameAssignment_1 ) ) ;
    public final void rule__Instance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7082:1: ( ( ( rule__Instance__ClassNameAssignment_1 ) ) )
            // InternalBSharp.g:7083:1: ( ( rule__Instance__ClassNameAssignment_1 ) )
            {
            // InternalBSharp.g:7083:1: ( ( rule__Instance__ClassNameAssignment_1 ) )
            // InternalBSharp.g:7084:2: ( rule__Instance__ClassNameAssignment_1 )
            {
             before(grammarAccess.getInstanceAccess().getClassNameAssignment_1()); 
            // InternalBSharp.g:7085:2: ( rule__Instance__ClassNameAssignment_1 )
            // InternalBSharp.g:7085:3: rule__Instance__ClassNameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Instance__ClassNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInstanceAccess().getClassNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__Group__1__Impl"


    // $ANTLR start "rule__Instance__Group__2"
    // InternalBSharp.g:7093:1: rule__Instance__Group__2 : rule__Instance__Group__2__Impl rule__Instance__Group__3 ;
    public final void rule__Instance__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7097:1: ( rule__Instance__Group__2__Impl rule__Instance__Group__3 )
            // InternalBSharp.g:7098:2: rule__Instance__Group__2__Impl rule__Instance__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Instance__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Instance__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__Group__2"


    // $ANTLR start "rule__Instance__Group__2__Impl"
    // InternalBSharp.g:7105:1: rule__Instance__Group__2__Impl : ( '<' ) ;
    public final void rule__Instance__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7109:1: ( ( '<' ) )
            // InternalBSharp.g:7110:1: ( '<' )
            {
            // InternalBSharp.g:7110:1: ( '<' )
            // InternalBSharp.g:7111:2: '<'
            {
             before(grammarAccess.getInstanceAccess().getLessThanSignKeyword_2()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getInstanceAccess().getLessThanSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__Group__2__Impl"


    // $ANTLR start "rule__Instance__Group__3"
    // InternalBSharp.g:7120:1: rule__Instance__Group__3 : rule__Instance__Group__3__Impl rule__Instance__Group__4 ;
    public final void rule__Instance__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7124:1: ( rule__Instance__Group__3__Impl rule__Instance__Group__4 )
            // InternalBSharp.g:7125:2: rule__Instance__Group__3__Impl rule__Instance__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__Instance__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Instance__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__Group__3"


    // $ANTLR start "rule__Instance__Group__3__Impl"
    // InternalBSharp.g:7132:1: rule__Instance__Group__3__Impl : ( ( ( rule__Instance__ContextAssignment_3 ) ) ( ( rule__Instance__ContextAssignment_3 )* ) ) ;
    public final void rule__Instance__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7136:1: ( ( ( ( rule__Instance__ContextAssignment_3 ) ) ( ( rule__Instance__ContextAssignment_3 )* ) ) )
            // InternalBSharp.g:7137:1: ( ( ( rule__Instance__ContextAssignment_3 ) ) ( ( rule__Instance__ContextAssignment_3 )* ) )
            {
            // InternalBSharp.g:7137:1: ( ( ( rule__Instance__ContextAssignment_3 ) ) ( ( rule__Instance__ContextAssignment_3 )* ) )
            // InternalBSharp.g:7138:2: ( ( rule__Instance__ContextAssignment_3 ) ) ( ( rule__Instance__ContextAssignment_3 )* )
            {
            // InternalBSharp.g:7138:2: ( ( rule__Instance__ContextAssignment_3 ) )
            // InternalBSharp.g:7139:3: ( rule__Instance__ContextAssignment_3 )
            {
             before(grammarAccess.getInstanceAccess().getContextAssignment_3()); 
            // InternalBSharp.g:7140:3: ( rule__Instance__ContextAssignment_3 )
            // InternalBSharp.g:7140:4: rule__Instance__ContextAssignment_3
            {
            pushFollow(FOLLOW_13);
            rule__Instance__ContextAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getInstanceAccess().getContextAssignment_3()); 

            }

            // InternalBSharp.g:7143:2: ( ( rule__Instance__ContextAssignment_3 )* )
            // InternalBSharp.g:7144:3: ( rule__Instance__ContextAssignment_3 )*
            {
             before(grammarAccess.getInstanceAccess().getContextAssignment_3()); 
            // InternalBSharp.g:7145:3: ( rule__Instance__ContextAssignment_3 )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==RULE_ID) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // InternalBSharp.g:7145:4: rule__Instance__ContextAssignment_3
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Instance__ContextAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop60;
                }
            } while (true);

             after(grammarAccess.getInstanceAccess().getContextAssignment_3()); 

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
    // $ANTLR end "rule__Instance__Group__3__Impl"


    // $ANTLR start "rule__Instance__Group__4"
    // InternalBSharp.g:7154:1: rule__Instance__Group__4 : rule__Instance__Group__4__Impl rule__Instance__Group__5 ;
    public final void rule__Instance__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7158:1: ( rule__Instance__Group__4__Impl rule__Instance__Group__5 )
            // InternalBSharp.g:7159:2: rule__Instance__Group__4__Impl rule__Instance__Group__5
            {
            pushFollow(FOLLOW_26);
            rule__Instance__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Instance__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__Group__4"


    // $ANTLR start "rule__Instance__Group__4__Impl"
    // InternalBSharp.g:7166:1: rule__Instance__Group__4__Impl : ( '>' ) ;
    public final void rule__Instance__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7170:1: ( ( '>' ) )
            // InternalBSharp.g:7171:1: ( '>' )
            {
            // InternalBSharp.g:7171:1: ( '>' )
            // InternalBSharp.g:7172:2: '>'
            {
             before(grammarAccess.getInstanceAccess().getGreaterThanSignKeyword_4()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getInstanceAccess().getGreaterThanSignKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__Group__4__Impl"


    // $ANTLR start "rule__Instance__Group__5"
    // InternalBSharp.g:7181:1: rule__Instance__Group__5 : rule__Instance__Group__5__Impl rule__Instance__Group__6 ;
    public final void rule__Instance__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7185:1: ( rule__Instance__Group__5__Impl rule__Instance__Group__6 )
            // InternalBSharp.g:7186:2: rule__Instance__Group__5__Impl rule__Instance__Group__6
            {
            pushFollow(FOLLOW_53);
            rule__Instance__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Instance__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__Group__5"


    // $ANTLR start "rule__Instance__Group__5__Impl"
    // InternalBSharp.g:7193:1: rule__Instance__Group__5__Impl : ( '(' ) ;
    public final void rule__Instance__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7197:1: ( ( '(' ) )
            // InternalBSharp.g:7198:1: ( '(' )
            {
            // InternalBSharp.g:7198:1: ( '(' )
            // InternalBSharp.g:7199:2: '('
            {
             before(grammarAccess.getInstanceAccess().getLeftParenthesisKeyword_5()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getInstanceAccess().getLeftParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__Group__5__Impl"


    // $ANTLR start "rule__Instance__Group__6"
    // InternalBSharp.g:7208:1: rule__Instance__Group__6 : rule__Instance__Group__6__Impl rule__Instance__Group__7 ;
    public final void rule__Instance__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7212:1: ( rule__Instance__Group__6__Impl rule__Instance__Group__7 )
            // InternalBSharp.g:7213:2: rule__Instance__Group__6__Impl rule__Instance__Group__7
            {
            pushFollow(FOLLOW_53);
            rule__Instance__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Instance__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__Group__6"


    // $ANTLR start "rule__Instance__Group__6__Impl"
    // InternalBSharp.g:7220:1: rule__Instance__Group__6__Impl : ( ( rule__Instance__ArgumentsAssignment_6 )? ) ;
    public final void rule__Instance__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7224:1: ( ( ( rule__Instance__ArgumentsAssignment_6 )? ) )
            // InternalBSharp.g:7225:1: ( ( rule__Instance__ArgumentsAssignment_6 )? )
            {
            // InternalBSharp.g:7225:1: ( ( rule__Instance__ArgumentsAssignment_6 )? )
            // InternalBSharp.g:7226:2: ( rule__Instance__ArgumentsAssignment_6 )?
            {
             before(grammarAccess.getInstanceAccess().getArgumentsAssignment_6()); 
            // InternalBSharp.g:7227:2: ( rule__Instance__ArgumentsAssignment_6 )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==RULE_ID||LA61_0==11||(LA61_0>=23 && LA61_0<=24)||LA61_0==39||LA61_0==41||LA61_0==53||LA61_0==56||LA61_0==60) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalBSharp.g:7227:3: rule__Instance__ArgumentsAssignment_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__Instance__ArgumentsAssignment_6();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInstanceAccess().getArgumentsAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__Group__6__Impl"


    // $ANTLR start "rule__Instance__Group__7"
    // InternalBSharp.g:7235:1: rule__Instance__Group__7 : rule__Instance__Group__7__Impl rule__Instance__Group__8 ;
    public final void rule__Instance__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7239:1: ( rule__Instance__Group__7__Impl rule__Instance__Group__8 )
            // InternalBSharp.g:7240:2: rule__Instance__Group__7__Impl rule__Instance__Group__8
            {
            pushFollow(FOLLOW_53);
            rule__Instance__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Instance__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__Group__7"


    // $ANTLR start "rule__Instance__Group__7__Impl"
    // InternalBSharp.g:7247:1: rule__Instance__Group__7__Impl : ( ( rule__Instance__Group_7__0 )* ) ;
    public final void rule__Instance__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7251:1: ( ( ( rule__Instance__Group_7__0 )* ) )
            // InternalBSharp.g:7252:1: ( ( rule__Instance__Group_7__0 )* )
            {
            // InternalBSharp.g:7252:1: ( ( rule__Instance__Group_7__0 )* )
            // InternalBSharp.g:7253:2: ( rule__Instance__Group_7__0 )*
            {
             before(grammarAccess.getInstanceAccess().getGroup_7()); 
            // InternalBSharp.g:7254:2: ( rule__Instance__Group_7__0 )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==45) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // InternalBSharp.g:7254:3: rule__Instance__Group_7__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__Instance__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop62;
                }
            } while (true);

             after(grammarAccess.getInstanceAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__Group__7__Impl"


    // $ANTLR start "rule__Instance__Group__8"
    // InternalBSharp.g:7262:1: rule__Instance__Group__8 : rule__Instance__Group__8__Impl rule__Instance__Group__9 ;
    public final void rule__Instance__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7266:1: ( rule__Instance__Group__8__Impl rule__Instance__Group__9 )
            // InternalBSharp.g:7267:2: rule__Instance__Group__8__Impl rule__Instance__Group__9
            {
            pushFollow(FOLLOW_55);
            rule__Instance__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Instance__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__Group__8"


    // $ANTLR start "rule__Instance__Group__8__Impl"
    // InternalBSharp.g:7274:1: rule__Instance__Group__8__Impl : ( ')' ) ;
    public final void rule__Instance__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7278:1: ( ( ')' ) )
            // InternalBSharp.g:7279:1: ( ')' )
            {
            // InternalBSharp.g:7279:1: ( ')' )
            // InternalBSharp.g:7280:2: ')'
            {
             before(grammarAccess.getInstanceAccess().getRightParenthesisKeyword_8()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getInstanceAccess().getRightParenthesisKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__Group__8__Impl"


    // $ANTLR start "rule__Instance__Group__9"
    // InternalBSharp.g:7289:1: rule__Instance__Group__9 : rule__Instance__Group__9__Impl rule__Instance__Group__10 ;
    public final void rule__Instance__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7293:1: ( rule__Instance__Group__9__Impl rule__Instance__Group__10 )
            // InternalBSharp.g:7294:2: rule__Instance__Group__9__Impl rule__Instance__Group__10
            {
            pushFollow(FOLLOW_55);
            rule__Instance__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Instance__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__Group__9"


    // $ANTLR start "rule__Instance__Group__9__Impl"
    // InternalBSharp.g:7301:1: rule__Instance__Group__9__Impl : ( ( rule__Instance__NameAssignment_9 )? ) ;
    public final void rule__Instance__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7305:1: ( ( ( rule__Instance__NameAssignment_9 )? ) )
            // InternalBSharp.g:7306:1: ( ( rule__Instance__NameAssignment_9 )? )
            {
            // InternalBSharp.g:7306:1: ( ( rule__Instance__NameAssignment_9 )? )
            // InternalBSharp.g:7307:2: ( rule__Instance__NameAssignment_9 )?
            {
             before(grammarAccess.getInstanceAccess().getNameAssignment_9()); 
            // InternalBSharp.g:7308:2: ( rule__Instance__NameAssignment_9 )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==RULE_ID) ) {
                int LA63_1 = input.LA(2);

                if ( (LA63_1==41) ) {
                    int LA63_3 = input.LA(3);

                    if ( (LA63_3==RULE_ID) ) {
                        int LA63_5 = input.LA(4);

                        if ( (LA63_5==27) ) {
                            alt63=1;
                        }
                    }
                }
                else if ( (LA63_1==EOF||LA63_1==RULE_ID||LA63_1==52||LA63_1==54||LA63_1==58) ) {
                    alt63=1;
                }
            }
            switch (alt63) {
                case 1 :
                    // InternalBSharp.g:7308:3: rule__Instance__NameAssignment_9
                    {
                    pushFollow(FOLLOW_2);
                    rule__Instance__NameAssignment_9();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInstanceAccess().getNameAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__Group__9__Impl"


    // $ANTLR start "rule__Instance__Group__10"
    // InternalBSharp.g:7316:1: rule__Instance__Group__10 : rule__Instance__Group__10__Impl ;
    public final void rule__Instance__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7320:1: ( rule__Instance__Group__10__Impl )
            // InternalBSharp.g:7321:2: rule__Instance__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Instance__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__Group__10"


    // $ANTLR start "rule__Instance__Group__10__Impl"
    // InternalBSharp.g:7327:1: rule__Instance__Group__10__Impl : ( ( rule__Instance__Group_10__0 )* ) ;
    public final void rule__Instance__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7331:1: ( ( ( rule__Instance__Group_10__0 )* ) )
            // InternalBSharp.g:7332:1: ( ( rule__Instance__Group_10__0 )* )
            {
            // InternalBSharp.g:7332:1: ( ( rule__Instance__Group_10__0 )* )
            // InternalBSharp.g:7333:2: ( rule__Instance__Group_10__0 )*
            {
             before(grammarAccess.getInstanceAccess().getGroup_10()); 
            // InternalBSharp.g:7334:2: ( rule__Instance__Group_10__0 )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==41) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // InternalBSharp.g:7334:3: rule__Instance__Group_10__0
            	    {
            	    pushFollow(FOLLOW_52);
            	    rule__Instance__Group_10__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop64;
                }
            } while (true);

             after(grammarAccess.getInstanceAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__Group__10__Impl"


    // $ANTLR start "rule__Instance__Group_7__0"
    // InternalBSharp.g:7343:1: rule__Instance__Group_7__0 : rule__Instance__Group_7__0__Impl rule__Instance__Group_7__1 ;
    public final void rule__Instance__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7347:1: ( rule__Instance__Group_7__0__Impl rule__Instance__Group_7__1 )
            // InternalBSharp.g:7348:2: rule__Instance__Group_7__0__Impl rule__Instance__Group_7__1
            {
            pushFollow(FOLLOW_28);
            rule__Instance__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Instance__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__Group_7__0"


    // $ANTLR start "rule__Instance__Group_7__0__Impl"
    // InternalBSharp.g:7355:1: rule__Instance__Group_7__0__Impl : ( ',' ) ;
    public final void rule__Instance__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7359:1: ( ( ',' ) )
            // InternalBSharp.g:7360:1: ( ',' )
            {
            // InternalBSharp.g:7360:1: ( ',' )
            // InternalBSharp.g:7361:2: ','
            {
             before(grammarAccess.getInstanceAccess().getCommaKeyword_7_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getInstanceAccess().getCommaKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__Group_7__0__Impl"


    // $ANTLR start "rule__Instance__Group_7__1"
    // InternalBSharp.g:7370:1: rule__Instance__Group_7__1 : rule__Instance__Group_7__1__Impl ;
    public final void rule__Instance__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7374:1: ( rule__Instance__Group_7__1__Impl )
            // InternalBSharp.g:7375:2: rule__Instance__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Instance__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__Group_7__1"


    // $ANTLR start "rule__Instance__Group_7__1__Impl"
    // InternalBSharp.g:7381:1: rule__Instance__Group_7__1__Impl : ( ( rule__Instance__ArgumentsAssignment_7_1 ) ) ;
    public final void rule__Instance__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7385:1: ( ( ( rule__Instance__ArgumentsAssignment_7_1 ) ) )
            // InternalBSharp.g:7386:1: ( ( rule__Instance__ArgumentsAssignment_7_1 ) )
            {
            // InternalBSharp.g:7386:1: ( ( rule__Instance__ArgumentsAssignment_7_1 ) )
            // InternalBSharp.g:7387:2: ( rule__Instance__ArgumentsAssignment_7_1 )
            {
             before(grammarAccess.getInstanceAccess().getArgumentsAssignment_7_1()); 
            // InternalBSharp.g:7388:2: ( rule__Instance__ArgumentsAssignment_7_1 )
            // InternalBSharp.g:7388:3: rule__Instance__ArgumentsAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Instance__ArgumentsAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getInstanceAccess().getArgumentsAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__Group_7__1__Impl"


    // $ANTLR start "rule__Instance__Group_10__0"
    // InternalBSharp.g:7397:1: rule__Instance__Group_10__0 : rule__Instance__Group_10__0__Impl rule__Instance__Group_10__1 ;
    public final void rule__Instance__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7401:1: ( rule__Instance__Group_10__0__Impl rule__Instance__Group_10__1 )
            // InternalBSharp.g:7402:2: rule__Instance__Group_10__0__Impl rule__Instance__Group_10__1
            {
            pushFollow(FOLLOW_3);
            rule__Instance__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Instance__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__Group_10__0"


    // $ANTLR start "rule__Instance__Group_10__0__Impl"
    // InternalBSharp.g:7409:1: rule__Instance__Group_10__0__Impl : ( '(' ) ;
    public final void rule__Instance__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7413:1: ( ( '(' ) )
            // InternalBSharp.g:7414:1: ( '(' )
            {
            // InternalBSharp.g:7414:1: ( '(' )
            // InternalBSharp.g:7415:2: '('
            {
             before(grammarAccess.getInstanceAccess().getLeftParenthesisKeyword_10_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getInstanceAccess().getLeftParenthesisKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__Group_10__0__Impl"


    // $ANTLR start "rule__Instance__Group_10__1"
    // InternalBSharp.g:7424:1: rule__Instance__Group_10__1 : rule__Instance__Group_10__1__Impl rule__Instance__Group_10__2 ;
    public final void rule__Instance__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7428:1: ( rule__Instance__Group_10__1__Impl rule__Instance__Group_10__2 )
            // InternalBSharp.g:7429:2: rule__Instance__Group_10__1__Impl rule__Instance__Group_10__2
            {
            pushFollow(FOLLOW_18);
            rule__Instance__Group_10__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Instance__Group_10__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__Group_10__1"


    // $ANTLR start "rule__Instance__Group_10__1__Impl"
    // InternalBSharp.g:7436:1: rule__Instance__Group_10__1__Impl : ( ( rule__Instance__ReferencingFuncsAssignment_10_1 ) ) ;
    public final void rule__Instance__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7440:1: ( ( ( rule__Instance__ReferencingFuncsAssignment_10_1 ) ) )
            // InternalBSharp.g:7441:1: ( ( rule__Instance__ReferencingFuncsAssignment_10_1 ) )
            {
            // InternalBSharp.g:7441:1: ( ( rule__Instance__ReferencingFuncsAssignment_10_1 ) )
            // InternalBSharp.g:7442:2: ( rule__Instance__ReferencingFuncsAssignment_10_1 )
            {
             before(grammarAccess.getInstanceAccess().getReferencingFuncsAssignment_10_1()); 
            // InternalBSharp.g:7443:2: ( rule__Instance__ReferencingFuncsAssignment_10_1 )
            // InternalBSharp.g:7443:3: rule__Instance__ReferencingFuncsAssignment_10_1
            {
            pushFollow(FOLLOW_2);
            rule__Instance__ReferencingFuncsAssignment_10_1();

            state._fsp--;


            }

             after(grammarAccess.getInstanceAccess().getReferencingFuncsAssignment_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__Group_10__1__Impl"


    // $ANTLR start "rule__Instance__Group_10__2"
    // InternalBSharp.g:7451:1: rule__Instance__Group_10__2 : rule__Instance__Group_10__2__Impl ;
    public final void rule__Instance__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7455:1: ( rule__Instance__Group_10__2__Impl )
            // InternalBSharp.g:7456:2: rule__Instance__Group_10__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Instance__Group_10__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__Group_10__2"


    // $ANTLR start "rule__Instance__Group_10__2__Impl"
    // InternalBSharp.g:7462:1: rule__Instance__Group_10__2__Impl : ( ')' ) ;
    public final void rule__Instance__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7466:1: ( ( ')' ) )
            // InternalBSharp.g:7467:1: ( ')' )
            {
            // InternalBSharp.g:7467:1: ( ')' )
            // InternalBSharp.g:7468:2: ')'
            {
             before(grammarAccess.getInstanceAccess().getRightParenthesisKeyword_10_2()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getInstanceAccess().getRightParenthesisKeyword_10_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__Group_10__2__Impl"


    // $ANTLR start "rule__ReferencingFunc__Group__0"
    // InternalBSharp.g:7478:1: rule__ReferencingFunc__Group__0 : rule__ReferencingFunc__Group__0__Impl rule__ReferencingFunc__Group__1 ;
    public final void rule__ReferencingFunc__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7482:1: ( rule__ReferencingFunc__Group__0__Impl rule__ReferencingFunc__Group__1 )
            // InternalBSharp.g:7483:2: rule__ReferencingFunc__Group__0__Impl rule__ReferencingFunc__Group__1
            {
            pushFollow(FOLLOW_56);
            rule__ReferencingFunc__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReferencingFunc__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferencingFunc__Group__0"


    // $ANTLR start "rule__ReferencingFunc__Group__0__Impl"
    // InternalBSharp.g:7490:1: rule__ReferencingFunc__Group__0__Impl : ( ( rule__ReferencingFunc__NameAssignment_0 ) ) ;
    public final void rule__ReferencingFunc__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7494:1: ( ( ( rule__ReferencingFunc__NameAssignment_0 ) ) )
            // InternalBSharp.g:7495:1: ( ( rule__ReferencingFunc__NameAssignment_0 ) )
            {
            // InternalBSharp.g:7495:1: ( ( rule__ReferencingFunc__NameAssignment_0 ) )
            // InternalBSharp.g:7496:2: ( rule__ReferencingFunc__NameAssignment_0 )
            {
             before(grammarAccess.getReferencingFuncAccess().getNameAssignment_0()); 
            // InternalBSharp.g:7497:2: ( rule__ReferencingFunc__NameAssignment_0 )
            // InternalBSharp.g:7497:3: rule__ReferencingFunc__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ReferencingFunc__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getReferencingFuncAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferencingFunc__Group__0__Impl"


    // $ANTLR start "rule__ReferencingFunc__Group__1"
    // InternalBSharp.g:7505:1: rule__ReferencingFunc__Group__1 : rule__ReferencingFunc__Group__1__Impl rule__ReferencingFunc__Group__2 ;
    public final void rule__ReferencingFunc__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7509:1: ( rule__ReferencingFunc__Group__1__Impl rule__ReferencingFunc__Group__2 )
            // InternalBSharp.g:7510:2: rule__ReferencingFunc__Group__1__Impl rule__ReferencingFunc__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__ReferencingFunc__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReferencingFunc__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferencingFunc__Group__1"


    // $ANTLR start "rule__ReferencingFunc__Group__1__Impl"
    // InternalBSharp.g:7517:1: rule__ReferencingFunc__Group__1__Impl : ( '=' ) ;
    public final void rule__ReferencingFunc__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7521:1: ( ( '=' ) )
            // InternalBSharp.g:7522:1: ( '=' )
            {
            // InternalBSharp.g:7522:1: ( '=' )
            // InternalBSharp.g:7523:2: '='
            {
             before(grammarAccess.getReferencingFuncAccess().getEqualsSignKeyword_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getReferencingFuncAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferencingFunc__Group__1__Impl"


    // $ANTLR start "rule__ReferencingFunc__Group__2"
    // InternalBSharp.g:7532:1: rule__ReferencingFunc__Group__2 : rule__ReferencingFunc__Group__2__Impl ;
    public final void rule__ReferencingFunc__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7536:1: ( rule__ReferencingFunc__Group__2__Impl )
            // InternalBSharp.g:7537:2: rule__ReferencingFunc__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReferencingFunc__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferencingFunc__Group__2"


    // $ANTLR start "rule__ReferencingFunc__Group__2__Impl"
    // InternalBSharp.g:7543:1: rule__ReferencingFunc__Group__2__Impl : ( ( rule__ReferencingFunc__ReferencedFuncAssignment_2 ) ) ;
    public final void rule__ReferencingFunc__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7547:1: ( ( ( rule__ReferencingFunc__ReferencedFuncAssignment_2 ) ) )
            // InternalBSharp.g:7548:1: ( ( rule__ReferencingFunc__ReferencedFuncAssignment_2 ) )
            {
            // InternalBSharp.g:7548:1: ( ( rule__ReferencingFunc__ReferencedFuncAssignment_2 ) )
            // InternalBSharp.g:7549:2: ( rule__ReferencingFunc__ReferencedFuncAssignment_2 )
            {
             before(grammarAccess.getReferencingFuncAccess().getReferencedFuncAssignment_2()); 
            // InternalBSharp.g:7550:2: ( rule__ReferencingFunc__ReferencedFuncAssignment_2 )
            // InternalBSharp.g:7550:3: rule__ReferencingFunc__ReferencedFuncAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ReferencingFunc__ReferencedFuncAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getReferencingFuncAccess().getReferencedFuncAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferencingFunc__Group__2__Impl"


    // $ANTLR start "rule__TopLevel__NameAssignment_1"
    // InternalBSharp.g:7559:1: rule__TopLevel__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__TopLevel__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7563:1: ( ( ruleQualifiedName ) )
            // InternalBSharp.g:7564:2: ( ruleQualifiedName )
            {
            // InternalBSharp.g:7564:2: ( ruleQualifiedName )
            // InternalBSharp.g:7565:3: ruleQualifiedName
            {
             before(grammarAccess.getTopLevelAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getTopLevelAccess().getNameQualifiedNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopLevel__NameAssignment_1"


    // $ANTLR start "rule__TopLevel__TopLevelFileAssignment_2"
    // InternalBSharp.g:7574:1: rule__TopLevel__TopLevelFileAssignment_2 : ( ruleTopLevelFile ) ;
    public final void rule__TopLevel__TopLevelFileAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7578:1: ( ( ruleTopLevelFile ) )
            // InternalBSharp.g:7579:2: ( ruleTopLevelFile )
            {
            // InternalBSharp.g:7579:2: ( ruleTopLevelFile )
            // InternalBSharp.g:7580:3: ruleTopLevelFile
            {
             before(grammarAccess.getTopLevelAccess().getTopLevelFileTopLevelFileParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTopLevelFile();

            state._fsp--;

             after(grammarAccess.getTopLevelAccess().getTopLevelFileTopLevelFileParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopLevel__TopLevelFileAssignment_2"


    // $ANTLR start "rule__TopLevelFile__NoImportElementsAssignment_1"
    // InternalBSharp.g:7589:1: rule__TopLevelFile__NoImportElementsAssignment_1 : ( ruleTopLevelInstance ) ;
    public final void rule__TopLevelFile__NoImportElementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7593:1: ( ( ruleTopLevelInstance ) )
            // InternalBSharp.g:7594:2: ( ruleTopLevelInstance )
            {
            // InternalBSharp.g:7594:2: ( ruleTopLevelInstance )
            // InternalBSharp.g:7595:3: ruleTopLevelInstance
            {
             before(grammarAccess.getTopLevelFileAccess().getNoImportElementsTopLevelInstanceParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTopLevelInstance();

            state._fsp--;

             after(grammarAccess.getTopLevelFileAccess().getNoImportElementsTopLevelInstanceParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopLevelFile__NoImportElementsAssignment_1"


    // $ANTLR start "rule__TopLevelFile__TopLevelImportsAssignment_2"
    // InternalBSharp.g:7604:1: rule__TopLevelFile__TopLevelImportsAssignment_2 : ( ruleTopLevelImport ) ;
    public final void rule__TopLevelFile__TopLevelImportsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7608:1: ( ( ruleTopLevelImport ) )
            // InternalBSharp.g:7609:2: ( ruleTopLevelImport )
            {
            // InternalBSharp.g:7609:2: ( ruleTopLevelImport )
            // InternalBSharp.g:7610:3: ruleTopLevelImport
            {
             before(grammarAccess.getTopLevelFileAccess().getTopLevelImportsTopLevelImportParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTopLevelImport();

            state._fsp--;

             after(grammarAccess.getTopLevelFileAccess().getTopLevelImportsTopLevelImportParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopLevelFile__TopLevelImportsAssignment_2"


    // $ANTLR start "rule__TopLevelImport__ImportsAssignment_0"
    // InternalBSharp.g:7619:1: rule__TopLevelImport__ImportsAssignment_0 : ( ruleImport ) ;
    public final void rule__TopLevelImport__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7623:1: ( ( ruleImport ) )
            // InternalBSharp.g:7624:2: ( ruleImport )
            {
            // InternalBSharp.g:7624:2: ( ruleImport )
            // InternalBSharp.g:7625:3: ruleImport
            {
             before(grammarAccess.getTopLevelImportAccess().getImportsImportParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getTopLevelImportAccess().getImportsImportParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopLevelImport__ImportsAssignment_0"


    // $ANTLR start "rule__TopLevelImport__BodyElementsAssignment_1"
    // InternalBSharp.g:7634:1: rule__TopLevelImport__BodyElementsAssignment_1 : ( ruleTopLevelInstance ) ;
    public final void rule__TopLevelImport__BodyElementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7638:1: ( ( ruleTopLevelInstance ) )
            // InternalBSharp.g:7639:2: ( ruleTopLevelInstance )
            {
            // InternalBSharp.g:7639:2: ( ruleTopLevelInstance )
            // InternalBSharp.g:7640:3: ruleTopLevelInstance
            {
             before(grammarAccess.getTopLevelImportAccess().getBodyElementsTopLevelInstanceParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTopLevelInstance();

            state._fsp--;

             after(grammarAccess.getTopLevelImportAccess().getBodyElementsTopLevelInstanceParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopLevelImport__BodyElementsAssignment_1"


    // $ANTLR start "rule__GlobalImport__ProjectAssignment_1"
    // InternalBSharp.g:7649:1: rule__GlobalImport__ProjectAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__GlobalImport__ProjectAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7653:1: ( ( ruleQualifiedName ) )
            // InternalBSharp.g:7654:2: ( ruleQualifiedName )
            {
            // InternalBSharp.g:7654:2: ( ruleQualifiedName )
            // InternalBSharp.g:7655:3: ruleQualifiedName
            {
             before(grammarAccess.getGlobalImportAccess().getProjectQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getGlobalImportAccess().getProjectQualifiedNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalImport__ProjectAssignment_1"


    // $ANTLR start "rule__GlobalImport__FileImportsAssignment_3"
    // InternalBSharp.g:7664:1: rule__GlobalImport__FileImportsAssignment_3 : ( ruleFileImport ) ;
    public final void rule__GlobalImport__FileImportsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7668:1: ( ( ruleFileImport ) )
            // InternalBSharp.g:7669:2: ( ruleFileImport )
            {
            // InternalBSharp.g:7669:2: ( ruleFileImport )
            // InternalBSharp.g:7670:3: ruleFileImport
            {
             before(grammarAccess.getGlobalImportAccess().getFileImportsFileImportParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleFileImport();

            state._fsp--;

             after(grammarAccess.getGlobalImportAccess().getFileImportsFileImportParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalImport__FileImportsAssignment_3"


    // $ANTLR start "rule__FileImport__FileReferenceAssignment_0"
    // InternalBSharp.g:7679:1: rule__FileImport__FileReferenceAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__FileImport__FileReferenceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7683:1: ( ( ( RULE_ID ) ) )
            // InternalBSharp.g:7684:2: ( ( RULE_ID ) )
            {
            // InternalBSharp.g:7684:2: ( ( RULE_ID ) )
            // InternalBSharp.g:7685:3: ( RULE_ID )
            {
             before(grammarAccess.getFileImportAccess().getFileReferenceTopLevelFileCrossReference_0_0()); 
            // InternalBSharp.g:7686:3: ( RULE_ID )
            // InternalBSharp.g:7687:4: RULE_ID
            {
             before(grammarAccess.getFileImportAccess().getFileReferenceTopLevelFileIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFileImportAccess().getFileReferenceTopLevelFileIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getFileImportAccess().getFileReferenceTopLevelFileCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileImport__FileReferenceAssignment_0"


    // $ANTLR start "rule__FileImport__TypeAssignment_1_1_1"
    // InternalBSharp.g:7698:1: rule__FileImport__TypeAssignment_1_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__FileImport__TypeAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7702:1: ( ( ( RULE_ID ) ) )
            // InternalBSharp.g:7703:2: ( ( RULE_ID ) )
            {
            // InternalBSharp.g:7703:2: ( ( RULE_ID ) )
            // InternalBSharp.g:7704:3: ( RULE_ID )
            {
             before(grammarAccess.getFileImportAccess().getTypeTopLevelInstanceCrossReference_1_1_1_0()); 
            // InternalBSharp.g:7705:3: ( RULE_ID )
            // InternalBSharp.g:7706:4: RULE_ID
            {
             before(grammarAccess.getFileImportAccess().getTypeTopLevelInstanceIDTerminalRuleCall_1_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFileImportAccess().getTypeTopLevelInstanceIDTerminalRuleCall_1_1_1_0_1()); 

            }

             after(grammarAccess.getFileImportAccess().getTypeTopLevelInstanceCrossReference_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileImport__TypeAssignment_1_1_1"


    // $ANTLR start "rule__LocalImport__FileImportsAssignment_1"
    // InternalBSharp.g:7717:1: rule__LocalImport__FileImportsAssignment_1 : ( ruleFileImport ) ;
    public final void rule__LocalImport__FileImportsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7721:1: ( ( ruleFileImport ) )
            // InternalBSharp.g:7722:2: ( ruleFileImport )
            {
            // InternalBSharp.g:7722:2: ( ruleFileImport )
            // InternalBSharp.g:7723:3: ruleFileImport
            {
             before(grammarAccess.getLocalImportAccess().getFileImportsFileImportParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFileImport();

            state._fsp--;

             after(grammarAccess.getLocalImportAccess().getFileImportsFileImportParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalImport__FileImportsAssignment_1"


    // $ANTLR start "rule__Class__NameAssignment_1"
    // InternalBSharp.g:7732:1: rule__Class__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Class__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7736:1: ( ( RULE_ID ) )
            // InternalBSharp.g:7737:2: ( RULE_ID )
            {
            // InternalBSharp.g:7737:2: ( RULE_ID )
            // InternalBSharp.g:7738:3: RULE_ID
            {
             before(grammarAccess.getClassAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__NameAssignment_1"


    // $ANTLR start "rule__Class__RawContextAssignment_2"
    // InternalBSharp.g:7747:1: rule__Class__RawContextAssignment_2 : ( rulePolyContext ) ;
    public final void rule__Class__RawContextAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7751:1: ( ( rulePolyContext ) )
            // InternalBSharp.g:7752:2: ( rulePolyContext )
            {
            // InternalBSharp.g:7752:2: ( rulePolyContext )
            // InternalBSharp.g:7753:3: rulePolyContext
            {
             before(grammarAccess.getClassAccess().getRawContextPolyContextParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePolyContext();

            state._fsp--;

             after(grammarAccess.getClassAccess().getRawContextPolyContextParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__RawContextAssignment_2"


    // $ANTLR start "rule__Class__InstNameAssignment_3_1"
    // InternalBSharp.g:7762:1: rule__Class__InstNameAssignment_3_1 : ( ruleInstName ) ;
    public final void rule__Class__InstNameAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7766:1: ( ( ruleInstName ) )
            // InternalBSharp.g:7767:2: ( ruleInstName )
            {
            // InternalBSharp.g:7767:2: ( ruleInstName )
            // InternalBSharp.g:7768:3: ruleInstName
            {
             before(grammarAccess.getClassAccess().getInstNameInstNameParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleInstName();

            state._fsp--;

             after(grammarAccess.getClassAccess().getInstNameInstNameParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__InstNameAssignment_3_1"


    // $ANTLR start "rule__Class__SupertypesAssignment_4"
    // InternalBSharp.g:7777:1: rule__Class__SupertypesAssignment_4 : ( ruleSuperTypeList ) ;
    public final void rule__Class__SupertypesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7781:1: ( ( ruleSuperTypeList ) )
            // InternalBSharp.g:7782:2: ( ruleSuperTypeList )
            {
            // InternalBSharp.g:7782:2: ( ruleSuperTypeList )
            // InternalBSharp.g:7783:3: ruleSuperTypeList
            {
             before(grammarAccess.getClassAccess().getSupertypesSuperTypeListParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleSuperTypeList();

            state._fsp--;

             after(grammarAccess.getClassAccess().getSupertypesSuperTypeListParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__SupertypesAssignment_4"


    // $ANTLR start "rule__Class__VarListAssignment_5_1"
    // InternalBSharp.g:7792:1: rule__Class__VarListAssignment_5_1 : ( ruleTypedVariableList ) ;
    public final void rule__Class__VarListAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7796:1: ( ( ruleTypedVariableList ) )
            // InternalBSharp.g:7797:2: ( ruleTypedVariableList )
            {
            // InternalBSharp.g:7797:2: ( ruleTypedVariableList )
            // InternalBSharp.g:7798:3: ruleTypedVariableList
            {
             before(grammarAccess.getClassAccess().getVarListTypedVariableListParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTypedVariableList();

            state._fsp--;

             after(grammarAccess.getClassAccess().getVarListTypedVariableListParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__VarListAssignment_5_1"


    // $ANTLR start "rule__Class__WhereAssignment_6"
    // InternalBSharp.g:7807:1: rule__Class__WhereAssignment_6 : ( ruleWhere ) ;
    public final void rule__Class__WhereAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7811:1: ( ( ruleWhere ) )
            // InternalBSharp.g:7812:2: ( ruleWhere )
            {
            // InternalBSharp.g:7812:2: ( ruleWhere )
            // InternalBSharp.g:7813:3: ruleWhere
            {
             before(grammarAccess.getClassAccess().getWhereWhereParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleWhere();

            state._fsp--;

             after(grammarAccess.getClassAccess().getWhereWhereParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__WhereAssignment_6"


    // $ANTLR start "rule__Class__BlockAssignment_8"
    // InternalBSharp.g:7822:1: rule__Class__BlockAssignment_8 : ( ruleBSharpBlock ) ;
    public final void rule__Class__BlockAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7826:1: ( ( ruleBSharpBlock ) )
            // InternalBSharp.g:7827:2: ( ruleBSharpBlock )
            {
            // InternalBSharp.g:7827:2: ( ruleBSharpBlock )
            // InternalBSharp.g:7828:3: ruleBSharpBlock
            {
             before(grammarAccess.getClassAccess().getBlockBSharpBlockParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleBSharpBlock();

            state._fsp--;

             after(grammarAccess.getClassAccess().getBlockBSharpBlockParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__BlockAssignment_8"


    // $ANTLR start "rule__InstName__NameAssignment"
    // InternalBSharp.g:7837:1: rule__InstName__NameAssignment : ( RULE_ID ) ;
    public final void rule__InstName__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7841:1: ( ( RULE_ID ) )
            // InternalBSharp.g:7842:2: ( RULE_ID )
            {
            // InternalBSharp.g:7842:2: ( RULE_ID )
            // InternalBSharp.g:7843:3: RULE_ID
            {
             before(grammarAccess.getInstNameAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInstNameAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstName__NameAssignment"


    // $ANTLR start "rule__PolyContext__PolyTypesAssignment_1"
    // InternalBSharp.g:7852:1: rule__PolyContext__PolyTypesAssignment_1 : ( rulePolyType ) ;
    public final void rule__PolyContext__PolyTypesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7856:1: ( ( rulePolyType ) )
            // InternalBSharp.g:7857:2: ( rulePolyType )
            {
            // InternalBSharp.g:7857:2: ( rulePolyType )
            // InternalBSharp.g:7858:3: rulePolyType
            {
             before(grammarAccess.getPolyContextAccess().getPolyTypesPolyTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePolyType();

            state._fsp--;

             after(grammarAccess.getPolyContextAccess().getPolyTypesPolyTypeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PolyContext__PolyTypesAssignment_1"


    // $ANTLR start "rule__PolyType__NameAssignment_0"
    // InternalBSharp.g:7867:1: rule__PolyType__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__PolyType__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7871:1: ( ( RULE_ID ) )
            // InternalBSharp.g:7872:2: ( RULE_ID )
            {
            // InternalBSharp.g:7872:2: ( RULE_ID )
            // InternalBSharp.g:7873:3: RULE_ID
            {
             before(grammarAccess.getPolyTypeAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPolyTypeAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PolyType__NameAssignment_0"


    // $ANTLR start "rule__PolyType__SuperTypesAssignment_1_1"
    // InternalBSharp.g:7882:1: rule__PolyType__SuperTypesAssignment_1_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__PolyType__SuperTypesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7886:1: ( ( ( ruleQualifiedName ) ) )
            // InternalBSharp.g:7887:2: ( ( ruleQualifiedName ) )
            {
            // InternalBSharp.g:7887:2: ( ( ruleQualifiedName ) )
            // InternalBSharp.g:7888:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getPolyTypeAccess().getSuperTypesClassDeclCrossReference_1_1_0()); 
            // InternalBSharp.g:7889:3: ( ruleQualifiedName )
            // InternalBSharp.g:7890:4: ruleQualifiedName
            {
             before(grammarAccess.getPolyTypeAccess().getSuperTypesClassDeclQualifiedNameParserRuleCall_1_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getPolyTypeAccess().getSuperTypesClassDeclQualifiedNameParserRuleCall_1_1_0_1()); 

            }

             after(grammarAccess.getPolyTypeAccess().getSuperTypesClassDeclCrossReference_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PolyType__SuperTypesAssignment_1_1"


    // $ANTLR start "rule__PolyType__SuperTypesAssignment_1_2_1"
    // InternalBSharp.g:7901:1: rule__PolyType__SuperTypesAssignment_1_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__PolyType__SuperTypesAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7905:1: ( ( ( ruleQualifiedName ) ) )
            // InternalBSharp.g:7906:2: ( ( ruleQualifiedName ) )
            {
            // InternalBSharp.g:7906:2: ( ( ruleQualifiedName ) )
            // InternalBSharp.g:7907:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getPolyTypeAccess().getSuperTypesClassDeclCrossReference_1_2_1_0()); 
            // InternalBSharp.g:7908:3: ( ruleQualifiedName )
            // InternalBSharp.g:7909:4: ruleQualifiedName
            {
             before(grammarAccess.getPolyTypeAccess().getSuperTypesClassDeclQualifiedNameParserRuleCall_1_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getPolyTypeAccess().getSuperTypesClassDeclQualifiedNameParserRuleCall_1_2_1_0_1()); 

            }

             after(grammarAccess.getPolyTypeAccess().getSuperTypesClassDeclCrossReference_1_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PolyType__SuperTypesAssignment_1_2_1"


    // $ANTLR start "rule__SuperTypeList__SuperTypesAssignment_1"
    // InternalBSharp.g:7920:1: rule__SuperTypeList__SuperTypesAssignment_1 : ( ruleConstructedType ) ;
    public final void rule__SuperTypeList__SuperTypesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7924:1: ( ( ruleConstructedType ) )
            // InternalBSharp.g:7925:2: ( ruleConstructedType )
            {
            // InternalBSharp.g:7925:2: ( ruleConstructedType )
            // InternalBSharp.g:7926:3: ruleConstructedType
            {
             before(grammarAccess.getSuperTypeListAccess().getSuperTypesConstructedTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleConstructedType();

            state._fsp--;

             after(grammarAccess.getSuperTypeListAccess().getSuperTypesConstructedTypeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SuperTypeList__SuperTypesAssignment_1"


    // $ANTLR start "rule__SuperTypeList__SuperTypesAssignment_2_1"
    // InternalBSharp.g:7935:1: rule__SuperTypeList__SuperTypesAssignment_2_1 : ( ruleConstructedType ) ;
    public final void rule__SuperTypeList__SuperTypesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7939:1: ( ( ruleConstructedType ) )
            // InternalBSharp.g:7940:2: ( ruleConstructedType )
            {
            // InternalBSharp.g:7940:2: ( ruleConstructedType )
            // InternalBSharp.g:7941:3: ruleConstructedType
            {
             before(grammarAccess.getSuperTypeListAccess().getSuperTypesConstructedTypeParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleConstructedType();

            state._fsp--;

             after(grammarAccess.getSuperTypeListAccess().getSuperTypesConstructedTypeParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SuperTypeList__SuperTypesAssignment_2_1"


    // $ANTLR start "rule__ConstructedType__ConstructorAssignment_1_1"
    // InternalBSharp.g:7950:1: rule__ConstructedType__ConstructorAssignment_1_1 : ( ruleBuiltinTypeInfixOp ) ;
    public final void rule__ConstructedType__ConstructorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7954:1: ( ( ruleBuiltinTypeInfixOp ) )
            // InternalBSharp.g:7955:2: ( ruleBuiltinTypeInfixOp )
            {
            // InternalBSharp.g:7955:2: ( ruleBuiltinTypeInfixOp )
            // InternalBSharp.g:7956:3: ruleBuiltinTypeInfixOp
            {
             before(grammarAccess.getConstructedTypeAccess().getConstructorBuiltinTypeInfixOpParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBuiltinTypeInfixOp();

            state._fsp--;

             after(grammarAccess.getConstructedTypeAccess().getConstructorBuiltinTypeInfixOpParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstructedType__ConstructorAssignment_1_1"


    // $ANTLR start "rule__ConstructedType__RightAssignment_1_2"
    // InternalBSharp.g:7965:1: rule__ConstructedType__RightAssignment_1_2 : ( ruleBuilderElem ) ;
    public final void rule__ConstructedType__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7969:1: ( ( ruleBuilderElem ) )
            // InternalBSharp.g:7970:2: ( ruleBuilderElem )
            {
            // InternalBSharp.g:7970:2: ( ruleBuilderElem )
            // InternalBSharp.g:7971:3: ruleBuilderElem
            {
             before(grammarAccess.getConstructedTypeAccess().getRightBuilderElemParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleBuilderElem();

            state._fsp--;

             after(grammarAccess.getConstructedTypeAccess().getRightBuilderElemParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstructedType__RightAssignment_1_2"


    // $ANTLR start "rule__TypeConstructor__TypeNameAssignment_0"
    // InternalBSharp.g:7980:1: rule__TypeConstructor__TypeNameAssignment_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__TypeConstructor__TypeNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7984:1: ( ( ( ruleQualifiedName ) ) )
            // InternalBSharp.g:7985:2: ( ( ruleQualifiedName ) )
            {
            // InternalBSharp.g:7985:2: ( ( ruleQualifiedName ) )
            // InternalBSharp.g:7986:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getTypeConstructorAccess().getTypeNameGenNameCrossReference_0_0()); 
            // InternalBSharp.g:7987:3: ( ruleQualifiedName )
            // InternalBSharp.g:7988:4: ruleQualifiedName
            {
             before(grammarAccess.getTypeConstructorAccess().getTypeNameGenNameQualifiedNameParserRuleCall_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getTypeConstructorAccess().getTypeNameGenNameQualifiedNameParserRuleCall_0_0_1()); 

            }

             after(grammarAccess.getTypeConstructorAccess().getTypeNameGenNameCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeConstructor__TypeNameAssignment_0"


    // $ANTLR start "rule__TypeConstructor__ContextAssignment_1"
    // InternalBSharp.g:7999:1: rule__TypeConstructor__ContextAssignment_1 : ( ruleTypeDeclContext ) ;
    public final void rule__TypeConstructor__ContextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8003:1: ( ( ruleTypeDeclContext ) )
            // InternalBSharp.g:8004:2: ( ruleTypeDeclContext )
            {
            // InternalBSharp.g:8004:2: ( ruleTypeDeclContext )
            // InternalBSharp.g:8005:3: ruleTypeDeclContext
            {
             before(grammarAccess.getTypeConstructorAccess().getContextTypeDeclContextParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTypeDeclContext();

            state._fsp--;

             after(grammarAccess.getTypeConstructorAccess().getContextTypeDeclContextParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeConstructor__ContextAssignment_1"


    // $ANTLR start "rule__TypePowerSet__ChildAssignment_2"
    // InternalBSharp.g:8014:1: rule__TypePowerSet__ChildAssignment_2 : ( ruleConstructedType ) ;
    public final void rule__TypePowerSet__ChildAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8018:1: ( ( ruleConstructedType ) )
            // InternalBSharp.g:8019:2: ( ruleConstructedType )
            {
            // InternalBSharp.g:8019:2: ( ruleConstructedType )
            // InternalBSharp.g:8020:3: ruleConstructedType
            {
             before(grammarAccess.getTypePowerSetAccess().getChildConstructedTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleConstructedType();

            state._fsp--;

             after(grammarAccess.getTypePowerSetAccess().getChildConstructedTypeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypePowerSet__ChildAssignment_2"


    // $ANTLR start "rule__TypeConstrBracket__ChildAssignment_1"
    // InternalBSharp.g:8029:1: rule__TypeConstrBracket__ChildAssignment_1 : ( ruleConstructedType ) ;
    public final void rule__TypeConstrBracket__ChildAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8033:1: ( ( ruleConstructedType ) )
            // InternalBSharp.g:8034:2: ( ruleConstructedType )
            {
            // InternalBSharp.g:8034:2: ( ruleConstructedType )
            // InternalBSharp.g:8035:3: ruleConstructedType
            {
             before(grammarAccess.getTypeConstrBracketAccess().getChildConstructedTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleConstructedType();

            state._fsp--;

             after(grammarAccess.getTypeConstrBracketAccess().getChildConstructedTypeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeConstrBracket__ChildAssignment_1"


    // $ANTLR start "rule__TypeDeclContext__TypeNameAssignment_1"
    // InternalBSharp.g:8044:1: rule__TypeDeclContext__TypeNameAssignment_1 : ( ruleConstructedType ) ;
    public final void rule__TypeDeclContext__TypeNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8048:1: ( ( ruleConstructedType ) )
            // InternalBSharp.g:8049:2: ( ruleConstructedType )
            {
            // InternalBSharp.g:8049:2: ( ruleConstructedType )
            // InternalBSharp.g:8050:3: ruleConstructedType
            {
             before(grammarAccess.getTypeDeclContextAccess().getTypeNameConstructedTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleConstructedType();

            state._fsp--;

             after(grammarAccess.getTypeDeclContextAccess().getTypeNameConstructedTypeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDeclContext__TypeNameAssignment_1"


    // $ANTLR start "rule__TypeDeclContext__TypeNameAssignment_2_1"
    // InternalBSharp.g:8059:1: rule__TypeDeclContext__TypeNameAssignment_2_1 : ( ruleConstructedType ) ;
    public final void rule__TypeDeclContext__TypeNameAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8063:1: ( ( ruleConstructedType ) )
            // InternalBSharp.g:8064:2: ( ruleConstructedType )
            {
            // InternalBSharp.g:8064:2: ( ruleConstructedType )
            // InternalBSharp.g:8065:3: ruleConstructedType
            {
             before(grammarAccess.getTypeDeclContextAccess().getTypeNameConstructedTypeParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleConstructedType();

            state._fsp--;

             after(grammarAccess.getTypeDeclContextAccess().getTypeNameConstructedTypeParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDeclContext__TypeNameAssignment_2_1"


    // $ANTLR start "rule__Where__ExpressionsAssignment_1"
    // InternalBSharp.g:8074:1: rule__Where__ExpressionsAssignment_1 : ( ruleRootExpression ) ;
    public final void rule__Where__ExpressionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8078:1: ( ( ruleRootExpression ) )
            // InternalBSharp.g:8079:2: ( ruleRootExpression )
            {
            // InternalBSharp.g:8079:2: ( ruleRootExpression )
            // InternalBSharp.g:8080:3: ruleRootExpression
            {
             before(grammarAccess.getWhereAccess().getExpressionsRootExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRootExpression();

            state._fsp--;

             after(grammarAccess.getWhereAccess().getExpressionsRootExpressionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Where__ExpressionsAssignment_1"


    // $ANTLR start "rule__Where__ExpressionsAssignment_2_1"
    // InternalBSharp.g:8089:1: rule__Where__ExpressionsAssignment_2_1 : ( ruleRootExpression ) ;
    public final void rule__Where__ExpressionsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8093:1: ( ( ruleRootExpression ) )
            // InternalBSharp.g:8094:2: ( ruleRootExpression )
            {
            // InternalBSharp.g:8094:2: ( ruleRootExpression )
            // InternalBSharp.g:8095:3: ruleRootExpression
            {
             before(grammarAccess.getWhereAccess().getExpressionsRootExpressionParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRootExpression();

            state._fsp--;

             after(grammarAccess.getWhereAccess().getExpressionsRootExpressionParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Where__ExpressionsAssignment_2_1"


    // $ANTLR start "rule__Datatype__NameAssignment_1"
    // InternalBSharp.g:8104:1: rule__Datatype__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Datatype__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8108:1: ( ( RULE_ID ) )
            // InternalBSharp.g:8109:2: ( RULE_ID )
            {
            // InternalBSharp.g:8109:2: ( RULE_ID )
            // InternalBSharp.g:8110:3: RULE_ID
            {
             before(grammarAccess.getDatatypeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDatatypeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Datatype__NameAssignment_1"


    // $ANTLR start "rule__Datatype__RawContextAssignment_2"
    // InternalBSharp.g:8119:1: rule__Datatype__RawContextAssignment_2 : ( rulePolyContext ) ;
    public final void rule__Datatype__RawContextAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8123:1: ( ( rulePolyContext ) )
            // InternalBSharp.g:8124:2: ( rulePolyContext )
            {
            // InternalBSharp.g:8124:2: ( rulePolyContext )
            // InternalBSharp.g:8125:3: rulePolyContext
            {
             before(grammarAccess.getDatatypeAccess().getRawContextPolyContextParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePolyContext();

            state._fsp--;

             after(grammarAccess.getDatatypeAccess().getRawContextPolyContextParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Datatype__RawContextAssignment_2"


    // $ANTLR start "rule__Datatype__ConstructorsAssignment_3_1"
    // InternalBSharp.g:8134:1: rule__Datatype__ConstructorsAssignment_3_1 : ( ruleDatatypeConstructor ) ;
    public final void rule__Datatype__ConstructorsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8138:1: ( ( ruleDatatypeConstructor ) )
            // InternalBSharp.g:8139:2: ( ruleDatatypeConstructor )
            {
            // InternalBSharp.g:8139:2: ( ruleDatatypeConstructor )
            // InternalBSharp.g:8140:3: ruleDatatypeConstructor
            {
             before(grammarAccess.getDatatypeAccess().getConstructorsDatatypeConstructorParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDatatypeConstructor();

            state._fsp--;

             after(grammarAccess.getDatatypeAccess().getConstructorsDatatypeConstructorParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Datatype__ConstructorsAssignment_3_1"


    // $ANTLR start "rule__Datatype__BlockAssignment_4"
    // InternalBSharp.g:8149:1: rule__Datatype__BlockAssignment_4 : ( ruleBSharpBlock ) ;
    public final void rule__Datatype__BlockAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8153:1: ( ( ruleBSharpBlock ) )
            // InternalBSharp.g:8154:2: ( ruleBSharpBlock )
            {
            // InternalBSharp.g:8154:2: ( ruleBSharpBlock )
            // InternalBSharp.g:8155:3: ruleBSharpBlock
            {
             before(grammarAccess.getDatatypeAccess().getBlockBSharpBlockParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleBSharpBlock();

            state._fsp--;

             after(grammarAccess.getDatatypeAccess().getBlockBSharpBlockParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Datatype__BlockAssignment_4"


    // $ANTLR start "rule__DatatypeConstructor__NameAssignment_0"
    // InternalBSharp.g:8164:1: rule__DatatypeConstructor__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__DatatypeConstructor__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8168:1: ( ( RULE_ID ) )
            // InternalBSharp.g:8169:2: ( RULE_ID )
            {
            // InternalBSharp.g:8169:2: ( RULE_ID )
            // InternalBSharp.g:8170:3: RULE_ID
            {
             before(grammarAccess.getDatatypeConstructorAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDatatypeConstructorAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DatatypeConstructor__NameAssignment_0"


    // $ANTLR start "rule__DatatypeConstructor__DeconsAssignment_1_1"
    // InternalBSharp.g:8179:1: rule__DatatypeConstructor__DeconsAssignment_1_1 : ( ruleTypedVariableList ) ;
    public final void rule__DatatypeConstructor__DeconsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8183:1: ( ( ruleTypedVariableList ) )
            // InternalBSharp.g:8184:2: ( ruleTypedVariableList )
            {
            // InternalBSharp.g:8184:2: ( ruleTypedVariableList )
            // InternalBSharp.g:8185:3: ruleTypedVariableList
            {
             before(grammarAccess.getDatatypeConstructorAccess().getDeconsTypedVariableListParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTypedVariableList();

            state._fsp--;

             after(grammarAccess.getDatatypeConstructorAccess().getDeconsTypedVariableListParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DatatypeConstructor__DeconsAssignment_1_1"


    // $ANTLR start "rule__Extend__ExtendedClassAssignment_1"
    // InternalBSharp.g:8194:1: rule__Extend__ExtendedClassAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Extend__ExtendedClassAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8198:1: ( ( ( ruleQualifiedName ) ) )
            // InternalBSharp.g:8199:2: ( ( ruleQualifiedName ) )
            {
            // InternalBSharp.g:8199:2: ( ( ruleQualifiedName ) )
            // InternalBSharp.g:8200:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getExtendAccess().getExtendedClassClassDeclCrossReference_1_0()); 
            // InternalBSharp.g:8201:3: ( ruleQualifiedName )
            // InternalBSharp.g:8202:4: ruleQualifiedName
            {
             before(grammarAccess.getExtendAccess().getExtendedClassClassDeclQualifiedNameParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getExtendAccess().getExtendedClassClassDeclQualifiedNameParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getExtendAccess().getExtendedClassClassDeclCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extend__ExtendedClassAssignment_1"


    // $ANTLR start "rule__Extend__NameAssignment_3"
    // InternalBSharp.g:8213:1: rule__Extend__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Extend__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8217:1: ( ( RULE_ID ) )
            // InternalBSharp.g:8218:2: ( RULE_ID )
            {
            // InternalBSharp.g:8218:2: ( RULE_ID )
            // InternalBSharp.g:8219:3: RULE_ID
            {
             before(grammarAccess.getExtendAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getExtendAccess().getNameIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extend__NameAssignment_3"


    // $ANTLR start "rule__Extend__BlockAssignment_5"
    // InternalBSharp.g:8228:1: rule__Extend__BlockAssignment_5 : ( ruleBSharpBlock ) ;
    public final void rule__Extend__BlockAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8232:1: ( ( ruleBSharpBlock ) )
            // InternalBSharp.g:8233:2: ( ruleBSharpBlock )
            {
            // InternalBSharp.g:8233:2: ( ruleBSharpBlock )
            // InternalBSharp.g:8234:3: ruleBSharpBlock
            {
             before(grammarAccess.getExtendAccess().getBlockBSharpBlockParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleBSharpBlock();

            state._fsp--;

             after(grammarAccess.getExtendAccess().getBlockBSharpBlockParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extend__BlockAssignment_5"


    // $ANTLR start "rule__BSharpBlock__FunctionsAssignment_2_0"
    // InternalBSharp.g:8243:1: rule__BSharpBlock__FunctionsAssignment_2_0 : ( ruleFunctionDecl ) ;
    public final void rule__BSharpBlock__FunctionsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8247:1: ( ( ruleFunctionDecl ) )
            // InternalBSharp.g:8248:2: ( ruleFunctionDecl )
            {
            // InternalBSharp.g:8248:2: ( ruleFunctionDecl )
            // InternalBSharp.g:8249:3: ruleFunctionDecl
            {
             before(grammarAccess.getBSharpBlockAccess().getFunctionsFunctionDeclParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleFunctionDecl();

            state._fsp--;

             after(grammarAccess.getBSharpBlockAccess().getFunctionsFunctionDeclParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSharpBlock__FunctionsAssignment_2_0"


    // $ANTLR start "rule__BSharpBlock__TheoremsAssignment_2_1"
    // InternalBSharp.g:8258:1: rule__BSharpBlock__TheoremsAssignment_2_1 : ( ruleTheoremBody ) ;
    public final void rule__BSharpBlock__TheoremsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8262:1: ( ( ruleTheoremBody ) )
            // InternalBSharp.g:8263:2: ( ruleTheoremBody )
            {
            // InternalBSharp.g:8263:2: ( ruleTheoremBody )
            // InternalBSharp.g:8264:3: ruleTheoremBody
            {
             before(grammarAccess.getBSharpBlockAccess().getTheoremsTheoremBodyParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTheoremBody();

            state._fsp--;

             after(grammarAccess.getBSharpBlockAccess().getTheoremsTheoremBodyParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSharpBlock__TheoremsAssignment_2_1"


    // $ANTLR start "rule__BSharpBlock__TheoremsAssignment_2_2"
    // InternalBSharp.g:8273:1: rule__BSharpBlock__TheoremsAssignment_2_2 : ( ruleInstance ) ;
    public final void rule__BSharpBlock__TheoremsAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8277:1: ( ( ruleInstance ) )
            // InternalBSharp.g:8278:2: ( ruleInstance )
            {
            // InternalBSharp.g:8278:2: ( ruleInstance )
            // InternalBSharp.g:8279:3: ruleInstance
            {
             before(grammarAccess.getBSharpBlockAccess().getTheoremsInstanceParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleInstance();

            state._fsp--;

             after(grammarAccess.getBSharpBlockAccess().getTheoremsInstanceParserRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSharpBlock__TheoremsAssignment_2_2"


    // $ANTLR start "rule__FunctionDecl__NameAssignment_0"
    // InternalBSharp.g:8288:1: rule__FunctionDecl__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__FunctionDecl__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8292:1: ( ( RULE_ID ) )
            // InternalBSharp.g:8293:2: ( RULE_ID )
            {
            // InternalBSharp.g:8293:2: ( RULE_ID )
            // InternalBSharp.g:8294:3: RULE_ID
            {
             before(grammarAccess.getFunctionDeclAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFunctionDeclAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDecl__NameAssignment_0"


    // $ANTLR start "rule__FunctionDecl__ContextAssignment_1"
    // InternalBSharp.g:8303:1: rule__FunctionDecl__ContextAssignment_1 : ( rulePolyContext ) ;
    public final void rule__FunctionDecl__ContextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8307:1: ( ( rulePolyContext ) )
            // InternalBSharp.g:8308:2: ( rulePolyContext )
            {
            // InternalBSharp.g:8308:2: ( rulePolyContext )
            // InternalBSharp.g:8309:3: rulePolyContext
            {
             before(grammarAccess.getFunctionDeclAccess().getContextPolyContextParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePolyContext();

            state._fsp--;

             after(grammarAccess.getFunctionDeclAccess().getContextPolyContextParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDecl__ContextAssignment_1"


    // $ANTLR start "rule__FunctionDecl__VarListAssignment_3"
    // InternalBSharp.g:8318:1: rule__FunctionDecl__VarListAssignment_3 : ( ruleTypedVariableList ) ;
    public final void rule__FunctionDecl__VarListAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8322:1: ( ( ruleTypedVariableList ) )
            // InternalBSharp.g:8323:2: ( ruleTypedVariableList )
            {
            // InternalBSharp.g:8323:2: ( ruleTypedVariableList )
            // InternalBSharp.g:8324:3: ruleTypedVariableList
            {
             before(grammarAccess.getFunctionDeclAccess().getVarListTypedVariableListParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleTypedVariableList();

            state._fsp--;

             after(grammarAccess.getFunctionDeclAccess().getVarListTypedVariableListParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDecl__VarListAssignment_3"


    // $ANTLR start "rule__FunctionDecl__ReturnTypeAssignment_6"
    // InternalBSharp.g:8333:1: rule__FunctionDecl__ReturnTypeAssignment_6 : ( ruleTypeConstructor ) ;
    public final void rule__FunctionDecl__ReturnTypeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8337:1: ( ( ruleTypeConstructor ) )
            // InternalBSharp.g:8338:2: ( ruleTypeConstructor )
            {
            // InternalBSharp.g:8338:2: ( ruleTypeConstructor )
            // InternalBSharp.g:8339:3: ruleTypeConstructor
            {
             before(grammarAccess.getFunctionDeclAccess().getReturnTypeTypeConstructorParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleTypeConstructor();

            state._fsp--;

             after(grammarAccess.getFunctionDeclAccess().getReturnTypeTypeConstructorParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDecl__ReturnTypeAssignment_6"


    // $ANTLR start "rule__FunctionDecl__InfixAssignment_7"
    // InternalBSharp.g:8348:1: rule__FunctionDecl__InfixAssignment_7 : ( ( 'INFIX' ) ) ;
    public final void rule__FunctionDecl__InfixAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8352:1: ( ( ( 'INFIX' ) ) )
            // InternalBSharp.g:8353:2: ( ( 'INFIX' ) )
            {
            // InternalBSharp.g:8353:2: ( ( 'INFIX' ) )
            // InternalBSharp.g:8354:3: ( 'INFIX' )
            {
             before(grammarAccess.getFunctionDeclAccess().getInfixINFIXKeyword_7_0()); 
            // InternalBSharp.g:8355:3: ( 'INFIX' )
            // InternalBSharp.g:8356:4: 'INFIX'
            {
             before(grammarAccess.getFunctionDeclAccess().getInfixINFIXKeyword_7_0()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getFunctionDeclAccess().getInfixINFIXKeyword_7_0()); 

            }

             after(grammarAccess.getFunctionDeclAccess().getInfixINFIXKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDecl__InfixAssignment_7"


    // $ANTLR start "rule__FunctionDecl__PrecedenceAssignment_8"
    // InternalBSharp.g:8367:1: rule__FunctionDecl__PrecedenceAssignment_8 : ( RULE_INT ) ;
    public final void rule__FunctionDecl__PrecedenceAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8371:1: ( ( RULE_INT ) )
            // InternalBSharp.g:8372:2: ( RULE_INT )
            {
            // InternalBSharp.g:8372:2: ( RULE_INT )
            // InternalBSharp.g:8373:3: RULE_INT
            {
             before(grammarAccess.getFunctionDeclAccess().getPrecedenceINTTerminalRuleCall_8_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getFunctionDeclAccess().getPrecedenceINTTerminalRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDecl__PrecedenceAssignment_8"


    // $ANTLR start "rule__FunctionDecl__ExprAssignment_9"
    // InternalBSharp.g:8382:1: rule__FunctionDecl__ExprAssignment_9 : ( ruleRootExpression ) ;
    public final void rule__FunctionDecl__ExprAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8386:1: ( ( ruleRootExpression ) )
            // InternalBSharp.g:8387:2: ( ruleRootExpression )
            {
            // InternalBSharp.g:8387:2: ( ruleRootExpression )
            // InternalBSharp.g:8388:3: ruleRootExpression
            {
             before(grammarAccess.getFunctionDeclAccess().getExprRootExpressionParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleRootExpression();

            state._fsp--;

             after(grammarAccess.getFunctionDeclAccess().getExprRootExpressionParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDecl__ExprAssignment_9"


    // $ANTLR start "rule__MatchStatement__MatchAssignment_1"
    // InternalBSharp.g:8397:1: rule__MatchStatement__MatchAssignment_1 : ( ruleRootExpression ) ;
    public final void rule__MatchStatement__MatchAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8401:1: ( ( ruleRootExpression ) )
            // InternalBSharp.g:8402:2: ( ruleRootExpression )
            {
            // InternalBSharp.g:8402:2: ( ruleRootExpression )
            // InternalBSharp.g:8403:3: ruleRootExpression
            {
             before(grammarAccess.getMatchStatementAccess().getMatchRootExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRootExpression();

            state._fsp--;

             after(grammarAccess.getMatchStatementAccess().getMatchRootExpressionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchStatement__MatchAssignment_1"


    // $ANTLR start "rule__MatchStatement__InductCaseAssignment_3"
    // InternalBSharp.g:8412:1: rule__MatchStatement__InductCaseAssignment_3 : ( ruleMatchCase ) ;
    public final void rule__MatchStatement__InductCaseAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8416:1: ( ( ruleMatchCase ) )
            // InternalBSharp.g:8417:2: ( ruleMatchCase )
            {
            // InternalBSharp.g:8417:2: ( ruleMatchCase )
            // InternalBSharp.g:8418:3: ruleMatchCase
            {
             before(grammarAccess.getMatchStatementAccess().getInductCaseMatchCaseParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleMatchCase();

            state._fsp--;

             after(grammarAccess.getMatchStatementAccess().getInductCaseMatchCaseParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchStatement__InductCaseAssignment_3"


    // $ANTLR start "rule__MatchStatement__InductCaseAssignment_4"
    // InternalBSharp.g:8427:1: rule__MatchStatement__InductCaseAssignment_4 : ( ruleMatchCase ) ;
    public final void rule__MatchStatement__InductCaseAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8431:1: ( ( ruleMatchCase ) )
            // InternalBSharp.g:8432:2: ( ruleMatchCase )
            {
            // InternalBSharp.g:8432:2: ( ruleMatchCase )
            // InternalBSharp.g:8433:3: ruleMatchCase
            {
             before(grammarAccess.getMatchStatementAccess().getInductCaseMatchCaseParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleMatchCase();

            state._fsp--;

             after(grammarAccess.getMatchStatementAccess().getInductCaseMatchCaseParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchStatement__InductCaseAssignment_4"


    // $ANTLR start "rule__MatchCase__DeconNameAssignment_1"
    // InternalBSharp.g:8442:1: rule__MatchCase__DeconNameAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__MatchCase__DeconNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8446:1: ( ( ( RULE_ID ) ) )
            // InternalBSharp.g:8447:2: ( ( RULE_ID ) )
            {
            // InternalBSharp.g:8447:2: ( ( RULE_ID ) )
            // InternalBSharp.g:8448:3: ( RULE_ID )
            {
             before(grammarAccess.getMatchCaseAccess().getDeconNameDatatypeConstructorCrossReference_1_0()); 
            // InternalBSharp.g:8449:3: ( RULE_ID )
            // InternalBSharp.g:8450:4: RULE_ID
            {
             before(grammarAccess.getMatchCaseAccess().getDeconNameDatatypeConstructorIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMatchCaseAccess().getDeconNameDatatypeConstructorIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getMatchCaseAccess().getDeconNameDatatypeConstructorCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchCase__DeconNameAssignment_1"


    // $ANTLR start "rule__MatchCase__VariablesAssignment_2_1"
    // InternalBSharp.g:8461:1: rule__MatchCase__VariablesAssignment_2_1 : ( ruleTypedVariable ) ;
    public final void rule__MatchCase__VariablesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8465:1: ( ( ruleTypedVariable ) )
            // InternalBSharp.g:8466:2: ( ruleTypedVariable )
            {
            // InternalBSharp.g:8466:2: ( ruleTypedVariable )
            // InternalBSharp.g:8467:3: ruleTypedVariable
            {
             before(grammarAccess.getMatchCaseAccess().getVariablesTypedVariableParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTypedVariable();

            state._fsp--;

             after(grammarAccess.getMatchCaseAccess().getVariablesTypedVariableParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchCase__VariablesAssignment_2_1"


    // $ANTLR start "rule__MatchCase__VariablesAssignment_2_2_1"
    // InternalBSharp.g:8476:1: rule__MatchCase__VariablesAssignment_2_2_1 : ( ruleTypedVariable ) ;
    public final void rule__MatchCase__VariablesAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8480:1: ( ( ruleTypedVariable ) )
            // InternalBSharp.g:8481:2: ( ruleTypedVariable )
            {
            // InternalBSharp.g:8481:2: ( ruleTypedVariable )
            // InternalBSharp.g:8482:3: ruleTypedVariable
            {
             before(grammarAccess.getMatchCaseAccess().getVariablesTypedVariableParserRuleCall_2_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTypedVariable();

            state._fsp--;

             after(grammarAccess.getMatchCaseAccess().getVariablesTypedVariableParserRuleCall_2_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchCase__VariablesAssignment_2_2_1"


    // $ANTLR start "rule__MatchCase__ExprAssignment_4"
    // InternalBSharp.g:8491:1: rule__MatchCase__ExprAssignment_4 : ( ruleRootExpression ) ;
    public final void rule__MatchCase__ExprAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8495:1: ( ( ruleRootExpression ) )
            // InternalBSharp.g:8496:2: ( ruleRootExpression )
            {
            // InternalBSharp.g:8496:2: ( ruleRootExpression )
            // InternalBSharp.g:8497:3: ruleRootExpression
            {
             before(grammarAccess.getMatchCaseAccess().getExprRootExpressionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleRootExpression();

            state._fsp--;

             after(grammarAccess.getMatchCaseAccess().getExprRootExpressionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchCase__ExprAssignment_4"


    // $ANTLR start "rule__TheoremBody__TheoremDeclAssignment_2"
    // InternalBSharp.g:8506:1: rule__TheoremBody__TheoremDeclAssignment_2 : ( ruleTheoremDecl ) ;
    public final void rule__TheoremBody__TheoremDeclAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8510:1: ( ( ruleTheoremDecl ) )
            // InternalBSharp.g:8511:2: ( ruleTheoremDecl )
            {
            // InternalBSharp.g:8511:2: ( ruleTheoremDecl )
            // InternalBSharp.g:8512:3: ruleTheoremDecl
            {
             before(grammarAccess.getTheoremBodyAccess().getTheoremDeclTheoremDeclParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTheoremDecl();

            state._fsp--;

             after(grammarAccess.getTheoremBodyAccess().getTheoremDeclTheoremDeclParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TheoremBody__TheoremDeclAssignment_2"


    // $ANTLR start "rule__TheoremDecl__NameAssignment_0"
    // InternalBSharp.g:8521:1: rule__TheoremDecl__NameAssignment_0 : ( ruleTHM_NAME ) ;
    public final void rule__TheoremDecl__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8525:1: ( ( ruleTHM_NAME ) )
            // InternalBSharp.g:8526:2: ( ruleTHM_NAME )
            {
            // InternalBSharp.g:8526:2: ( ruleTHM_NAME )
            // InternalBSharp.g:8527:3: ruleTHM_NAME
            {
             before(grammarAccess.getTheoremDeclAccess().getNameTHM_NAMEParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTHM_NAME();

            state._fsp--;

             after(grammarAccess.getTheoremDeclAccess().getNameTHM_NAMEParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TheoremDecl__NameAssignment_0"


    // $ANTLR start "rule__TheoremDecl__ExprAssignment_1"
    // InternalBSharp.g:8536:1: rule__TheoremDecl__ExprAssignment_1 : ( ruleRootExpression ) ;
    public final void rule__TheoremDecl__ExprAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8540:1: ( ( ruleRootExpression ) )
            // InternalBSharp.g:8541:2: ( ruleRootExpression )
            {
            // InternalBSharp.g:8541:2: ( ruleRootExpression )
            // InternalBSharp.g:8542:3: ruleRootExpression
            {
             before(grammarAccess.getTheoremDeclAccess().getExprRootExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRootExpression();

            state._fsp--;

             after(grammarAccess.getTheoremDeclAccess().getExprRootExpressionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TheoremDecl__ExprAssignment_1"


    // $ANTLR start "rule__TypedVariableList__VariablesOfTypeAssignment_0"
    // InternalBSharp.g:8551:1: rule__TypedVariableList__VariablesOfTypeAssignment_0 : ( ruleVariableTyping ) ;
    public final void rule__TypedVariableList__VariablesOfTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8555:1: ( ( ruleVariableTyping ) )
            // InternalBSharp.g:8556:2: ( ruleVariableTyping )
            {
            // InternalBSharp.g:8556:2: ( ruleVariableTyping )
            // InternalBSharp.g:8557:3: ruleVariableTyping
            {
             before(grammarAccess.getTypedVariableListAccess().getVariablesOfTypeVariableTypingParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleVariableTyping();

            state._fsp--;

             after(grammarAccess.getTypedVariableListAccess().getVariablesOfTypeVariableTypingParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedVariableList__VariablesOfTypeAssignment_0"


    // $ANTLR start "rule__TypedVariableList__VariablesOfTypeAssignment_1_1"
    // InternalBSharp.g:8566:1: rule__TypedVariableList__VariablesOfTypeAssignment_1_1 : ( ruleVariableTyping ) ;
    public final void rule__TypedVariableList__VariablesOfTypeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8570:1: ( ( ruleVariableTyping ) )
            // InternalBSharp.g:8571:2: ( ruleVariableTyping )
            {
            // InternalBSharp.g:8571:2: ( ruleVariableTyping )
            // InternalBSharp.g:8572:3: ruleVariableTyping
            {
             before(grammarAccess.getTypedVariableListAccess().getVariablesOfTypeVariableTypingParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVariableTyping();

            state._fsp--;

             after(grammarAccess.getTypedVariableListAccess().getVariablesOfTypeVariableTypingParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedVariableList__VariablesOfTypeAssignment_1_1"


    // $ANTLR start "rule__VariableTyping__TypeVarAssignment_0"
    // InternalBSharp.g:8581:1: rule__VariableTyping__TypeVarAssignment_0 : ( ruleTypedVariable ) ;
    public final void rule__VariableTyping__TypeVarAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8585:1: ( ( ruleTypedVariable ) )
            // InternalBSharp.g:8586:2: ( ruleTypedVariable )
            {
            // InternalBSharp.g:8586:2: ( ruleTypedVariable )
            // InternalBSharp.g:8587:3: ruleTypedVariable
            {
             before(grammarAccess.getVariableTypingAccess().getTypeVarTypedVariableParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTypedVariable();

            state._fsp--;

             after(grammarAccess.getVariableTypingAccess().getTypeVarTypedVariableParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableTyping__TypeVarAssignment_0"


    // $ANTLR start "rule__VariableTyping__TypeVarAssignment_1_1"
    // InternalBSharp.g:8596:1: rule__VariableTyping__TypeVarAssignment_1_1 : ( ruleTypedVariable ) ;
    public final void rule__VariableTyping__TypeVarAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8600:1: ( ( ruleTypedVariable ) )
            // InternalBSharp.g:8601:2: ( ruleTypedVariable )
            {
            // InternalBSharp.g:8601:2: ( ruleTypedVariable )
            // InternalBSharp.g:8602:3: ruleTypedVariable
            {
             before(grammarAccess.getVariableTypingAccess().getTypeVarTypedVariableParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTypedVariable();

            state._fsp--;

             after(grammarAccess.getVariableTypingAccess().getTypeVarTypedVariableParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableTyping__TypeVarAssignment_1_1"


    // $ANTLR start "rule__VariableTyping__TypeAssignment_3"
    // InternalBSharp.g:8611:1: rule__VariableTyping__TypeAssignment_3 : ( ruleConstructedType ) ;
    public final void rule__VariableTyping__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8615:1: ( ( ruleConstructedType ) )
            // InternalBSharp.g:8616:2: ( ruleConstructedType )
            {
            // InternalBSharp.g:8616:2: ( ruleConstructedType )
            // InternalBSharp.g:8617:3: ruleConstructedType
            {
             before(grammarAccess.getVariableTypingAccess().getTypeConstructedTypeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleConstructedType();

            state._fsp--;

             after(grammarAccess.getVariableTypingAccess().getTypeConstructedTypeParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableTyping__TypeAssignment_3"


    // $ANTLR start "rule__TypedVariable__NameAssignment"
    // InternalBSharp.g:8626:1: rule__TypedVariable__NameAssignment : ( RULE_ID ) ;
    public final void rule__TypedVariable__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8630:1: ( ( RULE_ID ) )
            // InternalBSharp.g:8631:2: ( RULE_ID )
            {
            // InternalBSharp.g:8631:2: ( RULE_ID )
            // InternalBSharp.g:8632:3: RULE_ID
            {
             before(grammarAccess.getTypedVariableAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTypedVariableAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedVariable__NameAssignment"


    // $ANTLR start "rule__Lambda__QTypeAssignment_0"
    // InternalBSharp.g:8641:1: rule__Lambda__QTypeAssignment_0 : ( ( '\\u03BB' ) ) ;
    public final void rule__Lambda__QTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8645:1: ( ( ( '\\u03BB' ) ) )
            // InternalBSharp.g:8646:2: ( ( '\\u03BB' ) )
            {
            // InternalBSharp.g:8646:2: ( ( '\\u03BB' ) )
            // InternalBSharp.g:8647:3: ( '\\u03BB' )
            {
             before(grammarAccess.getLambdaAccess().getQTypeGreekSmallLetterLamdaKeyword_0_0()); 
            // InternalBSharp.g:8648:3: ( '\\u03BB' )
            // InternalBSharp.g:8649:4: '\\u03BB'
            {
             before(grammarAccess.getLambdaAccess().getQTypeGreekSmallLetterLamdaKeyword_0_0()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getLambdaAccess().getQTypeGreekSmallLetterLamdaKeyword_0_0()); 

            }

             after(grammarAccess.getLambdaAccess().getQTypeGreekSmallLetterLamdaKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lambda__QTypeAssignment_0"


    // $ANTLR start "rule__Lambda__ContextAssignment_1"
    // InternalBSharp.g:8660:1: rule__Lambda__ContextAssignment_1 : ( rulePolyContext ) ;
    public final void rule__Lambda__ContextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8664:1: ( ( rulePolyContext ) )
            // InternalBSharp.g:8665:2: ( rulePolyContext )
            {
            // InternalBSharp.g:8665:2: ( rulePolyContext )
            // InternalBSharp.g:8666:3: rulePolyContext
            {
             before(grammarAccess.getLambdaAccess().getContextPolyContextParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePolyContext();

            state._fsp--;

             after(grammarAccess.getLambdaAccess().getContextPolyContextParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lambda__ContextAssignment_1"


    // $ANTLR start "rule__Lambda__VarListAssignment_2"
    // InternalBSharp.g:8675:1: rule__Lambda__VarListAssignment_2 : ( ruleTypedVariableList ) ;
    public final void rule__Lambda__VarListAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8679:1: ( ( ruleTypedVariableList ) )
            // InternalBSharp.g:8680:2: ( ruleTypedVariableList )
            {
            // InternalBSharp.g:8680:2: ( ruleTypedVariableList )
            // InternalBSharp.g:8681:3: ruleTypedVariableList
            {
             before(grammarAccess.getLambdaAccess().getVarListTypedVariableListParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTypedVariableList();

            state._fsp--;

             after(grammarAccess.getLambdaAccess().getVarListTypedVariableListParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lambda__VarListAssignment_2"


    // $ANTLR start "rule__Lambda__ExprAssignment_4"
    // InternalBSharp.g:8690:1: rule__Lambda__ExprAssignment_4 : ( ruleRootExpression ) ;
    public final void rule__Lambda__ExprAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8694:1: ( ( ruleRootExpression ) )
            // InternalBSharp.g:8695:2: ( ruleRootExpression )
            {
            // InternalBSharp.g:8695:2: ( ruleRootExpression )
            // InternalBSharp.g:8696:3: ruleRootExpression
            {
             before(grammarAccess.getLambdaAccess().getExprRootExpressionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleRootExpression();

            state._fsp--;

             after(grammarAccess.getLambdaAccess().getExprRootExpressionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lambda__ExprAssignment_4"


    // $ANTLR start "rule__Quantifier__QTypeAssignment_0"
    // InternalBSharp.g:8705:1: rule__Quantifier__QTypeAssignment_0 : ( ( rule__Quantifier__QTypeAlternatives_0_0 ) ) ;
    public final void rule__Quantifier__QTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8709:1: ( ( ( rule__Quantifier__QTypeAlternatives_0_0 ) ) )
            // InternalBSharp.g:8710:2: ( ( rule__Quantifier__QTypeAlternatives_0_0 ) )
            {
            // InternalBSharp.g:8710:2: ( ( rule__Quantifier__QTypeAlternatives_0_0 ) )
            // InternalBSharp.g:8711:3: ( rule__Quantifier__QTypeAlternatives_0_0 )
            {
             before(grammarAccess.getQuantifierAccess().getQTypeAlternatives_0_0()); 
            // InternalBSharp.g:8712:3: ( rule__Quantifier__QTypeAlternatives_0_0 )
            // InternalBSharp.g:8712:4: rule__Quantifier__QTypeAlternatives_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Quantifier__QTypeAlternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getQuantifierAccess().getQTypeAlternatives_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quantifier__QTypeAssignment_0"


    // $ANTLR start "rule__Quantifier__ContextAssignment_1"
    // InternalBSharp.g:8720:1: rule__Quantifier__ContextAssignment_1 : ( rulePolyContext ) ;
    public final void rule__Quantifier__ContextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8724:1: ( ( rulePolyContext ) )
            // InternalBSharp.g:8725:2: ( rulePolyContext )
            {
            // InternalBSharp.g:8725:2: ( rulePolyContext )
            // InternalBSharp.g:8726:3: rulePolyContext
            {
             before(grammarAccess.getQuantifierAccess().getContextPolyContextParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePolyContext();

            state._fsp--;

             after(grammarAccess.getQuantifierAccess().getContextPolyContextParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quantifier__ContextAssignment_1"


    // $ANTLR start "rule__Quantifier__VarListAssignment_2"
    // InternalBSharp.g:8735:1: rule__Quantifier__VarListAssignment_2 : ( ruleTypedVariableList ) ;
    public final void rule__Quantifier__VarListAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8739:1: ( ( ruleTypedVariableList ) )
            // InternalBSharp.g:8740:2: ( ruleTypedVariableList )
            {
            // InternalBSharp.g:8740:2: ( ruleTypedVariableList )
            // InternalBSharp.g:8741:3: ruleTypedVariableList
            {
             before(grammarAccess.getQuantifierAccess().getVarListTypedVariableListParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTypedVariableList();

            state._fsp--;

             after(grammarAccess.getQuantifierAccess().getVarListTypedVariableListParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quantifier__VarListAssignment_2"


    // $ANTLR start "rule__Quantifier__ExprAssignment_4"
    // InternalBSharp.g:8750:1: rule__Quantifier__ExprAssignment_4 : ( ruleRootExpression ) ;
    public final void rule__Quantifier__ExprAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8754:1: ( ( ruleRootExpression ) )
            // InternalBSharp.g:8755:2: ( ruleRootExpression )
            {
            // InternalBSharp.g:8755:2: ( ruleRootExpression )
            // InternalBSharp.g:8756:3: ruleRootExpression
            {
             before(grammarAccess.getQuantifierAccess().getExprRootExpressionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleRootExpression();

            state._fsp--;

             after(grammarAccess.getQuantifierAccess().getExprRootExpressionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quantifier__ExprAssignment_4"


    // $ANTLR start "rule__Prefix__NameAssignment_0"
    // InternalBSharp.g:8765:1: rule__Prefix__NameAssignment_0 : ( rulePrefixBuiltIn ) ;
    public final void rule__Prefix__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8769:1: ( ( rulePrefixBuiltIn ) )
            // InternalBSharp.g:8770:2: ( rulePrefixBuiltIn )
            {
            // InternalBSharp.g:8770:2: ( rulePrefixBuiltIn )
            // InternalBSharp.g:8771:3: rulePrefixBuiltIn
            {
             before(grammarAccess.getPrefixAccess().getNamePrefixBuiltInParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            rulePrefixBuiltIn();

            state._fsp--;

             after(grammarAccess.getPrefixAccess().getNamePrefixBuiltInParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prefix__NameAssignment_0"


    // $ANTLR start "rule__Prefix__ElemAssignment_1"
    // InternalBSharp.g:8780:1: rule__Prefix__ElemAssignment_1 : ( ruleElement ) ;
    public final void rule__Prefix__ElemAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8784:1: ( ( ruleElement ) )
            // InternalBSharp.g:8785:2: ( ruleElement )
            {
            // InternalBSharp.g:8785:2: ( ruleElement )
            // InternalBSharp.g:8786:3: ruleElement
            {
             before(grammarAccess.getPrefixAccess().getElemElementParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getPrefixAccess().getElemElementParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prefix__ElemAssignment_1"


    // $ANTLR start "rule__Infix__FuncNameAssignment_1_1_0"
    // InternalBSharp.g:8795:1: rule__Infix__FuncNameAssignment_1_1_0 : ( ( RULE_ID ) ) ;
    public final void rule__Infix__FuncNameAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8799:1: ( ( ( RULE_ID ) ) )
            // InternalBSharp.g:8800:2: ( ( RULE_ID ) )
            {
            // InternalBSharp.g:8800:2: ( ( RULE_ID ) )
            // InternalBSharp.g:8801:3: ( RULE_ID )
            {
             before(grammarAccess.getInfixAccess().getFuncNameFunctionDeclCrossReference_1_1_0_0()); 
            // InternalBSharp.g:8802:3: ( RULE_ID )
            // InternalBSharp.g:8803:4: RULE_ID
            {
             before(grammarAccess.getInfixAccess().getFuncNameFunctionDeclIDTerminalRuleCall_1_1_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInfixAccess().getFuncNameFunctionDeclIDTerminalRuleCall_1_1_0_0_1()); 

            }

             after(grammarAccess.getInfixAccess().getFuncNameFunctionDeclCrossReference_1_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Infix__FuncNameAssignment_1_1_0"


    // $ANTLR start "rule__Infix__OpNameAssignment_1_1_1"
    // InternalBSharp.g:8814:1: rule__Infix__OpNameAssignment_1_1_1 : ( ruleInbuiltInfix ) ;
    public final void rule__Infix__OpNameAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8818:1: ( ( ruleInbuiltInfix ) )
            // InternalBSharp.g:8819:2: ( ruleInbuiltInfix )
            {
            // InternalBSharp.g:8819:2: ( ruleInbuiltInfix )
            // InternalBSharp.g:8820:3: ruleInbuiltInfix
            {
             before(grammarAccess.getInfixAccess().getOpNameInbuiltInfixParserRuleCall_1_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleInbuiltInfix();

            state._fsp--;

             after(grammarAccess.getInfixAccess().getOpNameInbuiltInfixParserRuleCall_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Infix__OpNameAssignment_1_1_1"


    // $ANTLR start "rule__Infix__RightAssignment_1_2"
    // InternalBSharp.g:8829:1: rule__Infix__RightAssignment_1_2 : ( ruleElement ) ;
    public final void rule__Infix__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8833:1: ( ( ruleElement ) )
            // InternalBSharp.g:8834:2: ( ruleElement )
            {
            // InternalBSharp.g:8834:2: ( ruleElement )
            // InternalBSharp.g:8835:3: ruleElement
            {
             before(grammarAccess.getInfixAccess().getRightElementParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getInfixAccess().getRightElementParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Infix__RightAssignment_1_2"


    // $ANTLR start "rule__Bracket__ChildAssignment_1"
    // InternalBSharp.g:8844:1: rule__Bracket__ChildAssignment_1 : ( ruleRootExpression ) ;
    public final void rule__Bracket__ChildAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8848:1: ( ( ruleRootExpression ) )
            // InternalBSharp.g:8849:2: ( ruleRootExpression )
            {
            // InternalBSharp.g:8849:2: ( ruleRootExpression )
            // InternalBSharp.g:8850:3: ruleRootExpression
            {
             before(grammarAccess.getBracketAccess().getChildRootExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRootExpression();

            state._fsp--;

             after(grammarAccess.getBracketAccess().getChildRootExpressionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bracket__ChildAssignment_1"


    // $ANTLR start "rule__FunctionCall__WrappedAssignment_0"
    // InternalBSharp.g:8859:1: rule__FunctionCall__WrappedAssignment_0 : ( ruleWrappedInfix ) ;
    public final void rule__FunctionCall__WrappedAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8863:1: ( ( ruleWrappedInfix ) )
            // InternalBSharp.g:8864:2: ( ruleWrappedInfix )
            {
            // InternalBSharp.g:8864:2: ( ruleWrappedInfix )
            // InternalBSharp.g:8865:3: ruleWrappedInfix
            {
             before(grammarAccess.getFunctionCallAccess().getWrappedWrappedInfixParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleWrappedInfix();

            state._fsp--;

             after(grammarAccess.getFunctionCallAccess().getWrappedWrappedInfixParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__WrappedAssignment_0"


    // $ANTLR start "rule__FunctionCall__TypeInstAssignment_1_0_0"
    // InternalBSharp.g:8874:1: rule__FunctionCall__TypeInstAssignment_1_0_0 : ( ( RULE_ID ) ) ;
    public final void rule__FunctionCall__TypeInstAssignment_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8878:1: ( ( ( RULE_ID ) ) )
            // InternalBSharp.g:8879:2: ( ( RULE_ID ) )
            {
            // InternalBSharp.g:8879:2: ( ( RULE_ID ) )
            // InternalBSharp.g:8880:3: ( RULE_ID )
            {
             before(grammarAccess.getFunctionCallAccess().getTypeInstExpressionVariableCrossReference_1_0_0_0()); 
            // InternalBSharp.g:8881:3: ( RULE_ID )
            // InternalBSharp.g:8882:4: RULE_ID
            {
             before(grammarAccess.getFunctionCallAccess().getTypeInstExpressionVariableIDTerminalRuleCall_1_0_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFunctionCallAccess().getTypeInstExpressionVariableIDTerminalRuleCall_1_0_0_0_1()); 

            }

             after(grammarAccess.getFunctionCallAccess().getTypeInstExpressionVariableCrossReference_1_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__TypeInstAssignment_1_0_0"


    // $ANTLR start "rule__FunctionCall__ClassVarDeclAssignment_1_0_1"
    // InternalBSharp.g:8893:1: rule__FunctionCall__ClassVarDeclAssignment_1_0_1 : ( ruleClassVarDecl ) ;
    public final void rule__FunctionCall__ClassVarDeclAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8897:1: ( ( ruleClassVarDecl ) )
            // InternalBSharp.g:8898:2: ( ruleClassVarDecl )
            {
            // InternalBSharp.g:8898:2: ( ruleClassVarDecl )
            // InternalBSharp.g:8899:3: ruleClassVarDecl
            {
             before(grammarAccess.getFunctionCallAccess().getClassVarDeclClassVarDeclParserRuleCall_1_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleClassVarDecl();

            state._fsp--;

             after(grammarAccess.getFunctionCallAccess().getClassVarDeclClassVarDeclParserRuleCall_1_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__ClassVarDeclAssignment_1_0_1"


    // $ANTLR start "rule__FunctionCall__ContextAssignment_1_1"
    // InternalBSharp.g:8908:1: rule__FunctionCall__ContextAssignment_1_1 : ( ruleTypeDeclContext ) ;
    public final void rule__FunctionCall__ContextAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8912:1: ( ( ruleTypeDeclContext ) )
            // InternalBSharp.g:8913:2: ( ruleTypeDeclContext )
            {
            // InternalBSharp.g:8913:2: ( ruleTypeDeclContext )
            // InternalBSharp.g:8914:3: ruleTypeDeclContext
            {
             before(grammarAccess.getFunctionCallAccess().getContextTypeDeclContextParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTypeDeclContext();

            state._fsp--;

             after(grammarAccess.getFunctionCallAccess().getContextTypeDeclContextParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__ContextAssignment_1_1"


    // $ANTLR start "rule__FunctionCall__FuncCallArgsAssignment_1_2"
    // InternalBSharp.g:8923:1: rule__FunctionCall__FuncCallArgsAssignment_1_2 : ( ruleFuncCallArgs ) ;
    public final void rule__FunctionCall__FuncCallArgsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8927:1: ( ( ruleFuncCallArgs ) )
            // InternalBSharp.g:8928:2: ( ruleFuncCallArgs )
            {
            // InternalBSharp.g:8928:2: ( ruleFuncCallArgs )
            // InternalBSharp.g:8929:3: ruleFuncCallArgs
            {
             before(grammarAccess.getFunctionCallAccess().getFuncCallArgsFuncCallArgsParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleFuncCallArgs();

            state._fsp--;

             after(grammarAccess.getFunctionCallAccess().getFuncCallArgsFuncCallArgsParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__FuncCallArgsAssignment_1_2"


    // $ANTLR start "rule__FuncCallArgs__ArgumentsAssignment_1_1"
    // InternalBSharp.g:8938:1: rule__FuncCallArgs__ArgumentsAssignment_1_1 : ( ruleRootExpression ) ;
    public final void rule__FuncCallArgs__ArgumentsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8942:1: ( ( ruleRootExpression ) )
            // InternalBSharp.g:8943:2: ( ruleRootExpression )
            {
            // InternalBSharp.g:8943:2: ( ruleRootExpression )
            // InternalBSharp.g:8944:3: ruleRootExpression
            {
             before(grammarAccess.getFuncCallArgsAccess().getArgumentsRootExpressionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRootExpression();

            state._fsp--;

             after(grammarAccess.getFuncCallArgsAccess().getArgumentsRootExpressionParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FuncCallArgs__ArgumentsAssignment_1_1"


    // $ANTLR start "rule__FuncCallArgs__ArgumentsAssignment_1_2_1"
    // InternalBSharp.g:8953:1: rule__FuncCallArgs__ArgumentsAssignment_1_2_1 : ( ruleRootExpression ) ;
    public final void rule__FuncCallArgs__ArgumentsAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8957:1: ( ( ruleRootExpression ) )
            // InternalBSharp.g:8958:2: ( ruleRootExpression )
            {
            // InternalBSharp.g:8958:2: ( ruleRootExpression )
            // InternalBSharp.g:8959:3: ruleRootExpression
            {
             before(grammarAccess.getFuncCallArgsAccess().getArgumentsRootExpressionParserRuleCall_1_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRootExpression();

            state._fsp--;

             after(grammarAccess.getFuncCallArgsAccess().getArgumentsRootExpressionParserRuleCall_1_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FuncCallArgs__ArgumentsAssignment_1_2_1"


    // $ANTLR start "rule__IfElse__ConditionAssignment_1"
    // InternalBSharp.g:8968:1: rule__IfElse__ConditionAssignment_1 : ( ruleRootExpression ) ;
    public final void rule__IfElse__ConditionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8972:1: ( ( ruleRootExpression ) )
            // InternalBSharp.g:8973:2: ( ruleRootExpression )
            {
            // InternalBSharp.g:8973:2: ( ruleRootExpression )
            // InternalBSharp.g:8974:3: ruleRootExpression
            {
             before(grammarAccess.getIfElseAccess().getConditionRootExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRootExpression();

            state._fsp--;

             after(grammarAccess.getIfElseAccess().getConditionRootExpressionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfElse__ConditionAssignment_1"


    // $ANTLR start "rule__IfElse__IfTrueExprAssignment_3"
    // InternalBSharp.g:8983:1: rule__IfElse__IfTrueExprAssignment_3 : ( ruleRootExpression ) ;
    public final void rule__IfElse__IfTrueExprAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8987:1: ( ( ruleRootExpression ) )
            // InternalBSharp.g:8988:2: ( ruleRootExpression )
            {
            // InternalBSharp.g:8988:2: ( ruleRootExpression )
            // InternalBSharp.g:8989:3: ruleRootExpression
            {
             before(grammarAccess.getIfElseAccess().getIfTrueExprRootExpressionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleRootExpression();

            state._fsp--;

             after(grammarAccess.getIfElseAccess().getIfTrueExprRootExpressionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfElse__IfTrueExprAssignment_3"


    // $ANTLR start "rule__IfElse__IfFalseExprAssignment_7"
    // InternalBSharp.g:8998:1: rule__IfElse__IfFalseExprAssignment_7 : ( ruleRootExpression ) ;
    public final void rule__IfElse__IfFalseExprAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:9002:1: ( ( ruleRootExpression ) )
            // InternalBSharp.g:9003:2: ( ruleRootExpression )
            {
            // InternalBSharp.g:9003:2: ( ruleRootExpression )
            // InternalBSharp.g:9004:3: ruleRootExpression
            {
             before(grammarAccess.getIfElseAccess().getIfFalseExprRootExpressionParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleRootExpression();

            state._fsp--;

             after(grammarAccess.getIfElseAccess().getIfFalseExprRootExpressionParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfElse__IfFalseExprAssignment_7"


    // $ANTLR start "rule__ClassVarDecl__OwnerTypeAssignment_0"
    // InternalBSharp.g:9013:1: rule__ClassVarDecl__OwnerTypeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__ClassVarDecl__OwnerTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:9017:1: ( ( ( RULE_ID ) ) )
            // InternalBSharp.g:9018:2: ( ( RULE_ID ) )
            {
            // InternalBSharp.g:9018:2: ( ( RULE_ID ) )
            // InternalBSharp.g:9019:3: ( RULE_ID )
            {
             before(grammarAccess.getClassVarDeclAccess().getOwnerTypeGenNameCrossReference_0_0()); 
            // InternalBSharp.g:9020:3: ( RULE_ID )
            // InternalBSharp.g:9021:4: RULE_ID
            {
             before(grammarAccess.getClassVarDeclAccess().getOwnerTypeGenNameIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getClassVarDeclAccess().getOwnerTypeGenNameIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getClassVarDeclAccess().getOwnerTypeGenNameCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassVarDecl__OwnerTypeAssignment_0"


    // $ANTLR start "rule__ClassVarDecl__TypeInstAssignment_2"
    // InternalBSharp.g:9032:1: rule__ClassVarDecl__TypeInstAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__ClassVarDecl__TypeInstAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:9036:1: ( ( ( RULE_ID ) ) )
            // InternalBSharp.g:9037:2: ( ( RULE_ID ) )
            {
            // InternalBSharp.g:9037:2: ( ( RULE_ID ) )
            // InternalBSharp.g:9038:3: ( RULE_ID )
            {
             before(grammarAccess.getClassVarDeclAccess().getTypeInstExpressionVariableCrossReference_2_0()); 
            // InternalBSharp.g:9039:3: ( RULE_ID )
            // InternalBSharp.g:9040:4: RULE_ID
            {
             before(grammarAccess.getClassVarDeclAccess().getTypeInstExpressionVariableIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getClassVarDeclAccess().getTypeInstExpressionVariableIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getClassVarDeclAccess().getTypeInstExpressionVariableCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassVarDecl__TypeInstAssignment_2"


    // $ANTLR start "rule__WrappedInfix__InbuiltAssignment_1_0"
    // InternalBSharp.g:9051:1: rule__WrappedInfix__InbuiltAssignment_1_0 : ( ruleInbuiltInfix ) ;
    public final void rule__WrappedInfix__InbuiltAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:9055:1: ( ( ruleInbuiltInfix ) )
            // InternalBSharp.g:9056:2: ( ruleInbuiltInfix )
            {
            // InternalBSharp.g:9056:2: ( ruleInbuiltInfix )
            // InternalBSharp.g:9057:3: ruleInbuiltInfix
            {
             before(grammarAccess.getWrappedInfixAccess().getInbuiltInbuiltInfixParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleInbuiltInfix();

            state._fsp--;

             after(grammarAccess.getWrappedInfixAccess().getInbuiltInbuiltInfixParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WrappedInfix__InbuiltAssignment_1_0"


    // $ANTLR start "rule__WrappedInfix__FuncNameAssignment_1_1"
    // InternalBSharp.g:9066:1: rule__WrappedInfix__FuncNameAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__WrappedInfix__FuncNameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:9070:1: ( ( ( RULE_ID ) ) )
            // InternalBSharp.g:9071:2: ( ( RULE_ID ) )
            {
            // InternalBSharp.g:9071:2: ( ( RULE_ID ) )
            // InternalBSharp.g:9072:3: ( RULE_ID )
            {
             before(grammarAccess.getWrappedInfixAccess().getFuncNameExpressionVariableCrossReference_1_1_0()); 
            // InternalBSharp.g:9073:3: ( RULE_ID )
            // InternalBSharp.g:9074:4: RULE_ID
            {
             before(grammarAccess.getWrappedInfixAccess().getFuncNameExpressionVariableIDTerminalRuleCall_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getWrappedInfixAccess().getFuncNameExpressionVariableIDTerminalRuleCall_1_1_0_1()); 

            }

             after(grammarAccess.getWrappedInfixAccess().getFuncNameExpressionVariableCrossReference_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WrappedInfix__FuncNameAssignment_1_1"


    // $ANTLR start "rule__Instance__ClassNameAssignment_1"
    // InternalBSharp.g:9085:1: rule__Instance__ClassNameAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Instance__ClassNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:9089:1: ( ( ( ruleQualifiedName ) ) )
            // InternalBSharp.g:9090:2: ( ( ruleQualifiedName ) )
            {
            // InternalBSharp.g:9090:2: ( ( ruleQualifiedName ) )
            // InternalBSharp.g:9091:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getInstanceAccess().getClassNameBSClassCrossReference_1_0()); 
            // InternalBSharp.g:9092:3: ( ruleQualifiedName )
            // InternalBSharp.g:9093:4: ruleQualifiedName
            {
             before(grammarAccess.getInstanceAccess().getClassNameBSClassQualifiedNameParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getInstanceAccess().getClassNameBSClassQualifiedNameParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getInstanceAccess().getClassNameBSClassCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__ClassNameAssignment_1"


    // $ANTLR start "rule__Instance__ContextAssignment_3"
    // InternalBSharp.g:9104:1: rule__Instance__ContextAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Instance__ContextAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:9108:1: ( ( ( RULE_ID ) ) )
            // InternalBSharp.g:9109:2: ( ( RULE_ID ) )
            {
            // InternalBSharp.g:9109:2: ( ( RULE_ID ) )
            // InternalBSharp.g:9110:3: ( RULE_ID )
            {
             before(grammarAccess.getInstanceAccess().getContextIClassInstanceCrossReference_3_0()); 
            // InternalBSharp.g:9111:3: ( RULE_ID )
            // InternalBSharp.g:9112:4: RULE_ID
            {
             before(grammarAccess.getInstanceAccess().getContextIClassInstanceIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInstanceAccess().getContextIClassInstanceIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getInstanceAccess().getContextIClassInstanceCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__ContextAssignment_3"


    // $ANTLR start "rule__Instance__ArgumentsAssignment_6"
    // InternalBSharp.g:9123:1: rule__Instance__ArgumentsAssignment_6 : ( ruleRootExpression ) ;
    public final void rule__Instance__ArgumentsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:9127:1: ( ( ruleRootExpression ) )
            // InternalBSharp.g:9128:2: ( ruleRootExpression )
            {
            // InternalBSharp.g:9128:2: ( ruleRootExpression )
            // InternalBSharp.g:9129:3: ruleRootExpression
            {
             before(grammarAccess.getInstanceAccess().getArgumentsRootExpressionParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleRootExpression();

            state._fsp--;

             after(grammarAccess.getInstanceAccess().getArgumentsRootExpressionParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__ArgumentsAssignment_6"


    // $ANTLR start "rule__Instance__ArgumentsAssignment_7_1"
    // InternalBSharp.g:9138:1: rule__Instance__ArgumentsAssignment_7_1 : ( ruleRootExpression ) ;
    public final void rule__Instance__ArgumentsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:9142:1: ( ( ruleRootExpression ) )
            // InternalBSharp.g:9143:2: ( ruleRootExpression )
            {
            // InternalBSharp.g:9143:2: ( ruleRootExpression )
            // InternalBSharp.g:9144:3: ruleRootExpression
            {
             before(grammarAccess.getInstanceAccess().getArgumentsRootExpressionParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRootExpression();

            state._fsp--;

             after(grammarAccess.getInstanceAccess().getArgumentsRootExpressionParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__ArgumentsAssignment_7_1"


    // $ANTLR start "rule__Instance__NameAssignment_9"
    // InternalBSharp.g:9153:1: rule__Instance__NameAssignment_9 : ( RULE_ID ) ;
    public final void rule__Instance__NameAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:9157:1: ( ( RULE_ID ) )
            // InternalBSharp.g:9158:2: ( RULE_ID )
            {
            // InternalBSharp.g:9158:2: ( RULE_ID )
            // InternalBSharp.g:9159:3: RULE_ID
            {
             before(grammarAccess.getInstanceAccess().getNameIDTerminalRuleCall_9_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInstanceAccess().getNameIDTerminalRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__NameAssignment_9"


    // $ANTLR start "rule__Instance__ReferencingFuncsAssignment_10_1"
    // InternalBSharp.g:9168:1: rule__Instance__ReferencingFuncsAssignment_10_1 : ( ruleReferencingFunc ) ;
    public final void rule__Instance__ReferencingFuncsAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:9172:1: ( ( ruleReferencingFunc ) )
            // InternalBSharp.g:9173:2: ( ruleReferencingFunc )
            {
            // InternalBSharp.g:9173:2: ( ruleReferencingFunc )
            // InternalBSharp.g:9174:3: ruleReferencingFunc
            {
             before(grammarAccess.getInstanceAccess().getReferencingFuncsReferencingFuncParserRuleCall_10_1_0()); 
            pushFollow(FOLLOW_2);
            ruleReferencingFunc();

            state._fsp--;

             after(grammarAccess.getInstanceAccess().getReferencingFuncsReferencingFuncParserRuleCall_10_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__ReferencingFuncsAssignment_10_1"


    // $ANTLR start "rule__ReferencingFunc__NameAssignment_0"
    // InternalBSharp.g:9183:1: rule__ReferencingFunc__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__ReferencingFunc__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:9187:1: ( ( RULE_ID ) )
            // InternalBSharp.g:9188:2: ( RULE_ID )
            {
            // InternalBSharp.g:9188:2: ( RULE_ID )
            // InternalBSharp.g:9189:3: RULE_ID
            {
             before(grammarAccess.getReferencingFuncAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getReferencingFuncAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferencingFunc__NameAssignment_0"


    // $ANTLR start "rule__ReferencingFunc__ReferencedFuncAssignment_2"
    // InternalBSharp.g:9198:1: rule__ReferencingFunc__ReferencedFuncAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__ReferencingFunc__ReferencedFuncAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:9202:1: ( ( ( RULE_ID ) ) )
            // InternalBSharp.g:9203:2: ( ( RULE_ID ) )
            {
            // InternalBSharp.g:9203:2: ( ( RULE_ID ) )
            // InternalBSharp.g:9204:3: ( RULE_ID )
            {
             before(grammarAccess.getReferencingFuncAccess().getReferencedFuncFunctionDeclCrossReference_2_0()); 
            // InternalBSharp.g:9205:3: ( RULE_ID )
            // InternalBSharp.g:9206:4: RULE_ID
            {
             before(grammarAccess.getReferencingFuncAccess().getReferencedFuncFunctionDeclIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getReferencingFuncAccess().getReferencedFuncFunctionDeclIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getReferencingFuncAccess().getReferencedFuncFunctionDeclCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferencingFunc__ReferencedFuncAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0005003800000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000072L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0005002000000002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000001800000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0005002000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000001020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000088000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0008824200000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000420000000020L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00000000007FE000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00000000007FE002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000300000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x1120028001800820L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0002080000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0002080000000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0450000000000020L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0440000000000022L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x00000A0000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000040000000020L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x1920028001800830L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0012000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000020200000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000240000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000200200000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000080000000020L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000028000000820L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x00000000FE000020L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x00000000FE000022L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x1120268001800820L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000020000000020L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000008000000L});

}