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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'^'", "':'", "'Import'", "'.'", "'Class'", "';'", "'{'", "'}'", "'<'", "'>'", "','", "'\\u00D7'", "'\\u2192'", "'\\uE102'", "'\\uE100'", "'\\u2194'", "'\\u2916'", "'\\u21F8'", "'\\u21A3'", "'\\u2900'", "'\\u21A0'", "'('", "')'", "'where'", "'Datatype'", "'|'", "'Extend'", "'INFIX'", "'match'", "'Theorems'", "'\\u03BB'", "'\\u2200'", "'\\u2203'", "'\\u00B7'", "'\\u00AC'", "'\\u21D4'", "'\\u21D2'", "'='", "'\\u2260'", "'\\u2227'", "'\\u2228'", "'Pred'", "'Instance'"
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

                if ( (LA1_0==13||LA1_0==15||LA1_0==35||LA1_0==37||LA1_0==53) ) {
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
    // InternalMyDsl.g:107:1: ruleTHM_NAME returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '^' )* kw= ':' ) ;
    public final AntlrDatatypeRuleToken ruleTHM_NAME() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:113:2: ( ( (kw= '^' )* kw= ':' ) )
            // InternalMyDsl.g:114:2: ( (kw= '^' )* kw= ':' )
            {
            // InternalMyDsl.g:114:2: ( (kw= '^' )* kw= ':' )
            // InternalMyDsl.g:115:3: (kw= '^' )* kw= ':'
            {
            // InternalMyDsl.g:115:3: (kw= '^' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==11) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:116:4: kw= '^'
            	    {
            	    kw=(Token)match(input,11,FOLLOW_4); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getTHM_NAMEAccess().getCircumflexAccentKeyword_0());
            	    			

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            kw=(Token)match(input,12,FOLLOW_2); 

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
    // InternalMyDsl.g:131:1: entryRuleTopLevel returns [EObject current=null] : iv_ruleTopLevel= ruleTopLevel EOF ;
    public final EObject entryRuleTopLevel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTopLevel = null;


        try {
            // InternalMyDsl.g:131:49: (iv_ruleTopLevel= ruleTopLevel EOF )
            // InternalMyDsl.g:132:2: iv_ruleTopLevel= ruleTopLevel EOF
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
    // InternalMyDsl.g:138:1: ruleTopLevel returns [EObject current=null] : (this_ImportStatement_0= ruleImportStatement | this_ClassDecl_1= ruleClassDecl | this_Extend_2= ruleExtend | this_Instance_3= ruleInstance ) ;
    public final EObject ruleTopLevel() throws RecognitionException {
        EObject current = null;

        EObject this_ImportStatement_0 = null;

        EObject this_ClassDecl_1 = null;

        EObject this_Extend_2 = null;

        EObject this_Instance_3 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:144:2: ( (this_ImportStatement_0= ruleImportStatement | this_ClassDecl_1= ruleClassDecl | this_Extend_2= ruleExtend | this_Instance_3= ruleInstance ) )
            // InternalMyDsl.g:145:2: (this_ImportStatement_0= ruleImportStatement | this_ClassDecl_1= ruleClassDecl | this_Extend_2= ruleExtend | this_Instance_3= ruleInstance )
            {
            // InternalMyDsl.g:145:2: (this_ImportStatement_0= ruleImportStatement | this_ClassDecl_1= ruleClassDecl | this_Extend_2= ruleExtend | this_Instance_3= ruleInstance )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt3=1;
                }
                break;
            case 15:
            case 35:
                {
                alt3=2;
                }
                break;
            case 37:
                {
                alt3=3;
                }
                break;
            case 53:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:146:3: this_ImportStatement_0= ruleImportStatement
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
                    // InternalMyDsl.g:155:3: this_ClassDecl_1= ruleClassDecl
                    {

                    			newCompositeNode(grammarAccess.getTopLevelAccess().getClassDeclParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ClassDecl_1=ruleClassDecl();

                    state._fsp--;


                    			current = this_ClassDecl_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:164:3: this_Extend_2= ruleExtend
                    {

                    			newCompositeNode(grammarAccess.getTopLevelAccess().getExtendParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Extend_2=ruleExtend();

                    state._fsp--;


                    			current = this_Extend_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:173:3: this_Instance_3= ruleInstance
                    {

                    			newCompositeNode(grammarAccess.getTopLevelAccess().getInstanceParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Instance_3=ruleInstance();

                    state._fsp--;


                    			current = this_Instance_3;
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
    // InternalMyDsl.g:185:1: entryRuleImportStatement returns [EObject current=null] : iv_ruleImportStatement= ruleImportStatement EOF ;
    public final EObject entryRuleImportStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportStatement = null;


        try {
            // InternalMyDsl.g:185:56: (iv_ruleImportStatement= ruleImportStatement EOF )
            // InternalMyDsl.g:186:2: iv_ruleImportStatement= ruleImportStatement EOF
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
    // InternalMyDsl.g:192:1: ruleImportStatement returns [EObject current=null] : (otherlv_0= 'Import' ( (lv_imports_1_0= ruleImport ) ) ) ;
    public final EObject ruleImportStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_imports_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:198:2: ( (otherlv_0= 'Import' ( (lv_imports_1_0= ruleImport ) ) ) )
            // InternalMyDsl.g:199:2: (otherlv_0= 'Import' ( (lv_imports_1_0= ruleImport ) ) )
            {
            // InternalMyDsl.g:199:2: (otherlv_0= 'Import' ( (lv_imports_1_0= ruleImport ) ) )
            // InternalMyDsl.g:200:3: otherlv_0= 'Import' ( (lv_imports_1_0= ruleImport ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getImportStatementAccess().getImportKeyword_0());
            		
            // InternalMyDsl.g:204:3: ( (lv_imports_1_0= ruleImport ) )
            // InternalMyDsl.g:205:4: (lv_imports_1_0= ruleImport )
            {
            // InternalMyDsl.g:205:4: (lv_imports_1_0= ruleImport )
            // InternalMyDsl.g:206:5: lv_imports_1_0= ruleImport
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
    // InternalMyDsl.g:227:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalMyDsl.g:227:47: (iv_ruleImport= ruleImport EOF )
            // InternalMyDsl.g:228:2: iv_ruleImport= ruleImport EOF
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
    // InternalMyDsl.g:234:1: ruleImport returns [EObject current=null] : ( ( (lv_importName_0_0= ruleImportComponent ) ) (otherlv_1= '.' ( (lv_importName_2_0= ruleImportComponent ) ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_importName_0_0 = null;

        EObject lv_importName_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:240:2: ( ( ( (lv_importName_0_0= ruleImportComponent ) ) (otherlv_1= '.' ( (lv_importName_2_0= ruleImportComponent ) ) ) ) )
            // InternalMyDsl.g:241:2: ( ( (lv_importName_0_0= ruleImportComponent ) ) (otherlv_1= '.' ( (lv_importName_2_0= ruleImportComponent ) ) ) )
            {
            // InternalMyDsl.g:241:2: ( ( (lv_importName_0_0= ruleImportComponent ) ) (otherlv_1= '.' ( (lv_importName_2_0= ruleImportComponent ) ) ) )
            // InternalMyDsl.g:242:3: ( (lv_importName_0_0= ruleImportComponent ) ) (otherlv_1= '.' ( (lv_importName_2_0= ruleImportComponent ) ) )
            {
            // InternalMyDsl.g:242:3: ( (lv_importName_0_0= ruleImportComponent ) )
            // InternalMyDsl.g:243:4: (lv_importName_0_0= ruleImportComponent )
            {
            // InternalMyDsl.g:243:4: (lv_importName_0_0= ruleImportComponent )
            // InternalMyDsl.g:244:5: lv_importName_0_0= ruleImportComponent
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

            // InternalMyDsl.g:261:3: (otherlv_1= '.' ( (lv_importName_2_0= ruleImportComponent ) ) )
            // InternalMyDsl.g:262:4: otherlv_1= '.' ( (lv_importName_2_0= ruleImportComponent ) )
            {
            otherlv_1=(Token)match(input,14,FOLLOW_5); 

            				newLeafNode(otherlv_1, grammarAccess.getImportAccess().getFullStopKeyword_1_0());
            			
            // InternalMyDsl.g:266:4: ( (lv_importName_2_0= ruleImportComponent ) )
            // InternalMyDsl.g:267:5: (lv_importName_2_0= ruleImportComponent )
            {
            // InternalMyDsl.g:267:5: (lv_importName_2_0= ruleImportComponent )
            // InternalMyDsl.g:268:6: lv_importName_2_0= ruleImportComponent
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
    // InternalMyDsl.g:290:1: entryRuleImportComponent returns [EObject current=null] : iv_ruleImportComponent= ruleImportComponent EOF ;
    public final EObject entryRuleImportComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportComponent = null;


        try {
            // InternalMyDsl.g:290:56: (iv_ruleImportComponent= ruleImportComponent EOF )
            // InternalMyDsl.g:291:2: iv_ruleImportComponent= ruleImportComponent EOF
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
    // InternalMyDsl.g:297:1: ruleImportComponent returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleImportComponent() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:303:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalMyDsl.g:304:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalMyDsl.g:304:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalMyDsl.g:305:3: (lv_name_0_0= RULE_ID )
            {
            // InternalMyDsl.g:305:3: (lv_name_0_0= RULE_ID )
            // InternalMyDsl.g:306:4: lv_name_0_0= RULE_ID
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
    // InternalMyDsl.g:325:1: entryRuleClassDecl returns [EObject current=null] : iv_ruleClassDecl= ruleClassDecl EOF ;
    public final EObject entryRuleClassDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassDecl = null;


        try {
            // InternalMyDsl.g:325:50: (iv_ruleClassDecl= ruleClassDecl EOF )
            // InternalMyDsl.g:326:2: iv_ruleClassDecl= ruleClassDecl EOF
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
    // InternalMyDsl.g:332:1: ruleClassDecl returns [EObject current=null] : (this_Class_0= ruleClass | this_Datatype_1= ruleDatatype ) ;
    public final EObject ruleClassDecl() throws RecognitionException {
        EObject current = null;

        EObject this_Class_0 = null;

        EObject this_Datatype_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:338:2: ( (this_Class_0= ruleClass | this_Datatype_1= ruleDatatype ) )
            // InternalMyDsl.g:339:2: (this_Class_0= ruleClass | this_Datatype_1= ruleDatatype )
            {
            // InternalMyDsl.g:339:2: (this_Class_0= ruleClass | this_Datatype_1= ruleDatatype )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
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
                    // InternalMyDsl.g:340:3: this_Class_0= ruleClass
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
                    // InternalMyDsl.g:349:3: this_Datatype_1= ruleDatatype
                    {

                    			newCompositeNode(grammarAccess.getClassDeclAccess().getDatatypeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Datatype_1=ruleDatatype();

                    state._fsp--;


                    			current = this_Datatype_1;
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
    // InternalMyDsl.g:361:1: entryRuleClass returns [EObject current=null] : iv_ruleClass= ruleClass EOF ;
    public final EObject entryRuleClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClass = null;


        try {
            // InternalMyDsl.g:361:46: (iv_ruleClass= ruleClass EOF )
            // InternalMyDsl.g:362:2: iv_ruleClass= ruleClass EOF
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
    // InternalMyDsl.g:368:1: ruleClass returns [EObject current=null] : (otherlv_0= 'Class' ( (lv_typeName_1_0= ruleTypeName ) ) ( (lv_context_2_0= rulePolyContext ) )? ( (lv_supertypes_3_0= ruleSuperTypeList ) )? ( (lv_varList_4_0= ruleTypeStructure ) )? ( (lv_where_5_0= ruleWhere ) )? (otherlv_6= ';' )? otherlv_7= '{' ( (lv_bodyElements_8_0= ruleTypeBodyElements ) )* otherlv_9= '}' ) ;
    public final EObject ruleClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_typeName_1_0 = null;

        EObject lv_context_2_0 = null;

        EObject lv_supertypes_3_0 = null;

        EObject lv_varList_4_0 = null;

        EObject lv_where_5_0 = null;

        EObject lv_bodyElements_8_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:374:2: ( (otherlv_0= 'Class' ( (lv_typeName_1_0= ruleTypeName ) ) ( (lv_context_2_0= rulePolyContext ) )? ( (lv_supertypes_3_0= ruleSuperTypeList ) )? ( (lv_varList_4_0= ruleTypeStructure ) )? ( (lv_where_5_0= ruleWhere ) )? (otherlv_6= ';' )? otherlv_7= '{' ( (lv_bodyElements_8_0= ruleTypeBodyElements ) )* otherlv_9= '}' ) )
            // InternalMyDsl.g:375:2: (otherlv_0= 'Class' ( (lv_typeName_1_0= ruleTypeName ) ) ( (lv_context_2_0= rulePolyContext ) )? ( (lv_supertypes_3_0= ruleSuperTypeList ) )? ( (lv_varList_4_0= ruleTypeStructure ) )? ( (lv_where_5_0= ruleWhere ) )? (otherlv_6= ';' )? otherlv_7= '{' ( (lv_bodyElements_8_0= ruleTypeBodyElements ) )* otherlv_9= '}' )
            {
            // InternalMyDsl.g:375:2: (otherlv_0= 'Class' ( (lv_typeName_1_0= ruleTypeName ) ) ( (lv_context_2_0= rulePolyContext ) )? ( (lv_supertypes_3_0= ruleSuperTypeList ) )? ( (lv_varList_4_0= ruleTypeStructure ) )? ( (lv_where_5_0= ruleWhere ) )? (otherlv_6= ';' )? otherlv_7= '{' ( (lv_bodyElements_8_0= ruleTypeBodyElements ) )* otherlv_9= '}' )
            // InternalMyDsl.g:376:3: otherlv_0= 'Class' ( (lv_typeName_1_0= ruleTypeName ) ) ( (lv_context_2_0= rulePolyContext ) )? ( (lv_supertypes_3_0= ruleSuperTypeList ) )? ( (lv_varList_4_0= ruleTypeStructure ) )? ( (lv_where_5_0= ruleWhere ) )? (otherlv_6= ';' )? otherlv_7= '{' ( (lv_bodyElements_8_0= ruleTypeBodyElements ) )* otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getClassAccess().getClassKeyword_0());
            		
            // InternalMyDsl.g:380:3: ( (lv_typeName_1_0= ruleTypeName ) )
            // InternalMyDsl.g:381:4: (lv_typeName_1_0= ruleTypeName )
            {
            // InternalMyDsl.g:381:4: (lv_typeName_1_0= ruleTypeName )
            // InternalMyDsl.g:382:5: lv_typeName_1_0= ruleTypeName
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

            // InternalMyDsl.g:399:3: ( (lv_context_2_0= rulePolyContext ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:400:4: (lv_context_2_0= rulePolyContext )
                    {
                    // InternalMyDsl.g:400:4: (lv_context_2_0= rulePolyContext )
                    // InternalMyDsl.g:401:5: lv_context_2_0= rulePolyContext
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

            // InternalMyDsl.g:418:3: ( (lv_supertypes_3_0= ruleSuperTypeList ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==12) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:419:4: (lv_supertypes_3_0= ruleSuperTypeList )
                    {
                    // InternalMyDsl.g:419:4: (lv_supertypes_3_0= ruleSuperTypeList )
                    // InternalMyDsl.g:420:5: lv_supertypes_3_0= ruleSuperTypeList
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

            // InternalMyDsl.g:437:3: ( (lv_varList_4_0= ruleTypeStructure ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==32) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:438:4: (lv_varList_4_0= ruleTypeStructure )
                    {
                    // InternalMyDsl.g:438:4: (lv_varList_4_0= ruleTypeStructure )
                    // InternalMyDsl.g:439:5: lv_varList_4_0= ruleTypeStructure
                    {

                    					newCompositeNode(grammarAccess.getClassAccess().getVarListTypeStructureParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_10);
                    lv_varList_4_0=ruleTypeStructure();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getClassRule());
                    					}
                    					set(
                    						current,
                    						"varList",
                    						lv_varList_4_0,
                    						"org.xtext.sampleProj.mydsl.MyDsl.TypeStructure");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:456:3: ( (lv_where_5_0= ruleWhere ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==34) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:457:4: (lv_where_5_0= ruleWhere )
                    {
                    // InternalMyDsl.g:457:4: (lv_where_5_0= ruleWhere )
                    // InternalMyDsl.g:458:5: lv_where_5_0= ruleWhere
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

            // InternalMyDsl.g:475:3: (otherlv_6= ';' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==16) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:476:4: otherlv_6= ';'
                    {
                    otherlv_6=(Token)match(input,16,FOLLOW_12); 

                    				newLeafNode(otherlv_6, grammarAccess.getClassAccess().getSemicolonKeyword_6());
                    			

                    }
                    break;

            }

            otherlv_7=(Token)match(input,17,FOLLOW_13); 

            			newLeafNode(otherlv_7, grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_7());
            		
            // InternalMyDsl.g:485:3: ( (lv_bodyElements_8_0= ruleTypeBodyElements ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID||LA10_0==40) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMyDsl.g:486:4: (lv_bodyElements_8_0= ruleTypeBodyElements )
            	    {
            	    // InternalMyDsl.g:486:4: (lv_bodyElements_8_0= ruleTypeBodyElements )
            	    // InternalMyDsl.g:487:5: lv_bodyElements_8_0= ruleTypeBodyElements
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

            otherlv_9=(Token)match(input,18,FOLLOW_2); 

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
    // InternalMyDsl.g:512:1: entryRuleTypeName returns [EObject current=null] : iv_ruleTypeName= ruleTypeName EOF ;
    public final EObject entryRuleTypeName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeName = null;


        try {
            // InternalMyDsl.g:512:49: (iv_ruleTypeName= ruleTypeName EOF )
            // InternalMyDsl.g:513:2: iv_ruleTypeName= ruleTypeName EOF
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
    // InternalMyDsl.g:519:1: ruleTypeName returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleTypeName() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:525:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalMyDsl.g:526:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalMyDsl.g:526:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalMyDsl.g:527:3: (lv_name_0_0= RULE_ID )
            {
            // InternalMyDsl.g:527:3: (lv_name_0_0= RULE_ID )
            // InternalMyDsl.g:528:4: lv_name_0_0= RULE_ID
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
    // InternalMyDsl.g:547:1: entryRulePolymorphicTypeName returns [EObject current=null] : iv_rulePolymorphicTypeName= rulePolymorphicTypeName EOF ;
    public final EObject entryRulePolymorphicTypeName() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePolymorphicTypeName = null;


        try {
            // InternalMyDsl.g:547:60: (iv_rulePolymorphicTypeName= rulePolymorphicTypeName EOF )
            // InternalMyDsl.g:548:2: iv_rulePolymorphicTypeName= rulePolymorphicTypeName EOF
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
    // InternalMyDsl.g:554:1: rulePolymorphicTypeName returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject rulePolymorphicTypeName() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:560:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalMyDsl.g:561:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalMyDsl.g:561:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalMyDsl.g:562:3: (lv_name_0_0= RULE_ID )
            {
            // InternalMyDsl.g:562:3: (lv_name_0_0= RULE_ID )
            // InternalMyDsl.g:563:4: lv_name_0_0= RULE_ID
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
    // InternalMyDsl.g:582:1: entryRulePolyContext returns [EObject current=null] : iv_rulePolyContext= rulePolyContext EOF ;
    public final EObject entryRulePolyContext() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePolyContext = null;


        try {
            // InternalMyDsl.g:582:52: (iv_rulePolyContext= rulePolyContext EOF )
            // InternalMyDsl.g:583:2: iv_rulePolyContext= rulePolyContext EOF
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
    // InternalMyDsl.g:589:1: rulePolyContext returns [EObject current=null] : (otherlv_0= '<' ( (lv_polyTypes_1_0= rulePolyContextTypes ) )+ otherlv_2= '>' ) ;
    public final EObject rulePolyContext() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_polyTypes_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:595:2: ( (otherlv_0= '<' ( (lv_polyTypes_1_0= rulePolyContextTypes ) )+ otherlv_2= '>' ) )
            // InternalMyDsl.g:596:2: (otherlv_0= '<' ( (lv_polyTypes_1_0= rulePolyContextTypes ) )+ otherlv_2= '>' )
            {
            // InternalMyDsl.g:596:2: (otherlv_0= '<' ( (lv_polyTypes_1_0= rulePolyContextTypes ) )+ otherlv_2= '>' )
            // InternalMyDsl.g:597:3: otherlv_0= '<' ( (lv_polyTypes_1_0= rulePolyContextTypes ) )+ otherlv_2= '>'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getPolyContextAccess().getLessThanSignKeyword_0());
            		
            // InternalMyDsl.g:601:3: ( (lv_polyTypes_1_0= rulePolyContextTypes ) )+
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
            	    // InternalMyDsl.g:602:4: (lv_polyTypes_1_0= rulePolyContextTypes )
            	    {
            	    // InternalMyDsl.g:602:4: (lv_polyTypes_1_0= rulePolyContextTypes )
            	    // InternalMyDsl.g:603:5: lv_polyTypes_1_0= rulePolyContextTypes
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

            otherlv_2=(Token)match(input,20,FOLLOW_2); 

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
    // InternalMyDsl.g:628:1: entryRulePolyContextTypes returns [EObject current=null] : iv_rulePolyContextTypes= rulePolyContextTypes EOF ;
    public final EObject entryRulePolyContextTypes() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePolyContextTypes = null;


        try {
            // InternalMyDsl.g:628:57: (iv_rulePolyContextTypes= rulePolyContextTypes EOF )
            // InternalMyDsl.g:629:2: iv_rulePolyContextTypes= rulePolyContextTypes EOF
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
    // InternalMyDsl.g:635:1: rulePolyContextTypes returns [EObject current=null] : ( ( (lv_name_0_0= rulePolymorphicTypeName ) ) ( (lv_constraints_1_0= rulePolyTypeConstraints ) )* ) ;
    public final EObject rulePolyContextTypes() throws RecognitionException {
        EObject current = null;

        EObject lv_name_0_0 = null;

        EObject lv_constraints_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:641:2: ( ( ( (lv_name_0_0= rulePolymorphicTypeName ) ) ( (lv_constraints_1_0= rulePolyTypeConstraints ) )* ) )
            // InternalMyDsl.g:642:2: ( ( (lv_name_0_0= rulePolymorphicTypeName ) ) ( (lv_constraints_1_0= rulePolyTypeConstraints ) )* )
            {
            // InternalMyDsl.g:642:2: ( ( (lv_name_0_0= rulePolymorphicTypeName ) ) ( (lv_constraints_1_0= rulePolyTypeConstraints ) )* )
            // InternalMyDsl.g:643:3: ( (lv_name_0_0= rulePolymorphicTypeName ) ) ( (lv_constraints_1_0= rulePolyTypeConstraints ) )*
            {
            // InternalMyDsl.g:643:3: ( (lv_name_0_0= rulePolymorphicTypeName ) )
            // InternalMyDsl.g:644:4: (lv_name_0_0= rulePolymorphicTypeName )
            {
            // InternalMyDsl.g:644:4: (lv_name_0_0= rulePolymorphicTypeName )
            // InternalMyDsl.g:645:5: lv_name_0_0= rulePolymorphicTypeName
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

            // InternalMyDsl.g:662:3: ( (lv_constraints_1_0= rulePolyTypeConstraints ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==12) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMyDsl.g:663:4: (lv_constraints_1_0= rulePolyTypeConstraints )
            	    {
            	    // InternalMyDsl.g:663:4: (lv_constraints_1_0= rulePolyTypeConstraints )
            	    // InternalMyDsl.g:664:5: lv_constraints_1_0= rulePolyTypeConstraints
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
    // InternalMyDsl.g:685:1: entryRulePolyTypeConstraints returns [EObject current=null] : iv_rulePolyTypeConstraints= rulePolyTypeConstraints EOF ;
    public final EObject entryRulePolyTypeConstraints() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePolyTypeConstraints = null;


        try {
            // InternalMyDsl.g:685:60: (iv_rulePolyTypeConstraints= rulePolyTypeConstraints EOF )
            // InternalMyDsl.g:686:2: iv_rulePolyTypeConstraints= rulePolyTypeConstraints EOF
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
    // InternalMyDsl.g:692:1: rulePolyTypeConstraints returns [EObject current=null] : (otherlv_0= ':' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* ) ;
    public final EObject rulePolyTypeConstraints() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMyDsl.g:698:2: ( (otherlv_0= ':' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* ) )
            // InternalMyDsl.g:699:2: (otherlv_0= ':' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* )
            {
            // InternalMyDsl.g:699:2: (otherlv_0= ':' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* )
            // InternalMyDsl.g:700:3: otherlv_0= ':' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )*
            {
            otherlv_0=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getPolyTypeConstraintsAccess().getColonKeyword_0());
            		
            // InternalMyDsl.g:704:3: ( (otherlv_1= RULE_ID ) )
            // InternalMyDsl.g:705:4: (otherlv_1= RULE_ID )
            {
            // InternalMyDsl.g:705:4: (otherlv_1= RULE_ID )
            // InternalMyDsl.g:706:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPolyTypeConstraintsRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(otherlv_1, grammarAccess.getPolyTypeConstraintsAccess().getTypeNameTypeNameCrossReference_1_0());
            				

            }


            }

            // InternalMyDsl.g:717:3: (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==21) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMyDsl.g:718:4: otherlv_2= ',' ( (otherlv_3= RULE_ID ) )
            	    {
            	    otherlv_2=(Token)match(input,21,FOLLOW_5); 

            	    				newLeafNode(otherlv_2, grammarAccess.getPolyTypeConstraintsAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalMyDsl.g:722:4: ( (otherlv_3= RULE_ID ) )
            	    // InternalMyDsl.g:723:5: (otherlv_3= RULE_ID )
            	    {
            	    // InternalMyDsl.g:723:5: (otherlv_3= RULE_ID )
            	    // InternalMyDsl.g:724:6: otherlv_3= RULE_ID
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
    // InternalMyDsl.g:740:1: entryRuleSuperTypeList returns [EObject current=null] : iv_ruleSuperTypeList= ruleSuperTypeList EOF ;
    public final EObject entryRuleSuperTypeList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSuperTypeList = null;


        try {
            // InternalMyDsl.g:740:54: (iv_ruleSuperTypeList= ruleSuperTypeList EOF )
            // InternalMyDsl.g:741:2: iv_ruleSuperTypeList= ruleSuperTypeList EOF
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
    // InternalMyDsl.g:747:1: ruleSuperTypeList returns [EObject current=null] : (otherlv_0= ':' ( (lv_superType_1_0= ruleConstructedType ) ) (otherlv_2= ',' ( (lv_superType_3_0= ruleConstructedType ) ) )* ) ;
    public final EObject ruleSuperTypeList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_superType_1_0 = null;

        EObject lv_superType_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:753:2: ( (otherlv_0= ':' ( (lv_superType_1_0= ruleConstructedType ) ) (otherlv_2= ',' ( (lv_superType_3_0= ruleConstructedType ) ) )* ) )
            // InternalMyDsl.g:754:2: (otherlv_0= ':' ( (lv_superType_1_0= ruleConstructedType ) ) (otherlv_2= ',' ( (lv_superType_3_0= ruleConstructedType ) ) )* )
            {
            // InternalMyDsl.g:754:2: (otherlv_0= ':' ( (lv_superType_1_0= ruleConstructedType ) ) (otherlv_2= ',' ( (lv_superType_3_0= ruleConstructedType ) ) )* )
            // InternalMyDsl.g:755:3: otherlv_0= ':' ( (lv_superType_1_0= ruleConstructedType ) ) (otherlv_2= ',' ( (lv_superType_3_0= ruleConstructedType ) ) )*
            {
            otherlv_0=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getSuperTypeListAccess().getColonKeyword_0());
            		
            // InternalMyDsl.g:759:3: ( (lv_superType_1_0= ruleConstructedType ) )
            // InternalMyDsl.g:760:4: (lv_superType_1_0= ruleConstructedType )
            {
            // InternalMyDsl.g:760:4: (lv_superType_1_0= ruleConstructedType )
            // InternalMyDsl.g:761:5: lv_superType_1_0= ruleConstructedType
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

            // InternalMyDsl.g:778:3: (otherlv_2= ',' ( (lv_superType_3_0= ruleConstructedType ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==21) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMyDsl.g:779:4: otherlv_2= ',' ( (lv_superType_3_0= ruleConstructedType ) )
            	    {
            	    otherlv_2=(Token)match(input,21,FOLLOW_17); 

            	    				newLeafNode(otherlv_2, grammarAccess.getSuperTypeListAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalMyDsl.g:783:4: ( (lv_superType_3_0= ruleConstructedType ) )
            	    // InternalMyDsl.g:784:5: (lv_superType_3_0= ruleConstructedType )
            	    {
            	    // InternalMyDsl.g:784:5: (lv_superType_3_0= ruleConstructedType )
            	    // InternalMyDsl.g:785:6: lv_superType_3_0= ruleConstructedType
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
    // InternalMyDsl.g:807:1: entryRuleConstructedType returns [EObject current=null] : iv_ruleConstructedType= ruleConstructedType EOF ;
    public final EObject entryRuleConstructedType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstructedType = null;


        try {
            // InternalMyDsl.g:807:56: (iv_ruleConstructedType= ruleConstructedType EOF )
            // InternalMyDsl.g:808:2: iv_ruleConstructedType= ruleConstructedType EOF
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
    // InternalMyDsl.g:814:1: ruleConstructedType returns [EObject current=null] : ( ( (lv_type_0_0= ruleTypeConstructor ) ) ( (otherlv_1= '\\u00D7' | otherlv_2= '\\u2192' | otherlv_3= '\\uE102' | otherlv_4= '\\uE100' | otherlv_5= '\\u2194' | otherlv_6= '\\u2916' | otherlv_7= '\\u21F8' | otherlv_8= '\\u21A3' | otherlv_9= '\\u2900' | otherlv_10= '\\u21A0' ) ( (lv_type_11_0= ruleConstructedType ) ) )? ) ;
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
            // InternalMyDsl.g:820:2: ( ( ( (lv_type_0_0= ruleTypeConstructor ) ) ( (otherlv_1= '\\u00D7' | otherlv_2= '\\u2192' | otherlv_3= '\\uE102' | otherlv_4= '\\uE100' | otherlv_5= '\\u2194' | otherlv_6= '\\u2916' | otherlv_7= '\\u21F8' | otherlv_8= '\\u21A3' | otherlv_9= '\\u2900' | otherlv_10= '\\u21A0' ) ( (lv_type_11_0= ruleConstructedType ) ) )? ) )
            // InternalMyDsl.g:821:2: ( ( (lv_type_0_0= ruleTypeConstructor ) ) ( (otherlv_1= '\\u00D7' | otherlv_2= '\\u2192' | otherlv_3= '\\uE102' | otherlv_4= '\\uE100' | otherlv_5= '\\u2194' | otherlv_6= '\\u2916' | otherlv_7= '\\u21F8' | otherlv_8= '\\u21A3' | otherlv_9= '\\u2900' | otherlv_10= '\\u21A0' ) ( (lv_type_11_0= ruleConstructedType ) ) )? )
            {
            // InternalMyDsl.g:821:2: ( ( (lv_type_0_0= ruleTypeConstructor ) ) ( (otherlv_1= '\\u00D7' | otherlv_2= '\\u2192' | otherlv_3= '\\uE102' | otherlv_4= '\\uE100' | otherlv_5= '\\u2194' | otherlv_6= '\\u2916' | otherlv_7= '\\u21F8' | otherlv_8= '\\u21A3' | otherlv_9= '\\u2900' | otherlv_10= '\\u21A0' ) ( (lv_type_11_0= ruleConstructedType ) ) )? )
            // InternalMyDsl.g:822:3: ( (lv_type_0_0= ruleTypeConstructor ) ) ( (otherlv_1= '\\u00D7' | otherlv_2= '\\u2192' | otherlv_3= '\\uE102' | otherlv_4= '\\uE100' | otherlv_5= '\\u2194' | otherlv_6= '\\u2916' | otherlv_7= '\\u21F8' | otherlv_8= '\\u21A3' | otherlv_9= '\\u2900' | otherlv_10= '\\u21A0' ) ( (lv_type_11_0= ruleConstructedType ) ) )?
            {
            // InternalMyDsl.g:822:3: ( (lv_type_0_0= ruleTypeConstructor ) )
            // InternalMyDsl.g:823:4: (lv_type_0_0= ruleTypeConstructor )
            {
            // InternalMyDsl.g:823:4: (lv_type_0_0= ruleTypeConstructor )
            // InternalMyDsl.g:824:5: lv_type_0_0= ruleTypeConstructor
            {

            					newCompositeNode(grammarAccess.getConstructedTypeAccess().getTypeTypeConstructorParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_18);
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

            // InternalMyDsl.g:841:3: ( (otherlv_1= '\\u00D7' | otherlv_2= '\\u2192' | otherlv_3= '\\uE102' | otherlv_4= '\\uE100' | otherlv_5= '\\u2194' | otherlv_6= '\\u2916' | otherlv_7= '\\u21F8' | otherlv_8= '\\u21A3' | otherlv_9= '\\u2900' | otherlv_10= '\\u21A0' ) ( (lv_type_11_0= ruleConstructedType ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=22 && LA16_0<=31)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMyDsl.g:842:4: (otherlv_1= '\\u00D7' | otherlv_2= '\\u2192' | otherlv_3= '\\uE102' | otherlv_4= '\\uE100' | otherlv_5= '\\u2194' | otherlv_6= '\\u2916' | otherlv_7= '\\u21F8' | otherlv_8= '\\u21A3' | otherlv_9= '\\u2900' | otherlv_10= '\\u21A0' ) ( (lv_type_11_0= ruleConstructedType ) )
                    {
                    // InternalMyDsl.g:842:4: (otherlv_1= '\\u00D7' | otherlv_2= '\\u2192' | otherlv_3= '\\uE102' | otherlv_4= '\\uE100' | otherlv_5= '\\u2194' | otherlv_6= '\\u2916' | otherlv_7= '\\u21F8' | otherlv_8= '\\u21A3' | otherlv_9= '\\u2900' | otherlv_10= '\\u21A0' )
                    int alt15=10;
                    switch ( input.LA(1) ) {
                    case 22:
                        {
                        alt15=1;
                        }
                        break;
                    case 23:
                        {
                        alt15=2;
                        }
                        break;
                    case 24:
                        {
                        alt15=3;
                        }
                        break;
                    case 25:
                        {
                        alt15=4;
                        }
                        break;
                    case 26:
                        {
                        alt15=5;
                        }
                        break;
                    case 27:
                        {
                        alt15=6;
                        }
                        break;
                    case 28:
                        {
                        alt15=7;
                        }
                        break;
                    case 29:
                        {
                        alt15=8;
                        }
                        break;
                    case 30:
                        {
                        alt15=9;
                        }
                        break;
                    case 31:
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
                            // InternalMyDsl.g:843:5: otherlv_1= '\\u00D7'
                            {
                            otherlv_1=(Token)match(input,22,FOLLOW_17); 

                            					newLeafNode(otherlv_1, grammarAccess.getConstructedTypeAccess().getMultiplicationSignKeyword_1_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalMyDsl.g:848:5: otherlv_2= '\\u2192'
                            {
                            otherlv_2=(Token)match(input,23,FOLLOW_17); 

                            					newLeafNode(otherlv_2, grammarAccess.getConstructedTypeAccess().getRightwardsArrowKeyword_1_0_1());
                            				

                            }
                            break;
                        case 3 :
                            // InternalMyDsl.g:853:5: otherlv_3= '\\uE102'
                            {
                            otherlv_3=(Token)match(input,24,FOLLOW_17); 

                            					newLeafNode(otherlv_3, grammarAccess.getConstructedTypeAccess().getPrivateUseAreaE102Keyword_1_0_2());
                            				

                            }
                            break;
                        case 4 :
                            // InternalMyDsl.g:858:5: otherlv_4= '\\uE100'
                            {
                            otherlv_4=(Token)match(input,25,FOLLOW_17); 

                            					newLeafNode(otherlv_4, grammarAccess.getConstructedTypeAccess().getPrivateUseAreaE100Keyword_1_0_3());
                            				

                            }
                            break;
                        case 5 :
                            // InternalMyDsl.g:863:5: otherlv_5= '\\u2194'
                            {
                            otherlv_5=(Token)match(input,26,FOLLOW_17); 

                            					newLeafNode(otherlv_5, grammarAccess.getConstructedTypeAccess().getLeftRightArrowKeyword_1_0_4());
                            				

                            }
                            break;
                        case 6 :
                            // InternalMyDsl.g:868:5: otherlv_6= '\\u2916'
                            {
                            otherlv_6=(Token)match(input,27,FOLLOW_17); 

                            					newLeafNode(otherlv_6, grammarAccess.getConstructedTypeAccess().getRightwardsTwoHeadedArrowWithTailKeyword_1_0_5());
                            				

                            }
                            break;
                        case 7 :
                            // InternalMyDsl.g:873:5: otherlv_7= '\\u21F8'
                            {
                            otherlv_7=(Token)match(input,28,FOLLOW_17); 

                            					newLeafNode(otherlv_7, grammarAccess.getConstructedTypeAccess().getRightwardsArrowWithVerticalStrokeKeyword_1_0_6());
                            				

                            }
                            break;
                        case 8 :
                            // InternalMyDsl.g:878:5: otherlv_8= '\\u21A3'
                            {
                            otherlv_8=(Token)match(input,29,FOLLOW_17); 

                            					newLeafNode(otherlv_8, grammarAccess.getConstructedTypeAccess().getRightwardsArrowWithTailKeyword_1_0_7());
                            				

                            }
                            break;
                        case 9 :
                            // InternalMyDsl.g:883:5: otherlv_9= '\\u2900'
                            {
                            otherlv_9=(Token)match(input,30,FOLLOW_17); 

                            					newLeafNode(otherlv_9, grammarAccess.getConstructedTypeAccess().getRightwardsTwoHeadedArrowWithVerticalStrokeKeyword_1_0_8());
                            				

                            }
                            break;
                        case 10 :
                            // InternalMyDsl.g:888:5: otherlv_10= '\\u21A0'
                            {
                            otherlv_10=(Token)match(input,31,FOLLOW_17); 

                            					newLeafNode(otherlv_10, grammarAccess.getConstructedTypeAccess().getRightwardsTwoHeadedArrowKeyword_1_0_9());
                            				

                            }
                            break;

                    }

                    // InternalMyDsl.g:893:4: ( (lv_type_11_0= ruleConstructedType ) )
                    // InternalMyDsl.g:894:5: (lv_type_11_0= ruleConstructedType )
                    {
                    // InternalMyDsl.g:894:5: (lv_type_11_0= ruleConstructedType )
                    // InternalMyDsl.g:895:6: lv_type_11_0= ruleConstructedType
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
    // InternalMyDsl.g:917:1: entryRuleTypeConstructor returns [EObject current=null] : iv_ruleTypeConstructor= ruleTypeConstructor EOF ;
    public final EObject entryRuleTypeConstructor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeConstructor = null;


        try {
            // InternalMyDsl.g:917:56: (iv_ruleTypeConstructor= ruleTypeConstructor EOF )
            // InternalMyDsl.g:918:2: iv_ruleTypeConstructor= ruleTypeConstructor EOF
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
    // InternalMyDsl.g:924:1: ruleTypeConstructor returns [EObject current=null] : ( ( ( (otherlv_0= RULE_ID ) ) | this_InbuiltTypeScan_1= ruleInbuiltTypeScan ) ( (lv_context_2_0= ruleTypeDeclContext ) )? ) ;
    public final EObject ruleTypeConstructor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_InbuiltTypeScan_1 = null;

        EObject lv_context_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:930:2: ( ( ( ( (otherlv_0= RULE_ID ) ) | this_InbuiltTypeScan_1= ruleInbuiltTypeScan ) ( (lv_context_2_0= ruleTypeDeclContext ) )? ) )
            // InternalMyDsl.g:931:2: ( ( ( (otherlv_0= RULE_ID ) ) | this_InbuiltTypeScan_1= ruleInbuiltTypeScan ) ( (lv_context_2_0= ruleTypeDeclContext ) )? )
            {
            // InternalMyDsl.g:931:2: ( ( ( (otherlv_0= RULE_ID ) ) | this_InbuiltTypeScan_1= ruleInbuiltTypeScan ) ( (lv_context_2_0= ruleTypeDeclContext ) )? )
            // InternalMyDsl.g:932:3: ( ( (otherlv_0= RULE_ID ) ) | this_InbuiltTypeScan_1= ruleInbuiltTypeScan ) ( (lv_context_2_0= ruleTypeDeclContext ) )?
            {
            // InternalMyDsl.g:932:3: ( ( (otherlv_0= RULE_ID ) ) | this_InbuiltTypeScan_1= ruleInbuiltTypeScan )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID) ) {
                alt17=1;
            }
            else if ( (LA17_0==52) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalMyDsl.g:933:4: ( (otherlv_0= RULE_ID ) )
                    {
                    // InternalMyDsl.g:933:4: ( (otherlv_0= RULE_ID ) )
                    // InternalMyDsl.g:934:5: (otherlv_0= RULE_ID )
                    {
                    // InternalMyDsl.g:934:5: (otherlv_0= RULE_ID )
                    // InternalMyDsl.g:935:6: otherlv_0= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTypeConstructorRule());
                    						}
                    					
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_19); 

                    						newLeafNode(otherlv_0, grammarAccess.getTypeConstructorAccess().getTypeNameGenNameCrossReference_0_0_0());
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:947:4: this_InbuiltTypeScan_1= ruleInbuiltTypeScan
                    {

                    				newCompositeNode(grammarAccess.getTypeConstructorAccess().getInbuiltTypeScanParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_19);
                    this_InbuiltTypeScan_1=ruleInbuiltTypeScan();

                    state._fsp--;


                    				current = this_InbuiltTypeScan_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:956:3: ( (lv_context_2_0= ruleTypeDeclContext ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==19) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalMyDsl.g:957:4: (lv_context_2_0= ruleTypeDeclContext )
                    {
                    // InternalMyDsl.g:957:4: (lv_context_2_0= ruleTypeDeclContext )
                    // InternalMyDsl.g:958:5: lv_context_2_0= ruleTypeDeclContext
                    {

                    					newCompositeNode(grammarAccess.getTypeConstructorAccess().getContextTypeDeclContextParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_context_2_0=ruleTypeDeclContext();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTypeConstructorRule());
                    					}
                    					add(
                    						current,
                    						"context",
                    						lv_context_2_0,
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
    // InternalMyDsl.g:979:1: entryRuleTypeDeclContext returns [EObject current=null] : iv_ruleTypeDeclContext= ruleTypeDeclContext EOF ;
    public final EObject entryRuleTypeDeclContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeDeclContext = null;


        try {
            // InternalMyDsl.g:979:56: (iv_ruleTypeDeclContext= ruleTypeDeclContext EOF )
            // InternalMyDsl.g:980:2: iv_ruleTypeDeclContext= ruleTypeDeclContext EOF
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
    // InternalMyDsl.g:986:1: ruleTypeDeclContext returns [EObject current=null] : (otherlv_0= '<' ( (lv_TypeName_1_0= ruleConstructedType ) ) (otherlv_2= ',' ( (lv_TypeName_3_0= ruleConstructedType ) ) )* otherlv_4= '>' ) ;
    public final EObject ruleTypeDeclContext() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_TypeName_1_0 = null;

        EObject lv_TypeName_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:992:2: ( (otherlv_0= '<' ( (lv_TypeName_1_0= ruleConstructedType ) ) (otherlv_2= ',' ( (lv_TypeName_3_0= ruleConstructedType ) ) )* otherlv_4= '>' ) )
            // InternalMyDsl.g:993:2: (otherlv_0= '<' ( (lv_TypeName_1_0= ruleConstructedType ) ) (otherlv_2= ',' ( (lv_TypeName_3_0= ruleConstructedType ) ) )* otherlv_4= '>' )
            {
            // InternalMyDsl.g:993:2: (otherlv_0= '<' ( (lv_TypeName_1_0= ruleConstructedType ) ) (otherlv_2= ',' ( (lv_TypeName_3_0= ruleConstructedType ) ) )* otherlv_4= '>' )
            // InternalMyDsl.g:994:3: otherlv_0= '<' ( (lv_TypeName_1_0= ruleConstructedType ) ) (otherlv_2= ',' ( (lv_TypeName_3_0= ruleConstructedType ) ) )* otherlv_4= '>'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getTypeDeclContextAccess().getLessThanSignKeyword_0());
            		
            // InternalMyDsl.g:998:3: ( (lv_TypeName_1_0= ruleConstructedType ) )
            // InternalMyDsl.g:999:4: (lv_TypeName_1_0= ruleConstructedType )
            {
            // InternalMyDsl.g:999:4: (lv_TypeName_1_0= ruleConstructedType )
            // InternalMyDsl.g:1000:5: lv_TypeName_1_0= ruleConstructedType
            {

            					newCompositeNode(grammarAccess.getTypeDeclContextAccess().getTypeNameConstructedTypeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_20);
            lv_TypeName_1_0=ruleConstructedType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTypeDeclContextRule());
            					}
            					add(
            						current,
            						"TypeName",
            						lv_TypeName_1_0,
            						"org.xtext.sampleProj.mydsl.MyDsl.ConstructedType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:1017:3: (otherlv_2= ',' ( (lv_TypeName_3_0= ruleConstructedType ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==21) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalMyDsl.g:1018:4: otherlv_2= ',' ( (lv_TypeName_3_0= ruleConstructedType ) )
            	    {
            	    otherlv_2=(Token)match(input,21,FOLLOW_17); 

            	    				newLeafNode(otherlv_2, grammarAccess.getTypeDeclContextAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalMyDsl.g:1022:4: ( (lv_TypeName_3_0= ruleConstructedType ) )
            	    // InternalMyDsl.g:1023:5: (lv_TypeName_3_0= ruleConstructedType )
            	    {
            	    // InternalMyDsl.g:1023:5: (lv_TypeName_3_0= ruleConstructedType )
            	    // InternalMyDsl.g:1024:6: lv_TypeName_3_0= ruleConstructedType
            	    {

            	    						newCompositeNode(grammarAccess.getTypeDeclContextAccess().getTypeNameConstructedTypeParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_20);
            	    lv_TypeName_3_0=ruleConstructedType();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTypeDeclContextRule());
            	    						}
            	    						add(
            	    							current,
            	    							"TypeName",
            	    							lv_TypeName_3_0,
            	    							"org.xtext.sampleProj.mydsl.MyDsl.ConstructedType");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            otherlv_4=(Token)match(input,20,FOLLOW_2); 

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
    // InternalMyDsl.g:1050:1: entryRuleTypeStructure returns [EObject current=null] : iv_ruleTypeStructure= ruleTypeStructure EOF ;
    public final EObject entryRuleTypeStructure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeStructure = null;


        try {
            // InternalMyDsl.g:1050:54: (iv_ruleTypeStructure= ruleTypeStructure EOF )
            // InternalMyDsl.g:1051:2: iv_ruleTypeStructure= ruleTypeStructure EOF
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
    // InternalMyDsl.g:1057:1: ruleTypeStructure returns [EObject current=null] : (otherlv_0= '(' ( (lv_variables_1_0= ruleTypedVariableList ) ) otherlv_2= ')' ) ;
    public final EObject ruleTypeStructure() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_variables_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1063:2: ( (otherlv_0= '(' ( (lv_variables_1_0= ruleTypedVariableList ) ) otherlv_2= ')' ) )
            // InternalMyDsl.g:1064:2: (otherlv_0= '(' ( (lv_variables_1_0= ruleTypedVariableList ) ) otherlv_2= ')' )
            {
            // InternalMyDsl.g:1064:2: (otherlv_0= '(' ( (lv_variables_1_0= ruleTypedVariableList ) ) otherlv_2= ')' )
            // InternalMyDsl.g:1065:3: otherlv_0= '(' ( (lv_variables_1_0= ruleTypedVariableList ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getTypeStructureAccess().getLeftParenthesisKeyword_0());
            		
            // InternalMyDsl.g:1069:3: ( (lv_variables_1_0= ruleTypedVariableList ) )
            // InternalMyDsl.g:1070:4: (lv_variables_1_0= ruleTypedVariableList )
            {
            // InternalMyDsl.g:1070:4: (lv_variables_1_0= ruleTypedVariableList )
            // InternalMyDsl.g:1071:5: lv_variables_1_0= ruleTypedVariableList
            {

            					newCompositeNode(grammarAccess.getTypeStructureAccess().getVariablesTypedVariableListParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_21);
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

            otherlv_2=(Token)match(input,33,FOLLOW_2); 

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
    // InternalMyDsl.g:1096:1: entryRuleWhere returns [EObject current=null] : iv_ruleWhere= ruleWhere EOF ;
    public final EObject entryRuleWhere() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhere = null;


        try {
            // InternalMyDsl.g:1096:46: (iv_ruleWhere= ruleWhere EOF )
            // InternalMyDsl.g:1097:2: iv_ruleWhere= ruleWhere EOF
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
    // InternalMyDsl.g:1103:1: ruleWhere returns [EObject current=null] : (otherlv_0= 'where' ( (lv_expessions_1_0= ruleQuantifier ) ) (otherlv_2= ';' ( (lv_expressions_3_0= ruleRootExpression ) ) )* ) ;
    public final EObject ruleWhere() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_expessions_1_0 = null;

        EObject lv_expressions_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1109:2: ( (otherlv_0= 'where' ( (lv_expessions_1_0= ruleQuantifier ) ) (otherlv_2= ';' ( (lv_expressions_3_0= ruleRootExpression ) ) )* ) )
            // InternalMyDsl.g:1110:2: (otherlv_0= 'where' ( (lv_expessions_1_0= ruleQuantifier ) ) (otherlv_2= ';' ( (lv_expressions_3_0= ruleRootExpression ) ) )* )
            {
            // InternalMyDsl.g:1110:2: (otherlv_0= 'where' ( (lv_expessions_1_0= ruleQuantifier ) ) (otherlv_2= ';' ( (lv_expressions_3_0= ruleRootExpression ) ) )* )
            // InternalMyDsl.g:1111:3: otherlv_0= 'where' ( (lv_expessions_1_0= ruleQuantifier ) ) (otherlv_2= ';' ( (lv_expressions_3_0= ruleRootExpression ) ) )*
            {
            otherlv_0=(Token)match(input,34,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getWhereAccess().getWhereKeyword_0());
            		
            // InternalMyDsl.g:1115:3: ( (lv_expessions_1_0= ruleQuantifier ) )
            // InternalMyDsl.g:1116:4: (lv_expessions_1_0= ruleQuantifier )
            {
            // InternalMyDsl.g:1116:4: (lv_expessions_1_0= ruleQuantifier )
            // InternalMyDsl.g:1117:5: lv_expessions_1_0= ruleQuantifier
            {

            					newCompositeNode(grammarAccess.getWhereAccess().getExpessionsQuantifierParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_23);
            lv_expessions_1_0=ruleQuantifier();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWhereRule());
            					}
            					add(
            						current,
            						"expessions",
            						lv_expessions_1_0,
            						"org.xtext.sampleProj.mydsl.MyDsl.Quantifier");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:1134:3: (otherlv_2= ';' ( (lv_expressions_3_0= ruleRootExpression ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==16) ) {
                    int LA20_1 = input.LA(2);

                    if ( (LA20_1==RULE_ID||LA20_1==32||(LA20_1>=41 && LA20_1<=43)||LA20_1==45) ) {
                        alt20=1;
                    }


                }


                switch (alt20) {
            	case 1 :
            	    // InternalMyDsl.g:1135:4: otherlv_2= ';' ( (lv_expressions_3_0= ruleRootExpression ) )
            	    {
            	    otherlv_2=(Token)match(input,16,FOLLOW_24); 

            	    				newLeafNode(otherlv_2, grammarAccess.getWhereAccess().getSemicolonKeyword_2_0());
            	    			
            	    // InternalMyDsl.g:1139:4: ( (lv_expressions_3_0= ruleRootExpression ) )
            	    // InternalMyDsl.g:1140:5: (lv_expressions_3_0= ruleRootExpression )
            	    {
            	    // InternalMyDsl.g:1140:5: (lv_expressions_3_0= ruleRootExpression )
            	    // InternalMyDsl.g:1141:6: lv_expressions_3_0= ruleRootExpression
            	    {

            	    						newCompositeNode(grammarAccess.getWhereAccess().getExpressionsRootExpressionParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_23);
            	    lv_expressions_3_0=ruleRootExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getWhereRule());
            	    						}
            	    						add(
            	    							current,
            	    							"expressions",
            	    							lv_expressions_3_0,
            	    							"org.xtext.sampleProj.mydsl.MyDsl.RootExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // InternalMyDsl.g:1163:1: entryRuleDatatype returns [EObject current=null] : iv_ruleDatatype= ruleDatatype EOF ;
    public final EObject entryRuleDatatype() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatatype = null;


        try {
            // InternalMyDsl.g:1163:49: (iv_ruleDatatype= ruleDatatype EOF )
            // InternalMyDsl.g:1164:2: iv_ruleDatatype= ruleDatatype EOF
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
    // InternalMyDsl.g:1170:1: ruleDatatype returns [EObject current=null] : (otherlv_0= 'Datatype' ( (lv_typeName_1_0= ruleTypeName ) ) ( (lv_context_2_0= rulePolyContext ) )? (otherlv_3= '|' ( (lv_varList_4_0= ruleDatatypeConstructor ) ) )+ otherlv_5= '{' ( (lv_bodyElements_6_0= ruleTypeBodyElements ) )* otherlv_7= '}' ) ;
    public final EObject ruleDatatype() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_typeName_1_0 = null;

        EObject lv_context_2_0 = null;

        EObject lv_varList_4_0 = null;

        EObject lv_bodyElements_6_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1176:2: ( (otherlv_0= 'Datatype' ( (lv_typeName_1_0= ruleTypeName ) ) ( (lv_context_2_0= rulePolyContext ) )? (otherlv_3= '|' ( (lv_varList_4_0= ruleDatatypeConstructor ) ) )+ otherlv_5= '{' ( (lv_bodyElements_6_0= ruleTypeBodyElements ) )* otherlv_7= '}' ) )
            // InternalMyDsl.g:1177:2: (otherlv_0= 'Datatype' ( (lv_typeName_1_0= ruleTypeName ) ) ( (lv_context_2_0= rulePolyContext ) )? (otherlv_3= '|' ( (lv_varList_4_0= ruleDatatypeConstructor ) ) )+ otherlv_5= '{' ( (lv_bodyElements_6_0= ruleTypeBodyElements ) )* otherlv_7= '}' )
            {
            // InternalMyDsl.g:1177:2: (otherlv_0= 'Datatype' ( (lv_typeName_1_0= ruleTypeName ) ) ( (lv_context_2_0= rulePolyContext ) )? (otherlv_3= '|' ( (lv_varList_4_0= ruleDatatypeConstructor ) ) )+ otherlv_5= '{' ( (lv_bodyElements_6_0= ruleTypeBodyElements ) )* otherlv_7= '}' )
            // InternalMyDsl.g:1178:3: otherlv_0= 'Datatype' ( (lv_typeName_1_0= ruleTypeName ) ) ( (lv_context_2_0= rulePolyContext ) )? (otherlv_3= '|' ( (lv_varList_4_0= ruleDatatypeConstructor ) ) )+ otherlv_5= '{' ( (lv_bodyElements_6_0= ruleTypeBodyElements ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getDatatypeAccess().getDatatypeKeyword_0());
            		
            // InternalMyDsl.g:1182:3: ( (lv_typeName_1_0= ruleTypeName ) )
            // InternalMyDsl.g:1183:4: (lv_typeName_1_0= ruleTypeName )
            {
            // InternalMyDsl.g:1183:4: (lv_typeName_1_0= ruleTypeName )
            // InternalMyDsl.g:1184:5: lv_typeName_1_0= ruleTypeName
            {

            					newCompositeNode(grammarAccess.getDatatypeAccess().getTypeNameTypeNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_25);
            lv_typeName_1_0=ruleTypeName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDatatypeRule());
            					}
            					set(
            						current,
            						"typeName",
            						lv_typeName_1_0,
            						"org.xtext.sampleProj.mydsl.MyDsl.TypeName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:1201:3: ( (lv_context_2_0= rulePolyContext ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==19) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalMyDsl.g:1202:4: (lv_context_2_0= rulePolyContext )
                    {
                    // InternalMyDsl.g:1202:4: (lv_context_2_0= rulePolyContext )
                    // InternalMyDsl.g:1203:5: lv_context_2_0= rulePolyContext
                    {

                    					newCompositeNode(grammarAccess.getDatatypeAccess().getContextPolyContextParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_26);
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

            // InternalMyDsl.g:1220:3: (otherlv_3= '|' ( (lv_varList_4_0= ruleDatatypeConstructor ) ) )+
            int cnt22=0;
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==36) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalMyDsl.g:1221:4: otherlv_3= '|' ( (lv_varList_4_0= ruleDatatypeConstructor ) )
            	    {
            	    otherlv_3=(Token)match(input,36,FOLLOW_5); 

            	    				newLeafNode(otherlv_3, grammarAccess.getDatatypeAccess().getVerticalLineKeyword_3_0());
            	    			
            	    // InternalMyDsl.g:1225:4: ( (lv_varList_4_0= ruleDatatypeConstructor ) )
            	    // InternalMyDsl.g:1226:5: (lv_varList_4_0= ruleDatatypeConstructor )
            	    {
            	    // InternalMyDsl.g:1226:5: (lv_varList_4_0= ruleDatatypeConstructor )
            	    // InternalMyDsl.g:1227:6: lv_varList_4_0= ruleDatatypeConstructor
            	    {

            	    						newCompositeNode(grammarAccess.getDatatypeAccess().getVarListDatatypeConstructorParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_27);
            	    lv_varList_4_0=ruleDatatypeConstructor();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDatatypeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"varList",
            	    							lv_varList_4_0,
            	    							"org.xtext.sampleProj.mydsl.MyDsl.DatatypeConstructor");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt22 >= 1 ) break loop22;
                        EarlyExitException eee =
                            new EarlyExitException(22, input);
                        throw eee;
                }
                cnt22++;
            } while (true);

            otherlv_5=(Token)match(input,17,FOLLOW_13); 

            			newLeafNode(otherlv_5, grammarAccess.getDatatypeAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalMyDsl.g:1249:3: ( (lv_bodyElements_6_0= ruleTypeBodyElements ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_ID||LA23_0==40) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalMyDsl.g:1250:4: (lv_bodyElements_6_0= ruleTypeBodyElements )
            	    {
            	    // InternalMyDsl.g:1250:4: (lv_bodyElements_6_0= ruleTypeBodyElements )
            	    // InternalMyDsl.g:1251:5: lv_bodyElements_6_0= ruleTypeBodyElements
            	    {

            	    					newCompositeNode(grammarAccess.getDatatypeAccess().getBodyElementsTypeBodyElementsParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_bodyElements_6_0=ruleTypeBodyElements();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDatatypeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"bodyElements",
            	    						lv_bodyElements_6_0,
            	    						"org.xtext.sampleProj.mydsl.MyDsl.TypeBodyElements");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            otherlv_7=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getDatatypeAccess().getRightCurlyBracketKeyword_6());
            		

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
    // InternalMyDsl.g:1276:1: entryRuleDatatypeConstructor returns [EObject current=null] : iv_ruleDatatypeConstructor= ruleDatatypeConstructor EOF ;
    public final EObject entryRuleDatatypeConstructor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatatypeConstructor = null;


        try {
            // InternalMyDsl.g:1276:60: (iv_ruleDatatypeConstructor= ruleDatatypeConstructor EOF )
            // InternalMyDsl.g:1277:2: iv_ruleDatatypeConstructor= ruleDatatypeConstructor EOF
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
    // InternalMyDsl.g:1283:1: ruleDatatypeConstructor returns [EObject current=null] : ( ( (lv_name_0_0= ruleTypedVariable ) ) (otherlv_1= '(' ( (lv_decons_2_0= ruleTypedVariableList ) ) otherlv_3= ')' )? ) ;
    public final EObject ruleDatatypeConstructor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_name_0_0 = null;

        EObject lv_decons_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1289:2: ( ( ( (lv_name_0_0= ruleTypedVariable ) ) (otherlv_1= '(' ( (lv_decons_2_0= ruleTypedVariableList ) ) otherlv_3= ')' )? ) )
            // InternalMyDsl.g:1290:2: ( ( (lv_name_0_0= ruleTypedVariable ) ) (otherlv_1= '(' ( (lv_decons_2_0= ruleTypedVariableList ) ) otherlv_3= ')' )? )
            {
            // InternalMyDsl.g:1290:2: ( ( (lv_name_0_0= ruleTypedVariable ) ) (otherlv_1= '(' ( (lv_decons_2_0= ruleTypedVariableList ) ) otherlv_3= ')' )? )
            // InternalMyDsl.g:1291:3: ( (lv_name_0_0= ruleTypedVariable ) ) (otherlv_1= '(' ( (lv_decons_2_0= ruleTypedVariableList ) ) otherlv_3= ')' )?
            {
            // InternalMyDsl.g:1291:3: ( (lv_name_0_0= ruleTypedVariable ) )
            // InternalMyDsl.g:1292:4: (lv_name_0_0= ruleTypedVariable )
            {
            // InternalMyDsl.g:1292:4: (lv_name_0_0= ruleTypedVariable )
            // InternalMyDsl.g:1293:5: lv_name_0_0= ruleTypedVariable
            {

            					newCompositeNode(grammarAccess.getDatatypeConstructorAccess().getNameTypedVariableParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_28);
            lv_name_0_0=ruleTypedVariable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDatatypeConstructorRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.xtext.sampleProj.mydsl.MyDsl.TypedVariable");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:1310:3: (otherlv_1= '(' ( (lv_decons_2_0= ruleTypedVariableList ) ) otherlv_3= ')' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==32) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalMyDsl.g:1311:4: otherlv_1= '(' ( (lv_decons_2_0= ruleTypedVariableList ) ) otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,32,FOLLOW_5); 

                    				newLeafNode(otherlv_1, grammarAccess.getDatatypeConstructorAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalMyDsl.g:1315:4: ( (lv_decons_2_0= ruleTypedVariableList ) )
                    // InternalMyDsl.g:1316:5: (lv_decons_2_0= ruleTypedVariableList )
                    {
                    // InternalMyDsl.g:1316:5: (lv_decons_2_0= ruleTypedVariableList )
                    // InternalMyDsl.g:1317:6: lv_decons_2_0= ruleTypedVariableList
                    {

                    						newCompositeNode(grammarAccess.getDatatypeConstructorAccess().getDeconsTypedVariableListParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_decons_2_0=ruleTypedVariableList();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDatatypeConstructorRule());
                    						}
                    						set(
                    							current,
                    							"decons",
                    							lv_decons_2_0,
                    							"org.xtext.sampleProj.mydsl.MyDsl.TypedVariableList");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,33,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getDatatypeConstructorAccess().getRightParenthesisKeyword_1_2());
                    			

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


    // $ANTLR start "entryRuleExtend"
    // InternalMyDsl.g:1343:1: entryRuleExtend returns [EObject current=null] : iv_ruleExtend= ruleExtend EOF ;
    public final EObject entryRuleExtend() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtend = null;


        try {
            // InternalMyDsl.g:1343:47: (iv_ruleExtend= ruleExtend EOF )
            // InternalMyDsl.g:1344:2: iv_ruleExtend= ruleExtend EOF
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
    // InternalMyDsl.g:1350:1: ruleExtend returns [EObject current=null] : (otherlv_0= 'Extend' ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_extension_3_0= RULE_ID ) ) otherlv_4= ')' otherlv_5= '{' ( (lv_bodyElements_6_0= ruleTypeBodyElements ) )* otherlv_7= '}' ) ;
    public final EObject ruleExtend() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_extension_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_bodyElements_6_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1356:2: ( (otherlv_0= 'Extend' ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_extension_3_0= RULE_ID ) ) otherlv_4= ')' otherlv_5= '{' ( (lv_bodyElements_6_0= ruleTypeBodyElements ) )* otherlv_7= '}' ) )
            // InternalMyDsl.g:1357:2: (otherlv_0= 'Extend' ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_extension_3_0= RULE_ID ) ) otherlv_4= ')' otherlv_5= '{' ( (lv_bodyElements_6_0= ruleTypeBodyElements ) )* otherlv_7= '}' )
            {
            // InternalMyDsl.g:1357:2: (otherlv_0= 'Extend' ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_extension_3_0= RULE_ID ) ) otherlv_4= ')' otherlv_5= '{' ( (lv_bodyElements_6_0= ruleTypeBodyElements ) )* otherlv_7= '}' )
            // InternalMyDsl.g:1358:3: otherlv_0= 'Extend' ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_extension_3_0= RULE_ID ) ) otherlv_4= ')' otherlv_5= '{' ( (lv_bodyElements_6_0= ruleTypeBodyElements ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getExtendAccess().getExtendKeyword_0());
            		
            // InternalMyDsl.g:1362:3: ( (otherlv_1= RULE_ID ) )
            // InternalMyDsl.g:1363:4: (otherlv_1= RULE_ID )
            {
            // InternalMyDsl.g:1363:4: (otherlv_1= RULE_ID )
            // InternalMyDsl.g:1364:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExtendRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_29); 

            					newLeafNode(otherlv_1, grammarAccess.getExtendAccess().getNameTypeNameCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,32,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getExtendAccess().getLeftParenthesisKeyword_2());
            		
            // InternalMyDsl.g:1379:3: ( (lv_extension_3_0= RULE_ID ) )
            // InternalMyDsl.g:1380:4: (lv_extension_3_0= RULE_ID )
            {
            // InternalMyDsl.g:1380:4: (lv_extension_3_0= RULE_ID )
            // InternalMyDsl.g:1381:5: lv_extension_3_0= RULE_ID
            {
            lv_extension_3_0=(Token)match(input,RULE_ID,FOLLOW_21); 

            					newLeafNode(lv_extension_3_0, grammarAccess.getExtendAccess().getExtensionIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExtendRule());
            					}
            					setWithLastConsumed(
            						current,
            						"extension",
            						lv_extension_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_4=(Token)match(input,33,FOLLOW_12); 

            			newLeafNode(otherlv_4, grammarAccess.getExtendAccess().getRightParenthesisKeyword_4());
            		
            otherlv_5=(Token)match(input,17,FOLLOW_13); 

            			newLeafNode(otherlv_5, grammarAccess.getExtendAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalMyDsl.g:1405:3: ( (lv_bodyElements_6_0= ruleTypeBodyElements ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_ID||LA25_0==40) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalMyDsl.g:1406:4: (lv_bodyElements_6_0= ruleTypeBodyElements )
            	    {
            	    // InternalMyDsl.g:1406:4: (lv_bodyElements_6_0= ruleTypeBodyElements )
            	    // InternalMyDsl.g:1407:5: lv_bodyElements_6_0= ruleTypeBodyElements
            	    {

            	    					newCompositeNode(grammarAccess.getExtendAccess().getBodyElementsTypeBodyElementsParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_bodyElements_6_0=ruleTypeBodyElements();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getExtendRule());
            	    					}
            	    					add(
            	    						current,
            	    						"bodyElements",
            	    						lv_bodyElements_6_0,
            	    						"org.xtext.sampleProj.mydsl.MyDsl.TypeBodyElements");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            otherlv_7=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getExtendAccess().getRightCurlyBracketKeyword_7());
            		

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
    // InternalMyDsl.g:1432:1: entryRuleTypeBodyElements returns [EObject current=null] : iv_ruleTypeBodyElements= ruleTypeBodyElements EOF ;
    public final EObject entryRuleTypeBodyElements() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeBodyElements = null;


        try {
            // InternalMyDsl.g:1432:57: (iv_ruleTypeBodyElements= ruleTypeBodyElements EOF )
            // InternalMyDsl.g:1433:2: iv_ruleTypeBodyElements= ruleTypeBodyElements EOF
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
    // InternalMyDsl.g:1439:1: ruleTypeBodyElements returns [EObject current=null] : ( ( (lv_functions_0_0= ruleFunctionDecl ) ) | ( (lv_theorems_1_0= ruleTheoremBody ) ) ) ;
    public final EObject ruleTypeBodyElements() throws RecognitionException {
        EObject current = null;

        EObject lv_functions_0_0 = null;

        EObject lv_theorems_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1445:2: ( ( ( (lv_functions_0_0= ruleFunctionDecl ) ) | ( (lv_theorems_1_0= ruleTheoremBody ) ) ) )
            // InternalMyDsl.g:1446:2: ( ( (lv_functions_0_0= ruleFunctionDecl ) ) | ( (lv_theorems_1_0= ruleTheoremBody ) ) )
            {
            // InternalMyDsl.g:1446:2: ( ( (lv_functions_0_0= ruleFunctionDecl ) ) | ( (lv_theorems_1_0= ruleTheoremBody ) ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_ID) ) {
                alt26=1;
            }
            else if ( (LA26_0==40) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalMyDsl.g:1447:3: ( (lv_functions_0_0= ruleFunctionDecl ) )
                    {
                    // InternalMyDsl.g:1447:3: ( (lv_functions_0_0= ruleFunctionDecl ) )
                    // InternalMyDsl.g:1448:4: (lv_functions_0_0= ruleFunctionDecl )
                    {
                    // InternalMyDsl.g:1448:4: (lv_functions_0_0= ruleFunctionDecl )
                    // InternalMyDsl.g:1449:5: lv_functions_0_0= ruleFunctionDecl
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
                    // InternalMyDsl.g:1467:3: ( (lv_theorems_1_0= ruleTheoremBody ) )
                    {
                    // InternalMyDsl.g:1467:3: ( (lv_theorems_1_0= ruleTheoremBody ) )
                    // InternalMyDsl.g:1468:4: (lv_theorems_1_0= ruleTheoremBody )
                    {
                    // InternalMyDsl.g:1468:4: (lv_theorems_1_0= ruleTheoremBody )
                    // InternalMyDsl.g:1469:5: lv_theorems_1_0= ruleTheoremBody
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
    // InternalMyDsl.g:1490:1: entryRuleFunctionDecl returns [EObject current=null] : iv_ruleFunctionDecl= ruleFunctionDecl EOF ;
    public final EObject entryRuleFunctionDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionDecl = null;


        try {
            // InternalMyDsl.g:1490:53: (iv_ruleFunctionDecl= ruleFunctionDecl EOF )
            // InternalMyDsl.g:1491:2: iv_ruleFunctionDecl= ruleFunctionDecl EOF
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
    // InternalMyDsl.g:1497:1: ruleFunctionDecl returns [EObject current=null] : ( ( (lv_name_0_0= ruleFunctionName ) ) ( (lv_context_1_0= rulePolyContext ) )? otherlv_2= '(' ( (lv_varList_3_0= ruleTypedVariableList ) )? otherlv_4= ')' otherlv_5= ':' ( (lv_returnType_6_0= ruleTypeConstructor ) ) ( (lv_infix_7_0= 'INFIX' ) )? ( (lv_precedence_8_0= RULE_INT ) )? ( (lv_body_9_0= ruleFunctionBody ) ) ) ;
    public final EObject ruleFunctionDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_infix_7_0=null;
        Token lv_precedence_8_0=null;
        EObject lv_name_0_0 = null;

        EObject lv_context_1_0 = null;

        EObject lv_varList_3_0 = null;

        EObject lv_returnType_6_0 = null;

        EObject lv_body_9_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1503:2: ( ( ( (lv_name_0_0= ruleFunctionName ) ) ( (lv_context_1_0= rulePolyContext ) )? otherlv_2= '(' ( (lv_varList_3_0= ruleTypedVariableList ) )? otherlv_4= ')' otherlv_5= ':' ( (lv_returnType_6_0= ruleTypeConstructor ) ) ( (lv_infix_7_0= 'INFIX' ) )? ( (lv_precedence_8_0= RULE_INT ) )? ( (lv_body_9_0= ruleFunctionBody ) ) ) )
            // InternalMyDsl.g:1504:2: ( ( (lv_name_0_0= ruleFunctionName ) ) ( (lv_context_1_0= rulePolyContext ) )? otherlv_2= '(' ( (lv_varList_3_0= ruleTypedVariableList ) )? otherlv_4= ')' otherlv_5= ':' ( (lv_returnType_6_0= ruleTypeConstructor ) ) ( (lv_infix_7_0= 'INFIX' ) )? ( (lv_precedence_8_0= RULE_INT ) )? ( (lv_body_9_0= ruleFunctionBody ) ) )
            {
            // InternalMyDsl.g:1504:2: ( ( (lv_name_0_0= ruleFunctionName ) ) ( (lv_context_1_0= rulePolyContext ) )? otherlv_2= '(' ( (lv_varList_3_0= ruleTypedVariableList ) )? otherlv_4= ')' otherlv_5= ':' ( (lv_returnType_6_0= ruleTypeConstructor ) ) ( (lv_infix_7_0= 'INFIX' ) )? ( (lv_precedence_8_0= RULE_INT ) )? ( (lv_body_9_0= ruleFunctionBody ) ) )
            // InternalMyDsl.g:1505:3: ( (lv_name_0_0= ruleFunctionName ) ) ( (lv_context_1_0= rulePolyContext ) )? otherlv_2= '(' ( (lv_varList_3_0= ruleTypedVariableList ) )? otherlv_4= ')' otherlv_5= ':' ( (lv_returnType_6_0= ruleTypeConstructor ) ) ( (lv_infix_7_0= 'INFIX' ) )? ( (lv_precedence_8_0= RULE_INT ) )? ( (lv_body_9_0= ruleFunctionBody ) )
            {
            // InternalMyDsl.g:1505:3: ( (lv_name_0_0= ruleFunctionName ) )
            // InternalMyDsl.g:1506:4: (lv_name_0_0= ruleFunctionName )
            {
            // InternalMyDsl.g:1506:4: (lv_name_0_0= ruleFunctionName )
            // InternalMyDsl.g:1507:5: lv_name_0_0= ruleFunctionName
            {

            					newCompositeNode(grammarAccess.getFunctionDeclAccess().getNameFunctionNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_30);
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

            // InternalMyDsl.g:1524:3: ( (lv_context_1_0= rulePolyContext ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==19) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalMyDsl.g:1525:4: (lv_context_1_0= rulePolyContext )
                    {
                    // InternalMyDsl.g:1525:4: (lv_context_1_0= rulePolyContext )
                    // InternalMyDsl.g:1526:5: lv_context_1_0= rulePolyContext
                    {

                    					newCompositeNode(grammarAccess.getFunctionDeclAccess().getContextPolyContextParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_29);
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

            otherlv_2=(Token)match(input,32,FOLLOW_31); 

            			newLeafNode(otherlv_2, grammarAccess.getFunctionDeclAccess().getLeftParenthesisKeyword_2());
            		
            // InternalMyDsl.g:1547:3: ( (lv_varList_3_0= ruleTypedVariableList ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_ID) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalMyDsl.g:1548:4: (lv_varList_3_0= ruleTypedVariableList )
                    {
                    // InternalMyDsl.g:1548:4: (lv_varList_3_0= ruleTypedVariableList )
                    // InternalMyDsl.g:1549:5: lv_varList_3_0= ruleTypedVariableList
                    {

                    					newCompositeNode(grammarAccess.getFunctionDeclAccess().getVarListTypedVariableListParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_21);
                    lv_varList_3_0=ruleTypedVariableList();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFunctionDeclRule());
                    					}
                    					set(
                    						current,
                    						"varList",
                    						lv_varList_3_0,
                    						"org.xtext.sampleProj.mydsl.MyDsl.TypedVariableList");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,33,FOLLOW_32); 

            			newLeafNode(otherlv_4, grammarAccess.getFunctionDeclAccess().getRightParenthesisKeyword_4());
            		
            otherlv_5=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_5, grammarAccess.getFunctionDeclAccess().getColonKeyword_5());
            		
            // InternalMyDsl.g:1574:3: ( (lv_returnType_6_0= ruleTypeConstructor ) )
            // InternalMyDsl.g:1575:4: (lv_returnType_6_0= ruleTypeConstructor )
            {
            // InternalMyDsl.g:1575:4: (lv_returnType_6_0= ruleTypeConstructor )
            // InternalMyDsl.g:1576:5: lv_returnType_6_0= ruleTypeConstructor
            {

            					newCompositeNode(grammarAccess.getFunctionDeclAccess().getReturnTypeTypeConstructorParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_33);
            lv_returnType_6_0=ruleTypeConstructor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFunctionDeclRule());
            					}
            					set(
            						current,
            						"returnType",
            						lv_returnType_6_0,
            						"org.xtext.sampleProj.mydsl.MyDsl.TypeConstructor");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:1593:3: ( (lv_infix_7_0= 'INFIX' ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==38) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalMyDsl.g:1594:4: (lv_infix_7_0= 'INFIX' )
                    {
                    // InternalMyDsl.g:1594:4: (lv_infix_7_0= 'INFIX' )
                    // InternalMyDsl.g:1595:5: lv_infix_7_0= 'INFIX'
                    {
                    lv_infix_7_0=(Token)match(input,38,FOLLOW_33); 

                    					newLeafNode(lv_infix_7_0, grammarAccess.getFunctionDeclAccess().getInfixINFIXKeyword_7_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFunctionDeclRule());
                    					}
                    					setWithLastConsumed(current, "infix", lv_infix_7_0, "INFIX");
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1607:3: ( (lv_precedence_8_0= RULE_INT ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_INT) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalMyDsl.g:1608:4: (lv_precedence_8_0= RULE_INT )
                    {
                    // InternalMyDsl.g:1608:4: (lv_precedence_8_0= RULE_INT )
                    // InternalMyDsl.g:1609:5: lv_precedence_8_0= RULE_INT
                    {
                    lv_precedence_8_0=(Token)match(input,RULE_INT,FOLLOW_33); 

                    					newLeafNode(lv_precedence_8_0, grammarAccess.getFunctionDeclAccess().getPrecedenceINTTerminalRuleCall_8_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFunctionDeclRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"precedence",
                    						lv_precedence_8_0,
                    						"org.eclipse.xtext.common.Terminals.INT");
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1625:3: ( (lv_body_9_0= ruleFunctionBody ) )
            // InternalMyDsl.g:1626:4: (lv_body_9_0= ruleFunctionBody )
            {
            // InternalMyDsl.g:1626:4: (lv_body_9_0= ruleFunctionBody )
            // InternalMyDsl.g:1627:5: lv_body_9_0= ruleFunctionBody
            {

            					newCompositeNode(grammarAccess.getFunctionDeclAccess().getBodyFunctionBodyParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_2);
            lv_body_9_0=ruleFunctionBody();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFunctionDeclRule());
            					}
            					set(
            						current,
            						"body",
            						lv_body_9_0,
            						"org.xtext.sampleProj.mydsl.MyDsl.FunctionBody");
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


    // $ANTLR start "entryRuleFunctionName"
    // InternalMyDsl.g:1648:1: entryRuleFunctionName returns [EObject current=null] : iv_ruleFunctionName= ruleFunctionName EOF ;
    public final EObject entryRuleFunctionName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionName = null;


        try {
            // InternalMyDsl.g:1648:53: (iv_ruleFunctionName= ruleFunctionName EOF )
            // InternalMyDsl.g:1649:2: iv_ruleFunctionName= ruleFunctionName EOF
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
    // InternalMyDsl.g:1655:1: ruleFunctionName returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleFunctionName() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1661:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalMyDsl.g:1662:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalMyDsl.g:1662:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalMyDsl.g:1663:3: (lv_name_0_0= RULE_ID )
            {
            // InternalMyDsl.g:1663:3: (lv_name_0_0= RULE_ID )
            // InternalMyDsl.g:1664:4: lv_name_0_0= RULE_ID
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


    // $ANTLR start "entryRuleFunctionBody"
    // InternalMyDsl.g:1683:1: entryRuleFunctionBody returns [EObject current=null] : iv_ruleFunctionBody= ruleFunctionBody EOF ;
    public final EObject entryRuleFunctionBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionBody = null;


        try {
            // InternalMyDsl.g:1683:53: (iv_ruleFunctionBody= ruleFunctionBody EOF )
            // InternalMyDsl.g:1684:2: iv_ruleFunctionBody= ruleFunctionBody EOF
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
    // InternalMyDsl.g:1690:1: ruleFunctionBody returns [EObject current=null] : (this_FuncInductive_0= ruleFuncInductive | this_FuncDirectDef_1= ruleFuncDirectDef ) ;
    public final EObject ruleFunctionBody() throws RecognitionException {
        EObject current = null;

        EObject this_FuncInductive_0 = null;

        EObject this_FuncDirectDef_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1696:2: ( (this_FuncInductive_0= ruleFuncInductive | this_FuncDirectDef_1= ruleFuncDirectDef ) )
            // InternalMyDsl.g:1697:2: (this_FuncInductive_0= ruleFuncInductive | this_FuncDirectDef_1= ruleFuncDirectDef )
            {
            // InternalMyDsl.g:1697:2: (this_FuncInductive_0= ruleFuncInductive | this_FuncDirectDef_1= ruleFuncDirectDef )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==39) ) {
                alt31=1;
            }
            else if ( (LA31_0==RULE_ID||LA31_0==32||(LA31_0>=41 && LA31_0<=43)||LA31_0==45) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // InternalMyDsl.g:1698:3: this_FuncInductive_0= ruleFuncInductive
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
                    // InternalMyDsl.g:1707:3: this_FuncDirectDef_1= ruleFuncDirectDef
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
    // InternalMyDsl.g:1719:1: entryRuleFuncDirectDef returns [EObject current=null] : iv_ruleFuncDirectDef= ruleFuncDirectDef EOF ;
    public final EObject entryRuleFuncDirectDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuncDirectDef = null;


        try {
            // InternalMyDsl.g:1719:54: (iv_ruleFuncDirectDef= ruleFuncDirectDef EOF )
            // InternalMyDsl.g:1720:2: iv_ruleFuncDirectDef= ruleFuncDirectDef EOF
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
    // InternalMyDsl.g:1726:1: ruleFuncDirectDef returns [EObject current=null] : ( (lv_expression_0_0= ruleRootExpression ) ) ;
    public final EObject ruleFuncDirectDef() throws RecognitionException {
        EObject current = null;

        EObject lv_expression_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1732:2: ( ( (lv_expression_0_0= ruleRootExpression ) ) )
            // InternalMyDsl.g:1733:2: ( (lv_expression_0_0= ruleRootExpression ) )
            {
            // InternalMyDsl.g:1733:2: ( (lv_expression_0_0= ruleRootExpression ) )
            // InternalMyDsl.g:1734:3: (lv_expression_0_0= ruleRootExpression )
            {
            // InternalMyDsl.g:1734:3: (lv_expression_0_0= ruleRootExpression )
            // InternalMyDsl.g:1735:4: lv_expression_0_0= ruleRootExpression
            {

            				newCompositeNode(grammarAccess.getFuncDirectDefAccess().getExpressionRootExpressionParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_expression_0_0=ruleRootExpression();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getFuncDirectDefRule());
            				}
            				set(
            					current,
            					"expression",
            					lv_expression_0_0,
            					"org.xtext.sampleProj.mydsl.MyDsl.RootExpression");
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
    // InternalMyDsl.g:1755:1: entryRuleFuncInductive returns [EObject current=null] : iv_ruleFuncInductive= ruleFuncInductive EOF ;
    public final EObject entryRuleFuncInductive() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuncInductive = null;


        try {
            // InternalMyDsl.g:1755:54: (iv_ruleFuncInductive= ruleFuncInductive EOF )
            // InternalMyDsl.g:1756:2: iv_ruleFuncInductive= ruleFuncInductive EOF
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
    // InternalMyDsl.g:1762:1: ruleFuncInductive returns [EObject current=null] : (otherlv_0= 'match' ( (otherlv_1= RULE_ID ) ) ( (lv_inductCase_2_0= ruleFuncInductiveCase ) ) ( (lv_inductCase_3_0= ruleFuncInductiveCase ) )* ) ;
    public final EObject ruleFuncInductive() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_inductCase_2_0 = null;

        EObject lv_inductCase_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1768:2: ( (otherlv_0= 'match' ( (otherlv_1= RULE_ID ) ) ( (lv_inductCase_2_0= ruleFuncInductiveCase ) ) ( (lv_inductCase_3_0= ruleFuncInductiveCase ) )* ) )
            // InternalMyDsl.g:1769:2: (otherlv_0= 'match' ( (otherlv_1= RULE_ID ) ) ( (lv_inductCase_2_0= ruleFuncInductiveCase ) ) ( (lv_inductCase_3_0= ruleFuncInductiveCase ) )* )
            {
            // InternalMyDsl.g:1769:2: (otherlv_0= 'match' ( (otherlv_1= RULE_ID ) ) ( (lv_inductCase_2_0= ruleFuncInductiveCase ) ) ( (lv_inductCase_3_0= ruleFuncInductiveCase ) )* )
            // InternalMyDsl.g:1770:3: otherlv_0= 'match' ( (otherlv_1= RULE_ID ) ) ( (lv_inductCase_2_0= ruleFuncInductiveCase ) ) ( (lv_inductCase_3_0= ruleFuncInductiveCase ) )*
            {
            otherlv_0=(Token)match(input,39,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getFuncInductiveAccess().getMatchKeyword_0());
            		
            // InternalMyDsl.g:1774:3: ( (otherlv_1= RULE_ID ) )
            // InternalMyDsl.g:1775:4: (otherlv_1= RULE_ID )
            {
            // InternalMyDsl.g:1775:4: (otherlv_1= RULE_ID )
            // InternalMyDsl.g:1776:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFuncInductiveRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_26); 

            					newLeafNode(otherlv_1, grammarAccess.getFuncInductiveAccess().getVariableNameTypedVariableCrossReference_1_0());
            				

            }


            }

            // InternalMyDsl.g:1787:3: ( (lv_inductCase_2_0= ruleFuncInductiveCase ) )
            // InternalMyDsl.g:1788:4: (lv_inductCase_2_0= ruleFuncInductiveCase )
            {
            // InternalMyDsl.g:1788:4: (lv_inductCase_2_0= ruleFuncInductiveCase )
            // InternalMyDsl.g:1789:5: lv_inductCase_2_0= ruleFuncInductiveCase
            {

            					newCompositeNode(grammarAccess.getFuncInductiveAccess().getInductCaseFuncInductiveCaseParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_34);
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

            // InternalMyDsl.g:1806:3: ( (lv_inductCase_3_0= ruleFuncInductiveCase ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==36) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalMyDsl.g:1807:4: (lv_inductCase_3_0= ruleFuncInductiveCase )
            	    {
            	    // InternalMyDsl.g:1807:4: (lv_inductCase_3_0= ruleFuncInductiveCase )
            	    // InternalMyDsl.g:1808:5: lv_inductCase_3_0= ruleFuncInductiveCase
            	    {

            	    					newCompositeNode(grammarAccess.getFuncInductiveAccess().getInductCaseFuncInductiveCaseParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_34);
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
            	    break loop32;
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
    // InternalMyDsl.g:1829:1: entryRuleFuncInductiveCase returns [EObject current=null] : iv_ruleFuncInductiveCase= ruleFuncInductiveCase EOF ;
    public final EObject entryRuleFuncInductiveCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuncInductiveCase = null;


        try {
            // InternalMyDsl.g:1829:58: (iv_ruleFuncInductiveCase= ruleFuncInductiveCase EOF )
            // InternalMyDsl.g:1830:2: iv_ruleFuncInductiveCase= ruleFuncInductiveCase EOF
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
    // InternalMyDsl.g:1836:1: ruleFuncInductiveCase returns [EObject current=null] : (otherlv_0= '|' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( (lv_variables_3_0= ruleTypedVariable ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleTypedVariable ) ) )* otherlv_6= ')' )? otherlv_7= ':' ( (lv_expr_8_0= ruleRootExpression ) ) ) ;
    public final EObject ruleFuncInductiveCase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_variables_3_0 = null;

        EObject lv_variables_5_0 = null;

        EObject lv_expr_8_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1842:2: ( (otherlv_0= '|' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( (lv_variables_3_0= ruleTypedVariable ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleTypedVariable ) ) )* otherlv_6= ')' )? otherlv_7= ':' ( (lv_expr_8_0= ruleRootExpression ) ) ) )
            // InternalMyDsl.g:1843:2: (otherlv_0= '|' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( (lv_variables_3_0= ruleTypedVariable ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleTypedVariable ) ) )* otherlv_6= ')' )? otherlv_7= ':' ( (lv_expr_8_0= ruleRootExpression ) ) )
            {
            // InternalMyDsl.g:1843:2: (otherlv_0= '|' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( (lv_variables_3_0= ruleTypedVariable ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleTypedVariable ) ) )* otherlv_6= ')' )? otherlv_7= ':' ( (lv_expr_8_0= ruleRootExpression ) ) )
            // InternalMyDsl.g:1844:3: otherlv_0= '|' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( (lv_variables_3_0= ruleTypedVariable ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleTypedVariable ) ) )* otherlv_6= ')' )? otherlv_7= ':' ( (lv_expr_8_0= ruleRootExpression ) )
            {
            otherlv_0=(Token)match(input,36,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getFuncInductiveCaseAccess().getVerticalLineKeyword_0());
            		
            // InternalMyDsl.g:1848:3: ( (otherlv_1= RULE_ID ) )
            // InternalMyDsl.g:1849:4: (otherlv_1= RULE_ID )
            {
            // InternalMyDsl.g:1849:4: (otherlv_1= RULE_ID )
            // InternalMyDsl.g:1850:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFuncInductiveCaseRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_35); 

            					newLeafNode(otherlv_1, grammarAccess.getFuncInductiveCaseAccess().getDeconNameDatatypeConstructorCrossReference_1_0());
            				

            }


            }

            // InternalMyDsl.g:1861:3: (otherlv_2= '(' ( (lv_variables_3_0= ruleTypedVariable ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleTypedVariable ) ) )* otherlv_6= ')' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==32) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalMyDsl.g:1862:4: otherlv_2= '(' ( (lv_variables_3_0= ruleTypedVariable ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleTypedVariable ) ) )* otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,32,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getFuncInductiveCaseAccess().getLeftParenthesisKeyword_2_0());
                    			
                    // InternalMyDsl.g:1866:4: ( (lv_variables_3_0= ruleTypedVariable ) )
                    // InternalMyDsl.g:1867:5: (lv_variables_3_0= ruleTypedVariable )
                    {
                    // InternalMyDsl.g:1867:5: (lv_variables_3_0= ruleTypedVariable )
                    // InternalMyDsl.g:1868:6: lv_variables_3_0= ruleTypedVariable
                    {

                    						newCompositeNode(grammarAccess.getFuncInductiveCaseAccess().getVariablesTypedVariableParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_36);
                    lv_variables_3_0=ruleTypedVariable();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFuncInductiveCaseRule());
                    						}
                    						add(
                    							current,
                    							"variables",
                    							lv_variables_3_0,
                    							"org.xtext.sampleProj.mydsl.MyDsl.TypedVariable");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:1885:4: (otherlv_4= ',' ( (lv_variables_5_0= ruleTypedVariable ) ) )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==21) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // InternalMyDsl.g:1886:5: otherlv_4= ',' ( (lv_variables_5_0= ruleTypedVariable ) )
                    	    {
                    	    otherlv_4=(Token)match(input,21,FOLLOW_5); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getFuncInductiveCaseAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalMyDsl.g:1890:5: ( (lv_variables_5_0= ruleTypedVariable ) )
                    	    // InternalMyDsl.g:1891:6: (lv_variables_5_0= ruleTypedVariable )
                    	    {
                    	    // InternalMyDsl.g:1891:6: (lv_variables_5_0= ruleTypedVariable )
                    	    // InternalMyDsl.g:1892:7: lv_variables_5_0= ruleTypedVariable
                    	    {

                    	    							newCompositeNode(grammarAccess.getFuncInductiveCaseAccess().getVariablesTypedVariableParserRuleCall_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_36);
                    	    lv_variables_5_0=ruleTypedVariable();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getFuncInductiveCaseRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"variables",
                    	    								lv_variables_5_0,
                    	    								"org.xtext.sampleProj.mydsl.MyDsl.TypedVariable");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop33;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,33,FOLLOW_32); 

                    				newLeafNode(otherlv_6, grammarAccess.getFuncInductiveCaseAccess().getRightParenthesisKeyword_2_3());
                    			

                    }
                    break;

            }

            otherlv_7=(Token)match(input,12,FOLLOW_24); 

            			newLeafNode(otherlv_7, grammarAccess.getFuncInductiveCaseAccess().getColonKeyword_3());
            		
            // InternalMyDsl.g:1919:3: ( (lv_expr_8_0= ruleRootExpression ) )
            // InternalMyDsl.g:1920:4: (lv_expr_8_0= ruleRootExpression )
            {
            // InternalMyDsl.g:1920:4: (lv_expr_8_0= ruleRootExpression )
            // InternalMyDsl.g:1921:5: lv_expr_8_0= ruleRootExpression
            {

            					newCompositeNode(grammarAccess.getFuncInductiveCaseAccess().getExprRootExpressionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_expr_8_0=ruleRootExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFuncInductiveCaseRule());
            					}
            					set(
            						current,
            						"expr",
            						lv_expr_8_0,
            						"org.xtext.sampleProj.mydsl.MyDsl.RootExpression");
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
    // InternalMyDsl.g:1942:1: entryRuleTheoremBody returns [EObject current=null] : iv_ruleTheoremBody= ruleTheoremBody EOF ;
    public final EObject entryRuleTheoremBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTheoremBody = null;


        try {
            // InternalMyDsl.g:1942:52: (iv_ruleTheoremBody= ruleTheoremBody EOF )
            // InternalMyDsl.g:1943:2: iv_ruleTheoremBody= ruleTheoremBody EOF
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
    // InternalMyDsl.g:1949:1: ruleTheoremBody returns [EObject current=null] : (otherlv_0= 'Theorems' otherlv_1= '{' ( (lv_theoremDecl_2_0= ruleTheoremDecl ) )+ otherlv_3= '}' ) ;
    public final EObject ruleTheoremBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_theoremDecl_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1955:2: ( (otherlv_0= 'Theorems' otherlv_1= '{' ( (lv_theoremDecl_2_0= ruleTheoremDecl ) )+ otherlv_3= '}' ) )
            // InternalMyDsl.g:1956:2: (otherlv_0= 'Theorems' otherlv_1= '{' ( (lv_theoremDecl_2_0= ruleTheoremDecl ) )+ otherlv_3= '}' )
            {
            // InternalMyDsl.g:1956:2: (otherlv_0= 'Theorems' otherlv_1= '{' ( (lv_theoremDecl_2_0= ruleTheoremDecl ) )+ otherlv_3= '}' )
            // InternalMyDsl.g:1957:3: otherlv_0= 'Theorems' otherlv_1= '{' ( (lv_theoremDecl_2_0= ruleTheoremDecl ) )+ otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getTheoremBodyAccess().getTheoremsKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getTheoremBodyAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalMyDsl.g:1965:3: ( (lv_theoremDecl_2_0= ruleTheoremDecl ) )+
            int cnt35=0;
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( ((LA35_0>=11 && LA35_0<=12)) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalMyDsl.g:1966:4: (lv_theoremDecl_2_0= ruleTheoremDecl )
            	    {
            	    // InternalMyDsl.g:1966:4: (lv_theoremDecl_2_0= ruleTheoremDecl )
            	    // InternalMyDsl.g:1967:5: lv_theoremDecl_2_0= ruleTheoremDecl
            	    {

            	    					newCompositeNode(grammarAccess.getTheoremBodyAccess().getTheoremDeclTheoremDeclParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_37);
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
            	    if ( cnt35 >= 1 ) break loop35;
                        EarlyExitException eee =
                            new EarlyExitException(35, input);
                        throw eee;
                }
                cnt35++;
            } while (true);

            otherlv_3=(Token)match(input,18,FOLLOW_2); 

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
    // InternalMyDsl.g:1992:1: entryRuleTheoremDecl returns [EObject current=null] : iv_ruleTheoremDecl= ruleTheoremDecl EOF ;
    public final EObject entryRuleTheoremDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTheoremDecl = null;


        try {
            // InternalMyDsl.g:1992:52: (iv_ruleTheoremDecl= ruleTheoremDecl EOF )
            // InternalMyDsl.g:1993:2: iv_ruleTheoremDecl= ruleTheoremDecl EOF
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
    // InternalMyDsl.g:1999:1: ruleTheoremDecl returns [EObject current=null] : ( ( (lv_thmName_0_0= ruleTHM_NAME ) ) ( (lv_expr_1_0= ruleRootExpression ) ) otherlv_2= ';' ) ;
    public final EObject ruleTheoremDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_thmName_0_0 = null;

        EObject lv_expr_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2005:2: ( ( ( (lv_thmName_0_0= ruleTHM_NAME ) ) ( (lv_expr_1_0= ruleRootExpression ) ) otherlv_2= ';' ) )
            // InternalMyDsl.g:2006:2: ( ( (lv_thmName_0_0= ruleTHM_NAME ) ) ( (lv_expr_1_0= ruleRootExpression ) ) otherlv_2= ';' )
            {
            // InternalMyDsl.g:2006:2: ( ( (lv_thmName_0_0= ruleTHM_NAME ) ) ( (lv_expr_1_0= ruleRootExpression ) ) otherlv_2= ';' )
            // InternalMyDsl.g:2007:3: ( (lv_thmName_0_0= ruleTHM_NAME ) ) ( (lv_expr_1_0= ruleRootExpression ) ) otherlv_2= ';'
            {
            // InternalMyDsl.g:2007:3: ( (lv_thmName_0_0= ruleTHM_NAME ) )
            // InternalMyDsl.g:2008:4: (lv_thmName_0_0= ruleTHM_NAME )
            {
            // InternalMyDsl.g:2008:4: (lv_thmName_0_0= ruleTHM_NAME )
            // InternalMyDsl.g:2009:5: lv_thmName_0_0= ruleTHM_NAME
            {

            					newCompositeNode(grammarAccess.getTheoremDeclAccess().getThmNameTHM_NAMEParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_24);
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

            // InternalMyDsl.g:2026:3: ( (lv_expr_1_0= ruleRootExpression ) )
            // InternalMyDsl.g:2027:4: (lv_expr_1_0= ruleRootExpression )
            {
            // InternalMyDsl.g:2027:4: (lv_expr_1_0= ruleRootExpression )
            // InternalMyDsl.g:2028:5: lv_expr_1_0= ruleRootExpression
            {

            					newCompositeNode(grammarAccess.getTheoremDeclAccess().getExprRootExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_38);
            lv_expr_1_0=ruleRootExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTheoremDeclRule());
            					}
            					set(
            						current,
            						"expr",
            						lv_expr_1_0,
            						"org.xtext.sampleProj.mydsl.MyDsl.RootExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getTheoremDeclAccess().getSemicolonKeyword_2());
            		

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
    // InternalMyDsl.g:2053:1: entryRuleTypedVariableList returns [EObject current=null] : iv_ruleTypedVariableList= ruleTypedVariableList EOF ;
    public final EObject entryRuleTypedVariableList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypedVariableList = null;


        try {
            // InternalMyDsl.g:2053:58: (iv_ruleTypedVariableList= ruleTypedVariableList EOF )
            // InternalMyDsl.g:2054:2: iv_ruleTypedVariableList= ruleTypedVariableList EOF
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
    // InternalMyDsl.g:2060:1: ruleTypedVariableList returns [EObject current=null] : ( ( (lv_variablesOfType_0_0= ruleVariableTyping ) ) (otherlv_1= ',' ( (lv_variablesOfType_2_0= ruleVariableTyping ) ) )* ) ;
    public final EObject ruleTypedVariableList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_variablesOfType_0_0 = null;

        EObject lv_variablesOfType_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2066:2: ( ( ( (lv_variablesOfType_0_0= ruleVariableTyping ) ) (otherlv_1= ',' ( (lv_variablesOfType_2_0= ruleVariableTyping ) ) )* ) )
            // InternalMyDsl.g:2067:2: ( ( (lv_variablesOfType_0_0= ruleVariableTyping ) ) (otherlv_1= ',' ( (lv_variablesOfType_2_0= ruleVariableTyping ) ) )* )
            {
            // InternalMyDsl.g:2067:2: ( ( (lv_variablesOfType_0_0= ruleVariableTyping ) ) (otherlv_1= ',' ( (lv_variablesOfType_2_0= ruleVariableTyping ) ) )* )
            // InternalMyDsl.g:2068:3: ( (lv_variablesOfType_0_0= ruleVariableTyping ) ) (otherlv_1= ',' ( (lv_variablesOfType_2_0= ruleVariableTyping ) ) )*
            {
            // InternalMyDsl.g:2068:3: ( (lv_variablesOfType_0_0= ruleVariableTyping ) )
            // InternalMyDsl.g:2069:4: (lv_variablesOfType_0_0= ruleVariableTyping )
            {
            // InternalMyDsl.g:2069:4: (lv_variablesOfType_0_0= ruleVariableTyping )
            // InternalMyDsl.g:2070:5: lv_variablesOfType_0_0= ruleVariableTyping
            {

            					newCompositeNode(grammarAccess.getTypedVariableListAccess().getVariablesOfTypeVariableTypingParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_16);
            lv_variablesOfType_0_0=ruleVariableTyping();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTypedVariableListRule());
            					}
            					add(
            						current,
            						"variablesOfType",
            						lv_variablesOfType_0_0,
            						"org.xtext.sampleProj.mydsl.MyDsl.VariableTyping");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:2087:3: (otherlv_1= ',' ( (lv_variablesOfType_2_0= ruleVariableTyping ) ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==21) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalMyDsl.g:2088:4: otherlv_1= ',' ( (lv_variablesOfType_2_0= ruleVariableTyping ) )
            	    {
            	    otherlv_1=(Token)match(input,21,FOLLOW_5); 

            	    				newLeafNode(otherlv_1, grammarAccess.getTypedVariableListAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalMyDsl.g:2092:4: ( (lv_variablesOfType_2_0= ruleVariableTyping ) )
            	    // InternalMyDsl.g:2093:5: (lv_variablesOfType_2_0= ruleVariableTyping )
            	    {
            	    // InternalMyDsl.g:2093:5: (lv_variablesOfType_2_0= ruleVariableTyping )
            	    // InternalMyDsl.g:2094:6: lv_variablesOfType_2_0= ruleVariableTyping
            	    {

            	    						newCompositeNode(grammarAccess.getTypedVariableListAccess().getVariablesOfTypeVariableTypingParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_16);
            	    lv_variablesOfType_2_0=ruleVariableTyping();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTypedVariableListRule());
            	    						}
            	    						add(
            	    							current,
            	    							"variablesOfType",
            	    							lv_variablesOfType_2_0,
            	    							"org.xtext.sampleProj.mydsl.MyDsl.VariableTyping");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop36;
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


    // $ANTLR start "entryRuleVariableTyping"
    // InternalMyDsl.g:2116:1: entryRuleVariableTyping returns [EObject current=null] : iv_ruleVariableTyping= ruleVariableTyping EOF ;
    public final EObject entryRuleVariableTyping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableTyping = null;


        try {
            // InternalMyDsl.g:2116:55: (iv_ruleVariableTyping= ruleVariableTyping EOF )
            // InternalMyDsl.g:2117:2: iv_ruleVariableTyping= ruleVariableTyping EOF
            {
             newCompositeNode(grammarAccess.getVariableTypingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariableTyping=ruleVariableTyping();

            state._fsp--;

             current =iv_ruleVariableTyping; 
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
    // $ANTLR end "entryRuleVariableTyping"


    // $ANTLR start "ruleVariableTyping"
    // InternalMyDsl.g:2123:1: ruleVariableTyping returns [EObject current=null] : ( ( (lv_typeVar_0_0= ruleTypedVariable ) ) (otherlv_1= ',' ( (lv_typeVar_2_0= ruleTypedVariable ) ) )* otherlv_3= ':' ( (lv_type_4_0= ruleConstructedType ) ) ) ;
    public final EObject ruleVariableTyping() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_typeVar_0_0 = null;

        EObject lv_typeVar_2_0 = null;

        EObject lv_type_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2129:2: ( ( ( (lv_typeVar_0_0= ruleTypedVariable ) ) (otherlv_1= ',' ( (lv_typeVar_2_0= ruleTypedVariable ) ) )* otherlv_3= ':' ( (lv_type_4_0= ruleConstructedType ) ) ) )
            // InternalMyDsl.g:2130:2: ( ( (lv_typeVar_0_0= ruleTypedVariable ) ) (otherlv_1= ',' ( (lv_typeVar_2_0= ruleTypedVariable ) ) )* otherlv_3= ':' ( (lv_type_4_0= ruleConstructedType ) ) )
            {
            // InternalMyDsl.g:2130:2: ( ( (lv_typeVar_0_0= ruleTypedVariable ) ) (otherlv_1= ',' ( (lv_typeVar_2_0= ruleTypedVariable ) ) )* otherlv_3= ':' ( (lv_type_4_0= ruleConstructedType ) ) )
            // InternalMyDsl.g:2131:3: ( (lv_typeVar_0_0= ruleTypedVariable ) ) (otherlv_1= ',' ( (lv_typeVar_2_0= ruleTypedVariable ) ) )* otherlv_3= ':' ( (lv_type_4_0= ruleConstructedType ) )
            {
            // InternalMyDsl.g:2131:3: ( (lv_typeVar_0_0= ruleTypedVariable ) )
            // InternalMyDsl.g:2132:4: (lv_typeVar_0_0= ruleTypedVariable )
            {
            // InternalMyDsl.g:2132:4: (lv_typeVar_0_0= ruleTypedVariable )
            // InternalMyDsl.g:2133:5: lv_typeVar_0_0= ruleTypedVariable
            {

            					newCompositeNode(grammarAccess.getVariableTypingAccess().getTypeVarTypedVariableParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_39);
            lv_typeVar_0_0=ruleTypedVariable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariableTypingRule());
            					}
            					add(
            						current,
            						"typeVar",
            						lv_typeVar_0_0,
            						"org.xtext.sampleProj.mydsl.MyDsl.TypedVariable");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:2150:3: (otherlv_1= ',' ( (lv_typeVar_2_0= ruleTypedVariable ) ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==21) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalMyDsl.g:2151:4: otherlv_1= ',' ( (lv_typeVar_2_0= ruleTypedVariable ) )
            	    {
            	    otherlv_1=(Token)match(input,21,FOLLOW_5); 

            	    				newLeafNode(otherlv_1, grammarAccess.getVariableTypingAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalMyDsl.g:2155:4: ( (lv_typeVar_2_0= ruleTypedVariable ) )
            	    // InternalMyDsl.g:2156:5: (lv_typeVar_2_0= ruleTypedVariable )
            	    {
            	    // InternalMyDsl.g:2156:5: (lv_typeVar_2_0= ruleTypedVariable )
            	    // InternalMyDsl.g:2157:6: lv_typeVar_2_0= ruleTypedVariable
            	    {

            	    						newCompositeNode(grammarAccess.getVariableTypingAccess().getTypeVarTypedVariableParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_39);
            	    lv_typeVar_2_0=ruleTypedVariable();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getVariableTypingRule());
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
            	    break loop37;
                }
            } while (true);

            otherlv_3=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_3, grammarAccess.getVariableTypingAccess().getColonKeyword_2());
            		
            // InternalMyDsl.g:2179:3: ( (lv_type_4_0= ruleConstructedType ) )
            // InternalMyDsl.g:2180:4: (lv_type_4_0= ruleConstructedType )
            {
            // InternalMyDsl.g:2180:4: (lv_type_4_0= ruleConstructedType )
            // InternalMyDsl.g:2181:5: lv_type_4_0= ruleConstructedType
            {

            					newCompositeNode(grammarAccess.getVariableTypingAccess().getTypeConstructedTypeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_4_0=ruleConstructedType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariableTypingRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_4_0,
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
    // $ANTLR end "ruleVariableTyping"


    // $ANTLR start "entryRuleTypedVariable"
    // InternalMyDsl.g:2202:1: entryRuleTypedVariable returns [EObject current=null] : iv_ruleTypedVariable= ruleTypedVariable EOF ;
    public final EObject entryRuleTypedVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypedVariable = null;


        try {
            // InternalMyDsl.g:2202:54: (iv_ruleTypedVariable= ruleTypedVariable EOF )
            // InternalMyDsl.g:2203:2: iv_ruleTypedVariable= ruleTypedVariable EOF
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
    // InternalMyDsl.g:2209:1: ruleTypedVariable returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleTypedVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2215:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalMyDsl.g:2216:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalMyDsl.g:2216:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalMyDsl.g:2217:3: (lv_name_0_0= RULE_ID )
            {
            // InternalMyDsl.g:2217:3: (lv_name_0_0= RULE_ID )
            // InternalMyDsl.g:2218:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getTypedVariableAccess().getNameIDTerminalRuleCall_0());
            			

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


    // $ANTLR start "entryRuleLambda"
    // InternalMyDsl.g:2237:1: entryRuleLambda returns [EObject current=null] : iv_ruleLambda= ruleLambda EOF ;
    public final EObject entryRuleLambda() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLambda = null;


        try {
            // InternalMyDsl.g:2237:47: (iv_ruleLambda= ruleLambda EOF )
            // InternalMyDsl.g:2238:2: iv_ruleLambda= ruleLambda EOF
            {
             newCompositeNode(grammarAccess.getLambdaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLambda=ruleLambda();

            state._fsp--;

             current =iv_ruleLambda; 
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
    // $ANTLR end "entryRuleLambda"


    // $ANTLR start "ruleLambda"
    // InternalMyDsl.g:2244:1: ruleLambda returns [EObject current=null] : ( ( (lv_qType_0_0= '\\u03BB' ) ) ( (lv_context_1_0= rulePolyContext ) )? ( (lv_varList_2_0= ruleTypedVariableList ) ) otherlv_3= '|' ( (lv_child_4_0= ruleRootExpression ) ) ) ;
    public final EObject ruleLambda() throws RecognitionException {
        EObject current = null;

        Token lv_qType_0_0=null;
        Token otherlv_3=null;
        EObject lv_context_1_0 = null;

        EObject lv_varList_2_0 = null;

        EObject lv_child_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2250:2: ( ( ( (lv_qType_0_0= '\\u03BB' ) ) ( (lv_context_1_0= rulePolyContext ) )? ( (lv_varList_2_0= ruleTypedVariableList ) ) otherlv_3= '|' ( (lv_child_4_0= ruleRootExpression ) ) ) )
            // InternalMyDsl.g:2251:2: ( ( (lv_qType_0_0= '\\u03BB' ) ) ( (lv_context_1_0= rulePolyContext ) )? ( (lv_varList_2_0= ruleTypedVariableList ) ) otherlv_3= '|' ( (lv_child_4_0= ruleRootExpression ) ) )
            {
            // InternalMyDsl.g:2251:2: ( ( (lv_qType_0_0= '\\u03BB' ) ) ( (lv_context_1_0= rulePolyContext ) )? ( (lv_varList_2_0= ruleTypedVariableList ) ) otherlv_3= '|' ( (lv_child_4_0= ruleRootExpression ) ) )
            // InternalMyDsl.g:2252:3: ( (lv_qType_0_0= '\\u03BB' ) ) ( (lv_context_1_0= rulePolyContext ) )? ( (lv_varList_2_0= ruleTypedVariableList ) ) otherlv_3= '|' ( (lv_child_4_0= ruleRootExpression ) )
            {
            // InternalMyDsl.g:2252:3: ( (lv_qType_0_0= '\\u03BB' ) )
            // InternalMyDsl.g:2253:4: (lv_qType_0_0= '\\u03BB' )
            {
            // InternalMyDsl.g:2253:4: (lv_qType_0_0= '\\u03BB' )
            // InternalMyDsl.g:2254:5: lv_qType_0_0= '\\u03BB'
            {
            lv_qType_0_0=(Token)match(input,41,FOLLOW_40); 

            					newLeafNode(lv_qType_0_0, grammarAccess.getLambdaAccess().getQTypeGreekSmallLetterLamdaKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLambdaRule());
            					}
            					setWithLastConsumed(current, "qType", lv_qType_0_0, "\u03BB");
            				

            }


            }

            // InternalMyDsl.g:2266:3: ( (lv_context_1_0= rulePolyContext ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==19) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalMyDsl.g:2267:4: (lv_context_1_0= rulePolyContext )
                    {
                    // InternalMyDsl.g:2267:4: (lv_context_1_0= rulePolyContext )
                    // InternalMyDsl.g:2268:5: lv_context_1_0= rulePolyContext
                    {

                    					newCompositeNode(grammarAccess.getLambdaAccess().getContextPolyContextParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_5);
                    lv_context_1_0=rulePolyContext();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getLambdaRule());
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

            // InternalMyDsl.g:2285:3: ( (lv_varList_2_0= ruleTypedVariableList ) )
            // InternalMyDsl.g:2286:4: (lv_varList_2_0= ruleTypedVariableList )
            {
            // InternalMyDsl.g:2286:4: (lv_varList_2_0= ruleTypedVariableList )
            // InternalMyDsl.g:2287:5: lv_varList_2_0= ruleTypedVariableList
            {

            					newCompositeNode(grammarAccess.getLambdaAccess().getVarListTypedVariableListParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_26);
            lv_varList_2_0=ruleTypedVariableList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLambdaRule());
            					}
            					set(
            						current,
            						"varList",
            						lv_varList_2_0,
            						"org.xtext.sampleProj.mydsl.MyDsl.TypedVariableList");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,36,FOLLOW_24); 

            			newLeafNode(otherlv_3, grammarAccess.getLambdaAccess().getVerticalLineKeyword_3());
            		
            // InternalMyDsl.g:2308:3: ( (lv_child_4_0= ruleRootExpression ) )
            // InternalMyDsl.g:2309:4: (lv_child_4_0= ruleRootExpression )
            {
            // InternalMyDsl.g:2309:4: (lv_child_4_0= ruleRootExpression )
            // InternalMyDsl.g:2310:5: lv_child_4_0= ruleRootExpression
            {

            					newCompositeNode(grammarAccess.getLambdaAccess().getChildRootExpressionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_child_4_0=ruleRootExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLambdaRule());
            					}
            					set(
            						current,
            						"child",
            						lv_child_4_0,
            						"org.xtext.sampleProj.mydsl.MyDsl.RootExpression");
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
    // $ANTLR end "ruleLambda"


    // $ANTLR start "entryRuleQuantifier"
    // InternalMyDsl.g:2331:1: entryRuleQuantifier returns [EObject current=null] : iv_ruleQuantifier= ruleQuantifier EOF ;
    public final EObject entryRuleQuantifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuantifier = null;


        try {
            // InternalMyDsl.g:2331:51: (iv_ruleQuantifier= ruleQuantifier EOF )
            // InternalMyDsl.g:2332:2: iv_ruleQuantifier= ruleQuantifier EOF
            {
             newCompositeNode(grammarAccess.getQuantifierRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQuantifier=ruleQuantifier();

            state._fsp--;

             current =iv_ruleQuantifier; 
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
    // $ANTLR end "entryRuleQuantifier"


    // $ANTLR start "ruleQuantifier"
    // InternalMyDsl.g:2338:1: ruleQuantifier returns [EObject current=null] : ( ( ( (lv_qType_0_1= '\\u2200' | lv_qType_0_2= '\\u2203' ) ) ) ( (lv_context_1_0= rulePolyContext ) )? ( (lv_varList_2_0= ruleTypedVariableList ) ) otherlv_3= '\\u00B7' ( (lv_child_4_0= ruleRootExpression ) ) ) ;
    public final EObject ruleQuantifier() throws RecognitionException {
        EObject current = null;

        Token lv_qType_0_1=null;
        Token lv_qType_0_2=null;
        Token otherlv_3=null;
        EObject lv_context_1_0 = null;

        EObject lv_varList_2_0 = null;

        EObject lv_child_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2344:2: ( ( ( ( (lv_qType_0_1= '\\u2200' | lv_qType_0_2= '\\u2203' ) ) ) ( (lv_context_1_0= rulePolyContext ) )? ( (lv_varList_2_0= ruleTypedVariableList ) ) otherlv_3= '\\u00B7' ( (lv_child_4_0= ruleRootExpression ) ) ) )
            // InternalMyDsl.g:2345:2: ( ( ( (lv_qType_0_1= '\\u2200' | lv_qType_0_2= '\\u2203' ) ) ) ( (lv_context_1_0= rulePolyContext ) )? ( (lv_varList_2_0= ruleTypedVariableList ) ) otherlv_3= '\\u00B7' ( (lv_child_4_0= ruleRootExpression ) ) )
            {
            // InternalMyDsl.g:2345:2: ( ( ( (lv_qType_0_1= '\\u2200' | lv_qType_0_2= '\\u2203' ) ) ) ( (lv_context_1_0= rulePolyContext ) )? ( (lv_varList_2_0= ruleTypedVariableList ) ) otherlv_3= '\\u00B7' ( (lv_child_4_0= ruleRootExpression ) ) )
            // InternalMyDsl.g:2346:3: ( ( (lv_qType_0_1= '\\u2200' | lv_qType_0_2= '\\u2203' ) ) ) ( (lv_context_1_0= rulePolyContext ) )? ( (lv_varList_2_0= ruleTypedVariableList ) ) otherlv_3= '\\u00B7' ( (lv_child_4_0= ruleRootExpression ) )
            {
            // InternalMyDsl.g:2346:3: ( ( (lv_qType_0_1= '\\u2200' | lv_qType_0_2= '\\u2203' ) ) )
            // InternalMyDsl.g:2347:4: ( (lv_qType_0_1= '\\u2200' | lv_qType_0_2= '\\u2203' ) )
            {
            // InternalMyDsl.g:2347:4: ( (lv_qType_0_1= '\\u2200' | lv_qType_0_2= '\\u2203' ) )
            // InternalMyDsl.g:2348:5: (lv_qType_0_1= '\\u2200' | lv_qType_0_2= '\\u2203' )
            {
            // InternalMyDsl.g:2348:5: (lv_qType_0_1= '\\u2200' | lv_qType_0_2= '\\u2203' )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==42) ) {
                alt39=1;
            }
            else if ( (LA39_0==43) ) {
                alt39=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // InternalMyDsl.g:2349:6: lv_qType_0_1= '\\u2200'
                    {
                    lv_qType_0_1=(Token)match(input,42,FOLLOW_40); 

                    						newLeafNode(lv_qType_0_1, grammarAccess.getQuantifierAccess().getQTypeForAllKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getQuantifierRule());
                    						}
                    						setWithLastConsumed(current, "qType", lv_qType_0_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:2360:6: lv_qType_0_2= '\\u2203'
                    {
                    lv_qType_0_2=(Token)match(input,43,FOLLOW_40); 

                    						newLeafNode(lv_qType_0_2, grammarAccess.getQuantifierAccess().getQTypeThereExistsKeyword_0_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getQuantifierRule());
                    						}
                    						setWithLastConsumed(current, "qType", lv_qType_0_2, null);
                    					

                    }
                    break;

            }


            }


            }

            // InternalMyDsl.g:2373:3: ( (lv_context_1_0= rulePolyContext ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==19) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalMyDsl.g:2374:4: (lv_context_1_0= rulePolyContext )
                    {
                    // InternalMyDsl.g:2374:4: (lv_context_1_0= rulePolyContext )
                    // InternalMyDsl.g:2375:5: lv_context_1_0= rulePolyContext
                    {

                    					newCompositeNode(grammarAccess.getQuantifierAccess().getContextPolyContextParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_5);
                    lv_context_1_0=rulePolyContext();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getQuantifierRule());
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

            // InternalMyDsl.g:2392:3: ( (lv_varList_2_0= ruleTypedVariableList ) )
            // InternalMyDsl.g:2393:4: (lv_varList_2_0= ruleTypedVariableList )
            {
            // InternalMyDsl.g:2393:4: (lv_varList_2_0= ruleTypedVariableList )
            // InternalMyDsl.g:2394:5: lv_varList_2_0= ruleTypedVariableList
            {

            					newCompositeNode(grammarAccess.getQuantifierAccess().getVarListTypedVariableListParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_41);
            lv_varList_2_0=ruleTypedVariableList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getQuantifierRule());
            					}
            					set(
            						current,
            						"varList",
            						lv_varList_2_0,
            						"org.xtext.sampleProj.mydsl.MyDsl.TypedVariableList");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,44,FOLLOW_24); 

            			newLeafNode(otherlv_3, grammarAccess.getQuantifierAccess().getMiddleDotKeyword_3());
            		
            // InternalMyDsl.g:2415:3: ( (lv_child_4_0= ruleRootExpression ) )
            // InternalMyDsl.g:2416:4: (lv_child_4_0= ruleRootExpression )
            {
            // InternalMyDsl.g:2416:4: (lv_child_4_0= ruleRootExpression )
            // InternalMyDsl.g:2417:5: lv_child_4_0= ruleRootExpression
            {

            					newCompositeNode(grammarAccess.getQuantifierAccess().getChildRootExpressionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_child_4_0=ruleRootExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getQuantifierRule());
            					}
            					set(
            						current,
            						"child",
            						lv_child_4_0,
            						"org.xtext.sampleProj.mydsl.MyDsl.RootExpression");
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
    // $ANTLR end "ruleQuantifier"


    // $ANTLR start "entryRuleRootExpression"
    // InternalMyDsl.g:2438:1: entryRuleRootExpression returns [EObject current=null] : iv_ruleRootExpression= ruleRootExpression EOF ;
    public final EObject entryRuleRootExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRootExpression = null;


        try {
            // InternalMyDsl.g:2438:55: (iv_ruleRootExpression= ruleRootExpression EOF )
            // InternalMyDsl.g:2439:2: iv_ruleRootExpression= ruleRootExpression EOF
            {
             newCompositeNode(grammarAccess.getRootExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRootExpression=ruleRootExpression();

            state._fsp--;

             current =iv_ruleRootExpression; 
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
    // $ANTLR end "entryRuleRootExpression"


    // $ANTLR start "ruleRootExpression"
    // InternalMyDsl.g:2445:1: ruleRootExpression returns [EObject current=null] : (this_Lambda_0= ruleLambda | this_Quantifier_1= ruleQuantifier | this_Infix_2= ruleInfix ) ;
    public final EObject ruleRootExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Lambda_0 = null;

        EObject this_Quantifier_1 = null;

        EObject this_Infix_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2451:2: ( (this_Lambda_0= ruleLambda | this_Quantifier_1= ruleQuantifier | this_Infix_2= ruleInfix ) )
            // InternalMyDsl.g:2452:2: (this_Lambda_0= ruleLambda | this_Quantifier_1= ruleQuantifier | this_Infix_2= ruleInfix )
            {
            // InternalMyDsl.g:2452:2: (this_Lambda_0= ruleLambda | this_Quantifier_1= ruleQuantifier | this_Infix_2= ruleInfix )
            int alt41=3;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt41=1;
                }
                break;
            case 42:
            case 43:
                {
                alt41=2;
                }
                break;
            case RULE_ID:
            case 32:
            case 45:
                {
                alt41=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }

            switch (alt41) {
                case 1 :
                    // InternalMyDsl.g:2453:3: this_Lambda_0= ruleLambda
                    {

                    			newCompositeNode(grammarAccess.getRootExpressionAccess().getLambdaParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Lambda_0=ruleLambda();

                    state._fsp--;


                    			current = this_Lambda_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:2462:3: this_Quantifier_1= ruleQuantifier
                    {

                    			newCompositeNode(grammarAccess.getRootExpressionAccess().getQuantifierParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Quantifier_1=ruleQuantifier();

                    state._fsp--;


                    			current = this_Quantifier_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:2471:3: this_Infix_2= ruleInfix
                    {

                    			newCompositeNode(grammarAccess.getRootExpressionAccess().getInfixParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Infix_2=ruleInfix();

                    state._fsp--;


                    			current = this_Infix_2;
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
    // $ANTLR end "ruleRootExpression"


    // $ANTLR start "entryRulePrefix"
    // InternalMyDsl.g:2483:1: entryRulePrefix returns [EObject current=null] : iv_rulePrefix= rulePrefix EOF ;
    public final EObject entryRulePrefix() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrefix = null;


        try {
            // InternalMyDsl.g:2483:47: (iv_rulePrefix= rulePrefix EOF )
            // InternalMyDsl.g:2484:2: iv_rulePrefix= rulePrefix EOF
            {
             newCompositeNode(grammarAccess.getPrefixRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrefix=rulePrefix();

            state._fsp--;

             current =iv_rulePrefix; 
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
    // $ANTLR end "entryRulePrefix"


    // $ANTLR start "rulePrefix"
    // InternalMyDsl.g:2490:1: rulePrefix returns [EObject current=null] : ( ( (lv_name_0_0= rulePrefixBuiltIn ) ) ( (lv_elem_1_0= ruleElement ) ) ) ;
    public final EObject rulePrefix() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_elem_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2496:2: ( ( ( (lv_name_0_0= rulePrefixBuiltIn ) ) ( (lv_elem_1_0= ruleElement ) ) ) )
            // InternalMyDsl.g:2497:2: ( ( (lv_name_0_0= rulePrefixBuiltIn ) ) ( (lv_elem_1_0= ruleElement ) ) )
            {
            // InternalMyDsl.g:2497:2: ( ( (lv_name_0_0= rulePrefixBuiltIn ) ) ( (lv_elem_1_0= ruleElement ) ) )
            // InternalMyDsl.g:2498:3: ( (lv_name_0_0= rulePrefixBuiltIn ) ) ( (lv_elem_1_0= ruleElement ) )
            {
            // InternalMyDsl.g:2498:3: ( (lv_name_0_0= rulePrefixBuiltIn ) )
            // InternalMyDsl.g:2499:4: (lv_name_0_0= rulePrefixBuiltIn )
            {
            // InternalMyDsl.g:2499:4: (lv_name_0_0= rulePrefixBuiltIn )
            // InternalMyDsl.g:2500:5: lv_name_0_0= rulePrefixBuiltIn
            {

            					newCompositeNode(grammarAccess.getPrefixAccess().getNamePrefixBuiltInParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_24);
            lv_name_0_0=rulePrefixBuiltIn();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPrefixRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.xtext.sampleProj.mydsl.MyDsl.PrefixBuiltIn");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:2517:3: ( (lv_elem_1_0= ruleElement ) )
            // InternalMyDsl.g:2518:4: (lv_elem_1_0= ruleElement )
            {
            // InternalMyDsl.g:2518:4: (lv_elem_1_0= ruleElement )
            // InternalMyDsl.g:2519:5: lv_elem_1_0= ruleElement
            {

            					newCompositeNode(grammarAccess.getPrefixAccess().getElemElementParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_elem_1_0=ruleElement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPrefixRule());
            					}
            					set(
            						current,
            						"elem",
            						lv_elem_1_0,
            						"org.xtext.sampleProj.mydsl.MyDsl.Element");
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
    // $ANTLR end "rulePrefix"


    // $ANTLR start "entryRulePrefixBuiltIn"
    // InternalMyDsl.g:2540:1: entryRulePrefixBuiltIn returns [String current=null] : iv_rulePrefixBuiltIn= rulePrefixBuiltIn EOF ;
    public final String entryRulePrefixBuiltIn() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrefixBuiltIn = null;


        try {
            // InternalMyDsl.g:2540:53: (iv_rulePrefixBuiltIn= rulePrefixBuiltIn EOF )
            // InternalMyDsl.g:2541:2: iv_rulePrefixBuiltIn= rulePrefixBuiltIn EOF
            {
             newCompositeNode(grammarAccess.getPrefixBuiltInRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrefixBuiltIn=rulePrefixBuiltIn();

            state._fsp--;

             current =iv_rulePrefixBuiltIn.getText(); 
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
    // $ANTLR end "entryRulePrefixBuiltIn"


    // $ANTLR start "rulePrefixBuiltIn"
    // InternalMyDsl.g:2547:1: rulePrefixBuiltIn returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '\\u00AC' ;
    public final AntlrDatatypeRuleToken rulePrefixBuiltIn() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2553:2: (kw= '\\u00AC' )
            // InternalMyDsl.g:2554:2: kw= '\\u00AC'
            {
            kw=(Token)match(input,45,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getPrefixBuiltInAccess().getNotSignKeyword());
            	

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
    // $ANTLR end "rulePrefixBuiltIn"


    // $ANTLR start "entryRuleInfix"
    // InternalMyDsl.g:2562:1: entryRuleInfix returns [EObject current=null] : iv_ruleInfix= ruleInfix EOF ;
    public final EObject entryRuleInfix() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInfix = null;


        try {
            // InternalMyDsl.g:2562:46: (iv_ruleInfix= ruleInfix EOF )
            // InternalMyDsl.g:2563:2: iv_ruleInfix= ruleInfix EOF
            {
             newCompositeNode(grammarAccess.getInfixRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInfix=ruleInfix();

            state._fsp--;

             current =iv_ruleInfix; 
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
    // $ANTLR end "entryRuleInfix"


    // $ANTLR start "ruleInfix"
    // InternalMyDsl.g:2569:1: ruleInfix returns [EObject current=null] : (this_Element_0= ruleElement ( () ( ( (otherlv_2= RULE_ID ) ) | ( (lv_opName_3_0= ruleInbuiltInfix ) ) ) ( (lv_right_4_0= ruleElement ) ) )* ) ;
    public final EObject ruleInfix() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Element_0 = null;

        AntlrDatatypeRuleToken lv_opName_3_0 = null;

        EObject lv_right_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2575:2: ( (this_Element_0= ruleElement ( () ( ( (otherlv_2= RULE_ID ) ) | ( (lv_opName_3_0= ruleInbuiltInfix ) ) ) ( (lv_right_4_0= ruleElement ) ) )* ) )
            // InternalMyDsl.g:2576:2: (this_Element_0= ruleElement ( () ( ( (otherlv_2= RULE_ID ) ) | ( (lv_opName_3_0= ruleInbuiltInfix ) ) ) ( (lv_right_4_0= ruleElement ) ) )* )
            {
            // InternalMyDsl.g:2576:2: (this_Element_0= ruleElement ( () ( ( (otherlv_2= RULE_ID ) ) | ( (lv_opName_3_0= ruleInbuiltInfix ) ) ) ( (lv_right_4_0= ruleElement ) ) )* )
            // InternalMyDsl.g:2577:3: this_Element_0= ruleElement ( () ( ( (otherlv_2= RULE_ID ) ) | ( (lv_opName_3_0= ruleInbuiltInfix ) ) ) ( (lv_right_4_0= ruleElement ) ) )*
            {

            			newCompositeNode(grammarAccess.getInfixAccess().getElementParserRuleCall_0());
            		
            pushFollow(FOLLOW_42);
            this_Element_0=ruleElement();

            state._fsp--;


            			current = this_Element_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMyDsl.g:2585:3: ( () ( ( (otherlv_2= RULE_ID ) ) | ( (lv_opName_3_0= ruleInbuiltInfix ) ) ) ( (lv_right_4_0= ruleElement ) ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==RULE_ID) ) {
                    int LA43_2 = input.LA(2);

                    if ( (LA43_2==32) ) {
                        int LA43_4 = input.LA(3);

                        if ( (LA43_4==RULE_ID) ) {
                            int LA43_5 = input.LA(4);

                            if ( (LA43_5==RULE_ID||LA43_5==14||(LA43_5>=32 && LA43_5<=33)||(LA43_5>=46 && LA43_5<=51)) ) {
                                alt43=1;
                            }


                        }
                        else if ( (LA43_4==32||(LA43_4>=41 && LA43_4<=43)||LA43_4==45) ) {
                            alt43=1;
                        }


                    }
                    else if ( (LA43_2==RULE_ID||LA43_2==45) ) {
                        alt43=1;
                    }


                }
                else if ( ((LA43_0>=46 && LA43_0<=51)) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalMyDsl.g:2586:4: () ( ( (otherlv_2= RULE_ID ) ) | ( (lv_opName_3_0= ruleInbuiltInfix ) ) ) ( (lv_right_4_0= ruleElement ) )
            	    {
            	    // InternalMyDsl.g:2586:4: ()
            	    // InternalMyDsl.g:2587:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getInfixAccess().getInfixLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalMyDsl.g:2593:4: ( ( (otherlv_2= RULE_ID ) ) | ( (lv_opName_3_0= ruleInbuiltInfix ) ) )
            	    int alt42=2;
            	    int LA42_0 = input.LA(1);

            	    if ( (LA42_0==RULE_ID) ) {
            	        alt42=1;
            	    }
            	    else if ( ((LA42_0>=46 && LA42_0<=51)) ) {
            	        alt42=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 42, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt42) {
            	        case 1 :
            	            // InternalMyDsl.g:2594:5: ( (otherlv_2= RULE_ID ) )
            	            {
            	            // InternalMyDsl.g:2594:5: ( (otherlv_2= RULE_ID ) )
            	            // InternalMyDsl.g:2595:6: (otherlv_2= RULE_ID )
            	            {
            	            // InternalMyDsl.g:2595:6: (otherlv_2= RULE_ID )
            	            // InternalMyDsl.g:2596:7: otherlv_2= RULE_ID
            	            {

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getInfixRule());
            	            							}
            	            						
            	            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_24); 

            	            							newLeafNode(otherlv_2, grammarAccess.getInfixAccess().getFuncNameFunctionNameCrossReference_1_1_0_0());
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalMyDsl.g:2608:5: ( (lv_opName_3_0= ruleInbuiltInfix ) )
            	            {
            	            // InternalMyDsl.g:2608:5: ( (lv_opName_3_0= ruleInbuiltInfix ) )
            	            // InternalMyDsl.g:2609:6: (lv_opName_3_0= ruleInbuiltInfix )
            	            {
            	            // InternalMyDsl.g:2609:6: (lv_opName_3_0= ruleInbuiltInfix )
            	            // InternalMyDsl.g:2610:7: lv_opName_3_0= ruleInbuiltInfix
            	            {

            	            							newCompositeNode(grammarAccess.getInfixAccess().getOpNameInbuiltInfixParserRuleCall_1_1_1_0());
            	            						
            	            pushFollow(FOLLOW_24);
            	            lv_opName_3_0=ruleInbuiltInfix();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getInfixRule());
            	            							}
            	            							set(
            	            								current,
            	            								"opName",
            	            								lv_opName_3_0,
            	            								"org.xtext.sampleProj.mydsl.MyDsl.InbuiltInfix");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // InternalMyDsl.g:2628:4: ( (lv_right_4_0= ruleElement ) )
            	    // InternalMyDsl.g:2629:5: (lv_right_4_0= ruleElement )
            	    {
            	    // InternalMyDsl.g:2629:5: (lv_right_4_0= ruleElement )
            	    // InternalMyDsl.g:2630:6: lv_right_4_0= ruleElement
            	    {

            	    						newCompositeNode(grammarAccess.getInfixAccess().getRightElementParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_42);
            	    lv_right_4_0=ruleElement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getInfixRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_4_0,
            	    							"org.xtext.sampleProj.mydsl.MyDsl.Element");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop43;
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
    // $ANTLR end "ruleInfix"


    // $ANTLR start "entryRuleElement"
    // InternalMyDsl.g:2652:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // InternalMyDsl.g:2652:48: (iv_ruleElement= ruleElement EOF )
            // InternalMyDsl.g:2653:2: iv_ruleElement= ruleElement EOF
            {
             newCompositeNode(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElement=ruleElement();

            state._fsp--;

             current =iv_ruleElement; 
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
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalMyDsl.g:2659:1: ruleElement returns [EObject current=null] : (this_Bracket_0= ruleBracket | this_Prefix_1= rulePrefix | this_FunctionCall_2= ruleFunctionCall ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        EObject this_Bracket_0 = null;

        EObject this_Prefix_1 = null;

        EObject this_FunctionCall_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2665:2: ( (this_Bracket_0= ruleBracket | this_Prefix_1= rulePrefix | this_FunctionCall_2= ruleFunctionCall ) )
            // InternalMyDsl.g:2666:2: (this_Bracket_0= ruleBracket | this_Prefix_1= rulePrefix | this_FunctionCall_2= ruleFunctionCall )
            {
            // InternalMyDsl.g:2666:2: (this_Bracket_0= ruleBracket | this_Prefix_1= rulePrefix | this_FunctionCall_2= ruleFunctionCall )
            int alt44=3;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt44=1;
                }
                break;
            case 45:
                {
                alt44=2;
                }
                break;
            case RULE_ID:
                {
                alt44=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }

            switch (alt44) {
                case 1 :
                    // InternalMyDsl.g:2667:3: this_Bracket_0= ruleBracket
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getBracketParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Bracket_0=ruleBracket();

                    state._fsp--;


                    			current = this_Bracket_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:2676:3: this_Prefix_1= rulePrefix
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getPrefixParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Prefix_1=rulePrefix();

                    state._fsp--;


                    			current = this_Prefix_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:2685:3: this_FunctionCall_2= ruleFunctionCall
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getFunctionCallParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_FunctionCall_2=ruleFunctionCall();

                    state._fsp--;


                    			current = this_FunctionCall_2;
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
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleBracket"
    // InternalMyDsl.g:2697:1: entryRuleBracket returns [EObject current=null] : iv_ruleBracket= ruleBracket EOF ;
    public final EObject entryRuleBracket() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBracket = null;


        try {
            // InternalMyDsl.g:2697:48: (iv_ruleBracket= ruleBracket EOF )
            // InternalMyDsl.g:2698:2: iv_ruleBracket= ruleBracket EOF
            {
             newCompositeNode(grammarAccess.getBracketRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBracket=ruleBracket();

            state._fsp--;

             current =iv_ruleBracket; 
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
    // $ANTLR end "entryRuleBracket"


    // $ANTLR start "ruleBracket"
    // InternalMyDsl.g:2704:1: ruleBracket returns [EObject current=null] : (otherlv_0= '(' ( (lv_child_1_0= ruleRootExpression ) ) otherlv_2= ')' ) ;
    public final EObject ruleBracket() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_child_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2710:2: ( (otherlv_0= '(' ( (lv_child_1_0= ruleRootExpression ) ) otherlv_2= ')' ) )
            // InternalMyDsl.g:2711:2: (otherlv_0= '(' ( (lv_child_1_0= ruleRootExpression ) ) otherlv_2= ')' )
            {
            // InternalMyDsl.g:2711:2: (otherlv_0= '(' ( (lv_child_1_0= ruleRootExpression ) ) otherlv_2= ')' )
            // InternalMyDsl.g:2712:3: otherlv_0= '(' ( (lv_child_1_0= ruleRootExpression ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getBracketAccess().getLeftParenthesisKeyword_0());
            		
            // InternalMyDsl.g:2716:3: ( (lv_child_1_0= ruleRootExpression ) )
            // InternalMyDsl.g:2717:4: (lv_child_1_0= ruleRootExpression )
            {
            // InternalMyDsl.g:2717:4: (lv_child_1_0= ruleRootExpression )
            // InternalMyDsl.g:2718:5: lv_child_1_0= ruleRootExpression
            {

            					newCompositeNode(grammarAccess.getBracketAccess().getChildRootExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_21);
            lv_child_1_0=ruleRootExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBracketRule());
            					}
            					set(
            						current,
            						"child",
            						lv_child_1_0,
            						"org.xtext.sampleProj.mydsl.MyDsl.RootExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,33,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getBracketAccess().getRightParenthesisKeyword_2());
            		

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
    // $ANTLR end "ruleBracket"


    // $ANTLR start "entryRuleFunctionCall"
    // InternalMyDsl.g:2743:1: entryRuleFunctionCall returns [EObject current=null] : iv_ruleFunctionCall= ruleFunctionCall EOF ;
    public final EObject entryRuleFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCall = null;


        try {
            // InternalMyDsl.g:2743:53: (iv_ruleFunctionCall= ruleFunctionCall EOF )
            // InternalMyDsl.g:2744:2: iv_ruleFunctionCall= ruleFunctionCall EOF
            {
             newCompositeNode(grammarAccess.getFunctionCallRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunctionCall=ruleFunctionCall();

            state._fsp--;

             current =iv_ruleFunctionCall; 
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
    // $ANTLR end "entryRuleFunctionCall"


    // $ANTLR start "ruleFunctionCall"
    // InternalMyDsl.g:2750:1: ruleFunctionCall returns [EObject current=null] : ( ( (lv_typeInst_0_0= ruleTypeInstance ) ) (otherlv_1= '(' ( (lv_arguments_2_0= ruleRootExpression ) )? (otherlv_3= ',' ( (lv_arguments_4_0= ruleRootExpression ) ) )* otherlv_5= ')' )? ) ;
    public final EObject ruleFunctionCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_typeInst_0_0 = null;

        EObject lv_arguments_2_0 = null;

        EObject lv_arguments_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2756:2: ( ( ( (lv_typeInst_0_0= ruleTypeInstance ) ) (otherlv_1= '(' ( (lv_arguments_2_0= ruleRootExpression ) )? (otherlv_3= ',' ( (lv_arguments_4_0= ruleRootExpression ) ) )* otherlv_5= ')' )? ) )
            // InternalMyDsl.g:2757:2: ( ( (lv_typeInst_0_0= ruleTypeInstance ) ) (otherlv_1= '(' ( (lv_arguments_2_0= ruleRootExpression ) )? (otherlv_3= ',' ( (lv_arguments_4_0= ruleRootExpression ) ) )* otherlv_5= ')' )? )
            {
            // InternalMyDsl.g:2757:2: ( ( (lv_typeInst_0_0= ruleTypeInstance ) ) (otherlv_1= '(' ( (lv_arguments_2_0= ruleRootExpression ) )? (otherlv_3= ',' ( (lv_arguments_4_0= ruleRootExpression ) ) )* otherlv_5= ')' )? )
            // InternalMyDsl.g:2758:3: ( (lv_typeInst_0_0= ruleTypeInstance ) ) (otherlv_1= '(' ( (lv_arguments_2_0= ruleRootExpression ) )? (otherlv_3= ',' ( (lv_arguments_4_0= ruleRootExpression ) ) )* otherlv_5= ')' )?
            {
            // InternalMyDsl.g:2758:3: ( (lv_typeInst_0_0= ruleTypeInstance ) )
            // InternalMyDsl.g:2759:4: (lv_typeInst_0_0= ruleTypeInstance )
            {
            // InternalMyDsl.g:2759:4: (lv_typeInst_0_0= ruleTypeInstance )
            // InternalMyDsl.g:2760:5: lv_typeInst_0_0= ruleTypeInstance
            {

            					newCompositeNode(grammarAccess.getFunctionCallAccess().getTypeInstTypeInstanceParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_28);
            lv_typeInst_0_0=ruleTypeInstance();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFunctionCallRule());
            					}
            					set(
            						current,
            						"typeInst",
            						lv_typeInst_0_0,
            						"org.xtext.sampleProj.mydsl.MyDsl.TypeInstance");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:2777:3: (otherlv_1= '(' ( (lv_arguments_2_0= ruleRootExpression ) )? (otherlv_3= ',' ( (lv_arguments_4_0= ruleRootExpression ) ) )* otherlv_5= ')' )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==32) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalMyDsl.g:2778:4: otherlv_1= '(' ( (lv_arguments_2_0= ruleRootExpression ) )? (otherlv_3= ',' ( (lv_arguments_4_0= ruleRootExpression ) ) )* otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,32,FOLLOW_43); 

                    				newLeafNode(otherlv_1, grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalMyDsl.g:2782:4: ( (lv_arguments_2_0= ruleRootExpression ) )?
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==RULE_ID||LA45_0==32||(LA45_0>=41 && LA45_0<=43)||LA45_0==45) ) {
                        alt45=1;
                    }
                    switch (alt45) {
                        case 1 :
                            // InternalMyDsl.g:2783:5: (lv_arguments_2_0= ruleRootExpression )
                            {
                            // InternalMyDsl.g:2783:5: (lv_arguments_2_0= ruleRootExpression )
                            // InternalMyDsl.g:2784:6: lv_arguments_2_0= ruleRootExpression
                            {

                            						newCompositeNode(grammarAccess.getFunctionCallAccess().getArgumentsRootExpressionParserRuleCall_1_1_0());
                            					
                            pushFollow(FOLLOW_36);
                            lv_arguments_2_0=ruleRootExpression();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getFunctionCallRule());
                            						}
                            						add(
                            							current,
                            							"arguments",
                            							lv_arguments_2_0,
                            							"org.xtext.sampleProj.mydsl.MyDsl.RootExpression");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    // InternalMyDsl.g:2801:4: (otherlv_3= ',' ( (lv_arguments_4_0= ruleRootExpression ) ) )*
                    loop46:
                    do {
                        int alt46=2;
                        int LA46_0 = input.LA(1);

                        if ( (LA46_0==21) ) {
                            alt46=1;
                        }


                        switch (alt46) {
                    	case 1 :
                    	    // InternalMyDsl.g:2802:5: otherlv_3= ',' ( (lv_arguments_4_0= ruleRootExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,21,FOLLOW_24); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getFunctionCallAccess().getCommaKeyword_1_2_0());
                    	    				
                    	    // InternalMyDsl.g:2806:5: ( (lv_arguments_4_0= ruleRootExpression ) )
                    	    // InternalMyDsl.g:2807:6: (lv_arguments_4_0= ruleRootExpression )
                    	    {
                    	    // InternalMyDsl.g:2807:6: (lv_arguments_4_0= ruleRootExpression )
                    	    // InternalMyDsl.g:2808:7: lv_arguments_4_0= ruleRootExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getFunctionCallAccess().getArgumentsRootExpressionParserRuleCall_1_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_36);
                    	    lv_arguments_4_0=ruleRootExpression();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getFunctionCallRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"arguments",
                    	    								lv_arguments_4_0,
                    	    								"org.xtext.sampleProj.mydsl.MyDsl.RootExpression");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop46;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,33,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getFunctionCallAccess().getRightParenthesisKeyword_1_3());
                    			

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
    // $ANTLR end "ruleFunctionCall"


    // $ANTLR start "entryRuleExpressionType"
    // InternalMyDsl.g:2835:1: entryRuleExpressionType returns [EObject current=null] : iv_ruleExpressionType= ruleExpressionType EOF ;
    public final EObject entryRuleExpressionType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionType = null;


        try {
            // InternalMyDsl.g:2835:55: (iv_ruleExpressionType= ruleExpressionType EOF )
            // InternalMyDsl.g:2836:2: iv_ruleExpressionType= ruleExpressionType EOF
            {
             newCompositeNode(grammarAccess.getExpressionTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpressionType=ruleExpressionType();

            state._fsp--;

             current =iv_ruleExpressionType; 
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
    // $ANTLR end "entryRuleExpressionType"


    // $ANTLR start "ruleExpressionType"
    // InternalMyDsl.g:2842:1: ruleExpressionType returns [EObject current=null] : this_TypeName_0= ruleTypeName ;
    public final EObject ruleExpressionType() throws RecognitionException {
        EObject current = null;

        EObject this_TypeName_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2848:2: (this_TypeName_0= ruleTypeName )
            // InternalMyDsl.g:2849:2: this_TypeName_0= ruleTypeName
            {

            		newCompositeNode(grammarAccess.getExpressionTypeAccess().getTypeNameParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_TypeName_0=ruleTypeName();

            state._fsp--;


            		current = this_TypeName_0;
            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleExpressionType"


    // $ANTLR start "entryRuleTypeInstance"
    // InternalMyDsl.g:2860:1: entryRuleTypeInstance returns [EObject current=null] : iv_ruleTypeInstance= ruleTypeInstance EOF ;
    public final EObject entryRuleTypeInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeInstance = null;


        try {
            // InternalMyDsl.g:2860:53: (iv_ruleTypeInstance= ruleTypeInstance EOF )
            // InternalMyDsl.g:2861:2: iv_ruleTypeInstance= ruleTypeInstance EOF
            {
             newCompositeNode(grammarAccess.getTypeInstanceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTypeInstance=ruleTypeInstance();

            state._fsp--;

             current =iv_ruleTypeInstance; 
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
    // $ANTLR end "entryRuleTypeInstance"


    // $ANTLR start "ruleTypeInstance"
    // InternalMyDsl.g:2867:1: ruleTypeInstance returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) | ( ( (otherlv_1= RULE_ID ) ) (otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )+ ) ) ;
    public final EObject ruleTypeInstance() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2873:2: ( ( ( (otherlv_0= RULE_ID ) ) | ( ( (otherlv_1= RULE_ID ) ) (otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )+ ) ) )
            // InternalMyDsl.g:2874:2: ( ( (otherlv_0= RULE_ID ) ) | ( ( (otherlv_1= RULE_ID ) ) (otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )+ ) )
            {
            // InternalMyDsl.g:2874:2: ( ( (otherlv_0= RULE_ID ) ) | ( ( (otherlv_1= RULE_ID ) ) (otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )+ ) )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==RULE_ID) ) {
                int LA49_1 = input.LA(2);

                if ( (LA49_1==EOF||LA49_1==RULE_ID||(LA49_1>=16 && LA49_1<=18)||LA49_1==21||(LA49_1>=32 && LA49_1<=33)||LA49_1==36||LA49_1==40||(LA49_1>=46 && LA49_1<=51)) ) {
                    alt49=1;
                }
                else if ( (LA49_1==14) ) {
                    alt49=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 49, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // InternalMyDsl.g:2875:3: ( (otherlv_0= RULE_ID ) )
                    {
                    // InternalMyDsl.g:2875:3: ( (otherlv_0= RULE_ID ) )
                    // InternalMyDsl.g:2876:4: (otherlv_0= RULE_ID )
                    {
                    // InternalMyDsl.g:2876:4: (otherlv_0= RULE_ID )
                    // InternalMyDsl.g:2877:5: otherlv_0= RULE_ID
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTypeInstanceRule());
                    					}
                    				
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(otherlv_0, grammarAccess.getTypeInstanceAccess().getInstanceExpressionVariableCrossReference_0_0());
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:2889:3: ( ( (otherlv_1= RULE_ID ) ) (otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )+ )
                    {
                    // InternalMyDsl.g:2889:3: ( ( (otherlv_1= RULE_ID ) ) (otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )+ )
                    // InternalMyDsl.g:2890:4: ( (otherlv_1= RULE_ID ) ) (otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )+
                    {
                    // InternalMyDsl.g:2890:4: ( (otherlv_1= RULE_ID ) )
                    // InternalMyDsl.g:2891:5: (otherlv_1= RULE_ID )
                    {
                    // InternalMyDsl.g:2891:5: (otherlv_1= RULE_ID )
                    // InternalMyDsl.g:2892:6: otherlv_1= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTypeInstanceRule());
                    						}
                    					
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_6); 

                    						newLeafNode(otherlv_1, grammarAccess.getTypeInstanceAccess().getTypeNameGenNameCrossReference_1_0_0());
                    					

                    }


                    }

                    // InternalMyDsl.g:2903:4: (otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )+
                    int cnt48=0;
                    loop48:
                    do {
                        int alt48=2;
                        int LA48_0 = input.LA(1);

                        if ( (LA48_0==14) ) {
                            alt48=1;
                        }


                        switch (alt48) {
                    	case 1 :
                    	    // InternalMyDsl.g:2904:5: otherlv_2= '.' ( (otherlv_3= RULE_ID ) )
                    	    {
                    	    otherlv_2=(Token)match(input,14,FOLLOW_5); 

                    	    					newLeafNode(otherlv_2, grammarAccess.getTypeInstanceAccess().getFullStopKeyword_1_1_0());
                    	    				
                    	    // InternalMyDsl.g:2908:5: ( (otherlv_3= RULE_ID ) )
                    	    // InternalMyDsl.g:2909:6: (otherlv_3= RULE_ID )
                    	    {
                    	    // InternalMyDsl.g:2909:6: (otherlv_3= RULE_ID )
                    	    // InternalMyDsl.g:2910:7: otherlv_3= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getTypeInstanceRule());
                    	    							}
                    	    						
                    	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_44); 

                    	    							newLeafNode(otherlv_3, grammarAccess.getTypeInstanceAccess().getElementTypedVariableCrossReference_1_1_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt48 >= 1 ) break loop48;
                                EarlyExitException eee =
                                    new EarlyExitException(48, input);
                                throw eee;
                        }
                        cnt48++;
                    } while (true);


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
    // $ANTLR end "ruleTypeInstance"


    // $ANTLR start "entryRuleInbuiltInfix"
    // InternalMyDsl.g:2927:1: entryRuleInbuiltInfix returns [String current=null] : iv_ruleInbuiltInfix= ruleInbuiltInfix EOF ;
    public final String entryRuleInbuiltInfix() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInbuiltInfix = null;


        try {
            // InternalMyDsl.g:2927:52: (iv_ruleInbuiltInfix= ruleInbuiltInfix EOF )
            // InternalMyDsl.g:2928:2: iv_ruleInbuiltInfix= ruleInbuiltInfix EOF
            {
             newCompositeNode(grammarAccess.getInbuiltInfixRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInbuiltInfix=ruleInbuiltInfix();

            state._fsp--;

             current =iv_ruleInbuiltInfix.getText(); 
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
    // $ANTLR end "entryRuleInbuiltInfix"


    // $ANTLR start "ruleInbuiltInfix"
    // InternalMyDsl.g:2934:1: ruleInbuiltInfix returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '\\u21D4' | kw= '\\u21D2' | kw= '=' | kw= '\\u2260' | kw= '\\u2227' | kw= '\\u2228' ) ;
    public final AntlrDatatypeRuleToken ruleInbuiltInfix() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2940:2: ( (kw= '\\u21D4' | kw= '\\u21D2' | kw= '=' | kw= '\\u2260' | kw= '\\u2227' | kw= '\\u2228' ) )
            // InternalMyDsl.g:2941:2: (kw= '\\u21D4' | kw= '\\u21D2' | kw= '=' | kw= '\\u2260' | kw= '\\u2227' | kw= '\\u2228' )
            {
            // InternalMyDsl.g:2941:2: (kw= '\\u21D4' | kw= '\\u21D2' | kw= '=' | kw= '\\u2260' | kw= '\\u2227' | kw= '\\u2228' )
            int alt50=6;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt50=1;
                }
                break;
            case 47:
                {
                alt50=2;
                }
                break;
            case 48:
                {
                alt50=3;
                }
                break;
            case 49:
                {
                alt50=4;
                }
                break;
            case 50:
                {
                alt50=5;
                }
                break;
            case 51:
                {
                alt50=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }

            switch (alt50) {
                case 1 :
                    // InternalMyDsl.g:2942:3: kw= '\\u21D4'
                    {
                    kw=(Token)match(input,46,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getInbuiltInfixAccess().getLeftRightDoubleArrowKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:2948:3: kw= '\\u21D2'
                    {
                    kw=(Token)match(input,47,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getInbuiltInfixAccess().getRightwardsDoubleArrowKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:2954:3: kw= '='
                    {
                    kw=(Token)match(input,48,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getInbuiltInfixAccess().getEqualsSignKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:2960:3: kw= '\\u2260'
                    {
                    kw=(Token)match(input,49,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getInbuiltInfixAccess().getNotEqualToKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:2966:3: kw= '\\u2227'
                    {
                    kw=(Token)match(input,50,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getInbuiltInfixAccess().getLogicalAndKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:2972:3: kw= '\\u2228'
                    {
                    kw=(Token)match(input,51,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getInbuiltInfixAccess().getLogicalOrKeyword_5());
                    		

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
    // $ANTLR end "ruleInbuiltInfix"


    // $ANTLR start "entryRuleInbuiltType"
    // InternalMyDsl.g:2981:1: entryRuleInbuiltType returns [String current=null] : iv_ruleInbuiltType= ruleInbuiltType EOF ;
    public final String entryRuleInbuiltType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInbuiltType = null;


        try {
            // InternalMyDsl.g:2981:51: (iv_ruleInbuiltType= ruleInbuiltType EOF )
            // InternalMyDsl.g:2982:2: iv_ruleInbuiltType= ruleInbuiltType EOF
            {
             newCompositeNode(grammarAccess.getInbuiltTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInbuiltType=ruleInbuiltType();

            state._fsp--;

             current =iv_ruleInbuiltType.getText(); 
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
    // $ANTLR end "entryRuleInbuiltType"


    // $ANTLR start "ruleInbuiltType"
    // InternalMyDsl.g:2988:1: ruleInbuiltType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'Pred' ;
    public final AntlrDatatypeRuleToken ruleInbuiltType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2994:2: (kw= 'Pred' )
            // InternalMyDsl.g:2995:2: kw= 'Pred'
            {
            kw=(Token)match(input,52,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getInbuiltTypeAccess().getPredKeyword());
            	

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
    // $ANTLR end "ruleInbuiltType"


    // $ANTLR start "entryRuleInbuiltTypeScan"
    // InternalMyDsl.g:3003:1: entryRuleInbuiltTypeScan returns [EObject current=null] : iv_ruleInbuiltTypeScan= ruleInbuiltTypeScan EOF ;
    public final EObject entryRuleInbuiltTypeScan() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInbuiltTypeScan = null;


        try {
            // InternalMyDsl.g:3003:56: (iv_ruleInbuiltTypeScan= ruleInbuiltTypeScan EOF )
            // InternalMyDsl.g:3004:2: iv_ruleInbuiltTypeScan= ruleInbuiltTypeScan EOF
            {
             newCompositeNode(grammarAccess.getInbuiltTypeScanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInbuiltTypeScan=ruleInbuiltTypeScan();

            state._fsp--;

             current =iv_ruleInbuiltTypeScan; 
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
    // $ANTLR end "entryRuleInbuiltTypeScan"


    // $ANTLR start "ruleInbuiltTypeScan"
    // InternalMyDsl.g:3010:1: ruleInbuiltTypeScan returns [EObject current=null] : ( (lv_name_0_0= ruleInbuiltType ) ) ;
    public final EObject ruleInbuiltTypeScan() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:3016:2: ( ( (lv_name_0_0= ruleInbuiltType ) ) )
            // InternalMyDsl.g:3017:2: ( (lv_name_0_0= ruleInbuiltType ) )
            {
            // InternalMyDsl.g:3017:2: ( (lv_name_0_0= ruleInbuiltType ) )
            // InternalMyDsl.g:3018:3: (lv_name_0_0= ruleInbuiltType )
            {
            // InternalMyDsl.g:3018:3: (lv_name_0_0= ruleInbuiltType )
            // InternalMyDsl.g:3019:4: lv_name_0_0= ruleInbuiltType
            {

            				newCompositeNode(grammarAccess.getInbuiltTypeScanAccess().getNameInbuiltTypeParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_name_0_0=ruleInbuiltType();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getInbuiltTypeScanRule());
            				}
            				set(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.xtext.sampleProj.mydsl.MyDsl.InbuiltType");
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
    // $ANTLR end "ruleInbuiltTypeScan"


    // $ANTLR start "entryRuleInstance"
    // InternalMyDsl.g:3039:1: entryRuleInstance returns [EObject current=null] : iv_ruleInstance= ruleInstance EOF ;
    public final EObject entryRuleInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstance = null;


        try {
            // InternalMyDsl.g:3039:49: (iv_ruleInstance= ruleInstance EOF )
            // InternalMyDsl.g:3040:2: iv_ruleInstance= ruleInstance EOF
            {
             newCompositeNode(grammarAccess.getInstanceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInstance=ruleInstance();

            state._fsp--;

             current =iv_ruleInstance; 
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
    // $ANTLR end "entryRuleInstance"


    // $ANTLR start "ruleInstance"
    // InternalMyDsl.g:3046:1: ruleInstance returns [EObject current=null] : (otherlv_0= 'Instance' ( (otherlv_1= RULE_ID ) ) ( (lv_context_2_0= ruleTypeDeclContext ) ) otherlv_3= '(' ( (lv_arguments_4_0= ruleRootExpression ) )? (otherlv_5= ',' ( (lv_arguments_6_0= ruleRootExpression ) ) )* otherlv_7= ')' ) ;
    public final EObject ruleInstance() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_context_2_0 = null;

        EObject lv_arguments_4_0 = null;

        EObject lv_arguments_6_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:3052:2: ( (otherlv_0= 'Instance' ( (otherlv_1= RULE_ID ) ) ( (lv_context_2_0= ruleTypeDeclContext ) ) otherlv_3= '(' ( (lv_arguments_4_0= ruleRootExpression ) )? (otherlv_5= ',' ( (lv_arguments_6_0= ruleRootExpression ) ) )* otherlv_7= ')' ) )
            // InternalMyDsl.g:3053:2: (otherlv_0= 'Instance' ( (otherlv_1= RULE_ID ) ) ( (lv_context_2_0= ruleTypeDeclContext ) ) otherlv_3= '(' ( (lv_arguments_4_0= ruleRootExpression ) )? (otherlv_5= ',' ( (lv_arguments_6_0= ruleRootExpression ) ) )* otherlv_7= ')' )
            {
            // InternalMyDsl.g:3053:2: (otherlv_0= 'Instance' ( (otherlv_1= RULE_ID ) ) ( (lv_context_2_0= ruleTypeDeclContext ) ) otherlv_3= '(' ( (lv_arguments_4_0= ruleRootExpression ) )? (otherlv_5= ',' ( (lv_arguments_6_0= ruleRootExpression ) ) )* otherlv_7= ')' )
            // InternalMyDsl.g:3054:3: otherlv_0= 'Instance' ( (otherlv_1= RULE_ID ) ) ( (lv_context_2_0= ruleTypeDeclContext ) ) otherlv_3= '(' ( (lv_arguments_4_0= ruleRootExpression ) )? (otherlv_5= ',' ( (lv_arguments_6_0= ruleRootExpression ) ) )* otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,53,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getInstanceAccess().getInstanceKeyword_0());
            		
            // InternalMyDsl.g:3058:3: ( (otherlv_1= RULE_ID ) )
            // InternalMyDsl.g:3059:4: (otherlv_1= RULE_ID )
            {
            // InternalMyDsl.g:3059:4: (otherlv_1= RULE_ID )
            // InternalMyDsl.g:3060:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInstanceRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_45); 

            					newLeafNode(otherlv_1, grammarAccess.getInstanceAccess().getClassNameTypeNameCrossReference_1_0());
            				

            }


            }

            // InternalMyDsl.g:3071:3: ( (lv_context_2_0= ruleTypeDeclContext ) )
            // InternalMyDsl.g:3072:4: (lv_context_2_0= ruleTypeDeclContext )
            {
            // InternalMyDsl.g:3072:4: (lv_context_2_0= ruleTypeDeclContext )
            // InternalMyDsl.g:3073:5: lv_context_2_0= ruleTypeDeclContext
            {

            					newCompositeNode(grammarAccess.getInstanceAccess().getContextTypeDeclContextParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_29);
            lv_context_2_0=ruleTypeDeclContext();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInstanceRule());
            					}
            					set(
            						current,
            						"context",
            						lv_context_2_0,
            						"org.xtext.sampleProj.mydsl.MyDsl.TypeDeclContext");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,32,FOLLOW_43); 

            			newLeafNode(otherlv_3, grammarAccess.getInstanceAccess().getLeftParenthesisKeyword_3());
            		
            // InternalMyDsl.g:3094:3: ( (lv_arguments_4_0= ruleRootExpression ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_ID||LA51_0==32||(LA51_0>=41 && LA51_0<=43)||LA51_0==45) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalMyDsl.g:3095:4: (lv_arguments_4_0= ruleRootExpression )
                    {
                    // InternalMyDsl.g:3095:4: (lv_arguments_4_0= ruleRootExpression )
                    // InternalMyDsl.g:3096:5: lv_arguments_4_0= ruleRootExpression
                    {

                    					newCompositeNode(grammarAccess.getInstanceAccess().getArgumentsRootExpressionParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_36);
                    lv_arguments_4_0=ruleRootExpression();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getInstanceRule());
                    					}
                    					add(
                    						current,
                    						"arguments",
                    						lv_arguments_4_0,
                    						"org.xtext.sampleProj.mydsl.MyDsl.RootExpression");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:3113:3: (otherlv_5= ',' ( (lv_arguments_6_0= ruleRootExpression ) ) )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==21) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // InternalMyDsl.g:3114:4: otherlv_5= ',' ( (lv_arguments_6_0= ruleRootExpression ) )
            	    {
            	    otherlv_5=(Token)match(input,21,FOLLOW_24); 

            	    				newLeafNode(otherlv_5, grammarAccess.getInstanceAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalMyDsl.g:3118:4: ( (lv_arguments_6_0= ruleRootExpression ) )
            	    // InternalMyDsl.g:3119:5: (lv_arguments_6_0= ruleRootExpression )
            	    {
            	    // InternalMyDsl.g:3119:5: (lv_arguments_6_0= ruleRootExpression )
            	    // InternalMyDsl.g:3120:6: lv_arguments_6_0= ruleRootExpression
            	    {

            	    						newCompositeNode(grammarAccess.getInstanceAccess().getArgumentsRootExpressionParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_36);
            	    lv_arguments_6_0=ruleRootExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getInstanceRule());
            	    						}
            	    						add(
            	    							current,
            	    							"arguments",
            	    							lv_arguments_6_0,
            	    							"org.xtext.sampleProj.mydsl.MyDsl.RootExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);

            otherlv_7=(Token)match(input,33,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getInstanceAccess().getRightParenthesisKeyword_6());
            		

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
    // $ANTLR end "ruleInstance"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x002000280000A002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000005000B1000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000500031000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000500030000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000400030000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000010000040010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0010000000000010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000000FFC00002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00002E0100000010L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000001000080000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000001000020000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000100080000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000200000010L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x00002EC100000030L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000100001000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000200200000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000041800L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000201000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x000FC00000000012L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x00002E0300200010L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000080000L});

}