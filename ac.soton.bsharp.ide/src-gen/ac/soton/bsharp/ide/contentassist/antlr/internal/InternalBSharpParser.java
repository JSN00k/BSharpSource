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
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalBSharpParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_WS", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ANY_OTHER", "'\\u00AC'", "'*'", "'\\u00D7'", "'\\u2192'", "'\\uE102'", "'\\uE100'", "'\\u2194'", "'\\u2916'", "'\\u21F8'", "'\\u21A3'", "'\\u2900'", "'\\u21A0'", "'\\u2200'", "'\\u2203'", "'\\u21D4'", "'\\u21D2'", "'='", "'\\u2260'", "'\\u2227'", "'\\u2228'", "'\\u2208'", "'prj1'", "'prj2'", "'dom'", "'ran'", "'package'", "':'", "'.'", "'From'", "'Import'", "'Class'", "';'", "'['", "']'", "'('", "')'", "'<'", "'>'", "','", "'\\u2119'", "'where'", "'Datatype'", "'|'", "'Extend'", "'{'", "'}'", "'match'", "'Theorems'", "'\\u00B7'", "'if'", "'else'", "'Instance'", "'INFIX'", "'\\u03BB'"
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
    public static final int T__61=61;
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
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
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
    // InternalBSharp.g:54:1: entryRuleTopLevel : ruleTopLevel EOF ;
    public final void entryRuleTopLevel() throws RecognitionException {
        try {
            // InternalBSharp.g:55:1: ( ruleTopLevel EOF )
            // InternalBSharp.g:56:1: ruleTopLevel EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTopLevelRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleTopLevel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTopLevelRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalBSharp.g:63:1: ruleTopLevel : ( ( rule__TopLevel__Group__0 ) ) ;
    public final void ruleTopLevel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:67:2: ( ( ( rule__TopLevel__Group__0 ) ) )
            // InternalBSharp.g:68:2: ( ( rule__TopLevel__Group__0 ) )
            {
            // InternalBSharp.g:68:2: ( ( rule__TopLevel__Group__0 ) )
            // InternalBSharp.g:69:3: ( rule__TopLevel__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTopLevelAccess().getGroup()); 
            }
            // InternalBSharp.g:70:3: ( rule__TopLevel__Group__0 )
            // InternalBSharp.g:70:4: rule__TopLevel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TopLevel__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTopLevelAccess().getGroup()); 
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
    // $ANTLR end "ruleTopLevel"


    // $ANTLR start "entryRuleTHM_NAME"
    // InternalBSharp.g:79:1: entryRuleTHM_NAME : ruleTHM_NAME EOF ;
    public final void entryRuleTHM_NAME() throws RecognitionException {
        try {
            // InternalBSharp.g:80:1: ( ruleTHM_NAME EOF )
            // InternalBSharp.g:81:1: ruleTHM_NAME EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTHM_NAMERule()); 
            }
            pushFollow(FOLLOW_1);
            ruleTHM_NAME();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTHM_NAMERule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalBSharp.g:88:1: ruleTHM_NAME : ( ( rule__THM_NAME__Group__0 ) ) ;
    public final void ruleTHM_NAME() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:92:2: ( ( ( rule__THM_NAME__Group__0 ) ) )
            // InternalBSharp.g:93:2: ( ( rule__THM_NAME__Group__0 ) )
            {
            // InternalBSharp.g:93:2: ( ( rule__THM_NAME__Group__0 ) )
            // InternalBSharp.g:94:3: ( rule__THM_NAME__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTHM_NAMEAccess().getGroup()); 
            }
            // InternalBSharp.g:95:3: ( rule__THM_NAME__Group__0 )
            // InternalBSharp.g:95:4: rule__THM_NAME__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__THM_NAME__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTHM_NAMEAccess().getGroup()); 
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
    // $ANTLR end "ruleTHM_NAME"


    // $ANTLR start "entryRuleTopLevelFile"
    // InternalBSharp.g:104:1: entryRuleTopLevelFile : ruleTopLevelFile EOF ;
    public final void entryRuleTopLevelFile() throws RecognitionException {
        try {
            // InternalBSharp.g:105:1: ( ruleTopLevelFile EOF )
            // InternalBSharp.g:106:1: ruleTopLevelFile EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTopLevelFileRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleTopLevelFile();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTopLevelFileRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalBSharp.g:113:1: ruleTopLevelFile : ( ( rule__TopLevelFile__Group__0 ) ) ;
    public final void ruleTopLevelFile() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:117:2: ( ( ( rule__TopLevelFile__Group__0 ) ) )
            // InternalBSharp.g:118:2: ( ( rule__TopLevelFile__Group__0 ) )
            {
            // InternalBSharp.g:118:2: ( ( rule__TopLevelFile__Group__0 ) )
            // InternalBSharp.g:119:3: ( rule__TopLevelFile__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTopLevelFileAccess().getGroup()); 
            }
            // InternalBSharp.g:120:3: ( rule__TopLevelFile__Group__0 )
            // InternalBSharp.g:120:4: rule__TopLevelFile__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TopLevelFile__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTopLevelFileAccess().getGroup()); 
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
    // $ANTLR end "ruleTopLevelFile"


    // $ANTLR start "entryRuleClassDecl"
    // InternalBSharp.g:129:1: entryRuleClassDecl : ruleClassDecl EOF ;
    public final void entryRuleClassDecl() throws RecognitionException {
        try {
            // InternalBSharp.g:130:1: ( ruleClassDecl EOF )
            // InternalBSharp.g:131:1: ruleClassDecl EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassDeclRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleClassDecl();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassDeclRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalBSharp.g:138:1: ruleClassDecl : ( ( rule__ClassDecl__Alternatives ) ) ;
    public final void ruleClassDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:142:2: ( ( ( rule__ClassDecl__Alternatives ) ) )
            // InternalBSharp.g:143:2: ( ( rule__ClassDecl__Alternatives ) )
            {
            // InternalBSharp.g:143:2: ( ( rule__ClassDecl__Alternatives ) )
            // InternalBSharp.g:144:3: ( rule__ClassDecl__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassDeclAccess().getAlternatives()); 
            }
            // InternalBSharp.g:145:3: ( rule__ClassDecl__Alternatives )
            // InternalBSharp.g:145:4: rule__ClassDecl__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ClassDecl__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassDeclAccess().getAlternatives()); 
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
    // $ANTLR end "ruleClassDecl"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalBSharp.g:154:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalBSharp.g:155:1: ( ruleQualifiedName EOF )
            // InternalBSharp.g:156:1: ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalBSharp.g:163:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:167:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalBSharp.g:168:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalBSharp.g:168:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalBSharp.g:169:3: ( rule__QualifiedName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }
            // InternalBSharp.g:170:3: ( rule__QualifiedName__Group__0 )
            // InternalBSharp.g:170:4: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getGroup()); 
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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleTopLevelImport"
    // InternalBSharp.g:179:1: entryRuleTopLevelImport : ruleTopLevelImport EOF ;
    public final void entryRuleTopLevelImport() throws RecognitionException {
        try {
            // InternalBSharp.g:180:1: ( ruleTopLevelImport EOF )
            // InternalBSharp.g:181:1: ruleTopLevelImport EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTopLevelImportRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleTopLevelImport();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTopLevelImportRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalBSharp.g:188:1: ruleTopLevelImport : ( ( rule__TopLevelImport__Group__0 ) ) ;
    public final void ruleTopLevelImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:192:2: ( ( ( rule__TopLevelImport__Group__0 ) ) )
            // InternalBSharp.g:193:2: ( ( rule__TopLevelImport__Group__0 ) )
            {
            // InternalBSharp.g:193:2: ( ( rule__TopLevelImport__Group__0 ) )
            // InternalBSharp.g:194:3: ( rule__TopLevelImport__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTopLevelImportAccess().getGroup()); 
            }
            // InternalBSharp.g:195:3: ( rule__TopLevelImport__Group__0 )
            // InternalBSharp.g:195:4: rule__TopLevelImport__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TopLevelImport__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTopLevelImportAccess().getGroup()); 
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
    // $ANTLR end "ruleTopLevelImport"


    // $ANTLR start "entryRuleTopLevelInstance"
    // InternalBSharp.g:204:1: entryRuleTopLevelInstance : ruleTopLevelInstance EOF ;
    public final void entryRuleTopLevelInstance() throws RecognitionException {
        try {
            // InternalBSharp.g:205:1: ( ruleTopLevelInstance EOF )
            // InternalBSharp.g:206:1: ruleTopLevelInstance EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTopLevelInstanceRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleTopLevelInstance();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTopLevelInstanceRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalBSharp.g:213:1: ruleTopLevelInstance : ( ( rule__TopLevelInstance__Alternatives ) ) ;
    public final void ruleTopLevelInstance() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:217:2: ( ( ( rule__TopLevelInstance__Alternatives ) ) )
            // InternalBSharp.g:218:2: ( ( rule__TopLevelInstance__Alternatives ) )
            {
            // InternalBSharp.g:218:2: ( ( rule__TopLevelInstance__Alternatives ) )
            // InternalBSharp.g:219:3: ( rule__TopLevelInstance__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTopLevelInstanceAccess().getAlternatives()); 
            }
            // InternalBSharp.g:220:3: ( rule__TopLevelInstance__Alternatives )
            // InternalBSharp.g:220:4: rule__TopLevelInstance__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TopLevelInstance__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTopLevelInstanceAccess().getAlternatives()); 
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
    // $ANTLR end "ruleTopLevelInstance"


    // $ANTLR start "entryRuleImport"
    // InternalBSharp.g:229:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // InternalBSharp.g:230:1: ( ruleImport EOF )
            // InternalBSharp.g:231:1: ruleImport EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleImport();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalBSharp.g:238:1: ruleImport : ( ( rule__Import__Alternatives ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:242:2: ( ( ( rule__Import__Alternatives ) ) )
            // InternalBSharp.g:243:2: ( ( rule__Import__Alternatives ) )
            {
            // InternalBSharp.g:243:2: ( ( rule__Import__Alternatives ) )
            // InternalBSharp.g:244:3: ( rule__Import__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getAlternatives()); 
            }
            // InternalBSharp.g:245:3: ( rule__Import__Alternatives )
            // InternalBSharp.g:245:4: rule__Import__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Import__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getAlternatives()); 
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
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleGlobalImport"
    // InternalBSharp.g:254:1: entryRuleGlobalImport : ruleGlobalImport EOF ;
    public final void entryRuleGlobalImport() throws RecognitionException {
        try {
            // InternalBSharp.g:255:1: ( ruleGlobalImport EOF )
            // InternalBSharp.g:256:1: ruleGlobalImport EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGlobalImportRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleGlobalImport();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGlobalImportRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalBSharp.g:263:1: ruleGlobalImport : ( ( rule__GlobalImport__Group__0 ) ) ;
    public final void ruleGlobalImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:267:2: ( ( ( rule__GlobalImport__Group__0 ) ) )
            // InternalBSharp.g:268:2: ( ( rule__GlobalImport__Group__0 ) )
            {
            // InternalBSharp.g:268:2: ( ( rule__GlobalImport__Group__0 ) )
            // InternalBSharp.g:269:3: ( rule__GlobalImport__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGlobalImportAccess().getGroup()); 
            }
            // InternalBSharp.g:270:3: ( rule__GlobalImport__Group__0 )
            // InternalBSharp.g:270:4: rule__GlobalImport__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GlobalImport__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGlobalImportAccess().getGroup()); 
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
    // $ANTLR end "ruleGlobalImport"


    // $ANTLR start "entryRuleFileImport"
    // InternalBSharp.g:279:1: entryRuleFileImport : ruleFileImport EOF ;
    public final void entryRuleFileImport() throws RecognitionException {
        try {
            // InternalBSharp.g:280:1: ( ruleFileImport EOF )
            // InternalBSharp.g:281:1: ruleFileImport EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFileImportRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleFileImport();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFileImportRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalBSharp.g:288:1: ruleFileImport : ( ( rule__FileImport__Group__0 ) ) ;
    public final void ruleFileImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:292:2: ( ( ( rule__FileImport__Group__0 ) ) )
            // InternalBSharp.g:293:2: ( ( rule__FileImport__Group__0 ) )
            {
            // InternalBSharp.g:293:2: ( ( rule__FileImport__Group__0 ) )
            // InternalBSharp.g:294:3: ( rule__FileImport__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFileImportAccess().getGroup()); 
            }
            // InternalBSharp.g:295:3: ( rule__FileImport__Group__0 )
            // InternalBSharp.g:295:4: rule__FileImport__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FileImport__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFileImportAccess().getGroup()); 
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
    // $ANTLR end "ruleFileImport"


    // $ANTLR start "entryRuleLocalImport"
    // InternalBSharp.g:304:1: entryRuleLocalImport : ruleLocalImport EOF ;
    public final void entryRuleLocalImport() throws RecognitionException {
        try {
            // InternalBSharp.g:305:1: ( ruleLocalImport EOF )
            // InternalBSharp.g:306:1: ruleLocalImport EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalImportRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleLocalImport();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalImportRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalBSharp.g:313:1: ruleLocalImport : ( ( rule__LocalImport__Group__0 ) ) ;
    public final void ruleLocalImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:317:2: ( ( ( rule__LocalImport__Group__0 ) ) )
            // InternalBSharp.g:318:2: ( ( rule__LocalImport__Group__0 ) )
            {
            // InternalBSharp.g:318:2: ( ( rule__LocalImport__Group__0 ) )
            // InternalBSharp.g:319:3: ( rule__LocalImport__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalImportAccess().getGroup()); 
            }
            // InternalBSharp.g:320:3: ( rule__LocalImport__Group__0 )
            // InternalBSharp.g:320:4: rule__LocalImport__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LocalImport__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalImportAccess().getGroup()); 
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
    // $ANTLR end "ruleLocalImport"


    // $ANTLR start "entryRuleClass"
    // InternalBSharp.g:329:1: entryRuleClass : ruleClass EOF ;
    public final void entryRuleClass() throws RecognitionException {
        try {
            // InternalBSharp.g:330:1: ( ruleClass EOF )
            // InternalBSharp.g:331:1: ruleClass EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleClass();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalBSharp.g:338:1: ruleClass : ( ( rule__Class__Group__0 ) ) ;
    public final void ruleClass() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:342:2: ( ( ( rule__Class__Group__0 ) ) )
            // InternalBSharp.g:343:2: ( ( rule__Class__Group__0 ) )
            {
            // InternalBSharp.g:343:2: ( ( rule__Class__Group__0 ) )
            // InternalBSharp.g:344:3: ( rule__Class__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getGroup()); 
            }
            // InternalBSharp.g:345:3: ( rule__Class__Group__0 )
            // InternalBSharp.g:345:4: rule__Class__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getGroup()); 
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
    // $ANTLR end "ruleClass"


    // $ANTLR start "entryRuleInstName"
    // InternalBSharp.g:354:1: entryRuleInstName : ruleInstName EOF ;
    public final void entryRuleInstName() throws RecognitionException {
        try {
            // InternalBSharp.g:355:1: ( ruleInstName EOF )
            // InternalBSharp.g:356:1: ruleInstName EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstNameRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleInstName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstNameRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalBSharp.g:363:1: ruleInstName : ( ( rule__InstName__NameAssignment ) ) ;
    public final void ruleInstName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:367:2: ( ( ( rule__InstName__NameAssignment ) ) )
            // InternalBSharp.g:368:2: ( ( rule__InstName__NameAssignment ) )
            {
            // InternalBSharp.g:368:2: ( ( rule__InstName__NameAssignment ) )
            // InternalBSharp.g:369:3: ( rule__InstName__NameAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstNameAccess().getNameAssignment()); 
            }
            // InternalBSharp.g:370:3: ( rule__InstName__NameAssignment )
            // InternalBSharp.g:370:4: rule__InstName__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__InstName__NameAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstNameAccess().getNameAssignment()); 
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
    // $ANTLR end "ruleInstName"


    // $ANTLR start "entryRulePolyContext"
    // InternalBSharp.g:379:1: entryRulePolyContext : rulePolyContext EOF ;
    public final void entryRulePolyContext() throws RecognitionException {
        try {
            // InternalBSharp.g:380:1: ( rulePolyContext EOF )
            // InternalBSharp.g:381:1: rulePolyContext EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPolyContextRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePolyContext();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPolyContextRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalBSharp.g:388:1: rulePolyContext : ( ( rule__PolyContext__Group__0 ) ) ;
    public final void rulePolyContext() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:392:2: ( ( ( rule__PolyContext__Group__0 ) ) )
            // InternalBSharp.g:393:2: ( ( rule__PolyContext__Group__0 ) )
            {
            // InternalBSharp.g:393:2: ( ( rule__PolyContext__Group__0 ) )
            // InternalBSharp.g:394:3: ( rule__PolyContext__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPolyContextAccess().getGroup()); 
            }
            // InternalBSharp.g:395:3: ( rule__PolyContext__Group__0 )
            // InternalBSharp.g:395:4: rule__PolyContext__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PolyContext__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPolyContextAccess().getGroup()); 
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
    // $ANTLR end "rulePolyContext"


    // $ANTLR start "entryRulePolyType"
    // InternalBSharp.g:404:1: entryRulePolyType : rulePolyType EOF ;
    public final void entryRulePolyType() throws RecognitionException {
        try {
            // InternalBSharp.g:405:1: ( rulePolyType EOF )
            // InternalBSharp.g:406:1: rulePolyType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPolyTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePolyType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPolyTypeRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalBSharp.g:413:1: rulePolyType : ( ( rule__PolyType__Group__0 ) ) ;
    public final void rulePolyType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:417:2: ( ( ( rule__PolyType__Group__0 ) ) )
            // InternalBSharp.g:418:2: ( ( rule__PolyType__Group__0 ) )
            {
            // InternalBSharp.g:418:2: ( ( rule__PolyType__Group__0 ) )
            // InternalBSharp.g:419:3: ( rule__PolyType__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPolyTypeAccess().getGroup()); 
            }
            // InternalBSharp.g:420:3: ( rule__PolyType__Group__0 )
            // InternalBSharp.g:420:4: rule__PolyType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PolyType__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPolyTypeAccess().getGroup()); 
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
    // $ANTLR end "rulePolyType"


    // $ANTLR start "entryRuleSuperTypeList"
    // InternalBSharp.g:429:1: entryRuleSuperTypeList : ruleSuperTypeList EOF ;
    public final void entryRuleSuperTypeList() throws RecognitionException {
        try {
            // InternalBSharp.g:430:1: ( ruleSuperTypeList EOF )
            // InternalBSharp.g:431:1: ruleSuperTypeList EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSuperTypeListRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSuperTypeList();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSuperTypeListRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalBSharp.g:438:1: ruleSuperTypeList : ( ( rule__SuperTypeList__Group__0 ) ) ;
    public final void ruleSuperTypeList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:442:2: ( ( ( rule__SuperTypeList__Group__0 ) ) )
            // InternalBSharp.g:443:2: ( ( rule__SuperTypeList__Group__0 ) )
            {
            // InternalBSharp.g:443:2: ( ( rule__SuperTypeList__Group__0 ) )
            // InternalBSharp.g:444:3: ( rule__SuperTypeList__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSuperTypeListAccess().getGroup()); 
            }
            // InternalBSharp.g:445:3: ( rule__SuperTypeList__Group__0 )
            // InternalBSharp.g:445:4: rule__SuperTypeList__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SuperTypeList__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSuperTypeListAccess().getGroup()); 
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
    // $ANTLR end "ruleSuperTypeList"


    // $ANTLR start "entryRuleBuiltinTypeInfixOp"
    // InternalBSharp.g:454:1: entryRuleBuiltinTypeInfixOp : ruleBuiltinTypeInfixOp EOF ;
    public final void entryRuleBuiltinTypeInfixOp() throws RecognitionException {
        try {
            // InternalBSharp.g:455:1: ( ruleBuiltinTypeInfixOp EOF )
            // InternalBSharp.g:456:1: ruleBuiltinTypeInfixOp EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBuiltinTypeInfixOpRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBuiltinTypeInfixOp();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBuiltinTypeInfixOpRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalBSharp.g:463:1: ruleBuiltinTypeInfixOp : ( ( rule__BuiltinTypeInfixOp__Alternatives ) ) ;
    public final void ruleBuiltinTypeInfixOp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:467:2: ( ( ( rule__BuiltinTypeInfixOp__Alternatives ) ) )
            // InternalBSharp.g:468:2: ( ( rule__BuiltinTypeInfixOp__Alternatives ) )
            {
            // InternalBSharp.g:468:2: ( ( rule__BuiltinTypeInfixOp__Alternatives ) )
            // InternalBSharp.g:469:3: ( rule__BuiltinTypeInfixOp__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBuiltinTypeInfixOpAccess().getAlternatives()); 
            }
            // InternalBSharp.g:470:3: ( rule__BuiltinTypeInfixOp__Alternatives )
            // InternalBSharp.g:470:4: rule__BuiltinTypeInfixOp__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BuiltinTypeInfixOp__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBuiltinTypeInfixOpAccess().getAlternatives()); 
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
    // $ANTLR end "ruleBuiltinTypeInfixOp"


    // $ANTLR start "entryRuleConstructedType"
    // InternalBSharp.g:479:1: entryRuleConstructedType : ruleConstructedType EOF ;
    public final void entryRuleConstructedType() throws RecognitionException {
        try {
            // InternalBSharp.g:480:1: ( ruleConstructedType EOF )
            // InternalBSharp.g:481:1: ruleConstructedType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstructedTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleConstructedType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstructedTypeRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalBSharp.g:488:1: ruleConstructedType : ( ( rule__ConstructedType__Group__0 ) ) ;
    public final void ruleConstructedType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:492:2: ( ( ( rule__ConstructedType__Group__0 ) ) )
            // InternalBSharp.g:493:2: ( ( rule__ConstructedType__Group__0 ) )
            {
            // InternalBSharp.g:493:2: ( ( rule__ConstructedType__Group__0 ) )
            // InternalBSharp.g:494:3: ( rule__ConstructedType__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstructedTypeAccess().getGroup()); 
            }
            // InternalBSharp.g:495:3: ( rule__ConstructedType__Group__0 )
            // InternalBSharp.g:495:4: rule__ConstructedType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ConstructedType__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstructedTypeAccess().getGroup()); 
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
    // $ANTLR end "ruleConstructedType"


    // $ANTLR start "entryRuleBuilderElem"
    // InternalBSharp.g:504:1: entryRuleBuilderElem : ruleBuilderElem EOF ;
    public final void entryRuleBuilderElem() throws RecognitionException {
        try {
            // InternalBSharp.g:505:1: ( ruleBuilderElem EOF )
            // InternalBSharp.g:506:1: ruleBuilderElem EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBuilderElemRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBuilderElem();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBuilderElemRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalBSharp.g:513:1: ruleBuilderElem : ( ( rule__BuilderElem__Alternatives ) ) ;
    public final void ruleBuilderElem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:517:2: ( ( ( rule__BuilderElem__Alternatives ) ) )
            // InternalBSharp.g:518:2: ( ( rule__BuilderElem__Alternatives ) )
            {
            // InternalBSharp.g:518:2: ( ( rule__BuilderElem__Alternatives ) )
            // InternalBSharp.g:519:3: ( rule__BuilderElem__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBuilderElemAccess().getAlternatives()); 
            }
            // InternalBSharp.g:520:3: ( rule__BuilderElem__Alternatives )
            // InternalBSharp.g:520:4: rule__BuilderElem__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BuilderElem__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBuilderElemAccess().getAlternatives()); 
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
    // $ANTLR end "ruleBuilderElem"


    // $ANTLR start "entryRuleTypeConstructor"
    // InternalBSharp.g:529:1: entryRuleTypeConstructor : ruleTypeConstructor EOF ;
    public final void entryRuleTypeConstructor() throws RecognitionException {
        try {
            // InternalBSharp.g:530:1: ( ruleTypeConstructor EOF )
            // InternalBSharp.g:531:1: ruleTypeConstructor EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeConstructorRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleTypeConstructor();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeConstructorRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalBSharp.g:538:1: ruleTypeConstructor : ( ( rule__TypeConstructor__Group__0 ) ) ;
    public final void ruleTypeConstructor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:542:2: ( ( ( rule__TypeConstructor__Group__0 ) ) )
            // InternalBSharp.g:543:2: ( ( rule__TypeConstructor__Group__0 ) )
            {
            // InternalBSharp.g:543:2: ( ( rule__TypeConstructor__Group__0 ) )
            // InternalBSharp.g:544:3: ( rule__TypeConstructor__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeConstructorAccess().getGroup()); 
            }
            // InternalBSharp.g:545:3: ( rule__TypeConstructor__Group__0 )
            // InternalBSharp.g:545:4: rule__TypeConstructor__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TypeConstructor__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeConstructorAccess().getGroup()); 
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
    // $ANTLR end "ruleTypeConstructor"


    // $ANTLR start "entryRuleTypePowerSet"
    // InternalBSharp.g:554:1: entryRuleTypePowerSet : ruleTypePowerSet EOF ;
    public final void entryRuleTypePowerSet() throws RecognitionException {
        try {
            // InternalBSharp.g:555:1: ( ruleTypePowerSet EOF )
            // InternalBSharp.g:556:1: ruleTypePowerSet EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypePowerSetRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleTypePowerSet();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypePowerSetRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalBSharp.g:563:1: ruleTypePowerSet : ( ( rule__TypePowerSet__Group__0 ) ) ;
    public final void ruleTypePowerSet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:567:2: ( ( ( rule__TypePowerSet__Group__0 ) ) )
            // InternalBSharp.g:568:2: ( ( rule__TypePowerSet__Group__0 ) )
            {
            // InternalBSharp.g:568:2: ( ( rule__TypePowerSet__Group__0 ) )
            // InternalBSharp.g:569:3: ( rule__TypePowerSet__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypePowerSetAccess().getGroup()); 
            }
            // InternalBSharp.g:570:3: ( rule__TypePowerSet__Group__0 )
            // InternalBSharp.g:570:4: rule__TypePowerSet__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TypePowerSet__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypePowerSetAccess().getGroup()); 
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
    // $ANTLR end "ruleTypePowerSet"


    // $ANTLR start "entryRuleTypeConstrBracket"
    // InternalBSharp.g:579:1: entryRuleTypeConstrBracket : ruleTypeConstrBracket EOF ;
    public final void entryRuleTypeConstrBracket() throws RecognitionException {
        try {
            // InternalBSharp.g:580:1: ( ruleTypeConstrBracket EOF )
            // InternalBSharp.g:581:1: ruleTypeConstrBracket EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeConstrBracketRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleTypeConstrBracket();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeConstrBracketRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalBSharp.g:588:1: ruleTypeConstrBracket : ( ( rule__TypeConstrBracket__Group__0 ) ) ;
    public final void ruleTypeConstrBracket() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:592:2: ( ( ( rule__TypeConstrBracket__Group__0 ) ) )
            // InternalBSharp.g:593:2: ( ( rule__TypeConstrBracket__Group__0 ) )
            {
            // InternalBSharp.g:593:2: ( ( rule__TypeConstrBracket__Group__0 ) )
            // InternalBSharp.g:594:3: ( rule__TypeConstrBracket__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeConstrBracketAccess().getGroup()); 
            }
            // InternalBSharp.g:595:3: ( rule__TypeConstrBracket__Group__0 )
            // InternalBSharp.g:595:4: rule__TypeConstrBracket__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TypeConstrBracket__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeConstrBracketAccess().getGroup()); 
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
    // $ANTLR end "ruleTypeConstrBracket"


    // $ANTLR start "entryRuleTypeDeclContext"
    // InternalBSharp.g:604:1: entryRuleTypeDeclContext : ruleTypeDeclContext EOF ;
    public final void entryRuleTypeDeclContext() throws RecognitionException {
        try {
            // InternalBSharp.g:605:1: ( ruleTypeDeclContext EOF )
            // InternalBSharp.g:606:1: ruleTypeDeclContext EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeDeclContextRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleTypeDeclContext();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeDeclContextRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalBSharp.g:613:1: ruleTypeDeclContext : ( ( rule__TypeDeclContext__Group__0 ) ) ;
    public final void ruleTypeDeclContext() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:617:2: ( ( ( rule__TypeDeclContext__Group__0 ) ) )
            // InternalBSharp.g:618:2: ( ( rule__TypeDeclContext__Group__0 ) )
            {
            // InternalBSharp.g:618:2: ( ( rule__TypeDeclContext__Group__0 ) )
            // InternalBSharp.g:619:3: ( rule__TypeDeclContext__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeDeclContextAccess().getGroup()); 
            }
            // InternalBSharp.g:620:3: ( rule__TypeDeclContext__Group__0 )
            // InternalBSharp.g:620:4: rule__TypeDeclContext__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TypeDeclContext__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeDeclContextAccess().getGroup()); 
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
    // $ANTLR end "ruleTypeDeclContext"


    // $ANTLR start "entryRuleWhere"
    // InternalBSharp.g:629:1: entryRuleWhere : ruleWhere EOF ;
    public final void entryRuleWhere() throws RecognitionException {
        try {
            // InternalBSharp.g:630:1: ( ruleWhere EOF )
            // InternalBSharp.g:631:1: ruleWhere EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhereRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleWhere();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhereRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalBSharp.g:638:1: ruleWhere : ( ( rule__Where__Group__0 ) ) ;
    public final void ruleWhere() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:642:2: ( ( ( rule__Where__Group__0 ) ) )
            // InternalBSharp.g:643:2: ( ( rule__Where__Group__0 ) )
            {
            // InternalBSharp.g:643:2: ( ( rule__Where__Group__0 ) )
            // InternalBSharp.g:644:3: ( rule__Where__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhereAccess().getGroup()); 
            }
            // InternalBSharp.g:645:3: ( rule__Where__Group__0 )
            // InternalBSharp.g:645:4: rule__Where__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Where__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhereAccess().getGroup()); 
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
    // $ANTLR end "ruleWhere"


    // $ANTLR start "entryRuleDatatype"
    // InternalBSharp.g:654:1: entryRuleDatatype : ruleDatatype EOF ;
    public final void entryRuleDatatype() throws RecognitionException {
        try {
            // InternalBSharp.g:655:1: ( ruleDatatype EOF )
            // InternalBSharp.g:656:1: ruleDatatype EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDatatypeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleDatatype();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDatatypeRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalBSharp.g:663:1: ruleDatatype : ( ( rule__Datatype__Group__0 ) ) ;
    public final void ruleDatatype() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:667:2: ( ( ( rule__Datatype__Group__0 ) ) )
            // InternalBSharp.g:668:2: ( ( rule__Datatype__Group__0 ) )
            {
            // InternalBSharp.g:668:2: ( ( rule__Datatype__Group__0 ) )
            // InternalBSharp.g:669:3: ( rule__Datatype__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDatatypeAccess().getGroup()); 
            }
            // InternalBSharp.g:670:3: ( rule__Datatype__Group__0 )
            // InternalBSharp.g:670:4: rule__Datatype__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Datatype__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDatatypeAccess().getGroup()); 
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
    // $ANTLR end "ruleDatatype"


    // $ANTLR start "entryRuleDatatypeConstructor"
    // InternalBSharp.g:679:1: entryRuleDatatypeConstructor : ruleDatatypeConstructor EOF ;
    public final void entryRuleDatatypeConstructor() throws RecognitionException {
        try {
            // InternalBSharp.g:680:1: ( ruleDatatypeConstructor EOF )
            // InternalBSharp.g:681:1: ruleDatatypeConstructor EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDatatypeConstructorRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleDatatypeConstructor();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDatatypeConstructorRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalBSharp.g:688:1: ruleDatatypeConstructor : ( ( rule__DatatypeConstructor__Group__0 ) ) ;
    public final void ruleDatatypeConstructor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:692:2: ( ( ( rule__DatatypeConstructor__Group__0 ) ) )
            // InternalBSharp.g:693:2: ( ( rule__DatatypeConstructor__Group__0 ) )
            {
            // InternalBSharp.g:693:2: ( ( rule__DatatypeConstructor__Group__0 ) )
            // InternalBSharp.g:694:3: ( rule__DatatypeConstructor__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDatatypeConstructorAccess().getGroup()); 
            }
            // InternalBSharp.g:695:3: ( rule__DatatypeConstructor__Group__0 )
            // InternalBSharp.g:695:4: rule__DatatypeConstructor__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DatatypeConstructor__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDatatypeConstructorAccess().getGroup()); 
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
    // $ANTLR end "ruleDatatypeConstructor"


    // $ANTLR start "entryRuleExtend"
    // InternalBSharp.g:704:1: entryRuleExtend : ruleExtend EOF ;
    public final void entryRuleExtend() throws RecognitionException {
        try {
            // InternalBSharp.g:705:1: ( ruleExtend EOF )
            // InternalBSharp.g:706:1: ruleExtend EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleExtend();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExtendRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalBSharp.g:713:1: ruleExtend : ( ( rule__Extend__Group__0 ) ) ;
    public final void ruleExtend() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:717:2: ( ( ( rule__Extend__Group__0 ) ) )
            // InternalBSharp.g:718:2: ( ( rule__Extend__Group__0 ) )
            {
            // InternalBSharp.g:718:2: ( ( rule__Extend__Group__0 ) )
            // InternalBSharp.g:719:3: ( rule__Extend__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendAccess().getGroup()); 
            }
            // InternalBSharp.g:720:3: ( rule__Extend__Group__0 )
            // InternalBSharp.g:720:4: rule__Extend__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Extend__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExtendAccess().getGroup()); 
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
    // $ANTLR end "ruleExtend"


    // $ANTLR start "entryRuleBSharpBlock"
    // InternalBSharp.g:729:1: entryRuleBSharpBlock : ruleBSharpBlock EOF ;
    public final void entryRuleBSharpBlock() throws RecognitionException {
        try {
            // InternalBSharp.g:730:1: ( ruleBSharpBlock EOF )
            // InternalBSharp.g:731:1: ruleBSharpBlock EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSharpBlockRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBSharpBlock();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSharpBlockRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalBSharp.g:738:1: ruleBSharpBlock : ( ( rule__BSharpBlock__Group__0 ) ) ;
    public final void ruleBSharpBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:742:2: ( ( ( rule__BSharpBlock__Group__0 ) ) )
            // InternalBSharp.g:743:2: ( ( rule__BSharpBlock__Group__0 ) )
            {
            // InternalBSharp.g:743:2: ( ( rule__BSharpBlock__Group__0 ) )
            // InternalBSharp.g:744:3: ( rule__BSharpBlock__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSharpBlockAccess().getGroup()); 
            }
            // InternalBSharp.g:745:3: ( rule__BSharpBlock__Group__0 )
            // InternalBSharp.g:745:4: rule__BSharpBlock__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BSharpBlock__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSharpBlockAccess().getGroup()); 
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
    // $ANTLR end "ruleBSharpBlock"


    // $ANTLR start "entryRuleFunctionDecl"
    // InternalBSharp.g:754:1: entryRuleFunctionDecl : ruleFunctionDecl EOF ;
    public final void entryRuleFunctionDecl() throws RecognitionException {
        try {
            // InternalBSharp.g:755:1: ( ruleFunctionDecl EOF )
            // InternalBSharp.g:756:1: ruleFunctionDecl EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionDeclRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleFunctionDecl();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionDeclRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalBSharp.g:763:1: ruleFunctionDecl : ( ( rule__FunctionDecl__Group__0 ) ) ;
    public final void ruleFunctionDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:767:2: ( ( ( rule__FunctionDecl__Group__0 ) ) )
            // InternalBSharp.g:768:2: ( ( rule__FunctionDecl__Group__0 ) )
            {
            // InternalBSharp.g:768:2: ( ( rule__FunctionDecl__Group__0 ) )
            // InternalBSharp.g:769:3: ( rule__FunctionDecl__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionDeclAccess().getGroup()); 
            }
            // InternalBSharp.g:770:3: ( rule__FunctionDecl__Group__0 )
            // InternalBSharp.g:770:4: rule__FunctionDecl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FunctionDecl__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionDeclAccess().getGroup()); 
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
    // $ANTLR end "ruleFunctionDecl"


    // $ANTLR start "entryRuleMatchStatement"
    // InternalBSharp.g:779:1: entryRuleMatchStatement : ruleMatchStatement EOF ;
    public final void entryRuleMatchStatement() throws RecognitionException {
        try {
            // InternalBSharp.g:780:1: ( ruleMatchStatement EOF )
            // InternalBSharp.g:781:1: ruleMatchStatement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMatchStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMatchStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMatchStatementRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalBSharp.g:788:1: ruleMatchStatement : ( ( rule__MatchStatement__Group__0 ) ) ;
    public final void ruleMatchStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:792:2: ( ( ( rule__MatchStatement__Group__0 ) ) )
            // InternalBSharp.g:793:2: ( ( rule__MatchStatement__Group__0 ) )
            {
            // InternalBSharp.g:793:2: ( ( rule__MatchStatement__Group__0 ) )
            // InternalBSharp.g:794:3: ( rule__MatchStatement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMatchStatementAccess().getGroup()); 
            }
            // InternalBSharp.g:795:3: ( rule__MatchStatement__Group__0 )
            // InternalBSharp.g:795:4: rule__MatchStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MatchStatement__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMatchStatementAccess().getGroup()); 
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
    // $ANTLR end "ruleMatchStatement"


    // $ANTLR start "entryRuleMatchCase"
    // InternalBSharp.g:804:1: entryRuleMatchCase : ruleMatchCase EOF ;
    public final void entryRuleMatchCase() throws RecognitionException {
        try {
            // InternalBSharp.g:805:1: ( ruleMatchCase EOF )
            // InternalBSharp.g:806:1: ruleMatchCase EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMatchCaseRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMatchCase();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMatchCaseRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalBSharp.g:813:1: ruleMatchCase : ( ( rule__MatchCase__Group__0 ) ) ;
    public final void ruleMatchCase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:817:2: ( ( ( rule__MatchCase__Group__0 ) ) )
            // InternalBSharp.g:818:2: ( ( rule__MatchCase__Group__0 ) )
            {
            // InternalBSharp.g:818:2: ( ( rule__MatchCase__Group__0 ) )
            // InternalBSharp.g:819:3: ( rule__MatchCase__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMatchCaseAccess().getGroup()); 
            }
            // InternalBSharp.g:820:3: ( rule__MatchCase__Group__0 )
            // InternalBSharp.g:820:4: rule__MatchCase__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MatchCase__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMatchCaseAccess().getGroup()); 
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
    // $ANTLR end "ruleMatchCase"


    // $ANTLR start "entryRuleTheoremBody"
    // InternalBSharp.g:829:1: entryRuleTheoremBody : ruleTheoremBody EOF ;
    public final void entryRuleTheoremBody() throws RecognitionException {
        try {
            // InternalBSharp.g:830:1: ( ruleTheoremBody EOF )
            // InternalBSharp.g:831:1: ruleTheoremBody EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTheoremBodyRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleTheoremBody();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTheoremBodyRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalBSharp.g:838:1: ruleTheoremBody : ( ( rule__TheoremBody__Group__0 ) ) ;
    public final void ruleTheoremBody() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:842:2: ( ( ( rule__TheoremBody__Group__0 ) ) )
            // InternalBSharp.g:843:2: ( ( rule__TheoremBody__Group__0 ) )
            {
            // InternalBSharp.g:843:2: ( ( rule__TheoremBody__Group__0 ) )
            // InternalBSharp.g:844:3: ( rule__TheoremBody__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTheoremBodyAccess().getGroup()); 
            }
            // InternalBSharp.g:845:3: ( rule__TheoremBody__Group__0 )
            // InternalBSharp.g:845:4: rule__TheoremBody__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TheoremBody__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTheoremBodyAccess().getGroup()); 
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
    // $ANTLR end "ruleTheoremBody"


    // $ANTLR start "entryRuleTheoremDecl"
    // InternalBSharp.g:854:1: entryRuleTheoremDecl : ruleTheoremDecl EOF ;
    public final void entryRuleTheoremDecl() throws RecognitionException {
        try {
            // InternalBSharp.g:855:1: ( ruleTheoremDecl EOF )
            // InternalBSharp.g:856:1: ruleTheoremDecl EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTheoremDeclRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleTheoremDecl();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTheoremDeclRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalBSharp.g:863:1: ruleTheoremDecl : ( ( rule__TheoremDecl__Group__0 ) ) ;
    public final void ruleTheoremDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:867:2: ( ( ( rule__TheoremDecl__Group__0 ) ) )
            // InternalBSharp.g:868:2: ( ( rule__TheoremDecl__Group__0 ) )
            {
            // InternalBSharp.g:868:2: ( ( rule__TheoremDecl__Group__0 ) )
            // InternalBSharp.g:869:3: ( rule__TheoremDecl__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTheoremDeclAccess().getGroup()); 
            }
            // InternalBSharp.g:870:3: ( rule__TheoremDecl__Group__0 )
            // InternalBSharp.g:870:4: rule__TheoremDecl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TheoremDecl__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTheoremDeclAccess().getGroup()); 
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
    // $ANTLR end "ruleTheoremDecl"


    // $ANTLR start "entryRuleTypedVariableList"
    // InternalBSharp.g:879:1: entryRuleTypedVariableList : ruleTypedVariableList EOF ;
    public final void entryRuleTypedVariableList() throws RecognitionException {
        try {
            // InternalBSharp.g:880:1: ( ruleTypedVariableList EOF )
            // InternalBSharp.g:881:1: ruleTypedVariableList EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedVariableListRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleTypedVariableList();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypedVariableListRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalBSharp.g:888:1: ruleTypedVariableList : ( ( rule__TypedVariableList__Group__0 ) ) ;
    public final void ruleTypedVariableList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:892:2: ( ( ( rule__TypedVariableList__Group__0 ) ) )
            // InternalBSharp.g:893:2: ( ( rule__TypedVariableList__Group__0 ) )
            {
            // InternalBSharp.g:893:2: ( ( rule__TypedVariableList__Group__0 ) )
            // InternalBSharp.g:894:3: ( rule__TypedVariableList__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedVariableListAccess().getGroup()); 
            }
            // InternalBSharp.g:895:3: ( rule__TypedVariableList__Group__0 )
            // InternalBSharp.g:895:4: rule__TypedVariableList__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TypedVariableList__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypedVariableListAccess().getGroup()); 
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
    // $ANTLR end "ruleTypedVariableList"


    // $ANTLR start "entryRuleVariableTyping"
    // InternalBSharp.g:904:1: entryRuleVariableTyping : ruleVariableTyping EOF ;
    public final void entryRuleVariableTyping() throws RecognitionException {
        try {
            // InternalBSharp.g:905:1: ( ruleVariableTyping EOF )
            // InternalBSharp.g:906:1: ruleVariableTyping EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableTypingRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleVariableTyping();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableTypingRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalBSharp.g:913:1: ruleVariableTyping : ( ( rule__VariableTyping__Group__0 ) ) ;
    public final void ruleVariableTyping() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:917:2: ( ( ( rule__VariableTyping__Group__0 ) ) )
            // InternalBSharp.g:918:2: ( ( rule__VariableTyping__Group__0 ) )
            {
            // InternalBSharp.g:918:2: ( ( rule__VariableTyping__Group__0 ) )
            // InternalBSharp.g:919:3: ( rule__VariableTyping__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableTypingAccess().getGroup()); 
            }
            // InternalBSharp.g:920:3: ( rule__VariableTyping__Group__0 )
            // InternalBSharp.g:920:4: rule__VariableTyping__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VariableTyping__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableTypingAccess().getGroup()); 
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
    // $ANTLR end "ruleVariableTyping"


    // $ANTLR start "entryRuleTypedVariable"
    // InternalBSharp.g:929:1: entryRuleTypedVariable : ruleTypedVariable EOF ;
    public final void entryRuleTypedVariable() throws RecognitionException {
        try {
            // InternalBSharp.g:930:1: ( ruleTypedVariable EOF )
            // InternalBSharp.g:931:1: ruleTypedVariable EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedVariableRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleTypedVariable();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypedVariableRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalBSharp.g:938:1: ruleTypedVariable : ( ( rule__TypedVariable__NameAssignment ) ) ;
    public final void ruleTypedVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:942:2: ( ( ( rule__TypedVariable__NameAssignment ) ) )
            // InternalBSharp.g:943:2: ( ( rule__TypedVariable__NameAssignment ) )
            {
            // InternalBSharp.g:943:2: ( ( rule__TypedVariable__NameAssignment ) )
            // InternalBSharp.g:944:3: ( rule__TypedVariable__NameAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedVariableAccess().getNameAssignment()); 
            }
            // InternalBSharp.g:945:3: ( rule__TypedVariable__NameAssignment )
            // InternalBSharp.g:945:4: rule__TypedVariable__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__TypedVariable__NameAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypedVariableAccess().getNameAssignment()); 
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
    // $ANTLR end "ruleTypedVariable"


    // $ANTLR start "entryRuleLambda"
    // InternalBSharp.g:954:1: entryRuleLambda : ruleLambda EOF ;
    public final void entryRuleLambda() throws RecognitionException {
        try {
            // InternalBSharp.g:955:1: ( ruleLambda EOF )
            // InternalBSharp.g:956:1: ruleLambda EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLambdaRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleLambda();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLambdaRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalBSharp.g:963:1: ruleLambda : ( ( rule__Lambda__Group__0 ) ) ;
    public final void ruleLambda() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:967:2: ( ( ( rule__Lambda__Group__0 ) ) )
            // InternalBSharp.g:968:2: ( ( rule__Lambda__Group__0 ) )
            {
            // InternalBSharp.g:968:2: ( ( rule__Lambda__Group__0 ) )
            // InternalBSharp.g:969:3: ( rule__Lambda__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLambdaAccess().getGroup()); 
            }
            // InternalBSharp.g:970:3: ( rule__Lambda__Group__0 )
            // InternalBSharp.g:970:4: rule__Lambda__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Lambda__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLambdaAccess().getGroup()); 
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
    // $ANTLR end "ruleLambda"


    // $ANTLR start "entryRuleQuantifier"
    // InternalBSharp.g:979:1: entryRuleQuantifier : ruleQuantifier EOF ;
    public final void entryRuleQuantifier() throws RecognitionException {
        try {
            // InternalBSharp.g:980:1: ( ruleQuantifier EOF )
            // InternalBSharp.g:981:1: ruleQuantifier EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuantifierRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleQuantifier();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQuantifierRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalBSharp.g:988:1: ruleQuantifier : ( ( rule__Quantifier__Group__0 ) ) ;
    public final void ruleQuantifier() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:992:2: ( ( ( rule__Quantifier__Group__0 ) ) )
            // InternalBSharp.g:993:2: ( ( rule__Quantifier__Group__0 ) )
            {
            // InternalBSharp.g:993:2: ( ( rule__Quantifier__Group__0 ) )
            // InternalBSharp.g:994:3: ( rule__Quantifier__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuantifierAccess().getGroup()); 
            }
            // InternalBSharp.g:995:3: ( rule__Quantifier__Group__0 )
            // InternalBSharp.g:995:4: rule__Quantifier__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Quantifier__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQuantifierAccess().getGroup()); 
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
    // $ANTLR end "ruleQuantifier"


    // $ANTLR start "entryRuleRootExpression"
    // InternalBSharp.g:1004:1: entryRuleRootExpression : ruleRootExpression EOF ;
    public final void entryRuleRootExpression() throws RecognitionException {
        try {
            // InternalBSharp.g:1005:1: ( ruleRootExpression EOF )
            // InternalBSharp.g:1006:1: ruleRootExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRootExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleRootExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRootExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalBSharp.g:1013:1: ruleRootExpression : ( ( rule__RootExpression__Alternatives ) ) ;
    public final void ruleRootExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1017:2: ( ( ( rule__RootExpression__Alternatives ) ) )
            // InternalBSharp.g:1018:2: ( ( rule__RootExpression__Alternatives ) )
            {
            // InternalBSharp.g:1018:2: ( ( rule__RootExpression__Alternatives ) )
            // InternalBSharp.g:1019:3: ( rule__RootExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRootExpressionAccess().getAlternatives()); 
            }
            // InternalBSharp.g:1020:3: ( rule__RootExpression__Alternatives )
            // InternalBSharp.g:1020:4: rule__RootExpression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__RootExpression__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRootExpressionAccess().getAlternatives()); 
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
    // $ANTLR end "ruleRootExpression"


    // $ANTLR start "entryRulePrefix"
    // InternalBSharp.g:1029:1: entryRulePrefix : rulePrefix EOF ;
    public final void entryRulePrefix() throws RecognitionException {
        try {
            // InternalBSharp.g:1030:1: ( rulePrefix EOF )
            // InternalBSharp.g:1031:1: rulePrefix EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrefixRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePrefix();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrefixRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalBSharp.g:1038:1: rulePrefix : ( ( rule__Prefix__Group__0 ) ) ;
    public final void rulePrefix() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1042:2: ( ( ( rule__Prefix__Group__0 ) ) )
            // InternalBSharp.g:1043:2: ( ( rule__Prefix__Group__0 ) )
            {
            // InternalBSharp.g:1043:2: ( ( rule__Prefix__Group__0 ) )
            // InternalBSharp.g:1044:3: ( rule__Prefix__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrefixAccess().getGroup()); 
            }
            // InternalBSharp.g:1045:3: ( rule__Prefix__Group__0 )
            // InternalBSharp.g:1045:4: rule__Prefix__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Prefix__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrefixAccess().getGroup()); 
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
    // $ANTLR end "rulePrefix"


    // $ANTLR start "entryRulePrefixBuiltIn"
    // InternalBSharp.g:1054:1: entryRulePrefixBuiltIn : rulePrefixBuiltIn EOF ;
    public final void entryRulePrefixBuiltIn() throws RecognitionException {
        try {
            // InternalBSharp.g:1055:1: ( rulePrefixBuiltIn EOF )
            // InternalBSharp.g:1056:1: rulePrefixBuiltIn EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrefixBuiltInRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePrefixBuiltIn();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrefixBuiltInRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalBSharp.g:1063:1: rulePrefixBuiltIn : ( '\\u00AC' ) ;
    public final void rulePrefixBuiltIn() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1067:2: ( ( '\\u00AC' ) )
            // InternalBSharp.g:1068:2: ( '\\u00AC' )
            {
            // InternalBSharp.g:1068:2: ( '\\u00AC' )
            // InternalBSharp.g:1069:3: '\\u00AC'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrefixBuiltInAccess().getNotSignKeyword()); 
            }
            match(input,11,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrefixBuiltInAccess().getNotSignKeyword()); 
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
    // $ANTLR end "rulePrefixBuiltIn"


    // $ANTLR start "entryRuleInfix"
    // InternalBSharp.g:1079:1: entryRuleInfix : ruleInfix EOF ;
    public final void entryRuleInfix() throws RecognitionException {
        try {
            // InternalBSharp.g:1080:1: ( ruleInfix EOF )
            // InternalBSharp.g:1081:1: ruleInfix EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInfixRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleInfix();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInfixRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalBSharp.g:1088:1: ruleInfix : ( ( rule__Infix__Group__0 ) ) ;
    public final void ruleInfix() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1092:2: ( ( ( rule__Infix__Group__0 ) ) )
            // InternalBSharp.g:1093:2: ( ( rule__Infix__Group__0 ) )
            {
            // InternalBSharp.g:1093:2: ( ( rule__Infix__Group__0 ) )
            // InternalBSharp.g:1094:3: ( rule__Infix__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInfixAccess().getGroup()); 
            }
            // InternalBSharp.g:1095:3: ( rule__Infix__Group__0 )
            // InternalBSharp.g:1095:4: rule__Infix__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Infix__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInfixAccess().getGroup()); 
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
    // $ANTLR end "ruleInfix"


    // $ANTLR start "entryRuleElement"
    // InternalBSharp.g:1104:1: entryRuleElement : ruleElement EOF ;
    public final void entryRuleElement() throws RecognitionException {
        try {
            // InternalBSharp.g:1105:1: ( ruleElement EOF )
            // InternalBSharp.g:1106:1: ruleElement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalBSharp.g:1113:1: ruleElement : ( ( rule__Element__Alternatives ) ) ;
    public final void ruleElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1117:2: ( ( ( rule__Element__Alternatives ) ) )
            // InternalBSharp.g:1118:2: ( ( rule__Element__Alternatives ) )
            {
            // InternalBSharp.g:1118:2: ( ( rule__Element__Alternatives ) )
            // InternalBSharp.g:1119:3: ( rule__Element__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementAccess().getAlternatives()); 
            }
            // InternalBSharp.g:1120:3: ( rule__Element__Alternatives )
            // InternalBSharp.g:1120:4: rule__Element__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Element__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementAccess().getAlternatives()); 
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
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleTuple"
    // InternalBSharp.g:1129:1: entryRuleTuple : ruleTuple EOF ;
    public final void entryRuleTuple() throws RecognitionException {
        try {
            // InternalBSharp.g:1130:1: ( ruleTuple EOF )
            // InternalBSharp.g:1131:1: ruleTuple EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTupleRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleTuple();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTupleRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleTuple"


    // $ANTLR start "ruleTuple"
    // InternalBSharp.g:1138:1: ruleTuple : ( ( rule__Tuple__Group__0 ) ) ;
    public final void ruleTuple() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1142:2: ( ( ( rule__Tuple__Group__0 ) ) )
            // InternalBSharp.g:1143:2: ( ( rule__Tuple__Group__0 ) )
            {
            // InternalBSharp.g:1143:2: ( ( rule__Tuple__Group__0 ) )
            // InternalBSharp.g:1144:3: ( rule__Tuple__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTupleAccess().getGroup()); 
            }
            // InternalBSharp.g:1145:3: ( rule__Tuple__Group__0 )
            // InternalBSharp.g:1145:4: rule__Tuple__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Tuple__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTupleAccess().getGroup()); 
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
    // $ANTLR end "ruleTuple"


    // $ANTLR start "entryRuleFunctionCall"
    // InternalBSharp.g:1154:1: entryRuleFunctionCall : ruleFunctionCall EOF ;
    public final void entryRuleFunctionCall() throws RecognitionException {
        try {
            // InternalBSharp.g:1155:1: ( ruleFunctionCall EOF )
            // InternalBSharp.g:1156:1: ruleFunctionCall EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleFunctionCall();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionCallRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalBSharp.g:1163:1: ruleFunctionCall : ( ( rule__FunctionCall__Alternatives ) ) ;
    public final void ruleFunctionCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1167:2: ( ( ( rule__FunctionCall__Alternatives ) ) )
            // InternalBSharp.g:1168:2: ( ( rule__FunctionCall__Alternatives ) )
            {
            // InternalBSharp.g:1168:2: ( ( rule__FunctionCall__Alternatives ) )
            // InternalBSharp.g:1169:3: ( rule__FunctionCall__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getAlternatives()); 
            }
            // InternalBSharp.g:1170:3: ( rule__FunctionCall__Alternatives )
            // InternalBSharp.g:1170:4: rule__FunctionCall__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__FunctionCall__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionCallAccess().getAlternatives()); 
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
    // $ANTLR end "ruleFunctionCall"


    // $ANTLR start "entryRuleFunctionCallInbuilt"
    // InternalBSharp.g:1179:1: entryRuleFunctionCallInbuilt : ruleFunctionCallInbuilt EOF ;
    public final void entryRuleFunctionCallInbuilt() throws RecognitionException {
        try {
            // InternalBSharp.g:1180:1: ( ruleFunctionCallInbuilt EOF )
            // InternalBSharp.g:1181:1: ruleFunctionCallInbuilt EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallInbuiltRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleFunctionCallInbuilt();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionCallInbuiltRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleFunctionCallInbuilt"


    // $ANTLR start "ruleFunctionCallInbuilt"
    // InternalBSharp.g:1188:1: ruleFunctionCallInbuilt : ( ( rule__FunctionCallInbuilt__Group__0 ) ) ;
    public final void ruleFunctionCallInbuilt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1192:2: ( ( ( rule__FunctionCallInbuilt__Group__0 ) ) )
            // InternalBSharp.g:1193:2: ( ( rule__FunctionCallInbuilt__Group__0 ) )
            {
            // InternalBSharp.g:1193:2: ( ( rule__FunctionCallInbuilt__Group__0 ) )
            // InternalBSharp.g:1194:3: ( rule__FunctionCallInbuilt__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallInbuiltAccess().getGroup()); 
            }
            // InternalBSharp.g:1195:3: ( rule__FunctionCallInbuilt__Group__0 )
            // InternalBSharp.g:1195:4: rule__FunctionCallInbuilt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FunctionCallInbuilt__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionCallInbuiltAccess().getGroup()); 
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
    // $ANTLR end "ruleFunctionCallInbuilt"


    // $ANTLR start "entryRuleFuncCall"
    // InternalBSharp.g:1204:1: entryRuleFuncCall : ruleFuncCall EOF ;
    public final void entryRuleFuncCall() throws RecognitionException {
        try {
            // InternalBSharp.g:1205:1: ( ruleFuncCall EOF )
            // InternalBSharp.g:1206:1: ruleFuncCall EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFuncCallRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleFuncCall();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFuncCallRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleFuncCall"


    // $ANTLR start "ruleFuncCall"
    // InternalBSharp.g:1213:1: ruleFuncCall : ( ( rule__FuncCall__Alternatives ) ) ;
    public final void ruleFuncCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1217:2: ( ( ( rule__FuncCall__Alternatives ) ) )
            // InternalBSharp.g:1218:2: ( ( rule__FuncCall__Alternatives ) )
            {
            // InternalBSharp.g:1218:2: ( ( rule__FuncCall__Alternatives ) )
            // InternalBSharp.g:1219:3: ( rule__FuncCall__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFuncCallAccess().getAlternatives()); 
            }
            // InternalBSharp.g:1220:3: ( rule__FuncCall__Alternatives )
            // InternalBSharp.g:1220:4: rule__FuncCall__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__FuncCall__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFuncCallAccess().getAlternatives()); 
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
    // $ANTLR end "ruleFuncCall"


    // $ANTLR start "entryRuleFuncCallArgs"
    // InternalBSharp.g:1229:1: entryRuleFuncCallArgs : ruleFuncCallArgs EOF ;
    public final void entryRuleFuncCallArgs() throws RecognitionException {
        try {
            // InternalBSharp.g:1230:1: ( ruleFuncCallArgs EOF )
            // InternalBSharp.g:1231:1: ruleFuncCallArgs EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFuncCallArgsRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleFuncCallArgs();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFuncCallArgsRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalBSharp.g:1238:1: ruleFuncCallArgs : ( ( rule__FuncCallArgs__Group__0 ) ) ;
    public final void ruleFuncCallArgs() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1242:2: ( ( ( rule__FuncCallArgs__Group__0 ) ) )
            // InternalBSharp.g:1243:2: ( ( rule__FuncCallArgs__Group__0 ) )
            {
            // InternalBSharp.g:1243:2: ( ( rule__FuncCallArgs__Group__0 ) )
            // InternalBSharp.g:1244:3: ( rule__FuncCallArgs__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFuncCallArgsAccess().getGroup()); 
            }
            // InternalBSharp.g:1245:3: ( rule__FuncCallArgs__Group__0 )
            // InternalBSharp.g:1245:4: rule__FuncCallArgs__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FuncCallArgs__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFuncCallArgsAccess().getGroup()); 
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
    // $ANTLR end "ruleFuncCallArgs"


    // $ANTLR start "entryRuleIfElse"
    // InternalBSharp.g:1254:1: entryRuleIfElse : ruleIfElse EOF ;
    public final void entryRuleIfElse() throws RecognitionException {
        try {
            // InternalBSharp.g:1255:1: ( ruleIfElse EOF )
            // InternalBSharp.g:1256:1: ruleIfElse EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfElseRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleIfElse();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfElseRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalBSharp.g:1263:1: ruleIfElse : ( ( rule__IfElse__Group__0 ) ) ;
    public final void ruleIfElse() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1267:2: ( ( ( rule__IfElse__Group__0 ) ) )
            // InternalBSharp.g:1268:2: ( ( rule__IfElse__Group__0 ) )
            {
            // InternalBSharp.g:1268:2: ( ( rule__IfElse__Group__0 ) )
            // InternalBSharp.g:1269:3: ( rule__IfElse__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfElseAccess().getGroup()); 
            }
            // InternalBSharp.g:1270:3: ( rule__IfElse__Group__0 )
            // InternalBSharp.g:1270:4: rule__IfElse__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IfElse__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfElseAccess().getGroup()); 
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
    // $ANTLR end "ruleIfElse"


    // $ANTLR start "entryRuleInbuiltInfix"
    // InternalBSharp.g:1279:1: entryRuleInbuiltInfix : ruleInbuiltInfix EOF ;
    public final void entryRuleInbuiltInfix() throws RecognitionException {
        try {
            // InternalBSharp.g:1280:1: ( ruleInbuiltInfix EOF )
            // InternalBSharp.g:1281:1: ruleInbuiltInfix EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInbuiltInfixRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleInbuiltInfix();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInbuiltInfixRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalBSharp.g:1288:1: ruleInbuiltInfix : ( ( rule__InbuiltInfix__Alternatives ) ) ;
    public final void ruleInbuiltInfix() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1292:2: ( ( ( rule__InbuiltInfix__Alternatives ) ) )
            // InternalBSharp.g:1293:2: ( ( rule__InbuiltInfix__Alternatives ) )
            {
            // InternalBSharp.g:1293:2: ( ( rule__InbuiltInfix__Alternatives ) )
            // InternalBSharp.g:1294:3: ( rule__InbuiltInfix__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInbuiltInfixAccess().getAlternatives()); 
            }
            // InternalBSharp.g:1295:3: ( rule__InbuiltInfix__Alternatives )
            // InternalBSharp.g:1295:4: rule__InbuiltInfix__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__InbuiltInfix__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInbuiltInfixAccess().getAlternatives()); 
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
    // $ANTLR end "ruleInbuiltInfix"


    // $ANTLR start "entryRuleInbuiltUnary"
    // InternalBSharp.g:1304:1: entryRuleInbuiltUnary : ruleInbuiltUnary EOF ;
    public final void entryRuleInbuiltUnary() throws RecognitionException {
        try {
            // InternalBSharp.g:1305:1: ( ruleInbuiltUnary EOF )
            // InternalBSharp.g:1306:1: ruleInbuiltUnary EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInbuiltUnaryRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleInbuiltUnary();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInbuiltUnaryRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleInbuiltUnary"


    // $ANTLR start "ruleInbuiltUnary"
    // InternalBSharp.g:1313:1: ruleInbuiltUnary : ( ( rule__InbuiltUnary__Alternatives ) ) ;
    public final void ruleInbuiltUnary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1317:2: ( ( ( rule__InbuiltUnary__Alternatives ) ) )
            // InternalBSharp.g:1318:2: ( ( rule__InbuiltUnary__Alternatives ) )
            {
            // InternalBSharp.g:1318:2: ( ( rule__InbuiltUnary__Alternatives ) )
            // InternalBSharp.g:1319:3: ( rule__InbuiltUnary__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInbuiltUnaryAccess().getAlternatives()); 
            }
            // InternalBSharp.g:1320:3: ( rule__InbuiltUnary__Alternatives )
            // InternalBSharp.g:1320:4: rule__InbuiltUnary__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__InbuiltUnary__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInbuiltUnaryAccess().getAlternatives()); 
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
    // $ANTLR end "ruleInbuiltUnary"


    // $ANTLR start "entryRuleWrappedInfix"
    // InternalBSharp.g:1329:1: entryRuleWrappedInfix : ruleWrappedInfix EOF ;
    public final void entryRuleWrappedInfix() throws RecognitionException {
        try {
            // InternalBSharp.g:1330:1: ( ruleWrappedInfix EOF )
            // InternalBSharp.g:1331:1: ruleWrappedInfix EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWrappedInfixRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleWrappedInfix();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWrappedInfixRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalBSharp.g:1338:1: ruleWrappedInfix : ( ( rule__WrappedInfix__Group__0 ) ) ;
    public final void ruleWrappedInfix() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1342:2: ( ( ( rule__WrappedInfix__Group__0 ) ) )
            // InternalBSharp.g:1343:2: ( ( rule__WrappedInfix__Group__0 ) )
            {
            // InternalBSharp.g:1343:2: ( ( rule__WrappedInfix__Group__0 ) )
            // InternalBSharp.g:1344:3: ( rule__WrappedInfix__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWrappedInfixAccess().getGroup()); 
            }
            // InternalBSharp.g:1345:3: ( rule__WrappedInfix__Group__0 )
            // InternalBSharp.g:1345:4: rule__WrappedInfix__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__WrappedInfix__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWrappedInfixAccess().getGroup()); 
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
    // $ANTLR end "ruleWrappedInfix"


    // $ANTLR start "entryRuleInstance"
    // InternalBSharp.g:1354:1: entryRuleInstance : ruleInstance EOF ;
    public final void entryRuleInstance() throws RecognitionException {
        try {
            // InternalBSharp.g:1355:1: ( ruleInstance EOF )
            // InternalBSharp.g:1356:1: ruleInstance EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstanceRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleInstance();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstanceRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalBSharp.g:1363:1: ruleInstance : ( ( rule__Instance__Group__0 ) ) ;
    public final void ruleInstance() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1367:2: ( ( ( rule__Instance__Group__0 ) ) )
            // InternalBSharp.g:1368:2: ( ( rule__Instance__Group__0 ) )
            {
            // InternalBSharp.g:1368:2: ( ( rule__Instance__Group__0 ) )
            // InternalBSharp.g:1369:3: ( rule__Instance__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstanceAccess().getGroup()); 
            }
            // InternalBSharp.g:1370:3: ( rule__Instance__Group__0 )
            // InternalBSharp.g:1370:4: rule__Instance__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Instance__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstanceAccess().getGroup()); 
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
    // $ANTLR end "ruleInstance"


    // $ANTLR start "entryRuleReferencingFunc"
    // InternalBSharp.g:1379:1: entryRuleReferencingFunc : ruleReferencingFunc EOF ;
    public final void entryRuleReferencingFunc() throws RecognitionException {
        try {
            // InternalBSharp.g:1380:1: ( ruleReferencingFunc EOF )
            // InternalBSharp.g:1381:1: ruleReferencingFunc EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferencingFuncRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleReferencingFunc();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferencingFuncRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalBSharp.g:1388:1: ruleReferencingFunc : ( ( rule__ReferencingFunc__Group__0 ) ) ;
    public final void ruleReferencingFunc() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1392:2: ( ( ( rule__ReferencingFunc__Group__0 ) ) )
            // InternalBSharp.g:1393:2: ( ( rule__ReferencingFunc__Group__0 ) )
            {
            // InternalBSharp.g:1393:2: ( ( rule__ReferencingFunc__Group__0 ) )
            // InternalBSharp.g:1394:3: ( rule__ReferencingFunc__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferencingFuncAccess().getGroup()); 
            }
            // InternalBSharp.g:1395:3: ( rule__ReferencingFunc__Group__0 )
            // InternalBSharp.g:1395:4: rule__ReferencingFunc__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ReferencingFunc__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferencingFuncAccess().getGroup()); 
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
    // $ANTLR end "ruleReferencingFunc"


    // $ANTLR start "rule__THM_NAME__Alternatives_0"
    // InternalBSharp.g:1403:1: rule__THM_NAME__Alternatives_0 : ( ( RULE_INT ) | ( RULE_ID ) | ( RULE_WS ) );
    public final void rule__THM_NAME__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1407:1: ( ( RULE_INT ) | ( RULE_ID ) | ( RULE_WS ) )
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
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalBSharp.g:1408:2: ( RULE_INT )
                    {
                    // InternalBSharp.g:1408:2: ( RULE_INT )
                    // InternalBSharp.g:1409:3: RULE_INT
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTHM_NAMEAccess().getINTTerminalRuleCall_0_0()); 
                    }
                    match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTHM_NAMEAccess().getINTTerminalRuleCall_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalBSharp.g:1414:2: ( RULE_ID )
                    {
                    // InternalBSharp.g:1414:2: ( RULE_ID )
                    // InternalBSharp.g:1415:3: RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTHM_NAMEAccess().getIDTerminalRuleCall_0_1()); 
                    }
                    match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTHM_NAMEAccess().getIDTerminalRuleCall_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalBSharp.g:1420:2: ( RULE_WS )
                    {
                    // InternalBSharp.g:1420:2: ( RULE_WS )
                    // InternalBSharp.g:1421:3: RULE_WS
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTHM_NAMEAccess().getWSTerminalRuleCall_0_2()); 
                    }
                    match(input,RULE_WS,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTHM_NAMEAccess().getWSTerminalRuleCall_0_2()); 
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
    // $ANTLR end "rule__THM_NAME__Alternatives_0"


    // $ANTLR start "rule__ClassDecl__Alternatives"
    // InternalBSharp.g:1430:1: rule__ClassDecl__Alternatives : ( ( ruleClass ) | ( ruleDatatype ) );
    public final void rule__ClassDecl__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1434:1: ( ( ruleClass ) | ( ruleDatatype ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==41) ) {
                alt2=1;
            }
            else if ( (LA2_0==52) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalBSharp.g:1435:2: ( ruleClass )
                    {
                    // InternalBSharp.g:1435:2: ( ruleClass )
                    // InternalBSharp.g:1436:3: ruleClass
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getClassDeclAccess().getClassParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleClass();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getClassDeclAccess().getClassParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalBSharp.g:1441:2: ( ruleDatatype )
                    {
                    // InternalBSharp.g:1441:2: ( ruleDatatype )
                    // InternalBSharp.g:1442:3: ruleDatatype
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getClassDeclAccess().getDatatypeParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleDatatype();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getClassDeclAccess().getDatatypeParserRuleCall_1()); 
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
    // $ANTLR end "rule__ClassDecl__Alternatives"


    // $ANTLR start "rule__TopLevelInstance__Alternatives"
    // InternalBSharp.g:1451:1: rule__TopLevelInstance__Alternatives : ( ( ruleClassDecl ) | ( ruleExtend ) );
    public final void rule__TopLevelInstance__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1455:1: ( ( ruleClassDecl ) | ( ruleExtend ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==41||LA3_0==52) ) {
                alt3=1;
            }
            else if ( (LA3_0==54) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalBSharp.g:1456:2: ( ruleClassDecl )
                    {
                    // InternalBSharp.g:1456:2: ( ruleClassDecl )
                    // InternalBSharp.g:1457:3: ruleClassDecl
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTopLevelInstanceAccess().getClassDeclParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleClassDecl();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTopLevelInstanceAccess().getClassDeclParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalBSharp.g:1462:2: ( ruleExtend )
                    {
                    // InternalBSharp.g:1462:2: ( ruleExtend )
                    // InternalBSharp.g:1463:3: ruleExtend
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTopLevelInstanceAccess().getExtendParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleExtend();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTopLevelInstanceAccess().getExtendParserRuleCall_1()); 
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
    // $ANTLR end "rule__TopLevelInstance__Alternatives"


    // $ANTLR start "rule__Import__Alternatives"
    // InternalBSharp.g:1472:1: rule__Import__Alternatives : ( ( ruleGlobalImport ) | ( ruleLocalImport ) );
    public final void rule__Import__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1476:1: ( ( ruleGlobalImport ) | ( ruleLocalImport ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==39) ) {
                alt4=1;
            }
            else if ( (LA4_0==40) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalBSharp.g:1477:2: ( ruleGlobalImport )
                    {
                    // InternalBSharp.g:1477:2: ( ruleGlobalImport )
                    // InternalBSharp.g:1478:3: ruleGlobalImport
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getImportAccess().getGlobalImportParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleGlobalImport();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getImportAccess().getGlobalImportParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalBSharp.g:1483:2: ( ruleLocalImport )
                    {
                    // InternalBSharp.g:1483:2: ( ruleLocalImport )
                    // InternalBSharp.g:1484:3: ruleLocalImport
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getImportAccess().getLocalImportParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleLocalImport();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getImportAccess().getLocalImportParserRuleCall_1()); 
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
    // $ANTLR end "rule__Import__Alternatives"


    // $ANTLR start "rule__FileImport__Alternatives_1_1"
    // InternalBSharp.g:1493:1: rule__FileImport__Alternatives_1_1 : ( ( '*' ) | ( ( rule__FileImport__TypeAssignment_1_1_1 ) ) );
    public final void rule__FileImport__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1497:1: ( ( '*' ) | ( ( rule__FileImport__TypeAssignment_1_1_1 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==12) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalBSharp.g:1498:2: ( '*' )
                    {
                    // InternalBSharp.g:1498:2: ( '*' )
                    // InternalBSharp.g:1499:3: '*'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFileImportAccess().getAsteriskKeyword_1_1_0()); 
                    }
                    match(input,12,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFileImportAccess().getAsteriskKeyword_1_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalBSharp.g:1504:2: ( ( rule__FileImport__TypeAssignment_1_1_1 ) )
                    {
                    // InternalBSharp.g:1504:2: ( ( rule__FileImport__TypeAssignment_1_1_1 ) )
                    // InternalBSharp.g:1505:3: ( rule__FileImport__TypeAssignment_1_1_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFileImportAccess().getTypeAssignment_1_1_1()); 
                    }
                    // InternalBSharp.g:1506:3: ( rule__FileImport__TypeAssignment_1_1_1 )
                    // InternalBSharp.g:1506:4: rule__FileImport__TypeAssignment_1_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__FileImport__TypeAssignment_1_1_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFileImportAccess().getTypeAssignment_1_1_1()); 
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
    // $ANTLR end "rule__FileImport__Alternatives_1_1"


    // $ANTLR start "rule__BuiltinTypeInfixOp__Alternatives"
    // InternalBSharp.g:1514:1: rule__BuiltinTypeInfixOp__Alternatives : ( ( '\\u00D7' ) | ( '\\u2192' ) | ( '\\uE102' ) | ( '\\uE100' ) | ( '\\u2194' ) | ( '\\u2916' ) | ( '\\u21F8' ) | ( '\\u21A3' ) | ( '\\u2900' ) | ( '\\u21A0' ) );
    public final void rule__BuiltinTypeInfixOp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1518:1: ( ( '\\u00D7' ) | ( '\\u2192' ) | ( '\\uE102' ) | ( '\\uE100' ) | ( '\\u2194' ) | ( '\\u2916' ) | ( '\\u21F8' ) | ( '\\u21A3' ) | ( '\\u2900' ) | ( '\\u21A0' ) )
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
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalBSharp.g:1519:2: ( '\\u00D7' )
                    {
                    // InternalBSharp.g:1519:2: ( '\\u00D7' )
                    // InternalBSharp.g:1520:3: '\\u00D7'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBuiltinTypeInfixOpAccess().getMultiplicationSignKeyword_0()); 
                    }
                    match(input,13,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBuiltinTypeInfixOpAccess().getMultiplicationSignKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalBSharp.g:1525:2: ( '\\u2192' )
                    {
                    // InternalBSharp.g:1525:2: ( '\\u2192' )
                    // InternalBSharp.g:1526:3: '\\u2192'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBuiltinTypeInfixOpAccess().getRightwardsArrowKeyword_1()); 
                    }
                    match(input,14,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBuiltinTypeInfixOpAccess().getRightwardsArrowKeyword_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalBSharp.g:1531:2: ( '\\uE102' )
                    {
                    // InternalBSharp.g:1531:2: ( '\\uE102' )
                    // InternalBSharp.g:1532:3: '\\uE102'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBuiltinTypeInfixOpAccess().getPrivateUseAreaE102Keyword_2()); 
                    }
                    match(input,15,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBuiltinTypeInfixOpAccess().getPrivateUseAreaE102Keyword_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalBSharp.g:1537:2: ( '\\uE100' )
                    {
                    // InternalBSharp.g:1537:2: ( '\\uE100' )
                    // InternalBSharp.g:1538:3: '\\uE100'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBuiltinTypeInfixOpAccess().getPrivateUseAreaE100Keyword_3()); 
                    }
                    match(input,16,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBuiltinTypeInfixOpAccess().getPrivateUseAreaE100Keyword_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalBSharp.g:1543:2: ( '\\u2194' )
                    {
                    // InternalBSharp.g:1543:2: ( '\\u2194' )
                    // InternalBSharp.g:1544:3: '\\u2194'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBuiltinTypeInfixOpAccess().getLeftRightArrowKeyword_4()); 
                    }
                    match(input,17,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBuiltinTypeInfixOpAccess().getLeftRightArrowKeyword_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalBSharp.g:1549:2: ( '\\u2916' )
                    {
                    // InternalBSharp.g:1549:2: ( '\\u2916' )
                    // InternalBSharp.g:1550:3: '\\u2916'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBuiltinTypeInfixOpAccess().getRightwardsTwoHeadedArrowWithTailKeyword_5()); 
                    }
                    match(input,18,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBuiltinTypeInfixOpAccess().getRightwardsTwoHeadedArrowWithTailKeyword_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalBSharp.g:1555:2: ( '\\u21F8' )
                    {
                    // InternalBSharp.g:1555:2: ( '\\u21F8' )
                    // InternalBSharp.g:1556:3: '\\u21F8'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBuiltinTypeInfixOpAccess().getRightwardsArrowWithVerticalStrokeKeyword_6()); 
                    }
                    match(input,19,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBuiltinTypeInfixOpAccess().getRightwardsArrowWithVerticalStrokeKeyword_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalBSharp.g:1561:2: ( '\\u21A3' )
                    {
                    // InternalBSharp.g:1561:2: ( '\\u21A3' )
                    // InternalBSharp.g:1562:3: '\\u21A3'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBuiltinTypeInfixOpAccess().getRightwardsArrowWithTailKeyword_7()); 
                    }
                    match(input,20,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBuiltinTypeInfixOpAccess().getRightwardsArrowWithTailKeyword_7()); 
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalBSharp.g:1567:2: ( '\\u2900' )
                    {
                    // InternalBSharp.g:1567:2: ( '\\u2900' )
                    // InternalBSharp.g:1568:3: '\\u2900'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBuiltinTypeInfixOpAccess().getRightwardsTwoHeadedArrowWithVerticalStrokeKeyword_8()); 
                    }
                    match(input,21,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBuiltinTypeInfixOpAccess().getRightwardsTwoHeadedArrowWithVerticalStrokeKeyword_8()); 
                    }

                    }


                    }
                    break;
                case 10 :
                    // InternalBSharp.g:1573:2: ( '\\u21A0' )
                    {
                    // InternalBSharp.g:1573:2: ( '\\u21A0' )
                    // InternalBSharp.g:1574:3: '\\u21A0'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBuiltinTypeInfixOpAccess().getRightwardsTwoHeadedArrowKeyword_9()); 
                    }
                    match(input,22,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBuiltinTypeInfixOpAccess().getRightwardsTwoHeadedArrowKeyword_9()); 
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
    // $ANTLR end "rule__BuiltinTypeInfixOp__Alternatives"


    // $ANTLR start "rule__BuilderElem__Alternatives"
    // InternalBSharp.g:1583:1: rule__BuilderElem__Alternatives : ( ( ruleTypeConstructor ) | ( ruleTypeConstrBracket ) | ( ruleTypePowerSet ) );
    public final void rule__BuilderElem__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1587:1: ( ( ruleTypeConstructor ) | ( ruleTypeConstrBracket ) | ( ruleTypePowerSet ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt7=1;
                }
                break;
            case 45:
                {
                alt7=2;
                }
                break;
            case 50:
                {
                alt7=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalBSharp.g:1588:2: ( ruleTypeConstructor )
                    {
                    // InternalBSharp.g:1588:2: ( ruleTypeConstructor )
                    // InternalBSharp.g:1589:3: ruleTypeConstructor
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBuilderElemAccess().getTypeConstructorParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleTypeConstructor();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBuilderElemAccess().getTypeConstructorParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalBSharp.g:1594:2: ( ruleTypeConstrBracket )
                    {
                    // InternalBSharp.g:1594:2: ( ruleTypeConstrBracket )
                    // InternalBSharp.g:1595:3: ruleTypeConstrBracket
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBuilderElemAccess().getTypeConstrBracketParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleTypeConstrBracket();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBuilderElemAccess().getTypeConstrBracketParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalBSharp.g:1600:2: ( ruleTypePowerSet )
                    {
                    // InternalBSharp.g:1600:2: ( ruleTypePowerSet )
                    // InternalBSharp.g:1601:3: ruleTypePowerSet
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBuilderElemAccess().getTypePowerSetParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleTypePowerSet();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBuilderElemAccess().getTypePowerSetParserRuleCall_2()); 
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
    // $ANTLR end "rule__BuilderElem__Alternatives"


    // $ANTLR start "rule__BSharpBlock__Alternatives_2"
    // InternalBSharp.g:1610:1: rule__BSharpBlock__Alternatives_2 : ( ( ( rule__BSharpBlock__FunctionsAssignment_2_0 ) ) | ( ( rule__BSharpBlock__TheoremsAssignment_2_1 ) ) | ( ( rule__BSharpBlock__TheoremsAssignment_2_2 ) ) );
    public final void rule__BSharpBlock__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1614:1: ( ( ( rule__BSharpBlock__FunctionsAssignment_2_0 ) ) | ( ( rule__BSharpBlock__TheoremsAssignment_2_1 ) ) | ( ( rule__BSharpBlock__TheoremsAssignment_2_2 ) ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt8=1;
                }
                break;
            case 58:
                {
                alt8=2;
                }
                break;
            case 62:
                {
                alt8=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalBSharp.g:1615:2: ( ( rule__BSharpBlock__FunctionsAssignment_2_0 ) )
                    {
                    // InternalBSharp.g:1615:2: ( ( rule__BSharpBlock__FunctionsAssignment_2_0 ) )
                    // InternalBSharp.g:1616:3: ( rule__BSharpBlock__FunctionsAssignment_2_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBSharpBlockAccess().getFunctionsAssignment_2_0()); 
                    }
                    // InternalBSharp.g:1617:3: ( rule__BSharpBlock__FunctionsAssignment_2_0 )
                    // InternalBSharp.g:1617:4: rule__BSharpBlock__FunctionsAssignment_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BSharpBlock__FunctionsAssignment_2_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBSharpBlockAccess().getFunctionsAssignment_2_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalBSharp.g:1621:2: ( ( rule__BSharpBlock__TheoremsAssignment_2_1 ) )
                    {
                    // InternalBSharp.g:1621:2: ( ( rule__BSharpBlock__TheoremsAssignment_2_1 ) )
                    // InternalBSharp.g:1622:3: ( rule__BSharpBlock__TheoremsAssignment_2_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBSharpBlockAccess().getTheoremsAssignment_2_1()); 
                    }
                    // InternalBSharp.g:1623:3: ( rule__BSharpBlock__TheoremsAssignment_2_1 )
                    // InternalBSharp.g:1623:4: rule__BSharpBlock__TheoremsAssignment_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__BSharpBlock__TheoremsAssignment_2_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBSharpBlockAccess().getTheoremsAssignment_2_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalBSharp.g:1627:2: ( ( rule__BSharpBlock__TheoremsAssignment_2_2 ) )
                    {
                    // InternalBSharp.g:1627:2: ( ( rule__BSharpBlock__TheoremsAssignment_2_2 ) )
                    // InternalBSharp.g:1628:3: ( rule__BSharpBlock__TheoremsAssignment_2_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBSharpBlockAccess().getTheoremsAssignment_2_2()); 
                    }
                    // InternalBSharp.g:1629:3: ( rule__BSharpBlock__TheoremsAssignment_2_2 )
                    // InternalBSharp.g:1629:4: rule__BSharpBlock__TheoremsAssignment_2_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__BSharpBlock__TheoremsAssignment_2_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBSharpBlockAccess().getTheoremsAssignment_2_2()); 
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
    // $ANTLR end "rule__BSharpBlock__Alternatives_2"


    // $ANTLR start "rule__Quantifier__QTypeAlternatives_0_0"
    // InternalBSharp.g:1637:1: rule__Quantifier__QTypeAlternatives_0_0 : ( ( '\\u2200' ) | ( '\\u2203' ) );
    public final void rule__Quantifier__QTypeAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1641:1: ( ( '\\u2200' ) | ( '\\u2203' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==23) ) {
                alt9=1;
            }
            else if ( (LA9_0==24) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalBSharp.g:1642:2: ( '\\u2200' )
                    {
                    // InternalBSharp.g:1642:2: ( '\\u2200' )
                    // InternalBSharp.g:1643:3: '\\u2200'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getQuantifierAccess().getQTypeForAllKeyword_0_0_0()); 
                    }
                    match(input,23,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getQuantifierAccess().getQTypeForAllKeyword_0_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalBSharp.g:1648:2: ( '\\u2203' )
                    {
                    // InternalBSharp.g:1648:2: ( '\\u2203' )
                    // InternalBSharp.g:1649:3: '\\u2203'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getQuantifierAccess().getQTypeThereExistsKeyword_0_0_1()); 
                    }
                    match(input,24,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getQuantifierAccess().getQTypeThereExistsKeyword_0_0_1()); 
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
    // $ANTLR end "rule__Quantifier__QTypeAlternatives_0_0"


    // $ANTLR start "rule__RootExpression__Alternatives"
    // InternalBSharp.g:1658:1: rule__RootExpression__Alternatives : ( ( ruleLambda ) | ( ruleQuantifier ) | ( ruleInfix ) | ( ruleMatchStatement ) | ( ruleIfElse ) );
    public final void rule__RootExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1662:1: ( ( ruleLambda ) | ( ruleQuantifier ) | ( ruleInfix ) | ( ruleMatchStatement ) | ( ruleIfElse ) )
            int alt10=5;
            switch ( input.LA(1) ) {
            case 64:
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
            case 32:
            case 33:
            case 34:
            case 35:
            case 43:
            case 45:
                {
                alt10=3;
                }
                break;
            case 57:
                {
                alt10=4;
                }
                break;
            case 60:
                {
                alt10=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalBSharp.g:1663:2: ( ruleLambda )
                    {
                    // InternalBSharp.g:1663:2: ( ruleLambda )
                    // InternalBSharp.g:1664:3: ruleLambda
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRootExpressionAccess().getLambdaParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleLambda();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRootExpressionAccess().getLambdaParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalBSharp.g:1669:2: ( ruleQuantifier )
                    {
                    // InternalBSharp.g:1669:2: ( ruleQuantifier )
                    // InternalBSharp.g:1670:3: ruleQuantifier
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRootExpressionAccess().getQuantifierParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleQuantifier();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRootExpressionAccess().getQuantifierParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalBSharp.g:1675:2: ( ruleInfix )
                    {
                    // InternalBSharp.g:1675:2: ( ruleInfix )
                    // InternalBSharp.g:1676:3: ruleInfix
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRootExpressionAccess().getInfixParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleInfix();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRootExpressionAccess().getInfixParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalBSharp.g:1681:2: ( ruleMatchStatement )
                    {
                    // InternalBSharp.g:1681:2: ( ruleMatchStatement )
                    // InternalBSharp.g:1682:3: ruleMatchStatement
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRootExpressionAccess().getMatchStatementParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleMatchStatement();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRootExpressionAccess().getMatchStatementParserRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalBSharp.g:1687:2: ( ruleIfElse )
                    {
                    // InternalBSharp.g:1687:2: ( ruleIfElse )
                    // InternalBSharp.g:1688:3: ruleIfElse
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRootExpressionAccess().getIfElseParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleIfElse();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRootExpressionAccess().getIfElseParserRuleCall_4()); 
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
    // $ANTLR end "rule__RootExpression__Alternatives"


    // $ANTLR start "rule__Infix__Alternatives_1_1"
    // InternalBSharp.g:1697:1: rule__Infix__Alternatives_1_1 : ( ( ( rule__Infix__FuncNameAssignment_1_1_0 ) ) | ( ( rule__Infix__OpNameAssignment_1_1_1 ) ) );
    public final void rule__Infix__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1701:1: ( ( ( rule__Infix__FuncNameAssignment_1_1_0 ) ) | ( ( rule__Infix__OpNameAssignment_1_1_1 ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                alt11=1;
            }
            else if ( ((LA11_0>=25 && LA11_0<=31)) ) {
                alt11=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalBSharp.g:1702:2: ( ( rule__Infix__FuncNameAssignment_1_1_0 ) )
                    {
                    // InternalBSharp.g:1702:2: ( ( rule__Infix__FuncNameAssignment_1_1_0 ) )
                    // InternalBSharp.g:1703:3: ( rule__Infix__FuncNameAssignment_1_1_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getInfixAccess().getFuncNameAssignment_1_1_0()); 
                    }
                    // InternalBSharp.g:1704:3: ( rule__Infix__FuncNameAssignment_1_1_0 )
                    // InternalBSharp.g:1704:4: rule__Infix__FuncNameAssignment_1_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Infix__FuncNameAssignment_1_1_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getInfixAccess().getFuncNameAssignment_1_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalBSharp.g:1708:2: ( ( rule__Infix__OpNameAssignment_1_1_1 ) )
                    {
                    // InternalBSharp.g:1708:2: ( ( rule__Infix__OpNameAssignment_1_1_1 ) )
                    // InternalBSharp.g:1709:3: ( rule__Infix__OpNameAssignment_1_1_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getInfixAccess().getOpNameAssignment_1_1_1()); 
                    }
                    // InternalBSharp.g:1710:3: ( rule__Infix__OpNameAssignment_1_1_1 )
                    // InternalBSharp.g:1710:4: rule__Infix__OpNameAssignment_1_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Infix__OpNameAssignment_1_1_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getInfixAccess().getOpNameAssignment_1_1_1()); 
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
    // $ANTLR end "rule__Infix__Alternatives_1_1"


    // $ANTLR start "rule__Element__Alternatives"
    // InternalBSharp.g:1718:1: rule__Element__Alternatives : ( ( ruleTuple ) | ( rulePrefix ) | ( ruleFuncCall ) );
    public final void rule__Element__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1722:1: ( ( ruleTuple ) | ( rulePrefix ) | ( ruleFuncCall ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 45:
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
            case 32:
            case 33:
            case 34:
            case 35:
            case 43:
                {
                alt12=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalBSharp.g:1723:2: ( ruleTuple )
                    {
                    // InternalBSharp.g:1723:2: ( ruleTuple )
                    // InternalBSharp.g:1724:3: ruleTuple
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getElementAccess().getTupleParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleTuple();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getElementAccess().getTupleParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalBSharp.g:1729:2: ( rulePrefix )
                    {
                    // InternalBSharp.g:1729:2: ( rulePrefix )
                    // InternalBSharp.g:1730:3: rulePrefix
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getElementAccess().getPrefixParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    rulePrefix();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getElementAccess().getPrefixParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalBSharp.g:1735:2: ( ruleFuncCall )
                    {
                    // InternalBSharp.g:1735:2: ( ruleFuncCall )
                    // InternalBSharp.g:1736:3: ruleFuncCall
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getElementAccess().getFuncCallParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleFuncCall();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getElementAccess().getFuncCallParserRuleCall_2()); 
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
    // $ANTLR end "rule__Element__Alternatives"


    // $ANTLR start "rule__FunctionCall__Alternatives"
    // InternalBSharp.g:1745:1: rule__FunctionCall__Alternatives : ( ( ( rule__FunctionCall__WrappedAssignment_0 ) ) | ( ( rule__FunctionCall__Group_1__0 ) ) );
    public final void rule__FunctionCall__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1749:1: ( ( ( rule__FunctionCall__WrappedAssignment_0 ) ) | ( ( rule__FunctionCall__Group_1__0 ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==43) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_ID) ) {
                alt13=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalBSharp.g:1750:2: ( ( rule__FunctionCall__WrappedAssignment_0 ) )
                    {
                    // InternalBSharp.g:1750:2: ( ( rule__FunctionCall__WrappedAssignment_0 ) )
                    // InternalBSharp.g:1751:3: ( rule__FunctionCall__WrappedAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFunctionCallAccess().getWrappedAssignment_0()); 
                    }
                    // InternalBSharp.g:1752:3: ( rule__FunctionCall__WrappedAssignment_0 )
                    // InternalBSharp.g:1752:4: rule__FunctionCall__WrappedAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FunctionCall__WrappedAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFunctionCallAccess().getWrappedAssignment_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalBSharp.g:1756:2: ( ( rule__FunctionCall__Group_1__0 ) )
                    {
                    // InternalBSharp.g:1756:2: ( ( rule__FunctionCall__Group_1__0 ) )
                    // InternalBSharp.g:1757:3: ( rule__FunctionCall__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFunctionCallAccess().getGroup_1()); 
                    }
                    // InternalBSharp.g:1758:3: ( rule__FunctionCall__Group_1__0 )
                    // InternalBSharp.g:1758:4: rule__FunctionCall__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FunctionCall__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFunctionCallAccess().getGroup_1()); 
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
    // $ANTLR end "rule__FunctionCall__Alternatives"


    // $ANTLR start "rule__FuncCall__Alternatives"
    // InternalBSharp.g:1766:1: rule__FuncCall__Alternatives : ( ( ruleFunctionCall ) | ( ruleFunctionCallInbuilt ) );
    public final void rule__FuncCall__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1770:1: ( ( ruleFunctionCall ) | ( ruleFunctionCallInbuilt ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID||LA14_0==43) ) {
                alt14=1;
            }
            else if ( ((LA14_0>=32 && LA14_0<=35)) ) {
                alt14=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalBSharp.g:1771:2: ( ruleFunctionCall )
                    {
                    // InternalBSharp.g:1771:2: ( ruleFunctionCall )
                    // InternalBSharp.g:1772:3: ruleFunctionCall
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFuncCallAccess().getFunctionCallParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleFunctionCall();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFuncCallAccess().getFunctionCallParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalBSharp.g:1777:2: ( ruleFunctionCallInbuilt )
                    {
                    // InternalBSharp.g:1777:2: ( ruleFunctionCallInbuilt )
                    // InternalBSharp.g:1778:3: ruleFunctionCallInbuilt
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFuncCallAccess().getFunctionCallInbuiltParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleFunctionCallInbuilt();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFuncCallAccess().getFunctionCallInbuiltParserRuleCall_1()); 
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
    // $ANTLR end "rule__FuncCall__Alternatives"


    // $ANTLR start "rule__InbuiltInfix__Alternatives"
    // InternalBSharp.g:1787:1: rule__InbuiltInfix__Alternatives : ( ( '\\u21D4' ) | ( '\\u21D2' ) | ( '=' ) | ( '\\u2260' ) | ( '\\u2227' ) | ( '\\u2228' ) | ( '\\u2208' ) );
    public final void rule__InbuiltInfix__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1791:1: ( ( '\\u21D4' ) | ( '\\u21D2' ) | ( '=' ) | ( '\\u2260' ) | ( '\\u2227' ) | ( '\\u2228' ) | ( '\\u2208' ) )
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
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalBSharp.g:1792:2: ( '\\u21D4' )
                    {
                    // InternalBSharp.g:1792:2: ( '\\u21D4' )
                    // InternalBSharp.g:1793:3: '\\u21D4'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getInbuiltInfixAccess().getLeftRightDoubleArrowKeyword_0()); 
                    }
                    match(input,25,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getInbuiltInfixAccess().getLeftRightDoubleArrowKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalBSharp.g:1798:2: ( '\\u21D2' )
                    {
                    // InternalBSharp.g:1798:2: ( '\\u21D2' )
                    // InternalBSharp.g:1799:3: '\\u21D2'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getInbuiltInfixAccess().getRightwardsDoubleArrowKeyword_1()); 
                    }
                    match(input,26,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getInbuiltInfixAccess().getRightwardsDoubleArrowKeyword_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalBSharp.g:1804:2: ( '=' )
                    {
                    // InternalBSharp.g:1804:2: ( '=' )
                    // InternalBSharp.g:1805:3: '='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getInbuiltInfixAccess().getEqualsSignKeyword_2()); 
                    }
                    match(input,27,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getInbuiltInfixAccess().getEqualsSignKeyword_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalBSharp.g:1810:2: ( '\\u2260' )
                    {
                    // InternalBSharp.g:1810:2: ( '\\u2260' )
                    // InternalBSharp.g:1811:3: '\\u2260'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getInbuiltInfixAccess().getNotEqualToKeyword_3()); 
                    }
                    match(input,28,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getInbuiltInfixAccess().getNotEqualToKeyword_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalBSharp.g:1816:2: ( '\\u2227' )
                    {
                    // InternalBSharp.g:1816:2: ( '\\u2227' )
                    // InternalBSharp.g:1817:3: '\\u2227'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getInbuiltInfixAccess().getLogicalAndKeyword_4()); 
                    }
                    match(input,29,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getInbuiltInfixAccess().getLogicalAndKeyword_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalBSharp.g:1822:2: ( '\\u2228' )
                    {
                    // InternalBSharp.g:1822:2: ( '\\u2228' )
                    // InternalBSharp.g:1823:3: '\\u2228'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getInbuiltInfixAccess().getLogicalOrKeyword_5()); 
                    }
                    match(input,30,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getInbuiltInfixAccess().getLogicalOrKeyword_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalBSharp.g:1828:2: ( '\\u2208' )
                    {
                    // InternalBSharp.g:1828:2: ( '\\u2208' )
                    // InternalBSharp.g:1829:3: '\\u2208'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getInbuiltInfixAccess().getElementOfKeyword_6()); 
                    }
                    match(input,31,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getInbuiltInfixAccess().getElementOfKeyword_6()); 
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
    // $ANTLR end "rule__InbuiltInfix__Alternatives"


    // $ANTLR start "rule__InbuiltUnary__Alternatives"
    // InternalBSharp.g:1838:1: rule__InbuiltUnary__Alternatives : ( ( 'prj1' ) | ( 'prj2' ) | ( 'dom' ) | ( 'ran' ) );
    public final void rule__InbuiltUnary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1842:1: ( ( 'prj1' ) | ( 'prj2' ) | ( 'dom' ) | ( 'ran' ) )
            int alt16=4;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt16=1;
                }
                break;
            case 33:
                {
                alt16=2;
                }
                break;
            case 34:
                {
                alt16=3;
                }
                break;
            case 35:
                {
                alt16=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalBSharp.g:1843:2: ( 'prj1' )
                    {
                    // InternalBSharp.g:1843:2: ( 'prj1' )
                    // InternalBSharp.g:1844:3: 'prj1'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getInbuiltUnaryAccess().getPrj1Keyword_0()); 
                    }
                    match(input,32,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getInbuiltUnaryAccess().getPrj1Keyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalBSharp.g:1849:2: ( 'prj2' )
                    {
                    // InternalBSharp.g:1849:2: ( 'prj2' )
                    // InternalBSharp.g:1850:3: 'prj2'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getInbuiltUnaryAccess().getPrj2Keyword_1()); 
                    }
                    match(input,33,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getInbuiltUnaryAccess().getPrj2Keyword_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalBSharp.g:1855:2: ( 'dom' )
                    {
                    // InternalBSharp.g:1855:2: ( 'dom' )
                    // InternalBSharp.g:1856:3: 'dom'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getInbuiltUnaryAccess().getDomKeyword_2()); 
                    }
                    match(input,34,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getInbuiltUnaryAccess().getDomKeyword_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalBSharp.g:1861:2: ( 'ran' )
                    {
                    // InternalBSharp.g:1861:2: ( 'ran' )
                    // InternalBSharp.g:1862:3: 'ran'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getInbuiltUnaryAccess().getRanKeyword_3()); 
                    }
                    match(input,35,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getInbuiltUnaryAccess().getRanKeyword_3()); 
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
    // $ANTLR end "rule__InbuiltUnary__Alternatives"


    // $ANTLR start "rule__WrappedInfix__Alternatives_1"
    // InternalBSharp.g:1871:1: rule__WrappedInfix__Alternatives_1 : ( ( ( rule__WrappedInfix__InbuiltAssignment_1_0 ) ) | ( ( rule__WrappedInfix__FuncNameAssignment_1_1 ) ) );
    public final void rule__WrappedInfix__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1875:1: ( ( ( rule__WrappedInfix__InbuiltAssignment_1_0 ) ) | ( ( rule__WrappedInfix__FuncNameAssignment_1_1 ) ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=25 && LA17_0<=31)) ) {
                alt17=1;
            }
            else if ( (LA17_0==RULE_ID) ) {
                alt17=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalBSharp.g:1876:2: ( ( rule__WrappedInfix__InbuiltAssignment_1_0 ) )
                    {
                    // InternalBSharp.g:1876:2: ( ( rule__WrappedInfix__InbuiltAssignment_1_0 ) )
                    // InternalBSharp.g:1877:3: ( rule__WrappedInfix__InbuiltAssignment_1_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getWrappedInfixAccess().getInbuiltAssignment_1_0()); 
                    }
                    // InternalBSharp.g:1878:3: ( rule__WrappedInfix__InbuiltAssignment_1_0 )
                    // InternalBSharp.g:1878:4: rule__WrappedInfix__InbuiltAssignment_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__WrappedInfix__InbuiltAssignment_1_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getWrappedInfixAccess().getInbuiltAssignment_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalBSharp.g:1882:2: ( ( rule__WrappedInfix__FuncNameAssignment_1_1 ) )
                    {
                    // InternalBSharp.g:1882:2: ( ( rule__WrappedInfix__FuncNameAssignment_1_1 ) )
                    // InternalBSharp.g:1883:3: ( rule__WrappedInfix__FuncNameAssignment_1_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getWrappedInfixAccess().getFuncNameAssignment_1_1()); 
                    }
                    // InternalBSharp.g:1884:3: ( rule__WrappedInfix__FuncNameAssignment_1_1 )
                    // InternalBSharp.g:1884:4: rule__WrappedInfix__FuncNameAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__WrappedInfix__FuncNameAssignment_1_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getWrappedInfixAccess().getFuncNameAssignment_1_1()); 
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
    // $ANTLR end "rule__WrappedInfix__Alternatives_1"


    // $ANTLR start "rule__TopLevel__Group__0"
    // InternalBSharp.g:1892:1: rule__TopLevel__Group__0 : rule__TopLevel__Group__0__Impl rule__TopLevel__Group__1 ;
    public final void rule__TopLevel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1896:1: ( rule__TopLevel__Group__0__Impl rule__TopLevel__Group__1 )
            // InternalBSharp.g:1897:2: rule__TopLevel__Group__0__Impl rule__TopLevel__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__TopLevel__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TopLevel__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:1904:1: rule__TopLevel__Group__0__Impl : ( 'package' ) ;
    public final void rule__TopLevel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1908:1: ( ( 'package' ) )
            // InternalBSharp.g:1909:1: ( 'package' )
            {
            // InternalBSharp.g:1909:1: ( 'package' )
            // InternalBSharp.g:1910:2: 'package'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTopLevelAccess().getPackageKeyword_0()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTopLevelAccess().getPackageKeyword_0()); 
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
    // $ANTLR end "rule__TopLevel__Group__0__Impl"


    // $ANTLR start "rule__TopLevel__Group__1"
    // InternalBSharp.g:1919:1: rule__TopLevel__Group__1 : rule__TopLevel__Group__1__Impl rule__TopLevel__Group__2 ;
    public final void rule__TopLevel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1923:1: ( rule__TopLevel__Group__1__Impl rule__TopLevel__Group__2 )
            // InternalBSharp.g:1924:2: rule__TopLevel__Group__1__Impl rule__TopLevel__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__TopLevel__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TopLevel__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:1931:1: rule__TopLevel__Group__1__Impl : ( ( rule__TopLevel__NameAssignment_1 ) ) ;
    public final void rule__TopLevel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1935:1: ( ( ( rule__TopLevel__NameAssignment_1 ) ) )
            // InternalBSharp.g:1936:1: ( ( rule__TopLevel__NameAssignment_1 ) )
            {
            // InternalBSharp.g:1936:1: ( ( rule__TopLevel__NameAssignment_1 ) )
            // InternalBSharp.g:1937:2: ( rule__TopLevel__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTopLevelAccess().getNameAssignment_1()); 
            }
            // InternalBSharp.g:1938:2: ( rule__TopLevel__NameAssignment_1 )
            // InternalBSharp.g:1938:3: rule__TopLevel__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TopLevel__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTopLevelAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__TopLevel__Group__1__Impl"


    // $ANTLR start "rule__TopLevel__Group__2"
    // InternalBSharp.g:1946:1: rule__TopLevel__Group__2 : rule__TopLevel__Group__2__Impl ;
    public final void rule__TopLevel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1950:1: ( rule__TopLevel__Group__2__Impl )
            // InternalBSharp.g:1951:2: rule__TopLevel__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TopLevel__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:1957:1: rule__TopLevel__Group__2__Impl : ( ( rule__TopLevel__TopLevelFileAssignment_2 ) ) ;
    public final void rule__TopLevel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1961:1: ( ( ( rule__TopLevel__TopLevelFileAssignment_2 ) ) )
            // InternalBSharp.g:1962:1: ( ( rule__TopLevel__TopLevelFileAssignment_2 ) )
            {
            // InternalBSharp.g:1962:1: ( ( rule__TopLevel__TopLevelFileAssignment_2 ) )
            // InternalBSharp.g:1963:2: ( rule__TopLevel__TopLevelFileAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTopLevelAccess().getTopLevelFileAssignment_2()); 
            }
            // InternalBSharp.g:1964:2: ( rule__TopLevel__TopLevelFileAssignment_2 )
            // InternalBSharp.g:1964:3: rule__TopLevel__TopLevelFileAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__TopLevel__TopLevelFileAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTopLevelAccess().getTopLevelFileAssignment_2()); 
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
    // $ANTLR end "rule__TopLevel__Group__2__Impl"


    // $ANTLR start "rule__THM_NAME__Group__0"
    // InternalBSharp.g:1973:1: rule__THM_NAME__Group__0 : rule__THM_NAME__Group__0__Impl rule__THM_NAME__Group__1 ;
    public final void rule__THM_NAME__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1977:1: ( rule__THM_NAME__Group__0__Impl rule__THM_NAME__Group__1 )
            // InternalBSharp.g:1978:2: rule__THM_NAME__Group__0__Impl rule__THM_NAME__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__THM_NAME__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__THM_NAME__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:1985:1: rule__THM_NAME__Group__0__Impl : ( ( rule__THM_NAME__Alternatives_0 )* ) ;
    public final void rule__THM_NAME__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1989:1: ( ( ( rule__THM_NAME__Alternatives_0 )* ) )
            // InternalBSharp.g:1990:1: ( ( rule__THM_NAME__Alternatives_0 )* )
            {
            // InternalBSharp.g:1990:1: ( ( rule__THM_NAME__Alternatives_0 )* )
            // InternalBSharp.g:1991:2: ( rule__THM_NAME__Alternatives_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTHM_NAMEAccess().getAlternatives_0()); 
            }
            // InternalBSharp.g:1992:2: ( rule__THM_NAME__Alternatives_0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=RULE_INT && LA18_0<=RULE_WS)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalBSharp.g:1992:3: rule__THM_NAME__Alternatives_0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__THM_NAME__Alternatives_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTHM_NAMEAccess().getAlternatives_0()); 
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
    // $ANTLR end "rule__THM_NAME__Group__0__Impl"


    // $ANTLR start "rule__THM_NAME__Group__1"
    // InternalBSharp.g:2000:1: rule__THM_NAME__Group__1 : rule__THM_NAME__Group__1__Impl ;
    public final void rule__THM_NAME__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2004:1: ( rule__THM_NAME__Group__1__Impl )
            // InternalBSharp.g:2005:2: rule__THM_NAME__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__THM_NAME__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:2011:1: rule__THM_NAME__Group__1__Impl : ( ':' ) ;
    public final void rule__THM_NAME__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2015:1: ( ( ':' ) )
            // InternalBSharp.g:2016:1: ( ':' )
            {
            // InternalBSharp.g:2016:1: ( ':' )
            // InternalBSharp.g:2017:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTHM_NAMEAccess().getColonKeyword_1()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTHM_NAMEAccess().getColonKeyword_1()); 
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
    // $ANTLR end "rule__THM_NAME__Group__1__Impl"


    // $ANTLR start "rule__TopLevelFile__Group__0"
    // InternalBSharp.g:2027:1: rule__TopLevelFile__Group__0 : rule__TopLevelFile__Group__0__Impl rule__TopLevelFile__Group__1 ;
    public final void rule__TopLevelFile__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2031:1: ( rule__TopLevelFile__Group__0__Impl rule__TopLevelFile__Group__1 )
            // InternalBSharp.g:2032:2: rule__TopLevelFile__Group__0__Impl rule__TopLevelFile__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__TopLevelFile__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TopLevelFile__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:2039:1: rule__TopLevelFile__Group__0__Impl : ( () ) ;
    public final void rule__TopLevelFile__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2043:1: ( ( () ) )
            // InternalBSharp.g:2044:1: ( () )
            {
            // InternalBSharp.g:2044:1: ( () )
            // InternalBSharp.g:2045:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTopLevelFileAccess().getTopLevelFileAction_0()); 
            }
            // InternalBSharp.g:2046:2: ()
            // InternalBSharp.g:2046:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTopLevelFileAccess().getTopLevelFileAction_0()); 
            }

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
    // InternalBSharp.g:2054:1: rule__TopLevelFile__Group__1 : rule__TopLevelFile__Group__1__Impl rule__TopLevelFile__Group__2 ;
    public final void rule__TopLevelFile__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2058:1: ( rule__TopLevelFile__Group__1__Impl rule__TopLevelFile__Group__2 )
            // InternalBSharp.g:2059:2: rule__TopLevelFile__Group__1__Impl rule__TopLevelFile__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__TopLevelFile__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TopLevelFile__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:2066:1: rule__TopLevelFile__Group__1__Impl : ( ( rule__TopLevelFile__NoImportElementsAssignment_1 )* ) ;
    public final void rule__TopLevelFile__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2070:1: ( ( ( rule__TopLevelFile__NoImportElementsAssignment_1 )* ) )
            // InternalBSharp.g:2071:1: ( ( rule__TopLevelFile__NoImportElementsAssignment_1 )* )
            {
            // InternalBSharp.g:2071:1: ( ( rule__TopLevelFile__NoImportElementsAssignment_1 )* )
            // InternalBSharp.g:2072:2: ( rule__TopLevelFile__NoImportElementsAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTopLevelFileAccess().getNoImportElementsAssignment_1()); 
            }
            // InternalBSharp.g:2073:2: ( rule__TopLevelFile__NoImportElementsAssignment_1 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==41||LA19_0==52||LA19_0==54) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalBSharp.g:2073:3: rule__TopLevelFile__NoImportElementsAssignment_1
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__TopLevelFile__NoImportElementsAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTopLevelFileAccess().getNoImportElementsAssignment_1()); 
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
    // $ANTLR end "rule__TopLevelFile__Group__1__Impl"


    // $ANTLR start "rule__TopLevelFile__Group__2"
    // InternalBSharp.g:2081:1: rule__TopLevelFile__Group__2 : rule__TopLevelFile__Group__2__Impl ;
    public final void rule__TopLevelFile__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2085:1: ( rule__TopLevelFile__Group__2__Impl )
            // InternalBSharp.g:2086:2: rule__TopLevelFile__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TopLevelFile__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:2092:1: rule__TopLevelFile__Group__2__Impl : ( ( rule__TopLevelFile__TopLevelImportsAssignment_2 )* ) ;
    public final void rule__TopLevelFile__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2096:1: ( ( ( rule__TopLevelFile__TopLevelImportsAssignment_2 )* ) )
            // InternalBSharp.g:2097:1: ( ( rule__TopLevelFile__TopLevelImportsAssignment_2 )* )
            {
            // InternalBSharp.g:2097:1: ( ( rule__TopLevelFile__TopLevelImportsAssignment_2 )* )
            // InternalBSharp.g:2098:2: ( rule__TopLevelFile__TopLevelImportsAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTopLevelFileAccess().getTopLevelImportsAssignment_2()); 
            }
            // InternalBSharp.g:2099:2: ( rule__TopLevelFile__TopLevelImportsAssignment_2 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=39 && LA20_0<=40)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalBSharp.g:2099:3: rule__TopLevelFile__TopLevelImportsAssignment_2
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__TopLevelFile__TopLevelImportsAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTopLevelFileAccess().getTopLevelImportsAssignment_2()); 
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
    // $ANTLR end "rule__TopLevelFile__Group__2__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalBSharp.g:2108:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2112:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalBSharp.g:2113:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:2120:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2124:1: ( ( RULE_ID ) )
            // InternalBSharp.g:2125:1: ( RULE_ID )
            {
            // InternalBSharp.g:2125:1: ( RULE_ID )
            // InternalBSharp.g:2126:2: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
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
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // InternalBSharp.g:2135:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2139:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalBSharp.g:2140:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:2146:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2150:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalBSharp.g:2151:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalBSharp.g:2151:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalBSharp.g:2152:2: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // InternalBSharp.g:2153:2: ( rule__QualifiedName__Group_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==38) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalBSharp.g:2153:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
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
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // InternalBSharp.g:2162:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2166:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalBSharp.g:2167:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:2174:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2178:1: ( ( '.' ) )
            // InternalBSharp.g:2179:1: ( '.' )
            {
            // InternalBSharp.g:2179:1: ( '.' )
            // InternalBSharp.g:2180:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
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
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // InternalBSharp.g:2189:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2193:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalBSharp.g:2194:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:2200:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2204:1: ( ( RULE_ID ) )
            // InternalBSharp.g:2205:1: ( RULE_ID )
            {
            // InternalBSharp.g:2205:1: ( RULE_ID )
            // InternalBSharp.g:2206:2: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
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
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__TopLevelImport__Group__0"
    // InternalBSharp.g:2216:1: rule__TopLevelImport__Group__0 : rule__TopLevelImport__Group__0__Impl rule__TopLevelImport__Group__1 ;
    public final void rule__TopLevelImport__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2220:1: ( rule__TopLevelImport__Group__0__Impl rule__TopLevelImport__Group__1 )
            // InternalBSharp.g:2221:2: rule__TopLevelImport__Group__0__Impl rule__TopLevelImport__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__TopLevelImport__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TopLevelImport__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:2228:1: rule__TopLevelImport__Group__0__Impl : ( ( ( rule__TopLevelImport__ImportsAssignment_0 ) ) ( ( rule__TopLevelImport__ImportsAssignment_0 )* ) ) ;
    public final void rule__TopLevelImport__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2232:1: ( ( ( ( rule__TopLevelImport__ImportsAssignment_0 ) ) ( ( rule__TopLevelImport__ImportsAssignment_0 )* ) ) )
            // InternalBSharp.g:2233:1: ( ( ( rule__TopLevelImport__ImportsAssignment_0 ) ) ( ( rule__TopLevelImport__ImportsAssignment_0 )* ) )
            {
            // InternalBSharp.g:2233:1: ( ( ( rule__TopLevelImport__ImportsAssignment_0 ) ) ( ( rule__TopLevelImport__ImportsAssignment_0 )* ) )
            // InternalBSharp.g:2234:2: ( ( rule__TopLevelImport__ImportsAssignment_0 ) ) ( ( rule__TopLevelImport__ImportsAssignment_0 )* )
            {
            // InternalBSharp.g:2234:2: ( ( rule__TopLevelImport__ImportsAssignment_0 ) )
            // InternalBSharp.g:2235:3: ( rule__TopLevelImport__ImportsAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTopLevelImportAccess().getImportsAssignment_0()); 
            }
            // InternalBSharp.g:2236:3: ( rule__TopLevelImport__ImportsAssignment_0 )
            // InternalBSharp.g:2236:4: rule__TopLevelImport__ImportsAssignment_0
            {
            pushFollow(FOLLOW_8);
            rule__TopLevelImport__ImportsAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTopLevelImportAccess().getImportsAssignment_0()); 
            }

            }

            // InternalBSharp.g:2239:2: ( ( rule__TopLevelImport__ImportsAssignment_0 )* )
            // InternalBSharp.g:2240:3: ( rule__TopLevelImport__ImportsAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTopLevelImportAccess().getImportsAssignment_0()); 
            }
            // InternalBSharp.g:2241:3: ( rule__TopLevelImport__ImportsAssignment_0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=39 && LA22_0<=40)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalBSharp.g:2241:4: rule__TopLevelImport__ImportsAssignment_0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__TopLevelImport__ImportsAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTopLevelImportAccess().getImportsAssignment_0()); 
            }

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
    // InternalBSharp.g:2250:1: rule__TopLevelImport__Group__1 : rule__TopLevelImport__Group__1__Impl ;
    public final void rule__TopLevelImport__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2254:1: ( rule__TopLevelImport__Group__1__Impl )
            // InternalBSharp.g:2255:2: rule__TopLevelImport__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TopLevelImport__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:2261:1: rule__TopLevelImport__Group__1__Impl : ( ( ( rule__TopLevelImport__BodyElementsAssignment_1 ) ) ( ( rule__TopLevelImport__BodyElementsAssignment_1 )* ) ) ;
    public final void rule__TopLevelImport__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2265:1: ( ( ( ( rule__TopLevelImport__BodyElementsAssignment_1 ) ) ( ( rule__TopLevelImport__BodyElementsAssignment_1 )* ) ) )
            // InternalBSharp.g:2266:1: ( ( ( rule__TopLevelImport__BodyElementsAssignment_1 ) ) ( ( rule__TopLevelImport__BodyElementsAssignment_1 )* ) )
            {
            // InternalBSharp.g:2266:1: ( ( ( rule__TopLevelImport__BodyElementsAssignment_1 ) ) ( ( rule__TopLevelImport__BodyElementsAssignment_1 )* ) )
            // InternalBSharp.g:2267:2: ( ( rule__TopLevelImport__BodyElementsAssignment_1 ) ) ( ( rule__TopLevelImport__BodyElementsAssignment_1 )* )
            {
            // InternalBSharp.g:2267:2: ( ( rule__TopLevelImport__BodyElementsAssignment_1 ) )
            // InternalBSharp.g:2268:3: ( rule__TopLevelImport__BodyElementsAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTopLevelImportAccess().getBodyElementsAssignment_1()); 
            }
            // InternalBSharp.g:2269:3: ( rule__TopLevelImport__BodyElementsAssignment_1 )
            // InternalBSharp.g:2269:4: rule__TopLevelImport__BodyElementsAssignment_1
            {
            pushFollow(FOLLOW_7);
            rule__TopLevelImport__BodyElementsAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTopLevelImportAccess().getBodyElementsAssignment_1()); 
            }

            }

            // InternalBSharp.g:2272:2: ( ( rule__TopLevelImport__BodyElementsAssignment_1 )* )
            // InternalBSharp.g:2273:3: ( rule__TopLevelImport__BodyElementsAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTopLevelImportAccess().getBodyElementsAssignment_1()); 
            }
            // InternalBSharp.g:2274:3: ( rule__TopLevelImport__BodyElementsAssignment_1 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==41||LA23_0==52||LA23_0==54) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalBSharp.g:2274:4: rule__TopLevelImport__BodyElementsAssignment_1
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__TopLevelImport__BodyElementsAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTopLevelImportAccess().getBodyElementsAssignment_1()); 
            }

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
    // InternalBSharp.g:2284:1: rule__GlobalImport__Group__0 : rule__GlobalImport__Group__0__Impl rule__GlobalImport__Group__1 ;
    public final void rule__GlobalImport__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2288:1: ( rule__GlobalImport__Group__0__Impl rule__GlobalImport__Group__1 )
            // InternalBSharp.g:2289:2: rule__GlobalImport__Group__0__Impl rule__GlobalImport__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__GlobalImport__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GlobalImport__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:2296:1: rule__GlobalImport__Group__0__Impl : ( 'From' ) ;
    public final void rule__GlobalImport__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2300:1: ( ( 'From' ) )
            // InternalBSharp.g:2301:1: ( 'From' )
            {
            // InternalBSharp.g:2301:1: ( 'From' )
            // InternalBSharp.g:2302:2: 'From'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGlobalImportAccess().getFromKeyword_0()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGlobalImportAccess().getFromKeyword_0()); 
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
    // $ANTLR end "rule__GlobalImport__Group__0__Impl"


    // $ANTLR start "rule__GlobalImport__Group__1"
    // InternalBSharp.g:2311:1: rule__GlobalImport__Group__1 : rule__GlobalImport__Group__1__Impl rule__GlobalImport__Group__2 ;
    public final void rule__GlobalImport__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2315:1: ( rule__GlobalImport__Group__1__Impl rule__GlobalImport__Group__2 )
            // InternalBSharp.g:2316:2: rule__GlobalImport__Group__1__Impl rule__GlobalImport__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__GlobalImport__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GlobalImport__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:2323:1: rule__GlobalImport__Group__1__Impl : ( ( rule__GlobalImport__ProjectAssignment_1 ) ) ;
    public final void rule__GlobalImport__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2327:1: ( ( ( rule__GlobalImport__ProjectAssignment_1 ) ) )
            // InternalBSharp.g:2328:1: ( ( rule__GlobalImport__ProjectAssignment_1 ) )
            {
            // InternalBSharp.g:2328:1: ( ( rule__GlobalImport__ProjectAssignment_1 ) )
            // InternalBSharp.g:2329:2: ( rule__GlobalImport__ProjectAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGlobalImportAccess().getProjectAssignment_1()); 
            }
            // InternalBSharp.g:2330:2: ( rule__GlobalImport__ProjectAssignment_1 )
            // InternalBSharp.g:2330:3: rule__GlobalImport__ProjectAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__GlobalImport__ProjectAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGlobalImportAccess().getProjectAssignment_1()); 
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
    // $ANTLR end "rule__GlobalImport__Group__1__Impl"


    // $ANTLR start "rule__GlobalImport__Group__2"
    // InternalBSharp.g:2338:1: rule__GlobalImport__Group__2 : rule__GlobalImport__Group__2__Impl rule__GlobalImport__Group__3 ;
    public final void rule__GlobalImport__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2342:1: ( rule__GlobalImport__Group__2__Impl rule__GlobalImport__Group__3 )
            // InternalBSharp.g:2343:2: rule__GlobalImport__Group__2__Impl rule__GlobalImport__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__GlobalImport__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GlobalImport__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:2350:1: rule__GlobalImport__Group__2__Impl : ( 'Import' ) ;
    public final void rule__GlobalImport__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2354:1: ( ( 'Import' ) )
            // InternalBSharp.g:2355:1: ( 'Import' )
            {
            // InternalBSharp.g:2355:1: ( 'Import' )
            // InternalBSharp.g:2356:2: 'Import'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGlobalImportAccess().getImportKeyword_2()); 
            }
            match(input,40,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGlobalImportAccess().getImportKeyword_2()); 
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
    // $ANTLR end "rule__GlobalImport__Group__2__Impl"


    // $ANTLR start "rule__GlobalImport__Group__3"
    // InternalBSharp.g:2365:1: rule__GlobalImport__Group__3 : rule__GlobalImport__Group__3__Impl ;
    public final void rule__GlobalImport__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2369:1: ( rule__GlobalImport__Group__3__Impl )
            // InternalBSharp.g:2370:2: rule__GlobalImport__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GlobalImport__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:2376:1: rule__GlobalImport__Group__3__Impl : ( ( ( rule__GlobalImport__FileImportsAssignment_3 ) ) ( ( rule__GlobalImport__FileImportsAssignment_3 )* ) ) ;
    public final void rule__GlobalImport__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2380:1: ( ( ( ( rule__GlobalImport__FileImportsAssignment_3 ) ) ( ( rule__GlobalImport__FileImportsAssignment_3 )* ) ) )
            // InternalBSharp.g:2381:1: ( ( ( rule__GlobalImport__FileImportsAssignment_3 ) ) ( ( rule__GlobalImport__FileImportsAssignment_3 )* ) )
            {
            // InternalBSharp.g:2381:1: ( ( ( rule__GlobalImport__FileImportsAssignment_3 ) ) ( ( rule__GlobalImport__FileImportsAssignment_3 )* ) )
            // InternalBSharp.g:2382:2: ( ( rule__GlobalImport__FileImportsAssignment_3 ) ) ( ( rule__GlobalImport__FileImportsAssignment_3 )* )
            {
            // InternalBSharp.g:2382:2: ( ( rule__GlobalImport__FileImportsAssignment_3 ) )
            // InternalBSharp.g:2383:3: ( rule__GlobalImport__FileImportsAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGlobalImportAccess().getFileImportsAssignment_3()); 
            }
            // InternalBSharp.g:2384:3: ( rule__GlobalImport__FileImportsAssignment_3 )
            // InternalBSharp.g:2384:4: rule__GlobalImport__FileImportsAssignment_3
            {
            pushFollow(FOLLOW_13);
            rule__GlobalImport__FileImportsAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGlobalImportAccess().getFileImportsAssignment_3()); 
            }

            }

            // InternalBSharp.g:2387:2: ( ( rule__GlobalImport__FileImportsAssignment_3 )* )
            // InternalBSharp.g:2388:3: ( rule__GlobalImport__FileImportsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGlobalImportAccess().getFileImportsAssignment_3()); 
            }
            // InternalBSharp.g:2389:3: ( rule__GlobalImport__FileImportsAssignment_3 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_ID) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalBSharp.g:2389:4: rule__GlobalImport__FileImportsAssignment_3
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__GlobalImport__FileImportsAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGlobalImportAccess().getFileImportsAssignment_3()); 
            }

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
    // InternalBSharp.g:2399:1: rule__FileImport__Group__0 : rule__FileImport__Group__0__Impl rule__FileImport__Group__1 ;
    public final void rule__FileImport__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2403:1: ( rule__FileImport__Group__0__Impl rule__FileImport__Group__1 )
            // InternalBSharp.g:2404:2: rule__FileImport__Group__0__Impl rule__FileImport__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__FileImport__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FileImport__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:2411:1: rule__FileImport__Group__0__Impl : ( ( rule__FileImport__FileReferenceAssignment_0 ) ) ;
    public final void rule__FileImport__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2415:1: ( ( ( rule__FileImport__FileReferenceAssignment_0 ) ) )
            // InternalBSharp.g:2416:1: ( ( rule__FileImport__FileReferenceAssignment_0 ) )
            {
            // InternalBSharp.g:2416:1: ( ( rule__FileImport__FileReferenceAssignment_0 ) )
            // InternalBSharp.g:2417:2: ( rule__FileImport__FileReferenceAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFileImportAccess().getFileReferenceAssignment_0()); 
            }
            // InternalBSharp.g:2418:2: ( rule__FileImport__FileReferenceAssignment_0 )
            // InternalBSharp.g:2418:3: rule__FileImport__FileReferenceAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__FileImport__FileReferenceAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFileImportAccess().getFileReferenceAssignment_0()); 
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
    // $ANTLR end "rule__FileImport__Group__0__Impl"


    // $ANTLR start "rule__FileImport__Group__1"
    // InternalBSharp.g:2426:1: rule__FileImport__Group__1 : rule__FileImport__Group__1__Impl ;
    public final void rule__FileImport__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2430:1: ( rule__FileImport__Group__1__Impl )
            // InternalBSharp.g:2431:2: rule__FileImport__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FileImport__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:2437:1: rule__FileImport__Group__1__Impl : ( ( rule__FileImport__Group_1__0 )? ) ;
    public final void rule__FileImport__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2441:1: ( ( ( rule__FileImport__Group_1__0 )? ) )
            // InternalBSharp.g:2442:1: ( ( rule__FileImport__Group_1__0 )? )
            {
            // InternalBSharp.g:2442:1: ( ( rule__FileImport__Group_1__0 )? )
            // InternalBSharp.g:2443:2: ( rule__FileImport__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFileImportAccess().getGroup_1()); 
            }
            // InternalBSharp.g:2444:2: ( rule__FileImport__Group_1__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==38) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalBSharp.g:2444:3: rule__FileImport__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FileImport__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFileImportAccess().getGroup_1()); 
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
    // $ANTLR end "rule__FileImport__Group__1__Impl"


    // $ANTLR start "rule__FileImport__Group_1__0"
    // InternalBSharp.g:2453:1: rule__FileImport__Group_1__0 : rule__FileImport__Group_1__0__Impl rule__FileImport__Group_1__1 ;
    public final void rule__FileImport__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2457:1: ( rule__FileImport__Group_1__0__Impl rule__FileImport__Group_1__1 )
            // InternalBSharp.g:2458:2: rule__FileImport__Group_1__0__Impl rule__FileImport__Group_1__1
            {
            pushFollow(FOLLOW_14);
            rule__FileImport__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FileImport__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:2465:1: rule__FileImport__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FileImport__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2469:1: ( ( '.' ) )
            // InternalBSharp.g:2470:1: ( '.' )
            {
            // InternalBSharp.g:2470:1: ( '.' )
            // InternalBSharp.g:2471:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFileImportAccess().getFullStopKeyword_1_0()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFileImportAccess().getFullStopKeyword_1_0()); 
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
    // $ANTLR end "rule__FileImport__Group_1__0__Impl"


    // $ANTLR start "rule__FileImport__Group_1__1"
    // InternalBSharp.g:2480:1: rule__FileImport__Group_1__1 : rule__FileImport__Group_1__1__Impl ;
    public final void rule__FileImport__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2484:1: ( rule__FileImport__Group_1__1__Impl )
            // InternalBSharp.g:2485:2: rule__FileImport__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FileImport__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:2491:1: rule__FileImport__Group_1__1__Impl : ( ( rule__FileImport__Alternatives_1_1 ) ) ;
    public final void rule__FileImport__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2495:1: ( ( ( rule__FileImport__Alternatives_1_1 ) ) )
            // InternalBSharp.g:2496:1: ( ( rule__FileImport__Alternatives_1_1 ) )
            {
            // InternalBSharp.g:2496:1: ( ( rule__FileImport__Alternatives_1_1 ) )
            // InternalBSharp.g:2497:2: ( rule__FileImport__Alternatives_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFileImportAccess().getAlternatives_1_1()); 
            }
            // InternalBSharp.g:2498:2: ( rule__FileImport__Alternatives_1_1 )
            // InternalBSharp.g:2498:3: rule__FileImport__Alternatives_1_1
            {
            pushFollow(FOLLOW_2);
            rule__FileImport__Alternatives_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFileImportAccess().getAlternatives_1_1()); 
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
    // $ANTLR end "rule__FileImport__Group_1__1__Impl"


    // $ANTLR start "rule__LocalImport__Group__0"
    // InternalBSharp.g:2507:1: rule__LocalImport__Group__0 : rule__LocalImport__Group__0__Impl rule__LocalImport__Group__1 ;
    public final void rule__LocalImport__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2511:1: ( rule__LocalImport__Group__0__Impl rule__LocalImport__Group__1 )
            // InternalBSharp.g:2512:2: rule__LocalImport__Group__0__Impl rule__LocalImport__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__LocalImport__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LocalImport__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:2519:1: rule__LocalImport__Group__0__Impl : ( 'Import' ) ;
    public final void rule__LocalImport__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2523:1: ( ( 'Import' ) )
            // InternalBSharp.g:2524:1: ( 'Import' )
            {
            // InternalBSharp.g:2524:1: ( 'Import' )
            // InternalBSharp.g:2525:2: 'Import'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalImportAccess().getImportKeyword_0()); 
            }
            match(input,40,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalImportAccess().getImportKeyword_0()); 
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
    // $ANTLR end "rule__LocalImport__Group__0__Impl"


    // $ANTLR start "rule__LocalImport__Group__1"
    // InternalBSharp.g:2534:1: rule__LocalImport__Group__1 : rule__LocalImport__Group__1__Impl ;
    public final void rule__LocalImport__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2538:1: ( rule__LocalImport__Group__1__Impl )
            // InternalBSharp.g:2539:2: rule__LocalImport__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LocalImport__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:2545:1: rule__LocalImport__Group__1__Impl : ( ( ( rule__LocalImport__FileImportsAssignment_1 ) ) ( ( rule__LocalImport__FileImportsAssignment_1 )* ) ) ;
    public final void rule__LocalImport__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2549:1: ( ( ( ( rule__LocalImport__FileImportsAssignment_1 ) ) ( ( rule__LocalImport__FileImportsAssignment_1 )* ) ) )
            // InternalBSharp.g:2550:1: ( ( ( rule__LocalImport__FileImportsAssignment_1 ) ) ( ( rule__LocalImport__FileImportsAssignment_1 )* ) )
            {
            // InternalBSharp.g:2550:1: ( ( ( rule__LocalImport__FileImportsAssignment_1 ) ) ( ( rule__LocalImport__FileImportsAssignment_1 )* ) )
            // InternalBSharp.g:2551:2: ( ( rule__LocalImport__FileImportsAssignment_1 ) ) ( ( rule__LocalImport__FileImportsAssignment_1 )* )
            {
            // InternalBSharp.g:2551:2: ( ( rule__LocalImport__FileImportsAssignment_1 ) )
            // InternalBSharp.g:2552:3: ( rule__LocalImport__FileImportsAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalImportAccess().getFileImportsAssignment_1()); 
            }
            // InternalBSharp.g:2553:3: ( rule__LocalImport__FileImportsAssignment_1 )
            // InternalBSharp.g:2553:4: rule__LocalImport__FileImportsAssignment_1
            {
            pushFollow(FOLLOW_13);
            rule__LocalImport__FileImportsAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalImportAccess().getFileImportsAssignment_1()); 
            }

            }

            // InternalBSharp.g:2556:2: ( ( rule__LocalImport__FileImportsAssignment_1 )* )
            // InternalBSharp.g:2557:3: ( rule__LocalImport__FileImportsAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalImportAccess().getFileImportsAssignment_1()); 
            }
            // InternalBSharp.g:2558:3: ( rule__LocalImport__FileImportsAssignment_1 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_ID) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalBSharp.g:2558:4: rule__LocalImport__FileImportsAssignment_1
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__LocalImport__FileImportsAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalImportAccess().getFileImportsAssignment_1()); 
            }

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
    // InternalBSharp.g:2568:1: rule__Class__Group__0 : rule__Class__Group__0__Impl rule__Class__Group__1 ;
    public final void rule__Class__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2572:1: ( rule__Class__Group__0__Impl rule__Class__Group__1 )
            // InternalBSharp.g:2573:2: rule__Class__Group__0__Impl rule__Class__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Class__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Class__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:2580:1: rule__Class__Group__0__Impl : ( 'Class' ) ;
    public final void rule__Class__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2584:1: ( ( 'Class' ) )
            // InternalBSharp.g:2585:1: ( 'Class' )
            {
            // InternalBSharp.g:2585:1: ( 'Class' )
            // InternalBSharp.g:2586:2: 'Class'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getClassKeyword_0()); 
            }
            match(input,41,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getClassKeyword_0()); 
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
    // $ANTLR end "rule__Class__Group__0__Impl"


    // $ANTLR start "rule__Class__Group__1"
    // InternalBSharp.g:2595:1: rule__Class__Group__1 : rule__Class__Group__1__Impl rule__Class__Group__2 ;
    public final void rule__Class__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2599:1: ( rule__Class__Group__1__Impl rule__Class__Group__2 )
            // InternalBSharp.g:2600:2: rule__Class__Group__1__Impl rule__Class__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__Class__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Class__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:2607:1: rule__Class__Group__1__Impl : ( ( rule__Class__NameAssignment_1 ) ) ;
    public final void rule__Class__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2611:1: ( ( ( rule__Class__NameAssignment_1 ) ) )
            // InternalBSharp.g:2612:1: ( ( rule__Class__NameAssignment_1 ) )
            {
            // InternalBSharp.g:2612:1: ( ( rule__Class__NameAssignment_1 ) )
            // InternalBSharp.g:2613:2: ( rule__Class__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getNameAssignment_1()); 
            }
            // InternalBSharp.g:2614:2: ( rule__Class__NameAssignment_1 )
            // InternalBSharp.g:2614:3: rule__Class__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Class__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__Class__Group__1__Impl"


    // $ANTLR start "rule__Class__Group__2"
    // InternalBSharp.g:2622:1: rule__Class__Group__2 : rule__Class__Group__2__Impl rule__Class__Group__3 ;
    public final void rule__Class__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2626:1: ( rule__Class__Group__2__Impl rule__Class__Group__3 )
            // InternalBSharp.g:2627:2: rule__Class__Group__2__Impl rule__Class__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__Class__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Class__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:2634:1: rule__Class__Group__2__Impl : ( ( rule__Class__RawContextAssignment_2 )? ) ;
    public final void rule__Class__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2638:1: ( ( ( rule__Class__RawContextAssignment_2 )? ) )
            // InternalBSharp.g:2639:1: ( ( rule__Class__RawContextAssignment_2 )? )
            {
            // InternalBSharp.g:2639:1: ( ( rule__Class__RawContextAssignment_2 )? )
            // InternalBSharp.g:2640:2: ( rule__Class__RawContextAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getRawContextAssignment_2()); 
            }
            // InternalBSharp.g:2641:2: ( rule__Class__RawContextAssignment_2 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==47) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalBSharp.g:2641:3: rule__Class__RawContextAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Class__RawContextAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getRawContextAssignment_2()); 
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
    // $ANTLR end "rule__Class__Group__2__Impl"


    // $ANTLR start "rule__Class__Group__3"
    // InternalBSharp.g:2649:1: rule__Class__Group__3 : rule__Class__Group__3__Impl rule__Class__Group__4 ;
    public final void rule__Class__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2653:1: ( rule__Class__Group__3__Impl rule__Class__Group__4 )
            // InternalBSharp.g:2654:2: rule__Class__Group__3__Impl rule__Class__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__Class__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Class__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:2661:1: rule__Class__Group__3__Impl : ( ( rule__Class__Group_3__0 ) ) ;
    public final void rule__Class__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2665:1: ( ( ( rule__Class__Group_3__0 ) ) )
            // InternalBSharp.g:2666:1: ( ( rule__Class__Group_3__0 ) )
            {
            // InternalBSharp.g:2666:1: ( ( rule__Class__Group_3__0 ) )
            // InternalBSharp.g:2667:2: ( rule__Class__Group_3__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getGroup_3()); 
            }
            // InternalBSharp.g:2668:2: ( rule__Class__Group_3__0 )
            // InternalBSharp.g:2668:3: rule__Class__Group_3__0
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group_3__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getGroup_3()); 
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
    // $ANTLR end "rule__Class__Group__3__Impl"


    // $ANTLR start "rule__Class__Group__4"
    // InternalBSharp.g:2676:1: rule__Class__Group__4 : rule__Class__Group__4__Impl rule__Class__Group__5 ;
    public final void rule__Class__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2680:1: ( rule__Class__Group__4__Impl rule__Class__Group__5 )
            // InternalBSharp.g:2681:2: rule__Class__Group__4__Impl rule__Class__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__Class__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Class__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:2688:1: rule__Class__Group__4__Impl : ( ( rule__Class__SupertypesAssignment_4 )? ) ;
    public final void rule__Class__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2692:1: ( ( ( rule__Class__SupertypesAssignment_4 )? ) )
            // InternalBSharp.g:2693:1: ( ( rule__Class__SupertypesAssignment_4 )? )
            {
            // InternalBSharp.g:2693:1: ( ( rule__Class__SupertypesAssignment_4 )? )
            // InternalBSharp.g:2694:2: ( rule__Class__SupertypesAssignment_4 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getSupertypesAssignment_4()); 
            }
            // InternalBSharp.g:2695:2: ( rule__Class__SupertypesAssignment_4 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==37) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalBSharp.g:2695:3: rule__Class__SupertypesAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Class__SupertypesAssignment_4();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getSupertypesAssignment_4()); 
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
    // $ANTLR end "rule__Class__Group__4__Impl"


    // $ANTLR start "rule__Class__Group__5"
    // InternalBSharp.g:2703:1: rule__Class__Group__5 : rule__Class__Group__5__Impl rule__Class__Group__6 ;
    public final void rule__Class__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2707:1: ( rule__Class__Group__5__Impl rule__Class__Group__6 )
            // InternalBSharp.g:2708:2: rule__Class__Group__5__Impl rule__Class__Group__6
            {
            pushFollow(FOLLOW_16);
            rule__Class__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Class__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:2715:1: rule__Class__Group__5__Impl : ( ( rule__Class__Group_5__0 )? ) ;
    public final void rule__Class__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2719:1: ( ( ( rule__Class__Group_5__0 )? ) )
            // InternalBSharp.g:2720:1: ( ( rule__Class__Group_5__0 )? )
            {
            // InternalBSharp.g:2720:1: ( ( rule__Class__Group_5__0 )? )
            // InternalBSharp.g:2721:2: ( rule__Class__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getGroup_5()); 
            }
            // InternalBSharp.g:2722:2: ( rule__Class__Group_5__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==45) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalBSharp.g:2722:3: rule__Class__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Class__Group_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getGroup_5()); 
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
    // $ANTLR end "rule__Class__Group__5__Impl"


    // $ANTLR start "rule__Class__Group__6"
    // InternalBSharp.g:2730:1: rule__Class__Group__6 : rule__Class__Group__6__Impl rule__Class__Group__7 ;
    public final void rule__Class__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2734:1: ( rule__Class__Group__6__Impl rule__Class__Group__7 )
            // InternalBSharp.g:2735:2: rule__Class__Group__6__Impl rule__Class__Group__7
            {
            pushFollow(FOLLOW_16);
            rule__Class__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Class__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:2742:1: rule__Class__Group__6__Impl : ( ( rule__Class__WhereAssignment_6 )? ) ;
    public final void rule__Class__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2746:1: ( ( ( rule__Class__WhereAssignment_6 )? ) )
            // InternalBSharp.g:2747:1: ( ( rule__Class__WhereAssignment_6 )? )
            {
            // InternalBSharp.g:2747:1: ( ( rule__Class__WhereAssignment_6 )? )
            // InternalBSharp.g:2748:2: ( rule__Class__WhereAssignment_6 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getWhereAssignment_6()); 
            }
            // InternalBSharp.g:2749:2: ( rule__Class__WhereAssignment_6 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==51) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalBSharp.g:2749:3: rule__Class__WhereAssignment_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__Class__WhereAssignment_6();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getWhereAssignment_6()); 
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
    // $ANTLR end "rule__Class__Group__6__Impl"


    // $ANTLR start "rule__Class__Group__7"
    // InternalBSharp.g:2757:1: rule__Class__Group__7 : rule__Class__Group__7__Impl rule__Class__Group__8 ;
    public final void rule__Class__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2761:1: ( rule__Class__Group__7__Impl rule__Class__Group__8 )
            // InternalBSharp.g:2762:2: rule__Class__Group__7__Impl rule__Class__Group__8
            {
            pushFollow(FOLLOW_16);
            rule__Class__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Class__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:2769:1: rule__Class__Group__7__Impl : ( ( ';' )? ) ;
    public final void rule__Class__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2773:1: ( ( ( ';' )? ) )
            // InternalBSharp.g:2774:1: ( ( ';' )? )
            {
            // InternalBSharp.g:2774:1: ( ( ';' )? )
            // InternalBSharp.g:2775:2: ( ';' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getSemicolonKeyword_7()); 
            }
            // InternalBSharp.g:2776:2: ( ';' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==42) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalBSharp.g:2776:3: ';'
                    {
                    match(input,42,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getSemicolonKeyword_7()); 
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
    // $ANTLR end "rule__Class__Group__7__Impl"


    // $ANTLR start "rule__Class__Group__8"
    // InternalBSharp.g:2784:1: rule__Class__Group__8 : rule__Class__Group__8__Impl ;
    public final void rule__Class__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2788:1: ( rule__Class__Group__8__Impl )
            // InternalBSharp.g:2789:2: rule__Class__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:2795:1: rule__Class__Group__8__Impl : ( ( rule__Class__BlockAssignment_8 ) ) ;
    public final void rule__Class__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2799:1: ( ( ( rule__Class__BlockAssignment_8 ) ) )
            // InternalBSharp.g:2800:1: ( ( rule__Class__BlockAssignment_8 ) )
            {
            // InternalBSharp.g:2800:1: ( ( rule__Class__BlockAssignment_8 ) )
            // InternalBSharp.g:2801:2: ( rule__Class__BlockAssignment_8 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getBlockAssignment_8()); 
            }
            // InternalBSharp.g:2802:2: ( rule__Class__BlockAssignment_8 )
            // InternalBSharp.g:2802:3: rule__Class__BlockAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Class__BlockAssignment_8();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getBlockAssignment_8()); 
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
    // $ANTLR end "rule__Class__Group__8__Impl"


    // $ANTLR start "rule__Class__Group_3__0"
    // InternalBSharp.g:2811:1: rule__Class__Group_3__0 : rule__Class__Group_3__0__Impl rule__Class__Group_3__1 ;
    public final void rule__Class__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2815:1: ( rule__Class__Group_3__0__Impl rule__Class__Group_3__1 )
            // InternalBSharp.g:2816:2: rule__Class__Group_3__0__Impl rule__Class__Group_3__1
            {
            pushFollow(FOLLOW_3);
            rule__Class__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Class__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:2823:1: rule__Class__Group_3__0__Impl : ( '[' ) ;
    public final void rule__Class__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2827:1: ( ( '[' ) )
            // InternalBSharp.g:2828:1: ( '[' )
            {
            // InternalBSharp.g:2828:1: ( '[' )
            // InternalBSharp.g:2829:2: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getLeftSquareBracketKeyword_3_0()); 
            }
            match(input,43,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getLeftSquareBracketKeyword_3_0()); 
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
    // $ANTLR end "rule__Class__Group_3__0__Impl"


    // $ANTLR start "rule__Class__Group_3__1"
    // InternalBSharp.g:2838:1: rule__Class__Group_3__1 : rule__Class__Group_3__1__Impl rule__Class__Group_3__2 ;
    public final void rule__Class__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2842:1: ( rule__Class__Group_3__1__Impl rule__Class__Group_3__2 )
            // InternalBSharp.g:2843:2: rule__Class__Group_3__1__Impl rule__Class__Group_3__2
            {
            pushFollow(FOLLOW_17);
            rule__Class__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Class__Group_3__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:2850:1: rule__Class__Group_3__1__Impl : ( ( rule__Class__InstNameAssignment_3_1 ) ) ;
    public final void rule__Class__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2854:1: ( ( ( rule__Class__InstNameAssignment_3_1 ) ) )
            // InternalBSharp.g:2855:1: ( ( rule__Class__InstNameAssignment_3_1 ) )
            {
            // InternalBSharp.g:2855:1: ( ( rule__Class__InstNameAssignment_3_1 ) )
            // InternalBSharp.g:2856:2: ( rule__Class__InstNameAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getInstNameAssignment_3_1()); 
            }
            // InternalBSharp.g:2857:2: ( rule__Class__InstNameAssignment_3_1 )
            // InternalBSharp.g:2857:3: rule__Class__InstNameAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Class__InstNameAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getInstNameAssignment_3_1()); 
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
    // $ANTLR end "rule__Class__Group_3__1__Impl"


    // $ANTLR start "rule__Class__Group_3__2"
    // InternalBSharp.g:2865:1: rule__Class__Group_3__2 : rule__Class__Group_3__2__Impl ;
    public final void rule__Class__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2869:1: ( rule__Class__Group_3__2__Impl )
            // InternalBSharp.g:2870:2: rule__Class__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:2876:1: rule__Class__Group_3__2__Impl : ( ']' ) ;
    public final void rule__Class__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2880:1: ( ( ']' ) )
            // InternalBSharp.g:2881:1: ( ']' )
            {
            // InternalBSharp.g:2881:1: ( ']' )
            // InternalBSharp.g:2882:2: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getRightSquareBracketKeyword_3_2()); 
            }
            match(input,44,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getRightSquareBracketKeyword_3_2()); 
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
    // $ANTLR end "rule__Class__Group_3__2__Impl"


    // $ANTLR start "rule__Class__Group_5__0"
    // InternalBSharp.g:2892:1: rule__Class__Group_5__0 : rule__Class__Group_5__0__Impl rule__Class__Group_5__1 ;
    public final void rule__Class__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2896:1: ( rule__Class__Group_5__0__Impl rule__Class__Group_5__1 )
            // InternalBSharp.g:2897:2: rule__Class__Group_5__0__Impl rule__Class__Group_5__1
            {
            pushFollow(FOLLOW_3);
            rule__Class__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Class__Group_5__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:2904:1: rule__Class__Group_5__0__Impl : ( '(' ) ;
    public final void rule__Class__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2908:1: ( ( '(' ) )
            // InternalBSharp.g:2909:1: ( '(' )
            {
            // InternalBSharp.g:2909:1: ( '(' )
            // InternalBSharp.g:2910:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getLeftParenthesisKeyword_5_0()); 
            }
            match(input,45,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getLeftParenthesisKeyword_5_0()); 
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
    // $ANTLR end "rule__Class__Group_5__0__Impl"


    // $ANTLR start "rule__Class__Group_5__1"
    // InternalBSharp.g:2919:1: rule__Class__Group_5__1 : rule__Class__Group_5__1__Impl rule__Class__Group_5__2 ;
    public final void rule__Class__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2923:1: ( rule__Class__Group_5__1__Impl rule__Class__Group_5__2 )
            // InternalBSharp.g:2924:2: rule__Class__Group_5__1__Impl rule__Class__Group_5__2
            {
            pushFollow(FOLLOW_18);
            rule__Class__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Class__Group_5__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:2931:1: rule__Class__Group_5__1__Impl : ( ( rule__Class__VarListAssignment_5_1 ) ) ;
    public final void rule__Class__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2935:1: ( ( ( rule__Class__VarListAssignment_5_1 ) ) )
            // InternalBSharp.g:2936:1: ( ( rule__Class__VarListAssignment_5_1 ) )
            {
            // InternalBSharp.g:2936:1: ( ( rule__Class__VarListAssignment_5_1 ) )
            // InternalBSharp.g:2937:2: ( rule__Class__VarListAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getVarListAssignment_5_1()); 
            }
            // InternalBSharp.g:2938:2: ( rule__Class__VarListAssignment_5_1 )
            // InternalBSharp.g:2938:3: rule__Class__VarListAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Class__VarListAssignment_5_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getVarListAssignment_5_1()); 
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
    // $ANTLR end "rule__Class__Group_5__1__Impl"


    // $ANTLR start "rule__Class__Group_5__2"
    // InternalBSharp.g:2946:1: rule__Class__Group_5__2 : rule__Class__Group_5__2__Impl ;
    public final void rule__Class__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2950:1: ( rule__Class__Group_5__2__Impl )
            // InternalBSharp.g:2951:2: rule__Class__Group_5__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group_5__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:2957:1: rule__Class__Group_5__2__Impl : ( ')' ) ;
    public final void rule__Class__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2961:1: ( ( ')' ) )
            // InternalBSharp.g:2962:1: ( ')' )
            {
            // InternalBSharp.g:2962:1: ( ')' )
            // InternalBSharp.g:2963:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getRightParenthesisKeyword_5_2()); 
            }
            match(input,46,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getRightParenthesisKeyword_5_2()); 
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
    // $ANTLR end "rule__Class__Group_5__2__Impl"


    // $ANTLR start "rule__PolyContext__Group__0"
    // InternalBSharp.g:2973:1: rule__PolyContext__Group__0 : rule__PolyContext__Group__0__Impl rule__PolyContext__Group__1 ;
    public final void rule__PolyContext__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2977:1: ( rule__PolyContext__Group__0__Impl rule__PolyContext__Group__1 )
            // InternalBSharp.g:2978:2: rule__PolyContext__Group__0__Impl rule__PolyContext__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__PolyContext__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PolyContext__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:2985:1: rule__PolyContext__Group__0__Impl : ( '<' ) ;
    public final void rule__PolyContext__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2989:1: ( ( '<' ) )
            // InternalBSharp.g:2990:1: ( '<' )
            {
            // InternalBSharp.g:2990:1: ( '<' )
            // InternalBSharp.g:2991:2: '<'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPolyContextAccess().getLessThanSignKeyword_0()); 
            }
            match(input,47,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPolyContextAccess().getLessThanSignKeyword_0()); 
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
    // $ANTLR end "rule__PolyContext__Group__0__Impl"


    // $ANTLR start "rule__PolyContext__Group__1"
    // InternalBSharp.g:3000:1: rule__PolyContext__Group__1 : rule__PolyContext__Group__1__Impl rule__PolyContext__Group__2 ;
    public final void rule__PolyContext__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3004:1: ( rule__PolyContext__Group__1__Impl rule__PolyContext__Group__2 )
            // InternalBSharp.g:3005:2: rule__PolyContext__Group__1__Impl rule__PolyContext__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__PolyContext__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PolyContext__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:3012:1: rule__PolyContext__Group__1__Impl : ( ( ( rule__PolyContext__PolyTypesAssignment_1 ) ) ( ( rule__PolyContext__PolyTypesAssignment_1 )* ) ) ;
    public final void rule__PolyContext__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3016:1: ( ( ( ( rule__PolyContext__PolyTypesAssignment_1 ) ) ( ( rule__PolyContext__PolyTypesAssignment_1 )* ) ) )
            // InternalBSharp.g:3017:1: ( ( ( rule__PolyContext__PolyTypesAssignment_1 ) ) ( ( rule__PolyContext__PolyTypesAssignment_1 )* ) )
            {
            // InternalBSharp.g:3017:1: ( ( ( rule__PolyContext__PolyTypesAssignment_1 ) ) ( ( rule__PolyContext__PolyTypesAssignment_1 )* ) )
            // InternalBSharp.g:3018:2: ( ( rule__PolyContext__PolyTypesAssignment_1 ) ) ( ( rule__PolyContext__PolyTypesAssignment_1 )* )
            {
            // InternalBSharp.g:3018:2: ( ( rule__PolyContext__PolyTypesAssignment_1 ) )
            // InternalBSharp.g:3019:3: ( rule__PolyContext__PolyTypesAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPolyContextAccess().getPolyTypesAssignment_1()); 
            }
            // InternalBSharp.g:3020:3: ( rule__PolyContext__PolyTypesAssignment_1 )
            // InternalBSharp.g:3020:4: rule__PolyContext__PolyTypesAssignment_1
            {
            pushFollow(FOLLOW_13);
            rule__PolyContext__PolyTypesAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPolyContextAccess().getPolyTypesAssignment_1()); 
            }

            }

            // InternalBSharp.g:3023:2: ( ( rule__PolyContext__PolyTypesAssignment_1 )* )
            // InternalBSharp.g:3024:3: ( rule__PolyContext__PolyTypesAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPolyContextAccess().getPolyTypesAssignment_1()); 
            }
            // InternalBSharp.g:3025:3: ( rule__PolyContext__PolyTypesAssignment_1 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==RULE_ID) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalBSharp.g:3025:4: rule__PolyContext__PolyTypesAssignment_1
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__PolyContext__PolyTypesAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPolyContextAccess().getPolyTypesAssignment_1()); 
            }

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
    // InternalBSharp.g:3034:1: rule__PolyContext__Group__2 : rule__PolyContext__Group__2__Impl ;
    public final void rule__PolyContext__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3038:1: ( rule__PolyContext__Group__2__Impl )
            // InternalBSharp.g:3039:2: rule__PolyContext__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PolyContext__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:3045:1: rule__PolyContext__Group__2__Impl : ( '>' ) ;
    public final void rule__PolyContext__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3049:1: ( ( '>' ) )
            // InternalBSharp.g:3050:1: ( '>' )
            {
            // InternalBSharp.g:3050:1: ( '>' )
            // InternalBSharp.g:3051:2: '>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPolyContextAccess().getGreaterThanSignKeyword_2()); 
            }
            match(input,48,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPolyContextAccess().getGreaterThanSignKeyword_2()); 
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
    // $ANTLR end "rule__PolyContext__Group__2__Impl"


    // $ANTLR start "rule__PolyType__Group__0"
    // InternalBSharp.g:3061:1: rule__PolyType__Group__0 : rule__PolyType__Group__0__Impl rule__PolyType__Group__1 ;
    public final void rule__PolyType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3065:1: ( rule__PolyType__Group__0__Impl rule__PolyType__Group__1 )
            // InternalBSharp.g:3066:2: rule__PolyType__Group__0__Impl rule__PolyType__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__PolyType__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PolyType__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:3073:1: rule__PolyType__Group__0__Impl : ( ( rule__PolyType__NameAssignment_0 ) ) ;
    public final void rule__PolyType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3077:1: ( ( ( rule__PolyType__NameAssignment_0 ) ) )
            // InternalBSharp.g:3078:1: ( ( rule__PolyType__NameAssignment_0 ) )
            {
            // InternalBSharp.g:3078:1: ( ( rule__PolyType__NameAssignment_0 ) )
            // InternalBSharp.g:3079:2: ( rule__PolyType__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPolyTypeAccess().getNameAssignment_0()); 
            }
            // InternalBSharp.g:3080:2: ( rule__PolyType__NameAssignment_0 )
            // InternalBSharp.g:3080:3: rule__PolyType__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__PolyType__NameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPolyTypeAccess().getNameAssignment_0()); 
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
    // $ANTLR end "rule__PolyType__Group__0__Impl"


    // $ANTLR start "rule__PolyType__Group__1"
    // InternalBSharp.g:3088:1: rule__PolyType__Group__1 : rule__PolyType__Group__1__Impl ;
    public final void rule__PolyType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3092:1: ( rule__PolyType__Group__1__Impl )
            // InternalBSharp.g:3093:2: rule__PolyType__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PolyType__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:3099:1: rule__PolyType__Group__1__Impl : ( ( rule__PolyType__Group_1__0 )? ) ;
    public final void rule__PolyType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3103:1: ( ( ( rule__PolyType__Group_1__0 )? ) )
            // InternalBSharp.g:3104:1: ( ( rule__PolyType__Group_1__0 )? )
            {
            // InternalBSharp.g:3104:1: ( ( rule__PolyType__Group_1__0 )? )
            // InternalBSharp.g:3105:2: ( rule__PolyType__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPolyTypeAccess().getGroup_1()); 
            }
            // InternalBSharp.g:3106:2: ( rule__PolyType__Group_1__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==37) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalBSharp.g:3106:3: rule__PolyType__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PolyType__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPolyTypeAccess().getGroup_1()); 
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
    // $ANTLR end "rule__PolyType__Group__1__Impl"


    // $ANTLR start "rule__PolyType__Group_1__0"
    // InternalBSharp.g:3115:1: rule__PolyType__Group_1__0 : rule__PolyType__Group_1__0__Impl rule__PolyType__Group_1__1 ;
    public final void rule__PolyType__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3119:1: ( rule__PolyType__Group_1__0__Impl rule__PolyType__Group_1__1 )
            // InternalBSharp.g:3120:2: rule__PolyType__Group_1__0__Impl rule__PolyType__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__PolyType__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PolyType__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:3127:1: rule__PolyType__Group_1__0__Impl : ( ':' ) ;
    public final void rule__PolyType__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3131:1: ( ( ':' ) )
            // InternalBSharp.g:3132:1: ( ':' )
            {
            // InternalBSharp.g:3132:1: ( ':' )
            // InternalBSharp.g:3133:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPolyTypeAccess().getColonKeyword_1_0()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPolyTypeAccess().getColonKeyword_1_0()); 
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
    // $ANTLR end "rule__PolyType__Group_1__0__Impl"


    // $ANTLR start "rule__PolyType__Group_1__1"
    // InternalBSharp.g:3142:1: rule__PolyType__Group_1__1 : rule__PolyType__Group_1__1__Impl rule__PolyType__Group_1__2 ;
    public final void rule__PolyType__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3146:1: ( rule__PolyType__Group_1__1__Impl rule__PolyType__Group_1__2 )
            // InternalBSharp.g:3147:2: rule__PolyType__Group_1__1__Impl rule__PolyType__Group_1__2
            {
            pushFollow(FOLLOW_20);
            rule__PolyType__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PolyType__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:3154:1: rule__PolyType__Group_1__1__Impl : ( ( rule__PolyType__SuperTypesAssignment_1_1 ) ) ;
    public final void rule__PolyType__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3158:1: ( ( ( rule__PolyType__SuperTypesAssignment_1_1 ) ) )
            // InternalBSharp.g:3159:1: ( ( rule__PolyType__SuperTypesAssignment_1_1 ) )
            {
            // InternalBSharp.g:3159:1: ( ( rule__PolyType__SuperTypesAssignment_1_1 ) )
            // InternalBSharp.g:3160:2: ( rule__PolyType__SuperTypesAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPolyTypeAccess().getSuperTypesAssignment_1_1()); 
            }
            // InternalBSharp.g:3161:2: ( rule__PolyType__SuperTypesAssignment_1_1 )
            // InternalBSharp.g:3161:3: rule__PolyType__SuperTypesAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__PolyType__SuperTypesAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPolyTypeAccess().getSuperTypesAssignment_1_1()); 
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
    // $ANTLR end "rule__PolyType__Group_1__1__Impl"


    // $ANTLR start "rule__PolyType__Group_1__2"
    // InternalBSharp.g:3169:1: rule__PolyType__Group_1__2 : rule__PolyType__Group_1__2__Impl ;
    public final void rule__PolyType__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3173:1: ( rule__PolyType__Group_1__2__Impl )
            // InternalBSharp.g:3174:2: rule__PolyType__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PolyType__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:3180:1: rule__PolyType__Group_1__2__Impl : ( ( rule__PolyType__Group_1_2__0 )* ) ;
    public final void rule__PolyType__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3184:1: ( ( ( rule__PolyType__Group_1_2__0 )* ) )
            // InternalBSharp.g:3185:1: ( ( rule__PolyType__Group_1_2__0 )* )
            {
            // InternalBSharp.g:3185:1: ( ( rule__PolyType__Group_1_2__0 )* )
            // InternalBSharp.g:3186:2: ( rule__PolyType__Group_1_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPolyTypeAccess().getGroup_1_2()); 
            }
            // InternalBSharp.g:3187:2: ( rule__PolyType__Group_1_2__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==49) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalBSharp.g:3187:3: rule__PolyType__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__PolyType__Group_1_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPolyTypeAccess().getGroup_1_2()); 
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
    // $ANTLR end "rule__PolyType__Group_1__2__Impl"


    // $ANTLR start "rule__PolyType__Group_1_2__0"
    // InternalBSharp.g:3196:1: rule__PolyType__Group_1_2__0 : rule__PolyType__Group_1_2__0__Impl rule__PolyType__Group_1_2__1 ;
    public final void rule__PolyType__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3200:1: ( rule__PolyType__Group_1_2__0__Impl rule__PolyType__Group_1_2__1 )
            // InternalBSharp.g:3201:2: rule__PolyType__Group_1_2__0__Impl rule__PolyType__Group_1_2__1
            {
            pushFollow(FOLLOW_3);
            rule__PolyType__Group_1_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PolyType__Group_1_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:3208:1: rule__PolyType__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__PolyType__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3212:1: ( ( ',' ) )
            // InternalBSharp.g:3213:1: ( ',' )
            {
            // InternalBSharp.g:3213:1: ( ',' )
            // InternalBSharp.g:3214:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPolyTypeAccess().getCommaKeyword_1_2_0()); 
            }
            match(input,49,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPolyTypeAccess().getCommaKeyword_1_2_0()); 
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
    // $ANTLR end "rule__PolyType__Group_1_2__0__Impl"


    // $ANTLR start "rule__PolyType__Group_1_2__1"
    // InternalBSharp.g:3223:1: rule__PolyType__Group_1_2__1 : rule__PolyType__Group_1_2__1__Impl ;
    public final void rule__PolyType__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3227:1: ( rule__PolyType__Group_1_2__1__Impl )
            // InternalBSharp.g:3228:2: rule__PolyType__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PolyType__Group_1_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:3234:1: rule__PolyType__Group_1_2__1__Impl : ( ( rule__PolyType__SuperTypesAssignment_1_2_1 ) ) ;
    public final void rule__PolyType__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3238:1: ( ( ( rule__PolyType__SuperTypesAssignment_1_2_1 ) ) )
            // InternalBSharp.g:3239:1: ( ( rule__PolyType__SuperTypesAssignment_1_2_1 ) )
            {
            // InternalBSharp.g:3239:1: ( ( rule__PolyType__SuperTypesAssignment_1_2_1 ) )
            // InternalBSharp.g:3240:2: ( rule__PolyType__SuperTypesAssignment_1_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPolyTypeAccess().getSuperTypesAssignment_1_2_1()); 
            }
            // InternalBSharp.g:3241:2: ( rule__PolyType__SuperTypesAssignment_1_2_1 )
            // InternalBSharp.g:3241:3: rule__PolyType__SuperTypesAssignment_1_2_1
            {
            pushFollow(FOLLOW_2);
            rule__PolyType__SuperTypesAssignment_1_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPolyTypeAccess().getSuperTypesAssignment_1_2_1()); 
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
    // $ANTLR end "rule__PolyType__Group_1_2__1__Impl"


    // $ANTLR start "rule__SuperTypeList__Group__0"
    // InternalBSharp.g:3250:1: rule__SuperTypeList__Group__0 : rule__SuperTypeList__Group__0__Impl rule__SuperTypeList__Group__1 ;
    public final void rule__SuperTypeList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3254:1: ( rule__SuperTypeList__Group__0__Impl rule__SuperTypeList__Group__1 )
            // InternalBSharp.g:3255:2: rule__SuperTypeList__Group__0__Impl rule__SuperTypeList__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__SuperTypeList__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SuperTypeList__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:3262:1: rule__SuperTypeList__Group__0__Impl : ( ':' ) ;
    public final void rule__SuperTypeList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3266:1: ( ( ':' ) )
            // InternalBSharp.g:3267:1: ( ':' )
            {
            // InternalBSharp.g:3267:1: ( ':' )
            // InternalBSharp.g:3268:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSuperTypeListAccess().getColonKeyword_0()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSuperTypeListAccess().getColonKeyword_0()); 
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
    // $ANTLR end "rule__SuperTypeList__Group__0__Impl"


    // $ANTLR start "rule__SuperTypeList__Group__1"
    // InternalBSharp.g:3277:1: rule__SuperTypeList__Group__1 : rule__SuperTypeList__Group__1__Impl rule__SuperTypeList__Group__2 ;
    public final void rule__SuperTypeList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3281:1: ( rule__SuperTypeList__Group__1__Impl rule__SuperTypeList__Group__2 )
            // InternalBSharp.g:3282:2: rule__SuperTypeList__Group__1__Impl rule__SuperTypeList__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__SuperTypeList__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SuperTypeList__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:3289:1: rule__SuperTypeList__Group__1__Impl : ( ( rule__SuperTypeList__SuperTypesAssignment_1 ) ) ;
    public final void rule__SuperTypeList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3293:1: ( ( ( rule__SuperTypeList__SuperTypesAssignment_1 ) ) )
            // InternalBSharp.g:3294:1: ( ( rule__SuperTypeList__SuperTypesAssignment_1 ) )
            {
            // InternalBSharp.g:3294:1: ( ( rule__SuperTypeList__SuperTypesAssignment_1 ) )
            // InternalBSharp.g:3295:2: ( rule__SuperTypeList__SuperTypesAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSuperTypeListAccess().getSuperTypesAssignment_1()); 
            }
            // InternalBSharp.g:3296:2: ( rule__SuperTypeList__SuperTypesAssignment_1 )
            // InternalBSharp.g:3296:3: rule__SuperTypeList__SuperTypesAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SuperTypeList__SuperTypesAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSuperTypeListAccess().getSuperTypesAssignment_1()); 
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
    // $ANTLR end "rule__SuperTypeList__Group__1__Impl"


    // $ANTLR start "rule__SuperTypeList__Group__2"
    // InternalBSharp.g:3304:1: rule__SuperTypeList__Group__2 : rule__SuperTypeList__Group__2__Impl ;
    public final void rule__SuperTypeList__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3308:1: ( rule__SuperTypeList__Group__2__Impl )
            // InternalBSharp.g:3309:2: rule__SuperTypeList__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SuperTypeList__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:3315:1: rule__SuperTypeList__Group__2__Impl : ( ( rule__SuperTypeList__Group_2__0 )* ) ;
    public final void rule__SuperTypeList__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3319:1: ( ( ( rule__SuperTypeList__Group_2__0 )* ) )
            // InternalBSharp.g:3320:1: ( ( rule__SuperTypeList__Group_2__0 )* )
            {
            // InternalBSharp.g:3320:1: ( ( rule__SuperTypeList__Group_2__0 )* )
            // InternalBSharp.g:3321:2: ( rule__SuperTypeList__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSuperTypeListAccess().getGroup_2()); 
            }
            // InternalBSharp.g:3322:2: ( rule__SuperTypeList__Group_2__0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==49) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalBSharp.g:3322:3: rule__SuperTypeList__Group_2__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__SuperTypeList__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSuperTypeListAccess().getGroup_2()); 
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
    // $ANTLR end "rule__SuperTypeList__Group__2__Impl"


    // $ANTLR start "rule__SuperTypeList__Group_2__0"
    // InternalBSharp.g:3331:1: rule__SuperTypeList__Group_2__0 : rule__SuperTypeList__Group_2__0__Impl rule__SuperTypeList__Group_2__1 ;
    public final void rule__SuperTypeList__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3335:1: ( rule__SuperTypeList__Group_2__0__Impl rule__SuperTypeList__Group_2__1 )
            // InternalBSharp.g:3336:2: rule__SuperTypeList__Group_2__0__Impl rule__SuperTypeList__Group_2__1
            {
            pushFollow(FOLLOW_22);
            rule__SuperTypeList__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SuperTypeList__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:3343:1: rule__SuperTypeList__Group_2__0__Impl : ( ',' ) ;
    public final void rule__SuperTypeList__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3347:1: ( ( ',' ) )
            // InternalBSharp.g:3348:1: ( ',' )
            {
            // InternalBSharp.g:3348:1: ( ',' )
            // InternalBSharp.g:3349:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSuperTypeListAccess().getCommaKeyword_2_0()); 
            }
            match(input,49,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSuperTypeListAccess().getCommaKeyword_2_0()); 
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
    // $ANTLR end "rule__SuperTypeList__Group_2__0__Impl"


    // $ANTLR start "rule__SuperTypeList__Group_2__1"
    // InternalBSharp.g:3358:1: rule__SuperTypeList__Group_2__1 : rule__SuperTypeList__Group_2__1__Impl ;
    public final void rule__SuperTypeList__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3362:1: ( rule__SuperTypeList__Group_2__1__Impl )
            // InternalBSharp.g:3363:2: rule__SuperTypeList__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SuperTypeList__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:3369:1: rule__SuperTypeList__Group_2__1__Impl : ( ( rule__SuperTypeList__SuperTypesAssignment_2_1 ) ) ;
    public final void rule__SuperTypeList__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3373:1: ( ( ( rule__SuperTypeList__SuperTypesAssignment_2_1 ) ) )
            // InternalBSharp.g:3374:1: ( ( rule__SuperTypeList__SuperTypesAssignment_2_1 ) )
            {
            // InternalBSharp.g:3374:1: ( ( rule__SuperTypeList__SuperTypesAssignment_2_1 ) )
            // InternalBSharp.g:3375:2: ( rule__SuperTypeList__SuperTypesAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSuperTypeListAccess().getSuperTypesAssignment_2_1()); 
            }
            // InternalBSharp.g:3376:2: ( rule__SuperTypeList__SuperTypesAssignment_2_1 )
            // InternalBSharp.g:3376:3: rule__SuperTypeList__SuperTypesAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__SuperTypeList__SuperTypesAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSuperTypeListAccess().getSuperTypesAssignment_2_1()); 
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
    // $ANTLR end "rule__SuperTypeList__Group_2__1__Impl"


    // $ANTLR start "rule__ConstructedType__Group__0"
    // InternalBSharp.g:3385:1: rule__ConstructedType__Group__0 : rule__ConstructedType__Group__0__Impl rule__ConstructedType__Group__1 ;
    public final void rule__ConstructedType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3389:1: ( rule__ConstructedType__Group__0__Impl rule__ConstructedType__Group__1 )
            // InternalBSharp.g:3390:2: rule__ConstructedType__Group__0__Impl rule__ConstructedType__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__ConstructedType__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ConstructedType__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:3397:1: rule__ConstructedType__Group__0__Impl : ( ruleBuilderElem ) ;
    public final void rule__ConstructedType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3401:1: ( ( ruleBuilderElem ) )
            // InternalBSharp.g:3402:1: ( ruleBuilderElem )
            {
            // InternalBSharp.g:3402:1: ( ruleBuilderElem )
            // InternalBSharp.g:3403:2: ruleBuilderElem
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstructedTypeAccess().getBuilderElemParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBuilderElem();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstructedTypeAccess().getBuilderElemParserRuleCall_0()); 
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
    // $ANTLR end "rule__ConstructedType__Group__0__Impl"


    // $ANTLR start "rule__ConstructedType__Group__1"
    // InternalBSharp.g:3412:1: rule__ConstructedType__Group__1 : rule__ConstructedType__Group__1__Impl ;
    public final void rule__ConstructedType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3416:1: ( rule__ConstructedType__Group__1__Impl )
            // InternalBSharp.g:3417:2: rule__ConstructedType__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConstructedType__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:3423:1: rule__ConstructedType__Group__1__Impl : ( ( rule__ConstructedType__Group_1__0 )* ) ;
    public final void rule__ConstructedType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3427:1: ( ( ( rule__ConstructedType__Group_1__0 )* ) )
            // InternalBSharp.g:3428:1: ( ( rule__ConstructedType__Group_1__0 )* )
            {
            // InternalBSharp.g:3428:1: ( ( rule__ConstructedType__Group_1__0 )* )
            // InternalBSharp.g:3429:2: ( rule__ConstructedType__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstructedTypeAccess().getGroup_1()); 
            }
            // InternalBSharp.g:3430:2: ( rule__ConstructedType__Group_1__0 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( ((LA36_0>=13 && LA36_0<=22)) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalBSharp.g:3430:3: rule__ConstructedType__Group_1__0
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__ConstructedType__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstructedTypeAccess().getGroup_1()); 
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
    // $ANTLR end "rule__ConstructedType__Group__1__Impl"


    // $ANTLR start "rule__ConstructedType__Group_1__0"
    // InternalBSharp.g:3439:1: rule__ConstructedType__Group_1__0 : rule__ConstructedType__Group_1__0__Impl rule__ConstructedType__Group_1__1 ;
    public final void rule__ConstructedType__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3443:1: ( rule__ConstructedType__Group_1__0__Impl rule__ConstructedType__Group_1__1 )
            // InternalBSharp.g:3444:2: rule__ConstructedType__Group_1__0__Impl rule__ConstructedType__Group_1__1
            {
            pushFollow(FOLLOW_23);
            rule__ConstructedType__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ConstructedType__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:3451:1: rule__ConstructedType__Group_1__0__Impl : ( () ) ;
    public final void rule__ConstructedType__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3455:1: ( ( () ) )
            // InternalBSharp.g:3456:1: ( () )
            {
            // InternalBSharp.g:3456:1: ( () )
            // InternalBSharp.g:3457:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstructedTypeAccess().getConstructedTypeLeftAction_1_0()); 
            }
            // InternalBSharp.g:3458:2: ()
            // InternalBSharp.g:3458:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstructedTypeAccess().getConstructedTypeLeftAction_1_0()); 
            }

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
    // InternalBSharp.g:3466:1: rule__ConstructedType__Group_1__1 : rule__ConstructedType__Group_1__1__Impl rule__ConstructedType__Group_1__2 ;
    public final void rule__ConstructedType__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3470:1: ( rule__ConstructedType__Group_1__1__Impl rule__ConstructedType__Group_1__2 )
            // InternalBSharp.g:3471:2: rule__ConstructedType__Group_1__1__Impl rule__ConstructedType__Group_1__2
            {
            pushFollow(FOLLOW_22);
            rule__ConstructedType__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ConstructedType__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:3478:1: rule__ConstructedType__Group_1__1__Impl : ( ( rule__ConstructedType__ConstructorAssignment_1_1 ) ) ;
    public final void rule__ConstructedType__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3482:1: ( ( ( rule__ConstructedType__ConstructorAssignment_1_1 ) ) )
            // InternalBSharp.g:3483:1: ( ( rule__ConstructedType__ConstructorAssignment_1_1 ) )
            {
            // InternalBSharp.g:3483:1: ( ( rule__ConstructedType__ConstructorAssignment_1_1 ) )
            // InternalBSharp.g:3484:2: ( rule__ConstructedType__ConstructorAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstructedTypeAccess().getConstructorAssignment_1_1()); 
            }
            // InternalBSharp.g:3485:2: ( rule__ConstructedType__ConstructorAssignment_1_1 )
            // InternalBSharp.g:3485:3: rule__ConstructedType__ConstructorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ConstructedType__ConstructorAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstructedTypeAccess().getConstructorAssignment_1_1()); 
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
    // $ANTLR end "rule__ConstructedType__Group_1__1__Impl"


    // $ANTLR start "rule__ConstructedType__Group_1__2"
    // InternalBSharp.g:3493:1: rule__ConstructedType__Group_1__2 : rule__ConstructedType__Group_1__2__Impl ;
    public final void rule__ConstructedType__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3497:1: ( rule__ConstructedType__Group_1__2__Impl )
            // InternalBSharp.g:3498:2: rule__ConstructedType__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConstructedType__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:3504:1: rule__ConstructedType__Group_1__2__Impl : ( ( rule__ConstructedType__RightAssignment_1_2 ) ) ;
    public final void rule__ConstructedType__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3508:1: ( ( ( rule__ConstructedType__RightAssignment_1_2 ) ) )
            // InternalBSharp.g:3509:1: ( ( rule__ConstructedType__RightAssignment_1_2 ) )
            {
            // InternalBSharp.g:3509:1: ( ( rule__ConstructedType__RightAssignment_1_2 ) )
            // InternalBSharp.g:3510:2: ( rule__ConstructedType__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstructedTypeAccess().getRightAssignment_1_2()); 
            }
            // InternalBSharp.g:3511:2: ( rule__ConstructedType__RightAssignment_1_2 )
            // InternalBSharp.g:3511:3: rule__ConstructedType__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__ConstructedType__RightAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstructedTypeAccess().getRightAssignment_1_2()); 
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
    // $ANTLR end "rule__ConstructedType__Group_1__2__Impl"


    // $ANTLR start "rule__TypeConstructor__Group__0"
    // InternalBSharp.g:3520:1: rule__TypeConstructor__Group__0 : rule__TypeConstructor__Group__0__Impl rule__TypeConstructor__Group__1 ;
    public final void rule__TypeConstructor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3524:1: ( rule__TypeConstructor__Group__0__Impl rule__TypeConstructor__Group__1 )
            // InternalBSharp.g:3525:2: rule__TypeConstructor__Group__0__Impl rule__TypeConstructor__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__TypeConstructor__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TypeConstructor__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:3532:1: rule__TypeConstructor__Group__0__Impl : ( ( rule__TypeConstructor__TypeNameAssignment_0 ) ) ;
    public final void rule__TypeConstructor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3536:1: ( ( ( rule__TypeConstructor__TypeNameAssignment_0 ) ) )
            // InternalBSharp.g:3537:1: ( ( rule__TypeConstructor__TypeNameAssignment_0 ) )
            {
            // InternalBSharp.g:3537:1: ( ( rule__TypeConstructor__TypeNameAssignment_0 ) )
            // InternalBSharp.g:3538:2: ( rule__TypeConstructor__TypeNameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeConstructorAccess().getTypeNameAssignment_0()); 
            }
            // InternalBSharp.g:3539:2: ( rule__TypeConstructor__TypeNameAssignment_0 )
            // InternalBSharp.g:3539:3: rule__TypeConstructor__TypeNameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__TypeConstructor__TypeNameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeConstructorAccess().getTypeNameAssignment_0()); 
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
    // $ANTLR end "rule__TypeConstructor__Group__0__Impl"


    // $ANTLR start "rule__TypeConstructor__Group__1"
    // InternalBSharp.g:3547:1: rule__TypeConstructor__Group__1 : rule__TypeConstructor__Group__1__Impl ;
    public final void rule__TypeConstructor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3551:1: ( rule__TypeConstructor__Group__1__Impl )
            // InternalBSharp.g:3552:2: rule__TypeConstructor__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TypeConstructor__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:3558:1: rule__TypeConstructor__Group__1__Impl : ( ( rule__TypeConstructor__ContextAssignment_1 )? ) ;
    public final void rule__TypeConstructor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3562:1: ( ( ( rule__TypeConstructor__ContextAssignment_1 )? ) )
            // InternalBSharp.g:3563:1: ( ( rule__TypeConstructor__ContextAssignment_1 )? )
            {
            // InternalBSharp.g:3563:1: ( ( rule__TypeConstructor__ContextAssignment_1 )? )
            // InternalBSharp.g:3564:2: ( rule__TypeConstructor__ContextAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeConstructorAccess().getContextAssignment_1()); 
            }
            // InternalBSharp.g:3565:2: ( rule__TypeConstructor__ContextAssignment_1 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==47) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalBSharp.g:3565:3: rule__TypeConstructor__ContextAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__TypeConstructor__ContextAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeConstructorAccess().getContextAssignment_1()); 
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
    // $ANTLR end "rule__TypeConstructor__Group__1__Impl"


    // $ANTLR start "rule__TypePowerSet__Group__0"
    // InternalBSharp.g:3574:1: rule__TypePowerSet__Group__0 : rule__TypePowerSet__Group__0__Impl rule__TypePowerSet__Group__1 ;
    public final void rule__TypePowerSet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3578:1: ( rule__TypePowerSet__Group__0__Impl rule__TypePowerSet__Group__1 )
            // InternalBSharp.g:3579:2: rule__TypePowerSet__Group__0__Impl rule__TypePowerSet__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__TypePowerSet__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TypePowerSet__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:3586:1: rule__TypePowerSet__Group__0__Impl : ( '\\u2119' ) ;
    public final void rule__TypePowerSet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3590:1: ( ( '\\u2119' ) )
            // InternalBSharp.g:3591:1: ( '\\u2119' )
            {
            // InternalBSharp.g:3591:1: ( '\\u2119' )
            // InternalBSharp.g:3592:2: '\\u2119'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypePowerSetAccess().getDoubleStruckCapitalPKeyword_0()); 
            }
            match(input,50,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypePowerSetAccess().getDoubleStruckCapitalPKeyword_0()); 
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
    // $ANTLR end "rule__TypePowerSet__Group__0__Impl"


    // $ANTLR start "rule__TypePowerSet__Group__1"
    // InternalBSharp.g:3601:1: rule__TypePowerSet__Group__1 : rule__TypePowerSet__Group__1__Impl rule__TypePowerSet__Group__2 ;
    public final void rule__TypePowerSet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3605:1: ( rule__TypePowerSet__Group__1__Impl rule__TypePowerSet__Group__2 )
            // InternalBSharp.g:3606:2: rule__TypePowerSet__Group__1__Impl rule__TypePowerSet__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__TypePowerSet__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TypePowerSet__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:3613:1: rule__TypePowerSet__Group__1__Impl : ( '(' ) ;
    public final void rule__TypePowerSet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3617:1: ( ( '(' ) )
            // InternalBSharp.g:3618:1: ( '(' )
            {
            // InternalBSharp.g:3618:1: ( '(' )
            // InternalBSharp.g:3619:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypePowerSetAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,45,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypePowerSetAccess().getLeftParenthesisKeyword_1()); 
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
    // $ANTLR end "rule__TypePowerSet__Group__1__Impl"


    // $ANTLR start "rule__TypePowerSet__Group__2"
    // InternalBSharp.g:3628:1: rule__TypePowerSet__Group__2 : rule__TypePowerSet__Group__2__Impl rule__TypePowerSet__Group__3 ;
    public final void rule__TypePowerSet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3632:1: ( rule__TypePowerSet__Group__2__Impl rule__TypePowerSet__Group__3 )
            // InternalBSharp.g:3633:2: rule__TypePowerSet__Group__2__Impl rule__TypePowerSet__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__TypePowerSet__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TypePowerSet__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:3640:1: rule__TypePowerSet__Group__2__Impl : ( ( rule__TypePowerSet__ChildAssignment_2 ) ) ;
    public final void rule__TypePowerSet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3644:1: ( ( ( rule__TypePowerSet__ChildAssignment_2 ) ) )
            // InternalBSharp.g:3645:1: ( ( rule__TypePowerSet__ChildAssignment_2 ) )
            {
            // InternalBSharp.g:3645:1: ( ( rule__TypePowerSet__ChildAssignment_2 ) )
            // InternalBSharp.g:3646:2: ( rule__TypePowerSet__ChildAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypePowerSetAccess().getChildAssignment_2()); 
            }
            // InternalBSharp.g:3647:2: ( rule__TypePowerSet__ChildAssignment_2 )
            // InternalBSharp.g:3647:3: rule__TypePowerSet__ChildAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__TypePowerSet__ChildAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypePowerSetAccess().getChildAssignment_2()); 
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
    // $ANTLR end "rule__TypePowerSet__Group__2__Impl"


    // $ANTLR start "rule__TypePowerSet__Group__3"
    // InternalBSharp.g:3655:1: rule__TypePowerSet__Group__3 : rule__TypePowerSet__Group__3__Impl ;
    public final void rule__TypePowerSet__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3659:1: ( rule__TypePowerSet__Group__3__Impl )
            // InternalBSharp.g:3660:2: rule__TypePowerSet__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TypePowerSet__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:3666:1: rule__TypePowerSet__Group__3__Impl : ( ')' ) ;
    public final void rule__TypePowerSet__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3670:1: ( ( ')' ) )
            // InternalBSharp.g:3671:1: ( ')' )
            {
            // InternalBSharp.g:3671:1: ( ')' )
            // InternalBSharp.g:3672:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypePowerSetAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,46,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypePowerSetAccess().getRightParenthesisKeyword_3()); 
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
    // $ANTLR end "rule__TypePowerSet__Group__3__Impl"


    // $ANTLR start "rule__TypeConstrBracket__Group__0"
    // InternalBSharp.g:3682:1: rule__TypeConstrBracket__Group__0 : rule__TypeConstrBracket__Group__0__Impl rule__TypeConstrBracket__Group__1 ;
    public final void rule__TypeConstrBracket__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3686:1: ( rule__TypeConstrBracket__Group__0__Impl rule__TypeConstrBracket__Group__1 )
            // InternalBSharp.g:3687:2: rule__TypeConstrBracket__Group__0__Impl rule__TypeConstrBracket__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__TypeConstrBracket__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TypeConstrBracket__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:3694:1: rule__TypeConstrBracket__Group__0__Impl : ( '(' ) ;
    public final void rule__TypeConstrBracket__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3698:1: ( ( '(' ) )
            // InternalBSharp.g:3699:1: ( '(' )
            {
            // InternalBSharp.g:3699:1: ( '(' )
            // InternalBSharp.g:3700:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeConstrBracketAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,45,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeConstrBracketAccess().getLeftParenthesisKeyword_0()); 
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
    // $ANTLR end "rule__TypeConstrBracket__Group__0__Impl"


    // $ANTLR start "rule__TypeConstrBracket__Group__1"
    // InternalBSharp.g:3709:1: rule__TypeConstrBracket__Group__1 : rule__TypeConstrBracket__Group__1__Impl rule__TypeConstrBracket__Group__2 ;
    public final void rule__TypeConstrBracket__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3713:1: ( rule__TypeConstrBracket__Group__1__Impl rule__TypeConstrBracket__Group__2 )
            // InternalBSharp.g:3714:2: rule__TypeConstrBracket__Group__1__Impl rule__TypeConstrBracket__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__TypeConstrBracket__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TypeConstrBracket__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:3721:1: rule__TypeConstrBracket__Group__1__Impl : ( ( rule__TypeConstrBracket__ChildAssignment_1 ) ) ;
    public final void rule__TypeConstrBracket__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3725:1: ( ( ( rule__TypeConstrBracket__ChildAssignment_1 ) ) )
            // InternalBSharp.g:3726:1: ( ( rule__TypeConstrBracket__ChildAssignment_1 ) )
            {
            // InternalBSharp.g:3726:1: ( ( rule__TypeConstrBracket__ChildAssignment_1 ) )
            // InternalBSharp.g:3727:2: ( rule__TypeConstrBracket__ChildAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeConstrBracketAccess().getChildAssignment_1()); 
            }
            // InternalBSharp.g:3728:2: ( rule__TypeConstrBracket__ChildAssignment_1 )
            // InternalBSharp.g:3728:3: rule__TypeConstrBracket__ChildAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TypeConstrBracket__ChildAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeConstrBracketAccess().getChildAssignment_1()); 
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
    // $ANTLR end "rule__TypeConstrBracket__Group__1__Impl"


    // $ANTLR start "rule__TypeConstrBracket__Group__2"
    // InternalBSharp.g:3736:1: rule__TypeConstrBracket__Group__2 : rule__TypeConstrBracket__Group__2__Impl ;
    public final void rule__TypeConstrBracket__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3740:1: ( rule__TypeConstrBracket__Group__2__Impl )
            // InternalBSharp.g:3741:2: rule__TypeConstrBracket__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TypeConstrBracket__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:3747:1: rule__TypeConstrBracket__Group__2__Impl : ( ')' ) ;
    public final void rule__TypeConstrBracket__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3751:1: ( ( ')' ) )
            // InternalBSharp.g:3752:1: ( ')' )
            {
            // InternalBSharp.g:3752:1: ( ')' )
            // InternalBSharp.g:3753:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeConstrBracketAccess().getRightParenthesisKeyword_2()); 
            }
            match(input,46,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeConstrBracketAccess().getRightParenthesisKeyword_2()); 
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
    // $ANTLR end "rule__TypeConstrBracket__Group__2__Impl"


    // $ANTLR start "rule__TypeDeclContext__Group__0"
    // InternalBSharp.g:3763:1: rule__TypeDeclContext__Group__0 : rule__TypeDeclContext__Group__0__Impl rule__TypeDeclContext__Group__1 ;
    public final void rule__TypeDeclContext__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3767:1: ( rule__TypeDeclContext__Group__0__Impl rule__TypeDeclContext__Group__1 )
            // InternalBSharp.g:3768:2: rule__TypeDeclContext__Group__0__Impl rule__TypeDeclContext__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__TypeDeclContext__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TypeDeclContext__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:3775:1: rule__TypeDeclContext__Group__0__Impl : ( '<' ) ;
    public final void rule__TypeDeclContext__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3779:1: ( ( '<' ) )
            // InternalBSharp.g:3780:1: ( '<' )
            {
            // InternalBSharp.g:3780:1: ( '<' )
            // InternalBSharp.g:3781:2: '<'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeDeclContextAccess().getLessThanSignKeyword_0()); 
            }
            match(input,47,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeDeclContextAccess().getLessThanSignKeyword_0()); 
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
    // $ANTLR end "rule__TypeDeclContext__Group__0__Impl"


    // $ANTLR start "rule__TypeDeclContext__Group__1"
    // InternalBSharp.g:3790:1: rule__TypeDeclContext__Group__1 : rule__TypeDeclContext__Group__1__Impl rule__TypeDeclContext__Group__2 ;
    public final void rule__TypeDeclContext__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3794:1: ( rule__TypeDeclContext__Group__1__Impl rule__TypeDeclContext__Group__2 )
            // InternalBSharp.g:3795:2: rule__TypeDeclContext__Group__1__Impl rule__TypeDeclContext__Group__2
            {
            pushFollow(FOLLOW_27);
            rule__TypeDeclContext__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TypeDeclContext__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:3802:1: rule__TypeDeclContext__Group__1__Impl : ( ( rule__TypeDeclContext__TypeNameAssignment_1 ) ) ;
    public final void rule__TypeDeclContext__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3806:1: ( ( ( rule__TypeDeclContext__TypeNameAssignment_1 ) ) )
            // InternalBSharp.g:3807:1: ( ( rule__TypeDeclContext__TypeNameAssignment_1 ) )
            {
            // InternalBSharp.g:3807:1: ( ( rule__TypeDeclContext__TypeNameAssignment_1 ) )
            // InternalBSharp.g:3808:2: ( rule__TypeDeclContext__TypeNameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeDeclContextAccess().getTypeNameAssignment_1()); 
            }
            // InternalBSharp.g:3809:2: ( rule__TypeDeclContext__TypeNameAssignment_1 )
            // InternalBSharp.g:3809:3: rule__TypeDeclContext__TypeNameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TypeDeclContext__TypeNameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeDeclContextAccess().getTypeNameAssignment_1()); 
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
    // $ANTLR end "rule__TypeDeclContext__Group__1__Impl"


    // $ANTLR start "rule__TypeDeclContext__Group__2"
    // InternalBSharp.g:3817:1: rule__TypeDeclContext__Group__2 : rule__TypeDeclContext__Group__2__Impl rule__TypeDeclContext__Group__3 ;
    public final void rule__TypeDeclContext__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3821:1: ( rule__TypeDeclContext__Group__2__Impl rule__TypeDeclContext__Group__3 )
            // InternalBSharp.g:3822:2: rule__TypeDeclContext__Group__2__Impl rule__TypeDeclContext__Group__3
            {
            pushFollow(FOLLOW_27);
            rule__TypeDeclContext__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TypeDeclContext__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:3829:1: rule__TypeDeclContext__Group__2__Impl : ( ( rule__TypeDeclContext__Group_2__0 )* ) ;
    public final void rule__TypeDeclContext__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3833:1: ( ( ( rule__TypeDeclContext__Group_2__0 )* ) )
            // InternalBSharp.g:3834:1: ( ( rule__TypeDeclContext__Group_2__0 )* )
            {
            // InternalBSharp.g:3834:1: ( ( rule__TypeDeclContext__Group_2__0 )* )
            // InternalBSharp.g:3835:2: ( rule__TypeDeclContext__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeDeclContextAccess().getGroup_2()); 
            }
            // InternalBSharp.g:3836:2: ( rule__TypeDeclContext__Group_2__0 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==49) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalBSharp.g:3836:3: rule__TypeDeclContext__Group_2__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__TypeDeclContext__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeDeclContextAccess().getGroup_2()); 
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
    // $ANTLR end "rule__TypeDeclContext__Group__2__Impl"


    // $ANTLR start "rule__TypeDeclContext__Group__3"
    // InternalBSharp.g:3844:1: rule__TypeDeclContext__Group__3 : rule__TypeDeclContext__Group__3__Impl ;
    public final void rule__TypeDeclContext__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3848:1: ( rule__TypeDeclContext__Group__3__Impl )
            // InternalBSharp.g:3849:2: rule__TypeDeclContext__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TypeDeclContext__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:3855:1: rule__TypeDeclContext__Group__3__Impl : ( '>' ) ;
    public final void rule__TypeDeclContext__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3859:1: ( ( '>' ) )
            // InternalBSharp.g:3860:1: ( '>' )
            {
            // InternalBSharp.g:3860:1: ( '>' )
            // InternalBSharp.g:3861:2: '>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeDeclContextAccess().getGreaterThanSignKeyword_3()); 
            }
            match(input,48,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeDeclContextAccess().getGreaterThanSignKeyword_3()); 
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
    // $ANTLR end "rule__TypeDeclContext__Group__3__Impl"


    // $ANTLR start "rule__TypeDeclContext__Group_2__0"
    // InternalBSharp.g:3871:1: rule__TypeDeclContext__Group_2__0 : rule__TypeDeclContext__Group_2__0__Impl rule__TypeDeclContext__Group_2__1 ;
    public final void rule__TypeDeclContext__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3875:1: ( rule__TypeDeclContext__Group_2__0__Impl rule__TypeDeclContext__Group_2__1 )
            // InternalBSharp.g:3876:2: rule__TypeDeclContext__Group_2__0__Impl rule__TypeDeclContext__Group_2__1
            {
            pushFollow(FOLLOW_22);
            rule__TypeDeclContext__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TypeDeclContext__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:3883:1: rule__TypeDeclContext__Group_2__0__Impl : ( ',' ) ;
    public final void rule__TypeDeclContext__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3887:1: ( ( ',' ) )
            // InternalBSharp.g:3888:1: ( ',' )
            {
            // InternalBSharp.g:3888:1: ( ',' )
            // InternalBSharp.g:3889:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeDeclContextAccess().getCommaKeyword_2_0()); 
            }
            match(input,49,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeDeclContextAccess().getCommaKeyword_2_0()); 
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
    // $ANTLR end "rule__TypeDeclContext__Group_2__0__Impl"


    // $ANTLR start "rule__TypeDeclContext__Group_2__1"
    // InternalBSharp.g:3898:1: rule__TypeDeclContext__Group_2__1 : rule__TypeDeclContext__Group_2__1__Impl ;
    public final void rule__TypeDeclContext__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3902:1: ( rule__TypeDeclContext__Group_2__1__Impl )
            // InternalBSharp.g:3903:2: rule__TypeDeclContext__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TypeDeclContext__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:3909:1: rule__TypeDeclContext__Group_2__1__Impl : ( ( rule__TypeDeclContext__TypeNameAssignment_2_1 ) ) ;
    public final void rule__TypeDeclContext__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3913:1: ( ( ( rule__TypeDeclContext__TypeNameAssignment_2_1 ) ) )
            // InternalBSharp.g:3914:1: ( ( rule__TypeDeclContext__TypeNameAssignment_2_1 ) )
            {
            // InternalBSharp.g:3914:1: ( ( rule__TypeDeclContext__TypeNameAssignment_2_1 ) )
            // InternalBSharp.g:3915:2: ( rule__TypeDeclContext__TypeNameAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeDeclContextAccess().getTypeNameAssignment_2_1()); 
            }
            // InternalBSharp.g:3916:2: ( rule__TypeDeclContext__TypeNameAssignment_2_1 )
            // InternalBSharp.g:3916:3: rule__TypeDeclContext__TypeNameAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__TypeDeclContext__TypeNameAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeDeclContextAccess().getTypeNameAssignment_2_1()); 
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
    // $ANTLR end "rule__TypeDeclContext__Group_2__1__Impl"


    // $ANTLR start "rule__Where__Group__0"
    // InternalBSharp.g:3925:1: rule__Where__Group__0 : rule__Where__Group__0__Impl rule__Where__Group__1 ;
    public final void rule__Where__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3929:1: ( rule__Where__Group__0__Impl rule__Where__Group__1 )
            // InternalBSharp.g:3930:2: rule__Where__Group__0__Impl rule__Where__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__Where__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Where__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:3937:1: rule__Where__Group__0__Impl : ( 'where' ) ;
    public final void rule__Where__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3941:1: ( ( 'where' ) )
            // InternalBSharp.g:3942:1: ( 'where' )
            {
            // InternalBSharp.g:3942:1: ( 'where' )
            // InternalBSharp.g:3943:2: 'where'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhereAccess().getWhereKeyword_0()); 
            }
            match(input,51,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhereAccess().getWhereKeyword_0()); 
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
    // $ANTLR end "rule__Where__Group__0__Impl"


    // $ANTLR start "rule__Where__Group__1"
    // InternalBSharp.g:3952:1: rule__Where__Group__1 : rule__Where__Group__1__Impl rule__Where__Group__2 ;
    public final void rule__Where__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3956:1: ( rule__Where__Group__1__Impl rule__Where__Group__2 )
            // InternalBSharp.g:3957:2: rule__Where__Group__1__Impl rule__Where__Group__2
            {
            pushFollow(FOLLOW_29);
            rule__Where__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Where__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:3964:1: rule__Where__Group__1__Impl : ( ( rule__Where__ExpressionsAssignment_1 ) ) ;
    public final void rule__Where__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3968:1: ( ( ( rule__Where__ExpressionsAssignment_1 ) ) )
            // InternalBSharp.g:3969:1: ( ( rule__Where__ExpressionsAssignment_1 ) )
            {
            // InternalBSharp.g:3969:1: ( ( rule__Where__ExpressionsAssignment_1 ) )
            // InternalBSharp.g:3970:2: ( rule__Where__ExpressionsAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhereAccess().getExpressionsAssignment_1()); 
            }
            // InternalBSharp.g:3971:2: ( rule__Where__ExpressionsAssignment_1 )
            // InternalBSharp.g:3971:3: rule__Where__ExpressionsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Where__ExpressionsAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhereAccess().getExpressionsAssignment_1()); 
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
    // $ANTLR end "rule__Where__Group__1__Impl"


    // $ANTLR start "rule__Where__Group__2"
    // InternalBSharp.g:3979:1: rule__Where__Group__2 : rule__Where__Group__2__Impl ;
    public final void rule__Where__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3983:1: ( rule__Where__Group__2__Impl )
            // InternalBSharp.g:3984:2: rule__Where__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Where__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:3990:1: rule__Where__Group__2__Impl : ( ( rule__Where__Group_2__0 )* ) ;
    public final void rule__Where__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3994:1: ( ( ( rule__Where__Group_2__0 )* ) )
            // InternalBSharp.g:3995:1: ( ( rule__Where__Group_2__0 )* )
            {
            // InternalBSharp.g:3995:1: ( ( rule__Where__Group_2__0 )* )
            // InternalBSharp.g:3996:2: ( rule__Where__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhereAccess().getGroup_2()); 
            }
            // InternalBSharp.g:3997:2: ( rule__Where__Group_2__0 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==42) ) {
                    int LA39_2 = input.LA(2);

                    if ( (LA39_2==RULE_ID||LA39_2==11||(LA39_2>=23 && LA39_2<=24)||(LA39_2>=32 && LA39_2<=35)||LA39_2==43||LA39_2==45||LA39_2==57||LA39_2==60||LA39_2==64) ) {
                        alt39=1;
                    }


                }


                switch (alt39) {
            	case 1 :
            	    // InternalBSharp.g:3997:3: rule__Where__Group_2__0
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__Where__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhereAccess().getGroup_2()); 
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
    // $ANTLR end "rule__Where__Group__2__Impl"


    // $ANTLR start "rule__Where__Group_2__0"
    // InternalBSharp.g:4006:1: rule__Where__Group_2__0 : rule__Where__Group_2__0__Impl rule__Where__Group_2__1 ;
    public final void rule__Where__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4010:1: ( rule__Where__Group_2__0__Impl rule__Where__Group_2__1 )
            // InternalBSharp.g:4011:2: rule__Where__Group_2__0__Impl rule__Where__Group_2__1
            {
            pushFollow(FOLLOW_28);
            rule__Where__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Where__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:4018:1: rule__Where__Group_2__0__Impl : ( ';' ) ;
    public final void rule__Where__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4022:1: ( ( ';' ) )
            // InternalBSharp.g:4023:1: ( ';' )
            {
            // InternalBSharp.g:4023:1: ( ';' )
            // InternalBSharp.g:4024:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhereAccess().getSemicolonKeyword_2_0()); 
            }
            match(input,42,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhereAccess().getSemicolonKeyword_2_0()); 
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
    // $ANTLR end "rule__Where__Group_2__0__Impl"


    // $ANTLR start "rule__Where__Group_2__1"
    // InternalBSharp.g:4033:1: rule__Where__Group_2__1 : rule__Where__Group_2__1__Impl ;
    public final void rule__Where__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4037:1: ( rule__Where__Group_2__1__Impl )
            // InternalBSharp.g:4038:2: rule__Where__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Where__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:4044:1: rule__Where__Group_2__1__Impl : ( ( rule__Where__ExpressionsAssignment_2_1 ) ) ;
    public final void rule__Where__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4048:1: ( ( ( rule__Where__ExpressionsAssignment_2_1 ) ) )
            // InternalBSharp.g:4049:1: ( ( rule__Where__ExpressionsAssignment_2_1 ) )
            {
            // InternalBSharp.g:4049:1: ( ( rule__Where__ExpressionsAssignment_2_1 ) )
            // InternalBSharp.g:4050:2: ( rule__Where__ExpressionsAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhereAccess().getExpressionsAssignment_2_1()); 
            }
            // InternalBSharp.g:4051:2: ( rule__Where__ExpressionsAssignment_2_1 )
            // InternalBSharp.g:4051:3: rule__Where__ExpressionsAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Where__ExpressionsAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhereAccess().getExpressionsAssignment_2_1()); 
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
    // $ANTLR end "rule__Where__Group_2__1__Impl"


    // $ANTLR start "rule__Datatype__Group__0"
    // InternalBSharp.g:4060:1: rule__Datatype__Group__0 : rule__Datatype__Group__0__Impl rule__Datatype__Group__1 ;
    public final void rule__Datatype__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4064:1: ( rule__Datatype__Group__0__Impl rule__Datatype__Group__1 )
            // InternalBSharp.g:4065:2: rule__Datatype__Group__0__Impl rule__Datatype__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Datatype__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Datatype__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:4072:1: rule__Datatype__Group__0__Impl : ( 'Datatype' ) ;
    public final void rule__Datatype__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4076:1: ( ( 'Datatype' ) )
            // InternalBSharp.g:4077:1: ( 'Datatype' )
            {
            // InternalBSharp.g:4077:1: ( 'Datatype' )
            // InternalBSharp.g:4078:2: 'Datatype'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDatatypeAccess().getDatatypeKeyword_0()); 
            }
            match(input,52,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDatatypeAccess().getDatatypeKeyword_0()); 
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
    // $ANTLR end "rule__Datatype__Group__0__Impl"


    // $ANTLR start "rule__Datatype__Group__1"
    // InternalBSharp.g:4087:1: rule__Datatype__Group__1 : rule__Datatype__Group__1__Impl rule__Datatype__Group__2 ;
    public final void rule__Datatype__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4091:1: ( rule__Datatype__Group__1__Impl rule__Datatype__Group__2 )
            // InternalBSharp.g:4092:2: rule__Datatype__Group__1__Impl rule__Datatype__Group__2
            {
            pushFollow(FOLLOW_31);
            rule__Datatype__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Datatype__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:4099:1: rule__Datatype__Group__1__Impl : ( ( rule__Datatype__NameAssignment_1 ) ) ;
    public final void rule__Datatype__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4103:1: ( ( ( rule__Datatype__NameAssignment_1 ) ) )
            // InternalBSharp.g:4104:1: ( ( rule__Datatype__NameAssignment_1 ) )
            {
            // InternalBSharp.g:4104:1: ( ( rule__Datatype__NameAssignment_1 ) )
            // InternalBSharp.g:4105:2: ( rule__Datatype__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDatatypeAccess().getNameAssignment_1()); 
            }
            // InternalBSharp.g:4106:2: ( rule__Datatype__NameAssignment_1 )
            // InternalBSharp.g:4106:3: rule__Datatype__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Datatype__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDatatypeAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__Datatype__Group__1__Impl"


    // $ANTLR start "rule__Datatype__Group__2"
    // InternalBSharp.g:4114:1: rule__Datatype__Group__2 : rule__Datatype__Group__2__Impl rule__Datatype__Group__3 ;
    public final void rule__Datatype__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4118:1: ( rule__Datatype__Group__2__Impl rule__Datatype__Group__3 )
            // InternalBSharp.g:4119:2: rule__Datatype__Group__2__Impl rule__Datatype__Group__3
            {
            pushFollow(FOLLOW_31);
            rule__Datatype__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Datatype__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:4126:1: rule__Datatype__Group__2__Impl : ( ( rule__Datatype__RawContextAssignment_2 )? ) ;
    public final void rule__Datatype__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4130:1: ( ( ( rule__Datatype__RawContextAssignment_2 )? ) )
            // InternalBSharp.g:4131:1: ( ( rule__Datatype__RawContextAssignment_2 )? )
            {
            // InternalBSharp.g:4131:1: ( ( rule__Datatype__RawContextAssignment_2 )? )
            // InternalBSharp.g:4132:2: ( rule__Datatype__RawContextAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDatatypeAccess().getRawContextAssignment_2()); 
            }
            // InternalBSharp.g:4133:2: ( rule__Datatype__RawContextAssignment_2 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==47) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalBSharp.g:4133:3: rule__Datatype__RawContextAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Datatype__RawContextAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDatatypeAccess().getRawContextAssignment_2()); 
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
    // $ANTLR end "rule__Datatype__Group__2__Impl"


    // $ANTLR start "rule__Datatype__Group__3"
    // InternalBSharp.g:4141:1: rule__Datatype__Group__3 : rule__Datatype__Group__3__Impl rule__Datatype__Group__4 ;
    public final void rule__Datatype__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4145:1: ( rule__Datatype__Group__3__Impl rule__Datatype__Group__4 )
            // InternalBSharp.g:4146:2: rule__Datatype__Group__3__Impl rule__Datatype__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__Datatype__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Datatype__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:4153:1: rule__Datatype__Group__3__Impl : ( ( ( rule__Datatype__Group_3__0 ) ) ( ( rule__Datatype__Group_3__0 )* ) ) ;
    public final void rule__Datatype__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4157:1: ( ( ( ( rule__Datatype__Group_3__0 ) ) ( ( rule__Datatype__Group_3__0 )* ) ) )
            // InternalBSharp.g:4158:1: ( ( ( rule__Datatype__Group_3__0 ) ) ( ( rule__Datatype__Group_3__0 )* ) )
            {
            // InternalBSharp.g:4158:1: ( ( ( rule__Datatype__Group_3__0 ) ) ( ( rule__Datatype__Group_3__0 )* ) )
            // InternalBSharp.g:4159:2: ( ( rule__Datatype__Group_3__0 ) ) ( ( rule__Datatype__Group_3__0 )* )
            {
            // InternalBSharp.g:4159:2: ( ( rule__Datatype__Group_3__0 ) )
            // InternalBSharp.g:4160:3: ( rule__Datatype__Group_3__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDatatypeAccess().getGroup_3()); 
            }
            // InternalBSharp.g:4161:3: ( rule__Datatype__Group_3__0 )
            // InternalBSharp.g:4161:4: rule__Datatype__Group_3__0
            {
            pushFollow(FOLLOW_32);
            rule__Datatype__Group_3__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDatatypeAccess().getGroup_3()); 
            }

            }

            // InternalBSharp.g:4164:2: ( ( rule__Datatype__Group_3__0 )* )
            // InternalBSharp.g:4165:3: ( rule__Datatype__Group_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDatatypeAccess().getGroup_3()); 
            }
            // InternalBSharp.g:4166:3: ( rule__Datatype__Group_3__0 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==53) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalBSharp.g:4166:4: rule__Datatype__Group_3__0
            	    {
            	    pushFollow(FOLLOW_32);
            	    rule__Datatype__Group_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDatatypeAccess().getGroup_3()); 
            }

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
    // InternalBSharp.g:4175:1: rule__Datatype__Group__4 : rule__Datatype__Group__4__Impl ;
    public final void rule__Datatype__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4179:1: ( rule__Datatype__Group__4__Impl )
            // InternalBSharp.g:4180:2: rule__Datatype__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Datatype__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:4186:1: rule__Datatype__Group__4__Impl : ( ( rule__Datatype__BlockAssignment_4 ) ) ;
    public final void rule__Datatype__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4190:1: ( ( ( rule__Datatype__BlockAssignment_4 ) ) )
            // InternalBSharp.g:4191:1: ( ( rule__Datatype__BlockAssignment_4 ) )
            {
            // InternalBSharp.g:4191:1: ( ( rule__Datatype__BlockAssignment_4 ) )
            // InternalBSharp.g:4192:2: ( rule__Datatype__BlockAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDatatypeAccess().getBlockAssignment_4()); 
            }
            // InternalBSharp.g:4193:2: ( rule__Datatype__BlockAssignment_4 )
            // InternalBSharp.g:4193:3: rule__Datatype__BlockAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Datatype__BlockAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDatatypeAccess().getBlockAssignment_4()); 
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
    // $ANTLR end "rule__Datatype__Group__4__Impl"


    // $ANTLR start "rule__Datatype__Group_3__0"
    // InternalBSharp.g:4202:1: rule__Datatype__Group_3__0 : rule__Datatype__Group_3__0__Impl rule__Datatype__Group_3__1 ;
    public final void rule__Datatype__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4206:1: ( rule__Datatype__Group_3__0__Impl rule__Datatype__Group_3__1 )
            // InternalBSharp.g:4207:2: rule__Datatype__Group_3__0__Impl rule__Datatype__Group_3__1
            {
            pushFollow(FOLLOW_3);
            rule__Datatype__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Datatype__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:4214:1: rule__Datatype__Group_3__0__Impl : ( '|' ) ;
    public final void rule__Datatype__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4218:1: ( ( '|' ) )
            // InternalBSharp.g:4219:1: ( '|' )
            {
            // InternalBSharp.g:4219:1: ( '|' )
            // InternalBSharp.g:4220:2: '|'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDatatypeAccess().getVerticalLineKeyword_3_0()); 
            }
            match(input,53,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDatatypeAccess().getVerticalLineKeyword_3_0()); 
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
    // $ANTLR end "rule__Datatype__Group_3__0__Impl"


    // $ANTLR start "rule__Datatype__Group_3__1"
    // InternalBSharp.g:4229:1: rule__Datatype__Group_3__1 : rule__Datatype__Group_3__1__Impl ;
    public final void rule__Datatype__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4233:1: ( rule__Datatype__Group_3__1__Impl )
            // InternalBSharp.g:4234:2: rule__Datatype__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Datatype__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:4240:1: rule__Datatype__Group_3__1__Impl : ( ( rule__Datatype__ConstructorsAssignment_3_1 ) ) ;
    public final void rule__Datatype__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4244:1: ( ( ( rule__Datatype__ConstructorsAssignment_3_1 ) ) )
            // InternalBSharp.g:4245:1: ( ( rule__Datatype__ConstructorsAssignment_3_1 ) )
            {
            // InternalBSharp.g:4245:1: ( ( rule__Datatype__ConstructorsAssignment_3_1 ) )
            // InternalBSharp.g:4246:2: ( rule__Datatype__ConstructorsAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDatatypeAccess().getConstructorsAssignment_3_1()); 
            }
            // InternalBSharp.g:4247:2: ( rule__Datatype__ConstructorsAssignment_3_1 )
            // InternalBSharp.g:4247:3: rule__Datatype__ConstructorsAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Datatype__ConstructorsAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDatatypeAccess().getConstructorsAssignment_3_1()); 
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
    // $ANTLR end "rule__Datatype__Group_3__1__Impl"


    // $ANTLR start "rule__DatatypeConstructor__Group__0"
    // InternalBSharp.g:4256:1: rule__DatatypeConstructor__Group__0 : rule__DatatypeConstructor__Group__0__Impl rule__DatatypeConstructor__Group__1 ;
    public final void rule__DatatypeConstructor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4260:1: ( rule__DatatypeConstructor__Group__0__Impl rule__DatatypeConstructor__Group__1 )
            // InternalBSharp.g:4261:2: rule__DatatypeConstructor__Group__0__Impl rule__DatatypeConstructor__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__DatatypeConstructor__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DatatypeConstructor__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:4268:1: rule__DatatypeConstructor__Group__0__Impl : ( ( rule__DatatypeConstructor__NameAssignment_0 ) ) ;
    public final void rule__DatatypeConstructor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4272:1: ( ( ( rule__DatatypeConstructor__NameAssignment_0 ) ) )
            // InternalBSharp.g:4273:1: ( ( rule__DatatypeConstructor__NameAssignment_0 ) )
            {
            // InternalBSharp.g:4273:1: ( ( rule__DatatypeConstructor__NameAssignment_0 ) )
            // InternalBSharp.g:4274:2: ( rule__DatatypeConstructor__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDatatypeConstructorAccess().getNameAssignment_0()); 
            }
            // InternalBSharp.g:4275:2: ( rule__DatatypeConstructor__NameAssignment_0 )
            // InternalBSharp.g:4275:3: rule__DatatypeConstructor__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__DatatypeConstructor__NameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDatatypeConstructorAccess().getNameAssignment_0()); 
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
    // $ANTLR end "rule__DatatypeConstructor__Group__0__Impl"


    // $ANTLR start "rule__DatatypeConstructor__Group__1"
    // InternalBSharp.g:4283:1: rule__DatatypeConstructor__Group__1 : rule__DatatypeConstructor__Group__1__Impl ;
    public final void rule__DatatypeConstructor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4287:1: ( rule__DatatypeConstructor__Group__1__Impl )
            // InternalBSharp.g:4288:2: rule__DatatypeConstructor__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DatatypeConstructor__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:4294:1: rule__DatatypeConstructor__Group__1__Impl : ( ( rule__DatatypeConstructor__Group_1__0 )? ) ;
    public final void rule__DatatypeConstructor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4298:1: ( ( ( rule__DatatypeConstructor__Group_1__0 )? ) )
            // InternalBSharp.g:4299:1: ( ( rule__DatatypeConstructor__Group_1__0 )? )
            {
            // InternalBSharp.g:4299:1: ( ( rule__DatatypeConstructor__Group_1__0 )? )
            // InternalBSharp.g:4300:2: ( rule__DatatypeConstructor__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDatatypeConstructorAccess().getGroup_1()); 
            }
            // InternalBSharp.g:4301:2: ( rule__DatatypeConstructor__Group_1__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==45) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalBSharp.g:4301:3: rule__DatatypeConstructor__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DatatypeConstructor__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDatatypeConstructorAccess().getGroup_1()); 
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
    // $ANTLR end "rule__DatatypeConstructor__Group__1__Impl"


    // $ANTLR start "rule__DatatypeConstructor__Group_1__0"
    // InternalBSharp.g:4310:1: rule__DatatypeConstructor__Group_1__0 : rule__DatatypeConstructor__Group_1__0__Impl rule__DatatypeConstructor__Group_1__1 ;
    public final void rule__DatatypeConstructor__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4314:1: ( rule__DatatypeConstructor__Group_1__0__Impl rule__DatatypeConstructor__Group_1__1 )
            // InternalBSharp.g:4315:2: rule__DatatypeConstructor__Group_1__0__Impl rule__DatatypeConstructor__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__DatatypeConstructor__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DatatypeConstructor__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:4322:1: rule__DatatypeConstructor__Group_1__0__Impl : ( '(' ) ;
    public final void rule__DatatypeConstructor__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4326:1: ( ( '(' ) )
            // InternalBSharp.g:4327:1: ( '(' )
            {
            // InternalBSharp.g:4327:1: ( '(' )
            // InternalBSharp.g:4328:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDatatypeConstructorAccess().getLeftParenthesisKeyword_1_0()); 
            }
            match(input,45,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDatatypeConstructorAccess().getLeftParenthesisKeyword_1_0()); 
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
    // $ANTLR end "rule__DatatypeConstructor__Group_1__0__Impl"


    // $ANTLR start "rule__DatatypeConstructor__Group_1__1"
    // InternalBSharp.g:4337:1: rule__DatatypeConstructor__Group_1__1 : rule__DatatypeConstructor__Group_1__1__Impl rule__DatatypeConstructor__Group_1__2 ;
    public final void rule__DatatypeConstructor__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4341:1: ( rule__DatatypeConstructor__Group_1__1__Impl rule__DatatypeConstructor__Group_1__2 )
            // InternalBSharp.g:4342:2: rule__DatatypeConstructor__Group_1__1__Impl rule__DatatypeConstructor__Group_1__2
            {
            pushFollow(FOLLOW_18);
            rule__DatatypeConstructor__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DatatypeConstructor__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:4349:1: rule__DatatypeConstructor__Group_1__1__Impl : ( ( rule__DatatypeConstructor__DeconsAssignment_1_1 ) ) ;
    public final void rule__DatatypeConstructor__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4353:1: ( ( ( rule__DatatypeConstructor__DeconsAssignment_1_1 ) ) )
            // InternalBSharp.g:4354:1: ( ( rule__DatatypeConstructor__DeconsAssignment_1_1 ) )
            {
            // InternalBSharp.g:4354:1: ( ( rule__DatatypeConstructor__DeconsAssignment_1_1 ) )
            // InternalBSharp.g:4355:2: ( rule__DatatypeConstructor__DeconsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDatatypeConstructorAccess().getDeconsAssignment_1_1()); 
            }
            // InternalBSharp.g:4356:2: ( rule__DatatypeConstructor__DeconsAssignment_1_1 )
            // InternalBSharp.g:4356:3: rule__DatatypeConstructor__DeconsAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__DatatypeConstructor__DeconsAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDatatypeConstructorAccess().getDeconsAssignment_1_1()); 
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
    // $ANTLR end "rule__DatatypeConstructor__Group_1__1__Impl"


    // $ANTLR start "rule__DatatypeConstructor__Group_1__2"
    // InternalBSharp.g:4364:1: rule__DatatypeConstructor__Group_1__2 : rule__DatatypeConstructor__Group_1__2__Impl ;
    public final void rule__DatatypeConstructor__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4368:1: ( rule__DatatypeConstructor__Group_1__2__Impl )
            // InternalBSharp.g:4369:2: rule__DatatypeConstructor__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DatatypeConstructor__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:4375:1: rule__DatatypeConstructor__Group_1__2__Impl : ( ')' ) ;
    public final void rule__DatatypeConstructor__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4379:1: ( ( ')' ) )
            // InternalBSharp.g:4380:1: ( ')' )
            {
            // InternalBSharp.g:4380:1: ( ')' )
            // InternalBSharp.g:4381:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDatatypeConstructorAccess().getRightParenthesisKeyword_1_2()); 
            }
            match(input,46,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDatatypeConstructorAccess().getRightParenthesisKeyword_1_2()); 
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
    // $ANTLR end "rule__DatatypeConstructor__Group_1__2__Impl"


    // $ANTLR start "rule__Extend__Group__0"
    // InternalBSharp.g:4391:1: rule__Extend__Group__0 : rule__Extend__Group__0__Impl rule__Extend__Group__1 ;
    public final void rule__Extend__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4395:1: ( rule__Extend__Group__0__Impl rule__Extend__Group__1 )
            // InternalBSharp.g:4396:2: rule__Extend__Group__0__Impl rule__Extend__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Extend__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Extend__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:4403:1: rule__Extend__Group__0__Impl : ( 'Extend' ) ;
    public final void rule__Extend__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4407:1: ( ( 'Extend' ) )
            // InternalBSharp.g:4408:1: ( 'Extend' )
            {
            // InternalBSharp.g:4408:1: ( 'Extend' )
            // InternalBSharp.g:4409:2: 'Extend'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendAccess().getExtendKeyword_0()); 
            }
            match(input,54,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExtendAccess().getExtendKeyword_0()); 
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
    // $ANTLR end "rule__Extend__Group__0__Impl"


    // $ANTLR start "rule__Extend__Group__1"
    // InternalBSharp.g:4418:1: rule__Extend__Group__1 : rule__Extend__Group__1__Impl rule__Extend__Group__2 ;
    public final void rule__Extend__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4422:1: ( rule__Extend__Group__1__Impl rule__Extend__Group__2 )
            // InternalBSharp.g:4423:2: rule__Extend__Group__1__Impl rule__Extend__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__Extend__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Extend__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:4430:1: rule__Extend__Group__1__Impl : ( ( rule__Extend__ExtendedClassAssignment_1 ) ) ;
    public final void rule__Extend__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4434:1: ( ( ( rule__Extend__ExtendedClassAssignment_1 ) ) )
            // InternalBSharp.g:4435:1: ( ( rule__Extend__ExtendedClassAssignment_1 ) )
            {
            // InternalBSharp.g:4435:1: ( ( rule__Extend__ExtendedClassAssignment_1 ) )
            // InternalBSharp.g:4436:2: ( rule__Extend__ExtendedClassAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendAccess().getExtendedClassAssignment_1()); 
            }
            // InternalBSharp.g:4437:2: ( rule__Extend__ExtendedClassAssignment_1 )
            // InternalBSharp.g:4437:3: rule__Extend__ExtendedClassAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Extend__ExtendedClassAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExtendAccess().getExtendedClassAssignment_1()); 
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
    // $ANTLR end "rule__Extend__Group__1__Impl"


    // $ANTLR start "rule__Extend__Group__2"
    // InternalBSharp.g:4445:1: rule__Extend__Group__2 : rule__Extend__Group__2__Impl rule__Extend__Group__3 ;
    public final void rule__Extend__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4449:1: ( rule__Extend__Group__2__Impl rule__Extend__Group__3 )
            // InternalBSharp.g:4450:2: rule__Extend__Group__2__Impl rule__Extend__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Extend__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Extend__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:4457:1: rule__Extend__Group__2__Impl : ( '(' ) ;
    public final void rule__Extend__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4461:1: ( ( '(' ) )
            // InternalBSharp.g:4462:1: ( '(' )
            {
            // InternalBSharp.g:4462:1: ( '(' )
            // InternalBSharp.g:4463:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,45,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExtendAccess().getLeftParenthesisKeyword_2()); 
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
    // $ANTLR end "rule__Extend__Group__2__Impl"


    // $ANTLR start "rule__Extend__Group__3"
    // InternalBSharp.g:4472:1: rule__Extend__Group__3 : rule__Extend__Group__3__Impl rule__Extend__Group__4 ;
    public final void rule__Extend__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4476:1: ( rule__Extend__Group__3__Impl rule__Extend__Group__4 )
            // InternalBSharp.g:4477:2: rule__Extend__Group__3__Impl rule__Extend__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__Extend__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Extend__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:4484:1: rule__Extend__Group__3__Impl : ( ( rule__Extend__NameAssignment_3 ) ) ;
    public final void rule__Extend__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4488:1: ( ( ( rule__Extend__NameAssignment_3 ) ) )
            // InternalBSharp.g:4489:1: ( ( rule__Extend__NameAssignment_3 ) )
            {
            // InternalBSharp.g:4489:1: ( ( rule__Extend__NameAssignment_3 ) )
            // InternalBSharp.g:4490:2: ( rule__Extend__NameAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendAccess().getNameAssignment_3()); 
            }
            // InternalBSharp.g:4491:2: ( rule__Extend__NameAssignment_3 )
            // InternalBSharp.g:4491:3: rule__Extend__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Extend__NameAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExtendAccess().getNameAssignment_3()); 
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
    // $ANTLR end "rule__Extend__Group__3__Impl"


    // $ANTLR start "rule__Extend__Group__4"
    // InternalBSharp.g:4499:1: rule__Extend__Group__4 : rule__Extend__Group__4__Impl rule__Extend__Group__5 ;
    public final void rule__Extend__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4503:1: ( rule__Extend__Group__4__Impl rule__Extend__Group__5 )
            // InternalBSharp.g:4504:2: rule__Extend__Group__4__Impl rule__Extend__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__Extend__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Extend__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:4511:1: rule__Extend__Group__4__Impl : ( ')' ) ;
    public final void rule__Extend__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4515:1: ( ( ')' ) )
            // InternalBSharp.g:4516:1: ( ')' )
            {
            // InternalBSharp.g:4516:1: ( ')' )
            // InternalBSharp.g:4517:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,46,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExtendAccess().getRightParenthesisKeyword_4()); 
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
    // $ANTLR end "rule__Extend__Group__4__Impl"


    // $ANTLR start "rule__Extend__Group__5"
    // InternalBSharp.g:4526:1: rule__Extend__Group__5 : rule__Extend__Group__5__Impl ;
    public final void rule__Extend__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4530:1: ( rule__Extend__Group__5__Impl )
            // InternalBSharp.g:4531:2: rule__Extend__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Extend__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:4537:1: rule__Extend__Group__5__Impl : ( ( rule__Extend__BlockAssignment_5 ) ) ;
    public final void rule__Extend__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4541:1: ( ( ( rule__Extend__BlockAssignment_5 ) ) )
            // InternalBSharp.g:4542:1: ( ( rule__Extend__BlockAssignment_5 ) )
            {
            // InternalBSharp.g:4542:1: ( ( rule__Extend__BlockAssignment_5 ) )
            // InternalBSharp.g:4543:2: ( rule__Extend__BlockAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendAccess().getBlockAssignment_5()); 
            }
            // InternalBSharp.g:4544:2: ( rule__Extend__BlockAssignment_5 )
            // InternalBSharp.g:4544:3: rule__Extend__BlockAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Extend__BlockAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExtendAccess().getBlockAssignment_5()); 
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
    // $ANTLR end "rule__Extend__Group__5__Impl"


    // $ANTLR start "rule__BSharpBlock__Group__0"
    // InternalBSharp.g:4553:1: rule__BSharpBlock__Group__0 : rule__BSharpBlock__Group__0__Impl rule__BSharpBlock__Group__1 ;
    public final void rule__BSharpBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4557:1: ( rule__BSharpBlock__Group__0__Impl rule__BSharpBlock__Group__1 )
            // InternalBSharp.g:4558:2: rule__BSharpBlock__Group__0__Impl rule__BSharpBlock__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__BSharpBlock__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BSharpBlock__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:4565:1: rule__BSharpBlock__Group__0__Impl : ( () ) ;
    public final void rule__BSharpBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4569:1: ( ( () ) )
            // InternalBSharp.g:4570:1: ( () )
            {
            // InternalBSharp.g:4570:1: ( () )
            // InternalBSharp.g:4571:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSharpBlockAccess().getBSharpBlockAction_0()); 
            }
            // InternalBSharp.g:4572:2: ()
            // InternalBSharp.g:4572:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSharpBlockAccess().getBSharpBlockAction_0()); 
            }

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
    // InternalBSharp.g:4580:1: rule__BSharpBlock__Group__1 : rule__BSharpBlock__Group__1__Impl rule__BSharpBlock__Group__2 ;
    public final void rule__BSharpBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4584:1: ( rule__BSharpBlock__Group__1__Impl rule__BSharpBlock__Group__2 )
            // InternalBSharp.g:4585:2: rule__BSharpBlock__Group__1__Impl rule__BSharpBlock__Group__2
            {
            pushFollow(FOLLOW_33);
            rule__BSharpBlock__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BSharpBlock__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:4592:1: rule__BSharpBlock__Group__1__Impl : ( '{' ) ;
    public final void rule__BSharpBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4596:1: ( ( '{' ) )
            // InternalBSharp.g:4597:1: ( '{' )
            {
            // InternalBSharp.g:4597:1: ( '{' )
            // InternalBSharp.g:4598:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSharpBlockAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,55,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSharpBlockAccess().getLeftCurlyBracketKeyword_1()); 
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
    // $ANTLR end "rule__BSharpBlock__Group__1__Impl"


    // $ANTLR start "rule__BSharpBlock__Group__2"
    // InternalBSharp.g:4607:1: rule__BSharpBlock__Group__2 : rule__BSharpBlock__Group__2__Impl rule__BSharpBlock__Group__3 ;
    public final void rule__BSharpBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4611:1: ( rule__BSharpBlock__Group__2__Impl rule__BSharpBlock__Group__3 )
            // InternalBSharp.g:4612:2: rule__BSharpBlock__Group__2__Impl rule__BSharpBlock__Group__3
            {
            pushFollow(FOLLOW_33);
            rule__BSharpBlock__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BSharpBlock__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:4619:1: rule__BSharpBlock__Group__2__Impl : ( ( rule__BSharpBlock__Alternatives_2 )* ) ;
    public final void rule__BSharpBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4623:1: ( ( ( rule__BSharpBlock__Alternatives_2 )* ) )
            // InternalBSharp.g:4624:1: ( ( rule__BSharpBlock__Alternatives_2 )* )
            {
            // InternalBSharp.g:4624:1: ( ( rule__BSharpBlock__Alternatives_2 )* )
            // InternalBSharp.g:4625:2: ( rule__BSharpBlock__Alternatives_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSharpBlockAccess().getAlternatives_2()); 
            }
            // InternalBSharp.g:4626:2: ( rule__BSharpBlock__Alternatives_2 )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==RULE_ID||LA43_0==58||LA43_0==62) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalBSharp.g:4626:3: rule__BSharpBlock__Alternatives_2
            	    {
            	    pushFollow(FOLLOW_34);
            	    rule__BSharpBlock__Alternatives_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSharpBlockAccess().getAlternatives_2()); 
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
    // $ANTLR end "rule__BSharpBlock__Group__2__Impl"


    // $ANTLR start "rule__BSharpBlock__Group__3"
    // InternalBSharp.g:4634:1: rule__BSharpBlock__Group__3 : rule__BSharpBlock__Group__3__Impl ;
    public final void rule__BSharpBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4638:1: ( rule__BSharpBlock__Group__3__Impl )
            // InternalBSharp.g:4639:2: rule__BSharpBlock__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BSharpBlock__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:4645:1: rule__BSharpBlock__Group__3__Impl : ( '}' ) ;
    public final void rule__BSharpBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4649:1: ( ( '}' ) )
            // InternalBSharp.g:4650:1: ( '}' )
            {
            // InternalBSharp.g:4650:1: ( '}' )
            // InternalBSharp.g:4651:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSharpBlockAccess().getRightCurlyBracketKeyword_3()); 
            }
            match(input,56,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSharpBlockAccess().getRightCurlyBracketKeyword_3()); 
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
    // $ANTLR end "rule__BSharpBlock__Group__3__Impl"


    // $ANTLR start "rule__FunctionDecl__Group__0"
    // InternalBSharp.g:4661:1: rule__FunctionDecl__Group__0 : rule__FunctionDecl__Group__0__Impl rule__FunctionDecl__Group__1 ;
    public final void rule__FunctionDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4665:1: ( rule__FunctionDecl__Group__0__Impl rule__FunctionDecl__Group__1 )
            // InternalBSharp.g:4666:2: rule__FunctionDecl__Group__0__Impl rule__FunctionDecl__Group__1
            {
            pushFollow(FOLLOW_35);
            rule__FunctionDecl__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FunctionDecl__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:4673:1: rule__FunctionDecl__Group__0__Impl : ( ( rule__FunctionDecl__NameAssignment_0 ) ) ;
    public final void rule__FunctionDecl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4677:1: ( ( ( rule__FunctionDecl__NameAssignment_0 ) ) )
            // InternalBSharp.g:4678:1: ( ( rule__FunctionDecl__NameAssignment_0 ) )
            {
            // InternalBSharp.g:4678:1: ( ( rule__FunctionDecl__NameAssignment_0 ) )
            // InternalBSharp.g:4679:2: ( rule__FunctionDecl__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionDeclAccess().getNameAssignment_0()); 
            }
            // InternalBSharp.g:4680:2: ( rule__FunctionDecl__NameAssignment_0 )
            // InternalBSharp.g:4680:3: rule__FunctionDecl__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__FunctionDecl__NameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionDeclAccess().getNameAssignment_0()); 
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
    // $ANTLR end "rule__FunctionDecl__Group__0__Impl"


    // $ANTLR start "rule__FunctionDecl__Group__1"
    // InternalBSharp.g:4688:1: rule__FunctionDecl__Group__1 : rule__FunctionDecl__Group__1__Impl rule__FunctionDecl__Group__2 ;
    public final void rule__FunctionDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4692:1: ( rule__FunctionDecl__Group__1__Impl rule__FunctionDecl__Group__2 )
            // InternalBSharp.g:4693:2: rule__FunctionDecl__Group__1__Impl rule__FunctionDecl__Group__2
            {
            pushFollow(FOLLOW_35);
            rule__FunctionDecl__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FunctionDecl__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:4700:1: rule__FunctionDecl__Group__1__Impl : ( ( rule__FunctionDecl__ContextAssignment_1 )? ) ;
    public final void rule__FunctionDecl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4704:1: ( ( ( rule__FunctionDecl__ContextAssignment_1 )? ) )
            // InternalBSharp.g:4705:1: ( ( rule__FunctionDecl__ContextAssignment_1 )? )
            {
            // InternalBSharp.g:4705:1: ( ( rule__FunctionDecl__ContextAssignment_1 )? )
            // InternalBSharp.g:4706:2: ( rule__FunctionDecl__ContextAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionDeclAccess().getContextAssignment_1()); 
            }
            // InternalBSharp.g:4707:2: ( rule__FunctionDecl__ContextAssignment_1 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==47) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalBSharp.g:4707:3: rule__FunctionDecl__ContextAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__FunctionDecl__ContextAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionDeclAccess().getContextAssignment_1()); 
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
    // $ANTLR end "rule__FunctionDecl__Group__1__Impl"


    // $ANTLR start "rule__FunctionDecl__Group__2"
    // InternalBSharp.g:4715:1: rule__FunctionDecl__Group__2 : rule__FunctionDecl__Group__2__Impl rule__FunctionDecl__Group__3 ;
    public final void rule__FunctionDecl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4719:1: ( rule__FunctionDecl__Group__2__Impl rule__FunctionDecl__Group__3 )
            // InternalBSharp.g:4720:2: rule__FunctionDecl__Group__2__Impl rule__FunctionDecl__Group__3
            {
            pushFollow(FOLLOW_36);
            rule__FunctionDecl__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FunctionDecl__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:4727:1: rule__FunctionDecl__Group__2__Impl : ( '(' ) ;
    public final void rule__FunctionDecl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4731:1: ( ( '(' ) )
            // InternalBSharp.g:4732:1: ( '(' )
            {
            // InternalBSharp.g:4732:1: ( '(' )
            // InternalBSharp.g:4733:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionDeclAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,45,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionDeclAccess().getLeftParenthesisKeyword_2()); 
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
    // $ANTLR end "rule__FunctionDecl__Group__2__Impl"


    // $ANTLR start "rule__FunctionDecl__Group__3"
    // InternalBSharp.g:4742:1: rule__FunctionDecl__Group__3 : rule__FunctionDecl__Group__3__Impl rule__FunctionDecl__Group__4 ;
    public final void rule__FunctionDecl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4746:1: ( rule__FunctionDecl__Group__3__Impl rule__FunctionDecl__Group__4 )
            // InternalBSharp.g:4747:2: rule__FunctionDecl__Group__3__Impl rule__FunctionDecl__Group__4
            {
            pushFollow(FOLLOW_36);
            rule__FunctionDecl__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FunctionDecl__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:4754:1: rule__FunctionDecl__Group__3__Impl : ( ( rule__FunctionDecl__VarListAssignment_3 )? ) ;
    public final void rule__FunctionDecl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4758:1: ( ( ( rule__FunctionDecl__VarListAssignment_3 )? ) )
            // InternalBSharp.g:4759:1: ( ( rule__FunctionDecl__VarListAssignment_3 )? )
            {
            // InternalBSharp.g:4759:1: ( ( rule__FunctionDecl__VarListAssignment_3 )? )
            // InternalBSharp.g:4760:2: ( rule__FunctionDecl__VarListAssignment_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionDeclAccess().getVarListAssignment_3()); 
            }
            // InternalBSharp.g:4761:2: ( rule__FunctionDecl__VarListAssignment_3 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_ID) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalBSharp.g:4761:3: rule__FunctionDecl__VarListAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__FunctionDecl__VarListAssignment_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionDeclAccess().getVarListAssignment_3()); 
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
    // $ANTLR end "rule__FunctionDecl__Group__3__Impl"


    // $ANTLR start "rule__FunctionDecl__Group__4"
    // InternalBSharp.g:4769:1: rule__FunctionDecl__Group__4 : rule__FunctionDecl__Group__4__Impl rule__FunctionDecl__Group__5 ;
    public final void rule__FunctionDecl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4773:1: ( rule__FunctionDecl__Group__4__Impl rule__FunctionDecl__Group__5 )
            // InternalBSharp.g:4774:2: rule__FunctionDecl__Group__4__Impl rule__FunctionDecl__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__FunctionDecl__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FunctionDecl__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:4781:1: rule__FunctionDecl__Group__4__Impl : ( ')' ) ;
    public final void rule__FunctionDecl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4785:1: ( ( ')' ) )
            // InternalBSharp.g:4786:1: ( ')' )
            {
            // InternalBSharp.g:4786:1: ( ')' )
            // InternalBSharp.g:4787:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionDeclAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,46,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionDeclAccess().getRightParenthesisKeyword_4()); 
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
    // $ANTLR end "rule__FunctionDecl__Group__4__Impl"


    // $ANTLR start "rule__FunctionDecl__Group__5"
    // InternalBSharp.g:4796:1: rule__FunctionDecl__Group__5 : rule__FunctionDecl__Group__5__Impl rule__FunctionDecl__Group__6 ;
    public final void rule__FunctionDecl__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4800:1: ( rule__FunctionDecl__Group__5__Impl rule__FunctionDecl__Group__6 )
            // InternalBSharp.g:4801:2: rule__FunctionDecl__Group__5__Impl rule__FunctionDecl__Group__6
            {
            pushFollow(FOLLOW_22);
            rule__FunctionDecl__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FunctionDecl__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:4808:1: rule__FunctionDecl__Group__5__Impl : ( ':' ) ;
    public final void rule__FunctionDecl__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4812:1: ( ( ':' ) )
            // InternalBSharp.g:4813:1: ( ':' )
            {
            // InternalBSharp.g:4813:1: ( ':' )
            // InternalBSharp.g:4814:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionDeclAccess().getColonKeyword_5()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionDeclAccess().getColonKeyword_5()); 
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
    // $ANTLR end "rule__FunctionDecl__Group__5__Impl"


    // $ANTLR start "rule__FunctionDecl__Group__6"
    // InternalBSharp.g:4823:1: rule__FunctionDecl__Group__6 : rule__FunctionDecl__Group__6__Impl rule__FunctionDecl__Group__7 ;
    public final void rule__FunctionDecl__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4827:1: ( rule__FunctionDecl__Group__6__Impl rule__FunctionDecl__Group__7 )
            // InternalBSharp.g:4828:2: rule__FunctionDecl__Group__6__Impl rule__FunctionDecl__Group__7
            {
            pushFollow(FOLLOW_37);
            rule__FunctionDecl__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FunctionDecl__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:4835:1: rule__FunctionDecl__Group__6__Impl : ( ( rule__FunctionDecl__ReturnTypeAssignment_6 ) ) ;
    public final void rule__FunctionDecl__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4839:1: ( ( ( rule__FunctionDecl__ReturnTypeAssignment_6 ) ) )
            // InternalBSharp.g:4840:1: ( ( rule__FunctionDecl__ReturnTypeAssignment_6 ) )
            {
            // InternalBSharp.g:4840:1: ( ( rule__FunctionDecl__ReturnTypeAssignment_6 ) )
            // InternalBSharp.g:4841:2: ( rule__FunctionDecl__ReturnTypeAssignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionDeclAccess().getReturnTypeAssignment_6()); 
            }
            // InternalBSharp.g:4842:2: ( rule__FunctionDecl__ReturnTypeAssignment_6 )
            // InternalBSharp.g:4842:3: rule__FunctionDecl__ReturnTypeAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__FunctionDecl__ReturnTypeAssignment_6();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionDeclAccess().getReturnTypeAssignment_6()); 
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
    // $ANTLR end "rule__FunctionDecl__Group__6__Impl"


    // $ANTLR start "rule__FunctionDecl__Group__7"
    // InternalBSharp.g:4850:1: rule__FunctionDecl__Group__7 : rule__FunctionDecl__Group__7__Impl rule__FunctionDecl__Group__8 ;
    public final void rule__FunctionDecl__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4854:1: ( rule__FunctionDecl__Group__7__Impl rule__FunctionDecl__Group__8 )
            // InternalBSharp.g:4855:2: rule__FunctionDecl__Group__7__Impl rule__FunctionDecl__Group__8
            {
            pushFollow(FOLLOW_37);
            rule__FunctionDecl__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FunctionDecl__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:4862:1: rule__FunctionDecl__Group__7__Impl : ( ( rule__FunctionDecl__InfixAssignment_7 )? ) ;
    public final void rule__FunctionDecl__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4866:1: ( ( ( rule__FunctionDecl__InfixAssignment_7 )? ) )
            // InternalBSharp.g:4867:1: ( ( rule__FunctionDecl__InfixAssignment_7 )? )
            {
            // InternalBSharp.g:4867:1: ( ( rule__FunctionDecl__InfixAssignment_7 )? )
            // InternalBSharp.g:4868:2: ( rule__FunctionDecl__InfixAssignment_7 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionDeclAccess().getInfixAssignment_7()); 
            }
            // InternalBSharp.g:4869:2: ( rule__FunctionDecl__InfixAssignment_7 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==63) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalBSharp.g:4869:3: rule__FunctionDecl__InfixAssignment_7
                    {
                    pushFollow(FOLLOW_2);
                    rule__FunctionDecl__InfixAssignment_7();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionDeclAccess().getInfixAssignment_7()); 
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
    // $ANTLR end "rule__FunctionDecl__Group__7__Impl"


    // $ANTLR start "rule__FunctionDecl__Group__8"
    // InternalBSharp.g:4877:1: rule__FunctionDecl__Group__8 : rule__FunctionDecl__Group__8__Impl rule__FunctionDecl__Group__9 ;
    public final void rule__FunctionDecl__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4881:1: ( rule__FunctionDecl__Group__8__Impl rule__FunctionDecl__Group__9 )
            // InternalBSharp.g:4882:2: rule__FunctionDecl__Group__8__Impl rule__FunctionDecl__Group__9
            {
            pushFollow(FOLLOW_37);
            rule__FunctionDecl__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FunctionDecl__Group__9();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:4889:1: rule__FunctionDecl__Group__8__Impl : ( ( rule__FunctionDecl__PrecedenceAssignment_8 )? ) ;
    public final void rule__FunctionDecl__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4893:1: ( ( ( rule__FunctionDecl__PrecedenceAssignment_8 )? ) )
            // InternalBSharp.g:4894:1: ( ( rule__FunctionDecl__PrecedenceAssignment_8 )? )
            {
            // InternalBSharp.g:4894:1: ( ( rule__FunctionDecl__PrecedenceAssignment_8 )? )
            // InternalBSharp.g:4895:2: ( rule__FunctionDecl__PrecedenceAssignment_8 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionDeclAccess().getPrecedenceAssignment_8()); 
            }
            // InternalBSharp.g:4896:2: ( rule__FunctionDecl__PrecedenceAssignment_8 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==RULE_INT) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalBSharp.g:4896:3: rule__FunctionDecl__PrecedenceAssignment_8
                    {
                    pushFollow(FOLLOW_2);
                    rule__FunctionDecl__PrecedenceAssignment_8();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionDeclAccess().getPrecedenceAssignment_8()); 
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
    // $ANTLR end "rule__FunctionDecl__Group__8__Impl"


    // $ANTLR start "rule__FunctionDecl__Group__9"
    // InternalBSharp.g:4904:1: rule__FunctionDecl__Group__9 : rule__FunctionDecl__Group__9__Impl ;
    public final void rule__FunctionDecl__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4908:1: ( rule__FunctionDecl__Group__9__Impl )
            // InternalBSharp.g:4909:2: rule__FunctionDecl__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FunctionDecl__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:4915:1: rule__FunctionDecl__Group__9__Impl : ( ( rule__FunctionDecl__ExprAssignment_9 ) ) ;
    public final void rule__FunctionDecl__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4919:1: ( ( ( rule__FunctionDecl__ExprAssignment_9 ) ) )
            // InternalBSharp.g:4920:1: ( ( rule__FunctionDecl__ExprAssignment_9 ) )
            {
            // InternalBSharp.g:4920:1: ( ( rule__FunctionDecl__ExprAssignment_9 ) )
            // InternalBSharp.g:4921:2: ( rule__FunctionDecl__ExprAssignment_9 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionDeclAccess().getExprAssignment_9()); 
            }
            // InternalBSharp.g:4922:2: ( rule__FunctionDecl__ExprAssignment_9 )
            // InternalBSharp.g:4922:3: rule__FunctionDecl__ExprAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__FunctionDecl__ExprAssignment_9();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionDeclAccess().getExprAssignment_9()); 
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
    // $ANTLR end "rule__FunctionDecl__Group__9__Impl"


    // $ANTLR start "rule__MatchStatement__Group__0"
    // InternalBSharp.g:4931:1: rule__MatchStatement__Group__0 : rule__MatchStatement__Group__0__Impl rule__MatchStatement__Group__1 ;
    public final void rule__MatchStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4935:1: ( rule__MatchStatement__Group__0__Impl rule__MatchStatement__Group__1 )
            // InternalBSharp.g:4936:2: rule__MatchStatement__Group__0__Impl rule__MatchStatement__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__MatchStatement__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MatchStatement__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:4943:1: rule__MatchStatement__Group__0__Impl : ( 'match' ) ;
    public final void rule__MatchStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4947:1: ( ( 'match' ) )
            // InternalBSharp.g:4948:1: ( 'match' )
            {
            // InternalBSharp.g:4948:1: ( 'match' )
            // InternalBSharp.g:4949:2: 'match'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMatchStatementAccess().getMatchKeyword_0()); 
            }
            match(input,57,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMatchStatementAccess().getMatchKeyword_0()); 
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
    // $ANTLR end "rule__MatchStatement__Group__0__Impl"


    // $ANTLR start "rule__MatchStatement__Group__1"
    // InternalBSharp.g:4958:1: rule__MatchStatement__Group__1 : rule__MatchStatement__Group__1__Impl rule__MatchStatement__Group__2 ;
    public final void rule__MatchStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4962:1: ( rule__MatchStatement__Group__1__Impl rule__MatchStatement__Group__2 )
            // InternalBSharp.g:4963:2: rule__MatchStatement__Group__1__Impl rule__MatchStatement__Group__2
            {
            pushFollow(FOLLOW_38);
            rule__MatchStatement__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MatchStatement__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:4970:1: rule__MatchStatement__Group__1__Impl : ( ( rule__MatchStatement__MatchAssignment_1 ) ) ;
    public final void rule__MatchStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4974:1: ( ( ( rule__MatchStatement__MatchAssignment_1 ) ) )
            // InternalBSharp.g:4975:1: ( ( rule__MatchStatement__MatchAssignment_1 ) )
            {
            // InternalBSharp.g:4975:1: ( ( rule__MatchStatement__MatchAssignment_1 ) )
            // InternalBSharp.g:4976:2: ( rule__MatchStatement__MatchAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMatchStatementAccess().getMatchAssignment_1()); 
            }
            // InternalBSharp.g:4977:2: ( rule__MatchStatement__MatchAssignment_1 )
            // InternalBSharp.g:4977:3: rule__MatchStatement__MatchAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MatchStatement__MatchAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMatchStatementAccess().getMatchAssignment_1()); 
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
    // $ANTLR end "rule__MatchStatement__Group__1__Impl"


    // $ANTLR start "rule__MatchStatement__Group__2"
    // InternalBSharp.g:4985:1: rule__MatchStatement__Group__2 : rule__MatchStatement__Group__2__Impl rule__MatchStatement__Group__3 ;
    public final void rule__MatchStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4989:1: ( rule__MatchStatement__Group__2__Impl rule__MatchStatement__Group__3 )
            // InternalBSharp.g:4990:2: rule__MatchStatement__Group__2__Impl rule__MatchStatement__Group__3
            {
            pushFollow(FOLLOW_39);
            rule__MatchStatement__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MatchStatement__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:4997:1: rule__MatchStatement__Group__2__Impl : ( '{' ) ;
    public final void rule__MatchStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5001:1: ( ( '{' ) )
            // InternalBSharp.g:5002:1: ( '{' )
            {
            // InternalBSharp.g:5002:1: ( '{' )
            // InternalBSharp.g:5003:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMatchStatementAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,55,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMatchStatementAccess().getLeftCurlyBracketKeyword_2()); 
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
    // $ANTLR end "rule__MatchStatement__Group__2__Impl"


    // $ANTLR start "rule__MatchStatement__Group__3"
    // InternalBSharp.g:5012:1: rule__MatchStatement__Group__3 : rule__MatchStatement__Group__3__Impl rule__MatchStatement__Group__4 ;
    public final void rule__MatchStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5016:1: ( rule__MatchStatement__Group__3__Impl rule__MatchStatement__Group__4 )
            // InternalBSharp.g:5017:2: rule__MatchStatement__Group__3__Impl rule__MatchStatement__Group__4
            {
            pushFollow(FOLLOW_40);
            rule__MatchStatement__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MatchStatement__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:5024:1: rule__MatchStatement__Group__3__Impl : ( ( rule__MatchStatement__InductCaseAssignment_3 ) ) ;
    public final void rule__MatchStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5028:1: ( ( ( rule__MatchStatement__InductCaseAssignment_3 ) ) )
            // InternalBSharp.g:5029:1: ( ( rule__MatchStatement__InductCaseAssignment_3 ) )
            {
            // InternalBSharp.g:5029:1: ( ( rule__MatchStatement__InductCaseAssignment_3 ) )
            // InternalBSharp.g:5030:2: ( rule__MatchStatement__InductCaseAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMatchStatementAccess().getInductCaseAssignment_3()); 
            }
            // InternalBSharp.g:5031:2: ( rule__MatchStatement__InductCaseAssignment_3 )
            // InternalBSharp.g:5031:3: rule__MatchStatement__InductCaseAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__MatchStatement__InductCaseAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMatchStatementAccess().getInductCaseAssignment_3()); 
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
    // $ANTLR end "rule__MatchStatement__Group__3__Impl"


    // $ANTLR start "rule__MatchStatement__Group__4"
    // InternalBSharp.g:5039:1: rule__MatchStatement__Group__4 : rule__MatchStatement__Group__4__Impl rule__MatchStatement__Group__5 ;
    public final void rule__MatchStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5043:1: ( rule__MatchStatement__Group__4__Impl rule__MatchStatement__Group__5 )
            // InternalBSharp.g:5044:2: rule__MatchStatement__Group__4__Impl rule__MatchStatement__Group__5
            {
            pushFollow(FOLLOW_40);
            rule__MatchStatement__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MatchStatement__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:5051:1: rule__MatchStatement__Group__4__Impl : ( ( rule__MatchStatement__InductCaseAssignment_4 )* ) ;
    public final void rule__MatchStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5055:1: ( ( ( rule__MatchStatement__InductCaseAssignment_4 )* ) )
            // InternalBSharp.g:5056:1: ( ( rule__MatchStatement__InductCaseAssignment_4 )* )
            {
            // InternalBSharp.g:5056:1: ( ( rule__MatchStatement__InductCaseAssignment_4 )* )
            // InternalBSharp.g:5057:2: ( rule__MatchStatement__InductCaseAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMatchStatementAccess().getInductCaseAssignment_4()); 
            }
            // InternalBSharp.g:5058:2: ( rule__MatchStatement__InductCaseAssignment_4 )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==53) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalBSharp.g:5058:3: rule__MatchStatement__InductCaseAssignment_4
            	    {
            	    pushFollow(FOLLOW_41);
            	    rule__MatchStatement__InductCaseAssignment_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMatchStatementAccess().getInductCaseAssignment_4()); 
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
    // $ANTLR end "rule__MatchStatement__Group__4__Impl"


    // $ANTLR start "rule__MatchStatement__Group__5"
    // InternalBSharp.g:5066:1: rule__MatchStatement__Group__5 : rule__MatchStatement__Group__5__Impl ;
    public final void rule__MatchStatement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5070:1: ( rule__MatchStatement__Group__5__Impl )
            // InternalBSharp.g:5071:2: rule__MatchStatement__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MatchStatement__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:5077:1: rule__MatchStatement__Group__5__Impl : ( '}' ) ;
    public final void rule__MatchStatement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5081:1: ( ( '}' ) )
            // InternalBSharp.g:5082:1: ( '}' )
            {
            // InternalBSharp.g:5082:1: ( '}' )
            // InternalBSharp.g:5083:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMatchStatementAccess().getRightCurlyBracketKeyword_5()); 
            }
            match(input,56,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMatchStatementAccess().getRightCurlyBracketKeyword_5()); 
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
    // $ANTLR end "rule__MatchStatement__Group__5__Impl"


    // $ANTLR start "rule__MatchCase__Group__0"
    // InternalBSharp.g:5093:1: rule__MatchCase__Group__0 : rule__MatchCase__Group__0__Impl rule__MatchCase__Group__1 ;
    public final void rule__MatchCase__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5097:1: ( rule__MatchCase__Group__0__Impl rule__MatchCase__Group__1 )
            // InternalBSharp.g:5098:2: rule__MatchCase__Group__0__Impl rule__MatchCase__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__MatchCase__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MatchCase__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:5105:1: rule__MatchCase__Group__0__Impl : ( '|' ) ;
    public final void rule__MatchCase__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5109:1: ( ( '|' ) )
            // InternalBSharp.g:5110:1: ( '|' )
            {
            // InternalBSharp.g:5110:1: ( '|' )
            // InternalBSharp.g:5111:2: '|'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMatchCaseAccess().getVerticalLineKeyword_0()); 
            }
            match(input,53,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMatchCaseAccess().getVerticalLineKeyword_0()); 
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
    // $ANTLR end "rule__MatchCase__Group__0__Impl"


    // $ANTLR start "rule__MatchCase__Group__1"
    // InternalBSharp.g:5120:1: rule__MatchCase__Group__1 : rule__MatchCase__Group__1__Impl rule__MatchCase__Group__2 ;
    public final void rule__MatchCase__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5124:1: ( rule__MatchCase__Group__1__Impl rule__MatchCase__Group__2 )
            // InternalBSharp.g:5125:2: rule__MatchCase__Group__1__Impl rule__MatchCase__Group__2
            {
            pushFollow(FOLLOW_42);
            rule__MatchCase__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MatchCase__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:5132:1: rule__MatchCase__Group__1__Impl : ( ( rule__MatchCase__DeconNameAssignment_1 ) ) ;
    public final void rule__MatchCase__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5136:1: ( ( ( rule__MatchCase__DeconNameAssignment_1 ) ) )
            // InternalBSharp.g:5137:1: ( ( rule__MatchCase__DeconNameAssignment_1 ) )
            {
            // InternalBSharp.g:5137:1: ( ( rule__MatchCase__DeconNameAssignment_1 ) )
            // InternalBSharp.g:5138:2: ( rule__MatchCase__DeconNameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMatchCaseAccess().getDeconNameAssignment_1()); 
            }
            // InternalBSharp.g:5139:2: ( rule__MatchCase__DeconNameAssignment_1 )
            // InternalBSharp.g:5139:3: rule__MatchCase__DeconNameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MatchCase__DeconNameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMatchCaseAccess().getDeconNameAssignment_1()); 
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
    // $ANTLR end "rule__MatchCase__Group__1__Impl"


    // $ANTLR start "rule__MatchCase__Group__2"
    // InternalBSharp.g:5147:1: rule__MatchCase__Group__2 : rule__MatchCase__Group__2__Impl rule__MatchCase__Group__3 ;
    public final void rule__MatchCase__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5151:1: ( rule__MatchCase__Group__2__Impl rule__MatchCase__Group__3 )
            // InternalBSharp.g:5152:2: rule__MatchCase__Group__2__Impl rule__MatchCase__Group__3
            {
            pushFollow(FOLLOW_42);
            rule__MatchCase__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MatchCase__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:5159:1: rule__MatchCase__Group__2__Impl : ( ( rule__MatchCase__Group_2__0 )? ) ;
    public final void rule__MatchCase__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5163:1: ( ( ( rule__MatchCase__Group_2__0 )? ) )
            // InternalBSharp.g:5164:1: ( ( rule__MatchCase__Group_2__0 )? )
            {
            // InternalBSharp.g:5164:1: ( ( rule__MatchCase__Group_2__0 )? )
            // InternalBSharp.g:5165:2: ( rule__MatchCase__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMatchCaseAccess().getGroup_2()); 
            }
            // InternalBSharp.g:5166:2: ( rule__MatchCase__Group_2__0 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==45) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalBSharp.g:5166:3: rule__MatchCase__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MatchCase__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMatchCaseAccess().getGroup_2()); 
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
    // $ANTLR end "rule__MatchCase__Group__2__Impl"


    // $ANTLR start "rule__MatchCase__Group__3"
    // InternalBSharp.g:5174:1: rule__MatchCase__Group__3 : rule__MatchCase__Group__3__Impl rule__MatchCase__Group__4 ;
    public final void rule__MatchCase__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5178:1: ( rule__MatchCase__Group__3__Impl rule__MatchCase__Group__4 )
            // InternalBSharp.g:5179:2: rule__MatchCase__Group__3__Impl rule__MatchCase__Group__4
            {
            pushFollow(FOLLOW_28);
            rule__MatchCase__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MatchCase__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:5186:1: rule__MatchCase__Group__3__Impl : ( ':' ) ;
    public final void rule__MatchCase__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5190:1: ( ( ':' ) )
            // InternalBSharp.g:5191:1: ( ':' )
            {
            // InternalBSharp.g:5191:1: ( ':' )
            // InternalBSharp.g:5192:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMatchCaseAccess().getColonKeyword_3()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMatchCaseAccess().getColonKeyword_3()); 
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
    // $ANTLR end "rule__MatchCase__Group__3__Impl"


    // $ANTLR start "rule__MatchCase__Group__4"
    // InternalBSharp.g:5201:1: rule__MatchCase__Group__4 : rule__MatchCase__Group__4__Impl ;
    public final void rule__MatchCase__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5205:1: ( rule__MatchCase__Group__4__Impl )
            // InternalBSharp.g:5206:2: rule__MatchCase__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MatchCase__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:5212:1: rule__MatchCase__Group__4__Impl : ( ( rule__MatchCase__ExprAssignment_4 ) ) ;
    public final void rule__MatchCase__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5216:1: ( ( ( rule__MatchCase__ExprAssignment_4 ) ) )
            // InternalBSharp.g:5217:1: ( ( rule__MatchCase__ExprAssignment_4 ) )
            {
            // InternalBSharp.g:5217:1: ( ( rule__MatchCase__ExprAssignment_4 ) )
            // InternalBSharp.g:5218:2: ( rule__MatchCase__ExprAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMatchCaseAccess().getExprAssignment_4()); 
            }
            // InternalBSharp.g:5219:2: ( rule__MatchCase__ExprAssignment_4 )
            // InternalBSharp.g:5219:3: rule__MatchCase__ExprAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__MatchCase__ExprAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMatchCaseAccess().getExprAssignment_4()); 
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
    // $ANTLR end "rule__MatchCase__Group__4__Impl"


    // $ANTLR start "rule__MatchCase__Group_2__0"
    // InternalBSharp.g:5228:1: rule__MatchCase__Group_2__0 : rule__MatchCase__Group_2__0__Impl rule__MatchCase__Group_2__1 ;
    public final void rule__MatchCase__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5232:1: ( rule__MatchCase__Group_2__0__Impl rule__MatchCase__Group_2__1 )
            // InternalBSharp.g:5233:2: rule__MatchCase__Group_2__0__Impl rule__MatchCase__Group_2__1
            {
            pushFollow(FOLLOW_3);
            rule__MatchCase__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MatchCase__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:5240:1: rule__MatchCase__Group_2__0__Impl : ( '(' ) ;
    public final void rule__MatchCase__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5244:1: ( ( '(' ) )
            // InternalBSharp.g:5245:1: ( '(' )
            {
            // InternalBSharp.g:5245:1: ( '(' )
            // InternalBSharp.g:5246:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMatchCaseAccess().getLeftParenthesisKeyword_2_0()); 
            }
            match(input,45,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMatchCaseAccess().getLeftParenthesisKeyword_2_0()); 
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
    // $ANTLR end "rule__MatchCase__Group_2__0__Impl"


    // $ANTLR start "rule__MatchCase__Group_2__1"
    // InternalBSharp.g:5255:1: rule__MatchCase__Group_2__1 : rule__MatchCase__Group_2__1__Impl rule__MatchCase__Group_2__2 ;
    public final void rule__MatchCase__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5259:1: ( rule__MatchCase__Group_2__1__Impl rule__MatchCase__Group_2__2 )
            // InternalBSharp.g:5260:2: rule__MatchCase__Group_2__1__Impl rule__MatchCase__Group_2__2
            {
            pushFollow(FOLLOW_43);
            rule__MatchCase__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MatchCase__Group_2__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:5267:1: rule__MatchCase__Group_2__1__Impl : ( ( rule__MatchCase__VariablesAssignment_2_1 ) ) ;
    public final void rule__MatchCase__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5271:1: ( ( ( rule__MatchCase__VariablesAssignment_2_1 ) ) )
            // InternalBSharp.g:5272:1: ( ( rule__MatchCase__VariablesAssignment_2_1 ) )
            {
            // InternalBSharp.g:5272:1: ( ( rule__MatchCase__VariablesAssignment_2_1 ) )
            // InternalBSharp.g:5273:2: ( rule__MatchCase__VariablesAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMatchCaseAccess().getVariablesAssignment_2_1()); 
            }
            // InternalBSharp.g:5274:2: ( rule__MatchCase__VariablesAssignment_2_1 )
            // InternalBSharp.g:5274:3: rule__MatchCase__VariablesAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__MatchCase__VariablesAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMatchCaseAccess().getVariablesAssignment_2_1()); 
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
    // $ANTLR end "rule__MatchCase__Group_2__1__Impl"


    // $ANTLR start "rule__MatchCase__Group_2__2"
    // InternalBSharp.g:5282:1: rule__MatchCase__Group_2__2 : rule__MatchCase__Group_2__2__Impl rule__MatchCase__Group_2__3 ;
    public final void rule__MatchCase__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5286:1: ( rule__MatchCase__Group_2__2__Impl rule__MatchCase__Group_2__3 )
            // InternalBSharp.g:5287:2: rule__MatchCase__Group_2__2__Impl rule__MatchCase__Group_2__3
            {
            pushFollow(FOLLOW_43);
            rule__MatchCase__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MatchCase__Group_2__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:5294:1: rule__MatchCase__Group_2__2__Impl : ( ( rule__MatchCase__Group_2_2__0 )* ) ;
    public final void rule__MatchCase__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5298:1: ( ( ( rule__MatchCase__Group_2_2__0 )* ) )
            // InternalBSharp.g:5299:1: ( ( rule__MatchCase__Group_2_2__0 )* )
            {
            // InternalBSharp.g:5299:1: ( ( rule__MatchCase__Group_2_2__0 )* )
            // InternalBSharp.g:5300:2: ( rule__MatchCase__Group_2_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMatchCaseAccess().getGroup_2_2()); 
            }
            // InternalBSharp.g:5301:2: ( rule__MatchCase__Group_2_2__0 )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==49) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalBSharp.g:5301:3: rule__MatchCase__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__MatchCase__Group_2_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMatchCaseAccess().getGroup_2_2()); 
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
    // $ANTLR end "rule__MatchCase__Group_2__2__Impl"


    // $ANTLR start "rule__MatchCase__Group_2__3"
    // InternalBSharp.g:5309:1: rule__MatchCase__Group_2__3 : rule__MatchCase__Group_2__3__Impl ;
    public final void rule__MatchCase__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5313:1: ( rule__MatchCase__Group_2__3__Impl )
            // InternalBSharp.g:5314:2: rule__MatchCase__Group_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MatchCase__Group_2__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:5320:1: rule__MatchCase__Group_2__3__Impl : ( ')' ) ;
    public final void rule__MatchCase__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5324:1: ( ( ')' ) )
            // InternalBSharp.g:5325:1: ( ')' )
            {
            // InternalBSharp.g:5325:1: ( ')' )
            // InternalBSharp.g:5326:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMatchCaseAccess().getRightParenthesisKeyword_2_3()); 
            }
            match(input,46,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMatchCaseAccess().getRightParenthesisKeyword_2_3()); 
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
    // $ANTLR end "rule__MatchCase__Group_2__3__Impl"


    // $ANTLR start "rule__MatchCase__Group_2_2__0"
    // InternalBSharp.g:5336:1: rule__MatchCase__Group_2_2__0 : rule__MatchCase__Group_2_2__0__Impl rule__MatchCase__Group_2_2__1 ;
    public final void rule__MatchCase__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5340:1: ( rule__MatchCase__Group_2_2__0__Impl rule__MatchCase__Group_2_2__1 )
            // InternalBSharp.g:5341:2: rule__MatchCase__Group_2_2__0__Impl rule__MatchCase__Group_2_2__1
            {
            pushFollow(FOLLOW_3);
            rule__MatchCase__Group_2_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MatchCase__Group_2_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:5348:1: rule__MatchCase__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__MatchCase__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5352:1: ( ( ',' ) )
            // InternalBSharp.g:5353:1: ( ',' )
            {
            // InternalBSharp.g:5353:1: ( ',' )
            // InternalBSharp.g:5354:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMatchCaseAccess().getCommaKeyword_2_2_0()); 
            }
            match(input,49,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMatchCaseAccess().getCommaKeyword_2_2_0()); 
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
    // $ANTLR end "rule__MatchCase__Group_2_2__0__Impl"


    // $ANTLR start "rule__MatchCase__Group_2_2__1"
    // InternalBSharp.g:5363:1: rule__MatchCase__Group_2_2__1 : rule__MatchCase__Group_2_2__1__Impl ;
    public final void rule__MatchCase__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5367:1: ( rule__MatchCase__Group_2_2__1__Impl )
            // InternalBSharp.g:5368:2: rule__MatchCase__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MatchCase__Group_2_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:5374:1: rule__MatchCase__Group_2_2__1__Impl : ( ( rule__MatchCase__VariablesAssignment_2_2_1 ) ) ;
    public final void rule__MatchCase__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5378:1: ( ( ( rule__MatchCase__VariablesAssignment_2_2_1 ) ) )
            // InternalBSharp.g:5379:1: ( ( rule__MatchCase__VariablesAssignment_2_2_1 ) )
            {
            // InternalBSharp.g:5379:1: ( ( rule__MatchCase__VariablesAssignment_2_2_1 ) )
            // InternalBSharp.g:5380:2: ( rule__MatchCase__VariablesAssignment_2_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMatchCaseAccess().getVariablesAssignment_2_2_1()); 
            }
            // InternalBSharp.g:5381:2: ( rule__MatchCase__VariablesAssignment_2_2_1 )
            // InternalBSharp.g:5381:3: rule__MatchCase__VariablesAssignment_2_2_1
            {
            pushFollow(FOLLOW_2);
            rule__MatchCase__VariablesAssignment_2_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMatchCaseAccess().getVariablesAssignment_2_2_1()); 
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
    // $ANTLR end "rule__MatchCase__Group_2_2__1__Impl"


    // $ANTLR start "rule__TheoremBody__Group__0"
    // InternalBSharp.g:5390:1: rule__TheoremBody__Group__0 : rule__TheoremBody__Group__0__Impl rule__TheoremBody__Group__1 ;
    public final void rule__TheoremBody__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5394:1: ( rule__TheoremBody__Group__0__Impl rule__TheoremBody__Group__1 )
            // InternalBSharp.g:5395:2: rule__TheoremBody__Group__0__Impl rule__TheoremBody__Group__1
            {
            pushFollow(FOLLOW_38);
            rule__TheoremBody__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TheoremBody__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:5402:1: rule__TheoremBody__Group__0__Impl : ( 'Theorems' ) ;
    public final void rule__TheoremBody__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5406:1: ( ( 'Theorems' ) )
            // InternalBSharp.g:5407:1: ( 'Theorems' )
            {
            // InternalBSharp.g:5407:1: ( 'Theorems' )
            // InternalBSharp.g:5408:2: 'Theorems'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTheoremBodyAccess().getTheoremsKeyword_0()); 
            }
            match(input,58,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTheoremBodyAccess().getTheoremsKeyword_0()); 
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
    // $ANTLR end "rule__TheoremBody__Group__0__Impl"


    // $ANTLR start "rule__TheoremBody__Group__1"
    // InternalBSharp.g:5417:1: rule__TheoremBody__Group__1 : rule__TheoremBody__Group__1__Impl rule__TheoremBody__Group__2 ;
    public final void rule__TheoremBody__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5421:1: ( rule__TheoremBody__Group__1__Impl rule__TheoremBody__Group__2 )
            // InternalBSharp.g:5422:2: rule__TheoremBody__Group__1__Impl rule__TheoremBody__Group__2
            {
            pushFollow(FOLLOW_44);
            rule__TheoremBody__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TheoremBody__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:5429:1: rule__TheoremBody__Group__1__Impl : ( '{' ) ;
    public final void rule__TheoremBody__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5433:1: ( ( '{' ) )
            // InternalBSharp.g:5434:1: ( '{' )
            {
            // InternalBSharp.g:5434:1: ( '{' )
            // InternalBSharp.g:5435:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTheoremBodyAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,55,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTheoremBodyAccess().getLeftCurlyBracketKeyword_1()); 
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
    // $ANTLR end "rule__TheoremBody__Group__1__Impl"


    // $ANTLR start "rule__TheoremBody__Group__2"
    // InternalBSharp.g:5444:1: rule__TheoremBody__Group__2 : rule__TheoremBody__Group__2__Impl rule__TheoremBody__Group__3 ;
    public final void rule__TheoremBody__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5448:1: ( rule__TheoremBody__Group__2__Impl rule__TheoremBody__Group__3 )
            // InternalBSharp.g:5449:2: rule__TheoremBody__Group__2__Impl rule__TheoremBody__Group__3
            {
            pushFollow(FOLLOW_45);
            rule__TheoremBody__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TheoremBody__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:5456:1: rule__TheoremBody__Group__2__Impl : ( ( ( rule__TheoremBody__TheoremDeclAssignment_2 ) ) ( ( rule__TheoremBody__TheoremDeclAssignment_2 )* ) ) ;
    public final void rule__TheoremBody__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5460:1: ( ( ( ( rule__TheoremBody__TheoremDeclAssignment_2 ) ) ( ( rule__TheoremBody__TheoremDeclAssignment_2 )* ) ) )
            // InternalBSharp.g:5461:1: ( ( ( rule__TheoremBody__TheoremDeclAssignment_2 ) ) ( ( rule__TheoremBody__TheoremDeclAssignment_2 )* ) )
            {
            // InternalBSharp.g:5461:1: ( ( ( rule__TheoremBody__TheoremDeclAssignment_2 ) ) ( ( rule__TheoremBody__TheoremDeclAssignment_2 )* ) )
            // InternalBSharp.g:5462:2: ( ( rule__TheoremBody__TheoremDeclAssignment_2 ) ) ( ( rule__TheoremBody__TheoremDeclAssignment_2 )* )
            {
            // InternalBSharp.g:5462:2: ( ( rule__TheoremBody__TheoremDeclAssignment_2 ) )
            // InternalBSharp.g:5463:3: ( rule__TheoremBody__TheoremDeclAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTheoremBodyAccess().getTheoremDeclAssignment_2()); 
            }
            // InternalBSharp.g:5464:3: ( rule__TheoremBody__TheoremDeclAssignment_2 )
            // InternalBSharp.g:5464:4: rule__TheoremBody__TheoremDeclAssignment_2
            {
            pushFollow(FOLLOW_6);
            rule__TheoremBody__TheoremDeclAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTheoremBodyAccess().getTheoremDeclAssignment_2()); 
            }

            }

            // InternalBSharp.g:5467:2: ( ( rule__TheoremBody__TheoremDeclAssignment_2 )* )
            // InternalBSharp.g:5468:3: ( rule__TheoremBody__TheoremDeclAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTheoremBodyAccess().getTheoremDeclAssignment_2()); 
            }
            // InternalBSharp.g:5469:3: ( rule__TheoremBody__TheoremDeclAssignment_2 )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( ((LA51_0>=RULE_INT && LA51_0<=RULE_WS)||LA51_0==37) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // InternalBSharp.g:5469:4: rule__TheoremBody__TheoremDeclAssignment_2
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__TheoremBody__TheoremDeclAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTheoremBodyAccess().getTheoremDeclAssignment_2()); 
            }

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
    // InternalBSharp.g:5478:1: rule__TheoremBody__Group__3 : rule__TheoremBody__Group__3__Impl ;
    public final void rule__TheoremBody__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5482:1: ( rule__TheoremBody__Group__3__Impl )
            // InternalBSharp.g:5483:2: rule__TheoremBody__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TheoremBody__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:5489:1: rule__TheoremBody__Group__3__Impl : ( '}' ) ;
    public final void rule__TheoremBody__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5493:1: ( ( '}' ) )
            // InternalBSharp.g:5494:1: ( '}' )
            {
            // InternalBSharp.g:5494:1: ( '}' )
            // InternalBSharp.g:5495:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTheoremBodyAccess().getRightCurlyBracketKeyword_3()); 
            }
            match(input,56,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTheoremBodyAccess().getRightCurlyBracketKeyword_3()); 
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
    // $ANTLR end "rule__TheoremBody__Group__3__Impl"


    // $ANTLR start "rule__TheoremDecl__Group__0"
    // InternalBSharp.g:5505:1: rule__TheoremDecl__Group__0 : rule__TheoremDecl__Group__0__Impl rule__TheoremDecl__Group__1 ;
    public final void rule__TheoremDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5509:1: ( rule__TheoremDecl__Group__0__Impl rule__TheoremDecl__Group__1 )
            // InternalBSharp.g:5510:2: rule__TheoremDecl__Group__0__Impl rule__TheoremDecl__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__TheoremDecl__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TheoremDecl__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:5517:1: rule__TheoremDecl__Group__0__Impl : ( ( rule__TheoremDecl__NameAssignment_0 ) ) ;
    public final void rule__TheoremDecl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5521:1: ( ( ( rule__TheoremDecl__NameAssignment_0 ) ) )
            // InternalBSharp.g:5522:1: ( ( rule__TheoremDecl__NameAssignment_0 ) )
            {
            // InternalBSharp.g:5522:1: ( ( rule__TheoremDecl__NameAssignment_0 ) )
            // InternalBSharp.g:5523:2: ( rule__TheoremDecl__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTheoremDeclAccess().getNameAssignment_0()); 
            }
            // InternalBSharp.g:5524:2: ( rule__TheoremDecl__NameAssignment_0 )
            // InternalBSharp.g:5524:3: rule__TheoremDecl__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__TheoremDecl__NameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTheoremDeclAccess().getNameAssignment_0()); 
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
    // $ANTLR end "rule__TheoremDecl__Group__0__Impl"


    // $ANTLR start "rule__TheoremDecl__Group__1"
    // InternalBSharp.g:5532:1: rule__TheoremDecl__Group__1 : rule__TheoremDecl__Group__1__Impl rule__TheoremDecl__Group__2 ;
    public final void rule__TheoremDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5536:1: ( rule__TheoremDecl__Group__1__Impl rule__TheoremDecl__Group__2 )
            // InternalBSharp.g:5537:2: rule__TheoremDecl__Group__1__Impl rule__TheoremDecl__Group__2
            {
            pushFollow(FOLLOW_29);
            rule__TheoremDecl__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TheoremDecl__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:5544:1: rule__TheoremDecl__Group__1__Impl : ( ( rule__TheoremDecl__ExprAssignment_1 ) ) ;
    public final void rule__TheoremDecl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5548:1: ( ( ( rule__TheoremDecl__ExprAssignment_1 ) ) )
            // InternalBSharp.g:5549:1: ( ( rule__TheoremDecl__ExprAssignment_1 ) )
            {
            // InternalBSharp.g:5549:1: ( ( rule__TheoremDecl__ExprAssignment_1 ) )
            // InternalBSharp.g:5550:2: ( rule__TheoremDecl__ExprAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTheoremDeclAccess().getExprAssignment_1()); 
            }
            // InternalBSharp.g:5551:2: ( rule__TheoremDecl__ExprAssignment_1 )
            // InternalBSharp.g:5551:3: rule__TheoremDecl__ExprAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TheoremDecl__ExprAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTheoremDeclAccess().getExprAssignment_1()); 
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
    // $ANTLR end "rule__TheoremDecl__Group__1__Impl"


    // $ANTLR start "rule__TheoremDecl__Group__2"
    // InternalBSharp.g:5559:1: rule__TheoremDecl__Group__2 : rule__TheoremDecl__Group__2__Impl ;
    public final void rule__TheoremDecl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5563:1: ( rule__TheoremDecl__Group__2__Impl )
            // InternalBSharp.g:5564:2: rule__TheoremDecl__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TheoremDecl__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:5570:1: rule__TheoremDecl__Group__2__Impl : ( ';' ) ;
    public final void rule__TheoremDecl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5574:1: ( ( ';' ) )
            // InternalBSharp.g:5575:1: ( ';' )
            {
            // InternalBSharp.g:5575:1: ( ';' )
            // InternalBSharp.g:5576:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTheoremDeclAccess().getSemicolonKeyword_2()); 
            }
            match(input,42,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTheoremDeclAccess().getSemicolonKeyword_2()); 
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
    // $ANTLR end "rule__TheoremDecl__Group__2__Impl"


    // $ANTLR start "rule__TypedVariableList__Group__0"
    // InternalBSharp.g:5586:1: rule__TypedVariableList__Group__0 : rule__TypedVariableList__Group__0__Impl rule__TypedVariableList__Group__1 ;
    public final void rule__TypedVariableList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5590:1: ( rule__TypedVariableList__Group__0__Impl rule__TypedVariableList__Group__1 )
            // InternalBSharp.g:5591:2: rule__TypedVariableList__Group__0__Impl rule__TypedVariableList__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__TypedVariableList__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TypedVariableList__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:5598:1: rule__TypedVariableList__Group__0__Impl : ( ( rule__TypedVariableList__VariablesOfTypeAssignment_0 ) ) ;
    public final void rule__TypedVariableList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5602:1: ( ( ( rule__TypedVariableList__VariablesOfTypeAssignment_0 ) ) )
            // InternalBSharp.g:5603:1: ( ( rule__TypedVariableList__VariablesOfTypeAssignment_0 ) )
            {
            // InternalBSharp.g:5603:1: ( ( rule__TypedVariableList__VariablesOfTypeAssignment_0 ) )
            // InternalBSharp.g:5604:2: ( rule__TypedVariableList__VariablesOfTypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedVariableListAccess().getVariablesOfTypeAssignment_0()); 
            }
            // InternalBSharp.g:5605:2: ( rule__TypedVariableList__VariablesOfTypeAssignment_0 )
            // InternalBSharp.g:5605:3: rule__TypedVariableList__VariablesOfTypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__TypedVariableList__VariablesOfTypeAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypedVariableListAccess().getVariablesOfTypeAssignment_0()); 
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
    // $ANTLR end "rule__TypedVariableList__Group__0__Impl"


    // $ANTLR start "rule__TypedVariableList__Group__1"
    // InternalBSharp.g:5613:1: rule__TypedVariableList__Group__1 : rule__TypedVariableList__Group__1__Impl ;
    public final void rule__TypedVariableList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5617:1: ( rule__TypedVariableList__Group__1__Impl )
            // InternalBSharp.g:5618:2: rule__TypedVariableList__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TypedVariableList__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:5624:1: rule__TypedVariableList__Group__1__Impl : ( ( rule__TypedVariableList__Group_1__0 )* ) ;
    public final void rule__TypedVariableList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5628:1: ( ( ( rule__TypedVariableList__Group_1__0 )* ) )
            // InternalBSharp.g:5629:1: ( ( rule__TypedVariableList__Group_1__0 )* )
            {
            // InternalBSharp.g:5629:1: ( ( rule__TypedVariableList__Group_1__0 )* )
            // InternalBSharp.g:5630:2: ( rule__TypedVariableList__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedVariableListAccess().getGroup_1()); 
            }
            // InternalBSharp.g:5631:2: ( rule__TypedVariableList__Group_1__0 )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==49) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // InternalBSharp.g:5631:3: rule__TypedVariableList__Group_1__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__TypedVariableList__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypedVariableListAccess().getGroup_1()); 
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
    // $ANTLR end "rule__TypedVariableList__Group__1__Impl"


    // $ANTLR start "rule__TypedVariableList__Group_1__0"
    // InternalBSharp.g:5640:1: rule__TypedVariableList__Group_1__0 : rule__TypedVariableList__Group_1__0__Impl rule__TypedVariableList__Group_1__1 ;
    public final void rule__TypedVariableList__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5644:1: ( rule__TypedVariableList__Group_1__0__Impl rule__TypedVariableList__Group_1__1 )
            // InternalBSharp.g:5645:2: rule__TypedVariableList__Group_1__0__Impl rule__TypedVariableList__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__TypedVariableList__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TypedVariableList__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:5652:1: rule__TypedVariableList__Group_1__0__Impl : ( ',' ) ;
    public final void rule__TypedVariableList__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5656:1: ( ( ',' ) )
            // InternalBSharp.g:5657:1: ( ',' )
            {
            // InternalBSharp.g:5657:1: ( ',' )
            // InternalBSharp.g:5658:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedVariableListAccess().getCommaKeyword_1_0()); 
            }
            match(input,49,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypedVariableListAccess().getCommaKeyword_1_0()); 
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
    // $ANTLR end "rule__TypedVariableList__Group_1__0__Impl"


    // $ANTLR start "rule__TypedVariableList__Group_1__1"
    // InternalBSharp.g:5667:1: rule__TypedVariableList__Group_1__1 : rule__TypedVariableList__Group_1__1__Impl ;
    public final void rule__TypedVariableList__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5671:1: ( rule__TypedVariableList__Group_1__1__Impl )
            // InternalBSharp.g:5672:2: rule__TypedVariableList__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TypedVariableList__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:5678:1: rule__TypedVariableList__Group_1__1__Impl : ( ( rule__TypedVariableList__VariablesOfTypeAssignment_1_1 ) ) ;
    public final void rule__TypedVariableList__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5682:1: ( ( ( rule__TypedVariableList__VariablesOfTypeAssignment_1_1 ) ) )
            // InternalBSharp.g:5683:1: ( ( rule__TypedVariableList__VariablesOfTypeAssignment_1_1 ) )
            {
            // InternalBSharp.g:5683:1: ( ( rule__TypedVariableList__VariablesOfTypeAssignment_1_1 ) )
            // InternalBSharp.g:5684:2: ( rule__TypedVariableList__VariablesOfTypeAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedVariableListAccess().getVariablesOfTypeAssignment_1_1()); 
            }
            // InternalBSharp.g:5685:2: ( rule__TypedVariableList__VariablesOfTypeAssignment_1_1 )
            // InternalBSharp.g:5685:3: rule__TypedVariableList__VariablesOfTypeAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__TypedVariableList__VariablesOfTypeAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypedVariableListAccess().getVariablesOfTypeAssignment_1_1()); 
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
    // $ANTLR end "rule__TypedVariableList__Group_1__1__Impl"


    // $ANTLR start "rule__VariableTyping__Group__0"
    // InternalBSharp.g:5694:1: rule__VariableTyping__Group__0 : rule__VariableTyping__Group__0__Impl rule__VariableTyping__Group__1 ;
    public final void rule__VariableTyping__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5698:1: ( rule__VariableTyping__Group__0__Impl rule__VariableTyping__Group__1 )
            // InternalBSharp.g:5699:2: rule__VariableTyping__Group__0__Impl rule__VariableTyping__Group__1
            {
            pushFollow(FOLLOW_46);
            rule__VariableTyping__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__VariableTyping__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:5706:1: rule__VariableTyping__Group__0__Impl : ( ( rule__VariableTyping__TypeVarAssignment_0 ) ) ;
    public final void rule__VariableTyping__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5710:1: ( ( ( rule__VariableTyping__TypeVarAssignment_0 ) ) )
            // InternalBSharp.g:5711:1: ( ( rule__VariableTyping__TypeVarAssignment_0 ) )
            {
            // InternalBSharp.g:5711:1: ( ( rule__VariableTyping__TypeVarAssignment_0 ) )
            // InternalBSharp.g:5712:2: ( rule__VariableTyping__TypeVarAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableTypingAccess().getTypeVarAssignment_0()); 
            }
            // InternalBSharp.g:5713:2: ( rule__VariableTyping__TypeVarAssignment_0 )
            // InternalBSharp.g:5713:3: rule__VariableTyping__TypeVarAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__VariableTyping__TypeVarAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableTypingAccess().getTypeVarAssignment_0()); 
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
    // $ANTLR end "rule__VariableTyping__Group__0__Impl"


    // $ANTLR start "rule__VariableTyping__Group__1"
    // InternalBSharp.g:5721:1: rule__VariableTyping__Group__1 : rule__VariableTyping__Group__1__Impl rule__VariableTyping__Group__2 ;
    public final void rule__VariableTyping__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5725:1: ( rule__VariableTyping__Group__1__Impl rule__VariableTyping__Group__2 )
            // InternalBSharp.g:5726:2: rule__VariableTyping__Group__1__Impl rule__VariableTyping__Group__2
            {
            pushFollow(FOLLOW_46);
            rule__VariableTyping__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__VariableTyping__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:5733:1: rule__VariableTyping__Group__1__Impl : ( ( rule__VariableTyping__Group_1__0 )* ) ;
    public final void rule__VariableTyping__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5737:1: ( ( ( rule__VariableTyping__Group_1__0 )* ) )
            // InternalBSharp.g:5738:1: ( ( rule__VariableTyping__Group_1__0 )* )
            {
            // InternalBSharp.g:5738:1: ( ( rule__VariableTyping__Group_1__0 )* )
            // InternalBSharp.g:5739:2: ( rule__VariableTyping__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableTypingAccess().getGroup_1()); 
            }
            // InternalBSharp.g:5740:2: ( rule__VariableTyping__Group_1__0 )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==49) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // InternalBSharp.g:5740:3: rule__VariableTyping__Group_1__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__VariableTyping__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableTypingAccess().getGroup_1()); 
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
    // $ANTLR end "rule__VariableTyping__Group__1__Impl"


    // $ANTLR start "rule__VariableTyping__Group__2"
    // InternalBSharp.g:5748:1: rule__VariableTyping__Group__2 : rule__VariableTyping__Group__2__Impl rule__VariableTyping__Group__3 ;
    public final void rule__VariableTyping__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5752:1: ( rule__VariableTyping__Group__2__Impl rule__VariableTyping__Group__3 )
            // InternalBSharp.g:5753:2: rule__VariableTyping__Group__2__Impl rule__VariableTyping__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__VariableTyping__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__VariableTyping__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:5760:1: rule__VariableTyping__Group__2__Impl : ( ':' ) ;
    public final void rule__VariableTyping__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5764:1: ( ( ':' ) )
            // InternalBSharp.g:5765:1: ( ':' )
            {
            // InternalBSharp.g:5765:1: ( ':' )
            // InternalBSharp.g:5766:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableTypingAccess().getColonKeyword_2()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableTypingAccess().getColonKeyword_2()); 
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
    // $ANTLR end "rule__VariableTyping__Group__2__Impl"


    // $ANTLR start "rule__VariableTyping__Group__3"
    // InternalBSharp.g:5775:1: rule__VariableTyping__Group__3 : rule__VariableTyping__Group__3__Impl ;
    public final void rule__VariableTyping__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5779:1: ( rule__VariableTyping__Group__3__Impl )
            // InternalBSharp.g:5780:2: rule__VariableTyping__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VariableTyping__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:5786:1: rule__VariableTyping__Group__3__Impl : ( ( rule__VariableTyping__TypeAssignment_3 ) ) ;
    public final void rule__VariableTyping__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5790:1: ( ( ( rule__VariableTyping__TypeAssignment_3 ) ) )
            // InternalBSharp.g:5791:1: ( ( rule__VariableTyping__TypeAssignment_3 ) )
            {
            // InternalBSharp.g:5791:1: ( ( rule__VariableTyping__TypeAssignment_3 ) )
            // InternalBSharp.g:5792:2: ( rule__VariableTyping__TypeAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableTypingAccess().getTypeAssignment_3()); 
            }
            // InternalBSharp.g:5793:2: ( rule__VariableTyping__TypeAssignment_3 )
            // InternalBSharp.g:5793:3: rule__VariableTyping__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__VariableTyping__TypeAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableTypingAccess().getTypeAssignment_3()); 
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
    // $ANTLR end "rule__VariableTyping__Group__3__Impl"


    // $ANTLR start "rule__VariableTyping__Group_1__0"
    // InternalBSharp.g:5802:1: rule__VariableTyping__Group_1__0 : rule__VariableTyping__Group_1__0__Impl rule__VariableTyping__Group_1__1 ;
    public final void rule__VariableTyping__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5806:1: ( rule__VariableTyping__Group_1__0__Impl rule__VariableTyping__Group_1__1 )
            // InternalBSharp.g:5807:2: rule__VariableTyping__Group_1__0__Impl rule__VariableTyping__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__VariableTyping__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__VariableTyping__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:5814:1: rule__VariableTyping__Group_1__0__Impl : ( ',' ) ;
    public final void rule__VariableTyping__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5818:1: ( ( ',' ) )
            // InternalBSharp.g:5819:1: ( ',' )
            {
            // InternalBSharp.g:5819:1: ( ',' )
            // InternalBSharp.g:5820:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableTypingAccess().getCommaKeyword_1_0()); 
            }
            match(input,49,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableTypingAccess().getCommaKeyword_1_0()); 
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
    // $ANTLR end "rule__VariableTyping__Group_1__0__Impl"


    // $ANTLR start "rule__VariableTyping__Group_1__1"
    // InternalBSharp.g:5829:1: rule__VariableTyping__Group_1__1 : rule__VariableTyping__Group_1__1__Impl ;
    public final void rule__VariableTyping__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5833:1: ( rule__VariableTyping__Group_1__1__Impl )
            // InternalBSharp.g:5834:2: rule__VariableTyping__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VariableTyping__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:5840:1: rule__VariableTyping__Group_1__1__Impl : ( ( rule__VariableTyping__TypeVarAssignment_1_1 ) ) ;
    public final void rule__VariableTyping__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5844:1: ( ( ( rule__VariableTyping__TypeVarAssignment_1_1 ) ) )
            // InternalBSharp.g:5845:1: ( ( rule__VariableTyping__TypeVarAssignment_1_1 ) )
            {
            // InternalBSharp.g:5845:1: ( ( rule__VariableTyping__TypeVarAssignment_1_1 ) )
            // InternalBSharp.g:5846:2: ( rule__VariableTyping__TypeVarAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableTypingAccess().getTypeVarAssignment_1_1()); 
            }
            // InternalBSharp.g:5847:2: ( rule__VariableTyping__TypeVarAssignment_1_1 )
            // InternalBSharp.g:5847:3: rule__VariableTyping__TypeVarAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__VariableTyping__TypeVarAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableTypingAccess().getTypeVarAssignment_1_1()); 
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
    // $ANTLR end "rule__VariableTyping__Group_1__1__Impl"


    // $ANTLR start "rule__Lambda__Group__0"
    // InternalBSharp.g:5856:1: rule__Lambda__Group__0 : rule__Lambda__Group__0__Impl rule__Lambda__Group__1 ;
    public final void rule__Lambda__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5860:1: ( rule__Lambda__Group__0__Impl rule__Lambda__Group__1 )
            // InternalBSharp.g:5861:2: rule__Lambda__Group__0__Impl rule__Lambda__Group__1
            {
            pushFollow(FOLLOW_47);
            rule__Lambda__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Lambda__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:5868:1: rule__Lambda__Group__0__Impl : ( ( rule__Lambda__QTypeAssignment_0 ) ) ;
    public final void rule__Lambda__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5872:1: ( ( ( rule__Lambda__QTypeAssignment_0 ) ) )
            // InternalBSharp.g:5873:1: ( ( rule__Lambda__QTypeAssignment_0 ) )
            {
            // InternalBSharp.g:5873:1: ( ( rule__Lambda__QTypeAssignment_0 ) )
            // InternalBSharp.g:5874:2: ( rule__Lambda__QTypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLambdaAccess().getQTypeAssignment_0()); 
            }
            // InternalBSharp.g:5875:2: ( rule__Lambda__QTypeAssignment_0 )
            // InternalBSharp.g:5875:3: rule__Lambda__QTypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Lambda__QTypeAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLambdaAccess().getQTypeAssignment_0()); 
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
    // $ANTLR end "rule__Lambda__Group__0__Impl"


    // $ANTLR start "rule__Lambda__Group__1"
    // InternalBSharp.g:5883:1: rule__Lambda__Group__1 : rule__Lambda__Group__1__Impl rule__Lambda__Group__2 ;
    public final void rule__Lambda__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5887:1: ( rule__Lambda__Group__1__Impl rule__Lambda__Group__2 )
            // InternalBSharp.g:5888:2: rule__Lambda__Group__1__Impl rule__Lambda__Group__2
            {
            pushFollow(FOLLOW_47);
            rule__Lambda__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Lambda__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:5895:1: rule__Lambda__Group__1__Impl : ( ( rule__Lambda__ContextAssignment_1 )? ) ;
    public final void rule__Lambda__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5899:1: ( ( ( rule__Lambda__ContextAssignment_1 )? ) )
            // InternalBSharp.g:5900:1: ( ( rule__Lambda__ContextAssignment_1 )? )
            {
            // InternalBSharp.g:5900:1: ( ( rule__Lambda__ContextAssignment_1 )? )
            // InternalBSharp.g:5901:2: ( rule__Lambda__ContextAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLambdaAccess().getContextAssignment_1()); 
            }
            // InternalBSharp.g:5902:2: ( rule__Lambda__ContextAssignment_1 )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==47) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalBSharp.g:5902:3: rule__Lambda__ContextAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Lambda__ContextAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLambdaAccess().getContextAssignment_1()); 
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
    // $ANTLR end "rule__Lambda__Group__1__Impl"


    // $ANTLR start "rule__Lambda__Group__2"
    // InternalBSharp.g:5910:1: rule__Lambda__Group__2 : rule__Lambda__Group__2__Impl rule__Lambda__Group__3 ;
    public final void rule__Lambda__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5914:1: ( rule__Lambda__Group__2__Impl rule__Lambda__Group__3 )
            // InternalBSharp.g:5915:2: rule__Lambda__Group__2__Impl rule__Lambda__Group__3
            {
            pushFollow(FOLLOW_39);
            rule__Lambda__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Lambda__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:5922:1: rule__Lambda__Group__2__Impl : ( ( rule__Lambda__VarListAssignment_2 ) ) ;
    public final void rule__Lambda__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5926:1: ( ( ( rule__Lambda__VarListAssignment_2 ) ) )
            // InternalBSharp.g:5927:1: ( ( rule__Lambda__VarListAssignment_2 ) )
            {
            // InternalBSharp.g:5927:1: ( ( rule__Lambda__VarListAssignment_2 ) )
            // InternalBSharp.g:5928:2: ( rule__Lambda__VarListAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLambdaAccess().getVarListAssignment_2()); 
            }
            // InternalBSharp.g:5929:2: ( rule__Lambda__VarListAssignment_2 )
            // InternalBSharp.g:5929:3: rule__Lambda__VarListAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Lambda__VarListAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLambdaAccess().getVarListAssignment_2()); 
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
    // $ANTLR end "rule__Lambda__Group__2__Impl"


    // $ANTLR start "rule__Lambda__Group__3"
    // InternalBSharp.g:5937:1: rule__Lambda__Group__3 : rule__Lambda__Group__3__Impl rule__Lambda__Group__4 ;
    public final void rule__Lambda__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5941:1: ( rule__Lambda__Group__3__Impl rule__Lambda__Group__4 )
            // InternalBSharp.g:5942:2: rule__Lambda__Group__3__Impl rule__Lambda__Group__4
            {
            pushFollow(FOLLOW_28);
            rule__Lambda__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Lambda__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:5949:1: rule__Lambda__Group__3__Impl : ( '|' ) ;
    public final void rule__Lambda__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5953:1: ( ( '|' ) )
            // InternalBSharp.g:5954:1: ( '|' )
            {
            // InternalBSharp.g:5954:1: ( '|' )
            // InternalBSharp.g:5955:2: '|'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLambdaAccess().getVerticalLineKeyword_3()); 
            }
            match(input,53,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLambdaAccess().getVerticalLineKeyword_3()); 
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
    // $ANTLR end "rule__Lambda__Group__3__Impl"


    // $ANTLR start "rule__Lambda__Group__4"
    // InternalBSharp.g:5964:1: rule__Lambda__Group__4 : rule__Lambda__Group__4__Impl ;
    public final void rule__Lambda__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5968:1: ( rule__Lambda__Group__4__Impl )
            // InternalBSharp.g:5969:2: rule__Lambda__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Lambda__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:5975:1: rule__Lambda__Group__4__Impl : ( ( rule__Lambda__ExprAssignment_4 ) ) ;
    public final void rule__Lambda__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5979:1: ( ( ( rule__Lambda__ExprAssignment_4 ) ) )
            // InternalBSharp.g:5980:1: ( ( rule__Lambda__ExprAssignment_4 ) )
            {
            // InternalBSharp.g:5980:1: ( ( rule__Lambda__ExprAssignment_4 ) )
            // InternalBSharp.g:5981:2: ( rule__Lambda__ExprAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLambdaAccess().getExprAssignment_4()); 
            }
            // InternalBSharp.g:5982:2: ( rule__Lambda__ExprAssignment_4 )
            // InternalBSharp.g:5982:3: rule__Lambda__ExprAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Lambda__ExprAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLambdaAccess().getExprAssignment_4()); 
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
    // $ANTLR end "rule__Lambda__Group__4__Impl"


    // $ANTLR start "rule__Quantifier__Group__0"
    // InternalBSharp.g:5991:1: rule__Quantifier__Group__0 : rule__Quantifier__Group__0__Impl rule__Quantifier__Group__1 ;
    public final void rule__Quantifier__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5995:1: ( rule__Quantifier__Group__0__Impl rule__Quantifier__Group__1 )
            // InternalBSharp.g:5996:2: rule__Quantifier__Group__0__Impl rule__Quantifier__Group__1
            {
            pushFollow(FOLLOW_47);
            rule__Quantifier__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Quantifier__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:6003:1: rule__Quantifier__Group__0__Impl : ( ( rule__Quantifier__QTypeAssignment_0 ) ) ;
    public final void rule__Quantifier__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6007:1: ( ( ( rule__Quantifier__QTypeAssignment_0 ) ) )
            // InternalBSharp.g:6008:1: ( ( rule__Quantifier__QTypeAssignment_0 ) )
            {
            // InternalBSharp.g:6008:1: ( ( rule__Quantifier__QTypeAssignment_0 ) )
            // InternalBSharp.g:6009:2: ( rule__Quantifier__QTypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuantifierAccess().getQTypeAssignment_0()); 
            }
            // InternalBSharp.g:6010:2: ( rule__Quantifier__QTypeAssignment_0 )
            // InternalBSharp.g:6010:3: rule__Quantifier__QTypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Quantifier__QTypeAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQuantifierAccess().getQTypeAssignment_0()); 
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
    // $ANTLR end "rule__Quantifier__Group__0__Impl"


    // $ANTLR start "rule__Quantifier__Group__1"
    // InternalBSharp.g:6018:1: rule__Quantifier__Group__1 : rule__Quantifier__Group__1__Impl rule__Quantifier__Group__2 ;
    public final void rule__Quantifier__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6022:1: ( rule__Quantifier__Group__1__Impl rule__Quantifier__Group__2 )
            // InternalBSharp.g:6023:2: rule__Quantifier__Group__1__Impl rule__Quantifier__Group__2
            {
            pushFollow(FOLLOW_47);
            rule__Quantifier__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Quantifier__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:6030:1: rule__Quantifier__Group__1__Impl : ( ( rule__Quantifier__ContextAssignment_1 )? ) ;
    public final void rule__Quantifier__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6034:1: ( ( ( rule__Quantifier__ContextAssignment_1 )? ) )
            // InternalBSharp.g:6035:1: ( ( rule__Quantifier__ContextAssignment_1 )? )
            {
            // InternalBSharp.g:6035:1: ( ( rule__Quantifier__ContextAssignment_1 )? )
            // InternalBSharp.g:6036:2: ( rule__Quantifier__ContextAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuantifierAccess().getContextAssignment_1()); 
            }
            // InternalBSharp.g:6037:2: ( rule__Quantifier__ContextAssignment_1 )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==47) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalBSharp.g:6037:3: rule__Quantifier__ContextAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Quantifier__ContextAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQuantifierAccess().getContextAssignment_1()); 
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
    // $ANTLR end "rule__Quantifier__Group__1__Impl"


    // $ANTLR start "rule__Quantifier__Group__2"
    // InternalBSharp.g:6045:1: rule__Quantifier__Group__2 : rule__Quantifier__Group__2__Impl rule__Quantifier__Group__3 ;
    public final void rule__Quantifier__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6049:1: ( rule__Quantifier__Group__2__Impl rule__Quantifier__Group__3 )
            // InternalBSharp.g:6050:2: rule__Quantifier__Group__2__Impl rule__Quantifier__Group__3
            {
            pushFollow(FOLLOW_48);
            rule__Quantifier__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Quantifier__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:6057:1: rule__Quantifier__Group__2__Impl : ( ( rule__Quantifier__VarListAssignment_2 ) ) ;
    public final void rule__Quantifier__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6061:1: ( ( ( rule__Quantifier__VarListAssignment_2 ) ) )
            // InternalBSharp.g:6062:1: ( ( rule__Quantifier__VarListAssignment_2 ) )
            {
            // InternalBSharp.g:6062:1: ( ( rule__Quantifier__VarListAssignment_2 ) )
            // InternalBSharp.g:6063:2: ( rule__Quantifier__VarListAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuantifierAccess().getVarListAssignment_2()); 
            }
            // InternalBSharp.g:6064:2: ( rule__Quantifier__VarListAssignment_2 )
            // InternalBSharp.g:6064:3: rule__Quantifier__VarListAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Quantifier__VarListAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQuantifierAccess().getVarListAssignment_2()); 
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
    // $ANTLR end "rule__Quantifier__Group__2__Impl"


    // $ANTLR start "rule__Quantifier__Group__3"
    // InternalBSharp.g:6072:1: rule__Quantifier__Group__3 : rule__Quantifier__Group__3__Impl rule__Quantifier__Group__4 ;
    public final void rule__Quantifier__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6076:1: ( rule__Quantifier__Group__3__Impl rule__Quantifier__Group__4 )
            // InternalBSharp.g:6077:2: rule__Quantifier__Group__3__Impl rule__Quantifier__Group__4
            {
            pushFollow(FOLLOW_28);
            rule__Quantifier__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Quantifier__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:6084:1: rule__Quantifier__Group__3__Impl : ( '\\u00B7' ) ;
    public final void rule__Quantifier__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6088:1: ( ( '\\u00B7' ) )
            // InternalBSharp.g:6089:1: ( '\\u00B7' )
            {
            // InternalBSharp.g:6089:1: ( '\\u00B7' )
            // InternalBSharp.g:6090:2: '\\u00B7'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuantifierAccess().getMiddleDotKeyword_3()); 
            }
            match(input,59,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQuantifierAccess().getMiddleDotKeyword_3()); 
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
    // $ANTLR end "rule__Quantifier__Group__3__Impl"


    // $ANTLR start "rule__Quantifier__Group__4"
    // InternalBSharp.g:6099:1: rule__Quantifier__Group__4 : rule__Quantifier__Group__4__Impl ;
    public final void rule__Quantifier__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6103:1: ( rule__Quantifier__Group__4__Impl )
            // InternalBSharp.g:6104:2: rule__Quantifier__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Quantifier__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:6110:1: rule__Quantifier__Group__4__Impl : ( ( rule__Quantifier__ExprAssignment_4 ) ) ;
    public final void rule__Quantifier__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6114:1: ( ( ( rule__Quantifier__ExprAssignment_4 ) ) )
            // InternalBSharp.g:6115:1: ( ( rule__Quantifier__ExprAssignment_4 ) )
            {
            // InternalBSharp.g:6115:1: ( ( rule__Quantifier__ExprAssignment_4 ) )
            // InternalBSharp.g:6116:2: ( rule__Quantifier__ExprAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuantifierAccess().getExprAssignment_4()); 
            }
            // InternalBSharp.g:6117:2: ( rule__Quantifier__ExprAssignment_4 )
            // InternalBSharp.g:6117:3: rule__Quantifier__ExprAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Quantifier__ExprAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQuantifierAccess().getExprAssignment_4()); 
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
    // $ANTLR end "rule__Quantifier__Group__4__Impl"


    // $ANTLR start "rule__Prefix__Group__0"
    // InternalBSharp.g:6126:1: rule__Prefix__Group__0 : rule__Prefix__Group__0__Impl rule__Prefix__Group__1 ;
    public final void rule__Prefix__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6130:1: ( rule__Prefix__Group__0__Impl rule__Prefix__Group__1 )
            // InternalBSharp.g:6131:2: rule__Prefix__Group__0__Impl rule__Prefix__Group__1
            {
            pushFollow(FOLLOW_49);
            rule__Prefix__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Prefix__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:6138:1: rule__Prefix__Group__0__Impl : ( ( rule__Prefix__NameAssignment_0 ) ) ;
    public final void rule__Prefix__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6142:1: ( ( ( rule__Prefix__NameAssignment_0 ) ) )
            // InternalBSharp.g:6143:1: ( ( rule__Prefix__NameAssignment_0 ) )
            {
            // InternalBSharp.g:6143:1: ( ( rule__Prefix__NameAssignment_0 ) )
            // InternalBSharp.g:6144:2: ( rule__Prefix__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrefixAccess().getNameAssignment_0()); 
            }
            // InternalBSharp.g:6145:2: ( rule__Prefix__NameAssignment_0 )
            // InternalBSharp.g:6145:3: rule__Prefix__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Prefix__NameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrefixAccess().getNameAssignment_0()); 
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
    // $ANTLR end "rule__Prefix__Group__0__Impl"


    // $ANTLR start "rule__Prefix__Group__1"
    // InternalBSharp.g:6153:1: rule__Prefix__Group__1 : rule__Prefix__Group__1__Impl ;
    public final void rule__Prefix__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6157:1: ( rule__Prefix__Group__1__Impl )
            // InternalBSharp.g:6158:2: rule__Prefix__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Prefix__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:6164:1: rule__Prefix__Group__1__Impl : ( ( rule__Prefix__ElemAssignment_1 ) ) ;
    public final void rule__Prefix__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6168:1: ( ( ( rule__Prefix__ElemAssignment_1 ) ) )
            // InternalBSharp.g:6169:1: ( ( rule__Prefix__ElemAssignment_1 ) )
            {
            // InternalBSharp.g:6169:1: ( ( rule__Prefix__ElemAssignment_1 ) )
            // InternalBSharp.g:6170:2: ( rule__Prefix__ElemAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrefixAccess().getElemAssignment_1()); 
            }
            // InternalBSharp.g:6171:2: ( rule__Prefix__ElemAssignment_1 )
            // InternalBSharp.g:6171:3: rule__Prefix__ElemAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Prefix__ElemAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrefixAccess().getElemAssignment_1()); 
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
    // $ANTLR end "rule__Prefix__Group__1__Impl"


    // $ANTLR start "rule__Infix__Group__0"
    // InternalBSharp.g:6180:1: rule__Infix__Group__0 : rule__Infix__Group__0__Impl rule__Infix__Group__1 ;
    public final void rule__Infix__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6184:1: ( rule__Infix__Group__0__Impl rule__Infix__Group__1 )
            // InternalBSharp.g:6185:2: rule__Infix__Group__0__Impl rule__Infix__Group__1
            {
            pushFollow(FOLLOW_50);
            rule__Infix__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Infix__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:6192:1: rule__Infix__Group__0__Impl : ( ruleElement ) ;
    public final void rule__Infix__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6196:1: ( ( ruleElement ) )
            // InternalBSharp.g:6197:1: ( ruleElement )
            {
            // InternalBSharp.g:6197:1: ( ruleElement )
            // InternalBSharp.g:6198:2: ruleElement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInfixAccess().getElementParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInfixAccess().getElementParserRuleCall_0()); 
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
    // $ANTLR end "rule__Infix__Group__0__Impl"


    // $ANTLR start "rule__Infix__Group__1"
    // InternalBSharp.g:6207:1: rule__Infix__Group__1 : rule__Infix__Group__1__Impl ;
    public final void rule__Infix__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6211:1: ( rule__Infix__Group__1__Impl )
            // InternalBSharp.g:6212:2: rule__Infix__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Infix__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:6218:1: rule__Infix__Group__1__Impl : ( ( rule__Infix__Group_1__0 )* ) ;
    public final void rule__Infix__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6222:1: ( ( ( rule__Infix__Group_1__0 )* ) )
            // InternalBSharp.g:6223:1: ( ( rule__Infix__Group_1__0 )* )
            {
            // InternalBSharp.g:6223:1: ( ( rule__Infix__Group_1__0 )* )
            // InternalBSharp.g:6224:2: ( rule__Infix__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInfixAccess().getGroup_1()); 
            }
            // InternalBSharp.g:6225:2: ( rule__Infix__Group_1__0 )*
            loop56:
            do {
                int alt56=2;
                alt56 = dfa56.predict(input);
                switch (alt56) {
            	case 1 :
            	    // InternalBSharp.g:6225:3: rule__Infix__Group_1__0
            	    {
            	    pushFollow(FOLLOW_51);
            	    rule__Infix__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop56;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInfixAccess().getGroup_1()); 
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
    // $ANTLR end "rule__Infix__Group__1__Impl"


    // $ANTLR start "rule__Infix__Group_1__0"
    // InternalBSharp.g:6234:1: rule__Infix__Group_1__0 : rule__Infix__Group_1__0__Impl rule__Infix__Group_1__1 ;
    public final void rule__Infix__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6238:1: ( rule__Infix__Group_1__0__Impl rule__Infix__Group_1__1 )
            // InternalBSharp.g:6239:2: rule__Infix__Group_1__0__Impl rule__Infix__Group_1__1
            {
            pushFollow(FOLLOW_50);
            rule__Infix__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Infix__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:6246:1: rule__Infix__Group_1__0__Impl : ( () ) ;
    public final void rule__Infix__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6250:1: ( ( () ) )
            // InternalBSharp.g:6251:1: ( () )
            {
            // InternalBSharp.g:6251:1: ( () )
            // InternalBSharp.g:6252:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInfixAccess().getInfixLeftAction_1_0()); 
            }
            // InternalBSharp.g:6253:2: ()
            // InternalBSharp.g:6253:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInfixAccess().getInfixLeftAction_1_0()); 
            }

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
    // InternalBSharp.g:6261:1: rule__Infix__Group_1__1 : rule__Infix__Group_1__1__Impl rule__Infix__Group_1__2 ;
    public final void rule__Infix__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6265:1: ( rule__Infix__Group_1__1__Impl rule__Infix__Group_1__2 )
            // InternalBSharp.g:6266:2: rule__Infix__Group_1__1__Impl rule__Infix__Group_1__2
            {
            pushFollow(FOLLOW_49);
            rule__Infix__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Infix__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:6273:1: rule__Infix__Group_1__1__Impl : ( ( rule__Infix__Alternatives_1_1 ) ) ;
    public final void rule__Infix__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6277:1: ( ( ( rule__Infix__Alternatives_1_1 ) ) )
            // InternalBSharp.g:6278:1: ( ( rule__Infix__Alternatives_1_1 ) )
            {
            // InternalBSharp.g:6278:1: ( ( rule__Infix__Alternatives_1_1 ) )
            // InternalBSharp.g:6279:2: ( rule__Infix__Alternatives_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInfixAccess().getAlternatives_1_1()); 
            }
            // InternalBSharp.g:6280:2: ( rule__Infix__Alternatives_1_1 )
            // InternalBSharp.g:6280:3: rule__Infix__Alternatives_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Infix__Alternatives_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInfixAccess().getAlternatives_1_1()); 
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
    // $ANTLR end "rule__Infix__Group_1__1__Impl"


    // $ANTLR start "rule__Infix__Group_1__2"
    // InternalBSharp.g:6288:1: rule__Infix__Group_1__2 : rule__Infix__Group_1__2__Impl ;
    public final void rule__Infix__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6292:1: ( rule__Infix__Group_1__2__Impl )
            // InternalBSharp.g:6293:2: rule__Infix__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Infix__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:6299:1: rule__Infix__Group_1__2__Impl : ( ( rule__Infix__RightAssignment_1_2 ) ) ;
    public final void rule__Infix__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6303:1: ( ( ( rule__Infix__RightAssignment_1_2 ) ) )
            // InternalBSharp.g:6304:1: ( ( rule__Infix__RightAssignment_1_2 ) )
            {
            // InternalBSharp.g:6304:1: ( ( rule__Infix__RightAssignment_1_2 ) )
            // InternalBSharp.g:6305:2: ( rule__Infix__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInfixAccess().getRightAssignment_1_2()); 
            }
            // InternalBSharp.g:6306:2: ( rule__Infix__RightAssignment_1_2 )
            // InternalBSharp.g:6306:3: rule__Infix__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Infix__RightAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInfixAccess().getRightAssignment_1_2()); 
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
    // $ANTLR end "rule__Infix__Group_1__2__Impl"


    // $ANTLR start "rule__Tuple__Group__0"
    // InternalBSharp.g:6315:1: rule__Tuple__Group__0 : rule__Tuple__Group__0__Impl rule__Tuple__Group__1 ;
    public final void rule__Tuple__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6319:1: ( rule__Tuple__Group__0__Impl rule__Tuple__Group__1 )
            // InternalBSharp.g:6320:2: rule__Tuple__Group__0__Impl rule__Tuple__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__Tuple__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Tuple__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tuple__Group__0"


    // $ANTLR start "rule__Tuple__Group__0__Impl"
    // InternalBSharp.g:6327:1: rule__Tuple__Group__0__Impl : ( '(' ) ;
    public final void rule__Tuple__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6331:1: ( ( '(' ) )
            // InternalBSharp.g:6332:1: ( '(' )
            {
            // InternalBSharp.g:6332:1: ( '(' )
            // InternalBSharp.g:6333:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTupleAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,45,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTupleAccess().getLeftParenthesisKeyword_0()); 
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
    // $ANTLR end "rule__Tuple__Group__0__Impl"


    // $ANTLR start "rule__Tuple__Group__1"
    // InternalBSharp.g:6342:1: rule__Tuple__Group__1 : rule__Tuple__Group__1__Impl rule__Tuple__Group__2 ;
    public final void rule__Tuple__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6346:1: ( rule__Tuple__Group__1__Impl rule__Tuple__Group__2 )
            // InternalBSharp.g:6347:2: rule__Tuple__Group__1__Impl rule__Tuple__Group__2
            {
            pushFollow(FOLLOW_43);
            rule__Tuple__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Tuple__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tuple__Group__1"


    // $ANTLR start "rule__Tuple__Group__1__Impl"
    // InternalBSharp.g:6354:1: rule__Tuple__Group__1__Impl : ( ( rule__Tuple__ElementsAssignment_1 ) ) ;
    public final void rule__Tuple__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6358:1: ( ( ( rule__Tuple__ElementsAssignment_1 ) ) )
            // InternalBSharp.g:6359:1: ( ( rule__Tuple__ElementsAssignment_1 ) )
            {
            // InternalBSharp.g:6359:1: ( ( rule__Tuple__ElementsAssignment_1 ) )
            // InternalBSharp.g:6360:2: ( rule__Tuple__ElementsAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTupleAccess().getElementsAssignment_1()); 
            }
            // InternalBSharp.g:6361:2: ( rule__Tuple__ElementsAssignment_1 )
            // InternalBSharp.g:6361:3: rule__Tuple__ElementsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Tuple__ElementsAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTupleAccess().getElementsAssignment_1()); 
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
    // $ANTLR end "rule__Tuple__Group__1__Impl"


    // $ANTLR start "rule__Tuple__Group__2"
    // InternalBSharp.g:6369:1: rule__Tuple__Group__2 : rule__Tuple__Group__2__Impl rule__Tuple__Group__3 ;
    public final void rule__Tuple__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6373:1: ( rule__Tuple__Group__2__Impl rule__Tuple__Group__3 )
            // InternalBSharp.g:6374:2: rule__Tuple__Group__2__Impl rule__Tuple__Group__3
            {
            pushFollow(FOLLOW_43);
            rule__Tuple__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Tuple__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tuple__Group__2"


    // $ANTLR start "rule__Tuple__Group__2__Impl"
    // InternalBSharp.g:6381:1: rule__Tuple__Group__2__Impl : ( ( rule__Tuple__Group_2__0 )* ) ;
    public final void rule__Tuple__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6385:1: ( ( ( rule__Tuple__Group_2__0 )* ) )
            // InternalBSharp.g:6386:1: ( ( rule__Tuple__Group_2__0 )* )
            {
            // InternalBSharp.g:6386:1: ( ( rule__Tuple__Group_2__0 )* )
            // InternalBSharp.g:6387:2: ( rule__Tuple__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTupleAccess().getGroup_2()); 
            }
            // InternalBSharp.g:6388:2: ( rule__Tuple__Group_2__0 )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==49) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // InternalBSharp.g:6388:3: rule__Tuple__Group_2__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__Tuple__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop57;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTupleAccess().getGroup_2()); 
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
    // $ANTLR end "rule__Tuple__Group__2__Impl"


    // $ANTLR start "rule__Tuple__Group__3"
    // InternalBSharp.g:6396:1: rule__Tuple__Group__3 : rule__Tuple__Group__3__Impl ;
    public final void rule__Tuple__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6400:1: ( rule__Tuple__Group__3__Impl )
            // InternalBSharp.g:6401:2: rule__Tuple__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Tuple__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tuple__Group__3"


    // $ANTLR start "rule__Tuple__Group__3__Impl"
    // InternalBSharp.g:6407:1: rule__Tuple__Group__3__Impl : ( ')' ) ;
    public final void rule__Tuple__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6411:1: ( ( ')' ) )
            // InternalBSharp.g:6412:1: ( ')' )
            {
            // InternalBSharp.g:6412:1: ( ')' )
            // InternalBSharp.g:6413:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTupleAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,46,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTupleAccess().getRightParenthesisKeyword_3()); 
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
    // $ANTLR end "rule__Tuple__Group__3__Impl"


    // $ANTLR start "rule__Tuple__Group_2__0"
    // InternalBSharp.g:6423:1: rule__Tuple__Group_2__0 : rule__Tuple__Group_2__0__Impl rule__Tuple__Group_2__1 ;
    public final void rule__Tuple__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6427:1: ( rule__Tuple__Group_2__0__Impl rule__Tuple__Group_2__1 )
            // InternalBSharp.g:6428:2: rule__Tuple__Group_2__0__Impl rule__Tuple__Group_2__1
            {
            pushFollow(FOLLOW_28);
            rule__Tuple__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Tuple__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tuple__Group_2__0"


    // $ANTLR start "rule__Tuple__Group_2__0__Impl"
    // InternalBSharp.g:6435:1: rule__Tuple__Group_2__0__Impl : ( ',' ) ;
    public final void rule__Tuple__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6439:1: ( ( ',' ) )
            // InternalBSharp.g:6440:1: ( ',' )
            {
            // InternalBSharp.g:6440:1: ( ',' )
            // InternalBSharp.g:6441:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTupleAccess().getCommaKeyword_2_0()); 
            }
            match(input,49,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTupleAccess().getCommaKeyword_2_0()); 
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
    // $ANTLR end "rule__Tuple__Group_2__0__Impl"


    // $ANTLR start "rule__Tuple__Group_2__1"
    // InternalBSharp.g:6450:1: rule__Tuple__Group_2__1 : rule__Tuple__Group_2__1__Impl ;
    public final void rule__Tuple__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6454:1: ( rule__Tuple__Group_2__1__Impl )
            // InternalBSharp.g:6455:2: rule__Tuple__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Tuple__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tuple__Group_2__1"


    // $ANTLR start "rule__Tuple__Group_2__1__Impl"
    // InternalBSharp.g:6461:1: rule__Tuple__Group_2__1__Impl : ( ( rule__Tuple__ElementsAssignment_2_1 ) ) ;
    public final void rule__Tuple__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6465:1: ( ( ( rule__Tuple__ElementsAssignment_2_1 ) ) )
            // InternalBSharp.g:6466:1: ( ( rule__Tuple__ElementsAssignment_2_1 ) )
            {
            // InternalBSharp.g:6466:1: ( ( rule__Tuple__ElementsAssignment_2_1 ) )
            // InternalBSharp.g:6467:2: ( rule__Tuple__ElementsAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTupleAccess().getElementsAssignment_2_1()); 
            }
            // InternalBSharp.g:6468:2: ( rule__Tuple__ElementsAssignment_2_1 )
            // InternalBSharp.g:6468:3: rule__Tuple__ElementsAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Tuple__ElementsAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTupleAccess().getElementsAssignment_2_1()); 
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
    // $ANTLR end "rule__Tuple__Group_2__1__Impl"


    // $ANTLR start "rule__FunctionCall__Group_1__0"
    // InternalBSharp.g:6477:1: rule__FunctionCall__Group_1__0 : rule__FunctionCall__Group_1__0__Impl rule__FunctionCall__Group_1__1 ;
    public final void rule__FunctionCall__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6481:1: ( rule__FunctionCall__Group_1__0__Impl rule__FunctionCall__Group_1__1 )
            // InternalBSharp.g:6482:2: rule__FunctionCall__Group_1__0__Impl rule__FunctionCall__Group_1__1
            {
            pushFollow(FOLLOW_26);
            rule__FunctionCall__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FunctionCall__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:6489:1: rule__FunctionCall__Group_1__0__Impl : ( ( rule__FunctionCall__Group_1_0__0 ) ) ;
    public final void rule__FunctionCall__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6493:1: ( ( ( rule__FunctionCall__Group_1_0__0 ) ) )
            // InternalBSharp.g:6494:1: ( ( rule__FunctionCall__Group_1_0__0 ) )
            {
            // InternalBSharp.g:6494:1: ( ( rule__FunctionCall__Group_1_0__0 ) )
            // InternalBSharp.g:6495:2: ( rule__FunctionCall__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getGroup_1_0()); 
            }
            // InternalBSharp.g:6496:2: ( rule__FunctionCall__Group_1_0__0 )
            // InternalBSharp.g:6496:3: rule__FunctionCall__Group_1_0__0
            {
            pushFollow(FOLLOW_2);
            rule__FunctionCall__Group_1_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionCallAccess().getGroup_1_0()); 
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
    // $ANTLR end "rule__FunctionCall__Group_1__0__Impl"


    // $ANTLR start "rule__FunctionCall__Group_1__1"
    // InternalBSharp.g:6504:1: rule__FunctionCall__Group_1__1 : rule__FunctionCall__Group_1__1__Impl ;
    public final void rule__FunctionCall__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6508:1: ( rule__FunctionCall__Group_1__1__Impl )
            // InternalBSharp.g:6509:2: rule__FunctionCall__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FunctionCall__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:6515:1: rule__FunctionCall__Group_1__1__Impl : ( ( rule__FunctionCall__FuncCallArgsAssignment_1_1 )* ) ;
    public final void rule__FunctionCall__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6519:1: ( ( ( rule__FunctionCall__FuncCallArgsAssignment_1_1 )* ) )
            // InternalBSharp.g:6520:1: ( ( rule__FunctionCall__FuncCallArgsAssignment_1_1 )* )
            {
            // InternalBSharp.g:6520:1: ( ( rule__FunctionCall__FuncCallArgsAssignment_1_1 )* )
            // InternalBSharp.g:6521:2: ( rule__FunctionCall__FuncCallArgsAssignment_1_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getFuncCallArgsAssignment_1_1()); 
            }
            // InternalBSharp.g:6522:2: ( rule__FunctionCall__FuncCallArgsAssignment_1_1 )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==45) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // InternalBSharp.g:6522:3: rule__FunctionCall__FuncCallArgsAssignment_1_1
            	    {
            	    pushFollow(FOLLOW_52);
            	    rule__FunctionCall__FuncCallArgsAssignment_1_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop58;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionCallAccess().getFuncCallArgsAssignment_1_1()); 
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
    // $ANTLR end "rule__FunctionCall__Group_1__1__Impl"


    // $ANTLR start "rule__FunctionCall__Group_1_0__0"
    // InternalBSharp.g:6531:1: rule__FunctionCall__Group_1_0__0 : rule__FunctionCall__Group_1_0__0__Impl rule__FunctionCall__Group_1_0__1 ;
    public final void rule__FunctionCall__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6535:1: ( rule__FunctionCall__Group_1_0__0__Impl rule__FunctionCall__Group_1_0__1 )
            // InternalBSharp.g:6536:2: rule__FunctionCall__Group_1_0__0__Impl rule__FunctionCall__Group_1_0__1
            {
            pushFollow(FOLLOW_53);
            rule__FunctionCall__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FunctionCall__Group_1_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group_1_0__0"


    // $ANTLR start "rule__FunctionCall__Group_1_0__0__Impl"
    // InternalBSharp.g:6543:1: rule__FunctionCall__Group_1_0__0__Impl : ( ( rule__FunctionCall__TypeInstAssignment_1_0_0 ) ) ;
    public final void rule__FunctionCall__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6547:1: ( ( ( rule__FunctionCall__TypeInstAssignment_1_0_0 ) ) )
            // InternalBSharp.g:6548:1: ( ( rule__FunctionCall__TypeInstAssignment_1_0_0 ) )
            {
            // InternalBSharp.g:6548:1: ( ( rule__FunctionCall__TypeInstAssignment_1_0_0 ) )
            // InternalBSharp.g:6549:2: ( rule__FunctionCall__TypeInstAssignment_1_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getTypeInstAssignment_1_0_0()); 
            }
            // InternalBSharp.g:6550:2: ( rule__FunctionCall__TypeInstAssignment_1_0_0 )
            // InternalBSharp.g:6550:3: rule__FunctionCall__TypeInstAssignment_1_0_0
            {
            pushFollow(FOLLOW_2);
            rule__FunctionCall__TypeInstAssignment_1_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionCallAccess().getTypeInstAssignment_1_0_0()); 
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
    // $ANTLR end "rule__FunctionCall__Group_1_0__0__Impl"


    // $ANTLR start "rule__FunctionCall__Group_1_0__1"
    // InternalBSharp.g:6558:1: rule__FunctionCall__Group_1_0__1 : rule__FunctionCall__Group_1_0__1__Impl rule__FunctionCall__Group_1_0__2 ;
    public final void rule__FunctionCall__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6562:1: ( rule__FunctionCall__Group_1_0__1__Impl rule__FunctionCall__Group_1_0__2 )
            // InternalBSharp.g:6563:2: rule__FunctionCall__Group_1_0__1__Impl rule__FunctionCall__Group_1_0__2
            {
            pushFollow(FOLLOW_53);
            rule__FunctionCall__Group_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FunctionCall__Group_1_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group_1_0__1"


    // $ANTLR start "rule__FunctionCall__Group_1_0__1__Impl"
    // InternalBSharp.g:6570:1: rule__FunctionCall__Group_1_0__1__Impl : ( ( rule__FunctionCall__Group_1_0_1__0 )? ) ;
    public final void rule__FunctionCall__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6574:1: ( ( ( rule__FunctionCall__Group_1_0_1__0 )? ) )
            // InternalBSharp.g:6575:1: ( ( rule__FunctionCall__Group_1_0_1__0 )? )
            {
            // InternalBSharp.g:6575:1: ( ( rule__FunctionCall__Group_1_0_1__0 )? )
            // InternalBSharp.g:6576:2: ( rule__FunctionCall__Group_1_0_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getGroup_1_0_1()); 
            }
            // InternalBSharp.g:6577:2: ( rule__FunctionCall__Group_1_0_1__0 )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==38) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalBSharp.g:6577:3: rule__FunctionCall__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FunctionCall__Group_1_0_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionCallAccess().getGroup_1_0_1()); 
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
    // $ANTLR end "rule__FunctionCall__Group_1_0__1__Impl"


    // $ANTLR start "rule__FunctionCall__Group_1_0__2"
    // InternalBSharp.g:6585:1: rule__FunctionCall__Group_1_0__2 : rule__FunctionCall__Group_1_0__2__Impl ;
    public final void rule__FunctionCall__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6589:1: ( rule__FunctionCall__Group_1_0__2__Impl )
            // InternalBSharp.g:6590:2: rule__FunctionCall__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FunctionCall__Group_1_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group_1_0__2"


    // $ANTLR start "rule__FunctionCall__Group_1_0__2__Impl"
    // InternalBSharp.g:6596:1: rule__FunctionCall__Group_1_0__2__Impl : ( ( rule__FunctionCall__ContextAssignment_1_0_2 )? ) ;
    public final void rule__FunctionCall__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6600:1: ( ( ( rule__FunctionCall__ContextAssignment_1_0_2 )? ) )
            // InternalBSharp.g:6601:1: ( ( rule__FunctionCall__ContextAssignment_1_0_2 )? )
            {
            // InternalBSharp.g:6601:1: ( ( rule__FunctionCall__ContextAssignment_1_0_2 )? )
            // InternalBSharp.g:6602:2: ( rule__FunctionCall__ContextAssignment_1_0_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getContextAssignment_1_0_2()); 
            }
            // InternalBSharp.g:6603:2: ( rule__FunctionCall__ContextAssignment_1_0_2 )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==47) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalBSharp.g:6603:3: rule__FunctionCall__ContextAssignment_1_0_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__FunctionCall__ContextAssignment_1_0_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionCallAccess().getContextAssignment_1_0_2()); 
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
    // $ANTLR end "rule__FunctionCall__Group_1_0__2__Impl"


    // $ANTLR start "rule__FunctionCall__Group_1_0_1__0"
    // InternalBSharp.g:6612:1: rule__FunctionCall__Group_1_0_1__0 : rule__FunctionCall__Group_1_0_1__0__Impl rule__FunctionCall__Group_1_0_1__1 ;
    public final void rule__FunctionCall__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6616:1: ( rule__FunctionCall__Group_1_0_1__0__Impl rule__FunctionCall__Group_1_0_1__1 )
            // InternalBSharp.g:6617:2: rule__FunctionCall__Group_1_0_1__0__Impl rule__FunctionCall__Group_1_0_1__1
            {
            pushFollow(FOLLOW_3);
            rule__FunctionCall__Group_1_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FunctionCall__Group_1_0_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group_1_0_1__0"


    // $ANTLR start "rule__FunctionCall__Group_1_0_1__0__Impl"
    // InternalBSharp.g:6624:1: rule__FunctionCall__Group_1_0_1__0__Impl : ( ( '.' ) ) ;
    public final void rule__FunctionCall__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6628:1: ( ( ( '.' ) ) )
            // InternalBSharp.g:6629:1: ( ( '.' ) )
            {
            // InternalBSharp.g:6629:1: ( ( '.' ) )
            // InternalBSharp.g:6630:2: ( '.' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getFullStopKeyword_1_0_1_0()); 
            }
            // InternalBSharp.g:6631:2: ( '.' )
            // InternalBSharp.g:6631:3: '.'
            {
            match(input,38,FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionCallAccess().getFullStopKeyword_1_0_1_0()); 
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
    // $ANTLR end "rule__FunctionCall__Group_1_0_1__0__Impl"


    // $ANTLR start "rule__FunctionCall__Group_1_0_1__1"
    // InternalBSharp.g:6639:1: rule__FunctionCall__Group_1_0_1__1 : rule__FunctionCall__Group_1_0_1__1__Impl ;
    public final void rule__FunctionCall__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6643:1: ( rule__FunctionCall__Group_1_0_1__1__Impl )
            // InternalBSharp.g:6644:2: rule__FunctionCall__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FunctionCall__Group_1_0_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group_1_0_1__1"


    // $ANTLR start "rule__FunctionCall__Group_1_0_1__1__Impl"
    // InternalBSharp.g:6650:1: rule__FunctionCall__Group_1_0_1__1__Impl : ( ( rule__FunctionCall__GetterAssignment_1_0_1_1 ) ) ;
    public final void rule__FunctionCall__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6654:1: ( ( ( rule__FunctionCall__GetterAssignment_1_0_1_1 ) ) )
            // InternalBSharp.g:6655:1: ( ( rule__FunctionCall__GetterAssignment_1_0_1_1 ) )
            {
            // InternalBSharp.g:6655:1: ( ( rule__FunctionCall__GetterAssignment_1_0_1_1 ) )
            // InternalBSharp.g:6656:2: ( rule__FunctionCall__GetterAssignment_1_0_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getGetterAssignment_1_0_1_1()); 
            }
            // InternalBSharp.g:6657:2: ( rule__FunctionCall__GetterAssignment_1_0_1_1 )
            // InternalBSharp.g:6657:3: rule__FunctionCall__GetterAssignment_1_0_1_1
            {
            pushFollow(FOLLOW_2);
            rule__FunctionCall__GetterAssignment_1_0_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionCallAccess().getGetterAssignment_1_0_1_1()); 
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
    // $ANTLR end "rule__FunctionCall__Group_1_0_1__1__Impl"


    // $ANTLR start "rule__FunctionCallInbuilt__Group__0"
    // InternalBSharp.g:6666:1: rule__FunctionCallInbuilt__Group__0 : rule__FunctionCallInbuilt__Group__0__Impl rule__FunctionCallInbuilt__Group__1 ;
    public final void rule__FunctionCallInbuilt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6670:1: ( rule__FunctionCallInbuilt__Group__0__Impl rule__FunctionCallInbuilt__Group__1 )
            // InternalBSharp.g:6671:2: rule__FunctionCallInbuilt__Group__0__Impl rule__FunctionCallInbuilt__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__FunctionCallInbuilt__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FunctionCallInbuilt__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCallInbuilt__Group__0"


    // $ANTLR start "rule__FunctionCallInbuilt__Group__0__Impl"
    // InternalBSharp.g:6678:1: rule__FunctionCallInbuilt__Group__0__Impl : ( ( rule__FunctionCallInbuilt__InbuiltUnaryAssignment_0 ) ) ;
    public final void rule__FunctionCallInbuilt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6682:1: ( ( ( rule__FunctionCallInbuilt__InbuiltUnaryAssignment_0 ) ) )
            // InternalBSharp.g:6683:1: ( ( rule__FunctionCallInbuilt__InbuiltUnaryAssignment_0 ) )
            {
            // InternalBSharp.g:6683:1: ( ( rule__FunctionCallInbuilt__InbuiltUnaryAssignment_0 ) )
            // InternalBSharp.g:6684:2: ( rule__FunctionCallInbuilt__InbuiltUnaryAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallInbuiltAccess().getInbuiltUnaryAssignment_0()); 
            }
            // InternalBSharp.g:6685:2: ( rule__FunctionCallInbuilt__InbuiltUnaryAssignment_0 )
            // InternalBSharp.g:6685:3: rule__FunctionCallInbuilt__InbuiltUnaryAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__FunctionCallInbuilt__InbuiltUnaryAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionCallInbuiltAccess().getInbuiltUnaryAssignment_0()); 
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
    // $ANTLR end "rule__FunctionCallInbuilt__Group__0__Impl"


    // $ANTLR start "rule__FunctionCallInbuilt__Group__1"
    // InternalBSharp.g:6693:1: rule__FunctionCallInbuilt__Group__1 : rule__FunctionCallInbuilt__Group__1__Impl ;
    public final void rule__FunctionCallInbuilt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6697:1: ( rule__FunctionCallInbuilt__Group__1__Impl )
            // InternalBSharp.g:6698:2: rule__FunctionCallInbuilt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FunctionCallInbuilt__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCallInbuilt__Group__1"


    // $ANTLR start "rule__FunctionCallInbuilt__Group__1__Impl"
    // InternalBSharp.g:6704:1: rule__FunctionCallInbuilt__Group__1__Impl : ( ( rule__FunctionCallInbuilt__FuncCallArgsAssignment_1 )* ) ;
    public final void rule__FunctionCallInbuilt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6708:1: ( ( ( rule__FunctionCallInbuilt__FuncCallArgsAssignment_1 )* ) )
            // InternalBSharp.g:6709:1: ( ( rule__FunctionCallInbuilt__FuncCallArgsAssignment_1 )* )
            {
            // InternalBSharp.g:6709:1: ( ( rule__FunctionCallInbuilt__FuncCallArgsAssignment_1 )* )
            // InternalBSharp.g:6710:2: ( rule__FunctionCallInbuilt__FuncCallArgsAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallInbuiltAccess().getFuncCallArgsAssignment_1()); 
            }
            // InternalBSharp.g:6711:2: ( rule__FunctionCallInbuilt__FuncCallArgsAssignment_1 )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==45) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // InternalBSharp.g:6711:3: rule__FunctionCallInbuilt__FuncCallArgsAssignment_1
            	    {
            	    pushFollow(FOLLOW_52);
            	    rule__FunctionCallInbuilt__FuncCallArgsAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop61;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionCallInbuiltAccess().getFuncCallArgsAssignment_1()); 
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
    // $ANTLR end "rule__FunctionCallInbuilt__Group__1__Impl"


    // $ANTLR start "rule__FuncCallArgs__Group__0"
    // InternalBSharp.g:6720:1: rule__FuncCallArgs__Group__0 : rule__FuncCallArgs__Group__0__Impl rule__FuncCallArgs__Group__1 ;
    public final void rule__FuncCallArgs__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6724:1: ( rule__FuncCallArgs__Group__0__Impl rule__FuncCallArgs__Group__1 )
            // InternalBSharp.g:6725:2: rule__FuncCallArgs__Group__0__Impl rule__FuncCallArgs__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__FuncCallArgs__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FuncCallArgs__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:6732:1: rule__FuncCallArgs__Group__0__Impl : ( () ) ;
    public final void rule__FuncCallArgs__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6736:1: ( ( () ) )
            // InternalBSharp.g:6737:1: ( () )
            {
            // InternalBSharp.g:6737:1: ( () )
            // InternalBSharp.g:6738:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFuncCallArgsAccess().getFuncCallArgsAction_0()); 
            }
            // InternalBSharp.g:6739:2: ()
            // InternalBSharp.g:6739:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFuncCallArgsAccess().getFuncCallArgsAction_0()); 
            }

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
    // InternalBSharp.g:6747:1: rule__FuncCallArgs__Group__1 : rule__FuncCallArgs__Group__1__Impl ;
    public final void rule__FuncCallArgs__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6751:1: ( rule__FuncCallArgs__Group__1__Impl )
            // InternalBSharp.g:6752:2: rule__FuncCallArgs__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FuncCallArgs__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:6758:1: rule__FuncCallArgs__Group__1__Impl : ( ( rule__FuncCallArgs__Group_1__0 ) ) ;
    public final void rule__FuncCallArgs__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6762:1: ( ( ( rule__FuncCallArgs__Group_1__0 ) ) )
            // InternalBSharp.g:6763:1: ( ( rule__FuncCallArgs__Group_1__0 ) )
            {
            // InternalBSharp.g:6763:1: ( ( rule__FuncCallArgs__Group_1__0 ) )
            // InternalBSharp.g:6764:2: ( rule__FuncCallArgs__Group_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFuncCallArgsAccess().getGroup_1()); 
            }
            // InternalBSharp.g:6765:2: ( rule__FuncCallArgs__Group_1__0 )
            // InternalBSharp.g:6765:3: rule__FuncCallArgs__Group_1__0
            {
            pushFollow(FOLLOW_2);
            rule__FuncCallArgs__Group_1__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFuncCallArgsAccess().getGroup_1()); 
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
    // $ANTLR end "rule__FuncCallArgs__Group__1__Impl"


    // $ANTLR start "rule__FuncCallArgs__Group_1__0"
    // InternalBSharp.g:6774:1: rule__FuncCallArgs__Group_1__0 : rule__FuncCallArgs__Group_1__0__Impl rule__FuncCallArgs__Group_1__1 ;
    public final void rule__FuncCallArgs__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6778:1: ( rule__FuncCallArgs__Group_1__0__Impl rule__FuncCallArgs__Group_1__1 )
            // InternalBSharp.g:6779:2: rule__FuncCallArgs__Group_1__0__Impl rule__FuncCallArgs__Group_1__1
            {
            pushFollow(FOLLOW_54);
            rule__FuncCallArgs__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FuncCallArgs__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:6786:1: rule__FuncCallArgs__Group_1__0__Impl : ( '(' ) ;
    public final void rule__FuncCallArgs__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6790:1: ( ( '(' ) )
            // InternalBSharp.g:6791:1: ( '(' )
            {
            // InternalBSharp.g:6791:1: ( '(' )
            // InternalBSharp.g:6792:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFuncCallArgsAccess().getLeftParenthesisKeyword_1_0()); 
            }
            match(input,45,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFuncCallArgsAccess().getLeftParenthesisKeyword_1_0()); 
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
    // $ANTLR end "rule__FuncCallArgs__Group_1__0__Impl"


    // $ANTLR start "rule__FuncCallArgs__Group_1__1"
    // InternalBSharp.g:6801:1: rule__FuncCallArgs__Group_1__1 : rule__FuncCallArgs__Group_1__1__Impl rule__FuncCallArgs__Group_1__2 ;
    public final void rule__FuncCallArgs__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6805:1: ( rule__FuncCallArgs__Group_1__1__Impl rule__FuncCallArgs__Group_1__2 )
            // InternalBSharp.g:6806:2: rule__FuncCallArgs__Group_1__1__Impl rule__FuncCallArgs__Group_1__2
            {
            pushFollow(FOLLOW_54);
            rule__FuncCallArgs__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FuncCallArgs__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:6813:1: rule__FuncCallArgs__Group_1__1__Impl : ( ( rule__FuncCallArgs__ArgumentsAssignment_1_1 )? ) ;
    public final void rule__FuncCallArgs__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6817:1: ( ( ( rule__FuncCallArgs__ArgumentsAssignment_1_1 )? ) )
            // InternalBSharp.g:6818:1: ( ( rule__FuncCallArgs__ArgumentsAssignment_1_1 )? )
            {
            // InternalBSharp.g:6818:1: ( ( rule__FuncCallArgs__ArgumentsAssignment_1_1 )? )
            // InternalBSharp.g:6819:2: ( rule__FuncCallArgs__ArgumentsAssignment_1_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFuncCallArgsAccess().getArgumentsAssignment_1_1()); 
            }
            // InternalBSharp.g:6820:2: ( rule__FuncCallArgs__ArgumentsAssignment_1_1 )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==RULE_ID||LA62_0==11||(LA62_0>=23 && LA62_0<=24)||(LA62_0>=32 && LA62_0<=35)||LA62_0==43||LA62_0==45||LA62_0==57||LA62_0==60||LA62_0==64) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalBSharp.g:6820:3: rule__FuncCallArgs__ArgumentsAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__FuncCallArgs__ArgumentsAssignment_1_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFuncCallArgsAccess().getArgumentsAssignment_1_1()); 
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
    // $ANTLR end "rule__FuncCallArgs__Group_1__1__Impl"


    // $ANTLR start "rule__FuncCallArgs__Group_1__2"
    // InternalBSharp.g:6828:1: rule__FuncCallArgs__Group_1__2 : rule__FuncCallArgs__Group_1__2__Impl rule__FuncCallArgs__Group_1__3 ;
    public final void rule__FuncCallArgs__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6832:1: ( rule__FuncCallArgs__Group_1__2__Impl rule__FuncCallArgs__Group_1__3 )
            // InternalBSharp.g:6833:2: rule__FuncCallArgs__Group_1__2__Impl rule__FuncCallArgs__Group_1__3
            {
            pushFollow(FOLLOW_54);
            rule__FuncCallArgs__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FuncCallArgs__Group_1__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:6840:1: rule__FuncCallArgs__Group_1__2__Impl : ( ( rule__FuncCallArgs__Group_1_2__0 )* ) ;
    public final void rule__FuncCallArgs__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6844:1: ( ( ( rule__FuncCallArgs__Group_1_2__0 )* ) )
            // InternalBSharp.g:6845:1: ( ( rule__FuncCallArgs__Group_1_2__0 )* )
            {
            // InternalBSharp.g:6845:1: ( ( rule__FuncCallArgs__Group_1_2__0 )* )
            // InternalBSharp.g:6846:2: ( rule__FuncCallArgs__Group_1_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFuncCallArgsAccess().getGroup_1_2()); 
            }
            // InternalBSharp.g:6847:2: ( rule__FuncCallArgs__Group_1_2__0 )*
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( (LA63_0==49) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // InternalBSharp.g:6847:3: rule__FuncCallArgs__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__FuncCallArgs__Group_1_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop63;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFuncCallArgsAccess().getGroup_1_2()); 
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
    // $ANTLR end "rule__FuncCallArgs__Group_1__2__Impl"


    // $ANTLR start "rule__FuncCallArgs__Group_1__3"
    // InternalBSharp.g:6855:1: rule__FuncCallArgs__Group_1__3 : rule__FuncCallArgs__Group_1__3__Impl ;
    public final void rule__FuncCallArgs__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6859:1: ( rule__FuncCallArgs__Group_1__3__Impl )
            // InternalBSharp.g:6860:2: rule__FuncCallArgs__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FuncCallArgs__Group_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:6866:1: rule__FuncCallArgs__Group_1__3__Impl : ( ')' ) ;
    public final void rule__FuncCallArgs__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6870:1: ( ( ')' ) )
            // InternalBSharp.g:6871:1: ( ')' )
            {
            // InternalBSharp.g:6871:1: ( ')' )
            // InternalBSharp.g:6872:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFuncCallArgsAccess().getRightParenthesisKeyword_1_3()); 
            }
            match(input,46,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFuncCallArgsAccess().getRightParenthesisKeyword_1_3()); 
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
    // $ANTLR end "rule__FuncCallArgs__Group_1__3__Impl"


    // $ANTLR start "rule__FuncCallArgs__Group_1_2__0"
    // InternalBSharp.g:6882:1: rule__FuncCallArgs__Group_1_2__0 : rule__FuncCallArgs__Group_1_2__0__Impl rule__FuncCallArgs__Group_1_2__1 ;
    public final void rule__FuncCallArgs__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6886:1: ( rule__FuncCallArgs__Group_1_2__0__Impl rule__FuncCallArgs__Group_1_2__1 )
            // InternalBSharp.g:6887:2: rule__FuncCallArgs__Group_1_2__0__Impl rule__FuncCallArgs__Group_1_2__1
            {
            pushFollow(FOLLOW_28);
            rule__FuncCallArgs__Group_1_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FuncCallArgs__Group_1_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:6894:1: rule__FuncCallArgs__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__FuncCallArgs__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6898:1: ( ( ',' ) )
            // InternalBSharp.g:6899:1: ( ',' )
            {
            // InternalBSharp.g:6899:1: ( ',' )
            // InternalBSharp.g:6900:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFuncCallArgsAccess().getCommaKeyword_1_2_0()); 
            }
            match(input,49,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFuncCallArgsAccess().getCommaKeyword_1_2_0()); 
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
    // $ANTLR end "rule__FuncCallArgs__Group_1_2__0__Impl"


    // $ANTLR start "rule__FuncCallArgs__Group_1_2__1"
    // InternalBSharp.g:6909:1: rule__FuncCallArgs__Group_1_2__1 : rule__FuncCallArgs__Group_1_2__1__Impl ;
    public final void rule__FuncCallArgs__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6913:1: ( rule__FuncCallArgs__Group_1_2__1__Impl )
            // InternalBSharp.g:6914:2: rule__FuncCallArgs__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FuncCallArgs__Group_1_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:6920:1: rule__FuncCallArgs__Group_1_2__1__Impl : ( ( rule__FuncCallArgs__ArgumentsAssignment_1_2_1 ) ) ;
    public final void rule__FuncCallArgs__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6924:1: ( ( ( rule__FuncCallArgs__ArgumentsAssignment_1_2_1 ) ) )
            // InternalBSharp.g:6925:1: ( ( rule__FuncCallArgs__ArgumentsAssignment_1_2_1 ) )
            {
            // InternalBSharp.g:6925:1: ( ( rule__FuncCallArgs__ArgumentsAssignment_1_2_1 ) )
            // InternalBSharp.g:6926:2: ( rule__FuncCallArgs__ArgumentsAssignment_1_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFuncCallArgsAccess().getArgumentsAssignment_1_2_1()); 
            }
            // InternalBSharp.g:6927:2: ( rule__FuncCallArgs__ArgumentsAssignment_1_2_1 )
            // InternalBSharp.g:6927:3: rule__FuncCallArgs__ArgumentsAssignment_1_2_1
            {
            pushFollow(FOLLOW_2);
            rule__FuncCallArgs__ArgumentsAssignment_1_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFuncCallArgsAccess().getArgumentsAssignment_1_2_1()); 
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
    // $ANTLR end "rule__FuncCallArgs__Group_1_2__1__Impl"


    // $ANTLR start "rule__IfElse__Group__0"
    // InternalBSharp.g:6936:1: rule__IfElse__Group__0 : rule__IfElse__Group__0__Impl rule__IfElse__Group__1 ;
    public final void rule__IfElse__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6940:1: ( rule__IfElse__Group__0__Impl rule__IfElse__Group__1 )
            // InternalBSharp.g:6941:2: rule__IfElse__Group__0__Impl rule__IfElse__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__IfElse__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IfElse__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:6948:1: rule__IfElse__Group__0__Impl : ( 'if' ) ;
    public final void rule__IfElse__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6952:1: ( ( 'if' ) )
            // InternalBSharp.g:6953:1: ( 'if' )
            {
            // InternalBSharp.g:6953:1: ( 'if' )
            // InternalBSharp.g:6954:2: 'if'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfElseAccess().getIfKeyword_0()); 
            }
            match(input,60,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfElseAccess().getIfKeyword_0()); 
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
    // $ANTLR end "rule__IfElse__Group__0__Impl"


    // $ANTLR start "rule__IfElse__Group__1"
    // InternalBSharp.g:6963:1: rule__IfElse__Group__1 : rule__IfElse__Group__1__Impl rule__IfElse__Group__2 ;
    public final void rule__IfElse__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6967:1: ( rule__IfElse__Group__1__Impl rule__IfElse__Group__2 )
            // InternalBSharp.g:6968:2: rule__IfElse__Group__1__Impl rule__IfElse__Group__2
            {
            pushFollow(FOLLOW_38);
            rule__IfElse__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IfElse__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:6975:1: rule__IfElse__Group__1__Impl : ( ( rule__IfElse__ConditionAssignment_1 ) ) ;
    public final void rule__IfElse__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6979:1: ( ( ( rule__IfElse__ConditionAssignment_1 ) ) )
            // InternalBSharp.g:6980:1: ( ( rule__IfElse__ConditionAssignment_1 ) )
            {
            // InternalBSharp.g:6980:1: ( ( rule__IfElse__ConditionAssignment_1 ) )
            // InternalBSharp.g:6981:2: ( rule__IfElse__ConditionAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfElseAccess().getConditionAssignment_1()); 
            }
            // InternalBSharp.g:6982:2: ( rule__IfElse__ConditionAssignment_1 )
            // InternalBSharp.g:6982:3: rule__IfElse__ConditionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__IfElse__ConditionAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfElseAccess().getConditionAssignment_1()); 
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
    // $ANTLR end "rule__IfElse__Group__1__Impl"


    // $ANTLR start "rule__IfElse__Group__2"
    // InternalBSharp.g:6990:1: rule__IfElse__Group__2 : rule__IfElse__Group__2__Impl rule__IfElse__Group__3 ;
    public final void rule__IfElse__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6994:1: ( rule__IfElse__Group__2__Impl rule__IfElse__Group__3 )
            // InternalBSharp.g:6995:2: rule__IfElse__Group__2__Impl rule__IfElse__Group__3
            {
            pushFollow(FOLLOW_28);
            rule__IfElse__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IfElse__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:7002:1: rule__IfElse__Group__2__Impl : ( '{' ) ;
    public final void rule__IfElse__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7006:1: ( ( '{' ) )
            // InternalBSharp.g:7007:1: ( '{' )
            {
            // InternalBSharp.g:7007:1: ( '{' )
            // InternalBSharp.g:7008:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfElseAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,55,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfElseAccess().getLeftCurlyBracketKeyword_2()); 
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
    // $ANTLR end "rule__IfElse__Group__2__Impl"


    // $ANTLR start "rule__IfElse__Group__3"
    // InternalBSharp.g:7017:1: rule__IfElse__Group__3 : rule__IfElse__Group__3__Impl rule__IfElse__Group__4 ;
    public final void rule__IfElse__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7021:1: ( rule__IfElse__Group__3__Impl rule__IfElse__Group__4 )
            // InternalBSharp.g:7022:2: rule__IfElse__Group__3__Impl rule__IfElse__Group__4
            {
            pushFollow(FOLLOW_45);
            rule__IfElse__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IfElse__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:7029:1: rule__IfElse__Group__3__Impl : ( ( rule__IfElse__IfTrueExprAssignment_3 ) ) ;
    public final void rule__IfElse__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7033:1: ( ( ( rule__IfElse__IfTrueExprAssignment_3 ) ) )
            // InternalBSharp.g:7034:1: ( ( rule__IfElse__IfTrueExprAssignment_3 ) )
            {
            // InternalBSharp.g:7034:1: ( ( rule__IfElse__IfTrueExprAssignment_3 ) )
            // InternalBSharp.g:7035:2: ( rule__IfElse__IfTrueExprAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfElseAccess().getIfTrueExprAssignment_3()); 
            }
            // InternalBSharp.g:7036:2: ( rule__IfElse__IfTrueExprAssignment_3 )
            // InternalBSharp.g:7036:3: rule__IfElse__IfTrueExprAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__IfElse__IfTrueExprAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfElseAccess().getIfTrueExprAssignment_3()); 
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
    // $ANTLR end "rule__IfElse__Group__3__Impl"


    // $ANTLR start "rule__IfElse__Group__4"
    // InternalBSharp.g:7044:1: rule__IfElse__Group__4 : rule__IfElse__Group__4__Impl rule__IfElse__Group__5 ;
    public final void rule__IfElse__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7048:1: ( rule__IfElse__Group__4__Impl rule__IfElse__Group__5 )
            // InternalBSharp.g:7049:2: rule__IfElse__Group__4__Impl rule__IfElse__Group__5
            {
            pushFollow(FOLLOW_55);
            rule__IfElse__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IfElse__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:7056:1: rule__IfElse__Group__4__Impl : ( '}' ) ;
    public final void rule__IfElse__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7060:1: ( ( '}' ) )
            // InternalBSharp.g:7061:1: ( '}' )
            {
            // InternalBSharp.g:7061:1: ( '}' )
            // InternalBSharp.g:7062:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfElseAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,56,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfElseAccess().getRightCurlyBracketKeyword_4()); 
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
    // $ANTLR end "rule__IfElse__Group__4__Impl"


    // $ANTLR start "rule__IfElse__Group__5"
    // InternalBSharp.g:7071:1: rule__IfElse__Group__5 : rule__IfElse__Group__5__Impl rule__IfElse__Group__6 ;
    public final void rule__IfElse__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7075:1: ( rule__IfElse__Group__5__Impl rule__IfElse__Group__6 )
            // InternalBSharp.g:7076:2: rule__IfElse__Group__5__Impl rule__IfElse__Group__6
            {
            pushFollow(FOLLOW_38);
            rule__IfElse__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IfElse__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:7083:1: rule__IfElse__Group__5__Impl : ( 'else' ) ;
    public final void rule__IfElse__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7087:1: ( ( 'else' ) )
            // InternalBSharp.g:7088:1: ( 'else' )
            {
            // InternalBSharp.g:7088:1: ( 'else' )
            // InternalBSharp.g:7089:2: 'else'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfElseAccess().getElseKeyword_5()); 
            }
            match(input,61,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfElseAccess().getElseKeyword_5()); 
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
    // $ANTLR end "rule__IfElse__Group__5__Impl"


    // $ANTLR start "rule__IfElse__Group__6"
    // InternalBSharp.g:7098:1: rule__IfElse__Group__6 : rule__IfElse__Group__6__Impl rule__IfElse__Group__7 ;
    public final void rule__IfElse__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7102:1: ( rule__IfElse__Group__6__Impl rule__IfElse__Group__7 )
            // InternalBSharp.g:7103:2: rule__IfElse__Group__6__Impl rule__IfElse__Group__7
            {
            pushFollow(FOLLOW_28);
            rule__IfElse__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IfElse__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:7110:1: rule__IfElse__Group__6__Impl : ( '{' ) ;
    public final void rule__IfElse__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7114:1: ( ( '{' ) )
            // InternalBSharp.g:7115:1: ( '{' )
            {
            // InternalBSharp.g:7115:1: ( '{' )
            // InternalBSharp.g:7116:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfElseAccess().getLeftCurlyBracketKeyword_6()); 
            }
            match(input,55,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfElseAccess().getLeftCurlyBracketKeyword_6()); 
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
    // $ANTLR end "rule__IfElse__Group__6__Impl"


    // $ANTLR start "rule__IfElse__Group__7"
    // InternalBSharp.g:7125:1: rule__IfElse__Group__7 : rule__IfElse__Group__7__Impl rule__IfElse__Group__8 ;
    public final void rule__IfElse__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7129:1: ( rule__IfElse__Group__7__Impl rule__IfElse__Group__8 )
            // InternalBSharp.g:7130:2: rule__IfElse__Group__7__Impl rule__IfElse__Group__8
            {
            pushFollow(FOLLOW_45);
            rule__IfElse__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IfElse__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:7137:1: rule__IfElse__Group__7__Impl : ( ( rule__IfElse__IfFalseExprAssignment_7 ) ) ;
    public final void rule__IfElse__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7141:1: ( ( ( rule__IfElse__IfFalseExprAssignment_7 ) ) )
            // InternalBSharp.g:7142:1: ( ( rule__IfElse__IfFalseExprAssignment_7 ) )
            {
            // InternalBSharp.g:7142:1: ( ( rule__IfElse__IfFalseExprAssignment_7 ) )
            // InternalBSharp.g:7143:2: ( rule__IfElse__IfFalseExprAssignment_7 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfElseAccess().getIfFalseExprAssignment_7()); 
            }
            // InternalBSharp.g:7144:2: ( rule__IfElse__IfFalseExprAssignment_7 )
            // InternalBSharp.g:7144:3: rule__IfElse__IfFalseExprAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__IfElse__IfFalseExprAssignment_7();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfElseAccess().getIfFalseExprAssignment_7()); 
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
    // $ANTLR end "rule__IfElse__Group__7__Impl"


    // $ANTLR start "rule__IfElse__Group__8"
    // InternalBSharp.g:7152:1: rule__IfElse__Group__8 : rule__IfElse__Group__8__Impl ;
    public final void rule__IfElse__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7156:1: ( rule__IfElse__Group__8__Impl )
            // InternalBSharp.g:7157:2: rule__IfElse__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IfElse__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:7163:1: rule__IfElse__Group__8__Impl : ( '}' ) ;
    public final void rule__IfElse__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7167:1: ( ( '}' ) )
            // InternalBSharp.g:7168:1: ( '}' )
            {
            // InternalBSharp.g:7168:1: ( '}' )
            // InternalBSharp.g:7169:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfElseAccess().getRightCurlyBracketKeyword_8()); 
            }
            match(input,56,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfElseAccess().getRightCurlyBracketKeyword_8()); 
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
    // $ANTLR end "rule__IfElse__Group__8__Impl"


    // $ANTLR start "rule__WrappedInfix__Group__0"
    // InternalBSharp.g:7179:1: rule__WrappedInfix__Group__0 : rule__WrappedInfix__Group__0__Impl rule__WrappedInfix__Group__1 ;
    public final void rule__WrappedInfix__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7183:1: ( rule__WrappedInfix__Group__0__Impl rule__WrappedInfix__Group__1 )
            // InternalBSharp.g:7184:2: rule__WrappedInfix__Group__0__Impl rule__WrappedInfix__Group__1
            {
            pushFollow(FOLLOW_50);
            rule__WrappedInfix__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__WrappedInfix__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:7191:1: rule__WrappedInfix__Group__0__Impl : ( '[' ) ;
    public final void rule__WrappedInfix__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7195:1: ( ( '[' ) )
            // InternalBSharp.g:7196:1: ( '[' )
            {
            // InternalBSharp.g:7196:1: ( '[' )
            // InternalBSharp.g:7197:2: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWrappedInfixAccess().getLeftSquareBracketKeyword_0()); 
            }
            match(input,43,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWrappedInfixAccess().getLeftSquareBracketKeyword_0()); 
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
    // $ANTLR end "rule__WrappedInfix__Group__0__Impl"


    // $ANTLR start "rule__WrappedInfix__Group__1"
    // InternalBSharp.g:7206:1: rule__WrappedInfix__Group__1 : rule__WrappedInfix__Group__1__Impl rule__WrappedInfix__Group__2 ;
    public final void rule__WrappedInfix__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7210:1: ( rule__WrappedInfix__Group__1__Impl rule__WrappedInfix__Group__2 )
            // InternalBSharp.g:7211:2: rule__WrappedInfix__Group__1__Impl rule__WrappedInfix__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__WrappedInfix__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__WrappedInfix__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:7218:1: rule__WrappedInfix__Group__1__Impl : ( ( rule__WrappedInfix__Alternatives_1 ) ) ;
    public final void rule__WrappedInfix__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7222:1: ( ( ( rule__WrappedInfix__Alternatives_1 ) ) )
            // InternalBSharp.g:7223:1: ( ( rule__WrappedInfix__Alternatives_1 ) )
            {
            // InternalBSharp.g:7223:1: ( ( rule__WrappedInfix__Alternatives_1 ) )
            // InternalBSharp.g:7224:2: ( rule__WrappedInfix__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWrappedInfixAccess().getAlternatives_1()); 
            }
            // InternalBSharp.g:7225:2: ( rule__WrappedInfix__Alternatives_1 )
            // InternalBSharp.g:7225:3: rule__WrappedInfix__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__WrappedInfix__Alternatives_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWrappedInfixAccess().getAlternatives_1()); 
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
    // $ANTLR end "rule__WrappedInfix__Group__1__Impl"


    // $ANTLR start "rule__WrappedInfix__Group__2"
    // InternalBSharp.g:7233:1: rule__WrappedInfix__Group__2 : rule__WrappedInfix__Group__2__Impl ;
    public final void rule__WrappedInfix__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7237:1: ( rule__WrappedInfix__Group__2__Impl )
            // InternalBSharp.g:7238:2: rule__WrappedInfix__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WrappedInfix__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:7244:1: rule__WrappedInfix__Group__2__Impl : ( ']' ) ;
    public final void rule__WrappedInfix__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7248:1: ( ( ']' ) )
            // InternalBSharp.g:7249:1: ( ']' )
            {
            // InternalBSharp.g:7249:1: ( ']' )
            // InternalBSharp.g:7250:2: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWrappedInfixAccess().getRightSquareBracketKeyword_2()); 
            }
            match(input,44,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWrappedInfixAccess().getRightSquareBracketKeyword_2()); 
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
    // $ANTLR end "rule__WrappedInfix__Group__2__Impl"


    // $ANTLR start "rule__Instance__Group__0"
    // InternalBSharp.g:7260:1: rule__Instance__Group__0 : rule__Instance__Group__0__Impl rule__Instance__Group__1 ;
    public final void rule__Instance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7264:1: ( rule__Instance__Group__0__Impl rule__Instance__Group__1 )
            // InternalBSharp.g:7265:2: rule__Instance__Group__0__Impl rule__Instance__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Instance__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Instance__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:7272:1: rule__Instance__Group__0__Impl : ( 'Instance' ) ;
    public final void rule__Instance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7276:1: ( ( 'Instance' ) )
            // InternalBSharp.g:7277:1: ( 'Instance' )
            {
            // InternalBSharp.g:7277:1: ( 'Instance' )
            // InternalBSharp.g:7278:2: 'Instance'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstanceAccess().getInstanceKeyword_0()); 
            }
            match(input,62,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstanceAccess().getInstanceKeyword_0()); 
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
    // $ANTLR end "rule__Instance__Group__0__Impl"


    // $ANTLR start "rule__Instance__Group__1"
    // InternalBSharp.g:7287:1: rule__Instance__Group__1 : rule__Instance__Group__1__Impl rule__Instance__Group__2 ;
    public final void rule__Instance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7291:1: ( rule__Instance__Group__1__Impl rule__Instance__Group__2 )
            // InternalBSharp.g:7292:2: rule__Instance__Group__1__Impl rule__Instance__Group__2
            {
            pushFollow(FOLLOW_25);
            rule__Instance__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Instance__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:7299:1: rule__Instance__Group__1__Impl : ( ( rule__Instance__ClassNameAssignment_1 ) ) ;
    public final void rule__Instance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7303:1: ( ( ( rule__Instance__ClassNameAssignment_1 ) ) )
            // InternalBSharp.g:7304:1: ( ( rule__Instance__ClassNameAssignment_1 ) )
            {
            // InternalBSharp.g:7304:1: ( ( rule__Instance__ClassNameAssignment_1 ) )
            // InternalBSharp.g:7305:2: ( rule__Instance__ClassNameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstanceAccess().getClassNameAssignment_1()); 
            }
            // InternalBSharp.g:7306:2: ( rule__Instance__ClassNameAssignment_1 )
            // InternalBSharp.g:7306:3: rule__Instance__ClassNameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Instance__ClassNameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstanceAccess().getClassNameAssignment_1()); 
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
    // $ANTLR end "rule__Instance__Group__1__Impl"


    // $ANTLR start "rule__Instance__Group__2"
    // InternalBSharp.g:7314:1: rule__Instance__Group__2 : rule__Instance__Group__2__Impl rule__Instance__Group__3 ;
    public final void rule__Instance__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7318:1: ( rule__Instance__Group__2__Impl rule__Instance__Group__3 )
            // InternalBSharp.g:7319:2: rule__Instance__Group__2__Impl rule__Instance__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Instance__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Instance__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:7326:1: rule__Instance__Group__2__Impl : ( '<' ) ;
    public final void rule__Instance__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7330:1: ( ( '<' ) )
            // InternalBSharp.g:7331:1: ( '<' )
            {
            // InternalBSharp.g:7331:1: ( '<' )
            // InternalBSharp.g:7332:2: '<'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstanceAccess().getLessThanSignKeyword_2()); 
            }
            match(input,47,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstanceAccess().getLessThanSignKeyword_2()); 
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
    // $ANTLR end "rule__Instance__Group__2__Impl"


    // $ANTLR start "rule__Instance__Group__3"
    // InternalBSharp.g:7341:1: rule__Instance__Group__3 : rule__Instance__Group__3__Impl rule__Instance__Group__4 ;
    public final void rule__Instance__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7345:1: ( rule__Instance__Group__3__Impl rule__Instance__Group__4 )
            // InternalBSharp.g:7346:2: rule__Instance__Group__3__Impl rule__Instance__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__Instance__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Instance__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:7353:1: rule__Instance__Group__3__Impl : ( ( ( rule__Instance__ContextAssignment_3 ) ) ( ( rule__Instance__ContextAssignment_3 )* ) ) ;
    public final void rule__Instance__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7357:1: ( ( ( ( rule__Instance__ContextAssignment_3 ) ) ( ( rule__Instance__ContextAssignment_3 )* ) ) )
            // InternalBSharp.g:7358:1: ( ( ( rule__Instance__ContextAssignment_3 ) ) ( ( rule__Instance__ContextAssignment_3 )* ) )
            {
            // InternalBSharp.g:7358:1: ( ( ( rule__Instance__ContextAssignment_3 ) ) ( ( rule__Instance__ContextAssignment_3 )* ) )
            // InternalBSharp.g:7359:2: ( ( rule__Instance__ContextAssignment_3 ) ) ( ( rule__Instance__ContextAssignment_3 )* )
            {
            // InternalBSharp.g:7359:2: ( ( rule__Instance__ContextAssignment_3 ) )
            // InternalBSharp.g:7360:3: ( rule__Instance__ContextAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstanceAccess().getContextAssignment_3()); 
            }
            // InternalBSharp.g:7361:3: ( rule__Instance__ContextAssignment_3 )
            // InternalBSharp.g:7361:4: rule__Instance__ContextAssignment_3
            {
            pushFollow(FOLLOW_13);
            rule__Instance__ContextAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstanceAccess().getContextAssignment_3()); 
            }

            }

            // InternalBSharp.g:7364:2: ( ( rule__Instance__ContextAssignment_3 )* )
            // InternalBSharp.g:7365:3: ( rule__Instance__ContextAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstanceAccess().getContextAssignment_3()); 
            }
            // InternalBSharp.g:7366:3: ( rule__Instance__ContextAssignment_3 )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==RULE_ID) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // InternalBSharp.g:7366:4: rule__Instance__ContextAssignment_3
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Instance__ContextAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop64;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstanceAccess().getContextAssignment_3()); 
            }

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
    // InternalBSharp.g:7375:1: rule__Instance__Group__4 : rule__Instance__Group__4__Impl rule__Instance__Group__5 ;
    public final void rule__Instance__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7379:1: ( rule__Instance__Group__4__Impl rule__Instance__Group__5 )
            // InternalBSharp.g:7380:2: rule__Instance__Group__4__Impl rule__Instance__Group__5
            {
            pushFollow(FOLLOW_26);
            rule__Instance__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Instance__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:7387:1: rule__Instance__Group__4__Impl : ( '>' ) ;
    public final void rule__Instance__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7391:1: ( ( '>' ) )
            // InternalBSharp.g:7392:1: ( '>' )
            {
            // InternalBSharp.g:7392:1: ( '>' )
            // InternalBSharp.g:7393:2: '>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstanceAccess().getGreaterThanSignKeyword_4()); 
            }
            match(input,48,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstanceAccess().getGreaterThanSignKeyword_4()); 
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
    // $ANTLR end "rule__Instance__Group__4__Impl"


    // $ANTLR start "rule__Instance__Group__5"
    // InternalBSharp.g:7402:1: rule__Instance__Group__5 : rule__Instance__Group__5__Impl rule__Instance__Group__6 ;
    public final void rule__Instance__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7406:1: ( rule__Instance__Group__5__Impl rule__Instance__Group__6 )
            // InternalBSharp.g:7407:2: rule__Instance__Group__5__Impl rule__Instance__Group__6
            {
            pushFollow(FOLLOW_54);
            rule__Instance__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Instance__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:7414:1: rule__Instance__Group__5__Impl : ( '(' ) ;
    public final void rule__Instance__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7418:1: ( ( '(' ) )
            // InternalBSharp.g:7419:1: ( '(' )
            {
            // InternalBSharp.g:7419:1: ( '(' )
            // InternalBSharp.g:7420:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstanceAccess().getLeftParenthesisKeyword_5()); 
            }
            match(input,45,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstanceAccess().getLeftParenthesisKeyword_5()); 
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
    // $ANTLR end "rule__Instance__Group__5__Impl"


    // $ANTLR start "rule__Instance__Group__6"
    // InternalBSharp.g:7429:1: rule__Instance__Group__6 : rule__Instance__Group__6__Impl rule__Instance__Group__7 ;
    public final void rule__Instance__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7433:1: ( rule__Instance__Group__6__Impl rule__Instance__Group__7 )
            // InternalBSharp.g:7434:2: rule__Instance__Group__6__Impl rule__Instance__Group__7
            {
            pushFollow(FOLLOW_54);
            rule__Instance__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Instance__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:7441:1: rule__Instance__Group__6__Impl : ( ( rule__Instance__ArgumentsAssignment_6 )? ) ;
    public final void rule__Instance__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7445:1: ( ( ( rule__Instance__ArgumentsAssignment_6 )? ) )
            // InternalBSharp.g:7446:1: ( ( rule__Instance__ArgumentsAssignment_6 )? )
            {
            // InternalBSharp.g:7446:1: ( ( rule__Instance__ArgumentsAssignment_6 )? )
            // InternalBSharp.g:7447:2: ( rule__Instance__ArgumentsAssignment_6 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstanceAccess().getArgumentsAssignment_6()); 
            }
            // InternalBSharp.g:7448:2: ( rule__Instance__ArgumentsAssignment_6 )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==RULE_ID||LA65_0==11||(LA65_0>=23 && LA65_0<=24)||(LA65_0>=32 && LA65_0<=35)||LA65_0==43||LA65_0==45||LA65_0==57||LA65_0==60||LA65_0==64) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalBSharp.g:7448:3: rule__Instance__ArgumentsAssignment_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__Instance__ArgumentsAssignment_6();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstanceAccess().getArgumentsAssignment_6()); 
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
    // $ANTLR end "rule__Instance__Group__6__Impl"


    // $ANTLR start "rule__Instance__Group__7"
    // InternalBSharp.g:7456:1: rule__Instance__Group__7 : rule__Instance__Group__7__Impl rule__Instance__Group__8 ;
    public final void rule__Instance__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7460:1: ( rule__Instance__Group__7__Impl rule__Instance__Group__8 )
            // InternalBSharp.g:7461:2: rule__Instance__Group__7__Impl rule__Instance__Group__8
            {
            pushFollow(FOLLOW_54);
            rule__Instance__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Instance__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:7468:1: rule__Instance__Group__7__Impl : ( ( rule__Instance__Group_7__0 )* ) ;
    public final void rule__Instance__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7472:1: ( ( ( rule__Instance__Group_7__0 )* ) )
            // InternalBSharp.g:7473:1: ( ( rule__Instance__Group_7__0 )* )
            {
            // InternalBSharp.g:7473:1: ( ( rule__Instance__Group_7__0 )* )
            // InternalBSharp.g:7474:2: ( rule__Instance__Group_7__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstanceAccess().getGroup_7()); 
            }
            // InternalBSharp.g:7475:2: ( rule__Instance__Group_7__0 )*
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( (LA66_0==49) ) {
                    alt66=1;
                }


                switch (alt66) {
            	case 1 :
            	    // InternalBSharp.g:7475:3: rule__Instance__Group_7__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__Instance__Group_7__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop66;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstanceAccess().getGroup_7()); 
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
    // $ANTLR end "rule__Instance__Group__7__Impl"


    // $ANTLR start "rule__Instance__Group__8"
    // InternalBSharp.g:7483:1: rule__Instance__Group__8 : rule__Instance__Group__8__Impl rule__Instance__Group__9 ;
    public final void rule__Instance__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7487:1: ( rule__Instance__Group__8__Impl rule__Instance__Group__9 )
            // InternalBSharp.g:7488:2: rule__Instance__Group__8__Impl rule__Instance__Group__9
            {
            pushFollow(FOLLOW_56);
            rule__Instance__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Instance__Group__9();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:7495:1: rule__Instance__Group__8__Impl : ( ')' ) ;
    public final void rule__Instance__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7499:1: ( ( ')' ) )
            // InternalBSharp.g:7500:1: ( ')' )
            {
            // InternalBSharp.g:7500:1: ( ')' )
            // InternalBSharp.g:7501:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstanceAccess().getRightParenthesisKeyword_8()); 
            }
            match(input,46,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstanceAccess().getRightParenthesisKeyword_8()); 
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
    // $ANTLR end "rule__Instance__Group__8__Impl"


    // $ANTLR start "rule__Instance__Group__9"
    // InternalBSharp.g:7510:1: rule__Instance__Group__9 : rule__Instance__Group__9__Impl rule__Instance__Group__10 ;
    public final void rule__Instance__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7514:1: ( rule__Instance__Group__9__Impl rule__Instance__Group__10 )
            // InternalBSharp.g:7515:2: rule__Instance__Group__9__Impl rule__Instance__Group__10
            {
            pushFollow(FOLLOW_56);
            rule__Instance__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Instance__Group__10();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:7522:1: rule__Instance__Group__9__Impl : ( ( rule__Instance__NameAssignment_9 )? ) ;
    public final void rule__Instance__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7526:1: ( ( ( rule__Instance__NameAssignment_9 )? ) )
            // InternalBSharp.g:7527:1: ( ( rule__Instance__NameAssignment_9 )? )
            {
            // InternalBSharp.g:7527:1: ( ( rule__Instance__NameAssignment_9 )? )
            // InternalBSharp.g:7528:2: ( rule__Instance__NameAssignment_9 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstanceAccess().getNameAssignment_9()); 
            }
            // InternalBSharp.g:7529:2: ( rule__Instance__NameAssignment_9 )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==RULE_ID) ) {
                int LA67_1 = input.LA(2);

                if ( (LA67_1==45) ) {
                    int LA67_3 = input.LA(3);

                    if ( (LA67_3==RULE_ID) ) {
                        int LA67_5 = input.LA(4);

                        if ( (LA67_5==27) ) {
                            alt67=1;
                        }
                    }
                }
                else if ( (LA67_1==EOF||LA67_1==RULE_ID||LA67_1==56||LA67_1==58||LA67_1==62) ) {
                    alt67=1;
                }
            }
            switch (alt67) {
                case 1 :
                    // InternalBSharp.g:7529:3: rule__Instance__NameAssignment_9
                    {
                    pushFollow(FOLLOW_2);
                    rule__Instance__NameAssignment_9();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstanceAccess().getNameAssignment_9()); 
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
    // $ANTLR end "rule__Instance__Group__9__Impl"


    // $ANTLR start "rule__Instance__Group__10"
    // InternalBSharp.g:7537:1: rule__Instance__Group__10 : rule__Instance__Group__10__Impl ;
    public final void rule__Instance__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7541:1: ( rule__Instance__Group__10__Impl )
            // InternalBSharp.g:7542:2: rule__Instance__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Instance__Group__10__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:7548:1: rule__Instance__Group__10__Impl : ( ( rule__Instance__Group_10__0 )* ) ;
    public final void rule__Instance__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7552:1: ( ( ( rule__Instance__Group_10__0 )* ) )
            // InternalBSharp.g:7553:1: ( ( rule__Instance__Group_10__0 )* )
            {
            // InternalBSharp.g:7553:1: ( ( rule__Instance__Group_10__0 )* )
            // InternalBSharp.g:7554:2: ( rule__Instance__Group_10__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstanceAccess().getGroup_10()); 
            }
            // InternalBSharp.g:7555:2: ( rule__Instance__Group_10__0 )*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==45) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // InternalBSharp.g:7555:3: rule__Instance__Group_10__0
            	    {
            	    pushFollow(FOLLOW_52);
            	    rule__Instance__Group_10__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop68;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstanceAccess().getGroup_10()); 
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
    // $ANTLR end "rule__Instance__Group__10__Impl"


    // $ANTLR start "rule__Instance__Group_7__0"
    // InternalBSharp.g:7564:1: rule__Instance__Group_7__0 : rule__Instance__Group_7__0__Impl rule__Instance__Group_7__1 ;
    public final void rule__Instance__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7568:1: ( rule__Instance__Group_7__0__Impl rule__Instance__Group_7__1 )
            // InternalBSharp.g:7569:2: rule__Instance__Group_7__0__Impl rule__Instance__Group_7__1
            {
            pushFollow(FOLLOW_28);
            rule__Instance__Group_7__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Instance__Group_7__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:7576:1: rule__Instance__Group_7__0__Impl : ( ',' ) ;
    public final void rule__Instance__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7580:1: ( ( ',' ) )
            // InternalBSharp.g:7581:1: ( ',' )
            {
            // InternalBSharp.g:7581:1: ( ',' )
            // InternalBSharp.g:7582:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstanceAccess().getCommaKeyword_7_0()); 
            }
            match(input,49,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstanceAccess().getCommaKeyword_7_0()); 
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
    // $ANTLR end "rule__Instance__Group_7__0__Impl"


    // $ANTLR start "rule__Instance__Group_7__1"
    // InternalBSharp.g:7591:1: rule__Instance__Group_7__1 : rule__Instance__Group_7__1__Impl ;
    public final void rule__Instance__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7595:1: ( rule__Instance__Group_7__1__Impl )
            // InternalBSharp.g:7596:2: rule__Instance__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Instance__Group_7__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:7602:1: rule__Instance__Group_7__1__Impl : ( ( rule__Instance__ArgumentsAssignment_7_1 ) ) ;
    public final void rule__Instance__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7606:1: ( ( ( rule__Instance__ArgumentsAssignment_7_1 ) ) )
            // InternalBSharp.g:7607:1: ( ( rule__Instance__ArgumentsAssignment_7_1 ) )
            {
            // InternalBSharp.g:7607:1: ( ( rule__Instance__ArgumentsAssignment_7_1 ) )
            // InternalBSharp.g:7608:2: ( rule__Instance__ArgumentsAssignment_7_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstanceAccess().getArgumentsAssignment_7_1()); 
            }
            // InternalBSharp.g:7609:2: ( rule__Instance__ArgumentsAssignment_7_1 )
            // InternalBSharp.g:7609:3: rule__Instance__ArgumentsAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Instance__ArgumentsAssignment_7_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstanceAccess().getArgumentsAssignment_7_1()); 
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
    // $ANTLR end "rule__Instance__Group_7__1__Impl"


    // $ANTLR start "rule__Instance__Group_10__0"
    // InternalBSharp.g:7618:1: rule__Instance__Group_10__0 : rule__Instance__Group_10__0__Impl rule__Instance__Group_10__1 ;
    public final void rule__Instance__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7622:1: ( rule__Instance__Group_10__0__Impl rule__Instance__Group_10__1 )
            // InternalBSharp.g:7623:2: rule__Instance__Group_10__0__Impl rule__Instance__Group_10__1
            {
            pushFollow(FOLLOW_3);
            rule__Instance__Group_10__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Instance__Group_10__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:7630:1: rule__Instance__Group_10__0__Impl : ( '(' ) ;
    public final void rule__Instance__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7634:1: ( ( '(' ) )
            // InternalBSharp.g:7635:1: ( '(' )
            {
            // InternalBSharp.g:7635:1: ( '(' )
            // InternalBSharp.g:7636:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstanceAccess().getLeftParenthesisKeyword_10_0()); 
            }
            match(input,45,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstanceAccess().getLeftParenthesisKeyword_10_0()); 
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
    // $ANTLR end "rule__Instance__Group_10__0__Impl"


    // $ANTLR start "rule__Instance__Group_10__1"
    // InternalBSharp.g:7645:1: rule__Instance__Group_10__1 : rule__Instance__Group_10__1__Impl rule__Instance__Group_10__2 ;
    public final void rule__Instance__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7649:1: ( rule__Instance__Group_10__1__Impl rule__Instance__Group_10__2 )
            // InternalBSharp.g:7650:2: rule__Instance__Group_10__1__Impl rule__Instance__Group_10__2
            {
            pushFollow(FOLLOW_18);
            rule__Instance__Group_10__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Instance__Group_10__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:7657:1: rule__Instance__Group_10__1__Impl : ( ( rule__Instance__ReferencingFuncsAssignment_10_1 ) ) ;
    public final void rule__Instance__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7661:1: ( ( ( rule__Instance__ReferencingFuncsAssignment_10_1 ) ) )
            // InternalBSharp.g:7662:1: ( ( rule__Instance__ReferencingFuncsAssignment_10_1 ) )
            {
            // InternalBSharp.g:7662:1: ( ( rule__Instance__ReferencingFuncsAssignment_10_1 ) )
            // InternalBSharp.g:7663:2: ( rule__Instance__ReferencingFuncsAssignment_10_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstanceAccess().getReferencingFuncsAssignment_10_1()); 
            }
            // InternalBSharp.g:7664:2: ( rule__Instance__ReferencingFuncsAssignment_10_1 )
            // InternalBSharp.g:7664:3: rule__Instance__ReferencingFuncsAssignment_10_1
            {
            pushFollow(FOLLOW_2);
            rule__Instance__ReferencingFuncsAssignment_10_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstanceAccess().getReferencingFuncsAssignment_10_1()); 
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
    // $ANTLR end "rule__Instance__Group_10__1__Impl"


    // $ANTLR start "rule__Instance__Group_10__2"
    // InternalBSharp.g:7672:1: rule__Instance__Group_10__2 : rule__Instance__Group_10__2__Impl ;
    public final void rule__Instance__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7676:1: ( rule__Instance__Group_10__2__Impl )
            // InternalBSharp.g:7677:2: rule__Instance__Group_10__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Instance__Group_10__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:7683:1: rule__Instance__Group_10__2__Impl : ( ')' ) ;
    public final void rule__Instance__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7687:1: ( ( ')' ) )
            // InternalBSharp.g:7688:1: ( ')' )
            {
            // InternalBSharp.g:7688:1: ( ')' )
            // InternalBSharp.g:7689:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstanceAccess().getRightParenthesisKeyword_10_2()); 
            }
            match(input,46,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstanceAccess().getRightParenthesisKeyword_10_2()); 
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
    // $ANTLR end "rule__Instance__Group_10__2__Impl"


    // $ANTLR start "rule__ReferencingFunc__Group__0"
    // InternalBSharp.g:7699:1: rule__ReferencingFunc__Group__0 : rule__ReferencingFunc__Group__0__Impl rule__ReferencingFunc__Group__1 ;
    public final void rule__ReferencingFunc__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7703:1: ( rule__ReferencingFunc__Group__0__Impl rule__ReferencingFunc__Group__1 )
            // InternalBSharp.g:7704:2: rule__ReferencingFunc__Group__0__Impl rule__ReferencingFunc__Group__1
            {
            pushFollow(FOLLOW_57);
            rule__ReferencingFunc__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ReferencingFunc__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:7711:1: rule__ReferencingFunc__Group__0__Impl : ( ( rule__ReferencingFunc__NameAssignment_0 ) ) ;
    public final void rule__ReferencingFunc__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7715:1: ( ( ( rule__ReferencingFunc__NameAssignment_0 ) ) )
            // InternalBSharp.g:7716:1: ( ( rule__ReferencingFunc__NameAssignment_0 ) )
            {
            // InternalBSharp.g:7716:1: ( ( rule__ReferencingFunc__NameAssignment_0 ) )
            // InternalBSharp.g:7717:2: ( rule__ReferencingFunc__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferencingFuncAccess().getNameAssignment_0()); 
            }
            // InternalBSharp.g:7718:2: ( rule__ReferencingFunc__NameAssignment_0 )
            // InternalBSharp.g:7718:3: rule__ReferencingFunc__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ReferencingFunc__NameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferencingFuncAccess().getNameAssignment_0()); 
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
    // $ANTLR end "rule__ReferencingFunc__Group__0__Impl"


    // $ANTLR start "rule__ReferencingFunc__Group__1"
    // InternalBSharp.g:7726:1: rule__ReferencingFunc__Group__1 : rule__ReferencingFunc__Group__1__Impl rule__ReferencingFunc__Group__2 ;
    public final void rule__ReferencingFunc__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7730:1: ( rule__ReferencingFunc__Group__1__Impl rule__ReferencingFunc__Group__2 )
            // InternalBSharp.g:7731:2: rule__ReferencingFunc__Group__1__Impl rule__ReferencingFunc__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__ReferencingFunc__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ReferencingFunc__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:7738:1: rule__ReferencingFunc__Group__1__Impl : ( '=' ) ;
    public final void rule__ReferencingFunc__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7742:1: ( ( '=' ) )
            // InternalBSharp.g:7743:1: ( '=' )
            {
            // InternalBSharp.g:7743:1: ( '=' )
            // InternalBSharp.g:7744:2: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferencingFuncAccess().getEqualsSignKeyword_1()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferencingFuncAccess().getEqualsSignKeyword_1()); 
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
    // $ANTLR end "rule__ReferencingFunc__Group__1__Impl"


    // $ANTLR start "rule__ReferencingFunc__Group__2"
    // InternalBSharp.g:7753:1: rule__ReferencingFunc__Group__2 : rule__ReferencingFunc__Group__2__Impl ;
    public final void rule__ReferencingFunc__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7757:1: ( rule__ReferencingFunc__Group__2__Impl )
            // InternalBSharp.g:7758:2: rule__ReferencingFunc__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReferencingFunc__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBSharp.g:7764:1: rule__ReferencingFunc__Group__2__Impl : ( ( rule__ReferencingFunc__ReferencedFuncAssignment_2 ) ) ;
    public final void rule__ReferencingFunc__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7768:1: ( ( ( rule__ReferencingFunc__ReferencedFuncAssignment_2 ) ) )
            // InternalBSharp.g:7769:1: ( ( rule__ReferencingFunc__ReferencedFuncAssignment_2 ) )
            {
            // InternalBSharp.g:7769:1: ( ( rule__ReferencingFunc__ReferencedFuncAssignment_2 ) )
            // InternalBSharp.g:7770:2: ( rule__ReferencingFunc__ReferencedFuncAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferencingFuncAccess().getReferencedFuncAssignment_2()); 
            }
            // InternalBSharp.g:7771:2: ( rule__ReferencingFunc__ReferencedFuncAssignment_2 )
            // InternalBSharp.g:7771:3: rule__ReferencingFunc__ReferencedFuncAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ReferencingFunc__ReferencedFuncAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferencingFuncAccess().getReferencedFuncAssignment_2()); 
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
    // $ANTLR end "rule__ReferencingFunc__Group__2__Impl"


    // $ANTLR start "rule__TopLevel__NameAssignment_1"
    // InternalBSharp.g:7780:1: rule__TopLevel__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__TopLevel__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7784:1: ( ( ruleQualifiedName ) )
            // InternalBSharp.g:7785:2: ( ruleQualifiedName )
            {
            // InternalBSharp.g:7785:2: ( ruleQualifiedName )
            // InternalBSharp.g:7786:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTopLevelAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTopLevelAccess().getNameQualifiedNameParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__TopLevel__NameAssignment_1"


    // $ANTLR start "rule__TopLevel__TopLevelFileAssignment_2"
    // InternalBSharp.g:7795:1: rule__TopLevel__TopLevelFileAssignment_2 : ( ruleTopLevelFile ) ;
    public final void rule__TopLevel__TopLevelFileAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7799:1: ( ( ruleTopLevelFile ) )
            // InternalBSharp.g:7800:2: ( ruleTopLevelFile )
            {
            // InternalBSharp.g:7800:2: ( ruleTopLevelFile )
            // InternalBSharp.g:7801:3: ruleTopLevelFile
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTopLevelAccess().getTopLevelFileTopLevelFileParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTopLevelFile();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTopLevelAccess().getTopLevelFileTopLevelFileParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__TopLevel__TopLevelFileAssignment_2"


    // $ANTLR start "rule__TopLevelFile__NoImportElementsAssignment_1"
    // InternalBSharp.g:7810:1: rule__TopLevelFile__NoImportElementsAssignment_1 : ( ruleTopLevelInstance ) ;
    public final void rule__TopLevelFile__NoImportElementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7814:1: ( ( ruleTopLevelInstance ) )
            // InternalBSharp.g:7815:2: ( ruleTopLevelInstance )
            {
            // InternalBSharp.g:7815:2: ( ruleTopLevelInstance )
            // InternalBSharp.g:7816:3: ruleTopLevelInstance
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTopLevelFileAccess().getNoImportElementsTopLevelInstanceParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTopLevelInstance();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTopLevelFileAccess().getNoImportElementsTopLevelInstanceParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__TopLevelFile__NoImportElementsAssignment_1"


    // $ANTLR start "rule__TopLevelFile__TopLevelImportsAssignment_2"
    // InternalBSharp.g:7825:1: rule__TopLevelFile__TopLevelImportsAssignment_2 : ( ruleTopLevelImport ) ;
    public final void rule__TopLevelFile__TopLevelImportsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7829:1: ( ( ruleTopLevelImport ) )
            // InternalBSharp.g:7830:2: ( ruleTopLevelImport )
            {
            // InternalBSharp.g:7830:2: ( ruleTopLevelImport )
            // InternalBSharp.g:7831:3: ruleTopLevelImport
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTopLevelFileAccess().getTopLevelImportsTopLevelImportParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTopLevelImport();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTopLevelFileAccess().getTopLevelImportsTopLevelImportParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__TopLevelFile__TopLevelImportsAssignment_2"


    // $ANTLR start "rule__TopLevelImport__ImportsAssignment_0"
    // InternalBSharp.g:7840:1: rule__TopLevelImport__ImportsAssignment_0 : ( ruleImport ) ;
    public final void rule__TopLevelImport__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7844:1: ( ( ruleImport ) )
            // InternalBSharp.g:7845:2: ( ruleImport )
            {
            // InternalBSharp.g:7845:2: ( ruleImport )
            // InternalBSharp.g:7846:3: ruleImport
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTopLevelImportAccess().getImportsImportParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleImport();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTopLevelImportAccess().getImportsImportParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__TopLevelImport__ImportsAssignment_0"


    // $ANTLR start "rule__TopLevelImport__BodyElementsAssignment_1"
    // InternalBSharp.g:7855:1: rule__TopLevelImport__BodyElementsAssignment_1 : ( ruleTopLevelInstance ) ;
    public final void rule__TopLevelImport__BodyElementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7859:1: ( ( ruleTopLevelInstance ) )
            // InternalBSharp.g:7860:2: ( ruleTopLevelInstance )
            {
            // InternalBSharp.g:7860:2: ( ruleTopLevelInstance )
            // InternalBSharp.g:7861:3: ruleTopLevelInstance
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTopLevelImportAccess().getBodyElementsTopLevelInstanceParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTopLevelInstance();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTopLevelImportAccess().getBodyElementsTopLevelInstanceParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__TopLevelImport__BodyElementsAssignment_1"


    // $ANTLR start "rule__GlobalImport__ProjectAssignment_1"
    // InternalBSharp.g:7870:1: rule__GlobalImport__ProjectAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__GlobalImport__ProjectAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7874:1: ( ( ruleQualifiedName ) )
            // InternalBSharp.g:7875:2: ( ruleQualifiedName )
            {
            // InternalBSharp.g:7875:2: ( ruleQualifiedName )
            // InternalBSharp.g:7876:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGlobalImportAccess().getProjectQualifiedNameParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGlobalImportAccess().getProjectQualifiedNameParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__GlobalImport__ProjectAssignment_1"


    // $ANTLR start "rule__GlobalImport__FileImportsAssignment_3"
    // InternalBSharp.g:7885:1: rule__GlobalImport__FileImportsAssignment_3 : ( ruleFileImport ) ;
    public final void rule__GlobalImport__FileImportsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7889:1: ( ( ruleFileImport ) )
            // InternalBSharp.g:7890:2: ( ruleFileImport )
            {
            // InternalBSharp.g:7890:2: ( ruleFileImport )
            // InternalBSharp.g:7891:3: ruleFileImport
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGlobalImportAccess().getFileImportsFileImportParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleFileImport();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGlobalImportAccess().getFileImportsFileImportParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__GlobalImport__FileImportsAssignment_3"


    // $ANTLR start "rule__FileImport__FileReferenceAssignment_0"
    // InternalBSharp.g:7900:1: rule__FileImport__FileReferenceAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__FileImport__FileReferenceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7904:1: ( ( ( RULE_ID ) ) )
            // InternalBSharp.g:7905:2: ( ( RULE_ID ) )
            {
            // InternalBSharp.g:7905:2: ( ( RULE_ID ) )
            // InternalBSharp.g:7906:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFileImportAccess().getFileReferenceTopLevelFileCrossReference_0_0()); 
            }
            // InternalBSharp.g:7907:3: ( RULE_ID )
            // InternalBSharp.g:7908:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFileImportAccess().getFileReferenceTopLevelFileIDTerminalRuleCall_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFileImportAccess().getFileReferenceTopLevelFileIDTerminalRuleCall_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFileImportAccess().getFileReferenceTopLevelFileCrossReference_0_0()); 
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
    // $ANTLR end "rule__FileImport__FileReferenceAssignment_0"


    // $ANTLR start "rule__FileImport__TypeAssignment_1_1_1"
    // InternalBSharp.g:7919:1: rule__FileImport__TypeAssignment_1_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__FileImport__TypeAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7923:1: ( ( ( RULE_ID ) ) )
            // InternalBSharp.g:7924:2: ( ( RULE_ID ) )
            {
            // InternalBSharp.g:7924:2: ( ( RULE_ID ) )
            // InternalBSharp.g:7925:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFileImportAccess().getTypeTopLevelInstanceCrossReference_1_1_1_0()); 
            }
            // InternalBSharp.g:7926:3: ( RULE_ID )
            // InternalBSharp.g:7927:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFileImportAccess().getTypeTopLevelInstanceIDTerminalRuleCall_1_1_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFileImportAccess().getTypeTopLevelInstanceIDTerminalRuleCall_1_1_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFileImportAccess().getTypeTopLevelInstanceCrossReference_1_1_1_0()); 
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
    // $ANTLR end "rule__FileImport__TypeAssignment_1_1_1"


    // $ANTLR start "rule__LocalImport__FileImportsAssignment_1"
    // InternalBSharp.g:7938:1: rule__LocalImport__FileImportsAssignment_1 : ( ruleFileImport ) ;
    public final void rule__LocalImport__FileImportsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7942:1: ( ( ruleFileImport ) )
            // InternalBSharp.g:7943:2: ( ruleFileImport )
            {
            // InternalBSharp.g:7943:2: ( ruleFileImport )
            // InternalBSharp.g:7944:3: ruleFileImport
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalImportAccess().getFileImportsFileImportParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleFileImport();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalImportAccess().getFileImportsFileImportParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__LocalImport__FileImportsAssignment_1"


    // $ANTLR start "rule__Class__NameAssignment_1"
    // InternalBSharp.g:7953:1: rule__Class__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Class__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7957:1: ( ( RULE_ID ) )
            // InternalBSharp.g:7958:2: ( RULE_ID )
            {
            // InternalBSharp.g:7958:2: ( RULE_ID )
            // InternalBSharp.g:7959:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getNameIDTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__Class__NameAssignment_1"


    // $ANTLR start "rule__Class__RawContextAssignment_2"
    // InternalBSharp.g:7968:1: rule__Class__RawContextAssignment_2 : ( rulePolyContext ) ;
    public final void rule__Class__RawContextAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7972:1: ( ( rulePolyContext ) )
            // InternalBSharp.g:7973:2: ( rulePolyContext )
            {
            // InternalBSharp.g:7973:2: ( rulePolyContext )
            // InternalBSharp.g:7974:3: rulePolyContext
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getRawContextPolyContextParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePolyContext();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getRawContextPolyContextParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__Class__RawContextAssignment_2"


    // $ANTLR start "rule__Class__InstNameAssignment_3_1"
    // InternalBSharp.g:7983:1: rule__Class__InstNameAssignment_3_1 : ( ruleInstName ) ;
    public final void rule__Class__InstNameAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7987:1: ( ( ruleInstName ) )
            // InternalBSharp.g:7988:2: ( ruleInstName )
            {
            // InternalBSharp.g:7988:2: ( ruleInstName )
            // InternalBSharp.g:7989:3: ruleInstName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getInstNameInstNameParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleInstName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getInstNameInstNameParserRuleCall_3_1_0()); 
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
    // $ANTLR end "rule__Class__InstNameAssignment_3_1"


    // $ANTLR start "rule__Class__SupertypesAssignment_4"
    // InternalBSharp.g:7998:1: rule__Class__SupertypesAssignment_4 : ( ruleSuperTypeList ) ;
    public final void rule__Class__SupertypesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8002:1: ( ( ruleSuperTypeList ) )
            // InternalBSharp.g:8003:2: ( ruleSuperTypeList )
            {
            // InternalBSharp.g:8003:2: ( ruleSuperTypeList )
            // InternalBSharp.g:8004:3: ruleSuperTypeList
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getSupertypesSuperTypeListParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSuperTypeList();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getSupertypesSuperTypeListParserRuleCall_4_0()); 
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
    // $ANTLR end "rule__Class__SupertypesAssignment_4"


    // $ANTLR start "rule__Class__VarListAssignment_5_1"
    // InternalBSharp.g:8013:1: rule__Class__VarListAssignment_5_1 : ( ruleTypedVariableList ) ;
    public final void rule__Class__VarListAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8017:1: ( ( ruleTypedVariableList ) )
            // InternalBSharp.g:8018:2: ( ruleTypedVariableList )
            {
            // InternalBSharp.g:8018:2: ( ruleTypedVariableList )
            // InternalBSharp.g:8019:3: ruleTypedVariableList
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getVarListTypedVariableListParserRuleCall_5_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTypedVariableList();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getVarListTypedVariableListParserRuleCall_5_1_0()); 
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
    // $ANTLR end "rule__Class__VarListAssignment_5_1"


    // $ANTLR start "rule__Class__WhereAssignment_6"
    // InternalBSharp.g:8028:1: rule__Class__WhereAssignment_6 : ( ruleWhere ) ;
    public final void rule__Class__WhereAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8032:1: ( ( ruleWhere ) )
            // InternalBSharp.g:8033:2: ( ruleWhere )
            {
            // InternalBSharp.g:8033:2: ( ruleWhere )
            // InternalBSharp.g:8034:3: ruleWhere
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getWhereWhereParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleWhere();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getWhereWhereParserRuleCall_6_0()); 
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
    // $ANTLR end "rule__Class__WhereAssignment_6"


    // $ANTLR start "rule__Class__BlockAssignment_8"
    // InternalBSharp.g:8043:1: rule__Class__BlockAssignment_8 : ( ruleBSharpBlock ) ;
    public final void rule__Class__BlockAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8047:1: ( ( ruleBSharpBlock ) )
            // InternalBSharp.g:8048:2: ( ruleBSharpBlock )
            {
            // InternalBSharp.g:8048:2: ( ruleBSharpBlock )
            // InternalBSharp.g:8049:3: ruleBSharpBlock
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getBlockBSharpBlockParserRuleCall_8_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBSharpBlock();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getBlockBSharpBlockParserRuleCall_8_0()); 
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
    // $ANTLR end "rule__Class__BlockAssignment_8"


    // $ANTLR start "rule__InstName__NameAssignment"
    // InternalBSharp.g:8058:1: rule__InstName__NameAssignment : ( RULE_ID ) ;
    public final void rule__InstName__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8062:1: ( ( RULE_ID ) )
            // InternalBSharp.g:8063:2: ( RULE_ID )
            {
            // InternalBSharp.g:8063:2: ( RULE_ID )
            // InternalBSharp.g:8064:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstNameAccess().getNameIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstNameAccess().getNameIDTerminalRuleCall_0()); 
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
    // $ANTLR end "rule__InstName__NameAssignment"


    // $ANTLR start "rule__PolyContext__PolyTypesAssignment_1"
    // InternalBSharp.g:8073:1: rule__PolyContext__PolyTypesAssignment_1 : ( rulePolyType ) ;
    public final void rule__PolyContext__PolyTypesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8077:1: ( ( rulePolyType ) )
            // InternalBSharp.g:8078:2: ( rulePolyType )
            {
            // InternalBSharp.g:8078:2: ( rulePolyType )
            // InternalBSharp.g:8079:3: rulePolyType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPolyContextAccess().getPolyTypesPolyTypeParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePolyType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPolyContextAccess().getPolyTypesPolyTypeParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__PolyContext__PolyTypesAssignment_1"


    // $ANTLR start "rule__PolyType__NameAssignment_0"
    // InternalBSharp.g:8088:1: rule__PolyType__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__PolyType__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8092:1: ( ( RULE_ID ) )
            // InternalBSharp.g:8093:2: ( RULE_ID )
            {
            // InternalBSharp.g:8093:2: ( RULE_ID )
            // InternalBSharp.g:8094:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPolyTypeAccess().getNameIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPolyTypeAccess().getNameIDTerminalRuleCall_0_0()); 
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
    // $ANTLR end "rule__PolyType__NameAssignment_0"


    // $ANTLR start "rule__PolyType__SuperTypesAssignment_1_1"
    // InternalBSharp.g:8103:1: rule__PolyType__SuperTypesAssignment_1_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__PolyType__SuperTypesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8107:1: ( ( ( ruleQualifiedName ) ) )
            // InternalBSharp.g:8108:2: ( ( ruleQualifiedName ) )
            {
            // InternalBSharp.g:8108:2: ( ( ruleQualifiedName ) )
            // InternalBSharp.g:8109:3: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPolyTypeAccess().getSuperTypesClassDeclCrossReference_1_1_0()); 
            }
            // InternalBSharp.g:8110:3: ( ruleQualifiedName )
            // InternalBSharp.g:8111:4: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPolyTypeAccess().getSuperTypesClassDeclQualifiedNameParserRuleCall_1_1_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPolyTypeAccess().getSuperTypesClassDeclQualifiedNameParserRuleCall_1_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPolyTypeAccess().getSuperTypesClassDeclCrossReference_1_1_0()); 
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
    // $ANTLR end "rule__PolyType__SuperTypesAssignment_1_1"


    // $ANTLR start "rule__PolyType__SuperTypesAssignment_1_2_1"
    // InternalBSharp.g:8122:1: rule__PolyType__SuperTypesAssignment_1_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__PolyType__SuperTypesAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8126:1: ( ( ( ruleQualifiedName ) ) )
            // InternalBSharp.g:8127:2: ( ( ruleQualifiedName ) )
            {
            // InternalBSharp.g:8127:2: ( ( ruleQualifiedName ) )
            // InternalBSharp.g:8128:3: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPolyTypeAccess().getSuperTypesClassDeclCrossReference_1_2_1_0()); 
            }
            // InternalBSharp.g:8129:3: ( ruleQualifiedName )
            // InternalBSharp.g:8130:4: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPolyTypeAccess().getSuperTypesClassDeclQualifiedNameParserRuleCall_1_2_1_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPolyTypeAccess().getSuperTypesClassDeclQualifiedNameParserRuleCall_1_2_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPolyTypeAccess().getSuperTypesClassDeclCrossReference_1_2_1_0()); 
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
    // $ANTLR end "rule__PolyType__SuperTypesAssignment_1_2_1"


    // $ANTLR start "rule__SuperTypeList__SuperTypesAssignment_1"
    // InternalBSharp.g:8141:1: rule__SuperTypeList__SuperTypesAssignment_1 : ( ruleConstructedType ) ;
    public final void rule__SuperTypeList__SuperTypesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8145:1: ( ( ruleConstructedType ) )
            // InternalBSharp.g:8146:2: ( ruleConstructedType )
            {
            // InternalBSharp.g:8146:2: ( ruleConstructedType )
            // InternalBSharp.g:8147:3: ruleConstructedType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSuperTypeListAccess().getSuperTypesConstructedTypeParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleConstructedType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSuperTypeListAccess().getSuperTypesConstructedTypeParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__SuperTypeList__SuperTypesAssignment_1"


    // $ANTLR start "rule__SuperTypeList__SuperTypesAssignment_2_1"
    // InternalBSharp.g:8156:1: rule__SuperTypeList__SuperTypesAssignment_2_1 : ( ruleConstructedType ) ;
    public final void rule__SuperTypeList__SuperTypesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8160:1: ( ( ruleConstructedType ) )
            // InternalBSharp.g:8161:2: ( ruleConstructedType )
            {
            // InternalBSharp.g:8161:2: ( ruleConstructedType )
            // InternalBSharp.g:8162:3: ruleConstructedType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSuperTypeListAccess().getSuperTypesConstructedTypeParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleConstructedType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSuperTypeListAccess().getSuperTypesConstructedTypeParserRuleCall_2_1_0()); 
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
    // $ANTLR end "rule__SuperTypeList__SuperTypesAssignment_2_1"


    // $ANTLR start "rule__ConstructedType__ConstructorAssignment_1_1"
    // InternalBSharp.g:8171:1: rule__ConstructedType__ConstructorAssignment_1_1 : ( ruleBuiltinTypeInfixOp ) ;
    public final void rule__ConstructedType__ConstructorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8175:1: ( ( ruleBuiltinTypeInfixOp ) )
            // InternalBSharp.g:8176:2: ( ruleBuiltinTypeInfixOp )
            {
            // InternalBSharp.g:8176:2: ( ruleBuiltinTypeInfixOp )
            // InternalBSharp.g:8177:3: ruleBuiltinTypeInfixOp
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstructedTypeAccess().getConstructorBuiltinTypeInfixOpParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBuiltinTypeInfixOp();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstructedTypeAccess().getConstructorBuiltinTypeInfixOpParserRuleCall_1_1_0()); 
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
    // $ANTLR end "rule__ConstructedType__ConstructorAssignment_1_1"


    // $ANTLR start "rule__ConstructedType__RightAssignment_1_2"
    // InternalBSharp.g:8186:1: rule__ConstructedType__RightAssignment_1_2 : ( ruleBuilderElem ) ;
    public final void rule__ConstructedType__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8190:1: ( ( ruleBuilderElem ) )
            // InternalBSharp.g:8191:2: ( ruleBuilderElem )
            {
            // InternalBSharp.g:8191:2: ( ruleBuilderElem )
            // InternalBSharp.g:8192:3: ruleBuilderElem
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstructedTypeAccess().getRightBuilderElemParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBuilderElem();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstructedTypeAccess().getRightBuilderElemParserRuleCall_1_2_0()); 
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
    // $ANTLR end "rule__ConstructedType__RightAssignment_1_2"


    // $ANTLR start "rule__TypeConstructor__TypeNameAssignment_0"
    // InternalBSharp.g:8201:1: rule__TypeConstructor__TypeNameAssignment_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__TypeConstructor__TypeNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8205:1: ( ( ( ruleQualifiedName ) ) )
            // InternalBSharp.g:8206:2: ( ( ruleQualifiedName ) )
            {
            // InternalBSharp.g:8206:2: ( ( ruleQualifiedName ) )
            // InternalBSharp.g:8207:3: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeConstructorAccess().getTypeNameGenNameCrossReference_0_0()); 
            }
            // InternalBSharp.g:8208:3: ( ruleQualifiedName )
            // InternalBSharp.g:8209:4: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeConstructorAccess().getTypeNameGenNameQualifiedNameParserRuleCall_0_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeConstructorAccess().getTypeNameGenNameQualifiedNameParserRuleCall_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeConstructorAccess().getTypeNameGenNameCrossReference_0_0()); 
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
    // $ANTLR end "rule__TypeConstructor__TypeNameAssignment_0"


    // $ANTLR start "rule__TypeConstructor__ContextAssignment_1"
    // InternalBSharp.g:8220:1: rule__TypeConstructor__ContextAssignment_1 : ( ruleTypeDeclContext ) ;
    public final void rule__TypeConstructor__ContextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8224:1: ( ( ruleTypeDeclContext ) )
            // InternalBSharp.g:8225:2: ( ruleTypeDeclContext )
            {
            // InternalBSharp.g:8225:2: ( ruleTypeDeclContext )
            // InternalBSharp.g:8226:3: ruleTypeDeclContext
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeConstructorAccess().getContextTypeDeclContextParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTypeDeclContext();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeConstructorAccess().getContextTypeDeclContextParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__TypeConstructor__ContextAssignment_1"


    // $ANTLR start "rule__TypePowerSet__ChildAssignment_2"
    // InternalBSharp.g:8235:1: rule__TypePowerSet__ChildAssignment_2 : ( ruleConstructedType ) ;
    public final void rule__TypePowerSet__ChildAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8239:1: ( ( ruleConstructedType ) )
            // InternalBSharp.g:8240:2: ( ruleConstructedType )
            {
            // InternalBSharp.g:8240:2: ( ruleConstructedType )
            // InternalBSharp.g:8241:3: ruleConstructedType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypePowerSetAccess().getChildConstructedTypeParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleConstructedType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypePowerSetAccess().getChildConstructedTypeParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__TypePowerSet__ChildAssignment_2"


    // $ANTLR start "rule__TypeConstrBracket__ChildAssignment_1"
    // InternalBSharp.g:8250:1: rule__TypeConstrBracket__ChildAssignment_1 : ( ruleConstructedType ) ;
    public final void rule__TypeConstrBracket__ChildAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8254:1: ( ( ruleConstructedType ) )
            // InternalBSharp.g:8255:2: ( ruleConstructedType )
            {
            // InternalBSharp.g:8255:2: ( ruleConstructedType )
            // InternalBSharp.g:8256:3: ruleConstructedType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeConstrBracketAccess().getChildConstructedTypeParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleConstructedType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeConstrBracketAccess().getChildConstructedTypeParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__TypeConstrBracket__ChildAssignment_1"


    // $ANTLR start "rule__TypeDeclContext__TypeNameAssignment_1"
    // InternalBSharp.g:8265:1: rule__TypeDeclContext__TypeNameAssignment_1 : ( ruleConstructedType ) ;
    public final void rule__TypeDeclContext__TypeNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8269:1: ( ( ruleConstructedType ) )
            // InternalBSharp.g:8270:2: ( ruleConstructedType )
            {
            // InternalBSharp.g:8270:2: ( ruleConstructedType )
            // InternalBSharp.g:8271:3: ruleConstructedType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeDeclContextAccess().getTypeNameConstructedTypeParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleConstructedType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeDeclContextAccess().getTypeNameConstructedTypeParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__TypeDeclContext__TypeNameAssignment_1"


    // $ANTLR start "rule__TypeDeclContext__TypeNameAssignment_2_1"
    // InternalBSharp.g:8280:1: rule__TypeDeclContext__TypeNameAssignment_2_1 : ( ruleConstructedType ) ;
    public final void rule__TypeDeclContext__TypeNameAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8284:1: ( ( ruleConstructedType ) )
            // InternalBSharp.g:8285:2: ( ruleConstructedType )
            {
            // InternalBSharp.g:8285:2: ( ruleConstructedType )
            // InternalBSharp.g:8286:3: ruleConstructedType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeDeclContextAccess().getTypeNameConstructedTypeParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleConstructedType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeDeclContextAccess().getTypeNameConstructedTypeParserRuleCall_2_1_0()); 
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
    // $ANTLR end "rule__TypeDeclContext__TypeNameAssignment_2_1"


    // $ANTLR start "rule__Where__ExpressionsAssignment_1"
    // InternalBSharp.g:8295:1: rule__Where__ExpressionsAssignment_1 : ( ruleRootExpression ) ;
    public final void rule__Where__ExpressionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8299:1: ( ( ruleRootExpression ) )
            // InternalBSharp.g:8300:2: ( ruleRootExpression )
            {
            // InternalBSharp.g:8300:2: ( ruleRootExpression )
            // InternalBSharp.g:8301:3: ruleRootExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhereAccess().getExpressionsRootExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleRootExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhereAccess().getExpressionsRootExpressionParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__Where__ExpressionsAssignment_1"


    // $ANTLR start "rule__Where__ExpressionsAssignment_2_1"
    // InternalBSharp.g:8310:1: rule__Where__ExpressionsAssignment_2_1 : ( ruleRootExpression ) ;
    public final void rule__Where__ExpressionsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8314:1: ( ( ruleRootExpression ) )
            // InternalBSharp.g:8315:2: ( ruleRootExpression )
            {
            // InternalBSharp.g:8315:2: ( ruleRootExpression )
            // InternalBSharp.g:8316:3: ruleRootExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhereAccess().getExpressionsRootExpressionParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleRootExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhereAccess().getExpressionsRootExpressionParserRuleCall_2_1_0()); 
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
    // $ANTLR end "rule__Where__ExpressionsAssignment_2_1"


    // $ANTLR start "rule__Datatype__NameAssignment_1"
    // InternalBSharp.g:8325:1: rule__Datatype__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Datatype__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8329:1: ( ( RULE_ID ) )
            // InternalBSharp.g:8330:2: ( RULE_ID )
            {
            // InternalBSharp.g:8330:2: ( RULE_ID )
            // InternalBSharp.g:8331:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDatatypeAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDatatypeAccess().getNameIDTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__Datatype__NameAssignment_1"


    // $ANTLR start "rule__Datatype__RawContextAssignment_2"
    // InternalBSharp.g:8340:1: rule__Datatype__RawContextAssignment_2 : ( rulePolyContext ) ;
    public final void rule__Datatype__RawContextAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8344:1: ( ( rulePolyContext ) )
            // InternalBSharp.g:8345:2: ( rulePolyContext )
            {
            // InternalBSharp.g:8345:2: ( rulePolyContext )
            // InternalBSharp.g:8346:3: rulePolyContext
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDatatypeAccess().getRawContextPolyContextParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePolyContext();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDatatypeAccess().getRawContextPolyContextParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__Datatype__RawContextAssignment_2"


    // $ANTLR start "rule__Datatype__ConstructorsAssignment_3_1"
    // InternalBSharp.g:8355:1: rule__Datatype__ConstructorsAssignment_3_1 : ( ruleDatatypeConstructor ) ;
    public final void rule__Datatype__ConstructorsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8359:1: ( ( ruleDatatypeConstructor ) )
            // InternalBSharp.g:8360:2: ( ruleDatatypeConstructor )
            {
            // InternalBSharp.g:8360:2: ( ruleDatatypeConstructor )
            // InternalBSharp.g:8361:3: ruleDatatypeConstructor
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDatatypeAccess().getConstructorsDatatypeConstructorParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDatatypeConstructor();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDatatypeAccess().getConstructorsDatatypeConstructorParserRuleCall_3_1_0()); 
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
    // $ANTLR end "rule__Datatype__ConstructorsAssignment_3_1"


    // $ANTLR start "rule__Datatype__BlockAssignment_4"
    // InternalBSharp.g:8370:1: rule__Datatype__BlockAssignment_4 : ( ruleBSharpBlock ) ;
    public final void rule__Datatype__BlockAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8374:1: ( ( ruleBSharpBlock ) )
            // InternalBSharp.g:8375:2: ( ruleBSharpBlock )
            {
            // InternalBSharp.g:8375:2: ( ruleBSharpBlock )
            // InternalBSharp.g:8376:3: ruleBSharpBlock
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDatatypeAccess().getBlockBSharpBlockParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBSharpBlock();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDatatypeAccess().getBlockBSharpBlockParserRuleCall_4_0()); 
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
    // $ANTLR end "rule__Datatype__BlockAssignment_4"


    // $ANTLR start "rule__DatatypeConstructor__NameAssignment_0"
    // InternalBSharp.g:8385:1: rule__DatatypeConstructor__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__DatatypeConstructor__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8389:1: ( ( RULE_ID ) )
            // InternalBSharp.g:8390:2: ( RULE_ID )
            {
            // InternalBSharp.g:8390:2: ( RULE_ID )
            // InternalBSharp.g:8391:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDatatypeConstructorAccess().getNameIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDatatypeConstructorAccess().getNameIDTerminalRuleCall_0_0()); 
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
    // $ANTLR end "rule__DatatypeConstructor__NameAssignment_0"


    // $ANTLR start "rule__DatatypeConstructor__DeconsAssignment_1_1"
    // InternalBSharp.g:8400:1: rule__DatatypeConstructor__DeconsAssignment_1_1 : ( ruleTypedVariableList ) ;
    public final void rule__DatatypeConstructor__DeconsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8404:1: ( ( ruleTypedVariableList ) )
            // InternalBSharp.g:8405:2: ( ruleTypedVariableList )
            {
            // InternalBSharp.g:8405:2: ( ruleTypedVariableList )
            // InternalBSharp.g:8406:3: ruleTypedVariableList
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDatatypeConstructorAccess().getDeconsTypedVariableListParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTypedVariableList();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDatatypeConstructorAccess().getDeconsTypedVariableListParserRuleCall_1_1_0()); 
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
    // $ANTLR end "rule__DatatypeConstructor__DeconsAssignment_1_1"


    // $ANTLR start "rule__Extend__ExtendedClassAssignment_1"
    // InternalBSharp.g:8415:1: rule__Extend__ExtendedClassAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Extend__ExtendedClassAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8419:1: ( ( ( ruleQualifiedName ) ) )
            // InternalBSharp.g:8420:2: ( ( ruleQualifiedName ) )
            {
            // InternalBSharp.g:8420:2: ( ( ruleQualifiedName ) )
            // InternalBSharp.g:8421:3: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendAccess().getExtendedClassClassDeclCrossReference_1_0()); 
            }
            // InternalBSharp.g:8422:3: ( ruleQualifiedName )
            // InternalBSharp.g:8423:4: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendAccess().getExtendedClassClassDeclQualifiedNameParserRuleCall_1_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExtendAccess().getExtendedClassClassDeclQualifiedNameParserRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExtendAccess().getExtendedClassClassDeclCrossReference_1_0()); 
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
    // $ANTLR end "rule__Extend__ExtendedClassAssignment_1"


    // $ANTLR start "rule__Extend__NameAssignment_3"
    // InternalBSharp.g:8434:1: rule__Extend__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Extend__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8438:1: ( ( RULE_ID ) )
            // InternalBSharp.g:8439:2: ( RULE_ID )
            {
            // InternalBSharp.g:8439:2: ( RULE_ID )
            // InternalBSharp.g:8440:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendAccess().getNameIDTerminalRuleCall_3_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExtendAccess().getNameIDTerminalRuleCall_3_0()); 
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
    // $ANTLR end "rule__Extend__NameAssignment_3"


    // $ANTLR start "rule__Extend__BlockAssignment_5"
    // InternalBSharp.g:8449:1: rule__Extend__BlockAssignment_5 : ( ruleBSharpBlock ) ;
    public final void rule__Extend__BlockAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8453:1: ( ( ruleBSharpBlock ) )
            // InternalBSharp.g:8454:2: ( ruleBSharpBlock )
            {
            // InternalBSharp.g:8454:2: ( ruleBSharpBlock )
            // InternalBSharp.g:8455:3: ruleBSharpBlock
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendAccess().getBlockBSharpBlockParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBSharpBlock();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExtendAccess().getBlockBSharpBlockParserRuleCall_5_0()); 
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
    // $ANTLR end "rule__Extend__BlockAssignment_5"


    // $ANTLR start "rule__BSharpBlock__FunctionsAssignment_2_0"
    // InternalBSharp.g:8464:1: rule__BSharpBlock__FunctionsAssignment_2_0 : ( ruleFunctionDecl ) ;
    public final void rule__BSharpBlock__FunctionsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8468:1: ( ( ruleFunctionDecl ) )
            // InternalBSharp.g:8469:2: ( ruleFunctionDecl )
            {
            // InternalBSharp.g:8469:2: ( ruleFunctionDecl )
            // InternalBSharp.g:8470:3: ruleFunctionDecl
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSharpBlockAccess().getFunctionsFunctionDeclParserRuleCall_2_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleFunctionDecl();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSharpBlockAccess().getFunctionsFunctionDeclParserRuleCall_2_0_0()); 
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
    // $ANTLR end "rule__BSharpBlock__FunctionsAssignment_2_0"


    // $ANTLR start "rule__BSharpBlock__TheoremsAssignment_2_1"
    // InternalBSharp.g:8479:1: rule__BSharpBlock__TheoremsAssignment_2_1 : ( ruleTheoremBody ) ;
    public final void rule__BSharpBlock__TheoremsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8483:1: ( ( ruleTheoremBody ) )
            // InternalBSharp.g:8484:2: ( ruleTheoremBody )
            {
            // InternalBSharp.g:8484:2: ( ruleTheoremBody )
            // InternalBSharp.g:8485:3: ruleTheoremBody
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSharpBlockAccess().getTheoremsTheoremBodyParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTheoremBody();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSharpBlockAccess().getTheoremsTheoremBodyParserRuleCall_2_1_0()); 
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
    // $ANTLR end "rule__BSharpBlock__TheoremsAssignment_2_1"


    // $ANTLR start "rule__BSharpBlock__TheoremsAssignment_2_2"
    // InternalBSharp.g:8494:1: rule__BSharpBlock__TheoremsAssignment_2_2 : ( ruleInstance ) ;
    public final void rule__BSharpBlock__TheoremsAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8498:1: ( ( ruleInstance ) )
            // InternalBSharp.g:8499:2: ( ruleInstance )
            {
            // InternalBSharp.g:8499:2: ( ruleInstance )
            // InternalBSharp.g:8500:3: ruleInstance
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSharpBlockAccess().getTheoremsInstanceParserRuleCall_2_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleInstance();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSharpBlockAccess().getTheoremsInstanceParserRuleCall_2_2_0()); 
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
    // $ANTLR end "rule__BSharpBlock__TheoremsAssignment_2_2"


    // $ANTLR start "rule__FunctionDecl__NameAssignment_0"
    // InternalBSharp.g:8509:1: rule__FunctionDecl__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__FunctionDecl__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8513:1: ( ( RULE_ID ) )
            // InternalBSharp.g:8514:2: ( RULE_ID )
            {
            // InternalBSharp.g:8514:2: ( RULE_ID )
            // InternalBSharp.g:8515:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionDeclAccess().getNameIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionDeclAccess().getNameIDTerminalRuleCall_0_0()); 
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
    // $ANTLR end "rule__FunctionDecl__NameAssignment_0"


    // $ANTLR start "rule__FunctionDecl__ContextAssignment_1"
    // InternalBSharp.g:8524:1: rule__FunctionDecl__ContextAssignment_1 : ( rulePolyContext ) ;
    public final void rule__FunctionDecl__ContextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8528:1: ( ( rulePolyContext ) )
            // InternalBSharp.g:8529:2: ( rulePolyContext )
            {
            // InternalBSharp.g:8529:2: ( rulePolyContext )
            // InternalBSharp.g:8530:3: rulePolyContext
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionDeclAccess().getContextPolyContextParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePolyContext();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionDeclAccess().getContextPolyContextParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__FunctionDecl__ContextAssignment_1"


    // $ANTLR start "rule__FunctionDecl__VarListAssignment_3"
    // InternalBSharp.g:8539:1: rule__FunctionDecl__VarListAssignment_3 : ( ruleTypedVariableList ) ;
    public final void rule__FunctionDecl__VarListAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8543:1: ( ( ruleTypedVariableList ) )
            // InternalBSharp.g:8544:2: ( ruleTypedVariableList )
            {
            // InternalBSharp.g:8544:2: ( ruleTypedVariableList )
            // InternalBSharp.g:8545:3: ruleTypedVariableList
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionDeclAccess().getVarListTypedVariableListParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTypedVariableList();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionDeclAccess().getVarListTypedVariableListParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__FunctionDecl__VarListAssignment_3"


    // $ANTLR start "rule__FunctionDecl__ReturnTypeAssignment_6"
    // InternalBSharp.g:8554:1: rule__FunctionDecl__ReturnTypeAssignment_6 : ( ruleConstructedType ) ;
    public final void rule__FunctionDecl__ReturnTypeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8558:1: ( ( ruleConstructedType ) )
            // InternalBSharp.g:8559:2: ( ruleConstructedType )
            {
            // InternalBSharp.g:8559:2: ( ruleConstructedType )
            // InternalBSharp.g:8560:3: ruleConstructedType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionDeclAccess().getReturnTypeConstructedTypeParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleConstructedType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionDeclAccess().getReturnTypeConstructedTypeParserRuleCall_6_0()); 
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
    // $ANTLR end "rule__FunctionDecl__ReturnTypeAssignment_6"


    // $ANTLR start "rule__FunctionDecl__InfixAssignment_7"
    // InternalBSharp.g:8569:1: rule__FunctionDecl__InfixAssignment_7 : ( ( 'INFIX' ) ) ;
    public final void rule__FunctionDecl__InfixAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8573:1: ( ( ( 'INFIX' ) ) )
            // InternalBSharp.g:8574:2: ( ( 'INFIX' ) )
            {
            // InternalBSharp.g:8574:2: ( ( 'INFIX' ) )
            // InternalBSharp.g:8575:3: ( 'INFIX' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionDeclAccess().getInfixINFIXKeyword_7_0()); 
            }
            // InternalBSharp.g:8576:3: ( 'INFIX' )
            // InternalBSharp.g:8577:4: 'INFIX'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionDeclAccess().getInfixINFIXKeyword_7_0()); 
            }
            match(input,63,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionDeclAccess().getInfixINFIXKeyword_7_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionDeclAccess().getInfixINFIXKeyword_7_0()); 
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
    // $ANTLR end "rule__FunctionDecl__InfixAssignment_7"


    // $ANTLR start "rule__FunctionDecl__PrecedenceAssignment_8"
    // InternalBSharp.g:8588:1: rule__FunctionDecl__PrecedenceAssignment_8 : ( RULE_INT ) ;
    public final void rule__FunctionDecl__PrecedenceAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8592:1: ( ( RULE_INT ) )
            // InternalBSharp.g:8593:2: ( RULE_INT )
            {
            // InternalBSharp.g:8593:2: ( RULE_INT )
            // InternalBSharp.g:8594:3: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionDeclAccess().getPrecedenceINTTerminalRuleCall_8_0()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionDeclAccess().getPrecedenceINTTerminalRuleCall_8_0()); 
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
    // $ANTLR end "rule__FunctionDecl__PrecedenceAssignment_8"


    // $ANTLR start "rule__FunctionDecl__ExprAssignment_9"
    // InternalBSharp.g:8603:1: rule__FunctionDecl__ExprAssignment_9 : ( ruleRootExpression ) ;
    public final void rule__FunctionDecl__ExprAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8607:1: ( ( ruleRootExpression ) )
            // InternalBSharp.g:8608:2: ( ruleRootExpression )
            {
            // InternalBSharp.g:8608:2: ( ruleRootExpression )
            // InternalBSharp.g:8609:3: ruleRootExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionDeclAccess().getExprRootExpressionParserRuleCall_9_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleRootExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionDeclAccess().getExprRootExpressionParserRuleCall_9_0()); 
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
    // $ANTLR end "rule__FunctionDecl__ExprAssignment_9"


    // $ANTLR start "rule__MatchStatement__MatchAssignment_1"
    // InternalBSharp.g:8618:1: rule__MatchStatement__MatchAssignment_1 : ( ruleRootExpression ) ;
    public final void rule__MatchStatement__MatchAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8622:1: ( ( ruleRootExpression ) )
            // InternalBSharp.g:8623:2: ( ruleRootExpression )
            {
            // InternalBSharp.g:8623:2: ( ruleRootExpression )
            // InternalBSharp.g:8624:3: ruleRootExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMatchStatementAccess().getMatchRootExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleRootExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMatchStatementAccess().getMatchRootExpressionParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__MatchStatement__MatchAssignment_1"


    // $ANTLR start "rule__MatchStatement__InductCaseAssignment_3"
    // InternalBSharp.g:8633:1: rule__MatchStatement__InductCaseAssignment_3 : ( ruleMatchCase ) ;
    public final void rule__MatchStatement__InductCaseAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8637:1: ( ( ruleMatchCase ) )
            // InternalBSharp.g:8638:2: ( ruleMatchCase )
            {
            // InternalBSharp.g:8638:2: ( ruleMatchCase )
            // InternalBSharp.g:8639:3: ruleMatchCase
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMatchStatementAccess().getInductCaseMatchCaseParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMatchCase();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMatchStatementAccess().getInductCaseMatchCaseParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__MatchStatement__InductCaseAssignment_3"


    // $ANTLR start "rule__MatchStatement__InductCaseAssignment_4"
    // InternalBSharp.g:8648:1: rule__MatchStatement__InductCaseAssignment_4 : ( ruleMatchCase ) ;
    public final void rule__MatchStatement__InductCaseAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8652:1: ( ( ruleMatchCase ) )
            // InternalBSharp.g:8653:2: ( ruleMatchCase )
            {
            // InternalBSharp.g:8653:2: ( ruleMatchCase )
            // InternalBSharp.g:8654:3: ruleMatchCase
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMatchStatementAccess().getInductCaseMatchCaseParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMatchCase();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMatchStatementAccess().getInductCaseMatchCaseParserRuleCall_4_0()); 
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
    // $ANTLR end "rule__MatchStatement__InductCaseAssignment_4"


    // $ANTLR start "rule__MatchCase__DeconNameAssignment_1"
    // InternalBSharp.g:8663:1: rule__MatchCase__DeconNameAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__MatchCase__DeconNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8667:1: ( ( ( RULE_ID ) ) )
            // InternalBSharp.g:8668:2: ( ( RULE_ID ) )
            {
            // InternalBSharp.g:8668:2: ( ( RULE_ID ) )
            // InternalBSharp.g:8669:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMatchCaseAccess().getDeconNameDatatypeConstructorCrossReference_1_0()); 
            }
            // InternalBSharp.g:8670:3: ( RULE_ID )
            // InternalBSharp.g:8671:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMatchCaseAccess().getDeconNameDatatypeConstructorIDTerminalRuleCall_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMatchCaseAccess().getDeconNameDatatypeConstructorIDTerminalRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMatchCaseAccess().getDeconNameDatatypeConstructorCrossReference_1_0()); 
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
    // $ANTLR end "rule__MatchCase__DeconNameAssignment_1"


    // $ANTLR start "rule__MatchCase__VariablesAssignment_2_1"
    // InternalBSharp.g:8682:1: rule__MatchCase__VariablesAssignment_2_1 : ( ruleTypedVariable ) ;
    public final void rule__MatchCase__VariablesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8686:1: ( ( ruleTypedVariable ) )
            // InternalBSharp.g:8687:2: ( ruleTypedVariable )
            {
            // InternalBSharp.g:8687:2: ( ruleTypedVariable )
            // InternalBSharp.g:8688:3: ruleTypedVariable
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMatchCaseAccess().getVariablesTypedVariableParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTypedVariable();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMatchCaseAccess().getVariablesTypedVariableParserRuleCall_2_1_0()); 
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
    // $ANTLR end "rule__MatchCase__VariablesAssignment_2_1"


    // $ANTLR start "rule__MatchCase__VariablesAssignment_2_2_1"
    // InternalBSharp.g:8697:1: rule__MatchCase__VariablesAssignment_2_2_1 : ( ruleTypedVariable ) ;
    public final void rule__MatchCase__VariablesAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8701:1: ( ( ruleTypedVariable ) )
            // InternalBSharp.g:8702:2: ( ruleTypedVariable )
            {
            // InternalBSharp.g:8702:2: ( ruleTypedVariable )
            // InternalBSharp.g:8703:3: ruleTypedVariable
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMatchCaseAccess().getVariablesTypedVariableParserRuleCall_2_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTypedVariable();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMatchCaseAccess().getVariablesTypedVariableParserRuleCall_2_2_1_0()); 
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
    // $ANTLR end "rule__MatchCase__VariablesAssignment_2_2_1"


    // $ANTLR start "rule__MatchCase__ExprAssignment_4"
    // InternalBSharp.g:8712:1: rule__MatchCase__ExprAssignment_4 : ( ruleRootExpression ) ;
    public final void rule__MatchCase__ExprAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8716:1: ( ( ruleRootExpression ) )
            // InternalBSharp.g:8717:2: ( ruleRootExpression )
            {
            // InternalBSharp.g:8717:2: ( ruleRootExpression )
            // InternalBSharp.g:8718:3: ruleRootExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMatchCaseAccess().getExprRootExpressionParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleRootExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMatchCaseAccess().getExprRootExpressionParserRuleCall_4_0()); 
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
    // $ANTLR end "rule__MatchCase__ExprAssignment_4"


    // $ANTLR start "rule__TheoremBody__TheoremDeclAssignment_2"
    // InternalBSharp.g:8727:1: rule__TheoremBody__TheoremDeclAssignment_2 : ( ruleTheoremDecl ) ;
    public final void rule__TheoremBody__TheoremDeclAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8731:1: ( ( ruleTheoremDecl ) )
            // InternalBSharp.g:8732:2: ( ruleTheoremDecl )
            {
            // InternalBSharp.g:8732:2: ( ruleTheoremDecl )
            // InternalBSharp.g:8733:3: ruleTheoremDecl
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTheoremBodyAccess().getTheoremDeclTheoremDeclParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTheoremDecl();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTheoremBodyAccess().getTheoremDeclTheoremDeclParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__TheoremBody__TheoremDeclAssignment_2"


    // $ANTLR start "rule__TheoremDecl__NameAssignment_0"
    // InternalBSharp.g:8742:1: rule__TheoremDecl__NameAssignment_0 : ( ruleTHM_NAME ) ;
    public final void rule__TheoremDecl__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8746:1: ( ( ruleTHM_NAME ) )
            // InternalBSharp.g:8747:2: ( ruleTHM_NAME )
            {
            // InternalBSharp.g:8747:2: ( ruleTHM_NAME )
            // InternalBSharp.g:8748:3: ruleTHM_NAME
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTheoremDeclAccess().getNameTHM_NAMEParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTHM_NAME();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTheoremDeclAccess().getNameTHM_NAMEParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__TheoremDecl__NameAssignment_0"


    // $ANTLR start "rule__TheoremDecl__ExprAssignment_1"
    // InternalBSharp.g:8757:1: rule__TheoremDecl__ExprAssignment_1 : ( ruleRootExpression ) ;
    public final void rule__TheoremDecl__ExprAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8761:1: ( ( ruleRootExpression ) )
            // InternalBSharp.g:8762:2: ( ruleRootExpression )
            {
            // InternalBSharp.g:8762:2: ( ruleRootExpression )
            // InternalBSharp.g:8763:3: ruleRootExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTheoremDeclAccess().getExprRootExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleRootExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTheoremDeclAccess().getExprRootExpressionParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__TheoremDecl__ExprAssignment_1"


    // $ANTLR start "rule__TypedVariableList__VariablesOfTypeAssignment_0"
    // InternalBSharp.g:8772:1: rule__TypedVariableList__VariablesOfTypeAssignment_0 : ( ruleVariableTyping ) ;
    public final void rule__TypedVariableList__VariablesOfTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8776:1: ( ( ruleVariableTyping ) )
            // InternalBSharp.g:8777:2: ( ruleVariableTyping )
            {
            // InternalBSharp.g:8777:2: ( ruleVariableTyping )
            // InternalBSharp.g:8778:3: ruleVariableTyping
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedVariableListAccess().getVariablesOfTypeVariableTypingParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleVariableTyping();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypedVariableListAccess().getVariablesOfTypeVariableTypingParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__TypedVariableList__VariablesOfTypeAssignment_0"


    // $ANTLR start "rule__TypedVariableList__VariablesOfTypeAssignment_1_1"
    // InternalBSharp.g:8787:1: rule__TypedVariableList__VariablesOfTypeAssignment_1_1 : ( ruleVariableTyping ) ;
    public final void rule__TypedVariableList__VariablesOfTypeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8791:1: ( ( ruleVariableTyping ) )
            // InternalBSharp.g:8792:2: ( ruleVariableTyping )
            {
            // InternalBSharp.g:8792:2: ( ruleVariableTyping )
            // InternalBSharp.g:8793:3: ruleVariableTyping
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedVariableListAccess().getVariablesOfTypeVariableTypingParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleVariableTyping();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypedVariableListAccess().getVariablesOfTypeVariableTypingParserRuleCall_1_1_0()); 
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
    // $ANTLR end "rule__TypedVariableList__VariablesOfTypeAssignment_1_1"


    // $ANTLR start "rule__VariableTyping__TypeVarAssignment_0"
    // InternalBSharp.g:8802:1: rule__VariableTyping__TypeVarAssignment_0 : ( ruleTypedVariable ) ;
    public final void rule__VariableTyping__TypeVarAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8806:1: ( ( ruleTypedVariable ) )
            // InternalBSharp.g:8807:2: ( ruleTypedVariable )
            {
            // InternalBSharp.g:8807:2: ( ruleTypedVariable )
            // InternalBSharp.g:8808:3: ruleTypedVariable
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableTypingAccess().getTypeVarTypedVariableParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTypedVariable();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableTypingAccess().getTypeVarTypedVariableParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__VariableTyping__TypeVarAssignment_0"


    // $ANTLR start "rule__VariableTyping__TypeVarAssignment_1_1"
    // InternalBSharp.g:8817:1: rule__VariableTyping__TypeVarAssignment_1_1 : ( ruleTypedVariable ) ;
    public final void rule__VariableTyping__TypeVarAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8821:1: ( ( ruleTypedVariable ) )
            // InternalBSharp.g:8822:2: ( ruleTypedVariable )
            {
            // InternalBSharp.g:8822:2: ( ruleTypedVariable )
            // InternalBSharp.g:8823:3: ruleTypedVariable
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableTypingAccess().getTypeVarTypedVariableParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTypedVariable();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableTypingAccess().getTypeVarTypedVariableParserRuleCall_1_1_0()); 
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
    // $ANTLR end "rule__VariableTyping__TypeVarAssignment_1_1"


    // $ANTLR start "rule__VariableTyping__TypeAssignment_3"
    // InternalBSharp.g:8832:1: rule__VariableTyping__TypeAssignment_3 : ( ruleConstructedType ) ;
    public final void rule__VariableTyping__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8836:1: ( ( ruleConstructedType ) )
            // InternalBSharp.g:8837:2: ( ruleConstructedType )
            {
            // InternalBSharp.g:8837:2: ( ruleConstructedType )
            // InternalBSharp.g:8838:3: ruleConstructedType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableTypingAccess().getTypeConstructedTypeParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleConstructedType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableTypingAccess().getTypeConstructedTypeParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__VariableTyping__TypeAssignment_3"


    // $ANTLR start "rule__TypedVariable__NameAssignment"
    // InternalBSharp.g:8847:1: rule__TypedVariable__NameAssignment : ( RULE_ID ) ;
    public final void rule__TypedVariable__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8851:1: ( ( RULE_ID ) )
            // InternalBSharp.g:8852:2: ( RULE_ID )
            {
            // InternalBSharp.g:8852:2: ( RULE_ID )
            // InternalBSharp.g:8853:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedVariableAccess().getNameIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypedVariableAccess().getNameIDTerminalRuleCall_0()); 
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
    // $ANTLR end "rule__TypedVariable__NameAssignment"


    // $ANTLR start "rule__Lambda__QTypeAssignment_0"
    // InternalBSharp.g:8862:1: rule__Lambda__QTypeAssignment_0 : ( ( '\\u03BB' ) ) ;
    public final void rule__Lambda__QTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8866:1: ( ( ( '\\u03BB' ) ) )
            // InternalBSharp.g:8867:2: ( ( '\\u03BB' ) )
            {
            // InternalBSharp.g:8867:2: ( ( '\\u03BB' ) )
            // InternalBSharp.g:8868:3: ( '\\u03BB' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLambdaAccess().getQTypeGreekSmallLetterLamdaKeyword_0_0()); 
            }
            // InternalBSharp.g:8869:3: ( '\\u03BB' )
            // InternalBSharp.g:8870:4: '\\u03BB'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLambdaAccess().getQTypeGreekSmallLetterLamdaKeyword_0_0()); 
            }
            match(input,64,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLambdaAccess().getQTypeGreekSmallLetterLamdaKeyword_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLambdaAccess().getQTypeGreekSmallLetterLamdaKeyword_0_0()); 
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
    // $ANTLR end "rule__Lambda__QTypeAssignment_0"


    // $ANTLR start "rule__Lambda__ContextAssignment_1"
    // InternalBSharp.g:8881:1: rule__Lambda__ContextAssignment_1 : ( rulePolyContext ) ;
    public final void rule__Lambda__ContextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8885:1: ( ( rulePolyContext ) )
            // InternalBSharp.g:8886:2: ( rulePolyContext )
            {
            // InternalBSharp.g:8886:2: ( rulePolyContext )
            // InternalBSharp.g:8887:3: rulePolyContext
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLambdaAccess().getContextPolyContextParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePolyContext();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLambdaAccess().getContextPolyContextParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__Lambda__ContextAssignment_1"


    // $ANTLR start "rule__Lambda__VarListAssignment_2"
    // InternalBSharp.g:8896:1: rule__Lambda__VarListAssignment_2 : ( ruleTypedVariableList ) ;
    public final void rule__Lambda__VarListAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8900:1: ( ( ruleTypedVariableList ) )
            // InternalBSharp.g:8901:2: ( ruleTypedVariableList )
            {
            // InternalBSharp.g:8901:2: ( ruleTypedVariableList )
            // InternalBSharp.g:8902:3: ruleTypedVariableList
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLambdaAccess().getVarListTypedVariableListParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTypedVariableList();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLambdaAccess().getVarListTypedVariableListParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__Lambda__VarListAssignment_2"


    // $ANTLR start "rule__Lambda__ExprAssignment_4"
    // InternalBSharp.g:8911:1: rule__Lambda__ExprAssignment_4 : ( ruleRootExpression ) ;
    public final void rule__Lambda__ExprAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8915:1: ( ( ruleRootExpression ) )
            // InternalBSharp.g:8916:2: ( ruleRootExpression )
            {
            // InternalBSharp.g:8916:2: ( ruleRootExpression )
            // InternalBSharp.g:8917:3: ruleRootExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLambdaAccess().getExprRootExpressionParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleRootExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLambdaAccess().getExprRootExpressionParserRuleCall_4_0()); 
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
    // $ANTLR end "rule__Lambda__ExprAssignment_4"


    // $ANTLR start "rule__Quantifier__QTypeAssignment_0"
    // InternalBSharp.g:8926:1: rule__Quantifier__QTypeAssignment_0 : ( ( rule__Quantifier__QTypeAlternatives_0_0 ) ) ;
    public final void rule__Quantifier__QTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8930:1: ( ( ( rule__Quantifier__QTypeAlternatives_0_0 ) ) )
            // InternalBSharp.g:8931:2: ( ( rule__Quantifier__QTypeAlternatives_0_0 ) )
            {
            // InternalBSharp.g:8931:2: ( ( rule__Quantifier__QTypeAlternatives_0_0 ) )
            // InternalBSharp.g:8932:3: ( rule__Quantifier__QTypeAlternatives_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuantifierAccess().getQTypeAlternatives_0_0()); 
            }
            // InternalBSharp.g:8933:3: ( rule__Quantifier__QTypeAlternatives_0_0 )
            // InternalBSharp.g:8933:4: rule__Quantifier__QTypeAlternatives_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Quantifier__QTypeAlternatives_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQuantifierAccess().getQTypeAlternatives_0_0()); 
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
    // $ANTLR end "rule__Quantifier__QTypeAssignment_0"


    // $ANTLR start "rule__Quantifier__ContextAssignment_1"
    // InternalBSharp.g:8941:1: rule__Quantifier__ContextAssignment_1 : ( rulePolyContext ) ;
    public final void rule__Quantifier__ContextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8945:1: ( ( rulePolyContext ) )
            // InternalBSharp.g:8946:2: ( rulePolyContext )
            {
            // InternalBSharp.g:8946:2: ( rulePolyContext )
            // InternalBSharp.g:8947:3: rulePolyContext
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuantifierAccess().getContextPolyContextParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePolyContext();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQuantifierAccess().getContextPolyContextParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__Quantifier__ContextAssignment_1"


    // $ANTLR start "rule__Quantifier__VarListAssignment_2"
    // InternalBSharp.g:8956:1: rule__Quantifier__VarListAssignment_2 : ( ruleTypedVariableList ) ;
    public final void rule__Quantifier__VarListAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8960:1: ( ( ruleTypedVariableList ) )
            // InternalBSharp.g:8961:2: ( ruleTypedVariableList )
            {
            // InternalBSharp.g:8961:2: ( ruleTypedVariableList )
            // InternalBSharp.g:8962:3: ruleTypedVariableList
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuantifierAccess().getVarListTypedVariableListParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTypedVariableList();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQuantifierAccess().getVarListTypedVariableListParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__Quantifier__VarListAssignment_2"


    // $ANTLR start "rule__Quantifier__ExprAssignment_4"
    // InternalBSharp.g:8971:1: rule__Quantifier__ExprAssignment_4 : ( ruleRootExpression ) ;
    public final void rule__Quantifier__ExprAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8975:1: ( ( ruleRootExpression ) )
            // InternalBSharp.g:8976:2: ( ruleRootExpression )
            {
            // InternalBSharp.g:8976:2: ( ruleRootExpression )
            // InternalBSharp.g:8977:3: ruleRootExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuantifierAccess().getExprRootExpressionParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleRootExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQuantifierAccess().getExprRootExpressionParserRuleCall_4_0()); 
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
    // $ANTLR end "rule__Quantifier__ExprAssignment_4"


    // $ANTLR start "rule__Prefix__NameAssignment_0"
    // InternalBSharp.g:8986:1: rule__Prefix__NameAssignment_0 : ( rulePrefixBuiltIn ) ;
    public final void rule__Prefix__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8990:1: ( ( rulePrefixBuiltIn ) )
            // InternalBSharp.g:8991:2: ( rulePrefixBuiltIn )
            {
            // InternalBSharp.g:8991:2: ( rulePrefixBuiltIn )
            // InternalBSharp.g:8992:3: rulePrefixBuiltIn
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrefixAccess().getNamePrefixBuiltInParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePrefixBuiltIn();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrefixAccess().getNamePrefixBuiltInParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__Prefix__NameAssignment_0"


    // $ANTLR start "rule__Prefix__ElemAssignment_1"
    // InternalBSharp.g:9001:1: rule__Prefix__ElemAssignment_1 : ( ruleElement ) ;
    public final void rule__Prefix__ElemAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:9005:1: ( ( ruleElement ) )
            // InternalBSharp.g:9006:2: ( ruleElement )
            {
            // InternalBSharp.g:9006:2: ( ruleElement )
            // InternalBSharp.g:9007:3: ruleElement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrefixAccess().getElemElementParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrefixAccess().getElemElementParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__Prefix__ElemAssignment_1"


    // $ANTLR start "rule__Infix__FuncNameAssignment_1_1_0"
    // InternalBSharp.g:9016:1: rule__Infix__FuncNameAssignment_1_1_0 : ( ( RULE_ID ) ) ;
    public final void rule__Infix__FuncNameAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:9020:1: ( ( ( RULE_ID ) ) )
            // InternalBSharp.g:9021:2: ( ( RULE_ID ) )
            {
            // InternalBSharp.g:9021:2: ( ( RULE_ID ) )
            // InternalBSharp.g:9022:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInfixAccess().getFuncNameFunctionDeclCrossReference_1_1_0_0()); 
            }
            // InternalBSharp.g:9023:3: ( RULE_ID )
            // InternalBSharp.g:9024:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInfixAccess().getFuncNameFunctionDeclIDTerminalRuleCall_1_1_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInfixAccess().getFuncNameFunctionDeclIDTerminalRuleCall_1_1_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInfixAccess().getFuncNameFunctionDeclCrossReference_1_1_0_0()); 
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
    // $ANTLR end "rule__Infix__FuncNameAssignment_1_1_0"


    // $ANTLR start "rule__Infix__OpNameAssignment_1_1_1"
    // InternalBSharp.g:9035:1: rule__Infix__OpNameAssignment_1_1_1 : ( ruleInbuiltInfix ) ;
    public final void rule__Infix__OpNameAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:9039:1: ( ( ruleInbuiltInfix ) )
            // InternalBSharp.g:9040:2: ( ruleInbuiltInfix )
            {
            // InternalBSharp.g:9040:2: ( ruleInbuiltInfix )
            // InternalBSharp.g:9041:3: ruleInbuiltInfix
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInfixAccess().getOpNameInbuiltInfixParserRuleCall_1_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleInbuiltInfix();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInfixAccess().getOpNameInbuiltInfixParserRuleCall_1_1_1_0()); 
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
    // $ANTLR end "rule__Infix__OpNameAssignment_1_1_1"


    // $ANTLR start "rule__Infix__RightAssignment_1_2"
    // InternalBSharp.g:9050:1: rule__Infix__RightAssignment_1_2 : ( ruleElement ) ;
    public final void rule__Infix__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:9054:1: ( ( ruleElement ) )
            // InternalBSharp.g:9055:2: ( ruleElement )
            {
            // InternalBSharp.g:9055:2: ( ruleElement )
            // InternalBSharp.g:9056:3: ruleElement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInfixAccess().getRightElementParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInfixAccess().getRightElementParserRuleCall_1_2_0()); 
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
    // $ANTLR end "rule__Infix__RightAssignment_1_2"


    // $ANTLR start "rule__Tuple__ElementsAssignment_1"
    // InternalBSharp.g:9065:1: rule__Tuple__ElementsAssignment_1 : ( ruleRootExpression ) ;
    public final void rule__Tuple__ElementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:9069:1: ( ( ruleRootExpression ) )
            // InternalBSharp.g:9070:2: ( ruleRootExpression )
            {
            // InternalBSharp.g:9070:2: ( ruleRootExpression )
            // InternalBSharp.g:9071:3: ruleRootExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTupleAccess().getElementsRootExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleRootExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTupleAccess().getElementsRootExpressionParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__Tuple__ElementsAssignment_1"


    // $ANTLR start "rule__Tuple__ElementsAssignment_2_1"
    // InternalBSharp.g:9080:1: rule__Tuple__ElementsAssignment_2_1 : ( ruleRootExpression ) ;
    public final void rule__Tuple__ElementsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:9084:1: ( ( ruleRootExpression ) )
            // InternalBSharp.g:9085:2: ( ruleRootExpression )
            {
            // InternalBSharp.g:9085:2: ( ruleRootExpression )
            // InternalBSharp.g:9086:3: ruleRootExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTupleAccess().getElementsRootExpressionParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleRootExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTupleAccess().getElementsRootExpressionParserRuleCall_2_1_0()); 
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
    // $ANTLR end "rule__Tuple__ElementsAssignment_2_1"


    // $ANTLR start "rule__FunctionCall__WrappedAssignment_0"
    // InternalBSharp.g:9095:1: rule__FunctionCall__WrappedAssignment_0 : ( ruleWrappedInfix ) ;
    public final void rule__FunctionCall__WrappedAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:9099:1: ( ( ruleWrappedInfix ) )
            // InternalBSharp.g:9100:2: ( ruleWrappedInfix )
            {
            // InternalBSharp.g:9100:2: ( ruleWrappedInfix )
            // InternalBSharp.g:9101:3: ruleWrappedInfix
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getWrappedWrappedInfixParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleWrappedInfix();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionCallAccess().getWrappedWrappedInfixParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__FunctionCall__WrappedAssignment_0"


    // $ANTLR start "rule__FunctionCall__TypeInstAssignment_1_0_0"
    // InternalBSharp.g:9110:1: rule__FunctionCall__TypeInstAssignment_1_0_0 : ( ( RULE_ID ) ) ;
    public final void rule__FunctionCall__TypeInstAssignment_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:9114:1: ( ( ( RULE_ID ) ) )
            // InternalBSharp.g:9115:2: ( ( RULE_ID ) )
            {
            // InternalBSharp.g:9115:2: ( ( RULE_ID ) )
            // InternalBSharp.g:9116:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getTypeInstExpressionVariableCrossReference_1_0_0_0()); 
            }
            // InternalBSharp.g:9117:3: ( RULE_ID )
            // InternalBSharp.g:9118:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getTypeInstExpressionVariableIDTerminalRuleCall_1_0_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionCallAccess().getTypeInstExpressionVariableIDTerminalRuleCall_1_0_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionCallAccess().getTypeInstExpressionVariableCrossReference_1_0_0_0()); 
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
    // $ANTLR end "rule__FunctionCall__TypeInstAssignment_1_0_0"


    // $ANTLR start "rule__FunctionCall__GetterAssignment_1_0_1_1"
    // InternalBSharp.g:9129:1: rule__FunctionCall__GetterAssignment_1_0_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__FunctionCall__GetterAssignment_1_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:9133:1: ( ( ( RULE_ID ) ) )
            // InternalBSharp.g:9134:2: ( ( RULE_ID ) )
            {
            // InternalBSharp.g:9134:2: ( ( RULE_ID ) )
            // InternalBSharp.g:9135:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getGetterExpressionVariableCrossReference_1_0_1_1_0()); 
            }
            // InternalBSharp.g:9136:3: ( RULE_ID )
            // InternalBSharp.g:9137:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getGetterExpressionVariableIDTerminalRuleCall_1_0_1_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionCallAccess().getGetterExpressionVariableIDTerminalRuleCall_1_0_1_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionCallAccess().getGetterExpressionVariableCrossReference_1_0_1_1_0()); 
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
    // $ANTLR end "rule__FunctionCall__GetterAssignment_1_0_1_1"


    // $ANTLR start "rule__FunctionCall__ContextAssignment_1_0_2"
    // InternalBSharp.g:9148:1: rule__FunctionCall__ContextAssignment_1_0_2 : ( ruleTypeDeclContext ) ;
    public final void rule__FunctionCall__ContextAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:9152:1: ( ( ruleTypeDeclContext ) )
            // InternalBSharp.g:9153:2: ( ruleTypeDeclContext )
            {
            // InternalBSharp.g:9153:2: ( ruleTypeDeclContext )
            // InternalBSharp.g:9154:3: ruleTypeDeclContext
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getContextTypeDeclContextParserRuleCall_1_0_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTypeDeclContext();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionCallAccess().getContextTypeDeclContextParserRuleCall_1_0_2_0()); 
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
    // $ANTLR end "rule__FunctionCall__ContextAssignment_1_0_2"


    // $ANTLR start "rule__FunctionCall__FuncCallArgsAssignment_1_1"
    // InternalBSharp.g:9163:1: rule__FunctionCall__FuncCallArgsAssignment_1_1 : ( ruleFuncCallArgs ) ;
    public final void rule__FunctionCall__FuncCallArgsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:9167:1: ( ( ruleFuncCallArgs ) )
            // InternalBSharp.g:9168:2: ( ruleFuncCallArgs )
            {
            // InternalBSharp.g:9168:2: ( ruleFuncCallArgs )
            // InternalBSharp.g:9169:3: ruleFuncCallArgs
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getFuncCallArgsFuncCallArgsParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleFuncCallArgs();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionCallAccess().getFuncCallArgsFuncCallArgsParserRuleCall_1_1_0()); 
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
    // $ANTLR end "rule__FunctionCall__FuncCallArgsAssignment_1_1"


    // $ANTLR start "rule__FunctionCallInbuilt__InbuiltUnaryAssignment_0"
    // InternalBSharp.g:9178:1: rule__FunctionCallInbuilt__InbuiltUnaryAssignment_0 : ( ruleInbuiltUnary ) ;
    public final void rule__FunctionCallInbuilt__InbuiltUnaryAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:9182:1: ( ( ruleInbuiltUnary ) )
            // InternalBSharp.g:9183:2: ( ruleInbuiltUnary )
            {
            // InternalBSharp.g:9183:2: ( ruleInbuiltUnary )
            // InternalBSharp.g:9184:3: ruleInbuiltUnary
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallInbuiltAccess().getInbuiltUnaryInbuiltUnaryParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleInbuiltUnary();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionCallInbuiltAccess().getInbuiltUnaryInbuiltUnaryParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__FunctionCallInbuilt__InbuiltUnaryAssignment_0"


    // $ANTLR start "rule__FunctionCallInbuilt__FuncCallArgsAssignment_1"
    // InternalBSharp.g:9193:1: rule__FunctionCallInbuilt__FuncCallArgsAssignment_1 : ( ruleFuncCallArgs ) ;
    public final void rule__FunctionCallInbuilt__FuncCallArgsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:9197:1: ( ( ruleFuncCallArgs ) )
            // InternalBSharp.g:9198:2: ( ruleFuncCallArgs )
            {
            // InternalBSharp.g:9198:2: ( ruleFuncCallArgs )
            // InternalBSharp.g:9199:3: ruleFuncCallArgs
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallInbuiltAccess().getFuncCallArgsFuncCallArgsParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleFuncCallArgs();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionCallInbuiltAccess().getFuncCallArgsFuncCallArgsParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__FunctionCallInbuilt__FuncCallArgsAssignment_1"


    // $ANTLR start "rule__FuncCallArgs__ArgumentsAssignment_1_1"
    // InternalBSharp.g:9208:1: rule__FuncCallArgs__ArgumentsAssignment_1_1 : ( ruleRootExpression ) ;
    public final void rule__FuncCallArgs__ArgumentsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:9212:1: ( ( ruleRootExpression ) )
            // InternalBSharp.g:9213:2: ( ruleRootExpression )
            {
            // InternalBSharp.g:9213:2: ( ruleRootExpression )
            // InternalBSharp.g:9214:3: ruleRootExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFuncCallArgsAccess().getArgumentsRootExpressionParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleRootExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFuncCallArgsAccess().getArgumentsRootExpressionParserRuleCall_1_1_0()); 
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
    // $ANTLR end "rule__FuncCallArgs__ArgumentsAssignment_1_1"


    // $ANTLR start "rule__FuncCallArgs__ArgumentsAssignment_1_2_1"
    // InternalBSharp.g:9223:1: rule__FuncCallArgs__ArgumentsAssignment_1_2_1 : ( ruleRootExpression ) ;
    public final void rule__FuncCallArgs__ArgumentsAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:9227:1: ( ( ruleRootExpression ) )
            // InternalBSharp.g:9228:2: ( ruleRootExpression )
            {
            // InternalBSharp.g:9228:2: ( ruleRootExpression )
            // InternalBSharp.g:9229:3: ruleRootExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFuncCallArgsAccess().getArgumentsRootExpressionParserRuleCall_1_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleRootExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFuncCallArgsAccess().getArgumentsRootExpressionParserRuleCall_1_2_1_0()); 
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
    // $ANTLR end "rule__FuncCallArgs__ArgumentsAssignment_1_2_1"


    // $ANTLR start "rule__IfElse__ConditionAssignment_1"
    // InternalBSharp.g:9238:1: rule__IfElse__ConditionAssignment_1 : ( ruleRootExpression ) ;
    public final void rule__IfElse__ConditionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:9242:1: ( ( ruleRootExpression ) )
            // InternalBSharp.g:9243:2: ( ruleRootExpression )
            {
            // InternalBSharp.g:9243:2: ( ruleRootExpression )
            // InternalBSharp.g:9244:3: ruleRootExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfElseAccess().getConditionRootExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleRootExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfElseAccess().getConditionRootExpressionParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__IfElse__ConditionAssignment_1"


    // $ANTLR start "rule__IfElse__IfTrueExprAssignment_3"
    // InternalBSharp.g:9253:1: rule__IfElse__IfTrueExprAssignment_3 : ( ruleRootExpression ) ;
    public final void rule__IfElse__IfTrueExprAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:9257:1: ( ( ruleRootExpression ) )
            // InternalBSharp.g:9258:2: ( ruleRootExpression )
            {
            // InternalBSharp.g:9258:2: ( ruleRootExpression )
            // InternalBSharp.g:9259:3: ruleRootExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfElseAccess().getIfTrueExprRootExpressionParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleRootExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfElseAccess().getIfTrueExprRootExpressionParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__IfElse__IfTrueExprAssignment_3"


    // $ANTLR start "rule__IfElse__IfFalseExprAssignment_7"
    // InternalBSharp.g:9268:1: rule__IfElse__IfFalseExprAssignment_7 : ( ruleRootExpression ) ;
    public final void rule__IfElse__IfFalseExprAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:9272:1: ( ( ruleRootExpression ) )
            // InternalBSharp.g:9273:2: ( ruleRootExpression )
            {
            // InternalBSharp.g:9273:2: ( ruleRootExpression )
            // InternalBSharp.g:9274:3: ruleRootExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfElseAccess().getIfFalseExprRootExpressionParserRuleCall_7_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleRootExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfElseAccess().getIfFalseExprRootExpressionParserRuleCall_7_0()); 
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
    // $ANTLR end "rule__IfElse__IfFalseExprAssignment_7"


    // $ANTLR start "rule__WrappedInfix__InbuiltAssignment_1_0"
    // InternalBSharp.g:9283:1: rule__WrappedInfix__InbuiltAssignment_1_0 : ( ruleInbuiltInfix ) ;
    public final void rule__WrappedInfix__InbuiltAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:9287:1: ( ( ruleInbuiltInfix ) )
            // InternalBSharp.g:9288:2: ( ruleInbuiltInfix )
            {
            // InternalBSharp.g:9288:2: ( ruleInbuiltInfix )
            // InternalBSharp.g:9289:3: ruleInbuiltInfix
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWrappedInfixAccess().getInbuiltInbuiltInfixParserRuleCall_1_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleInbuiltInfix();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWrappedInfixAccess().getInbuiltInbuiltInfixParserRuleCall_1_0_0()); 
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
    // $ANTLR end "rule__WrappedInfix__InbuiltAssignment_1_0"


    // $ANTLR start "rule__WrappedInfix__FuncNameAssignment_1_1"
    // InternalBSharp.g:9298:1: rule__WrappedInfix__FuncNameAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__WrappedInfix__FuncNameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:9302:1: ( ( ( RULE_ID ) ) )
            // InternalBSharp.g:9303:2: ( ( RULE_ID ) )
            {
            // InternalBSharp.g:9303:2: ( ( RULE_ID ) )
            // InternalBSharp.g:9304:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWrappedInfixAccess().getFuncNameExpressionVariableCrossReference_1_1_0()); 
            }
            // InternalBSharp.g:9305:3: ( RULE_ID )
            // InternalBSharp.g:9306:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWrappedInfixAccess().getFuncNameExpressionVariableIDTerminalRuleCall_1_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWrappedInfixAccess().getFuncNameExpressionVariableIDTerminalRuleCall_1_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWrappedInfixAccess().getFuncNameExpressionVariableCrossReference_1_1_0()); 
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
    // $ANTLR end "rule__WrappedInfix__FuncNameAssignment_1_1"


    // $ANTLR start "rule__Instance__ClassNameAssignment_1"
    // InternalBSharp.g:9317:1: rule__Instance__ClassNameAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Instance__ClassNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:9321:1: ( ( ( ruleQualifiedName ) ) )
            // InternalBSharp.g:9322:2: ( ( ruleQualifiedName ) )
            {
            // InternalBSharp.g:9322:2: ( ( ruleQualifiedName ) )
            // InternalBSharp.g:9323:3: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstanceAccess().getClassNameBSClassCrossReference_1_0()); 
            }
            // InternalBSharp.g:9324:3: ( ruleQualifiedName )
            // InternalBSharp.g:9325:4: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstanceAccess().getClassNameBSClassQualifiedNameParserRuleCall_1_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstanceAccess().getClassNameBSClassQualifiedNameParserRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstanceAccess().getClassNameBSClassCrossReference_1_0()); 
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
    // $ANTLR end "rule__Instance__ClassNameAssignment_1"


    // $ANTLR start "rule__Instance__ContextAssignment_3"
    // InternalBSharp.g:9336:1: rule__Instance__ContextAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Instance__ContextAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:9340:1: ( ( ( RULE_ID ) ) )
            // InternalBSharp.g:9341:2: ( ( RULE_ID ) )
            {
            // InternalBSharp.g:9341:2: ( ( RULE_ID ) )
            // InternalBSharp.g:9342:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstanceAccess().getContextIClassInstanceCrossReference_3_0()); 
            }
            // InternalBSharp.g:9343:3: ( RULE_ID )
            // InternalBSharp.g:9344:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstanceAccess().getContextIClassInstanceIDTerminalRuleCall_3_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstanceAccess().getContextIClassInstanceIDTerminalRuleCall_3_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstanceAccess().getContextIClassInstanceCrossReference_3_0()); 
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
    // $ANTLR end "rule__Instance__ContextAssignment_3"


    // $ANTLR start "rule__Instance__ArgumentsAssignment_6"
    // InternalBSharp.g:9355:1: rule__Instance__ArgumentsAssignment_6 : ( ruleRootExpression ) ;
    public final void rule__Instance__ArgumentsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:9359:1: ( ( ruleRootExpression ) )
            // InternalBSharp.g:9360:2: ( ruleRootExpression )
            {
            // InternalBSharp.g:9360:2: ( ruleRootExpression )
            // InternalBSharp.g:9361:3: ruleRootExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstanceAccess().getArgumentsRootExpressionParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleRootExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstanceAccess().getArgumentsRootExpressionParserRuleCall_6_0()); 
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
    // $ANTLR end "rule__Instance__ArgumentsAssignment_6"


    // $ANTLR start "rule__Instance__ArgumentsAssignment_7_1"
    // InternalBSharp.g:9370:1: rule__Instance__ArgumentsAssignment_7_1 : ( ruleRootExpression ) ;
    public final void rule__Instance__ArgumentsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:9374:1: ( ( ruleRootExpression ) )
            // InternalBSharp.g:9375:2: ( ruleRootExpression )
            {
            // InternalBSharp.g:9375:2: ( ruleRootExpression )
            // InternalBSharp.g:9376:3: ruleRootExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstanceAccess().getArgumentsRootExpressionParserRuleCall_7_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleRootExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstanceAccess().getArgumentsRootExpressionParserRuleCall_7_1_0()); 
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
    // $ANTLR end "rule__Instance__ArgumentsAssignment_7_1"


    // $ANTLR start "rule__Instance__NameAssignment_9"
    // InternalBSharp.g:9385:1: rule__Instance__NameAssignment_9 : ( RULE_ID ) ;
    public final void rule__Instance__NameAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:9389:1: ( ( RULE_ID ) )
            // InternalBSharp.g:9390:2: ( RULE_ID )
            {
            // InternalBSharp.g:9390:2: ( RULE_ID )
            // InternalBSharp.g:9391:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstanceAccess().getNameIDTerminalRuleCall_9_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstanceAccess().getNameIDTerminalRuleCall_9_0()); 
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
    // $ANTLR end "rule__Instance__NameAssignment_9"


    // $ANTLR start "rule__Instance__ReferencingFuncsAssignment_10_1"
    // InternalBSharp.g:9400:1: rule__Instance__ReferencingFuncsAssignment_10_1 : ( ruleReferencingFunc ) ;
    public final void rule__Instance__ReferencingFuncsAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:9404:1: ( ( ruleReferencingFunc ) )
            // InternalBSharp.g:9405:2: ( ruleReferencingFunc )
            {
            // InternalBSharp.g:9405:2: ( ruleReferencingFunc )
            // InternalBSharp.g:9406:3: ruleReferencingFunc
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstanceAccess().getReferencingFuncsReferencingFuncParserRuleCall_10_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleReferencingFunc();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstanceAccess().getReferencingFuncsReferencingFuncParserRuleCall_10_1_0()); 
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
    // $ANTLR end "rule__Instance__ReferencingFuncsAssignment_10_1"


    // $ANTLR start "rule__ReferencingFunc__NameAssignment_0"
    // InternalBSharp.g:9415:1: rule__ReferencingFunc__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__ReferencingFunc__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:9419:1: ( ( RULE_ID ) )
            // InternalBSharp.g:9420:2: ( RULE_ID )
            {
            // InternalBSharp.g:9420:2: ( RULE_ID )
            // InternalBSharp.g:9421:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferencingFuncAccess().getNameIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferencingFuncAccess().getNameIDTerminalRuleCall_0_0()); 
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
    // $ANTLR end "rule__ReferencingFunc__NameAssignment_0"


    // $ANTLR start "rule__ReferencingFunc__ReferencedFuncAssignment_2"
    // InternalBSharp.g:9430:1: rule__ReferencingFunc__ReferencedFuncAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__ReferencingFunc__ReferencedFuncAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:9434:1: ( ( ( RULE_ID ) ) )
            // InternalBSharp.g:9435:2: ( ( RULE_ID ) )
            {
            // InternalBSharp.g:9435:2: ( ( RULE_ID ) )
            // InternalBSharp.g:9436:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferencingFuncAccess().getReferencedFuncFunctionDeclCrossReference_2_0()); 
            }
            // InternalBSharp.g:9437:3: ( RULE_ID )
            // InternalBSharp.g:9438:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferencingFuncAccess().getReferencedFuncFunctionDeclIDTerminalRuleCall_2_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferencingFuncAccess().getReferencedFuncFunctionDeclIDTerminalRuleCall_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferencingFuncAccess().getReferencedFuncFunctionDeclCrossReference_2_0()); 
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
    // $ANTLR end "rule__ReferencingFunc__ReferencedFuncAssignment_2"

    // Delegated rules


    protected DFA56 dfa56 = new DFA56(this);
    static final String dfa_1s = "\10\uffff";
    static final String dfa_2s = "\1\1\7\uffff";
    static final String dfa_3s = "\1\5\1\uffff\1\5\1\uffff\4\5";
    static final String dfa_4s = "\1\76\1\uffff\1\57\1\uffff\1\100\1\61\1\100\1\61";
    static final String dfa_5s = "\1\uffff\1\2\1\uffff\1\1\4\uffff";
    static final String dfa_6s = "\10\uffff}>";
    static final String[] dfa_7s = {
            "\1\2\23\uffff\7\3\12\uffff\1\1\3\uffff\1\1\2\uffff\1\1\3\uffff\1\1\1\uffff\2\1\1\uffff\1\1\3\uffff\1\1",
            "",
            "\1\3\5\uffff\1\3\24\uffff\4\3\7\uffff\1\3\1\uffff\1\4\1\uffff\1\1",
            "",
            "\1\5\5\uffff\1\3\13\uffff\2\3\7\uffff\4\3\7\uffff\1\3\1\uffff\1\3\1\1\12\uffff\1\3\2\uffff\1\3\3\uffff\1\3",
            "\1\3\23\uffff\7\3\5\uffff\1\1\1\3\6\uffff\3\3\1\uffff\1\6",
            "\1\7\5\uffff\1\3\13\uffff\2\3\7\uffff\4\3\7\uffff\1\3\1\uffff\1\3\13\uffff\1\3\2\uffff\1\3\3\uffff\1\3",
            "\1\3\23\uffff\7\3\5\uffff\1\1\1\3\6\uffff\3\3\1\uffff\1\6"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA56 extends DFA {

        public DFA56(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 56;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()* loopback of 6225:2: ( rule__Infix__Group_1__0 )*";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0050038000000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000072L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0050020000000002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000018000000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0050020000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000001020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000880000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0088242000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0004200000000020L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00000000007FE000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00000000007FE002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0003000000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x1200280F01800820L,0x0000000000000001L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0020800000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0020800000000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x4500000000000020L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x4400000000000022L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000A00000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000400000000020L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x9200280F01800830L,0x0000000000000001L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0120000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000202000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0002400000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0002002000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000800000000020L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000280F00000820L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x00000000FE000020L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x00000000FE000022L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000804000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x1202680F01800820L,0x0000000000000001L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000200000000020L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000008000000L});

}