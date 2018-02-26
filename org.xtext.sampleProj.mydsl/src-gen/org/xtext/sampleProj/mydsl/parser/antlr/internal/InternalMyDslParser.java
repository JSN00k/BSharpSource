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

                if ( (LA1_0==RULE_ID||LA1_0==11||LA1_0==17||LA1_0==20) ) {
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


    // $ANTLR start "entryRulePolyContext"
    // InternalMyDsl.g:321:1: entryRulePolyContext returns [EObject current=null] : iv_rulePolyContext= rulePolyContext EOF ;
    public final EObject entryRulePolyContext() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePolyContext = null;


        try {
            // InternalMyDsl.g:321:52: (iv_rulePolyContext= rulePolyContext EOF )
            // InternalMyDsl.g:322:2: iv_rulePolyContext= rulePolyContext EOF
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
    // InternalMyDsl.g:328:1: rulePolyContext returns [EObject current=null] : (otherlv_0= '<' ( (lv_polyTypes_1_0= rulePolyContextTypes ) )+ otherlv_2= '>' ) ;
    public final EObject rulePolyContext() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_polyTypes_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:334:2: ( (otherlv_0= '<' ( (lv_polyTypes_1_0= rulePolyContextTypes ) )+ otherlv_2= '>' ) )
            // InternalMyDsl.g:335:2: (otherlv_0= '<' ( (lv_polyTypes_1_0= rulePolyContextTypes ) )+ otherlv_2= '>' )
            {
            // InternalMyDsl.g:335:2: (otherlv_0= '<' ( (lv_polyTypes_1_0= rulePolyContextTypes ) )+ otherlv_2= '>' )
            // InternalMyDsl.g:336:3: otherlv_0= '<' ( (lv_polyTypes_1_0= rulePolyContextTypes ) )+ otherlv_2= '>'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPolyContextAccess().getLessThanSignKeyword_0());
            		
            // InternalMyDsl.g:340:3: ( (lv_polyTypes_1_0= rulePolyContextTypes ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDsl.g:341:4: (lv_polyTypes_1_0= rulePolyContextTypes )
            	    {
            	    // InternalMyDsl.g:341:4: (lv_polyTypes_1_0= rulePolyContextTypes )
            	    // InternalMyDsl.g:342:5: lv_polyTypes_1_0= rulePolyContextTypes
            	    {

            	    					newCompositeNode(grammarAccess.getPolyContextAccess().getPolyTypesPolyContextTypesParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_6);
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
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            otherlv_2=(Token)match(input,14,FOLLOW_2); 

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
    // InternalMyDsl.g:367:1: entryRulePolyContextTypes returns [EObject current=null] : iv_rulePolyContextTypes= rulePolyContextTypes EOF ;
    public final EObject entryRulePolyContextTypes() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePolyContextTypes = null;


        try {
            // InternalMyDsl.g:367:57: (iv_rulePolyContextTypes= rulePolyContextTypes EOF )
            // InternalMyDsl.g:368:2: iv_rulePolyContextTypes= rulePolyContextTypes EOF
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
    // InternalMyDsl.g:374:1: rulePolyContextTypes returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_constraints_1_0= ruleTypeConstraints ) )* ) ;
    public final EObject rulePolyContextTypes() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_constraints_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:380:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_constraints_1_0= ruleTypeConstraints ) )* ) )
            // InternalMyDsl.g:381:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_constraints_1_0= ruleTypeConstraints ) )* )
            {
            // InternalMyDsl.g:381:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_constraints_1_0= ruleTypeConstraints ) )* )
            // InternalMyDsl.g:382:3: ( (lv_name_0_0= RULE_ID ) ) ( (lv_constraints_1_0= ruleTypeConstraints ) )*
            {
            // InternalMyDsl.g:382:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalMyDsl.g:383:4: (lv_name_0_0= RULE_ID )
            {
            // InternalMyDsl.g:383:4: (lv_name_0_0= RULE_ID )
            // InternalMyDsl.g:384:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_0_0, grammarAccess.getPolyContextTypesAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPolyContextTypesRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMyDsl.g:400:3: ( (lv_constraints_1_0= ruleTypeConstraints ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==15) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyDsl.g:401:4: (lv_constraints_1_0= ruleTypeConstraints )
            	    {
            	    // InternalMyDsl.g:401:4: (lv_constraints_1_0= ruleTypeConstraints )
            	    // InternalMyDsl.g:402:5: lv_constraints_1_0= ruleTypeConstraints
            	    {

            	    					newCompositeNode(grammarAccess.getPolyContextTypesAccess().getConstraintsTypeConstraintsParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_7);
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
            	    break loop5;
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


    // $ANTLR start "entryRuleTypeConstraints"
    // InternalMyDsl.g:423:1: entryRuleTypeConstraints returns [EObject current=null] : iv_ruleTypeConstraints= ruleTypeConstraints EOF ;
    public final EObject entryRuleTypeConstraints() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeConstraints = null;


        try {
            // InternalMyDsl.g:423:56: (iv_ruleTypeConstraints= ruleTypeConstraints EOF )
            // InternalMyDsl.g:424:2: iv_ruleTypeConstraints= ruleTypeConstraints EOF
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
    // InternalMyDsl.g:430:1: ruleTypeConstraints returns [EObject current=null] : (otherlv_0= ':' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* ) ;
    public final EObject ruleTypeConstraints() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMyDsl.g:436:2: ( (otherlv_0= ':' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* ) )
            // InternalMyDsl.g:437:2: (otherlv_0= ':' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* )
            {
            // InternalMyDsl.g:437:2: (otherlv_0= ':' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* )
            // InternalMyDsl.g:438:3: otherlv_0= ':' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )*
            {
            otherlv_0=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getTypeConstraintsAccess().getColonKeyword_0());
            		
            // InternalMyDsl.g:442:3: ( (otherlv_1= RULE_ID ) )
            // InternalMyDsl.g:443:4: (otherlv_1= RULE_ID )
            {
            // InternalMyDsl.g:443:4: (otherlv_1= RULE_ID )
            // InternalMyDsl.g:444:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTypeConstraintsRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(otherlv_1, grammarAccess.getTypeConstraintsAccess().getTypeNameTypeNameCrossReference_1_0());
            				

            }


            }

            // InternalMyDsl.g:455:3: (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==16) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyDsl.g:456:4: otherlv_2= ',' ( (otherlv_3= RULE_ID ) )
            	    {
            	    otherlv_2=(Token)match(input,16,FOLLOW_4); 

            	    				newLeafNode(otherlv_2, grammarAccess.getTypeConstraintsAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalMyDsl.g:460:4: ( (otherlv_3= RULE_ID ) )
            	    // InternalMyDsl.g:461:5: (otherlv_3= RULE_ID )
            	    {
            	    // InternalMyDsl.g:461:5: (otherlv_3= RULE_ID )
            	    // InternalMyDsl.g:462:6: otherlv_3= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getTypeConstraintsRule());
            	    						}
            	    					
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_8); 

            	    						newLeafNode(otherlv_3, grammarAccess.getTypeConstraintsAccess().getTypeNameTypeNameCrossReference_2_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // InternalMyDsl.g:478:1: entryRuleTypedVariable returns [EObject current=null] : iv_ruleTypedVariable= ruleTypedVariable EOF ;
    public final EObject entryRuleTypedVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypedVariable = null;


        try {
            // InternalMyDsl.g:478:54: (iv_ruleTypedVariable= ruleTypedVariable EOF )
            // InternalMyDsl.g:479:2: iv_ruleTypedVariable= ruleTypedVariable EOF
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
    // InternalMyDsl.g:485:1: ruleTypedVariable returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_constraints_1_0= ruleTypeConstraints ) ) ) ;
    public final EObject ruleTypedVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_constraints_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:491:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_constraints_1_0= ruleTypeConstraints ) ) ) )
            // InternalMyDsl.g:492:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_constraints_1_0= ruleTypeConstraints ) ) )
            {
            // InternalMyDsl.g:492:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_constraints_1_0= ruleTypeConstraints ) ) )
            // InternalMyDsl.g:493:3: ( (lv_name_0_0= RULE_ID ) ) ( (lv_constraints_1_0= ruleTypeConstraints ) )
            {
            // InternalMyDsl.g:493:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalMyDsl.g:494:4: (lv_name_0_0= RULE_ID )
            {
            // InternalMyDsl.g:494:4: (lv_name_0_0= RULE_ID )
            // InternalMyDsl.g:495:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_9); 

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

            // InternalMyDsl.g:511:3: ( (lv_constraints_1_0= ruleTypeConstraints ) )
            // InternalMyDsl.g:512:4: (lv_constraints_1_0= ruleTypeConstraints )
            {
            // InternalMyDsl.g:512:4: (lv_constraints_1_0= ruleTypeConstraints )
            // InternalMyDsl.g:513:5: lv_constraints_1_0= ruleTypeConstraints
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


    // $ANTLR start "entryRuleTypeDeclaration"
    // InternalMyDsl.g:534:1: entryRuleTypeDeclaration returns [EObject current=null] : iv_ruleTypeDeclaration= ruleTypeDeclaration EOF ;
    public final EObject entryRuleTypeDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeDeclaration = null;


        try {
            // InternalMyDsl.g:534:56: (iv_ruleTypeDeclaration= ruleTypeDeclaration EOF )
            // InternalMyDsl.g:535:2: iv_ruleTypeDeclaration= ruleTypeDeclaration EOF
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
    // InternalMyDsl.g:541:1: ruleTypeDeclaration returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_context_1_0= ruleTypeDeclContext ) ) ) ;
    public final EObject ruleTypeDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_context_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:547:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_context_1_0= ruleTypeDeclContext ) ) ) )
            // InternalMyDsl.g:548:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_context_1_0= ruleTypeDeclContext ) ) )
            {
            // InternalMyDsl.g:548:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_context_1_0= ruleTypeDeclContext ) ) )
            // InternalMyDsl.g:549:3: ( (otherlv_0= RULE_ID ) ) ( (lv_context_1_0= ruleTypeDeclContext ) )
            {
            // InternalMyDsl.g:549:3: ( (otherlv_0= RULE_ID ) )
            // InternalMyDsl.g:550:4: (otherlv_0= RULE_ID )
            {
            // InternalMyDsl.g:550:4: (otherlv_0= RULE_ID )
            // InternalMyDsl.g:551:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTypeDeclarationRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(otherlv_0, grammarAccess.getTypeDeclarationAccess().getTypeNameTypeNameCrossReference_0_0());
            				

            }


            }

            // InternalMyDsl.g:562:3: ( (lv_context_1_0= ruleTypeDeclContext ) )
            // InternalMyDsl.g:563:4: (lv_context_1_0= ruleTypeDeclContext )
            {
            // InternalMyDsl.g:563:4: (lv_context_1_0= ruleTypeDeclContext )
            // InternalMyDsl.g:564:5: lv_context_1_0= ruleTypeDeclContext
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


    // $ANTLR start "entryRuleTypeDeclContext"
    // InternalMyDsl.g:585:1: entryRuleTypeDeclContext returns [EObject current=null] : iv_ruleTypeDeclContext= ruleTypeDeclContext EOF ;
    public final EObject entryRuleTypeDeclContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeDeclContext = null;


        try {
            // InternalMyDsl.g:585:56: (iv_ruleTypeDeclContext= ruleTypeDeclContext EOF )
            // InternalMyDsl.g:586:2: iv_ruleTypeDeclContext= ruleTypeDeclContext EOF
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
    // InternalMyDsl.g:592:1: ruleTypeDeclContext returns [EObject current=null] : (otherlv_0= '<' (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) ) otherlv_3= '>' ) ;
    public final EObject ruleTypeDeclContext() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMyDsl.g:598:2: ( (otherlv_0= '<' (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) ) otherlv_3= '>' ) )
            // InternalMyDsl.g:599:2: (otherlv_0= '<' (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) ) otherlv_3= '>' )
            {
            // InternalMyDsl.g:599:2: (otherlv_0= '<' (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) ) otherlv_3= '>' )
            // InternalMyDsl.g:600:3: otherlv_0= '<' (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) ) otherlv_3= '>'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getTypeDeclContextAccess().getLessThanSignKeyword_0());
            		
            // InternalMyDsl.g:604:3: (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )
            // InternalMyDsl.g:605:4: otherlv_1= ',' ( (otherlv_2= RULE_ID ) )
            {
            otherlv_1=(Token)match(input,16,FOLLOW_4); 

            				newLeafNode(otherlv_1, grammarAccess.getTypeDeclContextAccess().getCommaKeyword_1_0());
            			
            // InternalMyDsl.g:609:4: ( (otherlv_2= RULE_ID ) )
            // InternalMyDsl.g:610:5: (otherlv_2= RULE_ID )
            {
            // InternalMyDsl.g:610:5: (otherlv_2= RULE_ID )
            // InternalMyDsl.g:611:6: otherlv_2= RULE_ID
            {

            						if (current==null) {
            							current = createModelElement(grammarAccess.getTypeDeclContextRule());
            						}
            					
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_12); 

            						newLeafNode(otherlv_2, grammarAccess.getTypeDeclContextAccess().getTypeNameTypeNameCrossReference_1_1_0());
            					

            }


            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getTypeDeclContextAccess().getGreaterThanSignKeyword_2());
            		

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


    // $ANTLR start "entryRuleTypeName"
    // InternalMyDsl.g:631:1: entryRuleTypeName returns [EObject current=null] : iv_ruleTypeName= ruleTypeName EOF ;
    public final EObject entryRuleTypeName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeName = null;


        try {
            // InternalMyDsl.g:631:49: (iv_ruleTypeName= ruleTypeName EOF )
            // InternalMyDsl.g:632:2: iv_ruleTypeName= ruleTypeName EOF
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
    // InternalMyDsl.g:638:1: ruleTypeName returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleTypeName() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:644:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalMyDsl.g:645:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalMyDsl.g:645:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalMyDsl.g:646:3: (lv_name_0_0= RULE_ID )
            {
            // InternalMyDsl.g:646:3: (lv_name_0_0= RULE_ID )
            // InternalMyDsl.g:647:4: lv_name_0_0= RULE_ID
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


    // $ANTLR start "entryRuleFunctionName"
    // InternalMyDsl.g:666:1: entryRuleFunctionName returns [EObject current=null] : iv_ruleFunctionName= ruleFunctionName EOF ;
    public final EObject entryRuleFunctionName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionName = null;


        try {
            // InternalMyDsl.g:666:53: (iv_ruleFunctionName= ruleFunctionName EOF )
            // InternalMyDsl.g:667:2: iv_ruleFunctionName= ruleFunctionName EOF
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
    // InternalMyDsl.g:673:1: ruleFunctionName returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleFunctionName() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:679:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalMyDsl.g:680:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalMyDsl.g:680:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalMyDsl.g:681:3: (lv_name_0_0= RULE_ID )
            {
            // InternalMyDsl.g:681:3: (lv_name_0_0= RULE_ID )
            // InternalMyDsl.g:682:4: lv_name_0_0= RULE_ID
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


    // $ANTLR start "entryRuleClass"
    // InternalMyDsl.g:701:1: entryRuleClass returns [EObject current=null] : iv_ruleClass= ruleClass EOF ;
    public final EObject entryRuleClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClass = null;


        try {
            // InternalMyDsl.g:701:46: (iv_ruleClass= ruleClass EOF )
            // InternalMyDsl.g:702:2: iv_ruleClass= ruleClass EOF
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
    // InternalMyDsl.g:708:1: ruleClass returns [EObject current=null] : (otherlv_0= 'Class' ( (lv_name_1_0= ruleTypeName ) ) ( (lv_context_2_0= rulePolyContext ) )? otherlv_3= '{' ( (lv_bodyElements_4_0= ruleTypeBodyElements ) )* otherlv_5= '}' ) ;
    public final EObject ruleClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_name_1_0 = null;

        EObject lv_context_2_0 = null;

        EObject lv_bodyElements_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:714:2: ( (otherlv_0= 'Class' ( (lv_name_1_0= ruleTypeName ) ) ( (lv_context_2_0= rulePolyContext ) )? otherlv_3= '{' ( (lv_bodyElements_4_0= ruleTypeBodyElements ) )* otherlv_5= '}' ) )
            // InternalMyDsl.g:715:2: (otherlv_0= 'Class' ( (lv_name_1_0= ruleTypeName ) ) ( (lv_context_2_0= rulePolyContext ) )? otherlv_3= '{' ( (lv_bodyElements_4_0= ruleTypeBodyElements ) )* otherlv_5= '}' )
            {
            // InternalMyDsl.g:715:2: (otherlv_0= 'Class' ( (lv_name_1_0= ruleTypeName ) ) ( (lv_context_2_0= rulePolyContext ) )? otherlv_3= '{' ( (lv_bodyElements_4_0= ruleTypeBodyElements ) )* otherlv_5= '}' )
            // InternalMyDsl.g:716:3: otherlv_0= 'Class' ( (lv_name_1_0= ruleTypeName ) ) ( (lv_context_2_0= rulePolyContext ) )? otherlv_3= '{' ( (lv_bodyElements_4_0= ruleTypeBodyElements ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getClassAccess().getClassKeyword_0());
            		
            // InternalMyDsl.g:720:3: ( (lv_name_1_0= ruleTypeName ) )
            // InternalMyDsl.g:721:4: (lv_name_1_0= ruleTypeName )
            {
            // InternalMyDsl.g:721:4: (lv_name_1_0= ruleTypeName )
            // InternalMyDsl.g:722:5: lv_name_1_0= ruleTypeName
            {

            					newCompositeNode(grammarAccess.getClassAccess().getNameTypeNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_13);
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

            // InternalMyDsl.g:739:3: ( (lv_context_2_0= rulePolyContext ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==13) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:740:4: (lv_context_2_0= rulePolyContext )
                    {
                    // InternalMyDsl.g:740:4: (lv_context_2_0= rulePolyContext )
                    // InternalMyDsl.g:741:5: lv_context_2_0= rulePolyContext
                    {

                    					newCompositeNode(grammarAccess.getClassAccess().getContextPolyContextParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_14);
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

            otherlv_3=(Token)match(input,18,FOLLOW_15); 

            			newLeafNode(otherlv_3, grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyDsl.g:762:3: ( (lv_bodyElements_4_0= ruleTypeBodyElements ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID||LA8_0==23) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyDsl.g:763:4: (lv_bodyElements_4_0= ruleTypeBodyElements )
            	    {
            	    // InternalMyDsl.g:763:4: (lv_bodyElements_4_0= ruleTypeBodyElements )
            	    // InternalMyDsl.g:764:5: lv_bodyElements_4_0= ruleTypeBodyElements
            	    {

            	    					newCompositeNode(grammarAccess.getClassAccess().getBodyElementsTypeBodyElementsParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_15);
            	    lv_bodyElements_4_0=ruleTypeBodyElements();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getClassRule());
            	    					}
            	    					add(
            	    						current,
            	    						"bodyElements",
            	    						lv_bodyElements_4_0,
            	    						"org.xtext.sampleProj.mydsl.MyDsl.TypeBodyElements");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_5=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getClassAccess().getRightCurlyBracketKeyword_5());
            		

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


    // $ANTLR start "entryRuleDatatype"
    // InternalMyDsl.g:789:1: entryRuleDatatype returns [EObject current=null] : iv_ruleDatatype= ruleDatatype EOF ;
    public final EObject entryRuleDatatype() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatatype = null;


        try {
            // InternalMyDsl.g:789:49: (iv_ruleDatatype= ruleDatatype EOF )
            // InternalMyDsl.g:790:2: iv_ruleDatatype= ruleDatatype EOF
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
    // InternalMyDsl.g:796:1: ruleDatatype returns [EObject current=null] : (otherlv_0= 'Datatype' ( (lv_name_1_0= ruleTypeName ) ) ( (lv_context_2_0= rulePolyContext ) )? ( (lv_constructors_3_0= ruleDatatypeConstructor ) )* otherlv_4= '{' ( (lv_bodyElements_5_0= ruleTypeBodyElements ) )* otherlv_6= '}' ) ;
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
            // InternalMyDsl.g:802:2: ( (otherlv_0= 'Datatype' ( (lv_name_1_0= ruleTypeName ) ) ( (lv_context_2_0= rulePolyContext ) )? ( (lv_constructors_3_0= ruleDatatypeConstructor ) )* otherlv_4= '{' ( (lv_bodyElements_5_0= ruleTypeBodyElements ) )* otherlv_6= '}' ) )
            // InternalMyDsl.g:803:2: (otherlv_0= 'Datatype' ( (lv_name_1_0= ruleTypeName ) ) ( (lv_context_2_0= rulePolyContext ) )? ( (lv_constructors_3_0= ruleDatatypeConstructor ) )* otherlv_4= '{' ( (lv_bodyElements_5_0= ruleTypeBodyElements ) )* otherlv_6= '}' )
            {
            // InternalMyDsl.g:803:2: (otherlv_0= 'Datatype' ( (lv_name_1_0= ruleTypeName ) ) ( (lv_context_2_0= rulePolyContext ) )? ( (lv_constructors_3_0= ruleDatatypeConstructor ) )* otherlv_4= '{' ( (lv_bodyElements_5_0= ruleTypeBodyElements ) )* otherlv_6= '}' )
            // InternalMyDsl.g:804:3: otherlv_0= 'Datatype' ( (lv_name_1_0= ruleTypeName ) ) ( (lv_context_2_0= rulePolyContext ) )? ( (lv_constructors_3_0= ruleDatatypeConstructor ) )* otherlv_4= '{' ( (lv_bodyElements_5_0= ruleTypeBodyElements ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDatatypeAccess().getDatatypeKeyword_0());
            		
            // InternalMyDsl.g:808:3: ( (lv_name_1_0= ruleTypeName ) )
            // InternalMyDsl.g:809:4: (lv_name_1_0= ruleTypeName )
            {
            // InternalMyDsl.g:809:4: (lv_name_1_0= ruleTypeName )
            // InternalMyDsl.g:810:5: lv_name_1_0= ruleTypeName
            {

            					newCompositeNode(grammarAccess.getDatatypeAccess().getNameTypeNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_16);
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

            // InternalMyDsl.g:827:3: ( (lv_context_2_0= rulePolyContext ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==13) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:828:4: (lv_context_2_0= rulePolyContext )
                    {
                    // InternalMyDsl.g:828:4: (lv_context_2_0= rulePolyContext )
                    // InternalMyDsl.g:829:5: lv_context_2_0= rulePolyContext
                    {

                    					newCompositeNode(grammarAccess.getDatatypeAccess().getContextPolyContextParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_17);
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

            // InternalMyDsl.g:846:3: ( (lv_constructors_3_0= ruleDatatypeConstructor ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMyDsl.g:847:4: (lv_constructors_3_0= ruleDatatypeConstructor )
            	    {
            	    // InternalMyDsl.g:847:4: (lv_constructors_3_0= ruleDatatypeConstructor )
            	    // InternalMyDsl.g:848:5: lv_constructors_3_0= ruleDatatypeConstructor
            	    {

            	    					newCompositeNode(grammarAccess.getDatatypeAccess().getConstructorsDatatypeConstructorParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_17);
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
            	    break loop10;
                }
            } while (true);

            otherlv_4=(Token)match(input,18,FOLLOW_15); 

            			newLeafNode(otherlv_4, grammarAccess.getDatatypeAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalMyDsl.g:869:3: ( (lv_bodyElements_5_0= ruleTypeBodyElements ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID||LA11_0==23) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMyDsl.g:870:4: (lv_bodyElements_5_0= ruleTypeBodyElements )
            	    {
            	    // InternalMyDsl.g:870:4: (lv_bodyElements_5_0= ruleTypeBodyElements )
            	    // InternalMyDsl.g:871:5: lv_bodyElements_5_0= ruleTypeBodyElements
            	    {

            	    					newCompositeNode(grammarAccess.getDatatypeAccess().getBodyElementsTypeBodyElementsParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_15);
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
            	    break loop11;
                }
            } while (true);

            otherlv_6=(Token)match(input,19,FOLLOW_2); 

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
    // InternalMyDsl.g:896:1: entryRuleDatatypeConstructor returns [EObject current=null] : iv_ruleDatatypeConstructor= ruleDatatypeConstructor EOF ;
    public final EObject entryRuleDatatypeConstructor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatatypeConstructor = null;


        try {
            // InternalMyDsl.g:896:60: (iv_ruleDatatypeConstructor= ruleDatatypeConstructor EOF )
            // InternalMyDsl.g:897:2: iv_ruleDatatypeConstructor= ruleDatatypeConstructor EOF
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
    // InternalMyDsl.g:903:1: ruleDatatypeConstructor returns [EObject current=null] : (this_BaseConstructor_0= ruleBaseConstructor | this_Constructor_1= ruleConstructor ) ;
    public final EObject ruleDatatypeConstructor() throws RecognitionException {
        EObject current = null;

        EObject this_BaseConstructor_0 = null;

        EObject this_Constructor_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:909:2: ( (this_BaseConstructor_0= ruleBaseConstructor | this_Constructor_1= ruleConstructor ) )
            // InternalMyDsl.g:910:2: (this_BaseConstructor_0= ruleBaseConstructor | this_Constructor_1= ruleConstructor )
            {
            // InternalMyDsl.g:910:2: (this_BaseConstructor_0= ruleBaseConstructor | this_Constructor_1= ruleConstructor )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==21) ) {
                    alt12=2;
                }
                else if ( (LA12_1==EOF||LA12_1==RULE_ID||LA12_1==18) ) {
                    alt12=1;
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
                    // InternalMyDsl.g:911:3: this_BaseConstructor_0= ruleBaseConstructor
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
                    // InternalMyDsl.g:920:3: this_Constructor_1= ruleConstructor
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
    // InternalMyDsl.g:932:1: entryRuleBaseConstructor returns [EObject current=null] : iv_ruleBaseConstructor= ruleBaseConstructor EOF ;
    public final EObject entryRuleBaseConstructor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBaseConstructor = null;


        try {
            // InternalMyDsl.g:932:56: (iv_ruleBaseConstructor= ruleBaseConstructor EOF )
            // InternalMyDsl.g:933:2: iv_ruleBaseConstructor= ruleBaseConstructor EOF
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
    // InternalMyDsl.g:939:1: ruleBaseConstructor returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleBaseConstructor() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:945:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalMyDsl.g:946:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalMyDsl.g:946:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalMyDsl.g:947:3: (lv_name_0_0= RULE_ID )
            {
            // InternalMyDsl.g:947:3: (lv_name_0_0= RULE_ID )
            // InternalMyDsl.g:948:4: lv_name_0_0= RULE_ID
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
    // InternalMyDsl.g:967:1: entryRuleConstructor returns [EObject current=null] : iv_ruleConstructor= ruleConstructor EOF ;
    public final EObject entryRuleConstructor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstructor = null;


        try {
            // InternalMyDsl.g:967:52: (iv_ruleConstructor= ruleConstructor EOF )
            // InternalMyDsl.g:968:2: iv_ruleConstructor= ruleConstructor EOF
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
    // InternalMyDsl.g:974:1: ruleConstructor returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_typedVariables_2_0= ruleTypedVariable ) )* otherlv_3= ')' ) ;
    public final EObject ruleConstructor() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_typedVariables_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:980:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_typedVariables_2_0= ruleTypedVariable ) )* otherlv_3= ')' ) )
            // InternalMyDsl.g:981:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_typedVariables_2_0= ruleTypedVariable ) )* otherlv_3= ')' )
            {
            // InternalMyDsl.g:981:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_typedVariables_2_0= ruleTypedVariable ) )* otherlv_3= ')' )
            // InternalMyDsl.g:982:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_typedVariables_2_0= ruleTypedVariable ) )* otherlv_3= ')'
            {
            // InternalMyDsl.g:982:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalMyDsl.g:983:4: (lv_name_0_0= RULE_ID )
            {
            // InternalMyDsl.g:983:4: (lv_name_0_0= RULE_ID )
            // InternalMyDsl.g:984:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_18); 

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

            otherlv_1=(Token)match(input,21,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getConstructorAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMyDsl.g:1004:3: ( (lv_typedVariables_2_0= ruleTypedVariable ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMyDsl.g:1005:4: (lv_typedVariables_2_0= ruleTypedVariable )
            	    {
            	    // InternalMyDsl.g:1005:4: (lv_typedVariables_2_0= ruleTypedVariable )
            	    // InternalMyDsl.g:1006:5: lv_typedVariables_2_0= ruleTypedVariable
            	    {

            	    					newCompositeNode(grammarAccess.getConstructorAccess().getTypedVariablesTypedVariableParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_19);
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
            	    break loop13;
                }
            } while (true);

            otherlv_3=(Token)match(input,22,FOLLOW_2); 

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
    // InternalMyDsl.g:1031:1: entryRuleExtend returns [EObject current=null] : iv_ruleExtend= ruleExtend EOF ;
    public final EObject entryRuleExtend() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtend = null;


        try {
            // InternalMyDsl.g:1031:47: (iv_ruleExtend= ruleExtend EOF )
            // InternalMyDsl.g:1032:2: iv_ruleExtend= ruleExtend EOF
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
    // InternalMyDsl.g:1038:1: ruleExtend returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_extesnion_2_0= RULE_ID ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_bodyElements_5_0= ruleTypeBodyElements ) )* otherlv_6= '}' ) ;
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
            // InternalMyDsl.g:1044:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_extesnion_2_0= RULE_ID ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_bodyElements_5_0= ruleTypeBodyElements ) )* otherlv_6= '}' ) )
            // InternalMyDsl.g:1045:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_extesnion_2_0= RULE_ID ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_bodyElements_5_0= ruleTypeBodyElements ) )* otherlv_6= '}' )
            {
            // InternalMyDsl.g:1045:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_extesnion_2_0= RULE_ID ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_bodyElements_5_0= ruleTypeBodyElements ) )* otherlv_6= '}' )
            // InternalMyDsl.g:1046:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_extesnion_2_0= RULE_ID ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_bodyElements_5_0= ruleTypeBodyElements ) )* otherlv_6= '}'
            {
            // InternalMyDsl.g:1046:3: ( (otherlv_0= RULE_ID ) )
            // InternalMyDsl.g:1047:4: (otherlv_0= RULE_ID )
            {
            // InternalMyDsl.g:1047:4: (otherlv_0= RULE_ID )
            // InternalMyDsl.g:1048:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExtendRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(otherlv_0, grammarAccess.getExtendAccess().getNameTypeNameCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getExtendAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMyDsl.g:1063:3: ( (lv_extesnion_2_0= RULE_ID ) )
            // InternalMyDsl.g:1064:4: (lv_extesnion_2_0= RULE_ID )
            {
            // InternalMyDsl.g:1064:4: (lv_extesnion_2_0= RULE_ID )
            // InternalMyDsl.g:1065:5: lv_extesnion_2_0= RULE_ID
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

            otherlv_3=(Token)match(input,22,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getExtendAccess().getRightParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,18,FOLLOW_15); 

            			newLeafNode(otherlv_4, grammarAccess.getExtendAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalMyDsl.g:1089:3: ( (lv_bodyElements_5_0= ruleTypeBodyElements ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID||LA14_0==23) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMyDsl.g:1090:4: (lv_bodyElements_5_0= ruleTypeBodyElements )
            	    {
            	    // InternalMyDsl.g:1090:4: (lv_bodyElements_5_0= ruleTypeBodyElements )
            	    // InternalMyDsl.g:1091:5: lv_bodyElements_5_0= ruleTypeBodyElements
            	    {

            	    					newCompositeNode(grammarAccess.getExtendAccess().getBodyElementsTypeBodyElementsParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_15);
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
            	    break loop14;
                }
            } while (true);

            otherlv_6=(Token)match(input,19,FOLLOW_2); 

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
    // InternalMyDsl.g:1116:1: entryRuleTypeBodyElements returns [EObject current=null] : iv_ruleTypeBodyElements= ruleTypeBodyElements EOF ;
    public final EObject entryRuleTypeBodyElements() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeBodyElements = null;


        try {
            // InternalMyDsl.g:1116:57: (iv_ruleTypeBodyElements= ruleTypeBodyElements EOF )
            // InternalMyDsl.g:1117:2: iv_ruleTypeBodyElements= ruleTypeBodyElements EOF
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
    // InternalMyDsl.g:1123:1: ruleTypeBodyElements returns [EObject current=null] : ( ( (lv_functions_0_0= ruleFunctionDecl ) ) | ( (lv_theorems_1_0= ruleTheoremBody ) ) ) ;
    public final EObject ruleTypeBodyElements() throws RecognitionException {
        EObject current = null;

        EObject lv_functions_0_0 = null;

        AntlrDatatypeRuleToken lv_theorems_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1129:2: ( ( ( (lv_functions_0_0= ruleFunctionDecl ) ) | ( (lv_theorems_1_0= ruleTheoremBody ) ) ) )
            // InternalMyDsl.g:1130:2: ( ( (lv_functions_0_0= ruleFunctionDecl ) ) | ( (lv_theorems_1_0= ruleTheoremBody ) ) )
            {
            // InternalMyDsl.g:1130:2: ( ( (lv_functions_0_0= ruleFunctionDecl ) ) | ( (lv_theorems_1_0= ruleTheoremBody ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID) ) {
                alt15=1;
            }
            else if ( (LA15_0==23) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalMyDsl.g:1131:3: ( (lv_functions_0_0= ruleFunctionDecl ) )
                    {
                    // InternalMyDsl.g:1131:3: ( (lv_functions_0_0= ruleFunctionDecl ) )
                    // InternalMyDsl.g:1132:4: (lv_functions_0_0= ruleFunctionDecl )
                    {
                    // InternalMyDsl.g:1132:4: (lv_functions_0_0= ruleFunctionDecl )
                    // InternalMyDsl.g:1133:5: lv_functions_0_0= ruleFunctionDecl
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
                    // InternalMyDsl.g:1151:3: ( (lv_theorems_1_0= ruleTheoremBody ) )
                    {
                    // InternalMyDsl.g:1151:3: ( (lv_theorems_1_0= ruleTheoremBody ) )
                    // InternalMyDsl.g:1152:4: (lv_theorems_1_0= ruleTheoremBody )
                    {
                    // InternalMyDsl.g:1152:4: (lv_theorems_1_0= ruleTheoremBody )
                    // InternalMyDsl.g:1153:5: lv_theorems_1_0= ruleTheoremBody
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
    // InternalMyDsl.g:1174:1: entryRuleFunctionDecl returns [EObject current=null] : iv_ruleFunctionDecl= ruleFunctionDecl EOF ;
    public final EObject entryRuleFunctionDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionDecl = null;


        try {
            // InternalMyDsl.g:1174:53: (iv_ruleFunctionDecl= ruleFunctionDecl EOF )
            // InternalMyDsl.g:1175:2: iv_ruleFunctionDecl= ruleFunctionDecl EOF
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
    // InternalMyDsl.g:1181:1: ruleFunctionDecl returns [EObject current=null] : ( ( (lv_name_0_0= ruleFunctionName ) ) otherlv_1= '(' ( (lv_typeVariables_2_0= ruleTypedVariable ) )* otherlv_3= ')' ) ;
    public final EObject ruleFunctionDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_name_0_0 = null;

        EObject lv_typeVariables_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1187:2: ( ( ( (lv_name_0_0= ruleFunctionName ) ) otherlv_1= '(' ( (lv_typeVariables_2_0= ruleTypedVariable ) )* otherlv_3= ')' ) )
            // InternalMyDsl.g:1188:2: ( ( (lv_name_0_0= ruleFunctionName ) ) otherlv_1= '(' ( (lv_typeVariables_2_0= ruleTypedVariable ) )* otherlv_3= ')' )
            {
            // InternalMyDsl.g:1188:2: ( ( (lv_name_0_0= ruleFunctionName ) ) otherlv_1= '(' ( (lv_typeVariables_2_0= ruleTypedVariable ) )* otherlv_3= ')' )
            // InternalMyDsl.g:1189:3: ( (lv_name_0_0= ruleFunctionName ) ) otherlv_1= '(' ( (lv_typeVariables_2_0= ruleTypedVariable ) )* otherlv_3= ')'
            {
            // InternalMyDsl.g:1189:3: ( (lv_name_0_0= ruleFunctionName ) )
            // InternalMyDsl.g:1190:4: (lv_name_0_0= ruleFunctionName )
            {
            // InternalMyDsl.g:1190:4: (lv_name_0_0= ruleFunctionName )
            // InternalMyDsl.g:1191:5: lv_name_0_0= ruleFunctionName
            {

            					newCompositeNode(grammarAccess.getFunctionDeclAccess().getNameFunctionNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_18);
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

            otherlv_1=(Token)match(input,21,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getFunctionDeclAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMyDsl.g:1212:3: ( (lv_typeVariables_2_0= ruleTypedVariable ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalMyDsl.g:1213:4: (lv_typeVariables_2_0= ruleTypedVariable )
            	    {
            	    // InternalMyDsl.g:1213:4: (lv_typeVariables_2_0= ruleTypedVariable )
            	    // InternalMyDsl.g:1214:5: lv_typeVariables_2_0= ruleTypedVariable
            	    {

            	    					newCompositeNode(grammarAccess.getFunctionDeclAccess().getTypeVariablesTypedVariableParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_19);
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
            	    break loop16;
                }
            } while (true);

            otherlv_3=(Token)match(input,22,FOLLOW_2); 

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
    // InternalMyDsl.g:1239:1: entryRuleTheoremBody returns [String current=null] : iv_ruleTheoremBody= ruleTheoremBody EOF ;
    public final String entryRuleTheoremBody() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTheoremBody = null;


        try {
            // InternalMyDsl.g:1239:51: (iv_ruleTheoremBody= ruleTheoremBody EOF )
            // InternalMyDsl.g:1240:2: iv_ruleTheoremBody= ruleTheoremBody EOF
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
    // InternalMyDsl.g:1246:1: ruleTheoremBody returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Theorems' kw= '{' kw= '}' ) ;
    public final AntlrDatatypeRuleToken ruleTheoremBody() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1252:2: ( (kw= 'Theorems' kw= '{' kw= '}' ) )
            // InternalMyDsl.g:1253:2: (kw= 'Theorems' kw= '{' kw= '}' )
            {
            // InternalMyDsl.g:1253:2: (kw= 'Theorems' kw= '{' kw= '}' )
            // InternalMyDsl.g:1254:3: kw= 'Theorems' kw= '{' kw= '}'
            {
            kw=(Token)match(input,23,FOLLOW_14); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getTheoremBodyAccess().getTheoremsKeyword_0());
            		
            kw=(Token)match(input,18,FOLLOW_21); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getTheoremBodyAccess().getLeftCurlyBracketKeyword_1());
            		
            kw=(Token)match(input,19,FOLLOW_2); 

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
    // InternalMyDsl.g:1273:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalMyDsl.g:1273:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalMyDsl.g:1274:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalMyDsl.g:1280:1: ruleExpression returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1286:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalMyDsl.g:1287:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalMyDsl.g:1287:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalMyDsl.g:1288:3: (lv_name_0_0= RULE_ID )
            {
            // InternalMyDsl.g:1288:3: (lv_name_0_0= RULE_ID )
            // InternalMyDsl.g:1289:4: lv_name_0_0= RULE_ID
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000120812L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000042000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000880010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000042010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000080000L});

}