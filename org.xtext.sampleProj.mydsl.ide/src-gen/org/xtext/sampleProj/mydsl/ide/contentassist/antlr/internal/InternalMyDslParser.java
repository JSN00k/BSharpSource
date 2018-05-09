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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_WS", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ANY_OTHER", "'\\u00AC'", "'\\u00D7'", "'\\u2192'", "'\\uE102'", "'\\uE100'", "'\\u2194'", "'\\u2916'", "'\\u21F8'", "'\\u21A3'", "'\\u2900'", "'\\u21A0'", "'\\u2200'", "'\\u2203'", "':'", "'Import'", "'.'", "'Class'", "';'", "'{'", "'}'", "'<'", "'>'", "','", "'('", "')'", "'where'", "'Datatype'", "'|'", "'match'", "'Theorems'", "'\\u03BB'", "'\\u00B7'"
    };
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=5;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__20=20;
    public static final int T__42=42;
    public static final int T__21=21;

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

                if ( (LA1_0==RULE_ID||LA1_0==25||LA1_0==27||LA1_0==37) ) {
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


    // $ANTLR start "entryRuleBaseConstructor"
    // InternalMyDsl.g:578:1: entryRuleBaseConstructor : ruleBaseConstructor EOF ;
    public final void entryRuleBaseConstructor() throws RecognitionException {
        try {
            // InternalMyDsl.g:579:1: ( ruleBaseConstructor EOF )
            // InternalMyDsl.g:580:1: ruleBaseConstructor EOF
            {
             before(grammarAccess.getBaseConstructorRule()); 
            pushFollow(FOLLOW_1);
            ruleBaseConstructor();

            state._fsp--;

             after(grammarAccess.getBaseConstructorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBaseConstructor"


    // $ANTLR start "ruleBaseConstructor"
    // InternalMyDsl.g:587:1: ruleBaseConstructor : ( ( rule__BaseConstructor__NameAssignment ) ) ;
    public final void ruleBaseConstructor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:591:2: ( ( ( rule__BaseConstructor__NameAssignment ) ) )
            // InternalMyDsl.g:592:2: ( ( rule__BaseConstructor__NameAssignment ) )
            {
            // InternalMyDsl.g:592:2: ( ( rule__BaseConstructor__NameAssignment ) )
            // InternalMyDsl.g:593:3: ( rule__BaseConstructor__NameAssignment )
            {
             before(grammarAccess.getBaseConstructorAccess().getNameAssignment()); 
            // InternalMyDsl.g:594:3: ( rule__BaseConstructor__NameAssignment )
            // InternalMyDsl.g:594:4: rule__BaseConstructor__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__BaseConstructor__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getBaseConstructorAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBaseConstructor"


    // $ANTLR start "entryRuleDTypeConstructor"
    // InternalMyDsl.g:603:1: entryRuleDTypeConstructor : ruleDTypeConstructor EOF ;
    public final void entryRuleDTypeConstructor() throws RecognitionException {
        try {
            // InternalMyDsl.g:604:1: ( ruleDTypeConstructor EOF )
            // InternalMyDsl.g:605:1: ruleDTypeConstructor EOF
            {
             before(grammarAccess.getDTypeConstructorRule()); 
            pushFollow(FOLLOW_1);
            ruleDTypeConstructor();

            state._fsp--;

             after(grammarAccess.getDTypeConstructorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDTypeConstructor"


    // $ANTLR start "ruleDTypeConstructor"
    // InternalMyDsl.g:612:1: ruleDTypeConstructor : ( ( rule__DTypeConstructor__Group__0 ) ) ;
    public final void ruleDTypeConstructor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:616:2: ( ( ( rule__DTypeConstructor__Group__0 ) ) )
            // InternalMyDsl.g:617:2: ( ( rule__DTypeConstructor__Group__0 ) )
            {
            // InternalMyDsl.g:617:2: ( ( rule__DTypeConstructor__Group__0 ) )
            // InternalMyDsl.g:618:3: ( rule__DTypeConstructor__Group__0 )
            {
             before(grammarAccess.getDTypeConstructorAccess().getGroup()); 
            // InternalMyDsl.g:619:3: ( rule__DTypeConstructor__Group__0 )
            // InternalMyDsl.g:619:4: rule__DTypeConstructor__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DTypeConstructor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDTypeConstructorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDTypeConstructor"


    // $ANTLR start "entryRuleExtend"
    // InternalMyDsl.g:628:1: entryRuleExtend : ruleExtend EOF ;
    public final void entryRuleExtend() throws RecognitionException {
        try {
            // InternalMyDsl.g:629:1: ( ruleExtend EOF )
            // InternalMyDsl.g:630:1: ruleExtend EOF
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
    // InternalMyDsl.g:637:1: ruleExtend : ( ( rule__Extend__Group__0 ) ) ;
    public final void ruleExtend() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:641:2: ( ( ( rule__Extend__Group__0 ) ) )
            // InternalMyDsl.g:642:2: ( ( rule__Extend__Group__0 ) )
            {
            // InternalMyDsl.g:642:2: ( ( rule__Extend__Group__0 ) )
            // InternalMyDsl.g:643:3: ( rule__Extend__Group__0 )
            {
             before(grammarAccess.getExtendAccess().getGroup()); 
            // InternalMyDsl.g:644:3: ( rule__Extend__Group__0 )
            // InternalMyDsl.g:644:4: rule__Extend__Group__0
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
    // InternalMyDsl.g:653:1: entryRuleTypeBodyElements : ruleTypeBodyElements EOF ;
    public final void entryRuleTypeBodyElements() throws RecognitionException {
        try {
            // InternalMyDsl.g:654:1: ( ruleTypeBodyElements EOF )
            // InternalMyDsl.g:655:1: ruleTypeBodyElements EOF
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
    // InternalMyDsl.g:662:1: ruleTypeBodyElements : ( ( rule__TypeBodyElements__Alternatives ) ) ;
    public final void ruleTypeBodyElements() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:666:2: ( ( ( rule__TypeBodyElements__Alternatives ) ) )
            // InternalMyDsl.g:667:2: ( ( rule__TypeBodyElements__Alternatives ) )
            {
            // InternalMyDsl.g:667:2: ( ( rule__TypeBodyElements__Alternatives ) )
            // InternalMyDsl.g:668:3: ( rule__TypeBodyElements__Alternatives )
            {
             before(grammarAccess.getTypeBodyElementsAccess().getAlternatives()); 
            // InternalMyDsl.g:669:3: ( rule__TypeBodyElements__Alternatives )
            // InternalMyDsl.g:669:4: rule__TypeBodyElements__Alternatives
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
    // InternalMyDsl.g:678:1: entryRuleFunctionDecl : ruleFunctionDecl EOF ;
    public final void entryRuleFunctionDecl() throws RecognitionException {
        try {
            // InternalMyDsl.g:679:1: ( ruleFunctionDecl EOF )
            // InternalMyDsl.g:680:1: ruleFunctionDecl EOF
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
    // InternalMyDsl.g:687:1: ruleFunctionDecl : ( ( rule__FunctionDecl__Group__0 ) ) ;
    public final void ruleFunctionDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:691:2: ( ( ( rule__FunctionDecl__Group__0 ) ) )
            // InternalMyDsl.g:692:2: ( ( rule__FunctionDecl__Group__0 ) )
            {
            // InternalMyDsl.g:692:2: ( ( rule__FunctionDecl__Group__0 ) )
            // InternalMyDsl.g:693:3: ( rule__FunctionDecl__Group__0 )
            {
             before(grammarAccess.getFunctionDeclAccess().getGroup()); 
            // InternalMyDsl.g:694:3: ( rule__FunctionDecl__Group__0 )
            // InternalMyDsl.g:694:4: rule__FunctionDecl__Group__0
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
    // InternalMyDsl.g:703:1: entryRuleFunctionName : ruleFunctionName EOF ;
    public final void entryRuleFunctionName() throws RecognitionException {
        try {
            // InternalMyDsl.g:704:1: ( ruleFunctionName EOF )
            // InternalMyDsl.g:705:1: ruleFunctionName EOF
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
    // InternalMyDsl.g:712:1: ruleFunctionName : ( ( rule__FunctionName__NameAssignment ) ) ;
    public final void ruleFunctionName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:716:2: ( ( ( rule__FunctionName__NameAssignment ) ) )
            // InternalMyDsl.g:717:2: ( ( rule__FunctionName__NameAssignment ) )
            {
            // InternalMyDsl.g:717:2: ( ( rule__FunctionName__NameAssignment ) )
            // InternalMyDsl.g:718:3: ( rule__FunctionName__NameAssignment )
            {
             before(grammarAccess.getFunctionNameAccess().getNameAssignment()); 
            // InternalMyDsl.g:719:3: ( rule__FunctionName__NameAssignment )
            // InternalMyDsl.g:719:4: rule__FunctionName__NameAssignment
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
    // InternalMyDsl.g:728:1: entryRuleFunctionBody : ruleFunctionBody EOF ;
    public final void entryRuleFunctionBody() throws RecognitionException {
        try {
            // InternalMyDsl.g:729:1: ( ruleFunctionBody EOF )
            // InternalMyDsl.g:730:1: ruleFunctionBody EOF
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
    // InternalMyDsl.g:737:1: ruleFunctionBody : ( ( rule__FunctionBody__Alternatives ) ) ;
    public final void ruleFunctionBody() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:741:2: ( ( ( rule__FunctionBody__Alternatives ) ) )
            // InternalMyDsl.g:742:2: ( ( rule__FunctionBody__Alternatives ) )
            {
            // InternalMyDsl.g:742:2: ( ( rule__FunctionBody__Alternatives ) )
            // InternalMyDsl.g:743:3: ( rule__FunctionBody__Alternatives )
            {
             before(grammarAccess.getFunctionBodyAccess().getAlternatives()); 
            // InternalMyDsl.g:744:3: ( rule__FunctionBody__Alternatives )
            // InternalMyDsl.g:744:4: rule__FunctionBody__Alternatives
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
    // InternalMyDsl.g:753:1: entryRuleFuncDirectDef : ruleFuncDirectDef EOF ;
    public final void entryRuleFuncDirectDef() throws RecognitionException {
        try {
            // InternalMyDsl.g:754:1: ( ruleFuncDirectDef EOF )
            // InternalMyDsl.g:755:1: ruleFuncDirectDef EOF
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
    // InternalMyDsl.g:762:1: ruleFuncDirectDef : ( ( rule__FuncDirectDef__ExpressionAssignment ) ) ;
    public final void ruleFuncDirectDef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:766:2: ( ( ( rule__FuncDirectDef__ExpressionAssignment ) ) )
            // InternalMyDsl.g:767:2: ( ( rule__FuncDirectDef__ExpressionAssignment ) )
            {
            // InternalMyDsl.g:767:2: ( ( rule__FuncDirectDef__ExpressionAssignment ) )
            // InternalMyDsl.g:768:3: ( rule__FuncDirectDef__ExpressionAssignment )
            {
             before(grammarAccess.getFuncDirectDefAccess().getExpressionAssignment()); 
            // InternalMyDsl.g:769:3: ( rule__FuncDirectDef__ExpressionAssignment )
            // InternalMyDsl.g:769:4: rule__FuncDirectDef__ExpressionAssignment
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
    // InternalMyDsl.g:778:1: entryRuleFuncInductive : ruleFuncInductive EOF ;
    public final void entryRuleFuncInductive() throws RecognitionException {
        try {
            // InternalMyDsl.g:779:1: ( ruleFuncInductive EOF )
            // InternalMyDsl.g:780:1: ruleFuncInductive EOF
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
    // InternalMyDsl.g:787:1: ruleFuncInductive : ( ( rule__FuncInductive__Group__0 ) ) ;
    public final void ruleFuncInductive() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:791:2: ( ( ( rule__FuncInductive__Group__0 ) ) )
            // InternalMyDsl.g:792:2: ( ( rule__FuncInductive__Group__0 ) )
            {
            // InternalMyDsl.g:792:2: ( ( rule__FuncInductive__Group__0 ) )
            // InternalMyDsl.g:793:3: ( rule__FuncInductive__Group__0 )
            {
             before(grammarAccess.getFuncInductiveAccess().getGroup()); 
            // InternalMyDsl.g:794:3: ( rule__FuncInductive__Group__0 )
            // InternalMyDsl.g:794:4: rule__FuncInductive__Group__0
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
    // InternalMyDsl.g:803:1: entryRuleFuncInductiveCase : ruleFuncInductiveCase EOF ;
    public final void entryRuleFuncInductiveCase() throws RecognitionException {
        try {
            // InternalMyDsl.g:804:1: ( ruleFuncInductiveCase EOF )
            // InternalMyDsl.g:805:1: ruleFuncInductiveCase EOF
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
    // InternalMyDsl.g:812:1: ruleFuncInductiveCase : ( ( rule__FuncInductiveCase__Group__0 ) ) ;
    public final void ruleFuncInductiveCase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:816:2: ( ( ( rule__FuncInductiveCase__Group__0 ) ) )
            // InternalMyDsl.g:817:2: ( ( rule__FuncInductiveCase__Group__0 ) )
            {
            // InternalMyDsl.g:817:2: ( ( rule__FuncInductiveCase__Group__0 ) )
            // InternalMyDsl.g:818:3: ( rule__FuncInductiveCase__Group__0 )
            {
             before(grammarAccess.getFuncInductiveCaseAccess().getGroup()); 
            // InternalMyDsl.g:819:3: ( rule__FuncInductiveCase__Group__0 )
            // InternalMyDsl.g:819:4: rule__FuncInductiveCase__Group__0
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
    // InternalMyDsl.g:828:1: entryRuleTheoremBody : ruleTheoremBody EOF ;
    public final void entryRuleTheoremBody() throws RecognitionException {
        try {
            // InternalMyDsl.g:829:1: ( ruleTheoremBody EOF )
            // InternalMyDsl.g:830:1: ruleTheoremBody EOF
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
    // InternalMyDsl.g:837:1: ruleTheoremBody : ( ( rule__TheoremBody__Group__0 ) ) ;
    public final void ruleTheoremBody() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:841:2: ( ( ( rule__TheoremBody__Group__0 ) ) )
            // InternalMyDsl.g:842:2: ( ( rule__TheoremBody__Group__0 ) )
            {
            // InternalMyDsl.g:842:2: ( ( rule__TheoremBody__Group__0 ) )
            // InternalMyDsl.g:843:3: ( rule__TheoremBody__Group__0 )
            {
             before(grammarAccess.getTheoremBodyAccess().getGroup()); 
            // InternalMyDsl.g:844:3: ( rule__TheoremBody__Group__0 )
            // InternalMyDsl.g:844:4: rule__TheoremBody__Group__0
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
    // InternalMyDsl.g:853:1: entryRuleTheoremDecl : ruleTheoremDecl EOF ;
    public final void entryRuleTheoremDecl() throws RecognitionException {
        try {
            // InternalMyDsl.g:854:1: ( ruleTheoremDecl EOF )
            // InternalMyDsl.g:855:1: ruleTheoremDecl EOF
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
    // InternalMyDsl.g:862:1: ruleTheoremDecl : ( ( rule__TheoremDecl__Group__0 ) ) ;
    public final void ruleTheoremDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:866:2: ( ( ( rule__TheoremDecl__Group__0 ) ) )
            // InternalMyDsl.g:867:2: ( ( rule__TheoremDecl__Group__0 ) )
            {
            // InternalMyDsl.g:867:2: ( ( rule__TheoremDecl__Group__0 ) )
            // InternalMyDsl.g:868:3: ( rule__TheoremDecl__Group__0 )
            {
             before(grammarAccess.getTheoremDeclAccess().getGroup()); 
            // InternalMyDsl.g:869:3: ( rule__TheoremDecl__Group__0 )
            // InternalMyDsl.g:869:4: rule__TheoremDecl__Group__0
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
    // InternalMyDsl.g:878:1: entryRuleTypedVariableList : ruleTypedVariableList EOF ;
    public final void entryRuleTypedVariableList() throws RecognitionException {
        try {
            // InternalMyDsl.g:879:1: ( ruleTypedVariableList EOF )
            // InternalMyDsl.g:880:1: ruleTypedVariableList EOF
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
    // InternalMyDsl.g:887:1: ruleTypedVariableList : ( ( rule__TypedVariableList__Group__0 ) ) ;
    public final void ruleTypedVariableList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:891:2: ( ( ( rule__TypedVariableList__Group__0 ) ) )
            // InternalMyDsl.g:892:2: ( ( rule__TypedVariableList__Group__0 ) )
            {
            // InternalMyDsl.g:892:2: ( ( rule__TypedVariableList__Group__0 ) )
            // InternalMyDsl.g:893:3: ( rule__TypedVariableList__Group__0 )
            {
             before(grammarAccess.getTypedVariableListAccess().getGroup()); 
            // InternalMyDsl.g:894:3: ( rule__TypedVariableList__Group__0 )
            // InternalMyDsl.g:894:4: rule__TypedVariableList__Group__0
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


    // $ANTLR start "entryRuleTypedVariable"
    // InternalMyDsl.g:903:1: entryRuleTypedVariable : ruleTypedVariable EOF ;
    public final void entryRuleTypedVariable() throws RecognitionException {
        try {
            // InternalMyDsl.g:904:1: ( ruleTypedVariable EOF )
            // InternalMyDsl.g:905:1: ruleTypedVariable EOF
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
    // InternalMyDsl.g:912:1: ruleTypedVariable : ( ( rule__TypedVariable__Group__0 ) ) ;
    public final void ruleTypedVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:916:2: ( ( ( rule__TypedVariable__Group__0 ) ) )
            // InternalMyDsl.g:917:2: ( ( rule__TypedVariable__Group__0 ) )
            {
            // InternalMyDsl.g:917:2: ( ( rule__TypedVariable__Group__0 ) )
            // InternalMyDsl.g:918:3: ( rule__TypedVariable__Group__0 )
            {
             before(grammarAccess.getTypedVariableAccess().getGroup()); 
            // InternalMyDsl.g:919:3: ( rule__TypedVariable__Group__0 )
            // InternalMyDsl.g:919:4: rule__TypedVariable__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TypedVariable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTypedVariableAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleExpression"
    // InternalMyDsl.g:928:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalMyDsl.g:929:1: ( ruleExpression EOF )
            // InternalMyDsl.g:930:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalMyDsl.g:937:1: ruleExpression : ( ( rule__Expression__NameAssignment ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:941:2: ( ( ( rule__Expression__NameAssignment ) ) )
            // InternalMyDsl.g:942:2: ( ( rule__Expression__NameAssignment ) )
            {
            // InternalMyDsl.g:942:2: ( ( rule__Expression__NameAssignment ) )
            // InternalMyDsl.g:943:3: ( rule__Expression__NameAssignment )
            {
             before(grammarAccess.getExpressionAccess().getNameAssignment()); 
            // InternalMyDsl.g:944:3: ( rule__Expression__NameAssignment )
            // InternalMyDsl.g:944:4: rule__Expression__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Expression__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleLambda"
    // InternalMyDsl.g:953:1: entryRuleLambda : ruleLambda EOF ;
    public final void entryRuleLambda() throws RecognitionException {
        try {
            // InternalMyDsl.g:954:1: ( ruleLambda EOF )
            // InternalMyDsl.g:955:1: ruleLambda EOF
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
    // InternalMyDsl.g:962:1: ruleLambda : ( ( rule__Lambda__Group__0 ) ) ;
    public final void ruleLambda() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:966:2: ( ( ( rule__Lambda__Group__0 ) ) )
            // InternalMyDsl.g:967:2: ( ( rule__Lambda__Group__0 ) )
            {
            // InternalMyDsl.g:967:2: ( ( rule__Lambda__Group__0 ) )
            // InternalMyDsl.g:968:3: ( rule__Lambda__Group__0 )
            {
             before(grammarAccess.getLambdaAccess().getGroup()); 
            // InternalMyDsl.g:969:3: ( rule__Lambda__Group__0 )
            // InternalMyDsl.g:969:4: rule__Lambda__Group__0
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
    // InternalMyDsl.g:978:1: entryRuleQuantifier : ruleQuantifier EOF ;
    public final void entryRuleQuantifier() throws RecognitionException {
        try {
            // InternalMyDsl.g:979:1: ( ruleQuantifier EOF )
            // InternalMyDsl.g:980:1: ruleQuantifier EOF
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
    // InternalMyDsl.g:987:1: ruleQuantifier : ( ( rule__Quantifier__Group__0 ) ) ;
    public final void ruleQuantifier() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:991:2: ( ( ( rule__Quantifier__Group__0 ) ) )
            // InternalMyDsl.g:992:2: ( ( rule__Quantifier__Group__0 ) )
            {
            // InternalMyDsl.g:992:2: ( ( rule__Quantifier__Group__0 ) )
            // InternalMyDsl.g:993:3: ( rule__Quantifier__Group__0 )
            {
             before(grammarAccess.getQuantifierAccess().getGroup()); 
            // InternalMyDsl.g:994:3: ( rule__Quantifier__Group__0 )
            // InternalMyDsl.g:994:4: rule__Quantifier__Group__0
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


    // $ANTLR start "entryRulePrefix"
    // InternalMyDsl.g:1003:1: entryRulePrefix : rulePrefix EOF ;
    public final void entryRulePrefix() throws RecognitionException {
        try {
            // InternalMyDsl.g:1004:1: ( rulePrefix EOF )
            // InternalMyDsl.g:1005:1: rulePrefix EOF
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
    // InternalMyDsl.g:1012:1: rulePrefix : ( ( rule__Prefix__Group__0 ) ) ;
    public final void rulePrefix() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1016:2: ( ( ( rule__Prefix__Group__0 ) ) )
            // InternalMyDsl.g:1017:2: ( ( rule__Prefix__Group__0 ) )
            {
            // InternalMyDsl.g:1017:2: ( ( rule__Prefix__Group__0 ) )
            // InternalMyDsl.g:1018:3: ( rule__Prefix__Group__0 )
            {
             before(grammarAccess.getPrefixAccess().getGroup()); 
            // InternalMyDsl.g:1019:3: ( rule__Prefix__Group__0 )
            // InternalMyDsl.g:1019:4: rule__Prefix__Group__0
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
    // InternalMyDsl.g:1028:1: entryRulePrefixBuiltIn : rulePrefixBuiltIn EOF ;
    public final void entryRulePrefixBuiltIn() throws RecognitionException {
        try {
            // InternalMyDsl.g:1029:1: ( rulePrefixBuiltIn EOF )
            // InternalMyDsl.g:1030:1: rulePrefixBuiltIn EOF
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
    // InternalMyDsl.g:1037:1: rulePrefixBuiltIn : ( '\\u00AC' ) ;
    public final void rulePrefixBuiltIn() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1041:2: ( ( '\\u00AC' ) )
            // InternalMyDsl.g:1042:2: ( '\\u00AC' )
            {
            // InternalMyDsl.g:1042:2: ( '\\u00AC' )
            // InternalMyDsl.g:1043:3: '\\u00AC'
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
    // InternalMyDsl.g:1053:1: entryRuleInfix : ruleInfix EOF ;
    public final void entryRuleInfix() throws RecognitionException {
        try {
            // InternalMyDsl.g:1054:1: ( ruleInfix EOF )
            // InternalMyDsl.g:1055:1: ruleInfix EOF
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
    // InternalMyDsl.g:1062:1: ruleInfix : ( ( rule__Infix__Group__0 ) ) ;
    public final void ruleInfix() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1066:2: ( ( ( rule__Infix__Group__0 ) ) )
            // InternalMyDsl.g:1067:2: ( ( rule__Infix__Group__0 ) )
            {
            // InternalMyDsl.g:1067:2: ( ( rule__Infix__Group__0 ) )
            // InternalMyDsl.g:1068:3: ( rule__Infix__Group__0 )
            {
             before(grammarAccess.getInfixAccess().getGroup()); 
            // InternalMyDsl.g:1069:3: ( rule__Infix__Group__0 )
            // InternalMyDsl.g:1069:4: rule__Infix__Group__0
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
    // InternalMyDsl.g:1078:1: entryRuleElement : ruleElement EOF ;
    public final void entryRuleElement() throws RecognitionException {
        try {
            // InternalMyDsl.g:1079:1: ( ruleElement EOF )
            // InternalMyDsl.g:1080:1: ruleElement EOF
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
    // InternalMyDsl.g:1087:1: ruleElement : ( ( rule__Element__Alternatives ) ) ;
    public final void ruleElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1091:2: ( ( ( rule__Element__Alternatives ) ) )
            // InternalMyDsl.g:1092:2: ( ( rule__Element__Alternatives ) )
            {
            // InternalMyDsl.g:1092:2: ( ( rule__Element__Alternatives ) )
            // InternalMyDsl.g:1093:3: ( rule__Element__Alternatives )
            {
             before(grammarAccess.getElementAccess().getAlternatives()); 
            // InternalMyDsl.g:1094:3: ( rule__Element__Alternatives )
            // InternalMyDsl.g:1094:4: rule__Element__Alternatives
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
    // InternalMyDsl.g:1103:1: entryRuleBracket : ruleBracket EOF ;
    public final void entryRuleBracket() throws RecognitionException {
        try {
            // InternalMyDsl.g:1104:1: ( ruleBracket EOF )
            // InternalMyDsl.g:1105:1: ruleBracket EOF
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
    // InternalMyDsl.g:1112:1: ruleBracket : ( ( rule__Bracket__Group__0 ) ) ;
    public final void ruleBracket() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1116:2: ( ( ( rule__Bracket__Group__0 ) ) )
            // InternalMyDsl.g:1117:2: ( ( rule__Bracket__Group__0 ) )
            {
            // InternalMyDsl.g:1117:2: ( ( rule__Bracket__Group__0 ) )
            // InternalMyDsl.g:1118:3: ( rule__Bracket__Group__0 )
            {
             before(grammarAccess.getBracketAccess().getGroup()); 
            // InternalMyDsl.g:1119:3: ( rule__Bracket__Group__0 )
            // InternalMyDsl.g:1119:4: rule__Bracket__Group__0
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
    // InternalMyDsl.g:1128:1: entryRuleFunctionCall : ruleFunctionCall EOF ;
    public final void entryRuleFunctionCall() throws RecognitionException {
        try {
            // InternalMyDsl.g:1129:1: ( ruleFunctionCall EOF )
            // InternalMyDsl.g:1130:1: ruleFunctionCall EOF
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
    // InternalMyDsl.g:1137:1: ruleFunctionCall : ( ( rule__FunctionCall__Group__0 ) ) ;
    public final void ruleFunctionCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1141:2: ( ( ( rule__FunctionCall__Group__0 ) ) )
            // InternalMyDsl.g:1142:2: ( ( rule__FunctionCall__Group__0 ) )
            {
            // InternalMyDsl.g:1142:2: ( ( rule__FunctionCall__Group__0 ) )
            // InternalMyDsl.g:1143:3: ( rule__FunctionCall__Group__0 )
            {
             before(grammarAccess.getFunctionCallAccess().getGroup()); 
            // InternalMyDsl.g:1144:3: ( rule__FunctionCall__Group__0 )
            // InternalMyDsl.g:1144:4: rule__FunctionCall__Group__0
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


    // $ANTLR start "rule__THM_NAME__Alternatives_0"
    // InternalMyDsl.g:1152:1: rule__THM_NAME__Alternatives_0 : ( ( RULE_ID ) | ( RULE_WS ) );
    public final void rule__THM_NAME__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1156:1: ( ( RULE_ID ) | ( RULE_WS ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_WS) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:1157:2: ( RULE_ID )
                    {
                    // InternalMyDsl.g:1157:2: ( RULE_ID )
                    // InternalMyDsl.g:1158:3: RULE_ID
                    {
                     before(grammarAccess.getTHM_NAMEAccess().getIDTerminalRuleCall_0_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getTHM_NAMEAccess().getIDTerminalRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1163:2: ( RULE_WS )
                    {
                    // InternalMyDsl.g:1163:2: ( RULE_WS )
                    // InternalMyDsl.g:1164:3: RULE_WS
                    {
                     before(grammarAccess.getTHM_NAMEAccess().getWSTerminalRuleCall_0_1()); 
                    match(input,RULE_WS,FOLLOW_2); 
                     after(grammarAccess.getTHM_NAMEAccess().getWSTerminalRuleCall_0_1()); 

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


    // $ANTLR start "rule__TopLevel__Alternatives"
    // InternalMyDsl.g:1173:1: rule__TopLevel__Alternatives : ( ( ruleImportStatement ) | ( ruleClassDecl ) );
    public final void rule__TopLevel__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1177:1: ( ( ruleImportStatement ) | ( ruleClassDecl ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==25) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID||LA3_0==27||LA3_0==37) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:1178:2: ( ruleImportStatement )
                    {
                    // InternalMyDsl.g:1178:2: ( ruleImportStatement )
                    // InternalMyDsl.g:1179:3: ruleImportStatement
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
                    // InternalMyDsl.g:1184:2: ( ruleClassDecl )
                    {
                    // InternalMyDsl.g:1184:2: ( ruleClassDecl )
                    // InternalMyDsl.g:1185:3: ruleClassDecl
                    {
                     before(grammarAccess.getTopLevelAccess().getClassDeclParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleClassDecl();

                    state._fsp--;

                     after(grammarAccess.getTopLevelAccess().getClassDeclParserRuleCall_1()); 

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
    // InternalMyDsl.g:1194:1: rule__ClassDecl__Alternatives : ( ( ruleClass ) | ( ruleDatatype ) | ( ruleExtend ) );
    public final void rule__ClassDecl__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1198:1: ( ( ruleClass ) | ( ruleDatatype ) | ( ruleExtend ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt4=1;
                }
                break;
            case 37:
                {
                alt4=2;
                }
                break;
            case RULE_ID:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:1199:2: ( ruleClass )
                    {
                    // InternalMyDsl.g:1199:2: ( ruleClass )
                    // InternalMyDsl.g:1200:3: ruleClass
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
                    // InternalMyDsl.g:1205:2: ( ruleDatatype )
                    {
                    // InternalMyDsl.g:1205:2: ( ruleDatatype )
                    // InternalMyDsl.g:1206:3: ruleDatatype
                    {
                     before(grammarAccess.getClassDeclAccess().getDatatypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleDatatype();

                    state._fsp--;

                     after(grammarAccess.getClassDeclAccess().getDatatypeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1211:2: ( ruleExtend )
                    {
                    // InternalMyDsl.g:1211:2: ( ruleExtend )
                    // InternalMyDsl.g:1212:3: ruleExtend
                    {
                     before(grammarAccess.getClassDeclAccess().getExtendParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleExtend();

                    state._fsp--;

                     after(grammarAccess.getClassDeclAccess().getExtendParserRuleCall_2()); 

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
    // InternalMyDsl.g:1221:1: rule__ConstructedType__Alternatives_1_0 : ( ( '\\u00D7' ) | ( '\\u2192' ) | ( '\\uE102' ) | ( '\\uE100' ) | ( '\\u2194' ) | ( '\\u2916' ) | ( '\\u21F8' ) | ( '\\u21A3' ) | ( '\\u2900' ) | ( '\\u21A0' ) );
    public final void rule__ConstructedType__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1225:1: ( ( '\\u00D7' ) | ( '\\u2192' ) | ( '\\uE102' ) | ( '\\uE100' ) | ( '\\u2194' ) | ( '\\u2916' ) | ( '\\u21F8' ) | ( '\\u21A3' ) | ( '\\u2900' ) | ( '\\u21A0' ) )
            int alt5=10;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt5=1;
                }
                break;
            case 13:
                {
                alt5=2;
                }
                break;
            case 14:
                {
                alt5=3;
                }
                break;
            case 15:
                {
                alt5=4;
                }
                break;
            case 16:
                {
                alt5=5;
                }
                break;
            case 17:
                {
                alt5=6;
                }
                break;
            case 18:
                {
                alt5=7;
                }
                break;
            case 19:
                {
                alt5=8;
                }
                break;
            case 20:
                {
                alt5=9;
                }
                break;
            case 21:
                {
                alt5=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:1226:2: ( '\\u00D7' )
                    {
                    // InternalMyDsl.g:1226:2: ( '\\u00D7' )
                    // InternalMyDsl.g:1227:3: '\\u00D7'
                    {
                     before(grammarAccess.getConstructedTypeAccess().getMultiplicationSignKeyword_1_0_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getConstructedTypeAccess().getMultiplicationSignKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1232:2: ( '\\u2192' )
                    {
                    // InternalMyDsl.g:1232:2: ( '\\u2192' )
                    // InternalMyDsl.g:1233:3: '\\u2192'
                    {
                     before(grammarAccess.getConstructedTypeAccess().getRightwardsArrowKeyword_1_0_1()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getConstructedTypeAccess().getRightwardsArrowKeyword_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1238:2: ( '\\uE102' )
                    {
                    // InternalMyDsl.g:1238:2: ( '\\uE102' )
                    // InternalMyDsl.g:1239:3: '\\uE102'
                    {
                     before(grammarAccess.getConstructedTypeAccess().getPrivateUseAreaE102Keyword_1_0_2()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getConstructedTypeAccess().getPrivateUseAreaE102Keyword_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1244:2: ( '\\uE100' )
                    {
                    // InternalMyDsl.g:1244:2: ( '\\uE100' )
                    // InternalMyDsl.g:1245:3: '\\uE100'
                    {
                     before(grammarAccess.getConstructedTypeAccess().getPrivateUseAreaE100Keyword_1_0_3()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getConstructedTypeAccess().getPrivateUseAreaE100Keyword_1_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:1250:2: ( '\\u2194' )
                    {
                    // InternalMyDsl.g:1250:2: ( '\\u2194' )
                    // InternalMyDsl.g:1251:3: '\\u2194'
                    {
                     before(grammarAccess.getConstructedTypeAccess().getLeftRightArrowKeyword_1_0_4()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getConstructedTypeAccess().getLeftRightArrowKeyword_1_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:1256:2: ( '\\u2916' )
                    {
                    // InternalMyDsl.g:1256:2: ( '\\u2916' )
                    // InternalMyDsl.g:1257:3: '\\u2916'
                    {
                     before(grammarAccess.getConstructedTypeAccess().getRightwardsTwoHeadedArrowWithTailKeyword_1_0_5()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getConstructedTypeAccess().getRightwardsTwoHeadedArrowWithTailKeyword_1_0_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:1262:2: ( '\\u21F8' )
                    {
                    // InternalMyDsl.g:1262:2: ( '\\u21F8' )
                    // InternalMyDsl.g:1263:3: '\\u21F8'
                    {
                     before(grammarAccess.getConstructedTypeAccess().getRightwardsArrowWithVerticalStrokeKeyword_1_0_6()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getConstructedTypeAccess().getRightwardsArrowWithVerticalStrokeKeyword_1_0_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:1268:2: ( '\\u21A3' )
                    {
                    // InternalMyDsl.g:1268:2: ( '\\u21A3' )
                    // InternalMyDsl.g:1269:3: '\\u21A3'
                    {
                     before(grammarAccess.getConstructedTypeAccess().getRightwardsArrowWithTailKeyword_1_0_7()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getConstructedTypeAccess().getRightwardsArrowWithTailKeyword_1_0_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalMyDsl.g:1274:2: ( '\\u2900' )
                    {
                    // InternalMyDsl.g:1274:2: ( '\\u2900' )
                    // InternalMyDsl.g:1275:3: '\\u2900'
                    {
                     before(grammarAccess.getConstructedTypeAccess().getRightwardsTwoHeadedArrowWithVerticalStrokeKeyword_1_0_8()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getConstructedTypeAccess().getRightwardsTwoHeadedArrowWithVerticalStrokeKeyword_1_0_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalMyDsl.g:1280:2: ( '\\u21A0' )
                    {
                    // InternalMyDsl.g:1280:2: ( '\\u21A0' )
                    // InternalMyDsl.g:1281:3: '\\u21A0'
                    {
                     before(grammarAccess.getConstructedTypeAccess().getRightwardsTwoHeadedArrowKeyword_1_0_9()); 
                    match(input,21,FOLLOW_2); 
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


    // $ANTLR start "rule__DatatypeConstructor__Alternatives_1"
    // InternalMyDsl.g:1290:1: rule__DatatypeConstructor__Alternatives_1 : ( ( ruleBaseConstructor ) | ( ruleDTypeConstructor ) );
    public final void rule__DatatypeConstructor__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1294:1: ( ( ruleBaseConstructor ) | ( ruleDTypeConstructor ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==EOF||LA6_1==29||LA6_1==38) ) {
                    alt6=1;
                }
                else if ( (LA6_1==34) ) {
                    alt6=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:1295:2: ( ruleBaseConstructor )
                    {
                    // InternalMyDsl.g:1295:2: ( ruleBaseConstructor )
                    // InternalMyDsl.g:1296:3: ruleBaseConstructor
                    {
                     before(grammarAccess.getDatatypeConstructorAccess().getBaseConstructorParserRuleCall_1_0()); 
                    pushFollow(FOLLOW_2);
                    ruleBaseConstructor();

                    state._fsp--;

                     after(grammarAccess.getDatatypeConstructorAccess().getBaseConstructorParserRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1301:2: ( ruleDTypeConstructor )
                    {
                    // InternalMyDsl.g:1301:2: ( ruleDTypeConstructor )
                    // InternalMyDsl.g:1302:3: ruleDTypeConstructor
                    {
                     before(grammarAccess.getDatatypeConstructorAccess().getDTypeConstructorParserRuleCall_1_1()); 
                    pushFollow(FOLLOW_2);
                    ruleDTypeConstructor();

                    state._fsp--;

                     after(grammarAccess.getDatatypeConstructorAccess().getDTypeConstructorParserRuleCall_1_1()); 

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
    // $ANTLR end "rule__DatatypeConstructor__Alternatives_1"


    // $ANTLR start "rule__TypeBodyElements__Alternatives"
    // InternalMyDsl.g:1311:1: rule__TypeBodyElements__Alternatives : ( ( ( rule__TypeBodyElements__FunctionsAssignment_0 ) ) | ( ( rule__TypeBodyElements__TheoremsAssignment_1 ) ) );
    public final void rule__TypeBodyElements__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1315:1: ( ( ( rule__TypeBodyElements__FunctionsAssignment_0 ) ) | ( ( rule__TypeBodyElements__TheoremsAssignment_1 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                alt7=1;
            }
            else if ( (LA7_0==40) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:1316:2: ( ( rule__TypeBodyElements__FunctionsAssignment_0 ) )
                    {
                    // InternalMyDsl.g:1316:2: ( ( rule__TypeBodyElements__FunctionsAssignment_0 ) )
                    // InternalMyDsl.g:1317:3: ( rule__TypeBodyElements__FunctionsAssignment_0 )
                    {
                     before(grammarAccess.getTypeBodyElementsAccess().getFunctionsAssignment_0()); 
                    // InternalMyDsl.g:1318:3: ( rule__TypeBodyElements__FunctionsAssignment_0 )
                    // InternalMyDsl.g:1318:4: rule__TypeBodyElements__FunctionsAssignment_0
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
                    // InternalMyDsl.g:1322:2: ( ( rule__TypeBodyElements__TheoremsAssignment_1 ) )
                    {
                    // InternalMyDsl.g:1322:2: ( ( rule__TypeBodyElements__TheoremsAssignment_1 ) )
                    // InternalMyDsl.g:1323:3: ( rule__TypeBodyElements__TheoremsAssignment_1 )
                    {
                     before(grammarAccess.getTypeBodyElementsAccess().getTheoremsAssignment_1()); 
                    // InternalMyDsl.g:1324:3: ( rule__TypeBodyElements__TheoremsAssignment_1 )
                    // InternalMyDsl.g:1324:4: rule__TypeBodyElements__TheoremsAssignment_1
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
    // InternalMyDsl.g:1332:1: rule__FunctionBody__Alternatives : ( ( ruleFuncInductive ) | ( ruleFuncDirectDef ) );
    public final void rule__FunctionBody__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1336:1: ( ( ruleFuncInductive ) | ( ruleFuncDirectDef ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==39) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_ID) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:1337:2: ( ruleFuncInductive )
                    {
                    // InternalMyDsl.g:1337:2: ( ruleFuncInductive )
                    // InternalMyDsl.g:1338:3: ruleFuncInductive
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
                    // InternalMyDsl.g:1343:2: ( ruleFuncDirectDef )
                    {
                    // InternalMyDsl.g:1343:2: ( ruleFuncDirectDef )
                    // InternalMyDsl.g:1344:3: ruleFuncDirectDef
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


    // $ANTLR start "rule__Quantifier__Alternatives_0"
    // InternalMyDsl.g:1353:1: rule__Quantifier__Alternatives_0 : ( ( '\\u2200' ) | ( '\\u2203' ) );
    public final void rule__Quantifier__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1357:1: ( ( '\\u2200' ) | ( '\\u2203' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22) ) {
                alt9=1;
            }
            else if ( (LA9_0==23) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:1358:2: ( '\\u2200' )
                    {
                    // InternalMyDsl.g:1358:2: ( '\\u2200' )
                    // InternalMyDsl.g:1359:3: '\\u2200'
                    {
                     before(grammarAccess.getQuantifierAccess().getForAllKeyword_0_0()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getQuantifierAccess().getForAllKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1364:2: ( '\\u2203' )
                    {
                    // InternalMyDsl.g:1364:2: ( '\\u2203' )
                    // InternalMyDsl.g:1365:3: '\\u2203'
                    {
                     before(grammarAccess.getQuantifierAccess().getThereExistsKeyword_0_1()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getQuantifierAccess().getThereExistsKeyword_0_1()); 

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
    // $ANTLR end "rule__Quantifier__Alternatives_0"


    // $ANTLR start "rule__Element__Alternatives"
    // InternalMyDsl.g:1374:1: rule__Element__Alternatives : ( ( ruleBracket ) | ( ruleQuantifier ) | ( ruleFunctionCall ) | ( rulePrefix ) );
    public final void rule__Element__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1378:1: ( ( ruleBracket ) | ( ruleQuantifier ) | ( ruleFunctionCall ) | ( rulePrefix ) )
            int alt10=4;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt10=1;
                }
                break;
            case 22:
            case 23:
                {
                alt10=2;
                }
                break;
            case RULE_ID:
                {
                alt10=3;
                }
                break;
            case 11:
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
                    // InternalMyDsl.g:1379:2: ( ruleBracket )
                    {
                    // InternalMyDsl.g:1379:2: ( ruleBracket )
                    // InternalMyDsl.g:1380:3: ruleBracket
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
                    // InternalMyDsl.g:1385:2: ( ruleQuantifier )
                    {
                    // InternalMyDsl.g:1385:2: ( ruleQuantifier )
                    // InternalMyDsl.g:1386:3: ruleQuantifier
                    {
                     before(grammarAccess.getElementAccess().getQuantifierParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleQuantifier();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getQuantifierParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1391:2: ( ruleFunctionCall )
                    {
                    // InternalMyDsl.g:1391:2: ( ruleFunctionCall )
                    // InternalMyDsl.g:1392:3: ruleFunctionCall
                    {
                     before(grammarAccess.getElementAccess().getFunctionCallParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleFunctionCall();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getFunctionCallParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1397:2: ( rulePrefix )
                    {
                    // InternalMyDsl.g:1397:2: ( rulePrefix )
                    // InternalMyDsl.g:1398:3: rulePrefix
                    {
                     before(grammarAccess.getElementAccess().getPrefixParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    rulePrefix();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getPrefixParserRuleCall_3()); 

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


    // $ANTLR start "rule__THM_NAME__Group__0"
    // InternalMyDsl.g:1407:1: rule__THM_NAME__Group__0 : rule__THM_NAME__Group__0__Impl rule__THM_NAME__Group__1 ;
    public final void rule__THM_NAME__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1411:1: ( rule__THM_NAME__Group__0__Impl rule__THM_NAME__Group__1 )
            // InternalMyDsl.g:1412:2: rule__THM_NAME__Group__0__Impl rule__THM_NAME__Group__1
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
    // InternalMyDsl.g:1419:1: rule__THM_NAME__Group__0__Impl : ( ( rule__THM_NAME__Alternatives_0 )* ) ;
    public final void rule__THM_NAME__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1423:1: ( ( ( rule__THM_NAME__Alternatives_0 )* ) )
            // InternalMyDsl.g:1424:1: ( ( rule__THM_NAME__Alternatives_0 )* )
            {
            // InternalMyDsl.g:1424:1: ( ( rule__THM_NAME__Alternatives_0 )* )
            // InternalMyDsl.g:1425:2: ( rule__THM_NAME__Alternatives_0 )*
            {
             before(grammarAccess.getTHM_NAMEAccess().getAlternatives_0()); 
            // InternalMyDsl.g:1426:2: ( rule__THM_NAME__Alternatives_0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=RULE_ID && LA11_0<=RULE_WS)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMyDsl.g:1426:3: rule__THM_NAME__Alternatives_0
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__THM_NAME__Alternatives_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalMyDsl.g:1434:1: rule__THM_NAME__Group__1 : rule__THM_NAME__Group__1__Impl ;
    public final void rule__THM_NAME__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1438:1: ( rule__THM_NAME__Group__1__Impl )
            // InternalMyDsl.g:1439:2: rule__THM_NAME__Group__1__Impl
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
    // InternalMyDsl.g:1445:1: rule__THM_NAME__Group__1__Impl : ( ':' ) ;
    public final void rule__THM_NAME__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1449:1: ( ( ':' ) )
            // InternalMyDsl.g:1450:1: ( ':' )
            {
            // InternalMyDsl.g:1450:1: ( ':' )
            // InternalMyDsl.g:1451:2: ':'
            {
             before(grammarAccess.getTHM_NAMEAccess().getColonKeyword_1()); 
            match(input,24,FOLLOW_2); 
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
    // InternalMyDsl.g:1461:1: rule__ImportStatement__Group__0 : rule__ImportStatement__Group__0__Impl rule__ImportStatement__Group__1 ;
    public final void rule__ImportStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1465:1: ( rule__ImportStatement__Group__0__Impl rule__ImportStatement__Group__1 )
            // InternalMyDsl.g:1466:2: rule__ImportStatement__Group__0__Impl rule__ImportStatement__Group__1
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
    // InternalMyDsl.g:1473:1: rule__ImportStatement__Group__0__Impl : ( 'Import' ) ;
    public final void rule__ImportStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1477:1: ( ( 'Import' ) )
            // InternalMyDsl.g:1478:1: ( 'Import' )
            {
            // InternalMyDsl.g:1478:1: ( 'Import' )
            // InternalMyDsl.g:1479:2: 'Import'
            {
             before(grammarAccess.getImportStatementAccess().getImportKeyword_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalMyDsl.g:1488:1: rule__ImportStatement__Group__1 : rule__ImportStatement__Group__1__Impl ;
    public final void rule__ImportStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1492:1: ( rule__ImportStatement__Group__1__Impl )
            // InternalMyDsl.g:1493:2: rule__ImportStatement__Group__1__Impl
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
    // InternalMyDsl.g:1499:1: rule__ImportStatement__Group__1__Impl : ( ( rule__ImportStatement__ImportsAssignment_1 ) ) ;
    public final void rule__ImportStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1503:1: ( ( ( rule__ImportStatement__ImportsAssignment_1 ) ) )
            // InternalMyDsl.g:1504:1: ( ( rule__ImportStatement__ImportsAssignment_1 ) )
            {
            // InternalMyDsl.g:1504:1: ( ( rule__ImportStatement__ImportsAssignment_1 ) )
            // InternalMyDsl.g:1505:2: ( rule__ImportStatement__ImportsAssignment_1 )
            {
             before(grammarAccess.getImportStatementAccess().getImportsAssignment_1()); 
            // InternalMyDsl.g:1506:2: ( rule__ImportStatement__ImportsAssignment_1 )
            // InternalMyDsl.g:1506:3: rule__ImportStatement__ImportsAssignment_1
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
    // InternalMyDsl.g:1515:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1519:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalMyDsl.g:1520:2: rule__Import__Group__0__Impl rule__Import__Group__1
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
    // InternalMyDsl.g:1527:1: rule__Import__Group__0__Impl : ( ( rule__Import__ImportNameAssignment_0 ) ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1531:1: ( ( ( rule__Import__ImportNameAssignment_0 ) ) )
            // InternalMyDsl.g:1532:1: ( ( rule__Import__ImportNameAssignment_0 ) )
            {
            // InternalMyDsl.g:1532:1: ( ( rule__Import__ImportNameAssignment_0 ) )
            // InternalMyDsl.g:1533:2: ( rule__Import__ImportNameAssignment_0 )
            {
             before(grammarAccess.getImportAccess().getImportNameAssignment_0()); 
            // InternalMyDsl.g:1534:2: ( rule__Import__ImportNameAssignment_0 )
            // InternalMyDsl.g:1534:3: rule__Import__ImportNameAssignment_0
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
    // InternalMyDsl.g:1542:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1546:1: ( rule__Import__Group__1__Impl )
            // InternalMyDsl.g:1547:2: rule__Import__Group__1__Impl
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
    // InternalMyDsl.g:1553:1: rule__Import__Group__1__Impl : ( ( rule__Import__Group_1__0 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1557:1: ( ( ( rule__Import__Group_1__0 ) ) )
            // InternalMyDsl.g:1558:1: ( ( rule__Import__Group_1__0 ) )
            {
            // InternalMyDsl.g:1558:1: ( ( rule__Import__Group_1__0 ) )
            // InternalMyDsl.g:1559:2: ( rule__Import__Group_1__0 )
            {
             before(grammarAccess.getImportAccess().getGroup_1()); 
            // InternalMyDsl.g:1560:2: ( rule__Import__Group_1__0 )
            // InternalMyDsl.g:1560:3: rule__Import__Group_1__0
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
    // InternalMyDsl.g:1569:1: rule__Import__Group_1__0 : rule__Import__Group_1__0__Impl rule__Import__Group_1__1 ;
    public final void rule__Import__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1573:1: ( rule__Import__Group_1__0__Impl rule__Import__Group_1__1 )
            // InternalMyDsl.g:1574:2: rule__Import__Group_1__0__Impl rule__Import__Group_1__1
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
    // InternalMyDsl.g:1581:1: rule__Import__Group_1__0__Impl : ( '.' ) ;
    public final void rule__Import__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1585:1: ( ( '.' ) )
            // InternalMyDsl.g:1586:1: ( '.' )
            {
            // InternalMyDsl.g:1586:1: ( '.' )
            // InternalMyDsl.g:1587:2: '.'
            {
             before(grammarAccess.getImportAccess().getFullStopKeyword_1_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalMyDsl.g:1596:1: rule__Import__Group_1__1 : rule__Import__Group_1__1__Impl ;
    public final void rule__Import__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1600:1: ( rule__Import__Group_1__1__Impl )
            // InternalMyDsl.g:1601:2: rule__Import__Group_1__1__Impl
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
    // InternalMyDsl.g:1607:1: rule__Import__Group_1__1__Impl : ( ( rule__Import__ImportNameAssignment_1_1 ) ) ;
    public final void rule__Import__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1611:1: ( ( ( rule__Import__ImportNameAssignment_1_1 ) ) )
            // InternalMyDsl.g:1612:1: ( ( rule__Import__ImportNameAssignment_1_1 ) )
            {
            // InternalMyDsl.g:1612:1: ( ( rule__Import__ImportNameAssignment_1_1 ) )
            // InternalMyDsl.g:1613:2: ( rule__Import__ImportNameAssignment_1_1 )
            {
             before(grammarAccess.getImportAccess().getImportNameAssignment_1_1()); 
            // InternalMyDsl.g:1614:2: ( rule__Import__ImportNameAssignment_1_1 )
            // InternalMyDsl.g:1614:3: rule__Import__ImportNameAssignment_1_1
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
    // InternalMyDsl.g:1623:1: rule__Class__Group__0 : rule__Class__Group__0__Impl rule__Class__Group__1 ;
    public final void rule__Class__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1627:1: ( rule__Class__Group__0__Impl rule__Class__Group__1 )
            // InternalMyDsl.g:1628:2: rule__Class__Group__0__Impl rule__Class__Group__1
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
    // InternalMyDsl.g:1635:1: rule__Class__Group__0__Impl : ( 'Class' ) ;
    public final void rule__Class__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1639:1: ( ( 'Class' ) )
            // InternalMyDsl.g:1640:1: ( 'Class' )
            {
            // InternalMyDsl.g:1640:1: ( 'Class' )
            // InternalMyDsl.g:1641:2: 'Class'
            {
             before(grammarAccess.getClassAccess().getClassKeyword_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalMyDsl.g:1650:1: rule__Class__Group__1 : rule__Class__Group__1__Impl rule__Class__Group__2 ;
    public final void rule__Class__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1654:1: ( rule__Class__Group__1__Impl rule__Class__Group__2 )
            // InternalMyDsl.g:1655:2: rule__Class__Group__1__Impl rule__Class__Group__2
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
    // InternalMyDsl.g:1662:1: rule__Class__Group__1__Impl : ( ( rule__Class__TypeNameAssignment_1 ) ) ;
    public final void rule__Class__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1666:1: ( ( ( rule__Class__TypeNameAssignment_1 ) ) )
            // InternalMyDsl.g:1667:1: ( ( rule__Class__TypeNameAssignment_1 ) )
            {
            // InternalMyDsl.g:1667:1: ( ( rule__Class__TypeNameAssignment_1 ) )
            // InternalMyDsl.g:1668:2: ( rule__Class__TypeNameAssignment_1 )
            {
             before(grammarAccess.getClassAccess().getTypeNameAssignment_1()); 
            // InternalMyDsl.g:1669:2: ( rule__Class__TypeNameAssignment_1 )
            // InternalMyDsl.g:1669:3: rule__Class__TypeNameAssignment_1
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
    // InternalMyDsl.g:1677:1: rule__Class__Group__2 : rule__Class__Group__2__Impl rule__Class__Group__3 ;
    public final void rule__Class__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1681:1: ( rule__Class__Group__2__Impl rule__Class__Group__3 )
            // InternalMyDsl.g:1682:2: rule__Class__Group__2__Impl rule__Class__Group__3
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
    // InternalMyDsl.g:1689:1: rule__Class__Group__2__Impl : ( ( rule__Class__ContextAssignment_2 )? ) ;
    public final void rule__Class__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1693:1: ( ( ( rule__Class__ContextAssignment_2 )? ) )
            // InternalMyDsl.g:1694:1: ( ( rule__Class__ContextAssignment_2 )? )
            {
            // InternalMyDsl.g:1694:1: ( ( rule__Class__ContextAssignment_2 )? )
            // InternalMyDsl.g:1695:2: ( rule__Class__ContextAssignment_2 )?
            {
             before(grammarAccess.getClassAccess().getContextAssignment_2()); 
            // InternalMyDsl.g:1696:2: ( rule__Class__ContextAssignment_2 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==31) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:1696:3: rule__Class__ContextAssignment_2
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
    // InternalMyDsl.g:1704:1: rule__Class__Group__3 : rule__Class__Group__3__Impl rule__Class__Group__4 ;
    public final void rule__Class__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1708:1: ( rule__Class__Group__3__Impl rule__Class__Group__4 )
            // InternalMyDsl.g:1709:2: rule__Class__Group__3__Impl rule__Class__Group__4
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
    // InternalMyDsl.g:1716:1: rule__Class__Group__3__Impl : ( ( rule__Class__SupertypesAssignment_3 )? ) ;
    public final void rule__Class__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1720:1: ( ( ( rule__Class__SupertypesAssignment_3 )? ) )
            // InternalMyDsl.g:1721:1: ( ( rule__Class__SupertypesAssignment_3 )? )
            {
            // InternalMyDsl.g:1721:1: ( ( rule__Class__SupertypesAssignment_3 )? )
            // InternalMyDsl.g:1722:2: ( rule__Class__SupertypesAssignment_3 )?
            {
             before(grammarAccess.getClassAccess().getSupertypesAssignment_3()); 
            // InternalMyDsl.g:1723:2: ( rule__Class__SupertypesAssignment_3 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==24) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMyDsl.g:1723:3: rule__Class__SupertypesAssignment_3
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
    // InternalMyDsl.g:1731:1: rule__Class__Group__4 : rule__Class__Group__4__Impl rule__Class__Group__5 ;
    public final void rule__Class__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1735:1: ( rule__Class__Group__4__Impl rule__Class__Group__5 )
            // InternalMyDsl.g:1736:2: rule__Class__Group__4__Impl rule__Class__Group__5
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
    // InternalMyDsl.g:1743:1: rule__Class__Group__4__Impl : ( ( rule__Class__TypeStructureAssignment_4 )? ) ;
    public final void rule__Class__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1747:1: ( ( ( rule__Class__TypeStructureAssignment_4 )? ) )
            // InternalMyDsl.g:1748:1: ( ( rule__Class__TypeStructureAssignment_4 )? )
            {
            // InternalMyDsl.g:1748:1: ( ( rule__Class__TypeStructureAssignment_4 )? )
            // InternalMyDsl.g:1749:2: ( rule__Class__TypeStructureAssignment_4 )?
            {
             before(grammarAccess.getClassAccess().getTypeStructureAssignment_4()); 
            // InternalMyDsl.g:1750:2: ( rule__Class__TypeStructureAssignment_4 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==34) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMyDsl.g:1750:3: rule__Class__TypeStructureAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Class__TypeStructureAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClassAccess().getTypeStructureAssignment_4()); 

            }


            }

        }
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
    // InternalMyDsl.g:1758:1: rule__Class__Group__5 : rule__Class__Group__5__Impl rule__Class__Group__6 ;
    public final void rule__Class__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1762:1: ( rule__Class__Group__5__Impl rule__Class__Group__6 )
            // InternalMyDsl.g:1763:2: rule__Class__Group__5__Impl rule__Class__Group__6
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
    // InternalMyDsl.g:1770:1: rule__Class__Group__5__Impl : ( ( rule__Class__WhereAssignment_5 )? ) ;
    public final void rule__Class__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1774:1: ( ( ( rule__Class__WhereAssignment_5 )? ) )
            // InternalMyDsl.g:1775:1: ( ( rule__Class__WhereAssignment_5 )? )
            {
            // InternalMyDsl.g:1775:1: ( ( rule__Class__WhereAssignment_5 )? )
            // InternalMyDsl.g:1776:2: ( rule__Class__WhereAssignment_5 )?
            {
             before(grammarAccess.getClassAccess().getWhereAssignment_5()); 
            // InternalMyDsl.g:1777:2: ( rule__Class__WhereAssignment_5 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==36) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMyDsl.g:1777:3: rule__Class__WhereAssignment_5
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
    // InternalMyDsl.g:1785:1: rule__Class__Group__6 : rule__Class__Group__6__Impl rule__Class__Group__7 ;
    public final void rule__Class__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1789:1: ( rule__Class__Group__6__Impl rule__Class__Group__7 )
            // InternalMyDsl.g:1790:2: rule__Class__Group__6__Impl rule__Class__Group__7
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
    // InternalMyDsl.g:1797:1: rule__Class__Group__6__Impl : ( ( ';' )? ) ;
    public final void rule__Class__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1801:1: ( ( ( ';' )? ) )
            // InternalMyDsl.g:1802:1: ( ( ';' )? )
            {
            // InternalMyDsl.g:1802:1: ( ( ';' )? )
            // InternalMyDsl.g:1803:2: ( ';' )?
            {
             before(grammarAccess.getClassAccess().getSemicolonKeyword_6()); 
            // InternalMyDsl.g:1804:2: ( ';' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==28) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMyDsl.g:1804:3: ';'
                    {
                    match(input,28,FOLLOW_2); 

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
    // InternalMyDsl.g:1812:1: rule__Class__Group__7 : rule__Class__Group__7__Impl rule__Class__Group__8 ;
    public final void rule__Class__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1816:1: ( rule__Class__Group__7__Impl rule__Class__Group__8 )
            // InternalMyDsl.g:1817:2: rule__Class__Group__7__Impl rule__Class__Group__8
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
    // InternalMyDsl.g:1824:1: rule__Class__Group__7__Impl : ( '{' ) ;
    public final void rule__Class__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1828:1: ( ( '{' ) )
            // InternalMyDsl.g:1829:1: ( '{' )
            {
            // InternalMyDsl.g:1829:1: ( '{' )
            // InternalMyDsl.g:1830:2: '{'
            {
             before(grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_7()); 
            match(input,29,FOLLOW_2); 
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
    // InternalMyDsl.g:1839:1: rule__Class__Group__8 : rule__Class__Group__8__Impl rule__Class__Group__9 ;
    public final void rule__Class__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1843:1: ( rule__Class__Group__8__Impl rule__Class__Group__9 )
            // InternalMyDsl.g:1844:2: rule__Class__Group__8__Impl rule__Class__Group__9
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
    // InternalMyDsl.g:1851:1: rule__Class__Group__8__Impl : ( ( rule__Class__BodyElementsAssignment_8 )* ) ;
    public final void rule__Class__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1855:1: ( ( ( rule__Class__BodyElementsAssignment_8 )* ) )
            // InternalMyDsl.g:1856:1: ( ( rule__Class__BodyElementsAssignment_8 )* )
            {
            // InternalMyDsl.g:1856:1: ( ( rule__Class__BodyElementsAssignment_8 )* )
            // InternalMyDsl.g:1857:2: ( rule__Class__BodyElementsAssignment_8 )*
            {
             before(grammarAccess.getClassAccess().getBodyElementsAssignment_8()); 
            // InternalMyDsl.g:1858:2: ( rule__Class__BodyElementsAssignment_8 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID||LA17_0==40) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalMyDsl.g:1858:3: rule__Class__BodyElementsAssignment_8
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Class__BodyElementsAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalMyDsl.g:1866:1: rule__Class__Group__9 : rule__Class__Group__9__Impl ;
    public final void rule__Class__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1870:1: ( rule__Class__Group__9__Impl )
            // InternalMyDsl.g:1871:2: rule__Class__Group__9__Impl
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
    // InternalMyDsl.g:1877:1: rule__Class__Group__9__Impl : ( '}' ) ;
    public final void rule__Class__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1881:1: ( ( '}' ) )
            // InternalMyDsl.g:1882:1: ( '}' )
            {
            // InternalMyDsl.g:1882:1: ( '}' )
            // InternalMyDsl.g:1883:2: '}'
            {
             before(grammarAccess.getClassAccess().getRightCurlyBracketKeyword_9()); 
            match(input,30,FOLLOW_2); 
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
    // InternalMyDsl.g:1893:1: rule__PolyContext__Group__0 : rule__PolyContext__Group__0__Impl rule__PolyContext__Group__1 ;
    public final void rule__PolyContext__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1897:1: ( rule__PolyContext__Group__0__Impl rule__PolyContext__Group__1 )
            // InternalMyDsl.g:1898:2: rule__PolyContext__Group__0__Impl rule__PolyContext__Group__1
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
    // InternalMyDsl.g:1905:1: rule__PolyContext__Group__0__Impl : ( '<' ) ;
    public final void rule__PolyContext__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1909:1: ( ( '<' ) )
            // InternalMyDsl.g:1910:1: ( '<' )
            {
            // InternalMyDsl.g:1910:1: ( '<' )
            // InternalMyDsl.g:1911:2: '<'
            {
             before(grammarAccess.getPolyContextAccess().getLessThanSignKeyword_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalMyDsl.g:1920:1: rule__PolyContext__Group__1 : rule__PolyContext__Group__1__Impl rule__PolyContext__Group__2 ;
    public final void rule__PolyContext__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1924:1: ( rule__PolyContext__Group__1__Impl rule__PolyContext__Group__2 )
            // InternalMyDsl.g:1925:2: rule__PolyContext__Group__1__Impl rule__PolyContext__Group__2
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
    // InternalMyDsl.g:1932:1: rule__PolyContext__Group__1__Impl : ( ( ( rule__PolyContext__PolyTypesAssignment_1 ) ) ( ( rule__PolyContext__PolyTypesAssignment_1 )* ) ) ;
    public final void rule__PolyContext__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1936:1: ( ( ( ( rule__PolyContext__PolyTypesAssignment_1 ) ) ( ( rule__PolyContext__PolyTypesAssignment_1 )* ) ) )
            // InternalMyDsl.g:1937:1: ( ( ( rule__PolyContext__PolyTypesAssignment_1 ) ) ( ( rule__PolyContext__PolyTypesAssignment_1 )* ) )
            {
            // InternalMyDsl.g:1937:1: ( ( ( rule__PolyContext__PolyTypesAssignment_1 ) ) ( ( rule__PolyContext__PolyTypesAssignment_1 )* ) )
            // InternalMyDsl.g:1938:2: ( ( rule__PolyContext__PolyTypesAssignment_1 ) ) ( ( rule__PolyContext__PolyTypesAssignment_1 )* )
            {
            // InternalMyDsl.g:1938:2: ( ( rule__PolyContext__PolyTypesAssignment_1 ) )
            // InternalMyDsl.g:1939:3: ( rule__PolyContext__PolyTypesAssignment_1 )
            {
             before(grammarAccess.getPolyContextAccess().getPolyTypesAssignment_1()); 
            // InternalMyDsl.g:1940:3: ( rule__PolyContext__PolyTypesAssignment_1 )
            // InternalMyDsl.g:1940:4: rule__PolyContext__PolyTypesAssignment_1
            {
            pushFollow(FOLLOW_12);
            rule__PolyContext__PolyTypesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPolyContextAccess().getPolyTypesAssignment_1()); 

            }

            // InternalMyDsl.g:1943:2: ( ( rule__PolyContext__PolyTypesAssignment_1 )* )
            // InternalMyDsl.g:1944:3: ( rule__PolyContext__PolyTypesAssignment_1 )*
            {
             before(grammarAccess.getPolyContextAccess().getPolyTypesAssignment_1()); 
            // InternalMyDsl.g:1945:3: ( rule__PolyContext__PolyTypesAssignment_1 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalMyDsl.g:1945:4: rule__PolyContext__PolyTypesAssignment_1
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__PolyContext__PolyTypesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // InternalMyDsl.g:1954:1: rule__PolyContext__Group__2 : rule__PolyContext__Group__2__Impl ;
    public final void rule__PolyContext__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1958:1: ( rule__PolyContext__Group__2__Impl )
            // InternalMyDsl.g:1959:2: rule__PolyContext__Group__2__Impl
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
    // InternalMyDsl.g:1965:1: rule__PolyContext__Group__2__Impl : ( '>' ) ;
    public final void rule__PolyContext__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1969:1: ( ( '>' ) )
            // InternalMyDsl.g:1970:1: ( '>' )
            {
            // InternalMyDsl.g:1970:1: ( '>' )
            // InternalMyDsl.g:1971:2: '>'
            {
             before(grammarAccess.getPolyContextAccess().getGreaterThanSignKeyword_2()); 
            match(input,32,FOLLOW_2); 
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
    // InternalMyDsl.g:1981:1: rule__PolyContextTypes__Group__0 : rule__PolyContextTypes__Group__0__Impl rule__PolyContextTypes__Group__1 ;
    public final void rule__PolyContextTypes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1985:1: ( rule__PolyContextTypes__Group__0__Impl rule__PolyContextTypes__Group__1 )
            // InternalMyDsl.g:1986:2: rule__PolyContextTypes__Group__0__Impl rule__PolyContextTypes__Group__1
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
    // InternalMyDsl.g:1993:1: rule__PolyContextTypes__Group__0__Impl : ( ( rule__PolyContextTypes__NameAssignment_0 ) ) ;
    public final void rule__PolyContextTypes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1997:1: ( ( ( rule__PolyContextTypes__NameAssignment_0 ) ) )
            // InternalMyDsl.g:1998:1: ( ( rule__PolyContextTypes__NameAssignment_0 ) )
            {
            // InternalMyDsl.g:1998:1: ( ( rule__PolyContextTypes__NameAssignment_0 ) )
            // InternalMyDsl.g:1999:2: ( rule__PolyContextTypes__NameAssignment_0 )
            {
             before(grammarAccess.getPolyContextTypesAccess().getNameAssignment_0()); 
            // InternalMyDsl.g:2000:2: ( rule__PolyContextTypes__NameAssignment_0 )
            // InternalMyDsl.g:2000:3: rule__PolyContextTypes__NameAssignment_0
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
    // InternalMyDsl.g:2008:1: rule__PolyContextTypes__Group__1 : rule__PolyContextTypes__Group__1__Impl ;
    public final void rule__PolyContextTypes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2012:1: ( rule__PolyContextTypes__Group__1__Impl )
            // InternalMyDsl.g:2013:2: rule__PolyContextTypes__Group__1__Impl
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
    // InternalMyDsl.g:2019:1: rule__PolyContextTypes__Group__1__Impl : ( ( rule__PolyContextTypes__ConstraintsAssignment_1 )* ) ;
    public final void rule__PolyContextTypes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2023:1: ( ( ( rule__PolyContextTypes__ConstraintsAssignment_1 )* ) )
            // InternalMyDsl.g:2024:1: ( ( rule__PolyContextTypes__ConstraintsAssignment_1 )* )
            {
            // InternalMyDsl.g:2024:1: ( ( rule__PolyContextTypes__ConstraintsAssignment_1 )* )
            // InternalMyDsl.g:2025:2: ( rule__PolyContextTypes__ConstraintsAssignment_1 )*
            {
             before(grammarAccess.getPolyContextTypesAccess().getConstraintsAssignment_1()); 
            // InternalMyDsl.g:2026:2: ( rule__PolyContextTypes__ConstraintsAssignment_1 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==24) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalMyDsl.g:2026:3: rule__PolyContextTypes__ConstraintsAssignment_1
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__PolyContextTypes__ConstraintsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // InternalMyDsl.g:2035:1: rule__PolyTypeConstraints__Group__0 : rule__PolyTypeConstraints__Group__0__Impl rule__PolyTypeConstraints__Group__1 ;
    public final void rule__PolyTypeConstraints__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2039:1: ( rule__PolyTypeConstraints__Group__0__Impl rule__PolyTypeConstraints__Group__1 )
            // InternalMyDsl.g:2040:2: rule__PolyTypeConstraints__Group__0__Impl rule__PolyTypeConstraints__Group__1
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
    // InternalMyDsl.g:2047:1: rule__PolyTypeConstraints__Group__0__Impl : ( ':' ) ;
    public final void rule__PolyTypeConstraints__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2051:1: ( ( ':' ) )
            // InternalMyDsl.g:2052:1: ( ':' )
            {
            // InternalMyDsl.g:2052:1: ( ':' )
            // InternalMyDsl.g:2053:2: ':'
            {
             before(grammarAccess.getPolyTypeConstraintsAccess().getColonKeyword_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalMyDsl.g:2062:1: rule__PolyTypeConstraints__Group__1 : rule__PolyTypeConstraints__Group__1__Impl rule__PolyTypeConstraints__Group__2 ;
    public final void rule__PolyTypeConstraints__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2066:1: ( rule__PolyTypeConstraints__Group__1__Impl rule__PolyTypeConstraints__Group__2 )
            // InternalMyDsl.g:2067:2: rule__PolyTypeConstraints__Group__1__Impl rule__PolyTypeConstraints__Group__2
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
    // InternalMyDsl.g:2074:1: rule__PolyTypeConstraints__Group__1__Impl : ( ( rule__PolyTypeConstraints__TypeNameAssignment_1 ) ) ;
    public final void rule__PolyTypeConstraints__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2078:1: ( ( ( rule__PolyTypeConstraints__TypeNameAssignment_1 ) ) )
            // InternalMyDsl.g:2079:1: ( ( rule__PolyTypeConstraints__TypeNameAssignment_1 ) )
            {
            // InternalMyDsl.g:2079:1: ( ( rule__PolyTypeConstraints__TypeNameAssignment_1 ) )
            // InternalMyDsl.g:2080:2: ( rule__PolyTypeConstraints__TypeNameAssignment_1 )
            {
             before(grammarAccess.getPolyTypeConstraintsAccess().getTypeNameAssignment_1()); 
            // InternalMyDsl.g:2081:2: ( rule__PolyTypeConstraints__TypeNameAssignment_1 )
            // InternalMyDsl.g:2081:3: rule__PolyTypeConstraints__TypeNameAssignment_1
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
    // InternalMyDsl.g:2089:1: rule__PolyTypeConstraints__Group__2 : rule__PolyTypeConstraints__Group__2__Impl ;
    public final void rule__PolyTypeConstraints__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2093:1: ( rule__PolyTypeConstraints__Group__2__Impl )
            // InternalMyDsl.g:2094:2: rule__PolyTypeConstraints__Group__2__Impl
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
    // InternalMyDsl.g:2100:1: rule__PolyTypeConstraints__Group__2__Impl : ( ( rule__PolyTypeConstraints__Group_2__0 )* ) ;
    public final void rule__PolyTypeConstraints__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2104:1: ( ( ( rule__PolyTypeConstraints__Group_2__0 )* ) )
            // InternalMyDsl.g:2105:1: ( ( rule__PolyTypeConstraints__Group_2__0 )* )
            {
            // InternalMyDsl.g:2105:1: ( ( rule__PolyTypeConstraints__Group_2__0 )* )
            // InternalMyDsl.g:2106:2: ( rule__PolyTypeConstraints__Group_2__0 )*
            {
             before(grammarAccess.getPolyTypeConstraintsAccess().getGroup_2()); 
            // InternalMyDsl.g:2107:2: ( rule__PolyTypeConstraints__Group_2__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==33) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalMyDsl.g:2107:3: rule__PolyTypeConstraints__Group_2__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__PolyTypeConstraints__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // InternalMyDsl.g:2116:1: rule__PolyTypeConstraints__Group_2__0 : rule__PolyTypeConstraints__Group_2__0__Impl rule__PolyTypeConstraints__Group_2__1 ;
    public final void rule__PolyTypeConstraints__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2120:1: ( rule__PolyTypeConstraints__Group_2__0__Impl rule__PolyTypeConstraints__Group_2__1 )
            // InternalMyDsl.g:2121:2: rule__PolyTypeConstraints__Group_2__0__Impl rule__PolyTypeConstraints__Group_2__1
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
    // InternalMyDsl.g:2128:1: rule__PolyTypeConstraints__Group_2__0__Impl : ( ',' ) ;
    public final void rule__PolyTypeConstraints__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2132:1: ( ( ',' ) )
            // InternalMyDsl.g:2133:1: ( ',' )
            {
            // InternalMyDsl.g:2133:1: ( ',' )
            // InternalMyDsl.g:2134:2: ','
            {
             before(grammarAccess.getPolyTypeConstraintsAccess().getCommaKeyword_2_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalMyDsl.g:2143:1: rule__PolyTypeConstraints__Group_2__1 : rule__PolyTypeConstraints__Group_2__1__Impl ;
    public final void rule__PolyTypeConstraints__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2147:1: ( rule__PolyTypeConstraints__Group_2__1__Impl )
            // InternalMyDsl.g:2148:2: rule__PolyTypeConstraints__Group_2__1__Impl
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
    // InternalMyDsl.g:2154:1: rule__PolyTypeConstraints__Group_2__1__Impl : ( ( rule__PolyTypeConstraints__TypeNameAssignment_2_1 ) ) ;
    public final void rule__PolyTypeConstraints__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2158:1: ( ( ( rule__PolyTypeConstraints__TypeNameAssignment_2_1 ) ) )
            // InternalMyDsl.g:2159:1: ( ( rule__PolyTypeConstraints__TypeNameAssignment_2_1 ) )
            {
            // InternalMyDsl.g:2159:1: ( ( rule__PolyTypeConstraints__TypeNameAssignment_2_1 ) )
            // InternalMyDsl.g:2160:2: ( rule__PolyTypeConstraints__TypeNameAssignment_2_1 )
            {
             before(grammarAccess.getPolyTypeConstraintsAccess().getTypeNameAssignment_2_1()); 
            // InternalMyDsl.g:2161:2: ( rule__PolyTypeConstraints__TypeNameAssignment_2_1 )
            // InternalMyDsl.g:2161:3: rule__PolyTypeConstraints__TypeNameAssignment_2_1
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
    // InternalMyDsl.g:2170:1: rule__SuperTypeList__Group__0 : rule__SuperTypeList__Group__0__Impl rule__SuperTypeList__Group__1 ;
    public final void rule__SuperTypeList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2174:1: ( rule__SuperTypeList__Group__0__Impl rule__SuperTypeList__Group__1 )
            // InternalMyDsl.g:2175:2: rule__SuperTypeList__Group__0__Impl rule__SuperTypeList__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalMyDsl.g:2182:1: rule__SuperTypeList__Group__0__Impl : ( ':' ) ;
    public final void rule__SuperTypeList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2186:1: ( ( ':' ) )
            // InternalMyDsl.g:2187:1: ( ':' )
            {
            // InternalMyDsl.g:2187:1: ( ':' )
            // InternalMyDsl.g:2188:2: ':'
            {
             before(grammarAccess.getSuperTypeListAccess().getColonKeyword_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalMyDsl.g:2197:1: rule__SuperTypeList__Group__1 : rule__SuperTypeList__Group__1__Impl rule__SuperTypeList__Group__2 ;
    public final void rule__SuperTypeList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2201:1: ( rule__SuperTypeList__Group__1__Impl rule__SuperTypeList__Group__2 )
            // InternalMyDsl.g:2202:2: rule__SuperTypeList__Group__1__Impl rule__SuperTypeList__Group__2
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
    // InternalMyDsl.g:2209:1: rule__SuperTypeList__Group__1__Impl : ( ( rule__SuperTypeList__SuperTypeAssignment_1 ) ) ;
    public final void rule__SuperTypeList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2213:1: ( ( ( rule__SuperTypeList__SuperTypeAssignment_1 ) ) )
            // InternalMyDsl.g:2214:1: ( ( rule__SuperTypeList__SuperTypeAssignment_1 ) )
            {
            // InternalMyDsl.g:2214:1: ( ( rule__SuperTypeList__SuperTypeAssignment_1 ) )
            // InternalMyDsl.g:2215:2: ( rule__SuperTypeList__SuperTypeAssignment_1 )
            {
             before(grammarAccess.getSuperTypeListAccess().getSuperTypeAssignment_1()); 
            // InternalMyDsl.g:2216:2: ( rule__SuperTypeList__SuperTypeAssignment_1 )
            // InternalMyDsl.g:2216:3: rule__SuperTypeList__SuperTypeAssignment_1
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
    // InternalMyDsl.g:2224:1: rule__SuperTypeList__Group__2 : rule__SuperTypeList__Group__2__Impl ;
    public final void rule__SuperTypeList__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2228:1: ( rule__SuperTypeList__Group__2__Impl )
            // InternalMyDsl.g:2229:2: rule__SuperTypeList__Group__2__Impl
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
    // InternalMyDsl.g:2235:1: rule__SuperTypeList__Group__2__Impl : ( ( rule__SuperTypeList__Group_2__0 )* ) ;
    public final void rule__SuperTypeList__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2239:1: ( ( ( rule__SuperTypeList__Group_2__0 )* ) )
            // InternalMyDsl.g:2240:1: ( ( rule__SuperTypeList__Group_2__0 )* )
            {
            // InternalMyDsl.g:2240:1: ( ( rule__SuperTypeList__Group_2__0 )* )
            // InternalMyDsl.g:2241:2: ( rule__SuperTypeList__Group_2__0 )*
            {
             before(grammarAccess.getSuperTypeListAccess().getGroup_2()); 
            // InternalMyDsl.g:2242:2: ( rule__SuperTypeList__Group_2__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==33) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalMyDsl.g:2242:3: rule__SuperTypeList__Group_2__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__SuperTypeList__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalMyDsl.g:2251:1: rule__SuperTypeList__Group_2__0 : rule__SuperTypeList__Group_2__0__Impl rule__SuperTypeList__Group_2__1 ;
    public final void rule__SuperTypeList__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2255:1: ( rule__SuperTypeList__Group_2__0__Impl rule__SuperTypeList__Group_2__1 )
            // InternalMyDsl.g:2256:2: rule__SuperTypeList__Group_2__0__Impl rule__SuperTypeList__Group_2__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalMyDsl.g:2263:1: rule__SuperTypeList__Group_2__0__Impl : ( ',' ) ;
    public final void rule__SuperTypeList__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2267:1: ( ( ',' ) )
            // InternalMyDsl.g:2268:1: ( ',' )
            {
            // InternalMyDsl.g:2268:1: ( ',' )
            // InternalMyDsl.g:2269:2: ','
            {
             before(grammarAccess.getSuperTypeListAccess().getCommaKeyword_2_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalMyDsl.g:2278:1: rule__SuperTypeList__Group_2__1 : rule__SuperTypeList__Group_2__1__Impl ;
    public final void rule__SuperTypeList__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2282:1: ( rule__SuperTypeList__Group_2__1__Impl )
            // InternalMyDsl.g:2283:2: rule__SuperTypeList__Group_2__1__Impl
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
    // InternalMyDsl.g:2289:1: rule__SuperTypeList__Group_2__1__Impl : ( ( rule__SuperTypeList__SuperTypeAssignment_2_1 ) ) ;
    public final void rule__SuperTypeList__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2293:1: ( ( ( rule__SuperTypeList__SuperTypeAssignment_2_1 ) ) )
            // InternalMyDsl.g:2294:1: ( ( rule__SuperTypeList__SuperTypeAssignment_2_1 ) )
            {
            // InternalMyDsl.g:2294:1: ( ( rule__SuperTypeList__SuperTypeAssignment_2_1 ) )
            // InternalMyDsl.g:2295:2: ( rule__SuperTypeList__SuperTypeAssignment_2_1 )
            {
             before(grammarAccess.getSuperTypeListAccess().getSuperTypeAssignment_2_1()); 
            // InternalMyDsl.g:2296:2: ( rule__SuperTypeList__SuperTypeAssignment_2_1 )
            // InternalMyDsl.g:2296:3: rule__SuperTypeList__SuperTypeAssignment_2_1
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
    // InternalMyDsl.g:2305:1: rule__ConstructedType__Group__0 : rule__ConstructedType__Group__0__Impl rule__ConstructedType__Group__1 ;
    public final void rule__ConstructedType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2309:1: ( rule__ConstructedType__Group__0__Impl rule__ConstructedType__Group__1 )
            // InternalMyDsl.g:2310:2: rule__ConstructedType__Group__0__Impl rule__ConstructedType__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalMyDsl.g:2317:1: rule__ConstructedType__Group__0__Impl : ( ( rule__ConstructedType__TypeAssignment_0 ) ) ;
    public final void rule__ConstructedType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2321:1: ( ( ( rule__ConstructedType__TypeAssignment_0 ) ) )
            // InternalMyDsl.g:2322:1: ( ( rule__ConstructedType__TypeAssignment_0 ) )
            {
            // InternalMyDsl.g:2322:1: ( ( rule__ConstructedType__TypeAssignment_0 ) )
            // InternalMyDsl.g:2323:2: ( rule__ConstructedType__TypeAssignment_0 )
            {
             before(grammarAccess.getConstructedTypeAccess().getTypeAssignment_0()); 
            // InternalMyDsl.g:2324:2: ( rule__ConstructedType__TypeAssignment_0 )
            // InternalMyDsl.g:2324:3: rule__ConstructedType__TypeAssignment_0
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
    // InternalMyDsl.g:2332:1: rule__ConstructedType__Group__1 : rule__ConstructedType__Group__1__Impl ;
    public final void rule__ConstructedType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2336:1: ( rule__ConstructedType__Group__1__Impl )
            // InternalMyDsl.g:2337:2: rule__ConstructedType__Group__1__Impl
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
    // InternalMyDsl.g:2343:1: rule__ConstructedType__Group__1__Impl : ( ( rule__ConstructedType__Group_1__0 )? ) ;
    public final void rule__ConstructedType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2347:1: ( ( ( rule__ConstructedType__Group_1__0 )? ) )
            // InternalMyDsl.g:2348:1: ( ( rule__ConstructedType__Group_1__0 )? )
            {
            // InternalMyDsl.g:2348:1: ( ( rule__ConstructedType__Group_1__0 )? )
            // InternalMyDsl.g:2349:2: ( rule__ConstructedType__Group_1__0 )?
            {
             before(grammarAccess.getConstructedTypeAccess().getGroup_1()); 
            // InternalMyDsl.g:2350:2: ( rule__ConstructedType__Group_1__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=12 && LA22_0<=21)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalMyDsl.g:2350:3: rule__ConstructedType__Group_1__0
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
    // InternalMyDsl.g:2359:1: rule__ConstructedType__Group_1__0 : rule__ConstructedType__Group_1__0__Impl rule__ConstructedType__Group_1__1 ;
    public final void rule__ConstructedType__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2363:1: ( rule__ConstructedType__Group_1__0__Impl rule__ConstructedType__Group_1__1 )
            // InternalMyDsl.g:2364:2: rule__ConstructedType__Group_1__0__Impl rule__ConstructedType__Group_1__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalMyDsl.g:2371:1: rule__ConstructedType__Group_1__0__Impl : ( ( rule__ConstructedType__Alternatives_1_0 ) ) ;
    public final void rule__ConstructedType__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2375:1: ( ( ( rule__ConstructedType__Alternatives_1_0 ) ) )
            // InternalMyDsl.g:2376:1: ( ( rule__ConstructedType__Alternatives_1_0 ) )
            {
            // InternalMyDsl.g:2376:1: ( ( rule__ConstructedType__Alternatives_1_0 ) )
            // InternalMyDsl.g:2377:2: ( rule__ConstructedType__Alternatives_1_0 )
            {
             before(grammarAccess.getConstructedTypeAccess().getAlternatives_1_0()); 
            // InternalMyDsl.g:2378:2: ( rule__ConstructedType__Alternatives_1_0 )
            // InternalMyDsl.g:2378:3: rule__ConstructedType__Alternatives_1_0
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
    // InternalMyDsl.g:2386:1: rule__ConstructedType__Group_1__1 : rule__ConstructedType__Group_1__1__Impl ;
    public final void rule__ConstructedType__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2390:1: ( rule__ConstructedType__Group_1__1__Impl )
            // InternalMyDsl.g:2391:2: rule__ConstructedType__Group_1__1__Impl
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
    // InternalMyDsl.g:2397:1: rule__ConstructedType__Group_1__1__Impl : ( ( rule__ConstructedType__TypeAssignment_1_1 ) ) ;
    public final void rule__ConstructedType__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2401:1: ( ( ( rule__ConstructedType__TypeAssignment_1_1 ) ) )
            // InternalMyDsl.g:2402:1: ( ( rule__ConstructedType__TypeAssignment_1_1 ) )
            {
            // InternalMyDsl.g:2402:1: ( ( rule__ConstructedType__TypeAssignment_1_1 ) )
            // InternalMyDsl.g:2403:2: ( rule__ConstructedType__TypeAssignment_1_1 )
            {
             before(grammarAccess.getConstructedTypeAccess().getTypeAssignment_1_1()); 
            // InternalMyDsl.g:2404:2: ( rule__ConstructedType__TypeAssignment_1_1 )
            // InternalMyDsl.g:2404:3: rule__ConstructedType__TypeAssignment_1_1
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
    // InternalMyDsl.g:2413:1: rule__TypeConstructor__Group__0 : rule__TypeConstructor__Group__0__Impl rule__TypeConstructor__Group__1 ;
    public final void rule__TypeConstructor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2417:1: ( rule__TypeConstructor__Group__0__Impl rule__TypeConstructor__Group__1 )
            // InternalMyDsl.g:2418:2: rule__TypeConstructor__Group__0__Impl rule__TypeConstructor__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalMyDsl.g:2425:1: rule__TypeConstructor__Group__0__Impl : ( ( rule__TypeConstructor__TypeNameAssignment_0 ) ) ;
    public final void rule__TypeConstructor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2429:1: ( ( ( rule__TypeConstructor__TypeNameAssignment_0 ) ) )
            // InternalMyDsl.g:2430:1: ( ( rule__TypeConstructor__TypeNameAssignment_0 ) )
            {
            // InternalMyDsl.g:2430:1: ( ( rule__TypeConstructor__TypeNameAssignment_0 ) )
            // InternalMyDsl.g:2431:2: ( rule__TypeConstructor__TypeNameAssignment_0 )
            {
             before(grammarAccess.getTypeConstructorAccess().getTypeNameAssignment_0()); 
            // InternalMyDsl.g:2432:2: ( rule__TypeConstructor__TypeNameAssignment_0 )
            // InternalMyDsl.g:2432:3: rule__TypeConstructor__TypeNameAssignment_0
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
    // InternalMyDsl.g:2440:1: rule__TypeConstructor__Group__1 : rule__TypeConstructor__Group__1__Impl ;
    public final void rule__TypeConstructor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2444:1: ( rule__TypeConstructor__Group__1__Impl )
            // InternalMyDsl.g:2445:2: rule__TypeConstructor__Group__1__Impl
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
    // InternalMyDsl.g:2451:1: rule__TypeConstructor__Group__1__Impl : ( ( rule__TypeConstructor__ContextAssignment_1 )? ) ;
    public final void rule__TypeConstructor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2455:1: ( ( ( rule__TypeConstructor__ContextAssignment_1 )? ) )
            // InternalMyDsl.g:2456:1: ( ( rule__TypeConstructor__ContextAssignment_1 )? )
            {
            // InternalMyDsl.g:2456:1: ( ( rule__TypeConstructor__ContextAssignment_1 )? )
            // InternalMyDsl.g:2457:2: ( rule__TypeConstructor__ContextAssignment_1 )?
            {
             before(grammarAccess.getTypeConstructorAccess().getContextAssignment_1()); 
            // InternalMyDsl.g:2458:2: ( rule__TypeConstructor__ContextAssignment_1 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==31) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalMyDsl.g:2458:3: rule__TypeConstructor__ContextAssignment_1
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
    // InternalMyDsl.g:2467:1: rule__TypeDeclContext__Group__0 : rule__TypeDeclContext__Group__0__Impl rule__TypeDeclContext__Group__1 ;
    public final void rule__TypeDeclContext__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2471:1: ( rule__TypeDeclContext__Group__0__Impl rule__TypeDeclContext__Group__1 )
            // InternalMyDsl.g:2472:2: rule__TypeDeclContext__Group__0__Impl rule__TypeDeclContext__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalMyDsl.g:2479:1: rule__TypeDeclContext__Group__0__Impl : ( '<' ) ;
    public final void rule__TypeDeclContext__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2483:1: ( ( '<' ) )
            // InternalMyDsl.g:2484:1: ( '<' )
            {
            // InternalMyDsl.g:2484:1: ( '<' )
            // InternalMyDsl.g:2485:2: '<'
            {
             before(grammarAccess.getTypeDeclContextAccess().getLessThanSignKeyword_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalMyDsl.g:2494:1: rule__TypeDeclContext__Group__1 : rule__TypeDeclContext__Group__1__Impl rule__TypeDeclContext__Group__2 ;
    public final void rule__TypeDeclContext__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2498:1: ( rule__TypeDeclContext__Group__1__Impl rule__TypeDeclContext__Group__2 )
            // InternalMyDsl.g:2499:2: rule__TypeDeclContext__Group__1__Impl rule__TypeDeclContext__Group__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalMyDsl.g:2506:1: rule__TypeDeclContext__Group__1__Impl : ( ( rule__TypeDeclContext__TypeNameAssignment_1 ) ) ;
    public final void rule__TypeDeclContext__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2510:1: ( ( ( rule__TypeDeclContext__TypeNameAssignment_1 ) ) )
            // InternalMyDsl.g:2511:1: ( ( rule__TypeDeclContext__TypeNameAssignment_1 ) )
            {
            // InternalMyDsl.g:2511:1: ( ( rule__TypeDeclContext__TypeNameAssignment_1 ) )
            // InternalMyDsl.g:2512:2: ( rule__TypeDeclContext__TypeNameAssignment_1 )
            {
             before(grammarAccess.getTypeDeclContextAccess().getTypeNameAssignment_1()); 
            // InternalMyDsl.g:2513:2: ( rule__TypeDeclContext__TypeNameAssignment_1 )
            // InternalMyDsl.g:2513:3: rule__TypeDeclContext__TypeNameAssignment_1
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
    // InternalMyDsl.g:2521:1: rule__TypeDeclContext__Group__2 : rule__TypeDeclContext__Group__2__Impl rule__TypeDeclContext__Group__3 ;
    public final void rule__TypeDeclContext__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2525:1: ( rule__TypeDeclContext__Group__2__Impl rule__TypeDeclContext__Group__3 )
            // InternalMyDsl.g:2526:2: rule__TypeDeclContext__Group__2__Impl rule__TypeDeclContext__Group__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalMyDsl.g:2533:1: rule__TypeDeclContext__Group__2__Impl : ( ( rule__TypeDeclContext__Group_2__0 )* ) ;
    public final void rule__TypeDeclContext__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2537:1: ( ( ( rule__TypeDeclContext__Group_2__0 )* ) )
            // InternalMyDsl.g:2538:1: ( ( rule__TypeDeclContext__Group_2__0 )* )
            {
            // InternalMyDsl.g:2538:1: ( ( rule__TypeDeclContext__Group_2__0 )* )
            // InternalMyDsl.g:2539:2: ( rule__TypeDeclContext__Group_2__0 )*
            {
             before(grammarAccess.getTypeDeclContextAccess().getGroup_2()); 
            // InternalMyDsl.g:2540:2: ( rule__TypeDeclContext__Group_2__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==33) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalMyDsl.g:2540:3: rule__TypeDeclContext__Group_2__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__TypeDeclContext__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // InternalMyDsl.g:2548:1: rule__TypeDeclContext__Group__3 : rule__TypeDeclContext__Group__3__Impl ;
    public final void rule__TypeDeclContext__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2552:1: ( rule__TypeDeclContext__Group__3__Impl )
            // InternalMyDsl.g:2553:2: rule__TypeDeclContext__Group__3__Impl
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
    // InternalMyDsl.g:2559:1: rule__TypeDeclContext__Group__3__Impl : ( '>' ) ;
    public final void rule__TypeDeclContext__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2563:1: ( ( '>' ) )
            // InternalMyDsl.g:2564:1: ( '>' )
            {
            // InternalMyDsl.g:2564:1: ( '>' )
            // InternalMyDsl.g:2565:2: '>'
            {
             before(grammarAccess.getTypeDeclContextAccess().getGreaterThanSignKeyword_3()); 
            match(input,32,FOLLOW_2); 
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
    // InternalMyDsl.g:2575:1: rule__TypeDeclContext__Group_2__0 : rule__TypeDeclContext__Group_2__0__Impl rule__TypeDeclContext__Group_2__1 ;
    public final void rule__TypeDeclContext__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2579:1: ( rule__TypeDeclContext__Group_2__0__Impl rule__TypeDeclContext__Group_2__1 )
            // InternalMyDsl.g:2580:2: rule__TypeDeclContext__Group_2__0__Impl rule__TypeDeclContext__Group_2__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalMyDsl.g:2587:1: rule__TypeDeclContext__Group_2__0__Impl : ( ',' ) ;
    public final void rule__TypeDeclContext__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2591:1: ( ( ',' ) )
            // InternalMyDsl.g:2592:1: ( ',' )
            {
            // InternalMyDsl.g:2592:1: ( ',' )
            // InternalMyDsl.g:2593:2: ','
            {
             before(grammarAccess.getTypeDeclContextAccess().getCommaKeyword_2_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalMyDsl.g:2602:1: rule__TypeDeclContext__Group_2__1 : rule__TypeDeclContext__Group_2__1__Impl ;
    public final void rule__TypeDeclContext__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2606:1: ( rule__TypeDeclContext__Group_2__1__Impl )
            // InternalMyDsl.g:2607:2: rule__TypeDeclContext__Group_2__1__Impl
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
    // InternalMyDsl.g:2613:1: rule__TypeDeclContext__Group_2__1__Impl : ( ( rule__TypeDeclContext__TypeNameAssignment_2_1 ) ) ;
    public final void rule__TypeDeclContext__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2617:1: ( ( ( rule__TypeDeclContext__TypeNameAssignment_2_1 ) ) )
            // InternalMyDsl.g:2618:1: ( ( rule__TypeDeclContext__TypeNameAssignment_2_1 ) )
            {
            // InternalMyDsl.g:2618:1: ( ( rule__TypeDeclContext__TypeNameAssignment_2_1 ) )
            // InternalMyDsl.g:2619:2: ( rule__TypeDeclContext__TypeNameAssignment_2_1 )
            {
             before(grammarAccess.getTypeDeclContextAccess().getTypeNameAssignment_2_1()); 
            // InternalMyDsl.g:2620:2: ( rule__TypeDeclContext__TypeNameAssignment_2_1 )
            // InternalMyDsl.g:2620:3: rule__TypeDeclContext__TypeNameAssignment_2_1
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
    // InternalMyDsl.g:2629:1: rule__TypeStructure__Group__0 : rule__TypeStructure__Group__0__Impl rule__TypeStructure__Group__1 ;
    public final void rule__TypeStructure__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2633:1: ( rule__TypeStructure__Group__0__Impl rule__TypeStructure__Group__1 )
            // InternalMyDsl.g:2634:2: rule__TypeStructure__Group__0__Impl rule__TypeStructure__Group__1
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
    // InternalMyDsl.g:2641:1: rule__TypeStructure__Group__0__Impl : ( '(' ) ;
    public final void rule__TypeStructure__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2645:1: ( ( '(' ) )
            // InternalMyDsl.g:2646:1: ( '(' )
            {
            // InternalMyDsl.g:2646:1: ( '(' )
            // InternalMyDsl.g:2647:2: '('
            {
             before(grammarAccess.getTypeStructureAccess().getLeftParenthesisKeyword_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalMyDsl.g:2656:1: rule__TypeStructure__Group__1 : rule__TypeStructure__Group__1__Impl rule__TypeStructure__Group__2 ;
    public final void rule__TypeStructure__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2660:1: ( rule__TypeStructure__Group__1__Impl rule__TypeStructure__Group__2 )
            // InternalMyDsl.g:2661:2: rule__TypeStructure__Group__1__Impl rule__TypeStructure__Group__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalMyDsl.g:2668:1: rule__TypeStructure__Group__1__Impl : ( ( rule__TypeStructure__VariablesAssignment_1 ) ) ;
    public final void rule__TypeStructure__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2672:1: ( ( ( rule__TypeStructure__VariablesAssignment_1 ) ) )
            // InternalMyDsl.g:2673:1: ( ( rule__TypeStructure__VariablesAssignment_1 ) )
            {
            // InternalMyDsl.g:2673:1: ( ( rule__TypeStructure__VariablesAssignment_1 ) )
            // InternalMyDsl.g:2674:2: ( rule__TypeStructure__VariablesAssignment_1 )
            {
             before(grammarAccess.getTypeStructureAccess().getVariablesAssignment_1()); 
            // InternalMyDsl.g:2675:2: ( rule__TypeStructure__VariablesAssignment_1 )
            // InternalMyDsl.g:2675:3: rule__TypeStructure__VariablesAssignment_1
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
    // InternalMyDsl.g:2683:1: rule__TypeStructure__Group__2 : rule__TypeStructure__Group__2__Impl ;
    public final void rule__TypeStructure__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2687:1: ( rule__TypeStructure__Group__2__Impl )
            // InternalMyDsl.g:2688:2: rule__TypeStructure__Group__2__Impl
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
    // InternalMyDsl.g:2694:1: rule__TypeStructure__Group__2__Impl : ( ')' ) ;
    public final void rule__TypeStructure__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2698:1: ( ( ')' ) )
            // InternalMyDsl.g:2699:1: ( ')' )
            {
            // InternalMyDsl.g:2699:1: ( ')' )
            // InternalMyDsl.g:2700:2: ')'
            {
             before(grammarAccess.getTypeStructureAccess().getRightParenthesisKeyword_2()); 
            match(input,35,FOLLOW_2); 
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
    // InternalMyDsl.g:2710:1: rule__Where__Group__0 : rule__Where__Group__0__Impl rule__Where__Group__1 ;
    public final void rule__Where__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2714:1: ( rule__Where__Group__0__Impl rule__Where__Group__1 )
            // InternalMyDsl.g:2715:2: rule__Where__Group__0__Impl rule__Where__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalMyDsl.g:2722:1: rule__Where__Group__0__Impl : ( 'where' ) ;
    public final void rule__Where__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2726:1: ( ( 'where' ) )
            // InternalMyDsl.g:2727:1: ( 'where' )
            {
            // InternalMyDsl.g:2727:1: ( 'where' )
            // InternalMyDsl.g:2728:2: 'where'
            {
             before(grammarAccess.getWhereAccess().getWhereKeyword_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalMyDsl.g:2737:1: rule__Where__Group__1 : rule__Where__Group__1__Impl rule__Where__Group__2 ;
    public final void rule__Where__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2741:1: ( rule__Where__Group__1__Impl rule__Where__Group__2 )
            // InternalMyDsl.g:2742:2: rule__Where__Group__1__Impl rule__Where__Group__2
            {
            pushFollow(FOLLOW_21);
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
    // InternalMyDsl.g:2749:1: rule__Where__Group__1__Impl : ( ( rule__Where__ExpessionsAssignment_1 ) ) ;
    public final void rule__Where__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2753:1: ( ( ( rule__Where__ExpessionsAssignment_1 ) ) )
            // InternalMyDsl.g:2754:1: ( ( rule__Where__ExpessionsAssignment_1 ) )
            {
            // InternalMyDsl.g:2754:1: ( ( rule__Where__ExpessionsAssignment_1 ) )
            // InternalMyDsl.g:2755:2: ( rule__Where__ExpessionsAssignment_1 )
            {
             before(grammarAccess.getWhereAccess().getExpessionsAssignment_1()); 
            // InternalMyDsl.g:2756:2: ( rule__Where__ExpessionsAssignment_1 )
            // InternalMyDsl.g:2756:3: rule__Where__ExpessionsAssignment_1
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
    // InternalMyDsl.g:2764:1: rule__Where__Group__2 : rule__Where__Group__2__Impl ;
    public final void rule__Where__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2768:1: ( rule__Where__Group__2__Impl )
            // InternalMyDsl.g:2769:2: rule__Where__Group__2__Impl
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
    // InternalMyDsl.g:2775:1: rule__Where__Group__2__Impl : ( ( rule__Where__Group_2__0 )* ) ;
    public final void rule__Where__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2779:1: ( ( ( rule__Where__Group_2__0 )* ) )
            // InternalMyDsl.g:2780:1: ( ( rule__Where__Group_2__0 )* )
            {
            // InternalMyDsl.g:2780:1: ( ( rule__Where__Group_2__0 )* )
            // InternalMyDsl.g:2781:2: ( rule__Where__Group_2__0 )*
            {
             before(grammarAccess.getWhereAccess().getGroup_2()); 
            // InternalMyDsl.g:2782:2: ( rule__Where__Group_2__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==28) ) {
                    int LA25_2 = input.LA(2);

                    if ( (LA25_2==RULE_ID||LA25_2==11||(LA25_2>=22 && LA25_2<=23)||LA25_2==34) ) {
                        alt25=1;
                    }


                }


                switch (alt25) {
            	case 1 :
            	    // InternalMyDsl.g:2782:3: rule__Where__Group_2__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__Where__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // InternalMyDsl.g:2791:1: rule__Where__Group_2__0 : rule__Where__Group_2__0__Impl rule__Where__Group_2__1 ;
    public final void rule__Where__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2795:1: ( rule__Where__Group_2__0__Impl rule__Where__Group_2__1 )
            // InternalMyDsl.g:2796:2: rule__Where__Group_2__0__Impl rule__Where__Group_2__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalMyDsl.g:2803:1: rule__Where__Group_2__0__Impl : ( ';' ) ;
    public final void rule__Where__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2807:1: ( ( ';' ) )
            // InternalMyDsl.g:2808:1: ( ';' )
            {
            // InternalMyDsl.g:2808:1: ( ';' )
            // InternalMyDsl.g:2809:2: ';'
            {
             before(grammarAccess.getWhereAccess().getSemicolonKeyword_2_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalMyDsl.g:2818:1: rule__Where__Group_2__1 : rule__Where__Group_2__1__Impl ;
    public final void rule__Where__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2822:1: ( rule__Where__Group_2__1__Impl )
            // InternalMyDsl.g:2823:2: rule__Where__Group_2__1__Impl
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
    // InternalMyDsl.g:2829:1: rule__Where__Group_2__1__Impl : ( ( rule__Where__ExpressionsAssignment_2_1 ) ) ;
    public final void rule__Where__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2833:1: ( ( ( rule__Where__ExpressionsAssignment_2_1 ) ) )
            // InternalMyDsl.g:2834:1: ( ( rule__Where__ExpressionsAssignment_2_1 ) )
            {
            // InternalMyDsl.g:2834:1: ( ( rule__Where__ExpressionsAssignment_2_1 ) )
            // InternalMyDsl.g:2835:2: ( rule__Where__ExpressionsAssignment_2_1 )
            {
             before(grammarAccess.getWhereAccess().getExpressionsAssignment_2_1()); 
            // InternalMyDsl.g:2836:2: ( rule__Where__ExpressionsAssignment_2_1 )
            // InternalMyDsl.g:2836:3: rule__Where__ExpressionsAssignment_2_1
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
    // InternalMyDsl.g:2845:1: rule__Datatype__Group__0 : rule__Datatype__Group__0__Impl rule__Datatype__Group__1 ;
    public final void rule__Datatype__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2849:1: ( rule__Datatype__Group__0__Impl rule__Datatype__Group__1 )
            // InternalMyDsl.g:2850:2: rule__Datatype__Group__0__Impl rule__Datatype__Group__1
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
    // InternalMyDsl.g:2857:1: rule__Datatype__Group__0__Impl : ( 'Datatype' ) ;
    public final void rule__Datatype__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2861:1: ( ( 'Datatype' ) )
            // InternalMyDsl.g:2862:1: ( 'Datatype' )
            {
            // InternalMyDsl.g:2862:1: ( 'Datatype' )
            // InternalMyDsl.g:2863:2: 'Datatype'
            {
             before(grammarAccess.getDatatypeAccess().getDatatypeKeyword_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalMyDsl.g:2872:1: rule__Datatype__Group__1 : rule__Datatype__Group__1__Impl rule__Datatype__Group__2 ;
    public final void rule__Datatype__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2876:1: ( rule__Datatype__Group__1__Impl rule__Datatype__Group__2 )
            // InternalMyDsl.g:2877:2: rule__Datatype__Group__1__Impl rule__Datatype__Group__2
            {
            pushFollow(FOLLOW_23);
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
    // InternalMyDsl.g:2884:1: rule__Datatype__Group__1__Impl : ( ( rule__Datatype__NameAssignment_1 ) ) ;
    public final void rule__Datatype__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2888:1: ( ( ( rule__Datatype__NameAssignment_1 ) ) )
            // InternalMyDsl.g:2889:1: ( ( rule__Datatype__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:2889:1: ( ( rule__Datatype__NameAssignment_1 ) )
            // InternalMyDsl.g:2890:2: ( rule__Datatype__NameAssignment_1 )
            {
             before(grammarAccess.getDatatypeAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:2891:2: ( rule__Datatype__NameAssignment_1 )
            // InternalMyDsl.g:2891:3: rule__Datatype__NameAssignment_1
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
    // InternalMyDsl.g:2899:1: rule__Datatype__Group__2 : rule__Datatype__Group__2__Impl rule__Datatype__Group__3 ;
    public final void rule__Datatype__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2903:1: ( rule__Datatype__Group__2__Impl rule__Datatype__Group__3 )
            // InternalMyDsl.g:2904:2: rule__Datatype__Group__2__Impl rule__Datatype__Group__3
            {
            pushFollow(FOLLOW_23);
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
    // InternalMyDsl.g:2911:1: rule__Datatype__Group__2__Impl : ( ( rule__Datatype__ContextAssignment_2 )? ) ;
    public final void rule__Datatype__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2915:1: ( ( ( rule__Datatype__ContextAssignment_2 )? ) )
            // InternalMyDsl.g:2916:1: ( ( rule__Datatype__ContextAssignment_2 )? )
            {
            // InternalMyDsl.g:2916:1: ( ( rule__Datatype__ContextAssignment_2 )? )
            // InternalMyDsl.g:2917:2: ( rule__Datatype__ContextAssignment_2 )?
            {
             before(grammarAccess.getDatatypeAccess().getContextAssignment_2()); 
            // InternalMyDsl.g:2918:2: ( rule__Datatype__ContextAssignment_2 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==31) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalMyDsl.g:2918:3: rule__Datatype__ContextAssignment_2
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
    // InternalMyDsl.g:2926:1: rule__Datatype__Group__3 : rule__Datatype__Group__3__Impl rule__Datatype__Group__4 ;
    public final void rule__Datatype__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2930:1: ( rule__Datatype__Group__3__Impl rule__Datatype__Group__4 )
            // InternalMyDsl.g:2931:2: rule__Datatype__Group__3__Impl rule__Datatype__Group__4
            {
            pushFollow(FOLLOW_23);
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
    // InternalMyDsl.g:2938:1: rule__Datatype__Group__3__Impl : ( ( rule__Datatype__ConstructorsAssignment_3 )* ) ;
    public final void rule__Datatype__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2942:1: ( ( ( rule__Datatype__ConstructorsAssignment_3 )* ) )
            // InternalMyDsl.g:2943:1: ( ( rule__Datatype__ConstructorsAssignment_3 )* )
            {
            // InternalMyDsl.g:2943:1: ( ( rule__Datatype__ConstructorsAssignment_3 )* )
            // InternalMyDsl.g:2944:2: ( rule__Datatype__ConstructorsAssignment_3 )*
            {
             before(grammarAccess.getDatatypeAccess().getConstructorsAssignment_3()); 
            // InternalMyDsl.g:2945:2: ( rule__Datatype__ConstructorsAssignment_3 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==38) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalMyDsl.g:2945:3: rule__Datatype__ConstructorsAssignment_3
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__Datatype__ConstructorsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getDatatypeAccess().getConstructorsAssignment_3()); 

            }


            }

        }
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
    // InternalMyDsl.g:2953:1: rule__Datatype__Group__4 : rule__Datatype__Group__4__Impl rule__Datatype__Group__5 ;
    public final void rule__Datatype__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2957:1: ( rule__Datatype__Group__4__Impl rule__Datatype__Group__5 )
            // InternalMyDsl.g:2958:2: rule__Datatype__Group__4__Impl rule__Datatype__Group__5
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
    // InternalMyDsl.g:2965:1: rule__Datatype__Group__4__Impl : ( '{' ) ;
    public final void rule__Datatype__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2969:1: ( ( '{' ) )
            // InternalMyDsl.g:2970:1: ( '{' )
            {
            // InternalMyDsl.g:2970:1: ( '{' )
            // InternalMyDsl.g:2971:2: '{'
            {
             before(grammarAccess.getDatatypeAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,29,FOLLOW_2); 
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
    // InternalMyDsl.g:2980:1: rule__Datatype__Group__5 : rule__Datatype__Group__5__Impl rule__Datatype__Group__6 ;
    public final void rule__Datatype__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2984:1: ( rule__Datatype__Group__5__Impl rule__Datatype__Group__6 )
            // InternalMyDsl.g:2985:2: rule__Datatype__Group__5__Impl rule__Datatype__Group__6
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
    // InternalMyDsl.g:2992:1: rule__Datatype__Group__5__Impl : ( ( rule__Datatype__BodyElementsAssignment_5 )* ) ;
    public final void rule__Datatype__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2996:1: ( ( ( rule__Datatype__BodyElementsAssignment_5 )* ) )
            // InternalMyDsl.g:2997:1: ( ( rule__Datatype__BodyElementsAssignment_5 )* )
            {
            // InternalMyDsl.g:2997:1: ( ( rule__Datatype__BodyElementsAssignment_5 )* )
            // InternalMyDsl.g:2998:2: ( rule__Datatype__BodyElementsAssignment_5 )*
            {
             before(grammarAccess.getDatatypeAccess().getBodyElementsAssignment_5()); 
            // InternalMyDsl.g:2999:2: ( rule__Datatype__BodyElementsAssignment_5 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_ID||LA28_0==40) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalMyDsl.g:2999:3: rule__Datatype__BodyElementsAssignment_5
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Datatype__BodyElementsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
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
    // InternalMyDsl.g:3007:1: rule__Datatype__Group__6 : rule__Datatype__Group__6__Impl ;
    public final void rule__Datatype__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3011:1: ( rule__Datatype__Group__6__Impl )
            // InternalMyDsl.g:3012:2: rule__Datatype__Group__6__Impl
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
    // InternalMyDsl.g:3018:1: rule__Datatype__Group__6__Impl : ( '}' ) ;
    public final void rule__Datatype__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3022:1: ( ( '}' ) )
            // InternalMyDsl.g:3023:1: ( '}' )
            {
            // InternalMyDsl.g:3023:1: ( '}' )
            // InternalMyDsl.g:3024:2: '}'
            {
             before(grammarAccess.getDatatypeAccess().getRightCurlyBracketKeyword_6()); 
            match(input,30,FOLLOW_2); 
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


    // $ANTLR start "rule__DatatypeConstructor__Group__0"
    // InternalMyDsl.g:3034:1: rule__DatatypeConstructor__Group__0 : rule__DatatypeConstructor__Group__0__Impl rule__DatatypeConstructor__Group__1 ;
    public final void rule__DatatypeConstructor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3038:1: ( rule__DatatypeConstructor__Group__0__Impl rule__DatatypeConstructor__Group__1 )
            // InternalMyDsl.g:3039:2: rule__DatatypeConstructor__Group__0__Impl rule__DatatypeConstructor__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalMyDsl.g:3046:1: rule__DatatypeConstructor__Group__0__Impl : ( '|' ) ;
    public final void rule__DatatypeConstructor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3050:1: ( ( '|' ) )
            // InternalMyDsl.g:3051:1: ( '|' )
            {
            // InternalMyDsl.g:3051:1: ( '|' )
            // InternalMyDsl.g:3052:2: '|'
            {
             before(grammarAccess.getDatatypeConstructorAccess().getVerticalLineKeyword_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getDatatypeConstructorAccess().getVerticalLineKeyword_0()); 

            }


            }

        }
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
    // InternalMyDsl.g:3061:1: rule__DatatypeConstructor__Group__1 : rule__DatatypeConstructor__Group__1__Impl ;
    public final void rule__DatatypeConstructor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3065:1: ( rule__DatatypeConstructor__Group__1__Impl )
            // InternalMyDsl.g:3066:2: rule__DatatypeConstructor__Group__1__Impl
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
    // InternalMyDsl.g:3072:1: rule__DatatypeConstructor__Group__1__Impl : ( ( rule__DatatypeConstructor__Alternatives_1 ) ) ;
    public final void rule__DatatypeConstructor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3076:1: ( ( ( rule__DatatypeConstructor__Alternatives_1 ) ) )
            // InternalMyDsl.g:3077:1: ( ( rule__DatatypeConstructor__Alternatives_1 ) )
            {
            // InternalMyDsl.g:3077:1: ( ( rule__DatatypeConstructor__Alternatives_1 ) )
            // InternalMyDsl.g:3078:2: ( rule__DatatypeConstructor__Alternatives_1 )
            {
             before(grammarAccess.getDatatypeConstructorAccess().getAlternatives_1()); 
            // InternalMyDsl.g:3079:2: ( rule__DatatypeConstructor__Alternatives_1 )
            // InternalMyDsl.g:3079:3: rule__DatatypeConstructor__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__DatatypeConstructor__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getDatatypeConstructorAccess().getAlternatives_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__DTypeConstructor__Group__0"
    // InternalMyDsl.g:3088:1: rule__DTypeConstructor__Group__0 : rule__DTypeConstructor__Group__0__Impl rule__DTypeConstructor__Group__1 ;
    public final void rule__DTypeConstructor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3092:1: ( rule__DTypeConstructor__Group__0__Impl rule__DTypeConstructor__Group__1 )
            // InternalMyDsl.g:3093:2: rule__DTypeConstructor__Group__0__Impl rule__DTypeConstructor__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__DTypeConstructor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DTypeConstructor__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DTypeConstructor__Group__0"


    // $ANTLR start "rule__DTypeConstructor__Group__0__Impl"
    // InternalMyDsl.g:3100:1: rule__DTypeConstructor__Group__0__Impl : ( ( rule__DTypeConstructor__NameAssignment_0 ) ) ;
    public final void rule__DTypeConstructor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3104:1: ( ( ( rule__DTypeConstructor__NameAssignment_0 ) ) )
            // InternalMyDsl.g:3105:1: ( ( rule__DTypeConstructor__NameAssignment_0 ) )
            {
            // InternalMyDsl.g:3105:1: ( ( rule__DTypeConstructor__NameAssignment_0 ) )
            // InternalMyDsl.g:3106:2: ( rule__DTypeConstructor__NameAssignment_0 )
            {
             before(grammarAccess.getDTypeConstructorAccess().getNameAssignment_0()); 
            // InternalMyDsl.g:3107:2: ( rule__DTypeConstructor__NameAssignment_0 )
            // InternalMyDsl.g:3107:3: rule__DTypeConstructor__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__DTypeConstructor__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDTypeConstructorAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DTypeConstructor__Group__0__Impl"


    // $ANTLR start "rule__DTypeConstructor__Group__1"
    // InternalMyDsl.g:3115:1: rule__DTypeConstructor__Group__1 : rule__DTypeConstructor__Group__1__Impl rule__DTypeConstructor__Group__2 ;
    public final void rule__DTypeConstructor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3119:1: ( rule__DTypeConstructor__Group__1__Impl rule__DTypeConstructor__Group__2 )
            // InternalMyDsl.g:3120:2: rule__DTypeConstructor__Group__1__Impl rule__DTypeConstructor__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__DTypeConstructor__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DTypeConstructor__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DTypeConstructor__Group__1"


    // $ANTLR start "rule__DTypeConstructor__Group__1__Impl"
    // InternalMyDsl.g:3127:1: rule__DTypeConstructor__Group__1__Impl : ( '(' ) ;
    public final void rule__DTypeConstructor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3131:1: ( ( '(' ) )
            // InternalMyDsl.g:3132:1: ( '(' )
            {
            // InternalMyDsl.g:3132:1: ( '(' )
            // InternalMyDsl.g:3133:2: '('
            {
             before(grammarAccess.getDTypeConstructorAccess().getLeftParenthesisKeyword_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getDTypeConstructorAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DTypeConstructor__Group__1__Impl"


    // $ANTLR start "rule__DTypeConstructor__Group__2"
    // InternalMyDsl.g:3142:1: rule__DTypeConstructor__Group__2 : rule__DTypeConstructor__Group__2__Impl rule__DTypeConstructor__Group__3 ;
    public final void rule__DTypeConstructor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3146:1: ( rule__DTypeConstructor__Group__2__Impl rule__DTypeConstructor__Group__3 )
            // InternalMyDsl.g:3147:2: rule__DTypeConstructor__Group__2__Impl rule__DTypeConstructor__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__DTypeConstructor__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DTypeConstructor__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DTypeConstructor__Group__2"


    // $ANTLR start "rule__DTypeConstructor__Group__2__Impl"
    // InternalMyDsl.g:3154:1: rule__DTypeConstructor__Group__2__Impl : ( ( rule__DTypeConstructor__DeconsAssignment_2 ) ) ;
    public final void rule__DTypeConstructor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3158:1: ( ( ( rule__DTypeConstructor__DeconsAssignment_2 ) ) )
            // InternalMyDsl.g:3159:1: ( ( rule__DTypeConstructor__DeconsAssignment_2 ) )
            {
            // InternalMyDsl.g:3159:1: ( ( rule__DTypeConstructor__DeconsAssignment_2 ) )
            // InternalMyDsl.g:3160:2: ( rule__DTypeConstructor__DeconsAssignment_2 )
            {
             before(grammarAccess.getDTypeConstructorAccess().getDeconsAssignment_2()); 
            // InternalMyDsl.g:3161:2: ( rule__DTypeConstructor__DeconsAssignment_2 )
            // InternalMyDsl.g:3161:3: rule__DTypeConstructor__DeconsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__DTypeConstructor__DeconsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDTypeConstructorAccess().getDeconsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DTypeConstructor__Group__2__Impl"


    // $ANTLR start "rule__DTypeConstructor__Group__3"
    // InternalMyDsl.g:3169:1: rule__DTypeConstructor__Group__3 : rule__DTypeConstructor__Group__3__Impl ;
    public final void rule__DTypeConstructor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3173:1: ( rule__DTypeConstructor__Group__3__Impl )
            // InternalMyDsl.g:3174:2: rule__DTypeConstructor__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DTypeConstructor__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DTypeConstructor__Group__3"


    // $ANTLR start "rule__DTypeConstructor__Group__3__Impl"
    // InternalMyDsl.g:3180:1: rule__DTypeConstructor__Group__3__Impl : ( ')' ) ;
    public final void rule__DTypeConstructor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3184:1: ( ( ')' ) )
            // InternalMyDsl.g:3185:1: ( ')' )
            {
            // InternalMyDsl.g:3185:1: ( ')' )
            // InternalMyDsl.g:3186:2: ')'
            {
             before(grammarAccess.getDTypeConstructorAccess().getRightParenthesisKeyword_3()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getDTypeConstructorAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DTypeConstructor__Group__3__Impl"


    // $ANTLR start "rule__Extend__Group__0"
    // InternalMyDsl.g:3196:1: rule__Extend__Group__0 : rule__Extend__Group__0__Impl rule__Extend__Group__1 ;
    public final void rule__Extend__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3200:1: ( rule__Extend__Group__0__Impl rule__Extend__Group__1 )
            // InternalMyDsl.g:3201:2: rule__Extend__Group__0__Impl rule__Extend__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalMyDsl.g:3208:1: rule__Extend__Group__0__Impl : ( ( rule__Extend__NameAssignment_0 ) ) ;
    public final void rule__Extend__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3212:1: ( ( ( rule__Extend__NameAssignment_0 ) ) )
            // InternalMyDsl.g:3213:1: ( ( rule__Extend__NameAssignment_0 ) )
            {
            // InternalMyDsl.g:3213:1: ( ( rule__Extend__NameAssignment_0 ) )
            // InternalMyDsl.g:3214:2: ( rule__Extend__NameAssignment_0 )
            {
             before(grammarAccess.getExtendAccess().getNameAssignment_0()); 
            // InternalMyDsl.g:3215:2: ( rule__Extend__NameAssignment_0 )
            // InternalMyDsl.g:3215:3: rule__Extend__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Extend__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getExtendAccess().getNameAssignment_0()); 

            }


            }

        }
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
    // InternalMyDsl.g:3223:1: rule__Extend__Group__1 : rule__Extend__Group__1__Impl rule__Extend__Group__2 ;
    public final void rule__Extend__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3227:1: ( rule__Extend__Group__1__Impl rule__Extend__Group__2 )
            // InternalMyDsl.g:3228:2: rule__Extend__Group__1__Impl rule__Extend__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalMyDsl.g:3235:1: rule__Extend__Group__1__Impl : ( '(' ) ;
    public final void rule__Extend__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3239:1: ( ( '(' ) )
            // InternalMyDsl.g:3240:1: ( '(' )
            {
            // InternalMyDsl.g:3240:1: ( '(' )
            // InternalMyDsl.g:3241:2: '('
            {
             before(grammarAccess.getExtendAccess().getLeftParenthesisKeyword_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getExtendAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
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
    // InternalMyDsl.g:3250:1: rule__Extend__Group__2 : rule__Extend__Group__2__Impl rule__Extend__Group__3 ;
    public final void rule__Extend__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3254:1: ( rule__Extend__Group__2__Impl rule__Extend__Group__3 )
            // InternalMyDsl.g:3255:2: rule__Extend__Group__2__Impl rule__Extend__Group__3
            {
            pushFollow(FOLLOW_19);
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
    // InternalMyDsl.g:3262:1: rule__Extend__Group__2__Impl : ( ( rule__Extend__ExtesnionAssignment_2 ) ) ;
    public final void rule__Extend__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3266:1: ( ( ( rule__Extend__ExtesnionAssignment_2 ) ) )
            // InternalMyDsl.g:3267:1: ( ( rule__Extend__ExtesnionAssignment_2 ) )
            {
            // InternalMyDsl.g:3267:1: ( ( rule__Extend__ExtesnionAssignment_2 ) )
            // InternalMyDsl.g:3268:2: ( rule__Extend__ExtesnionAssignment_2 )
            {
             before(grammarAccess.getExtendAccess().getExtesnionAssignment_2()); 
            // InternalMyDsl.g:3269:2: ( rule__Extend__ExtesnionAssignment_2 )
            // InternalMyDsl.g:3269:3: rule__Extend__ExtesnionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Extend__ExtesnionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getExtendAccess().getExtesnionAssignment_2()); 

            }


            }

        }
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
    // InternalMyDsl.g:3277:1: rule__Extend__Group__3 : rule__Extend__Group__3__Impl rule__Extend__Group__4 ;
    public final void rule__Extend__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3281:1: ( rule__Extend__Group__3__Impl rule__Extend__Group__4 )
            // InternalMyDsl.g:3282:2: rule__Extend__Group__3__Impl rule__Extend__Group__4
            {
            pushFollow(FOLLOW_26);
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
    // InternalMyDsl.g:3289:1: rule__Extend__Group__3__Impl : ( ')' ) ;
    public final void rule__Extend__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3293:1: ( ( ')' ) )
            // InternalMyDsl.g:3294:1: ( ')' )
            {
            // InternalMyDsl.g:3294:1: ( ')' )
            // InternalMyDsl.g:3295:2: ')'
            {
             before(grammarAccess.getExtendAccess().getRightParenthesisKeyword_3()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getExtendAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
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
    // InternalMyDsl.g:3304:1: rule__Extend__Group__4 : rule__Extend__Group__4__Impl rule__Extend__Group__5 ;
    public final void rule__Extend__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3308:1: ( rule__Extend__Group__4__Impl rule__Extend__Group__5 )
            // InternalMyDsl.g:3309:2: rule__Extend__Group__4__Impl rule__Extend__Group__5
            {
            pushFollow(FOLLOW_9);
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
    // InternalMyDsl.g:3316:1: rule__Extend__Group__4__Impl : ( '{' ) ;
    public final void rule__Extend__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3320:1: ( ( '{' ) )
            // InternalMyDsl.g:3321:1: ( '{' )
            {
            // InternalMyDsl.g:3321:1: ( '{' )
            // InternalMyDsl.g:3322:2: '{'
            {
             before(grammarAccess.getExtendAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getExtendAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
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
    // InternalMyDsl.g:3331:1: rule__Extend__Group__5 : rule__Extend__Group__5__Impl rule__Extend__Group__6 ;
    public final void rule__Extend__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3335:1: ( rule__Extend__Group__5__Impl rule__Extend__Group__6 )
            // InternalMyDsl.g:3336:2: rule__Extend__Group__5__Impl rule__Extend__Group__6
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
    // InternalMyDsl.g:3343:1: rule__Extend__Group__5__Impl : ( ( rule__Extend__BodyElementsAssignment_5 )* ) ;
    public final void rule__Extend__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3347:1: ( ( ( rule__Extend__BodyElementsAssignment_5 )* ) )
            // InternalMyDsl.g:3348:1: ( ( rule__Extend__BodyElementsAssignment_5 )* )
            {
            // InternalMyDsl.g:3348:1: ( ( rule__Extend__BodyElementsAssignment_5 )* )
            // InternalMyDsl.g:3349:2: ( rule__Extend__BodyElementsAssignment_5 )*
            {
             before(grammarAccess.getExtendAccess().getBodyElementsAssignment_5()); 
            // InternalMyDsl.g:3350:2: ( rule__Extend__BodyElementsAssignment_5 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_ID||LA29_0==40) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalMyDsl.g:3350:3: rule__Extend__BodyElementsAssignment_5
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Extend__BodyElementsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getExtendAccess().getBodyElementsAssignment_5()); 

            }


            }

        }
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
    // InternalMyDsl.g:3358:1: rule__Extend__Group__6 : rule__Extend__Group__6__Impl ;
    public final void rule__Extend__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3362:1: ( rule__Extend__Group__6__Impl )
            // InternalMyDsl.g:3363:2: rule__Extend__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Extend__Group__6__Impl();

            state._fsp--;


            }

        }
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
    // InternalMyDsl.g:3369:1: rule__Extend__Group__6__Impl : ( '}' ) ;
    public final void rule__Extend__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3373:1: ( ( '}' ) )
            // InternalMyDsl.g:3374:1: ( '}' )
            {
            // InternalMyDsl.g:3374:1: ( '}' )
            // InternalMyDsl.g:3375:2: '}'
            {
             before(grammarAccess.getExtendAccess().getRightCurlyBracketKeyword_6()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getExtendAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
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


    // $ANTLR start "rule__FunctionDecl__Group__0"
    // InternalMyDsl.g:3385:1: rule__FunctionDecl__Group__0 : rule__FunctionDecl__Group__0__Impl rule__FunctionDecl__Group__1 ;
    public final void rule__FunctionDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3389:1: ( rule__FunctionDecl__Group__0__Impl rule__FunctionDecl__Group__1 )
            // InternalMyDsl.g:3390:2: rule__FunctionDecl__Group__0__Impl rule__FunctionDecl__Group__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalMyDsl.g:3397:1: rule__FunctionDecl__Group__0__Impl : ( ( rule__FunctionDecl__NameAssignment_0 ) ) ;
    public final void rule__FunctionDecl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3401:1: ( ( ( rule__FunctionDecl__NameAssignment_0 ) ) )
            // InternalMyDsl.g:3402:1: ( ( rule__FunctionDecl__NameAssignment_0 ) )
            {
            // InternalMyDsl.g:3402:1: ( ( rule__FunctionDecl__NameAssignment_0 ) )
            // InternalMyDsl.g:3403:2: ( rule__FunctionDecl__NameAssignment_0 )
            {
             before(grammarAccess.getFunctionDeclAccess().getNameAssignment_0()); 
            // InternalMyDsl.g:3404:2: ( rule__FunctionDecl__NameAssignment_0 )
            // InternalMyDsl.g:3404:3: rule__FunctionDecl__NameAssignment_0
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
    // InternalMyDsl.g:3412:1: rule__FunctionDecl__Group__1 : rule__FunctionDecl__Group__1__Impl rule__FunctionDecl__Group__2 ;
    public final void rule__FunctionDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3416:1: ( rule__FunctionDecl__Group__1__Impl rule__FunctionDecl__Group__2 )
            // InternalMyDsl.g:3417:2: rule__FunctionDecl__Group__1__Impl rule__FunctionDecl__Group__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalMyDsl.g:3424:1: rule__FunctionDecl__Group__1__Impl : ( ( rule__FunctionDecl__ContextAssignment_1 )? ) ;
    public final void rule__FunctionDecl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3428:1: ( ( ( rule__FunctionDecl__ContextAssignment_1 )? ) )
            // InternalMyDsl.g:3429:1: ( ( rule__FunctionDecl__ContextAssignment_1 )? )
            {
            // InternalMyDsl.g:3429:1: ( ( rule__FunctionDecl__ContextAssignment_1 )? )
            // InternalMyDsl.g:3430:2: ( rule__FunctionDecl__ContextAssignment_1 )?
            {
             before(grammarAccess.getFunctionDeclAccess().getContextAssignment_1()); 
            // InternalMyDsl.g:3431:2: ( rule__FunctionDecl__ContextAssignment_1 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==31) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalMyDsl.g:3431:3: rule__FunctionDecl__ContextAssignment_1
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
    // InternalMyDsl.g:3439:1: rule__FunctionDecl__Group__2 : rule__FunctionDecl__Group__2__Impl rule__FunctionDecl__Group__3 ;
    public final void rule__FunctionDecl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3443:1: ( rule__FunctionDecl__Group__2__Impl rule__FunctionDecl__Group__3 )
            // InternalMyDsl.g:3444:2: rule__FunctionDecl__Group__2__Impl rule__FunctionDecl__Group__3
            {
            pushFollow(FOLLOW_28);
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
    // InternalMyDsl.g:3451:1: rule__FunctionDecl__Group__2__Impl : ( '(' ) ;
    public final void rule__FunctionDecl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3455:1: ( ( '(' ) )
            // InternalMyDsl.g:3456:1: ( '(' )
            {
            // InternalMyDsl.g:3456:1: ( '(' )
            // InternalMyDsl.g:3457:2: '('
            {
             before(grammarAccess.getFunctionDeclAccess().getLeftParenthesisKeyword_2()); 
            match(input,34,FOLLOW_2); 
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
    // InternalMyDsl.g:3466:1: rule__FunctionDecl__Group__3 : rule__FunctionDecl__Group__3__Impl rule__FunctionDecl__Group__4 ;
    public final void rule__FunctionDecl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3470:1: ( rule__FunctionDecl__Group__3__Impl rule__FunctionDecl__Group__4 )
            // InternalMyDsl.g:3471:2: rule__FunctionDecl__Group__3__Impl rule__FunctionDecl__Group__4
            {
            pushFollow(FOLLOW_28);
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
    // InternalMyDsl.g:3478:1: rule__FunctionDecl__Group__3__Impl : ( ( rule__FunctionDecl__VariablesAssignment_3 )? ) ;
    public final void rule__FunctionDecl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3482:1: ( ( ( rule__FunctionDecl__VariablesAssignment_3 )? ) )
            // InternalMyDsl.g:3483:1: ( ( rule__FunctionDecl__VariablesAssignment_3 )? )
            {
            // InternalMyDsl.g:3483:1: ( ( rule__FunctionDecl__VariablesAssignment_3 )? )
            // InternalMyDsl.g:3484:2: ( rule__FunctionDecl__VariablesAssignment_3 )?
            {
             before(grammarAccess.getFunctionDeclAccess().getVariablesAssignment_3()); 
            // InternalMyDsl.g:3485:2: ( rule__FunctionDecl__VariablesAssignment_3 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_ID) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalMyDsl.g:3485:3: rule__FunctionDecl__VariablesAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__FunctionDecl__VariablesAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFunctionDeclAccess().getVariablesAssignment_3()); 

            }


            }

        }
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
    // InternalMyDsl.g:3493:1: rule__FunctionDecl__Group__4 : rule__FunctionDecl__Group__4__Impl rule__FunctionDecl__Group__5 ;
    public final void rule__FunctionDecl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3497:1: ( rule__FunctionDecl__Group__4__Impl rule__FunctionDecl__Group__5 )
            // InternalMyDsl.g:3498:2: rule__FunctionDecl__Group__4__Impl rule__FunctionDecl__Group__5
            {
            pushFollow(FOLLOW_29);
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
    // InternalMyDsl.g:3505:1: rule__FunctionDecl__Group__4__Impl : ( ')' ) ;
    public final void rule__FunctionDecl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3509:1: ( ( ')' ) )
            // InternalMyDsl.g:3510:1: ( ')' )
            {
            // InternalMyDsl.g:3510:1: ( ')' )
            // InternalMyDsl.g:3511:2: ')'
            {
             before(grammarAccess.getFunctionDeclAccess().getRightParenthesisKeyword_4()); 
            match(input,35,FOLLOW_2); 
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
    // InternalMyDsl.g:3520:1: rule__FunctionDecl__Group__5 : rule__FunctionDecl__Group__5__Impl rule__FunctionDecl__Group__6 ;
    public final void rule__FunctionDecl__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3524:1: ( rule__FunctionDecl__Group__5__Impl rule__FunctionDecl__Group__6 )
            // InternalMyDsl.g:3525:2: rule__FunctionDecl__Group__5__Impl rule__FunctionDecl__Group__6
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
    // InternalMyDsl.g:3532:1: rule__FunctionDecl__Group__5__Impl : ( ( rule__FunctionDecl__BodyAssignment_5 ) ) ;
    public final void rule__FunctionDecl__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3536:1: ( ( ( rule__FunctionDecl__BodyAssignment_5 ) ) )
            // InternalMyDsl.g:3537:1: ( ( rule__FunctionDecl__BodyAssignment_5 ) )
            {
            // InternalMyDsl.g:3537:1: ( ( rule__FunctionDecl__BodyAssignment_5 ) )
            // InternalMyDsl.g:3538:2: ( rule__FunctionDecl__BodyAssignment_5 )
            {
             before(grammarAccess.getFunctionDeclAccess().getBodyAssignment_5()); 
            // InternalMyDsl.g:3539:2: ( rule__FunctionDecl__BodyAssignment_5 )
            // InternalMyDsl.g:3539:3: rule__FunctionDecl__BodyAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__FunctionDecl__BodyAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getFunctionDeclAccess().getBodyAssignment_5()); 

            }


            }

        }
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
    // InternalMyDsl.g:3547:1: rule__FunctionDecl__Group__6 : rule__FunctionDecl__Group__6__Impl rule__FunctionDecl__Group__7 ;
    public final void rule__FunctionDecl__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3551:1: ( rule__FunctionDecl__Group__6__Impl rule__FunctionDecl__Group__7 )
            // InternalMyDsl.g:3552:2: rule__FunctionDecl__Group__6__Impl rule__FunctionDecl__Group__7
            {
            pushFollow(FOLLOW_6);
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
    // InternalMyDsl.g:3559:1: rule__FunctionDecl__Group__6__Impl : ( ':' ) ;
    public final void rule__FunctionDecl__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3563:1: ( ( ':' ) )
            // InternalMyDsl.g:3564:1: ( ':' )
            {
            // InternalMyDsl.g:3564:1: ( ':' )
            // InternalMyDsl.g:3565:2: ':'
            {
             before(grammarAccess.getFunctionDeclAccess().getColonKeyword_6()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getFunctionDeclAccess().getColonKeyword_6()); 

            }


            }

        }
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
    // InternalMyDsl.g:3574:1: rule__FunctionDecl__Group__7 : rule__FunctionDecl__Group__7__Impl ;
    public final void rule__FunctionDecl__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3578:1: ( rule__FunctionDecl__Group__7__Impl )
            // InternalMyDsl.g:3579:2: rule__FunctionDecl__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FunctionDecl__Group__7__Impl();

            state._fsp--;


            }

        }
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
    // InternalMyDsl.g:3585:1: rule__FunctionDecl__Group__7__Impl : ( ( rule__FunctionDecl__ReturnTypeAssignment_7 ) ) ;
    public final void rule__FunctionDecl__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3589:1: ( ( ( rule__FunctionDecl__ReturnTypeAssignment_7 ) ) )
            // InternalMyDsl.g:3590:1: ( ( rule__FunctionDecl__ReturnTypeAssignment_7 ) )
            {
            // InternalMyDsl.g:3590:1: ( ( rule__FunctionDecl__ReturnTypeAssignment_7 ) )
            // InternalMyDsl.g:3591:2: ( rule__FunctionDecl__ReturnTypeAssignment_7 )
            {
             before(grammarAccess.getFunctionDeclAccess().getReturnTypeAssignment_7()); 
            // InternalMyDsl.g:3592:2: ( rule__FunctionDecl__ReturnTypeAssignment_7 )
            // InternalMyDsl.g:3592:3: rule__FunctionDecl__ReturnTypeAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__FunctionDecl__ReturnTypeAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getFunctionDeclAccess().getReturnTypeAssignment_7()); 

            }


            }

        }
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


    // $ANTLR start "rule__FuncInductive__Group__0"
    // InternalMyDsl.g:3601:1: rule__FuncInductive__Group__0 : rule__FuncInductive__Group__0__Impl rule__FuncInductive__Group__1 ;
    public final void rule__FuncInductive__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3605:1: ( rule__FuncInductive__Group__0__Impl rule__FuncInductive__Group__1 )
            // InternalMyDsl.g:3606:2: rule__FuncInductive__Group__0__Impl rule__FuncInductive__Group__1
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
    // InternalMyDsl.g:3613:1: rule__FuncInductive__Group__0__Impl : ( 'match' ) ;
    public final void rule__FuncInductive__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3617:1: ( ( 'match' ) )
            // InternalMyDsl.g:3618:1: ( 'match' )
            {
            // InternalMyDsl.g:3618:1: ( 'match' )
            // InternalMyDsl.g:3619:2: 'match'
            {
             before(grammarAccess.getFuncInductiveAccess().getMatchKeyword_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalMyDsl.g:3628:1: rule__FuncInductive__Group__1 : rule__FuncInductive__Group__1__Impl rule__FuncInductive__Group__2 ;
    public final void rule__FuncInductive__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3632:1: ( rule__FuncInductive__Group__1__Impl rule__FuncInductive__Group__2 )
            // InternalMyDsl.g:3633:2: rule__FuncInductive__Group__1__Impl rule__FuncInductive__Group__2
            {
            pushFollow(FOLLOW_30);
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
    // InternalMyDsl.g:3640:1: rule__FuncInductive__Group__1__Impl : ( ( rule__FuncInductive__VariableNameAssignment_1 ) ) ;
    public final void rule__FuncInductive__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3644:1: ( ( ( rule__FuncInductive__VariableNameAssignment_1 ) ) )
            // InternalMyDsl.g:3645:1: ( ( rule__FuncInductive__VariableNameAssignment_1 ) )
            {
            // InternalMyDsl.g:3645:1: ( ( rule__FuncInductive__VariableNameAssignment_1 ) )
            // InternalMyDsl.g:3646:2: ( rule__FuncInductive__VariableNameAssignment_1 )
            {
             before(grammarAccess.getFuncInductiveAccess().getVariableNameAssignment_1()); 
            // InternalMyDsl.g:3647:2: ( rule__FuncInductive__VariableNameAssignment_1 )
            // InternalMyDsl.g:3647:3: rule__FuncInductive__VariableNameAssignment_1
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
    // InternalMyDsl.g:3655:1: rule__FuncInductive__Group__2 : rule__FuncInductive__Group__2__Impl rule__FuncInductive__Group__3 ;
    public final void rule__FuncInductive__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3659:1: ( rule__FuncInductive__Group__2__Impl rule__FuncInductive__Group__3 )
            // InternalMyDsl.g:3660:2: rule__FuncInductive__Group__2__Impl rule__FuncInductive__Group__3
            {
            pushFollow(FOLLOW_30);
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
    // InternalMyDsl.g:3667:1: rule__FuncInductive__Group__2__Impl : ( ( rule__FuncInductive__InductCaseAssignment_2 ) ) ;
    public final void rule__FuncInductive__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3671:1: ( ( ( rule__FuncInductive__InductCaseAssignment_2 ) ) )
            // InternalMyDsl.g:3672:1: ( ( rule__FuncInductive__InductCaseAssignment_2 ) )
            {
            // InternalMyDsl.g:3672:1: ( ( rule__FuncInductive__InductCaseAssignment_2 ) )
            // InternalMyDsl.g:3673:2: ( rule__FuncInductive__InductCaseAssignment_2 )
            {
             before(grammarAccess.getFuncInductiveAccess().getInductCaseAssignment_2()); 
            // InternalMyDsl.g:3674:2: ( rule__FuncInductive__InductCaseAssignment_2 )
            // InternalMyDsl.g:3674:3: rule__FuncInductive__InductCaseAssignment_2
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
    // InternalMyDsl.g:3682:1: rule__FuncInductive__Group__3 : rule__FuncInductive__Group__3__Impl ;
    public final void rule__FuncInductive__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3686:1: ( rule__FuncInductive__Group__3__Impl )
            // InternalMyDsl.g:3687:2: rule__FuncInductive__Group__3__Impl
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
    // InternalMyDsl.g:3693:1: rule__FuncInductive__Group__3__Impl : ( ( rule__FuncInductive__InductCaseAssignment_3 )* ) ;
    public final void rule__FuncInductive__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3697:1: ( ( ( rule__FuncInductive__InductCaseAssignment_3 )* ) )
            // InternalMyDsl.g:3698:1: ( ( rule__FuncInductive__InductCaseAssignment_3 )* )
            {
            // InternalMyDsl.g:3698:1: ( ( rule__FuncInductive__InductCaseAssignment_3 )* )
            // InternalMyDsl.g:3699:2: ( rule__FuncInductive__InductCaseAssignment_3 )*
            {
             before(grammarAccess.getFuncInductiveAccess().getInductCaseAssignment_3()); 
            // InternalMyDsl.g:3700:2: ( rule__FuncInductive__InductCaseAssignment_3 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==38) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalMyDsl.g:3700:3: rule__FuncInductive__InductCaseAssignment_3
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__FuncInductive__InductCaseAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
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
    // InternalMyDsl.g:3709:1: rule__FuncInductiveCase__Group__0 : rule__FuncInductiveCase__Group__0__Impl rule__FuncInductiveCase__Group__1 ;
    public final void rule__FuncInductiveCase__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3713:1: ( rule__FuncInductiveCase__Group__0__Impl rule__FuncInductiveCase__Group__1 )
            // InternalMyDsl.g:3714:2: rule__FuncInductiveCase__Group__0__Impl rule__FuncInductiveCase__Group__1
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
    // InternalMyDsl.g:3721:1: rule__FuncInductiveCase__Group__0__Impl : ( '|' ) ;
    public final void rule__FuncInductiveCase__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3725:1: ( ( '|' ) )
            // InternalMyDsl.g:3726:1: ( '|' )
            {
            // InternalMyDsl.g:3726:1: ( '|' )
            // InternalMyDsl.g:3727:2: '|'
            {
             before(grammarAccess.getFuncInductiveCaseAccess().getVerticalLineKeyword_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalMyDsl.g:3736:1: rule__FuncInductiveCase__Group__1 : rule__FuncInductiveCase__Group__1__Impl rule__FuncInductiveCase__Group__2 ;
    public final void rule__FuncInductiveCase__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3740:1: ( rule__FuncInductiveCase__Group__1__Impl rule__FuncInductiveCase__Group__2 )
            // InternalMyDsl.g:3741:2: rule__FuncInductiveCase__Group__1__Impl rule__FuncInductiveCase__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalMyDsl.g:3748:1: rule__FuncInductiveCase__Group__1__Impl : ( ( rule__FuncInductiveCase__DeconNameAssignment_1 ) ) ;
    public final void rule__FuncInductiveCase__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3752:1: ( ( ( rule__FuncInductiveCase__DeconNameAssignment_1 ) ) )
            // InternalMyDsl.g:3753:1: ( ( rule__FuncInductiveCase__DeconNameAssignment_1 ) )
            {
            // InternalMyDsl.g:3753:1: ( ( rule__FuncInductiveCase__DeconNameAssignment_1 ) )
            // InternalMyDsl.g:3754:2: ( rule__FuncInductiveCase__DeconNameAssignment_1 )
            {
             before(grammarAccess.getFuncInductiveCaseAccess().getDeconNameAssignment_1()); 
            // InternalMyDsl.g:3755:2: ( rule__FuncInductiveCase__DeconNameAssignment_1 )
            // InternalMyDsl.g:3755:3: rule__FuncInductiveCase__DeconNameAssignment_1
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
    // InternalMyDsl.g:3763:1: rule__FuncInductiveCase__Group__2 : rule__FuncInductiveCase__Group__2__Impl rule__FuncInductiveCase__Group__3 ;
    public final void rule__FuncInductiveCase__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3767:1: ( rule__FuncInductiveCase__Group__2__Impl rule__FuncInductiveCase__Group__3 )
            // InternalMyDsl.g:3768:2: rule__FuncInductiveCase__Group__2__Impl rule__FuncInductiveCase__Group__3
            {
            pushFollow(FOLLOW_29);
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
    // InternalMyDsl.g:3775:1: rule__FuncInductiveCase__Group__2__Impl : ( ':' ) ;
    public final void rule__FuncInductiveCase__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3779:1: ( ( ':' ) )
            // InternalMyDsl.g:3780:1: ( ':' )
            {
            // InternalMyDsl.g:3780:1: ( ':' )
            // InternalMyDsl.g:3781:2: ':'
            {
             before(grammarAccess.getFuncInductiveCaseAccess().getColonKeyword_2()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getFuncInductiveCaseAccess().getColonKeyword_2()); 

            }


            }

        }
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
    // InternalMyDsl.g:3790:1: rule__FuncInductiveCase__Group__3 : rule__FuncInductiveCase__Group__3__Impl ;
    public final void rule__FuncInductiveCase__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3794:1: ( rule__FuncInductiveCase__Group__3__Impl )
            // InternalMyDsl.g:3795:2: rule__FuncInductiveCase__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FuncInductiveCase__Group__3__Impl();

            state._fsp--;


            }

        }
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
    // InternalMyDsl.g:3801:1: rule__FuncInductiveCase__Group__3__Impl : ( ( rule__FuncInductiveCase__ExpreAssignment_3 ) ) ;
    public final void rule__FuncInductiveCase__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3805:1: ( ( ( rule__FuncInductiveCase__ExpreAssignment_3 ) ) )
            // InternalMyDsl.g:3806:1: ( ( rule__FuncInductiveCase__ExpreAssignment_3 ) )
            {
            // InternalMyDsl.g:3806:1: ( ( rule__FuncInductiveCase__ExpreAssignment_3 ) )
            // InternalMyDsl.g:3807:2: ( rule__FuncInductiveCase__ExpreAssignment_3 )
            {
             before(grammarAccess.getFuncInductiveCaseAccess().getExpreAssignment_3()); 
            // InternalMyDsl.g:3808:2: ( rule__FuncInductiveCase__ExpreAssignment_3 )
            // InternalMyDsl.g:3808:3: rule__FuncInductiveCase__ExpreAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__FuncInductiveCase__ExpreAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getFuncInductiveCaseAccess().getExpreAssignment_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__TheoremBody__Group__0"
    // InternalMyDsl.g:3817:1: rule__TheoremBody__Group__0 : rule__TheoremBody__Group__0__Impl rule__TheoremBody__Group__1 ;
    public final void rule__TheoremBody__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3821:1: ( rule__TheoremBody__Group__0__Impl rule__TheoremBody__Group__1 )
            // InternalMyDsl.g:3822:2: rule__TheoremBody__Group__0__Impl rule__TheoremBody__Group__1
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
    // InternalMyDsl.g:3829:1: rule__TheoremBody__Group__0__Impl : ( 'Theorems' ) ;
    public final void rule__TheoremBody__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3833:1: ( ( 'Theorems' ) )
            // InternalMyDsl.g:3834:1: ( 'Theorems' )
            {
            // InternalMyDsl.g:3834:1: ( 'Theorems' )
            // InternalMyDsl.g:3835:2: 'Theorems'
            {
             before(grammarAccess.getTheoremBodyAccess().getTheoremsKeyword_0()); 
            match(input,40,FOLLOW_2); 
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
    // InternalMyDsl.g:3844:1: rule__TheoremBody__Group__1 : rule__TheoremBody__Group__1__Impl rule__TheoremBody__Group__2 ;
    public final void rule__TheoremBody__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3848:1: ( rule__TheoremBody__Group__1__Impl rule__TheoremBody__Group__2 )
            // InternalMyDsl.g:3849:2: rule__TheoremBody__Group__1__Impl rule__TheoremBody__Group__2
            {
            pushFollow(FOLLOW_31);
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
    // InternalMyDsl.g:3856:1: rule__TheoremBody__Group__1__Impl : ( '{' ) ;
    public final void rule__TheoremBody__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3860:1: ( ( '{' ) )
            // InternalMyDsl.g:3861:1: ( '{' )
            {
            // InternalMyDsl.g:3861:1: ( '{' )
            // InternalMyDsl.g:3862:2: '{'
            {
             before(grammarAccess.getTheoremBodyAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,29,FOLLOW_2); 
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
    // InternalMyDsl.g:3871:1: rule__TheoremBody__Group__2 : rule__TheoremBody__Group__2__Impl rule__TheoremBody__Group__3 ;
    public final void rule__TheoremBody__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3875:1: ( rule__TheoremBody__Group__2__Impl rule__TheoremBody__Group__3 )
            // InternalMyDsl.g:3876:2: rule__TheoremBody__Group__2__Impl rule__TheoremBody__Group__3
            {
            pushFollow(FOLLOW_32);
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
    // InternalMyDsl.g:3883:1: rule__TheoremBody__Group__2__Impl : ( ( ( rule__TheoremBody__TheoremDeclAssignment_2 ) ) ( ( rule__TheoremBody__TheoremDeclAssignment_2 )* ) ) ;
    public final void rule__TheoremBody__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3887:1: ( ( ( ( rule__TheoremBody__TheoremDeclAssignment_2 ) ) ( ( rule__TheoremBody__TheoremDeclAssignment_2 )* ) ) )
            // InternalMyDsl.g:3888:1: ( ( ( rule__TheoremBody__TheoremDeclAssignment_2 ) ) ( ( rule__TheoremBody__TheoremDeclAssignment_2 )* ) )
            {
            // InternalMyDsl.g:3888:1: ( ( ( rule__TheoremBody__TheoremDeclAssignment_2 ) ) ( ( rule__TheoremBody__TheoremDeclAssignment_2 )* ) )
            // InternalMyDsl.g:3889:2: ( ( rule__TheoremBody__TheoremDeclAssignment_2 ) ) ( ( rule__TheoremBody__TheoremDeclAssignment_2 )* )
            {
            // InternalMyDsl.g:3889:2: ( ( rule__TheoremBody__TheoremDeclAssignment_2 ) )
            // InternalMyDsl.g:3890:3: ( rule__TheoremBody__TheoremDeclAssignment_2 )
            {
             before(grammarAccess.getTheoremBodyAccess().getTheoremDeclAssignment_2()); 
            // InternalMyDsl.g:3891:3: ( rule__TheoremBody__TheoremDeclAssignment_2 )
            // InternalMyDsl.g:3891:4: rule__TheoremBody__TheoremDeclAssignment_2
            {
            pushFollow(FOLLOW_5);
            rule__TheoremBody__TheoremDeclAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTheoremBodyAccess().getTheoremDeclAssignment_2()); 

            }

            // InternalMyDsl.g:3894:2: ( ( rule__TheoremBody__TheoremDeclAssignment_2 )* )
            // InternalMyDsl.g:3895:3: ( rule__TheoremBody__TheoremDeclAssignment_2 )*
            {
             before(grammarAccess.getTheoremBodyAccess().getTheoremDeclAssignment_2()); 
            // InternalMyDsl.g:3896:3: ( rule__TheoremBody__TheoremDeclAssignment_2 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( ((LA33_0>=RULE_ID && LA33_0<=RULE_WS)||LA33_0==24) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalMyDsl.g:3896:4: rule__TheoremBody__TheoremDeclAssignment_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__TheoremBody__TheoremDeclAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
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
    // InternalMyDsl.g:3905:1: rule__TheoremBody__Group__3 : rule__TheoremBody__Group__3__Impl ;
    public final void rule__TheoremBody__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3909:1: ( rule__TheoremBody__Group__3__Impl )
            // InternalMyDsl.g:3910:2: rule__TheoremBody__Group__3__Impl
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
    // InternalMyDsl.g:3916:1: rule__TheoremBody__Group__3__Impl : ( '}' ) ;
    public final void rule__TheoremBody__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3920:1: ( ( '}' ) )
            // InternalMyDsl.g:3921:1: ( '}' )
            {
            // InternalMyDsl.g:3921:1: ( '}' )
            // InternalMyDsl.g:3922:2: '}'
            {
             before(grammarAccess.getTheoremBodyAccess().getRightCurlyBracketKeyword_3()); 
            match(input,30,FOLLOW_2); 
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
    // InternalMyDsl.g:3932:1: rule__TheoremDecl__Group__0 : rule__TheoremDecl__Group__0__Impl rule__TheoremDecl__Group__1 ;
    public final void rule__TheoremDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3936:1: ( rule__TheoremDecl__Group__0__Impl rule__TheoremDecl__Group__1 )
            // InternalMyDsl.g:3937:2: rule__TheoremDecl__Group__0__Impl rule__TheoremDecl__Group__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalMyDsl.g:3944:1: rule__TheoremDecl__Group__0__Impl : ( ( rule__TheoremDecl__ThmNameAssignment_0 ) ) ;
    public final void rule__TheoremDecl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3948:1: ( ( ( rule__TheoremDecl__ThmNameAssignment_0 ) ) )
            // InternalMyDsl.g:3949:1: ( ( rule__TheoremDecl__ThmNameAssignment_0 ) )
            {
            // InternalMyDsl.g:3949:1: ( ( rule__TheoremDecl__ThmNameAssignment_0 ) )
            // InternalMyDsl.g:3950:2: ( rule__TheoremDecl__ThmNameAssignment_0 )
            {
             before(grammarAccess.getTheoremDeclAccess().getThmNameAssignment_0()); 
            // InternalMyDsl.g:3951:2: ( rule__TheoremDecl__ThmNameAssignment_0 )
            // InternalMyDsl.g:3951:3: rule__TheoremDecl__ThmNameAssignment_0
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
    // InternalMyDsl.g:3959:1: rule__TheoremDecl__Group__1 : rule__TheoremDecl__Group__1__Impl ;
    public final void rule__TheoremDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3963:1: ( rule__TheoremDecl__Group__1__Impl )
            // InternalMyDsl.g:3964:2: rule__TheoremDecl__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TheoremDecl__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalMyDsl.g:3970:1: rule__TheoremDecl__Group__1__Impl : ( ( rule__TheoremDecl__ExpAssignment_1 ) ) ;
    public final void rule__TheoremDecl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3974:1: ( ( ( rule__TheoremDecl__ExpAssignment_1 ) ) )
            // InternalMyDsl.g:3975:1: ( ( rule__TheoremDecl__ExpAssignment_1 ) )
            {
            // InternalMyDsl.g:3975:1: ( ( rule__TheoremDecl__ExpAssignment_1 ) )
            // InternalMyDsl.g:3976:2: ( rule__TheoremDecl__ExpAssignment_1 )
            {
             before(grammarAccess.getTheoremDeclAccess().getExpAssignment_1()); 
            // InternalMyDsl.g:3977:2: ( rule__TheoremDecl__ExpAssignment_1 )
            // InternalMyDsl.g:3977:3: rule__TheoremDecl__ExpAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TheoremDecl__ExpAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTheoremDeclAccess().getExpAssignment_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__TypedVariableList__Group__0"
    // InternalMyDsl.g:3986:1: rule__TypedVariableList__Group__0 : rule__TypedVariableList__Group__0__Impl rule__TypedVariableList__Group__1 ;
    public final void rule__TypedVariableList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3990:1: ( rule__TypedVariableList__Group__0__Impl rule__TypedVariableList__Group__1 )
            // InternalMyDsl.g:3991:2: rule__TypedVariableList__Group__0__Impl rule__TypedVariableList__Group__1
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
    // InternalMyDsl.g:3998:1: rule__TypedVariableList__Group__0__Impl : ( ( rule__TypedVariableList__TypeVarAssignment_0 ) ) ;
    public final void rule__TypedVariableList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4002:1: ( ( ( rule__TypedVariableList__TypeVarAssignment_0 ) ) )
            // InternalMyDsl.g:4003:1: ( ( rule__TypedVariableList__TypeVarAssignment_0 ) )
            {
            // InternalMyDsl.g:4003:1: ( ( rule__TypedVariableList__TypeVarAssignment_0 ) )
            // InternalMyDsl.g:4004:2: ( rule__TypedVariableList__TypeVarAssignment_0 )
            {
             before(grammarAccess.getTypedVariableListAccess().getTypeVarAssignment_0()); 
            // InternalMyDsl.g:4005:2: ( rule__TypedVariableList__TypeVarAssignment_0 )
            // InternalMyDsl.g:4005:3: rule__TypedVariableList__TypeVarAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__TypedVariableList__TypeVarAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTypedVariableListAccess().getTypeVarAssignment_0()); 

            }


            }

        }
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
    // InternalMyDsl.g:4013:1: rule__TypedVariableList__Group__1 : rule__TypedVariableList__Group__1__Impl ;
    public final void rule__TypedVariableList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4017:1: ( rule__TypedVariableList__Group__1__Impl )
            // InternalMyDsl.g:4018:2: rule__TypedVariableList__Group__1__Impl
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
    // InternalMyDsl.g:4024:1: rule__TypedVariableList__Group__1__Impl : ( ( rule__TypedVariableList__Group_1__0 )* ) ;
    public final void rule__TypedVariableList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4028:1: ( ( ( rule__TypedVariableList__Group_1__0 )* ) )
            // InternalMyDsl.g:4029:1: ( ( rule__TypedVariableList__Group_1__0 )* )
            {
            // InternalMyDsl.g:4029:1: ( ( rule__TypedVariableList__Group_1__0 )* )
            // InternalMyDsl.g:4030:2: ( rule__TypedVariableList__Group_1__0 )*
            {
             before(grammarAccess.getTypedVariableListAccess().getGroup_1()); 
            // InternalMyDsl.g:4031:2: ( rule__TypedVariableList__Group_1__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==33) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalMyDsl.g:4031:3: rule__TypedVariableList__Group_1__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__TypedVariableList__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
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
    // InternalMyDsl.g:4040:1: rule__TypedVariableList__Group_1__0 : rule__TypedVariableList__Group_1__0__Impl rule__TypedVariableList__Group_1__1 ;
    public final void rule__TypedVariableList__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4044:1: ( rule__TypedVariableList__Group_1__0__Impl rule__TypedVariableList__Group_1__1 )
            // InternalMyDsl.g:4045:2: rule__TypedVariableList__Group_1__0__Impl rule__TypedVariableList__Group_1__1
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
    // InternalMyDsl.g:4052:1: rule__TypedVariableList__Group_1__0__Impl : ( ',' ) ;
    public final void rule__TypedVariableList__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4056:1: ( ( ',' ) )
            // InternalMyDsl.g:4057:1: ( ',' )
            {
            // InternalMyDsl.g:4057:1: ( ',' )
            // InternalMyDsl.g:4058:2: ','
            {
             before(grammarAccess.getTypedVariableListAccess().getCommaKeyword_1_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalMyDsl.g:4067:1: rule__TypedVariableList__Group_1__1 : rule__TypedVariableList__Group_1__1__Impl ;
    public final void rule__TypedVariableList__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4071:1: ( rule__TypedVariableList__Group_1__1__Impl )
            // InternalMyDsl.g:4072:2: rule__TypedVariableList__Group_1__1__Impl
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
    // InternalMyDsl.g:4078:1: rule__TypedVariableList__Group_1__1__Impl : ( ( rule__TypedVariableList__TypeVarAssignment_1_1 ) ) ;
    public final void rule__TypedVariableList__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4082:1: ( ( ( rule__TypedVariableList__TypeVarAssignment_1_1 ) ) )
            // InternalMyDsl.g:4083:1: ( ( rule__TypedVariableList__TypeVarAssignment_1_1 ) )
            {
            // InternalMyDsl.g:4083:1: ( ( rule__TypedVariableList__TypeVarAssignment_1_1 ) )
            // InternalMyDsl.g:4084:2: ( rule__TypedVariableList__TypeVarAssignment_1_1 )
            {
             before(grammarAccess.getTypedVariableListAccess().getTypeVarAssignment_1_1()); 
            // InternalMyDsl.g:4085:2: ( rule__TypedVariableList__TypeVarAssignment_1_1 )
            // InternalMyDsl.g:4085:3: rule__TypedVariableList__TypeVarAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__TypedVariableList__TypeVarAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getTypedVariableListAccess().getTypeVarAssignment_1_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__TypedVariable__Group__0"
    // InternalMyDsl.g:4094:1: rule__TypedVariable__Group__0 : rule__TypedVariable__Group__0__Impl rule__TypedVariable__Group__1 ;
    public final void rule__TypedVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4098:1: ( rule__TypedVariable__Group__0__Impl rule__TypedVariable__Group__1 )
            // InternalMyDsl.g:4099:2: rule__TypedVariable__Group__0__Impl rule__TypedVariable__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__TypedVariable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypedVariable__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedVariable__Group__0"


    // $ANTLR start "rule__TypedVariable__Group__0__Impl"
    // InternalMyDsl.g:4106:1: rule__TypedVariable__Group__0__Impl : ( ( rule__TypedVariable__NameAssignment_0 ) ) ;
    public final void rule__TypedVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4110:1: ( ( ( rule__TypedVariable__NameAssignment_0 ) ) )
            // InternalMyDsl.g:4111:1: ( ( rule__TypedVariable__NameAssignment_0 ) )
            {
            // InternalMyDsl.g:4111:1: ( ( rule__TypedVariable__NameAssignment_0 ) )
            // InternalMyDsl.g:4112:2: ( rule__TypedVariable__NameAssignment_0 )
            {
             before(grammarAccess.getTypedVariableAccess().getNameAssignment_0()); 
            // InternalMyDsl.g:4113:2: ( rule__TypedVariable__NameAssignment_0 )
            // InternalMyDsl.g:4113:3: rule__TypedVariable__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__TypedVariable__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTypedVariableAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedVariable__Group__0__Impl"


    // $ANTLR start "rule__TypedVariable__Group__1"
    // InternalMyDsl.g:4121:1: rule__TypedVariable__Group__1 : rule__TypedVariable__Group__1__Impl rule__TypedVariable__Group__2 ;
    public final void rule__TypedVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4125:1: ( rule__TypedVariable__Group__1__Impl rule__TypedVariable__Group__2 )
            // InternalMyDsl.g:4126:2: rule__TypedVariable__Group__1__Impl rule__TypedVariable__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__TypedVariable__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypedVariable__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedVariable__Group__1"


    // $ANTLR start "rule__TypedVariable__Group__1__Impl"
    // InternalMyDsl.g:4133:1: rule__TypedVariable__Group__1__Impl : ( ':' ) ;
    public final void rule__TypedVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4137:1: ( ( ':' ) )
            // InternalMyDsl.g:4138:1: ( ':' )
            {
            // InternalMyDsl.g:4138:1: ( ':' )
            // InternalMyDsl.g:4139:2: ':'
            {
             before(grammarAccess.getTypedVariableAccess().getColonKeyword_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getTypedVariableAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedVariable__Group__1__Impl"


    // $ANTLR start "rule__TypedVariable__Group__2"
    // InternalMyDsl.g:4148:1: rule__TypedVariable__Group__2 : rule__TypedVariable__Group__2__Impl ;
    public final void rule__TypedVariable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4152:1: ( rule__TypedVariable__Group__2__Impl )
            // InternalMyDsl.g:4153:2: rule__TypedVariable__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TypedVariable__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedVariable__Group__2"


    // $ANTLR start "rule__TypedVariable__Group__2__Impl"
    // InternalMyDsl.g:4159:1: rule__TypedVariable__Group__2__Impl : ( ( rule__TypedVariable__TypeAssignment_2 ) ) ;
    public final void rule__TypedVariable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4163:1: ( ( ( rule__TypedVariable__TypeAssignment_2 ) ) )
            // InternalMyDsl.g:4164:1: ( ( rule__TypedVariable__TypeAssignment_2 ) )
            {
            // InternalMyDsl.g:4164:1: ( ( rule__TypedVariable__TypeAssignment_2 ) )
            // InternalMyDsl.g:4165:2: ( rule__TypedVariable__TypeAssignment_2 )
            {
             before(grammarAccess.getTypedVariableAccess().getTypeAssignment_2()); 
            // InternalMyDsl.g:4166:2: ( rule__TypedVariable__TypeAssignment_2 )
            // InternalMyDsl.g:4166:3: rule__TypedVariable__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__TypedVariable__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTypedVariableAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedVariable__Group__2__Impl"


    // $ANTLR start "rule__Lambda__Group__0"
    // InternalMyDsl.g:4175:1: rule__Lambda__Group__0 : rule__Lambda__Group__0__Impl rule__Lambda__Group__1 ;
    public final void rule__Lambda__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4179:1: ( rule__Lambda__Group__0__Impl rule__Lambda__Group__1 )
            // InternalMyDsl.g:4180:2: rule__Lambda__Group__0__Impl rule__Lambda__Group__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalMyDsl.g:4187:1: rule__Lambda__Group__0__Impl : ( '\\u03BB' ) ;
    public final void rule__Lambda__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4191:1: ( ( '\\u03BB' ) )
            // InternalMyDsl.g:4192:1: ( '\\u03BB' )
            {
            // InternalMyDsl.g:4192:1: ( '\\u03BB' )
            // InternalMyDsl.g:4193:2: '\\u03BB'
            {
             before(grammarAccess.getLambdaAccess().getGreekSmallLetterLamdaKeyword_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getLambdaAccess().getGreekSmallLetterLamdaKeyword_0()); 

            }


            }

        }
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
    // InternalMyDsl.g:4202:1: rule__Lambda__Group__1 : rule__Lambda__Group__1__Impl rule__Lambda__Group__2 ;
    public final void rule__Lambda__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4206:1: ( rule__Lambda__Group__1__Impl rule__Lambda__Group__2 )
            // InternalMyDsl.g:4207:2: rule__Lambda__Group__1__Impl rule__Lambda__Group__2
            {
            pushFollow(FOLLOW_33);
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
    // InternalMyDsl.g:4214:1: rule__Lambda__Group__1__Impl : ( ( rule__Lambda__VarListAssignment_1 )? ) ;
    public final void rule__Lambda__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4218:1: ( ( ( rule__Lambda__VarListAssignment_1 )? ) )
            // InternalMyDsl.g:4219:1: ( ( rule__Lambda__VarListAssignment_1 )? )
            {
            // InternalMyDsl.g:4219:1: ( ( rule__Lambda__VarListAssignment_1 )? )
            // InternalMyDsl.g:4220:2: ( rule__Lambda__VarListAssignment_1 )?
            {
             before(grammarAccess.getLambdaAccess().getVarListAssignment_1()); 
            // InternalMyDsl.g:4221:2: ( rule__Lambda__VarListAssignment_1 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_ID) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalMyDsl.g:4221:3: rule__Lambda__VarListAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Lambda__VarListAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLambdaAccess().getVarListAssignment_1()); 

            }


            }

        }
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
    // InternalMyDsl.g:4229:1: rule__Lambda__Group__2 : rule__Lambda__Group__2__Impl rule__Lambda__Group__3 ;
    public final void rule__Lambda__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4233:1: ( rule__Lambda__Group__2__Impl rule__Lambda__Group__3 )
            // InternalMyDsl.g:4234:2: rule__Lambda__Group__2__Impl rule__Lambda__Group__3
            {
            pushFollow(FOLLOW_29);
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
    // InternalMyDsl.g:4241:1: rule__Lambda__Group__2__Impl : ( '|' ) ;
    public final void rule__Lambda__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4245:1: ( ( '|' ) )
            // InternalMyDsl.g:4246:1: ( '|' )
            {
            // InternalMyDsl.g:4246:1: ( '|' )
            // InternalMyDsl.g:4247:2: '|'
            {
             before(grammarAccess.getLambdaAccess().getVerticalLineKeyword_2()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getLambdaAccess().getVerticalLineKeyword_2()); 

            }


            }

        }
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
    // InternalMyDsl.g:4256:1: rule__Lambda__Group__3 : rule__Lambda__Group__3__Impl ;
    public final void rule__Lambda__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4260:1: ( rule__Lambda__Group__3__Impl )
            // InternalMyDsl.g:4261:2: rule__Lambda__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Lambda__Group__3__Impl();

            state._fsp--;


            }

        }
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
    // InternalMyDsl.g:4267:1: rule__Lambda__Group__3__Impl : ( ( rule__Lambda__ExprAssignment_3 ) ) ;
    public final void rule__Lambda__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4271:1: ( ( ( rule__Lambda__ExprAssignment_3 ) ) )
            // InternalMyDsl.g:4272:1: ( ( rule__Lambda__ExprAssignment_3 ) )
            {
            // InternalMyDsl.g:4272:1: ( ( rule__Lambda__ExprAssignment_3 ) )
            // InternalMyDsl.g:4273:2: ( rule__Lambda__ExprAssignment_3 )
            {
             before(grammarAccess.getLambdaAccess().getExprAssignment_3()); 
            // InternalMyDsl.g:4274:2: ( rule__Lambda__ExprAssignment_3 )
            // InternalMyDsl.g:4274:3: rule__Lambda__ExprAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Lambda__ExprAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getLambdaAccess().getExprAssignment_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__Quantifier__Group__0"
    // InternalMyDsl.g:4283:1: rule__Quantifier__Group__0 : rule__Quantifier__Group__0__Impl rule__Quantifier__Group__1 ;
    public final void rule__Quantifier__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4287:1: ( rule__Quantifier__Group__0__Impl rule__Quantifier__Group__1 )
            // InternalMyDsl.g:4288:2: rule__Quantifier__Group__0__Impl rule__Quantifier__Group__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalMyDsl.g:4295:1: rule__Quantifier__Group__0__Impl : ( ( rule__Quantifier__Alternatives_0 ) ) ;
    public final void rule__Quantifier__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4299:1: ( ( ( rule__Quantifier__Alternatives_0 ) ) )
            // InternalMyDsl.g:4300:1: ( ( rule__Quantifier__Alternatives_0 ) )
            {
            // InternalMyDsl.g:4300:1: ( ( rule__Quantifier__Alternatives_0 ) )
            // InternalMyDsl.g:4301:2: ( rule__Quantifier__Alternatives_0 )
            {
             before(grammarAccess.getQuantifierAccess().getAlternatives_0()); 
            // InternalMyDsl.g:4302:2: ( rule__Quantifier__Alternatives_0 )
            // InternalMyDsl.g:4302:3: rule__Quantifier__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Quantifier__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getQuantifierAccess().getAlternatives_0()); 

            }


            }

        }
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
    // InternalMyDsl.g:4310:1: rule__Quantifier__Group__1 : rule__Quantifier__Group__1__Impl rule__Quantifier__Group__2 ;
    public final void rule__Quantifier__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4314:1: ( rule__Quantifier__Group__1__Impl rule__Quantifier__Group__2 )
            // InternalMyDsl.g:4315:2: rule__Quantifier__Group__1__Impl rule__Quantifier__Group__2
            {
            pushFollow(FOLLOW_34);
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
    // InternalMyDsl.g:4322:1: rule__Quantifier__Group__1__Impl : ( ( rule__Quantifier__VarListAssignment_1 )? ) ;
    public final void rule__Quantifier__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4326:1: ( ( ( rule__Quantifier__VarListAssignment_1 )? ) )
            // InternalMyDsl.g:4327:1: ( ( rule__Quantifier__VarListAssignment_1 )? )
            {
            // InternalMyDsl.g:4327:1: ( ( rule__Quantifier__VarListAssignment_1 )? )
            // InternalMyDsl.g:4328:2: ( rule__Quantifier__VarListAssignment_1 )?
            {
             before(grammarAccess.getQuantifierAccess().getVarListAssignment_1()); 
            // InternalMyDsl.g:4329:2: ( rule__Quantifier__VarListAssignment_1 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_ID) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalMyDsl.g:4329:3: rule__Quantifier__VarListAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Quantifier__VarListAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQuantifierAccess().getVarListAssignment_1()); 

            }


            }

        }
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
    // InternalMyDsl.g:4337:1: rule__Quantifier__Group__2 : rule__Quantifier__Group__2__Impl rule__Quantifier__Group__3 ;
    public final void rule__Quantifier__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4341:1: ( rule__Quantifier__Group__2__Impl rule__Quantifier__Group__3 )
            // InternalMyDsl.g:4342:2: rule__Quantifier__Group__2__Impl rule__Quantifier__Group__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalMyDsl.g:4349:1: rule__Quantifier__Group__2__Impl : ( '\\u00B7' ) ;
    public final void rule__Quantifier__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4353:1: ( ( '\\u00B7' ) )
            // InternalMyDsl.g:4354:1: ( '\\u00B7' )
            {
            // InternalMyDsl.g:4354:1: ( '\\u00B7' )
            // InternalMyDsl.g:4355:2: '\\u00B7'
            {
             before(grammarAccess.getQuantifierAccess().getMiddleDotKeyword_2()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getQuantifierAccess().getMiddleDotKeyword_2()); 

            }


            }

        }
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
    // InternalMyDsl.g:4364:1: rule__Quantifier__Group__3 : rule__Quantifier__Group__3__Impl rule__Quantifier__Group__4 ;
    public final void rule__Quantifier__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4368:1: ( rule__Quantifier__Group__3__Impl rule__Quantifier__Group__4 )
            // InternalMyDsl.g:4369:2: rule__Quantifier__Group__3__Impl rule__Quantifier__Group__4
            {
            pushFollow(FOLLOW_21);
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
    // InternalMyDsl.g:4376:1: rule__Quantifier__Group__3__Impl : ( ( rule__Quantifier__ExprAssignment_3 ) ) ;
    public final void rule__Quantifier__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4380:1: ( ( ( rule__Quantifier__ExprAssignment_3 ) ) )
            // InternalMyDsl.g:4381:1: ( ( rule__Quantifier__ExprAssignment_3 ) )
            {
            // InternalMyDsl.g:4381:1: ( ( rule__Quantifier__ExprAssignment_3 ) )
            // InternalMyDsl.g:4382:2: ( rule__Quantifier__ExprAssignment_3 )
            {
             before(grammarAccess.getQuantifierAccess().getExprAssignment_3()); 
            // InternalMyDsl.g:4383:2: ( rule__Quantifier__ExprAssignment_3 )
            // InternalMyDsl.g:4383:3: rule__Quantifier__ExprAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Quantifier__ExprAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getQuantifierAccess().getExprAssignment_3()); 

            }


            }

        }
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
    // InternalMyDsl.g:4391:1: rule__Quantifier__Group__4 : rule__Quantifier__Group__4__Impl ;
    public final void rule__Quantifier__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4395:1: ( rule__Quantifier__Group__4__Impl )
            // InternalMyDsl.g:4396:2: rule__Quantifier__Group__4__Impl
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
    // InternalMyDsl.g:4402:1: rule__Quantifier__Group__4__Impl : ( ';' ) ;
    public final void rule__Quantifier__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4406:1: ( ( ';' ) )
            // InternalMyDsl.g:4407:1: ( ';' )
            {
            // InternalMyDsl.g:4407:1: ( ';' )
            // InternalMyDsl.g:4408:2: ';'
            {
             before(grammarAccess.getQuantifierAccess().getSemicolonKeyword_4()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getQuantifierAccess().getSemicolonKeyword_4()); 

            }


            }

        }
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
    // InternalMyDsl.g:4418:1: rule__Prefix__Group__0 : rule__Prefix__Group__0__Impl rule__Prefix__Group__1 ;
    public final void rule__Prefix__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4422:1: ( rule__Prefix__Group__0__Impl rule__Prefix__Group__1 )
            // InternalMyDsl.g:4423:2: rule__Prefix__Group__0__Impl rule__Prefix__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalMyDsl.g:4430:1: rule__Prefix__Group__0__Impl : ( ( rule__Prefix__NameAssignment_0 ) ) ;
    public final void rule__Prefix__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4434:1: ( ( ( rule__Prefix__NameAssignment_0 ) ) )
            // InternalMyDsl.g:4435:1: ( ( rule__Prefix__NameAssignment_0 ) )
            {
            // InternalMyDsl.g:4435:1: ( ( rule__Prefix__NameAssignment_0 ) )
            // InternalMyDsl.g:4436:2: ( rule__Prefix__NameAssignment_0 )
            {
             before(grammarAccess.getPrefixAccess().getNameAssignment_0()); 
            // InternalMyDsl.g:4437:2: ( rule__Prefix__NameAssignment_0 )
            // InternalMyDsl.g:4437:3: rule__Prefix__NameAssignment_0
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
    // InternalMyDsl.g:4445:1: rule__Prefix__Group__1 : rule__Prefix__Group__1__Impl ;
    public final void rule__Prefix__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4449:1: ( rule__Prefix__Group__1__Impl )
            // InternalMyDsl.g:4450:2: rule__Prefix__Group__1__Impl
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
    // InternalMyDsl.g:4456:1: rule__Prefix__Group__1__Impl : ( ( rule__Prefix__ElemAssignment_1 ) ) ;
    public final void rule__Prefix__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4460:1: ( ( ( rule__Prefix__ElemAssignment_1 ) ) )
            // InternalMyDsl.g:4461:1: ( ( rule__Prefix__ElemAssignment_1 ) )
            {
            // InternalMyDsl.g:4461:1: ( ( rule__Prefix__ElemAssignment_1 ) )
            // InternalMyDsl.g:4462:2: ( rule__Prefix__ElemAssignment_1 )
            {
             before(grammarAccess.getPrefixAccess().getElemAssignment_1()); 
            // InternalMyDsl.g:4463:2: ( rule__Prefix__ElemAssignment_1 )
            // InternalMyDsl.g:4463:3: rule__Prefix__ElemAssignment_1
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
    // InternalMyDsl.g:4472:1: rule__Infix__Group__0 : rule__Infix__Group__0__Impl rule__Infix__Group__1 ;
    public final void rule__Infix__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4476:1: ( rule__Infix__Group__0__Impl rule__Infix__Group__1 )
            // InternalMyDsl.g:4477:2: rule__Infix__Group__0__Impl rule__Infix__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalMyDsl.g:4484:1: rule__Infix__Group__0__Impl : ( ruleElement ) ;
    public final void rule__Infix__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4488:1: ( ( ruleElement ) )
            // InternalMyDsl.g:4489:1: ( ruleElement )
            {
            // InternalMyDsl.g:4489:1: ( ruleElement )
            // InternalMyDsl.g:4490:2: ruleElement
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
    // InternalMyDsl.g:4499:1: rule__Infix__Group__1 : rule__Infix__Group__1__Impl ;
    public final void rule__Infix__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4503:1: ( rule__Infix__Group__1__Impl )
            // InternalMyDsl.g:4504:2: rule__Infix__Group__1__Impl
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
    // InternalMyDsl.g:4510:1: rule__Infix__Group__1__Impl : ( ( rule__Infix__Group_1__0 )* ) ;
    public final void rule__Infix__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4514:1: ( ( ( rule__Infix__Group_1__0 )* ) )
            // InternalMyDsl.g:4515:1: ( ( rule__Infix__Group_1__0 )* )
            {
            // InternalMyDsl.g:4515:1: ( ( rule__Infix__Group_1__0 )* )
            // InternalMyDsl.g:4516:2: ( rule__Infix__Group_1__0 )*
            {
             before(grammarAccess.getInfixAccess().getGroup_1()); 
            // InternalMyDsl.g:4517:2: ( rule__Infix__Group_1__0 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==RULE_ID) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalMyDsl.g:4517:3: rule__Infix__Group_1__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Infix__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop37;
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
    // InternalMyDsl.g:4526:1: rule__Infix__Group_1__0 : rule__Infix__Group_1__0__Impl rule__Infix__Group_1__1 ;
    public final void rule__Infix__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4530:1: ( rule__Infix__Group_1__0__Impl rule__Infix__Group_1__1 )
            // InternalMyDsl.g:4531:2: rule__Infix__Group_1__0__Impl rule__Infix__Group_1__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalMyDsl.g:4538:1: rule__Infix__Group_1__0__Impl : ( () ) ;
    public final void rule__Infix__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4542:1: ( ( () ) )
            // InternalMyDsl.g:4543:1: ( () )
            {
            // InternalMyDsl.g:4543:1: ( () )
            // InternalMyDsl.g:4544:2: ()
            {
             before(grammarAccess.getInfixAccess().getInfixLeftAction_1_0()); 
            // InternalMyDsl.g:4545:2: ()
            // InternalMyDsl.g:4545:3: 
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
    // InternalMyDsl.g:4553:1: rule__Infix__Group_1__1 : rule__Infix__Group_1__1__Impl rule__Infix__Group_1__2 ;
    public final void rule__Infix__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4557:1: ( rule__Infix__Group_1__1__Impl rule__Infix__Group_1__2 )
            // InternalMyDsl.g:4558:2: rule__Infix__Group_1__1__Impl rule__Infix__Group_1__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalMyDsl.g:4565:1: rule__Infix__Group_1__1__Impl : ( ( rule__Infix__FuncNameAssignment_1_1 ) ) ;
    public final void rule__Infix__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4569:1: ( ( ( rule__Infix__FuncNameAssignment_1_1 ) ) )
            // InternalMyDsl.g:4570:1: ( ( rule__Infix__FuncNameAssignment_1_1 ) )
            {
            // InternalMyDsl.g:4570:1: ( ( rule__Infix__FuncNameAssignment_1_1 ) )
            // InternalMyDsl.g:4571:2: ( rule__Infix__FuncNameAssignment_1_1 )
            {
             before(grammarAccess.getInfixAccess().getFuncNameAssignment_1_1()); 
            // InternalMyDsl.g:4572:2: ( rule__Infix__FuncNameAssignment_1_1 )
            // InternalMyDsl.g:4572:3: rule__Infix__FuncNameAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Infix__FuncNameAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getInfixAccess().getFuncNameAssignment_1_1()); 

            }


            }

        }
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
    // InternalMyDsl.g:4580:1: rule__Infix__Group_1__2 : rule__Infix__Group_1__2__Impl ;
    public final void rule__Infix__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4584:1: ( rule__Infix__Group_1__2__Impl )
            // InternalMyDsl.g:4585:2: rule__Infix__Group_1__2__Impl
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
    // InternalMyDsl.g:4591:1: rule__Infix__Group_1__2__Impl : ( ( rule__Infix__RightAssignment_1_2 ) ) ;
    public final void rule__Infix__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4595:1: ( ( ( rule__Infix__RightAssignment_1_2 ) ) )
            // InternalMyDsl.g:4596:1: ( ( rule__Infix__RightAssignment_1_2 ) )
            {
            // InternalMyDsl.g:4596:1: ( ( rule__Infix__RightAssignment_1_2 ) )
            // InternalMyDsl.g:4597:2: ( rule__Infix__RightAssignment_1_2 )
            {
             before(grammarAccess.getInfixAccess().getRightAssignment_1_2()); 
            // InternalMyDsl.g:4598:2: ( rule__Infix__RightAssignment_1_2 )
            // InternalMyDsl.g:4598:3: rule__Infix__RightAssignment_1_2
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
    // InternalMyDsl.g:4607:1: rule__Bracket__Group__0 : rule__Bracket__Group__0__Impl rule__Bracket__Group__1 ;
    public final void rule__Bracket__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4611:1: ( rule__Bracket__Group__0__Impl rule__Bracket__Group__1 )
            // InternalMyDsl.g:4612:2: rule__Bracket__Group__0__Impl rule__Bracket__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalMyDsl.g:4619:1: rule__Bracket__Group__0__Impl : ( '(' ) ;
    public final void rule__Bracket__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4623:1: ( ( '(' ) )
            // InternalMyDsl.g:4624:1: ( '(' )
            {
            // InternalMyDsl.g:4624:1: ( '(' )
            // InternalMyDsl.g:4625:2: '('
            {
             before(grammarAccess.getBracketAccess().getLeftParenthesisKeyword_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalMyDsl.g:4634:1: rule__Bracket__Group__1 : rule__Bracket__Group__1__Impl rule__Bracket__Group__2 ;
    public final void rule__Bracket__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4638:1: ( rule__Bracket__Group__1__Impl rule__Bracket__Group__2 )
            // InternalMyDsl.g:4639:2: rule__Bracket__Group__1__Impl rule__Bracket__Group__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalMyDsl.g:4646:1: rule__Bracket__Group__1__Impl : ( ruleInfix ) ;
    public final void rule__Bracket__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4650:1: ( ( ruleInfix ) )
            // InternalMyDsl.g:4651:1: ( ruleInfix )
            {
            // InternalMyDsl.g:4651:1: ( ruleInfix )
            // InternalMyDsl.g:4652:2: ruleInfix
            {
             before(grammarAccess.getBracketAccess().getInfixParserRuleCall_1()); 
            pushFollow(FOLLOW_2);
            ruleInfix();

            state._fsp--;

             after(grammarAccess.getBracketAccess().getInfixParserRuleCall_1()); 

            }


            }

        }
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
    // InternalMyDsl.g:4661:1: rule__Bracket__Group__2 : rule__Bracket__Group__2__Impl ;
    public final void rule__Bracket__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4665:1: ( rule__Bracket__Group__2__Impl )
            // InternalMyDsl.g:4666:2: rule__Bracket__Group__2__Impl
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
    // InternalMyDsl.g:4672:1: rule__Bracket__Group__2__Impl : ( ')' ) ;
    public final void rule__Bracket__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4676:1: ( ( ')' ) )
            // InternalMyDsl.g:4677:1: ( ')' )
            {
            // InternalMyDsl.g:4677:1: ( ')' )
            // InternalMyDsl.g:4678:2: ')'
            {
             before(grammarAccess.getBracketAccess().getRightParenthesisKeyword_2()); 
            match(input,35,FOLLOW_2); 
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
    // InternalMyDsl.g:4688:1: rule__FunctionCall__Group__0 : rule__FunctionCall__Group__0__Impl rule__FunctionCall__Group__1 ;
    public final void rule__FunctionCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4692:1: ( rule__FunctionCall__Group__0__Impl rule__FunctionCall__Group__1 )
            // InternalMyDsl.g:4693:2: rule__FunctionCall__Group__0__Impl rule__FunctionCall__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalMyDsl.g:4700:1: rule__FunctionCall__Group__0__Impl : ( ( rule__FunctionCall__FuncNameAssignment_0 ) ) ;
    public final void rule__FunctionCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4704:1: ( ( ( rule__FunctionCall__FuncNameAssignment_0 ) ) )
            // InternalMyDsl.g:4705:1: ( ( rule__FunctionCall__FuncNameAssignment_0 ) )
            {
            // InternalMyDsl.g:4705:1: ( ( rule__FunctionCall__FuncNameAssignment_0 ) )
            // InternalMyDsl.g:4706:2: ( rule__FunctionCall__FuncNameAssignment_0 )
            {
             before(grammarAccess.getFunctionCallAccess().getFuncNameAssignment_0()); 
            // InternalMyDsl.g:4707:2: ( rule__FunctionCall__FuncNameAssignment_0 )
            // InternalMyDsl.g:4707:3: rule__FunctionCall__FuncNameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__FunctionCall__FuncNameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionCallAccess().getFuncNameAssignment_0()); 

            }


            }

        }
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
    // InternalMyDsl.g:4715:1: rule__FunctionCall__Group__1 : rule__FunctionCall__Group__1__Impl rule__FunctionCall__Group__2 ;
    public final void rule__FunctionCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4719:1: ( rule__FunctionCall__Group__1__Impl rule__FunctionCall__Group__2 )
            // InternalMyDsl.g:4720:2: rule__FunctionCall__Group__1__Impl rule__FunctionCall__Group__2
            {
            pushFollow(FOLLOW_35);
            rule__FunctionCall__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionCall__Group__2();

            state._fsp--;


            }

        }
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
    // InternalMyDsl.g:4727:1: rule__FunctionCall__Group__1__Impl : ( '(' ) ;
    public final void rule__FunctionCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4731:1: ( ( '(' ) )
            // InternalMyDsl.g:4732:1: ( '(' )
            {
            // InternalMyDsl.g:4732:1: ( '(' )
            // InternalMyDsl.g:4733:2: '('
            {
             before(grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__FunctionCall__Group__2"
    // InternalMyDsl.g:4742:1: rule__FunctionCall__Group__2 : rule__FunctionCall__Group__2__Impl rule__FunctionCall__Group__3 ;
    public final void rule__FunctionCall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4746:1: ( rule__FunctionCall__Group__2__Impl rule__FunctionCall__Group__3 )
            // InternalMyDsl.g:4747:2: rule__FunctionCall__Group__2__Impl rule__FunctionCall__Group__3
            {
            pushFollow(FOLLOW_35);
            rule__FunctionCall__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionCall__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group__2"


    // $ANTLR start "rule__FunctionCall__Group__2__Impl"
    // InternalMyDsl.g:4754:1: rule__FunctionCall__Group__2__Impl : ( ( rule__FunctionCall__ArgumentsAssignment_2 )? ) ;
    public final void rule__FunctionCall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4758:1: ( ( ( rule__FunctionCall__ArgumentsAssignment_2 )? ) )
            // InternalMyDsl.g:4759:1: ( ( rule__FunctionCall__ArgumentsAssignment_2 )? )
            {
            // InternalMyDsl.g:4759:1: ( ( rule__FunctionCall__ArgumentsAssignment_2 )? )
            // InternalMyDsl.g:4760:2: ( rule__FunctionCall__ArgumentsAssignment_2 )?
            {
             before(grammarAccess.getFunctionCallAccess().getArgumentsAssignment_2()); 
            // InternalMyDsl.g:4761:2: ( rule__FunctionCall__ArgumentsAssignment_2 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_ID||LA38_0==11||(LA38_0>=22 && LA38_0<=23)||LA38_0==34) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalMyDsl.g:4761:3: rule__FunctionCall__ArgumentsAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__FunctionCall__ArgumentsAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFunctionCallAccess().getArgumentsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group__2__Impl"


    // $ANTLR start "rule__FunctionCall__Group__3"
    // InternalMyDsl.g:4769:1: rule__FunctionCall__Group__3 : rule__FunctionCall__Group__3__Impl rule__FunctionCall__Group__4 ;
    public final void rule__FunctionCall__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4773:1: ( rule__FunctionCall__Group__3__Impl rule__FunctionCall__Group__4 )
            // InternalMyDsl.g:4774:2: rule__FunctionCall__Group__3__Impl rule__FunctionCall__Group__4
            {
            pushFollow(FOLLOW_35);
            rule__FunctionCall__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionCall__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group__3"


    // $ANTLR start "rule__FunctionCall__Group__3__Impl"
    // InternalMyDsl.g:4781:1: rule__FunctionCall__Group__3__Impl : ( ( rule__FunctionCall__Group_3__0 )* ) ;
    public final void rule__FunctionCall__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4785:1: ( ( ( rule__FunctionCall__Group_3__0 )* ) )
            // InternalMyDsl.g:4786:1: ( ( rule__FunctionCall__Group_3__0 )* )
            {
            // InternalMyDsl.g:4786:1: ( ( rule__FunctionCall__Group_3__0 )* )
            // InternalMyDsl.g:4787:2: ( rule__FunctionCall__Group_3__0 )*
            {
             before(grammarAccess.getFunctionCallAccess().getGroup_3()); 
            // InternalMyDsl.g:4788:2: ( rule__FunctionCall__Group_3__0 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==33) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalMyDsl.g:4788:3: rule__FunctionCall__Group_3__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__FunctionCall__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

             after(grammarAccess.getFunctionCallAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group__3__Impl"


    // $ANTLR start "rule__FunctionCall__Group__4"
    // InternalMyDsl.g:4796:1: rule__FunctionCall__Group__4 : rule__FunctionCall__Group__4__Impl ;
    public final void rule__FunctionCall__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4800:1: ( rule__FunctionCall__Group__4__Impl )
            // InternalMyDsl.g:4801:2: rule__FunctionCall__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FunctionCall__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group__4"


    // $ANTLR start "rule__FunctionCall__Group__4__Impl"
    // InternalMyDsl.g:4807:1: rule__FunctionCall__Group__4__Impl : ( ')' ) ;
    public final void rule__FunctionCall__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4811:1: ( ( ')' ) )
            // InternalMyDsl.g:4812:1: ( ')' )
            {
            // InternalMyDsl.g:4812:1: ( ')' )
            // InternalMyDsl.g:4813:2: ')'
            {
             before(grammarAccess.getFunctionCallAccess().getRightParenthesisKeyword_4()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getFunctionCallAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group__4__Impl"


    // $ANTLR start "rule__FunctionCall__Group_3__0"
    // InternalMyDsl.g:4823:1: rule__FunctionCall__Group_3__0 : rule__FunctionCall__Group_3__0__Impl rule__FunctionCall__Group_3__1 ;
    public final void rule__FunctionCall__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4827:1: ( rule__FunctionCall__Group_3__0__Impl rule__FunctionCall__Group_3__1 )
            // InternalMyDsl.g:4828:2: rule__FunctionCall__Group_3__0__Impl rule__FunctionCall__Group_3__1
            {
            pushFollow(FOLLOW_20);
            rule__FunctionCall__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionCall__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group_3__0"


    // $ANTLR start "rule__FunctionCall__Group_3__0__Impl"
    // InternalMyDsl.g:4835:1: rule__FunctionCall__Group_3__0__Impl : ( ',' ) ;
    public final void rule__FunctionCall__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4839:1: ( ( ',' ) )
            // InternalMyDsl.g:4840:1: ( ',' )
            {
            // InternalMyDsl.g:4840:1: ( ',' )
            // InternalMyDsl.g:4841:2: ','
            {
             before(grammarAccess.getFunctionCallAccess().getCommaKeyword_3_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getFunctionCallAccess().getCommaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group_3__0__Impl"


    // $ANTLR start "rule__FunctionCall__Group_3__1"
    // InternalMyDsl.g:4850:1: rule__FunctionCall__Group_3__1 : rule__FunctionCall__Group_3__1__Impl ;
    public final void rule__FunctionCall__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4854:1: ( rule__FunctionCall__Group_3__1__Impl )
            // InternalMyDsl.g:4855:2: rule__FunctionCall__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FunctionCall__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group_3__1"


    // $ANTLR start "rule__FunctionCall__Group_3__1__Impl"
    // InternalMyDsl.g:4861:1: rule__FunctionCall__Group_3__1__Impl : ( ( rule__FunctionCall__ArgumentsAssignment_3_1 ) ) ;
    public final void rule__FunctionCall__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4865:1: ( ( ( rule__FunctionCall__ArgumentsAssignment_3_1 ) ) )
            // InternalMyDsl.g:4866:1: ( ( rule__FunctionCall__ArgumentsAssignment_3_1 ) )
            {
            // InternalMyDsl.g:4866:1: ( ( rule__FunctionCall__ArgumentsAssignment_3_1 ) )
            // InternalMyDsl.g:4867:2: ( rule__FunctionCall__ArgumentsAssignment_3_1 )
            {
             before(grammarAccess.getFunctionCallAccess().getArgumentsAssignment_3_1()); 
            // InternalMyDsl.g:4868:2: ( rule__FunctionCall__ArgumentsAssignment_3_1 )
            // InternalMyDsl.g:4868:3: rule__FunctionCall__ArgumentsAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__FunctionCall__ArgumentsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getFunctionCallAccess().getArgumentsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group_3__1__Impl"


    // $ANTLR start "rule__DomainModel__ElementsAssignment"
    // InternalMyDsl.g:4877:1: rule__DomainModel__ElementsAssignment : ( ruleTopLevel ) ;
    public final void rule__DomainModel__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4881:1: ( ( ruleTopLevel ) )
            // InternalMyDsl.g:4882:2: ( ruleTopLevel )
            {
            // InternalMyDsl.g:4882:2: ( ruleTopLevel )
            // InternalMyDsl.g:4883:3: ruleTopLevel
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
    // InternalMyDsl.g:4892:1: rule__ImportStatement__ImportsAssignment_1 : ( ruleImport ) ;
    public final void rule__ImportStatement__ImportsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4896:1: ( ( ruleImport ) )
            // InternalMyDsl.g:4897:2: ( ruleImport )
            {
            // InternalMyDsl.g:4897:2: ( ruleImport )
            // InternalMyDsl.g:4898:3: ruleImport
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
    // InternalMyDsl.g:4907:1: rule__Import__ImportNameAssignment_0 : ( ruleImportComponent ) ;
    public final void rule__Import__ImportNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4911:1: ( ( ruleImportComponent ) )
            // InternalMyDsl.g:4912:2: ( ruleImportComponent )
            {
            // InternalMyDsl.g:4912:2: ( ruleImportComponent )
            // InternalMyDsl.g:4913:3: ruleImportComponent
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
    // InternalMyDsl.g:4922:1: rule__Import__ImportNameAssignment_1_1 : ( ruleImportComponent ) ;
    public final void rule__Import__ImportNameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4926:1: ( ( ruleImportComponent ) )
            // InternalMyDsl.g:4927:2: ( ruleImportComponent )
            {
            // InternalMyDsl.g:4927:2: ( ruleImportComponent )
            // InternalMyDsl.g:4928:3: ruleImportComponent
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
    // InternalMyDsl.g:4937:1: rule__ImportComponent__NameAssignment : ( RULE_ID ) ;
    public final void rule__ImportComponent__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4941:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:4942:2: ( RULE_ID )
            {
            // InternalMyDsl.g:4942:2: ( RULE_ID )
            // InternalMyDsl.g:4943:3: RULE_ID
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
    // InternalMyDsl.g:4952:1: rule__Class__TypeNameAssignment_1 : ( ruleTypeName ) ;
    public final void rule__Class__TypeNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4956:1: ( ( ruleTypeName ) )
            // InternalMyDsl.g:4957:2: ( ruleTypeName )
            {
            // InternalMyDsl.g:4957:2: ( ruleTypeName )
            // InternalMyDsl.g:4958:3: ruleTypeName
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
    // InternalMyDsl.g:4967:1: rule__Class__ContextAssignment_2 : ( rulePolyContext ) ;
    public final void rule__Class__ContextAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4971:1: ( ( rulePolyContext ) )
            // InternalMyDsl.g:4972:2: ( rulePolyContext )
            {
            // InternalMyDsl.g:4972:2: ( rulePolyContext )
            // InternalMyDsl.g:4973:3: rulePolyContext
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
    // InternalMyDsl.g:4982:1: rule__Class__SupertypesAssignment_3 : ( ruleSuperTypeList ) ;
    public final void rule__Class__SupertypesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4986:1: ( ( ruleSuperTypeList ) )
            // InternalMyDsl.g:4987:2: ( ruleSuperTypeList )
            {
            // InternalMyDsl.g:4987:2: ( ruleSuperTypeList )
            // InternalMyDsl.g:4988:3: ruleSuperTypeList
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


    // $ANTLR start "rule__Class__TypeStructureAssignment_4"
    // InternalMyDsl.g:4997:1: rule__Class__TypeStructureAssignment_4 : ( ruleTypeStructure ) ;
    public final void rule__Class__TypeStructureAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5001:1: ( ( ruleTypeStructure ) )
            // InternalMyDsl.g:5002:2: ( ruleTypeStructure )
            {
            // InternalMyDsl.g:5002:2: ( ruleTypeStructure )
            // InternalMyDsl.g:5003:3: ruleTypeStructure
            {
             before(grammarAccess.getClassAccess().getTypeStructureTypeStructureParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleTypeStructure();

            state._fsp--;

             after(grammarAccess.getClassAccess().getTypeStructureTypeStructureParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__TypeStructureAssignment_4"


    // $ANTLR start "rule__Class__WhereAssignment_5"
    // InternalMyDsl.g:5012:1: rule__Class__WhereAssignment_5 : ( ruleWhere ) ;
    public final void rule__Class__WhereAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5016:1: ( ( ruleWhere ) )
            // InternalMyDsl.g:5017:2: ( ruleWhere )
            {
            // InternalMyDsl.g:5017:2: ( ruleWhere )
            // InternalMyDsl.g:5018:3: ruleWhere
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
    // InternalMyDsl.g:5027:1: rule__Class__BodyElementsAssignment_8 : ( ruleTypeBodyElements ) ;
    public final void rule__Class__BodyElementsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5031:1: ( ( ruleTypeBodyElements ) )
            // InternalMyDsl.g:5032:2: ( ruleTypeBodyElements )
            {
            // InternalMyDsl.g:5032:2: ( ruleTypeBodyElements )
            // InternalMyDsl.g:5033:3: ruleTypeBodyElements
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
    // InternalMyDsl.g:5042:1: rule__TypeName__NameAssignment : ( RULE_ID ) ;
    public final void rule__TypeName__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5046:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:5047:2: ( RULE_ID )
            {
            // InternalMyDsl.g:5047:2: ( RULE_ID )
            // InternalMyDsl.g:5048:3: RULE_ID
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
    // InternalMyDsl.g:5057:1: rule__PolymorphicTypeName__NameAssignment : ( RULE_ID ) ;
    public final void rule__PolymorphicTypeName__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5061:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:5062:2: ( RULE_ID )
            {
            // InternalMyDsl.g:5062:2: ( RULE_ID )
            // InternalMyDsl.g:5063:3: RULE_ID
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
    // InternalMyDsl.g:5072:1: rule__PolyContext__PolyTypesAssignment_1 : ( rulePolyContextTypes ) ;
    public final void rule__PolyContext__PolyTypesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5076:1: ( ( rulePolyContextTypes ) )
            // InternalMyDsl.g:5077:2: ( rulePolyContextTypes )
            {
            // InternalMyDsl.g:5077:2: ( rulePolyContextTypes )
            // InternalMyDsl.g:5078:3: rulePolyContextTypes
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
    // InternalMyDsl.g:5087:1: rule__PolyContextTypes__NameAssignment_0 : ( rulePolymorphicTypeName ) ;
    public final void rule__PolyContextTypes__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5091:1: ( ( rulePolymorphicTypeName ) )
            // InternalMyDsl.g:5092:2: ( rulePolymorphicTypeName )
            {
            // InternalMyDsl.g:5092:2: ( rulePolymorphicTypeName )
            // InternalMyDsl.g:5093:3: rulePolymorphicTypeName
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
    // InternalMyDsl.g:5102:1: rule__PolyContextTypes__ConstraintsAssignment_1 : ( rulePolyTypeConstraints ) ;
    public final void rule__PolyContextTypes__ConstraintsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5106:1: ( ( rulePolyTypeConstraints ) )
            // InternalMyDsl.g:5107:2: ( rulePolyTypeConstraints )
            {
            // InternalMyDsl.g:5107:2: ( rulePolyTypeConstraints )
            // InternalMyDsl.g:5108:3: rulePolyTypeConstraints
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
    // InternalMyDsl.g:5117:1: rule__PolyTypeConstraints__TypeNameAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__PolyTypeConstraints__TypeNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5121:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:5122:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:5122:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:5123:3: ( RULE_ID )
            {
             before(grammarAccess.getPolyTypeConstraintsAccess().getTypeNameTypeNameCrossReference_1_0()); 
            // InternalMyDsl.g:5124:3: ( RULE_ID )
            // InternalMyDsl.g:5125:4: RULE_ID
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
    // InternalMyDsl.g:5136:1: rule__PolyTypeConstraints__TypeNameAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__PolyTypeConstraints__TypeNameAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5140:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:5141:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:5141:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:5142:3: ( RULE_ID )
            {
             before(grammarAccess.getPolyTypeConstraintsAccess().getTypeNameTypeNameCrossReference_2_1_0()); 
            // InternalMyDsl.g:5143:3: ( RULE_ID )
            // InternalMyDsl.g:5144:4: RULE_ID
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
    // InternalMyDsl.g:5155:1: rule__SuperTypeList__SuperTypeAssignment_1 : ( ruleConstructedType ) ;
    public final void rule__SuperTypeList__SuperTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5159:1: ( ( ruleConstructedType ) )
            // InternalMyDsl.g:5160:2: ( ruleConstructedType )
            {
            // InternalMyDsl.g:5160:2: ( ruleConstructedType )
            // InternalMyDsl.g:5161:3: ruleConstructedType
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
    // InternalMyDsl.g:5170:1: rule__SuperTypeList__SuperTypeAssignment_2_1 : ( ruleConstructedType ) ;
    public final void rule__SuperTypeList__SuperTypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5174:1: ( ( ruleConstructedType ) )
            // InternalMyDsl.g:5175:2: ( ruleConstructedType )
            {
            // InternalMyDsl.g:5175:2: ( ruleConstructedType )
            // InternalMyDsl.g:5176:3: ruleConstructedType
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
    // InternalMyDsl.g:5185:1: rule__ConstructedType__TypeAssignment_0 : ( ruleTypeConstructor ) ;
    public final void rule__ConstructedType__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5189:1: ( ( ruleTypeConstructor ) )
            // InternalMyDsl.g:5190:2: ( ruleTypeConstructor )
            {
            // InternalMyDsl.g:5190:2: ( ruleTypeConstructor )
            // InternalMyDsl.g:5191:3: ruleTypeConstructor
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
    // InternalMyDsl.g:5200:1: rule__ConstructedType__TypeAssignment_1_1 : ( ruleConstructedType ) ;
    public final void rule__ConstructedType__TypeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5204:1: ( ( ruleConstructedType ) )
            // InternalMyDsl.g:5205:2: ( ruleConstructedType )
            {
            // InternalMyDsl.g:5205:2: ( ruleConstructedType )
            // InternalMyDsl.g:5206:3: ruleConstructedType
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
    // InternalMyDsl.g:5215:1: rule__TypeConstructor__TypeNameAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__TypeConstructor__TypeNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5219:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:5220:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:5220:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:5221:3: ( RULE_ID )
            {
             before(grammarAccess.getTypeConstructorAccess().getTypeNameNameCrossReference_0_0()); 
            // InternalMyDsl.g:5222:3: ( RULE_ID )
            // InternalMyDsl.g:5223:4: RULE_ID
            {
             before(grammarAccess.getTypeConstructorAccess().getTypeNameNameIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTypeConstructorAccess().getTypeNameNameIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getTypeConstructorAccess().getTypeNameNameCrossReference_0_0()); 

            }


            }

        }
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
    // InternalMyDsl.g:5234:1: rule__TypeConstructor__ContextAssignment_1 : ( ruleTypeDeclContext ) ;
    public final void rule__TypeConstructor__ContextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5238:1: ( ( ruleTypeDeclContext ) )
            // InternalMyDsl.g:5239:2: ( ruleTypeDeclContext )
            {
            // InternalMyDsl.g:5239:2: ( ruleTypeDeclContext )
            // InternalMyDsl.g:5240:3: ruleTypeDeclContext
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
    // InternalMyDsl.g:5249:1: rule__TypeDeclContext__TypeNameAssignment_1 : ( ruleConstructedType ) ;
    public final void rule__TypeDeclContext__TypeNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5253:1: ( ( ruleConstructedType ) )
            // InternalMyDsl.g:5254:2: ( ruleConstructedType )
            {
            // InternalMyDsl.g:5254:2: ( ruleConstructedType )
            // InternalMyDsl.g:5255:3: ruleConstructedType
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
    // InternalMyDsl.g:5264:1: rule__TypeDeclContext__TypeNameAssignment_2_1 : ( ruleConstructedType ) ;
    public final void rule__TypeDeclContext__TypeNameAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5268:1: ( ( ruleConstructedType ) )
            // InternalMyDsl.g:5269:2: ( ruleConstructedType )
            {
            // InternalMyDsl.g:5269:2: ( ruleConstructedType )
            // InternalMyDsl.g:5270:3: ruleConstructedType
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
    // InternalMyDsl.g:5279:1: rule__TypeStructure__VariablesAssignment_1 : ( ruleTypedVariableList ) ;
    public final void rule__TypeStructure__VariablesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5283:1: ( ( ruleTypedVariableList ) )
            // InternalMyDsl.g:5284:2: ( ruleTypedVariableList )
            {
            // InternalMyDsl.g:5284:2: ( ruleTypedVariableList )
            // InternalMyDsl.g:5285:3: ruleTypedVariableList
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
    // InternalMyDsl.g:5294:1: rule__Where__ExpessionsAssignment_1 : ( ruleInfix ) ;
    public final void rule__Where__ExpessionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5298:1: ( ( ruleInfix ) )
            // InternalMyDsl.g:5299:2: ( ruleInfix )
            {
            // InternalMyDsl.g:5299:2: ( ruleInfix )
            // InternalMyDsl.g:5300:3: ruleInfix
            {
             before(grammarAccess.getWhereAccess().getExpessionsInfixParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleInfix();

            state._fsp--;

             after(grammarAccess.getWhereAccess().getExpessionsInfixParserRuleCall_1_0()); 

            }


            }

        }
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
    // InternalMyDsl.g:5309:1: rule__Where__ExpressionsAssignment_2_1 : ( ruleInfix ) ;
    public final void rule__Where__ExpressionsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5313:1: ( ( ruleInfix ) )
            // InternalMyDsl.g:5314:2: ( ruleInfix )
            {
            // InternalMyDsl.g:5314:2: ( ruleInfix )
            // InternalMyDsl.g:5315:3: ruleInfix
            {
             before(grammarAccess.getWhereAccess().getExpressionsInfixParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleInfix();

            state._fsp--;

             after(grammarAccess.getWhereAccess().getExpressionsInfixParserRuleCall_2_1_0()); 

            }


            }

        }
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
    // InternalMyDsl.g:5324:1: rule__Datatype__NameAssignment_1 : ( ruleTypeName ) ;
    public final void rule__Datatype__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5328:1: ( ( ruleTypeName ) )
            // InternalMyDsl.g:5329:2: ( ruleTypeName )
            {
            // InternalMyDsl.g:5329:2: ( ruleTypeName )
            // InternalMyDsl.g:5330:3: ruleTypeName
            {
             before(grammarAccess.getDatatypeAccess().getNameTypeNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTypeName();

            state._fsp--;

             after(grammarAccess.getDatatypeAccess().getNameTypeNameParserRuleCall_1_0()); 

            }


            }

        }
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
    // InternalMyDsl.g:5339:1: rule__Datatype__ContextAssignment_2 : ( rulePolyContext ) ;
    public final void rule__Datatype__ContextAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5343:1: ( ( rulePolyContext ) )
            // InternalMyDsl.g:5344:2: ( rulePolyContext )
            {
            // InternalMyDsl.g:5344:2: ( rulePolyContext )
            // InternalMyDsl.g:5345:3: rulePolyContext
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


    // $ANTLR start "rule__Datatype__ConstructorsAssignment_3"
    // InternalMyDsl.g:5354:1: rule__Datatype__ConstructorsAssignment_3 : ( ruleDatatypeConstructor ) ;
    public final void rule__Datatype__ConstructorsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5358:1: ( ( ruleDatatypeConstructor ) )
            // InternalMyDsl.g:5359:2: ( ruleDatatypeConstructor )
            {
            // InternalMyDsl.g:5359:2: ( ruleDatatypeConstructor )
            // InternalMyDsl.g:5360:3: ruleDatatypeConstructor
            {
             before(grammarAccess.getDatatypeAccess().getConstructorsDatatypeConstructorParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDatatypeConstructor();

            state._fsp--;

             after(grammarAccess.getDatatypeAccess().getConstructorsDatatypeConstructorParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Datatype__ConstructorsAssignment_3"


    // $ANTLR start "rule__Datatype__BodyElementsAssignment_5"
    // InternalMyDsl.g:5369:1: rule__Datatype__BodyElementsAssignment_5 : ( ruleTypeBodyElements ) ;
    public final void rule__Datatype__BodyElementsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5373:1: ( ( ruleTypeBodyElements ) )
            // InternalMyDsl.g:5374:2: ( ruleTypeBodyElements )
            {
            // InternalMyDsl.g:5374:2: ( ruleTypeBodyElements )
            // InternalMyDsl.g:5375:3: ruleTypeBodyElements
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


    // $ANTLR start "rule__BaseConstructor__NameAssignment"
    // InternalMyDsl.g:5384:1: rule__BaseConstructor__NameAssignment : ( RULE_ID ) ;
    public final void rule__BaseConstructor__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5388:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:5389:2: ( RULE_ID )
            {
            // InternalMyDsl.g:5389:2: ( RULE_ID )
            // InternalMyDsl.g:5390:3: RULE_ID
            {
             before(grammarAccess.getBaseConstructorAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBaseConstructorAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseConstructor__NameAssignment"


    // $ANTLR start "rule__DTypeConstructor__NameAssignment_0"
    // InternalMyDsl.g:5399:1: rule__DTypeConstructor__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__DTypeConstructor__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5403:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:5404:2: ( RULE_ID )
            {
            // InternalMyDsl.g:5404:2: ( RULE_ID )
            // InternalMyDsl.g:5405:3: RULE_ID
            {
             before(grammarAccess.getDTypeConstructorAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDTypeConstructorAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DTypeConstructor__NameAssignment_0"


    // $ANTLR start "rule__DTypeConstructor__DeconsAssignment_2"
    // InternalMyDsl.g:5414:1: rule__DTypeConstructor__DeconsAssignment_2 : ( ruleTypedVariableList ) ;
    public final void rule__DTypeConstructor__DeconsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5418:1: ( ( ruleTypedVariableList ) )
            // InternalMyDsl.g:5419:2: ( ruleTypedVariableList )
            {
            // InternalMyDsl.g:5419:2: ( ruleTypedVariableList )
            // InternalMyDsl.g:5420:3: ruleTypedVariableList
            {
             before(grammarAccess.getDTypeConstructorAccess().getDeconsTypedVariableListParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTypedVariableList();

            state._fsp--;

             after(grammarAccess.getDTypeConstructorAccess().getDeconsTypedVariableListParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DTypeConstructor__DeconsAssignment_2"


    // $ANTLR start "rule__Extend__NameAssignment_0"
    // InternalMyDsl.g:5429:1: rule__Extend__NameAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Extend__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5433:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:5434:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:5434:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:5435:3: ( RULE_ID )
            {
             before(grammarAccess.getExtendAccess().getNameTypeNameCrossReference_0_0()); 
            // InternalMyDsl.g:5436:3: ( RULE_ID )
            // InternalMyDsl.g:5437:4: RULE_ID
            {
             before(grammarAccess.getExtendAccess().getNameTypeNameIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getExtendAccess().getNameTypeNameIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getExtendAccess().getNameTypeNameCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extend__NameAssignment_0"


    // $ANTLR start "rule__Extend__ExtesnionAssignment_2"
    // InternalMyDsl.g:5448:1: rule__Extend__ExtesnionAssignment_2 : ( RULE_ID ) ;
    public final void rule__Extend__ExtesnionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5452:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:5453:2: ( RULE_ID )
            {
            // InternalMyDsl.g:5453:2: ( RULE_ID )
            // InternalMyDsl.g:5454:3: RULE_ID
            {
             before(grammarAccess.getExtendAccess().getExtesnionIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getExtendAccess().getExtesnionIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extend__ExtesnionAssignment_2"


    // $ANTLR start "rule__Extend__BodyElementsAssignment_5"
    // InternalMyDsl.g:5463:1: rule__Extend__BodyElementsAssignment_5 : ( ruleTypeBodyElements ) ;
    public final void rule__Extend__BodyElementsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5467:1: ( ( ruleTypeBodyElements ) )
            // InternalMyDsl.g:5468:2: ( ruleTypeBodyElements )
            {
            // InternalMyDsl.g:5468:2: ( ruleTypeBodyElements )
            // InternalMyDsl.g:5469:3: ruleTypeBodyElements
            {
             before(grammarAccess.getExtendAccess().getBodyElementsTypeBodyElementsParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleTypeBodyElements();

            state._fsp--;

             after(grammarAccess.getExtendAccess().getBodyElementsTypeBodyElementsParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extend__BodyElementsAssignment_5"


    // $ANTLR start "rule__TypeBodyElements__FunctionsAssignment_0"
    // InternalMyDsl.g:5478:1: rule__TypeBodyElements__FunctionsAssignment_0 : ( ruleFunctionDecl ) ;
    public final void rule__TypeBodyElements__FunctionsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5482:1: ( ( ruleFunctionDecl ) )
            // InternalMyDsl.g:5483:2: ( ruleFunctionDecl )
            {
            // InternalMyDsl.g:5483:2: ( ruleFunctionDecl )
            // InternalMyDsl.g:5484:3: ruleFunctionDecl
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
    // InternalMyDsl.g:5493:1: rule__TypeBodyElements__TheoremsAssignment_1 : ( ruleTheoremBody ) ;
    public final void rule__TypeBodyElements__TheoremsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5497:1: ( ( ruleTheoremBody ) )
            // InternalMyDsl.g:5498:2: ( ruleTheoremBody )
            {
            // InternalMyDsl.g:5498:2: ( ruleTheoremBody )
            // InternalMyDsl.g:5499:3: ruleTheoremBody
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
    // InternalMyDsl.g:5508:1: rule__FunctionDecl__NameAssignment_0 : ( ruleFunctionName ) ;
    public final void rule__FunctionDecl__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5512:1: ( ( ruleFunctionName ) )
            // InternalMyDsl.g:5513:2: ( ruleFunctionName )
            {
            // InternalMyDsl.g:5513:2: ( ruleFunctionName )
            // InternalMyDsl.g:5514:3: ruleFunctionName
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
    // InternalMyDsl.g:5523:1: rule__FunctionDecl__ContextAssignment_1 : ( rulePolyContext ) ;
    public final void rule__FunctionDecl__ContextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5527:1: ( ( rulePolyContext ) )
            // InternalMyDsl.g:5528:2: ( rulePolyContext )
            {
            // InternalMyDsl.g:5528:2: ( rulePolyContext )
            // InternalMyDsl.g:5529:3: rulePolyContext
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


    // $ANTLR start "rule__FunctionDecl__VariablesAssignment_3"
    // InternalMyDsl.g:5538:1: rule__FunctionDecl__VariablesAssignment_3 : ( ruleTypedVariableList ) ;
    public final void rule__FunctionDecl__VariablesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5542:1: ( ( ruleTypedVariableList ) )
            // InternalMyDsl.g:5543:2: ( ruleTypedVariableList )
            {
            // InternalMyDsl.g:5543:2: ( ruleTypedVariableList )
            // InternalMyDsl.g:5544:3: ruleTypedVariableList
            {
             before(grammarAccess.getFunctionDeclAccess().getVariablesTypedVariableListParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleTypedVariableList();

            state._fsp--;

             after(grammarAccess.getFunctionDeclAccess().getVariablesTypedVariableListParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDecl__VariablesAssignment_3"


    // $ANTLR start "rule__FunctionDecl__BodyAssignment_5"
    // InternalMyDsl.g:5553:1: rule__FunctionDecl__BodyAssignment_5 : ( ruleFunctionBody ) ;
    public final void rule__FunctionDecl__BodyAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5557:1: ( ( ruleFunctionBody ) )
            // InternalMyDsl.g:5558:2: ( ruleFunctionBody )
            {
            // InternalMyDsl.g:5558:2: ( ruleFunctionBody )
            // InternalMyDsl.g:5559:3: ruleFunctionBody
            {
             before(grammarAccess.getFunctionDeclAccess().getBodyFunctionBodyParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleFunctionBody();

            state._fsp--;

             after(grammarAccess.getFunctionDeclAccess().getBodyFunctionBodyParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDecl__BodyAssignment_5"


    // $ANTLR start "rule__FunctionDecl__ReturnTypeAssignment_7"
    // InternalMyDsl.g:5568:1: rule__FunctionDecl__ReturnTypeAssignment_7 : ( ruleTypeConstructor ) ;
    public final void rule__FunctionDecl__ReturnTypeAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5572:1: ( ( ruleTypeConstructor ) )
            // InternalMyDsl.g:5573:2: ( ruleTypeConstructor )
            {
            // InternalMyDsl.g:5573:2: ( ruleTypeConstructor )
            // InternalMyDsl.g:5574:3: ruleTypeConstructor
            {
             before(grammarAccess.getFunctionDeclAccess().getReturnTypeTypeConstructorParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleTypeConstructor();

            state._fsp--;

             after(grammarAccess.getFunctionDeclAccess().getReturnTypeTypeConstructorParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDecl__ReturnTypeAssignment_7"


    // $ANTLR start "rule__FunctionName__NameAssignment"
    // InternalMyDsl.g:5583:1: rule__FunctionName__NameAssignment : ( RULE_ID ) ;
    public final void rule__FunctionName__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5587:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:5588:2: ( RULE_ID )
            {
            // InternalMyDsl.g:5588:2: ( RULE_ID )
            // InternalMyDsl.g:5589:3: RULE_ID
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
    // InternalMyDsl.g:5598:1: rule__FuncDirectDef__ExpressionAssignment : ( ruleExpression ) ;
    public final void rule__FuncDirectDef__ExpressionAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5602:1: ( ( ruleExpression ) )
            // InternalMyDsl.g:5603:2: ( ruleExpression )
            {
            // InternalMyDsl.g:5603:2: ( ruleExpression )
            // InternalMyDsl.g:5604:3: ruleExpression
            {
             before(grammarAccess.getFuncDirectDefAccess().getExpressionExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getFuncDirectDefAccess().getExpressionExpressionParserRuleCall_0()); 

            }


            }

        }
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
    // InternalMyDsl.g:5613:1: rule__FuncInductive__VariableNameAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__FuncInductive__VariableNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5617:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:5618:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:5618:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:5619:3: ( RULE_ID )
            {
             before(grammarAccess.getFuncInductiveAccess().getVariableNameTypedVariableCrossReference_1_0()); 
            // InternalMyDsl.g:5620:3: ( RULE_ID )
            // InternalMyDsl.g:5621:4: RULE_ID
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
    // InternalMyDsl.g:5632:1: rule__FuncInductive__InductCaseAssignment_2 : ( ruleFuncInductiveCase ) ;
    public final void rule__FuncInductive__InductCaseAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5636:1: ( ( ruleFuncInductiveCase ) )
            // InternalMyDsl.g:5637:2: ( ruleFuncInductiveCase )
            {
            // InternalMyDsl.g:5637:2: ( ruleFuncInductiveCase )
            // InternalMyDsl.g:5638:3: ruleFuncInductiveCase
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
    // InternalMyDsl.g:5647:1: rule__FuncInductive__InductCaseAssignment_3 : ( ruleFuncInductiveCase ) ;
    public final void rule__FuncInductive__InductCaseAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5651:1: ( ( ruleFuncInductiveCase ) )
            // InternalMyDsl.g:5652:2: ( ruleFuncInductiveCase )
            {
            // InternalMyDsl.g:5652:2: ( ruleFuncInductiveCase )
            // InternalMyDsl.g:5653:3: ruleFuncInductiveCase
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
    // InternalMyDsl.g:5662:1: rule__FuncInductiveCase__DeconNameAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__FuncInductiveCase__DeconNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5666:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:5667:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:5667:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:5668:3: ( RULE_ID )
            {
             before(grammarAccess.getFuncInductiveCaseAccess().getDeconNameDTypeConstructorCrossReference_1_0()); 
            // InternalMyDsl.g:5669:3: ( RULE_ID )
            // InternalMyDsl.g:5670:4: RULE_ID
            {
             before(grammarAccess.getFuncInductiveCaseAccess().getDeconNameDTypeConstructorIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFuncInductiveCaseAccess().getDeconNameDTypeConstructorIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getFuncInductiveCaseAccess().getDeconNameDTypeConstructorCrossReference_1_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__FuncInductiveCase__ExpreAssignment_3"
    // InternalMyDsl.g:5681:1: rule__FuncInductiveCase__ExpreAssignment_3 : ( ruleExpression ) ;
    public final void rule__FuncInductiveCase__ExpreAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5685:1: ( ( ruleExpression ) )
            // InternalMyDsl.g:5686:2: ( ruleExpression )
            {
            // InternalMyDsl.g:5686:2: ( ruleExpression )
            // InternalMyDsl.g:5687:3: ruleExpression
            {
             before(grammarAccess.getFuncInductiveCaseAccess().getExpreExpressionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getFuncInductiveCaseAccess().getExpreExpressionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FuncInductiveCase__ExpreAssignment_3"


    // $ANTLR start "rule__TheoremBody__TheoremDeclAssignment_2"
    // InternalMyDsl.g:5696:1: rule__TheoremBody__TheoremDeclAssignment_2 : ( ruleTheoremDecl ) ;
    public final void rule__TheoremBody__TheoremDeclAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5700:1: ( ( ruleTheoremDecl ) )
            // InternalMyDsl.g:5701:2: ( ruleTheoremDecl )
            {
            // InternalMyDsl.g:5701:2: ( ruleTheoremDecl )
            // InternalMyDsl.g:5702:3: ruleTheoremDecl
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
    // InternalMyDsl.g:5711:1: rule__TheoremDecl__ThmNameAssignment_0 : ( ruleTHM_NAME ) ;
    public final void rule__TheoremDecl__ThmNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5715:1: ( ( ruleTHM_NAME ) )
            // InternalMyDsl.g:5716:2: ( ruleTHM_NAME )
            {
            // InternalMyDsl.g:5716:2: ( ruleTHM_NAME )
            // InternalMyDsl.g:5717:3: ruleTHM_NAME
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


    // $ANTLR start "rule__TheoremDecl__ExpAssignment_1"
    // InternalMyDsl.g:5726:1: rule__TheoremDecl__ExpAssignment_1 : ( ruleExpression ) ;
    public final void rule__TheoremDecl__ExpAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5730:1: ( ( ruleExpression ) )
            // InternalMyDsl.g:5731:2: ( ruleExpression )
            {
            // InternalMyDsl.g:5731:2: ( ruleExpression )
            // InternalMyDsl.g:5732:3: ruleExpression
            {
             before(grammarAccess.getTheoremDeclAccess().getExpExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getTheoremDeclAccess().getExpExpressionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TheoremDecl__ExpAssignment_1"


    // $ANTLR start "rule__TypedVariableList__TypeVarAssignment_0"
    // InternalMyDsl.g:5741:1: rule__TypedVariableList__TypeVarAssignment_0 : ( ruleTypedVariable ) ;
    public final void rule__TypedVariableList__TypeVarAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5745:1: ( ( ruleTypedVariable ) )
            // InternalMyDsl.g:5746:2: ( ruleTypedVariable )
            {
            // InternalMyDsl.g:5746:2: ( ruleTypedVariable )
            // InternalMyDsl.g:5747:3: ruleTypedVariable
            {
             before(grammarAccess.getTypedVariableListAccess().getTypeVarTypedVariableParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTypedVariable();

            state._fsp--;

             after(grammarAccess.getTypedVariableListAccess().getTypeVarTypedVariableParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedVariableList__TypeVarAssignment_0"


    // $ANTLR start "rule__TypedVariableList__TypeVarAssignment_1_1"
    // InternalMyDsl.g:5756:1: rule__TypedVariableList__TypeVarAssignment_1_1 : ( ruleTypedVariable ) ;
    public final void rule__TypedVariableList__TypeVarAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5760:1: ( ( ruleTypedVariable ) )
            // InternalMyDsl.g:5761:2: ( ruleTypedVariable )
            {
            // InternalMyDsl.g:5761:2: ( ruleTypedVariable )
            // InternalMyDsl.g:5762:3: ruleTypedVariable
            {
             before(grammarAccess.getTypedVariableListAccess().getTypeVarTypedVariableParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTypedVariable();

            state._fsp--;

             after(grammarAccess.getTypedVariableListAccess().getTypeVarTypedVariableParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedVariableList__TypeVarAssignment_1_1"


    // $ANTLR start "rule__TypedVariable__NameAssignment_0"
    // InternalMyDsl.g:5771:1: rule__TypedVariable__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__TypedVariable__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5775:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:5776:2: ( RULE_ID )
            {
            // InternalMyDsl.g:5776:2: ( RULE_ID )
            // InternalMyDsl.g:5777:3: RULE_ID
            {
             before(grammarAccess.getTypedVariableAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTypedVariableAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedVariable__NameAssignment_0"


    // $ANTLR start "rule__TypedVariable__TypeAssignment_2"
    // InternalMyDsl.g:5786:1: rule__TypedVariable__TypeAssignment_2 : ( ruleConstructedType ) ;
    public final void rule__TypedVariable__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5790:1: ( ( ruleConstructedType ) )
            // InternalMyDsl.g:5791:2: ( ruleConstructedType )
            {
            // InternalMyDsl.g:5791:2: ( ruleConstructedType )
            // InternalMyDsl.g:5792:3: ruleConstructedType
            {
             before(grammarAccess.getTypedVariableAccess().getTypeConstructedTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleConstructedType();

            state._fsp--;

             after(grammarAccess.getTypedVariableAccess().getTypeConstructedTypeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedVariable__TypeAssignment_2"


    // $ANTLR start "rule__Expression__NameAssignment"
    // InternalMyDsl.g:5801:1: rule__Expression__NameAssignment : ( RULE_ID ) ;
    public final void rule__Expression__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5805:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:5806:2: ( RULE_ID )
            {
            // InternalMyDsl.g:5806:2: ( RULE_ID )
            // InternalMyDsl.g:5807:3: RULE_ID
            {
             before(grammarAccess.getExpressionAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getExpressionAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__NameAssignment"


    // $ANTLR start "rule__Lambda__VarListAssignment_1"
    // InternalMyDsl.g:5816:1: rule__Lambda__VarListAssignment_1 : ( ruleTypedVariableList ) ;
    public final void rule__Lambda__VarListAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5820:1: ( ( ruleTypedVariableList ) )
            // InternalMyDsl.g:5821:2: ( ruleTypedVariableList )
            {
            // InternalMyDsl.g:5821:2: ( ruleTypedVariableList )
            // InternalMyDsl.g:5822:3: ruleTypedVariableList
            {
             before(grammarAccess.getLambdaAccess().getVarListTypedVariableListParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTypedVariableList();

            state._fsp--;

             after(grammarAccess.getLambdaAccess().getVarListTypedVariableListParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lambda__VarListAssignment_1"


    // $ANTLR start "rule__Lambda__ExprAssignment_3"
    // InternalMyDsl.g:5831:1: rule__Lambda__ExprAssignment_3 : ( ruleExpression ) ;
    public final void rule__Lambda__ExprAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5835:1: ( ( ruleExpression ) )
            // InternalMyDsl.g:5836:2: ( ruleExpression )
            {
            // InternalMyDsl.g:5836:2: ( ruleExpression )
            // InternalMyDsl.g:5837:3: ruleExpression
            {
             before(grammarAccess.getLambdaAccess().getExprExpressionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getLambdaAccess().getExprExpressionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lambda__ExprAssignment_3"


    // $ANTLR start "rule__Quantifier__VarListAssignment_1"
    // InternalMyDsl.g:5846:1: rule__Quantifier__VarListAssignment_1 : ( ruleTypedVariableList ) ;
    public final void rule__Quantifier__VarListAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5850:1: ( ( ruleTypedVariableList ) )
            // InternalMyDsl.g:5851:2: ( ruleTypedVariableList )
            {
            // InternalMyDsl.g:5851:2: ( ruleTypedVariableList )
            // InternalMyDsl.g:5852:3: ruleTypedVariableList
            {
             before(grammarAccess.getQuantifierAccess().getVarListTypedVariableListParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTypedVariableList();

            state._fsp--;

             after(grammarAccess.getQuantifierAccess().getVarListTypedVariableListParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quantifier__VarListAssignment_1"


    // $ANTLR start "rule__Quantifier__ExprAssignment_3"
    // InternalMyDsl.g:5861:1: rule__Quantifier__ExprAssignment_3 : ( ruleInfix ) ;
    public final void rule__Quantifier__ExprAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5865:1: ( ( ruleInfix ) )
            // InternalMyDsl.g:5866:2: ( ruleInfix )
            {
            // InternalMyDsl.g:5866:2: ( ruleInfix )
            // InternalMyDsl.g:5867:3: ruleInfix
            {
             before(grammarAccess.getQuantifierAccess().getExprInfixParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleInfix();

            state._fsp--;

             after(grammarAccess.getQuantifierAccess().getExprInfixParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quantifier__ExprAssignment_3"


    // $ANTLR start "rule__Prefix__NameAssignment_0"
    // InternalMyDsl.g:5876:1: rule__Prefix__NameAssignment_0 : ( rulePrefixBuiltIn ) ;
    public final void rule__Prefix__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5880:1: ( ( rulePrefixBuiltIn ) )
            // InternalMyDsl.g:5881:2: ( rulePrefixBuiltIn )
            {
            // InternalMyDsl.g:5881:2: ( rulePrefixBuiltIn )
            // InternalMyDsl.g:5882:3: rulePrefixBuiltIn
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
    // InternalMyDsl.g:5891:1: rule__Prefix__ElemAssignment_1 : ( ruleElement ) ;
    public final void rule__Prefix__ElemAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5895:1: ( ( ruleElement ) )
            // InternalMyDsl.g:5896:2: ( ruleElement )
            {
            // InternalMyDsl.g:5896:2: ( ruleElement )
            // InternalMyDsl.g:5897:3: ruleElement
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


    // $ANTLR start "rule__Infix__FuncNameAssignment_1_1"
    // InternalMyDsl.g:5906:1: rule__Infix__FuncNameAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__Infix__FuncNameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5910:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:5911:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:5911:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:5912:3: ( RULE_ID )
            {
             before(grammarAccess.getInfixAccess().getFuncNameFunctionNameCrossReference_1_1_0()); 
            // InternalMyDsl.g:5913:3: ( RULE_ID )
            // InternalMyDsl.g:5914:4: RULE_ID
            {
             before(grammarAccess.getInfixAccess().getFuncNameFunctionNameIDTerminalRuleCall_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInfixAccess().getFuncNameFunctionNameIDTerminalRuleCall_1_1_0_1()); 

            }

             after(grammarAccess.getInfixAccess().getFuncNameFunctionNameCrossReference_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Infix__FuncNameAssignment_1_1"


    // $ANTLR start "rule__Infix__RightAssignment_1_2"
    // InternalMyDsl.g:5925:1: rule__Infix__RightAssignment_1_2 : ( ruleElement ) ;
    public final void rule__Infix__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5929:1: ( ( ruleElement ) )
            // InternalMyDsl.g:5930:2: ( ruleElement )
            {
            // InternalMyDsl.g:5930:2: ( ruleElement )
            // InternalMyDsl.g:5931:3: ruleElement
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


    // $ANTLR start "rule__FunctionCall__FuncNameAssignment_0"
    // InternalMyDsl.g:5940:1: rule__FunctionCall__FuncNameAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__FunctionCall__FuncNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5944:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:5945:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:5945:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:5946:3: ( RULE_ID )
            {
             before(grammarAccess.getFunctionCallAccess().getFuncNameFunctionNameCrossReference_0_0()); 
            // InternalMyDsl.g:5947:3: ( RULE_ID )
            // InternalMyDsl.g:5948:4: RULE_ID
            {
             before(grammarAccess.getFunctionCallAccess().getFuncNameFunctionNameIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFunctionCallAccess().getFuncNameFunctionNameIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getFunctionCallAccess().getFuncNameFunctionNameCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__FuncNameAssignment_0"


    // $ANTLR start "rule__FunctionCall__ArgumentsAssignment_2"
    // InternalMyDsl.g:5959:1: rule__FunctionCall__ArgumentsAssignment_2 : ( ruleInfix ) ;
    public final void rule__FunctionCall__ArgumentsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5963:1: ( ( ruleInfix ) )
            // InternalMyDsl.g:5964:2: ( ruleInfix )
            {
            // InternalMyDsl.g:5964:2: ( ruleInfix )
            // InternalMyDsl.g:5965:3: ruleInfix
            {
             before(grammarAccess.getFunctionCallAccess().getArgumentsInfixParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleInfix();

            state._fsp--;

             after(grammarAccess.getFunctionCallAccess().getArgumentsInfixParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__ArgumentsAssignment_2"


    // $ANTLR start "rule__FunctionCall__ArgumentsAssignment_3_1"
    // InternalMyDsl.g:5974:1: rule__FunctionCall__ArgumentsAssignment_3_1 : ( ruleInfix ) ;
    public final void rule__FunctionCall__ArgumentsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5978:1: ( ( ruleInfix ) )
            // InternalMyDsl.g:5979:2: ( ruleInfix )
            {
            // InternalMyDsl.g:5979:2: ( ruleInfix )
            // InternalMyDsl.g:5980:3: ruleInfix
            {
             before(grammarAccess.getFunctionCallAccess().getArgumentsInfixParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleInfix();

            state._fsp--;

             after(grammarAccess.getFunctionCallAccess().getArgumentsInfixParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__ArgumentsAssignment_3_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000200A000012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000014B1000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000010040000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000010000000012L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000000003FF000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000400C00810L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00000040A0000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000480000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000800000010L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000008000000010L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000004000000010L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000040000000010L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000E00C00810L});

}