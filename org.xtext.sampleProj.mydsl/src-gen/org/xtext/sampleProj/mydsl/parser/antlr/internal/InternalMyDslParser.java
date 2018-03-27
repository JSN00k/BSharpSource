package org.xtext.sampleProj.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.sampleProj.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_WS", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ANY_OTHER", "':'", "'Import'", "'.'", "'Class'", "';'", "'{'", "'}'", "'<'", "'>'", "','", "'\\u00D7'", "'\\u2192'", "'\\uE102'", "'\\uE100'", "'\\u2194'", "'\\u2916'", "'\\u21F8'", "'\\u21A3'", "'\\u2900'", "'\\u21A0'", "'('", "')'", "'where'", "'Datatype'", "'|'", "'match'", "'Theorems'"
    };
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
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

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "DomainModel";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleDomainModel"
    // InternalMyDsl.g:64:1: entryRuleDomainModel returns [EObject current=null] : iv_ruleDomainModel= ruleDomainModel EOF ;
    public final EObject entryRuleDomainModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainModel = null;


        try {
            // InternalMyDsl.g:64:52: (iv_ruleDomainModel= ruleDomainModel EOF )
            // InternalMyDsl.g:65:2: iv_ruleDomainModel= ruleDomainModel EOF
            {
             newCompositeNode(grammarAccess.getDomainModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDomainModel=ruleDomainModel();

            state._fsp--;

             current =iv_ruleDomainModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDomainModel"


    // $ANTLR start "ruleDomainModel"
    // InternalMyDsl.g:71:1: ruleDomainModel returns [EObject current=null] : ( (lv_elements_0_0= ruleTopLevel ) )* ;
    public final EObject ruleDomainModel() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( ( (lv_elements_0_0= ruleTopLevel ) )* )
            // InternalMyDsl.g:78:2: ( (lv_elements_0_0= ruleTopLevel ) )*
            {
            // InternalMyDsl.g:78:2: ( (lv_elements_0_0= ruleTopLevel ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||LA1_0==12||LA1_0==14||LA1_0==34) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:79:3: (lv_elements_0_0= ruleTopLevel )
            	    {
            	    // InternalMyDsl.g:79:3: (lv_elements_0_0= ruleTopLevel )
            	    // InternalMyDsl.g:80:4: lv_elements_0_0= ruleTopLevel
            	    {

            	    				newCompositeNode(grammarAccess.getDomainModelAccess().getElementsTopLevelParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_elements_0_0=ruleTopLevel();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getDomainModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"elements",
            	    					lv_elements_0_0,
            	    					"org.xtext.sampleProj.mydsl.MyDsl.TopLevel");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDomainModel"


    // $ANTLR start "entryRuleTHM_NAME"
    // InternalMyDsl.g:100:1: entryRuleTHM_NAME returns [String current=null] : iv_ruleTHM_NAME= ruleTHM_NAME EOF ;
    public final String entryRuleTHM_NAME() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTHM_NAME = null;


        try {
            // InternalMyDsl.g:100:48: (iv_ruleTHM_NAME= ruleTHM_NAME EOF )
            // InternalMyDsl.g:101:2: iv_ruleTHM_NAME= ruleTHM_NAME EOF
            {
             newCompositeNode(grammarAccess.getTHM_NAMERule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTHM_NAME=ruleTHM_NAME();

            state._fsp--;

             current =iv_ruleTHM_NAME.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTHM_NAME"


    // $ANTLR start "ruleTHM_NAME"
    // InternalMyDsl.g:107:1: ruleTHM_NAME returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_ID_0= RULE_ID | this_WS_1= RULE_WS )* kw= ':' ) ;
    public final AntlrDatatypeRuleToken ruleTHM_NAME() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_WS_1=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:113:2: ( ( (this_ID_0= RULE_ID | this_WS_1= RULE_WS )* kw= ':' ) )
            // InternalMyDsl.g:114:2: ( (this_ID_0= RULE_ID | this_WS_1= RULE_WS )* kw= ':' )
            {
            // InternalMyDsl.g:114:2: ( (this_ID_0= RULE_ID | this_WS_1= RULE_WS )* kw= ':' )
            // InternalMyDsl.g:115:3: (this_ID_0= RULE_ID | this_WS_1= RULE_WS )* kw= ':'
            {
            // InternalMyDsl.g:115:3: (this_ID_0= RULE_ID | this_WS_1= RULE_WS )*
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }
                else if ( (LA2_0==RULE_WS) ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:116:4: this_ID_0= RULE_ID
            	    {
            	    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            	    				current.merge(this_ID_0);
            	    			

            	    				newLeafNode(this_ID_0, grammarAccess.getTHM_NAMEAccess().getIDTerminalRuleCall_0_0());
            	    			

            	    }
            	    break;
            	case 2 :
            	    // InternalMyDsl.g:124:4: this_WS_1= RULE_WS
            	    {
            	    this_WS_1=(Token)match(input,RULE_WS,FOLLOW_4); 

            	    				current.merge(this_WS_1);
            	    			

            	    				newLeafNode(this_WS_1, grammarAccess.getTHM_NAMEAccess().getWSTerminalRuleCall_0_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            kw=(Token)match(input,11,FOLLOW_2); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getTHM_NAMEAccess().getColonKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTHM_NAME"


    // $ANTLR start "entryRuleTopLevel"
    // InternalMyDsl.g:141:1: entryRuleTopLevel returns [EObject current=null] : iv_ruleTopLevel= ruleTopLevel EOF ;
    public final EObject entryRuleTopLevel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTopLevel = null;


        try {
            // InternalMyDsl.g:141:49: (iv_ruleTopLevel= ruleTopLevel EOF )
            // InternalMyDsl.g:142:2: iv_ruleTopLevel= ruleTopLevel EOF
            {
             newCompositeNode(grammarAccess.getTopLevelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTopLevel=ruleTopLevel();

            state._fsp--;

             current =iv_ruleTopLevel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTopLevel"


    // $ANTLR start "ruleTopLevel"
    // InternalMyDsl.g:148:1: ruleTopLevel returns [EObject current=null] : (this_ImportStatement_0= ruleImportStatement | this_ClassDecl_1= ruleClassDecl ) ;
    public final EObject ruleTopLevel() throws RecognitionException {
        EObject current = null;

        EObject this_ImportStatement_0 = null;

        EObject this_ClassDecl_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:154:2: ( (this_ImportStatement_0= ruleImportStatement | this_ClassDecl_1= ruleClassDecl ) )
            // InternalMyDsl.g:155:2: (this_ImportStatement_0= ruleImportStatement | this_ClassDecl_1= ruleClassDecl )
            {
            // InternalMyDsl.g:155:2: (this_ImportStatement_0= ruleImportStatement | this_ClassDecl_1= ruleClassDecl )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID||LA3_0==14||LA3_0==34) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:156:3: this_ImportStatement_0= ruleImportStatement
                    {

                    			newCompositeNode(grammarAccess.getTopLevelAccess().getImportStatementParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ImportStatement_0=ruleImportStatement();

                    state._fsp--;


                    			current = this_ImportStatement_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:165:3: this_ClassDecl_1= ruleClassDecl
                    {

                    			newCompositeNode(grammarAccess.getTopLevelAccess().getClassDeclParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ClassDecl_1=ruleClassDecl();

                    state._fsp--;


                    			current = this_ClassDecl_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTopLevel"


    // $ANTLR start "entryRuleImportStatement"
    // InternalMyDsl.g:177:1: entryRuleImportStatement returns [EObject current=null] : iv_ruleImportStatement= ruleImportStatement EOF ;
    public final EObject entryRuleImportStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportStatement = null;


        try {
            // InternalMyDsl.g:177:56: (iv_ruleImportStatement= ruleImportStatement EOF )
            // InternalMyDsl.g:178:2: iv_ruleImportStatement= ruleImportStatement EOF
            {
             newCompositeNode(grammarAccess.getImportStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImportStatement=ruleImportStatement();

            state._fsp--;

             current =iv_ruleImportStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImportStatement"


    // $ANTLR start "ruleImportStatement"
    // InternalMyDsl.g:184:1: ruleImportStatement returns [EObject current=null] : (otherlv_0= 'Import' ( (lv_imports_1_0= ruleImport ) ) ) ;
    public final EObject ruleImportStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_imports_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:190:2: ( (otherlv_0= 'Import' ( (lv_imports_1_0= ruleImport ) ) ) )
            // InternalMyDsl.g:191:2: (otherlv_0= 'Import' ( (lv_imports_1_0= ruleImport ) ) )
            {
            // InternalMyDsl.g:191:2: (otherlv_0= 'Import' ( (lv_imports_1_0= ruleImport ) ) )
            // InternalMyDsl.g:192:3: otherlv_0= 'Import' ( (lv_imports_1_0= ruleImport ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getImportStatementAccess().getImportKeyword_0());
            		
            // InternalMyDsl.g:196:3: ( (lv_imports_1_0= ruleImport ) )
            // InternalMyDsl.g:197:4: (lv_imports_1_0= ruleImport )
            {
            // InternalMyDsl.g:197:4: (lv_imports_1_0= ruleImport )
            // InternalMyDsl.g:198:5: lv_imports_1_0= ruleImport
            {

            					newCompositeNode(grammarAccess.getImportStatementAccess().getImportsImportParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_imports_1_0=ruleImport();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImportStatementRule());
            					}
            					add(
            						current,
            						"imports",
            						lv_imports_1_0,
            						"org.xtext.sampleProj.mydsl.MyDsl.Import");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImportStatement"


    // $ANTLR start "entryRuleImport"
    // InternalMyDsl.g:219:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalMyDsl.g:219:47: (iv_ruleImport= ruleImport EOF )
            // InternalMyDsl.g:220:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalMyDsl.g:226:1: ruleImport returns [EObject current=null] : ( ( (lv_importName_0_0= ruleImportComponent ) ) (otherlv_1= '.' ( (lv_importName_2_0= ruleImportComponent ) ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_importName_0_0 = null;

        EObject lv_importName_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:232:2: ( ( ( (lv_importName_0_0= ruleImportComponent ) ) (otherlv_1= '.' ( (lv_importName_2_0= ruleImportComponent ) ) ) ) )
            // InternalMyDsl.g:233:2: ( ( (lv_importName_0_0= ruleImportComponent ) ) (otherlv_1= '.' ( (lv_importName_2_0= ruleImportComponent ) ) ) )
            {
            // InternalMyDsl.g:233:2: ( ( (lv_importName_0_0= ruleImportComponent ) ) (otherlv_1= '.' ( (lv_importName_2_0= ruleImportComponent ) ) ) )
            // InternalMyDsl.g:234:3: ( (lv_importName_0_0= ruleImportComponent ) ) (otherlv_1= '.' ( (lv_importName_2_0= ruleImportComponent ) ) )
            {
            // InternalMyDsl.g:234:3: ( (lv_importName_0_0= ruleImportComponent ) )
            // InternalMyDsl.g:235:4: (lv_importName_0_0= ruleImportComponent )
            {
            // InternalMyDsl.g:235:4: (lv_importName_0_0= ruleImportComponent )
            // InternalMyDsl.g:236:5: lv_importName_0_0= ruleImportComponent
            {

            					newCompositeNode(grammarAccess.getImportAccess().getImportNameImportComponentParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_6);
            lv_importName_0_0=ruleImportComponent();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImportRule());
            					}
            					add(
            						current,
            						"importName",
            						lv_importName_0_0,
            						"org.xtext.sampleProj.mydsl.MyDsl.ImportComponent");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:253:3: (otherlv_1= '.' ( (lv_importName_2_0= ruleImportComponent ) ) )
            // InternalMyDsl.g:254:4: otherlv_1= '.' ( (lv_importName_2_0= ruleImportComponent ) )
            {
            otherlv_1=(Token)match(input,13,FOLLOW_5); 

            				newLeafNode(otherlv_1, grammarAccess.getImportAccess().getFullStopKeyword_1_0());
            			
            // InternalMyDsl.g:258:4: ( (lv_importName_2_0= ruleImportComponent ) )
            // InternalMyDsl.g:259:5: (lv_importName_2_0= ruleImportComponent )
            {
            // InternalMyDsl.g:259:5: (lv_importName_2_0= ruleImportComponent )
            // InternalMyDsl.g:260:6: lv_importName_2_0= ruleImportComponent
            {

            						newCompositeNode(grammarAccess.getImportAccess().getImportNameImportComponentParserRuleCall_1_1_0());
            					
            pushFollow(FOLLOW_2);
            lv_importName_2_0=ruleImportComponent();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getImportRule());
            						}
            						add(
            							current,
            							"importName",
            							lv_importName_2_0,
            							"org.xtext.sampleProj.mydsl.MyDsl.ImportComponent");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleImportComponent"
    // InternalMyDsl.g:282:1: entryRuleImportComponent returns [EObject current=null] : iv_ruleImportComponent= ruleImportComponent EOF ;
    public final EObject entryRuleImportComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportComponent = null;


        try {
            // InternalMyDsl.g:282:56: (iv_ruleImportComponent= ruleImportComponent EOF )
            // InternalMyDsl.g:283:2: iv_ruleImportComponent= ruleImportComponent EOF
            {
             newCompositeNode(grammarAccess.getImportComponentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImportComponent=ruleImportComponent();

            state._fsp--;

             current =iv_ruleImportComponent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImportComponent"


    // $ANTLR start "ruleImportComponent"
    // InternalMyDsl.g:289:1: ruleImportComponent returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleImportComponent() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:295:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalMyDsl.g:296:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalMyDsl.g:296:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalMyDsl.g:297:3: (lv_name_0_0= RULE_ID )
            {
            // InternalMyDsl.g:297:3: (lv_name_0_0= RULE_ID )
            // InternalMyDsl.g:298:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getImportComponentAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getImportComponentRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImportComponent"


    // $ANTLR start "entryRuleClassDecl"
    // InternalMyDsl.g:317:1: entryRuleClassDecl returns [EObject current=null] : iv_ruleClassDecl= ruleClassDecl EOF ;
    public final EObject entryRuleClassDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassDecl = null;


        try {
            // InternalMyDsl.g:317:50: (iv_ruleClassDecl= ruleClassDecl EOF )
            // InternalMyDsl.g:318:2: iv_ruleClassDecl= ruleClassDecl EOF
            {
             newCompositeNode(grammarAccess.getClassDeclRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClassDecl=ruleClassDecl();

            state._fsp--;

             current =iv_ruleClassDecl; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClassDecl"


    // $ANTLR start "ruleClassDecl"
    // InternalMyDsl.g:324:1: ruleClassDecl returns [EObject current=null] : (this_Class_0= ruleClass | this_Datatype_1= ruleDatatype | this_Extend_2= ruleExtend ) ;
    public final EObject ruleClassDecl() throws RecognitionException {
        EObject current = null;

        EObject this_Class_0 = null;

        EObject this_Datatype_1 = null;

        EObject this_Extend_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:330:2: ( (this_Class_0= ruleClass | this_Datatype_1= ruleDatatype | this_Extend_2= ruleExtend ) )
            // InternalMyDsl.g:331:2: (this_Class_0= ruleClass | this_Datatype_1= ruleDatatype | this_Extend_2= ruleExtend )
            {
            // InternalMyDsl.g:331:2: (this_Class_0= ruleClass | this_Datatype_1= ruleDatatype | this_Extend_2= ruleExtend )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt4=1;
                }
                break;
            case 34:
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
                    // InternalMyDsl.g:332:3: this_Class_0= ruleClass
                    {

                    			newCompositeNode(grammarAccess.getClassDeclAccess().getClassParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Class_0=ruleClass();

                    state._fsp--;


                    			current = this_Class_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:341:3: this_Datatype_1= ruleDatatype
                    {

                    			newCompositeNode(grammarAccess.getClassDeclAccess().getDatatypeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Datatype_1=ruleDatatype();

                    state._fsp--;


                    			current = this_Datatype_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:350:3: this_Extend_2= ruleExtend
                    {

                    			newCompositeNode(grammarAccess.getClassDeclAccess().getExtendParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Extend_2=ruleExtend();

                    state._fsp--;


                    			current = this_Extend_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClassDecl"


    // $ANTLR start "entryRuleClass"
    // InternalMyDsl.g:362:1: entryRuleClass returns [EObject current=null] : iv_ruleClass= ruleClass EOF ;
    public final EObject entryRuleClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClass = null;


        try {
            // InternalMyDsl.g:362:46: (iv_ruleClass= ruleClass EOF )
            // InternalMyDsl.g:363:2: iv_ruleClass= ruleClass EOF
            {
             newCompositeNode(grammarAccess.getClassRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClass=ruleClass();

            state._fsp--;

             current =iv_ruleClass; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClass"


    // $ANTLR start "ruleClass"
    // InternalMyDsl.g:369:1: ruleClass returns [EObject current=null] : (otherlv_0= 'Class' ( (lv_typeName_1_0= ruleTypeName ) ) ( (lv_context_2_0= rulePolyContext ) )? ( (lv_supertypes_3_0= ruleSuperTypeList ) )? ( (lv_typeStructure_4_0= ruleTypeStructure ) )? ( (lv_where_5_0= ruleWhere ) )? (otherlv_6= ';' )? otherlv_7= '{' ( (lv_bodyElements_8_0= ruleTypeBodyElements ) )* otherlv_9= '}' ) ;
    public final EObject ruleClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_typeName_1_0 = null;

        EObject lv_context_2_0 = null;

        EObject lv_supertypes_3_0 = null;

        EObject lv_typeStructure_4_0 = null;

        EObject lv_where_5_0 = null;

        EObject lv_bodyElements_8_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:375:2: ( (otherlv_0= 'Class' ( (lv_typeName_1_0= ruleTypeName ) ) ( (lv_context_2_0= rulePolyContext ) )? ( (lv_supertypes_3_0= ruleSuperTypeList ) )? ( (lv_typeStructure_4_0= ruleTypeStructure ) )? ( (lv_where_5_0= ruleWhere ) )? (otherlv_6= ';' )? otherlv_7= '{' ( (lv_bodyElements_8_0= ruleTypeBodyElements ) )* otherlv_9= '}' ) )
            // InternalMyDsl.g:376:2: (otherlv_0= 'Class' ( (lv_typeName_1_0= ruleTypeName ) ) ( (lv_context_2_0= rulePolyContext ) )? ( (lv_supertypes_3_0= ruleSuperTypeList ) )? ( (lv_typeStructure_4_0= ruleTypeStructure ) )? ( (lv_where_5_0= ruleWhere ) )? (otherlv_6= ';' )? otherlv_7= '{' ( (lv_bodyElements_8_0= ruleTypeBodyElements ) )* otherlv_9= '}' )
            {
            // InternalMyDsl.g:376:2: (otherlv_0= 'Class' ( (lv_typeName_1_0= ruleTypeName ) ) ( (lv_context_2_0= rulePolyContext ) )? ( (lv_supertypes_3_0= ruleSuperTypeList ) )? ( (lv_typeStructure_4_0= ruleTypeStructure ) )? ( (lv_where_5_0= ruleWhere ) )? (otherlv_6= ';' )? otherlv_7= '{' ( (lv_bodyElements_8_0= ruleTypeBodyElements ) )* otherlv_9= '}' )
            // InternalMyDsl.g:377:3: otherlv_0= 'Class' ( (lv_typeName_1_0= ruleTypeName ) ) ( (lv_context_2_0= rulePolyContext ) )? ( (lv_supertypes_3_0= ruleSuperTypeList ) )? ( (lv_typeStructure_4_0= ruleTypeStructure ) )? ( (lv_where_5_0= ruleWhere ) )? (otherlv_6= ';' )? otherlv_7= '{' ( (lv_bodyElements_8_0= ruleTypeBodyElements ) )* otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getClassAccess().getClassKeyword_0());
            		
            // InternalMyDsl.g:381:3: ( (lv_typeName_1_0= ruleTypeName ) )
            // InternalMyDsl.g:382:4: (lv_typeName_1_0= ruleTypeName )
            {
            // InternalMyDsl.g:382:4: (lv_typeName_1_0= ruleTypeName )
            // InternalMyDsl.g:383:5: lv_typeName_1_0= ruleTypeName
            {

            					newCompositeNode(grammarAccess.getClassAccess().getTypeNameTypeNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_7);
            lv_typeName_1_0=ruleTypeName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getClassRule());
            					}
            					set(
            						current,
            						"typeName",
            						lv_typeName_1_0,
            						"org.xtext.sampleProj.mydsl.MyDsl.TypeName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:400:3: ( (lv_context_2_0= rulePolyContext ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:401:4: (lv_context_2_0= rulePolyContext )
                    {
                    // InternalMyDsl.g:401:4: (lv_context_2_0= rulePolyContext )
                    // InternalMyDsl.g:402:5: lv_context_2_0= rulePolyContext
                    {

                    					newCompositeNode(grammarAccess.getClassAccess().getContextPolyContextParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_8);
                    lv_context_2_0=rulePolyContext();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getClassRule());
                    					}
                    					set(
                    						current,
                    						"context",
                    						lv_context_2_0,
                    						"org.xtext.sampleProj.mydsl.MyDsl.PolyContext");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:419:3: ( (lv_supertypes_3_0= ruleSuperTypeList ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==11) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:420:4: (lv_supertypes_3_0= ruleSuperTypeList )
                    {
                    // InternalMyDsl.g:420:4: (lv_supertypes_3_0= ruleSuperTypeList )
                    // InternalMyDsl.g:421:5: lv_supertypes_3_0= ruleSuperTypeList
                    {

                    					newCompositeNode(grammarAccess.getClassAccess().getSupertypesSuperTypeListParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_9);
                    lv_supertypes_3_0=ruleSuperTypeList();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getClassRule());
                    					}
                    					set(
                    						current,
                    						"supertypes",
                    						lv_supertypes_3_0,
                    						"org.xtext.sampleProj.mydsl.MyDsl.SuperTypeList");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:438:3: ( (lv_typeStructure_4_0= ruleTypeStructure ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==31) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:439:4: (lv_typeStructure_4_0= ruleTypeStructure )
                    {
                    // InternalMyDsl.g:439:4: (lv_typeStructure_4_0= ruleTypeStructure )
                    // InternalMyDsl.g:440:5: lv_typeStructure_4_0= ruleTypeStructure
                    {

                    					newCompositeNode(grammarAccess.getClassAccess().getTypeStructureTypeStructureParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_10);
                    lv_typeStructure_4_0=ruleTypeStructure();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getClassRule());
                    					}
                    					set(
                    						current,
                    						"typeStructure",
                    						lv_typeStructure_4_0,
                    						"org.xtext.sampleProj.mydsl.MyDsl.TypeStructure");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:457:3: ( (lv_where_5_0= ruleWhere ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==33) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:458:4: (lv_where_5_0= ruleWhere )
                    {
                    // InternalMyDsl.g:458:4: (lv_where_5_0= ruleWhere )
                    // InternalMyDsl.g:459:5: lv_where_5_0= ruleWhere
                    {

                    					newCompositeNode(grammarAccess.getClassAccess().getWhereWhereParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_11);
                    lv_where_5_0=ruleWhere();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getClassRule());
                    					}
                    					set(
                    						current,
                    						"where",
                    						lv_where_5_0,
                    						"org.xtext.sampleProj.mydsl.MyDsl.Where");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:476:3: (otherlv_6= ';' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==15) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:477:4: otherlv_6= ';'
                    {
                    otherlv_6=(Token)match(input,15,FOLLOW_12); 

                    				newLeafNode(otherlv_6, grammarAccess.getClassAccess().getSemicolonKeyword_6());
                    			

                    }
                    break;

            }

            otherlv_7=(Token)match(input,16,FOLLOW_13); 

            			newLeafNode(otherlv_7, grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_7());
            		
            // InternalMyDsl.g:486:3: ( (lv_bodyElements_8_0= ruleTypeBodyElements ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID||LA10_0==37) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMyDsl.g:487:4: (lv_bodyElements_8_0= ruleTypeBodyElements )
            	    {
            	    // InternalMyDsl.g:487:4: (lv_bodyElements_8_0= ruleTypeBodyElements )
            	    // InternalMyDsl.g:488:5: lv_bodyElements_8_0= ruleTypeBodyElements
            	    {

            	    					newCompositeNode(grammarAccess.getClassAccess().getBodyElementsTypeBodyElementsParserRuleCall_8_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_bodyElements_8_0=ruleTypeBodyElements();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getClassRule());
            	    					}
            	    					add(
            	    						current,
            	    						"bodyElements",
            	    						lv_bodyElements_8_0,
            	    						"org.xtext.sampleProj.mydsl.MyDsl.TypeBodyElements");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_9=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getClassAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClass"


    // $ANTLR start "entryRuleTypeName"
    // InternalMyDsl.g:513:1: entryRuleTypeName returns [EObject current=null] : iv_ruleTypeName= ruleTypeName EOF ;
    public final EObject entryRuleTypeName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeName = null;


        try {
            // InternalMyDsl.g:513:49: (iv_ruleTypeName= ruleTypeName EOF )
            // InternalMyDsl.g:514:2: iv_ruleTypeName= ruleTypeName EOF
            {
             newCompositeNode(grammarAccess.getTypeNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTypeName=ruleTypeName();

            state._fsp--;

             current =iv_ruleTypeName; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeName"


    // $ANTLR start "ruleTypeName"
    // InternalMyDsl.g:520:1: ruleTypeName returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleTypeName() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:526:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalMyDsl.g:527:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalMyDsl.g:527:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalMyDsl.g:528:3: (lv_name_0_0= RULE_ID )
            {
            // InternalMyDsl.g:528:3: (lv_name_0_0= RULE_ID )
            // InternalMyDsl.g:529:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getTypeNameAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getTypeNameRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeName"


    // $ANTLR start "entryRulePolymorphicTypeName"
    // InternalMyDsl.g:548:1: entryRulePolymorphicTypeName returns [EObject current=null] : iv_rulePolymorphicTypeName= rulePolymorphicTypeName EOF ;
    public final EObject entryRulePolymorphicTypeName() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePolymorphicTypeName = null;


        try {
            // InternalMyDsl.g:548:60: (iv_rulePolymorphicTypeName= rulePolymorphicTypeName EOF )
            // InternalMyDsl.g:549:2: iv_rulePolymorphicTypeName= rulePolymorphicTypeName EOF
            {
             newCompositeNode(grammarAccess.getPolymorphicTypeNameRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePolymorphicTypeName=rulePolymorphicTypeName();

            state._fsp--;

             current =iv_rulePolymorphicTypeName; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePolymorphicTypeName"


    // $ANTLR start "rulePolymorphicTypeName"
    // InternalMyDsl.g:555:1: rulePolymorphicTypeName returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject rulePolymorphicTypeName() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:561:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalMyDsl.g:562:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalMyDsl.g:562:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalMyDsl.g:563:3: (lv_name_0_0= RULE_ID )
            {
            // InternalMyDsl.g:563:3: (lv_name_0_0= RULE_ID )
            // InternalMyDsl.g:564:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getPolymorphicTypeNameAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getPolymorphicTypeNameRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePolymorphicTypeName"


    // $ANTLR start "entryRulePolyContext"
    // InternalMyDsl.g:583:1: entryRulePolyContext returns [EObject current=null] : iv_rulePolyContext= rulePolyContext EOF ;
    public final EObject entryRulePolyContext() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePolyContext = null;


        try {
            // InternalMyDsl.g:583:52: (iv_rulePolyContext= rulePolyContext EOF )
            // InternalMyDsl.g:584:2: iv_rulePolyContext= rulePolyContext EOF
            {
             newCompositeNode(grammarAccess.getPolyContextRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePolyContext=rulePolyContext();

            state._fsp--;

             current =iv_rulePolyContext; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePolyContext"


    // $ANTLR start "rulePolyContext"
    // InternalMyDsl.g:590:1: rulePolyContext returns [EObject current=null] : (otherlv_0= '<' ( (lv_polyTypes_1_0= rulePolyContextTypes ) )+ otherlv_2= '>' ) ;
    public final EObject rulePolyContext() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_polyTypes_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:596:2: ( (otherlv_0= '<' ( (lv_polyTypes_1_0= rulePolyContextTypes ) )+ otherlv_2= '>' ) )
            // InternalMyDsl.g:597:2: (otherlv_0= '<' ( (lv_polyTypes_1_0= rulePolyContextTypes ) )+ otherlv_2= '>' )
            {
            // InternalMyDsl.g:597:2: (otherlv_0= '<' ( (lv_polyTypes_1_0= rulePolyContextTypes ) )+ otherlv_2= '>' )
            // InternalMyDsl.g:598:3: otherlv_0= '<' ( (lv_polyTypes_1_0= rulePolyContextTypes ) )+ otherlv_2= '>'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getPolyContextAccess().getLessThanSignKeyword_0());
            		
            // InternalMyDsl.g:602:3: ( (lv_polyTypes_1_0= rulePolyContextTypes ) )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMyDsl.g:603:4: (lv_polyTypes_1_0= rulePolyContextTypes )
            	    {
            	    // InternalMyDsl.g:603:4: (lv_polyTypes_1_0= rulePolyContextTypes )
            	    // InternalMyDsl.g:604:5: lv_polyTypes_1_0= rulePolyContextTypes
            	    {

            	    					newCompositeNode(grammarAccess.getPolyContextAccess().getPolyTypesPolyContextTypesParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_14);
            	    lv_polyTypes_1_0=rulePolyContextTypes();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPolyContextRule());
            	    					}
            	    					add(
            	    						current,
            	    						"polyTypes",
            	    						lv_polyTypes_1_0,
            	    						"org.xtext.sampleProj.mydsl.MyDsl.PolyContextTypes");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);

            otherlv_2=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getPolyContextAccess().getGreaterThanSignKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePolyContext"


    // $ANTLR start "entryRulePolyContextTypes"
    // InternalMyDsl.g:629:1: entryRulePolyContextTypes returns [EObject current=null] : iv_rulePolyContextTypes= rulePolyContextTypes EOF ;
    public final EObject entryRulePolyContextTypes() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePolyContextTypes = null;


        try {
            // InternalMyDsl.g:629:57: (iv_rulePolyContextTypes= rulePolyContextTypes EOF )
            // InternalMyDsl.g:630:2: iv_rulePolyContextTypes= rulePolyContextTypes EOF
            {
             newCompositeNode(grammarAccess.getPolyContextTypesRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePolyContextTypes=rulePolyContextTypes();

            state._fsp--;

             current =iv_rulePolyContextTypes; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePolyContextTypes"


    // $ANTLR start "rulePolyContextTypes"
    // InternalMyDsl.g:636:1: rulePolyContextTypes returns [EObject current=null] : ( ( (lv_name_0_0= rulePolymorphicTypeName ) ) ( (lv_constraints_1_0= rulePolyTypeConstraints ) )* ) ;
    public final EObject rulePolyContextTypes() throws RecognitionException {
        EObject current = null;

        EObject lv_name_0_0 = null;

        EObject lv_constraints_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:642:2: ( ( ( (lv_name_0_0= rulePolymorphicTypeName ) ) ( (lv_constraints_1_0= rulePolyTypeConstraints ) )* ) )
            // InternalMyDsl.g:643:2: ( ( (lv_name_0_0= rulePolymorphicTypeName ) ) ( (lv_constraints_1_0= rulePolyTypeConstraints ) )* )
            {
            // InternalMyDsl.g:643:2: ( ( (lv_name_0_0= rulePolymorphicTypeName ) ) ( (lv_constraints_1_0= rulePolyTypeConstraints ) )* )
            // InternalMyDsl.g:644:3: ( (lv_name_0_0= rulePolymorphicTypeName ) ) ( (lv_constraints_1_0= rulePolyTypeConstraints ) )*
            {
            // InternalMyDsl.g:644:3: ( (lv_name_0_0= rulePolymorphicTypeName ) )
            // InternalMyDsl.g:645:4: (lv_name_0_0= rulePolymorphicTypeName )
            {
            // InternalMyDsl.g:645:4: (lv_name_0_0= rulePolymorphicTypeName )
            // InternalMyDsl.g:646:5: lv_name_0_0= rulePolymorphicTypeName
            {

            					newCompositeNode(grammarAccess.getPolyContextTypesAccess().getNamePolymorphicTypeNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_15);
            lv_name_0_0=rulePolymorphicTypeName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPolyContextTypesRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.xtext.sampleProj.mydsl.MyDsl.PolymorphicTypeName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:663:3: ( (lv_constraints_1_0= rulePolyTypeConstraints ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==11) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMyDsl.g:664:4: (lv_constraints_1_0= rulePolyTypeConstraints )
            	    {
            	    // InternalMyDsl.g:664:4: (lv_constraints_1_0= rulePolyTypeConstraints )
            	    // InternalMyDsl.g:665:5: lv_constraints_1_0= rulePolyTypeConstraints
            	    {

            	    					newCompositeNode(grammarAccess.getPolyContextTypesAccess().getConstraintsPolyTypeConstraintsParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_15);
            	    lv_constraints_1_0=rulePolyTypeConstraints();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPolyContextTypesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"constraints",
            	    						lv_constraints_1_0,
            	    						"org.xtext.sampleProj.mydsl.MyDsl.PolyTypeConstraints");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePolyContextTypes"


    // $ANTLR start "entryRulePolyTypeConstraints"
    // InternalMyDsl.g:686:1: entryRulePolyTypeConstraints returns [EObject current=null] : iv_rulePolyTypeConstraints= rulePolyTypeConstraints EOF ;
    public final EObject entryRulePolyTypeConstraints() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePolyTypeConstraints = null;


        try {
            // InternalMyDsl.g:686:60: (iv_rulePolyTypeConstraints= rulePolyTypeConstraints EOF )
            // InternalMyDsl.g:687:2: iv_rulePolyTypeConstraints= rulePolyTypeConstraints EOF
            {
             newCompositeNode(grammarAccess.getPolyTypeConstraintsRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePolyTypeConstraints=rulePolyTypeConstraints();

            state._fsp--;

             current =iv_rulePolyTypeConstraints; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePolyTypeConstraints"


    // $ANTLR start "rulePolyTypeConstraints"
    // InternalMyDsl.g:693:1: rulePolyTypeConstraints returns [EObject current=null] : (otherlv_0= ':' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* ) ;
    public final EObject rulePolyTypeConstraints() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMyDsl.g:699:2: ( (otherlv_0= ':' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* ) )
            // InternalMyDsl.g:700:2: (otherlv_0= ':' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* )
            {
            // InternalMyDsl.g:700:2: (otherlv_0= ':' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* )
            // InternalMyDsl.g:701:3: otherlv_0= ':' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getPolyTypeConstraintsAccess().getColonKeyword_0());
            		
            // InternalMyDsl.g:705:3: ( (otherlv_1= RULE_ID ) )
            // InternalMyDsl.g:706:4: (otherlv_1= RULE_ID )
            {
            // InternalMyDsl.g:706:4: (otherlv_1= RULE_ID )
            // InternalMyDsl.g:707:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPolyTypeConstraintsRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(otherlv_1, grammarAccess.getPolyTypeConstraintsAccess().getTypeNameTypeNameCrossReference_1_0());
            				

            }


            }

            // InternalMyDsl.g:718:3: (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==20) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMyDsl.g:719:4: otherlv_2= ',' ( (otherlv_3= RULE_ID ) )
            	    {
            	    otherlv_2=(Token)match(input,20,FOLLOW_5); 

            	    				newLeafNode(otherlv_2, grammarAccess.getPolyTypeConstraintsAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalMyDsl.g:723:4: ( (otherlv_3= RULE_ID ) )
            	    // InternalMyDsl.g:724:5: (otherlv_3= RULE_ID )
            	    {
            	    // InternalMyDsl.g:724:5: (otherlv_3= RULE_ID )
            	    // InternalMyDsl.g:725:6: otherlv_3= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getPolyTypeConstraintsRule());
            	    						}
            	    					
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_16); 

            	    						newLeafNode(otherlv_3, grammarAccess.getPolyTypeConstraintsAccess().getTypeNameTypeNameCrossReference_2_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePolyTypeConstraints"


    // $ANTLR start "entryRuleSuperTypeList"
    // InternalMyDsl.g:741:1: entryRuleSuperTypeList returns [EObject current=null] : iv_ruleSuperTypeList= ruleSuperTypeList EOF ;
    public final EObject entryRuleSuperTypeList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSuperTypeList = null;


        try {
            // InternalMyDsl.g:741:54: (iv_ruleSuperTypeList= ruleSuperTypeList EOF )
            // InternalMyDsl.g:742:2: iv_ruleSuperTypeList= ruleSuperTypeList EOF
            {
             newCompositeNode(grammarAccess.getSuperTypeListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSuperTypeList=ruleSuperTypeList();

            state._fsp--;

             current =iv_ruleSuperTypeList; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSuperTypeList"


    // $ANTLR start "ruleSuperTypeList"
    // InternalMyDsl.g:748:1: ruleSuperTypeList returns [EObject current=null] : (otherlv_0= ':' ( (lv_superType_1_0= ruleConstructedType ) ) (otherlv_2= ',' ( (lv_superType_3_0= ruleConstructedType ) ) )* ) ;
    public final EObject ruleSuperTypeList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_superType_1_0 = null;

        EObject lv_superType_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:754:2: ( (otherlv_0= ':' ( (lv_superType_1_0= ruleConstructedType ) ) (otherlv_2= ',' ( (lv_superType_3_0= ruleConstructedType ) ) )* ) )
            // InternalMyDsl.g:755:2: (otherlv_0= ':' ( (lv_superType_1_0= ruleConstructedType ) ) (otherlv_2= ',' ( (lv_superType_3_0= ruleConstructedType ) ) )* )
            {
            // InternalMyDsl.g:755:2: (otherlv_0= ':' ( (lv_superType_1_0= ruleConstructedType ) ) (otherlv_2= ',' ( (lv_superType_3_0= ruleConstructedType ) ) )* )
            // InternalMyDsl.g:756:3: otherlv_0= ':' ( (lv_superType_1_0= ruleConstructedType ) ) (otherlv_2= ',' ( (lv_superType_3_0= ruleConstructedType ) ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getSuperTypeListAccess().getColonKeyword_0());
            		
            // InternalMyDsl.g:760:3: ( (lv_superType_1_0= ruleConstructedType ) )
            // InternalMyDsl.g:761:4: (lv_superType_1_0= ruleConstructedType )
            {
            // InternalMyDsl.g:761:4: (lv_superType_1_0= ruleConstructedType )
            // InternalMyDsl.g:762:5: lv_superType_1_0= ruleConstructedType
            {

            					newCompositeNode(grammarAccess.getSuperTypeListAccess().getSuperTypeConstructedTypeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_16);
            lv_superType_1_0=ruleConstructedType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSuperTypeListRule());
            					}
            					add(
            						current,
            						"superType",
            						lv_superType_1_0,
            						"org.xtext.sampleProj.mydsl.MyDsl.ConstructedType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:779:3: (otherlv_2= ',' ( (lv_superType_3_0= ruleConstructedType ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==20) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMyDsl.g:780:4: otherlv_2= ',' ( (lv_superType_3_0= ruleConstructedType ) )
            	    {
            	    otherlv_2=(Token)match(input,20,FOLLOW_5); 

            	    				newLeafNode(otherlv_2, grammarAccess.getSuperTypeListAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalMyDsl.g:784:4: ( (lv_superType_3_0= ruleConstructedType ) )
            	    // InternalMyDsl.g:785:5: (lv_superType_3_0= ruleConstructedType )
            	    {
            	    // InternalMyDsl.g:785:5: (lv_superType_3_0= ruleConstructedType )
            	    // InternalMyDsl.g:786:6: lv_superType_3_0= ruleConstructedType
            	    {

            	    						newCompositeNode(grammarAccess.getSuperTypeListAccess().getSuperTypeConstructedTypeParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_16);
            	    lv_superType_3_0=ruleConstructedType();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSuperTypeListRule());
            	    						}
            	    						add(
            	    							current,
            	    							"superType",
            	    							lv_superType_3_0,
            	    							"org.xtext.sampleProj.mydsl.MyDsl.ConstructedType");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSuperTypeList"


    // $ANTLR start "entryRuleConstructedType"
    // InternalMyDsl.g:808:1: entryRuleConstructedType returns [EObject current=null] : iv_ruleConstructedType= ruleConstructedType EOF ;
    public final EObject entryRuleConstructedType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstructedType = null;


        try {
            // InternalMyDsl.g:808:56: (iv_ruleConstructedType= ruleConstructedType EOF )
            // InternalMyDsl.g:809:2: iv_ruleConstructedType= ruleConstructedType EOF
            {
             newCompositeNode(grammarAccess.getConstructedTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstructedType=ruleConstructedType();

            state._fsp--;

             current =iv_ruleConstructedType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstructedType"


    // $ANTLR start "ruleConstructedType"
    // InternalMyDsl.g:815:1: ruleConstructedType returns [EObject current=null] : ( ( (lv_type_0_0= ruleTypeConstructor ) ) ( (otherlv_1= '\\u00D7' | otherlv_2= '\\u2192' | otherlv_3= '\\uE102' | otherlv_4= '\\uE100' | otherlv_5= '\\u2194' | otherlv_6= '\\u2916' | otherlv_7= '\\u21F8' | otherlv_8= '\\u21A3' | otherlv_9= '\\u2900' | otherlv_10= '\\u21A0' ) ( (lv_type_11_0= ruleConstructedType ) ) )? ) ;
    public final EObject ruleConstructedType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        EObject lv_type_0_0 = null;

        EObject lv_type_11_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:821:2: ( ( ( (lv_type_0_0= ruleTypeConstructor ) ) ( (otherlv_1= '\\u00D7' | otherlv_2= '\\u2192' | otherlv_3= '\\uE102' | otherlv_4= '\\uE100' | otherlv_5= '\\u2194' | otherlv_6= '\\u2916' | otherlv_7= '\\u21F8' | otherlv_8= '\\u21A3' | otherlv_9= '\\u2900' | otherlv_10= '\\u21A0' ) ( (lv_type_11_0= ruleConstructedType ) ) )? ) )
            // InternalMyDsl.g:822:2: ( ( (lv_type_0_0= ruleTypeConstructor ) ) ( (otherlv_1= '\\u00D7' | otherlv_2= '\\u2192' | otherlv_3= '\\uE102' | otherlv_4= '\\uE100' | otherlv_5= '\\u2194' | otherlv_6= '\\u2916' | otherlv_7= '\\u21F8' | otherlv_8= '\\u21A3' | otherlv_9= '\\u2900' | otherlv_10= '\\u21A0' ) ( (lv_type_11_0= ruleConstructedType ) ) )? )
            {
            // InternalMyDsl.g:822:2: ( ( (lv_type_0_0= ruleTypeConstructor ) ) ( (otherlv_1= '\\u00D7' | otherlv_2= '\\u2192' | otherlv_3= '\\uE102' | otherlv_4= '\\uE100' | otherlv_5= '\\u2194' | otherlv_6= '\\u2916' | otherlv_7= '\\u21F8' | otherlv_8= '\\u21A3' | otherlv_9= '\\u2900' | otherlv_10= '\\u21A0' ) ( (lv_type_11_0= ruleConstructedType ) ) )? )
            // InternalMyDsl.g:823:3: ( (lv_type_0_0= ruleTypeConstructor ) ) ( (otherlv_1= '\\u00D7' | otherlv_2= '\\u2192' | otherlv_3= '\\uE102' | otherlv_4= '\\uE100' | otherlv_5= '\\u2194' | otherlv_6= '\\u2916' | otherlv_7= '\\u21F8' | otherlv_8= '\\u21A3' | otherlv_9= '\\u2900' | otherlv_10= '\\u21A0' ) ( (lv_type_11_0= ruleConstructedType ) ) )?
            {
            // InternalMyDsl.g:823:3: ( (lv_type_0_0= ruleTypeConstructor ) )
            // InternalMyDsl.g:824:4: (lv_type_0_0= ruleTypeConstructor )
            {
            // InternalMyDsl.g:824:4: (lv_type_0_0= ruleTypeConstructor )
            // InternalMyDsl.g:825:5: lv_type_0_0= ruleTypeConstructor
            {

            					newCompositeNode(grammarAccess.getConstructedTypeAccess().getTypeTypeConstructorParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_17);
            lv_type_0_0=ruleTypeConstructor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConstructedTypeRule());
            					}
            					add(
            						current,
            						"type",
            						lv_type_0_0,
            						"org.xtext.sampleProj.mydsl.MyDsl.TypeConstructor");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:842:3: ( (otherlv_1= '\\u00D7' | otherlv_2= '\\u2192' | otherlv_3= '\\uE102' | otherlv_4= '\\uE100' | otherlv_5= '\\u2194' | otherlv_6= '\\u2916' | otherlv_7= '\\u21F8' | otherlv_8= '\\u21A3' | otherlv_9= '\\u2900' | otherlv_10= '\\u21A0' ) ( (lv_type_11_0= ruleConstructedType ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=21 && LA16_0<=30)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMyDsl.g:843:4: (otherlv_1= '\\u00D7' | otherlv_2= '\\u2192' | otherlv_3= '\\uE102' | otherlv_4= '\\uE100' | otherlv_5= '\\u2194' | otherlv_6= '\\u2916' | otherlv_7= '\\u21F8' | otherlv_8= '\\u21A3' | otherlv_9= '\\u2900' | otherlv_10= '\\u21A0' ) ( (lv_type_11_0= ruleConstructedType ) )
                    {
                    // InternalMyDsl.g:843:4: (otherlv_1= '\\u00D7' | otherlv_2= '\\u2192' | otherlv_3= '\\uE102' | otherlv_4= '\\uE100' | otherlv_5= '\\u2194' | otherlv_6= '\\u2916' | otherlv_7= '\\u21F8' | otherlv_8= '\\u21A3' | otherlv_9= '\\u2900' | otherlv_10= '\\u21A0' )
                    int alt15=10;
                    switch ( input.LA(1) ) {
                    case 21:
                        {
                        alt15=1;
                        }
                        break;
                    case 22:
                        {
                        alt15=2;
                        }
                        break;
                    case 23:
                        {
                        alt15=3;
                        }
                        break;
                    case 24:
                        {
                        alt15=4;
                        }
                        break;
                    case 25:
                        {
                        alt15=5;
                        }
                        break;
                    case 26:
                        {
                        alt15=6;
                        }
                        break;
                    case 27:
                        {
                        alt15=7;
                        }
                        break;
                    case 28:
                        {
                        alt15=8;
                        }
                        break;
                    case 29:
                        {
                        alt15=9;
                        }
                        break;
                    case 30:
                        {
                        alt15=10;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 15, 0, input);

                        throw nvae;
                    }

                    switch (alt15) {
                        case 1 :
                            // InternalMyDsl.g:844:5: otherlv_1= '\\u00D7'
                            {
                            otherlv_1=(Token)match(input,21,FOLLOW_5); 

                            					newLeafNode(otherlv_1, grammarAccess.getConstructedTypeAccess().getMultiplicationSignKeyword_1_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalMyDsl.g:849:5: otherlv_2= '\\u2192'
                            {
                            otherlv_2=(Token)match(input,22,FOLLOW_5); 

                            					newLeafNode(otherlv_2, grammarAccess.getConstructedTypeAccess().getRightwardsArrowKeyword_1_0_1());
                            				

                            }
                            break;
                        case 3 :
                            // InternalMyDsl.g:854:5: otherlv_3= '\\uE102'
                            {
                            otherlv_3=(Token)match(input,23,FOLLOW_5); 

                            					newLeafNode(otherlv_3, grammarAccess.getConstructedTypeAccess().getPrivateUseAreaE102Keyword_1_0_2());
                            				

                            }
                            break;
                        case 4 :
                            // InternalMyDsl.g:859:5: otherlv_4= '\\uE100'
                            {
                            otherlv_4=(Token)match(input,24,FOLLOW_5); 

                            					newLeafNode(otherlv_4, grammarAccess.getConstructedTypeAccess().getPrivateUseAreaE100Keyword_1_0_3());
                            				

                            }
                            break;
                        case 5 :
                            // InternalMyDsl.g:864:5: otherlv_5= '\\u2194'
                            {
                            otherlv_5=(Token)match(input,25,FOLLOW_5); 

                            					newLeafNode(otherlv_5, grammarAccess.getConstructedTypeAccess().getLeftRightArrowKeyword_1_0_4());
                            				

                            }
                            break;
                        case 6 :
                            // InternalMyDsl.g:869:5: otherlv_6= '\\u2916'
                            {
                            otherlv_6=(Token)match(input,26,FOLLOW_5); 

                            					newLeafNode(otherlv_6, grammarAccess.getConstructedTypeAccess().getRightwardsTwoHeadedArrowWithTailKeyword_1_0_5());
                            				

                            }
                            break;
                        case 7 :
                            // InternalMyDsl.g:874:5: otherlv_7= '\\u21F8'
                            {
                            otherlv_7=(Token)match(input,27,FOLLOW_5); 

                            					newLeafNode(otherlv_7, grammarAccess.getConstructedTypeAccess().getRightwardsArrowWithVerticalStrokeKeyword_1_0_6());
                            				

                            }
                            break;
                        case 8 :
                            // InternalMyDsl.g:879:5: otherlv_8= '\\u21A3'
                            {
                            otherlv_8=(Token)match(input,28,FOLLOW_5); 

                            					newLeafNode(otherlv_8, grammarAccess.getConstructedTypeAccess().getRightwardsArrowWithTailKeyword_1_0_7());
                            				

                            }
                            break;
                        case 9 :
                            // InternalMyDsl.g:884:5: otherlv_9= '\\u2900'
                            {
                            otherlv_9=(Token)match(input,29,FOLLOW_5); 

                            					newLeafNode(otherlv_9, grammarAccess.getConstructedTypeAccess().getRightwardsTwoHeadedArrowWithVerticalStrokeKeyword_1_0_8());
                            				

                            }
                            break;
                        case 10 :
                            // InternalMyDsl.g:889:5: otherlv_10= '\\u21A0'
                            {
                            otherlv_10=(Token)match(input,30,FOLLOW_5); 

                            					newLeafNode(otherlv_10, grammarAccess.getConstructedTypeAccess().getRightwardsTwoHeadedArrowKeyword_1_0_9());
                            				

                            }
                            break;

                    }

                    // InternalMyDsl.g:894:4: ( (lv_type_11_0= ruleConstructedType ) )
                    // InternalMyDsl.g:895:5: (lv_type_11_0= ruleConstructedType )
                    {
                    // InternalMyDsl.g:895:5: (lv_type_11_0= ruleConstructedType )
                    // InternalMyDsl.g:896:6: lv_type_11_0= ruleConstructedType
                    {

                    						newCompositeNode(grammarAccess.getConstructedTypeAccess().getTypeConstructedTypeParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_type_11_0=ruleConstructedType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConstructedTypeRule());
                    						}
                    						add(
                    							current,
                    							"type",
                    							lv_type_11_0,
                    							"org.xtext.sampleProj.mydsl.MyDsl.ConstructedType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstructedType"


    // $ANTLR start "entryRuleTypeConstructor"
    // InternalMyDsl.g:918:1: entryRuleTypeConstructor returns [EObject current=null] : iv_ruleTypeConstructor= ruleTypeConstructor EOF ;
    public final EObject entryRuleTypeConstructor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeConstructor = null;


        try {
            // InternalMyDsl.g:918:56: (iv_ruleTypeConstructor= ruleTypeConstructor EOF )
            // InternalMyDsl.g:919:2: iv_ruleTypeConstructor= ruleTypeConstructor EOF
            {
             newCompositeNode(grammarAccess.getTypeConstructorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTypeConstructor=ruleTypeConstructor();

            state._fsp--;

             current =iv_ruleTypeConstructor; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeConstructor"


    // $ANTLR start "ruleTypeConstructor"
    // InternalMyDsl.g:925:1: ruleTypeConstructor returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_context_1_0= ruleTypeDeclContext ) )? ) ;
    public final EObject ruleTypeConstructor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_context_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:931:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_context_1_0= ruleTypeDeclContext ) )? ) )
            // InternalMyDsl.g:932:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_context_1_0= ruleTypeDeclContext ) )? )
            {
            // InternalMyDsl.g:932:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_context_1_0= ruleTypeDeclContext ) )? )
            // InternalMyDsl.g:933:3: ( (otherlv_0= RULE_ID ) ) ( (lv_context_1_0= ruleTypeDeclContext ) )?
            {
            // InternalMyDsl.g:933:3: ( (otherlv_0= RULE_ID ) )
            // InternalMyDsl.g:934:4: (otherlv_0= RULE_ID )
            {
            // InternalMyDsl.g:934:4: (otherlv_0= RULE_ID )
            // InternalMyDsl.g:935:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTypeConstructorRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(otherlv_0, grammarAccess.getTypeConstructorAccess().getTypeNameNameCrossReference_0_0());
            				

            }


            }

            // InternalMyDsl.g:946:3: ( (lv_context_1_0= ruleTypeDeclContext ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==18) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMyDsl.g:947:4: (lv_context_1_0= ruleTypeDeclContext )
                    {
                    // InternalMyDsl.g:947:4: (lv_context_1_0= ruleTypeDeclContext )
                    // InternalMyDsl.g:948:5: lv_context_1_0= ruleTypeDeclContext
                    {

                    					newCompositeNode(grammarAccess.getTypeConstructorAccess().getContextTypeDeclContextParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_context_1_0=ruleTypeDeclContext();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTypeConstructorRule());
                    					}
                    					add(
                    						current,
                    						"context",
                    						lv_context_1_0,
                    						"org.xtext.sampleProj.mydsl.MyDsl.TypeDeclContext");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeConstructor"


    // $ANTLR start "entryRuleTypeDeclContext"
    // InternalMyDsl.g:969:1: entryRuleTypeDeclContext returns [EObject current=null] : iv_ruleTypeDeclContext= ruleTypeDeclContext EOF ;
    public final EObject entryRuleTypeDeclContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeDeclContext = null;


        try {
            // InternalMyDsl.g:969:56: (iv_ruleTypeDeclContext= ruleTypeDeclContext EOF )
            // InternalMyDsl.g:970:2: iv_ruleTypeDeclContext= ruleTypeDeclContext EOF
            {
             newCompositeNode(grammarAccess.getTypeDeclContextRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTypeDeclContext=ruleTypeDeclContext();

            state._fsp--;

             current =iv_ruleTypeDeclContext; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeDeclContext"


    // $ANTLR start "ruleTypeDeclContext"
    // InternalMyDsl.g:976:1: ruleTypeDeclContext returns [EObject current=null] : (otherlv_0= '<' ( (lv_typeName_1_0= ruleConstructedType ) ) (otherlv_2= ',' ( (lv_typeName_3_0= ruleConstructedType ) ) )* otherlv_4= '>' ) ;
    public final EObject ruleTypeDeclContext() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_typeName_1_0 = null;

        EObject lv_typeName_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:982:2: ( (otherlv_0= '<' ( (lv_typeName_1_0= ruleConstructedType ) ) (otherlv_2= ',' ( (lv_typeName_3_0= ruleConstructedType ) ) )* otherlv_4= '>' ) )
            // InternalMyDsl.g:983:2: (otherlv_0= '<' ( (lv_typeName_1_0= ruleConstructedType ) ) (otherlv_2= ',' ( (lv_typeName_3_0= ruleConstructedType ) ) )* otherlv_4= '>' )
            {
            // InternalMyDsl.g:983:2: (otherlv_0= '<' ( (lv_typeName_1_0= ruleConstructedType ) ) (otherlv_2= ',' ( (lv_typeName_3_0= ruleConstructedType ) ) )* otherlv_4= '>' )
            // InternalMyDsl.g:984:3: otherlv_0= '<' ( (lv_typeName_1_0= ruleConstructedType ) ) (otherlv_2= ',' ( (lv_typeName_3_0= ruleConstructedType ) ) )* otherlv_4= '>'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getTypeDeclContextAccess().getLessThanSignKeyword_0());
            		
            // InternalMyDsl.g:988:3: ( (lv_typeName_1_0= ruleConstructedType ) )
            // InternalMyDsl.g:989:4: (lv_typeName_1_0= ruleConstructedType )
            {
            // InternalMyDsl.g:989:4: (lv_typeName_1_0= ruleConstructedType )
            // InternalMyDsl.g:990:5: lv_typeName_1_0= ruleConstructedType
            {

            					newCompositeNode(grammarAccess.getTypeDeclContextAccess().getTypeNameConstructedTypeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_19);
            lv_typeName_1_0=ruleConstructedType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTypeDeclContextRule());
            					}
            					add(
            						current,
            						"typeName",
            						lv_typeName_1_0,
            						"org.xtext.sampleProj.mydsl.MyDsl.ConstructedType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:1007:3: (otherlv_2= ',' ( (lv_typeName_3_0= ruleConstructedType ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==20) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalMyDsl.g:1008:4: otherlv_2= ',' ( (lv_typeName_3_0= ruleConstructedType ) )
            	    {
            	    otherlv_2=(Token)match(input,20,FOLLOW_5); 

            	    				newLeafNode(otherlv_2, grammarAccess.getTypeDeclContextAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalMyDsl.g:1012:4: ( (lv_typeName_3_0= ruleConstructedType ) )
            	    // InternalMyDsl.g:1013:5: (lv_typeName_3_0= ruleConstructedType )
            	    {
            	    // InternalMyDsl.g:1013:5: (lv_typeName_3_0= ruleConstructedType )
            	    // InternalMyDsl.g:1014:6: lv_typeName_3_0= ruleConstructedType
            	    {

            	    						newCompositeNode(grammarAccess.getTypeDeclContextAccess().getTypeNameConstructedTypeParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_19);
            	    lv_typeName_3_0=ruleConstructedType();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTypeDeclContextRule());
            	    						}
            	    						add(
            	    							current,
            	    							"typeName",
            	    							lv_typeName_3_0,
            	    							"org.xtext.sampleProj.mydsl.MyDsl.ConstructedType");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            otherlv_4=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getTypeDeclContextAccess().getGreaterThanSignKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeDeclContext"


    // $ANTLR start "entryRuleTypeStructure"
    // InternalMyDsl.g:1040:1: entryRuleTypeStructure returns [EObject current=null] : iv_ruleTypeStructure= ruleTypeStructure EOF ;
    public final EObject entryRuleTypeStructure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeStructure = null;


        try {
            // InternalMyDsl.g:1040:54: (iv_ruleTypeStructure= ruleTypeStructure EOF )
            // InternalMyDsl.g:1041:2: iv_ruleTypeStructure= ruleTypeStructure EOF
            {
             newCompositeNode(grammarAccess.getTypeStructureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTypeStructure=ruleTypeStructure();

            state._fsp--;

             current =iv_ruleTypeStructure; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeStructure"


    // $ANTLR start "ruleTypeStructure"
    // InternalMyDsl.g:1047:1: ruleTypeStructure returns [EObject current=null] : (otherlv_0= '(' ( (lv_variables_1_0= ruleTypedVariableList ) ) otherlv_2= ')' ) ;
    public final EObject ruleTypeStructure() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_variables_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1053:2: ( (otherlv_0= '(' ( (lv_variables_1_0= ruleTypedVariableList ) ) otherlv_2= ')' ) )
            // InternalMyDsl.g:1054:2: (otherlv_0= '(' ( (lv_variables_1_0= ruleTypedVariableList ) ) otherlv_2= ')' )
            {
            // InternalMyDsl.g:1054:2: (otherlv_0= '(' ( (lv_variables_1_0= ruleTypedVariableList ) ) otherlv_2= ')' )
            // InternalMyDsl.g:1055:3: otherlv_0= '(' ( (lv_variables_1_0= ruleTypedVariableList ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getTypeStructureAccess().getLeftParenthesisKeyword_0());
            		
            // InternalMyDsl.g:1059:3: ( (lv_variables_1_0= ruleTypedVariableList ) )
            // InternalMyDsl.g:1060:4: (lv_variables_1_0= ruleTypedVariableList )
            {
            // InternalMyDsl.g:1060:4: (lv_variables_1_0= ruleTypedVariableList )
            // InternalMyDsl.g:1061:5: lv_variables_1_0= ruleTypedVariableList
            {

            					newCompositeNode(grammarAccess.getTypeStructureAccess().getVariablesTypedVariableListParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_20);
            lv_variables_1_0=ruleTypedVariableList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTypeStructureRule());
            					}
            					set(
            						current,
            						"variables",
            						lv_variables_1_0,
            						"org.xtext.sampleProj.mydsl.MyDsl.TypedVariableList");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,32,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getTypeStructureAccess().getRightParenthesisKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeStructure"


    // $ANTLR start "entryRuleWhere"
    // InternalMyDsl.g:1086:1: entryRuleWhere returns [EObject current=null] : iv_ruleWhere= ruleWhere EOF ;
    public final EObject entryRuleWhere() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhere = null;


        try {
            // InternalMyDsl.g:1086:46: (iv_ruleWhere= ruleWhere EOF )
            // InternalMyDsl.g:1087:2: iv_ruleWhere= ruleWhere EOF
            {
             newCompositeNode(grammarAccess.getWhereRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWhere=ruleWhere();

            state._fsp--;

             current =iv_ruleWhere; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWhere"


    // $ANTLR start "ruleWhere"
    // InternalMyDsl.g:1093:1: ruleWhere returns [EObject current=null] : (otherlv_0= 'where' ( (lv_expessions_1_0= ruleExpression ) ) (otherlv_2= ';' ( (lv_expressions_3_0= ruleExpression ) ) )* ) ;
    public final EObject ruleWhere() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_expessions_1_0 = null;

        EObject lv_expressions_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1099:2: ( (otherlv_0= 'where' ( (lv_expessions_1_0= ruleExpression ) ) (otherlv_2= ';' ( (lv_expressions_3_0= ruleExpression ) ) )* ) )
            // InternalMyDsl.g:1100:2: (otherlv_0= 'where' ( (lv_expessions_1_0= ruleExpression ) ) (otherlv_2= ';' ( (lv_expressions_3_0= ruleExpression ) ) )* )
            {
            // InternalMyDsl.g:1100:2: (otherlv_0= 'where' ( (lv_expessions_1_0= ruleExpression ) ) (otherlv_2= ';' ( (lv_expressions_3_0= ruleExpression ) ) )* )
            // InternalMyDsl.g:1101:3: otherlv_0= 'where' ( (lv_expessions_1_0= ruleExpression ) ) (otherlv_2= ';' ( (lv_expressions_3_0= ruleExpression ) ) )*
            {
            otherlv_0=(Token)match(input,33,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getWhereAccess().getWhereKeyword_0());
            		
            // InternalMyDsl.g:1105:3: ( (lv_expessions_1_0= ruleExpression ) )
            // InternalMyDsl.g:1106:4: (lv_expessions_1_0= ruleExpression )
            {
            // InternalMyDsl.g:1106:4: (lv_expessions_1_0= ruleExpression )
            // InternalMyDsl.g:1107:5: lv_expessions_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getWhereAccess().getExpessionsExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_21);
            lv_expessions_1_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWhereRule());
            					}
            					add(
            						current,
            						"expessions",
            						lv_expessions_1_0,
            						"org.xtext.sampleProj.mydsl.MyDsl.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:1124:3: (otherlv_2= ';' ( (lv_expressions_3_0= ruleExpression ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==15) ) {
                    int LA19_1 = input.LA(2);

                    if ( (LA19_1==RULE_ID) ) {
                        alt19=1;
                    }


                }


                switch (alt19) {
            	case 1 :
            	    // InternalMyDsl.g:1125:4: otherlv_2= ';' ( (lv_expressions_3_0= ruleExpression ) )
            	    {
            	    otherlv_2=(Token)match(input,15,FOLLOW_5); 

            	    				newLeafNode(otherlv_2, grammarAccess.getWhereAccess().getSemicolonKeyword_2_0());
            	    			
            	    // InternalMyDsl.g:1129:4: ( (lv_expressions_3_0= ruleExpression ) )
            	    // InternalMyDsl.g:1130:5: (lv_expressions_3_0= ruleExpression )
            	    {
            	    // InternalMyDsl.g:1130:5: (lv_expressions_3_0= ruleExpression )
            	    // InternalMyDsl.g:1131:6: lv_expressions_3_0= ruleExpression
            	    {

            	    						newCompositeNode(grammarAccess.getWhereAccess().getExpressionsExpressionParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_21);
            	    lv_expressions_3_0=ruleExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getWhereRule());
            	    						}
            	    						add(
            	    							current,
            	    							"expressions",
            	    							lv_expressions_3_0,
            	    							"org.xtext.sampleProj.mydsl.MyDsl.Expression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWhere"


    // $ANTLR start "entryRuleDatatype"
    // InternalMyDsl.g:1153:1: entryRuleDatatype returns [EObject current=null] : iv_ruleDatatype= ruleDatatype EOF ;
    public final EObject entryRuleDatatype() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatatype = null;


        try {
            // InternalMyDsl.g:1153:49: (iv_ruleDatatype= ruleDatatype EOF )
            // InternalMyDsl.g:1154:2: iv_ruleDatatype= ruleDatatype EOF
            {
             newCompositeNode(grammarAccess.getDatatypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDatatype=ruleDatatype();

            state._fsp--;

             current =iv_ruleDatatype; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDatatype"


    // $ANTLR start "ruleDatatype"
    // InternalMyDsl.g:1160:1: ruleDatatype returns [EObject current=null] : (otherlv_0= 'Datatype' ( (lv_name_1_0= ruleTypeName ) ) ( (lv_context_2_0= rulePolyContext ) )? ( (lv_constructors_3_0= ruleDatatypeConstructor ) )* otherlv_4= '{' ( (lv_bodyElements_5_0= ruleTypeBodyElements ) )* otherlv_6= '}' ) ;
    public final EObject ruleDatatype() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_name_1_0 = null;

        EObject lv_context_2_0 = null;

        EObject lv_constructors_3_0 = null;

        EObject lv_bodyElements_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1166:2: ( (otherlv_0= 'Datatype' ( (lv_name_1_0= ruleTypeName ) ) ( (lv_context_2_0= rulePolyContext ) )? ( (lv_constructors_3_0= ruleDatatypeConstructor ) )* otherlv_4= '{' ( (lv_bodyElements_5_0= ruleTypeBodyElements ) )* otherlv_6= '}' ) )
            // InternalMyDsl.g:1167:2: (otherlv_0= 'Datatype' ( (lv_name_1_0= ruleTypeName ) ) ( (lv_context_2_0= rulePolyContext ) )? ( (lv_constructors_3_0= ruleDatatypeConstructor ) )* otherlv_4= '{' ( (lv_bodyElements_5_0= ruleTypeBodyElements ) )* otherlv_6= '}' )
            {
            // InternalMyDsl.g:1167:2: (otherlv_0= 'Datatype' ( (lv_name_1_0= ruleTypeName ) ) ( (lv_context_2_0= rulePolyContext ) )? ( (lv_constructors_3_0= ruleDatatypeConstructor ) )* otherlv_4= '{' ( (lv_bodyElements_5_0= ruleTypeBodyElements ) )* otherlv_6= '}' )
            // InternalMyDsl.g:1168:3: otherlv_0= 'Datatype' ( (lv_name_1_0= ruleTypeName ) ) ( (lv_context_2_0= rulePolyContext ) )? ( (lv_constructors_3_0= ruleDatatypeConstructor ) )* otherlv_4= '{' ( (lv_bodyElements_5_0= ruleTypeBodyElements ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getDatatypeAccess().getDatatypeKeyword_0());
            		
            // InternalMyDsl.g:1172:3: ( (lv_name_1_0= ruleTypeName ) )
            // InternalMyDsl.g:1173:4: (lv_name_1_0= ruleTypeName )
            {
            // InternalMyDsl.g:1173:4: (lv_name_1_0= ruleTypeName )
            // InternalMyDsl.g:1174:5: lv_name_1_0= ruleTypeName
            {

            					newCompositeNode(grammarAccess.getDatatypeAccess().getNameTypeNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_22);
            lv_name_1_0=ruleTypeName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDatatypeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.sampleProj.mydsl.MyDsl.TypeName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:1191:3: ( (lv_context_2_0= rulePolyContext ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==18) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalMyDsl.g:1192:4: (lv_context_2_0= rulePolyContext )
                    {
                    // InternalMyDsl.g:1192:4: (lv_context_2_0= rulePolyContext )
                    // InternalMyDsl.g:1193:5: lv_context_2_0= rulePolyContext
                    {

                    					newCompositeNode(grammarAccess.getDatatypeAccess().getContextPolyContextParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_23);
                    lv_context_2_0=rulePolyContext();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDatatypeRule());
                    					}
                    					set(
                    						current,
                    						"context",
                    						lv_context_2_0,
                    						"org.xtext.sampleProj.mydsl.MyDsl.PolyContext");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1210:3: ( (lv_constructors_3_0= ruleDatatypeConstructor ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==35) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalMyDsl.g:1211:4: (lv_constructors_3_0= ruleDatatypeConstructor )
            	    {
            	    // InternalMyDsl.g:1211:4: (lv_constructors_3_0= ruleDatatypeConstructor )
            	    // InternalMyDsl.g:1212:5: lv_constructors_3_0= ruleDatatypeConstructor
            	    {

            	    					newCompositeNode(grammarAccess.getDatatypeAccess().getConstructorsDatatypeConstructorParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_23);
            	    lv_constructors_3_0=ruleDatatypeConstructor();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDatatypeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"constructors",
            	    						lv_constructors_3_0,
            	    						"org.xtext.sampleProj.mydsl.MyDsl.DatatypeConstructor");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            otherlv_4=(Token)match(input,16,FOLLOW_13); 

            			newLeafNode(otherlv_4, grammarAccess.getDatatypeAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalMyDsl.g:1233:3: ( (lv_bodyElements_5_0= ruleTypeBodyElements ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_ID||LA22_0==37) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalMyDsl.g:1234:4: (lv_bodyElements_5_0= ruleTypeBodyElements )
            	    {
            	    // InternalMyDsl.g:1234:4: (lv_bodyElements_5_0= ruleTypeBodyElements )
            	    // InternalMyDsl.g:1235:5: lv_bodyElements_5_0= ruleTypeBodyElements
            	    {

            	    					newCompositeNode(grammarAccess.getDatatypeAccess().getBodyElementsTypeBodyElementsParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_bodyElements_5_0=ruleTypeBodyElements();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDatatypeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"bodyElements",
            	    						lv_bodyElements_5_0,
            	    						"org.xtext.sampleProj.mydsl.MyDsl.TypeBodyElements");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            otherlv_6=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getDatatypeAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDatatype"


    // $ANTLR start "entryRuleDatatypeConstructor"
    // InternalMyDsl.g:1260:1: entryRuleDatatypeConstructor returns [EObject current=null] : iv_ruleDatatypeConstructor= ruleDatatypeConstructor EOF ;
    public final EObject entryRuleDatatypeConstructor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatatypeConstructor = null;


        try {
            // InternalMyDsl.g:1260:60: (iv_ruleDatatypeConstructor= ruleDatatypeConstructor EOF )
            // InternalMyDsl.g:1261:2: iv_ruleDatatypeConstructor= ruleDatatypeConstructor EOF
            {
             newCompositeNode(grammarAccess.getDatatypeConstructorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDatatypeConstructor=ruleDatatypeConstructor();

            state._fsp--;

             current =iv_ruleDatatypeConstructor; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDatatypeConstructor"


    // $ANTLR start "ruleDatatypeConstructor"
    // InternalMyDsl.g:1267:1: ruleDatatypeConstructor returns [EObject current=null] : (otherlv_0= '|' (this_BaseConstructor_1= ruleBaseConstructor | this_DTypeConstructor_2= ruleDTypeConstructor ) ) ;
    public final EObject ruleDatatypeConstructor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_BaseConstructor_1 = null;

        EObject this_DTypeConstructor_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1273:2: ( (otherlv_0= '|' (this_BaseConstructor_1= ruleBaseConstructor | this_DTypeConstructor_2= ruleDTypeConstructor ) ) )
            // InternalMyDsl.g:1274:2: (otherlv_0= '|' (this_BaseConstructor_1= ruleBaseConstructor | this_DTypeConstructor_2= ruleDTypeConstructor ) )
            {
            // InternalMyDsl.g:1274:2: (otherlv_0= '|' (this_BaseConstructor_1= ruleBaseConstructor | this_DTypeConstructor_2= ruleDTypeConstructor ) )
            // InternalMyDsl.g:1275:3: otherlv_0= '|' (this_BaseConstructor_1= ruleBaseConstructor | this_DTypeConstructor_2= ruleDTypeConstructor )
            {
            otherlv_0=(Token)match(input,35,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getDatatypeConstructorAccess().getVerticalLineKeyword_0());
            		
            // InternalMyDsl.g:1279:3: (this_BaseConstructor_1= ruleBaseConstructor | this_DTypeConstructor_2= ruleDTypeConstructor )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ID) ) {
                int LA23_1 = input.LA(2);

                if ( (LA23_1==EOF||LA23_1==16||LA23_1==35) ) {
                    alt23=1;
                }
                else if ( (LA23_1==31) ) {
                    alt23=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalMyDsl.g:1280:4: this_BaseConstructor_1= ruleBaseConstructor
                    {

                    				newCompositeNode(grammarAccess.getDatatypeConstructorAccess().getBaseConstructorParserRuleCall_1_0());
                    			
                    pushFollow(FOLLOW_2);
                    this_BaseConstructor_1=ruleBaseConstructor();

                    state._fsp--;


                    				current = this_BaseConstructor_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1289:4: this_DTypeConstructor_2= ruleDTypeConstructor
                    {

                    				newCompositeNode(grammarAccess.getDatatypeConstructorAccess().getDTypeConstructorParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_2);
                    this_DTypeConstructor_2=ruleDTypeConstructor();

                    state._fsp--;


                    				current = this_DTypeConstructor_2;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDatatypeConstructor"


    // $ANTLR start "entryRuleBaseConstructor"
    // InternalMyDsl.g:1302:1: entryRuleBaseConstructor returns [EObject current=null] : iv_ruleBaseConstructor= ruleBaseConstructor EOF ;
    public final EObject entryRuleBaseConstructor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBaseConstructor = null;


        try {
            // InternalMyDsl.g:1302:56: (iv_ruleBaseConstructor= ruleBaseConstructor EOF )
            // InternalMyDsl.g:1303:2: iv_ruleBaseConstructor= ruleBaseConstructor EOF
            {
             newCompositeNode(grammarAccess.getBaseConstructorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBaseConstructor=ruleBaseConstructor();

            state._fsp--;

             current =iv_ruleBaseConstructor; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBaseConstructor"


    // $ANTLR start "ruleBaseConstructor"
    // InternalMyDsl.g:1309:1: ruleBaseConstructor returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleBaseConstructor() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1315:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalMyDsl.g:1316:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalMyDsl.g:1316:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalMyDsl.g:1317:3: (lv_name_0_0= RULE_ID )
            {
            // InternalMyDsl.g:1317:3: (lv_name_0_0= RULE_ID )
            // InternalMyDsl.g:1318:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getBaseConstructorAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getBaseConstructorRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBaseConstructor"


    // $ANTLR start "entryRuleDTypeConstructor"
    // InternalMyDsl.g:1337:1: entryRuleDTypeConstructor returns [EObject current=null] : iv_ruleDTypeConstructor= ruleDTypeConstructor EOF ;
    public final EObject entryRuleDTypeConstructor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDTypeConstructor = null;


        try {
            // InternalMyDsl.g:1337:57: (iv_ruleDTypeConstructor= ruleDTypeConstructor EOF )
            // InternalMyDsl.g:1338:2: iv_ruleDTypeConstructor= ruleDTypeConstructor EOF
            {
             newCompositeNode(grammarAccess.getDTypeConstructorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDTypeConstructor=ruleDTypeConstructor();

            state._fsp--;

             current =iv_ruleDTypeConstructor; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDTypeConstructor"


    // $ANTLR start "ruleDTypeConstructor"
    // InternalMyDsl.g:1344:1: ruleDTypeConstructor returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_decons_2_0= ruleTypedVariableList ) ) otherlv_3= ')' ) ;
    public final EObject ruleDTypeConstructor() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_decons_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1350:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_decons_2_0= ruleTypedVariableList ) ) otherlv_3= ')' ) )
            // InternalMyDsl.g:1351:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_decons_2_0= ruleTypedVariableList ) ) otherlv_3= ')' )
            {
            // InternalMyDsl.g:1351:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_decons_2_0= ruleTypedVariableList ) ) otherlv_3= ')' )
            // InternalMyDsl.g:1352:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_decons_2_0= ruleTypedVariableList ) ) otherlv_3= ')'
            {
            // InternalMyDsl.g:1352:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalMyDsl.g:1353:4: (lv_name_0_0= RULE_ID )
            {
            // InternalMyDsl.g:1353:4: (lv_name_0_0= RULE_ID )
            // InternalMyDsl.g:1354:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_24); 

            					newLeafNode(lv_name_0_0, grammarAccess.getDTypeConstructorAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDTypeConstructorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,31,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getDTypeConstructorAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMyDsl.g:1374:3: ( (lv_decons_2_0= ruleTypedVariableList ) )
            // InternalMyDsl.g:1375:4: (lv_decons_2_0= ruleTypedVariableList )
            {
            // InternalMyDsl.g:1375:4: (lv_decons_2_0= ruleTypedVariableList )
            // InternalMyDsl.g:1376:5: lv_decons_2_0= ruleTypedVariableList
            {

            					newCompositeNode(grammarAccess.getDTypeConstructorAccess().getDeconsTypedVariableListParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_20);
            lv_decons_2_0=ruleTypedVariableList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDTypeConstructorRule());
            					}
            					set(
            						current,
            						"decons",
            						lv_decons_2_0,
            						"org.xtext.sampleProj.mydsl.MyDsl.TypedVariableList");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,32,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getDTypeConstructorAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDTypeConstructor"


    // $ANTLR start "entryRuleExtend"
    // InternalMyDsl.g:1401:1: entryRuleExtend returns [EObject current=null] : iv_ruleExtend= ruleExtend EOF ;
    public final EObject entryRuleExtend() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtend = null;


        try {
            // InternalMyDsl.g:1401:47: (iv_ruleExtend= ruleExtend EOF )
            // InternalMyDsl.g:1402:2: iv_ruleExtend= ruleExtend EOF
            {
             newCompositeNode(grammarAccess.getExtendRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExtend=ruleExtend();

            state._fsp--;

             current =iv_ruleExtend; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExtend"


    // $ANTLR start "ruleExtend"
    // InternalMyDsl.g:1408:1: ruleExtend returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_extesnion_2_0= RULE_ID ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_bodyElements_5_0= ruleTypeBodyElements ) )* otherlv_6= '}' ) ;
    public final EObject ruleExtend() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_extesnion_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_bodyElements_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1414:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_extesnion_2_0= RULE_ID ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_bodyElements_5_0= ruleTypeBodyElements ) )* otherlv_6= '}' ) )
            // InternalMyDsl.g:1415:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_extesnion_2_0= RULE_ID ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_bodyElements_5_0= ruleTypeBodyElements ) )* otherlv_6= '}' )
            {
            // InternalMyDsl.g:1415:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_extesnion_2_0= RULE_ID ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_bodyElements_5_0= ruleTypeBodyElements ) )* otherlv_6= '}' )
            // InternalMyDsl.g:1416:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_extesnion_2_0= RULE_ID ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_bodyElements_5_0= ruleTypeBodyElements ) )* otherlv_6= '}'
            {
            // InternalMyDsl.g:1416:3: ( (otherlv_0= RULE_ID ) )
            // InternalMyDsl.g:1417:4: (otherlv_0= RULE_ID )
            {
            // InternalMyDsl.g:1417:4: (otherlv_0= RULE_ID )
            // InternalMyDsl.g:1418:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExtendRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_24); 

            					newLeafNode(otherlv_0, grammarAccess.getExtendAccess().getNameTypeNameCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,31,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getExtendAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMyDsl.g:1433:3: ( (lv_extesnion_2_0= RULE_ID ) )
            // InternalMyDsl.g:1434:4: (lv_extesnion_2_0= RULE_ID )
            {
            // InternalMyDsl.g:1434:4: (lv_extesnion_2_0= RULE_ID )
            // InternalMyDsl.g:1435:5: lv_extesnion_2_0= RULE_ID
            {
            lv_extesnion_2_0=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(lv_extesnion_2_0, grammarAccess.getExtendAccess().getExtesnionIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExtendRule());
            					}
            					setWithLastConsumed(
            						current,
            						"extesnion",
            						lv_extesnion_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,32,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getExtendAccess().getRightParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,16,FOLLOW_13); 

            			newLeafNode(otherlv_4, grammarAccess.getExtendAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalMyDsl.g:1459:3: ( (lv_bodyElements_5_0= ruleTypeBodyElements ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_ID||LA24_0==37) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalMyDsl.g:1460:4: (lv_bodyElements_5_0= ruleTypeBodyElements )
            	    {
            	    // InternalMyDsl.g:1460:4: (lv_bodyElements_5_0= ruleTypeBodyElements )
            	    // InternalMyDsl.g:1461:5: lv_bodyElements_5_0= ruleTypeBodyElements
            	    {

            	    					newCompositeNode(grammarAccess.getExtendAccess().getBodyElementsTypeBodyElementsParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_bodyElements_5_0=ruleTypeBodyElements();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getExtendRule());
            	    					}
            	    					add(
            	    						current,
            	    						"bodyElements",
            	    						lv_bodyElements_5_0,
            	    						"org.xtext.sampleProj.mydsl.MyDsl.TypeBodyElements");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            otherlv_6=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getExtendAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExtend"


    // $ANTLR start "entryRuleTypeBodyElements"
    // InternalMyDsl.g:1486:1: entryRuleTypeBodyElements returns [EObject current=null] : iv_ruleTypeBodyElements= ruleTypeBodyElements EOF ;
    public final EObject entryRuleTypeBodyElements() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeBodyElements = null;


        try {
            // InternalMyDsl.g:1486:57: (iv_ruleTypeBodyElements= ruleTypeBodyElements EOF )
            // InternalMyDsl.g:1487:2: iv_ruleTypeBodyElements= ruleTypeBodyElements EOF
            {
             newCompositeNode(grammarAccess.getTypeBodyElementsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTypeBodyElements=ruleTypeBodyElements();

            state._fsp--;

             current =iv_ruleTypeBodyElements; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeBodyElements"


    // $ANTLR start "ruleTypeBodyElements"
    // InternalMyDsl.g:1493:1: ruleTypeBodyElements returns [EObject current=null] : ( ( (lv_functions_0_0= ruleFunctionDecl ) ) | ( (lv_theorems_1_0= ruleTheoremBody ) ) ) ;
    public final EObject ruleTypeBodyElements() throws RecognitionException {
        EObject current = null;

        EObject lv_functions_0_0 = null;

        EObject lv_theorems_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1499:2: ( ( ( (lv_functions_0_0= ruleFunctionDecl ) ) | ( (lv_theorems_1_0= ruleTheoremBody ) ) ) )
            // InternalMyDsl.g:1500:2: ( ( (lv_functions_0_0= ruleFunctionDecl ) ) | ( (lv_theorems_1_0= ruleTheoremBody ) ) )
            {
            // InternalMyDsl.g:1500:2: ( ( (lv_functions_0_0= ruleFunctionDecl ) ) | ( (lv_theorems_1_0= ruleTheoremBody ) ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_ID) ) {
                alt25=1;
            }
            else if ( (LA25_0==37) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalMyDsl.g:1501:3: ( (lv_functions_0_0= ruleFunctionDecl ) )
                    {
                    // InternalMyDsl.g:1501:3: ( (lv_functions_0_0= ruleFunctionDecl ) )
                    // InternalMyDsl.g:1502:4: (lv_functions_0_0= ruleFunctionDecl )
                    {
                    // InternalMyDsl.g:1502:4: (lv_functions_0_0= ruleFunctionDecl )
                    // InternalMyDsl.g:1503:5: lv_functions_0_0= ruleFunctionDecl
                    {

                    					newCompositeNode(grammarAccess.getTypeBodyElementsAccess().getFunctionsFunctionDeclParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_functions_0_0=ruleFunctionDecl();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTypeBodyElementsRule());
                    					}
                    					add(
                    						current,
                    						"functions",
                    						lv_functions_0_0,
                    						"org.xtext.sampleProj.mydsl.MyDsl.FunctionDecl");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1521:3: ( (lv_theorems_1_0= ruleTheoremBody ) )
                    {
                    // InternalMyDsl.g:1521:3: ( (lv_theorems_1_0= ruleTheoremBody ) )
                    // InternalMyDsl.g:1522:4: (lv_theorems_1_0= ruleTheoremBody )
                    {
                    // InternalMyDsl.g:1522:4: (lv_theorems_1_0= ruleTheoremBody )
                    // InternalMyDsl.g:1523:5: lv_theorems_1_0= ruleTheoremBody
                    {

                    					newCompositeNode(grammarAccess.getTypeBodyElementsAccess().getTheoremsTheoremBodyParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_theorems_1_0=ruleTheoremBody();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTypeBodyElementsRule());
                    					}
                    					add(
                    						current,
                    						"theorems",
                    						lv_theorems_1_0,
                    						"org.xtext.sampleProj.mydsl.MyDsl.TheoremBody");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeBodyElements"


    // $ANTLR start "entryRuleFunctionDecl"
    // InternalMyDsl.g:1544:1: entryRuleFunctionDecl returns [EObject current=null] : iv_ruleFunctionDecl= ruleFunctionDecl EOF ;
    public final EObject entryRuleFunctionDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionDecl = null;


        try {
            // InternalMyDsl.g:1544:53: (iv_ruleFunctionDecl= ruleFunctionDecl EOF )
            // InternalMyDsl.g:1545:2: iv_ruleFunctionDecl= ruleFunctionDecl EOF
            {
             newCompositeNode(grammarAccess.getFunctionDeclRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunctionDecl=ruleFunctionDecl();

            state._fsp--;

             current =iv_ruleFunctionDecl; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionDecl"


    // $ANTLR start "ruleFunctionDecl"
    // InternalMyDsl.g:1551:1: ruleFunctionDecl returns [EObject current=null] : ( ( (lv_name_0_0= ruleFunctionName ) ) ( (lv_context_1_0= rulePolyContext ) )? otherlv_2= '(' ( (lv_variables_3_0= ruleTypedVariableList ) )? otherlv_4= ')' ( (lv_body_5_0= ruleFunctionBody ) ) otherlv_6= ':' ( (lv_returnType_7_0= ruleTypeConstructor ) ) ) ;
    public final EObject ruleFunctionDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_name_0_0 = null;

        EObject lv_context_1_0 = null;

        EObject lv_variables_3_0 = null;

        EObject lv_body_5_0 = null;

        EObject lv_returnType_7_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1557:2: ( ( ( (lv_name_0_0= ruleFunctionName ) ) ( (lv_context_1_0= rulePolyContext ) )? otherlv_2= '(' ( (lv_variables_3_0= ruleTypedVariableList ) )? otherlv_4= ')' ( (lv_body_5_0= ruleFunctionBody ) ) otherlv_6= ':' ( (lv_returnType_7_0= ruleTypeConstructor ) ) ) )
            // InternalMyDsl.g:1558:2: ( ( (lv_name_0_0= ruleFunctionName ) ) ( (lv_context_1_0= rulePolyContext ) )? otherlv_2= '(' ( (lv_variables_3_0= ruleTypedVariableList ) )? otherlv_4= ')' ( (lv_body_5_0= ruleFunctionBody ) ) otherlv_6= ':' ( (lv_returnType_7_0= ruleTypeConstructor ) ) )
            {
            // InternalMyDsl.g:1558:2: ( ( (lv_name_0_0= ruleFunctionName ) ) ( (lv_context_1_0= rulePolyContext ) )? otherlv_2= '(' ( (lv_variables_3_0= ruleTypedVariableList ) )? otherlv_4= ')' ( (lv_body_5_0= ruleFunctionBody ) ) otherlv_6= ':' ( (lv_returnType_7_0= ruleTypeConstructor ) ) )
            // InternalMyDsl.g:1559:3: ( (lv_name_0_0= ruleFunctionName ) ) ( (lv_context_1_0= rulePolyContext ) )? otherlv_2= '(' ( (lv_variables_3_0= ruleTypedVariableList ) )? otherlv_4= ')' ( (lv_body_5_0= ruleFunctionBody ) ) otherlv_6= ':' ( (lv_returnType_7_0= ruleTypeConstructor ) )
            {
            // InternalMyDsl.g:1559:3: ( (lv_name_0_0= ruleFunctionName ) )
            // InternalMyDsl.g:1560:4: (lv_name_0_0= ruleFunctionName )
            {
            // InternalMyDsl.g:1560:4: (lv_name_0_0= ruleFunctionName )
            // InternalMyDsl.g:1561:5: lv_name_0_0= ruleFunctionName
            {

            					newCompositeNode(grammarAccess.getFunctionDeclAccess().getNameFunctionNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_25);
            lv_name_0_0=ruleFunctionName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFunctionDeclRule());
            					}
            					add(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.xtext.sampleProj.mydsl.MyDsl.FunctionName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:1578:3: ( (lv_context_1_0= rulePolyContext ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==18) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalMyDsl.g:1579:4: (lv_context_1_0= rulePolyContext )
                    {
                    // InternalMyDsl.g:1579:4: (lv_context_1_0= rulePolyContext )
                    // InternalMyDsl.g:1580:5: lv_context_1_0= rulePolyContext
                    {

                    					newCompositeNode(grammarAccess.getFunctionDeclAccess().getContextPolyContextParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_24);
                    lv_context_1_0=rulePolyContext();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFunctionDeclRule());
                    					}
                    					set(
                    						current,
                    						"context",
                    						lv_context_1_0,
                    						"org.xtext.sampleProj.mydsl.MyDsl.PolyContext");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,31,FOLLOW_26); 

            			newLeafNode(otherlv_2, grammarAccess.getFunctionDeclAccess().getLeftParenthesisKeyword_2());
            		
            // InternalMyDsl.g:1601:3: ( (lv_variables_3_0= ruleTypedVariableList ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_ID) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalMyDsl.g:1602:4: (lv_variables_3_0= ruleTypedVariableList )
                    {
                    // InternalMyDsl.g:1602:4: (lv_variables_3_0= ruleTypedVariableList )
                    // InternalMyDsl.g:1603:5: lv_variables_3_0= ruleTypedVariableList
                    {

                    					newCompositeNode(grammarAccess.getFunctionDeclAccess().getVariablesTypedVariableListParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_20);
                    lv_variables_3_0=ruleTypedVariableList();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFunctionDeclRule());
                    					}
                    					set(
                    						current,
                    						"variables",
                    						lv_variables_3_0,
                    						"org.xtext.sampleProj.mydsl.MyDsl.TypedVariableList");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,32,FOLLOW_27); 

            			newLeafNode(otherlv_4, grammarAccess.getFunctionDeclAccess().getRightParenthesisKeyword_4());
            		
            // InternalMyDsl.g:1624:3: ( (lv_body_5_0= ruleFunctionBody ) )
            // InternalMyDsl.g:1625:4: (lv_body_5_0= ruleFunctionBody )
            {
            // InternalMyDsl.g:1625:4: (lv_body_5_0= ruleFunctionBody )
            // InternalMyDsl.g:1626:5: lv_body_5_0= ruleFunctionBody
            {

            					newCompositeNode(grammarAccess.getFunctionDeclAccess().getBodyFunctionBodyParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_28);
            lv_body_5_0=ruleFunctionBody();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFunctionDeclRule());
            					}
            					set(
            						current,
            						"body",
            						lv_body_5_0,
            						"org.xtext.sampleProj.mydsl.MyDsl.FunctionBody");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_6, grammarAccess.getFunctionDeclAccess().getColonKeyword_6());
            		
            // InternalMyDsl.g:1647:3: ( (lv_returnType_7_0= ruleTypeConstructor ) )
            // InternalMyDsl.g:1648:4: (lv_returnType_7_0= ruleTypeConstructor )
            {
            // InternalMyDsl.g:1648:4: (lv_returnType_7_0= ruleTypeConstructor )
            // InternalMyDsl.g:1649:5: lv_returnType_7_0= ruleTypeConstructor
            {

            					newCompositeNode(grammarAccess.getFunctionDeclAccess().getReturnTypeTypeConstructorParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_2);
            lv_returnType_7_0=ruleTypeConstructor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFunctionDeclRule());
            					}
            					set(
            						current,
            						"returnType",
            						lv_returnType_7_0,
            						"org.xtext.sampleProj.mydsl.MyDsl.TypeConstructor");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunctionDecl"


    // $ANTLR start "entryRuleFunctionBody"
    // InternalMyDsl.g:1670:1: entryRuleFunctionBody returns [EObject current=null] : iv_ruleFunctionBody= ruleFunctionBody EOF ;
    public final EObject entryRuleFunctionBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionBody = null;


        try {
            // InternalMyDsl.g:1670:53: (iv_ruleFunctionBody= ruleFunctionBody EOF )
            // InternalMyDsl.g:1671:2: iv_ruleFunctionBody= ruleFunctionBody EOF
            {
             newCompositeNode(grammarAccess.getFunctionBodyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunctionBody=ruleFunctionBody();

            state._fsp--;

             current =iv_ruleFunctionBody; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionBody"


    // $ANTLR start "ruleFunctionBody"
    // InternalMyDsl.g:1677:1: ruleFunctionBody returns [EObject current=null] : (this_FuncInductive_0= ruleFuncInductive | this_FuncDirectDef_1= ruleFuncDirectDef ) ;
    public final EObject ruleFunctionBody() throws RecognitionException {
        EObject current = null;

        EObject this_FuncInductive_0 = null;

        EObject this_FuncDirectDef_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1683:2: ( (this_FuncInductive_0= ruleFuncInductive | this_FuncDirectDef_1= ruleFuncDirectDef ) )
            // InternalMyDsl.g:1684:2: (this_FuncInductive_0= ruleFuncInductive | this_FuncDirectDef_1= ruleFuncDirectDef )
            {
            // InternalMyDsl.g:1684:2: (this_FuncInductive_0= ruleFuncInductive | this_FuncDirectDef_1= ruleFuncDirectDef )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==36) ) {
                alt28=1;
            }
            else if ( (LA28_0==RULE_ID) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalMyDsl.g:1685:3: this_FuncInductive_0= ruleFuncInductive
                    {

                    			newCompositeNode(grammarAccess.getFunctionBodyAccess().getFuncInductiveParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_FuncInductive_0=ruleFuncInductive();

                    state._fsp--;


                    			current = this_FuncInductive_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1694:3: this_FuncDirectDef_1= ruleFuncDirectDef
                    {

                    			newCompositeNode(grammarAccess.getFunctionBodyAccess().getFuncDirectDefParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_FuncDirectDef_1=ruleFuncDirectDef();

                    state._fsp--;


                    			current = this_FuncDirectDef_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunctionBody"


    // $ANTLR start "entryRuleFuncDirectDef"
    // InternalMyDsl.g:1706:1: entryRuleFuncDirectDef returns [EObject current=null] : iv_ruleFuncDirectDef= ruleFuncDirectDef EOF ;
    public final EObject entryRuleFuncDirectDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuncDirectDef = null;


        try {
            // InternalMyDsl.g:1706:54: (iv_ruleFuncDirectDef= ruleFuncDirectDef EOF )
            // InternalMyDsl.g:1707:2: iv_ruleFuncDirectDef= ruleFuncDirectDef EOF
            {
             newCompositeNode(grammarAccess.getFuncDirectDefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFuncDirectDef=ruleFuncDirectDef();

            state._fsp--;

             current =iv_ruleFuncDirectDef; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFuncDirectDef"


    // $ANTLR start "ruleFuncDirectDef"
    // InternalMyDsl.g:1713:1: ruleFuncDirectDef returns [EObject current=null] : ( (lv_expression_0_0= ruleExpression ) ) ;
    public final EObject ruleFuncDirectDef() throws RecognitionException {
        EObject current = null;

        EObject lv_expression_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1719:2: ( ( (lv_expression_0_0= ruleExpression ) ) )
            // InternalMyDsl.g:1720:2: ( (lv_expression_0_0= ruleExpression ) )
            {
            // InternalMyDsl.g:1720:2: ( (lv_expression_0_0= ruleExpression ) )
            // InternalMyDsl.g:1721:3: (lv_expression_0_0= ruleExpression )
            {
            // InternalMyDsl.g:1721:3: (lv_expression_0_0= ruleExpression )
            // InternalMyDsl.g:1722:4: lv_expression_0_0= ruleExpression
            {

            				newCompositeNode(grammarAccess.getFuncDirectDefAccess().getExpressionExpressionParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_expression_0_0=ruleExpression();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getFuncDirectDefRule());
            				}
            				set(
            					current,
            					"expression",
            					lv_expression_0_0,
            					"org.xtext.sampleProj.mydsl.MyDsl.Expression");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFuncDirectDef"


    // $ANTLR start "entryRuleFuncInductive"
    // InternalMyDsl.g:1742:1: entryRuleFuncInductive returns [EObject current=null] : iv_ruleFuncInductive= ruleFuncInductive EOF ;
    public final EObject entryRuleFuncInductive() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuncInductive = null;


        try {
            // InternalMyDsl.g:1742:54: (iv_ruleFuncInductive= ruleFuncInductive EOF )
            // InternalMyDsl.g:1743:2: iv_ruleFuncInductive= ruleFuncInductive EOF
            {
             newCompositeNode(grammarAccess.getFuncInductiveRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFuncInductive=ruleFuncInductive();

            state._fsp--;

             current =iv_ruleFuncInductive; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFuncInductive"


    // $ANTLR start "ruleFuncInductive"
    // InternalMyDsl.g:1749:1: ruleFuncInductive returns [EObject current=null] : (otherlv_0= 'match' ( (otherlv_1= RULE_ID ) ) ( (lv_inductCase_2_0= ruleFuncInductiveCase ) ) ( (lv_inductCase_3_0= ruleFuncInductiveCase ) )* ) ;
    public final EObject ruleFuncInductive() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_inductCase_2_0 = null;

        EObject lv_inductCase_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1755:2: ( (otherlv_0= 'match' ( (otherlv_1= RULE_ID ) ) ( (lv_inductCase_2_0= ruleFuncInductiveCase ) ) ( (lv_inductCase_3_0= ruleFuncInductiveCase ) )* ) )
            // InternalMyDsl.g:1756:2: (otherlv_0= 'match' ( (otherlv_1= RULE_ID ) ) ( (lv_inductCase_2_0= ruleFuncInductiveCase ) ) ( (lv_inductCase_3_0= ruleFuncInductiveCase ) )* )
            {
            // InternalMyDsl.g:1756:2: (otherlv_0= 'match' ( (otherlv_1= RULE_ID ) ) ( (lv_inductCase_2_0= ruleFuncInductiveCase ) ) ( (lv_inductCase_3_0= ruleFuncInductiveCase ) )* )
            // InternalMyDsl.g:1757:3: otherlv_0= 'match' ( (otherlv_1= RULE_ID ) ) ( (lv_inductCase_2_0= ruleFuncInductiveCase ) ) ( (lv_inductCase_3_0= ruleFuncInductiveCase ) )*
            {
            otherlv_0=(Token)match(input,36,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getFuncInductiveAccess().getMatchKeyword_0());
            		
            // InternalMyDsl.g:1761:3: ( (otherlv_1= RULE_ID ) )
            // InternalMyDsl.g:1762:4: (otherlv_1= RULE_ID )
            {
            // InternalMyDsl.g:1762:4: (otherlv_1= RULE_ID )
            // InternalMyDsl.g:1763:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFuncInductiveRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_29); 

            					newLeafNode(otherlv_1, grammarAccess.getFuncInductiveAccess().getVariableNameTypedVariableCrossReference_1_0());
            				

            }


            }

            // InternalMyDsl.g:1774:3: ( (lv_inductCase_2_0= ruleFuncInductiveCase ) )
            // InternalMyDsl.g:1775:4: (lv_inductCase_2_0= ruleFuncInductiveCase )
            {
            // InternalMyDsl.g:1775:4: (lv_inductCase_2_0= ruleFuncInductiveCase )
            // InternalMyDsl.g:1776:5: lv_inductCase_2_0= ruleFuncInductiveCase
            {

            					newCompositeNode(grammarAccess.getFuncInductiveAccess().getInductCaseFuncInductiveCaseParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_30);
            lv_inductCase_2_0=ruleFuncInductiveCase();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFuncInductiveRule());
            					}
            					add(
            						current,
            						"inductCase",
            						lv_inductCase_2_0,
            						"org.xtext.sampleProj.mydsl.MyDsl.FuncInductiveCase");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:1793:3: ( (lv_inductCase_3_0= ruleFuncInductiveCase ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==35) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalMyDsl.g:1794:4: (lv_inductCase_3_0= ruleFuncInductiveCase )
            	    {
            	    // InternalMyDsl.g:1794:4: (lv_inductCase_3_0= ruleFuncInductiveCase )
            	    // InternalMyDsl.g:1795:5: lv_inductCase_3_0= ruleFuncInductiveCase
            	    {

            	    					newCompositeNode(grammarAccess.getFuncInductiveAccess().getInductCaseFuncInductiveCaseParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_30);
            	    lv_inductCase_3_0=ruleFuncInductiveCase();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFuncInductiveRule());
            	    					}
            	    					add(
            	    						current,
            	    						"inductCase",
            	    						lv_inductCase_3_0,
            	    						"org.xtext.sampleProj.mydsl.MyDsl.FuncInductiveCase");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFuncInductive"


    // $ANTLR start "entryRuleFuncInductiveCase"
    // InternalMyDsl.g:1816:1: entryRuleFuncInductiveCase returns [EObject current=null] : iv_ruleFuncInductiveCase= ruleFuncInductiveCase EOF ;
    public final EObject entryRuleFuncInductiveCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuncInductiveCase = null;


        try {
            // InternalMyDsl.g:1816:58: (iv_ruleFuncInductiveCase= ruleFuncInductiveCase EOF )
            // InternalMyDsl.g:1817:2: iv_ruleFuncInductiveCase= ruleFuncInductiveCase EOF
            {
             newCompositeNode(grammarAccess.getFuncInductiveCaseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFuncInductiveCase=ruleFuncInductiveCase();

            state._fsp--;

             current =iv_ruleFuncInductiveCase; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFuncInductiveCase"


    // $ANTLR start "ruleFuncInductiveCase"
    // InternalMyDsl.g:1823:1: ruleFuncInductiveCase returns [EObject current=null] : (otherlv_0= '|' ( (otherlv_1= RULE_ID ) ) otherlv_2= ':' ( (lv_expre_3_0= ruleExpression ) ) ) ;
    public final EObject ruleFuncInductiveCase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_expre_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1829:2: ( (otherlv_0= '|' ( (otherlv_1= RULE_ID ) ) otherlv_2= ':' ( (lv_expre_3_0= ruleExpression ) ) ) )
            // InternalMyDsl.g:1830:2: (otherlv_0= '|' ( (otherlv_1= RULE_ID ) ) otherlv_2= ':' ( (lv_expre_3_0= ruleExpression ) ) )
            {
            // InternalMyDsl.g:1830:2: (otherlv_0= '|' ( (otherlv_1= RULE_ID ) ) otherlv_2= ':' ( (lv_expre_3_0= ruleExpression ) ) )
            // InternalMyDsl.g:1831:3: otherlv_0= '|' ( (otherlv_1= RULE_ID ) ) otherlv_2= ':' ( (lv_expre_3_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,35,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getFuncInductiveCaseAccess().getVerticalLineKeyword_0());
            		
            // InternalMyDsl.g:1835:3: ( (otherlv_1= RULE_ID ) )
            // InternalMyDsl.g:1836:4: (otherlv_1= RULE_ID )
            {
            // InternalMyDsl.g:1836:4: (otherlv_1= RULE_ID )
            // InternalMyDsl.g:1837:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFuncInductiveCaseRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_28); 

            					newLeafNode(otherlv_1, grammarAccess.getFuncInductiveCaseAccess().getDeconNameDTypeConstructorCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getFuncInductiveCaseAccess().getColonKeyword_2());
            		
            // InternalMyDsl.g:1852:3: ( (lv_expre_3_0= ruleExpression ) )
            // InternalMyDsl.g:1853:4: (lv_expre_3_0= ruleExpression )
            {
            // InternalMyDsl.g:1853:4: (lv_expre_3_0= ruleExpression )
            // InternalMyDsl.g:1854:5: lv_expre_3_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getFuncInductiveCaseAccess().getExpreExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_expre_3_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFuncInductiveCaseRule());
            					}
            					set(
            						current,
            						"expre",
            						lv_expre_3_0,
            						"org.xtext.sampleProj.mydsl.MyDsl.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFuncInductiveCase"


    // $ANTLR start "entryRuleTheoremBody"
    // InternalMyDsl.g:1875:1: entryRuleTheoremBody returns [EObject current=null] : iv_ruleTheoremBody= ruleTheoremBody EOF ;
    public final EObject entryRuleTheoremBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTheoremBody = null;


        try {
            // InternalMyDsl.g:1875:52: (iv_ruleTheoremBody= ruleTheoremBody EOF )
            // InternalMyDsl.g:1876:2: iv_ruleTheoremBody= ruleTheoremBody EOF
            {
             newCompositeNode(grammarAccess.getTheoremBodyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTheoremBody=ruleTheoremBody();

            state._fsp--;

             current =iv_ruleTheoremBody; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTheoremBody"


    // $ANTLR start "ruleTheoremBody"
    // InternalMyDsl.g:1882:1: ruleTheoremBody returns [EObject current=null] : (otherlv_0= 'Theorems' otherlv_1= '{' ( (lv_theoremDecl_2_0= ruleTheoremDecl ) )+ otherlv_3= '}' ) ;
    public final EObject ruleTheoremBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_theoremDecl_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1888:2: ( (otherlv_0= 'Theorems' otherlv_1= '{' ( (lv_theoremDecl_2_0= ruleTheoremDecl ) )+ otherlv_3= '}' ) )
            // InternalMyDsl.g:1889:2: (otherlv_0= 'Theorems' otherlv_1= '{' ( (lv_theoremDecl_2_0= ruleTheoremDecl ) )+ otherlv_3= '}' )
            {
            // InternalMyDsl.g:1889:2: (otherlv_0= 'Theorems' otherlv_1= '{' ( (lv_theoremDecl_2_0= ruleTheoremDecl ) )+ otherlv_3= '}' )
            // InternalMyDsl.g:1890:3: otherlv_0= 'Theorems' otherlv_1= '{' ( (lv_theoremDecl_2_0= ruleTheoremDecl ) )+ otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getTheoremBodyAccess().getTheoremsKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getTheoremBodyAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalMyDsl.g:1898:3: ( (lv_theoremDecl_2_0= ruleTheoremDecl ) )+
            int cnt30=0;
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>=RULE_ID && LA30_0<=RULE_WS)||LA30_0==11) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalMyDsl.g:1899:4: (lv_theoremDecl_2_0= ruleTheoremDecl )
            	    {
            	    // InternalMyDsl.g:1899:4: (lv_theoremDecl_2_0= ruleTheoremDecl )
            	    // InternalMyDsl.g:1900:5: lv_theoremDecl_2_0= ruleTheoremDecl
            	    {

            	    					newCompositeNode(grammarAccess.getTheoremBodyAccess().getTheoremDeclTheoremDeclParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_31);
            	    lv_theoremDecl_2_0=ruleTheoremDecl();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTheoremBodyRule());
            	    					}
            	    					add(
            	    						current,
            	    						"theoremDecl",
            	    						lv_theoremDecl_2_0,
            	    						"org.xtext.sampleProj.mydsl.MyDsl.TheoremDecl");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt30 >= 1 ) break loop30;
                        EarlyExitException eee =
                            new EarlyExitException(30, input);
                        throw eee;
                }
                cnt30++;
            } while (true);

            otherlv_3=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getTheoremBodyAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTheoremBody"


    // $ANTLR start "entryRuleTheoremDecl"
    // InternalMyDsl.g:1925:1: entryRuleTheoremDecl returns [EObject current=null] : iv_ruleTheoremDecl= ruleTheoremDecl EOF ;
    public final EObject entryRuleTheoremDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTheoremDecl = null;


        try {
            // InternalMyDsl.g:1925:52: (iv_ruleTheoremDecl= ruleTheoremDecl EOF )
            // InternalMyDsl.g:1926:2: iv_ruleTheoremDecl= ruleTheoremDecl EOF
            {
             newCompositeNode(grammarAccess.getTheoremDeclRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTheoremDecl=ruleTheoremDecl();

            state._fsp--;

             current =iv_ruleTheoremDecl; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTheoremDecl"


    // $ANTLR start "ruleTheoremDecl"
    // InternalMyDsl.g:1932:1: ruleTheoremDecl returns [EObject current=null] : ( (lv_thmName_0_0= ruleTHM_NAME ) ) ;
    public final EObject ruleTheoremDecl() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_thmName_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1938:2: ( ( (lv_thmName_0_0= ruleTHM_NAME ) ) )
            // InternalMyDsl.g:1939:2: ( (lv_thmName_0_0= ruleTHM_NAME ) )
            {
            // InternalMyDsl.g:1939:2: ( (lv_thmName_0_0= ruleTHM_NAME ) )
            // InternalMyDsl.g:1940:3: (lv_thmName_0_0= ruleTHM_NAME )
            {
            // InternalMyDsl.g:1940:3: (lv_thmName_0_0= ruleTHM_NAME )
            // InternalMyDsl.g:1941:4: lv_thmName_0_0= ruleTHM_NAME
            {

            				newCompositeNode(grammarAccess.getTheoremDeclAccess().getThmNameTHM_NAMEParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_thmName_0_0=ruleTHM_NAME();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getTheoremDeclRule());
            				}
            				set(
            					current,
            					"thmName",
            					lv_thmName_0_0,
            					"org.xtext.sampleProj.mydsl.MyDsl.THM_NAME");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTheoremDecl"


    // $ANTLR start "entryRuleTypedVariableList"
    // InternalMyDsl.g:1961:1: entryRuleTypedVariableList returns [EObject current=null] : iv_ruleTypedVariableList= ruleTypedVariableList EOF ;
    public final EObject entryRuleTypedVariableList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypedVariableList = null;


        try {
            // InternalMyDsl.g:1961:58: (iv_ruleTypedVariableList= ruleTypedVariableList EOF )
            // InternalMyDsl.g:1962:2: iv_ruleTypedVariableList= ruleTypedVariableList EOF
            {
             newCompositeNode(grammarAccess.getTypedVariableListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTypedVariableList=ruleTypedVariableList();

            state._fsp--;

             current =iv_ruleTypedVariableList; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypedVariableList"


    // $ANTLR start "ruleTypedVariableList"
    // InternalMyDsl.g:1968:1: ruleTypedVariableList returns [EObject current=null] : ( ( (lv_typeVar_0_0= ruleTypedVariable ) ) (otherlv_1= ',' ( (lv_typeVar_2_0= ruleTypedVariable ) ) )* ) ;
    public final EObject ruleTypedVariableList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_typeVar_0_0 = null;

        EObject lv_typeVar_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1974:2: ( ( ( (lv_typeVar_0_0= ruleTypedVariable ) ) (otherlv_1= ',' ( (lv_typeVar_2_0= ruleTypedVariable ) ) )* ) )
            // InternalMyDsl.g:1975:2: ( ( (lv_typeVar_0_0= ruleTypedVariable ) ) (otherlv_1= ',' ( (lv_typeVar_2_0= ruleTypedVariable ) ) )* )
            {
            // InternalMyDsl.g:1975:2: ( ( (lv_typeVar_0_0= ruleTypedVariable ) ) (otherlv_1= ',' ( (lv_typeVar_2_0= ruleTypedVariable ) ) )* )
            // InternalMyDsl.g:1976:3: ( (lv_typeVar_0_0= ruleTypedVariable ) ) (otherlv_1= ',' ( (lv_typeVar_2_0= ruleTypedVariable ) ) )*
            {
            // InternalMyDsl.g:1976:3: ( (lv_typeVar_0_0= ruleTypedVariable ) )
            // InternalMyDsl.g:1977:4: (lv_typeVar_0_0= ruleTypedVariable )
            {
            // InternalMyDsl.g:1977:4: (lv_typeVar_0_0= ruleTypedVariable )
            // InternalMyDsl.g:1978:5: lv_typeVar_0_0= ruleTypedVariable
            {

            					newCompositeNode(grammarAccess.getTypedVariableListAccess().getTypeVarTypedVariableParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_16);
            lv_typeVar_0_0=ruleTypedVariable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTypedVariableListRule());
            					}
            					add(
            						current,
            						"typeVar",
            						lv_typeVar_0_0,
            						"org.xtext.sampleProj.mydsl.MyDsl.TypedVariable");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:1995:3: (otherlv_1= ',' ( (lv_typeVar_2_0= ruleTypedVariable ) ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==20) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalMyDsl.g:1996:4: otherlv_1= ',' ( (lv_typeVar_2_0= ruleTypedVariable ) )
            	    {
            	    otherlv_1=(Token)match(input,20,FOLLOW_5); 

            	    				newLeafNode(otherlv_1, grammarAccess.getTypedVariableListAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalMyDsl.g:2000:4: ( (lv_typeVar_2_0= ruleTypedVariable ) )
            	    // InternalMyDsl.g:2001:5: (lv_typeVar_2_0= ruleTypedVariable )
            	    {
            	    // InternalMyDsl.g:2001:5: (lv_typeVar_2_0= ruleTypedVariable )
            	    // InternalMyDsl.g:2002:6: lv_typeVar_2_0= ruleTypedVariable
            	    {

            	    						newCompositeNode(grammarAccess.getTypedVariableListAccess().getTypeVarTypedVariableParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_16);
            	    lv_typeVar_2_0=ruleTypedVariable();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTypedVariableListRule());
            	    						}
            	    						add(
            	    							current,
            	    							"typeVar",
            	    							lv_typeVar_2_0,
            	    							"org.xtext.sampleProj.mydsl.MyDsl.TypedVariable");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypedVariableList"


    // $ANTLR start "entryRuleTypedVariable"
    // InternalMyDsl.g:2024:1: entryRuleTypedVariable returns [EObject current=null] : iv_ruleTypedVariable= ruleTypedVariable EOF ;
    public final EObject entryRuleTypedVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypedVariable = null;


        try {
            // InternalMyDsl.g:2024:54: (iv_ruleTypedVariable= ruleTypedVariable EOF )
            // InternalMyDsl.g:2025:2: iv_ruleTypedVariable= ruleTypedVariable EOF
            {
             newCompositeNode(grammarAccess.getTypedVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTypedVariable=ruleTypedVariable();

            state._fsp--;

             current =iv_ruleTypedVariable; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypedVariable"


    // $ANTLR start "ruleTypedVariable"
    // InternalMyDsl.g:2031:1: ruleTypedVariable returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleConstructedType ) ) ) ;
    public final EObject ruleTypedVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2037:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleConstructedType ) ) ) )
            // InternalMyDsl.g:2038:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleConstructedType ) ) )
            {
            // InternalMyDsl.g:2038:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleConstructedType ) ) )
            // InternalMyDsl.g:2039:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleConstructedType ) )
            {
            // InternalMyDsl.g:2039:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalMyDsl.g:2040:4: (lv_name_0_0= RULE_ID )
            {
            // InternalMyDsl.g:2040:4: (lv_name_0_0= RULE_ID )
            // InternalMyDsl.g:2041:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_28); 

            					newLeafNode(lv_name_0_0, grammarAccess.getTypedVariableAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTypedVariableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getTypedVariableAccess().getColonKeyword_1());
            		
            // InternalMyDsl.g:2061:3: ( (lv_type_2_0= ruleConstructedType ) )
            // InternalMyDsl.g:2062:4: (lv_type_2_0= ruleConstructedType )
            {
            // InternalMyDsl.g:2062:4: (lv_type_2_0= ruleConstructedType )
            // InternalMyDsl.g:2063:5: lv_type_2_0= ruleConstructedType
            {

            					newCompositeNode(grammarAccess.getTypedVariableAccess().getTypeConstructedTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_2_0=ruleConstructedType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTypedVariableRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"org.xtext.sampleProj.mydsl.MyDsl.ConstructedType");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypedVariable"


    // $ANTLR start "entryRuleFunctionName"
    // InternalMyDsl.g:2084:1: entryRuleFunctionName returns [EObject current=null] : iv_ruleFunctionName= ruleFunctionName EOF ;
    public final EObject entryRuleFunctionName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionName = null;


        try {
            // InternalMyDsl.g:2084:53: (iv_ruleFunctionName= ruleFunctionName EOF )
            // InternalMyDsl.g:2085:2: iv_ruleFunctionName= ruleFunctionName EOF
            {
             newCompositeNode(grammarAccess.getFunctionNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunctionName=ruleFunctionName();

            state._fsp--;

             current =iv_ruleFunctionName; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionName"


    // $ANTLR start "ruleFunctionName"
    // InternalMyDsl.g:2091:1: ruleFunctionName returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleFunctionName() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2097:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalMyDsl.g:2098:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalMyDsl.g:2098:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalMyDsl.g:2099:3: (lv_name_0_0= RULE_ID )
            {
            // InternalMyDsl.g:2099:3: (lv_name_0_0= RULE_ID )
            // InternalMyDsl.g:2100:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getFunctionNameAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getFunctionNameRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunctionName"


    // $ANTLR start "entryRuleExpression"
    // InternalMyDsl.g:2119:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalMyDsl.g:2119:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalMyDsl.g:2120:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalMyDsl.g:2126:1: ruleExpression returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2132:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalMyDsl.g:2133:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalMyDsl.g:2133:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalMyDsl.g:2134:3: (lv_name_0_0= RULE_ID )
            {
            // InternalMyDsl.g:2134:3: (lv_name_0_0= RULE_ID )
            // InternalMyDsl.g:2135:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getExpressionAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getExpressionRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000400005012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000830L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000280058800L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000280018800L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000280018000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000200018000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000002000020010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000000007FE00002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000800050000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000800010000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000080040000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000100000010L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000001000000010L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000020830L});

}