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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_WS", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ANY_OTHER", "'\\u00AC'", "'*'", "'\\u00D7'", "'\\u2192'", "'\\uE102'", "'\\uE100'", "'\\u2194'", "'\\u2916'", "'\\u21F8'", "'\\u21A3'", "'\\u2900'", "'\\u21A0'", "'\\u2200'", "'\\u2203'", "'\\u21D4'", "'\\u21D2'", "'='", "'\\u2260'", "'\\u2227'", "'\\u2228'", "'package'", "':'", "'.'", "'From'", "'Import'", "'Class'", "';'", "'['", "']'", "'('", "')'", "'<'", "'>'", "','", "'\\u2119'", "'where'", "'Datatype'", "'|'", "'Extend'", "'{'", "'}'", "'match'", "'Theorems'", "'\\u00B7'", "'Instance'", "'INFIX'", "'\\u03BB'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
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

                if ( (LA1_0==36||LA1_0==47||LA1_0==49) ) {
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


    // $ANTLR start "entryRuleInstName"
    // InternalBSharp.g:360:1: entryRuleInstName : ruleInstName EOF ;
    public final void entryRuleInstName() throws RecognitionException {
        try {
            // InternalBSharp.g:361:1: ( ruleInstName EOF )
            // InternalBSharp.g:362:1: ruleInstName EOF
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
    // InternalBSharp.g:369:1: ruleInstName : ( ( rule__InstName__NameAssignment ) ) ;
    public final void ruleInstName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:373:2: ( ( ( rule__InstName__NameAssignment ) ) )
            // InternalBSharp.g:374:2: ( ( rule__InstName__NameAssignment ) )
            {
            // InternalBSharp.g:374:2: ( ( rule__InstName__NameAssignment ) )
            // InternalBSharp.g:375:3: ( rule__InstName__NameAssignment )
            {
             before(grammarAccess.getInstNameAccess().getNameAssignment()); 
            // InternalBSharp.g:376:3: ( rule__InstName__NameAssignment )
            // InternalBSharp.g:376:4: rule__InstName__NameAssignment
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
    // InternalBSharp.g:385:1: entryRulePolyContext : rulePolyContext EOF ;
    public final void entryRulePolyContext() throws RecognitionException {
        try {
            // InternalBSharp.g:386:1: ( rulePolyContext EOF )
            // InternalBSharp.g:387:1: rulePolyContext EOF
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
    // InternalBSharp.g:394:1: rulePolyContext : ( ( rule__PolyContext__Group__0 ) ) ;
    public final void rulePolyContext() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:398:2: ( ( ( rule__PolyContext__Group__0 ) ) )
            // InternalBSharp.g:399:2: ( ( rule__PolyContext__Group__0 ) )
            {
            // InternalBSharp.g:399:2: ( ( rule__PolyContext__Group__0 ) )
            // InternalBSharp.g:400:3: ( rule__PolyContext__Group__0 )
            {
             before(grammarAccess.getPolyContextAccess().getGroup()); 
            // InternalBSharp.g:401:3: ( rule__PolyContext__Group__0 )
            // InternalBSharp.g:401:4: rule__PolyContext__Group__0
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
    // InternalBSharp.g:410:1: entryRulePolyType : rulePolyType EOF ;
    public final void entryRulePolyType() throws RecognitionException {
        try {
            // InternalBSharp.g:411:1: ( rulePolyType EOF )
            // InternalBSharp.g:412:1: rulePolyType EOF
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
    // InternalBSharp.g:419:1: rulePolyType : ( ( rule__PolyType__Group__0 ) ) ;
    public final void rulePolyType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:423:2: ( ( ( rule__PolyType__Group__0 ) ) )
            // InternalBSharp.g:424:2: ( ( rule__PolyType__Group__0 ) )
            {
            // InternalBSharp.g:424:2: ( ( rule__PolyType__Group__0 ) )
            // InternalBSharp.g:425:3: ( rule__PolyType__Group__0 )
            {
             before(grammarAccess.getPolyTypeAccess().getGroup()); 
            // InternalBSharp.g:426:3: ( rule__PolyType__Group__0 )
            // InternalBSharp.g:426:4: rule__PolyType__Group__0
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
    // InternalBSharp.g:435:1: entryRuleSuperTypeList : ruleSuperTypeList EOF ;
    public final void entryRuleSuperTypeList() throws RecognitionException {
        try {
            // InternalBSharp.g:436:1: ( ruleSuperTypeList EOF )
            // InternalBSharp.g:437:1: ruleSuperTypeList EOF
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
    // InternalBSharp.g:444:1: ruleSuperTypeList : ( ( rule__SuperTypeList__Group__0 ) ) ;
    public final void ruleSuperTypeList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:448:2: ( ( ( rule__SuperTypeList__Group__0 ) ) )
            // InternalBSharp.g:449:2: ( ( rule__SuperTypeList__Group__0 ) )
            {
            // InternalBSharp.g:449:2: ( ( rule__SuperTypeList__Group__0 ) )
            // InternalBSharp.g:450:3: ( rule__SuperTypeList__Group__0 )
            {
             before(grammarAccess.getSuperTypeListAccess().getGroup()); 
            // InternalBSharp.g:451:3: ( rule__SuperTypeList__Group__0 )
            // InternalBSharp.g:451:4: rule__SuperTypeList__Group__0
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
    // InternalBSharp.g:460:1: entryRuleBuiltinTypeInfixOp : ruleBuiltinTypeInfixOp EOF ;
    public final void entryRuleBuiltinTypeInfixOp() throws RecognitionException {
        try {
            // InternalBSharp.g:461:1: ( ruleBuiltinTypeInfixOp EOF )
            // InternalBSharp.g:462:1: ruleBuiltinTypeInfixOp EOF
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
    // InternalBSharp.g:469:1: ruleBuiltinTypeInfixOp : ( ( rule__BuiltinTypeInfixOp__Alternatives ) ) ;
    public final void ruleBuiltinTypeInfixOp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:473:2: ( ( ( rule__BuiltinTypeInfixOp__Alternatives ) ) )
            // InternalBSharp.g:474:2: ( ( rule__BuiltinTypeInfixOp__Alternatives ) )
            {
            // InternalBSharp.g:474:2: ( ( rule__BuiltinTypeInfixOp__Alternatives ) )
            // InternalBSharp.g:475:3: ( rule__BuiltinTypeInfixOp__Alternatives )
            {
             before(grammarAccess.getBuiltinTypeInfixOpAccess().getAlternatives()); 
            // InternalBSharp.g:476:3: ( rule__BuiltinTypeInfixOp__Alternatives )
            // InternalBSharp.g:476:4: rule__BuiltinTypeInfixOp__Alternatives
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
    // InternalBSharp.g:485:1: entryRuleConstructedType : ruleConstructedType EOF ;
    public final void entryRuleConstructedType() throws RecognitionException {
        try {
            // InternalBSharp.g:486:1: ( ruleConstructedType EOF )
            // InternalBSharp.g:487:1: ruleConstructedType EOF
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
    // InternalBSharp.g:494:1: ruleConstructedType : ( ( rule__ConstructedType__Group__0 ) ) ;
    public final void ruleConstructedType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:498:2: ( ( ( rule__ConstructedType__Group__0 ) ) )
            // InternalBSharp.g:499:2: ( ( rule__ConstructedType__Group__0 ) )
            {
            // InternalBSharp.g:499:2: ( ( rule__ConstructedType__Group__0 ) )
            // InternalBSharp.g:500:3: ( rule__ConstructedType__Group__0 )
            {
             before(grammarAccess.getConstructedTypeAccess().getGroup()); 
            // InternalBSharp.g:501:3: ( rule__ConstructedType__Group__0 )
            // InternalBSharp.g:501:4: rule__ConstructedType__Group__0
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
    // InternalBSharp.g:510:1: entryRuleBuilderElem : ruleBuilderElem EOF ;
    public final void entryRuleBuilderElem() throws RecognitionException {
        try {
            // InternalBSharp.g:511:1: ( ruleBuilderElem EOF )
            // InternalBSharp.g:512:1: ruleBuilderElem EOF
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
    // InternalBSharp.g:519:1: ruleBuilderElem : ( ( rule__BuilderElem__Alternatives ) ) ;
    public final void ruleBuilderElem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:523:2: ( ( ( rule__BuilderElem__Alternatives ) ) )
            // InternalBSharp.g:524:2: ( ( rule__BuilderElem__Alternatives ) )
            {
            // InternalBSharp.g:524:2: ( ( rule__BuilderElem__Alternatives ) )
            // InternalBSharp.g:525:3: ( rule__BuilderElem__Alternatives )
            {
             before(grammarAccess.getBuilderElemAccess().getAlternatives()); 
            // InternalBSharp.g:526:3: ( rule__BuilderElem__Alternatives )
            // InternalBSharp.g:526:4: rule__BuilderElem__Alternatives
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
    // InternalBSharp.g:535:1: entryRuleTypeConstructor : ruleTypeConstructor EOF ;
    public final void entryRuleTypeConstructor() throws RecognitionException {
        try {
            // InternalBSharp.g:536:1: ( ruleTypeConstructor EOF )
            // InternalBSharp.g:537:1: ruleTypeConstructor EOF
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
    // InternalBSharp.g:544:1: ruleTypeConstructor : ( ( rule__TypeConstructor__Group__0 ) ) ;
    public final void ruleTypeConstructor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:548:2: ( ( ( rule__TypeConstructor__Group__0 ) ) )
            // InternalBSharp.g:549:2: ( ( rule__TypeConstructor__Group__0 ) )
            {
            // InternalBSharp.g:549:2: ( ( rule__TypeConstructor__Group__0 ) )
            // InternalBSharp.g:550:3: ( rule__TypeConstructor__Group__0 )
            {
             before(grammarAccess.getTypeConstructorAccess().getGroup()); 
            // InternalBSharp.g:551:3: ( rule__TypeConstructor__Group__0 )
            // InternalBSharp.g:551:4: rule__TypeConstructor__Group__0
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
    // InternalBSharp.g:560:1: entryRuleTypePowerSet : ruleTypePowerSet EOF ;
    public final void entryRuleTypePowerSet() throws RecognitionException {
        try {
            // InternalBSharp.g:561:1: ( ruleTypePowerSet EOF )
            // InternalBSharp.g:562:1: ruleTypePowerSet EOF
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
    // InternalBSharp.g:569:1: ruleTypePowerSet : ( ( rule__TypePowerSet__Group__0 ) ) ;
    public final void ruleTypePowerSet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:573:2: ( ( ( rule__TypePowerSet__Group__0 ) ) )
            // InternalBSharp.g:574:2: ( ( rule__TypePowerSet__Group__0 ) )
            {
            // InternalBSharp.g:574:2: ( ( rule__TypePowerSet__Group__0 ) )
            // InternalBSharp.g:575:3: ( rule__TypePowerSet__Group__0 )
            {
             before(grammarAccess.getTypePowerSetAccess().getGroup()); 
            // InternalBSharp.g:576:3: ( rule__TypePowerSet__Group__0 )
            // InternalBSharp.g:576:4: rule__TypePowerSet__Group__0
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
    // InternalBSharp.g:585:1: entryRuleTypeConstrBracket : ruleTypeConstrBracket EOF ;
    public final void entryRuleTypeConstrBracket() throws RecognitionException {
        try {
            // InternalBSharp.g:586:1: ( ruleTypeConstrBracket EOF )
            // InternalBSharp.g:587:1: ruleTypeConstrBracket EOF
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
    // InternalBSharp.g:594:1: ruleTypeConstrBracket : ( ( rule__TypeConstrBracket__Group__0 ) ) ;
    public final void ruleTypeConstrBracket() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:598:2: ( ( ( rule__TypeConstrBracket__Group__0 ) ) )
            // InternalBSharp.g:599:2: ( ( rule__TypeConstrBracket__Group__0 ) )
            {
            // InternalBSharp.g:599:2: ( ( rule__TypeConstrBracket__Group__0 ) )
            // InternalBSharp.g:600:3: ( rule__TypeConstrBracket__Group__0 )
            {
             before(grammarAccess.getTypeConstrBracketAccess().getGroup()); 
            // InternalBSharp.g:601:3: ( rule__TypeConstrBracket__Group__0 )
            // InternalBSharp.g:601:4: rule__TypeConstrBracket__Group__0
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
    // InternalBSharp.g:610:1: entryRuleTypeDeclContext : ruleTypeDeclContext EOF ;
    public final void entryRuleTypeDeclContext() throws RecognitionException {
        try {
            // InternalBSharp.g:611:1: ( ruleTypeDeclContext EOF )
            // InternalBSharp.g:612:1: ruleTypeDeclContext EOF
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
    // InternalBSharp.g:619:1: ruleTypeDeclContext : ( ( rule__TypeDeclContext__Group__0 ) ) ;
    public final void ruleTypeDeclContext() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:623:2: ( ( ( rule__TypeDeclContext__Group__0 ) ) )
            // InternalBSharp.g:624:2: ( ( rule__TypeDeclContext__Group__0 ) )
            {
            // InternalBSharp.g:624:2: ( ( rule__TypeDeclContext__Group__0 ) )
            // InternalBSharp.g:625:3: ( rule__TypeDeclContext__Group__0 )
            {
             before(grammarAccess.getTypeDeclContextAccess().getGroup()); 
            // InternalBSharp.g:626:3: ( rule__TypeDeclContext__Group__0 )
            // InternalBSharp.g:626:4: rule__TypeDeclContext__Group__0
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
    // InternalBSharp.g:635:1: entryRuleWhere : ruleWhere EOF ;
    public final void entryRuleWhere() throws RecognitionException {
        try {
            // InternalBSharp.g:636:1: ( ruleWhere EOF )
            // InternalBSharp.g:637:1: ruleWhere EOF
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
    // InternalBSharp.g:644:1: ruleWhere : ( ( rule__Where__Group__0 ) ) ;
    public final void ruleWhere() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:648:2: ( ( ( rule__Where__Group__0 ) ) )
            // InternalBSharp.g:649:2: ( ( rule__Where__Group__0 ) )
            {
            // InternalBSharp.g:649:2: ( ( rule__Where__Group__0 ) )
            // InternalBSharp.g:650:3: ( rule__Where__Group__0 )
            {
             before(grammarAccess.getWhereAccess().getGroup()); 
            // InternalBSharp.g:651:3: ( rule__Where__Group__0 )
            // InternalBSharp.g:651:4: rule__Where__Group__0
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
    // InternalBSharp.g:660:1: entryRuleDatatype : ruleDatatype EOF ;
    public final void entryRuleDatatype() throws RecognitionException {
        try {
            // InternalBSharp.g:661:1: ( ruleDatatype EOF )
            // InternalBSharp.g:662:1: ruleDatatype EOF
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
    // InternalBSharp.g:669:1: ruleDatatype : ( ( rule__Datatype__Group__0 ) ) ;
    public final void ruleDatatype() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:673:2: ( ( ( rule__Datatype__Group__0 ) ) )
            // InternalBSharp.g:674:2: ( ( rule__Datatype__Group__0 ) )
            {
            // InternalBSharp.g:674:2: ( ( rule__Datatype__Group__0 ) )
            // InternalBSharp.g:675:3: ( rule__Datatype__Group__0 )
            {
             before(grammarAccess.getDatatypeAccess().getGroup()); 
            // InternalBSharp.g:676:3: ( rule__Datatype__Group__0 )
            // InternalBSharp.g:676:4: rule__Datatype__Group__0
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
    // InternalBSharp.g:685:1: entryRuleDatatypeConstructor : ruleDatatypeConstructor EOF ;
    public final void entryRuleDatatypeConstructor() throws RecognitionException {
        try {
            // InternalBSharp.g:686:1: ( ruleDatatypeConstructor EOF )
            // InternalBSharp.g:687:1: ruleDatatypeConstructor EOF
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
    // InternalBSharp.g:694:1: ruleDatatypeConstructor : ( ( rule__DatatypeConstructor__Group__0 ) ) ;
    public final void ruleDatatypeConstructor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:698:2: ( ( ( rule__DatatypeConstructor__Group__0 ) ) )
            // InternalBSharp.g:699:2: ( ( rule__DatatypeConstructor__Group__0 ) )
            {
            // InternalBSharp.g:699:2: ( ( rule__DatatypeConstructor__Group__0 ) )
            // InternalBSharp.g:700:3: ( rule__DatatypeConstructor__Group__0 )
            {
             before(grammarAccess.getDatatypeConstructorAccess().getGroup()); 
            // InternalBSharp.g:701:3: ( rule__DatatypeConstructor__Group__0 )
            // InternalBSharp.g:701:4: rule__DatatypeConstructor__Group__0
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
    // InternalBSharp.g:710:1: entryRuleExtend : ruleExtend EOF ;
    public final void entryRuleExtend() throws RecognitionException {
        try {
            // InternalBSharp.g:711:1: ( ruleExtend EOF )
            // InternalBSharp.g:712:1: ruleExtend EOF
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
    // InternalBSharp.g:719:1: ruleExtend : ( ( rule__Extend__Group__0 ) ) ;
    public final void ruleExtend() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:723:2: ( ( ( rule__Extend__Group__0 ) ) )
            // InternalBSharp.g:724:2: ( ( rule__Extend__Group__0 ) )
            {
            // InternalBSharp.g:724:2: ( ( rule__Extend__Group__0 ) )
            // InternalBSharp.g:725:3: ( rule__Extend__Group__0 )
            {
             before(grammarAccess.getExtendAccess().getGroup()); 
            // InternalBSharp.g:726:3: ( rule__Extend__Group__0 )
            // InternalBSharp.g:726:4: rule__Extend__Group__0
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
    // InternalBSharp.g:735:1: entryRuleBSharpBlock : ruleBSharpBlock EOF ;
    public final void entryRuleBSharpBlock() throws RecognitionException {
        try {
            // InternalBSharp.g:736:1: ( ruleBSharpBlock EOF )
            // InternalBSharp.g:737:1: ruleBSharpBlock EOF
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
    // InternalBSharp.g:744:1: ruleBSharpBlock : ( ( rule__BSharpBlock__Group__0 ) ) ;
    public final void ruleBSharpBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:748:2: ( ( ( rule__BSharpBlock__Group__0 ) ) )
            // InternalBSharp.g:749:2: ( ( rule__BSharpBlock__Group__0 ) )
            {
            // InternalBSharp.g:749:2: ( ( rule__BSharpBlock__Group__0 ) )
            // InternalBSharp.g:750:3: ( rule__BSharpBlock__Group__0 )
            {
             before(grammarAccess.getBSharpBlockAccess().getGroup()); 
            // InternalBSharp.g:751:3: ( rule__BSharpBlock__Group__0 )
            // InternalBSharp.g:751:4: rule__BSharpBlock__Group__0
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
    // InternalBSharp.g:760:1: entryRuleFunctionDecl : ruleFunctionDecl EOF ;
    public final void entryRuleFunctionDecl() throws RecognitionException {
        try {
            // InternalBSharp.g:761:1: ( ruleFunctionDecl EOF )
            // InternalBSharp.g:762:1: ruleFunctionDecl EOF
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
    // InternalBSharp.g:769:1: ruleFunctionDecl : ( ( rule__FunctionDecl__Group__0 ) ) ;
    public final void ruleFunctionDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:773:2: ( ( ( rule__FunctionDecl__Group__0 ) ) )
            // InternalBSharp.g:774:2: ( ( rule__FunctionDecl__Group__0 ) )
            {
            // InternalBSharp.g:774:2: ( ( rule__FunctionDecl__Group__0 ) )
            // InternalBSharp.g:775:3: ( rule__FunctionDecl__Group__0 )
            {
             before(grammarAccess.getFunctionDeclAccess().getGroup()); 
            // InternalBSharp.g:776:3: ( rule__FunctionDecl__Group__0 )
            // InternalBSharp.g:776:4: rule__FunctionDecl__Group__0
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
    // InternalBSharp.g:785:1: entryRuleMatchStatement : ruleMatchStatement EOF ;
    public final void entryRuleMatchStatement() throws RecognitionException {
        try {
            // InternalBSharp.g:786:1: ( ruleMatchStatement EOF )
            // InternalBSharp.g:787:1: ruleMatchStatement EOF
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
    // InternalBSharp.g:794:1: ruleMatchStatement : ( ( rule__MatchStatement__Group__0 ) ) ;
    public final void ruleMatchStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:798:2: ( ( ( rule__MatchStatement__Group__0 ) ) )
            // InternalBSharp.g:799:2: ( ( rule__MatchStatement__Group__0 ) )
            {
            // InternalBSharp.g:799:2: ( ( rule__MatchStatement__Group__0 ) )
            // InternalBSharp.g:800:3: ( rule__MatchStatement__Group__0 )
            {
             before(grammarAccess.getMatchStatementAccess().getGroup()); 
            // InternalBSharp.g:801:3: ( rule__MatchStatement__Group__0 )
            // InternalBSharp.g:801:4: rule__MatchStatement__Group__0
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
    // InternalBSharp.g:810:1: entryRuleMatchCase : ruleMatchCase EOF ;
    public final void entryRuleMatchCase() throws RecognitionException {
        try {
            // InternalBSharp.g:811:1: ( ruleMatchCase EOF )
            // InternalBSharp.g:812:1: ruleMatchCase EOF
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
    // InternalBSharp.g:819:1: ruleMatchCase : ( ( rule__MatchCase__Group__0 ) ) ;
    public final void ruleMatchCase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:823:2: ( ( ( rule__MatchCase__Group__0 ) ) )
            // InternalBSharp.g:824:2: ( ( rule__MatchCase__Group__0 ) )
            {
            // InternalBSharp.g:824:2: ( ( rule__MatchCase__Group__0 ) )
            // InternalBSharp.g:825:3: ( rule__MatchCase__Group__0 )
            {
             before(grammarAccess.getMatchCaseAccess().getGroup()); 
            // InternalBSharp.g:826:3: ( rule__MatchCase__Group__0 )
            // InternalBSharp.g:826:4: rule__MatchCase__Group__0
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
    // InternalBSharp.g:835:1: entryRuleTheoremBody : ruleTheoremBody EOF ;
    public final void entryRuleTheoremBody() throws RecognitionException {
        try {
            // InternalBSharp.g:836:1: ( ruleTheoremBody EOF )
            // InternalBSharp.g:837:1: ruleTheoremBody EOF
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
    // InternalBSharp.g:844:1: ruleTheoremBody : ( ( rule__TheoremBody__Group__0 ) ) ;
    public final void ruleTheoremBody() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:848:2: ( ( ( rule__TheoremBody__Group__0 ) ) )
            // InternalBSharp.g:849:2: ( ( rule__TheoremBody__Group__0 ) )
            {
            // InternalBSharp.g:849:2: ( ( rule__TheoremBody__Group__0 ) )
            // InternalBSharp.g:850:3: ( rule__TheoremBody__Group__0 )
            {
             before(grammarAccess.getTheoremBodyAccess().getGroup()); 
            // InternalBSharp.g:851:3: ( rule__TheoremBody__Group__0 )
            // InternalBSharp.g:851:4: rule__TheoremBody__Group__0
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
    // InternalBSharp.g:860:1: entryRuleTheoremDecl : ruleTheoremDecl EOF ;
    public final void entryRuleTheoremDecl() throws RecognitionException {
        try {
            // InternalBSharp.g:861:1: ( ruleTheoremDecl EOF )
            // InternalBSharp.g:862:1: ruleTheoremDecl EOF
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
    // InternalBSharp.g:869:1: ruleTheoremDecl : ( ( rule__TheoremDecl__Group__0 ) ) ;
    public final void ruleTheoremDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:873:2: ( ( ( rule__TheoremDecl__Group__0 ) ) )
            // InternalBSharp.g:874:2: ( ( rule__TheoremDecl__Group__0 ) )
            {
            // InternalBSharp.g:874:2: ( ( rule__TheoremDecl__Group__0 ) )
            // InternalBSharp.g:875:3: ( rule__TheoremDecl__Group__0 )
            {
             before(grammarAccess.getTheoremDeclAccess().getGroup()); 
            // InternalBSharp.g:876:3: ( rule__TheoremDecl__Group__0 )
            // InternalBSharp.g:876:4: rule__TheoremDecl__Group__0
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
    // InternalBSharp.g:885:1: entryRuleTypedVariableList : ruleTypedVariableList EOF ;
    public final void entryRuleTypedVariableList() throws RecognitionException {
        try {
            // InternalBSharp.g:886:1: ( ruleTypedVariableList EOF )
            // InternalBSharp.g:887:1: ruleTypedVariableList EOF
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
    // InternalBSharp.g:894:1: ruleTypedVariableList : ( ( rule__TypedVariableList__Group__0 ) ) ;
    public final void ruleTypedVariableList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:898:2: ( ( ( rule__TypedVariableList__Group__0 ) ) )
            // InternalBSharp.g:899:2: ( ( rule__TypedVariableList__Group__0 ) )
            {
            // InternalBSharp.g:899:2: ( ( rule__TypedVariableList__Group__0 ) )
            // InternalBSharp.g:900:3: ( rule__TypedVariableList__Group__0 )
            {
             before(grammarAccess.getTypedVariableListAccess().getGroup()); 
            // InternalBSharp.g:901:3: ( rule__TypedVariableList__Group__0 )
            // InternalBSharp.g:901:4: rule__TypedVariableList__Group__0
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
    // InternalBSharp.g:910:1: entryRuleVariableTyping : ruleVariableTyping EOF ;
    public final void entryRuleVariableTyping() throws RecognitionException {
        try {
            // InternalBSharp.g:911:1: ( ruleVariableTyping EOF )
            // InternalBSharp.g:912:1: ruleVariableTyping EOF
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
    // InternalBSharp.g:919:1: ruleVariableTyping : ( ( rule__VariableTyping__Group__0 ) ) ;
    public final void ruleVariableTyping() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:923:2: ( ( ( rule__VariableTyping__Group__0 ) ) )
            // InternalBSharp.g:924:2: ( ( rule__VariableTyping__Group__0 ) )
            {
            // InternalBSharp.g:924:2: ( ( rule__VariableTyping__Group__0 ) )
            // InternalBSharp.g:925:3: ( rule__VariableTyping__Group__0 )
            {
             before(grammarAccess.getVariableTypingAccess().getGroup()); 
            // InternalBSharp.g:926:3: ( rule__VariableTyping__Group__0 )
            // InternalBSharp.g:926:4: rule__VariableTyping__Group__0
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
    // InternalBSharp.g:935:1: entryRuleTypedVariable : ruleTypedVariable EOF ;
    public final void entryRuleTypedVariable() throws RecognitionException {
        try {
            // InternalBSharp.g:936:1: ( ruleTypedVariable EOF )
            // InternalBSharp.g:937:1: ruleTypedVariable EOF
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
    // InternalBSharp.g:944:1: ruleTypedVariable : ( ( rule__TypedVariable__NameAssignment ) ) ;
    public final void ruleTypedVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:948:2: ( ( ( rule__TypedVariable__NameAssignment ) ) )
            // InternalBSharp.g:949:2: ( ( rule__TypedVariable__NameAssignment ) )
            {
            // InternalBSharp.g:949:2: ( ( rule__TypedVariable__NameAssignment ) )
            // InternalBSharp.g:950:3: ( rule__TypedVariable__NameAssignment )
            {
             before(grammarAccess.getTypedVariableAccess().getNameAssignment()); 
            // InternalBSharp.g:951:3: ( rule__TypedVariable__NameAssignment )
            // InternalBSharp.g:951:4: rule__TypedVariable__NameAssignment
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
    // InternalBSharp.g:960:1: entryRuleLambda : ruleLambda EOF ;
    public final void entryRuleLambda() throws RecognitionException {
        try {
            // InternalBSharp.g:961:1: ( ruleLambda EOF )
            // InternalBSharp.g:962:1: ruleLambda EOF
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
    // InternalBSharp.g:969:1: ruleLambda : ( ( rule__Lambda__Group__0 ) ) ;
    public final void ruleLambda() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:973:2: ( ( ( rule__Lambda__Group__0 ) ) )
            // InternalBSharp.g:974:2: ( ( rule__Lambda__Group__0 ) )
            {
            // InternalBSharp.g:974:2: ( ( rule__Lambda__Group__0 ) )
            // InternalBSharp.g:975:3: ( rule__Lambda__Group__0 )
            {
             before(grammarAccess.getLambdaAccess().getGroup()); 
            // InternalBSharp.g:976:3: ( rule__Lambda__Group__0 )
            // InternalBSharp.g:976:4: rule__Lambda__Group__0
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
    // InternalBSharp.g:985:1: entryRuleQuantifier : ruleQuantifier EOF ;
    public final void entryRuleQuantifier() throws RecognitionException {
        try {
            // InternalBSharp.g:986:1: ( ruleQuantifier EOF )
            // InternalBSharp.g:987:1: ruleQuantifier EOF
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
    // InternalBSharp.g:994:1: ruleQuantifier : ( ( rule__Quantifier__Group__0 ) ) ;
    public final void ruleQuantifier() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:998:2: ( ( ( rule__Quantifier__Group__0 ) ) )
            // InternalBSharp.g:999:2: ( ( rule__Quantifier__Group__0 ) )
            {
            // InternalBSharp.g:999:2: ( ( rule__Quantifier__Group__0 ) )
            // InternalBSharp.g:1000:3: ( rule__Quantifier__Group__0 )
            {
             before(grammarAccess.getQuantifierAccess().getGroup()); 
            // InternalBSharp.g:1001:3: ( rule__Quantifier__Group__0 )
            // InternalBSharp.g:1001:4: rule__Quantifier__Group__0
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
    // InternalBSharp.g:1010:1: entryRuleRootExpression : ruleRootExpression EOF ;
    public final void entryRuleRootExpression() throws RecognitionException {
        try {
            // InternalBSharp.g:1011:1: ( ruleRootExpression EOF )
            // InternalBSharp.g:1012:1: ruleRootExpression EOF
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
    // InternalBSharp.g:1019:1: ruleRootExpression : ( ( rule__RootExpression__Alternatives ) ) ;
    public final void ruleRootExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1023:2: ( ( ( rule__RootExpression__Alternatives ) ) )
            // InternalBSharp.g:1024:2: ( ( rule__RootExpression__Alternatives ) )
            {
            // InternalBSharp.g:1024:2: ( ( rule__RootExpression__Alternatives ) )
            // InternalBSharp.g:1025:3: ( rule__RootExpression__Alternatives )
            {
             before(grammarAccess.getRootExpressionAccess().getAlternatives()); 
            // InternalBSharp.g:1026:3: ( rule__RootExpression__Alternatives )
            // InternalBSharp.g:1026:4: rule__RootExpression__Alternatives
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
    // InternalBSharp.g:1035:1: entryRulePrefix : rulePrefix EOF ;
    public final void entryRulePrefix() throws RecognitionException {
        try {
            // InternalBSharp.g:1036:1: ( rulePrefix EOF )
            // InternalBSharp.g:1037:1: rulePrefix EOF
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
    // InternalBSharp.g:1044:1: rulePrefix : ( ( rule__Prefix__Group__0 ) ) ;
    public final void rulePrefix() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1048:2: ( ( ( rule__Prefix__Group__0 ) ) )
            // InternalBSharp.g:1049:2: ( ( rule__Prefix__Group__0 ) )
            {
            // InternalBSharp.g:1049:2: ( ( rule__Prefix__Group__0 ) )
            // InternalBSharp.g:1050:3: ( rule__Prefix__Group__0 )
            {
             before(grammarAccess.getPrefixAccess().getGroup()); 
            // InternalBSharp.g:1051:3: ( rule__Prefix__Group__0 )
            // InternalBSharp.g:1051:4: rule__Prefix__Group__0
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
    // InternalBSharp.g:1060:1: entryRulePrefixBuiltIn : rulePrefixBuiltIn EOF ;
    public final void entryRulePrefixBuiltIn() throws RecognitionException {
        try {
            // InternalBSharp.g:1061:1: ( rulePrefixBuiltIn EOF )
            // InternalBSharp.g:1062:1: rulePrefixBuiltIn EOF
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
    // InternalBSharp.g:1069:1: rulePrefixBuiltIn : ( '\\u00AC' ) ;
    public final void rulePrefixBuiltIn() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1073:2: ( ( '\\u00AC' ) )
            // InternalBSharp.g:1074:2: ( '\\u00AC' )
            {
            // InternalBSharp.g:1074:2: ( '\\u00AC' )
            // InternalBSharp.g:1075:3: '\\u00AC'
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
    // InternalBSharp.g:1085:1: entryRuleInfix : ruleInfix EOF ;
    public final void entryRuleInfix() throws RecognitionException {
        try {
            // InternalBSharp.g:1086:1: ( ruleInfix EOF )
            // InternalBSharp.g:1087:1: ruleInfix EOF
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
    // InternalBSharp.g:1094:1: ruleInfix : ( ( rule__Infix__Group__0 ) ) ;
    public final void ruleInfix() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1098:2: ( ( ( rule__Infix__Group__0 ) ) )
            // InternalBSharp.g:1099:2: ( ( rule__Infix__Group__0 ) )
            {
            // InternalBSharp.g:1099:2: ( ( rule__Infix__Group__0 ) )
            // InternalBSharp.g:1100:3: ( rule__Infix__Group__0 )
            {
             before(grammarAccess.getInfixAccess().getGroup()); 
            // InternalBSharp.g:1101:3: ( rule__Infix__Group__0 )
            // InternalBSharp.g:1101:4: rule__Infix__Group__0
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
    // InternalBSharp.g:1110:1: entryRuleElement : ruleElement EOF ;
    public final void entryRuleElement() throws RecognitionException {
        try {
            // InternalBSharp.g:1111:1: ( ruleElement EOF )
            // InternalBSharp.g:1112:1: ruleElement EOF
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
    // InternalBSharp.g:1119:1: ruleElement : ( ( rule__Element__Alternatives ) ) ;
    public final void ruleElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1123:2: ( ( ( rule__Element__Alternatives ) ) )
            // InternalBSharp.g:1124:2: ( ( rule__Element__Alternatives ) )
            {
            // InternalBSharp.g:1124:2: ( ( rule__Element__Alternatives ) )
            // InternalBSharp.g:1125:3: ( rule__Element__Alternatives )
            {
             before(grammarAccess.getElementAccess().getAlternatives()); 
            // InternalBSharp.g:1126:3: ( rule__Element__Alternatives )
            // InternalBSharp.g:1126:4: rule__Element__Alternatives
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
    // InternalBSharp.g:1135:1: entryRuleBracket : ruleBracket EOF ;
    public final void entryRuleBracket() throws RecognitionException {
        try {
            // InternalBSharp.g:1136:1: ( ruleBracket EOF )
            // InternalBSharp.g:1137:1: ruleBracket EOF
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
    // InternalBSharp.g:1144:1: ruleBracket : ( ( rule__Bracket__Group__0 ) ) ;
    public final void ruleBracket() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1148:2: ( ( ( rule__Bracket__Group__0 ) ) )
            // InternalBSharp.g:1149:2: ( ( rule__Bracket__Group__0 ) )
            {
            // InternalBSharp.g:1149:2: ( ( rule__Bracket__Group__0 ) )
            // InternalBSharp.g:1150:3: ( rule__Bracket__Group__0 )
            {
             before(grammarAccess.getBracketAccess().getGroup()); 
            // InternalBSharp.g:1151:3: ( rule__Bracket__Group__0 )
            // InternalBSharp.g:1151:4: rule__Bracket__Group__0
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
    // InternalBSharp.g:1160:1: entryRuleFunctionCall : ruleFunctionCall EOF ;
    public final void entryRuleFunctionCall() throws RecognitionException {
        try {
            // InternalBSharp.g:1161:1: ( ruleFunctionCall EOF )
            // InternalBSharp.g:1162:1: ruleFunctionCall EOF
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
    // InternalBSharp.g:1169:1: ruleFunctionCall : ( ( rule__FunctionCall__Group__0 ) ) ;
    public final void ruleFunctionCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1173:2: ( ( ( rule__FunctionCall__Group__0 ) ) )
            // InternalBSharp.g:1174:2: ( ( rule__FunctionCall__Group__0 ) )
            {
            // InternalBSharp.g:1174:2: ( ( rule__FunctionCall__Group__0 ) )
            // InternalBSharp.g:1175:3: ( rule__FunctionCall__Group__0 )
            {
             before(grammarAccess.getFunctionCallAccess().getGroup()); 
            // InternalBSharp.g:1176:3: ( rule__FunctionCall__Group__0 )
            // InternalBSharp.g:1176:4: rule__FunctionCall__Group__0
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
    // InternalBSharp.g:1185:1: entryRuleClassVarDecl : ruleClassVarDecl EOF ;
    public final void entryRuleClassVarDecl() throws RecognitionException {
        try {
            // InternalBSharp.g:1186:1: ( ruleClassVarDecl EOF )
            // InternalBSharp.g:1187:1: ruleClassVarDecl EOF
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
    // InternalBSharp.g:1194:1: ruleClassVarDecl : ( ( rule__ClassVarDecl__Group__0 ) ) ;
    public final void ruleClassVarDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1198:2: ( ( ( rule__ClassVarDecl__Group__0 ) ) )
            // InternalBSharp.g:1199:2: ( ( rule__ClassVarDecl__Group__0 ) )
            {
            // InternalBSharp.g:1199:2: ( ( rule__ClassVarDecl__Group__0 ) )
            // InternalBSharp.g:1200:3: ( rule__ClassVarDecl__Group__0 )
            {
             before(grammarAccess.getClassVarDeclAccess().getGroup()); 
            // InternalBSharp.g:1201:3: ( rule__ClassVarDecl__Group__0 )
            // InternalBSharp.g:1201:4: rule__ClassVarDecl__Group__0
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
    // InternalBSharp.g:1210:1: entryRuleInbuiltInfix : ruleInbuiltInfix EOF ;
    public final void entryRuleInbuiltInfix() throws RecognitionException {
        try {
            // InternalBSharp.g:1211:1: ( ruleInbuiltInfix EOF )
            // InternalBSharp.g:1212:1: ruleInbuiltInfix EOF
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
    // InternalBSharp.g:1219:1: ruleInbuiltInfix : ( ( rule__InbuiltInfix__Alternatives ) ) ;
    public final void ruleInbuiltInfix() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1223:2: ( ( ( rule__InbuiltInfix__Alternatives ) ) )
            // InternalBSharp.g:1224:2: ( ( rule__InbuiltInfix__Alternatives ) )
            {
            // InternalBSharp.g:1224:2: ( ( rule__InbuiltInfix__Alternatives ) )
            // InternalBSharp.g:1225:3: ( rule__InbuiltInfix__Alternatives )
            {
             before(grammarAccess.getInbuiltInfixAccess().getAlternatives()); 
            // InternalBSharp.g:1226:3: ( rule__InbuiltInfix__Alternatives )
            // InternalBSharp.g:1226:4: rule__InbuiltInfix__Alternatives
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
    // InternalBSharp.g:1235:1: entryRuleInstance : ruleInstance EOF ;
    public final void entryRuleInstance() throws RecognitionException {
        try {
            // InternalBSharp.g:1236:1: ( ruleInstance EOF )
            // InternalBSharp.g:1237:1: ruleInstance EOF
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
    // InternalBSharp.g:1244:1: ruleInstance : ( ( rule__Instance__Group__0 ) ) ;
    public final void ruleInstance() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1248:2: ( ( ( rule__Instance__Group__0 ) ) )
            // InternalBSharp.g:1249:2: ( ( rule__Instance__Group__0 ) )
            {
            // InternalBSharp.g:1249:2: ( ( rule__Instance__Group__0 ) )
            // InternalBSharp.g:1250:3: ( rule__Instance__Group__0 )
            {
             before(grammarAccess.getInstanceAccess().getGroup()); 
            // InternalBSharp.g:1251:3: ( rule__Instance__Group__0 )
            // InternalBSharp.g:1251:4: rule__Instance__Group__0
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
    // InternalBSharp.g:1259:1: rule__THM_NAME__Alternatives_0 : ( ( RULE_INT ) | ( RULE_ID ) | ( RULE_WS ) );
    public final void rule__THM_NAME__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1263:1: ( ( RULE_INT ) | ( RULE_ID ) | ( RULE_WS ) )
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
                    // InternalBSharp.g:1264:2: ( RULE_INT )
                    {
                    // InternalBSharp.g:1264:2: ( RULE_INT )
                    // InternalBSharp.g:1265:3: RULE_INT
                    {
                     before(grammarAccess.getTHM_NAMEAccess().getINTTerminalRuleCall_0_0()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getTHM_NAMEAccess().getINTTerminalRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBSharp.g:1270:2: ( RULE_ID )
                    {
                    // InternalBSharp.g:1270:2: ( RULE_ID )
                    // InternalBSharp.g:1271:3: RULE_ID
                    {
                     before(grammarAccess.getTHM_NAMEAccess().getIDTerminalRuleCall_0_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getTHM_NAMEAccess().getIDTerminalRuleCall_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBSharp.g:1276:2: ( RULE_WS )
                    {
                    // InternalBSharp.g:1276:2: ( RULE_WS )
                    // InternalBSharp.g:1277:3: RULE_WS
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
    // InternalBSharp.g:1286:1: rule__ClassDecl__Alternatives : ( ( ruleClass ) | ( ruleDatatype ) );
    public final void rule__ClassDecl__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1290:1: ( ( ruleClass ) | ( ruleDatatype ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==36) ) {
                alt3=1;
            }
            else if ( (LA3_0==47) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalBSharp.g:1291:2: ( ruleClass )
                    {
                    // InternalBSharp.g:1291:2: ( ruleClass )
                    // InternalBSharp.g:1292:3: ruleClass
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
                    // InternalBSharp.g:1297:2: ( ruleDatatype )
                    {
                    // InternalBSharp.g:1297:2: ( ruleDatatype )
                    // InternalBSharp.g:1298:3: ruleDatatype
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
    // InternalBSharp.g:1307:1: rule__TopLevelImport__Alternatives_0 : ( ( ( rule__TopLevelImport__GlobalImportsAssignment_0_0 ) ) | ( ( rule__TopLevelImport__LocalImportsAssignment_0_1 ) ) );
    public final void rule__TopLevelImport__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1311:1: ( ( ( rule__TopLevelImport__GlobalImportsAssignment_0_0 ) ) | ( ( rule__TopLevelImport__LocalImportsAssignment_0_1 ) ) )
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
                    // InternalBSharp.g:1312:2: ( ( rule__TopLevelImport__GlobalImportsAssignment_0_0 ) )
                    {
                    // InternalBSharp.g:1312:2: ( ( rule__TopLevelImport__GlobalImportsAssignment_0_0 ) )
                    // InternalBSharp.g:1313:3: ( rule__TopLevelImport__GlobalImportsAssignment_0_0 )
                    {
                     before(grammarAccess.getTopLevelImportAccess().getGlobalImportsAssignment_0_0()); 
                    // InternalBSharp.g:1314:3: ( rule__TopLevelImport__GlobalImportsAssignment_0_0 )
                    // InternalBSharp.g:1314:4: rule__TopLevelImport__GlobalImportsAssignment_0_0
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
                    // InternalBSharp.g:1318:2: ( ( rule__TopLevelImport__LocalImportsAssignment_0_1 ) )
                    {
                    // InternalBSharp.g:1318:2: ( ( rule__TopLevelImport__LocalImportsAssignment_0_1 ) )
                    // InternalBSharp.g:1319:3: ( rule__TopLevelImport__LocalImportsAssignment_0_1 )
                    {
                     before(grammarAccess.getTopLevelImportAccess().getLocalImportsAssignment_0_1()); 
                    // InternalBSharp.g:1320:3: ( rule__TopLevelImport__LocalImportsAssignment_0_1 )
                    // InternalBSharp.g:1320:4: rule__TopLevelImport__LocalImportsAssignment_0_1
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
    // InternalBSharp.g:1328:1: rule__BodyElements__Alternatives : ( ( ( rule__BodyElements__ClassesAssignment_0 ) ) | ( ( rule__BodyElements__ExtendsAssignment_1 ) ) );
    public final void rule__BodyElements__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1332:1: ( ( ( rule__BodyElements__ClassesAssignment_0 ) ) | ( ( rule__BodyElements__ExtendsAssignment_1 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==36||LA5_0==47) ) {
                alt5=1;
            }
            else if ( (LA5_0==49) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalBSharp.g:1333:2: ( ( rule__BodyElements__ClassesAssignment_0 ) )
                    {
                    // InternalBSharp.g:1333:2: ( ( rule__BodyElements__ClassesAssignment_0 ) )
                    // InternalBSharp.g:1334:3: ( rule__BodyElements__ClassesAssignment_0 )
                    {
                     before(grammarAccess.getBodyElementsAccess().getClassesAssignment_0()); 
                    // InternalBSharp.g:1335:3: ( rule__BodyElements__ClassesAssignment_0 )
                    // InternalBSharp.g:1335:4: rule__BodyElements__ClassesAssignment_0
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
                    // InternalBSharp.g:1339:2: ( ( rule__BodyElements__ExtendsAssignment_1 ) )
                    {
                    // InternalBSharp.g:1339:2: ( ( rule__BodyElements__ExtendsAssignment_1 ) )
                    // InternalBSharp.g:1340:3: ( rule__BodyElements__ExtendsAssignment_1 )
                    {
                     before(grammarAccess.getBodyElementsAccess().getExtendsAssignment_1()); 
                    // InternalBSharp.g:1341:3: ( rule__BodyElements__ExtendsAssignment_1 )
                    // InternalBSharp.g:1341:4: rule__BodyElements__ExtendsAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__BodyElements__ExtendsAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getBodyElementsAccess().getExtendsAssignment_1()); 

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
    // InternalBSharp.g:1349:1: rule__FileImport__Alternatives_1_1 : ( ( '*' ) | ( ( rule__FileImport__TypeAssignment_1_1_1 ) ) );
    public final void rule__FileImport__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1353:1: ( ( '*' ) | ( ( rule__FileImport__TypeAssignment_1_1_1 ) ) )
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
                    // InternalBSharp.g:1354:2: ( '*' )
                    {
                    // InternalBSharp.g:1354:2: ( '*' )
                    // InternalBSharp.g:1355:3: '*'
                    {
                     before(grammarAccess.getFileImportAccess().getAsteriskKeyword_1_1_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getFileImportAccess().getAsteriskKeyword_1_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBSharp.g:1360:2: ( ( rule__FileImport__TypeAssignment_1_1_1 ) )
                    {
                    // InternalBSharp.g:1360:2: ( ( rule__FileImport__TypeAssignment_1_1_1 ) )
                    // InternalBSharp.g:1361:3: ( rule__FileImport__TypeAssignment_1_1_1 )
                    {
                     before(grammarAccess.getFileImportAccess().getTypeAssignment_1_1_1()); 
                    // InternalBSharp.g:1362:3: ( rule__FileImport__TypeAssignment_1_1_1 )
                    // InternalBSharp.g:1362:4: rule__FileImport__TypeAssignment_1_1_1
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
    // InternalBSharp.g:1370:1: rule__BuiltinTypeInfixOp__Alternatives : ( ( '\\u00D7' ) | ( '\\u2192' ) | ( '\\uE102' ) | ( '\\uE100' ) | ( '\\u2194' ) | ( '\\u2916' ) | ( '\\u21F8' ) | ( '\\u21A3' ) | ( '\\u2900' ) | ( '\\u21A0' ) );
    public final void rule__BuiltinTypeInfixOp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1374:1: ( ( '\\u00D7' ) | ( '\\u2192' ) | ( '\\uE102' ) | ( '\\uE100' ) | ( '\\u2194' ) | ( '\\u2916' ) | ( '\\u21F8' ) | ( '\\u21A3' ) | ( '\\u2900' ) | ( '\\u21A0' ) )
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
                    // InternalBSharp.g:1375:2: ( '\\u00D7' )
                    {
                    // InternalBSharp.g:1375:2: ( '\\u00D7' )
                    // InternalBSharp.g:1376:3: '\\u00D7'
                    {
                     before(grammarAccess.getBuiltinTypeInfixOpAccess().getMultiplicationSignKeyword_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getBuiltinTypeInfixOpAccess().getMultiplicationSignKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBSharp.g:1381:2: ( '\\u2192' )
                    {
                    // InternalBSharp.g:1381:2: ( '\\u2192' )
                    // InternalBSharp.g:1382:3: '\\u2192'
                    {
                     before(grammarAccess.getBuiltinTypeInfixOpAccess().getRightwardsArrowKeyword_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getBuiltinTypeInfixOpAccess().getRightwardsArrowKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBSharp.g:1387:2: ( '\\uE102' )
                    {
                    // InternalBSharp.g:1387:2: ( '\\uE102' )
                    // InternalBSharp.g:1388:3: '\\uE102'
                    {
                     before(grammarAccess.getBuiltinTypeInfixOpAccess().getPrivateUseAreaE102Keyword_2()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getBuiltinTypeInfixOpAccess().getPrivateUseAreaE102Keyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalBSharp.g:1393:2: ( '\\uE100' )
                    {
                    // InternalBSharp.g:1393:2: ( '\\uE100' )
                    // InternalBSharp.g:1394:3: '\\uE100'
                    {
                     before(grammarAccess.getBuiltinTypeInfixOpAccess().getPrivateUseAreaE100Keyword_3()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getBuiltinTypeInfixOpAccess().getPrivateUseAreaE100Keyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalBSharp.g:1399:2: ( '\\u2194' )
                    {
                    // InternalBSharp.g:1399:2: ( '\\u2194' )
                    // InternalBSharp.g:1400:3: '\\u2194'
                    {
                     before(grammarAccess.getBuiltinTypeInfixOpAccess().getLeftRightArrowKeyword_4()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getBuiltinTypeInfixOpAccess().getLeftRightArrowKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalBSharp.g:1405:2: ( '\\u2916' )
                    {
                    // InternalBSharp.g:1405:2: ( '\\u2916' )
                    // InternalBSharp.g:1406:3: '\\u2916'
                    {
                     before(grammarAccess.getBuiltinTypeInfixOpAccess().getRightwardsTwoHeadedArrowWithTailKeyword_5()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getBuiltinTypeInfixOpAccess().getRightwardsTwoHeadedArrowWithTailKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalBSharp.g:1411:2: ( '\\u21F8' )
                    {
                    // InternalBSharp.g:1411:2: ( '\\u21F8' )
                    // InternalBSharp.g:1412:3: '\\u21F8'
                    {
                     before(grammarAccess.getBuiltinTypeInfixOpAccess().getRightwardsArrowWithVerticalStrokeKeyword_6()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getBuiltinTypeInfixOpAccess().getRightwardsArrowWithVerticalStrokeKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalBSharp.g:1417:2: ( '\\u21A3' )
                    {
                    // InternalBSharp.g:1417:2: ( '\\u21A3' )
                    // InternalBSharp.g:1418:3: '\\u21A3'
                    {
                     before(grammarAccess.getBuiltinTypeInfixOpAccess().getRightwardsArrowWithTailKeyword_7()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getBuiltinTypeInfixOpAccess().getRightwardsArrowWithTailKeyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalBSharp.g:1423:2: ( '\\u2900' )
                    {
                    // InternalBSharp.g:1423:2: ( '\\u2900' )
                    // InternalBSharp.g:1424:3: '\\u2900'
                    {
                     before(grammarAccess.getBuiltinTypeInfixOpAccess().getRightwardsTwoHeadedArrowWithVerticalStrokeKeyword_8()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getBuiltinTypeInfixOpAccess().getRightwardsTwoHeadedArrowWithVerticalStrokeKeyword_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalBSharp.g:1429:2: ( '\\u21A0' )
                    {
                    // InternalBSharp.g:1429:2: ( '\\u21A0' )
                    // InternalBSharp.g:1430:3: '\\u21A0'
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
    // InternalBSharp.g:1439:1: rule__BuilderElem__Alternatives : ( ( ruleTypeConstructor ) | ( ruleTypeConstrBracket ) | ( ruleTypePowerSet ) );
    public final void rule__BuilderElem__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1443:1: ( ( ruleTypeConstructor ) | ( ruleTypeConstrBracket ) | ( ruleTypePowerSet ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt8=1;
                }
                break;
            case 40:
                {
                alt8=2;
                }
                break;
            case 45:
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
                    // InternalBSharp.g:1444:2: ( ruleTypeConstructor )
                    {
                    // InternalBSharp.g:1444:2: ( ruleTypeConstructor )
                    // InternalBSharp.g:1445:3: ruleTypeConstructor
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
                    // InternalBSharp.g:1450:2: ( ruleTypeConstrBracket )
                    {
                    // InternalBSharp.g:1450:2: ( ruleTypeConstrBracket )
                    // InternalBSharp.g:1451:3: ruleTypeConstrBracket
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
                    // InternalBSharp.g:1456:2: ( ruleTypePowerSet )
                    {
                    // InternalBSharp.g:1456:2: ( ruleTypePowerSet )
                    // InternalBSharp.g:1457:3: ruleTypePowerSet
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
    // InternalBSharp.g:1466:1: rule__BSharpBlock__Alternatives_2 : ( ( ( rule__BSharpBlock__FunctionsAssignment_2_0 ) ) | ( ( rule__BSharpBlock__TheoremsAssignment_2_1 ) ) | ( ( rule__BSharpBlock__InstancesAssignment_2_2 ) ) );
    public final void rule__BSharpBlock__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1470:1: ( ( ( rule__BSharpBlock__FunctionsAssignment_2_0 ) ) | ( ( rule__BSharpBlock__TheoremsAssignment_2_1 ) ) | ( ( rule__BSharpBlock__InstancesAssignment_2_2 ) ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt9=1;
                }
                break;
            case 53:
                {
                alt9=2;
                }
                break;
            case 55:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalBSharp.g:1471:2: ( ( rule__BSharpBlock__FunctionsAssignment_2_0 ) )
                    {
                    // InternalBSharp.g:1471:2: ( ( rule__BSharpBlock__FunctionsAssignment_2_0 ) )
                    // InternalBSharp.g:1472:3: ( rule__BSharpBlock__FunctionsAssignment_2_0 )
                    {
                     before(grammarAccess.getBSharpBlockAccess().getFunctionsAssignment_2_0()); 
                    // InternalBSharp.g:1473:3: ( rule__BSharpBlock__FunctionsAssignment_2_0 )
                    // InternalBSharp.g:1473:4: rule__BSharpBlock__FunctionsAssignment_2_0
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
                    // InternalBSharp.g:1477:2: ( ( rule__BSharpBlock__TheoremsAssignment_2_1 ) )
                    {
                    // InternalBSharp.g:1477:2: ( ( rule__BSharpBlock__TheoremsAssignment_2_1 ) )
                    // InternalBSharp.g:1478:3: ( rule__BSharpBlock__TheoremsAssignment_2_1 )
                    {
                     before(grammarAccess.getBSharpBlockAccess().getTheoremsAssignment_2_1()); 
                    // InternalBSharp.g:1479:3: ( rule__BSharpBlock__TheoremsAssignment_2_1 )
                    // InternalBSharp.g:1479:4: rule__BSharpBlock__TheoremsAssignment_2_1
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
                    // InternalBSharp.g:1483:2: ( ( rule__BSharpBlock__InstancesAssignment_2_2 ) )
                    {
                    // InternalBSharp.g:1483:2: ( ( rule__BSharpBlock__InstancesAssignment_2_2 ) )
                    // InternalBSharp.g:1484:3: ( rule__BSharpBlock__InstancesAssignment_2_2 )
                    {
                     before(grammarAccess.getBSharpBlockAccess().getInstancesAssignment_2_2()); 
                    // InternalBSharp.g:1485:3: ( rule__BSharpBlock__InstancesAssignment_2_2 )
                    // InternalBSharp.g:1485:4: rule__BSharpBlock__InstancesAssignment_2_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__BSharpBlock__InstancesAssignment_2_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getBSharpBlockAccess().getInstancesAssignment_2_2()); 

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
    // InternalBSharp.g:1493:1: rule__Quantifier__QTypeAlternatives_0_0 : ( ( '\\u2200' ) | ( '\\u2203' ) );
    public final void rule__Quantifier__QTypeAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1497:1: ( ( '\\u2200' ) | ( '\\u2203' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==23) ) {
                alt10=1;
            }
            else if ( (LA10_0==24) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalBSharp.g:1498:2: ( '\\u2200' )
                    {
                    // InternalBSharp.g:1498:2: ( '\\u2200' )
                    // InternalBSharp.g:1499:3: '\\u2200'
                    {
                     before(grammarAccess.getQuantifierAccess().getQTypeForAllKeyword_0_0_0()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getQuantifierAccess().getQTypeForAllKeyword_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBSharp.g:1504:2: ( '\\u2203' )
                    {
                    // InternalBSharp.g:1504:2: ( '\\u2203' )
                    // InternalBSharp.g:1505:3: '\\u2203'
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
    // InternalBSharp.g:1514:1: rule__RootExpression__Alternatives : ( ( ruleLambda ) | ( ruleQuantifier ) | ( ruleInfix ) | ( ruleMatchStatement ) );
    public final void rule__RootExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1518:1: ( ( ruleLambda ) | ( ruleQuantifier ) | ( ruleInfix ) | ( ruleMatchStatement ) )
            int alt11=4;
            switch ( input.LA(1) ) {
            case 57:
                {
                alt11=1;
                }
                break;
            case 23:
            case 24:
                {
                alt11=2;
                }
                break;
            case RULE_ID:
            case 11:
            case 40:
                {
                alt11=3;
                }
                break;
            case 52:
                {
                alt11=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalBSharp.g:1519:2: ( ruleLambda )
                    {
                    // InternalBSharp.g:1519:2: ( ruleLambda )
                    // InternalBSharp.g:1520:3: ruleLambda
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
                    // InternalBSharp.g:1525:2: ( ruleQuantifier )
                    {
                    // InternalBSharp.g:1525:2: ( ruleQuantifier )
                    // InternalBSharp.g:1526:3: ruleQuantifier
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
                    // InternalBSharp.g:1531:2: ( ruleInfix )
                    {
                    // InternalBSharp.g:1531:2: ( ruleInfix )
                    // InternalBSharp.g:1532:3: ruleInfix
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
                    // InternalBSharp.g:1537:2: ( ruleMatchStatement )
                    {
                    // InternalBSharp.g:1537:2: ( ruleMatchStatement )
                    // InternalBSharp.g:1538:3: ruleMatchStatement
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
    // InternalBSharp.g:1547:1: rule__Infix__Alternatives_1_1 : ( ( ( rule__Infix__FuncNameAssignment_1_1_0 ) ) | ( ( rule__Infix__OpNameAssignment_1_1_1 ) ) );
    public final void rule__Infix__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1551:1: ( ( ( rule__Infix__FuncNameAssignment_1_1_0 ) ) | ( ( rule__Infix__OpNameAssignment_1_1_1 ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                alt12=1;
            }
            else if ( ((LA12_0>=25 && LA12_0<=30)) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalBSharp.g:1552:2: ( ( rule__Infix__FuncNameAssignment_1_1_0 ) )
                    {
                    // InternalBSharp.g:1552:2: ( ( rule__Infix__FuncNameAssignment_1_1_0 ) )
                    // InternalBSharp.g:1553:3: ( rule__Infix__FuncNameAssignment_1_1_0 )
                    {
                     before(grammarAccess.getInfixAccess().getFuncNameAssignment_1_1_0()); 
                    // InternalBSharp.g:1554:3: ( rule__Infix__FuncNameAssignment_1_1_0 )
                    // InternalBSharp.g:1554:4: rule__Infix__FuncNameAssignment_1_1_0
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
                    // InternalBSharp.g:1558:2: ( ( rule__Infix__OpNameAssignment_1_1_1 ) )
                    {
                    // InternalBSharp.g:1558:2: ( ( rule__Infix__OpNameAssignment_1_1_1 ) )
                    // InternalBSharp.g:1559:3: ( rule__Infix__OpNameAssignment_1_1_1 )
                    {
                     before(grammarAccess.getInfixAccess().getOpNameAssignment_1_1_1()); 
                    // InternalBSharp.g:1560:3: ( rule__Infix__OpNameAssignment_1_1_1 )
                    // InternalBSharp.g:1560:4: rule__Infix__OpNameAssignment_1_1_1
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
    // InternalBSharp.g:1568:1: rule__Element__Alternatives : ( ( ruleBracket ) | ( rulePrefix ) | ( ruleFunctionCall ) );
    public final void rule__Element__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1572:1: ( ( ruleBracket ) | ( rulePrefix ) | ( ruleFunctionCall ) )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt13=1;
                }
                break;
            case 11:
                {
                alt13=2;
                }
                break;
            case RULE_ID:
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
                    // InternalBSharp.g:1573:2: ( ruleBracket )
                    {
                    // InternalBSharp.g:1573:2: ( ruleBracket )
                    // InternalBSharp.g:1574:3: ruleBracket
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
                    // InternalBSharp.g:1579:2: ( rulePrefix )
                    {
                    // InternalBSharp.g:1579:2: ( rulePrefix )
                    // InternalBSharp.g:1580:3: rulePrefix
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
                    // InternalBSharp.g:1585:2: ( ruleFunctionCall )
                    {
                    // InternalBSharp.g:1585:2: ( ruleFunctionCall )
                    // InternalBSharp.g:1586:3: ruleFunctionCall
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
    // InternalBSharp.g:1595:1: rule__FunctionCall__Alternatives_0 : ( ( ( rule__FunctionCall__TypeInstAssignment_0_0 ) ) | ( ( rule__FunctionCall__ClassVarDeclAssignment_0_1 ) ) );
    public final void rule__FunctionCall__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1599:1: ( ( ( rule__FunctionCall__TypeInstAssignment_0_0 ) ) | ( ( rule__FunctionCall__ClassVarDeclAssignment_0_1 ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==33) ) {
                    alt14=2;
                }
                else if ( (LA14_1==EOF||LA14_1==RULE_ID||(LA14_1>=25 && LA14_1<=30)||LA14_1==37||(LA14_1>=40 && LA14_1<=42)||LA14_1==44||LA14_1==48||(LA14_1>=50 && LA14_1<=51)||LA14_1==53||LA14_1==55) ) {
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
                    // InternalBSharp.g:1600:2: ( ( rule__FunctionCall__TypeInstAssignment_0_0 ) )
                    {
                    // InternalBSharp.g:1600:2: ( ( rule__FunctionCall__TypeInstAssignment_0_0 ) )
                    // InternalBSharp.g:1601:3: ( rule__FunctionCall__TypeInstAssignment_0_0 )
                    {
                     before(grammarAccess.getFunctionCallAccess().getTypeInstAssignment_0_0()); 
                    // InternalBSharp.g:1602:3: ( rule__FunctionCall__TypeInstAssignment_0_0 )
                    // InternalBSharp.g:1602:4: rule__FunctionCall__TypeInstAssignment_0_0
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
                    // InternalBSharp.g:1606:2: ( ( rule__FunctionCall__ClassVarDeclAssignment_0_1 ) )
                    {
                    // InternalBSharp.g:1606:2: ( ( rule__FunctionCall__ClassVarDeclAssignment_0_1 ) )
                    // InternalBSharp.g:1607:3: ( rule__FunctionCall__ClassVarDeclAssignment_0_1 )
                    {
                     before(grammarAccess.getFunctionCallAccess().getClassVarDeclAssignment_0_1()); 
                    // InternalBSharp.g:1608:3: ( rule__FunctionCall__ClassVarDeclAssignment_0_1 )
                    // InternalBSharp.g:1608:4: rule__FunctionCall__ClassVarDeclAssignment_0_1
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
    // InternalBSharp.g:1616:1: rule__InbuiltInfix__Alternatives : ( ( '\\u21D4' ) | ( '\\u21D2' ) | ( '=' ) | ( '\\u2260' ) | ( '\\u2227' ) | ( '\\u2228' ) );
    public final void rule__InbuiltInfix__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1620:1: ( ( '\\u21D4' ) | ( '\\u21D2' ) | ( '=' ) | ( '\\u2260' ) | ( '\\u2227' ) | ( '\\u2228' ) )
            int alt15=6;
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
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalBSharp.g:1621:2: ( '\\u21D4' )
                    {
                    // InternalBSharp.g:1621:2: ( '\\u21D4' )
                    // InternalBSharp.g:1622:3: '\\u21D4'
                    {
                     before(grammarAccess.getInbuiltInfixAccess().getLeftRightDoubleArrowKeyword_0()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getInbuiltInfixAccess().getLeftRightDoubleArrowKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBSharp.g:1627:2: ( '\\u21D2' )
                    {
                    // InternalBSharp.g:1627:2: ( '\\u21D2' )
                    // InternalBSharp.g:1628:3: '\\u21D2'
                    {
                     before(grammarAccess.getInbuiltInfixAccess().getRightwardsDoubleArrowKeyword_1()); 
                    match(input,26,FOLLOW_2); 
                     after(grammarAccess.getInbuiltInfixAccess().getRightwardsDoubleArrowKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBSharp.g:1633:2: ( '=' )
                    {
                    // InternalBSharp.g:1633:2: ( '=' )
                    // InternalBSharp.g:1634:3: '='
                    {
                     before(grammarAccess.getInbuiltInfixAccess().getEqualsSignKeyword_2()); 
                    match(input,27,FOLLOW_2); 
                     after(grammarAccess.getInbuiltInfixAccess().getEqualsSignKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalBSharp.g:1639:2: ( '\\u2260' )
                    {
                    // InternalBSharp.g:1639:2: ( '\\u2260' )
                    // InternalBSharp.g:1640:3: '\\u2260'
                    {
                     before(grammarAccess.getInbuiltInfixAccess().getNotEqualToKeyword_3()); 
                    match(input,28,FOLLOW_2); 
                     after(grammarAccess.getInbuiltInfixAccess().getNotEqualToKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalBSharp.g:1645:2: ( '\\u2227' )
                    {
                    // InternalBSharp.g:1645:2: ( '\\u2227' )
                    // InternalBSharp.g:1646:3: '\\u2227'
                    {
                     before(grammarAccess.getInbuiltInfixAccess().getLogicalAndKeyword_4()); 
                    match(input,29,FOLLOW_2); 
                     after(grammarAccess.getInbuiltInfixAccess().getLogicalAndKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalBSharp.g:1651:2: ( '\\u2228' )
                    {
                    // InternalBSharp.g:1651:2: ( '\\u2228' )
                    // InternalBSharp.g:1652:3: '\\u2228'
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
    // InternalBSharp.g:1661:1: rule__TopLevel__Group__0 : rule__TopLevel__Group__0__Impl rule__TopLevel__Group__1 ;
    public final void rule__TopLevel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1665:1: ( rule__TopLevel__Group__0__Impl rule__TopLevel__Group__1 )
            // InternalBSharp.g:1666:2: rule__TopLevel__Group__0__Impl rule__TopLevel__Group__1
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
    // InternalBSharp.g:1673:1: rule__TopLevel__Group__0__Impl : ( 'package' ) ;
    public final void rule__TopLevel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1677:1: ( ( 'package' ) )
            // InternalBSharp.g:1678:1: ( 'package' )
            {
            // InternalBSharp.g:1678:1: ( 'package' )
            // InternalBSharp.g:1679:2: 'package'
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
    // InternalBSharp.g:1688:1: rule__TopLevel__Group__1 : rule__TopLevel__Group__1__Impl rule__TopLevel__Group__2 ;
    public final void rule__TopLevel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1692:1: ( rule__TopLevel__Group__1__Impl rule__TopLevel__Group__2 )
            // InternalBSharp.g:1693:2: rule__TopLevel__Group__1__Impl rule__TopLevel__Group__2
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
    // InternalBSharp.g:1700:1: rule__TopLevel__Group__1__Impl : ( ( rule__TopLevel__NameAssignment_1 ) ) ;
    public final void rule__TopLevel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1704:1: ( ( ( rule__TopLevel__NameAssignment_1 ) ) )
            // InternalBSharp.g:1705:1: ( ( rule__TopLevel__NameAssignment_1 ) )
            {
            // InternalBSharp.g:1705:1: ( ( rule__TopLevel__NameAssignment_1 ) )
            // InternalBSharp.g:1706:2: ( rule__TopLevel__NameAssignment_1 )
            {
             before(grammarAccess.getTopLevelAccess().getNameAssignment_1()); 
            // InternalBSharp.g:1707:2: ( rule__TopLevel__NameAssignment_1 )
            // InternalBSharp.g:1707:3: rule__TopLevel__NameAssignment_1
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
    // InternalBSharp.g:1715:1: rule__TopLevel__Group__2 : rule__TopLevel__Group__2__Impl ;
    public final void rule__TopLevel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1719:1: ( rule__TopLevel__Group__2__Impl )
            // InternalBSharp.g:1720:2: rule__TopLevel__Group__2__Impl
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
    // InternalBSharp.g:1726:1: rule__TopLevel__Group__2__Impl : ( ( rule__TopLevel__TopLevelFileAssignment_2 ) ) ;
    public final void rule__TopLevel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1730:1: ( ( ( rule__TopLevel__TopLevelFileAssignment_2 ) ) )
            // InternalBSharp.g:1731:1: ( ( rule__TopLevel__TopLevelFileAssignment_2 ) )
            {
            // InternalBSharp.g:1731:1: ( ( rule__TopLevel__TopLevelFileAssignment_2 ) )
            // InternalBSharp.g:1732:2: ( rule__TopLevel__TopLevelFileAssignment_2 )
            {
             before(grammarAccess.getTopLevelAccess().getTopLevelFileAssignment_2()); 
            // InternalBSharp.g:1733:2: ( rule__TopLevel__TopLevelFileAssignment_2 )
            // InternalBSharp.g:1733:3: rule__TopLevel__TopLevelFileAssignment_2
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
    // InternalBSharp.g:1742:1: rule__THM_NAME__Group__0 : rule__THM_NAME__Group__0__Impl rule__THM_NAME__Group__1 ;
    public final void rule__THM_NAME__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1746:1: ( rule__THM_NAME__Group__0__Impl rule__THM_NAME__Group__1 )
            // InternalBSharp.g:1747:2: rule__THM_NAME__Group__0__Impl rule__THM_NAME__Group__1
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
    // InternalBSharp.g:1754:1: rule__THM_NAME__Group__0__Impl : ( ( rule__THM_NAME__Alternatives_0 )* ) ;
    public final void rule__THM_NAME__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1758:1: ( ( ( rule__THM_NAME__Alternatives_0 )* ) )
            // InternalBSharp.g:1759:1: ( ( rule__THM_NAME__Alternatives_0 )* )
            {
            // InternalBSharp.g:1759:1: ( ( rule__THM_NAME__Alternatives_0 )* )
            // InternalBSharp.g:1760:2: ( rule__THM_NAME__Alternatives_0 )*
            {
             before(grammarAccess.getTHM_NAMEAccess().getAlternatives_0()); 
            // InternalBSharp.g:1761:2: ( rule__THM_NAME__Alternatives_0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=RULE_INT && LA16_0<=RULE_WS)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalBSharp.g:1761:3: rule__THM_NAME__Alternatives_0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__THM_NAME__Alternatives_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalBSharp.g:1769:1: rule__THM_NAME__Group__1 : rule__THM_NAME__Group__1__Impl ;
    public final void rule__THM_NAME__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1773:1: ( rule__THM_NAME__Group__1__Impl )
            // InternalBSharp.g:1774:2: rule__THM_NAME__Group__1__Impl
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
    // InternalBSharp.g:1780:1: rule__THM_NAME__Group__1__Impl : ( ':' ) ;
    public final void rule__THM_NAME__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1784:1: ( ( ':' ) )
            // InternalBSharp.g:1785:1: ( ':' )
            {
            // InternalBSharp.g:1785:1: ( ':' )
            // InternalBSharp.g:1786:2: ':'
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
    // InternalBSharp.g:1796:1: rule__TopLevelFile__Group__0 : rule__TopLevelFile__Group__0__Impl rule__TopLevelFile__Group__1 ;
    public final void rule__TopLevelFile__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1800:1: ( rule__TopLevelFile__Group__0__Impl rule__TopLevelFile__Group__1 )
            // InternalBSharp.g:1801:2: rule__TopLevelFile__Group__0__Impl rule__TopLevelFile__Group__1
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
    // InternalBSharp.g:1808:1: rule__TopLevelFile__Group__0__Impl : ( () ) ;
    public final void rule__TopLevelFile__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1812:1: ( ( () ) )
            // InternalBSharp.g:1813:1: ( () )
            {
            // InternalBSharp.g:1813:1: ( () )
            // InternalBSharp.g:1814:2: ()
            {
             before(grammarAccess.getTopLevelFileAccess().getTopLevelFileAction_0()); 
            // InternalBSharp.g:1815:2: ()
            // InternalBSharp.g:1815:3: 
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
    // InternalBSharp.g:1823:1: rule__TopLevelFile__Group__1 : rule__TopLevelFile__Group__1__Impl rule__TopLevelFile__Group__2 ;
    public final void rule__TopLevelFile__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1827:1: ( rule__TopLevelFile__Group__1__Impl rule__TopLevelFile__Group__2 )
            // InternalBSharp.g:1828:2: rule__TopLevelFile__Group__1__Impl rule__TopLevelFile__Group__2
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
    // InternalBSharp.g:1835:1: rule__TopLevelFile__Group__1__Impl : ( ( rule__TopLevelFile__NoImportElementsAssignment_1 )? ) ;
    public final void rule__TopLevelFile__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1839:1: ( ( ( rule__TopLevelFile__NoImportElementsAssignment_1 )? ) )
            // InternalBSharp.g:1840:1: ( ( rule__TopLevelFile__NoImportElementsAssignment_1 )? )
            {
            // InternalBSharp.g:1840:1: ( ( rule__TopLevelFile__NoImportElementsAssignment_1 )? )
            // InternalBSharp.g:1841:2: ( rule__TopLevelFile__NoImportElementsAssignment_1 )?
            {
             before(grammarAccess.getTopLevelFileAccess().getNoImportElementsAssignment_1()); 
            // InternalBSharp.g:1842:2: ( rule__TopLevelFile__NoImportElementsAssignment_1 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==36||LA17_0==47||LA17_0==49) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalBSharp.g:1842:3: rule__TopLevelFile__NoImportElementsAssignment_1
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
    // InternalBSharp.g:1850:1: rule__TopLevelFile__Group__2 : rule__TopLevelFile__Group__2__Impl ;
    public final void rule__TopLevelFile__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1854:1: ( rule__TopLevelFile__Group__2__Impl )
            // InternalBSharp.g:1855:2: rule__TopLevelFile__Group__2__Impl
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
    // InternalBSharp.g:1861:1: rule__TopLevelFile__Group__2__Impl : ( ( rule__TopLevelFile__TopLevelImportsAssignment_2 )* ) ;
    public final void rule__TopLevelFile__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1865:1: ( ( ( rule__TopLevelFile__TopLevelImportsAssignment_2 )* ) )
            // InternalBSharp.g:1866:1: ( ( rule__TopLevelFile__TopLevelImportsAssignment_2 )* )
            {
            // InternalBSharp.g:1866:1: ( ( rule__TopLevelFile__TopLevelImportsAssignment_2 )* )
            // InternalBSharp.g:1867:2: ( rule__TopLevelFile__TopLevelImportsAssignment_2 )*
            {
             before(grammarAccess.getTopLevelFileAccess().getTopLevelImportsAssignment_2()); 
            // InternalBSharp.g:1868:2: ( rule__TopLevelFile__TopLevelImportsAssignment_2 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=34 && LA18_0<=35)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalBSharp.g:1868:3: rule__TopLevelFile__TopLevelImportsAssignment_2
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__TopLevelFile__TopLevelImportsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // InternalBSharp.g:1877:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1881:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalBSharp.g:1882:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
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
    // InternalBSharp.g:1889:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1893:1: ( ( RULE_ID ) )
            // InternalBSharp.g:1894:1: ( RULE_ID )
            {
            // InternalBSharp.g:1894:1: ( RULE_ID )
            // InternalBSharp.g:1895:2: RULE_ID
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
    // InternalBSharp.g:1904:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1908:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalBSharp.g:1909:2: rule__QualifiedName__Group__1__Impl
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
    // InternalBSharp.g:1915:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1919:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalBSharp.g:1920:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalBSharp.g:1920:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalBSharp.g:1921:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalBSharp.g:1922:2: ( rule__QualifiedName__Group_1__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==33) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalBSharp.g:1922:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // InternalBSharp.g:1931:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1935:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalBSharp.g:1936:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
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
    // InternalBSharp.g:1943:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1947:1: ( ( '.' ) )
            // InternalBSharp.g:1948:1: ( '.' )
            {
            // InternalBSharp.g:1948:1: ( '.' )
            // InternalBSharp.g:1949:2: '.'
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
    // InternalBSharp.g:1958:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1962:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalBSharp.g:1963:2: rule__QualifiedName__Group_1__1__Impl
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
    // InternalBSharp.g:1969:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1973:1: ( ( RULE_ID ) )
            // InternalBSharp.g:1974:1: ( RULE_ID )
            {
            // InternalBSharp.g:1974:1: ( RULE_ID )
            // InternalBSharp.g:1975:2: RULE_ID
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
    // InternalBSharp.g:1985:1: rule__TopLevelImport__Group__0 : rule__TopLevelImport__Group__0__Impl rule__TopLevelImport__Group__1 ;
    public final void rule__TopLevelImport__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:1989:1: ( rule__TopLevelImport__Group__0__Impl rule__TopLevelImport__Group__1 )
            // InternalBSharp.g:1990:2: rule__TopLevelImport__Group__0__Impl rule__TopLevelImport__Group__1
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
    // InternalBSharp.g:1997:1: rule__TopLevelImport__Group__0__Impl : ( ( ( rule__TopLevelImport__Alternatives_0 ) ) ( ( rule__TopLevelImport__Alternatives_0 )* ) ) ;
    public final void rule__TopLevelImport__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2001:1: ( ( ( ( rule__TopLevelImport__Alternatives_0 ) ) ( ( rule__TopLevelImport__Alternatives_0 )* ) ) )
            // InternalBSharp.g:2002:1: ( ( ( rule__TopLevelImport__Alternatives_0 ) ) ( ( rule__TopLevelImport__Alternatives_0 )* ) )
            {
            // InternalBSharp.g:2002:1: ( ( ( rule__TopLevelImport__Alternatives_0 ) ) ( ( rule__TopLevelImport__Alternatives_0 )* ) )
            // InternalBSharp.g:2003:2: ( ( rule__TopLevelImport__Alternatives_0 ) ) ( ( rule__TopLevelImport__Alternatives_0 )* )
            {
            // InternalBSharp.g:2003:2: ( ( rule__TopLevelImport__Alternatives_0 ) )
            // InternalBSharp.g:2004:3: ( rule__TopLevelImport__Alternatives_0 )
            {
             before(grammarAccess.getTopLevelImportAccess().getAlternatives_0()); 
            // InternalBSharp.g:2005:3: ( rule__TopLevelImport__Alternatives_0 )
            // InternalBSharp.g:2005:4: rule__TopLevelImport__Alternatives_0
            {
            pushFollow(FOLLOW_8);
            rule__TopLevelImport__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getTopLevelImportAccess().getAlternatives_0()); 

            }

            // InternalBSharp.g:2008:2: ( ( rule__TopLevelImport__Alternatives_0 )* )
            // InternalBSharp.g:2009:3: ( rule__TopLevelImport__Alternatives_0 )*
            {
             before(grammarAccess.getTopLevelImportAccess().getAlternatives_0()); 
            // InternalBSharp.g:2010:3: ( rule__TopLevelImport__Alternatives_0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=34 && LA20_0<=35)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalBSharp.g:2010:4: rule__TopLevelImport__Alternatives_0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__TopLevelImport__Alternatives_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // InternalBSharp.g:2019:1: rule__TopLevelImport__Group__1 : rule__TopLevelImport__Group__1__Impl ;
    public final void rule__TopLevelImport__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2023:1: ( rule__TopLevelImport__Group__1__Impl )
            // InternalBSharp.g:2024:2: rule__TopLevelImport__Group__1__Impl
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
    // InternalBSharp.g:2030:1: rule__TopLevelImport__Group__1__Impl : ( ( rule__TopLevelImport__BodyElementsAssignment_1 ) ) ;
    public final void rule__TopLevelImport__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2034:1: ( ( ( rule__TopLevelImport__BodyElementsAssignment_1 ) ) )
            // InternalBSharp.g:2035:1: ( ( rule__TopLevelImport__BodyElementsAssignment_1 ) )
            {
            // InternalBSharp.g:2035:1: ( ( rule__TopLevelImport__BodyElementsAssignment_1 ) )
            // InternalBSharp.g:2036:2: ( rule__TopLevelImport__BodyElementsAssignment_1 )
            {
             before(grammarAccess.getTopLevelImportAccess().getBodyElementsAssignment_1()); 
            // InternalBSharp.g:2037:2: ( rule__TopLevelImport__BodyElementsAssignment_1 )
            // InternalBSharp.g:2037:3: rule__TopLevelImport__BodyElementsAssignment_1
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
    // InternalBSharp.g:2046:1: rule__GlobalImport__Group__0 : rule__GlobalImport__Group__0__Impl rule__GlobalImport__Group__1 ;
    public final void rule__GlobalImport__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2050:1: ( rule__GlobalImport__Group__0__Impl rule__GlobalImport__Group__1 )
            // InternalBSharp.g:2051:2: rule__GlobalImport__Group__0__Impl rule__GlobalImport__Group__1
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
    // InternalBSharp.g:2058:1: rule__GlobalImport__Group__0__Impl : ( 'From' ) ;
    public final void rule__GlobalImport__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2062:1: ( ( 'From' ) )
            // InternalBSharp.g:2063:1: ( 'From' )
            {
            // InternalBSharp.g:2063:1: ( 'From' )
            // InternalBSharp.g:2064:2: 'From'
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
    // InternalBSharp.g:2073:1: rule__GlobalImport__Group__1 : rule__GlobalImport__Group__1__Impl rule__GlobalImport__Group__2 ;
    public final void rule__GlobalImport__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2077:1: ( rule__GlobalImport__Group__1__Impl rule__GlobalImport__Group__2 )
            // InternalBSharp.g:2078:2: rule__GlobalImport__Group__1__Impl rule__GlobalImport__Group__2
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
    // InternalBSharp.g:2085:1: rule__GlobalImport__Group__1__Impl : ( ( rule__GlobalImport__ProjectAssignment_1 ) ) ;
    public final void rule__GlobalImport__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2089:1: ( ( ( rule__GlobalImport__ProjectAssignment_1 ) ) )
            // InternalBSharp.g:2090:1: ( ( rule__GlobalImport__ProjectAssignment_1 ) )
            {
            // InternalBSharp.g:2090:1: ( ( rule__GlobalImport__ProjectAssignment_1 ) )
            // InternalBSharp.g:2091:2: ( rule__GlobalImport__ProjectAssignment_1 )
            {
             before(grammarAccess.getGlobalImportAccess().getProjectAssignment_1()); 
            // InternalBSharp.g:2092:2: ( rule__GlobalImport__ProjectAssignment_1 )
            // InternalBSharp.g:2092:3: rule__GlobalImport__ProjectAssignment_1
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
    // InternalBSharp.g:2100:1: rule__GlobalImport__Group__2 : rule__GlobalImport__Group__2__Impl rule__GlobalImport__Group__3 ;
    public final void rule__GlobalImport__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2104:1: ( rule__GlobalImport__Group__2__Impl rule__GlobalImport__Group__3 )
            // InternalBSharp.g:2105:2: rule__GlobalImport__Group__2__Impl rule__GlobalImport__Group__3
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
    // InternalBSharp.g:2112:1: rule__GlobalImport__Group__2__Impl : ( 'Import' ) ;
    public final void rule__GlobalImport__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2116:1: ( ( 'Import' ) )
            // InternalBSharp.g:2117:1: ( 'Import' )
            {
            // InternalBSharp.g:2117:1: ( 'Import' )
            // InternalBSharp.g:2118:2: 'Import'
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
    // InternalBSharp.g:2127:1: rule__GlobalImport__Group__3 : rule__GlobalImport__Group__3__Impl ;
    public final void rule__GlobalImport__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2131:1: ( rule__GlobalImport__Group__3__Impl )
            // InternalBSharp.g:2132:2: rule__GlobalImport__Group__3__Impl
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
    // InternalBSharp.g:2138:1: rule__GlobalImport__Group__3__Impl : ( ( ( rule__GlobalImport__FileImportsAssignment_3 ) ) ( ( rule__GlobalImport__FileImportsAssignment_3 )* ) ) ;
    public final void rule__GlobalImport__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2142:1: ( ( ( ( rule__GlobalImport__FileImportsAssignment_3 ) ) ( ( rule__GlobalImport__FileImportsAssignment_3 )* ) ) )
            // InternalBSharp.g:2143:1: ( ( ( rule__GlobalImport__FileImportsAssignment_3 ) ) ( ( rule__GlobalImport__FileImportsAssignment_3 )* ) )
            {
            // InternalBSharp.g:2143:1: ( ( ( rule__GlobalImport__FileImportsAssignment_3 ) ) ( ( rule__GlobalImport__FileImportsAssignment_3 )* ) )
            // InternalBSharp.g:2144:2: ( ( rule__GlobalImport__FileImportsAssignment_3 ) ) ( ( rule__GlobalImport__FileImportsAssignment_3 )* )
            {
            // InternalBSharp.g:2144:2: ( ( rule__GlobalImport__FileImportsAssignment_3 ) )
            // InternalBSharp.g:2145:3: ( rule__GlobalImport__FileImportsAssignment_3 )
            {
             before(grammarAccess.getGlobalImportAccess().getFileImportsAssignment_3()); 
            // InternalBSharp.g:2146:3: ( rule__GlobalImport__FileImportsAssignment_3 )
            // InternalBSharp.g:2146:4: rule__GlobalImport__FileImportsAssignment_3
            {
            pushFollow(FOLLOW_13);
            rule__GlobalImport__FileImportsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getGlobalImportAccess().getFileImportsAssignment_3()); 

            }

            // InternalBSharp.g:2149:2: ( ( rule__GlobalImport__FileImportsAssignment_3 )* )
            // InternalBSharp.g:2150:3: ( rule__GlobalImport__FileImportsAssignment_3 )*
            {
             before(grammarAccess.getGlobalImportAccess().getFileImportsAssignment_3()); 
            // InternalBSharp.g:2151:3: ( rule__GlobalImport__FileImportsAssignment_3 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_ID) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalBSharp.g:2151:4: rule__GlobalImport__FileImportsAssignment_3
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__GlobalImport__FileImportsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalBSharp.g:2161:1: rule__FileImport__Group__0 : rule__FileImport__Group__0__Impl rule__FileImport__Group__1 ;
    public final void rule__FileImport__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2165:1: ( rule__FileImport__Group__0__Impl rule__FileImport__Group__1 )
            // InternalBSharp.g:2166:2: rule__FileImport__Group__0__Impl rule__FileImport__Group__1
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
    // InternalBSharp.g:2173:1: rule__FileImport__Group__0__Impl : ( ( rule__FileImport__FileNameAssignment_0 ) ) ;
    public final void rule__FileImport__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2177:1: ( ( ( rule__FileImport__FileNameAssignment_0 ) ) )
            // InternalBSharp.g:2178:1: ( ( rule__FileImport__FileNameAssignment_0 ) )
            {
            // InternalBSharp.g:2178:1: ( ( rule__FileImport__FileNameAssignment_0 ) )
            // InternalBSharp.g:2179:2: ( rule__FileImport__FileNameAssignment_0 )
            {
             before(grammarAccess.getFileImportAccess().getFileNameAssignment_0()); 
            // InternalBSharp.g:2180:2: ( rule__FileImport__FileNameAssignment_0 )
            // InternalBSharp.g:2180:3: rule__FileImport__FileNameAssignment_0
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
    // InternalBSharp.g:2188:1: rule__FileImport__Group__1 : rule__FileImport__Group__1__Impl ;
    public final void rule__FileImport__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2192:1: ( rule__FileImport__Group__1__Impl )
            // InternalBSharp.g:2193:2: rule__FileImport__Group__1__Impl
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
    // InternalBSharp.g:2199:1: rule__FileImport__Group__1__Impl : ( ( rule__FileImport__Group_1__0 )? ) ;
    public final void rule__FileImport__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2203:1: ( ( ( rule__FileImport__Group_1__0 )? ) )
            // InternalBSharp.g:2204:1: ( ( rule__FileImport__Group_1__0 )? )
            {
            // InternalBSharp.g:2204:1: ( ( rule__FileImport__Group_1__0 )? )
            // InternalBSharp.g:2205:2: ( rule__FileImport__Group_1__0 )?
            {
             before(grammarAccess.getFileImportAccess().getGroup_1()); 
            // InternalBSharp.g:2206:2: ( rule__FileImport__Group_1__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==33) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalBSharp.g:2206:3: rule__FileImport__Group_1__0
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
    // InternalBSharp.g:2215:1: rule__FileImport__Group_1__0 : rule__FileImport__Group_1__0__Impl rule__FileImport__Group_1__1 ;
    public final void rule__FileImport__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2219:1: ( rule__FileImport__Group_1__0__Impl rule__FileImport__Group_1__1 )
            // InternalBSharp.g:2220:2: rule__FileImport__Group_1__0__Impl rule__FileImport__Group_1__1
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
    // InternalBSharp.g:2227:1: rule__FileImport__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FileImport__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2231:1: ( ( '.' ) )
            // InternalBSharp.g:2232:1: ( '.' )
            {
            // InternalBSharp.g:2232:1: ( '.' )
            // InternalBSharp.g:2233:2: '.'
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
    // InternalBSharp.g:2242:1: rule__FileImport__Group_1__1 : rule__FileImport__Group_1__1__Impl ;
    public final void rule__FileImport__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2246:1: ( rule__FileImport__Group_1__1__Impl )
            // InternalBSharp.g:2247:2: rule__FileImport__Group_1__1__Impl
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
    // InternalBSharp.g:2253:1: rule__FileImport__Group_1__1__Impl : ( ( rule__FileImport__Alternatives_1_1 ) ) ;
    public final void rule__FileImport__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2257:1: ( ( ( rule__FileImport__Alternatives_1_1 ) ) )
            // InternalBSharp.g:2258:1: ( ( rule__FileImport__Alternatives_1_1 ) )
            {
            // InternalBSharp.g:2258:1: ( ( rule__FileImport__Alternatives_1_1 ) )
            // InternalBSharp.g:2259:2: ( rule__FileImport__Alternatives_1_1 )
            {
             before(grammarAccess.getFileImportAccess().getAlternatives_1_1()); 
            // InternalBSharp.g:2260:2: ( rule__FileImport__Alternatives_1_1 )
            // InternalBSharp.g:2260:3: rule__FileImport__Alternatives_1_1
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
    // InternalBSharp.g:2269:1: rule__LocalImport__Group__0 : rule__LocalImport__Group__0__Impl rule__LocalImport__Group__1 ;
    public final void rule__LocalImport__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2273:1: ( rule__LocalImport__Group__0__Impl rule__LocalImport__Group__1 )
            // InternalBSharp.g:2274:2: rule__LocalImport__Group__0__Impl rule__LocalImport__Group__1
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
    // InternalBSharp.g:2281:1: rule__LocalImport__Group__0__Impl : ( 'Import' ) ;
    public final void rule__LocalImport__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2285:1: ( ( 'Import' ) )
            // InternalBSharp.g:2286:1: ( 'Import' )
            {
            // InternalBSharp.g:2286:1: ( 'Import' )
            // InternalBSharp.g:2287:2: 'Import'
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
    // InternalBSharp.g:2296:1: rule__LocalImport__Group__1 : rule__LocalImport__Group__1__Impl ;
    public final void rule__LocalImport__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2300:1: ( rule__LocalImport__Group__1__Impl )
            // InternalBSharp.g:2301:2: rule__LocalImport__Group__1__Impl
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
    // InternalBSharp.g:2307:1: rule__LocalImport__Group__1__Impl : ( ( ( rule__LocalImport__FileImportsAssignment_1 ) ) ( ( rule__LocalImport__FileImportsAssignment_1 )* ) ) ;
    public final void rule__LocalImport__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2311:1: ( ( ( ( rule__LocalImport__FileImportsAssignment_1 ) ) ( ( rule__LocalImport__FileImportsAssignment_1 )* ) ) )
            // InternalBSharp.g:2312:1: ( ( ( rule__LocalImport__FileImportsAssignment_1 ) ) ( ( rule__LocalImport__FileImportsAssignment_1 )* ) )
            {
            // InternalBSharp.g:2312:1: ( ( ( rule__LocalImport__FileImportsAssignment_1 ) ) ( ( rule__LocalImport__FileImportsAssignment_1 )* ) )
            // InternalBSharp.g:2313:2: ( ( rule__LocalImport__FileImportsAssignment_1 ) ) ( ( rule__LocalImport__FileImportsAssignment_1 )* )
            {
            // InternalBSharp.g:2313:2: ( ( rule__LocalImport__FileImportsAssignment_1 ) )
            // InternalBSharp.g:2314:3: ( rule__LocalImport__FileImportsAssignment_1 )
            {
             before(grammarAccess.getLocalImportAccess().getFileImportsAssignment_1()); 
            // InternalBSharp.g:2315:3: ( rule__LocalImport__FileImportsAssignment_1 )
            // InternalBSharp.g:2315:4: rule__LocalImport__FileImportsAssignment_1
            {
            pushFollow(FOLLOW_13);
            rule__LocalImport__FileImportsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLocalImportAccess().getFileImportsAssignment_1()); 

            }

            // InternalBSharp.g:2318:2: ( ( rule__LocalImport__FileImportsAssignment_1 )* )
            // InternalBSharp.g:2319:3: ( rule__LocalImport__FileImportsAssignment_1 )*
            {
             before(grammarAccess.getLocalImportAccess().getFileImportsAssignment_1()); 
            // InternalBSharp.g:2320:3: ( rule__LocalImport__FileImportsAssignment_1 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_ID) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalBSharp.g:2320:4: rule__LocalImport__FileImportsAssignment_1
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__LocalImport__FileImportsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // InternalBSharp.g:2330:1: rule__Class__Group__0 : rule__Class__Group__0__Impl rule__Class__Group__1 ;
    public final void rule__Class__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2334:1: ( rule__Class__Group__0__Impl rule__Class__Group__1 )
            // InternalBSharp.g:2335:2: rule__Class__Group__0__Impl rule__Class__Group__1
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
    // InternalBSharp.g:2342:1: rule__Class__Group__0__Impl : ( 'Class' ) ;
    public final void rule__Class__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2346:1: ( ( 'Class' ) )
            // InternalBSharp.g:2347:1: ( 'Class' )
            {
            // InternalBSharp.g:2347:1: ( 'Class' )
            // InternalBSharp.g:2348:2: 'Class'
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
    // InternalBSharp.g:2357:1: rule__Class__Group__1 : rule__Class__Group__1__Impl rule__Class__Group__2 ;
    public final void rule__Class__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2361:1: ( rule__Class__Group__1__Impl rule__Class__Group__2 )
            // InternalBSharp.g:2362:2: rule__Class__Group__1__Impl rule__Class__Group__2
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
    // InternalBSharp.g:2369:1: rule__Class__Group__1__Impl : ( ( rule__Class__NameAssignment_1 ) ) ;
    public final void rule__Class__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2373:1: ( ( ( rule__Class__NameAssignment_1 ) ) )
            // InternalBSharp.g:2374:1: ( ( rule__Class__NameAssignment_1 ) )
            {
            // InternalBSharp.g:2374:1: ( ( rule__Class__NameAssignment_1 ) )
            // InternalBSharp.g:2375:2: ( rule__Class__NameAssignment_1 )
            {
             before(grammarAccess.getClassAccess().getNameAssignment_1()); 
            // InternalBSharp.g:2376:2: ( rule__Class__NameAssignment_1 )
            // InternalBSharp.g:2376:3: rule__Class__NameAssignment_1
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
    // InternalBSharp.g:2384:1: rule__Class__Group__2 : rule__Class__Group__2__Impl rule__Class__Group__3 ;
    public final void rule__Class__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2388:1: ( rule__Class__Group__2__Impl rule__Class__Group__3 )
            // InternalBSharp.g:2389:2: rule__Class__Group__2__Impl rule__Class__Group__3
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
    // InternalBSharp.g:2396:1: rule__Class__Group__2__Impl : ( ( rule__Class__ContextAssignment_2 )? ) ;
    public final void rule__Class__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2400:1: ( ( ( rule__Class__ContextAssignment_2 )? ) )
            // InternalBSharp.g:2401:1: ( ( rule__Class__ContextAssignment_2 )? )
            {
            // InternalBSharp.g:2401:1: ( ( rule__Class__ContextAssignment_2 )? )
            // InternalBSharp.g:2402:2: ( rule__Class__ContextAssignment_2 )?
            {
             before(grammarAccess.getClassAccess().getContextAssignment_2()); 
            // InternalBSharp.g:2403:2: ( rule__Class__ContextAssignment_2 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==42) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalBSharp.g:2403:3: rule__Class__ContextAssignment_2
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
    // InternalBSharp.g:2411:1: rule__Class__Group__3 : rule__Class__Group__3__Impl rule__Class__Group__4 ;
    public final void rule__Class__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2415:1: ( rule__Class__Group__3__Impl rule__Class__Group__4 )
            // InternalBSharp.g:2416:2: rule__Class__Group__3__Impl rule__Class__Group__4
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
    // InternalBSharp.g:2423:1: rule__Class__Group__3__Impl : ( ( rule__Class__Group_3__0 ) ) ;
    public final void rule__Class__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2427:1: ( ( ( rule__Class__Group_3__0 ) ) )
            // InternalBSharp.g:2428:1: ( ( rule__Class__Group_3__0 ) )
            {
            // InternalBSharp.g:2428:1: ( ( rule__Class__Group_3__0 ) )
            // InternalBSharp.g:2429:2: ( rule__Class__Group_3__0 )
            {
             before(grammarAccess.getClassAccess().getGroup_3()); 
            // InternalBSharp.g:2430:2: ( rule__Class__Group_3__0 )
            // InternalBSharp.g:2430:3: rule__Class__Group_3__0
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
    // InternalBSharp.g:2438:1: rule__Class__Group__4 : rule__Class__Group__4__Impl rule__Class__Group__5 ;
    public final void rule__Class__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2442:1: ( rule__Class__Group__4__Impl rule__Class__Group__5 )
            // InternalBSharp.g:2443:2: rule__Class__Group__4__Impl rule__Class__Group__5
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
    // InternalBSharp.g:2450:1: rule__Class__Group__4__Impl : ( ( rule__Class__SupertypesAssignment_4 )? ) ;
    public final void rule__Class__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2454:1: ( ( ( rule__Class__SupertypesAssignment_4 )? ) )
            // InternalBSharp.g:2455:1: ( ( rule__Class__SupertypesAssignment_4 )? )
            {
            // InternalBSharp.g:2455:1: ( ( rule__Class__SupertypesAssignment_4 )? )
            // InternalBSharp.g:2456:2: ( rule__Class__SupertypesAssignment_4 )?
            {
             before(grammarAccess.getClassAccess().getSupertypesAssignment_4()); 
            // InternalBSharp.g:2457:2: ( rule__Class__SupertypesAssignment_4 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==32) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalBSharp.g:2457:3: rule__Class__SupertypesAssignment_4
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
    // InternalBSharp.g:2465:1: rule__Class__Group__5 : rule__Class__Group__5__Impl rule__Class__Group__6 ;
    public final void rule__Class__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2469:1: ( rule__Class__Group__5__Impl rule__Class__Group__6 )
            // InternalBSharp.g:2470:2: rule__Class__Group__5__Impl rule__Class__Group__6
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
    // InternalBSharp.g:2477:1: rule__Class__Group__5__Impl : ( ( rule__Class__Group_5__0 )? ) ;
    public final void rule__Class__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2481:1: ( ( ( rule__Class__Group_5__0 )? ) )
            // InternalBSharp.g:2482:1: ( ( rule__Class__Group_5__0 )? )
            {
            // InternalBSharp.g:2482:1: ( ( rule__Class__Group_5__0 )? )
            // InternalBSharp.g:2483:2: ( rule__Class__Group_5__0 )?
            {
             before(grammarAccess.getClassAccess().getGroup_5()); 
            // InternalBSharp.g:2484:2: ( rule__Class__Group_5__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==40) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalBSharp.g:2484:3: rule__Class__Group_5__0
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
    // InternalBSharp.g:2492:1: rule__Class__Group__6 : rule__Class__Group__6__Impl rule__Class__Group__7 ;
    public final void rule__Class__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2496:1: ( rule__Class__Group__6__Impl rule__Class__Group__7 )
            // InternalBSharp.g:2497:2: rule__Class__Group__6__Impl rule__Class__Group__7
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
    // InternalBSharp.g:2504:1: rule__Class__Group__6__Impl : ( ( rule__Class__WhereAssignment_6 )? ) ;
    public final void rule__Class__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2508:1: ( ( ( rule__Class__WhereAssignment_6 )? ) )
            // InternalBSharp.g:2509:1: ( ( rule__Class__WhereAssignment_6 )? )
            {
            // InternalBSharp.g:2509:1: ( ( rule__Class__WhereAssignment_6 )? )
            // InternalBSharp.g:2510:2: ( rule__Class__WhereAssignment_6 )?
            {
             before(grammarAccess.getClassAccess().getWhereAssignment_6()); 
            // InternalBSharp.g:2511:2: ( rule__Class__WhereAssignment_6 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==46) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalBSharp.g:2511:3: rule__Class__WhereAssignment_6
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
    // InternalBSharp.g:2519:1: rule__Class__Group__7 : rule__Class__Group__7__Impl rule__Class__Group__8 ;
    public final void rule__Class__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2523:1: ( rule__Class__Group__7__Impl rule__Class__Group__8 )
            // InternalBSharp.g:2524:2: rule__Class__Group__7__Impl rule__Class__Group__8
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
    // InternalBSharp.g:2531:1: rule__Class__Group__7__Impl : ( ( ';' )? ) ;
    public final void rule__Class__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2535:1: ( ( ( ';' )? ) )
            // InternalBSharp.g:2536:1: ( ( ';' )? )
            {
            // InternalBSharp.g:2536:1: ( ( ';' )? )
            // InternalBSharp.g:2537:2: ( ';' )?
            {
             before(grammarAccess.getClassAccess().getSemicolonKeyword_7()); 
            // InternalBSharp.g:2538:2: ( ';' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==37) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalBSharp.g:2538:3: ';'
                    {
                    match(input,37,FOLLOW_2); 

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
    // InternalBSharp.g:2546:1: rule__Class__Group__8 : rule__Class__Group__8__Impl ;
    public final void rule__Class__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2550:1: ( rule__Class__Group__8__Impl )
            // InternalBSharp.g:2551:2: rule__Class__Group__8__Impl
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
    // InternalBSharp.g:2557:1: rule__Class__Group__8__Impl : ( ( rule__Class__BlockAssignment_8 ) ) ;
    public final void rule__Class__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2561:1: ( ( ( rule__Class__BlockAssignment_8 ) ) )
            // InternalBSharp.g:2562:1: ( ( rule__Class__BlockAssignment_8 ) )
            {
            // InternalBSharp.g:2562:1: ( ( rule__Class__BlockAssignment_8 ) )
            // InternalBSharp.g:2563:2: ( rule__Class__BlockAssignment_8 )
            {
             before(grammarAccess.getClassAccess().getBlockAssignment_8()); 
            // InternalBSharp.g:2564:2: ( rule__Class__BlockAssignment_8 )
            // InternalBSharp.g:2564:3: rule__Class__BlockAssignment_8
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
    // InternalBSharp.g:2573:1: rule__Class__Group_3__0 : rule__Class__Group_3__0__Impl rule__Class__Group_3__1 ;
    public final void rule__Class__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2577:1: ( rule__Class__Group_3__0__Impl rule__Class__Group_3__1 )
            // InternalBSharp.g:2578:2: rule__Class__Group_3__0__Impl rule__Class__Group_3__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalBSharp.g:2585:1: rule__Class__Group_3__0__Impl : ( '[' ) ;
    public final void rule__Class__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2589:1: ( ( '[' ) )
            // InternalBSharp.g:2590:1: ( '[' )
            {
            // InternalBSharp.g:2590:1: ( '[' )
            // InternalBSharp.g:2591:2: '['
            {
             before(grammarAccess.getClassAccess().getLeftSquareBracketKeyword_3_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalBSharp.g:2600:1: rule__Class__Group_3__1 : rule__Class__Group_3__1__Impl rule__Class__Group_3__2 ;
    public final void rule__Class__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2604:1: ( rule__Class__Group_3__1__Impl rule__Class__Group_3__2 )
            // InternalBSharp.g:2605:2: rule__Class__Group_3__1__Impl rule__Class__Group_3__2
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
    // InternalBSharp.g:2612:1: rule__Class__Group_3__1__Impl : ( ( rule__Class__InstNameAssignment_3_1 ) ) ;
    public final void rule__Class__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2616:1: ( ( ( rule__Class__InstNameAssignment_3_1 ) ) )
            // InternalBSharp.g:2617:1: ( ( rule__Class__InstNameAssignment_3_1 ) )
            {
            // InternalBSharp.g:2617:1: ( ( rule__Class__InstNameAssignment_3_1 ) )
            // InternalBSharp.g:2618:2: ( rule__Class__InstNameAssignment_3_1 )
            {
             before(grammarAccess.getClassAccess().getInstNameAssignment_3_1()); 
            // InternalBSharp.g:2619:2: ( rule__Class__InstNameAssignment_3_1 )
            // InternalBSharp.g:2619:3: rule__Class__InstNameAssignment_3_1
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
    // InternalBSharp.g:2627:1: rule__Class__Group_3__2 : rule__Class__Group_3__2__Impl ;
    public final void rule__Class__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2631:1: ( rule__Class__Group_3__2__Impl )
            // InternalBSharp.g:2632:2: rule__Class__Group_3__2__Impl
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
    // InternalBSharp.g:2638:1: rule__Class__Group_3__2__Impl : ( ']' ) ;
    public final void rule__Class__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2642:1: ( ( ']' ) )
            // InternalBSharp.g:2643:1: ( ']' )
            {
            // InternalBSharp.g:2643:1: ( ']' )
            // InternalBSharp.g:2644:2: ']'
            {
             before(grammarAccess.getClassAccess().getRightSquareBracketKeyword_3_2()); 
            match(input,39,FOLLOW_2); 
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
    // InternalBSharp.g:2654:1: rule__Class__Group_5__0 : rule__Class__Group_5__0__Impl rule__Class__Group_5__1 ;
    public final void rule__Class__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2658:1: ( rule__Class__Group_5__0__Impl rule__Class__Group_5__1 )
            // InternalBSharp.g:2659:2: rule__Class__Group_5__0__Impl rule__Class__Group_5__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalBSharp.g:2666:1: rule__Class__Group_5__0__Impl : ( '(' ) ;
    public final void rule__Class__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2670:1: ( ( '(' ) )
            // InternalBSharp.g:2671:1: ( '(' )
            {
            // InternalBSharp.g:2671:1: ( '(' )
            // InternalBSharp.g:2672:2: '('
            {
             before(grammarAccess.getClassAccess().getLeftParenthesisKeyword_5_0()); 
            match(input,40,FOLLOW_2); 
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
    // InternalBSharp.g:2681:1: rule__Class__Group_5__1 : rule__Class__Group_5__1__Impl rule__Class__Group_5__2 ;
    public final void rule__Class__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2685:1: ( rule__Class__Group_5__1__Impl rule__Class__Group_5__2 )
            // InternalBSharp.g:2686:2: rule__Class__Group_5__1__Impl rule__Class__Group_5__2
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
    // InternalBSharp.g:2693:1: rule__Class__Group_5__1__Impl : ( ( rule__Class__VarListAssignment_5_1 ) ) ;
    public final void rule__Class__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2697:1: ( ( ( rule__Class__VarListAssignment_5_1 ) ) )
            // InternalBSharp.g:2698:1: ( ( rule__Class__VarListAssignment_5_1 ) )
            {
            // InternalBSharp.g:2698:1: ( ( rule__Class__VarListAssignment_5_1 ) )
            // InternalBSharp.g:2699:2: ( rule__Class__VarListAssignment_5_1 )
            {
             before(grammarAccess.getClassAccess().getVarListAssignment_5_1()); 
            // InternalBSharp.g:2700:2: ( rule__Class__VarListAssignment_5_1 )
            // InternalBSharp.g:2700:3: rule__Class__VarListAssignment_5_1
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
    // InternalBSharp.g:2708:1: rule__Class__Group_5__2 : rule__Class__Group_5__2__Impl ;
    public final void rule__Class__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2712:1: ( rule__Class__Group_5__2__Impl )
            // InternalBSharp.g:2713:2: rule__Class__Group_5__2__Impl
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
    // InternalBSharp.g:2719:1: rule__Class__Group_5__2__Impl : ( ')' ) ;
    public final void rule__Class__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2723:1: ( ( ')' ) )
            // InternalBSharp.g:2724:1: ( ')' )
            {
            // InternalBSharp.g:2724:1: ( ')' )
            // InternalBSharp.g:2725:2: ')'
            {
             before(grammarAccess.getClassAccess().getRightParenthesisKeyword_5_2()); 
            match(input,41,FOLLOW_2); 
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
    // InternalBSharp.g:2735:1: rule__PolyContext__Group__0 : rule__PolyContext__Group__0__Impl rule__PolyContext__Group__1 ;
    public final void rule__PolyContext__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2739:1: ( rule__PolyContext__Group__0__Impl rule__PolyContext__Group__1 )
            // InternalBSharp.g:2740:2: rule__PolyContext__Group__0__Impl rule__PolyContext__Group__1
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
    // InternalBSharp.g:2747:1: rule__PolyContext__Group__0__Impl : ( '<' ) ;
    public final void rule__PolyContext__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2751:1: ( ( '<' ) )
            // InternalBSharp.g:2752:1: ( '<' )
            {
            // InternalBSharp.g:2752:1: ( '<' )
            // InternalBSharp.g:2753:2: '<'
            {
             before(grammarAccess.getPolyContextAccess().getLessThanSignKeyword_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalBSharp.g:2762:1: rule__PolyContext__Group__1 : rule__PolyContext__Group__1__Impl rule__PolyContext__Group__2 ;
    public final void rule__PolyContext__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2766:1: ( rule__PolyContext__Group__1__Impl rule__PolyContext__Group__2 )
            // InternalBSharp.g:2767:2: rule__PolyContext__Group__1__Impl rule__PolyContext__Group__2
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
    // InternalBSharp.g:2774:1: rule__PolyContext__Group__1__Impl : ( ( ( rule__PolyContext__PolyTypesAssignment_1 ) ) ( ( rule__PolyContext__PolyTypesAssignment_1 )* ) ) ;
    public final void rule__PolyContext__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2778:1: ( ( ( ( rule__PolyContext__PolyTypesAssignment_1 ) ) ( ( rule__PolyContext__PolyTypesAssignment_1 )* ) ) )
            // InternalBSharp.g:2779:1: ( ( ( rule__PolyContext__PolyTypesAssignment_1 ) ) ( ( rule__PolyContext__PolyTypesAssignment_1 )* ) )
            {
            // InternalBSharp.g:2779:1: ( ( ( rule__PolyContext__PolyTypesAssignment_1 ) ) ( ( rule__PolyContext__PolyTypesAssignment_1 )* ) )
            // InternalBSharp.g:2780:2: ( ( rule__PolyContext__PolyTypesAssignment_1 ) ) ( ( rule__PolyContext__PolyTypesAssignment_1 )* )
            {
            // InternalBSharp.g:2780:2: ( ( rule__PolyContext__PolyTypesAssignment_1 ) )
            // InternalBSharp.g:2781:3: ( rule__PolyContext__PolyTypesAssignment_1 )
            {
             before(grammarAccess.getPolyContextAccess().getPolyTypesAssignment_1()); 
            // InternalBSharp.g:2782:3: ( rule__PolyContext__PolyTypesAssignment_1 )
            // InternalBSharp.g:2782:4: rule__PolyContext__PolyTypesAssignment_1
            {
            pushFollow(FOLLOW_13);
            rule__PolyContext__PolyTypesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPolyContextAccess().getPolyTypesAssignment_1()); 

            }

            // InternalBSharp.g:2785:2: ( ( rule__PolyContext__PolyTypesAssignment_1 )* )
            // InternalBSharp.g:2786:3: ( rule__PolyContext__PolyTypesAssignment_1 )*
            {
             before(grammarAccess.getPolyContextAccess().getPolyTypesAssignment_1()); 
            // InternalBSharp.g:2787:3: ( rule__PolyContext__PolyTypesAssignment_1 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_ID) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalBSharp.g:2787:4: rule__PolyContext__PolyTypesAssignment_1
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__PolyContext__PolyTypesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
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
    // InternalBSharp.g:2796:1: rule__PolyContext__Group__2 : rule__PolyContext__Group__2__Impl ;
    public final void rule__PolyContext__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2800:1: ( rule__PolyContext__Group__2__Impl )
            // InternalBSharp.g:2801:2: rule__PolyContext__Group__2__Impl
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
    // InternalBSharp.g:2807:1: rule__PolyContext__Group__2__Impl : ( '>' ) ;
    public final void rule__PolyContext__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2811:1: ( ( '>' ) )
            // InternalBSharp.g:2812:1: ( '>' )
            {
            // InternalBSharp.g:2812:1: ( '>' )
            // InternalBSharp.g:2813:2: '>'
            {
             before(grammarAccess.getPolyContextAccess().getGreaterThanSignKeyword_2()); 
            match(input,43,FOLLOW_2); 
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
    // InternalBSharp.g:2823:1: rule__PolyType__Group__0 : rule__PolyType__Group__0__Impl rule__PolyType__Group__1 ;
    public final void rule__PolyType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2827:1: ( rule__PolyType__Group__0__Impl rule__PolyType__Group__1 )
            // InternalBSharp.g:2828:2: rule__PolyType__Group__0__Impl rule__PolyType__Group__1
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
    // InternalBSharp.g:2835:1: rule__PolyType__Group__0__Impl : ( ( rule__PolyType__NameAssignment_0 ) ) ;
    public final void rule__PolyType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2839:1: ( ( ( rule__PolyType__NameAssignment_0 ) ) )
            // InternalBSharp.g:2840:1: ( ( rule__PolyType__NameAssignment_0 ) )
            {
            // InternalBSharp.g:2840:1: ( ( rule__PolyType__NameAssignment_0 ) )
            // InternalBSharp.g:2841:2: ( rule__PolyType__NameAssignment_0 )
            {
             before(grammarAccess.getPolyTypeAccess().getNameAssignment_0()); 
            // InternalBSharp.g:2842:2: ( rule__PolyType__NameAssignment_0 )
            // InternalBSharp.g:2842:3: rule__PolyType__NameAssignment_0
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
    // InternalBSharp.g:2850:1: rule__PolyType__Group__1 : rule__PolyType__Group__1__Impl ;
    public final void rule__PolyType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2854:1: ( rule__PolyType__Group__1__Impl )
            // InternalBSharp.g:2855:2: rule__PolyType__Group__1__Impl
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
    // InternalBSharp.g:2861:1: rule__PolyType__Group__1__Impl : ( ( rule__PolyType__Group_1__0 )? ) ;
    public final void rule__PolyType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2865:1: ( ( ( rule__PolyType__Group_1__0 )? ) )
            // InternalBSharp.g:2866:1: ( ( rule__PolyType__Group_1__0 )? )
            {
            // InternalBSharp.g:2866:1: ( ( rule__PolyType__Group_1__0 )? )
            // InternalBSharp.g:2867:2: ( rule__PolyType__Group_1__0 )?
            {
             before(grammarAccess.getPolyTypeAccess().getGroup_1()); 
            // InternalBSharp.g:2868:2: ( rule__PolyType__Group_1__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==32) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalBSharp.g:2868:3: rule__PolyType__Group_1__0
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
    // InternalBSharp.g:2877:1: rule__PolyType__Group_1__0 : rule__PolyType__Group_1__0__Impl rule__PolyType__Group_1__1 ;
    public final void rule__PolyType__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2881:1: ( rule__PolyType__Group_1__0__Impl rule__PolyType__Group_1__1 )
            // InternalBSharp.g:2882:2: rule__PolyType__Group_1__0__Impl rule__PolyType__Group_1__1
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
    // InternalBSharp.g:2889:1: rule__PolyType__Group_1__0__Impl : ( ':' ) ;
    public final void rule__PolyType__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2893:1: ( ( ':' ) )
            // InternalBSharp.g:2894:1: ( ':' )
            {
            // InternalBSharp.g:2894:1: ( ':' )
            // InternalBSharp.g:2895:2: ':'
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
    // InternalBSharp.g:2904:1: rule__PolyType__Group_1__1 : rule__PolyType__Group_1__1__Impl rule__PolyType__Group_1__2 ;
    public final void rule__PolyType__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2908:1: ( rule__PolyType__Group_1__1__Impl rule__PolyType__Group_1__2 )
            // InternalBSharp.g:2909:2: rule__PolyType__Group_1__1__Impl rule__PolyType__Group_1__2
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
    // InternalBSharp.g:2916:1: rule__PolyType__Group_1__1__Impl : ( ( rule__PolyType__SuperTypesAssignment_1_1 ) ) ;
    public final void rule__PolyType__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2920:1: ( ( ( rule__PolyType__SuperTypesAssignment_1_1 ) ) )
            // InternalBSharp.g:2921:1: ( ( rule__PolyType__SuperTypesAssignment_1_1 ) )
            {
            // InternalBSharp.g:2921:1: ( ( rule__PolyType__SuperTypesAssignment_1_1 ) )
            // InternalBSharp.g:2922:2: ( rule__PolyType__SuperTypesAssignment_1_1 )
            {
             before(grammarAccess.getPolyTypeAccess().getSuperTypesAssignment_1_1()); 
            // InternalBSharp.g:2923:2: ( rule__PolyType__SuperTypesAssignment_1_1 )
            // InternalBSharp.g:2923:3: rule__PolyType__SuperTypesAssignment_1_1
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
    // InternalBSharp.g:2931:1: rule__PolyType__Group_1__2 : rule__PolyType__Group_1__2__Impl ;
    public final void rule__PolyType__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2935:1: ( rule__PolyType__Group_1__2__Impl )
            // InternalBSharp.g:2936:2: rule__PolyType__Group_1__2__Impl
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
    // InternalBSharp.g:2942:1: rule__PolyType__Group_1__2__Impl : ( ( rule__PolyType__Group_1_2__0 )* ) ;
    public final void rule__PolyType__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2946:1: ( ( ( rule__PolyType__Group_1_2__0 )* ) )
            // InternalBSharp.g:2947:1: ( ( rule__PolyType__Group_1_2__0 )* )
            {
            // InternalBSharp.g:2947:1: ( ( rule__PolyType__Group_1_2__0 )* )
            // InternalBSharp.g:2948:2: ( rule__PolyType__Group_1_2__0 )*
            {
             before(grammarAccess.getPolyTypeAccess().getGroup_1_2()); 
            // InternalBSharp.g:2949:2: ( rule__PolyType__Group_1_2__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==44) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalBSharp.g:2949:3: rule__PolyType__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__PolyType__Group_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
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
    // InternalBSharp.g:2958:1: rule__PolyType__Group_1_2__0 : rule__PolyType__Group_1_2__0__Impl rule__PolyType__Group_1_2__1 ;
    public final void rule__PolyType__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2962:1: ( rule__PolyType__Group_1_2__0__Impl rule__PolyType__Group_1_2__1 )
            // InternalBSharp.g:2963:2: rule__PolyType__Group_1_2__0__Impl rule__PolyType__Group_1_2__1
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
    // InternalBSharp.g:2970:1: rule__PolyType__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__PolyType__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2974:1: ( ( ',' ) )
            // InternalBSharp.g:2975:1: ( ',' )
            {
            // InternalBSharp.g:2975:1: ( ',' )
            // InternalBSharp.g:2976:2: ','
            {
             before(grammarAccess.getPolyTypeAccess().getCommaKeyword_1_2_0()); 
            match(input,44,FOLLOW_2); 
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
    // InternalBSharp.g:2985:1: rule__PolyType__Group_1_2__1 : rule__PolyType__Group_1_2__1__Impl ;
    public final void rule__PolyType__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:2989:1: ( rule__PolyType__Group_1_2__1__Impl )
            // InternalBSharp.g:2990:2: rule__PolyType__Group_1_2__1__Impl
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
    // InternalBSharp.g:2996:1: rule__PolyType__Group_1_2__1__Impl : ( ( rule__PolyType__SuperTypesAssignment_1_2_1 ) ) ;
    public final void rule__PolyType__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3000:1: ( ( ( rule__PolyType__SuperTypesAssignment_1_2_1 ) ) )
            // InternalBSharp.g:3001:1: ( ( rule__PolyType__SuperTypesAssignment_1_2_1 ) )
            {
            // InternalBSharp.g:3001:1: ( ( rule__PolyType__SuperTypesAssignment_1_2_1 ) )
            // InternalBSharp.g:3002:2: ( rule__PolyType__SuperTypesAssignment_1_2_1 )
            {
             before(grammarAccess.getPolyTypeAccess().getSuperTypesAssignment_1_2_1()); 
            // InternalBSharp.g:3003:2: ( rule__PolyType__SuperTypesAssignment_1_2_1 )
            // InternalBSharp.g:3003:3: rule__PolyType__SuperTypesAssignment_1_2_1
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
    // InternalBSharp.g:3012:1: rule__SuperTypeList__Group__0 : rule__SuperTypeList__Group__0__Impl rule__SuperTypeList__Group__1 ;
    public final void rule__SuperTypeList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3016:1: ( rule__SuperTypeList__Group__0__Impl rule__SuperTypeList__Group__1 )
            // InternalBSharp.g:3017:2: rule__SuperTypeList__Group__0__Impl rule__SuperTypeList__Group__1
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
    // InternalBSharp.g:3024:1: rule__SuperTypeList__Group__0__Impl : ( ':' ) ;
    public final void rule__SuperTypeList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3028:1: ( ( ':' ) )
            // InternalBSharp.g:3029:1: ( ':' )
            {
            // InternalBSharp.g:3029:1: ( ':' )
            // InternalBSharp.g:3030:2: ':'
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
    // InternalBSharp.g:3039:1: rule__SuperTypeList__Group__1 : rule__SuperTypeList__Group__1__Impl rule__SuperTypeList__Group__2 ;
    public final void rule__SuperTypeList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3043:1: ( rule__SuperTypeList__Group__1__Impl rule__SuperTypeList__Group__2 )
            // InternalBSharp.g:3044:2: rule__SuperTypeList__Group__1__Impl rule__SuperTypeList__Group__2
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
    // InternalBSharp.g:3051:1: rule__SuperTypeList__Group__1__Impl : ( ( rule__SuperTypeList__SuperTypesAssignment_1 ) ) ;
    public final void rule__SuperTypeList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3055:1: ( ( ( rule__SuperTypeList__SuperTypesAssignment_1 ) ) )
            // InternalBSharp.g:3056:1: ( ( rule__SuperTypeList__SuperTypesAssignment_1 ) )
            {
            // InternalBSharp.g:3056:1: ( ( rule__SuperTypeList__SuperTypesAssignment_1 ) )
            // InternalBSharp.g:3057:2: ( rule__SuperTypeList__SuperTypesAssignment_1 )
            {
             before(grammarAccess.getSuperTypeListAccess().getSuperTypesAssignment_1()); 
            // InternalBSharp.g:3058:2: ( rule__SuperTypeList__SuperTypesAssignment_1 )
            // InternalBSharp.g:3058:3: rule__SuperTypeList__SuperTypesAssignment_1
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
    // InternalBSharp.g:3066:1: rule__SuperTypeList__Group__2 : rule__SuperTypeList__Group__2__Impl ;
    public final void rule__SuperTypeList__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3070:1: ( rule__SuperTypeList__Group__2__Impl )
            // InternalBSharp.g:3071:2: rule__SuperTypeList__Group__2__Impl
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
    // InternalBSharp.g:3077:1: rule__SuperTypeList__Group__2__Impl : ( ( rule__SuperTypeList__Group_2__0 )* ) ;
    public final void rule__SuperTypeList__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3081:1: ( ( ( rule__SuperTypeList__Group_2__0 )* ) )
            // InternalBSharp.g:3082:1: ( ( rule__SuperTypeList__Group_2__0 )* )
            {
            // InternalBSharp.g:3082:1: ( ( rule__SuperTypeList__Group_2__0 )* )
            // InternalBSharp.g:3083:2: ( rule__SuperTypeList__Group_2__0 )*
            {
             before(grammarAccess.getSuperTypeListAccess().getGroup_2()); 
            // InternalBSharp.g:3084:2: ( rule__SuperTypeList__Group_2__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==44) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalBSharp.g:3084:3: rule__SuperTypeList__Group_2__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__SuperTypeList__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
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
    // InternalBSharp.g:3093:1: rule__SuperTypeList__Group_2__0 : rule__SuperTypeList__Group_2__0__Impl rule__SuperTypeList__Group_2__1 ;
    public final void rule__SuperTypeList__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3097:1: ( rule__SuperTypeList__Group_2__0__Impl rule__SuperTypeList__Group_2__1 )
            // InternalBSharp.g:3098:2: rule__SuperTypeList__Group_2__0__Impl rule__SuperTypeList__Group_2__1
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
    // InternalBSharp.g:3105:1: rule__SuperTypeList__Group_2__0__Impl : ( ',' ) ;
    public final void rule__SuperTypeList__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3109:1: ( ( ',' ) )
            // InternalBSharp.g:3110:1: ( ',' )
            {
            // InternalBSharp.g:3110:1: ( ',' )
            // InternalBSharp.g:3111:2: ','
            {
             before(grammarAccess.getSuperTypeListAccess().getCommaKeyword_2_0()); 
            match(input,44,FOLLOW_2); 
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
    // InternalBSharp.g:3120:1: rule__SuperTypeList__Group_2__1 : rule__SuperTypeList__Group_2__1__Impl ;
    public final void rule__SuperTypeList__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3124:1: ( rule__SuperTypeList__Group_2__1__Impl )
            // InternalBSharp.g:3125:2: rule__SuperTypeList__Group_2__1__Impl
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
    // InternalBSharp.g:3131:1: rule__SuperTypeList__Group_2__1__Impl : ( ( rule__SuperTypeList__SuperTypesAssignment_2_1 ) ) ;
    public final void rule__SuperTypeList__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3135:1: ( ( ( rule__SuperTypeList__SuperTypesAssignment_2_1 ) ) )
            // InternalBSharp.g:3136:1: ( ( rule__SuperTypeList__SuperTypesAssignment_2_1 ) )
            {
            // InternalBSharp.g:3136:1: ( ( rule__SuperTypeList__SuperTypesAssignment_2_1 ) )
            // InternalBSharp.g:3137:2: ( rule__SuperTypeList__SuperTypesAssignment_2_1 )
            {
             before(grammarAccess.getSuperTypeListAccess().getSuperTypesAssignment_2_1()); 
            // InternalBSharp.g:3138:2: ( rule__SuperTypeList__SuperTypesAssignment_2_1 )
            // InternalBSharp.g:3138:3: rule__SuperTypeList__SuperTypesAssignment_2_1
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
    // InternalBSharp.g:3147:1: rule__ConstructedType__Group__0 : rule__ConstructedType__Group__0__Impl rule__ConstructedType__Group__1 ;
    public final void rule__ConstructedType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3151:1: ( rule__ConstructedType__Group__0__Impl rule__ConstructedType__Group__1 )
            // InternalBSharp.g:3152:2: rule__ConstructedType__Group__0__Impl rule__ConstructedType__Group__1
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
    // InternalBSharp.g:3159:1: rule__ConstructedType__Group__0__Impl : ( ruleBuilderElem ) ;
    public final void rule__ConstructedType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3163:1: ( ( ruleBuilderElem ) )
            // InternalBSharp.g:3164:1: ( ruleBuilderElem )
            {
            // InternalBSharp.g:3164:1: ( ruleBuilderElem )
            // InternalBSharp.g:3165:2: ruleBuilderElem
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
    // InternalBSharp.g:3174:1: rule__ConstructedType__Group__1 : rule__ConstructedType__Group__1__Impl ;
    public final void rule__ConstructedType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3178:1: ( rule__ConstructedType__Group__1__Impl )
            // InternalBSharp.g:3179:2: rule__ConstructedType__Group__1__Impl
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
    // InternalBSharp.g:3185:1: rule__ConstructedType__Group__1__Impl : ( ( rule__ConstructedType__Group_1__0 )* ) ;
    public final void rule__ConstructedType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3189:1: ( ( ( rule__ConstructedType__Group_1__0 )* ) )
            // InternalBSharp.g:3190:1: ( ( rule__ConstructedType__Group_1__0 )* )
            {
            // InternalBSharp.g:3190:1: ( ( rule__ConstructedType__Group_1__0 )* )
            // InternalBSharp.g:3191:2: ( rule__ConstructedType__Group_1__0 )*
            {
             before(grammarAccess.getConstructedTypeAccess().getGroup_1()); 
            // InternalBSharp.g:3192:2: ( rule__ConstructedType__Group_1__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( ((LA33_0>=13 && LA33_0<=22)) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalBSharp.g:3192:3: rule__ConstructedType__Group_1__0
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__ConstructedType__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
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
    // InternalBSharp.g:3201:1: rule__ConstructedType__Group_1__0 : rule__ConstructedType__Group_1__0__Impl rule__ConstructedType__Group_1__1 ;
    public final void rule__ConstructedType__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3205:1: ( rule__ConstructedType__Group_1__0__Impl rule__ConstructedType__Group_1__1 )
            // InternalBSharp.g:3206:2: rule__ConstructedType__Group_1__0__Impl rule__ConstructedType__Group_1__1
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
    // InternalBSharp.g:3213:1: rule__ConstructedType__Group_1__0__Impl : ( () ) ;
    public final void rule__ConstructedType__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3217:1: ( ( () ) )
            // InternalBSharp.g:3218:1: ( () )
            {
            // InternalBSharp.g:3218:1: ( () )
            // InternalBSharp.g:3219:2: ()
            {
             before(grammarAccess.getConstructedTypeAccess().getConstructedTypeLeftAction_1_0()); 
            // InternalBSharp.g:3220:2: ()
            // InternalBSharp.g:3220:3: 
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
    // InternalBSharp.g:3228:1: rule__ConstructedType__Group_1__1 : rule__ConstructedType__Group_1__1__Impl rule__ConstructedType__Group_1__2 ;
    public final void rule__ConstructedType__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3232:1: ( rule__ConstructedType__Group_1__1__Impl rule__ConstructedType__Group_1__2 )
            // InternalBSharp.g:3233:2: rule__ConstructedType__Group_1__1__Impl rule__ConstructedType__Group_1__2
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
    // InternalBSharp.g:3240:1: rule__ConstructedType__Group_1__1__Impl : ( ( rule__ConstructedType__ConstructorAssignment_1_1 ) ) ;
    public final void rule__ConstructedType__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3244:1: ( ( ( rule__ConstructedType__ConstructorAssignment_1_1 ) ) )
            // InternalBSharp.g:3245:1: ( ( rule__ConstructedType__ConstructorAssignment_1_1 ) )
            {
            // InternalBSharp.g:3245:1: ( ( rule__ConstructedType__ConstructorAssignment_1_1 ) )
            // InternalBSharp.g:3246:2: ( rule__ConstructedType__ConstructorAssignment_1_1 )
            {
             before(grammarAccess.getConstructedTypeAccess().getConstructorAssignment_1_1()); 
            // InternalBSharp.g:3247:2: ( rule__ConstructedType__ConstructorAssignment_1_1 )
            // InternalBSharp.g:3247:3: rule__ConstructedType__ConstructorAssignment_1_1
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
    // InternalBSharp.g:3255:1: rule__ConstructedType__Group_1__2 : rule__ConstructedType__Group_1__2__Impl ;
    public final void rule__ConstructedType__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3259:1: ( rule__ConstructedType__Group_1__2__Impl )
            // InternalBSharp.g:3260:2: rule__ConstructedType__Group_1__2__Impl
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
    // InternalBSharp.g:3266:1: rule__ConstructedType__Group_1__2__Impl : ( ( rule__ConstructedType__RightAssignment_1_2 ) ) ;
    public final void rule__ConstructedType__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3270:1: ( ( ( rule__ConstructedType__RightAssignment_1_2 ) ) )
            // InternalBSharp.g:3271:1: ( ( rule__ConstructedType__RightAssignment_1_2 ) )
            {
            // InternalBSharp.g:3271:1: ( ( rule__ConstructedType__RightAssignment_1_2 ) )
            // InternalBSharp.g:3272:2: ( rule__ConstructedType__RightAssignment_1_2 )
            {
             before(grammarAccess.getConstructedTypeAccess().getRightAssignment_1_2()); 
            // InternalBSharp.g:3273:2: ( rule__ConstructedType__RightAssignment_1_2 )
            // InternalBSharp.g:3273:3: rule__ConstructedType__RightAssignment_1_2
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
    // InternalBSharp.g:3282:1: rule__TypeConstructor__Group__0 : rule__TypeConstructor__Group__0__Impl rule__TypeConstructor__Group__1 ;
    public final void rule__TypeConstructor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3286:1: ( rule__TypeConstructor__Group__0__Impl rule__TypeConstructor__Group__1 )
            // InternalBSharp.g:3287:2: rule__TypeConstructor__Group__0__Impl rule__TypeConstructor__Group__1
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
    // InternalBSharp.g:3294:1: rule__TypeConstructor__Group__0__Impl : ( ( rule__TypeConstructor__TypeNameAssignment_0 ) ) ;
    public final void rule__TypeConstructor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3298:1: ( ( ( rule__TypeConstructor__TypeNameAssignment_0 ) ) )
            // InternalBSharp.g:3299:1: ( ( rule__TypeConstructor__TypeNameAssignment_0 ) )
            {
            // InternalBSharp.g:3299:1: ( ( rule__TypeConstructor__TypeNameAssignment_0 ) )
            // InternalBSharp.g:3300:2: ( rule__TypeConstructor__TypeNameAssignment_0 )
            {
             before(grammarAccess.getTypeConstructorAccess().getTypeNameAssignment_0()); 
            // InternalBSharp.g:3301:2: ( rule__TypeConstructor__TypeNameAssignment_0 )
            // InternalBSharp.g:3301:3: rule__TypeConstructor__TypeNameAssignment_0
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
    // InternalBSharp.g:3309:1: rule__TypeConstructor__Group__1 : rule__TypeConstructor__Group__1__Impl ;
    public final void rule__TypeConstructor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3313:1: ( rule__TypeConstructor__Group__1__Impl )
            // InternalBSharp.g:3314:2: rule__TypeConstructor__Group__1__Impl
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
    // InternalBSharp.g:3320:1: rule__TypeConstructor__Group__1__Impl : ( ( rule__TypeConstructor__ContextAssignment_1 )? ) ;
    public final void rule__TypeConstructor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3324:1: ( ( ( rule__TypeConstructor__ContextAssignment_1 )? ) )
            // InternalBSharp.g:3325:1: ( ( rule__TypeConstructor__ContextAssignment_1 )? )
            {
            // InternalBSharp.g:3325:1: ( ( rule__TypeConstructor__ContextAssignment_1 )? )
            // InternalBSharp.g:3326:2: ( rule__TypeConstructor__ContextAssignment_1 )?
            {
             before(grammarAccess.getTypeConstructorAccess().getContextAssignment_1()); 
            // InternalBSharp.g:3327:2: ( rule__TypeConstructor__ContextAssignment_1 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==42) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalBSharp.g:3327:3: rule__TypeConstructor__ContextAssignment_1
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
    // InternalBSharp.g:3336:1: rule__TypePowerSet__Group__0 : rule__TypePowerSet__Group__0__Impl rule__TypePowerSet__Group__1 ;
    public final void rule__TypePowerSet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3340:1: ( rule__TypePowerSet__Group__0__Impl rule__TypePowerSet__Group__1 )
            // InternalBSharp.g:3341:2: rule__TypePowerSet__Group__0__Impl rule__TypePowerSet__Group__1
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
    // InternalBSharp.g:3348:1: rule__TypePowerSet__Group__0__Impl : ( '\\u2119' ) ;
    public final void rule__TypePowerSet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3352:1: ( ( '\\u2119' ) )
            // InternalBSharp.g:3353:1: ( '\\u2119' )
            {
            // InternalBSharp.g:3353:1: ( '\\u2119' )
            // InternalBSharp.g:3354:2: '\\u2119'
            {
             before(grammarAccess.getTypePowerSetAccess().getDoubleStruckCapitalPKeyword_0()); 
            match(input,45,FOLLOW_2); 
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
    // InternalBSharp.g:3363:1: rule__TypePowerSet__Group__1 : rule__TypePowerSet__Group__1__Impl rule__TypePowerSet__Group__2 ;
    public final void rule__TypePowerSet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3367:1: ( rule__TypePowerSet__Group__1__Impl rule__TypePowerSet__Group__2 )
            // InternalBSharp.g:3368:2: rule__TypePowerSet__Group__1__Impl rule__TypePowerSet__Group__2
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
    // InternalBSharp.g:3375:1: rule__TypePowerSet__Group__1__Impl : ( '(' ) ;
    public final void rule__TypePowerSet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3379:1: ( ( '(' ) )
            // InternalBSharp.g:3380:1: ( '(' )
            {
            // InternalBSharp.g:3380:1: ( '(' )
            // InternalBSharp.g:3381:2: '('
            {
             before(grammarAccess.getTypePowerSetAccess().getLeftParenthesisKeyword_1()); 
            match(input,40,FOLLOW_2); 
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
    // InternalBSharp.g:3390:1: rule__TypePowerSet__Group__2 : rule__TypePowerSet__Group__2__Impl rule__TypePowerSet__Group__3 ;
    public final void rule__TypePowerSet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3394:1: ( rule__TypePowerSet__Group__2__Impl rule__TypePowerSet__Group__3 )
            // InternalBSharp.g:3395:2: rule__TypePowerSet__Group__2__Impl rule__TypePowerSet__Group__3
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
    // InternalBSharp.g:3402:1: rule__TypePowerSet__Group__2__Impl : ( ( rule__TypePowerSet__ChildAssignment_2 ) ) ;
    public final void rule__TypePowerSet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3406:1: ( ( ( rule__TypePowerSet__ChildAssignment_2 ) ) )
            // InternalBSharp.g:3407:1: ( ( rule__TypePowerSet__ChildAssignment_2 ) )
            {
            // InternalBSharp.g:3407:1: ( ( rule__TypePowerSet__ChildAssignment_2 ) )
            // InternalBSharp.g:3408:2: ( rule__TypePowerSet__ChildAssignment_2 )
            {
             before(grammarAccess.getTypePowerSetAccess().getChildAssignment_2()); 
            // InternalBSharp.g:3409:2: ( rule__TypePowerSet__ChildAssignment_2 )
            // InternalBSharp.g:3409:3: rule__TypePowerSet__ChildAssignment_2
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
    // InternalBSharp.g:3417:1: rule__TypePowerSet__Group__3 : rule__TypePowerSet__Group__3__Impl ;
    public final void rule__TypePowerSet__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3421:1: ( rule__TypePowerSet__Group__3__Impl )
            // InternalBSharp.g:3422:2: rule__TypePowerSet__Group__3__Impl
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
    // InternalBSharp.g:3428:1: rule__TypePowerSet__Group__3__Impl : ( ')' ) ;
    public final void rule__TypePowerSet__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3432:1: ( ( ')' ) )
            // InternalBSharp.g:3433:1: ( ')' )
            {
            // InternalBSharp.g:3433:1: ( ')' )
            // InternalBSharp.g:3434:2: ')'
            {
             before(grammarAccess.getTypePowerSetAccess().getRightParenthesisKeyword_3()); 
            match(input,41,FOLLOW_2); 
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
    // InternalBSharp.g:3444:1: rule__TypeConstrBracket__Group__0 : rule__TypeConstrBracket__Group__0__Impl rule__TypeConstrBracket__Group__1 ;
    public final void rule__TypeConstrBracket__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3448:1: ( rule__TypeConstrBracket__Group__0__Impl rule__TypeConstrBracket__Group__1 )
            // InternalBSharp.g:3449:2: rule__TypeConstrBracket__Group__0__Impl rule__TypeConstrBracket__Group__1
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
    // InternalBSharp.g:3456:1: rule__TypeConstrBracket__Group__0__Impl : ( '(' ) ;
    public final void rule__TypeConstrBracket__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3460:1: ( ( '(' ) )
            // InternalBSharp.g:3461:1: ( '(' )
            {
            // InternalBSharp.g:3461:1: ( '(' )
            // InternalBSharp.g:3462:2: '('
            {
             before(grammarAccess.getTypeConstrBracketAccess().getLeftParenthesisKeyword_0()); 
            match(input,40,FOLLOW_2); 
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
    // InternalBSharp.g:3471:1: rule__TypeConstrBracket__Group__1 : rule__TypeConstrBracket__Group__1__Impl rule__TypeConstrBracket__Group__2 ;
    public final void rule__TypeConstrBracket__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3475:1: ( rule__TypeConstrBracket__Group__1__Impl rule__TypeConstrBracket__Group__2 )
            // InternalBSharp.g:3476:2: rule__TypeConstrBracket__Group__1__Impl rule__TypeConstrBracket__Group__2
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
    // InternalBSharp.g:3483:1: rule__TypeConstrBracket__Group__1__Impl : ( ( rule__TypeConstrBracket__ChildAssignment_1 ) ) ;
    public final void rule__TypeConstrBracket__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3487:1: ( ( ( rule__TypeConstrBracket__ChildAssignment_1 ) ) )
            // InternalBSharp.g:3488:1: ( ( rule__TypeConstrBracket__ChildAssignment_1 ) )
            {
            // InternalBSharp.g:3488:1: ( ( rule__TypeConstrBracket__ChildAssignment_1 ) )
            // InternalBSharp.g:3489:2: ( rule__TypeConstrBracket__ChildAssignment_1 )
            {
             before(grammarAccess.getTypeConstrBracketAccess().getChildAssignment_1()); 
            // InternalBSharp.g:3490:2: ( rule__TypeConstrBracket__ChildAssignment_1 )
            // InternalBSharp.g:3490:3: rule__TypeConstrBracket__ChildAssignment_1
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
    // InternalBSharp.g:3498:1: rule__TypeConstrBracket__Group__2 : rule__TypeConstrBracket__Group__2__Impl ;
    public final void rule__TypeConstrBracket__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3502:1: ( rule__TypeConstrBracket__Group__2__Impl )
            // InternalBSharp.g:3503:2: rule__TypeConstrBracket__Group__2__Impl
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
    // InternalBSharp.g:3509:1: rule__TypeConstrBracket__Group__2__Impl : ( ')' ) ;
    public final void rule__TypeConstrBracket__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3513:1: ( ( ')' ) )
            // InternalBSharp.g:3514:1: ( ')' )
            {
            // InternalBSharp.g:3514:1: ( ')' )
            // InternalBSharp.g:3515:2: ')'
            {
             before(grammarAccess.getTypeConstrBracketAccess().getRightParenthesisKeyword_2()); 
            match(input,41,FOLLOW_2); 
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
    // InternalBSharp.g:3525:1: rule__TypeDeclContext__Group__0 : rule__TypeDeclContext__Group__0__Impl rule__TypeDeclContext__Group__1 ;
    public final void rule__TypeDeclContext__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3529:1: ( rule__TypeDeclContext__Group__0__Impl rule__TypeDeclContext__Group__1 )
            // InternalBSharp.g:3530:2: rule__TypeDeclContext__Group__0__Impl rule__TypeDeclContext__Group__1
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
    // InternalBSharp.g:3537:1: rule__TypeDeclContext__Group__0__Impl : ( '<' ) ;
    public final void rule__TypeDeclContext__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3541:1: ( ( '<' ) )
            // InternalBSharp.g:3542:1: ( '<' )
            {
            // InternalBSharp.g:3542:1: ( '<' )
            // InternalBSharp.g:3543:2: '<'
            {
             before(grammarAccess.getTypeDeclContextAccess().getLessThanSignKeyword_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalBSharp.g:3552:1: rule__TypeDeclContext__Group__1 : rule__TypeDeclContext__Group__1__Impl rule__TypeDeclContext__Group__2 ;
    public final void rule__TypeDeclContext__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3556:1: ( rule__TypeDeclContext__Group__1__Impl rule__TypeDeclContext__Group__2 )
            // InternalBSharp.g:3557:2: rule__TypeDeclContext__Group__1__Impl rule__TypeDeclContext__Group__2
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
    // InternalBSharp.g:3564:1: rule__TypeDeclContext__Group__1__Impl : ( ( rule__TypeDeclContext__TypeNameAssignment_1 ) ) ;
    public final void rule__TypeDeclContext__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3568:1: ( ( ( rule__TypeDeclContext__TypeNameAssignment_1 ) ) )
            // InternalBSharp.g:3569:1: ( ( rule__TypeDeclContext__TypeNameAssignment_1 ) )
            {
            // InternalBSharp.g:3569:1: ( ( rule__TypeDeclContext__TypeNameAssignment_1 ) )
            // InternalBSharp.g:3570:2: ( rule__TypeDeclContext__TypeNameAssignment_1 )
            {
             before(grammarAccess.getTypeDeclContextAccess().getTypeNameAssignment_1()); 
            // InternalBSharp.g:3571:2: ( rule__TypeDeclContext__TypeNameAssignment_1 )
            // InternalBSharp.g:3571:3: rule__TypeDeclContext__TypeNameAssignment_1
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
    // InternalBSharp.g:3579:1: rule__TypeDeclContext__Group__2 : rule__TypeDeclContext__Group__2__Impl rule__TypeDeclContext__Group__3 ;
    public final void rule__TypeDeclContext__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3583:1: ( rule__TypeDeclContext__Group__2__Impl rule__TypeDeclContext__Group__3 )
            // InternalBSharp.g:3584:2: rule__TypeDeclContext__Group__2__Impl rule__TypeDeclContext__Group__3
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
    // InternalBSharp.g:3591:1: rule__TypeDeclContext__Group__2__Impl : ( ( rule__TypeDeclContext__Group_2__0 )* ) ;
    public final void rule__TypeDeclContext__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3595:1: ( ( ( rule__TypeDeclContext__Group_2__0 )* ) )
            // InternalBSharp.g:3596:1: ( ( rule__TypeDeclContext__Group_2__0 )* )
            {
            // InternalBSharp.g:3596:1: ( ( rule__TypeDeclContext__Group_2__0 )* )
            // InternalBSharp.g:3597:2: ( rule__TypeDeclContext__Group_2__0 )*
            {
             before(grammarAccess.getTypeDeclContextAccess().getGroup_2()); 
            // InternalBSharp.g:3598:2: ( rule__TypeDeclContext__Group_2__0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==44) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalBSharp.g:3598:3: rule__TypeDeclContext__Group_2__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__TypeDeclContext__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
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
    // InternalBSharp.g:3606:1: rule__TypeDeclContext__Group__3 : rule__TypeDeclContext__Group__3__Impl ;
    public final void rule__TypeDeclContext__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3610:1: ( rule__TypeDeclContext__Group__3__Impl )
            // InternalBSharp.g:3611:2: rule__TypeDeclContext__Group__3__Impl
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
    // InternalBSharp.g:3617:1: rule__TypeDeclContext__Group__3__Impl : ( '>' ) ;
    public final void rule__TypeDeclContext__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3621:1: ( ( '>' ) )
            // InternalBSharp.g:3622:1: ( '>' )
            {
            // InternalBSharp.g:3622:1: ( '>' )
            // InternalBSharp.g:3623:2: '>'
            {
             before(grammarAccess.getTypeDeclContextAccess().getGreaterThanSignKeyword_3()); 
            match(input,43,FOLLOW_2); 
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
    // InternalBSharp.g:3633:1: rule__TypeDeclContext__Group_2__0 : rule__TypeDeclContext__Group_2__0__Impl rule__TypeDeclContext__Group_2__1 ;
    public final void rule__TypeDeclContext__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3637:1: ( rule__TypeDeclContext__Group_2__0__Impl rule__TypeDeclContext__Group_2__1 )
            // InternalBSharp.g:3638:2: rule__TypeDeclContext__Group_2__0__Impl rule__TypeDeclContext__Group_2__1
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
    // InternalBSharp.g:3645:1: rule__TypeDeclContext__Group_2__0__Impl : ( ',' ) ;
    public final void rule__TypeDeclContext__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3649:1: ( ( ',' ) )
            // InternalBSharp.g:3650:1: ( ',' )
            {
            // InternalBSharp.g:3650:1: ( ',' )
            // InternalBSharp.g:3651:2: ','
            {
             before(grammarAccess.getTypeDeclContextAccess().getCommaKeyword_2_0()); 
            match(input,44,FOLLOW_2); 
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
    // InternalBSharp.g:3660:1: rule__TypeDeclContext__Group_2__1 : rule__TypeDeclContext__Group_2__1__Impl ;
    public final void rule__TypeDeclContext__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3664:1: ( rule__TypeDeclContext__Group_2__1__Impl )
            // InternalBSharp.g:3665:2: rule__TypeDeclContext__Group_2__1__Impl
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
    // InternalBSharp.g:3671:1: rule__TypeDeclContext__Group_2__1__Impl : ( ( rule__TypeDeclContext__TypeNameAssignment_2_1 ) ) ;
    public final void rule__TypeDeclContext__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3675:1: ( ( ( rule__TypeDeclContext__TypeNameAssignment_2_1 ) ) )
            // InternalBSharp.g:3676:1: ( ( rule__TypeDeclContext__TypeNameAssignment_2_1 ) )
            {
            // InternalBSharp.g:3676:1: ( ( rule__TypeDeclContext__TypeNameAssignment_2_1 ) )
            // InternalBSharp.g:3677:2: ( rule__TypeDeclContext__TypeNameAssignment_2_1 )
            {
             before(grammarAccess.getTypeDeclContextAccess().getTypeNameAssignment_2_1()); 
            // InternalBSharp.g:3678:2: ( rule__TypeDeclContext__TypeNameAssignment_2_1 )
            // InternalBSharp.g:3678:3: rule__TypeDeclContext__TypeNameAssignment_2_1
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
    // InternalBSharp.g:3687:1: rule__Where__Group__0 : rule__Where__Group__0__Impl rule__Where__Group__1 ;
    public final void rule__Where__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3691:1: ( rule__Where__Group__0__Impl rule__Where__Group__1 )
            // InternalBSharp.g:3692:2: rule__Where__Group__0__Impl rule__Where__Group__1
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
    // InternalBSharp.g:3699:1: rule__Where__Group__0__Impl : ( 'where' ) ;
    public final void rule__Where__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3703:1: ( ( 'where' ) )
            // InternalBSharp.g:3704:1: ( 'where' )
            {
            // InternalBSharp.g:3704:1: ( 'where' )
            // InternalBSharp.g:3705:2: 'where'
            {
             before(grammarAccess.getWhereAccess().getWhereKeyword_0()); 
            match(input,46,FOLLOW_2); 
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
    // InternalBSharp.g:3714:1: rule__Where__Group__1 : rule__Where__Group__1__Impl rule__Where__Group__2 ;
    public final void rule__Where__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3718:1: ( rule__Where__Group__1__Impl rule__Where__Group__2 )
            // InternalBSharp.g:3719:2: rule__Where__Group__1__Impl rule__Where__Group__2
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
    // InternalBSharp.g:3726:1: rule__Where__Group__1__Impl : ( ( rule__Where__ExpressionsAssignment_1 ) ) ;
    public final void rule__Where__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3730:1: ( ( ( rule__Where__ExpressionsAssignment_1 ) ) )
            // InternalBSharp.g:3731:1: ( ( rule__Where__ExpressionsAssignment_1 ) )
            {
            // InternalBSharp.g:3731:1: ( ( rule__Where__ExpressionsAssignment_1 ) )
            // InternalBSharp.g:3732:2: ( rule__Where__ExpressionsAssignment_1 )
            {
             before(grammarAccess.getWhereAccess().getExpressionsAssignment_1()); 
            // InternalBSharp.g:3733:2: ( rule__Where__ExpressionsAssignment_1 )
            // InternalBSharp.g:3733:3: rule__Where__ExpressionsAssignment_1
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
    // InternalBSharp.g:3741:1: rule__Where__Group__2 : rule__Where__Group__2__Impl ;
    public final void rule__Where__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3745:1: ( rule__Where__Group__2__Impl )
            // InternalBSharp.g:3746:2: rule__Where__Group__2__Impl
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
    // InternalBSharp.g:3752:1: rule__Where__Group__2__Impl : ( ( rule__Where__Group_2__0 )* ) ;
    public final void rule__Where__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3756:1: ( ( ( rule__Where__Group_2__0 )* ) )
            // InternalBSharp.g:3757:1: ( ( rule__Where__Group_2__0 )* )
            {
            // InternalBSharp.g:3757:1: ( ( rule__Where__Group_2__0 )* )
            // InternalBSharp.g:3758:2: ( rule__Where__Group_2__0 )*
            {
             before(grammarAccess.getWhereAccess().getGroup_2()); 
            // InternalBSharp.g:3759:2: ( rule__Where__Group_2__0 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==37) ) {
                    int LA36_2 = input.LA(2);

                    if ( (LA36_2==RULE_ID||LA36_2==11||(LA36_2>=23 && LA36_2<=24)||LA36_2==40||LA36_2==52||LA36_2==57) ) {
                        alt36=1;
                    }


                }


                switch (alt36) {
            	case 1 :
            	    // InternalBSharp.g:3759:3: rule__Where__Group_2__0
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__Where__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop36;
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
    // InternalBSharp.g:3768:1: rule__Where__Group_2__0 : rule__Where__Group_2__0__Impl rule__Where__Group_2__1 ;
    public final void rule__Where__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3772:1: ( rule__Where__Group_2__0__Impl rule__Where__Group_2__1 )
            // InternalBSharp.g:3773:2: rule__Where__Group_2__0__Impl rule__Where__Group_2__1
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
    // InternalBSharp.g:3780:1: rule__Where__Group_2__0__Impl : ( ';' ) ;
    public final void rule__Where__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3784:1: ( ( ';' ) )
            // InternalBSharp.g:3785:1: ( ';' )
            {
            // InternalBSharp.g:3785:1: ( ';' )
            // InternalBSharp.g:3786:2: ';'
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
    // InternalBSharp.g:3795:1: rule__Where__Group_2__1 : rule__Where__Group_2__1__Impl ;
    public final void rule__Where__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3799:1: ( rule__Where__Group_2__1__Impl )
            // InternalBSharp.g:3800:2: rule__Where__Group_2__1__Impl
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
    // InternalBSharp.g:3806:1: rule__Where__Group_2__1__Impl : ( ( rule__Where__ExpressionsAssignment_2_1 ) ) ;
    public final void rule__Where__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3810:1: ( ( ( rule__Where__ExpressionsAssignment_2_1 ) ) )
            // InternalBSharp.g:3811:1: ( ( rule__Where__ExpressionsAssignment_2_1 ) )
            {
            // InternalBSharp.g:3811:1: ( ( rule__Where__ExpressionsAssignment_2_1 ) )
            // InternalBSharp.g:3812:2: ( rule__Where__ExpressionsAssignment_2_1 )
            {
             before(grammarAccess.getWhereAccess().getExpressionsAssignment_2_1()); 
            // InternalBSharp.g:3813:2: ( rule__Where__ExpressionsAssignment_2_1 )
            // InternalBSharp.g:3813:3: rule__Where__ExpressionsAssignment_2_1
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
    // InternalBSharp.g:3822:1: rule__Datatype__Group__0 : rule__Datatype__Group__0__Impl rule__Datatype__Group__1 ;
    public final void rule__Datatype__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3826:1: ( rule__Datatype__Group__0__Impl rule__Datatype__Group__1 )
            // InternalBSharp.g:3827:2: rule__Datatype__Group__0__Impl rule__Datatype__Group__1
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
    // InternalBSharp.g:3834:1: rule__Datatype__Group__0__Impl : ( 'Datatype' ) ;
    public final void rule__Datatype__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3838:1: ( ( 'Datatype' ) )
            // InternalBSharp.g:3839:1: ( 'Datatype' )
            {
            // InternalBSharp.g:3839:1: ( 'Datatype' )
            // InternalBSharp.g:3840:2: 'Datatype'
            {
             before(grammarAccess.getDatatypeAccess().getDatatypeKeyword_0()); 
            match(input,47,FOLLOW_2); 
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
    // InternalBSharp.g:3849:1: rule__Datatype__Group__1 : rule__Datatype__Group__1__Impl rule__Datatype__Group__2 ;
    public final void rule__Datatype__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3853:1: ( rule__Datatype__Group__1__Impl rule__Datatype__Group__2 )
            // InternalBSharp.g:3854:2: rule__Datatype__Group__1__Impl rule__Datatype__Group__2
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
    // InternalBSharp.g:3861:1: rule__Datatype__Group__1__Impl : ( ( rule__Datatype__NameAssignment_1 ) ) ;
    public final void rule__Datatype__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3865:1: ( ( ( rule__Datatype__NameAssignment_1 ) ) )
            // InternalBSharp.g:3866:1: ( ( rule__Datatype__NameAssignment_1 ) )
            {
            // InternalBSharp.g:3866:1: ( ( rule__Datatype__NameAssignment_1 ) )
            // InternalBSharp.g:3867:2: ( rule__Datatype__NameAssignment_1 )
            {
             before(grammarAccess.getDatatypeAccess().getNameAssignment_1()); 
            // InternalBSharp.g:3868:2: ( rule__Datatype__NameAssignment_1 )
            // InternalBSharp.g:3868:3: rule__Datatype__NameAssignment_1
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
    // InternalBSharp.g:3876:1: rule__Datatype__Group__2 : rule__Datatype__Group__2__Impl rule__Datatype__Group__3 ;
    public final void rule__Datatype__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3880:1: ( rule__Datatype__Group__2__Impl rule__Datatype__Group__3 )
            // InternalBSharp.g:3881:2: rule__Datatype__Group__2__Impl rule__Datatype__Group__3
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
    // InternalBSharp.g:3888:1: rule__Datatype__Group__2__Impl : ( ( rule__Datatype__ContextAssignment_2 )? ) ;
    public final void rule__Datatype__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3892:1: ( ( ( rule__Datatype__ContextAssignment_2 )? ) )
            // InternalBSharp.g:3893:1: ( ( rule__Datatype__ContextAssignment_2 )? )
            {
            // InternalBSharp.g:3893:1: ( ( rule__Datatype__ContextAssignment_2 )? )
            // InternalBSharp.g:3894:2: ( rule__Datatype__ContextAssignment_2 )?
            {
             before(grammarAccess.getDatatypeAccess().getContextAssignment_2()); 
            // InternalBSharp.g:3895:2: ( rule__Datatype__ContextAssignment_2 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==42) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalBSharp.g:3895:3: rule__Datatype__ContextAssignment_2
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
    // InternalBSharp.g:3903:1: rule__Datatype__Group__3 : rule__Datatype__Group__3__Impl rule__Datatype__Group__4 ;
    public final void rule__Datatype__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3907:1: ( rule__Datatype__Group__3__Impl rule__Datatype__Group__4 )
            // InternalBSharp.g:3908:2: rule__Datatype__Group__3__Impl rule__Datatype__Group__4
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
    // InternalBSharp.g:3915:1: rule__Datatype__Group__3__Impl : ( ( ( rule__Datatype__Group_3__0 ) ) ( ( rule__Datatype__Group_3__0 )* ) ) ;
    public final void rule__Datatype__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3919:1: ( ( ( ( rule__Datatype__Group_3__0 ) ) ( ( rule__Datatype__Group_3__0 )* ) ) )
            // InternalBSharp.g:3920:1: ( ( ( rule__Datatype__Group_3__0 ) ) ( ( rule__Datatype__Group_3__0 )* ) )
            {
            // InternalBSharp.g:3920:1: ( ( ( rule__Datatype__Group_3__0 ) ) ( ( rule__Datatype__Group_3__0 )* ) )
            // InternalBSharp.g:3921:2: ( ( rule__Datatype__Group_3__0 ) ) ( ( rule__Datatype__Group_3__0 )* )
            {
            // InternalBSharp.g:3921:2: ( ( rule__Datatype__Group_3__0 ) )
            // InternalBSharp.g:3922:3: ( rule__Datatype__Group_3__0 )
            {
             before(grammarAccess.getDatatypeAccess().getGroup_3()); 
            // InternalBSharp.g:3923:3: ( rule__Datatype__Group_3__0 )
            // InternalBSharp.g:3923:4: rule__Datatype__Group_3__0
            {
            pushFollow(FOLLOW_32);
            rule__Datatype__Group_3__0();

            state._fsp--;


            }

             after(grammarAccess.getDatatypeAccess().getGroup_3()); 

            }

            // InternalBSharp.g:3926:2: ( ( rule__Datatype__Group_3__0 )* )
            // InternalBSharp.g:3927:3: ( rule__Datatype__Group_3__0 )*
            {
             before(grammarAccess.getDatatypeAccess().getGroup_3()); 
            // InternalBSharp.g:3928:3: ( rule__Datatype__Group_3__0 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==48) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalBSharp.g:3928:4: rule__Datatype__Group_3__0
            	    {
            	    pushFollow(FOLLOW_32);
            	    rule__Datatype__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop38;
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
    // InternalBSharp.g:3937:1: rule__Datatype__Group__4 : rule__Datatype__Group__4__Impl ;
    public final void rule__Datatype__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3941:1: ( rule__Datatype__Group__4__Impl )
            // InternalBSharp.g:3942:2: rule__Datatype__Group__4__Impl
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
    // InternalBSharp.g:3948:1: rule__Datatype__Group__4__Impl : ( ( rule__Datatype__BlockAssignment_4 ) ) ;
    public final void rule__Datatype__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3952:1: ( ( ( rule__Datatype__BlockAssignment_4 ) ) )
            // InternalBSharp.g:3953:1: ( ( rule__Datatype__BlockAssignment_4 ) )
            {
            // InternalBSharp.g:3953:1: ( ( rule__Datatype__BlockAssignment_4 ) )
            // InternalBSharp.g:3954:2: ( rule__Datatype__BlockAssignment_4 )
            {
             before(grammarAccess.getDatatypeAccess().getBlockAssignment_4()); 
            // InternalBSharp.g:3955:2: ( rule__Datatype__BlockAssignment_4 )
            // InternalBSharp.g:3955:3: rule__Datatype__BlockAssignment_4
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
    // InternalBSharp.g:3964:1: rule__Datatype__Group_3__0 : rule__Datatype__Group_3__0__Impl rule__Datatype__Group_3__1 ;
    public final void rule__Datatype__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3968:1: ( rule__Datatype__Group_3__0__Impl rule__Datatype__Group_3__1 )
            // InternalBSharp.g:3969:2: rule__Datatype__Group_3__0__Impl rule__Datatype__Group_3__1
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
    // InternalBSharp.g:3976:1: rule__Datatype__Group_3__0__Impl : ( '|' ) ;
    public final void rule__Datatype__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3980:1: ( ( '|' ) )
            // InternalBSharp.g:3981:1: ( '|' )
            {
            // InternalBSharp.g:3981:1: ( '|' )
            // InternalBSharp.g:3982:2: '|'
            {
             before(grammarAccess.getDatatypeAccess().getVerticalLineKeyword_3_0()); 
            match(input,48,FOLLOW_2); 
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
    // InternalBSharp.g:3991:1: rule__Datatype__Group_3__1 : rule__Datatype__Group_3__1__Impl ;
    public final void rule__Datatype__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:3995:1: ( rule__Datatype__Group_3__1__Impl )
            // InternalBSharp.g:3996:2: rule__Datatype__Group_3__1__Impl
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
    // InternalBSharp.g:4002:1: rule__Datatype__Group_3__1__Impl : ( ( rule__Datatype__ConstructorsAssignment_3_1 ) ) ;
    public final void rule__Datatype__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4006:1: ( ( ( rule__Datatype__ConstructorsAssignment_3_1 ) ) )
            // InternalBSharp.g:4007:1: ( ( rule__Datatype__ConstructorsAssignment_3_1 ) )
            {
            // InternalBSharp.g:4007:1: ( ( rule__Datatype__ConstructorsAssignment_3_1 ) )
            // InternalBSharp.g:4008:2: ( rule__Datatype__ConstructorsAssignment_3_1 )
            {
             before(grammarAccess.getDatatypeAccess().getConstructorsAssignment_3_1()); 
            // InternalBSharp.g:4009:2: ( rule__Datatype__ConstructorsAssignment_3_1 )
            // InternalBSharp.g:4009:3: rule__Datatype__ConstructorsAssignment_3_1
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
    // InternalBSharp.g:4018:1: rule__DatatypeConstructor__Group__0 : rule__DatatypeConstructor__Group__0__Impl rule__DatatypeConstructor__Group__1 ;
    public final void rule__DatatypeConstructor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4022:1: ( rule__DatatypeConstructor__Group__0__Impl rule__DatatypeConstructor__Group__1 )
            // InternalBSharp.g:4023:2: rule__DatatypeConstructor__Group__0__Impl rule__DatatypeConstructor__Group__1
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
    // InternalBSharp.g:4030:1: rule__DatatypeConstructor__Group__0__Impl : ( ( rule__DatatypeConstructor__NameAssignment_0 ) ) ;
    public final void rule__DatatypeConstructor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4034:1: ( ( ( rule__DatatypeConstructor__NameAssignment_0 ) ) )
            // InternalBSharp.g:4035:1: ( ( rule__DatatypeConstructor__NameAssignment_0 ) )
            {
            // InternalBSharp.g:4035:1: ( ( rule__DatatypeConstructor__NameAssignment_0 ) )
            // InternalBSharp.g:4036:2: ( rule__DatatypeConstructor__NameAssignment_0 )
            {
             before(grammarAccess.getDatatypeConstructorAccess().getNameAssignment_0()); 
            // InternalBSharp.g:4037:2: ( rule__DatatypeConstructor__NameAssignment_0 )
            // InternalBSharp.g:4037:3: rule__DatatypeConstructor__NameAssignment_0
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
    // InternalBSharp.g:4045:1: rule__DatatypeConstructor__Group__1 : rule__DatatypeConstructor__Group__1__Impl ;
    public final void rule__DatatypeConstructor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4049:1: ( rule__DatatypeConstructor__Group__1__Impl )
            // InternalBSharp.g:4050:2: rule__DatatypeConstructor__Group__1__Impl
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
    // InternalBSharp.g:4056:1: rule__DatatypeConstructor__Group__1__Impl : ( ( rule__DatatypeConstructor__Group_1__0 )? ) ;
    public final void rule__DatatypeConstructor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4060:1: ( ( ( rule__DatatypeConstructor__Group_1__0 )? ) )
            // InternalBSharp.g:4061:1: ( ( rule__DatatypeConstructor__Group_1__0 )? )
            {
            // InternalBSharp.g:4061:1: ( ( rule__DatatypeConstructor__Group_1__0 )? )
            // InternalBSharp.g:4062:2: ( rule__DatatypeConstructor__Group_1__0 )?
            {
             before(grammarAccess.getDatatypeConstructorAccess().getGroup_1()); 
            // InternalBSharp.g:4063:2: ( rule__DatatypeConstructor__Group_1__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==40) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalBSharp.g:4063:3: rule__DatatypeConstructor__Group_1__0
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
    // InternalBSharp.g:4072:1: rule__DatatypeConstructor__Group_1__0 : rule__DatatypeConstructor__Group_1__0__Impl rule__DatatypeConstructor__Group_1__1 ;
    public final void rule__DatatypeConstructor__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4076:1: ( rule__DatatypeConstructor__Group_1__0__Impl rule__DatatypeConstructor__Group_1__1 )
            // InternalBSharp.g:4077:2: rule__DatatypeConstructor__Group_1__0__Impl rule__DatatypeConstructor__Group_1__1
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
    // InternalBSharp.g:4084:1: rule__DatatypeConstructor__Group_1__0__Impl : ( '(' ) ;
    public final void rule__DatatypeConstructor__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4088:1: ( ( '(' ) )
            // InternalBSharp.g:4089:1: ( '(' )
            {
            // InternalBSharp.g:4089:1: ( '(' )
            // InternalBSharp.g:4090:2: '('
            {
             before(grammarAccess.getDatatypeConstructorAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,40,FOLLOW_2); 
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
    // InternalBSharp.g:4099:1: rule__DatatypeConstructor__Group_1__1 : rule__DatatypeConstructor__Group_1__1__Impl rule__DatatypeConstructor__Group_1__2 ;
    public final void rule__DatatypeConstructor__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4103:1: ( rule__DatatypeConstructor__Group_1__1__Impl rule__DatatypeConstructor__Group_1__2 )
            // InternalBSharp.g:4104:2: rule__DatatypeConstructor__Group_1__1__Impl rule__DatatypeConstructor__Group_1__2
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
    // InternalBSharp.g:4111:1: rule__DatatypeConstructor__Group_1__1__Impl : ( ( rule__DatatypeConstructor__DeconsAssignment_1_1 ) ) ;
    public final void rule__DatatypeConstructor__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4115:1: ( ( ( rule__DatatypeConstructor__DeconsAssignment_1_1 ) ) )
            // InternalBSharp.g:4116:1: ( ( rule__DatatypeConstructor__DeconsAssignment_1_1 ) )
            {
            // InternalBSharp.g:4116:1: ( ( rule__DatatypeConstructor__DeconsAssignment_1_1 ) )
            // InternalBSharp.g:4117:2: ( rule__DatatypeConstructor__DeconsAssignment_1_1 )
            {
             before(grammarAccess.getDatatypeConstructorAccess().getDeconsAssignment_1_1()); 
            // InternalBSharp.g:4118:2: ( rule__DatatypeConstructor__DeconsAssignment_1_1 )
            // InternalBSharp.g:4118:3: rule__DatatypeConstructor__DeconsAssignment_1_1
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
    // InternalBSharp.g:4126:1: rule__DatatypeConstructor__Group_1__2 : rule__DatatypeConstructor__Group_1__2__Impl ;
    public final void rule__DatatypeConstructor__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4130:1: ( rule__DatatypeConstructor__Group_1__2__Impl )
            // InternalBSharp.g:4131:2: rule__DatatypeConstructor__Group_1__2__Impl
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
    // InternalBSharp.g:4137:1: rule__DatatypeConstructor__Group_1__2__Impl : ( ')' ) ;
    public final void rule__DatatypeConstructor__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4141:1: ( ( ')' ) )
            // InternalBSharp.g:4142:1: ( ')' )
            {
            // InternalBSharp.g:4142:1: ( ')' )
            // InternalBSharp.g:4143:2: ')'
            {
             before(grammarAccess.getDatatypeConstructorAccess().getRightParenthesisKeyword_1_2()); 
            match(input,41,FOLLOW_2); 
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
    // InternalBSharp.g:4153:1: rule__Extend__Group__0 : rule__Extend__Group__0__Impl rule__Extend__Group__1 ;
    public final void rule__Extend__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4157:1: ( rule__Extend__Group__0__Impl rule__Extend__Group__1 )
            // InternalBSharp.g:4158:2: rule__Extend__Group__0__Impl rule__Extend__Group__1
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
    // InternalBSharp.g:4165:1: rule__Extend__Group__0__Impl : ( 'Extend' ) ;
    public final void rule__Extend__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4169:1: ( ( 'Extend' ) )
            // InternalBSharp.g:4170:1: ( 'Extend' )
            {
            // InternalBSharp.g:4170:1: ( 'Extend' )
            // InternalBSharp.g:4171:2: 'Extend'
            {
             before(grammarAccess.getExtendAccess().getExtendKeyword_0()); 
            match(input,49,FOLLOW_2); 
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
    // InternalBSharp.g:4180:1: rule__Extend__Group__1 : rule__Extend__Group__1__Impl rule__Extend__Group__2 ;
    public final void rule__Extend__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4184:1: ( rule__Extend__Group__1__Impl rule__Extend__Group__2 )
            // InternalBSharp.g:4185:2: rule__Extend__Group__1__Impl rule__Extend__Group__2
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
    // InternalBSharp.g:4192:1: rule__Extend__Group__1__Impl : ( ( rule__Extend__ExtendedClassAssignment_1 ) ) ;
    public final void rule__Extend__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4196:1: ( ( ( rule__Extend__ExtendedClassAssignment_1 ) ) )
            // InternalBSharp.g:4197:1: ( ( rule__Extend__ExtendedClassAssignment_1 ) )
            {
            // InternalBSharp.g:4197:1: ( ( rule__Extend__ExtendedClassAssignment_1 ) )
            // InternalBSharp.g:4198:2: ( rule__Extend__ExtendedClassAssignment_1 )
            {
             before(grammarAccess.getExtendAccess().getExtendedClassAssignment_1()); 
            // InternalBSharp.g:4199:2: ( rule__Extend__ExtendedClassAssignment_1 )
            // InternalBSharp.g:4199:3: rule__Extend__ExtendedClassAssignment_1
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
    // InternalBSharp.g:4207:1: rule__Extend__Group__2 : rule__Extend__Group__2__Impl rule__Extend__Group__3 ;
    public final void rule__Extend__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4211:1: ( rule__Extend__Group__2__Impl rule__Extend__Group__3 )
            // InternalBSharp.g:4212:2: rule__Extend__Group__2__Impl rule__Extend__Group__3
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
    // InternalBSharp.g:4219:1: rule__Extend__Group__2__Impl : ( '(' ) ;
    public final void rule__Extend__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4223:1: ( ( '(' ) )
            // InternalBSharp.g:4224:1: ( '(' )
            {
            // InternalBSharp.g:4224:1: ( '(' )
            // InternalBSharp.g:4225:2: '('
            {
             before(grammarAccess.getExtendAccess().getLeftParenthesisKeyword_2()); 
            match(input,40,FOLLOW_2); 
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
    // InternalBSharp.g:4234:1: rule__Extend__Group__3 : rule__Extend__Group__3__Impl rule__Extend__Group__4 ;
    public final void rule__Extend__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4238:1: ( rule__Extend__Group__3__Impl rule__Extend__Group__4 )
            // InternalBSharp.g:4239:2: rule__Extend__Group__3__Impl rule__Extend__Group__4
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
    // InternalBSharp.g:4246:1: rule__Extend__Group__3__Impl : ( ( rule__Extend__NameAssignment_3 ) ) ;
    public final void rule__Extend__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4250:1: ( ( ( rule__Extend__NameAssignment_3 ) ) )
            // InternalBSharp.g:4251:1: ( ( rule__Extend__NameAssignment_3 ) )
            {
            // InternalBSharp.g:4251:1: ( ( rule__Extend__NameAssignment_3 ) )
            // InternalBSharp.g:4252:2: ( rule__Extend__NameAssignment_3 )
            {
             before(grammarAccess.getExtendAccess().getNameAssignment_3()); 
            // InternalBSharp.g:4253:2: ( rule__Extend__NameAssignment_3 )
            // InternalBSharp.g:4253:3: rule__Extend__NameAssignment_3
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
    // InternalBSharp.g:4261:1: rule__Extend__Group__4 : rule__Extend__Group__4__Impl rule__Extend__Group__5 ;
    public final void rule__Extend__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4265:1: ( rule__Extend__Group__4__Impl rule__Extend__Group__5 )
            // InternalBSharp.g:4266:2: rule__Extend__Group__4__Impl rule__Extend__Group__5
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
    // InternalBSharp.g:4273:1: rule__Extend__Group__4__Impl : ( ')' ) ;
    public final void rule__Extend__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4277:1: ( ( ')' ) )
            // InternalBSharp.g:4278:1: ( ')' )
            {
            // InternalBSharp.g:4278:1: ( ')' )
            // InternalBSharp.g:4279:2: ')'
            {
             before(grammarAccess.getExtendAccess().getRightParenthesisKeyword_4()); 
            match(input,41,FOLLOW_2); 
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
    // InternalBSharp.g:4288:1: rule__Extend__Group__5 : rule__Extend__Group__5__Impl ;
    public final void rule__Extend__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4292:1: ( rule__Extend__Group__5__Impl )
            // InternalBSharp.g:4293:2: rule__Extend__Group__5__Impl
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
    // InternalBSharp.g:4299:1: rule__Extend__Group__5__Impl : ( ( rule__Extend__BlockAssignment_5 ) ) ;
    public final void rule__Extend__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4303:1: ( ( ( rule__Extend__BlockAssignment_5 ) ) )
            // InternalBSharp.g:4304:1: ( ( rule__Extend__BlockAssignment_5 ) )
            {
            // InternalBSharp.g:4304:1: ( ( rule__Extend__BlockAssignment_5 ) )
            // InternalBSharp.g:4305:2: ( rule__Extend__BlockAssignment_5 )
            {
             before(grammarAccess.getExtendAccess().getBlockAssignment_5()); 
            // InternalBSharp.g:4306:2: ( rule__Extend__BlockAssignment_5 )
            // InternalBSharp.g:4306:3: rule__Extend__BlockAssignment_5
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
    // InternalBSharp.g:4315:1: rule__BSharpBlock__Group__0 : rule__BSharpBlock__Group__0__Impl rule__BSharpBlock__Group__1 ;
    public final void rule__BSharpBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4319:1: ( rule__BSharpBlock__Group__0__Impl rule__BSharpBlock__Group__1 )
            // InternalBSharp.g:4320:2: rule__BSharpBlock__Group__0__Impl rule__BSharpBlock__Group__1
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
    // InternalBSharp.g:4327:1: rule__BSharpBlock__Group__0__Impl : ( () ) ;
    public final void rule__BSharpBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4331:1: ( ( () ) )
            // InternalBSharp.g:4332:1: ( () )
            {
            // InternalBSharp.g:4332:1: ( () )
            // InternalBSharp.g:4333:2: ()
            {
             before(grammarAccess.getBSharpBlockAccess().getBSharpBlockAction_0()); 
            // InternalBSharp.g:4334:2: ()
            // InternalBSharp.g:4334:3: 
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
    // InternalBSharp.g:4342:1: rule__BSharpBlock__Group__1 : rule__BSharpBlock__Group__1__Impl rule__BSharpBlock__Group__2 ;
    public final void rule__BSharpBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4346:1: ( rule__BSharpBlock__Group__1__Impl rule__BSharpBlock__Group__2 )
            // InternalBSharp.g:4347:2: rule__BSharpBlock__Group__1__Impl rule__BSharpBlock__Group__2
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
    // InternalBSharp.g:4354:1: rule__BSharpBlock__Group__1__Impl : ( '{' ) ;
    public final void rule__BSharpBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4358:1: ( ( '{' ) )
            // InternalBSharp.g:4359:1: ( '{' )
            {
            // InternalBSharp.g:4359:1: ( '{' )
            // InternalBSharp.g:4360:2: '{'
            {
             before(grammarAccess.getBSharpBlockAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,50,FOLLOW_2); 
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
    // InternalBSharp.g:4369:1: rule__BSharpBlock__Group__2 : rule__BSharpBlock__Group__2__Impl rule__BSharpBlock__Group__3 ;
    public final void rule__BSharpBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4373:1: ( rule__BSharpBlock__Group__2__Impl rule__BSharpBlock__Group__3 )
            // InternalBSharp.g:4374:2: rule__BSharpBlock__Group__2__Impl rule__BSharpBlock__Group__3
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
    // InternalBSharp.g:4381:1: rule__BSharpBlock__Group__2__Impl : ( ( rule__BSharpBlock__Alternatives_2 )* ) ;
    public final void rule__BSharpBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4385:1: ( ( ( rule__BSharpBlock__Alternatives_2 )* ) )
            // InternalBSharp.g:4386:1: ( ( rule__BSharpBlock__Alternatives_2 )* )
            {
            // InternalBSharp.g:4386:1: ( ( rule__BSharpBlock__Alternatives_2 )* )
            // InternalBSharp.g:4387:2: ( rule__BSharpBlock__Alternatives_2 )*
            {
             before(grammarAccess.getBSharpBlockAccess().getAlternatives_2()); 
            // InternalBSharp.g:4388:2: ( rule__BSharpBlock__Alternatives_2 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==RULE_ID||LA40_0==53||LA40_0==55) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalBSharp.g:4388:3: rule__BSharpBlock__Alternatives_2
            	    {
            	    pushFollow(FOLLOW_34);
            	    rule__BSharpBlock__Alternatives_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop40;
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
    // InternalBSharp.g:4396:1: rule__BSharpBlock__Group__3 : rule__BSharpBlock__Group__3__Impl ;
    public final void rule__BSharpBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4400:1: ( rule__BSharpBlock__Group__3__Impl )
            // InternalBSharp.g:4401:2: rule__BSharpBlock__Group__3__Impl
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
    // InternalBSharp.g:4407:1: rule__BSharpBlock__Group__3__Impl : ( '}' ) ;
    public final void rule__BSharpBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4411:1: ( ( '}' ) )
            // InternalBSharp.g:4412:1: ( '}' )
            {
            // InternalBSharp.g:4412:1: ( '}' )
            // InternalBSharp.g:4413:2: '}'
            {
             before(grammarAccess.getBSharpBlockAccess().getRightCurlyBracketKeyword_3()); 
            match(input,51,FOLLOW_2); 
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
    // InternalBSharp.g:4423:1: rule__FunctionDecl__Group__0 : rule__FunctionDecl__Group__0__Impl rule__FunctionDecl__Group__1 ;
    public final void rule__FunctionDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4427:1: ( rule__FunctionDecl__Group__0__Impl rule__FunctionDecl__Group__1 )
            // InternalBSharp.g:4428:2: rule__FunctionDecl__Group__0__Impl rule__FunctionDecl__Group__1
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
    // InternalBSharp.g:4435:1: rule__FunctionDecl__Group__0__Impl : ( ( rule__FunctionDecl__NameAssignment_0 ) ) ;
    public final void rule__FunctionDecl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4439:1: ( ( ( rule__FunctionDecl__NameAssignment_0 ) ) )
            // InternalBSharp.g:4440:1: ( ( rule__FunctionDecl__NameAssignment_0 ) )
            {
            // InternalBSharp.g:4440:1: ( ( rule__FunctionDecl__NameAssignment_0 ) )
            // InternalBSharp.g:4441:2: ( rule__FunctionDecl__NameAssignment_0 )
            {
             before(grammarAccess.getFunctionDeclAccess().getNameAssignment_0()); 
            // InternalBSharp.g:4442:2: ( rule__FunctionDecl__NameAssignment_0 )
            // InternalBSharp.g:4442:3: rule__FunctionDecl__NameAssignment_0
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
    // InternalBSharp.g:4450:1: rule__FunctionDecl__Group__1 : rule__FunctionDecl__Group__1__Impl rule__FunctionDecl__Group__2 ;
    public final void rule__FunctionDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4454:1: ( rule__FunctionDecl__Group__1__Impl rule__FunctionDecl__Group__2 )
            // InternalBSharp.g:4455:2: rule__FunctionDecl__Group__1__Impl rule__FunctionDecl__Group__2
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
    // InternalBSharp.g:4462:1: rule__FunctionDecl__Group__1__Impl : ( ( rule__FunctionDecl__ContextAssignment_1 )? ) ;
    public final void rule__FunctionDecl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4466:1: ( ( ( rule__FunctionDecl__ContextAssignment_1 )? ) )
            // InternalBSharp.g:4467:1: ( ( rule__FunctionDecl__ContextAssignment_1 )? )
            {
            // InternalBSharp.g:4467:1: ( ( rule__FunctionDecl__ContextAssignment_1 )? )
            // InternalBSharp.g:4468:2: ( rule__FunctionDecl__ContextAssignment_1 )?
            {
             before(grammarAccess.getFunctionDeclAccess().getContextAssignment_1()); 
            // InternalBSharp.g:4469:2: ( rule__FunctionDecl__ContextAssignment_1 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==42) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalBSharp.g:4469:3: rule__FunctionDecl__ContextAssignment_1
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
    // InternalBSharp.g:4477:1: rule__FunctionDecl__Group__2 : rule__FunctionDecl__Group__2__Impl rule__FunctionDecl__Group__3 ;
    public final void rule__FunctionDecl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4481:1: ( rule__FunctionDecl__Group__2__Impl rule__FunctionDecl__Group__3 )
            // InternalBSharp.g:4482:2: rule__FunctionDecl__Group__2__Impl rule__FunctionDecl__Group__3
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
    // InternalBSharp.g:4489:1: rule__FunctionDecl__Group__2__Impl : ( '(' ) ;
    public final void rule__FunctionDecl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4493:1: ( ( '(' ) )
            // InternalBSharp.g:4494:1: ( '(' )
            {
            // InternalBSharp.g:4494:1: ( '(' )
            // InternalBSharp.g:4495:2: '('
            {
             before(grammarAccess.getFunctionDeclAccess().getLeftParenthesisKeyword_2()); 
            match(input,40,FOLLOW_2); 
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
    // InternalBSharp.g:4504:1: rule__FunctionDecl__Group__3 : rule__FunctionDecl__Group__3__Impl rule__FunctionDecl__Group__4 ;
    public final void rule__FunctionDecl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4508:1: ( rule__FunctionDecl__Group__3__Impl rule__FunctionDecl__Group__4 )
            // InternalBSharp.g:4509:2: rule__FunctionDecl__Group__3__Impl rule__FunctionDecl__Group__4
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
    // InternalBSharp.g:4516:1: rule__FunctionDecl__Group__3__Impl : ( ( rule__FunctionDecl__VarListAssignment_3 )? ) ;
    public final void rule__FunctionDecl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4520:1: ( ( ( rule__FunctionDecl__VarListAssignment_3 )? ) )
            // InternalBSharp.g:4521:1: ( ( rule__FunctionDecl__VarListAssignment_3 )? )
            {
            // InternalBSharp.g:4521:1: ( ( rule__FunctionDecl__VarListAssignment_3 )? )
            // InternalBSharp.g:4522:2: ( rule__FunctionDecl__VarListAssignment_3 )?
            {
             before(grammarAccess.getFunctionDeclAccess().getVarListAssignment_3()); 
            // InternalBSharp.g:4523:2: ( rule__FunctionDecl__VarListAssignment_3 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_ID) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalBSharp.g:4523:3: rule__FunctionDecl__VarListAssignment_3
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
    // InternalBSharp.g:4531:1: rule__FunctionDecl__Group__4 : rule__FunctionDecl__Group__4__Impl rule__FunctionDecl__Group__5 ;
    public final void rule__FunctionDecl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4535:1: ( rule__FunctionDecl__Group__4__Impl rule__FunctionDecl__Group__5 )
            // InternalBSharp.g:4536:2: rule__FunctionDecl__Group__4__Impl rule__FunctionDecl__Group__5
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
    // InternalBSharp.g:4543:1: rule__FunctionDecl__Group__4__Impl : ( ')' ) ;
    public final void rule__FunctionDecl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4547:1: ( ( ')' ) )
            // InternalBSharp.g:4548:1: ( ')' )
            {
            // InternalBSharp.g:4548:1: ( ')' )
            // InternalBSharp.g:4549:2: ')'
            {
             before(grammarAccess.getFunctionDeclAccess().getRightParenthesisKeyword_4()); 
            match(input,41,FOLLOW_2); 
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
    // InternalBSharp.g:4558:1: rule__FunctionDecl__Group__5 : rule__FunctionDecl__Group__5__Impl rule__FunctionDecl__Group__6 ;
    public final void rule__FunctionDecl__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4562:1: ( rule__FunctionDecl__Group__5__Impl rule__FunctionDecl__Group__6 )
            // InternalBSharp.g:4563:2: rule__FunctionDecl__Group__5__Impl rule__FunctionDecl__Group__6
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
    // InternalBSharp.g:4570:1: rule__FunctionDecl__Group__5__Impl : ( ':' ) ;
    public final void rule__FunctionDecl__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4574:1: ( ( ':' ) )
            // InternalBSharp.g:4575:1: ( ':' )
            {
            // InternalBSharp.g:4575:1: ( ':' )
            // InternalBSharp.g:4576:2: ':'
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
    // InternalBSharp.g:4585:1: rule__FunctionDecl__Group__6 : rule__FunctionDecl__Group__6__Impl rule__FunctionDecl__Group__7 ;
    public final void rule__FunctionDecl__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4589:1: ( rule__FunctionDecl__Group__6__Impl rule__FunctionDecl__Group__7 )
            // InternalBSharp.g:4590:2: rule__FunctionDecl__Group__6__Impl rule__FunctionDecl__Group__7
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
    // InternalBSharp.g:4597:1: rule__FunctionDecl__Group__6__Impl : ( ( rule__FunctionDecl__ReturnTypeAssignment_6 ) ) ;
    public final void rule__FunctionDecl__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4601:1: ( ( ( rule__FunctionDecl__ReturnTypeAssignment_6 ) ) )
            // InternalBSharp.g:4602:1: ( ( rule__FunctionDecl__ReturnTypeAssignment_6 ) )
            {
            // InternalBSharp.g:4602:1: ( ( rule__FunctionDecl__ReturnTypeAssignment_6 ) )
            // InternalBSharp.g:4603:2: ( rule__FunctionDecl__ReturnTypeAssignment_6 )
            {
             before(grammarAccess.getFunctionDeclAccess().getReturnTypeAssignment_6()); 
            // InternalBSharp.g:4604:2: ( rule__FunctionDecl__ReturnTypeAssignment_6 )
            // InternalBSharp.g:4604:3: rule__FunctionDecl__ReturnTypeAssignment_6
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
    // InternalBSharp.g:4612:1: rule__FunctionDecl__Group__7 : rule__FunctionDecl__Group__7__Impl rule__FunctionDecl__Group__8 ;
    public final void rule__FunctionDecl__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4616:1: ( rule__FunctionDecl__Group__7__Impl rule__FunctionDecl__Group__8 )
            // InternalBSharp.g:4617:2: rule__FunctionDecl__Group__7__Impl rule__FunctionDecl__Group__8
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
    // InternalBSharp.g:4624:1: rule__FunctionDecl__Group__7__Impl : ( ( rule__FunctionDecl__InfixAssignment_7 )? ) ;
    public final void rule__FunctionDecl__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4628:1: ( ( ( rule__FunctionDecl__InfixAssignment_7 )? ) )
            // InternalBSharp.g:4629:1: ( ( rule__FunctionDecl__InfixAssignment_7 )? )
            {
            // InternalBSharp.g:4629:1: ( ( rule__FunctionDecl__InfixAssignment_7 )? )
            // InternalBSharp.g:4630:2: ( rule__FunctionDecl__InfixAssignment_7 )?
            {
             before(grammarAccess.getFunctionDeclAccess().getInfixAssignment_7()); 
            // InternalBSharp.g:4631:2: ( rule__FunctionDecl__InfixAssignment_7 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==56) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalBSharp.g:4631:3: rule__FunctionDecl__InfixAssignment_7
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
    // InternalBSharp.g:4639:1: rule__FunctionDecl__Group__8 : rule__FunctionDecl__Group__8__Impl rule__FunctionDecl__Group__9 ;
    public final void rule__FunctionDecl__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4643:1: ( rule__FunctionDecl__Group__8__Impl rule__FunctionDecl__Group__9 )
            // InternalBSharp.g:4644:2: rule__FunctionDecl__Group__8__Impl rule__FunctionDecl__Group__9
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
    // InternalBSharp.g:4651:1: rule__FunctionDecl__Group__8__Impl : ( ( rule__FunctionDecl__PrecedenceAssignment_8 )? ) ;
    public final void rule__FunctionDecl__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4655:1: ( ( ( rule__FunctionDecl__PrecedenceAssignment_8 )? ) )
            // InternalBSharp.g:4656:1: ( ( rule__FunctionDecl__PrecedenceAssignment_8 )? )
            {
            // InternalBSharp.g:4656:1: ( ( rule__FunctionDecl__PrecedenceAssignment_8 )? )
            // InternalBSharp.g:4657:2: ( rule__FunctionDecl__PrecedenceAssignment_8 )?
            {
             before(grammarAccess.getFunctionDeclAccess().getPrecedenceAssignment_8()); 
            // InternalBSharp.g:4658:2: ( rule__FunctionDecl__PrecedenceAssignment_8 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_INT) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalBSharp.g:4658:3: rule__FunctionDecl__PrecedenceAssignment_8
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
    // InternalBSharp.g:4666:1: rule__FunctionDecl__Group__9 : rule__FunctionDecl__Group__9__Impl ;
    public final void rule__FunctionDecl__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4670:1: ( rule__FunctionDecl__Group__9__Impl )
            // InternalBSharp.g:4671:2: rule__FunctionDecl__Group__9__Impl
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
    // InternalBSharp.g:4677:1: rule__FunctionDecl__Group__9__Impl : ( ( rule__FunctionDecl__ExprAssignment_9 ) ) ;
    public final void rule__FunctionDecl__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4681:1: ( ( ( rule__FunctionDecl__ExprAssignment_9 ) ) )
            // InternalBSharp.g:4682:1: ( ( rule__FunctionDecl__ExprAssignment_9 ) )
            {
            // InternalBSharp.g:4682:1: ( ( rule__FunctionDecl__ExprAssignment_9 ) )
            // InternalBSharp.g:4683:2: ( rule__FunctionDecl__ExprAssignment_9 )
            {
             before(grammarAccess.getFunctionDeclAccess().getExprAssignment_9()); 
            // InternalBSharp.g:4684:2: ( rule__FunctionDecl__ExprAssignment_9 )
            // InternalBSharp.g:4684:3: rule__FunctionDecl__ExprAssignment_9
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
    // InternalBSharp.g:4693:1: rule__MatchStatement__Group__0 : rule__MatchStatement__Group__0__Impl rule__MatchStatement__Group__1 ;
    public final void rule__MatchStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4697:1: ( rule__MatchStatement__Group__0__Impl rule__MatchStatement__Group__1 )
            // InternalBSharp.g:4698:2: rule__MatchStatement__Group__0__Impl rule__MatchStatement__Group__1
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
    // InternalBSharp.g:4705:1: rule__MatchStatement__Group__0__Impl : ( 'match' ) ;
    public final void rule__MatchStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4709:1: ( ( 'match' ) )
            // InternalBSharp.g:4710:1: ( 'match' )
            {
            // InternalBSharp.g:4710:1: ( 'match' )
            // InternalBSharp.g:4711:2: 'match'
            {
             before(grammarAccess.getMatchStatementAccess().getMatchKeyword_0()); 
            match(input,52,FOLLOW_2); 
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
    // InternalBSharp.g:4720:1: rule__MatchStatement__Group__1 : rule__MatchStatement__Group__1__Impl rule__MatchStatement__Group__2 ;
    public final void rule__MatchStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4724:1: ( rule__MatchStatement__Group__1__Impl rule__MatchStatement__Group__2 )
            // InternalBSharp.g:4725:2: rule__MatchStatement__Group__1__Impl rule__MatchStatement__Group__2
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
    // InternalBSharp.g:4732:1: rule__MatchStatement__Group__1__Impl : ( ( rule__MatchStatement__MatchAssignment_1 ) ) ;
    public final void rule__MatchStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4736:1: ( ( ( rule__MatchStatement__MatchAssignment_1 ) ) )
            // InternalBSharp.g:4737:1: ( ( rule__MatchStatement__MatchAssignment_1 ) )
            {
            // InternalBSharp.g:4737:1: ( ( rule__MatchStatement__MatchAssignment_1 ) )
            // InternalBSharp.g:4738:2: ( rule__MatchStatement__MatchAssignment_1 )
            {
             before(grammarAccess.getMatchStatementAccess().getMatchAssignment_1()); 
            // InternalBSharp.g:4739:2: ( rule__MatchStatement__MatchAssignment_1 )
            // InternalBSharp.g:4739:3: rule__MatchStatement__MatchAssignment_1
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
    // InternalBSharp.g:4747:1: rule__MatchStatement__Group__2 : rule__MatchStatement__Group__2__Impl rule__MatchStatement__Group__3 ;
    public final void rule__MatchStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4751:1: ( rule__MatchStatement__Group__2__Impl rule__MatchStatement__Group__3 )
            // InternalBSharp.g:4752:2: rule__MatchStatement__Group__2__Impl rule__MatchStatement__Group__3
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
    // InternalBSharp.g:4759:1: rule__MatchStatement__Group__2__Impl : ( '{' ) ;
    public final void rule__MatchStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4763:1: ( ( '{' ) )
            // InternalBSharp.g:4764:1: ( '{' )
            {
            // InternalBSharp.g:4764:1: ( '{' )
            // InternalBSharp.g:4765:2: '{'
            {
             before(grammarAccess.getMatchStatementAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,50,FOLLOW_2); 
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
    // InternalBSharp.g:4774:1: rule__MatchStatement__Group__3 : rule__MatchStatement__Group__3__Impl rule__MatchStatement__Group__4 ;
    public final void rule__MatchStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4778:1: ( rule__MatchStatement__Group__3__Impl rule__MatchStatement__Group__4 )
            // InternalBSharp.g:4779:2: rule__MatchStatement__Group__3__Impl rule__MatchStatement__Group__4
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
    // InternalBSharp.g:4786:1: rule__MatchStatement__Group__3__Impl : ( ( rule__MatchStatement__InductCaseAssignment_3 ) ) ;
    public final void rule__MatchStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4790:1: ( ( ( rule__MatchStatement__InductCaseAssignment_3 ) ) )
            // InternalBSharp.g:4791:1: ( ( rule__MatchStatement__InductCaseAssignment_3 ) )
            {
            // InternalBSharp.g:4791:1: ( ( rule__MatchStatement__InductCaseAssignment_3 ) )
            // InternalBSharp.g:4792:2: ( rule__MatchStatement__InductCaseAssignment_3 )
            {
             before(grammarAccess.getMatchStatementAccess().getInductCaseAssignment_3()); 
            // InternalBSharp.g:4793:2: ( rule__MatchStatement__InductCaseAssignment_3 )
            // InternalBSharp.g:4793:3: rule__MatchStatement__InductCaseAssignment_3
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
    // InternalBSharp.g:4801:1: rule__MatchStatement__Group__4 : rule__MatchStatement__Group__4__Impl rule__MatchStatement__Group__5 ;
    public final void rule__MatchStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4805:1: ( rule__MatchStatement__Group__4__Impl rule__MatchStatement__Group__5 )
            // InternalBSharp.g:4806:2: rule__MatchStatement__Group__4__Impl rule__MatchStatement__Group__5
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
    // InternalBSharp.g:4813:1: rule__MatchStatement__Group__4__Impl : ( ( rule__MatchStatement__InductCaseAssignment_4 )* ) ;
    public final void rule__MatchStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4817:1: ( ( ( rule__MatchStatement__InductCaseAssignment_4 )* ) )
            // InternalBSharp.g:4818:1: ( ( rule__MatchStatement__InductCaseAssignment_4 )* )
            {
            // InternalBSharp.g:4818:1: ( ( rule__MatchStatement__InductCaseAssignment_4 )* )
            // InternalBSharp.g:4819:2: ( rule__MatchStatement__InductCaseAssignment_4 )*
            {
             before(grammarAccess.getMatchStatementAccess().getInductCaseAssignment_4()); 
            // InternalBSharp.g:4820:2: ( rule__MatchStatement__InductCaseAssignment_4 )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==48) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalBSharp.g:4820:3: rule__MatchStatement__InductCaseAssignment_4
            	    {
            	    pushFollow(FOLLOW_41);
            	    rule__MatchStatement__InductCaseAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop45;
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
    // InternalBSharp.g:4828:1: rule__MatchStatement__Group__5 : rule__MatchStatement__Group__5__Impl ;
    public final void rule__MatchStatement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4832:1: ( rule__MatchStatement__Group__5__Impl )
            // InternalBSharp.g:4833:2: rule__MatchStatement__Group__5__Impl
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
    // InternalBSharp.g:4839:1: rule__MatchStatement__Group__5__Impl : ( '}' ) ;
    public final void rule__MatchStatement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4843:1: ( ( '}' ) )
            // InternalBSharp.g:4844:1: ( '}' )
            {
            // InternalBSharp.g:4844:1: ( '}' )
            // InternalBSharp.g:4845:2: '}'
            {
             before(grammarAccess.getMatchStatementAccess().getRightCurlyBracketKeyword_5()); 
            match(input,51,FOLLOW_2); 
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
    // InternalBSharp.g:4855:1: rule__MatchCase__Group__0 : rule__MatchCase__Group__0__Impl rule__MatchCase__Group__1 ;
    public final void rule__MatchCase__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4859:1: ( rule__MatchCase__Group__0__Impl rule__MatchCase__Group__1 )
            // InternalBSharp.g:4860:2: rule__MatchCase__Group__0__Impl rule__MatchCase__Group__1
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
    // InternalBSharp.g:4867:1: rule__MatchCase__Group__0__Impl : ( '|' ) ;
    public final void rule__MatchCase__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4871:1: ( ( '|' ) )
            // InternalBSharp.g:4872:1: ( '|' )
            {
            // InternalBSharp.g:4872:1: ( '|' )
            // InternalBSharp.g:4873:2: '|'
            {
             before(grammarAccess.getMatchCaseAccess().getVerticalLineKeyword_0()); 
            match(input,48,FOLLOW_2); 
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
    // InternalBSharp.g:4882:1: rule__MatchCase__Group__1 : rule__MatchCase__Group__1__Impl rule__MatchCase__Group__2 ;
    public final void rule__MatchCase__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4886:1: ( rule__MatchCase__Group__1__Impl rule__MatchCase__Group__2 )
            // InternalBSharp.g:4887:2: rule__MatchCase__Group__1__Impl rule__MatchCase__Group__2
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
    // InternalBSharp.g:4894:1: rule__MatchCase__Group__1__Impl : ( ( rule__MatchCase__DeconNameAssignment_1 ) ) ;
    public final void rule__MatchCase__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4898:1: ( ( ( rule__MatchCase__DeconNameAssignment_1 ) ) )
            // InternalBSharp.g:4899:1: ( ( rule__MatchCase__DeconNameAssignment_1 ) )
            {
            // InternalBSharp.g:4899:1: ( ( rule__MatchCase__DeconNameAssignment_1 ) )
            // InternalBSharp.g:4900:2: ( rule__MatchCase__DeconNameAssignment_1 )
            {
             before(grammarAccess.getMatchCaseAccess().getDeconNameAssignment_1()); 
            // InternalBSharp.g:4901:2: ( rule__MatchCase__DeconNameAssignment_1 )
            // InternalBSharp.g:4901:3: rule__MatchCase__DeconNameAssignment_1
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
    // InternalBSharp.g:4909:1: rule__MatchCase__Group__2 : rule__MatchCase__Group__2__Impl rule__MatchCase__Group__3 ;
    public final void rule__MatchCase__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4913:1: ( rule__MatchCase__Group__2__Impl rule__MatchCase__Group__3 )
            // InternalBSharp.g:4914:2: rule__MatchCase__Group__2__Impl rule__MatchCase__Group__3
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
    // InternalBSharp.g:4921:1: rule__MatchCase__Group__2__Impl : ( ( rule__MatchCase__Group_2__0 )? ) ;
    public final void rule__MatchCase__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4925:1: ( ( ( rule__MatchCase__Group_2__0 )? ) )
            // InternalBSharp.g:4926:1: ( ( rule__MatchCase__Group_2__0 )? )
            {
            // InternalBSharp.g:4926:1: ( ( rule__MatchCase__Group_2__0 )? )
            // InternalBSharp.g:4927:2: ( rule__MatchCase__Group_2__0 )?
            {
             before(grammarAccess.getMatchCaseAccess().getGroup_2()); 
            // InternalBSharp.g:4928:2: ( rule__MatchCase__Group_2__0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==40) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalBSharp.g:4928:3: rule__MatchCase__Group_2__0
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
    // InternalBSharp.g:4936:1: rule__MatchCase__Group__3 : rule__MatchCase__Group__3__Impl rule__MatchCase__Group__4 ;
    public final void rule__MatchCase__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4940:1: ( rule__MatchCase__Group__3__Impl rule__MatchCase__Group__4 )
            // InternalBSharp.g:4941:2: rule__MatchCase__Group__3__Impl rule__MatchCase__Group__4
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
    // InternalBSharp.g:4948:1: rule__MatchCase__Group__3__Impl : ( ':' ) ;
    public final void rule__MatchCase__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4952:1: ( ( ':' ) )
            // InternalBSharp.g:4953:1: ( ':' )
            {
            // InternalBSharp.g:4953:1: ( ':' )
            // InternalBSharp.g:4954:2: ':'
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
    // InternalBSharp.g:4963:1: rule__MatchCase__Group__4 : rule__MatchCase__Group__4__Impl ;
    public final void rule__MatchCase__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4967:1: ( rule__MatchCase__Group__4__Impl )
            // InternalBSharp.g:4968:2: rule__MatchCase__Group__4__Impl
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
    // InternalBSharp.g:4974:1: rule__MatchCase__Group__4__Impl : ( ( rule__MatchCase__ExprAssignment_4 ) ) ;
    public final void rule__MatchCase__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4978:1: ( ( ( rule__MatchCase__ExprAssignment_4 ) ) )
            // InternalBSharp.g:4979:1: ( ( rule__MatchCase__ExprAssignment_4 ) )
            {
            // InternalBSharp.g:4979:1: ( ( rule__MatchCase__ExprAssignment_4 ) )
            // InternalBSharp.g:4980:2: ( rule__MatchCase__ExprAssignment_4 )
            {
             before(grammarAccess.getMatchCaseAccess().getExprAssignment_4()); 
            // InternalBSharp.g:4981:2: ( rule__MatchCase__ExprAssignment_4 )
            // InternalBSharp.g:4981:3: rule__MatchCase__ExprAssignment_4
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
    // InternalBSharp.g:4990:1: rule__MatchCase__Group_2__0 : rule__MatchCase__Group_2__0__Impl rule__MatchCase__Group_2__1 ;
    public final void rule__MatchCase__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:4994:1: ( rule__MatchCase__Group_2__0__Impl rule__MatchCase__Group_2__1 )
            // InternalBSharp.g:4995:2: rule__MatchCase__Group_2__0__Impl rule__MatchCase__Group_2__1
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
    // InternalBSharp.g:5002:1: rule__MatchCase__Group_2__0__Impl : ( '(' ) ;
    public final void rule__MatchCase__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5006:1: ( ( '(' ) )
            // InternalBSharp.g:5007:1: ( '(' )
            {
            // InternalBSharp.g:5007:1: ( '(' )
            // InternalBSharp.g:5008:2: '('
            {
             before(grammarAccess.getMatchCaseAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,40,FOLLOW_2); 
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
    // InternalBSharp.g:5017:1: rule__MatchCase__Group_2__1 : rule__MatchCase__Group_2__1__Impl rule__MatchCase__Group_2__2 ;
    public final void rule__MatchCase__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5021:1: ( rule__MatchCase__Group_2__1__Impl rule__MatchCase__Group_2__2 )
            // InternalBSharp.g:5022:2: rule__MatchCase__Group_2__1__Impl rule__MatchCase__Group_2__2
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
    // InternalBSharp.g:5029:1: rule__MatchCase__Group_2__1__Impl : ( ( rule__MatchCase__VariablesAssignment_2_1 ) ) ;
    public final void rule__MatchCase__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5033:1: ( ( ( rule__MatchCase__VariablesAssignment_2_1 ) ) )
            // InternalBSharp.g:5034:1: ( ( rule__MatchCase__VariablesAssignment_2_1 ) )
            {
            // InternalBSharp.g:5034:1: ( ( rule__MatchCase__VariablesAssignment_2_1 ) )
            // InternalBSharp.g:5035:2: ( rule__MatchCase__VariablesAssignment_2_1 )
            {
             before(grammarAccess.getMatchCaseAccess().getVariablesAssignment_2_1()); 
            // InternalBSharp.g:5036:2: ( rule__MatchCase__VariablesAssignment_2_1 )
            // InternalBSharp.g:5036:3: rule__MatchCase__VariablesAssignment_2_1
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
    // InternalBSharp.g:5044:1: rule__MatchCase__Group_2__2 : rule__MatchCase__Group_2__2__Impl rule__MatchCase__Group_2__3 ;
    public final void rule__MatchCase__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5048:1: ( rule__MatchCase__Group_2__2__Impl rule__MatchCase__Group_2__3 )
            // InternalBSharp.g:5049:2: rule__MatchCase__Group_2__2__Impl rule__MatchCase__Group_2__3
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
    // InternalBSharp.g:5056:1: rule__MatchCase__Group_2__2__Impl : ( ( rule__MatchCase__Group_2_2__0 )* ) ;
    public final void rule__MatchCase__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5060:1: ( ( ( rule__MatchCase__Group_2_2__0 )* ) )
            // InternalBSharp.g:5061:1: ( ( rule__MatchCase__Group_2_2__0 )* )
            {
            // InternalBSharp.g:5061:1: ( ( rule__MatchCase__Group_2_2__0 )* )
            // InternalBSharp.g:5062:2: ( rule__MatchCase__Group_2_2__0 )*
            {
             before(grammarAccess.getMatchCaseAccess().getGroup_2_2()); 
            // InternalBSharp.g:5063:2: ( rule__MatchCase__Group_2_2__0 )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==44) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalBSharp.g:5063:3: rule__MatchCase__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__MatchCase__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop47;
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
    // InternalBSharp.g:5071:1: rule__MatchCase__Group_2__3 : rule__MatchCase__Group_2__3__Impl ;
    public final void rule__MatchCase__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5075:1: ( rule__MatchCase__Group_2__3__Impl )
            // InternalBSharp.g:5076:2: rule__MatchCase__Group_2__3__Impl
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
    // InternalBSharp.g:5082:1: rule__MatchCase__Group_2__3__Impl : ( ')' ) ;
    public final void rule__MatchCase__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5086:1: ( ( ')' ) )
            // InternalBSharp.g:5087:1: ( ')' )
            {
            // InternalBSharp.g:5087:1: ( ')' )
            // InternalBSharp.g:5088:2: ')'
            {
             before(grammarAccess.getMatchCaseAccess().getRightParenthesisKeyword_2_3()); 
            match(input,41,FOLLOW_2); 
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
    // InternalBSharp.g:5098:1: rule__MatchCase__Group_2_2__0 : rule__MatchCase__Group_2_2__0__Impl rule__MatchCase__Group_2_2__1 ;
    public final void rule__MatchCase__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5102:1: ( rule__MatchCase__Group_2_2__0__Impl rule__MatchCase__Group_2_2__1 )
            // InternalBSharp.g:5103:2: rule__MatchCase__Group_2_2__0__Impl rule__MatchCase__Group_2_2__1
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
    // InternalBSharp.g:5110:1: rule__MatchCase__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__MatchCase__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5114:1: ( ( ',' ) )
            // InternalBSharp.g:5115:1: ( ',' )
            {
            // InternalBSharp.g:5115:1: ( ',' )
            // InternalBSharp.g:5116:2: ','
            {
             before(grammarAccess.getMatchCaseAccess().getCommaKeyword_2_2_0()); 
            match(input,44,FOLLOW_2); 
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
    // InternalBSharp.g:5125:1: rule__MatchCase__Group_2_2__1 : rule__MatchCase__Group_2_2__1__Impl ;
    public final void rule__MatchCase__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5129:1: ( rule__MatchCase__Group_2_2__1__Impl )
            // InternalBSharp.g:5130:2: rule__MatchCase__Group_2_2__1__Impl
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
    // InternalBSharp.g:5136:1: rule__MatchCase__Group_2_2__1__Impl : ( ( rule__MatchCase__VariablesAssignment_2_2_1 ) ) ;
    public final void rule__MatchCase__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5140:1: ( ( ( rule__MatchCase__VariablesAssignment_2_2_1 ) ) )
            // InternalBSharp.g:5141:1: ( ( rule__MatchCase__VariablesAssignment_2_2_1 ) )
            {
            // InternalBSharp.g:5141:1: ( ( rule__MatchCase__VariablesAssignment_2_2_1 ) )
            // InternalBSharp.g:5142:2: ( rule__MatchCase__VariablesAssignment_2_2_1 )
            {
             before(grammarAccess.getMatchCaseAccess().getVariablesAssignment_2_2_1()); 
            // InternalBSharp.g:5143:2: ( rule__MatchCase__VariablesAssignment_2_2_1 )
            // InternalBSharp.g:5143:3: rule__MatchCase__VariablesAssignment_2_2_1
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
    // InternalBSharp.g:5152:1: rule__TheoremBody__Group__0 : rule__TheoremBody__Group__0__Impl rule__TheoremBody__Group__1 ;
    public final void rule__TheoremBody__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5156:1: ( rule__TheoremBody__Group__0__Impl rule__TheoremBody__Group__1 )
            // InternalBSharp.g:5157:2: rule__TheoremBody__Group__0__Impl rule__TheoremBody__Group__1
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
    // InternalBSharp.g:5164:1: rule__TheoremBody__Group__0__Impl : ( 'Theorems' ) ;
    public final void rule__TheoremBody__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5168:1: ( ( 'Theorems' ) )
            // InternalBSharp.g:5169:1: ( 'Theorems' )
            {
            // InternalBSharp.g:5169:1: ( 'Theorems' )
            // InternalBSharp.g:5170:2: 'Theorems'
            {
             before(grammarAccess.getTheoremBodyAccess().getTheoremsKeyword_0()); 
            match(input,53,FOLLOW_2); 
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
    // InternalBSharp.g:5179:1: rule__TheoremBody__Group__1 : rule__TheoremBody__Group__1__Impl rule__TheoremBody__Group__2 ;
    public final void rule__TheoremBody__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5183:1: ( rule__TheoremBody__Group__1__Impl rule__TheoremBody__Group__2 )
            // InternalBSharp.g:5184:2: rule__TheoremBody__Group__1__Impl rule__TheoremBody__Group__2
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
    // InternalBSharp.g:5191:1: rule__TheoremBody__Group__1__Impl : ( '{' ) ;
    public final void rule__TheoremBody__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5195:1: ( ( '{' ) )
            // InternalBSharp.g:5196:1: ( '{' )
            {
            // InternalBSharp.g:5196:1: ( '{' )
            // InternalBSharp.g:5197:2: '{'
            {
             before(grammarAccess.getTheoremBodyAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,50,FOLLOW_2); 
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
    // InternalBSharp.g:5206:1: rule__TheoremBody__Group__2 : rule__TheoremBody__Group__2__Impl rule__TheoremBody__Group__3 ;
    public final void rule__TheoremBody__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5210:1: ( rule__TheoremBody__Group__2__Impl rule__TheoremBody__Group__3 )
            // InternalBSharp.g:5211:2: rule__TheoremBody__Group__2__Impl rule__TheoremBody__Group__3
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
    // InternalBSharp.g:5218:1: rule__TheoremBody__Group__2__Impl : ( ( ( rule__TheoremBody__TheoremDeclAssignment_2 ) ) ( ( rule__TheoremBody__TheoremDeclAssignment_2 )* ) ) ;
    public final void rule__TheoremBody__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5222:1: ( ( ( ( rule__TheoremBody__TheoremDeclAssignment_2 ) ) ( ( rule__TheoremBody__TheoremDeclAssignment_2 )* ) ) )
            // InternalBSharp.g:5223:1: ( ( ( rule__TheoremBody__TheoremDeclAssignment_2 ) ) ( ( rule__TheoremBody__TheoremDeclAssignment_2 )* ) )
            {
            // InternalBSharp.g:5223:1: ( ( ( rule__TheoremBody__TheoremDeclAssignment_2 ) ) ( ( rule__TheoremBody__TheoremDeclAssignment_2 )* ) )
            // InternalBSharp.g:5224:2: ( ( rule__TheoremBody__TheoremDeclAssignment_2 ) ) ( ( rule__TheoremBody__TheoremDeclAssignment_2 )* )
            {
            // InternalBSharp.g:5224:2: ( ( rule__TheoremBody__TheoremDeclAssignment_2 ) )
            // InternalBSharp.g:5225:3: ( rule__TheoremBody__TheoremDeclAssignment_2 )
            {
             before(grammarAccess.getTheoremBodyAccess().getTheoremDeclAssignment_2()); 
            // InternalBSharp.g:5226:3: ( rule__TheoremBody__TheoremDeclAssignment_2 )
            // InternalBSharp.g:5226:4: rule__TheoremBody__TheoremDeclAssignment_2
            {
            pushFollow(FOLLOW_7);
            rule__TheoremBody__TheoremDeclAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTheoremBodyAccess().getTheoremDeclAssignment_2()); 

            }

            // InternalBSharp.g:5229:2: ( ( rule__TheoremBody__TheoremDeclAssignment_2 )* )
            // InternalBSharp.g:5230:3: ( rule__TheoremBody__TheoremDeclAssignment_2 )*
            {
             before(grammarAccess.getTheoremBodyAccess().getTheoremDeclAssignment_2()); 
            // InternalBSharp.g:5231:3: ( rule__TheoremBody__TheoremDeclAssignment_2 )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( ((LA48_0>=RULE_INT && LA48_0<=RULE_WS)||LA48_0==32) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalBSharp.g:5231:4: rule__TheoremBody__TheoremDeclAssignment_2
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__TheoremBody__TheoremDeclAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop48;
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
    // InternalBSharp.g:5240:1: rule__TheoremBody__Group__3 : rule__TheoremBody__Group__3__Impl ;
    public final void rule__TheoremBody__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5244:1: ( rule__TheoremBody__Group__3__Impl )
            // InternalBSharp.g:5245:2: rule__TheoremBody__Group__3__Impl
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
    // InternalBSharp.g:5251:1: rule__TheoremBody__Group__3__Impl : ( '}' ) ;
    public final void rule__TheoremBody__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5255:1: ( ( '}' ) )
            // InternalBSharp.g:5256:1: ( '}' )
            {
            // InternalBSharp.g:5256:1: ( '}' )
            // InternalBSharp.g:5257:2: '}'
            {
             before(grammarAccess.getTheoremBodyAccess().getRightCurlyBracketKeyword_3()); 
            match(input,51,FOLLOW_2); 
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
    // InternalBSharp.g:5267:1: rule__TheoremDecl__Group__0 : rule__TheoremDecl__Group__0__Impl rule__TheoremDecl__Group__1 ;
    public final void rule__TheoremDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5271:1: ( rule__TheoremDecl__Group__0__Impl rule__TheoremDecl__Group__1 )
            // InternalBSharp.g:5272:2: rule__TheoremDecl__Group__0__Impl rule__TheoremDecl__Group__1
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
    // InternalBSharp.g:5279:1: rule__TheoremDecl__Group__0__Impl : ( ( rule__TheoremDecl__NameAssignment_0 ) ) ;
    public final void rule__TheoremDecl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5283:1: ( ( ( rule__TheoremDecl__NameAssignment_0 ) ) )
            // InternalBSharp.g:5284:1: ( ( rule__TheoremDecl__NameAssignment_0 ) )
            {
            // InternalBSharp.g:5284:1: ( ( rule__TheoremDecl__NameAssignment_0 ) )
            // InternalBSharp.g:5285:2: ( rule__TheoremDecl__NameAssignment_0 )
            {
             before(grammarAccess.getTheoremDeclAccess().getNameAssignment_0()); 
            // InternalBSharp.g:5286:2: ( rule__TheoremDecl__NameAssignment_0 )
            // InternalBSharp.g:5286:3: rule__TheoremDecl__NameAssignment_0
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
    // InternalBSharp.g:5294:1: rule__TheoremDecl__Group__1 : rule__TheoremDecl__Group__1__Impl rule__TheoremDecl__Group__2 ;
    public final void rule__TheoremDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5298:1: ( rule__TheoremDecl__Group__1__Impl rule__TheoremDecl__Group__2 )
            // InternalBSharp.g:5299:2: rule__TheoremDecl__Group__1__Impl rule__TheoremDecl__Group__2
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
    // InternalBSharp.g:5306:1: rule__TheoremDecl__Group__1__Impl : ( ( rule__TheoremDecl__ExprAssignment_1 ) ) ;
    public final void rule__TheoremDecl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5310:1: ( ( ( rule__TheoremDecl__ExprAssignment_1 ) ) )
            // InternalBSharp.g:5311:1: ( ( rule__TheoremDecl__ExprAssignment_1 ) )
            {
            // InternalBSharp.g:5311:1: ( ( rule__TheoremDecl__ExprAssignment_1 ) )
            // InternalBSharp.g:5312:2: ( rule__TheoremDecl__ExprAssignment_1 )
            {
             before(grammarAccess.getTheoremDeclAccess().getExprAssignment_1()); 
            // InternalBSharp.g:5313:2: ( rule__TheoremDecl__ExprAssignment_1 )
            // InternalBSharp.g:5313:3: rule__TheoremDecl__ExprAssignment_1
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
    // InternalBSharp.g:5321:1: rule__TheoremDecl__Group__2 : rule__TheoremDecl__Group__2__Impl ;
    public final void rule__TheoremDecl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5325:1: ( rule__TheoremDecl__Group__2__Impl )
            // InternalBSharp.g:5326:2: rule__TheoremDecl__Group__2__Impl
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
    // InternalBSharp.g:5332:1: rule__TheoremDecl__Group__2__Impl : ( ';' ) ;
    public final void rule__TheoremDecl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5336:1: ( ( ';' ) )
            // InternalBSharp.g:5337:1: ( ';' )
            {
            // InternalBSharp.g:5337:1: ( ';' )
            // InternalBSharp.g:5338:2: ';'
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
    // InternalBSharp.g:5348:1: rule__TypedVariableList__Group__0 : rule__TypedVariableList__Group__0__Impl rule__TypedVariableList__Group__1 ;
    public final void rule__TypedVariableList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5352:1: ( rule__TypedVariableList__Group__0__Impl rule__TypedVariableList__Group__1 )
            // InternalBSharp.g:5353:2: rule__TypedVariableList__Group__0__Impl rule__TypedVariableList__Group__1
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
    // InternalBSharp.g:5360:1: rule__TypedVariableList__Group__0__Impl : ( ( rule__TypedVariableList__VariablesOfTypeAssignment_0 ) ) ;
    public final void rule__TypedVariableList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5364:1: ( ( ( rule__TypedVariableList__VariablesOfTypeAssignment_0 ) ) )
            // InternalBSharp.g:5365:1: ( ( rule__TypedVariableList__VariablesOfTypeAssignment_0 ) )
            {
            // InternalBSharp.g:5365:1: ( ( rule__TypedVariableList__VariablesOfTypeAssignment_0 ) )
            // InternalBSharp.g:5366:2: ( rule__TypedVariableList__VariablesOfTypeAssignment_0 )
            {
             before(grammarAccess.getTypedVariableListAccess().getVariablesOfTypeAssignment_0()); 
            // InternalBSharp.g:5367:2: ( rule__TypedVariableList__VariablesOfTypeAssignment_0 )
            // InternalBSharp.g:5367:3: rule__TypedVariableList__VariablesOfTypeAssignment_0
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
    // InternalBSharp.g:5375:1: rule__TypedVariableList__Group__1 : rule__TypedVariableList__Group__1__Impl ;
    public final void rule__TypedVariableList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5379:1: ( rule__TypedVariableList__Group__1__Impl )
            // InternalBSharp.g:5380:2: rule__TypedVariableList__Group__1__Impl
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
    // InternalBSharp.g:5386:1: rule__TypedVariableList__Group__1__Impl : ( ( rule__TypedVariableList__Group_1__0 )* ) ;
    public final void rule__TypedVariableList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5390:1: ( ( ( rule__TypedVariableList__Group_1__0 )* ) )
            // InternalBSharp.g:5391:1: ( ( rule__TypedVariableList__Group_1__0 )* )
            {
            // InternalBSharp.g:5391:1: ( ( rule__TypedVariableList__Group_1__0 )* )
            // InternalBSharp.g:5392:2: ( rule__TypedVariableList__Group_1__0 )*
            {
             before(grammarAccess.getTypedVariableListAccess().getGroup_1()); 
            // InternalBSharp.g:5393:2: ( rule__TypedVariableList__Group_1__0 )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==44) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalBSharp.g:5393:3: rule__TypedVariableList__Group_1__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__TypedVariableList__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop49;
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
    // InternalBSharp.g:5402:1: rule__TypedVariableList__Group_1__0 : rule__TypedVariableList__Group_1__0__Impl rule__TypedVariableList__Group_1__1 ;
    public final void rule__TypedVariableList__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5406:1: ( rule__TypedVariableList__Group_1__0__Impl rule__TypedVariableList__Group_1__1 )
            // InternalBSharp.g:5407:2: rule__TypedVariableList__Group_1__0__Impl rule__TypedVariableList__Group_1__1
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
    // InternalBSharp.g:5414:1: rule__TypedVariableList__Group_1__0__Impl : ( ',' ) ;
    public final void rule__TypedVariableList__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5418:1: ( ( ',' ) )
            // InternalBSharp.g:5419:1: ( ',' )
            {
            // InternalBSharp.g:5419:1: ( ',' )
            // InternalBSharp.g:5420:2: ','
            {
             before(grammarAccess.getTypedVariableListAccess().getCommaKeyword_1_0()); 
            match(input,44,FOLLOW_2); 
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
    // InternalBSharp.g:5429:1: rule__TypedVariableList__Group_1__1 : rule__TypedVariableList__Group_1__1__Impl ;
    public final void rule__TypedVariableList__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5433:1: ( rule__TypedVariableList__Group_1__1__Impl )
            // InternalBSharp.g:5434:2: rule__TypedVariableList__Group_1__1__Impl
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
    // InternalBSharp.g:5440:1: rule__TypedVariableList__Group_1__1__Impl : ( ( rule__TypedVariableList__VariablesOfTypeAssignment_1_1 ) ) ;
    public final void rule__TypedVariableList__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5444:1: ( ( ( rule__TypedVariableList__VariablesOfTypeAssignment_1_1 ) ) )
            // InternalBSharp.g:5445:1: ( ( rule__TypedVariableList__VariablesOfTypeAssignment_1_1 ) )
            {
            // InternalBSharp.g:5445:1: ( ( rule__TypedVariableList__VariablesOfTypeAssignment_1_1 ) )
            // InternalBSharp.g:5446:2: ( rule__TypedVariableList__VariablesOfTypeAssignment_1_1 )
            {
             before(grammarAccess.getTypedVariableListAccess().getVariablesOfTypeAssignment_1_1()); 
            // InternalBSharp.g:5447:2: ( rule__TypedVariableList__VariablesOfTypeAssignment_1_1 )
            // InternalBSharp.g:5447:3: rule__TypedVariableList__VariablesOfTypeAssignment_1_1
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
    // InternalBSharp.g:5456:1: rule__VariableTyping__Group__0 : rule__VariableTyping__Group__0__Impl rule__VariableTyping__Group__1 ;
    public final void rule__VariableTyping__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5460:1: ( rule__VariableTyping__Group__0__Impl rule__VariableTyping__Group__1 )
            // InternalBSharp.g:5461:2: rule__VariableTyping__Group__0__Impl rule__VariableTyping__Group__1
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
    // InternalBSharp.g:5468:1: rule__VariableTyping__Group__0__Impl : ( ( rule__VariableTyping__TypeVarAssignment_0 ) ) ;
    public final void rule__VariableTyping__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5472:1: ( ( ( rule__VariableTyping__TypeVarAssignment_0 ) ) )
            // InternalBSharp.g:5473:1: ( ( rule__VariableTyping__TypeVarAssignment_0 ) )
            {
            // InternalBSharp.g:5473:1: ( ( rule__VariableTyping__TypeVarAssignment_0 ) )
            // InternalBSharp.g:5474:2: ( rule__VariableTyping__TypeVarAssignment_0 )
            {
             before(grammarAccess.getVariableTypingAccess().getTypeVarAssignment_0()); 
            // InternalBSharp.g:5475:2: ( rule__VariableTyping__TypeVarAssignment_0 )
            // InternalBSharp.g:5475:3: rule__VariableTyping__TypeVarAssignment_0
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
    // InternalBSharp.g:5483:1: rule__VariableTyping__Group__1 : rule__VariableTyping__Group__1__Impl rule__VariableTyping__Group__2 ;
    public final void rule__VariableTyping__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5487:1: ( rule__VariableTyping__Group__1__Impl rule__VariableTyping__Group__2 )
            // InternalBSharp.g:5488:2: rule__VariableTyping__Group__1__Impl rule__VariableTyping__Group__2
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
    // InternalBSharp.g:5495:1: rule__VariableTyping__Group__1__Impl : ( ( rule__VariableTyping__Group_1__0 )* ) ;
    public final void rule__VariableTyping__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5499:1: ( ( ( rule__VariableTyping__Group_1__0 )* ) )
            // InternalBSharp.g:5500:1: ( ( rule__VariableTyping__Group_1__0 )* )
            {
            // InternalBSharp.g:5500:1: ( ( rule__VariableTyping__Group_1__0 )* )
            // InternalBSharp.g:5501:2: ( rule__VariableTyping__Group_1__0 )*
            {
             before(grammarAccess.getVariableTypingAccess().getGroup_1()); 
            // InternalBSharp.g:5502:2: ( rule__VariableTyping__Group_1__0 )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==44) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalBSharp.g:5502:3: rule__VariableTyping__Group_1__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__VariableTyping__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop50;
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
    // InternalBSharp.g:5510:1: rule__VariableTyping__Group__2 : rule__VariableTyping__Group__2__Impl rule__VariableTyping__Group__3 ;
    public final void rule__VariableTyping__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5514:1: ( rule__VariableTyping__Group__2__Impl rule__VariableTyping__Group__3 )
            // InternalBSharp.g:5515:2: rule__VariableTyping__Group__2__Impl rule__VariableTyping__Group__3
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
    // InternalBSharp.g:5522:1: rule__VariableTyping__Group__2__Impl : ( ':' ) ;
    public final void rule__VariableTyping__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5526:1: ( ( ':' ) )
            // InternalBSharp.g:5527:1: ( ':' )
            {
            // InternalBSharp.g:5527:1: ( ':' )
            // InternalBSharp.g:5528:2: ':'
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
    // InternalBSharp.g:5537:1: rule__VariableTyping__Group__3 : rule__VariableTyping__Group__3__Impl ;
    public final void rule__VariableTyping__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5541:1: ( rule__VariableTyping__Group__3__Impl )
            // InternalBSharp.g:5542:2: rule__VariableTyping__Group__3__Impl
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
    // InternalBSharp.g:5548:1: rule__VariableTyping__Group__3__Impl : ( ( rule__VariableTyping__TypeAssignment_3 ) ) ;
    public final void rule__VariableTyping__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5552:1: ( ( ( rule__VariableTyping__TypeAssignment_3 ) ) )
            // InternalBSharp.g:5553:1: ( ( rule__VariableTyping__TypeAssignment_3 ) )
            {
            // InternalBSharp.g:5553:1: ( ( rule__VariableTyping__TypeAssignment_3 ) )
            // InternalBSharp.g:5554:2: ( rule__VariableTyping__TypeAssignment_3 )
            {
             before(grammarAccess.getVariableTypingAccess().getTypeAssignment_3()); 
            // InternalBSharp.g:5555:2: ( rule__VariableTyping__TypeAssignment_3 )
            // InternalBSharp.g:5555:3: rule__VariableTyping__TypeAssignment_3
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
    // InternalBSharp.g:5564:1: rule__VariableTyping__Group_1__0 : rule__VariableTyping__Group_1__0__Impl rule__VariableTyping__Group_1__1 ;
    public final void rule__VariableTyping__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5568:1: ( rule__VariableTyping__Group_1__0__Impl rule__VariableTyping__Group_1__1 )
            // InternalBSharp.g:5569:2: rule__VariableTyping__Group_1__0__Impl rule__VariableTyping__Group_1__1
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
    // InternalBSharp.g:5576:1: rule__VariableTyping__Group_1__0__Impl : ( ',' ) ;
    public final void rule__VariableTyping__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5580:1: ( ( ',' ) )
            // InternalBSharp.g:5581:1: ( ',' )
            {
            // InternalBSharp.g:5581:1: ( ',' )
            // InternalBSharp.g:5582:2: ','
            {
             before(grammarAccess.getVariableTypingAccess().getCommaKeyword_1_0()); 
            match(input,44,FOLLOW_2); 
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
    // InternalBSharp.g:5591:1: rule__VariableTyping__Group_1__1 : rule__VariableTyping__Group_1__1__Impl ;
    public final void rule__VariableTyping__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5595:1: ( rule__VariableTyping__Group_1__1__Impl )
            // InternalBSharp.g:5596:2: rule__VariableTyping__Group_1__1__Impl
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
    // InternalBSharp.g:5602:1: rule__VariableTyping__Group_1__1__Impl : ( ( rule__VariableTyping__TypeVarAssignment_1_1 ) ) ;
    public final void rule__VariableTyping__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5606:1: ( ( ( rule__VariableTyping__TypeVarAssignment_1_1 ) ) )
            // InternalBSharp.g:5607:1: ( ( rule__VariableTyping__TypeVarAssignment_1_1 ) )
            {
            // InternalBSharp.g:5607:1: ( ( rule__VariableTyping__TypeVarAssignment_1_1 ) )
            // InternalBSharp.g:5608:2: ( rule__VariableTyping__TypeVarAssignment_1_1 )
            {
             before(grammarAccess.getVariableTypingAccess().getTypeVarAssignment_1_1()); 
            // InternalBSharp.g:5609:2: ( rule__VariableTyping__TypeVarAssignment_1_1 )
            // InternalBSharp.g:5609:3: rule__VariableTyping__TypeVarAssignment_1_1
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
    // InternalBSharp.g:5618:1: rule__Lambda__Group__0 : rule__Lambda__Group__0__Impl rule__Lambda__Group__1 ;
    public final void rule__Lambda__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5622:1: ( rule__Lambda__Group__0__Impl rule__Lambda__Group__1 )
            // InternalBSharp.g:5623:2: rule__Lambda__Group__0__Impl rule__Lambda__Group__1
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
    // InternalBSharp.g:5630:1: rule__Lambda__Group__0__Impl : ( ( rule__Lambda__QTypeAssignment_0 ) ) ;
    public final void rule__Lambda__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5634:1: ( ( ( rule__Lambda__QTypeAssignment_0 ) ) )
            // InternalBSharp.g:5635:1: ( ( rule__Lambda__QTypeAssignment_0 ) )
            {
            // InternalBSharp.g:5635:1: ( ( rule__Lambda__QTypeAssignment_0 ) )
            // InternalBSharp.g:5636:2: ( rule__Lambda__QTypeAssignment_0 )
            {
             before(grammarAccess.getLambdaAccess().getQTypeAssignment_0()); 
            // InternalBSharp.g:5637:2: ( rule__Lambda__QTypeAssignment_0 )
            // InternalBSharp.g:5637:3: rule__Lambda__QTypeAssignment_0
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
    // InternalBSharp.g:5645:1: rule__Lambda__Group__1 : rule__Lambda__Group__1__Impl rule__Lambda__Group__2 ;
    public final void rule__Lambda__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5649:1: ( rule__Lambda__Group__1__Impl rule__Lambda__Group__2 )
            // InternalBSharp.g:5650:2: rule__Lambda__Group__1__Impl rule__Lambda__Group__2
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
    // InternalBSharp.g:5657:1: rule__Lambda__Group__1__Impl : ( ( rule__Lambda__ContextAssignment_1 )? ) ;
    public final void rule__Lambda__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5661:1: ( ( ( rule__Lambda__ContextAssignment_1 )? ) )
            // InternalBSharp.g:5662:1: ( ( rule__Lambda__ContextAssignment_1 )? )
            {
            // InternalBSharp.g:5662:1: ( ( rule__Lambda__ContextAssignment_1 )? )
            // InternalBSharp.g:5663:2: ( rule__Lambda__ContextAssignment_1 )?
            {
             before(grammarAccess.getLambdaAccess().getContextAssignment_1()); 
            // InternalBSharp.g:5664:2: ( rule__Lambda__ContextAssignment_1 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==42) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalBSharp.g:5664:3: rule__Lambda__ContextAssignment_1
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
    // InternalBSharp.g:5672:1: rule__Lambda__Group__2 : rule__Lambda__Group__2__Impl rule__Lambda__Group__3 ;
    public final void rule__Lambda__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5676:1: ( rule__Lambda__Group__2__Impl rule__Lambda__Group__3 )
            // InternalBSharp.g:5677:2: rule__Lambda__Group__2__Impl rule__Lambda__Group__3
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
    // InternalBSharp.g:5684:1: rule__Lambda__Group__2__Impl : ( ( rule__Lambda__VarListAssignment_2 ) ) ;
    public final void rule__Lambda__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5688:1: ( ( ( rule__Lambda__VarListAssignment_2 ) ) )
            // InternalBSharp.g:5689:1: ( ( rule__Lambda__VarListAssignment_2 ) )
            {
            // InternalBSharp.g:5689:1: ( ( rule__Lambda__VarListAssignment_2 ) )
            // InternalBSharp.g:5690:2: ( rule__Lambda__VarListAssignment_2 )
            {
             before(grammarAccess.getLambdaAccess().getVarListAssignment_2()); 
            // InternalBSharp.g:5691:2: ( rule__Lambda__VarListAssignment_2 )
            // InternalBSharp.g:5691:3: rule__Lambda__VarListAssignment_2
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
    // InternalBSharp.g:5699:1: rule__Lambda__Group__3 : rule__Lambda__Group__3__Impl rule__Lambda__Group__4 ;
    public final void rule__Lambda__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5703:1: ( rule__Lambda__Group__3__Impl rule__Lambda__Group__4 )
            // InternalBSharp.g:5704:2: rule__Lambda__Group__3__Impl rule__Lambda__Group__4
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
    // InternalBSharp.g:5711:1: rule__Lambda__Group__3__Impl : ( '|' ) ;
    public final void rule__Lambda__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5715:1: ( ( '|' ) )
            // InternalBSharp.g:5716:1: ( '|' )
            {
            // InternalBSharp.g:5716:1: ( '|' )
            // InternalBSharp.g:5717:2: '|'
            {
             before(grammarAccess.getLambdaAccess().getVerticalLineKeyword_3()); 
            match(input,48,FOLLOW_2); 
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
    // InternalBSharp.g:5726:1: rule__Lambda__Group__4 : rule__Lambda__Group__4__Impl ;
    public final void rule__Lambda__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5730:1: ( rule__Lambda__Group__4__Impl )
            // InternalBSharp.g:5731:2: rule__Lambda__Group__4__Impl
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
    // InternalBSharp.g:5737:1: rule__Lambda__Group__4__Impl : ( ( rule__Lambda__ExprAssignment_4 ) ) ;
    public final void rule__Lambda__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5741:1: ( ( ( rule__Lambda__ExprAssignment_4 ) ) )
            // InternalBSharp.g:5742:1: ( ( rule__Lambda__ExprAssignment_4 ) )
            {
            // InternalBSharp.g:5742:1: ( ( rule__Lambda__ExprAssignment_4 ) )
            // InternalBSharp.g:5743:2: ( rule__Lambda__ExprAssignment_4 )
            {
             before(grammarAccess.getLambdaAccess().getExprAssignment_4()); 
            // InternalBSharp.g:5744:2: ( rule__Lambda__ExprAssignment_4 )
            // InternalBSharp.g:5744:3: rule__Lambda__ExprAssignment_4
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
    // InternalBSharp.g:5753:1: rule__Quantifier__Group__0 : rule__Quantifier__Group__0__Impl rule__Quantifier__Group__1 ;
    public final void rule__Quantifier__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5757:1: ( rule__Quantifier__Group__0__Impl rule__Quantifier__Group__1 )
            // InternalBSharp.g:5758:2: rule__Quantifier__Group__0__Impl rule__Quantifier__Group__1
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
    // InternalBSharp.g:5765:1: rule__Quantifier__Group__0__Impl : ( ( rule__Quantifier__QTypeAssignment_0 ) ) ;
    public final void rule__Quantifier__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5769:1: ( ( ( rule__Quantifier__QTypeAssignment_0 ) ) )
            // InternalBSharp.g:5770:1: ( ( rule__Quantifier__QTypeAssignment_0 ) )
            {
            // InternalBSharp.g:5770:1: ( ( rule__Quantifier__QTypeAssignment_0 ) )
            // InternalBSharp.g:5771:2: ( rule__Quantifier__QTypeAssignment_0 )
            {
             before(grammarAccess.getQuantifierAccess().getQTypeAssignment_0()); 
            // InternalBSharp.g:5772:2: ( rule__Quantifier__QTypeAssignment_0 )
            // InternalBSharp.g:5772:3: rule__Quantifier__QTypeAssignment_0
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
    // InternalBSharp.g:5780:1: rule__Quantifier__Group__1 : rule__Quantifier__Group__1__Impl rule__Quantifier__Group__2 ;
    public final void rule__Quantifier__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5784:1: ( rule__Quantifier__Group__1__Impl rule__Quantifier__Group__2 )
            // InternalBSharp.g:5785:2: rule__Quantifier__Group__1__Impl rule__Quantifier__Group__2
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
    // InternalBSharp.g:5792:1: rule__Quantifier__Group__1__Impl : ( ( rule__Quantifier__ContextAssignment_1 )? ) ;
    public final void rule__Quantifier__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5796:1: ( ( ( rule__Quantifier__ContextAssignment_1 )? ) )
            // InternalBSharp.g:5797:1: ( ( rule__Quantifier__ContextAssignment_1 )? )
            {
            // InternalBSharp.g:5797:1: ( ( rule__Quantifier__ContextAssignment_1 )? )
            // InternalBSharp.g:5798:2: ( rule__Quantifier__ContextAssignment_1 )?
            {
             before(grammarAccess.getQuantifierAccess().getContextAssignment_1()); 
            // InternalBSharp.g:5799:2: ( rule__Quantifier__ContextAssignment_1 )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==42) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalBSharp.g:5799:3: rule__Quantifier__ContextAssignment_1
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
    // InternalBSharp.g:5807:1: rule__Quantifier__Group__2 : rule__Quantifier__Group__2__Impl rule__Quantifier__Group__3 ;
    public final void rule__Quantifier__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5811:1: ( rule__Quantifier__Group__2__Impl rule__Quantifier__Group__3 )
            // InternalBSharp.g:5812:2: rule__Quantifier__Group__2__Impl rule__Quantifier__Group__3
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
    // InternalBSharp.g:5819:1: rule__Quantifier__Group__2__Impl : ( ( rule__Quantifier__VarListAssignment_2 ) ) ;
    public final void rule__Quantifier__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5823:1: ( ( ( rule__Quantifier__VarListAssignment_2 ) ) )
            // InternalBSharp.g:5824:1: ( ( rule__Quantifier__VarListAssignment_2 ) )
            {
            // InternalBSharp.g:5824:1: ( ( rule__Quantifier__VarListAssignment_2 ) )
            // InternalBSharp.g:5825:2: ( rule__Quantifier__VarListAssignment_2 )
            {
             before(grammarAccess.getQuantifierAccess().getVarListAssignment_2()); 
            // InternalBSharp.g:5826:2: ( rule__Quantifier__VarListAssignment_2 )
            // InternalBSharp.g:5826:3: rule__Quantifier__VarListAssignment_2
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
    // InternalBSharp.g:5834:1: rule__Quantifier__Group__3 : rule__Quantifier__Group__3__Impl rule__Quantifier__Group__4 ;
    public final void rule__Quantifier__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5838:1: ( rule__Quantifier__Group__3__Impl rule__Quantifier__Group__4 )
            // InternalBSharp.g:5839:2: rule__Quantifier__Group__3__Impl rule__Quantifier__Group__4
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
    // InternalBSharp.g:5846:1: rule__Quantifier__Group__3__Impl : ( '\\u00B7' ) ;
    public final void rule__Quantifier__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5850:1: ( ( '\\u00B7' ) )
            // InternalBSharp.g:5851:1: ( '\\u00B7' )
            {
            // InternalBSharp.g:5851:1: ( '\\u00B7' )
            // InternalBSharp.g:5852:2: '\\u00B7'
            {
             before(grammarAccess.getQuantifierAccess().getMiddleDotKeyword_3()); 
            match(input,54,FOLLOW_2); 
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
    // InternalBSharp.g:5861:1: rule__Quantifier__Group__4 : rule__Quantifier__Group__4__Impl ;
    public final void rule__Quantifier__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5865:1: ( rule__Quantifier__Group__4__Impl )
            // InternalBSharp.g:5866:2: rule__Quantifier__Group__4__Impl
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
    // InternalBSharp.g:5872:1: rule__Quantifier__Group__4__Impl : ( ( rule__Quantifier__ExprAssignment_4 ) ) ;
    public final void rule__Quantifier__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5876:1: ( ( ( rule__Quantifier__ExprAssignment_4 ) ) )
            // InternalBSharp.g:5877:1: ( ( rule__Quantifier__ExprAssignment_4 ) )
            {
            // InternalBSharp.g:5877:1: ( ( rule__Quantifier__ExprAssignment_4 ) )
            // InternalBSharp.g:5878:2: ( rule__Quantifier__ExprAssignment_4 )
            {
             before(grammarAccess.getQuantifierAccess().getExprAssignment_4()); 
            // InternalBSharp.g:5879:2: ( rule__Quantifier__ExprAssignment_4 )
            // InternalBSharp.g:5879:3: rule__Quantifier__ExprAssignment_4
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
    // InternalBSharp.g:5888:1: rule__Prefix__Group__0 : rule__Prefix__Group__0__Impl rule__Prefix__Group__1 ;
    public final void rule__Prefix__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5892:1: ( rule__Prefix__Group__0__Impl rule__Prefix__Group__1 )
            // InternalBSharp.g:5893:2: rule__Prefix__Group__0__Impl rule__Prefix__Group__1
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
    // InternalBSharp.g:5900:1: rule__Prefix__Group__0__Impl : ( ( rule__Prefix__NameAssignment_0 ) ) ;
    public final void rule__Prefix__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5904:1: ( ( ( rule__Prefix__NameAssignment_0 ) ) )
            // InternalBSharp.g:5905:1: ( ( rule__Prefix__NameAssignment_0 ) )
            {
            // InternalBSharp.g:5905:1: ( ( rule__Prefix__NameAssignment_0 ) )
            // InternalBSharp.g:5906:2: ( rule__Prefix__NameAssignment_0 )
            {
             before(grammarAccess.getPrefixAccess().getNameAssignment_0()); 
            // InternalBSharp.g:5907:2: ( rule__Prefix__NameAssignment_0 )
            // InternalBSharp.g:5907:3: rule__Prefix__NameAssignment_0
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
    // InternalBSharp.g:5915:1: rule__Prefix__Group__1 : rule__Prefix__Group__1__Impl ;
    public final void rule__Prefix__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5919:1: ( rule__Prefix__Group__1__Impl )
            // InternalBSharp.g:5920:2: rule__Prefix__Group__1__Impl
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
    // InternalBSharp.g:5926:1: rule__Prefix__Group__1__Impl : ( ( rule__Prefix__ElemAssignment_1 ) ) ;
    public final void rule__Prefix__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5930:1: ( ( ( rule__Prefix__ElemAssignment_1 ) ) )
            // InternalBSharp.g:5931:1: ( ( rule__Prefix__ElemAssignment_1 ) )
            {
            // InternalBSharp.g:5931:1: ( ( rule__Prefix__ElemAssignment_1 ) )
            // InternalBSharp.g:5932:2: ( rule__Prefix__ElemAssignment_1 )
            {
             before(grammarAccess.getPrefixAccess().getElemAssignment_1()); 
            // InternalBSharp.g:5933:2: ( rule__Prefix__ElemAssignment_1 )
            // InternalBSharp.g:5933:3: rule__Prefix__ElemAssignment_1
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
    // InternalBSharp.g:5942:1: rule__Infix__Group__0 : rule__Infix__Group__0__Impl rule__Infix__Group__1 ;
    public final void rule__Infix__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5946:1: ( rule__Infix__Group__0__Impl rule__Infix__Group__1 )
            // InternalBSharp.g:5947:2: rule__Infix__Group__0__Impl rule__Infix__Group__1
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
    // InternalBSharp.g:5954:1: rule__Infix__Group__0__Impl : ( ruleElement ) ;
    public final void rule__Infix__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5958:1: ( ( ruleElement ) )
            // InternalBSharp.g:5959:1: ( ruleElement )
            {
            // InternalBSharp.g:5959:1: ( ruleElement )
            // InternalBSharp.g:5960:2: ruleElement
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
    // InternalBSharp.g:5969:1: rule__Infix__Group__1 : rule__Infix__Group__1__Impl ;
    public final void rule__Infix__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5973:1: ( rule__Infix__Group__1__Impl )
            // InternalBSharp.g:5974:2: rule__Infix__Group__1__Impl
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
    // InternalBSharp.g:5980:1: rule__Infix__Group__1__Impl : ( ( rule__Infix__Group_1__0 )* ) ;
    public final void rule__Infix__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:5984:1: ( ( ( rule__Infix__Group_1__0 )* ) )
            // InternalBSharp.g:5985:1: ( ( rule__Infix__Group_1__0 )* )
            {
            // InternalBSharp.g:5985:1: ( ( rule__Infix__Group_1__0 )* )
            // InternalBSharp.g:5986:2: ( rule__Infix__Group_1__0 )*
            {
             before(grammarAccess.getInfixAccess().getGroup_1()); 
            // InternalBSharp.g:5987:2: ( rule__Infix__Group_1__0 )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==RULE_ID) ) {
                    int LA53_2 = input.LA(2);

                    if ( (LA53_2==40) ) {
                        int LA53_4 = input.LA(3);

                        if ( (LA53_4==11||(LA53_4>=23 && LA53_4<=24)||LA53_4==40||LA53_4==52||LA53_4==57) ) {
                            alt53=1;
                        }
                        else if ( (LA53_4==RULE_ID) ) {
                            int LA53_5 = input.LA(4);

                            if ( (LA53_5==RULE_ID||(LA53_5>=25 && LA53_5<=30)||LA53_5==33||(LA53_5>=40 && LA53_5<=42)) ) {
                                alt53=1;
                            }


                        }


                    }
                    else if ( (LA53_2==RULE_ID||LA53_2==11) ) {
                        alt53=1;
                    }


                }
                else if ( ((LA53_0>=25 && LA53_0<=30)) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // InternalBSharp.g:5987:3: rule__Infix__Group_1__0
            	    {
            	    pushFollow(FOLLOW_51);
            	    rule__Infix__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop53;
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
    // InternalBSharp.g:5996:1: rule__Infix__Group_1__0 : rule__Infix__Group_1__0__Impl rule__Infix__Group_1__1 ;
    public final void rule__Infix__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6000:1: ( rule__Infix__Group_1__0__Impl rule__Infix__Group_1__1 )
            // InternalBSharp.g:6001:2: rule__Infix__Group_1__0__Impl rule__Infix__Group_1__1
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
    // InternalBSharp.g:6008:1: rule__Infix__Group_1__0__Impl : ( () ) ;
    public final void rule__Infix__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6012:1: ( ( () ) )
            // InternalBSharp.g:6013:1: ( () )
            {
            // InternalBSharp.g:6013:1: ( () )
            // InternalBSharp.g:6014:2: ()
            {
             before(grammarAccess.getInfixAccess().getInfixLeftAction_1_0()); 
            // InternalBSharp.g:6015:2: ()
            // InternalBSharp.g:6015:3: 
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
    // InternalBSharp.g:6023:1: rule__Infix__Group_1__1 : rule__Infix__Group_1__1__Impl rule__Infix__Group_1__2 ;
    public final void rule__Infix__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6027:1: ( rule__Infix__Group_1__1__Impl rule__Infix__Group_1__2 )
            // InternalBSharp.g:6028:2: rule__Infix__Group_1__1__Impl rule__Infix__Group_1__2
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
    // InternalBSharp.g:6035:1: rule__Infix__Group_1__1__Impl : ( ( rule__Infix__Alternatives_1_1 ) ) ;
    public final void rule__Infix__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6039:1: ( ( ( rule__Infix__Alternatives_1_1 ) ) )
            // InternalBSharp.g:6040:1: ( ( rule__Infix__Alternatives_1_1 ) )
            {
            // InternalBSharp.g:6040:1: ( ( rule__Infix__Alternatives_1_1 ) )
            // InternalBSharp.g:6041:2: ( rule__Infix__Alternatives_1_1 )
            {
             before(grammarAccess.getInfixAccess().getAlternatives_1_1()); 
            // InternalBSharp.g:6042:2: ( rule__Infix__Alternatives_1_1 )
            // InternalBSharp.g:6042:3: rule__Infix__Alternatives_1_1
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
    // InternalBSharp.g:6050:1: rule__Infix__Group_1__2 : rule__Infix__Group_1__2__Impl ;
    public final void rule__Infix__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6054:1: ( rule__Infix__Group_1__2__Impl )
            // InternalBSharp.g:6055:2: rule__Infix__Group_1__2__Impl
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
    // InternalBSharp.g:6061:1: rule__Infix__Group_1__2__Impl : ( ( rule__Infix__RightAssignment_1_2 ) ) ;
    public final void rule__Infix__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6065:1: ( ( ( rule__Infix__RightAssignment_1_2 ) ) )
            // InternalBSharp.g:6066:1: ( ( rule__Infix__RightAssignment_1_2 ) )
            {
            // InternalBSharp.g:6066:1: ( ( rule__Infix__RightAssignment_1_2 ) )
            // InternalBSharp.g:6067:2: ( rule__Infix__RightAssignment_1_2 )
            {
             before(grammarAccess.getInfixAccess().getRightAssignment_1_2()); 
            // InternalBSharp.g:6068:2: ( rule__Infix__RightAssignment_1_2 )
            // InternalBSharp.g:6068:3: rule__Infix__RightAssignment_1_2
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
    // InternalBSharp.g:6077:1: rule__Bracket__Group__0 : rule__Bracket__Group__0__Impl rule__Bracket__Group__1 ;
    public final void rule__Bracket__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6081:1: ( rule__Bracket__Group__0__Impl rule__Bracket__Group__1 )
            // InternalBSharp.g:6082:2: rule__Bracket__Group__0__Impl rule__Bracket__Group__1
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
    // InternalBSharp.g:6089:1: rule__Bracket__Group__0__Impl : ( '(' ) ;
    public final void rule__Bracket__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6093:1: ( ( '(' ) )
            // InternalBSharp.g:6094:1: ( '(' )
            {
            // InternalBSharp.g:6094:1: ( '(' )
            // InternalBSharp.g:6095:2: '('
            {
             before(grammarAccess.getBracketAccess().getLeftParenthesisKeyword_0()); 
            match(input,40,FOLLOW_2); 
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
    // InternalBSharp.g:6104:1: rule__Bracket__Group__1 : rule__Bracket__Group__1__Impl rule__Bracket__Group__2 ;
    public final void rule__Bracket__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6108:1: ( rule__Bracket__Group__1__Impl rule__Bracket__Group__2 )
            // InternalBSharp.g:6109:2: rule__Bracket__Group__1__Impl rule__Bracket__Group__2
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
    // InternalBSharp.g:6116:1: rule__Bracket__Group__1__Impl : ( ( rule__Bracket__ChildAssignment_1 ) ) ;
    public final void rule__Bracket__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6120:1: ( ( ( rule__Bracket__ChildAssignment_1 ) ) )
            // InternalBSharp.g:6121:1: ( ( rule__Bracket__ChildAssignment_1 ) )
            {
            // InternalBSharp.g:6121:1: ( ( rule__Bracket__ChildAssignment_1 ) )
            // InternalBSharp.g:6122:2: ( rule__Bracket__ChildAssignment_1 )
            {
             before(grammarAccess.getBracketAccess().getChildAssignment_1()); 
            // InternalBSharp.g:6123:2: ( rule__Bracket__ChildAssignment_1 )
            // InternalBSharp.g:6123:3: rule__Bracket__ChildAssignment_1
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
    // InternalBSharp.g:6131:1: rule__Bracket__Group__2 : rule__Bracket__Group__2__Impl ;
    public final void rule__Bracket__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6135:1: ( rule__Bracket__Group__2__Impl )
            // InternalBSharp.g:6136:2: rule__Bracket__Group__2__Impl
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
    // InternalBSharp.g:6142:1: rule__Bracket__Group__2__Impl : ( ')' ) ;
    public final void rule__Bracket__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6146:1: ( ( ')' ) )
            // InternalBSharp.g:6147:1: ( ')' )
            {
            // InternalBSharp.g:6147:1: ( ')' )
            // InternalBSharp.g:6148:2: ')'
            {
             before(grammarAccess.getBracketAccess().getRightParenthesisKeyword_2()); 
            match(input,41,FOLLOW_2); 
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
    // InternalBSharp.g:6158:1: rule__FunctionCall__Group__0 : rule__FunctionCall__Group__0__Impl rule__FunctionCall__Group__1 ;
    public final void rule__FunctionCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6162:1: ( rule__FunctionCall__Group__0__Impl rule__FunctionCall__Group__1 )
            // InternalBSharp.g:6163:2: rule__FunctionCall__Group__0__Impl rule__FunctionCall__Group__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalBSharp.g:6170:1: rule__FunctionCall__Group__0__Impl : ( ( rule__FunctionCall__Alternatives_0 ) ) ;
    public final void rule__FunctionCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6174:1: ( ( ( rule__FunctionCall__Alternatives_0 ) ) )
            // InternalBSharp.g:6175:1: ( ( rule__FunctionCall__Alternatives_0 ) )
            {
            // InternalBSharp.g:6175:1: ( ( rule__FunctionCall__Alternatives_0 ) )
            // InternalBSharp.g:6176:2: ( rule__FunctionCall__Alternatives_0 )
            {
             before(grammarAccess.getFunctionCallAccess().getAlternatives_0()); 
            // InternalBSharp.g:6177:2: ( rule__FunctionCall__Alternatives_0 )
            // InternalBSharp.g:6177:3: rule__FunctionCall__Alternatives_0
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
    // InternalBSharp.g:6185:1: rule__FunctionCall__Group__1 : rule__FunctionCall__Group__1__Impl ;
    public final void rule__FunctionCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6189:1: ( rule__FunctionCall__Group__1__Impl )
            // InternalBSharp.g:6190:2: rule__FunctionCall__Group__1__Impl
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
    // InternalBSharp.g:6196:1: rule__FunctionCall__Group__1__Impl : ( ( rule__FunctionCall__Group_1__0 )? ) ;
    public final void rule__FunctionCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6200:1: ( ( ( rule__FunctionCall__Group_1__0 )? ) )
            // InternalBSharp.g:6201:1: ( ( rule__FunctionCall__Group_1__0 )? )
            {
            // InternalBSharp.g:6201:1: ( ( rule__FunctionCall__Group_1__0 )? )
            // InternalBSharp.g:6202:2: ( rule__FunctionCall__Group_1__0 )?
            {
             before(grammarAccess.getFunctionCallAccess().getGroup_1()); 
            // InternalBSharp.g:6203:2: ( rule__FunctionCall__Group_1__0 )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==40||LA54_0==42) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalBSharp.g:6203:3: rule__FunctionCall__Group_1__0
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
    // InternalBSharp.g:6212:1: rule__FunctionCall__Group_1__0 : rule__FunctionCall__Group_1__0__Impl rule__FunctionCall__Group_1__1 ;
    public final void rule__FunctionCall__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6216:1: ( rule__FunctionCall__Group_1__0__Impl rule__FunctionCall__Group_1__1 )
            // InternalBSharp.g:6217:2: rule__FunctionCall__Group_1__0__Impl rule__FunctionCall__Group_1__1
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
    // InternalBSharp.g:6224:1: rule__FunctionCall__Group_1__0__Impl : ( ( rule__FunctionCall__ContextAssignment_1_0 )? ) ;
    public final void rule__FunctionCall__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6228:1: ( ( ( rule__FunctionCall__ContextAssignment_1_0 )? ) )
            // InternalBSharp.g:6229:1: ( ( rule__FunctionCall__ContextAssignment_1_0 )? )
            {
            // InternalBSharp.g:6229:1: ( ( rule__FunctionCall__ContextAssignment_1_0 )? )
            // InternalBSharp.g:6230:2: ( rule__FunctionCall__ContextAssignment_1_0 )?
            {
             before(grammarAccess.getFunctionCallAccess().getContextAssignment_1_0()); 
            // InternalBSharp.g:6231:2: ( rule__FunctionCall__ContextAssignment_1_0 )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==42) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalBSharp.g:6231:3: rule__FunctionCall__ContextAssignment_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FunctionCall__ContextAssignment_1_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFunctionCallAccess().getContextAssignment_1_0()); 

            }


            }

        }
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
    // InternalBSharp.g:6239:1: rule__FunctionCall__Group_1__1 : rule__FunctionCall__Group_1__1__Impl rule__FunctionCall__Group_1__2 ;
    public final void rule__FunctionCall__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6243:1: ( rule__FunctionCall__Group_1__1__Impl rule__FunctionCall__Group_1__2 )
            // InternalBSharp.g:6244:2: rule__FunctionCall__Group_1__1__Impl rule__FunctionCall__Group_1__2
            {
            pushFollow(FOLLOW_52);
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
    // InternalBSharp.g:6251:1: rule__FunctionCall__Group_1__1__Impl : ( '(' ) ;
    public final void rule__FunctionCall__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6255:1: ( ( '(' ) )
            // InternalBSharp.g:6256:1: ( '(' )
            {
            // InternalBSharp.g:6256:1: ( '(' )
            // InternalBSharp.g:6257:2: '('
            {
             before(grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_1_1()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_1_1()); 

            }


            }

        }
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
    // InternalBSharp.g:6266:1: rule__FunctionCall__Group_1__2 : rule__FunctionCall__Group_1__2__Impl rule__FunctionCall__Group_1__3 ;
    public final void rule__FunctionCall__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6270:1: ( rule__FunctionCall__Group_1__2__Impl rule__FunctionCall__Group_1__3 )
            // InternalBSharp.g:6271:2: rule__FunctionCall__Group_1__2__Impl rule__FunctionCall__Group_1__3
            {
            pushFollow(FOLLOW_52);
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
    // InternalBSharp.g:6278:1: rule__FunctionCall__Group_1__2__Impl : ( ( rule__FunctionCall__ArgumentsAssignment_1_2 )? ) ;
    public final void rule__FunctionCall__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6282:1: ( ( ( rule__FunctionCall__ArgumentsAssignment_1_2 )? ) )
            // InternalBSharp.g:6283:1: ( ( rule__FunctionCall__ArgumentsAssignment_1_2 )? )
            {
            // InternalBSharp.g:6283:1: ( ( rule__FunctionCall__ArgumentsAssignment_1_2 )? )
            // InternalBSharp.g:6284:2: ( rule__FunctionCall__ArgumentsAssignment_1_2 )?
            {
             before(grammarAccess.getFunctionCallAccess().getArgumentsAssignment_1_2()); 
            // InternalBSharp.g:6285:2: ( rule__FunctionCall__ArgumentsAssignment_1_2 )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==RULE_ID||LA56_0==11||(LA56_0>=23 && LA56_0<=24)||LA56_0==40||LA56_0==52||LA56_0==57) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalBSharp.g:6285:3: rule__FunctionCall__ArgumentsAssignment_1_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__FunctionCall__ArgumentsAssignment_1_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFunctionCallAccess().getArgumentsAssignment_1_2()); 

            }


            }

        }
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
    // InternalBSharp.g:6293:1: rule__FunctionCall__Group_1__3 : rule__FunctionCall__Group_1__3__Impl rule__FunctionCall__Group_1__4 ;
    public final void rule__FunctionCall__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6297:1: ( rule__FunctionCall__Group_1__3__Impl rule__FunctionCall__Group_1__4 )
            // InternalBSharp.g:6298:2: rule__FunctionCall__Group_1__3__Impl rule__FunctionCall__Group_1__4
            {
            pushFollow(FOLLOW_52);
            rule__FunctionCall__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionCall__Group_1__4();

            state._fsp--;


            }

        }
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
    // InternalBSharp.g:6305:1: rule__FunctionCall__Group_1__3__Impl : ( ( rule__FunctionCall__Group_1_3__0 )* ) ;
    public final void rule__FunctionCall__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6309:1: ( ( ( rule__FunctionCall__Group_1_3__0 )* ) )
            // InternalBSharp.g:6310:1: ( ( rule__FunctionCall__Group_1_3__0 )* )
            {
            // InternalBSharp.g:6310:1: ( ( rule__FunctionCall__Group_1_3__0 )* )
            // InternalBSharp.g:6311:2: ( rule__FunctionCall__Group_1_3__0 )*
            {
             before(grammarAccess.getFunctionCallAccess().getGroup_1_3()); 
            // InternalBSharp.g:6312:2: ( rule__FunctionCall__Group_1_3__0 )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==44) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // InternalBSharp.g:6312:3: rule__FunctionCall__Group_1_3__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__FunctionCall__Group_1_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop57;
                }
            } while (true);

             after(grammarAccess.getFunctionCallAccess().getGroup_1_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__FunctionCall__Group_1__4"
    // InternalBSharp.g:6320:1: rule__FunctionCall__Group_1__4 : rule__FunctionCall__Group_1__4__Impl ;
    public final void rule__FunctionCall__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6324:1: ( rule__FunctionCall__Group_1__4__Impl )
            // InternalBSharp.g:6325:2: rule__FunctionCall__Group_1__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FunctionCall__Group_1__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group_1__4"


    // $ANTLR start "rule__FunctionCall__Group_1__4__Impl"
    // InternalBSharp.g:6331:1: rule__FunctionCall__Group_1__4__Impl : ( ')' ) ;
    public final void rule__FunctionCall__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6335:1: ( ( ')' ) )
            // InternalBSharp.g:6336:1: ( ')' )
            {
            // InternalBSharp.g:6336:1: ( ')' )
            // InternalBSharp.g:6337:2: ')'
            {
             before(grammarAccess.getFunctionCallAccess().getRightParenthesisKeyword_1_4()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getFunctionCallAccess().getRightParenthesisKeyword_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group_1__4__Impl"


    // $ANTLR start "rule__FunctionCall__Group_1_3__0"
    // InternalBSharp.g:6347:1: rule__FunctionCall__Group_1_3__0 : rule__FunctionCall__Group_1_3__0__Impl rule__FunctionCall__Group_1_3__1 ;
    public final void rule__FunctionCall__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6351:1: ( rule__FunctionCall__Group_1_3__0__Impl rule__FunctionCall__Group_1_3__1 )
            // InternalBSharp.g:6352:2: rule__FunctionCall__Group_1_3__0__Impl rule__FunctionCall__Group_1_3__1
            {
            pushFollow(FOLLOW_28);
            rule__FunctionCall__Group_1_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionCall__Group_1_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group_1_3__0"


    // $ANTLR start "rule__FunctionCall__Group_1_3__0__Impl"
    // InternalBSharp.g:6359:1: rule__FunctionCall__Group_1_3__0__Impl : ( ',' ) ;
    public final void rule__FunctionCall__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6363:1: ( ( ',' ) )
            // InternalBSharp.g:6364:1: ( ',' )
            {
            // InternalBSharp.g:6364:1: ( ',' )
            // InternalBSharp.g:6365:2: ','
            {
             before(grammarAccess.getFunctionCallAccess().getCommaKeyword_1_3_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getFunctionCallAccess().getCommaKeyword_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group_1_3__0__Impl"


    // $ANTLR start "rule__FunctionCall__Group_1_3__1"
    // InternalBSharp.g:6374:1: rule__FunctionCall__Group_1_3__1 : rule__FunctionCall__Group_1_3__1__Impl ;
    public final void rule__FunctionCall__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6378:1: ( rule__FunctionCall__Group_1_3__1__Impl )
            // InternalBSharp.g:6379:2: rule__FunctionCall__Group_1_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FunctionCall__Group_1_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group_1_3__1"


    // $ANTLR start "rule__FunctionCall__Group_1_3__1__Impl"
    // InternalBSharp.g:6385:1: rule__FunctionCall__Group_1_3__1__Impl : ( ( rule__FunctionCall__ArgumentsAssignment_1_3_1 ) ) ;
    public final void rule__FunctionCall__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6389:1: ( ( ( rule__FunctionCall__ArgumentsAssignment_1_3_1 ) ) )
            // InternalBSharp.g:6390:1: ( ( rule__FunctionCall__ArgumentsAssignment_1_3_1 ) )
            {
            // InternalBSharp.g:6390:1: ( ( rule__FunctionCall__ArgumentsAssignment_1_3_1 ) )
            // InternalBSharp.g:6391:2: ( rule__FunctionCall__ArgumentsAssignment_1_3_1 )
            {
             before(grammarAccess.getFunctionCallAccess().getArgumentsAssignment_1_3_1()); 
            // InternalBSharp.g:6392:2: ( rule__FunctionCall__ArgumentsAssignment_1_3_1 )
            // InternalBSharp.g:6392:3: rule__FunctionCall__ArgumentsAssignment_1_3_1
            {
            pushFollow(FOLLOW_2);
            rule__FunctionCall__ArgumentsAssignment_1_3_1();

            state._fsp--;


            }

             after(grammarAccess.getFunctionCallAccess().getArgumentsAssignment_1_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group_1_3__1__Impl"


    // $ANTLR start "rule__ClassVarDecl__Group__0"
    // InternalBSharp.g:6401:1: rule__ClassVarDecl__Group__0 : rule__ClassVarDecl__Group__0__Impl rule__ClassVarDecl__Group__1 ;
    public final void rule__ClassVarDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6405:1: ( rule__ClassVarDecl__Group__0__Impl rule__ClassVarDecl__Group__1 )
            // InternalBSharp.g:6406:2: rule__ClassVarDecl__Group__0__Impl rule__ClassVarDecl__Group__1
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
    // InternalBSharp.g:6413:1: rule__ClassVarDecl__Group__0__Impl : ( ( rule__ClassVarDecl__OwnerTypeAssignment_0 ) ) ;
    public final void rule__ClassVarDecl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6417:1: ( ( ( rule__ClassVarDecl__OwnerTypeAssignment_0 ) ) )
            // InternalBSharp.g:6418:1: ( ( rule__ClassVarDecl__OwnerTypeAssignment_0 ) )
            {
            // InternalBSharp.g:6418:1: ( ( rule__ClassVarDecl__OwnerTypeAssignment_0 ) )
            // InternalBSharp.g:6419:2: ( rule__ClassVarDecl__OwnerTypeAssignment_0 )
            {
             before(grammarAccess.getClassVarDeclAccess().getOwnerTypeAssignment_0()); 
            // InternalBSharp.g:6420:2: ( rule__ClassVarDecl__OwnerTypeAssignment_0 )
            // InternalBSharp.g:6420:3: rule__ClassVarDecl__OwnerTypeAssignment_0
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
    // InternalBSharp.g:6428:1: rule__ClassVarDecl__Group__1 : rule__ClassVarDecl__Group__1__Impl rule__ClassVarDecl__Group__2 ;
    public final void rule__ClassVarDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6432:1: ( rule__ClassVarDecl__Group__1__Impl rule__ClassVarDecl__Group__2 )
            // InternalBSharp.g:6433:2: rule__ClassVarDecl__Group__1__Impl rule__ClassVarDecl__Group__2
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
    // InternalBSharp.g:6440:1: rule__ClassVarDecl__Group__1__Impl : ( '.' ) ;
    public final void rule__ClassVarDecl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6444:1: ( ( '.' ) )
            // InternalBSharp.g:6445:1: ( '.' )
            {
            // InternalBSharp.g:6445:1: ( '.' )
            // InternalBSharp.g:6446:2: '.'
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
    // InternalBSharp.g:6455:1: rule__ClassVarDecl__Group__2 : rule__ClassVarDecl__Group__2__Impl ;
    public final void rule__ClassVarDecl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6459:1: ( rule__ClassVarDecl__Group__2__Impl )
            // InternalBSharp.g:6460:2: rule__ClassVarDecl__Group__2__Impl
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
    // InternalBSharp.g:6466:1: rule__ClassVarDecl__Group__2__Impl : ( ( rule__ClassVarDecl__TypeInstAssignment_2 ) ) ;
    public final void rule__ClassVarDecl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6470:1: ( ( ( rule__ClassVarDecl__TypeInstAssignment_2 ) ) )
            // InternalBSharp.g:6471:1: ( ( rule__ClassVarDecl__TypeInstAssignment_2 ) )
            {
            // InternalBSharp.g:6471:1: ( ( rule__ClassVarDecl__TypeInstAssignment_2 ) )
            // InternalBSharp.g:6472:2: ( rule__ClassVarDecl__TypeInstAssignment_2 )
            {
             before(grammarAccess.getClassVarDeclAccess().getTypeInstAssignment_2()); 
            // InternalBSharp.g:6473:2: ( rule__ClassVarDecl__TypeInstAssignment_2 )
            // InternalBSharp.g:6473:3: rule__ClassVarDecl__TypeInstAssignment_2
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
    // InternalBSharp.g:6482:1: rule__Instance__Group__0 : rule__Instance__Group__0__Impl rule__Instance__Group__1 ;
    public final void rule__Instance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6486:1: ( rule__Instance__Group__0__Impl rule__Instance__Group__1 )
            // InternalBSharp.g:6487:2: rule__Instance__Group__0__Impl rule__Instance__Group__1
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
    // InternalBSharp.g:6494:1: rule__Instance__Group__0__Impl : ( 'Instance' ) ;
    public final void rule__Instance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6498:1: ( ( 'Instance' ) )
            // InternalBSharp.g:6499:1: ( 'Instance' )
            {
            // InternalBSharp.g:6499:1: ( 'Instance' )
            // InternalBSharp.g:6500:2: 'Instance'
            {
             before(grammarAccess.getInstanceAccess().getInstanceKeyword_0()); 
            match(input,55,FOLLOW_2); 
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
    // InternalBSharp.g:6509:1: rule__Instance__Group__1 : rule__Instance__Group__1__Impl rule__Instance__Group__2 ;
    public final void rule__Instance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6513:1: ( rule__Instance__Group__1__Impl rule__Instance__Group__2 )
            // InternalBSharp.g:6514:2: rule__Instance__Group__1__Impl rule__Instance__Group__2
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
    // InternalBSharp.g:6521:1: rule__Instance__Group__1__Impl : ( ( rule__Instance__ClassNameAssignment_1 ) ) ;
    public final void rule__Instance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6525:1: ( ( ( rule__Instance__ClassNameAssignment_1 ) ) )
            // InternalBSharp.g:6526:1: ( ( rule__Instance__ClassNameAssignment_1 ) )
            {
            // InternalBSharp.g:6526:1: ( ( rule__Instance__ClassNameAssignment_1 ) )
            // InternalBSharp.g:6527:2: ( rule__Instance__ClassNameAssignment_1 )
            {
             before(grammarAccess.getInstanceAccess().getClassNameAssignment_1()); 
            // InternalBSharp.g:6528:2: ( rule__Instance__ClassNameAssignment_1 )
            // InternalBSharp.g:6528:3: rule__Instance__ClassNameAssignment_1
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
    // InternalBSharp.g:6536:1: rule__Instance__Group__2 : rule__Instance__Group__2__Impl rule__Instance__Group__3 ;
    public final void rule__Instance__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6540:1: ( rule__Instance__Group__2__Impl rule__Instance__Group__3 )
            // InternalBSharp.g:6541:2: rule__Instance__Group__2__Impl rule__Instance__Group__3
            {
            pushFollow(FOLLOW_26);
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
    // InternalBSharp.g:6548:1: rule__Instance__Group__2__Impl : ( ( rule__Instance__ContextAssignment_2 ) ) ;
    public final void rule__Instance__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6552:1: ( ( ( rule__Instance__ContextAssignment_2 ) ) )
            // InternalBSharp.g:6553:1: ( ( rule__Instance__ContextAssignment_2 ) )
            {
            // InternalBSharp.g:6553:1: ( ( rule__Instance__ContextAssignment_2 ) )
            // InternalBSharp.g:6554:2: ( rule__Instance__ContextAssignment_2 )
            {
             before(grammarAccess.getInstanceAccess().getContextAssignment_2()); 
            // InternalBSharp.g:6555:2: ( rule__Instance__ContextAssignment_2 )
            // InternalBSharp.g:6555:3: rule__Instance__ContextAssignment_2
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
    // InternalBSharp.g:6563:1: rule__Instance__Group__3 : rule__Instance__Group__3__Impl rule__Instance__Group__4 ;
    public final void rule__Instance__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6567:1: ( rule__Instance__Group__3__Impl rule__Instance__Group__4 )
            // InternalBSharp.g:6568:2: rule__Instance__Group__3__Impl rule__Instance__Group__4
            {
            pushFollow(FOLLOW_52);
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
    // InternalBSharp.g:6575:1: rule__Instance__Group__3__Impl : ( '(' ) ;
    public final void rule__Instance__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6579:1: ( ( '(' ) )
            // InternalBSharp.g:6580:1: ( '(' )
            {
            // InternalBSharp.g:6580:1: ( '(' )
            // InternalBSharp.g:6581:2: '('
            {
             before(grammarAccess.getInstanceAccess().getLeftParenthesisKeyword_3()); 
            match(input,40,FOLLOW_2); 
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
    // InternalBSharp.g:6590:1: rule__Instance__Group__4 : rule__Instance__Group__4__Impl rule__Instance__Group__5 ;
    public final void rule__Instance__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6594:1: ( rule__Instance__Group__4__Impl rule__Instance__Group__5 )
            // InternalBSharp.g:6595:2: rule__Instance__Group__4__Impl rule__Instance__Group__5
            {
            pushFollow(FOLLOW_52);
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
    // InternalBSharp.g:6602:1: rule__Instance__Group__4__Impl : ( ( rule__Instance__ArgumentsAssignment_4 )? ) ;
    public final void rule__Instance__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6606:1: ( ( ( rule__Instance__ArgumentsAssignment_4 )? ) )
            // InternalBSharp.g:6607:1: ( ( rule__Instance__ArgumentsAssignment_4 )? )
            {
            // InternalBSharp.g:6607:1: ( ( rule__Instance__ArgumentsAssignment_4 )? )
            // InternalBSharp.g:6608:2: ( rule__Instance__ArgumentsAssignment_4 )?
            {
             before(grammarAccess.getInstanceAccess().getArgumentsAssignment_4()); 
            // InternalBSharp.g:6609:2: ( rule__Instance__ArgumentsAssignment_4 )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==RULE_ID||LA58_0==11||(LA58_0>=23 && LA58_0<=24)||LA58_0==40||LA58_0==52||LA58_0==57) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalBSharp.g:6609:3: rule__Instance__ArgumentsAssignment_4
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
    // InternalBSharp.g:6617:1: rule__Instance__Group__5 : rule__Instance__Group__5__Impl rule__Instance__Group__6 ;
    public final void rule__Instance__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6621:1: ( rule__Instance__Group__5__Impl rule__Instance__Group__6 )
            // InternalBSharp.g:6622:2: rule__Instance__Group__5__Impl rule__Instance__Group__6
            {
            pushFollow(FOLLOW_52);
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
    // InternalBSharp.g:6629:1: rule__Instance__Group__5__Impl : ( ( rule__Instance__Group_5__0 )* ) ;
    public final void rule__Instance__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6633:1: ( ( ( rule__Instance__Group_5__0 )* ) )
            // InternalBSharp.g:6634:1: ( ( rule__Instance__Group_5__0 )* )
            {
            // InternalBSharp.g:6634:1: ( ( rule__Instance__Group_5__0 )* )
            // InternalBSharp.g:6635:2: ( rule__Instance__Group_5__0 )*
            {
             before(grammarAccess.getInstanceAccess().getGroup_5()); 
            // InternalBSharp.g:6636:2: ( rule__Instance__Group_5__0 )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==44) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // InternalBSharp.g:6636:3: rule__Instance__Group_5__0
            	    {
            	    pushFollow(FOLLOW_21);
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
    // InternalBSharp.g:6644:1: rule__Instance__Group__6 : rule__Instance__Group__6__Impl rule__Instance__Group__7 ;
    public final void rule__Instance__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6648:1: ( rule__Instance__Group__6__Impl rule__Instance__Group__7 )
            // InternalBSharp.g:6649:2: rule__Instance__Group__6__Impl rule__Instance__Group__7
            {
            pushFollow(FOLLOW_4);
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
    // InternalBSharp.g:6656:1: rule__Instance__Group__6__Impl : ( ')' ) ;
    public final void rule__Instance__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6660:1: ( ( ')' ) )
            // InternalBSharp.g:6661:1: ( ')' )
            {
            // InternalBSharp.g:6661:1: ( ')' )
            // InternalBSharp.g:6662:2: ')'
            {
             before(grammarAccess.getInstanceAccess().getRightParenthesisKeyword_6()); 
            match(input,41,FOLLOW_2); 
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


    // $ANTLR start "rule__Instance__Group__7"
    // InternalBSharp.g:6671:1: rule__Instance__Group__7 : rule__Instance__Group__7__Impl ;
    public final void rule__Instance__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6675:1: ( rule__Instance__Group__7__Impl )
            // InternalBSharp.g:6676:2: rule__Instance__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Instance__Group__7__Impl();

            state._fsp--;


            }

        }
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
    // InternalBSharp.g:6682:1: rule__Instance__Group__7__Impl : ( ( rule__Instance__NameAssignment_7 )? ) ;
    public final void rule__Instance__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6686:1: ( ( ( rule__Instance__NameAssignment_7 )? ) )
            // InternalBSharp.g:6687:1: ( ( rule__Instance__NameAssignment_7 )? )
            {
            // InternalBSharp.g:6687:1: ( ( rule__Instance__NameAssignment_7 )? )
            // InternalBSharp.g:6688:2: ( rule__Instance__NameAssignment_7 )?
            {
             before(grammarAccess.getInstanceAccess().getNameAssignment_7()); 
            // InternalBSharp.g:6689:2: ( rule__Instance__NameAssignment_7 )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==RULE_ID) ) {
                int LA60_1 = input.LA(2);

                if ( (LA60_1==EOF||LA60_1==RULE_ID||LA60_1==51||LA60_1==53||LA60_1==55) ) {
                    alt60=1;
                }
            }
            switch (alt60) {
                case 1 :
                    // InternalBSharp.g:6689:3: rule__Instance__NameAssignment_7
                    {
                    pushFollow(FOLLOW_2);
                    rule__Instance__NameAssignment_7();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInstanceAccess().getNameAssignment_7()); 

            }


            }

        }
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


    // $ANTLR start "rule__Instance__Group_5__0"
    // InternalBSharp.g:6698:1: rule__Instance__Group_5__0 : rule__Instance__Group_5__0__Impl rule__Instance__Group_5__1 ;
    public final void rule__Instance__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6702:1: ( rule__Instance__Group_5__0__Impl rule__Instance__Group_5__1 )
            // InternalBSharp.g:6703:2: rule__Instance__Group_5__0__Impl rule__Instance__Group_5__1
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
    // InternalBSharp.g:6710:1: rule__Instance__Group_5__0__Impl : ( ',' ) ;
    public final void rule__Instance__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6714:1: ( ( ',' ) )
            // InternalBSharp.g:6715:1: ( ',' )
            {
            // InternalBSharp.g:6715:1: ( ',' )
            // InternalBSharp.g:6716:2: ','
            {
             before(grammarAccess.getInstanceAccess().getCommaKeyword_5_0()); 
            match(input,44,FOLLOW_2); 
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
    // InternalBSharp.g:6725:1: rule__Instance__Group_5__1 : rule__Instance__Group_5__1__Impl ;
    public final void rule__Instance__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6729:1: ( rule__Instance__Group_5__1__Impl )
            // InternalBSharp.g:6730:2: rule__Instance__Group_5__1__Impl
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
    // InternalBSharp.g:6736:1: rule__Instance__Group_5__1__Impl : ( ( rule__Instance__ArgumentsAssignment_5_1 ) ) ;
    public final void rule__Instance__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6740:1: ( ( ( rule__Instance__ArgumentsAssignment_5_1 ) ) )
            // InternalBSharp.g:6741:1: ( ( rule__Instance__ArgumentsAssignment_5_1 ) )
            {
            // InternalBSharp.g:6741:1: ( ( rule__Instance__ArgumentsAssignment_5_1 ) )
            // InternalBSharp.g:6742:2: ( rule__Instance__ArgumentsAssignment_5_1 )
            {
             before(grammarAccess.getInstanceAccess().getArgumentsAssignment_5_1()); 
            // InternalBSharp.g:6743:2: ( rule__Instance__ArgumentsAssignment_5_1 )
            // InternalBSharp.g:6743:3: rule__Instance__ArgumentsAssignment_5_1
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
    // InternalBSharp.g:6752:1: rule__TopLevel__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__TopLevel__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6756:1: ( ( ruleQualifiedName ) )
            // InternalBSharp.g:6757:2: ( ruleQualifiedName )
            {
            // InternalBSharp.g:6757:2: ( ruleQualifiedName )
            // InternalBSharp.g:6758:3: ruleQualifiedName
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
    // InternalBSharp.g:6767:1: rule__TopLevel__TopLevelFileAssignment_2 : ( ruleTopLevelFile ) ;
    public final void rule__TopLevel__TopLevelFileAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6771:1: ( ( ruleTopLevelFile ) )
            // InternalBSharp.g:6772:2: ( ruleTopLevelFile )
            {
            // InternalBSharp.g:6772:2: ( ruleTopLevelFile )
            // InternalBSharp.g:6773:3: ruleTopLevelFile
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
    // InternalBSharp.g:6782:1: rule__TopLevelFile__NoImportElementsAssignment_1 : ( ruleBodyElements ) ;
    public final void rule__TopLevelFile__NoImportElementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6786:1: ( ( ruleBodyElements ) )
            // InternalBSharp.g:6787:2: ( ruleBodyElements )
            {
            // InternalBSharp.g:6787:2: ( ruleBodyElements )
            // InternalBSharp.g:6788:3: ruleBodyElements
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
    // InternalBSharp.g:6797:1: rule__TopLevelFile__TopLevelImportsAssignment_2 : ( ruleTopLevelImport ) ;
    public final void rule__TopLevelFile__TopLevelImportsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6801:1: ( ( ruleTopLevelImport ) )
            // InternalBSharp.g:6802:2: ( ruleTopLevelImport )
            {
            // InternalBSharp.g:6802:2: ( ruleTopLevelImport )
            // InternalBSharp.g:6803:3: ruleTopLevelImport
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
    // InternalBSharp.g:6812:1: rule__TopLevelImport__GlobalImportsAssignment_0_0 : ( ruleGlobalImport ) ;
    public final void rule__TopLevelImport__GlobalImportsAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6816:1: ( ( ruleGlobalImport ) )
            // InternalBSharp.g:6817:2: ( ruleGlobalImport )
            {
            // InternalBSharp.g:6817:2: ( ruleGlobalImport )
            // InternalBSharp.g:6818:3: ruleGlobalImport
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
    // InternalBSharp.g:6827:1: rule__TopLevelImport__LocalImportsAssignment_0_1 : ( ruleLocalImport ) ;
    public final void rule__TopLevelImport__LocalImportsAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6831:1: ( ( ruleLocalImport ) )
            // InternalBSharp.g:6832:2: ( ruleLocalImport )
            {
            // InternalBSharp.g:6832:2: ( ruleLocalImport )
            // InternalBSharp.g:6833:3: ruleLocalImport
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
    // InternalBSharp.g:6842:1: rule__TopLevelImport__BodyElementsAssignment_1 : ( ruleBodyElements ) ;
    public final void rule__TopLevelImport__BodyElementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6846:1: ( ( ruleBodyElements ) )
            // InternalBSharp.g:6847:2: ( ruleBodyElements )
            {
            // InternalBSharp.g:6847:2: ( ruleBodyElements )
            // InternalBSharp.g:6848:3: ruleBodyElements
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
    // InternalBSharp.g:6857:1: rule__BodyElements__ClassesAssignment_0 : ( ruleClassDecl ) ;
    public final void rule__BodyElements__ClassesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6861:1: ( ( ruleClassDecl ) )
            // InternalBSharp.g:6862:2: ( ruleClassDecl )
            {
            // InternalBSharp.g:6862:2: ( ruleClassDecl )
            // InternalBSharp.g:6863:3: ruleClassDecl
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
    // InternalBSharp.g:6872:1: rule__BodyElements__ExtendsAssignment_1 : ( ruleExtend ) ;
    public final void rule__BodyElements__ExtendsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6876:1: ( ( ruleExtend ) )
            // InternalBSharp.g:6877:2: ( ruleExtend )
            {
            // InternalBSharp.g:6877:2: ( ruleExtend )
            // InternalBSharp.g:6878:3: ruleExtend
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


    // $ANTLR start "rule__GlobalImport__ProjectAssignment_1"
    // InternalBSharp.g:6887:1: rule__GlobalImport__ProjectAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__GlobalImport__ProjectAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6891:1: ( ( ruleQualifiedName ) )
            // InternalBSharp.g:6892:2: ( ruleQualifiedName )
            {
            // InternalBSharp.g:6892:2: ( ruleQualifiedName )
            // InternalBSharp.g:6893:3: ruleQualifiedName
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
    // InternalBSharp.g:6902:1: rule__GlobalImport__FileImportsAssignment_3 : ( ruleFileImport ) ;
    public final void rule__GlobalImport__FileImportsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6906:1: ( ( ruleFileImport ) )
            // InternalBSharp.g:6907:2: ( ruleFileImport )
            {
            // InternalBSharp.g:6907:2: ( ruleFileImport )
            // InternalBSharp.g:6908:3: ruleFileImport
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
    // InternalBSharp.g:6917:1: rule__FileImport__FileNameAssignment_0 : ( RULE_ID ) ;
    public final void rule__FileImport__FileNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6921:1: ( ( RULE_ID ) )
            // InternalBSharp.g:6922:2: ( RULE_ID )
            {
            // InternalBSharp.g:6922:2: ( RULE_ID )
            // InternalBSharp.g:6923:3: RULE_ID
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
    // InternalBSharp.g:6932:1: rule__FileImport__TypeAssignment_1_1_1 : ( RULE_ID ) ;
    public final void rule__FileImport__TypeAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6936:1: ( ( RULE_ID ) )
            // InternalBSharp.g:6937:2: ( RULE_ID )
            {
            // InternalBSharp.g:6937:2: ( RULE_ID )
            // InternalBSharp.g:6938:3: RULE_ID
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
    // InternalBSharp.g:6947:1: rule__LocalImport__FileImportsAssignment_1 : ( ruleFileImport ) ;
    public final void rule__LocalImport__FileImportsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6951:1: ( ( ruleFileImport ) )
            // InternalBSharp.g:6952:2: ( ruleFileImport )
            {
            // InternalBSharp.g:6952:2: ( ruleFileImport )
            // InternalBSharp.g:6953:3: ruleFileImport
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
    // InternalBSharp.g:6962:1: rule__Class__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Class__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6966:1: ( ( RULE_ID ) )
            // InternalBSharp.g:6967:2: ( RULE_ID )
            {
            // InternalBSharp.g:6967:2: ( RULE_ID )
            // InternalBSharp.g:6968:3: RULE_ID
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
    // InternalBSharp.g:6977:1: rule__Class__ContextAssignment_2 : ( rulePolyContext ) ;
    public final void rule__Class__ContextAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6981:1: ( ( rulePolyContext ) )
            // InternalBSharp.g:6982:2: ( rulePolyContext )
            {
            // InternalBSharp.g:6982:2: ( rulePolyContext )
            // InternalBSharp.g:6983:3: rulePolyContext
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


    // $ANTLR start "rule__Class__InstNameAssignment_3_1"
    // InternalBSharp.g:6992:1: rule__Class__InstNameAssignment_3_1 : ( ruleInstName ) ;
    public final void rule__Class__InstNameAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:6996:1: ( ( ruleInstName ) )
            // InternalBSharp.g:6997:2: ( ruleInstName )
            {
            // InternalBSharp.g:6997:2: ( ruleInstName )
            // InternalBSharp.g:6998:3: ruleInstName
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
    // InternalBSharp.g:7007:1: rule__Class__SupertypesAssignment_4 : ( ruleSuperTypeList ) ;
    public final void rule__Class__SupertypesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7011:1: ( ( ruleSuperTypeList ) )
            // InternalBSharp.g:7012:2: ( ruleSuperTypeList )
            {
            // InternalBSharp.g:7012:2: ( ruleSuperTypeList )
            // InternalBSharp.g:7013:3: ruleSuperTypeList
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
    // InternalBSharp.g:7022:1: rule__Class__VarListAssignment_5_1 : ( ruleTypedVariableList ) ;
    public final void rule__Class__VarListAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7026:1: ( ( ruleTypedVariableList ) )
            // InternalBSharp.g:7027:2: ( ruleTypedVariableList )
            {
            // InternalBSharp.g:7027:2: ( ruleTypedVariableList )
            // InternalBSharp.g:7028:3: ruleTypedVariableList
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
    // InternalBSharp.g:7037:1: rule__Class__WhereAssignment_6 : ( ruleWhere ) ;
    public final void rule__Class__WhereAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7041:1: ( ( ruleWhere ) )
            // InternalBSharp.g:7042:2: ( ruleWhere )
            {
            // InternalBSharp.g:7042:2: ( ruleWhere )
            // InternalBSharp.g:7043:3: ruleWhere
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
    // InternalBSharp.g:7052:1: rule__Class__BlockAssignment_8 : ( ruleBSharpBlock ) ;
    public final void rule__Class__BlockAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7056:1: ( ( ruleBSharpBlock ) )
            // InternalBSharp.g:7057:2: ( ruleBSharpBlock )
            {
            // InternalBSharp.g:7057:2: ( ruleBSharpBlock )
            // InternalBSharp.g:7058:3: ruleBSharpBlock
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
    // InternalBSharp.g:7067:1: rule__InstName__NameAssignment : ( RULE_ID ) ;
    public final void rule__InstName__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7071:1: ( ( RULE_ID ) )
            // InternalBSharp.g:7072:2: ( RULE_ID )
            {
            // InternalBSharp.g:7072:2: ( RULE_ID )
            // InternalBSharp.g:7073:3: RULE_ID
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
    // InternalBSharp.g:7082:1: rule__PolyContext__PolyTypesAssignment_1 : ( rulePolyType ) ;
    public final void rule__PolyContext__PolyTypesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7086:1: ( ( rulePolyType ) )
            // InternalBSharp.g:7087:2: ( rulePolyType )
            {
            // InternalBSharp.g:7087:2: ( rulePolyType )
            // InternalBSharp.g:7088:3: rulePolyType
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
    // InternalBSharp.g:7097:1: rule__PolyType__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__PolyType__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7101:1: ( ( RULE_ID ) )
            // InternalBSharp.g:7102:2: ( RULE_ID )
            {
            // InternalBSharp.g:7102:2: ( RULE_ID )
            // InternalBSharp.g:7103:3: RULE_ID
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
    // InternalBSharp.g:7112:1: rule__PolyType__SuperTypesAssignment_1_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__PolyType__SuperTypesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7116:1: ( ( ( ruleQualifiedName ) ) )
            // InternalBSharp.g:7117:2: ( ( ruleQualifiedName ) )
            {
            // InternalBSharp.g:7117:2: ( ( ruleQualifiedName ) )
            // InternalBSharp.g:7118:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getPolyTypeAccess().getSuperTypesClassDeclCrossReference_1_1_0()); 
            // InternalBSharp.g:7119:3: ( ruleQualifiedName )
            // InternalBSharp.g:7120:4: ruleQualifiedName
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
    // InternalBSharp.g:7131:1: rule__PolyType__SuperTypesAssignment_1_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__PolyType__SuperTypesAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7135:1: ( ( ( ruleQualifiedName ) ) )
            // InternalBSharp.g:7136:2: ( ( ruleQualifiedName ) )
            {
            // InternalBSharp.g:7136:2: ( ( ruleQualifiedName ) )
            // InternalBSharp.g:7137:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getPolyTypeAccess().getSuperTypesClassDeclCrossReference_1_2_1_0()); 
            // InternalBSharp.g:7138:3: ( ruleQualifiedName )
            // InternalBSharp.g:7139:4: ruleQualifiedName
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
    // InternalBSharp.g:7150:1: rule__SuperTypeList__SuperTypesAssignment_1 : ( ruleConstructedType ) ;
    public final void rule__SuperTypeList__SuperTypesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7154:1: ( ( ruleConstructedType ) )
            // InternalBSharp.g:7155:2: ( ruleConstructedType )
            {
            // InternalBSharp.g:7155:2: ( ruleConstructedType )
            // InternalBSharp.g:7156:3: ruleConstructedType
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
    // InternalBSharp.g:7165:1: rule__SuperTypeList__SuperTypesAssignment_2_1 : ( ruleConstructedType ) ;
    public final void rule__SuperTypeList__SuperTypesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7169:1: ( ( ruleConstructedType ) )
            // InternalBSharp.g:7170:2: ( ruleConstructedType )
            {
            // InternalBSharp.g:7170:2: ( ruleConstructedType )
            // InternalBSharp.g:7171:3: ruleConstructedType
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
    // InternalBSharp.g:7180:1: rule__ConstructedType__ConstructorAssignment_1_1 : ( ruleBuiltinTypeInfixOp ) ;
    public final void rule__ConstructedType__ConstructorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7184:1: ( ( ruleBuiltinTypeInfixOp ) )
            // InternalBSharp.g:7185:2: ( ruleBuiltinTypeInfixOp )
            {
            // InternalBSharp.g:7185:2: ( ruleBuiltinTypeInfixOp )
            // InternalBSharp.g:7186:3: ruleBuiltinTypeInfixOp
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
    // InternalBSharp.g:7195:1: rule__ConstructedType__RightAssignment_1_2 : ( ruleBuilderElem ) ;
    public final void rule__ConstructedType__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7199:1: ( ( ruleBuilderElem ) )
            // InternalBSharp.g:7200:2: ( ruleBuilderElem )
            {
            // InternalBSharp.g:7200:2: ( ruleBuilderElem )
            // InternalBSharp.g:7201:3: ruleBuilderElem
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
    // InternalBSharp.g:7210:1: rule__TypeConstructor__TypeNameAssignment_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__TypeConstructor__TypeNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7214:1: ( ( ( ruleQualifiedName ) ) )
            // InternalBSharp.g:7215:2: ( ( ruleQualifiedName ) )
            {
            // InternalBSharp.g:7215:2: ( ( ruleQualifiedName ) )
            // InternalBSharp.g:7216:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getTypeConstructorAccess().getTypeNameGenNameCrossReference_0_0()); 
            // InternalBSharp.g:7217:3: ( ruleQualifiedName )
            // InternalBSharp.g:7218:4: ruleQualifiedName
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
    // InternalBSharp.g:7229:1: rule__TypeConstructor__ContextAssignment_1 : ( ruleTypeDeclContext ) ;
    public final void rule__TypeConstructor__ContextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7233:1: ( ( ruleTypeDeclContext ) )
            // InternalBSharp.g:7234:2: ( ruleTypeDeclContext )
            {
            // InternalBSharp.g:7234:2: ( ruleTypeDeclContext )
            // InternalBSharp.g:7235:3: ruleTypeDeclContext
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
    // InternalBSharp.g:7244:1: rule__TypePowerSet__ChildAssignment_2 : ( ruleConstructedType ) ;
    public final void rule__TypePowerSet__ChildAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7248:1: ( ( ruleConstructedType ) )
            // InternalBSharp.g:7249:2: ( ruleConstructedType )
            {
            // InternalBSharp.g:7249:2: ( ruleConstructedType )
            // InternalBSharp.g:7250:3: ruleConstructedType
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
    // InternalBSharp.g:7259:1: rule__TypeConstrBracket__ChildAssignment_1 : ( ruleConstructedType ) ;
    public final void rule__TypeConstrBracket__ChildAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7263:1: ( ( ruleConstructedType ) )
            // InternalBSharp.g:7264:2: ( ruleConstructedType )
            {
            // InternalBSharp.g:7264:2: ( ruleConstructedType )
            // InternalBSharp.g:7265:3: ruleConstructedType
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
    // InternalBSharp.g:7274:1: rule__TypeDeclContext__TypeNameAssignment_1 : ( ruleConstructedType ) ;
    public final void rule__TypeDeclContext__TypeNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7278:1: ( ( ruleConstructedType ) )
            // InternalBSharp.g:7279:2: ( ruleConstructedType )
            {
            // InternalBSharp.g:7279:2: ( ruleConstructedType )
            // InternalBSharp.g:7280:3: ruleConstructedType
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
    // InternalBSharp.g:7289:1: rule__TypeDeclContext__TypeNameAssignment_2_1 : ( ruleConstructedType ) ;
    public final void rule__TypeDeclContext__TypeNameAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7293:1: ( ( ruleConstructedType ) )
            // InternalBSharp.g:7294:2: ( ruleConstructedType )
            {
            // InternalBSharp.g:7294:2: ( ruleConstructedType )
            // InternalBSharp.g:7295:3: ruleConstructedType
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
    // InternalBSharp.g:7304:1: rule__Where__ExpressionsAssignment_1 : ( ruleRootExpression ) ;
    public final void rule__Where__ExpressionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7308:1: ( ( ruleRootExpression ) )
            // InternalBSharp.g:7309:2: ( ruleRootExpression )
            {
            // InternalBSharp.g:7309:2: ( ruleRootExpression )
            // InternalBSharp.g:7310:3: ruleRootExpression
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
    // InternalBSharp.g:7319:1: rule__Where__ExpressionsAssignment_2_1 : ( ruleRootExpression ) ;
    public final void rule__Where__ExpressionsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7323:1: ( ( ruleRootExpression ) )
            // InternalBSharp.g:7324:2: ( ruleRootExpression )
            {
            // InternalBSharp.g:7324:2: ( ruleRootExpression )
            // InternalBSharp.g:7325:3: ruleRootExpression
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
    // InternalBSharp.g:7334:1: rule__Datatype__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Datatype__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7338:1: ( ( RULE_ID ) )
            // InternalBSharp.g:7339:2: ( RULE_ID )
            {
            // InternalBSharp.g:7339:2: ( RULE_ID )
            // InternalBSharp.g:7340:3: RULE_ID
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
    // InternalBSharp.g:7349:1: rule__Datatype__ContextAssignment_2 : ( rulePolyContext ) ;
    public final void rule__Datatype__ContextAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7353:1: ( ( rulePolyContext ) )
            // InternalBSharp.g:7354:2: ( rulePolyContext )
            {
            // InternalBSharp.g:7354:2: ( rulePolyContext )
            // InternalBSharp.g:7355:3: rulePolyContext
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
    // InternalBSharp.g:7364:1: rule__Datatype__ConstructorsAssignment_3_1 : ( ruleDatatypeConstructor ) ;
    public final void rule__Datatype__ConstructorsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7368:1: ( ( ruleDatatypeConstructor ) )
            // InternalBSharp.g:7369:2: ( ruleDatatypeConstructor )
            {
            // InternalBSharp.g:7369:2: ( ruleDatatypeConstructor )
            // InternalBSharp.g:7370:3: ruleDatatypeConstructor
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
    // InternalBSharp.g:7379:1: rule__Datatype__BlockAssignment_4 : ( ruleBSharpBlock ) ;
    public final void rule__Datatype__BlockAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7383:1: ( ( ruleBSharpBlock ) )
            // InternalBSharp.g:7384:2: ( ruleBSharpBlock )
            {
            // InternalBSharp.g:7384:2: ( ruleBSharpBlock )
            // InternalBSharp.g:7385:3: ruleBSharpBlock
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
    // InternalBSharp.g:7394:1: rule__DatatypeConstructor__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__DatatypeConstructor__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7398:1: ( ( RULE_ID ) )
            // InternalBSharp.g:7399:2: ( RULE_ID )
            {
            // InternalBSharp.g:7399:2: ( RULE_ID )
            // InternalBSharp.g:7400:3: RULE_ID
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
    // InternalBSharp.g:7409:1: rule__DatatypeConstructor__DeconsAssignment_1_1 : ( ruleTypedVariableList ) ;
    public final void rule__DatatypeConstructor__DeconsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7413:1: ( ( ruleTypedVariableList ) )
            // InternalBSharp.g:7414:2: ( ruleTypedVariableList )
            {
            // InternalBSharp.g:7414:2: ( ruleTypedVariableList )
            // InternalBSharp.g:7415:3: ruleTypedVariableList
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
    // InternalBSharp.g:7424:1: rule__Extend__ExtendedClassAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Extend__ExtendedClassAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7428:1: ( ( ( ruleQualifiedName ) ) )
            // InternalBSharp.g:7429:2: ( ( ruleQualifiedName ) )
            {
            // InternalBSharp.g:7429:2: ( ( ruleQualifiedName ) )
            // InternalBSharp.g:7430:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getExtendAccess().getExtendedClassClassDeclCrossReference_1_0()); 
            // InternalBSharp.g:7431:3: ( ruleQualifiedName )
            // InternalBSharp.g:7432:4: ruleQualifiedName
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
    // InternalBSharp.g:7443:1: rule__Extend__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Extend__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7447:1: ( ( RULE_ID ) )
            // InternalBSharp.g:7448:2: ( RULE_ID )
            {
            // InternalBSharp.g:7448:2: ( RULE_ID )
            // InternalBSharp.g:7449:3: RULE_ID
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
    // InternalBSharp.g:7458:1: rule__Extend__BlockAssignment_5 : ( ruleBSharpBlock ) ;
    public final void rule__Extend__BlockAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7462:1: ( ( ruleBSharpBlock ) )
            // InternalBSharp.g:7463:2: ( ruleBSharpBlock )
            {
            // InternalBSharp.g:7463:2: ( ruleBSharpBlock )
            // InternalBSharp.g:7464:3: ruleBSharpBlock
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
    // InternalBSharp.g:7473:1: rule__BSharpBlock__FunctionsAssignment_2_0 : ( ruleFunctionDecl ) ;
    public final void rule__BSharpBlock__FunctionsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7477:1: ( ( ruleFunctionDecl ) )
            // InternalBSharp.g:7478:2: ( ruleFunctionDecl )
            {
            // InternalBSharp.g:7478:2: ( ruleFunctionDecl )
            // InternalBSharp.g:7479:3: ruleFunctionDecl
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
    // InternalBSharp.g:7488:1: rule__BSharpBlock__TheoremsAssignment_2_1 : ( ruleTheoremBody ) ;
    public final void rule__BSharpBlock__TheoremsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7492:1: ( ( ruleTheoremBody ) )
            // InternalBSharp.g:7493:2: ( ruleTheoremBody )
            {
            // InternalBSharp.g:7493:2: ( ruleTheoremBody )
            // InternalBSharp.g:7494:3: ruleTheoremBody
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


    // $ANTLR start "rule__BSharpBlock__InstancesAssignment_2_2"
    // InternalBSharp.g:7503:1: rule__BSharpBlock__InstancesAssignment_2_2 : ( ruleInstance ) ;
    public final void rule__BSharpBlock__InstancesAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7507:1: ( ( ruleInstance ) )
            // InternalBSharp.g:7508:2: ( ruleInstance )
            {
            // InternalBSharp.g:7508:2: ( ruleInstance )
            // InternalBSharp.g:7509:3: ruleInstance
            {
             before(grammarAccess.getBSharpBlockAccess().getInstancesInstanceParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleInstance();

            state._fsp--;

             after(grammarAccess.getBSharpBlockAccess().getInstancesInstanceParserRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSharpBlock__InstancesAssignment_2_2"


    // $ANTLR start "rule__FunctionDecl__NameAssignment_0"
    // InternalBSharp.g:7518:1: rule__FunctionDecl__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__FunctionDecl__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7522:1: ( ( RULE_ID ) )
            // InternalBSharp.g:7523:2: ( RULE_ID )
            {
            // InternalBSharp.g:7523:2: ( RULE_ID )
            // InternalBSharp.g:7524:3: RULE_ID
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
    // InternalBSharp.g:7533:1: rule__FunctionDecl__ContextAssignment_1 : ( rulePolyContext ) ;
    public final void rule__FunctionDecl__ContextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7537:1: ( ( rulePolyContext ) )
            // InternalBSharp.g:7538:2: ( rulePolyContext )
            {
            // InternalBSharp.g:7538:2: ( rulePolyContext )
            // InternalBSharp.g:7539:3: rulePolyContext
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
    // InternalBSharp.g:7548:1: rule__FunctionDecl__VarListAssignment_3 : ( ruleTypedVariableList ) ;
    public final void rule__FunctionDecl__VarListAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7552:1: ( ( ruleTypedVariableList ) )
            // InternalBSharp.g:7553:2: ( ruleTypedVariableList )
            {
            // InternalBSharp.g:7553:2: ( ruleTypedVariableList )
            // InternalBSharp.g:7554:3: ruleTypedVariableList
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
    // InternalBSharp.g:7563:1: rule__FunctionDecl__ReturnTypeAssignment_6 : ( ruleTypeConstructor ) ;
    public final void rule__FunctionDecl__ReturnTypeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7567:1: ( ( ruleTypeConstructor ) )
            // InternalBSharp.g:7568:2: ( ruleTypeConstructor )
            {
            // InternalBSharp.g:7568:2: ( ruleTypeConstructor )
            // InternalBSharp.g:7569:3: ruleTypeConstructor
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
    // InternalBSharp.g:7578:1: rule__FunctionDecl__InfixAssignment_7 : ( ( 'INFIX' ) ) ;
    public final void rule__FunctionDecl__InfixAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7582:1: ( ( ( 'INFIX' ) ) )
            // InternalBSharp.g:7583:2: ( ( 'INFIX' ) )
            {
            // InternalBSharp.g:7583:2: ( ( 'INFIX' ) )
            // InternalBSharp.g:7584:3: ( 'INFIX' )
            {
             before(grammarAccess.getFunctionDeclAccess().getInfixINFIXKeyword_7_0()); 
            // InternalBSharp.g:7585:3: ( 'INFIX' )
            // InternalBSharp.g:7586:4: 'INFIX'
            {
             before(grammarAccess.getFunctionDeclAccess().getInfixINFIXKeyword_7_0()); 
            match(input,56,FOLLOW_2); 
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
    // InternalBSharp.g:7597:1: rule__FunctionDecl__PrecedenceAssignment_8 : ( RULE_INT ) ;
    public final void rule__FunctionDecl__PrecedenceAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7601:1: ( ( RULE_INT ) )
            // InternalBSharp.g:7602:2: ( RULE_INT )
            {
            // InternalBSharp.g:7602:2: ( RULE_INT )
            // InternalBSharp.g:7603:3: RULE_INT
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
    // InternalBSharp.g:7612:1: rule__FunctionDecl__ExprAssignment_9 : ( ruleRootExpression ) ;
    public final void rule__FunctionDecl__ExprAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7616:1: ( ( ruleRootExpression ) )
            // InternalBSharp.g:7617:2: ( ruleRootExpression )
            {
            // InternalBSharp.g:7617:2: ( ruleRootExpression )
            // InternalBSharp.g:7618:3: ruleRootExpression
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
    // InternalBSharp.g:7627:1: rule__MatchStatement__MatchAssignment_1 : ( ruleRootExpression ) ;
    public final void rule__MatchStatement__MatchAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7631:1: ( ( ruleRootExpression ) )
            // InternalBSharp.g:7632:2: ( ruleRootExpression )
            {
            // InternalBSharp.g:7632:2: ( ruleRootExpression )
            // InternalBSharp.g:7633:3: ruleRootExpression
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
    // InternalBSharp.g:7642:1: rule__MatchStatement__InductCaseAssignment_3 : ( ruleMatchCase ) ;
    public final void rule__MatchStatement__InductCaseAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7646:1: ( ( ruleMatchCase ) )
            // InternalBSharp.g:7647:2: ( ruleMatchCase )
            {
            // InternalBSharp.g:7647:2: ( ruleMatchCase )
            // InternalBSharp.g:7648:3: ruleMatchCase
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
    // InternalBSharp.g:7657:1: rule__MatchStatement__InductCaseAssignment_4 : ( ruleMatchCase ) ;
    public final void rule__MatchStatement__InductCaseAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7661:1: ( ( ruleMatchCase ) )
            // InternalBSharp.g:7662:2: ( ruleMatchCase )
            {
            // InternalBSharp.g:7662:2: ( ruleMatchCase )
            // InternalBSharp.g:7663:3: ruleMatchCase
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
    // InternalBSharp.g:7672:1: rule__MatchCase__DeconNameAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__MatchCase__DeconNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7676:1: ( ( ( RULE_ID ) ) )
            // InternalBSharp.g:7677:2: ( ( RULE_ID ) )
            {
            // InternalBSharp.g:7677:2: ( ( RULE_ID ) )
            // InternalBSharp.g:7678:3: ( RULE_ID )
            {
             before(grammarAccess.getMatchCaseAccess().getDeconNameDatatypeConstructorCrossReference_1_0()); 
            // InternalBSharp.g:7679:3: ( RULE_ID )
            // InternalBSharp.g:7680:4: RULE_ID
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
    // InternalBSharp.g:7691:1: rule__MatchCase__VariablesAssignment_2_1 : ( ruleTypedVariable ) ;
    public final void rule__MatchCase__VariablesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7695:1: ( ( ruleTypedVariable ) )
            // InternalBSharp.g:7696:2: ( ruleTypedVariable )
            {
            // InternalBSharp.g:7696:2: ( ruleTypedVariable )
            // InternalBSharp.g:7697:3: ruleTypedVariable
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
    // InternalBSharp.g:7706:1: rule__MatchCase__VariablesAssignment_2_2_1 : ( ruleTypedVariable ) ;
    public final void rule__MatchCase__VariablesAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7710:1: ( ( ruleTypedVariable ) )
            // InternalBSharp.g:7711:2: ( ruleTypedVariable )
            {
            // InternalBSharp.g:7711:2: ( ruleTypedVariable )
            // InternalBSharp.g:7712:3: ruleTypedVariable
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
    // InternalBSharp.g:7721:1: rule__MatchCase__ExprAssignment_4 : ( ruleRootExpression ) ;
    public final void rule__MatchCase__ExprAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7725:1: ( ( ruleRootExpression ) )
            // InternalBSharp.g:7726:2: ( ruleRootExpression )
            {
            // InternalBSharp.g:7726:2: ( ruleRootExpression )
            // InternalBSharp.g:7727:3: ruleRootExpression
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
    // InternalBSharp.g:7736:1: rule__TheoremBody__TheoremDeclAssignment_2 : ( ruleTheoremDecl ) ;
    public final void rule__TheoremBody__TheoremDeclAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7740:1: ( ( ruleTheoremDecl ) )
            // InternalBSharp.g:7741:2: ( ruleTheoremDecl )
            {
            // InternalBSharp.g:7741:2: ( ruleTheoremDecl )
            // InternalBSharp.g:7742:3: ruleTheoremDecl
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
    // InternalBSharp.g:7751:1: rule__TheoremDecl__NameAssignment_0 : ( ruleTHM_NAME ) ;
    public final void rule__TheoremDecl__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7755:1: ( ( ruleTHM_NAME ) )
            // InternalBSharp.g:7756:2: ( ruleTHM_NAME )
            {
            // InternalBSharp.g:7756:2: ( ruleTHM_NAME )
            // InternalBSharp.g:7757:3: ruleTHM_NAME
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
    // InternalBSharp.g:7766:1: rule__TheoremDecl__ExprAssignment_1 : ( ruleRootExpression ) ;
    public final void rule__TheoremDecl__ExprAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7770:1: ( ( ruleRootExpression ) )
            // InternalBSharp.g:7771:2: ( ruleRootExpression )
            {
            // InternalBSharp.g:7771:2: ( ruleRootExpression )
            // InternalBSharp.g:7772:3: ruleRootExpression
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
    // InternalBSharp.g:7781:1: rule__TypedVariableList__VariablesOfTypeAssignment_0 : ( ruleVariableTyping ) ;
    public final void rule__TypedVariableList__VariablesOfTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7785:1: ( ( ruleVariableTyping ) )
            // InternalBSharp.g:7786:2: ( ruleVariableTyping )
            {
            // InternalBSharp.g:7786:2: ( ruleVariableTyping )
            // InternalBSharp.g:7787:3: ruleVariableTyping
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
    // InternalBSharp.g:7796:1: rule__TypedVariableList__VariablesOfTypeAssignment_1_1 : ( ruleVariableTyping ) ;
    public final void rule__TypedVariableList__VariablesOfTypeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7800:1: ( ( ruleVariableTyping ) )
            // InternalBSharp.g:7801:2: ( ruleVariableTyping )
            {
            // InternalBSharp.g:7801:2: ( ruleVariableTyping )
            // InternalBSharp.g:7802:3: ruleVariableTyping
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
    // InternalBSharp.g:7811:1: rule__VariableTyping__TypeVarAssignment_0 : ( ruleTypedVariable ) ;
    public final void rule__VariableTyping__TypeVarAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7815:1: ( ( ruleTypedVariable ) )
            // InternalBSharp.g:7816:2: ( ruleTypedVariable )
            {
            // InternalBSharp.g:7816:2: ( ruleTypedVariable )
            // InternalBSharp.g:7817:3: ruleTypedVariable
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
    // InternalBSharp.g:7826:1: rule__VariableTyping__TypeVarAssignment_1_1 : ( ruleTypedVariable ) ;
    public final void rule__VariableTyping__TypeVarAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7830:1: ( ( ruleTypedVariable ) )
            // InternalBSharp.g:7831:2: ( ruleTypedVariable )
            {
            // InternalBSharp.g:7831:2: ( ruleTypedVariable )
            // InternalBSharp.g:7832:3: ruleTypedVariable
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
    // InternalBSharp.g:7841:1: rule__VariableTyping__TypeAssignment_3 : ( ruleConstructedType ) ;
    public final void rule__VariableTyping__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7845:1: ( ( ruleConstructedType ) )
            // InternalBSharp.g:7846:2: ( ruleConstructedType )
            {
            // InternalBSharp.g:7846:2: ( ruleConstructedType )
            // InternalBSharp.g:7847:3: ruleConstructedType
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
    // InternalBSharp.g:7856:1: rule__TypedVariable__NameAssignment : ( RULE_ID ) ;
    public final void rule__TypedVariable__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7860:1: ( ( RULE_ID ) )
            // InternalBSharp.g:7861:2: ( RULE_ID )
            {
            // InternalBSharp.g:7861:2: ( RULE_ID )
            // InternalBSharp.g:7862:3: RULE_ID
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
    // InternalBSharp.g:7871:1: rule__Lambda__QTypeAssignment_0 : ( ( '\\u03BB' ) ) ;
    public final void rule__Lambda__QTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7875:1: ( ( ( '\\u03BB' ) ) )
            // InternalBSharp.g:7876:2: ( ( '\\u03BB' ) )
            {
            // InternalBSharp.g:7876:2: ( ( '\\u03BB' ) )
            // InternalBSharp.g:7877:3: ( '\\u03BB' )
            {
             before(grammarAccess.getLambdaAccess().getQTypeGreekSmallLetterLamdaKeyword_0_0()); 
            // InternalBSharp.g:7878:3: ( '\\u03BB' )
            // InternalBSharp.g:7879:4: '\\u03BB'
            {
             before(grammarAccess.getLambdaAccess().getQTypeGreekSmallLetterLamdaKeyword_0_0()); 
            match(input,57,FOLLOW_2); 
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
    // InternalBSharp.g:7890:1: rule__Lambda__ContextAssignment_1 : ( rulePolyContext ) ;
    public final void rule__Lambda__ContextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7894:1: ( ( rulePolyContext ) )
            // InternalBSharp.g:7895:2: ( rulePolyContext )
            {
            // InternalBSharp.g:7895:2: ( rulePolyContext )
            // InternalBSharp.g:7896:3: rulePolyContext
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
    // InternalBSharp.g:7905:1: rule__Lambda__VarListAssignment_2 : ( ruleTypedVariableList ) ;
    public final void rule__Lambda__VarListAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7909:1: ( ( ruleTypedVariableList ) )
            // InternalBSharp.g:7910:2: ( ruleTypedVariableList )
            {
            // InternalBSharp.g:7910:2: ( ruleTypedVariableList )
            // InternalBSharp.g:7911:3: ruleTypedVariableList
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
    // InternalBSharp.g:7920:1: rule__Lambda__ExprAssignment_4 : ( ruleRootExpression ) ;
    public final void rule__Lambda__ExprAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7924:1: ( ( ruleRootExpression ) )
            // InternalBSharp.g:7925:2: ( ruleRootExpression )
            {
            // InternalBSharp.g:7925:2: ( ruleRootExpression )
            // InternalBSharp.g:7926:3: ruleRootExpression
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
    // InternalBSharp.g:7935:1: rule__Quantifier__QTypeAssignment_0 : ( ( rule__Quantifier__QTypeAlternatives_0_0 ) ) ;
    public final void rule__Quantifier__QTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7939:1: ( ( ( rule__Quantifier__QTypeAlternatives_0_0 ) ) )
            // InternalBSharp.g:7940:2: ( ( rule__Quantifier__QTypeAlternatives_0_0 ) )
            {
            // InternalBSharp.g:7940:2: ( ( rule__Quantifier__QTypeAlternatives_0_0 ) )
            // InternalBSharp.g:7941:3: ( rule__Quantifier__QTypeAlternatives_0_0 )
            {
             before(grammarAccess.getQuantifierAccess().getQTypeAlternatives_0_0()); 
            // InternalBSharp.g:7942:3: ( rule__Quantifier__QTypeAlternatives_0_0 )
            // InternalBSharp.g:7942:4: rule__Quantifier__QTypeAlternatives_0_0
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
    // InternalBSharp.g:7950:1: rule__Quantifier__ContextAssignment_1 : ( rulePolyContext ) ;
    public final void rule__Quantifier__ContextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7954:1: ( ( rulePolyContext ) )
            // InternalBSharp.g:7955:2: ( rulePolyContext )
            {
            // InternalBSharp.g:7955:2: ( rulePolyContext )
            // InternalBSharp.g:7956:3: rulePolyContext
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
    // InternalBSharp.g:7965:1: rule__Quantifier__VarListAssignment_2 : ( ruleTypedVariableList ) ;
    public final void rule__Quantifier__VarListAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7969:1: ( ( ruleTypedVariableList ) )
            // InternalBSharp.g:7970:2: ( ruleTypedVariableList )
            {
            // InternalBSharp.g:7970:2: ( ruleTypedVariableList )
            // InternalBSharp.g:7971:3: ruleTypedVariableList
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
    // InternalBSharp.g:7980:1: rule__Quantifier__ExprAssignment_4 : ( ruleRootExpression ) ;
    public final void rule__Quantifier__ExprAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7984:1: ( ( ruleRootExpression ) )
            // InternalBSharp.g:7985:2: ( ruleRootExpression )
            {
            // InternalBSharp.g:7985:2: ( ruleRootExpression )
            // InternalBSharp.g:7986:3: ruleRootExpression
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
    // InternalBSharp.g:7995:1: rule__Prefix__NameAssignment_0 : ( rulePrefixBuiltIn ) ;
    public final void rule__Prefix__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:7999:1: ( ( rulePrefixBuiltIn ) )
            // InternalBSharp.g:8000:2: ( rulePrefixBuiltIn )
            {
            // InternalBSharp.g:8000:2: ( rulePrefixBuiltIn )
            // InternalBSharp.g:8001:3: rulePrefixBuiltIn
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
    // InternalBSharp.g:8010:1: rule__Prefix__ElemAssignment_1 : ( ruleElement ) ;
    public final void rule__Prefix__ElemAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8014:1: ( ( ruleElement ) )
            // InternalBSharp.g:8015:2: ( ruleElement )
            {
            // InternalBSharp.g:8015:2: ( ruleElement )
            // InternalBSharp.g:8016:3: ruleElement
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
    // InternalBSharp.g:8025:1: rule__Infix__FuncNameAssignment_1_1_0 : ( ( RULE_ID ) ) ;
    public final void rule__Infix__FuncNameAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8029:1: ( ( ( RULE_ID ) ) )
            // InternalBSharp.g:8030:2: ( ( RULE_ID ) )
            {
            // InternalBSharp.g:8030:2: ( ( RULE_ID ) )
            // InternalBSharp.g:8031:3: ( RULE_ID )
            {
             before(grammarAccess.getInfixAccess().getFuncNameFunctionDeclCrossReference_1_1_0_0()); 
            // InternalBSharp.g:8032:3: ( RULE_ID )
            // InternalBSharp.g:8033:4: RULE_ID
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
    // InternalBSharp.g:8044:1: rule__Infix__OpNameAssignment_1_1_1 : ( ruleInbuiltInfix ) ;
    public final void rule__Infix__OpNameAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8048:1: ( ( ruleInbuiltInfix ) )
            // InternalBSharp.g:8049:2: ( ruleInbuiltInfix )
            {
            // InternalBSharp.g:8049:2: ( ruleInbuiltInfix )
            // InternalBSharp.g:8050:3: ruleInbuiltInfix
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
    // InternalBSharp.g:8059:1: rule__Infix__RightAssignment_1_2 : ( ruleElement ) ;
    public final void rule__Infix__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8063:1: ( ( ruleElement ) )
            // InternalBSharp.g:8064:2: ( ruleElement )
            {
            // InternalBSharp.g:8064:2: ( ruleElement )
            // InternalBSharp.g:8065:3: ruleElement
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
    // InternalBSharp.g:8074:1: rule__Bracket__ChildAssignment_1 : ( ruleRootExpression ) ;
    public final void rule__Bracket__ChildAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8078:1: ( ( ruleRootExpression ) )
            // InternalBSharp.g:8079:2: ( ruleRootExpression )
            {
            // InternalBSharp.g:8079:2: ( ruleRootExpression )
            // InternalBSharp.g:8080:3: ruleRootExpression
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
    // InternalBSharp.g:8089:1: rule__FunctionCall__TypeInstAssignment_0_0 : ( ( RULE_ID ) ) ;
    public final void rule__FunctionCall__TypeInstAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8093:1: ( ( ( RULE_ID ) ) )
            // InternalBSharp.g:8094:2: ( ( RULE_ID ) )
            {
            // InternalBSharp.g:8094:2: ( ( RULE_ID ) )
            // InternalBSharp.g:8095:3: ( RULE_ID )
            {
             before(grammarAccess.getFunctionCallAccess().getTypeInstExpressionVariableCrossReference_0_0_0()); 
            // InternalBSharp.g:8096:3: ( RULE_ID )
            // InternalBSharp.g:8097:4: RULE_ID
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
    // InternalBSharp.g:8108:1: rule__FunctionCall__ClassVarDeclAssignment_0_1 : ( ruleClassVarDecl ) ;
    public final void rule__FunctionCall__ClassVarDeclAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8112:1: ( ( ruleClassVarDecl ) )
            // InternalBSharp.g:8113:2: ( ruleClassVarDecl )
            {
            // InternalBSharp.g:8113:2: ( ruleClassVarDecl )
            // InternalBSharp.g:8114:3: ruleClassVarDecl
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


    // $ANTLR start "rule__FunctionCall__ContextAssignment_1_0"
    // InternalBSharp.g:8123:1: rule__FunctionCall__ContextAssignment_1_0 : ( ruleTypeDeclContext ) ;
    public final void rule__FunctionCall__ContextAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8127:1: ( ( ruleTypeDeclContext ) )
            // InternalBSharp.g:8128:2: ( ruleTypeDeclContext )
            {
            // InternalBSharp.g:8128:2: ( ruleTypeDeclContext )
            // InternalBSharp.g:8129:3: ruleTypeDeclContext
            {
             before(grammarAccess.getFunctionCallAccess().getContextTypeDeclContextParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTypeDeclContext();

            state._fsp--;

             after(grammarAccess.getFunctionCallAccess().getContextTypeDeclContextParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__ContextAssignment_1_0"


    // $ANTLR start "rule__FunctionCall__ArgumentsAssignment_1_2"
    // InternalBSharp.g:8138:1: rule__FunctionCall__ArgumentsAssignment_1_2 : ( ruleRootExpression ) ;
    public final void rule__FunctionCall__ArgumentsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8142:1: ( ( ruleRootExpression ) )
            // InternalBSharp.g:8143:2: ( ruleRootExpression )
            {
            // InternalBSharp.g:8143:2: ( ruleRootExpression )
            // InternalBSharp.g:8144:3: ruleRootExpression
            {
             before(grammarAccess.getFunctionCallAccess().getArgumentsRootExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRootExpression();

            state._fsp--;

             after(grammarAccess.getFunctionCallAccess().getArgumentsRootExpressionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__ArgumentsAssignment_1_2"


    // $ANTLR start "rule__FunctionCall__ArgumentsAssignment_1_3_1"
    // InternalBSharp.g:8153:1: rule__FunctionCall__ArgumentsAssignment_1_3_1 : ( ruleRootExpression ) ;
    public final void rule__FunctionCall__ArgumentsAssignment_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8157:1: ( ( ruleRootExpression ) )
            // InternalBSharp.g:8158:2: ( ruleRootExpression )
            {
            // InternalBSharp.g:8158:2: ( ruleRootExpression )
            // InternalBSharp.g:8159:3: ruleRootExpression
            {
             before(grammarAccess.getFunctionCallAccess().getArgumentsRootExpressionParserRuleCall_1_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRootExpression();

            state._fsp--;

             after(grammarAccess.getFunctionCallAccess().getArgumentsRootExpressionParserRuleCall_1_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__ArgumentsAssignment_1_3_1"


    // $ANTLR start "rule__ClassVarDecl__OwnerTypeAssignment_0"
    // InternalBSharp.g:8168:1: rule__ClassVarDecl__OwnerTypeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__ClassVarDecl__OwnerTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8172:1: ( ( ( RULE_ID ) ) )
            // InternalBSharp.g:8173:2: ( ( RULE_ID ) )
            {
            // InternalBSharp.g:8173:2: ( ( RULE_ID ) )
            // InternalBSharp.g:8174:3: ( RULE_ID )
            {
             before(grammarAccess.getClassVarDeclAccess().getOwnerTypeGenNameCrossReference_0_0()); 
            // InternalBSharp.g:8175:3: ( RULE_ID )
            // InternalBSharp.g:8176:4: RULE_ID
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
    // InternalBSharp.g:8187:1: rule__ClassVarDecl__TypeInstAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__ClassVarDecl__TypeInstAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8191:1: ( ( ( RULE_ID ) ) )
            // InternalBSharp.g:8192:2: ( ( RULE_ID ) )
            {
            // InternalBSharp.g:8192:2: ( ( RULE_ID ) )
            // InternalBSharp.g:8193:3: ( RULE_ID )
            {
             before(grammarAccess.getClassVarDeclAccess().getTypeInstExpressionVariableCrossReference_2_0()); 
            // InternalBSharp.g:8194:3: ( RULE_ID )
            // InternalBSharp.g:8195:4: RULE_ID
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
    // InternalBSharp.g:8206:1: rule__Instance__ClassNameAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Instance__ClassNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8210:1: ( ( ( ruleQualifiedName ) ) )
            // InternalBSharp.g:8211:2: ( ( ruleQualifiedName ) )
            {
            // InternalBSharp.g:8211:2: ( ( ruleQualifiedName ) )
            // InternalBSharp.g:8212:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getInstanceAccess().getClassNameClassDeclCrossReference_1_0()); 
            // InternalBSharp.g:8213:3: ( ruleQualifiedName )
            // InternalBSharp.g:8214:4: ruleQualifiedName
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
    // InternalBSharp.g:8225:1: rule__Instance__ContextAssignment_2 : ( ruleTypeDeclContext ) ;
    public final void rule__Instance__ContextAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8229:1: ( ( ruleTypeDeclContext ) )
            // InternalBSharp.g:8230:2: ( ruleTypeDeclContext )
            {
            // InternalBSharp.g:8230:2: ( ruleTypeDeclContext )
            // InternalBSharp.g:8231:3: ruleTypeDeclContext
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
    // InternalBSharp.g:8240:1: rule__Instance__ArgumentsAssignment_4 : ( ruleRootExpression ) ;
    public final void rule__Instance__ArgumentsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8244:1: ( ( ruleRootExpression ) )
            // InternalBSharp.g:8245:2: ( ruleRootExpression )
            {
            // InternalBSharp.g:8245:2: ( ruleRootExpression )
            // InternalBSharp.g:8246:3: ruleRootExpression
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
    // InternalBSharp.g:8255:1: rule__Instance__ArgumentsAssignment_5_1 : ( ruleRootExpression ) ;
    public final void rule__Instance__ArgumentsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8259:1: ( ( ruleRootExpression ) )
            // InternalBSharp.g:8260:2: ( ruleRootExpression )
            {
            // InternalBSharp.g:8260:2: ( ruleRootExpression )
            // InternalBSharp.g:8261:3: ruleRootExpression
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


    // $ANTLR start "rule__Instance__NameAssignment_7"
    // InternalBSharp.g:8270:1: rule__Instance__NameAssignment_7 : ( RULE_ID ) ;
    public final void rule__Instance__NameAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBSharp.g:8274:1: ( ( RULE_ID ) )
            // InternalBSharp.g:8275:2: ( RULE_ID )
            {
            // InternalBSharp.g:8275:2: ( RULE_ID )
            // InternalBSharp.g:8276:3: RULE_ID
            {
             before(grammarAccess.getInstanceAccess().getNameIDTerminalRuleCall_7_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInstanceAccess().getNameIDTerminalRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__NameAssignment_7"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0002801000000002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0002801C00000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000072L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0002801000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000001020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000044000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0004412100000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000210000000020L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00000000007FE000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00000000007FE002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0210010001800820L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0001040000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0001040000000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x00A8000000000020L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x00A0000000000022L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000050000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000020000000020L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0310010001800830L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0009000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000010100000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000120000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000100100000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000040000000020L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000010000000820L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x000000007E000020L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x000000007E000022L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0210130001800820L});

}