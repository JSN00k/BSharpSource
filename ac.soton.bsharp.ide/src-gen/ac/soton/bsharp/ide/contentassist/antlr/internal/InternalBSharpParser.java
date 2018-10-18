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


    // $ANTLR start "entryRuleTypeDeclContext"
    // InternalBSharp.g:485:1: entryRuleTypeDeclContext : ruleTypeDeclContext EOF ;
    public final void entryRuleTypeDeclContext() throws RecognitionException {
        try {
            // InternalBSharp.g:486:1: ( ruleTypeDeclContext EOF )
            // InternalBSharp.g:487:1: ruleTypeDeclContext EOF
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
    // InternalBSharp.g:494:1: ruleTypeDeclContext : ( ( rule__TypeDeclContext__Group__0 ) ) ;
    public final void ruleTypeDeclContext() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:498:2: ( ( ( rule__TypeDeclContext__Group__0 ) ) )
            // InternalBSharp.g:499:2: ( ( rule__TypeDeclContext__Group__0 ) )
            {
            // InternalBSharp.g:499:2: ( ( rule__TypeDeclContext__Group__0 ) )
            // InternalBSharp.g:500:3: ( rule__TypeDeclContext__Group__0 )
            {
             before(grammarAccess.getTypeDeclContextAccess().getGroup()); 
            // InternalBSharp.g:501:3: ( rule__TypeDeclContext__Group__0 )
            // InternalBSharp.g:501:4: rule__TypeDeclContext__Group__0
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
    // InternalBSharp.g:510:1: entryRuleTypeStructure : ruleTypeStructure EOF ;
    public final void entryRuleTypeStructure() throws RecognitionException {
        try {
            // InternalBSharp.g:511:1: ( ruleTypeStructure EOF )
            // InternalBSharp.g:512:1: ruleTypeStructure EOF
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
    // InternalBSharp.g:519:1: ruleTypeStructure : ( ( rule__TypeStructure__Group__0 ) ) ;
    public final void ruleTypeStructure() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:523:2: ( ( ( rule__TypeStructure__Group__0 ) ) )
            // InternalBSharp.g:524:2: ( ( rule__TypeStructure__Group__0 ) )
            {
            // InternalBSharp.g:524:2: ( ( rule__TypeStructure__Group__0 ) )
            // InternalBSharp.g:525:3: ( rule__TypeStructure__Group__0 )
            {
             before(grammarAccess.getTypeStructureAccess().getGroup()); 
            // InternalBSharp.g:526:3: ( rule__TypeStructure__Group__0 )
            // InternalBSharp.g:526:4: rule__TypeStructure__Group__0
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
    // InternalBSharp.g:535:1: entryRuleWhere : ruleWhere EOF ;
    public final void entryRuleWhere() throws RecognitionException {
        try {
            // InternalBSharp.g:536:1: ( ruleWhere EOF )
            // InternalBSharp.g:537:1: ruleWhere EOF
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
    // InternalBSharp.g:544:1: ruleWhere : ( ( rule__Where__Group__0 ) ) ;
    public final void ruleWhere() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:548:2: ( ( ( rule__Where__Group__0 ) ) )
            // InternalBSharp.g:549:2: ( ( rule__Where__Group__0 ) )
            {
            // InternalBSharp.g:549:2: ( ( rule__Where__Group__0 ) )
            // InternalBSharp.g:550:3: ( rule__Where__Group__0 )
            {
             before(grammarAccess.getWhereAccess().getGroup()); 
            // InternalBSharp.g:551:3: ( rule__Where__Group__0 )
            // InternalBSharp.g:551:4: rule__Where__Group__0
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
    // InternalBSharp.g:560:1: entryRuleDatatype : ruleDatatype EOF ;
    public final void entryRuleDatatype() throws RecognitionException {
        try {
            // InternalBSharp.g:561:1: ( ruleDatatype EOF )
            // InternalBSharp.g:562:1: ruleDatatype EOF
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
    // InternalBSharp.g:569:1: ruleDatatype : ( ( rule__Datatype__Group__0 ) ) ;
    public final void ruleDatatype() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:573:2: ( ( ( rule__Datatype__Group__0 ) ) )
            // InternalBSharp.g:574:2: ( ( rule__Datatype__Group__0 ) )
            {
            // InternalBSharp.g:574:2: ( ( rule__Datatype__Group__0 ) )
            // InternalBSharp.g:575:3: ( rule__Datatype__Group__0 )
            {
             before(grammarAccess.getDatatypeAccess().getGroup()); 
            // InternalBSharp.g:576:3: ( rule__Datatype__Group__0 )
            // InternalBSharp.g:576:4: rule__Datatype__Group__0
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
    // InternalBSharp.g:585:1: entryRuleDatatypeConstructor : ruleDatatypeConstructor EOF ;
    public final void entryRuleDatatypeConstructor() throws RecognitionException {
        try {
            // InternalBSharp.g:586:1: ( ruleDatatypeConstructor EOF )
            // InternalBSharp.g:587:1: ruleDatatypeConstructor EOF
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
    // InternalBSharp.g:594:1: ruleDatatypeConstructor : ( ( rule__DatatypeConstructor__Group__0 ) ) ;
    public final void ruleDatatypeConstructor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:598:2: ( ( ( rule__DatatypeConstructor__Group__0 ) ) )
            // InternalBSharp.g:599:2: ( ( rule__DatatypeConstructor__Group__0 ) )
            {
            // InternalBSharp.g:599:2: ( ( rule__DatatypeConstructor__Group__0 ) )
            // InternalBSharp.g:600:3: ( rule__DatatypeConstructor__Group__0 )
            {
             before(grammarAccess.getDatatypeConstructorAccess().getGroup()); 
            // InternalBSharp.g:601:3: ( rule__DatatypeConstructor__Group__0 )
            // InternalBSharp.g:601:4: rule__DatatypeConstructor__Group__0
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
    // InternalBSharp.g:610:1: entryRuleExtend : ruleExtend EOF ;
    public final void entryRuleExtend() throws RecognitionException {
        try {
            // InternalBSharp.g:611:1: ( ruleExtend EOF )
            // InternalBSharp.g:612:1: ruleExtend EOF
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
    // InternalBSharp.g:619:1: ruleExtend : ( ( rule__Extend__Group__0 ) ) ;
    public final void ruleExtend() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:623:2: ( ( ( rule__Extend__Group__0 ) ) )
            // InternalBSharp.g:624:2: ( ( rule__Extend__Group__0 ) )
            {
            // InternalBSharp.g:624:2: ( ( rule__Extend__Group__0 ) )
            // InternalBSharp.g:625:3: ( rule__Extend__Group__0 )
            {
             before(grammarAccess.getExtendAccess().getGroup()); 
            // InternalBSharp.g:626:3: ( rule__Extend__Group__0 )
            // InternalBSharp.g:626:4: rule__Extend__Group__0
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
    // InternalBSharp.g:635:1: entryRuleBSharpBlock : ruleBSharpBlock EOF ;
    public final void entryRuleBSharpBlock() throws RecognitionException {
        try {
            // InternalBSharp.g:636:1: ( ruleBSharpBlock EOF )
            // InternalBSharp.g:637:1: ruleBSharpBlock EOF
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
    // InternalBSharp.g:644:1: ruleBSharpBlock : ( ( rule__BSharpBlock__Group__0 ) ) ;
    public final void ruleBSharpBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:648:2: ( ( ( rule__BSharpBlock__Group__0 ) ) )
            // InternalBSharp.g:649:2: ( ( rule__BSharpBlock__Group__0 ) )
            {
            // InternalBSharp.g:649:2: ( ( rule__BSharpBlock__Group__0 ) )
            // InternalBSharp.g:650:3: ( rule__BSharpBlock__Group__0 )
            {
             before(grammarAccess.getBSharpBlockAccess().getGroup()); 
            // InternalBSharp.g:651:3: ( rule__BSharpBlock__Group__0 )
            // InternalBSharp.g:651:4: rule__BSharpBlock__Group__0
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
    // InternalBSharp.g:660:1: entryRuleTypeBodyElements : ruleTypeBodyElements EOF ;
    public final void entryRuleTypeBodyElements() throws RecognitionException {
        try {
            // InternalBSharp.g:661:1: ( ruleTypeBodyElements EOF )
            // InternalBSharp.g:662:1: ruleTypeBodyElements EOF
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
    // InternalBSharp.g:669:1: ruleTypeBodyElements : ( ( rule__TypeBodyElements__Alternatives ) ) ;
    public final void ruleTypeBodyElements() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:673:2: ( ( ( rule__TypeBodyElements__Alternatives ) ) )
            // InternalBSharp.g:674:2: ( ( rule__TypeBodyElements__Alternatives ) )
            {
            // InternalBSharp.g:674:2: ( ( rule__TypeBodyElements__Alternatives ) )
            // InternalBSharp.g:675:3: ( rule__TypeBodyElements__Alternatives )
            {
             before(grammarAccess.getTypeBodyElementsAccess().getAlternatives()); 
            // InternalBSharp.g:676:3: ( rule__TypeBodyElements__Alternatives )
            // InternalBSharp.g:676:4: rule__TypeBodyElements__Alternatives
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
    // InternalBSharp.g:685:1: entryRuleFunctionDecl : ruleFunctionDecl EOF ;
    public final void entryRuleFunctionDecl() throws RecognitionException {
        try {
            // InternalBSharp.g:686:1: ( ruleFunctionDecl EOF )
            // InternalBSharp.g:687:1: ruleFunctionDecl EOF
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
    // InternalBSharp.g:694:1: ruleFunctionDecl : ( ( rule__FunctionDecl__Group__0 ) ) ;
    public final void ruleFunctionDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:698:2: ( ( ( rule__FunctionDecl__Group__0 ) ) )
            // InternalBSharp.g:699:2: ( ( rule__FunctionDecl__Group__0 ) )
            {
            // InternalBSharp.g:699:2: ( ( rule__FunctionDecl__Group__0 ) )
            // InternalBSharp.g:700:3: ( rule__FunctionDecl__Group__0 )
            {
             before(grammarAccess.getFunctionDeclAccess().getGroup()); 
            // InternalBSharp.g:701:3: ( rule__FunctionDecl__Group__0 )
            // InternalBSharp.g:701:4: rule__FunctionDecl__Group__0
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
    // InternalBSharp.g:710:1: entryRuleFunctionName : ruleFunctionName EOF ;
    public final void entryRuleFunctionName() throws RecognitionException {
        try {
            // InternalBSharp.g:711:1: ( ruleFunctionName EOF )
            // InternalBSharp.g:712:1: ruleFunctionName EOF
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
    // InternalBSharp.g:719:1: ruleFunctionName : ( ( rule__FunctionName__NameAssignment ) ) ;
    public final void ruleFunctionName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:723:2: ( ( ( rule__FunctionName__NameAssignment ) ) )
            // InternalBSharp.g:724:2: ( ( rule__FunctionName__NameAssignment ) )
            {
            // InternalBSharp.g:724:2: ( ( rule__FunctionName__NameAssignment ) )
            // InternalBSharp.g:725:3: ( rule__FunctionName__NameAssignment )
            {
             before(grammarAccess.getFunctionNameAccess().getNameAssignment()); 
            // InternalBSharp.g:726:3: ( rule__FunctionName__NameAssignment )
            // InternalBSharp.g:726:4: rule__FunctionName__NameAssignment
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
    // InternalBSharp.g:735:1: entryRuleMatchStatement : ruleMatchStatement EOF ;
    public final void entryRuleMatchStatement() throws RecognitionException {
        try {
            // InternalBSharp.g:736:1: ( ruleMatchStatement EOF )
            // InternalBSharp.g:737:1: ruleMatchStatement EOF
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
    // InternalBSharp.g:744:1: ruleMatchStatement : ( ( rule__MatchStatement__Group__0 ) ) ;
    public final void ruleMatchStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:748:2: ( ( ( rule__MatchStatement__Group__0 ) ) )
            // InternalBSharp.g:749:2: ( ( rule__MatchStatement__Group__0 ) )
            {
            // InternalBSharp.g:749:2: ( ( rule__MatchStatement__Group__0 ) )
            // InternalBSharp.g:750:3: ( rule__MatchStatement__Group__0 )
            {
             before(grammarAccess.getMatchStatementAccess().getGroup()); 
            // InternalBSharp.g:751:3: ( rule__MatchStatement__Group__0 )
            // InternalBSharp.g:751:4: rule__MatchStatement__Group__0
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
    // InternalBSharp.g:760:1: entryRuleMatchCase : ruleMatchCase EOF ;
    public final void entryRuleMatchCase() throws RecognitionException {
        try {
            // InternalBSharp.g:761:1: ( ruleMatchCase EOF )
            // InternalBSharp.g:762:1: ruleMatchCase EOF
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
    // InternalBSharp.g:769:1: ruleMatchCase : ( ( rule__MatchCase__Group__0 ) ) ;
    public final void ruleMatchCase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:773:2: ( ( ( rule__MatchCase__Group__0 ) ) )
            // InternalBSharp.g:774:2: ( ( rule__MatchCase__Group__0 ) )
            {
            // InternalBSharp.g:774:2: ( ( rule__MatchCase__Group__0 ) )
            // InternalBSharp.g:775:3: ( rule__MatchCase__Group__0 )
            {
             before(grammarAccess.getMatchCaseAccess().getGroup()); 
            // InternalBSharp.g:776:3: ( rule__MatchCase__Group__0 )
            // InternalBSharp.g:776:4: rule__MatchCase__Group__0
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
    // InternalBSharp.g:785:1: entryRuleTheoremBody : ruleTheoremBody EOF ;
    public final void entryRuleTheoremBody() throws RecognitionException {
        try {
            // InternalBSharp.g:786:1: ( ruleTheoremBody EOF )
            // InternalBSharp.g:787:1: ruleTheoremBody EOF
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
    // InternalBSharp.g:794:1: ruleTheoremBody : ( ( rule__TheoremBody__Group__0 ) ) ;
    public final void ruleTheoremBody() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:798:2: ( ( ( rule__TheoremBody__Group__0 ) ) )
            // InternalBSharp.g:799:2: ( ( rule__TheoremBody__Group__0 ) )
            {
            // InternalBSharp.g:799:2: ( ( rule__TheoremBody__Group__0 ) )
            // InternalBSharp.g:800:3: ( rule__TheoremBody__Group__0 )
            {
             before(grammarAccess.getTheoremBodyAccess().getGroup()); 
            // InternalBSharp.g:801:3: ( rule__TheoremBody__Group__0 )
            // InternalBSharp.g:801:4: rule__TheoremBody__Group__0
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
    // InternalBSharp.g:810:1: entryRuleTheoremDecl : ruleTheoremDecl EOF ;
    public final void entryRuleTheoremDecl() throws RecognitionException {
        try {
            // InternalBSharp.g:811:1: ( ruleTheoremDecl EOF )
            // InternalBSharp.g:812:1: ruleTheoremDecl EOF
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
    // InternalBSharp.g:819:1: ruleTheoremDecl : ( ( rule__TheoremDecl__Group__0 ) ) ;
    public final void ruleTheoremDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:823:2: ( ( ( rule__TheoremDecl__Group__0 ) ) )
            // InternalBSharp.g:824:2: ( ( rule__TheoremDecl__Group__0 ) )
            {
            // InternalBSharp.g:824:2: ( ( rule__TheoremDecl__Group__0 ) )
            // InternalBSharp.g:825:3: ( rule__TheoremDecl__Group__0 )
            {
             before(grammarAccess.getTheoremDeclAccess().getGroup()); 
            // InternalBSharp.g:826:3: ( rule__TheoremDecl__Group__0 )
            // InternalBSharp.g:826:4: rule__TheoremDecl__Group__0
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
    // InternalBSharp.g:835:1: entryRuleTypedVariableList : ruleTypedVariableList EOF ;
    public final void entryRuleTypedVariableList() throws RecognitionException {
        try {
            // InternalBSharp.g:836:1: ( ruleTypedVariableList EOF )
            // InternalBSharp.g:837:1: ruleTypedVariableList EOF
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
    // InternalBSharp.g:844:1: ruleTypedVariableList : ( ( rule__TypedVariableList__Group__0 ) ) ;
    public final void ruleTypedVariableList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:848:2: ( ( ( rule__TypedVariableList__Group__0 ) ) )
            // InternalBSharp.g:849:2: ( ( rule__TypedVariableList__Group__0 ) )
            {
            // InternalBSharp.g:849:2: ( ( rule__TypedVariableList__Group__0 ) )
            // InternalBSharp.g:850:3: ( rule__TypedVariableList__Group__0 )
            {
             before(grammarAccess.getTypedVariableListAccess().getGroup()); 
            // InternalBSharp.g:851:3: ( rule__TypedVariableList__Group__0 )
            // InternalBSharp.g:851:4: rule__TypedVariableList__Group__0
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
    // InternalBSharp.g:860:1: entryRuleVariableTyping : ruleVariableTyping EOF ;
    public final void entryRuleVariableTyping() throws RecognitionException {
        try {
            // InternalBSharp.g:861:1: ( ruleVariableTyping EOF )
            // InternalBSharp.g:862:1: ruleVariableTyping EOF
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
    // InternalBSharp.g:869:1: ruleVariableTyping : ( ( rule__VariableTyping__Group__0 ) ) ;
    public final void ruleVariableTyping() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:873:2: ( ( ( rule__VariableTyping__Group__0 ) ) )
            // InternalBSharp.g:874:2: ( ( rule__VariableTyping__Group__0 ) )
            {
            // InternalBSharp.g:874:2: ( ( rule__VariableTyping__Group__0 ) )
            // InternalBSharp.g:875:3: ( rule__VariableTyping__Group__0 )
            {
             before(grammarAccess.getVariableTypingAccess().getGroup()); 
            // InternalBSharp.g:876:3: ( rule__VariableTyping__Group__0 )
            // InternalBSharp.g:876:4: rule__VariableTyping__Group__0
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
    // InternalBSharp.g:885:1: entryRuleTypedVariable : ruleTypedVariable EOF ;
    public final void entryRuleTypedVariable() throws RecognitionException {
        try {
            // InternalBSharp.g:886:1: ( ruleTypedVariable EOF )
            // InternalBSharp.g:887:1: ruleTypedVariable EOF
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
    // InternalBSharp.g:894:1: ruleTypedVariable : ( ( rule__TypedVariable__NameAssignment ) ) ;
    public final void ruleTypedVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:898:2: ( ( ( rule__TypedVariable__NameAssignment ) ) )
            // InternalBSharp.g:899:2: ( ( rule__TypedVariable__NameAssignment ) )
            {
            // InternalBSharp.g:899:2: ( ( rule__TypedVariable__NameAssignment ) )
            // InternalBSharp.g:900:3: ( rule__TypedVariable__NameAssignment )
            {
             before(grammarAccess.getTypedVariableAccess().getNameAssignment()); 
            // InternalBSharp.g:901:3: ( rule__TypedVariable__NameAssignment )
            // InternalBSharp.g:901:4: rule__TypedVariable__NameAssignment
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
    // InternalBSharp.g:910:1: entryRuleLambda : ruleLambda EOF ;
    public final void entryRuleLambda() throws RecognitionException {
        try {
            // InternalBSharp.g:911:1: ( ruleLambda EOF )
            // InternalBSharp.g:912:1: ruleLambda EOF
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
    // InternalBSharp.g:919:1: ruleLambda : ( ( rule__Lambda__Group__0 ) ) ;
    public final void ruleLambda() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:923:2: ( ( ( rule__Lambda__Group__0 ) ) )
            // InternalBSharp.g:924:2: ( ( rule__Lambda__Group__0 ) )
            {
            // InternalBSharp.g:924:2: ( ( rule__Lambda__Group__0 ) )
            // InternalBSharp.g:925:3: ( rule__Lambda__Group__0 )
            {
             before(grammarAccess.getLambdaAccess().getGroup()); 
            // InternalBSharp.g:926:3: ( rule__Lambda__Group__0 )
            // InternalBSharp.g:926:4: rule__Lambda__Group__0
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
    // InternalBSharp.g:935:1: entryRuleQuantifier : ruleQuantifier EOF ;
    public final void entryRuleQuantifier() throws RecognitionException {
        try {
            // InternalBSharp.g:936:1: ( ruleQuantifier EOF )
            // InternalBSharp.g:937:1: ruleQuantifier EOF
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
    // InternalBSharp.g:944:1: ruleQuantifier : ( ( rule__Quantifier__Group__0 ) ) ;
    public final void ruleQuantifier() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:948:2: ( ( ( rule__Quantifier__Group__0 ) ) )
            // InternalBSharp.g:949:2: ( ( rule__Quantifier__Group__0 ) )
            {
            // InternalBSharp.g:949:2: ( ( rule__Quantifier__Group__0 ) )
            // InternalBSharp.g:950:3: ( rule__Quantifier__Group__0 )
            {
             before(grammarAccess.getQuantifierAccess().getGroup()); 
            // InternalBSharp.g:951:3: ( rule__Quantifier__Group__0 )
            // InternalBSharp.g:951:4: rule__Quantifier__Group__0
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
    // InternalBSharp.g:960:1: entryRuleRootExpression : ruleRootExpression EOF ;
    public final void entryRuleRootExpression() throws RecognitionException {
        try {
            // InternalBSharp.g:961:1: ( ruleRootExpression EOF )
            // InternalBSharp.g:962:1: ruleRootExpression EOF
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
    // InternalBSharp.g:969:1: ruleRootExpression : ( ( rule__RootExpression__Alternatives ) ) ;
    public final void ruleRootExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:973:2: ( ( ( rule__RootExpression__Alternatives ) ) )
            // InternalBSharp.g:974:2: ( ( rule__RootExpression__Alternatives ) )
            {
            // InternalBSharp.g:974:2: ( ( rule__RootExpression__Alternatives ) )
            // InternalBSharp.g:975:3: ( rule__RootExpression__Alternatives )
            {
             before(grammarAccess.getRootExpressionAccess().getAlternatives()); 
            // InternalBSharp.g:976:3: ( rule__RootExpression__Alternatives )
            // InternalBSharp.g:976:4: rule__RootExpression__Alternatives
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
    // InternalBSharp.g:985:1: entryRulePrefix : rulePrefix EOF ;
    public final void entryRulePrefix() throws RecognitionException {
        try {
            // InternalBSharp.g:986:1: ( rulePrefix EOF )
            // InternalBSharp.g:987:1: rulePrefix EOF
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
    // InternalBSharp.g:994:1: rulePrefix : ( ( rule__Prefix__Group__0 ) ) ;
    public final void rulePrefix() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:998:2: ( ( ( rule__Prefix__Group__0 ) ) )
            // InternalBSharp.g:999:2: ( ( rule__Prefix__Group__0 ) )
            {
            // InternalBSharp.g:999:2: ( ( rule__Prefix__Group__0 ) )
            // InternalBSharp.g:1000:3: ( rule__Prefix__Group__0 )
            {
             before(grammarAccess.getPrefixAccess().getGroup()); 
            // InternalBSharp.g:1001:3: ( rule__Prefix__Group__0 )
            // InternalBSharp.g:1001:4: rule__Prefix__Group__0
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
    // InternalBSharp.g:1010:1: entryRulePrefixBuiltIn : rulePrefixBuiltIn EOF ;
    public final void entryRulePrefixBuiltIn() throws RecognitionException {
        try {
            // InternalBSharp.g:1011:1: ( rulePrefixBuiltIn EOF )
            // InternalBSharp.g:1012:1: rulePrefixBuiltIn EOF
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
    // InternalBSharp.g:1019:1: rulePrefixBuiltIn : ( '\\u00AC' ) ;
    public final void rulePrefixBuiltIn() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1023:2: ( ( '\\u00AC' ) )
            // InternalBSharp.g:1024:2: ( '\\u00AC' )
            {
            // InternalBSharp.g:1024:2: ( '\\u00AC' )
            // InternalBSharp.g:1025:3: '\\u00AC'
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
    // InternalBSharp.g:1035:1: entryRuleInfix : ruleInfix EOF ;
    public final void entryRuleInfix() throws RecognitionException {
        try {
            // InternalBSharp.g:1036:1: ( ruleInfix EOF )
            // InternalBSharp.g:1037:1: ruleInfix EOF
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
    // InternalBSharp.g:1044:1: ruleInfix : ( ( rule__Infix__Group__0 ) ) ;
    public final void ruleInfix() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1048:2: ( ( ( rule__Infix__Group__0 ) ) )
            // InternalBSharp.g:1049:2: ( ( rule__Infix__Group__0 ) )
            {
            // InternalBSharp.g:1049:2: ( ( rule__Infix__Group__0 ) )
            // InternalBSharp.g:1050:3: ( rule__Infix__Group__0 )
            {
             before(grammarAccess.getInfixAccess().getGroup()); 
            // InternalBSharp.g:1051:3: ( rule__Infix__Group__0 )
            // InternalBSharp.g:1051:4: rule__Infix__Group__0
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
    // InternalBSharp.g:1060:1: entryRuleElement : ruleElement EOF ;
    public final void entryRuleElement() throws RecognitionException {
        try {
            // InternalBSharp.g:1061:1: ( ruleElement EOF )
            // InternalBSharp.g:1062:1: ruleElement EOF
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
    // InternalBSharp.g:1069:1: ruleElement : ( ( rule__Element__Alternatives ) ) ;
    public final void ruleElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1073:2: ( ( ( rule__Element__Alternatives ) ) )
            // InternalBSharp.g:1074:2: ( ( rule__Element__Alternatives ) )
            {
            // InternalBSharp.g:1074:2: ( ( rule__Element__Alternatives ) )
            // InternalBSharp.g:1075:3: ( rule__Element__Alternatives )
            {
             before(grammarAccess.getElementAccess().getAlternatives()); 
            // InternalBSharp.g:1076:3: ( rule__Element__Alternatives )
            // InternalBSharp.g:1076:4: rule__Element__Alternatives
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
    // InternalBSharp.g:1085:1: entryRuleBracket : ruleBracket EOF ;
    public final void entryRuleBracket() throws RecognitionException {
        try {
            // InternalBSharp.g:1086:1: ( ruleBracket EOF )
            // InternalBSharp.g:1087:1: ruleBracket EOF
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
    // InternalBSharp.g:1094:1: ruleBracket : ( ( rule__Bracket__Group__0 ) ) ;
    public final void ruleBracket() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1098:2: ( ( ( rule__Bracket__Group__0 ) ) )
            // InternalBSharp.g:1099:2: ( ( rule__Bracket__Group__0 ) )
            {
            // InternalBSharp.g:1099:2: ( ( rule__Bracket__Group__0 ) )
            // InternalBSharp.g:1100:3: ( rule__Bracket__Group__0 )
            {
             before(grammarAccess.getBracketAccess().getGroup()); 
            // InternalBSharp.g:1101:3: ( rule__Bracket__Group__0 )
            // InternalBSharp.g:1101:4: rule__Bracket__Group__0
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
    // InternalBSharp.g:1110:1: entryRuleFunctionCall : ruleFunctionCall EOF ;
    public final void entryRuleFunctionCall() throws RecognitionException {
        try {
            // InternalBSharp.g:1111:1: ( ruleFunctionCall EOF )
            // InternalBSharp.g:1112:1: ruleFunctionCall EOF
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
    // InternalBSharp.g:1119:1: ruleFunctionCall : ( ( rule__FunctionCall__Group__0 ) ) ;
    public final void ruleFunctionCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1123:2: ( ( ( rule__FunctionCall__Group__0 ) ) )
            // InternalBSharp.g:1124:2: ( ( rule__FunctionCall__Group__0 ) )
            {
            // InternalBSharp.g:1124:2: ( ( rule__FunctionCall__Group__0 ) )
            // InternalBSharp.g:1125:3: ( rule__FunctionCall__Group__0 )
            {
             before(grammarAccess.getFunctionCallAccess().getGroup()); 
            // InternalBSharp.g:1126:3: ( rule__FunctionCall__Group__0 )
            // InternalBSharp.g:1126:4: rule__FunctionCall__Group__0
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
    // InternalBSharp.g:1135:1: entryRuleClassVarDecl : ruleClassVarDecl EOF ;
    public final void entryRuleClassVarDecl() throws RecognitionException {
        try {
            // InternalBSharp.g:1136:1: ( ruleClassVarDecl EOF )
            // InternalBSharp.g:1137:1: ruleClassVarDecl EOF
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
    // InternalBSharp.g:1144:1: ruleClassVarDecl : ( ( rule__ClassVarDecl__Group__0 ) ) ;
    public final void ruleClassVarDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1148:2: ( ( ( rule__ClassVarDecl__Group__0 ) ) )
            // InternalBSharp.g:1149:2: ( ( rule__ClassVarDecl__Group__0 ) )
            {
            // InternalBSharp.g:1149:2: ( ( rule__ClassVarDecl__Group__0 ) )
            // InternalBSharp.g:1150:3: ( rule__ClassVarDecl__Group__0 )
            {
             before(grammarAccess.getClassVarDeclAccess().getGroup()); 
            // InternalBSharp.g:1151:3: ( rule__ClassVarDecl__Group__0 )
            // InternalBSharp.g:1151:4: rule__ClassVarDecl__Group__0
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
    // InternalBSharp.g:1160:1: entryRuleInbuiltInfix : ruleInbuiltInfix EOF ;
    public final void entryRuleInbuiltInfix() throws RecognitionException {
        try {
            // InternalBSharp.g:1161:1: ( ruleInbuiltInfix EOF )
            // InternalBSharp.g:1162:1: ruleInbuiltInfix EOF
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
    // InternalBSharp.g:1169:1: ruleInbuiltInfix : ( ( rule__InbuiltInfix__Alternatives ) ) ;
    public final void ruleInbuiltInfix() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1173:2: ( ( ( rule__InbuiltInfix__Alternatives ) ) )
            // InternalBSharp.g:1174:2: ( ( rule__InbuiltInfix__Alternatives ) )
            {
            // InternalBSharp.g:1174:2: ( ( rule__InbuiltInfix__Alternatives ) )
            // InternalBSharp.g:1175:3: ( rule__InbuiltInfix__Alternatives )
            {
             before(grammarAccess.getInbuiltInfixAccess().getAlternatives()); 
            // InternalBSharp.g:1176:3: ( rule__InbuiltInfix__Alternatives )
            // InternalBSharp.g:1176:4: rule__InbuiltInfix__Alternatives
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
    // InternalBSharp.g:1185:1: entryRuleInstance : ruleInstance EOF ;
    public final void entryRuleInstance() throws RecognitionException {
        try {
            // InternalBSharp.g:1186:1: ( ruleInstance EOF )
            // InternalBSharp.g:1187:1: ruleInstance EOF
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
    // InternalBSharp.g:1194:1: ruleInstance : ( ( rule__Instance__Group__0 ) ) ;
    public final void ruleInstance() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1198:2: ( ( ( rule__Instance__Group__0 ) ) )
            // InternalBSharp.g:1199:2: ( ( rule__Instance__Group__0 ) )
            {
            // InternalBSharp.g:1199:2: ( ( rule__Instance__Group__0 ) )
            // InternalBSharp.g:1200:3: ( rule__Instance__Group__0 )
            {
             before(grammarAccess.getInstanceAccess().getGroup()); 
            // InternalBSharp.g:1201:3: ( rule__Instance__Group__0 )
            // InternalBSharp.g:1201:4: rule__Instance__Group__0
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
    // InternalBSharp.g:1209:1: rule__THM_NAME__Alternatives_0 : ( ( RULE_INT ) | ( RULE_ID ) | ( RULE_WS ) );
    public final void rule__THM_NAME__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1213:1: ( ( RULE_INT ) | ( RULE_ID ) | ( RULE_WS ) )
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
                    // InternalBSharp.g:1214:2: ( RULE_INT )
                    {
                    // InternalBSharp.g:1214:2: ( RULE_INT )
                    // InternalBSharp.g:1215:3: RULE_INT
                    {
                     before(grammarAccess.getTHM_NAMEAccess().getINTTerminalRuleCall_0_0()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getTHM_NAMEAccess().getINTTerminalRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBSharp.g:1220:2: ( RULE_ID )
                    {
                    // InternalBSharp.g:1220:2: ( RULE_ID )
                    // InternalBSharp.g:1221:3: RULE_ID
                    {
                     before(grammarAccess.getTHM_NAMEAccess().getIDTerminalRuleCall_0_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getTHM_NAMEAccess().getIDTerminalRuleCall_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBSharp.g:1226:2: ( RULE_WS )
                    {
                    // InternalBSharp.g:1226:2: ( RULE_WS )
                    // InternalBSharp.g:1227:3: RULE_WS
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
    // InternalBSharp.g:1236:1: rule__ClassDecl__Alternatives : ( ( ruleClass ) | ( ruleDatatype ) );
    public final void rule__ClassDecl__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1240:1: ( ( ruleClass ) | ( ruleDatatype ) )
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
                    // InternalBSharp.g:1241:2: ( ruleClass )
                    {
                    // InternalBSharp.g:1241:2: ( ruleClass )
                    // InternalBSharp.g:1242:3: ruleClass
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
                    // InternalBSharp.g:1247:2: ( ruleDatatype )
                    {
                    // InternalBSharp.g:1247:2: ( ruleDatatype )
                    // InternalBSharp.g:1248:3: ruleDatatype
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
    // InternalBSharp.g:1257:1: rule__TopLevelImport__Alternatives_0 : ( ( ( rule__TopLevelImport__GlobalImportsAssignment_0_0 ) ) | ( ( rule__TopLevelImport__LocalImportsAssignment_0_1 ) ) );
    public final void rule__TopLevelImport__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1261:1: ( ( ( rule__TopLevelImport__GlobalImportsAssignment_0_0 ) ) | ( ( rule__TopLevelImport__LocalImportsAssignment_0_1 ) ) )
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
                    // InternalBSharp.g:1262:2: ( ( rule__TopLevelImport__GlobalImportsAssignment_0_0 ) )
                    {
                    // InternalBSharp.g:1262:2: ( ( rule__TopLevelImport__GlobalImportsAssignment_0_0 ) )
                    // InternalBSharp.g:1263:3: ( rule__TopLevelImport__GlobalImportsAssignment_0_0 )
                    {
                     before(grammarAccess.getTopLevelImportAccess().getGlobalImportsAssignment_0_0()); 
                    // InternalBSharp.g:1264:3: ( rule__TopLevelImport__GlobalImportsAssignment_0_0 )
                    // InternalBSharp.g:1264:4: rule__TopLevelImport__GlobalImportsAssignment_0_0
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
                    // InternalBSharp.g:1268:2: ( ( rule__TopLevelImport__LocalImportsAssignment_0_1 ) )
                    {
                    // InternalBSharp.g:1268:2: ( ( rule__TopLevelImport__LocalImportsAssignment_0_1 ) )
                    // InternalBSharp.g:1269:3: ( rule__TopLevelImport__LocalImportsAssignment_0_1 )
                    {
                     before(grammarAccess.getTopLevelImportAccess().getLocalImportsAssignment_0_1()); 
                    // InternalBSharp.g:1270:3: ( rule__TopLevelImport__LocalImportsAssignment_0_1 )
                    // InternalBSharp.g:1270:4: rule__TopLevelImport__LocalImportsAssignment_0_1
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
    // InternalBSharp.g:1278:1: rule__BodyElements__Alternatives : ( ( ( rule__BodyElements__ClassesAssignment_0 ) ) | ( ( rule__BodyElements__ExtendsAssignment_1 ) ) | ( ( rule__BodyElements__InstancesAssignment_2 ) ) );
    public final void rule__BodyElements__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1282:1: ( ( ( rule__BodyElements__ClassesAssignment_0 ) ) | ( ( rule__BodyElements__ExtendsAssignment_1 ) ) | ( ( rule__BodyElements__InstancesAssignment_2 ) ) )
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
                    // InternalBSharp.g:1283:2: ( ( rule__BodyElements__ClassesAssignment_0 ) )
                    {
                    // InternalBSharp.g:1283:2: ( ( rule__BodyElements__ClassesAssignment_0 ) )
                    // InternalBSharp.g:1284:3: ( rule__BodyElements__ClassesAssignment_0 )
                    {
                     before(grammarAccess.getBodyElementsAccess().getClassesAssignment_0()); 
                    // InternalBSharp.g:1285:3: ( rule__BodyElements__ClassesAssignment_0 )
                    // InternalBSharp.g:1285:4: rule__BodyElements__ClassesAssignment_0
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
                    // InternalBSharp.g:1289:2: ( ( rule__BodyElements__ExtendsAssignment_1 ) )
                    {
                    // InternalBSharp.g:1289:2: ( ( rule__BodyElements__ExtendsAssignment_1 ) )
                    // InternalBSharp.g:1290:3: ( rule__BodyElements__ExtendsAssignment_1 )
                    {
                     before(grammarAccess.getBodyElementsAccess().getExtendsAssignment_1()); 
                    // InternalBSharp.g:1291:3: ( rule__BodyElements__ExtendsAssignment_1 )
                    // InternalBSharp.g:1291:4: rule__BodyElements__ExtendsAssignment_1
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
                    // InternalBSharp.g:1295:2: ( ( rule__BodyElements__InstancesAssignment_2 ) )
                    {
                    // InternalBSharp.g:1295:2: ( ( rule__BodyElements__InstancesAssignment_2 ) )
                    // InternalBSharp.g:1296:3: ( rule__BodyElements__InstancesAssignment_2 )
                    {
                     before(grammarAccess.getBodyElementsAccess().getInstancesAssignment_2()); 
                    // InternalBSharp.g:1297:3: ( rule__BodyElements__InstancesAssignment_2 )
                    // InternalBSharp.g:1297:4: rule__BodyElements__InstancesAssignment_2
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
    // InternalBSharp.g:1305:1: rule__FileImport__Alternatives_1_1 : ( ( '*' ) | ( ( rule__FileImport__TypeAssignment_1_1_1 ) ) );
    public final void rule__FileImport__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1309:1: ( ( '*' ) | ( ( rule__FileImport__TypeAssignment_1_1_1 ) ) )
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
                    // InternalBSharp.g:1310:2: ( '*' )
                    {
                    // InternalBSharp.g:1310:2: ( '*' )
                    // InternalBSharp.g:1311:3: '*'
                    {
                     before(grammarAccess.getFileImportAccess().getAsteriskKeyword_1_1_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getFileImportAccess().getAsteriskKeyword_1_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBSharp.g:1316:2: ( ( rule__FileImport__TypeAssignment_1_1_1 ) )
                    {
                    // InternalBSharp.g:1316:2: ( ( rule__FileImport__TypeAssignment_1_1_1 ) )
                    // InternalBSharp.g:1317:3: ( rule__FileImport__TypeAssignment_1_1_1 )
                    {
                     before(grammarAccess.getFileImportAccess().getTypeAssignment_1_1_1()); 
                    // InternalBSharp.g:1318:3: ( rule__FileImport__TypeAssignment_1_1_1 )
                    // InternalBSharp.g:1318:4: rule__FileImport__TypeAssignment_1_1_1
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


    // $ANTLR start "rule__ConstructedType__ConstructorsAlternatives_1_0_0"
    // InternalBSharp.g:1326:1: rule__ConstructedType__ConstructorsAlternatives_1_0_0 : ( ( '\\u00D7' ) | ( '\\u2192' ) | ( '\\uE102' ) | ( '\\uE100' ) | ( '\\u2194' ) | ( '\\u2916' ) | ( '\\u21F8' ) | ( '\\u21A3' ) | ( '\\u2900' ) | ( '\\u21A0' ) );
    public final void rule__ConstructedType__ConstructorsAlternatives_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1330:1: ( ( '\\u00D7' ) | ( '\\u2192' ) | ( '\\uE102' ) | ( '\\uE100' ) | ( '\\u2194' ) | ( '\\u2916' ) | ( '\\u21F8' ) | ( '\\u21A3' ) | ( '\\u2900' ) | ( '\\u21A0' ) )
            int alt7=10;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt7=1;
                }
                break;
            case 14:
                {
                alt7=2;
                }
                break;
            case 15:
                {
                alt7=3;
                }
                break;
            case 16:
                {
                alt7=4;
                }
                break;
            case 17:
                {
                alt7=5;
                }
                break;
            case 18:
                {
                alt7=6;
                }
                break;
            case 19:
                {
                alt7=7;
                }
                break;
            case 20:
                {
                alt7=8;
                }
                break;
            case 21:
                {
                alt7=9;
                }
                break;
            case 22:
                {
                alt7=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalBSharp.g:1331:2: ( '\\u00D7' )
                    {
                    // InternalBSharp.g:1331:2: ( '\\u00D7' )
                    // InternalBSharp.g:1332:3: '\\u00D7'
                    {
                     before(grammarAccess.getConstructedTypeAccess().getConstructorsMultiplicationSignKeyword_1_0_0_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getConstructedTypeAccess().getConstructorsMultiplicationSignKeyword_1_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBSharp.g:1337:2: ( '\\u2192' )
                    {
                    // InternalBSharp.g:1337:2: ( '\\u2192' )
                    // InternalBSharp.g:1338:3: '\\u2192'
                    {
                     before(grammarAccess.getConstructedTypeAccess().getConstructorsRightwardsArrowKeyword_1_0_0_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getConstructedTypeAccess().getConstructorsRightwardsArrowKeyword_1_0_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBSharp.g:1343:2: ( '\\uE102' )
                    {
                    // InternalBSharp.g:1343:2: ( '\\uE102' )
                    // InternalBSharp.g:1344:3: '\\uE102'
                    {
                     before(grammarAccess.getConstructedTypeAccess().getConstructorsPrivateUseAreaE102Keyword_1_0_0_2()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getConstructedTypeAccess().getConstructorsPrivateUseAreaE102Keyword_1_0_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalBSharp.g:1349:2: ( '\\uE100' )
                    {
                    // InternalBSharp.g:1349:2: ( '\\uE100' )
                    // InternalBSharp.g:1350:3: '\\uE100'
                    {
                     before(grammarAccess.getConstructedTypeAccess().getConstructorsPrivateUseAreaE100Keyword_1_0_0_3()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getConstructedTypeAccess().getConstructorsPrivateUseAreaE100Keyword_1_0_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalBSharp.g:1355:2: ( '\\u2194' )
                    {
                    // InternalBSharp.g:1355:2: ( '\\u2194' )
                    // InternalBSharp.g:1356:3: '\\u2194'
                    {
                     before(grammarAccess.getConstructedTypeAccess().getConstructorsLeftRightArrowKeyword_1_0_0_4()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getConstructedTypeAccess().getConstructorsLeftRightArrowKeyword_1_0_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalBSharp.g:1361:2: ( '\\u2916' )
                    {
                    // InternalBSharp.g:1361:2: ( '\\u2916' )
                    // InternalBSharp.g:1362:3: '\\u2916'
                    {
                     before(grammarAccess.getConstructedTypeAccess().getConstructorsRightwardsTwoHeadedArrowWithTailKeyword_1_0_0_5()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getConstructedTypeAccess().getConstructorsRightwardsTwoHeadedArrowWithTailKeyword_1_0_0_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalBSharp.g:1367:2: ( '\\u21F8' )
                    {
                    // InternalBSharp.g:1367:2: ( '\\u21F8' )
                    // InternalBSharp.g:1368:3: '\\u21F8'
                    {
                     before(grammarAccess.getConstructedTypeAccess().getConstructorsRightwardsArrowWithVerticalStrokeKeyword_1_0_0_6()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getConstructedTypeAccess().getConstructorsRightwardsArrowWithVerticalStrokeKeyword_1_0_0_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalBSharp.g:1373:2: ( '\\u21A3' )
                    {
                    // InternalBSharp.g:1373:2: ( '\\u21A3' )
                    // InternalBSharp.g:1374:3: '\\u21A3'
                    {
                     before(grammarAccess.getConstructedTypeAccess().getConstructorsRightwardsArrowWithTailKeyword_1_0_0_7()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getConstructedTypeAccess().getConstructorsRightwardsArrowWithTailKeyword_1_0_0_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalBSharp.g:1379:2: ( '\\u2900' )
                    {
                    // InternalBSharp.g:1379:2: ( '\\u2900' )
                    // InternalBSharp.g:1380:3: '\\u2900'
                    {
                     before(grammarAccess.getConstructedTypeAccess().getConstructorsRightwardsTwoHeadedArrowWithVerticalStrokeKeyword_1_0_0_8()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getConstructedTypeAccess().getConstructorsRightwardsTwoHeadedArrowWithVerticalStrokeKeyword_1_0_0_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalBSharp.g:1385:2: ( '\\u21A0' )
                    {
                    // InternalBSharp.g:1385:2: ( '\\u21A0' )
                    // InternalBSharp.g:1386:3: '\\u21A0'
                    {
                     before(grammarAccess.getConstructedTypeAccess().getConstructorsRightwardsTwoHeadedArrowKeyword_1_0_0_9()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getConstructedTypeAccess().getConstructorsRightwardsTwoHeadedArrowKeyword_1_0_0_9()); 

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
    // $ANTLR end "rule__ConstructedType__ConstructorsAlternatives_1_0_0"


    // $ANTLR start "rule__TypeBodyElements__Alternatives"
    // InternalBSharp.g:1395:1: rule__TypeBodyElements__Alternatives : ( ( ( rule__TypeBodyElements__FunctionsAssignment_0 ) ) | ( ( rule__TypeBodyElements__TheoremsAssignment_1 ) ) );
    public final void rule__TypeBodyElements__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1399:1: ( ( ( rule__TypeBodyElements__FunctionsAssignment_0 ) ) | ( ( rule__TypeBodyElements__TheoremsAssignment_1 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                alt8=1;
            }
            else if ( (LA8_0==50) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalBSharp.g:1400:2: ( ( rule__TypeBodyElements__FunctionsAssignment_0 ) )
                    {
                    // InternalBSharp.g:1400:2: ( ( rule__TypeBodyElements__FunctionsAssignment_0 ) )
                    // InternalBSharp.g:1401:3: ( rule__TypeBodyElements__FunctionsAssignment_0 )
                    {
                     before(grammarAccess.getTypeBodyElementsAccess().getFunctionsAssignment_0()); 
                    // InternalBSharp.g:1402:3: ( rule__TypeBodyElements__FunctionsAssignment_0 )
                    // InternalBSharp.g:1402:4: rule__TypeBodyElements__FunctionsAssignment_0
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
                    // InternalBSharp.g:1406:2: ( ( rule__TypeBodyElements__TheoremsAssignment_1 ) )
                    {
                    // InternalBSharp.g:1406:2: ( ( rule__TypeBodyElements__TheoremsAssignment_1 ) )
                    // InternalBSharp.g:1407:3: ( rule__TypeBodyElements__TheoremsAssignment_1 )
                    {
                     before(grammarAccess.getTypeBodyElementsAccess().getTheoremsAssignment_1()); 
                    // InternalBSharp.g:1408:3: ( rule__TypeBodyElements__TheoremsAssignment_1 )
                    // InternalBSharp.g:1408:4: rule__TypeBodyElements__TheoremsAssignment_1
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
    // InternalBSharp.g:1416:1: rule__Quantifier__QTypeAlternatives_0_0 : ( ( '\\u2200' ) | ( '\\u2203' ) );
    public final void rule__Quantifier__QTypeAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1420:1: ( ( '\\u2200' ) | ( '\\u2203' ) )
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
                    // InternalBSharp.g:1421:2: ( '\\u2200' )
                    {
                    // InternalBSharp.g:1421:2: ( '\\u2200' )
                    // InternalBSharp.g:1422:3: '\\u2200'
                    {
                     before(grammarAccess.getQuantifierAccess().getQTypeForAllKeyword_0_0_0()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getQuantifierAccess().getQTypeForAllKeyword_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBSharp.g:1427:2: ( '\\u2203' )
                    {
                    // InternalBSharp.g:1427:2: ( '\\u2203' )
                    // InternalBSharp.g:1428:3: '\\u2203'
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
    // InternalBSharp.g:1437:1: rule__RootExpression__Alternatives : ( ( ruleLambda ) | ( ruleQuantifier ) | ( ruleInfix ) | ( ruleMatchStatement ) );
    public final void rule__RootExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1441:1: ( ( ruleLambda ) | ( ruleQuantifier ) | ( ruleInfix ) | ( ruleMatchStatement ) )
            int alt10=4;
            switch ( input.LA(1) ) {
            case 54:
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
            case 41:
                {
                alt10=3;
                }
                break;
            case 49:
                {
                alt10=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalBSharp.g:1442:2: ( ruleLambda )
                    {
                    // InternalBSharp.g:1442:2: ( ruleLambda )
                    // InternalBSharp.g:1443:3: ruleLambda
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
                    // InternalBSharp.g:1448:2: ( ruleQuantifier )
                    {
                    // InternalBSharp.g:1448:2: ( ruleQuantifier )
                    // InternalBSharp.g:1449:3: ruleQuantifier
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
                    // InternalBSharp.g:1454:2: ( ruleInfix )
                    {
                    // InternalBSharp.g:1454:2: ( ruleInfix )
                    // InternalBSharp.g:1455:3: ruleInfix
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
                    // InternalBSharp.g:1460:2: ( ruleMatchStatement )
                    {
                    // InternalBSharp.g:1460:2: ( ruleMatchStatement )
                    // InternalBSharp.g:1461:3: ruleMatchStatement
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
    // InternalBSharp.g:1470:1: rule__Infix__Alternatives_1_1 : ( ( ( rule__Infix__FuncNameAssignment_1_1_0 ) ) | ( ( rule__Infix__OpNameAssignment_1_1_1 ) ) );
    public final void rule__Infix__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1474:1: ( ( ( rule__Infix__FuncNameAssignment_1_1_0 ) ) | ( ( rule__Infix__OpNameAssignment_1_1_1 ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                alt11=1;
            }
            else if ( ((LA11_0>=25 && LA11_0<=30)) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalBSharp.g:1475:2: ( ( rule__Infix__FuncNameAssignment_1_1_0 ) )
                    {
                    // InternalBSharp.g:1475:2: ( ( rule__Infix__FuncNameAssignment_1_1_0 ) )
                    // InternalBSharp.g:1476:3: ( rule__Infix__FuncNameAssignment_1_1_0 )
                    {
                     before(grammarAccess.getInfixAccess().getFuncNameAssignment_1_1_0()); 
                    // InternalBSharp.g:1477:3: ( rule__Infix__FuncNameAssignment_1_1_0 )
                    // InternalBSharp.g:1477:4: rule__Infix__FuncNameAssignment_1_1_0
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
                    // InternalBSharp.g:1481:2: ( ( rule__Infix__OpNameAssignment_1_1_1 ) )
                    {
                    // InternalBSharp.g:1481:2: ( ( rule__Infix__OpNameAssignment_1_1_1 ) )
                    // InternalBSharp.g:1482:3: ( rule__Infix__OpNameAssignment_1_1_1 )
                    {
                     before(grammarAccess.getInfixAccess().getOpNameAssignment_1_1_1()); 
                    // InternalBSharp.g:1483:3: ( rule__Infix__OpNameAssignment_1_1_1 )
                    // InternalBSharp.g:1483:4: rule__Infix__OpNameAssignment_1_1_1
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
    // InternalBSharp.g:1491:1: rule__Element__Alternatives : ( ( ruleBracket ) | ( rulePrefix ) | ( ruleFunctionCall ) );
    public final void rule__Element__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1495:1: ( ( ruleBracket ) | ( rulePrefix ) | ( ruleFunctionCall ) )
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
                    // InternalBSharp.g:1496:2: ( ruleBracket )
                    {
                    // InternalBSharp.g:1496:2: ( ruleBracket )
                    // InternalBSharp.g:1497:3: ruleBracket
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
                    // InternalBSharp.g:1502:2: ( rulePrefix )
                    {
                    // InternalBSharp.g:1502:2: ( rulePrefix )
                    // InternalBSharp.g:1503:3: rulePrefix
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
                    // InternalBSharp.g:1508:2: ( ruleFunctionCall )
                    {
                    // InternalBSharp.g:1508:2: ( ruleFunctionCall )
                    // InternalBSharp.g:1509:3: ruleFunctionCall
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
    // InternalBSharp.g:1518:1: rule__FunctionCall__Alternatives_0 : ( ( ( rule__FunctionCall__TypeInstAssignment_0_0 ) ) | ( ( rule__FunctionCall__ClassVarDeclAssignment_0_1 ) ) );
    public final void rule__FunctionCall__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1522:1: ( ( ( rule__FunctionCall__TypeInstAssignment_0_0 ) ) | ( ( rule__FunctionCall__ClassVarDeclAssignment_0_1 ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==33) ) {
                    alt13=2;
                }
                else if ( (LA13_1==EOF||LA13_1==RULE_ID||(LA13_1>=25 && LA13_1<=30)||LA13_1==37||(LA13_1>=40 && LA13_1<=42)||LA13_1==45||(LA13_1>=47 && LA13_1<=48)||LA13_1==50) ) {
                    alt13=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

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
                    // InternalBSharp.g:1523:2: ( ( rule__FunctionCall__TypeInstAssignment_0_0 ) )
                    {
                    // InternalBSharp.g:1523:2: ( ( rule__FunctionCall__TypeInstAssignment_0_0 ) )
                    // InternalBSharp.g:1524:3: ( rule__FunctionCall__TypeInstAssignment_0_0 )
                    {
                     before(grammarAccess.getFunctionCallAccess().getTypeInstAssignment_0_0()); 
                    // InternalBSharp.g:1525:3: ( rule__FunctionCall__TypeInstAssignment_0_0 )
                    // InternalBSharp.g:1525:4: rule__FunctionCall__TypeInstAssignment_0_0
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
                    // InternalBSharp.g:1529:2: ( ( rule__FunctionCall__ClassVarDeclAssignment_0_1 ) )
                    {
                    // InternalBSharp.g:1529:2: ( ( rule__FunctionCall__ClassVarDeclAssignment_0_1 ) )
                    // InternalBSharp.g:1530:3: ( rule__FunctionCall__ClassVarDeclAssignment_0_1 )
                    {
                     before(grammarAccess.getFunctionCallAccess().getClassVarDeclAssignment_0_1()); 
                    // InternalBSharp.g:1531:3: ( rule__FunctionCall__ClassVarDeclAssignment_0_1 )
                    // InternalBSharp.g:1531:4: rule__FunctionCall__ClassVarDeclAssignment_0_1
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
    // InternalBSharp.g:1539:1: rule__InbuiltInfix__Alternatives : ( ( '\\u21D4' ) | ( '\\u21D2' ) | ( '=' ) | ( '\\u2260' ) | ( '\\u2227' ) | ( '\\u2228' ) );
    public final void rule__InbuiltInfix__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1543:1: ( ( '\\u21D4' ) | ( '\\u21D2' ) | ( '=' ) | ( '\\u2260' ) | ( '\\u2227' ) | ( '\\u2228' ) )
            int alt14=6;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt14=1;
                }
                break;
            case 26:
                {
                alt14=2;
                }
                break;
            case 27:
                {
                alt14=3;
                }
                break;
            case 28:
                {
                alt14=4;
                }
                break;
            case 29:
                {
                alt14=5;
                }
                break;
            case 30:
                {
                alt14=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalBSharp.g:1544:2: ( '\\u21D4' )
                    {
                    // InternalBSharp.g:1544:2: ( '\\u21D4' )
                    // InternalBSharp.g:1545:3: '\\u21D4'
                    {
                     before(grammarAccess.getInbuiltInfixAccess().getLeftRightDoubleArrowKeyword_0()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getInbuiltInfixAccess().getLeftRightDoubleArrowKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBSharp.g:1550:2: ( '\\u21D2' )
                    {
                    // InternalBSharp.g:1550:2: ( '\\u21D2' )
                    // InternalBSharp.g:1551:3: '\\u21D2'
                    {
                     before(grammarAccess.getInbuiltInfixAccess().getRightwardsDoubleArrowKeyword_1()); 
                    match(input,26,FOLLOW_2); 
                     after(grammarAccess.getInbuiltInfixAccess().getRightwardsDoubleArrowKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBSharp.g:1556:2: ( '=' )
                    {
                    // InternalBSharp.g:1556:2: ( '=' )
                    // InternalBSharp.g:1557:3: '='
                    {
                     before(grammarAccess.getInbuiltInfixAccess().getEqualsSignKeyword_2()); 
                    match(input,27,FOLLOW_2); 
                     after(grammarAccess.getInbuiltInfixAccess().getEqualsSignKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalBSharp.g:1562:2: ( '\\u2260' )
                    {
                    // InternalBSharp.g:1562:2: ( '\\u2260' )
                    // InternalBSharp.g:1563:3: '\\u2260'
                    {
                     before(grammarAccess.getInbuiltInfixAccess().getNotEqualToKeyword_3()); 
                    match(input,28,FOLLOW_2); 
                     after(grammarAccess.getInbuiltInfixAccess().getNotEqualToKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalBSharp.g:1568:2: ( '\\u2227' )
                    {
                    // InternalBSharp.g:1568:2: ( '\\u2227' )
                    // InternalBSharp.g:1569:3: '\\u2227'
                    {
                     before(grammarAccess.getInbuiltInfixAccess().getLogicalAndKeyword_4()); 
                    match(input,29,FOLLOW_2); 
                     after(grammarAccess.getInbuiltInfixAccess().getLogicalAndKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalBSharp.g:1574:2: ( '\\u2228' )
                    {
                    // InternalBSharp.g:1574:2: ( '\\u2228' )
                    // InternalBSharp.g:1575:3: '\\u2228'
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
    // InternalBSharp.g:1584:1: rule__TopLevel__Group__0 : rule__TopLevel__Group__0__Impl rule__TopLevel__Group__1 ;
    public final void rule__TopLevel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1588:1: ( rule__TopLevel__Group__0__Impl rule__TopLevel__Group__1 )
            // InternalBSharp.g:1589:2: rule__TopLevel__Group__0__Impl rule__TopLevel__Group__1
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
    // InternalBSharp.g:1596:1: rule__TopLevel__Group__0__Impl : ( 'package' ) ;
    public final void rule__TopLevel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1600:1: ( ( 'package' ) )
            // InternalBSharp.g:1601:1: ( 'package' )
            {
            // InternalBSharp.g:1601:1: ( 'package' )
            // InternalBSharp.g:1602:2: 'package'
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
    // InternalBSharp.g:1611:1: rule__TopLevel__Group__1 : rule__TopLevel__Group__1__Impl rule__TopLevel__Group__2 ;
    public final void rule__TopLevel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1615:1: ( rule__TopLevel__Group__1__Impl rule__TopLevel__Group__2 )
            // InternalBSharp.g:1616:2: rule__TopLevel__Group__1__Impl rule__TopLevel__Group__2
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
    // InternalBSharp.g:1623:1: rule__TopLevel__Group__1__Impl : ( ( rule__TopLevel__NameAssignment_1 ) ) ;
    public final void rule__TopLevel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1627:1: ( ( ( rule__TopLevel__NameAssignment_1 ) ) )
            // InternalBSharp.g:1628:1: ( ( rule__TopLevel__NameAssignment_1 ) )
            {
            // InternalBSharp.g:1628:1: ( ( rule__TopLevel__NameAssignment_1 ) )
            // InternalBSharp.g:1629:2: ( rule__TopLevel__NameAssignment_1 )
            {
             before(grammarAccess.getTopLevelAccess().getNameAssignment_1()); 
            // InternalBSharp.g:1630:2: ( rule__TopLevel__NameAssignment_1 )
            // InternalBSharp.g:1630:3: rule__TopLevel__NameAssignment_1
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
    // InternalBSharp.g:1638:1: rule__TopLevel__Group__2 : rule__TopLevel__Group__2__Impl ;
    public final void rule__TopLevel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1642:1: ( rule__TopLevel__Group__2__Impl )
            // InternalBSharp.g:1643:2: rule__TopLevel__Group__2__Impl
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
    // InternalBSharp.g:1649:1: rule__TopLevel__Group__2__Impl : ( ( rule__TopLevel__TopLevelFileAssignment_2 ) ) ;
    public final void rule__TopLevel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1653:1: ( ( ( rule__TopLevel__TopLevelFileAssignment_2 ) ) )
            // InternalBSharp.g:1654:1: ( ( rule__TopLevel__TopLevelFileAssignment_2 ) )
            {
            // InternalBSharp.g:1654:1: ( ( rule__TopLevel__TopLevelFileAssignment_2 ) )
            // InternalBSharp.g:1655:2: ( rule__TopLevel__TopLevelFileAssignment_2 )
            {
             before(grammarAccess.getTopLevelAccess().getTopLevelFileAssignment_2()); 
            // InternalBSharp.g:1656:2: ( rule__TopLevel__TopLevelFileAssignment_2 )
            // InternalBSharp.g:1656:3: rule__TopLevel__TopLevelFileAssignment_2
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
    // InternalBSharp.g:1665:1: rule__THM_NAME__Group__0 : rule__THM_NAME__Group__0__Impl rule__THM_NAME__Group__1 ;
    public final void rule__THM_NAME__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1669:1: ( rule__THM_NAME__Group__0__Impl rule__THM_NAME__Group__1 )
            // InternalBSharp.g:1670:2: rule__THM_NAME__Group__0__Impl rule__THM_NAME__Group__1
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
    // InternalBSharp.g:1677:1: rule__THM_NAME__Group__0__Impl : ( ( rule__THM_NAME__Alternatives_0 )* ) ;
    public final void rule__THM_NAME__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1681:1: ( ( ( rule__THM_NAME__Alternatives_0 )* ) )
            // InternalBSharp.g:1682:1: ( ( rule__THM_NAME__Alternatives_0 )* )
            {
            // InternalBSharp.g:1682:1: ( ( rule__THM_NAME__Alternatives_0 )* )
            // InternalBSharp.g:1683:2: ( rule__THM_NAME__Alternatives_0 )*
            {
             before(grammarAccess.getTHM_NAMEAccess().getAlternatives_0()); 
            // InternalBSharp.g:1684:2: ( rule__THM_NAME__Alternatives_0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=RULE_INT && LA15_0<=RULE_WS)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalBSharp.g:1684:3: rule__THM_NAME__Alternatives_0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__THM_NAME__Alternatives_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalBSharp.g:1692:1: rule__THM_NAME__Group__1 : rule__THM_NAME__Group__1__Impl ;
    public final void rule__THM_NAME__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1696:1: ( rule__THM_NAME__Group__1__Impl )
            // InternalBSharp.g:1697:2: rule__THM_NAME__Group__1__Impl
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
    // InternalBSharp.g:1703:1: rule__THM_NAME__Group__1__Impl : ( ':' ) ;
    public final void rule__THM_NAME__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1707:1: ( ( ':' ) )
            // InternalBSharp.g:1708:1: ( ':' )
            {
            // InternalBSharp.g:1708:1: ( ':' )
            // InternalBSharp.g:1709:2: ':'
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
    // InternalBSharp.g:1719:1: rule__TopLevelFile__Group__0 : rule__TopLevelFile__Group__0__Impl rule__TopLevelFile__Group__1 ;
    public final void rule__TopLevelFile__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1723:1: ( rule__TopLevelFile__Group__0__Impl rule__TopLevelFile__Group__1 )
            // InternalBSharp.g:1724:2: rule__TopLevelFile__Group__0__Impl rule__TopLevelFile__Group__1
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
    // InternalBSharp.g:1731:1: rule__TopLevelFile__Group__0__Impl : ( () ) ;
    public final void rule__TopLevelFile__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1735:1: ( ( () ) )
            // InternalBSharp.g:1736:1: ( () )
            {
            // InternalBSharp.g:1736:1: ( () )
            // InternalBSharp.g:1737:2: ()
            {
             before(grammarAccess.getTopLevelFileAccess().getTopLevelFileAction_0()); 
            // InternalBSharp.g:1738:2: ()
            // InternalBSharp.g:1738:3: 
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
    // InternalBSharp.g:1746:1: rule__TopLevelFile__Group__1 : rule__TopLevelFile__Group__1__Impl rule__TopLevelFile__Group__2 ;
    public final void rule__TopLevelFile__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1750:1: ( rule__TopLevelFile__Group__1__Impl rule__TopLevelFile__Group__2 )
            // InternalBSharp.g:1751:2: rule__TopLevelFile__Group__1__Impl rule__TopLevelFile__Group__2
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
    // InternalBSharp.g:1758:1: rule__TopLevelFile__Group__1__Impl : ( ( rule__TopLevelFile__NoImportElementsAssignment_1 )? ) ;
    public final void rule__TopLevelFile__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1762:1: ( ( ( rule__TopLevelFile__NoImportElementsAssignment_1 )? ) )
            // InternalBSharp.g:1763:1: ( ( rule__TopLevelFile__NoImportElementsAssignment_1 )? )
            {
            // InternalBSharp.g:1763:1: ( ( rule__TopLevelFile__NoImportElementsAssignment_1 )? )
            // InternalBSharp.g:1764:2: ( rule__TopLevelFile__NoImportElementsAssignment_1 )?
            {
             before(grammarAccess.getTopLevelFileAccess().getNoImportElementsAssignment_1()); 
            // InternalBSharp.g:1765:2: ( rule__TopLevelFile__NoImportElementsAssignment_1 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==36||LA16_0==44||LA16_0==46||LA16_0==52) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalBSharp.g:1765:3: rule__TopLevelFile__NoImportElementsAssignment_1
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
    // InternalBSharp.g:1773:1: rule__TopLevelFile__Group__2 : rule__TopLevelFile__Group__2__Impl ;
    public final void rule__TopLevelFile__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1777:1: ( rule__TopLevelFile__Group__2__Impl )
            // InternalBSharp.g:1778:2: rule__TopLevelFile__Group__2__Impl
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
    // InternalBSharp.g:1784:1: rule__TopLevelFile__Group__2__Impl : ( ( rule__TopLevelFile__TopLevelImportsAssignment_2 )* ) ;
    public final void rule__TopLevelFile__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1788:1: ( ( ( rule__TopLevelFile__TopLevelImportsAssignment_2 )* ) )
            // InternalBSharp.g:1789:1: ( ( rule__TopLevelFile__TopLevelImportsAssignment_2 )* )
            {
            // InternalBSharp.g:1789:1: ( ( rule__TopLevelFile__TopLevelImportsAssignment_2 )* )
            // InternalBSharp.g:1790:2: ( rule__TopLevelFile__TopLevelImportsAssignment_2 )*
            {
             before(grammarAccess.getTopLevelFileAccess().getTopLevelImportsAssignment_2()); 
            // InternalBSharp.g:1791:2: ( rule__TopLevelFile__TopLevelImportsAssignment_2 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=34 && LA17_0<=35)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalBSharp.g:1791:3: rule__TopLevelFile__TopLevelImportsAssignment_2
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__TopLevelFile__TopLevelImportsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalBSharp.g:1800:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1804:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalBSharp.g:1805:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
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
    // InternalBSharp.g:1812:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1816:1: ( ( RULE_ID ) )
            // InternalBSharp.g:1817:1: ( RULE_ID )
            {
            // InternalBSharp.g:1817:1: ( RULE_ID )
            // InternalBSharp.g:1818:2: RULE_ID
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
    // InternalBSharp.g:1827:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1831:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalBSharp.g:1832:2: rule__QualifiedName__Group__1__Impl
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
    // InternalBSharp.g:1838:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1842:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalBSharp.g:1843:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalBSharp.g:1843:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalBSharp.g:1844:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalBSharp.g:1845:2: ( rule__QualifiedName__Group_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==33) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalBSharp.g:1845:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // InternalBSharp.g:1854:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1858:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalBSharp.g:1859:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
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
    // InternalBSharp.g:1866:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1870:1: ( ( '.' ) )
            // InternalBSharp.g:1871:1: ( '.' )
            {
            // InternalBSharp.g:1871:1: ( '.' )
            // InternalBSharp.g:1872:2: '.'
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
    // InternalBSharp.g:1881:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1885:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalBSharp.g:1886:2: rule__QualifiedName__Group_1__1__Impl
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
    // InternalBSharp.g:1892:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1896:1: ( ( RULE_ID ) )
            // InternalBSharp.g:1897:1: ( RULE_ID )
            {
            // InternalBSharp.g:1897:1: ( RULE_ID )
            // InternalBSharp.g:1898:2: RULE_ID
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
    // InternalBSharp.g:1908:1: rule__TopLevelImport__Group__0 : rule__TopLevelImport__Group__0__Impl rule__TopLevelImport__Group__1 ;
    public final void rule__TopLevelImport__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1912:1: ( rule__TopLevelImport__Group__0__Impl rule__TopLevelImport__Group__1 )
            // InternalBSharp.g:1913:2: rule__TopLevelImport__Group__0__Impl rule__TopLevelImport__Group__1
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
    // InternalBSharp.g:1920:1: rule__TopLevelImport__Group__0__Impl : ( ( ( rule__TopLevelImport__Alternatives_0 ) ) ( ( rule__TopLevelImport__Alternatives_0 )* ) ) ;
    public final void rule__TopLevelImport__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1924:1: ( ( ( ( rule__TopLevelImport__Alternatives_0 ) ) ( ( rule__TopLevelImport__Alternatives_0 )* ) ) )
            // InternalBSharp.g:1925:1: ( ( ( rule__TopLevelImport__Alternatives_0 ) ) ( ( rule__TopLevelImport__Alternatives_0 )* ) )
            {
            // InternalBSharp.g:1925:1: ( ( ( rule__TopLevelImport__Alternatives_0 ) ) ( ( rule__TopLevelImport__Alternatives_0 )* ) )
            // InternalBSharp.g:1926:2: ( ( rule__TopLevelImport__Alternatives_0 ) ) ( ( rule__TopLevelImport__Alternatives_0 )* )
            {
            // InternalBSharp.g:1926:2: ( ( rule__TopLevelImport__Alternatives_0 ) )
            // InternalBSharp.g:1927:3: ( rule__TopLevelImport__Alternatives_0 )
            {
             before(grammarAccess.getTopLevelImportAccess().getAlternatives_0()); 
            // InternalBSharp.g:1928:3: ( rule__TopLevelImport__Alternatives_0 )
            // InternalBSharp.g:1928:4: rule__TopLevelImport__Alternatives_0
            {
            pushFollow(FOLLOW_8);
            rule__TopLevelImport__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getTopLevelImportAccess().getAlternatives_0()); 

            }

            // InternalBSharp.g:1931:2: ( ( rule__TopLevelImport__Alternatives_0 )* )
            // InternalBSharp.g:1932:3: ( rule__TopLevelImport__Alternatives_0 )*
            {
             before(grammarAccess.getTopLevelImportAccess().getAlternatives_0()); 
            // InternalBSharp.g:1933:3: ( rule__TopLevelImport__Alternatives_0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=34 && LA19_0<=35)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalBSharp.g:1933:4: rule__TopLevelImport__Alternatives_0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__TopLevelImport__Alternatives_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // InternalBSharp.g:1942:1: rule__TopLevelImport__Group__1 : rule__TopLevelImport__Group__1__Impl ;
    public final void rule__TopLevelImport__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1946:1: ( rule__TopLevelImport__Group__1__Impl )
            // InternalBSharp.g:1947:2: rule__TopLevelImport__Group__1__Impl
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
    // InternalBSharp.g:1953:1: rule__TopLevelImport__Group__1__Impl : ( ( rule__TopLevelImport__BodyElementsAssignment_1 ) ) ;
    public final void rule__TopLevelImport__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1957:1: ( ( ( rule__TopLevelImport__BodyElementsAssignment_1 ) ) )
            // InternalBSharp.g:1958:1: ( ( rule__TopLevelImport__BodyElementsAssignment_1 ) )
            {
            // InternalBSharp.g:1958:1: ( ( rule__TopLevelImport__BodyElementsAssignment_1 ) )
            // InternalBSharp.g:1959:2: ( rule__TopLevelImport__BodyElementsAssignment_1 )
            {
             before(grammarAccess.getTopLevelImportAccess().getBodyElementsAssignment_1()); 
            // InternalBSharp.g:1960:2: ( rule__TopLevelImport__BodyElementsAssignment_1 )
            // InternalBSharp.g:1960:3: rule__TopLevelImport__BodyElementsAssignment_1
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
    // InternalBSharp.g:1969:1: rule__GlobalImport__Group__0 : rule__GlobalImport__Group__0__Impl rule__GlobalImport__Group__1 ;
    public final void rule__GlobalImport__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1973:1: ( rule__GlobalImport__Group__0__Impl rule__GlobalImport__Group__1 )
            // InternalBSharp.g:1974:2: rule__GlobalImport__Group__0__Impl rule__GlobalImport__Group__1
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
    // InternalBSharp.g:1981:1: rule__GlobalImport__Group__0__Impl : ( 'From' ) ;
    public final void rule__GlobalImport__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1985:1: ( ( 'From' ) )
            // InternalBSharp.g:1986:1: ( 'From' )
            {
            // InternalBSharp.g:1986:1: ( 'From' )
            // InternalBSharp.g:1987:2: 'From'
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
    // InternalBSharp.g:1996:1: rule__GlobalImport__Group__1 : rule__GlobalImport__Group__1__Impl rule__GlobalImport__Group__2 ;
    public final void rule__GlobalImport__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2000:1: ( rule__GlobalImport__Group__1__Impl rule__GlobalImport__Group__2 )
            // InternalBSharp.g:2001:2: rule__GlobalImport__Group__1__Impl rule__GlobalImport__Group__2
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
    // InternalBSharp.g:2008:1: rule__GlobalImport__Group__1__Impl : ( ( rule__GlobalImport__ProjectAssignment_1 ) ) ;
    public final void rule__GlobalImport__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2012:1: ( ( ( rule__GlobalImport__ProjectAssignment_1 ) ) )
            // InternalBSharp.g:2013:1: ( ( rule__GlobalImport__ProjectAssignment_1 ) )
            {
            // InternalBSharp.g:2013:1: ( ( rule__GlobalImport__ProjectAssignment_1 ) )
            // InternalBSharp.g:2014:2: ( rule__GlobalImport__ProjectAssignment_1 )
            {
             before(grammarAccess.getGlobalImportAccess().getProjectAssignment_1()); 
            // InternalBSharp.g:2015:2: ( rule__GlobalImport__ProjectAssignment_1 )
            // InternalBSharp.g:2015:3: rule__GlobalImport__ProjectAssignment_1
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
    // InternalBSharp.g:2023:1: rule__GlobalImport__Group__2 : rule__GlobalImport__Group__2__Impl rule__GlobalImport__Group__3 ;
    public final void rule__GlobalImport__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2027:1: ( rule__GlobalImport__Group__2__Impl rule__GlobalImport__Group__3 )
            // InternalBSharp.g:2028:2: rule__GlobalImport__Group__2__Impl rule__GlobalImport__Group__3
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
    // InternalBSharp.g:2035:1: rule__GlobalImport__Group__2__Impl : ( 'Import' ) ;
    public final void rule__GlobalImport__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2039:1: ( ( 'Import' ) )
            // InternalBSharp.g:2040:1: ( 'Import' )
            {
            // InternalBSharp.g:2040:1: ( 'Import' )
            // InternalBSharp.g:2041:2: 'Import'
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
    // InternalBSharp.g:2050:1: rule__GlobalImport__Group__3 : rule__GlobalImport__Group__3__Impl ;
    public final void rule__GlobalImport__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2054:1: ( rule__GlobalImport__Group__3__Impl )
            // InternalBSharp.g:2055:2: rule__GlobalImport__Group__3__Impl
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
    // InternalBSharp.g:2061:1: rule__GlobalImport__Group__3__Impl : ( ( ( rule__GlobalImport__FileImportsAssignment_3 ) ) ( ( rule__GlobalImport__FileImportsAssignment_3 )* ) ) ;
    public final void rule__GlobalImport__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2065:1: ( ( ( ( rule__GlobalImport__FileImportsAssignment_3 ) ) ( ( rule__GlobalImport__FileImportsAssignment_3 )* ) ) )
            // InternalBSharp.g:2066:1: ( ( ( rule__GlobalImport__FileImportsAssignment_3 ) ) ( ( rule__GlobalImport__FileImportsAssignment_3 )* ) )
            {
            // InternalBSharp.g:2066:1: ( ( ( rule__GlobalImport__FileImportsAssignment_3 ) ) ( ( rule__GlobalImport__FileImportsAssignment_3 )* ) )
            // InternalBSharp.g:2067:2: ( ( rule__GlobalImport__FileImportsAssignment_3 ) ) ( ( rule__GlobalImport__FileImportsAssignment_3 )* )
            {
            // InternalBSharp.g:2067:2: ( ( rule__GlobalImport__FileImportsAssignment_3 ) )
            // InternalBSharp.g:2068:3: ( rule__GlobalImport__FileImportsAssignment_3 )
            {
             before(grammarAccess.getGlobalImportAccess().getFileImportsAssignment_3()); 
            // InternalBSharp.g:2069:3: ( rule__GlobalImport__FileImportsAssignment_3 )
            // InternalBSharp.g:2069:4: rule__GlobalImport__FileImportsAssignment_3
            {
            pushFollow(FOLLOW_13);
            rule__GlobalImport__FileImportsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getGlobalImportAccess().getFileImportsAssignment_3()); 

            }

            // InternalBSharp.g:2072:2: ( ( rule__GlobalImport__FileImportsAssignment_3 )* )
            // InternalBSharp.g:2073:3: ( rule__GlobalImport__FileImportsAssignment_3 )*
            {
             before(grammarAccess.getGlobalImportAccess().getFileImportsAssignment_3()); 
            // InternalBSharp.g:2074:3: ( rule__GlobalImport__FileImportsAssignment_3 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ID) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalBSharp.g:2074:4: rule__GlobalImport__FileImportsAssignment_3
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__GlobalImport__FileImportsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // InternalBSharp.g:2084:1: rule__FileImport__Group__0 : rule__FileImport__Group__0__Impl rule__FileImport__Group__1 ;
    public final void rule__FileImport__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2088:1: ( rule__FileImport__Group__0__Impl rule__FileImport__Group__1 )
            // InternalBSharp.g:2089:2: rule__FileImport__Group__0__Impl rule__FileImport__Group__1
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
    // InternalBSharp.g:2096:1: rule__FileImport__Group__0__Impl : ( ( rule__FileImport__FileNameAssignment_0 ) ) ;
    public final void rule__FileImport__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2100:1: ( ( ( rule__FileImport__FileNameAssignment_0 ) ) )
            // InternalBSharp.g:2101:1: ( ( rule__FileImport__FileNameAssignment_0 ) )
            {
            // InternalBSharp.g:2101:1: ( ( rule__FileImport__FileNameAssignment_0 ) )
            // InternalBSharp.g:2102:2: ( rule__FileImport__FileNameAssignment_0 )
            {
             before(grammarAccess.getFileImportAccess().getFileNameAssignment_0()); 
            // InternalBSharp.g:2103:2: ( rule__FileImport__FileNameAssignment_0 )
            // InternalBSharp.g:2103:3: rule__FileImport__FileNameAssignment_0
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
    // InternalBSharp.g:2111:1: rule__FileImport__Group__1 : rule__FileImport__Group__1__Impl ;
    public final void rule__FileImport__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2115:1: ( rule__FileImport__Group__1__Impl )
            // InternalBSharp.g:2116:2: rule__FileImport__Group__1__Impl
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
    // InternalBSharp.g:2122:1: rule__FileImport__Group__1__Impl : ( ( rule__FileImport__Group_1__0 )? ) ;
    public final void rule__FileImport__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2126:1: ( ( ( rule__FileImport__Group_1__0 )? ) )
            // InternalBSharp.g:2127:1: ( ( rule__FileImport__Group_1__0 )? )
            {
            // InternalBSharp.g:2127:1: ( ( rule__FileImport__Group_1__0 )? )
            // InternalBSharp.g:2128:2: ( rule__FileImport__Group_1__0 )?
            {
             before(grammarAccess.getFileImportAccess().getGroup_1()); 
            // InternalBSharp.g:2129:2: ( rule__FileImport__Group_1__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==33) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalBSharp.g:2129:3: rule__FileImport__Group_1__0
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
    // InternalBSharp.g:2138:1: rule__FileImport__Group_1__0 : rule__FileImport__Group_1__0__Impl rule__FileImport__Group_1__1 ;
    public final void rule__FileImport__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2142:1: ( rule__FileImport__Group_1__0__Impl rule__FileImport__Group_1__1 )
            // InternalBSharp.g:2143:2: rule__FileImport__Group_1__0__Impl rule__FileImport__Group_1__1
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
    // InternalBSharp.g:2150:1: rule__FileImport__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FileImport__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2154:1: ( ( '.' ) )
            // InternalBSharp.g:2155:1: ( '.' )
            {
            // InternalBSharp.g:2155:1: ( '.' )
            // InternalBSharp.g:2156:2: '.'
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
    // InternalBSharp.g:2165:1: rule__FileImport__Group_1__1 : rule__FileImport__Group_1__1__Impl ;
    public final void rule__FileImport__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2169:1: ( rule__FileImport__Group_1__1__Impl )
            // InternalBSharp.g:2170:2: rule__FileImport__Group_1__1__Impl
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
    // InternalBSharp.g:2176:1: rule__FileImport__Group_1__1__Impl : ( ( rule__FileImport__Alternatives_1_1 ) ) ;
    public final void rule__FileImport__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2180:1: ( ( ( rule__FileImport__Alternatives_1_1 ) ) )
            // InternalBSharp.g:2181:1: ( ( rule__FileImport__Alternatives_1_1 ) )
            {
            // InternalBSharp.g:2181:1: ( ( rule__FileImport__Alternatives_1_1 ) )
            // InternalBSharp.g:2182:2: ( rule__FileImport__Alternatives_1_1 )
            {
             before(grammarAccess.getFileImportAccess().getAlternatives_1_1()); 
            // InternalBSharp.g:2183:2: ( rule__FileImport__Alternatives_1_1 )
            // InternalBSharp.g:2183:3: rule__FileImport__Alternatives_1_1
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
    // InternalBSharp.g:2192:1: rule__LocalImport__Group__0 : rule__LocalImport__Group__0__Impl rule__LocalImport__Group__1 ;
    public final void rule__LocalImport__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2196:1: ( rule__LocalImport__Group__0__Impl rule__LocalImport__Group__1 )
            // InternalBSharp.g:2197:2: rule__LocalImport__Group__0__Impl rule__LocalImport__Group__1
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
    // InternalBSharp.g:2204:1: rule__LocalImport__Group__0__Impl : ( 'Import' ) ;
    public final void rule__LocalImport__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2208:1: ( ( 'Import' ) )
            // InternalBSharp.g:2209:1: ( 'Import' )
            {
            // InternalBSharp.g:2209:1: ( 'Import' )
            // InternalBSharp.g:2210:2: 'Import'
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
    // InternalBSharp.g:2219:1: rule__LocalImport__Group__1 : rule__LocalImport__Group__1__Impl ;
    public final void rule__LocalImport__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2223:1: ( rule__LocalImport__Group__1__Impl )
            // InternalBSharp.g:2224:2: rule__LocalImport__Group__1__Impl
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
    // InternalBSharp.g:2230:1: rule__LocalImport__Group__1__Impl : ( ( ( rule__LocalImport__FileImportsAssignment_1 ) ) ( ( rule__LocalImport__FileImportsAssignment_1 )* ) ) ;
    public final void rule__LocalImport__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2234:1: ( ( ( ( rule__LocalImport__FileImportsAssignment_1 ) ) ( ( rule__LocalImport__FileImportsAssignment_1 )* ) ) )
            // InternalBSharp.g:2235:1: ( ( ( rule__LocalImport__FileImportsAssignment_1 ) ) ( ( rule__LocalImport__FileImportsAssignment_1 )* ) )
            {
            // InternalBSharp.g:2235:1: ( ( ( rule__LocalImport__FileImportsAssignment_1 ) ) ( ( rule__LocalImport__FileImportsAssignment_1 )* ) )
            // InternalBSharp.g:2236:2: ( ( rule__LocalImport__FileImportsAssignment_1 ) ) ( ( rule__LocalImport__FileImportsAssignment_1 )* )
            {
            // InternalBSharp.g:2236:2: ( ( rule__LocalImport__FileImportsAssignment_1 ) )
            // InternalBSharp.g:2237:3: ( rule__LocalImport__FileImportsAssignment_1 )
            {
             before(grammarAccess.getLocalImportAccess().getFileImportsAssignment_1()); 
            // InternalBSharp.g:2238:3: ( rule__LocalImport__FileImportsAssignment_1 )
            // InternalBSharp.g:2238:4: rule__LocalImport__FileImportsAssignment_1
            {
            pushFollow(FOLLOW_13);
            rule__LocalImport__FileImportsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLocalImportAccess().getFileImportsAssignment_1()); 

            }

            // InternalBSharp.g:2241:2: ( ( rule__LocalImport__FileImportsAssignment_1 )* )
            // InternalBSharp.g:2242:3: ( rule__LocalImport__FileImportsAssignment_1 )*
            {
             before(grammarAccess.getLocalImportAccess().getFileImportsAssignment_1()); 
            // InternalBSharp.g:2243:3: ( rule__LocalImport__FileImportsAssignment_1 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_ID) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalBSharp.g:2243:4: rule__LocalImport__FileImportsAssignment_1
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__LocalImport__FileImportsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // InternalBSharp.g:2253:1: rule__Class__Group__0 : rule__Class__Group__0__Impl rule__Class__Group__1 ;
    public final void rule__Class__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2257:1: ( rule__Class__Group__0__Impl rule__Class__Group__1 )
            // InternalBSharp.g:2258:2: rule__Class__Group__0__Impl rule__Class__Group__1
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
    // InternalBSharp.g:2265:1: rule__Class__Group__0__Impl : ( 'Class' ) ;
    public final void rule__Class__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2269:1: ( ( 'Class' ) )
            // InternalBSharp.g:2270:1: ( 'Class' )
            {
            // InternalBSharp.g:2270:1: ( 'Class' )
            // InternalBSharp.g:2271:2: 'Class'
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
    // InternalBSharp.g:2280:1: rule__Class__Group__1 : rule__Class__Group__1__Impl rule__Class__Group__2 ;
    public final void rule__Class__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2284:1: ( rule__Class__Group__1__Impl rule__Class__Group__2 )
            // InternalBSharp.g:2285:2: rule__Class__Group__1__Impl rule__Class__Group__2
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
    // InternalBSharp.g:2292:1: rule__Class__Group__1__Impl : ( ( rule__Class__NameAssignment_1 ) ) ;
    public final void rule__Class__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2296:1: ( ( ( rule__Class__NameAssignment_1 ) ) )
            // InternalBSharp.g:2297:1: ( ( rule__Class__NameAssignment_1 ) )
            {
            // InternalBSharp.g:2297:1: ( ( rule__Class__NameAssignment_1 ) )
            // InternalBSharp.g:2298:2: ( rule__Class__NameAssignment_1 )
            {
             before(grammarAccess.getClassAccess().getNameAssignment_1()); 
            // InternalBSharp.g:2299:2: ( rule__Class__NameAssignment_1 )
            // InternalBSharp.g:2299:3: rule__Class__NameAssignment_1
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
    // InternalBSharp.g:2307:1: rule__Class__Group__2 : rule__Class__Group__2__Impl rule__Class__Group__3 ;
    public final void rule__Class__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2311:1: ( rule__Class__Group__2__Impl rule__Class__Group__3 )
            // InternalBSharp.g:2312:2: rule__Class__Group__2__Impl rule__Class__Group__3
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
    // InternalBSharp.g:2319:1: rule__Class__Group__2__Impl : ( ( rule__Class__ContextAssignment_2 )? ) ;
    public final void rule__Class__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2323:1: ( ( ( rule__Class__ContextAssignment_2 )? ) )
            // InternalBSharp.g:2324:1: ( ( rule__Class__ContextAssignment_2 )? )
            {
            // InternalBSharp.g:2324:1: ( ( rule__Class__ContextAssignment_2 )? )
            // InternalBSharp.g:2325:2: ( rule__Class__ContextAssignment_2 )?
            {
             before(grammarAccess.getClassAccess().getContextAssignment_2()); 
            // InternalBSharp.g:2326:2: ( rule__Class__ContextAssignment_2 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==38) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalBSharp.g:2326:3: rule__Class__ContextAssignment_2
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
    // InternalBSharp.g:2334:1: rule__Class__Group__3 : rule__Class__Group__3__Impl rule__Class__Group__4 ;
    public final void rule__Class__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2338:1: ( rule__Class__Group__3__Impl rule__Class__Group__4 )
            // InternalBSharp.g:2339:2: rule__Class__Group__3__Impl rule__Class__Group__4
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
    // InternalBSharp.g:2346:1: rule__Class__Group__3__Impl : ( ( rule__Class__SupertypesAssignment_3 )? ) ;
    public final void rule__Class__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2350:1: ( ( ( rule__Class__SupertypesAssignment_3 )? ) )
            // InternalBSharp.g:2351:1: ( ( rule__Class__SupertypesAssignment_3 )? )
            {
            // InternalBSharp.g:2351:1: ( ( rule__Class__SupertypesAssignment_3 )? )
            // InternalBSharp.g:2352:2: ( rule__Class__SupertypesAssignment_3 )?
            {
             before(grammarAccess.getClassAccess().getSupertypesAssignment_3()); 
            // InternalBSharp.g:2353:2: ( rule__Class__SupertypesAssignment_3 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==32) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalBSharp.g:2353:3: rule__Class__SupertypesAssignment_3
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
    // InternalBSharp.g:2361:1: rule__Class__Group__4 : rule__Class__Group__4__Impl rule__Class__Group__5 ;
    public final void rule__Class__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2365:1: ( rule__Class__Group__4__Impl rule__Class__Group__5 )
            // InternalBSharp.g:2366:2: rule__Class__Group__4__Impl rule__Class__Group__5
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
    // InternalBSharp.g:2373:1: rule__Class__Group__4__Impl : ( ( rule__Class__VarListAssignment_4 )? ) ;
    public final void rule__Class__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2377:1: ( ( ( rule__Class__VarListAssignment_4 )? ) )
            // InternalBSharp.g:2378:1: ( ( rule__Class__VarListAssignment_4 )? )
            {
            // InternalBSharp.g:2378:1: ( ( rule__Class__VarListAssignment_4 )? )
            // InternalBSharp.g:2379:2: ( rule__Class__VarListAssignment_4 )?
            {
             before(grammarAccess.getClassAccess().getVarListAssignment_4()); 
            // InternalBSharp.g:2380:2: ( rule__Class__VarListAssignment_4 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==41) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalBSharp.g:2380:3: rule__Class__VarListAssignment_4
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
    // InternalBSharp.g:2388:1: rule__Class__Group__5 : rule__Class__Group__5__Impl rule__Class__Group__6 ;
    public final void rule__Class__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2392:1: ( rule__Class__Group__5__Impl rule__Class__Group__6 )
            // InternalBSharp.g:2393:2: rule__Class__Group__5__Impl rule__Class__Group__6
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
    // InternalBSharp.g:2400:1: rule__Class__Group__5__Impl : ( ( rule__Class__WhereAssignment_5 )? ) ;
    public final void rule__Class__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2404:1: ( ( ( rule__Class__WhereAssignment_5 )? ) )
            // InternalBSharp.g:2405:1: ( ( rule__Class__WhereAssignment_5 )? )
            {
            // InternalBSharp.g:2405:1: ( ( rule__Class__WhereAssignment_5 )? )
            // InternalBSharp.g:2406:2: ( rule__Class__WhereAssignment_5 )?
            {
             before(grammarAccess.getClassAccess().getWhereAssignment_5()); 
            // InternalBSharp.g:2407:2: ( rule__Class__WhereAssignment_5 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==43) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalBSharp.g:2407:3: rule__Class__WhereAssignment_5
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
    // InternalBSharp.g:2415:1: rule__Class__Group__6 : rule__Class__Group__6__Impl rule__Class__Group__7 ;
    public final void rule__Class__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2419:1: ( rule__Class__Group__6__Impl rule__Class__Group__7 )
            // InternalBSharp.g:2420:2: rule__Class__Group__6__Impl rule__Class__Group__7
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
    // InternalBSharp.g:2427:1: rule__Class__Group__6__Impl : ( ( ';' )? ) ;
    public final void rule__Class__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2431:1: ( ( ( ';' )? ) )
            // InternalBSharp.g:2432:1: ( ( ';' )? )
            {
            // InternalBSharp.g:2432:1: ( ( ';' )? )
            // InternalBSharp.g:2433:2: ( ';' )?
            {
             before(grammarAccess.getClassAccess().getSemicolonKeyword_6()); 
            // InternalBSharp.g:2434:2: ( ';' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==37) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalBSharp.g:2434:3: ';'
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
    // InternalBSharp.g:2442:1: rule__Class__Group__7 : rule__Class__Group__7__Impl ;
    public final void rule__Class__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2446:1: ( rule__Class__Group__7__Impl )
            // InternalBSharp.g:2447:2: rule__Class__Group__7__Impl
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
    // InternalBSharp.g:2453:1: rule__Class__Group__7__Impl : ( ( rule__Class__BlockAssignment_7 ) ) ;
    public final void rule__Class__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2457:1: ( ( ( rule__Class__BlockAssignment_7 ) ) )
            // InternalBSharp.g:2458:1: ( ( rule__Class__BlockAssignment_7 ) )
            {
            // InternalBSharp.g:2458:1: ( ( rule__Class__BlockAssignment_7 ) )
            // InternalBSharp.g:2459:2: ( rule__Class__BlockAssignment_7 )
            {
             before(grammarAccess.getClassAccess().getBlockAssignment_7()); 
            // InternalBSharp.g:2460:2: ( rule__Class__BlockAssignment_7 )
            // InternalBSharp.g:2460:3: rule__Class__BlockAssignment_7
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
    // InternalBSharp.g:2469:1: rule__PolyContext__Group__0 : rule__PolyContext__Group__0__Impl rule__PolyContext__Group__1 ;
    public final void rule__PolyContext__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2473:1: ( rule__PolyContext__Group__0__Impl rule__PolyContext__Group__1 )
            // InternalBSharp.g:2474:2: rule__PolyContext__Group__0__Impl rule__PolyContext__Group__1
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
    // InternalBSharp.g:2481:1: rule__PolyContext__Group__0__Impl : ( '<' ) ;
    public final void rule__PolyContext__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2485:1: ( ( '<' ) )
            // InternalBSharp.g:2486:1: ( '<' )
            {
            // InternalBSharp.g:2486:1: ( '<' )
            // InternalBSharp.g:2487:2: '<'
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
    // InternalBSharp.g:2496:1: rule__PolyContext__Group__1 : rule__PolyContext__Group__1__Impl rule__PolyContext__Group__2 ;
    public final void rule__PolyContext__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2500:1: ( rule__PolyContext__Group__1__Impl rule__PolyContext__Group__2 )
            // InternalBSharp.g:2501:2: rule__PolyContext__Group__1__Impl rule__PolyContext__Group__2
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
    // InternalBSharp.g:2508:1: rule__PolyContext__Group__1__Impl : ( ( ( rule__PolyContext__PolyTypesAssignment_1 ) ) ( ( rule__PolyContext__PolyTypesAssignment_1 )* ) ) ;
    public final void rule__PolyContext__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2512:1: ( ( ( ( rule__PolyContext__PolyTypesAssignment_1 ) ) ( ( rule__PolyContext__PolyTypesAssignment_1 )* ) ) )
            // InternalBSharp.g:2513:1: ( ( ( rule__PolyContext__PolyTypesAssignment_1 ) ) ( ( rule__PolyContext__PolyTypesAssignment_1 )* ) )
            {
            // InternalBSharp.g:2513:1: ( ( ( rule__PolyContext__PolyTypesAssignment_1 ) ) ( ( rule__PolyContext__PolyTypesAssignment_1 )* ) )
            // InternalBSharp.g:2514:2: ( ( rule__PolyContext__PolyTypesAssignment_1 ) ) ( ( rule__PolyContext__PolyTypesAssignment_1 )* )
            {
            // InternalBSharp.g:2514:2: ( ( rule__PolyContext__PolyTypesAssignment_1 ) )
            // InternalBSharp.g:2515:3: ( rule__PolyContext__PolyTypesAssignment_1 )
            {
             before(grammarAccess.getPolyContextAccess().getPolyTypesAssignment_1()); 
            // InternalBSharp.g:2516:3: ( rule__PolyContext__PolyTypesAssignment_1 )
            // InternalBSharp.g:2516:4: rule__PolyContext__PolyTypesAssignment_1
            {
            pushFollow(FOLLOW_13);
            rule__PolyContext__PolyTypesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPolyContextAccess().getPolyTypesAssignment_1()); 

            }

            // InternalBSharp.g:2519:2: ( ( rule__PolyContext__PolyTypesAssignment_1 )* )
            // InternalBSharp.g:2520:3: ( rule__PolyContext__PolyTypesAssignment_1 )*
            {
             before(grammarAccess.getPolyContextAccess().getPolyTypesAssignment_1()); 
            // InternalBSharp.g:2521:3: ( rule__PolyContext__PolyTypesAssignment_1 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_ID) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalBSharp.g:2521:4: rule__PolyContext__PolyTypesAssignment_1
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__PolyContext__PolyTypesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
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
    // InternalBSharp.g:2530:1: rule__PolyContext__Group__2 : rule__PolyContext__Group__2__Impl ;
    public final void rule__PolyContext__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2534:1: ( rule__PolyContext__Group__2__Impl )
            // InternalBSharp.g:2535:2: rule__PolyContext__Group__2__Impl
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
    // InternalBSharp.g:2541:1: rule__PolyContext__Group__2__Impl : ( '>' ) ;
    public final void rule__PolyContext__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2545:1: ( ( '>' ) )
            // InternalBSharp.g:2546:1: ( '>' )
            {
            // InternalBSharp.g:2546:1: ( '>' )
            // InternalBSharp.g:2547:2: '>'
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
    // InternalBSharp.g:2557:1: rule__PolyType__Group__0 : rule__PolyType__Group__0__Impl rule__PolyType__Group__1 ;
    public final void rule__PolyType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2561:1: ( rule__PolyType__Group__0__Impl rule__PolyType__Group__1 )
            // InternalBSharp.g:2562:2: rule__PolyType__Group__0__Impl rule__PolyType__Group__1
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
    // InternalBSharp.g:2569:1: rule__PolyType__Group__0__Impl : ( ( rule__PolyType__NameAssignment_0 ) ) ;
    public final void rule__PolyType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2573:1: ( ( ( rule__PolyType__NameAssignment_0 ) ) )
            // InternalBSharp.g:2574:1: ( ( rule__PolyType__NameAssignment_0 ) )
            {
            // InternalBSharp.g:2574:1: ( ( rule__PolyType__NameAssignment_0 ) )
            // InternalBSharp.g:2575:2: ( rule__PolyType__NameAssignment_0 )
            {
             before(grammarAccess.getPolyTypeAccess().getNameAssignment_0()); 
            // InternalBSharp.g:2576:2: ( rule__PolyType__NameAssignment_0 )
            // InternalBSharp.g:2576:3: rule__PolyType__NameAssignment_0
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
    // InternalBSharp.g:2584:1: rule__PolyType__Group__1 : rule__PolyType__Group__1__Impl ;
    public final void rule__PolyType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2588:1: ( rule__PolyType__Group__1__Impl )
            // InternalBSharp.g:2589:2: rule__PolyType__Group__1__Impl
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
    // InternalBSharp.g:2595:1: rule__PolyType__Group__1__Impl : ( ( rule__PolyType__Group_1__0 )? ) ;
    public final void rule__PolyType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2599:1: ( ( ( rule__PolyType__Group_1__0 )? ) )
            // InternalBSharp.g:2600:1: ( ( rule__PolyType__Group_1__0 )? )
            {
            // InternalBSharp.g:2600:1: ( ( rule__PolyType__Group_1__0 )? )
            // InternalBSharp.g:2601:2: ( rule__PolyType__Group_1__0 )?
            {
             before(grammarAccess.getPolyTypeAccess().getGroup_1()); 
            // InternalBSharp.g:2602:2: ( rule__PolyType__Group_1__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==32) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalBSharp.g:2602:3: rule__PolyType__Group_1__0
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
    // InternalBSharp.g:2611:1: rule__PolyType__Group_1__0 : rule__PolyType__Group_1__0__Impl rule__PolyType__Group_1__1 ;
    public final void rule__PolyType__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2615:1: ( rule__PolyType__Group_1__0__Impl rule__PolyType__Group_1__1 )
            // InternalBSharp.g:2616:2: rule__PolyType__Group_1__0__Impl rule__PolyType__Group_1__1
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
    // InternalBSharp.g:2623:1: rule__PolyType__Group_1__0__Impl : ( ':' ) ;
    public final void rule__PolyType__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2627:1: ( ( ':' ) )
            // InternalBSharp.g:2628:1: ( ':' )
            {
            // InternalBSharp.g:2628:1: ( ':' )
            // InternalBSharp.g:2629:2: ':'
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
    // InternalBSharp.g:2638:1: rule__PolyType__Group_1__1 : rule__PolyType__Group_1__1__Impl rule__PolyType__Group_1__2 ;
    public final void rule__PolyType__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2642:1: ( rule__PolyType__Group_1__1__Impl rule__PolyType__Group_1__2 )
            // InternalBSharp.g:2643:2: rule__PolyType__Group_1__1__Impl rule__PolyType__Group_1__2
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
    // InternalBSharp.g:2650:1: rule__PolyType__Group_1__1__Impl : ( ( rule__PolyType__SuperTypesAssignment_1_1 ) ) ;
    public final void rule__PolyType__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2654:1: ( ( ( rule__PolyType__SuperTypesAssignment_1_1 ) ) )
            // InternalBSharp.g:2655:1: ( ( rule__PolyType__SuperTypesAssignment_1_1 ) )
            {
            // InternalBSharp.g:2655:1: ( ( rule__PolyType__SuperTypesAssignment_1_1 ) )
            // InternalBSharp.g:2656:2: ( rule__PolyType__SuperTypesAssignment_1_1 )
            {
             before(grammarAccess.getPolyTypeAccess().getSuperTypesAssignment_1_1()); 
            // InternalBSharp.g:2657:2: ( rule__PolyType__SuperTypesAssignment_1_1 )
            // InternalBSharp.g:2657:3: rule__PolyType__SuperTypesAssignment_1_1
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
    // InternalBSharp.g:2665:1: rule__PolyType__Group_1__2 : rule__PolyType__Group_1__2__Impl ;
    public final void rule__PolyType__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2669:1: ( rule__PolyType__Group_1__2__Impl )
            // InternalBSharp.g:2670:2: rule__PolyType__Group_1__2__Impl
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
    // InternalBSharp.g:2676:1: rule__PolyType__Group_1__2__Impl : ( ( rule__PolyType__Group_1_2__0 )* ) ;
    public final void rule__PolyType__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2680:1: ( ( ( rule__PolyType__Group_1_2__0 )* ) )
            // InternalBSharp.g:2681:1: ( ( rule__PolyType__Group_1_2__0 )* )
            {
            // InternalBSharp.g:2681:1: ( ( rule__PolyType__Group_1_2__0 )* )
            // InternalBSharp.g:2682:2: ( rule__PolyType__Group_1_2__0 )*
            {
             before(grammarAccess.getPolyTypeAccess().getGroup_1_2()); 
            // InternalBSharp.g:2683:2: ( rule__PolyType__Group_1_2__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==40) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalBSharp.g:2683:3: rule__PolyType__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__PolyType__Group_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
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
    // InternalBSharp.g:2692:1: rule__PolyType__Group_1_2__0 : rule__PolyType__Group_1_2__0__Impl rule__PolyType__Group_1_2__1 ;
    public final void rule__PolyType__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2696:1: ( rule__PolyType__Group_1_2__0__Impl rule__PolyType__Group_1_2__1 )
            // InternalBSharp.g:2697:2: rule__PolyType__Group_1_2__0__Impl rule__PolyType__Group_1_2__1
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
    // InternalBSharp.g:2704:1: rule__PolyType__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__PolyType__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2708:1: ( ( ',' ) )
            // InternalBSharp.g:2709:1: ( ',' )
            {
            // InternalBSharp.g:2709:1: ( ',' )
            // InternalBSharp.g:2710:2: ','
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
    // InternalBSharp.g:2719:1: rule__PolyType__Group_1_2__1 : rule__PolyType__Group_1_2__1__Impl ;
    public final void rule__PolyType__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2723:1: ( rule__PolyType__Group_1_2__1__Impl )
            // InternalBSharp.g:2724:2: rule__PolyType__Group_1_2__1__Impl
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
    // InternalBSharp.g:2730:1: rule__PolyType__Group_1_2__1__Impl : ( ( rule__PolyType__SuperTypesAssignment_1_2_1 ) ) ;
    public final void rule__PolyType__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2734:1: ( ( ( rule__PolyType__SuperTypesAssignment_1_2_1 ) ) )
            // InternalBSharp.g:2735:1: ( ( rule__PolyType__SuperTypesAssignment_1_2_1 ) )
            {
            // InternalBSharp.g:2735:1: ( ( rule__PolyType__SuperTypesAssignment_1_2_1 ) )
            // InternalBSharp.g:2736:2: ( rule__PolyType__SuperTypesAssignment_1_2_1 )
            {
             before(grammarAccess.getPolyTypeAccess().getSuperTypesAssignment_1_2_1()); 
            // InternalBSharp.g:2737:2: ( rule__PolyType__SuperTypesAssignment_1_2_1 )
            // InternalBSharp.g:2737:3: rule__PolyType__SuperTypesAssignment_1_2_1
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
    // InternalBSharp.g:2746:1: rule__SuperTypeList__Group__0 : rule__SuperTypeList__Group__0__Impl rule__SuperTypeList__Group__1 ;
    public final void rule__SuperTypeList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2750:1: ( rule__SuperTypeList__Group__0__Impl rule__SuperTypeList__Group__1 )
            // InternalBSharp.g:2751:2: rule__SuperTypeList__Group__0__Impl rule__SuperTypeList__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalBSharp.g:2758:1: rule__SuperTypeList__Group__0__Impl : ( ':' ) ;
    public final void rule__SuperTypeList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2762:1: ( ( ':' ) )
            // InternalBSharp.g:2763:1: ( ':' )
            {
            // InternalBSharp.g:2763:1: ( ':' )
            // InternalBSharp.g:2764:2: ':'
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
    // InternalBSharp.g:2773:1: rule__SuperTypeList__Group__1 : rule__SuperTypeList__Group__1__Impl rule__SuperTypeList__Group__2 ;
    public final void rule__SuperTypeList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2777:1: ( rule__SuperTypeList__Group__1__Impl rule__SuperTypeList__Group__2 )
            // InternalBSharp.g:2778:2: rule__SuperTypeList__Group__1__Impl rule__SuperTypeList__Group__2
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
    // InternalBSharp.g:2785:1: rule__SuperTypeList__Group__1__Impl : ( ( rule__SuperTypeList__SuperTypesAssignment_1 ) ) ;
    public final void rule__SuperTypeList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2789:1: ( ( ( rule__SuperTypeList__SuperTypesAssignment_1 ) ) )
            // InternalBSharp.g:2790:1: ( ( rule__SuperTypeList__SuperTypesAssignment_1 ) )
            {
            // InternalBSharp.g:2790:1: ( ( rule__SuperTypeList__SuperTypesAssignment_1 ) )
            // InternalBSharp.g:2791:2: ( rule__SuperTypeList__SuperTypesAssignment_1 )
            {
             before(grammarAccess.getSuperTypeListAccess().getSuperTypesAssignment_1()); 
            // InternalBSharp.g:2792:2: ( rule__SuperTypeList__SuperTypesAssignment_1 )
            // InternalBSharp.g:2792:3: rule__SuperTypeList__SuperTypesAssignment_1
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
    // InternalBSharp.g:2800:1: rule__SuperTypeList__Group__2 : rule__SuperTypeList__Group__2__Impl ;
    public final void rule__SuperTypeList__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2804:1: ( rule__SuperTypeList__Group__2__Impl )
            // InternalBSharp.g:2805:2: rule__SuperTypeList__Group__2__Impl
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
    // InternalBSharp.g:2811:1: rule__SuperTypeList__Group__2__Impl : ( ( rule__SuperTypeList__Group_2__0 )* ) ;
    public final void rule__SuperTypeList__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2815:1: ( ( ( rule__SuperTypeList__Group_2__0 )* ) )
            // InternalBSharp.g:2816:1: ( ( rule__SuperTypeList__Group_2__0 )* )
            {
            // InternalBSharp.g:2816:1: ( ( rule__SuperTypeList__Group_2__0 )* )
            // InternalBSharp.g:2817:2: ( rule__SuperTypeList__Group_2__0 )*
            {
             before(grammarAccess.getSuperTypeListAccess().getGroup_2()); 
            // InternalBSharp.g:2818:2: ( rule__SuperTypeList__Group_2__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==40) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalBSharp.g:2818:3: rule__SuperTypeList__Group_2__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__SuperTypeList__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
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
    // InternalBSharp.g:2827:1: rule__SuperTypeList__Group_2__0 : rule__SuperTypeList__Group_2__0__Impl rule__SuperTypeList__Group_2__1 ;
    public final void rule__SuperTypeList__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2831:1: ( rule__SuperTypeList__Group_2__0__Impl rule__SuperTypeList__Group_2__1 )
            // InternalBSharp.g:2832:2: rule__SuperTypeList__Group_2__0__Impl rule__SuperTypeList__Group_2__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalBSharp.g:2839:1: rule__SuperTypeList__Group_2__0__Impl : ( ',' ) ;
    public final void rule__SuperTypeList__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2843:1: ( ( ',' ) )
            // InternalBSharp.g:2844:1: ( ',' )
            {
            // InternalBSharp.g:2844:1: ( ',' )
            // InternalBSharp.g:2845:2: ','
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
    // InternalBSharp.g:2854:1: rule__SuperTypeList__Group_2__1 : rule__SuperTypeList__Group_2__1__Impl ;
    public final void rule__SuperTypeList__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2858:1: ( rule__SuperTypeList__Group_2__1__Impl )
            // InternalBSharp.g:2859:2: rule__SuperTypeList__Group_2__1__Impl
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
    // InternalBSharp.g:2865:1: rule__SuperTypeList__Group_2__1__Impl : ( ( rule__SuperTypeList__SuperTypesAssignment_2_1 ) ) ;
    public final void rule__SuperTypeList__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2869:1: ( ( ( rule__SuperTypeList__SuperTypesAssignment_2_1 ) ) )
            // InternalBSharp.g:2870:1: ( ( rule__SuperTypeList__SuperTypesAssignment_2_1 ) )
            {
            // InternalBSharp.g:2870:1: ( ( rule__SuperTypeList__SuperTypesAssignment_2_1 ) )
            // InternalBSharp.g:2871:2: ( rule__SuperTypeList__SuperTypesAssignment_2_1 )
            {
             before(grammarAccess.getSuperTypeListAccess().getSuperTypesAssignment_2_1()); 
            // InternalBSharp.g:2872:2: ( rule__SuperTypeList__SuperTypesAssignment_2_1 )
            // InternalBSharp.g:2872:3: rule__SuperTypeList__SuperTypesAssignment_2_1
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
    // InternalBSharp.g:2881:1: rule__ConstructedType__Group__0 : rule__ConstructedType__Group__0__Impl rule__ConstructedType__Group__1 ;
    public final void rule__ConstructedType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2885:1: ( rule__ConstructedType__Group__0__Impl rule__ConstructedType__Group__1 )
            // InternalBSharp.g:2886:2: rule__ConstructedType__Group__0__Impl rule__ConstructedType__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalBSharp.g:2893:1: rule__ConstructedType__Group__0__Impl : ( ( rule__ConstructedType__TypeAssignment_0 ) ) ;
    public final void rule__ConstructedType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2897:1: ( ( ( rule__ConstructedType__TypeAssignment_0 ) ) )
            // InternalBSharp.g:2898:1: ( ( rule__ConstructedType__TypeAssignment_0 ) )
            {
            // InternalBSharp.g:2898:1: ( ( rule__ConstructedType__TypeAssignment_0 ) )
            // InternalBSharp.g:2899:2: ( rule__ConstructedType__TypeAssignment_0 )
            {
             before(grammarAccess.getConstructedTypeAccess().getTypeAssignment_0()); 
            // InternalBSharp.g:2900:2: ( rule__ConstructedType__TypeAssignment_0 )
            // InternalBSharp.g:2900:3: rule__ConstructedType__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ConstructedType__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getConstructedTypeAccess().getTypeAssignment_0()); 

            }


            }

        }
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
    // InternalBSharp.g:2908:1: rule__ConstructedType__Group__1 : rule__ConstructedType__Group__1__Impl ;
    public final void rule__ConstructedType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2912:1: ( rule__ConstructedType__Group__1__Impl )
            // InternalBSharp.g:2913:2: rule__ConstructedType__Group__1__Impl
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
    // InternalBSharp.g:2919:1: rule__ConstructedType__Group__1__Impl : ( ( rule__ConstructedType__Group_1__0 )? ) ;
    public final void rule__ConstructedType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2923:1: ( ( ( rule__ConstructedType__Group_1__0 )? ) )
            // InternalBSharp.g:2924:1: ( ( rule__ConstructedType__Group_1__0 )? )
            {
            // InternalBSharp.g:2924:1: ( ( rule__ConstructedType__Group_1__0 )? )
            // InternalBSharp.g:2925:2: ( rule__ConstructedType__Group_1__0 )?
            {
             before(grammarAccess.getConstructedTypeAccess().getGroup_1()); 
            // InternalBSharp.g:2926:2: ( rule__ConstructedType__Group_1__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( ((LA32_0>=13 && LA32_0<=22)) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalBSharp.g:2926:3: rule__ConstructedType__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ConstructedType__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

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
    // InternalBSharp.g:2935:1: rule__ConstructedType__Group_1__0 : rule__ConstructedType__Group_1__0__Impl rule__ConstructedType__Group_1__1 ;
    public final void rule__ConstructedType__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2939:1: ( rule__ConstructedType__Group_1__0__Impl rule__ConstructedType__Group_1__1 )
            // InternalBSharp.g:2940:2: rule__ConstructedType__Group_1__0__Impl rule__ConstructedType__Group_1__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalBSharp.g:2947:1: rule__ConstructedType__Group_1__0__Impl : ( ( rule__ConstructedType__ConstructorsAssignment_1_0 ) ) ;
    public final void rule__ConstructedType__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2951:1: ( ( ( rule__ConstructedType__ConstructorsAssignment_1_0 ) ) )
            // InternalBSharp.g:2952:1: ( ( rule__ConstructedType__ConstructorsAssignment_1_0 ) )
            {
            // InternalBSharp.g:2952:1: ( ( rule__ConstructedType__ConstructorsAssignment_1_0 ) )
            // InternalBSharp.g:2953:2: ( rule__ConstructedType__ConstructorsAssignment_1_0 )
            {
             before(grammarAccess.getConstructedTypeAccess().getConstructorsAssignment_1_0()); 
            // InternalBSharp.g:2954:2: ( rule__ConstructedType__ConstructorsAssignment_1_0 )
            // InternalBSharp.g:2954:3: rule__ConstructedType__ConstructorsAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__ConstructedType__ConstructorsAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getConstructedTypeAccess().getConstructorsAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstructedType__Group_1__0__Impl"


    // $ANTLR start "rule__ConstructedType__Group_1__1"
    // InternalBSharp.g:2962:1: rule__ConstructedType__Group_1__1 : rule__ConstructedType__Group_1__1__Impl ;
    public final void rule__ConstructedType__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2966:1: ( rule__ConstructedType__Group_1__1__Impl )
            // InternalBSharp.g:2967:2: rule__ConstructedType__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConstructedType__Group_1__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalBSharp.g:2973:1: rule__ConstructedType__Group_1__1__Impl : ( ( rule__ConstructedType__TypeAssignment_1_1 ) ) ;
    public final void rule__ConstructedType__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2977:1: ( ( ( rule__ConstructedType__TypeAssignment_1_1 ) ) )
            // InternalBSharp.g:2978:1: ( ( rule__ConstructedType__TypeAssignment_1_1 ) )
            {
            // InternalBSharp.g:2978:1: ( ( rule__ConstructedType__TypeAssignment_1_1 ) )
            // InternalBSharp.g:2979:2: ( rule__ConstructedType__TypeAssignment_1_1 )
            {
             before(grammarAccess.getConstructedTypeAccess().getTypeAssignment_1_1()); 
            // InternalBSharp.g:2980:2: ( rule__ConstructedType__TypeAssignment_1_1 )
            // InternalBSharp.g:2980:3: rule__ConstructedType__TypeAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ConstructedType__TypeAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getConstructedTypeAccess().getTypeAssignment_1_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__TypeConstructor__Group__0"
    // InternalBSharp.g:2989:1: rule__TypeConstructor__Group__0 : rule__TypeConstructor__Group__0__Impl rule__TypeConstructor__Group__1 ;
    public final void rule__TypeConstructor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2993:1: ( rule__TypeConstructor__Group__0__Impl rule__TypeConstructor__Group__1 )
            // InternalBSharp.g:2994:2: rule__TypeConstructor__Group__0__Impl rule__TypeConstructor__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalBSharp.g:3001:1: rule__TypeConstructor__Group__0__Impl : ( ( rule__TypeConstructor__TypeNameAssignment_0 ) ) ;
    public final void rule__TypeConstructor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3005:1: ( ( ( rule__TypeConstructor__TypeNameAssignment_0 ) ) )
            // InternalBSharp.g:3006:1: ( ( rule__TypeConstructor__TypeNameAssignment_0 ) )
            {
            // InternalBSharp.g:3006:1: ( ( rule__TypeConstructor__TypeNameAssignment_0 ) )
            // InternalBSharp.g:3007:2: ( rule__TypeConstructor__TypeNameAssignment_0 )
            {
             before(grammarAccess.getTypeConstructorAccess().getTypeNameAssignment_0()); 
            // InternalBSharp.g:3008:2: ( rule__TypeConstructor__TypeNameAssignment_0 )
            // InternalBSharp.g:3008:3: rule__TypeConstructor__TypeNameAssignment_0
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
    // InternalBSharp.g:3016:1: rule__TypeConstructor__Group__1 : rule__TypeConstructor__Group__1__Impl ;
    public final void rule__TypeConstructor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3020:1: ( rule__TypeConstructor__Group__1__Impl )
            // InternalBSharp.g:3021:2: rule__TypeConstructor__Group__1__Impl
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
    // InternalBSharp.g:3027:1: rule__TypeConstructor__Group__1__Impl : ( ( rule__TypeConstructor__ContextAssignment_1 )? ) ;
    public final void rule__TypeConstructor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3031:1: ( ( ( rule__TypeConstructor__ContextAssignment_1 )? ) )
            // InternalBSharp.g:3032:1: ( ( rule__TypeConstructor__ContextAssignment_1 )? )
            {
            // InternalBSharp.g:3032:1: ( ( rule__TypeConstructor__ContextAssignment_1 )? )
            // InternalBSharp.g:3033:2: ( rule__TypeConstructor__ContextAssignment_1 )?
            {
             before(grammarAccess.getTypeConstructorAccess().getContextAssignment_1()); 
            // InternalBSharp.g:3034:2: ( rule__TypeConstructor__ContextAssignment_1 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==38) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalBSharp.g:3034:3: rule__TypeConstructor__ContextAssignment_1
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


    // $ANTLR start "rule__TypeDeclContext__Group__0"
    // InternalBSharp.g:3043:1: rule__TypeDeclContext__Group__0 : rule__TypeDeclContext__Group__0__Impl rule__TypeDeclContext__Group__1 ;
    public final void rule__TypeDeclContext__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3047:1: ( rule__TypeDeclContext__Group__0__Impl rule__TypeDeclContext__Group__1 )
            // InternalBSharp.g:3048:2: rule__TypeDeclContext__Group__0__Impl rule__TypeDeclContext__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalBSharp.g:3055:1: rule__TypeDeclContext__Group__0__Impl : ( '<' ) ;
    public final void rule__TypeDeclContext__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3059:1: ( ( '<' ) )
            // InternalBSharp.g:3060:1: ( '<' )
            {
            // InternalBSharp.g:3060:1: ( '<' )
            // InternalBSharp.g:3061:2: '<'
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
    // InternalBSharp.g:3070:1: rule__TypeDeclContext__Group__1 : rule__TypeDeclContext__Group__1__Impl rule__TypeDeclContext__Group__2 ;
    public final void rule__TypeDeclContext__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3074:1: ( rule__TypeDeclContext__Group__1__Impl rule__TypeDeclContext__Group__2 )
            // InternalBSharp.g:3075:2: rule__TypeDeclContext__Group__1__Impl rule__TypeDeclContext__Group__2
            {
            pushFollow(FOLLOW_21);
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
    // InternalBSharp.g:3082:1: rule__TypeDeclContext__Group__1__Impl : ( ( rule__TypeDeclContext__TypeNameAssignment_1 ) ) ;
    public final void rule__TypeDeclContext__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3086:1: ( ( ( rule__TypeDeclContext__TypeNameAssignment_1 ) ) )
            // InternalBSharp.g:3087:1: ( ( rule__TypeDeclContext__TypeNameAssignment_1 ) )
            {
            // InternalBSharp.g:3087:1: ( ( rule__TypeDeclContext__TypeNameAssignment_1 ) )
            // InternalBSharp.g:3088:2: ( rule__TypeDeclContext__TypeNameAssignment_1 )
            {
             before(grammarAccess.getTypeDeclContextAccess().getTypeNameAssignment_1()); 
            // InternalBSharp.g:3089:2: ( rule__TypeDeclContext__TypeNameAssignment_1 )
            // InternalBSharp.g:3089:3: rule__TypeDeclContext__TypeNameAssignment_1
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
    // InternalBSharp.g:3097:1: rule__TypeDeclContext__Group__2 : rule__TypeDeclContext__Group__2__Impl rule__TypeDeclContext__Group__3 ;
    public final void rule__TypeDeclContext__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3101:1: ( rule__TypeDeclContext__Group__2__Impl rule__TypeDeclContext__Group__3 )
            // InternalBSharp.g:3102:2: rule__TypeDeclContext__Group__2__Impl rule__TypeDeclContext__Group__3
            {
            pushFollow(FOLLOW_21);
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
    // InternalBSharp.g:3109:1: rule__TypeDeclContext__Group__2__Impl : ( ( rule__TypeDeclContext__Group_2__0 )* ) ;
    public final void rule__TypeDeclContext__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3113:1: ( ( ( rule__TypeDeclContext__Group_2__0 )* ) )
            // InternalBSharp.g:3114:1: ( ( rule__TypeDeclContext__Group_2__0 )* )
            {
            // InternalBSharp.g:3114:1: ( ( rule__TypeDeclContext__Group_2__0 )* )
            // InternalBSharp.g:3115:2: ( rule__TypeDeclContext__Group_2__0 )*
            {
             before(grammarAccess.getTypeDeclContextAccess().getGroup_2()); 
            // InternalBSharp.g:3116:2: ( rule__TypeDeclContext__Group_2__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==40) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalBSharp.g:3116:3: rule__TypeDeclContext__Group_2__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__TypeDeclContext__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
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
    // InternalBSharp.g:3124:1: rule__TypeDeclContext__Group__3 : rule__TypeDeclContext__Group__3__Impl ;
    public final void rule__TypeDeclContext__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3128:1: ( rule__TypeDeclContext__Group__3__Impl )
            // InternalBSharp.g:3129:2: rule__TypeDeclContext__Group__3__Impl
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
    // InternalBSharp.g:3135:1: rule__TypeDeclContext__Group__3__Impl : ( '>' ) ;
    public final void rule__TypeDeclContext__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3139:1: ( ( '>' ) )
            // InternalBSharp.g:3140:1: ( '>' )
            {
            // InternalBSharp.g:3140:1: ( '>' )
            // InternalBSharp.g:3141:2: '>'
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
    // InternalBSharp.g:3151:1: rule__TypeDeclContext__Group_2__0 : rule__TypeDeclContext__Group_2__0__Impl rule__TypeDeclContext__Group_2__1 ;
    public final void rule__TypeDeclContext__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3155:1: ( rule__TypeDeclContext__Group_2__0__Impl rule__TypeDeclContext__Group_2__1 )
            // InternalBSharp.g:3156:2: rule__TypeDeclContext__Group_2__0__Impl rule__TypeDeclContext__Group_2__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalBSharp.g:3163:1: rule__TypeDeclContext__Group_2__0__Impl : ( ',' ) ;
    public final void rule__TypeDeclContext__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3167:1: ( ( ',' ) )
            // InternalBSharp.g:3168:1: ( ',' )
            {
            // InternalBSharp.g:3168:1: ( ',' )
            // InternalBSharp.g:3169:2: ','
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
    // InternalBSharp.g:3178:1: rule__TypeDeclContext__Group_2__1 : rule__TypeDeclContext__Group_2__1__Impl ;
    public final void rule__TypeDeclContext__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3182:1: ( rule__TypeDeclContext__Group_2__1__Impl )
            // InternalBSharp.g:3183:2: rule__TypeDeclContext__Group_2__1__Impl
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
    // InternalBSharp.g:3189:1: rule__TypeDeclContext__Group_2__1__Impl : ( ( rule__TypeDeclContext__TypeNameAssignment_2_1 ) ) ;
    public final void rule__TypeDeclContext__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3193:1: ( ( ( rule__TypeDeclContext__TypeNameAssignment_2_1 ) ) )
            // InternalBSharp.g:3194:1: ( ( rule__TypeDeclContext__TypeNameAssignment_2_1 ) )
            {
            // InternalBSharp.g:3194:1: ( ( rule__TypeDeclContext__TypeNameAssignment_2_1 ) )
            // InternalBSharp.g:3195:2: ( rule__TypeDeclContext__TypeNameAssignment_2_1 )
            {
             before(grammarAccess.getTypeDeclContextAccess().getTypeNameAssignment_2_1()); 
            // InternalBSharp.g:3196:2: ( rule__TypeDeclContext__TypeNameAssignment_2_1 )
            // InternalBSharp.g:3196:3: rule__TypeDeclContext__TypeNameAssignment_2_1
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
    // InternalBSharp.g:3205:1: rule__TypeStructure__Group__0 : rule__TypeStructure__Group__0__Impl rule__TypeStructure__Group__1 ;
    public final void rule__TypeStructure__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3209:1: ( rule__TypeStructure__Group__0__Impl rule__TypeStructure__Group__1 )
            // InternalBSharp.g:3210:2: rule__TypeStructure__Group__0__Impl rule__TypeStructure__Group__1
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
    // InternalBSharp.g:3217:1: rule__TypeStructure__Group__0__Impl : ( '(' ) ;
    public final void rule__TypeStructure__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3221:1: ( ( '(' ) )
            // InternalBSharp.g:3222:1: ( '(' )
            {
            // InternalBSharp.g:3222:1: ( '(' )
            // InternalBSharp.g:3223:2: '('
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
    // InternalBSharp.g:3232:1: rule__TypeStructure__Group__1 : rule__TypeStructure__Group__1__Impl rule__TypeStructure__Group__2 ;
    public final void rule__TypeStructure__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3236:1: ( rule__TypeStructure__Group__1__Impl rule__TypeStructure__Group__2 )
            // InternalBSharp.g:3237:2: rule__TypeStructure__Group__1__Impl rule__TypeStructure__Group__2
            {
            pushFollow(FOLLOW_22);
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
    // InternalBSharp.g:3244:1: rule__TypeStructure__Group__1__Impl : ( ( rule__TypeStructure__VariablesAssignment_1 ) ) ;
    public final void rule__TypeStructure__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3248:1: ( ( ( rule__TypeStructure__VariablesAssignment_1 ) ) )
            // InternalBSharp.g:3249:1: ( ( rule__TypeStructure__VariablesAssignment_1 ) )
            {
            // InternalBSharp.g:3249:1: ( ( rule__TypeStructure__VariablesAssignment_1 ) )
            // InternalBSharp.g:3250:2: ( rule__TypeStructure__VariablesAssignment_1 )
            {
             before(grammarAccess.getTypeStructureAccess().getVariablesAssignment_1()); 
            // InternalBSharp.g:3251:2: ( rule__TypeStructure__VariablesAssignment_1 )
            // InternalBSharp.g:3251:3: rule__TypeStructure__VariablesAssignment_1
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
    // InternalBSharp.g:3259:1: rule__TypeStructure__Group__2 : rule__TypeStructure__Group__2__Impl ;
    public final void rule__TypeStructure__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3263:1: ( rule__TypeStructure__Group__2__Impl )
            // InternalBSharp.g:3264:2: rule__TypeStructure__Group__2__Impl
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
    // InternalBSharp.g:3270:1: rule__TypeStructure__Group__2__Impl : ( ')' ) ;
    public final void rule__TypeStructure__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3274:1: ( ( ')' ) )
            // InternalBSharp.g:3275:1: ( ')' )
            {
            // InternalBSharp.g:3275:1: ( ')' )
            // InternalBSharp.g:3276:2: ')'
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
    // InternalBSharp.g:3286:1: rule__Where__Group__0 : rule__Where__Group__0__Impl rule__Where__Group__1 ;
    public final void rule__Where__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3290:1: ( rule__Where__Group__0__Impl rule__Where__Group__1 )
            // InternalBSharp.g:3291:2: rule__Where__Group__0__Impl rule__Where__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalBSharp.g:3298:1: rule__Where__Group__0__Impl : ( 'where' ) ;
    public final void rule__Where__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3302:1: ( ( 'where' ) )
            // InternalBSharp.g:3303:1: ( 'where' )
            {
            // InternalBSharp.g:3303:1: ( 'where' )
            // InternalBSharp.g:3304:2: 'where'
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
    // InternalBSharp.g:3313:1: rule__Where__Group__1 : rule__Where__Group__1__Impl rule__Where__Group__2 ;
    public final void rule__Where__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3317:1: ( rule__Where__Group__1__Impl rule__Where__Group__2 )
            // InternalBSharp.g:3318:2: rule__Where__Group__1__Impl rule__Where__Group__2
            {
            pushFollow(FOLLOW_24);
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
    // InternalBSharp.g:3325:1: rule__Where__Group__1__Impl : ( ( rule__Where__ExpessionsAssignment_1 ) ) ;
    public final void rule__Where__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3329:1: ( ( ( rule__Where__ExpessionsAssignment_1 ) ) )
            // InternalBSharp.g:3330:1: ( ( rule__Where__ExpessionsAssignment_1 ) )
            {
            // InternalBSharp.g:3330:1: ( ( rule__Where__ExpessionsAssignment_1 ) )
            // InternalBSharp.g:3331:2: ( rule__Where__ExpessionsAssignment_1 )
            {
             before(grammarAccess.getWhereAccess().getExpessionsAssignment_1()); 
            // InternalBSharp.g:3332:2: ( rule__Where__ExpessionsAssignment_1 )
            // InternalBSharp.g:3332:3: rule__Where__ExpessionsAssignment_1
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
    // InternalBSharp.g:3340:1: rule__Where__Group__2 : rule__Where__Group__2__Impl ;
    public final void rule__Where__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3344:1: ( rule__Where__Group__2__Impl )
            // InternalBSharp.g:3345:2: rule__Where__Group__2__Impl
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
    // InternalBSharp.g:3351:1: rule__Where__Group__2__Impl : ( ( rule__Where__Group_2__0 )* ) ;
    public final void rule__Where__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3355:1: ( ( ( rule__Where__Group_2__0 )* ) )
            // InternalBSharp.g:3356:1: ( ( rule__Where__Group_2__0 )* )
            {
            // InternalBSharp.g:3356:1: ( ( rule__Where__Group_2__0 )* )
            // InternalBSharp.g:3357:2: ( rule__Where__Group_2__0 )*
            {
             before(grammarAccess.getWhereAccess().getGroup_2()); 
            // InternalBSharp.g:3358:2: ( rule__Where__Group_2__0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==37) ) {
                    int LA35_2 = input.LA(2);

                    if ( (LA35_2==RULE_ID||LA35_2==11||(LA35_2>=23 && LA35_2<=24)||LA35_2==41||LA35_2==49||LA35_2==54) ) {
                        alt35=1;
                    }


                }


                switch (alt35) {
            	case 1 :
            	    // InternalBSharp.g:3358:3: rule__Where__Group_2__0
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__Where__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
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
    // InternalBSharp.g:3367:1: rule__Where__Group_2__0 : rule__Where__Group_2__0__Impl rule__Where__Group_2__1 ;
    public final void rule__Where__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3371:1: ( rule__Where__Group_2__0__Impl rule__Where__Group_2__1 )
            // InternalBSharp.g:3372:2: rule__Where__Group_2__0__Impl rule__Where__Group_2__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalBSharp.g:3379:1: rule__Where__Group_2__0__Impl : ( ';' ) ;
    public final void rule__Where__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3383:1: ( ( ';' ) )
            // InternalBSharp.g:3384:1: ( ';' )
            {
            // InternalBSharp.g:3384:1: ( ';' )
            // InternalBSharp.g:3385:2: ';'
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
    // InternalBSharp.g:3394:1: rule__Where__Group_2__1 : rule__Where__Group_2__1__Impl ;
    public final void rule__Where__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3398:1: ( rule__Where__Group_2__1__Impl )
            // InternalBSharp.g:3399:2: rule__Where__Group_2__1__Impl
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
    // InternalBSharp.g:3405:1: rule__Where__Group_2__1__Impl : ( ( rule__Where__ExpressionsAssignment_2_1 ) ) ;
    public final void rule__Where__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3409:1: ( ( ( rule__Where__ExpressionsAssignment_2_1 ) ) )
            // InternalBSharp.g:3410:1: ( ( rule__Where__ExpressionsAssignment_2_1 ) )
            {
            // InternalBSharp.g:3410:1: ( ( rule__Where__ExpressionsAssignment_2_1 ) )
            // InternalBSharp.g:3411:2: ( rule__Where__ExpressionsAssignment_2_1 )
            {
             before(grammarAccess.getWhereAccess().getExpressionsAssignment_2_1()); 
            // InternalBSharp.g:3412:2: ( rule__Where__ExpressionsAssignment_2_1 )
            // InternalBSharp.g:3412:3: rule__Where__ExpressionsAssignment_2_1
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
    // InternalBSharp.g:3421:1: rule__Datatype__Group__0 : rule__Datatype__Group__0__Impl rule__Datatype__Group__1 ;
    public final void rule__Datatype__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3425:1: ( rule__Datatype__Group__0__Impl rule__Datatype__Group__1 )
            // InternalBSharp.g:3426:2: rule__Datatype__Group__0__Impl rule__Datatype__Group__1
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
    // InternalBSharp.g:3433:1: rule__Datatype__Group__0__Impl : ( 'Datatype' ) ;
    public final void rule__Datatype__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3437:1: ( ( 'Datatype' ) )
            // InternalBSharp.g:3438:1: ( 'Datatype' )
            {
            // InternalBSharp.g:3438:1: ( 'Datatype' )
            // InternalBSharp.g:3439:2: 'Datatype'
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
    // InternalBSharp.g:3448:1: rule__Datatype__Group__1 : rule__Datatype__Group__1__Impl rule__Datatype__Group__2 ;
    public final void rule__Datatype__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3452:1: ( rule__Datatype__Group__1__Impl rule__Datatype__Group__2 )
            // InternalBSharp.g:3453:2: rule__Datatype__Group__1__Impl rule__Datatype__Group__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalBSharp.g:3460:1: rule__Datatype__Group__1__Impl : ( ( rule__Datatype__NameAssignment_1 ) ) ;
    public final void rule__Datatype__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3464:1: ( ( ( rule__Datatype__NameAssignment_1 ) ) )
            // InternalBSharp.g:3465:1: ( ( rule__Datatype__NameAssignment_1 ) )
            {
            // InternalBSharp.g:3465:1: ( ( rule__Datatype__NameAssignment_1 ) )
            // InternalBSharp.g:3466:2: ( rule__Datatype__NameAssignment_1 )
            {
             before(grammarAccess.getDatatypeAccess().getNameAssignment_1()); 
            // InternalBSharp.g:3467:2: ( rule__Datatype__NameAssignment_1 )
            // InternalBSharp.g:3467:3: rule__Datatype__NameAssignment_1
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
    // InternalBSharp.g:3475:1: rule__Datatype__Group__2 : rule__Datatype__Group__2__Impl rule__Datatype__Group__3 ;
    public final void rule__Datatype__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3479:1: ( rule__Datatype__Group__2__Impl rule__Datatype__Group__3 )
            // InternalBSharp.g:3480:2: rule__Datatype__Group__2__Impl rule__Datatype__Group__3
            {
            pushFollow(FOLLOW_27);
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
    // InternalBSharp.g:3487:1: rule__Datatype__Group__2__Impl : ( ( rule__Datatype__ContextAssignment_2 )? ) ;
    public final void rule__Datatype__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3491:1: ( ( ( rule__Datatype__ContextAssignment_2 )? ) )
            // InternalBSharp.g:3492:1: ( ( rule__Datatype__ContextAssignment_2 )? )
            {
            // InternalBSharp.g:3492:1: ( ( rule__Datatype__ContextAssignment_2 )? )
            // InternalBSharp.g:3493:2: ( rule__Datatype__ContextAssignment_2 )?
            {
             before(grammarAccess.getDatatypeAccess().getContextAssignment_2()); 
            // InternalBSharp.g:3494:2: ( rule__Datatype__ContextAssignment_2 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==38) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalBSharp.g:3494:3: rule__Datatype__ContextAssignment_2
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
    // InternalBSharp.g:3502:1: rule__Datatype__Group__3 : rule__Datatype__Group__3__Impl rule__Datatype__Group__4 ;
    public final void rule__Datatype__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3506:1: ( rule__Datatype__Group__3__Impl rule__Datatype__Group__4 )
            // InternalBSharp.g:3507:2: rule__Datatype__Group__3__Impl rule__Datatype__Group__4
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
    // InternalBSharp.g:3514:1: rule__Datatype__Group__3__Impl : ( ( ( rule__Datatype__Group_3__0 ) ) ( ( rule__Datatype__Group_3__0 )* ) ) ;
    public final void rule__Datatype__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3518:1: ( ( ( ( rule__Datatype__Group_3__0 ) ) ( ( rule__Datatype__Group_3__0 )* ) ) )
            // InternalBSharp.g:3519:1: ( ( ( rule__Datatype__Group_3__0 ) ) ( ( rule__Datatype__Group_3__0 )* ) )
            {
            // InternalBSharp.g:3519:1: ( ( ( rule__Datatype__Group_3__0 ) ) ( ( rule__Datatype__Group_3__0 )* ) )
            // InternalBSharp.g:3520:2: ( ( rule__Datatype__Group_3__0 ) ) ( ( rule__Datatype__Group_3__0 )* )
            {
            // InternalBSharp.g:3520:2: ( ( rule__Datatype__Group_3__0 ) )
            // InternalBSharp.g:3521:3: ( rule__Datatype__Group_3__0 )
            {
             before(grammarAccess.getDatatypeAccess().getGroup_3()); 
            // InternalBSharp.g:3522:3: ( rule__Datatype__Group_3__0 )
            // InternalBSharp.g:3522:4: rule__Datatype__Group_3__0
            {
            pushFollow(FOLLOW_28);
            rule__Datatype__Group_3__0();

            state._fsp--;


            }

             after(grammarAccess.getDatatypeAccess().getGroup_3()); 

            }

            // InternalBSharp.g:3525:2: ( ( rule__Datatype__Group_3__0 )* )
            // InternalBSharp.g:3526:3: ( rule__Datatype__Group_3__0 )*
            {
             before(grammarAccess.getDatatypeAccess().getGroup_3()); 
            // InternalBSharp.g:3527:3: ( rule__Datatype__Group_3__0 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==45) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalBSharp.g:3527:4: rule__Datatype__Group_3__0
            	    {
            	    pushFollow(FOLLOW_28);
            	    rule__Datatype__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop37;
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
    // InternalBSharp.g:3536:1: rule__Datatype__Group__4 : rule__Datatype__Group__4__Impl ;
    public final void rule__Datatype__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3540:1: ( rule__Datatype__Group__4__Impl )
            // InternalBSharp.g:3541:2: rule__Datatype__Group__4__Impl
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
    // InternalBSharp.g:3547:1: rule__Datatype__Group__4__Impl : ( ( rule__Datatype__BlockAssignment_4 ) ) ;
    public final void rule__Datatype__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3551:1: ( ( ( rule__Datatype__BlockAssignment_4 ) ) )
            // InternalBSharp.g:3552:1: ( ( rule__Datatype__BlockAssignment_4 ) )
            {
            // InternalBSharp.g:3552:1: ( ( rule__Datatype__BlockAssignment_4 ) )
            // InternalBSharp.g:3553:2: ( rule__Datatype__BlockAssignment_4 )
            {
             before(grammarAccess.getDatatypeAccess().getBlockAssignment_4()); 
            // InternalBSharp.g:3554:2: ( rule__Datatype__BlockAssignment_4 )
            // InternalBSharp.g:3554:3: rule__Datatype__BlockAssignment_4
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
    // InternalBSharp.g:3563:1: rule__Datatype__Group_3__0 : rule__Datatype__Group_3__0__Impl rule__Datatype__Group_3__1 ;
    public final void rule__Datatype__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3567:1: ( rule__Datatype__Group_3__0__Impl rule__Datatype__Group_3__1 )
            // InternalBSharp.g:3568:2: rule__Datatype__Group_3__0__Impl rule__Datatype__Group_3__1
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
    // InternalBSharp.g:3575:1: rule__Datatype__Group_3__0__Impl : ( '|' ) ;
    public final void rule__Datatype__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3579:1: ( ( '|' ) )
            // InternalBSharp.g:3580:1: ( '|' )
            {
            // InternalBSharp.g:3580:1: ( '|' )
            // InternalBSharp.g:3581:2: '|'
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
    // InternalBSharp.g:3590:1: rule__Datatype__Group_3__1 : rule__Datatype__Group_3__1__Impl ;
    public final void rule__Datatype__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3594:1: ( rule__Datatype__Group_3__1__Impl )
            // InternalBSharp.g:3595:2: rule__Datatype__Group_3__1__Impl
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
    // InternalBSharp.g:3601:1: rule__Datatype__Group_3__1__Impl : ( ( rule__Datatype__ConstructorsAssignment_3_1 ) ) ;
    public final void rule__Datatype__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3605:1: ( ( ( rule__Datatype__ConstructorsAssignment_3_1 ) ) )
            // InternalBSharp.g:3606:1: ( ( rule__Datatype__ConstructorsAssignment_3_1 ) )
            {
            // InternalBSharp.g:3606:1: ( ( rule__Datatype__ConstructorsAssignment_3_1 ) )
            // InternalBSharp.g:3607:2: ( rule__Datatype__ConstructorsAssignment_3_1 )
            {
             before(grammarAccess.getDatatypeAccess().getConstructorsAssignment_3_1()); 
            // InternalBSharp.g:3608:2: ( rule__Datatype__ConstructorsAssignment_3_1 )
            // InternalBSharp.g:3608:3: rule__Datatype__ConstructorsAssignment_3_1
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
    // InternalBSharp.g:3617:1: rule__DatatypeConstructor__Group__0 : rule__DatatypeConstructor__Group__0__Impl rule__DatatypeConstructor__Group__1 ;
    public final void rule__DatatypeConstructor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3621:1: ( rule__DatatypeConstructor__Group__0__Impl rule__DatatypeConstructor__Group__1 )
            // InternalBSharp.g:3622:2: rule__DatatypeConstructor__Group__0__Impl rule__DatatypeConstructor__Group__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalBSharp.g:3629:1: rule__DatatypeConstructor__Group__0__Impl : ( ( rule__DatatypeConstructor__NameAssignment_0 ) ) ;
    public final void rule__DatatypeConstructor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3633:1: ( ( ( rule__DatatypeConstructor__NameAssignment_0 ) ) )
            // InternalBSharp.g:3634:1: ( ( rule__DatatypeConstructor__NameAssignment_0 ) )
            {
            // InternalBSharp.g:3634:1: ( ( rule__DatatypeConstructor__NameAssignment_0 ) )
            // InternalBSharp.g:3635:2: ( rule__DatatypeConstructor__NameAssignment_0 )
            {
             before(grammarAccess.getDatatypeConstructorAccess().getNameAssignment_0()); 
            // InternalBSharp.g:3636:2: ( rule__DatatypeConstructor__NameAssignment_0 )
            // InternalBSharp.g:3636:3: rule__DatatypeConstructor__NameAssignment_0
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
    // InternalBSharp.g:3644:1: rule__DatatypeConstructor__Group__1 : rule__DatatypeConstructor__Group__1__Impl ;
    public final void rule__DatatypeConstructor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3648:1: ( rule__DatatypeConstructor__Group__1__Impl )
            // InternalBSharp.g:3649:2: rule__DatatypeConstructor__Group__1__Impl
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
    // InternalBSharp.g:3655:1: rule__DatatypeConstructor__Group__1__Impl : ( ( rule__DatatypeConstructor__Group_1__0 )? ) ;
    public final void rule__DatatypeConstructor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3659:1: ( ( ( rule__DatatypeConstructor__Group_1__0 )? ) )
            // InternalBSharp.g:3660:1: ( ( rule__DatatypeConstructor__Group_1__0 )? )
            {
            // InternalBSharp.g:3660:1: ( ( rule__DatatypeConstructor__Group_1__0 )? )
            // InternalBSharp.g:3661:2: ( rule__DatatypeConstructor__Group_1__0 )?
            {
             before(grammarAccess.getDatatypeConstructorAccess().getGroup_1()); 
            // InternalBSharp.g:3662:2: ( rule__DatatypeConstructor__Group_1__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==41) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalBSharp.g:3662:3: rule__DatatypeConstructor__Group_1__0
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
    // InternalBSharp.g:3671:1: rule__DatatypeConstructor__Group_1__0 : rule__DatatypeConstructor__Group_1__0__Impl rule__DatatypeConstructor__Group_1__1 ;
    public final void rule__DatatypeConstructor__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3675:1: ( rule__DatatypeConstructor__Group_1__0__Impl rule__DatatypeConstructor__Group_1__1 )
            // InternalBSharp.g:3676:2: rule__DatatypeConstructor__Group_1__0__Impl rule__DatatypeConstructor__Group_1__1
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
    // InternalBSharp.g:3683:1: rule__DatatypeConstructor__Group_1__0__Impl : ( '(' ) ;
    public final void rule__DatatypeConstructor__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3687:1: ( ( '(' ) )
            // InternalBSharp.g:3688:1: ( '(' )
            {
            // InternalBSharp.g:3688:1: ( '(' )
            // InternalBSharp.g:3689:2: '('
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
    // InternalBSharp.g:3698:1: rule__DatatypeConstructor__Group_1__1 : rule__DatatypeConstructor__Group_1__1__Impl rule__DatatypeConstructor__Group_1__2 ;
    public final void rule__DatatypeConstructor__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3702:1: ( rule__DatatypeConstructor__Group_1__1__Impl rule__DatatypeConstructor__Group_1__2 )
            // InternalBSharp.g:3703:2: rule__DatatypeConstructor__Group_1__1__Impl rule__DatatypeConstructor__Group_1__2
            {
            pushFollow(FOLLOW_22);
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
    // InternalBSharp.g:3710:1: rule__DatatypeConstructor__Group_1__1__Impl : ( ( rule__DatatypeConstructor__DeconsAssignment_1_1 ) ) ;
    public final void rule__DatatypeConstructor__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3714:1: ( ( ( rule__DatatypeConstructor__DeconsAssignment_1_1 ) ) )
            // InternalBSharp.g:3715:1: ( ( rule__DatatypeConstructor__DeconsAssignment_1_1 ) )
            {
            // InternalBSharp.g:3715:1: ( ( rule__DatatypeConstructor__DeconsAssignment_1_1 ) )
            // InternalBSharp.g:3716:2: ( rule__DatatypeConstructor__DeconsAssignment_1_1 )
            {
             before(grammarAccess.getDatatypeConstructorAccess().getDeconsAssignment_1_1()); 
            // InternalBSharp.g:3717:2: ( rule__DatatypeConstructor__DeconsAssignment_1_1 )
            // InternalBSharp.g:3717:3: rule__DatatypeConstructor__DeconsAssignment_1_1
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
    // InternalBSharp.g:3725:1: rule__DatatypeConstructor__Group_1__2 : rule__DatatypeConstructor__Group_1__2__Impl ;
    public final void rule__DatatypeConstructor__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3729:1: ( rule__DatatypeConstructor__Group_1__2__Impl )
            // InternalBSharp.g:3730:2: rule__DatatypeConstructor__Group_1__2__Impl
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
    // InternalBSharp.g:3736:1: rule__DatatypeConstructor__Group_1__2__Impl : ( ')' ) ;
    public final void rule__DatatypeConstructor__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3740:1: ( ( ')' ) )
            // InternalBSharp.g:3741:1: ( ')' )
            {
            // InternalBSharp.g:3741:1: ( ')' )
            // InternalBSharp.g:3742:2: ')'
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
    // InternalBSharp.g:3752:1: rule__Extend__Group__0 : rule__Extend__Group__0__Impl rule__Extend__Group__1 ;
    public final void rule__Extend__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3756:1: ( rule__Extend__Group__0__Impl rule__Extend__Group__1 )
            // InternalBSharp.g:3757:2: rule__Extend__Group__0__Impl rule__Extend__Group__1
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
    // InternalBSharp.g:3764:1: rule__Extend__Group__0__Impl : ( 'Extend' ) ;
    public final void rule__Extend__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3768:1: ( ( 'Extend' ) )
            // InternalBSharp.g:3769:1: ( 'Extend' )
            {
            // InternalBSharp.g:3769:1: ( 'Extend' )
            // InternalBSharp.g:3770:2: 'Extend'
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
    // InternalBSharp.g:3779:1: rule__Extend__Group__1 : rule__Extend__Group__1__Impl rule__Extend__Group__2 ;
    public final void rule__Extend__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3783:1: ( rule__Extend__Group__1__Impl rule__Extend__Group__2 )
            // InternalBSharp.g:3784:2: rule__Extend__Group__1__Impl rule__Extend__Group__2
            {
            pushFollow(FOLLOW_29);
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
    // InternalBSharp.g:3791:1: rule__Extend__Group__1__Impl : ( ( rule__Extend__ExtendedClassAssignment_1 ) ) ;
    public final void rule__Extend__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3795:1: ( ( ( rule__Extend__ExtendedClassAssignment_1 ) ) )
            // InternalBSharp.g:3796:1: ( ( rule__Extend__ExtendedClassAssignment_1 ) )
            {
            // InternalBSharp.g:3796:1: ( ( rule__Extend__ExtendedClassAssignment_1 ) )
            // InternalBSharp.g:3797:2: ( rule__Extend__ExtendedClassAssignment_1 )
            {
             before(grammarAccess.getExtendAccess().getExtendedClassAssignment_1()); 
            // InternalBSharp.g:3798:2: ( rule__Extend__ExtendedClassAssignment_1 )
            // InternalBSharp.g:3798:3: rule__Extend__ExtendedClassAssignment_1
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
    // InternalBSharp.g:3806:1: rule__Extend__Group__2 : rule__Extend__Group__2__Impl rule__Extend__Group__3 ;
    public final void rule__Extend__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3810:1: ( rule__Extend__Group__2__Impl rule__Extend__Group__3 )
            // InternalBSharp.g:3811:2: rule__Extend__Group__2__Impl rule__Extend__Group__3
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
    // InternalBSharp.g:3818:1: rule__Extend__Group__2__Impl : ( '(' ) ;
    public final void rule__Extend__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3822:1: ( ( '(' ) )
            // InternalBSharp.g:3823:1: ( '(' )
            {
            // InternalBSharp.g:3823:1: ( '(' )
            // InternalBSharp.g:3824:2: '('
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
    // InternalBSharp.g:3833:1: rule__Extend__Group__3 : rule__Extend__Group__3__Impl rule__Extend__Group__4 ;
    public final void rule__Extend__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3837:1: ( rule__Extend__Group__3__Impl rule__Extend__Group__4 )
            // InternalBSharp.g:3838:2: rule__Extend__Group__3__Impl rule__Extend__Group__4
            {
            pushFollow(FOLLOW_22);
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
    // InternalBSharp.g:3845:1: rule__Extend__Group__3__Impl : ( ( rule__Extend__NameAssignment_3 ) ) ;
    public final void rule__Extend__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3849:1: ( ( ( rule__Extend__NameAssignment_3 ) ) )
            // InternalBSharp.g:3850:1: ( ( rule__Extend__NameAssignment_3 ) )
            {
            // InternalBSharp.g:3850:1: ( ( rule__Extend__NameAssignment_3 ) )
            // InternalBSharp.g:3851:2: ( rule__Extend__NameAssignment_3 )
            {
             before(grammarAccess.getExtendAccess().getNameAssignment_3()); 
            // InternalBSharp.g:3852:2: ( rule__Extend__NameAssignment_3 )
            // InternalBSharp.g:3852:3: rule__Extend__NameAssignment_3
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
    // InternalBSharp.g:3860:1: rule__Extend__Group__4 : rule__Extend__Group__4__Impl rule__Extend__Group__5 ;
    public final void rule__Extend__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3864:1: ( rule__Extend__Group__4__Impl rule__Extend__Group__5 )
            // InternalBSharp.g:3865:2: rule__Extend__Group__4__Impl rule__Extend__Group__5
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
    // InternalBSharp.g:3872:1: rule__Extend__Group__4__Impl : ( ')' ) ;
    public final void rule__Extend__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3876:1: ( ( ')' ) )
            // InternalBSharp.g:3877:1: ( ')' )
            {
            // InternalBSharp.g:3877:1: ( ')' )
            // InternalBSharp.g:3878:2: ')'
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
    // InternalBSharp.g:3887:1: rule__Extend__Group__5 : rule__Extend__Group__5__Impl ;
    public final void rule__Extend__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3891:1: ( rule__Extend__Group__5__Impl )
            // InternalBSharp.g:3892:2: rule__Extend__Group__5__Impl
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
    // InternalBSharp.g:3898:1: rule__Extend__Group__5__Impl : ( ( rule__Extend__BlockAssignment_5 ) ) ;
    public final void rule__Extend__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3902:1: ( ( ( rule__Extend__BlockAssignment_5 ) ) )
            // InternalBSharp.g:3903:1: ( ( rule__Extend__BlockAssignment_5 ) )
            {
            // InternalBSharp.g:3903:1: ( ( rule__Extend__BlockAssignment_5 ) )
            // InternalBSharp.g:3904:2: ( rule__Extend__BlockAssignment_5 )
            {
             before(grammarAccess.getExtendAccess().getBlockAssignment_5()); 
            // InternalBSharp.g:3905:2: ( rule__Extend__BlockAssignment_5 )
            // InternalBSharp.g:3905:3: rule__Extend__BlockAssignment_5
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
    // InternalBSharp.g:3914:1: rule__BSharpBlock__Group__0 : rule__BSharpBlock__Group__0__Impl rule__BSharpBlock__Group__1 ;
    public final void rule__BSharpBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3918:1: ( rule__BSharpBlock__Group__0__Impl rule__BSharpBlock__Group__1 )
            // InternalBSharp.g:3919:2: rule__BSharpBlock__Group__0__Impl rule__BSharpBlock__Group__1
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
    // InternalBSharp.g:3926:1: rule__BSharpBlock__Group__0__Impl : ( () ) ;
    public final void rule__BSharpBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3930:1: ( ( () ) )
            // InternalBSharp.g:3931:1: ( () )
            {
            // InternalBSharp.g:3931:1: ( () )
            // InternalBSharp.g:3932:2: ()
            {
             before(grammarAccess.getBSharpBlockAccess().getBSharpBlockAction_0()); 
            // InternalBSharp.g:3933:2: ()
            // InternalBSharp.g:3933:3: 
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
    // InternalBSharp.g:3941:1: rule__BSharpBlock__Group__1 : rule__BSharpBlock__Group__1__Impl rule__BSharpBlock__Group__2 ;
    public final void rule__BSharpBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3945:1: ( rule__BSharpBlock__Group__1__Impl rule__BSharpBlock__Group__2 )
            // InternalBSharp.g:3946:2: rule__BSharpBlock__Group__1__Impl rule__BSharpBlock__Group__2
            {
            pushFollow(FOLLOW_30);
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
    // InternalBSharp.g:3953:1: rule__BSharpBlock__Group__1__Impl : ( '{' ) ;
    public final void rule__BSharpBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3957:1: ( ( '{' ) )
            // InternalBSharp.g:3958:1: ( '{' )
            {
            // InternalBSharp.g:3958:1: ( '{' )
            // InternalBSharp.g:3959:2: '{'
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
    // InternalBSharp.g:3968:1: rule__BSharpBlock__Group__2 : rule__BSharpBlock__Group__2__Impl rule__BSharpBlock__Group__3 ;
    public final void rule__BSharpBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3972:1: ( rule__BSharpBlock__Group__2__Impl rule__BSharpBlock__Group__3 )
            // InternalBSharp.g:3973:2: rule__BSharpBlock__Group__2__Impl rule__BSharpBlock__Group__3
            {
            pushFollow(FOLLOW_30);
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
    // InternalBSharp.g:3980:1: rule__BSharpBlock__Group__2__Impl : ( ( rule__BSharpBlock__BodyElementsAssignment_2 )* ) ;
    public final void rule__BSharpBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3984:1: ( ( ( rule__BSharpBlock__BodyElementsAssignment_2 )* ) )
            // InternalBSharp.g:3985:1: ( ( rule__BSharpBlock__BodyElementsAssignment_2 )* )
            {
            // InternalBSharp.g:3985:1: ( ( rule__BSharpBlock__BodyElementsAssignment_2 )* )
            // InternalBSharp.g:3986:2: ( rule__BSharpBlock__BodyElementsAssignment_2 )*
            {
             before(grammarAccess.getBSharpBlockAccess().getBodyElementsAssignment_2()); 
            // InternalBSharp.g:3987:2: ( rule__BSharpBlock__BodyElementsAssignment_2 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==RULE_ID||LA39_0==50) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalBSharp.g:3987:3: rule__BSharpBlock__BodyElementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__BSharpBlock__BodyElementsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop39;
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
    // InternalBSharp.g:3995:1: rule__BSharpBlock__Group__3 : rule__BSharpBlock__Group__3__Impl ;
    public final void rule__BSharpBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3999:1: ( rule__BSharpBlock__Group__3__Impl )
            // InternalBSharp.g:4000:2: rule__BSharpBlock__Group__3__Impl
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
    // InternalBSharp.g:4006:1: rule__BSharpBlock__Group__3__Impl : ( '}' ) ;
    public final void rule__BSharpBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4010:1: ( ( '}' ) )
            // InternalBSharp.g:4011:1: ( '}' )
            {
            // InternalBSharp.g:4011:1: ( '}' )
            // InternalBSharp.g:4012:2: '}'
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
    // InternalBSharp.g:4022:1: rule__FunctionDecl__Group__0 : rule__FunctionDecl__Group__0__Impl rule__FunctionDecl__Group__1 ;
    public final void rule__FunctionDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4026:1: ( rule__FunctionDecl__Group__0__Impl rule__FunctionDecl__Group__1 )
            // InternalBSharp.g:4027:2: rule__FunctionDecl__Group__0__Impl rule__FunctionDecl__Group__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalBSharp.g:4034:1: rule__FunctionDecl__Group__0__Impl : ( ( rule__FunctionDecl__NameAssignment_0 ) ) ;
    public final void rule__FunctionDecl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4038:1: ( ( ( rule__FunctionDecl__NameAssignment_0 ) ) )
            // InternalBSharp.g:4039:1: ( ( rule__FunctionDecl__NameAssignment_0 ) )
            {
            // InternalBSharp.g:4039:1: ( ( rule__FunctionDecl__NameAssignment_0 ) )
            // InternalBSharp.g:4040:2: ( rule__FunctionDecl__NameAssignment_0 )
            {
             before(grammarAccess.getFunctionDeclAccess().getNameAssignment_0()); 
            // InternalBSharp.g:4041:2: ( rule__FunctionDecl__NameAssignment_0 )
            // InternalBSharp.g:4041:3: rule__FunctionDecl__NameAssignment_0
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
    // InternalBSharp.g:4049:1: rule__FunctionDecl__Group__1 : rule__FunctionDecl__Group__1__Impl rule__FunctionDecl__Group__2 ;
    public final void rule__FunctionDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4053:1: ( rule__FunctionDecl__Group__1__Impl rule__FunctionDecl__Group__2 )
            // InternalBSharp.g:4054:2: rule__FunctionDecl__Group__1__Impl rule__FunctionDecl__Group__2
            {
            pushFollow(FOLLOW_32);
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
    // InternalBSharp.g:4061:1: rule__FunctionDecl__Group__1__Impl : ( ( rule__FunctionDecl__ContextAssignment_1 )? ) ;
    public final void rule__FunctionDecl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4065:1: ( ( ( rule__FunctionDecl__ContextAssignment_1 )? ) )
            // InternalBSharp.g:4066:1: ( ( rule__FunctionDecl__ContextAssignment_1 )? )
            {
            // InternalBSharp.g:4066:1: ( ( rule__FunctionDecl__ContextAssignment_1 )? )
            // InternalBSharp.g:4067:2: ( rule__FunctionDecl__ContextAssignment_1 )?
            {
             before(grammarAccess.getFunctionDeclAccess().getContextAssignment_1()); 
            // InternalBSharp.g:4068:2: ( rule__FunctionDecl__ContextAssignment_1 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==38) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalBSharp.g:4068:3: rule__FunctionDecl__ContextAssignment_1
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
    // InternalBSharp.g:4076:1: rule__FunctionDecl__Group__2 : rule__FunctionDecl__Group__2__Impl rule__FunctionDecl__Group__3 ;
    public final void rule__FunctionDecl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4080:1: ( rule__FunctionDecl__Group__2__Impl rule__FunctionDecl__Group__3 )
            // InternalBSharp.g:4081:2: rule__FunctionDecl__Group__2__Impl rule__FunctionDecl__Group__3
            {
            pushFollow(FOLLOW_33);
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
    // InternalBSharp.g:4088:1: rule__FunctionDecl__Group__2__Impl : ( '(' ) ;
    public final void rule__FunctionDecl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4092:1: ( ( '(' ) )
            // InternalBSharp.g:4093:1: ( '(' )
            {
            // InternalBSharp.g:4093:1: ( '(' )
            // InternalBSharp.g:4094:2: '('
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
    // InternalBSharp.g:4103:1: rule__FunctionDecl__Group__3 : rule__FunctionDecl__Group__3__Impl rule__FunctionDecl__Group__4 ;
    public final void rule__FunctionDecl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4107:1: ( rule__FunctionDecl__Group__3__Impl rule__FunctionDecl__Group__4 )
            // InternalBSharp.g:4108:2: rule__FunctionDecl__Group__3__Impl rule__FunctionDecl__Group__4
            {
            pushFollow(FOLLOW_33);
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
    // InternalBSharp.g:4115:1: rule__FunctionDecl__Group__3__Impl : ( ( rule__FunctionDecl__VarListAssignment_3 )? ) ;
    public final void rule__FunctionDecl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4119:1: ( ( ( rule__FunctionDecl__VarListAssignment_3 )? ) )
            // InternalBSharp.g:4120:1: ( ( rule__FunctionDecl__VarListAssignment_3 )? )
            {
            // InternalBSharp.g:4120:1: ( ( rule__FunctionDecl__VarListAssignment_3 )? )
            // InternalBSharp.g:4121:2: ( rule__FunctionDecl__VarListAssignment_3 )?
            {
             before(grammarAccess.getFunctionDeclAccess().getVarListAssignment_3()); 
            // InternalBSharp.g:4122:2: ( rule__FunctionDecl__VarListAssignment_3 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==RULE_ID) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalBSharp.g:4122:3: rule__FunctionDecl__VarListAssignment_3
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
    // InternalBSharp.g:4130:1: rule__FunctionDecl__Group__4 : rule__FunctionDecl__Group__4__Impl rule__FunctionDecl__Group__5 ;
    public final void rule__FunctionDecl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4134:1: ( rule__FunctionDecl__Group__4__Impl rule__FunctionDecl__Group__5 )
            // InternalBSharp.g:4135:2: rule__FunctionDecl__Group__4__Impl rule__FunctionDecl__Group__5
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
    // InternalBSharp.g:4142:1: rule__FunctionDecl__Group__4__Impl : ( ')' ) ;
    public final void rule__FunctionDecl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4146:1: ( ( ')' ) )
            // InternalBSharp.g:4147:1: ( ')' )
            {
            // InternalBSharp.g:4147:1: ( ')' )
            // InternalBSharp.g:4148:2: ')'
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
    // InternalBSharp.g:4157:1: rule__FunctionDecl__Group__5 : rule__FunctionDecl__Group__5__Impl rule__FunctionDecl__Group__6 ;
    public final void rule__FunctionDecl__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4161:1: ( rule__FunctionDecl__Group__5__Impl rule__FunctionDecl__Group__6 )
            // InternalBSharp.g:4162:2: rule__FunctionDecl__Group__5__Impl rule__FunctionDecl__Group__6
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
    // InternalBSharp.g:4169:1: rule__FunctionDecl__Group__5__Impl : ( ':' ) ;
    public final void rule__FunctionDecl__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4173:1: ( ( ':' ) )
            // InternalBSharp.g:4174:1: ( ':' )
            {
            // InternalBSharp.g:4174:1: ( ':' )
            // InternalBSharp.g:4175:2: ':'
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
    // InternalBSharp.g:4184:1: rule__FunctionDecl__Group__6 : rule__FunctionDecl__Group__6__Impl rule__FunctionDecl__Group__7 ;
    public final void rule__FunctionDecl__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4188:1: ( rule__FunctionDecl__Group__6__Impl rule__FunctionDecl__Group__7 )
            // InternalBSharp.g:4189:2: rule__FunctionDecl__Group__6__Impl rule__FunctionDecl__Group__7
            {
            pushFollow(FOLLOW_34);
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
    // InternalBSharp.g:4196:1: rule__FunctionDecl__Group__6__Impl : ( ( rule__FunctionDecl__ReturnTypeAssignment_6 ) ) ;
    public final void rule__FunctionDecl__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4200:1: ( ( ( rule__FunctionDecl__ReturnTypeAssignment_6 ) ) )
            // InternalBSharp.g:4201:1: ( ( rule__FunctionDecl__ReturnTypeAssignment_6 ) )
            {
            // InternalBSharp.g:4201:1: ( ( rule__FunctionDecl__ReturnTypeAssignment_6 ) )
            // InternalBSharp.g:4202:2: ( rule__FunctionDecl__ReturnTypeAssignment_6 )
            {
             before(grammarAccess.getFunctionDeclAccess().getReturnTypeAssignment_6()); 
            // InternalBSharp.g:4203:2: ( rule__FunctionDecl__ReturnTypeAssignment_6 )
            // InternalBSharp.g:4203:3: rule__FunctionDecl__ReturnTypeAssignment_6
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
    // InternalBSharp.g:4211:1: rule__FunctionDecl__Group__7 : rule__FunctionDecl__Group__7__Impl rule__FunctionDecl__Group__8 ;
    public final void rule__FunctionDecl__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4215:1: ( rule__FunctionDecl__Group__7__Impl rule__FunctionDecl__Group__8 )
            // InternalBSharp.g:4216:2: rule__FunctionDecl__Group__7__Impl rule__FunctionDecl__Group__8
            {
            pushFollow(FOLLOW_34);
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
    // InternalBSharp.g:4223:1: rule__FunctionDecl__Group__7__Impl : ( ( rule__FunctionDecl__InfixAssignment_7 )? ) ;
    public final void rule__FunctionDecl__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4227:1: ( ( ( rule__FunctionDecl__InfixAssignment_7 )? ) )
            // InternalBSharp.g:4228:1: ( ( rule__FunctionDecl__InfixAssignment_7 )? )
            {
            // InternalBSharp.g:4228:1: ( ( rule__FunctionDecl__InfixAssignment_7 )? )
            // InternalBSharp.g:4229:2: ( rule__FunctionDecl__InfixAssignment_7 )?
            {
             before(grammarAccess.getFunctionDeclAccess().getInfixAssignment_7()); 
            // InternalBSharp.g:4230:2: ( rule__FunctionDecl__InfixAssignment_7 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==53) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalBSharp.g:4230:3: rule__FunctionDecl__InfixAssignment_7
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
    // InternalBSharp.g:4238:1: rule__FunctionDecl__Group__8 : rule__FunctionDecl__Group__8__Impl rule__FunctionDecl__Group__9 ;
    public final void rule__FunctionDecl__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4242:1: ( rule__FunctionDecl__Group__8__Impl rule__FunctionDecl__Group__9 )
            // InternalBSharp.g:4243:2: rule__FunctionDecl__Group__8__Impl rule__FunctionDecl__Group__9
            {
            pushFollow(FOLLOW_34);
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
    // InternalBSharp.g:4250:1: rule__FunctionDecl__Group__8__Impl : ( ( rule__FunctionDecl__PrecedenceAssignment_8 )? ) ;
    public final void rule__FunctionDecl__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4254:1: ( ( ( rule__FunctionDecl__PrecedenceAssignment_8 )? ) )
            // InternalBSharp.g:4255:1: ( ( rule__FunctionDecl__PrecedenceAssignment_8 )? )
            {
            // InternalBSharp.g:4255:1: ( ( rule__FunctionDecl__PrecedenceAssignment_8 )? )
            // InternalBSharp.g:4256:2: ( rule__FunctionDecl__PrecedenceAssignment_8 )?
            {
             before(grammarAccess.getFunctionDeclAccess().getPrecedenceAssignment_8()); 
            // InternalBSharp.g:4257:2: ( rule__FunctionDecl__PrecedenceAssignment_8 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_INT) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalBSharp.g:4257:3: rule__FunctionDecl__PrecedenceAssignment_8
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
    // InternalBSharp.g:4265:1: rule__FunctionDecl__Group__9 : rule__FunctionDecl__Group__9__Impl ;
    public final void rule__FunctionDecl__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4269:1: ( rule__FunctionDecl__Group__9__Impl )
            // InternalBSharp.g:4270:2: rule__FunctionDecl__Group__9__Impl
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
    // InternalBSharp.g:4276:1: rule__FunctionDecl__Group__9__Impl : ( ( rule__FunctionDecl__ExprAssignment_9 ) ) ;
    public final void rule__FunctionDecl__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4280:1: ( ( ( rule__FunctionDecl__ExprAssignment_9 ) ) )
            // InternalBSharp.g:4281:1: ( ( rule__FunctionDecl__ExprAssignment_9 ) )
            {
            // InternalBSharp.g:4281:1: ( ( rule__FunctionDecl__ExprAssignment_9 ) )
            // InternalBSharp.g:4282:2: ( rule__FunctionDecl__ExprAssignment_9 )
            {
             before(grammarAccess.getFunctionDeclAccess().getExprAssignment_9()); 
            // InternalBSharp.g:4283:2: ( rule__FunctionDecl__ExprAssignment_9 )
            // InternalBSharp.g:4283:3: rule__FunctionDecl__ExprAssignment_9
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
    // InternalBSharp.g:4292:1: rule__MatchStatement__Group__0 : rule__MatchStatement__Group__0__Impl rule__MatchStatement__Group__1 ;
    public final void rule__MatchStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4296:1: ( rule__MatchStatement__Group__0__Impl rule__MatchStatement__Group__1 )
            // InternalBSharp.g:4297:2: rule__MatchStatement__Group__0__Impl rule__MatchStatement__Group__1
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
    // InternalBSharp.g:4304:1: rule__MatchStatement__Group__0__Impl : ( 'match' ) ;
    public final void rule__MatchStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4308:1: ( ( 'match' ) )
            // InternalBSharp.g:4309:1: ( 'match' )
            {
            // InternalBSharp.g:4309:1: ( 'match' )
            // InternalBSharp.g:4310:2: 'match'
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
    // InternalBSharp.g:4319:1: rule__MatchStatement__Group__1 : rule__MatchStatement__Group__1__Impl rule__MatchStatement__Group__2 ;
    public final void rule__MatchStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4323:1: ( rule__MatchStatement__Group__1__Impl rule__MatchStatement__Group__2 )
            // InternalBSharp.g:4324:2: rule__MatchStatement__Group__1__Impl rule__MatchStatement__Group__2
            {
            pushFollow(FOLLOW_35);
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
    // InternalBSharp.g:4331:1: rule__MatchStatement__Group__1__Impl : ( ( rule__MatchStatement__MatchAssignment_1 ) ) ;
    public final void rule__MatchStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4335:1: ( ( ( rule__MatchStatement__MatchAssignment_1 ) ) )
            // InternalBSharp.g:4336:1: ( ( rule__MatchStatement__MatchAssignment_1 ) )
            {
            // InternalBSharp.g:4336:1: ( ( rule__MatchStatement__MatchAssignment_1 ) )
            // InternalBSharp.g:4337:2: ( rule__MatchStatement__MatchAssignment_1 )
            {
             before(grammarAccess.getMatchStatementAccess().getMatchAssignment_1()); 
            // InternalBSharp.g:4338:2: ( rule__MatchStatement__MatchAssignment_1 )
            // InternalBSharp.g:4338:3: rule__MatchStatement__MatchAssignment_1
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
    // InternalBSharp.g:4346:1: rule__MatchStatement__Group__2 : rule__MatchStatement__Group__2__Impl rule__MatchStatement__Group__3 ;
    public final void rule__MatchStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4350:1: ( rule__MatchStatement__Group__2__Impl rule__MatchStatement__Group__3 )
            // InternalBSharp.g:4351:2: rule__MatchStatement__Group__2__Impl rule__MatchStatement__Group__3
            {
            pushFollow(FOLLOW_36);
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
    // InternalBSharp.g:4358:1: rule__MatchStatement__Group__2__Impl : ( '{' ) ;
    public final void rule__MatchStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4362:1: ( ( '{' ) )
            // InternalBSharp.g:4363:1: ( '{' )
            {
            // InternalBSharp.g:4363:1: ( '{' )
            // InternalBSharp.g:4364:2: '{'
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
    // InternalBSharp.g:4373:1: rule__MatchStatement__Group__3 : rule__MatchStatement__Group__3__Impl rule__MatchStatement__Group__4 ;
    public final void rule__MatchStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4377:1: ( rule__MatchStatement__Group__3__Impl rule__MatchStatement__Group__4 )
            // InternalBSharp.g:4378:2: rule__MatchStatement__Group__3__Impl rule__MatchStatement__Group__4
            {
            pushFollow(FOLLOW_37);
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
    // InternalBSharp.g:4385:1: rule__MatchStatement__Group__3__Impl : ( ( rule__MatchStatement__InductCaseAssignment_3 ) ) ;
    public final void rule__MatchStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4389:1: ( ( ( rule__MatchStatement__InductCaseAssignment_3 ) ) )
            // InternalBSharp.g:4390:1: ( ( rule__MatchStatement__InductCaseAssignment_3 ) )
            {
            // InternalBSharp.g:4390:1: ( ( rule__MatchStatement__InductCaseAssignment_3 ) )
            // InternalBSharp.g:4391:2: ( rule__MatchStatement__InductCaseAssignment_3 )
            {
             before(grammarAccess.getMatchStatementAccess().getInductCaseAssignment_3()); 
            // InternalBSharp.g:4392:2: ( rule__MatchStatement__InductCaseAssignment_3 )
            // InternalBSharp.g:4392:3: rule__MatchStatement__InductCaseAssignment_3
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
    // InternalBSharp.g:4400:1: rule__MatchStatement__Group__4 : rule__MatchStatement__Group__4__Impl rule__MatchStatement__Group__5 ;
    public final void rule__MatchStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4404:1: ( rule__MatchStatement__Group__4__Impl rule__MatchStatement__Group__5 )
            // InternalBSharp.g:4405:2: rule__MatchStatement__Group__4__Impl rule__MatchStatement__Group__5
            {
            pushFollow(FOLLOW_37);
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
    // InternalBSharp.g:4412:1: rule__MatchStatement__Group__4__Impl : ( ( rule__MatchStatement__InductCaseAssignment_4 )* ) ;
    public final void rule__MatchStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4416:1: ( ( ( rule__MatchStatement__InductCaseAssignment_4 )* ) )
            // InternalBSharp.g:4417:1: ( ( rule__MatchStatement__InductCaseAssignment_4 )* )
            {
            // InternalBSharp.g:4417:1: ( ( rule__MatchStatement__InductCaseAssignment_4 )* )
            // InternalBSharp.g:4418:2: ( rule__MatchStatement__InductCaseAssignment_4 )*
            {
             before(grammarAccess.getMatchStatementAccess().getInductCaseAssignment_4()); 
            // InternalBSharp.g:4419:2: ( rule__MatchStatement__InductCaseAssignment_4 )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==45) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalBSharp.g:4419:3: rule__MatchStatement__InductCaseAssignment_4
            	    {
            	    pushFollow(FOLLOW_38);
            	    rule__MatchStatement__InductCaseAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop44;
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
    // InternalBSharp.g:4427:1: rule__MatchStatement__Group__5 : rule__MatchStatement__Group__5__Impl ;
    public final void rule__MatchStatement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4431:1: ( rule__MatchStatement__Group__5__Impl )
            // InternalBSharp.g:4432:2: rule__MatchStatement__Group__5__Impl
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
    // InternalBSharp.g:4438:1: rule__MatchStatement__Group__5__Impl : ( '}' ) ;
    public final void rule__MatchStatement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4442:1: ( ( '}' ) )
            // InternalBSharp.g:4443:1: ( '}' )
            {
            // InternalBSharp.g:4443:1: ( '}' )
            // InternalBSharp.g:4444:2: '}'
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
    // InternalBSharp.g:4454:1: rule__MatchCase__Group__0 : rule__MatchCase__Group__0__Impl rule__MatchCase__Group__1 ;
    public final void rule__MatchCase__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4458:1: ( rule__MatchCase__Group__0__Impl rule__MatchCase__Group__1 )
            // InternalBSharp.g:4459:2: rule__MatchCase__Group__0__Impl rule__MatchCase__Group__1
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
    // InternalBSharp.g:4466:1: rule__MatchCase__Group__0__Impl : ( '|' ) ;
    public final void rule__MatchCase__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4470:1: ( ( '|' ) )
            // InternalBSharp.g:4471:1: ( '|' )
            {
            // InternalBSharp.g:4471:1: ( '|' )
            // InternalBSharp.g:4472:2: '|'
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
    // InternalBSharp.g:4481:1: rule__MatchCase__Group__1 : rule__MatchCase__Group__1__Impl rule__MatchCase__Group__2 ;
    public final void rule__MatchCase__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4485:1: ( rule__MatchCase__Group__1__Impl rule__MatchCase__Group__2 )
            // InternalBSharp.g:4486:2: rule__MatchCase__Group__1__Impl rule__MatchCase__Group__2
            {
            pushFollow(FOLLOW_39);
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
    // InternalBSharp.g:4493:1: rule__MatchCase__Group__1__Impl : ( ( rule__MatchCase__DeconNameAssignment_1 ) ) ;
    public final void rule__MatchCase__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4497:1: ( ( ( rule__MatchCase__DeconNameAssignment_1 ) ) )
            // InternalBSharp.g:4498:1: ( ( rule__MatchCase__DeconNameAssignment_1 ) )
            {
            // InternalBSharp.g:4498:1: ( ( rule__MatchCase__DeconNameAssignment_1 ) )
            // InternalBSharp.g:4499:2: ( rule__MatchCase__DeconNameAssignment_1 )
            {
             before(grammarAccess.getMatchCaseAccess().getDeconNameAssignment_1()); 
            // InternalBSharp.g:4500:2: ( rule__MatchCase__DeconNameAssignment_1 )
            // InternalBSharp.g:4500:3: rule__MatchCase__DeconNameAssignment_1
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
    // InternalBSharp.g:4508:1: rule__MatchCase__Group__2 : rule__MatchCase__Group__2__Impl rule__MatchCase__Group__3 ;
    public final void rule__MatchCase__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4512:1: ( rule__MatchCase__Group__2__Impl rule__MatchCase__Group__3 )
            // InternalBSharp.g:4513:2: rule__MatchCase__Group__2__Impl rule__MatchCase__Group__3
            {
            pushFollow(FOLLOW_39);
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
    // InternalBSharp.g:4520:1: rule__MatchCase__Group__2__Impl : ( ( rule__MatchCase__Group_2__0 )? ) ;
    public final void rule__MatchCase__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4524:1: ( ( ( rule__MatchCase__Group_2__0 )? ) )
            // InternalBSharp.g:4525:1: ( ( rule__MatchCase__Group_2__0 )? )
            {
            // InternalBSharp.g:4525:1: ( ( rule__MatchCase__Group_2__0 )? )
            // InternalBSharp.g:4526:2: ( rule__MatchCase__Group_2__0 )?
            {
             before(grammarAccess.getMatchCaseAccess().getGroup_2()); 
            // InternalBSharp.g:4527:2: ( rule__MatchCase__Group_2__0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==41) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalBSharp.g:4527:3: rule__MatchCase__Group_2__0
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
    // InternalBSharp.g:4535:1: rule__MatchCase__Group__3 : rule__MatchCase__Group__3__Impl rule__MatchCase__Group__4 ;
    public final void rule__MatchCase__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4539:1: ( rule__MatchCase__Group__3__Impl rule__MatchCase__Group__4 )
            // InternalBSharp.g:4540:2: rule__MatchCase__Group__3__Impl rule__MatchCase__Group__4
            {
            pushFollow(FOLLOW_26);
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
    // InternalBSharp.g:4547:1: rule__MatchCase__Group__3__Impl : ( ':' ) ;
    public final void rule__MatchCase__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4551:1: ( ( ':' ) )
            // InternalBSharp.g:4552:1: ( ':' )
            {
            // InternalBSharp.g:4552:1: ( ':' )
            // InternalBSharp.g:4553:2: ':'
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
    // InternalBSharp.g:4562:1: rule__MatchCase__Group__4 : rule__MatchCase__Group__4__Impl ;
    public final void rule__MatchCase__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4566:1: ( rule__MatchCase__Group__4__Impl )
            // InternalBSharp.g:4567:2: rule__MatchCase__Group__4__Impl
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
    // InternalBSharp.g:4573:1: rule__MatchCase__Group__4__Impl : ( ( rule__MatchCase__ExprAssignment_4 ) ) ;
    public final void rule__MatchCase__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4577:1: ( ( ( rule__MatchCase__ExprAssignment_4 ) ) )
            // InternalBSharp.g:4578:1: ( ( rule__MatchCase__ExprAssignment_4 ) )
            {
            // InternalBSharp.g:4578:1: ( ( rule__MatchCase__ExprAssignment_4 ) )
            // InternalBSharp.g:4579:2: ( rule__MatchCase__ExprAssignment_4 )
            {
             before(grammarAccess.getMatchCaseAccess().getExprAssignment_4()); 
            // InternalBSharp.g:4580:2: ( rule__MatchCase__ExprAssignment_4 )
            // InternalBSharp.g:4580:3: rule__MatchCase__ExprAssignment_4
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
    // InternalBSharp.g:4589:1: rule__MatchCase__Group_2__0 : rule__MatchCase__Group_2__0__Impl rule__MatchCase__Group_2__1 ;
    public final void rule__MatchCase__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4593:1: ( rule__MatchCase__Group_2__0__Impl rule__MatchCase__Group_2__1 )
            // InternalBSharp.g:4594:2: rule__MatchCase__Group_2__0__Impl rule__MatchCase__Group_2__1
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
    // InternalBSharp.g:4601:1: rule__MatchCase__Group_2__0__Impl : ( '(' ) ;
    public final void rule__MatchCase__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4605:1: ( ( '(' ) )
            // InternalBSharp.g:4606:1: ( '(' )
            {
            // InternalBSharp.g:4606:1: ( '(' )
            // InternalBSharp.g:4607:2: '('
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
    // InternalBSharp.g:4616:1: rule__MatchCase__Group_2__1 : rule__MatchCase__Group_2__1__Impl rule__MatchCase__Group_2__2 ;
    public final void rule__MatchCase__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4620:1: ( rule__MatchCase__Group_2__1__Impl rule__MatchCase__Group_2__2 )
            // InternalBSharp.g:4621:2: rule__MatchCase__Group_2__1__Impl rule__MatchCase__Group_2__2
            {
            pushFollow(FOLLOW_40);
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
    // InternalBSharp.g:4628:1: rule__MatchCase__Group_2__1__Impl : ( ( rule__MatchCase__VariablesAssignment_2_1 ) ) ;
    public final void rule__MatchCase__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4632:1: ( ( ( rule__MatchCase__VariablesAssignment_2_1 ) ) )
            // InternalBSharp.g:4633:1: ( ( rule__MatchCase__VariablesAssignment_2_1 ) )
            {
            // InternalBSharp.g:4633:1: ( ( rule__MatchCase__VariablesAssignment_2_1 ) )
            // InternalBSharp.g:4634:2: ( rule__MatchCase__VariablesAssignment_2_1 )
            {
             before(grammarAccess.getMatchCaseAccess().getVariablesAssignment_2_1()); 
            // InternalBSharp.g:4635:2: ( rule__MatchCase__VariablesAssignment_2_1 )
            // InternalBSharp.g:4635:3: rule__MatchCase__VariablesAssignment_2_1
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
    // InternalBSharp.g:4643:1: rule__MatchCase__Group_2__2 : rule__MatchCase__Group_2__2__Impl rule__MatchCase__Group_2__3 ;
    public final void rule__MatchCase__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4647:1: ( rule__MatchCase__Group_2__2__Impl rule__MatchCase__Group_2__3 )
            // InternalBSharp.g:4648:2: rule__MatchCase__Group_2__2__Impl rule__MatchCase__Group_2__3
            {
            pushFollow(FOLLOW_40);
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
    // InternalBSharp.g:4655:1: rule__MatchCase__Group_2__2__Impl : ( ( rule__MatchCase__Group_2_2__0 )* ) ;
    public final void rule__MatchCase__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4659:1: ( ( ( rule__MatchCase__Group_2_2__0 )* ) )
            // InternalBSharp.g:4660:1: ( ( rule__MatchCase__Group_2_2__0 )* )
            {
            // InternalBSharp.g:4660:1: ( ( rule__MatchCase__Group_2_2__0 )* )
            // InternalBSharp.g:4661:2: ( rule__MatchCase__Group_2_2__0 )*
            {
             before(grammarAccess.getMatchCaseAccess().getGroup_2_2()); 
            // InternalBSharp.g:4662:2: ( rule__MatchCase__Group_2_2__0 )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==40) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalBSharp.g:4662:3: rule__MatchCase__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__MatchCase__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop46;
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
    // InternalBSharp.g:4670:1: rule__MatchCase__Group_2__3 : rule__MatchCase__Group_2__3__Impl ;
    public final void rule__MatchCase__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4674:1: ( rule__MatchCase__Group_2__3__Impl )
            // InternalBSharp.g:4675:2: rule__MatchCase__Group_2__3__Impl
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
    // InternalBSharp.g:4681:1: rule__MatchCase__Group_2__3__Impl : ( ')' ) ;
    public final void rule__MatchCase__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4685:1: ( ( ')' ) )
            // InternalBSharp.g:4686:1: ( ')' )
            {
            // InternalBSharp.g:4686:1: ( ')' )
            // InternalBSharp.g:4687:2: ')'
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
    // InternalBSharp.g:4697:1: rule__MatchCase__Group_2_2__0 : rule__MatchCase__Group_2_2__0__Impl rule__MatchCase__Group_2_2__1 ;
    public final void rule__MatchCase__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4701:1: ( rule__MatchCase__Group_2_2__0__Impl rule__MatchCase__Group_2_2__1 )
            // InternalBSharp.g:4702:2: rule__MatchCase__Group_2_2__0__Impl rule__MatchCase__Group_2_2__1
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
    // InternalBSharp.g:4709:1: rule__MatchCase__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__MatchCase__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4713:1: ( ( ',' ) )
            // InternalBSharp.g:4714:1: ( ',' )
            {
            // InternalBSharp.g:4714:1: ( ',' )
            // InternalBSharp.g:4715:2: ','
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
    // InternalBSharp.g:4724:1: rule__MatchCase__Group_2_2__1 : rule__MatchCase__Group_2_2__1__Impl ;
    public final void rule__MatchCase__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4728:1: ( rule__MatchCase__Group_2_2__1__Impl )
            // InternalBSharp.g:4729:2: rule__MatchCase__Group_2_2__1__Impl
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
    // InternalBSharp.g:4735:1: rule__MatchCase__Group_2_2__1__Impl : ( ( rule__MatchCase__VariablesAssignment_2_2_1 ) ) ;
    public final void rule__MatchCase__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4739:1: ( ( ( rule__MatchCase__VariablesAssignment_2_2_1 ) ) )
            // InternalBSharp.g:4740:1: ( ( rule__MatchCase__VariablesAssignment_2_2_1 ) )
            {
            // InternalBSharp.g:4740:1: ( ( rule__MatchCase__VariablesAssignment_2_2_1 ) )
            // InternalBSharp.g:4741:2: ( rule__MatchCase__VariablesAssignment_2_2_1 )
            {
             before(grammarAccess.getMatchCaseAccess().getVariablesAssignment_2_2_1()); 
            // InternalBSharp.g:4742:2: ( rule__MatchCase__VariablesAssignment_2_2_1 )
            // InternalBSharp.g:4742:3: rule__MatchCase__VariablesAssignment_2_2_1
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
    // InternalBSharp.g:4751:1: rule__TheoremBody__Group__0 : rule__TheoremBody__Group__0__Impl rule__TheoremBody__Group__1 ;
    public final void rule__TheoremBody__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4755:1: ( rule__TheoremBody__Group__0__Impl rule__TheoremBody__Group__1 )
            // InternalBSharp.g:4756:2: rule__TheoremBody__Group__0__Impl rule__TheoremBody__Group__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalBSharp.g:4763:1: rule__TheoremBody__Group__0__Impl : ( 'Theorems' ) ;
    public final void rule__TheoremBody__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4767:1: ( ( 'Theorems' ) )
            // InternalBSharp.g:4768:1: ( 'Theorems' )
            {
            // InternalBSharp.g:4768:1: ( 'Theorems' )
            // InternalBSharp.g:4769:2: 'Theorems'
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
    // InternalBSharp.g:4778:1: rule__TheoremBody__Group__1 : rule__TheoremBody__Group__1__Impl rule__TheoremBody__Group__2 ;
    public final void rule__TheoremBody__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4782:1: ( rule__TheoremBody__Group__1__Impl rule__TheoremBody__Group__2 )
            // InternalBSharp.g:4783:2: rule__TheoremBody__Group__1__Impl rule__TheoremBody__Group__2
            {
            pushFollow(FOLLOW_41);
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
    // InternalBSharp.g:4790:1: rule__TheoremBody__Group__1__Impl : ( '{' ) ;
    public final void rule__TheoremBody__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4794:1: ( ( '{' ) )
            // InternalBSharp.g:4795:1: ( '{' )
            {
            // InternalBSharp.g:4795:1: ( '{' )
            // InternalBSharp.g:4796:2: '{'
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
    // InternalBSharp.g:4805:1: rule__TheoremBody__Group__2 : rule__TheoremBody__Group__2__Impl rule__TheoremBody__Group__3 ;
    public final void rule__TheoremBody__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4809:1: ( rule__TheoremBody__Group__2__Impl rule__TheoremBody__Group__3 )
            // InternalBSharp.g:4810:2: rule__TheoremBody__Group__2__Impl rule__TheoremBody__Group__3
            {
            pushFollow(FOLLOW_42);
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
    // InternalBSharp.g:4817:1: rule__TheoremBody__Group__2__Impl : ( ( ( rule__TheoremBody__TheoremDeclAssignment_2 ) ) ( ( rule__TheoremBody__TheoremDeclAssignment_2 )* ) ) ;
    public final void rule__TheoremBody__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4821:1: ( ( ( ( rule__TheoremBody__TheoremDeclAssignment_2 ) ) ( ( rule__TheoremBody__TheoremDeclAssignment_2 )* ) ) )
            // InternalBSharp.g:4822:1: ( ( ( rule__TheoremBody__TheoremDeclAssignment_2 ) ) ( ( rule__TheoremBody__TheoremDeclAssignment_2 )* ) )
            {
            // InternalBSharp.g:4822:1: ( ( ( rule__TheoremBody__TheoremDeclAssignment_2 ) ) ( ( rule__TheoremBody__TheoremDeclAssignment_2 )* ) )
            // InternalBSharp.g:4823:2: ( ( rule__TheoremBody__TheoremDeclAssignment_2 ) ) ( ( rule__TheoremBody__TheoremDeclAssignment_2 )* )
            {
            // InternalBSharp.g:4823:2: ( ( rule__TheoremBody__TheoremDeclAssignment_2 ) )
            // InternalBSharp.g:4824:3: ( rule__TheoremBody__TheoremDeclAssignment_2 )
            {
             before(grammarAccess.getTheoremBodyAccess().getTheoremDeclAssignment_2()); 
            // InternalBSharp.g:4825:3: ( rule__TheoremBody__TheoremDeclAssignment_2 )
            // InternalBSharp.g:4825:4: rule__TheoremBody__TheoremDeclAssignment_2
            {
            pushFollow(FOLLOW_7);
            rule__TheoremBody__TheoremDeclAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTheoremBodyAccess().getTheoremDeclAssignment_2()); 

            }

            // InternalBSharp.g:4828:2: ( ( rule__TheoremBody__TheoremDeclAssignment_2 )* )
            // InternalBSharp.g:4829:3: ( rule__TheoremBody__TheoremDeclAssignment_2 )*
            {
             before(grammarAccess.getTheoremBodyAccess().getTheoremDeclAssignment_2()); 
            // InternalBSharp.g:4830:3: ( rule__TheoremBody__TheoremDeclAssignment_2 )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( ((LA47_0>=RULE_INT && LA47_0<=RULE_WS)||LA47_0==32) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalBSharp.g:4830:4: rule__TheoremBody__TheoremDeclAssignment_2
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__TheoremBody__TheoremDeclAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop47;
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
    // InternalBSharp.g:4839:1: rule__TheoremBody__Group__3 : rule__TheoremBody__Group__3__Impl ;
    public final void rule__TheoremBody__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4843:1: ( rule__TheoremBody__Group__3__Impl )
            // InternalBSharp.g:4844:2: rule__TheoremBody__Group__3__Impl
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
    // InternalBSharp.g:4850:1: rule__TheoremBody__Group__3__Impl : ( '}' ) ;
    public final void rule__TheoremBody__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4854:1: ( ( '}' ) )
            // InternalBSharp.g:4855:1: ( '}' )
            {
            // InternalBSharp.g:4855:1: ( '}' )
            // InternalBSharp.g:4856:2: '}'
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
    // InternalBSharp.g:4866:1: rule__TheoremDecl__Group__0 : rule__TheoremDecl__Group__0__Impl rule__TheoremDecl__Group__1 ;
    public final void rule__TheoremDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4870:1: ( rule__TheoremDecl__Group__0__Impl rule__TheoremDecl__Group__1 )
            // InternalBSharp.g:4871:2: rule__TheoremDecl__Group__0__Impl rule__TheoremDecl__Group__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalBSharp.g:4878:1: rule__TheoremDecl__Group__0__Impl : ( ( rule__TheoremDecl__NameAssignment_0 ) ) ;
    public final void rule__TheoremDecl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4882:1: ( ( ( rule__TheoremDecl__NameAssignment_0 ) ) )
            // InternalBSharp.g:4883:1: ( ( rule__TheoremDecl__NameAssignment_0 ) )
            {
            // InternalBSharp.g:4883:1: ( ( rule__TheoremDecl__NameAssignment_0 ) )
            // InternalBSharp.g:4884:2: ( rule__TheoremDecl__NameAssignment_0 )
            {
             before(grammarAccess.getTheoremDeclAccess().getNameAssignment_0()); 
            // InternalBSharp.g:4885:2: ( rule__TheoremDecl__NameAssignment_0 )
            // InternalBSharp.g:4885:3: rule__TheoremDecl__NameAssignment_0
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
    // InternalBSharp.g:4893:1: rule__TheoremDecl__Group__1 : rule__TheoremDecl__Group__1__Impl rule__TheoremDecl__Group__2 ;
    public final void rule__TheoremDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4897:1: ( rule__TheoremDecl__Group__1__Impl rule__TheoremDecl__Group__2 )
            // InternalBSharp.g:4898:2: rule__TheoremDecl__Group__1__Impl rule__TheoremDecl__Group__2
            {
            pushFollow(FOLLOW_24);
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
    // InternalBSharp.g:4905:1: rule__TheoremDecl__Group__1__Impl : ( ( rule__TheoremDecl__ExprAssignment_1 ) ) ;
    public final void rule__TheoremDecl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4909:1: ( ( ( rule__TheoremDecl__ExprAssignment_1 ) ) )
            // InternalBSharp.g:4910:1: ( ( rule__TheoremDecl__ExprAssignment_1 ) )
            {
            // InternalBSharp.g:4910:1: ( ( rule__TheoremDecl__ExprAssignment_1 ) )
            // InternalBSharp.g:4911:2: ( rule__TheoremDecl__ExprAssignment_1 )
            {
             before(grammarAccess.getTheoremDeclAccess().getExprAssignment_1()); 
            // InternalBSharp.g:4912:2: ( rule__TheoremDecl__ExprAssignment_1 )
            // InternalBSharp.g:4912:3: rule__TheoremDecl__ExprAssignment_1
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
    // InternalBSharp.g:4920:1: rule__TheoremDecl__Group__2 : rule__TheoremDecl__Group__2__Impl ;
    public final void rule__TheoremDecl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4924:1: ( rule__TheoremDecl__Group__2__Impl )
            // InternalBSharp.g:4925:2: rule__TheoremDecl__Group__2__Impl
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
    // InternalBSharp.g:4931:1: rule__TheoremDecl__Group__2__Impl : ( ';' ) ;
    public final void rule__TheoremDecl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4935:1: ( ( ';' ) )
            // InternalBSharp.g:4936:1: ( ';' )
            {
            // InternalBSharp.g:4936:1: ( ';' )
            // InternalBSharp.g:4937:2: ';'
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
    // InternalBSharp.g:4947:1: rule__TypedVariableList__Group__0 : rule__TypedVariableList__Group__0__Impl rule__TypedVariableList__Group__1 ;
    public final void rule__TypedVariableList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4951:1: ( rule__TypedVariableList__Group__0__Impl rule__TypedVariableList__Group__1 )
            // InternalBSharp.g:4952:2: rule__TypedVariableList__Group__0__Impl rule__TypedVariableList__Group__1
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
    // InternalBSharp.g:4959:1: rule__TypedVariableList__Group__0__Impl : ( ( rule__TypedVariableList__VariablesOfTypeAssignment_0 ) ) ;
    public final void rule__TypedVariableList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4963:1: ( ( ( rule__TypedVariableList__VariablesOfTypeAssignment_0 ) ) )
            // InternalBSharp.g:4964:1: ( ( rule__TypedVariableList__VariablesOfTypeAssignment_0 ) )
            {
            // InternalBSharp.g:4964:1: ( ( rule__TypedVariableList__VariablesOfTypeAssignment_0 ) )
            // InternalBSharp.g:4965:2: ( rule__TypedVariableList__VariablesOfTypeAssignment_0 )
            {
             before(grammarAccess.getTypedVariableListAccess().getVariablesOfTypeAssignment_0()); 
            // InternalBSharp.g:4966:2: ( rule__TypedVariableList__VariablesOfTypeAssignment_0 )
            // InternalBSharp.g:4966:3: rule__TypedVariableList__VariablesOfTypeAssignment_0
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
    // InternalBSharp.g:4974:1: rule__TypedVariableList__Group__1 : rule__TypedVariableList__Group__1__Impl ;
    public final void rule__TypedVariableList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4978:1: ( rule__TypedVariableList__Group__1__Impl )
            // InternalBSharp.g:4979:2: rule__TypedVariableList__Group__1__Impl
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
    // InternalBSharp.g:4985:1: rule__TypedVariableList__Group__1__Impl : ( ( rule__TypedVariableList__Group_1__0 )* ) ;
    public final void rule__TypedVariableList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4989:1: ( ( ( rule__TypedVariableList__Group_1__0 )* ) )
            // InternalBSharp.g:4990:1: ( ( rule__TypedVariableList__Group_1__0 )* )
            {
            // InternalBSharp.g:4990:1: ( ( rule__TypedVariableList__Group_1__0 )* )
            // InternalBSharp.g:4991:2: ( rule__TypedVariableList__Group_1__0 )*
            {
             before(grammarAccess.getTypedVariableListAccess().getGroup_1()); 
            // InternalBSharp.g:4992:2: ( rule__TypedVariableList__Group_1__0 )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==40) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalBSharp.g:4992:3: rule__TypedVariableList__Group_1__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__TypedVariableList__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop48;
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
    // InternalBSharp.g:5001:1: rule__TypedVariableList__Group_1__0 : rule__TypedVariableList__Group_1__0__Impl rule__TypedVariableList__Group_1__1 ;
    public final void rule__TypedVariableList__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5005:1: ( rule__TypedVariableList__Group_1__0__Impl rule__TypedVariableList__Group_1__1 )
            // InternalBSharp.g:5006:2: rule__TypedVariableList__Group_1__0__Impl rule__TypedVariableList__Group_1__1
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
    // InternalBSharp.g:5013:1: rule__TypedVariableList__Group_1__0__Impl : ( ',' ) ;
    public final void rule__TypedVariableList__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5017:1: ( ( ',' ) )
            // InternalBSharp.g:5018:1: ( ',' )
            {
            // InternalBSharp.g:5018:1: ( ',' )
            // InternalBSharp.g:5019:2: ','
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
    // InternalBSharp.g:5028:1: rule__TypedVariableList__Group_1__1 : rule__TypedVariableList__Group_1__1__Impl ;
    public final void rule__TypedVariableList__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5032:1: ( rule__TypedVariableList__Group_1__1__Impl )
            // InternalBSharp.g:5033:2: rule__TypedVariableList__Group_1__1__Impl
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
    // InternalBSharp.g:5039:1: rule__TypedVariableList__Group_1__1__Impl : ( ( rule__TypedVariableList__VariablesOfTypeAssignment_1_1 ) ) ;
    public final void rule__TypedVariableList__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5043:1: ( ( ( rule__TypedVariableList__VariablesOfTypeAssignment_1_1 ) ) )
            // InternalBSharp.g:5044:1: ( ( rule__TypedVariableList__VariablesOfTypeAssignment_1_1 ) )
            {
            // InternalBSharp.g:5044:1: ( ( rule__TypedVariableList__VariablesOfTypeAssignment_1_1 ) )
            // InternalBSharp.g:5045:2: ( rule__TypedVariableList__VariablesOfTypeAssignment_1_1 )
            {
             before(grammarAccess.getTypedVariableListAccess().getVariablesOfTypeAssignment_1_1()); 
            // InternalBSharp.g:5046:2: ( rule__TypedVariableList__VariablesOfTypeAssignment_1_1 )
            // InternalBSharp.g:5046:3: rule__TypedVariableList__VariablesOfTypeAssignment_1_1
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
    // InternalBSharp.g:5055:1: rule__VariableTyping__Group__0 : rule__VariableTyping__Group__0__Impl rule__VariableTyping__Group__1 ;
    public final void rule__VariableTyping__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5059:1: ( rule__VariableTyping__Group__0__Impl rule__VariableTyping__Group__1 )
            // InternalBSharp.g:5060:2: rule__VariableTyping__Group__0__Impl rule__VariableTyping__Group__1
            {
            pushFollow(FOLLOW_43);
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
    // InternalBSharp.g:5067:1: rule__VariableTyping__Group__0__Impl : ( ( rule__VariableTyping__TypeVarAssignment_0 ) ) ;
    public final void rule__VariableTyping__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5071:1: ( ( ( rule__VariableTyping__TypeVarAssignment_0 ) ) )
            // InternalBSharp.g:5072:1: ( ( rule__VariableTyping__TypeVarAssignment_0 ) )
            {
            // InternalBSharp.g:5072:1: ( ( rule__VariableTyping__TypeVarAssignment_0 ) )
            // InternalBSharp.g:5073:2: ( rule__VariableTyping__TypeVarAssignment_0 )
            {
             before(grammarAccess.getVariableTypingAccess().getTypeVarAssignment_0()); 
            // InternalBSharp.g:5074:2: ( rule__VariableTyping__TypeVarAssignment_0 )
            // InternalBSharp.g:5074:3: rule__VariableTyping__TypeVarAssignment_0
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
    // InternalBSharp.g:5082:1: rule__VariableTyping__Group__1 : rule__VariableTyping__Group__1__Impl rule__VariableTyping__Group__2 ;
    public final void rule__VariableTyping__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5086:1: ( rule__VariableTyping__Group__1__Impl rule__VariableTyping__Group__2 )
            // InternalBSharp.g:5087:2: rule__VariableTyping__Group__1__Impl rule__VariableTyping__Group__2
            {
            pushFollow(FOLLOW_43);
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
    // InternalBSharp.g:5094:1: rule__VariableTyping__Group__1__Impl : ( ( rule__VariableTyping__Group_1__0 )* ) ;
    public final void rule__VariableTyping__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5098:1: ( ( ( rule__VariableTyping__Group_1__0 )* ) )
            // InternalBSharp.g:5099:1: ( ( rule__VariableTyping__Group_1__0 )* )
            {
            // InternalBSharp.g:5099:1: ( ( rule__VariableTyping__Group_1__0 )* )
            // InternalBSharp.g:5100:2: ( rule__VariableTyping__Group_1__0 )*
            {
             before(grammarAccess.getVariableTypingAccess().getGroup_1()); 
            // InternalBSharp.g:5101:2: ( rule__VariableTyping__Group_1__0 )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==40) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalBSharp.g:5101:3: rule__VariableTyping__Group_1__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__VariableTyping__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop49;
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
    // InternalBSharp.g:5109:1: rule__VariableTyping__Group__2 : rule__VariableTyping__Group__2__Impl rule__VariableTyping__Group__3 ;
    public final void rule__VariableTyping__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5113:1: ( rule__VariableTyping__Group__2__Impl rule__VariableTyping__Group__3 )
            // InternalBSharp.g:5114:2: rule__VariableTyping__Group__2__Impl rule__VariableTyping__Group__3
            {
            pushFollow(FOLLOW_4);
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
    // InternalBSharp.g:5121:1: rule__VariableTyping__Group__2__Impl : ( ':' ) ;
    public final void rule__VariableTyping__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5125:1: ( ( ':' ) )
            // InternalBSharp.g:5126:1: ( ':' )
            {
            // InternalBSharp.g:5126:1: ( ':' )
            // InternalBSharp.g:5127:2: ':'
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
    // InternalBSharp.g:5136:1: rule__VariableTyping__Group__3 : rule__VariableTyping__Group__3__Impl ;
    public final void rule__VariableTyping__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5140:1: ( rule__VariableTyping__Group__3__Impl )
            // InternalBSharp.g:5141:2: rule__VariableTyping__Group__3__Impl
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
    // InternalBSharp.g:5147:1: rule__VariableTyping__Group__3__Impl : ( ( rule__VariableTyping__TypeAssignment_3 ) ) ;
    public final void rule__VariableTyping__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5151:1: ( ( ( rule__VariableTyping__TypeAssignment_3 ) ) )
            // InternalBSharp.g:5152:1: ( ( rule__VariableTyping__TypeAssignment_3 ) )
            {
            // InternalBSharp.g:5152:1: ( ( rule__VariableTyping__TypeAssignment_3 ) )
            // InternalBSharp.g:5153:2: ( rule__VariableTyping__TypeAssignment_3 )
            {
             before(grammarAccess.getVariableTypingAccess().getTypeAssignment_3()); 
            // InternalBSharp.g:5154:2: ( rule__VariableTyping__TypeAssignment_3 )
            // InternalBSharp.g:5154:3: rule__VariableTyping__TypeAssignment_3
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
    // InternalBSharp.g:5163:1: rule__VariableTyping__Group_1__0 : rule__VariableTyping__Group_1__0__Impl rule__VariableTyping__Group_1__1 ;
    public final void rule__VariableTyping__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5167:1: ( rule__VariableTyping__Group_1__0__Impl rule__VariableTyping__Group_1__1 )
            // InternalBSharp.g:5168:2: rule__VariableTyping__Group_1__0__Impl rule__VariableTyping__Group_1__1
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
    // InternalBSharp.g:5175:1: rule__VariableTyping__Group_1__0__Impl : ( ',' ) ;
    public final void rule__VariableTyping__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5179:1: ( ( ',' ) )
            // InternalBSharp.g:5180:1: ( ',' )
            {
            // InternalBSharp.g:5180:1: ( ',' )
            // InternalBSharp.g:5181:2: ','
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
    // InternalBSharp.g:5190:1: rule__VariableTyping__Group_1__1 : rule__VariableTyping__Group_1__1__Impl ;
    public final void rule__VariableTyping__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5194:1: ( rule__VariableTyping__Group_1__1__Impl )
            // InternalBSharp.g:5195:2: rule__VariableTyping__Group_1__1__Impl
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
    // InternalBSharp.g:5201:1: rule__VariableTyping__Group_1__1__Impl : ( ( rule__VariableTyping__TypeVarAssignment_1_1 ) ) ;
    public final void rule__VariableTyping__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5205:1: ( ( ( rule__VariableTyping__TypeVarAssignment_1_1 ) ) )
            // InternalBSharp.g:5206:1: ( ( rule__VariableTyping__TypeVarAssignment_1_1 ) )
            {
            // InternalBSharp.g:5206:1: ( ( rule__VariableTyping__TypeVarAssignment_1_1 ) )
            // InternalBSharp.g:5207:2: ( rule__VariableTyping__TypeVarAssignment_1_1 )
            {
             before(grammarAccess.getVariableTypingAccess().getTypeVarAssignment_1_1()); 
            // InternalBSharp.g:5208:2: ( rule__VariableTyping__TypeVarAssignment_1_1 )
            // InternalBSharp.g:5208:3: rule__VariableTyping__TypeVarAssignment_1_1
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
    // InternalBSharp.g:5217:1: rule__Lambda__Group__0 : rule__Lambda__Group__0__Impl rule__Lambda__Group__1 ;
    public final void rule__Lambda__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5221:1: ( rule__Lambda__Group__0__Impl rule__Lambda__Group__1 )
            // InternalBSharp.g:5222:2: rule__Lambda__Group__0__Impl rule__Lambda__Group__1
            {
            pushFollow(FOLLOW_44);
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
    // InternalBSharp.g:5229:1: rule__Lambda__Group__0__Impl : ( ( rule__Lambda__QTypeAssignment_0 ) ) ;
    public final void rule__Lambda__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5233:1: ( ( ( rule__Lambda__QTypeAssignment_0 ) ) )
            // InternalBSharp.g:5234:1: ( ( rule__Lambda__QTypeAssignment_0 ) )
            {
            // InternalBSharp.g:5234:1: ( ( rule__Lambda__QTypeAssignment_0 ) )
            // InternalBSharp.g:5235:2: ( rule__Lambda__QTypeAssignment_0 )
            {
             before(grammarAccess.getLambdaAccess().getQTypeAssignment_0()); 
            // InternalBSharp.g:5236:2: ( rule__Lambda__QTypeAssignment_0 )
            // InternalBSharp.g:5236:3: rule__Lambda__QTypeAssignment_0
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
    // InternalBSharp.g:5244:1: rule__Lambda__Group__1 : rule__Lambda__Group__1__Impl rule__Lambda__Group__2 ;
    public final void rule__Lambda__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5248:1: ( rule__Lambda__Group__1__Impl rule__Lambda__Group__2 )
            // InternalBSharp.g:5249:2: rule__Lambda__Group__1__Impl rule__Lambda__Group__2
            {
            pushFollow(FOLLOW_44);
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
    // InternalBSharp.g:5256:1: rule__Lambda__Group__1__Impl : ( ( rule__Lambda__ContextAssignment_1 )? ) ;
    public final void rule__Lambda__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5260:1: ( ( ( rule__Lambda__ContextAssignment_1 )? ) )
            // InternalBSharp.g:5261:1: ( ( rule__Lambda__ContextAssignment_1 )? )
            {
            // InternalBSharp.g:5261:1: ( ( rule__Lambda__ContextAssignment_1 )? )
            // InternalBSharp.g:5262:2: ( rule__Lambda__ContextAssignment_1 )?
            {
             before(grammarAccess.getLambdaAccess().getContextAssignment_1()); 
            // InternalBSharp.g:5263:2: ( rule__Lambda__ContextAssignment_1 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==38) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalBSharp.g:5263:3: rule__Lambda__ContextAssignment_1
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
    // InternalBSharp.g:5271:1: rule__Lambda__Group__2 : rule__Lambda__Group__2__Impl rule__Lambda__Group__3 ;
    public final void rule__Lambda__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5275:1: ( rule__Lambda__Group__2__Impl rule__Lambda__Group__3 )
            // InternalBSharp.g:5276:2: rule__Lambda__Group__2__Impl rule__Lambda__Group__3
            {
            pushFollow(FOLLOW_36);
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
    // InternalBSharp.g:5283:1: rule__Lambda__Group__2__Impl : ( ( rule__Lambda__VarListAssignment_2 ) ) ;
    public final void rule__Lambda__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5287:1: ( ( ( rule__Lambda__VarListAssignment_2 ) ) )
            // InternalBSharp.g:5288:1: ( ( rule__Lambda__VarListAssignment_2 ) )
            {
            // InternalBSharp.g:5288:1: ( ( rule__Lambda__VarListAssignment_2 ) )
            // InternalBSharp.g:5289:2: ( rule__Lambda__VarListAssignment_2 )
            {
             before(grammarAccess.getLambdaAccess().getVarListAssignment_2()); 
            // InternalBSharp.g:5290:2: ( rule__Lambda__VarListAssignment_2 )
            // InternalBSharp.g:5290:3: rule__Lambda__VarListAssignment_2
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
    // InternalBSharp.g:5298:1: rule__Lambda__Group__3 : rule__Lambda__Group__3__Impl rule__Lambda__Group__4 ;
    public final void rule__Lambda__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5302:1: ( rule__Lambda__Group__3__Impl rule__Lambda__Group__4 )
            // InternalBSharp.g:5303:2: rule__Lambda__Group__3__Impl rule__Lambda__Group__4
            {
            pushFollow(FOLLOW_26);
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
    // InternalBSharp.g:5310:1: rule__Lambda__Group__3__Impl : ( '|' ) ;
    public final void rule__Lambda__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5314:1: ( ( '|' ) )
            // InternalBSharp.g:5315:1: ( '|' )
            {
            // InternalBSharp.g:5315:1: ( '|' )
            // InternalBSharp.g:5316:2: '|'
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
    // InternalBSharp.g:5325:1: rule__Lambda__Group__4 : rule__Lambda__Group__4__Impl ;
    public final void rule__Lambda__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5329:1: ( rule__Lambda__Group__4__Impl )
            // InternalBSharp.g:5330:2: rule__Lambda__Group__4__Impl
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
    // InternalBSharp.g:5336:1: rule__Lambda__Group__4__Impl : ( ( rule__Lambda__ExprAssignment_4 ) ) ;
    public final void rule__Lambda__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5340:1: ( ( ( rule__Lambda__ExprAssignment_4 ) ) )
            // InternalBSharp.g:5341:1: ( ( rule__Lambda__ExprAssignment_4 ) )
            {
            // InternalBSharp.g:5341:1: ( ( rule__Lambda__ExprAssignment_4 ) )
            // InternalBSharp.g:5342:2: ( rule__Lambda__ExprAssignment_4 )
            {
             before(grammarAccess.getLambdaAccess().getExprAssignment_4()); 
            // InternalBSharp.g:5343:2: ( rule__Lambda__ExprAssignment_4 )
            // InternalBSharp.g:5343:3: rule__Lambda__ExprAssignment_4
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
    // InternalBSharp.g:5352:1: rule__Quantifier__Group__0 : rule__Quantifier__Group__0__Impl rule__Quantifier__Group__1 ;
    public final void rule__Quantifier__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5356:1: ( rule__Quantifier__Group__0__Impl rule__Quantifier__Group__1 )
            // InternalBSharp.g:5357:2: rule__Quantifier__Group__0__Impl rule__Quantifier__Group__1
            {
            pushFollow(FOLLOW_44);
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
    // InternalBSharp.g:5364:1: rule__Quantifier__Group__0__Impl : ( ( rule__Quantifier__QTypeAssignment_0 ) ) ;
    public final void rule__Quantifier__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5368:1: ( ( ( rule__Quantifier__QTypeAssignment_0 ) ) )
            // InternalBSharp.g:5369:1: ( ( rule__Quantifier__QTypeAssignment_0 ) )
            {
            // InternalBSharp.g:5369:1: ( ( rule__Quantifier__QTypeAssignment_0 ) )
            // InternalBSharp.g:5370:2: ( rule__Quantifier__QTypeAssignment_0 )
            {
             before(grammarAccess.getQuantifierAccess().getQTypeAssignment_0()); 
            // InternalBSharp.g:5371:2: ( rule__Quantifier__QTypeAssignment_0 )
            // InternalBSharp.g:5371:3: rule__Quantifier__QTypeAssignment_0
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
    // InternalBSharp.g:5379:1: rule__Quantifier__Group__1 : rule__Quantifier__Group__1__Impl rule__Quantifier__Group__2 ;
    public final void rule__Quantifier__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5383:1: ( rule__Quantifier__Group__1__Impl rule__Quantifier__Group__2 )
            // InternalBSharp.g:5384:2: rule__Quantifier__Group__1__Impl rule__Quantifier__Group__2
            {
            pushFollow(FOLLOW_44);
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
    // InternalBSharp.g:5391:1: rule__Quantifier__Group__1__Impl : ( ( rule__Quantifier__ContextAssignment_1 )? ) ;
    public final void rule__Quantifier__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5395:1: ( ( ( rule__Quantifier__ContextAssignment_1 )? ) )
            // InternalBSharp.g:5396:1: ( ( rule__Quantifier__ContextAssignment_1 )? )
            {
            // InternalBSharp.g:5396:1: ( ( rule__Quantifier__ContextAssignment_1 )? )
            // InternalBSharp.g:5397:2: ( rule__Quantifier__ContextAssignment_1 )?
            {
             before(grammarAccess.getQuantifierAccess().getContextAssignment_1()); 
            // InternalBSharp.g:5398:2: ( rule__Quantifier__ContextAssignment_1 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==38) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalBSharp.g:5398:3: rule__Quantifier__ContextAssignment_1
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
    // InternalBSharp.g:5406:1: rule__Quantifier__Group__2 : rule__Quantifier__Group__2__Impl rule__Quantifier__Group__3 ;
    public final void rule__Quantifier__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5410:1: ( rule__Quantifier__Group__2__Impl rule__Quantifier__Group__3 )
            // InternalBSharp.g:5411:2: rule__Quantifier__Group__2__Impl rule__Quantifier__Group__3
            {
            pushFollow(FOLLOW_45);
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
    // InternalBSharp.g:5418:1: rule__Quantifier__Group__2__Impl : ( ( rule__Quantifier__VarListAssignment_2 ) ) ;
    public final void rule__Quantifier__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5422:1: ( ( ( rule__Quantifier__VarListAssignment_2 ) ) )
            // InternalBSharp.g:5423:1: ( ( rule__Quantifier__VarListAssignment_2 ) )
            {
            // InternalBSharp.g:5423:1: ( ( rule__Quantifier__VarListAssignment_2 ) )
            // InternalBSharp.g:5424:2: ( rule__Quantifier__VarListAssignment_2 )
            {
             before(grammarAccess.getQuantifierAccess().getVarListAssignment_2()); 
            // InternalBSharp.g:5425:2: ( rule__Quantifier__VarListAssignment_2 )
            // InternalBSharp.g:5425:3: rule__Quantifier__VarListAssignment_2
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
    // InternalBSharp.g:5433:1: rule__Quantifier__Group__3 : rule__Quantifier__Group__3__Impl rule__Quantifier__Group__4 ;
    public final void rule__Quantifier__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5437:1: ( rule__Quantifier__Group__3__Impl rule__Quantifier__Group__4 )
            // InternalBSharp.g:5438:2: rule__Quantifier__Group__3__Impl rule__Quantifier__Group__4
            {
            pushFollow(FOLLOW_26);
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
    // InternalBSharp.g:5445:1: rule__Quantifier__Group__3__Impl : ( '\\u00B7' ) ;
    public final void rule__Quantifier__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5449:1: ( ( '\\u00B7' ) )
            // InternalBSharp.g:5450:1: ( '\\u00B7' )
            {
            // InternalBSharp.g:5450:1: ( '\\u00B7' )
            // InternalBSharp.g:5451:2: '\\u00B7'
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
    // InternalBSharp.g:5460:1: rule__Quantifier__Group__4 : rule__Quantifier__Group__4__Impl ;
    public final void rule__Quantifier__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5464:1: ( rule__Quantifier__Group__4__Impl )
            // InternalBSharp.g:5465:2: rule__Quantifier__Group__4__Impl
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
    // InternalBSharp.g:5471:1: rule__Quantifier__Group__4__Impl : ( ( rule__Quantifier__ExprAssignment_4 ) ) ;
    public final void rule__Quantifier__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5475:1: ( ( ( rule__Quantifier__ExprAssignment_4 ) ) )
            // InternalBSharp.g:5476:1: ( ( rule__Quantifier__ExprAssignment_4 ) )
            {
            // InternalBSharp.g:5476:1: ( ( rule__Quantifier__ExprAssignment_4 ) )
            // InternalBSharp.g:5477:2: ( rule__Quantifier__ExprAssignment_4 )
            {
             before(grammarAccess.getQuantifierAccess().getExprAssignment_4()); 
            // InternalBSharp.g:5478:2: ( rule__Quantifier__ExprAssignment_4 )
            // InternalBSharp.g:5478:3: rule__Quantifier__ExprAssignment_4
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
    // InternalBSharp.g:5487:1: rule__Prefix__Group__0 : rule__Prefix__Group__0__Impl rule__Prefix__Group__1 ;
    public final void rule__Prefix__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5491:1: ( rule__Prefix__Group__0__Impl rule__Prefix__Group__1 )
            // InternalBSharp.g:5492:2: rule__Prefix__Group__0__Impl rule__Prefix__Group__1
            {
            pushFollow(FOLLOW_46);
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
    // InternalBSharp.g:5499:1: rule__Prefix__Group__0__Impl : ( ( rule__Prefix__NameAssignment_0 ) ) ;
    public final void rule__Prefix__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5503:1: ( ( ( rule__Prefix__NameAssignment_0 ) ) )
            // InternalBSharp.g:5504:1: ( ( rule__Prefix__NameAssignment_0 ) )
            {
            // InternalBSharp.g:5504:1: ( ( rule__Prefix__NameAssignment_0 ) )
            // InternalBSharp.g:5505:2: ( rule__Prefix__NameAssignment_0 )
            {
             before(grammarAccess.getPrefixAccess().getNameAssignment_0()); 
            // InternalBSharp.g:5506:2: ( rule__Prefix__NameAssignment_0 )
            // InternalBSharp.g:5506:3: rule__Prefix__NameAssignment_0
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
    // InternalBSharp.g:5514:1: rule__Prefix__Group__1 : rule__Prefix__Group__1__Impl ;
    public final void rule__Prefix__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5518:1: ( rule__Prefix__Group__1__Impl )
            // InternalBSharp.g:5519:2: rule__Prefix__Group__1__Impl
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
    // InternalBSharp.g:5525:1: rule__Prefix__Group__1__Impl : ( ( rule__Prefix__ElemAssignment_1 ) ) ;
    public final void rule__Prefix__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5529:1: ( ( ( rule__Prefix__ElemAssignment_1 ) ) )
            // InternalBSharp.g:5530:1: ( ( rule__Prefix__ElemAssignment_1 ) )
            {
            // InternalBSharp.g:5530:1: ( ( rule__Prefix__ElemAssignment_1 ) )
            // InternalBSharp.g:5531:2: ( rule__Prefix__ElemAssignment_1 )
            {
             before(grammarAccess.getPrefixAccess().getElemAssignment_1()); 
            // InternalBSharp.g:5532:2: ( rule__Prefix__ElemAssignment_1 )
            // InternalBSharp.g:5532:3: rule__Prefix__ElemAssignment_1
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
    // InternalBSharp.g:5541:1: rule__Infix__Group__0 : rule__Infix__Group__0__Impl rule__Infix__Group__1 ;
    public final void rule__Infix__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5545:1: ( rule__Infix__Group__0__Impl rule__Infix__Group__1 )
            // InternalBSharp.g:5546:2: rule__Infix__Group__0__Impl rule__Infix__Group__1
            {
            pushFollow(FOLLOW_47);
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
    // InternalBSharp.g:5553:1: rule__Infix__Group__0__Impl : ( ruleElement ) ;
    public final void rule__Infix__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5557:1: ( ( ruleElement ) )
            // InternalBSharp.g:5558:1: ( ruleElement )
            {
            // InternalBSharp.g:5558:1: ( ruleElement )
            // InternalBSharp.g:5559:2: ruleElement
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
    // InternalBSharp.g:5568:1: rule__Infix__Group__1 : rule__Infix__Group__1__Impl ;
    public final void rule__Infix__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5572:1: ( rule__Infix__Group__1__Impl )
            // InternalBSharp.g:5573:2: rule__Infix__Group__1__Impl
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
    // InternalBSharp.g:5579:1: rule__Infix__Group__1__Impl : ( ( rule__Infix__Group_1__0 )* ) ;
    public final void rule__Infix__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5583:1: ( ( ( rule__Infix__Group_1__0 )* ) )
            // InternalBSharp.g:5584:1: ( ( rule__Infix__Group_1__0 )* )
            {
            // InternalBSharp.g:5584:1: ( ( rule__Infix__Group_1__0 )* )
            // InternalBSharp.g:5585:2: ( rule__Infix__Group_1__0 )*
            {
             before(grammarAccess.getInfixAccess().getGroup_1()); 
            // InternalBSharp.g:5586:2: ( rule__Infix__Group_1__0 )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==RULE_ID) ) {
                    int LA52_2 = input.LA(2);

                    if ( (LA52_2==41) ) {
                        int LA52_4 = input.LA(3);

                        if ( (LA52_4==RULE_ID) ) {
                            int LA52_5 = input.LA(4);

                            if ( (LA52_5==RULE_ID||(LA52_5>=25 && LA52_5<=30)||LA52_5==33||(LA52_5>=41 && LA52_5<=42)) ) {
                                alt52=1;
                            }


                        }
                        else if ( (LA52_4==11||(LA52_4>=23 && LA52_4<=24)||LA52_4==41||LA52_4==49||LA52_4==54) ) {
                            alt52=1;
                        }


                    }
                    else if ( (LA52_2==RULE_ID||LA52_2==11) ) {
                        alt52=1;
                    }


                }
                else if ( ((LA52_0>=25 && LA52_0<=30)) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // InternalBSharp.g:5586:3: rule__Infix__Group_1__0
            	    {
            	    pushFollow(FOLLOW_48);
            	    rule__Infix__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop52;
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
    // InternalBSharp.g:5595:1: rule__Infix__Group_1__0 : rule__Infix__Group_1__0__Impl rule__Infix__Group_1__1 ;
    public final void rule__Infix__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5599:1: ( rule__Infix__Group_1__0__Impl rule__Infix__Group_1__1 )
            // InternalBSharp.g:5600:2: rule__Infix__Group_1__0__Impl rule__Infix__Group_1__1
            {
            pushFollow(FOLLOW_47);
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
    // InternalBSharp.g:5607:1: rule__Infix__Group_1__0__Impl : ( () ) ;
    public final void rule__Infix__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5611:1: ( ( () ) )
            // InternalBSharp.g:5612:1: ( () )
            {
            // InternalBSharp.g:5612:1: ( () )
            // InternalBSharp.g:5613:2: ()
            {
             before(grammarAccess.getInfixAccess().getInfixLeftAction_1_0()); 
            // InternalBSharp.g:5614:2: ()
            // InternalBSharp.g:5614:3: 
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
    // InternalBSharp.g:5622:1: rule__Infix__Group_1__1 : rule__Infix__Group_1__1__Impl rule__Infix__Group_1__2 ;
    public final void rule__Infix__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5626:1: ( rule__Infix__Group_1__1__Impl rule__Infix__Group_1__2 )
            // InternalBSharp.g:5627:2: rule__Infix__Group_1__1__Impl rule__Infix__Group_1__2
            {
            pushFollow(FOLLOW_46);
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
    // InternalBSharp.g:5634:1: rule__Infix__Group_1__1__Impl : ( ( rule__Infix__Alternatives_1_1 ) ) ;
    public final void rule__Infix__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5638:1: ( ( ( rule__Infix__Alternatives_1_1 ) ) )
            // InternalBSharp.g:5639:1: ( ( rule__Infix__Alternatives_1_1 ) )
            {
            // InternalBSharp.g:5639:1: ( ( rule__Infix__Alternatives_1_1 ) )
            // InternalBSharp.g:5640:2: ( rule__Infix__Alternatives_1_1 )
            {
             before(grammarAccess.getInfixAccess().getAlternatives_1_1()); 
            // InternalBSharp.g:5641:2: ( rule__Infix__Alternatives_1_1 )
            // InternalBSharp.g:5641:3: rule__Infix__Alternatives_1_1
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
    // InternalBSharp.g:5649:1: rule__Infix__Group_1__2 : rule__Infix__Group_1__2__Impl ;
    public final void rule__Infix__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5653:1: ( rule__Infix__Group_1__2__Impl )
            // InternalBSharp.g:5654:2: rule__Infix__Group_1__2__Impl
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
    // InternalBSharp.g:5660:1: rule__Infix__Group_1__2__Impl : ( ( rule__Infix__RightAssignment_1_2 ) ) ;
    public final void rule__Infix__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5664:1: ( ( ( rule__Infix__RightAssignment_1_2 ) ) )
            // InternalBSharp.g:5665:1: ( ( rule__Infix__RightAssignment_1_2 ) )
            {
            // InternalBSharp.g:5665:1: ( ( rule__Infix__RightAssignment_1_2 ) )
            // InternalBSharp.g:5666:2: ( rule__Infix__RightAssignment_1_2 )
            {
             before(grammarAccess.getInfixAccess().getRightAssignment_1_2()); 
            // InternalBSharp.g:5667:2: ( rule__Infix__RightAssignment_1_2 )
            // InternalBSharp.g:5667:3: rule__Infix__RightAssignment_1_2
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
    // InternalBSharp.g:5676:1: rule__Bracket__Group__0 : rule__Bracket__Group__0__Impl rule__Bracket__Group__1 ;
    public final void rule__Bracket__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5680:1: ( rule__Bracket__Group__0__Impl rule__Bracket__Group__1 )
            // InternalBSharp.g:5681:2: rule__Bracket__Group__0__Impl rule__Bracket__Group__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalBSharp.g:5688:1: rule__Bracket__Group__0__Impl : ( '(' ) ;
    public final void rule__Bracket__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5692:1: ( ( '(' ) )
            // InternalBSharp.g:5693:1: ( '(' )
            {
            // InternalBSharp.g:5693:1: ( '(' )
            // InternalBSharp.g:5694:2: '('
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
    // InternalBSharp.g:5703:1: rule__Bracket__Group__1 : rule__Bracket__Group__1__Impl rule__Bracket__Group__2 ;
    public final void rule__Bracket__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5707:1: ( rule__Bracket__Group__1__Impl rule__Bracket__Group__2 )
            // InternalBSharp.g:5708:2: rule__Bracket__Group__1__Impl rule__Bracket__Group__2
            {
            pushFollow(FOLLOW_22);
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
    // InternalBSharp.g:5715:1: rule__Bracket__Group__1__Impl : ( ( rule__Bracket__ChildAssignment_1 ) ) ;
    public final void rule__Bracket__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5719:1: ( ( ( rule__Bracket__ChildAssignment_1 ) ) )
            // InternalBSharp.g:5720:1: ( ( rule__Bracket__ChildAssignment_1 ) )
            {
            // InternalBSharp.g:5720:1: ( ( rule__Bracket__ChildAssignment_1 ) )
            // InternalBSharp.g:5721:2: ( rule__Bracket__ChildAssignment_1 )
            {
             before(grammarAccess.getBracketAccess().getChildAssignment_1()); 
            // InternalBSharp.g:5722:2: ( rule__Bracket__ChildAssignment_1 )
            // InternalBSharp.g:5722:3: rule__Bracket__ChildAssignment_1
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
    // InternalBSharp.g:5730:1: rule__Bracket__Group__2 : rule__Bracket__Group__2__Impl ;
    public final void rule__Bracket__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5734:1: ( rule__Bracket__Group__2__Impl )
            // InternalBSharp.g:5735:2: rule__Bracket__Group__2__Impl
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
    // InternalBSharp.g:5741:1: rule__Bracket__Group__2__Impl : ( ')' ) ;
    public final void rule__Bracket__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5745:1: ( ( ')' ) )
            // InternalBSharp.g:5746:1: ( ')' )
            {
            // InternalBSharp.g:5746:1: ( ')' )
            // InternalBSharp.g:5747:2: ')'
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
    // InternalBSharp.g:5757:1: rule__FunctionCall__Group__0 : rule__FunctionCall__Group__0__Impl rule__FunctionCall__Group__1 ;
    public final void rule__FunctionCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5761:1: ( rule__FunctionCall__Group__0__Impl rule__FunctionCall__Group__1 )
            // InternalBSharp.g:5762:2: rule__FunctionCall__Group__0__Impl rule__FunctionCall__Group__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalBSharp.g:5769:1: rule__FunctionCall__Group__0__Impl : ( ( rule__FunctionCall__Alternatives_0 ) ) ;
    public final void rule__FunctionCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5773:1: ( ( ( rule__FunctionCall__Alternatives_0 ) ) )
            // InternalBSharp.g:5774:1: ( ( rule__FunctionCall__Alternatives_0 ) )
            {
            // InternalBSharp.g:5774:1: ( ( rule__FunctionCall__Alternatives_0 ) )
            // InternalBSharp.g:5775:2: ( rule__FunctionCall__Alternatives_0 )
            {
             before(grammarAccess.getFunctionCallAccess().getAlternatives_0()); 
            // InternalBSharp.g:5776:2: ( rule__FunctionCall__Alternatives_0 )
            // InternalBSharp.g:5776:3: rule__FunctionCall__Alternatives_0
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
    // InternalBSharp.g:5784:1: rule__FunctionCall__Group__1 : rule__FunctionCall__Group__1__Impl ;
    public final void rule__FunctionCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5788:1: ( rule__FunctionCall__Group__1__Impl )
            // InternalBSharp.g:5789:2: rule__FunctionCall__Group__1__Impl
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
    // InternalBSharp.g:5795:1: rule__FunctionCall__Group__1__Impl : ( ( rule__FunctionCall__Group_1__0 )? ) ;
    public final void rule__FunctionCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5799:1: ( ( ( rule__FunctionCall__Group_1__0 )? ) )
            // InternalBSharp.g:5800:1: ( ( rule__FunctionCall__Group_1__0 )? )
            {
            // InternalBSharp.g:5800:1: ( ( rule__FunctionCall__Group_1__0 )? )
            // InternalBSharp.g:5801:2: ( rule__FunctionCall__Group_1__0 )?
            {
             before(grammarAccess.getFunctionCallAccess().getGroup_1()); 
            // InternalBSharp.g:5802:2: ( rule__FunctionCall__Group_1__0 )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==41) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalBSharp.g:5802:3: rule__FunctionCall__Group_1__0
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
    // InternalBSharp.g:5811:1: rule__FunctionCall__Group_1__0 : rule__FunctionCall__Group_1__0__Impl rule__FunctionCall__Group_1__1 ;
    public final void rule__FunctionCall__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5815:1: ( rule__FunctionCall__Group_1__0__Impl rule__FunctionCall__Group_1__1 )
            // InternalBSharp.g:5816:2: rule__FunctionCall__Group_1__0__Impl rule__FunctionCall__Group_1__1
            {
            pushFollow(FOLLOW_49);
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
    // InternalBSharp.g:5823:1: rule__FunctionCall__Group_1__0__Impl : ( '(' ) ;
    public final void rule__FunctionCall__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5827:1: ( ( '(' ) )
            // InternalBSharp.g:5828:1: ( '(' )
            {
            // InternalBSharp.g:5828:1: ( '(' )
            // InternalBSharp.g:5829:2: '('
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
    // InternalBSharp.g:5838:1: rule__FunctionCall__Group_1__1 : rule__FunctionCall__Group_1__1__Impl rule__FunctionCall__Group_1__2 ;
    public final void rule__FunctionCall__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5842:1: ( rule__FunctionCall__Group_1__1__Impl rule__FunctionCall__Group_1__2 )
            // InternalBSharp.g:5843:2: rule__FunctionCall__Group_1__1__Impl rule__FunctionCall__Group_1__2
            {
            pushFollow(FOLLOW_49);
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
    // InternalBSharp.g:5850:1: rule__FunctionCall__Group_1__1__Impl : ( ( rule__FunctionCall__ArgumentsAssignment_1_1 )? ) ;
    public final void rule__FunctionCall__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5854:1: ( ( ( rule__FunctionCall__ArgumentsAssignment_1_1 )? ) )
            // InternalBSharp.g:5855:1: ( ( rule__FunctionCall__ArgumentsAssignment_1_1 )? )
            {
            // InternalBSharp.g:5855:1: ( ( rule__FunctionCall__ArgumentsAssignment_1_1 )? )
            // InternalBSharp.g:5856:2: ( rule__FunctionCall__ArgumentsAssignment_1_1 )?
            {
             before(grammarAccess.getFunctionCallAccess().getArgumentsAssignment_1_1()); 
            // InternalBSharp.g:5857:2: ( rule__FunctionCall__ArgumentsAssignment_1_1 )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==RULE_ID||LA54_0==11||(LA54_0>=23 && LA54_0<=24)||LA54_0==41||LA54_0==49||LA54_0==54) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalBSharp.g:5857:3: rule__FunctionCall__ArgumentsAssignment_1_1
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
    // InternalBSharp.g:5865:1: rule__FunctionCall__Group_1__2 : rule__FunctionCall__Group_1__2__Impl rule__FunctionCall__Group_1__3 ;
    public final void rule__FunctionCall__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5869:1: ( rule__FunctionCall__Group_1__2__Impl rule__FunctionCall__Group_1__3 )
            // InternalBSharp.g:5870:2: rule__FunctionCall__Group_1__2__Impl rule__FunctionCall__Group_1__3
            {
            pushFollow(FOLLOW_49);
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
    // InternalBSharp.g:5877:1: rule__FunctionCall__Group_1__2__Impl : ( ( rule__FunctionCall__Group_1_2__0 )* ) ;
    public final void rule__FunctionCall__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5881:1: ( ( ( rule__FunctionCall__Group_1_2__0 )* ) )
            // InternalBSharp.g:5882:1: ( ( rule__FunctionCall__Group_1_2__0 )* )
            {
            // InternalBSharp.g:5882:1: ( ( rule__FunctionCall__Group_1_2__0 )* )
            // InternalBSharp.g:5883:2: ( rule__FunctionCall__Group_1_2__0 )*
            {
             before(grammarAccess.getFunctionCallAccess().getGroup_1_2()); 
            // InternalBSharp.g:5884:2: ( rule__FunctionCall__Group_1_2__0 )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==40) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // InternalBSharp.g:5884:3: rule__FunctionCall__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__FunctionCall__Group_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop55;
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
    // InternalBSharp.g:5892:1: rule__FunctionCall__Group_1__3 : rule__FunctionCall__Group_1__3__Impl ;
    public final void rule__FunctionCall__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5896:1: ( rule__FunctionCall__Group_1__3__Impl )
            // InternalBSharp.g:5897:2: rule__FunctionCall__Group_1__3__Impl
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
    // InternalBSharp.g:5903:1: rule__FunctionCall__Group_1__3__Impl : ( ')' ) ;
    public final void rule__FunctionCall__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5907:1: ( ( ')' ) )
            // InternalBSharp.g:5908:1: ( ')' )
            {
            // InternalBSharp.g:5908:1: ( ')' )
            // InternalBSharp.g:5909:2: ')'
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
    // InternalBSharp.g:5919:1: rule__FunctionCall__Group_1_2__0 : rule__FunctionCall__Group_1_2__0__Impl rule__FunctionCall__Group_1_2__1 ;
    public final void rule__FunctionCall__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5923:1: ( rule__FunctionCall__Group_1_2__0__Impl rule__FunctionCall__Group_1_2__1 )
            // InternalBSharp.g:5924:2: rule__FunctionCall__Group_1_2__0__Impl rule__FunctionCall__Group_1_2__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalBSharp.g:5931:1: rule__FunctionCall__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__FunctionCall__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5935:1: ( ( ',' ) )
            // InternalBSharp.g:5936:1: ( ',' )
            {
            // InternalBSharp.g:5936:1: ( ',' )
            // InternalBSharp.g:5937:2: ','
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
    // InternalBSharp.g:5946:1: rule__FunctionCall__Group_1_2__1 : rule__FunctionCall__Group_1_2__1__Impl ;
    public final void rule__FunctionCall__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5950:1: ( rule__FunctionCall__Group_1_2__1__Impl )
            // InternalBSharp.g:5951:2: rule__FunctionCall__Group_1_2__1__Impl
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
    // InternalBSharp.g:5957:1: rule__FunctionCall__Group_1_2__1__Impl : ( ( rule__FunctionCall__ArgumentsAssignment_1_2_1 ) ) ;
    public final void rule__FunctionCall__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5961:1: ( ( ( rule__FunctionCall__ArgumentsAssignment_1_2_1 ) ) )
            // InternalBSharp.g:5962:1: ( ( rule__FunctionCall__ArgumentsAssignment_1_2_1 ) )
            {
            // InternalBSharp.g:5962:1: ( ( rule__FunctionCall__ArgumentsAssignment_1_2_1 ) )
            // InternalBSharp.g:5963:2: ( rule__FunctionCall__ArgumentsAssignment_1_2_1 )
            {
             before(grammarAccess.getFunctionCallAccess().getArgumentsAssignment_1_2_1()); 
            // InternalBSharp.g:5964:2: ( rule__FunctionCall__ArgumentsAssignment_1_2_1 )
            // InternalBSharp.g:5964:3: rule__FunctionCall__ArgumentsAssignment_1_2_1
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
    // InternalBSharp.g:5973:1: rule__ClassVarDecl__Group__0 : rule__ClassVarDecl__Group__0__Impl rule__ClassVarDecl__Group__1 ;
    public final void rule__ClassVarDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5977:1: ( rule__ClassVarDecl__Group__0__Impl rule__ClassVarDecl__Group__1 )
            // InternalBSharp.g:5978:2: rule__ClassVarDecl__Group__0__Impl rule__ClassVarDecl__Group__1
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
    // InternalBSharp.g:5985:1: rule__ClassVarDecl__Group__0__Impl : ( ( rule__ClassVarDecl__OwnerTypeAssignment_0 ) ) ;
    public final void rule__ClassVarDecl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5989:1: ( ( ( rule__ClassVarDecl__OwnerTypeAssignment_0 ) ) )
            // InternalBSharp.g:5990:1: ( ( rule__ClassVarDecl__OwnerTypeAssignment_0 ) )
            {
            // InternalBSharp.g:5990:1: ( ( rule__ClassVarDecl__OwnerTypeAssignment_0 ) )
            // InternalBSharp.g:5991:2: ( rule__ClassVarDecl__OwnerTypeAssignment_0 )
            {
             before(grammarAccess.getClassVarDeclAccess().getOwnerTypeAssignment_0()); 
            // InternalBSharp.g:5992:2: ( rule__ClassVarDecl__OwnerTypeAssignment_0 )
            // InternalBSharp.g:5992:3: rule__ClassVarDecl__OwnerTypeAssignment_0
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
    // InternalBSharp.g:6000:1: rule__ClassVarDecl__Group__1 : rule__ClassVarDecl__Group__1__Impl rule__ClassVarDecl__Group__2 ;
    public final void rule__ClassVarDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6004:1: ( rule__ClassVarDecl__Group__1__Impl rule__ClassVarDecl__Group__2 )
            // InternalBSharp.g:6005:2: rule__ClassVarDecl__Group__1__Impl rule__ClassVarDecl__Group__2
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
    // InternalBSharp.g:6012:1: rule__ClassVarDecl__Group__1__Impl : ( '.' ) ;
    public final void rule__ClassVarDecl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6016:1: ( ( '.' ) )
            // InternalBSharp.g:6017:1: ( '.' )
            {
            // InternalBSharp.g:6017:1: ( '.' )
            // InternalBSharp.g:6018:2: '.'
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
    // InternalBSharp.g:6027:1: rule__ClassVarDecl__Group__2 : rule__ClassVarDecl__Group__2__Impl ;
    public final void rule__ClassVarDecl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6031:1: ( rule__ClassVarDecl__Group__2__Impl )
            // InternalBSharp.g:6032:2: rule__ClassVarDecl__Group__2__Impl
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
    // InternalBSharp.g:6038:1: rule__ClassVarDecl__Group__2__Impl : ( ( rule__ClassVarDecl__TypeInstAssignment_2 ) ) ;
    public final void rule__ClassVarDecl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6042:1: ( ( ( rule__ClassVarDecl__TypeInstAssignment_2 ) ) )
            // InternalBSharp.g:6043:1: ( ( rule__ClassVarDecl__TypeInstAssignment_2 ) )
            {
            // InternalBSharp.g:6043:1: ( ( rule__ClassVarDecl__TypeInstAssignment_2 ) )
            // InternalBSharp.g:6044:2: ( rule__ClassVarDecl__TypeInstAssignment_2 )
            {
             before(grammarAccess.getClassVarDeclAccess().getTypeInstAssignment_2()); 
            // InternalBSharp.g:6045:2: ( rule__ClassVarDecl__TypeInstAssignment_2 )
            // InternalBSharp.g:6045:3: rule__ClassVarDecl__TypeInstAssignment_2
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
    // InternalBSharp.g:6054:1: rule__Instance__Group__0 : rule__Instance__Group__0__Impl rule__Instance__Group__1 ;
    public final void rule__Instance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6058:1: ( rule__Instance__Group__0__Impl rule__Instance__Group__1 )
            // InternalBSharp.g:6059:2: rule__Instance__Group__0__Impl rule__Instance__Group__1
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
    // InternalBSharp.g:6066:1: rule__Instance__Group__0__Impl : ( 'Instance' ) ;
    public final void rule__Instance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6070:1: ( ( 'Instance' ) )
            // InternalBSharp.g:6071:1: ( 'Instance' )
            {
            // InternalBSharp.g:6071:1: ( 'Instance' )
            // InternalBSharp.g:6072:2: 'Instance'
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
    // InternalBSharp.g:6081:1: rule__Instance__Group__1 : rule__Instance__Group__1__Impl rule__Instance__Group__2 ;
    public final void rule__Instance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6085:1: ( rule__Instance__Group__1__Impl rule__Instance__Group__2 )
            // InternalBSharp.g:6086:2: rule__Instance__Group__1__Impl rule__Instance__Group__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalBSharp.g:6093:1: rule__Instance__Group__1__Impl : ( ( rule__Instance__ClassNameAssignment_1 ) ) ;
    public final void rule__Instance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6097:1: ( ( ( rule__Instance__ClassNameAssignment_1 ) ) )
            // InternalBSharp.g:6098:1: ( ( rule__Instance__ClassNameAssignment_1 ) )
            {
            // InternalBSharp.g:6098:1: ( ( rule__Instance__ClassNameAssignment_1 ) )
            // InternalBSharp.g:6099:2: ( rule__Instance__ClassNameAssignment_1 )
            {
             before(grammarAccess.getInstanceAccess().getClassNameAssignment_1()); 
            // InternalBSharp.g:6100:2: ( rule__Instance__ClassNameAssignment_1 )
            // InternalBSharp.g:6100:3: rule__Instance__ClassNameAssignment_1
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
    // InternalBSharp.g:6108:1: rule__Instance__Group__2 : rule__Instance__Group__2__Impl rule__Instance__Group__3 ;
    public final void rule__Instance__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6112:1: ( rule__Instance__Group__2__Impl rule__Instance__Group__3 )
            // InternalBSharp.g:6113:2: rule__Instance__Group__2__Impl rule__Instance__Group__3
            {
            pushFollow(FOLLOW_29);
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
    // InternalBSharp.g:6120:1: rule__Instance__Group__2__Impl : ( ( rule__Instance__ContextAssignment_2 ) ) ;
    public final void rule__Instance__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6124:1: ( ( ( rule__Instance__ContextAssignment_2 ) ) )
            // InternalBSharp.g:6125:1: ( ( rule__Instance__ContextAssignment_2 ) )
            {
            // InternalBSharp.g:6125:1: ( ( rule__Instance__ContextAssignment_2 ) )
            // InternalBSharp.g:6126:2: ( rule__Instance__ContextAssignment_2 )
            {
             before(grammarAccess.getInstanceAccess().getContextAssignment_2()); 
            // InternalBSharp.g:6127:2: ( rule__Instance__ContextAssignment_2 )
            // InternalBSharp.g:6127:3: rule__Instance__ContextAssignment_2
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
    // InternalBSharp.g:6135:1: rule__Instance__Group__3 : rule__Instance__Group__3__Impl rule__Instance__Group__4 ;
    public final void rule__Instance__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6139:1: ( rule__Instance__Group__3__Impl rule__Instance__Group__4 )
            // InternalBSharp.g:6140:2: rule__Instance__Group__3__Impl rule__Instance__Group__4
            {
            pushFollow(FOLLOW_49);
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
    // InternalBSharp.g:6147:1: rule__Instance__Group__3__Impl : ( '(' ) ;
    public final void rule__Instance__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6151:1: ( ( '(' ) )
            // InternalBSharp.g:6152:1: ( '(' )
            {
            // InternalBSharp.g:6152:1: ( '(' )
            // InternalBSharp.g:6153:2: '('
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
    // InternalBSharp.g:6162:1: rule__Instance__Group__4 : rule__Instance__Group__4__Impl rule__Instance__Group__5 ;
    public final void rule__Instance__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6166:1: ( rule__Instance__Group__4__Impl rule__Instance__Group__5 )
            // InternalBSharp.g:6167:2: rule__Instance__Group__4__Impl rule__Instance__Group__5
            {
            pushFollow(FOLLOW_49);
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
    // InternalBSharp.g:6174:1: rule__Instance__Group__4__Impl : ( ( rule__Instance__ArgumentsAssignment_4 )? ) ;
    public final void rule__Instance__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6178:1: ( ( ( rule__Instance__ArgumentsAssignment_4 )? ) )
            // InternalBSharp.g:6179:1: ( ( rule__Instance__ArgumentsAssignment_4 )? )
            {
            // InternalBSharp.g:6179:1: ( ( rule__Instance__ArgumentsAssignment_4 )? )
            // InternalBSharp.g:6180:2: ( rule__Instance__ArgumentsAssignment_4 )?
            {
             before(grammarAccess.getInstanceAccess().getArgumentsAssignment_4()); 
            // InternalBSharp.g:6181:2: ( rule__Instance__ArgumentsAssignment_4 )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==RULE_ID||LA56_0==11||(LA56_0>=23 && LA56_0<=24)||LA56_0==41||LA56_0==49||LA56_0==54) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalBSharp.g:6181:3: rule__Instance__ArgumentsAssignment_4
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
    // InternalBSharp.g:6189:1: rule__Instance__Group__5 : rule__Instance__Group__5__Impl rule__Instance__Group__6 ;
    public final void rule__Instance__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6193:1: ( rule__Instance__Group__5__Impl rule__Instance__Group__6 )
            // InternalBSharp.g:6194:2: rule__Instance__Group__5__Impl rule__Instance__Group__6
            {
            pushFollow(FOLLOW_49);
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
    // InternalBSharp.g:6201:1: rule__Instance__Group__5__Impl : ( ( rule__Instance__Group_5__0 )* ) ;
    public final void rule__Instance__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6205:1: ( ( ( rule__Instance__Group_5__0 )* ) )
            // InternalBSharp.g:6206:1: ( ( rule__Instance__Group_5__0 )* )
            {
            // InternalBSharp.g:6206:1: ( ( rule__Instance__Group_5__0 )* )
            // InternalBSharp.g:6207:2: ( rule__Instance__Group_5__0 )*
            {
             before(grammarAccess.getInstanceAccess().getGroup_5()); 
            // InternalBSharp.g:6208:2: ( rule__Instance__Group_5__0 )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==40) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // InternalBSharp.g:6208:3: rule__Instance__Group_5__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__Instance__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop57;
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
    // InternalBSharp.g:6216:1: rule__Instance__Group__6 : rule__Instance__Group__6__Impl ;
    public final void rule__Instance__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6220:1: ( rule__Instance__Group__6__Impl )
            // InternalBSharp.g:6221:2: rule__Instance__Group__6__Impl
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
    // InternalBSharp.g:6227:1: rule__Instance__Group__6__Impl : ( ')' ) ;
    public final void rule__Instance__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6231:1: ( ( ')' ) )
            // InternalBSharp.g:6232:1: ( ')' )
            {
            // InternalBSharp.g:6232:1: ( ')' )
            // InternalBSharp.g:6233:2: ')'
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
    // InternalBSharp.g:6243:1: rule__Instance__Group_5__0 : rule__Instance__Group_5__0__Impl rule__Instance__Group_5__1 ;
    public final void rule__Instance__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6247:1: ( rule__Instance__Group_5__0__Impl rule__Instance__Group_5__1 )
            // InternalBSharp.g:6248:2: rule__Instance__Group_5__0__Impl rule__Instance__Group_5__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalBSharp.g:6255:1: rule__Instance__Group_5__0__Impl : ( ',' ) ;
    public final void rule__Instance__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6259:1: ( ( ',' ) )
            // InternalBSharp.g:6260:1: ( ',' )
            {
            // InternalBSharp.g:6260:1: ( ',' )
            // InternalBSharp.g:6261:2: ','
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
    // InternalBSharp.g:6270:1: rule__Instance__Group_5__1 : rule__Instance__Group_5__1__Impl ;
    public final void rule__Instance__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6274:1: ( rule__Instance__Group_5__1__Impl )
            // InternalBSharp.g:6275:2: rule__Instance__Group_5__1__Impl
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
    // InternalBSharp.g:6281:1: rule__Instance__Group_5__1__Impl : ( ( rule__Instance__ArgumentsAssignment_5_1 ) ) ;
    public final void rule__Instance__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6285:1: ( ( ( rule__Instance__ArgumentsAssignment_5_1 ) ) )
            // InternalBSharp.g:6286:1: ( ( rule__Instance__ArgumentsAssignment_5_1 ) )
            {
            // InternalBSharp.g:6286:1: ( ( rule__Instance__ArgumentsAssignment_5_1 ) )
            // InternalBSharp.g:6287:2: ( rule__Instance__ArgumentsAssignment_5_1 )
            {
             before(grammarAccess.getInstanceAccess().getArgumentsAssignment_5_1()); 
            // InternalBSharp.g:6288:2: ( rule__Instance__ArgumentsAssignment_5_1 )
            // InternalBSharp.g:6288:3: rule__Instance__ArgumentsAssignment_5_1
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
    // InternalBSharp.g:6297:1: rule__TopLevel__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__TopLevel__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6301:1: ( ( ruleQualifiedName ) )
            // InternalBSharp.g:6302:2: ( ruleQualifiedName )
            {
            // InternalBSharp.g:6302:2: ( ruleQualifiedName )
            // InternalBSharp.g:6303:3: ruleQualifiedName
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
    // InternalBSharp.g:6312:1: rule__TopLevel__TopLevelFileAssignment_2 : ( ruleTopLevelFile ) ;
    public final void rule__TopLevel__TopLevelFileAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6316:1: ( ( ruleTopLevelFile ) )
            // InternalBSharp.g:6317:2: ( ruleTopLevelFile )
            {
            // InternalBSharp.g:6317:2: ( ruleTopLevelFile )
            // InternalBSharp.g:6318:3: ruleTopLevelFile
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
    // InternalBSharp.g:6327:1: rule__TopLevelFile__NoImportElementsAssignment_1 : ( ruleBodyElements ) ;
    public final void rule__TopLevelFile__NoImportElementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6331:1: ( ( ruleBodyElements ) )
            // InternalBSharp.g:6332:2: ( ruleBodyElements )
            {
            // InternalBSharp.g:6332:2: ( ruleBodyElements )
            // InternalBSharp.g:6333:3: ruleBodyElements
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
    // InternalBSharp.g:6342:1: rule__TopLevelFile__TopLevelImportsAssignment_2 : ( ruleTopLevelImport ) ;
    public final void rule__TopLevelFile__TopLevelImportsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6346:1: ( ( ruleTopLevelImport ) )
            // InternalBSharp.g:6347:2: ( ruleTopLevelImport )
            {
            // InternalBSharp.g:6347:2: ( ruleTopLevelImport )
            // InternalBSharp.g:6348:3: ruleTopLevelImport
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
    // InternalBSharp.g:6357:1: rule__TopLevelImport__GlobalImportsAssignment_0_0 : ( ruleGlobalImport ) ;
    public final void rule__TopLevelImport__GlobalImportsAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6361:1: ( ( ruleGlobalImport ) )
            // InternalBSharp.g:6362:2: ( ruleGlobalImport )
            {
            // InternalBSharp.g:6362:2: ( ruleGlobalImport )
            // InternalBSharp.g:6363:3: ruleGlobalImport
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
    // InternalBSharp.g:6372:1: rule__TopLevelImport__LocalImportsAssignment_0_1 : ( ruleLocalImport ) ;
    public final void rule__TopLevelImport__LocalImportsAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6376:1: ( ( ruleLocalImport ) )
            // InternalBSharp.g:6377:2: ( ruleLocalImport )
            {
            // InternalBSharp.g:6377:2: ( ruleLocalImport )
            // InternalBSharp.g:6378:3: ruleLocalImport
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
    // InternalBSharp.g:6387:1: rule__TopLevelImport__BodyElementsAssignment_1 : ( ruleBodyElements ) ;
    public final void rule__TopLevelImport__BodyElementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6391:1: ( ( ruleBodyElements ) )
            // InternalBSharp.g:6392:2: ( ruleBodyElements )
            {
            // InternalBSharp.g:6392:2: ( ruleBodyElements )
            // InternalBSharp.g:6393:3: ruleBodyElements
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
    // InternalBSharp.g:6402:1: rule__BodyElements__ClassesAssignment_0 : ( ruleClassDecl ) ;
    public final void rule__BodyElements__ClassesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6406:1: ( ( ruleClassDecl ) )
            // InternalBSharp.g:6407:2: ( ruleClassDecl )
            {
            // InternalBSharp.g:6407:2: ( ruleClassDecl )
            // InternalBSharp.g:6408:3: ruleClassDecl
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
    // InternalBSharp.g:6417:1: rule__BodyElements__ExtendsAssignment_1 : ( ruleExtend ) ;
    public final void rule__BodyElements__ExtendsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6421:1: ( ( ruleExtend ) )
            // InternalBSharp.g:6422:2: ( ruleExtend )
            {
            // InternalBSharp.g:6422:2: ( ruleExtend )
            // InternalBSharp.g:6423:3: ruleExtend
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
    // InternalBSharp.g:6432:1: rule__BodyElements__InstancesAssignment_2 : ( ruleInstance ) ;
    public final void rule__BodyElements__InstancesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6436:1: ( ( ruleInstance ) )
            // InternalBSharp.g:6437:2: ( ruleInstance )
            {
            // InternalBSharp.g:6437:2: ( ruleInstance )
            // InternalBSharp.g:6438:3: ruleInstance
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
    // InternalBSharp.g:6447:1: rule__GlobalImport__ProjectAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__GlobalImport__ProjectAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6451:1: ( ( ruleQualifiedName ) )
            // InternalBSharp.g:6452:2: ( ruleQualifiedName )
            {
            // InternalBSharp.g:6452:2: ( ruleQualifiedName )
            // InternalBSharp.g:6453:3: ruleQualifiedName
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
    // InternalBSharp.g:6462:1: rule__GlobalImport__FileImportsAssignment_3 : ( ruleFileImport ) ;
    public final void rule__GlobalImport__FileImportsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6466:1: ( ( ruleFileImport ) )
            // InternalBSharp.g:6467:2: ( ruleFileImport )
            {
            // InternalBSharp.g:6467:2: ( ruleFileImport )
            // InternalBSharp.g:6468:3: ruleFileImport
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
    // InternalBSharp.g:6477:1: rule__FileImport__FileNameAssignment_0 : ( RULE_ID ) ;
    public final void rule__FileImport__FileNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6481:1: ( ( RULE_ID ) )
            // InternalBSharp.g:6482:2: ( RULE_ID )
            {
            // InternalBSharp.g:6482:2: ( RULE_ID )
            // InternalBSharp.g:6483:3: RULE_ID
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
    // InternalBSharp.g:6492:1: rule__FileImport__TypeAssignment_1_1_1 : ( RULE_ID ) ;
    public final void rule__FileImport__TypeAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6496:1: ( ( RULE_ID ) )
            // InternalBSharp.g:6497:2: ( RULE_ID )
            {
            // InternalBSharp.g:6497:2: ( RULE_ID )
            // InternalBSharp.g:6498:3: RULE_ID
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
    // InternalBSharp.g:6507:1: rule__LocalImport__FileImportsAssignment_1 : ( ruleFileImport ) ;
    public final void rule__LocalImport__FileImportsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6511:1: ( ( ruleFileImport ) )
            // InternalBSharp.g:6512:2: ( ruleFileImport )
            {
            // InternalBSharp.g:6512:2: ( ruleFileImport )
            // InternalBSharp.g:6513:3: ruleFileImport
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
    // InternalBSharp.g:6522:1: rule__Class__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Class__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6526:1: ( ( RULE_ID ) )
            // InternalBSharp.g:6527:2: ( RULE_ID )
            {
            // InternalBSharp.g:6527:2: ( RULE_ID )
            // InternalBSharp.g:6528:3: RULE_ID
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
    // InternalBSharp.g:6537:1: rule__Class__ContextAssignment_2 : ( rulePolyContext ) ;
    public final void rule__Class__ContextAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6541:1: ( ( rulePolyContext ) )
            // InternalBSharp.g:6542:2: ( rulePolyContext )
            {
            // InternalBSharp.g:6542:2: ( rulePolyContext )
            // InternalBSharp.g:6543:3: rulePolyContext
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
    // InternalBSharp.g:6552:1: rule__Class__SupertypesAssignment_3 : ( ruleSuperTypeList ) ;
    public final void rule__Class__SupertypesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6556:1: ( ( ruleSuperTypeList ) )
            // InternalBSharp.g:6557:2: ( ruleSuperTypeList )
            {
            // InternalBSharp.g:6557:2: ( ruleSuperTypeList )
            // InternalBSharp.g:6558:3: ruleSuperTypeList
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
    // InternalBSharp.g:6567:1: rule__Class__VarListAssignment_4 : ( ruleTypeStructure ) ;
    public final void rule__Class__VarListAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6571:1: ( ( ruleTypeStructure ) )
            // InternalBSharp.g:6572:2: ( ruleTypeStructure )
            {
            // InternalBSharp.g:6572:2: ( ruleTypeStructure )
            // InternalBSharp.g:6573:3: ruleTypeStructure
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
    // InternalBSharp.g:6582:1: rule__Class__WhereAssignment_5 : ( ruleWhere ) ;
    public final void rule__Class__WhereAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6586:1: ( ( ruleWhere ) )
            // InternalBSharp.g:6587:2: ( ruleWhere )
            {
            // InternalBSharp.g:6587:2: ( ruleWhere )
            // InternalBSharp.g:6588:3: ruleWhere
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
    // InternalBSharp.g:6597:1: rule__Class__BlockAssignment_7 : ( ruleBSharpBlock ) ;
    public final void rule__Class__BlockAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6601:1: ( ( ruleBSharpBlock ) )
            // InternalBSharp.g:6602:2: ( ruleBSharpBlock )
            {
            // InternalBSharp.g:6602:2: ( ruleBSharpBlock )
            // InternalBSharp.g:6603:3: ruleBSharpBlock
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
    // InternalBSharp.g:6612:1: rule__PolyContext__PolyTypesAssignment_1 : ( rulePolyType ) ;
    public final void rule__PolyContext__PolyTypesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6616:1: ( ( rulePolyType ) )
            // InternalBSharp.g:6617:2: ( rulePolyType )
            {
            // InternalBSharp.g:6617:2: ( rulePolyType )
            // InternalBSharp.g:6618:3: rulePolyType
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
    // InternalBSharp.g:6627:1: rule__PolyType__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__PolyType__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6631:1: ( ( RULE_ID ) )
            // InternalBSharp.g:6632:2: ( RULE_ID )
            {
            // InternalBSharp.g:6632:2: ( RULE_ID )
            // InternalBSharp.g:6633:3: RULE_ID
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
    // InternalBSharp.g:6642:1: rule__PolyType__SuperTypesAssignment_1_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__PolyType__SuperTypesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6646:1: ( ( ( ruleQualifiedName ) ) )
            // InternalBSharp.g:6647:2: ( ( ruleQualifiedName ) )
            {
            // InternalBSharp.g:6647:2: ( ( ruleQualifiedName ) )
            // InternalBSharp.g:6648:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getPolyTypeAccess().getSuperTypesClassDeclCrossReference_1_1_0()); 
            // InternalBSharp.g:6649:3: ( ruleQualifiedName )
            // InternalBSharp.g:6650:4: ruleQualifiedName
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
    // InternalBSharp.g:6661:1: rule__PolyType__SuperTypesAssignment_1_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__PolyType__SuperTypesAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6665:1: ( ( ( ruleQualifiedName ) ) )
            // InternalBSharp.g:6666:2: ( ( ruleQualifiedName ) )
            {
            // InternalBSharp.g:6666:2: ( ( ruleQualifiedName ) )
            // InternalBSharp.g:6667:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getPolyTypeAccess().getSuperTypesClassDeclCrossReference_1_2_1_0()); 
            // InternalBSharp.g:6668:3: ( ruleQualifiedName )
            // InternalBSharp.g:6669:4: ruleQualifiedName
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
    // InternalBSharp.g:6680:1: rule__SuperTypeList__SuperTypesAssignment_1 : ( ruleConstructedType ) ;
    public final void rule__SuperTypeList__SuperTypesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6684:1: ( ( ruleConstructedType ) )
            // InternalBSharp.g:6685:2: ( ruleConstructedType )
            {
            // InternalBSharp.g:6685:2: ( ruleConstructedType )
            // InternalBSharp.g:6686:3: ruleConstructedType
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
    // InternalBSharp.g:6695:1: rule__SuperTypeList__SuperTypesAssignment_2_1 : ( ruleConstructedType ) ;
    public final void rule__SuperTypeList__SuperTypesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6699:1: ( ( ruleConstructedType ) )
            // InternalBSharp.g:6700:2: ( ruleConstructedType )
            {
            // InternalBSharp.g:6700:2: ( ruleConstructedType )
            // InternalBSharp.g:6701:3: ruleConstructedType
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


    // $ANTLR start "rule__ConstructedType__TypeAssignment_0"
    // InternalBSharp.g:6710:1: rule__ConstructedType__TypeAssignment_0 : ( ruleTypeConstructor ) ;
    public final void rule__ConstructedType__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6714:1: ( ( ruleTypeConstructor ) )
            // InternalBSharp.g:6715:2: ( ruleTypeConstructor )
            {
            // InternalBSharp.g:6715:2: ( ruleTypeConstructor )
            // InternalBSharp.g:6716:3: ruleTypeConstructor
            {
             before(grammarAccess.getConstructedTypeAccess().getTypeTypeConstructorParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTypeConstructor();

            state._fsp--;

             after(grammarAccess.getConstructedTypeAccess().getTypeTypeConstructorParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstructedType__TypeAssignment_0"


    // $ANTLR start "rule__ConstructedType__ConstructorsAssignment_1_0"
    // InternalBSharp.g:6725:1: rule__ConstructedType__ConstructorsAssignment_1_0 : ( ( rule__ConstructedType__ConstructorsAlternatives_1_0_0 ) ) ;
    public final void rule__ConstructedType__ConstructorsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6729:1: ( ( ( rule__ConstructedType__ConstructorsAlternatives_1_0_0 ) ) )
            // InternalBSharp.g:6730:2: ( ( rule__ConstructedType__ConstructorsAlternatives_1_0_0 ) )
            {
            // InternalBSharp.g:6730:2: ( ( rule__ConstructedType__ConstructorsAlternatives_1_0_0 ) )
            // InternalBSharp.g:6731:3: ( rule__ConstructedType__ConstructorsAlternatives_1_0_0 )
            {
             before(grammarAccess.getConstructedTypeAccess().getConstructorsAlternatives_1_0_0()); 
            // InternalBSharp.g:6732:3: ( rule__ConstructedType__ConstructorsAlternatives_1_0_0 )
            // InternalBSharp.g:6732:4: rule__ConstructedType__ConstructorsAlternatives_1_0_0
            {
            pushFollow(FOLLOW_2);
            rule__ConstructedType__ConstructorsAlternatives_1_0_0();

            state._fsp--;


            }

             after(grammarAccess.getConstructedTypeAccess().getConstructorsAlternatives_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstructedType__ConstructorsAssignment_1_0"


    // $ANTLR start "rule__ConstructedType__TypeAssignment_1_1"
    // InternalBSharp.g:6740:1: rule__ConstructedType__TypeAssignment_1_1 : ( ruleConstructedType ) ;
    public final void rule__ConstructedType__TypeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6744:1: ( ( ruleConstructedType ) )
            // InternalBSharp.g:6745:2: ( ruleConstructedType )
            {
            // InternalBSharp.g:6745:2: ( ruleConstructedType )
            // InternalBSharp.g:6746:3: ruleConstructedType
            {
             before(grammarAccess.getConstructedTypeAccess().getTypeConstructedTypeParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleConstructedType();

            state._fsp--;

             after(grammarAccess.getConstructedTypeAccess().getTypeConstructedTypeParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstructedType__TypeAssignment_1_1"


    // $ANTLR start "rule__TypeConstructor__TypeNameAssignment_0"
    // InternalBSharp.g:6755:1: rule__TypeConstructor__TypeNameAssignment_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__TypeConstructor__TypeNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6759:1: ( ( ( ruleQualifiedName ) ) )
            // InternalBSharp.g:6760:2: ( ( ruleQualifiedName ) )
            {
            // InternalBSharp.g:6760:2: ( ( ruleQualifiedName ) )
            // InternalBSharp.g:6761:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getTypeConstructorAccess().getTypeNameGenNameCrossReference_0_0()); 
            // InternalBSharp.g:6762:3: ( ruleQualifiedName )
            // InternalBSharp.g:6763:4: ruleQualifiedName
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
    // InternalBSharp.g:6774:1: rule__TypeConstructor__ContextAssignment_1 : ( ruleTypeDeclContext ) ;
    public final void rule__TypeConstructor__ContextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6778:1: ( ( ruleTypeDeclContext ) )
            // InternalBSharp.g:6779:2: ( ruleTypeDeclContext )
            {
            // InternalBSharp.g:6779:2: ( ruleTypeDeclContext )
            // InternalBSharp.g:6780:3: ruleTypeDeclContext
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


    // $ANTLR start "rule__TypeDeclContext__TypeNameAssignment_1"
    // InternalBSharp.g:6789:1: rule__TypeDeclContext__TypeNameAssignment_1 : ( ruleConstructedType ) ;
    public final void rule__TypeDeclContext__TypeNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6793:1: ( ( ruleConstructedType ) )
            // InternalBSharp.g:6794:2: ( ruleConstructedType )
            {
            // InternalBSharp.g:6794:2: ( ruleConstructedType )
            // InternalBSharp.g:6795:3: ruleConstructedType
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
    // InternalBSharp.g:6804:1: rule__TypeDeclContext__TypeNameAssignment_2_1 : ( ruleConstructedType ) ;
    public final void rule__TypeDeclContext__TypeNameAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6808:1: ( ( ruleConstructedType ) )
            // InternalBSharp.g:6809:2: ( ruleConstructedType )
            {
            // InternalBSharp.g:6809:2: ( ruleConstructedType )
            // InternalBSharp.g:6810:3: ruleConstructedType
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
    // InternalBSharp.g:6819:1: rule__TypeStructure__VariablesAssignment_1 : ( ruleTypedVariableList ) ;
    public final void rule__TypeStructure__VariablesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6823:1: ( ( ruleTypedVariableList ) )
            // InternalBSharp.g:6824:2: ( ruleTypedVariableList )
            {
            // InternalBSharp.g:6824:2: ( ruleTypedVariableList )
            // InternalBSharp.g:6825:3: ruleTypedVariableList
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
    // InternalBSharp.g:6834:1: rule__Where__ExpessionsAssignment_1 : ( ruleQuantifier ) ;
    public final void rule__Where__ExpessionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6838:1: ( ( ruleQuantifier ) )
            // InternalBSharp.g:6839:2: ( ruleQuantifier )
            {
            // InternalBSharp.g:6839:2: ( ruleQuantifier )
            // InternalBSharp.g:6840:3: ruleQuantifier
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
    // InternalBSharp.g:6849:1: rule__Where__ExpressionsAssignment_2_1 : ( ruleRootExpression ) ;
    public final void rule__Where__ExpressionsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6853:1: ( ( ruleRootExpression ) )
            // InternalBSharp.g:6854:2: ( ruleRootExpression )
            {
            // InternalBSharp.g:6854:2: ( ruleRootExpression )
            // InternalBSharp.g:6855:3: ruleRootExpression
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
    // InternalBSharp.g:6864:1: rule__Datatype__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Datatype__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6868:1: ( ( RULE_ID ) )
            // InternalBSharp.g:6869:2: ( RULE_ID )
            {
            // InternalBSharp.g:6869:2: ( RULE_ID )
            // InternalBSharp.g:6870:3: RULE_ID
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
    // InternalBSharp.g:6879:1: rule__Datatype__ContextAssignment_2 : ( rulePolyContext ) ;
    public final void rule__Datatype__ContextAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6883:1: ( ( rulePolyContext ) )
            // InternalBSharp.g:6884:2: ( rulePolyContext )
            {
            // InternalBSharp.g:6884:2: ( rulePolyContext )
            // InternalBSharp.g:6885:3: rulePolyContext
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
    // InternalBSharp.g:6894:1: rule__Datatype__ConstructorsAssignment_3_1 : ( ruleDatatypeConstructor ) ;
    public final void rule__Datatype__ConstructorsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6898:1: ( ( ruleDatatypeConstructor ) )
            // InternalBSharp.g:6899:2: ( ruleDatatypeConstructor )
            {
            // InternalBSharp.g:6899:2: ( ruleDatatypeConstructor )
            // InternalBSharp.g:6900:3: ruleDatatypeConstructor
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
    // InternalBSharp.g:6909:1: rule__Datatype__BlockAssignment_4 : ( ruleBSharpBlock ) ;
    public final void rule__Datatype__BlockAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6913:1: ( ( ruleBSharpBlock ) )
            // InternalBSharp.g:6914:2: ( ruleBSharpBlock )
            {
            // InternalBSharp.g:6914:2: ( ruleBSharpBlock )
            // InternalBSharp.g:6915:3: ruleBSharpBlock
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
    // InternalBSharp.g:6924:1: rule__DatatypeConstructor__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__DatatypeConstructor__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6928:1: ( ( RULE_ID ) )
            // InternalBSharp.g:6929:2: ( RULE_ID )
            {
            // InternalBSharp.g:6929:2: ( RULE_ID )
            // InternalBSharp.g:6930:3: RULE_ID
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
    // InternalBSharp.g:6939:1: rule__DatatypeConstructor__DeconsAssignment_1_1 : ( ruleTypedVariableList ) ;
    public final void rule__DatatypeConstructor__DeconsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6943:1: ( ( ruleTypedVariableList ) )
            // InternalBSharp.g:6944:2: ( ruleTypedVariableList )
            {
            // InternalBSharp.g:6944:2: ( ruleTypedVariableList )
            // InternalBSharp.g:6945:3: ruleTypedVariableList
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
    // InternalBSharp.g:6954:1: rule__Extend__ExtendedClassAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Extend__ExtendedClassAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6958:1: ( ( ( ruleQualifiedName ) ) )
            // InternalBSharp.g:6959:2: ( ( ruleQualifiedName ) )
            {
            // InternalBSharp.g:6959:2: ( ( ruleQualifiedName ) )
            // InternalBSharp.g:6960:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getExtendAccess().getExtendedClassClassDeclCrossReference_1_0()); 
            // InternalBSharp.g:6961:3: ( ruleQualifiedName )
            // InternalBSharp.g:6962:4: ruleQualifiedName
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
    // InternalBSharp.g:6973:1: rule__Extend__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Extend__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6977:1: ( ( RULE_ID ) )
            // InternalBSharp.g:6978:2: ( RULE_ID )
            {
            // InternalBSharp.g:6978:2: ( RULE_ID )
            // InternalBSharp.g:6979:3: RULE_ID
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
    // InternalBSharp.g:6988:1: rule__Extend__BlockAssignment_5 : ( ruleBSharpBlock ) ;
    public final void rule__Extend__BlockAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6992:1: ( ( ruleBSharpBlock ) )
            // InternalBSharp.g:6993:2: ( ruleBSharpBlock )
            {
            // InternalBSharp.g:6993:2: ( ruleBSharpBlock )
            // InternalBSharp.g:6994:3: ruleBSharpBlock
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
    // InternalBSharp.g:7003:1: rule__BSharpBlock__BodyElementsAssignment_2 : ( ruleTypeBodyElements ) ;
    public final void rule__BSharpBlock__BodyElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7007:1: ( ( ruleTypeBodyElements ) )
            // InternalBSharp.g:7008:2: ( ruleTypeBodyElements )
            {
            // InternalBSharp.g:7008:2: ( ruleTypeBodyElements )
            // InternalBSharp.g:7009:3: ruleTypeBodyElements
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
    // InternalBSharp.g:7018:1: rule__TypeBodyElements__FunctionsAssignment_0 : ( ruleFunctionDecl ) ;
    public final void rule__TypeBodyElements__FunctionsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7022:1: ( ( ruleFunctionDecl ) )
            // InternalBSharp.g:7023:2: ( ruleFunctionDecl )
            {
            // InternalBSharp.g:7023:2: ( ruleFunctionDecl )
            // InternalBSharp.g:7024:3: ruleFunctionDecl
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
    // InternalBSharp.g:7033:1: rule__TypeBodyElements__TheoremsAssignment_1 : ( ruleTheoremBody ) ;
    public final void rule__TypeBodyElements__TheoremsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7037:1: ( ( ruleTheoremBody ) )
            // InternalBSharp.g:7038:2: ( ruleTheoremBody )
            {
            // InternalBSharp.g:7038:2: ( ruleTheoremBody )
            // InternalBSharp.g:7039:3: ruleTheoremBody
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
    // InternalBSharp.g:7048:1: rule__FunctionDecl__NameAssignment_0 : ( ruleFunctionName ) ;
    public final void rule__FunctionDecl__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7052:1: ( ( ruleFunctionName ) )
            // InternalBSharp.g:7053:2: ( ruleFunctionName )
            {
            // InternalBSharp.g:7053:2: ( ruleFunctionName )
            // InternalBSharp.g:7054:3: ruleFunctionName
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
    // InternalBSharp.g:7063:1: rule__FunctionDecl__ContextAssignment_1 : ( rulePolyContext ) ;
    public final void rule__FunctionDecl__ContextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7067:1: ( ( rulePolyContext ) )
            // InternalBSharp.g:7068:2: ( rulePolyContext )
            {
            // InternalBSharp.g:7068:2: ( rulePolyContext )
            // InternalBSharp.g:7069:3: rulePolyContext
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
    // InternalBSharp.g:7078:1: rule__FunctionDecl__VarListAssignment_3 : ( ruleTypedVariableList ) ;
    public final void rule__FunctionDecl__VarListAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7082:1: ( ( ruleTypedVariableList ) )
            // InternalBSharp.g:7083:2: ( ruleTypedVariableList )
            {
            // InternalBSharp.g:7083:2: ( ruleTypedVariableList )
            // InternalBSharp.g:7084:3: ruleTypedVariableList
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
    // InternalBSharp.g:7093:1: rule__FunctionDecl__ReturnTypeAssignment_6 : ( ruleTypeConstructor ) ;
    public final void rule__FunctionDecl__ReturnTypeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7097:1: ( ( ruleTypeConstructor ) )
            // InternalBSharp.g:7098:2: ( ruleTypeConstructor )
            {
            // InternalBSharp.g:7098:2: ( ruleTypeConstructor )
            // InternalBSharp.g:7099:3: ruleTypeConstructor
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
    // InternalBSharp.g:7108:1: rule__FunctionDecl__InfixAssignment_7 : ( ( 'INFIX' ) ) ;
    public final void rule__FunctionDecl__InfixAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7112:1: ( ( ( 'INFIX' ) ) )
            // InternalBSharp.g:7113:2: ( ( 'INFIX' ) )
            {
            // InternalBSharp.g:7113:2: ( ( 'INFIX' ) )
            // InternalBSharp.g:7114:3: ( 'INFIX' )
            {
             before(grammarAccess.getFunctionDeclAccess().getInfixINFIXKeyword_7_0()); 
            // InternalBSharp.g:7115:3: ( 'INFIX' )
            // InternalBSharp.g:7116:4: 'INFIX'
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
    // InternalBSharp.g:7127:1: rule__FunctionDecl__PrecedenceAssignment_8 : ( RULE_INT ) ;
    public final void rule__FunctionDecl__PrecedenceAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7131:1: ( ( RULE_INT ) )
            // InternalBSharp.g:7132:2: ( RULE_INT )
            {
            // InternalBSharp.g:7132:2: ( RULE_INT )
            // InternalBSharp.g:7133:3: RULE_INT
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
    // InternalBSharp.g:7142:1: rule__FunctionDecl__ExprAssignment_9 : ( ruleRootExpression ) ;
    public final void rule__FunctionDecl__ExprAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7146:1: ( ( ruleRootExpression ) )
            // InternalBSharp.g:7147:2: ( ruleRootExpression )
            {
            // InternalBSharp.g:7147:2: ( ruleRootExpression )
            // InternalBSharp.g:7148:3: ruleRootExpression
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
    // InternalBSharp.g:7157:1: rule__FunctionName__NameAssignment : ( RULE_ID ) ;
    public final void rule__FunctionName__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7161:1: ( ( RULE_ID ) )
            // InternalBSharp.g:7162:2: ( RULE_ID )
            {
            // InternalBSharp.g:7162:2: ( RULE_ID )
            // InternalBSharp.g:7163:3: RULE_ID
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
    // InternalBSharp.g:7172:1: rule__MatchStatement__MatchAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__MatchStatement__MatchAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7176:1: ( ( ( RULE_ID ) ) )
            // InternalBSharp.g:7177:2: ( ( RULE_ID ) )
            {
            // InternalBSharp.g:7177:2: ( ( RULE_ID ) )
            // InternalBSharp.g:7178:3: ( RULE_ID )
            {
             before(grammarAccess.getMatchStatementAccess().getMatchDatatypeConstructorCrossReference_1_0()); 
            // InternalBSharp.g:7179:3: ( RULE_ID )
            // InternalBSharp.g:7180:4: RULE_ID
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
    // InternalBSharp.g:7191:1: rule__MatchStatement__InductCaseAssignment_3 : ( ruleMatchCase ) ;
    public final void rule__MatchStatement__InductCaseAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7195:1: ( ( ruleMatchCase ) )
            // InternalBSharp.g:7196:2: ( ruleMatchCase )
            {
            // InternalBSharp.g:7196:2: ( ruleMatchCase )
            // InternalBSharp.g:7197:3: ruleMatchCase
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
    // InternalBSharp.g:7206:1: rule__MatchStatement__InductCaseAssignment_4 : ( ruleMatchCase ) ;
    public final void rule__MatchStatement__InductCaseAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7210:1: ( ( ruleMatchCase ) )
            // InternalBSharp.g:7211:2: ( ruleMatchCase )
            {
            // InternalBSharp.g:7211:2: ( ruleMatchCase )
            // InternalBSharp.g:7212:3: ruleMatchCase
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
    // InternalBSharp.g:7221:1: rule__MatchCase__DeconNameAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__MatchCase__DeconNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7225:1: ( ( ( RULE_ID ) ) )
            // InternalBSharp.g:7226:2: ( ( RULE_ID ) )
            {
            // InternalBSharp.g:7226:2: ( ( RULE_ID ) )
            // InternalBSharp.g:7227:3: ( RULE_ID )
            {
             before(grammarAccess.getMatchCaseAccess().getDeconNameTypedVariableCrossReference_1_0()); 
            // InternalBSharp.g:7228:3: ( RULE_ID )
            // InternalBSharp.g:7229:4: RULE_ID
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
    // InternalBSharp.g:7240:1: rule__MatchCase__VariablesAssignment_2_1 : ( ruleTypedVariable ) ;
    public final void rule__MatchCase__VariablesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7244:1: ( ( ruleTypedVariable ) )
            // InternalBSharp.g:7245:2: ( ruleTypedVariable )
            {
            // InternalBSharp.g:7245:2: ( ruleTypedVariable )
            // InternalBSharp.g:7246:3: ruleTypedVariable
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
    // InternalBSharp.g:7255:1: rule__MatchCase__VariablesAssignment_2_2_1 : ( ruleTypedVariable ) ;
    public final void rule__MatchCase__VariablesAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7259:1: ( ( ruleTypedVariable ) )
            // InternalBSharp.g:7260:2: ( ruleTypedVariable )
            {
            // InternalBSharp.g:7260:2: ( ruleTypedVariable )
            // InternalBSharp.g:7261:3: ruleTypedVariable
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
    // InternalBSharp.g:7270:1: rule__MatchCase__ExprAssignment_4 : ( ruleRootExpression ) ;
    public final void rule__MatchCase__ExprAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7274:1: ( ( ruleRootExpression ) )
            // InternalBSharp.g:7275:2: ( ruleRootExpression )
            {
            // InternalBSharp.g:7275:2: ( ruleRootExpression )
            // InternalBSharp.g:7276:3: ruleRootExpression
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
    // InternalBSharp.g:7285:1: rule__TheoremBody__TheoremDeclAssignment_2 : ( ruleTheoremDecl ) ;
    public final void rule__TheoremBody__TheoremDeclAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7289:1: ( ( ruleTheoremDecl ) )
            // InternalBSharp.g:7290:2: ( ruleTheoremDecl )
            {
            // InternalBSharp.g:7290:2: ( ruleTheoremDecl )
            // InternalBSharp.g:7291:3: ruleTheoremDecl
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
    // InternalBSharp.g:7300:1: rule__TheoremDecl__NameAssignment_0 : ( ruleTHM_NAME ) ;
    public final void rule__TheoremDecl__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7304:1: ( ( ruleTHM_NAME ) )
            // InternalBSharp.g:7305:2: ( ruleTHM_NAME )
            {
            // InternalBSharp.g:7305:2: ( ruleTHM_NAME )
            // InternalBSharp.g:7306:3: ruleTHM_NAME
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
    // InternalBSharp.g:7315:1: rule__TheoremDecl__ExprAssignment_1 : ( ruleRootExpression ) ;
    public final void rule__TheoremDecl__ExprAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7319:1: ( ( ruleRootExpression ) )
            // InternalBSharp.g:7320:2: ( ruleRootExpression )
            {
            // InternalBSharp.g:7320:2: ( ruleRootExpression )
            // InternalBSharp.g:7321:3: ruleRootExpression
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
    // InternalBSharp.g:7330:1: rule__TypedVariableList__VariablesOfTypeAssignment_0 : ( ruleVariableTyping ) ;
    public final void rule__TypedVariableList__VariablesOfTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7334:1: ( ( ruleVariableTyping ) )
            // InternalBSharp.g:7335:2: ( ruleVariableTyping )
            {
            // InternalBSharp.g:7335:2: ( ruleVariableTyping )
            // InternalBSharp.g:7336:3: ruleVariableTyping
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
    // InternalBSharp.g:7345:1: rule__TypedVariableList__VariablesOfTypeAssignment_1_1 : ( ruleVariableTyping ) ;
    public final void rule__TypedVariableList__VariablesOfTypeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7349:1: ( ( ruleVariableTyping ) )
            // InternalBSharp.g:7350:2: ( ruleVariableTyping )
            {
            // InternalBSharp.g:7350:2: ( ruleVariableTyping )
            // InternalBSharp.g:7351:3: ruleVariableTyping
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
    // InternalBSharp.g:7360:1: rule__VariableTyping__TypeVarAssignment_0 : ( ruleTypedVariable ) ;
    public final void rule__VariableTyping__TypeVarAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7364:1: ( ( ruleTypedVariable ) )
            // InternalBSharp.g:7365:2: ( ruleTypedVariable )
            {
            // InternalBSharp.g:7365:2: ( ruleTypedVariable )
            // InternalBSharp.g:7366:3: ruleTypedVariable
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
    // InternalBSharp.g:7375:1: rule__VariableTyping__TypeVarAssignment_1_1 : ( ruleTypedVariable ) ;
    public final void rule__VariableTyping__TypeVarAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7379:1: ( ( ruleTypedVariable ) )
            // InternalBSharp.g:7380:2: ( ruleTypedVariable )
            {
            // InternalBSharp.g:7380:2: ( ruleTypedVariable )
            // InternalBSharp.g:7381:3: ruleTypedVariable
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
    // InternalBSharp.g:7390:1: rule__VariableTyping__TypeAssignment_3 : ( ruleConstructedType ) ;
    public final void rule__VariableTyping__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7394:1: ( ( ruleConstructedType ) )
            // InternalBSharp.g:7395:2: ( ruleConstructedType )
            {
            // InternalBSharp.g:7395:2: ( ruleConstructedType )
            // InternalBSharp.g:7396:3: ruleConstructedType
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
    // InternalBSharp.g:7405:1: rule__TypedVariable__NameAssignment : ( RULE_ID ) ;
    public final void rule__TypedVariable__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7409:1: ( ( RULE_ID ) )
            // InternalBSharp.g:7410:2: ( RULE_ID )
            {
            // InternalBSharp.g:7410:2: ( RULE_ID )
            // InternalBSharp.g:7411:3: RULE_ID
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
    // InternalBSharp.g:7420:1: rule__Lambda__QTypeAssignment_0 : ( ( '\\u03BB' ) ) ;
    public final void rule__Lambda__QTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7424:1: ( ( ( '\\u03BB' ) ) )
            // InternalBSharp.g:7425:2: ( ( '\\u03BB' ) )
            {
            // InternalBSharp.g:7425:2: ( ( '\\u03BB' ) )
            // InternalBSharp.g:7426:3: ( '\\u03BB' )
            {
             before(grammarAccess.getLambdaAccess().getQTypeGreekSmallLetterLamdaKeyword_0_0()); 
            // InternalBSharp.g:7427:3: ( '\\u03BB' )
            // InternalBSharp.g:7428:4: '\\u03BB'
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
    // InternalBSharp.g:7439:1: rule__Lambda__ContextAssignment_1 : ( rulePolyContext ) ;
    public final void rule__Lambda__ContextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7443:1: ( ( rulePolyContext ) )
            // InternalBSharp.g:7444:2: ( rulePolyContext )
            {
            // InternalBSharp.g:7444:2: ( rulePolyContext )
            // InternalBSharp.g:7445:3: rulePolyContext
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
    // InternalBSharp.g:7454:1: rule__Lambda__VarListAssignment_2 : ( ruleTypedVariableList ) ;
    public final void rule__Lambda__VarListAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7458:1: ( ( ruleTypedVariableList ) )
            // InternalBSharp.g:7459:2: ( ruleTypedVariableList )
            {
            // InternalBSharp.g:7459:2: ( ruleTypedVariableList )
            // InternalBSharp.g:7460:3: ruleTypedVariableList
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
    // InternalBSharp.g:7469:1: rule__Lambda__ExprAssignment_4 : ( ruleRootExpression ) ;
    public final void rule__Lambda__ExprAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7473:1: ( ( ruleRootExpression ) )
            // InternalBSharp.g:7474:2: ( ruleRootExpression )
            {
            // InternalBSharp.g:7474:2: ( ruleRootExpression )
            // InternalBSharp.g:7475:3: ruleRootExpression
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
    // InternalBSharp.g:7484:1: rule__Quantifier__QTypeAssignment_0 : ( ( rule__Quantifier__QTypeAlternatives_0_0 ) ) ;
    public final void rule__Quantifier__QTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7488:1: ( ( ( rule__Quantifier__QTypeAlternatives_0_0 ) ) )
            // InternalBSharp.g:7489:2: ( ( rule__Quantifier__QTypeAlternatives_0_0 ) )
            {
            // InternalBSharp.g:7489:2: ( ( rule__Quantifier__QTypeAlternatives_0_0 ) )
            // InternalBSharp.g:7490:3: ( rule__Quantifier__QTypeAlternatives_0_0 )
            {
             before(grammarAccess.getQuantifierAccess().getQTypeAlternatives_0_0()); 
            // InternalBSharp.g:7491:3: ( rule__Quantifier__QTypeAlternatives_0_0 )
            // InternalBSharp.g:7491:4: rule__Quantifier__QTypeAlternatives_0_0
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
    // InternalBSharp.g:7499:1: rule__Quantifier__ContextAssignment_1 : ( rulePolyContext ) ;
    public final void rule__Quantifier__ContextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7503:1: ( ( rulePolyContext ) )
            // InternalBSharp.g:7504:2: ( rulePolyContext )
            {
            // InternalBSharp.g:7504:2: ( rulePolyContext )
            // InternalBSharp.g:7505:3: rulePolyContext
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
    // InternalBSharp.g:7514:1: rule__Quantifier__VarListAssignment_2 : ( ruleTypedVariableList ) ;
    public final void rule__Quantifier__VarListAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7518:1: ( ( ruleTypedVariableList ) )
            // InternalBSharp.g:7519:2: ( ruleTypedVariableList )
            {
            // InternalBSharp.g:7519:2: ( ruleTypedVariableList )
            // InternalBSharp.g:7520:3: ruleTypedVariableList
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
    // InternalBSharp.g:7529:1: rule__Quantifier__ExprAssignment_4 : ( ruleRootExpression ) ;
    public final void rule__Quantifier__ExprAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7533:1: ( ( ruleRootExpression ) )
            // InternalBSharp.g:7534:2: ( ruleRootExpression )
            {
            // InternalBSharp.g:7534:2: ( ruleRootExpression )
            // InternalBSharp.g:7535:3: ruleRootExpression
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
    // InternalBSharp.g:7544:1: rule__Prefix__NameAssignment_0 : ( rulePrefixBuiltIn ) ;
    public final void rule__Prefix__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7548:1: ( ( rulePrefixBuiltIn ) )
            // InternalBSharp.g:7549:2: ( rulePrefixBuiltIn )
            {
            // InternalBSharp.g:7549:2: ( rulePrefixBuiltIn )
            // InternalBSharp.g:7550:3: rulePrefixBuiltIn
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
    // InternalBSharp.g:7559:1: rule__Prefix__ElemAssignment_1 : ( ruleElement ) ;
    public final void rule__Prefix__ElemAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7563:1: ( ( ruleElement ) )
            // InternalBSharp.g:7564:2: ( ruleElement )
            {
            // InternalBSharp.g:7564:2: ( ruleElement )
            // InternalBSharp.g:7565:3: ruleElement
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
    // InternalBSharp.g:7574:1: rule__Infix__FuncNameAssignment_1_1_0 : ( ( RULE_ID ) ) ;
    public final void rule__Infix__FuncNameAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7578:1: ( ( ( RULE_ID ) ) )
            // InternalBSharp.g:7579:2: ( ( RULE_ID ) )
            {
            // InternalBSharp.g:7579:2: ( ( RULE_ID ) )
            // InternalBSharp.g:7580:3: ( RULE_ID )
            {
             before(grammarAccess.getInfixAccess().getFuncNameFunctionNameCrossReference_1_1_0_0()); 
            // InternalBSharp.g:7581:3: ( RULE_ID )
            // InternalBSharp.g:7582:4: RULE_ID
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
    // InternalBSharp.g:7593:1: rule__Infix__OpNameAssignment_1_1_1 : ( ruleInbuiltInfix ) ;
    public final void rule__Infix__OpNameAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7597:1: ( ( ruleInbuiltInfix ) )
            // InternalBSharp.g:7598:2: ( ruleInbuiltInfix )
            {
            // InternalBSharp.g:7598:2: ( ruleInbuiltInfix )
            // InternalBSharp.g:7599:3: ruleInbuiltInfix
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
    // InternalBSharp.g:7608:1: rule__Infix__RightAssignment_1_2 : ( ruleElement ) ;
    public final void rule__Infix__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7612:1: ( ( ruleElement ) )
            // InternalBSharp.g:7613:2: ( ruleElement )
            {
            // InternalBSharp.g:7613:2: ( ruleElement )
            // InternalBSharp.g:7614:3: ruleElement
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
    // InternalBSharp.g:7623:1: rule__Bracket__ChildAssignment_1 : ( ruleRootExpression ) ;
    public final void rule__Bracket__ChildAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7627:1: ( ( ruleRootExpression ) )
            // InternalBSharp.g:7628:2: ( ruleRootExpression )
            {
            // InternalBSharp.g:7628:2: ( ruleRootExpression )
            // InternalBSharp.g:7629:3: ruleRootExpression
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
    // InternalBSharp.g:7638:1: rule__FunctionCall__TypeInstAssignment_0_0 : ( ( RULE_ID ) ) ;
    public final void rule__FunctionCall__TypeInstAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7642:1: ( ( ( RULE_ID ) ) )
            // InternalBSharp.g:7643:2: ( ( RULE_ID ) )
            {
            // InternalBSharp.g:7643:2: ( ( RULE_ID ) )
            // InternalBSharp.g:7644:3: ( RULE_ID )
            {
             before(grammarAccess.getFunctionCallAccess().getTypeInstExpressionVariableCrossReference_0_0_0()); 
            // InternalBSharp.g:7645:3: ( RULE_ID )
            // InternalBSharp.g:7646:4: RULE_ID
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
    // InternalBSharp.g:7657:1: rule__FunctionCall__ClassVarDeclAssignment_0_1 : ( ruleClassVarDecl ) ;
    public final void rule__FunctionCall__ClassVarDeclAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7661:1: ( ( ruleClassVarDecl ) )
            // InternalBSharp.g:7662:2: ( ruleClassVarDecl )
            {
            // InternalBSharp.g:7662:2: ( ruleClassVarDecl )
            // InternalBSharp.g:7663:3: ruleClassVarDecl
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
    // InternalBSharp.g:7672:1: rule__FunctionCall__ArgumentsAssignment_1_1 : ( ruleRootExpression ) ;
    public final void rule__FunctionCall__ArgumentsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7676:1: ( ( ruleRootExpression ) )
            // InternalBSharp.g:7677:2: ( ruleRootExpression )
            {
            // InternalBSharp.g:7677:2: ( ruleRootExpression )
            // InternalBSharp.g:7678:3: ruleRootExpression
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
    // InternalBSharp.g:7687:1: rule__FunctionCall__ArgumentsAssignment_1_2_1 : ( ruleRootExpression ) ;
    public final void rule__FunctionCall__ArgumentsAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7691:1: ( ( ruleRootExpression ) )
            // InternalBSharp.g:7692:2: ( ruleRootExpression )
            {
            // InternalBSharp.g:7692:2: ( ruleRootExpression )
            // InternalBSharp.g:7693:3: ruleRootExpression
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
    // InternalBSharp.g:7702:1: rule__ClassVarDecl__OwnerTypeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__ClassVarDecl__OwnerTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7706:1: ( ( ( RULE_ID ) ) )
            // InternalBSharp.g:7707:2: ( ( RULE_ID ) )
            {
            // InternalBSharp.g:7707:2: ( ( RULE_ID ) )
            // InternalBSharp.g:7708:3: ( RULE_ID )
            {
             before(grammarAccess.getClassVarDeclAccess().getOwnerTypeGenNameCrossReference_0_0()); 
            // InternalBSharp.g:7709:3: ( RULE_ID )
            // InternalBSharp.g:7710:4: RULE_ID
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
    // InternalBSharp.g:7721:1: rule__ClassVarDecl__TypeInstAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__ClassVarDecl__TypeInstAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7725:1: ( ( ( RULE_ID ) ) )
            // InternalBSharp.g:7726:2: ( ( RULE_ID ) )
            {
            // InternalBSharp.g:7726:2: ( ( RULE_ID ) )
            // InternalBSharp.g:7727:3: ( RULE_ID )
            {
             before(grammarAccess.getClassVarDeclAccess().getTypeInstExpressionVariableCrossReference_2_0()); 
            // InternalBSharp.g:7728:3: ( RULE_ID )
            // InternalBSharp.g:7729:4: RULE_ID
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
    // InternalBSharp.g:7740:1: rule__Instance__ClassNameAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Instance__ClassNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7744:1: ( ( ( ruleQualifiedName ) ) )
            // InternalBSharp.g:7745:2: ( ( ruleQualifiedName ) )
            {
            // InternalBSharp.g:7745:2: ( ( ruleQualifiedName ) )
            // InternalBSharp.g:7746:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getInstanceAccess().getClassNameClassDeclCrossReference_1_0()); 
            // InternalBSharp.g:7747:3: ( ruleQualifiedName )
            // InternalBSharp.g:7748:4: ruleQualifiedName
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
    // InternalBSharp.g:7759:1: rule__Instance__ContextAssignment_2 : ( ruleTypeDeclContext ) ;
    public final void rule__Instance__ContextAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7763:1: ( ( ruleTypeDeclContext ) )
            // InternalBSharp.g:7764:2: ( ruleTypeDeclContext )
            {
            // InternalBSharp.g:7764:2: ( ruleTypeDeclContext )
            // InternalBSharp.g:7765:3: ruleTypeDeclContext
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
    // InternalBSharp.g:7774:1: rule__Instance__ArgumentsAssignment_4 : ( ruleRootExpression ) ;
    public final void rule__Instance__ArgumentsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7778:1: ( ( ruleRootExpression ) )
            // InternalBSharp.g:7779:2: ( ruleRootExpression )
            {
            // InternalBSharp.g:7779:2: ( ruleRootExpression )
            // InternalBSharp.g:7780:3: ruleRootExpression
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
    // InternalBSharp.g:7789:1: rule__Instance__ArgumentsAssignment_5_1 : ( ruleRootExpression ) ;
    public final void rule__Instance__ArgumentsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7793:1: ( ( ruleRootExpression ) )
            // InternalBSharp.g:7794:2: ( ruleRootExpression )
            {
            // InternalBSharp.g:7794:2: ( ruleRootExpression )
            // InternalBSharp.g:7795:3: ruleRootExpression
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
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000000007FE000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0042020001800820L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000204000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000204000000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0005000000000020L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0004000000000022L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000024000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000040000000020L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0062020001800830L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0001200000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000020100000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000050000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000010100000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000004000000020L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000020000000820L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x000000007E000020L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x000000007E000022L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0042070001800820L});

}