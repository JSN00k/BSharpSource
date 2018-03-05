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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Import'", "'.'", "'Class'", "'{'", "'}'", "'<'", "'>'", "':'", "','", "'\\u00D7'", "'\\u2192'", "'\\uE102'", "'\\uE100'", "'\\u2194'", "'\\u2916'", "'\\u21F8'", "'\\u21A3'", "'\\u2900'", "'\\u21A0'", "'Datatype'", "'('", "')'", "'Theorems'"
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

                if ( (LA1_0==RULE_ID||LA1_0==11||LA1_0==13||LA1_0==30) ) {
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


    // $ANTLR start "entryRuleTopLevel"
    // InternalMyDsl.g:100:1: entryRuleTopLevel returns [EObject current=null] : iv_ruleTopLevel= ruleTopLevel EOF ;
    public final EObject entryRuleTopLevel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTopLevel = null;


        try {
            // InternalMyDsl.g:100:49: (iv_ruleTopLevel= ruleTopLevel EOF )
            // InternalMyDsl.g:101:2: iv_ruleTopLevel= ruleTopLevel EOF
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
    // InternalMyDsl.g:107:1: ruleTopLevel returns [EObject current=null] : (this_ImportSatement_0= ruleImportSatement | this_ClassDecl_1= ruleClassDecl ) ;
    public final EObject ruleTopLevel() throws RecognitionException {
        EObject current = null;

        EObject this_ImportSatement_0 = null;

        EObject this_ClassDecl_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:113:2: ( (this_ImportSatement_0= ruleImportSatement | this_ClassDecl_1= ruleClassDecl ) )
            // InternalMyDsl.g:114:2: (this_ImportSatement_0= ruleImportSatement | this_ClassDecl_1= ruleClassDecl )
            {
            // InternalMyDsl.g:114:2: (this_ImportSatement_0= ruleImportSatement | this_ClassDecl_1= ruleClassDecl )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID||LA2_0==13||LA2_0==30) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:115:3: this_ImportSatement_0= ruleImportSatement
                    {

                    			newCompositeNode(grammarAccess.getTopLevelAccess().getImportSatementParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ImportSatement_0=ruleImportSatement();

                    state._fsp--;


                    			current = this_ImportSatement_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:124:3: this_ClassDecl_1= ruleClassDecl
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


    // $ANTLR start "entryRuleImportSatement"
    // InternalMyDsl.g:136:1: entryRuleImportSatement returns [EObject current=null] : iv_ruleImportSatement= ruleImportSatement EOF ;
    public final EObject entryRuleImportSatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportSatement = null;


        try {
            // InternalMyDsl.g:136:55: (iv_ruleImportSatement= ruleImportSatement EOF )
            // InternalMyDsl.g:137:2: iv_ruleImportSatement= ruleImportSatement EOF
            {
             newCompositeNode(grammarAccess.getImportSatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImportSatement=ruleImportSatement();

            state._fsp--;

             current =iv_ruleImportSatement; 
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
    // $ANTLR end "entryRuleImportSatement"


    // $ANTLR start "ruleImportSatement"
    // InternalMyDsl.g:143:1: ruleImportSatement returns [EObject current=null] : (otherlv_0= 'Import' ( (lv_imports_1_0= ruleImport ) ) ) ;
    public final EObject ruleImportSatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_imports_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:149:2: ( (otherlv_0= 'Import' ( (lv_imports_1_0= ruleImport ) ) ) )
            // InternalMyDsl.g:150:2: (otherlv_0= 'Import' ( (lv_imports_1_0= ruleImport ) ) )
            {
            // InternalMyDsl.g:150:2: (otherlv_0= 'Import' ( (lv_imports_1_0= ruleImport ) ) )
            // InternalMyDsl.g:151:3: otherlv_0= 'Import' ( (lv_imports_1_0= ruleImport ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getImportSatementAccess().getImportKeyword_0());
            		
            // InternalMyDsl.g:155:3: ( (lv_imports_1_0= ruleImport ) )
            // InternalMyDsl.g:156:4: (lv_imports_1_0= ruleImport )
            {
            // InternalMyDsl.g:156:4: (lv_imports_1_0= ruleImport )
            // InternalMyDsl.g:157:5: lv_imports_1_0= ruleImport
            {

            					newCompositeNode(grammarAccess.getImportSatementAccess().getImportsImportParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_imports_1_0=ruleImport();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImportSatementRule());
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
    // $ANTLR end "ruleImportSatement"


    // $ANTLR start "entryRuleImport"
    // InternalMyDsl.g:178:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalMyDsl.g:178:47: (iv_ruleImport= ruleImport EOF )
            // InternalMyDsl.g:179:2: iv_ruleImport= ruleImport EOF
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
    // InternalMyDsl.g:185:1: ruleImport returns [EObject current=null] : ( ( (lv_importName_0_0= ruleImportComponent ) ) (otherlv_1= '.' ( (lv_importName_2_0= ruleImportComponent ) ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_importName_0_0 = null;

        EObject lv_importName_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:191:2: ( ( ( (lv_importName_0_0= ruleImportComponent ) ) (otherlv_1= '.' ( (lv_importName_2_0= ruleImportComponent ) ) ) ) )
            // InternalMyDsl.g:192:2: ( ( (lv_importName_0_0= ruleImportComponent ) ) (otherlv_1= '.' ( (lv_importName_2_0= ruleImportComponent ) ) ) )
            {
            // InternalMyDsl.g:192:2: ( ( (lv_importName_0_0= ruleImportComponent ) ) (otherlv_1= '.' ( (lv_importName_2_0= ruleImportComponent ) ) ) )
            // InternalMyDsl.g:193:3: ( (lv_importName_0_0= ruleImportComponent ) ) (otherlv_1= '.' ( (lv_importName_2_0= ruleImportComponent ) ) )
            {
            // InternalMyDsl.g:193:3: ( (lv_importName_0_0= ruleImportComponent ) )
            // InternalMyDsl.g:194:4: (lv_importName_0_0= ruleImportComponent )
            {
            // InternalMyDsl.g:194:4: (lv_importName_0_0= ruleImportComponent )
            // InternalMyDsl.g:195:5: lv_importName_0_0= ruleImportComponent
            {

            					newCompositeNode(grammarAccess.getImportAccess().getImportNameImportComponentParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_5);
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

            // InternalMyDsl.g:212:3: (otherlv_1= '.' ( (lv_importName_2_0= ruleImportComponent ) ) )
            // InternalMyDsl.g:213:4: otherlv_1= '.' ( (lv_importName_2_0= ruleImportComponent ) )
            {
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            				newLeafNode(otherlv_1, grammarAccess.getImportAccess().getFullStopKeyword_1_0());
            			
            // InternalMyDsl.g:217:4: ( (lv_importName_2_0= ruleImportComponent ) )
            // InternalMyDsl.g:218:5: (lv_importName_2_0= ruleImportComponent )
            {
            // InternalMyDsl.g:218:5: (lv_importName_2_0= ruleImportComponent )
            // InternalMyDsl.g:219:6: lv_importName_2_0= ruleImportComponent
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
    // InternalMyDsl.g:241:1: entryRuleImportComponent returns [EObject current=null] : iv_ruleImportComponent= ruleImportComponent EOF ;
    public final EObject entryRuleImportComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportComponent = null;


        try {
            // InternalMyDsl.g:241:56: (iv_ruleImportComponent= ruleImportComponent EOF )
            // InternalMyDsl.g:242:2: iv_ruleImportComponent= ruleImportComponent EOF
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
    // InternalMyDsl.g:248:1: ruleImportComponent returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleImportComponent() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:254:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalMyDsl.g:255:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalMyDsl.g:255:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalMyDsl.g:256:3: (lv_name_0_0= RULE_ID )
            {
            // InternalMyDsl.g:256:3: (lv_name_0_0= RULE_ID )
            // InternalMyDsl.g:257:4: lv_name_0_0= RULE_ID
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
    // InternalMyDsl.g:276:1: entryRuleClassDecl returns [EObject current=null] : iv_ruleClassDecl= ruleClassDecl EOF ;
    public final EObject entryRuleClassDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassDecl = null;


        try {
            // InternalMyDsl.g:276:50: (iv_ruleClassDecl= ruleClassDecl EOF )
            // InternalMyDsl.g:277:2: iv_ruleClassDecl= ruleClassDecl EOF
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
    // InternalMyDsl.g:283:1: ruleClassDecl returns [EObject current=null] : (this_Class_0= ruleClass | this_Datatype_1= ruleDatatype | this_Extend_2= ruleExtend ) ;
    public final EObject ruleClassDecl() throws RecognitionException {
        EObject current = null;

        EObject this_Class_0 = null;

        EObject this_Datatype_1 = null;

        EObject this_Extend_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:289:2: ( (this_Class_0= ruleClass | this_Datatype_1= ruleDatatype | this_Extend_2= ruleExtend ) )
            // InternalMyDsl.g:290:2: (this_Class_0= ruleClass | this_Datatype_1= ruleDatatype | this_Extend_2= ruleExtend )
            {
            // InternalMyDsl.g:290:2: (this_Class_0= ruleClass | this_Datatype_1= ruleDatatype | this_Extend_2= ruleExtend )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 13:
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
                    // InternalMyDsl.g:291:3: this_Class_0= ruleClass
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
                    // InternalMyDsl.g:300:3: this_Datatype_1= ruleDatatype
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
                    // InternalMyDsl.g:309:3: this_Extend_2= ruleExtend
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
    // InternalMyDsl.g:321:1: entryRuleClass returns [EObject current=null] : iv_ruleClass= ruleClass EOF ;
    public final EObject entryRuleClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClass = null;


        try {
            // InternalMyDsl.g:321:46: (iv_ruleClass= ruleClass EOF )
            // InternalMyDsl.g:322:2: iv_ruleClass= ruleClass EOF
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
    // InternalMyDsl.g:328:1: ruleClass returns [EObject current=null] : (otherlv_0= 'Class' ( (lv_name_1_0= ruleTypeName ) ) ( (lv_context_2_0= rulePolyContext ) )? ( (lv_supertypes_3_0= ruleSupertype ) )? otherlv_4= '{' ( (lv_bodyElements_5_0= ruleTypeBodyElements ) )* otherlv_6= '}' ) ;
    public final EObject ruleClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_name_1_0 = null;

        EObject lv_context_2_0 = null;

        EObject lv_supertypes_3_0 = null;

        EObject lv_bodyElements_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:334:2: ( (otherlv_0= 'Class' ( (lv_name_1_0= ruleTypeName ) ) ( (lv_context_2_0= rulePolyContext ) )? ( (lv_supertypes_3_0= ruleSupertype ) )? otherlv_4= '{' ( (lv_bodyElements_5_0= ruleTypeBodyElements ) )* otherlv_6= '}' ) )
            // InternalMyDsl.g:335:2: (otherlv_0= 'Class' ( (lv_name_1_0= ruleTypeName ) ) ( (lv_context_2_0= rulePolyContext ) )? ( (lv_supertypes_3_0= ruleSupertype ) )? otherlv_4= '{' ( (lv_bodyElements_5_0= ruleTypeBodyElements ) )* otherlv_6= '}' )
            {
            // InternalMyDsl.g:335:2: (otherlv_0= 'Class' ( (lv_name_1_0= ruleTypeName ) ) ( (lv_context_2_0= rulePolyContext ) )? ( (lv_supertypes_3_0= ruleSupertype ) )? otherlv_4= '{' ( (lv_bodyElements_5_0= ruleTypeBodyElements ) )* otherlv_6= '}' )
            // InternalMyDsl.g:336:3: otherlv_0= 'Class' ( (lv_name_1_0= ruleTypeName ) ) ( (lv_context_2_0= rulePolyContext ) )? ( (lv_supertypes_3_0= ruleSupertype ) )? otherlv_4= '{' ( (lv_bodyElements_5_0= ruleTypeBodyElements ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getClassAccess().getClassKeyword_0());
            		
            // InternalMyDsl.g:340:3: ( (lv_name_1_0= ruleTypeName ) )
            // InternalMyDsl.g:341:4: (lv_name_1_0= ruleTypeName )
            {
            // InternalMyDsl.g:341:4: (lv_name_1_0= ruleTypeName )
            // InternalMyDsl.g:342:5: lv_name_1_0= ruleTypeName
            {

            					newCompositeNode(grammarAccess.getClassAccess().getNameTypeNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_1_0=ruleTypeName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getClassRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.sampleProj.mydsl.MyDsl.TypeName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:359:3: ( (lv_context_2_0= rulePolyContext ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:360:4: (lv_context_2_0= rulePolyContext )
                    {
                    // InternalMyDsl.g:360:4: (lv_context_2_0= rulePolyContext )
                    // InternalMyDsl.g:361:5: lv_context_2_0= rulePolyContext
                    {

                    					newCompositeNode(grammarAccess.getClassAccess().getContextPolyContextParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_7);
                    lv_context_2_0=rulePolyContext();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getClassRule());
                    					}
                    					add(
                    						current,
                    						"context",
                    						lv_context_2_0,
                    						"org.xtext.sampleProj.mydsl.MyDsl.PolyContext");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:378:3: ( (lv_supertypes_3_0= ruleSupertype ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:379:4: (lv_supertypes_3_0= ruleSupertype )
                    {
                    // InternalMyDsl.g:379:4: (lv_supertypes_3_0= ruleSupertype )
                    // InternalMyDsl.g:380:5: lv_supertypes_3_0= ruleSupertype
                    {

                    					newCompositeNode(grammarAccess.getClassAccess().getSupertypesSupertypeParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_8);
                    lv_supertypes_3_0=ruleSupertype();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getClassRule());
                    					}
                    					add(
                    						current,
                    						"supertypes",
                    						lv_supertypes_3_0,
                    						"org.xtext.sampleProj.mydsl.MyDsl.Supertype");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,14,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalMyDsl.g:401:3: ( (lv_bodyElements_5_0= ruleTypeBodyElements ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID||LA6_0==33) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyDsl.g:402:4: (lv_bodyElements_5_0= ruleTypeBodyElements )
            	    {
            	    // InternalMyDsl.g:402:4: (lv_bodyElements_5_0= ruleTypeBodyElements )
            	    // InternalMyDsl.g:403:5: lv_bodyElements_5_0= ruleTypeBodyElements
            	    {

            	    					newCompositeNode(grammarAccess.getClassAccess().getBodyElementsTypeBodyElementsParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_bodyElements_5_0=ruleTypeBodyElements();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getClassRule());
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
            	    break loop6;
                }
            } while (true);

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getClassAccess().getRightCurlyBracketKeyword_6());
            		

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
    // InternalMyDsl.g:428:1: entryRuleTypeName returns [EObject current=null] : iv_ruleTypeName= ruleTypeName EOF ;
    public final EObject entryRuleTypeName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeName = null;


        try {
            // InternalMyDsl.g:428:49: (iv_ruleTypeName= ruleTypeName EOF )
            // InternalMyDsl.g:429:2: iv_ruleTypeName= ruleTypeName EOF
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
    // InternalMyDsl.g:435:1: ruleTypeName returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleTypeName() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:441:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalMyDsl.g:442:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalMyDsl.g:442:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalMyDsl.g:443:3: (lv_name_0_0= RULE_ID )
            {
            // InternalMyDsl.g:443:3: (lv_name_0_0= RULE_ID )
            // InternalMyDsl.g:444:4: lv_name_0_0= RULE_ID
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


    // $ANTLR start "entryRulePolyContext"
    // InternalMyDsl.g:463:1: entryRulePolyContext returns [EObject current=null] : iv_rulePolyContext= rulePolyContext EOF ;
    public final EObject entryRulePolyContext() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePolyContext = null;


        try {
            // InternalMyDsl.g:463:52: (iv_rulePolyContext= rulePolyContext EOF )
            // InternalMyDsl.g:464:2: iv_rulePolyContext= rulePolyContext EOF
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
    // InternalMyDsl.g:470:1: rulePolyContext returns [EObject current=null] : (otherlv_0= '<' ( (lv_polyTypes_1_0= rulePolyContextTypes ) )+ otherlv_2= '>' ) ;
    public final EObject rulePolyContext() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_polyTypes_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:476:2: ( (otherlv_0= '<' ( (lv_polyTypes_1_0= rulePolyContextTypes ) )+ otherlv_2= '>' ) )
            // InternalMyDsl.g:477:2: (otherlv_0= '<' ( (lv_polyTypes_1_0= rulePolyContextTypes ) )+ otherlv_2= '>' )
            {
            // InternalMyDsl.g:477:2: (otherlv_0= '<' ( (lv_polyTypes_1_0= rulePolyContextTypes ) )+ otherlv_2= '>' )
            // InternalMyDsl.g:478:3: otherlv_0= '<' ( (lv_polyTypes_1_0= rulePolyContextTypes ) )+ otherlv_2= '>'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPolyContextAccess().getLessThanSignKeyword_0());
            		
            // InternalMyDsl.g:482:3: ( (lv_polyTypes_1_0= rulePolyContextTypes ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyDsl.g:483:4: (lv_polyTypes_1_0= rulePolyContextTypes )
            	    {
            	    // InternalMyDsl.g:483:4: (lv_polyTypes_1_0= rulePolyContextTypes )
            	    // InternalMyDsl.g:484:5: lv_polyTypes_1_0= rulePolyContextTypes
            	    {

            	    					newCompositeNode(grammarAccess.getPolyContextAccess().getPolyTypesPolyContextTypesParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_10);
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
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);

            otherlv_2=(Token)match(input,17,FOLLOW_2); 

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
    // InternalMyDsl.g:509:1: entryRulePolyContextTypes returns [EObject current=null] : iv_rulePolyContextTypes= rulePolyContextTypes EOF ;
    public final EObject entryRulePolyContextTypes() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePolyContextTypes = null;


        try {
            // InternalMyDsl.g:509:57: (iv_rulePolyContextTypes= rulePolyContextTypes EOF )
            // InternalMyDsl.g:510:2: iv_rulePolyContextTypes= rulePolyContextTypes EOF
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
    // InternalMyDsl.g:516:1: rulePolyContextTypes returns [EObject current=null] : ( ( (lv_name_0_0= rulePolymorphicTypeName ) ) ( (lv_constraints_1_0= ruleTypeConstraints ) )* ) ;
    public final EObject rulePolyContextTypes() throws RecognitionException {
        EObject current = null;

        EObject lv_name_0_0 = null;

        EObject lv_constraints_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:522:2: ( ( ( (lv_name_0_0= rulePolymorphicTypeName ) ) ( (lv_constraints_1_0= ruleTypeConstraints ) )* ) )
            // InternalMyDsl.g:523:2: ( ( (lv_name_0_0= rulePolymorphicTypeName ) ) ( (lv_constraints_1_0= ruleTypeConstraints ) )* )
            {
            // InternalMyDsl.g:523:2: ( ( (lv_name_0_0= rulePolymorphicTypeName ) ) ( (lv_constraints_1_0= ruleTypeConstraints ) )* )
            // InternalMyDsl.g:524:3: ( (lv_name_0_0= rulePolymorphicTypeName ) ) ( (lv_constraints_1_0= ruleTypeConstraints ) )*
            {
            // InternalMyDsl.g:524:3: ( (lv_name_0_0= rulePolymorphicTypeName ) )
            // InternalMyDsl.g:525:4: (lv_name_0_0= rulePolymorphicTypeName )
            {
            // InternalMyDsl.g:525:4: (lv_name_0_0= rulePolymorphicTypeName )
            // InternalMyDsl.g:526:5: lv_name_0_0= rulePolymorphicTypeName
            {

            					newCompositeNode(grammarAccess.getPolyContextTypesAccess().getNamePolymorphicTypeNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_11);
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

            // InternalMyDsl.g:543:3: ( (lv_constraints_1_0= ruleTypeConstraints ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==18) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyDsl.g:544:4: (lv_constraints_1_0= ruleTypeConstraints )
            	    {
            	    // InternalMyDsl.g:544:4: (lv_constraints_1_0= ruleTypeConstraints )
            	    // InternalMyDsl.g:545:5: lv_constraints_1_0= ruleTypeConstraints
            	    {

            	    					newCompositeNode(grammarAccess.getPolyContextTypesAccess().getConstraintsTypeConstraintsParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_constraints_1_0=ruleTypeConstraints();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPolyContextTypesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"constraints",
            	    						lv_constraints_1_0,
            	    						"org.xtext.sampleProj.mydsl.MyDsl.TypeConstraints");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
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


    // $ANTLR start "entryRulePolymorphicTypeName"
    // InternalMyDsl.g:566:1: entryRulePolymorphicTypeName returns [EObject current=null] : iv_rulePolymorphicTypeName= rulePolymorphicTypeName EOF ;
    public final EObject entryRulePolymorphicTypeName() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePolymorphicTypeName = null;


        try {
            // InternalMyDsl.g:566:60: (iv_rulePolymorphicTypeName= rulePolymorphicTypeName EOF )
            // InternalMyDsl.g:567:2: iv_rulePolymorphicTypeName= rulePolymorphicTypeName EOF
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
    // InternalMyDsl.g:573:1: rulePolymorphicTypeName returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject rulePolymorphicTypeName() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:579:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalMyDsl.g:580:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalMyDsl.g:580:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalMyDsl.g:581:3: (lv_name_0_0= RULE_ID )
            {
            // InternalMyDsl.g:581:3: (lv_name_0_0= RULE_ID )
            // InternalMyDsl.g:582:4: lv_name_0_0= RULE_ID
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


    // $ANTLR start "entryRuleTypeConstraints"
    // InternalMyDsl.g:601:1: entryRuleTypeConstraints returns [EObject current=null] : iv_ruleTypeConstraints= ruleTypeConstraints EOF ;
    public final EObject entryRuleTypeConstraints() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeConstraints = null;


        try {
            // InternalMyDsl.g:601:56: (iv_ruleTypeConstraints= ruleTypeConstraints EOF )
            // InternalMyDsl.g:602:2: iv_ruleTypeConstraints= ruleTypeConstraints EOF
            {
             newCompositeNode(grammarAccess.getTypeConstraintsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTypeConstraints=ruleTypeConstraints();

            state._fsp--;

             current =iv_ruleTypeConstraints; 
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
    // $ANTLR end "entryRuleTypeConstraints"


    // $ANTLR start "ruleTypeConstraints"
    // InternalMyDsl.g:608:1: ruleTypeConstraints returns [EObject current=null] : (otherlv_0= ':' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* ) ;
    public final EObject ruleTypeConstraints() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMyDsl.g:614:2: ( (otherlv_0= ':' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* ) )
            // InternalMyDsl.g:615:2: (otherlv_0= ':' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* )
            {
            // InternalMyDsl.g:615:2: (otherlv_0= ':' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* )
            // InternalMyDsl.g:616:3: otherlv_0= ':' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )*
            {
            otherlv_0=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getTypeConstraintsAccess().getColonKeyword_0());
            		
            // InternalMyDsl.g:620:3: ( (otherlv_1= RULE_ID ) )
            // InternalMyDsl.g:621:4: (otherlv_1= RULE_ID )
            {
            // InternalMyDsl.g:621:4: (otherlv_1= RULE_ID )
            // InternalMyDsl.g:622:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTypeConstraintsRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(otherlv_1, grammarAccess.getTypeConstraintsAccess().getTypeNameTypeNameCrossReference_1_0());
            				

            }


            }

            // InternalMyDsl.g:633:3: (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==19) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMyDsl.g:634:4: otherlv_2= ',' ( (otherlv_3= RULE_ID ) )
            	    {
            	    otherlv_2=(Token)match(input,19,FOLLOW_4); 

            	    				newLeafNode(otherlv_2, grammarAccess.getTypeConstraintsAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalMyDsl.g:638:4: ( (otherlv_3= RULE_ID ) )
            	    // InternalMyDsl.g:639:5: (otherlv_3= RULE_ID )
            	    {
            	    // InternalMyDsl.g:639:5: (otherlv_3= RULE_ID )
            	    // InternalMyDsl.g:640:6: otherlv_3= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getTypeConstraintsRule());
            	    						}
            	    					
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_12); 

            	    						newLeafNode(otherlv_3, grammarAccess.getTypeConstraintsAccess().getTypeNameTypeNameCrossReference_2_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // $ANTLR end "ruleTypeConstraints"


    // $ANTLR start "entryRuleTypedVariable"
    // InternalMyDsl.g:656:1: entryRuleTypedVariable returns [EObject current=null] : iv_ruleTypedVariable= ruleTypedVariable EOF ;
    public final EObject entryRuleTypedVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypedVariable = null;


        try {
            // InternalMyDsl.g:656:54: (iv_ruleTypedVariable= ruleTypedVariable EOF )
            // InternalMyDsl.g:657:2: iv_ruleTypedVariable= ruleTypedVariable EOF
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
    // InternalMyDsl.g:663:1: ruleTypedVariable returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_constraints_1_0= ruleTypeConstraints ) ) ) ;
    public final EObject ruleTypedVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_constraints_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:669:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_constraints_1_0= ruleTypeConstraints ) ) ) )
            // InternalMyDsl.g:670:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_constraints_1_0= ruleTypeConstraints ) ) )
            {
            // InternalMyDsl.g:670:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_constraints_1_0= ruleTypeConstraints ) ) )
            // InternalMyDsl.g:671:3: ( (lv_name_0_0= RULE_ID ) ) ( (lv_constraints_1_0= ruleTypeConstraints ) )
            {
            // InternalMyDsl.g:671:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalMyDsl.g:672:4: (lv_name_0_0= RULE_ID )
            {
            // InternalMyDsl.g:672:4: (lv_name_0_0= RULE_ID )
            // InternalMyDsl.g:673:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_13); 

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

            // InternalMyDsl.g:689:3: ( (lv_constraints_1_0= ruleTypeConstraints ) )
            // InternalMyDsl.g:690:4: (lv_constraints_1_0= ruleTypeConstraints )
            {
            // InternalMyDsl.g:690:4: (lv_constraints_1_0= ruleTypeConstraints )
            // InternalMyDsl.g:691:5: lv_constraints_1_0= ruleTypeConstraints
            {

            					newCompositeNode(grammarAccess.getTypedVariableAccess().getConstraintsTypeConstraintsParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_constraints_1_0=ruleTypeConstraints();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTypedVariableRule());
            					}
            					add(
            						current,
            						"constraints",
            						lv_constraints_1_0,
            						"org.xtext.sampleProj.mydsl.MyDsl.TypeConstraints");
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


    // $ANTLR start "entryRuleSupertype"
    // InternalMyDsl.g:712:1: entryRuleSupertype returns [EObject current=null] : iv_ruleSupertype= ruleSupertype EOF ;
    public final EObject entryRuleSupertype() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSupertype = null;


        try {
            // InternalMyDsl.g:712:50: (iv_ruleSupertype= ruleSupertype EOF )
            // InternalMyDsl.g:713:2: iv_ruleSupertype= ruleSupertype EOF
            {
             newCompositeNode(grammarAccess.getSupertypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSupertype=ruleSupertype();

            state._fsp--;

             current =iv_ruleSupertype; 
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
    // $ANTLR end "entryRuleSupertype"


    // $ANTLR start "ruleSupertype"
    // InternalMyDsl.g:719:1: ruleSupertype returns [EObject current=null] : (otherlv_0= ':' ( (lv_superType_1_0= ruleConstructedType ) ) (otherlv_2= ',' ( (lv_superType_3_0= ruleTypeDeclaration ) ) )* ) ;
    public final EObject ruleSupertype() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_superType_1_0 = null;

        EObject lv_superType_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:725:2: ( (otherlv_0= ':' ( (lv_superType_1_0= ruleConstructedType ) ) (otherlv_2= ',' ( (lv_superType_3_0= ruleTypeDeclaration ) ) )* ) )
            // InternalMyDsl.g:726:2: (otherlv_0= ':' ( (lv_superType_1_0= ruleConstructedType ) ) (otherlv_2= ',' ( (lv_superType_3_0= ruleTypeDeclaration ) ) )* )
            {
            // InternalMyDsl.g:726:2: (otherlv_0= ':' ( (lv_superType_1_0= ruleConstructedType ) ) (otherlv_2= ',' ( (lv_superType_3_0= ruleTypeDeclaration ) ) )* )
            // InternalMyDsl.g:727:3: otherlv_0= ':' ( (lv_superType_1_0= ruleConstructedType ) ) (otherlv_2= ',' ( (lv_superType_3_0= ruleTypeDeclaration ) ) )*
            {
            otherlv_0=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSupertypeAccess().getColonKeyword_0());
            		
            // InternalMyDsl.g:731:3: ( (lv_superType_1_0= ruleConstructedType ) )
            // InternalMyDsl.g:732:4: (lv_superType_1_0= ruleConstructedType )
            {
            // InternalMyDsl.g:732:4: (lv_superType_1_0= ruleConstructedType )
            // InternalMyDsl.g:733:5: lv_superType_1_0= ruleConstructedType
            {

            					newCompositeNode(grammarAccess.getSupertypeAccess().getSuperTypeConstructedTypeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_12);
            lv_superType_1_0=ruleConstructedType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSupertypeRule());
            					}
            					add(
            						current,
            						"superType",
            						lv_superType_1_0,
            						"org.xtext.sampleProj.mydsl.MyDsl.ConstructedType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:750:3: (otherlv_2= ',' ( (lv_superType_3_0= ruleTypeDeclaration ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==19) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMyDsl.g:751:4: otherlv_2= ',' ( (lv_superType_3_0= ruleTypeDeclaration ) )
            	    {
            	    otherlv_2=(Token)match(input,19,FOLLOW_4); 

            	    				newLeafNode(otherlv_2, grammarAccess.getSupertypeAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalMyDsl.g:755:4: ( (lv_superType_3_0= ruleTypeDeclaration ) )
            	    // InternalMyDsl.g:756:5: (lv_superType_3_0= ruleTypeDeclaration )
            	    {
            	    // InternalMyDsl.g:756:5: (lv_superType_3_0= ruleTypeDeclaration )
            	    // InternalMyDsl.g:757:6: lv_superType_3_0= ruleTypeDeclaration
            	    {

            	    						newCompositeNode(grammarAccess.getSupertypeAccess().getSuperTypeTypeDeclarationParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_superType_3_0=ruleTypeDeclaration();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSupertypeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"superType",
            	    							lv_superType_3_0,
            	    							"org.xtext.sampleProj.mydsl.MyDsl.TypeDeclaration");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // $ANTLR end "ruleSupertype"


    // $ANTLR start "entryRuleTypeDeclaration"
    // InternalMyDsl.g:779:1: entryRuleTypeDeclaration returns [EObject current=null] : iv_ruleTypeDeclaration= ruleTypeDeclaration EOF ;
    public final EObject entryRuleTypeDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeDeclaration = null;


        try {
            // InternalMyDsl.g:779:56: (iv_ruleTypeDeclaration= ruleTypeDeclaration EOF )
            // InternalMyDsl.g:780:2: iv_ruleTypeDeclaration= ruleTypeDeclaration EOF
            {
             newCompositeNode(grammarAccess.getTypeDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTypeDeclaration=ruleTypeDeclaration();

            state._fsp--;

             current =iv_ruleTypeDeclaration; 
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
    // $ANTLR end "entryRuleTypeDeclaration"


    // $ANTLR start "ruleTypeDeclaration"
    // InternalMyDsl.g:786:1: ruleTypeDeclaration returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_context_1_0= ruleTypeDeclContext ) ) ) ;
    public final EObject ruleTypeDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_context_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:792:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_context_1_0= ruleTypeDeclContext ) ) ) )
            // InternalMyDsl.g:793:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_context_1_0= ruleTypeDeclContext ) ) )
            {
            // InternalMyDsl.g:793:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_context_1_0= ruleTypeDeclContext ) ) )
            // InternalMyDsl.g:794:3: ( (otherlv_0= RULE_ID ) ) ( (lv_context_1_0= ruleTypeDeclContext ) )
            {
            // InternalMyDsl.g:794:3: ( (otherlv_0= RULE_ID ) )
            // InternalMyDsl.g:795:4: (otherlv_0= RULE_ID )
            {
            // InternalMyDsl.g:795:4: (otherlv_0= RULE_ID )
            // InternalMyDsl.g:796:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTypeDeclarationRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(otherlv_0, grammarAccess.getTypeDeclarationAccess().getTypeNameTypeNameCrossReference_0_0());
            				

            }


            }

            // InternalMyDsl.g:807:3: ( (lv_context_1_0= ruleTypeDeclContext ) )
            // InternalMyDsl.g:808:4: (lv_context_1_0= ruleTypeDeclContext )
            {
            // InternalMyDsl.g:808:4: (lv_context_1_0= ruleTypeDeclContext )
            // InternalMyDsl.g:809:5: lv_context_1_0= ruleTypeDeclContext
            {

            					newCompositeNode(grammarAccess.getTypeDeclarationAccess().getContextTypeDeclContextParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_context_1_0=ruleTypeDeclContext();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTypeDeclarationRule());
            					}
            					set(
            						current,
            						"context",
            						lv_context_1_0,
            						"org.xtext.sampleProj.mydsl.MyDsl.TypeDeclContext");
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
    // $ANTLR end "ruleTypeDeclaration"


    // $ANTLR start "entryRuleConstructedType"
    // InternalMyDsl.g:830:1: entryRuleConstructedType returns [EObject current=null] : iv_ruleConstructedType= ruleConstructedType EOF ;
    public final EObject entryRuleConstructedType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstructedType = null;


        try {
            // InternalMyDsl.g:830:56: (iv_ruleConstructedType= ruleConstructedType EOF )
            // InternalMyDsl.g:831:2: iv_ruleConstructedType= ruleConstructedType EOF
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
    // InternalMyDsl.g:837:1: ruleConstructedType returns [EObject current=null] : ( ( (lv_type_0_0= ruleTypeConstructor ) ) ( (otherlv_1= '\\u00D7' | otherlv_2= '\\u2192' | otherlv_3= '\\uE102' | otherlv_4= '\\uE100' | otherlv_5= '\\u2194' | otherlv_6= '\\u2916' | otherlv_7= '\\u21F8' | otherlv_8= '\\u21A3' | otherlv_9= '\\u2900' | otherlv_10= '\\u21A0' ) ( (lv_type_11_0= ruleTypeConstructor ) ) )* ) ;
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
            // InternalMyDsl.g:843:2: ( ( ( (lv_type_0_0= ruleTypeConstructor ) ) ( (otherlv_1= '\\u00D7' | otherlv_2= '\\u2192' | otherlv_3= '\\uE102' | otherlv_4= '\\uE100' | otherlv_5= '\\u2194' | otherlv_6= '\\u2916' | otherlv_7= '\\u21F8' | otherlv_8= '\\u21A3' | otherlv_9= '\\u2900' | otherlv_10= '\\u21A0' ) ( (lv_type_11_0= ruleTypeConstructor ) ) )* ) )
            // InternalMyDsl.g:844:2: ( ( (lv_type_0_0= ruleTypeConstructor ) ) ( (otherlv_1= '\\u00D7' | otherlv_2= '\\u2192' | otherlv_3= '\\uE102' | otherlv_4= '\\uE100' | otherlv_5= '\\u2194' | otherlv_6= '\\u2916' | otherlv_7= '\\u21F8' | otherlv_8= '\\u21A3' | otherlv_9= '\\u2900' | otherlv_10= '\\u21A0' ) ( (lv_type_11_0= ruleTypeConstructor ) ) )* )
            {
            // InternalMyDsl.g:844:2: ( ( (lv_type_0_0= ruleTypeConstructor ) ) ( (otherlv_1= '\\u00D7' | otherlv_2= '\\u2192' | otherlv_3= '\\uE102' | otherlv_4= '\\uE100' | otherlv_5= '\\u2194' | otherlv_6= '\\u2916' | otherlv_7= '\\u21F8' | otherlv_8= '\\u21A3' | otherlv_9= '\\u2900' | otherlv_10= '\\u21A0' ) ( (lv_type_11_0= ruleTypeConstructor ) ) )* )
            // InternalMyDsl.g:845:3: ( (lv_type_0_0= ruleTypeConstructor ) ) ( (otherlv_1= '\\u00D7' | otherlv_2= '\\u2192' | otherlv_3= '\\uE102' | otherlv_4= '\\uE100' | otherlv_5= '\\u2194' | otherlv_6= '\\u2916' | otherlv_7= '\\u21F8' | otherlv_8= '\\u21A3' | otherlv_9= '\\u2900' | otherlv_10= '\\u21A0' ) ( (lv_type_11_0= ruleTypeConstructor ) ) )*
            {
            // InternalMyDsl.g:845:3: ( (lv_type_0_0= ruleTypeConstructor ) )
            // InternalMyDsl.g:846:4: (lv_type_0_0= ruleTypeConstructor )
            {
            // InternalMyDsl.g:846:4: (lv_type_0_0= ruleTypeConstructor )
            // InternalMyDsl.g:847:5: lv_type_0_0= ruleTypeConstructor
            {

            					newCompositeNode(grammarAccess.getConstructedTypeAccess().getTypeTypeConstructorParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_15);
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

            // InternalMyDsl.g:864:3: ( (otherlv_1= '\\u00D7' | otherlv_2= '\\u2192' | otherlv_3= '\\uE102' | otherlv_4= '\\uE100' | otherlv_5= '\\u2194' | otherlv_6= '\\u2916' | otherlv_7= '\\u21F8' | otherlv_8= '\\u21A3' | otherlv_9= '\\u2900' | otherlv_10= '\\u21A0' ) ( (lv_type_11_0= ruleTypeConstructor ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=20 && LA12_0<=29)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMyDsl.g:865:4: (otherlv_1= '\\u00D7' | otherlv_2= '\\u2192' | otherlv_3= '\\uE102' | otherlv_4= '\\uE100' | otherlv_5= '\\u2194' | otherlv_6= '\\u2916' | otherlv_7= '\\u21F8' | otherlv_8= '\\u21A3' | otherlv_9= '\\u2900' | otherlv_10= '\\u21A0' ) ( (lv_type_11_0= ruleTypeConstructor ) )
            	    {
            	    // InternalMyDsl.g:865:4: (otherlv_1= '\\u00D7' | otherlv_2= '\\u2192' | otherlv_3= '\\uE102' | otherlv_4= '\\uE100' | otherlv_5= '\\u2194' | otherlv_6= '\\u2916' | otherlv_7= '\\u21F8' | otherlv_8= '\\u21A3' | otherlv_9= '\\u2900' | otherlv_10= '\\u21A0' )
            	    int alt11=10;
            	    switch ( input.LA(1) ) {
            	    case 20:
            	        {
            	        alt11=1;
            	        }
            	        break;
            	    case 21:
            	        {
            	        alt11=2;
            	        }
            	        break;
            	    case 22:
            	        {
            	        alt11=3;
            	        }
            	        break;
            	    case 23:
            	        {
            	        alt11=4;
            	        }
            	        break;
            	    case 24:
            	        {
            	        alt11=5;
            	        }
            	        break;
            	    case 25:
            	        {
            	        alt11=6;
            	        }
            	        break;
            	    case 26:
            	        {
            	        alt11=7;
            	        }
            	        break;
            	    case 27:
            	        {
            	        alt11=8;
            	        }
            	        break;
            	    case 28:
            	        {
            	        alt11=9;
            	        }
            	        break;
            	    case 29:
            	        {
            	        alt11=10;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 11, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt11) {
            	        case 1 :
            	            // InternalMyDsl.g:866:5: otherlv_1= '\\u00D7'
            	            {
            	            otherlv_1=(Token)match(input,20,FOLLOW_4); 

            	            					newLeafNode(otherlv_1, grammarAccess.getConstructedTypeAccess().getMultiplicationSignKeyword_1_0_0());
            	            				

            	            }
            	            break;
            	        case 2 :
            	            // InternalMyDsl.g:871:5: otherlv_2= '\\u2192'
            	            {
            	            otherlv_2=(Token)match(input,21,FOLLOW_4); 

            	            					newLeafNode(otherlv_2, grammarAccess.getConstructedTypeAccess().getRightwardsArrowKeyword_1_0_1());
            	            				

            	            }
            	            break;
            	        case 3 :
            	            // InternalMyDsl.g:876:5: otherlv_3= '\\uE102'
            	            {
            	            otherlv_3=(Token)match(input,22,FOLLOW_4); 

            	            					newLeafNode(otherlv_3, grammarAccess.getConstructedTypeAccess().getPrivateUseAreaE102Keyword_1_0_2());
            	            				

            	            }
            	            break;
            	        case 4 :
            	            // InternalMyDsl.g:881:5: otherlv_4= '\\uE100'
            	            {
            	            otherlv_4=(Token)match(input,23,FOLLOW_4); 

            	            					newLeafNode(otherlv_4, grammarAccess.getConstructedTypeAccess().getPrivateUseAreaE100Keyword_1_0_3());
            	            				

            	            }
            	            break;
            	        case 5 :
            	            // InternalMyDsl.g:886:5: otherlv_5= '\\u2194'
            	            {
            	            otherlv_5=(Token)match(input,24,FOLLOW_4); 

            	            					newLeafNode(otherlv_5, grammarAccess.getConstructedTypeAccess().getLeftRightArrowKeyword_1_0_4());
            	            				

            	            }
            	            break;
            	        case 6 :
            	            // InternalMyDsl.g:891:5: otherlv_6= '\\u2916'
            	            {
            	            otherlv_6=(Token)match(input,25,FOLLOW_4); 

            	            					newLeafNode(otherlv_6, grammarAccess.getConstructedTypeAccess().getRightwardsTwoHeadedArrowWithTailKeyword_1_0_5());
            	            				

            	            }
            	            break;
            	        case 7 :
            	            // InternalMyDsl.g:896:5: otherlv_7= '\\u21F8'
            	            {
            	            otherlv_7=(Token)match(input,26,FOLLOW_4); 

            	            					newLeafNode(otherlv_7, grammarAccess.getConstructedTypeAccess().getRightwardsArrowWithVerticalStrokeKeyword_1_0_6());
            	            				

            	            }
            	            break;
            	        case 8 :
            	            // InternalMyDsl.g:901:5: otherlv_8= '\\u21A3'
            	            {
            	            otherlv_8=(Token)match(input,27,FOLLOW_4); 

            	            					newLeafNode(otherlv_8, grammarAccess.getConstructedTypeAccess().getRightwardsArrowWithTailKeyword_1_0_7());
            	            				

            	            }
            	            break;
            	        case 9 :
            	            // InternalMyDsl.g:906:5: otherlv_9= '\\u2900'
            	            {
            	            otherlv_9=(Token)match(input,28,FOLLOW_4); 

            	            					newLeafNode(otherlv_9, grammarAccess.getConstructedTypeAccess().getRightwardsTwoHeadedArrowWithVerticalStrokeKeyword_1_0_8());
            	            				

            	            }
            	            break;
            	        case 10 :
            	            // InternalMyDsl.g:911:5: otherlv_10= '\\u21A0'
            	            {
            	            otherlv_10=(Token)match(input,29,FOLLOW_4); 

            	            					newLeafNode(otherlv_10, grammarAccess.getConstructedTypeAccess().getRightwardsTwoHeadedArrowKeyword_1_0_9());
            	            				

            	            }
            	            break;

            	    }

            	    // InternalMyDsl.g:916:4: ( (lv_type_11_0= ruleTypeConstructor ) )
            	    // InternalMyDsl.g:917:5: (lv_type_11_0= ruleTypeConstructor )
            	    {
            	    // InternalMyDsl.g:917:5: (lv_type_11_0= ruleTypeConstructor )
            	    // InternalMyDsl.g:918:6: lv_type_11_0= ruleTypeConstructor
            	    {

            	    						newCompositeNode(grammarAccess.getConstructedTypeAccess().getTypeTypeConstructorParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_15);
            	    lv_type_11_0=ruleTypeConstructor();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getConstructedTypeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"type",
            	    							lv_type_11_0,
            	    							"org.xtext.sampleProj.mydsl.MyDsl.TypeConstructor");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


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
    // $ANTLR end "ruleConstructedType"


    // $ANTLR start "entryRuleTypeConstructor"
    // InternalMyDsl.g:940:1: entryRuleTypeConstructor returns [EObject current=null] : iv_ruleTypeConstructor= ruleTypeConstructor EOF ;
    public final EObject entryRuleTypeConstructor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeConstructor = null;


        try {
            // InternalMyDsl.g:940:56: (iv_ruleTypeConstructor= ruleTypeConstructor EOF )
            // InternalMyDsl.g:941:2: iv_ruleTypeConstructor= ruleTypeConstructor EOF
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
    // InternalMyDsl.g:947:1: ruleTypeConstructor returns [EObject current=null] : ( ( (lv_typeName_0_0= RULE_ID ) ) ( (lv_context_1_0= ruleTypeDeclContext ) )? ) ;
    public final EObject ruleTypeConstructor() throws RecognitionException {
        EObject current = null;

        Token lv_typeName_0_0=null;
        EObject lv_context_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:953:2: ( ( ( (lv_typeName_0_0= RULE_ID ) ) ( (lv_context_1_0= ruleTypeDeclContext ) )? ) )
            // InternalMyDsl.g:954:2: ( ( (lv_typeName_0_0= RULE_ID ) ) ( (lv_context_1_0= ruleTypeDeclContext ) )? )
            {
            // InternalMyDsl.g:954:2: ( ( (lv_typeName_0_0= RULE_ID ) ) ( (lv_context_1_0= ruleTypeDeclContext ) )? )
            // InternalMyDsl.g:955:3: ( (lv_typeName_0_0= RULE_ID ) ) ( (lv_context_1_0= ruleTypeDeclContext ) )?
            {
            // InternalMyDsl.g:955:3: ( (lv_typeName_0_0= RULE_ID ) )
            // InternalMyDsl.g:956:4: (lv_typeName_0_0= RULE_ID )
            {
            // InternalMyDsl.g:956:4: (lv_typeName_0_0= RULE_ID )
            // InternalMyDsl.g:957:5: lv_typeName_0_0= RULE_ID
            {
            lv_typeName_0_0=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(lv_typeName_0_0, grammarAccess.getTypeConstructorAccess().getTypeNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTypeConstructorRule());
            					}
            					addWithLastConsumed(
            						current,
            						"typeName",
            						lv_typeName_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMyDsl.g:973:3: ( (lv_context_1_0= ruleTypeDeclContext ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==16) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMyDsl.g:974:4: (lv_context_1_0= ruleTypeDeclContext )
                    {
                    // InternalMyDsl.g:974:4: (lv_context_1_0= ruleTypeDeclContext )
                    // InternalMyDsl.g:975:5: lv_context_1_0= ruleTypeDeclContext
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
    // InternalMyDsl.g:996:1: entryRuleTypeDeclContext returns [EObject current=null] : iv_ruleTypeDeclContext= ruleTypeDeclContext EOF ;
    public final EObject entryRuleTypeDeclContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeDeclContext = null;


        try {
            // InternalMyDsl.g:996:56: (iv_ruleTypeDeclContext= ruleTypeDeclContext EOF )
            // InternalMyDsl.g:997:2: iv_ruleTypeDeclContext= ruleTypeDeclContext EOF
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
    // InternalMyDsl.g:1003:1: ruleTypeDeclContext returns [EObject current=null] : (otherlv_0= '<' ( (lv_typeName_1_0= ruleTypeConstructor ) ) (otherlv_2= ',' ( (lv_typeName_3_0= ruleTypeConstructor ) ) )* otherlv_4= '>' ) ;
    public final EObject ruleTypeDeclContext() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_typeName_1_0 = null;

        EObject lv_typeName_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1009:2: ( (otherlv_0= '<' ( (lv_typeName_1_0= ruleTypeConstructor ) ) (otherlv_2= ',' ( (lv_typeName_3_0= ruleTypeConstructor ) ) )* otherlv_4= '>' ) )
            // InternalMyDsl.g:1010:2: (otherlv_0= '<' ( (lv_typeName_1_0= ruleTypeConstructor ) ) (otherlv_2= ',' ( (lv_typeName_3_0= ruleTypeConstructor ) ) )* otherlv_4= '>' )
            {
            // InternalMyDsl.g:1010:2: (otherlv_0= '<' ( (lv_typeName_1_0= ruleTypeConstructor ) ) (otherlv_2= ',' ( (lv_typeName_3_0= ruleTypeConstructor ) ) )* otherlv_4= '>' )
            // InternalMyDsl.g:1011:3: otherlv_0= '<' ( (lv_typeName_1_0= ruleTypeConstructor ) ) (otherlv_2= ',' ( (lv_typeName_3_0= ruleTypeConstructor ) ) )* otherlv_4= '>'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getTypeDeclContextAccess().getLessThanSignKeyword_0());
            		
            // InternalMyDsl.g:1015:3: ( (lv_typeName_1_0= ruleTypeConstructor ) )
            // InternalMyDsl.g:1016:4: (lv_typeName_1_0= ruleTypeConstructor )
            {
            // InternalMyDsl.g:1016:4: (lv_typeName_1_0= ruleTypeConstructor )
            // InternalMyDsl.g:1017:5: lv_typeName_1_0= ruleTypeConstructor
            {

            					newCompositeNode(grammarAccess.getTypeDeclContextAccess().getTypeNameTypeConstructorParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_17);
            lv_typeName_1_0=ruleTypeConstructor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTypeDeclContextRule());
            					}
            					add(
            						current,
            						"typeName",
            						lv_typeName_1_0,
            						"org.xtext.sampleProj.mydsl.MyDsl.TypeConstructor");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:1034:3: (otherlv_2= ',' ( (lv_typeName_3_0= ruleTypeConstructor ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==19) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMyDsl.g:1035:4: otherlv_2= ',' ( (lv_typeName_3_0= ruleTypeConstructor ) )
            	    {
            	    otherlv_2=(Token)match(input,19,FOLLOW_4); 

            	    				newLeafNode(otherlv_2, grammarAccess.getTypeDeclContextAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalMyDsl.g:1039:4: ( (lv_typeName_3_0= ruleTypeConstructor ) )
            	    // InternalMyDsl.g:1040:5: (lv_typeName_3_0= ruleTypeConstructor )
            	    {
            	    // InternalMyDsl.g:1040:5: (lv_typeName_3_0= ruleTypeConstructor )
            	    // InternalMyDsl.g:1041:6: lv_typeName_3_0= ruleTypeConstructor
            	    {

            	    						newCompositeNode(grammarAccess.getTypeDeclContextAccess().getTypeNameTypeConstructorParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_17);
            	    lv_typeName_3_0=ruleTypeConstructor();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTypeDeclContextRule());
            	    						}
            	    						add(
            	    							current,
            	    							"typeName",
            	    							lv_typeName_3_0,
            	    							"org.xtext.sampleProj.mydsl.MyDsl.TypeConstructor");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_4=(Token)match(input,17,FOLLOW_2); 

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


    // $ANTLR start "entryRuleTypeBodyElements"
    // InternalMyDsl.g:1067:1: entryRuleTypeBodyElements returns [EObject current=null] : iv_ruleTypeBodyElements= ruleTypeBodyElements EOF ;
    public final EObject entryRuleTypeBodyElements() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeBodyElements = null;


        try {
            // InternalMyDsl.g:1067:57: (iv_ruleTypeBodyElements= ruleTypeBodyElements EOF )
            // InternalMyDsl.g:1068:2: iv_ruleTypeBodyElements= ruleTypeBodyElements EOF
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
    // InternalMyDsl.g:1074:1: ruleTypeBodyElements returns [EObject current=null] : ( ( (lv_functions_0_0= ruleFunctionDecl ) ) | ( (lv_theorems_1_0= ruleTheoremBody ) ) ) ;
    public final EObject ruleTypeBodyElements() throws RecognitionException {
        EObject current = null;

        EObject lv_functions_0_0 = null;

        AntlrDatatypeRuleToken lv_theorems_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1080:2: ( ( ( (lv_functions_0_0= ruleFunctionDecl ) ) | ( (lv_theorems_1_0= ruleTheoremBody ) ) ) )
            // InternalMyDsl.g:1081:2: ( ( (lv_functions_0_0= ruleFunctionDecl ) ) | ( (lv_theorems_1_0= ruleTheoremBody ) ) )
            {
            // InternalMyDsl.g:1081:2: ( ( (lv_functions_0_0= ruleFunctionDecl ) ) | ( (lv_theorems_1_0= ruleTheoremBody ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID) ) {
                alt15=1;
            }
            else if ( (LA15_0==33) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalMyDsl.g:1082:3: ( (lv_functions_0_0= ruleFunctionDecl ) )
                    {
                    // InternalMyDsl.g:1082:3: ( (lv_functions_0_0= ruleFunctionDecl ) )
                    // InternalMyDsl.g:1083:4: (lv_functions_0_0= ruleFunctionDecl )
                    {
                    // InternalMyDsl.g:1083:4: (lv_functions_0_0= ruleFunctionDecl )
                    // InternalMyDsl.g:1084:5: lv_functions_0_0= ruleFunctionDecl
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
                    // InternalMyDsl.g:1102:3: ( (lv_theorems_1_0= ruleTheoremBody ) )
                    {
                    // InternalMyDsl.g:1102:3: ( (lv_theorems_1_0= ruleTheoremBody ) )
                    // InternalMyDsl.g:1103:4: (lv_theorems_1_0= ruleTheoremBody )
                    {
                    // InternalMyDsl.g:1103:4: (lv_theorems_1_0= ruleTheoremBody )
                    // InternalMyDsl.g:1104:5: lv_theorems_1_0= ruleTheoremBody
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


    // $ANTLR start "entryRuleFunctionName"
    // InternalMyDsl.g:1125:1: entryRuleFunctionName returns [EObject current=null] : iv_ruleFunctionName= ruleFunctionName EOF ;
    public final EObject entryRuleFunctionName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionName = null;


        try {
            // InternalMyDsl.g:1125:53: (iv_ruleFunctionName= ruleFunctionName EOF )
            // InternalMyDsl.g:1126:2: iv_ruleFunctionName= ruleFunctionName EOF
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
    // InternalMyDsl.g:1132:1: ruleFunctionName returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleFunctionName() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1138:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalMyDsl.g:1139:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalMyDsl.g:1139:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalMyDsl.g:1140:3: (lv_name_0_0= RULE_ID )
            {
            // InternalMyDsl.g:1140:3: (lv_name_0_0= RULE_ID )
            // InternalMyDsl.g:1141:4: lv_name_0_0= RULE_ID
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


    // $ANTLR start "entryRuleDatatype"
    // InternalMyDsl.g:1160:1: entryRuleDatatype returns [EObject current=null] : iv_ruleDatatype= ruleDatatype EOF ;
    public final EObject entryRuleDatatype() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatatype = null;


        try {
            // InternalMyDsl.g:1160:49: (iv_ruleDatatype= ruleDatatype EOF )
            // InternalMyDsl.g:1161:2: iv_ruleDatatype= ruleDatatype EOF
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
    // InternalMyDsl.g:1167:1: ruleDatatype returns [EObject current=null] : (otherlv_0= 'Datatype' ( (lv_name_1_0= ruleTypeName ) ) ( (lv_context_2_0= rulePolyContext ) )? ( (lv_constructors_3_0= ruleDatatypeConstructor ) )* otherlv_4= '{' ( (lv_bodyElements_5_0= ruleTypeBodyElements ) )* otherlv_6= '}' ) ;
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
            // InternalMyDsl.g:1173:2: ( (otherlv_0= 'Datatype' ( (lv_name_1_0= ruleTypeName ) ) ( (lv_context_2_0= rulePolyContext ) )? ( (lv_constructors_3_0= ruleDatatypeConstructor ) )* otherlv_4= '{' ( (lv_bodyElements_5_0= ruleTypeBodyElements ) )* otherlv_6= '}' ) )
            // InternalMyDsl.g:1174:2: (otherlv_0= 'Datatype' ( (lv_name_1_0= ruleTypeName ) ) ( (lv_context_2_0= rulePolyContext ) )? ( (lv_constructors_3_0= ruleDatatypeConstructor ) )* otherlv_4= '{' ( (lv_bodyElements_5_0= ruleTypeBodyElements ) )* otherlv_6= '}' )
            {
            // InternalMyDsl.g:1174:2: (otherlv_0= 'Datatype' ( (lv_name_1_0= ruleTypeName ) ) ( (lv_context_2_0= rulePolyContext ) )? ( (lv_constructors_3_0= ruleDatatypeConstructor ) )* otherlv_4= '{' ( (lv_bodyElements_5_0= ruleTypeBodyElements ) )* otherlv_6= '}' )
            // InternalMyDsl.g:1175:3: otherlv_0= 'Datatype' ( (lv_name_1_0= ruleTypeName ) ) ( (lv_context_2_0= rulePolyContext ) )? ( (lv_constructors_3_0= ruleDatatypeConstructor ) )* otherlv_4= '{' ( (lv_bodyElements_5_0= ruleTypeBodyElements ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDatatypeAccess().getDatatypeKeyword_0());
            		
            // InternalMyDsl.g:1179:3: ( (lv_name_1_0= ruleTypeName ) )
            // InternalMyDsl.g:1180:4: (lv_name_1_0= ruleTypeName )
            {
            // InternalMyDsl.g:1180:4: (lv_name_1_0= ruleTypeName )
            // InternalMyDsl.g:1181:5: lv_name_1_0= ruleTypeName
            {

            					newCompositeNode(grammarAccess.getDatatypeAccess().getNameTypeNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_18);
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

            // InternalMyDsl.g:1198:3: ( (lv_context_2_0= rulePolyContext ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==16) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMyDsl.g:1199:4: (lv_context_2_0= rulePolyContext )
                    {
                    // InternalMyDsl.g:1199:4: (lv_context_2_0= rulePolyContext )
                    // InternalMyDsl.g:1200:5: lv_context_2_0= rulePolyContext
                    {

                    					newCompositeNode(grammarAccess.getDatatypeAccess().getContextPolyContextParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_19);
                    lv_context_2_0=rulePolyContext();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDatatypeRule());
                    					}
                    					add(
                    						current,
                    						"context",
                    						lv_context_2_0,
                    						"org.xtext.sampleProj.mydsl.MyDsl.PolyContext");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1217:3: ( (lv_constructors_3_0= ruleDatatypeConstructor ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalMyDsl.g:1218:4: (lv_constructors_3_0= ruleDatatypeConstructor )
            	    {
            	    // InternalMyDsl.g:1218:4: (lv_constructors_3_0= ruleDatatypeConstructor )
            	    // InternalMyDsl.g:1219:5: lv_constructors_3_0= ruleDatatypeConstructor
            	    {

            	    					newCompositeNode(grammarAccess.getDatatypeAccess().getConstructorsDatatypeConstructorParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_19);
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
            	    break loop17;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getDatatypeAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalMyDsl.g:1240:3: ( (lv_bodyElements_5_0= ruleTypeBodyElements ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID||LA18_0==33) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalMyDsl.g:1241:4: (lv_bodyElements_5_0= ruleTypeBodyElements )
            	    {
            	    // InternalMyDsl.g:1241:4: (lv_bodyElements_5_0= ruleTypeBodyElements )
            	    // InternalMyDsl.g:1242:5: lv_bodyElements_5_0= ruleTypeBodyElements
            	    {

            	    					newCompositeNode(grammarAccess.getDatatypeAccess().getBodyElementsTypeBodyElementsParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_9);
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
            	    break loop18;
                }
            } while (true);

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

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
    // InternalMyDsl.g:1267:1: entryRuleDatatypeConstructor returns [EObject current=null] : iv_ruleDatatypeConstructor= ruleDatatypeConstructor EOF ;
    public final EObject entryRuleDatatypeConstructor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatatypeConstructor = null;


        try {
            // InternalMyDsl.g:1267:60: (iv_ruleDatatypeConstructor= ruleDatatypeConstructor EOF )
            // InternalMyDsl.g:1268:2: iv_ruleDatatypeConstructor= ruleDatatypeConstructor EOF
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
    // InternalMyDsl.g:1274:1: ruleDatatypeConstructor returns [EObject current=null] : (this_BaseConstructor_0= ruleBaseConstructor | this_Constructor_1= ruleConstructor ) ;
    public final EObject ruleDatatypeConstructor() throws RecognitionException {
        EObject current = null;

        EObject this_BaseConstructor_0 = null;

        EObject this_Constructor_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1280:2: ( (this_BaseConstructor_0= ruleBaseConstructor | this_Constructor_1= ruleConstructor ) )
            // InternalMyDsl.g:1281:2: (this_BaseConstructor_0= ruleBaseConstructor | this_Constructor_1= ruleConstructor )
            {
            // InternalMyDsl.g:1281:2: (this_BaseConstructor_0= ruleBaseConstructor | this_Constructor_1= ruleConstructor )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID) ) {
                int LA19_1 = input.LA(2);

                if ( (LA19_1==31) ) {
                    alt19=2;
                }
                else if ( (LA19_1==EOF||LA19_1==RULE_ID||LA19_1==14) ) {
                    alt19=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalMyDsl.g:1282:3: this_BaseConstructor_0= ruleBaseConstructor
                    {

                    			newCompositeNode(grammarAccess.getDatatypeConstructorAccess().getBaseConstructorParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_BaseConstructor_0=ruleBaseConstructor();

                    state._fsp--;


                    			current = this_BaseConstructor_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1291:3: this_Constructor_1= ruleConstructor
                    {

                    			newCompositeNode(grammarAccess.getDatatypeConstructorAccess().getConstructorParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Constructor_1=ruleConstructor();

                    state._fsp--;


                    			current = this_Constructor_1;
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
    // $ANTLR end "ruleDatatypeConstructor"


    // $ANTLR start "entryRuleBaseConstructor"
    // InternalMyDsl.g:1303:1: entryRuleBaseConstructor returns [EObject current=null] : iv_ruleBaseConstructor= ruleBaseConstructor EOF ;
    public final EObject entryRuleBaseConstructor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBaseConstructor = null;


        try {
            // InternalMyDsl.g:1303:56: (iv_ruleBaseConstructor= ruleBaseConstructor EOF )
            // InternalMyDsl.g:1304:2: iv_ruleBaseConstructor= ruleBaseConstructor EOF
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
    // InternalMyDsl.g:1310:1: ruleBaseConstructor returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleBaseConstructor() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1316:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalMyDsl.g:1317:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalMyDsl.g:1317:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalMyDsl.g:1318:3: (lv_name_0_0= RULE_ID )
            {
            // InternalMyDsl.g:1318:3: (lv_name_0_0= RULE_ID )
            // InternalMyDsl.g:1319:4: lv_name_0_0= RULE_ID
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


    // $ANTLR start "entryRuleConstructor"
    // InternalMyDsl.g:1338:1: entryRuleConstructor returns [EObject current=null] : iv_ruleConstructor= ruleConstructor EOF ;
    public final EObject entryRuleConstructor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstructor = null;


        try {
            // InternalMyDsl.g:1338:52: (iv_ruleConstructor= ruleConstructor EOF )
            // InternalMyDsl.g:1339:2: iv_ruleConstructor= ruleConstructor EOF
            {
             newCompositeNode(grammarAccess.getConstructorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstructor=ruleConstructor();

            state._fsp--;

             current =iv_ruleConstructor; 
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
    // $ANTLR end "entryRuleConstructor"


    // $ANTLR start "ruleConstructor"
    // InternalMyDsl.g:1345:1: ruleConstructor returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_typedVariables_2_0= ruleTypedVariable ) )* otherlv_3= ')' ) ;
    public final EObject ruleConstructor() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_typedVariables_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1351:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_typedVariables_2_0= ruleTypedVariable ) )* otherlv_3= ')' ) )
            // InternalMyDsl.g:1352:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_typedVariables_2_0= ruleTypedVariable ) )* otherlv_3= ')' )
            {
            // InternalMyDsl.g:1352:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_typedVariables_2_0= ruleTypedVariable ) )* otherlv_3= ')' )
            // InternalMyDsl.g:1353:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_typedVariables_2_0= ruleTypedVariable ) )* otherlv_3= ')'
            {
            // InternalMyDsl.g:1353:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalMyDsl.g:1354:4: (lv_name_0_0= RULE_ID )
            {
            // InternalMyDsl.g:1354:4: (lv_name_0_0= RULE_ID )
            // InternalMyDsl.g:1355:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(lv_name_0_0, grammarAccess.getConstructorAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConstructorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,31,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getConstructorAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMyDsl.g:1375:3: ( (lv_typedVariables_2_0= ruleTypedVariable ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ID) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalMyDsl.g:1376:4: (lv_typedVariables_2_0= ruleTypedVariable )
            	    {
            	    // InternalMyDsl.g:1376:4: (lv_typedVariables_2_0= ruleTypedVariable )
            	    // InternalMyDsl.g:1377:5: lv_typedVariables_2_0= ruleTypedVariable
            	    {

            	    					newCompositeNode(grammarAccess.getConstructorAccess().getTypedVariablesTypedVariableParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_21);
            	    lv_typedVariables_2_0=ruleTypedVariable();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getConstructorRule());
            	    					}
            	    					add(
            	    						current,
            	    						"typedVariables",
            	    						lv_typedVariables_2_0,
            	    						"org.xtext.sampleProj.mydsl.MyDsl.TypedVariable");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            otherlv_3=(Token)match(input,32,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getConstructorAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleConstructor"


    // $ANTLR start "entryRuleExtend"
    // InternalMyDsl.g:1402:1: entryRuleExtend returns [EObject current=null] : iv_ruleExtend= ruleExtend EOF ;
    public final EObject entryRuleExtend() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtend = null;


        try {
            // InternalMyDsl.g:1402:47: (iv_ruleExtend= ruleExtend EOF )
            // InternalMyDsl.g:1403:2: iv_ruleExtend= ruleExtend EOF
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
    // InternalMyDsl.g:1409:1: ruleExtend returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_extesnion_2_0= RULE_ID ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_bodyElements_5_0= ruleTypeBodyElements ) )* otherlv_6= '}' ) ;
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
            // InternalMyDsl.g:1415:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_extesnion_2_0= RULE_ID ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_bodyElements_5_0= ruleTypeBodyElements ) )* otherlv_6= '}' ) )
            // InternalMyDsl.g:1416:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_extesnion_2_0= RULE_ID ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_bodyElements_5_0= ruleTypeBodyElements ) )* otherlv_6= '}' )
            {
            // InternalMyDsl.g:1416:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_extesnion_2_0= RULE_ID ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_bodyElements_5_0= ruleTypeBodyElements ) )* otherlv_6= '}' )
            // InternalMyDsl.g:1417:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_extesnion_2_0= RULE_ID ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_bodyElements_5_0= ruleTypeBodyElements ) )* otherlv_6= '}'
            {
            // InternalMyDsl.g:1417:3: ( (otherlv_0= RULE_ID ) )
            // InternalMyDsl.g:1418:4: (otherlv_0= RULE_ID )
            {
            // InternalMyDsl.g:1418:4: (otherlv_0= RULE_ID )
            // InternalMyDsl.g:1419:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExtendRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(otherlv_0, grammarAccess.getExtendAccess().getNameTypeNameCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,31,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getExtendAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMyDsl.g:1434:3: ( (lv_extesnion_2_0= RULE_ID ) )
            // InternalMyDsl.g:1435:4: (lv_extesnion_2_0= RULE_ID )
            {
            // InternalMyDsl.g:1435:4: (lv_extesnion_2_0= RULE_ID )
            // InternalMyDsl.g:1436:5: lv_extesnion_2_0= RULE_ID
            {
            lv_extesnion_2_0=(Token)match(input,RULE_ID,FOLLOW_22); 

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

            otherlv_3=(Token)match(input,32,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getExtendAccess().getRightParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,14,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getExtendAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalMyDsl.g:1460:3: ( (lv_bodyElements_5_0= ruleTypeBodyElements ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_ID||LA21_0==33) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalMyDsl.g:1461:4: (lv_bodyElements_5_0= ruleTypeBodyElements )
            	    {
            	    // InternalMyDsl.g:1461:4: (lv_bodyElements_5_0= ruleTypeBodyElements )
            	    // InternalMyDsl.g:1462:5: lv_bodyElements_5_0= ruleTypeBodyElements
            	    {

            	    					newCompositeNode(grammarAccess.getExtendAccess().getBodyElementsTypeBodyElementsParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_9);
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
            	    break loop21;
                }
            } while (true);

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

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


    // $ANTLR start "entryRuleFunctionDecl"
    // InternalMyDsl.g:1487:1: entryRuleFunctionDecl returns [EObject current=null] : iv_ruleFunctionDecl= ruleFunctionDecl EOF ;
    public final EObject entryRuleFunctionDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionDecl = null;


        try {
            // InternalMyDsl.g:1487:53: (iv_ruleFunctionDecl= ruleFunctionDecl EOF )
            // InternalMyDsl.g:1488:2: iv_ruleFunctionDecl= ruleFunctionDecl EOF
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
    // InternalMyDsl.g:1494:1: ruleFunctionDecl returns [EObject current=null] : ( ( (lv_name_0_0= ruleFunctionName ) ) otherlv_1= '(' ( (lv_typeVariables_2_0= ruleTypedVariable ) )* otherlv_3= ')' ) ;
    public final EObject ruleFunctionDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_name_0_0 = null;

        EObject lv_typeVariables_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1500:2: ( ( ( (lv_name_0_0= ruleFunctionName ) ) otherlv_1= '(' ( (lv_typeVariables_2_0= ruleTypedVariable ) )* otherlv_3= ')' ) )
            // InternalMyDsl.g:1501:2: ( ( (lv_name_0_0= ruleFunctionName ) ) otherlv_1= '(' ( (lv_typeVariables_2_0= ruleTypedVariable ) )* otherlv_3= ')' )
            {
            // InternalMyDsl.g:1501:2: ( ( (lv_name_0_0= ruleFunctionName ) ) otherlv_1= '(' ( (lv_typeVariables_2_0= ruleTypedVariable ) )* otherlv_3= ')' )
            // InternalMyDsl.g:1502:3: ( (lv_name_0_0= ruleFunctionName ) ) otherlv_1= '(' ( (lv_typeVariables_2_0= ruleTypedVariable ) )* otherlv_3= ')'
            {
            // InternalMyDsl.g:1502:3: ( (lv_name_0_0= ruleFunctionName ) )
            // InternalMyDsl.g:1503:4: (lv_name_0_0= ruleFunctionName )
            {
            // InternalMyDsl.g:1503:4: (lv_name_0_0= ruleFunctionName )
            // InternalMyDsl.g:1504:5: lv_name_0_0= ruleFunctionName
            {

            					newCompositeNode(grammarAccess.getFunctionDeclAccess().getNameFunctionNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_20);
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

            otherlv_1=(Token)match(input,31,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getFunctionDeclAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMyDsl.g:1525:3: ( (lv_typeVariables_2_0= ruleTypedVariable ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_ID) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalMyDsl.g:1526:4: (lv_typeVariables_2_0= ruleTypedVariable )
            	    {
            	    // InternalMyDsl.g:1526:4: (lv_typeVariables_2_0= ruleTypedVariable )
            	    // InternalMyDsl.g:1527:5: lv_typeVariables_2_0= ruleTypedVariable
            	    {

            	    					newCompositeNode(grammarAccess.getFunctionDeclAccess().getTypeVariablesTypedVariableParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_21);
            	    lv_typeVariables_2_0=ruleTypedVariable();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFunctionDeclRule());
            	    					}
            	    					add(
            	    						current,
            	    						"typeVariables",
            	    						lv_typeVariables_2_0,
            	    						"org.xtext.sampleProj.mydsl.MyDsl.TypedVariable");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            otherlv_3=(Token)match(input,32,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getFunctionDeclAccess().getRightParenthesisKeyword_3());
            		

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


    // $ANTLR start "entryRuleTheoremBody"
    // InternalMyDsl.g:1552:1: entryRuleTheoremBody returns [String current=null] : iv_ruleTheoremBody= ruleTheoremBody EOF ;
    public final String entryRuleTheoremBody() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTheoremBody = null;


        try {
            // InternalMyDsl.g:1552:51: (iv_ruleTheoremBody= ruleTheoremBody EOF )
            // InternalMyDsl.g:1553:2: iv_ruleTheoremBody= ruleTheoremBody EOF
            {
             newCompositeNode(grammarAccess.getTheoremBodyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTheoremBody=ruleTheoremBody();

            state._fsp--;

             current =iv_ruleTheoremBody.getText(); 
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
    // InternalMyDsl.g:1559:1: ruleTheoremBody returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Theorems' kw= '{' kw= '}' ) ;
    public final AntlrDatatypeRuleToken ruleTheoremBody() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1565:2: ( (kw= 'Theorems' kw= '{' kw= '}' ) )
            // InternalMyDsl.g:1566:2: (kw= 'Theorems' kw= '{' kw= '}' )
            {
            // InternalMyDsl.g:1566:2: (kw= 'Theorems' kw= '{' kw= '}' )
            // InternalMyDsl.g:1567:3: kw= 'Theorems' kw= '{' kw= '}'
            {
            kw=(Token)match(input,33,FOLLOW_8); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getTheoremBodyAccess().getTheoremsKeyword_0());
            		
            kw=(Token)match(input,14,FOLLOW_23); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getTheoremBodyAccess().getLeftCurlyBracketKeyword_1());
            		
            kw=(Token)match(input,15,FOLLOW_2); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getTheoremBodyAccess().getRightCurlyBracketKeyword_2());
            		

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


    // $ANTLR start "entryRuleExpression"
    // InternalMyDsl.g:1586:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalMyDsl.g:1586:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalMyDsl.g:1587:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalMyDsl.g:1593:1: ruleExpression returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1599:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalMyDsl.g:1600:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalMyDsl.g:1600:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalMyDsl.g:1601:3: (lv_name_0_0= RULE_ID )
            {
            // InternalMyDsl.g:1601:3: (lv_name_0_0= RULE_ID )
            // InternalMyDsl.g:1602:4: lv_name_0_0= RULE_ID
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000040002812L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000054000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000044000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000200008010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000003FF00002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00000000000A0000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000014010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000100000010L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000008000L});

}