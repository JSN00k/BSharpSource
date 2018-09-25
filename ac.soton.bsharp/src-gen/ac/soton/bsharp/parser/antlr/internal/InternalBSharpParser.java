package ac.soton.bsharp.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import ac.soton.bsharp.services.BSharpGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBSharpParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_WS", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ANY_OTHER", "':'", "'Pred'", "'.'", "'.*'", "'Import'", "'Class'", "';'", "'{'", "'}'", "'<'", "'>'", "','", "'\\u00D7'", "'\\u2192'", "'\\uE102'", "'\\uE100'", "'\\u2194'", "'\\u2916'", "'\\u21F8'", "'\\u21A3'", "'\\u2900'", "'\\u21A0'", "'('", "')'", "'where'", "'Datatype'", "'|'", "'Extend'", "'INFIX'", "'match'", "'Theorems'", "'\\u03BB'", "'\\u2200'", "'\\u2203'", "'\\u00B7'", "'\\u00AC'", "'\\u21D4'", "'\\u21D2'", "'='", "'\\u2260'", "'\\u2227'", "'\\u2228'", "'Instance'"
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

        public InternalBSharpParser(TokenStream input, BSharpGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "DomainModel";
       	}

       	@Override
       	protected BSharpGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleDomainModel"
    // InternalBSharp.g:64:1: entryRuleDomainModel returns [EObject current=null] : iv_ruleDomainModel= ruleDomainModel EOF ;
    public final EObject entryRuleDomainModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainModel = null;


        try {
            // InternalBSharp.g:64:52: (iv_ruleDomainModel= ruleDomainModel EOF )
            // InternalBSharp.g:65:2: iv_ruleDomainModel= ruleDomainModel EOF
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
    // InternalBSharp.g:71:1: ruleDomainModel returns [EObject current=null] : ( (lv_elements_0_0= ruleTopLevel ) )* ;
    public final EObject ruleDomainModel() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:77:2: ( ( (lv_elements_0_0= ruleTopLevel ) )* )
            // InternalBSharp.g:78:2: ( (lv_elements_0_0= ruleTopLevel ) )*
            {
            // InternalBSharp.g:78:2: ( (lv_elements_0_0= ruleTopLevel ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=15 && LA1_0<=16)||LA1_0==36||LA1_0==38||LA1_0==53) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalBSharp.g:79:3: (lv_elements_0_0= ruleTopLevel )
            	    {
            	    // InternalBSharp.g:79:3: (lv_elements_0_0= ruleTopLevel )
            	    // InternalBSharp.g:80:4: lv_elements_0_0= ruleTopLevel
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
            	    					"ac.soton.bsharp.BSharp.TopLevel");
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
    // InternalBSharp.g:100:1: entryRuleTHM_NAME returns [String current=null] : iv_ruleTHM_NAME= ruleTHM_NAME EOF ;
    public final String entryRuleTHM_NAME() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTHM_NAME = null;


        try {
            // InternalBSharp.g:100:48: (iv_ruleTHM_NAME= ruleTHM_NAME EOF )
            // InternalBSharp.g:101:2: iv_ruleTHM_NAME= ruleTHM_NAME EOF
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
    // InternalBSharp.g:107:1: ruleTHM_NAME returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_INT_0= RULE_INT | this_ID_1= RULE_ID | this_WS_2= RULE_WS )* kw= ':' ) ;
    public final AntlrDatatypeRuleToken ruleTHM_NAME() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_ID_1=null;
        Token this_WS_2=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalBSharp.g:113:2: ( ( (this_INT_0= RULE_INT | this_ID_1= RULE_ID | this_WS_2= RULE_WS )* kw= ':' ) )
            // InternalBSharp.g:114:2: ( (this_INT_0= RULE_INT | this_ID_1= RULE_ID | this_WS_2= RULE_WS )* kw= ':' )
            {
            // InternalBSharp.g:114:2: ( (this_INT_0= RULE_INT | this_ID_1= RULE_ID | this_WS_2= RULE_WS )* kw= ':' )
            // InternalBSharp.g:115:3: (this_INT_0= RULE_INT | this_ID_1= RULE_ID | this_WS_2= RULE_WS )* kw= ':'
            {
            // InternalBSharp.g:115:3: (this_INT_0= RULE_INT | this_ID_1= RULE_ID | this_WS_2= RULE_WS )*
            loop2:
            do {
                int alt2=4;
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

                }

                switch (alt2) {
            	case 1 :
            	    // InternalBSharp.g:116:4: this_INT_0= RULE_INT
            	    {
            	    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_4); 

            	    				current.merge(this_INT_0);
            	    			

            	    				newLeafNode(this_INT_0, grammarAccess.getTHM_NAMEAccess().getINTTerminalRuleCall_0_0());
            	    			

            	    }
            	    break;
            	case 2 :
            	    // InternalBSharp.g:124:4: this_ID_1= RULE_ID
            	    {
            	    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_4); 

            	    				current.merge(this_ID_1);
            	    			

            	    				newLeafNode(this_ID_1, grammarAccess.getTHM_NAMEAccess().getIDTerminalRuleCall_0_1());
            	    			

            	    }
            	    break;
            	case 3 :
            	    // InternalBSharp.g:132:4: this_WS_2= RULE_WS
            	    {
            	    this_WS_2=(Token)match(input,RULE_WS,FOLLOW_4); 

            	    				current.merge(this_WS_2);
            	    			

            	    				newLeafNode(this_WS_2, grammarAccess.getTHM_NAMEAccess().getWSTerminalRuleCall_0_2());
            	    			

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
    // InternalBSharp.g:149:1: entryRuleTopLevel returns [EObject current=null] : iv_ruleTopLevel= ruleTopLevel EOF ;
    public final EObject entryRuleTopLevel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTopLevel = null;


        try {
            // InternalBSharp.g:149:49: (iv_ruleTopLevel= ruleTopLevel EOF )
            // InternalBSharp.g:150:2: iv_ruleTopLevel= ruleTopLevel EOF
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
    // InternalBSharp.g:156:1: ruleTopLevel returns [EObject current=null] : (this_ImportStatement_0= ruleImportStatement | this_ClassDecl_1= ruleClassDecl | this_Extend_2= ruleExtend | this_Instance_3= ruleInstance ) ;
    public final EObject ruleTopLevel() throws RecognitionException {
        EObject current = null;

        EObject this_ImportStatement_0 = null;

        EObject this_ClassDecl_1 = null;

        EObject this_Extend_2 = null;

        EObject this_Instance_3 = null;



        	enterRule();

        try {
            // InternalBSharp.g:162:2: ( (this_ImportStatement_0= ruleImportStatement | this_ClassDecl_1= ruleClassDecl | this_Extend_2= ruleExtend | this_Instance_3= ruleInstance ) )
            // InternalBSharp.g:163:2: (this_ImportStatement_0= ruleImportStatement | this_ClassDecl_1= ruleClassDecl | this_Extend_2= ruleExtend | this_Instance_3= ruleInstance )
            {
            // InternalBSharp.g:163:2: (this_ImportStatement_0= ruleImportStatement | this_ClassDecl_1= ruleClassDecl | this_Extend_2= ruleExtend | this_Instance_3= ruleInstance )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt3=1;
                }
                break;
            case 16:
            case 36:
                {
                alt3=2;
                }
                break;
            case 38:
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
                    // InternalBSharp.g:164:3: this_ImportStatement_0= ruleImportStatement
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
                    // InternalBSharp.g:173:3: this_ClassDecl_1= ruleClassDecl
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
                    // InternalBSharp.g:182:3: this_Extend_2= ruleExtend
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
                    // InternalBSharp.g:191:3: this_Instance_3= ruleInstance
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


    // $ANTLR start "entryRuleClassDecl"
    // InternalBSharp.g:203:1: entryRuleClassDecl returns [EObject current=null] : iv_ruleClassDecl= ruleClassDecl EOF ;
    public final EObject entryRuleClassDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassDecl = null;


        try {
            // InternalBSharp.g:203:50: (iv_ruleClassDecl= ruleClassDecl EOF )
            // InternalBSharp.g:204:2: iv_ruleClassDecl= ruleClassDecl EOF
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
    // InternalBSharp.g:210:1: ruleClassDecl returns [EObject current=null] : (this_Class_0= ruleClass | this_Datatype_1= ruleDatatype ) ;
    public final EObject ruleClassDecl() throws RecognitionException {
        EObject current = null;

        EObject this_Class_0 = null;

        EObject this_Datatype_1 = null;



        	enterRule();

        try {
            // InternalBSharp.g:216:2: ( (this_Class_0= ruleClass | this_Datatype_1= ruleDatatype ) )
            // InternalBSharp.g:217:2: (this_Class_0= ruleClass | this_Datatype_1= ruleDatatype )
            {
            // InternalBSharp.g:217:2: (this_Class_0= ruleClass | this_Datatype_1= ruleDatatype )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            else if ( (LA4_0==36) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalBSharp.g:218:3: this_Class_0= ruleClass
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
                    // InternalBSharp.g:227:3: this_Datatype_1= ruleDatatype
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


    // $ANTLR start "entryRuleInbuiltType"
    // InternalBSharp.g:239:1: entryRuleInbuiltType returns [EObject current=null] : iv_ruleInbuiltType= ruleInbuiltType EOF ;
    public final EObject entryRuleInbuiltType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInbuiltType = null;


        try {
            // InternalBSharp.g:239:52: (iv_ruleInbuiltType= ruleInbuiltType EOF )
            // InternalBSharp.g:240:2: iv_ruleInbuiltType= ruleInbuiltType EOF
            {
             newCompositeNode(grammarAccess.getInbuiltTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInbuiltType=ruleInbuiltType();

            state._fsp--;

             current =iv_ruleInbuiltType; 
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
    // InternalBSharp.g:246:1: ruleInbuiltType returns [EObject current=null] : ( (lv_name_0_0= 'Pred' ) ) ;
    public final EObject ruleInbuiltType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalBSharp.g:252:2: ( ( (lv_name_0_0= 'Pred' ) ) )
            // InternalBSharp.g:253:2: ( (lv_name_0_0= 'Pred' ) )
            {
            // InternalBSharp.g:253:2: ( (lv_name_0_0= 'Pred' ) )
            // InternalBSharp.g:254:3: (lv_name_0_0= 'Pred' )
            {
            // InternalBSharp.g:254:3: (lv_name_0_0= 'Pred' )
            // InternalBSharp.g:255:4: lv_name_0_0= 'Pred'
            {
            lv_name_0_0=(Token)match(input,12,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getInbuiltTypeAccess().getNamePredKeyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getInbuiltTypeRule());
            				}
            				setWithLastConsumed(current, "name", lv_name_0_0, "Pred");
            			

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
    // $ANTLR end "ruleInbuiltType"


    // $ANTLR start "entryRuleType"
    // InternalBSharp.g:270:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalBSharp.g:270:45: (iv_ruleType= ruleType EOF )
            // InternalBSharp.g:271:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalBSharp.g:277:1: ruleType returns [EObject current=null] : (this_ClassDecl_0= ruleClassDecl | this_InbuiltType_1= ruleInbuiltType ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_ClassDecl_0 = null;

        EObject this_InbuiltType_1 = null;



        	enterRule();

        try {
            // InternalBSharp.g:283:2: ( (this_ClassDecl_0= ruleClassDecl | this_InbuiltType_1= ruleInbuiltType ) )
            // InternalBSharp.g:284:2: (this_ClassDecl_0= ruleClassDecl | this_InbuiltType_1= ruleInbuiltType )
            {
            // InternalBSharp.g:284:2: (this_ClassDecl_0= ruleClassDecl | this_InbuiltType_1= ruleInbuiltType )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16||LA5_0==36) ) {
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
                    // InternalBSharp.g:285:3: this_ClassDecl_0= ruleClassDecl
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getClassDeclParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ClassDecl_0=ruleClassDecl();

                    state._fsp--;


                    			current = this_ClassDecl_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalBSharp.g:294:3: this_InbuiltType_1= ruleInbuiltType
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getInbuiltTypeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_InbuiltType_1=ruleInbuiltType();

                    state._fsp--;


                    			current = this_InbuiltType_1;
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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalBSharp.g:306:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalBSharp.g:306:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalBSharp.g:307:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalBSharp.g:313:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalBSharp.g:319:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalBSharp.g:320:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalBSharp.g:320:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalBSharp.g:321:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalBSharp.g:328:3: (kw= '.' this_ID_2= RULE_ID )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==13) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalBSharp.g:329:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,13,FOLLOW_6); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_5); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // InternalBSharp.g:346:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // InternalBSharp.g:346:65: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // InternalBSharp.g:347:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;

             current =iv_ruleQualifiedNameWithWildcard.getText(); 
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
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // InternalBSharp.g:353:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:359:2: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // InternalBSharp.g:360:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // InternalBSharp.g:360:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // InternalBSharp.g:361:3: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {

            			newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0());
            		
            pushFollow(FOLLOW_7);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            			current.merge(this_QualifiedName_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalBSharp.g:371:3: (kw= '.*' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==14) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalBSharp.g:372:4: kw= '.*'
                    {
                    kw=(Token)match(input,14,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1());
                    			

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
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleImportStatement"
    // InternalBSharp.g:382:1: entryRuleImportStatement returns [EObject current=null] : iv_ruleImportStatement= ruleImportStatement EOF ;
    public final EObject entryRuleImportStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportStatement = null;


        try {
            // InternalBSharp.g:382:56: (iv_ruleImportStatement= ruleImportStatement EOF )
            // InternalBSharp.g:383:2: iv_ruleImportStatement= ruleImportStatement EOF
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
    // InternalBSharp.g:389:1: ruleImportStatement returns [EObject current=null] : (otherlv_0= 'Import' ( (lv_imports_1_0= ruleQualifiedNameWithWildcard ) )+ ) ;
    public final EObject ruleImportStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_imports_1_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:395:2: ( (otherlv_0= 'Import' ( (lv_imports_1_0= ruleQualifiedNameWithWildcard ) )+ ) )
            // InternalBSharp.g:396:2: (otherlv_0= 'Import' ( (lv_imports_1_0= ruleQualifiedNameWithWildcard ) )+ )
            {
            // InternalBSharp.g:396:2: (otherlv_0= 'Import' ( (lv_imports_1_0= ruleQualifiedNameWithWildcard ) )+ )
            // InternalBSharp.g:397:3: otherlv_0= 'Import' ( (lv_imports_1_0= ruleQualifiedNameWithWildcard ) )+
            {
            otherlv_0=(Token)match(input,15,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getImportStatementAccess().getImportKeyword_0());
            		
            // InternalBSharp.g:401:3: ( (lv_imports_1_0= ruleQualifiedNameWithWildcard ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalBSharp.g:402:4: (lv_imports_1_0= ruleQualifiedNameWithWildcard )
            	    {
            	    // InternalBSharp.g:402:4: (lv_imports_1_0= ruleQualifiedNameWithWildcard )
            	    // InternalBSharp.g:403:5: lv_imports_1_0= ruleQualifiedNameWithWildcard
            	    {

            	    					newCompositeNode(grammarAccess.getImportStatementAccess().getImportsQualifiedNameWithWildcardParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_imports_1_0=ruleQualifiedNameWithWildcard();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getImportStatementRule());
            	    					}
            	    					add(
            	    						current,
            	    						"imports",
            	    						lv_imports_1_0,
            	    						"ac.soton.bsharp.BSharp.QualifiedNameWithWildcard");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
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
    // $ANTLR end "ruleImportStatement"


    // $ANTLR start "entryRuleClass"
    // InternalBSharp.g:424:1: entryRuleClass returns [EObject current=null] : iv_ruleClass= ruleClass EOF ;
    public final EObject entryRuleClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClass = null;


        try {
            // InternalBSharp.g:424:46: (iv_ruleClass= ruleClass EOF )
            // InternalBSharp.g:425:2: iv_ruleClass= ruleClass EOF
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
    // InternalBSharp.g:431:1: ruleClass returns [EObject current=null] : (otherlv_0= 'Class' ( (lv_name_1_0= RULE_ID ) ) ( (lv_context_2_0= rulePolyContext ) )? ( (lv_supertypes_3_0= ruleSuperTypeList ) )? ( (lv_varList_4_0= ruleTypeStructure ) )? ( (lv_where_5_0= ruleWhere ) )? (otherlv_6= ';' )? otherlv_7= '{' ( (lv_bodyElements_8_0= ruleTypeBodyElements ) )* otherlv_9= '}' ) ;
    public final EObject ruleClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_context_2_0 = null;

        EObject lv_supertypes_3_0 = null;

        EObject lv_varList_4_0 = null;

        EObject lv_where_5_0 = null;

        EObject lv_bodyElements_8_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:437:2: ( (otherlv_0= 'Class' ( (lv_name_1_0= RULE_ID ) ) ( (lv_context_2_0= rulePolyContext ) )? ( (lv_supertypes_3_0= ruleSuperTypeList ) )? ( (lv_varList_4_0= ruleTypeStructure ) )? ( (lv_where_5_0= ruleWhere ) )? (otherlv_6= ';' )? otherlv_7= '{' ( (lv_bodyElements_8_0= ruleTypeBodyElements ) )* otherlv_9= '}' ) )
            // InternalBSharp.g:438:2: (otherlv_0= 'Class' ( (lv_name_1_0= RULE_ID ) ) ( (lv_context_2_0= rulePolyContext ) )? ( (lv_supertypes_3_0= ruleSuperTypeList ) )? ( (lv_varList_4_0= ruleTypeStructure ) )? ( (lv_where_5_0= ruleWhere ) )? (otherlv_6= ';' )? otherlv_7= '{' ( (lv_bodyElements_8_0= ruleTypeBodyElements ) )* otherlv_9= '}' )
            {
            // InternalBSharp.g:438:2: (otherlv_0= 'Class' ( (lv_name_1_0= RULE_ID ) ) ( (lv_context_2_0= rulePolyContext ) )? ( (lv_supertypes_3_0= ruleSuperTypeList ) )? ( (lv_varList_4_0= ruleTypeStructure ) )? ( (lv_where_5_0= ruleWhere ) )? (otherlv_6= ';' )? otherlv_7= '{' ( (lv_bodyElements_8_0= ruleTypeBodyElements ) )* otherlv_9= '}' )
            // InternalBSharp.g:439:3: otherlv_0= 'Class' ( (lv_name_1_0= RULE_ID ) ) ( (lv_context_2_0= rulePolyContext ) )? ( (lv_supertypes_3_0= ruleSuperTypeList ) )? ( (lv_varList_4_0= ruleTypeStructure ) )? ( (lv_where_5_0= ruleWhere ) )? (otherlv_6= ';' )? otherlv_7= '{' ( (lv_bodyElements_8_0= ruleTypeBodyElements ) )* otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getClassAccess().getClassKeyword_0());
            		
            // InternalBSharp.g:443:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalBSharp.g:444:4: (lv_name_1_0= RULE_ID )
            {
            // InternalBSharp.g:444:4: (lv_name_1_0= RULE_ID )
            // InternalBSharp.g:445:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_1_0, grammarAccess.getClassAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getClassRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalBSharp.g:461:3: ( (lv_context_2_0= rulePolyContext ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalBSharp.g:462:4: (lv_context_2_0= rulePolyContext )
                    {
                    // InternalBSharp.g:462:4: (lv_context_2_0= rulePolyContext )
                    // InternalBSharp.g:463:5: lv_context_2_0= rulePolyContext
                    {

                    					newCompositeNode(grammarAccess.getClassAccess().getContextPolyContextParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_10);
                    lv_context_2_0=rulePolyContext();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getClassRule());
                    					}
                    					set(
                    						current,
                    						"context",
                    						lv_context_2_0,
                    						"ac.soton.bsharp.BSharp.PolyContext");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalBSharp.g:480:3: ( (lv_supertypes_3_0= ruleSuperTypeList ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==11) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalBSharp.g:481:4: (lv_supertypes_3_0= ruleSuperTypeList )
                    {
                    // InternalBSharp.g:481:4: (lv_supertypes_3_0= ruleSuperTypeList )
                    // InternalBSharp.g:482:5: lv_supertypes_3_0= ruleSuperTypeList
                    {

                    					newCompositeNode(grammarAccess.getClassAccess().getSupertypesSuperTypeListParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_11);
                    lv_supertypes_3_0=ruleSuperTypeList();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getClassRule());
                    					}
                    					set(
                    						current,
                    						"supertypes",
                    						lv_supertypes_3_0,
                    						"ac.soton.bsharp.BSharp.SuperTypeList");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalBSharp.g:499:3: ( (lv_varList_4_0= ruleTypeStructure ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==33) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalBSharp.g:500:4: (lv_varList_4_0= ruleTypeStructure )
                    {
                    // InternalBSharp.g:500:4: (lv_varList_4_0= ruleTypeStructure )
                    // InternalBSharp.g:501:5: lv_varList_4_0= ruleTypeStructure
                    {

                    					newCompositeNode(grammarAccess.getClassAccess().getVarListTypeStructureParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_12);
                    lv_varList_4_0=ruleTypeStructure();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getClassRule());
                    					}
                    					set(
                    						current,
                    						"varList",
                    						lv_varList_4_0,
                    						"ac.soton.bsharp.BSharp.TypeStructure");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalBSharp.g:518:3: ( (lv_where_5_0= ruleWhere ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==35) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalBSharp.g:519:4: (lv_where_5_0= ruleWhere )
                    {
                    // InternalBSharp.g:519:4: (lv_where_5_0= ruleWhere )
                    // InternalBSharp.g:520:5: lv_where_5_0= ruleWhere
                    {

                    					newCompositeNode(grammarAccess.getClassAccess().getWhereWhereParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_13);
                    lv_where_5_0=ruleWhere();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getClassRule());
                    					}
                    					set(
                    						current,
                    						"where",
                    						lv_where_5_0,
                    						"ac.soton.bsharp.BSharp.Where");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalBSharp.g:537:3: (otherlv_6= ';' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==17) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalBSharp.g:538:4: otherlv_6= ';'
                    {
                    otherlv_6=(Token)match(input,17,FOLLOW_14); 

                    				newLeafNode(otherlv_6, grammarAccess.getClassAccess().getSemicolonKeyword_6());
                    			

                    }
                    break;

            }

            otherlv_7=(Token)match(input,18,FOLLOW_15); 

            			newLeafNode(otherlv_7, grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_7());
            		
            // InternalBSharp.g:547:3: ( (lv_bodyElements_8_0= ruleTypeBodyElements ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID||LA14_0==41) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalBSharp.g:548:4: (lv_bodyElements_8_0= ruleTypeBodyElements )
            	    {
            	    // InternalBSharp.g:548:4: (lv_bodyElements_8_0= ruleTypeBodyElements )
            	    // InternalBSharp.g:549:5: lv_bodyElements_8_0= ruleTypeBodyElements
            	    {

            	    					newCompositeNode(grammarAccess.getClassAccess().getBodyElementsTypeBodyElementsParserRuleCall_8_0());
            	    				
            	    pushFollow(FOLLOW_15);
            	    lv_bodyElements_8_0=ruleTypeBodyElements();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getClassRule());
            	    					}
            	    					add(
            	    						current,
            	    						"bodyElements",
            	    						lv_bodyElements_8_0,
            	    						"ac.soton.bsharp.BSharp.TypeBodyElements");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_9=(Token)match(input,19,FOLLOW_2); 

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


    // $ANTLR start "entryRulePolymorphicTypeName"
    // InternalBSharp.g:574:1: entryRulePolymorphicTypeName returns [EObject current=null] : iv_rulePolymorphicTypeName= rulePolymorphicTypeName EOF ;
    public final EObject entryRulePolymorphicTypeName() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePolymorphicTypeName = null;


        try {
            // InternalBSharp.g:574:60: (iv_rulePolymorphicTypeName= rulePolymorphicTypeName EOF )
            // InternalBSharp.g:575:2: iv_rulePolymorphicTypeName= rulePolymorphicTypeName EOF
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
    // InternalBSharp.g:581:1: rulePolymorphicTypeName returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject rulePolymorphicTypeName() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalBSharp.g:587:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalBSharp.g:588:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalBSharp.g:588:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalBSharp.g:589:3: (lv_name_0_0= RULE_ID )
            {
            // InternalBSharp.g:589:3: (lv_name_0_0= RULE_ID )
            // InternalBSharp.g:590:4: lv_name_0_0= RULE_ID
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
    // InternalBSharp.g:609:1: entryRulePolyContext returns [EObject current=null] : iv_rulePolyContext= rulePolyContext EOF ;
    public final EObject entryRulePolyContext() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePolyContext = null;


        try {
            // InternalBSharp.g:609:52: (iv_rulePolyContext= rulePolyContext EOF )
            // InternalBSharp.g:610:2: iv_rulePolyContext= rulePolyContext EOF
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
    // InternalBSharp.g:616:1: rulePolyContext returns [EObject current=null] : (otherlv_0= '<' ( (lv_polyTypes_1_0= rulePolyContextTypes ) )+ otherlv_2= '>' ) ;
    public final EObject rulePolyContext() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_polyTypes_1_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:622:2: ( (otherlv_0= '<' ( (lv_polyTypes_1_0= rulePolyContextTypes ) )+ otherlv_2= '>' ) )
            // InternalBSharp.g:623:2: (otherlv_0= '<' ( (lv_polyTypes_1_0= rulePolyContextTypes ) )+ otherlv_2= '>' )
            {
            // InternalBSharp.g:623:2: (otherlv_0= '<' ( (lv_polyTypes_1_0= rulePolyContextTypes ) )+ otherlv_2= '>' )
            // InternalBSharp.g:624:3: otherlv_0= '<' ( (lv_polyTypes_1_0= rulePolyContextTypes ) )+ otherlv_2= '>'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getPolyContextAccess().getLessThanSignKeyword_0());
            		
            // InternalBSharp.g:628:3: ( (lv_polyTypes_1_0= rulePolyContextTypes ) )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalBSharp.g:629:4: (lv_polyTypes_1_0= rulePolyContextTypes )
            	    {
            	    // InternalBSharp.g:629:4: (lv_polyTypes_1_0= rulePolyContextTypes )
            	    // InternalBSharp.g:630:5: lv_polyTypes_1_0= rulePolyContextTypes
            	    {

            	    					newCompositeNode(grammarAccess.getPolyContextAccess().getPolyTypesPolyContextTypesParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_16);
            	    lv_polyTypes_1_0=rulePolyContextTypes();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPolyContextRule());
            	    					}
            	    					add(
            	    						current,
            	    						"polyTypes",
            	    						lv_polyTypes_1_0,
            	    						"ac.soton.bsharp.BSharp.PolyContextTypes");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);

            otherlv_2=(Token)match(input,21,FOLLOW_2); 

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
    // InternalBSharp.g:655:1: entryRulePolyContextTypes returns [EObject current=null] : iv_rulePolyContextTypes= rulePolyContextTypes EOF ;
    public final EObject entryRulePolyContextTypes() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePolyContextTypes = null;


        try {
            // InternalBSharp.g:655:57: (iv_rulePolyContextTypes= rulePolyContextTypes EOF )
            // InternalBSharp.g:656:2: iv_rulePolyContextTypes= rulePolyContextTypes EOF
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
    // InternalBSharp.g:662:1: rulePolyContextTypes returns [EObject current=null] : ( ( (lv_name_0_0= rulePolymorphicTypeName ) ) ( (lv_constraints_1_0= rulePolyTypeConstraints ) )* ) ;
    public final EObject rulePolyContextTypes() throws RecognitionException {
        EObject current = null;

        EObject lv_name_0_0 = null;

        EObject lv_constraints_1_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:668:2: ( ( ( (lv_name_0_0= rulePolymorphicTypeName ) ) ( (lv_constraints_1_0= rulePolyTypeConstraints ) )* ) )
            // InternalBSharp.g:669:2: ( ( (lv_name_0_0= rulePolymorphicTypeName ) ) ( (lv_constraints_1_0= rulePolyTypeConstraints ) )* )
            {
            // InternalBSharp.g:669:2: ( ( (lv_name_0_0= rulePolymorphicTypeName ) ) ( (lv_constraints_1_0= rulePolyTypeConstraints ) )* )
            // InternalBSharp.g:670:3: ( (lv_name_0_0= rulePolymorphicTypeName ) ) ( (lv_constraints_1_0= rulePolyTypeConstraints ) )*
            {
            // InternalBSharp.g:670:3: ( (lv_name_0_0= rulePolymorphicTypeName ) )
            // InternalBSharp.g:671:4: (lv_name_0_0= rulePolymorphicTypeName )
            {
            // InternalBSharp.g:671:4: (lv_name_0_0= rulePolymorphicTypeName )
            // InternalBSharp.g:672:5: lv_name_0_0= rulePolymorphicTypeName
            {

            					newCompositeNode(grammarAccess.getPolyContextTypesAccess().getNamePolymorphicTypeNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_17);
            lv_name_0_0=rulePolymorphicTypeName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPolyContextTypesRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"ac.soton.bsharp.BSharp.PolymorphicTypeName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBSharp.g:689:3: ( (lv_constraints_1_0= rulePolyTypeConstraints ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==11) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalBSharp.g:690:4: (lv_constraints_1_0= rulePolyTypeConstraints )
            	    {
            	    // InternalBSharp.g:690:4: (lv_constraints_1_0= rulePolyTypeConstraints )
            	    // InternalBSharp.g:691:5: lv_constraints_1_0= rulePolyTypeConstraints
            	    {

            	    					newCompositeNode(grammarAccess.getPolyContextTypesAccess().getConstraintsPolyTypeConstraintsParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_17);
            	    lv_constraints_1_0=rulePolyTypeConstraints();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPolyContextTypesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"constraints",
            	    						lv_constraints_1_0,
            	    						"ac.soton.bsharp.BSharp.PolyTypeConstraints");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalBSharp.g:712:1: entryRulePolyTypeConstraints returns [EObject current=null] : iv_rulePolyTypeConstraints= rulePolyTypeConstraints EOF ;
    public final EObject entryRulePolyTypeConstraints() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePolyTypeConstraints = null;


        try {
            // InternalBSharp.g:712:60: (iv_rulePolyTypeConstraints= rulePolyTypeConstraints EOF )
            // InternalBSharp.g:713:2: iv_rulePolyTypeConstraints= rulePolyTypeConstraints EOF
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
    // InternalBSharp.g:719:1: rulePolyTypeConstraints returns [EObject current=null] : (otherlv_0= ':' ( ( ruleQualifiedName ) ) (otherlv_2= ',' ( ( ruleQualifiedName ) ) )* ) ;
    public final EObject rulePolyTypeConstraints() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalBSharp.g:725:2: ( (otherlv_0= ':' ( ( ruleQualifiedName ) ) (otherlv_2= ',' ( ( ruleQualifiedName ) ) )* ) )
            // InternalBSharp.g:726:2: (otherlv_0= ':' ( ( ruleQualifiedName ) ) (otherlv_2= ',' ( ( ruleQualifiedName ) ) )* )
            {
            // InternalBSharp.g:726:2: (otherlv_0= ':' ( ( ruleQualifiedName ) ) (otherlv_2= ',' ( ( ruleQualifiedName ) ) )* )
            // InternalBSharp.g:727:3: otherlv_0= ':' ( ( ruleQualifiedName ) ) (otherlv_2= ',' ( ( ruleQualifiedName ) ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getPolyTypeConstraintsAccess().getColonKeyword_0());
            		
            // InternalBSharp.g:731:3: ( ( ruleQualifiedName ) )
            // InternalBSharp.g:732:4: ( ruleQualifiedName )
            {
            // InternalBSharp.g:732:4: ( ruleQualifiedName )
            // InternalBSharp.g:733:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPolyTypeConstraintsRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPolyTypeConstraintsAccess().getTypeNameClassDeclCrossReference_1_0());
            				
            pushFollow(FOLLOW_18);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBSharp.g:747:3: (otherlv_2= ',' ( ( ruleQualifiedName ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==22) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalBSharp.g:748:4: otherlv_2= ',' ( ( ruleQualifiedName ) )
            	    {
            	    otherlv_2=(Token)match(input,22,FOLLOW_6); 

            	    				newLeafNode(otherlv_2, grammarAccess.getPolyTypeConstraintsAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalBSharp.g:752:4: ( ( ruleQualifiedName ) )
            	    // InternalBSharp.g:753:5: ( ruleQualifiedName )
            	    {
            	    // InternalBSharp.g:753:5: ( ruleQualifiedName )
            	    // InternalBSharp.g:754:6: ruleQualifiedName
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getPolyTypeConstraintsRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getPolyTypeConstraintsAccess().getTypeNameClassDeclCrossReference_2_1_0());
            	    					
            	    pushFollow(FOLLOW_18);
            	    ruleQualifiedName();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalBSharp.g:773:1: entryRuleSuperTypeList returns [EObject current=null] : iv_ruleSuperTypeList= ruleSuperTypeList EOF ;
    public final EObject entryRuleSuperTypeList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSuperTypeList = null;


        try {
            // InternalBSharp.g:773:54: (iv_ruleSuperTypeList= ruleSuperTypeList EOF )
            // InternalBSharp.g:774:2: iv_ruleSuperTypeList= ruleSuperTypeList EOF
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
    // InternalBSharp.g:780:1: ruleSuperTypeList returns [EObject current=null] : (otherlv_0= ':' ( (lv_superType_1_0= ruleConstructedType ) ) (otherlv_2= ',' ( (lv_superType_3_0= ruleConstructedType ) ) )* ) ;
    public final EObject ruleSuperTypeList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_superType_1_0 = null;

        EObject lv_superType_3_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:786:2: ( (otherlv_0= ':' ( (lv_superType_1_0= ruleConstructedType ) ) (otherlv_2= ',' ( (lv_superType_3_0= ruleConstructedType ) ) )* ) )
            // InternalBSharp.g:787:2: (otherlv_0= ':' ( (lv_superType_1_0= ruleConstructedType ) ) (otherlv_2= ',' ( (lv_superType_3_0= ruleConstructedType ) ) )* )
            {
            // InternalBSharp.g:787:2: (otherlv_0= ':' ( (lv_superType_1_0= ruleConstructedType ) ) (otherlv_2= ',' ( (lv_superType_3_0= ruleConstructedType ) ) )* )
            // InternalBSharp.g:788:3: otherlv_0= ':' ( (lv_superType_1_0= ruleConstructedType ) ) (otherlv_2= ',' ( (lv_superType_3_0= ruleConstructedType ) ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getSuperTypeListAccess().getColonKeyword_0());
            		
            // InternalBSharp.g:792:3: ( (lv_superType_1_0= ruleConstructedType ) )
            // InternalBSharp.g:793:4: (lv_superType_1_0= ruleConstructedType )
            {
            // InternalBSharp.g:793:4: (lv_superType_1_0= ruleConstructedType )
            // InternalBSharp.g:794:5: lv_superType_1_0= ruleConstructedType
            {

            					newCompositeNode(grammarAccess.getSuperTypeListAccess().getSuperTypeConstructedTypeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_18);
            lv_superType_1_0=ruleConstructedType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSuperTypeListRule());
            					}
            					add(
            						current,
            						"superType",
            						lv_superType_1_0,
            						"ac.soton.bsharp.BSharp.ConstructedType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBSharp.g:811:3: (otherlv_2= ',' ( (lv_superType_3_0= ruleConstructedType ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==22) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalBSharp.g:812:4: otherlv_2= ',' ( (lv_superType_3_0= ruleConstructedType ) )
            	    {
            	    otherlv_2=(Token)match(input,22,FOLLOW_6); 

            	    				newLeafNode(otherlv_2, grammarAccess.getSuperTypeListAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalBSharp.g:816:4: ( (lv_superType_3_0= ruleConstructedType ) )
            	    // InternalBSharp.g:817:5: (lv_superType_3_0= ruleConstructedType )
            	    {
            	    // InternalBSharp.g:817:5: (lv_superType_3_0= ruleConstructedType )
            	    // InternalBSharp.g:818:6: lv_superType_3_0= ruleConstructedType
            	    {

            	    						newCompositeNode(grammarAccess.getSuperTypeListAccess().getSuperTypeConstructedTypeParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_18);
            	    lv_superType_3_0=ruleConstructedType();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSuperTypeListRule());
            	    						}
            	    						add(
            	    							current,
            	    							"superType",
            	    							lv_superType_3_0,
            	    							"ac.soton.bsharp.BSharp.ConstructedType");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // InternalBSharp.g:840:1: entryRuleConstructedType returns [EObject current=null] : iv_ruleConstructedType= ruleConstructedType EOF ;
    public final EObject entryRuleConstructedType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstructedType = null;


        try {
            // InternalBSharp.g:840:56: (iv_ruleConstructedType= ruleConstructedType EOF )
            // InternalBSharp.g:841:2: iv_ruleConstructedType= ruleConstructedType EOF
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
    // InternalBSharp.g:847:1: ruleConstructedType returns [EObject current=null] : ( ( (lv_type_0_0= ruleTypeConstructor ) ) ( ( ( (lv_constructors_1_1= '\\u00D7' | lv_constructors_1_2= '\\u2192' | lv_constructors_1_3= '\\uE102' | lv_constructors_1_4= '\\uE100' | lv_constructors_1_5= '\\u2194' | lv_constructors_1_6= '\\u2916' | lv_constructors_1_7= '\\u21F8' | lv_constructors_1_8= '\\u21A3' | lv_constructors_1_9= '\\u2900' | lv_constructors_1_10= '\\u21A0' ) ) ) ( (lv_type_2_0= ruleConstructedType ) ) )? ) ;
    public final EObject ruleConstructedType() throws RecognitionException {
        EObject current = null;

        Token lv_constructors_1_1=null;
        Token lv_constructors_1_2=null;
        Token lv_constructors_1_3=null;
        Token lv_constructors_1_4=null;
        Token lv_constructors_1_5=null;
        Token lv_constructors_1_6=null;
        Token lv_constructors_1_7=null;
        Token lv_constructors_1_8=null;
        Token lv_constructors_1_9=null;
        Token lv_constructors_1_10=null;
        EObject lv_type_0_0 = null;

        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:853:2: ( ( ( (lv_type_0_0= ruleTypeConstructor ) ) ( ( ( (lv_constructors_1_1= '\\u00D7' | lv_constructors_1_2= '\\u2192' | lv_constructors_1_3= '\\uE102' | lv_constructors_1_4= '\\uE100' | lv_constructors_1_5= '\\u2194' | lv_constructors_1_6= '\\u2916' | lv_constructors_1_7= '\\u21F8' | lv_constructors_1_8= '\\u21A3' | lv_constructors_1_9= '\\u2900' | lv_constructors_1_10= '\\u21A0' ) ) ) ( (lv_type_2_0= ruleConstructedType ) ) )? ) )
            // InternalBSharp.g:854:2: ( ( (lv_type_0_0= ruleTypeConstructor ) ) ( ( ( (lv_constructors_1_1= '\\u00D7' | lv_constructors_1_2= '\\u2192' | lv_constructors_1_3= '\\uE102' | lv_constructors_1_4= '\\uE100' | lv_constructors_1_5= '\\u2194' | lv_constructors_1_6= '\\u2916' | lv_constructors_1_7= '\\u21F8' | lv_constructors_1_8= '\\u21A3' | lv_constructors_1_9= '\\u2900' | lv_constructors_1_10= '\\u21A0' ) ) ) ( (lv_type_2_0= ruleConstructedType ) ) )? )
            {
            // InternalBSharp.g:854:2: ( ( (lv_type_0_0= ruleTypeConstructor ) ) ( ( ( (lv_constructors_1_1= '\\u00D7' | lv_constructors_1_2= '\\u2192' | lv_constructors_1_3= '\\uE102' | lv_constructors_1_4= '\\uE100' | lv_constructors_1_5= '\\u2194' | lv_constructors_1_6= '\\u2916' | lv_constructors_1_7= '\\u21F8' | lv_constructors_1_8= '\\u21A3' | lv_constructors_1_9= '\\u2900' | lv_constructors_1_10= '\\u21A0' ) ) ) ( (lv_type_2_0= ruleConstructedType ) ) )? )
            // InternalBSharp.g:855:3: ( (lv_type_0_0= ruleTypeConstructor ) ) ( ( ( (lv_constructors_1_1= '\\u00D7' | lv_constructors_1_2= '\\u2192' | lv_constructors_1_3= '\\uE102' | lv_constructors_1_4= '\\uE100' | lv_constructors_1_5= '\\u2194' | lv_constructors_1_6= '\\u2916' | lv_constructors_1_7= '\\u21F8' | lv_constructors_1_8= '\\u21A3' | lv_constructors_1_9= '\\u2900' | lv_constructors_1_10= '\\u21A0' ) ) ) ( (lv_type_2_0= ruleConstructedType ) ) )?
            {
            // InternalBSharp.g:855:3: ( (lv_type_0_0= ruleTypeConstructor ) )
            // InternalBSharp.g:856:4: (lv_type_0_0= ruleTypeConstructor )
            {
            // InternalBSharp.g:856:4: (lv_type_0_0= ruleTypeConstructor )
            // InternalBSharp.g:857:5: lv_type_0_0= ruleTypeConstructor
            {

            					newCompositeNode(grammarAccess.getConstructedTypeAccess().getTypeTypeConstructorParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_19);
            lv_type_0_0=ruleTypeConstructor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConstructedTypeRule());
            					}
            					add(
            						current,
            						"type",
            						lv_type_0_0,
            						"ac.soton.bsharp.BSharp.TypeConstructor");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBSharp.g:874:3: ( ( ( (lv_constructors_1_1= '\\u00D7' | lv_constructors_1_2= '\\u2192' | lv_constructors_1_3= '\\uE102' | lv_constructors_1_4= '\\uE100' | lv_constructors_1_5= '\\u2194' | lv_constructors_1_6= '\\u2916' | lv_constructors_1_7= '\\u21F8' | lv_constructors_1_8= '\\u21A3' | lv_constructors_1_9= '\\u2900' | lv_constructors_1_10= '\\u21A0' ) ) ) ( (lv_type_2_0= ruleConstructedType ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=23 && LA20_0<=32)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalBSharp.g:875:4: ( ( (lv_constructors_1_1= '\\u00D7' | lv_constructors_1_2= '\\u2192' | lv_constructors_1_3= '\\uE102' | lv_constructors_1_4= '\\uE100' | lv_constructors_1_5= '\\u2194' | lv_constructors_1_6= '\\u2916' | lv_constructors_1_7= '\\u21F8' | lv_constructors_1_8= '\\u21A3' | lv_constructors_1_9= '\\u2900' | lv_constructors_1_10= '\\u21A0' ) ) ) ( (lv_type_2_0= ruleConstructedType ) )
                    {
                    // InternalBSharp.g:875:4: ( ( (lv_constructors_1_1= '\\u00D7' | lv_constructors_1_2= '\\u2192' | lv_constructors_1_3= '\\uE102' | lv_constructors_1_4= '\\uE100' | lv_constructors_1_5= '\\u2194' | lv_constructors_1_6= '\\u2916' | lv_constructors_1_7= '\\u21F8' | lv_constructors_1_8= '\\u21A3' | lv_constructors_1_9= '\\u2900' | lv_constructors_1_10= '\\u21A0' ) ) )
                    // InternalBSharp.g:876:5: ( (lv_constructors_1_1= '\\u00D7' | lv_constructors_1_2= '\\u2192' | lv_constructors_1_3= '\\uE102' | lv_constructors_1_4= '\\uE100' | lv_constructors_1_5= '\\u2194' | lv_constructors_1_6= '\\u2916' | lv_constructors_1_7= '\\u21F8' | lv_constructors_1_8= '\\u21A3' | lv_constructors_1_9= '\\u2900' | lv_constructors_1_10= '\\u21A0' ) )
                    {
                    // InternalBSharp.g:876:5: ( (lv_constructors_1_1= '\\u00D7' | lv_constructors_1_2= '\\u2192' | lv_constructors_1_3= '\\uE102' | lv_constructors_1_4= '\\uE100' | lv_constructors_1_5= '\\u2194' | lv_constructors_1_6= '\\u2916' | lv_constructors_1_7= '\\u21F8' | lv_constructors_1_8= '\\u21A3' | lv_constructors_1_9= '\\u2900' | lv_constructors_1_10= '\\u21A0' ) )
                    // InternalBSharp.g:877:6: (lv_constructors_1_1= '\\u00D7' | lv_constructors_1_2= '\\u2192' | lv_constructors_1_3= '\\uE102' | lv_constructors_1_4= '\\uE100' | lv_constructors_1_5= '\\u2194' | lv_constructors_1_6= '\\u2916' | lv_constructors_1_7= '\\u21F8' | lv_constructors_1_8= '\\u21A3' | lv_constructors_1_9= '\\u2900' | lv_constructors_1_10= '\\u21A0' )
                    {
                    // InternalBSharp.g:877:6: (lv_constructors_1_1= '\\u00D7' | lv_constructors_1_2= '\\u2192' | lv_constructors_1_3= '\\uE102' | lv_constructors_1_4= '\\uE100' | lv_constructors_1_5= '\\u2194' | lv_constructors_1_6= '\\u2916' | lv_constructors_1_7= '\\u21F8' | lv_constructors_1_8= '\\u21A3' | lv_constructors_1_9= '\\u2900' | lv_constructors_1_10= '\\u21A0' )
                    int alt19=10;
                    switch ( input.LA(1) ) {
                    case 23:
                        {
                        alt19=1;
                        }
                        break;
                    case 24:
                        {
                        alt19=2;
                        }
                        break;
                    case 25:
                        {
                        alt19=3;
                        }
                        break;
                    case 26:
                        {
                        alt19=4;
                        }
                        break;
                    case 27:
                        {
                        alt19=5;
                        }
                        break;
                    case 28:
                        {
                        alt19=6;
                        }
                        break;
                    case 29:
                        {
                        alt19=7;
                        }
                        break;
                    case 30:
                        {
                        alt19=8;
                        }
                        break;
                    case 31:
                        {
                        alt19=9;
                        }
                        break;
                    case 32:
                        {
                        alt19=10;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 19, 0, input);

                        throw nvae;
                    }

                    switch (alt19) {
                        case 1 :
                            // InternalBSharp.g:878:7: lv_constructors_1_1= '\\u00D7'
                            {
                            lv_constructors_1_1=(Token)match(input,23,FOLLOW_6); 

                            							newLeafNode(lv_constructors_1_1, grammarAccess.getConstructedTypeAccess().getConstructorsMultiplicationSignKeyword_1_0_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getConstructedTypeRule());
                            							}
                            							addWithLastConsumed(current, "constructors", lv_constructors_1_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalBSharp.g:889:7: lv_constructors_1_2= '\\u2192'
                            {
                            lv_constructors_1_2=(Token)match(input,24,FOLLOW_6); 

                            							newLeafNode(lv_constructors_1_2, grammarAccess.getConstructedTypeAccess().getConstructorsRightwardsArrowKeyword_1_0_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getConstructedTypeRule());
                            							}
                            							addWithLastConsumed(current, "constructors", lv_constructors_1_2, null);
                            						

                            }
                            break;
                        case 3 :
                            // InternalBSharp.g:900:7: lv_constructors_1_3= '\\uE102'
                            {
                            lv_constructors_1_3=(Token)match(input,25,FOLLOW_6); 

                            							newLeafNode(lv_constructors_1_3, grammarAccess.getConstructedTypeAccess().getConstructorsPrivateUseAreaE102Keyword_1_0_0_2());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getConstructedTypeRule());
                            							}
                            							addWithLastConsumed(current, "constructors", lv_constructors_1_3, null);
                            						

                            }
                            break;
                        case 4 :
                            // InternalBSharp.g:911:7: lv_constructors_1_4= '\\uE100'
                            {
                            lv_constructors_1_4=(Token)match(input,26,FOLLOW_6); 

                            							newLeafNode(lv_constructors_1_4, grammarAccess.getConstructedTypeAccess().getConstructorsPrivateUseAreaE100Keyword_1_0_0_3());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getConstructedTypeRule());
                            							}
                            							addWithLastConsumed(current, "constructors", lv_constructors_1_4, null);
                            						

                            }
                            break;
                        case 5 :
                            // InternalBSharp.g:922:7: lv_constructors_1_5= '\\u2194'
                            {
                            lv_constructors_1_5=(Token)match(input,27,FOLLOW_6); 

                            							newLeafNode(lv_constructors_1_5, grammarAccess.getConstructedTypeAccess().getConstructorsLeftRightArrowKeyword_1_0_0_4());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getConstructedTypeRule());
                            							}
                            							addWithLastConsumed(current, "constructors", lv_constructors_1_5, null);
                            						

                            }
                            break;
                        case 6 :
                            // InternalBSharp.g:933:7: lv_constructors_1_6= '\\u2916'
                            {
                            lv_constructors_1_6=(Token)match(input,28,FOLLOW_6); 

                            							newLeafNode(lv_constructors_1_6, grammarAccess.getConstructedTypeAccess().getConstructorsRightwardsTwoHeadedArrowWithTailKeyword_1_0_0_5());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getConstructedTypeRule());
                            							}
                            							addWithLastConsumed(current, "constructors", lv_constructors_1_6, null);
                            						

                            }
                            break;
                        case 7 :
                            // InternalBSharp.g:944:7: lv_constructors_1_7= '\\u21F8'
                            {
                            lv_constructors_1_7=(Token)match(input,29,FOLLOW_6); 

                            							newLeafNode(lv_constructors_1_7, grammarAccess.getConstructedTypeAccess().getConstructorsRightwardsArrowWithVerticalStrokeKeyword_1_0_0_6());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getConstructedTypeRule());
                            							}
                            							addWithLastConsumed(current, "constructors", lv_constructors_1_7, null);
                            						

                            }
                            break;
                        case 8 :
                            // InternalBSharp.g:955:7: lv_constructors_1_8= '\\u21A3'
                            {
                            lv_constructors_1_8=(Token)match(input,30,FOLLOW_6); 

                            							newLeafNode(lv_constructors_1_8, grammarAccess.getConstructedTypeAccess().getConstructorsRightwardsArrowWithTailKeyword_1_0_0_7());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getConstructedTypeRule());
                            							}
                            							addWithLastConsumed(current, "constructors", lv_constructors_1_8, null);
                            						

                            }
                            break;
                        case 9 :
                            // InternalBSharp.g:966:7: lv_constructors_1_9= '\\u2900'
                            {
                            lv_constructors_1_9=(Token)match(input,31,FOLLOW_6); 

                            							newLeafNode(lv_constructors_1_9, grammarAccess.getConstructedTypeAccess().getConstructorsRightwardsTwoHeadedArrowWithVerticalStrokeKeyword_1_0_0_8());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getConstructedTypeRule());
                            							}
                            							addWithLastConsumed(current, "constructors", lv_constructors_1_9, null);
                            						

                            }
                            break;
                        case 10 :
                            // InternalBSharp.g:977:7: lv_constructors_1_10= '\\u21A0'
                            {
                            lv_constructors_1_10=(Token)match(input,32,FOLLOW_6); 

                            							newLeafNode(lv_constructors_1_10, grammarAccess.getConstructedTypeAccess().getConstructorsRightwardsTwoHeadedArrowKeyword_1_0_0_9());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getConstructedTypeRule());
                            							}
                            							addWithLastConsumed(current, "constructors", lv_constructors_1_10, null);
                            						

                            }
                            break;

                    }


                    }


                    }

                    // InternalBSharp.g:990:4: ( (lv_type_2_0= ruleConstructedType ) )
                    // InternalBSharp.g:991:5: (lv_type_2_0= ruleConstructedType )
                    {
                    // InternalBSharp.g:991:5: (lv_type_2_0= ruleConstructedType )
                    // InternalBSharp.g:992:6: lv_type_2_0= ruleConstructedType
                    {

                    						newCompositeNode(grammarAccess.getConstructedTypeAccess().getTypeConstructedTypeParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_type_2_0=ruleConstructedType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConstructedTypeRule());
                    						}
                    						add(
                    							current,
                    							"type",
                    							lv_type_2_0,
                    							"ac.soton.bsharp.BSharp.ConstructedType");
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
    // InternalBSharp.g:1014:1: entryRuleTypeConstructor returns [EObject current=null] : iv_ruleTypeConstructor= ruleTypeConstructor EOF ;
    public final EObject entryRuleTypeConstructor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeConstructor = null;


        try {
            // InternalBSharp.g:1014:56: (iv_ruleTypeConstructor= ruleTypeConstructor EOF )
            // InternalBSharp.g:1015:2: iv_ruleTypeConstructor= ruleTypeConstructor EOF
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
    // InternalBSharp.g:1021:1: ruleTypeConstructor returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( (lv_context_1_0= ruleTypeDeclContext ) )? ) ;
    public final EObject ruleTypeConstructor() throws RecognitionException {
        EObject current = null;

        EObject lv_context_1_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:1027:2: ( ( ( ( ruleQualifiedName ) ) ( (lv_context_1_0= ruleTypeDeclContext ) )? ) )
            // InternalBSharp.g:1028:2: ( ( ( ruleQualifiedName ) ) ( (lv_context_1_0= ruleTypeDeclContext ) )? )
            {
            // InternalBSharp.g:1028:2: ( ( ( ruleQualifiedName ) ) ( (lv_context_1_0= ruleTypeDeclContext ) )? )
            // InternalBSharp.g:1029:3: ( ( ruleQualifiedName ) ) ( (lv_context_1_0= ruleTypeDeclContext ) )?
            {
            // InternalBSharp.g:1029:3: ( ( ruleQualifiedName ) )
            // InternalBSharp.g:1030:4: ( ruleQualifiedName )
            {
            // InternalBSharp.g:1030:4: ( ruleQualifiedName )
            // InternalBSharp.g:1031:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTypeConstructorRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTypeConstructorAccess().getTypeNameGenNameCrossReference_0_0());
            				
            pushFollow(FOLLOW_20);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBSharp.g:1045:3: ( (lv_context_1_0= ruleTypeDeclContext ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==20) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalBSharp.g:1046:4: (lv_context_1_0= ruleTypeDeclContext )
                    {
                    // InternalBSharp.g:1046:4: (lv_context_1_0= ruleTypeDeclContext )
                    // InternalBSharp.g:1047:5: lv_context_1_0= ruleTypeDeclContext
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
                    						"ac.soton.bsharp.BSharp.TypeDeclContext");
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
    // InternalBSharp.g:1068:1: entryRuleTypeDeclContext returns [EObject current=null] : iv_ruleTypeDeclContext= ruleTypeDeclContext EOF ;
    public final EObject entryRuleTypeDeclContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeDeclContext = null;


        try {
            // InternalBSharp.g:1068:56: (iv_ruleTypeDeclContext= ruleTypeDeclContext EOF )
            // InternalBSharp.g:1069:2: iv_ruleTypeDeclContext= ruleTypeDeclContext EOF
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
    // InternalBSharp.g:1075:1: ruleTypeDeclContext returns [EObject current=null] : (otherlv_0= '<' ( (lv_TypeName_1_0= ruleConstructedType ) ) (otherlv_2= ',' ( (lv_TypeName_3_0= ruleConstructedType ) ) )* otherlv_4= '>' ) ;
    public final EObject ruleTypeDeclContext() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_TypeName_1_0 = null;

        EObject lv_TypeName_3_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:1081:2: ( (otherlv_0= '<' ( (lv_TypeName_1_0= ruleConstructedType ) ) (otherlv_2= ',' ( (lv_TypeName_3_0= ruleConstructedType ) ) )* otherlv_4= '>' ) )
            // InternalBSharp.g:1082:2: (otherlv_0= '<' ( (lv_TypeName_1_0= ruleConstructedType ) ) (otherlv_2= ',' ( (lv_TypeName_3_0= ruleConstructedType ) ) )* otherlv_4= '>' )
            {
            // InternalBSharp.g:1082:2: (otherlv_0= '<' ( (lv_TypeName_1_0= ruleConstructedType ) ) (otherlv_2= ',' ( (lv_TypeName_3_0= ruleConstructedType ) ) )* otherlv_4= '>' )
            // InternalBSharp.g:1083:3: otherlv_0= '<' ( (lv_TypeName_1_0= ruleConstructedType ) ) (otherlv_2= ',' ( (lv_TypeName_3_0= ruleConstructedType ) ) )* otherlv_4= '>'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getTypeDeclContextAccess().getLessThanSignKeyword_0());
            		
            // InternalBSharp.g:1087:3: ( (lv_TypeName_1_0= ruleConstructedType ) )
            // InternalBSharp.g:1088:4: (lv_TypeName_1_0= ruleConstructedType )
            {
            // InternalBSharp.g:1088:4: (lv_TypeName_1_0= ruleConstructedType )
            // InternalBSharp.g:1089:5: lv_TypeName_1_0= ruleConstructedType
            {

            					newCompositeNode(grammarAccess.getTypeDeclContextAccess().getTypeNameConstructedTypeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_21);
            lv_TypeName_1_0=ruleConstructedType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTypeDeclContextRule());
            					}
            					add(
            						current,
            						"TypeName",
            						lv_TypeName_1_0,
            						"ac.soton.bsharp.BSharp.ConstructedType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBSharp.g:1106:3: (otherlv_2= ',' ( (lv_TypeName_3_0= ruleConstructedType ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==22) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalBSharp.g:1107:4: otherlv_2= ',' ( (lv_TypeName_3_0= ruleConstructedType ) )
            	    {
            	    otherlv_2=(Token)match(input,22,FOLLOW_6); 

            	    				newLeafNode(otherlv_2, grammarAccess.getTypeDeclContextAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalBSharp.g:1111:4: ( (lv_TypeName_3_0= ruleConstructedType ) )
            	    // InternalBSharp.g:1112:5: (lv_TypeName_3_0= ruleConstructedType )
            	    {
            	    // InternalBSharp.g:1112:5: (lv_TypeName_3_0= ruleConstructedType )
            	    // InternalBSharp.g:1113:6: lv_TypeName_3_0= ruleConstructedType
            	    {

            	    						newCompositeNode(grammarAccess.getTypeDeclContextAccess().getTypeNameConstructedTypeParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_21);
            	    lv_TypeName_3_0=ruleConstructedType();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTypeDeclContextRule());
            	    						}
            	    						add(
            	    							current,
            	    							"TypeName",
            	    							lv_TypeName_3_0,
            	    							"ac.soton.bsharp.BSharp.ConstructedType");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            otherlv_4=(Token)match(input,21,FOLLOW_2); 

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
    // InternalBSharp.g:1139:1: entryRuleTypeStructure returns [EObject current=null] : iv_ruleTypeStructure= ruleTypeStructure EOF ;
    public final EObject entryRuleTypeStructure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeStructure = null;


        try {
            // InternalBSharp.g:1139:54: (iv_ruleTypeStructure= ruleTypeStructure EOF )
            // InternalBSharp.g:1140:2: iv_ruleTypeStructure= ruleTypeStructure EOF
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
    // InternalBSharp.g:1146:1: ruleTypeStructure returns [EObject current=null] : (otherlv_0= '(' ( (lv_variables_1_0= ruleTypedVariableList ) ) otherlv_2= ')' ) ;
    public final EObject ruleTypeStructure() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_variables_1_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:1152:2: ( (otherlv_0= '(' ( (lv_variables_1_0= ruleTypedVariableList ) ) otherlv_2= ')' ) )
            // InternalBSharp.g:1153:2: (otherlv_0= '(' ( (lv_variables_1_0= ruleTypedVariableList ) ) otherlv_2= ')' )
            {
            // InternalBSharp.g:1153:2: (otherlv_0= '(' ( (lv_variables_1_0= ruleTypedVariableList ) ) otherlv_2= ')' )
            // InternalBSharp.g:1154:3: otherlv_0= '(' ( (lv_variables_1_0= ruleTypedVariableList ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getTypeStructureAccess().getLeftParenthesisKeyword_0());
            		
            // InternalBSharp.g:1158:3: ( (lv_variables_1_0= ruleTypedVariableList ) )
            // InternalBSharp.g:1159:4: (lv_variables_1_0= ruleTypedVariableList )
            {
            // InternalBSharp.g:1159:4: (lv_variables_1_0= ruleTypedVariableList )
            // InternalBSharp.g:1160:5: lv_variables_1_0= ruleTypedVariableList
            {

            					newCompositeNode(grammarAccess.getTypeStructureAccess().getVariablesTypedVariableListParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_22);
            lv_variables_1_0=ruleTypedVariableList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTypeStructureRule());
            					}
            					set(
            						current,
            						"variables",
            						lv_variables_1_0,
            						"ac.soton.bsharp.BSharp.TypedVariableList");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,34,FOLLOW_2); 

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
    // InternalBSharp.g:1185:1: entryRuleWhere returns [EObject current=null] : iv_ruleWhere= ruleWhere EOF ;
    public final EObject entryRuleWhere() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhere = null;


        try {
            // InternalBSharp.g:1185:46: (iv_ruleWhere= ruleWhere EOF )
            // InternalBSharp.g:1186:2: iv_ruleWhere= ruleWhere EOF
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
    // InternalBSharp.g:1192:1: ruleWhere returns [EObject current=null] : (otherlv_0= 'where' ( (lv_expessions_1_0= ruleQuantifier ) ) (otherlv_2= ';' ( (lv_expressions_3_0= ruleRootExpression ) ) )* ) ;
    public final EObject ruleWhere() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_expessions_1_0 = null;

        EObject lv_expressions_3_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:1198:2: ( (otherlv_0= 'where' ( (lv_expessions_1_0= ruleQuantifier ) ) (otherlv_2= ';' ( (lv_expressions_3_0= ruleRootExpression ) ) )* ) )
            // InternalBSharp.g:1199:2: (otherlv_0= 'where' ( (lv_expessions_1_0= ruleQuantifier ) ) (otherlv_2= ';' ( (lv_expressions_3_0= ruleRootExpression ) ) )* )
            {
            // InternalBSharp.g:1199:2: (otherlv_0= 'where' ( (lv_expessions_1_0= ruleQuantifier ) ) (otherlv_2= ';' ( (lv_expressions_3_0= ruleRootExpression ) ) )* )
            // InternalBSharp.g:1200:3: otherlv_0= 'where' ( (lv_expessions_1_0= ruleQuantifier ) ) (otherlv_2= ';' ( (lv_expressions_3_0= ruleRootExpression ) ) )*
            {
            otherlv_0=(Token)match(input,35,FOLLOW_23); 

            			newLeafNode(otherlv_0, grammarAccess.getWhereAccess().getWhereKeyword_0());
            		
            // InternalBSharp.g:1204:3: ( (lv_expessions_1_0= ruleQuantifier ) )
            // InternalBSharp.g:1205:4: (lv_expessions_1_0= ruleQuantifier )
            {
            // InternalBSharp.g:1205:4: (lv_expessions_1_0= ruleQuantifier )
            // InternalBSharp.g:1206:5: lv_expessions_1_0= ruleQuantifier
            {

            					newCompositeNode(grammarAccess.getWhereAccess().getExpessionsQuantifierParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_24);
            lv_expessions_1_0=ruleQuantifier();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWhereRule());
            					}
            					add(
            						current,
            						"expessions",
            						lv_expessions_1_0,
            						"ac.soton.bsharp.BSharp.Quantifier");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBSharp.g:1223:3: (otherlv_2= ';' ( (lv_expressions_3_0= ruleRootExpression ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==17) ) {
                    int LA23_1 = input.LA(2);

                    if ( (LA23_1==RULE_ID||LA23_1==33||LA23_1==40||(LA23_1>=42 && LA23_1<=44)||LA23_1==46) ) {
                        alt23=1;
                    }


                }


                switch (alt23) {
            	case 1 :
            	    // InternalBSharp.g:1224:4: otherlv_2= ';' ( (lv_expressions_3_0= ruleRootExpression ) )
            	    {
            	    otherlv_2=(Token)match(input,17,FOLLOW_25); 

            	    				newLeafNode(otherlv_2, grammarAccess.getWhereAccess().getSemicolonKeyword_2_0());
            	    			
            	    // InternalBSharp.g:1228:4: ( (lv_expressions_3_0= ruleRootExpression ) )
            	    // InternalBSharp.g:1229:5: (lv_expressions_3_0= ruleRootExpression )
            	    {
            	    // InternalBSharp.g:1229:5: (lv_expressions_3_0= ruleRootExpression )
            	    // InternalBSharp.g:1230:6: lv_expressions_3_0= ruleRootExpression
            	    {

            	    						newCompositeNode(grammarAccess.getWhereAccess().getExpressionsRootExpressionParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_24);
            	    lv_expressions_3_0=ruleRootExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getWhereRule());
            	    						}
            	    						add(
            	    							current,
            	    							"expressions",
            	    							lv_expressions_3_0,
            	    							"ac.soton.bsharp.BSharp.RootExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // InternalBSharp.g:1252:1: entryRuleDatatype returns [EObject current=null] : iv_ruleDatatype= ruleDatatype EOF ;
    public final EObject entryRuleDatatype() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatatype = null;


        try {
            // InternalBSharp.g:1252:49: (iv_ruleDatatype= ruleDatatype EOF )
            // InternalBSharp.g:1253:2: iv_ruleDatatype= ruleDatatype EOF
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
    // InternalBSharp.g:1259:1: ruleDatatype returns [EObject current=null] : (otherlv_0= 'Datatype' ( (lv_name_1_0= RULE_ID ) ) ( (lv_context_2_0= rulePolyContext ) )? (otherlv_3= '|' ( (lv_constructors_4_0= ruleDatatypeConstructor ) ) )+ otherlv_5= '{' ( (lv_bodyElements_6_0= ruleTypeBodyElements ) )* otherlv_7= '}' ) ;
    public final EObject ruleDatatype() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_context_2_0 = null;

        EObject lv_constructors_4_0 = null;

        EObject lv_bodyElements_6_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:1265:2: ( (otherlv_0= 'Datatype' ( (lv_name_1_0= RULE_ID ) ) ( (lv_context_2_0= rulePolyContext ) )? (otherlv_3= '|' ( (lv_constructors_4_0= ruleDatatypeConstructor ) ) )+ otherlv_5= '{' ( (lv_bodyElements_6_0= ruleTypeBodyElements ) )* otherlv_7= '}' ) )
            // InternalBSharp.g:1266:2: (otherlv_0= 'Datatype' ( (lv_name_1_0= RULE_ID ) ) ( (lv_context_2_0= rulePolyContext ) )? (otherlv_3= '|' ( (lv_constructors_4_0= ruleDatatypeConstructor ) ) )+ otherlv_5= '{' ( (lv_bodyElements_6_0= ruleTypeBodyElements ) )* otherlv_7= '}' )
            {
            // InternalBSharp.g:1266:2: (otherlv_0= 'Datatype' ( (lv_name_1_0= RULE_ID ) ) ( (lv_context_2_0= rulePolyContext ) )? (otherlv_3= '|' ( (lv_constructors_4_0= ruleDatatypeConstructor ) ) )+ otherlv_5= '{' ( (lv_bodyElements_6_0= ruleTypeBodyElements ) )* otherlv_7= '}' )
            // InternalBSharp.g:1267:3: otherlv_0= 'Datatype' ( (lv_name_1_0= RULE_ID ) ) ( (lv_context_2_0= rulePolyContext ) )? (otherlv_3= '|' ( (lv_constructors_4_0= ruleDatatypeConstructor ) ) )+ otherlv_5= '{' ( (lv_bodyElements_6_0= ruleTypeBodyElements ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getDatatypeAccess().getDatatypeKeyword_0());
            		
            // InternalBSharp.g:1271:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalBSharp.g:1272:4: (lv_name_1_0= RULE_ID )
            {
            // InternalBSharp.g:1272:4: (lv_name_1_0= RULE_ID )
            // InternalBSharp.g:1273:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_26); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDatatypeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDatatypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalBSharp.g:1289:3: ( (lv_context_2_0= rulePolyContext ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==20) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalBSharp.g:1290:4: (lv_context_2_0= rulePolyContext )
                    {
                    // InternalBSharp.g:1290:4: (lv_context_2_0= rulePolyContext )
                    // InternalBSharp.g:1291:5: lv_context_2_0= rulePolyContext
                    {

                    					newCompositeNode(grammarAccess.getDatatypeAccess().getContextPolyContextParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_27);
                    lv_context_2_0=rulePolyContext();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDatatypeRule());
                    					}
                    					set(
                    						current,
                    						"context",
                    						lv_context_2_0,
                    						"ac.soton.bsharp.BSharp.PolyContext");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalBSharp.g:1308:3: (otherlv_3= '|' ( (lv_constructors_4_0= ruleDatatypeConstructor ) ) )+
            int cnt25=0;
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==37) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalBSharp.g:1309:4: otherlv_3= '|' ( (lv_constructors_4_0= ruleDatatypeConstructor ) )
            	    {
            	    otherlv_3=(Token)match(input,37,FOLLOW_6); 

            	    				newLeafNode(otherlv_3, grammarAccess.getDatatypeAccess().getVerticalLineKeyword_3_0());
            	    			
            	    // InternalBSharp.g:1313:4: ( (lv_constructors_4_0= ruleDatatypeConstructor ) )
            	    // InternalBSharp.g:1314:5: (lv_constructors_4_0= ruleDatatypeConstructor )
            	    {
            	    // InternalBSharp.g:1314:5: (lv_constructors_4_0= ruleDatatypeConstructor )
            	    // InternalBSharp.g:1315:6: lv_constructors_4_0= ruleDatatypeConstructor
            	    {

            	    						newCompositeNode(grammarAccess.getDatatypeAccess().getConstructorsDatatypeConstructorParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_28);
            	    lv_constructors_4_0=ruleDatatypeConstructor();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDatatypeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"constructors",
            	    							lv_constructors_4_0,
            	    							"ac.soton.bsharp.BSharp.DatatypeConstructor");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt25 >= 1 ) break loop25;
                        EarlyExitException eee =
                            new EarlyExitException(25, input);
                        throw eee;
                }
                cnt25++;
            } while (true);

            otherlv_5=(Token)match(input,18,FOLLOW_15); 

            			newLeafNode(otherlv_5, grammarAccess.getDatatypeAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalBSharp.g:1337:3: ( (lv_bodyElements_6_0= ruleTypeBodyElements ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_ID||LA26_0==41) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalBSharp.g:1338:4: (lv_bodyElements_6_0= ruleTypeBodyElements )
            	    {
            	    // InternalBSharp.g:1338:4: (lv_bodyElements_6_0= ruleTypeBodyElements )
            	    // InternalBSharp.g:1339:5: lv_bodyElements_6_0= ruleTypeBodyElements
            	    {

            	    					newCompositeNode(grammarAccess.getDatatypeAccess().getBodyElementsTypeBodyElementsParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_15);
            	    lv_bodyElements_6_0=ruleTypeBodyElements();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDatatypeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"bodyElements",
            	    						lv_bodyElements_6_0,
            	    						"ac.soton.bsharp.BSharp.TypeBodyElements");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            otherlv_7=(Token)match(input,19,FOLLOW_2); 

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
    // InternalBSharp.g:1364:1: entryRuleDatatypeConstructor returns [EObject current=null] : iv_ruleDatatypeConstructor= ruleDatatypeConstructor EOF ;
    public final EObject entryRuleDatatypeConstructor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatatypeConstructor = null;


        try {
            // InternalBSharp.g:1364:60: (iv_ruleDatatypeConstructor= ruleDatatypeConstructor EOF )
            // InternalBSharp.g:1365:2: iv_ruleDatatypeConstructor= ruleDatatypeConstructor EOF
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
    // InternalBSharp.g:1371:1: ruleDatatypeConstructor returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_decons_2_0= ruleTypedVariableList ) ) otherlv_3= ')' )? ) ;
    public final EObject ruleDatatypeConstructor() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_decons_2_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:1377:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_decons_2_0= ruleTypedVariableList ) ) otherlv_3= ')' )? ) )
            // InternalBSharp.g:1378:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_decons_2_0= ruleTypedVariableList ) ) otherlv_3= ')' )? )
            {
            // InternalBSharp.g:1378:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_decons_2_0= ruleTypedVariableList ) ) otherlv_3= ')' )? )
            // InternalBSharp.g:1379:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_decons_2_0= ruleTypedVariableList ) ) otherlv_3= ')' )?
            {
            // InternalBSharp.g:1379:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalBSharp.g:1380:4: (lv_name_0_0= RULE_ID )
            {
            // InternalBSharp.g:1380:4: (lv_name_0_0= RULE_ID )
            // InternalBSharp.g:1381:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_29); 

            					newLeafNode(lv_name_0_0, grammarAccess.getDatatypeConstructorAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDatatypeConstructorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalBSharp.g:1397:3: (otherlv_1= '(' ( (lv_decons_2_0= ruleTypedVariableList ) ) otherlv_3= ')' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==33) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalBSharp.g:1398:4: otherlv_1= '(' ( (lv_decons_2_0= ruleTypedVariableList ) ) otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,33,FOLLOW_6); 

                    				newLeafNode(otherlv_1, grammarAccess.getDatatypeConstructorAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalBSharp.g:1402:4: ( (lv_decons_2_0= ruleTypedVariableList ) )
                    // InternalBSharp.g:1403:5: (lv_decons_2_0= ruleTypedVariableList )
                    {
                    // InternalBSharp.g:1403:5: (lv_decons_2_0= ruleTypedVariableList )
                    // InternalBSharp.g:1404:6: lv_decons_2_0= ruleTypedVariableList
                    {

                    						newCompositeNode(grammarAccess.getDatatypeConstructorAccess().getDeconsTypedVariableListParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_22);
                    lv_decons_2_0=ruleTypedVariableList();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDatatypeConstructorRule());
                    						}
                    						set(
                    							current,
                    							"decons",
                    							lv_decons_2_0,
                    							"ac.soton.bsharp.BSharp.TypedVariableList");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,34,FOLLOW_2); 

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
    // InternalBSharp.g:1430:1: entryRuleExtend returns [EObject current=null] : iv_ruleExtend= ruleExtend EOF ;
    public final EObject entryRuleExtend() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtend = null;


        try {
            // InternalBSharp.g:1430:47: (iv_ruleExtend= ruleExtend EOF )
            // InternalBSharp.g:1431:2: iv_ruleExtend= ruleExtend EOF
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
    // InternalBSharp.g:1437:1: ruleExtend returns [EObject current=null] : (otherlv_0= 'Extend' ( ( ruleQualifiedName ) ) otherlv_2= '(' ( (lv_extension_3_0= RULE_ID ) ) otherlv_4= ')' otherlv_5= '{' ( (lv_bodyElements_6_0= ruleTypeBodyElements ) )* otherlv_7= '}' ) ;
    public final EObject ruleExtend() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_extension_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_bodyElements_6_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:1443:2: ( (otherlv_0= 'Extend' ( ( ruleQualifiedName ) ) otherlv_2= '(' ( (lv_extension_3_0= RULE_ID ) ) otherlv_4= ')' otherlv_5= '{' ( (lv_bodyElements_6_0= ruleTypeBodyElements ) )* otherlv_7= '}' ) )
            // InternalBSharp.g:1444:2: (otherlv_0= 'Extend' ( ( ruleQualifiedName ) ) otherlv_2= '(' ( (lv_extension_3_0= RULE_ID ) ) otherlv_4= ')' otherlv_5= '{' ( (lv_bodyElements_6_0= ruleTypeBodyElements ) )* otherlv_7= '}' )
            {
            // InternalBSharp.g:1444:2: (otherlv_0= 'Extend' ( ( ruleQualifiedName ) ) otherlv_2= '(' ( (lv_extension_3_0= RULE_ID ) ) otherlv_4= ')' otherlv_5= '{' ( (lv_bodyElements_6_0= ruleTypeBodyElements ) )* otherlv_7= '}' )
            // InternalBSharp.g:1445:3: otherlv_0= 'Extend' ( ( ruleQualifiedName ) ) otherlv_2= '(' ( (lv_extension_3_0= RULE_ID ) ) otherlv_4= ')' otherlv_5= '{' ( (lv_bodyElements_6_0= ruleTypeBodyElements ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getExtendAccess().getExtendKeyword_0());
            		
            // InternalBSharp.g:1449:3: ( ( ruleQualifiedName ) )
            // InternalBSharp.g:1450:4: ( ruleQualifiedName )
            {
            // InternalBSharp.g:1450:4: ( ruleQualifiedName )
            // InternalBSharp.g:1451:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExtendRule());
            					}
            				

            					newCompositeNode(grammarAccess.getExtendAccess().getNameClassDeclCrossReference_1_0());
            				
            pushFollow(FOLLOW_30);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,33,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getExtendAccess().getLeftParenthesisKeyword_2());
            		
            // InternalBSharp.g:1469:3: ( (lv_extension_3_0= RULE_ID ) )
            // InternalBSharp.g:1470:4: (lv_extension_3_0= RULE_ID )
            {
            // InternalBSharp.g:1470:4: (lv_extension_3_0= RULE_ID )
            // InternalBSharp.g:1471:5: lv_extension_3_0= RULE_ID
            {
            lv_extension_3_0=(Token)match(input,RULE_ID,FOLLOW_22); 

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

            otherlv_4=(Token)match(input,34,FOLLOW_14); 

            			newLeafNode(otherlv_4, grammarAccess.getExtendAccess().getRightParenthesisKeyword_4());
            		
            otherlv_5=(Token)match(input,18,FOLLOW_15); 

            			newLeafNode(otherlv_5, grammarAccess.getExtendAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalBSharp.g:1495:3: ( (lv_bodyElements_6_0= ruleTypeBodyElements ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_ID||LA28_0==41) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalBSharp.g:1496:4: (lv_bodyElements_6_0= ruleTypeBodyElements )
            	    {
            	    // InternalBSharp.g:1496:4: (lv_bodyElements_6_0= ruleTypeBodyElements )
            	    // InternalBSharp.g:1497:5: lv_bodyElements_6_0= ruleTypeBodyElements
            	    {

            	    					newCompositeNode(grammarAccess.getExtendAccess().getBodyElementsTypeBodyElementsParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_15);
            	    lv_bodyElements_6_0=ruleTypeBodyElements();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getExtendRule());
            	    					}
            	    					add(
            	    						current,
            	    						"bodyElements",
            	    						lv_bodyElements_6_0,
            	    						"ac.soton.bsharp.BSharp.TypeBodyElements");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            otherlv_7=(Token)match(input,19,FOLLOW_2); 

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
    // InternalBSharp.g:1522:1: entryRuleTypeBodyElements returns [EObject current=null] : iv_ruleTypeBodyElements= ruleTypeBodyElements EOF ;
    public final EObject entryRuleTypeBodyElements() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeBodyElements = null;


        try {
            // InternalBSharp.g:1522:57: (iv_ruleTypeBodyElements= ruleTypeBodyElements EOF )
            // InternalBSharp.g:1523:2: iv_ruleTypeBodyElements= ruleTypeBodyElements EOF
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
    // InternalBSharp.g:1529:1: ruleTypeBodyElements returns [EObject current=null] : ( ( (lv_functions_0_0= ruleFunctionDecl ) ) | ( (lv_theorems_1_0= ruleTheoremBody ) ) ) ;
    public final EObject ruleTypeBodyElements() throws RecognitionException {
        EObject current = null;

        EObject lv_functions_0_0 = null;

        EObject lv_theorems_1_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:1535:2: ( ( ( (lv_functions_0_0= ruleFunctionDecl ) ) | ( (lv_theorems_1_0= ruleTheoremBody ) ) ) )
            // InternalBSharp.g:1536:2: ( ( (lv_functions_0_0= ruleFunctionDecl ) ) | ( (lv_theorems_1_0= ruleTheoremBody ) ) )
            {
            // InternalBSharp.g:1536:2: ( ( (lv_functions_0_0= ruleFunctionDecl ) ) | ( (lv_theorems_1_0= ruleTheoremBody ) ) )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_ID) ) {
                alt29=1;
            }
            else if ( (LA29_0==41) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalBSharp.g:1537:3: ( (lv_functions_0_0= ruleFunctionDecl ) )
                    {
                    // InternalBSharp.g:1537:3: ( (lv_functions_0_0= ruleFunctionDecl ) )
                    // InternalBSharp.g:1538:4: (lv_functions_0_0= ruleFunctionDecl )
                    {
                    // InternalBSharp.g:1538:4: (lv_functions_0_0= ruleFunctionDecl )
                    // InternalBSharp.g:1539:5: lv_functions_0_0= ruleFunctionDecl
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
                    						"ac.soton.bsharp.BSharp.FunctionDecl");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalBSharp.g:1557:3: ( (lv_theorems_1_0= ruleTheoremBody ) )
                    {
                    // InternalBSharp.g:1557:3: ( (lv_theorems_1_0= ruleTheoremBody ) )
                    // InternalBSharp.g:1558:4: (lv_theorems_1_0= ruleTheoremBody )
                    {
                    // InternalBSharp.g:1558:4: (lv_theorems_1_0= ruleTheoremBody )
                    // InternalBSharp.g:1559:5: lv_theorems_1_0= ruleTheoremBody
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
                    						"ac.soton.bsharp.BSharp.TheoremBody");
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
    // InternalBSharp.g:1580:1: entryRuleFunctionDecl returns [EObject current=null] : iv_ruleFunctionDecl= ruleFunctionDecl EOF ;
    public final EObject entryRuleFunctionDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionDecl = null;


        try {
            // InternalBSharp.g:1580:53: (iv_ruleFunctionDecl= ruleFunctionDecl EOF )
            // InternalBSharp.g:1581:2: iv_ruleFunctionDecl= ruleFunctionDecl EOF
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
    // InternalBSharp.g:1587:1: ruleFunctionDecl returns [EObject current=null] : ( ( (lv_name_0_0= ruleFunctionName ) ) ( (lv_context_1_0= rulePolyContext ) )? otherlv_2= '(' ( (lv_varList_3_0= ruleTypedVariableList ) )? otherlv_4= ')' otherlv_5= ':' ( (lv_returnType_6_0= ruleTypeConstructor ) ) ( (lv_infix_7_0= 'INFIX' ) )? ( (lv_precedence_8_0= RULE_INT ) )? ( (lv_expr_9_0= ruleRootExpression ) ) ) ;
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

        EObject lv_expr_9_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:1593:2: ( ( ( (lv_name_0_0= ruleFunctionName ) ) ( (lv_context_1_0= rulePolyContext ) )? otherlv_2= '(' ( (lv_varList_3_0= ruleTypedVariableList ) )? otherlv_4= ')' otherlv_5= ':' ( (lv_returnType_6_0= ruleTypeConstructor ) ) ( (lv_infix_7_0= 'INFIX' ) )? ( (lv_precedence_8_0= RULE_INT ) )? ( (lv_expr_9_0= ruleRootExpression ) ) ) )
            // InternalBSharp.g:1594:2: ( ( (lv_name_0_0= ruleFunctionName ) ) ( (lv_context_1_0= rulePolyContext ) )? otherlv_2= '(' ( (lv_varList_3_0= ruleTypedVariableList ) )? otherlv_4= ')' otherlv_5= ':' ( (lv_returnType_6_0= ruleTypeConstructor ) ) ( (lv_infix_7_0= 'INFIX' ) )? ( (lv_precedence_8_0= RULE_INT ) )? ( (lv_expr_9_0= ruleRootExpression ) ) )
            {
            // InternalBSharp.g:1594:2: ( ( (lv_name_0_0= ruleFunctionName ) ) ( (lv_context_1_0= rulePolyContext ) )? otherlv_2= '(' ( (lv_varList_3_0= ruleTypedVariableList ) )? otherlv_4= ')' otherlv_5= ':' ( (lv_returnType_6_0= ruleTypeConstructor ) ) ( (lv_infix_7_0= 'INFIX' ) )? ( (lv_precedence_8_0= RULE_INT ) )? ( (lv_expr_9_0= ruleRootExpression ) ) )
            // InternalBSharp.g:1595:3: ( (lv_name_0_0= ruleFunctionName ) ) ( (lv_context_1_0= rulePolyContext ) )? otherlv_2= '(' ( (lv_varList_3_0= ruleTypedVariableList ) )? otherlv_4= ')' otherlv_5= ':' ( (lv_returnType_6_0= ruleTypeConstructor ) ) ( (lv_infix_7_0= 'INFIX' ) )? ( (lv_precedence_8_0= RULE_INT ) )? ( (lv_expr_9_0= ruleRootExpression ) )
            {
            // InternalBSharp.g:1595:3: ( (lv_name_0_0= ruleFunctionName ) )
            // InternalBSharp.g:1596:4: (lv_name_0_0= ruleFunctionName )
            {
            // InternalBSharp.g:1596:4: (lv_name_0_0= ruleFunctionName )
            // InternalBSharp.g:1597:5: lv_name_0_0= ruleFunctionName
            {

            					newCompositeNode(grammarAccess.getFunctionDeclAccess().getNameFunctionNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_31);
            lv_name_0_0=ruleFunctionName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFunctionDeclRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"ac.soton.bsharp.BSharp.FunctionName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBSharp.g:1614:3: ( (lv_context_1_0= rulePolyContext ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==20) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalBSharp.g:1615:4: (lv_context_1_0= rulePolyContext )
                    {
                    // InternalBSharp.g:1615:4: (lv_context_1_0= rulePolyContext )
                    // InternalBSharp.g:1616:5: lv_context_1_0= rulePolyContext
                    {

                    					newCompositeNode(grammarAccess.getFunctionDeclAccess().getContextPolyContextParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_30);
                    lv_context_1_0=rulePolyContext();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFunctionDeclRule());
                    					}
                    					set(
                    						current,
                    						"context",
                    						lv_context_1_0,
                    						"ac.soton.bsharp.BSharp.PolyContext");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,33,FOLLOW_32); 

            			newLeafNode(otherlv_2, grammarAccess.getFunctionDeclAccess().getLeftParenthesisKeyword_2());
            		
            // InternalBSharp.g:1637:3: ( (lv_varList_3_0= ruleTypedVariableList ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_ID) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalBSharp.g:1638:4: (lv_varList_3_0= ruleTypedVariableList )
                    {
                    // InternalBSharp.g:1638:4: (lv_varList_3_0= ruleTypedVariableList )
                    // InternalBSharp.g:1639:5: lv_varList_3_0= ruleTypedVariableList
                    {

                    					newCompositeNode(grammarAccess.getFunctionDeclAccess().getVarListTypedVariableListParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_22);
                    lv_varList_3_0=ruleTypedVariableList();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFunctionDeclRule());
                    					}
                    					set(
                    						current,
                    						"varList",
                    						lv_varList_3_0,
                    						"ac.soton.bsharp.BSharp.TypedVariableList");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,34,FOLLOW_33); 

            			newLeafNode(otherlv_4, grammarAccess.getFunctionDeclAccess().getRightParenthesisKeyword_4());
            		
            otherlv_5=(Token)match(input,11,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getFunctionDeclAccess().getColonKeyword_5());
            		
            // InternalBSharp.g:1664:3: ( (lv_returnType_6_0= ruleTypeConstructor ) )
            // InternalBSharp.g:1665:4: (lv_returnType_6_0= ruleTypeConstructor )
            {
            // InternalBSharp.g:1665:4: (lv_returnType_6_0= ruleTypeConstructor )
            // InternalBSharp.g:1666:5: lv_returnType_6_0= ruleTypeConstructor
            {

            					newCompositeNode(grammarAccess.getFunctionDeclAccess().getReturnTypeTypeConstructorParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_34);
            lv_returnType_6_0=ruleTypeConstructor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFunctionDeclRule());
            					}
            					set(
            						current,
            						"returnType",
            						lv_returnType_6_0,
            						"ac.soton.bsharp.BSharp.TypeConstructor");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBSharp.g:1683:3: ( (lv_infix_7_0= 'INFIX' ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==39) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalBSharp.g:1684:4: (lv_infix_7_0= 'INFIX' )
                    {
                    // InternalBSharp.g:1684:4: (lv_infix_7_0= 'INFIX' )
                    // InternalBSharp.g:1685:5: lv_infix_7_0= 'INFIX'
                    {
                    lv_infix_7_0=(Token)match(input,39,FOLLOW_35); 

                    					newLeafNode(lv_infix_7_0, grammarAccess.getFunctionDeclAccess().getInfixINFIXKeyword_7_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFunctionDeclRule());
                    					}
                    					setWithLastConsumed(current, "infix", lv_infix_7_0, "INFIX");
                    				

                    }


                    }
                    break;

            }

            // InternalBSharp.g:1697:3: ( (lv_precedence_8_0= RULE_INT ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_INT) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalBSharp.g:1698:4: (lv_precedence_8_0= RULE_INT )
                    {
                    // InternalBSharp.g:1698:4: (lv_precedence_8_0= RULE_INT )
                    // InternalBSharp.g:1699:5: lv_precedence_8_0= RULE_INT
                    {
                    lv_precedence_8_0=(Token)match(input,RULE_INT,FOLLOW_25); 

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

            // InternalBSharp.g:1715:3: ( (lv_expr_9_0= ruleRootExpression ) )
            // InternalBSharp.g:1716:4: (lv_expr_9_0= ruleRootExpression )
            {
            // InternalBSharp.g:1716:4: (lv_expr_9_0= ruleRootExpression )
            // InternalBSharp.g:1717:5: lv_expr_9_0= ruleRootExpression
            {

            					newCompositeNode(grammarAccess.getFunctionDeclAccess().getExprRootExpressionParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_2);
            lv_expr_9_0=ruleRootExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFunctionDeclRule());
            					}
            					set(
            						current,
            						"expr",
            						lv_expr_9_0,
            						"ac.soton.bsharp.BSharp.RootExpression");
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
    // InternalBSharp.g:1738:1: entryRuleFunctionName returns [EObject current=null] : iv_ruleFunctionName= ruleFunctionName EOF ;
    public final EObject entryRuleFunctionName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionName = null;


        try {
            // InternalBSharp.g:1738:53: (iv_ruleFunctionName= ruleFunctionName EOF )
            // InternalBSharp.g:1739:2: iv_ruleFunctionName= ruleFunctionName EOF
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
    // InternalBSharp.g:1745:1: ruleFunctionName returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleFunctionName() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalBSharp.g:1751:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalBSharp.g:1752:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalBSharp.g:1752:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalBSharp.g:1753:3: (lv_name_0_0= RULE_ID )
            {
            // InternalBSharp.g:1753:3: (lv_name_0_0= RULE_ID )
            // InternalBSharp.g:1754:4: lv_name_0_0= RULE_ID
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


    // $ANTLR start "entryRuleMatchStatement"
    // InternalBSharp.g:1773:1: entryRuleMatchStatement returns [EObject current=null] : iv_ruleMatchStatement= ruleMatchStatement EOF ;
    public final EObject entryRuleMatchStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMatchStatement = null;


        try {
            // InternalBSharp.g:1773:55: (iv_ruleMatchStatement= ruleMatchStatement EOF )
            // InternalBSharp.g:1774:2: iv_ruleMatchStatement= ruleMatchStatement EOF
            {
             newCompositeNode(grammarAccess.getMatchStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMatchStatement=ruleMatchStatement();

            state._fsp--;

             current =iv_ruleMatchStatement; 
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
    // $ANTLR end "entryRuleMatchStatement"


    // $ANTLR start "ruleMatchStatement"
    // InternalBSharp.g:1780:1: ruleMatchStatement returns [EObject current=null] : (otherlv_0= 'match' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' ( (lv_inductCase_3_0= ruleMatchCase ) ) ( (lv_inductCase_4_0= ruleMatchCase ) )* otherlv_5= '}' ) ;
    public final EObject ruleMatchStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_inductCase_3_0 = null;

        EObject lv_inductCase_4_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:1786:2: ( (otherlv_0= 'match' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' ( (lv_inductCase_3_0= ruleMatchCase ) ) ( (lv_inductCase_4_0= ruleMatchCase ) )* otherlv_5= '}' ) )
            // InternalBSharp.g:1787:2: (otherlv_0= 'match' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' ( (lv_inductCase_3_0= ruleMatchCase ) ) ( (lv_inductCase_4_0= ruleMatchCase ) )* otherlv_5= '}' )
            {
            // InternalBSharp.g:1787:2: (otherlv_0= 'match' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' ( (lv_inductCase_3_0= ruleMatchCase ) ) ( (lv_inductCase_4_0= ruleMatchCase ) )* otherlv_5= '}' )
            // InternalBSharp.g:1788:3: otherlv_0= 'match' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' ( (lv_inductCase_3_0= ruleMatchCase ) ) ( (lv_inductCase_4_0= ruleMatchCase ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getMatchStatementAccess().getMatchKeyword_0());
            		
            // InternalBSharp.g:1792:3: ( (otherlv_1= RULE_ID ) )
            // InternalBSharp.g:1793:4: (otherlv_1= RULE_ID )
            {
            // InternalBSharp.g:1793:4: (otherlv_1= RULE_ID )
            // InternalBSharp.g:1794:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMatchStatementRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(otherlv_1, grammarAccess.getMatchStatementAccess().getMatchDatatypeConstructorCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_27); 

            			newLeafNode(otherlv_2, grammarAccess.getMatchStatementAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalBSharp.g:1809:3: ( (lv_inductCase_3_0= ruleMatchCase ) )
            // InternalBSharp.g:1810:4: (lv_inductCase_3_0= ruleMatchCase )
            {
            // InternalBSharp.g:1810:4: (lv_inductCase_3_0= ruleMatchCase )
            // InternalBSharp.g:1811:5: lv_inductCase_3_0= ruleMatchCase
            {

            					newCompositeNode(grammarAccess.getMatchStatementAccess().getInductCaseMatchCaseParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_36);
            lv_inductCase_3_0=ruleMatchCase();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMatchStatementRule());
            					}
            					add(
            						current,
            						"inductCase",
            						lv_inductCase_3_0,
            						"ac.soton.bsharp.BSharp.MatchCase");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBSharp.g:1828:3: ( (lv_inductCase_4_0= ruleMatchCase ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==37) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalBSharp.g:1829:4: (lv_inductCase_4_0= ruleMatchCase )
            	    {
            	    // InternalBSharp.g:1829:4: (lv_inductCase_4_0= ruleMatchCase )
            	    // InternalBSharp.g:1830:5: lv_inductCase_4_0= ruleMatchCase
            	    {

            	    					newCompositeNode(grammarAccess.getMatchStatementAccess().getInductCaseMatchCaseParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_36);
            	    lv_inductCase_4_0=ruleMatchCase();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMatchStatementRule());
            	    					}
            	    					add(
            	    						current,
            	    						"inductCase",
            	    						lv_inductCase_4_0,
            	    						"ac.soton.bsharp.BSharp.MatchCase");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            otherlv_5=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getMatchStatementAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleMatchStatement"


    // $ANTLR start "entryRuleMatchCase"
    // InternalBSharp.g:1855:1: entryRuleMatchCase returns [EObject current=null] : iv_ruleMatchCase= ruleMatchCase EOF ;
    public final EObject entryRuleMatchCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMatchCase = null;


        try {
            // InternalBSharp.g:1855:50: (iv_ruleMatchCase= ruleMatchCase EOF )
            // InternalBSharp.g:1856:2: iv_ruleMatchCase= ruleMatchCase EOF
            {
             newCompositeNode(grammarAccess.getMatchCaseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMatchCase=ruleMatchCase();

            state._fsp--;

             current =iv_ruleMatchCase; 
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
    // $ANTLR end "entryRuleMatchCase"


    // $ANTLR start "ruleMatchCase"
    // InternalBSharp.g:1862:1: ruleMatchCase returns [EObject current=null] : (otherlv_0= '|' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( (lv_variables_3_0= ruleTypedVariable ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleTypedVariable ) ) )* otherlv_6= ')' )? otherlv_7= ':' ( (lv_expr_8_0= ruleRootExpression ) ) ) ;
    public final EObject ruleMatchCase() throws RecognitionException {
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
            // InternalBSharp.g:1868:2: ( (otherlv_0= '|' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( (lv_variables_3_0= ruleTypedVariable ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleTypedVariable ) ) )* otherlv_6= ')' )? otherlv_7= ':' ( (lv_expr_8_0= ruleRootExpression ) ) ) )
            // InternalBSharp.g:1869:2: (otherlv_0= '|' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( (lv_variables_3_0= ruleTypedVariable ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleTypedVariable ) ) )* otherlv_6= ')' )? otherlv_7= ':' ( (lv_expr_8_0= ruleRootExpression ) ) )
            {
            // InternalBSharp.g:1869:2: (otherlv_0= '|' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( (lv_variables_3_0= ruleTypedVariable ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleTypedVariable ) ) )* otherlv_6= ')' )? otherlv_7= ':' ( (lv_expr_8_0= ruleRootExpression ) ) )
            // InternalBSharp.g:1870:3: otherlv_0= '|' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( (lv_variables_3_0= ruleTypedVariable ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleTypedVariable ) ) )* otherlv_6= ')' )? otherlv_7= ':' ( (lv_expr_8_0= ruleRootExpression ) )
            {
            otherlv_0=(Token)match(input,37,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getMatchCaseAccess().getVerticalLineKeyword_0());
            		
            // InternalBSharp.g:1874:3: ( (otherlv_1= RULE_ID ) )
            // InternalBSharp.g:1875:4: (otherlv_1= RULE_ID )
            {
            // InternalBSharp.g:1875:4: (otherlv_1= RULE_ID )
            // InternalBSharp.g:1876:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMatchCaseRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_37); 

            					newLeafNode(otherlv_1, grammarAccess.getMatchCaseAccess().getDeconNameTypedVariableCrossReference_1_0());
            				

            }


            }

            // InternalBSharp.g:1887:3: (otherlv_2= '(' ( (lv_variables_3_0= ruleTypedVariable ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleTypedVariable ) ) )* otherlv_6= ')' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==33) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalBSharp.g:1888:4: otherlv_2= '(' ( (lv_variables_3_0= ruleTypedVariable ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleTypedVariable ) ) )* otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,33,FOLLOW_6); 

                    				newLeafNode(otherlv_2, grammarAccess.getMatchCaseAccess().getLeftParenthesisKeyword_2_0());
                    			
                    // InternalBSharp.g:1892:4: ( (lv_variables_3_0= ruleTypedVariable ) )
                    // InternalBSharp.g:1893:5: (lv_variables_3_0= ruleTypedVariable )
                    {
                    // InternalBSharp.g:1893:5: (lv_variables_3_0= ruleTypedVariable )
                    // InternalBSharp.g:1894:6: lv_variables_3_0= ruleTypedVariable
                    {

                    						newCompositeNode(grammarAccess.getMatchCaseAccess().getVariablesTypedVariableParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_38);
                    lv_variables_3_0=ruleTypedVariable();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMatchCaseRule());
                    						}
                    						add(
                    							current,
                    							"variables",
                    							lv_variables_3_0,
                    							"ac.soton.bsharp.BSharp.TypedVariable");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBSharp.g:1911:4: (otherlv_4= ',' ( (lv_variables_5_0= ruleTypedVariable ) ) )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==22) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // InternalBSharp.g:1912:5: otherlv_4= ',' ( (lv_variables_5_0= ruleTypedVariable ) )
                    	    {
                    	    otherlv_4=(Token)match(input,22,FOLLOW_6); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getMatchCaseAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalBSharp.g:1916:5: ( (lv_variables_5_0= ruleTypedVariable ) )
                    	    // InternalBSharp.g:1917:6: (lv_variables_5_0= ruleTypedVariable )
                    	    {
                    	    // InternalBSharp.g:1917:6: (lv_variables_5_0= ruleTypedVariable )
                    	    // InternalBSharp.g:1918:7: lv_variables_5_0= ruleTypedVariable
                    	    {

                    	    							newCompositeNode(grammarAccess.getMatchCaseAccess().getVariablesTypedVariableParserRuleCall_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_38);
                    	    lv_variables_5_0=ruleTypedVariable();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMatchCaseRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"variables",
                    	    								lv_variables_5_0,
                    	    								"ac.soton.bsharp.BSharp.TypedVariable");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop35;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,34,FOLLOW_33); 

                    				newLeafNode(otherlv_6, grammarAccess.getMatchCaseAccess().getRightParenthesisKeyword_2_3());
                    			

                    }
                    break;

            }

            otherlv_7=(Token)match(input,11,FOLLOW_25); 

            			newLeafNode(otherlv_7, grammarAccess.getMatchCaseAccess().getColonKeyword_3());
            		
            // InternalBSharp.g:1945:3: ( (lv_expr_8_0= ruleRootExpression ) )
            // InternalBSharp.g:1946:4: (lv_expr_8_0= ruleRootExpression )
            {
            // InternalBSharp.g:1946:4: (lv_expr_8_0= ruleRootExpression )
            // InternalBSharp.g:1947:5: lv_expr_8_0= ruleRootExpression
            {

            					newCompositeNode(grammarAccess.getMatchCaseAccess().getExprRootExpressionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_expr_8_0=ruleRootExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMatchCaseRule());
            					}
            					set(
            						current,
            						"expr",
            						lv_expr_8_0,
            						"ac.soton.bsharp.BSharp.RootExpression");
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
    // $ANTLR end "ruleMatchCase"


    // $ANTLR start "entryRuleTheoremBody"
    // InternalBSharp.g:1968:1: entryRuleTheoremBody returns [EObject current=null] : iv_ruleTheoremBody= ruleTheoremBody EOF ;
    public final EObject entryRuleTheoremBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTheoremBody = null;


        try {
            // InternalBSharp.g:1968:52: (iv_ruleTheoremBody= ruleTheoremBody EOF )
            // InternalBSharp.g:1969:2: iv_ruleTheoremBody= ruleTheoremBody EOF
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
    // InternalBSharp.g:1975:1: ruleTheoremBody returns [EObject current=null] : (otherlv_0= 'Theorems' otherlv_1= '{' ( (lv_theoremDecl_2_0= ruleTheoremDecl ) )+ otherlv_3= '}' ) ;
    public final EObject ruleTheoremBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_theoremDecl_2_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:1981:2: ( (otherlv_0= 'Theorems' otherlv_1= '{' ( (lv_theoremDecl_2_0= ruleTheoremDecl ) )+ otherlv_3= '}' ) )
            // InternalBSharp.g:1982:2: (otherlv_0= 'Theorems' otherlv_1= '{' ( (lv_theoremDecl_2_0= ruleTheoremDecl ) )+ otherlv_3= '}' )
            {
            // InternalBSharp.g:1982:2: (otherlv_0= 'Theorems' otherlv_1= '{' ( (lv_theoremDecl_2_0= ruleTheoremDecl ) )+ otherlv_3= '}' )
            // InternalBSharp.g:1983:3: otherlv_0= 'Theorems' otherlv_1= '{' ( (lv_theoremDecl_2_0= ruleTheoremDecl ) )+ otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getTheoremBodyAccess().getTheoremsKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getTheoremBodyAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalBSharp.g:1991:3: ( (lv_theoremDecl_2_0= ruleTheoremDecl ) )+
            int cnt37=0;
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( ((LA37_0>=RULE_INT && LA37_0<=RULE_WS)||LA37_0==11) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalBSharp.g:1992:4: (lv_theoremDecl_2_0= ruleTheoremDecl )
            	    {
            	    // InternalBSharp.g:1992:4: (lv_theoremDecl_2_0= ruleTheoremDecl )
            	    // InternalBSharp.g:1993:5: lv_theoremDecl_2_0= ruleTheoremDecl
            	    {

            	    					newCompositeNode(grammarAccess.getTheoremBodyAccess().getTheoremDeclTheoremDeclParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_39);
            	    lv_theoremDecl_2_0=ruleTheoremDecl();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTheoremBodyRule());
            	    					}
            	    					add(
            	    						current,
            	    						"theoremDecl",
            	    						lv_theoremDecl_2_0,
            	    						"ac.soton.bsharp.BSharp.TheoremDecl");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt37 >= 1 ) break loop37;
                        EarlyExitException eee =
                            new EarlyExitException(37, input);
                        throw eee;
                }
                cnt37++;
            } while (true);

            otherlv_3=(Token)match(input,19,FOLLOW_2); 

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
    // InternalBSharp.g:2018:1: entryRuleTheoremDecl returns [EObject current=null] : iv_ruleTheoremDecl= ruleTheoremDecl EOF ;
    public final EObject entryRuleTheoremDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTheoremDecl = null;


        try {
            // InternalBSharp.g:2018:52: (iv_ruleTheoremDecl= ruleTheoremDecl EOF )
            // InternalBSharp.g:2019:2: iv_ruleTheoremDecl= ruleTheoremDecl EOF
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
    // InternalBSharp.g:2025:1: ruleTheoremDecl returns [EObject current=null] : ( ( (lv_name_0_0= ruleTHM_NAME ) ) ( (lv_expr_1_0= ruleRootExpression ) ) otherlv_2= ';' ) ;
    public final EObject ruleTheoremDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_expr_1_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:2031:2: ( ( ( (lv_name_0_0= ruleTHM_NAME ) ) ( (lv_expr_1_0= ruleRootExpression ) ) otherlv_2= ';' ) )
            // InternalBSharp.g:2032:2: ( ( (lv_name_0_0= ruleTHM_NAME ) ) ( (lv_expr_1_0= ruleRootExpression ) ) otherlv_2= ';' )
            {
            // InternalBSharp.g:2032:2: ( ( (lv_name_0_0= ruleTHM_NAME ) ) ( (lv_expr_1_0= ruleRootExpression ) ) otherlv_2= ';' )
            // InternalBSharp.g:2033:3: ( (lv_name_0_0= ruleTHM_NAME ) ) ( (lv_expr_1_0= ruleRootExpression ) ) otherlv_2= ';'
            {
            // InternalBSharp.g:2033:3: ( (lv_name_0_0= ruleTHM_NAME ) )
            // InternalBSharp.g:2034:4: (lv_name_0_0= ruleTHM_NAME )
            {
            // InternalBSharp.g:2034:4: (lv_name_0_0= ruleTHM_NAME )
            // InternalBSharp.g:2035:5: lv_name_0_0= ruleTHM_NAME
            {

            					newCompositeNode(grammarAccess.getTheoremDeclAccess().getNameTHM_NAMEParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_25);
            lv_name_0_0=ruleTHM_NAME();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTheoremDeclRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"ac.soton.bsharp.BSharp.THM_NAME");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBSharp.g:2052:3: ( (lv_expr_1_0= ruleRootExpression ) )
            // InternalBSharp.g:2053:4: (lv_expr_1_0= ruleRootExpression )
            {
            // InternalBSharp.g:2053:4: (lv_expr_1_0= ruleRootExpression )
            // InternalBSharp.g:2054:5: lv_expr_1_0= ruleRootExpression
            {

            					newCompositeNode(grammarAccess.getTheoremDeclAccess().getExprRootExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_40);
            lv_expr_1_0=ruleRootExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTheoremDeclRule());
            					}
            					set(
            						current,
            						"expr",
            						lv_expr_1_0,
            						"ac.soton.bsharp.BSharp.RootExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_2); 

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
    // InternalBSharp.g:2079:1: entryRuleTypedVariableList returns [EObject current=null] : iv_ruleTypedVariableList= ruleTypedVariableList EOF ;
    public final EObject entryRuleTypedVariableList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypedVariableList = null;


        try {
            // InternalBSharp.g:2079:58: (iv_ruleTypedVariableList= ruleTypedVariableList EOF )
            // InternalBSharp.g:2080:2: iv_ruleTypedVariableList= ruleTypedVariableList EOF
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
    // InternalBSharp.g:2086:1: ruleTypedVariableList returns [EObject current=null] : ( ( (lv_variablesOfType_0_0= ruleVariableTyping ) ) (otherlv_1= ',' ( (lv_variablesOfType_2_0= ruleVariableTyping ) ) )* ) ;
    public final EObject ruleTypedVariableList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_variablesOfType_0_0 = null;

        EObject lv_variablesOfType_2_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:2092:2: ( ( ( (lv_variablesOfType_0_0= ruleVariableTyping ) ) (otherlv_1= ',' ( (lv_variablesOfType_2_0= ruleVariableTyping ) ) )* ) )
            // InternalBSharp.g:2093:2: ( ( (lv_variablesOfType_0_0= ruleVariableTyping ) ) (otherlv_1= ',' ( (lv_variablesOfType_2_0= ruleVariableTyping ) ) )* )
            {
            // InternalBSharp.g:2093:2: ( ( (lv_variablesOfType_0_0= ruleVariableTyping ) ) (otherlv_1= ',' ( (lv_variablesOfType_2_0= ruleVariableTyping ) ) )* )
            // InternalBSharp.g:2094:3: ( (lv_variablesOfType_0_0= ruleVariableTyping ) ) (otherlv_1= ',' ( (lv_variablesOfType_2_0= ruleVariableTyping ) ) )*
            {
            // InternalBSharp.g:2094:3: ( (lv_variablesOfType_0_0= ruleVariableTyping ) )
            // InternalBSharp.g:2095:4: (lv_variablesOfType_0_0= ruleVariableTyping )
            {
            // InternalBSharp.g:2095:4: (lv_variablesOfType_0_0= ruleVariableTyping )
            // InternalBSharp.g:2096:5: lv_variablesOfType_0_0= ruleVariableTyping
            {

            					newCompositeNode(grammarAccess.getTypedVariableListAccess().getVariablesOfTypeVariableTypingParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_18);
            lv_variablesOfType_0_0=ruleVariableTyping();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTypedVariableListRule());
            					}
            					add(
            						current,
            						"variablesOfType",
            						lv_variablesOfType_0_0,
            						"ac.soton.bsharp.BSharp.VariableTyping");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBSharp.g:2113:3: (otherlv_1= ',' ( (lv_variablesOfType_2_0= ruleVariableTyping ) ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==22) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalBSharp.g:2114:4: otherlv_1= ',' ( (lv_variablesOfType_2_0= ruleVariableTyping ) )
            	    {
            	    otherlv_1=(Token)match(input,22,FOLLOW_6); 

            	    				newLeafNode(otherlv_1, grammarAccess.getTypedVariableListAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalBSharp.g:2118:4: ( (lv_variablesOfType_2_0= ruleVariableTyping ) )
            	    // InternalBSharp.g:2119:5: (lv_variablesOfType_2_0= ruleVariableTyping )
            	    {
            	    // InternalBSharp.g:2119:5: (lv_variablesOfType_2_0= ruleVariableTyping )
            	    // InternalBSharp.g:2120:6: lv_variablesOfType_2_0= ruleVariableTyping
            	    {

            	    						newCompositeNode(grammarAccess.getTypedVariableListAccess().getVariablesOfTypeVariableTypingParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_18);
            	    lv_variablesOfType_2_0=ruleVariableTyping();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTypedVariableListRule());
            	    						}
            	    						add(
            	    							current,
            	    							"variablesOfType",
            	    							lv_variablesOfType_2_0,
            	    							"ac.soton.bsharp.BSharp.VariableTyping");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop38;
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
    // InternalBSharp.g:2142:1: entryRuleVariableTyping returns [EObject current=null] : iv_ruleVariableTyping= ruleVariableTyping EOF ;
    public final EObject entryRuleVariableTyping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableTyping = null;


        try {
            // InternalBSharp.g:2142:55: (iv_ruleVariableTyping= ruleVariableTyping EOF )
            // InternalBSharp.g:2143:2: iv_ruleVariableTyping= ruleVariableTyping EOF
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
    // InternalBSharp.g:2149:1: ruleVariableTyping returns [EObject current=null] : ( ( (lv_typeVar_0_0= ruleTypedVariable ) ) (otherlv_1= ',' ( (lv_typeVar_2_0= ruleTypedVariable ) ) )* otherlv_3= ':' ( (lv_type_4_0= ruleConstructedType ) ) ) ;
    public final EObject ruleVariableTyping() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_typeVar_0_0 = null;

        EObject lv_typeVar_2_0 = null;

        EObject lv_type_4_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:2155:2: ( ( ( (lv_typeVar_0_0= ruleTypedVariable ) ) (otherlv_1= ',' ( (lv_typeVar_2_0= ruleTypedVariable ) ) )* otherlv_3= ':' ( (lv_type_4_0= ruleConstructedType ) ) ) )
            // InternalBSharp.g:2156:2: ( ( (lv_typeVar_0_0= ruleTypedVariable ) ) (otherlv_1= ',' ( (lv_typeVar_2_0= ruleTypedVariable ) ) )* otherlv_3= ':' ( (lv_type_4_0= ruleConstructedType ) ) )
            {
            // InternalBSharp.g:2156:2: ( ( (lv_typeVar_0_0= ruleTypedVariable ) ) (otherlv_1= ',' ( (lv_typeVar_2_0= ruleTypedVariable ) ) )* otherlv_3= ':' ( (lv_type_4_0= ruleConstructedType ) ) )
            // InternalBSharp.g:2157:3: ( (lv_typeVar_0_0= ruleTypedVariable ) ) (otherlv_1= ',' ( (lv_typeVar_2_0= ruleTypedVariable ) ) )* otherlv_3= ':' ( (lv_type_4_0= ruleConstructedType ) )
            {
            // InternalBSharp.g:2157:3: ( (lv_typeVar_0_0= ruleTypedVariable ) )
            // InternalBSharp.g:2158:4: (lv_typeVar_0_0= ruleTypedVariable )
            {
            // InternalBSharp.g:2158:4: (lv_typeVar_0_0= ruleTypedVariable )
            // InternalBSharp.g:2159:5: lv_typeVar_0_0= ruleTypedVariable
            {

            					newCompositeNode(grammarAccess.getVariableTypingAccess().getTypeVarTypedVariableParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_41);
            lv_typeVar_0_0=ruleTypedVariable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariableTypingRule());
            					}
            					add(
            						current,
            						"typeVar",
            						lv_typeVar_0_0,
            						"ac.soton.bsharp.BSharp.TypedVariable");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBSharp.g:2176:3: (otherlv_1= ',' ( (lv_typeVar_2_0= ruleTypedVariable ) ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==22) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalBSharp.g:2177:4: otherlv_1= ',' ( (lv_typeVar_2_0= ruleTypedVariable ) )
            	    {
            	    otherlv_1=(Token)match(input,22,FOLLOW_6); 

            	    				newLeafNode(otherlv_1, grammarAccess.getVariableTypingAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalBSharp.g:2181:4: ( (lv_typeVar_2_0= ruleTypedVariable ) )
            	    // InternalBSharp.g:2182:5: (lv_typeVar_2_0= ruleTypedVariable )
            	    {
            	    // InternalBSharp.g:2182:5: (lv_typeVar_2_0= ruleTypedVariable )
            	    // InternalBSharp.g:2183:6: lv_typeVar_2_0= ruleTypedVariable
            	    {

            	    						newCompositeNode(grammarAccess.getVariableTypingAccess().getTypeVarTypedVariableParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_41);
            	    lv_typeVar_2_0=ruleTypedVariable();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getVariableTypingRule());
            	    						}
            	    						add(
            	    							current,
            	    							"typeVar",
            	    							lv_typeVar_2_0,
            	    							"ac.soton.bsharp.BSharp.TypedVariable");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

            otherlv_3=(Token)match(input,11,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getVariableTypingAccess().getColonKeyword_2());
            		
            // InternalBSharp.g:2205:3: ( (lv_type_4_0= ruleConstructedType ) )
            // InternalBSharp.g:2206:4: (lv_type_4_0= ruleConstructedType )
            {
            // InternalBSharp.g:2206:4: (lv_type_4_0= ruleConstructedType )
            // InternalBSharp.g:2207:5: lv_type_4_0= ruleConstructedType
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
            						"ac.soton.bsharp.BSharp.ConstructedType");
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
    // InternalBSharp.g:2228:1: entryRuleTypedVariable returns [EObject current=null] : iv_ruleTypedVariable= ruleTypedVariable EOF ;
    public final EObject entryRuleTypedVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypedVariable = null;


        try {
            // InternalBSharp.g:2228:54: (iv_ruleTypedVariable= ruleTypedVariable EOF )
            // InternalBSharp.g:2229:2: iv_ruleTypedVariable= ruleTypedVariable EOF
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
    // InternalBSharp.g:2235:1: ruleTypedVariable returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleTypedVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalBSharp.g:2241:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalBSharp.g:2242:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalBSharp.g:2242:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalBSharp.g:2243:3: (lv_name_0_0= RULE_ID )
            {
            // InternalBSharp.g:2243:3: (lv_name_0_0= RULE_ID )
            // InternalBSharp.g:2244:4: lv_name_0_0= RULE_ID
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
    // InternalBSharp.g:2263:1: entryRuleLambda returns [EObject current=null] : iv_ruleLambda= ruleLambda EOF ;
    public final EObject entryRuleLambda() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLambda = null;


        try {
            // InternalBSharp.g:2263:47: (iv_ruleLambda= ruleLambda EOF )
            // InternalBSharp.g:2264:2: iv_ruleLambda= ruleLambda EOF
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
    // InternalBSharp.g:2270:1: ruleLambda returns [EObject current=null] : ( ( (lv_qType_0_0= '\\u03BB' ) ) ( (lv_context_1_0= rulePolyContext ) )? ( (lv_varList_2_0= ruleTypedVariableList ) ) otherlv_3= '|' ( (lv_expr_4_0= ruleRootExpression ) ) ) ;
    public final EObject ruleLambda() throws RecognitionException {
        EObject current = null;

        Token lv_qType_0_0=null;
        Token otherlv_3=null;
        EObject lv_context_1_0 = null;

        EObject lv_varList_2_0 = null;

        EObject lv_expr_4_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:2276:2: ( ( ( (lv_qType_0_0= '\\u03BB' ) ) ( (lv_context_1_0= rulePolyContext ) )? ( (lv_varList_2_0= ruleTypedVariableList ) ) otherlv_3= '|' ( (lv_expr_4_0= ruleRootExpression ) ) ) )
            // InternalBSharp.g:2277:2: ( ( (lv_qType_0_0= '\\u03BB' ) ) ( (lv_context_1_0= rulePolyContext ) )? ( (lv_varList_2_0= ruleTypedVariableList ) ) otherlv_3= '|' ( (lv_expr_4_0= ruleRootExpression ) ) )
            {
            // InternalBSharp.g:2277:2: ( ( (lv_qType_0_0= '\\u03BB' ) ) ( (lv_context_1_0= rulePolyContext ) )? ( (lv_varList_2_0= ruleTypedVariableList ) ) otherlv_3= '|' ( (lv_expr_4_0= ruleRootExpression ) ) )
            // InternalBSharp.g:2278:3: ( (lv_qType_0_0= '\\u03BB' ) ) ( (lv_context_1_0= rulePolyContext ) )? ( (lv_varList_2_0= ruleTypedVariableList ) ) otherlv_3= '|' ( (lv_expr_4_0= ruleRootExpression ) )
            {
            // InternalBSharp.g:2278:3: ( (lv_qType_0_0= '\\u03BB' ) )
            // InternalBSharp.g:2279:4: (lv_qType_0_0= '\\u03BB' )
            {
            // InternalBSharp.g:2279:4: (lv_qType_0_0= '\\u03BB' )
            // InternalBSharp.g:2280:5: lv_qType_0_0= '\\u03BB'
            {
            lv_qType_0_0=(Token)match(input,42,FOLLOW_42); 

            					newLeafNode(lv_qType_0_0, grammarAccess.getLambdaAccess().getQTypeGreekSmallLetterLamdaKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLambdaRule());
            					}
            					setWithLastConsumed(current, "qType", lv_qType_0_0, "\u03BB");
            				

            }


            }

            // InternalBSharp.g:2292:3: ( (lv_context_1_0= rulePolyContext ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==20) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalBSharp.g:2293:4: (lv_context_1_0= rulePolyContext )
                    {
                    // InternalBSharp.g:2293:4: (lv_context_1_0= rulePolyContext )
                    // InternalBSharp.g:2294:5: lv_context_1_0= rulePolyContext
                    {

                    					newCompositeNode(grammarAccess.getLambdaAccess().getContextPolyContextParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_6);
                    lv_context_1_0=rulePolyContext();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getLambdaRule());
                    					}
                    					set(
                    						current,
                    						"context",
                    						lv_context_1_0,
                    						"ac.soton.bsharp.BSharp.PolyContext");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalBSharp.g:2311:3: ( (lv_varList_2_0= ruleTypedVariableList ) )
            // InternalBSharp.g:2312:4: (lv_varList_2_0= ruleTypedVariableList )
            {
            // InternalBSharp.g:2312:4: (lv_varList_2_0= ruleTypedVariableList )
            // InternalBSharp.g:2313:5: lv_varList_2_0= ruleTypedVariableList
            {

            					newCompositeNode(grammarAccess.getLambdaAccess().getVarListTypedVariableListParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_27);
            lv_varList_2_0=ruleTypedVariableList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLambdaRule());
            					}
            					set(
            						current,
            						"varList",
            						lv_varList_2_0,
            						"ac.soton.bsharp.BSharp.TypedVariableList");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,37,FOLLOW_25); 

            			newLeafNode(otherlv_3, grammarAccess.getLambdaAccess().getVerticalLineKeyword_3());
            		
            // InternalBSharp.g:2334:3: ( (lv_expr_4_0= ruleRootExpression ) )
            // InternalBSharp.g:2335:4: (lv_expr_4_0= ruleRootExpression )
            {
            // InternalBSharp.g:2335:4: (lv_expr_4_0= ruleRootExpression )
            // InternalBSharp.g:2336:5: lv_expr_4_0= ruleRootExpression
            {

            					newCompositeNode(grammarAccess.getLambdaAccess().getExprRootExpressionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_expr_4_0=ruleRootExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLambdaRule());
            					}
            					set(
            						current,
            						"expr",
            						lv_expr_4_0,
            						"ac.soton.bsharp.BSharp.RootExpression");
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
    // InternalBSharp.g:2357:1: entryRuleQuantifier returns [EObject current=null] : iv_ruleQuantifier= ruleQuantifier EOF ;
    public final EObject entryRuleQuantifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuantifier = null;


        try {
            // InternalBSharp.g:2357:51: (iv_ruleQuantifier= ruleQuantifier EOF )
            // InternalBSharp.g:2358:2: iv_ruleQuantifier= ruleQuantifier EOF
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
    // InternalBSharp.g:2364:1: ruleQuantifier returns [EObject current=null] : ( ( ( (lv_qType_0_1= '\\u2200' | lv_qType_0_2= '\\u2203' ) ) ) ( (lv_context_1_0= rulePolyContext ) )? ( (lv_varList_2_0= ruleTypedVariableList ) ) otherlv_3= '\\u00B7' ( (lv_expr_4_0= ruleRootExpression ) ) ) ;
    public final EObject ruleQuantifier() throws RecognitionException {
        EObject current = null;

        Token lv_qType_0_1=null;
        Token lv_qType_0_2=null;
        Token otherlv_3=null;
        EObject lv_context_1_0 = null;

        EObject lv_varList_2_0 = null;

        EObject lv_expr_4_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:2370:2: ( ( ( ( (lv_qType_0_1= '\\u2200' | lv_qType_0_2= '\\u2203' ) ) ) ( (lv_context_1_0= rulePolyContext ) )? ( (lv_varList_2_0= ruleTypedVariableList ) ) otherlv_3= '\\u00B7' ( (lv_expr_4_0= ruleRootExpression ) ) ) )
            // InternalBSharp.g:2371:2: ( ( ( (lv_qType_0_1= '\\u2200' | lv_qType_0_2= '\\u2203' ) ) ) ( (lv_context_1_0= rulePolyContext ) )? ( (lv_varList_2_0= ruleTypedVariableList ) ) otherlv_3= '\\u00B7' ( (lv_expr_4_0= ruleRootExpression ) ) )
            {
            // InternalBSharp.g:2371:2: ( ( ( (lv_qType_0_1= '\\u2200' | lv_qType_0_2= '\\u2203' ) ) ) ( (lv_context_1_0= rulePolyContext ) )? ( (lv_varList_2_0= ruleTypedVariableList ) ) otherlv_3= '\\u00B7' ( (lv_expr_4_0= ruleRootExpression ) ) )
            // InternalBSharp.g:2372:3: ( ( (lv_qType_0_1= '\\u2200' | lv_qType_0_2= '\\u2203' ) ) ) ( (lv_context_1_0= rulePolyContext ) )? ( (lv_varList_2_0= ruleTypedVariableList ) ) otherlv_3= '\\u00B7' ( (lv_expr_4_0= ruleRootExpression ) )
            {
            // InternalBSharp.g:2372:3: ( ( (lv_qType_0_1= '\\u2200' | lv_qType_0_2= '\\u2203' ) ) )
            // InternalBSharp.g:2373:4: ( (lv_qType_0_1= '\\u2200' | lv_qType_0_2= '\\u2203' ) )
            {
            // InternalBSharp.g:2373:4: ( (lv_qType_0_1= '\\u2200' | lv_qType_0_2= '\\u2203' ) )
            // InternalBSharp.g:2374:5: (lv_qType_0_1= '\\u2200' | lv_qType_0_2= '\\u2203' )
            {
            // InternalBSharp.g:2374:5: (lv_qType_0_1= '\\u2200' | lv_qType_0_2= '\\u2203' )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==43) ) {
                alt41=1;
            }
            else if ( (LA41_0==44) ) {
                alt41=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // InternalBSharp.g:2375:6: lv_qType_0_1= '\\u2200'
                    {
                    lv_qType_0_1=(Token)match(input,43,FOLLOW_42); 

                    						newLeafNode(lv_qType_0_1, grammarAccess.getQuantifierAccess().getQTypeForAllKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getQuantifierRule());
                    						}
                    						setWithLastConsumed(current, "qType", lv_qType_0_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalBSharp.g:2386:6: lv_qType_0_2= '\\u2203'
                    {
                    lv_qType_0_2=(Token)match(input,44,FOLLOW_42); 

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

            // InternalBSharp.g:2399:3: ( (lv_context_1_0= rulePolyContext ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==20) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalBSharp.g:2400:4: (lv_context_1_0= rulePolyContext )
                    {
                    // InternalBSharp.g:2400:4: (lv_context_1_0= rulePolyContext )
                    // InternalBSharp.g:2401:5: lv_context_1_0= rulePolyContext
                    {

                    					newCompositeNode(grammarAccess.getQuantifierAccess().getContextPolyContextParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_6);
                    lv_context_1_0=rulePolyContext();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getQuantifierRule());
                    					}
                    					set(
                    						current,
                    						"context",
                    						lv_context_1_0,
                    						"ac.soton.bsharp.BSharp.PolyContext");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalBSharp.g:2418:3: ( (lv_varList_2_0= ruleTypedVariableList ) )
            // InternalBSharp.g:2419:4: (lv_varList_2_0= ruleTypedVariableList )
            {
            // InternalBSharp.g:2419:4: (lv_varList_2_0= ruleTypedVariableList )
            // InternalBSharp.g:2420:5: lv_varList_2_0= ruleTypedVariableList
            {

            					newCompositeNode(grammarAccess.getQuantifierAccess().getVarListTypedVariableListParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_43);
            lv_varList_2_0=ruleTypedVariableList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getQuantifierRule());
            					}
            					set(
            						current,
            						"varList",
            						lv_varList_2_0,
            						"ac.soton.bsharp.BSharp.TypedVariableList");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,45,FOLLOW_25); 

            			newLeafNode(otherlv_3, grammarAccess.getQuantifierAccess().getMiddleDotKeyword_3());
            		
            // InternalBSharp.g:2441:3: ( (lv_expr_4_0= ruleRootExpression ) )
            // InternalBSharp.g:2442:4: (lv_expr_4_0= ruleRootExpression )
            {
            // InternalBSharp.g:2442:4: (lv_expr_4_0= ruleRootExpression )
            // InternalBSharp.g:2443:5: lv_expr_4_0= ruleRootExpression
            {

            					newCompositeNode(grammarAccess.getQuantifierAccess().getExprRootExpressionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_expr_4_0=ruleRootExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getQuantifierRule());
            					}
            					set(
            						current,
            						"expr",
            						lv_expr_4_0,
            						"ac.soton.bsharp.BSharp.RootExpression");
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
    // InternalBSharp.g:2464:1: entryRuleRootExpression returns [EObject current=null] : iv_ruleRootExpression= ruleRootExpression EOF ;
    public final EObject entryRuleRootExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRootExpression = null;


        try {
            // InternalBSharp.g:2464:55: (iv_ruleRootExpression= ruleRootExpression EOF )
            // InternalBSharp.g:2465:2: iv_ruleRootExpression= ruleRootExpression EOF
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
    // InternalBSharp.g:2471:1: ruleRootExpression returns [EObject current=null] : (this_Lambda_0= ruleLambda | this_Quantifier_1= ruleQuantifier | this_Infix_2= ruleInfix | this_MatchStatement_3= ruleMatchStatement ) ;
    public final EObject ruleRootExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Lambda_0 = null;

        EObject this_Quantifier_1 = null;

        EObject this_Infix_2 = null;

        EObject this_MatchStatement_3 = null;



        	enterRule();

        try {
            // InternalBSharp.g:2477:2: ( (this_Lambda_0= ruleLambda | this_Quantifier_1= ruleQuantifier | this_Infix_2= ruleInfix | this_MatchStatement_3= ruleMatchStatement ) )
            // InternalBSharp.g:2478:2: (this_Lambda_0= ruleLambda | this_Quantifier_1= ruleQuantifier | this_Infix_2= ruleInfix | this_MatchStatement_3= ruleMatchStatement )
            {
            // InternalBSharp.g:2478:2: (this_Lambda_0= ruleLambda | this_Quantifier_1= ruleQuantifier | this_Infix_2= ruleInfix | this_MatchStatement_3= ruleMatchStatement )
            int alt43=4;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt43=1;
                }
                break;
            case 43:
            case 44:
                {
                alt43=2;
                }
                break;
            case RULE_ID:
            case 33:
            case 46:
                {
                alt43=3;
                }
                break;
            case 40:
                {
                alt43=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }

            switch (alt43) {
                case 1 :
                    // InternalBSharp.g:2479:3: this_Lambda_0= ruleLambda
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
                    // InternalBSharp.g:2488:3: this_Quantifier_1= ruleQuantifier
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
                    // InternalBSharp.g:2497:3: this_Infix_2= ruleInfix
                    {

                    			newCompositeNode(grammarAccess.getRootExpressionAccess().getInfixParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Infix_2=ruleInfix();

                    state._fsp--;


                    			current = this_Infix_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalBSharp.g:2506:3: this_MatchStatement_3= ruleMatchStatement
                    {

                    			newCompositeNode(grammarAccess.getRootExpressionAccess().getMatchStatementParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_MatchStatement_3=ruleMatchStatement();

                    state._fsp--;


                    			current = this_MatchStatement_3;
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
    // InternalBSharp.g:2518:1: entryRulePrefix returns [EObject current=null] : iv_rulePrefix= rulePrefix EOF ;
    public final EObject entryRulePrefix() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrefix = null;


        try {
            // InternalBSharp.g:2518:47: (iv_rulePrefix= rulePrefix EOF )
            // InternalBSharp.g:2519:2: iv_rulePrefix= rulePrefix EOF
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
    // InternalBSharp.g:2525:1: rulePrefix returns [EObject current=null] : ( ( (lv_name_0_0= rulePrefixBuiltIn ) ) ( (lv_elem_1_0= ruleElement ) ) ) ;
    public final EObject rulePrefix() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_elem_1_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:2531:2: ( ( ( (lv_name_0_0= rulePrefixBuiltIn ) ) ( (lv_elem_1_0= ruleElement ) ) ) )
            // InternalBSharp.g:2532:2: ( ( (lv_name_0_0= rulePrefixBuiltIn ) ) ( (lv_elem_1_0= ruleElement ) ) )
            {
            // InternalBSharp.g:2532:2: ( ( (lv_name_0_0= rulePrefixBuiltIn ) ) ( (lv_elem_1_0= ruleElement ) ) )
            // InternalBSharp.g:2533:3: ( (lv_name_0_0= rulePrefixBuiltIn ) ) ( (lv_elem_1_0= ruleElement ) )
            {
            // InternalBSharp.g:2533:3: ( (lv_name_0_0= rulePrefixBuiltIn ) )
            // InternalBSharp.g:2534:4: (lv_name_0_0= rulePrefixBuiltIn )
            {
            // InternalBSharp.g:2534:4: (lv_name_0_0= rulePrefixBuiltIn )
            // InternalBSharp.g:2535:5: lv_name_0_0= rulePrefixBuiltIn
            {

            					newCompositeNode(grammarAccess.getPrefixAccess().getNamePrefixBuiltInParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_44);
            lv_name_0_0=rulePrefixBuiltIn();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPrefixRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"ac.soton.bsharp.BSharp.PrefixBuiltIn");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBSharp.g:2552:3: ( (lv_elem_1_0= ruleElement ) )
            // InternalBSharp.g:2553:4: (lv_elem_1_0= ruleElement )
            {
            // InternalBSharp.g:2553:4: (lv_elem_1_0= ruleElement )
            // InternalBSharp.g:2554:5: lv_elem_1_0= ruleElement
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
            						"ac.soton.bsharp.BSharp.Element");
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
    // InternalBSharp.g:2575:1: entryRulePrefixBuiltIn returns [String current=null] : iv_rulePrefixBuiltIn= rulePrefixBuiltIn EOF ;
    public final String entryRulePrefixBuiltIn() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrefixBuiltIn = null;


        try {
            // InternalBSharp.g:2575:53: (iv_rulePrefixBuiltIn= rulePrefixBuiltIn EOF )
            // InternalBSharp.g:2576:2: iv_rulePrefixBuiltIn= rulePrefixBuiltIn EOF
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
    // InternalBSharp.g:2582:1: rulePrefixBuiltIn returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '\\u00AC' ;
    public final AntlrDatatypeRuleToken rulePrefixBuiltIn() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalBSharp.g:2588:2: (kw= '\\u00AC' )
            // InternalBSharp.g:2589:2: kw= '\\u00AC'
            {
            kw=(Token)match(input,46,FOLLOW_2); 

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
    // InternalBSharp.g:2597:1: entryRuleInfix returns [EObject current=null] : iv_ruleInfix= ruleInfix EOF ;
    public final EObject entryRuleInfix() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInfix = null;


        try {
            // InternalBSharp.g:2597:46: (iv_ruleInfix= ruleInfix EOF )
            // InternalBSharp.g:2598:2: iv_ruleInfix= ruleInfix EOF
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
    // InternalBSharp.g:2604:1: ruleInfix returns [EObject current=null] : (this_Element_0= ruleElement ( () ( ( (otherlv_2= RULE_ID ) ) | ( (lv_opName_3_0= ruleInbuiltInfix ) ) ) ( (lv_right_4_0= ruleElement ) ) )* ) ;
    public final EObject ruleInfix() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Element_0 = null;

        AntlrDatatypeRuleToken lv_opName_3_0 = null;

        EObject lv_right_4_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:2610:2: ( (this_Element_0= ruleElement ( () ( ( (otherlv_2= RULE_ID ) ) | ( (lv_opName_3_0= ruleInbuiltInfix ) ) ) ( (lv_right_4_0= ruleElement ) ) )* ) )
            // InternalBSharp.g:2611:2: (this_Element_0= ruleElement ( () ( ( (otherlv_2= RULE_ID ) ) | ( (lv_opName_3_0= ruleInbuiltInfix ) ) ) ( (lv_right_4_0= ruleElement ) ) )* )
            {
            // InternalBSharp.g:2611:2: (this_Element_0= ruleElement ( () ( ( (otherlv_2= RULE_ID ) ) | ( (lv_opName_3_0= ruleInbuiltInfix ) ) ) ( (lv_right_4_0= ruleElement ) ) )* )
            // InternalBSharp.g:2612:3: this_Element_0= ruleElement ( () ( ( (otherlv_2= RULE_ID ) ) | ( (lv_opName_3_0= ruleInbuiltInfix ) ) ) ( (lv_right_4_0= ruleElement ) ) )*
            {

            			newCompositeNode(grammarAccess.getInfixAccess().getElementParserRuleCall_0());
            		
            pushFollow(FOLLOW_45);
            this_Element_0=ruleElement();

            state._fsp--;


            			current = this_Element_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalBSharp.g:2620:3: ( () ( ( (otherlv_2= RULE_ID ) ) | ( (lv_opName_3_0= ruleInbuiltInfix ) ) ) ( (lv_right_4_0= ruleElement ) ) )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==RULE_ID) ) {
                    int LA45_2 = input.LA(2);

                    if ( (LA45_2==33) ) {
                        int LA45_4 = input.LA(3);

                        if ( (LA45_4==RULE_ID) ) {
                            int LA45_5 = input.LA(4);

                            if ( (LA45_5==RULE_ID||LA45_5==13||(LA45_5>=33 && LA45_5<=34)||(LA45_5>=47 && LA45_5<=52)) ) {
                                alt45=1;
                            }


                        }
                        else if ( (LA45_4==33||LA45_4==40||(LA45_4>=42 && LA45_4<=44)||LA45_4==46) ) {
                            alt45=1;
                        }


                    }
                    else if ( (LA45_2==RULE_ID||LA45_2==46) ) {
                        alt45=1;
                    }


                }
                else if ( ((LA45_0>=47 && LA45_0<=52)) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalBSharp.g:2621:4: () ( ( (otherlv_2= RULE_ID ) ) | ( (lv_opName_3_0= ruleInbuiltInfix ) ) ) ( (lv_right_4_0= ruleElement ) )
            	    {
            	    // InternalBSharp.g:2621:4: ()
            	    // InternalBSharp.g:2622:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getInfixAccess().getInfixLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalBSharp.g:2628:4: ( ( (otherlv_2= RULE_ID ) ) | ( (lv_opName_3_0= ruleInbuiltInfix ) ) )
            	    int alt44=2;
            	    int LA44_0 = input.LA(1);

            	    if ( (LA44_0==RULE_ID) ) {
            	        alt44=1;
            	    }
            	    else if ( ((LA44_0>=47 && LA44_0<=52)) ) {
            	        alt44=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 44, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt44) {
            	        case 1 :
            	            // InternalBSharp.g:2629:5: ( (otherlv_2= RULE_ID ) )
            	            {
            	            // InternalBSharp.g:2629:5: ( (otherlv_2= RULE_ID ) )
            	            // InternalBSharp.g:2630:6: (otherlv_2= RULE_ID )
            	            {
            	            // InternalBSharp.g:2630:6: (otherlv_2= RULE_ID )
            	            // InternalBSharp.g:2631:7: otherlv_2= RULE_ID
            	            {

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getInfixRule());
            	            							}
            	            						
            	            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_44); 

            	            							newLeafNode(otherlv_2, grammarAccess.getInfixAccess().getFuncNameFunctionNameCrossReference_1_1_0_0());
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalBSharp.g:2643:5: ( (lv_opName_3_0= ruleInbuiltInfix ) )
            	            {
            	            // InternalBSharp.g:2643:5: ( (lv_opName_3_0= ruleInbuiltInfix ) )
            	            // InternalBSharp.g:2644:6: (lv_opName_3_0= ruleInbuiltInfix )
            	            {
            	            // InternalBSharp.g:2644:6: (lv_opName_3_0= ruleInbuiltInfix )
            	            // InternalBSharp.g:2645:7: lv_opName_3_0= ruleInbuiltInfix
            	            {

            	            							newCompositeNode(grammarAccess.getInfixAccess().getOpNameInbuiltInfixParserRuleCall_1_1_1_0());
            	            						
            	            pushFollow(FOLLOW_44);
            	            lv_opName_3_0=ruleInbuiltInfix();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getInfixRule());
            	            							}
            	            							set(
            	            								current,
            	            								"opName",
            	            								lv_opName_3_0,
            	            								"ac.soton.bsharp.BSharp.InbuiltInfix");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // InternalBSharp.g:2663:4: ( (lv_right_4_0= ruleElement ) )
            	    // InternalBSharp.g:2664:5: (lv_right_4_0= ruleElement )
            	    {
            	    // InternalBSharp.g:2664:5: (lv_right_4_0= ruleElement )
            	    // InternalBSharp.g:2665:6: lv_right_4_0= ruleElement
            	    {

            	    						newCompositeNode(grammarAccess.getInfixAccess().getRightElementParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_45);
            	    lv_right_4_0=ruleElement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getInfixRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_4_0,
            	    							"ac.soton.bsharp.BSharp.Element");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop45;
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
    // InternalBSharp.g:2687:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // InternalBSharp.g:2687:48: (iv_ruleElement= ruleElement EOF )
            // InternalBSharp.g:2688:2: iv_ruleElement= ruleElement EOF
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
    // InternalBSharp.g:2694:1: ruleElement returns [EObject current=null] : (this_Bracket_0= ruleBracket | this_Prefix_1= rulePrefix | this_FunctionCall_2= ruleFunctionCall ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        EObject this_Bracket_0 = null;

        EObject this_Prefix_1 = null;

        EObject this_FunctionCall_2 = null;



        	enterRule();

        try {
            // InternalBSharp.g:2700:2: ( (this_Bracket_0= ruleBracket | this_Prefix_1= rulePrefix | this_FunctionCall_2= ruleFunctionCall ) )
            // InternalBSharp.g:2701:2: (this_Bracket_0= ruleBracket | this_Prefix_1= rulePrefix | this_FunctionCall_2= ruleFunctionCall )
            {
            // InternalBSharp.g:2701:2: (this_Bracket_0= ruleBracket | this_Prefix_1= rulePrefix | this_FunctionCall_2= ruleFunctionCall )
            int alt46=3;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt46=1;
                }
                break;
            case 46:
                {
                alt46=2;
                }
                break;
            case RULE_ID:
                {
                alt46=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }

            switch (alt46) {
                case 1 :
                    // InternalBSharp.g:2702:3: this_Bracket_0= ruleBracket
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
                    // InternalBSharp.g:2711:3: this_Prefix_1= rulePrefix
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
                    // InternalBSharp.g:2720:3: this_FunctionCall_2= ruleFunctionCall
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
    // InternalBSharp.g:2732:1: entryRuleBracket returns [EObject current=null] : iv_ruleBracket= ruleBracket EOF ;
    public final EObject entryRuleBracket() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBracket = null;


        try {
            // InternalBSharp.g:2732:48: (iv_ruleBracket= ruleBracket EOF )
            // InternalBSharp.g:2733:2: iv_ruleBracket= ruleBracket EOF
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
    // InternalBSharp.g:2739:1: ruleBracket returns [EObject current=null] : (otherlv_0= '(' ( (lv_child_1_0= ruleRootExpression ) ) otherlv_2= ')' ) ;
    public final EObject ruleBracket() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_child_1_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:2745:2: ( (otherlv_0= '(' ( (lv_child_1_0= ruleRootExpression ) ) otherlv_2= ')' ) )
            // InternalBSharp.g:2746:2: (otherlv_0= '(' ( (lv_child_1_0= ruleRootExpression ) ) otherlv_2= ')' )
            {
            // InternalBSharp.g:2746:2: (otherlv_0= '(' ( (lv_child_1_0= ruleRootExpression ) ) otherlv_2= ')' )
            // InternalBSharp.g:2747:3: otherlv_0= '(' ( (lv_child_1_0= ruleRootExpression ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_25); 

            			newLeafNode(otherlv_0, grammarAccess.getBracketAccess().getLeftParenthesisKeyword_0());
            		
            // InternalBSharp.g:2751:3: ( (lv_child_1_0= ruleRootExpression ) )
            // InternalBSharp.g:2752:4: (lv_child_1_0= ruleRootExpression )
            {
            // InternalBSharp.g:2752:4: (lv_child_1_0= ruleRootExpression )
            // InternalBSharp.g:2753:5: lv_child_1_0= ruleRootExpression
            {

            					newCompositeNode(grammarAccess.getBracketAccess().getChildRootExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_22);
            lv_child_1_0=ruleRootExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBracketRule());
            					}
            					set(
            						current,
            						"child",
            						lv_child_1_0,
            						"ac.soton.bsharp.BSharp.RootExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,34,FOLLOW_2); 

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
    // InternalBSharp.g:2778:1: entryRuleFunctionCall returns [EObject current=null] : iv_ruleFunctionCall= ruleFunctionCall EOF ;
    public final EObject entryRuleFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCall = null;


        try {
            // InternalBSharp.g:2778:53: (iv_ruleFunctionCall= ruleFunctionCall EOF )
            // InternalBSharp.g:2779:2: iv_ruleFunctionCall= ruleFunctionCall EOF
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
    // InternalBSharp.g:2785:1: ruleFunctionCall returns [EObject current=null] : ( ( (lv_typeInst_0_0= ruleTypeInstance ) ) (otherlv_1= '(' ( (lv_arguments_2_0= ruleRootExpression ) )? (otherlv_3= ',' ( (lv_arguments_4_0= ruleRootExpression ) ) )* otherlv_5= ')' )? ) ;
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
            // InternalBSharp.g:2791:2: ( ( ( (lv_typeInst_0_0= ruleTypeInstance ) ) (otherlv_1= '(' ( (lv_arguments_2_0= ruleRootExpression ) )? (otherlv_3= ',' ( (lv_arguments_4_0= ruleRootExpression ) ) )* otherlv_5= ')' )? ) )
            // InternalBSharp.g:2792:2: ( ( (lv_typeInst_0_0= ruleTypeInstance ) ) (otherlv_1= '(' ( (lv_arguments_2_0= ruleRootExpression ) )? (otherlv_3= ',' ( (lv_arguments_4_0= ruleRootExpression ) ) )* otherlv_5= ')' )? )
            {
            // InternalBSharp.g:2792:2: ( ( (lv_typeInst_0_0= ruleTypeInstance ) ) (otherlv_1= '(' ( (lv_arguments_2_0= ruleRootExpression ) )? (otherlv_3= ',' ( (lv_arguments_4_0= ruleRootExpression ) ) )* otherlv_5= ')' )? )
            // InternalBSharp.g:2793:3: ( (lv_typeInst_0_0= ruleTypeInstance ) ) (otherlv_1= '(' ( (lv_arguments_2_0= ruleRootExpression ) )? (otherlv_3= ',' ( (lv_arguments_4_0= ruleRootExpression ) ) )* otherlv_5= ')' )?
            {
            // InternalBSharp.g:2793:3: ( (lv_typeInst_0_0= ruleTypeInstance ) )
            // InternalBSharp.g:2794:4: (lv_typeInst_0_0= ruleTypeInstance )
            {
            // InternalBSharp.g:2794:4: (lv_typeInst_0_0= ruleTypeInstance )
            // InternalBSharp.g:2795:5: lv_typeInst_0_0= ruleTypeInstance
            {

            					newCompositeNode(grammarAccess.getFunctionCallAccess().getTypeInstTypeInstanceParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_29);
            lv_typeInst_0_0=ruleTypeInstance();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFunctionCallRule());
            					}
            					set(
            						current,
            						"typeInst",
            						lv_typeInst_0_0,
            						"ac.soton.bsharp.BSharp.TypeInstance");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBSharp.g:2812:3: (otherlv_1= '(' ( (lv_arguments_2_0= ruleRootExpression ) )? (otherlv_3= ',' ( (lv_arguments_4_0= ruleRootExpression ) ) )* otherlv_5= ')' )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==33) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalBSharp.g:2813:4: otherlv_1= '(' ( (lv_arguments_2_0= ruleRootExpression ) )? (otherlv_3= ',' ( (lv_arguments_4_0= ruleRootExpression ) ) )* otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,33,FOLLOW_46); 

                    				newLeafNode(otherlv_1, grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalBSharp.g:2817:4: ( (lv_arguments_2_0= ruleRootExpression ) )?
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==RULE_ID||LA47_0==33||LA47_0==40||(LA47_0>=42 && LA47_0<=44)||LA47_0==46) ) {
                        alt47=1;
                    }
                    switch (alt47) {
                        case 1 :
                            // InternalBSharp.g:2818:5: (lv_arguments_2_0= ruleRootExpression )
                            {
                            // InternalBSharp.g:2818:5: (lv_arguments_2_0= ruleRootExpression )
                            // InternalBSharp.g:2819:6: lv_arguments_2_0= ruleRootExpression
                            {

                            						newCompositeNode(grammarAccess.getFunctionCallAccess().getArgumentsRootExpressionParserRuleCall_1_1_0());
                            					
                            pushFollow(FOLLOW_38);
                            lv_arguments_2_0=ruleRootExpression();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getFunctionCallRule());
                            						}
                            						add(
                            							current,
                            							"arguments",
                            							lv_arguments_2_0,
                            							"ac.soton.bsharp.BSharp.RootExpression");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    // InternalBSharp.g:2836:4: (otherlv_3= ',' ( (lv_arguments_4_0= ruleRootExpression ) ) )*
                    loop48:
                    do {
                        int alt48=2;
                        int LA48_0 = input.LA(1);

                        if ( (LA48_0==22) ) {
                            alt48=1;
                        }


                        switch (alt48) {
                    	case 1 :
                    	    // InternalBSharp.g:2837:5: otherlv_3= ',' ( (lv_arguments_4_0= ruleRootExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,22,FOLLOW_25); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getFunctionCallAccess().getCommaKeyword_1_2_0());
                    	    				
                    	    // InternalBSharp.g:2841:5: ( (lv_arguments_4_0= ruleRootExpression ) )
                    	    // InternalBSharp.g:2842:6: (lv_arguments_4_0= ruleRootExpression )
                    	    {
                    	    // InternalBSharp.g:2842:6: (lv_arguments_4_0= ruleRootExpression )
                    	    // InternalBSharp.g:2843:7: lv_arguments_4_0= ruleRootExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getFunctionCallAccess().getArgumentsRootExpressionParserRuleCall_1_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_38);
                    	    lv_arguments_4_0=ruleRootExpression();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getFunctionCallRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"arguments",
                    	    								lv_arguments_4_0,
                    	    								"ac.soton.bsharp.BSharp.RootExpression");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop48;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,34,FOLLOW_2); 

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


    // $ANTLR start "entryRuleTypeInstance"
    // InternalBSharp.g:2870:1: entryRuleTypeInstance returns [EObject current=null] : iv_ruleTypeInstance= ruleTypeInstance EOF ;
    public final EObject entryRuleTypeInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeInstance = null;


        try {
            // InternalBSharp.g:2870:53: (iv_ruleTypeInstance= ruleTypeInstance EOF )
            // InternalBSharp.g:2871:2: iv_ruleTypeInstance= ruleTypeInstance EOF
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
    // InternalBSharp.g:2877:1: ruleTypeInstance returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleTypeInstance() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalBSharp.g:2883:2: ( ( ( ruleQualifiedName ) ) )
            // InternalBSharp.g:2884:2: ( ( ruleQualifiedName ) )
            {
            // InternalBSharp.g:2884:2: ( ( ruleQualifiedName ) )
            // InternalBSharp.g:2885:3: ( ruleQualifiedName )
            {
            // InternalBSharp.g:2885:3: ( ruleQualifiedName )
            // InternalBSharp.g:2886:4: ruleQualifiedName
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getTypeInstanceRule());
            				}
            			

            				newCompositeNode(grammarAccess.getTypeInstanceAccess().getInstanceExpressionVariableCrossReference_0());
            			
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;


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
    // $ANTLR end "ruleTypeInstance"


    // $ANTLR start "entryRuleInbuiltInfix"
    // InternalBSharp.g:2903:1: entryRuleInbuiltInfix returns [String current=null] : iv_ruleInbuiltInfix= ruleInbuiltInfix EOF ;
    public final String entryRuleInbuiltInfix() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInbuiltInfix = null;


        try {
            // InternalBSharp.g:2903:52: (iv_ruleInbuiltInfix= ruleInbuiltInfix EOF )
            // InternalBSharp.g:2904:2: iv_ruleInbuiltInfix= ruleInbuiltInfix EOF
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
    // InternalBSharp.g:2910:1: ruleInbuiltInfix returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '\\u21D4' | kw= '\\u21D2' | kw= '=' | kw= '\\u2260' | kw= '\\u2227' | kw= '\\u2228' ) ;
    public final AntlrDatatypeRuleToken ruleInbuiltInfix() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalBSharp.g:2916:2: ( (kw= '\\u21D4' | kw= '\\u21D2' | kw= '=' | kw= '\\u2260' | kw= '\\u2227' | kw= '\\u2228' ) )
            // InternalBSharp.g:2917:2: (kw= '\\u21D4' | kw= '\\u21D2' | kw= '=' | kw= '\\u2260' | kw= '\\u2227' | kw= '\\u2228' )
            {
            // InternalBSharp.g:2917:2: (kw= '\\u21D4' | kw= '\\u21D2' | kw= '=' | kw= '\\u2260' | kw= '\\u2227' | kw= '\\u2228' )
            int alt50=6;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt50=1;
                }
                break;
            case 48:
                {
                alt50=2;
                }
                break;
            case 49:
                {
                alt50=3;
                }
                break;
            case 50:
                {
                alt50=4;
                }
                break;
            case 51:
                {
                alt50=5;
                }
                break;
            case 52:
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
                    // InternalBSharp.g:2918:3: kw= '\\u21D4'
                    {
                    kw=(Token)match(input,47,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getInbuiltInfixAccess().getLeftRightDoubleArrowKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalBSharp.g:2924:3: kw= '\\u21D2'
                    {
                    kw=(Token)match(input,48,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getInbuiltInfixAccess().getRightwardsDoubleArrowKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalBSharp.g:2930:3: kw= '='
                    {
                    kw=(Token)match(input,49,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getInbuiltInfixAccess().getEqualsSignKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalBSharp.g:2936:3: kw= '\\u2260'
                    {
                    kw=(Token)match(input,50,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getInbuiltInfixAccess().getNotEqualToKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalBSharp.g:2942:3: kw= '\\u2227'
                    {
                    kw=(Token)match(input,51,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getInbuiltInfixAccess().getLogicalAndKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalBSharp.g:2948:3: kw= '\\u2228'
                    {
                    kw=(Token)match(input,52,FOLLOW_2); 

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


    // $ANTLR start "entryRuleInstance"
    // InternalBSharp.g:2957:1: entryRuleInstance returns [EObject current=null] : iv_ruleInstance= ruleInstance EOF ;
    public final EObject entryRuleInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstance = null;


        try {
            // InternalBSharp.g:2957:49: (iv_ruleInstance= ruleInstance EOF )
            // InternalBSharp.g:2958:2: iv_ruleInstance= ruleInstance EOF
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
    // InternalBSharp.g:2964:1: ruleInstance returns [EObject current=null] : (otherlv_0= 'Instance' ( ( ruleQualifiedName ) ) ( (lv_context_2_0= ruleTypeDeclContext ) ) otherlv_3= '(' ( (lv_arguments_4_0= ruleRootExpression ) )? (otherlv_5= ',' ( (lv_arguments_6_0= ruleRootExpression ) ) )* otherlv_7= ')' ) ;
    public final EObject ruleInstance() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_context_2_0 = null;

        EObject lv_arguments_4_0 = null;

        EObject lv_arguments_6_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:2970:2: ( (otherlv_0= 'Instance' ( ( ruleQualifiedName ) ) ( (lv_context_2_0= ruleTypeDeclContext ) ) otherlv_3= '(' ( (lv_arguments_4_0= ruleRootExpression ) )? (otherlv_5= ',' ( (lv_arguments_6_0= ruleRootExpression ) ) )* otherlv_7= ')' ) )
            // InternalBSharp.g:2971:2: (otherlv_0= 'Instance' ( ( ruleQualifiedName ) ) ( (lv_context_2_0= ruleTypeDeclContext ) ) otherlv_3= '(' ( (lv_arguments_4_0= ruleRootExpression ) )? (otherlv_5= ',' ( (lv_arguments_6_0= ruleRootExpression ) ) )* otherlv_7= ')' )
            {
            // InternalBSharp.g:2971:2: (otherlv_0= 'Instance' ( ( ruleQualifiedName ) ) ( (lv_context_2_0= ruleTypeDeclContext ) ) otherlv_3= '(' ( (lv_arguments_4_0= ruleRootExpression ) )? (otherlv_5= ',' ( (lv_arguments_6_0= ruleRootExpression ) ) )* otherlv_7= ')' )
            // InternalBSharp.g:2972:3: otherlv_0= 'Instance' ( ( ruleQualifiedName ) ) ( (lv_context_2_0= ruleTypeDeclContext ) ) otherlv_3= '(' ( (lv_arguments_4_0= ruleRootExpression ) )? (otherlv_5= ',' ( (lv_arguments_6_0= ruleRootExpression ) ) )* otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,53,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getInstanceAccess().getInstanceKeyword_0());
            		
            // InternalBSharp.g:2976:3: ( ( ruleQualifiedName ) )
            // InternalBSharp.g:2977:4: ( ruleQualifiedName )
            {
            // InternalBSharp.g:2977:4: ( ruleQualifiedName )
            // InternalBSharp.g:2978:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInstanceRule());
            					}
            				

            					newCompositeNode(grammarAccess.getInstanceAccess().getClassNameClassDeclCrossReference_1_0());
            				
            pushFollow(FOLLOW_47);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBSharp.g:2992:3: ( (lv_context_2_0= ruleTypeDeclContext ) )
            // InternalBSharp.g:2993:4: (lv_context_2_0= ruleTypeDeclContext )
            {
            // InternalBSharp.g:2993:4: (lv_context_2_0= ruleTypeDeclContext )
            // InternalBSharp.g:2994:5: lv_context_2_0= ruleTypeDeclContext
            {

            					newCompositeNode(grammarAccess.getInstanceAccess().getContextTypeDeclContextParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_30);
            lv_context_2_0=ruleTypeDeclContext();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInstanceRule());
            					}
            					set(
            						current,
            						"context",
            						lv_context_2_0,
            						"ac.soton.bsharp.BSharp.TypeDeclContext");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,33,FOLLOW_46); 

            			newLeafNode(otherlv_3, grammarAccess.getInstanceAccess().getLeftParenthesisKeyword_3());
            		
            // InternalBSharp.g:3015:3: ( (lv_arguments_4_0= ruleRootExpression ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_ID||LA51_0==33||LA51_0==40||(LA51_0>=42 && LA51_0<=44)||LA51_0==46) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalBSharp.g:3016:4: (lv_arguments_4_0= ruleRootExpression )
                    {
                    // InternalBSharp.g:3016:4: (lv_arguments_4_0= ruleRootExpression )
                    // InternalBSharp.g:3017:5: lv_arguments_4_0= ruleRootExpression
                    {

                    					newCompositeNode(grammarAccess.getInstanceAccess().getArgumentsRootExpressionParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_38);
                    lv_arguments_4_0=ruleRootExpression();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getInstanceRule());
                    					}
                    					add(
                    						current,
                    						"arguments",
                    						lv_arguments_4_0,
                    						"ac.soton.bsharp.BSharp.RootExpression");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalBSharp.g:3034:3: (otherlv_5= ',' ( (lv_arguments_6_0= ruleRootExpression ) ) )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==22) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // InternalBSharp.g:3035:4: otherlv_5= ',' ( (lv_arguments_6_0= ruleRootExpression ) )
            	    {
            	    otherlv_5=(Token)match(input,22,FOLLOW_25); 

            	    				newLeafNode(otherlv_5, grammarAccess.getInstanceAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalBSharp.g:3039:4: ( (lv_arguments_6_0= ruleRootExpression ) )
            	    // InternalBSharp.g:3040:5: (lv_arguments_6_0= ruleRootExpression )
            	    {
            	    // InternalBSharp.g:3040:5: (lv_arguments_6_0= ruleRootExpression )
            	    // InternalBSharp.g:3041:6: lv_arguments_6_0= ruleRootExpression
            	    {

            	    						newCompositeNode(grammarAccess.getInstanceAccess().getArgumentsRootExpressionParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_38);
            	    lv_arguments_6_0=ruleRootExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getInstanceRule());
            	    						}
            	    						add(
            	    							current,
            	    							"arguments",
            	    							lv_arguments_6_0,
            	    							"ac.soton.bsharp.BSharp.RootExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);

            otherlv_7=(Token)match(input,34,FOLLOW_2); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0020005000018002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000870L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000A00160800L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000A00060800L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000A00060000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000800060000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000020000080020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000001FF800002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00005D0200000020L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000002000100000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000002000040000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000200100000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000400000020L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x00005D8200000030L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x00005D0200000030L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000002000080000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000200000800L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000400400000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000080870L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000400800L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000400200000020L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x001F800000000022L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x00005D0600400020L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000100000L});

}