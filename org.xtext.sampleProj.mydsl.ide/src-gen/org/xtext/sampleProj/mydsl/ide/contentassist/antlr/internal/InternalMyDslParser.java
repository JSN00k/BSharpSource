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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'\\u00D7'", "'\\u2192'", "'\\uE102'", "'\\uE100'", "'\\u2194'", "'\\u2916'", "'\\u21F8'", "'\\u21A3'", "'\\u2900'", "'\\u21A0'", "'Import'", "'.'", "'Class'", "'{'", "'}'", "'<'", "'>'", "':'", "','", "'where'", "';'", "'Datatype'", "'|'", "'('", "')'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
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

                if ( (LA1_0==RULE_ID||LA1_0==21||LA1_0==23||LA1_0==32) ) {
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


    // $ANTLR start "entryRuleTopLevel"
    // InternalMyDsl.g:78:1: entryRuleTopLevel : ruleTopLevel EOF ;
    public final void entryRuleTopLevel() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleTopLevel EOF )
            // InternalMyDsl.g:80:1: ruleTopLevel EOF
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
    // InternalMyDsl.g:87:1: ruleTopLevel : ( ( rule__TopLevel__Alternatives ) ) ;
    public final void ruleTopLevel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__TopLevel__Alternatives ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__TopLevel__Alternatives ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__TopLevel__Alternatives ) )
            // InternalMyDsl.g:93:3: ( rule__TopLevel__Alternatives )
            {
             before(grammarAccess.getTopLevelAccess().getAlternatives()); 
            // InternalMyDsl.g:94:3: ( rule__TopLevel__Alternatives )
            // InternalMyDsl.g:94:4: rule__TopLevel__Alternatives
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
    // InternalMyDsl.g:103:1: entryRuleImportStatement : ruleImportStatement EOF ;
    public final void entryRuleImportStatement() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleImportStatement EOF )
            // InternalMyDsl.g:105:1: ruleImportStatement EOF
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
    // InternalMyDsl.g:112:1: ruleImportStatement : ( ( rule__ImportStatement__Group__0 ) ) ;
    public final void ruleImportStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__ImportStatement__Group__0 ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__ImportStatement__Group__0 ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__ImportStatement__Group__0 ) )
            // InternalMyDsl.g:118:3: ( rule__ImportStatement__Group__0 )
            {
             before(grammarAccess.getImportStatementAccess().getGroup()); 
            // InternalMyDsl.g:119:3: ( rule__ImportStatement__Group__0 )
            // InternalMyDsl.g:119:4: rule__ImportStatement__Group__0
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
    // InternalMyDsl.g:128:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleImport EOF )
            // InternalMyDsl.g:130:1: ruleImport EOF
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
    // InternalMyDsl.g:137:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__Import__Group__0 ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__Import__Group__0 ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__Import__Group__0 ) )
            // InternalMyDsl.g:143:3: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // InternalMyDsl.g:144:3: ( rule__Import__Group__0 )
            // InternalMyDsl.g:144:4: rule__Import__Group__0
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
    // InternalMyDsl.g:153:1: entryRuleImportComponent : ruleImportComponent EOF ;
    public final void entryRuleImportComponent() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleImportComponent EOF )
            // InternalMyDsl.g:155:1: ruleImportComponent EOF
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
    // InternalMyDsl.g:162:1: ruleImportComponent : ( ( rule__ImportComponent__NameAssignment ) ) ;
    public final void ruleImportComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__ImportComponent__NameAssignment ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__ImportComponent__NameAssignment ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__ImportComponent__NameAssignment ) )
            // InternalMyDsl.g:168:3: ( rule__ImportComponent__NameAssignment )
            {
             before(grammarAccess.getImportComponentAccess().getNameAssignment()); 
            // InternalMyDsl.g:169:3: ( rule__ImportComponent__NameAssignment )
            // InternalMyDsl.g:169:4: rule__ImportComponent__NameAssignment
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
    // InternalMyDsl.g:178:1: entryRuleClassDecl : ruleClassDecl EOF ;
    public final void entryRuleClassDecl() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( ruleClassDecl EOF )
            // InternalMyDsl.g:180:1: ruleClassDecl EOF
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
    // InternalMyDsl.g:187:1: ruleClassDecl : ( ( rule__ClassDecl__Alternatives ) ) ;
    public final void ruleClassDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( rule__ClassDecl__Alternatives ) ) )
            // InternalMyDsl.g:192:2: ( ( rule__ClassDecl__Alternatives ) )
            {
            // InternalMyDsl.g:192:2: ( ( rule__ClassDecl__Alternatives ) )
            // InternalMyDsl.g:193:3: ( rule__ClassDecl__Alternatives )
            {
             before(grammarAccess.getClassDeclAccess().getAlternatives()); 
            // InternalMyDsl.g:194:3: ( rule__ClassDecl__Alternatives )
            // InternalMyDsl.g:194:4: rule__ClassDecl__Alternatives
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
    // InternalMyDsl.g:203:1: entryRuleClass : ruleClass EOF ;
    public final void entryRuleClass() throws RecognitionException {
        try {
            // InternalMyDsl.g:204:1: ( ruleClass EOF )
            // InternalMyDsl.g:205:1: ruleClass EOF
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
    // InternalMyDsl.g:212:1: ruleClass : ( ( rule__Class__Group__0 ) ) ;
    public final void ruleClass() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:216:2: ( ( ( rule__Class__Group__0 ) ) )
            // InternalMyDsl.g:217:2: ( ( rule__Class__Group__0 ) )
            {
            // InternalMyDsl.g:217:2: ( ( rule__Class__Group__0 ) )
            // InternalMyDsl.g:218:3: ( rule__Class__Group__0 )
            {
             before(grammarAccess.getClassAccess().getGroup()); 
            // InternalMyDsl.g:219:3: ( rule__Class__Group__0 )
            // InternalMyDsl.g:219:4: rule__Class__Group__0
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
    // InternalMyDsl.g:228:1: entryRuleTypeName : ruleTypeName EOF ;
    public final void entryRuleTypeName() throws RecognitionException {
        try {
            // InternalMyDsl.g:229:1: ( ruleTypeName EOF )
            // InternalMyDsl.g:230:1: ruleTypeName EOF
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
    // InternalMyDsl.g:237:1: ruleTypeName : ( ( rule__TypeName__NameAssignment ) ) ;
    public final void ruleTypeName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:241:2: ( ( ( rule__TypeName__NameAssignment ) ) )
            // InternalMyDsl.g:242:2: ( ( rule__TypeName__NameAssignment ) )
            {
            // InternalMyDsl.g:242:2: ( ( rule__TypeName__NameAssignment ) )
            // InternalMyDsl.g:243:3: ( rule__TypeName__NameAssignment )
            {
             before(grammarAccess.getTypeNameAccess().getNameAssignment()); 
            // InternalMyDsl.g:244:3: ( rule__TypeName__NameAssignment )
            // InternalMyDsl.g:244:4: rule__TypeName__NameAssignment
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
    // InternalMyDsl.g:253:1: entryRulePolymorphicTypeName : rulePolymorphicTypeName EOF ;
    public final void entryRulePolymorphicTypeName() throws RecognitionException {
        try {
            // InternalMyDsl.g:254:1: ( rulePolymorphicTypeName EOF )
            // InternalMyDsl.g:255:1: rulePolymorphicTypeName EOF
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
    // InternalMyDsl.g:262:1: rulePolymorphicTypeName : ( ( rule__PolymorphicTypeName__NameAssignment ) ) ;
    public final void rulePolymorphicTypeName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:266:2: ( ( ( rule__PolymorphicTypeName__NameAssignment ) ) )
            // InternalMyDsl.g:267:2: ( ( rule__PolymorphicTypeName__NameAssignment ) )
            {
            // InternalMyDsl.g:267:2: ( ( rule__PolymorphicTypeName__NameAssignment ) )
            // InternalMyDsl.g:268:3: ( rule__PolymorphicTypeName__NameAssignment )
            {
             before(grammarAccess.getPolymorphicTypeNameAccess().getNameAssignment()); 
            // InternalMyDsl.g:269:3: ( rule__PolymorphicTypeName__NameAssignment )
            // InternalMyDsl.g:269:4: rule__PolymorphicTypeName__NameAssignment
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
    // InternalMyDsl.g:278:1: entryRulePolyContext : rulePolyContext EOF ;
    public final void entryRulePolyContext() throws RecognitionException {
        try {
            // InternalMyDsl.g:279:1: ( rulePolyContext EOF )
            // InternalMyDsl.g:280:1: rulePolyContext EOF
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
    // InternalMyDsl.g:287:1: rulePolyContext : ( ( rule__PolyContext__Group__0 ) ) ;
    public final void rulePolyContext() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:291:2: ( ( ( rule__PolyContext__Group__0 ) ) )
            // InternalMyDsl.g:292:2: ( ( rule__PolyContext__Group__0 ) )
            {
            // InternalMyDsl.g:292:2: ( ( rule__PolyContext__Group__0 ) )
            // InternalMyDsl.g:293:3: ( rule__PolyContext__Group__0 )
            {
             before(grammarAccess.getPolyContextAccess().getGroup()); 
            // InternalMyDsl.g:294:3: ( rule__PolyContext__Group__0 )
            // InternalMyDsl.g:294:4: rule__PolyContext__Group__0
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
    // InternalMyDsl.g:303:1: entryRulePolyContextTypes : rulePolyContextTypes EOF ;
    public final void entryRulePolyContextTypes() throws RecognitionException {
        try {
            // InternalMyDsl.g:304:1: ( rulePolyContextTypes EOF )
            // InternalMyDsl.g:305:1: rulePolyContextTypes EOF
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
    // InternalMyDsl.g:312:1: rulePolyContextTypes : ( ( rule__PolyContextTypes__Group__0 ) ) ;
    public final void rulePolyContextTypes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:316:2: ( ( ( rule__PolyContextTypes__Group__0 ) ) )
            // InternalMyDsl.g:317:2: ( ( rule__PolyContextTypes__Group__0 ) )
            {
            // InternalMyDsl.g:317:2: ( ( rule__PolyContextTypes__Group__0 ) )
            // InternalMyDsl.g:318:3: ( rule__PolyContextTypes__Group__0 )
            {
             before(grammarAccess.getPolyContextTypesAccess().getGroup()); 
            // InternalMyDsl.g:319:3: ( rule__PolyContextTypes__Group__0 )
            // InternalMyDsl.g:319:4: rule__PolyContextTypes__Group__0
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
    // InternalMyDsl.g:328:1: entryRulePolyTypeConstraints : rulePolyTypeConstraints EOF ;
    public final void entryRulePolyTypeConstraints() throws RecognitionException {
        try {
            // InternalMyDsl.g:329:1: ( rulePolyTypeConstraints EOF )
            // InternalMyDsl.g:330:1: rulePolyTypeConstraints EOF
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
    // InternalMyDsl.g:337:1: rulePolyTypeConstraints : ( ( rule__PolyTypeConstraints__Group__0 ) ) ;
    public final void rulePolyTypeConstraints() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:341:2: ( ( ( rule__PolyTypeConstraints__Group__0 ) ) )
            // InternalMyDsl.g:342:2: ( ( rule__PolyTypeConstraints__Group__0 ) )
            {
            // InternalMyDsl.g:342:2: ( ( rule__PolyTypeConstraints__Group__0 ) )
            // InternalMyDsl.g:343:3: ( rule__PolyTypeConstraints__Group__0 )
            {
             before(grammarAccess.getPolyTypeConstraintsAccess().getGroup()); 
            // InternalMyDsl.g:344:3: ( rule__PolyTypeConstraints__Group__0 )
            // InternalMyDsl.g:344:4: rule__PolyTypeConstraints__Group__0
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
    // InternalMyDsl.g:353:1: entryRuleSuperTypeList : ruleSuperTypeList EOF ;
    public final void entryRuleSuperTypeList() throws RecognitionException {
        try {
            // InternalMyDsl.g:354:1: ( ruleSuperTypeList EOF )
            // InternalMyDsl.g:355:1: ruleSuperTypeList EOF
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
    // InternalMyDsl.g:362:1: ruleSuperTypeList : ( ( rule__SuperTypeList__Group__0 ) ) ;
    public final void ruleSuperTypeList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:366:2: ( ( ( rule__SuperTypeList__Group__0 ) ) )
            // InternalMyDsl.g:367:2: ( ( rule__SuperTypeList__Group__0 ) )
            {
            // InternalMyDsl.g:367:2: ( ( rule__SuperTypeList__Group__0 ) )
            // InternalMyDsl.g:368:3: ( rule__SuperTypeList__Group__0 )
            {
             before(grammarAccess.getSuperTypeListAccess().getGroup()); 
            // InternalMyDsl.g:369:3: ( rule__SuperTypeList__Group__0 )
            // InternalMyDsl.g:369:4: rule__SuperTypeList__Group__0
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
    // InternalMyDsl.g:378:1: entryRuleConstructedType : ruleConstructedType EOF ;
    public final void entryRuleConstructedType() throws RecognitionException {
        try {
            // InternalMyDsl.g:379:1: ( ruleConstructedType EOF )
            // InternalMyDsl.g:380:1: ruleConstructedType EOF
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
    // InternalMyDsl.g:387:1: ruleConstructedType : ( ( rule__ConstructedType__Group__0 ) ) ;
    public final void ruleConstructedType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:391:2: ( ( ( rule__ConstructedType__Group__0 ) ) )
            // InternalMyDsl.g:392:2: ( ( rule__ConstructedType__Group__0 ) )
            {
            // InternalMyDsl.g:392:2: ( ( rule__ConstructedType__Group__0 ) )
            // InternalMyDsl.g:393:3: ( rule__ConstructedType__Group__0 )
            {
             before(grammarAccess.getConstructedTypeAccess().getGroup()); 
            // InternalMyDsl.g:394:3: ( rule__ConstructedType__Group__0 )
            // InternalMyDsl.g:394:4: rule__ConstructedType__Group__0
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
    // InternalMyDsl.g:403:1: entryRuleTypeConstructor : ruleTypeConstructor EOF ;
    public final void entryRuleTypeConstructor() throws RecognitionException {
        try {
            // InternalMyDsl.g:404:1: ( ruleTypeConstructor EOF )
            // InternalMyDsl.g:405:1: ruleTypeConstructor EOF
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
    // InternalMyDsl.g:412:1: ruleTypeConstructor : ( ( rule__TypeConstructor__Group__0 ) ) ;
    public final void ruleTypeConstructor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:416:2: ( ( ( rule__TypeConstructor__Group__0 ) ) )
            // InternalMyDsl.g:417:2: ( ( rule__TypeConstructor__Group__0 ) )
            {
            // InternalMyDsl.g:417:2: ( ( rule__TypeConstructor__Group__0 ) )
            // InternalMyDsl.g:418:3: ( rule__TypeConstructor__Group__0 )
            {
             before(grammarAccess.getTypeConstructorAccess().getGroup()); 
            // InternalMyDsl.g:419:3: ( rule__TypeConstructor__Group__0 )
            // InternalMyDsl.g:419:4: rule__TypeConstructor__Group__0
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
    // InternalMyDsl.g:428:1: entryRuleTypeDeclContext : ruleTypeDeclContext EOF ;
    public final void entryRuleTypeDeclContext() throws RecognitionException {
        try {
            // InternalMyDsl.g:429:1: ( ruleTypeDeclContext EOF )
            // InternalMyDsl.g:430:1: ruleTypeDeclContext EOF
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
    // InternalMyDsl.g:437:1: ruleTypeDeclContext : ( ( rule__TypeDeclContext__Group__0 ) ) ;
    public final void ruleTypeDeclContext() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:441:2: ( ( ( rule__TypeDeclContext__Group__0 ) ) )
            // InternalMyDsl.g:442:2: ( ( rule__TypeDeclContext__Group__0 ) )
            {
            // InternalMyDsl.g:442:2: ( ( rule__TypeDeclContext__Group__0 ) )
            // InternalMyDsl.g:443:3: ( rule__TypeDeclContext__Group__0 )
            {
             before(grammarAccess.getTypeDeclContextAccess().getGroup()); 
            // InternalMyDsl.g:444:3: ( rule__TypeDeclContext__Group__0 )
            // InternalMyDsl.g:444:4: rule__TypeDeclContext__Group__0
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
    // InternalMyDsl.g:453:1: entryRuleWhere : ruleWhere EOF ;
    public final void entryRuleWhere() throws RecognitionException {
        try {
            // InternalMyDsl.g:454:1: ( ruleWhere EOF )
            // InternalMyDsl.g:455:1: ruleWhere EOF
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
    // InternalMyDsl.g:462:1: ruleWhere : ( ( rule__Where__Group__0 ) ) ;
    public final void ruleWhere() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:466:2: ( ( ( rule__Where__Group__0 ) ) )
            // InternalMyDsl.g:467:2: ( ( rule__Where__Group__0 ) )
            {
            // InternalMyDsl.g:467:2: ( ( rule__Where__Group__0 ) )
            // InternalMyDsl.g:468:3: ( rule__Where__Group__0 )
            {
             before(grammarAccess.getWhereAccess().getGroup()); 
            // InternalMyDsl.g:469:3: ( rule__Where__Group__0 )
            // InternalMyDsl.g:469:4: rule__Where__Group__0
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
    // InternalMyDsl.g:478:1: entryRuleDatatype : ruleDatatype EOF ;
    public final void entryRuleDatatype() throws RecognitionException {
        try {
            // InternalMyDsl.g:479:1: ( ruleDatatype EOF )
            // InternalMyDsl.g:480:1: ruleDatatype EOF
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
    // InternalMyDsl.g:487:1: ruleDatatype : ( ( rule__Datatype__Group__0 ) ) ;
    public final void ruleDatatype() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:491:2: ( ( ( rule__Datatype__Group__0 ) ) )
            // InternalMyDsl.g:492:2: ( ( rule__Datatype__Group__0 ) )
            {
            // InternalMyDsl.g:492:2: ( ( rule__Datatype__Group__0 ) )
            // InternalMyDsl.g:493:3: ( rule__Datatype__Group__0 )
            {
             before(grammarAccess.getDatatypeAccess().getGroup()); 
            // InternalMyDsl.g:494:3: ( rule__Datatype__Group__0 )
            // InternalMyDsl.g:494:4: rule__Datatype__Group__0
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
    // InternalMyDsl.g:503:1: entryRuleDatatypeConstructor : ruleDatatypeConstructor EOF ;
    public final void entryRuleDatatypeConstructor() throws RecognitionException {
        try {
            // InternalMyDsl.g:504:1: ( ruleDatatypeConstructor EOF )
            // InternalMyDsl.g:505:1: ruleDatatypeConstructor EOF
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
    // InternalMyDsl.g:512:1: ruleDatatypeConstructor : ( ( rule__DatatypeConstructor__Group__0 ) ) ;
    public final void ruleDatatypeConstructor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:516:2: ( ( ( rule__DatatypeConstructor__Group__0 ) ) )
            // InternalMyDsl.g:517:2: ( ( rule__DatatypeConstructor__Group__0 ) )
            {
            // InternalMyDsl.g:517:2: ( ( rule__DatatypeConstructor__Group__0 ) )
            // InternalMyDsl.g:518:3: ( rule__DatatypeConstructor__Group__0 )
            {
             before(grammarAccess.getDatatypeConstructorAccess().getGroup()); 
            // InternalMyDsl.g:519:3: ( rule__DatatypeConstructor__Group__0 )
            // InternalMyDsl.g:519:4: rule__DatatypeConstructor__Group__0
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
    // InternalMyDsl.g:528:1: entryRuleBaseConstructor : ruleBaseConstructor EOF ;
    public final void entryRuleBaseConstructor() throws RecognitionException {
        try {
            // InternalMyDsl.g:529:1: ( ruleBaseConstructor EOF )
            // InternalMyDsl.g:530:1: ruleBaseConstructor EOF
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
    // InternalMyDsl.g:537:1: ruleBaseConstructor : ( ( rule__BaseConstructor__NameAssignment ) ) ;
    public final void ruleBaseConstructor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:541:2: ( ( ( rule__BaseConstructor__NameAssignment ) ) )
            // InternalMyDsl.g:542:2: ( ( rule__BaseConstructor__NameAssignment ) )
            {
            // InternalMyDsl.g:542:2: ( ( rule__BaseConstructor__NameAssignment ) )
            // InternalMyDsl.g:543:3: ( rule__BaseConstructor__NameAssignment )
            {
             before(grammarAccess.getBaseConstructorAccess().getNameAssignment()); 
            // InternalMyDsl.g:544:3: ( rule__BaseConstructor__NameAssignment )
            // InternalMyDsl.g:544:4: rule__BaseConstructor__NameAssignment
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
    // InternalMyDsl.g:553:1: entryRuleDTypeConstructor : ruleDTypeConstructor EOF ;
    public final void entryRuleDTypeConstructor() throws RecognitionException {
        try {
            // InternalMyDsl.g:554:1: ( ruleDTypeConstructor EOF )
            // InternalMyDsl.g:555:1: ruleDTypeConstructor EOF
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
    // InternalMyDsl.g:562:1: ruleDTypeConstructor : ( ( rule__DTypeConstructor__Group__0 ) ) ;
    public final void ruleDTypeConstructor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:566:2: ( ( ( rule__DTypeConstructor__Group__0 ) ) )
            // InternalMyDsl.g:567:2: ( ( rule__DTypeConstructor__Group__0 ) )
            {
            // InternalMyDsl.g:567:2: ( ( rule__DTypeConstructor__Group__0 ) )
            // InternalMyDsl.g:568:3: ( rule__DTypeConstructor__Group__0 )
            {
             before(grammarAccess.getDTypeConstructorAccess().getGroup()); 
            // InternalMyDsl.g:569:3: ( rule__DTypeConstructor__Group__0 )
            // InternalMyDsl.g:569:4: rule__DTypeConstructor__Group__0
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


    // $ANTLR start "entryRuleFunctionBody"
    // InternalMyDsl.g:653:1: entryRuleFunctionBody : ruleFunctionBody EOF ;
    public final void entryRuleFunctionBody() throws RecognitionException {
        try {
            // InternalMyDsl.g:654:1: ( ruleFunctionBody EOF )
            // InternalMyDsl.g:655:1: ruleFunctionBody EOF
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
    // InternalMyDsl.g:662:1: ruleFunctionBody : ( ruleFuncDirectDef ) ;
    public final void ruleFunctionBody() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:666:2: ( ( ruleFuncDirectDef ) )
            // InternalMyDsl.g:667:2: ( ruleFuncDirectDef )
            {
            // InternalMyDsl.g:667:2: ( ruleFuncDirectDef )
            // InternalMyDsl.g:668:3: ruleFuncDirectDef
            {
             before(grammarAccess.getFunctionBodyAccess().getFuncDirectDefParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleFuncDirectDef();

            state._fsp--;

             after(grammarAccess.getFunctionBodyAccess().getFuncDirectDefParserRuleCall()); 

            }


            }

        }
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
    // InternalMyDsl.g:678:1: entryRuleFuncDirectDef : ruleFuncDirectDef EOF ;
    public final void entryRuleFuncDirectDef() throws RecognitionException {
        try {
            // InternalMyDsl.g:679:1: ( ruleFuncDirectDef EOF )
            // InternalMyDsl.g:680:1: ruleFuncDirectDef EOF
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
    // InternalMyDsl.g:687:1: ruleFuncDirectDef : ( ( rule__FuncDirectDef__ExpressionAssignment ) ) ;
    public final void ruleFuncDirectDef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:691:2: ( ( ( rule__FuncDirectDef__ExpressionAssignment ) ) )
            // InternalMyDsl.g:692:2: ( ( rule__FuncDirectDef__ExpressionAssignment ) )
            {
            // InternalMyDsl.g:692:2: ( ( rule__FuncDirectDef__ExpressionAssignment ) )
            // InternalMyDsl.g:693:3: ( rule__FuncDirectDef__ExpressionAssignment )
            {
             before(grammarAccess.getFuncDirectDefAccess().getExpressionAssignment()); 
            // InternalMyDsl.g:694:3: ( rule__FuncDirectDef__ExpressionAssignment )
            // InternalMyDsl.g:694:4: rule__FuncDirectDef__ExpressionAssignment
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


    // $ANTLR start "entryRuleTheoremBody"
    // InternalMyDsl.g:703:1: entryRuleTheoremBody : ruleTheoremBody EOF ;
    public final void entryRuleTheoremBody() throws RecognitionException {
        try {
            // InternalMyDsl.g:704:1: ( ruleTheoremBody EOF )
            // InternalMyDsl.g:705:1: ruleTheoremBody EOF
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
    // InternalMyDsl.g:712:1: ruleTheoremBody : ( ( rule__TheoremBody__NameAssignment ) ) ;
    public final void ruleTheoremBody() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:716:2: ( ( ( rule__TheoremBody__NameAssignment ) ) )
            // InternalMyDsl.g:717:2: ( ( rule__TheoremBody__NameAssignment ) )
            {
            // InternalMyDsl.g:717:2: ( ( rule__TheoremBody__NameAssignment ) )
            // InternalMyDsl.g:718:3: ( rule__TheoremBody__NameAssignment )
            {
             before(grammarAccess.getTheoremBodyAccess().getNameAssignment()); 
            // InternalMyDsl.g:719:3: ( rule__TheoremBody__NameAssignment )
            // InternalMyDsl.g:719:4: rule__TheoremBody__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__TheoremBody__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getTheoremBodyAccess().getNameAssignment()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleTypedVariableList"
    // InternalMyDsl.g:728:1: entryRuleTypedVariableList : ruleTypedVariableList EOF ;
    public final void entryRuleTypedVariableList() throws RecognitionException {
        try {
            // InternalMyDsl.g:729:1: ( ruleTypedVariableList EOF )
            // InternalMyDsl.g:730:1: ruleTypedVariableList EOF
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
    // InternalMyDsl.g:737:1: ruleTypedVariableList : ( ( rule__TypedVariableList__Group__0 ) ) ;
    public final void ruleTypedVariableList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:741:2: ( ( ( rule__TypedVariableList__Group__0 ) ) )
            // InternalMyDsl.g:742:2: ( ( rule__TypedVariableList__Group__0 ) )
            {
            // InternalMyDsl.g:742:2: ( ( rule__TypedVariableList__Group__0 ) )
            // InternalMyDsl.g:743:3: ( rule__TypedVariableList__Group__0 )
            {
             before(grammarAccess.getTypedVariableListAccess().getGroup()); 
            // InternalMyDsl.g:744:3: ( rule__TypedVariableList__Group__0 )
            // InternalMyDsl.g:744:4: rule__TypedVariableList__Group__0
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
    // InternalMyDsl.g:753:1: entryRuleTypedVariable : ruleTypedVariable EOF ;
    public final void entryRuleTypedVariable() throws RecognitionException {
        try {
            // InternalMyDsl.g:754:1: ( ruleTypedVariable EOF )
            // InternalMyDsl.g:755:1: ruleTypedVariable EOF
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
    // InternalMyDsl.g:762:1: ruleTypedVariable : ( ( rule__TypedVariable__Group__0 ) ) ;
    public final void ruleTypedVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:766:2: ( ( ( rule__TypedVariable__Group__0 ) ) )
            // InternalMyDsl.g:767:2: ( ( rule__TypedVariable__Group__0 ) )
            {
            // InternalMyDsl.g:767:2: ( ( rule__TypedVariable__Group__0 ) )
            // InternalMyDsl.g:768:3: ( rule__TypedVariable__Group__0 )
            {
             before(grammarAccess.getTypedVariableAccess().getGroup()); 
            // InternalMyDsl.g:769:3: ( rule__TypedVariable__Group__0 )
            // InternalMyDsl.g:769:4: rule__TypedVariable__Group__0
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


    // $ANTLR start "entryRuleFunctionName"
    // InternalMyDsl.g:778:1: entryRuleFunctionName : ruleFunctionName EOF ;
    public final void entryRuleFunctionName() throws RecognitionException {
        try {
            // InternalMyDsl.g:779:1: ( ruleFunctionName EOF )
            // InternalMyDsl.g:780:1: ruleFunctionName EOF
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
    // InternalMyDsl.g:787:1: ruleFunctionName : ( ( rule__FunctionName__NameAssignment ) ) ;
    public final void ruleFunctionName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:791:2: ( ( ( rule__FunctionName__NameAssignment ) ) )
            // InternalMyDsl.g:792:2: ( ( rule__FunctionName__NameAssignment ) )
            {
            // InternalMyDsl.g:792:2: ( ( rule__FunctionName__NameAssignment ) )
            // InternalMyDsl.g:793:3: ( rule__FunctionName__NameAssignment )
            {
             before(grammarAccess.getFunctionNameAccess().getNameAssignment()); 
            // InternalMyDsl.g:794:3: ( rule__FunctionName__NameAssignment )
            // InternalMyDsl.g:794:4: rule__FunctionName__NameAssignment
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


    // $ANTLR start "entryRuleExpression"
    // InternalMyDsl.g:803:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalMyDsl.g:804:1: ( ruleExpression EOF )
            // InternalMyDsl.g:805:1: ruleExpression EOF
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
    // InternalMyDsl.g:812:1: ruleExpression : ( ( rule__Expression__NameAssignment ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:816:2: ( ( ( rule__Expression__NameAssignment ) ) )
            // InternalMyDsl.g:817:2: ( ( rule__Expression__NameAssignment ) )
            {
            // InternalMyDsl.g:817:2: ( ( rule__Expression__NameAssignment ) )
            // InternalMyDsl.g:818:3: ( rule__Expression__NameAssignment )
            {
             before(grammarAccess.getExpressionAccess().getNameAssignment()); 
            // InternalMyDsl.g:819:3: ( rule__Expression__NameAssignment )
            // InternalMyDsl.g:819:4: rule__Expression__NameAssignment
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


    // $ANTLR start "rule__TopLevel__Alternatives"
    // InternalMyDsl.g:827:1: rule__TopLevel__Alternatives : ( ( ruleImportStatement ) | ( ruleClassDecl ) );
    public final void rule__TopLevel__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:831:1: ( ( ruleImportStatement ) | ( ruleClassDecl ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==21) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID||LA2_0==23||LA2_0==32) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:832:2: ( ruleImportStatement )
                    {
                    // InternalMyDsl.g:832:2: ( ruleImportStatement )
                    // InternalMyDsl.g:833:3: ruleImportStatement
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
                    // InternalMyDsl.g:838:2: ( ruleClassDecl )
                    {
                    // InternalMyDsl.g:838:2: ( ruleClassDecl )
                    // InternalMyDsl.g:839:3: ruleClassDecl
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
    // InternalMyDsl.g:848:1: rule__ClassDecl__Alternatives : ( ( ruleClass ) | ( ruleDatatype ) | ( ruleExtend ) );
    public final void rule__ClassDecl__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:852:1: ( ( ruleClass ) | ( ruleDatatype ) | ( ruleExtend ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt3=1;
                }
                break;
            case 32:
                {
                alt3=2;
                }
                break;
            case RULE_ID:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:853:2: ( ruleClass )
                    {
                    // InternalMyDsl.g:853:2: ( ruleClass )
                    // InternalMyDsl.g:854:3: ruleClass
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
                    // InternalMyDsl.g:859:2: ( ruleDatatype )
                    {
                    // InternalMyDsl.g:859:2: ( ruleDatatype )
                    // InternalMyDsl.g:860:3: ruleDatatype
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
                    // InternalMyDsl.g:865:2: ( ruleExtend )
                    {
                    // InternalMyDsl.g:865:2: ( ruleExtend )
                    // InternalMyDsl.g:866:3: ruleExtend
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
    // InternalMyDsl.g:875:1: rule__ConstructedType__Alternatives_1_0 : ( ( '\\u00D7' ) | ( '\\u2192' ) | ( '\\uE102' ) | ( '\\uE100' ) | ( '\\u2194' ) | ( '\\u2916' ) | ( '\\u21F8' ) | ( '\\u21A3' ) | ( '\\u2900' ) | ( '\\u21A0' ) );
    public final void rule__ConstructedType__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:879:1: ( ( '\\u00D7' ) | ( '\\u2192' ) | ( '\\uE102' ) | ( '\\uE100' ) | ( '\\u2194' ) | ( '\\u2916' ) | ( '\\u21F8' ) | ( '\\u21A3' ) | ( '\\u2900' ) | ( '\\u21A0' ) )
            int alt4=10;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt4=1;
                }
                break;
            case 12:
                {
                alt4=2;
                }
                break;
            case 13:
                {
                alt4=3;
                }
                break;
            case 14:
                {
                alt4=4;
                }
                break;
            case 15:
                {
                alt4=5;
                }
                break;
            case 16:
                {
                alt4=6;
                }
                break;
            case 17:
                {
                alt4=7;
                }
                break;
            case 18:
                {
                alt4=8;
                }
                break;
            case 19:
                {
                alt4=9;
                }
                break;
            case 20:
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
                    // InternalMyDsl.g:880:2: ( '\\u00D7' )
                    {
                    // InternalMyDsl.g:880:2: ( '\\u00D7' )
                    // InternalMyDsl.g:881:3: '\\u00D7'
                    {
                     before(grammarAccess.getConstructedTypeAccess().getMultiplicationSignKeyword_1_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getConstructedTypeAccess().getMultiplicationSignKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:886:2: ( '\\u2192' )
                    {
                    // InternalMyDsl.g:886:2: ( '\\u2192' )
                    // InternalMyDsl.g:887:3: '\\u2192'
                    {
                     before(grammarAccess.getConstructedTypeAccess().getRightwardsArrowKeyword_1_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getConstructedTypeAccess().getRightwardsArrowKeyword_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:892:2: ( '\\uE102' )
                    {
                    // InternalMyDsl.g:892:2: ( '\\uE102' )
                    // InternalMyDsl.g:893:3: '\\uE102'
                    {
                     before(grammarAccess.getConstructedTypeAccess().getPrivateUseAreaE102Keyword_1_0_2()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getConstructedTypeAccess().getPrivateUseAreaE102Keyword_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:898:2: ( '\\uE100' )
                    {
                    // InternalMyDsl.g:898:2: ( '\\uE100' )
                    // InternalMyDsl.g:899:3: '\\uE100'
                    {
                     before(grammarAccess.getConstructedTypeAccess().getPrivateUseAreaE100Keyword_1_0_3()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getConstructedTypeAccess().getPrivateUseAreaE100Keyword_1_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:904:2: ( '\\u2194' )
                    {
                    // InternalMyDsl.g:904:2: ( '\\u2194' )
                    // InternalMyDsl.g:905:3: '\\u2194'
                    {
                     before(grammarAccess.getConstructedTypeAccess().getLeftRightArrowKeyword_1_0_4()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getConstructedTypeAccess().getLeftRightArrowKeyword_1_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:910:2: ( '\\u2916' )
                    {
                    // InternalMyDsl.g:910:2: ( '\\u2916' )
                    // InternalMyDsl.g:911:3: '\\u2916'
                    {
                     before(grammarAccess.getConstructedTypeAccess().getRightwardsTwoHeadedArrowWithTailKeyword_1_0_5()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getConstructedTypeAccess().getRightwardsTwoHeadedArrowWithTailKeyword_1_0_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:916:2: ( '\\u21F8' )
                    {
                    // InternalMyDsl.g:916:2: ( '\\u21F8' )
                    // InternalMyDsl.g:917:3: '\\u21F8'
                    {
                     before(grammarAccess.getConstructedTypeAccess().getRightwardsArrowWithVerticalStrokeKeyword_1_0_6()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getConstructedTypeAccess().getRightwardsArrowWithVerticalStrokeKeyword_1_0_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:922:2: ( '\\u21A3' )
                    {
                    // InternalMyDsl.g:922:2: ( '\\u21A3' )
                    // InternalMyDsl.g:923:3: '\\u21A3'
                    {
                     before(grammarAccess.getConstructedTypeAccess().getRightwardsArrowWithTailKeyword_1_0_7()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getConstructedTypeAccess().getRightwardsArrowWithTailKeyword_1_0_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalMyDsl.g:928:2: ( '\\u2900' )
                    {
                    // InternalMyDsl.g:928:2: ( '\\u2900' )
                    // InternalMyDsl.g:929:3: '\\u2900'
                    {
                     before(grammarAccess.getConstructedTypeAccess().getRightwardsTwoHeadedArrowWithVerticalStrokeKeyword_1_0_8()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getConstructedTypeAccess().getRightwardsTwoHeadedArrowWithVerticalStrokeKeyword_1_0_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalMyDsl.g:934:2: ( '\\u21A0' )
                    {
                    // InternalMyDsl.g:934:2: ( '\\u21A0' )
                    // InternalMyDsl.g:935:3: '\\u21A0'
                    {
                     before(grammarAccess.getConstructedTypeAccess().getRightwardsTwoHeadedArrowKeyword_1_0_9()); 
                    match(input,20,FOLLOW_2); 
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
    // InternalMyDsl.g:944:1: rule__DatatypeConstructor__Alternatives_1 : ( ( ruleBaseConstructor ) | ( ruleDTypeConstructor ) );
    public final void rule__DatatypeConstructor__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:948:1: ( ( ruleBaseConstructor ) | ( ruleDTypeConstructor ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==EOF||LA5_1==24||LA5_1==33) ) {
                    alt5=1;
                }
                else if ( (LA5_1==34) ) {
                    alt5=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:949:2: ( ruleBaseConstructor )
                    {
                    // InternalMyDsl.g:949:2: ( ruleBaseConstructor )
                    // InternalMyDsl.g:950:3: ruleBaseConstructor
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
                    // InternalMyDsl.g:955:2: ( ruleDTypeConstructor )
                    {
                    // InternalMyDsl.g:955:2: ( ruleDTypeConstructor )
                    // InternalMyDsl.g:956:3: ruleDTypeConstructor
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
    // InternalMyDsl.g:965:1: rule__TypeBodyElements__Alternatives : ( ( ( rule__TypeBodyElements__FunctionsAssignment_0 ) ) | ( ( rule__TypeBodyElements__TheoremsAssignment_1 ) ) );
    public final void rule__TypeBodyElements__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:969:1: ( ( ( rule__TypeBodyElements__FunctionsAssignment_0 ) ) | ( ( rule__TypeBodyElements__TheoremsAssignment_1 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==26||LA6_1==34) ) {
                    alt6=1;
                }
                else if ( (LA6_1==EOF||LA6_1==RULE_ID||LA6_1==25) ) {
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
                    // InternalMyDsl.g:970:2: ( ( rule__TypeBodyElements__FunctionsAssignment_0 ) )
                    {
                    // InternalMyDsl.g:970:2: ( ( rule__TypeBodyElements__FunctionsAssignment_0 ) )
                    // InternalMyDsl.g:971:3: ( rule__TypeBodyElements__FunctionsAssignment_0 )
                    {
                     before(grammarAccess.getTypeBodyElementsAccess().getFunctionsAssignment_0()); 
                    // InternalMyDsl.g:972:3: ( rule__TypeBodyElements__FunctionsAssignment_0 )
                    // InternalMyDsl.g:972:4: rule__TypeBodyElements__FunctionsAssignment_0
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
                    // InternalMyDsl.g:976:2: ( ( rule__TypeBodyElements__TheoremsAssignment_1 ) )
                    {
                    // InternalMyDsl.g:976:2: ( ( rule__TypeBodyElements__TheoremsAssignment_1 ) )
                    // InternalMyDsl.g:977:3: ( rule__TypeBodyElements__TheoremsAssignment_1 )
                    {
                     before(grammarAccess.getTypeBodyElementsAccess().getTheoremsAssignment_1()); 
                    // InternalMyDsl.g:978:3: ( rule__TypeBodyElements__TheoremsAssignment_1 )
                    // InternalMyDsl.g:978:4: rule__TypeBodyElements__TheoremsAssignment_1
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


    // $ANTLR start "rule__ImportStatement__Group__0"
    // InternalMyDsl.g:986:1: rule__ImportStatement__Group__0 : rule__ImportStatement__Group__0__Impl rule__ImportStatement__Group__1 ;
    public final void rule__ImportStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:990:1: ( rule__ImportStatement__Group__0__Impl rule__ImportStatement__Group__1 )
            // InternalMyDsl.g:991:2: rule__ImportStatement__Group__0__Impl rule__ImportStatement__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalMyDsl.g:998:1: rule__ImportStatement__Group__0__Impl : ( 'Import' ) ;
    public final void rule__ImportStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1002:1: ( ( 'Import' ) )
            // InternalMyDsl.g:1003:1: ( 'Import' )
            {
            // InternalMyDsl.g:1003:1: ( 'Import' )
            // InternalMyDsl.g:1004:2: 'Import'
            {
             before(grammarAccess.getImportStatementAccess().getImportKeyword_0()); 
            match(input,21,FOLLOW_2); 
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
    // InternalMyDsl.g:1013:1: rule__ImportStatement__Group__1 : rule__ImportStatement__Group__1__Impl ;
    public final void rule__ImportStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1017:1: ( rule__ImportStatement__Group__1__Impl )
            // InternalMyDsl.g:1018:2: rule__ImportStatement__Group__1__Impl
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
    // InternalMyDsl.g:1024:1: rule__ImportStatement__Group__1__Impl : ( ( rule__ImportStatement__ImportsAssignment_1 ) ) ;
    public final void rule__ImportStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1028:1: ( ( ( rule__ImportStatement__ImportsAssignment_1 ) ) )
            // InternalMyDsl.g:1029:1: ( ( rule__ImportStatement__ImportsAssignment_1 ) )
            {
            // InternalMyDsl.g:1029:1: ( ( rule__ImportStatement__ImportsAssignment_1 ) )
            // InternalMyDsl.g:1030:2: ( rule__ImportStatement__ImportsAssignment_1 )
            {
             before(grammarAccess.getImportStatementAccess().getImportsAssignment_1()); 
            // InternalMyDsl.g:1031:2: ( rule__ImportStatement__ImportsAssignment_1 )
            // InternalMyDsl.g:1031:3: rule__ImportStatement__ImportsAssignment_1
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
    // InternalMyDsl.g:1040:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1044:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalMyDsl.g:1045:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalMyDsl.g:1052:1: rule__Import__Group__0__Impl : ( ( rule__Import__ImportNameAssignment_0 ) ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1056:1: ( ( ( rule__Import__ImportNameAssignment_0 ) ) )
            // InternalMyDsl.g:1057:1: ( ( rule__Import__ImportNameAssignment_0 ) )
            {
            // InternalMyDsl.g:1057:1: ( ( rule__Import__ImportNameAssignment_0 ) )
            // InternalMyDsl.g:1058:2: ( rule__Import__ImportNameAssignment_0 )
            {
             before(grammarAccess.getImportAccess().getImportNameAssignment_0()); 
            // InternalMyDsl.g:1059:2: ( rule__Import__ImportNameAssignment_0 )
            // InternalMyDsl.g:1059:3: rule__Import__ImportNameAssignment_0
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
    // InternalMyDsl.g:1067:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1071:1: ( rule__Import__Group__1__Impl )
            // InternalMyDsl.g:1072:2: rule__Import__Group__1__Impl
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
    // InternalMyDsl.g:1078:1: rule__Import__Group__1__Impl : ( ( rule__Import__Group_1__0 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1082:1: ( ( ( rule__Import__Group_1__0 ) ) )
            // InternalMyDsl.g:1083:1: ( ( rule__Import__Group_1__0 ) )
            {
            // InternalMyDsl.g:1083:1: ( ( rule__Import__Group_1__0 ) )
            // InternalMyDsl.g:1084:2: ( rule__Import__Group_1__0 )
            {
             before(grammarAccess.getImportAccess().getGroup_1()); 
            // InternalMyDsl.g:1085:2: ( rule__Import__Group_1__0 )
            // InternalMyDsl.g:1085:3: rule__Import__Group_1__0
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
    // InternalMyDsl.g:1094:1: rule__Import__Group_1__0 : rule__Import__Group_1__0__Impl rule__Import__Group_1__1 ;
    public final void rule__Import__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1098:1: ( rule__Import__Group_1__0__Impl rule__Import__Group_1__1 )
            // InternalMyDsl.g:1099:2: rule__Import__Group_1__0__Impl rule__Import__Group_1__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalMyDsl.g:1106:1: rule__Import__Group_1__0__Impl : ( '.' ) ;
    public final void rule__Import__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1110:1: ( ( '.' ) )
            // InternalMyDsl.g:1111:1: ( '.' )
            {
            // InternalMyDsl.g:1111:1: ( '.' )
            // InternalMyDsl.g:1112:2: '.'
            {
             before(grammarAccess.getImportAccess().getFullStopKeyword_1_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalMyDsl.g:1121:1: rule__Import__Group_1__1 : rule__Import__Group_1__1__Impl ;
    public final void rule__Import__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1125:1: ( rule__Import__Group_1__1__Impl )
            // InternalMyDsl.g:1126:2: rule__Import__Group_1__1__Impl
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
    // InternalMyDsl.g:1132:1: rule__Import__Group_1__1__Impl : ( ( rule__Import__ImportNameAssignment_1_1 ) ) ;
    public final void rule__Import__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1136:1: ( ( ( rule__Import__ImportNameAssignment_1_1 ) ) )
            // InternalMyDsl.g:1137:1: ( ( rule__Import__ImportNameAssignment_1_1 ) )
            {
            // InternalMyDsl.g:1137:1: ( ( rule__Import__ImportNameAssignment_1_1 ) )
            // InternalMyDsl.g:1138:2: ( rule__Import__ImportNameAssignment_1_1 )
            {
             before(grammarAccess.getImportAccess().getImportNameAssignment_1_1()); 
            // InternalMyDsl.g:1139:2: ( rule__Import__ImportNameAssignment_1_1 )
            // InternalMyDsl.g:1139:3: rule__Import__ImportNameAssignment_1_1
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
    // InternalMyDsl.g:1148:1: rule__Class__Group__0 : rule__Class__Group__0__Impl rule__Class__Group__1 ;
    public final void rule__Class__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1152:1: ( rule__Class__Group__0__Impl rule__Class__Group__1 )
            // InternalMyDsl.g:1153:2: rule__Class__Group__0__Impl rule__Class__Group__1
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
    // InternalMyDsl.g:1160:1: rule__Class__Group__0__Impl : ( 'Class' ) ;
    public final void rule__Class__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1164:1: ( ( 'Class' ) )
            // InternalMyDsl.g:1165:1: ( 'Class' )
            {
            // InternalMyDsl.g:1165:1: ( 'Class' )
            // InternalMyDsl.g:1166:2: 'Class'
            {
             before(grammarAccess.getClassAccess().getClassKeyword_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalMyDsl.g:1175:1: rule__Class__Group__1 : rule__Class__Group__1__Impl rule__Class__Group__2 ;
    public final void rule__Class__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1179:1: ( rule__Class__Group__1__Impl rule__Class__Group__2 )
            // InternalMyDsl.g:1180:2: rule__Class__Group__1__Impl rule__Class__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalMyDsl.g:1187:1: rule__Class__Group__1__Impl : ( ( rule__Class__TypeNameAssignment_1 ) ) ;
    public final void rule__Class__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1191:1: ( ( ( rule__Class__TypeNameAssignment_1 ) ) )
            // InternalMyDsl.g:1192:1: ( ( rule__Class__TypeNameAssignment_1 ) )
            {
            // InternalMyDsl.g:1192:1: ( ( rule__Class__TypeNameAssignment_1 ) )
            // InternalMyDsl.g:1193:2: ( rule__Class__TypeNameAssignment_1 )
            {
             before(grammarAccess.getClassAccess().getTypeNameAssignment_1()); 
            // InternalMyDsl.g:1194:2: ( rule__Class__TypeNameAssignment_1 )
            // InternalMyDsl.g:1194:3: rule__Class__TypeNameAssignment_1
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
    // InternalMyDsl.g:1202:1: rule__Class__Group__2 : rule__Class__Group__2__Impl rule__Class__Group__3 ;
    public final void rule__Class__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1206:1: ( rule__Class__Group__2__Impl rule__Class__Group__3 )
            // InternalMyDsl.g:1207:2: rule__Class__Group__2__Impl rule__Class__Group__3
            {
            pushFollow(FOLLOW_6);
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
    // InternalMyDsl.g:1214:1: rule__Class__Group__2__Impl : ( ( rule__Class__ContextAssignment_2 )? ) ;
    public final void rule__Class__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1218:1: ( ( ( rule__Class__ContextAssignment_2 )? ) )
            // InternalMyDsl.g:1219:1: ( ( rule__Class__ContextAssignment_2 )? )
            {
            // InternalMyDsl.g:1219:1: ( ( rule__Class__ContextAssignment_2 )? )
            // InternalMyDsl.g:1220:2: ( rule__Class__ContextAssignment_2 )?
            {
             before(grammarAccess.getClassAccess().getContextAssignment_2()); 
            // InternalMyDsl.g:1221:2: ( rule__Class__ContextAssignment_2 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==26) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:1221:3: rule__Class__ContextAssignment_2
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
    // InternalMyDsl.g:1229:1: rule__Class__Group__3 : rule__Class__Group__3__Impl rule__Class__Group__4 ;
    public final void rule__Class__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1233:1: ( rule__Class__Group__3__Impl rule__Class__Group__4 )
            // InternalMyDsl.g:1234:2: rule__Class__Group__3__Impl rule__Class__Group__4
            {
            pushFollow(FOLLOW_6);
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
    // InternalMyDsl.g:1241:1: rule__Class__Group__3__Impl : ( ( rule__Class__SupertypesAssignment_3 )? ) ;
    public final void rule__Class__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1245:1: ( ( ( rule__Class__SupertypesAssignment_3 )? ) )
            // InternalMyDsl.g:1246:1: ( ( rule__Class__SupertypesAssignment_3 )? )
            {
            // InternalMyDsl.g:1246:1: ( ( rule__Class__SupertypesAssignment_3 )? )
            // InternalMyDsl.g:1247:2: ( rule__Class__SupertypesAssignment_3 )?
            {
             before(grammarAccess.getClassAccess().getSupertypesAssignment_3()); 
            // InternalMyDsl.g:1248:2: ( rule__Class__SupertypesAssignment_3 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==28) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:1248:3: rule__Class__SupertypesAssignment_3
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
    // InternalMyDsl.g:1256:1: rule__Class__Group__4 : rule__Class__Group__4__Impl rule__Class__Group__5 ;
    public final void rule__Class__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1260:1: ( rule__Class__Group__4__Impl rule__Class__Group__5 )
            // InternalMyDsl.g:1261:2: rule__Class__Group__4__Impl rule__Class__Group__5
            {
            pushFollow(FOLLOW_6);
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
    // InternalMyDsl.g:1268:1: rule__Class__Group__4__Impl : ( ( rule__Class__WhereAssignment_4 )? ) ;
    public final void rule__Class__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1272:1: ( ( ( rule__Class__WhereAssignment_4 )? ) )
            // InternalMyDsl.g:1273:1: ( ( rule__Class__WhereAssignment_4 )? )
            {
            // InternalMyDsl.g:1273:1: ( ( rule__Class__WhereAssignment_4 )? )
            // InternalMyDsl.g:1274:2: ( rule__Class__WhereAssignment_4 )?
            {
             before(grammarAccess.getClassAccess().getWhereAssignment_4()); 
            // InternalMyDsl.g:1275:2: ( rule__Class__WhereAssignment_4 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==30) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:1275:3: rule__Class__WhereAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Class__WhereAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClassAccess().getWhereAssignment_4()); 

            }


            }

        }
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
    // InternalMyDsl.g:1283:1: rule__Class__Group__5 : rule__Class__Group__5__Impl rule__Class__Group__6 ;
    public final void rule__Class__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1287:1: ( rule__Class__Group__5__Impl rule__Class__Group__6 )
            // InternalMyDsl.g:1288:2: rule__Class__Group__5__Impl rule__Class__Group__6
            {
            pushFollow(FOLLOW_7);
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
    // InternalMyDsl.g:1295:1: rule__Class__Group__5__Impl : ( '{' ) ;
    public final void rule__Class__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1299:1: ( ( '{' ) )
            // InternalMyDsl.g:1300:1: ( '{' )
            {
            // InternalMyDsl.g:1300:1: ( '{' )
            // InternalMyDsl.g:1301:2: '{'
            {
             before(grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_5()); 

            }


            }

        }
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
    // InternalMyDsl.g:1310:1: rule__Class__Group__6 : rule__Class__Group__6__Impl rule__Class__Group__7 ;
    public final void rule__Class__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1314:1: ( rule__Class__Group__6__Impl rule__Class__Group__7 )
            // InternalMyDsl.g:1315:2: rule__Class__Group__6__Impl rule__Class__Group__7
            {
            pushFollow(FOLLOW_7);
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
    // InternalMyDsl.g:1322:1: rule__Class__Group__6__Impl : ( ( rule__Class__BodyElementsAssignment_6 )* ) ;
    public final void rule__Class__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1326:1: ( ( ( rule__Class__BodyElementsAssignment_6 )* ) )
            // InternalMyDsl.g:1327:1: ( ( rule__Class__BodyElementsAssignment_6 )* )
            {
            // InternalMyDsl.g:1327:1: ( ( rule__Class__BodyElementsAssignment_6 )* )
            // InternalMyDsl.g:1328:2: ( rule__Class__BodyElementsAssignment_6 )*
            {
             before(grammarAccess.getClassAccess().getBodyElementsAssignment_6()); 
            // InternalMyDsl.g:1329:2: ( rule__Class__BodyElementsAssignment_6 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMyDsl.g:1329:3: rule__Class__BodyElementsAssignment_6
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Class__BodyElementsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getClassAccess().getBodyElementsAssignment_6()); 

            }


            }

        }
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
    // InternalMyDsl.g:1337:1: rule__Class__Group__7 : rule__Class__Group__7__Impl ;
    public final void rule__Class__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1341:1: ( rule__Class__Group__7__Impl )
            // InternalMyDsl.g:1342:2: rule__Class__Group__7__Impl
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
    // InternalMyDsl.g:1348:1: rule__Class__Group__7__Impl : ( '}' ) ;
    public final void rule__Class__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1352:1: ( ( '}' ) )
            // InternalMyDsl.g:1353:1: ( '}' )
            {
            // InternalMyDsl.g:1353:1: ( '}' )
            // InternalMyDsl.g:1354:2: '}'
            {
             before(grammarAccess.getClassAccess().getRightCurlyBracketKeyword_7()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
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
    // InternalMyDsl.g:1364:1: rule__PolyContext__Group__0 : rule__PolyContext__Group__0__Impl rule__PolyContext__Group__1 ;
    public final void rule__PolyContext__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1368:1: ( rule__PolyContext__Group__0__Impl rule__PolyContext__Group__1 )
            // InternalMyDsl.g:1369:2: rule__PolyContext__Group__0__Impl rule__PolyContext__Group__1
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
    // InternalMyDsl.g:1376:1: rule__PolyContext__Group__0__Impl : ( '<' ) ;
    public final void rule__PolyContext__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1380:1: ( ( '<' ) )
            // InternalMyDsl.g:1381:1: ( '<' )
            {
            // InternalMyDsl.g:1381:1: ( '<' )
            // InternalMyDsl.g:1382:2: '<'
            {
             before(grammarAccess.getPolyContextAccess().getLessThanSignKeyword_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalMyDsl.g:1391:1: rule__PolyContext__Group__1 : rule__PolyContext__Group__1__Impl rule__PolyContext__Group__2 ;
    public final void rule__PolyContext__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1395:1: ( rule__PolyContext__Group__1__Impl rule__PolyContext__Group__2 )
            // InternalMyDsl.g:1396:2: rule__PolyContext__Group__1__Impl rule__PolyContext__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalMyDsl.g:1403:1: rule__PolyContext__Group__1__Impl : ( ( ( rule__PolyContext__PolyTypesAssignment_1 ) ) ( ( rule__PolyContext__PolyTypesAssignment_1 )* ) ) ;
    public final void rule__PolyContext__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1407:1: ( ( ( ( rule__PolyContext__PolyTypesAssignment_1 ) ) ( ( rule__PolyContext__PolyTypesAssignment_1 )* ) ) )
            // InternalMyDsl.g:1408:1: ( ( ( rule__PolyContext__PolyTypesAssignment_1 ) ) ( ( rule__PolyContext__PolyTypesAssignment_1 )* ) )
            {
            // InternalMyDsl.g:1408:1: ( ( ( rule__PolyContext__PolyTypesAssignment_1 ) ) ( ( rule__PolyContext__PolyTypesAssignment_1 )* ) )
            // InternalMyDsl.g:1409:2: ( ( rule__PolyContext__PolyTypesAssignment_1 ) ) ( ( rule__PolyContext__PolyTypesAssignment_1 )* )
            {
            // InternalMyDsl.g:1409:2: ( ( rule__PolyContext__PolyTypesAssignment_1 ) )
            // InternalMyDsl.g:1410:3: ( rule__PolyContext__PolyTypesAssignment_1 )
            {
             before(grammarAccess.getPolyContextAccess().getPolyTypesAssignment_1()); 
            // InternalMyDsl.g:1411:3: ( rule__PolyContext__PolyTypesAssignment_1 )
            // InternalMyDsl.g:1411:4: rule__PolyContext__PolyTypesAssignment_1
            {
            pushFollow(FOLLOW_8);
            rule__PolyContext__PolyTypesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPolyContextAccess().getPolyTypesAssignment_1()); 

            }

            // InternalMyDsl.g:1414:2: ( ( rule__PolyContext__PolyTypesAssignment_1 )* )
            // InternalMyDsl.g:1415:3: ( rule__PolyContext__PolyTypesAssignment_1 )*
            {
             before(grammarAccess.getPolyContextAccess().getPolyTypesAssignment_1()); 
            // InternalMyDsl.g:1416:3: ( rule__PolyContext__PolyTypesAssignment_1 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMyDsl.g:1416:4: rule__PolyContext__PolyTypesAssignment_1
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__PolyContext__PolyTypesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalMyDsl.g:1425:1: rule__PolyContext__Group__2 : rule__PolyContext__Group__2__Impl ;
    public final void rule__PolyContext__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1429:1: ( rule__PolyContext__Group__2__Impl )
            // InternalMyDsl.g:1430:2: rule__PolyContext__Group__2__Impl
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
    // InternalMyDsl.g:1436:1: rule__PolyContext__Group__2__Impl : ( '>' ) ;
    public final void rule__PolyContext__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1440:1: ( ( '>' ) )
            // InternalMyDsl.g:1441:1: ( '>' )
            {
            // InternalMyDsl.g:1441:1: ( '>' )
            // InternalMyDsl.g:1442:2: '>'
            {
             before(grammarAccess.getPolyContextAccess().getGreaterThanSignKeyword_2()); 
            match(input,27,FOLLOW_2); 
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
    // InternalMyDsl.g:1452:1: rule__PolyContextTypes__Group__0 : rule__PolyContextTypes__Group__0__Impl rule__PolyContextTypes__Group__1 ;
    public final void rule__PolyContextTypes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1456:1: ( rule__PolyContextTypes__Group__0__Impl rule__PolyContextTypes__Group__1 )
            // InternalMyDsl.g:1457:2: rule__PolyContextTypes__Group__0__Impl rule__PolyContextTypes__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyDsl.g:1464:1: rule__PolyContextTypes__Group__0__Impl : ( ( rule__PolyContextTypes__NameAssignment_0 ) ) ;
    public final void rule__PolyContextTypes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1468:1: ( ( ( rule__PolyContextTypes__NameAssignment_0 ) ) )
            // InternalMyDsl.g:1469:1: ( ( rule__PolyContextTypes__NameAssignment_0 ) )
            {
            // InternalMyDsl.g:1469:1: ( ( rule__PolyContextTypes__NameAssignment_0 ) )
            // InternalMyDsl.g:1470:2: ( rule__PolyContextTypes__NameAssignment_0 )
            {
             before(grammarAccess.getPolyContextTypesAccess().getNameAssignment_0()); 
            // InternalMyDsl.g:1471:2: ( rule__PolyContextTypes__NameAssignment_0 )
            // InternalMyDsl.g:1471:3: rule__PolyContextTypes__NameAssignment_0
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
    // InternalMyDsl.g:1479:1: rule__PolyContextTypes__Group__1 : rule__PolyContextTypes__Group__1__Impl ;
    public final void rule__PolyContextTypes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1483:1: ( rule__PolyContextTypes__Group__1__Impl )
            // InternalMyDsl.g:1484:2: rule__PolyContextTypes__Group__1__Impl
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
    // InternalMyDsl.g:1490:1: rule__PolyContextTypes__Group__1__Impl : ( ( rule__PolyContextTypes__ConstraintsAssignment_1 )* ) ;
    public final void rule__PolyContextTypes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1494:1: ( ( ( rule__PolyContextTypes__ConstraintsAssignment_1 )* ) )
            // InternalMyDsl.g:1495:1: ( ( rule__PolyContextTypes__ConstraintsAssignment_1 )* )
            {
            // InternalMyDsl.g:1495:1: ( ( rule__PolyContextTypes__ConstraintsAssignment_1 )* )
            // InternalMyDsl.g:1496:2: ( rule__PolyContextTypes__ConstraintsAssignment_1 )*
            {
             before(grammarAccess.getPolyContextTypesAccess().getConstraintsAssignment_1()); 
            // InternalMyDsl.g:1497:2: ( rule__PolyContextTypes__ConstraintsAssignment_1 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==28) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMyDsl.g:1497:3: rule__PolyContextTypes__ConstraintsAssignment_1
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__PolyContextTypes__ConstraintsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalMyDsl.g:1506:1: rule__PolyTypeConstraints__Group__0 : rule__PolyTypeConstraints__Group__0__Impl rule__PolyTypeConstraints__Group__1 ;
    public final void rule__PolyTypeConstraints__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1510:1: ( rule__PolyTypeConstraints__Group__0__Impl rule__PolyTypeConstraints__Group__1 )
            // InternalMyDsl.g:1511:2: rule__PolyTypeConstraints__Group__0__Impl rule__PolyTypeConstraints__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalMyDsl.g:1518:1: rule__PolyTypeConstraints__Group__0__Impl : ( ':' ) ;
    public final void rule__PolyTypeConstraints__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1522:1: ( ( ':' ) )
            // InternalMyDsl.g:1523:1: ( ':' )
            {
            // InternalMyDsl.g:1523:1: ( ':' )
            // InternalMyDsl.g:1524:2: ':'
            {
             before(grammarAccess.getPolyTypeConstraintsAccess().getColonKeyword_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalMyDsl.g:1533:1: rule__PolyTypeConstraints__Group__1 : rule__PolyTypeConstraints__Group__1__Impl rule__PolyTypeConstraints__Group__2 ;
    public final void rule__PolyTypeConstraints__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1537:1: ( rule__PolyTypeConstraints__Group__1__Impl rule__PolyTypeConstraints__Group__2 )
            // InternalMyDsl.g:1538:2: rule__PolyTypeConstraints__Group__1__Impl rule__PolyTypeConstraints__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalMyDsl.g:1545:1: rule__PolyTypeConstraints__Group__1__Impl : ( ( rule__PolyTypeConstraints__TypeNameAssignment_1 ) ) ;
    public final void rule__PolyTypeConstraints__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1549:1: ( ( ( rule__PolyTypeConstraints__TypeNameAssignment_1 ) ) )
            // InternalMyDsl.g:1550:1: ( ( rule__PolyTypeConstraints__TypeNameAssignment_1 ) )
            {
            // InternalMyDsl.g:1550:1: ( ( rule__PolyTypeConstraints__TypeNameAssignment_1 ) )
            // InternalMyDsl.g:1551:2: ( rule__PolyTypeConstraints__TypeNameAssignment_1 )
            {
             before(grammarAccess.getPolyTypeConstraintsAccess().getTypeNameAssignment_1()); 
            // InternalMyDsl.g:1552:2: ( rule__PolyTypeConstraints__TypeNameAssignment_1 )
            // InternalMyDsl.g:1552:3: rule__PolyTypeConstraints__TypeNameAssignment_1
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
    // InternalMyDsl.g:1560:1: rule__PolyTypeConstraints__Group__2 : rule__PolyTypeConstraints__Group__2__Impl ;
    public final void rule__PolyTypeConstraints__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1564:1: ( rule__PolyTypeConstraints__Group__2__Impl )
            // InternalMyDsl.g:1565:2: rule__PolyTypeConstraints__Group__2__Impl
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
    // InternalMyDsl.g:1571:1: rule__PolyTypeConstraints__Group__2__Impl : ( ( rule__PolyTypeConstraints__Group_2__0 )* ) ;
    public final void rule__PolyTypeConstraints__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1575:1: ( ( ( rule__PolyTypeConstraints__Group_2__0 )* ) )
            // InternalMyDsl.g:1576:1: ( ( rule__PolyTypeConstraints__Group_2__0 )* )
            {
            // InternalMyDsl.g:1576:1: ( ( rule__PolyTypeConstraints__Group_2__0 )* )
            // InternalMyDsl.g:1577:2: ( rule__PolyTypeConstraints__Group_2__0 )*
            {
             before(grammarAccess.getPolyTypeConstraintsAccess().getGroup_2()); 
            // InternalMyDsl.g:1578:2: ( rule__PolyTypeConstraints__Group_2__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==29) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMyDsl.g:1578:3: rule__PolyTypeConstraints__Group_2__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__PolyTypeConstraints__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalMyDsl.g:1587:1: rule__PolyTypeConstraints__Group_2__0 : rule__PolyTypeConstraints__Group_2__0__Impl rule__PolyTypeConstraints__Group_2__1 ;
    public final void rule__PolyTypeConstraints__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1591:1: ( rule__PolyTypeConstraints__Group_2__0__Impl rule__PolyTypeConstraints__Group_2__1 )
            // InternalMyDsl.g:1592:2: rule__PolyTypeConstraints__Group_2__0__Impl rule__PolyTypeConstraints__Group_2__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalMyDsl.g:1599:1: rule__PolyTypeConstraints__Group_2__0__Impl : ( ',' ) ;
    public final void rule__PolyTypeConstraints__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1603:1: ( ( ',' ) )
            // InternalMyDsl.g:1604:1: ( ',' )
            {
            // InternalMyDsl.g:1604:1: ( ',' )
            // InternalMyDsl.g:1605:2: ','
            {
             before(grammarAccess.getPolyTypeConstraintsAccess().getCommaKeyword_2_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalMyDsl.g:1614:1: rule__PolyTypeConstraints__Group_2__1 : rule__PolyTypeConstraints__Group_2__1__Impl ;
    public final void rule__PolyTypeConstraints__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1618:1: ( rule__PolyTypeConstraints__Group_2__1__Impl )
            // InternalMyDsl.g:1619:2: rule__PolyTypeConstraints__Group_2__1__Impl
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
    // InternalMyDsl.g:1625:1: rule__PolyTypeConstraints__Group_2__1__Impl : ( ( rule__PolyTypeConstraints__TypeNameAssignment_2_1 ) ) ;
    public final void rule__PolyTypeConstraints__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1629:1: ( ( ( rule__PolyTypeConstraints__TypeNameAssignment_2_1 ) ) )
            // InternalMyDsl.g:1630:1: ( ( rule__PolyTypeConstraints__TypeNameAssignment_2_1 ) )
            {
            // InternalMyDsl.g:1630:1: ( ( rule__PolyTypeConstraints__TypeNameAssignment_2_1 ) )
            // InternalMyDsl.g:1631:2: ( rule__PolyTypeConstraints__TypeNameAssignment_2_1 )
            {
             before(grammarAccess.getPolyTypeConstraintsAccess().getTypeNameAssignment_2_1()); 
            // InternalMyDsl.g:1632:2: ( rule__PolyTypeConstraints__TypeNameAssignment_2_1 )
            // InternalMyDsl.g:1632:3: rule__PolyTypeConstraints__TypeNameAssignment_2_1
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
    // InternalMyDsl.g:1641:1: rule__SuperTypeList__Group__0 : rule__SuperTypeList__Group__0__Impl rule__SuperTypeList__Group__1 ;
    public final void rule__SuperTypeList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1645:1: ( rule__SuperTypeList__Group__0__Impl rule__SuperTypeList__Group__1 )
            // InternalMyDsl.g:1646:2: rule__SuperTypeList__Group__0__Impl rule__SuperTypeList__Group__1
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
    // InternalMyDsl.g:1653:1: rule__SuperTypeList__Group__0__Impl : ( ':' ) ;
    public final void rule__SuperTypeList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1657:1: ( ( ':' ) )
            // InternalMyDsl.g:1658:1: ( ':' )
            {
            // InternalMyDsl.g:1658:1: ( ':' )
            // InternalMyDsl.g:1659:2: ':'
            {
             before(grammarAccess.getSuperTypeListAccess().getColonKeyword_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalMyDsl.g:1668:1: rule__SuperTypeList__Group__1 : rule__SuperTypeList__Group__1__Impl rule__SuperTypeList__Group__2 ;
    public final void rule__SuperTypeList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1672:1: ( rule__SuperTypeList__Group__1__Impl rule__SuperTypeList__Group__2 )
            // InternalMyDsl.g:1673:2: rule__SuperTypeList__Group__1__Impl rule__SuperTypeList__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalMyDsl.g:1680:1: rule__SuperTypeList__Group__1__Impl : ( ( rule__SuperTypeList__SuperTypeAssignment_1 ) ) ;
    public final void rule__SuperTypeList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1684:1: ( ( ( rule__SuperTypeList__SuperTypeAssignment_1 ) ) )
            // InternalMyDsl.g:1685:1: ( ( rule__SuperTypeList__SuperTypeAssignment_1 ) )
            {
            // InternalMyDsl.g:1685:1: ( ( rule__SuperTypeList__SuperTypeAssignment_1 ) )
            // InternalMyDsl.g:1686:2: ( rule__SuperTypeList__SuperTypeAssignment_1 )
            {
             before(grammarAccess.getSuperTypeListAccess().getSuperTypeAssignment_1()); 
            // InternalMyDsl.g:1687:2: ( rule__SuperTypeList__SuperTypeAssignment_1 )
            // InternalMyDsl.g:1687:3: rule__SuperTypeList__SuperTypeAssignment_1
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
    // InternalMyDsl.g:1695:1: rule__SuperTypeList__Group__2 : rule__SuperTypeList__Group__2__Impl ;
    public final void rule__SuperTypeList__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1699:1: ( rule__SuperTypeList__Group__2__Impl )
            // InternalMyDsl.g:1700:2: rule__SuperTypeList__Group__2__Impl
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
    // InternalMyDsl.g:1706:1: rule__SuperTypeList__Group__2__Impl : ( ( rule__SuperTypeList__Group_2__0 )* ) ;
    public final void rule__SuperTypeList__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1710:1: ( ( ( rule__SuperTypeList__Group_2__0 )* ) )
            // InternalMyDsl.g:1711:1: ( ( rule__SuperTypeList__Group_2__0 )* )
            {
            // InternalMyDsl.g:1711:1: ( ( rule__SuperTypeList__Group_2__0 )* )
            // InternalMyDsl.g:1712:2: ( rule__SuperTypeList__Group_2__0 )*
            {
             before(grammarAccess.getSuperTypeListAccess().getGroup_2()); 
            // InternalMyDsl.g:1713:2: ( rule__SuperTypeList__Group_2__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==29) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMyDsl.g:1713:3: rule__SuperTypeList__Group_2__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__SuperTypeList__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalMyDsl.g:1722:1: rule__SuperTypeList__Group_2__0 : rule__SuperTypeList__Group_2__0__Impl rule__SuperTypeList__Group_2__1 ;
    public final void rule__SuperTypeList__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1726:1: ( rule__SuperTypeList__Group_2__0__Impl rule__SuperTypeList__Group_2__1 )
            // InternalMyDsl.g:1727:2: rule__SuperTypeList__Group_2__0__Impl rule__SuperTypeList__Group_2__1
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
    // InternalMyDsl.g:1734:1: rule__SuperTypeList__Group_2__0__Impl : ( ',' ) ;
    public final void rule__SuperTypeList__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1738:1: ( ( ',' ) )
            // InternalMyDsl.g:1739:1: ( ',' )
            {
            // InternalMyDsl.g:1739:1: ( ',' )
            // InternalMyDsl.g:1740:2: ','
            {
             before(grammarAccess.getSuperTypeListAccess().getCommaKeyword_2_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalMyDsl.g:1749:1: rule__SuperTypeList__Group_2__1 : rule__SuperTypeList__Group_2__1__Impl ;
    public final void rule__SuperTypeList__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1753:1: ( rule__SuperTypeList__Group_2__1__Impl )
            // InternalMyDsl.g:1754:2: rule__SuperTypeList__Group_2__1__Impl
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
    // InternalMyDsl.g:1760:1: rule__SuperTypeList__Group_2__1__Impl : ( ( rule__SuperTypeList__SuperTypeAssignment_2_1 ) ) ;
    public final void rule__SuperTypeList__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1764:1: ( ( ( rule__SuperTypeList__SuperTypeAssignment_2_1 ) ) )
            // InternalMyDsl.g:1765:1: ( ( rule__SuperTypeList__SuperTypeAssignment_2_1 ) )
            {
            // InternalMyDsl.g:1765:1: ( ( rule__SuperTypeList__SuperTypeAssignment_2_1 ) )
            // InternalMyDsl.g:1766:2: ( rule__SuperTypeList__SuperTypeAssignment_2_1 )
            {
             before(grammarAccess.getSuperTypeListAccess().getSuperTypeAssignment_2_1()); 
            // InternalMyDsl.g:1767:2: ( rule__SuperTypeList__SuperTypeAssignment_2_1 )
            // InternalMyDsl.g:1767:3: rule__SuperTypeList__SuperTypeAssignment_2_1
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
    // InternalMyDsl.g:1776:1: rule__ConstructedType__Group__0 : rule__ConstructedType__Group__0__Impl rule__ConstructedType__Group__1 ;
    public final void rule__ConstructedType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1780:1: ( rule__ConstructedType__Group__0__Impl rule__ConstructedType__Group__1 )
            // InternalMyDsl.g:1781:2: rule__ConstructedType__Group__0__Impl rule__ConstructedType__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalMyDsl.g:1788:1: rule__ConstructedType__Group__0__Impl : ( ( rule__ConstructedType__TypeAssignment_0 ) ) ;
    public final void rule__ConstructedType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1792:1: ( ( ( rule__ConstructedType__TypeAssignment_0 ) ) )
            // InternalMyDsl.g:1793:1: ( ( rule__ConstructedType__TypeAssignment_0 ) )
            {
            // InternalMyDsl.g:1793:1: ( ( rule__ConstructedType__TypeAssignment_0 ) )
            // InternalMyDsl.g:1794:2: ( rule__ConstructedType__TypeAssignment_0 )
            {
             before(grammarAccess.getConstructedTypeAccess().getTypeAssignment_0()); 
            // InternalMyDsl.g:1795:2: ( rule__ConstructedType__TypeAssignment_0 )
            // InternalMyDsl.g:1795:3: rule__ConstructedType__TypeAssignment_0
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
    // InternalMyDsl.g:1803:1: rule__ConstructedType__Group__1 : rule__ConstructedType__Group__1__Impl ;
    public final void rule__ConstructedType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1807:1: ( rule__ConstructedType__Group__1__Impl )
            // InternalMyDsl.g:1808:2: rule__ConstructedType__Group__1__Impl
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
    // InternalMyDsl.g:1814:1: rule__ConstructedType__Group__1__Impl : ( ( rule__ConstructedType__Group_1__0 )? ) ;
    public final void rule__ConstructedType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1818:1: ( ( ( rule__ConstructedType__Group_1__0 )? ) )
            // InternalMyDsl.g:1819:1: ( ( rule__ConstructedType__Group_1__0 )? )
            {
            // InternalMyDsl.g:1819:1: ( ( rule__ConstructedType__Group_1__0 )? )
            // InternalMyDsl.g:1820:2: ( rule__ConstructedType__Group_1__0 )?
            {
             before(grammarAccess.getConstructedTypeAccess().getGroup_1()); 
            // InternalMyDsl.g:1821:2: ( rule__ConstructedType__Group_1__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=11 && LA15_0<=20)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMyDsl.g:1821:3: rule__ConstructedType__Group_1__0
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
    // InternalMyDsl.g:1830:1: rule__ConstructedType__Group_1__0 : rule__ConstructedType__Group_1__0__Impl rule__ConstructedType__Group_1__1 ;
    public final void rule__ConstructedType__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1834:1: ( rule__ConstructedType__Group_1__0__Impl rule__ConstructedType__Group_1__1 )
            // InternalMyDsl.g:1835:2: rule__ConstructedType__Group_1__0__Impl rule__ConstructedType__Group_1__1
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
    // InternalMyDsl.g:1842:1: rule__ConstructedType__Group_1__0__Impl : ( ( rule__ConstructedType__Alternatives_1_0 ) ) ;
    public final void rule__ConstructedType__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1846:1: ( ( ( rule__ConstructedType__Alternatives_1_0 ) ) )
            // InternalMyDsl.g:1847:1: ( ( rule__ConstructedType__Alternatives_1_0 ) )
            {
            // InternalMyDsl.g:1847:1: ( ( rule__ConstructedType__Alternatives_1_0 ) )
            // InternalMyDsl.g:1848:2: ( rule__ConstructedType__Alternatives_1_0 )
            {
             before(grammarAccess.getConstructedTypeAccess().getAlternatives_1_0()); 
            // InternalMyDsl.g:1849:2: ( rule__ConstructedType__Alternatives_1_0 )
            // InternalMyDsl.g:1849:3: rule__ConstructedType__Alternatives_1_0
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
    // InternalMyDsl.g:1857:1: rule__ConstructedType__Group_1__1 : rule__ConstructedType__Group_1__1__Impl ;
    public final void rule__ConstructedType__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1861:1: ( rule__ConstructedType__Group_1__1__Impl )
            // InternalMyDsl.g:1862:2: rule__ConstructedType__Group_1__1__Impl
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
    // InternalMyDsl.g:1868:1: rule__ConstructedType__Group_1__1__Impl : ( ( rule__ConstructedType__TypeAssignment_1_1 ) ) ;
    public final void rule__ConstructedType__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1872:1: ( ( ( rule__ConstructedType__TypeAssignment_1_1 ) ) )
            // InternalMyDsl.g:1873:1: ( ( rule__ConstructedType__TypeAssignment_1_1 ) )
            {
            // InternalMyDsl.g:1873:1: ( ( rule__ConstructedType__TypeAssignment_1_1 ) )
            // InternalMyDsl.g:1874:2: ( rule__ConstructedType__TypeAssignment_1_1 )
            {
             before(grammarAccess.getConstructedTypeAccess().getTypeAssignment_1_1()); 
            // InternalMyDsl.g:1875:2: ( rule__ConstructedType__TypeAssignment_1_1 )
            // InternalMyDsl.g:1875:3: rule__ConstructedType__TypeAssignment_1_1
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
    // InternalMyDsl.g:1884:1: rule__TypeConstructor__Group__0 : rule__TypeConstructor__Group__0__Impl rule__TypeConstructor__Group__1 ;
    public final void rule__TypeConstructor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1888:1: ( rule__TypeConstructor__Group__0__Impl rule__TypeConstructor__Group__1 )
            // InternalMyDsl.g:1889:2: rule__TypeConstructor__Group__0__Impl rule__TypeConstructor__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalMyDsl.g:1896:1: rule__TypeConstructor__Group__0__Impl : ( ( rule__TypeConstructor__TypeNameAssignment_0 ) ) ;
    public final void rule__TypeConstructor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1900:1: ( ( ( rule__TypeConstructor__TypeNameAssignment_0 ) ) )
            // InternalMyDsl.g:1901:1: ( ( rule__TypeConstructor__TypeNameAssignment_0 ) )
            {
            // InternalMyDsl.g:1901:1: ( ( rule__TypeConstructor__TypeNameAssignment_0 ) )
            // InternalMyDsl.g:1902:2: ( rule__TypeConstructor__TypeNameAssignment_0 )
            {
             before(grammarAccess.getTypeConstructorAccess().getTypeNameAssignment_0()); 
            // InternalMyDsl.g:1903:2: ( rule__TypeConstructor__TypeNameAssignment_0 )
            // InternalMyDsl.g:1903:3: rule__TypeConstructor__TypeNameAssignment_0
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
    // InternalMyDsl.g:1911:1: rule__TypeConstructor__Group__1 : rule__TypeConstructor__Group__1__Impl ;
    public final void rule__TypeConstructor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1915:1: ( rule__TypeConstructor__Group__1__Impl )
            // InternalMyDsl.g:1916:2: rule__TypeConstructor__Group__1__Impl
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
    // InternalMyDsl.g:1922:1: rule__TypeConstructor__Group__1__Impl : ( ( rule__TypeConstructor__ContextAssignment_1 )? ) ;
    public final void rule__TypeConstructor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1926:1: ( ( ( rule__TypeConstructor__ContextAssignment_1 )? ) )
            // InternalMyDsl.g:1927:1: ( ( rule__TypeConstructor__ContextAssignment_1 )? )
            {
            // InternalMyDsl.g:1927:1: ( ( rule__TypeConstructor__ContextAssignment_1 )? )
            // InternalMyDsl.g:1928:2: ( rule__TypeConstructor__ContextAssignment_1 )?
            {
             before(grammarAccess.getTypeConstructorAccess().getContextAssignment_1()); 
            // InternalMyDsl.g:1929:2: ( rule__TypeConstructor__ContextAssignment_1 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==26) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMyDsl.g:1929:3: rule__TypeConstructor__ContextAssignment_1
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
    // InternalMyDsl.g:1938:1: rule__TypeDeclContext__Group__0 : rule__TypeDeclContext__Group__0__Impl rule__TypeDeclContext__Group__1 ;
    public final void rule__TypeDeclContext__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1942:1: ( rule__TypeDeclContext__Group__0__Impl rule__TypeDeclContext__Group__1 )
            // InternalMyDsl.g:1943:2: rule__TypeDeclContext__Group__0__Impl rule__TypeDeclContext__Group__1
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
    // InternalMyDsl.g:1950:1: rule__TypeDeclContext__Group__0__Impl : ( '<' ) ;
    public final void rule__TypeDeclContext__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1954:1: ( ( '<' ) )
            // InternalMyDsl.g:1955:1: ( '<' )
            {
            // InternalMyDsl.g:1955:1: ( '<' )
            // InternalMyDsl.g:1956:2: '<'
            {
             before(grammarAccess.getTypeDeclContextAccess().getLessThanSignKeyword_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalMyDsl.g:1965:1: rule__TypeDeclContext__Group__1 : rule__TypeDeclContext__Group__1__Impl rule__TypeDeclContext__Group__2 ;
    public final void rule__TypeDeclContext__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1969:1: ( rule__TypeDeclContext__Group__1__Impl rule__TypeDeclContext__Group__2 )
            // InternalMyDsl.g:1970:2: rule__TypeDeclContext__Group__1__Impl rule__TypeDeclContext__Group__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalMyDsl.g:1977:1: rule__TypeDeclContext__Group__1__Impl : ( ( rule__TypeDeclContext__TypeNameAssignment_1 ) ) ;
    public final void rule__TypeDeclContext__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1981:1: ( ( ( rule__TypeDeclContext__TypeNameAssignment_1 ) ) )
            // InternalMyDsl.g:1982:1: ( ( rule__TypeDeclContext__TypeNameAssignment_1 ) )
            {
            // InternalMyDsl.g:1982:1: ( ( rule__TypeDeclContext__TypeNameAssignment_1 ) )
            // InternalMyDsl.g:1983:2: ( rule__TypeDeclContext__TypeNameAssignment_1 )
            {
             before(grammarAccess.getTypeDeclContextAccess().getTypeNameAssignment_1()); 
            // InternalMyDsl.g:1984:2: ( rule__TypeDeclContext__TypeNameAssignment_1 )
            // InternalMyDsl.g:1984:3: rule__TypeDeclContext__TypeNameAssignment_1
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
    // InternalMyDsl.g:1992:1: rule__TypeDeclContext__Group__2 : rule__TypeDeclContext__Group__2__Impl rule__TypeDeclContext__Group__3 ;
    public final void rule__TypeDeclContext__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1996:1: ( rule__TypeDeclContext__Group__2__Impl rule__TypeDeclContext__Group__3 )
            // InternalMyDsl.g:1997:2: rule__TypeDeclContext__Group__2__Impl rule__TypeDeclContext__Group__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalMyDsl.g:2004:1: rule__TypeDeclContext__Group__2__Impl : ( ( rule__TypeDeclContext__Group_2__0 )* ) ;
    public final void rule__TypeDeclContext__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2008:1: ( ( ( rule__TypeDeclContext__Group_2__0 )* ) )
            // InternalMyDsl.g:2009:1: ( ( rule__TypeDeclContext__Group_2__0 )* )
            {
            // InternalMyDsl.g:2009:1: ( ( rule__TypeDeclContext__Group_2__0 )* )
            // InternalMyDsl.g:2010:2: ( rule__TypeDeclContext__Group_2__0 )*
            {
             before(grammarAccess.getTypeDeclContextAccess().getGroup_2()); 
            // InternalMyDsl.g:2011:2: ( rule__TypeDeclContext__Group_2__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==29) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalMyDsl.g:2011:3: rule__TypeDeclContext__Group_2__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__TypeDeclContext__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalMyDsl.g:2019:1: rule__TypeDeclContext__Group__3 : rule__TypeDeclContext__Group__3__Impl ;
    public final void rule__TypeDeclContext__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2023:1: ( rule__TypeDeclContext__Group__3__Impl )
            // InternalMyDsl.g:2024:2: rule__TypeDeclContext__Group__3__Impl
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
    // InternalMyDsl.g:2030:1: rule__TypeDeclContext__Group__3__Impl : ( '>' ) ;
    public final void rule__TypeDeclContext__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2034:1: ( ( '>' ) )
            // InternalMyDsl.g:2035:1: ( '>' )
            {
            // InternalMyDsl.g:2035:1: ( '>' )
            // InternalMyDsl.g:2036:2: '>'
            {
             before(grammarAccess.getTypeDeclContextAccess().getGreaterThanSignKeyword_3()); 
            match(input,27,FOLLOW_2); 
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
    // InternalMyDsl.g:2046:1: rule__TypeDeclContext__Group_2__0 : rule__TypeDeclContext__Group_2__0__Impl rule__TypeDeclContext__Group_2__1 ;
    public final void rule__TypeDeclContext__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2050:1: ( rule__TypeDeclContext__Group_2__0__Impl rule__TypeDeclContext__Group_2__1 )
            // InternalMyDsl.g:2051:2: rule__TypeDeclContext__Group_2__0__Impl rule__TypeDeclContext__Group_2__1
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
    // InternalMyDsl.g:2058:1: rule__TypeDeclContext__Group_2__0__Impl : ( ',' ) ;
    public final void rule__TypeDeclContext__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2062:1: ( ( ',' ) )
            // InternalMyDsl.g:2063:1: ( ',' )
            {
            // InternalMyDsl.g:2063:1: ( ',' )
            // InternalMyDsl.g:2064:2: ','
            {
             before(grammarAccess.getTypeDeclContextAccess().getCommaKeyword_2_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalMyDsl.g:2073:1: rule__TypeDeclContext__Group_2__1 : rule__TypeDeclContext__Group_2__1__Impl ;
    public final void rule__TypeDeclContext__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2077:1: ( rule__TypeDeclContext__Group_2__1__Impl )
            // InternalMyDsl.g:2078:2: rule__TypeDeclContext__Group_2__1__Impl
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
    // InternalMyDsl.g:2084:1: rule__TypeDeclContext__Group_2__1__Impl : ( ( rule__TypeDeclContext__TypeNameAssignment_2_1 ) ) ;
    public final void rule__TypeDeclContext__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2088:1: ( ( ( rule__TypeDeclContext__TypeNameAssignment_2_1 ) ) )
            // InternalMyDsl.g:2089:1: ( ( rule__TypeDeclContext__TypeNameAssignment_2_1 ) )
            {
            // InternalMyDsl.g:2089:1: ( ( rule__TypeDeclContext__TypeNameAssignment_2_1 ) )
            // InternalMyDsl.g:2090:2: ( rule__TypeDeclContext__TypeNameAssignment_2_1 )
            {
             before(grammarAccess.getTypeDeclContextAccess().getTypeNameAssignment_2_1()); 
            // InternalMyDsl.g:2091:2: ( rule__TypeDeclContext__TypeNameAssignment_2_1 )
            // InternalMyDsl.g:2091:3: rule__TypeDeclContext__TypeNameAssignment_2_1
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
    // InternalMyDsl.g:2100:1: rule__Where__Group__0 : rule__Where__Group__0__Impl rule__Where__Group__1 ;
    public final void rule__Where__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2104:1: ( rule__Where__Group__0__Impl rule__Where__Group__1 )
            // InternalMyDsl.g:2105:2: rule__Where__Group__0__Impl rule__Where__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalMyDsl.g:2112:1: rule__Where__Group__0__Impl : ( 'where' ) ;
    public final void rule__Where__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2116:1: ( ( 'where' ) )
            // InternalMyDsl.g:2117:1: ( 'where' )
            {
            // InternalMyDsl.g:2117:1: ( 'where' )
            // InternalMyDsl.g:2118:2: 'where'
            {
             before(grammarAccess.getWhereAccess().getWhereKeyword_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalMyDsl.g:2127:1: rule__Where__Group__1 : rule__Where__Group__1__Impl rule__Where__Group__2 ;
    public final void rule__Where__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2131:1: ( rule__Where__Group__1__Impl rule__Where__Group__2 )
            // InternalMyDsl.g:2132:2: rule__Where__Group__1__Impl rule__Where__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalMyDsl.g:2139:1: rule__Where__Group__1__Impl : ( ( rule__Where__ExpessionsAssignment_1 ) ) ;
    public final void rule__Where__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2143:1: ( ( ( rule__Where__ExpessionsAssignment_1 ) ) )
            // InternalMyDsl.g:2144:1: ( ( rule__Where__ExpessionsAssignment_1 ) )
            {
            // InternalMyDsl.g:2144:1: ( ( rule__Where__ExpessionsAssignment_1 ) )
            // InternalMyDsl.g:2145:2: ( rule__Where__ExpessionsAssignment_1 )
            {
             before(grammarAccess.getWhereAccess().getExpessionsAssignment_1()); 
            // InternalMyDsl.g:2146:2: ( rule__Where__ExpessionsAssignment_1 )
            // InternalMyDsl.g:2146:3: rule__Where__ExpessionsAssignment_1
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
    // InternalMyDsl.g:2154:1: rule__Where__Group__2 : rule__Where__Group__2__Impl ;
    public final void rule__Where__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2158:1: ( rule__Where__Group__2__Impl )
            // InternalMyDsl.g:2159:2: rule__Where__Group__2__Impl
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
    // InternalMyDsl.g:2165:1: rule__Where__Group__2__Impl : ( ( rule__Where__Group_2__0 ) ) ;
    public final void rule__Where__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2169:1: ( ( ( rule__Where__Group_2__0 ) ) )
            // InternalMyDsl.g:2170:1: ( ( rule__Where__Group_2__0 ) )
            {
            // InternalMyDsl.g:2170:1: ( ( rule__Where__Group_2__0 ) )
            // InternalMyDsl.g:2171:2: ( rule__Where__Group_2__0 )
            {
             before(grammarAccess.getWhereAccess().getGroup_2()); 
            // InternalMyDsl.g:2172:2: ( rule__Where__Group_2__0 )
            // InternalMyDsl.g:2172:3: rule__Where__Group_2__0
            {
            pushFollow(FOLLOW_2);
            rule__Where__Group_2__0();

            state._fsp--;


            }

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
    // InternalMyDsl.g:2181:1: rule__Where__Group_2__0 : rule__Where__Group_2__0__Impl rule__Where__Group_2__1 ;
    public final void rule__Where__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2185:1: ( rule__Where__Group_2__0__Impl rule__Where__Group_2__1 )
            // InternalMyDsl.g:2186:2: rule__Where__Group_2__0__Impl rule__Where__Group_2__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalMyDsl.g:2193:1: rule__Where__Group_2__0__Impl : ( ';' ) ;
    public final void rule__Where__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2197:1: ( ( ';' ) )
            // InternalMyDsl.g:2198:1: ( ';' )
            {
            // InternalMyDsl.g:2198:1: ( ';' )
            // InternalMyDsl.g:2199:2: ';'
            {
             before(grammarAccess.getWhereAccess().getSemicolonKeyword_2_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalMyDsl.g:2208:1: rule__Where__Group_2__1 : rule__Where__Group_2__1__Impl ;
    public final void rule__Where__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2212:1: ( rule__Where__Group_2__1__Impl )
            // InternalMyDsl.g:2213:2: rule__Where__Group_2__1__Impl
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
    // InternalMyDsl.g:2219:1: rule__Where__Group_2__1__Impl : ( ( rule__Where__ExpressionsAssignment_2_1 ) ) ;
    public final void rule__Where__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2223:1: ( ( ( rule__Where__ExpressionsAssignment_2_1 ) ) )
            // InternalMyDsl.g:2224:1: ( ( rule__Where__ExpressionsAssignment_2_1 ) )
            {
            // InternalMyDsl.g:2224:1: ( ( rule__Where__ExpressionsAssignment_2_1 ) )
            // InternalMyDsl.g:2225:2: ( rule__Where__ExpressionsAssignment_2_1 )
            {
             before(grammarAccess.getWhereAccess().getExpressionsAssignment_2_1()); 
            // InternalMyDsl.g:2226:2: ( rule__Where__ExpressionsAssignment_2_1 )
            // InternalMyDsl.g:2226:3: rule__Where__ExpressionsAssignment_2_1
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
    // InternalMyDsl.g:2235:1: rule__Datatype__Group__0 : rule__Datatype__Group__0__Impl rule__Datatype__Group__1 ;
    public final void rule__Datatype__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2239:1: ( rule__Datatype__Group__0__Impl rule__Datatype__Group__1 )
            // InternalMyDsl.g:2240:2: rule__Datatype__Group__0__Impl rule__Datatype__Group__1
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
    // InternalMyDsl.g:2247:1: rule__Datatype__Group__0__Impl : ( 'Datatype' ) ;
    public final void rule__Datatype__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2251:1: ( ( 'Datatype' ) )
            // InternalMyDsl.g:2252:1: ( 'Datatype' )
            {
            // InternalMyDsl.g:2252:1: ( 'Datatype' )
            // InternalMyDsl.g:2253:2: 'Datatype'
            {
             before(grammarAccess.getDatatypeAccess().getDatatypeKeyword_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalMyDsl.g:2262:1: rule__Datatype__Group__1 : rule__Datatype__Group__1__Impl rule__Datatype__Group__2 ;
    public final void rule__Datatype__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2266:1: ( rule__Datatype__Group__1__Impl rule__Datatype__Group__2 )
            // InternalMyDsl.g:2267:2: rule__Datatype__Group__1__Impl rule__Datatype__Group__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalMyDsl.g:2274:1: rule__Datatype__Group__1__Impl : ( ( rule__Datatype__NameAssignment_1 ) ) ;
    public final void rule__Datatype__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2278:1: ( ( ( rule__Datatype__NameAssignment_1 ) ) )
            // InternalMyDsl.g:2279:1: ( ( rule__Datatype__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:2279:1: ( ( rule__Datatype__NameAssignment_1 ) )
            // InternalMyDsl.g:2280:2: ( rule__Datatype__NameAssignment_1 )
            {
             before(grammarAccess.getDatatypeAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:2281:2: ( rule__Datatype__NameAssignment_1 )
            // InternalMyDsl.g:2281:3: rule__Datatype__NameAssignment_1
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
    // InternalMyDsl.g:2289:1: rule__Datatype__Group__2 : rule__Datatype__Group__2__Impl rule__Datatype__Group__3 ;
    public final void rule__Datatype__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2293:1: ( rule__Datatype__Group__2__Impl rule__Datatype__Group__3 )
            // InternalMyDsl.g:2294:2: rule__Datatype__Group__2__Impl rule__Datatype__Group__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalMyDsl.g:2301:1: rule__Datatype__Group__2__Impl : ( ( rule__Datatype__ContextAssignment_2 )? ) ;
    public final void rule__Datatype__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2305:1: ( ( ( rule__Datatype__ContextAssignment_2 )? ) )
            // InternalMyDsl.g:2306:1: ( ( rule__Datatype__ContextAssignment_2 )? )
            {
            // InternalMyDsl.g:2306:1: ( ( rule__Datatype__ContextAssignment_2 )? )
            // InternalMyDsl.g:2307:2: ( rule__Datatype__ContextAssignment_2 )?
            {
             before(grammarAccess.getDatatypeAccess().getContextAssignment_2()); 
            // InternalMyDsl.g:2308:2: ( rule__Datatype__ContextAssignment_2 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==26) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalMyDsl.g:2308:3: rule__Datatype__ContextAssignment_2
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
    // InternalMyDsl.g:2316:1: rule__Datatype__Group__3 : rule__Datatype__Group__3__Impl rule__Datatype__Group__4 ;
    public final void rule__Datatype__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2320:1: ( rule__Datatype__Group__3__Impl rule__Datatype__Group__4 )
            // InternalMyDsl.g:2321:2: rule__Datatype__Group__3__Impl rule__Datatype__Group__4
            {
            pushFollow(FOLLOW_18);
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
    // InternalMyDsl.g:2328:1: rule__Datatype__Group__3__Impl : ( ( rule__Datatype__ConstructorsAssignment_3 )* ) ;
    public final void rule__Datatype__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2332:1: ( ( ( rule__Datatype__ConstructorsAssignment_3 )* ) )
            // InternalMyDsl.g:2333:1: ( ( rule__Datatype__ConstructorsAssignment_3 )* )
            {
            // InternalMyDsl.g:2333:1: ( ( rule__Datatype__ConstructorsAssignment_3 )* )
            // InternalMyDsl.g:2334:2: ( rule__Datatype__ConstructorsAssignment_3 )*
            {
             before(grammarAccess.getDatatypeAccess().getConstructorsAssignment_3()); 
            // InternalMyDsl.g:2335:2: ( rule__Datatype__ConstructorsAssignment_3 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==33) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalMyDsl.g:2335:3: rule__Datatype__ConstructorsAssignment_3
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__Datatype__ConstructorsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // InternalMyDsl.g:2343:1: rule__Datatype__Group__4 : rule__Datatype__Group__4__Impl rule__Datatype__Group__5 ;
    public final void rule__Datatype__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2347:1: ( rule__Datatype__Group__4__Impl rule__Datatype__Group__5 )
            // InternalMyDsl.g:2348:2: rule__Datatype__Group__4__Impl rule__Datatype__Group__5
            {
            pushFollow(FOLLOW_7);
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
    // InternalMyDsl.g:2355:1: rule__Datatype__Group__4__Impl : ( '{' ) ;
    public final void rule__Datatype__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2359:1: ( ( '{' ) )
            // InternalMyDsl.g:2360:1: ( '{' )
            {
            // InternalMyDsl.g:2360:1: ( '{' )
            // InternalMyDsl.g:2361:2: '{'
            {
             before(grammarAccess.getDatatypeAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,24,FOLLOW_2); 
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
    // InternalMyDsl.g:2370:1: rule__Datatype__Group__5 : rule__Datatype__Group__5__Impl rule__Datatype__Group__6 ;
    public final void rule__Datatype__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2374:1: ( rule__Datatype__Group__5__Impl rule__Datatype__Group__6 )
            // InternalMyDsl.g:2375:2: rule__Datatype__Group__5__Impl rule__Datatype__Group__6
            {
            pushFollow(FOLLOW_7);
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
    // InternalMyDsl.g:2382:1: rule__Datatype__Group__5__Impl : ( ( rule__Datatype__BodyElementsAssignment_5 )* ) ;
    public final void rule__Datatype__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2386:1: ( ( ( rule__Datatype__BodyElementsAssignment_5 )* ) )
            // InternalMyDsl.g:2387:1: ( ( rule__Datatype__BodyElementsAssignment_5 )* )
            {
            // InternalMyDsl.g:2387:1: ( ( rule__Datatype__BodyElementsAssignment_5 )* )
            // InternalMyDsl.g:2388:2: ( rule__Datatype__BodyElementsAssignment_5 )*
            {
             before(grammarAccess.getDatatypeAccess().getBodyElementsAssignment_5()); 
            // InternalMyDsl.g:2389:2: ( rule__Datatype__BodyElementsAssignment_5 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ID) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalMyDsl.g:2389:3: rule__Datatype__BodyElementsAssignment_5
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Datatype__BodyElementsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // InternalMyDsl.g:2397:1: rule__Datatype__Group__6 : rule__Datatype__Group__6__Impl ;
    public final void rule__Datatype__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2401:1: ( rule__Datatype__Group__6__Impl )
            // InternalMyDsl.g:2402:2: rule__Datatype__Group__6__Impl
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
    // InternalMyDsl.g:2408:1: rule__Datatype__Group__6__Impl : ( '}' ) ;
    public final void rule__Datatype__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2412:1: ( ( '}' ) )
            // InternalMyDsl.g:2413:1: ( '}' )
            {
            // InternalMyDsl.g:2413:1: ( '}' )
            // InternalMyDsl.g:2414:2: '}'
            {
             before(grammarAccess.getDatatypeAccess().getRightCurlyBracketKeyword_6()); 
            match(input,25,FOLLOW_2); 
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
    // InternalMyDsl.g:2424:1: rule__DatatypeConstructor__Group__0 : rule__DatatypeConstructor__Group__0__Impl rule__DatatypeConstructor__Group__1 ;
    public final void rule__DatatypeConstructor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2428:1: ( rule__DatatypeConstructor__Group__0__Impl rule__DatatypeConstructor__Group__1 )
            // InternalMyDsl.g:2429:2: rule__DatatypeConstructor__Group__0__Impl rule__DatatypeConstructor__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalMyDsl.g:2436:1: rule__DatatypeConstructor__Group__0__Impl : ( '|' ) ;
    public final void rule__DatatypeConstructor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2440:1: ( ( '|' ) )
            // InternalMyDsl.g:2441:1: ( '|' )
            {
            // InternalMyDsl.g:2441:1: ( '|' )
            // InternalMyDsl.g:2442:2: '|'
            {
             before(grammarAccess.getDatatypeConstructorAccess().getVerticalLineKeyword_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalMyDsl.g:2451:1: rule__DatatypeConstructor__Group__1 : rule__DatatypeConstructor__Group__1__Impl ;
    public final void rule__DatatypeConstructor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2455:1: ( rule__DatatypeConstructor__Group__1__Impl )
            // InternalMyDsl.g:2456:2: rule__DatatypeConstructor__Group__1__Impl
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
    // InternalMyDsl.g:2462:1: rule__DatatypeConstructor__Group__1__Impl : ( ( rule__DatatypeConstructor__Alternatives_1 ) ) ;
    public final void rule__DatatypeConstructor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2466:1: ( ( ( rule__DatatypeConstructor__Alternatives_1 ) ) )
            // InternalMyDsl.g:2467:1: ( ( rule__DatatypeConstructor__Alternatives_1 ) )
            {
            // InternalMyDsl.g:2467:1: ( ( rule__DatatypeConstructor__Alternatives_1 ) )
            // InternalMyDsl.g:2468:2: ( rule__DatatypeConstructor__Alternatives_1 )
            {
             before(grammarAccess.getDatatypeConstructorAccess().getAlternatives_1()); 
            // InternalMyDsl.g:2469:2: ( rule__DatatypeConstructor__Alternatives_1 )
            // InternalMyDsl.g:2469:3: rule__DatatypeConstructor__Alternatives_1
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
    // InternalMyDsl.g:2478:1: rule__DTypeConstructor__Group__0 : rule__DTypeConstructor__Group__0__Impl rule__DTypeConstructor__Group__1 ;
    public final void rule__DTypeConstructor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2482:1: ( rule__DTypeConstructor__Group__0__Impl rule__DTypeConstructor__Group__1 )
            // InternalMyDsl.g:2483:2: rule__DTypeConstructor__Group__0__Impl rule__DTypeConstructor__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalMyDsl.g:2490:1: rule__DTypeConstructor__Group__0__Impl : ( ( rule__DTypeConstructor__NameAssignment_0 ) ) ;
    public final void rule__DTypeConstructor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2494:1: ( ( ( rule__DTypeConstructor__NameAssignment_0 ) ) )
            // InternalMyDsl.g:2495:1: ( ( rule__DTypeConstructor__NameAssignment_0 ) )
            {
            // InternalMyDsl.g:2495:1: ( ( rule__DTypeConstructor__NameAssignment_0 ) )
            // InternalMyDsl.g:2496:2: ( rule__DTypeConstructor__NameAssignment_0 )
            {
             before(grammarAccess.getDTypeConstructorAccess().getNameAssignment_0()); 
            // InternalMyDsl.g:2497:2: ( rule__DTypeConstructor__NameAssignment_0 )
            // InternalMyDsl.g:2497:3: rule__DTypeConstructor__NameAssignment_0
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
    // InternalMyDsl.g:2505:1: rule__DTypeConstructor__Group__1 : rule__DTypeConstructor__Group__1__Impl rule__DTypeConstructor__Group__2 ;
    public final void rule__DTypeConstructor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2509:1: ( rule__DTypeConstructor__Group__1__Impl rule__DTypeConstructor__Group__2 )
            // InternalMyDsl.g:2510:2: rule__DTypeConstructor__Group__1__Impl rule__DTypeConstructor__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalMyDsl.g:2517:1: rule__DTypeConstructor__Group__1__Impl : ( '(' ) ;
    public final void rule__DTypeConstructor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2521:1: ( ( '(' ) )
            // InternalMyDsl.g:2522:1: ( '(' )
            {
            // InternalMyDsl.g:2522:1: ( '(' )
            // InternalMyDsl.g:2523:2: '('
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
    // InternalMyDsl.g:2532:1: rule__DTypeConstructor__Group__2 : rule__DTypeConstructor__Group__2__Impl rule__DTypeConstructor__Group__3 ;
    public final void rule__DTypeConstructor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2536:1: ( rule__DTypeConstructor__Group__2__Impl rule__DTypeConstructor__Group__3 )
            // InternalMyDsl.g:2537:2: rule__DTypeConstructor__Group__2__Impl rule__DTypeConstructor__Group__3
            {
            pushFollow(FOLLOW_21);
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
    // InternalMyDsl.g:2544:1: rule__DTypeConstructor__Group__2__Impl : ( ( rule__DTypeConstructor__DeconsAssignment_2 ) ) ;
    public final void rule__DTypeConstructor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2548:1: ( ( ( rule__DTypeConstructor__DeconsAssignment_2 ) ) )
            // InternalMyDsl.g:2549:1: ( ( rule__DTypeConstructor__DeconsAssignment_2 ) )
            {
            // InternalMyDsl.g:2549:1: ( ( rule__DTypeConstructor__DeconsAssignment_2 ) )
            // InternalMyDsl.g:2550:2: ( rule__DTypeConstructor__DeconsAssignment_2 )
            {
             before(grammarAccess.getDTypeConstructorAccess().getDeconsAssignment_2()); 
            // InternalMyDsl.g:2551:2: ( rule__DTypeConstructor__DeconsAssignment_2 )
            // InternalMyDsl.g:2551:3: rule__DTypeConstructor__DeconsAssignment_2
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
    // InternalMyDsl.g:2559:1: rule__DTypeConstructor__Group__3 : rule__DTypeConstructor__Group__3__Impl ;
    public final void rule__DTypeConstructor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2563:1: ( rule__DTypeConstructor__Group__3__Impl )
            // InternalMyDsl.g:2564:2: rule__DTypeConstructor__Group__3__Impl
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
    // InternalMyDsl.g:2570:1: rule__DTypeConstructor__Group__3__Impl : ( ')' ) ;
    public final void rule__DTypeConstructor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2574:1: ( ( ')' ) )
            // InternalMyDsl.g:2575:1: ( ')' )
            {
            // InternalMyDsl.g:2575:1: ( ')' )
            // InternalMyDsl.g:2576:2: ')'
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
    // InternalMyDsl.g:2586:1: rule__Extend__Group__0 : rule__Extend__Group__0__Impl rule__Extend__Group__1 ;
    public final void rule__Extend__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2590:1: ( rule__Extend__Group__0__Impl rule__Extend__Group__1 )
            // InternalMyDsl.g:2591:2: rule__Extend__Group__0__Impl rule__Extend__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalMyDsl.g:2598:1: rule__Extend__Group__0__Impl : ( ( rule__Extend__NameAssignment_0 ) ) ;
    public final void rule__Extend__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2602:1: ( ( ( rule__Extend__NameAssignment_0 ) ) )
            // InternalMyDsl.g:2603:1: ( ( rule__Extend__NameAssignment_0 ) )
            {
            // InternalMyDsl.g:2603:1: ( ( rule__Extend__NameAssignment_0 ) )
            // InternalMyDsl.g:2604:2: ( rule__Extend__NameAssignment_0 )
            {
             before(grammarAccess.getExtendAccess().getNameAssignment_0()); 
            // InternalMyDsl.g:2605:2: ( rule__Extend__NameAssignment_0 )
            // InternalMyDsl.g:2605:3: rule__Extend__NameAssignment_0
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
    // InternalMyDsl.g:2613:1: rule__Extend__Group__1 : rule__Extend__Group__1__Impl rule__Extend__Group__2 ;
    public final void rule__Extend__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2617:1: ( rule__Extend__Group__1__Impl rule__Extend__Group__2 )
            // InternalMyDsl.g:2618:2: rule__Extend__Group__1__Impl rule__Extend__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalMyDsl.g:2625:1: rule__Extend__Group__1__Impl : ( '(' ) ;
    public final void rule__Extend__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2629:1: ( ( '(' ) )
            // InternalMyDsl.g:2630:1: ( '(' )
            {
            // InternalMyDsl.g:2630:1: ( '(' )
            // InternalMyDsl.g:2631:2: '('
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
    // InternalMyDsl.g:2640:1: rule__Extend__Group__2 : rule__Extend__Group__2__Impl rule__Extend__Group__3 ;
    public final void rule__Extend__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2644:1: ( rule__Extend__Group__2__Impl rule__Extend__Group__3 )
            // InternalMyDsl.g:2645:2: rule__Extend__Group__2__Impl rule__Extend__Group__3
            {
            pushFollow(FOLLOW_21);
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
    // InternalMyDsl.g:2652:1: rule__Extend__Group__2__Impl : ( ( rule__Extend__ExtesnionAssignment_2 ) ) ;
    public final void rule__Extend__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2656:1: ( ( ( rule__Extend__ExtesnionAssignment_2 ) ) )
            // InternalMyDsl.g:2657:1: ( ( rule__Extend__ExtesnionAssignment_2 ) )
            {
            // InternalMyDsl.g:2657:1: ( ( rule__Extend__ExtesnionAssignment_2 ) )
            // InternalMyDsl.g:2658:2: ( rule__Extend__ExtesnionAssignment_2 )
            {
             before(grammarAccess.getExtendAccess().getExtesnionAssignment_2()); 
            // InternalMyDsl.g:2659:2: ( rule__Extend__ExtesnionAssignment_2 )
            // InternalMyDsl.g:2659:3: rule__Extend__ExtesnionAssignment_2
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
    // InternalMyDsl.g:2667:1: rule__Extend__Group__3 : rule__Extend__Group__3__Impl rule__Extend__Group__4 ;
    public final void rule__Extend__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2671:1: ( rule__Extend__Group__3__Impl rule__Extend__Group__4 )
            // InternalMyDsl.g:2672:2: rule__Extend__Group__3__Impl rule__Extend__Group__4
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
    // InternalMyDsl.g:2679:1: rule__Extend__Group__3__Impl : ( ')' ) ;
    public final void rule__Extend__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2683:1: ( ( ')' ) )
            // InternalMyDsl.g:2684:1: ( ')' )
            {
            // InternalMyDsl.g:2684:1: ( ')' )
            // InternalMyDsl.g:2685:2: ')'
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
    // InternalMyDsl.g:2694:1: rule__Extend__Group__4 : rule__Extend__Group__4__Impl rule__Extend__Group__5 ;
    public final void rule__Extend__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2698:1: ( rule__Extend__Group__4__Impl rule__Extend__Group__5 )
            // InternalMyDsl.g:2699:2: rule__Extend__Group__4__Impl rule__Extend__Group__5
            {
            pushFollow(FOLLOW_7);
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
    // InternalMyDsl.g:2706:1: rule__Extend__Group__4__Impl : ( '{' ) ;
    public final void rule__Extend__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2710:1: ( ( '{' ) )
            // InternalMyDsl.g:2711:1: ( '{' )
            {
            // InternalMyDsl.g:2711:1: ( '{' )
            // InternalMyDsl.g:2712:2: '{'
            {
             before(grammarAccess.getExtendAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,24,FOLLOW_2); 
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
    // InternalMyDsl.g:2721:1: rule__Extend__Group__5 : rule__Extend__Group__5__Impl rule__Extend__Group__6 ;
    public final void rule__Extend__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2725:1: ( rule__Extend__Group__5__Impl rule__Extend__Group__6 )
            // InternalMyDsl.g:2726:2: rule__Extend__Group__5__Impl rule__Extend__Group__6
            {
            pushFollow(FOLLOW_7);
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
    // InternalMyDsl.g:2733:1: rule__Extend__Group__5__Impl : ( ( rule__Extend__BodyElementsAssignment_5 )* ) ;
    public final void rule__Extend__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2737:1: ( ( ( rule__Extend__BodyElementsAssignment_5 )* ) )
            // InternalMyDsl.g:2738:1: ( ( rule__Extend__BodyElementsAssignment_5 )* )
            {
            // InternalMyDsl.g:2738:1: ( ( rule__Extend__BodyElementsAssignment_5 )* )
            // InternalMyDsl.g:2739:2: ( rule__Extend__BodyElementsAssignment_5 )*
            {
             before(grammarAccess.getExtendAccess().getBodyElementsAssignment_5()); 
            // InternalMyDsl.g:2740:2: ( rule__Extend__BodyElementsAssignment_5 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_ID) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalMyDsl.g:2740:3: rule__Extend__BodyElementsAssignment_5
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Extend__BodyElementsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalMyDsl.g:2748:1: rule__Extend__Group__6 : rule__Extend__Group__6__Impl ;
    public final void rule__Extend__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2752:1: ( rule__Extend__Group__6__Impl )
            // InternalMyDsl.g:2753:2: rule__Extend__Group__6__Impl
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
    // InternalMyDsl.g:2759:1: rule__Extend__Group__6__Impl : ( '}' ) ;
    public final void rule__Extend__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2763:1: ( ( '}' ) )
            // InternalMyDsl.g:2764:1: ( '}' )
            {
            // InternalMyDsl.g:2764:1: ( '}' )
            // InternalMyDsl.g:2765:2: '}'
            {
             before(grammarAccess.getExtendAccess().getRightCurlyBracketKeyword_6()); 
            match(input,25,FOLLOW_2); 
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
    // InternalMyDsl.g:2775:1: rule__FunctionDecl__Group__0 : rule__FunctionDecl__Group__0__Impl rule__FunctionDecl__Group__1 ;
    public final void rule__FunctionDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2779:1: ( rule__FunctionDecl__Group__0__Impl rule__FunctionDecl__Group__1 )
            // InternalMyDsl.g:2780:2: rule__FunctionDecl__Group__0__Impl rule__FunctionDecl__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalMyDsl.g:2787:1: rule__FunctionDecl__Group__0__Impl : ( ( rule__FunctionDecl__NameAssignment_0 ) ) ;
    public final void rule__FunctionDecl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2791:1: ( ( ( rule__FunctionDecl__NameAssignment_0 ) ) )
            // InternalMyDsl.g:2792:1: ( ( rule__FunctionDecl__NameAssignment_0 ) )
            {
            // InternalMyDsl.g:2792:1: ( ( rule__FunctionDecl__NameAssignment_0 ) )
            // InternalMyDsl.g:2793:2: ( rule__FunctionDecl__NameAssignment_0 )
            {
             before(grammarAccess.getFunctionDeclAccess().getNameAssignment_0()); 
            // InternalMyDsl.g:2794:2: ( rule__FunctionDecl__NameAssignment_0 )
            // InternalMyDsl.g:2794:3: rule__FunctionDecl__NameAssignment_0
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
    // InternalMyDsl.g:2802:1: rule__FunctionDecl__Group__1 : rule__FunctionDecl__Group__1__Impl rule__FunctionDecl__Group__2 ;
    public final void rule__FunctionDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2806:1: ( rule__FunctionDecl__Group__1__Impl rule__FunctionDecl__Group__2 )
            // InternalMyDsl.g:2807:2: rule__FunctionDecl__Group__1__Impl rule__FunctionDecl__Group__2
            {
            pushFollow(FOLLOW_23);
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
    // InternalMyDsl.g:2814:1: rule__FunctionDecl__Group__1__Impl : ( ( rule__FunctionDecl__ContextAssignment_1 )? ) ;
    public final void rule__FunctionDecl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2818:1: ( ( ( rule__FunctionDecl__ContextAssignment_1 )? ) )
            // InternalMyDsl.g:2819:1: ( ( rule__FunctionDecl__ContextAssignment_1 )? )
            {
            // InternalMyDsl.g:2819:1: ( ( rule__FunctionDecl__ContextAssignment_1 )? )
            // InternalMyDsl.g:2820:2: ( rule__FunctionDecl__ContextAssignment_1 )?
            {
             before(grammarAccess.getFunctionDeclAccess().getContextAssignment_1()); 
            // InternalMyDsl.g:2821:2: ( rule__FunctionDecl__ContextAssignment_1 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==26) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalMyDsl.g:2821:3: rule__FunctionDecl__ContextAssignment_1
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
    // InternalMyDsl.g:2829:1: rule__FunctionDecl__Group__2 : rule__FunctionDecl__Group__2__Impl rule__FunctionDecl__Group__3 ;
    public final void rule__FunctionDecl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2833:1: ( rule__FunctionDecl__Group__2__Impl rule__FunctionDecl__Group__3 )
            // InternalMyDsl.g:2834:2: rule__FunctionDecl__Group__2__Impl rule__FunctionDecl__Group__3
            {
            pushFollow(FOLLOW_24);
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
    // InternalMyDsl.g:2841:1: rule__FunctionDecl__Group__2__Impl : ( '(' ) ;
    public final void rule__FunctionDecl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2845:1: ( ( '(' ) )
            // InternalMyDsl.g:2846:1: ( '(' )
            {
            // InternalMyDsl.g:2846:1: ( '(' )
            // InternalMyDsl.g:2847:2: '('
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
    // InternalMyDsl.g:2856:1: rule__FunctionDecl__Group__3 : rule__FunctionDecl__Group__3__Impl rule__FunctionDecl__Group__4 ;
    public final void rule__FunctionDecl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2860:1: ( rule__FunctionDecl__Group__3__Impl rule__FunctionDecl__Group__4 )
            // InternalMyDsl.g:2861:2: rule__FunctionDecl__Group__3__Impl rule__FunctionDecl__Group__4
            {
            pushFollow(FOLLOW_24);
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
    // InternalMyDsl.g:2868:1: rule__FunctionDecl__Group__3__Impl : ( ( rule__FunctionDecl__VariablesAssignment_3 )? ) ;
    public final void rule__FunctionDecl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2872:1: ( ( ( rule__FunctionDecl__VariablesAssignment_3 )? ) )
            // InternalMyDsl.g:2873:1: ( ( rule__FunctionDecl__VariablesAssignment_3 )? )
            {
            // InternalMyDsl.g:2873:1: ( ( rule__FunctionDecl__VariablesAssignment_3 )? )
            // InternalMyDsl.g:2874:2: ( rule__FunctionDecl__VariablesAssignment_3 )?
            {
             before(grammarAccess.getFunctionDeclAccess().getVariablesAssignment_3()); 
            // InternalMyDsl.g:2875:2: ( rule__FunctionDecl__VariablesAssignment_3 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ID) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalMyDsl.g:2875:3: rule__FunctionDecl__VariablesAssignment_3
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
    // InternalMyDsl.g:2883:1: rule__FunctionDecl__Group__4 : rule__FunctionDecl__Group__4__Impl rule__FunctionDecl__Group__5 ;
    public final void rule__FunctionDecl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2887:1: ( rule__FunctionDecl__Group__4__Impl rule__FunctionDecl__Group__5 )
            // InternalMyDsl.g:2888:2: rule__FunctionDecl__Group__4__Impl rule__FunctionDecl__Group__5
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
    // InternalMyDsl.g:2895:1: rule__FunctionDecl__Group__4__Impl : ( ')' ) ;
    public final void rule__FunctionDecl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2899:1: ( ( ')' ) )
            // InternalMyDsl.g:2900:1: ( ')' )
            {
            // InternalMyDsl.g:2900:1: ( ')' )
            // InternalMyDsl.g:2901:2: ')'
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
    // InternalMyDsl.g:2910:1: rule__FunctionDecl__Group__5 : rule__FunctionDecl__Group__5__Impl rule__FunctionDecl__Group__6 ;
    public final void rule__FunctionDecl__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2914:1: ( rule__FunctionDecl__Group__5__Impl rule__FunctionDecl__Group__6 )
            // InternalMyDsl.g:2915:2: rule__FunctionDecl__Group__5__Impl rule__FunctionDecl__Group__6
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyDsl.g:2922:1: rule__FunctionDecl__Group__5__Impl : ( ( rule__FunctionDecl__BodyAssignment_5 ) ) ;
    public final void rule__FunctionDecl__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2926:1: ( ( ( rule__FunctionDecl__BodyAssignment_5 ) ) )
            // InternalMyDsl.g:2927:1: ( ( rule__FunctionDecl__BodyAssignment_5 ) )
            {
            // InternalMyDsl.g:2927:1: ( ( rule__FunctionDecl__BodyAssignment_5 ) )
            // InternalMyDsl.g:2928:2: ( rule__FunctionDecl__BodyAssignment_5 )
            {
             before(grammarAccess.getFunctionDeclAccess().getBodyAssignment_5()); 
            // InternalMyDsl.g:2929:2: ( rule__FunctionDecl__BodyAssignment_5 )
            // InternalMyDsl.g:2929:3: rule__FunctionDecl__BodyAssignment_5
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
    // InternalMyDsl.g:2937:1: rule__FunctionDecl__Group__6 : rule__FunctionDecl__Group__6__Impl rule__FunctionDecl__Group__7 ;
    public final void rule__FunctionDecl__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2941:1: ( rule__FunctionDecl__Group__6__Impl rule__FunctionDecl__Group__7 )
            // InternalMyDsl.g:2942:2: rule__FunctionDecl__Group__6__Impl rule__FunctionDecl__Group__7
            {
            pushFollow(FOLLOW_4);
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
    // InternalMyDsl.g:2949:1: rule__FunctionDecl__Group__6__Impl : ( ':' ) ;
    public final void rule__FunctionDecl__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2953:1: ( ( ':' ) )
            // InternalMyDsl.g:2954:1: ( ':' )
            {
            // InternalMyDsl.g:2954:1: ( ':' )
            // InternalMyDsl.g:2955:2: ':'
            {
             before(grammarAccess.getFunctionDeclAccess().getColonKeyword_6()); 
            match(input,28,FOLLOW_2); 
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
    // InternalMyDsl.g:2964:1: rule__FunctionDecl__Group__7 : rule__FunctionDecl__Group__7__Impl ;
    public final void rule__FunctionDecl__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2968:1: ( rule__FunctionDecl__Group__7__Impl )
            // InternalMyDsl.g:2969:2: rule__FunctionDecl__Group__7__Impl
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
    // InternalMyDsl.g:2975:1: rule__FunctionDecl__Group__7__Impl : ( ( rule__FunctionDecl__ReturnTypeAssignment_7 ) ) ;
    public final void rule__FunctionDecl__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2979:1: ( ( ( rule__FunctionDecl__ReturnTypeAssignment_7 ) ) )
            // InternalMyDsl.g:2980:1: ( ( rule__FunctionDecl__ReturnTypeAssignment_7 ) )
            {
            // InternalMyDsl.g:2980:1: ( ( rule__FunctionDecl__ReturnTypeAssignment_7 ) )
            // InternalMyDsl.g:2981:2: ( rule__FunctionDecl__ReturnTypeAssignment_7 )
            {
             before(grammarAccess.getFunctionDeclAccess().getReturnTypeAssignment_7()); 
            // InternalMyDsl.g:2982:2: ( rule__FunctionDecl__ReturnTypeAssignment_7 )
            // InternalMyDsl.g:2982:3: rule__FunctionDecl__ReturnTypeAssignment_7
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


    // $ANTLR start "rule__TypedVariableList__Group__0"
    // InternalMyDsl.g:2991:1: rule__TypedVariableList__Group__0 : rule__TypedVariableList__Group__0__Impl rule__TypedVariableList__Group__1 ;
    public final void rule__TypedVariableList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2995:1: ( rule__TypedVariableList__Group__0__Impl rule__TypedVariableList__Group__1 )
            // InternalMyDsl.g:2996:2: rule__TypedVariableList__Group__0__Impl rule__TypedVariableList__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalMyDsl.g:3003:1: rule__TypedVariableList__Group__0__Impl : ( ( rule__TypedVariableList__TypeVarAssignment_0 ) ) ;
    public final void rule__TypedVariableList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3007:1: ( ( ( rule__TypedVariableList__TypeVarAssignment_0 ) ) )
            // InternalMyDsl.g:3008:1: ( ( rule__TypedVariableList__TypeVarAssignment_0 ) )
            {
            // InternalMyDsl.g:3008:1: ( ( rule__TypedVariableList__TypeVarAssignment_0 ) )
            // InternalMyDsl.g:3009:2: ( rule__TypedVariableList__TypeVarAssignment_0 )
            {
             before(grammarAccess.getTypedVariableListAccess().getTypeVarAssignment_0()); 
            // InternalMyDsl.g:3010:2: ( rule__TypedVariableList__TypeVarAssignment_0 )
            // InternalMyDsl.g:3010:3: rule__TypedVariableList__TypeVarAssignment_0
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
    // InternalMyDsl.g:3018:1: rule__TypedVariableList__Group__1 : rule__TypedVariableList__Group__1__Impl ;
    public final void rule__TypedVariableList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3022:1: ( rule__TypedVariableList__Group__1__Impl )
            // InternalMyDsl.g:3023:2: rule__TypedVariableList__Group__1__Impl
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
    // InternalMyDsl.g:3029:1: rule__TypedVariableList__Group__1__Impl : ( ( rule__TypedVariableList__Group_1__0 ) ) ;
    public final void rule__TypedVariableList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3033:1: ( ( ( rule__TypedVariableList__Group_1__0 ) ) )
            // InternalMyDsl.g:3034:1: ( ( rule__TypedVariableList__Group_1__0 ) )
            {
            // InternalMyDsl.g:3034:1: ( ( rule__TypedVariableList__Group_1__0 ) )
            // InternalMyDsl.g:3035:2: ( rule__TypedVariableList__Group_1__0 )
            {
             before(grammarAccess.getTypedVariableListAccess().getGroup_1()); 
            // InternalMyDsl.g:3036:2: ( rule__TypedVariableList__Group_1__0 )
            // InternalMyDsl.g:3036:3: rule__TypedVariableList__Group_1__0
            {
            pushFollow(FOLLOW_2);
            rule__TypedVariableList__Group_1__0();

            state._fsp--;


            }

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
    // InternalMyDsl.g:3045:1: rule__TypedVariableList__Group_1__0 : rule__TypedVariableList__Group_1__0__Impl rule__TypedVariableList__Group_1__1 ;
    public final void rule__TypedVariableList__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3049:1: ( rule__TypedVariableList__Group_1__0__Impl rule__TypedVariableList__Group_1__1 )
            // InternalMyDsl.g:3050:2: rule__TypedVariableList__Group_1__0__Impl rule__TypedVariableList__Group_1__1
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
    // InternalMyDsl.g:3057:1: rule__TypedVariableList__Group_1__0__Impl : ( ',' ) ;
    public final void rule__TypedVariableList__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3061:1: ( ( ',' ) )
            // InternalMyDsl.g:3062:1: ( ',' )
            {
            // InternalMyDsl.g:3062:1: ( ',' )
            // InternalMyDsl.g:3063:2: ','
            {
             before(grammarAccess.getTypedVariableListAccess().getCommaKeyword_1_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalMyDsl.g:3072:1: rule__TypedVariableList__Group_1__1 : rule__TypedVariableList__Group_1__1__Impl ;
    public final void rule__TypedVariableList__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3076:1: ( rule__TypedVariableList__Group_1__1__Impl )
            // InternalMyDsl.g:3077:2: rule__TypedVariableList__Group_1__1__Impl
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
    // InternalMyDsl.g:3083:1: rule__TypedVariableList__Group_1__1__Impl : ( ( rule__TypedVariableList__TypeVarAssignment_1_1 ) ) ;
    public final void rule__TypedVariableList__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3087:1: ( ( ( rule__TypedVariableList__TypeVarAssignment_1_1 ) ) )
            // InternalMyDsl.g:3088:1: ( ( rule__TypedVariableList__TypeVarAssignment_1_1 ) )
            {
            // InternalMyDsl.g:3088:1: ( ( rule__TypedVariableList__TypeVarAssignment_1_1 ) )
            // InternalMyDsl.g:3089:2: ( rule__TypedVariableList__TypeVarAssignment_1_1 )
            {
             before(grammarAccess.getTypedVariableListAccess().getTypeVarAssignment_1_1()); 
            // InternalMyDsl.g:3090:2: ( rule__TypedVariableList__TypeVarAssignment_1_1 )
            // InternalMyDsl.g:3090:3: rule__TypedVariableList__TypeVarAssignment_1_1
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
    // InternalMyDsl.g:3099:1: rule__TypedVariable__Group__0 : rule__TypedVariable__Group__0__Impl rule__TypedVariable__Group__1 ;
    public final void rule__TypedVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3103:1: ( rule__TypedVariable__Group__0__Impl rule__TypedVariable__Group__1 )
            // InternalMyDsl.g:3104:2: rule__TypedVariable__Group__0__Impl rule__TypedVariable__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyDsl.g:3111:1: rule__TypedVariable__Group__0__Impl : ( ( rule__TypedVariable__NameAssignment_0 ) ) ;
    public final void rule__TypedVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3115:1: ( ( ( rule__TypedVariable__NameAssignment_0 ) ) )
            // InternalMyDsl.g:3116:1: ( ( rule__TypedVariable__NameAssignment_0 ) )
            {
            // InternalMyDsl.g:3116:1: ( ( rule__TypedVariable__NameAssignment_0 ) )
            // InternalMyDsl.g:3117:2: ( rule__TypedVariable__NameAssignment_0 )
            {
             before(grammarAccess.getTypedVariableAccess().getNameAssignment_0()); 
            // InternalMyDsl.g:3118:2: ( rule__TypedVariable__NameAssignment_0 )
            // InternalMyDsl.g:3118:3: rule__TypedVariable__NameAssignment_0
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
    // InternalMyDsl.g:3126:1: rule__TypedVariable__Group__1 : rule__TypedVariable__Group__1__Impl rule__TypedVariable__Group__2 ;
    public final void rule__TypedVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3130:1: ( rule__TypedVariable__Group__1__Impl rule__TypedVariable__Group__2 )
            // InternalMyDsl.g:3131:2: rule__TypedVariable__Group__1__Impl rule__TypedVariable__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalMyDsl.g:3138:1: rule__TypedVariable__Group__1__Impl : ( ':' ) ;
    public final void rule__TypedVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3142:1: ( ( ':' ) )
            // InternalMyDsl.g:3143:1: ( ':' )
            {
            // InternalMyDsl.g:3143:1: ( ':' )
            // InternalMyDsl.g:3144:2: ':'
            {
             before(grammarAccess.getTypedVariableAccess().getColonKeyword_1()); 
            match(input,28,FOLLOW_2); 
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
    // InternalMyDsl.g:3153:1: rule__TypedVariable__Group__2 : rule__TypedVariable__Group__2__Impl ;
    public final void rule__TypedVariable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3157:1: ( rule__TypedVariable__Group__2__Impl )
            // InternalMyDsl.g:3158:2: rule__TypedVariable__Group__2__Impl
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
    // InternalMyDsl.g:3164:1: rule__TypedVariable__Group__2__Impl : ( ( rule__TypedVariable__TypeAssignment_2 ) ) ;
    public final void rule__TypedVariable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3168:1: ( ( ( rule__TypedVariable__TypeAssignment_2 ) ) )
            // InternalMyDsl.g:3169:1: ( ( rule__TypedVariable__TypeAssignment_2 ) )
            {
            // InternalMyDsl.g:3169:1: ( ( rule__TypedVariable__TypeAssignment_2 ) )
            // InternalMyDsl.g:3170:2: ( rule__TypedVariable__TypeAssignment_2 )
            {
             before(grammarAccess.getTypedVariableAccess().getTypeAssignment_2()); 
            // InternalMyDsl.g:3171:2: ( rule__TypedVariable__TypeAssignment_2 )
            // InternalMyDsl.g:3171:3: rule__TypedVariable__TypeAssignment_2
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


    // $ANTLR start "rule__DomainModel__ElementsAssignment"
    // InternalMyDsl.g:3180:1: rule__DomainModel__ElementsAssignment : ( ruleTopLevel ) ;
    public final void rule__DomainModel__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3184:1: ( ( ruleTopLevel ) )
            // InternalMyDsl.g:3185:2: ( ruleTopLevel )
            {
            // InternalMyDsl.g:3185:2: ( ruleTopLevel )
            // InternalMyDsl.g:3186:3: ruleTopLevel
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
    // InternalMyDsl.g:3195:1: rule__ImportStatement__ImportsAssignment_1 : ( ruleImport ) ;
    public final void rule__ImportStatement__ImportsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3199:1: ( ( ruleImport ) )
            // InternalMyDsl.g:3200:2: ( ruleImport )
            {
            // InternalMyDsl.g:3200:2: ( ruleImport )
            // InternalMyDsl.g:3201:3: ruleImport
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
    // InternalMyDsl.g:3210:1: rule__Import__ImportNameAssignment_0 : ( ruleImportComponent ) ;
    public final void rule__Import__ImportNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3214:1: ( ( ruleImportComponent ) )
            // InternalMyDsl.g:3215:2: ( ruleImportComponent )
            {
            // InternalMyDsl.g:3215:2: ( ruleImportComponent )
            // InternalMyDsl.g:3216:3: ruleImportComponent
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
    // InternalMyDsl.g:3225:1: rule__Import__ImportNameAssignment_1_1 : ( ruleImportComponent ) ;
    public final void rule__Import__ImportNameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3229:1: ( ( ruleImportComponent ) )
            // InternalMyDsl.g:3230:2: ( ruleImportComponent )
            {
            // InternalMyDsl.g:3230:2: ( ruleImportComponent )
            // InternalMyDsl.g:3231:3: ruleImportComponent
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
    // InternalMyDsl.g:3240:1: rule__ImportComponent__NameAssignment : ( RULE_ID ) ;
    public final void rule__ImportComponent__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3244:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:3245:2: ( RULE_ID )
            {
            // InternalMyDsl.g:3245:2: ( RULE_ID )
            // InternalMyDsl.g:3246:3: RULE_ID
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
    // InternalMyDsl.g:3255:1: rule__Class__TypeNameAssignment_1 : ( ruleTypeName ) ;
    public final void rule__Class__TypeNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3259:1: ( ( ruleTypeName ) )
            // InternalMyDsl.g:3260:2: ( ruleTypeName )
            {
            // InternalMyDsl.g:3260:2: ( ruleTypeName )
            // InternalMyDsl.g:3261:3: ruleTypeName
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
    // InternalMyDsl.g:3270:1: rule__Class__ContextAssignment_2 : ( rulePolyContext ) ;
    public final void rule__Class__ContextAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3274:1: ( ( rulePolyContext ) )
            // InternalMyDsl.g:3275:2: ( rulePolyContext )
            {
            // InternalMyDsl.g:3275:2: ( rulePolyContext )
            // InternalMyDsl.g:3276:3: rulePolyContext
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
    // InternalMyDsl.g:3285:1: rule__Class__SupertypesAssignment_3 : ( ruleSuperTypeList ) ;
    public final void rule__Class__SupertypesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3289:1: ( ( ruleSuperTypeList ) )
            // InternalMyDsl.g:3290:2: ( ruleSuperTypeList )
            {
            // InternalMyDsl.g:3290:2: ( ruleSuperTypeList )
            // InternalMyDsl.g:3291:3: ruleSuperTypeList
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


    // $ANTLR start "rule__Class__WhereAssignment_4"
    // InternalMyDsl.g:3300:1: rule__Class__WhereAssignment_4 : ( ruleWhere ) ;
    public final void rule__Class__WhereAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3304:1: ( ( ruleWhere ) )
            // InternalMyDsl.g:3305:2: ( ruleWhere )
            {
            // InternalMyDsl.g:3305:2: ( ruleWhere )
            // InternalMyDsl.g:3306:3: ruleWhere
            {
             before(grammarAccess.getClassAccess().getWhereWhereParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleWhere();

            state._fsp--;

             after(grammarAccess.getClassAccess().getWhereWhereParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__WhereAssignment_4"


    // $ANTLR start "rule__Class__BodyElementsAssignment_6"
    // InternalMyDsl.g:3315:1: rule__Class__BodyElementsAssignment_6 : ( ruleTypeBodyElements ) ;
    public final void rule__Class__BodyElementsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3319:1: ( ( ruleTypeBodyElements ) )
            // InternalMyDsl.g:3320:2: ( ruleTypeBodyElements )
            {
            // InternalMyDsl.g:3320:2: ( ruleTypeBodyElements )
            // InternalMyDsl.g:3321:3: ruleTypeBodyElements
            {
             before(grammarAccess.getClassAccess().getBodyElementsTypeBodyElementsParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleTypeBodyElements();

            state._fsp--;

             after(grammarAccess.getClassAccess().getBodyElementsTypeBodyElementsParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__BodyElementsAssignment_6"


    // $ANTLR start "rule__TypeName__NameAssignment"
    // InternalMyDsl.g:3330:1: rule__TypeName__NameAssignment : ( RULE_ID ) ;
    public final void rule__TypeName__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3334:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:3335:2: ( RULE_ID )
            {
            // InternalMyDsl.g:3335:2: ( RULE_ID )
            // InternalMyDsl.g:3336:3: RULE_ID
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
    // InternalMyDsl.g:3345:1: rule__PolymorphicTypeName__NameAssignment : ( RULE_ID ) ;
    public final void rule__PolymorphicTypeName__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3349:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:3350:2: ( RULE_ID )
            {
            // InternalMyDsl.g:3350:2: ( RULE_ID )
            // InternalMyDsl.g:3351:3: RULE_ID
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
    // InternalMyDsl.g:3360:1: rule__PolyContext__PolyTypesAssignment_1 : ( rulePolyContextTypes ) ;
    public final void rule__PolyContext__PolyTypesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3364:1: ( ( rulePolyContextTypes ) )
            // InternalMyDsl.g:3365:2: ( rulePolyContextTypes )
            {
            // InternalMyDsl.g:3365:2: ( rulePolyContextTypes )
            // InternalMyDsl.g:3366:3: rulePolyContextTypes
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
    // InternalMyDsl.g:3375:1: rule__PolyContextTypes__NameAssignment_0 : ( rulePolymorphicTypeName ) ;
    public final void rule__PolyContextTypes__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3379:1: ( ( rulePolymorphicTypeName ) )
            // InternalMyDsl.g:3380:2: ( rulePolymorphicTypeName )
            {
            // InternalMyDsl.g:3380:2: ( rulePolymorphicTypeName )
            // InternalMyDsl.g:3381:3: rulePolymorphicTypeName
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
    // InternalMyDsl.g:3390:1: rule__PolyContextTypes__ConstraintsAssignment_1 : ( rulePolyTypeConstraints ) ;
    public final void rule__PolyContextTypes__ConstraintsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3394:1: ( ( rulePolyTypeConstraints ) )
            // InternalMyDsl.g:3395:2: ( rulePolyTypeConstraints )
            {
            // InternalMyDsl.g:3395:2: ( rulePolyTypeConstraints )
            // InternalMyDsl.g:3396:3: rulePolyTypeConstraints
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
    // InternalMyDsl.g:3405:1: rule__PolyTypeConstraints__TypeNameAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__PolyTypeConstraints__TypeNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3409:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:3410:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:3410:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:3411:3: ( RULE_ID )
            {
             before(grammarAccess.getPolyTypeConstraintsAccess().getTypeNameTypeNameCrossReference_1_0()); 
            // InternalMyDsl.g:3412:3: ( RULE_ID )
            // InternalMyDsl.g:3413:4: RULE_ID
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
    // InternalMyDsl.g:3424:1: rule__PolyTypeConstraints__TypeNameAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__PolyTypeConstraints__TypeNameAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3428:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:3429:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:3429:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:3430:3: ( RULE_ID )
            {
             before(grammarAccess.getPolyTypeConstraintsAccess().getTypeNameTypeNameCrossReference_2_1_0()); 
            // InternalMyDsl.g:3431:3: ( RULE_ID )
            // InternalMyDsl.g:3432:4: RULE_ID
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
    // InternalMyDsl.g:3443:1: rule__SuperTypeList__SuperTypeAssignment_1 : ( ruleConstructedType ) ;
    public final void rule__SuperTypeList__SuperTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3447:1: ( ( ruleConstructedType ) )
            // InternalMyDsl.g:3448:2: ( ruleConstructedType )
            {
            // InternalMyDsl.g:3448:2: ( ruleConstructedType )
            // InternalMyDsl.g:3449:3: ruleConstructedType
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
    // InternalMyDsl.g:3458:1: rule__SuperTypeList__SuperTypeAssignment_2_1 : ( ruleConstructedType ) ;
    public final void rule__SuperTypeList__SuperTypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3462:1: ( ( ruleConstructedType ) )
            // InternalMyDsl.g:3463:2: ( ruleConstructedType )
            {
            // InternalMyDsl.g:3463:2: ( ruleConstructedType )
            // InternalMyDsl.g:3464:3: ruleConstructedType
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
    // InternalMyDsl.g:3473:1: rule__ConstructedType__TypeAssignment_0 : ( ruleTypeConstructor ) ;
    public final void rule__ConstructedType__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3477:1: ( ( ruleTypeConstructor ) )
            // InternalMyDsl.g:3478:2: ( ruleTypeConstructor )
            {
            // InternalMyDsl.g:3478:2: ( ruleTypeConstructor )
            // InternalMyDsl.g:3479:3: ruleTypeConstructor
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
    // InternalMyDsl.g:3488:1: rule__ConstructedType__TypeAssignment_1_1 : ( ruleConstructedType ) ;
    public final void rule__ConstructedType__TypeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3492:1: ( ( ruleConstructedType ) )
            // InternalMyDsl.g:3493:2: ( ruleConstructedType )
            {
            // InternalMyDsl.g:3493:2: ( ruleConstructedType )
            // InternalMyDsl.g:3494:3: ruleConstructedType
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
    // InternalMyDsl.g:3503:1: rule__TypeConstructor__TypeNameAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__TypeConstructor__TypeNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3507:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:3508:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:3508:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:3509:3: ( RULE_ID )
            {
             before(grammarAccess.getTypeConstructorAccess().getTypeNameNameCrossReference_0_0()); 
            // InternalMyDsl.g:3510:3: ( RULE_ID )
            // InternalMyDsl.g:3511:4: RULE_ID
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
    // InternalMyDsl.g:3522:1: rule__TypeConstructor__ContextAssignment_1 : ( ruleTypeDeclContext ) ;
    public final void rule__TypeConstructor__ContextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3526:1: ( ( ruleTypeDeclContext ) )
            // InternalMyDsl.g:3527:2: ( ruleTypeDeclContext )
            {
            // InternalMyDsl.g:3527:2: ( ruleTypeDeclContext )
            // InternalMyDsl.g:3528:3: ruleTypeDeclContext
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
    // InternalMyDsl.g:3537:1: rule__TypeDeclContext__TypeNameAssignment_1 : ( ruleConstructedType ) ;
    public final void rule__TypeDeclContext__TypeNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3541:1: ( ( ruleConstructedType ) )
            // InternalMyDsl.g:3542:2: ( ruleConstructedType )
            {
            // InternalMyDsl.g:3542:2: ( ruleConstructedType )
            // InternalMyDsl.g:3543:3: ruleConstructedType
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
    // InternalMyDsl.g:3552:1: rule__TypeDeclContext__TypeNameAssignment_2_1 : ( ruleConstructedType ) ;
    public final void rule__TypeDeclContext__TypeNameAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3556:1: ( ( ruleConstructedType ) )
            // InternalMyDsl.g:3557:2: ( ruleConstructedType )
            {
            // InternalMyDsl.g:3557:2: ( ruleConstructedType )
            // InternalMyDsl.g:3558:3: ruleConstructedType
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


    // $ANTLR start "rule__Where__ExpessionsAssignment_1"
    // InternalMyDsl.g:3567:1: rule__Where__ExpessionsAssignment_1 : ( ruleExpression ) ;
    public final void rule__Where__ExpessionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3571:1: ( ( ruleExpression ) )
            // InternalMyDsl.g:3572:2: ( ruleExpression )
            {
            // InternalMyDsl.g:3572:2: ( ruleExpression )
            // InternalMyDsl.g:3573:3: ruleExpression
            {
             before(grammarAccess.getWhereAccess().getExpessionsExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getWhereAccess().getExpessionsExpressionParserRuleCall_1_0()); 

            }


            }

        }
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
    // InternalMyDsl.g:3582:1: rule__Where__ExpressionsAssignment_2_1 : ( ruleExpression ) ;
    public final void rule__Where__ExpressionsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3586:1: ( ( ruleExpression ) )
            // InternalMyDsl.g:3587:2: ( ruleExpression )
            {
            // InternalMyDsl.g:3587:2: ( ruleExpression )
            // InternalMyDsl.g:3588:3: ruleExpression
            {
             before(grammarAccess.getWhereAccess().getExpressionsExpressionParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getWhereAccess().getExpressionsExpressionParserRuleCall_2_1_0()); 

            }


            }

        }
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
    // InternalMyDsl.g:3597:1: rule__Datatype__NameAssignment_1 : ( ruleTypeName ) ;
    public final void rule__Datatype__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3601:1: ( ( ruleTypeName ) )
            // InternalMyDsl.g:3602:2: ( ruleTypeName )
            {
            // InternalMyDsl.g:3602:2: ( ruleTypeName )
            // InternalMyDsl.g:3603:3: ruleTypeName
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
    // InternalMyDsl.g:3612:1: rule__Datatype__ContextAssignment_2 : ( rulePolyContext ) ;
    public final void rule__Datatype__ContextAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3616:1: ( ( rulePolyContext ) )
            // InternalMyDsl.g:3617:2: ( rulePolyContext )
            {
            // InternalMyDsl.g:3617:2: ( rulePolyContext )
            // InternalMyDsl.g:3618:3: rulePolyContext
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
    // InternalMyDsl.g:3627:1: rule__Datatype__ConstructorsAssignment_3 : ( ruleDatatypeConstructor ) ;
    public final void rule__Datatype__ConstructorsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3631:1: ( ( ruleDatatypeConstructor ) )
            // InternalMyDsl.g:3632:2: ( ruleDatatypeConstructor )
            {
            // InternalMyDsl.g:3632:2: ( ruleDatatypeConstructor )
            // InternalMyDsl.g:3633:3: ruleDatatypeConstructor
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
    // InternalMyDsl.g:3642:1: rule__Datatype__BodyElementsAssignment_5 : ( ruleTypeBodyElements ) ;
    public final void rule__Datatype__BodyElementsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3646:1: ( ( ruleTypeBodyElements ) )
            // InternalMyDsl.g:3647:2: ( ruleTypeBodyElements )
            {
            // InternalMyDsl.g:3647:2: ( ruleTypeBodyElements )
            // InternalMyDsl.g:3648:3: ruleTypeBodyElements
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
    // InternalMyDsl.g:3657:1: rule__BaseConstructor__NameAssignment : ( RULE_ID ) ;
    public final void rule__BaseConstructor__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3661:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:3662:2: ( RULE_ID )
            {
            // InternalMyDsl.g:3662:2: ( RULE_ID )
            // InternalMyDsl.g:3663:3: RULE_ID
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
    // InternalMyDsl.g:3672:1: rule__DTypeConstructor__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__DTypeConstructor__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3676:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:3677:2: ( RULE_ID )
            {
            // InternalMyDsl.g:3677:2: ( RULE_ID )
            // InternalMyDsl.g:3678:3: RULE_ID
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
    // InternalMyDsl.g:3687:1: rule__DTypeConstructor__DeconsAssignment_2 : ( ruleTypedVariableList ) ;
    public final void rule__DTypeConstructor__DeconsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3691:1: ( ( ruleTypedVariableList ) )
            // InternalMyDsl.g:3692:2: ( ruleTypedVariableList )
            {
            // InternalMyDsl.g:3692:2: ( ruleTypedVariableList )
            // InternalMyDsl.g:3693:3: ruleTypedVariableList
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
    // InternalMyDsl.g:3702:1: rule__Extend__NameAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Extend__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3706:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:3707:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:3707:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:3708:3: ( RULE_ID )
            {
             before(grammarAccess.getExtendAccess().getNameTypeNameCrossReference_0_0()); 
            // InternalMyDsl.g:3709:3: ( RULE_ID )
            // InternalMyDsl.g:3710:4: RULE_ID
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
    // InternalMyDsl.g:3721:1: rule__Extend__ExtesnionAssignment_2 : ( RULE_ID ) ;
    public final void rule__Extend__ExtesnionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3725:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:3726:2: ( RULE_ID )
            {
            // InternalMyDsl.g:3726:2: ( RULE_ID )
            // InternalMyDsl.g:3727:3: RULE_ID
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
    // InternalMyDsl.g:3736:1: rule__Extend__BodyElementsAssignment_5 : ( ruleTypeBodyElements ) ;
    public final void rule__Extend__BodyElementsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3740:1: ( ( ruleTypeBodyElements ) )
            // InternalMyDsl.g:3741:2: ( ruleTypeBodyElements )
            {
            // InternalMyDsl.g:3741:2: ( ruleTypeBodyElements )
            // InternalMyDsl.g:3742:3: ruleTypeBodyElements
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
    // InternalMyDsl.g:3751:1: rule__TypeBodyElements__FunctionsAssignment_0 : ( ruleFunctionDecl ) ;
    public final void rule__TypeBodyElements__FunctionsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3755:1: ( ( ruleFunctionDecl ) )
            // InternalMyDsl.g:3756:2: ( ruleFunctionDecl )
            {
            // InternalMyDsl.g:3756:2: ( ruleFunctionDecl )
            // InternalMyDsl.g:3757:3: ruleFunctionDecl
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
    // InternalMyDsl.g:3766:1: rule__TypeBodyElements__TheoremsAssignment_1 : ( ruleTheoremBody ) ;
    public final void rule__TypeBodyElements__TheoremsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3770:1: ( ( ruleTheoremBody ) )
            // InternalMyDsl.g:3771:2: ( ruleTheoremBody )
            {
            // InternalMyDsl.g:3771:2: ( ruleTheoremBody )
            // InternalMyDsl.g:3772:3: ruleTheoremBody
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
    // InternalMyDsl.g:3781:1: rule__FunctionDecl__NameAssignment_0 : ( ruleFunctionName ) ;
    public final void rule__FunctionDecl__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3785:1: ( ( ruleFunctionName ) )
            // InternalMyDsl.g:3786:2: ( ruleFunctionName )
            {
            // InternalMyDsl.g:3786:2: ( ruleFunctionName )
            // InternalMyDsl.g:3787:3: ruleFunctionName
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
    // InternalMyDsl.g:3796:1: rule__FunctionDecl__ContextAssignment_1 : ( rulePolyContext ) ;
    public final void rule__FunctionDecl__ContextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3800:1: ( ( rulePolyContext ) )
            // InternalMyDsl.g:3801:2: ( rulePolyContext )
            {
            // InternalMyDsl.g:3801:2: ( rulePolyContext )
            // InternalMyDsl.g:3802:3: rulePolyContext
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
    // InternalMyDsl.g:3811:1: rule__FunctionDecl__VariablesAssignment_3 : ( ruleTypedVariableList ) ;
    public final void rule__FunctionDecl__VariablesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3815:1: ( ( ruleTypedVariableList ) )
            // InternalMyDsl.g:3816:2: ( ruleTypedVariableList )
            {
            // InternalMyDsl.g:3816:2: ( ruleTypedVariableList )
            // InternalMyDsl.g:3817:3: ruleTypedVariableList
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
    // InternalMyDsl.g:3826:1: rule__FunctionDecl__BodyAssignment_5 : ( ruleFunctionBody ) ;
    public final void rule__FunctionDecl__BodyAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3830:1: ( ( ruleFunctionBody ) )
            // InternalMyDsl.g:3831:2: ( ruleFunctionBody )
            {
            // InternalMyDsl.g:3831:2: ( ruleFunctionBody )
            // InternalMyDsl.g:3832:3: ruleFunctionBody
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
    // InternalMyDsl.g:3841:1: rule__FunctionDecl__ReturnTypeAssignment_7 : ( ruleTypeConstructor ) ;
    public final void rule__FunctionDecl__ReturnTypeAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3845:1: ( ( ruleTypeConstructor ) )
            // InternalMyDsl.g:3846:2: ( ruleTypeConstructor )
            {
            // InternalMyDsl.g:3846:2: ( ruleTypeConstructor )
            // InternalMyDsl.g:3847:3: ruleTypeConstructor
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


    // $ANTLR start "rule__FuncDirectDef__ExpressionAssignment"
    // InternalMyDsl.g:3856:1: rule__FuncDirectDef__ExpressionAssignment : ( ruleExpression ) ;
    public final void rule__FuncDirectDef__ExpressionAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3860:1: ( ( ruleExpression ) )
            // InternalMyDsl.g:3861:2: ( ruleExpression )
            {
            // InternalMyDsl.g:3861:2: ( ruleExpression )
            // InternalMyDsl.g:3862:3: ruleExpression
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


    // $ANTLR start "rule__TheoremBody__NameAssignment"
    // InternalMyDsl.g:3871:1: rule__TheoremBody__NameAssignment : ( RULE_ID ) ;
    public final void rule__TheoremBody__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3875:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:3876:2: ( RULE_ID )
            {
            // InternalMyDsl.g:3876:2: ( RULE_ID )
            // InternalMyDsl.g:3877:3: RULE_ID
            {
             before(grammarAccess.getTheoremBodyAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTheoremBodyAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TheoremBody__NameAssignment"


    // $ANTLR start "rule__TypedVariableList__TypeVarAssignment_0"
    // InternalMyDsl.g:3886:1: rule__TypedVariableList__TypeVarAssignment_0 : ( ruleTypedVariable ) ;
    public final void rule__TypedVariableList__TypeVarAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3890:1: ( ( ruleTypedVariable ) )
            // InternalMyDsl.g:3891:2: ( ruleTypedVariable )
            {
            // InternalMyDsl.g:3891:2: ( ruleTypedVariable )
            // InternalMyDsl.g:3892:3: ruleTypedVariable
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
    // InternalMyDsl.g:3901:1: rule__TypedVariableList__TypeVarAssignment_1_1 : ( ruleTypedVariable ) ;
    public final void rule__TypedVariableList__TypeVarAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3905:1: ( ( ruleTypedVariable ) )
            // InternalMyDsl.g:3906:2: ( ruleTypedVariable )
            {
            // InternalMyDsl.g:3906:2: ( ruleTypedVariable )
            // InternalMyDsl.g:3907:3: ruleTypedVariable
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
    // InternalMyDsl.g:3916:1: rule__TypedVariable__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__TypedVariable__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3920:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:3921:2: ( RULE_ID )
            {
            // InternalMyDsl.g:3921:2: ( RULE_ID )
            // InternalMyDsl.g:3922:3: RULE_ID
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
    // InternalMyDsl.g:3931:1: rule__TypedVariable__TypeAssignment_2 : ( ruleConstructedType ) ;
    public final void rule__TypedVariable__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3935:1: ( ( ruleConstructedType ) )
            // InternalMyDsl.g:3936:2: ( ruleConstructedType )
            {
            // InternalMyDsl.g:3936:2: ( ruleConstructedType )
            // InternalMyDsl.g:3937:3: ruleConstructedType
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


    // $ANTLR start "rule__FunctionName__NameAssignment"
    // InternalMyDsl.g:3946:1: rule__FunctionName__NameAssignment : ( RULE_ID ) ;
    public final void rule__FunctionName__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3950:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:3951:2: ( RULE_ID )
            {
            // InternalMyDsl.g:3951:2: ( RULE_ID )
            // InternalMyDsl.g:3952:3: RULE_ID
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


    // $ANTLR start "rule__Expression__NameAssignment"
    // InternalMyDsl.g:3961:1: rule__Expression__NameAssignment : ( RULE_ID ) ;
    public final void rule__Expression__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3965:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:3966:2: ( RULE_ID )
            {
            // InternalMyDsl.g:3966:2: ( RULE_ID )
            // InternalMyDsl.g:3967:3: RULE_ID
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000100A00012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000055000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000000001FF800L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000028000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000205000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000404000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000800000010L});

}