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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_WS", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ANY_OTHER", "'package'", "':'", "'.'", "'From'", "'Import'", "'*'", "'Class'", "';'", "'<'", "'>'", "','", "'\\u00D7'", "'\\u2192'", "'\\uE102'", "'\\uE100'", "'\\u2194'", "'\\u2916'", "'\\u21F8'", "'\\u21A3'", "'\\u2900'", "'\\u21A0'", "'('", "')'", "'where'", "'Datatype'", "'|'", "'Extend'", "'{'", "'}'", "'INFIX'", "'match'", "'Theorems'", "'\\u03BB'", "'\\u2200'", "'\\u2203'", "'\\u00B7'", "'\\u00AC'", "'\\u21D4'", "'\\u21D2'", "'='", "'\\u2260'", "'\\u2227'", "'\\u2228'", "'Instance'"
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
    public static final int T__54=54;
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
        	return "TopLevel";
       	}

       	@Override
       	protected BSharpGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleTopLevel"
    // InternalBSharp.g:64:1: entryRuleTopLevel returns [EObject current=null] : iv_ruleTopLevel= ruleTopLevel EOF ;
    public final EObject entryRuleTopLevel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTopLevel = null;


        try {
            // InternalBSharp.g:64:49: (iv_ruleTopLevel= ruleTopLevel EOF )
            // InternalBSharp.g:65:2: iv_ruleTopLevel= ruleTopLevel EOF
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
    // InternalBSharp.g:71:1: ruleTopLevel returns [EObject current=null] : (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_topLevelFile_2_0= ruleTopLevelFile ) ) ) ;
    public final EObject ruleTopLevel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_topLevelFile_2_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:77:2: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_topLevelFile_2_0= ruleTopLevelFile ) ) ) )
            // InternalBSharp.g:78:2: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_topLevelFile_2_0= ruleTopLevelFile ) ) )
            {
            // InternalBSharp.g:78:2: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_topLevelFile_2_0= ruleTopLevelFile ) ) )
            // InternalBSharp.g:79:3: otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_topLevelFile_2_0= ruleTopLevelFile ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTopLevelAccess().getPackageKeyword_0());
            		
            // InternalBSharp.g:83:3: ( (lv_name_1_0= ruleQualifiedName ) )
            // InternalBSharp.g:84:4: (lv_name_1_0= ruleQualifiedName )
            {
            // InternalBSharp.g:84:4: (lv_name_1_0= ruleQualifiedName )
            // InternalBSharp.g:85:5: lv_name_1_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getTopLevelAccess().getNameQualifiedNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTopLevelRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"ac.soton.bsharp.BSharp.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBSharp.g:102:3: ( (lv_topLevelFile_2_0= ruleTopLevelFile ) )
            // InternalBSharp.g:103:4: (lv_topLevelFile_2_0= ruleTopLevelFile )
            {
            // InternalBSharp.g:103:4: (lv_topLevelFile_2_0= ruleTopLevelFile )
            // InternalBSharp.g:104:5: lv_topLevelFile_2_0= ruleTopLevelFile
            {

            					newCompositeNode(grammarAccess.getTopLevelAccess().getTopLevelFileTopLevelFileParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_topLevelFile_2_0=ruleTopLevelFile();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTopLevelRule());
            					}
            					set(
            						current,
            						"topLevelFile",
            						lv_topLevelFile_2_0,
            						"ac.soton.bsharp.BSharp.TopLevelFile");
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
    // $ANTLR end "ruleTopLevel"


    // $ANTLR start "entryRuleTHM_NAME"
    // InternalBSharp.g:125:1: entryRuleTHM_NAME returns [String current=null] : iv_ruleTHM_NAME= ruleTHM_NAME EOF ;
    public final String entryRuleTHM_NAME() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTHM_NAME = null;


        try {
            // InternalBSharp.g:125:48: (iv_ruleTHM_NAME= ruleTHM_NAME EOF )
            // InternalBSharp.g:126:2: iv_ruleTHM_NAME= ruleTHM_NAME EOF
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
    // InternalBSharp.g:132:1: ruleTHM_NAME returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_INT_0= RULE_INT | this_ID_1= RULE_ID | this_WS_2= RULE_WS )* kw= ':' ) ;
    public final AntlrDatatypeRuleToken ruleTHM_NAME() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_ID_1=null;
        Token this_WS_2=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalBSharp.g:138:2: ( ( (this_INT_0= RULE_INT | this_ID_1= RULE_ID | this_WS_2= RULE_WS )* kw= ':' ) )
            // InternalBSharp.g:139:2: ( (this_INT_0= RULE_INT | this_ID_1= RULE_ID | this_WS_2= RULE_WS )* kw= ':' )
            {
            // InternalBSharp.g:139:2: ( (this_INT_0= RULE_INT | this_ID_1= RULE_ID | this_WS_2= RULE_WS )* kw= ':' )
            // InternalBSharp.g:140:3: (this_INT_0= RULE_INT | this_ID_1= RULE_ID | this_WS_2= RULE_WS )* kw= ':'
            {
            // InternalBSharp.g:140:3: (this_INT_0= RULE_INT | this_ID_1= RULE_ID | this_WS_2= RULE_WS )*
            loop1:
            do {
                int alt1=4;
                switch ( input.LA(1) ) {
                case RULE_INT:
                    {
                    alt1=1;
                    }
                    break;
                case RULE_ID:
                    {
                    alt1=2;
                    }
                    break;
                case RULE_WS:
                    {
                    alt1=3;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // InternalBSharp.g:141:4: this_INT_0= RULE_INT
            	    {
            	    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_5); 

            	    				current.merge(this_INT_0);
            	    			

            	    				newLeafNode(this_INT_0, grammarAccess.getTHM_NAMEAccess().getINTTerminalRuleCall_0_0());
            	    			

            	    }
            	    break;
            	case 2 :
            	    // InternalBSharp.g:149:4: this_ID_1= RULE_ID
            	    {
            	    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_5); 

            	    				current.merge(this_ID_1);
            	    			

            	    				newLeafNode(this_ID_1, grammarAccess.getTHM_NAMEAccess().getIDTerminalRuleCall_0_1());
            	    			

            	    }
            	    break;
            	case 3 :
            	    // InternalBSharp.g:157:4: this_WS_2= RULE_WS
            	    {
            	    this_WS_2=(Token)match(input,RULE_WS,FOLLOW_5); 

            	    				current.merge(this_WS_2);
            	    			

            	    				newLeafNode(this_WS_2, grammarAccess.getTHM_NAMEAccess().getWSTerminalRuleCall_0_2());
            	    			

            	    }
            	    break;

            	default :
            	    break loop1;
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


    // $ANTLR start "entryRuleTopLevelFile"
    // InternalBSharp.g:174:1: entryRuleTopLevelFile returns [EObject current=null] : iv_ruleTopLevelFile= ruleTopLevelFile EOF ;
    public final EObject entryRuleTopLevelFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTopLevelFile = null;


        try {
            // InternalBSharp.g:174:53: (iv_ruleTopLevelFile= ruleTopLevelFile EOF )
            // InternalBSharp.g:175:2: iv_ruleTopLevelFile= ruleTopLevelFile EOF
            {
             newCompositeNode(grammarAccess.getTopLevelFileRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTopLevelFile=ruleTopLevelFile();

            state._fsp--;

             current =iv_ruleTopLevelFile; 
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
    // $ANTLR end "entryRuleTopLevelFile"


    // $ANTLR start "ruleTopLevelFile"
    // InternalBSharp.g:181:1: ruleTopLevelFile returns [EObject current=null] : ( () ( (lv_noImportElements_1_0= ruleBodyElements ) )? ( (lv_topLevelImports_2_0= ruleTopLevelImport ) )* ) ;
    public final EObject ruleTopLevelFile() throws RecognitionException {
        EObject current = null;

        EObject lv_noImportElements_1_0 = null;

        EObject lv_topLevelImports_2_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:187:2: ( ( () ( (lv_noImportElements_1_0= ruleBodyElements ) )? ( (lv_topLevelImports_2_0= ruleTopLevelImport ) )* ) )
            // InternalBSharp.g:188:2: ( () ( (lv_noImportElements_1_0= ruleBodyElements ) )? ( (lv_topLevelImports_2_0= ruleTopLevelImport ) )* )
            {
            // InternalBSharp.g:188:2: ( () ( (lv_noImportElements_1_0= ruleBodyElements ) )? ( (lv_topLevelImports_2_0= ruleTopLevelImport ) )* )
            // InternalBSharp.g:189:3: () ( (lv_noImportElements_1_0= ruleBodyElements ) )? ( (lv_topLevelImports_2_0= ruleTopLevelImport ) )*
            {
            // InternalBSharp.g:189:3: ()
            // InternalBSharp.g:190:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTopLevelFileAccess().getTopLevelFileAction_0(),
            					current);
            			

            }

            // InternalBSharp.g:196:3: ( (lv_noImportElements_1_0= ruleBodyElements ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==17||LA2_0==35||LA2_0==37||LA2_0==54) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalBSharp.g:197:4: (lv_noImportElements_1_0= ruleBodyElements )
                    {
                    // InternalBSharp.g:197:4: (lv_noImportElements_1_0= ruleBodyElements )
                    // InternalBSharp.g:198:5: lv_noImportElements_1_0= ruleBodyElements
                    {

                    					newCompositeNode(grammarAccess.getTopLevelFileAccess().getNoImportElementsBodyElementsParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_6);
                    lv_noImportElements_1_0=ruleBodyElements();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTopLevelFileRule());
                    					}
                    					set(
                    						current,
                    						"noImportElements",
                    						lv_noImportElements_1_0,
                    						"ac.soton.bsharp.BSharp.BodyElements");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalBSharp.g:215:3: ( (lv_topLevelImports_2_0= ruleTopLevelImport ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=14 && LA3_0<=15)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalBSharp.g:216:4: (lv_topLevelImports_2_0= ruleTopLevelImport )
            	    {
            	    // InternalBSharp.g:216:4: (lv_topLevelImports_2_0= ruleTopLevelImport )
            	    // InternalBSharp.g:217:5: lv_topLevelImports_2_0= ruleTopLevelImport
            	    {

            	    					newCompositeNode(grammarAccess.getTopLevelFileAccess().getTopLevelImportsTopLevelImportParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_topLevelImports_2_0=ruleTopLevelImport();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTopLevelFileRule());
            	    					}
            	    					add(
            	    						current,
            	    						"topLevelImports",
            	    						lv_topLevelImports_2_0,
            	    						"ac.soton.bsharp.BSharp.TopLevelImport");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
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
    // $ANTLR end "ruleTopLevelFile"


    // $ANTLR start "entryRuleClassDecl"
    // InternalBSharp.g:238:1: entryRuleClassDecl returns [EObject current=null] : iv_ruleClassDecl= ruleClassDecl EOF ;
    public final EObject entryRuleClassDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassDecl = null;


        try {
            // InternalBSharp.g:238:50: (iv_ruleClassDecl= ruleClassDecl EOF )
            // InternalBSharp.g:239:2: iv_ruleClassDecl= ruleClassDecl EOF
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
    // InternalBSharp.g:245:1: ruleClassDecl returns [EObject current=null] : (this_Class_0= ruleClass | this_Datatype_1= ruleDatatype ) ;
    public final EObject ruleClassDecl() throws RecognitionException {
        EObject current = null;

        EObject this_Class_0 = null;

        EObject this_Datatype_1 = null;



        	enterRule();

        try {
            // InternalBSharp.g:251:2: ( (this_Class_0= ruleClass | this_Datatype_1= ruleDatatype ) )
            // InternalBSharp.g:252:2: (this_Class_0= ruleClass | this_Datatype_1= ruleDatatype )
            {
            // InternalBSharp.g:252:2: (this_Class_0= ruleClass | this_Datatype_1= ruleDatatype )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
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
                    // InternalBSharp.g:253:3: this_Class_0= ruleClass
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
                    // InternalBSharp.g:262:3: this_Datatype_1= ruleDatatype
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


    // $ANTLR start "entryRuleType"
    // InternalBSharp.g:274:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalBSharp.g:274:45: (iv_ruleType= ruleType EOF )
            // InternalBSharp.g:275:2: iv_ruleType= ruleType EOF
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
    // InternalBSharp.g:281:1: ruleType returns [EObject current=null] : this_ClassDecl_0= ruleClassDecl ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_ClassDecl_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:287:2: (this_ClassDecl_0= ruleClassDecl )
            // InternalBSharp.g:288:2: this_ClassDecl_0= ruleClassDecl
            {

            		newCompositeNode(grammarAccess.getTypeAccess().getClassDeclParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_ClassDecl_0=ruleClassDecl();

            state._fsp--;


            		current = this_ClassDecl_0;
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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalBSharp.g:299:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalBSharp.g:299:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalBSharp.g:300:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalBSharp.g:306:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalBSharp.g:312:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalBSharp.g:313:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalBSharp.g:313:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalBSharp.g:314:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalBSharp.g:321:3: (kw= '.' this_ID_2= RULE_ID )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==13) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalBSharp.g:322:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,13,FOLLOW_3); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_7); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleTopLevelImport"
    // InternalBSharp.g:339:1: entryRuleTopLevelImport returns [EObject current=null] : iv_ruleTopLevelImport= ruleTopLevelImport EOF ;
    public final EObject entryRuleTopLevelImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTopLevelImport = null;


        try {
            // InternalBSharp.g:339:55: (iv_ruleTopLevelImport= ruleTopLevelImport EOF )
            // InternalBSharp.g:340:2: iv_ruleTopLevelImport= ruleTopLevelImport EOF
            {
             newCompositeNode(grammarAccess.getTopLevelImportRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTopLevelImport=ruleTopLevelImport();

            state._fsp--;

             current =iv_ruleTopLevelImport; 
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
    // $ANTLR end "entryRuleTopLevelImport"


    // $ANTLR start "ruleTopLevelImport"
    // InternalBSharp.g:346:1: ruleTopLevelImport returns [EObject current=null] : ( ( ( (lv_globalImports_0_0= ruleGlobalImport ) ) | ( (lv_localImports_1_0= ruleLocalImport ) ) )+ ( (lv_bodyElements_2_0= ruleBodyElements ) ) ) ;
    public final EObject ruleTopLevelImport() throws RecognitionException {
        EObject current = null;

        EObject lv_globalImports_0_0 = null;

        EObject lv_localImports_1_0 = null;

        EObject lv_bodyElements_2_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:352:2: ( ( ( ( (lv_globalImports_0_0= ruleGlobalImport ) ) | ( (lv_localImports_1_0= ruleLocalImport ) ) )+ ( (lv_bodyElements_2_0= ruleBodyElements ) ) ) )
            // InternalBSharp.g:353:2: ( ( ( (lv_globalImports_0_0= ruleGlobalImport ) ) | ( (lv_localImports_1_0= ruleLocalImport ) ) )+ ( (lv_bodyElements_2_0= ruleBodyElements ) ) )
            {
            // InternalBSharp.g:353:2: ( ( ( (lv_globalImports_0_0= ruleGlobalImport ) ) | ( (lv_localImports_1_0= ruleLocalImport ) ) )+ ( (lv_bodyElements_2_0= ruleBodyElements ) ) )
            // InternalBSharp.g:354:3: ( ( (lv_globalImports_0_0= ruleGlobalImport ) ) | ( (lv_localImports_1_0= ruleLocalImport ) ) )+ ( (lv_bodyElements_2_0= ruleBodyElements ) )
            {
            // InternalBSharp.g:354:3: ( ( (lv_globalImports_0_0= ruleGlobalImport ) ) | ( (lv_localImports_1_0= ruleLocalImport ) ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=3;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==14) ) {
                    alt6=1;
                }
                else if ( (LA6_0==15) ) {
                    alt6=2;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalBSharp.g:355:4: ( (lv_globalImports_0_0= ruleGlobalImport ) )
            	    {
            	    // InternalBSharp.g:355:4: ( (lv_globalImports_0_0= ruleGlobalImport ) )
            	    // InternalBSharp.g:356:5: (lv_globalImports_0_0= ruleGlobalImport )
            	    {
            	    // InternalBSharp.g:356:5: (lv_globalImports_0_0= ruleGlobalImport )
            	    // InternalBSharp.g:357:6: lv_globalImports_0_0= ruleGlobalImport
            	    {

            	    						newCompositeNode(grammarAccess.getTopLevelImportAccess().getGlobalImportsGlobalImportParserRuleCall_0_0_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_globalImports_0_0=ruleGlobalImport();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTopLevelImportRule());
            	    						}
            	    						add(
            	    							current,
            	    							"globalImports",
            	    							lv_globalImports_0_0,
            	    							"ac.soton.bsharp.BSharp.GlobalImport");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalBSharp.g:375:4: ( (lv_localImports_1_0= ruleLocalImport ) )
            	    {
            	    // InternalBSharp.g:375:4: ( (lv_localImports_1_0= ruleLocalImport ) )
            	    // InternalBSharp.g:376:5: (lv_localImports_1_0= ruleLocalImport )
            	    {
            	    // InternalBSharp.g:376:5: (lv_localImports_1_0= ruleLocalImport )
            	    // InternalBSharp.g:377:6: lv_localImports_1_0= ruleLocalImport
            	    {

            	    						newCompositeNode(grammarAccess.getTopLevelImportAccess().getLocalImportsLocalImportParserRuleCall_0_1_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_localImports_1_0=ruleLocalImport();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTopLevelImportRule());
            	    						}
            	    						add(
            	    							current,
            	    							"localImports",
            	    							lv_localImports_1_0,
            	    							"ac.soton.bsharp.BSharp.LocalImport");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);

            // InternalBSharp.g:395:3: ( (lv_bodyElements_2_0= ruleBodyElements ) )
            // InternalBSharp.g:396:4: (lv_bodyElements_2_0= ruleBodyElements )
            {
            // InternalBSharp.g:396:4: (lv_bodyElements_2_0= ruleBodyElements )
            // InternalBSharp.g:397:5: lv_bodyElements_2_0= ruleBodyElements
            {

            					newCompositeNode(grammarAccess.getTopLevelImportAccess().getBodyElementsBodyElementsParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_bodyElements_2_0=ruleBodyElements();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTopLevelImportRule());
            					}
            					set(
            						current,
            						"bodyElements",
            						lv_bodyElements_2_0,
            						"ac.soton.bsharp.BSharp.BodyElements");
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
    // $ANTLR end "ruleTopLevelImport"


    // $ANTLR start "entryRuleBodyElements"
    // InternalBSharp.g:418:1: entryRuleBodyElements returns [EObject current=null] : iv_ruleBodyElements= ruleBodyElements EOF ;
    public final EObject entryRuleBodyElements() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBodyElements = null;


        try {
            // InternalBSharp.g:418:53: (iv_ruleBodyElements= ruleBodyElements EOF )
            // InternalBSharp.g:419:2: iv_ruleBodyElements= ruleBodyElements EOF
            {
             newCompositeNode(grammarAccess.getBodyElementsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBodyElements=ruleBodyElements();

            state._fsp--;

             current =iv_ruleBodyElements; 
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
    // $ANTLR end "entryRuleBodyElements"


    // $ANTLR start "ruleBodyElements"
    // InternalBSharp.g:425:1: ruleBodyElements returns [EObject current=null] : ( ( (lv_classes_0_0= ruleClassDecl ) ) | ( (lv_extends_1_0= ruleExtend ) ) | ( (lv_instances_2_0= ruleInstance ) ) )+ ;
    public final EObject ruleBodyElements() throws RecognitionException {
        EObject current = null;

        EObject lv_classes_0_0 = null;

        EObject lv_extends_1_0 = null;

        EObject lv_instances_2_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:431:2: ( ( ( (lv_classes_0_0= ruleClassDecl ) ) | ( (lv_extends_1_0= ruleExtend ) ) | ( (lv_instances_2_0= ruleInstance ) ) )+ )
            // InternalBSharp.g:432:2: ( ( (lv_classes_0_0= ruleClassDecl ) ) | ( (lv_extends_1_0= ruleExtend ) ) | ( (lv_instances_2_0= ruleInstance ) ) )+
            {
            // InternalBSharp.g:432:2: ( ( (lv_classes_0_0= ruleClassDecl ) ) | ( (lv_extends_1_0= ruleExtend ) ) | ( (lv_instances_2_0= ruleInstance ) ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=4;
                switch ( input.LA(1) ) {
                case 17:
                case 35:
                    {
                    alt7=1;
                    }
                    break;
                case 37:
                    {
                    alt7=2;
                    }
                    break;
                case 54:
                    {
                    alt7=3;
                    }
                    break;

                }

                switch (alt7) {
            	case 1 :
            	    // InternalBSharp.g:433:3: ( (lv_classes_0_0= ruleClassDecl ) )
            	    {
            	    // InternalBSharp.g:433:3: ( (lv_classes_0_0= ruleClassDecl ) )
            	    // InternalBSharp.g:434:4: (lv_classes_0_0= ruleClassDecl )
            	    {
            	    // InternalBSharp.g:434:4: (lv_classes_0_0= ruleClassDecl )
            	    // InternalBSharp.g:435:5: lv_classes_0_0= ruleClassDecl
            	    {

            	    					newCompositeNode(grammarAccess.getBodyElementsAccess().getClassesClassDeclParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_classes_0_0=ruleClassDecl();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getBodyElementsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"classes",
            	    						lv_classes_0_0,
            	    						"ac.soton.bsharp.BSharp.ClassDecl");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalBSharp.g:453:3: ( (lv_extends_1_0= ruleExtend ) )
            	    {
            	    // InternalBSharp.g:453:3: ( (lv_extends_1_0= ruleExtend ) )
            	    // InternalBSharp.g:454:4: (lv_extends_1_0= ruleExtend )
            	    {
            	    // InternalBSharp.g:454:4: (lv_extends_1_0= ruleExtend )
            	    // InternalBSharp.g:455:5: lv_extends_1_0= ruleExtend
            	    {

            	    					newCompositeNode(grammarAccess.getBodyElementsAccess().getExtendsExtendParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_extends_1_0=ruleExtend();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getBodyElementsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"extends",
            	    						lv_extends_1_0,
            	    						"ac.soton.bsharp.BSharp.Extend");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalBSharp.g:473:3: ( (lv_instances_2_0= ruleInstance ) )
            	    {
            	    // InternalBSharp.g:473:3: ( (lv_instances_2_0= ruleInstance ) )
            	    // InternalBSharp.g:474:4: (lv_instances_2_0= ruleInstance )
            	    {
            	    // InternalBSharp.g:474:4: (lv_instances_2_0= ruleInstance )
            	    // InternalBSharp.g:475:5: lv_instances_2_0= ruleInstance
            	    {

            	    					newCompositeNode(grammarAccess.getBodyElementsAccess().getInstancesInstanceParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_instances_2_0=ruleInstance();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getBodyElementsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"instances",
            	    						lv_instances_2_0,
            	    						"ac.soton.bsharp.BSharp.Instance");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


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
    // $ANTLR end "ruleBodyElements"


    // $ANTLR start "entryRuleGlobalImport"
    // InternalBSharp.g:496:1: entryRuleGlobalImport returns [EObject current=null] : iv_ruleGlobalImport= ruleGlobalImport EOF ;
    public final EObject entryRuleGlobalImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGlobalImport = null;


        try {
            // InternalBSharp.g:496:53: (iv_ruleGlobalImport= ruleGlobalImport EOF )
            // InternalBSharp.g:497:2: iv_ruleGlobalImport= ruleGlobalImport EOF
            {
             newCompositeNode(grammarAccess.getGlobalImportRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGlobalImport=ruleGlobalImport();

            state._fsp--;

             current =iv_ruleGlobalImport; 
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
    // $ANTLR end "entryRuleGlobalImport"


    // $ANTLR start "ruleGlobalImport"
    // InternalBSharp.g:503:1: ruleGlobalImport returns [EObject current=null] : (otherlv_0= 'From' ( (lv_project_1_0= ruleQualifiedName ) ) otherlv_2= 'Import' ( (lv_fileImports_3_0= ruleFileImport ) )+ ) ;
    public final EObject ruleGlobalImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_project_1_0 = null;

        EObject lv_fileImports_3_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:509:2: ( (otherlv_0= 'From' ( (lv_project_1_0= ruleQualifiedName ) ) otherlv_2= 'Import' ( (lv_fileImports_3_0= ruleFileImport ) )+ ) )
            // InternalBSharp.g:510:2: (otherlv_0= 'From' ( (lv_project_1_0= ruleQualifiedName ) ) otherlv_2= 'Import' ( (lv_fileImports_3_0= ruleFileImport ) )+ )
            {
            // InternalBSharp.g:510:2: (otherlv_0= 'From' ( (lv_project_1_0= ruleQualifiedName ) ) otherlv_2= 'Import' ( (lv_fileImports_3_0= ruleFileImport ) )+ )
            // InternalBSharp.g:511:3: otherlv_0= 'From' ( (lv_project_1_0= ruleQualifiedName ) ) otherlv_2= 'Import' ( (lv_fileImports_3_0= ruleFileImport ) )+
            {
            otherlv_0=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getGlobalImportAccess().getFromKeyword_0());
            		
            // InternalBSharp.g:515:3: ( (lv_project_1_0= ruleQualifiedName ) )
            // InternalBSharp.g:516:4: (lv_project_1_0= ruleQualifiedName )
            {
            // InternalBSharp.g:516:4: (lv_project_1_0= ruleQualifiedName )
            // InternalBSharp.g:517:5: lv_project_1_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getGlobalImportAccess().getProjectQualifiedNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_9);
            lv_project_1_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGlobalImportRule());
            					}
            					set(
            						current,
            						"project",
            						lv_project_1_0,
            						"ac.soton.bsharp.BSharp.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getGlobalImportAccess().getImportKeyword_2());
            		
            // InternalBSharp.g:538:3: ( (lv_fileImports_3_0= ruleFileImport ) )+
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
            	    // InternalBSharp.g:539:4: (lv_fileImports_3_0= ruleFileImport )
            	    {
            	    // InternalBSharp.g:539:4: (lv_fileImports_3_0= ruleFileImport )
            	    // InternalBSharp.g:540:5: lv_fileImports_3_0= ruleFileImport
            	    {

            	    					newCompositeNode(grammarAccess.getGlobalImportAccess().getFileImportsFileImportParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_fileImports_3_0=ruleFileImport();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getGlobalImportRule());
            	    					}
            	    					add(
            	    						current,
            	    						"fileImports",
            	    						lv_fileImports_3_0,
            	    						"ac.soton.bsharp.BSharp.FileImport");
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
    // $ANTLR end "ruleGlobalImport"


    // $ANTLR start "entryRuleFileImport"
    // InternalBSharp.g:561:1: entryRuleFileImport returns [EObject current=null] : iv_ruleFileImport= ruleFileImport EOF ;
    public final EObject entryRuleFileImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFileImport = null;


        try {
            // InternalBSharp.g:561:51: (iv_ruleFileImport= ruleFileImport EOF )
            // InternalBSharp.g:562:2: iv_ruleFileImport= ruleFileImport EOF
            {
             newCompositeNode(grammarAccess.getFileImportRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFileImport=ruleFileImport();

            state._fsp--;

             current =iv_ruleFileImport; 
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
    // $ANTLR end "entryRuleFileImport"


    // $ANTLR start "ruleFileImport"
    // InternalBSharp.g:568:1: ruleFileImport returns [EObject current=null] : ( ( (lv_fileName_0_0= RULE_ID ) ) (otherlv_1= '.' (otherlv_2= '*' | ( (lv_type_3_0= RULE_ID ) ) ) )? ) ;
    public final EObject ruleFileImport() throws RecognitionException {
        EObject current = null;

        Token lv_fileName_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_type_3_0=null;


        	enterRule();

        try {
            // InternalBSharp.g:574:2: ( ( ( (lv_fileName_0_0= RULE_ID ) ) (otherlv_1= '.' (otherlv_2= '*' | ( (lv_type_3_0= RULE_ID ) ) ) )? ) )
            // InternalBSharp.g:575:2: ( ( (lv_fileName_0_0= RULE_ID ) ) (otherlv_1= '.' (otherlv_2= '*' | ( (lv_type_3_0= RULE_ID ) ) ) )? )
            {
            // InternalBSharp.g:575:2: ( ( (lv_fileName_0_0= RULE_ID ) ) (otherlv_1= '.' (otherlv_2= '*' | ( (lv_type_3_0= RULE_ID ) ) ) )? )
            // InternalBSharp.g:576:3: ( (lv_fileName_0_0= RULE_ID ) ) (otherlv_1= '.' (otherlv_2= '*' | ( (lv_type_3_0= RULE_ID ) ) ) )?
            {
            // InternalBSharp.g:576:3: ( (lv_fileName_0_0= RULE_ID ) )
            // InternalBSharp.g:577:4: (lv_fileName_0_0= RULE_ID )
            {
            // InternalBSharp.g:577:4: (lv_fileName_0_0= RULE_ID )
            // InternalBSharp.g:578:5: lv_fileName_0_0= RULE_ID
            {
            lv_fileName_0_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_fileName_0_0, grammarAccess.getFileImportAccess().getFileNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFileImportRule());
            					}
            					setWithLastConsumed(
            						current,
            						"fileName",
            						lv_fileName_0_0,
            						"ac.soton.bsharp.BSharp.ID");
            				

            }


            }

            // InternalBSharp.g:594:3: (otherlv_1= '.' (otherlv_2= '*' | ( (lv_type_3_0= RULE_ID ) ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==13) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalBSharp.g:595:4: otherlv_1= '.' (otherlv_2= '*' | ( (lv_type_3_0= RULE_ID ) ) )
                    {
                    otherlv_1=(Token)match(input,13,FOLLOW_11); 

                    				newLeafNode(otherlv_1, grammarAccess.getFileImportAccess().getFullStopKeyword_1_0());
                    			
                    // InternalBSharp.g:599:4: (otherlv_2= '*' | ( (lv_type_3_0= RULE_ID ) ) )
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==16) ) {
                        alt9=1;
                    }
                    else if ( (LA9_0==RULE_ID) ) {
                        alt9=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 0, input);

                        throw nvae;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalBSharp.g:600:5: otherlv_2= '*'
                            {
                            otherlv_2=(Token)match(input,16,FOLLOW_2); 

                            					newLeafNode(otherlv_2, grammarAccess.getFileImportAccess().getAsteriskKeyword_1_1_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalBSharp.g:605:5: ( (lv_type_3_0= RULE_ID ) )
                            {
                            // InternalBSharp.g:605:5: ( (lv_type_3_0= RULE_ID ) )
                            // InternalBSharp.g:606:6: (lv_type_3_0= RULE_ID )
                            {
                            // InternalBSharp.g:606:6: (lv_type_3_0= RULE_ID )
                            // InternalBSharp.g:607:7: lv_type_3_0= RULE_ID
                            {
                            lv_type_3_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                            							newLeafNode(lv_type_3_0, grammarAccess.getFileImportAccess().getTypeIDTerminalRuleCall_1_1_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getFileImportRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"type",
                            								lv_type_3_0,
                            								"ac.soton.bsharp.BSharp.ID");
                            						

                            }


                            }


                            }
                            break;

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
    // $ANTLR end "ruleFileImport"


    // $ANTLR start "entryRuleLocalImport"
    // InternalBSharp.g:629:1: entryRuleLocalImport returns [EObject current=null] : iv_ruleLocalImport= ruleLocalImport EOF ;
    public final EObject entryRuleLocalImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalImport = null;


        try {
            // InternalBSharp.g:629:52: (iv_ruleLocalImport= ruleLocalImport EOF )
            // InternalBSharp.g:630:2: iv_ruleLocalImport= ruleLocalImport EOF
            {
             newCompositeNode(grammarAccess.getLocalImportRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLocalImport=ruleLocalImport();

            state._fsp--;

             current =iv_ruleLocalImport; 
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
    // $ANTLR end "entryRuleLocalImport"


    // $ANTLR start "ruleLocalImport"
    // InternalBSharp.g:636:1: ruleLocalImport returns [EObject current=null] : (otherlv_0= 'Import' ( (lv_fileImports_1_0= ruleFileImport ) )+ ) ;
    public final EObject ruleLocalImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_fileImports_1_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:642:2: ( (otherlv_0= 'Import' ( (lv_fileImports_1_0= ruleFileImport ) )+ ) )
            // InternalBSharp.g:643:2: (otherlv_0= 'Import' ( (lv_fileImports_1_0= ruleFileImport ) )+ )
            {
            // InternalBSharp.g:643:2: (otherlv_0= 'Import' ( (lv_fileImports_1_0= ruleFileImport ) )+ )
            // InternalBSharp.g:644:3: otherlv_0= 'Import' ( (lv_fileImports_1_0= ruleFileImport ) )+
            {
            otherlv_0=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLocalImportAccess().getImportKeyword_0());
            		
            // InternalBSharp.g:648:3: ( (lv_fileImports_1_0= ruleFileImport ) )+
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
            	    // InternalBSharp.g:649:4: (lv_fileImports_1_0= ruleFileImport )
            	    {
            	    // InternalBSharp.g:649:4: (lv_fileImports_1_0= ruleFileImport )
            	    // InternalBSharp.g:650:5: lv_fileImports_1_0= ruleFileImport
            	    {

            	    					newCompositeNode(grammarAccess.getLocalImportAccess().getFileImportsFileImportParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_fileImports_1_0=ruleFileImport();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getLocalImportRule());
            	    					}
            	    					add(
            	    						current,
            	    						"fileImports",
            	    						lv_fileImports_1_0,
            	    						"ac.soton.bsharp.BSharp.FileImport");
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
    // $ANTLR end "ruleLocalImport"


    // $ANTLR start "entryRuleClass"
    // InternalBSharp.g:671:1: entryRuleClass returns [EObject current=null] : iv_ruleClass= ruleClass EOF ;
    public final EObject entryRuleClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClass = null;


        try {
            // InternalBSharp.g:671:46: (iv_ruleClass= ruleClass EOF )
            // InternalBSharp.g:672:2: iv_ruleClass= ruleClass EOF
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
    // InternalBSharp.g:678:1: ruleClass returns [EObject current=null] : (otherlv_0= 'Class' ( (lv_name_1_0= RULE_ID ) ) ( (lv_context_2_0= rulePolyContext ) )? ( (lv_supertypes_3_0= ruleSuperTypeList ) )? ( (lv_varList_4_0= ruleTypeStructure ) )? ( (lv_where_5_0= ruleWhere ) )? (otherlv_6= ';' )? ( (lv_block_7_0= ruleBSharpBlock ) ) ) ;
    public final EObject ruleClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_6=null;
        EObject lv_context_2_0 = null;

        EObject lv_supertypes_3_0 = null;

        EObject lv_varList_4_0 = null;

        EObject lv_where_5_0 = null;

        EObject lv_block_7_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:684:2: ( (otherlv_0= 'Class' ( (lv_name_1_0= RULE_ID ) ) ( (lv_context_2_0= rulePolyContext ) )? ( (lv_supertypes_3_0= ruleSuperTypeList ) )? ( (lv_varList_4_0= ruleTypeStructure ) )? ( (lv_where_5_0= ruleWhere ) )? (otherlv_6= ';' )? ( (lv_block_7_0= ruleBSharpBlock ) ) ) )
            // InternalBSharp.g:685:2: (otherlv_0= 'Class' ( (lv_name_1_0= RULE_ID ) ) ( (lv_context_2_0= rulePolyContext ) )? ( (lv_supertypes_3_0= ruleSuperTypeList ) )? ( (lv_varList_4_0= ruleTypeStructure ) )? ( (lv_where_5_0= ruleWhere ) )? (otherlv_6= ';' )? ( (lv_block_7_0= ruleBSharpBlock ) ) )
            {
            // InternalBSharp.g:685:2: (otherlv_0= 'Class' ( (lv_name_1_0= RULE_ID ) ) ( (lv_context_2_0= rulePolyContext ) )? ( (lv_supertypes_3_0= ruleSuperTypeList ) )? ( (lv_varList_4_0= ruleTypeStructure ) )? ( (lv_where_5_0= ruleWhere ) )? (otherlv_6= ';' )? ( (lv_block_7_0= ruleBSharpBlock ) ) )
            // InternalBSharp.g:686:3: otherlv_0= 'Class' ( (lv_name_1_0= RULE_ID ) ) ( (lv_context_2_0= rulePolyContext ) )? ( (lv_supertypes_3_0= ruleSuperTypeList ) )? ( (lv_varList_4_0= ruleTypeStructure ) )? ( (lv_where_5_0= ruleWhere ) )? (otherlv_6= ';' )? ( (lv_block_7_0= ruleBSharpBlock ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getClassAccess().getClassKeyword_0());
            		
            // InternalBSharp.g:690:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalBSharp.g:691:4: (lv_name_1_0= RULE_ID )
            {
            // InternalBSharp.g:691:4: (lv_name_1_0= RULE_ID )
            // InternalBSharp.g:692:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_name_1_0, grammarAccess.getClassAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getClassRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"ac.soton.bsharp.BSharp.ID");
            				

            }


            }

            // InternalBSharp.g:708:3: ( (lv_context_2_0= rulePolyContext ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==19) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalBSharp.g:709:4: (lv_context_2_0= rulePolyContext )
                    {
                    // InternalBSharp.g:709:4: (lv_context_2_0= rulePolyContext )
                    // InternalBSharp.g:710:5: lv_context_2_0= rulePolyContext
                    {

                    					newCompositeNode(grammarAccess.getClassAccess().getContextPolyContextParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_12);
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

            // InternalBSharp.g:727:3: ( (lv_supertypes_3_0= ruleSuperTypeList ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==12) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalBSharp.g:728:4: (lv_supertypes_3_0= ruleSuperTypeList )
                    {
                    // InternalBSharp.g:728:4: (lv_supertypes_3_0= ruleSuperTypeList )
                    // InternalBSharp.g:729:5: lv_supertypes_3_0= ruleSuperTypeList
                    {

                    					newCompositeNode(grammarAccess.getClassAccess().getSupertypesSuperTypeListParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_12);
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

            // InternalBSharp.g:746:3: ( (lv_varList_4_0= ruleTypeStructure ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==32) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalBSharp.g:747:4: (lv_varList_4_0= ruleTypeStructure )
                    {
                    // InternalBSharp.g:747:4: (lv_varList_4_0= ruleTypeStructure )
                    // InternalBSharp.g:748:5: lv_varList_4_0= ruleTypeStructure
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

            // InternalBSharp.g:765:3: ( (lv_where_5_0= ruleWhere ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==34) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalBSharp.g:766:4: (lv_where_5_0= ruleWhere )
                    {
                    // InternalBSharp.g:766:4: (lv_where_5_0= ruleWhere )
                    // InternalBSharp.g:767:5: lv_where_5_0= ruleWhere
                    {

                    					newCompositeNode(grammarAccess.getClassAccess().getWhereWhereParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_12);
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

            // InternalBSharp.g:784:3: (otherlv_6= ';' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==18) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalBSharp.g:785:4: otherlv_6= ';'
                    {
                    otherlv_6=(Token)match(input,18,FOLLOW_12); 

                    				newLeafNode(otherlv_6, grammarAccess.getClassAccess().getSemicolonKeyword_6());
                    			

                    }
                    break;

            }

            // InternalBSharp.g:790:3: ( (lv_block_7_0= ruleBSharpBlock ) )
            // InternalBSharp.g:791:4: (lv_block_7_0= ruleBSharpBlock )
            {
            // InternalBSharp.g:791:4: (lv_block_7_0= ruleBSharpBlock )
            // InternalBSharp.g:792:5: lv_block_7_0= ruleBSharpBlock
            {

            					newCompositeNode(grammarAccess.getClassAccess().getBlockBSharpBlockParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_2);
            lv_block_7_0=ruleBSharpBlock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getClassRule());
            					}
            					set(
            						current,
            						"block",
            						lv_block_7_0,
            						"ac.soton.bsharp.BSharp.BSharpBlock");
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
    // $ANTLR end "ruleClass"


    // $ANTLR start "entryRulePolyContext"
    // InternalBSharp.g:813:1: entryRulePolyContext returns [EObject current=null] : iv_rulePolyContext= rulePolyContext EOF ;
    public final EObject entryRulePolyContext() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePolyContext = null;


        try {
            // InternalBSharp.g:813:52: (iv_rulePolyContext= rulePolyContext EOF )
            // InternalBSharp.g:814:2: iv_rulePolyContext= rulePolyContext EOF
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
    // InternalBSharp.g:820:1: rulePolyContext returns [EObject current=null] : (otherlv_0= '<' ( (lv_polyTypes_1_0= rulePolyType ) )+ otherlv_2= '>' ) ;
    public final EObject rulePolyContext() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_polyTypes_1_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:826:2: ( (otherlv_0= '<' ( (lv_polyTypes_1_0= rulePolyType ) )+ otherlv_2= '>' ) )
            // InternalBSharp.g:827:2: (otherlv_0= '<' ( (lv_polyTypes_1_0= rulePolyType ) )+ otherlv_2= '>' )
            {
            // InternalBSharp.g:827:2: (otherlv_0= '<' ( (lv_polyTypes_1_0= rulePolyType ) )+ otherlv_2= '>' )
            // InternalBSharp.g:828:3: otherlv_0= '<' ( (lv_polyTypes_1_0= rulePolyType ) )+ otherlv_2= '>'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPolyContextAccess().getLessThanSignKeyword_0());
            		
            // InternalBSharp.g:832:3: ( (lv_polyTypes_1_0= rulePolyType ) )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalBSharp.g:833:4: (lv_polyTypes_1_0= rulePolyType )
            	    {
            	    // InternalBSharp.g:833:4: (lv_polyTypes_1_0= rulePolyType )
            	    // InternalBSharp.g:834:5: lv_polyTypes_1_0= rulePolyType
            	    {

            	    					newCompositeNode(grammarAccess.getPolyContextAccess().getPolyTypesPolyTypeParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_polyTypes_1_0=rulePolyType();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPolyContextRule());
            	    					}
            	    					add(
            	    						current,
            	    						"polyTypes",
            	    						lv_polyTypes_1_0,
            	    						"ac.soton.bsharp.BSharp.PolyType");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
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


    // $ANTLR start "entryRulePolyType"
    // InternalBSharp.g:859:1: entryRulePolyType returns [EObject current=null] : iv_rulePolyType= rulePolyType EOF ;
    public final EObject entryRulePolyType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePolyType = null;


        try {
            // InternalBSharp.g:859:49: (iv_rulePolyType= rulePolyType EOF )
            // InternalBSharp.g:860:2: iv_rulePolyType= rulePolyType EOF
            {
             newCompositeNode(grammarAccess.getPolyTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePolyType=rulePolyType();

            state._fsp--;

             current =iv_rulePolyType; 
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
    // $ANTLR end "entryRulePolyType"


    // $ANTLR start "rulePolyType"
    // InternalBSharp.g:866:1: rulePolyType returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ':' ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )* )? ) ;
    public final EObject rulePolyType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalBSharp.g:872:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ':' ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )* )? ) )
            // InternalBSharp.g:873:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ':' ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )* )? )
            {
            // InternalBSharp.g:873:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ':' ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )* )? )
            // InternalBSharp.g:874:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ':' ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )* )?
            {
            // InternalBSharp.g:874:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalBSharp.g:875:4: (lv_name_0_0= RULE_ID )
            {
            // InternalBSharp.g:875:4: (lv_name_0_0= RULE_ID )
            // InternalBSharp.g:876:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_name_0_0, grammarAccess.getPolyTypeAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPolyTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"ac.soton.bsharp.BSharp.ID");
            				

            }


            }

            // InternalBSharp.g:892:3: (otherlv_1= ':' ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==12) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalBSharp.g:893:4: otherlv_1= ':' ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_1=(Token)match(input,12,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getPolyTypeAccess().getColonKeyword_1_0());
                    			
                    // InternalBSharp.g:897:4: ( ( ruleQualifiedName ) )
                    // InternalBSharp.g:898:5: ( ruleQualifiedName )
                    {
                    // InternalBSharp.g:898:5: ( ruleQualifiedName )
                    // InternalBSharp.g:899:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPolyTypeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getPolyTypeAccess().getSuperTypesClassDeclCrossReference_1_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBSharp.g:913:4: (otherlv_3= ',' ( ( ruleQualifiedName ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==21) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalBSharp.g:914:5: otherlv_3= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_3=(Token)match(input,21,FOLLOW_3); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getPolyTypeAccess().getCommaKeyword_1_2_0());
                    	    				
                    	    // InternalBSharp.g:918:5: ( ( ruleQualifiedName ) )
                    	    // InternalBSharp.g:919:6: ( ruleQualifiedName )
                    	    {
                    	    // InternalBSharp.g:919:6: ( ruleQualifiedName )
                    	    // InternalBSharp.g:920:7: ruleQualifiedName
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getPolyTypeRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getPolyTypeAccess().getSuperTypesClassDeclCrossReference_1_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    ruleQualifiedName();

                    	    state._fsp--;


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
    // $ANTLR end "rulePolyType"


    // $ANTLR start "entryRuleSuperTypeList"
    // InternalBSharp.g:940:1: entryRuleSuperTypeList returns [EObject current=null] : iv_ruleSuperTypeList= ruleSuperTypeList EOF ;
    public final EObject entryRuleSuperTypeList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSuperTypeList = null;


        try {
            // InternalBSharp.g:940:54: (iv_ruleSuperTypeList= ruleSuperTypeList EOF )
            // InternalBSharp.g:941:2: iv_ruleSuperTypeList= ruleSuperTypeList EOF
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
    // InternalBSharp.g:947:1: ruleSuperTypeList returns [EObject current=null] : (otherlv_0= ':' ( (lv_superTypes_1_0= ruleConstructedType ) ) (otherlv_2= ',' ( (lv_superTypes_3_0= ruleConstructedType ) ) )* ) ;
    public final EObject ruleSuperTypeList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_superTypes_1_0 = null;

        EObject lv_superTypes_3_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:953:2: ( (otherlv_0= ':' ( (lv_superTypes_1_0= ruleConstructedType ) ) (otherlv_2= ',' ( (lv_superTypes_3_0= ruleConstructedType ) ) )* ) )
            // InternalBSharp.g:954:2: (otherlv_0= ':' ( (lv_superTypes_1_0= ruleConstructedType ) ) (otherlv_2= ',' ( (lv_superTypes_3_0= ruleConstructedType ) ) )* )
            {
            // InternalBSharp.g:954:2: (otherlv_0= ':' ( (lv_superTypes_1_0= ruleConstructedType ) ) (otherlv_2= ',' ( (lv_superTypes_3_0= ruleConstructedType ) ) )* )
            // InternalBSharp.g:955:3: otherlv_0= ':' ( (lv_superTypes_1_0= ruleConstructedType ) ) (otherlv_2= ',' ( (lv_superTypes_3_0= ruleConstructedType ) ) )*
            {
            otherlv_0=(Token)match(input,12,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getSuperTypeListAccess().getColonKeyword_0());
            		
            // InternalBSharp.g:959:3: ( (lv_superTypes_1_0= ruleConstructedType ) )
            // InternalBSharp.g:960:4: (lv_superTypes_1_0= ruleConstructedType )
            {
            // InternalBSharp.g:960:4: (lv_superTypes_1_0= ruleConstructedType )
            // InternalBSharp.g:961:5: lv_superTypes_1_0= ruleConstructedType
            {

            					newCompositeNode(grammarAccess.getSuperTypeListAccess().getSuperTypesConstructedTypeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_15);
            lv_superTypes_1_0=ruleConstructedType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSuperTypeListRule());
            					}
            					add(
            						current,
            						"superTypes",
            						lv_superTypes_1_0,
            						"ac.soton.bsharp.BSharp.ConstructedType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBSharp.g:978:3: (otherlv_2= ',' ( (lv_superTypes_3_0= ruleConstructedType ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==21) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalBSharp.g:979:4: otherlv_2= ',' ( (lv_superTypes_3_0= ruleConstructedType ) )
            	    {
            	    otherlv_2=(Token)match(input,21,FOLLOW_16); 

            	    				newLeafNode(otherlv_2, grammarAccess.getSuperTypeListAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalBSharp.g:983:4: ( (lv_superTypes_3_0= ruleConstructedType ) )
            	    // InternalBSharp.g:984:5: (lv_superTypes_3_0= ruleConstructedType )
            	    {
            	    // InternalBSharp.g:984:5: (lv_superTypes_3_0= ruleConstructedType )
            	    // InternalBSharp.g:985:6: lv_superTypes_3_0= ruleConstructedType
            	    {

            	    						newCompositeNode(grammarAccess.getSuperTypeListAccess().getSuperTypesConstructedTypeParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_15);
            	    lv_superTypes_3_0=ruleConstructedType();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSuperTypeListRule());
            	    						}
            	    						add(
            	    							current,
            	    							"superTypes",
            	    							lv_superTypes_3_0,
            	    							"ac.soton.bsharp.BSharp.ConstructedType");
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
    // $ANTLR end "ruleSuperTypeList"


    // $ANTLR start "entryRuleConstructedType"
    // InternalBSharp.g:1007:1: entryRuleConstructedType returns [EObject current=null] : iv_ruleConstructedType= ruleConstructedType EOF ;
    public final EObject entryRuleConstructedType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstructedType = null;


        try {
            // InternalBSharp.g:1007:56: (iv_ruleConstructedType= ruleConstructedType EOF )
            // InternalBSharp.g:1008:2: iv_ruleConstructedType= ruleConstructedType EOF
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
    // InternalBSharp.g:1014:1: ruleConstructedType returns [EObject current=null] : ( (this_TypeConstructor_0= ruleTypeConstructor | this_TypeConstrBracket_1= ruleTypeConstrBracket ) ( () ( ( (lv_constructor_3_1= '\\u00D7' | lv_constructor_3_2= '\\u2192' | lv_constructor_3_3= '\\uE102' | lv_constructor_3_4= '\\uE100' | lv_constructor_3_5= '\\u2194' | lv_constructor_3_6= '\\u2916' | lv_constructor_3_7= '\\u21F8' | lv_constructor_3_8= '\\u21A3' | lv_constructor_3_9= '\\u2900' | lv_constructor_3_10= '\\u21A0' ) ) ) ( ( (lv_right_4_1= ruleTypeConstructor | lv_right_4_2= ruleTypeConstrBracket ) ) ) )* ) ;
    public final EObject ruleConstructedType() throws RecognitionException {
        EObject current = null;

        Token lv_constructor_3_1=null;
        Token lv_constructor_3_2=null;
        Token lv_constructor_3_3=null;
        Token lv_constructor_3_4=null;
        Token lv_constructor_3_5=null;
        Token lv_constructor_3_6=null;
        Token lv_constructor_3_7=null;
        Token lv_constructor_3_8=null;
        Token lv_constructor_3_9=null;
        Token lv_constructor_3_10=null;
        EObject this_TypeConstructor_0 = null;

        EObject this_TypeConstrBracket_1 = null;

        EObject lv_right_4_1 = null;

        EObject lv_right_4_2 = null;



        	enterRule();

        try {
            // InternalBSharp.g:1020:2: ( ( (this_TypeConstructor_0= ruleTypeConstructor | this_TypeConstrBracket_1= ruleTypeConstrBracket ) ( () ( ( (lv_constructor_3_1= '\\u00D7' | lv_constructor_3_2= '\\u2192' | lv_constructor_3_3= '\\uE102' | lv_constructor_3_4= '\\uE100' | lv_constructor_3_5= '\\u2194' | lv_constructor_3_6= '\\u2916' | lv_constructor_3_7= '\\u21F8' | lv_constructor_3_8= '\\u21A3' | lv_constructor_3_9= '\\u2900' | lv_constructor_3_10= '\\u21A0' ) ) ) ( ( (lv_right_4_1= ruleTypeConstructor | lv_right_4_2= ruleTypeConstrBracket ) ) ) )* ) )
            // InternalBSharp.g:1021:2: ( (this_TypeConstructor_0= ruleTypeConstructor | this_TypeConstrBracket_1= ruleTypeConstrBracket ) ( () ( ( (lv_constructor_3_1= '\\u00D7' | lv_constructor_3_2= '\\u2192' | lv_constructor_3_3= '\\uE102' | lv_constructor_3_4= '\\uE100' | lv_constructor_3_5= '\\u2194' | lv_constructor_3_6= '\\u2916' | lv_constructor_3_7= '\\u21F8' | lv_constructor_3_8= '\\u21A3' | lv_constructor_3_9= '\\u2900' | lv_constructor_3_10= '\\u21A0' ) ) ) ( ( (lv_right_4_1= ruleTypeConstructor | lv_right_4_2= ruleTypeConstrBracket ) ) ) )* )
            {
            // InternalBSharp.g:1021:2: ( (this_TypeConstructor_0= ruleTypeConstructor | this_TypeConstrBracket_1= ruleTypeConstrBracket ) ( () ( ( (lv_constructor_3_1= '\\u00D7' | lv_constructor_3_2= '\\u2192' | lv_constructor_3_3= '\\uE102' | lv_constructor_3_4= '\\uE100' | lv_constructor_3_5= '\\u2194' | lv_constructor_3_6= '\\u2916' | lv_constructor_3_7= '\\u21F8' | lv_constructor_3_8= '\\u21A3' | lv_constructor_3_9= '\\u2900' | lv_constructor_3_10= '\\u21A0' ) ) ) ( ( (lv_right_4_1= ruleTypeConstructor | lv_right_4_2= ruleTypeConstrBracket ) ) ) )* )
            // InternalBSharp.g:1022:3: (this_TypeConstructor_0= ruleTypeConstructor | this_TypeConstrBracket_1= ruleTypeConstrBracket ) ( () ( ( (lv_constructor_3_1= '\\u00D7' | lv_constructor_3_2= '\\u2192' | lv_constructor_3_3= '\\uE102' | lv_constructor_3_4= '\\uE100' | lv_constructor_3_5= '\\u2194' | lv_constructor_3_6= '\\u2916' | lv_constructor_3_7= '\\u21F8' | lv_constructor_3_8= '\\u21A3' | lv_constructor_3_9= '\\u2900' | lv_constructor_3_10= '\\u21A0' ) ) ) ( ( (lv_right_4_1= ruleTypeConstructor | lv_right_4_2= ruleTypeConstrBracket ) ) ) )*
            {
            // InternalBSharp.g:1022:3: (this_TypeConstructor_0= ruleTypeConstructor | this_TypeConstrBracket_1= ruleTypeConstrBracket )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID) ) {
                alt21=1;
            }
            else if ( (LA21_0==32) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalBSharp.g:1023:4: this_TypeConstructor_0= ruleTypeConstructor
                    {

                    				newCompositeNode(grammarAccess.getConstructedTypeAccess().getTypeConstructorParserRuleCall_0_0());
                    			
                    pushFollow(FOLLOW_17);
                    this_TypeConstructor_0=ruleTypeConstructor();

                    state._fsp--;


                    				current = this_TypeConstructor_0;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalBSharp.g:1032:4: this_TypeConstrBracket_1= ruleTypeConstrBracket
                    {

                    				newCompositeNode(grammarAccess.getConstructedTypeAccess().getTypeConstrBracketParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_17);
                    this_TypeConstrBracket_1=ruleTypeConstrBracket();

                    state._fsp--;


                    				current = this_TypeConstrBracket_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalBSharp.g:1041:3: ( () ( ( (lv_constructor_3_1= '\\u00D7' | lv_constructor_3_2= '\\u2192' | lv_constructor_3_3= '\\uE102' | lv_constructor_3_4= '\\uE100' | lv_constructor_3_5= '\\u2194' | lv_constructor_3_6= '\\u2916' | lv_constructor_3_7= '\\u21F8' | lv_constructor_3_8= '\\u21A3' | lv_constructor_3_9= '\\u2900' | lv_constructor_3_10= '\\u21A0' ) ) ) ( ( (lv_right_4_1= ruleTypeConstructor | lv_right_4_2= ruleTypeConstrBracket ) ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=22 && LA24_0<=31)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalBSharp.g:1042:4: () ( ( (lv_constructor_3_1= '\\u00D7' | lv_constructor_3_2= '\\u2192' | lv_constructor_3_3= '\\uE102' | lv_constructor_3_4= '\\uE100' | lv_constructor_3_5= '\\u2194' | lv_constructor_3_6= '\\u2916' | lv_constructor_3_7= '\\u21F8' | lv_constructor_3_8= '\\u21A3' | lv_constructor_3_9= '\\u2900' | lv_constructor_3_10= '\\u21A0' ) ) ) ( ( (lv_right_4_1= ruleTypeConstructor | lv_right_4_2= ruleTypeConstrBracket ) ) )
            	    {
            	    // InternalBSharp.g:1042:4: ()
            	    // InternalBSharp.g:1043:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getConstructedTypeAccess().getConstructedTypeLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalBSharp.g:1049:4: ( ( (lv_constructor_3_1= '\\u00D7' | lv_constructor_3_2= '\\u2192' | lv_constructor_3_3= '\\uE102' | lv_constructor_3_4= '\\uE100' | lv_constructor_3_5= '\\u2194' | lv_constructor_3_6= '\\u2916' | lv_constructor_3_7= '\\u21F8' | lv_constructor_3_8= '\\u21A3' | lv_constructor_3_9= '\\u2900' | lv_constructor_3_10= '\\u21A0' ) ) )
            	    // InternalBSharp.g:1050:5: ( (lv_constructor_3_1= '\\u00D7' | lv_constructor_3_2= '\\u2192' | lv_constructor_3_3= '\\uE102' | lv_constructor_3_4= '\\uE100' | lv_constructor_3_5= '\\u2194' | lv_constructor_3_6= '\\u2916' | lv_constructor_3_7= '\\u21F8' | lv_constructor_3_8= '\\u21A3' | lv_constructor_3_9= '\\u2900' | lv_constructor_3_10= '\\u21A0' ) )
            	    {
            	    // InternalBSharp.g:1050:5: ( (lv_constructor_3_1= '\\u00D7' | lv_constructor_3_2= '\\u2192' | lv_constructor_3_3= '\\uE102' | lv_constructor_3_4= '\\uE100' | lv_constructor_3_5= '\\u2194' | lv_constructor_3_6= '\\u2916' | lv_constructor_3_7= '\\u21F8' | lv_constructor_3_8= '\\u21A3' | lv_constructor_3_9= '\\u2900' | lv_constructor_3_10= '\\u21A0' ) )
            	    // InternalBSharp.g:1051:6: (lv_constructor_3_1= '\\u00D7' | lv_constructor_3_2= '\\u2192' | lv_constructor_3_3= '\\uE102' | lv_constructor_3_4= '\\uE100' | lv_constructor_3_5= '\\u2194' | lv_constructor_3_6= '\\u2916' | lv_constructor_3_7= '\\u21F8' | lv_constructor_3_8= '\\u21A3' | lv_constructor_3_9= '\\u2900' | lv_constructor_3_10= '\\u21A0' )
            	    {
            	    // InternalBSharp.g:1051:6: (lv_constructor_3_1= '\\u00D7' | lv_constructor_3_2= '\\u2192' | lv_constructor_3_3= '\\uE102' | lv_constructor_3_4= '\\uE100' | lv_constructor_3_5= '\\u2194' | lv_constructor_3_6= '\\u2916' | lv_constructor_3_7= '\\u21F8' | lv_constructor_3_8= '\\u21A3' | lv_constructor_3_9= '\\u2900' | lv_constructor_3_10= '\\u21A0' )
            	    int alt22=10;
            	    switch ( input.LA(1) ) {
            	    case 22:
            	        {
            	        alt22=1;
            	        }
            	        break;
            	    case 23:
            	        {
            	        alt22=2;
            	        }
            	        break;
            	    case 24:
            	        {
            	        alt22=3;
            	        }
            	        break;
            	    case 25:
            	        {
            	        alt22=4;
            	        }
            	        break;
            	    case 26:
            	        {
            	        alt22=5;
            	        }
            	        break;
            	    case 27:
            	        {
            	        alt22=6;
            	        }
            	        break;
            	    case 28:
            	        {
            	        alt22=7;
            	        }
            	        break;
            	    case 29:
            	        {
            	        alt22=8;
            	        }
            	        break;
            	    case 30:
            	        {
            	        alt22=9;
            	        }
            	        break;
            	    case 31:
            	        {
            	        alt22=10;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 22, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt22) {
            	        case 1 :
            	            // InternalBSharp.g:1052:7: lv_constructor_3_1= '\\u00D7'
            	            {
            	            lv_constructor_3_1=(Token)match(input,22,FOLLOW_16); 

            	            							newLeafNode(lv_constructor_3_1, grammarAccess.getConstructedTypeAccess().getConstructorMultiplicationSignKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getConstructedTypeRule());
            	            							}
            	            							setWithLastConsumed(current, "constructor", lv_constructor_3_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalBSharp.g:1063:7: lv_constructor_3_2= '\\u2192'
            	            {
            	            lv_constructor_3_2=(Token)match(input,23,FOLLOW_16); 

            	            							newLeafNode(lv_constructor_3_2, grammarAccess.getConstructedTypeAccess().getConstructorRightwardsArrowKeyword_1_1_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getConstructedTypeRule());
            	            							}
            	            							setWithLastConsumed(current, "constructor", lv_constructor_3_2, null);
            	            						

            	            }
            	            break;
            	        case 3 :
            	            // InternalBSharp.g:1074:7: lv_constructor_3_3= '\\uE102'
            	            {
            	            lv_constructor_3_3=(Token)match(input,24,FOLLOW_16); 

            	            							newLeafNode(lv_constructor_3_3, grammarAccess.getConstructedTypeAccess().getConstructorPrivateUseAreaE102Keyword_1_1_0_2());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getConstructedTypeRule());
            	            							}
            	            							setWithLastConsumed(current, "constructor", lv_constructor_3_3, null);
            	            						

            	            }
            	            break;
            	        case 4 :
            	            // InternalBSharp.g:1085:7: lv_constructor_3_4= '\\uE100'
            	            {
            	            lv_constructor_3_4=(Token)match(input,25,FOLLOW_16); 

            	            							newLeafNode(lv_constructor_3_4, grammarAccess.getConstructedTypeAccess().getConstructorPrivateUseAreaE100Keyword_1_1_0_3());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getConstructedTypeRule());
            	            							}
            	            							setWithLastConsumed(current, "constructor", lv_constructor_3_4, null);
            	            						

            	            }
            	            break;
            	        case 5 :
            	            // InternalBSharp.g:1096:7: lv_constructor_3_5= '\\u2194'
            	            {
            	            lv_constructor_3_5=(Token)match(input,26,FOLLOW_16); 

            	            							newLeafNode(lv_constructor_3_5, grammarAccess.getConstructedTypeAccess().getConstructorLeftRightArrowKeyword_1_1_0_4());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getConstructedTypeRule());
            	            							}
            	            							setWithLastConsumed(current, "constructor", lv_constructor_3_5, null);
            	            						

            	            }
            	            break;
            	        case 6 :
            	            // InternalBSharp.g:1107:7: lv_constructor_3_6= '\\u2916'
            	            {
            	            lv_constructor_3_6=(Token)match(input,27,FOLLOW_16); 

            	            							newLeafNode(lv_constructor_3_6, grammarAccess.getConstructedTypeAccess().getConstructorRightwardsTwoHeadedArrowWithTailKeyword_1_1_0_5());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getConstructedTypeRule());
            	            							}
            	            							setWithLastConsumed(current, "constructor", lv_constructor_3_6, null);
            	            						

            	            }
            	            break;
            	        case 7 :
            	            // InternalBSharp.g:1118:7: lv_constructor_3_7= '\\u21F8'
            	            {
            	            lv_constructor_3_7=(Token)match(input,28,FOLLOW_16); 

            	            							newLeafNode(lv_constructor_3_7, grammarAccess.getConstructedTypeAccess().getConstructorRightwardsArrowWithVerticalStrokeKeyword_1_1_0_6());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getConstructedTypeRule());
            	            							}
            	            							setWithLastConsumed(current, "constructor", lv_constructor_3_7, null);
            	            						

            	            }
            	            break;
            	        case 8 :
            	            // InternalBSharp.g:1129:7: lv_constructor_3_8= '\\u21A3'
            	            {
            	            lv_constructor_3_8=(Token)match(input,29,FOLLOW_16); 

            	            							newLeafNode(lv_constructor_3_8, grammarAccess.getConstructedTypeAccess().getConstructorRightwardsArrowWithTailKeyword_1_1_0_7());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getConstructedTypeRule());
            	            							}
            	            							setWithLastConsumed(current, "constructor", lv_constructor_3_8, null);
            	            						

            	            }
            	            break;
            	        case 9 :
            	            // InternalBSharp.g:1140:7: lv_constructor_3_9= '\\u2900'
            	            {
            	            lv_constructor_3_9=(Token)match(input,30,FOLLOW_16); 

            	            							newLeafNode(lv_constructor_3_9, grammarAccess.getConstructedTypeAccess().getConstructorRightwardsTwoHeadedArrowWithVerticalStrokeKeyword_1_1_0_8());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getConstructedTypeRule());
            	            							}
            	            							setWithLastConsumed(current, "constructor", lv_constructor_3_9, null);
            	            						

            	            }
            	            break;
            	        case 10 :
            	            // InternalBSharp.g:1151:7: lv_constructor_3_10= '\\u21A0'
            	            {
            	            lv_constructor_3_10=(Token)match(input,31,FOLLOW_16); 

            	            							newLeafNode(lv_constructor_3_10, grammarAccess.getConstructedTypeAccess().getConstructorRightwardsTwoHeadedArrowKeyword_1_1_0_9());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getConstructedTypeRule());
            	            							}
            	            							setWithLastConsumed(current, "constructor", lv_constructor_3_10, null);
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalBSharp.g:1164:4: ( ( (lv_right_4_1= ruleTypeConstructor | lv_right_4_2= ruleTypeConstrBracket ) ) )
            	    // InternalBSharp.g:1165:5: ( (lv_right_4_1= ruleTypeConstructor | lv_right_4_2= ruleTypeConstrBracket ) )
            	    {
            	    // InternalBSharp.g:1165:5: ( (lv_right_4_1= ruleTypeConstructor | lv_right_4_2= ruleTypeConstrBracket ) )
            	    // InternalBSharp.g:1166:6: (lv_right_4_1= ruleTypeConstructor | lv_right_4_2= ruleTypeConstrBracket )
            	    {
            	    // InternalBSharp.g:1166:6: (lv_right_4_1= ruleTypeConstructor | lv_right_4_2= ruleTypeConstrBracket )
            	    int alt23=2;
            	    int LA23_0 = input.LA(1);

            	    if ( (LA23_0==RULE_ID) ) {
            	        alt23=1;
            	    }
            	    else if ( (LA23_0==32) ) {
            	        alt23=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 23, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt23) {
            	        case 1 :
            	            // InternalBSharp.g:1167:7: lv_right_4_1= ruleTypeConstructor
            	            {

            	            							newCompositeNode(grammarAccess.getConstructedTypeAccess().getRightTypeConstructorParserRuleCall_1_2_0_0());
            	            						
            	            pushFollow(FOLLOW_17);
            	            lv_right_4_1=ruleTypeConstructor();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getConstructedTypeRule());
            	            							}
            	            							set(
            	            								current,
            	            								"right",
            	            								lv_right_4_1,
            	            								"ac.soton.bsharp.BSharp.TypeConstructor");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalBSharp.g:1183:7: lv_right_4_2= ruleTypeConstrBracket
            	            {

            	            							newCompositeNode(grammarAccess.getConstructedTypeAccess().getRightTypeConstrBracketParserRuleCall_1_2_0_1());
            	            						
            	            pushFollow(FOLLOW_17);
            	            lv_right_4_2=ruleTypeConstrBracket();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getConstructedTypeRule());
            	            							}
            	            							set(
            	            								current,
            	            								"right",
            	            								lv_right_4_2,
            	            								"ac.soton.bsharp.BSharp.TypeConstrBracket");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // InternalBSharp.g:1206:1: entryRuleTypeConstructor returns [EObject current=null] : iv_ruleTypeConstructor= ruleTypeConstructor EOF ;
    public final EObject entryRuleTypeConstructor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeConstructor = null;


        try {
            // InternalBSharp.g:1206:56: (iv_ruleTypeConstructor= ruleTypeConstructor EOF )
            // InternalBSharp.g:1207:2: iv_ruleTypeConstructor= ruleTypeConstructor EOF
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
    // InternalBSharp.g:1213:1: ruleTypeConstructor returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( (lv_context_1_0= ruleTypeDeclContext ) )? ) ;
    public final EObject ruleTypeConstructor() throws RecognitionException {
        EObject current = null;

        EObject lv_context_1_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:1219:2: ( ( ( ( ruleQualifiedName ) ) ( (lv_context_1_0= ruleTypeDeclContext ) )? ) )
            // InternalBSharp.g:1220:2: ( ( ( ruleQualifiedName ) ) ( (lv_context_1_0= ruleTypeDeclContext ) )? )
            {
            // InternalBSharp.g:1220:2: ( ( ( ruleQualifiedName ) ) ( (lv_context_1_0= ruleTypeDeclContext ) )? )
            // InternalBSharp.g:1221:3: ( ( ruleQualifiedName ) ) ( (lv_context_1_0= ruleTypeDeclContext ) )?
            {
            // InternalBSharp.g:1221:3: ( ( ruleQualifiedName ) )
            // InternalBSharp.g:1222:4: ( ruleQualifiedName )
            {
            // InternalBSharp.g:1222:4: ( ruleQualifiedName )
            // InternalBSharp.g:1223:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTypeConstructorRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTypeConstructorAccess().getTypeNameGenNameCrossReference_0_0());
            				
            pushFollow(FOLLOW_18);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBSharp.g:1237:3: ( (lv_context_1_0= ruleTypeDeclContext ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==19) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalBSharp.g:1238:4: (lv_context_1_0= ruleTypeDeclContext )
                    {
                    // InternalBSharp.g:1238:4: (lv_context_1_0= ruleTypeDeclContext )
                    // InternalBSharp.g:1239:5: lv_context_1_0= ruleTypeDeclContext
                    {

                    					newCompositeNode(grammarAccess.getTypeConstructorAccess().getContextTypeDeclContextParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_context_1_0=ruleTypeDeclContext();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTypeConstructorRule());
                    					}
                    					set(
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


    // $ANTLR start "entryRuleTypeConstrBracket"
    // InternalBSharp.g:1260:1: entryRuleTypeConstrBracket returns [EObject current=null] : iv_ruleTypeConstrBracket= ruleTypeConstrBracket EOF ;
    public final EObject entryRuleTypeConstrBracket() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeConstrBracket = null;


        try {
            // InternalBSharp.g:1260:58: (iv_ruleTypeConstrBracket= ruleTypeConstrBracket EOF )
            // InternalBSharp.g:1261:2: iv_ruleTypeConstrBracket= ruleTypeConstrBracket EOF
            {
             newCompositeNode(grammarAccess.getTypeConstrBracketRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTypeConstrBracket=ruleTypeConstrBracket();

            state._fsp--;

             current =iv_ruleTypeConstrBracket; 
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
    // $ANTLR end "entryRuleTypeConstrBracket"


    // $ANTLR start "ruleTypeConstrBracket"
    // InternalBSharp.g:1267:1: ruleTypeConstrBracket returns [EObject current=null] : (otherlv_0= '(' ( (lv_child_1_0= ruleConstructedType ) ) otherlv_2= ')' ) ;
    public final EObject ruleTypeConstrBracket() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_child_1_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:1273:2: ( (otherlv_0= '(' ( (lv_child_1_0= ruleConstructedType ) ) otherlv_2= ')' ) )
            // InternalBSharp.g:1274:2: (otherlv_0= '(' ( (lv_child_1_0= ruleConstructedType ) ) otherlv_2= ')' )
            {
            // InternalBSharp.g:1274:2: (otherlv_0= '(' ( (lv_child_1_0= ruleConstructedType ) ) otherlv_2= ')' )
            // InternalBSharp.g:1275:3: otherlv_0= '(' ( (lv_child_1_0= ruleConstructedType ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getTypeConstrBracketAccess().getLeftParenthesisKeyword_0());
            		
            // InternalBSharp.g:1279:3: ( (lv_child_1_0= ruleConstructedType ) )
            // InternalBSharp.g:1280:4: (lv_child_1_0= ruleConstructedType )
            {
            // InternalBSharp.g:1280:4: (lv_child_1_0= ruleConstructedType )
            // InternalBSharp.g:1281:5: lv_child_1_0= ruleConstructedType
            {

            					newCompositeNode(grammarAccess.getTypeConstrBracketAccess().getChildConstructedTypeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_19);
            lv_child_1_0=ruleConstructedType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTypeConstrBracketRule());
            					}
            					set(
            						current,
            						"child",
            						lv_child_1_0,
            						"ac.soton.bsharp.BSharp.ConstructedType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,33,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getTypeConstrBracketAccess().getRightParenthesisKeyword_2());
            		

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
    // $ANTLR end "ruleTypeConstrBracket"


    // $ANTLR start "entryRuleTypeDeclContext"
    // InternalBSharp.g:1306:1: entryRuleTypeDeclContext returns [EObject current=null] : iv_ruleTypeDeclContext= ruleTypeDeclContext EOF ;
    public final EObject entryRuleTypeDeclContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeDeclContext = null;


        try {
            // InternalBSharp.g:1306:56: (iv_ruleTypeDeclContext= ruleTypeDeclContext EOF )
            // InternalBSharp.g:1307:2: iv_ruleTypeDeclContext= ruleTypeDeclContext EOF
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
    // InternalBSharp.g:1313:1: ruleTypeDeclContext returns [EObject current=null] : (otherlv_0= '<' ( (lv_typeName_1_0= ruleConstructedType ) ) (otherlv_2= ',' ( (lv_typeName_3_0= ruleConstructedType ) ) )* otherlv_4= '>' ) ;
    public final EObject ruleTypeDeclContext() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_typeName_1_0 = null;

        EObject lv_typeName_3_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:1319:2: ( (otherlv_0= '<' ( (lv_typeName_1_0= ruleConstructedType ) ) (otherlv_2= ',' ( (lv_typeName_3_0= ruleConstructedType ) ) )* otherlv_4= '>' ) )
            // InternalBSharp.g:1320:2: (otherlv_0= '<' ( (lv_typeName_1_0= ruleConstructedType ) ) (otherlv_2= ',' ( (lv_typeName_3_0= ruleConstructedType ) ) )* otherlv_4= '>' )
            {
            // InternalBSharp.g:1320:2: (otherlv_0= '<' ( (lv_typeName_1_0= ruleConstructedType ) ) (otherlv_2= ',' ( (lv_typeName_3_0= ruleConstructedType ) ) )* otherlv_4= '>' )
            // InternalBSharp.g:1321:3: otherlv_0= '<' ( (lv_typeName_1_0= ruleConstructedType ) ) (otherlv_2= ',' ( (lv_typeName_3_0= ruleConstructedType ) ) )* otherlv_4= '>'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getTypeDeclContextAccess().getLessThanSignKeyword_0());
            		
            // InternalBSharp.g:1325:3: ( (lv_typeName_1_0= ruleConstructedType ) )
            // InternalBSharp.g:1326:4: (lv_typeName_1_0= ruleConstructedType )
            {
            // InternalBSharp.g:1326:4: (lv_typeName_1_0= ruleConstructedType )
            // InternalBSharp.g:1327:5: lv_typeName_1_0= ruleConstructedType
            {

            					newCompositeNode(grammarAccess.getTypeDeclContextAccess().getTypeNameConstructedTypeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_20);
            lv_typeName_1_0=ruleConstructedType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTypeDeclContextRule());
            					}
            					add(
            						current,
            						"typeName",
            						lv_typeName_1_0,
            						"ac.soton.bsharp.BSharp.ConstructedType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBSharp.g:1344:3: (otherlv_2= ',' ( (lv_typeName_3_0= ruleConstructedType ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==21) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalBSharp.g:1345:4: otherlv_2= ',' ( (lv_typeName_3_0= ruleConstructedType ) )
            	    {
            	    otherlv_2=(Token)match(input,21,FOLLOW_16); 

            	    				newLeafNode(otherlv_2, grammarAccess.getTypeDeclContextAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalBSharp.g:1349:4: ( (lv_typeName_3_0= ruleConstructedType ) )
            	    // InternalBSharp.g:1350:5: (lv_typeName_3_0= ruleConstructedType )
            	    {
            	    // InternalBSharp.g:1350:5: (lv_typeName_3_0= ruleConstructedType )
            	    // InternalBSharp.g:1351:6: lv_typeName_3_0= ruleConstructedType
            	    {

            	    						newCompositeNode(grammarAccess.getTypeDeclContextAccess().getTypeNameConstructedTypeParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_20);
            	    lv_typeName_3_0=ruleConstructedType();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTypeDeclContextRule());
            	    						}
            	    						add(
            	    							current,
            	    							"typeName",
            	    							lv_typeName_3_0,
            	    							"ac.soton.bsharp.BSharp.ConstructedType");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
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
    // InternalBSharp.g:1377:1: entryRuleTypeStructure returns [EObject current=null] : iv_ruleTypeStructure= ruleTypeStructure EOF ;
    public final EObject entryRuleTypeStructure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeStructure = null;


        try {
            // InternalBSharp.g:1377:54: (iv_ruleTypeStructure= ruleTypeStructure EOF )
            // InternalBSharp.g:1378:2: iv_ruleTypeStructure= ruleTypeStructure EOF
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
    // InternalBSharp.g:1384:1: ruleTypeStructure returns [EObject current=null] : (otherlv_0= '(' ( (lv_variables_1_0= ruleTypedVariableList ) ) otherlv_2= ')' ) ;
    public final EObject ruleTypeStructure() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_variables_1_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:1390:2: ( (otherlv_0= '(' ( (lv_variables_1_0= ruleTypedVariableList ) ) otherlv_2= ')' ) )
            // InternalBSharp.g:1391:2: (otherlv_0= '(' ( (lv_variables_1_0= ruleTypedVariableList ) ) otherlv_2= ')' )
            {
            // InternalBSharp.g:1391:2: (otherlv_0= '(' ( (lv_variables_1_0= ruleTypedVariableList ) ) otherlv_2= ')' )
            // InternalBSharp.g:1392:3: otherlv_0= '(' ( (lv_variables_1_0= ruleTypedVariableList ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTypeStructureAccess().getLeftParenthesisKeyword_0());
            		
            // InternalBSharp.g:1396:3: ( (lv_variables_1_0= ruleTypedVariableList ) )
            // InternalBSharp.g:1397:4: (lv_variables_1_0= ruleTypedVariableList )
            {
            // InternalBSharp.g:1397:4: (lv_variables_1_0= ruleTypedVariableList )
            // InternalBSharp.g:1398:5: lv_variables_1_0= ruleTypedVariableList
            {

            					newCompositeNode(grammarAccess.getTypeStructureAccess().getVariablesTypedVariableListParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_19);
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
    // InternalBSharp.g:1423:1: entryRuleWhere returns [EObject current=null] : iv_ruleWhere= ruleWhere EOF ;
    public final EObject entryRuleWhere() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhere = null;


        try {
            // InternalBSharp.g:1423:46: (iv_ruleWhere= ruleWhere EOF )
            // InternalBSharp.g:1424:2: iv_ruleWhere= ruleWhere EOF
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
    // InternalBSharp.g:1430:1: ruleWhere returns [EObject current=null] : (otherlv_0= 'where' ( (lv_expressions_1_0= ruleRootExpression ) ) (otherlv_2= ';' ( (lv_expressions_3_0= ruleRootExpression ) ) )* ) ;
    public final EObject ruleWhere() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_expressions_1_0 = null;

        EObject lv_expressions_3_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:1436:2: ( (otherlv_0= 'where' ( (lv_expressions_1_0= ruleRootExpression ) ) (otherlv_2= ';' ( (lv_expressions_3_0= ruleRootExpression ) ) )* ) )
            // InternalBSharp.g:1437:2: (otherlv_0= 'where' ( (lv_expressions_1_0= ruleRootExpression ) ) (otherlv_2= ';' ( (lv_expressions_3_0= ruleRootExpression ) ) )* )
            {
            // InternalBSharp.g:1437:2: (otherlv_0= 'where' ( (lv_expressions_1_0= ruleRootExpression ) ) (otherlv_2= ';' ( (lv_expressions_3_0= ruleRootExpression ) ) )* )
            // InternalBSharp.g:1438:3: otherlv_0= 'where' ( (lv_expressions_1_0= ruleRootExpression ) ) (otherlv_2= ';' ( (lv_expressions_3_0= ruleRootExpression ) ) )*
            {
            otherlv_0=(Token)match(input,34,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getWhereAccess().getWhereKeyword_0());
            		
            // InternalBSharp.g:1442:3: ( (lv_expressions_1_0= ruleRootExpression ) )
            // InternalBSharp.g:1443:4: (lv_expressions_1_0= ruleRootExpression )
            {
            // InternalBSharp.g:1443:4: (lv_expressions_1_0= ruleRootExpression )
            // InternalBSharp.g:1444:5: lv_expressions_1_0= ruleRootExpression
            {

            					newCompositeNode(grammarAccess.getWhereAccess().getExpressionsRootExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_22);
            lv_expressions_1_0=ruleRootExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWhereRule());
            					}
            					add(
            						current,
            						"expressions",
            						lv_expressions_1_0,
            						"ac.soton.bsharp.BSharp.RootExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBSharp.g:1461:3: (otherlv_2= ';' ( (lv_expressions_3_0= ruleRootExpression ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==18) ) {
                    int LA27_1 = input.LA(2);

                    if ( (LA27_1==RULE_ID||LA27_1==32||LA27_1==41||(LA27_1>=43 && LA27_1<=45)||LA27_1==47) ) {
                        alt27=1;
                    }


                }


                switch (alt27) {
            	case 1 :
            	    // InternalBSharp.g:1462:4: otherlv_2= ';' ( (lv_expressions_3_0= ruleRootExpression ) )
            	    {
            	    otherlv_2=(Token)match(input,18,FOLLOW_21); 

            	    				newLeafNode(otherlv_2, grammarAccess.getWhereAccess().getSemicolonKeyword_2_0());
            	    			
            	    // InternalBSharp.g:1466:4: ( (lv_expressions_3_0= ruleRootExpression ) )
            	    // InternalBSharp.g:1467:5: (lv_expressions_3_0= ruleRootExpression )
            	    {
            	    // InternalBSharp.g:1467:5: (lv_expressions_3_0= ruleRootExpression )
            	    // InternalBSharp.g:1468:6: lv_expressions_3_0= ruleRootExpression
            	    {

            	    						newCompositeNode(grammarAccess.getWhereAccess().getExpressionsRootExpressionParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_22);
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
            	    break loop27;
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
    // InternalBSharp.g:1490:1: entryRuleDatatype returns [EObject current=null] : iv_ruleDatatype= ruleDatatype EOF ;
    public final EObject entryRuleDatatype() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatatype = null;


        try {
            // InternalBSharp.g:1490:49: (iv_ruleDatatype= ruleDatatype EOF )
            // InternalBSharp.g:1491:2: iv_ruleDatatype= ruleDatatype EOF
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
    // InternalBSharp.g:1497:1: ruleDatatype returns [EObject current=null] : (otherlv_0= 'Datatype' ( (lv_name_1_0= RULE_ID ) ) ( (lv_context_2_0= rulePolyContext ) )? (otherlv_3= '|' ( (lv_constructors_4_0= ruleDatatypeConstructor ) ) )+ ( (lv_block_5_0= ruleBSharpBlock ) ) ) ;
    public final EObject ruleDatatype() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        EObject lv_context_2_0 = null;

        EObject lv_constructors_4_0 = null;

        EObject lv_block_5_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:1503:2: ( (otherlv_0= 'Datatype' ( (lv_name_1_0= RULE_ID ) ) ( (lv_context_2_0= rulePolyContext ) )? (otherlv_3= '|' ( (lv_constructors_4_0= ruleDatatypeConstructor ) ) )+ ( (lv_block_5_0= ruleBSharpBlock ) ) ) )
            // InternalBSharp.g:1504:2: (otherlv_0= 'Datatype' ( (lv_name_1_0= RULE_ID ) ) ( (lv_context_2_0= rulePolyContext ) )? (otherlv_3= '|' ( (lv_constructors_4_0= ruleDatatypeConstructor ) ) )+ ( (lv_block_5_0= ruleBSharpBlock ) ) )
            {
            // InternalBSharp.g:1504:2: (otherlv_0= 'Datatype' ( (lv_name_1_0= RULE_ID ) ) ( (lv_context_2_0= rulePolyContext ) )? (otherlv_3= '|' ( (lv_constructors_4_0= ruleDatatypeConstructor ) ) )+ ( (lv_block_5_0= ruleBSharpBlock ) ) )
            // InternalBSharp.g:1505:3: otherlv_0= 'Datatype' ( (lv_name_1_0= RULE_ID ) ) ( (lv_context_2_0= rulePolyContext ) )? (otherlv_3= '|' ( (lv_constructors_4_0= ruleDatatypeConstructor ) ) )+ ( (lv_block_5_0= ruleBSharpBlock ) )
            {
            otherlv_0=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDatatypeAccess().getDatatypeKeyword_0());
            		
            // InternalBSharp.g:1509:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalBSharp.g:1510:4: (lv_name_1_0= RULE_ID )
            {
            // InternalBSharp.g:1510:4: (lv_name_1_0= RULE_ID )
            // InternalBSharp.g:1511:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDatatypeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDatatypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"ac.soton.bsharp.BSharp.ID");
            				

            }


            }

            // InternalBSharp.g:1527:3: ( (lv_context_2_0= rulePolyContext ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==19) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalBSharp.g:1528:4: (lv_context_2_0= rulePolyContext )
                    {
                    // InternalBSharp.g:1528:4: (lv_context_2_0= rulePolyContext )
                    // InternalBSharp.g:1529:5: lv_context_2_0= rulePolyContext
                    {

                    					newCompositeNode(grammarAccess.getDatatypeAccess().getContextPolyContextParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_24);
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

            // InternalBSharp.g:1546:3: (otherlv_3= '|' ( (lv_constructors_4_0= ruleDatatypeConstructor ) ) )+
            int cnt29=0;
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==36) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalBSharp.g:1547:4: otherlv_3= '|' ( (lv_constructors_4_0= ruleDatatypeConstructor ) )
            	    {
            	    otherlv_3=(Token)match(input,36,FOLLOW_3); 

            	    				newLeafNode(otherlv_3, grammarAccess.getDatatypeAccess().getVerticalLineKeyword_3_0());
            	    			
            	    // InternalBSharp.g:1551:4: ( (lv_constructors_4_0= ruleDatatypeConstructor ) )
            	    // InternalBSharp.g:1552:5: (lv_constructors_4_0= ruleDatatypeConstructor )
            	    {
            	    // InternalBSharp.g:1552:5: (lv_constructors_4_0= ruleDatatypeConstructor )
            	    // InternalBSharp.g:1553:6: lv_constructors_4_0= ruleDatatypeConstructor
            	    {

            	    						newCompositeNode(grammarAccess.getDatatypeAccess().getConstructorsDatatypeConstructorParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_25);
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
            	    if ( cnt29 >= 1 ) break loop29;
                        EarlyExitException eee =
                            new EarlyExitException(29, input);
                        throw eee;
                }
                cnt29++;
            } while (true);

            // InternalBSharp.g:1571:3: ( (lv_block_5_0= ruleBSharpBlock ) )
            // InternalBSharp.g:1572:4: (lv_block_5_0= ruleBSharpBlock )
            {
            // InternalBSharp.g:1572:4: (lv_block_5_0= ruleBSharpBlock )
            // InternalBSharp.g:1573:5: lv_block_5_0= ruleBSharpBlock
            {

            					newCompositeNode(grammarAccess.getDatatypeAccess().getBlockBSharpBlockParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_block_5_0=ruleBSharpBlock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDatatypeRule());
            					}
            					set(
            						current,
            						"block",
            						lv_block_5_0,
            						"ac.soton.bsharp.BSharp.BSharpBlock");
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
    // $ANTLR end "ruleDatatype"


    // $ANTLR start "entryRuleDatatypeConstructor"
    // InternalBSharp.g:1594:1: entryRuleDatatypeConstructor returns [EObject current=null] : iv_ruleDatatypeConstructor= ruleDatatypeConstructor EOF ;
    public final EObject entryRuleDatatypeConstructor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatatypeConstructor = null;


        try {
            // InternalBSharp.g:1594:60: (iv_ruleDatatypeConstructor= ruleDatatypeConstructor EOF )
            // InternalBSharp.g:1595:2: iv_ruleDatatypeConstructor= ruleDatatypeConstructor EOF
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
    // InternalBSharp.g:1601:1: ruleDatatypeConstructor returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_decons_2_0= ruleTypedVariableList ) ) otherlv_3= ')' )? ) ;
    public final EObject ruleDatatypeConstructor() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_decons_2_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:1607:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_decons_2_0= ruleTypedVariableList ) ) otherlv_3= ')' )? ) )
            // InternalBSharp.g:1608:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_decons_2_0= ruleTypedVariableList ) ) otherlv_3= ')' )? )
            {
            // InternalBSharp.g:1608:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_decons_2_0= ruleTypedVariableList ) ) otherlv_3= ')' )? )
            // InternalBSharp.g:1609:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_decons_2_0= ruleTypedVariableList ) ) otherlv_3= ')' )?
            {
            // InternalBSharp.g:1609:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalBSharp.g:1610:4: (lv_name_0_0= RULE_ID )
            {
            // InternalBSharp.g:1610:4: (lv_name_0_0= RULE_ID )
            // InternalBSharp.g:1611:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_26); 

            					newLeafNode(lv_name_0_0, grammarAccess.getDatatypeConstructorAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDatatypeConstructorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"ac.soton.bsharp.BSharp.ID");
            				

            }


            }

            // InternalBSharp.g:1627:3: (otherlv_1= '(' ( (lv_decons_2_0= ruleTypedVariableList ) ) otherlv_3= ')' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==32) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalBSharp.g:1628:4: otherlv_1= '(' ( (lv_decons_2_0= ruleTypedVariableList ) ) otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,32,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getDatatypeConstructorAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalBSharp.g:1632:4: ( (lv_decons_2_0= ruleTypedVariableList ) )
                    // InternalBSharp.g:1633:5: (lv_decons_2_0= ruleTypedVariableList )
                    {
                    // InternalBSharp.g:1633:5: (lv_decons_2_0= ruleTypedVariableList )
                    // InternalBSharp.g:1634:6: lv_decons_2_0= ruleTypedVariableList
                    {

                    						newCompositeNode(grammarAccess.getDatatypeConstructorAccess().getDeconsTypedVariableListParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_19);
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
    // InternalBSharp.g:1660:1: entryRuleExtend returns [EObject current=null] : iv_ruleExtend= ruleExtend EOF ;
    public final EObject entryRuleExtend() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtend = null;


        try {
            // InternalBSharp.g:1660:47: (iv_ruleExtend= ruleExtend EOF )
            // InternalBSharp.g:1661:2: iv_ruleExtend= ruleExtend EOF
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
    // InternalBSharp.g:1667:1: ruleExtend returns [EObject current=null] : (otherlv_0= 'Extend' ( ( ruleQualifiedName ) ) otherlv_2= '(' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ')' ( (lv_block_5_0= ruleBSharpBlock ) ) ) ;
    public final EObject ruleExtend() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        EObject lv_block_5_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:1673:2: ( (otherlv_0= 'Extend' ( ( ruleQualifiedName ) ) otherlv_2= '(' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ')' ( (lv_block_5_0= ruleBSharpBlock ) ) ) )
            // InternalBSharp.g:1674:2: (otherlv_0= 'Extend' ( ( ruleQualifiedName ) ) otherlv_2= '(' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ')' ( (lv_block_5_0= ruleBSharpBlock ) ) )
            {
            // InternalBSharp.g:1674:2: (otherlv_0= 'Extend' ( ( ruleQualifiedName ) ) otherlv_2= '(' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ')' ( (lv_block_5_0= ruleBSharpBlock ) ) )
            // InternalBSharp.g:1675:3: otherlv_0= 'Extend' ( ( ruleQualifiedName ) ) otherlv_2= '(' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ')' ( (lv_block_5_0= ruleBSharpBlock ) )
            {
            otherlv_0=(Token)match(input,37,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getExtendAccess().getExtendKeyword_0());
            		
            // InternalBSharp.g:1679:3: ( ( ruleQualifiedName ) )
            // InternalBSharp.g:1680:4: ( ruleQualifiedName )
            {
            // InternalBSharp.g:1680:4: ( ruleQualifiedName )
            // InternalBSharp.g:1681:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExtendRule());
            					}
            				

            					newCompositeNode(grammarAccess.getExtendAccess().getExtendedClassClassDeclCrossReference_1_0());
            				
            pushFollow(FOLLOW_27);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,32,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getExtendAccess().getLeftParenthesisKeyword_2());
            		
            // InternalBSharp.g:1699:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalBSharp.g:1700:4: (lv_name_3_0= RULE_ID )
            {
            // InternalBSharp.g:1700:4: (lv_name_3_0= RULE_ID )
            // InternalBSharp.g:1701:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_19); 

            					newLeafNode(lv_name_3_0, grammarAccess.getExtendAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExtendRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"ac.soton.bsharp.BSharp.ID");
            				

            }


            }

            otherlv_4=(Token)match(input,33,FOLLOW_12); 

            			newLeafNode(otherlv_4, grammarAccess.getExtendAccess().getRightParenthesisKeyword_4());
            		
            // InternalBSharp.g:1721:3: ( (lv_block_5_0= ruleBSharpBlock ) )
            // InternalBSharp.g:1722:4: (lv_block_5_0= ruleBSharpBlock )
            {
            // InternalBSharp.g:1722:4: (lv_block_5_0= ruleBSharpBlock )
            // InternalBSharp.g:1723:5: lv_block_5_0= ruleBSharpBlock
            {

            					newCompositeNode(grammarAccess.getExtendAccess().getBlockBSharpBlockParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_block_5_0=ruleBSharpBlock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExtendRule());
            					}
            					set(
            						current,
            						"block",
            						lv_block_5_0,
            						"ac.soton.bsharp.BSharp.BSharpBlock");
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
    // $ANTLR end "ruleExtend"


    // $ANTLR start "entryRuleBSharpBlock"
    // InternalBSharp.g:1744:1: entryRuleBSharpBlock returns [EObject current=null] : iv_ruleBSharpBlock= ruleBSharpBlock EOF ;
    public final EObject entryRuleBSharpBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBSharpBlock = null;


        try {
            // InternalBSharp.g:1744:52: (iv_ruleBSharpBlock= ruleBSharpBlock EOF )
            // InternalBSharp.g:1745:2: iv_ruleBSharpBlock= ruleBSharpBlock EOF
            {
             newCompositeNode(grammarAccess.getBSharpBlockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBSharpBlock=ruleBSharpBlock();

            state._fsp--;

             current =iv_ruleBSharpBlock; 
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
    // $ANTLR end "entryRuleBSharpBlock"


    // $ANTLR start "ruleBSharpBlock"
    // InternalBSharp.g:1751:1: ruleBSharpBlock returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_bodyElements_2_0= ruleTypeBodyElements ) )* otherlv_3= '}' ) ;
    public final EObject ruleBSharpBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_bodyElements_2_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:1757:2: ( ( () otherlv_1= '{' ( (lv_bodyElements_2_0= ruleTypeBodyElements ) )* otherlv_3= '}' ) )
            // InternalBSharp.g:1758:2: ( () otherlv_1= '{' ( (lv_bodyElements_2_0= ruleTypeBodyElements ) )* otherlv_3= '}' )
            {
            // InternalBSharp.g:1758:2: ( () otherlv_1= '{' ( (lv_bodyElements_2_0= ruleTypeBodyElements ) )* otherlv_3= '}' )
            // InternalBSharp.g:1759:3: () otherlv_1= '{' ( (lv_bodyElements_2_0= ruleTypeBodyElements ) )* otherlv_3= '}'
            {
            // InternalBSharp.g:1759:3: ()
            // InternalBSharp.g:1760:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBSharpBlockAccess().getBSharpBlockAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,38,FOLLOW_28); 

            			newLeafNode(otherlv_1, grammarAccess.getBSharpBlockAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalBSharp.g:1770:3: ( (lv_bodyElements_2_0= ruleTypeBodyElements ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_ID||LA31_0==42) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalBSharp.g:1771:4: (lv_bodyElements_2_0= ruleTypeBodyElements )
            	    {
            	    // InternalBSharp.g:1771:4: (lv_bodyElements_2_0= ruleTypeBodyElements )
            	    // InternalBSharp.g:1772:5: lv_bodyElements_2_0= ruleTypeBodyElements
            	    {

            	    					newCompositeNode(grammarAccess.getBSharpBlockAccess().getBodyElementsTypeBodyElementsParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_28);
            	    lv_bodyElements_2_0=ruleTypeBodyElements();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getBSharpBlockRule());
            	    					}
            	    					add(
            	    						current,
            	    						"bodyElements",
            	    						lv_bodyElements_2_0,
            	    						"ac.soton.bsharp.BSharp.TypeBodyElements");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            otherlv_3=(Token)match(input,39,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getBSharpBlockAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleBSharpBlock"


    // $ANTLR start "entryRuleTypeBodyElements"
    // InternalBSharp.g:1797:1: entryRuleTypeBodyElements returns [EObject current=null] : iv_ruleTypeBodyElements= ruleTypeBodyElements EOF ;
    public final EObject entryRuleTypeBodyElements() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeBodyElements = null;


        try {
            // InternalBSharp.g:1797:57: (iv_ruleTypeBodyElements= ruleTypeBodyElements EOF )
            // InternalBSharp.g:1798:2: iv_ruleTypeBodyElements= ruleTypeBodyElements EOF
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
    // InternalBSharp.g:1804:1: ruleTypeBodyElements returns [EObject current=null] : ( ( (lv_functions_0_0= ruleFunctionDecl ) ) | ( (lv_theorems_1_0= ruleTheoremBody ) ) ) ;
    public final EObject ruleTypeBodyElements() throws RecognitionException {
        EObject current = null;

        EObject lv_functions_0_0 = null;

        EObject lv_theorems_1_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:1810:2: ( ( ( (lv_functions_0_0= ruleFunctionDecl ) ) | ( (lv_theorems_1_0= ruleTheoremBody ) ) ) )
            // InternalBSharp.g:1811:2: ( ( (lv_functions_0_0= ruleFunctionDecl ) ) | ( (lv_theorems_1_0= ruleTheoremBody ) ) )
            {
            // InternalBSharp.g:1811:2: ( ( (lv_functions_0_0= ruleFunctionDecl ) ) | ( (lv_theorems_1_0= ruleTheoremBody ) ) )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_ID) ) {
                alt32=1;
            }
            else if ( (LA32_0==42) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // InternalBSharp.g:1812:3: ( (lv_functions_0_0= ruleFunctionDecl ) )
                    {
                    // InternalBSharp.g:1812:3: ( (lv_functions_0_0= ruleFunctionDecl ) )
                    // InternalBSharp.g:1813:4: (lv_functions_0_0= ruleFunctionDecl )
                    {
                    // InternalBSharp.g:1813:4: (lv_functions_0_0= ruleFunctionDecl )
                    // InternalBSharp.g:1814:5: lv_functions_0_0= ruleFunctionDecl
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
                    // InternalBSharp.g:1832:3: ( (lv_theorems_1_0= ruleTheoremBody ) )
                    {
                    // InternalBSharp.g:1832:3: ( (lv_theorems_1_0= ruleTheoremBody ) )
                    // InternalBSharp.g:1833:4: (lv_theorems_1_0= ruleTheoremBody )
                    {
                    // InternalBSharp.g:1833:4: (lv_theorems_1_0= ruleTheoremBody )
                    // InternalBSharp.g:1834:5: lv_theorems_1_0= ruleTheoremBody
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
    // InternalBSharp.g:1855:1: entryRuleFunctionDecl returns [EObject current=null] : iv_ruleFunctionDecl= ruleFunctionDecl EOF ;
    public final EObject entryRuleFunctionDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionDecl = null;


        try {
            // InternalBSharp.g:1855:53: (iv_ruleFunctionDecl= ruleFunctionDecl EOF )
            // InternalBSharp.g:1856:2: iv_ruleFunctionDecl= ruleFunctionDecl EOF
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
    // InternalBSharp.g:1862:1: ruleFunctionDecl returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_context_1_0= rulePolyContext ) )? otherlv_2= '(' ( (lv_varList_3_0= ruleTypedVariableList ) )? otherlv_4= ')' otherlv_5= ':' ( (lv_returnType_6_0= ruleTypeConstructor ) ) ( (lv_infix_7_0= 'INFIX' ) )? ( (lv_precedence_8_0= RULE_INT ) )? ( (lv_expr_9_0= ruleRootExpression ) ) ) ;
    public final EObject ruleFunctionDecl() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_infix_7_0=null;
        Token lv_precedence_8_0=null;
        EObject lv_context_1_0 = null;

        EObject lv_varList_3_0 = null;

        EObject lv_returnType_6_0 = null;

        EObject lv_expr_9_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:1868:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_context_1_0= rulePolyContext ) )? otherlv_2= '(' ( (lv_varList_3_0= ruleTypedVariableList ) )? otherlv_4= ')' otherlv_5= ':' ( (lv_returnType_6_0= ruleTypeConstructor ) ) ( (lv_infix_7_0= 'INFIX' ) )? ( (lv_precedence_8_0= RULE_INT ) )? ( (lv_expr_9_0= ruleRootExpression ) ) ) )
            // InternalBSharp.g:1869:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_context_1_0= rulePolyContext ) )? otherlv_2= '(' ( (lv_varList_3_0= ruleTypedVariableList ) )? otherlv_4= ')' otherlv_5= ':' ( (lv_returnType_6_0= ruleTypeConstructor ) ) ( (lv_infix_7_0= 'INFIX' ) )? ( (lv_precedence_8_0= RULE_INT ) )? ( (lv_expr_9_0= ruleRootExpression ) ) )
            {
            // InternalBSharp.g:1869:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_context_1_0= rulePolyContext ) )? otherlv_2= '(' ( (lv_varList_3_0= ruleTypedVariableList ) )? otherlv_4= ')' otherlv_5= ':' ( (lv_returnType_6_0= ruleTypeConstructor ) ) ( (lv_infix_7_0= 'INFIX' ) )? ( (lv_precedence_8_0= RULE_INT ) )? ( (lv_expr_9_0= ruleRootExpression ) ) )
            // InternalBSharp.g:1870:3: ( (lv_name_0_0= RULE_ID ) ) ( (lv_context_1_0= rulePolyContext ) )? otherlv_2= '(' ( (lv_varList_3_0= ruleTypedVariableList ) )? otherlv_4= ')' otherlv_5= ':' ( (lv_returnType_6_0= ruleTypeConstructor ) ) ( (lv_infix_7_0= 'INFIX' ) )? ( (lv_precedence_8_0= RULE_INT ) )? ( (lv_expr_9_0= ruleRootExpression ) )
            {
            // InternalBSharp.g:1870:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalBSharp.g:1871:4: (lv_name_0_0= RULE_ID )
            {
            // InternalBSharp.g:1871:4: (lv_name_0_0= RULE_ID )
            // InternalBSharp.g:1872:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_29); 

            					newLeafNode(lv_name_0_0, grammarAccess.getFunctionDeclAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFunctionDeclRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"ac.soton.bsharp.BSharp.ID");
            				

            }


            }

            // InternalBSharp.g:1888:3: ( (lv_context_1_0= rulePolyContext ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==19) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalBSharp.g:1889:4: (lv_context_1_0= rulePolyContext )
                    {
                    // InternalBSharp.g:1889:4: (lv_context_1_0= rulePolyContext )
                    // InternalBSharp.g:1890:5: lv_context_1_0= rulePolyContext
                    {

                    					newCompositeNode(grammarAccess.getFunctionDeclAccess().getContextPolyContextParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_27);
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

            otherlv_2=(Token)match(input,32,FOLLOW_30); 

            			newLeafNode(otherlv_2, grammarAccess.getFunctionDeclAccess().getLeftParenthesisKeyword_2());
            		
            // InternalBSharp.g:1911:3: ( (lv_varList_3_0= ruleTypedVariableList ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_ID) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalBSharp.g:1912:4: (lv_varList_3_0= ruleTypedVariableList )
                    {
                    // InternalBSharp.g:1912:4: (lv_varList_3_0= ruleTypedVariableList )
                    // InternalBSharp.g:1913:5: lv_varList_3_0= ruleTypedVariableList
                    {

                    					newCompositeNode(grammarAccess.getFunctionDeclAccess().getVarListTypedVariableListParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_19);
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

            otherlv_4=(Token)match(input,33,FOLLOW_31); 

            			newLeafNode(otherlv_4, grammarAccess.getFunctionDeclAccess().getRightParenthesisKeyword_4());
            		
            otherlv_5=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getFunctionDeclAccess().getColonKeyword_5());
            		
            // InternalBSharp.g:1938:3: ( (lv_returnType_6_0= ruleTypeConstructor ) )
            // InternalBSharp.g:1939:4: (lv_returnType_6_0= ruleTypeConstructor )
            {
            // InternalBSharp.g:1939:4: (lv_returnType_6_0= ruleTypeConstructor )
            // InternalBSharp.g:1940:5: lv_returnType_6_0= ruleTypeConstructor
            {

            					newCompositeNode(grammarAccess.getFunctionDeclAccess().getReturnTypeTypeConstructorParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_32);
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

            // InternalBSharp.g:1957:3: ( (lv_infix_7_0= 'INFIX' ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==40) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalBSharp.g:1958:4: (lv_infix_7_0= 'INFIX' )
                    {
                    // InternalBSharp.g:1958:4: (lv_infix_7_0= 'INFIX' )
                    // InternalBSharp.g:1959:5: lv_infix_7_0= 'INFIX'
                    {
                    lv_infix_7_0=(Token)match(input,40,FOLLOW_33); 

                    					newLeafNode(lv_infix_7_0, grammarAccess.getFunctionDeclAccess().getInfixINFIXKeyword_7_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFunctionDeclRule());
                    					}
                    					setWithLastConsumed(current, "infix", lv_infix_7_0, "INFIX");
                    				

                    }


                    }
                    break;

            }

            // InternalBSharp.g:1971:3: ( (lv_precedence_8_0= RULE_INT ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_INT) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalBSharp.g:1972:4: (lv_precedence_8_0= RULE_INT )
                    {
                    // InternalBSharp.g:1972:4: (lv_precedence_8_0= RULE_INT )
                    // InternalBSharp.g:1973:5: lv_precedence_8_0= RULE_INT
                    {
                    lv_precedence_8_0=(Token)match(input,RULE_INT,FOLLOW_21); 

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

            // InternalBSharp.g:1989:3: ( (lv_expr_9_0= ruleRootExpression ) )
            // InternalBSharp.g:1990:4: (lv_expr_9_0= ruleRootExpression )
            {
            // InternalBSharp.g:1990:4: (lv_expr_9_0= ruleRootExpression )
            // InternalBSharp.g:1991:5: lv_expr_9_0= ruleRootExpression
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


    // $ANTLR start "entryRuleMatchStatement"
    // InternalBSharp.g:2012:1: entryRuleMatchStatement returns [EObject current=null] : iv_ruleMatchStatement= ruleMatchStatement EOF ;
    public final EObject entryRuleMatchStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMatchStatement = null;


        try {
            // InternalBSharp.g:2012:55: (iv_ruleMatchStatement= ruleMatchStatement EOF )
            // InternalBSharp.g:2013:2: iv_ruleMatchStatement= ruleMatchStatement EOF
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
    // InternalBSharp.g:2019:1: ruleMatchStatement returns [EObject current=null] : (otherlv_0= 'match' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' ( (lv_inductCase_3_0= ruleMatchCase ) ) ( (lv_inductCase_4_0= ruleMatchCase ) )* otherlv_5= '}' ) ;
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
            // InternalBSharp.g:2025:2: ( (otherlv_0= 'match' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' ( (lv_inductCase_3_0= ruleMatchCase ) ) ( (lv_inductCase_4_0= ruleMatchCase ) )* otherlv_5= '}' ) )
            // InternalBSharp.g:2026:2: (otherlv_0= 'match' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' ( (lv_inductCase_3_0= ruleMatchCase ) ) ( (lv_inductCase_4_0= ruleMatchCase ) )* otherlv_5= '}' )
            {
            // InternalBSharp.g:2026:2: (otherlv_0= 'match' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' ( (lv_inductCase_3_0= ruleMatchCase ) ) ( (lv_inductCase_4_0= ruleMatchCase ) )* otherlv_5= '}' )
            // InternalBSharp.g:2027:3: otherlv_0= 'match' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' ( (lv_inductCase_3_0= ruleMatchCase ) ) ( (lv_inductCase_4_0= ruleMatchCase ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMatchStatementAccess().getMatchKeyword_0());
            		
            // InternalBSharp.g:2031:3: ( (otherlv_1= RULE_ID ) )
            // InternalBSharp.g:2032:4: (otherlv_1= RULE_ID )
            {
            // InternalBSharp.g:2032:4: (otherlv_1= RULE_ID )
            // InternalBSharp.g:2033:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMatchStatementRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_34); 

            					newLeafNode(otherlv_1, grammarAccess.getMatchStatementAccess().getMatchDatatypeConstructorCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,38,FOLLOW_24); 

            			newLeafNode(otherlv_2, grammarAccess.getMatchStatementAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalBSharp.g:2048:3: ( (lv_inductCase_3_0= ruleMatchCase ) )
            // InternalBSharp.g:2049:4: (lv_inductCase_3_0= ruleMatchCase )
            {
            // InternalBSharp.g:2049:4: (lv_inductCase_3_0= ruleMatchCase )
            // InternalBSharp.g:2050:5: lv_inductCase_3_0= ruleMatchCase
            {

            					newCompositeNode(grammarAccess.getMatchStatementAccess().getInductCaseMatchCaseParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_35);
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

            // InternalBSharp.g:2067:3: ( (lv_inductCase_4_0= ruleMatchCase ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==36) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalBSharp.g:2068:4: (lv_inductCase_4_0= ruleMatchCase )
            	    {
            	    // InternalBSharp.g:2068:4: (lv_inductCase_4_0= ruleMatchCase )
            	    // InternalBSharp.g:2069:5: lv_inductCase_4_0= ruleMatchCase
            	    {

            	    					newCompositeNode(grammarAccess.getMatchStatementAccess().getInductCaseMatchCaseParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_35);
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
            	    break loop37;
                }
            } while (true);

            otherlv_5=(Token)match(input,39,FOLLOW_2); 

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
    // InternalBSharp.g:2094:1: entryRuleMatchCase returns [EObject current=null] : iv_ruleMatchCase= ruleMatchCase EOF ;
    public final EObject entryRuleMatchCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMatchCase = null;


        try {
            // InternalBSharp.g:2094:50: (iv_ruleMatchCase= ruleMatchCase EOF )
            // InternalBSharp.g:2095:2: iv_ruleMatchCase= ruleMatchCase EOF
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
    // InternalBSharp.g:2101:1: ruleMatchCase returns [EObject current=null] : (otherlv_0= '|' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( (lv_variables_3_0= ruleTypedVariable ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleTypedVariable ) ) )* otherlv_6= ')' )? otherlv_7= ':' ( (lv_expr_8_0= ruleRootExpression ) ) ) ;
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
            // InternalBSharp.g:2107:2: ( (otherlv_0= '|' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( (lv_variables_3_0= ruleTypedVariable ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleTypedVariable ) ) )* otherlv_6= ')' )? otherlv_7= ':' ( (lv_expr_8_0= ruleRootExpression ) ) ) )
            // InternalBSharp.g:2108:2: (otherlv_0= '|' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( (lv_variables_3_0= ruleTypedVariable ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleTypedVariable ) ) )* otherlv_6= ')' )? otherlv_7= ':' ( (lv_expr_8_0= ruleRootExpression ) ) )
            {
            // InternalBSharp.g:2108:2: (otherlv_0= '|' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( (lv_variables_3_0= ruleTypedVariable ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleTypedVariable ) ) )* otherlv_6= ')' )? otherlv_7= ':' ( (lv_expr_8_0= ruleRootExpression ) ) )
            // InternalBSharp.g:2109:3: otherlv_0= '|' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( (lv_variables_3_0= ruleTypedVariable ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleTypedVariable ) ) )* otherlv_6= ')' )? otherlv_7= ':' ( (lv_expr_8_0= ruleRootExpression ) )
            {
            otherlv_0=(Token)match(input,36,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMatchCaseAccess().getVerticalLineKeyword_0());
            		
            // InternalBSharp.g:2113:3: ( (otherlv_1= RULE_ID ) )
            // InternalBSharp.g:2114:4: (otherlv_1= RULE_ID )
            {
            // InternalBSharp.g:2114:4: (otherlv_1= RULE_ID )
            // InternalBSharp.g:2115:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMatchCaseRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_36); 

            					newLeafNode(otherlv_1, grammarAccess.getMatchCaseAccess().getDeconNameTypedVariableCrossReference_1_0());
            				

            }


            }

            // InternalBSharp.g:2126:3: (otherlv_2= '(' ( (lv_variables_3_0= ruleTypedVariable ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleTypedVariable ) ) )* otherlv_6= ')' )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==32) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalBSharp.g:2127:4: otherlv_2= '(' ( (lv_variables_3_0= ruleTypedVariable ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleTypedVariable ) ) )* otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,32,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getMatchCaseAccess().getLeftParenthesisKeyword_2_0());
                    			
                    // InternalBSharp.g:2131:4: ( (lv_variables_3_0= ruleTypedVariable ) )
                    // InternalBSharp.g:2132:5: (lv_variables_3_0= ruleTypedVariable )
                    {
                    // InternalBSharp.g:2132:5: (lv_variables_3_0= ruleTypedVariable )
                    // InternalBSharp.g:2133:6: lv_variables_3_0= ruleTypedVariable
                    {

                    						newCompositeNode(grammarAccess.getMatchCaseAccess().getVariablesTypedVariableParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_37);
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

                    // InternalBSharp.g:2150:4: (otherlv_4= ',' ( (lv_variables_5_0= ruleTypedVariable ) ) )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==21) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // InternalBSharp.g:2151:5: otherlv_4= ',' ( (lv_variables_5_0= ruleTypedVariable ) )
                    	    {
                    	    otherlv_4=(Token)match(input,21,FOLLOW_3); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getMatchCaseAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalBSharp.g:2155:5: ( (lv_variables_5_0= ruleTypedVariable ) )
                    	    // InternalBSharp.g:2156:6: (lv_variables_5_0= ruleTypedVariable )
                    	    {
                    	    // InternalBSharp.g:2156:6: (lv_variables_5_0= ruleTypedVariable )
                    	    // InternalBSharp.g:2157:7: lv_variables_5_0= ruleTypedVariable
                    	    {

                    	    							newCompositeNode(grammarAccess.getMatchCaseAccess().getVariablesTypedVariableParserRuleCall_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_37);
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
                    	    break loop38;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,33,FOLLOW_31); 

                    				newLeafNode(otherlv_6, grammarAccess.getMatchCaseAccess().getRightParenthesisKeyword_2_3());
                    			

                    }
                    break;

            }

            otherlv_7=(Token)match(input,12,FOLLOW_21); 

            			newLeafNode(otherlv_7, grammarAccess.getMatchCaseAccess().getColonKeyword_3());
            		
            // InternalBSharp.g:2184:3: ( (lv_expr_8_0= ruleRootExpression ) )
            // InternalBSharp.g:2185:4: (lv_expr_8_0= ruleRootExpression )
            {
            // InternalBSharp.g:2185:4: (lv_expr_8_0= ruleRootExpression )
            // InternalBSharp.g:2186:5: lv_expr_8_0= ruleRootExpression
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
    // InternalBSharp.g:2207:1: entryRuleTheoremBody returns [EObject current=null] : iv_ruleTheoremBody= ruleTheoremBody EOF ;
    public final EObject entryRuleTheoremBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTheoremBody = null;


        try {
            // InternalBSharp.g:2207:52: (iv_ruleTheoremBody= ruleTheoremBody EOF )
            // InternalBSharp.g:2208:2: iv_ruleTheoremBody= ruleTheoremBody EOF
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
    // InternalBSharp.g:2214:1: ruleTheoremBody returns [EObject current=null] : (otherlv_0= 'Theorems' otherlv_1= '{' ( (lv_theoremDecl_2_0= ruleTheoremDecl ) )+ otherlv_3= '}' ) ;
    public final EObject ruleTheoremBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_theoremDecl_2_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:2220:2: ( (otherlv_0= 'Theorems' otherlv_1= '{' ( (lv_theoremDecl_2_0= ruleTheoremDecl ) )+ otherlv_3= '}' ) )
            // InternalBSharp.g:2221:2: (otherlv_0= 'Theorems' otherlv_1= '{' ( (lv_theoremDecl_2_0= ruleTheoremDecl ) )+ otherlv_3= '}' )
            {
            // InternalBSharp.g:2221:2: (otherlv_0= 'Theorems' otherlv_1= '{' ( (lv_theoremDecl_2_0= ruleTheoremDecl ) )+ otherlv_3= '}' )
            // InternalBSharp.g:2222:3: otherlv_0= 'Theorems' otherlv_1= '{' ( (lv_theoremDecl_2_0= ruleTheoremDecl ) )+ otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_34); 

            			newLeafNode(otherlv_0, grammarAccess.getTheoremBodyAccess().getTheoremsKeyword_0());
            		
            otherlv_1=(Token)match(input,38,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getTheoremBodyAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalBSharp.g:2230:3: ( (lv_theoremDecl_2_0= ruleTheoremDecl ) )+
            int cnt40=0;
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( ((LA40_0>=RULE_INT && LA40_0<=RULE_WS)||LA40_0==12) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalBSharp.g:2231:4: (lv_theoremDecl_2_0= ruleTheoremDecl )
            	    {
            	    // InternalBSharp.g:2231:4: (lv_theoremDecl_2_0= ruleTheoremDecl )
            	    // InternalBSharp.g:2232:5: lv_theoremDecl_2_0= ruleTheoremDecl
            	    {

            	    					newCompositeNode(grammarAccess.getTheoremBodyAccess().getTheoremDeclTheoremDeclParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_38);
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
            	    if ( cnt40 >= 1 ) break loop40;
                        EarlyExitException eee =
                            new EarlyExitException(40, input);
                        throw eee;
                }
                cnt40++;
            } while (true);

            otherlv_3=(Token)match(input,39,FOLLOW_2); 

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
    // InternalBSharp.g:2257:1: entryRuleTheoremDecl returns [EObject current=null] : iv_ruleTheoremDecl= ruleTheoremDecl EOF ;
    public final EObject entryRuleTheoremDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTheoremDecl = null;


        try {
            // InternalBSharp.g:2257:52: (iv_ruleTheoremDecl= ruleTheoremDecl EOF )
            // InternalBSharp.g:2258:2: iv_ruleTheoremDecl= ruleTheoremDecl EOF
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
    // InternalBSharp.g:2264:1: ruleTheoremDecl returns [EObject current=null] : ( ( (lv_name_0_0= ruleTHM_NAME ) ) ( (lv_expr_1_0= ruleRootExpression ) ) otherlv_2= ';' ) ;
    public final EObject ruleTheoremDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_expr_1_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:2270:2: ( ( ( (lv_name_0_0= ruleTHM_NAME ) ) ( (lv_expr_1_0= ruleRootExpression ) ) otherlv_2= ';' ) )
            // InternalBSharp.g:2271:2: ( ( (lv_name_0_0= ruleTHM_NAME ) ) ( (lv_expr_1_0= ruleRootExpression ) ) otherlv_2= ';' )
            {
            // InternalBSharp.g:2271:2: ( ( (lv_name_0_0= ruleTHM_NAME ) ) ( (lv_expr_1_0= ruleRootExpression ) ) otherlv_2= ';' )
            // InternalBSharp.g:2272:3: ( (lv_name_0_0= ruleTHM_NAME ) ) ( (lv_expr_1_0= ruleRootExpression ) ) otherlv_2= ';'
            {
            // InternalBSharp.g:2272:3: ( (lv_name_0_0= ruleTHM_NAME ) )
            // InternalBSharp.g:2273:4: (lv_name_0_0= ruleTHM_NAME )
            {
            // InternalBSharp.g:2273:4: (lv_name_0_0= ruleTHM_NAME )
            // InternalBSharp.g:2274:5: lv_name_0_0= ruleTHM_NAME
            {

            					newCompositeNode(grammarAccess.getTheoremDeclAccess().getNameTHM_NAMEParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_21);
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

            // InternalBSharp.g:2291:3: ( (lv_expr_1_0= ruleRootExpression ) )
            // InternalBSharp.g:2292:4: (lv_expr_1_0= ruleRootExpression )
            {
            // InternalBSharp.g:2292:4: (lv_expr_1_0= ruleRootExpression )
            // InternalBSharp.g:2293:5: lv_expr_1_0= ruleRootExpression
            {

            					newCompositeNode(grammarAccess.getTheoremDeclAccess().getExprRootExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_39);
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

            otherlv_2=(Token)match(input,18,FOLLOW_2); 

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
    // InternalBSharp.g:2318:1: entryRuleTypedVariableList returns [EObject current=null] : iv_ruleTypedVariableList= ruleTypedVariableList EOF ;
    public final EObject entryRuleTypedVariableList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypedVariableList = null;


        try {
            // InternalBSharp.g:2318:58: (iv_ruleTypedVariableList= ruleTypedVariableList EOF )
            // InternalBSharp.g:2319:2: iv_ruleTypedVariableList= ruleTypedVariableList EOF
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
    // InternalBSharp.g:2325:1: ruleTypedVariableList returns [EObject current=null] : ( ( (lv_variablesOfType_0_0= ruleVariableTyping ) ) (otherlv_1= ',' ( (lv_variablesOfType_2_0= ruleVariableTyping ) ) )* ) ;
    public final EObject ruleTypedVariableList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_variablesOfType_0_0 = null;

        EObject lv_variablesOfType_2_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:2331:2: ( ( ( (lv_variablesOfType_0_0= ruleVariableTyping ) ) (otherlv_1= ',' ( (lv_variablesOfType_2_0= ruleVariableTyping ) ) )* ) )
            // InternalBSharp.g:2332:2: ( ( (lv_variablesOfType_0_0= ruleVariableTyping ) ) (otherlv_1= ',' ( (lv_variablesOfType_2_0= ruleVariableTyping ) ) )* )
            {
            // InternalBSharp.g:2332:2: ( ( (lv_variablesOfType_0_0= ruleVariableTyping ) ) (otherlv_1= ',' ( (lv_variablesOfType_2_0= ruleVariableTyping ) ) )* )
            // InternalBSharp.g:2333:3: ( (lv_variablesOfType_0_0= ruleVariableTyping ) ) (otherlv_1= ',' ( (lv_variablesOfType_2_0= ruleVariableTyping ) ) )*
            {
            // InternalBSharp.g:2333:3: ( (lv_variablesOfType_0_0= ruleVariableTyping ) )
            // InternalBSharp.g:2334:4: (lv_variablesOfType_0_0= ruleVariableTyping )
            {
            // InternalBSharp.g:2334:4: (lv_variablesOfType_0_0= ruleVariableTyping )
            // InternalBSharp.g:2335:5: lv_variablesOfType_0_0= ruleVariableTyping
            {

            					newCompositeNode(grammarAccess.getTypedVariableListAccess().getVariablesOfTypeVariableTypingParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_15);
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

            // InternalBSharp.g:2352:3: (otherlv_1= ',' ( (lv_variablesOfType_2_0= ruleVariableTyping ) ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==21) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalBSharp.g:2353:4: otherlv_1= ',' ( (lv_variablesOfType_2_0= ruleVariableTyping ) )
            	    {
            	    otherlv_1=(Token)match(input,21,FOLLOW_3); 

            	    				newLeafNode(otherlv_1, grammarAccess.getTypedVariableListAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalBSharp.g:2357:4: ( (lv_variablesOfType_2_0= ruleVariableTyping ) )
            	    // InternalBSharp.g:2358:5: (lv_variablesOfType_2_0= ruleVariableTyping )
            	    {
            	    // InternalBSharp.g:2358:5: (lv_variablesOfType_2_0= ruleVariableTyping )
            	    // InternalBSharp.g:2359:6: lv_variablesOfType_2_0= ruleVariableTyping
            	    {

            	    						newCompositeNode(grammarAccess.getTypedVariableListAccess().getVariablesOfTypeVariableTypingParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_15);
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
            	    break loop41;
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
    // InternalBSharp.g:2381:1: entryRuleVariableTyping returns [EObject current=null] : iv_ruleVariableTyping= ruleVariableTyping EOF ;
    public final EObject entryRuleVariableTyping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableTyping = null;


        try {
            // InternalBSharp.g:2381:55: (iv_ruleVariableTyping= ruleVariableTyping EOF )
            // InternalBSharp.g:2382:2: iv_ruleVariableTyping= ruleVariableTyping EOF
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
    // InternalBSharp.g:2388:1: ruleVariableTyping returns [EObject current=null] : ( ( (lv_typeVar_0_0= ruleTypedVariable ) ) (otherlv_1= ',' ( (lv_typeVar_2_0= ruleTypedVariable ) ) )* otherlv_3= ':' ( (lv_type_4_0= ruleConstructedType ) ) ) ;
    public final EObject ruleVariableTyping() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_typeVar_0_0 = null;

        EObject lv_typeVar_2_0 = null;

        EObject lv_type_4_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:2394:2: ( ( ( (lv_typeVar_0_0= ruleTypedVariable ) ) (otherlv_1= ',' ( (lv_typeVar_2_0= ruleTypedVariable ) ) )* otherlv_3= ':' ( (lv_type_4_0= ruleConstructedType ) ) ) )
            // InternalBSharp.g:2395:2: ( ( (lv_typeVar_0_0= ruleTypedVariable ) ) (otherlv_1= ',' ( (lv_typeVar_2_0= ruleTypedVariable ) ) )* otherlv_3= ':' ( (lv_type_4_0= ruleConstructedType ) ) )
            {
            // InternalBSharp.g:2395:2: ( ( (lv_typeVar_0_0= ruleTypedVariable ) ) (otherlv_1= ',' ( (lv_typeVar_2_0= ruleTypedVariable ) ) )* otherlv_3= ':' ( (lv_type_4_0= ruleConstructedType ) ) )
            // InternalBSharp.g:2396:3: ( (lv_typeVar_0_0= ruleTypedVariable ) ) (otherlv_1= ',' ( (lv_typeVar_2_0= ruleTypedVariable ) ) )* otherlv_3= ':' ( (lv_type_4_0= ruleConstructedType ) )
            {
            // InternalBSharp.g:2396:3: ( (lv_typeVar_0_0= ruleTypedVariable ) )
            // InternalBSharp.g:2397:4: (lv_typeVar_0_0= ruleTypedVariable )
            {
            // InternalBSharp.g:2397:4: (lv_typeVar_0_0= ruleTypedVariable )
            // InternalBSharp.g:2398:5: lv_typeVar_0_0= ruleTypedVariable
            {

            					newCompositeNode(grammarAccess.getVariableTypingAccess().getTypeVarTypedVariableParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_40);
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

            // InternalBSharp.g:2415:3: (otherlv_1= ',' ( (lv_typeVar_2_0= ruleTypedVariable ) ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==21) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalBSharp.g:2416:4: otherlv_1= ',' ( (lv_typeVar_2_0= ruleTypedVariable ) )
            	    {
            	    otherlv_1=(Token)match(input,21,FOLLOW_3); 

            	    				newLeafNode(otherlv_1, grammarAccess.getVariableTypingAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalBSharp.g:2420:4: ( (lv_typeVar_2_0= ruleTypedVariable ) )
            	    // InternalBSharp.g:2421:5: (lv_typeVar_2_0= ruleTypedVariable )
            	    {
            	    // InternalBSharp.g:2421:5: (lv_typeVar_2_0= ruleTypedVariable )
            	    // InternalBSharp.g:2422:6: lv_typeVar_2_0= ruleTypedVariable
            	    {

            	    						newCompositeNode(grammarAccess.getVariableTypingAccess().getTypeVarTypedVariableParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_40);
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
            	    break loop42;
                }
            } while (true);

            otherlv_3=(Token)match(input,12,FOLLOW_16); 

            			newLeafNode(otherlv_3, grammarAccess.getVariableTypingAccess().getColonKeyword_2());
            		
            // InternalBSharp.g:2444:3: ( (lv_type_4_0= ruleConstructedType ) )
            // InternalBSharp.g:2445:4: (lv_type_4_0= ruleConstructedType )
            {
            // InternalBSharp.g:2445:4: (lv_type_4_0= ruleConstructedType )
            // InternalBSharp.g:2446:5: lv_type_4_0= ruleConstructedType
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
    // InternalBSharp.g:2467:1: entryRuleTypedVariable returns [EObject current=null] : iv_ruleTypedVariable= ruleTypedVariable EOF ;
    public final EObject entryRuleTypedVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypedVariable = null;


        try {
            // InternalBSharp.g:2467:54: (iv_ruleTypedVariable= ruleTypedVariable EOF )
            // InternalBSharp.g:2468:2: iv_ruleTypedVariable= ruleTypedVariable EOF
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
    // InternalBSharp.g:2474:1: ruleTypedVariable returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleTypedVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalBSharp.g:2480:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalBSharp.g:2481:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalBSharp.g:2481:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalBSharp.g:2482:3: (lv_name_0_0= RULE_ID )
            {
            // InternalBSharp.g:2482:3: (lv_name_0_0= RULE_ID )
            // InternalBSharp.g:2483:4: lv_name_0_0= RULE_ID
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
            					"ac.soton.bsharp.BSharp.ID");
            			

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
    // InternalBSharp.g:2502:1: entryRuleLambda returns [EObject current=null] : iv_ruleLambda= ruleLambda EOF ;
    public final EObject entryRuleLambda() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLambda = null;


        try {
            // InternalBSharp.g:2502:47: (iv_ruleLambda= ruleLambda EOF )
            // InternalBSharp.g:2503:2: iv_ruleLambda= ruleLambda EOF
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
    // InternalBSharp.g:2509:1: ruleLambda returns [EObject current=null] : ( ( (lv_qType_0_0= '\\u03BB' ) ) ( (lv_context_1_0= rulePolyContext ) )? ( (lv_varList_2_0= ruleTypedVariableList ) ) otherlv_3= '|' ( (lv_expr_4_0= ruleRootExpression ) ) ) ;
    public final EObject ruleLambda() throws RecognitionException {
        EObject current = null;

        Token lv_qType_0_0=null;
        Token otherlv_3=null;
        EObject lv_context_1_0 = null;

        EObject lv_varList_2_0 = null;

        EObject lv_expr_4_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:2515:2: ( ( ( (lv_qType_0_0= '\\u03BB' ) ) ( (lv_context_1_0= rulePolyContext ) )? ( (lv_varList_2_0= ruleTypedVariableList ) ) otherlv_3= '|' ( (lv_expr_4_0= ruleRootExpression ) ) ) )
            // InternalBSharp.g:2516:2: ( ( (lv_qType_0_0= '\\u03BB' ) ) ( (lv_context_1_0= rulePolyContext ) )? ( (lv_varList_2_0= ruleTypedVariableList ) ) otherlv_3= '|' ( (lv_expr_4_0= ruleRootExpression ) ) )
            {
            // InternalBSharp.g:2516:2: ( ( (lv_qType_0_0= '\\u03BB' ) ) ( (lv_context_1_0= rulePolyContext ) )? ( (lv_varList_2_0= ruleTypedVariableList ) ) otherlv_3= '|' ( (lv_expr_4_0= ruleRootExpression ) ) )
            // InternalBSharp.g:2517:3: ( (lv_qType_0_0= '\\u03BB' ) ) ( (lv_context_1_0= rulePolyContext ) )? ( (lv_varList_2_0= ruleTypedVariableList ) ) otherlv_3= '|' ( (lv_expr_4_0= ruleRootExpression ) )
            {
            // InternalBSharp.g:2517:3: ( (lv_qType_0_0= '\\u03BB' ) )
            // InternalBSharp.g:2518:4: (lv_qType_0_0= '\\u03BB' )
            {
            // InternalBSharp.g:2518:4: (lv_qType_0_0= '\\u03BB' )
            // InternalBSharp.g:2519:5: lv_qType_0_0= '\\u03BB'
            {
            lv_qType_0_0=(Token)match(input,43,FOLLOW_41); 

            					newLeafNode(lv_qType_0_0, grammarAccess.getLambdaAccess().getQTypeGreekSmallLetterLamdaKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLambdaRule());
            					}
            					setWithLastConsumed(current, "qType", lv_qType_0_0, "\u03BB");
            				

            }


            }

            // InternalBSharp.g:2531:3: ( (lv_context_1_0= rulePolyContext ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==19) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalBSharp.g:2532:4: (lv_context_1_0= rulePolyContext )
                    {
                    // InternalBSharp.g:2532:4: (lv_context_1_0= rulePolyContext )
                    // InternalBSharp.g:2533:5: lv_context_1_0= rulePolyContext
                    {

                    					newCompositeNode(grammarAccess.getLambdaAccess().getContextPolyContextParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_3);
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

            // InternalBSharp.g:2550:3: ( (lv_varList_2_0= ruleTypedVariableList ) )
            // InternalBSharp.g:2551:4: (lv_varList_2_0= ruleTypedVariableList )
            {
            // InternalBSharp.g:2551:4: (lv_varList_2_0= ruleTypedVariableList )
            // InternalBSharp.g:2552:5: lv_varList_2_0= ruleTypedVariableList
            {

            					newCompositeNode(grammarAccess.getLambdaAccess().getVarListTypedVariableListParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_24);
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

            otherlv_3=(Token)match(input,36,FOLLOW_21); 

            			newLeafNode(otherlv_3, grammarAccess.getLambdaAccess().getVerticalLineKeyword_3());
            		
            // InternalBSharp.g:2573:3: ( (lv_expr_4_0= ruleRootExpression ) )
            // InternalBSharp.g:2574:4: (lv_expr_4_0= ruleRootExpression )
            {
            // InternalBSharp.g:2574:4: (lv_expr_4_0= ruleRootExpression )
            // InternalBSharp.g:2575:5: lv_expr_4_0= ruleRootExpression
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
    // InternalBSharp.g:2596:1: entryRuleQuantifier returns [EObject current=null] : iv_ruleQuantifier= ruleQuantifier EOF ;
    public final EObject entryRuleQuantifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuantifier = null;


        try {
            // InternalBSharp.g:2596:51: (iv_ruleQuantifier= ruleQuantifier EOF )
            // InternalBSharp.g:2597:2: iv_ruleQuantifier= ruleQuantifier EOF
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
    // InternalBSharp.g:2603:1: ruleQuantifier returns [EObject current=null] : ( ( ( (lv_qType_0_1= '\\u2200' | lv_qType_0_2= '\\u2203' ) ) ) ( (lv_context_1_0= rulePolyContext ) )? ( (lv_varList_2_0= ruleTypedVariableList ) ) otherlv_3= '\\u00B7' ( (lv_expr_4_0= ruleRootExpression ) ) ) ;
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
            // InternalBSharp.g:2609:2: ( ( ( ( (lv_qType_0_1= '\\u2200' | lv_qType_0_2= '\\u2203' ) ) ) ( (lv_context_1_0= rulePolyContext ) )? ( (lv_varList_2_0= ruleTypedVariableList ) ) otherlv_3= '\\u00B7' ( (lv_expr_4_0= ruleRootExpression ) ) ) )
            // InternalBSharp.g:2610:2: ( ( ( (lv_qType_0_1= '\\u2200' | lv_qType_0_2= '\\u2203' ) ) ) ( (lv_context_1_0= rulePolyContext ) )? ( (lv_varList_2_0= ruleTypedVariableList ) ) otherlv_3= '\\u00B7' ( (lv_expr_4_0= ruleRootExpression ) ) )
            {
            // InternalBSharp.g:2610:2: ( ( ( (lv_qType_0_1= '\\u2200' | lv_qType_0_2= '\\u2203' ) ) ) ( (lv_context_1_0= rulePolyContext ) )? ( (lv_varList_2_0= ruleTypedVariableList ) ) otherlv_3= '\\u00B7' ( (lv_expr_4_0= ruleRootExpression ) ) )
            // InternalBSharp.g:2611:3: ( ( (lv_qType_0_1= '\\u2200' | lv_qType_0_2= '\\u2203' ) ) ) ( (lv_context_1_0= rulePolyContext ) )? ( (lv_varList_2_0= ruleTypedVariableList ) ) otherlv_3= '\\u00B7' ( (lv_expr_4_0= ruleRootExpression ) )
            {
            // InternalBSharp.g:2611:3: ( ( (lv_qType_0_1= '\\u2200' | lv_qType_0_2= '\\u2203' ) ) )
            // InternalBSharp.g:2612:4: ( (lv_qType_0_1= '\\u2200' | lv_qType_0_2= '\\u2203' ) )
            {
            // InternalBSharp.g:2612:4: ( (lv_qType_0_1= '\\u2200' | lv_qType_0_2= '\\u2203' ) )
            // InternalBSharp.g:2613:5: (lv_qType_0_1= '\\u2200' | lv_qType_0_2= '\\u2203' )
            {
            // InternalBSharp.g:2613:5: (lv_qType_0_1= '\\u2200' | lv_qType_0_2= '\\u2203' )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==44) ) {
                alt44=1;
            }
            else if ( (LA44_0==45) ) {
                alt44=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // InternalBSharp.g:2614:6: lv_qType_0_1= '\\u2200'
                    {
                    lv_qType_0_1=(Token)match(input,44,FOLLOW_41); 

                    						newLeafNode(lv_qType_0_1, grammarAccess.getQuantifierAccess().getQTypeForAllKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getQuantifierRule());
                    						}
                    						setWithLastConsumed(current, "qType", lv_qType_0_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalBSharp.g:2625:6: lv_qType_0_2= '\\u2203'
                    {
                    lv_qType_0_2=(Token)match(input,45,FOLLOW_41); 

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

            // InternalBSharp.g:2638:3: ( (lv_context_1_0= rulePolyContext ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==19) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalBSharp.g:2639:4: (lv_context_1_0= rulePolyContext )
                    {
                    // InternalBSharp.g:2639:4: (lv_context_1_0= rulePolyContext )
                    // InternalBSharp.g:2640:5: lv_context_1_0= rulePolyContext
                    {

                    					newCompositeNode(grammarAccess.getQuantifierAccess().getContextPolyContextParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_3);
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

            // InternalBSharp.g:2657:3: ( (lv_varList_2_0= ruleTypedVariableList ) )
            // InternalBSharp.g:2658:4: (lv_varList_2_0= ruleTypedVariableList )
            {
            // InternalBSharp.g:2658:4: (lv_varList_2_0= ruleTypedVariableList )
            // InternalBSharp.g:2659:5: lv_varList_2_0= ruleTypedVariableList
            {

            					newCompositeNode(grammarAccess.getQuantifierAccess().getVarListTypedVariableListParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_42);
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

            otherlv_3=(Token)match(input,46,FOLLOW_21); 

            			newLeafNode(otherlv_3, grammarAccess.getQuantifierAccess().getMiddleDotKeyword_3());
            		
            // InternalBSharp.g:2680:3: ( (lv_expr_4_0= ruleRootExpression ) )
            // InternalBSharp.g:2681:4: (lv_expr_4_0= ruleRootExpression )
            {
            // InternalBSharp.g:2681:4: (lv_expr_4_0= ruleRootExpression )
            // InternalBSharp.g:2682:5: lv_expr_4_0= ruleRootExpression
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
    // InternalBSharp.g:2703:1: entryRuleRootExpression returns [EObject current=null] : iv_ruleRootExpression= ruleRootExpression EOF ;
    public final EObject entryRuleRootExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRootExpression = null;


        try {
            // InternalBSharp.g:2703:55: (iv_ruleRootExpression= ruleRootExpression EOF )
            // InternalBSharp.g:2704:2: iv_ruleRootExpression= ruleRootExpression EOF
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
    // InternalBSharp.g:2710:1: ruleRootExpression returns [EObject current=null] : (this_Lambda_0= ruleLambda | this_Quantifier_1= ruleQuantifier | this_Infix_2= ruleInfix | this_MatchStatement_3= ruleMatchStatement ) ;
    public final EObject ruleRootExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Lambda_0 = null;

        EObject this_Quantifier_1 = null;

        EObject this_Infix_2 = null;

        EObject this_MatchStatement_3 = null;



        	enterRule();

        try {
            // InternalBSharp.g:2716:2: ( (this_Lambda_0= ruleLambda | this_Quantifier_1= ruleQuantifier | this_Infix_2= ruleInfix | this_MatchStatement_3= ruleMatchStatement ) )
            // InternalBSharp.g:2717:2: (this_Lambda_0= ruleLambda | this_Quantifier_1= ruleQuantifier | this_Infix_2= ruleInfix | this_MatchStatement_3= ruleMatchStatement )
            {
            // InternalBSharp.g:2717:2: (this_Lambda_0= ruleLambda | this_Quantifier_1= ruleQuantifier | this_Infix_2= ruleInfix | this_MatchStatement_3= ruleMatchStatement )
            int alt46=4;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt46=1;
                }
                break;
            case 44:
            case 45:
                {
                alt46=2;
                }
                break;
            case RULE_ID:
            case 32:
            case 47:
                {
                alt46=3;
                }
                break;
            case 41:
                {
                alt46=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }

            switch (alt46) {
                case 1 :
                    // InternalBSharp.g:2718:3: this_Lambda_0= ruleLambda
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
                    // InternalBSharp.g:2727:3: this_Quantifier_1= ruleQuantifier
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
                    // InternalBSharp.g:2736:3: this_Infix_2= ruleInfix
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
                    // InternalBSharp.g:2745:3: this_MatchStatement_3= ruleMatchStatement
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
    // InternalBSharp.g:2757:1: entryRulePrefix returns [EObject current=null] : iv_rulePrefix= rulePrefix EOF ;
    public final EObject entryRulePrefix() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrefix = null;


        try {
            // InternalBSharp.g:2757:47: (iv_rulePrefix= rulePrefix EOF )
            // InternalBSharp.g:2758:2: iv_rulePrefix= rulePrefix EOF
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
    // InternalBSharp.g:2764:1: rulePrefix returns [EObject current=null] : ( ( (lv_name_0_0= rulePrefixBuiltIn ) ) ( (lv_elem_1_0= ruleElement ) ) ) ;
    public final EObject rulePrefix() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_elem_1_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:2770:2: ( ( ( (lv_name_0_0= rulePrefixBuiltIn ) ) ( (lv_elem_1_0= ruleElement ) ) ) )
            // InternalBSharp.g:2771:2: ( ( (lv_name_0_0= rulePrefixBuiltIn ) ) ( (lv_elem_1_0= ruleElement ) ) )
            {
            // InternalBSharp.g:2771:2: ( ( (lv_name_0_0= rulePrefixBuiltIn ) ) ( (lv_elem_1_0= ruleElement ) ) )
            // InternalBSharp.g:2772:3: ( (lv_name_0_0= rulePrefixBuiltIn ) ) ( (lv_elem_1_0= ruleElement ) )
            {
            // InternalBSharp.g:2772:3: ( (lv_name_0_0= rulePrefixBuiltIn ) )
            // InternalBSharp.g:2773:4: (lv_name_0_0= rulePrefixBuiltIn )
            {
            // InternalBSharp.g:2773:4: (lv_name_0_0= rulePrefixBuiltIn )
            // InternalBSharp.g:2774:5: lv_name_0_0= rulePrefixBuiltIn
            {

            					newCompositeNode(grammarAccess.getPrefixAccess().getNamePrefixBuiltInParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_43);
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

            // InternalBSharp.g:2791:3: ( (lv_elem_1_0= ruleElement ) )
            // InternalBSharp.g:2792:4: (lv_elem_1_0= ruleElement )
            {
            // InternalBSharp.g:2792:4: (lv_elem_1_0= ruleElement )
            // InternalBSharp.g:2793:5: lv_elem_1_0= ruleElement
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
    // InternalBSharp.g:2814:1: entryRulePrefixBuiltIn returns [String current=null] : iv_rulePrefixBuiltIn= rulePrefixBuiltIn EOF ;
    public final String entryRulePrefixBuiltIn() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrefixBuiltIn = null;


        try {
            // InternalBSharp.g:2814:53: (iv_rulePrefixBuiltIn= rulePrefixBuiltIn EOF )
            // InternalBSharp.g:2815:2: iv_rulePrefixBuiltIn= rulePrefixBuiltIn EOF
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
    // InternalBSharp.g:2821:1: rulePrefixBuiltIn returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '\\u00AC' ;
    public final AntlrDatatypeRuleToken rulePrefixBuiltIn() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalBSharp.g:2827:2: (kw= '\\u00AC' )
            // InternalBSharp.g:2828:2: kw= '\\u00AC'
            {
            kw=(Token)match(input,47,FOLLOW_2); 

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
    // InternalBSharp.g:2836:1: entryRuleInfix returns [EObject current=null] : iv_ruleInfix= ruleInfix EOF ;
    public final EObject entryRuleInfix() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInfix = null;


        try {
            // InternalBSharp.g:2836:46: (iv_ruleInfix= ruleInfix EOF )
            // InternalBSharp.g:2837:2: iv_ruleInfix= ruleInfix EOF
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
    // InternalBSharp.g:2843:1: ruleInfix returns [EObject current=null] : (this_Element_0= ruleElement ( () ( ( (otherlv_2= RULE_ID ) ) | ( (lv_opName_3_0= ruleInbuiltInfix ) ) ) ( (lv_right_4_0= ruleElement ) ) )* ) ;
    public final EObject ruleInfix() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Element_0 = null;

        AntlrDatatypeRuleToken lv_opName_3_0 = null;

        EObject lv_right_4_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:2849:2: ( (this_Element_0= ruleElement ( () ( ( (otherlv_2= RULE_ID ) ) | ( (lv_opName_3_0= ruleInbuiltInfix ) ) ) ( (lv_right_4_0= ruleElement ) ) )* ) )
            // InternalBSharp.g:2850:2: (this_Element_0= ruleElement ( () ( ( (otherlv_2= RULE_ID ) ) | ( (lv_opName_3_0= ruleInbuiltInfix ) ) ) ( (lv_right_4_0= ruleElement ) ) )* )
            {
            // InternalBSharp.g:2850:2: (this_Element_0= ruleElement ( () ( ( (otherlv_2= RULE_ID ) ) | ( (lv_opName_3_0= ruleInbuiltInfix ) ) ) ( (lv_right_4_0= ruleElement ) ) )* )
            // InternalBSharp.g:2851:3: this_Element_0= ruleElement ( () ( ( (otherlv_2= RULE_ID ) ) | ( (lv_opName_3_0= ruleInbuiltInfix ) ) ) ( (lv_right_4_0= ruleElement ) ) )*
            {

            			newCompositeNode(grammarAccess.getInfixAccess().getElementParserRuleCall_0());
            		
            pushFollow(FOLLOW_44);
            this_Element_0=ruleElement();

            state._fsp--;


            			current = this_Element_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalBSharp.g:2859:3: ( () ( ( (otherlv_2= RULE_ID ) ) | ( (lv_opName_3_0= ruleInbuiltInfix ) ) ) ( (lv_right_4_0= ruleElement ) ) )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==RULE_ID) ) {
                    int LA48_2 = input.LA(2);

                    if ( (LA48_2==32) ) {
                        int LA48_4 = input.LA(3);

                        if ( (LA48_4==RULE_ID) ) {
                            int LA48_5 = input.LA(4);

                            if ( (LA48_5==RULE_ID||LA48_5==13||LA48_5==19||(LA48_5>=32 && LA48_5<=33)||(LA48_5>=48 && LA48_5<=53)) ) {
                                alt48=1;
                            }


                        }
                        else if ( (LA48_4==32||LA48_4==41||(LA48_4>=43 && LA48_4<=45)||LA48_4==47) ) {
                            alt48=1;
                        }


                    }
                    else if ( (LA48_2==RULE_ID||LA48_2==47) ) {
                        alt48=1;
                    }


                }
                else if ( ((LA48_0>=48 && LA48_0<=53)) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalBSharp.g:2860:4: () ( ( (otherlv_2= RULE_ID ) ) | ( (lv_opName_3_0= ruleInbuiltInfix ) ) ) ( (lv_right_4_0= ruleElement ) )
            	    {
            	    // InternalBSharp.g:2860:4: ()
            	    // InternalBSharp.g:2861:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getInfixAccess().getInfixLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalBSharp.g:2867:4: ( ( (otherlv_2= RULE_ID ) ) | ( (lv_opName_3_0= ruleInbuiltInfix ) ) )
            	    int alt47=2;
            	    int LA47_0 = input.LA(1);

            	    if ( (LA47_0==RULE_ID) ) {
            	        alt47=1;
            	    }
            	    else if ( ((LA47_0>=48 && LA47_0<=53)) ) {
            	        alt47=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 47, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt47) {
            	        case 1 :
            	            // InternalBSharp.g:2868:5: ( (otherlv_2= RULE_ID ) )
            	            {
            	            // InternalBSharp.g:2868:5: ( (otherlv_2= RULE_ID ) )
            	            // InternalBSharp.g:2869:6: (otherlv_2= RULE_ID )
            	            {
            	            // InternalBSharp.g:2869:6: (otherlv_2= RULE_ID )
            	            // InternalBSharp.g:2870:7: otherlv_2= RULE_ID
            	            {

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getInfixRule());
            	            							}
            	            						
            	            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_43); 

            	            							newLeafNode(otherlv_2, grammarAccess.getInfixAccess().getFuncNameFunctionDeclCrossReference_1_1_0_0());
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalBSharp.g:2882:5: ( (lv_opName_3_0= ruleInbuiltInfix ) )
            	            {
            	            // InternalBSharp.g:2882:5: ( (lv_opName_3_0= ruleInbuiltInfix ) )
            	            // InternalBSharp.g:2883:6: (lv_opName_3_0= ruleInbuiltInfix )
            	            {
            	            // InternalBSharp.g:2883:6: (lv_opName_3_0= ruleInbuiltInfix )
            	            // InternalBSharp.g:2884:7: lv_opName_3_0= ruleInbuiltInfix
            	            {

            	            							newCompositeNode(grammarAccess.getInfixAccess().getOpNameInbuiltInfixParserRuleCall_1_1_1_0());
            	            						
            	            pushFollow(FOLLOW_43);
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

            	    // InternalBSharp.g:2902:4: ( (lv_right_4_0= ruleElement ) )
            	    // InternalBSharp.g:2903:5: (lv_right_4_0= ruleElement )
            	    {
            	    // InternalBSharp.g:2903:5: (lv_right_4_0= ruleElement )
            	    // InternalBSharp.g:2904:6: lv_right_4_0= ruleElement
            	    {

            	    						newCompositeNode(grammarAccess.getInfixAccess().getRightElementParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_44);
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
            	    break loop48;
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
    // InternalBSharp.g:2926:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // InternalBSharp.g:2926:48: (iv_ruleElement= ruleElement EOF )
            // InternalBSharp.g:2927:2: iv_ruleElement= ruleElement EOF
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
    // InternalBSharp.g:2933:1: ruleElement returns [EObject current=null] : (this_Bracket_0= ruleBracket | this_Prefix_1= rulePrefix | this_FunctionCall_2= ruleFunctionCall ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        EObject this_Bracket_0 = null;

        EObject this_Prefix_1 = null;

        EObject this_FunctionCall_2 = null;



        	enterRule();

        try {
            // InternalBSharp.g:2939:2: ( (this_Bracket_0= ruleBracket | this_Prefix_1= rulePrefix | this_FunctionCall_2= ruleFunctionCall ) )
            // InternalBSharp.g:2940:2: (this_Bracket_0= ruleBracket | this_Prefix_1= rulePrefix | this_FunctionCall_2= ruleFunctionCall )
            {
            // InternalBSharp.g:2940:2: (this_Bracket_0= ruleBracket | this_Prefix_1= rulePrefix | this_FunctionCall_2= ruleFunctionCall )
            int alt49=3;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt49=1;
                }
                break;
            case 47:
                {
                alt49=2;
                }
                break;
            case RULE_ID:
                {
                alt49=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }

            switch (alt49) {
                case 1 :
                    // InternalBSharp.g:2941:3: this_Bracket_0= ruleBracket
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
                    // InternalBSharp.g:2950:3: this_Prefix_1= rulePrefix
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
                    // InternalBSharp.g:2959:3: this_FunctionCall_2= ruleFunctionCall
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
    // InternalBSharp.g:2971:1: entryRuleBracket returns [EObject current=null] : iv_ruleBracket= ruleBracket EOF ;
    public final EObject entryRuleBracket() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBracket = null;


        try {
            // InternalBSharp.g:2971:48: (iv_ruleBracket= ruleBracket EOF )
            // InternalBSharp.g:2972:2: iv_ruleBracket= ruleBracket EOF
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
    // InternalBSharp.g:2978:1: ruleBracket returns [EObject current=null] : (otherlv_0= '(' ( (lv_child_1_0= ruleRootExpression ) ) otherlv_2= ')' ) ;
    public final EObject ruleBracket() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_child_1_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:2984:2: ( (otherlv_0= '(' ( (lv_child_1_0= ruleRootExpression ) ) otherlv_2= ')' ) )
            // InternalBSharp.g:2985:2: (otherlv_0= '(' ( (lv_child_1_0= ruleRootExpression ) ) otherlv_2= ')' )
            {
            // InternalBSharp.g:2985:2: (otherlv_0= '(' ( (lv_child_1_0= ruleRootExpression ) ) otherlv_2= ')' )
            // InternalBSharp.g:2986:3: otherlv_0= '(' ( (lv_child_1_0= ruleRootExpression ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getBracketAccess().getLeftParenthesisKeyword_0());
            		
            // InternalBSharp.g:2990:3: ( (lv_child_1_0= ruleRootExpression ) )
            // InternalBSharp.g:2991:4: (lv_child_1_0= ruleRootExpression )
            {
            // InternalBSharp.g:2991:4: (lv_child_1_0= ruleRootExpression )
            // InternalBSharp.g:2992:5: lv_child_1_0= ruleRootExpression
            {

            					newCompositeNode(grammarAccess.getBracketAccess().getChildRootExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_19);
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
    // InternalBSharp.g:3017:1: entryRuleFunctionCall returns [EObject current=null] : iv_ruleFunctionCall= ruleFunctionCall EOF ;
    public final EObject entryRuleFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCall = null;


        try {
            // InternalBSharp.g:3017:53: (iv_ruleFunctionCall= ruleFunctionCall EOF )
            // InternalBSharp.g:3018:2: iv_ruleFunctionCall= ruleFunctionCall EOF
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
    // InternalBSharp.g:3024:1: ruleFunctionCall returns [EObject current=null] : ( ( ( (otherlv_0= RULE_ID ) ) | ( (lv_classVarDecl_1_0= ruleClassVarDecl ) ) ) ( ( (lv_context_2_0= ruleTypeDeclContext ) )? otherlv_3= '(' ( (lv_arguments_4_0= ruleRootExpression ) )? (otherlv_5= ',' ( (lv_arguments_6_0= ruleRootExpression ) ) )* otherlv_7= ')' )? ) ;
    public final EObject ruleFunctionCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_classVarDecl_1_0 = null;

        EObject lv_context_2_0 = null;

        EObject lv_arguments_4_0 = null;

        EObject lv_arguments_6_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:3030:2: ( ( ( ( (otherlv_0= RULE_ID ) ) | ( (lv_classVarDecl_1_0= ruleClassVarDecl ) ) ) ( ( (lv_context_2_0= ruleTypeDeclContext ) )? otherlv_3= '(' ( (lv_arguments_4_0= ruleRootExpression ) )? (otherlv_5= ',' ( (lv_arguments_6_0= ruleRootExpression ) ) )* otherlv_7= ')' )? ) )
            // InternalBSharp.g:3031:2: ( ( ( (otherlv_0= RULE_ID ) ) | ( (lv_classVarDecl_1_0= ruleClassVarDecl ) ) ) ( ( (lv_context_2_0= ruleTypeDeclContext ) )? otherlv_3= '(' ( (lv_arguments_4_0= ruleRootExpression ) )? (otherlv_5= ',' ( (lv_arguments_6_0= ruleRootExpression ) ) )* otherlv_7= ')' )? )
            {
            // InternalBSharp.g:3031:2: ( ( ( (otherlv_0= RULE_ID ) ) | ( (lv_classVarDecl_1_0= ruleClassVarDecl ) ) ) ( ( (lv_context_2_0= ruleTypeDeclContext ) )? otherlv_3= '(' ( (lv_arguments_4_0= ruleRootExpression ) )? (otherlv_5= ',' ( (lv_arguments_6_0= ruleRootExpression ) ) )* otherlv_7= ')' )? )
            // InternalBSharp.g:3032:3: ( ( (otherlv_0= RULE_ID ) ) | ( (lv_classVarDecl_1_0= ruleClassVarDecl ) ) ) ( ( (lv_context_2_0= ruleTypeDeclContext ) )? otherlv_3= '(' ( (lv_arguments_4_0= ruleRootExpression ) )? (otherlv_5= ',' ( (lv_arguments_6_0= ruleRootExpression ) ) )* otherlv_7= ')' )?
            {
            // InternalBSharp.g:3032:3: ( ( (otherlv_0= RULE_ID ) ) | ( (lv_classVarDecl_1_0= ruleClassVarDecl ) ) )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==RULE_ID) ) {
                int LA50_1 = input.LA(2);

                if ( (LA50_1==EOF||LA50_1==RULE_ID||(LA50_1>=18 && LA50_1<=19)||LA50_1==21||(LA50_1>=32 && LA50_1<=33)||LA50_1==36||(LA50_1>=38 && LA50_1<=39)||LA50_1==42||(LA50_1>=48 && LA50_1<=53)) ) {
                    alt50=1;
                }
                else if ( (LA50_1==13) ) {
                    alt50=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 50, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // InternalBSharp.g:3033:4: ( (otherlv_0= RULE_ID ) )
                    {
                    // InternalBSharp.g:3033:4: ( (otherlv_0= RULE_ID ) )
                    // InternalBSharp.g:3034:5: (otherlv_0= RULE_ID )
                    {
                    // InternalBSharp.g:3034:5: (otherlv_0= RULE_ID )
                    // InternalBSharp.g:3035:6: otherlv_0= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFunctionCallRule());
                    						}
                    					
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_45); 

                    						newLeafNode(otherlv_0, grammarAccess.getFunctionCallAccess().getTypeInstExpressionVariableCrossReference_0_0_0());
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalBSharp.g:3047:4: ( (lv_classVarDecl_1_0= ruleClassVarDecl ) )
                    {
                    // InternalBSharp.g:3047:4: ( (lv_classVarDecl_1_0= ruleClassVarDecl ) )
                    // InternalBSharp.g:3048:5: (lv_classVarDecl_1_0= ruleClassVarDecl )
                    {
                    // InternalBSharp.g:3048:5: (lv_classVarDecl_1_0= ruleClassVarDecl )
                    // InternalBSharp.g:3049:6: lv_classVarDecl_1_0= ruleClassVarDecl
                    {

                    						newCompositeNode(grammarAccess.getFunctionCallAccess().getClassVarDeclClassVarDeclParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_45);
                    lv_classVarDecl_1_0=ruleClassVarDecl();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFunctionCallRule());
                    						}
                    						set(
                    							current,
                    							"classVarDecl",
                    							lv_classVarDecl_1_0,
                    							"ac.soton.bsharp.BSharp.ClassVarDecl");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalBSharp.g:3067:3: ( ( (lv_context_2_0= ruleTypeDeclContext ) )? otherlv_3= '(' ( (lv_arguments_4_0= ruleRootExpression ) )? (otherlv_5= ',' ( (lv_arguments_6_0= ruleRootExpression ) ) )* otherlv_7= ')' )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==19||LA54_0==32) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalBSharp.g:3068:4: ( (lv_context_2_0= ruleTypeDeclContext ) )? otherlv_3= '(' ( (lv_arguments_4_0= ruleRootExpression ) )? (otherlv_5= ',' ( (lv_arguments_6_0= ruleRootExpression ) ) )* otherlv_7= ')'
                    {
                    // InternalBSharp.g:3068:4: ( (lv_context_2_0= ruleTypeDeclContext ) )?
                    int alt51=2;
                    int LA51_0 = input.LA(1);

                    if ( (LA51_0==19) ) {
                        alt51=1;
                    }
                    switch (alt51) {
                        case 1 :
                            // InternalBSharp.g:3069:5: (lv_context_2_0= ruleTypeDeclContext )
                            {
                            // InternalBSharp.g:3069:5: (lv_context_2_0= ruleTypeDeclContext )
                            // InternalBSharp.g:3070:6: lv_context_2_0= ruleTypeDeclContext
                            {

                            						newCompositeNode(grammarAccess.getFunctionCallAccess().getContextTypeDeclContextParserRuleCall_1_0_0());
                            					
                            pushFollow(FOLLOW_27);
                            lv_context_2_0=ruleTypeDeclContext();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getFunctionCallRule());
                            						}
                            						set(
                            							current,
                            							"context",
                            							lv_context_2_0,
                            							"ac.soton.bsharp.BSharp.TypeDeclContext");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    otherlv_3=(Token)match(input,32,FOLLOW_46); 

                    				newLeafNode(otherlv_3, grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_1_1());
                    			
                    // InternalBSharp.g:3091:4: ( (lv_arguments_4_0= ruleRootExpression ) )?
                    int alt52=2;
                    int LA52_0 = input.LA(1);

                    if ( (LA52_0==RULE_ID||LA52_0==32||LA52_0==41||(LA52_0>=43 && LA52_0<=45)||LA52_0==47) ) {
                        alt52=1;
                    }
                    switch (alt52) {
                        case 1 :
                            // InternalBSharp.g:3092:5: (lv_arguments_4_0= ruleRootExpression )
                            {
                            // InternalBSharp.g:3092:5: (lv_arguments_4_0= ruleRootExpression )
                            // InternalBSharp.g:3093:6: lv_arguments_4_0= ruleRootExpression
                            {

                            						newCompositeNode(grammarAccess.getFunctionCallAccess().getArgumentsRootExpressionParserRuleCall_1_2_0());
                            					
                            pushFollow(FOLLOW_37);
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
                            break;

                    }

                    // InternalBSharp.g:3110:4: (otherlv_5= ',' ( (lv_arguments_6_0= ruleRootExpression ) ) )*
                    loop53:
                    do {
                        int alt53=2;
                        int LA53_0 = input.LA(1);

                        if ( (LA53_0==21) ) {
                            alt53=1;
                        }


                        switch (alt53) {
                    	case 1 :
                    	    // InternalBSharp.g:3111:5: otherlv_5= ',' ( (lv_arguments_6_0= ruleRootExpression ) )
                    	    {
                    	    otherlv_5=(Token)match(input,21,FOLLOW_21); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getFunctionCallAccess().getCommaKeyword_1_3_0());
                    	    				
                    	    // InternalBSharp.g:3115:5: ( (lv_arguments_6_0= ruleRootExpression ) )
                    	    // InternalBSharp.g:3116:6: (lv_arguments_6_0= ruleRootExpression )
                    	    {
                    	    // InternalBSharp.g:3116:6: (lv_arguments_6_0= ruleRootExpression )
                    	    // InternalBSharp.g:3117:7: lv_arguments_6_0= ruleRootExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getFunctionCallAccess().getArgumentsRootExpressionParserRuleCall_1_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_37);
                    	    lv_arguments_6_0=ruleRootExpression();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getFunctionCallRule());
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
                    	    break loop53;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,33,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getFunctionCallAccess().getRightParenthesisKeyword_1_4());
                    			

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


    // $ANTLR start "entryRuleClassVarDecl"
    // InternalBSharp.g:3144:1: entryRuleClassVarDecl returns [EObject current=null] : iv_ruleClassVarDecl= ruleClassVarDecl EOF ;
    public final EObject entryRuleClassVarDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassVarDecl = null;


        try {
            // InternalBSharp.g:3144:53: (iv_ruleClassVarDecl= ruleClassVarDecl EOF )
            // InternalBSharp.g:3145:2: iv_ruleClassVarDecl= ruleClassVarDecl EOF
            {
             newCompositeNode(grammarAccess.getClassVarDeclRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClassVarDecl=ruleClassVarDecl();

            state._fsp--;

             current =iv_ruleClassVarDecl; 
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
    // $ANTLR end "entryRuleClassVarDecl"


    // $ANTLR start "ruleClassVarDecl"
    // InternalBSharp.g:3151:1: ruleClassVarDecl returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleClassVarDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalBSharp.g:3157:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalBSharp.g:3158:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalBSharp.g:3158:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) )
            // InternalBSharp.g:3159:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) )
            {
            // InternalBSharp.g:3159:3: ( (otherlv_0= RULE_ID ) )
            // InternalBSharp.g:3160:4: (otherlv_0= RULE_ID )
            {
            // InternalBSharp.g:3160:4: (otherlv_0= RULE_ID )
            // InternalBSharp.g:3161:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getClassVarDeclRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_47); 

            					newLeafNode(otherlv_0, grammarAccess.getClassVarDeclAccess().getOwnerTypeGenNameCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getClassVarDeclAccess().getFullStopKeyword_1());
            		
            // InternalBSharp.g:3176:3: ( (otherlv_2= RULE_ID ) )
            // InternalBSharp.g:3177:4: (otherlv_2= RULE_ID )
            {
            // InternalBSharp.g:3177:4: (otherlv_2= RULE_ID )
            // InternalBSharp.g:3178:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getClassVarDeclRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_2, grammarAccess.getClassVarDeclAccess().getTypeInstExpressionVariableCrossReference_2_0());
            				

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
    // $ANTLR end "ruleClassVarDecl"


    // $ANTLR start "entryRuleInbuiltInfix"
    // InternalBSharp.g:3193:1: entryRuleInbuiltInfix returns [String current=null] : iv_ruleInbuiltInfix= ruleInbuiltInfix EOF ;
    public final String entryRuleInbuiltInfix() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInbuiltInfix = null;


        try {
            // InternalBSharp.g:3193:52: (iv_ruleInbuiltInfix= ruleInbuiltInfix EOF )
            // InternalBSharp.g:3194:2: iv_ruleInbuiltInfix= ruleInbuiltInfix EOF
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
    // InternalBSharp.g:3200:1: ruleInbuiltInfix returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '\\u21D4' | kw= '\\u21D2' | kw= '=' | kw= '\\u2260' | kw= '\\u2227' | kw= '\\u2228' ) ;
    public final AntlrDatatypeRuleToken ruleInbuiltInfix() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalBSharp.g:3206:2: ( (kw= '\\u21D4' | kw= '\\u21D2' | kw= '=' | kw= '\\u2260' | kw= '\\u2227' | kw= '\\u2228' ) )
            // InternalBSharp.g:3207:2: (kw= '\\u21D4' | kw= '\\u21D2' | kw= '=' | kw= '\\u2260' | kw= '\\u2227' | kw= '\\u2228' )
            {
            // InternalBSharp.g:3207:2: (kw= '\\u21D4' | kw= '\\u21D2' | kw= '=' | kw= '\\u2260' | kw= '\\u2227' | kw= '\\u2228' )
            int alt55=6;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt55=1;
                }
                break;
            case 49:
                {
                alt55=2;
                }
                break;
            case 50:
                {
                alt55=3;
                }
                break;
            case 51:
                {
                alt55=4;
                }
                break;
            case 52:
                {
                alt55=5;
                }
                break;
            case 53:
                {
                alt55=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }

            switch (alt55) {
                case 1 :
                    // InternalBSharp.g:3208:3: kw= '\\u21D4'
                    {
                    kw=(Token)match(input,48,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getInbuiltInfixAccess().getLeftRightDoubleArrowKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalBSharp.g:3214:3: kw= '\\u21D2'
                    {
                    kw=(Token)match(input,49,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getInbuiltInfixAccess().getRightwardsDoubleArrowKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalBSharp.g:3220:3: kw= '='
                    {
                    kw=(Token)match(input,50,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getInbuiltInfixAccess().getEqualsSignKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalBSharp.g:3226:3: kw= '\\u2260'
                    {
                    kw=(Token)match(input,51,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getInbuiltInfixAccess().getNotEqualToKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalBSharp.g:3232:3: kw= '\\u2227'
                    {
                    kw=(Token)match(input,52,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getInbuiltInfixAccess().getLogicalAndKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalBSharp.g:3238:3: kw= '\\u2228'
                    {
                    kw=(Token)match(input,53,FOLLOW_2); 

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
    // InternalBSharp.g:3247:1: entryRuleInstance returns [EObject current=null] : iv_ruleInstance= ruleInstance EOF ;
    public final EObject entryRuleInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstance = null;


        try {
            // InternalBSharp.g:3247:49: (iv_ruleInstance= ruleInstance EOF )
            // InternalBSharp.g:3248:2: iv_ruleInstance= ruleInstance EOF
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
    // InternalBSharp.g:3254:1: ruleInstance returns [EObject current=null] : (otherlv_0= 'Instance' ( ( ruleQualifiedName ) ) ( (lv_context_2_0= ruleTypeDeclContext ) ) otherlv_3= '(' ( (lv_arguments_4_0= ruleRootExpression ) )? (otherlv_5= ',' ( (lv_arguments_6_0= ruleRootExpression ) ) )* otherlv_7= ')' ) ;
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
            // InternalBSharp.g:3260:2: ( (otherlv_0= 'Instance' ( ( ruleQualifiedName ) ) ( (lv_context_2_0= ruleTypeDeclContext ) ) otherlv_3= '(' ( (lv_arguments_4_0= ruleRootExpression ) )? (otherlv_5= ',' ( (lv_arguments_6_0= ruleRootExpression ) ) )* otherlv_7= ')' ) )
            // InternalBSharp.g:3261:2: (otherlv_0= 'Instance' ( ( ruleQualifiedName ) ) ( (lv_context_2_0= ruleTypeDeclContext ) ) otherlv_3= '(' ( (lv_arguments_4_0= ruleRootExpression ) )? (otherlv_5= ',' ( (lv_arguments_6_0= ruleRootExpression ) ) )* otherlv_7= ')' )
            {
            // InternalBSharp.g:3261:2: (otherlv_0= 'Instance' ( ( ruleQualifiedName ) ) ( (lv_context_2_0= ruleTypeDeclContext ) ) otherlv_3= '(' ( (lv_arguments_4_0= ruleRootExpression ) )? (otherlv_5= ',' ( (lv_arguments_6_0= ruleRootExpression ) ) )* otherlv_7= ')' )
            // InternalBSharp.g:3262:3: otherlv_0= 'Instance' ( ( ruleQualifiedName ) ) ( (lv_context_2_0= ruleTypeDeclContext ) ) otherlv_3= '(' ( (lv_arguments_4_0= ruleRootExpression ) )? (otherlv_5= ',' ( (lv_arguments_6_0= ruleRootExpression ) ) )* otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,54,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getInstanceAccess().getInstanceKeyword_0());
            		
            // InternalBSharp.g:3266:3: ( ( ruleQualifiedName ) )
            // InternalBSharp.g:3267:4: ( ruleQualifiedName )
            {
            // InternalBSharp.g:3267:4: ( ruleQualifiedName )
            // InternalBSharp.g:3268:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInstanceRule());
            					}
            				

            					newCompositeNode(grammarAccess.getInstanceAccess().getClassNameClassDeclCrossReference_1_0());
            				
            pushFollow(FOLLOW_48);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBSharp.g:3282:3: ( (lv_context_2_0= ruleTypeDeclContext ) )
            // InternalBSharp.g:3283:4: (lv_context_2_0= ruleTypeDeclContext )
            {
            // InternalBSharp.g:3283:4: (lv_context_2_0= ruleTypeDeclContext )
            // InternalBSharp.g:3284:5: lv_context_2_0= ruleTypeDeclContext
            {

            					newCompositeNode(grammarAccess.getInstanceAccess().getContextTypeDeclContextParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_27);
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

            otherlv_3=(Token)match(input,32,FOLLOW_46); 

            			newLeafNode(otherlv_3, grammarAccess.getInstanceAccess().getLeftParenthesisKeyword_3());
            		
            // InternalBSharp.g:3305:3: ( (lv_arguments_4_0= ruleRootExpression ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==RULE_ID||LA56_0==32||LA56_0==41||(LA56_0>=43 && LA56_0<=45)||LA56_0==47) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalBSharp.g:3306:4: (lv_arguments_4_0= ruleRootExpression )
                    {
                    // InternalBSharp.g:3306:4: (lv_arguments_4_0= ruleRootExpression )
                    // InternalBSharp.g:3307:5: lv_arguments_4_0= ruleRootExpression
                    {

                    					newCompositeNode(grammarAccess.getInstanceAccess().getArgumentsRootExpressionParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_37);
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

            // InternalBSharp.g:3324:3: (otherlv_5= ',' ( (lv_arguments_6_0= ruleRootExpression ) ) )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==21) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // InternalBSharp.g:3325:4: otherlv_5= ',' ( (lv_arguments_6_0= ruleRootExpression ) )
            	    {
            	    otherlv_5=(Token)match(input,21,FOLLOW_21); 

            	    				newLeafNode(otherlv_5, grammarAccess.getInstanceAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalBSharp.g:3329:4: ( (lv_arguments_6_0= ruleRootExpression ) )
            	    // InternalBSharp.g:3330:5: (lv_arguments_6_0= ruleRootExpression )
            	    {
            	    // InternalBSharp.g:3330:5: (lv_arguments_6_0= ruleRootExpression )
            	    // InternalBSharp.g:3331:6: lv_arguments_6_0= ruleRootExpression
            	    {

            	    						newCompositeNode(grammarAccess.getInstanceAccess().getArgumentsRootExpressionParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_37);
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
            	    break loop57;
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x004000280002C000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001070L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0040002800020002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000045000C1000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000100000020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00000000FFC00002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000BA0100000020L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000001000080000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00000055000C1000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000048000000020L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000100080000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000200000020L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000BB0100000030L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000BA0100000030L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000009000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000100001000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000200200000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000008000001070L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000201000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000800100000020L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x003F000000000022L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000100080002L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000BA0300200020L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000080000L});

}