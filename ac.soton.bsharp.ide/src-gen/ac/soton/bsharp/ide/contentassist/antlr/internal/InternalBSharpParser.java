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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_WS", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ANY_OTHER", "'\\u00AC'", "'*'", "'\\u00D7'", "'\\u2192'", "'\\uE102'", "'\\uE100'", "'\\u2194'", "'\\u2916'", "'\\u21F8'", "'\\u21A3'", "'\\u2900'", "'\\u21A0'", "'\\u2200'", "'\\u2203'", "'\\u21D4'", "'\\u21D2'", "'='", "'\\u2260'", "'\\u2227'", "'\\u2228'", "'package'", "':'", "'.'", "'From'", "'Import'", "'Class'", "';'", "'<'", "'>'", "','", "'('", "')'", "'where'", "'Datatype'", "'|'", "'Extend'", "'{'", "'}'", "'match'", "'Theorems'", "'\\u00B7'", "'Instance'", "'INFIX'", "'\\u03BB'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
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


    // $ANTLR start "entryRuleBodyElements"
    // InternalBSharp.g:228:1: entryRuleBodyElements : ruleBodyElements EOF ;
    public final void entryRuleBodyElements() throws RecognitionException {
        try {
            // InternalBSharp.g:229:1: ( ruleBodyElements EOF )
            // InternalBSharp.g:230:1: ruleBodyElements EOF
            {
             before(grammarAccess.getBodyElementsRule()); 
            pushFollow(FOLLOW_1);
            ruleBodyElements();

            state._fsp--;

             after(grammarAccess.getBodyElementsRule()); 
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
    // $ANTLR end "entryRuleBodyElements"


    // $ANTLR start "ruleBodyElements"
    // InternalBSharp.g:237:1: ruleBodyElements : ( ( ( rule__BodyElements__Alternatives ) ) ( ( rule__BodyElements__Alternatives )* ) ) ;
    public final void ruleBodyElements() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:241:2: ( ( ( ( rule__BodyElements__Alternatives ) ) ( ( rule__BodyElements__Alternatives )* ) ) )
            // InternalBSharp.g:242:2: ( ( ( rule__BodyElements__Alternatives ) ) ( ( rule__BodyElements__Alternatives )* ) )
            {
            // InternalBSharp.g:242:2: ( ( ( rule__BodyElements__Alternatives ) ) ( ( rule__BodyElements__Alternatives )* ) )
            // InternalBSharp.g:243:3: ( ( rule__BodyElements__Alternatives ) ) ( ( rule__BodyElements__Alternatives )* )
            {
            // InternalBSharp.g:243:3: ( ( rule__BodyElements__Alternatives ) )
            // InternalBSharp.g:244:4: ( rule__BodyElements__Alternatives )
            {
             before(grammarAccess.getBodyElementsAccess().getAlternatives()); 
            // InternalBSharp.g:245:4: ( rule__BodyElements__Alternatives )
            // InternalBSharp.g:245:5: rule__BodyElements__Alternatives
            {
            pushFollow(FOLLOW_3);
            rule__BodyElements__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBodyElementsAccess().getAlternatives()); 

            }

            // InternalBSharp.g:248:3: ( ( rule__BodyElements__Alternatives )* )
            // InternalBSharp.g:249:4: ( rule__BodyElements__Alternatives )*
            {
             before(grammarAccess.getBodyElementsAccess().getAlternatives()); 
            // InternalBSharp.g:250:4: ( rule__BodyElements__Alternatives )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==36||LA1_0==44||LA1_0==46||LA1_0==52) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalBSharp.g:250:5: rule__BodyElements__Alternatives
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__BodyElements__Alternatives();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getBodyElementsAccess().getAlternatives()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBodyElements"


    // $ANTLR start "entryRuleGlobalImport"
    // InternalBSharp.g:260:1: entryRuleGlobalImport : ruleGlobalImport EOF ;
    public final void entryRuleGlobalImport() throws RecognitionException {
        try {
            // InternalBSharp.g:261:1: ( ruleGlobalImport EOF )
            // InternalBSharp.g:262:1: ruleGlobalImport EOF
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
    // InternalBSharp.g:269:1: ruleGlobalImport : ( ( rule__GlobalImport__Group__0 ) ) ;
    public final void ruleGlobalImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:273:2: ( ( ( rule__GlobalImport__Group__0 ) ) )
            // InternalBSharp.g:274:2: ( ( rule__GlobalImport__Group__0 ) )
            {
            // InternalBSharp.g:274:2: ( ( rule__GlobalImport__Group__0 ) )
            // InternalBSharp.g:275:3: ( rule__GlobalImport__Group__0 )
            {
             before(grammarAccess.getGlobalImportAccess().getGroup()); 
            // InternalBSharp.g:276:3: ( rule__GlobalImport__Group__0 )
            // InternalBSharp.g:276:4: rule__GlobalImport__Group__0
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
    // InternalBSharp.g:285:1: entryRuleFileImport : ruleFileImport EOF ;
    public final void entryRuleFileImport() throws RecognitionException {
        try {
            // InternalBSharp.g:286:1: ( ruleFileImport EOF )
            // InternalBSharp.g:287:1: ruleFileImport EOF
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
    // InternalBSharp.g:294:1: ruleFileImport : ( ( rule__FileImport__Group__0 ) ) ;
    public final void ruleFileImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:298:2: ( ( ( rule__FileImport__Group__0 ) ) )
            // InternalBSharp.g:299:2: ( ( rule__FileImport__Group__0 ) )
            {
            // InternalBSharp.g:299:2: ( ( rule__FileImport__Group__0 ) )
            // InternalBSharp.g:300:3: ( rule__FileImport__Group__0 )
            {
             before(grammarAccess.getFileImportAccess().getGroup()); 
            // InternalBSharp.g:301:3: ( rule__FileImport__Group__0 )
            // InternalBSharp.g:301:4: rule__FileImport__Group__0
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
    // InternalBSharp.g:310:1: entryRuleLocalImport : ruleLocalImport EOF ;
    public final void entryRuleLocalImport() throws RecognitionException {
        try {
            // InternalBSharp.g:311:1: ( ruleLocalImport EOF )
            // InternalBSharp.g:312:1: ruleLocalImport EOF
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
    // InternalBSharp.g:319:1: ruleLocalImport : ( ( rule__LocalImport__Group__0 ) ) ;
    public final void ruleLocalImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:323:2: ( ( ( rule__LocalImport__Group__0 ) ) )
            // InternalBSharp.g:324:2: ( ( rule__LocalImport__Group__0 ) )
            {
            // InternalBSharp.g:324:2: ( ( rule__LocalImport__Group__0 ) )
            // InternalBSharp.g:325:3: ( rule__LocalImport__Group__0 )
            {
             before(grammarAccess.getLocalImportAccess().getGroup()); 
            // InternalBSharp.g:326:3: ( rule__LocalImport__Group__0 )
            // InternalBSharp.g:326:4: rule__LocalImport__Group__0
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
    // InternalBSharp.g:335:1: entryRuleClass : ruleClass EOF ;
    public final void entryRuleClass() throws RecognitionException {
        try {
            // InternalBSharp.g:336:1: ( ruleClass EOF )
            // InternalBSharp.g:337:1: ruleClass EOF
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
    // InternalBSharp.g:344:1: ruleClass : ( ( rule__Class__Group__0 ) ) ;
    public final void ruleClass() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:348:2: ( ( ( rule__Class__Group__0 ) ) )
            // InternalBSharp.g:349:2: ( ( rule__Class__Group__0 ) )
            {
            // InternalBSharp.g:349:2: ( ( rule__Class__Group__0 ) )
            // InternalBSharp.g:350:3: ( rule__Class__Group__0 )
            {
             before(grammarAccess.getClassAccess().getGroup()); 
            // InternalBSharp.g:351:3: ( rule__Class__Group__0 )
            // InternalBSharp.g:351:4: rule__Class__Group__0
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


    // $ANTLR start "entryRulePolyContext"
    // InternalBSharp.g:360:1: entryRulePolyContext : rulePolyContext EOF ;
    public final void entryRulePolyContext() throws RecognitionException {
        try {
            // InternalBSharp.g:361:1: ( rulePolyContext EOF )
            // InternalBSharp.g:362:1: rulePolyContext EOF
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
    // InternalBSharp.g:369:1: rulePolyContext : ( ( rule__PolyContext__Group__0 ) ) ;
    public final void rulePolyContext() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:373:2: ( ( ( rule__PolyContext__Group__0 ) ) )
            // InternalBSharp.g:374:2: ( ( rule__PolyContext__Group__0 ) )
            {
            // InternalBSharp.g:374:2: ( ( rule__PolyContext__Group__0 ) )
            // InternalBSharp.g:375:3: ( rule__PolyContext__Group__0 )
            {
             before(grammarAccess.getPolyContextAccess().getGroup()); 
            // InternalBSharp.g:376:3: ( rule__PolyContext__Group__0 )
            // InternalBSharp.g:376:4: rule__PolyContext__Group__0
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
    // InternalBSharp.g:385:1: entryRulePolyType : rulePolyType EOF ;
    public final void entryRulePolyType() throws RecognitionException {
        try {
            // InternalBSharp.g:386:1: ( rulePolyType EOF )
            // InternalBSharp.g:387:1: rulePolyType EOF
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
    // InternalBSharp.g:394:1: rulePolyType : ( ( rule__PolyType__Group__0 ) ) ;
    public final void rulePolyType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:398:2: ( ( ( rule__PolyType__Group__0 ) ) )
            // InternalBSharp.g:399:2: ( ( rule__PolyType__Group__0 ) )
            {
            // InternalBSharp.g:399:2: ( ( rule__PolyType__Group__0 ) )
            // InternalBSharp.g:400:3: ( rule__PolyType__Group__0 )
            {
             before(grammarAccess.getPolyTypeAccess().getGroup()); 
            // InternalBSharp.g:401:3: ( rule__PolyType__Group__0 )
            // InternalBSharp.g:401:4: rule__PolyType__Group__0
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
    // InternalBSharp.g:410:1: entryRuleSuperTypeList : ruleSuperTypeList EOF ;
    public final void entryRuleSuperTypeList() throws RecognitionException {
        try {
            // InternalBSharp.g:411:1: ( ruleSuperTypeList EOF )
            // InternalBSharp.g:412:1: ruleSuperTypeList EOF
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
    // InternalBSharp.g:419:1: ruleSuperTypeList : ( ( rule__SuperTypeList__Group__0 ) ) ;
    public final void ruleSuperTypeList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:423:2: ( ( ( rule__SuperTypeList__Group__0 ) ) )
            // InternalBSharp.g:424:2: ( ( rule__SuperTypeList__Group__0 ) )
            {
            // InternalBSharp.g:424:2: ( ( rule__SuperTypeList__Group__0 ) )
            // InternalBSharp.g:425:3: ( rule__SuperTypeList__Group__0 )
            {
             before(grammarAccess.getSuperTypeListAccess().getGroup()); 
            // InternalBSharp.g:426:3: ( rule__SuperTypeList__Group__0 )
            // InternalBSharp.g:426:4: rule__SuperTypeList__Group__0
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


    // $ANTLR start "entryRuleConstructedType"
    // InternalBSharp.g:435:1: entryRuleConstructedType : ruleConstructedType EOF ;
    public final void entryRuleConstructedType() throws RecognitionException {
        try {
            // InternalBSharp.g:436:1: ( ruleConstructedType EOF )
            // InternalBSharp.g:437:1: ruleConstructedType EOF
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
    // InternalBSharp.g:444:1: ruleConstructedType : ( ( rule__ConstructedType__Group__0 ) ) ;
    public final void ruleConstructedType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:448:2: ( ( ( rule__ConstructedType__Group__0 ) ) )
            // InternalBSharp.g:449:2: ( ( rule__ConstructedType__Group__0 ) )
            {
            // InternalBSharp.g:449:2: ( ( rule__ConstructedType__Group__0 ) )
            // InternalBSharp.g:450:3: ( rule__ConstructedType__Group__0 )
            {
             before(grammarAccess.getConstructedTypeAccess().getGroup()); 
            // InternalBSharp.g:451:3: ( rule__ConstructedType__Group__0 )
            // InternalBSharp.g:451:4: rule__ConstructedType__Group__0
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


    // $ANTLR start "entryRuleTypeConstructor"
    // InternalBSharp.g:460:1: entryRuleTypeConstructor : ruleTypeConstructor EOF ;
    public final void entryRuleTypeConstructor() throws RecognitionException {
        try {
            // InternalBSharp.g:461:1: ( ruleTypeConstructor EOF )
            // InternalBSharp.g:462:1: ruleTypeConstructor EOF
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
    // InternalBSharp.g:469:1: ruleTypeConstructor : ( ( rule__TypeConstructor__Group__0 ) ) ;
    public final void ruleTypeConstructor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:473:2: ( ( ( rule__TypeConstructor__Group__0 ) ) )
            // InternalBSharp.g:474:2: ( ( rule__TypeConstructor__Group__0 ) )
            {
            // InternalBSharp.g:474:2: ( ( rule__TypeConstructor__Group__0 ) )
            // InternalBSharp.g:475:3: ( rule__TypeConstructor__Group__0 )
            {
             before(grammarAccess.getTypeConstructorAccess().getGroup()); 
            // InternalBSharp.g:476:3: ( rule__TypeConstructor__Group__0 )
            // InternalBSharp.g:476:4: rule__TypeConstructor__Group__0
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


    // $ANTLR start "entryRuleTypeConstrBracket"
    // InternalBSharp.g:485:1: entryRuleTypeConstrBracket : ruleTypeConstrBracket EOF ;
    public final void entryRuleTypeConstrBracket() throws RecognitionException {
        try {
            // InternalBSharp.g:486:1: ( ruleTypeConstrBracket EOF )
            // InternalBSharp.g:487:1: ruleTypeConstrBracket EOF
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
    // InternalBSharp.g:494:1: ruleTypeConstrBracket : ( ( rule__TypeConstrBracket__Group__0 ) ) ;
    public final void ruleTypeConstrBracket() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:498:2: ( ( ( rule__TypeConstrBracket__Group__0 ) ) )
            // InternalBSharp.g:499:2: ( ( rule__TypeConstrBracket__Group__0 ) )
            {
            // InternalBSharp.g:499:2: ( ( rule__TypeConstrBracket__Group__0 ) )
            // InternalBSharp.g:500:3: ( rule__TypeConstrBracket__Group__0 )
            {
             before(grammarAccess.getTypeConstrBracketAccess().getGroup()); 
            // InternalBSharp.g:501:3: ( rule__TypeConstrBracket__Group__0 )
            // InternalBSharp.g:501:4: rule__TypeConstrBracket__Group__0
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
    // InternalBSharp.g:510:1: entryRuleTypeDeclContext : ruleTypeDeclContext EOF ;
    public final void entryRuleTypeDeclContext() throws RecognitionException {
        try {
            // InternalBSharp.g:511:1: ( ruleTypeDeclContext EOF )
            // InternalBSharp.g:512:1: ruleTypeDeclContext EOF
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
    // InternalBSharp.g:519:1: ruleTypeDeclContext : ( ( rule__TypeDeclContext__Group__0 ) ) ;
    public final void ruleTypeDeclContext() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:523:2: ( ( ( rule__TypeDeclContext__Group__0 ) ) )
            // InternalBSharp.g:524:2: ( ( rule__TypeDeclContext__Group__0 ) )
            {
            // InternalBSharp.g:524:2: ( ( rule__TypeDeclContext__Group__0 ) )
            // InternalBSharp.g:525:3: ( rule__TypeDeclContext__Group__0 )
            {
             before(grammarAccess.getTypeDeclContextAccess().getGroup()); 
            // InternalBSharp.g:526:3: ( rule__TypeDeclContext__Group__0 )
            // InternalBSharp.g:526:4: rule__TypeDeclContext__Group__0
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


    // $ANTLR start "entryRuleTypeStructure"
    // InternalBSharp.g:535:1: entryRuleTypeStructure : ruleTypeStructure EOF ;
    public final void entryRuleTypeStructure() throws RecognitionException {
        try {
            // InternalBSharp.g:536:1: ( ruleTypeStructure EOF )
            // InternalBSharp.g:537:1: ruleTypeStructure EOF
            {
             before(grammarAccess.getTypeStructureRule()); 
            pushFollow(FOLLOW_1);
            ruleTypeStructure();

            state._fsp--;

             after(grammarAccess.getTypeStructureRule()); 
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
    // $ANTLR end "entryRuleTypeStructure"


    // $ANTLR start "ruleTypeStructure"
    // InternalBSharp.g:544:1: ruleTypeStructure : ( ( rule__TypeStructure__Group__0 ) ) ;
    public final void ruleTypeStructure() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:548:2: ( ( ( rule__TypeStructure__Group__0 ) ) )
            // InternalBSharp.g:549:2: ( ( rule__TypeStructure__Group__0 ) )
            {
            // InternalBSharp.g:549:2: ( ( rule__TypeStructure__Group__0 ) )
            // InternalBSharp.g:550:3: ( rule__TypeStructure__Group__0 )
            {
             before(grammarAccess.getTypeStructureAccess().getGroup()); 
            // InternalBSharp.g:551:3: ( rule__TypeStructure__Group__0 )
            // InternalBSharp.g:551:4: rule__TypeStructure__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TypeStructure__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTypeStructureAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypeStructure"


    // $ANTLR start "entryRuleWhere"
    // InternalBSharp.g:560:1: entryRuleWhere : ruleWhere EOF ;
    public final void entryRuleWhere() throws RecognitionException {
        try {
            // InternalBSharp.g:561:1: ( ruleWhere EOF )
            // InternalBSharp.g:562:1: ruleWhere EOF
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
    // InternalBSharp.g:569:1: ruleWhere : ( ( rule__Where__Group__0 ) ) ;
    public final void ruleWhere() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:573:2: ( ( ( rule__Where__Group__0 ) ) )
            // InternalBSharp.g:574:2: ( ( rule__Where__Group__0 ) )
            {
            // InternalBSharp.g:574:2: ( ( rule__Where__Group__0 ) )
            // InternalBSharp.g:575:3: ( rule__Where__Group__0 )
            {
             before(grammarAccess.getWhereAccess().getGroup()); 
            // InternalBSharp.g:576:3: ( rule__Where__Group__0 )
            // InternalBSharp.g:576:4: rule__Where__Group__0
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
    // InternalBSharp.g:585:1: entryRuleDatatype : ruleDatatype EOF ;
    public final void entryRuleDatatype() throws RecognitionException {
        try {
            // InternalBSharp.g:586:1: ( ruleDatatype EOF )
            // InternalBSharp.g:587:1: ruleDatatype EOF
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
    // InternalBSharp.g:594:1: ruleDatatype : ( ( rule__Datatype__Group__0 ) ) ;
    public final void ruleDatatype() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:598:2: ( ( ( rule__Datatype__Group__0 ) ) )
            // InternalBSharp.g:599:2: ( ( rule__Datatype__Group__0 ) )
            {
            // InternalBSharp.g:599:2: ( ( rule__Datatype__Group__0 ) )
            // InternalBSharp.g:600:3: ( rule__Datatype__Group__0 )
            {
             before(grammarAccess.getDatatypeAccess().getGroup()); 
            // InternalBSharp.g:601:3: ( rule__Datatype__Group__0 )
            // InternalBSharp.g:601:4: rule__Datatype__Group__0
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
    // InternalBSharp.g:610:1: entryRuleDatatypeConstructor : ruleDatatypeConstructor EOF ;
    public final void entryRuleDatatypeConstructor() throws RecognitionException {
        try {
            // InternalBSharp.g:611:1: ( ruleDatatypeConstructor EOF )
            // InternalBSharp.g:612:1: ruleDatatypeConstructor EOF
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
    // InternalBSharp.g:619:1: ruleDatatypeConstructor : ( ( rule__DatatypeConstructor__Group__0 ) ) ;
    public final void ruleDatatypeConstructor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:623:2: ( ( ( rule__DatatypeConstructor__Group__0 ) ) )
            // InternalBSharp.g:624:2: ( ( rule__DatatypeConstructor__Group__0 ) )
            {
            // InternalBSharp.g:624:2: ( ( rule__DatatypeConstructor__Group__0 ) )
            // InternalBSharp.g:625:3: ( rule__DatatypeConstructor__Group__0 )
            {
             before(grammarAccess.getDatatypeConstructorAccess().getGroup()); 
            // InternalBSharp.g:626:3: ( rule__DatatypeConstructor__Group__0 )
            // InternalBSharp.g:626:4: rule__DatatypeConstructor__Group__0
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
    // InternalBSharp.g:635:1: entryRuleExtend : ruleExtend EOF ;
    public final void entryRuleExtend() throws RecognitionException {
        try {
            // InternalBSharp.g:636:1: ( ruleExtend EOF )
            // InternalBSharp.g:637:1: ruleExtend EOF
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
    // InternalBSharp.g:644:1: ruleExtend : ( ( rule__Extend__Group__0 ) ) ;
    public final void ruleExtend() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:648:2: ( ( ( rule__Extend__Group__0 ) ) )
            // InternalBSharp.g:649:2: ( ( rule__Extend__Group__0 ) )
            {
            // InternalBSharp.g:649:2: ( ( rule__Extend__Group__0 ) )
            // InternalBSharp.g:650:3: ( rule__Extend__Group__0 )
            {
             before(grammarAccess.getExtendAccess().getGroup()); 
            // InternalBSharp.g:651:3: ( rule__Extend__Group__0 )
            // InternalBSharp.g:651:4: rule__Extend__Group__0
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
    // InternalBSharp.g:660:1: entryRuleBSharpBlock : ruleBSharpBlock EOF ;
    public final void entryRuleBSharpBlock() throws RecognitionException {
        try {
            // InternalBSharp.g:661:1: ( ruleBSharpBlock EOF )
            // InternalBSharp.g:662:1: ruleBSharpBlock EOF
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
    // InternalBSharp.g:669:1: ruleBSharpBlock : ( ( rule__BSharpBlock__Group__0 ) ) ;
    public final void ruleBSharpBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:673:2: ( ( ( rule__BSharpBlock__Group__0 ) ) )
            // InternalBSharp.g:674:2: ( ( rule__BSharpBlock__Group__0 ) )
            {
            // InternalBSharp.g:674:2: ( ( rule__BSharpBlock__Group__0 ) )
            // InternalBSharp.g:675:3: ( rule__BSharpBlock__Group__0 )
            {
             before(grammarAccess.getBSharpBlockAccess().getGroup()); 
            // InternalBSharp.g:676:3: ( rule__BSharpBlock__Group__0 )
            // InternalBSharp.g:676:4: rule__BSharpBlock__Group__0
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


    // $ANTLR start "entryRuleTypeBodyElements"
    // InternalBSharp.g:685:1: entryRuleTypeBodyElements : ruleTypeBodyElements EOF ;
    public final void entryRuleTypeBodyElements() throws RecognitionException {
        try {
            // InternalBSharp.g:686:1: ( ruleTypeBodyElements EOF )
            // InternalBSharp.g:687:1: ruleTypeBodyElements EOF
            {
             before(grammarAccess.getTypeBodyElementsRule()); 
            pushFollow(FOLLOW_1);
            ruleTypeBodyElements();

            state._fsp--;

             after(grammarAccess.getTypeBodyElementsRule()); 
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
    // $ANTLR end "entryRuleTypeBodyElements"


    // $ANTLR start "ruleTypeBodyElements"
    // InternalBSharp.g:694:1: ruleTypeBodyElements : ( ( rule__TypeBodyElements__Alternatives ) ) ;
    public final void ruleTypeBodyElements() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:698:2: ( ( ( rule__TypeBodyElements__Alternatives ) ) )
            // InternalBSharp.g:699:2: ( ( rule__TypeBodyElements__Alternatives ) )
            {
            // InternalBSharp.g:699:2: ( ( rule__TypeBodyElements__Alternatives ) )
            // InternalBSharp.g:700:3: ( rule__TypeBodyElements__Alternatives )
            {
             before(grammarAccess.getTypeBodyElementsAccess().getAlternatives()); 
            // InternalBSharp.g:701:3: ( rule__TypeBodyElements__Alternatives )
            // InternalBSharp.g:701:4: rule__TypeBodyElements__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TypeBodyElements__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeBodyElementsAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypeBodyElements"


    // $ANTLR start "entryRuleFunctionDecl"
    // InternalBSharp.g:710:1: entryRuleFunctionDecl : ruleFunctionDecl EOF ;
    public final void entryRuleFunctionDecl() throws RecognitionException {
        try {
            // InternalBSharp.g:711:1: ( ruleFunctionDecl EOF )
            // InternalBSharp.g:712:1: ruleFunctionDecl EOF
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
    // InternalBSharp.g:719:1: ruleFunctionDecl : ( ( rule__FunctionDecl__Group__0 ) ) ;
    public final void ruleFunctionDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:723:2: ( ( ( rule__FunctionDecl__Group__0 ) ) )
            // InternalBSharp.g:724:2: ( ( rule__FunctionDecl__Group__0 ) )
            {
            // InternalBSharp.g:724:2: ( ( rule__FunctionDecl__Group__0 ) )
            // InternalBSharp.g:725:3: ( rule__FunctionDecl__Group__0 )
            {
             before(grammarAccess.getFunctionDeclAccess().getGroup()); 
            // InternalBSharp.g:726:3: ( rule__FunctionDecl__Group__0 )
            // InternalBSharp.g:726:4: rule__FunctionDecl__Group__0
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


    // $ANTLR start "entryRuleFunctionName"
    // InternalBSharp.g:735:1: entryRuleFunctionName : ruleFunctionName EOF ;
    public final void entryRuleFunctionName() throws RecognitionException {
        try {
            // InternalBSharp.g:736:1: ( ruleFunctionName EOF )
            // InternalBSharp.g:737:1: ruleFunctionName EOF
            {
             before(grammarAccess.getFunctionNameRule()); 
            pushFollow(FOLLOW_1);
            ruleFunctionName();

            state._fsp--;

             after(grammarAccess.getFunctionNameRule()); 
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
    // $ANTLR end "entryRuleFunctionName"


    // $ANTLR start "ruleFunctionName"
    // InternalBSharp.g:744:1: ruleFunctionName : ( ( rule__FunctionName__NameAssignment ) ) ;
    public final void ruleFunctionName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:748:2: ( ( ( rule__FunctionName__NameAssignment ) ) )
            // InternalBSharp.g:749:2: ( ( rule__FunctionName__NameAssignment ) )
            {
            // InternalBSharp.g:749:2: ( ( rule__FunctionName__NameAssignment ) )
            // InternalBSharp.g:750:3: ( rule__FunctionName__NameAssignment )
            {
             before(grammarAccess.getFunctionNameAccess().getNameAssignment()); 
            // InternalBSharp.g:751:3: ( rule__FunctionName__NameAssignment )
            // InternalBSharp.g:751:4: rule__FunctionName__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__FunctionName__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getFunctionNameAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFunctionName"


    // $ANTLR start "entryRuleMatchStatement"
    // InternalBSharp.g:760:1: entryRuleMatchStatement : ruleMatchStatement EOF ;
    public final void entryRuleMatchStatement() throws RecognitionException {
        try {
            // InternalBSharp.g:761:1: ( ruleMatchStatement EOF )
            // InternalBSharp.g:762:1: ruleMatchStatement EOF
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
    // InternalBSharp.g:769:1: ruleMatchStatement : ( ( rule__MatchStatement__Group__0 ) ) ;
    public final void ruleMatchStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:773:2: ( ( ( rule__MatchStatement__Group__0 ) ) )
            // InternalBSharp.g:774:2: ( ( rule__MatchStatement__Group__0 ) )
            {
            // InternalBSharp.g:774:2: ( ( rule__MatchStatement__Group__0 ) )
            // InternalBSharp.g:775:3: ( rule__MatchStatement__Group__0 )
            {
             before(grammarAccess.getMatchStatementAccess().getGroup()); 
            // InternalBSharp.g:776:3: ( rule__MatchStatement__Group__0 )
            // InternalBSharp.g:776:4: rule__MatchStatement__Group__0
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
    // InternalBSharp.g:785:1: entryRuleMatchCase : ruleMatchCase EOF ;
    public final void entryRuleMatchCase() throws RecognitionException {
        try {
            // InternalBSharp.g:786:1: ( ruleMatchCase EOF )
            // InternalBSharp.g:787:1: ruleMatchCase EOF
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
    // InternalBSharp.g:794:1: ruleMatchCase : ( ( rule__MatchCase__Group__0 ) ) ;
    public final void ruleMatchCase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:798:2: ( ( ( rule__MatchCase__Group__0 ) ) )
            // InternalBSharp.g:799:2: ( ( rule__MatchCase__Group__0 ) )
            {
            // InternalBSharp.g:799:2: ( ( rule__MatchCase__Group__0 ) )
            // InternalBSharp.g:800:3: ( rule__MatchCase__Group__0 )
            {
             before(grammarAccess.getMatchCaseAccess().getGroup()); 
            // InternalBSharp.g:801:3: ( rule__MatchCase__Group__0 )
            // InternalBSharp.g:801:4: rule__MatchCase__Group__0
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
    // InternalBSharp.g:810:1: entryRuleTheoremBody : ruleTheoremBody EOF ;
    public final void entryRuleTheoremBody() throws RecognitionException {
        try {
            // InternalBSharp.g:811:1: ( ruleTheoremBody EOF )
            // InternalBSharp.g:812:1: ruleTheoremBody EOF
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
    // InternalBSharp.g:819:1: ruleTheoremBody : ( ( rule__TheoremBody__Group__0 ) ) ;
    public final void ruleTheoremBody() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:823:2: ( ( ( rule__TheoremBody__Group__0 ) ) )
            // InternalBSharp.g:824:2: ( ( rule__TheoremBody__Group__0 ) )
            {
            // InternalBSharp.g:824:2: ( ( rule__TheoremBody__Group__0 ) )
            // InternalBSharp.g:825:3: ( rule__TheoremBody__Group__0 )
            {
             before(grammarAccess.getTheoremBodyAccess().getGroup()); 
            // InternalBSharp.g:826:3: ( rule__TheoremBody__Group__0 )
            // InternalBSharp.g:826:4: rule__TheoremBody__Group__0
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
    // InternalBSharp.g:835:1: entryRuleTheoremDecl : ruleTheoremDecl EOF ;
    public final void entryRuleTheoremDecl() throws RecognitionException {
        try {
            // InternalBSharp.g:836:1: ( ruleTheoremDecl EOF )
            // InternalBSharp.g:837:1: ruleTheoremDecl EOF
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
    // InternalBSharp.g:844:1: ruleTheoremDecl : ( ( rule__TheoremDecl__Group__0 ) ) ;
    public final void ruleTheoremDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:848:2: ( ( ( rule__TheoremDecl__Group__0 ) ) )
            // InternalBSharp.g:849:2: ( ( rule__TheoremDecl__Group__0 ) )
            {
            // InternalBSharp.g:849:2: ( ( rule__TheoremDecl__Group__0 ) )
            // InternalBSharp.g:850:3: ( rule__TheoremDecl__Group__0 )
            {
             before(grammarAccess.getTheoremDeclAccess().getGroup()); 
            // InternalBSharp.g:851:3: ( rule__TheoremDecl__Group__0 )
            // InternalBSharp.g:851:4: rule__TheoremDecl__Group__0
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
    // InternalBSharp.g:860:1: entryRuleTypedVariableList : ruleTypedVariableList EOF ;
    public final void entryRuleTypedVariableList() throws RecognitionException {
        try {
            // InternalBSharp.g:861:1: ( ruleTypedVariableList EOF )
            // InternalBSharp.g:862:1: ruleTypedVariableList EOF
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
    // InternalBSharp.g:869:1: ruleTypedVariableList : ( ( rule__TypedVariableList__Group__0 ) ) ;
    public final void ruleTypedVariableList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:873:2: ( ( ( rule__TypedVariableList__Group__0 ) ) )
            // InternalBSharp.g:874:2: ( ( rule__TypedVariableList__Group__0 ) )
            {
            // InternalBSharp.g:874:2: ( ( rule__TypedVariableList__Group__0 ) )
            // InternalBSharp.g:875:3: ( rule__TypedVariableList__Group__0 )
            {
             before(grammarAccess.getTypedVariableListAccess().getGroup()); 
            // InternalBSharp.g:876:3: ( rule__TypedVariableList__Group__0 )
            // InternalBSharp.g:876:4: rule__TypedVariableList__Group__0
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
    // InternalBSharp.g:885:1: entryRuleVariableTyping : ruleVariableTyping EOF ;
    public final void entryRuleVariableTyping() throws RecognitionException {
        try {
            // InternalBSharp.g:886:1: ( ruleVariableTyping EOF )
            // InternalBSharp.g:887:1: ruleVariableTyping EOF
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
    // InternalBSharp.g:894:1: ruleVariableTyping : ( ( rule__VariableTyping__Group__0 ) ) ;
    public final void ruleVariableTyping() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:898:2: ( ( ( rule__VariableTyping__Group__0 ) ) )
            // InternalBSharp.g:899:2: ( ( rule__VariableTyping__Group__0 ) )
            {
            // InternalBSharp.g:899:2: ( ( rule__VariableTyping__Group__0 ) )
            // InternalBSharp.g:900:3: ( rule__VariableTyping__Group__0 )
            {
             before(grammarAccess.getVariableTypingAccess().getGroup()); 
            // InternalBSharp.g:901:3: ( rule__VariableTyping__Group__0 )
            // InternalBSharp.g:901:4: rule__VariableTyping__Group__0
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
    // InternalBSharp.g:910:1: entryRuleTypedVariable : ruleTypedVariable EOF ;
    public final void entryRuleTypedVariable() throws RecognitionException {
        try {
            // InternalBSharp.g:911:1: ( ruleTypedVariable EOF )
            // InternalBSharp.g:912:1: ruleTypedVariable EOF
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
    // InternalBSharp.g:919:1: ruleTypedVariable : ( ( rule__TypedVariable__NameAssignment ) ) ;
    public final void ruleTypedVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:923:2: ( ( ( rule__TypedVariable__NameAssignment ) ) )
            // InternalBSharp.g:924:2: ( ( rule__TypedVariable__NameAssignment ) )
            {
            // InternalBSharp.g:924:2: ( ( rule__TypedVariable__NameAssignment ) )
            // InternalBSharp.g:925:3: ( rule__TypedVariable__NameAssignment )
            {
             before(grammarAccess.getTypedVariableAccess().getNameAssignment()); 
            // InternalBSharp.g:926:3: ( rule__TypedVariable__NameAssignment )
            // InternalBSharp.g:926:4: rule__TypedVariable__NameAssignment
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
    // InternalBSharp.g:935:1: entryRuleLambda : ruleLambda EOF ;
    public final void entryRuleLambda() throws RecognitionException {
        try {
            // InternalBSharp.g:936:1: ( ruleLambda EOF )
            // InternalBSharp.g:937:1: ruleLambda EOF
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
    // InternalBSharp.g:944:1: ruleLambda : ( ( rule__Lambda__Group__0 ) ) ;
    public final void ruleLambda() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:948:2: ( ( ( rule__Lambda__Group__0 ) ) )
            // InternalBSharp.g:949:2: ( ( rule__Lambda__Group__0 ) )
            {
            // InternalBSharp.g:949:2: ( ( rule__Lambda__Group__0 ) )
            // InternalBSharp.g:950:3: ( rule__Lambda__Group__0 )
            {
             before(grammarAccess.getLambdaAccess().getGroup()); 
            // InternalBSharp.g:951:3: ( rule__Lambda__Group__0 )
            // InternalBSharp.g:951:4: rule__Lambda__Group__0
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
    // InternalBSharp.g:960:1: entryRuleQuantifier : ruleQuantifier EOF ;
    public final void entryRuleQuantifier() throws RecognitionException {
        try {
            // InternalBSharp.g:961:1: ( ruleQuantifier EOF )
            // InternalBSharp.g:962:1: ruleQuantifier EOF
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
    // InternalBSharp.g:969:1: ruleQuantifier : ( ( rule__Quantifier__Group__0 ) ) ;
    public final void ruleQuantifier() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:973:2: ( ( ( rule__Quantifier__Group__0 ) ) )
            // InternalBSharp.g:974:2: ( ( rule__Quantifier__Group__0 ) )
            {
            // InternalBSharp.g:974:2: ( ( rule__Quantifier__Group__0 ) )
            // InternalBSharp.g:975:3: ( rule__Quantifier__Group__0 )
            {
             before(grammarAccess.getQuantifierAccess().getGroup()); 
            // InternalBSharp.g:976:3: ( rule__Quantifier__Group__0 )
            // InternalBSharp.g:976:4: rule__Quantifier__Group__0
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
    // InternalBSharp.g:985:1: entryRuleRootExpression : ruleRootExpression EOF ;
    public final void entryRuleRootExpression() throws RecognitionException {
        try {
            // InternalBSharp.g:986:1: ( ruleRootExpression EOF )
            // InternalBSharp.g:987:1: ruleRootExpression EOF
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
    // InternalBSharp.g:994:1: ruleRootExpression : ( ( rule__RootExpression__Alternatives ) ) ;
    public final void ruleRootExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:998:2: ( ( ( rule__RootExpression__Alternatives ) ) )
            // InternalBSharp.g:999:2: ( ( rule__RootExpression__Alternatives ) )
            {
            // InternalBSharp.g:999:2: ( ( rule__RootExpression__Alternatives ) )
            // InternalBSharp.g:1000:3: ( rule__RootExpression__Alternatives )
            {
             before(grammarAccess.getRootExpressionAccess().getAlternatives()); 
            // InternalBSharp.g:1001:3: ( rule__RootExpression__Alternatives )
            // InternalBSharp.g:1001:4: rule__RootExpression__Alternatives
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
    // InternalBSharp.g:1010:1: entryRulePrefix : rulePrefix EOF ;
    public final void entryRulePrefix() throws RecognitionException {
        try {
            // InternalBSharp.g:1011:1: ( rulePrefix EOF )
            // InternalBSharp.g:1012:1: rulePrefix EOF
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
    // InternalBSharp.g:1019:1: rulePrefix : ( ( rule__Prefix__Group__0 ) ) ;
    public final void rulePrefix() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1023:2: ( ( ( rule__Prefix__Group__0 ) ) )
            // InternalBSharp.g:1024:2: ( ( rule__Prefix__Group__0 ) )
            {
            // InternalBSharp.g:1024:2: ( ( rule__Prefix__Group__0 ) )
            // InternalBSharp.g:1025:3: ( rule__Prefix__Group__0 )
            {
             before(grammarAccess.getPrefixAccess().getGroup()); 
            // InternalBSharp.g:1026:3: ( rule__Prefix__Group__0 )
            // InternalBSharp.g:1026:4: rule__Prefix__Group__0
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
    // InternalBSharp.g:1035:1: entryRulePrefixBuiltIn : rulePrefixBuiltIn EOF ;
    public final void entryRulePrefixBuiltIn() throws RecognitionException {
        try {
            // InternalBSharp.g:1036:1: ( rulePrefixBuiltIn EOF )
            // InternalBSharp.g:1037:1: rulePrefixBuiltIn EOF
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
    // InternalBSharp.g:1044:1: rulePrefixBuiltIn : ( '\\u00AC' ) ;
    public final void rulePrefixBuiltIn() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1048:2: ( ( '\\u00AC' ) )
            // InternalBSharp.g:1049:2: ( '\\u00AC' )
            {
            // InternalBSharp.g:1049:2: ( '\\u00AC' )
            // InternalBSharp.g:1050:3: '\\u00AC'
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
    // InternalBSharp.g:1060:1: entryRuleInfix : ruleInfix EOF ;
    public final void entryRuleInfix() throws RecognitionException {
        try {
            // InternalBSharp.g:1061:1: ( ruleInfix EOF )
            // InternalBSharp.g:1062:1: ruleInfix EOF
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
    // InternalBSharp.g:1069:1: ruleInfix : ( ( rule__Infix__Group__0 ) ) ;
    public final void ruleInfix() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1073:2: ( ( ( rule__Infix__Group__0 ) ) )
            // InternalBSharp.g:1074:2: ( ( rule__Infix__Group__0 ) )
            {
            // InternalBSharp.g:1074:2: ( ( rule__Infix__Group__0 ) )
            // InternalBSharp.g:1075:3: ( rule__Infix__Group__0 )
            {
             before(grammarAccess.getInfixAccess().getGroup()); 
            // InternalBSharp.g:1076:3: ( rule__Infix__Group__0 )
            // InternalBSharp.g:1076:4: rule__Infix__Group__0
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
    // InternalBSharp.g:1085:1: entryRuleElement : ruleElement EOF ;
    public final void entryRuleElement() throws RecognitionException {
        try {
            // InternalBSharp.g:1086:1: ( ruleElement EOF )
            // InternalBSharp.g:1087:1: ruleElement EOF
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
    // InternalBSharp.g:1094:1: ruleElement : ( ( rule__Element__Alternatives ) ) ;
    public final void ruleElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1098:2: ( ( ( rule__Element__Alternatives ) ) )
            // InternalBSharp.g:1099:2: ( ( rule__Element__Alternatives ) )
            {
            // InternalBSharp.g:1099:2: ( ( rule__Element__Alternatives ) )
            // InternalBSharp.g:1100:3: ( rule__Element__Alternatives )
            {
             before(grammarAccess.getElementAccess().getAlternatives()); 
            // InternalBSharp.g:1101:3: ( rule__Element__Alternatives )
            // InternalBSharp.g:1101:4: rule__Element__Alternatives
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
    // InternalBSharp.g:1110:1: entryRuleBracket : ruleBracket EOF ;
    public final void entryRuleBracket() throws RecognitionException {
        try {
            // InternalBSharp.g:1111:1: ( ruleBracket EOF )
            // InternalBSharp.g:1112:1: ruleBracket EOF
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
    // InternalBSharp.g:1119:1: ruleBracket : ( ( rule__Bracket__Group__0 ) ) ;
    public final void ruleBracket() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1123:2: ( ( ( rule__Bracket__Group__0 ) ) )
            // InternalBSharp.g:1124:2: ( ( rule__Bracket__Group__0 ) )
            {
            // InternalBSharp.g:1124:2: ( ( rule__Bracket__Group__0 ) )
            // InternalBSharp.g:1125:3: ( rule__Bracket__Group__0 )
            {
             before(grammarAccess.getBracketAccess().getGroup()); 
            // InternalBSharp.g:1126:3: ( rule__Bracket__Group__0 )
            // InternalBSharp.g:1126:4: rule__Bracket__Group__0
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
    // InternalBSharp.g:1135:1: entryRuleFunctionCall : ruleFunctionCall EOF ;
    public final void entryRuleFunctionCall() throws RecognitionException {
        try {
            // InternalBSharp.g:1136:1: ( ruleFunctionCall EOF )
            // InternalBSharp.g:1137:1: ruleFunctionCall EOF
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
    // InternalBSharp.g:1144:1: ruleFunctionCall : ( ( rule__FunctionCall__Group__0 ) ) ;
    public final void ruleFunctionCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1148:2: ( ( ( rule__FunctionCall__Group__0 ) ) )
            // InternalBSharp.g:1149:2: ( ( rule__FunctionCall__Group__0 ) )
            {
            // InternalBSharp.g:1149:2: ( ( rule__FunctionCall__Group__0 ) )
            // InternalBSharp.g:1150:3: ( rule__FunctionCall__Group__0 )
            {
             before(grammarAccess.getFunctionCallAccess().getGroup()); 
            // InternalBSharp.g:1151:3: ( rule__FunctionCall__Group__0 )
            // InternalBSharp.g:1151:4: rule__FunctionCall__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FunctionCall__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionCallAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleClassVarDecl"
    // InternalBSharp.g:1160:1: entryRuleClassVarDecl : ruleClassVarDecl EOF ;
    public final void entryRuleClassVarDecl() throws RecognitionException {
        try {
            // InternalBSharp.g:1161:1: ( ruleClassVarDecl EOF )
            // InternalBSharp.g:1162:1: ruleClassVarDecl EOF
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
    // InternalBSharp.g:1169:1: ruleClassVarDecl : ( ( rule__ClassVarDecl__Group__0 ) ) ;
    public final void ruleClassVarDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1173:2: ( ( ( rule__ClassVarDecl__Group__0 ) ) )
            // InternalBSharp.g:1174:2: ( ( rule__ClassVarDecl__Group__0 ) )
            {
            // InternalBSharp.g:1174:2: ( ( rule__ClassVarDecl__Group__0 ) )
            // InternalBSharp.g:1175:3: ( rule__ClassVarDecl__Group__0 )
            {
             before(grammarAccess.getClassVarDeclAccess().getGroup()); 
            // InternalBSharp.g:1176:3: ( rule__ClassVarDecl__Group__0 )
            // InternalBSharp.g:1176:4: rule__ClassVarDecl__Group__0
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
    // InternalBSharp.g:1185:1: entryRuleInbuiltInfix : ruleInbuiltInfix EOF ;
    public final void entryRuleInbuiltInfix() throws RecognitionException {
        try {
            // InternalBSharp.g:1186:1: ( ruleInbuiltInfix EOF )
            // InternalBSharp.g:1187:1: ruleInbuiltInfix EOF
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
    // InternalBSharp.g:1194:1: ruleInbuiltInfix : ( ( rule__InbuiltInfix__Alternatives ) ) ;
    public final void ruleInbuiltInfix() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1198:2: ( ( ( rule__InbuiltInfix__Alternatives ) ) )
            // InternalBSharp.g:1199:2: ( ( rule__InbuiltInfix__Alternatives ) )
            {
            // InternalBSharp.g:1199:2: ( ( rule__InbuiltInfix__Alternatives ) )
            // InternalBSharp.g:1200:3: ( rule__InbuiltInfix__Alternatives )
            {
             before(grammarAccess.getInbuiltInfixAccess().getAlternatives()); 
            // InternalBSharp.g:1201:3: ( rule__InbuiltInfix__Alternatives )
            // InternalBSharp.g:1201:4: rule__InbuiltInfix__Alternatives
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


    // $ANTLR start "entryRuleInstance"
    // InternalBSharp.g:1210:1: entryRuleInstance : ruleInstance EOF ;
    public final void entryRuleInstance() throws RecognitionException {
        try {
            // InternalBSharp.g:1211:1: ( ruleInstance EOF )
            // InternalBSharp.g:1212:1: ruleInstance EOF
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
    // InternalBSharp.g:1219:1: ruleInstance : ( ( rule__Instance__Group__0 ) ) ;
    public final void ruleInstance() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1223:2: ( ( ( rule__Instance__Group__0 ) ) )
            // InternalBSharp.g:1224:2: ( ( rule__Instance__Group__0 ) )
            {
            // InternalBSharp.g:1224:2: ( ( rule__Instance__Group__0 ) )
            // InternalBSharp.g:1225:3: ( rule__Instance__Group__0 )
            {
             before(grammarAccess.getInstanceAccess().getGroup()); 
            // InternalBSharp.g:1226:3: ( rule__Instance__Group__0 )
            // InternalBSharp.g:1226:4: rule__Instance__Group__0
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


    // $ANTLR start "rule__THM_NAME__Alternatives_0"
    // InternalBSharp.g:1234:1: rule__THM_NAME__Alternatives_0 : ( ( RULE_INT ) | ( RULE_ID ) | ( RULE_WS ) );
    public final void rule__THM_NAME__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1238:1: ( ( RULE_INT ) | ( RULE_ID ) | ( RULE_WS ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt2=1;
                }
                break;
            case RULE_ID:
                {
                alt2=2;
                }
                break;
            case RULE_WS:
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
                    // InternalBSharp.g:1239:2: ( RULE_INT )
                    {
                    // InternalBSharp.g:1239:2: ( RULE_INT )
                    // InternalBSharp.g:1240:3: RULE_INT
                    {
                     before(grammarAccess.getTHM_NAMEAccess().getINTTerminalRuleCall_0_0()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getTHM_NAMEAccess().getINTTerminalRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBSharp.g:1245:2: ( RULE_ID )
                    {
                    // InternalBSharp.g:1245:2: ( RULE_ID )
                    // InternalBSharp.g:1246:3: RULE_ID
                    {
                     before(grammarAccess.getTHM_NAMEAccess().getIDTerminalRuleCall_0_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getTHM_NAMEAccess().getIDTerminalRuleCall_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBSharp.g:1251:2: ( RULE_WS )
                    {
                    // InternalBSharp.g:1251:2: ( RULE_WS )
                    // InternalBSharp.g:1252:3: RULE_WS
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
    // InternalBSharp.g:1261:1: rule__ClassDecl__Alternatives : ( ( ruleClass ) | ( ruleDatatype ) );
    public final void rule__ClassDecl__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1265:1: ( ( ruleClass ) | ( ruleDatatype ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==36) ) {
                alt3=1;
            }
            else if ( (LA3_0==44) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalBSharp.g:1266:2: ( ruleClass )
                    {
                    // InternalBSharp.g:1266:2: ( ruleClass )
                    // InternalBSharp.g:1267:3: ruleClass
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
                    // InternalBSharp.g:1272:2: ( ruleDatatype )
                    {
                    // InternalBSharp.g:1272:2: ( ruleDatatype )
                    // InternalBSharp.g:1273:3: ruleDatatype
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


    // $ANTLR start "rule__TopLevelImport__Alternatives_0"
    // InternalBSharp.g:1282:1: rule__TopLevelImport__Alternatives_0 : ( ( ( rule__TopLevelImport__GlobalImportsAssignment_0_0 ) ) | ( ( rule__TopLevelImport__LocalImportsAssignment_0_1 ) ) );
    public final void rule__TopLevelImport__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1286:1: ( ( ( rule__TopLevelImport__GlobalImportsAssignment_0_0 ) ) | ( ( rule__TopLevelImport__LocalImportsAssignment_0_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==34) ) {
                alt4=1;
            }
            else if ( (LA4_0==35) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalBSharp.g:1287:2: ( ( rule__TopLevelImport__GlobalImportsAssignment_0_0 ) )
                    {
                    // InternalBSharp.g:1287:2: ( ( rule__TopLevelImport__GlobalImportsAssignment_0_0 ) )
                    // InternalBSharp.g:1288:3: ( rule__TopLevelImport__GlobalImportsAssignment_0_0 )
                    {
                     before(grammarAccess.getTopLevelImportAccess().getGlobalImportsAssignment_0_0()); 
                    // InternalBSharp.g:1289:3: ( rule__TopLevelImport__GlobalImportsAssignment_0_0 )
                    // InternalBSharp.g:1289:4: rule__TopLevelImport__GlobalImportsAssignment_0_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TopLevelImport__GlobalImportsAssignment_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTopLevelImportAccess().getGlobalImportsAssignment_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBSharp.g:1293:2: ( ( rule__TopLevelImport__LocalImportsAssignment_0_1 ) )
                    {
                    // InternalBSharp.g:1293:2: ( ( rule__TopLevelImport__LocalImportsAssignment_0_1 ) )
                    // InternalBSharp.g:1294:3: ( rule__TopLevelImport__LocalImportsAssignment_0_1 )
                    {
                     before(grammarAccess.getTopLevelImportAccess().getLocalImportsAssignment_0_1()); 
                    // InternalBSharp.g:1295:3: ( rule__TopLevelImport__LocalImportsAssignment_0_1 )
                    // InternalBSharp.g:1295:4: rule__TopLevelImport__LocalImportsAssignment_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__TopLevelImport__LocalImportsAssignment_0_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getTopLevelImportAccess().getLocalImportsAssignment_0_1()); 

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
    // $ANTLR end "rule__TopLevelImport__Alternatives_0"


    // $ANTLR start "rule__BodyElements__Alternatives"
    // InternalBSharp.g:1303:1: rule__BodyElements__Alternatives : ( ( ( rule__BodyElements__ClassesAssignment_0 ) ) | ( ( rule__BodyElements__ExtendsAssignment_1 ) ) | ( ( rule__BodyElements__InstancesAssignment_2 ) ) );
    public final void rule__BodyElements__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1307:1: ( ( ( rule__BodyElements__ClassesAssignment_0 ) ) | ( ( rule__BodyElements__ExtendsAssignment_1 ) ) | ( ( rule__BodyElements__InstancesAssignment_2 ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 36:
            case 44:
                {
                alt5=1;
                }
                break;
            case 46:
                {
                alt5=2;
                }
                break;
            case 52:
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
                    // InternalBSharp.g:1308:2: ( ( rule__BodyElements__ClassesAssignment_0 ) )
                    {
                    // InternalBSharp.g:1308:2: ( ( rule__BodyElements__ClassesAssignment_0 ) )
                    // InternalBSharp.g:1309:3: ( rule__BodyElements__ClassesAssignment_0 )
                    {
                     before(grammarAccess.getBodyElementsAccess().getClassesAssignment_0()); 
                    // InternalBSharp.g:1310:3: ( rule__BodyElements__ClassesAssignment_0 )
                    // InternalBSharp.g:1310:4: rule__BodyElements__ClassesAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BodyElements__ClassesAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBodyElementsAccess().getClassesAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBSharp.g:1314:2: ( ( rule__BodyElements__ExtendsAssignment_1 ) )
                    {
                    // InternalBSharp.g:1314:2: ( ( rule__BodyElements__ExtendsAssignment_1 ) )
                    // InternalBSharp.g:1315:3: ( rule__BodyElements__ExtendsAssignment_1 )
                    {
                     before(grammarAccess.getBodyElementsAccess().getExtendsAssignment_1()); 
                    // InternalBSharp.g:1316:3: ( rule__BodyElements__ExtendsAssignment_1 )
                    // InternalBSharp.g:1316:4: rule__BodyElements__ExtendsAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__BodyElements__ExtendsAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getBodyElementsAccess().getExtendsAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBSharp.g:1320:2: ( ( rule__BodyElements__InstancesAssignment_2 ) )
                    {
                    // InternalBSharp.g:1320:2: ( ( rule__BodyElements__InstancesAssignment_2 ) )
                    // InternalBSharp.g:1321:3: ( rule__BodyElements__InstancesAssignment_2 )
                    {
                     before(grammarAccess.getBodyElementsAccess().getInstancesAssignment_2()); 
                    // InternalBSharp.g:1322:3: ( rule__BodyElements__InstancesAssignment_2 )
                    // InternalBSharp.g:1322:4: rule__BodyElements__InstancesAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__BodyElements__InstancesAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getBodyElementsAccess().getInstancesAssignment_2()); 

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
    // $ANTLR end "rule__BodyElements__Alternatives"


    // $ANTLR start "rule__FileImport__Alternatives_1_1"
    // InternalBSharp.g:1330:1: rule__FileImport__Alternatives_1_1 : ( ( '*' ) | ( ( rule__FileImport__TypeAssignment_1_1_1 ) ) );
    public final void rule__FileImport__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1334:1: ( ( '*' ) | ( ( rule__FileImport__TypeAssignment_1_1_1 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==12) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_ID) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalBSharp.g:1335:2: ( '*' )
                    {
                    // InternalBSharp.g:1335:2: ( '*' )
                    // InternalBSharp.g:1336:3: '*'
                    {
                     before(grammarAccess.getFileImportAccess().getAsteriskKeyword_1_1_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getFileImportAccess().getAsteriskKeyword_1_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBSharp.g:1341:2: ( ( rule__FileImport__TypeAssignment_1_1_1 ) )
                    {
                    // InternalBSharp.g:1341:2: ( ( rule__FileImport__TypeAssignment_1_1_1 ) )
                    // InternalBSharp.g:1342:3: ( rule__FileImport__TypeAssignment_1_1_1 )
                    {
                     before(grammarAccess.getFileImportAccess().getTypeAssignment_1_1_1()); 
                    // InternalBSharp.g:1343:3: ( rule__FileImport__TypeAssignment_1_1_1 )
                    // InternalBSharp.g:1343:4: rule__FileImport__TypeAssignment_1_1_1
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


    // $ANTLR start "rule__ConstructedType__Alternatives_0"
    // InternalBSharp.g:1351:1: rule__ConstructedType__Alternatives_0 : ( ( ruleTypeConstructor ) | ( ruleTypeConstrBracket ) );
    public final void rule__ConstructedType__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1355:1: ( ( ruleTypeConstructor ) | ( ruleTypeConstrBracket ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                alt7=1;
            }
            else if ( (LA7_0==41) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalBSharp.g:1356:2: ( ruleTypeConstructor )
                    {
                    // InternalBSharp.g:1356:2: ( ruleTypeConstructor )
                    // InternalBSharp.g:1357:3: ruleTypeConstructor
                    {
                     before(grammarAccess.getConstructedTypeAccess().getTypeConstructorParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleTypeConstructor();

                    state._fsp--;

                     after(grammarAccess.getConstructedTypeAccess().getTypeConstructorParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBSharp.g:1362:2: ( ruleTypeConstrBracket )
                    {
                    // InternalBSharp.g:1362:2: ( ruleTypeConstrBracket )
                    // InternalBSharp.g:1363:3: ruleTypeConstrBracket
                    {
                     before(grammarAccess.getConstructedTypeAccess().getTypeConstrBracketParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleTypeConstrBracket();

                    state._fsp--;

                     after(grammarAccess.getConstructedTypeAccess().getTypeConstrBracketParserRuleCall_0_1()); 

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
    // $ANTLR end "rule__ConstructedType__Alternatives_0"


    // $ANTLR start "rule__ConstructedType__ConstructorAlternatives_1_1_0"
    // InternalBSharp.g:1372:1: rule__ConstructedType__ConstructorAlternatives_1_1_0 : ( ( '\\u00D7' ) | ( '\\u2192' ) | ( '\\uE102' ) | ( '\\uE100' ) | ( '\\u2194' ) | ( '\\u2916' ) | ( '\\u21F8' ) | ( '\\u21A3' ) | ( '\\u2900' ) | ( '\\u21A0' ) );
    public final void rule__ConstructedType__ConstructorAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1376:1: ( ( '\\u00D7' ) | ( '\\u2192' ) | ( '\\uE102' ) | ( '\\uE100' ) | ( '\\u2194' ) | ( '\\u2916' ) | ( '\\u21F8' ) | ( '\\u21A3' ) | ( '\\u2900' ) | ( '\\u21A0' ) )
            int alt8=10;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt8=1;
                }
                break;
            case 14:
                {
                alt8=2;
                }
                break;
            case 15:
                {
                alt8=3;
                }
                break;
            case 16:
                {
                alt8=4;
                }
                break;
            case 17:
                {
                alt8=5;
                }
                break;
            case 18:
                {
                alt8=6;
                }
                break;
            case 19:
                {
                alt8=7;
                }
                break;
            case 20:
                {
                alt8=8;
                }
                break;
            case 21:
                {
                alt8=9;
                }
                break;
            case 22:
                {
                alt8=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalBSharp.g:1377:2: ( '\\u00D7' )
                    {
                    // InternalBSharp.g:1377:2: ( '\\u00D7' )
                    // InternalBSharp.g:1378:3: '\\u00D7'
                    {
                     before(grammarAccess.getConstructedTypeAccess().getConstructorMultiplicationSignKeyword_1_1_0_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getConstructedTypeAccess().getConstructorMultiplicationSignKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBSharp.g:1383:2: ( '\\u2192' )
                    {
                    // InternalBSharp.g:1383:2: ( '\\u2192' )
                    // InternalBSharp.g:1384:3: '\\u2192'
                    {
                     before(grammarAccess.getConstructedTypeAccess().getConstructorRightwardsArrowKeyword_1_1_0_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getConstructedTypeAccess().getConstructorRightwardsArrowKeyword_1_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBSharp.g:1389:2: ( '\\uE102' )
                    {
                    // InternalBSharp.g:1389:2: ( '\\uE102' )
                    // InternalBSharp.g:1390:3: '\\uE102'
                    {
                     before(grammarAccess.getConstructedTypeAccess().getConstructorPrivateUseAreaE102Keyword_1_1_0_2()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getConstructedTypeAccess().getConstructorPrivateUseAreaE102Keyword_1_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalBSharp.g:1395:2: ( '\\uE100' )
                    {
                    // InternalBSharp.g:1395:2: ( '\\uE100' )
                    // InternalBSharp.g:1396:3: '\\uE100'
                    {
                     before(grammarAccess.getConstructedTypeAccess().getConstructorPrivateUseAreaE100Keyword_1_1_0_3()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getConstructedTypeAccess().getConstructorPrivateUseAreaE100Keyword_1_1_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalBSharp.g:1401:2: ( '\\u2194' )
                    {
                    // InternalBSharp.g:1401:2: ( '\\u2194' )
                    // InternalBSharp.g:1402:3: '\\u2194'
                    {
                     before(grammarAccess.getConstructedTypeAccess().getConstructorLeftRightArrowKeyword_1_1_0_4()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getConstructedTypeAccess().getConstructorLeftRightArrowKeyword_1_1_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalBSharp.g:1407:2: ( '\\u2916' )
                    {
                    // InternalBSharp.g:1407:2: ( '\\u2916' )
                    // InternalBSharp.g:1408:3: '\\u2916'
                    {
                     before(grammarAccess.getConstructedTypeAccess().getConstructorRightwardsTwoHeadedArrowWithTailKeyword_1_1_0_5()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getConstructedTypeAccess().getConstructorRightwardsTwoHeadedArrowWithTailKeyword_1_1_0_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalBSharp.g:1413:2: ( '\\u21F8' )
                    {
                    // InternalBSharp.g:1413:2: ( '\\u21F8' )
                    // InternalBSharp.g:1414:3: '\\u21F8'
                    {
                     before(grammarAccess.getConstructedTypeAccess().getConstructorRightwardsArrowWithVerticalStrokeKeyword_1_1_0_6()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getConstructedTypeAccess().getConstructorRightwardsArrowWithVerticalStrokeKeyword_1_1_0_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalBSharp.g:1419:2: ( '\\u21A3' )
                    {
                    // InternalBSharp.g:1419:2: ( '\\u21A3' )
                    // InternalBSharp.g:1420:3: '\\u21A3'
                    {
                     before(grammarAccess.getConstructedTypeAccess().getConstructorRightwardsArrowWithTailKeyword_1_1_0_7()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getConstructedTypeAccess().getConstructorRightwardsArrowWithTailKeyword_1_1_0_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalBSharp.g:1425:2: ( '\\u2900' )
                    {
                    // InternalBSharp.g:1425:2: ( '\\u2900' )
                    // InternalBSharp.g:1426:3: '\\u2900'
                    {
                     before(grammarAccess.getConstructedTypeAccess().getConstructorRightwardsTwoHeadedArrowWithVerticalStrokeKeyword_1_1_0_8()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getConstructedTypeAccess().getConstructorRightwardsTwoHeadedArrowWithVerticalStrokeKeyword_1_1_0_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalBSharp.g:1431:2: ( '\\u21A0' )
                    {
                    // InternalBSharp.g:1431:2: ( '\\u21A0' )
                    // InternalBSharp.g:1432:3: '\\u21A0'
                    {
                     before(grammarAccess.getConstructedTypeAccess().getConstructorRightwardsTwoHeadedArrowKeyword_1_1_0_9()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getConstructedTypeAccess().getConstructorRightwardsTwoHeadedArrowKeyword_1_1_0_9()); 

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
    // $ANTLR end "rule__ConstructedType__ConstructorAlternatives_1_1_0"


    // $ANTLR start "rule__ConstructedType__RightAlternatives_1_2_0"
    // InternalBSharp.g:1441:1: rule__ConstructedType__RightAlternatives_1_2_0 : ( ( ruleTypeConstructor ) | ( ruleTypeConstrBracket ) );
    public final void rule__ConstructedType__RightAlternatives_1_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1445:1: ( ( ruleTypeConstructor ) | ( ruleTypeConstrBracket ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                alt9=1;
            }
            else if ( (LA9_0==41) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalBSharp.g:1446:2: ( ruleTypeConstructor )
                    {
                    // InternalBSharp.g:1446:2: ( ruleTypeConstructor )
                    // InternalBSharp.g:1447:3: ruleTypeConstructor
                    {
                     before(grammarAccess.getConstructedTypeAccess().getRightTypeConstructorParserRuleCall_1_2_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleTypeConstructor();

                    state._fsp--;

                     after(grammarAccess.getConstructedTypeAccess().getRightTypeConstructorParserRuleCall_1_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBSharp.g:1452:2: ( ruleTypeConstrBracket )
                    {
                    // InternalBSharp.g:1452:2: ( ruleTypeConstrBracket )
                    // InternalBSharp.g:1453:3: ruleTypeConstrBracket
                    {
                     before(grammarAccess.getConstructedTypeAccess().getRightTypeConstrBracketParserRuleCall_1_2_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleTypeConstrBracket();

                    state._fsp--;

                     after(grammarAccess.getConstructedTypeAccess().getRightTypeConstrBracketParserRuleCall_1_2_0_1()); 

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
    // $ANTLR end "rule__ConstructedType__RightAlternatives_1_2_0"


    // $ANTLR start "rule__TypeBodyElements__Alternatives"
    // InternalBSharp.g:1462:1: rule__TypeBodyElements__Alternatives : ( ( ( rule__TypeBodyElements__FunctionsAssignment_0 ) ) | ( ( rule__TypeBodyElements__TheoremsAssignment_1 ) ) );
    public final void rule__TypeBodyElements__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1466:1: ( ( ( rule__TypeBodyElements__FunctionsAssignment_0 ) ) | ( ( rule__TypeBodyElements__TheoremsAssignment_1 ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                alt10=1;
            }
            else if ( (LA10_0==50) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalBSharp.g:1467:2: ( ( rule__TypeBodyElements__FunctionsAssignment_0 ) )
                    {
                    // InternalBSharp.g:1467:2: ( ( rule__TypeBodyElements__FunctionsAssignment_0 ) )
                    // InternalBSharp.g:1468:3: ( rule__TypeBodyElements__FunctionsAssignment_0 )
                    {
                     before(grammarAccess.getTypeBodyElementsAccess().getFunctionsAssignment_0()); 
                    // InternalBSharp.g:1469:3: ( rule__TypeBodyElements__FunctionsAssignment_0 )
                    // InternalBSharp.g:1469:4: rule__TypeBodyElements__FunctionsAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TypeBodyElements__FunctionsAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeBodyElementsAccess().getFunctionsAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBSharp.g:1473:2: ( ( rule__TypeBodyElements__TheoremsAssignment_1 ) )
                    {
                    // InternalBSharp.g:1473:2: ( ( rule__TypeBodyElements__TheoremsAssignment_1 ) )
                    // InternalBSharp.g:1474:3: ( rule__TypeBodyElements__TheoremsAssignment_1 )
                    {
                     before(grammarAccess.getTypeBodyElementsAccess().getTheoremsAssignment_1()); 
                    // InternalBSharp.g:1475:3: ( rule__TypeBodyElements__TheoremsAssignment_1 )
                    // InternalBSharp.g:1475:4: rule__TypeBodyElements__TheoremsAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__TypeBodyElements__TheoremsAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeBodyElementsAccess().getTheoremsAssignment_1()); 

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
    // $ANTLR end "rule__TypeBodyElements__Alternatives"


    // $ANTLR start "rule__Quantifier__QTypeAlternatives_0_0"
    // InternalBSharp.g:1483:1: rule__Quantifier__QTypeAlternatives_0_0 : ( ( '\\u2200' ) | ( '\\u2203' ) );
    public final void rule__Quantifier__QTypeAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1487:1: ( ( '\\u2200' ) | ( '\\u2203' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==23) ) {
                alt11=1;
            }
            else if ( (LA11_0==24) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalBSharp.g:1488:2: ( '\\u2200' )
                    {
                    // InternalBSharp.g:1488:2: ( '\\u2200' )
                    // InternalBSharp.g:1489:3: '\\u2200'
                    {
                     before(grammarAccess.getQuantifierAccess().getQTypeForAllKeyword_0_0_0()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getQuantifierAccess().getQTypeForAllKeyword_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBSharp.g:1494:2: ( '\\u2203' )
                    {
                    // InternalBSharp.g:1494:2: ( '\\u2203' )
                    // InternalBSharp.g:1495:3: '\\u2203'
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
    // InternalBSharp.g:1504:1: rule__RootExpression__Alternatives : ( ( ruleLambda ) | ( ruleQuantifier ) | ( ruleInfix ) | ( ruleMatchStatement ) );
    public final void rule__RootExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1508:1: ( ( ruleLambda ) | ( ruleQuantifier ) | ( ruleInfix ) | ( ruleMatchStatement ) )
            int alt12=4;
            switch ( input.LA(1) ) {
            case 54:
                {
                alt12=1;
                }
                break;
            case 23:
            case 24:
                {
                alt12=2;
                }
                break;
            case RULE_ID:
            case 11:
            case 41:
                {
                alt12=3;
                }
                break;
            case 49:
                {
                alt12=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalBSharp.g:1509:2: ( ruleLambda )
                    {
                    // InternalBSharp.g:1509:2: ( ruleLambda )
                    // InternalBSharp.g:1510:3: ruleLambda
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
                    // InternalBSharp.g:1515:2: ( ruleQuantifier )
                    {
                    // InternalBSharp.g:1515:2: ( ruleQuantifier )
                    // InternalBSharp.g:1516:3: ruleQuantifier
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
                    // InternalBSharp.g:1521:2: ( ruleInfix )
                    {
                    // InternalBSharp.g:1521:2: ( ruleInfix )
                    // InternalBSharp.g:1522:3: ruleInfix
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
                    // InternalBSharp.g:1527:2: ( ruleMatchStatement )
                    {
                    // InternalBSharp.g:1527:2: ( ruleMatchStatement )
                    // InternalBSharp.g:1528:3: ruleMatchStatement
                    {
                     before(grammarAccess.getRootExpressionAccess().getMatchStatementParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleMatchStatement();

                    state._fsp--;

                     after(grammarAccess.getRootExpressionAccess().getMatchStatementParserRuleCall_3()); 

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
    // InternalBSharp.g:1537:1: rule__Infix__Alternatives_1_1 : ( ( ( rule__Infix__FuncNameAssignment_1_1_0 ) ) | ( ( rule__Infix__OpNameAssignment_1_1_1 ) ) );
    public final void rule__Infix__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1541:1: ( ( ( rule__Infix__FuncNameAssignment_1_1_0 ) ) | ( ( rule__Infix__OpNameAssignment_1_1_1 ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                alt13=1;
            }
            else if ( ((LA13_0>=25 && LA13_0<=30)) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalBSharp.g:1542:2: ( ( rule__Infix__FuncNameAssignment_1_1_0 ) )
                    {
                    // InternalBSharp.g:1542:2: ( ( rule__Infix__FuncNameAssignment_1_1_0 ) )
                    // InternalBSharp.g:1543:3: ( rule__Infix__FuncNameAssignment_1_1_0 )
                    {
                     before(grammarAccess.getInfixAccess().getFuncNameAssignment_1_1_0()); 
                    // InternalBSharp.g:1544:3: ( rule__Infix__FuncNameAssignment_1_1_0 )
                    // InternalBSharp.g:1544:4: rule__Infix__FuncNameAssignment_1_1_0
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
                    // InternalBSharp.g:1548:2: ( ( rule__Infix__OpNameAssignment_1_1_1 ) )
                    {
                    // InternalBSharp.g:1548:2: ( ( rule__Infix__OpNameAssignment_1_1_1 ) )
                    // InternalBSharp.g:1549:3: ( rule__Infix__OpNameAssignment_1_1_1 )
                    {
                     before(grammarAccess.getInfixAccess().getOpNameAssignment_1_1_1()); 
                    // InternalBSharp.g:1550:3: ( rule__Infix__OpNameAssignment_1_1_1 )
                    // InternalBSharp.g:1550:4: rule__Infix__OpNameAssignment_1_1_1
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
    // InternalBSharp.g:1558:1: rule__Element__Alternatives : ( ( ruleBracket ) | ( rulePrefix ) | ( ruleFunctionCall ) );
    public final void rule__Element__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1562:1: ( ( ruleBracket ) | ( rulePrefix ) | ( ruleFunctionCall ) )
            int alt14=3;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt14=1;
                }
                break;
            case 11:
                {
                alt14=2;
                }
                break;
            case RULE_ID:
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
                    // InternalBSharp.g:1563:2: ( ruleBracket )
                    {
                    // InternalBSharp.g:1563:2: ( ruleBracket )
                    // InternalBSharp.g:1564:3: ruleBracket
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
                    // InternalBSharp.g:1569:2: ( rulePrefix )
                    {
                    // InternalBSharp.g:1569:2: ( rulePrefix )
                    // InternalBSharp.g:1570:3: rulePrefix
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
                    // InternalBSharp.g:1575:2: ( ruleFunctionCall )
                    {
                    // InternalBSharp.g:1575:2: ( ruleFunctionCall )
                    // InternalBSharp.g:1576:3: ruleFunctionCall
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


    // $ANTLR start "rule__FunctionCall__Alternatives_0"
    // InternalBSharp.g:1585:1: rule__FunctionCall__Alternatives_0 : ( ( ( rule__FunctionCall__TypeInstAssignment_0_0 ) ) | ( ( rule__FunctionCall__ClassVarDeclAssignment_0_1 ) ) );
    public final void rule__FunctionCall__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1589:1: ( ( ( rule__FunctionCall__TypeInstAssignment_0_0 ) ) | ( ( rule__FunctionCall__ClassVarDeclAssignment_0_1 ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID) ) {
                int LA15_1 = input.LA(2);

                if ( (LA15_1==EOF||LA15_1==RULE_ID||(LA15_1>=25 && LA15_1<=30)||LA15_1==37||(LA15_1>=40 && LA15_1<=42)||LA15_1==45||(LA15_1>=47 && LA15_1<=48)||LA15_1==50) ) {
                    alt15=1;
                }
                else if ( (LA15_1==33) ) {
                    alt15=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalBSharp.g:1590:2: ( ( rule__FunctionCall__TypeInstAssignment_0_0 ) )
                    {
                    // InternalBSharp.g:1590:2: ( ( rule__FunctionCall__TypeInstAssignment_0_0 ) )
                    // InternalBSharp.g:1591:3: ( rule__FunctionCall__TypeInstAssignment_0_0 )
                    {
                     before(grammarAccess.getFunctionCallAccess().getTypeInstAssignment_0_0()); 
                    // InternalBSharp.g:1592:3: ( rule__FunctionCall__TypeInstAssignment_0_0 )
                    // InternalBSharp.g:1592:4: rule__FunctionCall__TypeInstAssignment_0_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FunctionCall__TypeInstAssignment_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFunctionCallAccess().getTypeInstAssignment_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBSharp.g:1596:2: ( ( rule__FunctionCall__ClassVarDeclAssignment_0_1 ) )
                    {
                    // InternalBSharp.g:1596:2: ( ( rule__FunctionCall__ClassVarDeclAssignment_0_1 ) )
                    // InternalBSharp.g:1597:3: ( rule__FunctionCall__ClassVarDeclAssignment_0_1 )
                    {
                     before(grammarAccess.getFunctionCallAccess().getClassVarDeclAssignment_0_1()); 
                    // InternalBSharp.g:1598:3: ( rule__FunctionCall__ClassVarDeclAssignment_0_1 )
                    // InternalBSharp.g:1598:4: rule__FunctionCall__ClassVarDeclAssignment_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__FunctionCall__ClassVarDeclAssignment_0_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getFunctionCallAccess().getClassVarDeclAssignment_0_1()); 

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
    // $ANTLR end "rule__FunctionCall__Alternatives_0"


    // $ANTLR start "rule__InbuiltInfix__Alternatives"
    // InternalBSharp.g:1606:1: rule__InbuiltInfix__Alternatives : ( ( '\\u21D4' ) | ( '\\u21D2' ) | ( '=' ) | ( '\\u2260' ) | ( '\\u2227' ) | ( '\\u2228' ) );
    public final void rule__InbuiltInfix__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1610:1: ( ( '\\u21D4' ) | ( '\\u21D2' ) | ( '=' ) | ( '\\u2260' ) | ( '\\u2227' ) | ( '\\u2228' ) )
            int alt16=6;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt16=1;
                }
                break;
            case 26:
                {
                alt16=2;
                }
                break;
            case 27:
                {
                alt16=3;
                }
                break;
            case 28:
                {
                alt16=4;
                }
                break;
            case 29:
                {
                alt16=5;
                }
                break;
            case 30:
                {
                alt16=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalBSharp.g:1611:2: ( '\\u21D4' )
                    {
                    // InternalBSharp.g:1611:2: ( '\\u21D4' )
                    // InternalBSharp.g:1612:3: '\\u21D4'
                    {
                     before(grammarAccess.getInbuiltInfixAccess().getLeftRightDoubleArrowKeyword_0()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getInbuiltInfixAccess().getLeftRightDoubleArrowKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBSharp.g:1617:2: ( '\\u21D2' )
                    {
                    // InternalBSharp.g:1617:2: ( '\\u21D2' )
                    // InternalBSharp.g:1618:3: '\\u21D2'
                    {
                     before(grammarAccess.getInbuiltInfixAccess().getRightwardsDoubleArrowKeyword_1()); 
                    match(input,26,FOLLOW_2); 
                     after(grammarAccess.getInbuiltInfixAccess().getRightwardsDoubleArrowKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBSharp.g:1623:2: ( '=' )
                    {
                    // InternalBSharp.g:1623:2: ( '=' )
                    // InternalBSharp.g:1624:3: '='
                    {
                     before(grammarAccess.getInbuiltInfixAccess().getEqualsSignKeyword_2()); 
                    match(input,27,FOLLOW_2); 
                     after(grammarAccess.getInbuiltInfixAccess().getEqualsSignKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalBSharp.g:1629:2: ( '\\u2260' )
                    {
                    // InternalBSharp.g:1629:2: ( '\\u2260' )
                    // InternalBSharp.g:1630:3: '\\u2260'
                    {
                     before(grammarAccess.getInbuiltInfixAccess().getNotEqualToKeyword_3()); 
                    match(input,28,FOLLOW_2); 
                     after(grammarAccess.getInbuiltInfixAccess().getNotEqualToKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalBSharp.g:1635:2: ( '\\u2227' )
                    {
                    // InternalBSharp.g:1635:2: ( '\\u2227' )
                    // InternalBSharp.g:1636:3: '\\u2227'
                    {
                     before(grammarAccess.getInbuiltInfixAccess().getLogicalAndKeyword_4()); 
                    match(input,29,FOLLOW_2); 
                     after(grammarAccess.getInbuiltInfixAccess().getLogicalAndKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalBSharp.g:1641:2: ( '\\u2228' )
                    {
                    // InternalBSharp.g:1641:2: ( '\\u2228' )
                    // InternalBSharp.g:1642:3: '\\u2228'
                    {
                     before(grammarAccess.getInbuiltInfixAccess().getLogicalOrKeyword_5()); 
                    match(input,30,FOLLOW_2); 
                     after(grammarAccess.getInbuiltInfixAccess().getLogicalOrKeyword_5()); 

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


    // $ANTLR start "rule__TopLevel__Group__0"
    // InternalBSharp.g:1651:1: rule__TopLevel__Group__0 : rule__TopLevel__Group__0__Impl rule__TopLevel__Group__1 ;
    public final void rule__TopLevel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1655:1: ( rule__TopLevel__Group__0__Impl rule__TopLevel__Group__1 )
            // InternalBSharp.g:1656:2: rule__TopLevel__Group__0__Impl rule__TopLevel__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalBSharp.g:1663:1: rule__TopLevel__Group__0__Impl : ( 'package' ) ;
    public final void rule__TopLevel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1667:1: ( ( 'package' ) )
            // InternalBSharp.g:1668:1: ( 'package' )
            {
            // InternalBSharp.g:1668:1: ( 'package' )
            // InternalBSharp.g:1669:2: 'package'
            {
             before(grammarAccess.getTopLevelAccess().getPackageKeyword_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalBSharp.g:1678:1: rule__TopLevel__Group__1 : rule__TopLevel__Group__1__Impl rule__TopLevel__Group__2 ;
    public final void rule__TopLevel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1682:1: ( rule__TopLevel__Group__1__Impl rule__TopLevel__Group__2 )
            // InternalBSharp.g:1683:2: rule__TopLevel__Group__1__Impl rule__TopLevel__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalBSharp.g:1690:1: rule__TopLevel__Group__1__Impl : ( ( rule__TopLevel__NameAssignment_1 ) ) ;
    public final void rule__TopLevel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1694:1: ( ( ( rule__TopLevel__NameAssignment_1 ) ) )
            // InternalBSharp.g:1695:1: ( ( rule__TopLevel__NameAssignment_1 ) )
            {
            // InternalBSharp.g:1695:1: ( ( rule__TopLevel__NameAssignment_1 ) )
            // InternalBSharp.g:1696:2: ( rule__TopLevel__NameAssignment_1 )
            {
             before(grammarAccess.getTopLevelAccess().getNameAssignment_1()); 
            // InternalBSharp.g:1697:2: ( rule__TopLevel__NameAssignment_1 )
            // InternalBSharp.g:1697:3: rule__TopLevel__NameAssignment_1
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
    // InternalBSharp.g:1705:1: rule__TopLevel__Group__2 : rule__TopLevel__Group__2__Impl ;
    public final void rule__TopLevel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1709:1: ( rule__TopLevel__Group__2__Impl )
            // InternalBSharp.g:1710:2: rule__TopLevel__Group__2__Impl
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
    // InternalBSharp.g:1716:1: rule__TopLevel__Group__2__Impl : ( ( rule__TopLevel__TopLevelFileAssignment_2 ) ) ;
    public final void rule__TopLevel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1720:1: ( ( ( rule__TopLevel__TopLevelFileAssignment_2 ) ) )
            // InternalBSharp.g:1721:1: ( ( rule__TopLevel__TopLevelFileAssignment_2 ) )
            {
            // InternalBSharp.g:1721:1: ( ( rule__TopLevel__TopLevelFileAssignment_2 ) )
            // InternalBSharp.g:1722:2: ( rule__TopLevel__TopLevelFileAssignment_2 )
            {
             before(grammarAccess.getTopLevelAccess().getTopLevelFileAssignment_2()); 
            // InternalBSharp.g:1723:2: ( rule__TopLevel__TopLevelFileAssignment_2 )
            // InternalBSharp.g:1723:3: rule__TopLevel__TopLevelFileAssignment_2
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
    // InternalBSharp.g:1732:1: rule__THM_NAME__Group__0 : rule__THM_NAME__Group__0__Impl rule__THM_NAME__Group__1 ;
    public final void rule__THM_NAME__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1736:1: ( rule__THM_NAME__Group__0__Impl rule__THM_NAME__Group__1 )
            // InternalBSharp.g:1737:2: rule__THM_NAME__Group__0__Impl rule__THM_NAME__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalBSharp.g:1744:1: rule__THM_NAME__Group__0__Impl : ( ( rule__THM_NAME__Alternatives_0 )* ) ;
    public final void rule__THM_NAME__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1748:1: ( ( ( rule__THM_NAME__Alternatives_0 )* ) )
            // InternalBSharp.g:1749:1: ( ( rule__THM_NAME__Alternatives_0 )* )
            {
            // InternalBSharp.g:1749:1: ( ( rule__THM_NAME__Alternatives_0 )* )
            // InternalBSharp.g:1750:2: ( rule__THM_NAME__Alternatives_0 )*
            {
             before(grammarAccess.getTHM_NAMEAccess().getAlternatives_0()); 
            // InternalBSharp.g:1751:2: ( rule__THM_NAME__Alternatives_0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=RULE_INT && LA17_0<=RULE_WS)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalBSharp.g:1751:3: rule__THM_NAME__Alternatives_0
            	    {
            	    pushFollow(FOLLOW_7);
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
    // InternalBSharp.g:1759:1: rule__THM_NAME__Group__1 : rule__THM_NAME__Group__1__Impl ;
    public final void rule__THM_NAME__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1763:1: ( rule__THM_NAME__Group__1__Impl )
            // InternalBSharp.g:1764:2: rule__THM_NAME__Group__1__Impl
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
    // InternalBSharp.g:1770:1: rule__THM_NAME__Group__1__Impl : ( ':' ) ;
    public final void rule__THM_NAME__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1774:1: ( ( ':' ) )
            // InternalBSharp.g:1775:1: ( ':' )
            {
            // InternalBSharp.g:1775:1: ( ':' )
            // InternalBSharp.g:1776:2: ':'
            {
             before(grammarAccess.getTHM_NAMEAccess().getColonKeyword_1()); 
            match(input,32,FOLLOW_2); 
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
    // InternalBSharp.g:1786:1: rule__TopLevelFile__Group__0 : rule__TopLevelFile__Group__0__Impl rule__TopLevelFile__Group__1 ;
    public final void rule__TopLevelFile__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1790:1: ( rule__TopLevelFile__Group__0__Impl rule__TopLevelFile__Group__1 )
            // InternalBSharp.g:1791:2: rule__TopLevelFile__Group__0__Impl rule__TopLevelFile__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalBSharp.g:1798:1: rule__TopLevelFile__Group__0__Impl : ( () ) ;
    public final void rule__TopLevelFile__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1802:1: ( ( () ) )
            // InternalBSharp.g:1803:1: ( () )
            {
            // InternalBSharp.g:1803:1: ( () )
            // InternalBSharp.g:1804:2: ()
            {
             before(grammarAccess.getTopLevelFileAccess().getTopLevelFileAction_0()); 
            // InternalBSharp.g:1805:2: ()
            // InternalBSharp.g:1805:3: 
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
    // InternalBSharp.g:1813:1: rule__TopLevelFile__Group__1 : rule__TopLevelFile__Group__1__Impl rule__TopLevelFile__Group__2 ;
    public final void rule__TopLevelFile__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1817:1: ( rule__TopLevelFile__Group__1__Impl rule__TopLevelFile__Group__2 )
            // InternalBSharp.g:1818:2: rule__TopLevelFile__Group__1__Impl rule__TopLevelFile__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalBSharp.g:1825:1: rule__TopLevelFile__Group__1__Impl : ( ( rule__TopLevelFile__NoImportElementsAssignment_1 )? ) ;
    public final void rule__TopLevelFile__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1829:1: ( ( ( rule__TopLevelFile__NoImportElementsAssignment_1 )? ) )
            // InternalBSharp.g:1830:1: ( ( rule__TopLevelFile__NoImportElementsAssignment_1 )? )
            {
            // InternalBSharp.g:1830:1: ( ( rule__TopLevelFile__NoImportElementsAssignment_1 )? )
            // InternalBSharp.g:1831:2: ( rule__TopLevelFile__NoImportElementsAssignment_1 )?
            {
             before(grammarAccess.getTopLevelFileAccess().getNoImportElementsAssignment_1()); 
            // InternalBSharp.g:1832:2: ( rule__TopLevelFile__NoImportElementsAssignment_1 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==36||LA18_0==44||LA18_0==46||LA18_0==52) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalBSharp.g:1832:3: rule__TopLevelFile__NoImportElementsAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__TopLevelFile__NoImportElementsAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

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
    // InternalBSharp.g:1840:1: rule__TopLevelFile__Group__2 : rule__TopLevelFile__Group__2__Impl ;
    public final void rule__TopLevelFile__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1844:1: ( rule__TopLevelFile__Group__2__Impl )
            // InternalBSharp.g:1845:2: rule__TopLevelFile__Group__2__Impl
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
    // InternalBSharp.g:1851:1: rule__TopLevelFile__Group__2__Impl : ( ( rule__TopLevelFile__TopLevelImportsAssignment_2 )* ) ;
    public final void rule__TopLevelFile__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1855:1: ( ( ( rule__TopLevelFile__TopLevelImportsAssignment_2 )* ) )
            // InternalBSharp.g:1856:1: ( ( rule__TopLevelFile__TopLevelImportsAssignment_2 )* )
            {
            // InternalBSharp.g:1856:1: ( ( rule__TopLevelFile__TopLevelImportsAssignment_2 )* )
            // InternalBSharp.g:1857:2: ( rule__TopLevelFile__TopLevelImportsAssignment_2 )*
            {
             before(grammarAccess.getTopLevelFileAccess().getTopLevelImportsAssignment_2()); 
            // InternalBSharp.g:1858:2: ( rule__TopLevelFile__TopLevelImportsAssignment_2 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=34 && LA19_0<=35)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalBSharp.g:1858:3: rule__TopLevelFile__TopLevelImportsAssignment_2
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
    // InternalBSharp.g:1867:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1871:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalBSharp.g:1872:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
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
    // InternalBSharp.g:1879:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1883:1: ( ( RULE_ID ) )
            // InternalBSharp.g:1884:1: ( RULE_ID )
            {
            // InternalBSharp.g:1884:1: ( RULE_ID )
            // InternalBSharp.g:1885:2: RULE_ID
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
    // InternalBSharp.g:1894:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1898:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalBSharp.g:1899:2: rule__QualifiedName__Group__1__Impl
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
    // InternalBSharp.g:1905:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1909:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalBSharp.g:1910:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalBSharp.g:1910:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalBSharp.g:1911:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalBSharp.g:1912:2: ( rule__QualifiedName__Group_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==33) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalBSharp.g:1912:3: rule__QualifiedName__Group_1__0
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
    // InternalBSharp.g:1921:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1925:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalBSharp.g:1926:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalBSharp.g:1933:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1937:1: ( ( '.' ) )
            // InternalBSharp.g:1938:1: ( '.' )
            {
            // InternalBSharp.g:1938:1: ( '.' )
            // InternalBSharp.g:1939:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalBSharp.g:1948:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1952:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalBSharp.g:1953:2: rule__QualifiedName__Group_1__1__Impl
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
    // InternalBSharp.g:1959:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1963:1: ( ( RULE_ID ) )
            // InternalBSharp.g:1964:1: ( RULE_ID )
            {
            // InternalBSharp.g:1964:1: ( RULE_ID )
            // InternalBSharp.g:1965:2: RULE_ID
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
    // InternalBSharp.g:1975:1: rule__TopLevelImport__Group__0 : rule__TopLevelImport__Group__0__Impl rule__TopLevelImport__Group__1 ;
    public final void rule__TopLevelImport__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1979:1: ( rule__TopLevelImport__Group__0__Impl rule__TopLevelImport__Group__1 )
            // InternalBSharp.g:1980:2: rule__TopLevelImport__Group__0__Impl rule__TopLevelImport__Group__1
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
    // InternalBSharp.g:1987:1: rule__TopLevelImport__Group__0__Impl : ( ( ( rule__TopLevelImport__Alternatives_0 ) ) ( ( rule__TopLevelImport__Alternatives_0 )* ) ) ;
    public final void rule__TopLevelImport__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1991:1: ( ( ( ( rule__TopLevelImport__Alternatives_0 ) ) ( ( rule__TopLevelImport__Alternatives_0 )* ) ) )
            // InternalBSharp.g:1992:1: ( ( ( rule__TopLevelImport__Alternatives_0 ) ) ( ( rule__TopLevelImport__Alternatives_0 )* ) )
            {
            // InternalBSharp.g:1992:1: ( ( ( rule__TopLevelImport__Alternatives_0 ) ) ( ( rule__TopLevelImport__Alternatives_0 )* ) )
            // InternalBSharp.g:1993:2: ( ( rule__TopLevelImport__Alternatives_0 ) ) ( ( rule__TopLevelImport__Alternatives_0 )* )
            {
            // InternalBSharp.g:1993:2: ( ( rule__TopLevelImport__Alternatives_0 ) )
            // InternalBSharp.g:1994:3: ( rule__TopLevelImport__Alternatives_0 )
            {
             before(grammarAccess.getTopLevelImportAccess().getAlternatives_0()); 
            // InternalBSharp.g:1995:3: ( rule__TopLevelImport__Alternatives_0 )
            // InternalBSharp.g:1995:4: rule__TopLevelImport__Alternatives_0
            {
            pushFollow(FOLLOW_8);
            rule__TopLevelImport__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getTopLevelImportAccess().getAlternatives_0()); 

            }

            // InternalBSharp.g:1998:2: ( ( rule__TopLevelImport__Alternatives_0 )* )
            // InternalBSharp.g:1999:3: ( rule__TopLevelImport__Alternatives_0 )*
            {
             before(grammarAccess.getTopLevelImportAccess().getAlternatives_0()); 
            // InternalBSharp.g:2000:3: ( rule__TopLevelImport__Alternatives_0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=34 && LA21_0<=35)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalBSharp.g:2000:4: rule__TopLevelImport__Alternatives_0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__TopLevelImport__Alternatives_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getTopLevelImportAccess().getAlternatives_0()); 

            }


            }


            }

        }
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
    // InternalBSharp.g:2009:1: rule__TopLevelImport__Group__1 : rule__TopLevelImport__Group__1__Impl ;
    public final void rule__TopLevelImport__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2013:1: ( rule__TopLevelImport__Group__1__Impl )
            // InternalBSharp.g:2014:2: rule__TopLevelImport__Group__1__Impl
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
    // InternalBSharp.g:2020:1: rule__TopLevelImport__Group__1__Impl : ( ( rule__TopLevelImport__BodyElementsAssignment_1 ) ) ;
    public final void rule__TopLevelImport__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2024:1: ( ( ( rule__TopLevelImport__BodyElementsAssignment_1 ) ) )
            // InternalBSharp.g:2025:1: ( ( rule__TopLevelImport__BodyElementsAssignment_1 ) )
            {
            // InternalBSharp.g:2025:1: ( ( rule__TopLevelImport__BodyElementsAssignment_1 ) )
            // InternalBSharp.g:2026:2: ( rule__TopLevelImport__BodyElementsAssignment_1 )
            {
             before(grammarAccess.getTopLevelImportAccess().getBodyElementsAssignment_1()); 
            // InternalBSharp.g:2027:2: ( rule__TopLevelImport__BodyElementsAssignment_1 )
            // InternalBSharp.g:2027:3: rule__TopLevelImport__BodyElementsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TopLevelImport__BodyElementsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTopLevelImportAccess().getBodyElementsAssignment_1()); 

            }


            }

        }
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
    // InternalBSharp.g:2036:1: rule__GlobalImport__Group__0 : rule__GlobalImport__Group__0__Impl rule__GlobalImport__Group__1 ;
    public final void rule__GlobalImport__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2040:1: ( rule__GlobalImport__Group__0__Impl rule__GlobalImport__Group__1 )
            // InternalBSharp.g:2041:2: rule__GlobalImport__Group__0__Impl rule__GlobalImport__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalBSharp.g:2048:1: rule__GlobalImport__Group__0__Impl : ( 'From' ) ;
    public final void rule__GlobalImport__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2052:1: ( ( 'From' ) )
            // InternalBSharp.g:2053:1: ( 'From' )
            {
            // InternalBSharp.g:2053:1: ( 'From' )
            // InternalBSharp.g:2054:2: 'From'
            {
             before(grammarAccess.getGlobalImportAccess().getFromKeyword_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalBSharp.g:2063:1: rule__GlobalImport__Group__1 : rule__GlobalImport__Group__1__Impl rule__GlobalImport__Group__2 ;
    public final void rule__GlobalImport__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2067:1: ( rule__GlobalImport__Group__1__Impl rule__GlobalImport__Group__2 )
            // InternalBSharp.g:2068:2: rule__GlobalImport__Group__1__Impl rule__GlobalImport__Group__2
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
    // InternalBSharp.g:2075:1: rule__GlobalImport__Group__1__Impl : ( ( rule__GlobalImport__ProjectAssignment_1 ) ) ;
    public final void rule__GlobalImport__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2079:1: ( ( ( rule__GlobalImport__ProjectAssignment_1 ) ) )
            // InternalBSharp.g:2080:1: ( ( rule__GlobalImport__ProjectAssignment_1 ) )
            {
            // InternalBSharp.g:2080:1: ( ( rule__GlobalImport__ProjectAssignment_1 ) )
            // InternalBSharp.g:2081:2: ( rule__GlobalImport__ProjectAssignment_1 )
            {
             before(grammarAccess.getGlobalImportAccess().getProjectAssignment_1()); 
            // InternalBSharp.g:2082:2: ( rule__GlobalImport__ProjectAssignment_1 )
            // InternalBSharp.g:2082:3: rule__GlobalImport__ProjectAssignment_1
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
    // InternalBSharp.g:2090:1: rule__GlobalImport__Group__2 : rule__GlobalImport__Group__2__Impl rule__GlobalImport__Group__3 ;
    public final void rule__GlobalImport__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2094:1: ( rule__GlobalImport__Group__2__Impl rule__GlobalImport__Group__3 )
            // InternalBSharp.g:2095:2: rule__GlobalImport__Group__2__Impl rule__GlobalImport__Group__3
            {
            pushFollow(FOLLOW_4);
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
    // InternalBSharp.g:2102:1: rule__GlobalImport__Group__2__Impl : ( 'Import' ) ;
    public final void rule__GlobalImport__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2106:1: ( ( 'Import' ) )
            // InternalBSharp.g:2107:1: ( 'Import' )
            {
            // InternalBSharp.g:2107:1: ( 'Import' )
            // InternalBSharp.g:2108:2: 'Import'
            {
             before(grammarAccess.getGlobalImportAccess().getImportKeyword_2()); 
            match(input,35,FOLLOW_2); 
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
    // InternalBSharp.g:2117:1: rule__GlobalImport__Group__3 : rule__GlobalImport__Group__3__Impl ;
    public final void rule__GlobalImport__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2121:1: ( rule__GlobalImport__Group__3__Impl )
            // InternalBSharp.g:2122:2: rule__GlobalImport__Group__3__Impl
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
    // InternalBSharp.g:2128:1: rule__GlobalImport__Group__3__Impl : ( ( ( rule__GlobalImport__FileImportsAssignment_3 ) ) ( ( rule__GlobalImport__FileImportsAssignment_3 )* ) ) ;
    public final void rule__GlobalImport__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2132:1: ( ( ( ( rule__GlobalImport__FileImportsAssignment_3 ) ) ( ( rule__GlobalImport__FileImportsAssignment_3 )* ) ) )
            // InternalBSharp.g:2133:1: ( ( ( rule__GlobalImport__FileImportsAssignment_3 ) ) ( ( rule__GlobalImport__FileImportsAssignment_3 )* ) )
            {
            // InternalBSharp.g:2133:1: ( ( ( rule__GlobalImport__FileImportsAssignment_3 ) ) ( ( rule__GlobalImport__FileImportsAssignment_3 )* ) )
            // InternalBSharp.g:2134:2: ( ( rule__GlobalImport__FileImportsAssignment_3 ) ) ( ( rule__GlobalImport__FileImportsAssignment_3 )* )
            {
            // InternalBSharp.g:2134:2: ( ( rule__GlobalImport__FileImportsAssignment_3 ) )
            // InternalBSharp.g:2135:3: ( rule__GlobalImport__FileImportsAssignment_3 )
            {
             before(grammarAccess.getGlobalImportAccess().getFileImportsAssignment_3()); 
            // InternalBSharp.g:2136:3: ( rule__GlobalImport__FileImportsAssignment_3 )
            // InternalBSharp.g:2136:4: rule__GlobalImport__FileImportsAssignment_3
            {
            pushFollow(FOLLOW_13);
            rule__GlobalImport__FileImportsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getGlobalImportAccess().getFileImportsAssignment_3()); 

            }

            // InternalBSharp.g:2139:2: ( ( rule__GlobalImport__FileImportsAssignment_3 )* )
            // InternalBSharp.g:2140:3: ( rule__GlobalImport__FileImportsAssignment_3 )*
            {
             before(grammarAccess.getGlobalImportAccess().getFileImportsAssignment_3()); 
            // InternalBSharp.g:2141:3: ( rule__GlobalImport__FileImportsAssignment_3 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_ID) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalBSharp.g:2141:4: rule__GlobalImport__FileImportsAssignment_3
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__GlobalImport__FileImportsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // InternalBSharp.g:2151:1: rule__FileImport__Group__0 : rule__FileImport__Group__0__Impl rule__FileImport__Group__1 ;
    public final void rule__FileImport__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2155:1: ( rule__FileImport__Group__0__Impl rule__FileImport__Group__1 )
            // InternalBSharp.g:2156:2: rule__FileImport__Group__0__Impl rule__FileImport__Group__1
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
    // InternalBSharp.g:2163:1: rule__FileImport__Group__0__Impl : ( ( rule__FileImport__FileNameAssignment_0 ) ) ;
    public final void rule__FileImport__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2167:1: ( ( ( rule__FileImport__FileNameAssignment_0 ) ) )
            // InternalBSharp.g:2168:1: ( ( rule__FileImport__FileNameAssignment_0 ) )
            {
            // InternalBSharp.g:2168:1: ( ( rule__FileImport__FileNameAssignment_0 ) )
            // InternalBSharp.g:2169:2: ( rule__FileImport__FileNameAssignment_0 )
            {
             before(grammarAccess.getFileImportAccess().getFileNameAssignment_0()); 
            // InternalBSharp.g:2170:2: ( rule__FileImport__FileNameAssignment_0 )
            // InternalBSharp.g:2170:3: rule__FileImport__FileNameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__FileImport__FileNameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFileImportAccess().getFileNameAssignment_0()); 

            }


            }

        }
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
    // InternalBSharp.g:2178:1: rule__FileImport__Group__1 : rule__FileImport__Group__1__Impl ;
    public final void rule__FileImport__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2182:1: ( rule__FileImport__Group__1__Impl )
            // InternalBSharp.g:2183:2: rule__FileImport__Group__1__Impl
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
    // InternalBSharp.g:2189:1: rule__FileImport__Group__1__Impl : ( ( rule__FileImport__Group_1__0 )? ) ;
    public final void rule__FileImport__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2193:1: ( ( ( rule__FileImport__Group_1__0 )? ) )
            // InternalBSharp.g:2194:1: ( ( rule__FileImport__Group_1__0 )? )
            {
            // InternalBSharp.g:2194:1: ( ( rule__FileImport__Group_1__0 )? )
            // InternalBSharp.g:2195:2: ( rule__FileImport__Group_1__0 )?
            {
             before(grammarAccess.getFileImportAccess().getGroup_1()); 
            // InternalBSharp.g:2196:2: ( rule__FileImport__Group_1__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==33) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalBSharp.g:2196:3: rule__FileImport__Group_1__0
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
    // InternalBSharp.g:2205:1: rule__FileImport__Group_1__0 : rule__FileImport__Group_1__0__Impl rule__FileImport__Group_1__1 ;
    public final void rule__FileImport__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2209:1: ( rule__FileImport__Group_1__0__Impl rule__FileImport__Group_1__1 )
            // InternalBSharp.g:2210:2: rule__FileImport__Group_1__0__Impl rule__FileImport__Group_1__1
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
    // InternalBSharp.g:2217:1: rule__FileImport__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FileImport__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2221:1: ( ( '.' ) )
            // InternalBSharp.g:2222:1: ( '.' )
            {
            // InternalBSharp.g:2222:1: ( '.' )
            // InternalBSharp.g:2223:2: '.'
            {
             before(grammarAccess.getFileImportAccess().getFullStopKeyword_1_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalBSharp.g:2232:1: rule__FileImport__Group_1__1 : rule__FileImport__Group_1__1__Impl ;
    public final void rule__FileImport__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2236:1: ( rule__FileImport__Group_1__1__Impl )
            // InternalBSharp.g:2237:2: rule__FileImport__Group_1__1__Impl
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
    // InternalBSharp.g:2243:1: rule__FileImport__Group_1__1__Impl : ( ( rule__FileImport__Alternatives_1_1 ) ) ;
    public final void rule__FileImport__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2247:1: ( ( ( rule__FileImport__Alternatives_1_1 ) ) )
            // InternalBSharp.g:2248:1: ( ( rule__FileImport__Alternatives_1_1 ) )
            {
            // InternalBSharp.g:2248:1: ( ( rule__FileImport__Alternatives_1_1 ) )
            // InternalBSharp.g:2249:2: ( rule__FileImport__Alternatives_1_1 )
            {
             before(grammarAccess.getFileImportAccess().getAlternatives_1_1()); 
            // InternalBSharp.g:2250:2: ( rule__FileImport__Alternatives_1_1 )
            // InternalBSharp.g:2250:3: rule__FileImport__Alternatives_1_1
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
    // InternalBSharp.g:2259:1: rule__LocalImport__Group__0 : rule__LocalImport__Group__0__Impl rule__LocalImport__Group__1 ;
    public final void rule__LocalImport__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2263:1: ( rule__LocalImport__Group__0__Impl rule__LocalImport__Group__1 )
            // InternalBSharp.g:2264:2: rule__LocalImport__Group__0__Impl rule__LocalImport__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalBSharp.g:2271:1: rule__LocalImport__Group__0__Impl : ( 'Import' ) ;
    public final void rule__LocalImport__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2275:1: ( ( 'Import' ) )
            // InternalBSharp.g:2276:1: ( 'Import' )
            {
            // InternalBSharp.g:2276:1: ( 'Import' )
            // InternalBSharp.g:2277:2: 'Import'
            {
             before(grammarAccess.getLocalImportAccess().getImportKeyword_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalBSharp.g:2286:1: rule__LocalImport__Group__1 : rule__LocalImport__Group__1__Impl ;
    public final void rule__LocalImport__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2290:1: ( rule__LocalImport__Group__1__Impl )
            // InternalBSharp.g:2291:2: rule__LocalImport__Group__1__Impl
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
    // InternalBSharp.g:2297:1: rule__LocalImport__Group__1__Impl : ( ( ( rule__LocalImport__FileImportsAssignment_1 ) ) ( ( rule__LocalImport__FileImportsAssignment_1 )* ) ) ;
    public final void rule__LocalImport__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2301:1: ( ( ( ( rule__LocalImport__FileImportsAssignment_1 ) ) ( ( rule__LocalImport__FileImportsAssignment_1 )* ) ) )
            // InternalBSharp.g:2302:1: ( ( ( rule__LocalImport__FileImportsAssignment_1 ) ) ( ( rule__LocalImport__FileImportsAssignment_1 )* ) )
            {
            // InternalBSharp.g:2302:1: ( ( ( rule__LocalImport__FileImportsAssignment_1 ) ) ( ( rule__LocalImport__FileImportsAssignment_1 )* ) )
            // InternalBSharp.g:2303:2: ( ( rule__LocalImport__FileImportsAssignment_1 ) ) ( ( rule__LocalImport__FileImportsAssignment_1 )* )
            {
            // InternalBSharp.g:2303:2: ( ( rule__LocalImport__FileImportsAssignment_1 ) )
            // InternalBSharp.g:2304:3: ( rule__LocalImport__FileImportsAssignment_1 )
            {
             before(grammarAccess.getLocalImportAccess().getFileImportsAssignment_1()); 
            // InternalBSharp.g:2305:3: ( rule__LocalImport__FileImportsAssignment_1 )
            // InternalBSharp.g:2305:4: rule__LocalImport__FileImportsAssignment_1
            {
            pushFollow(FOLLOW_13);
            rule__LocalImport__FileImportsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLocalImportAccess().getFileImportsAssignment_1()); 

            }

            // InternalBSharp.g:2308:2: ( ( rule__LocalImport__FileImportsAssignment_1 )* )
            // InternalBSharp.g:2309:3: ( rule__LocalImport__FileImportsAssignment_1 )*
            {
             before(grammarAccess.getLocalImportAccess().getFileImportsAssignment_1()); 
            // InternalBSharp.g:2310:3: ( rule__LocalImport__FileImportsAssignment_1 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_ID) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalBSharp.g:2310:4: rule__LocalImport__FileImportsAssignment_1
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__LocalImport__FileImportsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // InternalBSharp.g:2320:1: rule__Class__Group__0 : rule__Class__Group__0__Impl rule__Class__Group__1 ;
    public final void rule__Class__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2324:1: ( rule__Class__Group__0__Impl rule__Class__Group__1 )
            // InternalBSharp.g:2325:2: rule__Class__Group__0__Impl rule__Class__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalBSharp.g:2332:1: rule__Class__Group__0__Impl : ( 'Class' ) ;
    public final void rule__Class__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2336:1: ( ( 'Class' ) )
            // InternalBSharp.g:2337:1: ( 'Class' )
            {
            // InternalBSharp.g:2337:1: ( 'Class' )
            // InternalBSharp.g:2338:2: 'Class'
            {
             before(grammarAccess.getClassAccess().getClassKeyword_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalBSharp.g:2347:1: rule__Class__Group__1 : rule__Class__Group__1__Impl rule__Class__Group__2 ;
    public final void rule__Class__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2351:1: ( rule__Class__Group__1__Impl rule__Class__Group__2 )
            // InternalBSharp.g:2352:2: rule__Class__Group__1__Impl rule__Class__Group__2
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
    // InternalBSharp.g:2359:1: rule__Class__Group__1__Impl : ( ( rule__Class__NameAssignment_1 ) ) ;
    public final void rule__Class__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2363:1: ( ( ( rule__Class__NameAssignment_1 ) ) )
            // InternalBSharp.g:2364:1: ( ( rule__Class__NameAssignment_1 ) )
            {
            // InternalBSharp.g:2364:1: ( ( rule__Class__NameAssignment_1 ) )
            // InternalBSharp.g:2365:2: ( rule__Class__NameAssignment_1 )
            {
             before(grammarAccess.getClassAccess().getNameAssignment_1()); 
            // InternalBSharp.g:2366:2: ( rule__Class__NameAssignment_1 )
            // InternalBSharp.g:2366:3: rule__Class__NameAssignment_1
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
    // InternalBSharp.g:2374:1: rule__Class__Group__2 : rule__Class__Group__2__Impl rule__Class__Group__3 ;
    public final void rule__Class__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2378:1: ( rule__Class__Group__2__Impl rule__Class__Group__3 )
            // InternalBSharp.g:2379:2: rule__Class__Group__2__Impl rule__Class__Group__3
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
    // InternalBSharp.g:2386:1: rule__Class__Group__2__Impl : ( ( rule__Class__ContextAssignment_2 )? ) ;
    public final void rule__Class__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2390:1: ( ( ( rule__Class__ContextAssignment_2 )? ) )
            // InternalBSharp.g:2391:1: ( ( rule__Class__ContextAssignment_2 )? )
            {
            // InternalBSharp.g:2391:1: ( ( rule__Class__ContextAssignment_2 )? )
            // InternalBSharp.g:2392:2: ( rule__Class__ContextAssignment_2 )?
            {
             before(grammarAccess.getClassAccess().getContextAssignment_2()); 
            // InternalBSharp.g:2393:2: ( rule__Class__ContextAssignment_2 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==38) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalBSharp.g:2393:3: rule__Class__ContextAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Class__ContextAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClassAccess().getContextAssignment_2()); 

            }


            }

        }
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
    // InternalBSharp.g:2401:1: rule__Class__Group__3 : rule__Class__Group__3__Impl rule__Class__Group__4 ;
    public final void rule__Class__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2405:1: ( rule__Class__Group__3__Impl rule__Class__Group__4 )
            // InternalBSharp.g:2406:2: rule__Class__Group__3__Impl rule__Class__Group__4
            {
            pushFollow(FOLLOW_15);
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
    // InternalBSharp.g:2413:1: rule__Class__Group__3__Impl : ( ( rule__Class__SupertypesAssignment_3 )? ) ;
    public final void rule__Class__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2417:1: ( ( ( rule__Class__SupertypesAssignment_3 )? ) )
            // InternalBSharp.g:2418:1: ( ( rule__Class__SupertypesAssignment_3 )? )
            {
            // InternalBSharp.g:2418:1: ( ( rule__Class__SupertypesAssignment_3 )? )
            // InternalBSharp.g:2419:2: ( rule__Class__SupertypesAssignment_3 )?
            {
             before(grammarAccess.getClassAccess().getSupertypesAssignment_3()); 
            // InternalBSharp.g:2420:2: ( rule__Class__SupertypesAssignment_3 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==32) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalBSharp.g:2420:3: rule__Class__SupertypesAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Class__SupertypesAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClassAccess().getSupertypesAssignment_3()); 

            }


            }

        }
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
    // InternalBSharp.g:2428:1: rule__Class__Group__4 : rule__Class__Group__4__Impl rule__Class__Group__5 ;
    public final void rule__Class__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2432:1: ( rule__Class__Group__4__Impl rule__Class__Group__5 )
            // InternalBSharp.g:2433:2: rule__Class__Group__4__Impl rule__Class__Group__5
            {
            pushFollow(FOLLOW_15);
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
    // InternalBSharp.g:2440:1: rule__Class__Group__4__Impl : ( ( rule__Class__VarListAssignment_4 )? ) ;
    public final void rule__Class__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2444:1: ( ( ( rule__Class__VarListAssignment_4 )? ) )
            // InternalBSharp.g:2445:1: ( ( rule__Class__VarListAssignment_4 )? )
            {
            // InternalBSharp.g:2445:1: ( ( rule__Class__VarListAssignment_4 )? )
            // InternalBSharp.g:2446:2: ( rule__Class__VarListAssignment_4 )?
            {
             before(grammarAccess.getClassAccess().getVarListAssignment_4()); 
            // InternalBSharp.g:2447:2: ( rule__Class__VarListAssignment_4 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==41) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalBSharp.g:2447:3: rule__Class__VarListAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Class__VarListAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClassAccess().getVarListAssignment_4()); 

            }


            }

        }
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
    // InternalBSharp.g:2455:1: rule__Class__Group__5 : rule__Class__Group__5__Impl rule__Class__Group__6 ;
    public final void rule__Class__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2459:1: ( rule__Class__Group__5__Impl rule__Class__Group__6 )
            // InternalBSharp.g:2460:2: rule__Class__Group__5__Impl rule__Class__Group__6
            {
            pushFollow(FOLLOW_15);
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
    // InternalBSharp.g:2467:1: rule__Class__Group__5__Impl : ( ( rule__Class__WhereAssignment_5 )? ) ;
    public final void rule__Class__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2471:1: ( ( ( rule__Class__WhereAssignment_5 )? ) )
            // InternalBSharp.g:2472:1: ( ( rule__Class__WhereAssignment_5 )? )
            {
            // InternalBSharp.g:2472:1: ( ( rule__Class__WhereAssignment_5 )? )
            // InternalBSharp.g:2473:2: ( rule__Class__WhereAssignment_5 )?
            {
             before(grammarAccess.getClassAccess().getWhereAssignment_5()); 
            // InternalBSharp.g:2474:2: ( rule__Class__WhereAssignment_5 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==43) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalBSharp.g:2474:3: rule__Class__WhereAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__Class__WhereAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClassAccess().getWhereAssignment_5()); 

            }


            }

        }
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
    // InternalBSharp.g:2482:1: rule__Class__Group__6 : rule__Class__Group__6__Impl rule__Class__Group__7 ;
    public final void rule__Class__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2486:1: ( rule__Class__Group__6__Impl rule__Class__Group__7 )
            // InternalBSharp.g:2487:2: rule__Class__Group__6__Impl rule__Class__Group__7
            {
            pushFollow(FOLLOW_15);
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
    // InternalBSharp.g:2494:1: rule__Class__Group__6__Impl : ( ( ';' )? ) ;
    public final void rule__Class__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2498:1: ( ( ( ';' )? ) )
            // InternalBSharp.g:2499:1: ( ( ';' )? )
            {
            // InternalBSharp.g:2499:1: ( ( ';' )? )
            // InternalBSharp.g:2500:2: ( ';' )?
            {
             before(grammarAccess.getClassAccess().getSemicolonKeyword_6()); 
            // InternalBSharp.g:2501:2: ( ';' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==37) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalBSharp.g:2501:3: ';'
                    {
                    match(input,37,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getClassAccess().getSemicolonKeyword_6()); 

            }


            }

        }
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
    // InternalBSharp.g:2509:1: rule__Class__Group__7 : rule__Class__Group__7__Impl ;
    public final void rule__Class__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2513:1: ( rule__Class__Group__7__Impl )
            // InternalBSharp.g:2514:2: rule__Class__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group__7__Impl();

            state._fsp--;


            }

        }
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
    // InternalBSharp.g:2520:1: rule__Class__Group__7__Impl : ( ( rule__Class__BlockAssignment_7 ) ) ;
    public final void rule__Class__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2524:1: ( ( ( rule__Class__BlockAssignment_7 ) ) )
            // InternalBSharp.g:2525:1: ( ( rule__Class__BlockAssignment_7 ) )
            {
            // InternalBSharp.g:2525:1: ( ( rule__Class__BlockAssignment_7 ) )
            // InternalBSharp.g:2526:2: ( rule__Class__BlockAssignment_7 )
            {
             before(grammarAccess.getClassAccess().getBlockAssignment_7()); 
            // InternalBSharp.g:2527:2: ( rule__Class__BlockAssignment_7 )
            // InternalBSharp.g:2527:3: rule__Class__BlockAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Class__BlockAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getBlockAssignment_7()); 

            }


            }

        }
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


    // $ANTLR start "rule__PolyContext__Group__0"
    // InternalBSharp.g:2536:1: rule__PolyContext__Group__0 : rule__PolyContext__Group__0__Impl rule__PolyContext__Group__1 ;
    public final void rule__PolyContext__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2540:1: ( rule__PolyContext__Group__0__Impl rule__PolyContext__Group__1 )
            // InternalBSharp.g:2541:2: rule__PolyContext__Group__0__Impl rule__PolyContext__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalBSharp.g:2548:1: rule__PolyContext__Group__0__Impl : ( '<' ) ;
    public final void rule__PolyContext__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2552:1: ( ( '<' ) )
            // InternalBSharp.g:2553:1: ( '<' )
            {
            // InternalBSharp.g:2553:1: ( '<' )
            // InternalBSharp.g:2554:2: '<'
            {
             before(grammarAccess.getPolyContextAccess().getLessThanSignKeyword_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalBSharp.g:2563:1: rule__PolyContext__Group__1 : rule__PolyContext__Group__1__Impl rule__PolyContext__Group__2 ;
    public final void rule__PolyContext__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2567:1: ( rule__PolyContext__Group__1__Impl rule__PolyContext__Group__2 )
            // InternalBSharp.g:2568:2: rule__PolyContext__Group__1__Impl rule__PolyContext__Group__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalBSharp.g:2575:1: rule__PolyContext__Group__1__Impl : ( ( ( rule__PolyContext__PolyTypesAssignment_1 ) ) ( ( rule__PolyContext__PolyTypesAssignment_1 )* ) ) ;
    public final void rule__PolyContext__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2579:1: ( ( ( ( rule__PolyContext__PolyTypesAssignment_1 ) ) ( ( rule__PolyContext__PolyTypesAssignment_1 )* ) ) )
            // InternalBSharp.g:2580:1: ( ( ( rule__PolyContext__PolyTypesAssignment_1 ) ) ( ( rule__PolyContext__PolyTypesAssignment_1 )* ) )
            {
            // InternalBSharp.g:2580:1: ( ( ( rule__PolyContext__PolyTypesAssignment_1 ) ) ( ( rule__PolyContext__PolyTypesAssignment_1 )* ) )
            // InternalBSharp.g:2581:2: ( ( rule__PolyContext__PolyTypesAssignment_1 ) ) ( ( rule__PolyContext__PolyTypesAssignment_1 )* )
            {
            // InternalBSharp.g:2581:2: ( ( rule__PolyContext__PolyTypesAssignment_1 ) )
            // InternalBSharp.g:2582:3: ( rule__PolyContext__PolyTypesAssignment_1 )
            {
             before(grammarAccess.getPolyContextAccess().getPolyTypesAssignment_1()); 
            // InternalBSharp.g:2583:3: ( rule__PolyContext__PolyTypesAssignment_1 )
            // InternalBSharp.g:2583:4: rule__PolyContext__PolyTypesAssignment_1
            {
            pushFollow(FOLLOW_13);
            rule__PolyContext__PolyTypesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPolyContextAccess().getPolyTypesAssignment_1()); 

            }

            // InternalBSharp.g:2586:2: ( ( rule__PolyContext__PolyTypesAssignment_1 )* )
            // InternalBSharp.g:2587:3: ( rule__PolyContext__PolyTypesAssignment_1 )*
            {
             before(grammarAccess.getPolyContextAccess().getPolyTypesAssignment_1()); 
            // InternalBSharp.g:2588:3: ( rule__PolyContext__PolyTypesAssignment_1 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_ID) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalBSharp.g:2588:4: rule__PolyContext__PolyTypesAssignment_1
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__PolyContext__PolyTypesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
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
    // InternalBSharp.g:2597:1: rule__PolyContext__Group__2 : rule__PolyContext__Group__2__Impl ;
    public final void rule__PolyContext__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2601:1: ( rule__PolyContext__Group__2__Impl )
            // InternalBSharp.g:2602:2: rule__PolyContext__Group__2__Impl
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
    // InternalBSharp.g:2608:1: rule__PolyContext__Group__2__Impl : ( '>' ) ;
    public final void rule__PolyContext__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2612:1: ( ( '>' ) )
            // InternalBSharp.g:2613:1: ( '>' )
            {
            // InternalBSharp.g:2613:1: ( '>' )
            // InternalBSharp.g:2614:2: '>'
            {
             before(grammarAccess.getPolyContextAccess().getGreaterThanSignKeyword_2()); 
            match(input,39,FOLLOW_2); 
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
    // InternalBSharp.g:2624:1: rule__PolyType__Group__0 : rule__PolyType__Group__0__Impl rule__PolyType__Group__1 ;
    public final void rule__PolyType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2628:1: ( rule__PolyType__Group__0__Impl rule__PolyType__Group__1 )
            // InternalBSharp.g:2629:2: rule__PolyType__Group__0__Impl rule__PolyType__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalBSharp.g:2636:1: rule__PolyType__Group__0__Impl : ( ( rule__PolyType__NameAssignment_0 ) ) ;
    public final void rule__PolyType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2640:1: ( ( ( rule__PolyType__NameAssignment_0 ) ) )
            // InternalBSharp.g:2641:1: ( ( rule__PolyType__NameAssignment_0 ) )
            {
            // InternalBSharp.g:2641:1: ( ( rule__PolyType__NameAssignment_0 ) )
            // InternalBSharp.g:2642:2: ( rule__PolyType__NameAssignment_0 )
            {
             before(grammarAccess.getPolyTypeAccess().getNameAssignment_0()); 
            // InternalBSharp.g:2643:2: ( rule__PolyType__NameAssignment_0 )
            // InternalBSharp.g:2643:3: rule__PolyType__NameAssignment_0
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
    // InternalBSharp.g:2651:1: rule__PolyType__Group__1 : rule__PolyType__Group__1__Impl ;
    public final void rule__PolyType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2655:1: ( rule__PolyType__Group__1__Impl )
            // InternalBSharp.g:2656:2: rule__PolyType__Group__1__Impl
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
    // InternalBSharp.g:2662:1: rule__PolyType__Group__1__Impl : ( ( rule__PolyType__Group_1__0 )? ) ;
    public final void rule__PolyType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2666:1: ( ( ( rule__PolyType__Group_1__0 )? ) )
            // InternalBSharp.g:2667:1: ( ( rule__PolyType__Group_1__0 )? )
            {
            // InternalBSharp.g:2667:1: ( ( rule__PolyType__Group_1__0 )? )
            // InternalBSharp.g:2668:2: ( rule__PolyType__Group_1__0 )?
            {
             before(grammarAccess.getPolyTypeAccess().getGroup_1()); 
            // InternalBSharp.g:2669:2: ( rule__PolyType__Group_1__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==32) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalBSharp.g:2669:3: rule__PolyType__Group_1__0
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
    // InternalBSharp.g:2678:1: rule__PolyType__Group_1__0 : rule__PolyType__Group_1__0__Impl rule__PolyType__Group_1__1 ;
    public final void rule__PolyType__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2682:1: ( rule__PolyType__Group_1__0__Impl rule__PolyType__Group_1__1 )
            // InternalBSharp.g:2683:2: rule__PolyType__Group_1__0__Impl rule__PolyType__Group_1__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalBSharp.g:2690:1: rule__PolyType__Group_1__0__Impl : ( ':' ) ;
    public final void rule__PolyType__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2694:1: ( ( ':' ) )
            // InternalBSharp.g:2695:1: ( ':' )
            {
            // InternalBSharp.g:2695:1: ( ':' )
            // InternalBSharp.g:2696:2: ':'
            {
             before(grammarAccess.getPolyTypeAccess().getColonKeyword_1_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalBSharp.g:2705:1: rule__PolyType__Group_1__1 : rule__PolyType__Group_1__1__Impl rule__PolyType__Group_1__2 ;
    public final void rule__PolyType__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2709:1: ( rule__PolyType__Group_1__1__Impl rule__PolyType__Group_1__2 )
            // InternalBSharp.g:2710:2: rule__PolyType__Group_1__1__Impl rule__PolyType__Group_1__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalBSharp.g:2717:1: rule__PolyType__Group_1__1__Impl : ( ( rule__PolyType__SuperTypesAssignment_1_1 ) ) ;
    public final void rule__PolyType__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2721:1: ( ( ( rule__PolyType__SuperTypesAssignment_1_1 ) ) )
            // InternalBSharp.g:2722:1: ( ( rule__PolyType__SuperTypesAssignment_1_1 ) )
            {
            // InternalBSharp.g:2722:1: ( ( rule__PolyType__SuperTypesAssignment_1_1 ) )
            // InternalBSharp.g:2723:2: ( rule__PolyType__SuperTypesAssignment_1_1 )
            {
             before(grammarAccess.getPolyTypeAccess().getSuperTypesAssignment_1_1()); 
            // InternalBSharp.g:2724:2: ( rule__PolyType__SuperTypesAssignment_1_1 )
            // InternalBSharp.g:2724:3: rule__PolyType__SuperTypesAssignment_1_1
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
    // InternalBSharp.g:2732:1: rule__PolyType__Group_1__2 : rule__PolyType__Group_1__2__Impl ;
    public final void rule__PolyType__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2736:1: ( rule__PolyType__Group_1__2__Impl )
            // InternalBSharp.g:2737:2: rule__PolyType__Group_1__2__Impl
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
    // InternalBSharp.g:2743:1: rule__PolyType__Group_1__2__Impl : ( ( rule__PolyType__Group_1_2__0 )* ) ;
    public final void rule__PolyType__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2747:1: ( ( ( rule__PolyType__Group_1_2__0 )* ) )
            // InternalBSharp.g:2748:1: ( ( rule__PolyType__Group_1_2__0 )* )
            {
            // InternalBSharp.g:2748:1: ( ( rule__PolyType__Group_1_2__0 )* )
            // InternalBSharp.g:2749:2: ( rule__PolyType__Group_1_2__0 )*
            {
             before(grammarAccess.getPolyTypeAccess().getGroup_1_2()); 
            // InternalBSharp.g:2750:2: ( rule__PolyType__Group_1_2__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==40) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalBSharp.g:2750:3: rule__PolyType__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__PolyType__Group_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
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
    // InternalBSharp.g:2759:1: rule__PolyType__Group_1_2__0 : rule__PolyType__Group_1_2__0__Impl rule__PolyType__Group_1_2__1 ;
    public final void rule__PolyType__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2763:1: ( rule__PolyType__Group_1_2__0__Impl rule__PolyType__Group_1_2__1 )
            // InternalBSharp.g:2764:2: rule__PolyType__Group_1_2__0__Impl rule__PolyType__Group_1_2__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalBSharp.g:2771:1: rule__PolyType__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__PolyType__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2775:1: ( ( ',' ) )
            // InternalBSharp.g:2776:1: ( ',' )
            {
            // InternalBSharp.g:2776:1: ( ',' )
            // InternalBSharp.g:2777:2: ','
            {
             before(grammarAccess.getPolyTypeAccess().getCommaKeyword_1_2_0()); 
            match(input,40,FOLLOW_2); 
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
    // InternalBSharp.g:2786:1: rule__PolyType__Group_1_2__1 : rule__PolyType__Group_1_2__1__Impl ;
    public final void rule__PolyType__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2790:1: ( rule__PolyType__Group_1_2__1__Impl )
            // InternalBSharp.g:2791:2: rule__PolyType__Group_1_2__1__Impl
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
    // InternalBSharp.g:2797:1: rule__PolyType__Group_1_2__1__Impl : ( ( rule__PolyType__SuperTypesAssignment_1_2_1 ) ) ;
    public final void rule__PolyType__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2801:1: ( ( ( rule__PolyType__SuperTypesAssignment_1_2_1 ) ) )
            // InternalBSharp.g:2802:1: ( ( rule__PolyType__SuperTypesAssignment_1_2_1 ) )
            {
            // InternalBSharp.g:2802:1: ( ( rule__PolyType__SuperTypesAssignment_1_2_1 ) )
            // InternalBSharp.g:2803:2: ( rule__PolyType__SuperTypesAssignment_1_2_1 )
            {
             before(grammarAccess.getPolyTypeAccess().getSuperTypesAssignment_1_2_1()); 
            // InternalBSharp.g:2804:2: ( rule__PolyType__SuperTypesAssignment_1_2_1 )
            // InternalBSharp.g:2804:3: rule__PolyType__SuperTypesAssignment_1_2_1
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
    // InternalBSharp.g:2813:1: rule__SuperTypeList__Group__0 : rule__SuperTypeList__Group__0__Impl rule__SuperTypeList__Group__1 ;
    public final void rule__SuperTypeList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2817:1: ( rule__SuperTypeList__Group__0__Impl rule__SuperTypeList__Group__1 )
            // InternalBSharp.g:2818:2: rule__SuperTypeList__Group__0__Impl rule__SuperTypeList__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalBSharp.g:2825:1: rule__SuperTypeList__Group__0__Impl : ( ':' ) ;
    public final void rule__SuperTypeList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2829:1: ( ( ':' ) )
            // InternalBSharp.g:2830:1: ( ':' )
            {
            // InternalBSharp.g:2830:1: ( ':' )
            // InternalBSharp.g:2831:2: ':'
            {
             before(grammarAccess.getSuperTypeListAccess().getColonKeyword_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalBSharp.g:2840:1: rule__SuperTypeList__Group__1 : rule__SuperTypeList__Group__1__Impl rule__SuperTypeList__Group__2 ;
    public final void rule__SuperTypeList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2844:1: ( rule__SuperTypeList__Group__1__Impl rule__SuperTypeList__Group__2 )
            // InternalBSharp.g:2845:2: rule__SuperTypeList__Group__1__Impl rule__SuperTypeList__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalBSharp.g:2852:1: rule__SuperTypeList__Group__1__Impl : ( ( rule__SuperTypeList__SuperTypesAssignment_1 ) ) ;
    public final void rule__SuperTypeList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2856:1: ( ( ( rule__SuperTypeList__SuperTypesAssignment_1 ) ) )
            // InternalBSharp.g:2857:1: ( ( rule__SuperTypeList__SuperTypesAssignment_1 ) )
            {
            // InternalBSharp.g:2857:1: ( ( rule__SuperTypeList__SuperTypesAssignment_1 ) )
            // InternalBSharp.g:2858:2: ( rule__SuperTypeList__SuperTypesAssignment_1 )
            {
             before(grammarAccess.getSuperTypeListAccess().getSuperTypesAssignment_1()); 
            // InternalBSharp.g:2859:2: ( rule__SuperTypeList__SuperTypesAssignment_1 )
            // InternalBSharp.g:2859:3: rule__SuperTypeList__SuperTypesAssignment_1
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
    // InternalBSharp.g:2867:1: rule__SuperTypeList__Group__2 : rule__SuperTypeList__Group__2__Impl ;
    public final void rule__SuperTypeList__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2871:1: ( rule__SuperTypeList__Group__2__Impl )
            // InternalBSharp.g:2872:2: rule__SuperTypeList__Group__2__Impl
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
    // InternalBSharp.g:2878:1: rule__SuperTypeList__Group__2__Impl : ( ( rule__SuperTypeList__Group_2__0 )* ) ;
    public final void rule__SuperTypeList__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2882:1: ( ( ( rule__SuperTypeList__Group_2__0 )* ) )
            // InternalBSharp.g:2883:1: ( ( rule__SuperTypeList__Group_2__0 )* )
            {
            // InternalBSharp.g:2883:1: ( ( rule__SuperTypeList__Group_2__0 )* )
            // InternalBSharp.g:2884:2: ( rule__SuperTypeList__Group_2__0 )*
            {
             before(grammarAccess.getSuperTypeListAccess().getGroup_2()); 
            // InternalBSharp.g:2885:2: ( rule__SuperTypeList__Group_2__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==40) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalBSharp.g:2885:3: rule__SuperTypeList__Group_2__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__SuperTypeList__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
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
    // InternalBSharp.g:2894:1: rule__SuperTypeList__Group_2__0 : rule__SuperTypeList__Group_2__0__Impl rule__SuperTypeList__Group_2__1 ;
    public final void rule__SuperTypeList__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2898:1: ( rule__SuperTypeList__Group_2__0__Impl rule__SuperTypeList__Group_2__1 )
            // InternalBSharp.g:2899:2: rule__SuperTypeList__Group_2__0__Impl rule__SuperTypeList__Group_2__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalBSharp.g:2906:1: rule__SuperTypeList__Group_2__0__Impl : ( ',' ) ;
    public final void rule__SuperTypeList__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2910:1: ( ( ',' ) )
            // InternalBSharp.g:2911:1: ( ',' )
            {
            // InternalBSharp.g:2911:1: ( ',' )
            // InternalBSharp.g:2912:2: ','
            {
             before(grammarAccess.getSuperTypeListAccess().getCommaKeyword_2_0()); 
            match(input,40,FOLLOW_2); 
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
    // InternalBSharp.g:2921:1: rule__SuperTypeList__Group_2__1 : rule__SuperTypeList__Group_2__1__Impl ;
    public final void rule__SuperTypeList__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2925:1: ( rule__SuperTypeList__Group_2__1__Impl )
            // InternalBSharp.g:2926:2: rule__SuperTypeList__Group_2__1__Impl
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
    // InternalBSharp.g:2932:1: rule__SuperTypeList__Group_2__1__Impl : ( ( rule__SuperTypeList__SuperTypesAssignment_2_1 ) ) ;
    public final void rule__SuperTypeList__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2936:1: ( ( ( rule__SuperTypeList__SuperTypesAssignment_2_1 ) ) )
            // InternalBSharp.g:2937:1: ( ( rule__SuperTypeList__SuperTypesAssignment_2_1 ) )
            {
            // InternalBSharp.g:2937:1: ( ( rule__SuperTypeList__SuperTypesAssignment_2_1 ) )
            // InternalBSharp.g:2938:2: ( rule__SuperTypeList__SuperTypesAssignment_2_1 )
            {
             before(grammarAccess.getSuperTypeListAccess().getSuperTypesAssignment_2_1()); 
            // InternalBSharp.g:2939:2: ( rule__SuperTypeList__SuperTypesAssignment_2_1 )
            // InternalBSharp.g:2939:3: rule__SuperTypeList__SuperTypesAssignment_2_1
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
    // InternalBSharp.g:2948:1: rule__ConstructedType__Group__0 : rule__ConstructedType__Group__0__Impl rule__ConstructedType__Group__1 ;
    public final void rule__ConstructedType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2952:1: ( rule__ConstructedType__Group__0__Impl rule__ConstructedType__Group__1 )
            // InternalBSharp.g:2953:2: rule__ConstructedType__Group__0__Impl rule__ConstructedType__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalBSharp.g:2960:1: rule__ConstructedType__Group__0__Impl : ( ( rule__ConstructedType__Alternatives_0 ) ) ;
    public final void rule__ConstructedType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2964:1: ( ( ( rule__ConstructedType__Alternatives_0 ) ) )
            // InternalBSharp.g:2965:1: ( ( rule__ConstructedType__Alternatives_0 ) )
            {
            // InternalBSharp.g:2965:1: ( ( rule__ConstructedType__Alternatives_0 ) )
            // InternalBSharp.g:2966:2: ( rule__ConstructedType__Alternatives_0 )
            {
             before(grammarAccess.getConstructedTypeAccess().getAlternatives_0()); 
            // InternalBSharp.g:2967:2: ( rule__ConstructedType__Alternatives_0 )
            // InternalBSharp.g:2967:3: rule__ConstructedType__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__ConstructedType__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getConstructedTypeAccess().getAlternatives_0()); 

            }


            }

        }
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
    // InternalBSharp.g:2975:1: rule__ConstructedType__Group__1 : rule__ConstructedType__Group__1__Impl ;
    public final void rule__ConstructedType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2979:1: ( rule__ConstructedType__Group__1__Impl )
            // InternalBSharp.g:2980:2: rule__ConstructedType__Group__1__Impl
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
    // InternalBSharp.g:2986:1: rule__ConstructedType__Group__1__Impl : ( ( rule__ConstructedType__Group_1__0 )* ) ;
    public final void rule__ConstructedType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2990:1: ( ( ( rule__ConstructedType__Group_1__0 )* ) )
            // InternalBSharp.g:2991:1: ( ( rule__ConstructedType__Group_1__0 )* )
            {
            // InternalBSharp.g:2991:1: ( ( rule__ConstructedType__Group_1__0 )* )
            // InternalBSharp.g:2992:2: ( rule__ConstructedType__Group_1__0 )*
            {
             before(grammarAccess.getConstructedTypeAccess().getGroup_1()); 
            // InternalBSharp.g:2993:2: ( rule__ConstructedType__Group_1__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( ((LA34_0>=13 && LA34_0<=22)) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalBSharp.g:2993:3: rule__ConstructedType__Group_1__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__ConstructedType__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
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
    // InternalBSharp.g:3002:1: rule__ConstructedType__Group_1__0 : rule__ConstructedType__Group_1__0__Impl rule__ConstructedType__Group_1__1 ;
    public final void rule__ConstructedType__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3006:1: ( rule__ConstructedType__Group_1__0__Impl rule__ConstructedType__Group_1__1 )
            // InternalBSharp.g:3007:2: rule__ConstructedType__Group_1__0__Impl rule__ConstructedType__Group_1__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalBSharp.g:3014:1: rule__ConstructedType__Group_1__0__Impl : ( () ) ;
    public final void rule__ConstructedType__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3018:1: ( ( () ) )
            // InternalBSharp.g:3019:1: ( () )
            {
            // InternalBSharp.g:3019:1: ( () )
            // InternalBSharp.g:3020:2: ()
            {
             before(grammarAccess.getConstructedTypeAccess().getConstructedTypeLeftAction_1_0()); 
            // InternalBSharp.g:3021:2: ()
            // InternalBSharp.g:3021:3: 
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
    // InternalBSharp.g:3029:1: rule__ConstructedType__Group_1__1 : rule__ConstructedType__Group_1__1__Impl rule__ConstructedType__Group_1__2 ;
    public final void rule__ConstructedType__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3033:1: ( rule__ConstructedType__Group_1__1__Impl rule__ConstructedType__Group_1__2 )
            // InternalBSharp.g:3034:2: rule__ConstructedType__Group_1__1__Impl rule__ConstructedType__Group_1__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalBSharp.g:3041:1: rule__ConstructedType__Group_1__1__Impl : ( ( rule__ConstructedType__ConstructorAssignment_1_1 ) ) ;
    public final void rule__ConstructedType__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3045:1: ( ( ( rule__ConstructedType__ConstructorAssignment_1_1 ) ) )
            // InternalBSharp.g:3046:1: ( ( rule__ConstructedType__ConstructorAssignment_1_1 ) )
            {
            // InternalBSharp.g:3046:1: ( ( rule__ConstructedType__ConstructorAssignment_1_1 ) )
            // InternalBSharp.g:3047:2: ( rule__ConstructedType__ConstructorAssignment_1_1 )
            {
             before(grammarAccess.getConstructedTypeAccess().getConstructorAssignment_1_1()); 
            // InternalBSharp.g:3048:2: ( rule__ConstructedType__ConstructorAssignment_1_1 )
            // InternalBSharp.g:3048:3: rule__ConstructedType__ConstructorAssignment_1_1
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
    // InternalBSharp.g:3056:1: rule__ConstructedType__Group_1__2 : rule__ConstructedType__Group_1__2__Impl ;
    public final void rule__ConstructedType__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3060:1: ( rule__ConstructedType__Group_1__2__Impl )
            // InternalBSharp.g:3061:2: rule__ConstructedType__Group_1__2__Impl
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
    // InternalBSharp.g:3067:1: rule__ConstructedType__Group_1__2__Impl : ( ( rule__ConstructedType__RightAssignment_1_2 ) ) ;
    public final void rule__ConstructedType__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3071:1: ( ( ( rule__ConstructedType__RightAssignment_1_2 ) ) )
            // InternalBSharp.g:3072:1: ( ( rule__ConstructedType__RightAssignment_1_2 ) )
            {
            // InternalBSharp.g:3072:1: ( ( rule__ConstructedType__RightAssignment_1_2 ) )
            // InternalBSharp.g:3073:2: ( rule__ConstructedType__RightAssignment_1_2 )
            {
             before(grammarAccess.getConstructedTypeAccess().getRightAssignment_1_2()); 
            // InternalBSharp.g:3074:2: ( rule__ConstructedType__RightAssignment_1_2 )
            // InternalBSharp.g:3074:3: rule__ConstructedType__RightAssignment_1_2
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
    // InternalBSharp.g:3083:1: rule__TypeConstructor__Group__0 : rule__TypeConstructor__Group__0__Impl rule__TypeConstructor__Group__1 ;
    public final void rule__TypeConstructor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3087:1: ( rule__TypeConstructor__Group__0__Impl rule__TypeConstructor__Group__1 )
            // InternalBSharp.g:3088:2: rule__TypeConstructor__Group__0__Impl rule__TypeConstructor__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalBSharp.g:3095:1: rule__TypeConstructor__Group__0__Impl : ( ( rule__TypeConstructor__TypeNameAssignment_0 ) ) ;
    public final void rule__TypeConstructor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3099:1: ( ( ( rule__TypeConstructor__TypeNameAssignment_0 ) ) )
            // InternalBSharp.g:3100:1: ( ( rule__TypeConstructor__TypeNameAssignment_0 ) )
            {
            // InternalBSharp.g:3100:1: ( ( rule__TypeConstructor__TypeNameAssignment_0 ) )
            // InternalBSharp.g:3101:2: ( rule__TypeConstructor__TypeNameAssignment_0 )
            {
             before(grammarAccess.getTypeConstructorAccess().getTypeNameAssignment_0()); 
            // InternalBSharp.g:3102:2: ( rule__TypeConstructor__TypeNameAssignment_0 )
            // InternalBSharp.g:3102:3: rule__TypeConstructor__TypeNameAssignment_0
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
    // InternalBSharp.g:3110:1: rule__TypeConstructor__Group__1 : rule__TypeConstructor__Group__1__Impl ;
    public final void rule__TypeConstructor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3114:1: ( rule__TypeConstructor__Group__1__Impl )
            // InternalBSharp.g:3115:2: rule__TypeConstructor__Group__1__Impl
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
    // InternalBSharp.g:3121:1: rule__TypeConstructor__Group__1__Impl : ( ( rule__TypeConstructor__ContextAssignment_1 )? ) ;
    public final void rule__TypeConstructor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3125:1: ( ( ( rule__TypeConstructor__ContextAssignment_1 )? ) )
            // InternalBSharp.g:3126:1: ( ( rule__TypeConstructor__ContextAssignment_1 )? )
            {
            // InternalBSharp.g:3126:1: ( ( rule__TypeConstructor__ContextAssignment_1 )? )
            // InternalBSharp.g:3127:2: ( rule__TypeConstructor__ContextAssignment_1 )?
            {
             before(grammarAccess.getTypeConstructorAccess().getContextAssignment_1()); 
            // InternalBSharp.g:3128:2: ( rule__TypeConstructor__ContextAssignment_1 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==38) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalBSharp.g:3128:3: rule__TypeConstructor__ContextAssignment_1
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


    // $ANTLR start "rule__TypeConstrBracket__Group__0"
    // InternalBSharp.g:3137:1: rule__TypeConstrBracket__Group__0 : rule__TypeConstrBracket__Group__0__Impl rule__TypeConstrBracket__Group__1 ;
    public final void rule__TypeConstrBracket__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3141:1: ( rule__TypeConstrBracket__Group__0__Impl rule__TypeConstrBracket__Group__1 )
            // InternalBSharp.g:3142:2: rule__TypeConstrBracket__Group__0__Impl rule__TypeConstrBracket__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalBSharp.g:3149:1: rule__TypeConstrBracket__Group__0__Impl : ( '(' ) ;
    public final void rule__TypeConstrBracket__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3153:1: ( ( '(' ) )
            // InternalBSharp.g:3154:1: ( '(' )
            {
            // InternalBSharp.g:3154:1: ( '(' )
            // InternalBSharp.g:3155:2: '('
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
    // InternalBSharp.g:3164:1: rule__TypeConstrBracket__Group__1 : rule__TypeConstrBracket__Group__1__Impl rule__TypeConstrBracket__Group__2 ;
    public final void rule__TypeConstrBracket__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3168:1: ( rule__TypeConstrBracket__Group__1__Impl rule__TypeConstrBracket__Group__2 )
            // InternalBSharp.g:3169:2: rule__TypeConstrBracket__Group__1__Impl rule__TypeConstrBracket__Group__2
            {
            pushFollow(FOLLOW_23);
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
    // InternalBSharp.g:3176:1: rule__TypeConstrBracket__Group__1__Impl : ( ( rule__TypeConstrBracket__ChildAssignment_1 ) ) ;
    public final void rule__TypeConstrBracket__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3180:1: ( ( ( rule__TypeConstrBracket__ChildAssignment_1 ) ) )
            // InternalBSharp.g:3181:1: ( ( rule__TypeConstrBracket__ChildAssignment_1 ) )
            {
            // InternalBSharp.g:3181:1: ( ( rule__TypeConstrBracket__ChildAssignment_1 ) )
            // InternalBSharp.g:3182:2: ( rule__TypeConstrBracket__ChildAssignment_1 )
            {
             before(grammarAccess.getTypeConstrBracketAccess().getChildAssignment_1()); 
            // InternalBSharp.g:3183:2: ( rule__TypeConstrBracket__ChildAssignment_1 )
            // InternalBSharp.g:3183:3: rule__TypeConstrBracket__ChildAssignment_1
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
    // InternalBSharp.g:3191:1: rule__TypeConstrBracket__Group__2 : rule__TypeConstrBracket__Group__2__Impl ;
    public final void rule__TypeConstrBracket__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3195:1: ( rule__TypeConstrBracket__Group__2__Impl )
            // InternalBSharp.g:3196:2: rule__TypeConstrBracket__Group__2__Impl
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
    // InternalBSharp.g:3202:1: rule__TypeConstrBracket__Group__2__Impl : ( ')' ) ;
    public final void rule__TypeConstrBracket__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3206:1: ( ( ')' ) )
            // InternalBSharp.g:3207:1: ( ')' )
            {
            // InternalBSharp.g:3207:1: ( ')' )
            // InternalBSharp.g:3208:2: ')'
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
    // InternalBSharp.g:3218:1: rule__TypeDeclContext__Group__0 : rule__TypeDeclContext__Group__0__Impl rule__TypeDeclContext__Group__1 ;
    public final void rule__TypeDeclContext__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3222:1: ( rule__TypeDeclContext__Group__0__Impl rule__TypeDeclContext__Group__1 )
            // InternalBSharp.g:3223:2: rule__TypeDeclContext__Group__0__Impl rule__TypeDeclContext__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalBSharp.g:3230:1: rule__TypeDeclContext__Group__0__Impl : ( '<' ) ;
    public final void rule__TypeDeclContext__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3234:1: ( ( '<' ) )
            // InternalBSharp.g:3235:1: ( '<' )
            {
            // InternalBSharp.g:3235:1: ( '<' )
            // InternalBSharp.g:3236:2: '<'
            {
             before(grammarAccess.getTypeDeclContextAccess().getLessThanSignKeyword_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalBSharp.g:3245:1: rule__TypeDeclContext__Group__1 : rule__TypeDeclContext__Group__1__Impl rule__TypeDeclContext__Group__2 ;
    public final void rule__TypeDeclContext__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3249:1: ( rule__TypeDeclContext__Group__1__Impl rule__TypeDeclContext__Group__2 )
            // InternalBSharp.g:3250:2: rule__TypeDeclContext__Group__1__Impl rule__TypeDeclContext__Group__2
            {
            pushFollow(FOLLOW_24);
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
    // InternalBSharp.g:3257:1: rule__TypeDeclContext__Group__1__Impl : ( ( rule__TypeDeclContext__TypeNameAssignment_1 ) ) ;
    public final void rule__TypeDeclContext__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3261:1: ( ( ( rule__TypeDeclContext__TypeNameAssignment_1 ) ) )
            // InternalBSharp.g:3262:1: ( ( rule__TypeDeclContext__TypeNameAssignment_1 ) )
            {
            // InternalBSharp.g:3262:1: ( ( rule__TypeDeclContext__TypeNameAssignment_1 ) )
            // InternalBSharp.g:3263:2: ( rule__TypeDeclContext__TypeNameAssignment_1 )
            {
             before(grammarAccess.getTypeDeclContextAccess().getTypeNameAssignment_1()); 
            // InternalBSharp.g:3264:2: ( rule__TypeDeclContext__TypeNameAssignment_1 )
            // InternalBSharp.g:3264:3: rule__TypeDeclContext__TypeNameAssignment_1
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
    // InternalBSharp.g:3272:1: rule__TypeDeclContext__Group__2 : rule__TypeDeclContext__Group__2__Impl rule__TypeDeclContext__Group__3 ;
    public final void rule__TypeDeclContext__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3276:1: ( rule__TypeDeclContext__Group__2__Impl rule__TypeDeclContext__Group__3 )
            // InternalBSharp.g:3277:2: rule__TypeDeclContext__Group__2__Impl rule__TypeDeclContext__Group__3
            {
            pushFollow(FOLLOW_24);
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
    // InternalBSharp.g:3284:1: rule__TypeDeclContext__Group__2__Impl : ( ( rule__TypeDeclContext__Group_2__0 )* ) ;
    public final void rule__TypeDeclContext__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3288:1: ( ( ( rule__TypeDeclContext__Group_2__0 )* ) )
            // InternalBSharp.g:3289:1: ( ( rule__TypeDeclContext__Group_2__0 )* )
            {
            // InternalBSharp.g:3289:1: ( ( rule__TypeDeclContext__Group_2__0 )* )
            // InternalBSharp.g:3290:2: ( rule__TypeDeclContext__Group_2__0 )*
            {
             before(grammarAccess.getTypeDeclContextAccess().getGroup_2()); 
            // InternalBSharp.g:3291:2: ( rule__TypeDeclContext__Group_2__0 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==40) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalBSharp.g:3291:3: rule__TypeDeclContext__Group_2__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__TypeDeclContext__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop36;
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
    // InternalBSharp.g:3299:1: rule__TypeDeclContext__Group__3 : rule__TypeDeclContext__Group__3__Impl ;
    public final void rule__TypeDeclContext__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3303:1: ( rule__TypeDeclContext__Group__3__Impl )
            // InternalBSharp.g:3304:2: rule__TypeDeclContext__Group__3__Impl
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
    // InternalBSharp.g:3310:1: rule__TypeDeclContext__Group__3__Impl : ( '>' ) ;
    public final void rule__TypeDeclContext__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3314:1: ( ( '>' ) )
            // InternalBSharp.g:3315:1: ( '>' )
            {
            // InternalBSharp.g:3315:1: ( '>' )
            // InternalBSharp.g:3316:2: '>'
            {
             before(grammarAccess.getTypeDeclContextAccess().getGreaterThanSignKeyword_3()); 
            match(input,39,FOLLOW_2); 
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
    // InternalBSharp.g:3326:1: rule__TypeDeclContext__Group_2__0 : rule__TypeDeclContext__Group_2__0__Impl rule__TypeDeclContext__Group_2__1 ;
    public final void rule__TypeDeclContext__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3330:1: ( rule__TypeDeclContext__Group_2__0__Impl rule__TypeDeclContext__Group_2__1 )
            // InternalBSharp.g:3331:2: rule__TypeDeclContext__Group_2__0__Impl rule__TypeDeclContext__Group_2__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalBSharp.g:3338:1: rule__TypeDeclContext__Group_2__0__Impl : ( ',' ) ;
    public final void rule__TypeDeclContext__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3342:1: ( ( ',' ) )
            // InternalBSharp.g:3343:1: ( ',' )
            {
            // InternalBSharp.g:3343:1: ( ',' )
            // InternalBSharp.g:3344:2: ','
            {
             before(grammarAccess.getTypeDeclContextAccess().getCommaKeyword_2_0()); 
            match(input,40,FOLLOW_2); 
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
    // InternalBSharp.g:3353:1: rule__TypeDeclContext__Group_2__1 : rule__TypeDeclContext__Group_2__1__Impl ;
    public final void rule__TypeDeclContext__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3357:1: ( rule__TypeDeclContext__Group_2__1__Impl )
            // InternalBSharp.g:3358:2: rule__TypeDeclContext__Group_2__1__Impl
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
    // InternalBSharp.g:3364:1: rule__TypeDeclContext__Group_2__1__Impl : ( ( rule__TypeDeclContext__TypeNameAssignment_2_1 ) ) ;
    public final void rule__TypeDeclContext__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3368:1: ( ( ( rule__TypeDeclContext__TypeNameAssignment_2_1 ) ) )
            // InternalBSharp.g:3369:1: ( ( rule__TypeDeclContext__TypeNameAssignment_2_1 ) )
            {
            // InternalBSharp.g:3369:1: ( ( rule__TypeDeclContext__TypeNameAssignment_2_1 ) )
            // InternalBSharp.g:3370:2: ( rule__TypeDeclContext__TypeNameAssignment_2_1 )
            {
             before(grammarAccess.getTypeDeclContextAccess().getTypeNameAssignment_2_1()); 
            // InternalBSharp.g:3371:2: ( rule__TypeDeclContext__TypeNameAssignment_2_1 )
            // InternalBSharp.g:3371:3: rule__TypeDeclContext__TypeNameAssignment_2_1
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


    // $ANTLR start "rule__TypeStructure__Group__0"
    // InternalBSharp.g:3380:1: rule__TypeStructure__Group__0 : rule__TypeStructure__Group__0__Impl rule__TypeStructure__Group__1 ;
    public final void rule__TypeStructure__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3384:1: ( rule__TypeStructure__Group__0__Impl rule__TypeStructure__Group__1 )
            // InternalBSharp.g:3385:2: rule__TypeStructure__Group__0__Impl rule__TypeStructure__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__TypeStructure__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeStructure__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeStructure__Group__0"


    // $ANTLR start "rule__TypeStructure__Group__0__Impl"
    // InternalBSharp.g:3392:1: rule__TypeStructure__Group__0__Impl : ( '(' ) ;
    public final void rule__TypeStructure__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3396:1: ( ( '(' ) )
            // InternalBSharp.g:3397:1: ( '(' )
            {
            // InternalBSharp.g:3397:1: ( '(' )
            // InternalBSharp.g:3398:2: '('
            {
             before(grammarAccess.getTypeStructureAccess().getLeftParenthesisKeyword_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getTypeStructureAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeStructure__Group__0__Impl"


    // $ANTLR start "rule__TypeStructure__Group__1"
    // InternalBSharp.g:3407:1: rule__TypeStructure__Group__1 : rule__TypeStructure__Group__1__Impl rule__TypeStructure__Group__2 ;
    public final void rule__TypeStructure__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3411:1: ( rule__TypeStructure__Group__1__Impl rule__TypeStructure__Group__2 )
            // InternalBSharp.g:3412:2: rule__TypeStructure__Group__1__Impl rule__TypeStructure__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__TypeStructure__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeStructure__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeStructure__Group__1"


    // $ANTLR start "rule__TypeStructure__Group__1__Impl"
    // InternalBSharp.g:3419:1: rule__TypeStructure__Group__1__Impl : ( ( rule__TypeStructure__VariablesAssignment_1 ) ) ;
    public final void rule__TypeStructure__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3423:1: ( ( ( rule__TypeStructure__VariablesAssignment_1 ) ) )
            // InternalBSharp.g:3424:1: ( ( rule__TypeStructure__VariablesAssignment_1 ) )
            {
            // InternalBSharp.g:3424:1: ( ( rule__TypeStructure__VariablesAssignment_1 ) )
            // InternalBSharp.g:3425:2: ( rule__TypeStructure__VariablesAssignment_1 )
            {
             before(grammarAccess.getTypeStructureAccess().getVariablesAssignment_1()); 
            // InternalBSharp.g:3426:2: ( rule__TypeStructure__VariablesAssignment_1 )
            // InternalBSharp.g:3426:3: rule__TypeStructure__VariablesAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TypeStructure__VariablesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTypeStructureAccess().getVariablesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeStructure__Group__1__Impl"


    // $ANTLR start "rule__TypeStructure__Group__2"
    // InternalBSharp.g:3434:1: rule__TypeStructure__Group__2 : rule__TypeStructure__Group__2__Impl ;
    public final void rule__TypeStructure__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3438:1: ( rule__TypeStructure__Group__2__Impl )
            // InternalBSharp.g:3439:2: rule__TypeStructure__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TypeStructure__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeStructure__Group__2"


    // $ANTLR start "rule__TypeStructure__Group__2__Impl"
    // InternalBSharp.g:3445:1: rule__TypeStructure__Group__2__Impl : ( ')' ) ;
    public final void rule__TypeStructure__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3449:1: ( ( ')' ) )
            // InternalBSharp.g:3450:1: ( ')' )
            {
            // InternalBSharp.g:3450:1: ( ')' )
            // InternalBSharp.g:3451:2: ')'
            {
             before(grammarAccess.getTypeStructureAccess().getRightParenthesisKeyword_2()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getTypeStructureAccess().getRightParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeStructure__Group__2__Impl"


    // $ANTLR start "rule__Where__Group__0"
    // InternalBSharp.g:3461:1: rule__Where__Group__0 : rule__Where__Group__0__Impl rule__Where__Group__1 ;
    public final void rule__Where__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3465:1: ( rule__Where__Group__0__Impl rule__Where__Group__1 )
            // InternalBSharp.g:3466:2: rule__Where__Group__0__Impl rule__Where__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalBSharp.g:3473:1: rule__Where__Group__0__Impl : ( 'where' ) ;
    public final void rule__Where__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3477:1: ( ( 'where' ) )
            // InternalBSharp.g:3478:1: ( 'where' )
            {
            // InternalBSharp.g:3478:1: ( 'where' )
            // InternalBSharp.g:3479:2: 'where'
            {
             before(grammarAccess.getWhereAccess().getWhereKeyword_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalBSharp.g:3488:1: rule__Where__Group__1 : rule__Where__Group__1__Impl rule__Where__Group__2 ;
    public final void rule__Where__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3492:1: ( rule__Where__Group__1__Impl rule__Where__Group__2 )
            // InternalBSharp.g:3493:2: rule__Where__Group__1__Impl rule__Where__Group__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalBSharp.g:3500:1: rule__Where__Group__1__Impl : ( ( rule__Where__ExpessionsAssignment_1 ) ) ;
    public final void rule__Where__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3504:1: ( ( ( rule__Where__ExpessionsAssignment_1 ) ) )
            // InternalBSharp.g:3505:1: ( ( rule__Where__ExpessionsAssignment_1 ) )
            {
            // InternalBSharp.g:3505:1: ( ( rule__Where__ExpessionsAssignment_1 ) )
            // InternalBSharp.g:3506:2: ( rule__Where__ExpessionsAssignment_1 )
            {
             before(grammarAccess.getWhereAccess().getExpessionsAssignment_1()); 
            // InternalBSharp.g:3507:2: ( rule__Where__ExpessionsAssignment_1 )
            // InternalBSharp.g:3507:3: rule__Where__ExpessionsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Where__ExpessionsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getWhereAccess().getExpessionsAssignment_1()); 

            }


            }

        }
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
    // InternalBSharp.g:3515:1: rule__Where__Group__2 : rule__Where__Group__2__Impl ;
    public final void rule__Where__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3519:1: ( rule__Where__Group__2__Impl )
            // InternalBSharp.g:3520:2: rule__Where__Group__2__Impl
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
    // InternalBSharp.g:3526:1: rule__Where__Group__2__Impl : ( ( rule__Where__Group_2__0 )* ) ;
    public final void rule__Where__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3530:1: ( ( ( rule__Where__Group_2__0 )* ) )
            // InternalBSharp.g:3531:1: ( ( rule__Where__Group_2__0 )* )
            {
            // InternalBSharp.g:3531:1: ( ( rule__Where__Group_2__0 )* )
            // InternalBSharp.g:3532:2: ( rule__Where__Group_2__0 )*
            {
             before(grammarAccess.getWhereAccess().getGroup_2()); 
            // InternalBSharp.g:3533:2: ( rule__Where__Group_2__0 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==37) ) {
                    int LA37_2 = input.LA(2);

                    if ( (LA37_2==RULE_ID||LA37_2==11||(LA37_2>=23 && LA37_2<=24)||LA37_2==41||LA37_2==49||LA37_2==54) ) {
                        alt37=1;
                    }


                }


                switch (alt37) {
            	case 1 :
            	    // InternalBSharp.g:3533:3: rule__Where__Group_2__0
            	    {
            	    pushFollow(FOLLOW_27);
            	    rule__Where__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop37;
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
    // InternalBSharp.g:3542:1: rule__Where__Group_2__0 : rule__Where__Group_2__0__Impl rule__Where__Group_2__1 ;
    public final void rule__Where__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3546:1: ( rule__Where__Group_2__0__Impl rule__Where__Group_2__1 )
            // InternalBSharp.g:3547:2: rule__Where__Group_2__0__Impl rule__Where__Group_2__1
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
    // InternalBSharp.g:3554:1: rule__Where__Group_2__0__Impl : ( ';' ) ;
    public final void rule__Where__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3558:1: ( ( ';' ) )
            // InternalBSharp.g:3559:1: ( ';' )
            {
            // InternalBSharp.g:3559:1: ( ';' )
            // InternalBSharp.g:3560:2: ';'
            {
             before(grammarAccess.getWhereAccess().getSemicolonKeyword_2_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalBSharp.g:3569:1: rule__Where__Group_2__1 : rule__Where__Group_2__1__Impl ;
    public final void rule__Where__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3573:1: ( rule__Where__Group_2__1__Impl )
            // InternalBSharp.g:3574:2: rule__Where__Group_2__1__Impl
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
    // InternalBSharp.g:3580:1: rule__Where__Group_2__1__Impl : ( ( rule__Where__ExpressionsAssignment_2_1 ) ) ;
    public final void rule__Where__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3584:1: ( ( ( rule__Where__ExpressionsAssignment_2_1 ) ) )
            // InternalBSharp.g:3585:1: ( ( rule__Where__ExpressionsAssignment_2_1 ) )
            {
            // InternalBSharp.g:3585:1: ( ( rule__Where__ExpressionsAssignment_2_1 ) )
            // InternalBSharp.g:3586:2: ( rule__Where__ExpressionsAssignment_2_1 )
            {
             before(grammarAccess.getWhereAccess().getExpressionsAssignment_2_1()); 
            // InternalBSharp.g:3587:2: ( rule__Where__ExpressionsAssignment_2_1 )
            // InternalBSharp.g:3587:3: rule__Where__ExpressionsAssignment_2_1
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
    // InternalBSharp.g:3596:1: rule__Datatype__Group__0 : rule__Datatype__Group__0__Impl rule__Datatype__Group__1 ;
    public final void rule__Datatype__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3600:1: ( rule__Datatype__Group__0__Impl rule__Datatype__Group__1 )
            // InternalBSharp.g:3601:2: rule__Datatype__Group__0__Impl rule__Datatype__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalBSharp.g:3608:1: rule__Datatype__Group__0__Impl : ( 'Datatype' ) ;
    public final void rule__Datatype__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3612:1: ( ( 'Datatype' ) )
            // InternalBSharp.g:3613:1: ( 'Datatype' )
            {
            // InternalBSharp.g:3613:1: ( 'Datatype' )
            // InternalBSharp.g:3614:2: 'Datatype'
            {
             before(grammarAccess.getDatatypeAccess().getDatatypeKeyword_0()); 
            match(input,44,FOLLOW_2); 
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
    // InternalBSharp.g:3623:1: rule__Datatype__Group__1 : rule__Datatype__Group__1__Impl rule__Datatype__Group__2 ;
    public final void rule__Datatype__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3627:1: ( rule__Datatype__Group__1__Impl rule__Datatype__Group__2 )
            // InternalBSharp.g:3628:2: rule__Datatype__Group__1__Impl rule__Datatype__Group__2
            {
            pushFollow(FOLLOW_29);
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
    // InternalBSharp.g:3635:1: rule__Datatype__Group__1__Impl : ( ( rule__Datatype__NameAssignment_1 ) ) ;
    public final void rule__Datatype__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3639:1: ( ( ( rule__Datatype__NameAssignment_1 ) ) )
            // InternalBSharp.g:3640:1: ( ( rule__Datatype__NameAssignment_1 ) )
            {
            // InternalBSharp.g:3640:1: ( ( rule__Datatype__NameAssignment_1 ) )
            // InternalBSharp.g:3641:2: ( rule__Datatype__NameAssignment_1 )
            {
             before(grammarAccess.getDatatypeAccess().getNameAssignment_1()); 
            // InternalBSharp.g:3642:2: ( rule__Datatype__NameAssignment_1 )
            // InternalBSharp.g:3642:3: rule__Datatype__NameAssignment_1
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
    // InternalBSharp.g:3650:1: rule__Datatype__Group__2 : rule__Datatype__Group__2__Impl rule__Datatype__Group__3 ;
    public final void rule__Datatype__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3654:1: ( rule__Datatype__Group__2__Impl rule__Datatype__Group__3 )
            // InternalBSharp.g:3655:2: rule__Datatype__Group__2__Impl rule__Datatype__Group__3
            {
            pushFollow(FOLLOW_29);
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
    // InternalBSharp.g:3662:1: rule__Datatype__Group__2__Impl : ( ( rule__Datatype__ContextAssignment_2 )? ) ;
    public final void rule__Datatype__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3666:1: ( ( ( rule__Datatype__ContextAssignment_2 )? ) )
            // InternalBSharp.g:3667:1: ( ( rule__Datatype__ContextAssignment_2 )? )
            {
            // InternalBSharp.g:3667:1: ( ( rule__Datatype__ContextAssignment_2 )? )
            // InternalBSharp.g:3668:2: ( rule__Datatype__ContextAssignment_2 )?
            {
             before(grammarAccess.getDatatypeAccess().getContextAssignment_2()); 
            // InternalBSharp.g:3669:2: ( rule__Datatype__ContextAssignment_2 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==38) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalBSharp.g:3669:3: rule__Datatype__ContextAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Datatype__ContextAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDatatypeAccess().getContextAssignment_2()); 

            }


            }

        }
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
    // InternalBSharp.g:3677:1: rule__Datatype__Group__3 : rule__Datatype__Group__3__Impl rule__Datatype__Group__4 ;
    public final void rule__Datatype__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3681:1: ( rule__Datatype__Group__3__Impl rule__Datatype__Group__4 )
            // InternalBSharp.g:3682:2: rule__Datatype__Group__3__Impl rule__Datatype__Group__4
            {
            pushFollow(FOLLOW_15);
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
    // InternalBSharp.g:3689:1: rule__Datatype__Group__3__Impl : ( ( ( rule__Datatype__Group_3__0 ) ) ( ( rule__Datatype__Group_3__0 )* ) ) ;
    public final void rule__Datatype__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3693:1: ( ( ( ( rule__Datatype__Group_3__0 ) ) ( ( rule__Datatype__Group_3__0 )* ) ) )
            // InternalBSharp.g:3694:1: ( ( ( rule__Datatype__Group_3__0 ) ) ( ( rule__Datatype__Group_3__0 )* ) )
            {
            // InternalBSharp.g:3694:1: ( ( ( rule__Datatype__Group_3__0 ) ) ( ( rule__Datatype__Group_3__0 )* ) )
            // InternalBSharp.g:3695:2: ( ( rule__Datatype__Group_3__0 ) ) ( ( rule__Datatype__Group_3__0 )* )
            {
            // InternalBSharp.g:3695:2: ( ( rule__Datatype__Group_3__0 ) )
            // InternalBSharp.g:3696:3: ( rule__Datatype__Group_3__0 )
            {
             before(grammarAccess.getDatatypeAccess().getGroup_3()); 
            // InternalBSharp.g:3697:3: ( rule__Datatype__Group_3__0 )
            // InternalBSharp.g:3697:4: rule__Datatype__Group_3__0
            {
            pushFollow(FOLLOW_30);
            rule__Datatype__Group_3__0();

            state._fsp--;


            }

             after(grammarAccess.getDatatypeAccess().getGroup_3()); 

            }

            // InternalBSharp.g:3700:2: ( ( rule__Datatype__Group_3__0 )* )
            // InternalBSharp.g:3701:3: ( rule__Datatype__Group_3__0 )*
            {
             before(grammarAccess.getDatatypeAccess().getGroup_3()); 
            // InternalBSharp.g:3702:3: ( rule__Datatype__Group_3__0 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==45) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalBSharp.g:3702:4: rule__Datatype__Group_3__0
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__Datatype__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop39;
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
    // InternalBSharp.g:3711:1: rule__Datatype__Group__4 : rule__Datatype__Group__4__Impl ;
    public final void rule__Datatype__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3715:1: ( rule__Datatype__Group__4__Impl )
            // InternalBSharp.g:3716:2: rule__Datatype__Group__4__Impl
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
    // InternalBSharp.g:3722:1: rule__Datatype__Group__4__Impl : ( ( rule__Datatype__BlockAssignment_4 ) ) ;
    public final void rule__Datatype__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3726:1: ( ( ( rule__Datatype__BlockAssignment_4 ) ) )
            // InternalBSharp.g:3727:1: ( ( rule__Datatype__BlockAssignment_4 ) )
            {
            // InternalBSharp.g:3727:1: ( ( rule__Datatype__BlockAssignment_4 ) )
            // InternalBSharp.g:3728:2: ( rule__Datatype__BlockAssignment_4 )
            {
             before(grammarAccess.getDatatypeAccess().getBlockAssignment_4()); 
            // InternalBSharp.g:3729:2: ( rule__Datatype__BlockAssignment_4 )
            // InternalBSharp.g:3729:3: rule__Datatype__BlockAssignment_4
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
    // InternalBSharp.g:3738:1: rule__Datatype__Group_3__0 : rule__Datatype__Group_3__0__Impl rule__Datatype__Group_3__1 ;
    public final void rule__Datatype__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3742:1: ( rule__Datatype__Group_3__0__Impl rule__Datatype__Group_3__1 )
            // InternalBSharp.g:3743:2: rule__Datatype__Group_3__0__Impl rule__Datatype__Group_3__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalBSharp.g:3750:1: rule__Datatype__Group_3__0__Impl : ( '|' ) ;
    public final void rule__Datatype__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3754:1: ( ( '|' ) )
            // InternalBSharp.g:3755:1: ( '|' )
            {
            // InternalBSharp.g:3755:1: ( '|' )
            // InternalBSharp.g:3756:2: '|'
            {
             before(grammarAccess.getDatatypeAccess().getVerticalLineKeyword_3_0()); 
            match(input,45,FOLLOW_2); 
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
    // InternalBSharp.g:3765:1: rule__Datatype__Group_3__1 : rule__Datatype__Group_3__1__Impl ;
    public final void rule__Datatype__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3769:1: ( rule__Datatype__Group_3__1__Impl )
            // InternalBSharp.g:3770:2: rule__Datatype__Group_3__1__Impl
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
    // InternalBSharp.g:3776:1: rule__Datatype__Group_3__1__Impl : ( ( rule__Datatype__ConstructorsAssignment_3_1 ) ) ;
    public final void rule__Datatype__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3780:1: ( ( ( rule__Datatype__ConstructorsAssignment_3_1 ) ) )
            // InternalBSharp.g:3781:1: ( ( rule__Datatype__ConstructorsAssignment_3_1 ) )
            {
            // InternalBSharp.g:3781:1: ( ( rule__Datatype__ConstructorsAssignment_3_1 ) )
            // InternalBSharp.g:3782:2: ( rule__Datatype__ConstructorsAssignment_3_1 )
            {
             before(grammarAccess.getDatatypeAccess().getConstructorsAssignment_3_1()); 
            // InternalBSharp.g:3783:2: ( rule__Datatype__ConstructorsAssignment_3_1 )
            // InternalBSharp.g:3783:3: rule__Datatype__ConstructorsAssignment_3_1
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
    // InternalBSharp.g:3792:1: rule__DatatypeConstructor__Group__0 : rule__DatatypeConstructor__Group__0__Impl rule__DatatypeConstructor__Group__1 ;
    public final void rule__DatatypeConstructor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3796:1: ( rule__DatatypeConstructor__Group__0__Impl rule__DatatypeConstructor__Group__1 )
            // InternalBSharp.g:3797:2: rule__DatatypeConstructor__Group__0__Impl rule__DatatypeConstructor__Group__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalBSharp.g:3804:1: rule__DatatypeConstructor__Group__0__Impl : ( ( rule__DatatypeConstructor__NameAssignment_0 ) ) ;
    public final void rule__DatatypeConstructor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3808:1: ( ( ( rule__DatatypeConstructor__NameAssignment_0 ) ) )
            // InternalBSharp.g:3809:1: ( ( rule__DatatypeConstructor__NameAssignment_0 ) )
            {
            // InternalBSharp.g:3809:1: ( ( rule__DatatypeConstructor__NameAssignment_0 ) )
            // InternalBSharp.g:3810:2: ( rule__DatatypeConstructor__NameAssignment_0 )
            {
             before(grammarAccess.getDatatypeConstructorAccess().getNameAssignment_0()); 
            // InternalBSharp.g:3811:2: ( rule__DatatypeConstructor__NameAssignment_0 )
            // InternalBSharp.g:3811:3: rule__DatatypeConstructor__NameAssignment_0
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
    // InternalBSharp.g:3819:1: rule__DatatypeConstructor__Group__1 : rule__DatatypeConstructor__Group__1__Impl ;
    public final void rule__DatatypeConstructor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3823:1: ( rule__DatatypeConstructor__Group__1__Impl )
            // InternalBSharp.g:3824:2: rule__DatatypeConstructor__Group__1__Impl
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
    // InternalBSharp.g:3830:1: rule__DatatypeConstructor__Group__1__Impl : ( ( rule__DatatypeConstructor__Group_1__0 )? ) ;
    public final void rule__DatatypeConstructor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3834:1: ( ( ( rule__DatatypeConstructor__Group_1__0 )? ) )
            // InternalBSharp.g:3835:1: ( ( rule__DatatypeConstructor__Group_1__0 )? )
            {
            // InternalBSharp.g:3835:1: ( ( rule__DatatypeConstructor__Group_1__0 )? )
            // InternalBSharp.g:3836:2: ( rule__DatatypeConstructor__Group_1__0 )?
            {
             before(grammarAccess.getDatatypeConstructorAccess().getGroup_1()); 
            // InternalBSharp.g:3837:2: ( rule__DatatypeConstructor__Group_1__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==41) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalBSharp.g:3837:3: rule__DatatypeConstructor__Group_1__0
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
    // InternalBSharp.g:3846:1: rule__DatatypeConstructor__Group_1__0 : rule__DatatypeConstructor__Group_1__0__Impl rule__DatatypeConstructor__Group_1__1 ;
    public final void rule__DatatypeConstructor__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3850:1: ( rule__DatatypeConstructor__Group_1__0__Impl rule__DatatypeConstructor__Group_1__1 )
            // InternalBSharp.g:3851:2: rule__DatatypeConstructor__Group_1__0__Impl rule__DatatypeConstructor__Group_1__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalBSharp.g:3858:1: rule__DatatypeConstructor__Group_1__0__Impl : ( '(' ) ;
    public final void rule__DatatypeConstructor__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3862:1: ( ( '(' ) )
            // InternalBSharp.g:3863:1: ( '(' )
            {
            // InternalBSharp.g:3863:1: ( '(' )
            // InternalBSharp.g:3864:2: '('
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
    // InternalBSharp.g:3873:1: rule__DatatypeConstructor__Group_1__1 : rule__DatatypeConstructor__Group_1__1__Impl rule__DatatypeConstructor__Group_1__2 ;
    public final void rule__DatatypeConstructor__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3877:1: ( rule__DatatypeConstructor__Group_1__1__Impl rule__DatatypeConstructor__Group_1__2 )
            // InternalBSharp.g:3878:2: rule__DatatypeConstructor__Group_1__1__Impl rule__DatatypeConstructor__Group_1__2
            {
            pushFollow(FOLLOW_23);
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
    // InternalBSharp.g:3885:1: rule__DatatypeConstructor__Group_1__1__Impl : ( ( rule__DatatypeConstructor__DeconsAssignment_1_1 ) ) ;
    public final void rule__DatatypeConstructor__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3889:1: ( ( ( rule__DatatypeConstructor__DeconsAssignment_1_1 ) ) )
            // InternalBSharp.g:3890:1: ( ( rule__DatatypeConstructor__DeconsAssignment_1_1 ) )
            {
            // InternalBSharp.g:3890:1: ( ( rule__DatatypeConstructor__DeconsAssignment_1_1 ) )
            // InternalBSharp.g:3891:2: ( rule__DatatypeConstructor__DeconsAssignment_1_1 )
            {
             before(grammarAccess.getDatatypeConstructorAccess().getDeconsAssignment_1_1()); 
            // InternalBSharp.g:3892:2: ( rule__DatatypeConstructor__DeconsAssignment_1_1 )
            // InternalBSharp.g:3892:3: rule__DatatypeConstructor__DeconsAssignment_1_1
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
    // InternalBSharp.g:3900:1: rule__DatatypeConstructor__Group_1__2 : rule__DatatypeConstructor__Group_1__2__Impl ;
    public final void rule__DatatypeConstructor__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3904:1: ( rule__DatatypeConstructor__Group_1__2__Impl )
            // InternalBSharp.g:3905:2: rule__DatatypeConstructor__Group_1__2__Impl
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
    // InternalBSharp.g:3911:1: rule__DatatypeConstructor__Group_1__2__Impl : ( ')' ) ;
    public final void rule__DatatypeConstructor__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3915:1: ( ( ')' ) )
            // InternalBSharp.g:3916:1: ( ')' )
            {
            // InternalBSharp.g:3916:1: ( ')' )
            // InternalBSharp.g:3917:2: ')'
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
    // InternalBSharp.g:3927:1: rule__Extend__Group__0 : rule__Extend__Group__0__Impl rule__Extend__Group__1 ;
    public final void rule__Extend__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3931:1: ( rule__Extend__Group__0__Impl rule__Extend__Group__1 )
            // InternalBSharp.g:3932:2: rule__Extend__Group__0__Impl rule__Extend__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalBSharp.g:3939:1: rule__Extend__Group__0__Impl : ( 'Extend' ) ;
    public final void rule__Extend__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3943:1: ( ( 'Extend' ) )
            // InternalBSharp.g:3944:1: ( 'Extend' )
            {
            // InternalBSharp.g:3944:1: ( 'Extend' )
            // InternalBSharp.g:3945:2: 'Extend'
            {
             before(grammarAccess.getExtendAccess().getExtendKeyword_0()); 
            match(input,46,FOLLOW_2); 
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
    // InternalBSharp.g:3954:1: rule__Extend__Group__1 : rule__Extend__Group__1__Impl rule__Extend__Group__2 ;
    public final void rule__Extend__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3958:1: ( rule__Extend__Group__1__Impl rule__Extend__Group__2 )
            // InternalBSharp.g:3959:2: rule__Extend__Group__1__Impl rule__Extend__Group__2
            {
            pushFollow(FOLLOW_31);
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
    // InternalBSharp.g:3966:1: rule__Extend__Group__1__Impl : ( ( rule__Extend__ExtendedClassAssignment_1 ) ) ;
    public final void rule__Extend__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3970:1: ( ( ( rule__Extend__ExtendedClassAssignment_1 ) ) )
            // InternalBSharp.g:3971:1: ( ( rule__Extend__ExtendedClassAssignment_1 ) )
            {
            // InternalBSharp.g:3971:1: ( ( rule__Extend__ExtendedClassAssignment_1 ) )
            // InternalBSharp.g:3972:2: ( rule__Extend__ExtendedClassAssignment_1 )
            {
             before(grammarAccess.getExtendAccess().getExtendedClassAssignment_1()); 
            // InternalBSharp.g:3973:2: ( rule__Extend__ExtendedClassAssignment_1 )
            // InternalBSharp.g:3973:3: rule__Extend__ExtendedClassAssignment_1
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
    // InternalBSharp.g:3981:1: rule__Extend__Group__2 : rule__Extend__Group__2__Impl rule__Extend__Group__3 ;
    public final void rule__Extend__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3985:1: ( rule__Extend__Group__2__Impl rule__Extend__Group__3 )
            // InternalBSharp.g:3986:2: rule__Extend__Group__2__Impl rule__Extend__Group__3
            {
            pushFollow(FOLLOW_4);
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
    // InternalBSharp.g:3993:1: rule__Extend__Group__2__Impl : ( '(' ) ;
    public final void rule__Extend__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3997:1: ( ( '(' ) )
            // InternalBSharp.g:3998:1: ( '(' )
            {
            // InternalBSharp.g:3998:1: ( '(' )
            // InternalBSharp.g:3999:2: '('
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
    // InternalBSharp.g:4008:1: rule__Extend__Group__3 : rule__Extend__Group__3__Impl rule__Extend__Group__4 ;
    public final void rule__Extend__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4012:1: ( rule__Extend__Group__3__Impl rule__Extend__Group__4 )
            // InternalBSharp.g:4013:2: rule__Extend__Group__3__Impl rule__Extend__Group__4
            {
            pushFollow(FOLLOW_23);
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
    // InternalBSharp.g:4020:1: rule__Extend__Group__3__Impl : ( ( rule__Extend__NameAssignment_3 ) ) ;
    public final void rule__Extend__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4024:1: ( ( ( rule__Extend__NameAssignment_3 ) ) )
            // InternalBSharp.g:4025:1: ( ( rule__Extend__NameAssignment_3 ) )
            {
            // InternalBSharp.g:4025:1: ( ( rule__Extend__NameAssignment_3 ) )
            // InternalBSharp.g:4026:2: ( rule__Extend__NameAssignment_3 )
            {
             before(grammarAccess.getExtendAccess().getNameAssignment_3()); 
            // InternalBSharp.g:4027:2: ( rule__Extend__NameAssignment_3 )
            // InternalBSharp.g:4027:3: rule__Extend__NameAssignment_3
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
    // InternalBSharp.g:4035:1: rule__Extend__Group__4 : rule__Extend__Group__4__Impl rule__Extend__Group__5 ;
    public final void rule__Extend__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4039:1: ( rule__Extend__Group__4__Impl rule__Extend__Group__5 )
            // InternalBSharp.g:4040:2: rule__Extend__Group__4__Impl rule__Extend__Group__5
            {
            pushFollow(FOLLOW_15);
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
    // InternalBSharp.g:4047:1: rule__Extend__Group__4__Impl : ( ')' ) ;
    public final void rule__Extend__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4051:1: ( ( ')' ) )
            // InternalBSharp.g:4052:1: ( ')' )
            {
            // InternalBSharp.g:4052:1: ( ')' )
            // InternalBSharp.g:4053:2: ')'
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
    // InternalBSharp.g:4062:1: rule__Extend__Group__5 : rule__Extend__Group__5__Impl ;
    public final void rule__Extend__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4066:1: ( rule__Extend__Group__5__Impl )
            // InternalBSharp.g:4067:2: rule__Extend__Group__5__Impl
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
    // InternalBSharp.g:4073:1: rule__Extend__Group__5__Impl : ( ( rule__Extend__BlockAssignment_5 ) ) ;
    public final void rule__Extend__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4077:1: ( ( ( rule__Extend__BlockAssignment_5 ) ) )
            // InternalBSharp.g:4078:1: ( ( rule__Extend__BlockAssignment_5 ) )
            {
            // InternalBSharp.g:4078:1: ( ( rule__Extend__BlockAssignment_5 ) )
            // InternalBSharp.g:4079:2: ( rule__Extend__BlockAssignment_5 )
            {
             before(grammarAccess.getExtendAccess().getBlockAssignment_5()); 
            // InternalBSharp.g:4080:2: ( rule__Extend__BlockAssignment_5 )
            // InternalBSharp.g:4080:3: rule__Extend__BlockAssignment_5
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
    // InternalBSharp.g:4089:1: rule__BSharpBlock__Group__0 : rule__BSharpBlock__Group__0__Impl rule__BSharpBlock__Group__1 ;
    public final void rule__BSharpBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4093:1: ( rule__BSharpBlock__Group__0__Impl rule__BSharpBlock__Group__1 )
            // InternalBSharp.g:4094:2: rule__BSharpBlock__Group__0__Impl rule__BSharpBlock__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalBSharp.g:4101:1: rule__BSharpBlock__Group__0__Impl : ( () ) ;
    public final void rule__BSharpBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4105:1: ( ( () ) )
            // InternalBSharp.g:4106:1: ( () )
            {
            // InternalBSharp.g:4106:1: ( () )
            // InternalBSharp.g:4107:2: ()
            {
             before(grammarAccess.getBSharpBlockAccess().getBSharpBlockAction_0()); 
            // InternalBSharp.g:4108:2: ()
            // InternalBSharp.g:4108:3: 
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
    // InternalBSharp.g:4116:1: rule__BSharpBlock__Group__1 : rule__BSharpBlock__Group__1__Impl rule__BSharpBlock__Group__2 ;
    public final void rule__BSharpBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4120:1: ( rule__BSharpBlock__Group__1__Impl rule__BSharpBlock__Group__2 )
            // InternalBSharp.g:4121:2: rule__BSharpBlock__Group__1__Impl rule__BSharpBlock__Group__2
            {
            pushFollow(FOLLOW_32);
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
    // InternalBSharp.g:4128:1: rule__BSharpBlock__Group__1__Impl : ( '{' ) ;
    public final void rule__BSharpBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4132:1: ( ( '{' ) )
            // InternalBSharp.g:4133:1: ( '{' )
            {
            // InternalBSharp.g:4133:1: ( '{' )
            // InternalBSharp.g:4134:2: '{'
            {
             before(grammarAccess.getBSharpBlockAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,47,FOLLOW_2); 
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
    // InternalBSharp.g:4143:1: rule__BSharpBlock__Group__2 : rule__BSharpBlock__Group__2__Impl rule__BSharpBlock__Group__3 ;
    public final void rule__BSharpBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4147:1: ( rule__BSharpBlock__Group__2__Impl rule__BSharpBlock__Group__3 )
            // InternalBSharp.g:4148:2: rule__BSharpBlock__Group__2__Impl rule__BSharpBlock__Group__3
            {
            pushFollow(FOLLOW_32);
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
    // InternalBSharp.g:4155:1: rule__BSharpBlock__Group__2__Impl : ( ( rule__BSharpBlock__BodyElementsAssignment_2 )* ) ;
    public final void rule__BSharpBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4159:1: ( ( ( rule__BSharpBlock__BodyElementsAssignment_2 )* ) )
            // InternalBSharp.g:4160:1: ( ( rule__BSharpBlock__BodyElementsAssignment_2 )* )
            {
            // InternalBSharp.g:4160:1: ( ( rule__BSharpBlock__BodyElementsAssignment_2 )* )
            // InternalBSharp.g:4161:2: ( rule__BSharpBlock__BodyElementsAssignment_2 )*
            {
             before(grammarAccess.getBSharpBlockAccess().getBodyElementsAssignment_2()); 
            // InternalBSharp.g:4162:2: ( rule__BSharpBlock__BodyElementsAssignment_2 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==RULE_ID||LA41_0==50) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalBSharp.g:4162:3: rule__BSharpBlock__BodyElementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__BSharpBlock__BodyElementsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

             after(grammarAccess.getBSharpBlockAccess().getBodyElementsAssignment_2()); 

            }


            }

        }
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
    // InternalBSharp.g:4170:1: rule__BSharpBlock__Group__3 : rule__BSharpBlock__Group__3__Impl ;
    public final void rule__BSharpBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4174:1: ( rule__BSharpBlock__Group__3__Impl )
            // InternalBSharp.g:4175:2: rule__BSharpBlock__Group__3__Impl
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
    // InternalBSharp.g:4181:1: rule__BSharpBlock__Group__3__Impl : ( '}' ) ;
    public final void rule__BSharpBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4185:1: ( ( '}' ) )
            // InternalBSharp.g:4186:1: ( '}' )
            {
            // InternalBSharp.g:4186:1: ( '}' )
            // InternalBSharp.g:4187:2: '}'
            {
             before(grammarAccess.getBSharpBlockAccess().getRightCurlyBracketKeyword_3()); 
            match(input,48,FOLLOW_2); 
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
    // InternalBSharp.g:4197:1: rule__FunctionDecl__Group__0 : rule__FunctionDecl__Group__0__Impl rule__FunctionDecl__Group__1 ;
    public final void rule__FunctionDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4201:1: ( rule__FunctionDecl__Group__0__Impl rule__FunctionDecl__Group__1 )
            // InternalBSharp.g:4202:2: rule__FunctionDecl__Group__0__Impl rule__FunctionDecl__Group__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalBSharp.g:4209:1: rule__FunctionDecl__Group__0__Impl : ( ( rule__FunctionDecl__NameAssignment_0 ) ) ;
    public final void rule__FunctionDecl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4213:1: ( ( ( rule__FunctionDecl__NameAssignment_0 ) ) )
            // InternalBSharp.g:4214:1: ( ( rule__FunctionDecl__NameAssignment_0 ) )
            {
            // InternalBSharp.g:4214:1: ( ( rule__FunctionDecl__NameAssignment_0 ) )
            // InternalBSharp.g:4215:2: ( rule__FunctionDecl__NameAssignment_0 )
            {
             before(grammarAccess.getFunctionDeclAccess().getNameAssignment_0()); 
            // InternalBSharp.g:4216:2: ( rule__FunctionDecl__NameAssignment_0 )
            // InternalBSharp.g:4216:3: rule__FunctionDecl__NameAssignment_0
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
    // InternalBSharp.g:4224:1: rule__FunctionDecl__Group__1 : rule__FunctionDecl__Group__1__Impl rule__FunctionDecl__Group__2 ;
    public final void rule__FunctionDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4228:1: ( rule__FunctionDecl__Group__1__Impl rule__FunctionDecl__Group__2 )
            // InternalBSharp.g:4229:2: rule__FunctionDecl__Group__1__Impl rule__FunctionDecl__Group__2
            {
            pushFollow(FOLLOW_34);
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
    // InternalBSharp.g:4236:1: rule__FunctionDecl__Group__1__Impl : ( ( rule__FunctionDecl__ContextAssignment_1 )? ) ;
    public final void rule__FunctionDecl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4240:1: ( ( ( rule__FunctionDecl__ContextAssignment_1 )? ) )
            // InternalBSharp.g:4241:1: ( ( rule__FunctionDecl__ContextAssignment_1 )? )
            {
            // InternalBSharp.g:4241:1: ( ( rule__FunctionDecl__ContextAssignment_1 )? )
            // InternalBSharp.g:4242:2: ( rule__FunctionDecl__ContextAssignment_1 )?
            {
             before(grammarAccess.getFunctionDeclAccess().getContextAssignment_1()); 
            // InternalBSharp.g:4243:2: ( rule__FunctionDecl__ContextAssignment_1 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==38) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalBSharp.g:4243:3: rule__FunctionDecl__ContextAssignment_1
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
    // InternalBSharp.g:4251:1: rule__FunctionDecl__Group__2 : rule__FunctionDecl__Group__2__Impl rule__FunctionDecl__Group__3 ;
    public final void rule__FunctionDecl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4255:1: ( rule__FunctionDecl__Group__2__Impl rule__FunctionDecl__Group__3 )
            // InternalBSharp.g:4256:2: rule__FunctionDecl__Group__2__Impl rule__FunctionDecl__Group__3
            {
            pushFollow(FOLLOW_35);
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
    // InternalBSharp.g:4263:1: rule__FunctionDecl__Group__2__Impl : ( '(' ) ;
    public final void rule__FunctionDecl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4267:1: ( ( '(' ) )
            // InternalBSharp.g:4268:1: ( '(' )
            {
            // InternalBSharp.g:4268:1: ( '(' )
            // InternalBSharp.g:4269:2: '('
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
    // InternalBSharp.g:4278:1: rule__FunctionDecl__Group__3 : rule__FunctionDecl__Group__3__Impl rule__FunctionDecl__Group__4 ;
    public final void rule__FunctionDecl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4282:1: ( rule__FunctionDecl__Group__3__Impl rule__FunctionDecl__Group__4 )
            // InternalBSharp.g:4283:2: rule__FunctionDecl__Group__3__Impl rule__FunctionDecl__Group__4
            {
            pushFollow(FOLLOW_35);
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
    // InternalBSharp.g:4290:1: rule__FunctionDecl__Group__3__Impl : ( ( rule__FunctionDecl__VarListAssignment_3 )? ) ;
    public final void rule__FunctionDecl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4294:1: ( ( ( rule__FunctionDecl__VarListAssignment_3 )? ) )
            // InternalBSharp.g:4295:1: ( ( rule__FunctionDecl__VarListAssignment_3 )? )
            {
            // InternalBSharp.g:4295:1: ( ( rule__FunctionDecl__VarListAssignment_3 )? )
            // InternalBSharp.g:4296:2: ( rule__FunctionDecl__VarListAssignment_3 )?
            {
             before(grammarAccess.getFunctionDeclAccess().getVarListAssignment_3()); 
            // InternalBSharp.g:4297:2: ( rule__FunctionDecl__VarListAssignment_3 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_ID) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalBSharp.g:4297:3: rule__FunctionDecl__VarListAssignment_3
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
    // InternalBSharp.g:4305:1: rule__FunctionDecl__Group__4 : rule__FunctionDecl__Group__4__Impl rule__FunctionDecl__Group__5 ;
    public final void rule__FunctionDecl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4309:1: ( rule__FunctionDecl__Group__4__Impl rule__FunctionDecl__Group__5 )
            // InternalBSharp.g:4310:2: rule__FunctionDecl__Group__4__Impl rule__FunctionDecl__Group__5
            {
            pushFollow(FOLLOW_6);
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
    // InternalBSharp.g:4317:1: rule__FunctionDecl__Group__4__Impl : ( ')' ) ;
    public final void rule__FunctionDecl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4321:1: ( ( ')' ) )
            // InternalBSharp.g:4322:1: ( ')' )
            {
            // InternalBSharp.g:4322:1: ( ')' )
            // InternalBSharp.g:4323:2: ')'
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
    // InternalBSharp.g:4332:1: rule__FunctionDecl__Group__5 : rule__FunctionDecl__Group__5__Impl rule__FunctionDecl__Group__6 ;
    public final void rule__FunctionDecl__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4336:1: ( rule__FunctionDecl__Group__5__Impl rule__FunctionDecl__Group__6 )
            // InternalBSharp.g:4337:2: rule__FunctionDecl__Group__5__Impl rule__FunctionDecl__Group__6
            {
            pushFollow(FOLLOW_4);
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
    // InternalBSharp.g:4344:1: rule__FunctionDecl__Group__5__Impl : ( ':' ) ;
    public final void rule__FunctionDecl__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4348:1: ( ( ':' ) )
            // InternalBSharp.g:4349:1: ( ':' )
            {
            // InternalBSharp.g:4349:1: ( ':' )
            // InternalBSharp.g:4350:2: ':'
            {
             before(grammarAccess.getFunctionDeclAccess().getColonKeyword_5()); 
            match(input,32,FOLLOW_2); 
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
    // InternalBSharp.g:4359:1: rule__FunctionDecl__Group__6 : rule__FunctionDecl__Group__6__Impl rule__FunctionDecl__Group__7 ;
    public final void rule__FunctionDecl__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4363:1: ( rule__FunctionDecl__Group__6__Impl rule__FunctionDecl__Group__7 )
            // InternalBSharp.g:4364:2: rule__FunctionDecl__Group__6__Impl rule__FunctionDecl__Group__7
            {
            pushFollow(FOLLOW_36);
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
    // InternalBSharp.g:4371:1: rule__FunctionDecl__Group__6__Impl : ( ( rule__FunctionDecl__ReturnTypeAssignment_6 ) ) ;
    public final void rule__FunctionDecl__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4375:1: ( ( ( rule__FunctionDecl__ReturnTypeAssignment_6 ) ) )
            // InternalBSharp.g:4376:1: ( ( rule__FunctionDecl__ReturnTypeAssignment_6 ) )
            {
            // InternalBSharp.g:4376:1: ( ( rule__FunctionDecl__ReturnTypeAssignment_6 ) )
            // InternalBSharp.g:4377:2: ( rule__FunctionDecl__ReturnTypeAssignment_6 )
            {
             before(grammarAccess.getFunctionDeclAccess().getReturnTypeAssignment_6()); 
            // InternalBSharp.g:4378:2: ( rule__FunctionDecl__ReturnTypeAssignment_6 )
            // InternalBSharp.g:4378:3: rule__FunctionDecl__ReturnTypeAssignment_6
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
    // InternalBSharp.g:4386:1: rule__FunctionDecl__Group__7 : rule__FunctionDecl__Group__7__Impl rule__FunctionDecl__Group__8 ;
    public final void rule__FunctionDecl__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4390:1: ( rule__FunctionDecl__Group__7__Impl rule__FunctionDecl__Group__8 )
            // InternalBSharp.g:4391:2: rule__FunctionDecl__Group__7__Impl rule__FunctionDecl__Group__8
            {
            pushFollow(FOLLOW_36);
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
    // InternalBSharp.g:4398:1: rule__FunctionDecl__Group__7__Impl : ( ( rule__FunctionDecl__InfixAssignment_7 )? ) ;
    public final void rule__FunctionDecl__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4402:1: ( ( ( rule__FunctionDecl__InfixAssignment_7 )? ) )
            // InternalBSharp.g:4403:1: ( ( rule__FunctionDecl__InfixAssignment_7 )? )
            {
            // InternalBSharp.g:4403:1: ( ( rule__FunctionDecl__InfixAssignment_7 )? )
            // InternalBSharp.g:4404:2: ( rule__FunctionDecl__InfixAssignment_7 )?
            {
             before(grammarAccess.getFunctionDeclAccess().getInfixAssignment_7()); 
            // InternalBSharp.g:4405:2: ( rule__FunctionDecl__InfixAssignment_7 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==53) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalBSharp.g:4405:3: rule__FunctionDecl__InfixAssignment_7
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
    // InternalBSharp.g:4413:1: rule__FunctionDecl__Group__8 : rule__FunctionDecl__Group__8__Impl rule__FunctionDecl__Group__9 ;
    public final void rule__FunctionDecl__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4417:1: ( rule__FunctionDecl__Group__8__Impl rule__FunctionDecl__Group__9 )
            // InternalBSharp.g:4418:2: rule__FunctionDecl__Group__8__Impl rule__FunctionDecl__Group__9
            {
            pushFollow(FOLLOW_36);
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
    // InternalBSharp.g:4425:1: rule__FunctionDecl__Group__8__Impl : ( ( rule__FunctionDecl__PrecedenceAssignment_8 )? ) ;
    public final void rule__FunctionDecl__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4429:1: ( ( ( rule__FunctionDecl__PrecedenceAssignment_8 )? ) )
            // InternalBSharp.g:4430:1: ( ( rule__FunctionDecl__PrecedenceAssignment_8 )? )
            {
            // InternalBSharp.g:4430:1: ( ( rule__FunctionDecl__PrecedenceAssignment_8 )? )
            // InternalBSharp.g:4431:2: ( rule__FunctionDecl__PrecedenceAssignment_8 )?
            {
             before(grammarAccess.getFunctionDeclAccess().getPrecedenceAssignment_8()); 
            // InternalBSharp.g:4432:2: ( rule__FunctionDecl__PrecedenceAssignment_8 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_INT) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalBSharp.g:4432:3: rule__FunctionDecl__PrecedenceAssignment_8
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
    // InternalBSharp.g:4440:1: rule__FunctionDecl__Group__9 : rule__FunctionDecl__Group__9__Impl ;
    public final void rule__FunctionDecl__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4444:1: ( rule__FunctionDecl__Group__9__Impl )
            // InternalBSharp.g:4445:2: rule__FunctionDecl__Group__9__Impl
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
    // InternalBSharp.g:4451:1: rule__FunctionDecl__Group__9__Impl : ( ( rule__FunctionDecl__ExprAssignment_9 ) ) ;
    public final void rule__FunctionDecl__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4455:1: ( ( ( rule__FunctionDecl__ExprAssignment_9 ) ) )
            // InternalBSharp.g:4456:1: ( ( rule__FunctionDecl__ExprAssignment_9 ) )
            {
            // InternalBSharp.g:4456:1: ( ( rule__FunctionDecl__ExprAssignment_9 ) )
            // InternalBSharp.g:4457:2: ( rule__FunctionDecl__ExprAssignment_9 )
            {
             before(grammarAccess.getFunctionDeclAccess().getExprAssignment_9()); 
            // InternalBSharp.g:4458:2: ( rule__FunctionDecl__ExprAssignment_9 )
            // InternalBSharp.g:4458:3: rule__FunctionDecl__ExprAssignment_9
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
    // InternalBSharp.g:4467:1: rule__MatchStatement__Group__0 : rule__MatchStatement__Group__0__Impl rule__MatchStatement__Group__1 ;
    public final void rule__MatchStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4471:1: ( rule__MatchStatement__Group__0__Impl rule__MatchStatement__Group__1 )
            // InternalBSharp.g:4472:2: rule__MatchStatement__Group__0__Impl rule__MatchStatement__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalBSharp.g:4479:1: rule__MatchStatement__Group__0__Impl : ( 'match' ) ;
    public final void rule__MatchStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4483:1: ( ( 'match' ) )
            // InternalBSharp.g:4484:1: ( 'match' )
            {
            // InternalBSharp.g:4484:1: ( 'match' )
            // InternalBSharp.g:4485:2: 'match'
            {
             before(grammarAccess.getMatchStatementAccess().getMatchKeyword_0()); 
            match(input,49,FOLLOW_2); 
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
    // InternalBSharp.g:4494:1: rule__MatchStatement__Group__1 : rule__MatchStatement__Group__1__Impl rule__MatchStatement__Group__2 ;
    public final void rule__MatchStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4498:1: ( rule__MatchStatement__Group__1__Impl rule__MatchStatement__Group__2 )
            // InternalBSharp.g:4499:2: rule__MatchStatement__Group__1__Impl rule__MatchStatement__Group__2
            {
            pushFollow(FOLLOW_37);
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
    // InternalBSharp.g:4506:1: rule__MatchStatement__Group__1__Impl : ( ( rule__MatchStatement__MatchAssignment_1 ) ) ;
    public final void rule__MatchStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4510:1: ( ( ( rule__MatchStatement__MatchAssignment_1 ) ) )
            // InternalBSharp.g:4511:1: ( ( rule__MatchStatement__MatchAssignment_1 ) )
            {
            // InternalBSharp.g:4511:1: ( ( rule__MatchStatement__MatchAssignment_1 ) )
            // InternalBSharp.g:4512:2: ( rule__MatchStatement__MatchAssignment_1 )
            {
             before(grammarAccess.getMatchStatementAccess().getMatchAssignment_1()); 
            // InternalBSharp.g:4513:2: ( rule__MatchStatement__MatchAssignment_1 )
            // InternalBSharp.g:4513:3: rule__MatchStatement__MatchAssignment_1
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
    // InternalBSharp.g:4521:1: rule__MatchStatement__Group__2 : rule__MatchStatement__Group__2__Impl rule__MatchStatement__Group__3 ;
    public final void rule__MatchStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4525:1: ( rule__MatchStatement__Group__2__Impl rule__MatchStatement__Group__3 )
            // InternalBSharp.g:4526:2: rule__MatchStatement__Group__2__Impl rule__MatchStatement__Group__3
            {
            pushFollow(FOLLOW_38);
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
    // InternalBSharp.g:4533:1: rule__MatchStatement__Group__2__Impl : ( '{' ) ;
    public final void rule__MatchStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4537:1: ( ( '{' ) )
            // InternalBSharp.g:4538:1: ( '{' )
            {
            // InternalBSharp.g:4538:1: ( '{' )
            // InternalBSharp.g:4539:2: '{'
            {
             before(grammarAccess.getMatchStatementAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,47,FOLLOW_2); 
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
    // InternalBSharp.g:4548:1: rule__MatchStatement__Group__3 : rule__MatchStatement__Group__3__Impl rule__MatchStatement__Group__4 ;
    public final void rule__MatchStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4552:1: ( rule__MatchStatement__Group__3__Impl rule__MatchStatement__Group__4 )
            // InternalBSharp.g:4553:2: rule__MatchStatement__Group__3__Impl rule__MatchStatement__Group__4
            {
            pushFollow(FOLLOW_39);
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
    // InternalBSharp.g:4560:1: rule__MatchStatement__Group__3__Impl : ( ( rule__MatchStatement__InductCaseAssignment_3 ) ) ;
    public final void rule__MatchStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4564:1: ( ( ( rule__MatchStatement__InductCaseAssignment_3 ) ) )
            // InternalBSharp.g:4565:1: ( ( rule__MatchStatement__InductCaseAssignment_3 ) )
            {
            // InternalBSharp.g:4565:1: ( ( rule__MatchStatement__InductCaseAssignment_3 ) )
            // InternalBSharp.g:4566:2: ( rule__MatchStatement__InductCaseAssignment_3 )
            {
             before(grammarAccess.getMatchStatementAccess().getInductCaseAssignment_3()); 
            // InternalBSharp.g:4567:2: ( rule__MatchStatement__InductCaseAssignment_3 )
            // InternalBSharp.g:4567:3: rule__MatchStatement__InductCaseAssignment_3
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
    // InternalBSharp.g:4575:1: rule__MatchStatement__Group__4 : rule__MatchStatement__Group__4__Impl rule__MatchStatement__Group__5 ;
    public final void rule__MatchStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4579:1: ( rule__MatchStatement__Group__4__Impl rule__MatchStatement__Group__5 )
            // InternalBSharp.g:4580:2: rule__MatchStatement__Group__4__Impl rule__MatchStatement__Group__5
            {
            pushFollow(FOLLOW_39);
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
    // InternalBSharp.g:4587:1: rule__MatchStatement__Group__4__Impl : ( ( rule__MatchStatement__InductCaseAssignment_4 )* ) ;
    public final void rule__MatchStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4591:1: ( ( ( rule__MatchStatement__InductCaseAssignment_4 )* ) )
            // InternalBSharp.g:4592:1: ( ( rule__MatchStatement__InductCaseAssignment_4 )* )
            {
            // InternalBSharp.g:4592:1: ( ( rule__MatchStatement__InductCaseAssignment_4 )* )
            // InternalBSharp.g:4593:2: ( rule__MatchStatement__InductCaseAssignment_4 )*
            {
             before(grammarAccess.getMatchStatementAccess().getInductCaseAssignment_4()); 
            // InternalBSharp.g:4594:2: ( rule__MatchStatement__InductCaseAssignment_4 )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==45) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalBSharp.g:4594:3: rule__MatchStatement__InductCaseAssignment_4
            	    {
            	    pushFollow(FOLLOW_40);
            	    rule__MatchStatement__InductCaseAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop46;
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
    // InternalBSharp.g:4602:1: rule__MatchStatement__Group__5 : rule__MatchStatement__Group__5__Impl ;
    public final void rule__MatchStatement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4606:1: ( rule__MatchStatement__Group__5__Impl )
            // InternalBSharp.g:4607:2: rule__MatchStatement__Group__5__Impl
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
    // InternalBSharp.g:4613:1: rule__MatchStatement__Group__5__Impl : ( '}' ) ;
    public final void rule__MatchStatement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4617:1: ( ( '}' ) )
            // InternalBSharp.g:4618:1: ( '}' )
            {
            // InternalBSharp.g:4618:1: ( '}' )
            // InternalBSharp.g:4619:2: '}'
            {
             before(grammarAccess.getMatchStatementAccess().getRightCurlyBracketKeyword_5()); 
            match(input,48,FOLLOW_2); 
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
    // InternalBSharp.g:4629:1: rule__MatchCase__Group__0 : rule__MatchCase__Group__0__Impl rule__MatchCase__Group__1 ;
    public final void rule__MatchCase__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4633:1: ( rule__MatchCase__Group__0__Impl rule__MatchCase__Group__1 )
            // InternalBSharp.g:4634:2: rule__MatchCase__Group__0__Impl rule__MatchCase__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalBSharp.g:4641:1: rule__MatchCase__Group__0__Impl : ( '|' ) ;
    public final void rule__MatchCase__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4645:1: ( ( '|' ) )
            // InternalBSharp.g:4646:1: ( '|' )
            {
            // InternalBSharp.g:4646:1: ( '|' )
            // InternalBSharp.g:4647:2: '|'
            {
             before(grammarAccess.getMatchCaseAccess().getVerticalLineKeyword_0()); 
            match(input,45,FOLLOW_2); 
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
    // InternalBSharp.g:4656:1: rule__MatchCase__Group__1 : rule__MatchCase__Group__1__Impl rule__MatchCase__Group__2 ;
    public final void rule__MatchCase__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4660:1: ( rule__MatchCase__Group__1__Impl rule__MatchCase__Group__2 )
            // InternalBSharp.g:4661:2: rule__MatchCase__Group__1__Impl rule__MatchCase__Group__2
            {
            pushFollow(FOLLOW_41);
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
    // InternalBSharp.g:4668:1: rule__MatchCase__Group__1__Impl : ( ( rule__MatchCase__DeconNameAssignment_1 ) ) ;
    public final void rule__MatchCase__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4672:1: ( ( ( rule__MatchCase__DeconNameAssignment_1 ) ) )
            // InternalBSharp.g:4673:1: ( ( rule__MatchCase__DeconNameAssignment_1 ) )
            {
            // InternalBSharp.g:4673:1: ( ( rule__MatchCase__DeconNameAssignment_1 ) )
            // InternalBSharp.g:4674:2: ( rule__MatchCase__DeconNameAssignment_1 )
            {
             before(grammarAccess.getMatchCaseAccess().getDeconNameAssignment_1()); 
            // InternalBSharp.g:4675:2: ( rule__MatchCase__DeconNameAssignment_1 )
            // InternalBSharp.g:4675:3: rule__MatchCase__DeconNameAssignment_1
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
    // InternalBSharp.g:4683:1: rule__MatchCase__Group__2 : rule__MatchCase__Group__2__Impl rule__MatchCase__Group__3 ;
    public final void rule__MatchCase__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4687:1: ( rule__MatchCase__Group__2__Impl rule__MatchCase__Group__3 )
            // InternalBSharp.g:4688:2: rule__MatchCase__Group__2__Impl rule__MatchCase__Group__3
            {
            pushFollow(FOLLOW_41);
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
    // InternalBSharp.g:4695:1: rule__MatchCase__Group__2__Impl : ( ( rule__MatchCase__Group_2__0 )? ) ;
    public final void rule__MatchCase__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4699:1: ( ( ( rule__MatchCase__Group_2__0 )? ) )
            // InternalBSharp.g:4700:1: ( ( rule__MatchCase__Group_2__0 )? )
            {
            // InternalBSharp.g:4700:1: ( ( rule__MatchCase__Group_2__0 )? )
            // InternalBSharp.g:4701:2: ( rule__MatchCase__Group_2__0 )?
            {
             before(grammarAccess.getMatchCaseAccess().getGroup_2()); 
            // InternalBSharp.g:4702:2: ( rule__MatchCase__Group_2__0 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==41) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalBSharp.g:4702:3: rule__MatchCase__Group_2__0
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
    // InternalBSharp.g:4710:1: rule__MatchCase__Group__3 : rule__MatchCase__Group__3__Impl rule__MatchCase__Group__4 ;
    public final void rule__MatchCase__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4714:1: ( rule__MatchCase__Group__3__Impl rule__MatchCase__Group__4 )
            // InternalBSharp.g:4715:2: rule__MatchCase__Group__3__Impl rule__MatchCase__Group__4
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
    // InternalBSharp.g:4722:1: rule__MatchCase__Group__3__Impl : ( ':' ) ;
    public final void rule__MatchCase__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4726:1: ( ( ':' ) )
            // InternalBSharp.g:4727:1: ( ':' )
            {
            // InternalBSharp.g:4727:1: ( ':' )
            // InternalBSharp.g:4728:2: ':'
            {
             before(grammarAccess.getMatchCaseAccess().getColonKeyword_3()); 
            match(input,32,FOLLOW_2); 
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
    // InternalBSharp.g:4737:1: rule__MatchCase__Group__4 : rule__MatchCase__Group__4__Impl ;
    public final void rule__MatchCase__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4741:1: ( rule__MatchCase__Group__4__Impl )
            // InternalBSharp.g:4742:2: rule__MatchCase__Group__4__Impl
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
    // InternalBSharp.g:4748:1: rule__MatchCase__Group__4__Impl : ( ( rule__MatchCase__ExprAssignment_4 ) ) ;
    public final void rule__MatchCase__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4752:1: ( ( ( rule__MatchCase__ExprAssignment_4 ) ) )
            // InternalBSharp.g:4753:1: ( ( rule__MatchCase__ExprAssignment_4 ) )
            {
            // InternalBSharp.g:4753:1: ( ( rule__MatchCase__ExprAssignment_4 ) )
            // InternalBSharp.g:4754:2: ( rule__MatchCase__ExprAssignment_4 )
            {
             before(grammarAccess.getMatchCaseAccess().getExprAssignment_4()); 
            // InternalBSharp.g:4755:2: ( rule__MatchCase__ExprAssignment_4 )
            // InternalBSharp.g:4755:3: rule__MatchCase__ExprAssignment_4
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
    // InternalBSharp.g:4764:1: rule__MatchCase__Group_2__0 : rule__MatchCase__Group_2__0__Impl rule__MatchCase__Group_2__1 ;
    public final void rule__MatchCase__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4768:1: ( rule__MatchCase__Group_2__0__Impl rule__MatchCase__Group_2__1 )
            // InternalBSharp.g:4769:2: rule__MatchCase__Group_2__0__Impl rule__MatchCase__Group_2__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalBSharp.g:4776:1: rule__MatchCase__Group_2__0__Impl : ( '(' ) ;
    public final void rule__MatchCase__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4780:1: ( ( '(' ) )
            // InternalBSharp.g:4781:1: ( '(' )
            {
            // InternalBSharp.g:4781:1: ( '(' )
            // InternalBSharp.g:4782:2: '('
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
    // InternalBSharp.g:4791:1: rule__MatchCase__Group_2__1 : rule__MatchCase__Group_2__1__Impl rule__MatchCase__Group_2__2 ;
    public final void rule__MatchCase__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4795:1: ( rule__MatchCase__Group_2__1__Impl rule__MatchCase__Group_2__2 )
            // InternalBSharp.g:4796:2: rule__MatchCase__Group_2__1__Impl rule__MatchCase__Group_2__2
            {
            pushFollow(FOLLOW_42);
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
    // InternalBSharp.g:4803:1: rule__MatchCase__Group_2__1__Impl : ( ( rule__MatchCase__VariablesAssignment_2_1 ) ) ;
    public final void rule__MatchCase__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4807:1: ( ( ( rule__MatchCase__VariablesAssignment_2_1 ) ) )
            // InternalBSharp.g:4808:1: ( ( rule__MatchCase__VariablesAssignment_2_1 ) )
            {
            // InternalBSharp.g:4808:1: ( ( rule__MatchCase__VariablesAssignment_2_1 ) )
            // InternalBSharp.g:4809:2: ( rule__MatchCase__VariablesAssignment_2_1 )
            {
             before(grammarAccess.getMatchCaseAccess().getVariablesAssignment_2_1()); 
            // InternalBSharp.g:4810:2: ( rule__MatchCase__VariablesAssignment_2_1 )
            // InternalBSharp.g:4810:3: rule__MatchCase__VariablesAssignment_2_1
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
    // InternalBSharp.g:4818:1: rule__MatchCase__Group_2__2 : rule__MatchCase__Group_2__2__Impl rule__MatchCase__Group_2__3 ;
    public final void rule__MatchCase__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4822:1: ( rule__MatchCase__Group_2__2__Impl rule__MatchCase__Group_2__3 )
            // InternalBSharp.g:4823:2: rule__MatchCase__Group_2__2__Impl rule__MatchCase__Group_2__3
            {
            pushFollow(FOLLOW_42);
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
    // InternalBSharp.g:4830:1: rule__MatchCase__Group_2__2__Impl : ( ( rule__MatchCase__Group_2_2__0 )* ) ;
    public final void rule__MatchCase__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4834:1: ( ( ( rule__MatchCase__Group_2_2__0 )* ) )
            // InternalBSharp.g:4835:1: ( ( rule__MatchCase__Group_2_2__0 )* )
            {
            // InternalBSharp.g:4835:1: ( ( rule__MatchCase__Group_2_2__0 )* )
            // InternalBSharp.g:4836:2: ( rule__MatchCase__Group_2_2__0 )*
            {
             before(grammarAccess.getMatchCaseAccess().getGroup_2_2()); 
            // InternalBSharp.g:4837:2: ( rule__MatchCase__Group_2_2__0 )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==40) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalBSharp.g:4837:3: rule__MatchCase__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__MatchCase__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop48;
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
    // InternalBSharp.g:4845:1: rule__MatchCase__Group_2__3 : rule__MatchCase__Group_2__3__Impl ;
    public final void rule__MatchCase__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4849:1: ( rule__MatchCase__Group_2__3__Impl )
            // InternalBSharp.g:4850:2: rule__MatchCase__Group_2__3__Impl
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
    // InternalBSharp.g:4856:1: rule__MatchCase__Group_2__3__Impl : ( ')' ) ;
    public final void rule__MatchCase__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4860:1: ( ( ')' ) )
            // InternalBSharp.g:4861:1: ( ')' )
            {
            // InternalBSharp.g:4861:1: ( ')' )
            // InternalBSharp.g:4862:2: ')'
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
    // InternalBSharp.g:4872:1: rule__MatchCase__Group_2_2__0 : rule__MatchCase__Group_2_2__0__Impl rule__MatchCase__Group_2_2__1 ;
    public final void rule__MatchCase__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4876:1: ( rule__MatchCase__Group_2_2__0__Impl rule__MatchCase__Group_2_2__1 )
            // InternalBSharp.g:4877:2: rule__MatchCase__Group_2_2__0__Impl rule__MatchCase__Group_2_2__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalBSharp.g:4884:1: rule__MatchCase__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__MatchCase__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4888:1: ( ( ',' ) )
            // InternalBSharp.g:4889:1: ( ',' )
            {
            // InternalBSharp.g:4889:1: ( ',' )
            // InternalBSharp.g:4890:2: ','
            {
             before(grammarAccess.getMatchCaseAccess().getCommaKeyword_2_2_0()); 
            match(input,40,FOLLOW_2); 
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
    // InternalBSharp.g:4899:1: rule__MatchCase__Group_2_2__1 : rule__MatchCase__Group_2_2__1__Impl ;
    public final void rule__MatchCase__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4903:1: ( rule__MatchCase__Group_2_2__1__Impl )
            // InternalBSharp.g:4904:2: rule__MatchCase__Group_2_2__1__Impl
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
    // InternalBSharp.g:4910:1: rule__MatchCase__Group_2_2__1__Impl : ( ( rule__MatchCase__VariablesAssignment_2_2_1 ) ) ;
    public final void rule__MatchCase__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4914:1: ( ( ( rule__MatchCase__VariablesAssignment_2_2_1 ) ) )
            // InternalBSharp.g:4915:1: ( ( rule__MatchCase__VariablesAssignment_2_2_1 ) )
            {
            // InternalBSharp.g:4915:1: ( ( rule__MatchCase__VariablesAssignment_2_2_1 ) )
            // InternalBSharp.g:4916:2: ( rule__MatchCase__VariablesAssignment_2_2_1 )
            {
             before(grammarAccess.getMatchCaseAccess().getVariablesAssignment_2_2_1()); 
            // InternalBSharp.g:4917:2: ( rule__MatchCase__VariablesAssignment_2_2_1 )
            // InternalBSharp.g:4917:3: rule__MatchCase__VariablesAssignment_2_2_1
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
    // InternalBSharp.g:4926:1: rule__TheoremBody__Group__0 : rule__TheoremBody__Group__0__Impl rule__TheoremBody__Group__1 ;
    public final void rule__TheoremBody__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4930:1: ( rule__TheoremBody__Group__0__Impl rule__TheoremBody__Group__1 )
            // InternalBSharp.g:4931:2: rule__TheoremBody__Group__0__Impl rule__TheoremBody__Group__1
            {
            pushFollow(FOLLOW_37);
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
    // InternalBSharp.g:4938:1: rule__TheoremBody__Group__0__Impl : ( 'Theorems' ) ;
    public final void rule__TheoremBody__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4942:1: ( ( 'Theorems' ) )
            // InternalBSharp.g:4943:1: ( 'Theorems' )
            {
            // InternalBSharp.g:4943:1: ( 'Theorems' )
            // InternalBSharp.g:4944:2: 'Theorems'
            {
             before(grammarAccess.getTheoremBodyAccess().getTheoremsKeyword_0()); 
            match(input,50,FOLLOW_2); 
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
    // InternalBSharp.g:4953:1: rule__TheoremBody__Group__1 : rule__TheoremBody__Group__1__Impl rule__TheoremBody__Group__2 ;
    public final void rule__TheoremBody__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4957:1: ( rule__TheoremBody__Group__1__Impl rule__TheoremBody__Group__2 )
            // InternalBSharp.g:4958:2: rule__TheoremBody__Group__1__Impl rule__TheoremBody__Group__2
            {
            pushFollow(FOLLOW_43);
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
    // InternalBSharp.g:4965:1: rule__TheoremBody__Group__1__Impl : ( '{' ) ;
    public final void rule__TheoremBody__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4969:1: ( ( '{' ) )
            // InternalBSharp.g:4970:1: ( '{' )
            {
            // InternalBSharp.g:4970:1: ( '{' )
            // InternalBSharp.g:4971:2: '{'
            {
             before(grammarAccess.getTheoremBodyAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,47,FOLLOW_2); 
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
    // InternalBSharp.g:4980:1: rule__TheoremBody__Group__2 : rule__TheoremBody__Group__2__Impl rule__TheoremBody__Group__3 ;
    public final void rule__TheoremBody__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4984:1: ( rule__TheoremBody__Group__2__Impl rule__TheoremBody__Group__3 )
            // InternalBSharp.g:4985:2: rule__TheoremBody__Group__2__Impl rule__TheoremBody__Group__3
            {
            pushFollow(FOLLOW_44);
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
    // InternalBSharp.g:4992:1: rule__TheoremBody__Group__2__Impl : ( ( ( rule__TheoremBody__TheoremDeclAssignment_2 ) ) ( ( rule__TheoremBody__TheoremDeclAssignment_2 )* ) ) ;
    public final void rule__TheoremBody__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4996:1: ( ( ( ( rule__TheoremBody__TheoremDeclAssignment_2 ) ) ( ( rule__TheoremBody__TheoremDeclAssignment_2 )* ) ) )
            // InternalBSharp.g:4997:1: ( ( ( rule__TheoremBody__TheoremDeclAssignment_2 ) ) ( ( rule__TheoremBody__TheoremDeclAssignment_2 )* ) )
            {
            // InternalBSharp.g:4997:1: ( ( ( rule__TheoremBody__TheoremDeclAssignment_2 ) ) ( ( rule__TheoremBody__TheoremDeclAssignment_2 )* ) )
            // InternalBSharp.g:4998:2: ( ( rule__TheoremBody__TheoremDeclAssignment_2 ) ) ( ( rule__TheoremBody__TheoremDeclAssignment_2 )* )
            {
            // InternalBSharp.g:4998:2: ( ( rule__TheoremBody__TheoremDeclAssignment_2 ) )
            // InternalBSharp.g:4999:3: ( rule__TheoremBody__TheoremDeclAssignment_2 )
            {
             before(grammarAccess.getTheoremBodyAccess().getTheoremDeclAssignment_2()); 
            // InternalBSharp.g:5000:3: ( rule__TheoremBody__TheoremDeclAssignment_2 )
            // InternalBSharp.g:5000:4: rule__TheoremBody__TheoremDeclAssignment_2
            {
            pushFollow(FOLLOW_7);
            rule__TheoremBody__TheoremDeclAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTheoremBodyAccess().getTheoremDeclAssignment_2()); 

            }

            // InternalBSharp.g:5003:2: ( ( rule__TheoremBody__TheoremDeclAssignment_2 )* )
            // InternalBSharp.g:5004:3: ( rule__TheoremBody__TheoremDeclAssignment_2 )*
            {
             before(grammarAccess.getTheoremBodyAccess().getTheoremDeclAssignment_2()); 
            // InternalBSharp.g:5005:3: ( rule__TheoremBody__TheoremDeclAssignment_2 )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( ((LA49_0>=RULE_INT && LA49_0<=RULE_WS)||LA49_0==32) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalBSharp.g:5005:4: rule__TheoremBody__TheoremDeclAssignment_2
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__TheoremBody__TheoremDeclAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop49;
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
    // InternalBSharp.g:5014:1: rule__TheoremBody__Group__3 : rule__TheoremBody__Group__3__Impl ;
    public final void rule__TheoremBody__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5018:1: ( rule__TheoremBody__Group__3__Impl )
            // InternalBSharp.g:5019:2: rule__TheoremBody__Group__3__Impl
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
    // InternalBSharp.g:5025:1: rule__TheoremBody__Group__3__Impl : ( '}' ) ;
    public final void rule__TheoremBody__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5029:1: ( ( '}' ) )
            // InternalBSharp.g:5030:1: ( '}' )
            {
            // InternalBSharp.g:5030:1: ( '}' )
            // InternalBSharp.g:5031:2: '}'
            {
             before(grammarAccess.getTheoremBodyAccess().getRightCurlyBracketKeyword_3()); 
            match(input,48,FOLLOW_2); 
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
    // InternalBSharp.g:5041:1: rule__TheoremDecl__Group__0 : rule__TheoremDecl__Group__0__Impl rule__TheoremDecl__Group__1 ;
    public final void rule__TheoremDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5045:1: ( rule__TheoremDecl__Group__0__Impl rule__TheoremDecl__Group__1 )
            // InternalBSharp.g:5046:2: rule__TheoremDecl__Group__0__Impl rule__TheoremDecl__Group__1
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
    // InternalBSharp.g:5053:1: rule__TheoremDecl__Group__0__Impl : ( ( rule__TheoremDecl__NameAssignment_0 ) ) ;
    public final void rule__TheoremDecl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5057:1: ( ( ( rule__TheoremDecl__NameAssignment_0 ) ) )
            // InternalBSharp.g:5058:1: ( ( rule__TheoremDecl__NameAssignment_0 ) )
            {
            // InternalBSharp.g:5058:1: ( ( rule__TheoremDecl__NameAssignment_0 ) )
            // InternalBSharp.g:5059:2: ( rule__TheoremDecl__NameAssignment_0 )
            {
             before(grammarAccess.getTheoremDeclAccess().getNameAssignment_0()); 
            // InternalBSharp.g:5060:2: ( rule__TheoremDecl__NameAssignment_0 )
            // InternalBSharp.g:5060:3: rule__TheoremDecl__NameAssignment_0
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
    // InternalBSharp.g:5068:1: rule__TheoremDecl__Group__1 : rule__TheoremDecl__Group__1__Impl rule__TheoremDecl__Group__2 ;
    public final void rule__TheoremDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5072:1: ( rule__TheoremDecl__Group__1__Impl rule__TheoremDecl__Group__2 )
            // InternalBSharp.g:5073:2: rule__TheoremDecl__Group__1__Impl rule__TheoremDecl__Group__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalBSharp.g:5080:1: rule__TheoremDecl__Group__1__Impl : ( ( rule__TheoremDecl__ExprAssignment_1 ) ) ;
    public final void rule__TheoremDecl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5084:1: ( ( ( rule__TheoremDecl__ExprAssignment_1 ) ) )
            // InternalBSharp.g:5085:1: ( ( rule__TheoremDecl__ExprAssignment_1 ) )
            {
            // InternalBSharp.g:5085:1: ( ( rule__TheoremDecl__ExprAssignment_1 ) )
            // InternalBSharp.g:5086:2: ( rule__TheoremDecl__ExprAssignment_1 )
            {
             before(grammarAccess.getTheoremDeclAccess().getExprAssignment_1()); 
            // InternalBSharp.g:5087:2: ( rule__TheoremDecl__ExprAssignment_1 )
            // InternalBSharp.g:5087:3: rule__TheoremDecl__ExprAssignment_1
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
    // InternalBSharp.g:5095:1: rule__TheoremDecl__Group__2 : rule__TheoremDecl__Group__2__Impl ;
    public final void rule__TheoremDecl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5099:1: ( rule__TheoremDecl__Group__2__Impl )
            // InternalBSharp.g:5100:2: rule__TheoremDecl__Group__2__Impl
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
    // InternalBSharp.g:5106:1: rule__TheoremDecl__Group__2__Impl : ( ';' ) ;
    public final void rule__TheoremDecl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5110:1: ( ( ';' ) )
            // InternalBSharp.g:5111:1: ( ';' )
            {
            // InternalBSharp.g:5111:1: ( ';' )
            // InternalBSharp.g:5112:2: ';'
            {
             before(grammarAccess.getTheoremDeclAccess().getSemicolonKeyword_2()); 
            match(input,37,FOLLOW_2); 
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
    // InternalBSharp.g:5122:1: rule__TypedVariableList__Group__0 : rule__TypedVariableList__Group__0__Impl rule__TypedVariableList__Group__1 ;
    public final void rule__TypedVariableList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5126:1: ( rule__TypedVariableList__Group__0__Impl rule__TypedVariableList__Group__1 )
            // InternalBSharp.g:5127:2: rule__TypedVariableList__Group__0__Impl rule__TypedVariableList__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalBSharp.g:5134:1: rule__TypedVariableList__Group__0__Impl : ( ( rule__TypedVariableList__VariablesOfTypeAssignment_0 ) ) ;
    public final void rule__TypedVariableList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5138:1: ( ( ( rule__TypedVariableList__VariablesOfTypeAssignment_0 ) ) )
            // InternalBSharp.g:5139:1: ( ( rule__TypedVariableList__VariablesOfTypeAssignment_0 ) )
            {
            // InternalBSharp.g:5139:1: ( ( rule__TypedVariableList__VariablesOfTypeAssignment_0 ) )
            // InternalBSharp.g:5140:2: ( rule__TypedVariableList__VariablesOfTypeAssignment_0 )
            {
             before(grammarAccess.getTypedVariableListAccess().getVariablesOfTypeAssignment_0()); 
            // InternalBSharp.g:5141:2: ( rule__TypedVariableList__VariablesOfTypeAssignment_0 )
            // InternalBSharp.g:5141:3: rule__TypedVariableList__VariablesOfTypeAssignment_0
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
    // InternalBSharp.g:5149:1: rule__TypedVariableList__Group__1 : rule__TypedVariableList__Group__1__Impl ;
    public final void rule__TypedVariableList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5153:1: ( rule__TypedVariableList__Group__1__Impl )
            // InternalBSharp.g:5154:2: rule__TypedVariableList__Group__1__Impl
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
    // InternalBSharp.g:5160:1: rule__TypedVariableList__Group__1__Impl : ( ( rule__TypedVariableList__Group_1__0 )* ) ;
    public final void rule__TypedVariableList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5164:1: ( ( ( rule__TypedVariableList__Group_1__0 )* ) )
            // InternalBSharp.g:5165:1: ( ( rule__TypedVariableList__Group_1__0 )* )
            {
            // InternalBSharp.g:5165:1: ( ( rule__TypedVariableList__Group_1__0 )* )
            // InternalBSharp.g:5166:2: ( rule__TypedVariableList__Group_1__0 )*
            {
             before(grammarAccess.getTypedVariableListAccess().getGroup_1()); 
            // InternalBSharp.g:5167:2: ( rule__TypedVariableList__Group_1__0 )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==40) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalBSharp.g:5167:3: rule__TypedVariableList__Group_1__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__TypedVariableList__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop50;
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
    // InternalBSharp.g:5176:1: rule__TypedVariableList__Group_1__0 : rule__TypedVariableList__Group_1__0__Impl rule__TypedVariableList__Group_1__1 ;
    public final void rule__TypedVariableList__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5180:1: ( rule__TypedVariableList__Group_1__0__Impl rule__TypedVariableList__Group_1__1 )
            // InternalBSharp.g:5181:2: rule__TypedVariableList__Group_1__0__Impl rule__TypedVariableList__Group_1__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalBSharp.g:5188:1: rule__TypedVariableList__Group_1__0__Impl : ( ',' ) ;
    public final void rule__TypedVariableList__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5192:1: ( ( ',' ) )
            // InternalBSharp.g:5193:1: ( ',' )
            {
            // InternalBSharp.g:5193:1: ( ',' )
            // InternalBSharp.g:5194:2: ','
            {
             before(grammarAccess.getTypedVariableListAccess().getCommaKeyword_1_0()); 
            match(input,40,FOLLOW_2); 
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
    // InternalBSharp.g:5203:1: rule__TypedVariableList__Group_1__1 : rule__TypedVariableList__Group_1__1__Impl ;
    public final void rule__TypedVariableList__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5207:1: ( rule__TypedVariableList__Group_1__1__Impl )
            // InternalBSharp.g:5208:2: rule__TypedVariableList__Group_1__1__Impl
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
    // InternalBSharp.g:5214:1: rule__TypedVariableList__Group_1__1__Impl : ( ( rule__TypedVariableList__VariablesOfTypeAssignment_1_1 ) ) ;
    public final void rule__TypedVariableList__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5218:1: ( ( ( rule__TypedVariableList__VariablesOfTypeAssignment_1_1 ) ) )
            // InternalBSharp.g:5219:1: ( ( rule__TypedVariableList__VariablesOfTypeAssignment_1_1 ) )
            {
            // InternalBSharp.g:5219:1: ( ( rule__TypedVariableList__VariablesOfTypeAssignment_1_1 ) )
            // InternalBSharp.g:5220:2: ( rule__TypedVariableList__VariablesOfTypeAssignment_1_1 )
            {
             before(grammarAccess.getTypedVariableListAccess().getVariablesOfTypeAssignment_1_1()); 
            // InternalBSharp.g:5221:2: ( rule__TypedVariableList__VariablesOfTypeAssignment_1_1 )
            // InternalBSharp.g:5221:3: rule__TypedVariableList__VariablesOfTypeAssignment_1_1
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
    // InternalBSharp.g:5230:1: rule__VariableTyping__Group__0 : rule__VariableTyping__Group__0__Impl rule__VariableTyping__Group__1 ;
    public final void rule__VariableTyping__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5234:1: ( rule__VariableTyping__Group__0__Impl rule__VariableTyping__Group__1 )
            // InternalBSharp.g:5235:2: rule__VariableTyping__Group__0__Impl rule__VariableTyping__Group__1
            {
            pushFollow(FOLLOW_45);
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
    // InternalBSharp.g:5242:1: rule__VariableTyping__Group__0__Impl : ( ( rule__VariableTyping__TypeVarAssignment_0 ) ) ;
    public final void rule__VariableTyping__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5246:1: ( ( ( rule__VariableTyping__TypeVarAssignment_0 ) ) )
            // InternalBSharp.g:5247:1: ( ( rule__VariableTyping__TypeVarAssignment_0 ) )
            {
            // InternalBSharp.g:5247:1: ( ( rule__VariableTyping__TypeVarAssignment_0 ) )
            // InternalBSharp.g:5248:2: ( rule__VariableTyping__TypeVarAssignment_0 )
            {
             before(grammarAccess.getVariableTypingAccess().getTypeVarAssignment_0()); 
            // InternalBSharp.g:5249:2: ( rule__VariableTyping__TypeVarAssignment_0 )
            // InternalBSharp.g:5249:3: rule__VariableTyping__TypeVarAssignment_0
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
    // InternalBSharp.g:5257:1: rule__VariableTyping__Group__1 : rule__VariableTyping__Group__1__Impl rule__VariableTyping__Group__2 ;
    public final void rule__VariableTyping__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5261:1: ( rule__VariableTyping__Group__1__Impl rule__VariableTyping__Group__2 )
            // InternalBSharp.g:5262:2: rule__VariableTyping__Group__1__Impl rule__VariableTyping__Group__2
            {
            pushFollow(FOLLOW_45);
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
    // InternalBSharp.g:5269:1: rule__VariableTyping__Group__1__Impl : ( ( rule__VariableTyping__Group_1__0 )* ) ;
    public final void rule__VariableTyping__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5273:1: ( ( ( rule__VariableTyping__Group_1__0 )* ) )
            // InternalBSharp.g:5274:1: ( ( rule__VariableTyping__Group_1__0 )* )
            {
            // InternalBSharp.g:5274:1: ( ( rule__VariableTyping__Group_1__0 )* )
            // InternalBSharp.g:5275:2: ( rule__VariableTyping__Group_1__0 )*
            {
             before(grammarAccess.getVariableTypingAccess().getGroup_1()); 
            // InternalBSharp.g:5276:2: ( rule__VariableTyping__Group_1__0 )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==40) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // InternalBSharp.g:5276:3: rule__VariableTyping__Group_1__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__VariableTyping__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop51;
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
    // InternalBSharp.g:5284:1: rule__VariableTyping__Group__2 : rule__VariableTyping__Group__2__Impl rule__VariableTyping__Group__3 ;
    public final void rule__VariableTyping__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5288:1: ( rule__VariableTyping__Group__2__Impl rule__VariableTyping__Group__3 )
            // InternalBSharp.g:5289:2: rule__VariableTyping__Group__2__Impl rule__VariableTyping__Group__3
            {
            pushFollow(FOLLOW_19);
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
    // InternalBSharp.g:5296:1: rule__VariableTyping__Group__2__Impl : ( ':' ) ;
    public final void rule__VariableTyping__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5300:1: ( ( ':' ) )
            // InternalBSharp.g:5301:1: ( ':' )
            {
            // InternalBSharp.g:5301:1: ( ':' )
            // InternalBSharp.g:5302:2: ':'
            {
             before(grammarAccess.getVariableTypingAccess().getColonKeyword_2()); 
            match(input,32,FOLLOW_2); 
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
    // InternalBSharp.g:5311:1: rule__VariableTyping__Group__3 : rule__VariableTyping__Group__3__Impl ;
    public final void rule__VariableTyping__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5315:1: ( rule__VariableTyping__Group__3__Impl )
            // InternalBSharp.g:5316:2: rule__VariableTyping__Group__3__Impl
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
    // InternalBSharp.g:5322:1: rule__VariableTyping__Group__3__Impl : ( ( rule__VariableTyping__TypeAssignment_3 ) ) ;
    public final void rule__VariableTyping__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5326:1: ( ( ( rule__VariableTyping__TypeAssignment_3 ) ) )
            // InternalBSharp.g:5327:1: ( ( rule__VariableTyping__TypeAssignment_3 ) )
            {
            // InternalBSharp.g:5327:1: ( ( rule__VariableTyping__TypeAssignment_3 ) )
            // InternalBSharp.g:5328:2: ( rule__VariableTyping__TypeAssignment_3 )
            {
             before(grammarAccess.getVariableTypingAccess().getTypeAssignment_3()); 
            // InternalBSharp.g:5329:2: ( rule__VariableTyping__TypeAssignment_3 )
            // InternalBSharp.g:5329:3: rule__VariableTyping__TypeAssignment_3
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
    // InternalBSharp.g:5338:1: rule__VariableTyping__Group_1__0 : rule__VariableTyping__Group_1__0__Impl rule__VariableTyping__Group_1__1 ;
    public final void rule__VariableTyping__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5342:1: ( rule__VariableTyping__Group_1__0__Impl rule__VariableTyping__Group_1__1 )
            // InternalBSharp.g:5343:2: rule__VariableTyping__Group_1__0__Impl rule__VariableTyping__Group_1__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalBSharp.g:5350:1: rule__VariableTyping__Group_1__0__Impl : ( ',' ) ;
    public final void rule__VariableTyping__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5354:1: ( ( ',' ) )
            // InternalBSharp.g:5355:1: ( ',' )
            {
            // InternalBSharp.g:5355:1: ( ',' )
            // InternalBSharp.g:5356:2: ','
            {
             before(grammarAccess.getVariableTypingAccess().getCommaKeyword_1_0()); 
            match(input,40,FOLLOW_2); 
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
    // InternalBSharp.g:5365:1: rule__VariableTyping__Group_1__1 : rule__VariableTyping__Group_1__1__Impl ;
    public final void rule__VariableTyping__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5369:1: ( rule__VariableTyping__Group_1__1__Impl )
            // InternalBSharp.g:5370:2: rule__VariableTyping__Group_1__1__Impl
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
    // InternalBSharp.g:5376:1: rule__VariableTyping__Group_1__1__Impl : ( ( rule__VariableTyping__TypeVarAssignment_1_1 ) ) ;
    public final void rule__VariableTyping__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5380:1: ( ( ( rule__VariableTyping__TypeVarAssignment_1_1 ) ) )
            // InternalBSharp.g:5381:1: ( ( rule__VariableTyping__TypeVarAssignment_1_1 ) )
            {
            // InternalBSharp.g:5381:1: ( ( rule__VariableTyping__TypeVarAssignment_1_1 ) )
            // InternalBSharp.g:5382:2: ( rule__VariableTyping__TypeVarAssignment_1_1 )
            {
             before(grammarAccess.getVariableTypingAccess().getTypeVarAssignment_1_1()); 
            // InternalBSharp.g:5383:2: ( rule__VariableTyping__TypeVarAssignment_1_1 )
            // InternalBSharp.g:5383:3: rule__VariableTyping__TypeVarAssignment_1_1
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
    // InternalBSharp.g:5392:1: rule__Lambda__Group__0 : rule__Lambda__Group__0__Impl rule__Lambda__Group__1 ;
    public final void rule__Lambda__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5396:1: ( rule__Lambda__Group__0__Impl rule__Lambda__Group__1 )
            // InternalBSharp.g:5397:2: rule__Lambda__Group__0__Impl rule__Lambda__Group__1
            {
            pushFollow(FOLLOW_46);
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
    // InternalBSharp.g:5404:1: rule__Lambda__Group__0__Impl : ( ( rule__Lambda__QTypeAssignment_0 ) ) ;
    public final void rule__Lambda__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5408:1: ( ( ( rule__Lambda__QTypeAssignment_0 ) ) )
            // InternalBSharp.g:5409:1: ( ( rule__Lambda__QTypeAssignment_0 ) )
            {
            // InternalBSharp.g:5409:1: ( ( rule__Lambda__QTypeAssignment_0 ) )
            // InternalBSharp.g:5410:2: ( rule__Lambda__QTypeAssignment_0 )
            {
             before(grammarAccess.getLambdaAccess().getQTypeAssignment_0()); 
            // InternalBSharp.g:5411:2: ( rule__Lambda__QTypeAssignment_0 )
            // InternalBSharp.g:5411:3: rule__Lambda__QTypeAssignment_0
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
    // InternalBSharp.g:5419:1: rule__Lambda__Group__1 : rule__Lambda__Group__1__Impl rule__Lambda__Group__2 ;
    public final void rule__Lambda__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5423:1: ( rule__Lambda__Group__1__Impl rule__Lambda__Group__2 )
            // InternalBSharp.g:5424:2: rule__Lambda__Group__1__Impl rule__Lambda__Group__2
            {
            pushFollow(FOLLOW_46);
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
    // InternalBSharp.g:5431:1: rule__Lambda__Group__1__Impl : ( ( rule__Lambda__ContextAssignment_1 )? ) ;
    public final void rule__Lambda__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5435:1: ( ( ( rule__Lambda__ContextAssignment_1 )? ) )
            // InternalBSharp.g:5436:1: ( ( rule__Lambda__ContextAssignment_1 )? )
            {
            // InternalBSharp.g:5436:1: ( ( rule__Lambda__ContextAssignment_1 )? )
            // InternalBSharp.g:5437:2: ( rule__Lambda__ContextAssignment_1 )?
            {
             before(grammarAccess.getLambdaAccess().getContextAssignment_1()); 
            // InternalBSharp.g:5438:2: ( rule__Lambda__ContextAssignment_1 )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==38) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalBSharp.g:5438:3: rule__Lambda__ContextAssignment_1
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
    // InternalBSharp.g:5446:1: rule__Lambda__Group__2 : rule__Lambda__Group__2__Impl rule__Lambda__Group__3 ;
    public final void rule__Lambda__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5450:1: ( rule__Lambda__Group__2__Impl rule__Lambda__Group__3 )
            // InternalBSharp.g:5451:2: rule__Lambda__Group__2__Impl rule__Lambda__Group__3
            {
            pushFollow(FOLLOW_38);
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
    // InternalBSharp.g:5458:1: rule__Lambda__Group__2__Impl : ( ( rule__Lambda__VarListAssignment_2 ) ) ;
    public final void rule__Lambda__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5462:1: ( ( ( rule__Lambda__VarListAssignment_2 ) ) )
            // InternalBSharp.g:5463:1: ( ( rule__Lambda__VarListAssignment_2 ) )
            {
            // InternalBSharp.g:5463:1: ( ( rule__Lambda__VarListAssignment_2 ) )
            // InternalBSharp.g:5464:2: ( rule__Lambda__VarListAssignment_2 )
            {
             before(grammarAccess.getLambdaAccess().getVarListAssignment_2()); 
            // InternalBSharp.g:5465:2: ( rule__Lambda__VarListAssignment_2 )
            // InternalBSharp.g:5465:3: rule__Lambda__VarListAssignment_2
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
    // InternalBSharp.g:5473:1: rule__Lambda__Group__3 : rule__Lambda__Group__3__Impl rule__Lambda__Group__4 ;
    public final void rule__Lambda__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5477:1: ( rule__Lambda__Group__3__Impl rule__Lambda__Group__4 )
            // InternalBSharp.g:5478:2: rule__Lambda__Group__3__Impl rule__Lambda__Group__4
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
    // InternalBSharp.g:5485:1: rule__Lambda__Group__3__Impl : ( '|' ) ;
    public final void rule__Lambda__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5489:1: ( ( '|' ) )
            // InternalBSharp.g:5490:1: ( '|' )
            {
            // InternalBSharp.g:5490:1: ( '|' )
            // InternalBSharp.g:5491:2: '|'
            {
             before(grammarAccess.getLambdaAccess().getVerticalLineKeyword_3()); 
            match(input,45,FOLLOW_2); 
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
    // InternalBSharp.g:5500:1: rule__Lambda__Group__4 : rule__Lambda__Group__4__Impl ;
    public final void rule__Lambda__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5504:1: ( rule__Lambda__Group__4__Impl )
            // InternalBSharp.g:5505:2: rule__Lambda__Group__4__Impl
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
    // InternalBSharp.g:5511:1: rule__Lambda__Group__4__Impl : ( ( rule__Lambda__ExprAssignment_4 ) ) ;
    public final void rule__Lambda__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5515:1: ( ( ( rule__Lambda__ExprAssignment_4 ) ) )
            // InternalBSharp.g:5516:1: ( ( rule__Lambda__ExprAssignment_4 ) )
            {
            // InternalBSharp.g:5516:1: ( ( rule__Lambda__ExprAssignment_4 ) )
            // InternalBSharp.g:5517:2: ( rule__Lambda__ExprAssignment_4 )
            {
             before(grammarAccess.getLambdaAccess().getExprAssignment_4()); 
            // InternalBSharp.g:5518:2: ( rule__Lambda__ExprAssignment_4 )
            // InternalBSharp.g:5518:3: rule__Lambda__ExprAssignment_4
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
    // InternalBSharp.g:5527:1: rule__Quantifier__Group__0 : rule__Quantifier__Group__0__Impl rule__Quantifier__Group__1 ;
    public final void rule__Quantifier__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5531:1: ( rule__Quantifier__Group__0__Impl rule__Quantifier__Group__1 )
            // InternalBSharp.g:5532:2: rule__Quantifier__Group__0__Impl rule__Quantifier__Group__1
            {
            pushFollow(FOLLOW_46);
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
    // InternalBSharp.g:5539:1: rule__Quantifier__Group__0__Impl : ( ( rule__Quantifier__QTypeAssignment_0 ) ) ;
    public final void rule__Quantifier__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5543:1: ( ( ( rule__Quantifier__QTypeAssignment_0 ) ) )
            // InternalBSharp.g:5544:1: ( ( rule__Quantifier__QTypeAssignment_0 ) )
            {
            // InternalBSharp.g:5544:1: ( ( rule__Quantifier__QTypeAssignment_0 ) )
            // InternalBSharp.g:5545:2: ( rule__Quantifier__QTypeAssignment_0 )
            {
             before(grammarAccess.getQuantifierAccess().getQTypeAssignment_0()); 
            // InternalBSharp.g:5546:2: ( rule__Quantifier__QTypeAssignment_0 )
            // InternalBSharp.g:5546:3: rule__Quantifier__QTypeAssignment_0
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
    // InternalBSharp.g:5554:1: rule__Quantifier__Group__1 : rule__Quantifier__Group__1__Impl rule__Quantifier__Group__2 ;
    public final void rule__Quantifier__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5558:1: ( rule__Quantifier__Group__1__Impl rule__Quantifier__Group__2 )
            // InternalBSharp.g:5559:2: rule__Quantifier__Group__1__Impl rule__Quantifier__Group__2
            {
            pushFollow(FOLLOW_46);
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
    // InternalBSharp.g:5566:1: rule__Quantifier__Group__1__Impl : ( ( rule__Quantifier__ContextAssignment_1 )? ) ;
    public final void rule__Quantifier__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5570:1: ( ( ( rule__Quantifier__ContextAssignment_1 )? ) )
            // InternalBSharp.g:5571:1: ( ( rule__Quantifier__ContextAssignment_1 )? )
            {
            // InternalBSharp.g:5571:1: ( ( rule__Quantifier__ContextAssignment_1 )? )
            // InternalBSharp.g:5572:2: ( rule__Quantifier__ContextAssignment_1 )?
            {
             before(grammarAccess.getQuantifierAccess().getContextAssignment_1()); 
            // InternalBSharp.g:5573:2: ( rule__Quantifier__ContextAssignment_1 )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==38) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalBSharp.g:5573:3: rule__Quantifier__ContextAssignment_1
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
    // InternalBSharp.g:5581:1: rule__Quantifier__Group__2 : rule__Quantifier__Group__2__Impl rule__Quantifier__Group__3 ;
    public final void rule__Quantifier__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5585:1: ( rule__Quantifier__Group__2__Impl rule__Quantifier__Group__3 )
            // InternalBSharp.g:5586:2: rule__Quantifier__Group__2__Impl rule__Quantifier__Group__3
            {
            pushFollow(FOLLOW_47);
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
    // InternalBSharp.g:5593:1: rule__Quantifier__Group__2__Impl : ( ( rule__Quantifier__VarListAssignment_2 ) ) ;
    public final void rule__Quantifier__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5597:1: ( ( ( rule__Quantifier__VarListAssignment_2 ) ) )
            // InternalBSharp.g:5598:1: ( ( rule__Quantifier__VarListAssignment_2 ) )
            {
            // InternalBSharp.g:5598:1: ( ( rule__Quantifier__VarListAssignment_2 ) )
            // InternalBSharp.g:5599:2: ( rule__Quantifier__VarListAssignment_2 )
            {
             before(grammarAccess.getQuantifierAccess().getVarListAssignment_2()); 
            // InternalBSharp.g:5600:2: ( rule__Quantifier__VarListAssignment_2 )
            // InternalBSharp.g:5600:3: rule__Quantifier__VarListAssignment_2
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
    // InternalBSharp.g:5608:1: rule__Quantifier__Group__3 : rule__Quantifier__Group__3__Impl rule__Quantifier__Group__4 ;
    public final void rule__Quantifier__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5612:1: ( rule__Quantifier__Group__3__Impl rule__Quantifier__Group__4 )
            // InternalBSharp.g:5613:2: rule__Quantifier__Group__3__Impl rule__Quantifier__Group__4
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
    // InternalBSharp.g:5620:1: rule__Quantifier__Group__3__Impl : ( '\\u00B7' ) ;
    public final void rule__Quantifier__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5624:1: ( ( '\\u00B7' ) )
            // InternalBSharp.g:5625:1: ( '\\u00B7' )
            {
            // InternalBSharp.g:5625:1: ( '\\u00B7' )
            // InternalBSharp.g:5626:2: '\\u00B7'
            {
             before(grammarAccess.getQuantifierAccess().getMiddleDotKeyword_3()); 
            match(input,51,FOLLOW_2); 
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
    // InternalBSharp.g:5635:1: rule__Quantifier__Group__4 : rule__Quantifier__Group__4__Impl ;
    public final void rule__Quantifier__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5639:1: ( rule__Quantifier__Group__4__Impl )
            // InternalBSharp.g:5640:2: rule__Quantifier__Group__4__Impl
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
    // InternalBSharp.g:5646:1: rule__Quantifier__Group__4__Impl : ( ( rule__Quantifier__ExprAssignment_4 ) ) ;
    public final void rule__Quantifier__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5650:1: ( ( ( rule__Quantifier__ExprAssignment_4 ) ) )
            // InternalBSharp.g:5651:1: ( ( rule__Quantifier__ExprAssignment_4 ) )
            {
            // InternalBSharp.g:5651:1: ( ( rule__Quantifier__ExprAssignment_4 ) )
            // InternalBSharp.g:5652:2: ( rule__Quantifier__ExprAssignment_4 )
            {
             before(grammarAccess.getQuantifierAccess().getExprAssignment_4()); 
            // InternalBSharp.g:5653:2: ( rule__Quantifier__ExprAssignment_4 )
            // InternalBSharp.g:5653:3: rule__Quantifier__ExprAssignment_4
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
    // InternalBSharp.g:5662:1: rule__Prefix__Group__0 : rule__Prefix__Group__0__Impl rule__Prefix__Group__1 ;
    public final void rule__Prefix__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5666:1: ( rule__Prefix__Group__0__Impl rule__Prefix__Group__1 )
            // InternalBSharp.g:5667:2: rule__Prefix__Group__0__Impl rule__Prefix__Group__1
            {
            pushFollow(FOLLOW_48);
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
    // InternalBSharp.g:5674:1: rule__Prefix__Group__0__Impl : ( ( rule__Prefix__NameAssignment_0 ) ) ;
    public final void rule__Prefix__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5678:1: ( ( ( rule__Prefix__NameAssignment_0 ) ) )
            // InternalBSharp.g:5679:1: ( ( rule__Prefix__NameAssignment_0 ) )
            {
            // InternalBSharp.g:5679:1: ( ( rule__Prefix__NameAssignment_0 ) )
            // InternalBSharp.g:5680:2: ( rule__Prefix__NameAssignment_0 )
            {
             before(grammarAccess.getPrefixAccess().getNameAssignment_0()); 
            // InternalBSharp.g:5681:2: ( rule__Prefix__NameAssignment_0 )
            // InternalBSharp.g:5681:3: rule__Prefix__NameAssignment_0
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
    // InternalBSharp.g:5689:1: rule__Prefix__Group__1 : rule__Prefix__Group__1__Impl ;
    public final void rule__Prefix__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5693:1: ( rule__Prefix__Group__1__Impl )
            // InternalBSharp.g:5694:2: rule__Prefix__Group__1__Impl
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
    // InternalBSharp.g:5700:1: rule__Prefix__Group__1__Impl : ( ( rule__Prefix__ElemAssignment_1 ) ) ;
    public final void rule__Prefix__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5704:1: ( ( ( rule__Prefix__ElemAssignment_1 ) ) )
            // InternalBSharp.g:5705:1: ( ( rule__Prefix__ElemAssignment_1 ) )
            {
            // InternalBSharp.g:5705:1: ( ( rule__Prefix__ElemAssignment_1 ) )
            // InternalBSharp.g:5706:2: ( rule__Prefix__ElemAssignment_1 )
            {
             before(grammarAccess.getPrefixAccess().getElemAssignment_1()); 
            // InternalBSharp.g:5707:2: ( rule__Prefix__ElemAssignment_1 )
            // InternalBSharp.g:5707:3: rule__Prefix__ElemAssignment_1
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
    // InternalBSharp.g:5716:1: rule__Infix__Group__0 : rule__Infix__Group__0__Impl rule__Infix__Group__1 ;
    public final void rule__Infix__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5720:1: ( rule__Infix__Group__0__Impl rule__Infix__Group__1 )
            // InternalBSharp.g:5721:2: rule__Infix__Group__0__Impl rule__Infix__Group__1
            {
            pushFollow(FOLLOW_49);
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
    // InternalBSharp.g:5728:1: rule__Infix__Group__0__Impl : ( ruleElement ) ;
    public final void rule__Infix__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5732:1: ( ( ruleElement ) )
            // InternalBSharp.g:5733:1: ( ruleElement )
            {
            // InternalBSharp.g:5733:1: ( ruleElement )
            // InternalBSharp.g:5734:2: ruleElement
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
    // InternalBSharp.g:5743:1: rule__Infix__Group__1 : rule__Infix__Group__1__Impl ;
    public final void rule__Infix__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5747:1: ( rule__Infix__Group__1__Impl )
            // InternalBSharp.g:5748:2: rule__Infix__Group__1__Impl
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
    // InternalBSharp.g:5754:1: rule__Infix__Group__1__Impl : ( ( rule__Infix__Group_1__0 )* ) ;
    public final void rule__Infix__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5758:1: ( ( ( rule__Infix__Group_1__0 )* ) )
            // InternalBSharp.g:5759:1: ( ( rule__Infix__Group_1__0 )* )
            {
            // InternalBSharp.g:5759:1: ( ( rule__Infix__Group_1__0 )* )
            // InternalBSharp.g:5760:2: ( rule__Infix__Group_1__0 )*
            {
             before(grammarAccess.getInfixAccess().getGroup_1()); 
            // InternalBSharp.g:5761:2: ( rule__Infix__Group_1__0 )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==RULE_ID) ) {
                    int LA54_2 = input.LA(2);

                    if ( (LA54_2==41) ) {
                        int LA54_4 = input.LA(3);

                        if ( (LA54_4==11||(LA54_4>=23 && LA54_4<=24)||LA54_4==41||LA54_4==49||LA54_4==54) ) {
                            alt54=1;
                        }
                        else if ( (LA54_4==RULE_ID) ) {
                            int LA54_5 = input.LA(4);

                            if ( (LA54_5==RULE_ID||(LA54_5>=25 && LA54_5<=30)||LA54_5==33||(LA54_5>=41 && LA54_5<=42)) ) {
                                alt54=1;
                            }


                        }


                    }
                    else if ( (LA54_2==RULE_ID||LA54_2==11) ) {
                        alt54=1;
                    }


                }
                else if ( ((LA54_0>=25 && LA54_0<=30)) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // InternalBSharp.g:5761:3: rule__Infix__Group_1__0
            	    {
            	    pushFollow(FOLLOW_50);
            	    rule__Infix__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop54;
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
    // InternalBSharp.g:5770:1: rule__Infix__Group_1__0 : rule__Infix__Group_1__0__Impl rule__Infix__Group_1__1 ;
    public final void rule__Infix__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5774:1: ( rule__Infix__Group_1__0__Impl rule__Infix__Group_1__1 )
            // InternalBSharp.g:5775:2: rule__Infix__Group_1__0__Impl rule__Infix__Group_1__1
            {
            pushFollow(FOLLOW_49);
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
    // InternalBSharp.g:5782:1: rule__Infix__Group_1__0__Impl : ( () ) ;
    public final void rule__Infix__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5786:1: ( ( () ) )
            // InternalBSharp.g:5787:1: ( () )
            {
            // InternalBSharp.g:5787:1: ( () )
            // InternalBSharp.g:5788:2: ()
            {
             before(grammarAccess.getInfixAccess().getInfixLeftAction_1_0()); 
            // InternalBSharp.g:5789:2: ()
            // InternalBSharp.g:5789:3: 
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
    // InternalBSharp.g:5797:1: rule__Infix__Group_1__1 : rule__Infix__Group_1__1__Impl rule__Infix__Group_1__2 ;
    public final void rule__Infix__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5801:1: ( rule__Infix__Group_1__1__Impl rule__Infix__Group_1__2 )
            // InternalBSharp.g:5802:2: rule__Infix__Group_1__1__Impl rule__Infix__Group_1__2
            {
            pushFollow(FOLLOW_48);
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
    // InternalBSharp.g:5809:1: rule__Infix__Group_1__1__Impl : ( ( rule__Infix__Alternatives_1_1 ) ) ;
    public final void rule__Infix__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5813:1: ( ( ( rule__Infix__Alternatives_1_1 ) ) )
            // InternalBSharp.g:5814:1: ( ( rule__Infix__Alternatives_1_1 ) )
            {
            // InternalBSharp.g:5814:1: ( ( rule__Infix__Alternatives_1_1 ) )
            // InternalBSharp.g:5815:2: ( rule__Infix__Alternatives_1_1 )
            {
             before(grammarAccess.getInfixAccess().getAlternatives_1_1()); 
            // InternalBSharp.g:5816:2: ( rule__Infix__Alternatives_1_1 )
            // InternalBSharp.g:5816:3: rule__Infix__Alternatives_1_1
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
    // InternalBSharp.g:5824:1: rule__Infix__Group_1__2 : rule__Infix__Group_1__2__Impl ;
    public final void rule__Infix__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5828:1: ( rule__Infix__Group_1__2__Impl )
            // InternalBSharp.g:5829:2: rule__Infix__Group_1__2__Impl
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
    // InternalBSharp.g:5835:1: rule__Infix__Group_1__2__Impl : ( ( rule__Infix__RightAssignment_1_2 ) ) ;
    public final void rule__Infix__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5839:1: ( ( ( rule__Infix__RightAssignment_1_2 ) ) )
            // InternalBSharp.g:5840:1: ( ( rule__Infix__RightAssignment_1_2 ) )
            {
            // InternalBSharp.g:5840:1: ( ( rule__Infix__RightAssignment_1_2 ) )
            // InternalBSharp.g:5841:2: ( rule__Infix__RightAssignment_1_2 )
            {
             before(grammarAccess.getInfixAccess().getRightAssignment_1_2()); 
            // InternalBSharp.g:5842:2: ( rule__Infix__RightAssignment_1_2 )
            // InternalBSharp.g:5842:3: rule__Infix__RightAssignment_1_2
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
    // InternalBSharp.g:5851:1: rule__Bracket__Group__0 : rule__Bracket__Group__0__Impl rule__Bracket__Group__1 ;
    public final void rule__Bracket__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5855:1: ( rule__Bracket__Group__0__Impl rule__Bracket__Group__1 )
            // InternalBSharp.g:5856:2: rule__Bracket__Group__0__Impl rule__Bracket__Group__1
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
    // InternalBSharp.g:5863:1: rule__Bracket__Group__0__Impl : ( '(' ) ;
    public final void rule__Bracket__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5867:1: ( ( '(' ) )
            // InternalBSharp.g:5868:1: ( '(' )
            {
            // InternalBSharp.g:5868:1: ( '(' )
            // InternalBSharp.g:5869:2: '('
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
    // InternalBSharp.g:5878:1: rule__Bracket__Group__1 : rule__Bracket__Group__1__Impl rule__Bracket__Group__2 ;
    public final void rule__Bracket__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5882:1: ( rule__Bracket__Group__1__Impl rule__Bracket__Group__2 )
            // InternalBSharp.g:5883:2: rule__Bracket__Group__1__Impl rule__Bracket__Group__2
            {
            pushFollow(FOLLOW_23);
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
    // InternalBSharp.g:5890:1: rule__Bracket__Group__1__Impl : ( ( rule__Bracket__ChildAssignment_1 ) ) ;
    public final void rule__Bracket__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5894:1: ( ( ( rule__Bracket__ChildAssignment_1 ) ) )
            // InternalBSharp.g:5895:1: ( ( rule__Bracket__ChildAssignment_1 ) )
            {
            // InternalBSharp.g:5895:1: ( ( rule__Bracket__ChildAssignment_1 ) )
            // InternalBSharp.g:5896:2: ( rule__Bracket__ChildAssignment_1 )
            {
             before(grammarAccess.getBracketAccess().getChildAssignment_1()); 
            // InternalBSharp.g:5897:2: ( rule__Bracket__ChildAssignment_1 )
            // InternalBSharp.g:5897:3: rule__Bracket__ChildAssignment_1
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
    // InternalBSharp.g:5905:1: rule__Bracket__Group__2 : rule__Bracket__Group__2__Impl ;
    public final void rule__Bracket__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5909:1: ( rule__Bracket__Group__2__Impl )
            // InternalBSharp.g:5910:2: rule__Bracket__Group__2__Impl
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
    // InternalBSharp.g:5916:1: rule__Bracket__Group__2__Impl : ( ')' ) ;
    public final void rule__Bracket__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5920:1: ( ( ')' ) )
            // InternalBSharp.g:5921:1: ( ')' )
            {
            // InternalBSharp.g:5921:1: ( ')' )
            // InternalBSharp.g:5922:2: ')'
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


    // $ANTLR start "rule__FunctionCall__Group__0"
    // InternalBSharp.g:5932:1: rule__FunctionCall__Group__0 : rule__FunctionCall__Group__0__Impl rule__FunctionCall__Group__1 ;
    public final void rule__FunctionCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5936:1: ( rule__FunctionCall__Group__0__Impl rule__FunctionCall__Group__1 )
            // InternalBSharp.g:5937:2: rule__FunctionCall__Group__0__Impl rule__FunctionCall__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__FunctionCall__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionCall__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group__0"


    // $ANTLR start "rule__FunctionCall__Group__0__Impl"
    // InternalBSharp.g:5944:1: rule__FunctionCall__Group__0__Impl : ( ( rule__FunctionCall__Alternatives_0 ) ) ;
    public final void rule__FunctionCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5948:1: ( ( ( rule__FunctionCall__Alternatives_0 ) ) )
            // InternalBSharp.g:5949:1: ( ( rule__FunctionCall__Alternatives_0 ) )
            {
            // InternalBSharp.g:5949:1: ( ( rule__FunctionCall__Alternatives_0 ) )
            // InternalBSharp.g:5950:2: ( rule__FunctionCall__Alternatives_0 )
            {
             before(grammarAccess.getFunctionCallAccess().getAlternatives_0()); 
            // InternalBSharp.g:5951:2: ( rule__FunctionCall__Alternatives_0 )
            // InternalBSharp.g:5951:3: rule__FunctionCall__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__FunctionCall__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionCallAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group__0__Impl"


    // $ANTLR start "rule__FunctionCall__Group__1"
    // InternalBSharp.g:5959:1: rule__FunctionCall__Group__1 : rule__FunctionCall__Group__1__Impl ;
    public final void rule__FunctionCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5963:1: ( rule__FunctionCall__Group__1__Impl )
            // InternalBSharp.g:5964:2: rule__FunctionCall__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FunctionCall__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group__1"


    // $ANTLR start "rule__FunctionCall__Group__1__Impl"
    // InternalBSharp.g:5970:1: rule__FunctionCall__Group__1__Impl : ( ( rule__FunctionCall__Group_1__0 )? ) ;
    public final void rule__FunctionCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5974:1: ( ( ( rule__FunctionCall__Group_1__0 )? ) )
            // InternalBSharp.g:5975:1: ( ( rule__FunctionCall__Group_1__0 )? )
            {
            // InternalBSharp.g:5975:1: ( ( rule__FunctionCall__Group_1__0 )? )
            // InternalBSharp.g:5976:2: ( rule__FunctionCall__Group_1__0 )?
            {
             before(grammarAccess.getFunctionCallAccess().getGroup_1()); 
            // InternalBSharp.g:5977:2: ( rule__FunctionCall__Group_1__0 )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==41) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalBSharp.g:5977:3: rule__FunctionCall__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FunctionCall__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFunctionCallAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group__1__Impl"


    // $ANTLR start "rule__FunctionCall__Group_1__0"
    // InternalBSharp.g:5986:1: rule__FunctionCall__Group_1__0 : rule__FunctionCall__Group_1__0__Impl rule__FunctionCall__Group_1__1 ;
    public final void rule__FunctionCall__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5990:1: ( rule__FunctionCall__Group_1__0__Impl rule__FunctionCall__Group_1__1 )
            // InternalBSharp.g:5991:2: rule__FunctionCall__Group_1__0__Impl rule__FunctionCall__Group_1__1
            {
            pushFollow(FOLLOW_51);
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
    // InternalBSharp.g:5998:1: rule__FunctionCall__Group_1__0__Impl : ( '(' ) ;
    public final void rule__FunctionCall__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6002:1: ( ( '(' ) )
            // InternalBSharp.g:6003:1: ( '(' )
            {
            // InternalBSharp.g:6003:1: ( '(' )
            // InternalBSharp.g:6004:2: '('
            {
             before(grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_1_0()); 

            }


            }

        }
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
    // InternalBSharp.g:6013:1: rule__FunctionCall__Group_1__1 : rule__FunctionCall__Group_1__1__Impl rule__FunctionCall__Group_1__2 ;
    public final void rule__FunctionCall__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6017:1: ( rule__FunctionCall__Group_1__1__Impl rule__FunctionCall__Group_1__2 )
            // InternalBSharp.g:6018:2: rule__FunctionCall__Group_1__1__Impl rule__FunctionCall__Group_1__2
            {
            pushFollow(FOLLOW_51);
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
    // InternalBSharp.g:6025:1: rule__FunctionCall__Group_1__1__Impl : ( ( rule__FunctionCall__ArgumentsAssignment_1_1 )? ) ;
    public final void rule__FunctionCall__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6029:1: ( ( ( rule__FunctionCall__ArgumentsAssignment_1_1 )? ) )
            // InternalBSharp.g:6030:1: ( ( rule__FunctionCall__ArgumentsAssignment_1_1 )? )
            {
            // InternalBSharp.g:6030:1: ( ( rule__FunctionCall__ArgumentsAssignment_1_1 )? )
            // InternalBSharp.g:6031:2: ( rule__FunctionCall__ArgumentsAssignment_1_1 )?
            {
             before(grammarAccess.getFunctionCallAccess().getArgumentsAssignment_1_1()); 
            // InternalBSharp.g:6032:2: ( rule__FunctionCall__ArgumentsAssignment_1_1 )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==RULE_ID||LA56_0==11||(LA56_0>=23 && LA56_0<=24)||LA56_0==41||LA56_0==49||LA56_0==54) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalBSharp.g:6032:3: rule__FunctionCall__ArgumentsAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__FunctionCall__ArgumentsAssignment_1_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFunctionCallAccess().getArgumentsAssignment_1_1()); 

            }


            }

        }
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
    // InternalBSharp.g:6040:1: rule__FunctionCall__Group_1__2 : rule__FunctionCall__Group_1__2__Impl rule__FunctionCall__Group_1__3 ;
    public final void rule__FunctionCall__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6044:1: ( rule__FunctionCall__Group_1__2__Impl rule__FunctionCall__Group_1__3 )
            // InternalBSharp.g:6045:2: rule__FunctionCall__Group_1__2__Impl rule__FunctionCall__Group_1__3
            {
            pushFollow(FOLLOW_51);
            rule__FunctionCall__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionCall__Group_1__3();

            state._fsp--;


            }

        }
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
    // InternalBSharp.g:6052:1: rule__FunctionCall__Group_1__2__Impl : ( ( rule__FunctionCall__Group_1_2__0 )* ) ;
    public final void rule__FunctionCall__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6056:1: ( ( ( rule__FunctionCall__Group_1_2__0 )* ) )
            // InternalBSharp.g:6057:1: ( ( rule__FunctionCall__Group_1_2__0 )* )
            {
            // InternalBSharp.g:6057:1: ( ( rule__FunctionCall__Group_1_2__0 )* )
            // InternalBSharp.g:6058:2: ( rule__FunctionCall__Group_1_2__0 )*
            {
             before(grammarAccess.getFunctionCallAccess().getGroup_1_2()); 
            // InternalBSharp.g:6059:2: ( rule__FunctionCall__Group_1_2__0 )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==40) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // InternalBSharp.g:6059:3: rule__FunctionCall__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__FunctionCall__Group_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop57;
                }
            } while (true);

             after(grammarAccess.getFunctionCallAccess().getGroup_1_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__FunctionCall__Group_1__3"
    // InternalBSharp.g:6067:1: rule__FunctionCall__Group_1__3 : rule__FunctionCall__Group_1__3__Impl ;
    public final void rule__FunctionCall__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6071:1: ( rule__FunctionCall__Group_1__3__Impl )
            // InternalBSharp.g:6072:2: rule__FunctionCall__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FunctionCall__Group_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group_1__3"


    // $ANTLR start "rule__FunctionCall__Group_1__3__Impl"
    // InternalBSharp.g:6078:1: rule__FunctionCall__Group_1__3__Impl : ( ')' ) ;
    public final void rule__FunctionCall__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6082:1: ( ( ')' ) )
            // InternalBSharp.g:6083:1: ( ')' )
            {
            // InternalBSharp.g:6083:1: ( ')' )
            // InternalBSharp.g:6084:2: ')'
            {
             before(grammarAccess.getFunctionCallAccess().getRightParenthesisKeyword_1_3()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getFunctionCallAccess().getRightParenthesisKeyword_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group_1__3__Impl"


    // $ANTLR start "rule__FunctionCall__Group_1_2__0"
    // InternalBSharp.g:6094:1: rule__FunctionCall__Group_1_2__0 : rule__FunctionCall__Group_1_2__0__Impl rule__FunctionCall__Group_1_2__1 ;
    public final void rule__FunctionCall__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6098:1: ( rule__FunctionCall__Group_1_2__0__Impl rule__FunctionCall__Group_1_2__1 )
            // InternalBSharp.g:6099:2: rule__FunctionCall__Group_1_2__0__Impl rule__FunctionCall__Group_1_2__1
            {
            pushFollow(FOLLOW_28);
            rule__FunctionCall__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionCall__Group_1_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group_1_2__0"


    // $ANTLR start "rule__FunctionCall__Group_1_2__0__Impl"
    // InternalBSharp.g:6106:1: rule__FunctionCall__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__FunctionCall__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6110:1: ( ( ',' ) )
            // InternalBSharp.g:6111:1: ( ',' )
            {
            // InternalBSharp.g:6111:1: ( ',' )
            // InternalBSharp.g:6112:2: ','
            {
             before(grammarAccess.getFunctionCallAccess().getCommaKeyword_1_2_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getFunctionCallAccess().getCommaKeyword_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group_1_2__0__Impl"


    // $ANTLR start "rule__FunctionCall__Group_1_2__1"
    // InternalBSharp.g:6121:1: rule__FunctionCall__Group_1_2__1 : rule__FunctionCall__Group_1_2__1__Impl ;
    public final void rule__FunctionCall__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6125:1: ( rule__FunctionCall__Group_1_2__1__Impl )
            // InternalBSharp.g:6126:2: rule__FunctionCall__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FunctionCall__Group_1_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group_1_2__1"


    // $ANTLR start "rule__FunctionCall__Group_1_2__1__Impl"
    // InternalBSharp.g:6132:1: rule__FunctionCall__Group_1_2__1__Impl : ( ( rule__FunctionCall__ArgumentsAssignment_1_2_1 ) ) ;
    public final void rule__FunctionCall__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6136:1: ( ( ( rule__FunctionCall__ArgumentsAssignment_1_2_1 ) ) )
            // InternalBSharp.g:6137:1: ( ( rule__FunctionCall__ArgumentsAssignment_1_2_1 ) )
            {
            // InternalBSharp.g:6137:1: ( ( rule__FunctionCall__ArgumentsAssignment_1_2_1 ) )
            // InternalBSharp.g:6138:2: ( rule__FunctionCall__ArgumentsAssignment_1_2_1 )
            {
             before(grammarAccess.getFunctionCallAccess().getArgumentsAssignment_1_2_1()); 
            // InternalBSharp.g:6139:2: ( rule__FunctionCall__ArgumentsAssignment_1_2_1 )
            // InternalBSharp.g:6139:3: rule__FunctionCall__ArgumentsAssignment_1_2_1
            {
            pushFollow(FOLLOW_2);
            rule__FunctionCall__ArgumentsAssignment_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getFunctionCallAccess().getArgumentsAssignment_1_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group_1_2__1__Impl"


    // $ANTLR start "rule__ClassVarDecl__Group__0"
    // InternalBSharp.g:6148:1: rule__ClassVarDecl__Group__0 : rule__ClassVarDecl__Group__0__Impl rule__ClassVarDecl__Group__1 ;
    public final void rule__ClassVarDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6152:1: ( rule__ClassVarDecl__Group__0__Impl rule__ClassVarDecl__Group__1 )
            // InternalBSharp.g:6153:2: rule__ClassVarDecl__Group__0__Impl rule__ClassVarDecl__Group__1
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
    // InternalBSharp.g:6160:1: rule__ClassVarDecl__Group__0__Impl : ( ( rule__ClassVarDecl__OwnerTypeAssignment_0 ) ) ;
    public final void rule__ClassVarDecl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6164:1: ( ( ( rule__ClassVarDecl__OwnerTypeAssignment_0 ) ) )
            // InternalBSharp.g:6165:1: ( ( rule__ClassVarDecl__OwnerTypeAssignment_0 ) )
            {
            // InternalBSharp.g:6165:1: ( ( rule__ClassVarDecl__OwnerTypeAssignment_0 ) )
            // InternalBSharp.g:6166:2: ( rule__ClassVarDecl__OwnerTypeAssignment_0 )
            {
             before(grammarAccess.getClassVarDeclAccess().getOwnerTypeAssignment_0()); 
            // InternalBSharp.g:6167:2: ( rule__ClassVarDecl__OwnerTypeAssignment_0 )
            // InternalBSharp.g:6167:3: rule__ClassVarDecl__OwnerTypeAssignment_0
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
    // InternalBSharp.g:6175:1: rule__ClassVarDecl__Group__1 : rule__ClassVarDecl__Group__1__Impl rule__ClassVarDecl__Group__2 ;
    public final void rule__ClassVarDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6179:1: ( rule__ClassVarDecl__Group__1__Impl rule__ClassVarDecl__Group__2 )
            // InternalBSharp.g:6180:2: rule__ClassVarDecl__Group__1__Impl rule__ClassVarDecl__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalBSharp.g:6187:1: rule__ClassVarDecl__Group__1__Impl : ( '.' ) ;
    public final void rule__ClassVarDecl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6191:1: ( ( '.' ) )
            // InternalBSharp.g:6192:1: ( '.' )
            {
            // InternalBSharp.g:6192:1: ( '.' )
            // InternalBSharp.g:6193:2: '.'
            {
             before(grammarAccess.getClassVarDeclAccess().getFullStopKeyword_1()); 
            match(input,33,FOLLOW_2); 
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
    // InternalBSharp.g:6202:1: rule__ClassVarDecl__Group__2 : rule__ClassVarDecl__Group__2__Impl ;
    public final void rule__ClassVarDecl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6206:1: ( rule__ClassVarDecl__Group__2__Impl )
            // InternalBSharp.g:6207:2: rule__ClassVarDecl__Group__2__Impl
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
    // InternalBSharp.g:6213:1: rule__ClassVarDecl__Group__2__Impl : ( ( rule__ClassVarDecl__TypeInstAssignment_2 ) ) ;
    public final void rule__ClassVarDecl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6217:1: ( ( ( rule__ClassVarDecl__TypeInstAssignment_2 ) ) )
            // InternalBSharp.g:6218:1: ( ( rule__ClassVarDecl__TypeInstAssignment_2 ) )
            {
            // InternalBSharp.g:6218:1: ( ( rule__ClassVarDecl__TypeInstAssignment_2 ) )
            // InternalBSharp.g:6219:2: ( rule__ClassVarDecl__TypeInstAssignment_2 )
            {
             before(grammarAccess.getClassVarDeclAccess().getTypeInstAssignment_2()); 
            // InternalBSharp.g:6220:2: ( rule__ClassVarDecl__TypeInstAssignment_2 )
            // InternalBSharp.g:6220:3: rule__ClassVarDecl__TypeInstAssignment_2
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


    // $ANTLR start "rule__Instance__Group__0"
    // InternalBSharp.g:6229:1: rule__Instance__Group__0 : rule__Instance__Group__0__Impl rule__Instance__Group__1 ;
    public final void rule__Instance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6233:1: ( rule__Instance__Group__0__Impl rule__Instance__Group__1 )
            // InternalBSharp.g:6234:2: rule__Instance__Group__0__Impl rule__Instance__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalBSharp.g:6241:1: rule__Instance__Group__0__Impl : ( 'Instance' ) ;
    public final void rule__Instance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6245:1: ( ( 'Instance' ) )
            // InternalBSharp.g:6246:1: ( 'Instance' )
            {
            // InternalBSharp.g:6246:1: ( 'Instance' )
            // InternalBSharp.g:6247:2: 'Instance'
            {
             before(grammarAccess.getInstanceAccess().getInstanceKeyword_0()); 
            match(input,52,FOLLOW_2); 
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
    // InternalBSharp.g:6256:1: rule__Instance__Group__1 : rule__Instance__Group__1__Impl rule__Instance__Group__2 ;
    public final void rule__Instance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6260:1: ( rule__Instance__Group__1__Impl rule__Instance__Group__2 )
            // InternalBSharp.g:6261:2: rule__Instance__Group__1__Impl rule__Instance__Group__2
            {
            pushFollow(FOLLOW_22);
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
    // InternalBSharp.g:6268:1: rule__Instance__Group__1__Impl : ( ( rule__Instance__ClassNameAssignment_1 ) ) ;
    public final void rule__Instance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6272:1: ( ( ( rule__Instance__ClassNameAssignment_1 ) ) )
            // InternalBSharp.g:6273:1: ( ( rule__Instance__ClassNameAssignment_1 ) )
            {
            // InternalBSharp.g:6273:1: ( ( rule__Instance__ClassNameAssignment_1 ) )
            // InternalBSharp.g:6274:2: ( rule__Instance__ClassNameAssignment_1 )
            {
             before(grammarAccess.getInstanceAccess().getClassNameAssignment_1()); 
            // InternalBSharp.g:6275:2: ( rule__Instance__ClassNameAssignment_1 )
            // InternalBSharp.g:6275:3: rule__Instance__ClassNameAssignment_1
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
    // InternalBSharp.g:6283:1: rule__Instance__Group__2 : rule__Instance__Group__2__Impl rule__Instance__Group__3 ;
    public final void rule__Instance__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6287:1: ( rule__Instance__Group__2__Impl rule__Instance__Group__3 )
            // InternalBSharp.g:6288:2: rule__Instance__Group__2__Impl rule__Instance__Group__3
            {
            pushFollow(FOLLOW_31);
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
    // InternalBSharp.g:6295:1: rule__Instance__Group__2__Impl : ( ( rule__Instance__ContextAssignment_2 ) ) ;
    public final void rule__Instance__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6299:1: ( ( ( rule__Instance__ContextAssignment_2 ) ) )
            // InternalBSharp.g:6300:1: ( ( rule__Instance__ContextAssignment_2 ) )
            {
            // InternalBSharp.g:6300:1: ( ( rule__Instance__ContextAssignment_2 ) )
            // InternalBSharp.g:6301:2: ( rule__Instance__ContextAssignment_2 )
            {
             before(grammarAccess.getInstanceAccess().getContextAssignment_2()); 
            // InternalBSharp.g:6302:2: ( rule__Instance__ContextAssignment_2 )
            // InternalBSharp.g:6302:3: rule__Instance__ContextAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Instance__ContextAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getInstanceAccess().getContextAssignment_2()); 

            }


            }

        }
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
    // InternalBSharp.g:6310:1: rule__Instance__Group__3 : rule__Instance__Group__3__Impl rule__Instance__Group__4 ;
    public final void rule__Instance__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6314:1: ( rule__Instance__Group__3__Impl rule__Instance__Group__4 )
            // InternalBSharp.g:6315:2: rule__Instance__Group__3__Impl rule__Instance__Group__4
            {
            pushFollow(FOLLOW_51);
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
    // InternalBSharp.g:6322:1: rule__Instance__Group__3__Impl : ( '(' ) ;
    public final void rule__Instance__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6326:1: ( ( '(' ) )
            // InternalBSharp.g:6327:1: ( '(' )
            {
            // InternalBSharp.g:6327:1: ( '(' )
            // InternalBSharp.g:6328:2: '('
            {
             before(grammarAccess.getInstanceAccess().getLeftParenthesisKeyword_3()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getInstanceAccess().getLeftParenthesisKeyword_3()); 

            }


            }

        }
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
    // InternalBSharp.g:6337:1: rule__Instance__Group__4 : rule__Instance__Group__4__Impl rule__Instance__Group__5 ;
    public final void rule__Instance__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6341:1: ( rule__Instance__Group__4__Impl rule__Instance__Group__5 )
            // InternalBSharp.g:6342:2: rule__Instance__Group__4__Impl rule__Instance__Group__5
            {
            pushFollow(FOLLOW_51);
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
    // InternalBSharp.g:6349:1: rule__Instance__Group__4__Impl : ( ( rule__Instance__ArgumentsAssignment_4 )? ) ;
    public final void rule__Instance__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6353:1: ( ( ( rule__Instance__ArgumentsAssignment_4 )? ) )
            // InternalBSharp.g:6354:1: ( ( rule__Instance__ArgumentsAssignment_4 )? )
            {
            // InternalBSharp.g:6354:1: ( ( rule__Instance__ArgumentsAssignment_4 )? )
            // InternalBSharp.g:6355:2: ( rule__Instance__ArgumentsAssignment_4 )?
            {
             before(grammarAccess.getInstanceAccess().getArgumentsAssignment_4()); 
            // InternalBSharp.g:6356:2: ( rule__Instance__ArgumentsAssignment_4 )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==RULE_ID||LA58_0==11||(LA58_0>=23 && LA58_0<=24)||LA58_0==41||LA58_0==49||LA58_0==54) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalBSharp.g:6356:3: rule__Instance__ArgumentsAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Instance__ArgumentsAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInstanceAccess().getArgumentsAssignment_4()); 

            }


            }

        }
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
    // InternalBSharp.g:6364:1: rule__Instance__Group__5 : rule__Instance__Group__5__Impl rule__Instance__Group__6 ;
    public final void rule__Instance__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6368:1: ( rule__Instance__Group__5__Impl rule__Instance__Group__6 )
            // InternalBSharp.g:6369:2: rule__Instance__Group__5__Impl rule__Instance__Group__6
            {
            pushFollow(FOLLOW_51);
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
    // InternalBSharp.g:6376:1: rule__Instance__Group__5__Impl : ( ( rule__Instance__Group_5__0 )* ) ;
    public final void rule__Instance__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6380:1: ( ( ( rule__Instance__Group_5__0 )* ) )
            // InternalBSharp.g:6381:1: ( ( rule__Instance__Group_5__0 )* )
            {
            // InternalBSharp.g:6381:1: ( ( rule__Instance__Group_5__0 )* )
            // InternalBSharp.g:6382:2: ( rule__Instance__Group_5__0 )*
            {
             before(grammarAccess.getInstanceAccess().getGroup_5()); 
            // InternalBSharp.g:6383:2: ( rule__Instance__Group_5__0 )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==40) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // InternalBSharp.g:6383:3: rule__Instance__Group_5__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__Instance__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop59;
                }
            } while (true);

             after(grammarAccess.getInstanceAccess().getGroup_5()); 

            }


            }

        }
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
    // InternalBSharp.g:6391:1: rule__Instance__Group__6 : rule__Instance__Group__6__Impl ;
    public final void rule__Instance__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6395:1: ( rule__Instance__Group__6__Impl )
            // InternalBSharp.g:6396:2: rule__Instance__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Instance__Group__6__Impl();

            state._fsp--;


            }

        }
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
    // InternalBSharp.g:6402:1: rule__Instance__Group__6__Impl : ( ')' ) ;
    public final void rule__Instance__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6406:1: ( ( ')' ) )
            // InternalBSharp.g:6407:1: ( ')' )
            {
            // InternalBSharp.g:6407:1: ( ')' )
            // InternalBSharp.g:6408:2: ')'
            {
             before(grammarAccess.getInstanceAccess().getRightParenthesisKeyword_6()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getInstanceAccess().getRightParenthesisKeyword_6()); 

            }


            }

        }
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


    // $ANTLR start "rule__Instance__Group_5__0"
    // InternalBSharp.g:6418:1: rule__Instance__Group_5__0 : rule__Instance__Group_5__0__Impl rule__Instance__Group_5__1 ;
    public final void rule__Instance__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6422:1: ( rule__Instance__Group_5__0__Impl rule__Instance__Group_5__1 )
            // InternalBSharp.g:6423:2: rule__Instance__Group_5__0__Impl rule__Instance__Group_5__1
            {
            pushFollow(FOLLOW_28);
            rule__Instance__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Instance__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__Group_5__0"


    // $ANTLR start "rule__Instance__Group_5__0__Impl"
    // InternalBSharp.g:6430:1: rule__Instance__Group_5__0__Impl : ( ',' ) ;
    public final void rule__Instance__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6434:1: ( ( ',' ) )
            // InternalBSharp.g:6435:1: ( ',' )
            {
            // InternalBSharp.g:6435:1: ( ',' )
            // InternalBSharp.g:6436:2: ','
            {
             before(grammarAccess.getInstanceAccess().getCommaKeyword_5_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getInstanceAccess().getCommaKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__Group_5__0__Impl"


    // $ANTLR start "rule__Instance__Group_5__1"
    // InternalBSharp.g:6445:1: rule__Instance__Group_5__1 : rule__Instance__Group_5__1__Impl ;
    public final void rule__Instance__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6449:1: ( rule__Instance__Group_5__1__Impl )
            // InternalBSharp.g:6450:2: rule__Instance__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Instance__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__Group_5__1"


    // $ANTLR start "rule__Instance__Group_5__1__Impl"
    // InternalBSharp.g:6456:1: rule__Instance__Group_5__1__Impl : ( ( rule__Instance__ArgumentsAssignment_5_1 ) ) ;
    public final void rule__Instance__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6460:1: ( ( ( rule__Instance__ArgumentsAssignment_5_1 ) ) )
            // InternalBSharp.g:6461:1: ( ( rule__Instance__ArgumentsAssignment_5_1 ) )
            {
            // InternalBSharp.g:6461:1: ( ( rule__Instance__ArgumentsAssignment_5_1 ) )
            // InternalBSharp.g:6462:2: ( rule__Instance__ArgumentsAssignment_5_1 )
            {
             before(grammarAccess.getInstanceAccess().getArgumentsAssignment_5_1()); 
            // InternalBSharp.g:6463:2: ( rule__Instance__ArgumentsAssignment_5_1 )
            // InternalBSharp.g:6463:3: rule__Instance__ArgumentsAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Instance__ArgumentsAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getInstanceAccess().getArgumentsAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__Group_5__1__Impl"


    // $ANTLR start "rule__TopLevel__NameAssignment_1"
    // InternalBSharp.g:6472:1: rule__TopLevel__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__TopLevel__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6476:1: ( ( ruleQualifiedName ) )
            // InternalBSharp.g:6477:2: ( ruleQualifiedName )
            {
            // InternalBSharp.g:6477:2: ( ruleQualifiedName )
            // InternalBSharp.g:6478:3: ruleQualifiedName
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
    // InternalBSharp.g:6487:1: rule__TopLevel__TopLevelFileAssignment_2 : ( ruleTopLevelFile ) ;
    public final void rule__TopLevel__TopLevelFileAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6491:1: ( ( ruleTopLevelFile ) )
            // InternalBSharp.g:6492:2: ( ruleTopLevelFile )
            {
            // InternalBSharp.g:6492:2: ( ruleTopLevelFile )
            // InternalBSharp.g:6493:3: ruleTopLevelFile
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
    // InternalBSharp.g:6502:1: rule__TopLevelFile__NoImportElementsAssignment_1 : ( ruleBodyElements ) ;
    public final void rule__TopLevelFile__NoImportElementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6506:1: ( ( ruleBodyElements ) )
            // InternalBSharp.g:6507:2: ( ruleBodyElements )
            {
            // InternalBSharp.g:6507:2: ( ruleBodyElements )
            // InternalBSharp.g:6508:3: ruleBodyElements
            {
             before(grammarAccess.getTopLevelFileAccess().getNoImportElementsBodyElementsParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBodyElements();

            state._fsp--;

             after(grammarAccess.getTopLevelFileAccess().getNoImportElementsBodyElementsParserRuleCall_1_0()); 

            }


            }

        }
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
    // InternalBSharp.g:6517:1: rule__TopLevelFile__TopLevelImportsAssignment_2 : ( ruleTopLevelImport ) ;
    public final void rule__TopLevelFile__TopLevelImportsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6521:1: ( ( ruleTopLevelImport ) )
            // InternalBSharp.g:6522:2: ( ruleTopLevelImport )
            {
            // InternalBSharp.g:6522:2: ( ruleTopLevelImport )
            // InternalBSharp.g:6523:3: ruleTopLevelImport
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


    // $ANTLR start "rule__TopLevelImport__GlobalImportsAssignment_0_0"
    // InternalBSharp.g:6532:1: rule__TopLevelImport__GlobalImportsAssignment_0_0 : ( ruleGlobalImport ) ;
    public final void rule__TopLevelImport__GlobalImportsAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6536:1: ( ( ruleGlobalImport ) )
            // InternalBSharp.g:6537:2: ( ruleGlobalImport )
            {
            // InternalBSharp.g:6537:2: ( ruleGlobalImport )
            // InternalBSharp.g:6538:3: ruleGlobalImport
            {
             before(grammarAccess.getTopLevelImportAccess().getGlobalImportsGlobalImportParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleGlobalImport();

            state._fsp--;

             after(grammarAccess.getTopLevelImportAccess().getGlobalImportsGlobalImportParserRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopLevelImport__GlobalImportsAssignment_0_0"


    // $ANTLR start "rule__TopLevelImport__LocalImportsAssignment_0_1"
    // InternalBSharp.g:6547:1: rule__TopLevelImport__LocalImportsAssignment_0_1 : ( ruleLocalImport ) ;
    public final void rule__TopLevelImport__LocalImportsAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6551:1: ( ( ruleLocalImport ) )
            // InternalBSharp.g:6552:2: ( ruleLocalImport )
            {
            // InternalBSharp.g:6552:2: ( ruleLocalImport )
            // InternalBSharp.g:6553:3: ruleLocalImport
            {
             before(grammarAccess.getTopLevelImportAccess().getLocalImportsLocalImportParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLocalImport();

            state._fsp--;

             after(grammarAccess.getTopLevelImportAccess().getLocalImportsLocalImportParserRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopLevelImport__LocalImportsAssignment_0_1"


    // $ANTLR start "rule__TopLevelImport__BodyElementsAssignment_1"
    // InternalBSharp.g:6562:1: rule__TopLevelImport__BodyElementsAssignment_1 : ( ruleBodyElements ) ;
    public final void rule__TopLevelImport__BodyElementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6566:1: ( ( ruleBodyElements ) )
            // InternalBSharp.g:6567:2: ( ruleBodyElements )
            {
            // InternalBSharp.g:6567:2: ( ruleBodyElements )
            // InternalBSharp.g:6568:3: ruleBodyElements
            {
             before(grammarAccess.getTopLevelImportAccess().getBodyElementsBodyElementsParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBodyElements();

            state._fsp--;

             after(grammarAccess.getTopLevelImportAccess().getBodyElementsBodyElementsParserRuleCall_1_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__BodyElements__ClassesAssignment_0"
    // InternalBSharp.g:6577:1: rule__BodyElements__ClassesAssignment_0 : ( ruleClassDecl ) ;
    public final void rule__BodyElements__ClassesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6581:1: ( ( ruleClassDecl ) )
            // InternalBSharp.g:6582:2: ( ruleClassDecl )
            {
            // InternalBSharp.g:6582:2: ( ruleClassDecl )
            // InternalBSharp.g:6583:3: ruleClassDecl
            {
             before(grammarAccess.getBodyElementsAccess().getClassesClassDeclParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleClassDecl();

            state._fsp--;

             after(grammarAccess.getBodyElementsAccess().getClassesClassDeclParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BodyElements__ClassesAssignment_0"


    // $ANTLR start "rule__BodyElements__ExtendsAssignment_1"
    // InternalBSharp.g:6592:1: rule__BodyElements__ExtendsAssignment_1 : ( ruleExtend ) ;
    public final void rule__BodyElements__ExtendsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6596:1: ( ( ruleExtend ) )
            // InternalBSharp.g:6597:2: ( ruleExtend )
            {
            // InternalBSharp.g:6597:2: ( ruleExtend )
            // InternalBSharp.g:6598:3: ruleExtend
            {
             before(grammarAccess.getBodyElementsAccess().getExtendsExtendParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExtend();

            state._fsp--;

             after(grammarAccess.getBodyElementsAccess().getExtendsExtendParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BodyElements__ExtendsAssignment_1"


    // $ANTLR start "rule__BodyElements__InstancesAssignment_2"
    // InternalBSharp.g:6607:1: rule__BodyElements__InstancesAssignment_2 : ( ruleInstance ) ;
    public final void rule__BodyElements__InstancesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6611:1: ( ( ruleInstance ) )
            // InternalBSharp.g:6612:2: ( ruleInstance )
            {
            // InternalBSharp.g:6612:2: ( ruleInstance )
            // InternalBSharp.g:6613:3: ruleInstance
            {
             before(grammarAccess.getBodyElementsAccess().getInstancesInstanceParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleInstance();

            state._fsp--;

             after(grammarAccess.getBodyElementsAccess().getInstancesInstanceParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BodyElements__InstancesAssignment_2"


    // $ANTLR start "rule__GlobalImport__ProjectAssignment_1"
    // InternalBSharp.g:6622:1: rule__GlobalImport__ProjectAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__GlobalImport__ProjectAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6626:1: ( ( ruleQualifiedName ) )
            // InternalBSharp.g:6627:2: ( ruleQualifiedName )
            {
            // InternalBSharp.g:6627:2: ( ruleQualifiedName )
            // InternalBSharp.g:6628:3: ruleQualifiedName
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
    // InternalBSharp.g:6637:1: rule__GlobalImport__FileImportsAssignment_3 : ( ruleFileImport ) ;
    public final void rule__GlobalImport__FileImportsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6641:1: ( ( ruleFileImport ) )
            // InternalBSharp.g:6642:2: ( ruleFileImport )
            {
            // InternalBSharp.g:6642:2: ( ruleFileImport )
            // InternalBSharp.g:6643:3: ruleFileImport
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


    // $ANTLR start "rule__FileImport__FileNameAssignment_0"
    // InternalBSharp.g:6652:1: rule__FileImport__FileNameAssignment_0 : ( RULE_ID ) ;
    public final void rule__FileImport__FileNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6656:1: ( ( RULE_ID ) )
            // InternalBSharp.g:6657:2: ( RULE_ID )
            {
            // InternalBSharp.g:6657:2: ( RULE_ID )
            // InternalBSharp.g:6658:3: RULE_ID
            {
             before(grammarAccess.getFileImportAccess().getFileNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFileImportAccess().getFileNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileImport__FileNameAssignment_0"


    // $ANTLR start "rule__FileImport__TypeAssignment_1_1_1"
    // InternalBSharp.g:6667:1: rule__FileImport__TypeAssignment_1_1_1 : ( RULE_ID ) ;
    public final void rule__FileImport__TypeAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6671:1: ( ( RULE_ID ) )
            // InternalBSharp.g:6672:2: ( RULE_ID )
            {
            // InternalBSharp.g:6672:2: ( RULE_ID )
            // InternalBSharp.g:6673:3: RULE_ID
            {
             before(grammarAccess.getFileImportAccess().getTypeIDTerminalRuleCall_1_1_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFileImportAccess().getTypeIDTerminalRuleCall_1_1_1_0()); 

            }


            }

        }
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
    // InternalBSharp.g:6682:1: rule__LocalImport__FileImportsAssignment_1 : ( ruleFileImport ) ;
    public final void rule__LocalImport__FileImportsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6686:1: ( ( ruleFileImport ) )
            // InternalBSharp.g:6687:2: ( ruleFileImport )
            {
            // InternalBSharp.g:6687:2: ( ruleFileImport )
            // InternalBSharp.g:6688:3: ruleFileImport
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
    // InternalBSharp.g:6697:1: rule__Class__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Class__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6701:1: ( ( RULE_ID ) )
            // InternalBSharp.g:6702:2: ( RULE_ID )
            {
            // InternalBSharp.g:6702:2: ( RULE_ID )
            // InternalBSharp.g:6703:3: RULE_ID
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


    // $ANTLR start "rule__Class__ContextAssignment_2"
    // InternalBSharp.g:6712:1: rule__Class__ContextAssignment_2 : ( rulePolyContext ) ;
    public final void rule__Class__ContextAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6716:1: ( ( rulePolyContext ) )
            // InternalBSharp.g:6717:2: ( rulePolyContext )
            {
            // InternalBSharp.g:6717:2: ( rulePolyContext )
            // InternalBSharp.g:6718:3: rulePolyContext
            {
             before(grammarAccess.getClassAccess().getContextPolyContextParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePolyContext();

            state._fsp--;

             after(grammarAccess.getClassAccess().getContextPolyContextParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__ContextAssignment_2"


    // $ANTLR start "rule__Class__SupertypesAssignment_3"
    // InternalBSharp.g:6727:1: rule__Class__SupertypesAssignment_3 : ( ruleSuperTypeList ) ;
    public final void rule__Class__SupertypesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6731:1: ( ( ruleSuperTypeList ) )
            // InternalBSharp.g:6732:2: ( ruleSuperTypeList )
            {
            // InternalBSharp.g:6732:2: ( ruleSuperTypeList )
            // InternalBSharp.g:6733:3: ruleSuperTypeList
            {
             before(grammarAccess.getClassAccess().getSupertypesSuperTypeListParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleSuperTypeList();

            state._fsp--;

             after(grammarAccess.getClassAccess().getSupertypesSuperTypeListParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__SupertypesAssignment_3"


    // $ANTLR start "rule__Class__VarListAssignment_4"
    // InternalBSharp.g:6742:1: rule__Class__VarListAssignment_4 : ( ruleTypeStructure ) ;
    public final void rule__Class__VarListAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6746:1: ( ( ruleTypeStructure ) )
            // InternalBSharp.g:6747:2: ( ruleTypeStructure )
            {
            // InternalBSharp.g:6747:2: ( ruleTypeStructure )
            // InternalBSharp.g:6748:3: ruleTypeStructure
            {
             before(grammarAccess.getClassAccess().getVarListTypeStructureParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleTypeStructure();

            state._fsp--;

             after(grammarAccess.getClassAccess().getVarListTypeStructureParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__VarListAssignment_4"


    // $ANTLR start "rule__Class__WhereAssignment_5"
    // InternalBSharp.g:6757:1: rule__Class__WhereAssignment_5 : ( ruleWhere ) ;
    public final void rule__Class__WhereAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6761:1: ( ( ruleWhere ) )
            // InternalBSharp.g:6762:2: ( ruleWhere )
            {
            // InternalBSharp.g:6762:2: ( ruleWhere )
            // InternalBSharp.g:6763:3: ruleWhere
            {
             before(grammarAccess.getClassAccess().getWhereWhereParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleWhere();

            state._fsp--;

             after(grammarAccess.getClassAccess().getWhereWhereParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__WhereAssignment_5"


    // $ANTLR start "rule__Class__BlockAssignment_7"
    // InternalBSharp.g:6772:1: rule__Class__BlockAssignment_7 : ( ruleBSharpBlock ) ;
    public final void rule__Class__BlockAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6776:1: ( ( ruleBSharpBlock ) )
            // InternalBSharp.g:6777:2: ( ruleBSharpBlock )
            {
            // InternalBSharp.g:6777:2: ( ruleBSharpBlock )
            // InternalBSharp.g:6778:3: ruleBSharpBlock
            {
             before(grammarAccess.getClassAccess().getBlockBSharpBlockParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleBSharpBlock();

            state._fsp--;

             after(grammarAccess.getClassAccess().getBlockBSharpBlockParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__BlockAssignment_7"


    // $ANTLR start "rule__PolyContext__PolyTypesAssignment_1"
    // InternalBSharp.g:6787:1: rule__PolyContext__PolyTypesAssignment_1 : ( rulePolyType ) ;
    public final void rule__PolyContext__PolyTypesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6791:1: ( ( rulePolyType ) )
            // InternalBSharp.g:6792:2: ( rulePolyType )
            {
            // InternalBSharp.g:6792:2: ( rulePolyType )
            // InternalBSharp.g:6793:3: rulePolyType
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
    // InternalBSharp.g:6802:1: rule__PolyType__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__PolyType__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6806:1: ( ( RULE_ID ) )
            // InternalBSharp.g:6807:2: ( RULE_ID )
            {
            // InternalBSharp.g:6807:2: ( RULE_ID )
            // InternalBSharp.g:6808:3: RULE_ID
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
    // InternalBSharp.g:6817:1: rule__PolyType__SuperTypesAssignment_1_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__PolyType__SuperTypesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6821:1: ( ( ( ruleQualifiedName ) ) )
            // InternalBSharp.g:6822:2: ( ( ruleQualifiedName ) )
            {
            // InternalBSharp.g:6822:2: ( ( ruleQualifiedName ) )
            // InternalBSharp.g:6823:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getPolyTypeAccess().getSuperTypesClassDeclCrossReference_1_1_0()); 
            // InternalBSharp.g:6824:3: ( ruleQualifiedName )
            // InternalBSharp.g:6825:4: ruleQualifiedName
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
    // InternalBSharp.g:6836:1: rule__PolyType__SuperTypesAssignment_1_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__PolyType__SuperTypesAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6840:1: ( ( ( ruleQualifiedName ) ) )
            // InternalBSharp.g:6841:2: ( ( ruleQualifiedName ) )
            {
            // InternalBSharp.g:6841:2: ( ( ruleQualifiedName ) )
            // InternalBSharp.g:6842:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getPolyTypeAccess().getSuperTypesClassDeclCrossReference_1_2_1_0()); 
            // InternalBSharp.g:6843:3: ( ruleQualifiedName )
            // InternalBSharp.g:6844:4: ruleQualifiedName
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
    // InternalBSharp.g:6855:1: rule__SuperTypeList__SuperTypesAssignment_1 : ( ruleConstructedType ) ;
    public final void rule__SuperTypeList__SuperTypesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6859:1: ( ( ruleConstructedType ) )
            // InternalBSharp.g:6860:2: ( ruleConstructedType )
            {
            // InternalBSharp.g:6860:2: ( ruleConstructedType )
            // InternalBSharp.g:6861:3: ruleConstructedType
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
    // InternalBSharp.g:6870:1: rule__SuperTypeList__SuperTypesAssignment_2_1 : ( ruleConstructedType ) ;
    public final void rule__SuperTypeList__SuperTypesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6874:1: ( ( ruleConstructedType ) )
            // InternalBSharp.g:6875:2: ( ruleConstructedType )
            {
            // InternalBSharp.g:6875:2: ( ruleConstructedType )
            // InternalBSharp.g:6876:3: ruleConstructedType
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
    // InternalBSharp.g:6885:1: rule__ConstructedType__ConstructorAssignment_1_1 : ( ( rule__ConstructedType__ConstructorAlternatives_1_1_0 ) ) ;
    public final void rule__ConstructedType__ConstructorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6889:1: ( ( ( rule__ConstructedType__ConstructorAlternatives_1_1_0 ) ) )
            // InternalBSharp.g:6890:2: ( ( rule__ConstructedType__ConstructorAlternatives_1_1_0 ) )
            {
            // InternalBSharp.g:6890:2: ( ( rule__ConstructedType__ConstructorAlternatives_1_1_0 ) )
            // InternalBSharp.g:6891:3: ( rule__ConstructedType__ConstructorAlternatives_1_1_0 )
            {
             before(grammarAccess.getConstructedTypeAccess().getConstructorAlternatives_1_1_0()); 
            // InternalBSharp.g:6892:3: ( rule__ConstructedType__ConstructorAlternatives_1_1_0 )
            // InternalBSharp.g:6892:4: rule__ConstructedType__ConstructorAlternatives_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__ConstructedType__ConstructorAlternatives_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getConstructedTypeAccess().getConstructorAlternatives_1_1_0()); 

            }


            }

        }
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
    // InternalBSharp.g:6900:1: rule__ConstructedType__RightAssignment_1_2 : ( ( rule__ConstructedType__RightAlternatives_1_2_0 ) ) ;
    public final void rule__ConstructedType__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6904:1: ( ( ( rule__ConstructedType__RightAlternatives_1_2_0 ) ) )
            // InternalBSharp.g:6905:2: ( ( rule__ConstructedType__RightAlternatives_1_2_0 ) )
            {
            // InternalBSharp.g:6905:2: ( ( rule__ConstructedType__RightAlternatives_1_2_0 ) )
            // InternalBSharp.g:6906:3: ( rule__ConstructedType__RightAlternatives_1_2_0 )
            {
             before(grammarAccess.getConstructedTypeAccess().getRightAlternatives_1_2_0()); 
            // InternalBSharp.g:6907:3: ( rule__ConstructedType__RightAlternatives_1_2_0 )
            // InternalBSharp.g:6907:4: rule__ConstructedType__RightAlternatives_1_2_0
            {
            pushFollow(FOLLOW_2);
            rule__ConstructedType__RightAlternatives_1_2_0();

            state._fsp--;


            }

             after(grammarAccess.getConstructedTypeAccess().getRightAlternatives_1_2_0()); 

            }


            }

        }
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
    // InternalBSharp.g:6915:1: rule__TypeConstructor__TypeNameAssignment_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__TypeConstructor__TypeNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6919:1: ( ( ( ruleQualifiedName ) ) )
            // InternalBSharp.g:6920:2: ( ( ruleQualifiedName ) )
            {
            // InternalBSharp.g:6920:2: ( ( ruleQualifiedName ) )
            // InternalBSharp.g:6921:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getTypeConstructorAccess().getTypeNameGenNameCrossReference_0_0()); 
            // InternalBSharp.g:6922:3: ( ruleQualifiedName )
            // InternalBSharp.g:6923:4: ruleQualifiedName
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
    // InternalBSharp.g:6934:1: rule__TypeConstructor__ContextAssignment_1 : ( ruleTypeDeclContext ) ;
    public final void rule__TypeConstructor__ContextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6938:1: ( ( ruleTypeDeclContext ) )
            // InternalBSharp.g:6939:2: ( ruleTypeDeclContext )
            {
            // InternalBSharp.g:6939:2: ( ruleTypeDeclContext )
            // InternalBSharp.g:6940:3: ruleTypeDeclContext
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


    // $ANTLR start "rule__TypeConstrBracket__ChildAssignment_1"
    // InternalBSharp.g:6949:1: rule__TypeConstrBracket__ChildAssignment_1 : ( ruleConstructedType ) ;
    public final void rule__TypeConstrBracket__ChildAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6953:1: ( ( ruleConstructedType ) )
            // InternalBSharp.g:6954:2: ( ruleConstructedType )
            {
            // InternalBSharp.g:6954:2: ( ruleConstructedType )
            // InternalBSharp.g:6955:3: ruleConstructedType
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
    // InternalBSharp.g:6964:1: rule__TypeDeclContext__TypeNameAssignment_1 : ( ruleConstructedType ) ;
    public final void rule__TypeDeclContext__TypeNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6968:1: ( ( ruleConstructedType ) )
            // InternalBSharp.g:6969:2: ( ruleConstructedType )
            {
            // InternalBSharp.g:6969:2: ( ruleConstructedType )
            // InternalBSharp.g:6970:3: ruleConstructedType
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
    // InternalBSharp.g:6979:1: rule__TypeDeclContext__TypeNameAssignment_2_1 : ( ruleConstructedType ) ;
    public final void rule__TypeDeclContext__TypeNameAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6983:1: ( ( ruleConstructedType ) )
            // InternalBSharp.g:6984:2: ( ruleConstructedType )
            {
            // InternalBSharp.g:6984:2: ( ruleConstructedType )
            // InternalBSharp.g:6985:3: ruleConstructedType
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


    // $ANTLR start "rule__TypeStructure__VariablesAssignment_1"
    // InternalBSharp.g:6994:1: rule__TypeStructure__VariablesAssignment_1 : ( ruleTypedVariableList ) ;
    public final void rule__TypeStructure__VariablesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6998:1: ( ( ruleTypedVariableList ) )
            // InternalBSharp.g:6999:2: ( ruleTypedVariableList )
            {
            // InternalBSharp.g:6999:2: ( ruleTypedVariableList )
            // InternalBSharp.g:7000:3: ruleTypedVariableList
            {
             before(grammarAccess.getTypeStructureAccess().getVariablesTypedVariableListParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTypedVariableList();

            state._fsp--;

             after(grammarAccess.getTypeStructureAccess().getVariablesTypedVariableListParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeStructure__VariablesAssignment_1"


    // $ANTLR start "rule__Where__ExpessionsAssignment_1"
    // InternalBSharp.g:7009:1: rule__Where__ExpessionsAssignment_1 : ( ruleQuantifier ) ;
    public final void rule__Where__ExpessionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7013:1: ( ( ruleQuantifier ) )
            // InternalBSharp.g:7014:2: ( ruleQuantifier )
            {
            // InternalBSharp.g:7014:2: ( ruleQuantifier )
            // InternalBSharp.g:7015:3: ruleQuantifier
            {
             before(grammarAccess.getWhereAccess().getExpessionsQuantifierParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQuantifier();

            state._fsp--;

             after(grammarAccess.getWhereAccess().getExpessionsQuantifierParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Where__ExpessionsAssignment_1"


    // $ANTLR start "rule__Where__ExpressionsAssignment_2_1"
    // InternalBSharp.g:7024:1: rule__Where__ExpressionsAssignment_2_1 : ( ruleRootExpression ) ;
    public final void rule__Where__ExpressionsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7028:1: ( ( ruleRootExpression ) )
            // InternalBSharp.g:7029:2: ( ruleRootExpression )
            {
            // InternalBSharp.g:7029:2: ( ruleRootExpression )
            // InternalBSharp.g:7030:3: ruleRootExpression
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
    // InternalBSharp.g:7039:1: rule__Datatype__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Datatype__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7043:1: ( ( RULE_ID ) )
            // InternalBSharp.g:7044:2: ( RULE_ID )
            {
            // InternalBSharp.g:7044:2: ( RULE_ID )
            // InternalBSharp.g:7045:3: RULE_ID
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


    // $ANTLR start "rule__Datatype__ContextAssignment_2"
    // InternalBSharp.g:7054:1: rule__Datatype__ContextAssignment_2 : ( rulePolyContext ) ;
    public final void rule__Datatype__ContextAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7058:1: ( ( rulePolyContext ) )
            // InternalBSharp.g:7059:2: ( rulePolyContext )
            {
            // InternalBSharp.g:7059:2: ( rulePolyContext )
            // InternalBSharp.g:7060:3: rulePolyContext
            {
             before(grammarAccess.getDatatypeAccess().getContextPolyContextParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePolyContext();

            state._fsp--;

             after(grammarAccess.getDatatypeAccess().getContextPolyContextParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Datatype__ContextAssignment_2"


    // $ANTLR start "rule__Datatype__ConstructorsAssignment_3_1"
    // InternalBSharp.g:7069:1: rule__Datatype__ConstructorsAssignment_3_1 : ( ruleDatatypeConstructor ) ;
    public final void rule__Datatype__ConstructorsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7073:1: ( ( ruleDatatypeConstructor ) )
            // InternalBSharp.g:7074:2: ( ruleDatatypeConstructor )
            {
            // InternalBSharp.g:7074:2: ( ruleDatatypeConstructor )
            // InternalBSharp.g:7075:3: ruleDatatypeConstructor
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
    // InternalBSharp.g:7084:1: rule__Datatype__BlockAssignment_4 : ( ruleBSharpBlock ) ;
    public final void rule__Datatype__BlockAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7088:1: ( ( ruleBSharpBlock ) )
            // InternalBSharp.g:7089:2: ( ruleBSharpBlock )
            {
            // InternalBSharp.g:7089:2: ( ruleBSharpBlock )
            // InternalBSharp.g:7090:3: ruleBSharpBlock
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
    // InternalBSharp.g:7099:1: rule__DatatypeConstructor__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__DatatypeConstructor__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7103:1: ( ( RULE_ID ) )
            // InternalBSharp.g:7104:2: ( RULE_ID )
            {
            // InternalBSharp.g:7104:2: ( RULE_ID )
            // InternalBSharp.g:7105:3: RULE_ID
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
    // InternalBSharp.g:7114:1: rule__DatatypeConstructor__DeconsAssignment_1_1 : ( ruleTypedVariableList ) ;
    public final void rule__DatatypeConstructor__DeconsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7118:1: ( ( ruleTypedVariableList ) )
            // InternalBSharp.g:7119:2: ( ruleTypedVariableList )
            {
            // InternalBSharp.g:7119:2: ( ruleTypedVariableList )
            // InternalBSharp.g:7120:3: ruleTypedVariableList
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
    // InternalBSharp.g:7129:1: rule__Extend__ExtendedClassAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Extend__ExtendedClassAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7133:1: ( ( ( ruleQualifiedName ) ) )
            // InternalBSharp.g:7134:2: ( ( ruleQualifiedName ) )
            {
            // InternalBSharp.g:7134:2: ( ( ruleQualifiedName ) )
            // InternalBSharp.g:7135:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getExtendAccess().getExtendedClassClassDeclCrossReference_1_0()); 
            // InternalBSharp.g:7136:3: ( ruleQualifiedName )
            // InternalBSharp.g:7137:4: ruleQualifiedName
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
    // InternalBSharp.g:7148:1: rule__Extend__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Extend__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7152:1: ( ( RULE_ID ) )
            // InternalBSharp.g:7153:2: ( RULE_ID )
            {
            // InternalBSharp.g:7153:2: ( RULE_ID )
            // InternalBSharp.g:7154:3: RULE_ID
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
    // InternalBSharp.g:7163:1: rule__Extend__BlockAssignment_5 : ( ruleBSharpBlock ) ;
    public final void rule__Extend__BlockAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7167:1: ( ( ruleBSharpBlock ) )
            // InternalBSharp.g:7168:2: ( ruleBSharpBlock )
            {
            // InternalBSharp.g:7168:2: ( ruleBSharpBlock )
            // InternalBSharp.g:7169:3: ruleBSharpBlock
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


    // $ANTLR start "rule__BSharpBlock__BodyElementsAssignment_2"
    // InternalBSharp.g:7178:1: rule__BSharpBlock__BodyElementsAssignment_2 : ( ruleTypeBodyElements ) ;
    public final void rule__BSharpBlock__BodyElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7182:1: ( ( ruleTypeBodyElements ) )
            // InternalBSharp.g:7183:2: ( ruleTypeBodyElements )
            {
            // InternalBSharp.g:7183:2: ( ruleTypeBodyElements )
            // InternalBSharp.g:7184:3: ruleTypeBodyElements
            {
             before(grammarAccess.getBSharpBlockAccess().getBodyElementsTypeBodyElementsParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTypeBodyElements();

            state._fsp--;

             after(grammarAccess.getBSharpBlockAccess().getBodyElementsTypeBodyElementsParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSharpBlock__BodyElementsAssignment_2"


    // $ANTLR start "rule__TypeBodyElements__FunctionsAssignment_0"
    // InternalBSharp.g:7193:1: rule__TypeBodyElements__FunctionsAssignment_0 : ( ruleFunctionDecl ) ;
    public final void rule__TypeBodyElements__FunctionsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7197:1: ( ( ruleFunctionDecl ) )
            // InternalBSharp.g:7198:2: ( ruleFunctionDecl )
            {
            // InternalBSharp.g:7198:2: ( ruleFunctionDecl )
            // InternalBSharp.g:7199:3: ruleFunctionDecl
            {
             before(grammarAccess.getTypeBodyElementsAccess().getFunctionsFunctionDeclParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleFunctionDecl();

            state._fsp--;

             after(grammarAccess.getTypeBodyElementsAccess().getFunctionsFunctionDeclParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeBodyElements__FunctionsAssignment_0"


    // $ANTLR start "rule__TypeBodyElements__TheoremsAssignment_1"
    // InternalBSharp.g:7208:1: rule__TypeBodyElements__TheoremsAssignment_1 : ( ruleTheoremBody ) ;
    public final void rule__TypeBodyElements__TheoremsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7212:1: ( ( ruleTheoremBody ) )
            // InternalBSharp.g:7213:2: ( ruleTheoremBody )
            {
            // InternalBSharp.g:7213:2: ( ruleTheoremBody )
            // InternalBSharp.g:7214:3: ruleTheoremBody
            {
             before(grammarAccess.getTypeBodyElementsAccess().getTheoremsTheoremBodyParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTheoremBody();

            state._fsp--;

             after(grammarAccess.getTypeBodyElementsAccess().getTheoremsTheoremBodyParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeBodyElements__TheoremsAssignment_1"


    // $ANTLR start "rule__FunctionDecl__NameAssignment_0"
    // InternalBSharp.g:7223:1: rule__FunctionDecl__NameAssignment_0 : ( ruleFunctionName ) ;
    public final void rule__FunctionDecl__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7227:1: ( ( ruleFunctionName ) )
            // InternalBSharp.g:7228:2: ( ruleFunctionName )
            {
            // InternalBSharp.g:7228:2: ( ruleFunctionName )
            // InternalBSharp.g:7229:3: ruleFunctionName
            {
             before(grammarAccess.getFunctionDeclAccess().getNameFunctionNameParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleFunctionName();

            state._fsp--;

             after(grammarAccess.getFunctionDeclAccess().getNameFunctionNameParserRuleCall_0_0()); 

            }


            }

        }
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
    // InternalBSharp.g:7238:1: rule__FunctionDecl__ContextAssignment_1 : ( rulePolyContext ) ;
    public final void rule__FunctionDecl__ContextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7242:1: ( ( rulePolyContext ) )
            // InternalBSharp.g:7243:2: ( rulePolyContext )
            {
            // InternalBSharp.g:7243:2: ( rulePolyContext )
            // InternalBSharp.g:7244:3: rulePolyContext
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
    // InternalBSharp.g:7253:1: rule__FunctionDecl__VarListAssignment_3 : ( ruleTypedVariableList ) ;
    public final void rule__FunctionDecl__VarListAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7257:1: ( ( ruleTypedVariableList ) )
            // InternalBSharp.g:7258:2: ( ruleTypedVariableList )
            {
            // InternalBSharp.g:7258:2: ( ruleTypedVariableList )
            // InternalBSharp.g:7259:3: ruleTypedVariableList
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
    // InternalBSharp.g:7268:1: rule__FunctionDecl__ReturnTypeAssignment_6 : ( ruleTypeConstructor ) ;
    public final void rule__FunctionDecl__ReturnTypeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7272:1: ( ( ruleTypeConstructor ) )
            // InternalBSharp.g:7273:2: ( ruleTypeConstructor )
            {
            // InternalBSharp.g:7273:2: ( ruleTypeConstructor )
            // InternalBSharp.g:7274:3: ruleTypeConstructor
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
    // InternalBSharp.g:7283:1: rule__FunctionDecl__InfixAssignment_7 : ( ( 'INFIX' ) ) ;
    public final void rule__FunctionDecl__InfixAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7287:1: ( ( ( 'INFIX' ) ) )
            // InternalBSharp.g:7288:2: ( ( 'INFIX' ) )
            {
            // InternalBSharp.g:7288:2: ( ( 'INFIX' ) )
            // InternalBSharp.g:7289:3: ( 'INFIX' )
            {
             before(grammarAccess.getFunctionDeclAccess().getInfixINFIXKeyword_7_0()); 
            // InternalBSharp.g:7290:3: ( 'INFIX' )
            // InternalBSharp.g:7291:4: 'INFIX'
            {
             before(grammarAccess.getFunctionDeclAccess().getInfixINFIXKeyword_7_0()); 
            match(input,53,FOLLOW_2); 
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
    // InternalBSharp.g:7302:1: rule__FunctionDecl__PrecedenceAssignment_8 : ( RULE_INT ) ;
    public final void rule__FunctionDecl__PrecedenceAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7306:1: ( ( RULE_INT ) )
            // InternalBSharp.g:7307:2: ( RULE_INT )
            {
            // InternalBSharp.g:7307:2: ( RULE_INT )
            // InternalBSharp.g:7308:3: RULE_INT
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
    // InternalBSharp.g:7317:1: rule__FunctionDecl__ExprAssignment_9 : ( ruleRootExpression ) ;
    public final void rule__FunctionDecl__ExprAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7321:1: ( ( ruleRootExpression ) )
            // InternalBSharp.g:7322:2: ( ruleRootExpression )
            {
            // InternalBSharp.g:7322:2: ( ruleRootExpression )
            // InternalBSharp.g:7323:3: ruleRootExpression
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


    // $ANTLR start "rule__FunctionName__NameAssignment"
    // InternalBSharp.g:7332:1: rule__FunctionName__NameAssignment : ( RULE_ID ) ;
    public final void rule__FunctionName__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7336:1: ( ( RULE_ID ) )
            // InternalBSharp.g:7337:2: ( RULE_ID )
            {
            // InternalBSharp.g:7337:2: ( RULE_ID )
            // InternalBSharp.g:7338:3: RULE_ID
            {
             before(grammarAccess.getFunctionNameAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFunctionNameAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionName__NameAssignment"


    // $ANTLR start "rule__MatchStatement__MatchAssignment_1"
    // InternalBSharp.g:7347:1: rule__MatchStatement__MatchAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__MatchStatement__MatchAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7351:1: ( ( ( RULE_ID ) ) )
            // InternalBSharp.g:7352:2: ( ( RULE_ID ) )
            {
            // InternalBSharp.g:7352:2: ( ( RULE_ID ) )
            // InternalBSharp.g:7353:3: ( RULE_ID )
            {
             before(grammarAccess.getMatchStatementAccess().getMatchDatatypeConstructorCrossReference_1_0()); 
            // InternalBSharp.g:7354:3: ( RULE_ID )
            // InternalBSharp.g:7355:4: RULE_ID
            {
             before(grammarAccess.getMatchStatementAccess().getMatchDatatypeConstructorIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMatchStatementAccess().getMatchDatatypeConstructorIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getMatchStatementAccess().getMatchDatatypeConstructorCrossReference_1_0()); 

            }


            }

        }
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
    // InternalBSharp.g:7366:1: rule__MatchStatement__InductCaseAssignment_3 : ( ruleMatchCase ) ;
    public final void rule__MatchStatement__InductCaseAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7370:1: ( ( ruleMatchCase ) )
            // InternalBSharp.g:7371:2: ( ruleMatchCase )
            {
            // InternalBSharp.g:7371:2: ( ruleMatchCase )
            // InternalBSharp.g:7372:3: ruleMatchCase
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
    // InternalBSharp.g:7381:1: rule__MatchStatement__InductCaseAssignment_4 : ( ruleMatchCase ) ;
    public final void rule__MatchStatement__InductCaseAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7385:1: ( ( ruleMatchCase ) )
            // InternalBSharp.g:7386:2: ( ruleMatchCase )
            {
            // InternalBSharp.g:7386:2: ( ruleMatchCase )
            // InternalBSharp.g:7387:3: ruleMatchCase
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
    // InternalBSharp.g:7396:1: rule__MatchCase__DeconNameAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__MatchCase__DeconNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7400:1: ( ( ( RULE_ID ) ) )
            // InternalBSharp.g:7401:2: ( ( RULE_ID ) )
            {
            // InternalBSharp.g:7401:2: ( ( RULE_ID ) )
            // InternalBSharp.g:7402:3: ( RULE_ID )
            {
             before(grammarAccess.getMatchCaseAccess().getDeconNameTypedVariableCrossReference_1_0()); 
            // InternalBSharp.g:7403:3: ( RULE_ID )
            // InternalBSharp.g:7404:4: RULE_ID
            {
             before(grammarAccess.getMatchCaseAccess().getDeconNameTypedVariableIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMatchCaseAccess().getDeconNameTypedVariableIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getMatchCaseAccess().getDeconNameTypedVariableCrossReference_1_0()); 

            }


            }

        }
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
    // InternalBSharp.g:7415:1: rule__MatchCase__VariablesAssignment_2_1 : ( ruleTypedVariable ) ;
    public final void rule__MatchCase__VariablesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7419:1: ( ( ruleTypedVariable ) )
            // InternalBSharp.g:7420:2: ( ruleTypedVariable )
            {
            // InternalBSharp.g:7420:2: ( ruleTypedVariable )
            // InternalBSharp.g:7421:3: ruleTypedVariable
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
    // InternalBSharp.g:7430:1: rule__MatchCase__VariablesAssignment_2_2_1 : ( ruleTypedVariable ) ;
    public final void rule__MatchCase__VariablesAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7434:1: ( ( ruleTypedVariable ) )
            // InternalBSharp.g:7435:2: ( ruleTypedVariable )
            {
            // InternalBSharp.g:7435:2: ( ruleTypedVariable )
            // InternalBSharp.g:7436:3: ruleTypedVariable
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
    // InternalBSharp.g:7445:1: rule__MatchCase__ExprAssignment_4 : ( ruleRootExpression ) ;
    public final void rule__MatchCase__ExprAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7449:1: ( ( ruleRootExpression ) )
            // InternalBSharp.g:7450:2: ( ruleRootExpression )
            {
            // InternalBSharp.g:7450:2: ( ruleRootExpression )
            // InternalBSharp.g:7451:3: ruleRootExpression
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
    // InternalBSharp.g:7460:1: rule__TheoremBody__TheoremDeclAssignment_2 : ( ruleTheoremDecl ) ;
    public final void rule__TheoremBody__TheoremDeclAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7464:1: ( ( ruleTheoremDecl ) )
            // InternalBSharp.g:7465:2: ( ruleTheoremDecl )
            {
            // InternalBSharp.g:7465:2: ( ruleTheoremDecl )
            // InternalBSharp.g:7466:3: ruleTheoremDecl
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
    // InternalBSharp.g:7475:1: rule__TheoremDecl__NameAssignment_0 : ( ruleTHM_NAME ) ;
    public final void rule__TheoremDecl__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7479:1: ( ( ruleTHM_NAME ) )
            // InternalBSharp.g:7480:2: ( ruleTHM_NAME )
            {
            // InternalBSharp.g:7480:2: ( ruleTHM_NAME )
            // InternalBSharp.g:7481:3: ruleTHM_NAME
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
    // InternalBSharp.g:7490:1: rule__TheoremDecl__ExprAssignment_1 : ( ruleRootExpression ) ;
    public final void rule__TheoremDecl__ExprAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7494:1: ( ( ruleRootExpression ) )
            // InternalBSharp.g:7495:2: ( ruleRootExpression )
            {
            // InternalBSharp.g:7495:2: ( ruleRootExpression )
            // InternalBSharp.g:7496:3: ruleRootExpression
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
    // InternalBSharp.g:7505:1: rule__TypedVariableList__VariablesOfTypeAssignment_0 : ( ruleVariableTyping ) ;
    public final void rule__TypedVariableList__VariablesOfTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7509:1: ( ( ruleVariableTyping ) )
            // InternalBSharp.g:7510:2: ( ruleVariableTyping )
            {
            // InternalBSharp.g:7510:2: ( ruleVariableTyping )
            // InternalBSharp.g:7511:3: ruleVariableTyping
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
    // InternalBSharp.g:7520:1: rule__TypedVariableList__VariablesOfTypeAssignment_1_1 : ( ruleVariableTyping ) ;
    public final void rule__TypedVariableList__VariablesOfTypeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7524:1: ( ( ruleVariableTyping ) )
            // InternalBSharp.g:7525:2: ( ruleVariableTyping )
            {
            // InternalBSharp.g:7525:2: ( ruleVariableTyping )
            // InternalBSharp.g:7526:3: ruleVariableTyping
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
    // InternalBSharp.g:7535:1: rule__VariableTyping__TypeVarAssignment_0 : ( ruleTypedVariable ) ;
    public final void rule__VariableTyping__TypeVarAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7539:1: ( ( ruleTypedVariable ) )
            // InternalBSharp.g:7540:2: ( ruleTypedVariable )
            {
            // InternalBSharp.g:7540:2: ( ruleTypedVariable )
            // InternalBSharp.g:7541:3: ruleTypedVariable
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
    // InternalBSharp.g:7550:1: rule__VariableTyping__TypeVarAssignment_1_1 : ( ruleTypedVariable ) ;
    public final void rule__VariableTyping__TypeVarAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7554:1: ( ( ruleTypedVariable ) )
            // InternalBSharp.g:7555:2: ( ruleTypedVariable )
            {
            // InternalBSharp.g:7555:2: ( ruleTypedVariable )
            // InternalBSharp.g:7556:3: ruleTypedVariable
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
    // InternalBSharp.g:7565:1: rule__VariableTyping__TypeAssignment_3 : ( ruleConstructedType ) ;
    public final void rule__VariableTyping__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7569:1: ( ( ruleConstructedType ) )
            // InternalBSharp.g:7570:2: ( ruleConstructedType )
            {
            // InternalBSharp.g:7570:2: ( ruleConstructedType )
            // InternalBSharp.g:7571:3: ruleConstructedType
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
    // InternalBSharp.g:7580:1: rule__TypedVariable__NameAssignment : ( RULE_ID ) ;
    public final void rule__TypedVariable__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7584:1: ( ( RULE_ID ) )
            // InternalBSharp.g:7585:2: ( RULE_ID )
            {
            // InternalBSharp.g:7585:2: ( RULE_ID )
            // InternalBSharp.g:7586:3: RULE_ID
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
    // InternalBSharp.g:7595:1: rule__Lambda__QTypeAssignment_0 : ( ( '\\u03BB' ) ) ;
    public final void rule__Lambda__QTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7599:1: ( ( ( '\\u03BB' ) ) )
            // InternalBSharp.g:7600:2: ( ( '\\u03BB' ) )
            {
            // InternalBSharp.g:7600:2: ( ( '\\u03BB' ) )
            // InternalBSharp.g:7601:3: ( '\\u03BB' )
            {
             before(grammarAccess.getLambdaAccess().getQTypeGreekSmallLetterLamdaKeyword_0_0()); 
            // InternalBSharp.g:7602:3: ( '\\u03BB' )
            // InternalBSharp.g:7603:4: '\\u03BB'
            {
             before(grammarAccess.getLambdaAccess().getQTypeGreekSmallLetterLamdaKeyword_0_0()); 
            match(input,54,FOLLOW_2); 
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
    // InternalBSharp.g:7614:1: rule__Lambda__ContextAssignment_1 : ( rulePolyContext ) ;
    public final void rule__Lambda__ContextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7618:1: ( ( rulePolyContext ) )
            // InternalBSharp.g:7619:2: ( rulePolyContext )
            {
            // InternalBSharp.g:7619:2: ( rulePolyContext )
            // InternalBSharp.g:7620:3: rulePolyContext
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
    // InternalBSharp.g:7629:1: rule__Lambda__VarListAssignment_2 : ( ruleTypedVariableList ) ;
    public final void rule__Lambda__VarListAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7633:1: ( ( ruleTypedVariableList ) )
            // InternalBSharp.g:7634:2: ( ruleTypedVariableList )
            {
            // InternalBSharp.g:7634:2: ( ruleTypedVariableList )
            // InternalBSharp.g:7635:3: ruleTypedVariableList
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
    // InternalBSharp.g:7644:1: rule__Lambda__ExprAssignment_4 : ( ruleRootExpression ) ;
    public final void rule__Lambda__ExprAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7648:1: ( ( ruleRootExpression ) )
            // InternalBSharp.g:7649:2: ( ruleRootExpression )
            {
            // InternalBSharp.g:7649:2: ( ruleRootExpression )
            // InternalBSharp.g:7650:3: ruleRootExpression
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
    // InternalBSharp.g:7659:1: rule__Quantifier__QTypeAssignment_0 : ( ( rule__Quantifier__QTypeAlternatives_0_0 ) ) ;
    public final void rule__Quantifier__QTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7663:1: ( ( ( rule__Quantifier__QTypeAlternatives_0_0 ) ) )
            // InternalBSharp.g:7664:2: ( ( rule__Quantifier__QTypeAlternatives_0_0 ) )
            {
            // InternalBSharp.g:7664:2: ( ( rule__Quantifier__QTypeAlternatives_0_0 ) )
            // InternalBSharp.g:7665:3: ( rule__Quantifier__QTypeAlternatives_0_0 )
            {
             before(grammarAccess.getQuantifierAccess().getQTypeAlternatives_0_0()); 
            // InternalBSharp.g:7666:3: ( rule__Quantifier__QTypeAlternatives_0_0 )
            // InternalBSharp.g:7666:4: rule__Quantifier__QTypeAlternatives_0_0
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
    // InternalBSharp.g:7674:1: rule__Quantifier__ContextAssignment_1 : ( rulePolyContext ) ;
    public final void rule__Quantifier__ContextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7678:1: ( ( rulePolyContext ) )
            // InternalBSharp.g:7679:2: ( rulePolyContext )
            {
            // InternalBSharp.g:7679:2: ( rulePolyContext )
            // InternalBSharp.g:7680:3: rulePolyContext
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
    // InternalBSharp.g:7689:1: rule__Quantifier__VarListAssignment_2 : ( ruleTypedVariableList ) ;
    public final void rule__Quantifier__VarListAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7693:1: ( ( ruleTypedVariableList ) )
            // InternalBSharp.g:7694:2: ( ruleTypedVariableList )
            {
            // InternalBSharp.g:7694:2: ( ruleTypedVariableList )
            // InternalBSharp.g:7695:3: ruleTypedVariableList
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
    // InternalBSharp.g:7704:1: rule__Quantifier__ExprAssignment_4 : ( ruleRootExpression ) ;
    public final void rule__Quantifier__ExprAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7708:1: ( ( ruleRootExpression ) )
            // InternalBSharp.g:7709:2: ( ruleRootExpression )
            {
            // InternalBSharp.g:7709:2: ( ruleRootExpression )
            // InternalBSharp.g:7710:3: ruleRootExpression
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
    // InternalBSharp.g:7719:1: rule__Prefix__NameAssignment_0 : ( rulePrefixBuiltIn ) ;
    public final void rule__Prefix__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7723:1: ( ( rulePrefixBuiltIn ) )
            // InternalBSharp.g:7724:2: ( rulePrefixBuiltIn )
            {
            // InternalBSharp.g:7724:2: ( rulePrefixBuiltIn )
            // InternalBSharp.g:7725:3: rulePrefixBuiltIn
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
    // InternalBSharp.g:7734:1: rule__Prefix__ElemAssignment_1 : ( ruleElement ) ;
    public final void rule__Prefix__ElemAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7738:1: ( ( ruleElement ) )
            // InternalBSharp.g:7739:2: ( ruleElement )
            {
            // InternalBSharp.g:7739:2: ( ruleElement )
            // InternalBSharp.g:7740:3: ruleElement
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
    // InternalBSharp.g:7749:1: rule__Infix__FuncNameAssignment_1_1_0 : ( ( RULE_ID ) ) ;
    public final void rule__Infix__FuncNameAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7753:1: ( ( ( RULE_ID ) ) )
            // InternalBSharp.g:7754:2: ( ( RULE_ID ) )
            {
            // InternalBSharp.g:7754:2: ( ( RULE_ID ) )
            // InternalBSharp.g:7755:3: ( RULE_ID )
            {
             before(grammarAccess.getInfixAccess().getFuncNameFunctionNameCrossReference_1_1_0_0()); 
            // InternalBSharp.g:7756:3: ( RULE_ID )
            // InternalBSharp.g:7757:4: RULE_ID
            {
             before(grammarAccess.getInfixAccess().getFuncNameFunctionNameIDTerminalRuleCall_1_1_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInfixAccess().getFuncNameFunctionNameIDTerminalRuleCall_1_1_0_0_1()); 

            }

             after(grammarAccess.getInfixAccess().getFuncNameFunctionNameCrossReference_1_1_0_0()); 

            }


            }

        }
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
    // InternalBSharp.g:7768:1: rule__Infix__OpNameAssignment_1_1_1 : ( ruleInbuiltInfix ) ;
    public final void rule__Infix__OpNameAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7772:1: ( ( ruleInbuiltInfix ) )
            // InternalBSharp.g:7773:2: ( ruleInbuiltInfix )
            {
            // InternalBSharp.g:7773:2: ( ruleInbuiltInfix )
            // InternalBSharp.g:7774:3: ruleInbuiltInfix
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
    // InternalBSharp.g:7783:1: rule__Infix__RightAssignment_1_2 : ( ruleElement ) ;
    public final void rule__Infix__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7787:1: ( ( ruleElement ) )
            // InternalBSharp.g:7788:2: ( ruleElement )
            {
            // InternalBSharp.g:7788:2: ( ruleElement )
            // InternalBSharp.g:7789:3: ruleElement
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
    // InternalBSharp.g:7798:1: rule__Bracket__ChildAssignment_1 : ( ruleRootExpression ) ;
    public final void rule__Bracket__ChildAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7802:1: ( ( ruleRootExpression ) )
            // InternalBSharp.g:7803:2: ( ruleRootExpression )
            {
            // InternalBSharp.g:7803:2: ( ruleRootExpression )
            // InternalBSharp.g:7804:3: ruleRootExpression
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


    // $ANTLR start "rule__FunctionCall__TypeInstAssignment_0_0"
    // InternalBSharp.g:7813:1: rule__FunctionCall__TypeInstAssignment_0_0 : ( ( RULE_ID ) ) ;
    public final void rule__FunctionCall__TypeInstAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7817:1: ( ( ( RULE_ID ) ) )
            // InternalBSharp.g:7818:2: ( ( RULE_ID ) )
            {
            // InternalBSharp.g:7818:2: ( ( RULE_ID ) )
            // InternalBSharp.g:7819:3: ( RULE_ID )
            {
             before(grammarAccess.getFunctionCallAccess().getTypeInstExpressionVariableCrossReference_0_0_0()); 
            // InternalBSharp.g:7820:3: ( RULE_ID )
            // InternalBSharp.g:7821:4: RULE_ID
            {
             before(grammarAccess.getFunctionCallAccess().getTypeInstExpressionVariableIDTerminalRuleCall_0_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFunctionCallAccess().getTypeInstExpressionVariableIDTerminalRuleCall_0_0_0_1()); 

            }

             after(grammarAccess.getFunctionCallAccess().getTypeInstExpressionVariableCrossReference_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__TypeInstAssignment_0_0"


    // $ANTLR start "rule__FunctionCall__ClassVarDeclAssignment_0_1"
    // InternalBSharp.g:7832:1: rule__FunctionCall__ClassVarDeclAssignment_0_1 : ( ruleClassVarDecl ) ;
    public final void rule__FunctionCall__ClassVarDeclAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7836:1: ( ( ruleClassVarDecl ) )
            // InternalBSharp.g:7837:2: ( ruleClassVarDecl )
            {
            // InternalBSharp.g:7837:2: ( ruleClassVarDecl )
            // InternalBSharp.g:7838:3: ruleClassVarDecl
            {
             before(grammarAccess.getFunctionCallAccess().getClassVarDeclClassVarDeclParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleClassVarDecl();

            state._fsp--;

             after(grammarAccess.getFunctionCallAccess().getClassVarDeclClassVarDeclParserRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__ClassVarDeclAssignment_0_1"


    // $ANTLR start "rule__FunctionCall__ArgumentsAssignment_1_1"
    // InternalBSharp.g:7847:1: rule__FunctionCall__ArgumentsAssignment_1_1 : ( ruleRootExpression ) ;
    public final void rule__FunctionCall__ArgumentsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7851:1: ( ( ruleRootExpression ) )
            // InternalBSharp.g:7852:2: ( ruleRootExpression )
            {
            // InternalBSharp.g:7852:2: ( ruleRootExpression )
            // InternalBSharp.g:7853:3: ruleRootExpression
            {
             before(grammarAccess.getFunctionCallAccess().getArgumentsRootExpressionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRootExpression();

            state._fsp--;

             after(grammarAccess.getFunctionCallAccess().getArgumentsRootExpressionParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__ArgumentsAssignment_1_1"


    // $ANTLR start "rule__FunctionCall__ArgumentsAssignment_1_2_1"
    // InternalBSharp.g:7862:1: rule__FunctionCall__ArgumentsAssignment_1_2_1 : ( ruleRootExpression ) ;
    public final void rule__FunctionCall__ArgumentsAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7866:1: ( ( ruleRootExpression ) )
            // InternalBSharp.g:7867:2: ( ruleRootExpression )
            {
            // InternalBSharp.g:7867:2: ( ruleRootExpression )
            // InternalBSharp.g:7868:3: ruleRootExpression
            {
             before(grammarAccess.getFunctionCallAccess().getArgumentsRootExpressionParserRuleCall_1_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRootExpression();

            state._fsp--;

             after(grammarAccess.getFunctionCallAccess().getArgumentsRootExpressionParserRuleCall_1_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__ArgumentsAssignment_1_2_1"


    // $ANTLR start "rule__ClassVarDecl__OwnerTypeAssignment_0"
    // InternalBSharp.g:7877:1: rule__ClassVarDecl__OwnerTypeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__ClassVarDecl__OwnerTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7881:1: ( ( ( RULE_ID ) ) )
            // InternalBSharp.g:7882:2: ( ( RULE_ID ) )
            {
            // InternalBSharp.g:7882:2: ( ( RULE_ID ) )
            // InternalBSharp.g:7883:3: ( RULE_ID )
            {
             before(grammarAccess.getClassVarDeclAccess().getOwnerTypeGenNameCrossReference_0_0()); 
            // InternalBSharp.g:7884:3: ( RULE_ID )
            // InternalBSharp.g:7885:4: RULE_ID
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
    // InternalBSharp.g:7896:1: rule__ClassVarDecl__TypeInstAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__ClassVarDecl__TypeInstAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7900:1: ( ( ( RULE_ID ) ) )
            // InternalBSharp.g:7901:2: ( ( RULE_ID ) )
            {
            // InternalBSharp.g:7901:2: ( ( RULE_ID ) )
            // InternalBSharp.g:7902:3: ( RULE_ID )
            {
             before(grammarAccess.getClassVarDeclAccess().getTypeInstExpressionVariableCrossReference_2_0()); 
            // InternalBSharp.g:7903:3: ( RULE_ID )
            // InternalBSharp.g:7904:4: RULE_ID
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


    // $ANTLR start "rule__Instance__ClassNameAssignment_1"
    // InternalBSharp.g:7915:1: rule__Instance__ClassNameAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Instance__ClassNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7919:1: ( ( ( ruleQualifiedName ) ) )
            // InternalBSharp.g:7920:2: ( ( ruleQualifiedName ) )
            {
            // InternalBSharp.g:7920:2: ( ( ruleQualifiedName ) )
            // InternalBSharp.g:7921:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getInstanceAccess().getClassNameClassDeclCrossReference_1_0()); 
            // InternalBSharp.g:7922:3: ( ruleQualifiedName )
            // InternalBSharp.g:7923:4: ruleQualifiedName
            {
             before(grammarAccess.getInstanceAccess().getClassNameClassDeclQualifiedNameParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getInstanceAccess().getClassNameClassDeclQualifiedNameParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getInstanceAccess().getClassNameClassDeclCrossReference_1_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__Instance__ContextAssignment_2"
    // InternalBSharp.g:7934:1: rule__Instance__ContextAssignment_2 : ( ruleTypeDeclContext ) ;
    public final void rule__Instance__ContextAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7938:1: ( ( ruleTypeDeclContext ) )
            // InternalBSharp.g:7939:2: ( ruleTypeDeclContext )
            {
            // InternalBSharp.g:7939:2: ( ruleTypeDeclContext )
            // InternalBSharp.g:7940:3: ruleTypeDeclContext
            {
             before(grammarAccess.getInstanceAccess().getContextTypeDeclContextParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTypeDeclContext();

            state._fsp--;

             after(grammarAccess.getInstanceAccess().getContextTypeDeclContextParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__ContextAssignment_2"


    // $ANTLR start "rule__Instance__ArgumentsAssignment_4"
    // InternalBSharp.g:7949:1: rule__Instance__ArgumentsAssignment_4 : ( ruleRootExpression ) ;
    public final void rule__Instance__ArgumentsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7953:1: ( ( ruleRootExpression ) )
            // InternalBSharp.g:7954:2: ( ruleRootExpression )
            {
            // InternalBSharp.g:7954:2: ( ruleRootExpression )
            // InternalBSharp.g:7955:3: ruleRootExpression
            {
             before(grammarAccess.getInstanceAccess().getArgumentsRootExpressionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleRootExpression();

            state._fsp--;

             after(grammarAccess.getInstanceAccess().getArgumentsRootExpressionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__ArgumentsAssignment_4"


    // $ANTLR start "rule__Instance__ArgumentsAssignment_5_1"
    // InternalBSharp.g:7964:1: rule__Instance__ArgumentsAssignment_5_1 : ( ruleRootExpression ) ;
    public final void rule__Instance__ArgumentsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7968:1: ( ( ruleRootExpression ) )
            // InternalBSharp.g:7969:2: ( ruleRootExpression )
            {
            // InternalBSharp.g:7969:2: ( ruleRootExpression )
            // InternalBSharp.g:7970:3: ruleRootExpression
            {
             before(grammarAccess.getInstanceAccess().getArgumentsRootExpressionParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRootExpression();

            state._fsp--;

             after(grammarAccess.getInstanceAccess().getArgumentsRootExpressionParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__ArgumentsAssignment_5_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0010501000000002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0010501C00000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000072L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0010501000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000001020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00008A6100000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000020000000020L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00000000007FE000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00000000007FE002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0042020001800820L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000204000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000204000000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0005000000000020L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0004000000000022L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000024000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000040000000020L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0062020001800830L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0001200000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000020100000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000050000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000010100000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000004000000020L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000020000000820L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x000000007E000020L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x000000007E000022L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0042070001800820L});

}