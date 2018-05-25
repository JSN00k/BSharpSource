package org.xtext.sampleProj.mydsl.ide.contentassist.antlr.internal;

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
import org.xtext.sampleProj.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'\\u00AC'", "'Pred'", "'\\u00D7'", "'\\u2192'", "'\\uE102'", "'\\uE100'", "'\\u2194'", "'\\u2916'", "'\\u21F8'", "'\\u21A3'", "'\\u2900'", "'\\u21A0'", "'\\u2200'", "'\\u2203'", "'\\u21D4'", "'\\u21D2'", "'='", "'\\u2260'", "'\\u2227'", "'\\u2228'", "'^'", "':'", "'Import'", "'.'", "'Class'", "';'", "'{'", "'}'", "'<'", "'>'", "','", "'('", "')'", "'where'", "'Datatype'", "'|'", "'Extend'", "'match'", "'Theorems'", "'\\u00B7'", "'Instance'", "'INFIX'", "'\\u03BB'"
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
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
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
    public static final int RULE_WS=9;
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


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }


    	private MyDslGrammarAccess grammarAccess;

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleDomainModel"
    // InternalMyDsl.g:53:1: entryRuleDomainModel : ruleDomainModel EOF ;
    public final void entryRuleDomainModel() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleDomainModel EOF )
            // InternalMyDsl.g:55:1: ruleDomainModel EOF
            {
             before(grammarAccess.getDomainModelRule()); 
            pushFollow(FOLLOW_1);
            ruleDomainModel();

            state._fsp--;

             after(grammarAccess.getDomainModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDomainModel"


    // $ANTLR start "ruleDomainModel"
    // InternalMyDsl.g:62:1: ruleDomainModel : ( ( rule__DomainModel__ElementsAssignment )* ) ;
    public final void ruleDomainModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__DomainModel__ElementsAssignment )* ) )
            // InternalMyDsl.g:67:2: ( ( rule__DomainModel__ElementsAssignment )* )
            {
            // InternalMyDsl.g:67:2: ( ( rule__DomainModel__ElementsAssignment )* )
            // InternalMyDsl.g:68:3: ( rule__DomainModel__ElementsAssignment )*
            {
             before(grammarAccess.getDomainModelAccess().getElementsAssignment()); 
            // InternalMyDsl.g:69:3: ( rule__DomainModel__ElementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==33||LA1_0==35||LA1_0==45||LA1_0==47||LA1_0==51) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:69:4: rule__DomainModel__ElementsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__DomainModel__ElementsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getDomainModelAccess().getElementsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDomainModel"


    // $ANTLR start "entryRuleTHM_NAME"
    // InternalMyDsl.g:78:1: entryRuleTHM_NAME : ruleTHM_NAME EOF ;
    public final void entryRuleTHM_NAME() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleTHM_NAME EOF )
            // InternalMyDsl.g:80:1: ruleTHM_NAME EOF
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
    // InternalMyDsl.g:87:1: ruleTHM_NAME : ( ( rule__THM_NAME__Group__0 ) ) ;
    public final void ruleTHM_NAME() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__THM_NAME__Group__0 ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__THM_NAME__Group__0 ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__THM_NAME__Group__0 ) )
            // InternalMyDsl.g:93:3: ( rule__THM_NAME__Group__0 )
            {
             before(grammarAccess.getTHM_NAMEAccess().getGroup()); 
            // InternalMyDsl.g:94:3: ( rule__THM_NAME__Group__0 )
            // InternalMyDsl.g:94:4: rule__THM_NAME__Group__0
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


    // $ANTLR start "entryRuleTopLevel"
    // InternalMyDsl.g:103:1: entryRuleTopLevel : ruleTopLevel EOF ;
    public final void entryRuleTopLevel() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleTopLevel EOF )
            // InternalMyDsl.g:105:1: ruleTopLevel EOF
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
    // InternalMyDsl.g:112:1: ruleTopLevel : ( ( rule__TopLevel__Alternatives ) ) ;
    public final void ruleTopLevel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__TopLevel__Alternatives ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__TopLevel__Alternatives ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__TopLevel__Alternatives ) )
            // InternalMyDsl.g:118:3: ( rule__TopLevel__Alternatives )
            {
             before(grammarAccess.getTopLevelAccess().getAlternatives()); 
            // InternalMyDsl.g:119:3: ( rule__TopLevel__Alternatives )
            // InternalMyDsl.g:119:4: rule__TopLevel__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TopLevel__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTopLevelAccess().getAlternatives()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleImportStatement"
    // InternalMyDsl.g:128:1: entryRuleImportStatement : ruleImportStatement EOF ;
    public final void entryRuleImportStatement() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleImportStatement EOF )
            // InternalMyDsl.g:130:1: ruleImportStatement EOF
            {
             before(grammarAccess.getImportStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleImportStatement();

            state._fsp--;

             after(grammarAccess.getImportStatementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleImportStatement"


    // $ANTLR start "ruleImportStatement"
    // InternalMyDsl.g:137:1: ruleImportStatement : ( ( rule__ImportStatement__Group__0 ) ) ;
    public final void ruleImportStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__ImportStatement__Group__0 ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__ImportStatement__Group__0 ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__ImportStatement__Group__0 ) )
            // InternalMyDsl.g:143:3: ( rule__ImportStatement__Group__0 )
            {
             before(grammarAccess.getImportStatementAccess().getGroup()); 
            // InternalMyDsl.g:144:3: ( rule__ImportStatement__Group__0 )
            // InternalMyDsl.g:144:4: rule__ImportStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ImportStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImportStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImportStatement"


    // $ANTLR start "entryRuleImport"
    // InternalMyDsl.g:153:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleImport EOF )
            // InternalMyDsl.g:155:1: ruleImport EOF
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
    // InternalMyDsl.g:162:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__Import__Group__0 ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__Import__Group__0 ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__Import__Group__0 ) )
            // InternalMyDsl.g:168:3: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // InternalMyDsl.g:169:3: ( rule__Import__Group__0 )
            // InternalMyDsl.g:169:4: rule__Import__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleImportComponent"
    // InternalMyDsl.g:178:1: entryRuleImportComponent : ruleImportComponent EOF ;
    public final void entryRuleImportComponent() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( ruleImportComponent EOF )
            // InternalMyDsl.g:180:1: ruleImportComponent EOF
            {
             before(grammarAccess.getImportComponentRule()); 
            pushFollow(FOLLOW_1);
            ruleImportComponent();

            state._fsp--;

             after(grammarAccess.getImportComponentRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleImportComponent"


    // $ANTLR start "ruleImportComponent"
    // InternalMyDsl.g:187:1: ruleImportComponent : ( ( rule__ImportComponent__NameAssignment ) ) ;
    public final void ruleImportComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( rule__ImportComponent__NameAssignment ) ) )
            // InternalMyDsl.g:192:2: ( ( rule__ImportComponent__NameAssignment ) )
            {
            // InternalMyDsl.g:192:2: ( ( rule__ImportComponent__NameAssignment ) )
            // InternalMyDsl.g:193:3: ( rule__ImportComponent__NameAssignment )
            {
             before(grammarAccess.getImportComponentAccess().getNameAssignment()); 
            // InternalMyDsl.g:194:3: ( rule__ImportComponent__NameAssignment )
            // InternalMyDsl.g:194:4: rule__ImportComponent__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ImportComponent__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getImportComponentAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImportComponent"


    // $ANTLR start "entryRuleClassDecl"
    // InternalMyDsl.g:203:1: entryRuleClassDecl : ruleClassDecl EOF ;
    public final void entryRuleClassDecl() throws RecognitionException {
        try {
            // InternalMyDsl.g:204:1: ( ruleClassDecl EOF )
            // InternalMyDsl.g:205:1: ruleClassDecl EOF
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
    // InternalMyDsl.g:212:1: ruleClassDecl : ( ( rule__ClassDecl__Alternatives ) ) ;
    public final void ruleClassDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:216:2: ( ( ( rule__ClassDecl__Alternatives ) ) )
            // InternalMyDsl.g:217:2: ( ( rule__ClassDecl__Alternatives ) )
            {
            // InternalMyDsl.g:217:2: ( ( rule__ClassDecl__Alternatives ) )
            // InternalMyDsl.g:218:3: ( rule__ClassDecl__Alternatives )
            {
             before(grammarAccess.getClassDeclAccess().getAlternatives()); 
            // InternalMyDsl.g:219:3: ( rule__ClassDecl__Alternatives )
            // InternalMyDsl.g:219:4: rule__ClassDecl__Alternatives
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


    // $ANTLR start "entryRuleClass"
    // InternalMyDsl.g:228:1: entryRuleClass : ruleClass EOF ;
    public final void entryRuleClass() throws RecognitionException {
        try {
            // InternalMyDsl.g:229:1: ( ruleClass EOF )
            // InternalMyDsl.g:230:1: ruleClass EOF
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
    // InternalMyDsl.g:237:1: ruleClass : ( ( rule__Class__Group__0 ) ) ;
    public final void ruleClass() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:241:2: ( ( ( rule__Class__Group__0 ) ) )
            // InternalMyDsl.g:242:2: ( ( rule__Class__Group__0 ) )
            {
            // InternalMyDsl.g:242:2: ( ( rule__Class__Group__0 ) )
            // InternalMyDsl.g:243:3: ( rule__Class__Group__0 )
            {
             before(grammarAccess.getClassAccess().getGroup()); 
            // InternalMyDsl.g:244:3: ( rule__Class__Group__0 )
            // InternalMyDsl.g:244:4: rule__Class__Group__0
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


    // $ANTLR start "entryRuleTypeName"
    // InternalMyDsl.g:253:1: entryRuleTypeName : ruleTypeName EOF ;
    public final void entryRuleTypeName() throws RecognitionException {
        try {
            // InternalMyDsl.g:254:1: ( ruleTypeName EOF )
            // InternalMyDsl.g:255:1: ruleTypeName EOF
            {
             before(grammarAccess.getTypeNameRule()); 
            pushFollow(FOLLOW_1);
            ruleTypeName();

            state._fsp--;

             after(grammarAccess.getTypeNameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTypeName"


    // $ANTLR start "ruleTypeName"
    // InternalMyDsl.g:262:1: ruleTypeName : ( ( rule__TypeName__NameAssignment ) ) ;
    public final void ruleTypeName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:266:2: ( ( ( rule__TypeName__NameAssignment ) ) )
            // InternalMyDsl.g:267:2: ( ( rule__TypeName__NameAssignment ) )
            {
            // InternalMyDsl.g:267:2: ( ( rule__TypeName__NameAssignment ) )
            // InternalMyDsl.g:268:3: ( rule__TypeName__NameAssignment )
            {
             before(grammarAccess.getTypeNameAccess().getNameAssignment()); 
            // InternalMyDsl.g:269:3: ( rule__TypeName__NameAssignment )
            // InternalMyDsl.g:269:4: rule__TypeName__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__TypeName__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getTypeNameAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypeName"


    // $ANTLR start "entryRulePolymorphicTypeName"
    // InternalMyDsl.g:278:1: entryRulePolymorphicTypeName : rulePolymorphicTypeName EOF ;
    public final void entryRulePolymorphicTypeName() throws RecognitionException {
        try {
            // InternalMyDsl.g:279:1: ( rulePolymorphicTypeName EOF )
            // InternalMyDsl.g:280:1: rulePolymorphicTypeName EOF
            {
             before(grammarAccess.getPolymorphicTypeNameRule()); 
            pushFollow(FOLLOW_1);
            rulePolymorphicTypeName();

            state._fsp--;

             after(grammarAccess.getPolymorphicTypeNameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePolymorphicTypeName"


    // $ANTLR start "rulePolymorphicTypeName"
    // InternalMyDsl.g:287:1: rulePolymorphicTypeName : ( ( rule__PolymorphicTypeName__NameAssignment ) ) ;
    public final void rulePolymorphicTypeName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:291:2: ( ( ( rule__PolymorphicTypeName__NameAssignment ) ) )
            // InternalMyDsl.g:292:2: ( ( rule__PolymorphicTypeName__NameAssignment ) )
            {
            // InternalMyDsl.g:292:2: ( ( rule__PolymorphicTypeName__NameAssignment ) )
            // InternalMyDsl.g:293:3: ( rule__PolymorphicTypeName__NameAssignment )
            {
             before(grammarAccess.getPolymorphicTypeNameAccess().getNameAssignment()); 
            // InternalMyDsl.g:294:3: ( rule__PolymorphicTypeName__NameAssignment )
            // InternalMyDsl.g:294:4: rule__PolymorphicTypeName__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__PolymorphicTypeName__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getPolymorphicTypeNameAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePolymorphicTypeName"


    // $ANTLR start "entryRulePolyContext"
    // InternalMyDsl.g:303:1: entryRulePolyContext : rulePolyContext EOF ;
    public final void entryRulePolyContext() throws RecognitionException {
        try {
            // InternalMyDsl.g:304:1: ( rulePolyContext EOF )
            // InternalMyDsl.g:305:1: rulePolyContext EOF
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
    // InternalMyDsl.g:312:1: rulePolyContext : ( ( rule__PolyContext__Group__0 ) ) ;
    public final void rulePolyContext() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:316:2: ( ( ( rule__PolyContext__Group__0 ) ) )
            // InternalMyDsl.g:317:2: ( ( rule__PolyContext__Group__0 ) )
            {
            // InternalMyDsl.g:317:2: ( ( rule__PolyContext__Group__0 ) )
            // InternalMyDsl.g:318:3: ( rule__PolyContext__Group__0 )
            {
             before(grammarAccess.getPolyContextAccess().getGroup()); 
            // InternalMyDsl.g:319:3: ( rule__PolyContext__Group__0 )
            // InternalMyDsl.g:319:4: rule__PolyContext__Group__0
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


    // $ANTLR start "entryRulePolyContextTypes"
    // InternalMyDsl.g:328:1: entryRulePolyContextTypes : rulePolyContextTypes EOF ;
    public final void entryRulePolyContextTypes() throws RecognitionException {
        try {
            // InternalMyDsl.g:329:1: ( rulePolyContextTypes EOF )
            // InternalMyDsl.g:330:1: rulePolyContextTypes EOF
            {
             before(grammarAccess.getPolyContextTypesRule()); 
            pushFollow(FOLLOW_1);
            rulePolyContextTypes();

            state._fsp--;

             after(grammarAccess.getPolyContextTypesRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePolyContextTypes"


    // $ANTLR start "rulePolyContextTypes"
    // InternalMyDsl.g:337:1: rulePolyContextTypes : ( ( rule__PolyContextTypes__Group__0 ) ) ;
    public final void rulePolyContextTypes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:341:2: ( ( ( rule__PolyContextTypes__Group__0 ) ) )
            // InternalMyDsl.g:342:2: ( ( rule__PolyContextTypes__Group__0 ) )
            {
            // InternalMyDsl.g:342:2: ( ( rule__PolyContextTypes__Group__0 ) )
            // InternalMyDsl.g:343:3: ( rule__PolyContextTypes__Group__0 )
            {
             before(grammarAccess.getPolyContextTypesAccess().getGroup()); 
            // InternalMyDsl.g:344:3: ( rule__PolyContextTypes__Group__0 )
            // InternalMyDsl.g:344:4: rule__PolyContextTypes__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PolyContextTypes__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPolyContextTypesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePolyContextTypes"


    // $ANTLR start "entryRulePolyTypeConstraints"
    // InternalMyDsl.g:353:1: entryRulePolyTypeConstraints : rulePolyTypeConstraints EOF ;
    public final void entryRulePolyTypeConstraints() throws RecognitionException {
        try {
            // InternalMyDsl.g:354:1: ( rulePolyTypeConstraints EOF )
            // InternalMyDsl.g:355:1: rulePolyTypeConstraints EOF
            {
             before(grammarAccess.getPolyTypeConstraintsRule()); 
            pushFollow(FOLLOW_1);
            rulePolyTypeConstraints();

            state._fsp--;

             after(grammarAccess.getPolyTypeConstraintsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePolyTypeConstraints"


    // $ANTLR start "rulePolyTypeConstraints"
    // InternalMyDsl.g:362:1: rulePolyTypeConstraints : ( ( rule__PolyTypeConstraints__Group__0 ) ) ;
    public final void rulePolyTypeConstraints() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:366:2: ( ( ( rule__PolyTypeConstraints__Group__0 ) ) )
            // InternalMyDsl.g:367:2: ( ( rule__PolyTypeConstraints__Group__0 ) )
            {
            // InternalMyDsl.g:367:2: ( ( rule__PolyTypeConstraints__Group__0 ) )
            // InternalMyDsl.g:368:3: ( rule__PolyTypeConstraints__Group__0 )
            {
             before(grammarAccess.getPolyTypeConstraintsAccess().getGroup()); 
            // InternalMyDsl.g:369:3: ( rule__PolyTypeConstraints__Group__0 )
            // InternalMyDsl.g:369:4: rule__PolyTypeConstraints__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PolyTypeConstraints__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPolyTypeConstraintsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePolyTypeConstraints"


    // $ANTLR start "entryRuleSuperTypeList"
    // InternalMyDsl.g:378:1: entryRuleSuperTypeList : ruleSuperTypeList EOF ;
    public final void entryRuleSuperTypeList() throws RecognitionException {
        try {
            // InternalMyDsl.g:379:1: ( ruleSuperTypeList EOF )
            // InternalMyDsl.g:380:1: ruleSuperTypeList EOF
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
    // InternalMyDsl.g:387:1: ruleSuperTypeList : ( ( rule__SuperTypeList__Group__0 ) ) ;
    public final void ruleSuperTypeList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:391:2: ( ( ( rule__SuperTypeList__Group__0 ) ) )
            // InternalMyDsl.g:392:2: ( ( rule__SuperTypeList__Group__0 ) )
            {
            // InternalMyDsl.g:392:2: ( ( rule__SuperTypeList__Group__0 ) )
            // InternalMyDsl.g:393:3: ( rule__SuperTypeList__Group__0 )
            {
             before(grammarAccess.getSuperTypeListAccess().getGroup()); 
            // InternalMyDsl.g:394:3: ( rule__SuperTypeList__Group__0 )
            // InternalMyDsl.g:394:4: rule__SuperTypeList__Group__0
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
    // InternalMyDsl.g:403:1: entryRuleConstructedType : ruleConstructedType EOF ;
    public final void entryRuleConstructedType() throws RecognitionException {
        try {
            // InternalMyDsl.g:404:1: ( ruleConstructedType EOF )
            // InternalMyDsl.g:405:1: ruleConstructedType EOF
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
    // InternalMyDsl.g:412:1: ruleConstructedType : ( ( rule__ConstructedType__Group__0 ) ) ;
    public final void ruleConstructedType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:416:2: ( ( ( rule__ConstructedType__Group__0 ) ) )
            // InternalMyDsl.g:417:2: ( ( rule__ConstructedType__Group__0 ) )
            {
            // InternalMyDsl.g:417:2: ( ( rule__ConstructedType__Group__0 ) )
            // InternalMyDsl.g:418:3: ( rule__ConstructedType__Group__0 )
            {
             before(grammarAccess.getConstructedTypeAccess().getGroup()); 
            // InternalMyDsl.g:419:3: ( rule__ConstructedType__Group__0 )
            // InternalMyDsl.g:419:4: rule__ConstructedType__Group__0
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
    // InternalMyDsl.g:428:1: entryRuleTypeConstructor : ruleTypeConstructor EOF ;
    public final void entryRuleTypeConstructor() throws RecognitionException {
        try {
            // InternalMyDsl.g:429:1: ( ruleTypeConstructor EOF )
            // InternalMyDsl.g:430:1: ruleTypeConstructor EOF
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
    // InternalMyDsl.g:437:1: ruleTypeConstructor : ( ( rule__TypeConstructor__Group__0 ) ) ;
    public final void ruleTypeConstructor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:441:2: ( ( ( rule__TypeConstructor__Group__0 ) ) )
            // InternalMyDsl.g:442:2: ( ( rule__TypeConstructor__Group__0 ) )
            {
            // InternalMyDsl.g:442:2: ( ( rule__TypeConstructor__Group__0 ) )
            // InternalMyDsl.g:443:3: ( rule__TypeConstructor__Group__0 )
            {
             before(grammarAccess.getTypeConstructorAccess().getGroup()); 
            // InternalMyDsl.g:444:3: ( rule__TypeConstructor__Group__0 )
            // InternalMyDsl.g:444:4: rule__TypeConstructor__Group__0
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
    // InternalMyDsl.g:453:1: entryRuleTypeDeclContext : ruleTypeDeclContext EOF ;
    public final void entryRuleTypeDeclContext() throws RecognitionException {
        try {
            // InternalMyDsl.g:454:1: ( ruleTypeDeclContext EOF )
            // InternalMyDsl.g:455:1: ruleTypeDeclContext EOF
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
    // InternalMyDsl.g:462:1: ruleTypeDeclContext : ( ( rule__TypeDeclContext__Group__0 ) ) ;
    public final void ruleTypeDeclContext() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:466:2: ( ( ( rule__TypeDeclContext__Group__0 ) ) )
            // InternalMyDsl.g:467:2: ( ( rule__TypeDeclContext__Group__0 ) )
            {
            // InternalMyDsl.g:467:2: ( ( rule__TypeDeclContext__Group__0 ) )
            // InternalMyDsl.g:468:3: ( rule__TypeDeclContext__Group__0 )
            {
             before(grammarAccess.getTypeDeclContextAccess().getGroup()); 
            // InternalMyDsl.g:469:3: ( rule__TypeDeclContext__Group__0 )
            // InternalMyDsl.g:469:4: rule__TypeDeclContext__Group__0
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
    // InternalMyDsl.g:478:1: entryRuleTypeStructure : ruleTypeStructure EOF ;
    public final void entryRuleTypeStructure() throws RecognitionException {
        try {
            // InternalMyDsl.g:479:1: ( ruleTypeStructure EOF )
            // InternalMyDsl.g:480:1: ruleTypeStructure EOF
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
    // InternalMyDsl.g:487:1: ruleTypeStructure : ( ( rule__TypeStructure__Group__0 ) ) ;
    public final void ruleTypeStructure() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:491:2: ( ( ( rule__TypeStructure__Group__0 ) ) )
            // InternalMyDsl.g:492:2: ( ( rule__TypeStructure__Group__0 ) )
            {
            // InternalMyDsl.g:492:2: ( ( rule__TypeStructure__Group__0 ) )
            // InternalMyDsl.g:493:3: ( rule__TypeStructure__Group__0 )
            {
             before(grammarAccess.getTypeStructureAccess().getGroup()); 
            // InternalMyDsl.g:494:3: ( rule__TypeStructure__Group__0 )
            // InternalMyDsl.g:494:4: rule__TypeStructure__Group__0
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
    // InternalMyDsl.g:503:1: entryRuleWhere : ruleWhere EOF ;
    public final void entryRuleWhere() throws RecognitionException {
        try {
            // InternalMyDsl.g:504:1: ( ruleWhere EOF )
            // InternalMyDsl.g:505:1: ruleWhere EOF
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
    // InternalMyDsl.g:512:1: ruleWhere : ( ( rule__Where__Group__0 ) ) ;
    public final void ruleWhere() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:516:2: ( ( ( rule__Where__Group__0 ) ) )
            // InternalMyDsl.g:517:2: ( ( rule__Where__Group__0 ) )
            {
            // InternalMyDsl.g:517:2: ( ( rule__Where__Group__0 ) )
            // InternalMyDsl.g:518:3: ( rule__Where__Group__0 )
            {
             before(grammarAccess.getWhereAccess().getGroup()); 
            // InternalMyDsl.g:519:3: ( rule__Where__Group__0 )
            // InternalMyDsl.g:519:4: rule__Where__Group__0
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
    // InternalMyDsl.g:528:1: entryRuleDatatype : ruleDatatype EOF ;
    public final void entryRuleDatatype() throws RecognitionException {
        try {
            // InternalMyDsl.g:529:1: ( ruleDatatype EOF )
            // InternalMyDsl.g:530:1: ruleDatatype EOF
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
    // InternalMyDsl.g:537:1: ruleDatatype : ( ( rule__Datatype__Group__0 ) ) ;
    public final void ruleDatatype() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:541:2: ( ( ( rule__Datatype__Group__0 ) ) )
            // InternalMyDsl.g:542:2: ( ( rule__Datatype__Group__0 ) )
            {
            // InternalMyDsl.g:542:2: ( ( rule__Datatype__Group__0 ) )
            // InternalMyDsl.g:543:3: ( rule__Datatype__Group__0 )
            {
             before(grammarAccess.getDatatypeAccess().getGroup()); 
            // InternalMyDsl.g:544:3: ( rule__Datatype__Group__0 )
            // InternalMyDsl.g:544:4: rule__Datatype__Group__0
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
    // InternalMyDsl.g:553:1: entryRuleDatatypeConstructor : ruleDatatypeConstructor EOF ;
    public final void entryRuleDatatypeConstructor() throws RecognitionException {
        try {
            // InternalMyDsl.g:554:1: ( ruleDatatypeConstructor EOF )
            // InternalMyDsl.g:555:1: ruleDatatypeConstructor EOF
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
    // InternalMyDsl.g:562:1: ruleDatatypeConstructor : ( ( rule__DatatypeConstructor__Group__0 ) ) ;
    public final void ruleDatatypeConstructor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:566:2: ( ( ( rule__DatatypeConstructor__Group__0 ) ) )
            // InternalMyDsl.g:567:2: ( ( rule__DatatypeConstructor__Group__0 ) )
            {
            // InternalMyDsl.g:567:2: ( ( rule__DatatypeConstructor__Group__0 ) )
            // InternalMyDsl.g:568:3: ( rule__DatatypeConstructor__Group__0 )
            {
             before(grammarAccess.getDatatypeConstructorAccess().getGroup()); 
            // InternalMyDsl.g:569:3: ( rule__DatatypeConstructor__Group__0 )
            // InternalMyDsl.g:569:4: rule__DatatypeConstructor__Group__0
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
    // InternalMyDsl.g:578:1: entryRuleExtend : ruleExtend EOF ;
    public final void entryRuleExtend() throws RecognitionException {
        try {
            // InternalMyDsl.g:579:1: ( ruleExtend EOF )
            // InternalMyDsl.g:580:1: ruleExtend EOF
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
    // InternalMyDsl.g:587:1: ruleExtend : ( ( rule__Extend__Group__0 ) ) ;
    public final void ruleExtend() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:591:2: ( ( ( rule__Extend__Group__0 ) ) )
            // InternalMyDsl.g:592:2: ( ( rule__Extend__Group__0 ) )
            {
            // InternalMyDsl.g:592:2: ( ( rule__Extend__Group__0 ) )
            // InternalMyDsl.g:593:3: ( rule__Extend__Group__0 )
            {
             before(grammarAccess.getExtendAccess().getGroup()); 
            // InternalMyDsl.g:594:3: ( rule__Extend__Group__0 )
            // InternalMyDsl.g:594:4: rule__Extend__Group__0
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


    // $ANTLR start "entryRuleTypeBodyElements"
    // InternalMyDsl.g:603:1: entryRuleTypeBodyElements : ruleTypeBodyElements EOF ;
    public final void entryRuleTypeBodyElements() throws RecognitionException {
        try {
            // InternalMyDsl.g:604:1: ( ruleTypeBodyElements EOF )
            // InternalMyDsl.g:605:1: ruleTypeBodyElements EOF
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
    // InternalMyDsl.g:612:1: ruleTypeBodyElements : ( ( rule__TypeBodyElements__Alternatives ) ) ;
    public final void ruleTypeBodyElements() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:616:2: ( ( ( rule__TypeBodyElements__Alternatives ) ) )
            // InternalMyDsl.g:617:2: ( ( rule__TypeBodyElements__Alternatives ) )
            {
            // InternalMyDsl.g:617:2: ( ( rule__TypeBodyElements__Alternatives ) )
            // InternalMyDsl.g:618:3: ( rule__TypeBodyElements__Alternatives )
            {
             before(grammarAccess.getTypeBodyElementsAccess().getAlternatives()); 
            // InternalMyDsl.g:619:3: ( rule__TypeBodyElements__Alternatives )
            // InternalMyDsl.g:619:4: rule__TypeBodyElements__Alternatives
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
    // InternalMyDsl.g:628:1: entryRuleFunctionDecl : ruleFunctionDecl EOF ;
    public final void entryRuleFunctionDecl() throws RecognitionException {
        try {
            // InternalMyDsl.g:629:1: ( ruleFunctionDecl EOF )
            // InternalMyDsl.g:630:1: ruleFunctionDecl EOF
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
    // InternalMyDsl.g:637:1: ruleFunctionDecl : ( ( rule__FunctionDecl__Group__0 ) ) ;
    public final void ruleFunctionDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:641:2: ( ( ( rule__FunctionDecl__Group__0 ) ) )
            // InternalMyDsl.g:642:2: ( ( rule__FunctionDecl__Group__0 ) )
            {
            // InternalMyDsl.g:642:2: ( ( rule__FunctionDecl__Group__0 ) )
            // InternalMyDsl.g:643:3: ( rule__FunctionDecl__Group__0 )
            {
             before(grammarAccess.getFunctionDeclAccess().getGroup()); 
            // InternalMyDsl.g:644:3: ( rule__FunctionDecl__Group__0 )
            // InternalMyDsl.g:644:4: rule__FunctionDecl__Group__0
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
    // InternalMyDsl.g:653:1: entryRuleFunctionName : ruleFunctionName EOF ;
    public final void entryRuleFunctionName() throws RecognitionException {
        try {
            // InternalMyDsl.g:654:1: ( ruleFunctionName EOF )
            // InternalMyDsl.g:655:1: ruleFunctionName EOF
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
    // InternalMyDsl.g:662:1: ruleFunctionName : ( ( rule__FunctionName__NameAssignment ) ) ;
    public final void ruleFunctionName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:666:2: ( ( ( rule__FunctionName__NameAssignment ) ) )
            // InternalMyDsl.g:667:2: ( ( rule__FunctionName__NameAssignment ) )
            {
            // InternalMyDsl.g:667:2: ( ( rule__FunctionName__NameAssignment ) )
            // InternalMyDsl.g:668:3: ( rule__FunctionName__NameAssignment )
            {
             before(grammarAccess.getFunctionNameAccess().getNameAssignment()); 
            // InternalMyDsl.g:669:3: ( rule__FunctionName__NameAssignment )
            // InternalMyDsl.g:669:4: rule__FunctionName__NameAssignment
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


    // $ANTLR start "entryRuleFunctionBody"
    // InternalMyDsl.g:678:1: entryRuleFunctionBody : ruleFunctionBody EOF ;
    public final void entryRuleFunctionBody() throws RecognitionException {
        try {
            // InternalMyDsl.g:679:1: ( ruleFunctionBody EOF )
            // InternalMyDsl.g:680:1: ruleFunctionBody EOF
            {
             before(grammarAccess.getFunctionBodyRule()); 
            pushFollow(FOLLOW_1);
            ruleFunctionBody();

            state._fsp--;

             after(grammarAccess.getFunctionBodyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFunctionBody"


    // $ANTLR start "ruleFunctionBody"
    // InternalMyDsl.g:687:1: ruleFunctionBody : ( ( rule__FunctionBody__Alternatives ) ) ;
    public final void ruleFunctionBody() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:691:2: ( ( ( rule__FunctionBody__Alternatives ) ) )
            // InternalMyDsl.g:692:2: ( ( rule__FunctionBody__Alternatives ) )
            {
            // InternalMyDsl.g:692:2: ( ( rule__FunctionBody__Alternatives ) )
            // InternalMyDsl.g:693:3: ( rule__FunctionBody__Alternatives )
            {
             before(grammarAccess.getFunctionBodyAccess().getAlternatives()); 
            // InternalMyDsl.g:694:3: ( rule__FunctionBody__Alternatives )
            // InternalMyDsl.g:694:4: rule__FunctionBody__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__FunctionBody__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFunctionBodyAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFunctionBody"


    // $ANTLR start "entryRuleFuncDirectDef"
    // InternalMyDsl.g:703:1: entryRuleFuncDirectDef : ruleFuncDirectDef EOF ;
    public final void entryRuleFuncDirectDef() throws RecognitionException {
        try {
            // InternalMyDsl.g:704:1: ( ruleFuncDirectDef EOF )
            // InternalMyDsl.g:705:1: ruleFuncDirectDef EOF
            {
             before(grammarAccess.getFuncDirectDefRule()); 
            pushFollow(FOLLOW_1);
            ruleFuncDirectDef();

            state._fsp--;

             after(grammarAccess.getFuncDirectDefRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFuncDirectDef"


    // $ANTLR start "ruleFuncDirectDef"
    // InternalMyDsl.g:712:1: ruleFuncDirectDef : ( ( rule__FuncDirectDef__ExpressionAssignment ) ) ;
    public final void ruleFuncDirectDef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:716:2: ( ( ( rule__FuncDirectDef__ExpressionAssignment ) ) )
            // InternalMyDsl.g:717:2: ( ( rule__FuncDirectDef__ExpressionAssignment ) )
            {
            // InternalMyDsl.g:717:2: ( ( rule__FuncDirectDef__ExpressionAssignment ) )
            // InternalMyDsl.g:718:3: ( rule__FuncDirectDef__ExpressionAssignment )
            {
             before(grammarAccess.getFuncDirectDefAccess().getExpressionAssignment()); 
            // InternalMyDsl.g:719:3: ( rule__FuncDirectDef__ExpressionAssignment )
            // InternalMyDsl.g:719:4: rule__FuncDirectDef__ExpressionAssignment
            {
            pushFollow(FOLLOW_2);
            rule__FuncDirectDef__ExpressionAssignment();

            state._fsp--;


            }

             after(grammarAccess.getFuncDirectDefAccess().getExpressionAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFuncDirectDef"


    // $ANTLR start "entryRuleFuncInductive"
    // InternalMyDsl.g:728:1: entryRuleFuncInductive : ruleFuncInductive EOF ;
    public final void entryRuleFuncInductive() throws RecognitionException {
        try {
            // InternalMyDsl.g:729:1: ( ruleFuncInductive EOF )
            // InternalMyDsl.g:730:1: ruleFuncInductive EOF
            {
             before(grammarAccess.getFuncInductiveRule()); 
            pushFollow(FOLLOW_1);
            ruleFuncInductive();

            state._fsp--;

             after(grammarAccess.getFuncInductiveRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFuncInductive"


    // $ANTLR start "ruleFuncInductive"
    // InternalMyDsl.g:737:1: ruleFuncInductive : ( ( rule__FuncInductive__Group__0 ) ) ;
    public final void ruleFuncInductive() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:741:2: ( ( ( rule__FuncInductive__Group__0 ) ) )
            // InternalMyDsl.g:742:2: ( ( rule__FuncInductive__Group__0 ) )
            {
            // InternalMyDsl.g:742:2: ( ( rule__FuncInductive__Group__0 ) )
            // InternalMyDsl.g:743:3: ( rule__FuncInductive__Group__0 )
            {
             before(grammarAccess.getFuncInductiveAccess().getGroup()); 
            // InternalMyDsl.g:744:3: ( rule__FuncInductive__Group__0 )
            // InternalMyDsl.g:744:4: rule__FuncInductive__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FuncInductive__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFuncInductiveAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFuncInductive"


    // $ANTLR start "entryRuleFuncInductiveCase"
    // InternalMyDsl.g:753:1: entryRuleFuncInductiveCase : ruleFuncInductiveCase EOF ;
    public final void entryRuleFuncInductiveCase() throws RecognitionException {
        try {
            // InternalMyDsl.g:754:1: ( ruleFuncInductiveCase EOF )
            // InternalMyDsl.g:755:1: ruleFuncInductiveCase EOF
            {
             before(grammarAccess.getFuncInductiveCaseRule()); 
            pushFollow(FOLLOW_1);
            ruleFuncInductiveCase();

            state._fsp--;

             after(grammarAccess.getFuncInductiveCaseRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFuncInductiveCase"


    // $ANTLR start "ruleFuncInductiveCase"
    // InternalMyDsl.g:762:1: ruleFuncInductiveCase : ( ( rule__FuncInductiveCase__Group__0 ) ) ;
    public final void ruleFuncInductiveCase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:766:2: ( ( ( rule__FuncInductiveCase__Group__0 ) ) )
            // InternalMyDsl.g:767:2: ( ( rule__FuncInductiveCase__Group__0 ) )
            {
            // InternalMyDsl.g:767:2: ( ( rule__FuncInductiveCase__Group__0 ) )
            // InternalMyDsl.g:768:3: ( rule__FuncInductiveCase__Group__0 )
            {
             before(grammarAccess.getFuncInductiveCaseAccess().getGroup()); 
            // InternalMyDsl.g:769:3: ( rule__FuncInductiveCase__Group__0 )
            // InternalMyDsl.g:769:4: rule__FuncInductiveCase__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FuncInductiveCase__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFuncInductiveCaseAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFuncInductiveCase"


    // $ANTLR start "entryRuleTheoremBody"
    // InternalMyDsl.g:778:1: entryRuleTheoremBody : ruleTheoremBody EOF ;
    public final void entryRuleTheoremBody() throws RecognitionException {
        try {
            // InternalMyDsl.g:779:1: ( ruleTheoremBody EOF )
            // InternalMyDsl.g:780:1: ruleTheoremBody EOF
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
    // InternalMyDsl.g:787:1: ruleTheoremBody : ( ( rule__TheoremBody__Group__0 ) ) ;
    public final void ruleTheoremBody() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:791:2: ( ( ( rule__TheoremBody__Group__0 ) ) )
            // InternalMyDsl.g:792:2: ( ( rule__TheoremBody__Group__0 ) )
            {
            // InternalMyDsl.g:792:2: ( ( rule__TheoremBody__Group__0 ) )
            // InternalMyDsl.g:793:3: ( rule__TheoremBody__Group__0 )
            {
             before(grammarAccess.getTheoremBodyAccess().getGroup()); 
            // InternalMyDsl.g:794:3: ( rule__TheoremBody__Group__0 )
            // InternalMyDsl.g:794:4: rule__TheoremBody__Group__0
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
    // InternalMyDsl.g:803:1: entryRuleTheoremDecl : ruleTheoremDecl EOF ;
    public final void entryRuleTheoremDecl() throws RecognitionException {
        try {
            // InternalMyDsl.g:804:1: ( ruleTheoremDecl EOF )
            // InternalMyDsl.g:805:1: ruleTheoremDecl EOF
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
    // InternalMyDsl.g:812:1: ruleTheoremDecl : ( ( rule__TheoremDecl__Group__0 ) ) ;
    public final void ruleTheoremDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:816:2: ( ( ( rule__TheoremDecl__Group__0 ) ) )
            // InternalMyDsl.g:817:2: ( ( rule__TheoremDecl__Group__0 ) )
            {
            // InternalMyDsl.g:817:2: ( ( rule__TheoremDecl__Group__0 ) )
            // InternalMyDsl.g:818:3: ( rule__TheoremDecl__Group__0 )
            {
             before(grammarAccess.getTheoremDeclAccess().getGroup()); 
            // InternalMyDsl.g:819:3: ( rule__TheoremDecl__Group__0 )
            // InternalMyDsl.g:819:4: rule__TheoremDecl__Group__0
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
    // InternalMyDsl.g:828:1: entryRuleTypedVariableList : ruleTypedVariableList EOF ;
    public final void entryRuleTypedVariableList() throws RecognitionException {
        try {
            // InternalMyDsl.g:829:1: ( ruleTypedVariableList EOF )
            // InternalMyDsl.g:830:1: ruleTypedVariableList EOF
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
    // InternalMyDsl.g:837:1: ruleTypedVariableList : ( ( rule__TypedVariableList__Group__0 ) ) ;
    public final void ruleTypedVariableList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:841:2: ( ( ( rule__TypedVariableList__Group__0 ) ) )
            // InternalMyDsl.g:842:2: ( ( rule__TypedVariableList__Group__0 ) )
            {
            // InternalMyDsl.g:842:2: ( ( rule__TypedVariableList__Group__0 ) )
            // InternalMyDsl.g:843:3: ( rule__TypedVariableList__Group__0 )
            {
             before(grammarAccess.getTypedVariableListAccess().getGroup()); 
            // InternalMyDsl.g:844:3: ( rule__TypedVariableList__Group__0 )
            // InternalMyDsl.g:844:4: rule__TypedVariableList__Group__0
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
    // InternalMyDsl.g:853:1: entryRuleVariableTyping : ruleVariableTyping EOF ;
    public final void entryRuleVariableTyping() throws RecognitionException {
        try {
            // InternalMyDsl.g:854:1: ( ruleVariableTyping EOF )
            // InternalMyDsl.g:855:1: ruleVariableTyping EOF
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
    // InternalMyDsl.g:862:1: ruleVariableTyping : ( ( rule__VariableTyping__Group__0 ) ) ;
    public final void ruleVariableTyping() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:866:2: ( ( ( rule__VariableTyping__Group__0 ) ) )
            // InternalMyDsl.g:867:2: ( ( rule__VariableTyping__Group__0 ) )
            {
            // InternalMyDsl.g:867:2: ( ( rule__VariableTyping__Group__0 ) )
            // InternalMyDsl.g:868:3: ( rule__VariableTyping__Group__0 )
            {
             before(grammarAccess.getVariableTypingAccess().getGroup()); 
            // InternalMyDsl.g:869:3: ( rule__VariableTyping__Group__0 )
            // InternalMyDsl.g:869:4: rule__VariableTyping__Group__0
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
    // InternalMyDsl.g:878:1: entryRuleTypedVariable : ruleTypedVariable EOF ;
    public final void entryRuleTypedVariable() throws RecognitionException {
        try {
            // InternalMyDsl.g:879:1: ( ruleTypedVariable EOF )
            // InternalMyDsl.g:880:1: ruleTypedVariable EOF
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
    // InternalMyDsl.g:887:1: ruleTypedVariable : ( ( rule__TypedVariable__NameAssignment ) ) ;
    public final void ruleTypedVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:891:2: ( ( ( rule__TypedVariable__NameAssignment ) ) )
            // InternalMyDsl.g:892:2: ( ( rule__TypedVariable__NameAssignment ) )
            {
            // InternalMyDsl.g:892:2: ( ( rule__TypedVariable__NameAssignment ) )
            // InternalMyDsl.g:893:3: ( rule__TypedVariable__NameAssignment )
            {
             before(grammarAccess.getTypedVariableAccess().getNameAssignment()); 
            // InternalMyDsl.g:894:3: ( rule__TypedVariable__NameAssignment )
            // InternalMyDsl.g:894:4: rule__TypedVariable__NameAssignment
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
    // InternalMyDsl.g:903:1: entryRuleLambda : ruleLambda EOF ;
    public final void entryRuleLambda() throws RecognitionException {
        try {
            // InternalMyDsl.g:904:1: ( ruleLambda EOF )
            // InternalMyDsl.g:905:1: ruleLambda EOF
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
    // InternalMyDsl.g:912:1: ruleLambda : ( ( rule__Lambda__Group__0 ) ) ;
    public final void ruleLambda() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:916:2: ( ( ( rule__Lambda__Group__0 ) ) )
            // InternalMyDsl.g:917:2: ( ( rule__Lambda__Group__0 ) )
            {
            // InternalMyDsl.g:917:2: ( ( rule__Lambda__Group__0 ) )
            // InternalMyDsl.g:918:3: ( rule__Lambda__Group__0 )
            {
             before(grammarAccess.getLambdaAccess().getGroup()); 
            // InternalMyDsl.g:919:3: ( rule__Lambda__Group__0 )
            // InternalMyDsl.g:919:4: rule__Lambda__Group__0
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
    // InternalMyDsl.g:928:1: entryRuleQuantifier : ruleQuantifier EOF ;
    public final void entryRuleQuantifier() throws RecognitionException {
        try {
            // InternalMyDsl.g:929:1: ( ruleQuantifier EOF )
            // InternalMyDsl.g:930:1: ruleQuantifier EOF
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
    // InternalMyDsl.g:937:1: ruleQuantifier : ( ( rule__Quantifier__Group__0 ) ) ;
    public final void ruleQuantifier() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:941:2: ( ( ( rule__Quantifier__Group__0 ) ) )
            // InternalMyDsl.g:942:2: ( ( rule__Quantifier__Group__0 ) )
            {
            // InternalMyDsl.g:942:2: ( ( rule__Quantifier__Group__0 ) )
            // InternalMyDsl.g:943:3: ( rule__Quantifier__Group__0 )
            {
             before(grammarAccess.getQuantifierAccess().getGroup()); 
            // InternalMyDsl.g:944:3: ( rule__Quantifier__Group__0 )
            // InternalMyDsl.g:944:4: rule__Quantifier__Group__0
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
    // InternalMyDsl.g:953:1: entryRuleRootExpression : ruleRootExpression EOF ;
    public final void entryRuleRootExpression() throws RecognitionException {
        try {
            // InternalMyDsl.g:954:1: ( ruleRootExpression EOF )
            // InternalMyDsl.g:955:1: ruleRootExpression EOF
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
    // InternalMyDsl.g:962:1: ruleRootExpression : ( ( rule__RootExpression__Alternatives ) ) ;
    public final void ruleRootExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:966:2: ( ( ( rule__RootExpression__Alternatives ) ) )
            // InternalMyDsl.g:967:2: ( ( rule__RootExpression__Alternatives ) )
            {
            // InternalMyDsl.g:967:2: ( ( rule__RootExpression__Alternatives ) )
            // InternalMyDsl.g:968:3: ( rule__RootExpression__Alternatives )
            {
             before(grammarAccess.getRootExpressionAccess().getAlternatives()); 
            // InternalMyDsl.g:969:3: ( rule__RootExpression__Alternatives )
            // InternalMyDsl.g:969:4: rule__RootExpression__Alternatives
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
    // InternalMyDsl.g:978:1: entryRulePrefix : rulePrefix EOF ;
    public final void entryRulePrefix() throws RecognitionException {
        try {
            // InternalMyDsl.g:979:1: ( rulePrefix EOF )
            // InternalMyDsl.g:980:1: rulePrefix EOF
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
    // InternalMyDsl.g:987:1: rulePrefix : ( ( rule__Prefix__Group__0 ) ) ;
    public final void rulePrefix() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:991:2: ( ( ( rule__Prefix__Group__0 ) ) )
            // InternalMyDsl.g:992:2: ( ( rule__Prefix__Group__0 ) )
            {
            // InternalMyDsl.g:992:2: ( ( rule__Prefix__Group__0 ) )
            // InternalMyDsl.g:993:3: ( rule__Prefix__Group__0 )
            {
             before(grammarAccess.getPrefixAccess().getGroup()); 
            // InternalMyDsl.g:994:3: ( rule__Prefix__Group__0 )
            // InternalMyDsl.g:994:4: rule__Prefix__Group__0
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
    // InternalMyDsl.g:1003:1: entryRulePrefixBuiltIn : rulePrefixBuiltIn EOF ;
    public final void entryRulePrefixBuiltIn() throws RecognitionException {
        try {
            // InternalMyDsl.g:1004:1: ( rulePrefixBuiltIn EOF )
            // InternalMyDsl.g:1005:1: rulePrefixBuiltIn EOF
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
    // InternalMyDsl.g:1012:1: rulePrefixBuiltIn : ( '\\u00AC' ) ;
    public final void rulePrefixBuiltIn() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1016:2: ( ( '\\u00AC' ) )
            // InternalMyDsl.g:1017:2: ( '\\u00AC' )
            {
            // InternalMyDsl.g:1017:2: ( '\\u00AC' )
            // InternalMyDsl.g:1018:3: '\\u00AC'
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
    // InternalMyDsl.g:1028:1: entryRuleInfix : ruleInfix EOF ;
    public final void entryRuleInfix() throws RecognitionException {
        try {
            // InternalMyDsl.g:1029:1: ( ruleInfix EOF )
            // InternalMyDsl.g:1030:1: ruleInfix EOF
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
    // InternalMyDsl.g:1037:1: ruleInfix : ( ( rule__Infix__Group__0 ) ) ;
    public final void ruleInfix() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1041:2: ( ( ( rule__Infix__Group__0 ) ) )
            // InternalMyDsl.g:1042:2: ( ( rule__Infix__Group__0 ) )
            {
            // InternalMyDsl.g:1042:2: ( ( rule__Infix__Group__0 ) )
            // InternalMyDsl.g:1043:3: ( rule__Infix__Group__0 )
            {
             before(grammarAccess.getInfixAccess().getGroup()); 
            // InternalMyDsl.g:1044:3: ( rule__Infix__Group__0 )
            // InternalMyDsl.g:1044:4: rule__Infix__Group__0
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
    // InternalMyDsl.g:1053:1: entryRuleElement : ruleElement EOF ;
    public final void entryRuleElement() throws RecognitionException {
        try {
            // InternalMyDsl.g:1054:1: ( ruleElement EOF )
            // InternalMyDsl.g:1055:1: ruleElement EOF
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
    // InternalMyDsl.g:1062:1: ruleElement : ( ( rule__Element__Alternatives ) ) ;
    public final void ruleElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1066:2: ( ( ( rule__Element__Alternatives ) ) )
            // InternalMyDsl.g:1067:2: ( ( rule__Element__Alternatives ) )
            {
            // InternalMyDsl.g:1067:2: ( ( rule__Element__Alternatives ) )
            // InternalMyDsl.g:1068:3: ( rule__Element__Alternatives )
            {
             before(grammarAccess.getElementAccess().getAlternatives()); 
            // InternalMyDsl.g:1069:3: ( rule__Element__Alternatives )
            // InternalMyDsl.g:1069:4: rule__Element__Alternatives
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
    // InternalMyDsl.g:1078:1: entryRuleBracket : ruleBracket EOF ;
    public final void entryRuleBracket() throws RecognitionException {
        try {
            // InternalMyDsl.g:1079:1: ( ruleBracket EOF )
            // InternalMyDsl.g:1080:1: ruleBracket EOF
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
    // InternalMyDsl.g:1087:1: ruleBracket : ( ( rule__Bracket__Group__0 ) ) ;
    public final void ruleBracket() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1091:2: ( ( ( rule__Bracket__Group__0 ) ) )
            // InternalMyDsl.g:1092:2: ( ( rule__Bracket__Group__0 ) )
            {
            // InternalMyDsl.g:1092:2: ( ( rule__Bracket__Group__0 ) )
            // InternalMyDsl.g:1093:3: ( rule__Bracket__Group__0 )
            {
             before(grammarAccess.getBracketAccess().getGroup()); 
            // InternalMyDsl.g:1094:3: ( rule__Bracket__Group__0 )
            // InternalMyDsl.g:1094:4: rule__Bracket__Group__0
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
    // InternalMyDsl.g:1103:1: entryRuleFunctionCall : ruleFunctionCall EOF ;
    public final void entryRuleFunctionCall() throws RecognitionException {
        try {
            // InternalMyDsl.g:1104:1: ( ruleFunctionCall EOF )
            // InternalMyDsl.g:1105:1: ruleFunctionCall EOF
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
    // InternalMyDsl.g:1112:1: ruleFunctionCall : ( ( rule__FunctionCall__Group__0 ) ) ;
    public final void ruleFunctionCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1116:2: ( ( ( rule__FunctionCall__Group__0 ) ) )
            // InternalMyDsl.g:1117:2: ( ( rule__FunctionCall__Group__0 ) )
            {
            // InternalMyDsl.g:1117:2: ( ( rule__FunctionCall__Group__0 ) )
            // InternalMyDsl.g:1118:3: ( rule__FunctionCall__Group__0 )
            {
             before(grammarAccess.getFunctionCallAccess().getGroup()); 
            // InternalMyDsl.g:1119:3: ( rule__FunctionCall__Group__0 )
            // InternalMyDsl.g:1119:4: rule__FunctionCall__Group__0
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


    // $ANTLR start "entryRuleExpressionType"
    // InternalMyDsl.g:1128:1: entryRuleExpressionType : ruleExpressionType EOF ;
    public final void entryRuleExpressionType() throws RecognitionException {
        try {
            // InternalMyDsl.g:1129:1: ( ruleExpressionType EOF )
            // InternalMyDsl.g:1130:1: ruleExpressionType EOF
            {
             before(grammarAccess.getExpressionTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleExpressionType();

            state._fsp--;

             after(grammarAccess.getExpressionTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpressionType"


    // $ANTLR start "ruleExpressionType"
    // InternalMyDsl.g:1137:1: ruleExpressionType : ( ruleTypeName ) ;
    public final void ruleExpressionType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1141:2: ( ( ruleTypeName ) )
            // InternalMyDsl.g:1142:2: ( ruleTypeName )
            {
            // InternalMyDsl.g:1142:2: ( ruleTypeName )
            // InternalMyDsl.g:1143:3: ruleTypeName
            {
             before(grammarAccess.getExpressionTypeAccess().getTypeNameParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleTypeName();

            state._fsp--;

             after(grammarAccess.getExpressionTypeAccess().getTypeNameParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpressionType"


    // $ANTLR start "entryRuleTypeInstance"
    // InternalMyDsl.g:1153:1: entryRuleTypeInstance : ruleTypeInstance EOF ;
    public final void entryRuleTypeInstance() throws RecognitionException {
        try {
            // InternalMyDsl.g:1154:1: ( ruleTypeInstance EOF )
            // InternalMyDsl.g:1155:1: ruleTypeInstance EOF
            {
             before(grammarAccess.getTypeInstanceRule()); 
            pushFollow(FOLLOW_1);
            ruleTypeInstance();

            state._fsp--;

             after(grammarAccess.getTypeInstanceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTypeInstance"


    // $ANTLR start "ruleTypeInstance"
    // InternalMyDsl.g:1162:1: ruleTypeInstance : ( ( rule__TypeInstance__Alternatives ) ) ;
    public final void ruleTypeInstance() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1166:2: ( ( ( rule__TypeInstance__Alternatives ) ) )
            // InternalMyDsl.g:1167:2: ( ( rule__TypeInstance__Alternatives ) )
            {
            // InternalMyDsl.g:1167:2: ( ( rule__TypeInstance__Alternatives ) )
            // InternalMyDsl.g:1168:3: ( rule__TypeInstance__Alternatives )
            {
             before(grammarAccess.getTypeInstanceAccess().getAlternatives()); 
            // InternalMyDsl.g:1169:3: ( rule__TypeInstance__Alternatives )
            // InternalMyDsl.g:1169:4: rule__TypeInstance__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TypeInstance__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeInstanceAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypeInstance"


    // $ANTLR start "entryRuleInbuiltInfix"
    // InternalMyDsl.g:1178:1: entryRuleInbuiltInfix : ruleInbuiltInfix EOF ;
    public final void entryRuleInbuiltInfix() throws RecognitionException {
        try {
            // InternalMyDsl.g:1179:1: ( ruleInbuiltInfix EOF )
            // InternalMyDsl.g:1180:1: ruleInbuiltInfix EOF
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
    // InternalMyDsl.g:1187:1: ruleInbuiltInfix : ( ( rule__InbuiltInfix__Alternatives ) ) ;
    public final void ruleInbuiltInfix() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1191:2: ( ( ( rule__InbuiltInfix__Alternatives ) ) )
            // InternalMyDsl.g:1192:2: ( ( rule__InbuiltInfix__Alternatives ) )
            {
            // InternalMyDsl.g:1192:2: ( ( rule__InbuiltInfix__Alternatives ) )
            // InternalMyDsl.g:1193:3: ( rule__InbuiltInfix__Alternatives )
            {
             before(grammarAccess.getInbuiltInfixAccess().getAlternatives()); 
            // InternalMyDsl.g:1194:3: ( rule__InbuiltInfix__Alternatives )
            // InternalMyDsl.g:1194:4: rule__InbuiltInfix__Alternatives
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


    // $ANTLR start "entryRuleInbuiltType"
    // InternalMyDsl.g:1203:1: entryRuleInbuiltType : ruleInbuiltType EOF ;
    public final void entryRuleInbuiltType() throws RecognitionException {
        try {
            // InternalMyDsl.g:1204:1: ( ruleInbuiltType EOF )
            // InternalMyDsl.g:1205:1: ruleInbuiltType EOF
            {
             before(grammarAccess.getInbuiltTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleInbuiltType();

            state._fsp--;

             after(grammarAccess.getInbuiltTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInbuiltType"


    // $ANTLR start "ruleInbuiltType"
    // InternalMyDsl.g:1212:1: ruleInbuiltType : ( 'Pred' ) ;
    public final void ruleInbuiltType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1216:2: ( ( 'Pred' ) )
            // InternalMyDsl.g:1217:2: ( 'Pred' )
            {
            // InternalMyDsl.g:1217:2: ( 'Pred' )
            // InternalMyDsl.g:1218:3: 'Pred'
            {
             before(grammarAccess.getInbuiltTypeAccess().getPredKeyword()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getInbuiltTypeAccess().getPredKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInbuiltType"


    // $ANTLR start "entryRuleInbuiltTypeScan"
    // InternalMyDsl.g:1228:1: entryRuleInbuiltTypeScan : ruleInbuiltTypeScan EOF ;
    public final void entryRuleInbuiltTypeScan() throws RecognitionException {
        try {
            // InternalMyDsl.g:1229:1: ( ruleInbuiltTypeScan EOF )
            // InternalMyDsl.g:1230:1: ruleInbuiltTypeScan EOF
            {
             before(grammarAccess.getInbuiltTypeScanRule()); 
            pushFollow(FOLLOW_1);
            ruleInbuiltTypeScan();

            state._fsp--;

             after(grammarAccess.getInbuiltTypeScanRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInbuiltTypeScan"


    // $ANTLR start "ruleInbuiltTypeScan"
    // InternalMyDsl.g:1237:1: ruleInbuiltTypeScan : ( ( rule__InbuiltTypeScan__NameAssignment ) ) ;
    public final void ruleInbuiltTypeScan() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1241:2: ( ( ( rule__InbuiltTypeScan__NameAssignment ) ) )
            // InternalMyDsl.g:1242:2: ( ( rule__InbuiltTypeScan__NameAssignment ) )
            {
            // InternalMyDsl.g:1242:2: ( ( rule__InbuiltTypeScan__NameAssignment ) )
            // InternalMyDsl.g:1243:3: ( rule__InbuiltTypeScan__NameAssignment )
            {
             before(grammarAccess.getInbuiltTypeScanAccess().getNameAssignment()); 
            // InternalMyDsl.g:1244:3: ( rule__InbuiltTypeScan__NameAssignment )
            // InternalMyDsl.g:1244:4: rule__InbuiltTypeScan__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__InbuiltTypeScan__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getInbuiltTypeScanAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInbuiltTypeScan"


    // $ANTLR start "entryRuleInstance"
    // InternalMyDsl.g:1253:1: entryRuleInstance : ruleInstance EOF ;
    public final void entryRuleInstance() throws RecognitionException {
        try {
            // InternalMyDsl.g:1254:1: ( ruleInstance EOF )
            // InternalMyDsl.g:1255:1: ruleInstance EOF
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
    // InternalMyDsl.g:1262:1: ruleInstance : ( ( rule__Instance__Group__0 ) ) ;
    public final void ruleInstance() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1266:2: ( ( ( rule__Instance__Group__0 ) ) )
            // InternalMyDsl.g:1267:2: ( ( rule__Instance__Group__0 ) )
            {
            // InternalMyDsl.g:1267:2: ( ( rule__Instance__Group__0 ) )
            // InternalMyDsl.g:1268:3: ( rule__Instance__Group__0 )
            {
             before(grammarAccess.getInstanceAccess().getGroup()); 
            // InternalMyDsl.g:1269:3: ( rule__Instance__Group__0 )
            // InternalMyDsl.g:1269:4: rule__Instance__Group__0
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


    // $ANTLR start "rule__TopLevel__Alternatives"
    // InternalMyDsl.g:1277:1: rule__TopLevel__Alternatives : ( ( ruleImportStatement ) | ( ruleClassDecl ) | ( ruleExtend ) | ( ruleInstance ) );
    public final void rule__TopLevel__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1281:1: ( ( ruleImportStatement ) | ( ruleClassDecl ) | ( ruleExtend ) | ( ruleInstance ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt2=1;
                }
                break;
            case 35:
            case 45:
                {
                alt2=2;
                }
                break;
            case 47:
                {
                alt2=3;
                }
                break;
            case 51:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:1282:2: ( ruleImportStatement )
                    {
                    // InternalMyDsl.g:1282:2: ( ruleImportStatement )
                    // InternalMyDsl.g:1283:3: ruleImportStatement
                    {
                     before(grammarAccess.getTopLevelAccess().getImportStatementParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleImportStatement();

                    state._fsp--;

                     after(grammarAccess.getTopLevelAccess().getImportStatementParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1288:2: ( ruleClassDecl )
                    {
                    // InternalMyDsl.g:1288:2: ( ruleClassDecl )
                    // InternalMyDsl.g:1289:3: ruleClassDecl
                    {
                     before(grammarAccess.getTopLevelAccess().getClassDeclParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleClassDecl();

                    state._fsp--;

                     after(grammarAccess.getTopLevelAccess().getClassDeclParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1294:2: ( ruleExtend )
                    {
                    // InternalMyDsl.g:1294:2: ( ruleExtend )
                    // InternalMyDsl.g:1295:3: ruleExtend
                    {
                     before(grammarAccess.getTopLevelAccess().getExtendParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleExtend();

                    state._fsp--;

                     after(grammarAccess.getTopLevelAccess().getExtendParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1300:2: ( ruleInstance )
                    {
                    // InternalMyDsl.g:1300:2: ( ruleInstance )
                    // InternalMyDsl.g:1301:3: ruleInstance
                    {
                     before(grammarAccess.getTopLevelAccess().getInstanceParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleInstance();

                    state._fsp--;

                     after(grammarAccess.getTopLevelAccess().getInstanceParserRuleCall_3()); 

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
    // $ANTLR end "rule__TopLevel__Alternatives"


    // $ANTLR start "rule__ClassDecl__Alternatives"
    // InternalMyDsl.g:1310:1: rule__ClassDecl__Alternatives : ( ( ruleClass ) | ( ruleDatatype ) );
    public final void rule__ClassDecl__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1314:1: ( ( ruleClass ) | ( ruleDatatype ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==35) ) {
                alt3=1;
            }
            else if ( (LA3_0==45) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:1315:2: ( ruleClass )
                    {
                    // InternalMyDsl.g:1315:2: ( ruleClass )
                    // InternalMyDsl.g:1316:3: ruleClass
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
                    // InternalMyDsl.g:1321:2: ( ruleDatatype )
                    {
                    // InternalMyDsl.g:1321:2: ( ruleDatatype )
                    // InternalMyDsl.g:1322:3: ruleDatatype
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


    // $ANTLR start "rule__ConstructedType__Alternatives_1_0"
    // InternalMyDsl.g:1331:1: rule__ConstructedType__Alternatives_1_0 : ( ( '\\u00D7' ) | ( '\\u2192' ) | ( '\\uE102' ) | ( '\\uE100' ) | ( '\\u2194' ) | ( '\\u2916' ) | ( '\\u21F8' ) | ( '\\u21A3' ) | ( '\\u2900' ) | ( '\\u21A0' ) );
    public final void rule__ConstructedType__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1335:1: ( ( '\\u00D7' ) | ( '\\u2192' ) | ( '\\uE102' ) | ( '\\uE100' ) | ( '\\u2194' ) | ( '\\u2916' ) | ( '\\u21F8' ) | ( '\\u21A3' ) | ( '\\u2900' ) | ( '\\u21A0' ) )
            int alt4=10;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt4=1;
                }
                break;
            case 14:
                {
                alt4=2;
                }
                break;
            case 15:
                {
                alt4=3;
                }
                break;
            case 16:
                {
                alt4=4;
                }
                break;
            case 17:
                {
                alt4=5;
                }
                break;
            case 18:
                {
                alt4=6;
                }
                break;
            case 19:
                {
                alt4=7;
                }
                break;
            case 20:
                {
                alt4=8;
                }
                break;
            case 21:
                {
                alt4=9;
                }
                break;
            case 22:
                {
                alt4=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:1336:2: ( '\\u00D7' )
                    {
                    // InternalMyDsl.g:1336:2: ( '\\u00D7' )
                    // InternalMyDsl.g:1337:3: '\\u00D7'
                    {
                     before(grammarAccess.getConstructedTypeAccess().getMultiplicationSignKeyword_1_0_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getConstructedTypeAccess().getMultiplicationSignKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1342:2: ( '\\u2192' )
                    {
                    // InternalMyDsl.g:1342:2: ( '\\u2192' )
                    // InternalMyDsl.g:1343:3: '\\u2192'
                    {
                     before(grammarAccess.getConstructedTypeAccess().getRightwardsArrowKeyword_1_0_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getConstructedTypeAccess().getRightwardsArrowKeyword_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1348:2: ( '\\uE102' )
                    {
                    // InternalMyDsl.g:1348:2: ( '\\uE102' )
                    // InternalMyDsl.g:1349:3: '\\uE102'
                    {
                     before(grammarAccess.getConstructedTypeAccess().getPrivateUseAreaE102Keyword_1_0_2()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getConstructedTypeAccess().getPrivateUseAreaE102Keyword_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1354:2: ( '\\uE100' )
                    {
                    // InternalMyDsl.g:1354:2: ( '\\uE100' )
                    // InternalMyDsl.g:1355:3: '\\uE100'
                    {
                     before(grammarAccess.getConstructedTypeAccess().getPrivateUseAreaE100Keyword_1_0_3()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getConstructedTypeAccess().getPrivateUseAreaE100Keyword_1_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:1360:2: ( '\\u2194' )
                    {
                    // InternalMyDsl.g:1360:2: ( '\\u2194' )
                    // InternalMyDsl.g:1361:3: '\\u2194'
                    {
                     before(grammarAccess.getConstructedTypeAccess().getLeftRightArrowKeyword_1_0_4()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getConstructedTypeAccess().getLeftRightArrowKeyword_1_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:1366:2: ( '\\u2916' )
                    {
                    // InternalMyDsl.g:1366:2: ( '\\u2916' )
                    // InternalMyDsl.g:1367:3: '\\u2916'
                    {
                     before(grammarAccess.getConstructedTypeAccess().getRightwardsTwoHeadedArrowWithTailKeyword_1_0_5()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getConstructedTypeAccess().getRightwardsTwoHeadedArrowWithTailKeyword_1_0_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:1372:2: ( '\\u21F8' )
                    {
                    // InternalMyDsl.g:1372:2: ( '\\u21F8' )
                    // InternalMyDsl.g:1373:3: '\\u21F8'
                    {
                     before(grammarAccess.getConstructedTypeAccess().getRightwardsArrowWithVerticalStrokeKeyword_1_0_6()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getConstructedTypeAccess().getRightwardsArrowWithVerticalStrokeKeyword_1_0_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:1378:2: ( '\\u21A3' )
                    {
                    // InternalMyDsl.g:1378:2: ( '\\u21A3' )
                    // InternalMyDsl.g:1379:3: '\\u21A3'
                    {
                     before(grammarAccess.getConstructedTypeAccess().getRightwardsArrowWithTailKeyword_1_0_7()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getConstructedTypeAccess().getRightwardsArrowWithTailKeyword_1_0_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalMyDsl.g:1384:2: ( '\\u2900' )
                    {
                    // InternalMyDsl.g:1384:2: ( '\\u2900' )
                    // InternalMyDsl.g:1385:3: '\\u2900'
                    {
                     before(grammarAccess.getConstructedTypeAccess().getRightwardsTwoHeadedArrowWithVerticalStrokeKeyword_1_0_8()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getConstructedTypeAccess().getRightwardsTwoHeadedArrowWithVerticalStrokeKeyword_1_0_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalMyDsl.g:1390:2: ( '\\u21A0' )
                    {
                    // InternalMyDsl.g:1390:2: ( '\\u21A0' )
                    // InternalMyDsl.g:1391:3: '\\u21A0'
                    {
                     before(grammarAccess.getConstructedTypeAccess().getRightwardsTwoHeadedArrowKeyword_1_0_9()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getConstructedTypeAccess().getRightwardsTwoHeadedArrowKeyword_1_0_9()); 

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
    // $ANTLR end "rule__ConstructedType__Alternatives_1_0"


    // $ANTLR start "rule__TypeConstructor__Alternatives_0"
    // InternalMyDsl.g:1400:1: rule__TypeConstructor__Alternatives_0 : ( ( ( rule__TypeConstructor__TypeNameAssignment_0_0 ) ) | ( ruleInbuiltTypeScan ) );
    public final void rule__TypeConstructor__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1404:1: ( ( ( rule__TypeConstructor__TypeNameAssignment_0_0 ) ) | ( ruleInbuiltTypeScan ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            else if ( (LA5_0==12) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:1405:2: ( ( rule__TypeConstructor__TypeNameAssignment_0_0 ) )
                    {
                    // InternalMyDsl.g:1405:2: ( ( rule__TypeConstructor__TypeNameAssignment_0_0 ) )
                    // InternalMyDsl.g:1406:3: ( rule__TypeConstructor__TypeNameAssignment_0_0 )
                    {
                     before(grammarAccess.getTypeConstructorAccess().getTypeNameAssignment_0_0()); 
                    // InternalMyDsl.g:1407:3: ( rule__TypeConstructor__TypeNameAssignment_0_0 )
                    // InternalMyDsl.g:1407:4: rule__TypeConstructor__TypeNameAssignment_0_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TypeConstructor__TypeNameAssignment_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeConstructorAccess().getTypeNameAssignment_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1411:2: ( ruleInbuiltTypeScan )
                    {
                    // InternalMyDsl.g:1411:2: ( ruleInbuiltTypeScan )
                    // InternalMyDsl.g:1412:3: ruleInbuiltTypeScan
                    {
                     before(grammarAccess.getTypeConstructorAccess().getInbuiltTypeScanParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleInbuiltTypeScan();

                    state._fsp--;

                     after(grammarAccess.getTypeConstructorAccess().getInbuiltTypeScanParserRuleCall_0_1()); 

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
    // $ANTLR end "rule__TypeConstructor__Alternatives_0"


    // $ANTLR start "rule__TypeBodyElements__Alternatives"
    // InternalMyDsl.g:1421:1: rule__TypeBodyElements__Alternatives : ( ( ( rule__TypeBodyElements__FunctionsAssignment_0 ) ) | ( ( rule__TypeBodyElements__TheoremsAssignment_1 ) ) );
    public final void rule__TypeBodyElements__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1425:1: ( ( ( rule__TypeBodyElements__FunctionsAssignment_0 ) ) | ( ( rule__TypeBodyElements__TheoremsAssignment_1 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            else if ( (LA6_0==49) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:1426:2: ( ( rule__TypeBodyElements__FunctionsAssignment_0 ) )
                    {
                    // InternalMyDsl.g:1426:2: ( ( rule__TypeBodyElements__FunctionsAssignment_0 ) )
                    // InternalMyDsl.g:1427:3: ( rule__TypeBodyElements__FunctionsAssignment_0 )
                    {
                     before(grammarAccess.getTypeBodyElementsAccess().getFunctionsAssignment_0()); 
                    // InternalMyDsl.g:1428:3: ( rule__TypeBodyElements__FunctionsAssignment_0 )
                    // InternalMyDsl.g:1428:4: rule__TypeBodyElements__FunctionsAssignment_0
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
                    // InternalMyDsl.g:1432:2: ( ( rule__TypeBodyElements__TheoremsAssignment_1 ) )
                    {
                    // InternalMyDsl.g:1432:2: ( ( rule__TypeBodyElements__TheoremsAssignment_1 ) )
                    // InternalMyDsl.g:1433:3: ( rule__TypeBodyElements__TheoremsAssignment_1 )
                    {
                     before(grammarAccess.getTypeBodyElementsAccess().getTheoremsAssignment_1()); 
                    // InternalMyDsl.g:1434:3: ( rule__TypeBodyElements__TheoremsAssignment_1 )
                    // InternalMyDsl.g:1434:4: rule__TypeBodyElements__TheoremsAssignment_1
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


    // $ANTLR start "rule__FunctionBody__Alternatives"
    // InternalMyDsl.g:1442:1: rule__FunctionBody__Alternatives : ( ( ruleFuncInductive ) | ( ruleFuncDirectDef ) );
    public final void rule__FunctionBody__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1446:1: ( ( ruleFuncInductive ) | ( ruleFuncDirectDef ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==48) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_ID||LA7_0==11||(LA7_0>=23 && LA7_0<=24)||LA7_0==42||LA7_0==53) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:1447:2: ( ruleFuncInductive )
                    {
                    // InternalMyDsl.g:1447:2: ( ruleFuncInductive )
                    // InternalMyDsl.g:1448:3: ruleFuncInductive
                    {
                     before(grammarAccess.getFunctionBodyAccess().getFuncInductiveParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleFuncInductive();

                    state._fsp--;

                     after(grammarAccess.getFunctionBodyAccess().getFuncInductiveParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1453:2: ( ruleFuncDirectDef )
                    {
                    // InternalMyDsl.g:1453:2: ( ruleFuncDirectDef )
                    // InternalMyDsl.g:1454:3: ruleFuncDirectDef
                    {
                     before(grammarAccess.getFunctionBodyAccess().getFuncDirectDefParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleFuncDirectDef();

                    state._fsp--;

                     after(grammarAccess.getFunctionBodyAccess().getFuncDirectDefParserRuleCall_1()); 

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
    // $ANTLR end "rule__FunctionBody__Alternatives"


    // $ANTLR start "rule__Quantifier__QTypeAlternatives_0_0"
    // InternalMyDsl.g:1463:1: rule__Quantifier__QTypeAlternatives_0_0 : ( ( '\\u2200' ) | ( '\\u2203' ) );
    public final void rule__Quantifier__QTypeAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1467:1: ( ( '\\u2200' ) | ( '\\u2203' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==23) ) {
                alt8=1;
            }
            else if ( (LA8_0==24) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:1468:2: ( '\\u2200' )
                    {
                    // InternalMyDsl.g:1468:2: ( '\\u2200' )
                    // InternalMyDsl.g:1469:3: '\\u2200'
                    {
                     before(grammarAccess.getQuantifierAccess().getQTypeForAllKeyword_0_0_0()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getQuantifierAccess().getQTypeForAllKeyword_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1474:2: ( '\\u2203' )
                    {
                    // InternalMyDsl.g:1474:2: ( '\\u2203' )
                    // InternalMyDsl.g:1475:3: '\\u2203'
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
    // InternalMyDsl.g:1484:1: rule__RootExpression__Alternatives : ( ( ruleLambda ) | ( ruleQuantifier ) | ( ruleInfix ) );
    public final void rule__RootExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1488:1: ( ( ruleLambda ) | ( ruleQuantifier ) | ( ruleInfix ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 53:
                {
                alt9=1;
                }
                break;
            case 23:
            case 24:
                {
                alt9=2;
                }
                break;
            case RULE_ID:
            case 11:
            case 42:
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
                    // InternalMyDsl.g:1489:2: ( ruleLambda )
                    {
                    // InternalMyDsl.g:1489:2: ( ruleLambda )
                    // InternalMyDsl.g:1490:3: ruleLambda
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
                    // InternalMyDsl.g:1495:2: ( ruleQuantifier )
                    {
                    // InternalMyDsl.g:1495:2: ( ruleQuantifier )
                    // InternalMyDsl.g:1496:3: ruleQuantifier
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
                    // InternalMyDsl.g:1501:2: ( ruleInfix )
                    {
                    // InternalMyDsl.g:1501:2: ( ruleInfix )
                    // InternalMyDsl.g:1502:3: ruleInfix
                    {
                     before(grammarAccess.getRootExpressionAccess().getInfixParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleInfix();

                    state._fsp--;

                     after(grammarAccess.getRootExpressionAccess().getInfixParserRuleCall_2()); 

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
    // InternalMyDsl.g:1511:1: rule__Infix__Alternatives_1_1 : ( ( ( rule__Infix__FuncNameAssignment_1_1_0 ) ) | ( ( rule__Infix__OpNameAssignment_1_1_1 ) ) );
    public final void rule__Infix__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1515:1: ( ( ( rule__Infix__FuncNameAssignment_1_1_0 ) ) | ( ( rule__Infix__OpNameAssignment_1_1_1 ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                alt10=1;
            }
            else if ( ((LA10_0>=25 && LA10_0<=30)) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:1516:2: ( ( rule__Infix__FuncNameAssignment_1_1_0 ) )
                    {
                    // InternalMyDsl.g:1516:2: ( ( rule__Infix__FuncNameAssignment_1_1_0 ) )
                    // InternalMyDsl.g:1517:3: ( rule__Infix__FuncNameAssignment_1_1_0 )
                    {
                     before(grammarAccess.getInfixAccess().getFuncNameAssignment_1_1_0()); 
                    // InternalMyDsl.g:1518:3: ( rule__Infix__FuncNameAssignment_1_1_0 )
                    // InternalMyDsl.g:1518:4: rule__Infix__FuncNameAssignment_1_1_0
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
                    // InternalMyDsl.g:1522:2: ( ( rule__Infix__OpNameAssignment_1_1_1 ) )
                    {
                    // InternalMyDsl.g:1522:2: ( ( rule__Infix__OpNameAssignment_1_1_1 ) )
                    // InternalMyDsl.g:1523:3: ( rule__Infix__OpNameAssignment_1_1_1 )
                    {
                     before(grammarAccess.getInfixAccess().getOpNameAssignment_1_1_1()); 
                    // InternalMyDsl.g:1524:3: ( rule__Infix__OpNameAssignment_1_1_1 )
                    // InternalMyDsl.g:1524:4: rule__Infix__OpNameAssignment_1_1_1
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
    // InternalMyDsl.g:1532:1: rule__Element__Alternatives : ( ( ruleBracket ) | ( rulePrefix ) | ( ruleFunctionCall ) );
    public final void rule__Element__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1536:1: ( ( ruleBracket ) | ( rulePrefix ) | ( ruleFunctionCall ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt11=1;
                }
                break;
            case 11:
                {
                alt11=2;
                }
                break;
            case RULE_ID:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:1537:2: ( ruleBracket )
                    {
                    // InternalMyDsl.g:1537:2: ( ruleBracket )
                    // InternalMyDsl.g:1538:3: ruleBracket
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
                    // InternalMyDsl.g:1543:2: ( rulePrefix )
                    {
                    // InternalMyDsl.g:1543:2: ( rulePrefix )
                    // InternalMyDsl.g:1544:3: rulePrefix
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
                    // InternalMyDsl.g:1549:2: ( ruleFunctionCall )
                    {
                    // InternalMyDsl.g:1549:2: ( ruleFunctionCall )
                    // InternalMyDsl.g:1550:3: ruleFunctionCall
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


    // $ANTLR start "rule__TypeInstance__Alternatives"
    // InternalMyDsl.g:1559:1: rule__TypeInstance__Alternatives : ( ( ( rule__TypeInstance__InstanceAssignment_0 ) ) | ( ( rule__TypeInstance__Group_1__0 ) ) );
    public final void rule__TypeInstance__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1563:1: ( ( ( rule__TypeInstance__InstanceAssignment_0 ) ) | ( ( rule__TypeInstance__Group_1__0 ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==EOF||LA12_1==RULE_ID||(LA12_1>=25 && LA12_1<=30)||(LA12_1>=36 && LA12_1<=38)||(LA12_1>=41 && LA12_1<=43)||LA12_1==46||LA12_1==49) ) {
                    alt12=1;
                }
                else if ( (LA12_1==34) ) {
                    alt12=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:1564:2: ( ( rule__TypeInstance__InstanceAssignment_0 ) )
                    {
                    // InternalMyDsl.g:1564:2: ( ( rule__TypeInstance__InstanceAssignment_0 ) )
                    // InternalMyDsl.g:1565:3: ( rule__TypeInstance__InstanceAssignment_0 )
                    {
                     before(grammarAccess.getTypeInstanceAccess().getInstanceAssignment_0()); 
                    // InternalMyDsl.g:1566:3: ( rule__TypeInstance__InstanceAssignment_0 )
                    // InternalMyDsl.g:1566:4: rule__TypeInstance__InstanceAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TypeInstance__InstanceAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeInstanceAccess().getInstanceAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1570:2: ( ( rule__TypeInstance__Group_1__0 ) )
                    {
                    // InternalMyDsl.g:1570:2: ( ( rule__TypeInstance__Group_1__0 ) )
                    // InternalMyDsl.g:1571:3: ( rule__TypeInstance__Group_1__0 )
                    {
                     before(grammarAccess.getTypeInstanceAccess().getGroup_1()); 
                    // InternalMyDsl.g:1572:3: ( rule__TypeInstance__Group_1__0 )
                    // InternalMyDsl.g:1572:4: rule__TypeInstance__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TypeInstance__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeInstanceAccess().getGroup_1()); 

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
    // $ANTLR end "rule__TypeInstance__Alternatives"


    // $ANTLR start "rule__InbuiltInfix__Alternatives"
    // InternalMyDsl.g:1580:1: rule__InbuiltInfix__Alternatives : ( ( '\\u21D4' ) | ( '\\u21D2' ) | ( '=' ) | ( '\\u2260' ) | ( '\\u2227' ) | ( '\\u2228' ) );
    public final void rule__InbuiltInfix__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1584:1: ( ( '\\u21D4' ) | ( '\\u21D2' ) | ( '=' ) | ( '\\u2260' ) | ( '\\u2227' ) | ( '\\u2228' ) )
            int alt13=6;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt13=1;
                }
                break;
            case 26:
                {
                alt13=2;
                }
                break;
            case 27:
                {
                alt13=3;
                }
                break;
            case 28:
                {
                alt13=4;
                }
                break;
            case 29:
                {
                alt13=5;
                }
                break;
            case 30:
                {
                alt13=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalMyDsl.g:1585:2: ( '\\u21D4' )
                    {
                    // InternalMyDsl.g:1585:2: ( '\\u21D4' )
                    // InternalMyDsl.g:1586:3: '\\u21D4'
                    {
                     before(grammarAccess.getInbuiltInfixAccess().getLeftRightDoubleArrowKeyword_0()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getInbuiltInfixAccess().getLeftRightDoubleArrowKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1591:2: ( '\\u21D2' )
                    {
                    // InternalMyDsl.g:1591:2: ( '\\u21D2' )
                    // InternalMyDsl.g:1592:3: '\\u21D2'
                    {
                     before(grammarAccess.getInbuiltInfixAccess().getRightwardsDoubleArrowKeyword_1()); 
                    match(input,26,FOLLOW_2); 
                     after(grammarAccess.getInbuiltInfixAccess().getRightwardsDoubleArrowKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1597:2: ( '=' )
                    {
                    // InternalMyDsl.g:1597:2: ( '=' )
                    // InternalMyDsl.g:1598:3: '='
                    {
                     before(grammarAccess.getInbuiltInfixAccess().getEqualsSignKeyword_2()); 
                    match(input,27,FOLLOW_2); 
                     after(grammarAccess.getInbuiltInfixAccess().getEqualsSignKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1603:2: ( '\\u2260' )
                    {
                    // InternalMyDsl.g:1603:2: ( '\\u2260' )
                    // InternalMyDsl.g:1604:3: '\\u2260'
                    {
                     before(grammarAccess.getInbuiltInfixAccess().getNotEqualToKeyword_3()); 
                    match(input,28,FOLLOW_2); 
                     after(grammarAccess.getInbuiltInfixAccess().getNotEqualToKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:1609:2: ( '\\u2227' )
                    {
                    // InternalMyDsl.g:1609:2: ( '\\u2227' )
                    // InternalMyDsl.g:1610:3: '\\u2227'
                    {
                     before(grammarAccess.getInbuiltInfixAccess().getLogicalAndKeyword_4()); 
                    match(input,29,FOLLOW_2); 
                     after(grammarAccess.getInbuiltInfixAccess().getLogicalAndKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:1615:2: ( '\\u2228' )
                    {
                    // InternalMyDsl.g:1615:2: ( '\\u2228' )
                    // InternalMyDsl.g:1616:3: '\\u2228'
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


    // $ANTLR start "rule__THM_NAME__Group__0"
    // InternalMyDsl.g:1625:1: rule__THM_NAME__Group__0 : rule__THM_NAME__Group__0__Impl rule__THM_NAME__Group__1 ;
    public final void rule__THM_NAME__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1629:1: ( rule__THM_NAME__Group__0__Impl rule__THM_NAME__Group__1 )
            // InternalMyDsl.g:1630:2: rule__THM_NAME__Group__0__Impl rule__THM_NAME__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalMyDsl.g:1637:1: rule__THM_NAME__Group__0__Impl : ( ( '^' )* ) ;
    public final void rule__THM_NAME__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1641:1: ( ( ( '^' )* ) )
            // InternalMyDsl.g:1642:1: ( ( '^' )* )
            {
            // InternalMyDsl.g:1642:1: ( ( '^' )* )
            // InternalMyDsl.g:1643:2: ( '^' )*
            {
             before(grammarAccess.getTHM_NAMEAccess().getCircumflexAccentKeyword_0()); 
            // InternalMyDsl.g:1644:2: ( '^' )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==31) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMyDsl.g:1644:3: '^'
            	    {
            	    match(input,31,FOLLOW_5); 

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getTHM_NAMEAccess().getCircumflexAccentKeyword_0()); 

            }


            }

        }
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
    // InternalMyDsl.g:1652:1: rule__THM_NAME__Group__1 : rule__THM_NAME__Group__1__Impl ;
    public final void rule__THM_NAME__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1656:1: ( rule__THM_NAME__Group__1__Impl )
            // InternalMyDsl.g:1657:2: rule__THM_NAME__Group__1__Impl
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
    // InternalMyDsl.g:1663:1: rule__THM_NAME__Group__1__Impl : ( ':' ) ;
    public final void rule__THM_NAME__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1667:1: ( ( ':' ) )
            // InternalMyDsl.g:1668:1: ( ':' )
            {
            // InternalMyDsl.g:1668:1: ( ':' )
            // InternalMyDsl.g:1669:2: ':'
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


    // $ANTLR start "rule__ImportStatement__Group__0"
    // InternalMyDsl.g:1679:1: rule__ImportStatement__Group__0 : rule__ImportStatement__Group__0__Impl rule__ImportStatement__Group__1 ;
    public final void rule__ImportStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1683:1: ( rule__ImportStatement__Group__0__Impl rule__ImportStatement__Group__1 )
            // InternalMyDsl.g:1684:2: rule__ImportStatement__Group__0__Impl rule__ImportStatement__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__ImportStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImportStatement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportStatement__Group__0"


    // $ANTLR start "rule__ImportStatement__Group__0__Impl"
    // InternalMyDsl.g:1691:1: rule__ImportStatement__Group__0__Impl : ( 'Import' ) ;
    public final void rule__ImportStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1695:1: ( ( 'Import' ) )
            // InternalMyDsl.g:1696:1: ( 'Import' )
            {
            // InternalMyDsl.g:1696:1: ( 'Import' )
            // InternalMyDsl.g:1697:2: 'Import'
            {
             before(grammarAccess.getImportStatementAccess().getImportKeyword_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getImportStatementAccess().getImportKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportStatement__Group__0__Impl"


    // $ANTLR start "rule__ImportStatement__Group__1"
    // InternalMyDsl.g:1706:1: rule__ImportStatement__Group__1 : rule__ImportStatement__Group__1__Impl ;
    public final void rule__ImportStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1710:1: ( rule__ImportStatement__Group__1__Impl )
            // InternalMyDsl.g:1711:2: rule__ImportStatement__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ImportStatement__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportStatement__Group__1"


    // $ANTLR start "rule__ImportStatement__Group__1__Impl"
    // InternalMyDsl.g:1717:1: rule__ImportStatement__Group__1__Impl : ( ( rule__ImportStatement__ImportsAssignment_1 ) ) ;
    public final void rule__ImportStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1721:1: ( ( ( rule__ImportStatement__ImportsAssignment_1 ) ) )
            // InternalMyDsl.g:1722:1: ( ( rule__ImportStatement__ImportsAssignment_1 ) )
            {
            // InternalMyDsl.g:1722:1: ( ( rule__ImportStatement__ImportsAssignment_1 ) )
            // InternalMyDsl.g:1723:2: ( rule__ImportStatement__ImportsAssignment_1 )
            {
             before(grammarAccess.getImportStatementAccess().getImportsAssignment_1()); 
            // InternalMyDsl.g:1724:2: ( rule__ImportStatement__ImportsAssignment_1 )
            // InternalMyDsl.g:1724:3: rule__ImportStatement__ImportsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ImportStatement__ImportsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getImportStatementAccess().getImportsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportStatement__Group__1__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // InternalMyDsl.g:1733:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1737:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalMyDsl.g:1738:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Import__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Import__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0"


    // $ANTLR start "rule__Import__Group__0__Impl"
    // InternalMyDsl.g:1745:1: rule__Import__Group__0__Impl : ( ( rule__Import__ImportNameAssignment_0 ) ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1749:1: ( ( ( rule__Import__ImportNameAssignment_0 ) ) )
            // InternalMyDsl.g:1750:1: ( ( rule__Import__ImportNameAssignment_0 ) )
            {
            // InternalMyDsl.g:1750:1: ( ( rule__Import__ImportNameAssignment_0 ) )
            // InternalMyDsl.g:1751:2: ( rule__Import__ImportNameAssignment_0 )
            {
             before(grammarAccess.getImportAccess().getImportNameAssignment_0()); 
            // InternalMyDsl.g:1752:2: ( rule__Import__ImportNameAssignment_0 )
            // InternalMyDsl.g:1752:3: rule__Import__ImportNameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Import__ImportNameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getImportNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0__Impl"


    // $ANTLR start "rule__Import__Group__1"
    // InternalMyDsl.g:1760:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1764:1: ( rule__Import__Group__1__Impl )
            // InternalMyDsl.g:1765:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1"


    // $ANTLR start "rule__Import__Group__1__Impl"
    // InternalMyDsl.g:1771:1: rule__Import__Group__1__Impl : ( ( rule__Import__Group_1__0 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1775:1: ( ( ( rule__Import__Group_1__0 ) ) )
            // InternalMyDsl.g:1776:1: ( ( rule__Import__Group_1__0 ) )
            {
            // InternalMyDsl.g:1776:1: ( ( rule__Import__Group_1__0 ) )
            // InternalMyDsl.g:1777:2: ( rule__Import__Group_1__0 )
            {
             before(grammarAccess.getImportAccess().getGroup_1()); 
            // InternalMyDsl.g:1778:2: ( rule__Import__Group_1__0 )
            // InternalMyDsl.g:1778:3: rule__Import__Group_1__0
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1__Impl"


    // $ANTLR start "rule__Import__Group_1__0"
    // InternalMyDsl.g:1787:1: rule__Import__Group_1__0 : rule__Import__Group_1__0__Impl rule__Import__Group_1__1 ;
    public final void rule__Import__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1791:1: ( rule__Import__Group_1__0__Impl rule__Import__Group_1__1 )
            // InternalMyDsl.g:1792:2: rule__Import__Group_1__0__Impl rule__Import__Group_1__1
            {
            pushFollow(FOLLOW_6);
            rule__Import__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Import__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group_1__0"


    // $ANTLR start "rule__Import__Group_1__0__Impl"
    // InternalMyDsl.g:1799:1: rule__Import__Group_1__0__Impl : ( '.' ) ;
    public final void rule__Import__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1803:1: ( ( '.' ) )
            // InternalMyDsl.g:1804:1: ( '.' )
            {
            // InternalMyDsl.g:1804:1: ( '.' )
            // InternalMyDsl.g:1805:2: '.'
            {
             before(grammarAccess.getImportAccess().getFullStopKeyword_1_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getImportAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group_1__0__Impl"


    // $ANTLR start "rule__Import__Group_1__1"
    // InternalMyDsl.g:1814:1: rule__Import__Group_1__1 : rule__Import__Group_1__1__Impl ;
    public final void rule__Import__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1818:1: ( rule__Import__Group_1__1__Impl )
            // InternalMyDsl.g:1819:2: rule__Import__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group_1__1"


    // $ANTLR start "rule__Import__Group_1__1__Impl"
    // InternalMyDsl.g:1825:1: rule__Import__Group_1__1__Impl : ( ( rule__Import__ImportNameAssignment_1_1 ) ) ;
    public final void rule__Import__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1829:1: ( ( ( rule__Import__ImportNameAssignment_1_1 ) ) )
            // InternalMyDsl.g:1830:1: ( ( rule__Import__ImportNameAssignment_1_1 ) )
            {
            // InternalMyDsl.g:1830:1: ( ( rule__Import__ImportNameAssignment_1_1 ) )
            // InternalMyDsl.g:1831:2: ( rule__Import__ImportNameAssignment_1_1 )
            {
             before(grammarAccess.getImportAccess().getImportNameAssignment_1_1()); 
            // InternalMyDsl.g:1832:2: ( rule__Import__ImportNameAssignment_1_1 )
            // InternalMyDsl.g:1832:3: rule__Import__ImportNameAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Import__ImportNameAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getImportNameAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group_1__1__Impl"


    // $ANTLR start "rule__Class__Group__0"
    // InternalMyDsl.g:1841:1: rule__Class__Group__0 : rule__Class__Group__0__Impl rule__Class__Group__1 ;
    public final void rule__Class__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1845:1: ( rule__Class__Group__0__Impl rule__Class__Group__1 )
            // InternalMyDsl.g:1846:2: rule__Class__Group__0__Impl rule__Class__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalMyDsl.g:1853:1: rule__Class__Group__0__Impl : ( 'Class' ) ;
    public final void rule__Class__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1857:1: ( ( 'Class' ) )
            // InternalMyDsl.g:1858:1: ( 'Class' )
            {
            // InternalMyDsl.g:1858:1: ( 'Class' )
            // InternalMyDsl.g:1859:2: 'Class'
            {
             before(grammarAccess.getClassAccess().getClassKeyword_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalMyDsl.g:1868:1: rule__Class__Group__1 : rule__Class__Group__1__Impl rule__Class__Group__2 ;
    public final void rule__Class__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1872:1: ( rule__Class__Group__1__Impl rule__Class__Group__2 )
            // InternalMyDsl.g:1873:2: rule__Class__Group__1__Impl rule__Class__Group__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalMyDsl.g:1880:1: rule__Class__Group__1__Impl : ( ( rule__Class__TypeNameAssignment_1 ) ) ;
    public final void rule__Class__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1884:1: ( ( ( rule__Class__TypeNameAssignment_1 ) ) )
            // InternalMyDsl.g:1885:1: ( ( rule__Class__TypeNameAssignment_1 ) )
            {
            // InternalMyDsl.g:1885:1: ( ( rule__Class__TypeNameAssignment_1 ) )
            // InternalMyDsl.g:1886:2: ( rule__Class__TypeNameAssignment_1 )
            {
             before(grammarAccess.getClassAccess().getTypeNameAssignment_1()); 
            // InternalMyDsl.g:1887:2: ( rule__Class__TypeNameAssignment_1 )
            // InternalMyDsl.g:1887:3: rule__Class__TypeNameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Class__TypeNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getTypeNameAssignment_1()); 

            }


            }

        }
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
    // InternalMyDsl.g:1895:1: rule__Class__Group__2 : rule__Class__Group__2__Impl rule__Class__Group__3 ;
    public final void rule__Class__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1899:1: ( rule__Class__Group__2__Impl rule__Class__Group__3 )
            // InternalMyDsl.g:1900:2: rule__Class__Group__2__Impl rule__Class__Group__3
            {
            pushFollow(FOLLOW_8);
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
    // InternalMyDsl.g:1907:1: rule__Class__Group__2__Impl : ( ( rule__Class__ContextAssignment_2 )? ) ;
    public final void rule__Class__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1911:1: ( ( ( rule__Class__ContextAssignment_2 )? ) )
            // InternalMyDsl.g:1912:1: ( ( rule__Class__ContextAssignment_2 )? )
            {
            // InternalMyDsl.g:1912:1: ( ( rule__Class__ContextAssignment_2 )? )
            // InternalMyDsl.g:1913:2: ( rule__Class__ContextAssignment_2 )?
            {
             before(grammarAccess.getClassAccess().getContextAssignment_2()); 
            // InternalMyDsl.g:1914:2: ( rule__Class__ContextAssignment_2 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==39) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMyDsl.g:1914:3: rule__Class__ContextAssignment_2
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
    // InternalMyDsl.g:1922:1: rule__Class__Group__3 : rule__Class__Group__3__Impl rule__Class__Group__4 ;
    public final void rule__Class__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1926:1: ( rule__Class__Group__3__Impl rule__Class__Group__4 )
            // InternalMyDsl.g:1927:2: rule__Class__Group__3__Impl rule__Class__Group__4
            {
            pushFollow(FOLLOW_8);
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
    // InternalMyDsl.g:1934:1: rule__Class__Group__3__Impl : ( ( rule__Class__SupertypesAssignment_3 )? ) ;
    public final void rule__Class__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1938:1: ( ( ( rule__Class__SupertypesAssignment_3 )? ) )
            // InternalMyDsl.g:1939:1: ( ( rule__Class__SupertypesAssignment_3 )? )
            {
            // InternalMyDsl.g:1939:1: ( ( rule__Class__SupertypesAssignment_3 )? )
            // InternalMyDsl.g:1940:2: ( rule__Class__SupertypesAssignment_3 )?
            {
             before(grammarAccess.getClassAccess().getSupertypesAssignment_3()); 
            // InternalMyDsl.g:1941:2: ( rule__Class__SupertypesAssignment_3 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==32) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMyDsl.g:1941:3: rule__Class__SupertypesAssignment_3
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
    // InternalMyDsl.g:1949:1: rule__Class__Group__4 : rule__Class__Group__4__Impl rule__Class__Group__5 ;
    public final void rule__Class__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1953:1: ( rule__Class__Group__4__Impl rule__Class__Group__5 )
            // InternalMyDsl.g:1954:2: rule__Class__Group__4__Impl rule__Class__Group__5
            {
            pushFollow(FOLLOW_8);
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
    // InternalMyDsl.g:1961:1: rule__Class__Group__4__Impl : ( ( rule__Class__VarListAssignment_4 )? ) ;
    public final void rule__Class__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1965:1: ( ( ( rule__Class__VarListAssignment_4 )? ) )
            // InternalMyDsl.g:1966:1: ( ( rule__Class__VarListAssignment_4 )? )
            {
            // InternalMyDsl.g:1966:1: ( ( rule__Class__VarListAssignment_4 )? )
            // InternalMyDsl.g:1967:2: ( rule__Class__VarListAssignment_4 )?
            {
             before(grammarAccess.getClassAccess().getVarListAssignment_4()); 
            // InternalMyDsl.g:1968:2: ( rule__Class__VarListAssignment_4 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==42) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMyDsl.g:1968:3: rule__Class__VarListAssignment_4
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
    // InternalMyDsl.g:1976:1: rule__Class__Group__5 : rule__Class__Group__5__Impl rule__Class__Group__6 ;
    public final void rule__Class__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1980:1: ( rule__Class__Group__5__Impl rule__Class__Group__6 )
            // InternalMyDsl.g:1981:2: rule__Class__Group__5__Impl rule__Class__Group__6
            {
            pushFollow(FOLLOW_8);
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
    // InternalMyDsl.g:1988:1: rule__Class__Group__5__Impl : ( ( rule__Class__WhereAssignment_5 )? ) ;
    public final void rule__Class__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1992:1: ( ( ( rule__Class__WhereAssignment_5 )? ) )
            // InternalMyDsl.g:1993:1: ( ( rule__Class__WhereAssignment_5 )? )
            {
            // InternalMyDsl.g:1993:1: ( ( rule__Class__WhereAssignment_5 )? )
            // InternalMyDsl.g:1994:2: ( rule__Class__WhereAssignment_5 )?
            {
             before(grammarAccess.getClassAccess().getWhereAssignment_5()); 
            // InternalMyDsl.g:1995:2: ( rule__Class__WhereAssignment_5 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==44) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalMyDsl.g:1995:3: rule__Class__WhereAssignment_5
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
    // InternalMyDsl.g:2003:1: rule__Class__Group__6 : rule__Class__Group__6__Impl rule__Class__Group__7 ;
    public final void rule__Class__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2007:1: ( rule__Class__Group__6__Impl rule__Class__Group__7 )
            // InternalMyDsl.g:2008:2: rule__Class__Group__6__Impl rule__Class__Group__7
            {
            pushFollow(FOLLOW_8);
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
    // InternalMyDsl.g:2015:1: rule__Class__Group__6__Impl : ( ( ';' )? ) ;
    public final void rule__Class__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2019:1: ( ( ( ';' )? ) )
            // InternalMyDsl.g:2020:1: ( ( ';' )? )
            {
            // InternalMyDsl.g:2020:1: ( ( ';' )? )
            // InternalMyDsl.g:2021:2: ( ';' )?
            {
             before(grammarAccess.getClassAccess().getSemicolonKeyword_6()); 
            // InternalMyDsl.g:2022:2: ( ';' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==36) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalMyDsl.g:2022:3: ';'
                    {
                    match(input,36,FOLLOW_2); 

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
    // InternalMyDsl.g:2030:1: rule__Class__Group__7 : rule__Class__Group__7__Impl rule__Class__Group__8 ;
    public final void rule__Class__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2034:1: ( rule__Class__Group__7__Impl rule__Class__Group__8 )
            // InternalMyDsl.g:2035:2: rule__Class__Group__7__Impl rule__Class__Group__8
            {
            pushFollow(FOLLOW_9);
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
    // InternalMyDsl.g:2042:1: rule__Class__Group__7__Impl : ( '{' ) ;
    public final void rule__Class__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2046:1: ( ( '{' ) )
            // InternalMyDsl.g:2047:1: ( '{' )
            {
            // InternalMyDsl.g:2047:1: ( '{' )
            // InternalMyDsl.g:2048:2: '{'
            {
             before(grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_7()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_7()); 

            }


            }

        }
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
    // InternalMyDsl.g:2057:1: rule__Class__Group__8 : rule__Class__Group__8__Impl rule__Class__Group__9 ;
    public final void rule__Class__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2061:1: ( rule__Class__Group__8__Impl rule__Class__Group__9 )
            // InternalMyDsl.g:2062:2: rule__Class__Group__8__Impl rule__Class__Group__9
            {
            pushFollow(FOLLOW_9);
            rule__Class__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group__9();

            state._fsp--;


            }

        }
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
    // InternalMyDsl.g:2069:1: rule__Class__Group__8__Impl : ( ( rule__Class__BodyElementsAssignment_8 )* ) ;
    public final void rule__Class__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2073:1: ( ( ( rule__Class__BodyElementsAssignment_8 )* ) )
            // InternalMyDsl.g:2074:1: ( ( rule__Class__BodyElementsAssignment_8 )* )
            {
            // InternalMyDsl.g:2074:1: ( ( rule__Class__BodyElementsAssignment_8 )* )
            // InternalMyDsl.g:2075:2: ( rule__Class__BodyElementsAssignment_8 )*
            {
             before(grammarAccess.getClassAccess().getBodyElementsAssignment_8()); 
            // InternalMyDsl.g:2076:2: ( rule__Class__BodyElementsAssignment_8 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ID||LA20_0==49) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalMyDsl.g:2076:3: rule__Class__BodyElementsAssignment_8
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Class__BodyElementsAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getClassAccess().getBodyElementsAssignment_8()); 

            }


            }

        }
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


    // $ANTLR start "rule__Class__Group__9"
    // InternalMyDsl.g:2084:1: rule__Class__Group__9 : rule__Class__Group__9__Impl ;
    public final void rule__Class__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2088:1: ( rule__Class__Group__9__Impl )
            // InternalMyDsl.g:2089:2: rule__Class__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__9"


    // $ANTLR start "rule__Class__Group__9__Impl"
    // InternalMyDsl.g:2095:1: rule__Class__Group__9__Impl : ( '}' ) ;
    public final void rule__Class__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2099:1: ( ( '}' ) )
            // InternalMyDsl.g:2100:1: ( '}' )
            {
            // InternalMyDsl.g:2100:1: ( '}' )
            // InternalMyDsl.g:2101:2: '}'
            {
             before(grammarAccess.getClassAccess().getRightCurlyBracketKeyword_9()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__9__Impl"


    // $ANTLR start "rule__PolyContext__Group__0"
    // InternalMyDsl.g:2111:1: rule__PolyContext__Group__0 : rule__PolyContext__Group__0__Impl rule__PolyContext__Group__1 ;
    public final void rule__PolyContext__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2115:1: ( rule__PolyContext__Group__0__Impl rule__PolyContext__Group__1 )
            // InternalMyDsl.g:2116:2: rule__PolyContext__Group__0__Impl rule__PolyContext__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalMyDsl.g:2123:1: rule__PolyContext__Group__0__Impl : ( '<' ) ;
    public final void rule__PolyContext__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2127:1: ( ( '<' ) )
            // InternalMyDsl.g:2128:1: ( '<' )
            {
            // InternalMyDsl.g:2128:1: ( '<' )
            // InternalMyDsl.g:2129:2: '<'
            {
             before(grammarAccess.getPolyContextAccess().getLessThanSignKeyword_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalMyDsl.g:2138:1: rule__PolyContext__Group__1 : rule__PolyContext__Group__1__Impl rule__PolyContext__Group__2 ;
    public final void rule__PolyContext__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2142:1: ( rule__PolyContext__Group__1__Impl rule__PolyContext__Group__2 )
            // InternalMyDsl.g:2143:2: rule__PolyContext__Group__1__Impl rule__PolyContext__Group__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalMyDsl.g:2150:1: rule__PolyContext__Group__1__Impl : ( ( ( rule__PolyContext__PolyTypesAssignment_1 ) ) ( ( rule__PolyContext__PolyTypesAssignment_1 )* ) ) ;
    public final void rule__PolyContext__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2154:1: ( ( ( ( rule__PolyContext__PolyTypesAssignment_1 ) ) ( ( rule__PolyContext__PolyTypesAssignment_1 )* ) ) )
            // InternalMyDsl.g:2155:1: ( ( ( rule__PolyContext__PolyTypesAssignment_1 ) ) ( ( rule__PolyContext__PolyTypesAssignment_1 )* ) )
            {
            // InternalMyDsl.g:2155:1: ( ( ( rule__PolyContext__PolyTypesAssignment_1 ) ) ( ( rule__PolyContext__PolyTypesAssignment_1 )* ) )
            // InternalMyDsl.g:2156:2: ( ( rule__PolyContext__PolyTypesAssignment_1 ) ) ( ( rule__PolyContext__PolyTypesAssignment_1 )* )
            {
            // InternalMyDsl.g:2156:2: ( ( rule__PolyContext__PolyTypesAssignment_1 ) )
            // InternalMyDsl.g:2157:3: ( rule__PolyContext__PolyTypesAssignment_1 )
            {
             before(grammarAccess.getPolyContextAccess().getPolyTypesAssignment_1()); 
            // InternalMyDsl.g:2158:3: ( rule__PolyContext__PolyTypesAssignment_1 )
            // InternalMyDsl.g:2158:4: rule__PolyContext__PolyTypesAssignment_1
            {
            pushFollow(FOLLOW_12);
            rule__PolyContext__PolyTypesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPolyContextAccess().getPolyTypesAssignment_1()); 

            }

            // InternalMyDsl.g:2161:2: ( ( rule__PolyContext__PolyTypesAssignment_1 )* )
            // InternalMyDsl.g:2162:3: ( rule__PolyContext__PolyTypesAssignment_1 )*
            {
             before(grammarAccess.getPolyContextAccess().getPolyTypesAssignment_1()); 
            // InternalMyDsl.g:2163:3: ( rule__PolyContext__PolyTypesAssignment_1 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_ID) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalMyDsl.g:2163:4: rule__PolyContext__PolyTypesAssignment_1
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__PolyContext__PolyTypesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalMyDsl.g:2172:1: rule__PolyContext__Group__2 : rule__PolyContext__Group__2__Impl ;
    public final void rule__PolyContext__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2176:1: ( rule__PolyContext__Group__2__Impl )
            // InternalMyDsl.g:2177:2: rule__PolyContext__Group__2__Impl
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
    // InternalMyDsl.g:2183:1: rule__PolyContext__Group__2__Impl : ( '>' ) ;
    public final void rule__PolyContext__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2187:1: ( ( '>' ) )
            // InternalMyDsl.g:2188:1: ( '>' )
            {
            // InternalMyDsl.g:2188:1: ( '>' )
            // InternalMyDsl.g:2189:2: '>'
            {
             before(grammarAccess.getPolyContextAccess().getGreaterThanSignKeyword_2()); 
            match(input,40,FOLLOW_2); 
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


    // $ANTLR start "rule__PolyContextTypes__Group__0"
    // InternalMyDsl.g:2199:1: rule__PolyContextTypes__Group__0 : rule__PolyContextTypes__Group__0__Impl rule__PolyContextTypes__Group__1 ;
    public final void rule__PolyContextTypes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2203:1: ( rule__PolyContextTypes__Group__0__Impl rule__PolyContextTypes__Group__1 )
            // InternalMyDsl.g:2204:2: rule__PolyContextTypes__Group__0__Impl rule__PolyContextTypes__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__PolyContextTypes__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PolyContextTypes__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PolyContextTypes__Group__0"


    // $ANTLR start "rule__PolyContextTypes__Group__0__Impl"
    // InternalMyDsl.g:2211:1: rule__PolyContextTypes__Group__0__Impl : ( ( rule__PolyContextTypes__NameAssignment_0 ) ) ;
    public final void rule__PolyContextTypes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2215:1: ( ( ( rule__PolyContextTypes__NameAssignment_0 ) ) )
            // InternalMyDsl.g:2216:1: ( ( rule__PolyContextTypes__NameAssignment_0 ) )
            {
            // InternalMyDsl.g:2216:1: ( ( rule__PolyContextTypes__NameAssignment_0 ) )
            // InternalMyDsl.g:2217:2: ( rule__PolyContextTypes__NameAssignment_0 )
            {
             before(grammarAccess.getPolyContextTypesAccess().getNameAssignment_0()); 
            // InternalMyDsl.g:2218:2: ( rule__PolyContextTypes__NameAssignment_0 )
            // InternalMyDsl.g:2218:3: rule__PolyContextTypes__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__PolyContextTypes__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPolyContextTypesAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PolyContextTypes__Group__0__Impl"


    // $ANTLR start "rule__PolyContextTypes__Group__1"
    // InternalMyDsl.g:2226:1: rule__PolyContextTypes__Group__1 : rule__PolyContextTypes__Group__1__Impl ;
    public final void rule__PolyContextTypes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2230:1: ( rule__PolyContextTypes__Group__1__Impl )
            // InternalMyDsl.g:2231:2: rule__PolyContextTypes__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PolyContextTypes__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PolyContextTypes__Group__1"


    // $ANTLR start "rule__PolyContextTypes__Group__1__Impl"
    // InternalMyDsl.g:2237:1: rule__PolyContextTypes__Group__1__Impl : ( ( rule__PolyContextTypes__ConstraintsAssignment_1 )* ) ;
    public final void rule__PolyContextTypes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2241:1: ( ( ( rule__PolyContextTypes__ConstraintsAssignment_1 )* ) )
            // InternalMyDsl.g:2242:1: ( ( rule__PolyContextTypes__ConstraintsAssignment_1 )* )
            {
            // InternalMyDsl.g:2242:1: ( ( rule__PolyContextTypes__ConstraintsAssignment_1 )* )
            // InternalMyDsl.g:2243:2: ( rule__PolyContextTypes__ConstraintsAssignment_1 )*
            {
             before(grammarAccess.getPolyContextTypesAccess().getConstraintsAssignment_1()); 
            // InternalMyDsl.g:2244:2: ( rule__PolyContextTypes__ConstraintsAssignment_1 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==32) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalMyDsl.g:2244:3: rule__PolyContextTypes__ConstraintsAssignment_1
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__PolyContextTypes__ConstraintsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getPolyContextTypesAccess().getConstraintsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PolyContextTypes__Group__1__Impl"


    // $ANTLR start "rule__PolyTypeConstraints__Group__0"
    // InternalMyDsl.g:2253:1: rule__PolyTypeConstraints__Group__0 : rule__PolyTypeConstraints__Group__0__Impl rule__PolyTypeConstraints__Group__1 ;
    public final void rule__PolyTypeConstraints__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2257:1: ( rule__PolyTypeConstraints__Group__0__Impl rule__PolyTypeConstraints__Group__1 )
            // InternalMyDsl.g:2258:2: rule__PolyTypeConstraints__Group__0__Impl rule__PolyTypeConstraints__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__PolyTypeConstraints__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PolyTypeConstraints__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PolyTypeConstraints__Group__0"


    // $ANTLR start "rule__PolyTypeConstraints__Group__0__Impl"
    // InternalMyDsl.g:2265:1: rule__PolyTypeConstraints__Group__0__Impl : ( ':' ) ;
    public final void rule__PolyTypeConstraints__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2269:1: ( ( ':' ) )
            // InternalMyDsl.g:2270:1: ( ':' )
            {
            // InternalMyDsl.g:2270:1: ( ':' )
            // InternalMyDsl.g:2271:2: ':'
            {
             before(grammarAccess.getPolyTypeConstraintsAccess().getColonKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getPolyTypeConstraintsAccess().getColonKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PolyTypeConstraints__Group__0__Impl"


    // $ANTLR start "rule__PolyTypeConstraints__Group__1"
    // InternalMyDsl.g:2280:1: rule__PolyTypeConstraints__Group__1 : rule__PolyTypeConstraints__Group__1__Impl rule__PolyTypeConstraints__Group__2 ;
    public final void rule__PolyTypeConstraints__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2284:1: ( rule__PolyTypeConstraints__Group__1__Impl rule__PolyTypeConstraints__Group__2 )
            // InternalMyDsl.g:2285:2: rule__PolyTypeConstraints__Group__1__Impl rule__PolyTypeConstraints__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__PolyTypeConstraints__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PolyTypeConstraints__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PolyTypeConstraints__Group__1"


    // $ANTLR start "rule__PolyTypeConstraints__Group__1__Impl"
    // InternalMyDsl.g:2292:1: rule__PolyTypeConstraints__Group__1__Impl : ( ( rule__PolyTypeConstraints__TypeNameAssignment_1 ) ) ;
    public final void rule__PolyTypeConstraints__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2296:1: ( ( ( rule__PolyTypeConstraints__TypeNameAssignment_1 ) ) )
            // InternalMyDsl.g:2297:1: ( ( rule__PolyTypeConstraints__TypeNameAssignment_1 ) )
            {
            // InternalMyDsl.g:2297:1: ( ( rule__PolyTypeConstraints__TypeNameAssignment_1 ) )
            // InternalMyDsl.g:2298:2: ( rule__PolyTypeConstraints__TypeNameAssignment_1 )
            {
             before(grammarAccess.getPolyTypeConstraintsAccess().getTypeNameAssignment_1()); 
            // InternalMyDsl.g:2299:2: ( rule__PolyTypeConstraints__TypeNameAssignment_1 )
            // InternalMyDsl.g:2299:3: rule__PolyTypeConstraints__TypeNameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PolyTypeConstraints__TypeNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPolyTypeConstraintsAccess().getTypeNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PolyTypeConstraints__Group__1__Impl"


    // $ANTLR start "rule__PolyTypeConstraints__Group__2"
    // InternalMyDsl.g:2307:1: rule__PolyTypeConstraints__Group__2 : rule__PolyTypeConstraints__Group__2__Impl ;
    public final void rule__PolyTypeConstraints__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2311:1: ( rule__PolyTypeConstraints__Group__2__Impl )
            // InternalMyDsl.g:2312:2: rule__PolyTypeConstraints__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PolyTypeConstraints__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PolyTypeConstraints__Group__2"


    // $ANTLR start "rule__PolyTypeConstraints__Group__2__Impl"
    // InternalMyDsl.g:2318:1: rule__PolyTypeConstraints__Group__2__Impl : ( ( rule__PolyTypeConstraints__Group_2__0 )* ) ;
    public final void rule__PolyTypeConstraints__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2322:1: ( ( ( rule__PolyTypeConstraints__Group_2__0 )* ) )
            // InternalMyDsl.g:2323:1: ( ( rule__PolyTypeConstraints__Group_2__0 )* )
            {
            // InternalMyDsl.g:2323:1: ( ( rule__PolyTypeConstraints__Group_2__0 )* )
            // InternalMyDsl.g:2324:2: ( rule__PolyTypeConstraints__Group_2__0 )*
            {
             before(grammarAccess.getPolyTypeConstraintsAccess().getGroup_2()); 
            // InternalMyDsl.g:2325:2: ( rule__PolyTypeConstraints__Group_2__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==41) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalMyDsl.g:2325:3: rule__PolyTypeConstraints__Group_2__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__PolyTypeConstraints__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getPolyTypeConstraintsAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PolyTypeConstraints__Group__2__Impl"


    // $ANTLR start "rule__PolyTypeConstraints__Group_2__0"
    // InternalMyDsl.g:2334:1: rule__PolyTypeConstraints__Group_2__0 : rule__PolyTypeConstraints__Group_2__0__Impl rule__PolyTypeConstraints__Group_2__1 ;
    public final void rule__PolyTypeConstraints__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2338:1: ( rule__PolyTypeConstraints__Group_2__0__Impl rule__PolyTypeConstraints__Group_2__1 )
            // InternalMyDsl.g:2339:2: rule__PolyTypeConstraints__Group_2__0__Impl rule__PolyTypeConstraints__Group_2__1
            {
            pushFollow(FOLLOW_6);
            rule__PolyTypeConstraints__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PolyTypeConstraints__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PolyTypeConstraints__Group_2__0"


    // $ANTLR start "rule__PolyTypeConstraints__Group_2__0__Impl"
    // InternalMyDsl.g:2346:1: rule__PolyTypeConstraints__Group_2__0__Impl : ( ',' ) ;
    public final void rule__PolyTypeConstraints__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2350:1: ( ( ',' ) )
            // InternalMyDsl.g:2351:1: ( ',' )
            {
            // InternalMyDsl.g:2351:1: ( ',' )
            // InternalMyDsl.g:2352:2: ','
            {
             before(grammarAccess.getPolyTypeConstraintsAccess().getCommaKeyword_2_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getPolyTypeConstraintsAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PolyTypeConstraints__Group_2__0__Impl"


    // $ANTLR start "rule__PolyTypeConstraints__Group_2__1"
    // InternalMyDsl.g:2361:1: rule__PolyTypeConstraints__Group_2__1 : rule__PolyTypeConstraints__Group_2__1__Impl ;
    public final void rule__PolyTypeConstraints__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2365:1: ( rule__PolyTypeConstraints__Group_2__1__Impl )
            // InternalMyDsl.g:2366:2: rule__PolyTypeConstraints__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PolyTypeConstraints__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PolyTypeConstraints__Group_2__1"


    // $ANTLR start "rule__PolyTypeConstraints__Group_2__1__Impl"
    // InternalMyDsl.g:2372:1: rule__PolyTypeConstraints__Group_2__1__Impl : ( ( rule__PolyTypeConstraints__TypeNameAssignment_2_1 ) ) ;
    public final void rule__PolyTypeConstraints__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2376:1: ( ( ( rule__PolyTypeConstraints__TypeNameAssignment_2_1 ) ) )
            // InternalMyDsl.g:2377:1: ( ( rule__PolyTypeConstraints__TypeNameAssignment_2_1 ) )
            {
            // InternalMyDsl.g:2377:1: ( ( rule__PolyTypeConstraints__TypeNameAssignment_2_1 ) )
            // InternalMyDsl.g:2378:2: ( rule__PolyTypeConstraints__TypeNameAssignment_2_1 )
            {
             before(grammarAccess.getPolyTypeConstraintsAccess().getTypeNameAssignment_2_1()); 
            // InternalMyDsl.g:2379:2: ( rule__PolyTypeConstraints__TypeNameAssignment_2_1 )
            // InternalMyDsl.g:2379:3: rule__PolyTypeConstraints__TypeNameAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__PolyTypeConstraints__TypeNameAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getPolyTypeConstraintsAccess().getTypeNameAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PolyTypeConstraints__Group_2__1__Impl"


    // $ANTLR start "rule__SuperTypeList__Group__0"
    // InternalMyDsl.g:2388:1: rule__SuperTypeList__Group__0 : rule__SuperTypeList__Group__0__Impl rule__SuperTypeList__Group__1 ;
    public final void rule__SuperTypeList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2392:1: ( rule__SuperTypeList__Group__0__Impl rule__SuperTypeList__Group__1 )
            // InternalMyDsl.g:2393:2: rule__SuperTypeList__Group__0__Impl rule__SuperTypeList__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalMyDsl.g:2400:1: rule__SuperTypeList__Group__0__Impl : ( ':' ) ;
    public final void rule__SuperTypeList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2404:1: ( ( ':' ) )
            // InternalMyDsl.g:2405:1: ( ':' )
            {
            // InternalMyDsl.g:2405:1: ( ':' )
            // InternalMyDsl.g:2406:2: ':'
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
    // InternalMyDsl.g:2415:1: rule__SuperTypeList__Group__1 : rule__SuperTypeList__Group__1__Impl rule__SuperTypeList__Group__2 ;
    public final void rule__SuperTypeList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2419:1: ( rule__SuperTypeList__Group__1__Impl rule__SuperTypeList__Group__2 )
            // InternalMyDsl.g:2420:2: rule__SuperTypeList__Group__1__Impl rule__SuperTypeList__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalMyDsl.g:2427:1: rule__SuperTypeList__Group__1__Impl : ( ( rule__SuperTypeList__SuperTypeAssignment_1 ) ) ;
    public final void rule__SuperTypeList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2431:1: ( ( ( rule__SuperTypeList__SuperTypeAssignment_1 ) ) )
            // InternalMyDsl.g:2432:1: ( ( rule__SuperTypeList__SuperTypeAssignment_1 ) )
            {
            // InternalMyDsl.g:2432:1: ( ( rule__SuperTypeList__SuperTypeAssignment_1 ) )
            // InternalMyDsl.g:2433:2: ( rule__SuperTypeList__SuperTypeAssignment_1 )
            {
             before(grammarAccess.getSuperTypeListAccess().getSuperTypeAssignment_1()); 
            // InternalMyDsl.g:2434:2: ( rule__SuperTypeList__SuperTypeAssignment_1 )
            // InternalMyDsl.g:2434:3: rule__SuperTypeList__SuperTypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SuperTypeList__SuperTypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSuperTypeListAccess().getSuperTypeAssignment_1()); 

            }


            }

        }
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
    // InternalMyDsl.g:2442:1: rule__SuperTypeList__Group__2 : rule__SuperTypeList__Group__2__Impl ;
    public final void rule__SuperTypeList__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2446:1: ( rule__SuperTypeList__Group__2__Impl )
            // InternalMyDsl.g:2447:2: rule__SuperTypeList__Group__2__Impl
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
    // InternalMyDsl.g:2453:1: rule__SuperTypeList__Group__2__Impl : ( ( rule__SuperTypeList__Group_2__0 )* ) ;
    public final void rule__SuperTypeList__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2457:1: ( ( ( rule__SuperTypeList__Group_2__0 )* ) )
            // InternalMyDsl.g:2458:1: ( ( rule__SuperTypeList__Group_2__0 )* )
            {
            // InternalMyDsl.g:2458:1: ( ( rule__SuperTypeList__Group_2__0 )* )
            // InternalMyDsl.g:2459:2: ( rule__SuperTypeList__Group_2__0 )*
            {
             before(grammarAccess.getSuperTypeListAccess().getGroup_2()); 
            // InternalMyDsl.g:2460:2: ( rule__SuperTypeList__Group_2__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==41) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalMyDsl.g:2460:3: rule__SuperTypeList__Group_2__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__SuperTypeList__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // InternalMyDsl.g:2469:1: rule__SuperTypeList__Group_2__0 : rule__SuperTypeList__Group_2__0__Impl rule__SuperTypeList__Group_2__1 ;
    public final void rule__SuperTypeList__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2473:1: ( rule__SuperTypeList__Group_2__0__Impl rule__SuperTypeList__Group_2__1 )
            // InternalMyDsl.g:2474:2: rule__SuperTypeList__Group_2__0__Impl rule__SuperTypeList__Group_2__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalMyDsl.g:2481:1: rule__SuperTypeList__Group_2__0__Impl : ( ',' ) ;
    public final void rule__SuperTypeList__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2485:1: ( ( ',' ) )
            // InternalMyDsl.g:2486:1: ( ',' )
            {
            // InternalMyDsl.g:2486:1: ( ',' )
            // InternalMyDsl.g:2487:2: ','
            {
             before(grammarAccess.getSuperTypeListAccess().getCommaKeyword_2_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalMyDsl.g:2496:1: rule__SuperTypeList__Group_2__1 : rule__SuperTypeList__Group_2__1__Impl ;
    public final void rule__SuperTypeList__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2500:1: ( rule__SuperTypeList__Group_2__1__Impl )
            // InternalMyDsl.g:2501:2: rule__SuperTypeList__Group_2__1__Impl
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
    // InternalMyDsl.g:2507:1: rule__SuperTypeList__Group_2__1__Impl : ( ( rule__SuperTypeList__SuperTypeAssignment_2_1 ) ) ;
    public final void rule__SuperTypeList__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2511:1: ( ( ( rule__SuperTypeList__SuperTypeAssignment_2_1 ) ) )
            // InternalMyDsl.g:2512:1: ( ( rule__SuperTypeList__SuperTypeAssignment_2_1 ) )
            {
            // InternalMyDsl.g:2512:1: ( ( rule__SuperTypeList__SuperTypeAssignment_2_1 ) )
            // InternalMyDsl.g:2513:2: ( rule__SuperTypeList__SuperTypeAssignment_2_1 )
            {
             before(grammarAccess.getSuperTypeListAccess().getSuperTypeAssignment_2_1()); 
            // InternalMyDsl.g:2514:2: ( rule__SuperTypeList__SuperTypeAssignment_2_1 )
            // InternalMyDsl.g:2514:3: rule__SuperTypeList__SuperTypeAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__SuperTypeList__SuperTypeAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSuperTypeListAccess().getSuperTypeAssignment_2_1()); 

            }


            }

        }
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
    // InternalMyDsl.g:2523:1: rule__ConstructedType__Group__0 : rule__ConstructedType__Group__0__Impl rule__ConstructedType__Group__1 ;
    public final void rule__ConstructedType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2527:1: ( rule__ConstructedType__Group__0__Impl rule__ConstructedType__Group__1 )
            // InternalMyDsl.g:2528:2: rule__ConstructedType__Group__0__Impl rule__ConstructedType__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalMyDsl.g:2535:1: rule__ConstructedType__Group__0__Impl : ( ( rule__ConstructedType__TypeAssignment_0 ) ) ;
    public final void rule__ConstructedType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2539:1: ( ( ( rule__ConstructedType__TypeAssignment_0 ) ) )
            // InternalMyDsl.g:2540:1: ( ( rule__ConstructedType__TypeAssignment_0 ) )
            {
            // InternalMyDsl.g:2540:1: ( ( rule__ConstructedType__TypeAssignment_0 ) )
            // InternalMyDsl.g:2541:2: ( rule__ConstructedType__TypeAssignment_0 )
            {
             before(grammarAccess.getConstructedTypeAccess().getTypeAssignment_0()); 
            // InternalMyDsl.g:2542:2: ( rule__ConstructedType__TypeAssignment_0 )
            // InternalMyDsl.g:2542:3: rule__ConstructedType__TypeAssignment_0
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
    // InternalMyDsl.g:2550:1: rule__ConstructedType__Group__1 : rule__ConstructedType__Group__1__Impl ;
    public final void rule__ConstructedType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2554:1: ( rule__ConstructedType__Group__1__Impl )
            // InternalMyDsl.g:2555:2: rule__ConstructedType__Group__1__Impl
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
    // InternalMyDsl.g:2561:1: rule__ConstructedType__Group__1__Impl : ( ( rule__ConstructedType__Group_1__0 )? ) ;
    public final void rule__ConstructedType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2565:1: ( ( ( rule__ConstructedType__Group_1__0 )? ) )
            // InternalMyDsl.g:2566:1: ( ( rule__ConstructedType__Group_1__0 )? )
            {
            // InternalMyDsl.g:2566:1: ( ( rule__ConstructedType__Group_1__0 )? )
            // InternalMyDsl.g:2567:2: ( rule__ConstructedType__Group_1__0 )?
            {
             before(grammarAccess.getConstructedTypeAccess().getGroup_1()); 
            // InternalMyDsl.g:2568:2: ( rule__ConstructedType__Group_1__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=13 && LA25_0<=22)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalMyDsl.g:2568:3: rule__ConstructedType__Group_1__0
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
    // InternalMyDsl.g:2577:1: rule__ConstructedType__Group_1__0 : rule__ConstructedType__Group_1__0__Impl rule__ConstructedType__Group_1__1 ;
    public final void rule__ConstructedType__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2581:1: ( rule__ConstructedType__Group_1__0__Impl rule__ConstructedType__Group_1__1 )
            // InternalMyDsl.g:2582:2: rule__ConstructedType__Group_1__0__Impl rule__ConstructedType__Group_1__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalMyDsl.g:2589:1: rule__ConstructedType__Group_1__0__Impl : ( ( rule__ConstructedType__Alternatives_1_0 ) ) ;
    public final void rule__ConstructedType__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2593:1: ( ( ( rule__ConstructedType__Alternatives_1_0 ) ) )
            // InternalMyDsl.g:2594:1: ( ( rule__ConstructedType__Alternatives_1_0 ) )
            {
            // InternalMyDsl.g:2594:1: ( ( rule__ConstructedType__Alternatives_1_0 ) )
            // InternalMyDsl.g:2595:2: ( rule__ConstructedType__Alternatives_1_0 )
            {
             before(grammarAccess.getConstructedTypeAccess().getAlternatives_1_0()); 
            // InternalMyDsl.g:2596:2: ( rule__ConstructedType__Alternatives_1_0 )
            // InternalMyDsl.g:2596:3: rule__ConstructedType__Alternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__ConstructedType__Alternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getConstructedTypeAccess().getAlternatives_1_0()); 

            }


            }

        }
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
    // InternalMyDsl.g:2604:1: rule__ConstructedType__Group_1__1 : rule__ConstructedType__Group_1__1__Impl ;
    public final void rule__ConstructedType__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2608:1: ( rule__ConstructedType__Group_1__1__Impl )
            // InternalMyDsl.g:2609:2: rule__ConstructedType__Group_1__1__Impl
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
    // InternalMyDsl.g:2615:1: rule__ConstructedType__Group_1__1__Impl : ( ( rule__ConstructedType__TypeAssignment_1_1 ) ) ;
    public final void rule__ConstructedType__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2619:1: ( ( ( rule__ConstructedType__TypeAssignment_1_1 ) ) )
            // InternalMyDsl.g:2620:1: ( ( rule__ConstructedType__TypeAssignment_1_1 ) )
            {
            // InternalMyDsl.g:2620:1: ( ( rule__ConstructedType__TypeAssignment_1_1 ) )
            // InternalMyDsl.g:2621:2: ( rule__ConstructedType__TypeAssignment_1_1 )
            {
             before(grammarAccess.getConstructedTypeAccess().getTypeAssignment_1_1()); 
            // InternalMyDsl.g:2622:2: ( rule__ConstructedType__TypeAssignment_1_1 )
            // InternalMyDsl.g:2622:3: rule__ConstructedType__TypeAssignment_1_1
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
    // InternalMyDsl.g:2631:1: rule__TypeConstructor__Group__0 : rule__TypeConstructor__Group__0__Impl rule__TypeConstructor__Group__1 ;
    public final void rule__TypeConstructor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2635:1: ( rule__TypeConstructor__Group__0__Impl rule__TypeConstructor__Group__1 )
            // InternalMyDsl.g:2636:2: rule__TypeConstructor__Group__0__Impl rule__TypeConstructor__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalMyDsl.g:2643:1: rule__TypeConstructor__Group__0__Impl : ( ( rule__TypeConstructor__Alternatives_0 ) ) ;
    public final void rule__TypeConstructor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2647:1: ( ( ( rule__TypeConstructor__Alternatives_0 ) ) )
            // InternalMyDsl.g:2648:1: ( ( rule__TypeConstructor__Alternatives_0 ) )
            {
            // InternalMyDsl.g:2648:1: ( ( rule__TypeConstructor__Alternatives_0 ) )
            // InternalMyDsl.g:2649:2: ( rule__TypeConstructor__Alternatives_0 )
            {
             before(grammarAccess.getTypeConstructorAccess().getAlternatives_0()); 
            // InternalMyDsl.g:2650:2: ( rule__TypeConstructor__Alternatives_0 )
            // InternalMyDsl.g:2650:3: rule__TypeConstructor__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__TypeConstructor__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getTypeConstructorAccess().getAlternatives_0()); 

            }


            }

        }
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
    // InternalMyDsl.g:2658:1: rule__TypeConstructor__Group__1 : rule__TypeConstructor__Group__1__Impl ;
    public final void rule__TypeConstructor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2662:1: ( rule__TypeConstructor__Group__1__Impl )
            // InternalMyDsl.g:2663:2: rule__TypeConstructor__Group__1__Impl
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
    // InternalMyDsl.g:2669:1: rule__TypeConstructor__Group__1__Impl : ( ( rule__TypeConstructor__ContextAssignment_1 )? ) ;
    public final void rule__TypeConstructor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2673:1: ( ( ( rule__TypeConstructor__ContextAssignment_1 )? ) )
            // InternalMyDsl.g:2674:1: ( ( rule__TypeConstructor__ContextAssignment_1 )? )
            {
            // InternalMyDsl.g:2674:1: ( ( rule__TypeConstructor__ContextAssignment_1 )? )
            // InternalMyDsl.g:2675:2: ( rule__TypeConstructor__ContextAssignment_1 )?
            {
             before(grammarAccess.getTypeConstructorAccess().getContextAssignment_1()); 
            // InternalMyDsl.g:2676:2: ( rule__TypeConstructor__ContextAssignment_1 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==39) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalMyDsl.g:2676:3: rule__TypeConstructor__ContextAssignment_1
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
    // InternalMyDsl.g:2685:1: rule__TypeDeclContext__Group__0 : rule__TypeDeclContext__Group__0__Impl rule__TypeDeclContext__Group__1 ;
    public final void rule__TypeDeclContext__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2689:1: ( rule__TypeDeclContext__Group__0__Impl rule__TypeDeclContext__Group__1 )
            // InternalMyDsl.g:2690:2: rule__TypeDeclContext__Group__0__Impl rule__TypeDeclContext__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalMyDsl.g:2697:1: rule__TypeDeclContext__Group__0__Impl : ( '<' ) ;
    public final void rule__TypeDeclContext__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2701:1: ( ( '<' ) )
            // InternalMyDsl.g:2702:1: ( '<' )
            {
            // InternalMyDsl.g:2702:1: ( '<' )
            // InternalMyDsl.g:2703:2: '<'
            {
             before(grammarAccess.getTypeDeclContextAccess().getLessThanSignKeyword_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalMyDsl.g:2712:1: rule__TypeDeclContext__Group__1 : rule__TypeDeclContext__Group__1__Impl rule__TypeDeclContext__Group__2 ;
    public final void rule__TypeDeclContext__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2716:1: ( rule__TypeDeclContext__Group__1__Impl rule__TypeDeclContext__Group__2 )
            // InternalMyDsl.g:2717:2: rule__TypeDeclContext__Group__1__Impl rule__TypeDeclContext__Group__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalMyDsl.g:2724:1: rule__TypeDeclContext__Group__1__Impl : ( ( rule__TypeDeclContext__TypeNameAssignment_1 ) ) ;
    public final void rule__TypeDeclContext__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2728:1: ( ( ( rule__TypeDeclContext__TypeNameAssignment_1 ) ) )
            // InternalMyDsl.g:2729:1: ( ( rule__TypeDeclContext__TypeNameAssignment_1 ) )
            {
            // InternalMyDsl.g:2729:1: ( ( rule__TypeDeclContext__TypeNameAssignment_1 ) )
            // InternalMyDsl.g:2730:2: ( rule__TypeDeclContext__TypeNameAssignment_1 )
            {
             before(grammarAccess.getTypeDeclContextAccess().getTypeNameAssignment_1()); 
            // InternalMyDsl.g:2731:2: ( rule__TypeDeclContext__TypeNameAssignment_1 )
            // InternalMyDsl.g:2731:3: rule__TypeDeclContext__TypeNameAssignment_1
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
    // InternalMyDsl.g:2739:1: rule__TypeDeclContext__Group__2 : rule__TypeDeclContext__Group__2__Impl rule__TypeDeclContext__Group__3 ;
    public final void rule__TypeDeclContext__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2743:1: ( rule__TypeDeclContext__Group__2__Impl rule__TypeDeclContext__Group__3 )
            // InternalMyDsl.g:2744:2: rule__TypeDeclContext__Group__2__Impl rule__TypeDeclContext__Group__3
            {
            pushFollow(FOLLOW_19);
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
    // InternalMyDsl.g:2751:1: rule__TypeDeclContext__Group__2__Impl : ( ( rule__TypeDeclContext__Group_2__0 )* ) ;
    public final void rule__TypeDeclContext__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2755:1: ( ( ( rule__TypeDeclContext__Group_2__0 )* ) )
            // InternalMyDsl.g:2756:1: ( ( rule__TypeDeclContext__Group_2__0 )* )
            {
            // InternalMyDsl.g:2756:1: ( ( rule__TypeDeclContext__Group_2__0 )* )
            // InternalMyDsl.g:2757:2: ( rule__TypeDeclContext__Group_2__0 )*
            {
             before(grammarAccess.getTypeDeclContextAccess().getGroup_2()); 
            // InternalMyDsl.g:2758:2: ( rule__TypeDeclContext__Group_2__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==41) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalMyDsl.g:2758:3: rule__TypeDeclContext__Group_2__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__TypeDeclContext__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
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
    // InternalMyDsl.g:2766:1: rule__TypeDeclContext__Group__3 : rule__TypeDeclContext__Group__3__Impl ;
    public final void rule__TypeDeclContext__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2770:1: ( rule__TypeDeclContext__Group__3__Impl )
            // InternalMyDsl.g:2771:2: rule__TypeDeclContext__Group__3__Impl
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
    // InternalMyDsl.g:2777:1: rule__TypeDeclContext__Group__3__Impl : ( '>' ) ;
    public final void rule__TypeDeclContext__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2781:1: ( ( '>' ) )
            // InternalMyDsl.g:2782:1: ( '>' )
            {
            // InternalMyDsl.g:2782:1: ( '>' )
            // InternalMyDsl.g:2783:2: '>'
            {
             before(grammarAccess.getTypeDeclContextAccess().getGreaterThanSignKeyword_3()); 
            match(input,40,FOLLOW_2); 
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
    // InternalMyDsl.g:2793:1: rule__TypeDeclContext__Group_2__0 : rule__TypeDeclContext__Group_2__0__Impl rule__TypeDeclContext__Group_2__1 ;
    public final void rule__TypeDeclContext__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2797:1: ( rule__TypeDeclContext__Group_2__0__Impl rule__TypeDeclContext__Group_2__1 )
            // InternalMyDsl.g:2798:2: rule__TypeDeclContext__Group_2__0__Impl rule__TypeDeclContext__Group_2__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalMyDsl.g:2805:1: rule__TypeDeclContext__Group_2__0__Impl : ( ',' ) ;
    public final void rule__TypeDeclContext__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2809:1: ( ( ',' ) )
            // InternalMyDsl.g:2810:1: ( ',' )
            {
            // InternalMyDsl.g:2810:1: ( ',' )
            // InternalMyDsl.g:2811:2: ','
            {
             before(grammarAccess.getTypeDeclContextAccess().getCommaKeyword_2_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalMyDsl.g:2820:1: rule__TypeDeclContext__Group_2__1 : rule__TypeDeclContext__Group_2__1__Impl ;
    public final void rule__TypeDeclContext__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2824:1: ( rule__TypeDeclContext__Group_2__1__Impl )
            // InternalMyDsl.g:2825:2: rule__TypeDeclContext__Group_2__1__Impl
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
    // InternalMyDsl.g:2831:1: rule__TypeDeclContext__Group_2__1__Impl : ( ( rule__TypeDeclContext__TypeNameAssignment_2_1 ) ) ;
    public final void rule__TypeDeclContext__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2835:1: ( ( ( rule__TypeDeclContext__TypeNameAssignment_2_1 ) ) )
            // InternalMyDsl.g:2836:1: ( ( rule__TypeDeclContext__TypeNameAssignment_2_1 ) )
            {
            // InternalMyDsl.g:2836:1: ( ( rule__TypeDeclContext__TypeNameAssignment_2_1 ) )
            // InternalMyDsl.g:2837:2: ( rule__TypeDeclContext__TypeNameAssignment_2_1 )
            {
             before(grammarAccess.getTypeDeclContextAccess().getTypeNameAssignment_2_1()); 
            // InternalMyDsl.g:2838:2: ( rule__TypeDeclContext__TypeNameAssignment_2_1 )
            // InternalMyDsl.g:2838:3: rule__TypeDeclContext__TypeNameAssignment_2_1
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
    // InternalMyDsl.g:2847:1: rule__TypeStructure__Group__0 : rule__TypeStructure__Group__0__Impl rule__TypeStructure__Group__1 ;
    public final void rule__TypeStructure__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2851:1: ( rule__TypeStructure__Group__0__Impl rule__TypeStructure__Group__1 )
            // InternalMyDsl.g:2852:2: rule__TypeStructure__Group__0__Impl rule__TypeStructure__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalMyDsl.g:2859:1: rule__TypeStructure__Group__0__Impl : ( '(' ) ;
    public final void rule__TypeStructure__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2863:1: ( ( '(' ) )
            // InternalMyDsl.g:2864:1: ( '(' )
            {
            // InternalMyDsl.g:2864:1: ( '(' )
            // InternalMyDsl.g:2865:2: '('
            {
             before(grammarAccess.getTypeStructureAccess().getLeftParenthesisKeyword_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalMyDsl.g:2874:1: rule__TypeStructure__Group__1 : rule__TypeStructure__Group__1__Impl rule__TypeStructure__Group__2 ;
    public final void rule__TypeStructure__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2878:1: ( rule__TypeStructure__Group__1__Impl rule__TypeStructure__Group__2 )
            // InternalMyDsl.g:2879:2: rule__TypeStructure__Group__1__Impl rule__TypeStructure__Group__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalMyDsl.g:2886:1: rule__TypeStructure__Group__1__Impl : ( ( rule__TypeStructure__VariablesAssignment_1 ) ) ;
    public final void rule__TypeStructure__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2890:1: ( ( ( rule__TypeStructure__VariablesAssignment_1 ) ) )
            // InternalMyDsl.g:2891:1: ( ( rule__TypeStructure__VariablesAssignment_1 ) )
            {
            // InternalMyDsl.g:2891:1: ( ( rule__TypeStructure__VariablesAssignment_1 ) )
            // InternalMyDsl.g:2892:2: ( rule__TypeStructure__VariablesAssignment_1 )
            {
             before(grammarAccess.getTypeStructureAccess().getVariablesAssignment_1()); 
            // InternalMyDsl.g:2893:2: ( rule__TypeStructure__VariablesAssignment_1 )
            // InternalMyDsl.g:2893:3: rule__TypeStructure__VariablesAssignment_1
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
    // InternalMyDsl.g:2901:1: rule__TypeStructure__Group__2 : rule__TypeStructure__Group__2__Impl ;
    public final void rule__TypeStructure__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2905:1: ( rule__TypeStructure__Group__2__Impl )
            // InternalMyDsl.g:2906:2: rule__TypeStructure__Group__2__Impl
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
    // InternalMyDsl.g:2912:1: rule__TypeStructure__Group__2__Impl : ( ')' ) ;
    public final void rule__TypeStructure__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2916:1: ( ( ')' ) )
            // InternalMyDsl.g:2917:1: ( ')' )
            {
            // InternalMyDsl.g:2917:1: ( ')' )
            // InternalMyDsl.g:2918:2: ')'
            {
             before(grammarAccess.getTypeStructureAccess().getRightParenthesisKeyword_2()); 
            match(input,43,FOLLOW_2); 
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
    // InternalMyDsl.g:2928:1: rule__Where__Group__0 : rule__Where__Group__0__Impl rule__Where__Group__1 ;
    public final void rule__Where__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2932:1: ( rule__Where__Group__0__Impl rule__Where__Group__1 )
            // InternalMyDsl.g:2933:2: rule__Where__Group__0__Impl rule__Where__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalMyDsl.g:2940:1: rule__Where__Group__0__Impl : ( 'where' ) ;
    public final void rule__Where__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2944:1: ( ( 'where' ) )
            // InternalMyDsl.g:2945:1: ( 'where' )
            {
            // InternalMyDsl.g:2945:1: ( 'where' )
            // InternalMyDsl.g:2946:2: 'where'
            {
             before(grammarAccess.getWhereAccess().getWhereKeyword_0()); 
            match(input,44,FOLLOW_2); 
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
    // InternalMyDsl.g:2955:1: rule__Where__Group__1 : rule__Where__Group__1__Impl rule__Where__Group__2 ;
    public final void rule__Where__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2959:1: ( rule__Where__Group__1__Impl rule__Where__Group__2 )
            // InternalMyDsl.g:2960:2: rule__Where__Group__1__Impl rule__Where__Group__2
            {
            pushFollow(FOLLOW_22);
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
    // InternalMyDsl.g:2967:1: rule__Where__Group__1__Impl : ( ( rule__Where__ExpessionsAssignment_1 ) ) ;
    public final void rule__Where__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2971:1: ( ( ( rule__Where__ExpessionsAssignment_1 ) ) )
            // InternalMyDsl.g:2972:1: ( ( rule__Where__ExpessionsAssignment_1 ) )
            {
            // InternalMyDsl.g:2972:1: ( ( rule__Where__ExpessionsAssignment_1 ) )
            // InternalMyDsl.g:2973:2: ( rule__Where__ExpessionsAssignment_1 )
            {
             before(grammarAccess.getWhereAccess().getExpessionsAssignment_1()); 
            // InternalMyDsl.g:2974:2: ( rule__Where__ExpessionsAssignment_1 )
            // InternalMyDsl.g:2974:3: rule__Where__ExpessionsAssignment_1
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
    // InternalMyDsl.g:2982:1: rule__Where__Group__2 : rule__Where__Group__2__Impl ;
    public final void rule__Where__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2986:1: ( rule__Where__Group__2__Impl )
            // InternalMyDsl.g:2987:2: rule__Where__Group__2__Impl
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
    // InternalMyDsl.g:2993:1: rule__Where__Group__2__Impl : ( ( rule__Where__Group_2__0 )* ) ;
    public final void rule__Where__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2997:1: ( ( ( rule__Where__Group_2__0 )* ) )
            // InternalMyDsl.g:2998:1: ( ( rule__Where__Group_2__0 )* )
            {
            // InternalMyDsl.g:2998:1: ( ( rule__Where__Group_2__0 )* )
            // InternalMyDsl.g:2999:2: ( rule__Where__Group_2__0 )*
            {
             before(grammarAccess.getWhereAccess().getGroup_2()); 
            // InternalMyDsl.g:3000:2: ( rule__Where__Group_2__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==36) ) {
                    int LA28_2 = input.LA(2);

                    if ( (LA28_2==RULE_ID||LA28_2==11||(LA28_2>=23 && LA28_2<=24)||LA28_2==42||LA28_2==53) ) {
                        alt28=1;
                    }


                }


                switch (alt28) {
            	case 1 :
            	    // InternalMyDsl.g:3000:3: rule__Where__Group_2__0
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__Where__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
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
    // InternalMyDsl.g:3009:1: rule__Where__Group_2__0 : rule__Where__Group_2__0__Impl rule__Where__Group_2__1 ;
    public final void rule__Where__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3013:1: ( rule__Where__Group_2__0__Impl rule__Where__Group_2__1 )
            // InternalMyDsl.g:3014:2: rule__Where__Group_2__0__Impl rule__Where__Group_2__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalMyDsl.g:3021:1: rule__Where__Group_2__0__Impl : ( ';' ) ;
    public final void rule__Where__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3025:1: ( ( ';' ) )
            // InternalMyDsl.g:3026:1: ( ';' )
            {
            // InternalMyDsl.g:3026:1: ( ';' )
            // InternalMyDsl.g:3027:2: ';'
            {
             before(grammarAccess.getWhereAccess().getSemicolonKeyword_2_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalMyDsl.g:3036:1: rule__Where__Group_2__1 : rule__Where__Group_2__1__Impl ;
    public final void rule__Where__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3040:1: ( rule__Where__Group_2__1__Impl )
            // InternalMyDsl.g:3041:2: rule__Where__Group_2__1__Impl
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
    // InternalMyDsl.g:3047:1: rule__Where__Group_2__1__Impl : ( ( rule__Where__ExpressionsAssignment_2_1 ) ) ;
    public final void rule__Where__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3051:1: ( ( ( rule__Where__ExpressionsAssignment_2_1 ) ) )
            // InternalMyDsl.g:3052:1: ( ( rule__Where__ExpressionsAssignment_2_1 ) )
            {
            // InternalMyDsl.g:3052:1: ( ( rule__Where__ExpressionsAssignment_2_1 ) )
            // InternalMyDsl.g:3053:2: ( rule__Where__ExpressionsAssignment_2_1 )
            {
             before(grammarAccess.getWhereAccess().getExpressionsAssignment_2_1()); 
            // InternalMyDsl.g:3054:2: ( rule__Where__ExpressionsAssignment_2_1 )
            // InternalMyDsl.g:3054:3: rule__Where__ExpressionsAssignment_2_1
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
    // InternalMyDsl.g:3063:1: rule__Datatype__Group__0 : rule__Datatype__Group__0__Impl rule__Datatype__Group__1 ;
    public final void rule__Datatype__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3067:1: ( rule__Datatype__Group__0__Impl rule__Datatype__Group__1 )
            // InternalMyDsl.g:3068:2: rule__Datatype__Group__0__Impl rule__Datatype__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalMyDsl.g:3075:1: rule__Datatype__Group__0__Impl : ( 'Datatype' ) ;
    public final void rule__Datatype__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3079:1: ( ( 'Datatype' ) )
            // InternalMyDsl.g:3080:1: ( 'Datatype' )
            {
            // InternalMyDsl.g:3080:1: ( 'Datatype' )
            // InternalMyDsl.g:3081:2: 'Datatype'
            {
             before(grammarAccess.getDatatypeAccess().getDatatypeKeyword_0()); 
            match(input,45,FOLLOW_2); 
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
    // InternalMyDsl.g:3090:1: rule__Datatype__Group__1 : rule__Datatype__Group__1__Impl rule__Datatype__Group__2 ;
    public final void rule__Datatype__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3094:1: ( rule__Datatype__Group__1__Impl rule__Datatype__Group__2 )
            // InternalMyDsl.g:3095:2: rule__Datatype__Group__1__Impl rule__Datatype__Group__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalMyDsl.g:3102:1: rule__Datatype__Group__1__Impl : ( ( rule__Datatype__TypeNameAssignment_1 ) ) ;
    public final void rule__Datatype__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3106:1: ( ( ( rule__Datatype__TypeNameAssignment_1 ) ) )
            // InternalMyDsl.g:3107:1: ( ( rule__Datatype__TypeNameAssignment_1 ) )
            {
            // InternalMyDsl.g:3107:1: ( ( rule__Datatype__TypeNameAssignment_1 ) )
            // InternalMyDsl.g:3108:2: ( rule__Datatype__TypeNameAssignment_1 )
            {
             before(grammarAccess.getDatatypeAccess().getTypeNameAssignment_1()); 
            // InternalMyDsl.g:3109:2: ( rule__Datatype__TypeNameAssignment_1 )
            // InternalMyDsl.g:3109:3: rule__Datatype__TypeNameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Datatype__TypeNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDatatypeAccess().getTypeNameAssignment_1()); 

            }


            }

        }
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
    // InternalMyDsl.g:3117:1: rule__Datatype__Group__2 : rule__Datatype__Group__2__Impl rule__Datatype__Group__3 ;
    public final void rule__Datatype__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3121:1: ( rule__Datatype__Group__2__Impl rule__Datatype__Group__3 )
            // InternalMyDsl.g:3122:2: rule__Datatype__Group__2__Impl rule__Datatype__Group__3
            {
            pushFollow(FOLLOW_25);
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
    // InternalMyDsl.g:3129:1: rule__Datatype__Group__2__Impl : ( ( rule__Datatype__ContextAssignment_2 )? ) ;
    public final void rule__Datatype__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3133:1: ( ( ( rule__Datatype__ContextAssignment_2 )? ) )
            // InternalMyDsl.g:3134:1: ( ( rule__Datatype__ContextAssignment_2 )? )
            {
            // InternalMyDsl.g:3134:1: ( ( rule__Datatype__ContextAssignment_2 )? )
            // InternalMyDsl.g:3135:2: ( rule__Datatype__ContextAssignment_2 )?
            {
             before(grammarAccess.getDatatypeAccess().getContextAssignment_2()); 
            // InternalMyDsl.g:3136:2: ( rule__Datatype__ContextAssignment_2 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==39) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalMyDsl.g:3136:3: rule__Datatype__ContextAssignment_2
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
    // InternalMyDsl.g:3144:1: rule__Datatype__Group__3 : rule__Datatype__Group__3__Impl rule__Datatype__Group__4 ;
    public final void rule__Datatype__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3148:1: ( rule__Datatype__Group__3__Impl rule__Datatype__Group__4 )
            // InternalMyDsl.g:3149:2: rule__Datatype__Group__3__Impl rule__Datatype__Group__4
            {
            pushFollow(FOLLOW_26);
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
    // InternalMyDsl.g:3156:1: rule__Datatype__Group__3__Impl : ( ( ( rule__Datatype__Group_3__0 ) ) ( ( rule__Datatype__Group_3__0 )* ) ) ;
    public final void rule__Datatype__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3160:1: ( ( ( ( rule__Datatype__Group_3__0 ) ) ( ( rule__Datatype__Group_3__0 )* ) ) )
            // InternalMyDsl.g:3161:1: ( ( ( rule__Datatype__Group_3__0 ) ) ( ( rule__Datatype__Group_3__0 )* ) )
            {
            // InternalMyDsl.g:3161:1: ( ( ( rule__Datatype__Group_3__0 ) ) ( ( rule__Datatype__Group_3__0 )* ) )
            // InternalMyDsl.g:3162:2: ( ( rule__Datatype__Group_3__0 ) ) ( ( rule__Datatype__Group_3__0 )* )
            {
            // InternalMyDsl.g:3162:2: ( ( rule__Datatype__Group_3__0 ) )
            // InternalMyDsl.g:3163:3: ( rule__Datatype__Group_3__0 )
            {
             before(grammarAccess.getDatatypeAccess().getGroup_3()); 
            // InternalMyDsl.g:3164:3: ( rule__Datatype__Group_3__0 )
            // InternalMyDsl.g:3164:4: rule__Datatype__Group_3__0
            {
            pushFollow(FOLLOW_27);
            rule__Datatype__Group_3__0();

            state._fsp--;


            }

             after(grammarAccess.getDatatypeAccess().getGroup_3()); 

            }

            // InternalMyDsl.g:3167:2: ( ( rule__Datatype__Group_3__0 )* )
            // InternalMyDsl.g:3168:3: ( rule__Datatype__Group_3__0 )*
            {
             before(grammarAccess.getDatatypeAccess().getGroup_3()); 
            // InternalMyDsl.g:3169:3: ( rule__Datatype__Group_3__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==46) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalMyDsl.g:3169:4: rule__Datatype__Group_3__0
            	    {
            	    pushFollow(FOLLOW_27);
            	    rule__Datatype__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
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
    // InternalMyDsl.g:3178:1: rule__Datatype__Group__4 : rule__Datatype__Group__4__Impl rule__Datatype__Group__5 ;
    public final void rule__Datatype__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3182:1: ( rule__Datatype__Group__4__Impl rule__Datatype__Group__5 )
            // InternalMyDsl.g:3183:2: rule__Datatype__Group__4__Impl rule__Datatype__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__Datatype__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Datatype__Group__5();

            state._fsp--;


            }

        }
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
    // InternalMyDsl.g:3190:1: rule__Datatype__Group__4__Impl : ( '{' ) ;
    public final void rule__Datatype__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3194:1: ( ( '{' ) )
            // InternalMyDsl.g:3195:1: ( '{' )
            {
            // InternalMyDsl.g:3195:1: ( '{' )
            // InternalMyDsl.g:3196:2: '{'
            {
             before(grammarAccess.getDatatypeAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getDatatypeAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__Datatype__Group__5"
    // InternalMyDsl.g:3205:1: rule__Datatype__Group__5 : rule__Datatype__Group__5__Impl rule__Datatype__Group__6 ;
    public final void rule__Datatype__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3209:1: ( rule__Datatype__Group__5__Impl rule__Datatype__Group__6 )
            // InternalMyDsl.g:3210:2: rule__Datatype__Group__5__Impl rule__Datatype__Group__6
            {
            pushFollow(FOLLOW_9);
            rule__Datatype__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Datatype__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Datatype__Group__5"


    // $ANTLR start "rule__Datatype__Group__5__Impl"
    // InternalMyDsl.g:3217:1: rule__Datatype__Group__5__Impl : ( ( rule__Datatype__BodyElementsAssignment_5 )* ) ;
    public final void rule__Datatype__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3221:1: ( ( ( rule__Datatype__BodyElementsAssignment_5 )* ) )
            // InternalMyDsl.g:3222:1: ( ( rule__Datatype__BodyElementsAssignment_5 )* )
            {
            // InternalMyDsl.g:3222:1: ( ( rule__Datatype__BodyElementsAssignment_5 )* )
            // InternalMyDsl.g:3223:2: ( rule__Datatype__BodyElementsAssignment_5 )*
            {
             before(grammarAccess.getDatatypeAccess().getBodyElementsAssignment_5()); 
            // InternalMyDsl.g:3224:2: ( rule__Datatype__BodyElementsAssignment_5 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_ID||LA31_0==49) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalMyDsl.g:3224:3: rule__Datatype__BodyElementsAssignment_5
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Datatype__BodyElementsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getDatatypeAccess().getBodyElementsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Datatype__Group__5__Impl"


    // $ANTLR start "rule__Datatype__Group__6"
    // InternalMyDsl.g:3232:1: rule__Datatype__Group__6 : rule__Datatype__Group__6__Impl ;
    public final void rule__Datatype__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3236:1: ( rule__Datatype__Group__6__Impl )
            // InternalMyDsl.g:3237:2: rule__Datatype__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Datatype__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Datatype__Group__6"


    // $ANTLR start "rule__Datatype__Group__6__Impl"
    // InternalMyDsl.g:3243:1: rule__Datatype__Group__6__Impl : ( '}' ) ;
    public final void rule__Datatype__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3247:1: ( ( '}' ) )
            // InternalMyDsl.g:3248:1: ( '}' )
            {
            // InternalMyDsl.g:3248:1: ( '}' )
            // InternalMyDsl.g:3249:2: '}'
            {
             before(grammarAccess.getDatatypeAccess().getRightCurlyBracketKeyword_6()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getDatatypeAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Datatype__Group__6__Impl"


    // $ANTLR start "rule__Datatype__Group_3__0"
    // InternalMyDsl.g:3259:1: rule__Datatype__Group_3__0 : rule__Datatype__Group_3__0__Impl rule__Datatype__Group_3__1 ;
    public final void rule__Datatype__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3263:1: ( rule__Datatype__Group_3__0__Impl rule__Datatype__Group_3__1 )
            // InternalMyDsl.g:3264:2: rule__Datatype__Group_3__0__Impl rule__Datatype__Group_3__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalMyDsl.g:3271:1: rule__Datatype__Group_3__0__Impl : ( '|' ) ;
    public final void rule__Datatype__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3275:1: ( ( '|' ) )
            // InternalMyDsl.g:3276:1: ( '|' )
            {
            // InternalMyDsl.g:3276:1: ( '|' )
            // InternalMyDsl.g:3277:2: '|'
            {
             before(grammarAccess.getDatatypeAccess().getVerticalLineKeyword_3_0()); 
            match(input,46,FOLLOW_2); 
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
    // InternalMyDsl.g:3286:1: rule__Datatype__Group_3__1 : rule__Datatype__Group_3__1__Impl ;
    public final void rule__Datatype__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3290:1: ( rule__Datatype__Group_3__1__Impl )
            // InternalMyDsl.g:3291:2: rule__Datatype__Group_3__1__Impl
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
    // InternalMyDsl.g:3297:1: rule__Datatype__Group_3__1__Impl : ( ( rule__Datatype__VarListAssignment_3_1 ) ) ;
    public final void rule__Datatype__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3301:1: ( ( ( rule__Datatype__VarListAssignment_3_1 ) ) )
            // InternalMyDsl.g:3302:1: ( ( rule__Datatype__VarListAssignment_3_1 ) )
            {
            // InternalMyDsl.g:3302:1: ( ( rule__Datatype__VarListAssignment_3_1 ) )
            // InternalMyDsl.g:3303:2: ( rule__Datatype__VarListAssignment_3_1 )
            {
             before(grammarAccess.getDatatypeAccess().getVarListAssignment_3_1()); 
            // InternalMyDsl.g:3304:2: ( rule__Datatype__VarListAssignment_3_1 )
            // InternalMyDsl.g:3304:3: rule__Datatype__VarListAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Datatype__VarListAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getDatatypeAccess().getVarListAssignment_3_1()); 

            }


            }

        }
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
    // InternalMyDsl.g:3313:1: rule__DatatypeConstructor__Group__0 : rule__DatatypeConstructor__Group__0__Impl rule__DatatypeConstructor__Group__1 ;
    public final void rule__DatatypeConstructor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3317:1: ( rule__DatatypeConstructor__Group__0__Impl rule__DatatypeConstructor__Group__1 )
            // InternalMyDsl.g:3318:2: rule__DatatypeConstructor__Group__0__Impl rule__DatatypeConstructor__Group__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalMyDsl.g:3325:1: rule__DatatypeConstructor__Group__0__Impl : ( ( rule__DatatypeConstructor__NameAssignment_0 ) ) ;
    public final void rule__DatatypeConstructor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3329:1: ( ( ( rule__DatatypeConstructor__NameAssignment_0 ) ) )
            // InternalMyDsl.g:3330:1: ( ( rule__DatatypeConstructor__NameAssignment_0 ) )
            {
            // InternalMyDsl.g:3330:1: ( ( rule__DatatypeConstructor__NameAssignment_0 ) )
            // InternalMyDsl.g:3331:2: ( rule__DatatypeConstructor__NameAssignment_0 )
            {
             before(grammarAccess.getDatatypeConstructorAccess().getNameAssignment_0()); 
            // InternalMyDsl.g:3332:2: ( rule__DatatypeConstructor__NameAssignment_0 )
            // InternalMyDsl.g:3332:3: rule__DatatypeConstructor__NameAssignment_0
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
    // InternalMyDsl.g:3340:1: rule__DatatypeConstructor__Group__1 : rule__DatatypeConstructor__Group__1__Impl ;
    public final void rule__DatatypeConstructor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3344:1: ( rule__DatatypeConstructor__Group__1__Impl )
            // InternalMyDsl.g:3345:2: rule__DatatypeConstructor__Group__1__Impl
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
    // InternalMyDsl.g:3351:1: rule__DatatypeConstructor__Group__1__Impl : ( ( rule__DatatypeConstructor__Group_1__0 )? ) ;
    public final void rule__DatatypeConstructor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3355:1: ( ( ( rule__DatatypeConstructor__Group_1__0 )? ) )
            // InternalMyDsl.g:3356:1: ( ( rule__DatatypeConstructor__Group_1__0 )? )
            {
            // InternalMyDsl.g:3356:1: ( ( rule__DatatypeConstructor__Group_1__0 )? )
            // InternalMyDsl.g:3357:2: ( rule__DatatypeConstructor__Group_1__0 )?
            {
             before(grammarAccess.getDatatypeConstructorAccess().getGroup_1()); 
            // InternalMyDsl.g:3358:2: ( rule__DatatypeConstructor__Group_1__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==42) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalMyDsl.g:3358:3: rule__DatatypeConstructor__Group_1__0
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
    // InternalMyDsl.g:3367:1: rule__DatatypeConstructor__Group_1__0 : rule__DatatypeConstructor__Group_1__0__Impl rule__DatatypeConstructor__Group_1__1 ;
    public final void rule__DatatypeConstructor__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3371:1: ( rule__DatatypeConstructor__Group_1__0__Impl rule__DatatypeConstructor__Group_1__1 )
            // InternalMyDsl.g:3372:2: rule__DatatypeConstructor__Group_1__0__Impl rule__DatatypeConstructor__Group_1__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalMyDsl.g:3379:1: rule__DatatypeConstructor__Group_1__0__Impl : ( '(' ) ;
    public final void rule__DatatypeConstructor__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3383:1: ( ( '(' ) )
            // InternalMyDsl.g:3384:1: ( '(' )
            {
            // InternalMyDsl.g:3384:1: ( '(' )
            // InternalMyDsl.g:3385:2: '('
            {
             before(grammarAccess.getDatatypeConstructorAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalMyDsl.g:3394:1: rule__DatatypeConstructor__Group_1__1 : rule__DatatypeConstructor__Group_1__1__Impl rule__DatatypeConstructor__Group_1__2 ;
    public final void rule__DatatypeConstructor__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3398:1: ( rule__DatatypeConstructor__Group_1__1__Impl rule__DatatypeConstructor__Group_1__2 )
            // InternalMyDsl.g:3399:2: rule__DatatypeConstructor__Group_1__1__Impl rule__DatatypeConstructor__Group_1__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalMyDsl.g:3406:1: rule__DatatypeConstructor__Group_1__1__Impl : ( ( rule__DatatypeConstructor__DeconsAssignment_1_1 ) ) ;
    public final void rule__DatatypeConstructor__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3410:1: ( ( ( rule__DatatypeConstructor__DeconsAssignment_1_1 ) ) )
            // InternalMyDsl.g:3411:1: ( ( rule__DatatypeConstructor__DeconsAssignment_1_1 ) )
            {
            // InternalMyDsl.g:3411:1: ( ( rule__DatatypeConstructor__DeconsAssignment_1_1 ) )
            // InternalMyDsl.g:3412:2: ( rule__DatatypeConstructor__DeconsAssignment_1_1 )
            {
             before(grammarAccess.getDatatypeConstructorAccess().getDeconsAssignment_1_1()); 
            // InternalMyDsl.g:3413:2: ( rule__DatatypeConstructor__DeconsAssignment_1_1 )
            // InternalMyDsl.g:3413:3: rule__DatatypeConstructor__DeconsAssignment_1_1
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
    // InternalMyDsl.g:3421:1: rule__DatatypeConstructor__Group_1__2 : rule__DatatypeConstructor__Group_1__2__Impl ;
    public final void rule__DatatypeConstructor__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3425:1: ( rule__DatatypeConstructor__Group_1__2__Impl )
            // InternalMyDsl.g:3426:2: rule__DatatypeConstructor__Group_1__2__Impl
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
    // InternalMyDsl.g:3432:1: rule__DatatypeConstructor__Group_1__2__Impl : ( ')' ) ;
    public final void rule__DatatypeConstructor__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3436:1: ( ( ')' ) )
            // InternalMyDsl.g:3437:1: ( ')' )
            {
            // InternalMyDsl.g:3437:1: ( ')' )
            // InternalMyDsl.g:3438:2: ')'
            {
             before(grammarAccess.getDatatypeConstructorAccess().getRightParenthesisKeyword_1_2()); 
            match(input,43,FOLLOW_2); 
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
    // InternalMyDsl.g:3448:1: rule__Extend__Group__0 : rule__Extend__Group__0__Impl rule__Extend__Group__1 ;
    public final void rule__Extend__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3452:1: ( rule__Extend__Group__0__Impl rule__Extend__Group__1 )
            // InternalMyDsl.g:3453:2: rule__Extend__Group__0__Impl rule__Extend__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalMyDsl.g:3460:1: rule__Extend__Group__0__Impl : ( 'Extend' ) ;
    public final void rule__Extend__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3464:1: ( ( 'Extend' ) )
            // InternalMyDsl.g:3465:1: ( 'Extend' )
            {
            // InternalMyDsl.g:3465:1: ( 'Extend' )
            // InternalMyDsl.g:3466:2: 'Extend'
            {
             before(grammarAccess.getExtendAccess().getExtendKeyword_0()); 
            match(input,47,FOLLOW_2); 
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
    // InternalMyDsl.g:3475:1: rule__Extend__Group__1 : rule__Extend__Group__1__Impl rule__Extend__Group__2 ;
    public final void rule__Extend__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3479:1: ( rule__Extend__Group__1__Impl rule__Extend__Group__2 )
            // InternalMyDsl.g:3480:2: rule__Extend__Group__1__Impl rule__Extend__Group__2
            {
            pushFollow(FOLLOW_28);
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
    // InternalMyDsl.g:3487:1: rule__Extend__Group__1__Impl : ( ( rule__Extend__NameAssignment_1 ) ) ;
    public final void rule__Extend__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3491:1: ( ( ( rule__Extend__NameAssignment_1 ) ) )
            // InternalMyDsl.g:3492:1: ( ( rule__Extend__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:3492:1: ( ( rule__Extend__NameAssignment_1 ) )
            // InternalMyDsl.g:3493:2: ( rule__Extend__NameAssignment_1 )
            {
             before(grammarAccess.getExtendAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:3494:2: ( rule__Extend__NameAssignment_1 )
            // InternalMyDsl.g:3494:3: rule__Extend__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Extend__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getExtendAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // InternalMyDsl.g:3502:1: rule__Extend__Group__2 : rule__Extend__Group__2__Impl rule__Extend__Group__3 ;
    public final void rule__Extend__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3506:1: ( rule__Extend__Group__2__Impl rule__Extend__Group__3 )
            // InternalMyDsl.g:3507:2: rule__Extend__Group__2__Impl rule__Extend__Group__3
            {
            pushFollow(FOLLOW_6);
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
    // InternalMyDsl.g:3514:1: rule__Extend__Group__2__Impl : ( '(' ) ;
    public final void rule__Extend__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3518:1: ( ( '(' ) )
            // InternalMyDsl.g:3519:1: ( '(' )
            {
            // InternalMyDsl.g:3519:1: ( '(' )
            // InternalMyDsl.g:3520:2: '('
            {
             before(grammarAccess.getExtendAccess().getLeftParenthesisKeyword_2()); 
            match(input,42,FOLLOW_2); 
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
    // InternalMyDsl.g:3529:1: rule__Extend__Group__3 : rule__Extend__Group__3__Impl rule__Extend__Group__4 ;
    public final void rule__Extend__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3533:1: ( rule__Extend__Group__3__Impl rule__Extend__Group__4 )
            // InternalMyDsl.g:3534:2: rule__Extend__Group__3__Impl rule__Extend__Group__4
            {
            pushFollow(FOLLOW_20);
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
    // InternalMyDsl.g:3541:1: rule__Extend__Group__3__Impl : ( ( rule__Extend__ExtensionAssignment_3 ) ) ;
    public final void rule__Extend__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3545:1: ( ( ( rule__Extend__ExtensionAssignment_3 ) ) )
            // InternalMyDsl.g:3546:1: ( ( rule__Extend__ExtensionAssignment_3 ) )
            {
            // InternalMyDsl.g:3546:1: ( ( rule__Extend__ExtensionAssignment_3 ) )
            // InternalMyDsl.g:3547:2: ( rule__Extend__ExtensionAssignment_3 )
            {
             before(grammarAccess.getExtendAccess().getExtensionAssignment_3()); 
            // InternalMyDsl.g:3548:2: ( rule__Extend__ExtensionAssignment_3 )
            // InternalMyDsl.g:3548:3: rule__Extend__ExtensionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Extend__ExtensionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getExtendAccess().getExtensionAssignment_3()); 

            }


            }

        }
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
    // InternalMyDsl.g:3556:1: rule__Extend__Group__4 : rule__Extend__Group__4__Impl rule__Extend__Group__5 ;
    public final void rule__Extend__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3560:1: ( rule__Extend__Group__4__Impl rule__Extend__Group__5 )
            // InternalMyDsl.g:3561:2: rule__Extend__Group__4__Impl rule__Extend__Group__5
            {
            pushFollow(FOLLOW_26);
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
    // InternalMyDsl.g:3568:1: rule__Extend__Group__4__Impl : ( ')' ) ;
    public final void rule__Extend__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3572:1: ( ( ')' ) )
            // InternalMyDsl.g:3573:1: ( ')' )
            {
            // InternalMyDsl.g:3573:1: ( ')' )
            // InternalMyDsl.g:3574:2: ')'
            {
             before(grammarAccess.getExtendAccess().getRightParenthesisKeyword_4()); 
            match(input,43,FOLLOW_2); 
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
    // InternalMyDsl.g:3583:1: rule__Extend__Group__5 : rule__Extend__Group__5__Impl rule__Extend__Group__6 ;
    public final void rule__Extend__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3587:1: ( rule__Extend__Group__5__Impl rule__Extend__Group__6 )
            // InternalMyDsl.g:3588:2: rule__Extend__Group__5__Impl rule__Extend__Group__6
            {
            pushFollow(FOLLOW_9);
            rule__Extend__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Extend__Group__6();

            state._fsp--;


            }

        }
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
    // InternalMyDsl.g:3595:1: rule__Extend__Group__5__Impl : ( '{' ) ;
    public final void rule__Extend__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3599:1: ( ( '{' ) )
            // InternalMyDsl.g:3600:1: ( '{' )
            {
            // InternalMyDsl.g:3600:1: ( '{' )
            // InternalMyDsl.g:3601:2: '{'
            {
             before(grammarAccess.getExtendAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getExtendAccess().getLeftCurlyBracketKeyword_5()); 

            }


            }

        }
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


    // $ANTLR start "rule__Extend__Group__6"
    // InternalMyDsl.g:3610:1: rule__Extend__Group__6 : rule__Extend__Group__6__Impl rule__Extend__Group__7 ;
    public final void rule__Extend__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3614:1: ( rule__Extend__Group__6__Impl rule__Extend__Group__7 )
            // InternalMyDsl.g:3615:2: rule__Extend__Group__6__Impl rule__Extend__Group__7
            {
            pushFollow(FOLLOW_9);
            rule__Extend__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Extend__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extend__Group__6"


    // $ANTLR start "rule__Extend__Group__6__Impl"
    // InternalMyDsl.g:3622:1: rule__Extend__Group__6__Impl : ( ( rule__Extend__BodyElementsAssignment_6 )* ) ;
    public final void rule__Extend__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3626:1: ( ( ( rule__Extend__BodyElementsAssignment_6 )* ) )
            // InternalMyDsl.g:3627:1: ( ( rule__Extend__BodyElementsAssignment_6 )* )
            {
            // InternalMyDsl.g:3627:1: ( ( rule__Extend__BodyElementsAssignment_6 )* )
            // InternalMyDsl.g:3628:2: ( rule__Extend__BodyElementsAssignment_6 )*
            {
             before(grammarAccess.getExtendAccess().getBodyElementsAssignment_6()); 
            // InternalMyDsl.g:3629:2: ( rule__Extend__BodyElementsAssignment_6 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==RULE_ID||LA33_0==49) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalMyDsl.g:3629:3: rule__Extend__BodyElementsAssignment_6
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Extend__BodyElementsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getExtendAccess().getBodyElementsAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extend__Group__6__Impl"


    // $ANTLR start "rule__Extend__Group__7"
    // InternalMyDsl.g:3637:1: rule__Extend__Group__7 : rule__Extend__Group__7__Impl ;
    public final void rule__Extend__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3641:1: ( rule__Extend__Group__7__Impl )
            // InternalMyDsl.g:3642:2: rule__Extend__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Extend__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extend__Group__7"


    // $ANTLR start "rule__Extend__Group__7__Impl"
    // InternalMyDsl.g:3648:1: rule__Extend__Group__7__Impl : ( '}' ) ;
    public final void rule__Extend__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3652:1: ( ( '}' ) )
            // InternalMyDsl.g:3653:1: ( '}' )
            {
            // InternalMyDsl.g:3653:1: ( '}' )
            // InternalMyDsl.g:3654:2: '}'
            {
             before(grammarAccess.getExtendAccess().getRightCurlyBracketKeyword_7()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getExtendAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extend__Group__7__Impl"


    // $ANTLR start "rule__FunctionDecl__Group__0"
    // InternalMyDsl.g:3664:1: rule__FunctionDecl__Group__0 : rule__FunctionDecl__Group__0__Impl rule__FunctionDecl__Group__1 ;
    public final void rule__FunctionDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3668:1: ( rule__FunctionDecl__Group__0__Impl rule__FunctionDecl__Group__1 )
            // InternalMyDsl.g:3669:2: rule__FunctionDecl__Group__0__Impl rule__FunctionDecl__Group__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalMyDsl.g:3676:1: rule__FunctionDecl__Group__0__Impl : ( ( rule__FunctionDecl__NameAssignment_0 ) ) ;
    public final void rule__FunctionDecl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3680:1: ( ( ( rule__FunctionDecl__NameAssignment_0 ) ) )
            // InternalMyDsl.g:3681:1: ( ( rule__FunctionDecl__NameAssignment_0 ) )
            {
            // InternalMyDsl.g:3681:1: ( ( rule__FunctionDecl__NameAssignment_0 ) )
            // InternalMyDsl.g:3682:2: ( rule__FunctionDecl__NameAssignment_0 )
            {
             before(grammarAccess.getFunctionDeclAccess().getNameAssignment_0()); 
            // InternalMyDsl.g:3683:2: ( rule__FunctionDecl__NameAssignment_0 )
            // InternalMyDsl.g:3683:3: rule__FunctionDecl__NameAssignment_0
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
    // InternalMyDsl.g:3691:1: rule__FunctionDecl__Group__1 : rule__FunctionDecl__Group__1__Impl rule__FunctionDecl__Group__2 ;
    public final void rule__FunctionDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3695:1: ( rule__FunctionDecl__Group__1__Impl rule__FunctionDecl__Group__2 )
            // InternalMyDsl.g:3696:2: rule__FunctionDecl__Group__1__Impl rule__FunctionDecl__Group__2
            {
            pushFollow(FOLLOW_29);
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
    // InternalMyDsl.g:3703:1: rule__FunctionDecl__Group__1__Impl : ( ( rule__FunctionDecl__ContextAssignment_1 )? ) ;
    public final void rule__FunctionDecl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3707:1: ( ( ( rule__FunctionDecl__ContextAssignment_1 )? ) )
            // InternalMyDsl.g:3708:1: ( ( rule__FunctionDecl__ContextAssignment_1 )? )
            {
            // InternalMyDsl.g:3708:1: ( ( rule__FunctionDecl__ContextAssignment_1 )? )
            // InternalMyDsl.g:3709:2: ( rule__FunctionDecl__ContextAssignment_1 )?
            {
             before(grammarAccess.getFunctionDeclAccess().getContextAssignment_1()); 
            // InternalMyDsl.g:3710:2: ( rule__FunctionDecl__ContextAssignment_1 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==39) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalMyDsl.g:3710:3: rule__FunctionDecl__ContextAssignment_1
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
    // InternalMyDsl.g:3718:1: rule__FunctionDecl__Group__2 : rule__FunctionDecl__Group__2__Impl rule__FunctionDecl__Group__3 ;
    public final void rule__FunctionDecl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3722:1: ( rule__FunctionDecl__Group__2__Impl rule__FunctionDecl__Group__3 )
            // InternalMyDsl.g:3723:2: rule__FunctionDecl__Group__2__Impl rule__FunctionDecl__Group__3
            {
            pushFollow(FOLLOW_30);
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
    // InternalMyDsl.g:3730:1: rule__FunctionDecl__Group__2__Impl : ( '(' ) ;
    public final void rule__FunctionDecl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3734:1: ( ( '(' ) )
            // InternalMyDsl.g:3735:1: ( '(' )
            {
            // InternalMyDsl.g:3735:1: ( '(' )
            // InternalMyDsl.g:3736:2: '('
            {
             before(grammarAccess.getFunctionDeclAccess().getLeftParenthesisKeyword_2()); 
            match(input,42,FOLLOW_2); 
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
    // InternalMyDsl.g:3745:1: rule__FunctionDecl__Group__3 : rule__FunctionDecl__Group__3__Impl rule__FunctionDecl__Group__4 ;
    public final void rule__FunctionDecl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3749:1: ( rule__FunctionDecl__Group__3__Impl rule__FunctionDecl__Group__4 )
            // InternalMyDsl.g:3750:2: rule__FunctionDecl__Group__3__Impl rule__FunctionDecl__Group__4
            {
            pushFollow(FOLLOW_30);
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
    // InternalMyDsl.g:3757:1: rule__FunctionDecl__Group__3__Impl : ( ( rule__FunctionDecl__VarListAssignment_3 )? ) ;
    public final void rule__FunctionDecl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3761:1: ( ( ( rule__FunctionDecl__VarListAssignment_3 )? ) )
            // InternalMyDsl.g:3762:1: ( ( rule__FunctionDecl__VarListAssignment_3 )? )
            {
            // InternalMyDsl.g:3762:1: ( ( rule__FunctionDecl__VarListAssignment_3 )? )
            // InternalMyDsl.g:3763:2: ( rule__FunctionDecl__VarListAssignment_3 )?
            {
             before(grammarAccess.getFunctionDeclAccess().getVarListAssignment_3()); 
            // InternalMyDsl.g:3764:2: ( rule__FunctionDecl__VarListAssignment_3 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_ID) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalMyDsl.g:3764:3: rule__FunctionDecl__VarListAssignment_3
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
    // InternalMyDsl.g:3772:1: rule__FunctionDecl__Group__4 : rule__FunctionDecl__Group__4__Impl rule__FunctionDecl__Group__5 ;
    public final void rule__FunctionDecl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3776:1: ( rule__FunctionDecl__Group__4__Impl rule__FunctionDecl__Group__5 )
            // InternalMyDsl.g:3777:2: rule__FunctionDecl__Group__4__Impl rule__FunctionDecl__Group__5
            {
            pushFollow(FOLLOW_4);
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
    // InternalMyDsl.g:3784:1: rule__FunctionDecl__Group__4__Impl : ( ')' ) ;
    public final void rule__FunctionDecl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3788:1: ( ( ')' ) )
            // InternalMyDsl.g:3789:1: ( ')' )
            {
            // InternalMyDsl.g:3789:1: ( ')' )
            // InternalMyDsl.g:3790:2: ')'
            {
             before(grammarAccess.getFunctionDeclAccess().getRightParenthesisKeyword_4()); 
            match(input,43,FOLLOW_2); 
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
    // InternalMyDsl.g:3799:1: rule__FunctionDecl__Group__5 : rule__FunctionDecl__Group__5__Impl rule__FunctionDecl__Group__6 ;
    public final void rule__FunctionDecl__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3803:1: ( rule__FunctionDecl__Group__5__Impl rule__FunctionDecl__Group__6 )
            // InternalMyDsl.g:3804:2: rule__FunctionDecl__Group__5__Impl rule__FunctionDecl__Group__6
            {
            pushFollow(FOLLOW_16);
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
    // InternalMyDsl.g:3811:1: rule__FunctionDecl__Group__5__Impl : ( ':' ) ;
    public final void rule__FunctionDecl__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3815:1: ( ( ':' ) )
            // InternalMyDsl.g:3816:1: ( ':' )
            {
            // InternalMyDsl.g:3816:1: ( ':' )
            // InternalMyDsl.g:3817:2: ':'
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
    // InternalMyDsl.g:3826:1: rule__FunctionDecl__Group__6 : rule__FunctionDecl__Group__6__Impl rule__FunctionDecl__Group__7 ;
    public final void rule__FunctionDecl__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3830:1: ( rule__FunctionDecl__Group__6__Impl rule__FunctionDecl__Group__7 )
            // InternalMyDsl.g:3831:2: rule__FunctionDecl__Group__6__Impl rule__FunctionDecl__Group__7
            {
            pushFollow(FOLLOW_31);
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
    // InternalMyDsl.g:3838:1: rule__FunctionDecl__Group__6__Impl : ( ( rule__FunctionDecl__ReturnTypeAssignment_6 ) ) ;
    public final void rule__FunctionDecl__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3842:1: ( ( ( rule__FunctionDecl__ReturnTypeAssignment_6 ) ) )
            // InternalMyDsl.g:3843:1: ( ( rule__FunctionDecl__ReturnTypeAssignment_6 ) )
            {
            // InternalMyDsl.g:3843:1: ( ( rule__FunctionDecl__ReturnTypeAssignment_6 ) )
            // InternalMyDsl.g:3844:2: ( rule__FunctionDecl__ReturnTypeAssignment_6 )
            {
             before(grammarAccess.getFunctionDeclAccess().getReturnTypeAssignment_6()); 
            // InternalMyDsl.g:3845:2: ( rule__FunctionDecl__ReturnTypeAssignment_6 )
            // InternalMyDsl.g:3845:3: rule__FunctionDecl__ReturnTypeAssignment_6
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
    // InternalMyDsl.g:3853:1: rule__FunctionDecl__Group__7 : rule__FunctionDecl__Group__7__Impl rule__FunctionDecl__Group__8 ;
    public final void rule__FunctionDecl__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3857:1: ( rule__FunctionDecl__Group__7__Impl rule__FunctionDecl__Group__8 )
            // InternalMyDsl.g:3858:2: rule__FunctionDecl__Group__7__Impl rule__FunctionDecl__Group__8
            {
            pushFollow(FOLLOW_31);
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
    // InternalMyDsl.g:3865:1: rule__FunctionDecl__Group__7__Impl : ( ( rule__FunctionDecl__InfixAssignment_7 )? ) ;
    public final void rule__FunctionDecl__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3869:1: ( ( ( rule__FunctionDecl__InfixAssignment_7 )? ) )
            // InternalMyDsl.g:3870:1: ( ( rule__FunctionDecl__InfixAssignment_7 )? )
            {
            // InternalMyDsl.g:3870:1: ( ( rule__FunctionDecl__InfixAssignment_7 )? )
            // InternalMyDsl.g:3871:2: ( rule__FunctionDecl__InfixAssignment_7 )?
            {
             before(grammarAccess.getFunctionDeclAccess().getInfixAssignment_7()); 
            // InternalMyDsl.g:3872:2: ( rule__FunctionDecl__InfixAssignment_7 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==52) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalMyDsl.g:3872:3: rule__FunctionDecl__InfixAssignment_7
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
    // InternalMyDsl.g:3880:1: rule__FunctionDecl__Group__8 : rule__FunctionDecl__Group__8__Impl rule__FunctionDecl__Group__9 ;
    public final void rule__FunctionDecl__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3884:1: ( rule__FunctionDecl__Group__8__Impl rule__FunctionDecl__Group__9 )
            // InternalMyDsl.g:3885:2: rule__FunctionDecl__Group__8__Impl rule__FunctionDecl__Group__9
            {
            pushFollow(FOLLOW_31);
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
    // InternalMyDsl.g:3892:1: rule__FunctionDecl__Group__8__Impl : ( ( rule__FunctionDecl__PrecedenceAssignment_8 )? ) ;
    public final void rule__FunctionDecl__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3896:1: ( ( ( rule__FunctionDecl__PrecedenceAssignment_8 )? ) )
            // InternalMyDsl.g:3897:1: ( ( rule__FunctionDecl__PrecedenceAssignment_8 )? )
            {
            // InternalMyDsl.g:3897:1: ( ( rule__FunctionDecl__PrecedenceAssignment_8 )? )
            // InternalMyDsl.g:3898:2: ( rule__FunctionDecl__PrecedenceAssignment_8 )?
            {
             before(grammarAccess.getFunctionDeclAccess().getPrecedenceAssignment_8()); 
            // InternalMyDsl.g:3899:2: ( rule__FunctionDecl__PrecedenceAssignment_8 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_INT) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalMyDsl.g:3899:3: rule__FunctionDecl__PrecedenceAssignment_8
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
    // InternalMyDsl.g:3907:1: rule__FunctionDecl__Group__9 : rule__FunctionDecl__Group__9__Impl ;
    public final void rule__FunctionDecl__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3911:1: ( rule__FunctionDecl__Group__9__Impl )
            // InternalMyDsl.g:3912:2: rule__FunctionDecl__Group__9__Impl
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
    // InternalMyDsl.g:3918:1: rule__FunctionDecl__Group__9__Impl : ( ( rule__FunctionDecl__BodyAssignment_9 ) ) ;
    public final void rule__FunctionDecl__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3922:1: ( ( ( rule__FunctionDecl__BodyAssignment_9 ) ) )
            // InternalMyDsl.g:3923:1: ( ( rule__FunctionDecl__BodyAssignment_9 ) )
            {
            // InternalMyDsl.g:3923:1: ( ( rule__FunctionDecl__BodyAssignment_9 ) )
            // InternalMyDsl.g:3924:2: ( rule__FunctionDecl__BodyAssignment_9 )
            {
             before(grammarAccess.getFunctionDeclAccess().getBodyAssignment_9()); 
            // InternalMyDsl.g:3925:2: ( rule__FunctionDecl__BodyAssignment_9 )
            // InternalMyDsl.g:3925:3: rule__FunctionDecl__BodyAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__FunctionDecl__BodyAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getFunctionDeclAccess().getBodyAssignment_9()); 

            }


            }

        }
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


    // $ANTLR start "rule__FuncInductive__Group__0"
    // InternalMyDsl.g:3934:1: rule__FuncInductive__Group__0 : rule__FuncInductive__Group__0__Impl rule__FuncInductive__Group__1 ;
    public final void rule__FuncInductive__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3938:1: ( rule__FuncInductive__Group__0__Impl rule__FuncInductive__Group__1 )
            // InternalMyDsl.g:3939:2: rule__FuncInductive__Group__0__Impl rule__FuncInductive__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__FuncInductive__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FuncInductive__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FuncInductive__Group__0"


    // $ANTLR start "rule__FuncInductive__Group__0__Impl"
    // InternalMyDsl.g:3946:1: rule__FuncInductive__Group__0__Impl : ( 'match' ) ;
    public final void rule__FuncInductive__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3950:1: ( ( 'match' ) )
            // InternalMyDsl.g:3951:1: ( 'match' )
            {
            // InternalMyDsl.g:3951:1: ( 'match' )
            // InternalMyDsl.g:3952:2: 'match'
            {
             before(grammarAccess.getFuncInductiveAccess().getMatchKeyword_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getFuncInductiveAccess().getMatchKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FuncInductive__Group__0__Impl"


    // $ANTLR start "rule__FuncInductive__Group__1"
    // InternalMyDsl.g:3961:1: rule__FuncInductive__Group__1 : rule__FuncInductive__Group__1__Impl rule__FuncInductive__Group__2 ;
    public final void rule__FuncInductive__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3965:1: ( rule__FuncInductive__Group__1__Impl rule__FuncInductive__Group__2 )
            // InternalMyDsl.g:3966:2: rule__FuncInductive__Group__1__Impl rule__FuncInductive__Group__2
            {
            pushFollow(FOLLOW_32);
            rule__FuncInductive__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FuncInductive__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FuncInductive__Group__1"


    // $ANTLR start "rule__FuncInductive__Group__1__Impl"
    // InternalMyDsl.g:3973:1: rule__FuncInductive__Group__1__Impl : ( ( rule__FuncInductive__VariableNameAssignment_1 ) ) ;
    public final void rule__FuncInductive__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3977:1: ( ( ( rule__FuncInductive__VariableNameAssignment_1 ) ) )
            // InternalMyDsl.g:3978:1: ( ( rule__FuncInductive__VariableNameAssignment_1 ) )
            {
            // InternalMyDsl.g:3978:1: ( ( rule__FuncInductive__VariableNameAssignment_1 ) )
            // InternalMyDsl.g:3979:2: ( rule__FuncInductive__VariableNameAssignment_1 )
            {
             before(grammarAccess.getFuncInductiveAccess().getVariableNameAssignment_1()); 
            // InternalMyDsl.g:3980:2: ( rule__FuncInductive__VariableNameAssignment_1 )
            // InternalMyDsl.g:3980:3: rule__FuncInductive__VariableNameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__FuncInductive__VariableNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFuncInductiveAccess().getVariableNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FuncInductive__Group__1__Impl"


    // $ANTLR start "rule__FuncInductive__Group__2"
    // InternalMyDsl.g:3988:1: rule__FuncInductive__Group__2 : rule__FuncInductive__Group__2__Impl rule__FuncInductive__Group__3 ;
    public final void rule__FuncInductive__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3992:1: ( rule__FuncInductive__Group__2__Impl rule__FuncInductive__Group__3 )
            // InternalMyDsl.g:3993:2: rule__FuncInductive__Group__2__Impl rule__FuncInductive__Group__3
            {
            pushFollow(FOLLOW_32);
            rule__FuncInductive__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FuncInductive__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FuncInductive__Group__2"


    // $ANTLR start "rule__FuncInductive__Group__2__Impl"
    // InternalMyDsl.g:4000:1: rule__FuncInductive__Group__2__Impl : ( ( rule__FuncInductive__InductCaseAssignment_2 ) ) ;
    public final void rule__FuncInductive__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4004:1: ( ( ( rule__FuncInductive__InductCaseAssignment_2 ) ) )
            // InternalMyDsl.g:4005:1: ( ( rule__FuncInductive__InductCaseAssignment_2 ) )
            {
            // InternalMyDsl.g:4005:1: ( ( rule__FuncInductive__InductCaseAssignment_2 ) )
            // InternalMyDsl.g:4006:2: ( rule__FuncInductive__InductCaseAssignment_2 )
            {
             before(grammarAccess.getFuncInductiveAccess().getInductCaseAssignment_2()); 
            // InternalMyDsl.g:4007:2: ( rule__FuncInductive__InductCaseAssignment_2 )
            // InternalMyDsl.g:4007:3: rule__FuncInductive__InductCaseAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__FuncInductive__InductCaseAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFuncInductiveAccess().getInductCaseAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FuncInductive__Group__2__Impl"


    // $ANTLR start "rule__FuncInductive__Group__3"
    // InternalMyDsl.g:4015:1: rule__FuncInductive__Group__3 : rule__FuncInductive__Group__3__Impl ;
    public final void rule__FuncInductive__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4019:1: ( rule__FuncInductive__Group__3__Impl )
            // InternalMyDsl.g:4020:2: rule__FuncInductive__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FuncInductive__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FuncInductive__Group__3"


    // $ANTLR start "rule__FuncInductive__Group__3__Impl"
    // InternalMyDsl.g:4026:1: rule__FuncInductive__Group__3__Impl : ( ( rule__FuncInductive__InductCaseAssignment_3 )* ) ;
    public final void rule__FuncInductive__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4030:1: ( ( ( rule__FuncInductive__InductCaseAssignment_3 )* ) )
            // InternalMyDsl.g:4031:1: ( ( rule__FuncInductive__InductCaseAssignment_3 )* )
            {
            // InternalMyDsl.g:4031:1: ( ( rule__FuncInductive__InductCaseAssignment_3 )* )
            // InternalMyDsl.g:4032:2: ( rule__FuncInductive__InductCaseAssignment_3 )*
            {
             before(grammarAccess.getFuncInductiveAccess().getInductCaseAssignment_3()); 
            // InternalMyDsl.g:4033:2: ( rule__FuncInductive__InductCaseAssignment_3 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==46) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalMyDsl.g:4033:3: rule__FuncInductive__InductCaseAssignment_3
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__FuncInductive__InductCaseAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

             after(grammarAccess.getFuncInductiveAccess().getInductCaseAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FuncInductive__Group__3__Impl"


    // $ANTLR start "rule__FuncInductiveCase__Group__0"
    // InternalMyDsl.g:4042:1: rule__FuncInductiveCase__Group__0 : rule__FuncInductiveCase__Group__0__Impl rule__FuncInductiveCase__Group__1 ;
    public final void rule__FuncInductiveCase__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4046:1: ( rule__FuncInductiveCase__Group__0__Impl rule__FuncInductiveCase__Group__1 )
            // InternalMyDsl.g:4047:2: rule__FuncInductiveCase__Group__0__Impl rule__FuncInductiveCase__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__FuncInductiveCase__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FuncInductiveCase__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FuncInductiveCase__Group__0"


    // $ANTLR start "rule__FuncInductiveCase__Group__0__Impl"
    // InternalMyDsl.g:4054:1: rule__FuncInductiveCase__Group__0__Impl : ( '|' ) ;
    public final void rule__FuncInductiveCase__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4058:1: ( ( '|' ) )
            // InternalMyDsl.g:4059:1: ( '|' )
            {
            // InternalMyDsl.g:4059:1: ( '|' )
            // InternalMyDsl.g:4060:2: '|'
            {
             before(grammarAccess.getFuncInductiveCaseAccess().getVerticalLineKeyword_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getFuncInductiveCaseAccess().getVerticalLineKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FuncInductiveCase__Group__0__Impl"


    // $ANTLR start "rule__FuncInductiveCase__Group__1"
    // InternalMyDsl.g:4069:1: rule__FuncInductiveCase__Group__1 : rule__FuncInductiveCase__Group__1__Impl rule__FuncInductiveCase__Group__2 ;
    public final void rule__FuncInductiveCase__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4073:1: ( rule__FuncInductiveCase__Group__1__Impl rule__FuncInductiveCase__Group__2 )
            // InternalMyDsl.g:4074:2: rule__FuncInductiveCase__Group__1__Impl rule__FuncInductiveCase__Group__2
            {
            pushFollow(FOLLOW_34);
            rule__FuncInductiveCase__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FuncInductiveCase__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FuncInductiveCase__Group__1"


    // $ANTLR start "rule__FuncInductiveCase__Group__1__Impl"
    // InternalMyDsl.g:4081:1: rule__FuncInductiveCase__Group__1__Impl : ( ( rule__FuncInductiveCase__DeconNameAssignment_1 ) ) ;
    public final void rule__FuncInductiveCase__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4085:1: ( ( ( rule__FuncInductiveCase__DeconNameAssignment_1 ) ) )
            // InternalMyDsl.g:4086:1: ( ( rule__FuncInductiveCase__DeconNameAssignment_1 ) )
            {
            // InternalMyDsl.g:4086:1: ( ( rule__FuncInductiveCase__DeconNameAssignment_1 ) )
            // InternalMyDsl.g:4087:2: ( rule__FuncInductiveCase__DeconNameAssignment_1 )
            {
             before(grammarAccess.getFuncInductiveCaseAccess().getDeconNameAssignment_1()); 
            // InternalMyDsl.g:4088:2: ( rule__FuncInductiveCase__DeconNameAssignment_1 )
            // InternalMyDsl.g:4088:3: rule__FuncInductiveCase__DeconNameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__FuncInductiveCase__DeconNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFuncInductiveCaseAccess().getDeconNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FuncInductiveCase__Group__1__Impl"


    // $ANTLR start "rule__FuncInductiveCase__Group__2"
    // InternalMyDsl.g:4096:1: rule__FuncInductiveCase__Group__2 : rule__FuncInductiveCase__Group__2__Impl rule__FuncInductiveCase__Group__3 ;
    public final void rule__FuncInductiveCase__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4100:1: ( rule__FuncInductiveCase__Group__2__Impl rule__FuncInductiveCase__Group__3 )
            // InternalMyDsl.g:4101:2: rule__FuncInductiveCase__Group__2__Impl rule__FuncInductiveCase__Group__3
            {
            pushFollow(FOLLOW_34);
            rule__FuncInductiveCase__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FuncInductiveCase__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FuncInductiveCase__Group__2"


    // $ANTLR start "rule__FuncInductiveCase__Group__2__Impl"
    // InternalMyDsl.g:4108:1: rule__FuncInductiveCase__Group__2__Impl : ( ( rule__FuncInductiveCase__Group_2__0 )? ) ;
    public final void rule__FuncInductiveCase__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4112:1: ( ( ( rule__FuncInductiveCase__Group_2__0 )? ) )
            // InternalMyDsl.g:4113:1: ( ( rule__FuncInductiveCase__Group_2__0 )? )
            {
            // InternalMyDsl.g:4113:1: ( ( rule__FuncInductiveCase__Group_2__0 )? )
            // InternalMyDsl.g:4114:2: ( rule__FuncInductiveCase__Group_2__0 )?
            {
             before(grammarAccess.getFuncInductiveCaseAccess().getGroup_2()); 
            // InternalMyDsl.g:4115:2: ( rule__FuncInductiveCase__Group_2__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==42) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalMyDsl.g:4115:3: rule__FuncInductiveCase__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FuncInductiveCase__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFuncInductiveCaseAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FuncInductiveCase__Group__2__Impl"


    // $ANTLR start "rule__FuncInductiveCase__Group__3"
    // InternalMyDsl.g:4123:1: rule__FuncInductiveCase__Group__3 : rule__FuncInductiveCase__Group__3__Impl rule__FuncInductiveCase__Group__4 ;
    public final void rule__FuncInductiveCase__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4127:1: ( rule__FuncInductiveCase__Group__3__Impl rule__FuncInductiveCase__Group__4 )
            // InternalMyDsl.g:4128:2: rule__FuncInductiveCase__Group__3__Impl rule__FuncInductiveCase__Group__4
            {
            pushFollow(FOLLOW_24);
            rule__FuncInductiveCase__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FuncInductiveCase__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FuncInductiveCase__Group__3"


    // $ANTLR start "rule__FuncInductiveCase__Group__3__Impl"
    // InternalMyDsl.g:4135:1: rule__FuncInductiveCase__Group__3__Impl : ( ':' ) ;
    public final void rule__FuncInductiveCase__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4139:1: ( ( ':' ) )
            // InternalMyDsl.g:4140:1: ( ':' )
            {
            // InternalMyDsl.g:4140:1: ( ':' )
            // InternalMyDsl.g:4141:2: ':'
            {
             before(grammarAccess.getFuncInductiveCaseAccess().getColonKeyword_3()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getFuncInductiveCaseAccess().getColonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FuncInductiveCase__Group__3__Impl"


    // $ANTLR start "rule__FuncInductiveCase__Group__4"
    // InternalMyDsl.g:4150:1: rule__FuncInductiveCase__Group__4 : rule__FuncInductiveCase__Group__4__Impl ;
    public final void rule__FuncInductiveCase__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4154:1: ( rule__FuncInductiveCase__Group__4__Impl )
            // InternalMyDsl.g:4155:2: rule__FuncInductiveCase__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FuncInductiveCase__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FuncInductiveCase__Group__4"


    // $ANTLR start "rule__FuncInductiveCase__Group__4__Impl"
    // InternalMyDsl.g:4161:1: rule__FuncInductiveCase__Group__4__Impl : ( ( rule__FuncInductiveCase__ExprAssignment_4 ) ) ;
    public final void rule__FuncInductiveCase__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4165:1: ( ( ( rule__FuncInductiveCase__ExprAssignment_4 ) ) )
            // InternalMyDsl.g:4166:1: ( ( rule__FuncInductiveCase__ExprAssignment_4 ) )
            {
            // InternalMyDsl.g:4166:1: ( ( rule__FuncInductiveCase__ExprAssignment_4 ) )
            // InternalMyDsl.g:4167:2: ( rule__FuncInductiveCase__ExprAssignment_4 )
            {
             before(grammarAccess.getFuncInductiveCaseAccess().getExprAssignment_4()); 
            // InternalMyDsl.g:4168:2: ( rule__FuncInductiveCase__ExprAssignment_4 )
            // InternalMyDsl.g:4168:3: rule__FuncInductiveCase__ExprAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__FuncInductiveCase__ExprAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getFuncInductiveCaseAccess().getExprAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FuncInductiveCase__Group__4__Impl"


    // $ANTLR start "rule__FuncInductiveCase__Group_2__0"
    // InternalMyDsl.g:4177:1: rule__FuncInductiveCase__Group_2__0 : rule__FuncInductiveCase__Group_2__0__Impl rule__FuncInductiveCase__Group_2__1 ;
    public final void rule__FuncInductiveCase__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4181:1: ( rule__FuncInductiveCase__Group_2__0__Impl rule__FuncInductiveCase__Group_2__1 )
            // InternalMyDsl.g:4182:2: rule__FuncInductiveCase__Group_2__0__Impl rule__FuncInductiveCase__Group_2__1
            {
            pushFollow(FOLLOW_6);
            rule__FuncInductiveCase__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FuncInductiveCase__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FuncInductiveCase__Group_2__0"


    // $ANTLR start "rule__FuncInductiveCase__Group_2__0__Impl"
    // InternalMyDsl.g:4189:1: rule__FuncInductiveCase__Group_2__0__Impl : ( '(' ) ;
    public final void rule__FuncInductiveCase__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4193:1: ( ( '(' ) )
            // InternalMyDsl.g:4194:1: ( '(' )
            {
            // InternalMyDsl.g:4194:1: ( '(' )
            // InternalMyDsl.g:4195:2: '('
            {
             before(grammarAccess.getFuncInductiveCaseAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getFuncInductiveCaseAccess().getLeftParenthesisKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FuncInductiveCase__Group_2__0__Impl"


    // $ANTLR start "rule__FuncInductiveCase__Group_2__1"
    // InternalMyDsl.g:4204:1: rule__FuncInductiveCase__Group_2__1 : rule__FuncInductiveCase__Group_2__1__Impl rule__FuncInductiveCase__Group_2__2 ;
    public final void rule__FuncInductiveCase__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4208:1: ( rule__FuncInductiveCase__Group_2__1__Impl rule__FuncInductiveCase__Group_2__2 )
            // InternalMyDsl.g:4209:2: rule__FuncInductiveCase__Group_2__1__Impl rule__FuncInductiveCase__Group_2__2
            {
            pushFollow(FOLLOW_35);
            rule__FuncInductiveCase__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FuncInductiveCase__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FuncInductiveCase__Group_2__1"


    // $ANTLR start "rule__FuncInductiveCase__Group_2__1__Impl"
    // InternalMyDsl.g:4216:1: rule__FuncInductiveCase__Group_2__1__Impl : ( ( rule__FuncInductiveCase__VariablesAssignment_2_1 ) ) ;
    public final void rule__FuncInductiveCase__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4220:1: ( ( ( rule__FuncInductiveCase__VariablesAssignment_2_1 ) ) )
            // InternalMyDsl.g:4221:1: ( ( rule__FuncInductiveCase__VariablesAssignment_2_1 ) )
            {
            // InternalMyDsl.g:4221:1: ( ( rule__FuncInductiveCase__VariablesAssignment_2_1 ) )
            // InternalMyDsl.g:4222:2: ( rule__FuncInductiveCase__VariablesAssignment_2_1 )
            {
             before(grammarAccess.getFuncInductiveCaseAccess().getVariablesAssignment_2_1()); 
            // InternalMyDsl.g:4223:2: ( rule__FuncInductiveCase__VariablesAssignment_2_1 )
            // InternalMyDsl.g:4223:3: rule__FuncInductiveCase__VariablesAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__FuncInductiveCase__VariablesAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getFuncInductiveCaseAccess().getVariablesAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FuncInductiveCase__Group_2__1__Impl"


    // $ANTLR start "rule__FuncInductiveCase__Group_2__2"
    // InternalMyDsl.g:4231:1: rule__FuncInductiveCase__Group_2__2 : rule__FuncInductiveCase__Group_2__2__Impl rule__FuncInductiveCase__Group_2__3 ;
    public final void rule__FuncInductiveCase__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4235:1: ( rule__FuncInductiveCase__Group_2__2__Impl rule__FuncInductiveCase__Group_2__3 )
            // InternalMyDsl.g:4236:2: rule__FuncInductiveCase__Group_2__2__Impl rule__FuncInductiveCase__Group_2__3
            {
            pushFollow(FOLLOW_35);
            rule__FuncInductiveCase__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FuncInductiveCase__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FuncInductiveCase__Group_2__2"


    // $ANTLR start "rule__FuncInductiveCase__Group_2__2__Impl"
    // InternalMyDsl.g:4243:1: rule__FuncInductiveCase__Group_2__2__Impl : ( ( rule__FuncInductiveCase__Group_2_2__0 )* ) ;
    public final void rule__FuncInductiveCase__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4247:1: ( ( ( rule__FuncInductiveCase__Group_2_2__0 )* ) )
            // InternalMyDsl.g:4248:1: ( ( rule__FuncInductiveCase__Group_2_2__0 )* )
            {
            // InternalMyDsl.g:4248:1: ( ( rule__FuncInductiveCase__Group_2_2__0 )* )
            // InternalMyDsl.g:4249:2: ( rule__FuncInductiveCase__Group_2_2__0 )*
            {
             before(grammarAccess.getFuncInductiveCaseAccess().getGroup_2_2()); 
            // InternalMyDsl.g:4250:2: ( rule__FuncInductiveCase__Group_2_2__0 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==41) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalMyDsl.g:4250:3: rule__FuncInductiveCase__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__FuncInductiveCase__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

             after(grammarAccess.getFuncInductiveCaseAccess().getGroup_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FuncInductiveCase__Group_2__2__Impl"


    // $ANTLR start "rule__FuncInductiveCase__Group_2__3"
    // InternalMyDsl.g:4258:1: rule__FuncInductiveCase__Group_2__3 : rule__FuncInductiveCase__Group_2__3__Impl ;
    public final void rule__FuncInductiveCase__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4262:1: ( rule__FuncInductiveCase__Group_2__3__Impl )
            // InternalMyDsl.g:4263:2: rule__FuncInductiveCase__Group_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FuncInductiveCase__Group_2__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FuncInductiveCase__Group_2__3"


    // $ANTLR start "rule__FuncInductiveCase__Group_2__3__Impl"
    // InternalMyDsl.g:4269:1: rule__FuncInductiveCase__Group_2__3__Impl : ( ')' ) ;
    public final void rule__FuncInductiveCase__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4273:1: ( ( ')' ) )
            // InternalMyDsl.g:4274:1: ( ')' )
            {
            // InternalMyDsl.g:4274:1: ( ')' )
            // InternalMyDsl.g:4275:2: ')'
            {
             before(grammarAccess.getFuncInductiveCaseAccess().getRightParenthesisKeyword_2_3()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getFuncInductiveCaseAccess().getRightParenthesisKeyword_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FuncInductiveCase__Group_2__3__Impl"


    // $ANTLR start "rule__FuncInductiveCase__Group_2_2__0"
    // InternalMyDsl.g:4285:1: rule__FuncInductiveCase__Group_2_2__0 : rule__FuncInductiveCase__Group_2_2__0__Impl rule__FuncInductiveCase__Group_2_2__1 ;
    public final void rule__FuncInductiveCase__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4289:1: ( rule__FuncInductiveCase__Group_2_2__0__Impl rule__FuncInductiveCase__Group_2_2__1 )
            // InternalMyDsl.g:4290:2: rule__FuncInductiveCase__Group_2_2__0__Impl rule__FuncInductiveCase__Group_2_2__1
            {
            pushFollow(FOLLOW_6);
            rule__FuncInductiveCase__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FuncInductiveCase__Group_2_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FuncInductiveCase__Group_2_2__0"


    // $ANTLR start "rule__FuncInductiveCase__Group_2_2__0__Impl"
    // InternalMyDsl.g:4297:1: rule__FuncInductiveCase__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__FuncInductiveCase__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4301:1: ( ( ',' ) )
            // InternalMyDsl.g:4302:1: ( ',' )
            {
            // InternalMyDsl.g:4302:1: ( ',' )
            // InternalMyDsl.g:4303:2: ','
            {
             before(grammarAccess.getFuncInductiveCaseAccess().getCommaKeyword_2_2_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getFuncInductiveCaseAccess().getCommaKeyword_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FuncInductiveCase__Group_2_2__0__Impl"


    // $ANTLR start "rule__FuncInductiveCase__Group_2_2__1"
    // InternalMyDsl.g:4312:1: rule__FuncInductiveCase__Group_2_2__1 : rule__FuncInductiveCase__Group_2_2__1__Impl ;
    public final void rule__FuncInductiveCase__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4316:1: ( rule__FuncInductiveCase__Group_2_2__1__Impl )
            // InternalMyDsl.g:4317:2: rule__FuncInductiveCase__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FuncInductiveCase__Group_2_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FuncInductiveCase__Group_2_2__1"


    // $ANTLR start "rule__FuncInductiveCase__Group_2_2__1__Impl"
    // InternalMyDsl.g:4323:1: rule__FuncInductiveCase__Group_2_2__1__Impl : ( ( rule__FuncInductiveCase__VariablesAssignment_2_2_1 ) ) ;
    public final void rule__FuncInductiveCase__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4327:1: ( ( ( rule__FuncInductiveCase__VariablesAssignment_2_2_1 ) ) )
            // InternalMyDsl.g:4328:1: ( ( rule__FuncInductiveCase__VariablesAssignment_2_2_1 ) )
            {
            // InternalMyDsl.g:4328:1: ( ( rule__FuncInductiveCase__VariablesAssignment_2_2_1 ) )
            // InternalMyDsl.g:4329:2: ( rule__FuncInductiveCase__VariablesAssignment_2_2_1 )
            {
             before(grammarAccess.getFuncInductiveCaseAccess().getVariablesAssignment_2_2_1()); 
            // InternalMyDsl.g:4330:2: ( rule__FuncInductiveCase__VariablesAssignment_2_2_1 )
            // InternalMyDsl.g:4330:3: rule__FuncInductiveCase__VariablesAssignment_2_2_1
            {
            pushFollow(FOLLOW_2);
            rule__FuncInductiveCase__VariablesAssignment_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getFuncInductiveCaseAccess().getVariablesAssignment_2_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FuncInductiveCase__Group_2_2__1__Impl"


    // $ANTLR start "rule__TheoremBody__Group__0"
    // InternalMyDsl.g:4339:1: rule__TheoremBody__Group__0 : rule__TheoremBody__Group__0__Impl rule__TheoremBody__Group__1 ;
    public final void rule__TheoremBody__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4343:1: ( rule__TheoremBody__Group__0__Impl rule__TheoremBody__Group__1 )
            // InternalMyDsl.g:4344:2: rule__TheoremBody__Group__0__Impl rule__TheoremBody__Group__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalMyDsl.g:4351:1: rule__TheoremBody__Group__0__Impl : ( 'Theorems' ) ;
    public final void rule__TheoremBody__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4355:1: ( ( 'Theorems' ) )
            // InternalMyDsl.g:4356:1: ( 'Theorems' )
            {
            // InternalMyDsl.g:4356:1: ( 'Theorems' )
            // InternalMyDsl.g:4357:2: 'Theorems'
            {
             before(grammarAccess.getTheoremBodyAccess().getTheoremsKeyword_0()); 
            match(input,49,FOLLOW_2); 
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
    // InternalMyDsl.g:4366:1: rule__TheoremBody__Group__1 : rule__TheoremBody__Group__1__Impl rule__TheoremBody__Group__2 ;
    public final void rule__TheoremBody__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4370:1: ( rule__TheoremBody__Group__1__Impl rule__TheoremBody__Group__2 )
            // InternalMyDsl.g:4371:2: rule__TheoremBody__Group__1__Impl rule__TheoremBody__Group__2
            {
            pushFollow(FOLLOW_36);
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
    // InternalMyDsl.g:4378:1: rule__TheoremBody__Group__1__Impl : ( '{' ) ;
    public final void rule__TheoremBody__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4382:1: ( ( '{' ) )
            // InternalMyDsl.g:4383:1: ( '{' )
            {
            // InternalMyDsl.g:4383:1: ( '{' )
            // InternalMyDsl.g:4384:2: '{'
            {
             before(grammarAccess.getTheoremBodyAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,37,FOLLOW_2); 
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
    // InternalMyDsl.g:4393:1: rule__TheoremBody__Group__2 : rule__TheoremBody__Group__2__Impl rule__TheoremBody__Group__3 ;
    public final void rule__TheoremBody__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4397:1: ( rule__TheoremBody__Group__2__Impl rule__TheoremBody__Group__3 )
            // InternalMyDsl.g:4398:2: rule__TheoremBody__Group__2__Impl rule__TheoremBody__Group__3
            {
            pushFollow(FOLLOW_37);
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
    // InternalMyDsl.g:4405:1: rule__TheoremBody__Group__2__Impl : ( ( ( rule__TheoremBody__TheoremDeclAssignment_2 ) ) ( ( rule__TheoremBody__TheoremDeclAssignment_2 )* ) ) ;
    public final void rule__TheoremBody__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4409:1: ( ( ( ( rule__TheoremBody__TheoremDeclAssignment_2 ) ) ( ( rule__TheoremBody__TheoremDeclAssignment_2 )* ) ) )
            // InternalMyDsl.g:4410:1: ( ( ( rule__TheoremBody__TheoremDeclAssignment_2 ) ) ( ( rule__TheoremBody__TheoremDeclAssignment_2 )* ) )
            {
            // InternalMyDsl.g:4410:1: ( ( ( rule__TheoremBody__TheoremDeclAssignment_2 ) ) ( ( rule__TheoremBody__TheoremDeclAssignment_2 )* ) )
            // InternalMyDsl.g:4411:2: ( ( rule__TheoremBody__TheoremDeclAssignment_2 ) ) ( ( rule__TheoremBody__TheoremDeclAssignment_2 )* )
            {
            // InternalMyDsl.g:4411:2: ( ( rule__TheoremBody__TheoremDeclAssignment_2 ) )
            // InternalMyDsl.g:4412:3: ( rule__TheoremBody__TheoremDeclAssignment_2 )
            {
             before(grammarAccess.getTheoremBodyAccess().getTheoremDeclAssignment_2()); 
            // InternalMyDsl.g:4413:3: ( rule__TheoremBody__TheoremDeclAssignment_2 )
            // InternalMyDsl.g:4413:4: rule__TheoremBody__TheoremDeclAssignment_2
            {
            pushFollow(FOLLOW_38);
            rule__TheoremBody__TheoremDeclAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTheoremBodyAccess().getTheoremDeclAssignment_2()); 

            }

            // InternalMyDsl.g:4416:2: ( ( rule__TheoremBody__TheoremDeclAssignment_2 )* )
            // InternalMyDsl.g:4417:3: ( rule__TheoremBody__TheoremDeclAssignment_2 )*
            {
             before(grammarAccess.getTheoremBodyAccess().getTheoremDeclAssignment_2()); 
            // InternalMyDsl.g:4418:3: ( rule__TheoremBody__TheoremDeclAssignment_2 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( ((LA41_0>=31 && LA41_0<=32)) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalMyDsl.g:4418:4: rule__TheoremBody__TheoremDeclAssignment_2
            	    {
            	    pushFollow(FOLLOW_38);
            	    rule__TheoremBody__TheoremDeclAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop41;
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
    // InternalMyDsl.g:4427:1: rule__TheoremBody__Group__3 : rule__TheoremBody__Group__3__Impl ;
    public final void rule__TheoremBody__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4431:1: ( rule__TheoremBody__Group__3__Impl )
            // InternalMyDsl.g:4432:2: rule__TheoremBody__Group__3__Impl
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
    // InternalMyDsl.g:4438:1: rule__TheoremBody__Group__3__Impl : ( '}' ) ;
    public final void rule__TheoremBody__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4442:1: ( ( '}' ) )
            // InternalMyDsl.g:4443:1: ( '}' )
            {
            // InternalMyDsl.g:4443:1: ( '}' )
            // InternalMyDsl.g:4444:2: '}'
            {
             before(grammarAccess.getTheoremBodyAccess().getRightCurlyBracketKeyword_3()); 
            match(input,38,FOLLOW_2); 
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
    // InternalMyDsl.g:4454:1: rule__TheoremDecl__Group__0 : rule__TheoremDecl__Group__0__Impl rule__TheoremDecl__Group__1 ;
    public final void rule__TheoremDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4458:1: ( rule__TheoremDecl__Group__0__Impl rule__TheoremDecl__Group__1 )
            // InternalMyDsl.g:4459:2: rule__TheoremDecl__Group__0__Impl rule__TheoremDecl__Group__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalMyDsl.g:4466:1: rule__TheoremDecl__Group__0__Impl : ( ( rule__TheoremDecl__ThmNameAssignment_0 ) ) ;
    public final void rule__TheoremDecl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4470:1: ( ( ( rule__TheoremDecl__ThmNameAssignment_0 ) ) )
            // InternalMyDsl.g:4471:1: ( ( rule__TheoremDecl__ThmNameAssignment_0 ) )
            {
            // InternalMyDsl.g:4471:1: ( ( rule__TheoremDecl__ThmNameAssignment_0 ) )
            // InternalMyDsl.g:4472:2: ( rule__TheoremDecl__ThmNameAssignment_0 )
            {
             before(grammarAccess.getTheoremDeclAccess().getThmNameAssignment_0()); 
            // InternalMyDsl.g:4473:2: ( rule__TheoremDecl__ThmNameAssignment_0 )
            // InternalMyDsl.g:4473:3: rule__TheoremDecl__ThmNameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__TheoremDecl__ThmNameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTheoremDeclAccess().getThmNameAssignment_0()); 

            }


            }

        }
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
    // InternalMyDsl.g:4481:1: rule__TheoremDecl__Group__1 : rule__TheoremDecl__Group__1__Impl rule__TheoremDecl__Group__2 ;
    public final void rule__TheoremDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4485:1: ( rule__TheoremDecl__Group__1__Impl rule__TheoremDecl__Group__2 )
            // InternalMyDsl.g:4486:2: rule__TheoremDecl__Group__1__Impl rule__TheoremDecl__Group__2
            {
            pushFollow(FOLLOW_22);
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
    // InternalMyDsl.g:4493:1: rule__TheoremDecl__Group__1__Impl : ( ( rule__TheoremDecl__ExprAssignment_1 ) ) ;
    public final void rule__TheoremDecl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4497:1: ( ( ( rule__TheoremDecl__ExprAssignment_1 ) ) )
            // InternalMyDsl.g:4498:1: ( ( rule__TheoremDecl__ExprAssignment_1 ) )
            {
            // InternalMyDsl.g:4498:1: ( ( rule__TheoremDecl__ExprAssignment_1 ) )
            // InternalMyDsl.g:4499:2: ( rule__TheoremDecl__ExprAssignment_1 )
            {
             before(grammarAccess.getTheoremDeclAccess().getExprAssignment_1()); 
            // InternalMyDsl.g:4500:2: ( rule__TheoremDecl__ExprAssignment_1 )
            // InternalMyDsl.g:4500:3: rule__TheoremDecl__ExprAssignment_1
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
    // InternalMyDsl.g:4508:1: rule__TheoremDecl__Group__2 : rule__TheoremDecl__Group__2__Impl ;
    public final void rule__TheoremDecl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4512:1: ( rule__TheoremDecl__Group__2__Impl )
            // InternalMyDsl.g:4513:2: rule__TheoremDecl__Group__2__Impl
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
    // InternalMyDsl.g:4519:1: rule__TheoremDecl__Group__2__Impl : ( ';' ) ;
    public final void rule__TheoremDecl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4523:1: ( ( ';' ) )
            // InternalMyDsl.g:4524:1: ( ';' )
            {
            // InternalMyDsl.g:4524:1: ( ';' )
            // InternalMyDsl.g:4525:2: ';'
            {
             before(grammarAccess.getTheoremDeclAccess().getSemicolonKeyword_2()); 
            match(input,36,FOLLOW_2); 
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
    // InternalMyDsl.g:4535:1: rule__TypedVariableList__Group__0 : rule__TypedVariableList__Group__0__Impl rule__TypedVariableList__Group__1 ;
    public final void rule__TypedVariableList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4539:1: ( rule__TypedVariableList__Group__0__Impl rule__TypedVariableList__Group__1 )
            // InternalMyDsl.g:4540:2: rule__TypedVariableList__Group__0__Impl rule__TypedVariableList__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalMyDsl.g:4547:1: rule__TypedVariableList__Group__0__Impl : ( ( rule__TypedVariableList__VariablesOfTypeAssignment_0 ) ) ;
    public final void rule__TypedVariableList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4551:1: ( ( ( rule__TypedVariableList__VariablesOfTypeAssignment_0 ) ) )
            // InternalMyDsl.g:4552:1: ( ( rule__TypedVariableList__VariablesOfTypeAssignment_0 ) )
            {
            // InternalMyDsl.g:4552:1: ( ( rule__TypedVariableList__VariablesOfTypeAssignment_0 ) )
            // InternalMyDsl.g:4553:2: ( rule__TypedVariableList__VariablesOfTypeAssignment_0 )
            {
             before(grammarAccess.getTypedVariableListAccess().getVariablesOfTypeAssignment_0()); 
            // InternalMyDsl.g:4554:2: ( rule__TypedVariableList__VariablesOfTypeAssignment_0 )
            // InternalMyDsl.g:4554:3: rule__TypedVariableList__VariablesOfTypeAssignment_0
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
    // InternalMyDsl.g:4562:1: rule__TypedVariableList__Group__1 : rule__TypedVariableList__Group__1__Impl ;
    public final void rule__TypedVariableList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4566:1: ( rule__TypedVariableList__Group__1__Impl )
            // InternalMyDsl.g:4567:2: rule__TypedVariableList__Group__1__Impl
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
    // InternalMyDsl.g:4573:1: rule__TypedVariableList__Group__1__Impl : ( ( rule__TypedVariableList__Group_1__0 )* ) ;
    public final void rule__TypedVariableList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4577:1: ( ( ( rule__TypedVariableList__Group_1__0 )* ) )
            // InternalMyDsl.g:4578:1: ( ( rule__TypedVariableList__Group_1__0 )* )
            {
            // InternalMyDsl.g:4578:1: ( ( rule__TypedVariableList__Group_1__0 )* )
            // InternalMyDsl.g:4579:2: ( rule__TypedVariableList__Group_1__0 )*
            {
             before(grammarAccess.getTypedVariableListAccess().getGroup_1()); 
            // InternalMyDsl.g:4580:2: ( rule__TypedVariableList__Group_1__0 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==41) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalMyDsl.g:4580:3: rule__TypedVariableList__Group_1__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__TypedVariableList__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop42;
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
    // InternalMyDsl.g:4589:1: rule__TypedVariableList__Group_1__0 : rule__TypedVariableList__Group_1__0__Impl rule__TypedVariableList__Group_1__1 ;
    public final void rule__TypedVariableList__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4593:1: ( rule__TypedVariableList__Group_1__0__Impl rule__TypedVariableList__Group_1__1 )
            // InternalMyDsl.g:4594:2: rule__TypedVariableList__Group_1__0__Impl rule__TypedVariableList__Group_1__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalMyDsl.g:4601:1: rule__TypedVariableList__Group_1__0__Impl : ( ',' ) ;
    public final void rule__TypedVariableList__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4605:1: ( ( ',' ) )
            // InternalMyDsl.g:4606:1: ( ',' )
            {
            // InternalMyDsl.g:4606:1: ( ',' )
            // InternalMyDsl.g:4607:2: ','
            {
             before(grammarAccess.getTypedVariableListAccess().getCommaKeyword_1_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalMyDsl.g:4616:1: rule__TypedVariableList__Group_1__1 : rule__TypedVariableList__Group_1__1__Impl ;
    public final void rule__TypedVariableList__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4620:1: ( rule__TypedVariableList__Group_1__1__Impl )
            // InternalMyDsl.g:4621:2: rule__TypedVariableList__Group_1__1__Impl
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
    // InternalMyDsl.g:4627:1: rule__TypedVariableList__Group_1__1__Impl : ( ( rule__TypedVariableList__VariablesOfTypeAssignment_1_1 ) ) ;
    public final void rule__TypedVariableList__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4631:1: ( ( ( rule__TypedVariableList__VariablesOfTypeAssignment_1_1 ) ) )
            // InternalMyDsl.g:4632:1: ( ( rule__TypedVariableList__VariablesOfTypeAssignment_1_1 ) )
            {
            // InternalMyDsl.g:4632:1: ( ( rule__TypedVariableList__VariablesOfTypeAssignment_1_1 ) )
            // InternalMyDsl.g:4633:2: ( rule__TypedVariableList__VariablesOfTypeAssignment_1_1 )
            {
             before(grammarAccess.getTypedVariableListAccess().getVariablesOfTypeAssignment_1_1()); 
            // InternalMyDsl.g:4634:2: ( rule__TypedVariableList__VariablesOfTypeAssignment_1_1 )
            // InternalMyDsl.g:4634:3: rule__TypedVariableList__VariablesOfTypeAssignment_1_1
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
    // InternalMyDsl.g:4643:1: rule__VariableTyping__Group__0 : rule__VariableTyping__Group__0__Impl rule__VariableTyping__Group__1 ;
    public final void rule__VariableTyping__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4647:1: ( rule__VariableTyping__Group__0__Impl rule__VariableTyping__Group__1 )
            // InternalMyDsl.g:4648:2: rule__VariableTyping__Group__0__Impl rule__VariableTyping__Group__1
            {
            pushFollow(FOLLOW_39);
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
    // InternalMyDsl.g:4655:1: rule__VariableTyping__Group__0__Impl : ( ( rule__VariableTyping__TypeVarAssignment_0 ) ) ;
    public final void rule__VariableTyping__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4659:1: ( ( ( rule__VariableTyping__TypeVarAssignment_0 ) ) )
            // InternalMyDsl.g:4660:1: ( ( rule__VariableTyping__TypeVarAssignment_0 ) )
            {
            // InternalMyDsl.g:4660:1: ( ( rule__VariableTyping__TypeVarAssignment_0 ) )
            // InternalMyDsl.g:4661:2: ( rule__VariableTyping__TypeVarAssignment_0 )
            {
             before(grammarAccess.getVariableTypingAccess().getTypeVarAssignment_0()); 
            // InternalMyDsl.g:4662:2: ( rule__VariableTyping__TypeVarAssignment_0 )
            // InternalMyDsl.g:4662:3: rule__VariableTyping__TypeVarAssignment_0
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
    // InternalMyDsl.g:4670:1: rule__VariableTyping__Group__1 : rule__VariableTyping__Group__1__Impl rule__VariableTyping__Group__2 ;
    public final void rule__VariableTyping__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4674:1: ( rule__VariableTyping__Group__1__Impl rule__VariableTyping__Group__2 )
            // InternalMyDsl.g:4675:2: rule__VariableTyping__Group__1__Impl rule__VariableTyping__Group__2
            {
            pushFollow(FOLLOW_39);
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
    // InternalMyDsl.g:4682:1: rule__VariableTyping__Group__1__Impl : ( ( rule__VariableTyping__Group_1__0 )* ) ;
    public final void rule__VariableTyping__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4686:1: ( ( ( rule__VariableTyping__Group_1__0 )* ) )
            // InternalMyDsl.g:4687:1: ( ( rule__VariableTyping__Group_1__0 )* )
            {
            // InternalMyDsl.g:4687:1: ( ( rule__VariableTyping__Group_1__0 )* )
            // InternalMyDsl.g:4688:2: ( rule__VariableTyping__Group_1__0 )*
            {
             before(grammarAccess.getVariableTypingAccess().getGroup_1()); 
            // InternalMyDsl.g:4689:2: ( rule__VariableTyping__Group_1__0 )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==41) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalMyDsl.g:4689:3: rule__VariableTyping__Group_1__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__VariableTyping__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop43;
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
    // InternalMyDsl.g:4697:1: rule__VariableTyping__Group__2 : rule__VariableTyping__Group__2__Impl rule__VariableTyping__Group__3 ;
    public final void rule__VariableTyping__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4701:1: ( rule__VariableTyping__Group__2__Impl rule__VariableTyping__Group__3 )
            // InternalMyDsl.g:4702:2: rule__VariableTyping__Group__2__Impl rule__VariableTyping__Group__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalMyDsl.g:4709:1: rule__VariableTyping__Group__2__Impl : ( ':' ) ;
    public final void rule__VariableTyping__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4713:1: ( ( ':' ) )
            // InternalMyDsl.g:4714:1: ( ':' )
            {
            // InternalMyDsl.g:4714:1: ( ':' )
            // InternalMyDsl.g:4715:2: ':'
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
    // InternalMyDsl.g:4724:1: rule__VariableTyping__Group__3 : rule__VariableTyping__Group__3__Impl ;
    public final void rule__VariableTyping__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4728:1: ( rule__VariableTyping__Group__3__Impl )
            // InternalMyDsl.g:4729:2: rule__VariableTyping__Group__3__Impl
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
    // InternalMyDsl.g:4735:1: rule__VariableTyping__Group__3__Impl : ( ( rule__VariableTyping__TypeAssignment_3 ) ) ;
    public final void rule__VariableTyping__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4739:1: ( ( ( rule__VariableTyping__TypeAssignment_3 ) ) )
            // InternalMyDsl.g:4740:1: ( ( rule__VariableTyping__TypeAssignment_3 ) )
            {
            // InternalMyDsl.g:4740:1: ( ( rule__VariableTyping__TypeAssignment_3 ) )
            // InternalMyDsl.g:4741:2: ( rule__VariableTyping__TypeAssignment_3 )
            {
             before(grammarAccess.getVariableTypingAccess().getTypeAssignment_3()); 
            // InternalMyDsl.g:4742:2: ( rule__VariableTyping__TypeAssignment_3 )
            // InternalMyDsl.g:4742:3: rule__VariableTyping__TypeAssignment_3
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
    // InternalMyDsl.g:4751:1: rule__VariableTyping__Group_1__0 : rule__VariableTyping__Group_1__0__Impl rule__VariableTyping__Group_1__1 ;
    public final void rule__VariableTyping__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4755:1: ( rule__VariableTyping__Group_1__0__Impl rule__VariableTyping__Group_1__1 )
            // InternalMyDsl.g:4756:2: rule__VariableTyping__Group_1__0__Impl rule__VariableTyping__Group_1__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalMyDsl.g:4763:1: rule__VariableTyping__Group_1__0__Impl : ( ',' ) ;
    public final void rule__VariableTyping__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4767:1: ( ( ',' ) )
            // InternalMyDsl.g:4768:1: ( ',' )
            {
            // InternalMyDsl.g:4768:1: ( ',' )
            // InternalMyDsl.g:4769:2: ','
            {
             before(grammarAccess.getVariableTypingAccess().getCommaKeyword_1_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalMyDsl.g:4778:1: rule__VariableTyping__Group_1__1 : rule__VariableTyping__Group_1__1__Impl ;
    public final void rule__VariableTyping__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4782:1: ( rule__VariableTyping__Group_1__1__Impl )
            // InternalMyDsl.g:4783:2: rule__VariableTyping__Group_1__1__Impl
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
    // InternalMyDsl.g:4789:1: rule__VariableTyping__Group_1__1__Impl : ( ( rule__VariableTyping__TypeVarAssignment_1_1 ) ) ;
    public final void rule__VariableTyping__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4793:1: ( ( ( rule__VariableTyping__TypeVarAssignment_1_1 ) ) )
            // InternalMyDsl.g:4794:1: ( ( rule__VariableTyping__TypeVarAssignment_1_1 ) )
            {
            // InternalMyDsl.g:4794:1: ( ( rule__VariableTyping__TypeVarAssignment_1_1 ) )
            // InternalMyDsl.g:4795:2: ( rule__VariableTyping__TypeVarAssignment_1_1 )
            {
             before(grammarAccess.getVariableTypingAccess().getTypeVarAssignment_1_1()); 
            // InternalMyDsl.g:4796:2: ( rule__VariableTyping__TypeVarAssignment_1_1 )
            // InternalMyDsl.g:4796:3: rule__VariableTyping__TypeVarAssignment_1_1
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
    // InternalMyDsl.g:4805:1: rule__Lambda__Group__0 : rule__Lambda__Group__0__Impl rule__Lambda__Group__1 ;
    public final void rule__Lambda__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4809:1: ( rule__Lambda__Group__0__Impl rule__Lambda__Group__1 )
            // InternalMyDsl.g:4810:2: rule__Lambda__Group__0__Impl rule__Lambda__Group__1
            {
            pushFollow(FOLLOW_40);
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
    // InternalMyDsl.g:4817:1: rule__Lambda__Group__0__Impl : ( ( rule__Lambda__QTypeAssignment_0 ) ) ;
    public final void rule__Lambda__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4821:1: ( ( ( rule__Lambda__QTypeAssignment_0 ) ) )
            // InternalMyDsl.g:4822:1: ( ( rule__Lambda__QTypeAssignment_0 ) )
            {
            // InternalMyDsl.g:4822:1: ( ( rule__Lambda__QTypeAssignment_0 ) )
            // InternalMyDsl.g:4823:2: ( rule__Lambda__QTypeAssignment_0 )
            {
             before(grammarAccess.getLambdaAccess().getQTypeAssignment_0()); 
            // InternalMyDsl.g:4824:2: ( rule__Lambda__QTypeAssignment_0 )
            // InternalMyDsl.g:4824:3: rule__Lambda__QTypeAssignment_0
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
    // InternalMyDsl.g:4832:1: rule__Lambda__Group__1 : rule__Lambda__Group__1__Impl rule__Lambda__Group__2 ;
    public final void rule__Lambda__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4836:1: ( rule__Lambda__Group__1__Impl rule__Lambda__Group__2 )
            // InternalMyDsl.g:4837:2: rule__Lambda__Group__1__Impl rule__Lambda__Group__2
            {
            pushFollow(FOLLOW_40);
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
    // InternalMyDsl.g:4844:1: rule__Lambda__Group__1__Impl : ( ( rule__Lambda__ContextAssignment_1 )? ) ;
    public final void rule__Lambda__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4848:1: ( ( ( rule__Lambda__ContextAssignment_1 )? ) )
            // InternalMyDsl.g:4849:1: ( ( rule__Lambda__ContextAssignment_1 )? )
            {
            // InternalMyDsl.g:4849:1: ( ( rule__Lambda__ContextAssignment_1 )? )
            // InternalMyDsl.g:4850:2: ( rule__Lambda__ContextAssignment_1 )?
            {
             before(grammarAccess.getLambdaAccess().getContextAssignment_1()); 
            // InternalMyDsl.g:4851:2: ( rule__Lambda__ContextAssignment_1 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==39) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalMyDsl.g:4851:3: rule__Lambda__ContextAssignment_1
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
    // InternalMyDsl.g:4859:1: rule__Lambda__Group__2 : rule__Lambda__Group__2__Impl rule__Lambda__Group__3 ;
    public final void rule__Lambda__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4863:1: ( rule__Lambda__Group__2__Impl rule__Lambda__Group__3 )
            // InternalMyDsl.g:4864:2: rule__Lambda__Group__2__Impl rule__Lambda__Group__3
            {
            pushFollow(FOLLOW_32);
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
    // InternalMyDsl.g:4871:1: rule__Lambda__Group__2__Impl : ( ( rule__Lambda__VarListAssignment_2 ) ) ;
    public final void rule__Lambda__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4875:1: ( ( ( rule__Lambda__VarListAssignment_2 ) ) )
            // InternalMyDsl.g:4876:1: ( ( rule__Lambda__VarListAssignment_2 ) )
            {
            // InternalMyDsl.g:4876:1: ( ( rule__Lambda__VarListAssignment_2 ) )
            // InternalMyDsl.g:4877:2: ( rule__Lambda__VarListAssignment_2 )
            {
             before(grammarAccess.getLambdaAccess().getVarListAssignment_2()); 
            // InternalMyDsl.g:4878:2: ( rule__Lambda__VarListAssignment_2 )
            // InternalMyDsl.g:4878:3: rule__Lambda__VarListAssignment_2
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
    // InternalMyDsl.g:4886:1: rule__Lambda__Group__3 : rule__Lambda__Group__3__Impl rule__Lambda__Group__4 ;
    public final void rule__Lambda__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4890:1: ( rule__Lambda__Group__3__Impl rule__Lambda__Group__4 )
            // InternalMyDsl.g:4891:2: rule__Lambda__Group__3__Impl rule__Lambda__Group__4
            {
            pushFollow(FOLLOW_24);
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
    // InternalMyDsl.g:4898:1: rule__Lambda__Group__3__Impl : ( '|' ) ;
    public final void rule__Lambda__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4902:1: ( ( '|' ) )
            // InternalMyDsl.g:4903:1: ( '|' )
            {
            // InternalMyDsl.g:4903:1: ( '|' )
            // InternalMyDsl.g:4904:2: '|'
            {
             before(grammarAccess.getLambdaAccess().getVerticalLineKeyword_3()); 
            match(input,46,FOLLOW_2); 
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
    // InternalMyDsl.g:4913:1: rule__Lambda__Group__4 : rule__Lambda__Group__4__Impl ;
    public final void rule__Lambda__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4917:1: ( rule__Lambda__Group__4__Impl )
            // InternalMyDsl.g:4918:2: rule__Lambda__Group__4__Impl
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
    // InternalMyDsl.g:4924:1: rule__Lambda__Group__4__Impl : ( ( rule__Lambda__ChildAssignment_4 ) ) ;
    public final void rule__Lambda__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4928:1: ( ( ( rule__Lambda__ChildAssignment_4 ) ) )
            // InternalMyDsl.g:4929:1: ( ( rule__Lambda__ChildAssignment_4 ) )
            {
            // InternalMyDsl.g:4929:1: ( ( rule__Lambda__ChildAssignment_4 ) )
            // InternalMyDsl.g:4930:2: ( rule__Lambda__ChildAssignment_4 )
            {
             before(grammarAccess.getLambdaAccess().getChildAssignment_4()); 
            // InternalMyDsl.g:4931:2: ( rule__Lambda__ChildAssignment_4 )
            // InternalMyDsl.g:4931:3: rule__Lambda__ChildAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Lambda__ChildAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getLambdaAccess().getChildAssignment_4()); 

            }


            }

        }
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
    // InternalMyDsl.g:4940:1: rule__Quantifier__Group__0 : rule__Quantifier__Group__0__Impl rule__Quantifier__Group__1 ;
    public final void rule__Quantifier__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4944:1: ( rule__Quantifier__Group__0__Impl rule__Quantifier__Group__1 )
            // InternalMyDsl.g:4945:2: rule__Quantifier__Group__0__Impl rule__Quantifier__Group__1
            {
            pushFollow(FOLLOW_40);
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
    // InternalMyDsl.g:4952:1: rule__Quantifier__Group__0__Impl : ( ( rule__Quantifier__QTypeAssignment_0 ) ) ;
    public final void rule__Quantifier__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4956:1: ( ( ( rule__Quantifier__QTypeAssignment_0 ) ) )
            // InternalMyDsl.g:4957:1: ( ( rule__Quantifier__QTypeAssignment_0 ) )
            {
            // InternalMyDsl.g:4957:1: ( ( rule__Quantifier__QTypeAssignment_0 ) )
            // InternalMyDsl.g:4958:2: ( rule__Quantifier__QTypeAssignment_0 )
            {
             before(grammarAccess.getQuantifierAccess().getQTypeAssignment_0()); 
            // InternalMyDsl.g:4959:2: ( rule__Quantifier__QTypeAssignment_0 )
            // InternalMyDsl.g:4959:3: rule__Quantifier__QTypeAssignment_0
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
    // InternalMyDsl.g:4967:1: rule__Quantifier__Group__1 : rule__Quantifier__Group__1__Impl rule__Quantifier__Group__2 ;
    public final void rule__Quantifier__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4971:1: ( rule__Quantifier__Group__1__Impl rule__Quantifier__Group__2 )
            // InternalMyDsl.g:4972:2: rule__Quantifier__Group__1__Impl rule__Quantifier__Group__2
            {
            pushFollow(FOLLOW_40);
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
    // InternalMyDsl.g:4979:1: rule__Quantifier__Group__1__Impl : ( ( rule__Quantifier__ContextAssignment_1 )? ) ;
    public final void rule__Quantifier__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4983:1: ( ( ( rule__Quantifier__ContextAssignment_1 )? ) )
            // InternalMyDsl.g:4984:1: ( ( rule__Quantifier__ContextAssignment_1 )? )
            {
            // InternalMyDsl.g:4984:1: ( ( rule__Quantifier__ContextAssignment_1 )? )
            // InternalMyDsl.g:4985:2: ( rule__Quantifier__ContextAssignment_1 )?
            {
             before(grammarAccess.getQuantifierAccess().getContextAssignment_1()); 
            // InternalMyDsl.g:4986:2: ( rule__Quantifier__ContextAssignment_1 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==39) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalMyDsl.g:4986:3: rule__Quantifier__ContextAssignment_1
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
    // InternalMyDsl.g:4994:1: rule__Quantifier__Group__2 : rule__Quantifier__Group__2__Impl rule__Quantifier__Group__3 ;
    public final void rule__Quantifier__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4998:1: ( rule__Quantifier__Group__2__Impl rule__Quantifier__Group__3 )
            // InternalMyDsl.g:4999:2: rule__Quantifier__Group__2__Impl rule__Quantifier__Group__3
            {
            pushFollow(FOLLOW_41);
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
    // InternalMyDsl.g:5006:1: rule__Quantifier__Group__2__Impl : ( ( rule__Quantifier__VarListAssignment_2 ) ) ;
    public final void rule__Quantifier__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5010:1: ( ( ( rule__Quantifier__VarListAssignment_2 ) ) )
            // InternalMyDsl.g:5011:1: ( ( rule__Quantifier__VarListAssignment_2 ) )
            {
            // InternalMyDsl.g:5011:1: ( ( rule__Quantifier__VarListAssignment_2 ) )
            // InternalMyDsl.g:5012:2: ( rule__Quantifier__VarListAssignment_2 )
            {
             before(grammarAccess.getQuantifierAccess().getVarListAssignment_2()); 
            // InternalMyDsl.g:5013:2: ( rule__Quantifier__VarListAssignment_2 )
            // InternalMyDsl.g:5013:3: rule__Quantifier__VarListAssignment_2
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
    // InternalMyDsl.g:5021:1: rule__Quantifier__Group__3 : rule__Quantifier__Group__3__Impl rule__Quantifier__Group__4 ;
    public final void rule__Quantifier__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5025:1: ( rule__Quantifier__Group__3__Impl rule__Quantifier__Group__4 )
            // InternalMyDsl.g:5026:2: rule__Quantifier__Group__3__Impl rule__Quantifier__Group__4
            {
            pushFollow(FOLLOW_24);
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
    // InternalMyDsl.g:5033:1: rule__Quantifier__Group__3__Impl : ( '\\u00B7' ) ;
    public final void rule__Quantifier__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5037:1: ( ( '\\u00B7' ) )
            // InternalMyDsl.g:5038:1: ( '\\u00B7' )
            {
            // InternalMyDsl.g:5038:1: ( '\\u00B7' )
            // InternalMyDsl.g:5039:2: '\\u00B7'
            {
             before(grammarAccess.getQuantifierAccess().getMiddleDotKeyword_3()); 
            match(input,50,FOLLOW_2); 
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
    // InternalMyDsl.g:5048:1: rule__Quantifier__Group__4 : rule__Quantifier__Group__4__Impl ;
    public final void rule__Quantifier__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5052:1: ( rule__Quantifier__Group__4__Impl )
            // InternalMyDsl.g:5053:2: rule__Quantifier__Group__4__Impl
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
    // InternalMyDsl.g:5059:1: rule__Quantifier__Group__4__Impl : ( ( rule__Quantifier__ChildAssignment_4 ) ) ;
    public final void rule__Quantifier__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5063:1: ( ( ( rule__Quantifier__ChildAssignment_4 ) ) )
            // InternalMyDsl.g:5064:1: ( ( rule__Quantifier__ChildAssignment_4 ) )
            {
            // InternalMyDsl.g:5064:1: ( ( rule__Quantifier__ChildAssignment_4 ) )
            // InternalMyDsl.g:5065:2: ( rule__Quantifier__ChildAssignment_4 )
            {
             before(grammarAccess.getQuantifierAccess().getChildAssignment_4()); 
            // InternalMyDsl.g:5066:2: ( rule__Quantifier__ChildAssignment_4 )
            // InternalMyDsl.g:5066:3: rule__Quantifier__ChildAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Quantifier__ChildAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getQuantifierAccess().getChildAssignment_4()); 

            }


            }

        }
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
    // InternalMyDsl.g:5075:1: rule__Prefix__Group__0 : rule__Prefix__Group__0__Impl rule__Prefix__Group__1 ;
    public final void rule__Prefix__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5079:1: ( rule__Prefix__Group__0__Impl rule__Prefix__Group__1 )
            // InternalMyDsl.g:5080:2: rule__Prefix__Group__0__Impl rule__Prefix__Group__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalMyDsl.g:5087:1: rule__Prefix__Group__0__Impl : ( ( rule__Prefix__NameAssignment_0 ) ) ;
    public final void rule__Prefix__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5091:1: ( ( ( rule__Prefix__NameAssignment_0 ) ) )
            // InternalMyDsl.g:5092:1: ( ( rule__Prefix__NameAssignment_0 ) )
            {
            // InternalMyDsl.g:5092:1: ( ( rule__Prefix__NameAssignment_0 ) )
            // InternalMyDsl.g:5093:2: ( rule__Prefix__NameAssignment_0 )
            {
             before(grammarAccess.getPrefixAccess().getNameAssignment_0()); 
            // InternalMyDsl.g:5094:2: ( rule__Prefix__NameAssignment_0 )
            // InternalMyDsl.g:5094:3: rule__Prefix__NameAssignment_0
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
    // InternalMyDsl.g:5102:1: rule__Prefix__Group__1 : rule__Prefix__Group__1__Impl ;
    public final void rule__Prefix__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5106:1: ( rule__Prefix__Group__1__Impl )
            // InternalMyDsl.g:5107:2: rule__Prefix__Group__1__Impl
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
    // InternalMyDsl.g:5113:1: rule__Prefix__Group__1__Impl : ( ( rule__Prefix__ElemAssignment_1 ) ) ;
    public final void rule__Prefix__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5117:1: ( ( ( rule__Prefix__ElemAssignment_1 ) ) )
            // InternalMyDsl.g:5118:1: ( ( rule__Prefix__ElemAssignment_1 ) )
            {
            // InternalMyDsl.g:5118:1: ( ( rule__Prefix__ElemAssignment_1 ) )
            // InternalMyDsl.g:5119:2: ( rule__Prefix__ElemAssignment_1 )
            {
             before(grammarAccess.getPrefixAccess().getElemAssignment_1()); 
            // InternalMyDsl.g:5120:2: ( rule__Prefix__ElemAssignment_1 )
            // InternalMyDsl.g:5120:3: rule__Prefix__ElemAssignment_1
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
    // InternalMyDsl.g:5129:1: rule__Infix__Group__0 : rule__Infix__Group__0__Impl rule__Infix__Group__1 ;
    public final void rule__Infix__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5133:1: ( rule__Infix__Group__0__Impl rule__Infix__Group__1 )
            // InternalMyDsl.g:5134:2: rule__Infix__Group__0__Impl rule__Infix__Group__1
            {
            pushFollow(FOLLOW_42);
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
    // InternalMyDsl.g:5141:1: rule__Infix__Group__0__Impl : ( ruleElement ) ;
    public final void rule__Infix__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5145:1: ( ( ruleElement ) )
            // InternalMyDsl.g:5146:1: ( ruleElement )
            {
            // InternalMyDsl.g:5146:1: ( ruleElement )
            // InternalMyDsl.g:5147:2: ruleElement
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
    // InternalMyDsl.g:5156:1: rule__Infix__Group__1 : rule__Infix__Group__1__Impl ;
    public final void rule__Infix__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5160:1: ( rule__Infix__Group__1__Impl )
            // InternalMyDsl.g:5161:2: rule__Infix__Group__1__Impl
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
    // InternalMyDsl.g:5167:1: rule__Infix__Group__1__Impl : ( ( rule__Infix__Group_1__0 )* ) ;
    public final void rule__Infix__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5171:1: ( ( ( rule__Infix__Group_1__0 )* ) )
            // InternalMyDsl.g:5172:1: ( ( rule__Infix__Group_1__0 )* )
            {
            // InternalMyDsl.g:5172:1: ( ( rule__Infix__Group_1__0 )* )
            // InternalMyDsl.g:5173:2: ( rule__Infix__Group_1__0 )*
            {
             before(grammarAccess.getInfixAccess().getGroup_1()); 
            // InternalMyDsl.g:5174:2: ( rule__Infix__Group_1__0 )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==RULE_ID) ) {
                    int LA46_2 = input.LA(2);

                    if ( (LA46_2==42) ) {
                        int LA46_4 = input.LA(3);

                        if ( (LA46_4==RULE_ID) ) {
                            int LA46_5 = input.LA(4);

                            if ( (LA46_5==RULE_ID||(LA46_5>=25 && LA46_5<=30)||LA46_5==34||(LA46_5>=42 && LA46_5<=43)) ) {
                                alt46=1;
                            }


                        }
                        else if ( (LA46_4==11||(LA46_4>=23 && LA46_4<=24)||LA46_4==42||LA46_4==53) ) {
                            alt46=1;
                        }


                    }
                    else if ( (LA46_2==RULE_ID||LA46_2==11) ) {
                        alt46=1;
                    }


                }
                else if ( ((LA46_0>=25 && LA46_0<=30)) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalMyDsl.g:5174:3: rule__Infix__Group_1__0
            	    {
            	    pushFollow(FOLLOW_43);
            	    rule__Infix__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop46;
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
    // InternalMyDsl.g:5183:1: rule__Infix__Group_1__0 : rule__Infix__Group_1__0__Impl rule__Infix__Group_1__1 ;
    public final void rule__Infix__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5187:1: ( rule__Infix__Group_1__0__Impl rule__Infix__Group_1__1 )
            // InternalMyDsl.g:5188:2: rule__Infix__Group_1__0__Impl rule__Infix__Group_1__1
            {
            pushFollow(FOLLOW_42);
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
    // InternalMyDsl.g:5195:1: rule__Infix__Group_1__0__Impl : ( () ) ;
    public final void rule__Infix__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5199:1: ( ( () ) )
            // InternalMyDsl.g:5200:1: ( () )
            {
            // InternalMyDsl.g:5200:1: ( () )
            // InternalMyDsl.g:5201:2: ()
            {
             before(grammarAccess.getInfixAccess().getInfixLeftAction_1_0()); 
            // InternalMyDsl.g:5202:2: ()
            // InternalMyDsl.g:5202:3: 
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
    // InternalMyDsl.g:5210:1: rule__Infix__Group_1__1 : rule__Infix__Group_1__1__Impl rule__Infix__Group_1__2 ;
    public final void rule__Infix__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5214:1: ( rule__Infix__Group_1__1__Impl rule__Infix__Group_1__2 )
            // InternalMyDsl.g:5215:2: rule__Infix__Group_1__1__Impl rule__Infix__Group_1__2
            {
            pushFollow(FOLLOW_24);
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
    // InternalMyDsl.g:5222:1: rule__Infix__Group_1__1__Impl : ( ( rule__Infix__Alternatives_1_1 ) ) ;
    public final void rule__Infix__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5226:1: ( ( ( rule__Infix__Alternatives_1_1 ) ) )
            // InternalMyDsl.g:5227:1: ( ( rule__Infix__Alternatives_1_1 ) )
            {
            // InternalMyDsl.g:5227:1: ( ( rule__Infix__Alternatives_1_1 ) )
            // InternalMyDsl.g:5228:2: ( rule__Infix__Alternatives_1_1 )
            {
             before(grammarAccess.getInfixAccess().getAlternatives_1_1()); 
            // InternalMyDsl.g:5229:2: ( rule__Infix__Alternatives_1_1 )
            // InternalMyDsl.g:5229:3: rule__Infix__Alternatives_1_1
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
    // InternalMyDsl.g:5237:1: rule__Infix__Group_1__2 : rule__Infix__Group_1__2__Impl ;
    public final void rule__Infix__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5241:1: ( rule__Infix__Group_1__2__Impl )
            // InternalMyDsl.g:5242:2: rule__Infix__Group_1__2__Impl
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
    // InternalMyDsl.g:5248:1: rule__Infix__Group_1__2__Impl : ( ( rule__Infix__RightAssignment_1_2 ) ) ;
    public final void rule__Infix__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5252:1: ( ( ( rule__Infix__RightAssignment_1_2 ) ) )
            // InternalMyDsl.g:5253:1: ( ( rule__Infix__RightAssignment_1_2 ) )
            {
            // InternalMyDsl.g:5253:1: ( ( rule__Infix__RightAssignment_1_2 ) )
            // InternalMyDsl.g:5254:2: ( rule__Infix__RightAssignment_1_2 )
            {
             before(grammarAccess.getInfixAccess().getRightAssignment_1_2()); 
            // InternalMyDsl.g:5255:2: ( rule__Infix__RightAssignment_1_2 )
            // InternalMyDsl.g:5255:3: rule__Infix__RightAssignment_1_2
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
    // InternalMyDsl.g:5264:1: rule__Bracket__Group__0 : rule__Bracket__Group__0__Impl rule__Bracket__Group__1 ;
    public final void rule__Bracket__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5268:1: ( rule__Bracket__Group__0__Impl rule__Bracket__Group__1 )
            // InternalMyDsl.g:5269:2: rule__Bracket__Group__0__Impl rule__Bracket__Group__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalMyDsl.g:5276:1: rule__Bracket__Group__0__Impl : ( '(' ) ;
    public final void rule__Bracket__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5280:1: ( ( '(' ) )
            // InternalMyDsl.g:5281:1: ( '(' )
            {
            // InternalMyDsl.g:5281:1: ( '(' )
            // InternalMyDsl.g:5282:2: '('
            {
             before(grammarAccess.getBracketAccess().getLeftParenthesisKeyword_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalMyDsl.g:5291:1: rule__Bracket__Group__1 : rule__Bracket__Group__1__Impl rule__Bracket__Group__2 ;
    public final void rule__Bracket__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5295:1: ( rule__Bracket__Group__1__Impl rule__Bracket__Group__2 )
            // InternalMyDsl.g:5296:2: rule__Bracket__Group__1__Impl rule__Bracket__Group__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalMyDsl.g:5303:1: rule__Bracket__Group__1__Impl : ( ( rule__Bracket__ChildAssignment_1 ) ) ;
    public final void rule__Bracket__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5307:1: ( ( ( rule__Bracket__ChildAssignment_1 ) ) )
            // InternalMyDsl.g:5308:1: ( ( rule__Bracket__ChildAssignment_1 ) )
            {
            // InternalMyDsl.g:5308:1: ( ( rule__Bracket__ChildAssignment_1 ) )
            // InternalMyDsl.g:5309:2: ( rule__Bracket__ChildAssignment_1 )
            {
             before(grammarAccess.getBracketAccess().getChildAssignment_1()); 
            // InternalMyDsl.g:5310:2: ( rule__Bracket__ChildAssignment_1 )
            // InternalMyDsl.g:5310:3: rule__Bracket__ChildAssignment_1
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
    // InternalMyDsl.g:5318:1: rule__Bracket__Group__2 : rule__Bracket__Group__2__Impl ;
    public final void rule__Bracket__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5322:1: ( rule__Bracket__Group__2__Impl )
            // InternalMyDsl.g:5323:2: rule__Bracket__Group__2__Impl
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
    // InternalMyDsl.g:5329:1: rule__Bracket__Group__2__Impl : ( ')' ) ;
    public final void rule__Bracket__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5333:1: ( ( ')' ) )
            // InternalMyDsl.g:5334:1: ( ')' )
            {
            // InternalMyDsl.g:5334:1: ( ')' )
            // InternalMyDsl.g:5335:2: ')'
            {
             before(grammarAccess.getBracketAccess().getRightParenthesisKeyword_2()); 
            match(input,43,FOLLOW_2); 
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
    // InternalMyDsl.g:5345:1: rule__FunctionCall__Group__0 : rule__FunctionCall__Group__0__Impl rule__FunctionCall__Group__1 ;
    public final void rule__FunctionCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5349:1: ( rule__FunctionCall__Group__0__Impl rule__FunctionCall__Group__1 )
            // InternalMyDsl.g:5350:2: rule__FunctionCall__Group__0__Impl rule__FunctionCall__Group__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalMyDsl.g:5357:1: rule__FunctionCall__Group__0__Impl : ( ( rule__FunctionCall__TypeInstAssignment_0 ) ) ;
    public final void rule__FunctionCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5361:1: ( ( ( rule__FunctionCall__TypeInstAssignment_0 ) ) )
            // InternalMyDsl.g:5362:1: ( ( rule__FunctionCall__TypeInstAssignment_0 ) )
            {
            // InternalMyDsl.g:5362:1: ( ( rule__FunctionCall__TypeInstAssignment_0 ) )
            // InternalMyDsl.g:5363:2: ( rule__FunctionCall__TypeInstAssignment_0 )
            {
             before(grammarAccess.getFunctionCallAccess().getTypeInstAssignment_0()); 
            // InternalMyDsl.g:5364:2: ( rule__FunctionCall__TypeInstAssignment_0 )
            // InternalMyDsl.g:5364:3: rule__FunctionCall__TypeInstAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__FunctionCall__TypeInstAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionCallAccess().getTypeInstAssignment_0()); 

            }


            }

        }
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
    // InternalMyDsl.g:5372:1: rule__FunctionCall__Group__1 : rule__FunctionCall__Group__1__Impl ;
    public final void rule__FunctionCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5376:1: ( rule__FunctionCall__Group__1__Impl )
            // InternalMyDsl.g:5377:2: rule__FunctionCall__Group__1__Impl
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
    // InternalMyDsl.g:5383:1: rule__FunctionCall__Group__1__Impl : ( ( rule__FunctionCall__Group_1__0 )? ) ;
    public final void rule__FunctionCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5387:1: ( ( ( rule__FunctionCall__Group_1__0 )? ) )
            // InternalMyDsl.g:5388:1: ( ( rule__FunctionCall__Group_1__0 )? )
            {
            // InternalMyDsl.g:5388:1: ( ( rule__FunctionCall__Group_1__0 )? )
            // InternalMyDsl.g:5389:2: ( rule__FunctionCall__Group_1__0 )?
            {
             before(grammarAccess.getFunctionCallAccess().getGroup_1()); 
            // InternalMyDsl.g:5390:2: ( rule__FunctionCall__Group_1__0 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==42) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalMyDsl.g:5390:3: rule__FunctionCall__Group_1__0
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
    // InternalMyDsl.g:5399:1: rule__FunctionCall__Group_1__0 : rule__FunctionCall__Group_1__0__Impl rule__FunctionCall__Group_1__1 ;
    public final void rule__FunctionCall__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5403:1: ( rule__FunctionCall__Group_1__0__Impl rule__FunctionCall__Group_1__1 )
            // InternalMyDsl.g:5404:2: rule__FunctionCall__Group_1__0__Impl rule__FunctionCall__Group_1__1
            {
            pushFollow(FOLLOW_44);
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
    // InternalMyDsl.g:5411:1: rule__FunctionCall__Group_1__0__Impl : ( '(' ) ;
    public final void rule__FunctionCall__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5415:1: ( ( '(' ) )
            // InternalMyDsl.g:5416:1: ( '(' )
            {
            // InternalMyDsl.g:5416:1: ( '(' )
            // InternalMyDsl.g:5417:2: '('
            {
             before(grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalMyDsl.g:5426:1: rule__FunctionCall__Group_1__1 : rule__FunctionCall__Group_1__1__Impl rule__FunctionCall__Group_1__2 ;
    public final void rule__FunctionCall__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5430:1: ( rule__FunctionCall__Group_1__1__Impl rule__FunctionCall__Group_1__2 )
            // InternalMyDsl.g:5431:2: rule__FunctionCall__Group_1__1__Impl rule__FunctionCall__Group_1__2
            {
            pushFollow(FOLLOW_44);
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
    // InternalMyDsl.g:5438:1: rule__FunctionCall__Group_1__1__Impl : ( ( rule__FunctionCall__ArgumentsAssignment_1_1 )? ) ;
    public final void rule__FunctionCall__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5442:1: ( ( ( rule__FunctionCall__ArgumentsAssignment_1_1 )? ) )
            // InternalMyDsl.g:5443:1: ( ( rule__FunctionCall__ArgumentsAssignment_1_1 )? )
            {
            // InternalMyDsl.g:5443:1: ( ( rule__FunctionCall__ArgumentsAssignment_1_1 )? )
            // InternalMyDsl.g:5444:2: ( rule__FunctionCall__ArgumentsAssignment_1_1 )?
            {
             before(grammarAccess.getFunctionCallAccess().getArgumentsAssignment_1_1()); 
            // InternalMyDsl.g:5445:2: ( rule__FunctionCall__ArgumentsAssignment_1_1 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_ID||LA48_0==11||(LA48_0>=23 && LA48_0<=24)||LA48_0==42||LA48_0==53) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalMyDsl.g:5445:3: rule__FunctionCall__ArgumentsAssignment_1_1
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
    // InternalMyDsl.g:5453:1: rule__FunctionCall__Group_1__2 : rule__FunctionCall__Group_1__2__Impl rule__FunctionCall__Group_1__3 ;
    public final void rule__FunctionCall__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5457:1: ( rule__FunctionCall__Group_1__2__Impl rule__FunctionCall__Group_1__3 )
            // InternalMyDsl.g:5458:2: rule__FunctionCall__Group_1__2__Impl rule__FunctionCall__Group_1__3
            {
            pushFollow(FOLLOW_44);
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
    // InternalMyDsl.g:5465:1: rule__FunctionCall__Group_1__2__Impl : ( ( rule__FunctionCall__Group_1_2__0 )* ) ;
    public final void rule__FunctionCall__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5469:1: ( ( ( rule__FunctionCall__Group_1_2__0 )* ) )
            // InternalMyDsl.g:5470:1: ( ( rule__FunctionCall__Group_1_2__0 )* )
            {
            // InternalMyDsl.g:5470:1: ( ( rule__FunctionCall__Group_1_2__0 )* )
            // InternalMyDsl.g:5471:2: ( rule__FunctionCall__Group_1_2__0 )*
            {
             before(grammarAccess.getFunctionCallAccess().getGroup_1_2()); 
            // InternalMyDsl.g:5472:2: ( rule__FunctionCall__Group_1_2__0 )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==41) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalMyDsl.g:5472:3: rule__FunctionCall__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__FunctionCall__Group_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop49;
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
    // InternalMyDsl.g:5480:1: rule__FunctionCall__Group_1__3 : rule__FunctionCall__Group_1__3__Impl ;
    public final void rule__FunctionCall__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5484:1: ( rule__FunctionCall__Group_1__3__Impl )
            // InternalMyDsl.g:5485:2: rule__FunctionCall__Group_1__3__Impl
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
    // InternalMyDsl.g:5491:1: rule__FunctionCall__Group_1__3__Impl : ( ')' ) ;
    public final void rule__FunctionCall__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5495:1: ( ( ')' ) )
            // InternalMyDsl.g:5496:1: ( ')' )
            {
            // InternalMyDsl.g:5496:1: ( ')' )
            // InternalMyDsl.g:5497:2: ')'
            {
             before(grammarAccess.getFunctionCallAccess().getRightParenthesisKeyword_1_3()); 
            match(input,43,FOLLOW_2); 
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
    // InternalMyDsl.g:5507:1: rule__FunctionCall__Group_1_2__0 : rule__FunctionCall__Group_1_2__0__Impl rule__FunctionCall__Group_1_2__1 ;
    public final void rule__FunctionCall__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5511:1: ( rule__FunctionCall__Group_1_2__0__Impl rule__FunctionCall__Group_1_2__1 )
            // InternalMyDsl.g:5512:2: rule__FunctionCall__Group_1_2__0__Impl rule__FunctionCall__Group_1_2__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalMyDsl.g:5519:1: rule__FunctionCall__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__FunctionCall__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5523:1: ( ( ',' ) )
            // InternalMyDsl.g:5524:1: ( ',' )
            {
            // InternalMyDsl.g:5524:1: ( ',' )
            // InternalMyDsl.g:5525:2: ','
            {
             before(grammarAccess.getFunctionCallAccess().getCommaKeyword_1_2_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalMyDsl.g:5534:1: rule__FunctionCall__Group_1_2__1 : rule__FunctionCall__Group_1_2__1__Impl ;
    public final void rule__FunctionCall__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5538:1: ( rule__FunctionCall__Group_1_2__1__Impl )
            // InternalMyDsl.g:5539:2: rule__FunctionCall__Group_1_2__1__Impl
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
    // InternalMyDsl.g:5545:1: rule__FunctionCall__Group_1_2__1__Impl : ( ( rule__FunctionCall__ArgumentsAssignment_1_2_1 ) ) ;
    public final void rule__FunctionCall__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5549:1: ( ( ( rule__FunctionCall__ArgumentsAssignment_1_2_1 ) ) )
            // InternalMyDsl.g:5550:1: ( ( rule__FunctionCall__ArgumentsAssignment_1_2_1 ) )
            {
            // InternalMyDsl.g:5550:1: ( ( rule__FunctionCall__ArgumentsAssignment_1_2_1 ) )
            // InternalMyDsl.g:5551:2: ( rule__FunctionCall__ArgumentsAssignment_1_2_1 )
            {
             before(grammarAccess.getFunctionCallAccess().getArgumentsAssignment_1_2_1()); 
            // InternalMyDsl.g:5552:2: ( rule__FunctionCall__ArgumentsAssignment_1_2_1 )
            // InternalMyDsl.g:5552:3: rule__FunctionCall__ArgumentsAssignment_1_2_1
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


    // $ANTLR start "rule__TypeInstance__Group_1__0"
    // InternalMyDsl.g:5561:1: rule__TypeInstance__Group_1__0 : rule__TypeInstance__Group_1__0__Impl rule__TypeInstance__Group_1__1 ;
    public final void rule__TypeInstance__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5565:1: ( rule__TypeInstance__Group_1__0__Impl rule__TypeInstance__Group_1__1 )
            // InternalMyDsl.g:5566:2: rule__TypeInstance__Group_1__0__Impl rule__TypeInstance__Group_1__1
            {
            pushFollow(FOLLOW_7);
            rule__TypeInstance__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeInstance__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeInstance__Group_1__0"


    // $ANTLR start "rule__TypeInstance__Group_1__0__Impl"
    // InternalMyDsl.g:5573:1: rule__TypeInstance__Group_1__0__Impl : ( ( rule__TypeInstance__TypeNameAssignment_1_0 ) ) ;
    public final void rule__TypeInstance__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5577:1: ( ( ( rule__TypeInstance__TypeNameAssignment_1_0 ) ) )
            // InternalMyDsl.g:5578:1: ( ( rule__TypeInstance__TypeNameAssignment_1_0 ) )
            {
            // InternalMyDsl.g:5578:1: ( ( rule__TypeInstance__TypeNameAssignment_1_0 ) )
            // InternalMyDsl.g:5579:2: ( rule__TypeInstance__TypeNameAssignment_1_0 )
            {
             before(grammarAccess.getTypeInstanceAccess().getTypeNameAssignment_1_0()); 
            // InternalMyDsl.g:5580:2: ( rule__TypeInstance__TypeNameAssignment_1_0 )
            // InternalMyDsl.g:5580:3: rule__TypeInstance__TypeNameAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__TypeInstance__TypeNameAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getTypeInstanceAccess().getTypeNameAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeInstance__Group_1__0__Impl"


    // $ANTLR start "rule__TypeInstance__Group_1__1"
    // InternalMyDsl.g:5588:1: rule__TypeInstance__Group_1__1 : rule__TypeInstance__Group_1__1__Impl ;
    public final void rule__TypeInstance__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5592:1: ( rule__TypeInstance__Group_1__1__Impl )
            // InternalMyDsl.g:5593:2: rule__TypeInstance__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TypeInstance__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeInstance__Group_1__1"


    // $ANTLR start "rule__TypeInstance__Group_1__1__Impl"
    // InternalMyDsl.g:5599:1: rule__TypeInstance__Group_1__1__Impl : ( ( ( rule__TypeInstance__Group_1_1__0 ) ) ( ( rule__TypeInstance__Group_1_1__0 )* ) ) ;
    public final void rule__TypeInstance__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5603:1: ( ( ( ( rule__TypeInstance__Group_1_1__0 ) ) ( ( rule__TypeInstance__Group_1_1__0 )* ) ) )
            // InternalMyDsl.g:5604:1: ( ( ( rule__TypeInstance__Group_1_1__0 ) ) ( ( rule__TypeInstance__Group_1_1__0 )* ) )
            {
            // InternalMyDsl.g:5604:1: ( ( ( rule__TypeInstance__Group_1_1__0 ) ) ( ( rule__TypeInstance__Group_1_1__0 )* ) )
            // InternalMyDsl.g:5605:2: ( ( rule__TypeInstance__Group_1_1__0 ) ) ( ( rule__TypeInstance__Group_1_1__0 )* )
            {
            // InternalMyDsl.g:5605:2: ( ( rule__TypeInstance__Group_1_1__0 ) )
            // InternalMyDsl.g:5606:3: ( rule__TypeInstance__Group_1_1__0 )
            {
             before(grammarAccess.getTypeInstanceAccess().getGroup_1_1()); 
            // InternalMyDsl.g:5607:3: ( rule__TypeInstance__Group_1_1__0 )
            // InternalMyDsl.g:5607:4: rule__TypeInstance__Group_1_1__0
            {
            pushFollow(FOLLOW_45);
            rule__TypeInstance__Group_1_1__0();

            state._fsp--;


            }

             after(grammarAccess.getTypeInstanceAccess().getGroup_1_1()); 

            }

            // InternalMyDsl.g:5610:2: ( ( rule__TypeInstance__Group_1_1__0 )* )
            // InternalMyDsl.g:5611:3: ( rule__TypeInstance__Group_1_1__0 )*
            {
             before(grammarAccess.getTypeInstanceAccess().getGroup_1_1()); 
            // InternalMyDsl.g:5612:3: ( rule__TypeInstance__Group_1_1__0 )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==34) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalMyDsl.g:5612:4: rule__TypeInstance__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_45);
            	    rule__TypeInstance__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);

             after(grammarAccess.getTypeInstanceAccess().getGroup_1_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeInstance__Group_1__1__Impl"


    // $ANTLR start "rule__TypeInstance__Group_1_1__0"
    // InternalMyDsl.g:5622:1: rule__TypeInstance__Group_1_1__0 : rule__TypeInstance__Group_1_1__0__Impl rule__TypeInstance__Group_1_1__1 ;
    public final void rule__TypeInstance__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5626:1: ( rule__TypeInstance__Group_1_1__0__Impl rule__TypeInstance__Group_1_1__1 )
            // InternalMyDsl.g:5627:2: rule__TypeInstance__Group_1_1__0__Impl rule__TypeInstance__Group_1_1__1
            {
            pushFollow(FOLLOW_6);
            rule__TypeInstance__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeInstance__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeInstance__Group_1_1__0"


    // $ANTLR start "rule__TypeInstance__Group_1_1__0__Impl"
    // InternalMyDsl.g:5634:1: rule__TypeInstance__Group_1_1__0__Impl : ( '.' ) ;
    public final void rule__TypeInstance__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5638:1: ( ( '.' ) )
            // InternalMyDsl.g:5639:1: ( '.' )
            {
            // InternalMyDsl.g:5639:1: ( '.' )
            // InternalMyDsl.g:5640:2: '.'
            {
             before(grammarAccess.getTypeInstanceAccess().getFullStopKeyword_1_1_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getTypeInstanceAccess().getFullStopKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeInstance__Group_1_1__0__Impl"


    // $ANTLR start "rule__TypeInstance__Group_1_1__1"
    // InternalMyDsl.g:5649:1: rule__TypeInstance__Group_1_1__1 : rule__TypeInstance__Group_1_1__1__Impl ;
    public final void rule__TypeInstance__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5653:1: ( rule__TypeInstance__Group_1_1__1__Impl )
            // InternalMyDsl.g:5654:2: rule__TypeInstance__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TypeInstance__Group_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeInstance__Group_1_1__1"


    // $ANTLR start "rule__TypeInstance__Group_1_1__1__Impl"
    // InternalMyDsl.g:5660:1: rule__TypeInstance__Group_1_1__1__Impl : ( ( rule__TypeInstance__ElementAssignment_1_1_1 ) ) ;
    public final void rule__TypeInstance__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5664:1: ( ( ( rule__TypeInstance__ElementAssignment_1_1_1 ) ) )
            // InternalMyDsl.g:5665:1: ( ( rule__TypeInstance__ElementAssignment_1_1_1 ) )
            {
            // InternalMyDsl.g:5665:1: ( ( rule__TypeInstance__ElementAssignment_1_1_1 ) )
            // InternalMyDsl.g:5666:2: ( rule__TypeInstance__ElementAssignment_1_1_1 )
            {
             before(grammarAccess.getTypeInstanceAccess().getElementAssignment_1_1_1()); 
            // InternalMyDsl.g:5667:2: ( rule__TypeInstance__ElementAssignment_1_1_1 )
            // InternalMyDsl.g:5667:3: rule__TypeInstance__ElementAssignment_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__TypeInstance__ElementAssignment_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getTypeInstanceAccess().getElementAssignment_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeInstance__Group_1_1__1__Impl"


    // $ANTLR start "rule__Instance__Group__0"
    // InternalMyDsl.g:5676:1: rule__Instance__Group__0 : rule__Instance__Group__0__Impl rule__Instance__Group__1 ;
    public final void rule__Instance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5680:1: ( rule__Instance__Group__0__Impl rule__Instance__Group__1 )
            // InternalMyDsl.g:5681:2: rule__Instance__Group__0__Impl rule__Instance__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalMyDsl.g:5688:1: rule__Instance__Group__0__Impl : ( 'Instance' ) ;
    public final void rule__Instance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5692:1: ( ( 'Instance' ) )
            // InternalMyDsl.g:5693:1: ( 'Instance' )
            {
            // InternalMyDsl.g:5693:1: ( 'Instance' )
            // InternalMyDsl.g:5694:2: 'Instance'
            {
             before(grammarAccess.getInstanceAccess().getInstanceKeyword_0()); 
            match(input,51,FOLLOW_2); 
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
    // InternalMyDsl.g:5703:1: rule__Instance__Group__1 : rule__Instance__Group__1__Impl rule__Instance__Group__2 ;
    public final void rule__Instance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5707:1: ( rule__Instance__Group__1__Impl rule__Instance__Group__2 )
            // InternalMyDsl.g:5708:2: rule__Instance__Group__1__Impl rule__Instance__Group__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalMyDsl.g:5715:1: rule__Instance__Group__1__Impl : ( ( rule__Instance__ClassNameAssignment_1 ) ) ;
    public final void rule__Instance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5719:1: ( ( ( rule__Instance__ClassNameAssignment_1 ) ) )
            // InternalMyDsl.g:5720:1: ( ( rule__Instance__ClassNameAssignment_1 ) )
            {
            // InternalMyDsl.g:5720:1: ( ( rule__Instance__ClassNameAssignment_1 ) )
            // InternalMyDsl.g:5721:2: ( rule__Instance__ClassNameAssignment_1 )
            {
             before(grammarAccess.getInstanceAccess().getClassNameAssignment_1()); 
            // InternalMyDsl.g:5722:2: ( rule__Instance__ClassNameAssignment_1 )
            // InternalMyDsl.g:5722:3: rule__Instance__ClassNameAssignment_1
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
    // InternalMyDsl.g:5730:1: rule__Instance__Group__2 : rule__Instance__Group__2__Impl rule__Instance__Group__3 ;
    public final void rule__Instance__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5734:1: ( rule__Instance__Group__2__Impl rule__Instance__Group__3 )
            // InternalMyDsl.g:5735:2: rule__Instance__Group__2__Impl rule__Instance__Group__3
            {
            pushFollow(FOLLOW_28);
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
    // InternalMyDsl.g:5742:1: rule__Instance__Group__2__Impl : ( ( rule__Instance__ContextAssignment_2 ) ) ;
    public final void rule__Instance__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5746:1: ( ( ( rule__Instance__ContextAssignment_2 ) ) )
            // InternalMyDsl.g:5747:1: ( ( rule__Instance__ContextAssignment_2 ) )
            {
            // InternalMyDsl.g:5747:1: ( ( rule__Instance__ContextAssignment_2 ) )
            // InternalMyDsl.g:5748:2: ( rule__Instance__ContextAssignment_2 )
            {
             before(grammarAccess.getInstanceAccess().getContextAssignment_2()); 
            // InternalMyDsl.g:5749:2: ( rule__Instance__ContextAssignment_2 )
            // InternalMyDsl.g:5749:3: rule__Instance__ContextAssignment_2
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
    // InternalMyDsl.g:5757:1: rule__Instance__Group__3 : rule__Instance__Group__3__Impl rule__Instance__Group__4 ;
    public final void rule__Instance__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5761:1: ( rule__Instance__Group__3__Impl rule__Instance__Group__4 )
            // InternalMyDsl.g:5762:2: rule__Instance__Group__3__Impl rule__Instance__Group__4
            {
            pushFollow(FOLLOW_44);
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
    // InternalMyDsl.g:5769:1: rule__Instance__Group__3__Impl : ( '(' ) ;
    public final void rule__Instance__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5773:1: ( ( '(' ) )
            // InternalMyDsl.g:5774:1: ( '(' )
            {
            // InternalMyDsl.g:5774:1: ( '(' )
            // InternalMyDsl.g:5775:2: '('
            {
             before(grammarAccess.getInstanceAccess().getLeftParenthesisKeyword_3()); 
            match(input,42,FOLLOW_2); 
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
    // InternalMyDsl.g:5784:1: rule__Instance__Group__4 : rule__Instance__Group__4__Impl rule__Instance__Group__5 ;
    public final void rule__Instance__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5788:1: ( rule__Instance__Group__4__Impl rule__Instance__Group__5 )
            // InternalMyDsl.g:5789:2: rule__Instance__Group__4__Impl rule__Instance__Group__5
            {
            pushFollow(FOLLOW_44);
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
    // InternalMyDsl.g:5796:1: rule__Instance__Group__4__Impl : ( ( rule__Instance__ArgumentsAssignment_4 )? ) ;
    public final void rule__Instance__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5800:1: ( ( ( rule__Instance__ArgumentsAssignment_4 )? ) )
            // InternalMyDsl.g:5801:1: ( ( rule__Instance__ArgumentsAssignment_4 )? )
            {
            // InternalMyDsl.g:5801:1: ( ( rule__Instance__ArgumentsAssignment_4 )? )
            // InternalMyDsl.g:5802:2: ( rule__Instance__ArgumentsAssignment_4 )?
            {
             before(grammarAccess.getInstanceAccess().getArgumentsAssignment_4()); 
            // InternalMyDsl.g:5803:2: ( rule__Instance__ArgumentsAssignment_4 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_ID||LA51_0==11||(LA51_0>=23 && LA51_0<=24)||LA51_0==42||LA51_0==53) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalMyDsl.g:5803:3: rule__Instance__ArgumentsAssignment_4
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
    // InternalMyDsl.g:5811:1: rule__Instance__Group__5 : rule__Instance__Group__5__Impl rule__Instance__Group__6 ;
    public final void rule__Instance__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5815:1: ( rule__Instance__Group__5__Impl rule__Instance__Group__6 )
            // InternalMyDsl.g:5816:2: rule__Instance__Group__5__Impl rule__Instance__Group__6
            {
            pushFollow(FOLLOW_44);
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
    // InternalMyDsl.g:5823:1: rule__Instance__Group__5__Impl : ( ( rule__Instance__Group_5__0 )* ) ;
    public final void rule__Instance__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5827:1: ( ( ( rule__Instance__Group_5__0 )* ) )
            // InternalMyDsl.g:5828:1: ( ( rule__Instance__Group_5__0 )* )
            {
            // InternalMyDsl.g:5828:1: ( ( rule__Instance__Group_5__0 )* )
            // InternalMyDsl.g:5829:2: ( rule__Instance__Group_5__0 )*
            {
             before(grammarAccess.getInstanceAccess().getGroup_5()); 
            // InternalMyDsl.g:5830:2: ( rule__Instance__Group_5__0 )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==41) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // InternalMyDsl.g:5830:3: rule__Instance__Group_5__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Instance__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop52;
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
    // InternalMyDsl.g:5838:1: rule__Instance__Group__6 : rule__Instance__Group__6__Impl ;
    public final void rule__Instance__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5842:1: ( rule__Instance__Group__6__Impl )
            // InternalMyDsl.g:5843:2: rule__Instance__Group__6__Impl
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
    // InternalMyDsl.g:5849:1: rule__Instance__Group__6__Impl : ( ')' ) ;
    public final void rule__Instance__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5853:1: ( ( ')' ) )
            // InternalMyDsl.g:5854:1: ( ')' )
            {
            // InternalMyDsl.g:5854:1: ( ')' )
            // InternalMyDsl.g:5855:2: ')'
            {
             before(grammarAccess.getInstanceAccess().getRightParenthesisKeyword_6()); 
            match(input,43,FOLLOW_2); 
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
    // InternalMyDsl.g:5865:1: rule__Instance__Group_5__0 : rule__Instance__Group_5__0__Impl rule__Instance__Group_5__1 ;
    public final void rule__Instance__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5869:1: ( rule__Instance__Group_5__0__Impl rule__Instance__Group_5__1 )
            // InternalMyDsl.g:5870:2: rule__Instance__Group_5__0__Impl rule__Instance__Group_5__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalMyDsl.g:5877:1: rule__Instance__Group_5__0__Impl : ( ',' ) ;
    public final void rule__Instance__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5881:1: ( ( ',' ) )
            // InternalMyDsl.g:5882:1: ( ',' )
            {
            // InternalMyDsl.g:5882:1: ( ',' )
            // InternalMyDsl.g:5883:2: ','
            {
             before(grammarAccess.getInstanceAccess().getCommaKeyword_5_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalMyDsl.g:5892:1: rule__Instance__Group_5__1 : rule__Instance__Group_5__1__Impl ;
    public final void rule__Instance__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5896:1: ( rule__Instance__Group_5__1__Impl )
            // InternalMyDsl.g:5897:2: rule__Instance__Group_5__1__Impl
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
    // InternalMyDsl.g:5903:1: rule__Instance__Group_5__1__Impl : ( ( rule__Instance__ArgumentsAssignment_5_1 ) ) ;
    public final void rule__Instance__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5907:1: ( ( ( rule__Instance__ArgumentsAssignment_5_1 ) ) )
            // InternalMyDsl.g:5908:1: ( ( rule__Instance__ArgumentsAssignment_5_1 ) )
            {
            // InternalMyDsl.g:5908:1: ( ( rule__Instance__ArgumentsAssignment_5_1 ) )
            // InternalMyDsl.g:5909:2: ( rule__Instance__ArgumentsAssignment_5_1 )
            {
             before(grammarAccess.getInstanceAccess().getArgumentsAssignment_5_1()); 
            // InternalMyDsl.g:5910:2: ( rule__Instance__ArgumentsAssignment_5_1 )
            // InternalMyDsl.g:5910:3: rule__Instance__ArgumentsAssignment_5_1
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


    // $ANTLR start "rule__DomainModel__ElementsAssignment"
    // InternalMyDsl.g:5919:1: rule__DomainModel__ElementsAssignment : ( ruleTopLevel ) ;
    public final void rule__DomainModel__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5923:1: ( ( ruleTopLevel ) )
            // InternalMyDsl.g:5924:2: ( ruleTopLevel )
            {
            // InternalMyDsl.g:5924:2: ( ruleTopLevel )
            // InternalMyDsl.g:5925:3: ruleTopLevel
            {
             before(grammarAccess.getDomainModelAccess().getElementsTopLevelParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleTopLevel();

            state._fsp--;

             after(grammarAccess.getDomainModelAccess().getElementsTopLevelParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainModel__ElementsAssignment"


    // $ANTLR start "rule__ImportStatement__ImportsAssignment_1"
    // InternalMyDsl.g:5934:1: rule__ImportStatement__ImportsAssignment_1 : ( ruleImport ) ;
    public final void rule__ImportStatement__ImportsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5938:1: ( ( ruleImport ) )
            // InternalMyDsl.g:5939:2: ( ruleImport )
            {
            // InternalMyDsl.g:5939:2: ( ruleImport )
            // InternalMyDsl.g:5940:3: ruleImport
            {
             before(grammarAccess.getImportStatementAccess().getImportsImportParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getImportStatementAccess().getImportsImportParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportStatement__ImportsAssignment_1"


    // $ANTLR start "rule__Import__ImportNameAssignment_0"
    // InternalMyDsl.g:5949:1: rule__Import__ImportNameAssignment_0 : ( ruleImportComponent ) ;
    public final void rule__Import__ImportNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5953:1: ( ( ruleImportComponent ) )
            // InternalMyDsl.g:5954:2: ( ruleImportComponent )
            {
            // InternalMyDsl.g:5954:2: ( ruleImportComponent )
            // InternalMyDsl.g:5955:3: ruleImportComponent
            {
             before(grammarAccess.getImportAccess().getImportNameImportComponentParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleImportComponent();

            state._fsp--;

             after(grammarAccess.getImportAccess().getImportNameImportComponentParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__ImportNameAssignment_0"


    // $ANTLR start "rule__Import__ImportNameAssignment_1_1"
    // InternalMyDsl.g:5964:1: rule__Import__ImportNameAssignment_1_1 : ( ruleImportComponent ) ;
    public final void rule__Import__ImportNameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5968:1: ( ( ruleImportComponent ) )
            // InternalMyDsl.g:5969:2: ( ruleImportComponent )
            {
            // InternalMyDsl.g:5969:2: ( ruleImportComponent )
            // InternalMyDsl.g:5970:3: ruleImportComponent
            {
             before(grammarAccess.getImportAccess().getImportNameImportComponentParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleImportComponent();

            state._fsp--;

             after(grammarAccess.getImportAccess().getImportNameImportComponentParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__ImportNameAssignment_1_1"


    // $ANTLR start "rule__ImportComponent__NameAssignment"
    // InternalMyDsl.g:5979:1: rule__ImportComponent__NameAssignment : ( RULE_ID ) ;
    public final void rule__ImportComponent__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5983:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:5984:2: ( RULE_ID )
            {
            // InternalMyDsl.g:5984:2: ( RULE_ID )
            // InternalMyDsl.g:5985:3: RULE_ID
            {
             before(grammarAccess.getImportComponentAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getImportComponentAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportComponent__NameAssignment"


    // $ANTLR start "rule__Class__TypeNameAssignment_1"
    // InternalMyDsl.g:5994:1: rule__Class__TypeNameAssignment_1 : ( ruleTypeName ) ;
    public final void rule__Class__TypeNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5998:1: ( ( ruleTypeName ) )
            // InternalMyDsl.g:5999:2: ( ruleTypeName )
            {
            // InternalMyDsl.g:5999:2: ( ruleTypeName )
            // InternalMyDsl.g:6000:3: ruleTypeName
            {
             before(grammarAccess.getClassAccess().getTypeNameTypeNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTypeName();

            state._fsp--;

             after(grammarAccess.getClassAccess().getTypeNameTypeNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__TypeNameAssignment_1"


    // $ANTLR start "rule__Class__ContextAssignment_2"
    // InternalMyDsl.g:6009:1: rule__Class__ContextAssignment_2 : ( rulePolyContext ) ;
    public final void rule__Class__ContextAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6013:1: ( ( rulePolyContext ) )
            // InternalMyDsl.g:6014:2: ( rulePolyContext )
            {
            // InternalMyDsl.g:6014:2: ( rulePolyContext )
            // InternalMyDsl.g:6015:3: rulePolyContext
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
    // InternalMyDsl.g:6024:1: rule__Class__SupertypesAssignment_3 : ( ruleSuperTypeList ) ;
    public final void rule__Class__SupertypesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6028:1: ( ( ruleSuperTypeList ) )
            // InternalMyDsl.g:6029:2: ( ruleSuperTypeList )
            {
            // InternalMyDsl.g:6029:2: ( ruleSuperTypeList )
            // InternalMyDsl.g:6030:3: ruleSuperTypeList
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
    // InternalMyDsl.g:6039:1: rule__Class__VarListAssignment_4 : ( ruleTypeStructure ) ;
    public final void rule__Class__VarListAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6043:1: ( ( ruleTypeStructure ) )
            // InternalMyDsl.g:6044:2: ( ruleTypeStructure )
            {
            // InternalMyDsl.g:6044:2: ( ruleTypeStructure )
            // InternalMyDsl.g:6045:3: ruleTypeStructure
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
    // InternalMyDsl.g:6054:1: rule__Class__WhereAssignment_5 : ( ruleWhere ) ;
    public final void rule__Class__WhereAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6058:1: ( ( ruleWhere ) )
            // InternalMyDsl.g:6059:2: ( ruleWhere )
            {
            // InternalMyDsl.g:6059:2: ( ruleWhere )
            // InternalMyDsl.g:6060:3: ruleWhere
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


    // $ANTLR start "rule__Class__BodyElementsAssignment_8"
    // InternalMyDsl.g:6069:1: rule__Class__BodyElementsAssignment_8 : ( ruleTypeBodyElements ) ;
    public final void rule__Class__BodyElementsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6073:1: ( ( ruleTypeBodyElements ) )
            // InternalMyDsl.g:6074:2: ( ruleTypeBodyElements )
            {
            // InternalMyDsl.g:6074:2: ( ruleTypeBodyElements )
            // InternalMyDsl.g:6075:3: ruleTypeBodyElements
            {
             before(grammarAccess.getClassAccess().getBodyElementsTypeBodyElementsParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleTypeBodyElements();

            state._fsp--;

             after(grammarAccess.getClassAccess().getBodyElementsTypeBodyElementsParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__BodyElementsAssignment_8"


    // $ANTLR start "rule__TypeName__NameAssignment"
    // InternalMyDsl.g:6084:1: rule__TypeName__NameAssignment : ( RULE_ID ) ;
    public final void rule__TypeName__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6088:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:6089:2: ( RULE_ID )
            {
            // InternalMyDsl.g:6089:2: ( RULE_ID )
            // InternalMyDsl.g:6090:3: RULE_ID
            {
             before(grammarAccess.getTypeNameAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTypeNameAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeName__NameAssignment"


    // $ANTLR start "rule__PolymorphicTypeName__NameAssignment"
    // InternalMyDsl.g:6099:1: rule__PolymorphicTypeName__NameAssignment : ( RULE_ID ) ;
    public final void rule__PolymorphicTypeName__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6103:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:6104:2: ( RULE_ID )
            {
            // InternalMyDsl.g:6104:2: ( RULE_ID )
            // InternalMyDsl.g:6105:3: RULE_ID
            {
             before(grammarAccess.getPolymorphicTypeNameAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPolymorphicTypeNameAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PolymorphicTypeName__NameAssignment"


    // $ANTLR start "rule__PolyContext__PolyTypesAssignment_1"
    // InternalMyDsl.g:6114:1: rule__PolyContext__PolyTypesAssignment_1 : ( rulePolyContextTypes ) ;
    public final void rule__PolyContext__PolyTypesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6118:1: ( ( rulePolyContextTypes ) )
            // InternalMyDsl.g:6119:2: ( rulePolyContextTypes )
            {
            // InternalMyDsl.g:6119:2: ( rulePolyContextTypes )
            // InternalMyDsl.g:6120:3: rulePolyContextTypes
            {
             before(grammarAccess.getPolyContextAccess().getPolyTypesPolyContextTypesParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePolyContextTypes();

            state._fsp--;

             after(grammarAccess.getPolyContextAccess().getPolyTypesPolyContextTypesParserRuleCall_1_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__PolyContextTypes__NameAssignment_0"
    // InternalMyDsl.g:6129:1: rule__PolyContextTypes__NameAssignment_0 : ( rulePolymorphicTypeName ) ;
    public final void rule__PolyContextTypes__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6133:1: ( ( rulePolymorphicTypeName ) )
            // InternalMyDsl.g:6134:2: ( rulePolymorphicTypeName )
            {
            // InternalMyDsl.g:6134:2: ( rulePolymorphicTypeName )
            // InternalMyDsl.g:6135:3: rulePolymorphicTypeName
            {
             before(grammarAccess.getPolyContextTypesAccess().getNamePolymorphicTypeNameParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            rulePolymorphicTypeName();

            state._fsp--;

             after(grammarAccess.getPolyContextTypesAccess().getNamePolymorphicTypeNameParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PolyContextTypes__NameAssignment_0"


    // $ANTLR start "rule__PolyContextTypes__ConstraintsAssignment_1"
    // InternalMyDsl.g:6144:1: rule__PolyContextTypes__ConstraintsAssignment_1 : ( rulePolyTypeConstraints ) ;
    public final void rule__PolyContextTypes__ConstraintsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6148:1: ( ( rulePolyTypeConstraints ) )
            // InternalMyDsl.g:6149:2: ( rulePolyTypeConstraints )
            {
            // InternalMyDsl.g:6149:2: ( rulePolyTypeConstraints )
            // InternalMyDsl.g:6150:3: rulePolyTypeConstraints
            {
             before(grammarAccess.getPolyContextTypesAccess().getConstraintsPolyTypeConstraintsParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePolyTypeConstraints();

            state._fsp--;

             after(grammarAccess.getPolyContextTypesAccess().getConstraintsPolyTypeConstraintsParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PolyContextTypes__ConstraintsAssignment_1"


    // $ANTLR start "rule__PolyTypeConstraints__TypeNameAssignment_1"
    // InternalMyDsl.g:6159:1: rule__PolyTypeConstraints__TypeNameAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__PolyTypeConstraints__TypeNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6163:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:6164:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:6164:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:6165:3: ( RULE_ID )
            {
             before(grammarAccess.getPolyTypeConstraintsAccess().getTypeNameTypeNameCrossReference_1_0()); 
            // InternalMyDsl.g:6166:3: ( RULE_ID )
            // InternalMyDsl.g:6167:4: RULE_ID
            {
             before(grammarAccess.getPolyTypeConstraintsAccess().getTypeNameTypeNameIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPolyTypeConstraintsAccess().getTypeNameTypeNameIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getPolyTypeConstraintsAccess().getTypeNameTypeNameCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PolyTypeConstraints__TypeNameAssignment_1"


    // $ANTLR start "rule__PolyTypeConstraints__TypeNameAssignment_2_1"
    // InternalMyDsl.g:6178:1: rule__PolyTypeConstraints__TypeNameAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__PolyTypeConstraints__TypeNameAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6182:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:6183:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:6183:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:6184:3: ( RULE_ID )
            {
             before(grammarAccess.getPolyTypeConstraintsAccess().getTypeNameTypeNameCrossReference_2_1_0()); 
            // InternalMyDsl.g:6185:3: ( RULE_ID )
            // InternalMyDsl.g:6186:4: RULE_ID
            {
             before(grammarAccess.getPolyTypeConstraintsAccess().getTypeNameTypeNameIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPolyTypeConstraintsAccess().getTypeNameTypeNameIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getPolyTypeConstraintsAccess().getTypeNameTypeNameCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PolyTypeConstraints__TypeNameAssignment_2_1"


    // $ANTLR start "rule__SuperTypeList__SuperTypeAssignment_1"
    // InternalMyDsl.g:6197:1: rule__SuperTypeList__SuperTypeAssignment_1 : ( ruleConstructedType ) ;
    public final void rule__SuperTypeList__SuperTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6201:1: ( ( ruleConstructedType ) )
            // InternalMyDsl.g:6202:2: ( ruleConstructedType )
            {
            // InternalMyDsl.g:6202:2: ( ruleConstructedType )
            // InternalMyDsl.g:6203:3: ruleConstructedType
            {
             before(grammarAccess.getSuperTypeListAccess().getSuperTypeConstructedTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleConstructedType();

            state._fsp--;

             after(grammarAccess.getSuperTypeListAccess().getSuperTypeConstructedTypeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SuperTypeList__SuperTypeAssignment_1"


    // $ANTLR start "rule__SuperTypeList__SuperTypeAssignment_2_1"
    // InternalMyDsl.g:6212:1: rule__SuperTypeList__SuperTypeAssignment_2_1 : ( ruleConstructedType ) ;
    public final void rule__SuperTypeList__SuperTypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6216:1: ( ( ruleConstructedType ) )
            // InternalMyDsl.g:6217:2: ( ruleConstructedType )
            {
            // InternalMyDsl.g:6217:2: ( ruleConstructedType )
            // InternalMyDsl.g:6218:3: ruleConstructedType
            {
             before(grammarAccess.getSuperTypeListAccess().getSuperTypeConstructedTypeParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleConstructedType();

            state._fsp--;

             after(grammarAccess.getSuperTypeListAccess().getSuperTypeConstructedTypeParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SuperTypeList__SuperTypeAssignment_2_1"


    // $ANTLR start "rule__ConstructedType__TypeAssignment_0"
    // InternalMyDsl.g:6227:1: rule__ConstructedType__TypeAssignment_0 : ( ruleTypeConstructor ) ;
    public final void rule__ConstructedType__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6231:1: ( ( ruleTypeConstructor ) )
            // InternalMyDsl.g:6232:2: ( ruleTypeConstructor )
            {
            // InternalMyDsl.g:6232:2: ( ruleTypeConstructor )
            // InternalMyDsl.g:6233:3: ruleTypeConstructor
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


    // $ANTLR start "rule__ConstructedType__TypeAssignment_1_1"
    // InternalMyDsl.g:6242:1: rule__ConstructedType__TypeAssignment_1_1 : ( ruleConstructedType ) ;
    public final void rule__ConstructedType__TypeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6246:1: ( ( ruleConstructedType ) )
            // InternalMyDsl.g:6247:2: ( ruleConstructedType )
            {
            // InternalMyDsl.g:6247:2: ( ruleConstructedType )
            // InternalMyDsl.g:6248:3: ruleConstructedType
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


    // $ANTLR start "rule__TypeConstructor__TypeNameAssignment_0_0"
    // InternalMyDsl.g:6257:1: rule__TypeConstructor__TypeNameAssignment_0_0 : ( ( RULE_ID ) ) ;
    public final void rule__TypeConstructor__TypeNameAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6261:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:6262:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:6262:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:6263:3: ( RULE_ID )
            {
             before(grammarAccess.getTypeConstructorAccess().getTypeNameGenNameCrossReference_0_0_0()); 
            // InternalMyDsl.g:6264:3: ( RULE_ID )
            // InternalMyDsl.g:6265:4: RULE_ID
            {
             before(grammarAccess.getTypeConstructorAccess().getTypeNameGenNameIDTerminalRuleCall_0_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTypeConstructorAccess().getTypeNameGenNameIDTerminalRuleCall_0_0_0_1()); 

            }

             after(grammarAccess.getTypeConstructorAccess().getTypeNameGenNameCrossReference_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeConstructor__TypeNameAssignment_0_0"


    // $ANTLR start "rule__TypeConstructor__ContextAssignment_1"
    // InternalMyDsl.g:6276:1: rule__TypeConstructor__ContextAssignment_1 : ( ruleTypeDeclContext ) ;
    public final void rule__TypeConstructor__ContextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6280:1: ( ( ruleTypeDeclContext ) )
            // InternalMyDsl.g:6281:2: ( ruleTypeDeclContext )
            {
            // InternalMyDsl.g:6281:2: ( ruleTypeDeclContext )
            // InternalMyDsl.g:6282:3: ruleTypeDeclContext
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
    // InternalMyDsl.g:6291:1: rule__TypeDeclContext__TypeNameAssignment_1 : ( ruleConstructedType ) ;
    public final void rule__TypeDeclContext__TypeNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6295:1: ( ( ruleConstructedType ) )
            // InternalMyDsl.g:6296:2: ( ruleConstructedType )
            {
            // InternalMyDsl.g:6296:2: ( ruleConstructedType )
            // InternalMyDsl.g:6297:3: ruleConstructedType
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
    // InternalMyDsl.g:6306:1: rule__TypeDeclContext__TypeNameAssignment_2_1 : ( ruleConstructedType ) ;
    public final void rule__TypeDeclContext__TypeNameAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6310:1: ( ( ruleConstructedType ) )
            // InternalMyDsl.g:6311:2: ( ruleConstructedType )
            {
            // InternalMyDsl.g:6311:2: ( ruleConstructedType )
            // InternalMyDsl.g:6312:3: ruleConstructedType
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
    // InternalMyDsl.g:6321:1: rule__TypeStructure__VariablesAssignment_1 : ( ruleTypedVariableList ) ;
    public final void rule__TypeStructure__VariablesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6325:1: ( ( ruleTypedVariableList ) )
            // InternalMyDsl.g:6326:2: ( ruleTypedVariableList )
            {
            // InternalMyDsl.g:6326:2: ( ruleTypedVariableList )
            // InternalMyDsl.g:6327:3: ruleTypedVariableList
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
    // InternalMyDsl.g:6336:1: rule__Where__ExpessionsAssignment_1 : ( ruleQuantifier ) ;
    public final void rule__Where__ExpessionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6340:1: ( ( ruleQuantifier ) )
            // InternalMyDsl.g:6341:2: ( ruleQuantifier )
            {
            // InternalMyDsl.g:6341:2: ( ruleQuantifier )
            // InternalMyDsl.g:6342:3: ruleQuantifier
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
    // InternalMyDsl.g:6351:1: rule__Where__ExpressionsAssignment_2_1 : ( ruleRootExpression ) ;
    public final void rule__Where__ExpressionsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6355:1: ( ( ruleRootExpression ) )
            // InternalMyDsl.g:6356:2: ( ruleRootExpression )
            {
            // InternalMyDsl.g:6356:2: ( ruleRootExpression )
            // InternalMyDsl.g:6357:3: ruleRootExpression
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


    // $ANTLR start "rule__Datatype__TypeNameAssignment_1"
    // InternalMyDsl.g:6366:1: rule__Datatype__TypeNameAssignment_1 : ( ruleTypeName ) ;
    public final void rule__Datatype__TypeNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6370:1: ( ( ruleTypeName ) )
            // InternalMyDsl.g:6371:2: ( ruleTypeName )
            {
            // InternalMyDsl.g:6371:2: ( ruleTypeName )
            // InternalMyDsl.g:6372:3: ruleTypeName
            {
             before(grammarAccess.getDatatypeAccess().getTypeNameTypeNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTypeName();

            state._fsp--;

             after(grammarAccess.getDatatypeAccess().getTypeNameTypeNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Datatype__TypeNameAssignment_1"


    // $ANTLR start "rule__Datatype__ContextAssignment_2"
    // InternalMyDsl.g:6381:1: rule__Datatype__ContextAssignment_2 : ( rulePolyContext ) ;
    public final void rule__Datatype__ContextAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6385:1: ( ( rulePolyContext ) )
            // InternalMyDsl.g:6386:2: ( rulePolyContext )
            {
            // InternalMyDsl.g:6386:2: ( rulePolyContext )
            // InternalMyDsl.g:6387:3: rulePolyContext
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


    // $ANTLR start "rule__Datatype__VarListAssignment_3_1"
    // InternalMyDsl.g:6396:1: rule__Datatype__VarListAssignment_3_1 : ( ruleDatatypeConstructor ) ;
    public final void rule__Datatype__VarListAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6400:1: ( ( ruleDatatypeConstructor ) )
            // InternalMyDsl.g:6401:2: ( ruleDatatypeConstructor )
            {
            // InternalMyDsl.g:6401:2: ( ruleDatatypeConstructor )
            // InternalMyDsl.g:6402:3: ruleDatatypeConstructor
            {
             before(grammarAccess.getDatatypeAccess().getVarListDatatypeConstructorParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDatatypeConstructor();

            state._fsp--;

             after(grammarAccess.getDatatypeAccess().getVarListDatatypeConstructorParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Datatype__VarListAssignment_3_1"


    // $ANTLR start "rule__Datatype__BodyElementsAssignment_5"
    // InternalMyDsl.g:6411:1: rule__Datatype__BodyElementsAssignment_5 : ( ruleTypeBodyElements ) ;
    public final void rule__Datatype__BodyElementsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6415:1: ( ( ruleTypeBodyElements ) )
            // InternalMyDsl.g:6416:2: ( ruleTypeBodyElements )
            {
            // InternalMyDsl.g:6416:2: ( ruleTypeBodyElements )
            // InternalMyDsl.g:6417:3: ruleTypeBodyElements
            {
             before(grammarAccess.getDatatypeAccess().getBodyElementsTypeBodyElementsParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleTypeBodyElements();

            state._fsp--;

             after(grammarAccess.getDatatypeAccess().getBodyElementsTypeBodyElementsParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Datatype__BodyElementsAssignment_5"


    // $ANTLR start "rule__DatatypeConstructor__NameAssignment_0"
    // InternalMyDsl.g:6426:1: rule__DatatypeConstructor__NameAssignment_0 : ( ruleTypedVariable ) ;
    public final void rule__DatatypeConstructor__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6430:1: ( ( ruleTypedVariable ) )
            // InternalMyDsl.g:6431:2: ( ruleTypedVariable )
            {
            // InternalMyDsl.g:6431:2: ( ruleTypedVariable )
            // InternalMyDsl.g:6432:3: ruleTypedVariable
            {
             before(grammarAccess.getDatatypeConstructorAccess().getNameTypedVariableParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTypedVariable();

            state._fsp--;

             after(grammarAccess.getDatatypeConstructorAccess().getNameTypedVariableParserRuleCall_0_0()); 

            }


            }

        }
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
    // InternalMyDsl.g:6441:1: rule__DatatypeConstructor__DeconsAssignment_1_1 : ( ruleTypedVariableList ) ;
    public final void rule__DatatypeConstructor__DeconsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6445:1: ( ( ruleTypedVariableList ) )
            // InternalMyDsl.g:6446:2: ( ruleTypedVariableList )
            {
            // InternalMyDsl.g:6446:2: ( ruleTypedVariableList )
            // InternalMyDsl.g:6447:3: ruleTypedVariableList
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


    // $ANTLR start "rule__Extend__NameAssignment_1"
    // InternalMyDsl.g:6456:1: rule__Extend__NameAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Extend__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6460:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:6461:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:6461:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:6462:3: ( RULE_ID )
            {
             before(grammarAccess.getExtendAccess().getNameTypeNameCrossReference_1_0()); 
            // InternalMyDsl.g:6463:3: ( RULE_ID )
            // InternalMyDsl.g:6464:4: RULE_ID
            {
             before(grammarAccess.getExtendAccess().getNameTypeNameIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getExtendAccess().getNameTypeNameIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getExtendAccess().getNameTypeNameCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extend__NameAssignment_1"


    // $ANTLR start "rule__Extend__ExtensionAssignment_3"
    // InternalMyDsl.g:6475:1: rule__Extend__ExtensionAssignment_3 : ( RULE_ID ) ;
    public final void rule__Extend__ExtensionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6479:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:6480:2: ( RULE_ID )
            {
            // InternalMyDsl.g:6480:2: ( RULE_ID )
            // InternalMyDsl.g:6481:3: RULE_ID
            {
             before(grammarAccess.getExtendAccess().getExtensionIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getExtendAccess().getExtensionIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extend__ExtensionAssignment_3"


    // $ANTLR start "rule__Extend__BodyElementsAssignment_6"
    // InternalMyDsl.g:6490:1: rule__Extend__BodyElementsAssignment_6 : ( ruleTypeBodyElements ) ;
    public final void rule__Extend__BodyElementsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6494:1: ( ( ruleTypeBodyElements ) )
            // InternalMyDsl.g:6495:2: ( ruleTypeBodyElements )
            {
            // InternalMyDsl.g:6495:2: ( ruleTypeBodyElements )
            // InternalMyDsl.g:6496:3: ruleTypeBodyElements
            {
             before(grammarAccess.getExtendAccess().getBodyElementsTypeBodyElementsParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleTypeBodyElements();

            state._fsp--;

             after(grammarAccess.getExtendAccess().getBodyElementsTypeBodyElementsParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extend__BodyElementsAssignment_6"


    // $ANTLR start "rule__TypeBodyElements__FunctionsAssignment_0"
    // InternalMyDsl.g:6505:1: rule__TypeBodyElements__FunctionsAssignment_0 : ( ruleFunctionDecl ) ;
    public final void rule__TypeBodyElements__FunctionsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6509:1: ( ( ruleFunctionDecl ) )
            // InternalMyDsl.g:6510:2: ( ruleFunctionDecl )
            {
            // InternalMyDsl.g:6510:2: ( ruleFunctionDecl )
            // InternalMyDsl.g:6511:3: ruleFunctionDecl
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
    // InternalMyDsl.g:6520:1: rule__TypeBodyElements__TheoremsAssignment_1 : ( ruleTheoremBody ) ;
    public final void rule__TypeBodyElements__TheoremsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6524:1: ( ( ruleTheoremBody ) )
            // InternalMyDsl.g:6525:2: ( ruleTheoremBody )
            {
            // InternalMyDsl.g:6525:2: ( ruleTheoremBody )
            // InternalMyDsl.g:6526:3: ruleTheoremBody
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
    // InternalMyDsl.g:6535:1: rule__FunctionDecl__NameAssignment_0 : ( ruleFunctionName ) ;
    public final void rule__FunctionDecl__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6539:1: ( ( ruleFunctionName ) )
            // InternalMyDsl.g:6540:2: ( ruleFunctionName )
            {
            // InternalMyDsl.g:6540:2: ( ruleFunctionName )
            // InternalMyDsl.g:6541:3: ruleFunctionName
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
    // InternalMyDsl.g:6550:1: rule__FunctionDecl__ContextAssignment_1 : ( rulePolyContext ) ;
    public final void rule__FunctionDecl__ContextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6554:1: ( ( rulePolyContext ) )
            // InternalMyDsl.g:6555:2: ( rulePolyContext )
            {
            // InternalMyDsl.g:6555:2: ( rulePolyContext )
            // InternalMyDsl.g:6556:3: rulePolyContext
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
    // InternalMyDsl.g:6565:1: rule__FunctionDecl__VarListAssignment_3 : ( ruleTypedVariableList ) ;
    public final void rule__FunctionDecl__VarListAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6569:1: ( ( ruleTypedVariableList ) )
            // InternalMyDsl.g:6570:2: ( ruleTypedVariableList )
            {
            // InternalMyDsl.g:6570:2: ( ruleTypedVariableList )
            // InternalMyDsl.g:6571:3: ruleTypedVariableList
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
    // InternalMyDsl.g:6580:1: rule__FunctionDecl__ReturnTypeAssignment_6 : ( ruleTypeConstructor ) ;
    public final void rule__FunctionDecl__ReturnTypeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6584:1: ( ( ruleTypeConstructor ) )
            // InternalMyDsl.g:6585:2: ( ruleTypeConstructor )
            {
            // InternalMyDsl.g:6585:2: ( ruleTypeConstructor )
            // InternalMyDsl.g:6586:3: ruleTypeConstructor
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
    // InternalMyDsl.g:6595:1: rule__FunctionDecl__InfixAssignment_7 : ( ( 'INFIX' ) ) ;
    public final void rule__FunctionDecl__InfixAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6599:1: ( ( ( 'INFIX' ) ) )
            // InternalMyDsl.g:6600:2: ( ( 'INFIX' ) )
            {
            // InternalMyDsl.g:6600:2: ( ( 'INFIX' ) )
            // InternalMyDsl.g:6601:3: ( 'INFIX' )
            {
             before(grammarAccess.getFunctionDeclAccess().getInfixINFIXKeyword_7_0()); 
            // InternalMyDsl.g:6602:3: ( 'INFIX' )
            // InternalMyDsl.g:6603:4: 'INFIX'
            {
             before(grammarAccess.getFunctionDeclAccess().getInfixINFIXKeyword_7_0()); 
            match(input,52,FOLLOW_2); 
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
    // InternalMyDsl.g:6614:1: rule__FunctionDecl__PrecedenceAssignment_8 : ( RULE_INT ) ;
    public final void rule__FunctionDecl__PrecedenceAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6618:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:6619:2: ( RULE_INT )
            {
            // InternalMyDsl.g:6619:2: ( RULE_INT )
            // InternalMyDsl.g:6620:3: RULE_INT
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


    // $ANTLR start "rule__FunctionDecl__BodyAssignment_9"
    // InternalMyDsl.g:6629:1: rule__FunctionDecl__BodyAssignment_9 : ( ruleFunctionBody ) ;
    public final void rule__FunctionDecl__BodyAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6633:1: ( ( ruleFunctionBody ) )
            // InternalMyDsl.g:6634:2: ( ruleFunctionBody )
            {
            // InternalMyDsl.g:6634:2: ( ruleFunctionBody )
            // InternalMyDsl.g:6635:3: ruleFunctionBody
            {
             before(grammarAccess.getFunctionDeclAccess().getBodyFunctionBodyParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleFunctionBody();

            state._fsp--;

             after(grammarAccess.getFunctionDeclAccess().getBodyFunctionBodyParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDecl__BodyAssignment_9"


    // $ANTLR start "rule__FunctionName__NameAssignment"
    // InternalMyDsl.g:6644:1: rule__FunctionName__NameAssignment : ( RULE_ID ) ;
    public final void rule__FunctionName__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6648:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:6649:2: ( RULE_ID )
            {
            // InternalMyDsl.g:6649:2: ( RULE_ID )
            // InternalMyDsl.g:6650:3: RULE_ID
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


    // $ANTLR start "rule__FuncDirectDef__ExpressionAssignment"
    // InternalMyDsl.g:6659:1: rule__FuncDirectDef__ExpressionAssignment : ( ruleRootExpression ) ;
    public final void rule__FuncDirectDef__ExpressionAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6663:1: ( ( ruleRootExpression ) )
            // InternalMyDsl.g:6664:2: ( ruleRootExpression )
            {
            // InternalMyDsl.g:6664:2: ( ruleRootExpression )
            // InternalMyDsl.g:6665:3: ruleRootExpression
            {
             before(grammarAccess.getFuncDirectDefAccess().getExpressionRootExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleRootExpression();

            state._fsp--;

             after(grammarAccess.getFuncDirectDefAccess().getExpressionRootExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FuncDirectDef__ExpressionAssignment"


    // $ANTLR start "rule__FuncInductive__VariableNameAssignment_1"
    // InternalMyDsl.g:6674:1: rule__FuncInductive__VariableNameAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__FuncInductive__VariableNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6678:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:6679:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:6679:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:6680:3: ( RULE_ID )
            {
             before(grammarAccess.getFuncInductiveAccess().getVariableNameTypedVariableCrossReference_1_0()); 
            // InternalMyDsl.g:6681:3: ( RULE_ID )
            // InternalMyDsl.g:6682:4: RULE_ID
            {
             before(grammarAccess.getFuncInductiveAccess().getVariableNameTypedVariableIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFuncInductiveAccess().getVariableNameTypedVariableIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getFuncInductiveAccess().getVariableNameTypedVariableCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FuncInductive__VariableNameAssignment_1"


    // $ANTLR start "rule__FuncInductive__InductCaseAssignment_2"
    // InternalMyDsl.g:6693:1: rule__FuncInductive__InductCaseAssignment_2 : ( ruleFuncInductiveCase ) ;
    public final void rule__FuncInductive__InductCaseAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6697:1: ( ( ruleFuncInductiveCase ) )
            // InternalMyDsl.g:6698:2: ( ruleFuncInductiveCase )
            {
            // InternalMyDsl.g:6698:2: ( ruleFuncInductiveCase )
            // InternalMyDsl.g:6699:3: ruleFuncInductiveCase
            {
             before(grammarAccess.getFuncInductiveAccess().getInductCaseFuncInductiveCaseParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleFuncInductiveCase();

            state._fsp--;

             after(grammarAccess.getFuncInductiveAccess().getInductCaseFuncInductiveCaseParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FuncInductive__InductCaseAssignment_2"


    // $ANTLR start "rule__FuncInductive__InductCaseAssignment_3"
    // InternalMyDsl.g:6708:1: rule__FuncInductive__InductCaseAssignment_3 : ( ruleFuncInductiveCase ) ;
    public final void rule__FuncInductive__InductCaseAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6712:1: ( ( ruleFuncInductiveCase ) )
            // InternalMyDsl.g:6713:2: ( ruleFuncInductiveCase )
            {
            // InternalMyDsl.g:6713:2: ( ruleFuncInductiveCase )
            // InternalMyDsl.g:6714:3: ruleFuncInductiveCase
            {
             before(grammarAccess.getFuncInductiveAccess().getInductCaseFuncInductiveCaseParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleFuncInductiveCase();

            state._fsp--;

             after(grammarAccess.getFuncInductiveAccess().getInductCaseFuncInductiveCaseParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FuncInductive__InductCaseAssignment_3"


    // $ANTLR start "rule__FuncInductiveCase__DeconNameAssignment_1"
    // InternalMyDsl.g:6723:1: rule__FuncInductiveCase__DeconNameAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__FuncInductiveCase__DeconNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6727:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:6728:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:6728:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:6729:3: ( RULE_ID )
            {
             before(grammarAccess.getFuncInductiveCaseAccess().getDeconNameDatatypeConstructorCrossReference_1_0()); 
            // InternalMyDsl.g:6730:3: ( RULE_ID )
            // InternalMyDsl.g:6731:4: RULE_ID
            {
             before(grammarAccess.getFuncInductiveCaseAccess().getDeconNameDatatypeConstructorIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFuncInductiveCaseAccess().getDeconNameDatatypeConstructorIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getFuncInductiveCaseAccess().getDeconNameDatatypeConstructorCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FuncInductiveCase__DeconNameAssignment_1"


    // $ANTLR start "rule__FuncInductiveCase__VariablesAssignment_2_1"
    // InternalMyDsl.g:6742:1: rule__FuncInductiveCase__VariablesAssignment_2_1 : ( ruleTypedVariable ) ;
    public final void rule__FuncInductiveCase__VariablesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6746:1: ( ( ruleTypedVariable ) )
            // InternalMyDsl.g:6747:2: ( ruleTypedVariable )
            {
            // InternalMyDsl.g:6747:2: ( ruleTypedVariable )
            // InternalMyDsl.g:6748:3: ruleTypedVariable
            {
             before(grammarAccess.getFuncInductiveCaseAccess().getVariablesTypedVariableParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTypedVariable();

            state._fsp--;

             after(grammarAccess.getFuncInductiveCaseAccess().getVariablesTypedVariableParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FuncInductiveCase__VariablesAssignment_2_1"


    // $ANTLR start "rule__FuncInductiveCase__VariablesAssignment_2_2_1"
    // InternalMyDsl.g:6757:1: rule__FuncInductiveCase__VariablesAssignment_2_2_1 : ( ruleTypedVariable ) ;
    public final void rule__FuncInductiveCase__VariablesAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6761:1: ( ( ruleTypedVariable ) )
            // InternalMyDsl.g:6762:2: ( ruleTypedVariable )
            {
            // InternalMyDsl.g:6762:2: ( ruleTypedVariable )
            // InternalMyDsl.g:6763:3: ruleTypedVariable
            {
             before(grammarAccess.getFuncInductiveCaseAccess().getVariablesTypedVariableParserRuleCall_2_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTypedVariable();

            state._fsp--;

             after(grammarAccess.getFuncInductiveCaseAccess().getVariablesTypedVariableParserRuleCall_2_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FuncInductiveCase__VariablesAssignment_2_2_1"


    // $ANTLR start "rule__FuncInductiveCase__ExprAssignment_4"
    // InternalMyDsl.g:6772:1: rule__FuncInductiveCase__ExprAssignment_4 : ( ruleRootExpression ) ;
    public final void rule__FuncInductiveCase__ExprAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6776:1: ( ( ruleRootExpression ) )
            // InternalMyDsl.g:6777:2: ( ruleRootExpression )
            {
            // InternalMyDsl.g:6777:2: ( ruleRootExpression )
            // InternalMyDsl.g:6778:3: ruleRootExpression
            {
             before(grammarAccess.getFuncInductiveCaseAccess().getExprRootExpressionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleRootExpression();

            state._fsp--;

             after(grammarAccess.getFuncInductiveCaseAccess().getExprRootExpressionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FuncInductiveCase__ExprAssignment_4"


    // $ANTLR start "rule__TheoremBody__TheoremDeclAssignment_2"
    // InternalMyDsl.g:6787:1: rule__TheoremBody__TheoremDeclAssignment_2 : ( ruleTheoremDecl ) ;
    public final void rule__TheoremBody__TheoremDeclAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6791:1: ( ( ruleTheoremDecl ) )
            // InternalMyDsl.g:6792:2: ( ruleTheoremDecl )
            {
            // InternalMyDsl.g:6792:2: ( ruleTheoremDecl )
            // InternalMyDsl.g:6793:3: ruleTheoremDecl
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


    // $ANTLR start "rule__TheoremDecl__ThmNameAssignment_0"
    // InternalMyDsl.g:6802:1: rule__TheoremDecl__ThmNameAssignment_0 : ( ruleTHM_NAME ) ;
    public final void rule__TheoremDecl__ThmNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6806:1: ( ( ruleTHM_NAME ) )
            // InternalMyDsl.g:6807:2: ( ruleTHM_NAME )
            {
            // InternalMyDsl.g:6807:2: ( ruleTHM_NAME )
            // InternalMyDsl.g:6808:3: ruleTHM_NAME
            {
             before(grammarAccess.getTheoremDeclAccess().getThmNameTHM_NAMEParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTHM_NAME();

            state._fsp--;

             after(grammarAccess.getTheoremDeclAccess().getThmNameTHM_NAMEParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TheoremDecl__ThmNameAssignment_0"


    // $ANTLR start "rule__TheoremDecl__ExprAssignment_1"
    // InternalMyDsl.g:6817:1: rule__TheoremDecl__ExprAssignment_1 : ( ruleRootExpression ) ;
    public final void rule__TheoremDecl__ExprAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6821:1: ( ( ruleRootExpression ) )
            // InternalMyDsl.g:6822:2: ( ruleRootExpression )
            {
            // InternalMyDsl.g:6822:2: ( ruleRootExpression )
            // InternalMyDsl.g:6823:3: ruleRootExpression
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
    // InternalMyDsl.g:6832:1: rule__TypedVariableList__VariablesOfTypeAssignment_0 : ( ruleVariableTyping ) ;
    public final void rule__TypedVariableList__VariablesOfTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6836:1: ( ( ruleVariableTyping ) )
            // InternalMyDsl.g:6837:2: ( ruleVariableTyping )
            {
            // InternalMyDsl.g:6837:2: ( ruleVariableTyping )
            // InternalMyDsl.g:6838:3: ruleVariableTyping
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
    // InternalMyDsl.g:6847:1: rule__TypedVariableList__VariablesOfTypeAssignment_1_1 : ( ruleVariableTyping ) ;
    public final void rule__TypedVariableList__VariablesOfTypeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6851:1: ( ( ruleVariableTyping ) )
            // InternalMyDsl.g:6852:2: ( ruleVariableTyping )
            {
            // InternalMyDsl.g:6852:2: ( ruleVariableTyping )
            // InternalMyDsl.g:6853:3: ruleVariableTyping
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
    // InternalMyDsl.g:6862:1: rule__VariableTyping__TypeVarAssignment_0 : ( ruleTypedVariable ) ;
    public final void rule__VariableTyping__TypeVarAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6866:1: ( ( ruleTypedVariable ) )
            // InternalMyDsl.g:6867:2: ( ruleTypedVariable )
            {
            // InternalMyDsl.g:6867:2: ( ruleTypedVariable )
            // InternalMyDsl.g:6868:3: ruleTypedVariable
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
    // InternalMyDsl.g:6877:1: rule__VariableTyping__TypeVarAssignment_1_1 : ( ruleTypedVariable ) ;
    public final void rule__VariableTyping__TypeVarAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6881:1: ( ( ruleTypedVariable ) )
            // InternalMyDsl.g:6882:2: ( ruleTypedVariable )
            {
            // InternalMyDsl.g:6882:2: ( ruleTypedVariable )
            // InternalMyDsl.g:6883:3: ruleTypedVariable
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
    // InternalMyDsl.g:6892:1: rule__VariableTyping__TypeAssignment_3 : ( ruleConstructedType ) ;
    public final void rule__VariableTyping__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6896:1: ( ( ruleConstructedType ) )
            // InternalMyDsl.g:6897:2: ( ruleConstructedType )
            {
            // InternalMyDsl.g:6897:2: ( ruleConstructedType )
            // InternalMyDsl.g:6898:3: ruleConstructedType
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
    // InternalMyDsl.g:6907:1: rule__TypedVariable__NameAssignment : ( RULE_ID ) ;
    public final void rule__TypedVariable__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6911:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:6912:2: ( RULE_ID )
            {
            // InternalMyDsl.g:6912:2: ( RULE_ID )
            // InternalMyDsl.g:6913:3: RULE_ID
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
    // InternalMyDsl.g:6922:1: rule__Lambda__QTypeAssignment_0 : ( ( '\\u03BB' ) ) ;
    public final void rule__Lambda__QTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6926:1: ( ( ( '\\u03BB' ) ) )
            // InternalMyDsl.g:6927:2: ( ( '\\u03BB' ) )
            {
            // InternalMyDsl.g:6927:2: ( ( '\\u03BB' ) )
            // InternalMyDsl.g:6928:3: ( '\\u03BB' )
            {
             before(grammarAccess.getLambdaAccess().getQTypeGreekSmallLetterLamdaKeyword_0_0()); 
            // InternalMyDsl.g:6929:3: ( '\\u03BB' )
            // InternalMyDsl.g:6930:4: '\\u03BB'
            {
             before(grammarAccess.getLambdaAccess().getQTypeGreekSmallLetterLamdaKeyword_0_0()); 
            match(input,53,FOLLOW_2); 
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
    // InternalMyDsl.g:6941:1: rule__Lambda__ContextAssignment_1 : ( rulePolyContext ) ;
    public final void rule__Lambda__ContextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6945:1: ( ( rulePolyContext ) )
            // InternalMyDsl.g:6946:2: ( rulePolyContext )
            {
            // InternalMyDsl.g:6946:2: ( rulePolyContext )
            // InternalMyDsl.g:6947:3: rulePolyContext
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
    // InternalMyDsl.g:6956:1: rule__Lambda__VarListAssignment_2 : ( ruleTypedVariableList ) ;
    public final void rule__Lambda__VarListAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6960:1: ( ( ruleTypedVariableList ) )
            // InternalMyDsl.g:6961:2: ( ruleTypedVariableList )
            {
            // InternalMyDsl.g:6961:2: ( ruleTypedVariableList )
            // InternalMyDsl.g:6962:3: ruleTypedVariableList
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


    // $ANTLR start "rule__Lambda__ChildAssignment_4"
    // InternalMyDsl.g:6971:1: rule__Lambda__ChildAssignment_4 : ( ruleRootExpression ) ;
    public final void rule__Lambda__ChildAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6975:1: ( ( ruleRootExpression ) )
            // InternalMyDsl.g:6976:2: ( ruleRootExpression )
            {
            // InternalMyDsl.g:6976:2: ( ruleRootExpression )
            // InternalMyDsl.g:6977:3: ruleRootExpression
            {
             before(grammarAccess.getLambdaAccess().getChildRootExpressionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleRootExpression();

            state._fsp--;

             after(grammarAccess.getLambdaAccess().getChildRootExpressionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lambda__ChildAssignment_4"


    // $ANTLR start "rule__Quantifier__QTypeAssignment_0"
    // InternalMyDsl.g:6986:1: rule__Quantifier__QTypeAssignment_0 : ( ( rule__Quantifier__QTypeAlternatives_0_0 ) ) ;
    public final void rule__Quantifier__QTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6990:1: ( ( ( rule__Quantifier__QTypeAlternatives_0_0 ) ) )
            // InternalMyDsl.g:6991:2: ( ( rule__Quantifier__QTypeAlternatives_0_0 ) )
            {
            // InternalMyDsl.g:6991:2: ( ( rule__Quantifier__QTypeAlternatives_0_0 ) )
            // InternalMyDsl.g:6992:3: ( rule__Quantifier__QTypeAlternatives_0_0 )
            {
             before(grammarAccess.getQuantifierAccess().getQTypeAlternatives_0_0()); 
            // InternalMyDsl.g:6993:3: ( rule__Quantifier__QTypeAlternatives_0_0 )
            // InternalMyDsl.g:6993:4: rule__Quantifier__QTypeAlternatives_0_0
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
    // InternalMyDsl.g:7001:1: rule__Quantifier__ContextAssignment_1 : ( rulePolyContext ) ;
    public final void rule__Quantifier__ContextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7005:1: ( ( rulePolyContext ) )
            // InternalMyDsl.g:7006:2: ( rulePolyContext )
            {
            // InternalMyDsl.g:7006:2: ( rulePolyContext )
            // InternalMyDsl.g:7007:3: rulePolyContext
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
    // InternalMyDsl.g:7016:1: rule__Quantifier__VarListAssignment_2 : ( ruleTypedVariableList ) ;
    public final void rule__Quantifier__VarListAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7020:1: ( ( ruleTypedVariableList ) )
            // InternalMyDsl.g:7021:2: ( ruleTypedVariableList )
            {
            // InternalMyDsl.g:7021:2: ( ruleTypedVariableList )
            // InternalMyDsl.g:7022:3: ruleTypedVariableList
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


    // $ANTLR start "rule__Quantifier__ChildAssignment_4"
    // InternalMyDsl.g:7031:1: rule__Quantifier__ChildAssignment_4 : ( ruleRootExpression ) ;
    public final void rule__Quantifier__ChildAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7035:1: ( ( ruleRootExpression ) )
            // InternalMyDsl.g:7036:2: ( ruleRootExpression )
            {
            // InternalMyDsl.g:7036:2: ( ruleRootExpression )
            // InternalMyDsl.g:7037:3: ruleRootExpression
            {
             before(grammarAccess.getQuantifierAccess().getChildRootExpressionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleRootExpression();

            state._fsp--;

             after(grammarAccess.getQuantifierAccess().getChildRootExpressionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quantifier__ChildAssignment_4"


    // $ANTLR start "rule__Prefix__NameAssignment_0"
    // InternalMyDsl.g:7046:1: rule__Prefix__NameAssignment_0 : ( rulePrefixBuiltIn ) ;
    public final void rule__Prefix__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7050:1: ( ( rulePrefixBuiltIn ) )
            // InternalMyDsl.g:7051:2: ( rulePrefixBuiltIn )
            {
            // InternalMyDsl.g:7051:2: ( rulePrefixBuiltIn )
            // InternalMyDsl.g:7052:3: rulePrefixBuiltIn
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
    // InternalMyDsl.g:7061:1: rule__Prefix__ElemAssignment_1 : ( ruleElement ) ;
    public final void rule__Prefix__ElemAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7065:1: ( ( ruleElement ) )
            // InternalMyDsl.g:7066:2: ( ruleElement )
            {
            // InternalMyDsl.g:7066:2: ( ruleElement )
            // InternalMyDsl.g:7067:3: ruleElement
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
    // InternalMyDsl.g:7076:1: rule__Infix__FuncNameAssignment_1_1_0 : ( ( RULE_ID ) ) ;
    public final void rule__Infix__FuncNameAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7080:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:7081:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:7081:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:7082:3: ( RULE_ID )
            {
             before(grammarAccess.getInfixAccess().getFuncNameFunctionNameCrossReference_1_1_0_0()); 
            // InternalMyDsl.g:7083:3: ( RULE_ID )
            // InternalMyDsl.g:7084:4: RULE_ID
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
    // InternalMyDsl.g:7095:1: rule__Infix__OpNameAssignment_1_1_1 : ( ruleInbuiltInfix ) ;
    public final void rule__Infix__OpNameAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7099:1: ( ( ruleInbuiltInfix ) )
            // InternalMyDsl.g:7100:2: ( ruleInbuiltInfix )
            {
            // InternalMyDsl.g:7100:2: ( ruleInbuiltInfix )
            // InternalMyDsl.g:7101:3: ruleInbuiltInfix
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
    // InternalMyDsl.g:7110:1: rule__Infix__RightAssignment_1_2 : ( ruleElement ) ;
    public final void rule__Infix__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7114:1: ( ( ruleElement ) )
            // InternalMyDsl.g:7115:2: ( ruleElement )
            {
            // InternalMyDsl.g:7115:2: ( ruleElement )
            // InternalMyDsl.g:7116:3: ruleElement
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
    // InternalMyDsl.g:7125:1: rule__Bracket__ChildAssignment_1 : ( ruleRootExpression ) ;
    public final void rule__Bracket__ChildAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7129:1: ( ( ruleRootExpression ) )
            // InternalMyDsl.g:7130:2: ( ruleRootExpression )
            {
            // InternalMyDsl.g:7130:2: ( ruleRootExpression )
            // InternalMyDsl.g:7131:3: ruleRootExpression
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


    // $ANTLR start "rule__FunctionCall__TypeInstAssignment_0"
    // InternalMyDsl.g:7140:1: rule__FunctionCall__TypeInstAssignment_0 : ( ruleTypeInstance ) ;
    public final void rule__FunctionCall__TypeInstAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7144:1: ( ( ruleTypeInstance ) )
            // InternalMyDsl.g:7145:2: ( ruleTypeInstance )
            {
            // InternalMyDsl.g:7145:2: ( ruleTypeInstance )
            // InternalMyDsl.g:7146:3: ruleTypeInstance
            {
             before(grammarAccess.getFunctionCallAccess().getTypeInstTypeInstanceParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTypeInstance();

            state._fsp--;

             after(grammarAccess.getFunctionCallAccess().getTypeInstTypeInstanceParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__TypeInstAssignment_0"


    // $ANTLR start "rule__FunctionCall__ArgumentsAssignment_1_1"
    // InternalMyDsl.g:7155:1: rule__FunctionCall__ArgumentsAssignment_1_1 : ( ruleRootExpression ) ;
    public final void rule__FunctionCall__ArgumentsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7159:1: ( ( ruleRootExpression ) )
            // InternalMyDsl.g:7160:2: ( ruleRootExpression )
            {
            // InternalMyDsl.g:7160:2: ( ruleRootExpression )
            // InternalMyDsl.g:7161:3: ruleRootExpression
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
    // InternalMyDsl.g:7170:1: rule__FunctionCall__ArgumentsAssignment_1_2_1 : ( ruleRootExpression ) ;
    public final void rule__FunctionCall__ArgumentsAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7174:1: ( ( ruleRootExpression ) )
            // InternalMyDsl.g:7175:2: ( ruleRootExpression )
            {
            // InternalMyDsl.g:7175:2: ( ruleRootExpression )
            // InternalMyDsl.g:7176:3: ruleRootExpression
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


    // $ANTLR start "rule__TypeInstance__InstanceAssignment_0"
    // InternalMyDsl.g:7185:1: rule__TypeInstance__InstanceAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__TypeInstance__InstanceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7189:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:7190:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:7190:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:7191:3: ( RULE_ID )
            {
             before(grammarAccess.getTypeInstanceAccess().getInstanceExpressionVariableCrossReference_0_0()); 
            // InternalMyDsl.g:7192:3: ( RULE_ID )
            // InternalMyDsl.g:7193:4: RULE_ID
            {
             before(grammarAccess.getTypeInstanceAccess().getInstanceExpressionVariableIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTypeInstanceAccess().getInstanceExpressionVariableIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getTypeInstanceAccess().getInstanceExpressionVariableCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeInstance__InstanceAssignment_0"


    // $ANTLR start "rule__TypeInstance__TypeNameAssignment_1_0"
    // InternalMyDsl.g:7204:1: rule__TypeInstance__TypeNameAssignment_1_0 : ( ( RULE_ID ) ) ;
    public final void rule__TypeInstance__TypeNameAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7208:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:7209:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:7209:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:7210:3: ( RULE_ID )
            {
             before(grammarAccess.getTypeInstanceAccess().getTypeNameGenNameCrossReference_1_0_0()); 
            // InternalMyDsl.g:7211:3: ( RULE_ID )
            // InternalMyDsl.g:7212:4: RULE_ID
            {
             before(grammarAccess.getTypeInstanceAccess().getTypeNameGenNameIDTerminalRuleCall_1_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTypeInstanceAccess().getTypeNameGenNameIDTerminalRuleCall_1_0_0_1()); 

            }

             after(grammarAccess.getTypeInstanceAccess().getTypeNameGenNameCrossReference_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeInstance__TypeNameAssignment_1_0"


    // $ANTLR start "rule__TypeInstance__ElementAssignment_1_1_1"
    // InternalMyDsl.g:7223:1: rule__TypeInstance__ElementAssignment_1_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__TypeInstance__ElementAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7227:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:7228:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:7228:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:7229:3: ( RULE_ID )
            {
             before(grammarAccess.getTypeInstanceAccess().getElementTypedVariableCrossReference_1_1_1_0()); 
            // InternalMyDsl.g:7230:3: ( RULE_ID )
            // InternalMyDsl.g:7231:4: RULE_ID
            {
             before(grammarAccess.getTypeInstanceAccess().getElementTypedVariableIDTerminalRuleCall_1_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTypeInstanceAccess().getElementTypedVariableIDTerminalRuleCall_1_1_1_0_1()); 

            }

             after(grammarAccess.getTypeInstanceAccess().getElementTypedVariableCrossReference_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeInstance__ElementAssignment_1_1_1"


    // $ANTLR start "rule__InbuiltTypeScan__NameAssignment"
    // InternalMyDsl.g:7242:1: rule__InbuiltTypeScan__NameAssignment : ( ruleInbuiltType ) ;
    public final void rule__InbuiltTypeScan__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7246:1: ( ( ruleInbuiltType ) )
            // InternalMyDsl.g:7247:2: ( ruleInbuiltType )
            {
            // InternalMyDsl.g:7247:2: ( ruleInbuiltType )
            // InternalMyDsl.g:7248:3: ruleInbuiltType
            {
             before(grammarAccess.getInbuiltTypeScanAccess().getNameInbuiltTypeParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleInbuiltType();

            state._fsp--;

             after(grammarAccess.getInbuiltTypeScanAccess().getNameInbuiltTypeParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InbuiltTypeScan__NameAssignment"


    // $ANTLR start "rule__Instance__ClassNameAssignment_1"
    // InternalMyDsl.g:7257:1: rule__Instance__ClassNameAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Instance__ClassNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7261:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:7262:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:7262:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:7263:3: ( RULE_ID )
            {
             before(grammarAccess.getInstanceAccess().getClassNameTypeNameCrossReference_1_0()); 
            // InternalMyDsl.g:7264:3: ( RULE_ID )
            // InternalMyDsl.g:7265:4: RULE_ID
            {
             before(grammarAccess.getInstanceAccess().getClassNameTypeNameIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInstanceAccess().getClassNameTypeNameIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getInstanceAccess().getClassNameTypeNameCrossReference_1_0()); 

            }


            }

        }
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
    // InternalMyDsl.g:7276:1: rule__Instance__ContextAssignment_2 : ( ruleTypeDeclContext ) ;
    public final void rule__Instance__ContextAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7280:1: ( ( ruleTypeDeclContext ) )
            // InternalMyDsl.g:7281:2: ( ruleTypeDeclContext )
            {
            // InternalMyDsl.g:7281:2: ( ruleTypeDeclContext )
            // InternalMyDsl.g:7282:3: ruleTypeDeclContext
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
    // InternalMyDsl.g:7291:1: rule__Instance__ArgumentsAssignment_4 : ( ruleRootExpression ) ;
    public final void rule__Instance__ArgumentsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7295:1: ( ( ruleRootExpression ) )
            // InternalMyDsl.g:7296:2: ( ruleRootExpression )
            {
            // InternalMyDsl.g:7296:2: ( ruleRootExpression )
            // InternalMyDsl.g:7297:3: ruleRootExpression
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
    // InternalMyDsl.g:7306:1: rule__Instance__ArgumentsAssignment_5_1 : ( ruleRootExpression ) ;
    public final void rule__Instance__ArgumentsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7310:1: ( ( ruleRootExpression ) )
            // InternalMyDsl.g:7311:2: ( ruleRootExpression )
            {
            // InternalMyDsl.g:7311:2: ( ruleRootExpression )
            // InternalMyDsl.g:7312:3: ruleRootExpression
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0008A00A00000002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000014B100000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0002004000000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0002000000000012L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00000000007FE000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000030000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0020040001800810L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000408000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000408000000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000048000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000080000000010L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0031040001800830L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000040100000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x00000A0000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000180000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000020100000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000008000000010L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x000000007E000010L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x000000007E000012L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x00200E0001800810L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000400000002L});

}