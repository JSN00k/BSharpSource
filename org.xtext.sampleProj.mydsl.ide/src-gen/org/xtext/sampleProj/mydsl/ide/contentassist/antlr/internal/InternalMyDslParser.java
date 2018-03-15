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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'\\u00D7'", "'\\u2192'", "'\\uE102'", "'\\uE100'", "'\\u2194'", "'\\u2916'", "'\\u21F8'", "'\\u21A3'", "'\\u2900'", "'\\u21A0'", "'Import'", "'.'", "'Class'", "'{'", "'}'", "'<'", "'>'", "':'", "','", "'Datatype'", "'('", "')'", "'Theorems'"
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
    public static final int T__13=13;
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

                if ( (LA1_0==RULE_ID||LA1_0==21||LA1_0==23||LA1_0==30) ) {
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


    // $ANTLR start "entryRuleTypeConstraints"
    // InternalMyDsl.g:328:1: entryRuleTypeConstraints : ruleTypeConstraints EOF ;
    public final void entryRuleTypeConstraints() throws RecognitionException {
        try {
            // InternalMyDsl.g:329:1: ( ruleTypeConstraints EOF )
            // InternalMyDsl.g:330:1: ruleTypeConstraints EOF
            {
             before(grammarAccess.getTypeConstraintsRule()); 
            pushFollow(FOLLOW_1);
            ruleTypeConstraints();

            state._fsp--;

             after(grammarAccess.getTypeConstraintsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTypeConstraints"


    // $ANTLR start "ruleTypeConstraints"
    // InternalMyDsl.g:337:1: ruleTypeConstraints : ( ( rule__TypeConstraints__Group__0 ) ) ;
    public final void ruleTypeConstraints() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:341:2: ( ( ( rule__TypeConstraints__Group__0 ) ) )
            // InternalMyDsl.g:342:2: ( ( rule__TypeConstraints__Group__0 ) )
            {
            // InternalMyDsl.g:342:2: ( ( rule__TypeConstraints__Group__0 ) )
            // InternalMyDsl.g:343:3: ( rule__TypeConstraints__Group__0 )
            {
             before(grammarAccess.getTypeConstraintsAccess().getGroup()); 
            // InternalMyDsl.g:344:3: ( rule__TypeConstraints__Group__0 )
            // InternalMyDsl.g:344:4: rule__TypeConstraints__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TypeConstraints__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTypeConstraintsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypeConstraints"


    // $ANTLR start "entryRuleTypedVariable"
    // InternalMyDsl.g:353:1: entryRuleTypedVariable : ruleTypedVariable EOF ;
    public final void entryRuleTypedVariable() throws RecognitionException {
        try {
            // InternalMyDsl.g:354:1: ( ruleTypedVariable EOF )
            // InternalMyDsl.g:355:1: ruleTypedVariable EOF
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
    // InternalMyDsl.g:362:1: ruleTypedVariable : ( ( rule__TypedVariable__Group__0 ) ) ;
    public final void ruleTypedVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:366:2: ( ( ( rule__TypedVariable__Group__0 ) ) )
            // InternalMyDsl.g:367:2: ( ( rule__TypedVariable__Group__0 ) )
            {
            // InternalMyDsl.g:367:2: ( ( rule__TypedVariable__Group__0 ) )
            // InternalMyDsl.g:368:3: ( rule__TypedVariable__Group__0 )
            {
             before(grammarAccess.getTypedVariableAccess().getGroup()); 
            // InternalMyDsl.g:369:3: ( rule__TypedVariable__Group__0 )
            // InternalMyDsl.g:369:4: rule__TypedVariable__Group__0
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


    // $ANTLR start "entryRuleSupertype"
    // InternalMyDsl.g:378:1: entryRuleSupertype : ruleSupertype EOF ;
    public final void entryRuleSupertype() throws RecognitionException {
        try {
            // InternalMyDsl.g:379:1: ( ruleSupertype EOF )
            // InternalMyDsl.g:380:1: ruleSupertype EOF
            {
             before(grammarAccess.getSupertypeRule()); 
            pushFollow(FOLLOW_1);
            ruleSupertype();

            state._fsp--;

             after(grammarAccess.getSupertypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSupertype"


    // $ANTLR start "ruleSupertype"
    // InternalMyDsl.g:387:1: ruleSupertype : ( ( rule__Supertype__Group__0 ) ) ;
    public final void ruleSupertype() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:391:2: ( ( ( rule__Supertype__Group__0 ) ) )
            // InternalMyDsl.g:392:2: ( ( rule__Supertype__Group__0 ) )
            {
            // InternalMyDsl.g:392:2: ( ( rule__Supertype__Group__0 ) )
            // InternalMyDsl.g:393:3: ( rule__Supertype__Group__0 )
            {
             before(grammarAccess.getSupertypeAccess().getGroup()); 
            // InternalMyDsl.g:394:3: ( rule__Supertype__Group__0 )
            // InternalMyDsl.g:394:4: rule__Supertype__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Supertype__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSupertypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSupertype"


    // $ANTLR start "entryRuleTypeDeclaration"
    // InternalMyDsl.g:403:1: entryRuleTypeDeclaration : ruleTypeDeclaration EOF ;
    public final void entryRuleTypeDeclaration() throws RecognitionException {
        try {
            // InternalMyDsl.g:404:1: ( ruleTypeDeclaration EOF )
            // InternalMyDsl.g:405:1: ruleTypeDeclaration EOF
            {
             before(grammarAccess.getTypeDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleTypeDeclaration();

            state._fsp--;

             after(grammarAccess.getTypeDeclarationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTypeDeclaration"


    // $ANTLR start "ruleTypeDeclaration"
    // InternalMyDsl.g:412:1: ruleTypeDeclaration : ( ( rule__TypeDeclaration__Group__0 ) ) ;
    public final void ruleTypeDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:416:2: ( ( ( rule__TypeDeclaration__Group__0 ) ) )
            // InternalMyDsl.g:417:2: ( ( rule__TypeDeclaration__Group__0 ) )
            {
            // InternalMyDsl.g:417:2: ( ( rule__TypeDeclaration__Group__0 ) )
            // InternalMyDsl.g:418:3: ( rule__TypeDeclaration__Group__0 )
            {
             before(grammarAccess.getTypeDeclarationAccess().getGroup()); 
            // InternalMyDsl.g:419:3: ( rule__TypeDeclaration__Group__0 )
            // InternalMyDsl.g:419:4: rule__TypeDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TypeDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTypeDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypeDeclaration"


    // $ANTLR start "entryRuleConstructedType"
    // InternalMyDsl.g:428:1: entryRuleConstructedType : ruleConstructedType EOF ;
    public final void entryRuleConstructedType() throws RecognitionException {
        try {
            // InternalMyDsl.g:429:1: ( ruleConstructedType EOF )
            // InternalMyDsl.g:430:1: ruleConstructedType EOF
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
    // InternalMyDsl.g:437:1: ruleConstructedType : ( ( rule__ConstructedType__Group__0 ) ) ;
    public final void ruleConstructedType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:441:2: ( ( ( rule__ConstructedType__Group__0 ) ) )
            // InternalMyDsl.g:442:2: ( ( rule__ConstructedType__Group__0 ) )
            {
            // InternalMyDsl.g:442:2: ( ( rule__ConstructedType__Group__0 ) )
            // InternalMyDsl.g:443:3: ( rule__ConstructedType__Group__0 )
            {
             before(grammarAccess.getConstructedTypeAccess().getGroup()); 
            // InternalMyDsl.g:444:3: ( rule__ConstructedType__Group__0 )
            // InternalMyDsl.g:444:4: rule__ConstructedType__Group__0
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
    // InternalMyDsl.g:453:1: entryRuleTypeConstructor : ruleTypeConstructor EOF ;
    public final void entryRuleTypeConstructor() throws RecognitionException {
        try {
            // InternalMyDsl.g:454:1: ( ruleTypeConstructor EOF )
            // InternalMyDsl.g:455:1: ruleTypeConstructor EOF
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
    // InternalMyDsl.g:462:1: ruleTypeConstructor : ( ( rule__TypeConstructor__Group__0 ) ) ;
    public final void ruleTypeConstructor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:466:2: ( ( ( rule__TypeConstructor__Group__0 ) ) )
            // InternalMyDsl.g:467:2: ( ( rule__TypeConstructor__Group__0 ) )
            {
            // InternalMyDsl.g:467:2: ( ( rule__TypeConstructor__Group__0 ) )
            // InternalMyDsl.g:468:3: ( rule__TypeConstructor__Group__0 )
            {
             before(grammarAccess.getTypeConstructorAccess().getGroup()); 
            // InternalMyDsl.g:469:3: ( rule__TypeConstructor__Group__0 )
            // InternalMyDsl.g:469:4: rule__TypeConstructor__Group__0
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
    // InternalMyDsl.g:478:1: entryRuleTypeDeclContext : ruleTypeDeclContext EOF ;
    public final void entryRuleTypeDeclContext() throws RecognitionException {
        try {
            // InternalMyDsl.g:479:1: ( ruleTypeDeclContext EOF )
            // InternalMyDsl.g:480:1: ruleTypeDeclContext EOF
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
    // InternalMyDsl.g:487:1: ruleTypeDeclContext : ( ( rule__TypeDeclContext__Group__0 ) ) ;
    public final void ruleTypeDeclContext() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:491:2: ( ( ( rule__TypeDeclContext__Group__0 ) ) )
            // InternalMyDsl.g:492:2: ( ( rule__TypeDeclContext__Group__0 ) )
            {
            // InternalMyDsl.g:492:2: ( ( rule__TypeDeclContext__Group__0 ) )
            // InternalMyDsl.g:493:3: ( rule__TypeDeclContext__Group__0 )
            {
             before(grammarAccess.getTypeDeclContextAccess().getGroup()); 
            // InternalMyDsl.g:494:3: ( rule__TypeDeclContext__Group__0 )
            // InternalMyDsl.g:494:4: rule__TypeDeclContext__Group__0
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


    // $ANTLR start "entryRuleTypeBodyElements"
    // InternalMyDsl.g:503:1: entryRuleTypeBodyElements : ruleTypeBodyElements EOF ;
    public final void entryRuleTypeBodyElements() throws RecognitionException {
        try {
            // InternalMyDsl.g:504:1: ( ruleTypeBodyElements EOF )
            // InternalMyDsl.g:505:1: ruleTypeBodyElements EOF
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
    // InternalMyDsl.g:512:1: ruleTypeBodyElements : ( ( rule__TypeBodyElements__Alternatives ) ) ;
    public final void ruleTypeBodyElements() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:516:2: ( ( ( rule__TypeBodyElements__Alternatives ) ) )
            // InternalMyDsl.g:517:2: ( ( rule__TypeBodyElements__Alternatives ) )
            {
            // InternalMyDsl.g:517:2: ( ( rule__TypeBodyElements__Alternatives ) )
            // InternalMyDsl.g:518:3: ( rule__TypeBodyElements__Alternatives )
            {
             before(grammarAccess.getTypeBodyElementsAccess().getAlternatives()); 
            // InternalMyDsl.g:519:3: ( rule__TypeBodyElements__Alternatives )
            // InternalMyDsl.g:519:4: rule__TypeBodyElements__Alternatives
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


    // $ANTLR start "entryRuleFunctionName"
    // InternalMyDsl.g:528:1: entryRuleFunctionName : ruleFunctionName EOF ;
    public final void entryRuleFunctionName() throws RecognitionException {
        try {
            // InternalMyDsl.g:529:1: ( ruleFunctionName EOF )
            // InternalMyDsl.g:530:1: ruleFunctionName EOF
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
    // InternalMyDsl.g:537:1: ruleFunctionName : ( ( rule__FunctionName__NameAssignment ) ) ;
    public final void ruleFunctionName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:541:2: ( ( ( rule__FunctionName__NameAssignment ) ) )
            // InternalMyDsl.g:542:2: ( ( rule__FunctionName__NameAssignment ) )
            {
            // InternalMyDsl.g:542:2: ( ( rule__FunctionName__NameAssignment ) )
            // InternalMyDsl.g:543:3: ( rule__FunctionName__NameAssignment )
            {
             before(grammarAccess.getFunctionNameAccess().getNameAssignment()); 
            // InternalMyDsl.g:544:3: ( rule__FunctionName__NameAssignment )
            // InternalMyDsl.g:544:4: rule__FunctionName__NameAssignment
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


    // $ANTLR start "entryRuleDatatype"
    // InternalMyDsl.g:553:1: entryRuleDatatype : ruleDatatype EOF ;
    public final void entryRuleDatatype() throws RecognitionException {
        try {
            // InternalMyDsl.g:554:1: ( ruleDatatype EOF )
            // InternalMyDsl.g:555:1: ruleDatatype EOF
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
    // InternalMyDsl.g:562:1: ruleDatatype : ( ( rule__Datatype__Group__0 ) ) ;
    public final void ruleDatatype() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:566:2: ( ( ( rule__Datatype__Group__0 ) ) )
            // InternalMyDsl.g:567:2: ( ( rule__Datatype__Group__0 ) )
            {
            // InternalMyDsl.g:567:2: ( ( rule__Datatype__Group__0 ) )
            // InternalMyDsl.g:568:3: ( rule__Datatype__Group__0 )
            {
             before(grammarAccess.getDatatypeAccess().getGroup()); 
            // InternalMyDsl.g:569:3: ( rule__Datatype__Group__0 )
            // InternalMyDsl.g:569:4: rule__Datatype__Group__0
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
    // InternalMyDsl.g:578:1: entryRuleDatatypeConstructor : ruleDatatypeConstructor EOF ;
    public final void entryRuleDatatypeConstructor() throws RecognitionException {
        try {
            // InternalMyDsl.g:579:1: ( ruleDatatypeConstructor EOF )
            // InternalMyDsl.g:580:1: ruleDatatypeConstructor EOF
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
    // InternalMyDsl.g:587:1: ruleDatatypeConstructor : ( ( rule__DatatypeConstructor__Alternatives ) ) ;
    public final void ruleDatatypeConstructor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:591:2: ( ( ( rule__DatatypeConstructor__Alternatives ) ) )
            // InternalMyDsl.g:592:2: ( ( rule__DatatypeConstructor__Alternatives ) )
            {
            // InternalMyDsl.g:592:2: ( ( rule__DatatypeConstructor__Alternatives ) )
            // InternalMyDsl.g:593:3: ( rule__DatatypeConstructor__Alternatives )
            {
             before(grammarAccess.getDatatypeConstructorAccess().getAlternatives()); 
            // InternalMyDsl.g:594:3: ( rule__DatatypeConstructor__Alternatives )
            // InternalMyDsl.g:594:4: rule__DatatypeConstructor__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DatatypeConstructor__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDatatypeConstructorAccess().getAlternatives()); 

            }


            }

        }
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
    // InternalMyDsl.g:603:1: entryRuleBaseConstructor : ruleBaseConstructor EOF ;
    public final void entryRuleBaseConstructor() throws RecognitionException {
        try {
            // InternalMyDsl.g:604:1: ( ruleBaseConstructor EOF )
            // InternalMyDsl.g:605:1: ruleBaseConstructor EOF
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
    // InternalMyDsl.g:612:1: ruleBaseConstructor : ( ( rule__BaseConstructor__NameAssignment ) ) ;
    public final void ruleBaseConstructor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:616:2: ( ( ( rule__BaseConstructor__NameAssignment ) ) )
            // InternalMyDsl.g:617:2: ( ( rule__BaseConstructor__NameAssignment ) )
            {
            // InternalMyDsl.g:617:2: ( ( rule__BaseConstructor__NameAssignment ) )
            // InternalMyDsl.g:618:3: ( rule__BaseConstructor__NameAssignment )
            {
             before(grammarAccess.getBaseConstructorAccess().getNameAssignment()); 
            // InternalMyDsl.g:619:3: ( rule__BaseConstructor__NameAssignment )
            // InternalMyDsl.g:619:4: rule__BaseConstructor__NameAssignment
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


    // $ANTLR start "entryRuleConstructor"
    // InternalMyDsl.g:628:1: entryRuleConstructor : ruleConstructor EOF ;
    public final void entryRuleConstructor() throws RecognitionException {
        try {
            // InternalMyDsl.g:629:1: ( ruleConstructor EOF )
            // InternalMyDsl.g:630:1: ruleConstructor EOF
            {
             before(grammarAccess.getConstructorRule()); 
            pushFollow(FOLLOW_1);
            ruleConstructor();

            state._fsp--;

             after(grammarAccess.getConstructorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConstructor"


    // $ANTLR start "ruleConstructor"
    // InternalMyDsl.g:637:1: ruleConstructor : ( ( rule__Constructor__Group__0 ) ) ;
    public final void ruleConstructor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:641:2: ( ( ( rule__Constructor__Group__0 ) ) )
            // InternalMyDsl.g:642:2: ( ( rule__Constructor__Group__0 ) )
            {
            // InternalMyDsl.g:642:2: ( ( rule__Constructor__Group__0 ) )
            // InternalMyDsl.g:643:3: ( rule__Constructor__Group__0 )
            {
             before(grammarAccess.getConstructorAccess().getGroup()); 
            // InternalMyDsl.g:644:3: ( rule__Constructor__Group__0 )
            // InternalMyDsl.g:644:4: rule__Constructor__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Constructor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConstructorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConstructor"


    // $ANTLR start "entryRuleExtend"
    // InternalMyDsl.g:653:1: entryRuleExtend : ruleExtend EOF ;
    public final void entryRuleExtend() throws RecognitionException {
        try {
            // InternalMyDsl.g:654:1: ( ruleExtend EOF )
            // InternalMyDsl.g:655:1: ruleExtend EOF
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
    // InternalMyDsl.g:662:1: ruleExtend : ( ( rule__Extend__Group__0 ) ) ;
    public final void ruleExtend() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:666:2: ( ( ( rule__Extend__Group__0 ) ) )
            // InternalMyDsl.g:667:2: ( ( rule__Extend__Group__0 ) )
            {
            // InternalMyDsl.g:667:2: ( ( rule__Extend__Group__0 ) )
            // InternalMyDsl.g:668:3: ( rule__Extend__Group__0 )
            {
             before(grammarAccess.getExtendAccess().getGroup()); 
            // InternalMyDsl.g:669:3: ( rule__Extend__Group__0 )
            // InternalMyDsl.g:669:4: rule__Extend__Group__0
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
    // InternalMyDsl.g:712:1: ruleTheoremBody : ( ( rule__TheoremBody__Group__0 ) ) ;
    public final void ruleTheoremBody() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:716:2: ( ( ( rule__TheoremBody__Group__0 ) ) )
            // InternalMyDsl.g:717:2: ( ( rule__TheoremBody__Group__0 ) )
            {
            // InternalMyDsl.g:717:2: ( ( rule__TheoremBody__Group__0 ) )
            // InternalMyDsl.g:718:3: ( rule__TheoremBody__Group__0 )
            {
             before(grammarAccess.getTheoremBodyAccess().getGroup()); 
            // InternalMyDsl.g:719:3: ( rule__TheoremBody__Group__0 )
            // InternalMyDsl.g:719:4: rule__TheoremBody__Group__0
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


    // $ANTLR start "entryRuleExpression"
    // InternalMyDsl.g:728:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalMyDsl.g:729:1: ( ruleExpression EOF )
            // InternalMyDsl.g:730:1: ruleExpression EOF
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
    // InternalMyDsl.g:737:1: ruleExpression : ( ( rule__Expression__NameAssignment ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:741:2: ( ( ( rule__Expression__NameAssignment ) ) )
            // InternalMyDsl.g:742:2: ( ( rule__Expression__NameAssignment ) )
            {
            // InternalMyDsl.g:742:2: ( ( rule__Expression__NameAssignment ) )
            // InternalMyDsl.g:743:3: ( rule__Expression__NameAssignment )
            {
             before(grammarAccess.getExpressionAccess().getNameAssignment()); 
            // InternalMyDsl.g:744:3: ( rule__Expression__NameAssignment )
            // InternalMyDsl.g:744:4: rule__Expression__NameAssignment
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
    // InternalMyDsl.g:752:1: rule__TopLevel__Alternatives : ( ( ruleImportStatement ) | ( ruleClassDecl ) );
    public final void rule__TopLevel__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:756:1: ( ( ruleImportStatement ) | ( ruleClassDecl ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==21) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID||LA2_0==23||LA2_0==30) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:757:2: ( ruleImportStatement )
                    {
                    // InternalMyDsl.g:757:2: ( ruleImportStatement )
                    // InternalMyDsl.g:758:3: ruleImportStatement
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
                    // InternalMyDsl.g:763:2: ( ruleClassDecl )
                    {
                    // InternalMyDsl.g:763:2: ( ruleClassDecl )
                    // InternalMyDsl.g:764:3: ruleClassDecl
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
    // InternalMyDsl.g:773:1: rule__ClassDecl__Alternatives : ( ( ruleClass ) | ( ruleDatatype ) | ( ruleExtend ) );
    public final void rule__ClassDecl__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:777:1: ( ( ruleClass ) | ( ruleDatatype ) | ( ruleExtend ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt3=1;
                }
                break;
            case 30:
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
                    // InternalMyDsl.g:778:2: ( ruleClass )
                    {
                    // InternalMyDsl.g:778:2: ( ruleClass )
                    // InternalMyDsl.g:779:3: ruleClass
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
                    // InternalMyDsl.g:784:2: ( ruleDatatype )
                    {
                    // InternalMyDsl.g:784:2: ( ruleDatatype )
                    // InternalMyDsl.g:785:3: ruleDatatype
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
                    // InternalMyDsl.g:790:2: ( ruleExtend )
                    {
                    // InternalMyDsl.g:790:2: ( ruleExtend )
                    // InternalMyDsl.g:791:3: ruleExtend
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
    // InternalMyDsl.g:800:1: rule__ConstructedType__Alternatives_1_0 : ( ( '\\u00D7' ) | ( '\\u2192' ) | ( '\\uE102' ) | ( '\\uE100' ) | ( '\\u2194' ) | ( '\\u2916' ) | ( '\\u21F8' ) | ( '\\u21A3' ) | ( '\\u2900' ) | ( '\\u21A0' ) );
    public final void rule__ConstructedType__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:804:1: ( ( '\\u00D7' ) | ( '\\u2192' ) | ( '\\uE102' ) | ( '\\uE100' ) | ( '\\u2194' ) | ( '\\u2916' ) | ( '\\u21F8' ) | ( '\\u21A3' ) | ( '\\u2900' ) | ( '\\u21A0' ) )
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
                    // InternalMyDsl.g:805:2: ( '\\u00D7' )
                    {
                    // InternalMyDsl.g:805:2: ( '\\u00D7' )
                    // InternalMyDsl.g:806:3: '\\u00D7'
                    {
                     before(grammarAccess.getConstructedTypeAccess().getMultiplicationSignKeyword_1_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getConstructedTypeAccess().getMultiplicationSignKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:811:2: ( '\\u2192' )
                    {
                    // InternalMyDsl.g:811:2: ( '\\u2192' )
                    // InternalMyDsl.g:812:3: '\\u2192'
                    {
                     before(grammarAccess.getConstructedTypeAccess().getRightwardsArrowKeyword_1_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getConstructedTypeAccess().getRightwardsArrowKeyword_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:817:2: ( '\\uE102' )
                    {
                    // InternalMyDsl.g:817:2: ( '\\uE102' )
                    // InternalMyDsl.g:818:3: '\\uE102'
                    {
                     before(grammarAccess.getConstructedTypeAccess().getPrivateUseAreaE102Keyword_1_0_2()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getConstructedTypeAccess().getPrivateUseAreaE102Keyword_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:823:2: ( '\\uE100' )
                    {
                    // InternalMyDsl.g:823:2: ( '\\uE100' )
                    // InternalMyDsl.g:824:3: '\\uE100'
                    {
                     before(grammarAccess.getConstructedTypeAccess().getPrivateUseAreaE100Keyword_1_0_3()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getConstructedTypeAccess().getPrivateUseAreaE100Keyword_1_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:829:2: ( '\\u2194' )
                    {
                    // InternalMyDsl.g:829:2: ( '\\u2194' )
                    // InternalMyDsl.g:830:3: '\\u2194'
                    {
                     before(grammarAccess.getConstructedTypeAccess().getLeftRightArrowKeyword_1_0_4()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getConstructedTypeAccess().getLeftRightArrowKeyword_1_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:835:2: ( '\\u2916' )
                    {
                    // InternalMyDsl.g:835:2: ( '\\u2916' )
                    // InternalMyDsl.g:836:3: '\\u2916'
                    {
                     before(grammarAccess.getConstructedTypeAccess().getRightwardsTwoHeadedArrowWithTailKeyword_1_0_5()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getConstructedTypeAccess().getRightwardsTwoHeadedArrowWithTailKeyword_1_0_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:841:2: ( '\\u21F8' )
                    {
                    // InternalMyDsl.g:841:2: ( '\\u21F8' )
                    // InternalMyDsl.g:842:3: '\\u21F8'
                    {
                     before(grammarAccess.getConstructedTypeAccess().getRightwardsArrowWithVerticalStrokeKeyword_1_0_6()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getConstructedTypeAccess().getRightwardsArrowWithVerticalStrokeKeyword_1_0_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:847:2: ( '\\u21A3' )
                    {
                    // InternalMyDsl.g:847:2: ( '\\u21A3' )
                    // InternalMyDsl.g:848:3: '\\u21A3'
                    {
                     before(grammarAccess.getConstructedTypeAccess().getRightwardsArrowWithTailKeyword_1_0_7()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getConstructedTypeAccess().getRightwardsArrowWithTailKeyword_1_0_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalMyDsl.g:853:2: ( '\\u2900' )
                    {
                    // InternalMyDsl.g:853:2: ( '\\u2900' )
                    // InternalMyDsl.g:854:3: '\\u2900'
                    {
                     before(grammarAccess.getConstructedTypeAccess().getRightwardsTwoHeadedArrowWithVerticalStrokeKeyword_1_0_8()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getConstructedTypeAccess().getRightwardsTwoHeadedArrowWithVerticalStrokeKeyword_1_0_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalMyDsl.g:859:2: ( '\\u21A0' )
                    {
                    // InternalMyDsl.g:859:2: ( '\\u21A0' )
                    // InternalMyDsl.g:860:3: '\\u21A0'
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


    // $ANTLR start "rule__TypeBodyElements__Alternatives"
    // InternalMyDsl.g:869:1: rule__TypeBodyElements__Alternatives : ( ( ( rule__TypeBodyElements__FunctionsAssignment_0 ) ) | ( ( rule__TypeBodyElements__TheoremsAssignment_1 ) ) );
    public final void rule__TypeBodyElements__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:873:1: ( ( ( rule__TypeBodyElements__FunctionsAssignment_0 ) ) | ( ( rule__TypeBodyElements__TheoremsAssignment_1 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            else if ( (LA5_0==33) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:874:2: ( ( rule__TypeBodyElements__FunctionsAssignment_0 ) )
                    {
                    // InternalMyDsl.g:874:2: ( ( rule__TypeBodyElements__FunctionsAssignment_0 ) )
                    // InternalMyDsl.g:875:3: ( rule__TypeBodyElements__FunctionsAssignment_0 )
                    {
                     before(grammarAccess.getTypeBodyElementsAccess().getFunctionsAssignment_0()); 
                    // InternalMyDsl.g:876:3: ( rule__TypeBodyElements__FunctionsAssignment_0 )
                    // InternalMyDsl.g:876:4: rule__TypeBodyElements__FunctionsAssignment_0
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
                    // InternalMyDsl.g:880:2: ( ( rule__TypeBodyElements__TheoremsAssignment_1 ) )
                    {
                    // InternalMyDsl.g:880:2: ( ( rule__TypeBodyElements__TheoremsAssignment_1 ) )
                    // InternalMyDsl.g:881:3: ( rule__TypeBodyElements__TheoremsAssignment_1 )
                    {
                     before(grammarAccess.getTypeBodyElementsAccess().getTheoremsAssignment_1()); 
                    // InternalMyDsl.g:882:3: ( rule__TypeBodyElements__TheoremsAssignment_1 )
                    // InternalMyDsl.g:882:4: rule__TypeBodyElements__TheoremsAssignment_1
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


    // $ANTLR start "rule__DatatypeConstructor__Alternatives"
    // InternalMyDsl.g:890:1: rule__DatatypeConstructor__Alternatives : ( ( ruleBaseConstructor ) | ( ruleConstructor ) );
    public final void rule__DatatypeConstructor__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:894:1: ( ( ruleBaseConstructor ) | ( ruleConstructor ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==31) ) {
                    alt6=2;
                }
                else if ( (LA6_1==EOF||LA6_1==RULE_ID||LA6_1==24) ) {
                    alt6=1;
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
                    // InternalMyDsl.g:895:2: ( ruleBaseConstructor )
                    {
                    // InternalMyDsl.g:895:2: ( ruleBaseConstructor )
                    // InternalMyDsl.g:896:3: ruleBaseConstructor
                    {
                     before(grammarAccess.getDatatypeConstructorAccess().getBaseConstructorParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleBaseConstructor();

                    state._fsp--;

                     after(grammarAccess.getDatatypeConstructorAccess().getBaseConstructorParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:901:2: ( ruleConstructor )
                    {
                    // InternalMyDsl.g:901:2: ( ruleConstructor )
                    // InternalMyDsl.g:902:3: ruleConstructor
                    {
                     before(grammarAccess.getDatatypeConstructorAccess().getConstructorParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleConstructor();

                    state._fsp--;

                     after(grammarAccess.getDatatypeConstructorAccess().getConstructorParserRuleCall_1()); 

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
    // $ANTLR end "rule__DatatypeConstructor__Alternatives"


    // $ANTLR start "rule__ImportStatement__Group__0"
    // InternalMyDsl.g:911:1: rule__ImportStatement__Group__0 : rule__ImportStatement__Group__0__Impl rule__ImportStatement__Group__1 ;
    public final void rule__ImportStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:915:1: ( rule__ImportStatement__Group__0__Impl rule__ImportStatement__Group__1 )
            // InternalMyDsl.g:916:2: rule__ImportStatement__Group__0__Impl rule__ImportStatement__Group__1
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
    // InternalMyDsl.g:923:1: rule__ImportStatement__Group__0__Impl : ( 'Import' ) ;
    public final void rule__ImportStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:927:1: ( ( 'Import' ) )
            // InternalMyDsl.g:928:1: ( 'Import' )
            {
            // InternalMyDsl.g:928:1: ( 'Import' )
            // InternalMyDsl.g:929:2: 'Import'
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
    // InternalMyDsl.g:938:1: rule__ImportStatement__Group__1 : rule__ImportStatement__Group__1__Impl ;
    public final void rule__ImportStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:942:1: ( rule__ImportStatement__Group__1__Impl )
            // InternalMyDsl.g:943:2: rule__ImportStatement__Group__1__Impl
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
    // InternalMyDsl.g:949:1: rule__ImportStatement__Group__1__Impl : ( ( rule__ImportStatement__ImportsAssignment_1 ) ) ;
    public final void rule__ImportStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:953:1: ( ( ( rule__ImportStatement__ImportsAssignment_1 ) ) )
            // InternalMyDsl.g:954:1: ( ( rule__ImportStatement__ImportsAssignment_1 ) )
            {
            // InternalMyDsl.g:954:1: ( ( rule__ImportStatement__ImportsAssignment_1 ) )
            // InternalMyDsl.g:955:2: ( rule__ImportStatement__ImportsAssignment_1 )
            {
             before(grammarAccess.getImportStatementAccess().getImportsAssignment_1()); 
            // InternalMyDsl.g:956:2: ( rule__ImportStatement__ImportsAssignment_1 )
            // InternalMyDsl.g:956:3: rule__ImportStatement__ImportsAssignment_1
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
    // InternalMyDsl.g:965:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:969:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalMyDsl.g:970:2: rule__Import__Group__0__Impl rule__Import__Group__1
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
    // InternalMyDsl.g:977:1: rule__Import__Group__0__Impl : ( ( rule__Import__ImportNameAssignment_0 ) ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:981:1: ( ( ( rule__Import__ImportNameAssignment_0 ) ) )
            // InternalMyDsl.g:982:1: ( ( rule__Import__ImportNameAssignment_0 ) )
            {
            // InternalMyDsl.g:982:1: ( ( rule__Import__ImportNameAssignment_0 ) )
            // InternalMyDsl.g:983:2: ( rule__Import__ImportNameAssignment_0 )
            {
             before(grammarAccess.getImportAccess().getImportNameAssignment_0()); 
            // InternalMyDsl.g:984:2: ( rule__Import__ImportNameAssignment_0 )
            // InternalMyDsl.g:984:3: rule__Import__ImportNameAssignment_0
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
    // InternalMyDsl.g:992:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:996:1: ( rule__Import__Group__1__Impl )
            // InternalMyDsl.g:997:2: rule__Import__Group__1__Impl
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
    // InternalMyDsl.g:1003:1: rule__Import__Group__1__Impl : ( ( rule__Import__Group_1__0 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1007:1: ( ( ( rule__Import__Group_1__0 ) ) )
            // InternalMyDsl.g:1008:1: ( ( rule__Import__Group_1__0 ) )
            {
            // InternalMyDsl.g:1008:1: ( ( rule__Import__Group_1__0 ) )
            // InternalMyDsl.g:1009:2: ( rule__Import__Group_1__0 )
            {
             before(grammarAccess.getImportAccess().getGroup_1()); 
            // InternalMyDsl.g:1010:2: ( rule__Import__Group_1__0 )
            // InternalMyDsl.g:1010:3: rule__Import__Group_1__0
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
    // InternalMyDsl.g:1019:1: rule__Import__Group_1__0 : rule__Import__Group_1__0__Impl rule__Import__Group_1__1 ;
    public final void rule__Import__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1023:1: ( rule__Import__Group_1__0__Impl rule__Import__Group_1__1 )
            // InternalMyDsl.g:1024:2: rule__Import__Group_1__0__Impl rule__Import__Group_1__1
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
    // InternalMyDsl.g:1031:1: rule__Import__Group_1__0__Impl : ( '.' ) ;
    public final void rule__Import__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1035:1: ( ( '.' ) )
            // InternalMyDsl.g:1036:1: ( '.' )
            {
            // InternalMyDsl.g:1036:1: ( '.' )
            // InternalMyDsl.g:1037:2: '.'
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
    // InternalMyDsl.g:1046:1: rule__Import__Group_1__1 : rule__Import__Group_1__1__Impl ;
    public final void rule__Import__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1050:1: ( rule__Import__Group_1__1__Impl )
            // InternalMyDsl.g:1051:2: rule__Import__Group_1__1__Impl
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
    // InternalMyDsl.g:1057:1: rule__Import__Group_1__1__Impl : ( ( rule__Import__ImportNameAssignment_1_1 ) ) ;
    public final void rule__Import__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1061:1: ( ( ( rule__Import__ImportNameAssignment_1_1 ) ) )
            // InternalMyDsl.g:1062:1: ( ( rule__Import__ImportNameAssignment_1_1 ) )
            {
            // InternalMyDsl.g:1062:1: ( ( rule__Import__ImportNameAssignment_1_1 ) )
            // InternalMyDsl.g:1063:2: ( rule__Import__ImportNameAssignment_1_1 )
            {
             before(grammarAccess.getImportAccess().getImportNameAssignment_1_1()); 
            // InternalMyDsl.g:1064:2: ( rule__Import__ImportNameAssignment_1_1 )
            // InternalMyDsl.g:1064:3: rule__Import__ImportNameAssignment_1_1
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
    // InternalMyDsl.g:1073:1: rule__Class__Group__0 : rule__Class__Group__0__Impl rule__Class__Group__1 ;
    public final void rule__Class__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1077:1: ( rule__Class__Group__0__Impl rule__Class__Group__1 )
            // InternalMyDsl.g:1078:2: rule__Class__Group__0__Impl rule__Class__Group__1
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
    // InternalMyDsl.g:1085:1: rule__Class__Group__0__Impl : ( 'Class' ) ;
    public final void rule__Class__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1089:1: ( ( 'Class' ) )
            // InternalMyDsl.g:1090:1: ( 'Class' )
            {
            // InternalMyDsl.g:1090:1: ( 'Class' )
            // InternalMyDsl.g:1091:2: 'Class'
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
    // InternalMyDsl.g:1100:1: rule__Class__Group__1 : rule__Class__Group__1__Impl rule__Class__Group__2 ;
    public final void rule__Class__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1104:1: ( rule__Class__Group__1__Impl rule__Class__Group__2 )
            // InternalMyDsl.g:1105:2: rule__Class__Group__1__Impl rule__Class__Group__2
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
    // InternalMyDsl.g:1112:1: rule__Class__Group__1__Impl : ( ( rule__Class__TypeNameAssignment_1 ) ) ;
    public final void rule__Class__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1116:1: ( ( ( rule__Class__TypeNameAssignment_1 ) ) )
            // InternalMyDsl.g:1117:1: ( ( rule__Class__TypeNameAssignment_1 ) )
            {
            // InternalMyDsl.g:1117:1: ( ( rule__Class__TypeNameAssignment_1 ) )
            // InternalMyDsl.g:1118:2: ( rule__Class__TypeNameAssignment_1 )
            {
             before(grammarAccess.getClassAccess().getTypeNameAssignment_1()); 
            // InternalMyDsl.g:1119:2: ( rule__Class__TypeNameAssignment_1 )
            // InternalMyDsl.g:1119:3: rule__Class__TypeNameAssignment_1
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
    // InternalMyDsl.g:1127:1: rule__Class__Group__2 : rule__Class__Group__2__Impl rule__Class__Group__3 ;
    public final void rule__Class__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1131:1: ( rule__Class__Group__2__Impl rule__Class__Group__3 )
            // InternalMyDsl.g:1132:2: rule__Class__Group__2__Impl rule__Class__Group__3
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
    // InternalMyDsl.g:1139:1: rule__Class__Group__2__Impl : ( ( rule__Class__ContextAssignment_2 )? ) ;
    public final void rule__Class__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1143:1: ( ( ( rule__Class__ContextAssignment_2 )? ) )
            // InternalMyDsl.g:1144:1: ( ( rule__Class__ContextAssignment_2 )? )
            {
            // InternalMyDsl.g:1144:1: ( ( rule__Class__ContextAssignment_2 )? )
            // InternalMyDsl.g:1145:2: ( rule__Class__ContextAssignment_2 )?
            {
             before(grammarAccess.getClassAccess().getContextAssignment_2()); 
            // InternalMyDsl.g:1146:2: ( rule__Class__ContextAssignment_2 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==26) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:1146:3: rule__Class__ContextAssignment_2
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
    // InternalMyDsl.g:1154:1: rule__Class__Group__3 : rule__Class__Group__3__Impl rule__Class__Group__4 ;
    public final void rule__Class__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1158:1: ( rule__Class__Group__3__Impl rule__Class__Group__4 )
            // InternalMyDsl.g:1159:2: rule__Class__Group__3__Impl rule__Class__Group__4
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
    // InternalMyDsl.g:1166:1: rule__Class__Group__3__Impl : ( ( rule__Class__SupertypesAssignment_3 )? ) ;
    public final void rule__Class__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1170:1: ( ( ( rule__Class__SupertypesAssignment_3 )? ) )
            // InternalMyDsl.g:1171:1: ( ( rule__Class__SupertypesAssignment_3 )? )
            {
            // InternalMyDsl.g:1171:1: ( ( rule__Class__SupertypesAssignment_3 )? )
            // InternalMyDsl.g:1172:2: ( rule__Class__SupertypesAssignment_3 )?
            {
             before(grammarAccess.getClassAccess().getSupertypesAssignment_3()); 
            // InternalMyDsl.g:1173:2: ( rule__Class__SupertypesAssignment_3 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==28) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:1173:3: rule__Class__SupertypesAssignment_3
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
    // InternalMyDsl.g:1181:1: rule__Class__Group__4 : rule__Class__Group__4__Impl rule__Class__Group__5 ;
    public final void rule__Class__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1185:1: ( rule__Class__Group__4__Impl rule__Class__Group__5 )
            // InternalMyDsl.g:1186:2: rule__Class__Group__4__Impl rule__Class__Group__5
            {
            pushFollow(FOLLOW_7);
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
    // InternalMyDsl.g:1193:1: rule__Class__Group__4__Impl : ( '{' ) ;
    public final void rule__Class__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1197:1: ( ( '{' ) )
            // InternalMyDsl.g:1198:1: ( '{' )
            {
            // InternalMyDsl.g:1198:1: ( '{' )
            // InternalMyDsl.g:1199:2: '{'
            {
             before(grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
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
    // InternalMyDsl.g:1208:1: rule__Class__Group__5 : rule__Class__Group__5__Impl rule__Class__Group__6 ;
    public final void rule__Class__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1212:1: ( rule__Class__Group__5__Impl rule__Class__Group__6 )
            // InternalMyDsl.g:1213:2: rule__Class__Group__5__Impl rule__Class__Group__6
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
    // InternalMyDsl.g:1220:1: rule__Class__Group__5__Impl : ( ( rule__Class__BodyElementsAssignment_5 )* ) ;
    public final void rule__Class__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1224:1: ( ( ( rule__Class__BodyElementsAssignment_5 )* ) )
            // InternalMyDsl.g:1225:1: ( ( rule__Class__BodyElementsAssignment_5 )* )
            {
            // InternalMyDsl.g:1225:1: ( ( rule__Class__BodyElementsAssignment_5 )* )
            // InternalMyDsl.g:1226:2: ( rule__Class__BodyElementsAssignment_5 )*
            {
             before(grammarAccess.getClassAccess().getBodyElementsAssignment_5()); 
            // InternalMyDsl.g:1227:2: ( rule__Class__BodyElementsAssignment_5 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID||LA9_0==33) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMyDsl.g:1227:3: rule__Class__BodyElementsAssignment_5
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Class__BodyElementsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getClassAccess().getBodyElementsAssignment_5()); 

            }


            }

        }
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
    // InternalMyDsl.g:1235:1: rule__Class__Group__6 : rule__Class__Group__6__Impl ;
    public final void rule__Class__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1239:1: ( rule__Class__Group__6__Impl )
            // InternalMyDsl.g:1240:2: rule__Class__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group__6__Impl();

            state._fsp--;


            }

        }
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
    // InternalMyDsl.g:1246:1: rule__Class__Group__6__Impl : ( '}' ) ;
    public final void rule__Class__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1250:1: ( ( '}' ) )
            // InternalMyDsl.g:1251:1: ( '}' )
            {
            // InternalMyDsl.g:1251:1: ( '}' )
            // InternalMyDsl.g:1252:2: '}'
            {
             before(grammarAccess.getClassAccess().getRightCurlyBracketKeyword_6()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
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


    // $ANTLR start "rule__PolyContext__Group__0"
    // InternalMyDsl.g:1262:1: rule__PolyContext__Group__0 : rule__PolyContext__Group__0__Impl rule__PolyContext__Group__1 ;
    public final void rule__PolyContext__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1266:1: ( rule__PolyContext__Group__0__Impl rule__PolyContext__Group__1 )
            // InternalMyDsl.g:1267:2: rule__PolyContext__Group__0__Impl rule__PolyContext__Group__1
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
    // InternalMyDsl.g:1274:1: rule__PolyContext__Group__0__Impl : ( '<' ) ;
    public final void rule__PolyContext__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1278:1: ( ( '<' ) )
            // InternalMyDsl.g:1279:1: ( '<' )
            {
            // InternalMyDsl.g:1279:1: ( '<' )
            // InternalMyDsl.g:1280:2: '<'
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
    // InternalMyDsl.g:1289:1: rule__PolyContext__Group__1 : rule__PolyContext__Group__1__Impl rule__PolyContext__Group__2 ;
    public final void rule__PolyContext__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1293:1: ( rule__PolyContext__Group__1__Impl rule__PolyContext__Group__2 )
            // InternalMyDsl.g:1294:2: rule__PolyContext__Group__1__Impl rule__PolyContext__Group__2
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
    // InternalMyDsl.g:1301:1: rule__PolyContext__Group__1__Impl : ( ( ( rule__PolyContext__PolyTypesAssignment_1 ) ) ( ( rule__PolyContext__PolyTypesAssignment_1 )* ) ) ;
    public final void rule__PolyContext__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1305:1: ( ( ( ( rule__PolyContext__PolyTypesAssignment_1 ) ) ( ( rule__PolyContext__PolyTypesAssignment_1 )* ) ) )
            // InternalMyDsl.g:1306:1: ( ( ( rule__PolyContext__PolyTypesAssignment_1 ) ) ( ( rule__PolyContext__PolyTypesAssignment_1 )* ) )
            {
            // InternalMyDsl.g:1306:1: ( ( ( rule__PolyContext__PolyTypesAssignment_1 ) ) ( ( rule__PolyContext__PolyTypesAssignment_1 )* ) )
            // InternalMyDsl.g:1307:2: ( ( rule__PolyContext__PolyTypesAssignment_1 ) ) ( ( rule__PolyContext__PolyTypesAssignment_1 )* )
            {
            // InternalMyDsl.g:1307:2: ( ( rule__PolyContext__PolyTypesAssignment_1 ) )
            // InternalMyDsl.g:1308:3: ( rule__PolyContext__PolyTypesAssignment_1 )
            {
             before(grammarAccess.getPolyContextAccess().getPolyTypesAssignment_1()); 
            // InternalMyDsl.g:1309:3: ( rule__PolyContext__PolyTypesAssignment_1 )
            // InternalMyDsl.g:1309:4: rule__PolyContext__PolyTypesAssignment_1
            {
            pushFollow(FOLLOW_10);
            rule__PolyContext__PolyTypesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPolyContextAccess().getPolyTypesAssignment_1()); 

            }

            // InternalMyDsl.g:1312:2: ( ( rule__PolyContext__PolyTypesAssignment_1 )* )
            // InternalMyDsl.g:1313:3: ( rule__PolyContext__PolyTypesAssignment_1 )*
            {
             before(grammarAccess.getPolyContextAccess().getPolyTypesAssignment_1()); 
            // InternalMyDsl.g:1314:3: ( rule__PolyContext__PolyTypesAssignment_1 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMyDsl.g:1314:4: rule__PolyContext__PolyTypesAssignment_1
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__PolyContext__PolyTypesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalMyDsl.g:1323:1: rule__PolyContext__Group__2 : rule__PolyContext__Group__2__Impl ;
    public final void rule__PolyContext__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1327:1: ( rule__PolyContext__Group__2__Impl )
            // InternalMyDsl.g:1328:2: rule__PolyContext__Group__2__Impl
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
    // InternalMyDsl.g:1334:1: rule__PolyContext__Group__2__Impl : ( '>' ) ;
    public final void rule__PolyContext__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1338:1: ( ( '>' ) )
            // InternalMyDsl.g:1339:1: ( '>' )
            {
            // InternalMyDsl.g:1339:1: ( '>' )
            // InternalMyDsl.g:1340:2: '>'
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
    // InternalMyDsl.g:1350:1: rule__PolyContextTypes__Group__0 : rule__PolyContextTypes__Group__0__Impl rule__PolyContextTypes__Group__1 ;
    public final void rule__PolyContextTypes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1354:1: ( rule__PolyContextTypes__Group__0__Impl rule__PolyContextTypes__Group__1 )
            // InternalMyDsl.g:1355:2: rule__PolyContextTypes__Group__0__Impl rule__PolyContextTypes__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalMyDsl.g:1362:1: rule__PolyContextTypes__Group__0__Impl : ( ( rule__PolyContextTypes__NameAssignment_0 ) ) ;
    public final void rule__PolyContextTypes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1366:1: ( ( ( rule__PolyContextTypes__NameAssignment_0 ) ) )
            // InternalMyDsl.g:1367:1: ( ( rule__PolyContextTypes__NameAssignment_0 ) )
            {
            // InternalMyDsl.g:1367:1: ( ( rule__PolyContextTypes__NameAssignment_0 ) )
            // InternalMyDsl.g:1368:2: ( rule__PolyContextTypes__NameAssignment_0 )
            {
             before(grammarAccess.getPolyContextTypesAccess().getNameAssignment_0()); 
            // InternalMyDsl.g:1369:2: ( rule__PolyContextTypes__NameAssignment_0 )
            // InternalMyDsl.g:1369:3: rule__PolyContextTypes__NameAssignment_0
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
    // InternalMyDsl.g:1377:1: rule__PolyContextTypes__Group__1 : rule__PolyContextTypes__Group__1__Impl ;
    public final void rule__PolyContextTypes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1381:1: ( rule__PolyContextTypes__Group__1__Impl )
            // InternalMyDsl.g:1382:2: rule__PolyContextTypes__Group__1__Impl
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
    // InternalMyDsl.g:1388:1: rule__PolyContextTypes__Group__1__Impl : ( ( rule__PolyContextTypes__ConstraintsAssignment_1 )* ) ;
    public final void rule__PolyContextTypes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1392:1: ( ( ( rule__PolyContextTypes__ConstraintsAssignment_1 )* ) )
            // InternalMyDsl.g:1393:1: ( ( rule__PolyContextTypes__ConstraintsAssignment_1 )* )
            {
            // InternalMyDsl.g:1393:1: ( ( rule__PolyContextTypes__ConstraintsAssignment_1 )* )
            // InternalMyDsl.g:1394:2: ( rule__PolyContextTypes__ConstraintsAssignment_1 )*
            {
             before(grammarAccess.getPolyContextTypesAccess().getConstraintsAssignment_1()); 
            // InternalMyDsl.g:1395:2: ( rule__PolyContextTypes__ConstraintsAssignment_1 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==28) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMyDsl.g:1395:3: rule__PolyContextTypes__ConstraintsAssignment_1
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__PolyContextTypes__ConstraintsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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


    // $ANTLR start "rule__TypeConstraints__Group__0"
    // InternalMyDsl.g:1404:1: rule__TypeConstraints__Group__0 : rule__TypeConstraints__Group__0__Impl rule__TypeConstraints__Group__1 ;
    public final void rule__TypeConstraints__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1408:1: ( rule__TypeConstraints__Group__0__Impl rule__TypeConstraints__Group__1 )
            // InternalMyDsl.g:1409:2: rule__TypeConstraints__Group__0__Impl rule__TypeConstraints__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__TypeConstraints__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeConstraints__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeConstraints__Group__0"


    // $ANTLR start "rule__TypeConstraints__Group__0__Impl"
    // InternalMyDsl.g:1416:1: rule__TypeConstraints__Group__0__Impl : ( ':' ) ;
    public final void rule__TypeConstraints__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1420:1: ( ( ':' ) )
            // InternalMyDsl.g:1421:1: ( ':' )
            {
            // InternalMyDsl.g:1421:1: ( ':' )
            // InternalMyDsl.g:1422:2: ':'
            {
             before(grammarAccess.getTypeConstraintsAccess().getColonKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getTypeConstraintsAccess().getColonKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeConstraints__Group__0__Impl"


    // $ANTLR start "rule__TypeConstraints__Group__1"
    // InternalMyDsl.g:1431:1: rule__TypeConstraints__Group__1 : rule__TypeConstraints__Group__1__Impl rule__TypeConstraints__Group__2 ;
    public final void rule__TypeConstraints__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1435:1: ( rule__TypeConstraints__Group__1__Impl rule__TypeConstraints__Group__2 )
            // InternalMyDsl.g:1436:2: rule__TypeConstraints__Group__1__Impl rule__TypeConstraints__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__TypeConstraints__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeConstraints__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeConstraints__Group__1"


    // $ANTLR start "rule__TypeConstraints__Group__1__Impl"
    // InternalMyDsl.g:1443:1: rule__TypeConstraints__Group__1__Impl : ( ( rule__TypeConstraints__TypeNameAssignment_1 ) ) ;
    public final void rule__TypeConstraints__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1447:1: ( ( ( rule__TypeConstraints__TypeNameAssignment_1 ) ) )
            // InternalMyDsl.g:1448:1: ( ( rule__TypeConstraints__TypeNameAssignment_1 ) )
            {
            // InternalMyDsl.g:1448:1: ( ( rule__TypeConstraints__TypeNameAssignment_1 ) )
            // InternalMyDsl.g:1449:2: ( rule__TypeConstraints__TypeNameAssignment_1 )
            {
             before(grammarAccess.getTypeConstraintsAccess().getTypeNameAssignment_1()); 
            // InternalMyDsl.g:1450:2: ( rule__TypeConstraints__TypeNameAssignment_1 )
            // InternalMyDsl.g:1450:3: rule__TypeConstraints__TypeNameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TypeConstraints__TypeNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTypeConstraintsAccess().getTypeNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeConstraints__Group__1__Impl"


    // $ANTLR start "rule__TypeConstraints__Group__2"
    // InternalMyDsl.g:1458:1: rule__TypeConstraints__Group__2 : rule__TypeConstraints__Group__2__Impl ;
    public final void rule__TypeConstraints__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1462:1: ( rule__TypeConstraints__Group__2__Impl )
            // InternalMyDsl.g:1463:2: rule__TypeConstraints__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TypeConstraints__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeConstraints__Group__2"


    // $ANTLR start "rule__TypeConstraints__Group__2__Impl"
    // InternalMyDsl.g:1469:1: rule__TypeConstraints__Group__2__Impl : ( ( rule__TypeConstraints__Group_2__0 )* ) ;
    public final void rule__TypeConstraints__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1473:1: ( ( ( rule__TypeConstraints__Group_2__0 )* ) )
            // InternalMyDsl.g:1474:1: ( ( rule__TypeConstraints__Group_2__0 )* )
            {
            // InternalMyDsl.g:1474:1: ( ( rule__TypeConstraints__Group_2__0 )* )
            // InternalMyDsl.g:1475:2: ( rule__TypeConstraints__Group_2__0 )*
            {
             before(grammarAccess.getTypeConstraintsAccess().getGroup_2()); 
            // InternalMyDsl.g:1476:2: ( rule__TypeConstraints__Group_2__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==29) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMyDsl.g:1476:3: rule__TypeConstraints__Group_2__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__TypeConstraints__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getTypeConstraintsAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeConstraints__Group__2__Impl"


    // $ANTLR start "rule__TypeConstraints__Group_2__0"
    // InternalMyDsl.g:1485:1: rule__TypeConstraints__Group_2__0 : rule__TypeConstraints__Group_2__0__Impl rule__TypeConstraints__Group_2__1 ;
    public final void rule__TypeConstraints__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1489:1: ( rule__TypeConstraints__Group_2__0__Impl rule__TypeConstraints__Group_2__1 )
            // InternalMyDsl.g:1490:2: rule__TypeConstraints__Group_2__0__Impl rule__TypeConstraints__Group_2__1
            {
            pushFollow(FOLLOW_4);
            rule__TypeConstraints__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeConstraints__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeConstraints__Group_2__0"


    // $ANTLR start "rule__TypeConstraints__Group_2__0__Impl"
    // InternalMyDsl.g:1497:1: rule__TypeConstraints__Group_2__0__Impl : ( ',' ) ;
    public final void rule__TypeConstraints__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1501:1: ( ( ',' ) )
            // InternalMyDsl.g:1502:1: ( ',' )
            {
            // InternalMyDsl.g:1502:1: ( ',' )
            // InternalMyDsl.g:1503:2: ','
            {
             before(grammarAccess.getTypeConstraintsAccess().getCommaKeyword_2_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getTypeConstraintsAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeConstraints__Group_2__0__Impl"


    // $ANTLR start "rule__TypeConstraints__Group_2__1"
    // InternalMyDsl.g:1512:1: rule__TypeConstraints__Group_2__1 : rule__TypeConstraints__Group_2__1__Impl ;
    public final void rule__TypeConstraints__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1516:1: ( rule__TypeConstraints__Group_2__1__Impl )
            // InternalMyDsl.g:1517:2: rule__TypeConstraints__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TypeConstraints__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeConstraints__Group_2__1"


    // $ANTLR start "rule__TypeConstraints__Group_2__1__Impl"
    // InternalMyDsl.g:1523:1: rule__TypeConstraints__Group_2__1__Impl : ( ( rule__TypeConstraints__TypeNameAssignment_2_1 ) ) ;
    public final void rule__TypeConstraints__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1527:1: ( ( ( rule__TypeConstraints__TypeNameAssignment_2_1 ) ) )
            // InternalMyDsl.g:1528:1: ( ( rule__TypeConstraints__TypeNameAssignment_2_1 ) )
            {
            // InternalMyDsl.g:1528:1: ( ( rule__TypeConstraints__TypeNameAssignment_2_1 ) )
            // InternalMyDsl.g:1529:2: ( rule__TypeConstraints__TypeNameAssignment_2_1 )
            {
             before(grammarAccess.getTypeConstraintsAccess().getTypeNameAssignment_2_1()); 
            // InternalMyDsl.g:1530:2: ( rule__TypeConstraints__TypeNameAssignment_2_1 )
            // InternalMyDsl.g:1530:3: rule__TypeConstraints__TypeNameAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__TypeConstraints__TypeNameAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getTypeConstraintsAccess().getTypeNameAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeConstraints__Group_2__1__Impl"


    // $ANTLR start "rule__TypedVariable__Group__0"
    // InternalMyDsl.g:1539:1: rule__TypedVariable__Group__0 : rule__TypedVariable__Group__0__Impl rule__TypedVariable__Group__1 ;
    public final void rule__TypedVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1543:1: ( rule__TypedVariable__Group__0__Impl rule__TypedVariable__Group__1 )
            // InternalMyDsl.g:1544:2: rule__TypedVariable__Group__0__Impl rule__TypedVariable__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalMyDsl.g:1551:1: rule__TypedVariable__Group__0__Impl : ( ( rule__TypedVariable__NameAssignment_0 ) ) ;
    public final void rule__TypedVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1555:1: ( ( ( rule__TypedVariable__NameAssignment_0 ) ) )
            // InternalMyDsl.g:1556:1: ( ( rule__TypedVariable__NameAssignment_0 ) )
            {
            // InternalMyDsl.g:1556:1: ( ( rule__TypedVariable__NameAssignment_0 ) )
            // InternalMyDsl.g:1557:2: ( rule__TypedVariable__NameAssignment_0 )
            {
             before(grammarAccess.getTypedVariableAccess().getNameAssignment_0()); 
            // InternalMyDsl.g:1558:2: ( rule__TypedVariable__NameAssignment_0 )
            // InternalMyDsl.g:1558:3: rule__TypedVariable__NameAssignment_0
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
    // InternalMyDsl.g:1566:1: rule__TypedVariable__Group__1 : rule__TypedVariable__Group__1__Impl ;
    public final void rule__TypedVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1570:1: ( rule__TypedVariable__Group__1__Impl )
            // InternalMyDsl.g:1571:2: rule__TypedVariable__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TypedVariable__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalMyDsl.g:1577:1: rule__TypedVariable__Group__1__Impl : ( ( rule__TypedVariable__ConstraintsAssignment_1 ) ) ;
    public final void rule__TypedVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1581:1: ( ( ( rule__TypedVariable__ConstraintsAssignment_1 ) ) )
            // InternalMyDsl.g:1582:1: ( ( rule__TypedVariable__ConstraintsAssignment_1 ) )
            {
            // InternalMyDsl.g:1582:1: ( ( rule__TypedVariable__ConstraintsAssignment_1 ) )
            // InternalMyDsl.g:1583:2: ( rule__TypedVariable__ConstraintsAssignment_1 )
            {
             before(grammarAccess.getTypedVariableAccess().getConstraintsAssignment_1()); 
            // InternalMyDsl.g:1584:2: ( rule__TypedVariable__ConstraintsAssignment_1 )
            // InternalMyDsl.g:1584:3: rule__TypedVariable__ConstraintsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TypedVariable__ConstraintsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTypedVariableAccess().getConstraintsAssignment_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Supertype__Group__0"
    // InternalMyDsl.g:1593:1: rule__Supertype__Group__0 : rule__Supertype__Group__0__Impl rule__Supertype__Group__1 ;
    public final void rule__Supertype__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1597:1: ( rule__Supertype__Group__0__Impl rule__Supertype__Group__1 )
            // InternalMyDsl.g:1598:2: rule__Supertype__Group__0__Impl rule__Supertype__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Supertype__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Supertype__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Supertype__Group__0"


    // $ANTLR start "rule__Supertype__Group__0__Impl"
    // InternalMyDsl.g:1605:1: rule__Supertype__Group__0__Impl : ( ':' ) ;
    public final void rule__Supertype__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1609:1: ( ( ':' ) )
            // InternalMyDsl.g:1610:1: ( ':' )
            {
            // InternalMyDsl.g:1610:1: ( ':' )
            // InternalMyDsl.g:1611:2: ':'
            {
             before(grammarAccess.getSupertypeAccess().getColonKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getSupertypeAccess().getColonKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Supertype__Group__0__Impl"


    // $ANTLR start "rule__Supertype__Group__1"
    // InternalMyDsl.g:1620:1: rule__Supertype__Group__1 : rule__Supertype__Group__1__Impl rule__Supertype__Group__2 ;
    public final void rule__Supertype__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1624:1: ( rule__Supertype__Group__1__Impl rule__Supertype__Group__2 )
            // InternalMyDsl.g:1625:2: rule__Supertype__Group__1__Impl rule__Supertype__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Supertype__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Supertype__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Supertype__Group__1"


    // $ANTLR start "rule__Supertype__Group__1__Impl"
    // InternalMyDsl.g:1632:1: rule__Supertype__Group__1__Impl : ( ( rule__Supertype__SuperTypeAssignment_1 ) ) ;
    public final void rule__Supertype__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1636:1: ( ( ( rule__Supertype__SuperTypeAssignment_1 ) ) )
            // InternalMyDsl.g:1637:1: ( ( rule__Supertype__SuperTypeAssignment_1 ) )
            {
            // InternalMyDsl.g:1637:1: ( ( rule__Supertype__SuperTypeAssignment_1 ) )
            // InternalMyDsl.g:1638:2: ( rule__Supertype__SuperTypeAssignment_1 )
            {
             before(grammarAccess.getSupertypeAccess().getSuperTypeAssignment_1()); 
            // InternalMyDsl.g:1639:2: ( rule__Supertype__SuperTypeAssignment_1 )
            // InternalMyDsl.g:1639:3: rule__Supertype__SuperTypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Supertype__SuperTypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSupertypeAccess().getSuperTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Supertype__Group__1__Impl"


    // $ANTLR start "rule__Supertype__Group__2"
    // InternalMyDsl.g:1647:1: rule__Supertype__Group__2 : rule__Supertype__Group__2__Impl ;
    public final void rule__Supertype__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1651:1: ( rule__Supertype__Group__2__Impl )
            // InternalMyDsl.g:1652:2: rule__Supertype__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Supertype__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Supertype__Group__2"


    // $ANTLR start "rule__Supertype__Group__2__Impl"
    // InternalMyDsl.g:1658:1: rule__Supertype__Group__2__Impl : ( ( rule__Supertype__Group_2__0 )* ) ;
    public final void rule__Supertype__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1662:1: ( ( ( rule__Supertype__Group_2__0 )* ) )
            // InternalMyDsl.g:1663:1: ( ( rule__Supertype__Group_2__0 )* )
            {
            // InternalMyDsl.g:1663:1: ( ( rule__Supertype__Group_2__0 )* )
            // InternalMyDsl.g:1664:2: ( rule__Supertype__Group_2__0 )*
            {
             before(grammarAccess.getSupertypeAccess().getGroup_2()); 
            // InternalMyDsl.g:1665:2: ( rule__Supertype__Group_2__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==29) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMyDsl.g:1665:3: rule__Supertype__Group_2__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Supertype__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getSupertypeAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Supertype__Group__2__Impl"


    // $ANTLR start "rule__Supertype__Group_2__0"
    // InternalMyDsl.g:1674:1: rule__Supertype__Group_2__0 : rule__Supertype__Group_2__0__Impl rule__Supertype__Group_2__1 ;
    public final void rule__Supertype__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1678:1: ( rule__Supertype__Group_2__0__Impl rule__Supertype__Group_2__1 )
            // InternalMyDsl.g:1679:2: rule__Supertype__Group_2__0__Impl rule__Supertype__Group_2__1
            {
            pushFollow(FOLLOW_4);
            rule__Supertype__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Supertype__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Supertype__Group_2__0"


    // $ANTLR start "rule__Supertype__Group_2__0__Impl"
    // InternalMyDsl.g:1686:1: rule__Supertype__Group_2__0__Impl : ( ',' ) ;
    public final void rule__Supertype__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1690:1: ( ( ',' ) )
            // InternalMyDsl.g:1691:1: ( ',' )
            {
            // InternalMyDsl.g:1691:1: ( ',' )
            // InternalMyDsl.g:1692:2: ','
            {
             before(grammarAccess.getSupertypeAccess().getCommaKeyword_2_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getSupertypeAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Supertype__Group_2__0__Impl"


    // $ANTLR start "rule__Supertype__Group_2__1"
    // InternalMyDsl.g:1701:1: rule__Supertype__Group_2__1 : rule__Supertype__Group_2__1__Impl ;
    public final void rule__Supertype__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1705:1: ( rule__Supertype__Group_2__1__Impl )
            // InternalMyDsl.g:1706:2: rule__Supertype__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Supertype__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Supertype__Group_2__1"


    // $ANTLR start "rule__Supertype__Group_2__1__Impl"
    // InternalMyDsl.g:1712:1: rule__Supertype__Group_2__1__Impl : ( ( rule__Supertype__SuperTypeAssignment_2_1 ) ) ;
    public final void rule__Supertype__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1716:1: ( ( ( rule__Supertype__SuperTypeAssignment_2_1 ) ) )
            // InternalMyDsl.g:1717:1: ( ( rule__Supertype__SuperTypeAssignment_2_1 ) )
            {
            // InternalMyDsl.g:1717:1: ( ( rule__Supertype__SuperTypeAssignment_2_1 ) )
            // InternalMyDsl.g:1718:2: ( rule__Supertype__SuperTypeAssignment_2_1 )
            {
             before(grammarAccess.getSupertypeAccess().getSuperTypeAssignment_2_1()); 
            // InternalMyDsl.g:1719:2: ( rule__Supertype__SuperTypeAssignment_2_1 )
            // InternalMyDsl.g:1719:3: rule__Supertype__SuperTypeAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Supertype__SuperTypeAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSupertypeAccess().getSuperTypeAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Supertype__Group_2__1__Impl"


    // $ANTLR start "rule__TypeDeclaration__Group__0"
    // InternalMyDsl.g:1728:1: rule__TypeDeclaration__Group__0 : rule__TypeDeclaration__Group__0__Impl rule__TypeDeclaration__Group__1 ;
    public final void rule__TypeDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1732:1: ( rule__TypeDeclaration__Group__0__Impl rule__TypeDeclaration__Group__1 )
            // InternalMyDsl.g:1733:2: rule__TypeDeclaration__Group__0__Impl rule__TypeDeclaration__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__TypeDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeDeclaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDeclaration__Group__0"


    // $ANTLR start "rule__TypeDeclaration__Group__0__Impl"
    // InternalMyDsl.g:1740:1: rule__TypeDeclaration__Group__0__Impl : ( ( rule__TypeDeclaration__TypeNameAssignment_0 ) ) ;
    public final void rule__TypeDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1744:1: ( ( ( rule__TypeDeclaration__TypeNameAssignment_0 ) ) )
            // InternalMyDsl.g:1745:1: ( ( rule__TypeDeclaration__TypeNameAssignment_0 ) )
            {
            // InternalMyDsl.g:1745:1: ( ( rule__TypeDeclaration__TypeNameAssignment_0 ) )
            // InternalMyDsl.g:1746:2: ( rule__TypeDeclaration__TypeNameAssignment_0 )
            {
             before(grammarAccess.getTypeDeclarationAccess().getTypeNameAssignment_0()); 
            // InternalMyDsl.g:1747:2: ( rule__TypeDeclaration__TypeNameAssignment_0 )
            // InternalMyDsl.g:1747:3: rule__TypeDeclaration__TypeNameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__TypeDeclaration__TypeNameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTypeDeclarationAccess().getTypeNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDeclaration__Group__0__Impl"


    // $ANTLR start "rule__TypeDeclaration__Group__1"
    // InternalMyDsl.g:1755:1: rule__TypeDeclaration__Group__1 : rule__TypeDeclaration__Group__1__Impl ;
    public final void rule__TypeDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1759:1: ( rule__TypeDeclaration__Group__1__Impl )
            // InternalMyDsl.g:1760:2: rule__TypeDeclaration__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TypeDeclaration__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDeclaration__Group__1"


    // $ANTLR start "rule__TypeDeclaration__Group__1__Impl"
    // InternalMyDsl.g:1766:1: rule__TypeDeclaration__Group__1__Impl : ( ( rule__TypeDeclaration__ContextAssignment_1 ) ) ;
    public final void rule__TypeDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1770:1: ( ( ( rule__TypeDeclaration__ContextAssignment_1 ) ) )
            // InternalMyDsl.g:1771:1: ( ( rule__TypeDeclaration__ContextAssignment_1 ) )
            {
            // InternalMyDsl.g:1771:1: ( ( rule__TypeDeclaration__ContextAssignment_1 ) )
            // InternalMyDsl.g:1772:2: ( rule__TypeDeclaration__ContextAssignment_1 )
            {
             before(grammarAccess.getTypeDeclarationAccess().getContextAssignment_1()); 
            // InternalMyDsl.g:1773:2: ( rule__TypeDeclaration__ContextAssignment_1 )
            // InternalMyDsl.g:1773:3: rule__TypeDeclaration__ContextAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TypeDeclaration__ContextAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTypeDeclarationAccess().getContextAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDeclaration__Group__1__Impl"


    // $ANTLR start "rule__ConstructedType__Group__0"
    // InternalMyDsl.g:1782:1: rule__ConstructedType__Group__0 : rule__ConstructedType__Group__0__Impl rule__ConstructedType__Group__1 ;
    public final void rule__ConstructedType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1786:1: ( rule__ConstructedType__Group__0__Impl rule__ConstructedType__Group__1 )
            // InternalMyDsl.g:1787:2: rule__ConstructedType__Group__0__Impl rule__ConstructedType__Group__1
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
    // InternalMyDsl.g:1794:1: rule__ConstructedType__Group__0__Impl : ( ( rule__ConstructedType__TypeAssignment_0 ) ) ;
    public final void rule__ConstructedType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1798:1: ( ( ( rule__ConstructedType__TypeAssignment_0 ) ) )
            // InternalMyDsl.g:1799:1: ( ( rule__ConstructedType__TypeAssignment_0 ) )
            {
            // InternalMyDsl.g:1799:1: ( ( rule__ConstructedType__TypeAssignment_0 ) )
            // InternalMyDsl.g:1800:2: ( rule__ConstructedType__TypeAssignment_0 )
            {
             before(grammarAccess.getConstructedTypeAccess().getTypeAssignment_0()); 
            // InternalMyDsl.g:1801:2: ( rule__ConstructedType__TypeAssignment_0 )
            // InternalMyDsl.g:1801:3: rule__ConstructedType__TypeAssignment_0
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
    // InternalMyDsl.g:1809:1: rule__ConstructedType__Group__1 : rule__ConstructedType__Group__1__Impl ;
    public final void rule__ConstructedType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1813:1: ( rule__ConstructedType__Group__1__Impl )
            // InternalMyDsl.g:1814:2: rule__ConstructedType__Group__1__Impl
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
    // InternalMyDsl.g:1820:1: rule__ConstructedType__Group__1__Impl : ( ( rule__ConstructedType__Group_1__0 )? ) ;
    public final void rule__ConstructedType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1824:1: ( ( ( rule__ConstructedType__Group_1__0 )? ) )
            // InternalMyDsl.g:1825:1: ( ( rule__ConstructedType__Group_1__0 )? )
            {
            // InternalMyDsl.g:1825:1: ( ( rule__ConstructedType__Group_1__0 )? )
            // InternalMyDsl.g:1826:2: ( rule__ConstructedType__Group_1__0 )?
            {
             before(grammarAccess.getConstructedTypeAccess().getGroup_1()); 
            // InternalMyDsl.g:1827:2: ( rule__ConstructedType__Group_1__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=11 && LA14_0<=20)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMyDsl.g:1827:3: rule__ConstructedType__Group_1__0
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
    // InternalMyDsl.g:1836:1: rule__ConstructedType__Group_1__0 : rule__ConstructedType__Group_1__0__Impl rule__ConstructedType__Group_1__1 ;
    public final void rule__ConstructedType__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1840:1: ( rule__ConstructedType__Group_1__0__Impl rule__ConstructedType__Group_1__1 )
            // InternalMyDsl.g:1841:2: rule__ConstructedType__Group_1__0__Impl rule__ConstructedType__Group_1__1
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
    // InternalMyDsl.g:1848:1: rule__ConstructedType__Group_1__0__Impl : ( ( rule__ConstructedType__Alternatives_1_0 ) ) ;
    public final void rule__ConstructedType__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1852:1: ( ( ( rule__ConstructedType__Alternatives_1_0 ) ) )
            // InternalMyDsl.g:1853:1: ( ( rule__ConstructedType__Alternatives_1_0 ) )
            {
            // InternalMyDsl.g:1853:1: ( ( rule__ConstructedType__Alternatives_1_0 ) )
            // InternalMyDsl.g:1854:2: ( rule__ConstructedType__Alternatives_1_0 )
            {
             before(grammarAccess.getConstructedTypeAccess().getAlternatives_1_0()); 
            // InternalMyDsl.g:1855:2: ( rule__ConstructedType__Alternatives_1_0 )
            // InternalMyDsl.g:1855:3: rule__ConstructedType__Alternatives_1_0
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
    // InternalMyDsl.g:1863:1: rule__ConstructedType__Group_1__1 : rule__ConstructedType__Group_1__1__Impl ;
    public final void rule__ConstructedType__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1867:1: ( rule__ConstructedType__Group_1__1__Impl )
            // InternalMyDsl.g:1868:2: rule__ConstructedType__Group_1__1__Impl
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
    // InternalMyDsl.g:1874:1: rule__ConstructedType__Group_1__1__Impl : ( ( rule__ConstructedType__TypeAssignment_1_1 ) ) ;
    public final void rule__ConstructedType__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1878:1: ( ( ( rule__ConstructedType__TypeAssignment_1_1 ) ) )
            // InternalMyDsl.g:1879:1: ( ( rule__ConstructedType__TypeAssignment_1_1 ) )
            {
            // InternalMyDsl.g:1879:1: ( ( rule__ConstructedType__TypeAssignment_1_1 ) )
            // InternalMyDsl.g:1880:2: ( rule__ConstructedType__TypeAssignment_1_1 )
            {
             before(grammarAccess.getConstructedTypeAccess().getTypeAssignment_1_1()); 
            // InternalMyDsl.g:1881:2: ( rule__ConstructedType__TypeAssignment_1_1 )
            // InternalMyDsl.g:1881:3: rule__ConstructedType__TypeAssignment_1_1
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
    // InternalMyDsl.g:1890:1: rule__TypeConstructor__Group__0 : rule__TypeConstructor__Group__0__Impl rule__TypeConstructor__Group__1 ;
    public final void rule__TypeConstructor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1894:1: ( rule__TypeConstructor__Group__0__Impl rule__TypeConstructor__Group__1 )
            // InternalMyDsl.g:1895:2: rule__TypeConstructor__Group__0__Impl rule__TypeConstructor__Group__1
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
    // InternalMyDsl.g:1902:1: rule__TypeConstructor__Group__0__Impl : ( ( rule__TypeConstructor__TypeNameAssignment_0 ) ) ;
    public final void rule__TypeConstructor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1906:1: ( ( ( rule__TypeConstructor__TypeNameAssignment_0 ) ) )
            // InternalMyDsl.g:1907:1: ( ( rule__TypeConstructor__TypeNameAssignment_0 ) )
            {
            // InternalMyDsl.g:1907:1: ( ( rule__TypeConstructor__TypeNameAssignment_0 ) )
            // InternalMyDsl.g:1908:2: ( rule__TypeConstructor__TypeNameAssignment_0 )
            {
             before(grammarAccess.getTypeConstructorAccess().getTypeNameAssignment_0()); 
            // InternalMyDsl.g:1909:2: ( rule__TypeConstructor__TypeNameAssignment_0 )
            // InternalMyDsl.g:1909:3: rule__TypeConstructor__TypeNameAssignment_0
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
    // InternalMyDsl.g:1917:1: rule__TypeConstructor__Group__1 : rule__TypeConstructor__Group__1__Impl ;
    public final void rule__TypeConstructor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1921:1: ( rule__TypeConstructor__Group__1__Impl )
            // InternalMyDsl.g:1922:2: rule__TypeConstructor__Group__1__Impl
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
    // InternalMyDsl.g:1928:1: rule__TypeConstructor__Group__1__Impl : ( ( rule__TypeConstructor__ContextAssignment_1 )? ) ;
    public final void rule__TypeConstructor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1932:1: ( ( ( rule__TypeConstructor__ContextAssignment_1 )? ) )
            // InternalMyDsl.g:1933:1: ( ( rule__TypeConstructor__ContextAssignment_1 )? )
            {
            // InternalMyDsl.g:1933:1: ( ( rule__TypeConstructor__ContextAssignment_1 )? )
            // InternalMyDsl.g:1934:2: ( rule__TypeConstructor__ContextAssignment_1 )?
            {
             before(grammarAccess.getTypeConstructorAccess().getContextAssignment_1()); 
            // InternalMyDsl.g:1935:2: ( rule__TypeConstructor__ContextAssignment_1 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==26) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMyDsl.g:1935:3: rule__TypeConstructor__ContextAssignment_1
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
    // InternalMyDsl.g:1944:1: rule__TypeDeclContext__Group__0 : rule__TypeDeclContext__Group__0__Impl rule__TypeDeclContext__Group__1 ;
    public final void rule__TypeDeclContext__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1948:1: ( rule__TypeDeclContext__Group__0__Impl rule__TypeDeclContext__Group__1 )
            // InternalMyDsl.g:1949:2: rule__TypeDeclContext__Group__0__Impl rule__TypeDeclContext__Group__1
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
    // InternalMyDsl.g:1956:1: rule__TypeDeclContext__Group__0__Impl : ( '<' ) ;
    public final void rule__TypeDeclContext__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1960:1: ( ( '<' ) )
            // InternalMyDsl.g:1961:1: ( '<' )
            {
            // InternalMyDsl.g:1961:1: ( '<' )
            // InternalMyDsl.g:1962:2: '<'
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
    // InternalMyDsl.g:1971:1: rule__TypeDeclContext__Group__1 : rule__TypeDeclContext__Group__1__Impl rule__TypeDeclContext__Group__2 ;
    public final void rule__TypeDeclContext__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1975:1: ( rule__TypeDeclContext__Group__1__Impl rule__TypeDeclContext__Group__2 )
            // InternalMyDsl.g:1976:2: rule__TypeDeclContext__Group__1__Impl rule__TypeDeclContext__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalMyDsl.g:1983:1: rule__TypeDeclContext__Group__1__Impl : ( ( rule__TypeDeclContext__TypeNameAssignment_1 ) ) ;
    public final void rule__TypeDeclContext__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1987:1: ( ( ( rule__TypeDeclContext__TypeNameAssignment_1 ) ) )
            // InternalMyDsl.g:1988:1: ( ( rule__TypeDeclContext__TypeNameAssignment_1 ) )
            {
            // InternalMyDsl.g:1988:1: ( ( rule__TypeDeclContext__TypeNameAssignment_1 ) )
            // InternalMyDsl.g:1989:2: ( rule__TypeDeclContext__TypeNameAssignment_1 )
            {
             before(grammarAccess.getTypeDeclContextAccess().getTypeNameAssignment_1()); 
            // InternalMyDsl.g:1990:2: ( rule__TypeDeclContext__TypeNameAssignment_1 )
            // InternalMyDsl.g:1990:3: rule__TypeDeclContext__TypeNameAssignment_1
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
    // InternalMyDsl.g:1998:1: rule__TypeDeclContext__Group__2 : rule__TypeDeclContext__Group__2__Impl rule__TypeDeclContext__Group__3 ;
    public final void rule__TypeDeclContext__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2002:1: ( rule__TypeDeclContext__Group__2__Impl rule__TypeDeclContext__Group__3 )
            // InternalMyDsl.g:2003:2: rule__TypeDeclContext__Group__2__Impl rule__TypeDeclContext__Group__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalMyDsl.g:2010:1: rule__TypeDeclContext__Group__2__Impl : ( ( rule__TypeDeclContext__Group_2__0 )* ) ;
    public final void rule__TypeDeclContext__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2014:1: ( ( ( rule__TypeDeclContext__Group_2__0 )* ) )
            // InternalMyDsl.g:2015:1: ( ( rule__TypeDeclContext__Group_2__0 )* )
            {
            // InternalMyDsl.g:2015:1: ( ( rule__TypeDeclContext__Group_2__0 )* )
            // InternalMyDsl.g:2016:2: ( rule__TypeDeclContext__Group_2__0 )*
            {
             before(grammarAccess.getTypeDeclContextAccess().getGroup_2()); 
            // InternalMyDsl.g:2017:2: ( rule__TypeDeclContext__Group_2__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==29) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalMyDsl.g:2017:3: rule__TypeDeclContext__Group_2__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__TypeDeclContext__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalMyDsl.g:2025:1: rule__TypeDeclContext__Group__3 : rule__TypeDeclContext__Group__3__Impl ;
    public final void rule__TypeDeclContext__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2029:1: ( rule__TypeDeclContext__Group__3__Impl )
            // InternalMyDsl.g:2030:2: rule__TypeDeclContext__Group__3__Impl
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
    // InternalMyDsl.g:2036:1: rule__TypeDeclContext__Group__3__Impl : ( '>' ) ;
    public final void rule__TypeDeclContext__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2040:1: ( ( '>' ) )
            // InternalMyDsl.g:2041:1: ( '>' )
            {
            // InternalMyDsl.g:2041:1: ( '>' )
            // InternalMyDsl.g:2042:2: '>'
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
    // InternalMyDsl.g:2052:1: rule__TypeDeclContext__Group_2__0 : rule__TypeDeclContext__Group_2__0__Impl rule__TypeDeclContext__Group_2__1 ;
    public final void rule__TypeDeclContext__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2056:1: ( rule__TypeDeclContext__Group_2__0__Impl rule__TypeDeclContext__Group_2__1 )
            // InternalMyDsl.g:2057:2: rule__TypeDeclContext__Group_2__0__Impl rule__TypeDeclContext__Group_2__1
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
    // InternalMyDsl.g:2064:1: rule__TypeDeclContext__Group_2__0__Impl : ( ',' ) ;
    public final void rule__TypeDeclContext__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2068:1: ( ( ',' ) )
            // InternalMyDsl.g:2069:1: ( ',' )
            {
            // InternalMyDsl.g:2069:1: ( ',' )
            // InternalMyDsl.g:2070:2: ','
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
    // InternalMyDsl.g:2079:1: rule__TypeDeclContext__Group_2__1 : rule__TypeDeclContext__Group_2__1__Impl ;
    public final void rule__TypeDeclContext__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2083:1: ( rule__TypeDeclContext__Group_2__1__Impl )
            // InternalMyDsl.g:2084:2: rule__TypeDeclContext__Group_2__1__Impl
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
    // InternalMyDsl.g:2090:1: rule__TypeDeclContext__Group_2__1__Impl : ( ( rule__TypeDeclContext__TypeNameAssignment_2_1 ) ) ;
    public final void rule__TypeDeclContext__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2094:1: ( ( ( rule__TypeDeclContext__TypeNameAssignment_2_1 ) ) )
            // InternalMyDsl.g:2095:1: ( ( rule__TypeDeclContext__TypeNameAssignment_2_1 ) )
            {
            // InternalMyDsl.g:2095:1: ( ( rule__TypeDeclContext__TypeNameAssignment_2_1 ) )
            // InternalMyDsl.g:2096:2: ( rule__TypeDeclContext__TypeNameAssignment_2_1 )
            {
             before(grammarAccess.getTypeDeclContextAccess().getTypeNameAssignment_2_1()); 
            // InternalMyDsl.g:2097:2: ( rule__TypeDeclContext__TypeNameAssignment_2_1 )
            // InternalMyDsl.g:2097:3: rule__TypeDeclContext__TypeNameAssignment_2_1
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


    // $ANTLR start "rule__Datatype__Group__0"
    // InternalMyDsl.g:2106:1: rule__Datatype__Group__0 : rule__Datatype__Group__0__Impl rule__Datatype__Group__1 ;
    public final void rule__Datatype__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2110:1: ( rule__Datatype__Group__0__Impl rule__Datatype__Group__1 )
            // InternalMyDsl.g:2111:2: rule__Datatype__Group__0__Impl rule__Datatype__Group__1
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
    // InternalMyDsl.g:2118:1: rule__Datatype__Group__0__Impl : ( 'Datatype' ) ;
    public final void rule__Datatype__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2122:1: ( ( 'Datatype' ) )
            // InternalMyDsl.g:2123:1: ( 'Datatype' )
            {
            // InternalMyDsl.g:2123:1: ( 'Datatype' )
            // InternalMyDsl.g:2124:2: 'Datatype'
            {
             before(grammarAccess.getDatatypeAccess().getDatatypeKeyword_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalMyDsl.g:2133:1: rule__Datatype__Group__1 : rule__Datatype__Group__1__Impl rule__Datatype__Group__2 ;
    public final void rule__Datatype__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2137:1: ( rule__Datatype__Group__1__Impl rule__Datatype__Group__2 )
            // InternalMyDsl.g:2138:2: rule__Datatype__Group__1__Impl rule__Datatype__Group__2
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
    // InternalMyDsl.g:2145:1: rule__Datatype__Group__1__Impl : ( ( rule__Datatype__NameAssignment_1 ) ) ;
    public final void rule__Datatype__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2149:1: ( ( ( rule__Datatype__NameAssignment_1 ) ) )
            // InternalMyDsl.g:2150:1: ( ( rule__Datatype__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:2150:1: ( ( rule__Datatype__NameAssignment_1 ) )
            // InternalMyDsl.g:2151:2: ( rule__Datatype__NameAssignment_1 )
            {
             before(grammarAccess.getDatatypeAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:2152:2: ( rule__Datatype__NameAssignment_1 )
            // InternalMyDsl.g:2152:3: rule__Datatype__NameAssignment_1
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
    // InternalMyDsl.g:2160:1: rule__Datatype__Group__2 : rule__Datatype__Group__2__Impl rule__Datatype__Group__3 ;
    public final void rule__Datatype__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2164:1: ( rule__Datatype__Group__2__Impl rule__Datatype__Group__3 )
            // InternalMyDsl.g:2165:2: rule__Datatype__Group__2__Impl rule__Datatype__Group__3
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
    // InternalMyDsl.g:2172:1: rule__Datatype__Group__2__Impl : ( ( rule__Datatype__ContextAssignment_2 )? ) ;
    public final void rule__Datatype__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2176:1: ( ( ( rule__Datatype__ContextAssignment_2 )? ) )
            // InternalMyDsl.g:2177:1: ( ( rule__Datatype__ContextAssignment_2 )? )
            {
            // InternalMyDsl.g:2177:1: ( ( rule__Datatype__ContextAssignment_2 )? )
            // InternalMyDsl.g:2178:2: ( rule__Datatype__ContextAssignment_2 )?
            {
             before(grammarAccess.getDatatypeAccess().getContextAssignment_2()); 
            // InternalMyDsl.g:2179:2: ( rule__Datatype__ContextAssignment_2 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==26) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMyDsl.g:2179:3: rule__Datatype__ContextAssignment_2
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
    // InternalMyDsl.g:2187:1: rule__Datatype__Group__3 : rule__Datatype__Group__3__Impl rule__Datatype__Group__4 ;
    public final void rule__Datatype__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2191:1: ( rule__Datatype__Group__3__Impl rule__Datatype__Group__4 )
            // InternalMyDsl.g:2192:2: rule__Datatype__Group__3__Impl rule__Datatype__Group__4
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
    // InternalMyDsl.g:2199:1: rule__Datatype__Group__3__Impl : ( ( rule__Datatype__ConstructorsAssignment_3 )* ) ;
    public final void rule__Datatype__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2203:1: ( ( ( rule__Datatype__ConstructorsAssignment_3 )* ) )
            // InternalMyDsl.g:2204:1: ( ( rule__Datatype__ConstructorsAssignment_3 )* )
            {
            // InternalMyDsl.g:2204:1: ( ( rule__Datatype__ConstructorsAssignment_3 )* )
            // InternalMyDsl.g:2205:2: ( rule__Datatype__ConstructorsAssignment_3 )*
            {
             before(grammarAccess.getDatatypeAccess().getConstructorsAssignment_3()); 
            // InternalMyDsl.g:2206:2: ( rule__Datatype__ConstructorsAssignment_3 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalMyDsl.g:2206:3: rule__Datatype__ConstructorsAssignment_3
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Datatype__ConstructorsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // InternalMyDsl.g:2214:1: rule__Datatype__Group__4 : rule__Datatype__Group__4__Impl rule__Datatype__Group__5 ;
    public final void rule__Datatype__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2218:1: ( rule__Datatype__Group__4__Impl rule__Datatype__Group__5 )
            // InternalMyDsl.g:2219:2: rule__Datatype__Group__4__Impl rule__Datatype__Group__5
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
    // InternalMyDsl.g:2226:1: rule__Datatype__Group__4__Impl : ( '{' ) ;
    public final void rule__Datatype__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2230:1: ( ( '{' ) )
            // InternalMyDsl.g:2231:1: ( '{' )
            {
            // InternalMyDsl.g:2231:1: ( '{' )
            // InternalMyDsl.g:2232:2: '{'
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
    // InternalMyDsl.g:2241:1: rule__Datatype__Group__5 : rule__Datatype__Group__5__Impl rule__Datatype__Group__6 ;
    public final void rule__Datatype__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2245:1: ( rule__Datatype__Group__5__Impl rule__Datatype__Group__6 )
            // InternalMyDsl.g:2246:2: rule__Datatype__Group__5__Impl rule__Datatype__Group__6
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
    // InternalMyDsl.g:2253:1: rule__Datatype__Group__5__Impl : ( ( rule__Datatype__BodyElementsAssignment_5 )* ) ;
    public final void rule__Datatype__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2257:1: ( ( ( rule__Datatype__BodyElementsAssignment_5 )* ) )
            // InternalMyDsl.g:2258:1: ( ( rule__Datatype__BodyElementsAssignment_5 )* )
            {
            // InternalMyDsl.g:2258:1: ( ( rule__Datatype__BodyElementsAssignment_5 )* )
            // InternalMyDsl.g:2259:2: ( rule__Datatype__BodyElementsAssignment_5 )*
            {
             before(grammarAccess.getDatatypeAccess().getBodyElementsAssignment_5()); 
            // InternalMyDsl.g:2260:2: ( rule__Datatype__BodyElementsAssignment_5 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID||LA19_0==33) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalMyDsl.g:2260:3: rule__Datatype__BodyElementsAssignment_5
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Datatype__BodyElementsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // InternalMyDsl.g:2268:1: rule__Datatype__Group__6 : rule__Datatype__Group__6__Impl ;
    public final void rule__Datatype__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2272:1: ( rule__Datatype__Group__6__Impl )
            // InternalMyDsl.g:2273:2: rule__Datatype__Group__6__Impl
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
    // InternalMyDsl.g:2279:1: rule__Datatype__Group__6__Impl : ( '}' ) ;
    public final void rule__Datatype__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2283:1: ( ( '}' ) )
            // InternalMyDsl.g:2284:1: ( '}' )
            {
            // InternalMyDsl.g:2284:1: ( '}' )
            // InternalMyDsl.g:2285:2: '}'
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


    // $ANTLR start "rule__Constructor__Group__0"
    // InternalMyDsl.g:2295:1: rule__Constructor__Group__0 : rule__Constructor__Group__0__Impl rule__Constructor__Group__1 ;
    public final void rule__Constructor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2299:1: ( rule__Constructor__Group__0__Impl rule__Constructor__Group__1 )
            // InternalMyDsl.g:2300:2: rule__Constructor__Group__0__Impl rule__Constructor__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__Constructor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constructor__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor__Group__0"


    // $ANTLR start "rule__Constructor__Group__0__Impl"
    // InternalMyDsl.g:2307:1: rule__Constructor__Group__0__Impl : ( ( rule__Constructor__NameAssignment_0 ) ) ;
    public final void rule__Constructor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2311:1: ( ( ( rule__Constructor__NameAssignment_0 ) ) )
            // InternalMyDsl.g:2312:1: ( ( rule__Constructor__NameAssignment_0 ) )
            {
            // InternalMyDsl.g:2312:1: ( ( rule__Constructor__NameAssignment_0 ) )
            // InternalMyDsl.g:2313:2: ( rule__Constructor__NameAssignment_0 )
            {
             before(grammarAccess.getConstructorAccess().getNameAssignment_0()); 
            // InternalMyDsl.g:2314:2: ( rule__Constructor__NameAssignment_0 )
            // InternalMyDsl.g:2314:3: rule__Constructor__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Constructor__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getConstructorAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor__Group__0__Impl"


    // $ANTLR start "rule__Constructor__Group__1"
    // InternalMyDsl.g:2322:1: rule__Constructor__Group__1 : rule__Constructor__Group__1__Impl rule__Constructor__Group__2 ;
    public final void rule__Constructor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2326:1: ( rule__Constructor__Group__1__Impl rule__Constructor__Group__2 )
            // InternalMyDsl.g:2327:2: rule__Constructor__Group__1__Impl rule__Constructor__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__Constructor__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constructor__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor__Group__1"


    // $ANTLR start "rule__Constructor__Group__1__Impl"
    // InternalMyDsl.g:2334:1: rule__Constructor__Group__1__Impl : ( '(' ) ;
    public final void rule__Constructor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2338:1: ( ( '(' ) )
            // InternalMyDsl.g:2339:1: ( '(' )
            {
            // InternalMyDsl.g:2339:1: ( '(' )
            // InternalMyDsl.g:2340:2: '('
            {
             before(grammarAccess.getConstructorAccess().getLeftParenthesisKeyword_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getConstructorAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor__Group__1__Impl"


    // $ANTLR start "rule__Constructor__Group__2"
    // InternalMyDsl.g:2349:1: rule__Constructor__Group__2 : rule__Constructor__Group__2__Impl rule__Constructor__Group__3 ;
    public final void rule__Constructor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2353:1: ( rule__Constructor__Group__2__Impl rule__Constructor__Group__3 )
            // InternalMyDsl.g:2354:2: rule__Constructor__Group__2__Impl rule__Constructor__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__Constructor__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constructor__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor__Group__2"


    // $ANTLR start "rule__Constructor__Group__2__Impl"
    // InternalMyDsl.g:2361:1: rule__Constructor__Group__2__Impl : ( ( rule__Constructor__TypedVariablesAssignment_2 )* ) ;
    public final void rule__Constructor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2365:1: ( ( ( rule__Constructor__TypedVariablesAssignment_2 )* ) )
            // InternalMyDsl.g:2366:1: ( ( rule__Constructor__TypedVariablesAssignment_2 )* )
            {
            // InternalMyDsl.g:2366:1: ( ( rule__Constructor__TypedVariablesAssignment_2 )* )
            // InternalMyDsl.g:2367:2: ( rule__Constructor__TypedVariablesAssignment_2 )*
            {
             before(grammarAccess.getConstructorAccess().getTypedVariablesAssignment_2()); 
            // InternalMyDsl.g:2368:2: ( rule__Constructor__TypedVariablesAssignment_2 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ID) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalMyDsl.g:2368:3: rule__Constructor__TypedVariablesAssignment_2
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Constructor__TypedVariablesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getConstructorAccess().getTypedVariablesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor__Group__2__Impl"


    // $ANTLR start "rule__Constructor__Group__3"
    // InternalMyDsl.g:2376:1: rule__Constructor__Group__3 : rule__Constructor__Group__3__Impl ;
    public final void rule__Constructor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2380:1: ( rule__Constructor__Group__3__Impl )
            // InternalMyDsl.g:2381:2: rule__Constructor__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Constructor__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor__Group__3"


    // $ANTLR start "rule__Constructor__Group__3__Impl"
    // InternalMyDsl.g:2387:1: rule__Constructor__Group__3__Impl : ( ')' ) ;
    public final void rule__Constructor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2391:1: ( ( ')' ) )
            // InternalMyDsl.g:2392:1: ( ')' )
            {
            // InternalMyDsl.g:2392:1: ( ')' )
            // InternalMyDsl.g:2393:2: ')'
            {
             before(grammarAccess.getConstructorAccess().getRightParenthesisKeyword_3()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getConstructorAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor__Group__3__Impl"


    // $ANTLR start "rule__Extend__Group__0"
    // InternalMyDsl.g:2403:1: rule__Extend__Group__0 : rule__Extend__Group__0__Impl rule__Extend__Group__1 ;
    public final void rule__Extend__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2407:1: ( rule__Extend__Group__0__Impl rule__Extend__Group__1 )
            // InternalMyDsl.g:2408:2: rule__Extend__Group__0__Impl rule__Extend__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalMyDsl.g:2415:1: rule__Extend__Group__0__Impl : ( ( rule__Extend__NameAssignment_0 ) ) ;
    public final void rule__Extend__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2419:1: ( ( ( rule__Extend__NameAssignment_0 ) ) )
            // InternalMyDsl.g:2420:1: ( ( rule__Extend__NameAssignment_0 ) )
            {
            // InternalMyDsl.g:2420:1: ( ( rule__Extend__NameAssignment_0 ) )
            // InternalMyDsl.g:2421:2: ( rule__Extend__NameAssignment_0 )
            {
             before(grammarAccess.getExtendAccess().getNameAssignment_0()); 
            // InternalMyDsl.g:2422:2: ( rule__Extend__NameAssignment_0 )
            // InternalMyDsl.g:2422:3: rule__Extend__NameAssignment_0
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
    // InternalMyDsl.g:2430:1: rule__Extend__Group__1 : rule__Extend__Group__1__Impl rule__Extend__Group__2 ;
    public final void rule__Extend__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2434:1: ( rule__Extend__Group__1__Impl rule__Extend__Group__2 )
            // InternalMyDsl.g:2435:2: rule__Extend__Group__1__Impl rule__Extend__Group__2
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
    // InternalMyDsl.g:2442:1: rule__Extend__Group__1__Impl : ( '(' ) ;
    public final void rule__Extend__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2446:1: ( ( '(' ) )
            // InternalMyDsl.g:2447:1: ( '(' )
            {
            // InternalMyDsl.g:2447:1: ( '(' )
            // InternalMyDsl.g:2448:2: '('
            {
             before(grammarAccess.getExtendAccess().getLeftParenthesisKeyword_1()); 
            match(input,31,FOLLOW_2); 
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
    // InternalMyDsl.g:2457:1: rule__Extend__Group__2 : rule__Extend__Group__2__Impl rule__Extend__Group__3 ;
    public final void rule__Extend__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2461:1: ( rule__Extend__Group__2__Impl rule__Extend__Group__3 )
            // InternalMyDsl.g:2462:2: rule__Extend__Group__2__Impl rule__Extend__Group__3
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
    // InternalMyDsl.g:2469:1: rule__Extend__Group__2__Impl : ( ( rule__Extend__ExtesnionAssignment_2 ) ) ;
    public final void rule__Extend__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2473:1: ( ( ( rule__Extend__ExtesnionAssignment_2 ) ) )
            // InternalMyDsl.g:2474:1: ( ( rule__Extend__ExtesnionAssignment_2 ) )
            {
            // InternalMyDsl.g:2474:1: ( ( rule__Extend__ExtesnionAssignment_2 ) )
            // InternalMyDsl.g:2475:2: ( rule__Extend__ExtesnionAssignment_2 )
            {
             before(grammarAccess.getExtendAccess().getExtesnionAssignment_2()); 
            // InternalMyDsl.g:2476:2: ( rule__Extend__ExtesnionAssignment_2 )
            // InternalMyDsl.g:2476:3: rule__Extend__ExtesnionAssignment_2
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
    // InternalMyDsl.g:2484:1: rule__Extend__Group__3 : rule__Extend__Group__3__Impl rule__Extend__Group__4 ;
    public final void rule__Extend__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2488:1: ( rule__Extend__Group__3__Impl rule__Extend__Group__4 )
            // InternalMyDsl.g:2489:2: rule__Extend__Group__3__Impl rule__Extend__Group__4
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
    // InternalMyDsl.g:2496:1: rule__Extend__Group__3__Impl : ( ')' ) ;
    public final void rule__Extend__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2500:1: ( ( ')' ) )
            // InternalMyDsl.g:2501:1: ( ')' )
            {
            // InternalMyDsl.g:2501:1: ( ')' )
            // InternalMyDsl.g:2502:2: ')'
            {
             before(grammarAccess.getExtendAccess().getRightParenthesisKeyword_3()); 
            match(input,32,FOLLOW_2); 
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
    // InternalMyDsl.g:2511:1: rule__Extend__Group__4 : rule__Extend__Group__4__Impl rule__Extend__Group__5 ;
    public final void rule__Extend__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2515:1: ( rule__Extend__Group__4__Impl rule__Extend__Group__5 )
            // InternalMyDsl.g:2516:2: rule__Extend__Group__4__Impl rule__Extend__Group__5
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
    // InternalMyDsl.g:2523:1: rule__Extend__Group__4__Impl : ( '{' ) ;
    public final void rule__Extend__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2527:1: ( ( '{' ) )
            // InternalMyDsl.g:2528:1: ( '{' )
            {
            // InternalMyDsl.g:2528:1: ( '{' )
            // InternalMyDsl.g:2529:2: '{'
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
    // InternalMyDsl.g:2538:1: rule__Extend__Group__5 : rule__Extend__Group__5__Impl rule__Extend__Group__6 ;
    public final void rule__Extend__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2542:1: ( rule__Extend__Group__5__Impl rule__Extend__Group__6 )
            // InternalMyDsl.g:2543:2: rule__Extend__Group__5__Impl rule__Extend__Group__6
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
    // InternalMyDsl.g:2550:1: rule__Extend__Group__5__Impl : ( ( rule__Extend__BodyElementsAssignment_5 )* ) ;
    public final void rule__Extend__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2554:1: ( ( ( rule__Extend__BodyElementsAssignment_5 )* ) )
            // InternalMyDsl.g:2555:1: ( ( rule__Extend__BodyElementsAssignment_5 )* )
            {
            // InternalMyDsl.g:2555:1: ( ( rule__Extend__BodyElementsAssignment_5 )* )
            // InternalMyDsl.g:2556:2: ( rule__Extend__BodyElementsAssignment_5 )*
            {
             before(grammarAccess.getExtendAccess().getBodyElementsAssignment_5()); 
            // InternalMyDsl.g:2557:2: ( rule__Extend__BodyElementsAssignment_5 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_ID||LA21_0==33) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalMyDsl.g:2557:3: rule__Extend__BodyElementsAssignment_5
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
    // InternalMyDsl.g:2565:1: rule__Extend__Group__6 : rule__Extend__Group__6__Impl ;
    public final void rule__Extend__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2569:1: ( rule__Extend__Group__6__Impl )
            // InternalMyDsl.g:2570:2: rule__Extend__Group__6__Impl
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
    // InternalMyDsl.g:2576:1: rule__Extend__Group__6__Impl : ( '}' ) ;
    public final void rule__Extend__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2580:1: ( ( '}' ) )
            // InternalMyDsl.g:2581:1: ( '}' )
            {
            // InternalMyDsl.g:2581:1: ( '}' )
            // InternalMyDsl.g:2582:2: '}'
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
    // InternalMyDsl.g:2592:1: rule__FunctionDecl__Group__0 : rule__FunctionDecl__Group__0__Impl rule__FunctionDecl__Group__1 ;
    public final void rule__FunctionDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2596:1: ( rule__FunctionDecl__Group__0__Impl rule__FunctionDecl__Group__1 )
            // InternalMyDsl.g:2597:2: rule__FunctionDecl__Group__0__Impl rule__FunctionDecl__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalMyDsl.g:2604:1: rule__FunctionDecl__Group__0__Impl : ( ( rule__FunctionDecl__NameAssignment_0 ) ) ;
    public final void rule__FunctionDecl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2608:1: ( ( ( rule__FunctionDecl__NameAssignment_0 ) ) )
            // InternalMyDsl.g:2609:1: ( ( rule__FunctionDecl__NameAssignment_0 ) )
            {
            // InternalMyDsl.g:2609:1: ( ( rule__FunctionDecl__NameAssignment_0 ) )
            // InternalMyDsl.g:2610:2: ( rule__FunctionDecl__NameAssignment_0 )
            {
             before(grammarAccess.getFunctionDeclAccess().getNameAssignment_0()); 
            // InternalMyDsl.g:2611:2: ( rule__FunctionDecl__NameAssignment_0 )
            // InternalMyDsl.g:2611:3: rule__FunctionDecl__NameAssignment_0
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
    // InternalMyDsl.g:2619:1: rule__FunctionDecl__Group__1 : rule__FunctionDecl__Group__1__Impl rule__FunctionDecl__Group__2 ;
    public final void rule__FunctionDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2623:1: ( rule__FunctionDecl__Group__1__Impl rule__FunctionDecl__Group__2 )
            // InternalMyDsl.g:2624:2: rule__FunctionDecl__Group__1__Impl rule__FunctionDecl__Group__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalMyDsl.g:2631:1: rule__FunctionDecl__Group__1__Impl : ( '(' ) ;
    public final void rule__FunctionDecl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2635:1: ( ( '(' ) )
            // InternalMyDsl.g:2636:1: ( '(' )
            {
            // InternalMyDsl.g:2636:1: ( '(' )
            // InternalMyDsl.g:2637:2: '('
            {
             before(grammarAccess.getFunctionDeclAccess().getLeftParenthesisKeyword_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getFunctionDeclAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
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
    // InternalMyDsl.g:2646:1: rule__FunctionDecl__Group__2 : rule__FunctionDecl__Group__2__Impl rule__FunctionDecl__Group__3 ;
    public final void rule__FunctionDecl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2650:1: ( rule__FunctionDecl__Group__2__Impl rule__FunctionDecl__Group__3 )
            // InternalMyDsl.g:2651:2: rule__FunctionDecl__Group__2__Impl rule__FunctionDecl__Group__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalMyDsl.g:2658:1: rule__FunctionDecl__Group__2__Impl : ( ( rule__FunctionDecl__TypeVariablesAssignment_2 )* ) ;
    public final void rule__FunctionDecl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2662:1: ( ( ( rule__FunctionDecl__TypeVariablesAssignment_2 )* ) )
            // InternalMyDsl.g:2663:1: ( ( rule__FunctionDecl__TypeVariablesAssignment_2 )* )
            {
            // InternalMyDsl.g:2663:1: ( ( rule__FunctionDecl__TypeVariablesAssignment_2 )* )
            // InternalMyDsl.g:2664:2: ( rule__FunctionDecl__TypeVariablesAssignment_2 )*
            {
             before(grammarAccess.getFunctionDeclAccess().getTypeVariablesAssignment_2()); 
            // InternalMyDsl.g:2665:2: ( rule__FunctionDecl__TypeVariablesAssignment_2 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_ID) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalMyDsl.g:2665:3: rule__FunctionDecl__TypeVariablesAssignment_2
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__FunctionDecl__TypeVariablesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getFunctionDeclAccess().getTypeVariablesAssignment_2()); 

            }


            }

        }
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
    // InternalMyDsl.g:2673:1: rule__FunctionDecl__Group__3 : rule__FunctionDecl__Group__3__Impl ;
    public final void rule__FunctionDecl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2677:1: ( rule__FunctionDecl__Group__3__Impl )
            // InternalMyDsl.g:2678:2: rule__FunctionDecl__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FunctionDecl__Group__3__Impl();

            state._fsp--;


            }

        }
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
    // InternalMyDsl.g:2684:1: rule__FunctionDecl__Group__3__Impl : ( ')' ) ;
    public final void rule__FunctionDecl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2688:1: ( ( ')' ) )
            // InternalMyDsl.g:2689:1: ( ')' )
            {
            // InternalMyDsl.g:2689:1: ( ')' )
            // InternalMyDsl.g:2690:2: ')'
            {
             before(grammarAccess.getFunctionDeclAccess().getRightParenthesisKeyword_3()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getFunctionDeclAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__TheoremBody__Group__0"
    // InternalMyDsl.g:2700:1: rule__TheoremBody__Group__0 : rule__TheoremBody__Group__0__Impl rule__TheoremBody__Group__1 ;
    public final void rule__TheoremBody__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2704:1: ( rule__TheoremBody__Group__0__Impl rule__TheoremBody__Group__1 )
            // InternalMyDsl.g:2705:2: rule__TheoremBody__Group__0__Impl rule__TheoremBody__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalMyDsl.g:2712:1: rule__TheoremBody__Group__0__Impl : ( 'Theorems' ) ;
    public final void rule__TheoremBody__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2716:1: ( ( 'Theorems' ) )
            // InternalMyDsl.g:2717:1: ( 'Theorems' )
            {
            // InternalMyDsl.g:2717:1: ( 'Theorems' )
            // InternalMyDsl.g:2718:2: 'Theorems'
            {
             before(grammarAccess.getTheoremBodyAccess().getTheoremsKeyword_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalMyDsl.g:2727:1: rule__TheoremBody__Group__1 : rule__TheoremBody__Group__1__Impl rule__TheoremBody__Group__2 ;
    public final void rule__TheoremBody__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2731:1: ( rule__TheoremBody__Group__1__Impl rule__TheoremBody__Group__2 )
            // InternalMyDsl.g:2732:2: rule__TheoremBody__Group__1__Impl rule__TheoremBody__Group__2
            {
            pushFollow(FOLLOW_23);
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
    // InternalMyDsl.g:2739:1: rule__TheoremBody__Group__1__Impl : ( '{' ) ;
    public final void rule__TheoremBody__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2743:1: ( ( '{' ) )
            // InternalMyDsl.g:2744:1: ( '{' )
            {
            // InternalMyDsl.g:2744:1: ( '{' )
            // InternalMyDsl.g:2745:2: '{'
            {
             before(grammarAccess.getTheoremBodyAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,24,FOLLOW_2); 
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
    // InternalMyDsl.g:2754:1: rule__TheoremBody__Group__2 : rule__TheoremBody__Group__2__Impl ;
    public final void rule__TheoremBody__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2758:1: ( rule__TheoremBody__Group__2__Impl )
            // InternalMyDsl.g:2759:2: rule__TheoremBody__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TheoremBody__Group__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalMyDsl.g:2765:1: rule__TheoremBody__Group__2__Impl : ( '}' ) ;
    public final void rule__TheoremBody__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2769:1: ( ( '}' ) )
            // InternalMyDsl.g:2770:1: ( '}' )
            {
            // InternalMyDsl.g:2770:1: ( '}' )
            // InternalMyDsl.g:2771:2: '}'
            {
             before(grammarAccess.getTheoremBodyAccess().getRightCurlyBracketKeyword_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getTheoremBodyAccess().getRightCurlyBracketKeyword_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__DomainModel__ElementsAssignment"
    // InternalMyDsl.g:2781:1: rule__DomainModel__ElementsAssignment : ( ruleTopLevel ) ;
    public final void rule__DomainModel__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2785:1: ( ( ruleTopLevel ) )
            // InternalMyDsl.g:2786:2: ( ruleTopLevel )
            {
            // InternalMyDsl.g:2786:2: ( ruleTopLevel )
            // InternalMyDsl.g:2787:3: ruleTopLevel
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
    // InternalMyDsl.g:2796:1: rule__ImportStatement__ImportsAssignment_1 : ( ruleImport ) ;
    public final void rule__ImportStatement__ImportsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2800:1: ( ( ruleImport ) )
            // InternalMyDsl.g:2801:2: ( ruleImport )
            {
            // InternalMyDsl.g:2801:2: ( ruleImport )
            // InternalMyDsl.g:2802:3: ruleImport
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
    // InternalMyDsl.g:2811:1: rule__Import__ImportNameAssignment_0 : ( ruleImportComponent ) ;
    public final void rule__Import__ImportNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2815:1: ( ( ruleImportComponent ) )
            // InternalMyDsl.g:2816:2: ( ruleImportComponent )
            {
            // InternalMyDsl.g:2816:2: ( ruleImportComponent )
            // InternalMyDsl.g:2817:3: ruleImportComponent
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
    // InternalMyDsl.g:2826:1: rule__Import__ImportNameAssignment_1_1 : ( ruleImportComponent ) ;
    public final void rule__Import__ImportNameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2830:1: ( ( ruleImportComponent ) )
            // InternalMyDsl.g:2831:2: ( ruleImportComponent )
            {
            // InternalMyDsl.g:2831:2: ( ruleImportComponent )
            // InternalMyDsl.g:2832:3: ruleImportComponent
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
    // InternalMyDsl.g:2841:1: rule__ImportComponent__NameAssignment : ( RULE_ID ) ;
    public final void rule__ImportComponent__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2845:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:2846:2: ( RULE_ID )
            {
            // InternalMyDsl.g:2846:2: ( RULE_ID )
            // InternalMyDsl.g:2847:3: RULE_ID
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
    // InternalMyDsl.g:2856:1: rule__Class__TypeNameAssignment_1 : ( ruleTypeName ) ;
    public final void rule__Class__TypeNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2860:1: ( ( ruleTypeName ) )
            // InternalMyDsl.g:2861:2: ( ruleTypeName )
            {
            // InternalMyDsl.g:2861:2: ( ruleTypeName )
            // InternalMyDsl.g:2862:3: ruleTypeName
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
    // InternalMyDsl.g:2871:1: rule__Class__ContextAssignment_2 : ( rulePolyContext ) ;
    public final void rule__Class__ContextAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2875:1: ( ( rulePolyContext ) )
            // InternalMyDsl.g:2876:2: ( rulePolyContext )
            {
            // InternalMyDsl.g:2876:2: ( rulePolyContext )
            // InternalMyDsl.g:2877:3: rulePolyContext
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
    // InternalMyDsl.g:2886:1: rule__Class__SupertypesAssignment_3 : ( ruleSupertype ) ;
    public final void rule__Class__SupertypesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2890:1: ( ( ruleSupertype ) )
            // InternalMyDsl.g:2891:2: ( ruleSupertype )
            {
            // InternalMyDsl.g:2891:2: ( ruleSupertype )
            // InternalMyDsl.g:2892:3: ruleSupertype
            {
             before(grammarAccess.getClassAccess().getSupertypesSupertypeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleSupertype();

            state._fsp--;

             after(grammarAccess.getClassAccess().getSupertypesSupertypeParserRuleCall_3_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__Class__BodyElementsAssignment_5"
    // InternalMyDsl.g:2901:1: rule__Class__BodyElementsAssignment_5 : ( ruleTypeBodyElements ) ;
    public final void rule__Class__BodyElementsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2905:1: ( ( ruleTypeBodyElements ) )
            // InternalMyDsl.g:2906:2: ( ruleTypeBodyElements )
            {
            // InternalMyDsl.g:2906:2: ( ruleTypeBodyElements )
            // InternalMyDsl.g:2907:3: ruleTypeBodyElements
            {
             before(grammarAccess.getClassAccess().getBodyElementsTypeBodyElementsParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleTypeBodyElements();

            state._fsp--;

             after(grammarAccess.getClassAccess().getBodyElementsTypeBodyElementsParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__BodyElementsAssignment_5"


    // $ANTLR start "rule__TypeName__NameAssignment"
    // InternalMyDsl.g:2916:1: rule__TypeName__NameAssignment : ( RULE_ID ) ;
    public final void rule__TypeName__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2920:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:2921:2: ( RULE_ID )
            {
            // InternalMyDsl.g:2921:2: ( RULE_ID )
            // InternalMyDsl.g:2922:3: RULE_ID
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
    // InternalMyDsl.g:2931:1: rule__PolymorphicTypeName__NameAssignment : ( RULE_ID ) ;
    public final void rule__PolymorphicTypeName__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2935:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:2936:2: ( RULE_ID )
            {
            // InternalMyDsl.g:2936:2: ( RULE_ID )
            // InternalMyDsl.g:2937:3: RULE_ID
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
    // InternalMyDsl.g:2946:1: rule__PolyContext__PolyTypesAssignment_1 : ( rulePolyContextTypes ) ;
    public final void rule__PolyContext__PolyTypesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2950:1: ( ( rulePolyContextTypes ) )
            // InternalMyDsl.g:2951:2: ( rulePolyContextTypes )
            {
            // InternalMyDsl.g:2951:2: ( rulePolyContextTypes )
            // InternalMyDsl.g:2952:3: rulePolyContextTypes
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
    // InternalMyDsl.g:2961:1: rule__PolyContextTypes__NameAssignment_0 : ( rulePolymorphicTypeName ) ;
    public final void rule__PolyContextTypes__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2965:1: ( ( rulePolymorphicTypeName ) )
            // InternalMyDsl.g:2966:2: ( rulePolymorphicTypeName )
            {
            // InternalMyDsl.g:2966:2: ( rulePolymorphicTypeName )
            // InternalMyDsl.g:2967:3: rulePolymorphicTypeName
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
    // InternalMyDsl.g:2976:1: rule__PolyContextTypes__ConstraintsAssignment_1 : ( ruleTypeConstraints ) ;
    public final void rule__PolyContextTypes__ConstraintsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2980:1: ( ( ruleTypeConstraints ) )
            // InternalMyDsl.g:2981:2: ( ruleTypeConstraints )
            {
            // InternalMyDsl.g:2981:2: ( ruleTypeConstraints )
            // InternalMyDsl.g:2982:3: ruleTypeConstraints
            {
             before(grammarAccess.getPolyContextTypesAccess().getConstraintsTypeConstraintsParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTypeConstraints();

            state._fsp--;

             after(grammarAccess.getPolyContextTypesAccess().getConstraintsTypeConstraintsParserRuleCall_1_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__TypeConstraints__TypeNameAssignment_1"
    // InternalMyDsl.g:2991:1: rule__TypeConstraints__TypeNameAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__TypeConstraints__TypeNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2995:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:2996:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:2996:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:2997:3: ( RULE_ID )
            {
             before(grammarAccess.getTypeConstraintsAccess().getTypeNameTypeNameCrossReference_1_0()); 
            // InternalMyDsl.g:2998:3: ( RULE_ID )
            // InternalMyDsl.g:2999:4: RULE_ID
            {
             before(grammarAccess.getTypeConstraintsAccess().getTypeNameTypeNameIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTypeConstraintsAccess().getTypeNameTypeNameIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getTypeConstraintsAccess().getTypeNameTypeNameCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeConstraints__TypeNameAssignment_1"


    // $ANTLR start "rule__TypeConstraints__TypeNameAssignment_2_1"
    // InternalMyDsl.g:3010:1: rule__TypeConstraints__TypeNameAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__TypeConstraints__TypeNameAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3014:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:3015:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:3015:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:3016:3: ( RULE_ID )
            {
             before(grammarAccess.getTypeConstraintsAccess().getTypeNameTypeNameCrossReference_2_1_0()); 
            // InternalMyDsl.g:3017:3: ( RULE_ID )
            // InternalMyDsl.g:3018:4: RULE_ID
            {
             before(grammarAccess.getTypeConstraintsAccess().getTypeNameTypeNameIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTypeConstraintsAccess().getTypeNameTypeNameIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getTypeConstraintsAccess().getTypeNameTypeNameCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeConstraints__TypeNameAssignment_2_1"


    // $ANTLR start "rule__TypedVariable__NameAssignment_0"
    // InternalMyDsl.g:3029:1: rule__TypedVariable__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__TypedVariable__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3033:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:3034:2: ( RULE_ID )
            {
            // InternalMyDsl.g:3034:2: ( RULE_ID )
            // InternalMyDsl.g:3035:3: RULE_ID
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


    // $ANTLR start "rule__TypedVariable__ConstraintsAssignment_1"
    // InternalMyDsl.g:3044:1: rule__TypedVariable__ConstraintsAssignment_1 : ( ruleTypeConstraints ) ;
    public final void rule__TypedVariable__ConstraintsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3048:1: ( ( ruleTypeConstraints ) )
            // InternalMyDsl.g:3049:2: ( ruleTypeConstraints )
            {
            // InternalMyDsl.g:3049:2: ( ruleTypeConstraints )
            // InternalMyDsl.g:3050:3: ruleTypeConstraints
            {
             before(grammarAccess.getTypedVariableAccess().getConstraintsTypeConstraintsParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTypeConstraints();

            state._fsp--;

             after(grammarAccess.getTypedVariableAccess().getConstraintsTypeConstraintsParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedVariable__ConstraintsAssignment_1"


    // $ANTLR start "rule__Supertype__SuperTypeAssignment_1"
    // InternalMyDsl.g:3059:1: rule__Supertype__SuperTypeAssignment_1 : ( ruleConstructedType ) ;
    public final void rule__Supertype__SuperTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3063:1: ( ( ruleConstructedType ) )
            // InternalMyDsl.g:3064:2: ( ruleConstructedType )
            {
            // InternalMyDsl.g:3064:2: ( ruleConstructedType )
            // InternalMyDsl.g:3065:3: ruleConstructedType
            {
             before(grammarAccess.getSupertypeAccess().getSuperTypeConstructedTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleConstructedType();

            state._fsp--;

             after(grammarAccess.getSupertypeAccess().getSuperTypeConstructedTypeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Supertype__SuperTypeAssignment_1"


    // $ANTLR start "rule__Supertype__SuperTypeAssignment_2_1"
    // InternalMyDsl.g:3074:1: rule__Supertype__SuperTypeAssignment_2_1 : ( ruleTypeDeclaration ) ;
    public final void rule__Supertype__SuperTypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3078:1: ( ( ruleTypeDeclaration ) )
            // InternalMyDsl.g:3079:2: ( ruleTypeDeclaration )
            {
            // InternalMyDsl.g:3079:2: ( ruleTypeDeclaration )
            // InternalMyDsl.g:3080:3: ruleTypeDeclaration
            {
             before(grammarAccess.getSupertypeAccess().getSuperTypeTypeDeclarationParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTypeDeclaration();

            state._fsp--;

             after(grammarAccess.getSupertypeAccess().getSuperTypeTypeDeclarationParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Supertype__SuperTypeAssignment_2_1"


    // $ANTLR start "rule__TypeDeclaration__TypeNameAssignment_0"
    // InternalMyDsl.g:3089:1: rule__TypeDeclaration__TypeNameAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__TypeDeclaration__TypeNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3093:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:3094:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:3094:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:3095:3: ( RULE_ID )
            {
             before(grammarAccess.getTypeDeclarationAccess().getTypeNameTypeNameCrossReference_0_0()); 
            // InternalMyDsl.g:3096:3: ( RULE_ID )
            // InternalMyDsl.g:3097:4: RULE_ID
            {
             before(grammarAccess.getTypeDeclarationAccess().getTypeNameTypeNameIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTypeDeclarationAccess().getTypeNameTypeNameIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getTypeDeclarationAccess().getTypeNameTypeNameCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDeclaration__TypeNameAssignment_0"


    // $ANTLR start "rule__TypeDeclaration__ContextAssignment_1"
    // InternalMyDsl.g:3108:1: rule__TypeDeclaration__ContextAssignment_1 : ( ruleTypeDeclContext ) ;
    public final void rule__TypeDeclaration__ContextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3112:1: ( ( ruleTypeDeclContext ) )
            // InternalMyDsl.g:3113:2: ( ruleTypeDeclContext )
            {
            // InternalMyDsl.g:3113:2: ( ruleTypeDeclContext )
            // InternalMyDsl.g:3114:3: ruleTypeDeclContext
            {
             before(grammarAccess.getTypeDeclarationAccess().getContextTypeDeclContextParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTypeDeclContext();

            state._fsp--;

             after(grammarAccess.getTypeDeclarationAccess().getContextTypeDeclContextParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDeclaration__ContextAssignment_1"


    // $ANTLR start "rule__ConstructedType__TypeAssignment_0"
    // InternalMyDsl.g:3123:1: rule__ConstructedType__TypeAssignment_0 : ( ruleTypeConstructor ) ;
    public final void rule__ConstructedType__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3127:1: ( ( ruleTypeConstructor ) )
            // InternalMyDsl.g:3128:2: ( ruleTypeConstructor )
            {
            // InternalMyDsl.g:3128:2: ( ruleTypeConstructor )
            // InternalMyDsl.g:3129:3: ruleTypeConstructor
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
    // InternalMyDsl.g:3138:1: rule__ConstructedType__TypeAssignment_1_1 : ( ruleConstructedType ) ;
    public final void rule__ConstructedType__TypeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3142:1: ( ( ruleConstructedType ) )
            // InternalMyDsl.g:3143:2: ( ruleConstructedType )
            {
            // InternalMyDsl.g:3143:2: ( ruleConstructedType )
            // InternalMyDsl.g:3144:3: ruleConstructedType
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
    // InternalMyDsl.g:3153:1: rule__TypeConstructor__TypeNameAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__TypeConstructor__TypeNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3157:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:3158:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:3158:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:3159:3: ( RULE_ID )
            {
             before(grammarAccess.getTypeConstructorAccess().getTypeNameNameCrossReference_0_0()); 
            // InternalMyDsl.g:3160:3: ( RULE_ID )
            // InternalMyDsl.g:3161:4: RULE_ID
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
    // InternalMyDsl.g:3172:1: rule__TypeConstructor__ContextAssignment_1 : ( ruleTypeDeclContext ) ;
    public final void rule__TypeConstructor__ContextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3176:1: ( ( ruleTypeDeclContext ) )
            // InternalMyDsl.g:3177:2: ( ruleTypeDeclContext )
            {
            // InternalMyDsl.g:3177:2: ( ruleTypeDeclContext )
            // InternalMyDsl.g:3178:3: ruleTypeDeclContext
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
    // InternalMyDsl.g:3187:1: rule__TypeDeclContext__TypeNameAssignment_1 : ( ruleConstructedType ) ;
    public final void rule__TypeDeclContext__TypeNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3191:1: ( ( ruleConstructedType ) )
            // InternalMyDsl.g:3192:2: ( ruleConstructedType )
            {
            // InternalMyDsl.g:3192:2: ( ruleConstructedType )
            // InternalMyDsl.g:3193:3: ruleConstructedType
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
    // InternalMyDsl.g:3202:1: rule__TypeDeclContext__TypeNameAssignment_2_1 : ( ruleConstructedType ) ;
    public final void rule__TypeDeclContext__TypeNameAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3206:1: ( ( ruleConstructedType ) )
            // InternalMyDsl.g:3207:2: ( ruleConstructedType )
            {
            // InternalMyDsl.g:3207:2: ( ruleConstructedType )
            // InternalMyDsl.g:3208:3: ruleConstructedType
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


    // $ANTLR start "rule__TypeBodyElements__FunctionsAssignment_0"
    // InternalMyDsl.g:3217:1: rule__TypeBodyElements__FunctionsAssignment_0 : ( ruleFunctionDecl ) ;
    public final void rule__TypeBodyElements__FunctionsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3221:1: ( ( ruleFunctionDecl ) )
            // InternalMyDsl.g:3222:2: ( ruleFunctionDecl )
            {
            // InternalMyDsl.g:3222:2: ( ruleFunctionDecl )
            // InternalMyDsl.g:3223:3: ruleFunctionDecl
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
    // InternalMyDsl.g:3232:1: rule__TypeBodyElements__TheoremsAssignment_1 : ( ruleTheoremBody ) ;
    public final void rule__TypeBodyElements__TheoremsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3236:1: ( ( ruleTheoremBody ) )
            // InternalMyDsl.g:3237:2: ( ruleTheoremBody )
            {
            // InternalMyDsl.g:3237:2: ( ruleTheoremBody )
            // InternalMyDsl.g:3238:3: ruleTheoremBody
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


    // $ANTLR start "rule__FunctionName__NameAssignment"
    // InternalMyDsl.g:3247:1: rule__FunctionName__NameAssignment : ( RULE_ID ) ;
    public final void rule__FunctionName__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3251:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:3252:2: ( RULE_ID )
            {
            // InternalMyDsl.g:3252:2: ( RULE_ID )
            // InternalMyDsl.g:3253:3: RULE_ID
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


    // $ANTLR start "rule__Datatype__NameAssignment_1"
    // InternalMyDsl.g:3262:1: rule__Datatype__NameAssignment_1 : ( ruleTypeName ) ;
    public final void rule__Datatype__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3266:1: ( ( ruleTypeName ) )
            // InternalMyDsl.g:3267:2: ( ruleTypeName )
            {
            // InternalMyDsl.g:3267:2: ( ruleTypeName )
            // InternalMyDsl.g:3268:3: ruleTypeName
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
    // InternalMyDsl.g:3277:1: rule__Datatype__ContextAssignment_2 : ( rulePolyContext ) ;
    public final void rule__Datatype__ContextAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3281:1: ( ( rulePolyContext ) )
            // InternalMyDsl.g:3282:2: ( rulePolyContext )
            {
            // InternalMyDsl.g:3282:2: ( rulePolyContext )
            // InternalMyDsl.g:3283:3: rulePolyContext
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
    // InternalMyDsl.g:3292:1: rule__Datatype__ConstructorsAssignment_3 : ( ruleDatatypeConstructor ) ;
    public final void rule__Datatype__ConstructorsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3296:1: ( ( ruleDatatypeConstructor ) )
            // InternalMyDsl.g:3297:2: ( ruleDatatypeConstructor )
            {
            // InternalMyDsl.g:3297:2: ( ruleDatatypeConstructor )
            // InternalMyDsl.g:3298:3: ruleDatatypeConstructor
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
    // InternalMyDsl.g:3307:1: rule__Datatype__BodyElementsAssignment_5 : ( ruleTypeBodyElements ) ;
    public final void rule__Datatype__BodyElementsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3311:1: ( ( ruleTypeBodyElements ) )
            // InternalMyDsl.g:3312:2: ( ruleTypeBodyElements )
            {
            // InternalMyDsl.g:3312:2: ( ruleTypeBodyElements )
            // InternalMyDsl.g:3313:3: ruleTypeBodyElements
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
    // InternalMyDsl.g:3322:1: rule__BaseConstructor__NameAssignment : ( RULE_ID ) ;
    public final void rule__BaseConstructor__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3326:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:3327:2: ( RULE_ID )
            {
            // InternalMyDsl.g:3327:2: ( RULE_ID )
            // InternalMyDsl.g:3328:3: RULE_ID
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


    // $ANTLR start "rule__Constructor__NameAssignment_0"
    // InternalMyDsl.g:3337:1: rule__Constructor__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Constructor__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3341:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:3342:2: ( RULE_ID )
            {
            // InternalMyDsl.g:3342:2: ( RULE_ID )
            // InternalMyDsl.g:3343:3: RULE_ID
            {
             before(grammarAccess.getConstructorAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConstructorAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor__NameAssignment_0"


    // $ANTLR start "rule__Constructor__TypedVariablesAssignment_2"
    // InternalMyDsl.g:3352:1: rule__Constructor__TypedVariablesAssignment_2 : ( ruleTypedVariable ) ;
    public final void rule__Constructor__TypedVariablesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3356:1: ( ( ruleTypedVariable ) )
            // InternalMyDsl.g:3357:2: ( ruleTypedVariable )
            {
            // InternalMyDsl.g:3357:2: ( ruleTypedVariable )
            // InternalMyDsl.g:3358:3: ruleTypedVariable
            {
             before(grammarAccess.getConstructorAccess().getTypedVariablesTypedVariableParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTypedVariable();

            state._fsp--;

             after(grammarAccess.getConstructorAccess().getTypedVariablesTypedVariableParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor__TypedVariablesAssignment_2"


    // $ANTLR start "rule__Extend__NameAssignment_0"
    // InternalMyDsl.g:3367:1: rule__Extend__NameAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Extend__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3371:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:3372:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:3372:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:3373:3: ( RULE_ID )
            {
             before(grammarAccess.getExtendAccess().getNameTypeNameCrossReference_0_0()); 
            // InternalMyDsl.g:3374:3: ( RULE_ID )
            // InternalMyDsl.g:3375:4: RULE_ID
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
    // InternalMyDsl.g:3386:1: rule__Extend__ExtesnionAssignment_2 : ( RULE_ID ) ;
    public final void rule__Extend__ExtesnionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3390:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:3391:2: ( RULE_ID )
            {
            // InternalMyDsl.g:3391:2: ( RULE_ID )
            // InternalMyDsl.g:3392:3: RULE_ID
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
    // InternalMyDsl.g:3401:1: rule__Extend__BodyElementsAssignment_5 : ( ruleTypeBodyElements ) ;
    public final void rule__Extend__BodyElementsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3405:1: ( ( ruleTypeBodyElements ) )
            // InternalMyDsl.g:3406:2: ( ruleTypeBodyElements )
            {
            // InternalMyDsl.g:3406:2: ( ruleTypeBodyElements )
            // InternalMyDsl.g:3407:3: ruleTypeBodyElements
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


    // $ANTLR start "rule__FunctionDecl__NameAssignment_0"
    // InternalMyDsl.g:3416:1: rule__FunctionDecl__NameAssignment_0 : ( ruleFunctionName ) ;
    public final void rule__FunctionDecl__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3420:1: ( ( ruleFunctionName ) )
            // InternalMyDsl.g:3421:2: ( ruleFunctionName )
            {
            // InternalMyDsl.g:3421:2: ( ruleFunctionName )
            // InternalMyDsl.g:3422:3: ruleFunctionName
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


    // $ANTLR start "rule__FunctionDecl__TypeVariablesAssignment_2"
    // InternalMyDsl.g:3431:1: rule__FunctionDecl__TypeVariablesAssignment_2 : ( ruleTypedVariable ) ;
    public final void rule__FunctionDecl__TypeVariablesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3435:1: ( ( ruleTypedVariable ) )
            // InternalMyDsl.g:3436:2: ( ruleTypedVariable )
            {
            // InternalMyDsl.g:3436:2: ( ruleTypedVariable )
            // InternalMyDsl.g:3437:3: ruleTypedVariable
            {
             before(grammarAccess.getFunctionDeclAccess().getTypeVariablesTypedVariableParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTypedVariable();

            state._fsp--;

             after(grammarAccess.getFunctionDeclAccess().getTypeVariablesTypedVariableParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDecl__TypeVariablesAssignment_2"


    // $ANTLR start "rule__Expression__NameAssignment"
    // InternalMyDsl.g:3446:1: rule__Expression__NameAssignment : ( RULE_ID ) ;
    public final void rule__Expression__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3450:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:3451:2: ( RULE_ID )
            {
            // InternalMyDsl.g:3451:2: ( RULE_ID )
            // InternalMyDsl.g:3452:3: RULE_ID
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000040A00012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000015000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000202000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000200000012L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000000001FF800L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000028000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000005000010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000100000010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000002000000L});

}