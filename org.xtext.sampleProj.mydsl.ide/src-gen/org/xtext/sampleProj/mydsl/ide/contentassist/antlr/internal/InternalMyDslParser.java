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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Import'", "'.'", "'<'", "'>'", "':'", "','", "'Class'", "'{'", "'}'", "'Datatype'", "'('", "')'", "'Theorems'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
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

                if ( (LA1_0==RULE_ID||LA1_0==11||LA1_0==17||LA1_0==20) ) {
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


    // $ANTLR start "entryRuleImportSatement"
    // InternalMyDsl.g:103:1: entryRuleImportSatement : ruleImportSatement EOF ;
    public final void entryRuleImportSatement() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleImportSatement EOF )
            // InternalMyDsl.g:105:1: ruleImportSatement EOF
            {
             before(grammarAccess.getImportSatementRule()); 
            pushFollow(FOLLOW_1);
            ruleImportSatement();

            state._fsp--;

             after(grammarAccess.getImportSatementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleImportSatement"


    // $ANTLR start "ruleImportSatement"
    // InternalMyDsl.g:112:1: ruleImportSatement : ( ( rule__ImportSatement__Group__0 ) ) ;
    public final void ruleImportSatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__ImportSatement__Group__0 ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__ImportSatement__Group__0 ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__ImportSatement__Group__0 ) )
            // InternalMyDsl.g:118:3: ( rule__ImportSatement__Group__0 )
            {
             before(grammarAccess.getImportSatementAccess().getGroup()); 
            // InternalMyDsl.g:119:3: ( rule__ImportSatement__Group__0 )
            // InternalMyDsl.g:119:4: rule__ImportSatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ImportSatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImportSatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImportSatement"


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


    // $ANTLR start "entryRulePolyContext"
    // InternalMyDsl.g:203:1: entryRulePolyContext : rulePolyContext EOF ;
    public final void entryRulePolyContext() throws RecognitionException {
        try {
            // InternalMyDsl.g:204:1: ( rulePolyContext EOF )
            // InternalMyDsl.g:205:1: rulePolyContext EOF
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
    // InternalMyDsl.g:212:1: rulePolyContext : ( ( rule__PolyContext__Group__0 ) ) ;
    public final void rulePolyContext() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:216:2: ( ( ( rule__PolyContext__Group__0 ) ) )
            // InternalMyDsl.g:217:2: ( ( rule__PolyContext__Group__0 ) )
            {
            // InternalMyDsl.g:217:2: ( ( rule__PolyContext__Group__0 ) )
            // InternalMyDsl.g:218:3: ( rule__PolyContext__Group__0 )
            {
             before(grammarAccess.getPolyContextAccess().getGroup()); 
            // InternalMyDsl.g:219:3: ( rule__PolyContext__Group__0 )
            // InternalMyDsl.g:219:4: rule__PolyContext__Group__0
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
    // InternalMyDsl.g:228:1: entryRulePolyContextTypes : rulePolyContextTypes EOF ;
    public final void entryRulePolyContextTypes() throws RecognitionException {
        try {
            // InternalMyDsl.g:229:1: ( rulePolyContextTypes EOF )
            // InternalMyDsl.g:230:1: rulePolyContextTypes EOF
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
    // InternalMyDsl.g:237:1: rulePolyContextTypes : ( ( rule__PolyContextTypes__Group__0 ) ) ;
    public final void rulePolyContextTypes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:241:2: ( ( ( rule__PolyContextTypes__Group__0 ) ) )
            // InternalMyDsl.g:242:2: ( ( rule__PolyContextTypes__Group__0 ) )
            {
            // InternalMyDsl.g:242:2: ( ( rule__PolyContextTypes__Group__0 ) )
            // InternalMyDsl.g:243:3: ( rule__PolyContextTypes__Group__0 )
            {
             before(grammarAccess.getPolyContextTypesAccess().getGroup()); 
            // InternalMyDsl.g:244:3: ( rule__PolyContextTypes__Group__0 )
            // InternalMyDsl.g:244:4: rule__PolyContextTypes__Group__0
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
    // InternalMyDsl.g:253:1: entryRuleTypeConstraints : ruleTypeConstraints EOF ;
    public final void entryRuleTypeConstraints() throws RecognitionException {
        try {
            // InternalMyDsl.g:254:1: ( ruleTypeConstraints EOF )
            // InternalMyDsl.g:255:1: ruleTypeConstraints EOF
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
    // InternalMyDsl.g:262:1: ruleTypeConstraints : ( ( rule__TypeConstraints__Group__0 ) ) ;
    public final void ruleTypeConstraints() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:266:2: ( ( ( rule__TypeConstraints__Group__0 ) ) )
            // InternalMyDsl.g:267:2: ( ( rule__TypeConstraints__Group__0 ) )
            {
            // InternalMyDsl.g:267:2: ( ( rule__TypeConstraints__Group__0 ) )
            // InternalMyDsl.g:268:3: ( rule__TypeConstraints__Group__0 )
            {
             before(grammarAccess.getTypeConstraintsAccess().getGroup()); 
            // InternalMyDsl.g:269:3: ( rule__TypeConstraints__Group__0 )
            // InternalMyDsl.g:269:4: rule__TypeConstraints__Group__0
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
    // InternalMyDsl.g:278:1: entryRuleTypedVariable : ruleTypedVariable EOF ;
    public final void entryRuleTypedVariable() throws RecognitionException {
        try {
            // InternalMyDsl.g:279:1: ( ruleTypedVariable EOF )
            // InternalMyDsl.g:280:1: ruleTypedVariable EOF
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
    // InternalMyDsl.g:287:1: ruleTypedVariable : ( ( rule__TypedVariable__Group__0 ) ) ;
    public final void ruleTypedVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:291:2: ( ( ( rule__TypedVariable__Group__0 ) ) )
            // InternalMyDsl.g:292:2: ( ( rule__TypedVariable__Group__0 ) )
            {
            // InternalMyDsl.g:292:2: ( ( rule__TypedVariable__Group__0 ) )
            // InternalMyDsl.g:293:3: ( rule__TypedVariable__Group__0 )
            {
             before(grammarAccess.getTypedVariableAccess().getGroup()); 
            // InternalMyDsl.g:294:3: ( rule__TypedVariable__Group__0 )
            // InternalMyDsl.g:294:4: rule__TypedVariable__Group__0
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


    // $ANTLR start "entryRuleTypeDeclaration"
    // InternalMyDsl.g:303:1: entryRuleTypeDeclaration : ruleTypeDeclaration EOF ;
    public final void entryRuleTypeDeclaration() throws RecognitionException {
        try {
            // InternalMyDsl.g:304:1: ( ruleTypeDeclaration EOF )
            // InternalMyDsl.g:305:1: ruleTypeDeclaration EOF
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
    // InternalMyDsl.g:312:1: ruleTypeDeclaration : ( ( rule__TypeDeclaration__Group__0 ) ) ;
    public final void ruleTypeDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:316:2: ( ( ( rule__TypeDeclaration__Group__0 ) ) )
            // InternalMyDsl.g:317:2: ( ( rule__TypeDeclaration__Group__0 ) )
            {
            // InternalMyDsl.g:317:2: ( ( rule__TypeDeclaration__Group__0 ) )
            // InternalMyDsl.g:318:3: ( rule__TypeDeclaration__Group__0 )
            {
             before(grammarAccess.getTypeDeclarationAccess().getGroup()); 
            // InternalMyDsl.g:319:3: ( rule__TypeDeclaration__Group__0 )
            // InternalMyDsl.g:319:4: rule__TypeDeclaration__Group__0
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


    // $ANTLR start "entryRuleTypeDeclContext"
    // InternalMyDsl.g:328:1: entryRuleTypeDeclContext : ruleTypeDeclContext EOF ;
    public final void entryRuleTypeDeclContext() throws RecognitionException {
        try {
            // InternalMyDsl.g:329:1: ( ruleTypeDeclContext EOF )
            // InternalMyDsl.g:330:1: ruleTypeDeclContext EOF
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
    // InternalMyDsl.g:337:1: ruleTypeDeclContext : ( ( rule__TypeDeclContext__Group__0 ) ) ;
    public final void ruleTypeDeclContext() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:341:2: ( ( ( rule__TypeDeclContext__Group__0 ) ) )
            // InternalMyDsl.g:342:2: ( ( rule__TypeDeclContext__Group__0 ) )
            {
            // InternalMyDsl.g:342:2: ( ( rule__TypeDeclContext__Group__0 ) )
            // InternalMyDsl.g:343:3: ( rule__TypeDeclContext__Group__0 )
            {
             before(grammarAccess.getTypeDeclContextAccess().getGroup()); 
            // InternalMyDsl.g:344:3: ( rule__TypeDeclContext__Group__0 )
            // InternalMyDsl.g:344:4: rule__TypeDeclContext__Group__0
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


    // $ANTLR start "entryRuleTypeName"
    // InternalMyDsl.g:353:1: entryRuleTypeName : ruleTypeName EOF ;
    public final void entryRuleTypeName() throws RecognitionException {
        try {
            // InternalMyDsl.g:354:1: ( ruleTypeName EOF )
            // InternalMyDsl.g:355:1: ruleTypeName EOF
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
    // InternalMyDsl.g:362:1: ruleTypeName : ( ( rule__TypeName__NameAssignment ) ) ;
    public final void ruleTypeName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:366:2: ( ( ( rule__TypeName__NameAssignment ) ) )
            // InternalMyDsl.g:367:2: ( ( rule__TypeName__NameAssignment ) )
            {
            // InternalMyDsl.g:367:2: ( ( rule__TypeName__NameAssignment ) )
            // InternalMyDsl.g:368:3: ( rule__TypeName__NameAssignment )
            {
             before(grammarAccess.getTypeNameAccess().getNameAssignment()); 
            // InternalMyDsl.g:369:3: ( rule__TypeName__NameAssignment )
            // InternalMyDsl.g:369:4: rule__TypeName__NameAssignment
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


    // $ANTLR start "entryRuleFunctionName"
    // InternalMyDsl.g:378:1: entryRuleFunctionName : ruleFunctionName EOF ;
    public final void entryRuleFunctionName() throws RecognitionException {
        try {
            // InternalMyDsl.g:379:1: ( ruleFunctionName EOF )
            // InternalMyDsl.g:380:1: ruleFunctionName EOF
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
    // InternalMyDsl.g:387:1: ruleFunctionName : ( ( rule__FunctionName__NameAssignment ) ) ;
    public final void ruleFunctionName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:391:2: ( ( ( rule__FunctionName__NameAssignment ) ) )
            // InternalMyDsl.g:392:2: ( ( rule__FunctionName__NameAssignment ) )
            {
            // InternalMyDsl.g:392:2: ( ( rule__FunctionName__NameAssignment ) )
            // InternalMyDsl.g:393:3: ( rule__FunctionName__NameAssignment )
            {
             before(grammarAccess.getFunctionNameAccess().getNameAssignment()); 
            // InternalMyDsl.g:394:3: ( rule__FunctionName__NameAssignment )
            // InternalMyDsl.g:394:4: rule__FunctionName__NameAssignment
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


    // $ANTLR start "entryRuleClass"
    // InternalMyDsl.g:403:1: entryRuleClass : ruleClass EOF ;
    public final void entryRuleClass() throws RecognitionException {
        try {
            // InternalMyDsl.g:404:1: ( ruleClass EOF )
            // InternalMyDsl.g:405:1: ruleClass EOF
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
    // InternalMyDsl.g:412:1: ruleClass : ( ( rule__Class__Group__0 ) ) ;
    public final void ruleClass() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:416:2: ( ( ( rule__Class__Group__0 ) ) )
            // InternalMyDsl.g:417:2: ( ( rule__Class__Group__0 ) )
            {
            // InternalMyDsl.g:417:2: ( ( rule__Class__Group__0 ) )
            // InternalMyDsl.g:418:3: ( rule__Class__Group__0 )
            {
             before(grammarAccess.getClassAccess().getGroup()); 
            // InternalMyDsl.g:419:3: ( rule__Class__Group__0 )
            // InternalMyDsl.g:419:4: rule__Class__Group__0
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


    // $ANTLR start "entryRuleDatatype"
    // InternalMyDsl.g:428:1: entryRuleDatatype : ruleDatatype EOF ;
    public final void entryRuleDatatype() throws RecognitionException {
        try {
            // InternalMyDsl.g:429:1: ( ruleDatatype EOF )
            // InternalMyDsl.g:430:1: ruleDatatype EOF
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
    // InternalMyDsl.g:437:1: ruleDatatype : ( ( rule__Datatype__Group__0 ) ) ;
    public final void ruleDatatype() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:441:2: ( ( ( rule__Datatype__Group__0 ) ) )
            // InternalMyDsl.g:442:2: ( ( rule__Datatype__Group__0 ) )
            {
            // InternalMyDsl.g:442:2: ( ( rule__Datatype__Group__0 ) )
            // InternalMyDsl.g:443:3: ( rule__Datatype__Group__0 )
            {
             before(grammarAccess.getDatatypeAccess().getGroup()); 
            // InternalMyDsl.g:444:3: ( rule__Datatype__Group__0 )
            // InternalMyDsl.g:444:4: rule__Datatype__Group__0
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
    // InternalMyDsl.g:453:1: entryRuleDatatypeConstructor : ruleDatatypeConstructor EOF ;
    public final void entryRuleDatatypeConstructor() throws RecognitionException {
        try {
            // InternalMyDsl.g:454:1: ( ruleDatatypeConstructor EOF )
            // InternalMyDsl.g:455:1: ruleDatatypeConstructor EOF
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
    // InternalMyDsl.g:462:1: ruleDatatypeConstructor : ( ( rule__DatatypeConstructor__Alternatives ) ) ;
    public final void ruleDatatypeConstructor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:466:2: ( ( ( rule__DatatypeConstructor__Alternatives ) ) )
            // InternalMyDsl.g:467:2: ( ( rule__DatatypeConstructor__Alternatives ) )
            {
            // InternalMyDsl.g:467:2: ( ( rule__DatatypeConstructor__Alternatives ) )
            // InternalMyDsl.g:468:3: ( rule__DatatypeConstructor__Alternatives )
            {
             before(grammarAccess.getDatatypeConstructorAccess().getAlternatives()); 
            // InternalMyDsl.g:469:3: ( rule__DatatypeConstructor__Alternatives )
            // InternalMyDsl.g:469:4: rule__DatatypeConstructor__Alternatives
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
    // InternalMyDsl.g:478:1: entryRuleBaseConstructor : ruleBaseConstructor EOF ;
    public final void entryRuleBaseConstructor() throws RecognitionException {
        try {
            // InternalMyDsl.g:479:1: ( ruleBaseConstructor EOF )
            // InternalMyDsl.g:480:1: ruleBaseConstructor EOF
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
    // InternalMyDsl.g:487:1: ruleBaseConstructor : ( ( rule__BaseConstructor__NameAssignment ) ) ;
    public final void ruleBaseConstructor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:491:2: ( ( ( rule__BaseConstructor__NameAssignment ) ) )
            // InternalMyDsl.g:492:2: ( ( rule__BaseConstructor__NameAssignment ) )
            {
            // InternalMyDsl.g:492:2: ( ( rule__BaseConstructor__NameAssignment ) )
            // InternalMyDsl.g:493:3: ( rule__BaseConstructor__NameAssignment )
            {
             before(grammarAccess.getBaseConstructorAccess().getNameAssignment()); 
            // InternalMyDsl.g:494:3: ( rule__BaseConstructor__NameAssignment )
            // InternalMyDsl.g:494:4: rule__BaseConstructor__NameAssignment
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
    // InternalMyDsl.g:503:1: entryRuleConstructor : ruleConstructor EOF ;
    public final void entryRuleConstructor() throws RecognitionException {
        try {
            // InternalMyDsl.g:504:1: ( ruleConstructor EOF )
            // InternalMyDsl.g:505:1: ruleConstructor EOF
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
    // InternalMyDsl.g:512:1: ruleConstructor : ( ( rule__Constructor__Group__0 ) ) ;
    public final void ruleConstructor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:516:2: ( ( ( rule__Constructor__Group__0 ) ) )
            // InternalMyDsl.g:517:2: ( ( rule__Constructor__Group__0 ) )
            {
            // InternalMyDsl.g:517:2: ( ( rule__Constructor__Group__0 ) )
            // InternalMyDsl.g:518:3: ( rule__Constructor__Group__0 )
            {
             before(grammarAccess.getConstructorAccess().getGroup()); 
            // InternalMyDsl.g:519:3: ( rule__Constructor__Group__0 )
            // InternalMyDsl.g:519:4: rule__Constructor__Group__0
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
    // InternalMyDsl.g:528:1: entryRuleExtend : ruleExtend EOF ;
    public final void entryRuleExtend() throws RecognitionException {
        try {
            // InternalMyDsl.g:529:1: ( ruleExtend EOF )
            // InternalMyDsl.g:530:1: ruleExtend EOF
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
    // InternalMyDsl.g:537:1: ruleExtend : ( ( rule__Extend__Group__0 ) ) ;
    public final void ruleExtend() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:541:2: ( ( ( rule__Extend__Group__0 ) ) )
            // InternalMyDsl.g:542:2: ( ( rule__Extend__Group__0 ) )
            {
            // InternalMyDsl.g:542:2: ( ( rule__Extend__Group__0 ) )
            // InternalMyDsl.g:543:3: ( rule__Extend__Group__0 )
            {
             before(grammarAccess.getExtendAccess().getGroup()); 
            // InternalMyDsl.g:544:3: ( rule__Extend__Group__0 )
            // InternalMyDsl.g:544:4: rule__Extend__Group__0
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
    // InternalMyDsl.g:553:1: entryRuleTypeBodyElements : ruleTypeBodyElements EOF ;
    public final void entryRuleTypeBodyElements() throws RecognitionException {
        try {
            // InternalMyDsl.g:554:1: ( ruleTypeBodyElements EOF )
            // InternalMyDsl.g:555:1: ruleTypeBodyElements EOF
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
    // InternalMyDsl.g:562:1: ruleTypeBodyElements : ( ( rule__TypeBodyElements__Alternatives ) ) ;
    public final void ruleTypeBodyElements() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:566:2: ( ( ( rule__TypeBodyElements__Alternatives ) ) )
            // InternalMyDsl.g:567:2: ( ( rule__TypeBodyElements__Alternatives ) )
            {
            // InternalMyDsl.g:567:2: ( ( rule__TypeBodyElements__Alternatives ) )
            // InternalMyDsl.g:568:3: ( rule__TypeBodyElements__Alternatives )
            {
             before(grammarAccess.getTypeBodyElementsAccess().getAlternatives()); 
            // InternalMyDsl.g:569:3: ( rule__TypeBodyElements__Alternatives )
            // InternalMyDsl.g:569:4: rule__TypeBodyElements__Alternatives
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
    // InternalMyDsl.g:578:1: entryRuleFunctionDecl : ruleFunctionDecl EOF ;
    public final void entryRuleFunctionDecl() throws RecognitionException {
        try {
            // InternalMyDsl.g:579:1: ( ruleFunctionDecl EOF )
            // InternalMyDsl.g:580:1: ruleFunctionDecl EOF
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
    // InternalMyDsl.g:587:1: ruleFunctionDecl : ( ( rule__FunctionDecl__Group__0 ) ) ;
    public final void ruleFunctionDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:591:2: ( ( ( rule__FunctionDecl__Group__0 ) ) )
            // InternalMyDsl.g:592:2: ( ( rule__FunctionDecl__Group__0 ) )
            {
            // InternalMyDsl.g:592:2: ( ( rule__FunctionDecl__Group__0 ) )
            // InternalMyDsl.g:593:3: ( rule__FunctionDecl__Group__0 )
            {
             before(grammarAccess.getFunctionDeclAccess().getGroup()); 
            // InternalMyDsl.g:594:3: ( rule__FunctionDecl__Group__0 )
            // InternalMyDsl.g:594:4: rule__FunctionDecl__Group__0
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
    // InternalMyDsl.g:603:1: entryRuleTheoremBody : ruleTheoremBody EOF ;
    public final void entryRuleTheoremBody() throws RecognitionException {
        try {
            // InternalMyDsl.g:604:1: ( ruleTheoremBody EOF )
            // InternalMyDsl.g:605:1: ruleTheoremBody EOF
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
    // InternalMyDsl.g:612:1: ruleTheoremBody : ( ( rule__TheoremBody__Group__0 ) ) ;
    public final void ruleTheoremBody() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:616:2: ( ( ( rule__TheoremBody__Group__0 ) ) )
            // InternalMyDsl.g:617:2: ( ( rule__TheoremBody__Group__0 ) )
            {
            // InternalMyDsl.g:617:2: ( ( rule__TheoremBody__Group__0 ) )
            // InternalMyDsl.g:618:3: ( rule__TheoremBody__Group__0 )
            {
             before(grammarAccess.getTheoremBodyAccess().getGroup()); 
            // InternalMyDsl.g:619:3: ( rule__TheoremBody__Group__0 )
            // InternalMyDsl.g:619:4: rule__TheoremBody__Group__0
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
    // InternalMyDsl.g:628:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalMyDsl.g:629:1: ( ruleExpression EOF )
            // InternalMyDsl.g:630:1: ruleExpression EOF
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
    // InternalMyDsl.g:637:1: ruleExpression : ( ( rule__Expression__NameAssignment ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:641:2: ( ( ( rule__Expression__NameAssignment ) ) )
            // InternalMyDsl.g:642:2: ( ( rule__Expression__NameAssignment ) )
            {
            // InternalMyDsl.g:642:2: ( ( rule__Expression__NameAssignment ) )
            // InternalMyDsl.g:643:3: ( rule__Expression__NameAssignment )
            {
             before(grammarAccess.getExpressionAccess().getNameAssignment()); 
            // InternalMyDsl.g:644:3: ( rule__Expression__NameAssignment )
            // InternalMyDsl.g:644:4: rule__Expression__NameAssignment
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
    // InternalMyDsl.g:652:1: rule__TopLevel__Alternatives : ( ( ruleImportSatement ) | ( ruleClassDecl ) );
    public final void rule__TopLevel__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:656:1: ( ( ruleImportSatement ) | ( ruleClassDecl ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID||LA2_0==17||LA2_0==20) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:657:2: ( ruleImportSatement )
                    {
                    // InternalMyDsl.g:657:2: ( ruleImportSatement )
                    // InternalMyDsl.g:658:3: ruleImportSatement
                    {
                     before(grammarAccess.getTopLevelAccess().getImportSatementParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleImportSatement();

                    state._fsp--;

                     after(grammarAccess.getTopLevelAccess().getImportSatementParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:663:2: ( ruleClassDecl )
                    {
                    // InternalMyDsl.g:663:2: ( ruleClassDecl )
                    // InternalMyDsl.g:664:3: ruleClassDecl
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
    // InternalMyDsl.g:673:1: rule__ClassDecl__Alternatives : ( ( ruleClass ) | ( ruleDatatype ) | ( ruleExtend ) );
    public final void rule__ClassDecl__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:677:1: ( ( ruleClass ) | ( ruleDatatype ) | ( ruleExtend ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt3=1;
                }
                break;
            case 20:
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
                    // InternalMyDsl.g:678:2: ( ruleClass )
                    {
                    // InternalMyDsl.g:678:2: ( ruleClass )
                    // InternalMyDsl.g:679:3: ruleClass
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
                    // InternalMyDsl.g:684:2: ( ruleDatatype )
                    {
                    // InternalMyDsl.g:684:2: ( ruleDatatype )
                    // InternalMyDsl.g:685:3: ruleDatatype
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
                    // InternalMyDsl.g:690:2: ( ruleExtend )
                    {
                    // InternalMyDsl.g:690:2: ( ruleExtend )
                    // InternalMyDsl.g:691:3: ruleExtend
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


    // $ANTLR start "rule__DatatypeConstructor__Alternatives"
    // InternalMyDsl.g:700:1: rule__DatatypeConstructor__Alternatives : ( ( ruleBaseConstructor ) | ( ruleConstructor ) );
    public final void rule__DatatypeConstructor__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:704:1: ( ( ruleBaseConstructor ) | ( ruleConstructor ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==21) ) {
                    alt4=2;
                }
                else if ( (LA4_1==EOF||LA4_1==RULE_ID||LA4_1==18) ) {
                    alt4=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:705:2: ( ruleBaseConstructor )
                    {
                    // InternalMyDsl.g:705:2: ( ruleBaseConstructor )
                    // InternalMyDsl.g:706:3: ruleBaseConstructor
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
                    // InternalMyDsl.g:711:2: ( ruleConstructor )
                    {
                    // InternalMyDsl.g:711:2: ( ruleConstructor )
                    // InternalMyDsl.g:712:3: ruleConstructor
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


    // $ANTLR start "rule__TypeBodyElements__Alternatives"
    // InternalMyDsl.g:721:1: rule__TypeBodyElements__Alternatives : ( ( ( rule__TypeBodyElements__FunctionsAssignment_0 ) ) | ( ( rule__TypeBodyElements__TheoremsAssignment_1 ) ) );
    public final void rule__TypeBodyElements__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:725:1: ( ( ( rule__TypeBodyElements__FunctionsAssignment_0 ) ) | ( ( rule__TypeBodyElements__TheoremsAssignment_1 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            else if ( (LA5_0==23) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:726:2: ( ( rule__TypeBodyElements__FunctionsAssignment_0 ) )
                    {
                    // InternalMyDsl.g:726:2: ( ( rule__TypeBodyElements__FunctionsAssignment_0 ) )
                    // InternalMyDsl.g:727:3: ( rule__TypeBodyElements__FunctionsAssignment_0 )
                    {
                     before(grammarAccess.getTypeBodyElementsAccess().getFunctionsAssignment_0()); 
                    // InternalMyDsl.g:728:3: ( rule__TypeBodyElements__FunctionsAssignment_0 )
                    // InternalMyDsl.g:728:4: rule__TypeBodyElements__FunctionsAssignment_0
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
                    // InternalMyDsl.g:732:2: ( ( rule__TypeBodyElements__TheoremsAssignment_1 ) )
                    {
                    // InternalMyDsl.g:732:2: ( ( rule__TypeBodyElements__TheoremsAssignment_1 ) )
                    // InternalMyDsl.g:733:3: ( rule__TypeBodyElements__TheoremsAssignment_1 )
                    {
                     before(grammarAccess.getTypeBodyElementsAccess().getTheoremsAssignment_1()); 
                    // InternalMyDsl.g:734:3: ( rule__TypeBodyElements__TheoremsAssignment_1 )
                    // InternalMyDsl.g:734:4: rule__TypeBodyElements__TheoremsAssignment_1
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


    // $ANTLR start "rule__ImportSatement__Group__0"
    // InternalMyDsl.g:742:1: rule__ImportSatement__Group__0 : rule__ImportSatement__Group__0__Impl rule__ImportSatement__Group__1 ;
    public final void rule__ImportSatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:746:1: ( rule__ImportSatement__Group__0__Impl rule__ImportSatement__Group__1 )
            // InternalMyDsl.g:747:2: rule__ImportSatement__Group__0__Impl rule__ImportSatement__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__ImportSatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImportSatement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportSatement__Group__0"


    // $ANTLR start "rule__ImportSatement__Group__0__Impl"
    // InternalMyDsl.g:754:1: rule__ImportSatement__Group__0__Impl : ( 'Import' ) ;
    public final void rule__ImportSatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:758:1: ( ( 'Import' ) )
            // InternalMyDsl.g:759:1: ( 'Import' )
            {
            // InternalMyDsl.g:759:1: ( 'Import' )
            // InternalMyDsl.g:760:2: 'Import'
            {
             before(grammarAccess.getImportSatementAccess().getImportKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getImportSatementAccess().getImportKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportSatement__Group__0__Impl"


    // $ANTLR start "rule__ImportSatement__Group__1"
    // InternalMyDsl.g:769:1: rule__ImportSatement__Group__1 : rule__ImportSatement__Group__1__Impl ;
    public final void rule__ImportSatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:773:1: ( rule__ImportSatement__Group__1__Impl )
            // InternalMyDsl.g:774:2: rule__ImportSatement__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ImportSatement__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportSatement__Group__1"


    // $ANTLR start "rule__ImportSatement__Group__1__Impl"
    // InternalMyDsl.g:780:1: rule__ImportSatement__Group__1__Impl : ( ( rule__ImportSatement__ImportsAssignment_1 ) ) ;
    public final void rule__ImportSatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:784:1: ( ( ( rule__ImportSatement__ImportsAssignment_1 ) ) )
            // InternalMyDsl.g:785:1: ( ( rule__ImportSatement__ImportsAssignment_1 ) )
            {
            // InternalMyDsl.g:785:1: ( ( rule__ImportSatement__ImportsAssignment_1 ) )
            // InternalMyDsl.g:786:2: ( rule__ImportSatement__ImportsAssignment_1 )
            {
             before(grammarAccess.getImportSatementAccess().getImportsAssignment_1()); 
            // InternalMyDsl.g:787:2: ( rule__ImportSatement__ImportsAssignment_1 )
            // InternalMyDsl.g:787:3: rule__ImportSatement__ImportsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ImportSatement__ImportsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getImportSatementAccess().getImportsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportSatement__Group__1__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // InternalMyDsl.g:796:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:800:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalMyDsl.g:801:2: rule__Import__Group__0__Impl rule__Import__Group__1
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
    // InternalMyDsl.g:808:1: rule__Import__Group__0__Impl : ( ( rule__Import__ImportNameAssignment_0 ) ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:812:1: ( ( ( rule__Import__ImportNameAssignment_0 ) ) )
            // InternalMyDsl.g:813:1: ( ( rule__Import__ImportNameAssignment_0 ) )
            {
            // InternalMyDsl.g:813:1: ( ( rule__Import__ImportNameAssignment_0 ) )
            // InternalMyDsl.g:814:2: ( rule__Import__ImportNameAssignment_0 )
            {
             before(grammarAccess.getImportAccess().getImportNameAssignment_0()); 
            // InternalMyDsl.g:815:2: ( rule__Import__ImportNameAssignment_0 )
            // InternalMyDsl.g:815:3: rule__Import__ImportNameAssignment_0
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
    // InternalMyDsl.g:823:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:827:1: ( rule__Import__Group__1__Impl )
            // InternalMyDsl.g:828:2: rule__Import__Group__1__Impl
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
    // InternalMyDsl.g:834:1: rule__Import__Group__1__Impl : ( ( rule__Import__Group_1__0 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:838:1: ( ( ( rule__Import__Group_1__0 ) ) )
            // InternalMyDsl.g:839:1: ( ( rule__Import__Group_1__0 ) )
            {
            // InternalMyDsl.g:839:1: ( ( rule__Import__Group_1__0 ) )
            // InternalMyDsl.g:840:2: ( rule__Import__Group_1__0 )
            {
             before(grammarAccess.getImportAccess().getGroup_1()); 
            // InternalMyDsl.g:841:2: ( rule__Import__Group_1__0 )
            // InternalMyDsl.g:841:3: rule__Import__Group_1__0
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
    // InternalMyDsl.g:850:1: rule__Import__Group_1__0 : rule__Import__Group_1__0__Impl rule__Import__Group_1__1 ;
    public final void rule__Import__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:854:1: ( rule__Import__Group_1__0__Impl rule__Import__Group_1__1 )
            // InternalMyDsl.g:855:2: rule__Import__Group_1__0__Impl rule__Import__Group_1__1
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
    // InternalMyDsl.g:862:1: rule__Import__Group_1__0__Impl : ( '.' ) ;
    public final void rule__Import__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:866:1: ( ( '.' ) )
            // InternalMyDsl.g:867:1: ( '.' )
            {
            // InternalMyDsl.g:867:1: ( '.' )
            // InternalMyDsl.g:868:2: '.'
            {
             before(grammarAccess.getImportAccess().getFullStopKeyword_1_0()); 
            match(input,12,FOLLOW_2); 
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
    // InternalMyDsl.g:877:1: rule__Import__Group_1__1 : rule__Import__Group_1__1__Impl ;
    public final void rule__Import__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:881:1: ( rule__Import__Group_1__1__Impl )
            // InternalMyDsl.g:882:2: rule__Import__Group_1__1__Impl
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
    // InternalMyDsl.g:888:1: rule__Import__Group_1__1__Impl : ( ( rule__Import__ImportNameAssignment_1_1 ) ) ;
    public final void rule__Import__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:892:1: ( ( ( rule__Import__ImportNameAssignment_1_1 ) ) )
            // InternalMyDsl.g:893:1: ( ( rule__Import__ImportNameAssignment_1_1 ) )
            {
            // InternalMyDsl.g:893:1: ( ( rule__Import__ImportNameAssignment_1_1 ) )
            // InternalMyDsl.g:894:2: ( rule__Import__ImportNameAssignment_1_1 )
            {
             before(grammarAccess.getImportAccess().getImportNameAssignment_1_1()); 
            // InternalMyDsl.g:895:2: ( rule__Import__ImportNameAssignment_1_1 )
            // InternalMyDsl.g:895:3: rule__Import__ImportNameAssignment_1_1
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


    // $ANTLR start "rule__PolyContext__Group__0"
    // InternalMyDsl.g:904:1: rule__PolyContext__Group__0 : rule__PolyContext__Group__0__Impl rule__PolyContext__Group__1 ;
    public final void rule__PolyContext__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:908:1: ( rule__PolyContext__Group__0__Impl rule__PolyContext__Group__1 )
            // InternalMyDsl.g:909:2: rule__PolyContext__Group__0__Impl rule__PolyContext__Group__1
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
    // InternalMyDsl.g:916:1: rule__PolyContext__Group__0__Impl : ( '<' ) ;
    public final void rule__PolyContext__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:920:1: ( ( '<' ) )
            // InternalMyDsl.g:921:1: ( '<' )
            {
            // InternalMyDsl.g:921:1: ( '<' )
            // InternalMyDsl.g:922:2: '<'
            {
             before(grammarAccess.getPolyContextAccess().getLessThanSignKeyword_0()); 
            match(input,13,FOLLOW_2); 
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
    // InternalMyDsl.g:931:1: rule__PolyContext__Group__1 : rule__PolyContext__Group__1__Impl rule__PolyContext__Group__2 ;
    public final void rule__PolyContext__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:935:1: ( rule__PolyContext__Group__1__Impl rule__PolyContext__Group__2 )
            // InternalMyDsl.g:936:2: rule__PolyContext__Group__1__Impl rule__PolyContext__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalMyDsl.g:943:1: rule__PolyContext__Group__1__Impl : ( ( ( rule__PolyContext__PolyTypesAssignment_1 ) ) ( ( rule__PolyContext__PolyTypesAssignment_1 )* ) ) ;
    public final void rule__PolyContext__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:947:1: ( ( ( ( rule__PolyContext__PolyTypesAssignment_1 ) ) ( ( rule__PolyContext__PolyTypesAssignment_1 )* ) ) )
            // InternalMyDsl.g:948:1: ( ( ( rule__PolyContext__PolyTypesAssignment_1 ) ) ( ( rule__PolyContext__PolyTypesAssignment_1 )* ) )
            {
            // InternalMyDsl.g:948:1: ( ( ( rule__PolyContext__PolyTypesAssignment_1 ) ) ( ( rule__PolyContext__PolyTypesAssignment_1 )* ) )
            // InternalMyDsl.g:949:2: ( ( rule__PolyContext__PolyTypesAssignment_1 ) ) ( ( rule__PolyContext__PolyTypesAssignment_1 )* )
            {
            // InternalMyDsl.g:949:2: ( ( rule__PolyContext__PolyTypesAssignment_1 ) )
            // InternalMyDsl.g:950:3: ( rule__PolyContext__PolyTypesAssignment_1 )
            {
             before(grammarAccess.getPolyContextAccess().getPolyTypesAssignment_1()); 
            // InternalMyDsl.g:951:3: ( rule__PolyContext__PolyTypesAssignment_1 )
            // InternalMyDsl.g:951:4: rule__PolyContext__PolyTypesAssignment_1
            {
            pushFollow(FOLLOW_7);
            rule__PolyContext__PolyTypesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPolyContextAccess().getPolyTypesAssignment_1()); 

            }

            // InternalMyDsl.g:954:2: ( ( rule__PolyContext__PolyTypesAssignment_1 )* )
            // InternalMyDsl.g:955:3: ( rule__PolyContext__PolyTypesAssignment_1 )*
            {
             before(grammarAccess.getPolyContextAccess().getPolyTypesAssignment_1()); 
            // InternalMyDsl.g:956:3: ( rule__PolyContext__PolyTypesAssignment_1 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyDsl.g:956:4: rule__PolyContext__PolyTypesAssignment_1
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__PolyContext__PolyTypesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // InternalMyDsl.g:965:1: rule__PolyContext__Group__2 : rule__PolyContext__Group__2__Impl ;
    public final void rule__PolyContext__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:969:1: ( rule__PolyContext__Group__2__Impl )
            // InternalMyDsl.g:970:2: rule__PolyContext__Group__2__Impl
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
    // InternalMyDsl.g:976:1: rule__PolyContext__Group__2__Impl : ( '>' ) ;
    public final void rule__PolyContext__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:980:1: ( ( '>' ) )
            // InternalMyDsl.g:981:1: ( '>' )
            {
            // InternalMyDsl.g:981:1: ( '>' )
            // InternalMyDsl.g:982:2: '>'
            {
             before(grammarAccess.getPolyContextAccess().getGreaterThanSignKeyword_2()); 
            match(input,14,FOLLOW_2); 
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
    // InternalMyDsl.g:992:1: rule__PolyContextTypes__Group__0 : rule__PolyContextTypes__Group__0__Impl rule__PolyContextTypes__Group__1 ;
    public final void rule__PolyContextTypes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:996:1: ( rule__PolyContextTypes__Group__0__Impl rule__PolyContextTypes__Group__1 )
            // InternalMyDsl.g:997:2: rule__PolyContextTypes__Group__0__Impl rule__PolyContextTypes__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalMyDsl.g:1004:1: rule__PolyContextTypes__Group__0__Impl : ( ( rule__PolyContextTypes__NameAssignment_0 ) ) ;
    public final void rule__PolyContextTypes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1008:1: ( ( ( rule__PolyContextTypes__NameAssignment_0 ) ) )
            // InternalMyDsl.g:1009:1: ( ( rule__PolyContextTypes__NameAssignment_0 ) )
            {
            // InternalMyDsl.g:1009:1: ( ( rule__PolyContextTypes__NameAssignment_0 ) )
            // InternalMyDsl.g:1010:2: ( rule__PolyContextTypes__NameAssignment_0 )
            {
             before(grammarAccess.getPolyContextTypesAccess().getNameAssignment_0()); 
            // InternalMyDsl.g:1011:2: ( rule__PolyContextTypes__NameAssignment_0 )
            // InternalMyDsl.g:1011:3: rule__PolyContextTypes__NameAssignment_0
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
    // InternalMyDsl.g:1019:1: rule__PolyContextTypes__Group__1 : rule__PolyContextTypes__Group__1__Impl ;
    public final void rule__PolyContextTypes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1023:1: ( rule__PolyContextTypes__Group__1__Impl )
            // InternalMyDsl.g:1024:2: rule__PolyContextTypes__Group__1__Impl
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
    // InternalMyDsl.g:1030:1: rule__PolyContextTypes__Group__1__Impl : ( ( rule__PolyContextTypes__ConstraintsAssignment_1 )* ) ;
    public final void rule__PolyContextTypes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1034:1: ( ( ( rule__PolyContextTypes__ConstraintsAssignment_1 )* ) )
            // InternalMyDsl.g:1035:1: ( ( rule__PolyContextTypes__ConstraintsAssignment_1 )* )
            {
            // InternalMyDsl.g:1035:1: ( ( rule__PolyContextTypes__ConstraintsAssignment_1 )* )
            // InternalMyDsl.g:1036:2: ( rule__PolyContextTypes__ConstraintsAssignment_1 )*
            {
             before(grammarAccess.getPolyContextTypesAccess().getConstraintsAssignment_1()); 
            // InternalMyDsl.g:1037:2: ( rule__PolyContextTypes__ConstraintsAssignment_1 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==15) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyDsl.g:1037:3: rule__PolyContextTypes__ConstraintsAssignment_1
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__PolyContextTypes__ConstraintsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // InternalMyDsl.g:1046:1: rule__TypeConstraints__Group__0 : rule__TypeConstraints__Group__0__Impl rule__TypeConstraints__Group__1 ;
    public final void rule__TypeConstraints__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1050:1: ( rule__TypeConstraints__Group__0__Impl rule__TypeConstraints__Group__1 )
            // InternalMyDsl.g:1051:2: rule__TypeConstraints__Group__0__Impl rule__TypeConstraints__Group__1
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
    // InternalMyDsl.g:1058:1: rule__TypeConstraints__Group__0__Impl : ( ':' ) ;
    public final void rule__TypeConstraints__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1062:1: ( ( ':' ) )
            // InternalMyDsl.g:1063:1: ( ':' )
            {
            // InternalMyDsl.g:1063:1: ( ':' )
            // InternalMyDsl.g:1064:2: ':'
            {
             before(grammarAccess.getTypeConstraintsAccess().getColonKeyword_0()); 
            match(input,15,FOLLOW_2); 
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
    // InternalMyDsl.g:1073:1: rule__TypeConstraints__Group__1 : rule__TypeConstraints__Group__1__Impl rule__TypeConstraints__Group__2 ;
    public final void rule__TypeConstraints__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1077:1: ( rule__TypeConstraints__Group__1__Impl rule__TypeConstraints__Group__2 )
            // InternalMyDsl.g:1078:2: rule__TypeConstraints__Group__1__Impl rule__TypeConstraints__Group__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyDsl.g:1085:1: rule__TypeConstraints__Group__1__Impl : ( ( rule__TypeConstraints__TypeNameAssignment_1 ) ) ;
    public final void rule__TypeConstraints__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1089:1: ( ( ( rule__TypeConstraints__TypeNameAssignment_1 ) ) )
            // InternalMyDsl.g:1090:1: ( ( rule__TypeConstraints__TypeNameAssignment_1 ) )
            {
            // InternalMyDsl.g:1090:1: ( ( rule__TypeConstraints__TypeNameAssignment_1 ) )
            // InternalMyDsl.g:1091:2: ( rule__TypeConstraints__TypeNameAssignment_1 )
            {
             before(grammarAccess.getTypeConstraintsAccess().getTypeNameAssignment_1()); 
            // InternalMyDsl.g:1092:2: ( rule__TypeConstraints__TypeNameAssignment_1 )
            // InternalMyDsl.g:1092:3: rule__TypeConstraints__TypeNameAssignment_1
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
    // InternalMyDsl.g:1100:1: rule__TypeConstraints__Group__2 : rule__TypeConstraints__Group__2__Impl ;
    public final void rule__TypeConstraints__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1104:1: ( rule__TypeConstraints__Group__2__Impl )
            // InternalMyDsl.g:1105:2: rule__TypeConstraints__Group__2__Impl
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
    // InternalMyDsl.g:1111:1: rule__TypeConstraints__Group__2__Impl : ( ( rule__TypeConstraints__Group_2__0 )* ) ;
    public final void rule__TypeConstraints__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1115:1: ( ( ( rule__TypeConstraints__Group_2__0 )* ) )
            // InternalMyDsl.g:1116:1: ( ( rule__TypeConstraints__Group_2__0 )* )
            {
            // InternalMyDsl.g:1116:1: ( ( rule__TypeConstraints__Group_2__0 )* )
            // InternalMyDsl.g:1117:2: ( rule__TypeConstraints__Group_2__0 )*
            {
             before(grammarAccess.getTypeConstraintsAccess().getGroup_2()); 
            // InternalMyDsl.g:1118:2: ( rule__TypeConstraints__Group_2__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==16) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyDsl.g:1118:3: rule__TypeConstraints__Group_2__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__TypeConstraints__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // InternalMyDsl.g:1127:1: rule__TypeConstraints__Group_2__0 : rule__TypeConstraints__Group_2__0__Impl rule__TypeConstraints__Group_2__1 ;
    public final void rule__TypeConstraints__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1131:1: ( rule__TypeConstraints__Group_2__0__Impl rule__TypeConstraints__Group_2__1 )
            // InternalMyDsl.g:1132:2: rule__TypeConstraints__Group_2__0__Impl rule__TypeConstraints__Group_2__1
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
    // InternalMyDsl.g:1139:1: rule__TypeConstraints__Group_2__0__Impl : ( ',' ) ;
    public final void rule__TypeConstraints__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1143:1: ( ( ',' ) )
            // InternalMyDsl.g:1144:1: ( ',' )
            {
            // InternalMyDsl.g:1144:1: ( ',' )
            // InternalMyDsl.g:1145:2: ','
            {
             before(grammarAccess.getTypeConstraintsAccess().getCommaKeyword_2_0()); 
            match(input,16,FOLLOW_2); 
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
    // InternalMyDsl.g:1154:1: rule__TypeConstraints__Group_2__1 : rule__TypeConstraints__Group_2__1__Impl ;
    public final void rule__TypeConstraints__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1158:1: ( rule__TypeConstraints__Group_2__1__Impl )
            // InternalMyDsl.g:1159:2: rule__TypeConstraints__Group_2__1__Impl
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
    // InternalMyDsl.g:1165:1: rule__TypeConstraints__Group_2__1__Impl : ( ( rule__TypeConstraints__TypeNameAssignment_2_1 ) ) ;
    public final void rule__TypeConstraints__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1169:1: ( ( ( rule__TypeConstraints__TypeNameAssignment_2_1 ) ) )
            // InternalMyDsl.g:1170:1: ( ( rule__TypeConstraints__TypeNameAssignment_2_1 ) )
            {
            // InternalMyDsl.g:1170:1: ( ( rule__TypeConstraints__TypeNameAssignment_2_1 ) )
            // InternalMyDsl.g:1171:2: ( rule__TypeConstraints__TypeNameAssignment_2_1 )
            {
             before(grammarAccess.getTypeConstraintsAccess().getTypeNameAssignment_2_1()); 
            // InternalMyDsl.g:1172:2: ( rule__TypeConstraints__TypeNameAssignment_2_1 )
            // InternalMyDsl.g:1172:3: rule__TypeConstraints__TypeNameAssignment_2_1
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
    // InternalMyDsl.g:1181:1: rule__TypedVariable__Group__0 : rule__TypedVariable__Group__0__Impl rule__TypedVariable__Group__1 ;
    public final void rule__TypedVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1185:1: ( rule__TypedVariable__Group__0__Impl rule__TypedVariable__Group__1 )
            // InternalMyDsl.g:1186:2: rule__TypedVariable__Group__0__Impl rule__TypedVariable__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalMyDsl.g:1193:1: rule__TypedVariable__Group__0__Impl : ( ( rule__TypedVariable__NameAssignment_0 ) ) ;
    public final void rule__TypedVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1197:1: ( ( ( rule__TypedVariable__NameAssignment_0 ) ) )
            // InternalMyDsl.g:1198:1: ( ( rule__TypedVariable__NameAssignment_0 ) )
            {
            // InternalMyDsl.g:1198:1: ( ( rule__TypedVariable__NameAssignment_0 ) )
            // InternalMyDsl.g:1199:2: ( rule__TypedVariable__NameAssignment_0 )
            {
             before(grammarAccess.getTypedVariableAccess().getNameAssignment_0()); 
            // InternalMyDsl.g:1200:2: ( rule__TypedVariable__NameAssignment_0 )
            // InternalMyDsl.g:1200:3: rule__TypedVariable__NameAssignment_0
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
    // InternalMyDsl.g:1208:1: rule__TypedVariable__Group__1 : rule__TypedVariable__Group__1__Impl ;
    public final void rule__TypedVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1212:1: ( rule__TypedVariable__Group__1__Impl )
            // InternalMyDsl.g:1213:2: rule__TypedVariable__Group__1__Impl
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
    // InternalMyDsl.g:1219:1: rule__TypedVariable__Group__1__Impl : ( ( rule__TypedVariable__ConstraintsAssignment_1 ) ) ;
    public final void rule__TypedVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1223:1: ( ( ( rule__TypedVariable__ConstraintsAssignment_1 ) ) )
            // InternalMyDsl.g:1224:1: ( ( rule__TypedVariable__ConstraintsAssignment_1 ) )
            {
            // InternalMyDsl.g:1224:1: ( ( rule__TypedVariable__ConstraintsAssignment_1 ) )
            // InternalMyDsl.g:1225:2: ( rule__TypedVariable__ConstraintsAssignment_1 )
            {
             before(grammarAccess.getTypedVariableAccess().getConstraintsAssignment_1()); 
            // InternalMyDsl.g:1226:2: ( rule__TypedVariable__ConstraintsAssignment_1 )
            // InternalMyDsl.g:1226:3: rule__TypedVariable__ConstraintsAssignment_1
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


    // $ANTLR start "rule__TypeDeclaration__Group__0"
    // InternalMyDsl.g:1235:1: rule__TypeDeclaration__Group__0 : rule__TypeDeclaration__Group__0__Impl rule__TypeDeclaration__Group__1 ;
    public final void rule__TypeDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1239:1: ( rule__TypeDeclaration__Group__0__Impl rule__TypeDeclaration__Group__1 )
            // InternalMyDsl.g:1240:2: rule__TypeDeclaration__Group__0__Impl rule__TypeDeclaration__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalMyDsl.g:1247:1: rule__TypeDeclaration__Group__0__Impl : ( ( rule__TypeDeclaration__TypeNameAssignment_0 ) ) ;
    public final void rule__TypeDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1251:1: ( ( ( rule__TypeDeclaration__TypeNameAssignment_0 ) ) )
            // InternalMyDsl.g:1252:1: ( ( rule__TypeDeclaration__TypeNameAssignment_0 ) )
            {
            // InternalMyDsl.g:1252:1: ( ( rule__TypeDeclaration__TypeNameAssignment_0 ) )
            // InternalMyDsl.g:1253:2: ( rule__TypeDeclaration__TypeNameAssignment_0 )
            {
             before(grammarAccess.getTypeDeclarationAccess().getTypeNameAssignment_0()); 
            // InternalMyDsl.g:1254:2: ( rule__TypeDeclaration__TypeNameAssignment_0 )
            // InternalMyDsl.g:1254:3: rule__TypeDeclaration__TypeNameAssignment_0
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
    // InternalMyDsl.g:1262:1: rule__TypeDeclaration__Group__1 : rule__TypeDeclaration__Group__1__Impl ;
    public final void rule__TypeDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1266:1: ( rule__TypeDeclaration__Group__1__Impl )
            // InternalMyDsl.g:1267:2: rule__TypeDeclaration__Group__1__Impl
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
    // InternalMyDsl.g:1273:1: rule__TypeDeclaration__Group__1__Impl : ( ( rule__TypeDeclaration__ContextAssignment_1 ) ) ;
    public final void rule__TypeDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1277:1: ( ( ( rule__TypeDeclaration__ContextAssignment_1 ) ) )
            // InternalMyDsl.g:1278:1: ( ( rule__TypeDeclaration__ContextAssignment_1 ) )
            {
            // InternalMyDsl.g:1278:1: ( ( rule__TypeDeclaration__ContextAssignment_1 ) )
            // InternalMyDsl.g:1279:2: ( rule__TypeDeclaration__ContextAssignment_1 )
            {
             before(grammarAccess.getTypeDeclarationAccess().getContextAssignment_1()); 
            // InternalMyDsl.g:1280:2: ( rule__TypeDeclaration__ContextAssignment_1 )
            // InternalMyDsl.g:1280:3: rule__TypeDeclaration__ContextAssignment_1
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


    // $ANTLR start "rule__TypeDeclContext__Group__0"
    // InternalMyDsl.g:1289:1: rule__TypeDeclContext__Group__0 : rule__TypeDeclContext__Group__0__Impl rule__TypeDeclContext__Group__1 ;
    public final void rule__TypeDeclContext__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1293:1: ( rule__TypeDeclContext__Group__0__Impl rule__TypeDeclContext__Group__1 )
            // InternalMyDsl.g:1294:2: rule__TypeDeclContext__Group__0__Impl rule__TypeDeclContext__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyDsl.g:1301:1: rule__TypeDeclContext__Group__0__Impl : ( '<' ) ;
    public final void rule__TypeDeclContext__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1305:1: ( ( '<' ) )
            // InternalMyDsl.g:1306:1: ( '<' )
            {
            // InternalMyDsl.g:1306:1: ( '<' )
            // InternalMyDsl.g:1307:2: '<'
            {
             before(grammarAccess.getTypeDeclContextAccess().getLessThanSignKeyword_0()); 
            match(input,13,FOLLOW_2); 
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
    // InternalMyDsl.g:1316:1: rule__TypeDeclContext__Group__1 : rule__TypeDeclContext__Group__1__Impl rule__TypeDeclContext__Group__2 ;
    public final void rule__TypeDeclContext__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1320:1: ( rule__TypeDeclContext__Group__1__Impl rule__TypeDeclContext__Group__2 )
            // InternalMyDsl.g:1321:2: rule__TypeDeclContext__Group__1__Impl rule__TypeDeclContext__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalMyDsl.g:1328:1: rule__TypeDeclContext__Group__1__Impl : ( ( rule__TypeDeclContext__Group_1__0 ) ) ;
    public final void rule__TypeDeclContext__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1332:1: ( ( ( rule__TypeDeclContext__Group_1__0 ) ) )
            // InternalMyDsl.g:1333:1: ( ( rule__TypeDeclContext__Group_1__0 ) )
            {
            // InternalMyDsl.g:1333:1: ( ( rule__TypeDeclContext__Group_1__0 ) )
            // InternalMyDsl.g:1334:2: ( rule__TypeDeclContext__Group_1__0 )
            {
             before(grammarAccess.getTypeDeclContextAccess().getGroup_1()); 
            // InternalMyDsl.g:1335:2: ( rule__TypeDeclContext__Group_1__0 )
            // InternalMyDsl.g:1335:3: rule__TypeDeclContext__Group_1__0
            {
            pushFollow(FOLLOW_2);
            rule__TypeDeclContext__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getTypeDeclContextAccess().getGroup_1()); 

            }


            }

        }
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
    // InternalMyDsl.g:1343:1: rule__TypeDeclContext__Group__2 : rule__TypeDeclContext__Group__2__Impl ;
    public final void rule__TypeDeclContext__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1347:1: ( rule__TypeDeclContext__Group__2__Impl )
            // InternalMyDsl.g:1348:2: rule__TypeDeclContext__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TypeDeclContext__Group__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalMyDsl.g:1354:1: rule__TypeDeclContext__Group__2__Impl : ( '>' ) ;
    public final void rule__TypeDeclContext__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1358:1: ( ( '>' ) )
            // InternalMyDsl.g:1359:1: ( '>' )
            {
            // InternalMyDsl.g:1359:1: ( '>' )
            // InternalMyDsl.g:1360:2: '>'
            {
             before(grammarAccess.getTypeDeclContextAccess().getGreaterThanSignKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getTypeDeclContextAccess().getGreaterThanSignKeyword_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__TypeDeclContext__Group_1__0"
    // InternalMyDsl.g:1370:1: rule__TypeDeclContext__Group_1__0 : rule__TypeDeclContext__Group_1__0__Impl rule__TypeDeclContext__Group_1__1 ;
    public final void rule__TypeDeclContext__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1374:1: ( rule__TypeDeclContext__Group_1__0__Impl rule__TypeDeclContext__Group_1__1 )
            // InternalMyDsl.g:1375:2: rule__TypeDeclContext__Group_1__0__Impl rule__TypeDeclContext__Group_1__1
            {
            pushFollow(FOLLOW_4);
            rule__TypeDeclContext__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeDeclContext__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDeclContext__Group_1__0"


    // $ANTLR start "rule__TypeDeclContext__Group_1__0__Impl"
    // InternalMyDsl.g:1382:1: rule__TypeDeclContext__Group_1__0__Impl : ( ',' ) ;
    public final void rule__TypeDeclContext__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1386:1: ( ( ',' ) )
            // InternalMyDsl.g:1387:1: ( ',' )
            {
            // InternalMyDsl.g:1387:1: ( ',' )
            // InternalMyDsl.g:1388:2: ','
            {
             before(grammarAccess.getTypeDeclContextAccess().getCommaKeyword_1_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getTypeDeclContextAccess().getCommaKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDeclContext__Group_1__0__Impl"


    // $ANTLR start "rule__TypeDeclContext__Group_1__1"
    // InternalMyDsl.g:1397:1: rule__TypeDeclContext__Group_1__1 : rule__TypeDeclContext__Group_1__1__Impl ;
    public final void rule__TypeDeclContext__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1401:1: ( rule__TypeDeclContext__Group_1__1__Impl )
            // InternalMyDsl.g:1402:2: rule__TypeDeclContext__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TypeDeclContext__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDeclContext__Group_1__1"


    // $ANTLR start "rule__TypeDeclContext__Group_1__1__Impl"
    // InternalMyDsl.g:1408:1: rule__TypeDeclContext__Group_1__1__Impl : ( ( rule__TypeDeclContext__TypeNameAssignment_1_1 ) ) ;
    public final void rule__TypeDeclContext__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1412:1: ( ( ( rule__TypeDeclContext__TypeNameAssignment_1_1 ) ) )
            // InternalMyDsl.g:1413:1: ( ( rule__TypeDeclContext__TypeNameAssignment_1_1 ) )
            {
            // InternalMyDsl.g:1413:1: ( ( rule__TypeDeclContext__TypeNameAssignment_1_1 ) )
            // InternalMyDsl.g:1414:2: ( rule__TypeDeclContext__TypeNameAssignment_1_1 )
            {
             before(grammarAccess.getTypeDeclContextAccess().getTypeNameAssignment_1_1()); 
            // InternalMyDsl.g:1415:2: ( rule__TypeDeclContext__TypeNameAssignment_1_1 )
            // InternalMyDsl.g:1415:3: rule__TypeDeclContext__TypeNameAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__TypeDeclContext__TypeNameAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getTypeDeclContextAccess().getTypeNameAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDeclContext__Group_1__1__Impl"


    // $ANTLR start "rule__Class__Group__0"
    // InternalMyDsl.g:1424:1: rule__Class__Group__0 : rule__Class__Group__0__Impl rule__Class__Group__1 ;
    public final void rule__Class__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1428:1: ( rule__Class__Group__0__Impl rule__Class__Group__1 )
            // InternalMyDsl.g:1429:2: rule__Class__Group__0__Impl rule__Class__Group__1
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
    // InternalMyDsl.g:1436:1: rule__Class__Group__0__Impl : ( 'Class' ) ;
    public final void rule__Class__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1440:1: ( ( 'Class' ) )
            // InternalMyDsl.g:1441:1: ( 'Class' )
            {
            // InternalMyDsl.g:1441:1: ( 'Class' )
            // InternalMyDsl.g:1442:2: 'Class'
            {
             before(grammarAccess.getClassAccess().getClassKeyword_0()); 
            match(input,17,FOLLOW_2); 
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
    // InternalMyDsl.g:1451:1: rule__Class__Group__1 : rule__Class__Group__1__Impl rule__Class__Group__2 ;
    public final void rule__Class__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1455:1: ( rule__Class__Group__1__Impl rule__Class__Group__2 )
            // InternalMyDsl.g:1456:2: rule__Class__Group__1__Impl rule__Class__Group__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalMyDsl.g:1463:1: rule__Class__Group__1__Impl : ( ( rule__Class__NameAssignment_1 ) ) ;
    public final void rule__Class__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1467:1: ( ( ( rule__Class__NameAssignment_1 ) ) )
            // InternalMyDsl.g:1468:1: ( ( rule__Class__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:1468:1: ( ( rule__Class__NameAssignment_1 ) )
            // InternalMyDsl.g:1469:2: ( rule__Class__NameAssignment_1 )
            {
             before(grammarAccess.getClassAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:1470:2: ( rule__Class__NameAssignment_1 )
            // InternalMyDsl.g:1470:3: rule__Class__NameAssignment_1
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
    // InternalMyDsl.g:1478:1: rule__Class__Group__2 : rule__Class__Group__2__Impl rule__Class__Group__3 ;
    public final void rule__Class__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1482:1: ( rule__Class__Group__2__Impl rule__Class__Group__3 )
            // InternalMyDsl.g:1483:2: rule__Class__Group__2__Impl rule__Class__Group__3
            {
            pushFollow(FOLLOW_13);
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
    // InternalMyDsl.g:1490:1: rule__Class__Group__2__Impl : ( ( rule__Class__ContextAssignment_2 )? ) ;
    public final void rule__Class__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1494:1: ( ( ( rule__Class__ContextAssignment_2 )? ) )
            // InternalMyDsl.g:1495:1: ( ( rule__Class__ContextAssignment_2 )? )
            {
            // InternalMyDsl.g:1495:1: ( ( rule__Class__ContextAssignment_2 )? )
            // InternalMyDsl.g:1496:2: ( rule__Class__ContextAssignment_2 )?
            {
             before(grammarAccess.getClassAccess().getContextAssignment_2()); 
            // InternalMyDsl.g:1497:2: ( rule__Class__ContextAssignment_2 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==13) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:1497:3: rule__Class__ContextAssignment_2
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
    // InternalMyDsl.g:1505:1: rule__Class__Group__3 : rule__Class__Group__3__Impl rule__Class__Group__4 ;
    public final void rule__Class__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1509:1: ( rule__Class__Group__3__Impl rule__Class__Group__4 )
            // InternalMyDsl.g:1510:2: rule__Class__Group__3__Impl rule__Class__Group__4
            {
            pushFollow(FOLLOW_14);
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
    // InternalMyDsl.g:1517:1: rule__Class__Group__3__Impl : ( '{' ) ;
    public final void rule__Class__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1521:1: ( ( '{' ) )
            // InternalMyDsl.g:1522:1: ( '{' )
            {
            // InternalMyDsl.g:1522:1: ( '{' )
            // InternalMyDsl.g:1523:2: '{'
            {
             before(grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
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
    // InternalMyDsl.g:1532:1: rule__Class__Group__4 : rule__Class__Group__4__Impl rule__Class__Group__5 ;
    public final void rule__Class__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1536:1: ( rule__Class__Group__4__Impl rule__Class__Group__5 )
            // InternalMyDsl.g:1537:2: rule__Class__Group__4__Impl rule__Class__Group__5
            {
            pushFollow(FOLLOW_14);
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
    // InternalMyDsl.g:1544:1: rule__Class__Group__4__Impl : ( ( rule__Class__BodyElementsAssignment_4 )* ) ;
    public final void rule__Class__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1548:1: ( ( ( rule__Class__BodyElementsAssignment_4 )* ) )
            // InternalMyDsl.g:1549:1: ( ( rule__Class__BodyElementsAssignment_4 )* )
            {
            // InternalMyDsl.g:1549:1: ( ( rule__Class__BodyElementsAssignment_4 )* )
            // InternalMyDsl.g:1550:2: ( rule__Class__BodyElementsAssignment_4 )*
            {
             before(grammarAccess.getClassAccess().getBodyElementsAssignment_4()); 
            // InternalMyDsl.g:1551:2: ( rule__Class__BodyElementsAssignment_4 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID||LA10_0==23) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMyDsl.g:1551:3: rule__Class__BodyElementsAssignment_4
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Class__BodyElementsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getClassAccess().getBodyElementsAssignment_4()); 

            }


            }

        }
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
    // InternalMyDsl.g:1559:1: rule__Class__Group__5 : rule__Class__Group__5__Impl ;
    public final void rule__Class__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1563:1: ( rule__Class__Group__5__Impl )
            // InternalMyDsl.g:1564:2: rule__Class__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group__5__Impl();

            state._fsp--;


            }

        }
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
    // InternalMyDsl.g:1570:1: rule__Class__Group__5__Impl : ( '}' ) ;
    public final void rule__Class__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1574:1: ( ( '}' ) )
            // InternalMyDsl.g:1575:1: ( '}' )
            {
            // InternalMyDsl.g:1575:1: ( '}' )
            // InternalMyDsl.g:1576:2: '}'
            {
             before(grammarAccess.getClassAccess().getRightCurlyBracketKeyword_5()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
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


    // $ANTLR start "rule__Datatype__Group__0"
    // InternalMyDsl.g:1586:1: rule__Datatype__Group__0 : rule__Datatype__Group__0__Impl rule__Datatype__Group__1 ;
    public final void rule__Datatype__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1590:1: ( rule__Datatype__Group__0__Impl rule__Datatype__Group__1 )
            // InternalMyDsl.g:1591:2: rule__Datatype__Group__0__Impl rule__Datatype__Group__1
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
    // InternalMyDsl.g:1598:1: rule__Datatype__Group__0__Impl : ( 'Datatype' ) ;
    public final void rule__Datatype__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1602:1: ( ( 'Datatype' ) )
            // InternalMyDsl.g:1603:1: ( 'Datatype' )
            {
            // InternalMyDsl.g:1603:1: ( 'Datatype' )
            // InternalMyDsl.g:1604:2: 'Datatype'
            {
             before(grammarAccess.getDatatypeAccess().getDatatypeKeyword_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalMyDsl.g:1613:1: rule__Datatype__Group__1 : rule__Datatype__Group__1__Impl rule__Datatype__Group__2 ;
    public final void rule__Datatype__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1617:1: ( rule__Datatype__Group__1__Impl rule__Datatype__Group__2 )
            // InternalMyDsl.g:1618:2: rule__Datatype__Group__1__Impl rule__Datatype__Group__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalMyDsl.g:1625:1: rule__Datatype__Group__1__Impl : ( ( rule__Datatype__NameAssignment_1 ) ) ;
    public final void rule__Datatype__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1629:1: ( ( ( rule__Datatype__NameAssignment_1 ) ) )
            // InternalMyDsl.g:1630:1: ( ( rule__Datatype__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:1630:1: ( ( rule__Datatype__NameAssignment_1 ) )
            // InternalMyDsl.g:1631:2: ( rule__Datatype__NameAssignment_1 )
            {
             before(grammarAccess.getDatatypeAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:1632:2: ( rule__Datatype__NameAssignment_1 )
            // InternalMyDsl.g:1632:3: rule__Datatype__NameAssignment_1
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
    // InternalMyDsl.g:1640:1: rule__Datatype__Group__2 : rule__Datatype__Group__2__Impl rule__Datatype__Group__3 ;
    public final void rule__Datatype__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1644:1: ( rule__Datatype__Group__2__Impl rule__Datatype__Group__3 )
            // InternalMyDsl.g:1645:2: rule__Datatype__Group__2__Impl rule__Datatype__Group__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalMyDsl.g:1652:1: rule__Datatype__Group__2__Impl : ( ( rule__Datatype__ContextAssignment_2 )? ) ;
    public final void rule__Datatype__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1656:1: ( ( ( rule__Datatype__ContextAssignment_2 )? ) )
            // InternalMyDsl.g:1657:1: ( ( rule__Datatype__ContextAssignment_2 )? )
            {
            // InternalMyDsl.g:1657:1: ( ( rule__Datatype__ContextAssignment_2 )? )
            // InternalMyDsl.g:1658:2: ( rule__Datatype__ContextAssignment_2 )?
            {
             before(grammarAccess.getDatatypeAccess().getContextAssignment_2()); 
            // InternalMyDsl.g:1659:2: ( rule__Datatype__ContextAssignment_2 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==13) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:1659:3: rule__Datatype__ContextAssignment_2
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
    // InternalMyDsl.g:1667:1: rule__Datatype__Group__3 : rule__Datatype__Group__3__Impl rule__Datatype__Group__4 ;
    public final void rule__Datatype__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1671:1: ( rule__Datatype__Group__3__Impl rule__Datatype__Group__4 )
            // InternalMyDsl.g:1672:2: rule__Datatype__Group__3__Impl rule__Datatype__Group__4
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
    // InternalMyDsl.g:1679:1: rule__Datatype__Group__3__Impl : ( ( rule__Datatype__ConstructorsAssignment_3 )* ) ;
    public final void rule__Datatype__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1683:1: ( ( ( rule__Datatype__ConstructorsAssignment_3 )* ) )
            // InternalMyDsl.g:1684:1: ( ( rule__Datatype__ConstructorsAssignment_3 )* )
            {
            // InternalMyDsl.g:1684:1: ( ( rule__Datatype__ConstructorsAssignment_3 )* )
            // InternalMyDsl.g:1685:2: ( rule__Datatype__ConstructorsAssignment_3 )*
            {
             before(grammarAccess.getDatatypeAccess().getConstructorsAssignment_3()); 
            // InternalMyDsl.g:1686:2: ( rule__Datatype__ConstructorsAssignment_3 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMyDsl.g:1686:3: rule__Datatype__ConstructorsAssignment_3
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Datatype__ConstructorsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalMyDsl.g:1694:1: rule__Datatype__Group__4 : rule__Datatype__Group__4__Impl rule__Datatype__Group__5 ;
    public final void rule__Datatype__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1698:1: ( rule__Datatype__Group__4__Impl rule__Datatype__Group__5 )
            // InternalMyDsl.g:1699:2: rule__Datatype__Group__4__Impl rule__Datatype__Group__5
            {
            pushFollow(FOLLOW_14);
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
    // InternalMyDsl.g:1706:1: rule__Datatype__Group__4__Impl : ( '{' ) ;
    public final void rule__Datatype__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1710:1: ( ( '{' ) )
            // InternalMyDsl.g:1711:1: ( '{' )
            {
            // InternalMyDsl.g:1711:1: ( '{' )
            // InternalMyDsl.g:1712:2: '{'
            {
             before(grammarAccess.getDatatypeAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,18,FOLLOW_2); 
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
    // InternalMyDsl.g:1721:1: rule__Datatype__Group__5 : rule__Datatype__Group__5__Impl rule__Datatype__Group__6 ;
    public final void rule__Datatype__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1725:1: ( rule__Datatype__Group__5__Impl rule__Datatype__Group__6 )
            // InternalMyDsl.g:1726:2: rule__Datatype__Group__5__Impl rule__Datatype__Group__6
            {
            pushFollow(FOLLOW_14);
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
    // InternalMyDsl.g:1733:1: rule__Datatype__Group__5__Impl : ( ( rule__Datatype__BodyElementsAssignment_5 )* ) ;
    public final void rule__Datatype__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1737:1: ( ( ( rule__Datatype__BodyElementsAssignment_5 )* ) )
            // InternalMyDsl.g:1738:1: ( ( rule__Datatype__BodyElementsAssignment_5 )* )
            {
            // InternalMyDsl.g:1738:1: ( ( rule__Datatype__BodyElementsAssignment_5 )* )
            // InternalMyDsl.g:1739:2: ( rule__Datatype__BodyElementsAssignment_5 )*
            {
             before(grammarAccess.getDatatypeAccess().getBodyElementsAssignment_5()); 
            // InternalMyDsl.g:1740:2: ( rule__Datatype__BodyElementsAssignment_5 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID||LA13_0==23) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMyDsl.g:1740:3: rule__Datatype__BodyElementsAssignment_5
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Datatype__BodyElementsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalMyDsl.g:1748:1: rule__Datatype__Group__6 : rule__Datatype__Group__6__Impl ;
    public final void rule__Datatype__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1752:1: ( rule__Datatype__Group__6__Impl )
            // InternalMyDsl.g:1753:2: rule__Datatype__Group__6__Impl
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
    // InternalMyDsl.g:1759:1: rule__Datatype__Group__6__Impl : ( '}' ) ;
    public final void rule__Datatype__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1763:1: ( ( '}' ) )
            // InternalMyDsl.g:1764:1: ( '}' )
            {
            // InternalMyDsl.g:1764:1: ( '}' )
            // InternalMyDsl.g:1765:2: '}'
            {
             before(grammarAccess.getDatatypeAccess().getRightCurlyBracketKeyword_6()); 
            match(input,19,FOLLOW_2); 
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
    // InternalMyDsl.g:1775:1: rule__Constructor__Group__0 : rule__Constructor__Group__0__Impl rule__Constructor__Group__1 ;
    public final void rule__Constructor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1779:1: ( rule__Constructor__Group__0__Impl rule__Constructor__Group__1 )
            // InternalMyDsl.g:1780:2: rule__Constructor__Group__0__Impl rule__Constructor__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalMyDsl.g:1787:1: rule__Constructor__Group__0__Impl : ( ( rule__Constructor__NameAssignment_0 ) ) ;
    public final void rule__Constructor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1791:1: ( ( ( rule__Constructor__NameAssignment_0 ) ) )
            // InternalMyDsl.g:1792:1: ( ( rule__Constructor__NameAssignment_0 ) )
            {
            // InternalMyDsl.g:1792:1: ( ( rule__Constructor__NameAssignment_0 ) )
            // InternalMyDsl.g:1793:2: ( rule__Constructor__NameAssignment_0 )
            {
             before(grammarAccess.getConstructorAccess().getNameAssignment_0()); 
            // InternalMyDsl.g:1794:2: ( rule__Constructor__NameAssignment_0 )
            // InternalMyDsl.g:1794:3: rule__Constructor__NameAssignment_0
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
    // InternalMyDsl.g:1802:1: rule__Constructor__Group__1 : rule__Constructor__Group__1__Impl rule__Constructor__Group__2 ;
    public final void rule__Constructor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1806:1: ( rule__Constructor__Group__1__Impl rule__Constructor__Group__2 )
            // InternalMyDsl.g:1807:2: rule__Constructor__Group__1__Impl rule__Constructor__Group__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalMyDsl.g:1814:1: rule__Constructor__Group__1__Impl : ( '(' ) ;
    public final void rule__Constructor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1818:1: ( ( '(' ) )
            // InternalMyDsl.g:1819:1: ( '(' )
            {
            // InternalMyDsl.g:1819:1: ( '(' )
            // InternalMyDsl.g:1820:2: '('
            {
             before(grammarAccess.getConstructorAccess().getLeftParenthesisKeyword_1()); 
            match(input,21,FOLLOW_2); 
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
    // InternalMyDsl.g:1829:1: rule__Constructor__Group__2 : rule__Constructor__Group__2__Impl rule__Constructor__Group__3 ;
    public final void rule__Constructor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1833:1: ( rule__Constructor__Group__2__Impl rule__Constructor__Group__3 )
            // InternalMyDsl.g:1834:2: rule__Constructor__Group__2__Impl rule__Constructor__Group__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalMyDsl.g:1841:1: rule__Constructor__Group__2__Impl : ( ( rule__Constructor__TypedVariablesAssignment_2 )* ) ;
    public final void rule__Constructor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1845:1: ( ( ( rule__Constructor__TypedVariablesAssignment_2 )* ) )
            // InternalMyDsl.g:1846:1: ( ( rule__Constructor__TypedVariablesAssignment_2 )* )
            {
            // InternalMyDsl.g:1846:1: ( ( rule__Constructor__TypedVariablesAssignment_2 )* )
            // InternalMyDsl.g:1847:2: ( rule__Constructor__TypedVariablesAssignment_2 )*
            {
             before(grammarAccess.getConstructorAccess().getTypedVariablesAssignment_2()); 
            // InternalMyDsl.g:1848:2: ( rule__Constructor__TypedVariablesAssignment_2 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMyDsl.g:1848:3: rule__Constructor__TypedVariablesAssignment_2
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Constructor__TypedVariablesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalMyDsl.g:1856:1: rule__Constructor__Group__3 : rule__Constructor__Group__3__Impl ;
    public final void rule__Constructor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1860:1: ( rule__Constructor__Group__3__Impl )
            // InternalMyDsl.g:1861:2: rule__Constructor__Group__3__Impl
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
    // InternalMyDsl.g:1867:1: rule__Constructor__Group__3__Impl : ( ')' ) ;
    public final void rule__Constructor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1871:1: ( ( ')' ) )
            // InternalMyDsl.g:1872:1: ( ')' )
            {
            // InternalMyDsl.g:1872:1: ( ')' )
            // InternalMyDsl.g:1873:2: ')'
            {
             before(grammarAccess.getConstructorAccess().getRightParenthesisKeyword_3()); 
            match(input,22,FOLLOW_2); 
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
    // InternalMyDsl.g:1883:1: rule__Extend__Group__0 : rule__Extend__Group__0__Impl rule__Extend__Group__1 ;
    public final void rule__Extend__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1887:1: ( rule__Extend__Group__0__Impl rule__Extend__Group__1 )
            // InternalMyDsl.g:1888:2: rule__Extend__Group__0__Impl rule__Extend__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalMyDsl.g:1895:1: rule__Extend__Group__0__Impl : ( ( rule__Extend__NameAssignment_0 ) ) ;
    public final void rule__Extend__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1899:1: ( ( ( rule__Extend__NameAssignment_0 ) ) )
            // InternalMyDsl.g:1900:1: ( ( rule__Extend__NameAssignment_0 ) )
            {
            // InternalMyDsl.g:1900:1: ( ( rule__Extend__NameAssignment_0 ) )
            // InternalMyDsl.g:1901:2: ( rule__Extend__NameAssignment_0 )
            {
             before(grammarAccess.getExtendAccess().getNameAssignment_0()); 
            // InternalMyDsl.g:1902:2: ( rule__Extend__NameAssignment_0 )
            // InternalMyDsl.g:1902:3: rule__Extend__NameAssignment_0
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
    // InternalMyDsl.g:1910:1: rule__Extend__Group__1 : rule__Extend__Group__1__Impl rule__Extend__Group__2 ;
    public final void rule__Extend__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1914:1: ( rule__Extend__Group__1__Impl rule__Extend__Group__2 )
            // InternalMyDsl.g:1915:2: rule__Extend__Group__1__Impl rule__Extend__Group__2
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
    // InternalMyDsl.g:1922:1: rule__Extend__Group__1__Impl : ( '(' ) ;
    public final void rule__Extend__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1926:1: ( ( '(' ) )
            // InternalMyDsl.g:1927:1: ( '(' )
            {
            // InternalMyDsl.g:1927:1: ( '(' )
            // InternalMyDsl.g:1928:2: '('
            {
             before(grammarAccess.getExtendAccess().getLeftParenthesisKeyword_1()); 
            match(input,21,FOLLOW_2); 
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
    // InternalMyDsl.g:1937:1: rule__Extend__Group__2 : rule__Extend__Group__2__Impl rule__Extend__Group__3 ;
    public final void rule__Extend__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1941:1: ( rule__Extend__Group__2__Impl rule__Extend__Group__3 )
            // InternalMyDsl.g:1942:2: rule__Extend__Group__2__Impl rule__Extend__Group__3
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
    // InternalMyDsl.g:1949:1: rule__Extend__Group__2__Impl : ( ( rule__Extend__ExtesnionAssignment_2 ) ) ;
    public final void rule__Extend__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1953:1: ( ( ( rule__Extend__ExtesnionAssignment_2 ) ) )
            // InternalMyDsl.g:1954:1: ( ( rule__Extend__ExtesnionAssignment_2 ) )
            {
            // InternalMyDsl.g:1954:1: ( ( rule__Extend__ExtesnionAssignment_2 ) )
            // InternalMyDsl.g:1955:2: ( rule__Extend__ExtesnionAssignment_2 )
            {
             before(grammarAccess.getExtendAccess().getExtesnionAssignment_2()); 
            // InternalMyDsl.g:1956:2: ( rule__Extend__ExtesnionAssignment_2 )
            // InternalMyDsl.g:1956:3: rule__Extend__ExtesnionAssignment_2
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
    // InternalMyDsl.g:1964:1: rule__Extend__Group__3 : rule__Extend__Group__3__Impl rule__Extend__Group__4 ;
    public final void rule__Extend__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1968:1: ( rule__Extend__Group__3__Impl rule__Extend__Group__4 )
            // InternalMyDsl.g:1969:2: rule__Extend__Group__3__Impl rule__Extend__Group__4
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
    // InternalMyDsl.g:1976:1: rule__Extend__Group__3__Impl : ( ')' ) ;
    public final void rule__Extend__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1980:1: ( ( ')' ) )
            // InternalMyDsl.g:1981:1: ( ')' )
            {
            // InternalMyDsl.g:1981:1: ( ')' )
            // InternalMyDsl.g:1982:2: ')'
            {
             before(grammarAccess.getExtendAccess().getRightParenthesisKeyword_3()); 
            match(input,22,FOLLOW_2); 
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
    // InternalMyDsl.g:1991:1: rule__Extend__Group__4 : rule__Extend__Group__4__Impl rule__Extend__Group__5 ;
    public final void rule__Extend__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1995:1: ( rule__Extend__Group__4__Impl rule__Extend__Group__5 )
            // InternalMyDsl.g:1996:2: rule__Extend__Group__4__Impl rule__Extend__Group__5
            {
            pushFollow(FOLLOW_14);
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
    // InternalMyDsl.g:2003:1: rule__Extend__Group__4__Impl : ( '{' ) ;
    public final void rule__Extend__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2007:1: ( ( '{' ) )
            // InternalMyDsl.g:2008:1: ( '{' )
            {
            // InternalMyDsl.g:2008:1: ( '{' )
            // InternalMyDsl.g:2009:2: '{'
            {
             before(grammarAccess.getExtendAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,18,FOLLOW_2); 
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
    // InternalMyDsl.g:2018:1: rule__Extend__Group__5 : rule__Extend__Group__5__Impl rule__Extend__Group__6 ;
    public final void rule__Extend__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2022:1: ( rule__Extend__Group__5__Impl rule__Extend__Group__6 )
            // InternalMyDsl.g:2023:2: rule__Extend__Group__5__Impl rule__Extend__Group__6
            {
            pushFollow(FOLLOW_14);
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
    // InternalMyDsl.g:2030:1: rule__Extend__Group__5__Impl : ( ( rule__Extend__BodyElementsAssignment_5 )* ) ;
    public final void rule__Extend__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2034:1: ( ( ( rule__Extend__BodyElementsAssignment_5 )* ) )
            // InternalMyDsl.g:2035:1: ( ( rule__Extend__BodyElementsAssignment_5 )* )
            {
            // InternalMyDsl.g:2035:1: ( ( rule__Extend__BodyElementsAssignment_5 )* )
            // InternalMyDsl.g:2036:2: ( rule__Extend__BodyElementsAssignment_5 )*
            {
             before(grammarAccess.getExtendAccess().getBodyElementsAssignment_5()); 
            // InternalMyDsl.g:2037:2: ( rule__Extend__BodyElementsAssignment_5 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID||LA15_0==23) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalMyDsl.g:2037:3: rule__Extend__BodyElementsAssignment_5
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Extend__BodyElementsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalMyDsl.g:2045:1: rule__Extend__Group__6 : rule__Extend__Group__6__Impl ;
    public final void rule__Extend__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2049:1: ( rule__Extend__Group__6__Impl )
            // InternalMyDsl.g:2050:2: rule__Extend__Group__6__Impl
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
    // InternalMyDsl.g:2056:1: rule__Extend__Group__6__Impl : ( '}' ) ;
    public final void rule__Extend__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2060:1: ( ( '}' ) )
            // InternalMyDsl.g:2061:1: ( '}' )
            {
            // InternalMyDsl.g:2061:1: ( '}' )
            // InternalMyDsl.g:2062:2: '}'
            {
             before(grammarAccess.getExtendAccess().getRightCurlyBracketKeyword_6()); 
            match(input,19,FOLLOW_2); 
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
    // InternalMyDsl.g:2072:1: rule__FunctionDecl__Group__0 : rule__FunctionDecl__Group__0__Impl rule__FunctionDecl__Group__1 ;
    public final void rule__FunctionDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2076:1: ( rule__FunctionDecl__Group__0__Impl rule__FunctionDecl__Group__1 )
            // InternalMyDsl.g:2077:2: rule__FunctionDecl__Group__0__Impl rule__FunctionDecl__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalMyDsl.g:2084:1: rule__FunctionDecl__Group__0__Impl : ( ( rule__FunctionDecl__NameAssignment_0 ) ) ;
    public final void rule__FunctionDecl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2088:1: ( ( ( rule__FunctionDecl__NameAssignment_0 ) ) )
            // InternalMyDsl.g:2089:1: ( ( rule__FunctionDecl__NameAssignment_0 ) )
            {
            // InternalMyDsl.g:2089:1: ( ( rule__FunctionDecl__NameAssignment_0 ) )
            // InternalMyDsl.g:2090:2: ( rule__FunctionDecl__NameAssignment_0 )
            {
             before(grammarAccess.getFunctionDeclAccess().getNameAssignment_0()); 
            // InternalMyDsl.g:2091:2: ( rule__FunctionDecl__NameAssignment_0 )
            // InternalMyDsl.g:2091:3: rule__FunctionDecl__NameAssignment_0
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
    // InternalMyDsl.g:2099:1: rule__FunctionDecl__Group__1 : rule__FunctionDecl__Group__1__Impl rule__FunctionDecl__Group__2 ;
    public final void rule__FunctionDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2103:1: ( rule__FunctionDecl__Group__1__Impl rule__FunctionDecl__Group__2 )
            // InternalMyDsl.g:2104:2: rule__FunctionDecl__Group__1__Impl rule__FunctionDecl__Group__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalMyDsl.g:2111:1: rule__FunctionDecl__Group__1__Impl : ( '(' ) ;
    public final void rule__FunctionDecl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2115:1: ( ( '(' ) )
            // InternalMyDsl.g:2116:1: ( '(' )
            {
            // InternalMyDsl.g:2116:1: ( '(' )
            // InternalMyDsl.g:2117:2: '('
            {
             before(grammarAccess.getFunctionDeclAccess().getLeftParenthesisKeyword_1()); 
            match(input,21,FOLLOW_2); 
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
    // InternalMyDsl.g:2126:1: rule__FunctionDecl__Group__2 : rule__FunctionDecl__Group__2__Impl rule__FunctionDecl__Group__3 ;
    public final void rule__FunctionDecl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2130:1: ( rule__FunctionDecl__Group__2__Impl rule__FunctionDecl__Group__3 )
            // InternalMyDsl.g:2131:2: rule__FunctionDecl__Group__2__Impl rule__FunctionDecl__Group__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalMyDsl.g:2138:1: rule__FunctionDecl__Group__2__Impl : ( ( rule__FunctionDecl__TypeVariablesAssignment_2 )* ) ;
    public final void rule__FunctionDecl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2142:1: ( ( ( rule__FunctionDecl__TypeVariablesAssignment_2 )* ) )
            // InternalMyDsl.g:2143:1: ( ( rule__FunctionDecl__TypeVariablesAssignment_2 )* )
            {
            // InternalMyDsl.g:2143:1: ( ( rule__FunctionDecl__TypeVariablesAssignment_2 )* )
            // InternalMyDsl.g:2144:2: ( rule__FunctionDecl__TypeVariablesAssignment_2 )*
            {
             before(grammarAccess.getFunctionDeclAccess().getTypeVariablesAssignment_2()); 
            // InternalMyDsl.g:2145:2: ( rule__FunctionDecl__TypeVariablesAssignment_2 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalMyDsl.g:2145:3: rule__FunctionDecl__TypeVariablesAssignment_2
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__FunctionDecl__TypeVariablesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalMyDsl.g:2153:1: rule__FunctionDecl__Group__3 : rule__FunctionDecl__Group__3__Impl ;
    public final void rule__FunctionDecl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2157:1: ( rule__FunctionDecl__Group__3__Impl )
            // InternalMyDsl.g:2158:2: rule__FunctionDecl__Group__3__Impl
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
    // InternalMyDsl.g:2164:1: rule__FunctionDecl__Group__3__Impl : ( ')' ) ;
    public final void rule__FunctionDecl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2168:1: ( ( ')' ) )
            // InternalMyDsl.g:2169:1: ( ')' )
            {
            // InternalMyDsl.g:2169:1: ( ')' )
            // InternalMyDsl.g:2170:2: ')'
            {
             before(grammarAccess.getFunctionDeclAccess().getRightParenthesisKeyword_3()); 
            match(input,22,FOLLOW_2); 
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
    // InternalMyDsl.g:2180:1: rule__TheoremBody__Group__0 : rule__TheoremBody__Group__0__Impl rule__TheoremBody__Group__1 ;
    public final void rule__TheoremBody__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2184:1: ( rule__TheoremBody__Group__0__Impl rule__TheoremBody__Group__1 )
            // InternalMyDsl.g:2185:2: rule__TheoremBody__Group__0__Impl rule__TheoremBody__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalMyDsl.g:2192:1: rule__TheoremBody__Group__0__Impl : ( 'Theorems' ) ;
    public final void rule__TheoremBody__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2196:1: ( ( 'Theorems' ) )
            // InternalMyDsl.g:2197:1: ( 'Theorems' )
            {
            // InternalMyDsl.g:2197:1: ( 'Theorems' )
            // InternalMyDsl.g:2198:2: 'Theorems'
            {
             before(grammarAccess.getTheoremBodyAccess().getTheoremsKeyword_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalMyDsl.g:2207:1: rule__TheoremBody__Group__1 : rule__TheoremBody__Group__1__Impl rule__TheoremBody__Group__2 ;
    public final void rule__TheoremBody__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2211:1: ( rule__TheoremBody__Group__1__Impl rule__TheoremBody__Group__2 )
            // InternalMyDsl.g:2212:2: rule__TheoremBody__Group__1__Impl rule__TheoremBody__Group__2
            {
            pushFollow(FOLLOW_21);
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
    // InternalMyDsl.g:2219:1: rule__TheoremBody__Group__1__Impl : ( '{' ) ;
    public final void rule__TheoremBody__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2223:1: ( ( '{' ) )
            // InternalMyDsl.g:2224:1: ( '{' )
            {
            // InternalMyDsl.g:2224:1: ( '{' )
            // InternalMyDsl.g:2225:2: '{'
            {
             before(grammarAccess.getTheoremBodyAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,18,FOLLOW_2); 
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
    // InternalMyDsl.g:2234:1: rule__TheoremBody__Group__2 : rule__TheoremBody__Group__2__Impl ;
    public final void rule__TheoremBody__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2238:1: ( rule__TheoremBody__Group__2__Impl )
            // InternalMyDsl.g:2239:2: rule__TheoremBody__Group__2__Impl
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
    // InternalMyDsl.g:2245:1: rule__TheoremBody__Group__2__Impl : ( '}' ) ;
    public final void rule__TheoremBody__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2249:1: ( ( '}' ) )
            // InternalMyDsl.g:2250:1: ( '}' )
            {
            // InternalMyDsl.g:2250:1: ( '}' )
            // InternalMyDsl.g:2251:2: '}'
            {
             before(grammarAccess.getTheoremBodyAccess().getRightCurlyBracketKeyword_2()); 
            match(input,19,FOLLOW_2); 
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
    // InternalMyDsl.g:2261:1: rule__DomainModel__ElementsAssignment : ( ruleTopLevel ) ;
    public final void rule__DomainModel__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2265:1: ( ( ruleTopLevel ) )
            // InternalMyDsl.g:2266:2: ( ruleTopLevel )
            {
            // InternalMyDsl.g:2266:2: ( ruleTopLevel )
            // InternalMyDsl.g:2267:3: ruleTopLevel
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


    // $ANTLR start "rule__ImportSatement__ImportsAssignment_1"
    // InternalMyDsl.g:2276:1: rule__ImportSatement__ImportsAssignment_1 : ( ruleImport ) ;
    public final void rule__ImportSatement__ImportsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2280:1: ( ( ruleImport ) )
            // InternalMyDsl.g:2281:2: ( ruleImport )
            {
            // InternalMyDsl.g:2281:2: ( ruleImport )
            // InternalMyDsl.g:2282:3: ruleImport
            {
             before(grammarAccess.getImportSatementAccess().getImportsImportParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getImportSatementAccess().getImportsImportParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportSatement__ImportsAssignment_1"


    // $ANTLR start "rule__Import__ImportNameAssignment_0"
    // InternalMyDsl.g:2291:1: rule__Import__ImportNameAssignment_0 : ( ruleImportComponent ) ;
    public final void rule__Import__ImportNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2295:1: ( ( ruleImportComponent ) )
            // InternalMyDsl.g:2296:2: ( ruleImportComponent )
            {
            // InternalMyDsl.g:2296:2: ( ruleImportComponent )
            // InternalMyDsl.g:2297:3: ruleImportComponent
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
    // InternalMyDsl.g:2306:1: rule__Import__ImportNameAssignment_1_1 : ( ruleImportComponent ) ;
    public final void rule__Import__ImportNameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2310:1: ( ( ruleImportComponent ) )
            // InternalMyDsl.g:2311:2: ( ruleImportComponent )
            {
            // InternalMyDsl.g:2311:2: ( ruleImportComponent )
            // InternalMyDsl.g:2312:3: ruleImportComponent
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
    // InternalMyDsl.g:2321:1: rule__ImportComponent__NameAssignment : ( RULE_ID ) ;
    public final void rule__ImportComponent__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2325:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:2326:2: ( RULE_ID )
            {
            // InternalMyDsl.g:2326:2: ( RULE_ID )
            // InternalMyDsl.g:2327:3: RULE_ID
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


    // $ANTLR start "rule__PolyContext__PolyTypesAssignment_1"
    // InternalMyDsl.g:2336:1: rule__PolyContext__PolyTypesAssignment_1 : ( rulePolyContextTypes ) ;
    public final void rule__PolyContext__PolyTypesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2340:1: ( ( rulePolyContextTypes ) )
            // InternalMyDsl.g:2341:2: ( rulePolyContextTypes )
            {
            // InternalMyDsl.g:2341:2: ( rulePolyContextTypes )
            // InternalMyDsl.g:2342:3: rulePolyContextTypes
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
    // InternalMyDsl.g:2351:1: rule__PolyContextTypes__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__PolyContextTypes__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2355:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:2356:2: ( RULE_ID )
            {
            // InternalMyDsl.g:2356:2: ( RULE_ID )
            // InternalMyDsl.g:2357:3: RULE_ID
            {
             before(grammarAccess.getPolyContextTypesAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPolyContextTypesAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
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
    // InternalMyDsl.g:2366:1: rule__PolyContextTypes__ConstraintsAssignment_1 : ( ruleTypeConstraints ) ;
    public final void rule__PolyContextTypes__ConstraintsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2370:1: ( ( ruleTypeConstraints ) )
            // InternalMyDsl.g:2371:2: ( ruleTypeConstraints )
            {
            // InternalMyDsl.g:2371:2: ( ruleTypeConstraints )
            // InternalMyDsl.g:2372:3: ruleTypeConstraints
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
    // InternalMyDsl.g:2381:1: rule__TypeConstraints__TypeNameAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__TypeConstraints__TypeNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2385:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:2386:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:2386:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:2387:3: ( RULE_ID )
            {
             before(grammarAccess.getTypeConstraintsAccess().getTypeNameTypeNameCrossReference_1_0()); 
            // InternalMyDsl.g:2388:3: ( RULE_ID )
            // InternalMyDsl.g:2389:4: RULE_ID
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
    // InternalMyDsl.g:2400:1: rule__TypeConstraints__TypeNameAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__TypeConstraints__TypeNameAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2404:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:2405:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:2405:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:2406:3: ( RULE_ID )
            {
             before(grammarAccess.getTypeConstraintsAccess().getTypeNameTypeNameCrossReference_2_1_0()); 
            // InternalMyDsl.g:2407:3: ( RULE_ID )
            // InternalMyDsl.g:2408:4: RULE_ID
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
    // InternalMyDsl.g:2419:1: rule__TypedVariable__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__TypedVariable__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2423:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:2424:2: ( RULE_ID )
            {
            // InternalMyDsl.g:2424:2: ( RULE_ID )
            // InternalMyDsl.g:2425:3: RULE_ID
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
    // InternalMyDsl.g:2434:1: rule__TypedVariable__ConstraintsAssignment_1 : ( ruleTypeConstraints ) ;
    public final void rule__TypedVariable__ConstraintsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2438:1: ( ( ruleTypeConstraints ) )
            // InternalMyDsl.g:2439:2: ( ruleTypeConstraints )
            {
            // InternalMyDsl.g:2439:2: ( ruleTypeConstraints )
            // InternalMyDsl.g:2440:3: ruleTypeConstraints
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


    // $ANTLR start "rule__TypeDeclaration__TypeNameAssignment_0"
    // InternalMyDsl.g:2449:1: rule__TypeDeclaration__TypeNameAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__TypeDeclaration__TypeNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2453:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:2454:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:2454:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:2455:3: ( RULE_ID )
            {
             before(grammarAccess.getTypeDeclarationAccess().getTypeNameTypeNameCrossReference_0_0()); 
            // InternalMyDsl.g:2456:3: ( RULE_ID )
            // InternalMyDsl.g:2457:4: RULE_ID
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
    // InternalMyDsl.g:2468:1: rule__TypeDeclaration__ContextAssignment_1 : ( ruleTypeDeclContext ) ;
    public final void rule__TypeDeclaration__ContextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2472:1: ( ( ruleTypeDeclContext ) )
            // InternalMyDsl.g:2473:2: ( ruleTypeDeclContext )
            {
            // InternalMyDsl.g:2473:2: ( ruleTypeDeclContext )
            // InternalMyDsl.g:2474:3: ruleTypeDeclContext
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


    // $ANTLR start "rule__TypeDeclContext__TypeNameAssignment_1_1"
    // InternalMyDsl.g:2483:1: rule__TypeDeclContext__TypeNameAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__TypeDeclContext__TypeNameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2487:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:2488:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:2488:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:2489:3: ( RULE_ID )
            {
             before(grammarAccess.getTypeDeclContextAccess().getTypeNameTypeNameCrossReference_1_1_0()); 
            // InternalMyDsl.g:2490:3: ( RULE_ID )
            // InternalMyDsl.g:2491:4: RULE_ID
            {
             before(grammarAccess.getTypeDeclContextAccess().getTypeNameTypeNameIDTerminalRuleCall_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTypeDeclContextAccess().getTypeNameTypeNameIDTerminalRuleCall_1_1_0_1()); 

            }

             after(grammarAccess.getTypeDeclContextAccess().getTypeNameTypeNameCrossReference_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDeclContext__TypeNameAssignment_1_1"


    // $ANTLR start "rule__TypeName__NameAssignment"
    // InternalMyDsl.g:2502:1: rule__TypeName__NameAssignment : ( RULE_ID ) ;
    public final void rule__TypeName__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2506:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:2507:2: ( RULE_ID )
            {
            // InternalMyDsl.g:2507:2: ( RULE_ID )
            // InternalMyDsl.g:2508:3: RULE_ID
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


    // $ANTLR start "rule__FunctionName__NameAssignment"
    // InternalMyDsl.g:2517:1: rule__FunctionName__NameAssignment : ( RULE_ID ) ;
    public final void rule__FunctionName__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2521:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:2522:2: ( RULE_ID )
            {
            // InternalMyDsl.g:2522:2: ( RULE_ID )
            // InternalMyDsl.g:2523:3: RULE_ID
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


    // $ANTLR start "rule__Class__NameAssignment_1"
    // InternalMyDsl.g:2532:1: rule__Class__NameAssignment_1 : ( ruleTypeName ) ;
    public final void rule__Class__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2536:1: ( ( ruleTypeName ) )
            // InternalMyDsl.g:2537:2: ( ruleTypeName )
            {
            // InternalMyDsl.g:2537:2: ( ruleTypeName )
            // InternalMyDsl.g:2538:3: ruleTypeName
            {
             before(grammarAccess.getClassAccess().getNameTypeNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTypeName();

            state._fsp--;

             after(grammarAccess.getClassAccess().getNameTypeNameParserRuleCall_1_0()); 

            }


            }

        }
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
    // InternalMyDsl.g:2547:1: rule__Class__ContextAssignment_2 : ( rulePolyContext ) ;
    public final void rule__Class__ContextAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2551:1: ( ( rulePolyContext ) )
            // InternalMyDsl.g:2552:2: ( rulePolyContext )
            {
            // InternalMyDsl.g:2552:2: ( rulePolyContext )
            // InternalMyDsl.g:2553:3: rulePolyContext
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


    // $ANTLR start "rule__Class__BodyElementsAssignment_4"
    // InternalMyDsl.g:2562:1: rule__Class__BodyElementsAssignment_4 : ( ruleTypeBodyElements ) ;
    public final void rule__Class__BodyElementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2566:1: ( ( ruleTypeBodyElements ) )
            // InternalMyDsl.g:2567:2: ( ruleTypeBodyElements )
            {
            // InternalMyDsl.g:2567:2: ( ruleTypeBodyElements )
            // InternalMyDsl.g:2568:3: ruleTypeBodyElements
            {
             before(grammarAccess.getClassAccess().getBodyElementsTypeBodyElementsParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleTypeBodyElements();

            state._fsp--;

             after(grammarAccess.getClassAccess().getBodyElementsTypeBodyElementsParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__BodyElementsAssignment_4"


    // $ANTLR start "rule__Datatype__NameAssignment_1"
    // InternalMyDsl.g:2577:1: rule__Datatype__NameAssignment_1 : ( ruleTypeName ) ;
    public final void rule__Datatype__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2581:1: ( ( ruleTypeName ) )
            // InternalMyDsl.g:2582:2: ( ruleTypeName )
            {
            // InternalMyDsl.g:2582:2: ( ruleTypeName )
            // InternalMyDsl.g:2583:3: ruleTypeName
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
    // InternalMyDsl.g:2592:1: rule__Datatype__ContextAssignment_2 : ( rulePolyContext ) ;
    public final void rule__Datatype__ContextAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2596:1: ( ( rulePolyContext ) )
            // InternalMyDsl.g:2597:2: ( rulePolyContext )
            {
            // InternalMyDsl.g:2597:2: ( rulePolyContext )
            // InternalMyDsl.g:2598:3: rulePolyContext
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
    // InternalMyDsl.g:2607:1: rule__Datatype__ConstructorsAssignment_3 : ( ruleDatatypeConstructor ) ;
    public final void rule__Datatype__ConstructorsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2611:1: ( ( ruleDatatypeConstructor ) )
            // InternalMyDsl.g:2612:2: ( ruleDatatypeConstructor )
            {
            // InternalMyDsl.g:2612:2: ( ruleDatatypeConstructor )
            // InternalMyDsl.g:2613:3: ruleDatatypeConstructor
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
    // InternalMyDsl.g:2622:1: rule__Datatype__BodyElementsAssignment_5 : ( ruleTypeBodyElements ) ;
    public final void rule__Datatype__BodyElementsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2626:1: ( ( ruleTypeBodyElements ) )
            // InternalMyDsl.g:2627:2: ( ruleTypeBodyElements )
            {
            // InternalMyDsl.g:2627:2: ( ruleTypeBodyElements )
            // InternalMyDsl.g:2628:3: ruleTypeBodyElements
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
    // InternalMyDsl.g:2637:1: rule__BaseConstructor__NameAssignment : ( RULE_ID ) ;
    public final void rule__BaseConstructor__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2641:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:2642:2: ( RULE_ID )
            {
            // InternalMyDsl.g:2642:2: ( RULE_ID )
            // InternalMyDsl.g:2643:3: RULE_ID
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
    // InternalMyDsl.g:2652:1: rule__Constructor__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Constructor__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2656:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:2657:2: ( RULE_ID )
            {
            // InternalMyDsl.g:2657:2: ( RULE_ID )
            // InternalMyDsl.g:2658:3: RULE_ID
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
    // InternalMyDsl.g:2667:1: rule__Constructor__TypedVariablesAssignment_2 : ( ruleTypedVariable ) ;
    public final void rule__Constructor__TypedVariablesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2671:1: ( ( ruleTypedVariable ) )
            // InternalMyDsl.g:2672:2: ( ruleTypedVariable )
            {
            // InternalMyDsl.g:2672:2: ( ruleTypedVariable )
            // InternalMyDsl.g:2673:3: ruleTypedVariable
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
    // InternalMyDsl.g:2682:1: rule__Extend__NameAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Extend__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2686:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:2687:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:2687:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:2688:3: ( RULE_ID )
            {
             before(grammarAccess.getExtendAccess().getNameTypeNameCrossReference_0_0()); 
            // InternalMyDsl.g:2689:3: ( RULE_ID )
            // InternalMyDsl.g:2690:4: RULE_ID
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
    // InternalMyDsl.g:2701:1: rule__Extend__ExtesnionAssignment_2 : ( RULE_ID ) ;
    public final void rule__Extend__ExtesnionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2705:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:2706:2: ( RULE_ID )
            {
            // InternalMyDsl.g:2706:2: ( RULE_ID )
            // InternalMyDsl.g:2707:3: RULE_ID
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
    // InternalMyDsl.g:2716:1: rule__Extend__BodyElementsAssignment_5 : ( ruleTypeBodyElements ) ;
    public final void rule__Extend__BodyElementsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2720:1: ( ( ruleTypeBodyElements ) )
            // InternalMyDsl.g:2721:2: ( ruleTypeBodyElements )
            {
            // InternalMyDsl.g:2721:2: ( ruleTypeBodyElements )
            // InternalMyDsl.g:2722:3: ruleTypeBodyElements
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
    // InternalMyDsl.g:2731:1: rule__TypeBodyElements__FunctionsAssignment_0 : ( ruleFunctionDecl ) ;
    public final void rule__TypeBodyElements__FunctionsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2735:1: ( ( ruleFunctionDecl ) )
            // InternalMyDsl.g:2736:2: ( ruleFunctionDecl )
            {
            // InternalMyDsl.g:2736:2: ( ruleFunctionDecl )
            // InternalMyDsl.g:2737:3: ruleFunctionDecl
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
    // InternalMyDsl.g:2746:1: rule__TypeBodyElements__TheoremsAssignment_1 : ( ruleTheoremBody ) ;
    public final void rule__TypeBodyElements__TheoremsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2750:1: ( ( ruleTheoremBody ) )
            // InternalMyDsl.g:2751:2: ( ruleTheoremBody )
            {
            // InternalMyDsl.g:2751:2: ( ruleTheoremBody )
            // InternalMyDsl.g:2752:3: ruleTheoremBody
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
    // InternalMyDsl.g:2761:1: rule__FunctionDecl__NameAssignment_0 : ( ruleFunctionName ) ;
    public final void rule__FunctionDecl__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2765:1: ( ( ruleFunctionName ) )
            // InternalMyDsl.g:2766:2: ( ruleFunctionName )
            {
            // InternalMyDsl.g:2766:2: ( ruleFunctionName )
            // InternalMyDsl.g:2767:3: ruleFunctionName
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
    // InternalMyDsl.g:2776:1: rule__FunctionDecl__TypeVariablesAssignment_2 : ( ruleTypedVariable ) ;
    public final void rule__FunctionDecl__TypeVariablesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2780:1: ( ( ruleTypedVariable ) )
            // InternalMyDsl.g:2781:2: ( ruleTypedVariable )
            {
            // InternalMyDsl.g:2781:2: ( ruleTypedVariable )
            // InternalMyDsl.g:2782:3: ruleTypedVariable
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
    // InternalMyDsl.g:2791:1: rule__Expression__NameAssignment : ( RULE_ID ) ;
    public final void rule__Expression__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2795:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:2796:2: ( RULE_ID )
            {
            // InternalMyDsl.g:2796:2: ( RULE_ID )
            // InternalMyDsl.g:2797:3: RULE_ID
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000120812L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000042000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000880010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800012L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000042010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000080000L});

}