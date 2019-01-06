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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_WS", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ANY_OTHER", "'package'", "':'", "'.'", "'From'", "'Import'", "'*'", "'Class'", "'['", "']'", "'('", "')'", "';'", "'<'", "'>'", "','", "'\\u00D7'", "'\\u2192'", "'\\uE102'", "'\\uE100'", "'\\u2194'", "'\\u2916'", "'\\u21F8'", "'\\u21A3'", "'\\u2900'", "'\\u21A0'", "'\\u2119'", "'where'", "'Datatype'", "'|'", "'Extend'", "'{'", "'}'", "'INFIX'", "'match'", "'Theorems'", "'\\u03BB'", "'\\u2200'", "'\\u2203'", "'\\u00B7'", "'\\u00AC'", "'\\u21D4'", "'\\u21D2'", "'='", "'\\u2260'", "'\\u2227'", "'\\u2228'", "'Instance'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
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
    // InternalBSharp.g:181:1: ruleTopLevelFile returns [EObject current=null] : ( () ( (lv_noImportElements_1_0= ruleTopLevelInstance ) )* ( (lv_topLevelImports_2_0= ruleTopLevelImport ) )* ) ;
    public final EObject ruleTopLevelFile() throws RecognitionException {
        EObject current = null;

        EObject lv_noImportElements_1_0 = null;

        EObject lv_topLevelImports_2_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:187:2: ( ( () ( (lv_noImportElements_1_0= ruleTopLevelInstance ) )* ( (lv_topLevelImports_2_0= ruleTopLevelImport ) )* ) )
            // InternalBSharp.g:188:2: ( () ( (lv_noImportElements_1_0= ruleTopLevelInstance ) )* ( (lv_topLevelImports_2_0= ruleTopLevelImport ) )* )
            {
            // InternalBSharp.g:188:2: ( () ( (lv_noImportElements_1_0= ruleTopLevelInstance ) )* ( (lv_topLevelImports_2_0= ruleTopLevelImport ) )* )
            // InternalBSharp.g:189:3: () ( (lv_noImportElements_1_0= ruleTopLevelInstance ) )* ( (lv_topLevelImports_2_0= ruleTopLevelImport ) )*
            {
            // InternalBSharp.g:189:3: ()
            // InternalBSharp.g:190:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTopLevelFileAccess().getTopLevelFileAction_0(),
            					current);
            			

            }

            // InternalBSharp.g:196:3: ( (lv_noImportElements_1_0= ruleTopLevelInstance ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==17||LA2_0==38||LA2_0==40) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalBSharp.g:197:4: (lv_noImportElements_1_0= ruleTopLevelInstance )
            	    {
            	    // InternalBSharp.g:197:4: (lv_noImportElements_1_0= ruleTopLevelInstance )
            	    // InternalBSharp.g:198:5: lv_noImportElements_1_0= ruleTopLevelInstance
            	    {

            	    					newCompositeNode(grammarAccess.getTopLevelFileAccess().getNoImportElementsTopLevelInstanceParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_noImportElements_1_0=ruleTopLevelInstance();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTopLevelFileRule());
            	    					}
            	    					add(
            	    						current,
            	    						"noImportElements",
            	    						lv_noImportElements_1_0,
            	    						"ac.soton.bsharp.BSharp.TopLevelInstance");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

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
            	    				
            	    pushFollow(FOLLOW_7);
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
            else if ( (LA4_0==38) ) {
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
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_8); 

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
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_8); 

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
    // InternalBSharp.g:346:1: ruleTopLevelImport returns [EObject current=null] : ( ( ( (lv_globalImports_0_0= ruleGlobalImport ) ) | ( (lv_localImports_1_0= ruleLocalImport ) ) )+ ( (lv_bodyElements_2_0= ruleTopLevelInstance ) )+ ) ;
    public final EObject ruleTopLevelImport() throws RecognitionException {
        EObject current = null;

        EObject lv_globalImports_0_0 = null;

        EObject lv_localImports_1_0 = null;

        EObject lv_bodyElements_2_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:352:2: ( ( ( ( (lv_globalImports_0_0= ruleGlobalImport ) ) | ( (lv_localImports_1_0= ruleLocalImport ) ) )+ ( (lv_bodyElements_2_0= ruleTopLevelInstance ) )+ ) )
            // InternalBSharp.g:353:2: ( ( ( (lv_globalImports_0_0= ruleGlobalImport ) ) | ( (lv_localImports_1_0= ruleLocalImport ) ) )+ ( (lv_bodyElements_2_0= ruleTopLevelInstance ) )+ )
            {
            // InternalBSharp.g:353:2: ( ( ( (lv_globalImports_0_0= ruleGlobalImport ) ) | ( (lv_localImports_1_0= ruleLocalImport ) ) )+ ( (lv_bodyElements_2_0= ruleTopLevelInstance ) )+ )
            // InternalBSharp.g:354:3: ( ( (lv_globalImports_0_0= ruleGlobalImport ) ) | ( (lv_localImports_1_0= ruleLocalImport ) ) )+ ( (lv_bodyElements_2_0= ruleTopLevelInstance ) )+
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

            // InternalBSharp.g:395:3: ( (lv_bodyElements_2_0= ruleTopLevelInstance ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==17||LA7_0==38||LA7_0==40) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalBSharp.g:396:4: (lv_bodyElements_2_0= ruleTopLevelInstance )
            	    {
            	    // InternalBSharp.g:396:4: (lv_bodyElements_2_0= ruleTopLevelInstance )
            	    // InternalBSharp.g:397:5: lv_bodyElements_2_0= ruleTopLevelInstance
            	    {

            	    					newCompositeNode(grammarAccess.getTopLevelImportAccess().getBodyElementsTopLevelInstanceParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_bodyElements_2_0=ruleTopLevelInstance();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTopLevelImportRule());
            	    					}
            	    					add(
            	    						current,
            	    						"bodyElements",
            	    						lv_bodyElements_2_0,
            	    						"ac.soton.bsharp.BSharp.TopLevelInstance");
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


    // $ANTLR start "entryRuleTopLevelInstance"
    // InternalBSharp.g:418:1: entryRuleTopLevelInstance returns [EObject current=null] : iv_ruleTopLevelInstance= ruleTopLevelInstance EOF ;
    public final EObject entryRuleTopLevelInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTopLevelInstance = null;


        try {
            // InternalBSharp.g:418:57: (iv_ruleTopLevelInstance= ruleTopLevelInstance EOF )
            // InternalBSharp.g:419:2: iv_ruleTopLevelInstance= ruleTopLevelInstance EOF
            {
             newCompositeNode(grammarAccess.getTopLevelInstanceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTopLevelInstance=ruleTopLevelInstance();

            state._fsp--;

             current =iv_ruleTopLevelInstance; 
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
    // $ANTLR end "entryRuleTopLevelInstance"


    // $ANTLR start "ruleTopLevelInstance"
    // InternalBSharp.g:425:1: ruleTopLevelInstance returns [EObject current=null] : (this_ClassDecl_0= ruleClassDecl | this_Extend_1= ruleExtend ) ;
    public final EObject ruleTopLevelInstance() throws RecognitionException {
        EObject current = null;

        EObject this_ClassDecl_0 = null;

        EObject this_Extend_1 = null;



        	enterRule();

        try {
            // InternalBSharp.g:431:2: ( (this_ClassDecl_0= ruleClassDecl | this_Extend_1= ruleExtend ) )
            // InternalBSharp.g:432:2: (this_ClassDecl_0= ruleClassDecl | this_Extend_1= ruleExtend )
            {
            // InternalBSharp.g:432:2: (this_ClassDecl_0= ruleClassDecl | this_Extend_1= ruleExtend )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==17||LA8_0==38) ) {
                alt8=1;
            }
            else if ( (LA8_0==40) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalBSharp.g:433:3: this_ClassDecl_0= ruleClassDecl
                    {

                    			newCompositeNode(grammarAccess.getTopLevelInstanceAccess().getClassDeclParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ClassDecl_0=ruleClassDecl();

                    state._fsp--;


                    			current = this_ClassDecl_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalBSharp.g:442:3: this_Extend_1= ruleExtend
                    {

                    			newCompositeNode(grammarAccess.getTopLevelInstanceAccess().getExtendParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Extend_1=ruleExtend();

                    state._fsp--;


                    			current = this_Extend_1;
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
    // $ANTLR end "ruleTopLevelInstance"


    // $ANTLR start "entryRuleGlobalImport"
    // InternalBSharp.g:454:1: entryRuleGlobalImport returns [EObject current=null] : iv_ruleGlobalImport= ruleGlobalImport EOF ;
    public final EObject entryRuleGlobalImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGlobalImport = null;


        try {
            // InternalBSharp.g:454:53: (iv_ruleGlobalImport= ruleGlobalImport EOF )
            // InternalBSharp.g:455:2: iv_ruleGlobalImport= ruleGlobalImport EOF
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
    // InternalBSharp.g:461:1: ruleGlobalImport returns [EObject current=null] : (otherlv_0= 'From' ( (lv_project_1_0= ruleQualifiedName ) ) otherlv_2= 'Import' ( (lv_fileImports_3_0= ruleFileImport ) )+ ) ;
    public final EObject ruleGlobalImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_project_1_0 = null;

        EObject lv_fileImports_3_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:467:2: ( (otherlv_0= 'From' ( (lv_project_1_0= ruleQualifiedName ) ) otherlv_2= 'Import' ( (lv_fileImports_3_0= ruleFileImport ) )+ ) )
            // InternalBSharp.g:468:2: (otherlv_0= 'From' ( (lv_project_1_0= ruleQualifiedName ) ) otherlv_2= 'Import' ( (lv_fileImports_3_0= ruleFileImport ) )+ )
            {
            // InternalBSharp.g:468:2: (otherlv_0= 'From' ( (lv_project_1_0= ruleQualifiedName ) ) otherlv_2= 'Import' ( (lv_fileImports_3_0= ruleFileImport ) )+ )
            // InternalBSharp.g:469:3: otherlv_0= 'From' ( (lv_project_1_0= ruleQualifiedName ) ) otherlv_2= 'Import' ( (lv_fileImports_3_0= ruleFileImport ) )+
            {
            otherlv_0=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getGlobalImportAccess().getFromKeyword_0());
            		
            // InternalBSharp.g:473:3: ( (lv_project_1_0= ruleQualifiedName ) )
            // InternalBSharp.g:474:4: (lv_project_1_0= ruleQualifiedName )
            {
            // InternalBSharp.g:474:4: (lv_project_1_0= ruleQualifiedName )
            // InternalBSharp.g:475:5: lv_project_1_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getGlobalImportAccess().getProjectQualifiedNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_10);
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
            		
            // InternalBSharp.g:496:3: ( (lv_fileImports_3_0= ruleFileImport ) )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalBSharp.g:497:4: (lv_fileImports_3_0= ruleFileImport )
            	    {
            	    // InternalBSharp.g:497:4: (lv_fileImports_3_0= ruleFileImport )
            	    // InternalBSharp.g:498:5: lv_fileImports_3_0= ruleFileImport
            	    {

            	    					newCompositeNode(grammarAccess.getGlobalImportAccess().getFileImportsFileImportParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_11);
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
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
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
    // InternalBSharp.g:519:1: entryRuleFileImport returns [EObject current=null] : iv_ruleFileImport= ruleFileImport EOF ;
    public final EObject entryRuleFileImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFileImport = null;


        try {
            // InternalBSharp.g:519:51: (iv_ruleFileImport= ruleFileImport EOF )
            // InternalBSharp.g:520:2: iv_ruleFileImport= ruleFileImport EOF
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
    // InternalBSharp.g:526:1: ruleFileImport returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' (otherlv_2= '*' | ( (lv_type_3_0= RULE_ID ) ) ) )? ) ;
    public final EObject ruleFileImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_type_3_0=null;


        	enterRule();

        try {
            // InternalBSharp.g:532:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' (otherlv_2= '*' | ( (lv_type_3_0= RULE_ID ) ) ) )? ) )
            // InternalBSharp.g:533:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' (otherlv_2= '*' | ( (lv_type_3_0= RULE_ID ) ) ) )? )
            {
            // InternalBSharp.g:533:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' (otherlv_2= '*' | ( (lv_type_3_0= RULE_ID ) ) ) )? )
            // InternalBSharp.g:534:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' (otherlv_2= '*' | ( (lv_type_3_0= RULE_ID ) ) ) )?
            {
            // InternalBSharp.g:534:3: ( (otherlv_0= RULE_ID ) )
            // InternalBSharp.g:535:4: (otherlv_0= RULE_ID )
            {
            // InternalBSharp.g:535:4: (otherlv_0= RULE_ID )
            // InternalBSharp.g:536:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFileImportRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(otherlv_0, grammarAccess.getFileImportAccess().getFileReferenceTopLevelFileCrossReference_0_0());
            				

            }


            }

            // InternalBSharp.g:547:3: (otherlv_1= '.' (otherlv_2= '*' | ( (lv_type_3_0= RULE_ID ) ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==13) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalBSharp.g:548:4: otherlv_1= '.' (otherlv_2= '*' | ( (lv_type_3_0= RULE_ID ) ) )
                    {
                    otherlv_1=(Token)match(input,13,FOLLOW_12); 

                    				newLeafNode(otherlv_1, grammarAccess.getFileImportAccess().getFullStopKeyword_1_0());
                    			
                    // InternalBSharp.g:552:4: (otherlv_2= '*' | ( (lv_type_3_0= RULE_ID ) ) )
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==16) ) {
                        alt10=1;
                    }
                    else if ( (LA10_0==RULE_ID) ) {
                        alt10=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 0, input);

                        throw nvae;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalBSharp.g:553:5: otherlv_2= '*'
                            {
                            otherlv_2=(Token)match(input,16,FOLLOW_2); 

                            					newLeafNode(otherlv_2, grammarAccess.getFileImportAccess().getAsteriskKeyword_1_1_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalBSharp.g:558:5: ( (lv_type_3_0= RULE_ID ) )
                            {
                            // InternalBSharp.g:558:5: ( (lv_type_3_0= RULE_ID ) )
                            // InternalBSharp.g:559:6: (lv_type_3_0= RULE_ID )
                            {
                            // InternalBSharp.g:559:6: (lv_type_3_0= RULE_ID )
                            // InternalBSharp.g:560:7: lv_type_3_0= RULE_ID
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
    // InternalBSharp.g:582:1: entryRuleLocalImport returns [EObject current=null] : iv_ruleLocalImport= ruleLocalImport EOF ;
    public final EObject entryRuleLocalImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalImport = null;


        try {
            // InternalBSharp.g:582:52: (iv_ruleLocalImport= ruleLocalImport EOF )
            // InternalBSharp.g:583:2: iv_ruleLocalImport= ruleLocalImport EOF
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
    // InternalBSharp.g:589:1: ruleLocalImport returns [EObject current=null] : (otherlv_0= 'Import' ( (lv_fileImports_1_0= ruleFileImport ) )+ ) ;
    public final EObject ruleLocalImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_fileImports_1_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:595:2: ( (otherlv_0= 'Import' ( (lv_fileImports_1_0= ruleFileImport ) )+ ) )
            // InternalBSharp.g:596:2: (otherlv_0= 'Import' ( (lv_fileImports_1_0= ruleFileImport ) )+ )
            {
            // InternalBSharp.g:596:2: (otherlv_0= 'Import' ( (lv_fileImports_1_0= ruleFileImport ) )+ )
            // InternalBSharp.g:597:3: otherlv_0= 'Import' ( (lv_fileImports_1_0= ruleFileImport ) )+
            {
            otherlv_0=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLocalImportAccess().getImportKeyword_0());
            		
            // InternalBSharp.g:601:3: ( (lv_fileImports_1_0= ruleFileImport ) )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalBSharp.g:602:4: (lv_fileImports_1_0= ruleFileImport )
            	    {
            	    // InternalBSharp.g:602:4: (lv_fileImports_1_0= ruleFileImport )
            	    // InternalBSharp.g:603:5: lv_fileImports_1_0= ruleFileImport
            	    {

            	    					newCompositeNode(grammarAccess.getLocalImportAccess().getFileImportsFileImportParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_11);
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
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
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
    // InternalBSharp.g:624:1: entryRuleClass returns [EObject current=null] : iv_ruleClass= ruleClass EOF ;
    public final EObject entryRuleClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClass = null;


        try {
            // InternalBSharp.g:624:46: (iv_ruleClass= ruleClass EOF )
            // InternalBSharp.g:625:2: iv_ruleClass= ruleClass EOF
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
    // InternalBSharp.g:631:1: ruleClass returns [EObject current=null] : (otherlv_0= 'Class' ( (lv_name_1_0= RULE_ID ) ) ( (lv_context_2_0= rulePolyContext ) )? (otherlv_3= '[' ( (lv_instName_4_0= ruleInstName ) ) otherlv_5= ']' ) ( (lv_supertypes_6_0= ruleSuperTypeList ) )? (otherlv_7= '(' ( (lv_varList_8_0= ruleTypedVariableList ) ) otherlv_9= ')' )? ( (lv_where_10_0= ruleWhere ) )? (otherlv_11= ';' )? ( (lv_block_12_0= ruleBSharpBlock ) ) ) ;
    public final EObject ruleClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_context_2_0 = null;

        EObject lv_instName_4_0 = null;

        EObject lv_supertypes_6_0 = null;

        EObject lv_varList_8_0 = null;

        EObject lv_where_10_0 = null;

        EObject lv_block_12_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:637:2: ( (otherlv_0= 'Class' ( (lv_name_1_0= RULE_ID ) ) ( (lv_context_2_0= rulePolyContext ) )? (otherlv_3= '[' ( (lv_instName_4_0= ruleInstName ) ) otherlv_5= ']' ) ( (lv_supertypes_6_0= ruleSuperTypeList ) )? (otherlv_7= '(' ( (lv_varList_8_0= ruleTypedVariableList ) ) otherlv_9= ')' )? ( (lv_where_10_0= ruleWhere ) )? (otherlv_11= ';' )? ( (lv_block_12_0= ruleBSharpBlock ) ) ) )
            // InternalBSharp.g:638:2: (otherlv_0= 'Class' ( (lv_name_1_0= RULE_ID ) ) ( (lv_context_2_0= rulePolyContext ) )? (otherlv_3= '[' ( (lv_instName_4_0= ruleInstName ) ) otherlv_5= ']' ) ( (lv_supertypes_6_0= ruleSuperTypeList ) )? (otherlv_7= '(' ( (lv_varList_8_0= ruleTypedVariableList ) ) otherlv_9= ')' )? ( (lv_where_10_0= ruleWhere ) )? (otherlv_11= ';' )? ( (lv_block_12_0= ruleBSharpBlock ) ) )
            {
            // InternalBSharp.g:638:2: (otherlv_0= 'Class' ( (lv_name_1_0= RULE_ID ) ) ( (lv_context_2_0= rulePolyContext ) )? (otherlv_3= '[' ( (lv_instName_4_0= ruleInstName ) ) otherlv_5= ']' ) ( (lv_supertypes_6_0= ruleSuperTypeList ) )? (otherlv_7= '(' ( (lv_varList_8_0= ruleTypedVariableList ) ) otherlv_9= ')' )? ( (lv_where_10_0= ruleWhere ) )? (otherlv_11= ';' )? ( (lv_block_12_0= ruleBSharpBlock ) ) )
            // InternalBSharp.g:639:3: otherlv_0= 'Class' ( (lv_name_1_0= RULE_ID ) ) ( (lv_context_2_0= rulePolyContext ) )? (otherlv_3= '[' ( (lv_instName_4_0= ruleInstName ) ) otherlv_5= ']' ) ( (lv_supertypes_6_0= ruleSuperTypeList ) )? (otherlv_7= '(' ( (lv_varList_8_0= ruleTypedVariableList ) ) otherlv_9= ')' )? ( (lv_where_10_0= ruleWhere ) )? (otherlv_11= ';' )? ( (lv_block_12_0= ruleBSharpBlock ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getClassAccess().getClassKeyword_0());
            		
            // InternalBSharp.g:643:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalBSharp.g:644:4: (lv_name_1_0= RULE_ID )
            {
            // InternalBSharp.g:644:4: (lv_name_1_0= RULE_ID )
            // InternalBSharp.g:645:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_13); 

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

            // InternalBSharp.g:661:3: ( (lv_context_2_0= rulePolyContext ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==23) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalBSharp.g:662:4: (lv_context_2_0= rulePolyContext )
                    {
                    // InternalBSharp.g:662:4: (lv_context_2_0= rulePolyContext )
                    // InternalBSharp.g:663:5: lv_context_2_0= rulePolyContext
                    {

                    					newCompositeNode(grammarAccess.getClassAccess().getContextPolyContextParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_14);
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

            // InternalBSharp.g:680:3: (otherlv_3= '[' ( (lv_instName_4_0= ruleInstName ) ) otherlv_5= ']' )
            // InternalBSharp.g:681:4: otherlv_3= '[' ( (lv_instName_4_0= ruleInstName ) ) otherlv_5= ']'
            {
            otherlv_3=(Token)match(input,18,FOLLOW_3); 

            				newLeafNode(otherlv_3, grammarAccess.getClassAccess().getLeftSquareBracketKeyword_3_0());
            			
            // InternalBSharp.g:685:4: ( (lv_instName_4_0= ruleInstName ) )
            // InternalBSharp.g:686:5: (lv_instName_4_0= ruleInstName )
            {
            // InternalBSharp.g:686:5: (lv_instName_4_0= ruleInstName )
            // InternalBSharp.g:687:6: lv_instName_4_0= ruleInstName
            {

            						newCompositeNode(grammarAccess.getClassAccess().getInstNameInstNameParserRuleCall_3_1_0());
            					
            pushFollow(FOLLOW_15);
            lv_instName_4_0=ruleInstName();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getClassRule());
            						}
            						set(
            							current,
            							"instName",
            							lv_instName_4_0,
            							"ac.soton.bsharp.BSharp.InstName");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            otherlv_5=(Token)match(input,19,FOLLOW_16); 

            				newLeafNode(otherlv_5, grammarAccess.getClassAccess().getRightSquareBracketKeyword_3_2());
            			

            }

            // InternalBSharp.g:709:3: ( (lv_supertypes_6_0= ruleSuperTypeList ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==12) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalBSharp.g:710:4: (lv_supertypes_6_0= ruleSuperTypeList )
                    {
                    // InternalBSharp.g:710:4: (lv_supertypes_6_0= ruleSuperTypeList )
                    // InternalBSharp.g:711:5: lv_supertypes_6_0= ruleSuperTypeList
                    {

                    					newCompositeNode(grammarAccess.getClassAccess().getSupertypesSuperTypeListParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_16);
                    lv_supertypes_6_0=ruleSuperTypeList();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getClassRule());
                    					}
                    					set(
                    						current,
                    						"supertypes",
                    						lv_supertypes_6_0,
                    						"ac.soton.bsharp.BSharp.SuperTypeList");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalBSharp.g:728:3: (otherlv_7= '(' ( (lv_varList_8_0= ruleTypedVariableList ) ) otherlv_9= ')' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==20) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalBSharp.g:729:4: otherlv_7= '(' ( (lv_varList_8_0= ruleTypedVariableList ) ) otherlv_9= ')'
                    {
                    otherlv_7=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getClassAccess().getLeftParenthesisKeyword_5_0());
                    			
                    // InternalBSharp.g:733:4: ( (lv_varList_8_0= ruleTypedVariableList ) )
                    // InternalBSharp.g:734:5: (lv_varList_8_0= ruleTypedVariableList )
                    {
                    // InternalBSharp.g:734:5: (lv_varList_8_0= ruleTypedVariableList )
                    // InternalBSharp.g:735:6: lv_varList_8_0= ruleTypedVariableList
                    {

                    						newCompositeNode(grammarAccess.getClassAccess().getVarListTypedVariableListParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_varList_8_0=ruleTypedVariableList();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getClassRule());
                    						}
                    						set(
                    							current,
                    							"varList",
                    							lv_varList_8_0,
                    							"ac.soton.bsharp.BSharp.TypedVariableList");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_9=(Token)match(input,21,FOLLOW_16); 

                    				newLeafNode(otherlv_9, grammarAccess.getClassAccess().getRightParenthesisKeyword_5_2());
                    			

                    }
                    break;

            }

            // InternalBSharp.g:757:3: ( (lv_where_10_0= ruleWhere ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==37) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalBSharp.g:758:4: (lv_where_10_0= ruleWhere )
                    {
                    // InternalBSharp.g:758:4: (lv_where_10_0= ruleWhere )
                    // InternalBSharp.g:759:5: lv_where_10_0= ruleWhere
                    {

                    					newCompositeNode(grammarAccess.getClassAccess().getWhereWhereParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_16);
                    lv_where_10_0=ruleWhere();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getClassRule());
                    					}
                    					set(
                    						current,
                    						"where",
                    						lv_where_10_0,
                    						"ac.soton.bsharp.BSharp.Where");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalBSharp.g:776:3: (otherlv_11= ';' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==22) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalBSharp.g:777:4: otherlv_11= ';'
                    {
                    otherlv_11=(Token)match(input,22,FOLLOW_16); 

                    				newLeafNode(otherlv_11, grammarAccess.getClassAccess().getSemicolonKeyword_7());
                    			

                    }
                    break;

            }

            // InternalBSharp.g:782:3: ( (lv_block_12_0= ruleBSharpBlock ) )
            // InternalBSharp.g:783:4: (lv_block_12_0= ruleBSharpBlock )
            {
            // InternalBSharp.g:783:4: (lv_block_12_0= ruleBSharpBlock )
            // InternalBSharp.g:784:5: lv_block_12_0= ruleBSharpBlock
            {

            					newCompositeNode(grammarAccess.getClassAccess().getBlockBSharpBlockParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_2);
            lv_block_12_0=ruleBSharpBlock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getClassRule());
            					}
            					set(
            						current,
            						"block",
            						lv_block_12_0,
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


    // $ANTLR start "entryRuleInstName"
    // InternalBSharp.g:805:1: entryRuleInstName returns [EObject current=null] : iv_ruleInstName= ruleInstName EOF ;
    public final EObject entryRuleInstName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstName = null;


        try {
            // InternalBSharp.g:805:49: (iv_ruleInstName= ruleInstName EOF )
            // InternalBSharp.g:806:2: iv_ruleInstName= ruleInstName EOF
            {
             newCompositeNode(grammarAccess.getInstNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInstName=ruleInstName();

            state._fsp--;

             current =iv_ruleInstName; 
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
    // $ANTLR end "entryRuleInstName"


    // $ANTLR start "ruleInstName"
    // InternalBSharp.g:812:1: ruleInstName returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleInstName() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalBSharp.g:818:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalBSharp.g:819:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalBSharp.g:819:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalBSharp.g:820:3: (lv_name_0_0= RULE_ID )
            {
            // InternalBSharp.g:820:3: (lv_name_0_0= RULE_ID )
            // InternalBSharp.g:821:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getInstNameAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getInstNameRule());
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
    // $ANTLR end "ruleInstName"


    // $ANTLR start "entryRulePolyContext"
    // InternalBSharp.g:840:1: entryRulePolyContext returns [EObject current=null] : iv_rulePolyContext= rulePolyContext EOF ;
    public final EObject entryRulePolyContext() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePolyContext = null;


        try {
            // InternalBSharp.g:840:52: (iv_rulePolyContext= rulePolyContext EOF )
            // InternalBSharp.g:841:2: iv_rulePolyContext= rulePolyContext EOF
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
    // InternalBSharp.g:847:1: rulePolyContext returns [EObject current=null] : (otherlv_0= '<' ( (lv_polyTypes_1_0= rulePolyType ) )+ otherlv_2= '>' ) ;
    public final EObject rulePolyContext() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_polyTypes_1_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:853:2: ( (otherlv_0= '<' ( (lv_polyTypes_1_0= rulePolyType ) )+ otherlv_2= '>' ) )
            // InternalBSharp.g:854:2: (otherlv_0= '<' ( (lv_polyTypes_1_0= rulePolyType ) )+ otherlv_2= '>' )
            {
            // InternalBSharp.g:854:2: (otherlv_0= '<' ( (lv_polyTypes_1_0= rulePolyType ) )+ otherlv_2= '>' )
            // InternalBSharp.g:855:3: otherlv_0= '<' ( (lv_polyTypes_1_0= rulePolyType ) )+ otherlv_2= '>'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPolyContextAccess().getLessThanSignKeyword_0());
            		
            // InternalBSharp.g:859:3: ( (lv_polyTypes_1_0= rulePolyType ) )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalBSharp.g:860:4: (lv_polyTypes_1_0= rulePolyType )
            	    {
            	    // InternalBSharp.g:860:4: (lv_polyTypes_1_0= rulePolyType )
            	    // InternalBSharp.g:861:5: lv_polyTypes_1_0= rulePolyType
            	    {

            	    					newCompositeNode(grammarAccess.getPolyContextAccess().getPolyTypesPolyTypeParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_18);
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
            	    if ( cnt18 >= 1 ) break loop18;
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
            } while (true);

            otherlv_2=(Token)match(input,24,FOLLOW_2); 

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
    // InternalBSharp.g:886:1: entryRulePolyType returns [EObject current=null] : iv_rulePolyType= rulePolyType EOF ;
    public final EObject entryRulePolyType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePolyType = null;


        try {
            // InternalBSharp.g:886:49: (iv_rulePolyType= rulePolyType EOF )
            // InternalBSharp.g:887:2: iv_rulePolyType= rulePolyType EOF
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
    // InternalBSharp.g:893:1: rulePolyType returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ':' ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )* )? ) ;
    public final EObject rulePolyType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalBSharp.g:899:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ':' ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )* )? ) )
            // InternalBSharp.g:900:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ':' ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )* )? )
            {
            // InternalBSharp.g:900:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ':' ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )* )? )
            // InternalBSharp.g:901:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ':' ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )* )?
            {
            // InternalBSharp.g:901:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalBSharp.g:902:4: (lv_name_0_0= RULE_ID )
            {
            // InternalBSharp.g:902:4: (lv_name_0_0= RULE_ID )
            // InternalBSharp.g:903:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_19); 

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

            // InternalBSharp.g:919:3: (otherlv_1= ':' ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==12) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalBSharp.g:920:4: otherlv_1= ':' ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_1=(Token)match(input,12,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getPolyTypeAccess().getColonKeyword_1_0());
                    			
                    // InternalBSharp.g:924:4: ( ( ruleQualifiedName ) )
                    // InternalBSharp.g:925:5: ( ruleQualifiedName )
                    {
                    // InternalBSharp.g:925:5: ( ruleQualifiedName )
                    // InternalBSharp.g:926:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPolyTypeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getPolyTypeAccess().getSuperTypesClassDeclCrossReference_1_1_0());
                    					
                    pushFollow(FOLLOW_20);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBSharp.g:940:4: (otherlv_3= ',' ( ( ruleQualifiedName ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==25) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalBSharp.g:941:5: otherlv_3= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_3=(Token)match(input,25,FOLLOW_3); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getPolyTypeAccess().getCommaKeyword_1_2_0());
                    	    				
                    	    // InternalBSharp.g:945:5: ( ( ruleQualifiedName ) )
                    	    // InternalBSharp.g:946:6: ( ruleQualifiedName )
                    	    {
                    	    // InternalBSharp.g:946:6: ( ruleQualifiedName )
                    	    // InternalBSharp.g:947:7: ruleQualifiedName
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getPolyTypeRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getPolyTypeAccess().getSuperTypesClassDeclCrossReference_1_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_20);
                    	    ruleQualifiedName();

                    	    state._fsp--;


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
    // InternalBSharp.g:967:1: entryRuleSuperTypeList returns [EObject current=null] : iv_ruleSuperTypeList= ruleSuperTypeList EOF ;
    public final EObject entryRuleSuperTypeList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSuperTypeList = null;


        try {
            // InternalBSharp.g:967:54: (iv_ruleSuperTypeList= ruleSuperTypeList EOF )
            // InternalBSharp.g:968:2: iv_ruleSuperTypeList= ruleSuperTypeList EOF
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
    // InternalBSharp.g:974:1: ruleSuperTypeList returns [EObject current=null] : (otherlv_0= ':' ( (lv_superTypes_1_0= ruleConstructedType ) ) (otherlv_2= ',' ( (lv_superTypes_3_0= ruleConstructedType ) ) )* ) ;
    public final EObject ruleSuperTypeList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_superTypes_1_0 = null;

        EObject lv_superTypes_3_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:980:2: ( (otherlv_0= ':' ( (lv_superTypes_1_0= ruleConstructedType ) ) (otherlv_2= ',' ( (lv_superTypes_3_0= ruleConstructedType ) ) )* ) )
            // InternalBSharp.g:981:2: (otherlv_0= ':' ( (lv_superTypes_1_0= ruleConstructedType ) ) (otherlv_2= ',' ( (lv_superTypes_3_0= ruleConstructedType ) ) )* )
            {
            // InternalBSharp.g:981:2: (otherlv_0= ':' ( (lv_superTypes_1_0= ruleConstructedType ) ) (otherlv_2= ',' ( (lv_superTypes_3_0= ruleConstructedType ) ) )* )
            // InternalBSharp.g:982:3: otherlv_0= ':' ( (lv_superTypes_1_0= ruleConstructedType ) ) (otherlv_2= ',' ( (lv_superTypes_3_0= ruleConstructedType ) ) )*
            {
            otherlv_0=(Token)match(input,12,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getSuperTypeListAccess().getColonKeyword_0());
            		
            // InternalBSharp.g:986:3: ( (lv_superTypes_1_0= ruleConstructedType ) )
            // InternalBSharp.g:987:4: (lv_superTypes_1_0= ruleConstructedType )
            {
            // InternalBSharp.g:987:4: (lv_superTypes_1_0= ruleConstructedType )
            // InternalBSharp.g:988:5: lv_superTypes_1_0= ruleConstructedType
            {

            					newCompositeNode(grammarAccess.getSuperTypeListAccess().getSuperTypesConstructedTypeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_20);
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

            // InternalBSharp.g:1005:3: (otherlv_2= ',' ( (lv_superTypes_3_0= ruleConstructedType ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==25) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalBSharp.g:1006:4: otherlv_2= ',' ( (lv_superTypes_3_0= ruleConstructedType ) )
            	    {
            	    otherlv_2=(Token)match(input,25,FOLLOW_21); 

            	    				newLeafNode(otherlv_2, grammarAccess.getSuperTypeListAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalBSharp.g:1010:4: ( (lv_superTypes_3_0= ruleConstructedType ) )
            	    // InternalBSharp.g:1011:5: (lv_superTypes_3_0= ruleConstructedType )
            	    {
            	    // InternalBSharp.g:1011:5: (lv_superTypes_3_0= ruleConstructedType )
            	    // InternalBSharp.g:1012:6: lv_superTypes_3_0= ruleConstructedType
            	    {

            	    						newCompositeNode(grammarAccess.getSuperTypeListAccess().getSuperTypesConstructedTypeParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_20);
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
            	    break loop21;
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


    // $ANTLR start "entryRuleBuiltinTypeInfixOp"
    // InternalBSharp.g:1034:1: entryRuleBuiltinTypeInfixOp returns [String current=null] : iv_ruleBuiltinTypeInfixOp= ruleBuiltinTypeInfixOp EOF ;
    public final String entryRuleBuiltinTypeInfixOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBuiltinTypeInfixOp = null;


        try {
            // InternalBSharp.g:1034:58: (iv_ruleBuiltinTypeInfixOp= ruleBuiltinTypeInfixOp EOF )
            // InternalBSharp.g:1035:2: iv_ruleBuiltinTypeInfixOp= ruleBuiltinTypeInfixOp EOF
            {
             newCompositeNode(grammarAccess.getBuiltinTypeInfixOpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBuiltinTypeInfixOp=ruleBuiltinTypeInfixOp();

            state._fsp--;

             current =iv_ruleBuiltinTypeInfixOp.getText(); 
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
    // $ANTLR end "entryRuleBuiltinTypeInfixOp"


    // $ANTLR start "ruleBuiltinTypeInfixOp"
    // InternalBSharp.g:1041:1: ruleBuiltinTypeInfixOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '\\u00D7' | kw= '\\u2192' | kw= '\\uE102' | kw= '\\uE100' | kw= '\\u2194' | kw= '\\u2916' | kw= '\\u21F8' | kw= '\\u21A3' | kw= '\\u2900' | kw= '\\u21A0' ) ;
    public final AntlrDatatypeRuleToken ruleBuiltinTypeInfixOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalBSharp.g:1047:2: ( (kw= '\\u00D7' | kw= '\\u2192' | kw= '\\uE102' | kw= '\\uE100' | kw= '\\u2194' | kw= '\\u2916' | kw= '\\u21F8' | kw= '\\u21A3' | kw= '\\u2900' | kw= '\\u21A0' ) )
            // InternalBSharp.g:1048:2: (kw= '\\u00D7' | kw= '\\u2192' | kw= '\\uE102' | kw= '\\uE100' | kw= '\\u2194' | kw= '\\u2916' | kw= '\\u21F8' | kw= '\\u21A3' | kw= '\\u2900' | kw= '\\u21A0' )
            {
            // InternalBSharp.g:1048:2: (kw= '\\u00D7' | kw= '\\u2192' | kw= '\\uE102' | kw= '\\uE100' | kw= '\\u2194' | kw= '\\u2916' | kw= '\\u21F8' | kw= '\\u21A3' | kw= '\\u2900' | kw= '\\u21A0' )
            int alt22=10;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt22=1;
                }
                break;
            case 27:
                {
                alt22=2;
                }
                break;
            case 28:
                {
                alt22=3;
                }
                break;
            case 29:
                {
                alt22=4;
                }
                break;
            case 30:
                {
                alt22=5;
                }
                break;
            case 31:
                {
                alt22=6;
                }
                break;
            case 32:
                {
                alt22=7;
                }
                break;
            case 33:
                {
                alt22=8;
                }
                break;
            case 34:
                {
                alt22=9;
                }
                break;
            case 35:
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
                    // InternalBSharp.g:1049:3: kw= '\\u00D7'
                    {
                    kw=(Token)match(input,26,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBuiltinTypeInfixOpAccess().getMultiplicationSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalBSharp.g:1055:3: kw= '\\u2192'
                    {
                    kw=(Token)match(input,27,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBuiltinTypeInfixOpAccess().getRightwardsArrowKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalBSharp.g:1061:3: kw= '\\uE102'
                    {
                    kw=(Token)match(input,28,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBuiltinTypeInfixOpAccess().getPrivateUseAreaE102Keyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalBSharp.g:1067:3: kw= '\\uE100'
                    {
                    kw=(Token)match(input,29,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBuiltinTypeInfixOpAccess().getPrivateUseAreaE100Keyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalBSharp.g:1073:3: kw= '\\u2194'
                    {
                    kw=(Token)match(input,30,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBuiltinTypeInfixOpAccess().getLeftRightArrowKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalBSharp.g:1079:3: kw= '\\u2916'
                    {
                    kw=(Token)match(input,31,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBuiltinTypeInfixOpAccess().getRightwardsTwoHeadedArrowWithTailKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalBSharp.g:1085:3: kw= '\\u21F8'
                    {
                    kw=(Token)match(input,32,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBuiltinTypeInfixOpAccess().getRightwardsArrowWithVerticalStrokeKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalBSharp.g:1091:3: kw= '\\u21A3'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBuiltinTypeInfixOpAccess().getRightwardsArrowWithTailKeyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalBSharp.g:1097:3: kw= '\\u2900'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBuiltinTypeInfixOpAccess().getRightwardsTwoHeadedArrowWithVerticalStrokeKeyword_8());
                    		

                    }
                    break;
                case 10 :
                    // InternalBSharp.g:1103:3: kw= '\\u21A0'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBuiltinTypeInfixOpAccess().getRightwardsTwoHeadedArrowKeyword_9());
                    		

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
    // $ANTLR end "ruleBuiltinTypeInfixOp"


    // $ANTLR start "entryRuleConstructedType"
    // InternalBSharp.g:1112:1: entryRuleConstructedType returns [EObject current=null] : iv_ruleConstructedType= ruleConstructedType EOF ;
    public final EObject entryRuleConstructedType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstructedType = null;


        try {
            // InternalBSharp.g:1112:56: (iv_ruleConstructedType= ruleConstructedType EOF )
            // InternalBSharp.g:1113:2: iv_ruleConstructedType= ruleConstructedType EOF
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
    // InternalBSharp.g:1119:1: ruleConstructedType returns [EObject current=null] : (this_BuilderElem_0= ruleBuilderElem ( () ( (lv_constructor_2_0= ruleBuiltinTypeInfixOp ) ) ( (lv_right_3_0= ruleBuilderElem ) ) )* ) ;
    public final EObject ruleConstructedType() throws RecognitionException {
        EObject current = null;

        EObject this_BuilderElem_0 = null;

        AntlrDatatypeRuleToken lv_constructor_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:1125:2: ( (this_BuilderElem_0= ruleBuilderElem ( () ( (lv_constructor_2_0= ruleBuiltinTypeInfixOp ) ) ( (lv_right_3_0= ruleBuilderElem ) ) )* ) )
            // InternalBSharp.g:1126:2: (this_BuilderElem_0= ruleBuilderElem ( () ( (lv_constructor_2_0= ruleBuiltinTypeInfixOp ) ) ( (lv_right_3_0= ruleBuilderElem ) ) )* )
            {
            // InternalBSharp.g:1126:2: (this_BuilderElem_0= ruleBuilderElem ( () ( (lv_constructor_2_0= ruleBuiltinTypeInfixOp ) ) ( (lv_right_3_0= ruleBuilderElem ) ) )* )
            // InternalBSharp.g:1127:3: this_BuilderElem_0= ruleBuilderElem ( () ( (lv_constructor_2_0= ruleBuiltinTypeInfixOp ) ) ( (lv_right_3_0= ruleBuilderElem ) ) )*
            {

            			newCompositeNode(grammarAccess.getConstructedTypeAccess().getBuilderElemParserRuleCall_0());
            		
            pushFollow(FOLLOW_22);
            this_BuilderElem_0=ruleBuilderElem();

            state._fsp--;


            			current = this_BuilderElem_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalBSharp.g:1135:3: ( () ( (lv_constructor_2_0= ruleBuiltinTypeInfixOp ) ) ( (lv_right_3_0= ruleBuilderElem ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=26 && LA23_0<=35)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalBSharp.g:1136:4: () ( (lv_constructor_2_0= ruleBuiltinTypeInfixOp ) ) ( (lv_right_3_0= ruleBuilderElem ) )
            	    {
            	    // InternalBSharp.g:1136:4: ()
            	    // InternalBSharp.g:1137:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getConstructedTypeAccess().getConstructedTypeLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalBSharp.g:1143:4: ( (lv_constructor_2_0= ruleBuiltinTypeInfixOp ) )
            	    // InternalBSharp.g:1144:5: (lv_constructor_2_0= ruleBuiltinTypeInfixOp )
            	    {
            	    // InternalBSharp.g:1144:5: (lv_constructor_2_0= ruleBuiltinTypeInfixOp )
            	    // InternalBSharp.g:1145:6: lv_constructor_2_0= ruleBuiltinTypeInfixOp
            	    {

            	    						newCompositeNode(grammarAccess.getConstructedTypeAccess().getConstructorBuiltinTypeInfixOpParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_21);
            	    lv_constructor_2_0=ruleBuiltinTypeInfixOp();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getConstructedTypeRule());
            	    						}
            	    						set(
            	    							current,
            	    							"constructor",
            	    							lv_constructor_2_0,
            	    							"ac.soton.bsharp.BSharp.BuiltinTypeInfixOp");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalBSharp.g:1162:4: ( (lv_right_3_0= ruleBuilderElem ) )
            	    // InternalBSharp.g:1163:5: (lv_right_3_0= ruleBuilderElem )
            	    {
            	    // InternalBSharp.g:1163:5: (lv_right_3_0= ruleBuilderElem )
            	    // InternalBSharp.g:1164:6: lv_right_3_0= ruleBuilderElem
            	    {

            	    						newCompositeNode(grammarAccess.getConstructedTypeAccess().getRightBuilderElemParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_22);
            	    lv_right_3_0=ruleBuilderElem();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getConstructedTypeRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"ac.soton.bsharp.BSharp.BuilderElem");
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
    // $ANTLR end "ruleConstructedType"


    // $ANTLR start "entryRuleBuilderElem"
    // InternalBSharp.g:1186:1: entryRuleBuilderElem returns [EObject current=null] : iv_ruleBuilderElem= ruleBuilderElem EOF ;
    public final EObject entryRuleBuilderElem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBuilderElem = null;


        try {
            // InternalBSharp.g:1186:52: (iv_ruleBuilderElem= ruleBuilderElem EOF )
            // InternalBSharp.g:1187:2: iv_ruleBuilderElem= ruleBuilderElem EOF
            {
             newCompositeNode(grammarAccess.getBuilderElemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBuilderElem=ruleBuilderElem();

            state._fsp--;

             current =iv_ruleBuilderElem; 
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
    // $ANTLR end "entryRuleBuilderElem"


    // $ANTLR start "ruleBuilderElem"
    // InternalBSharp.g:1193:1: ruleBuilderElem returns [EObject current=null] : (this_TypeConstructor_0= ruleTypeConstructor | this_TypeConstrBracket_1= ruleTypeConstrBracket | this_TypePowerSet_2= ruleTypePowerSet ) ;
    public final EObject ruleBuilderElem() throws RecognitionException {
        EObject current = null;

        EObject this_TypeConstructor_0 = null;

        EObject this_TypeConstrBracket_1 = null;

        EObject this_TypePowerSet_2 = null;



        	enterRule();

        try {
            // InternalBSharp.g:1199:2: ( (this_TypeConstructor_0= ruleTypeConstructor | this_TypeConstrBracket_1= ruleTypeConstrBracket | this_TypePowerSet_2= ruleTypePowerSet ) )
            // InternalBSharp.g:1200:2: (this_TypeConstructor_0= ruleTypeConstructor | this_TypeConstrBracket_1= ruleTypeConstrBracket | this_TypePowerSet_2= ruleTypePowerSet )
            {
            // InternalBSharp.g:1200:2: (this_TypeConstructor_0= ruleTypeConstructor | this_TypeConstrBracket_1= ruleTypeConstrBracket | this_TypePowerSet_2= ruleTypePowerSet )
            int alt24=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt24=1;
                }
                break;
            case 20:
                {
                alt24=2;
                }
                break;
            case 36:
                {
                alt24=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // InternalBSharp.g:1201:3: this_TypeConstructor_0= ruleTypeConstructor
                    {

                    			newCompositeNode(grammarAccess.getBuilderElemAccess().getTypeConstructorParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_TypeConstructor_0=ruleTypeConstructor();

                    state._fsp--;


                    			current = this_TypeConstructor_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalBSharp.g:1210:3: this_TypeConstrBracket_1= ruleTypeConstrBracket
                    {

                    			newCompositeNode(grammarAccess.getBuilderElemAccess().getTypeConstrBracketParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_TypeConstrBracket_1=ruleTypeConstrBracket();

                    state._fsp--;


                    			current = this_TypeConstrBracket_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalBSharp.g:1219:3: this_TypePowerSet_2= ruleTypePowerSet
                    {

                    			newCompositeNode(grammarAccess.getBuilderElemAccess().getTypePowerSetParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_TypePowerSet_2=ruleTypePowerSet();

                    state._fsp--;


                    			current = this_TypePowerSet_2;
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
    // $ANTLR end "ruleBuilderElem"


    // $ANTLR start "entryRuleTypeConstructor"
    // InternalBSharp.g:1231:1: entryRuleTypeConstructor returns [EObject current=null] : iv_ruleTypeConstructor= ruleTypeConstructor EOF ;
    public final EObject entryRuleTypeConstructor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeConstructor = null;


        try {
            // InternalBSharp.g:1231:56: (iv_ruleTypeConstructor= ruleTypeConstructor EOF )
            // InternalBSharp.g:1232:2: iv_ruleTypeConstructor= ruleTypeConstructor EOF
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
    // InternalBSharp.g:1238:1: ruleTypeConstructor returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( (lv_context_1_0= ruleTypeDeclContext ) )? ) ;
    public final EObject ruleTypeConstructor() throws RecognitionException {
        EObject current = null;

        EObject lv_context_1_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:1244:2: ( ( ( ( ruleQualifiedName ) ) ( (lv_context_1_0= ruleTypeDeclContext ) )? ) )
            // InternalBSharp.g:1245:2: ( ( ( ruleQualifiedName ) ) ( (lv_context_1_0= ruleTypeDeclContext ) )? )
            {
            // InternalBSharp.g:1245:2: ( ( ( ruleQualifiedName ) ) ( (lv_context_1_0= ruleTypeDeclContext ) )? )
            // InternalBSharp.g:1246:3: ( ( ruleQualifiedName ) ) ( (lv_context_1_0= ruleTypeDeclContext ) )?
            {
            // InternalBSharp.g:1246:3: ( ( ruleQualifiedName ) )
            // InternalBSharp.g:1247:4: ( ruleQualifiedName )
            {
            // InternalBSharp.g:1247:4: ( ruleQualifiedName )
            // InternalBSharp.g:1248:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTypeConstructorRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTypeConstructorAccess().getTypeNameGenNameCrossReference_0_0());
            				
            pushFollow(FOLLOW_23);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBSharp.g:1262:3: ( (lv_context_1_0= ruleTypeDeclContext ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==23) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalBSharp.g:1263:4: (lv_context_1_0= ruleTypeDeclContext )
                    {
                    // InternalBSharp.g:1263:4: (lv_context_1_0= ruleTypeDeclContext )
                    // InternalBSharp.g:1264:5: lv_context_1_0= ruleTypeDeclContext
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


    // $ANTLR start "entryRuleTypePowerSet"
    // InternalBSharp.g:1285:1: entryRuleTypePowerSet returns [EObject current=null] : iv_ruleTypePowerSet= ruleTypePowerSet EOF ;
    public final EObject entryRuleTypePowerSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypePowerSet = null;


        try {
            // InternalBSharp.g:1285:53: (iv_ruleTypePowerSet= ruleTypePowerSet EOF )
            // InternalBSharp.g:1286:2: iv_ruleTypePowerSet= ruleTypePowerSet EOF
            {
             newCompositeNode(grammarAccess.getTypePowerSetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTypePowerSet=ruleTypePowerSet();

            state._fsp--;

             current =iv_ruleTypePowerSet; 
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
    // $ANTLR end "entryRuleTypePowerSet"


    // $ANTLR start "ruleTypePowerSet"
    // InternalBSharp.g:1292:1: ruleTypePowerSet returns [EObject current=null] : (otherlv_0= '\\u2119' otherlv_1= '(' ( (lv_child_2_0= ruleConstructedType ) ) otherlv_3= ')' ) ;
    public final EObject ruleTypePowerSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_child_2_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:1298:2: ( (otherlv_0= '\\u2119' otherlv_1= '(' ( (lv_child_2_0= ruleConstructedType ) ) otherlv_3= ')' ) )
            // InternalBSharp.g:1299:2: (otherlv_0= '\\u2119' otherlv_1= '(' ( (lv_child_2_0= ruleConstructedType ) ) otherlv_3= ')' )
            {
            // InternalBSharp.g:1299:2: (otherlv_0= '\\u2119' otherlv_1= '(' ( (lv_child_2_0= ruleConstructedType ) ) otherlv_3= ')' )
            // InternalBSharp.g:1300:3: otherlv_0= '\\u2119' otherlv_1= '(' ( (lv_child_2_0= ruleConstructedType ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getTypePowerSetAccess().getDoubleStruckCapitalPKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getTypePowerSetAccess().getLeftParenthesisKeyword_1());
            		
            // InternalBSharp.g:1308:3: ( (lv_child_2_0= ruleConstructedType ) )
            // InternalBSharp.g:1309:4: (lv_child_2_0= ruleConstructedType )
            {
            // InternalBSharp.g:1309:4: (lv_child_2_0= ruleConstructedType )
            // InternalBSharp.g:1310:5: lv_child_2_0= ruleConstructedType
            {

            					newCompositeNode(grammarAccess.getTypePowerSetAccess().getChildConstructedTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_17);
            lv_child_2_0=ruleConstructedType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTypePowerSetRule());
            					}
            					set(
            						current,
            						"child",
            						lv_child_2_0,
            						"ac.soton.bsharp.BSharp.ConstructedType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getTypePowerSetAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleTypePowerSet"


    // $ANTLR start "entryRuleTypeConstrBracket"
    // InternalBSharp.g:1335:1: entryRuleTypeConstrBracket returns [EObject current=null] : iv_ruleTypeConstrBracket= ruleTypeConstrBracket EOF ;
    public final EObject entryRuleTypeConstrBracket() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeConstrBracket = null;


        try {
            // InternalBSharp.g:1335:58: (iv_ruleTypeConstrBracket= ruleTypeConstrBracket EOF )
            // InternalBSharp.g:1336:2: iv_ruleTypeConstrBracket= ruleTypeConstrBracket EOF
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
    // InternalBSharp.g:1342:1: ruleTypeConstrBracket returns [EObject current=null] : (otherlv_0= '(' ( (lv_child_1_0= ruleConstructedType ) ) otherlv_2= ')' ) ;
    public final EObject ruleTypeConstrBracket() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_child_1_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:1348:2: ( (otherlv_0= '(' ( (lv_child_1_0= ruleConstructedType ) ) otherlv_2= ')' ) )
            // InternalBSharp.g:1349:2: (otherlv_0= '(' ( (lv_child_1_0= ruleConstructedType ) ) otherlv_2= ')' )
            {
            // InternalBSharp.g:1349:2: (otherlv_0= '(' ( (lv_child_1_0= ruleConstructedType ) ) otherlv_2= ')' )
            // InternalBSharp.g:1350:3: otherlv_0= '(' ( (lv_child_1_0= ruleConstructedType ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getTypeConstrBracketAccess().getLeftParenthesisKeyword_0());
            		
            // InternalBSharp.g:1354:3: ( (lv_child_1_0= ruleConstructedType ) )
            // InternalBSharp.g:1355:4: (lv_child_1_0= ruleConstructedType )
            {
            // InternalBSharp.g:1355:4: (lv_child_1_0= ruleConstructedType )
            // InternalBSharp.g:1356:5: lv_child_1_0= ruleConstructedType
            {

            					newCompositeNode(grammarAccess.getTypeConstrBracketAccess().getChildConstructedTypeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_17);
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

            otherlv_2=(Token)match(input,21,FOLLOW_2); 

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
    // InternalBSharp.g:1381:1: entryRuleTypeDeclContext returns [EObject current=null] : iv_ruleTypeDeclContext= ruleTypeDeclContext EOF ;
    public final EObject entryRuleTypeDeclContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeDeclContext = null;


        try {
            // InternalBSharp.g:1381:56: (iv_ruleTypeDeclContext= ruleTypeDeclContext EOF )
            // InternalBSharp.g:1382:2: iv_ruleTypeDeclContext= ruleTypeDeclContext EOF
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
    // InternalBSharp.g:1388:1: ruleTypeDeclContext returns [EObject current=null] : (otherlv_0= '<' ( (lv_typeName_1_0= ruleConstructedType ) ) (otherlv_2= ',' ( (lv_typeName_3_0= ruleConstructedType ) ) )* otherlv_4= '>' ) ;
    public final EObject ruleTypeDeclContext() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_typeName_1_0 = null;

        EObject lv_typeName_3_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:1394:2: ( (otherlv_0= '<' ( (lv_typeName_1_0= ruleConstructedType ) ) (otherlv_2= ',' ( (lv_typeName_3_0= ruleConstructedType ) ) )* otherlv_4= '>' ) )
            // InternalBSharp.g:1395:2: (otherlv_0= '<' ( (lv_typeName_1_0= ruleConstructedType ) ) (otherlv_2= ',' ( (lv_typeName_3_0= ruleConstructedType ) ) )* otherlv_4= '>' )
            {
            // InternalBSharp.g:1395:2: (otherlv_0= '<' ( (lv_typeName_1_0= ruleConstructedType ) ) (otherlv_2= ',' ( (lv_typeName_3_0= ruleConstructedType ) ) )* otherlv_4= '>' )
            // InternalBSharp.g:1396:3: otherlv_0= '<' ( (lv_typeName_1_0= ruleConstructedType ) ) (otherlv_2= ',' ( (lv_typeName_3_0= ruleConstructedType ) ) )* otherlv_4= '>'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getTypeDeclContextAccess().getLessThanSignKeyword_0());
            		
            // InternalBSharp.g:1400:3: ( (lv_typeName_1_0= ruleConstructedType ) )
            // InternalBSharp.g:1401:4: (lv_typeName_1_0= ruleConstructedType )
            {
            // InternalBSharp.g:1401:4: (lv_typeName_1_0= ruleConstructedType )
            // InternalBSharp.g:1402:5: lv_typeName_1_0= ruleConstructedType
            {

            					newCompositeNode(grammarAccess.getTypeDeclContextAccess().getTypeNameConstructedTypeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_25);
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

            // InternalBSharp.g:1419:3: (otherlv_2= ',' ( (lv_typeName_3_0= ruleConstructedType ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==25) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalBSharp.g:1420:4: otherlv_2= ',' ( (lv_typeName_3_0= ruleConstructedType ) )
            	    {
            	    otherlv_2=(Token)match(input,25,FOLLOW_21); 

            	    				newLeafNode(otherlv_2, grammarAccess.getTypeDeclContextAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalBSharp.g:1424:4: ( (lv_typeName_3_0= ruleConstructedType ) )
            	    // InternalBSharp.g:1425:5: (lv_typeName_3_0= ruleConstructedType )
            	    {
            	    // InternalBSharp.g:1425:5: (lv_typeName_3_0= ruleConstructedType )
            	    // InternalBSharp.g:1426:6: lv_typeName_3_0= ruleConstructedType
            	    {

            	    						newCompositeNode(grammarAccess.getTypeDeclContextAccess().getTypeNameConstructedTypeParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_25);
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

            otherlv_4=(Token)match(input,24,FOLLOW_2); 

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


    // $ANTLR start "entryRuleWhere"
    // InternalBSharp.g:1452:1: entryRuleWhere returns [EObject current=null] : iv_ruleWhere= ruleWhere EOF ;
    public final EObject entryRuleWhere() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhere = null;


        try {
            // InternalBSharp.g:1452:46: (iv_ruleWhere= ruleWhere EOF )
            // InternalBSharp.g:1453:2: iv_ruleWhere= ruleWhere EOF
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
    // InternalBSharp.g:1459:1: ruleWhere returns [EObject current=null] : (otherlv_0= 'where' ( (lv_expressions_1_0= ruleRootExpression ) ) (otherlv_2= ';' ( (lv_expressions_3_0= ruleRootExpression ) ) )* ) ;
    public final EObject ruleWhere() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_expressions_1_0 = null;

        EObject lv_expressions_3_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:1465:2: ( (otherlv_0= 'where' ( (lv_expressions_1_0= ruleRootExpression ) ) (otherlv_2= ';' ( (lv_expressions_3_0= ruleRootExpression ) ) )* ) )
            // InternalBSharp.g:1466:2: (otherlv_0= 'where' ( (lv_expressions_1_0= ruleRootExpression ) ) (otherlv_2= ';' ( (lv_expressions_3_0= ruleRootExpression ) ) )* )
            {
            // InternalBSharp.g:1466:2: (otherlv_0= 'where' ( (lv_expressions_1_0= ruleRootExpression ) ) (otherlv_2= ';' ( (lv_expressions_3_0= ruleRootExpression ) ) )* )
            // InternalBSharp.g:1467:3: otherlv_0= 'where' ( (lv_expressions_1_0= ruleRootExpression ) ) (otherlv_2= ';' ( (lv_expressions_3_0= ruleRootExpression ) ) )*
            {
            otherlv_0=(Token)match(input,37,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getWhereAccess().getWhereKeyword_0());
            		
            // InternalBSharp.g:1471:3: ( (lv_expressions_1_0= ruleRootExpression ) )
            // InternalBSharp.g:1472:4: (lv_expressions_1_0= ruleRootExpression )
            {
            // InternalBSharp.g:1472:4: (lv_expressions_1_0= ruleRootExpression )
            // InternalBSharp.g:1473:5: lv_expressions_1_0= ruleRootExpression
            {

            					newCompositeNode(grammarAccess.getWhereAccess().getExpressionsRootExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_27);
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

            // InternalBSharp.g:1490:3: (otherlv_2= ';' ( (lv_expressions_3_0= ruleRootExpression ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==22) ) {
                    int LA27_1 = input.LA(2);

                    if ( (LA27_1==RULE_ID||LA27_1==18||LA27_1==20||LA27_1==44||(LA27_1>=46 && LA27_1<=48)||LA27_1==50) ) {
                        alt27=1;
                    }


                }


                switch (alt27) {
            	case 1 :
            	    // InternalBSharp.g:1491:4: otherlv_2= ';' ( (lv_expressions_3_0= ruleRootExpression ) )
            	    {
            	    otherlv_2=(Token)match(input,22,FOLLOW_26); 

            	    				newLeafNode(otherlv_2, grammarAccess.getWhereAccess().getSemicolonKeyword_2_0());
            	    			
            	    // InternalBSharp.g:1495:4: ( (lv_expressions_3_0= ruleRootExpression ) )
            	    // InternalBSharp.g:1496:5: (lv_expressions_3_0= ruleRootExpression )
            	    {
            	    // InternalBSharp.g:1496:5: (lv_expressions_3_0= ruleRootExpression )
            	    // InternalBSharp.g:1497:6: lv_expressions_3_0= ruleRootExpression
            	    {

            	    						newCompositeNode(grammarAccess.getWhereAccess().getExpressionsRootExpressionParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_27);
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
    // InternalBSharp.g:1519:1: entryRuleDatatype returns [EObject current=null] : iv_ruleDatatype= ruleDatatype EOF ;
    public final EObject entryRuleDatatype() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatatype = null;


        try {
            // InternalBSharp.g:1519:49: (iv_ruleDatatype= ruleDatatype EOF )
            // InternalBSharp.g:1520:2: iv_ruleDatatype= ruleDatatype EOF
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
    // InternalBSharp.g:1526:1: ruleDatatype returns [EObject current=null] : (otherlv_0= 'Datatype' ( (lv_name_1_0= RULE_ID ) ) ( (lv_context_2_0= rulePolyContext ) )? (otherlv_3= '|' ( (lv_constructors_4_0= ruleDatatypeConstructor ) ) )+ ( (lv_block_5_0= ruleBSharpBlock ) ) ) ;
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
            // InternalBSharp.g:1532:2: ( (otherlv_0= 'Datatype' ( (lv_name_1_0= RULE_ID ) ) ( (lv_context_2_0= rulePolyContext ) )? (otherlv_3= '|' ( (lv_constructors_4_0= ruleDatatypeConstructor ) ) )+ ( (lv_block_5_0= ruleBSharpBlock ) ) ) )
            // InternalBSharp.g:1533:2: (otherlv_0= 'Datatype' ( (lv_name_1_0= RULE_ID ) ) ( (lv_context_2_0= rulePolyContext ) )? (otherlv_3= '|' ( (lv_constructors_4_0= ruleDatatypeConstructor ) ) )+ ( (lv_block_5_0= ruleBSharpBlock ) ) )
            {
            // InternalBSharp.g:1533:2: (otherlv_0= 'Datatype' ( (lv_name_1_0= RULE_ID ) ) ( (lv_context_2_0= rulePolyContext ) )? (otherlv_3= '|' ( (lv_constructors_4_0= ruleDatatypeConstructor ) ) )+ ( (lv_block_5_0= ruleBSharpBlock ) ) )
            // InternalBSharp.g:1534:3: otherlv_0= 'Datatype' ( (lv_name_1_0= RULE_ID ) ) ( (lv_context_2_0= rulePolyContext ) )? (otherlv_3= '|' ( (lv_constructors_4_0= ruleDatatypeConstructor ) ) )+ ( (lv_block_5_0= ruleBSharpBlock ) )
            {
            otherlv_0=(Token)match(input,38,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDatatypeAccess().getDatatypeKeyword_0());
            		
            // InternalBSharp.g:1538:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalBSharp.g:1539:4: (lv_name_1_0= RULE_ID )
            {
            // InternalBSharp.g:1539:4: (lv_name_1_0= RULE_ID )
            // InternalBSharp.g:1540:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_28); 

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

            // InternalBSharp.g:1556:3: ( (lv_context_2_0= rulePolyContext ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==23) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalBSharp.g:1557:4: (lv_context_2_0= rulePolyContext )
                    {
                    // InternalBSharp.g:1557:4: (lv_context_2_0= rulePolyContext )
                    // InternalBSharp.g:1558:5: lv_context_2_0= rulePolyContext
                    {

                    					newCompositeNode(grammarAccess.getDatatypeAccess().getContextPolyContextParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_29);
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

            // InternalBSharp.g:1575:3: (otherlv_3= '|' ( (lv_constructors_4_0= ruleDatatypeConstructor ) ) )+
            int cnt29=0;
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==39) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalBSharp.g:1576:4: otherlv_3= '|' ( (lv_constructors_4_0= ruleDatatypeConstructor ) )
            	    {
            	    otherlv_3=(Token)match(input,39,FOLLOW_3); 

            	    				newLeafNode(otherlv_3, grammarAccess.getDatatypeAccess().getVerticalLineKeyword_3_0());
            	    			
            	    // InternalBSharp.g:1580:4: ( (lv_constructors_4_0= ruleDatatypeConstructor ) )
            	    // InternalBSharp.g:1581:5: (lv_constructors_4_0= ruleDatatypeConstructor )
            	    {
            	    // InternalBSharp.g:1581:5: (lv_constructors_4_0= ruleDatatypeConstructor )
            	    // InternalBSharp.g:1582:6: lv_constructors_4_0= ruleDatatypeConstructor
            	    {

            	    						newCompositeNode(grammarAccess.getDatatypeAccess().getConstructorsDatatypeConstructorParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_30);
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

            // InternalBSharp.g:1600:3: ( (lv_block_5_0= ruleBSharpBlock ) )
            // InternalBSharp.g:1601:4: (lv_block_5_0= ruleBSharpBlock )
            {
            // InternalBSharp.g:1601:4: (lv_block_5_0= ruleBSharpBlock )
            // InternalBSharp.g:1602:5: lv_block_5_0= ruleBSharpBlock
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
    // InternalBSharp.g:1623:1: entryRuleDatatypeConstructor returns [EObject current=null] : iv_ruleDatatypeConstructor= ruleDatatypeConstructor EOF ;
    public final EObject entryRuleDatatypeConstructor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatatypeConstructor = null;


        try {
            // InternalBSharp.g:1623:60: (iv_ruleDatatypeConstructor= ruleDatatypeConstructor EOF )
            // InternalBSharp.g:1624:2: iv_ruleDatatypeConstructor= ruleDatatypeConstructor EOF
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
    // InternalBSharp.g:1630:1: ruleDatatypeConstructor returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_decons_2_0= ruleTypedVariableList ) ) otherlv_3= ')' )? ) ;
    public final EObject ruleDatatypeConstructor() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_decons_2_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:1636:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_decons_2_0= ruleTypedVariableList ) ) otherlv_3= ')' )? ) )
            // InternalBSharp.g:1637:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_decons_2_0= ruleTypedVariableList ) ) otherlv_3= ')' )? )
            {
            // InternalBSharp.g:1637:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_decons_2_0= ruleTypedVariableList ) ) otherlv_3= ')' )? )
            // InternalBSharp.g:1638:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_decons_2_0= ruleTypedVariableList ) ) otherlv_3= ')' )?
            {
            // InternalBSharp.g:1638:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalBSharp.g:1639:4: (lv_name_0_0= RULE_ID )
            {
            // InternalBSharp.g:1639:4: (lv_name_0_0= RULE_ID )
            // InternalBSharp.g:1640:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_31); 

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

            // InternalBSharp.g:1656:3: (otherlv_1= '(' ( (lv_decons_2_0= ruleTypedVariableList ) ) otherlv_3= ')' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==20) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalBSharp.g:1657:4: otherlv_1= '(' ( (lv_decons_2_0= ruleTypedVariableList ) ) otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getDatatypeConstructorAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalBSharp.g:1661:4: ( (lv_decons_2_0= ruleTypedVariableList ) )
                    // InternalBSharp.g:1662:5: (lv_decons_2_0= ruleTypedVariableList )
                    {
                    // InternalBSharp.g:1662:5: (lv_decons_2_0= ruleTypedVariableList )
                    // InternalBSharp.g:1663:6: lv_decons_2_0= ruleTypedVariableList
                    {

                    						newCompositeNode(grammarAccess.getDatatypeConstructorAccess().getDeconsTypedVariableListParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_17);
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

                    otherlv_3=(Token)match(input,21,FOLLOW_2); 

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
    // InternalBSharp.g:1689:1: entryRuleExtend returns [EObject current=null] : iv_ruleExtend= ruleExtend EOF ;
    public final EObject entryRuleExtend() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtend = null;


        try {
            // InternalBSharp.g:1689:47: (iv_ruleExtend= ruleExtend EOF )
            // InternalBSharp.g:1690:2: iv_ruleExtend= ruleExtend EOF
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
    // InternalBSharp.g:1696:1: ruleExtend returns [EObject current=null] : (otherlv_0= 'Extend' ( ( ruleQualifiedName ) ) otherlv_2= '(' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ')' ( (lv_block_5_0= ruleBSharpBlock ) ) ) ;
    public final EObject ruleExtend() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        EObject lv_block_5_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:1702:2: ( (otherlv_0= 'Extend' ( ( ruleQualifiedName ) ) otherlv_2= '(' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ')' ( (lv_block_5_0= ruleBSharpBlock ) ) ) )
            // InternalBSharp.g:1703:2: (otherlv_0= 'Extend' ( ( ruleQualifiedName ) ) otherlv_2= '(' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ')' ( (lv_block_5_0= ruleBSharpBlock ) ) )
            {
            // InternalBSharp.g:1703:2: (otherlv_0= 'Extend' ( ( ruleQualifiedName ) ) otherlv_2= '(' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ')' ( (lv_block_5_0= ruleBSharpBlock ) ) )
            // InternalBSharp.g:1704:3: otherlv_0= 'Extend' ( ( ruleQualifiedName ) ) otherlv_2= '(' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ')' ( (lv_block_5_0= ruleBSharpBlock ) )
            {
            otherlv_0=(Token)match(input,40,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getExtendAccess().getExtendKeyword_0());
            		
            // InternalBSharp.g:1708:3: ( ( ruleQualifiedName ) )
            // InternalBSharp.g:1709:4: ( ruleQualifiedName )
            {
            // InternalBSharp.g:1709:4: ( ruleQualifiedName )
            // InternalBSharp.g:1710:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExtendRule());
            					}
            				

            					newCompositeNode(grammarAccess.getExtendAccess().getExtendedClassClassDeclCrossReference_1_0());
            				
            pushFollow(FOLLOW_24);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getExtendAccess().getLeftParenthesisKeyword_2());
            		
            // InternalBSharp.g:1728:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalBSharp.g:1729:4: (lv_name_3_0= RULE_ID )
            {
            // InternalBSharp.g:1729:4: (lv_name_3_0= RULE_ID )
            // InternalBSharp.g:1730:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_17); 

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

            otherlv_4=(Token)match(input,21,FOLLOW_16); 

            			newLeafNode(otherlv_4, grammarAccess.getExtendAccess().getRightParenthesisKeyword_4());
            		
            // InternalBSharp.g:1750:3: ( (lv_block_5_0= ruleBSharpBlock ) )
            // InternalBSharp.g:1751:4: (lv_block_5_0= ruleBSharpBlock )
            {
            // InternalBSharp.g:1751:4: (lv_block_5_0= ruleBSharpBlock )
            // InternalBSharp.g:1752:5: lv_block_5_0= ruleBSharpBlock
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
    // InternalBSharp.g:1773:1: entryRuleBSharpBlock returns [EObject current=null] : iv_ruleBSharpBlock= ruleBSharpBlock EOF ;
    public final EObject entryRuleBSharpBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBSharpBlock = null;


        try {
            // InternalBSharp.g:1773:52: (iv_ruleBSharpBlock= ruleBSharpBlock EOF )
            // InternalBSharp.g:1774:2: iv_ruleBSharpBlock= ruleBSharpBlock EOF
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
    // InternalBSharp.g:1780:1: ruleBSharpBlock returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_functions_2_0= ruleFunctionDecl ) ) | ( (lv_theorems_3_0= ruleTheoremBody ) ) | ( (lv_theorems_4_0= ruleInstance ) ) )* otherlv_5= '}' ) ;
    public final EObject ruleBSharpBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_5=null;
        EObject lv_functions_2_0 = null;

        EObject lv_theorems_3_0 = null;

        EObject lv_theorems_4_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:1786:2: ( ( () otherlv_1= '{' ( ( (lv_functions_2_0= ruleFunctionDecl ) ) | ( (lv_theorems_3_0= ruleTheoremBody ) ) | ( (lv_theorems_4_0= ruleInstance ) ) )* otherlv_5= '}' ) )
            // InternalBSharp.g:1787:2: ( () otherlv_1= '{' ( ( (lv_functions_2_0= ruleFunctionDecl ) ) | ( (lv_theorems_3_0= ruleTheoremBody ) ) | ( (lv_theorems_4_0= ruleInstance ) ) )* otherlv_5= '}' )
            {
            // InternalBSharp.g:1787:2: ( () otherlv_1= '{' ( ( (lv_functions_2_0= ruleFunctionDecl ) ) | ( (lv_theorems_3_0= ruleTheoremBody ) ) | ( (lv_theorems_4_0= ruleInstance ) ) )* otherlv_5= '}' )
            // InternalBSharp.g:1788:3: () otherlv_1= '{' ( ( (lv_functions_2_0= ruleFunctionDecl ) ) | ( (lv_theorems_3_0= ruleTheoremBody ) ) | ( (lv_theorems_4_0= ruleInstance ) ) )* otherlv_5= '}'
            {
            // InternalBSharp.g:1788:3: ()
            // InternalBSharp.g:1789:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBSharpBlockAccess().getBSharpBlockAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,41,FOLLOW_32); 

            			newLeafNode(otherlv_1, grammarAccess.getBSharpBlockAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalBSharp.g:1799:3: ( ( (lv_functions_2_0= ruleFunctionDecl ) ) | ( (lv_theorems_3_0= ruleTheoremBody ) ) | ( (lv_theorems_4_0= ruleInstance ) ) )*
            loop31:
            do {
                int alt31=4;
                switch ( input.LA(1) ) {
                case RULE_ID:
                    {
                    alt31=1;
                    }
                    break;
                case 45:
                    {
                    alt31=2;
                    }
                    break;
                case 57:
                    {
                    alt31=3;
                    }
                    break;

                }

                switch (alt31) {
            	case 1 :
            	    // InternalBSharp.g:1800:4: ( (lv_functions_2_0= ruleFunctionDecl ) )
            	    {
            	    // InternalBSharp.g:1800:4: ( (lv_functions_2_0= ruleFunctionDecl ) )
            	    // InternalBSharp.g:1801:5: (lv_functions_2_0= ruleFunctionDecl )
            	    {
            	    // InternalBSharp.g:1801:5: (lv_functions_2_0= ruleFunctionDecl )
            	    // InternalBSharp.g:1802:6: lv_functions_2_0= ruleFunctionDecl
            	    {

            	    						newCompositeNode(grammarAccess.getBSharpBlockAccess().getFunctionsFunctionDeclParserRuleCall_2_0_0());
            	    					
            	    pushFollow(FOLLOW_32);
            	    lv_functions_2_0=ruleFunctionDecl();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getBSharpBlockRule());
            	    						}
            	    						add(
            	    							current,
            	    							"functions",
            	    							lv_functions_2_0,
            	    							"ac.soton.bsharp.BSharp.FunctionDecl");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalBSharp.g:1820:4: ( (lv_theorems_3_0= ruleTheoremBody ) )
            	    {
            	    // InternalBSharp.g:1820:4: ( (lv_theorems_3_0= ruleTheoremBody ) )
            	    // InternalBSharp.g:1821:5: (lv_theorems_3_0= ruleTheoremBody )
            	    {
            	    // InternalBSharp.g:1821:5: (lv_theorems_3_0= ruleTheoremBody )
            	    // InternalBSharp.g:1822:6: lv_theorems_3_0= ruleTheoremBody
            	    {

            	    						newCompositeNode(grammarAccess.getBSharpBlockAccess().getTheoremsTheoremBodyParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_32);
            	    lv_theorems_3_0=ruleTheoremBody();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getBSharpBlockRule());
            	    						}
            	    						add(
            	    							current,
            	    							"theorems",
            	    							lv_theorems_3_0,
            	    							"ac.soton.bsharp.BSharp.TheoremBody");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalBSharp.g:1840:4: ( (lv_theorems_4_0= ruleInstance ) )
            	    {
            	    // InternalBSharp.g:1840:4: ( (lv_theorems_4_0= ruleInstance ) )
            	    // InternalBSharp.g:1841:5: (lv_theorems_4_0= ruleInstance )
            	    {
            	    // InternalBSharp.g:1841:5: (lv_theorems_4_0= ruleInstance )
            	    // InternalBSharp.g:1842:6: lv_theorems_4_0= ruleInstance
            	    {

            	    						newCompositeNode(grammarAccess.getBSharpBlockAccess().getTheoremsInstanceParserRuleCall_2_2_0());
            	    					
            	    pushFollow(FOLLOW_32);
            	    lv_theorems_4_0=ruleInstance();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getBSharpBlockRule());
            	    						}
            	    						add(
            	    							current,
            	    							"theorems",
            	    							lv_theorems_4_0,
            	    							"ac.soton.bsharp.BSharp.Instance");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            otherlv_5=(Token)match(input,42,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getBSharpBlockAccess().getRightCurlyBracketKeyword_3());
            		

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


    // $ANTLR start "entryRuleFunctionDecl"
    // InternalBSharp.g:1868:1: entryRuleFunctionDecl returns [EObject current=null] : iv_ruleFunctionDecl= ruleFunctionDecl EOF ;
    public final EObject entryRuleFunctionDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionDecl = null;


        try {
            // InternalBSharp.g:1868:53: (iv_ruleFunctionDecl= ruleFunctionDecl EOF )
            // InternalBSharp.g:1869:2: iv_ruleFunctionDecl= ruleFunctionDecl EOF
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
    // InternalBSharp.g:1875:1: ruleFunctionDecl returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_context_1_0= rulePolyContext ) )? otherlv_2= '(' ( (lv_varList_3_0= ruleTypedVariableList ) )? otherlv_4= ')' otherlv_5= ':' ( (lv_returnType_6_0= ruleTypeConstructor ) ) ( (lv_infix_7_0= 'INFIX' ) )? ( (lv_precedence_8_0= RULE_INT ) )? ( (lv_expr_9_0= ruleRootExpression ) ) ) ;
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
            // InternalBSharp.g:1881:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_context_1_0= rulePolyContext ) )? otherlv_2= '(' ( (lv_varList_3_0= ruleTypedVariableList ) )? otherlv_4= ')' otherlv_5= ':' ( (lv_returnType_6_0= ruleTypeConstructor ) ) ( (lv_infix_7_0= 'INFIX' ) )? ( (lv_precedence_8_0= RULE_INT ) )? ( (lv_expr_9_0= ruleRootExpression ) ) ) )
            // InternalBSharp.g:1882:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_context_1_0= rulePolyContext ) )? otherlv_2= '(' ( (lv_varList_3_0= ruleTypedVariableList ) )? otherlv_4= ')' otherlv_5= ':' ( (lv_returnType_6_0= ruleTypeConstructor ) ) ( (lv_infix_7_0= 'INFIX' ) )? ( (lv_precedence_8_0= RULE_INT ) )? ( (lv_expr_9_0= ruleRootExpression ) ) )
            {
            // InternalBSharp.g:1882:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_context_1_0= rulePolyContext ) )? otherlv_2= '(' ( (lv_varList_3_0= ruleTypedVariableList ) )? otherlv_4= ')' otherlv_5= ':' ( (lv_returnType_6_0= ruleTypeConstructor ) ) ( (lv_infix_7_0= 'INFIX' ) )? ( (lv_precedence_8_0= RULE_INT ) )? ( (lv_expr_9_0= ruleRootExpression ) ) )
            // InternalBSharp.g:1883:3: ( (lv_name_0_0= RULE_ID ) ) ( (lv_context_1_0= rulePolyContext ) )? otherlv_2= '(' ( (lv_varList_3_0= ruleTypedVariableList ) )? otherlv_4= ')' otherlv_5= ':' ( (lv_returnType_6_0= ruleTypeConstructor ) ) ( (lv_infix_7_0= 'INFIX' ) )? ( (lv_precedence_8_0= RULE_INT ) )? ( (lv_expr_9_0= ruleRootExpression ) )
            {
            // InternalBSharp.g:1883:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalBSharp.g:1884:4: (lv_name_0_0= RULE_ID )
            {
            // InternalBSharp.g:1884:4: (lv_name_0_0= RULE_ID )
            // InternalBSharp.g:1885:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_33); 

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

            // InternalBSharp.g:1901:3: ( (lv_context_1_0= rulePolyContext ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==23) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalBSharp.g:1902:4: (lv_context_1_0= rulePolyContext )
                    {
                    // InternalBSharp.g:1902:4: (lv_context_1_0= rulePolyContext )
                    // InternalBSharp.g:1903:5: lv_context_1_0= rulePolyContext
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
                    						"ac.soton.bsharp.BSharp.PolyContext");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,20,FOLLOW_34); 

            			newLeafNode(otherlv_2, grammarAccess.getFunctionDeclAccess().getLeftParenthesisKeyword_2());
            		
            // InternalBSharp.g:1924:3: ( (lv_varList_3_0= ruleTypedVariableList ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_ID) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalBSharp.g:1925:4: (lv_varList_3_0= ruleTypedVariableList )
                    {
                    // InternalBSharp.g:1925:4: (lv_varList_3_0= ruleTypedVariableList )
                    // InternalBSharp.g:1926:5: lv_varList_3_0= ruleTypedVariableList
                    {

                    					newCompositeNode(grammarAccess.getFunctionDeclAccess().getVarListTypedVariableListParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_17);
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

            otherlv_4=(Token)match(input,21,FOLLOW_35); 

            			newLeafNode(otherlv_4, grammarAccess.getFunctionDeclAccess().getRightParenthesisKeyword_4());
            		
            otherlv_5=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getFunctionDeclAccess().getColonKeyword_5());
            		
            // InternalBSharp.g:1951:3: ( (lv_returnType_6_0= ruleTypeConstructor ) )
            // InternalBSharp.g:1952:4: (lv_returnType_6_0= ruleTypeConstructor )
            {
            // InternalBSharp.g:1952:4: (lv_returnType_6_0= ruleTypeConstructor )
            // InternalBSharp.g:1953:5: lv_returnType_6_0= ruleTypeConstructor
            {

            					newCompositeNode(grammarAccess.getFunctionDeclAccess().getReturnTypeTypeConstructorParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_36);
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

            // InternalBSharp.g:1970:3: ( (lv_infix_7_0= 'INFIX' ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==43) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalBSharp.g:1971:4: (lv_infix_7_0= 'INFIX' )
                    {
                    // InternalBSharp.g:1971:4: (lv_infix_7_0= 'INFIX' )
                    // InternalBSharp.g:1972:5: lv_infix_7_0= 'INFIX'
                    {
                    lv_infix_7_0=(Token)match(input,43,FOLLOW_37); 

                    					newLeafNode(lv_infix_7_0, grammarAccess.getFunctionDeclAccess().getInfixINFIXKeyword_7_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFunctionDeclRule());
                    					}
                    					setWithLastConsumed(current, "infix", lv_infix_7_0, "INFIX");
                    				

                    }


                    }
                    break;

            }

            // InternalBSharp.g:1984:3: ( (lv_precedence_8_0= RULE_INT ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_INT) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalBSharp.g:1985:4: (lv_precedence_8_0= RULE_INT )
                    {
                    // InternalBSharp.g:1985:4: (lv_precedence_8_0= RULE_INT )
                    // InternalBSharp.g:1986:5: lv_precedence_8_0= RULE_INT
                    {
                    lv_precedence_8_0=(Token)match(input,RULE_INT,FOLLOW_26); 

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

            // InternalBSharp.g:2002:3: ( (lv_expr_9_0= ruleRootExpression ) )
            // InternalBSharp.g:2003:4: (lv_expr_9_0= ruleRootExpression )
            {
            // InternalBSharp.g:2003:4: (lv_expr_9_0= ruleRootExpression )
            // InternalBSharp.g:2004:5: lv_expr_9_0= ruleRootExpression
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
    // InternalBSharp.g:2025:1: entryRuleMatchStatement returns [EObject current=null] : iv_ruleMatchStatement= ruleMatchStatement EOF ;
    public final EObject entryRuleMatchStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMatchStatement = null;


        try {
            // InternalBSharp.g:2025:55: (iv_ruleMatchStatement= ruleMatchStatement EOF )
            // InternalBSharp.g:2026:2: iv_ruleMatchStatement= ruleMatchStatement EOF
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
    // InternalBSharp.g:2032:1: ruleMatchStatement returns [EObject current=null] : (otherlv_0= 'match' ( (lv_match_1_0= ruleRootExpression ) ) otherlv_2= '{' ( (lv_inductCase_3_0= ruleMatchCase ) ) ( (lv_inductCase_4_0= ruleMatchCase ) )* otherlv_5= '}' ) ;
    public final EObject ruleMatchStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_match_1_0 = null;

        EObject lv_inductCase_3_0 = null;

        EObject lv_inductCase_4_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:2038:2: ( (otherlv_0= 'match' ( (lv_match_1_0= ruleRootExpression ) ) otherlv_2= '{' ( (lv_inductCase_3_0= ruleMatchCase ) ) ( (lv_inductCase_4_0= ruleMatchCase ) )* otherlv_5= '}' ) )
            // InternalBSharp.g:2039:2: (otherlv_0= 'match' ( (lv_match_1_0= ruleRootExpression ) ) otherlv_2= '{' ( (lv_inductCase_3_0= ruleMatchCase ) ) ( (lv_inductCase_4_0= ruleMatchCase ) )* otherlv_5= '}' )
            {
            // InternalBSharp.g:2039:2: (otherlv_0= 'match' ( (lv_match_1_0= ruleRootExpression ) ) otherlv_2= '{' ( (lv_inductCase_3_0= ruleMatchCase ) ) ( (lv_inductCase_4_0= ruleMatchCase ) )* otherlv_5= '}' )
            // InternalBSharp.g:2040:3: otherlv_0= 'match' ( (lv_match_1_0= ruleRootExpression ) ) otherlv_2= '{' ( (lv_inductCase_3_0= ruleMatchCase ) ) ( (lv_inductCase_4_0= ruleMatchCase ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getMatchStatementAccess().getMatchKeyword_0());
            		
            // InternalBSharp.g:2044:3: ( (lv_match_1_0= ruleRootExpression ) )
            // InternalBSharp.g:2045:4: (lv_match_1_0= ruleRootExpression )
            {
            // InternalBSharp.g:2045:4: (lv_match_1_0= ruleRootExpression )
            // InternalBSharp.g:2046:5: lv_match_1_0= ruleRootExpression
            {

            					newCompositeNode(grammarAccess.getMatchStatementAccess().getMatchRootExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_38);
            lv_match_1_0=ruleRootExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMatchStatementRule());
            					}
            					set(
            						current,
            						"match",
            						lv_match_1_0,
            						"ac.soton.bsharp.BSharp.RootExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,41,FOLLOW_29); 

            			newLeafNode(otherlv_2, grammarAccess.getMatchStatementAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalBSharp.g:2067:3: ( (lv_inductCase_3_0= ruleMatchCase ) )
            // InternalBSharp.g:2068:4: (lv_inductCase_3_0= ruleMatchCase )
            {
            // InternalBSharp.g:2068:4: (lv_inductCase_3_0= ruleMatchCase )
            // InternalBSharp.g:2069:5: lv_inductCase_3_0= ruleMatchCase
            {

            					newCompositeNode(grammarAccess.getMatchStatementAccess().getInductCaseMatchCaseParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_39);
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

            // InternalBSharp.g:2086:3: ( (lv_inductCase_4_0= ruleMatchCase ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==39) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalBSharp.g:2087:4: (lv_inductCase_4_0= ruleMatchCase )
            	    {
            	    // InternalBSharp.g:2087:4: (lv_inductCase_4_0= ruleMatchCase )
            	    // InternalBSharp.g:2088:5: lv_inductCase_4_0= ruleMatchCase
            	    {

            	    					newCompositeNode(grammarAccess.getMatchStatementAccess().getInductCaseMatchCaseParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_39);
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
            	    break loop36;
                }
            } while (true);

            otherlv_5=(Token)match(input,42,FOLLOW_2); 

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
    // InternalBSharp.g:2113:1: entryRuleMatchCase returns [EObject current=null] : iv_ruleMatchCase= ruleMatchCase EOF ;
    public final EObject entryRuleMatchCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMatchCase = null;


        try {
            // InternalBSharp.g:2113:50: (iv_ruleMatchCase= ruleMatchCase EOF )
            // InternalBSharp.g:2114:2: iv_ruleMatchCase= ruleMatchCase EOF
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
    // InternalBSharp.g:2120:1: ruleMatchCase returns [EObject current=null] : (otherlv_0= '|' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( (lv_variables_3_0= ruleTypedVariable ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleTypedVariable ) ) )* otherlv_6= ')' )? otherlv_7= ':' ( (lv_expr_8_0= ruleRootExpression ) ) ) ;
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
            // InternalBSharp.g:2126:2: ( (otherlv_0= '|' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( (lv_variables_3_0= ruleTypedVariable ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleTypedVariable ) ) )* otherlv_6= ')' )? otherlv_7= ':' ( (lv_expr_8_0= ruleRootExpression ) ) ) )
            // InternalBSharp.g:2127:2: (otherlv_0= '|' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( (lv_variables_3_0= ruleTypedVariable ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleTypedVariable ) ) )* otherlv_6= ')' )? otherlv_7= ':' ( (lv_expr_8_0= ruleRootExpression ) ) )
            {
            // InternalBSharp.g:2127:2: (otherlv_0= '|' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( (lv_variables_3_0= ruleTypedVariable ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleTypedVariable ) ) )* otherlv_6= ')' )? otherlv_7= ':' ( (lv_expr_8_0= ruleRootExpression ) ) )
            // InternalBSharp.g:2128:3: otherlv_0= '|' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( (lv_variables_3_0= ruleTypedVariable ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleTypedVariable ) ) )* otherlv_6= ')' )? otherlv_7= ':' ( (lv_expr_8_0= ruleRootExpression ) )
            {
            otherlv_0=(Token)match(input,39,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMatchCaseAccess().getVerticalLineKeyword_0());
            		
            // InternalBSharp.g:2132:3: ( (otherlv_1= RULE_ID ) )
            // InternalBSharp.g:2133:4: (otherlv_1= RULE_ID )
            {
            // InternalBSharp.g:2133:4: (otherlv_1= RULE_ID )
            // InternalBSharp.g:2134:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMatchCaseRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_40); 

            					newLeafNode(otherlv_1, grammarAccess.getMatchCaseAccess().getDeconNameDatatypeConstructorCrossReference_1_0());
            				

            }


            }

            // InternalBSharp.g:2145:3: (otherlv_2= '(' ( (lv_variables_3_0= ruleTypedVariable ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleTypedVariable ) ) )* otherlv_6= ')' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==20) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalBSharp.g:2146:4: otherlv_2= '(' ( (lv_variables_3_0= ruleTypedVariable ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleTypedVariable ) ) )* otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getMatchCaseAccess().getLeftParenthesisKeyword_2_0());
                    			
                    // InternalBSharp.g:2150:4: ( (lv_variables_3_0= ruleTypedVariable ) )
                    // InternalBSharp.g:2151:5: (lv_variables_3_0= ruleTypedVariable )
                    {
                    // InternalBSharp.g:2151:5: (lv_variables_3_0= ruleTypedVariable )
                    // InternalBSharp.g:2152:6: lv_variables_3_0= ruleTypedVariable
                    {

                    						newCompositeNode(grammarAccess.getMatchCaseAccess().getVariablesTypedVariableParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_41);
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

                    // InternalBSharp.g:2169:4: (otherlv_4= ',' ( (lv_variables_5_0= ruleTypedVariable ) ) )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==25) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // InternalBSharp.g:2170:5: otherlv_4= ',' ( (lv_variables_5_0= ruleTypedVariable ) )
                    	    {
                    	    otherlv_4=(Token)match(input,25,FOLLOW_3); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getMatchCaseAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalBSharp.g:2174:5: ( (lv_variables_5_0= ruleTypedVariable ) )
                    	    // InternalBSharp.g:2175:6: (lv_variables_5_0= ruleTypedVariable )
                    	    {
                    	    // InternalBSharp.g:2175:6: (lv_variables_5_0= ruleTypedVariable )
                    	    // InternalBSharp.g:2176:7: lv_variables_5_0= ruleTypedVariable
                    	    {

                    	    							newCompositeNode(grammarAccess.getMatchCaseAccess().getVariablesTypedVariableParserRuleCall_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_41);
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
                    	    break loop37;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,21,FOLLOW_35); 

                    				newLeafNode(otherlv_6, grammarAccess.getMatchCaseAccess().getRightParenthesisKeyword_2_3());
                    			

                    }
                    break;

            }

            otherlv_7=(Token)match(input,12,FOLLOW_26); 

            			newLeafNode(otherlv_7, grammarAccess.getMatchCaseAccess().getColonKeyword_3());
            		
            // InternalBSharp.g:2203:3: ( (lv_expr_8_0= ruleRootExpression ) )
            // InternalBSharp.g:2204:4: (lv_expr_8_0= ruleRootExpression )
            {
            // InternalBSharp.g:2204:4: (lv_expr_8_0= ruleRootExpression )
            // InternalBSharp.g:2205:5: lv_expr_8_0= ruleRootExpression
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
    // InternalBSharp.g:2226:1: entryRuleTheoremBody returns [EObject current=null] : iv_ruleTheoremBody= ruleTheoremBody EOF ;
    public final EObject entryRuleTheoremBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTheoremBody = null;


        try {
            // InternalBSharp.g:2226:52: (iv_ruleTheoremBody= ruleTheoremBody EOF )
            // InternalBSharp.g:2227:2: iv_ruleTheoremBody= ruleTheoremBody EOF
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
    // InternalBSharp.g:2233:1: ruleTheoremBody returns [EObject current=null] : (otherlv_0= 'Theorems' otherlv_1= '{' ( (lv_theoremDecl_2_0= ruleTheoremDecl ) )+ otherlv_3= '}' ) ;
    public final EObject ruleTheoremBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_theoremDecl_2_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:2239:2: ( (otherlv_0= 'Theorems' otherlv_1= '{' ( (lv_theoremDecl_2_0= ruleTheoremDecl ) )+ otherlv_3= '}' ) )
            // InternalBSharp.g:2240:2: (otherlv_0= 'Theorems' otherlv_1= '{' ( (lv_theoremDecl_2_0= ruleTheoremDecl ) )+ otherlv_3= '}' )
            {
            // InternalBSharp.g:2240:2: (otherlv_0= 'Theorems' otherlv_1= '{' ( (lv_theoremDecl_2_0= ruleTheoremDecl ) )+ otherlv_3= '}' )
            // InternalBSharp.g:2241:3: otherlv_0= 'Theorems' otherlv_1= '{' ( (lv_theoremDecl_2_0= ruleTheoremDecl ) )+ otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_38); 

            			newLeafNode(otherlv_0, grammarAccess.getTheoremBodyAccess().getTheoremsKeyword_0());
            		
            otherlv_1=(Token)match(input,41,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getTheoremBodyAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalBSharp.g:2249:3: ( (lv_theoremDecl_2_0= ruleTheoremDecl ) )+
            int cnt39=0;
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( ((LA39_0>=RULE_INT && LA39_0<=RULE_WS)||LA39_0==12) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalBSharp.g:2250:4: (lv_theoremDecl_2_0= ruleTheoremDecl )
            	    {
            	    // InternalBSharp.g:2250:4: (lv_theoremDecl_2_0= ruleTheoremDecl )
            	    // InternalBSharp.g:2251:5: lv_theoremDecl_2_0= ruleTheoremDecl
            	    {

            	    					newCompositeNode(grammarAccess.getTheoremBodyAccess().getTheoremDeclTheoremDeclParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_42);
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
            	    if ( cnt39 >= 1 ) break loop39;
                        EarlyExitException eee =
                            new EarlyExitException(39, input);
                        throw eee;
                }
                cnt39++;
            } while (true);

            otherlv_3=(Token)match(input,42,FOLLOW_2); 

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
    // InternalBSharp.g:2276:1: entryRuleTheoremDecl returns [EObject current=null] : iv_ruleTheoremDecl= ruleTheoremDecl EOF ;
    public final EObject entryRuleTheoremDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTheoremDecl = null;


        try {
            // InternalBSharp.g:2276:52: (iv_ruleTheoremDecl= ruleTheoremDecl EOF )
            // InternalBSharp.g:2277:2: iv_ruleTheoremDecl= ruleTheoremDecl EOF
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
    // InternalBSharp.g:2283:1: ruleTheoremDecl returns [EObject current=null] : ( ( (lv_name_0_0= ruleTHM_NAME ) ) ( (lv_expr_1_0= ruleRootExpression ) ) otherlv_2= ';' ) ;
    public final EObject ruleTheoremDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_expr_1_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:2289:2: ( ( ( (lv_name_0_0= ruleTHM_NAME ) ) ( (lv_expr_1_0= ruleRootExpression ) ) otherlv_2= ';' ) )
            // InternalBSharp.g:2290:2: ( ( (lv_name_0_0= ruleTHM_NAME ) ) ( (lv_expr_1_0= ruleRootExpression ) ) otherlv_2= ';' )
            {
            // InternalBSharp.g:2290:2: ( ( (lv_name_0_0= ruleTHM_NAME ) ) ( (lv_expr_1_0= ruleRootExpression ) ) otherlv_2= ';' )
            // InternalBSharp.g:2291:3: ( (lv_name_0_0= ruleTHM_NAME ) ) ( (lv_expr_1_0= ruleRootExpression ) ) otherlv_2= ';'
            {
            // InternalBSharp.g:2291:3: ( (lv_name_0_0= ruleTHM_NAME ) )
            // InternalBSharp.g:2292:4: (lv_name_0_0= ruleTHM_NAME )
            {
            // InternalBSharp.g:2292:4: (lv_name_0_0= ruleTHM_NAME )
            // InternalBSharp.g:2293:5: lv_name_0_0= ruleTHM_NAME
            {

            					newCompositeNode(grammarAccess.getTheoremDeclAccess().getNameTHM_NAMEParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_26);
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

            // InternalBSharp.g:2310:3: ( (lv_expr_1_0= ruleRootExpression ) )
            // InternalBSharp.g:2311:4: (lv_expr_1_0= ruleRootExpression )
            {
            // InternalBSharp.g:2311:4: (lv_expr_1_0= ruleRootExpression )
            // InternalBSharp.g:2312:5: lv_expr_1_0= ruleRootExpression
            {

            					newCompositeNode(grammarAccess.getTheoremDeclAccess().getExprRootExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_43);
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

            otherlv_2=(Token)match(input,22,FOLLOW_2); 

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
    // InternalBSharp.g:2337:1: entryRuleTypedVariableList returns [EObject current=null] : iv_ruleTypedVariableList= ruleTypedVariableList EOF ;
    public final EObject entryRuleTypedVariableList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypedVariableList = null;


        try {
            // InternalBSharp.g:2337:58: (iv_ruleTypedVariableList= ruleTypedVariableList EOF )
            // InternalBSharp.g:2338:2: iv_ruleTypedVariableList= ruleTypedVariableList EOF
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
    // InternalBSharp.g:2344:1: ruleTypedVariableList returns [EObject current=null] : ( ( (lv_variablesOfType_0_0= ruleVariableTyping ) ) (otherlv_1= ',' ( (lv_variablesOfType_2_0= ruleVariableTyping ) ) )* ) ;
    public final EObject ruleTypedVariableList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_variablesOfType_0_0 = null;

        EObject lv_variablesOfType_2_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:2350:2: ( ( ( (lv_variablesOfType_0_0= ruleVariableTyping ) ) (otherlv_1= ',' ( (lv_variablesOfType_2_0= ruleVariableTyping ) ) )* ) )
            // InternalBSharp.g:2351:2: ( ( (lv_variablesOfType_0_0= ruleVariableTyping ) ) (otherlv_1= ',' ( (lv_variablesOfType_2_0= ruleVariableTyping ) ) )* )
            {
            // InternalBSharp.g:2351:2: ( ( (lv_variablesOfType_0_0= ruleVariableTyping ) ) (otherlv_1= ',' ( (lv_variablesOfType_2_0= ruleVariableTyping ) ) )* )
            // InternalBSharp.g:2352:3: ( (lv_variablesOfType_0_0= ruleVariableTyping ) ) (otherlv_1= ',' ( (lv_variablesOfType_2_0= ruleVariableTyping ) ) )*
            {
            // InternalBSharp.g:2352:3: ( (lv_variablesOfType_0_0= ruleVariableTyping ) )
            // InternalBSharp.g:2353:4: (lv_variablesOfType_0_0= ruleVariableTyping )
            {
            // InternalBSharp.g:2353:4: (lv_variablesOfType_0_0= ruleVariableTyping )
            // InternalBSharp.g:2354:5: lv_variablesOfType_0_0= ruleVariableTyping
            {

            					newCompositeNode(grammarAccess.getTypedVariableListAccess().getVariablesOfTypeVariableTypingParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_20);
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

            // InternalBSharp.g:2371:3: (otherlv_1= ',' ( (lv_variablesOfType_2_0= ruleVariableTyping ) ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==25) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalBSharp.g:2372:4: otherlv_1= ',' ( (lv_variablesOfType_2_0= ruleVariableTyping ) )
            	    {
            	    otherlv_1=(Token)match(input,25,FOLLOW_3); 

            	    				newLeafNode(otherlv_1, grammarAccess.getTypedVariableListAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalBSharp.g:2376:4: ( (lv_variablesOfType_2_0= ruleVariableTyping ) )
            	    // InternalBSharp.g:2377:5: (lv_variablesOfType_2_0= ruleVariableTyping )
            	    {
            	    // InternalBSharp.g:2377:5: (lv_variablesOfType_2_0= ruleVariableTyping )
            	    // InternalBSharp.g:2378:6: lv_variablesOfType_2_0= ruleVariableTyping
            	    {

            	    						newCompositeNode(grammarAccess.getTypedVariableListAccess().getVariablesOfTypeVariableTypingParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_20);
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
            	    break loop40;
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
    // InternalBSharp.g:2400:1: entryRuleVariableTyping returns [EObject current=null] : iv_ruleVariableTyping= ruleVariableTyping EOF ;
    public final EObject entryRuleVariableTyping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableTyping = null;


        try {
            // InternalBSharp.g:2400:55: (iv_ruleVariableTyping= ruleVariableTyping EOF )
            // InternalBSharp.g:2401:2: iv_ruleVariableTyping= ruleVariableTyping EOF
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
    // InternalBSharp.g:2407:1: ruleVariableTyping returns [EObject current=null] : ( ( (lv_typeVar_0_0= ruleTypedVariable ) ) (otherlv_1= ',' ( (lv_typeVar_2_0= ruleTypedVariable ) ) )* otherlv_3= ':' ( (lv_type_4_0= ruleConstructedType ) ) ) ;
    public final EObject ruleVariableTyping() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_typeVar_0_0 = null;

        EObject lv_typeVar_2_0 = null;

        EObject lv_type_4_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:2413:2: ( ( ( (lv_typeVar_0_0= ruleTypedVariable ) ) (otherlv_1= ',' ( (lv_typeVar_2_0= ruleTypedVariable ) ) )* otherlv_3= ':' ( (lv_type_4_0= ruleConstructedType ) ) ) )
            // InternalBSharp.g:2414:2: ( ( (lv_typeVar_0_0= ruleTypedVariable ) ) (otherlv_1= ',' ( (lv_typeVar_2_0= ruleTypedVariable ) ) )* otherlv_3= ':' ( (lv_type_4_0= ruleConstructedType ) ) )
            {
            // InternalBSharp.g:2414:2: ( ( (lv_typeVar_0_0= ruleTypedVariable ) ) (otherlv_1= ',' ( (lv_typeVar_2_0= ruleTypedVariable ) ) )* otherlv_3= ':' ( (lv_type_4_0= ruleConstructedType ) ) )
            // InternalBSharp.g:2415:3: ( (lv_typeVar_0_0= ruleTypedVariable ) ) (otherlv_1= ',' ( (lv_typeVar_2_0= ruleTypedVariable ) ) )* otherlv_3= ':' ( (lv_type_4_0= ruleConstructedType ) )
            {
            // InternalBSharp.g:2415:3: ( (lv_typeVar_0_0= ruleTypedVariable ) )
            // InternalBSharp.g:2416:4: (lv_typeVar_0_0= ruleTypedVariable )
            {
            // InternalBSharp.g:2416:4: (lv_typeVar_0_0= ruleTypedVariable )
            // InternalBSharp.g:2417:5: lv_typeVar_0_0= ruleTypedVariable
            {

            					newCompositeNode(grammarAccess.getVariableTypingAccess().getTypeVarTypedVariableParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_44);
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

            // InternalBSharp.g:2434:3: (otherlv_1= ',' ( (lv_typeVar_2_0= ruleTypedVariable ) ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==25) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalBSharp.g:2435:4: otherlv_1= ',' ( (lv_typeVar_2_0= ruleTypedVariable ) )
            	    {
            	    otherlv_1=(Token)match(input,25,FOLLOW_3); 

            	    				newLeafNode(otherlv_1, grammarAccess.getVariableTypingAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalBSharp.g:2439:4: ( (lv_typeVar_2_0= ruleTypedVariable ) )
            	    // InternalBSharp.g:2440:5: (lv_typeVar_2_0= ruleTypedVariable )
            	    {
            	    // InternalBSharp.g:2440:5: (lv_typeVar_2_0= ruleTypedVariable )
            	    // InternalBSharp.g:2441:6: lv_typeVar_2_0= ruleTypedVariable
            	    {

            	    						newCompositeNode(grammarAccess.getVariableTypingAccess().getTypeVarTypedVariableParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_44);
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
            	    break loop41;
                }
            } while (true);

            otherlv_3=(Token)match(input,12,FOLLOW_21); 

            			newLeafNode(otherlv_3, grammarAccess.getVariableTypingAccess().getColonKeyword_2());
            		
            // InternalBSharp.g:2463:3: ( (lv_type_4_0= ruleConstructedType ) )
            // InternalBSharp.g:2464:4: (lv_type_4_0= ruleConstructedType )
            {
            // InternalBSharp.g:2464:4: (lv_type_4_0= ruleConstructedType )
            // InternalBSharp.g:2465:5: lv_type_4_0= ruleConstructedType
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
    // InternalBSharp.g:2486:1: entryRuleTypedVariable returns [EObject current=null] : iv_ruleTypedVariable= ruleTypedVariable EOF ;
    public final EObject entryRuleTypedVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypedVariable = null;


        try {
            // InternalBSharp.g:2486:54: (iv_ruleTypedVariable= ruleTypedVariable EOF )
            // InternalBSharp.g:2487:2: iv_ruleTypedVariable= ruleTypedVariable EOF
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
    // InternalBSharp.g:2493:1: ruleTypedVariable returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleTypedVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalBSharp.g:2499:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalBSharp.g:2500:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalBSharp.g:2500:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalBSharp.g:2501:3: (lv_name_0_0= RULE_ID )
            {
            // InternalBSharp.g:2501:3: (lv_name_0_0= RULE_ID )
            // InternalBSharp.g:2502:4: lv_name_0_0= RULE_ID
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
    // InternalBSharp.g:2521:1: entryRuleLambda returns [EObject current=null] : iv_ruleLambda= ruleLambda EOF ;
    public final EObject entryRuleLambda() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLambda = null;


        try {
            // InternalBSharp.g:2521:47: (iv_ruleLambda= ruleLambda EOF )
            // InternalBSharp.g:2522:2: iv_ruleLambda= ruleLambda EOF
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
    // InternalBSharp.g:2528:1: ruleLambda returns [EObject current=null] : ( ( (lv_qType_0_0= '\\u03BB' ) ) ( (lv_context_1_0= rulePolyContext ) )? ( (lv_varList_2_0= ruleTypedVariableList ) ) otherlv_3= '|' ( (lv_expr_4_0= ruleRootExpression ) ) ) ;
    public final EObject ruleLambda() throws RecognitionException {
        EObject current = null;

        Token lv_qType_0_0=null;
        Token otherlv_3=null;
        EObject lv_context_1_0 = null;

        EObject lv_varList_2_0 = null;

        EObject lv_expr_4_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:2534:2: ( ( ( (lv_qType_0_0= '\\u03BB' ) ) ( (lv_context_1_0= rulePolyContext ) )? ( (lv_varList_2_0= ruleTypedVariableList ) ) otherlv_3= '|' ( (lv_expr_4_0= ruleRootExpression ) ) ) )
            // InternalBSharp.g:2535:2: ( ( (lv_qType_0_0= '\\u03BB' ) ) ( (lv_context_1_0= rulePolyContext ) )? ( (lv_varList_2_0= ruleTypedVariableList ) ) otherlv_3= '|' ( (lv_expr_4_0= ruleRootExpression ) ) )
            {
            // InternalBSharp.g:2535:2: ( ( (lv_qType_0_0= '\\u03BB' ) ) ( (lv_context_1_0= rulePolyContext ) )? ( (lv_varList_2_0= ruleTypedVariableList ) ) otherlv_3= '|' ( (lv_expr_4_0= ruleRootExpression ) ) )
            // InternalBSharp.g:2536:3: ( (lv_qType_0_0= '\\u03BB' ) ) ( (lv_context_1_0= rulePolyContext ) )? ( (lv_varList_2_0= ruleTypedVariableList ) ) otherlv_3= '|' ( (lv_expr_4_0= ruleRootExpression ) )
            {
            // InternalBSharp.g:2536:3: ( (lv_qType_0_0= '\\u03BB' ) )
            // InternalBSharp.g:2537:4: (lv_qType_0_0= '\\u03BB' )
            {
            // InternalBSharp.g:2537:4: (lv_qType_0_0= '\\u03BB' )
            // InternalBSharp.g:2538:5: lv_qType_0_0= '\\u03BB'
            {
            lv_qType_0_0=(Token)match(input,46,FOLLOW_45); 

            					newLeafNode(lv_qType_0_0, grammarAccess.getLambdaAccess().getQTypeGreekSmallLetterLamdaKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLambdaRule());
            					}
            					setWithLastConsumed(current, "qType", lv_qType_0_0, "\u03BB");
            				

            }


            }

            // InternalBSharp.g:2550:3: ( (lv_context_1_0= rulePolyContext ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==23) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalBSharp.g:2551:4: (lv_context_1_0= rulePolyContext )
                    {
                    // InternalBSharp.g:2551:4: (lv_context_1_0= rulePolyContext )
                    // InternalBSharp.g:2552:5: lv_context_1_0= rulePolyContext
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

            // InternalBSharp.g:2569:3: ( (lv_varList_2_0= ruleTypedVariableList ) )
            // InternalBSharp.g:2570:4: (lv_varList_2_0= ruleTypedVariableList )
            {
            // InternalBSharp.g:2570:4: (lv_varList_2_0= ruleTypedVariableList )
            // InternalBSharp.g:2571:5: lv_varList_2_0= ruleTypedVariableList
            {

            					newCompositeNode(grammarAccess.getLambdaAccess().getVarListTypedVariableListParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_29);
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

            otherlv_3=(Token)match(input,39,FOLLOW_26); 

            			newLeafNode(otherlv_3, grammarAccess.getLambdaAccess().getVerticalLineKeyword_3());
            		
            // InternalBSharp.g:2592:3: ( (lv_expr_4_0= ruleRootExpression ) )
            // InternalBSharp.g:2593:4: (lv_expr_4_0= ruleRootExpression )
            {
            // InternalBSharp.g:2593:4: (lv_expr_4_0= ruleRootExpression )
            // InternalBSharp.g:2594:5: lv_expr_4_0= ruleRootExpression
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
    // InternalBSharp.g:2615:1: entryRuleQuantifier returns [EObject current=null] : iv_ruleQuantifier= ruleQuantifier EOF ;
    public final EObject entryRuleQuantifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuantifier = null;


        try {
            // InternalBSharp.g:2615:51: (iv_ruleQuantifier= ruleQuantifier EOF )
            // InternalBSharp.g:2616:2: iv_ruleQuantifier= ruleQuantifier EOF
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
    // InternalBSharp.g:2622:1: ruleQuantifier returns [EObject current=null] : ( ( ( (lv_qType_0_1= '\\u2200' | lv_qType_0_2= '\\u2203' ) ) ) ( (lv_context_1_0= rulePolyContext ) )? ( (lv_varList_2_0= ruleTypedVariableList ) ) otherlv_3= '\\u00B7' ( (lv_expr_4_0= ruleRootExpression ) ) ) ;
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
            // InternalBSharp.g:2628:2: ( ( ( ( (lv_qType_0_1= '\\u2200' | lv_qType_0_2= '\\u2203' ) ) ) ( (lv_context_1_0= rulePolyContext ) )? ( (lv_varList_2_0= ruleTypedVariableList ) ) otherlv_3= '\\u00B7' ( (lv_expr_4_0= ruleRootExpression ) ) ) )
            // InternalBSharp.g:2629:2: ( ( ( (lv_qType_0_1= '\\u2200' | lv_qType_0_2= '\\u2203' ) ) ) ( (lv_context_1_0= rulePolyContext ) )? ( (lv_varList_2_0= ruleTypedVariableList ) ) otherlv_3= '\\u00B7' ( (lv_expr_4_0= ruleRootExpression ) ) )
            {
            // InternalBSharp.g:2629:2: ( ( ( (lv_qType_0_1= '\\u2200' | lv_qType_0_2= '\\u2203' ) ) ) ( (lv_context_1_0= rulePolyContext ) )? ( (lv_varList_2_0= ruleTypedVariableList ) ) otherlv_3= '\\u00B7' ( (lv_expr_4_0= ruleRootExpression ) ) )
            // InternalBSharp.g:2630:3: ( ( (lv_qType_0_1= '\\u2200' | lv_qType_0_2= '\\u2203' ) ) ) ( (lv_context_1_0= rulePolyContext ) )? ( (lv_varList_2_0= ruleTypedVariableList ) ) otherlv_3= '\\u00B7' ( (lv_expr_4_0= ruleRootExpression ) )
            {
            // InternalBSharp.g:2630:3: ( ( (lv_qType_0_1= '\\u2200' | lv_qType_0_2= '\\u2203' ) ) )
            // InternalBSharp.g:2631:4: ( (lv_qType_0_1= '\\u2200' | lv_qType_0_2= '\\u2203' ) )
            {
            // InternalBSharp.g:2631:4: ( (lv_qType_0_1= '\\u2200' | lv_qType_0_2= '\\u2203' ) )
            // InternalBSharp.g:2632:5: (lv_qType_0_1= '\\u2200' | lv_qType_0_2= '\\u2203' )
            {
            // InternalBSharp.g:2632:5: (lv_qType_0_1= '\\u2200' | lv_qType_0_2= '\\u2203' )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==47) ) {
                alt43=1;
            }
            else if ( (LA43_0==48) ) {
                alt43=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // InternalBSharp.g:2633:6: lv_qType_0_1= '\\u2200'
                    {
                    lv_qType_0_1=(Token)match(input,47,FOLLOW_45); 

                    						newLeafNode(lv_qType_0_1, grammarAccess.getQuantifierAccess().getQTypeForAllKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getQuantifierRule());
                    						}
                    						setWithLastConsumed(current, "qType", lv_qType_0_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalBSharp.g:2644:6: lv_qType_0_2= '\\u2203'
                    {
                    lv_qType_0_2=(Token)match(input,48,FOLLOW_45); 

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

            // InternalBSharp.g:2657:3: ( (lv_context_1_0= rulePolyContext ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==23) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalBSharp.g:2658:4: (lv_context_1_0= rulePolyContext )
                    {
                    // InternalBSharp.g:2658:4: (lv_context_1_0= rulePolyContext )
                    // InternalBSharp.g:2659:5: lv_context_1_0= rulePolyContext
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

            // InternalBSharp.g:2676:3: ( (lv_varList_2_0= ruleTypedVariableList ) )
            // InternalBSharp.g:2677:4: (lv_varList_2_0= ruleTypedVariableList )
            {
            // InternalBSharp.g:2677:4: (lv_varList_2_0= ruleTypedVariableList )
            // InternalBSharp.g:2678:5: lv_varList_2_0= ruleTypedVariableList
            {

            					newCompositeNode(grammarAccess.getQuantifierAccess().getVarListTypedVariableListParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_46);
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

            otherlv_3=(Token)match(input,49,FOLLOW_26); 

            			newLeafNode(otherlv_3, grammarAccess.getQuantifierAccess().getMiddleDotKeyword_3());
            		
            // InternalBSharp.g:2699:3: ( (lv_expr_4_0= ruleRootExpression ) )
            // InternalBSharp.g:2700:4: (lv_expr_4_0= ruleRootExpression )
            {
            // InternalBSharp.g:2700:4: (lv_expr_4_0= ruleRootExpression )
            // InternalBSharp.g:2701:5: lv_expr_4_0= ruleRootExpression
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
    // InternalBSharp.g:2722:1: entryRuleRootExpression returns [EObject current=null] : iv_ruleRootExpression= ruleRootExpression EOF ;
    public final EObject entryRuleRootExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRootExpression = null;


        try {
            // InternalBSharp.g:2722:55: (iv_ruleRootExpression= ruleRootExpression EOF )
            // InternalBSharp.g:2723:2: iv_ruleRootExpression= ruleRootExpression EOF
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
    // InternalBSharp.g:2729:1: ruleRootExpression returns [EObject current=null] : (this_Lambda_0= ruleLambda | this_Quantifier_1= ruleQuantifier | this_Infix_2= ruleInfix | this_MatchStatement_3= ruleMatchStatement ) ;
    public final EObject ruleRootExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Lambda_0 = null;

        EObject this_Quantifier_1 = null;

        EObject this_Infix_2 = null;

        EObject this_MatchStatement_3 = null;



        	enterRule();

        try {
            // InternalBSharp.g:2735:2: ( (this_Lambda_0= ruleLambda | this_Quantifier_1= ruleQuantifier | this_Infix_2= ruleInfix | this_MatchStatement_3= ruleMatchStatement ) )
            // InternalBSharp.g:2736:2: (this_Lambda_0= ruleLambda | this_Quantifier_1= ruleQuantifier | this_Infix_2= ruleInfix | this_MatchStatement_3= ruleMatchStatement )
            {
            // InternalBSharp.g:2736:2: (this_Lambda_0= ruleLambda | this_Quantifier_1= ruleQuantifier | this_Infix_2= ruleInfix | this_MatchStatement_3= ruleMatchStatement )
            int alt45=4;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt45=1;
                }
                break;
            case 47:
            case 48:
                {
                alt45=2;
                }
                break;
            case RULE_ID:
            case 18:
            case 20:
            case 50:
                {
                alt45=3;
                }
                break;
            case 44:
                {
                alt45=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // InternalBSharp.g:2737:3: this_Lambda_0= ruleLambda
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
                    // InternalBSharp.g:2746:3: this_Quantifier_1= ruleQuantifier
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
                    // InternalBSharp.g:2755:3: this_Infix_2= ruleInfix
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
                    // InternalBSharp.g:2764:3: this_MatchStatement_3= ruleMatchStatement
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
    // InternalBSharp.g:2776:1: entryRulePrefix returns [EObject current=null] : iv_rulePrefix= rulePrefix EOF ;
    public final EObject entryRulePrefix() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrefix = null;


        try {
            // InternalBSharp.g:2776:47: (iv_rulePrefix= rulePrefix EOF )
            // InternalBSharp.g:2777:2: iv_rulePrefix= rulePrefix EOF
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
    // InternalBSharp.g:2783:1: rulePrefix returns [EObject current=null] : ( ( (lv_name_0_0= rulePrefixBuiltIn ) ) ( (lv_elem_1_0= ruleElement ) ) ) ;
    public final EObject rulePrefix() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_elem_1_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:2789:2: ( ( ( (lv_name_0_0= rulePrefixBuiltIn ) ) ( (lv_elem_1_0= ruleElement ) ) ) )
            // InternalBSharp.g:2790:2: ( ( (lv_name_0_0= rulePrefixBuiltIn ) ) ( (lv_elem_1_0= ruleElement ) ) )
            {
            // InternalBSharp.g:2790:2: ( ( (lv_name_0_0= rulePrefixBuiltIn ) ) ( (lv_elem_1_0= ruleElement ) ) )
            // InternalBSharp.g:2791:3: ( (lv_name_0_0= rulePrefixBuiltIn ) ) ( (lv_elem_1_0= ruleElement ) )
            {
            // InternalBSharp.g:2791:3: ( (lv_name_0_0= rulePrefixBuiltIn ) )
            // InternalBSharp.g:2792:4: (lv_name_0_0= rulePrefixBuiltIn )
            {
            // InternalBSharp.g:2792:4: (lv_name_0_0= rulePrefixBuiltIn )
            // InternalBSharp.g:2793:5: lv_name_0_0= rulePrefixBuiltIn
            {

            					newCompositeNode(grammarAccess.getPrefixAccess().getNamePrefixBuiltInParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_47);
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

            // InternalBSharp.g:2810:3: ( (lv_elem_1_0= ruleElement ) )
            // InternalBSharp.g:2811:4: (lv_elem_1_0= ruleElement )
            {
            // InternalBSharp.g:2811:4: (lv_elem_1_0= ruleElement )
            // InternalBSharp.g:2812:5: lv_elem_1_0= ruleElement
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
    // InternalBSharp.g:2833:1: entryRulePrefixBuiltIn returns [String current=null] : iv_rulePrefixBuiltIn= rulePrefixBuiltIn EOF ;
    public final String entryRulePrefixBuiltIn() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrefixBuiltIn = null;


        try {
            // InternalBSharp.g:2833:53: (iv_rulePrefixBuiltIn= rulePrefixBuiltIn EOF )
            // InternalBSharp.g:2834:2: iv_rulePrefixBuiltIn= rulePrefixBuiltIn EOF
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
    // InternalBSharp.g:2840:1: rulePrefixBuiltIn returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '\\u00AC' ;
    public final AntlrDatatypeRuleToken rulePrefixBuiltIn() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalBSharp.g:2846:2: (kw= '\\u00AC' )
            // InternalBSharp.g:2847:2: kw= '\\u00AC'
            {
            kw=(Token)match(input,50,FOLLOW_2); 

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
    // InternalBSharp.g:2855:1: entryRuleInfix returns [EObject current=null] : iv_ruleInfix= ruleInfix EOF ;
    public final EObject entryRuleInfix() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInfix = null;


        try {
            // InternalBSharp.g:2855:46: (iv_ruleInfix= ruleInfix EOF )
            // InternalBSharp.g:2856:2: iv_ruleInfix= ruleInfix EOF
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
    // InternalBSharp.g:2862:1: ruleInfix returns [EObject current=null] : (this_Element_0= ruleElement ( () ( ( (otherlv_2= RULE_ID ) ) | ( (lv_opName_3_0= ruleInbuiltInfix ) ) ) ( (lv_right_4_0= ruleElement ) ) )* ) ;
    public final EObject ruleInfix() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Element_0 = null;

        AntlrDatatypeRuleToken lv_opName_3_0 = null;

        EObject lv_right_4_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:2868:2: ( (this_Element_0= ruleElement ( () ( ( (otherlv_2= RULE_ID ) ) | ( (lv_opName_3_0= ruleInbuiltInfix ) ) ) ( (lv_right_4_0= ruleElement ) ) )* ) )
            // InternalBSharp.g:2869:2: (this_Element_0= ruleElement ( () ( ( (otherlv_2= RULE_ID ) ) | ( (lv_opName_3_0= ruleInbuiltInfix ) ) ) ( (lv_right_4_0= ruleElement ) ) )* )
            {
            // InternalBSharp.g:2869:2: (this_Element_0= ruleElement ( () ( ( (otherlv_2= RULE_ID ) ) | ( (lv_opName_3_0= ruleInbuiltInfix ) ) ) ( (lv_right_4_0= ruleElement ) ) )* )
            // InternalBSharp.g:2870:3: this_Element_0= ruleElement ( () ( ( (otherlv_2= RULE_ID ) ) | ( (lv_opName_3_0= ruleInbuiltInfix ) ) ) ( (lv_right_4_0= ruleElement ) ) )*
            {

            			newCompositeNode(grammarAccess.getInfixAccess().getElementParserRuleCall_0());
            		
            pushFollow(FOLLOW_48);
            this_Element_0=ruleElement();

            state._fsp--;


            			current = this_Element_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalBSharp.g:2878:3: ( () ( ( (otherlv_2= RULE_ID ) ) | ( (lv_opName_3_0= ruleInbuiltInfix ) ) ) ( (lv_right_4_0= ruleElement ) ) )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==RULE_ID) ) {
                    int LA47_2 = input.LA(2);

                    if ( (LA47_2==20) ) {
                        int LA47_4 = input.LA(3);

                        if ( (LA47_4==RULE_ID) ) {
                            int LA47_5 = input.LA(4);

                            if ( (LA47_5==RULE_ID||LA47_5==13||(LA47_5>=20 && LA47_5<=21)||LA47_5==23||(LA47_5>=51 && LA47_5<=56)) ) {
                                alt47=1;
                            }


                        }
                        else if ( (LA47_4==18||LA47_4==20||LA47_4==44||(LA47_4>=46 && LA47_4<=48)||LA47_4==50) ) {
                            alt47=1;
                        }


                    }
                    else if ( (LA47_2==RULE_ID||LA47_2==18||LA47_2==50) ) {
                        alt47=1;
                    }


                }
                else if ( ((LA47_0>=51 && LA47_0<=56)) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalBSharp.g:2879:4: () ( ( (otherlv_2= RULE_ID ) ) | ( (lv_opName_3_0= ruleInbuiltInfix ) ) ) ( (lv_right_4_0= ruleElement ) )
            	    {
            	    // InternalBSharp.g:2879:4: ()
            	    // InternalBSharp.g:2880:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getInfixAccess().getInfixLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalBSharp.g:2886:4: ( ( (otherlv_2= RULE_ID ) ) | ( (lv_opName_3_0= ruleInbuiltInfix ) ) )
            	    int alt46=2;
            	    int LA46_0 = input.LA(1);

            	    if ( (LA46_0==RULE_ID) ) {
            	        alt46=1;
            	    }
            	    else if ( ((LA46_0>=51 && LA46_0<=56)) ) {
            	        alt46=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 46, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt46) {
            	        case 1 :
            	            // InternalBSharp.g:2887:5: ( (otherlv_2= RULE_ID ) )
            	            {
            	            // InternalBSharp.g:2887:5: ( (otherlv_2= RULE_ID ) )
            	            // InternalBSharp.g:2888:6: (otherlv_2= RULE_ID )
            	            {
            	            // InternalBSharp.g:2888:6: (otherlv_2= RULE_ID )
            	            // InternalBSharp.g:2889:7: otherlv_2= RULE_ID
            	            {

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getInfixRule());
            	            							}
            	            						
            	            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_47); 

            	            							newLeafNode(otherlv_2, grammarAccess.getInfixAccess().getFuncNameFunctionDeclCrossReference_1_1_0_0());
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalBSharp.g:2901:5: ( (lv_opName_3_0= ruleInbuiltInfix ) )
            	            {
            	            // InternalBSharp.g:2901:5: ( (lv_opName_3_0= ruleInbuiltInfix ) )
            	            // InternalBSharp.g:2902:6: (lv_opName_3_0= ruleInbuiltInfix )
            	            {
            	            // InternalBSharp.g:2902:6: (lv_opName_3_0= ruleInbuiltInfix )
            	            // InternalBSharp.g:2903:7: lv_opName_3_0= ruleInbuiltInfix
            	            {

            	            							newCompositeNode(grammarAccess.getInfixAccess().getOpNameInbuiltInfixParserRuleCall_1_1_1_0());
            	            						
            	            pushFollow(FOLLOW_47);
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

            	    // InternalBSharp.g:2921:4: ( (lv_right_4_0= ruleElement ) )
            	    // InternalBSharp.g:2922:5: (lv_right_4_0= ruleElement )
            	    {
            	    // InternalBSharp.g:2922:5: (lv_right_4_0= ruleElement )
            	    // InternalBSharp.g:2923:6: lv_right_4_0= ruleElement
            	    {

            	    						newCompositeNode(grammarAccess.getInfixAccess().getRightElementParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_48);
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
            	    break loop47;
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
    // InternalBSharp.g:2945:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // InternalBSharp.g:2945:48: (iv_ruleElement= ruleElement EOF )
            // InternalBSharp.g:2946:2: iv_ruleElement= ruleElement EOF
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
    // InternalBSharp.g:2952:1: ruleElement returns [EObject current=null] : (this_Bracket_0= ruleBracket | this_Prefix_1= rulePrefix | this_FunctionCall_2= ruleFunctionCall ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        EObject this_Bracket_0 = null;

        EObject this_Prefix_1 = null;

        EObject this_FunctionCall_2 = null;



        	enterRule();

        try {
            // InternalBSharp.g:2958:2: ( (this_Bracket_0= ruleBracket | this_Prefix_1= rulePrefix | this_FunctionCall_2= ruleFunctionCall ) )
            // InternalBSharp.g:2959:2: (this_Bracket_0= ruleBracket | this_Prefix_1= rulePrefix | this_FunctionCall_2= ruleFunctionCall )
            {
            // InternalBSharp.g:2959:2: (this_Bracket_0= ruleBracket | this_Prefix_1= rulePrefix | this_FunctionCall_2= ruleFunctionCall )
            int alt48=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt48=1;
                }
                break;
            case 50:
                {
                alt48=2;
                }
                break;
            case RULE_ID:
            case 18:
                {
                alt48=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }

            switch (alt48) {
                case 1 :
                    // InternalBSharp.g:2960:3: this_Bracket_0= ruleBracket
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
                    // InternalBSharp.g:2969:3: this_Prefix_1= rulePrefix
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
                    // InternalBSharp.g:2978:3: this_FunctionCall_2= ruleFunctionCall
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
    // InternalBSharp.g:2990:1: entryRuleBracket returns [EObject current=null] : iv_ruleBracket= ruleBracket EOF ;
    public final EObject entryRuleBracket() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBracket = null;


        try {
            // InternalBSharp.g:2990:48: (iv_ruleBracket= ruleBracket EOF )
            // InternalBSharp.g:2991:2: iv_ruleBracket= ruleBracket EOF
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
    // InternalBSharp.g:2997:1: ruleBracket returns [EObject current=null] : (otherlv_0= '(' ( (lv_child_1_0= ruleRootExpression ) ) otherlv_2= ')' ) ;
    public final EObject ruleBracket() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_child_1_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:3003:2: ( (otherlv_0= '(' ( (lv_child_1_0= ruleRootExpression ) ) otherlv_2= ')' ) )
            // InternalBSharp.g:3004:2: (otherlv_0= '(' ( (lv_child_1_0= ruleRootExpression ) ) otherlv_2= ')' )
            {
            // InternalBSharp.g:3004:2: (otherlv_0= '(' ( (lv_child_1_0= ruleRootExpression ) ) otherlv_2= ')' )
            // InternalBSharp.g:3005:3: otherlv_0= '(' ( (lv_child_1_0= ruleRootExpression ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getBracketAccess().getLeftParenthesisKeyword_0());
            		
            // InternalBSharp.g:3009:3: ( (lv_child_1_0= ruleRootExpression ) )
            // InternalBSharp.g:3010:4: (lv_child_1_0= ruleRootExpression )
            {
            // InternalBSharp.g:3010:4: (lv_child_1_0= ruleRootExpression )
            // InternalBSharp.g:3011:5: lv_child_1_0= ruleRootExpression
            {

            					newCompositeNode(grammarAccess.getBracketAccess().getChildRootExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_17);
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

            otherlv_2=(Token)match(input,21,FOLLOW_2); 

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
    // InternalBSharp.g:3036:1: entryRuleFunctionCall returns [EObject current=null] : iv_ruleFunctionCall= ruleFunctionCall EOF ;
    public final EObject entryRuleFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCall = null;


        try {
            // InternalBSharp.g:3036:53: (iv_ruleFunctionCall= ruleFunctionCall EOF )
            // InternalBSharp.g:3037:2: iv_ruleFunctionCall= ruleFunctionCall EOF
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
    // InternalBSharp.g:3043:1: ruleFunctionCall returns [EObject current=null] : ( ( (lv_wrapped_0_0= ruleWrappedInfix ) ) | ( ( ( (otherlv_1= RULE_ID ) ) | ( (lv_classVarDecl_2_0= ruleClassVarDecl ) ) ) ( ( (lv_context_3_0= ruleTypeDeclContext ) )? otherlv_4= '(' ( (lv_arguments_5_0= ruleRootExpression ) )? (otherlv_6= ',' ( (lv_arguments_7_0= ruleRootExpression ) ) )* otherlv_8= ')' )? ) ) ;
    public final EObject ruleFunctionCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_wrapped_0_0 = null;

        EObject lv_classVarDecl_2_0 = null;

        EObject lv_context_3_0 = null;

        EObject lv_arguments_5_0 = null;

        EObject lv_arguments_7_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:3049:2: ( ( ( (lv_wrapped_0_0= ruleWrappedInfix ) ) | ( ( ( (otherlv_1= RULE_ID ) ) | ( (lv_classVarDecl_2_0= ruleClassVarDecl ) ) ) ( ( (lv_context_3_0= ruleTypeDeclContext ) )? otherlv_4= '(' ( (lv_arguments_5_0= ruleRootExpression ) )? (otherlv_6= ',' ( (lv_arguments_7_0= ruleRootExpression ) ) )* otherlv_8= ')' )? ) ) )
            // InternalBSharp.g:3050:2: ( ( (lv_wrapped_0_0= ruleWrappedInfix ) ) | ( ( ( (otherlv_1= RULE_ID ) ) | ( (lv_classVarDecl_2_0= ruleClassVarDecl ) ) ) ( ( (lv_context_3_0= ruleTypeDeclContext ) )? otherlv_4= '(' ( (lv_arguments_5_0= ruleRootExpression ) )? (otherlv_6= ',' ( (lv_arguments_7_0= ruleRootExpression ) ) )* otherlv_8= ')' )? ) )
            {
            // InternalBSharp.g:3050:2: ( ( (lv_wrapped_0_0= ruleWrappedInfix ) ) | ( ( ( (otherlv_1= RULE_ID ) ) | ( (lv_classVarDecl_2_0= ruleClassVarDecl ) ) ) ( ( (lv_context_3_0= ruleTypeDeclContext ) )? otherlv_4= '(' ( (lv_arguments_5_0= ruleRootExpression ) )? (otherlv_6= ',' ( (lv_arguments_7_0= ruleRootExpression ) ) )* otherlv_8= ')' )? ) )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==18) ) {
                alt54=1;
            }
            else if ( (LA54_0==RULE_ID) ) {
                alt54=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // InternalBSharp.g:3051:3: ( (lv_wrapped_0_0= ruleWrappedInfix ) )
                    {
                    // InternalBSharp.g:3051:3: ( (lv_wrapped_0_0= ruleWrappedInfix ) )
                    // InternalBSharp.g:3052:4: (lv_wrapped_0_0= ruleWrappedInfix )
                    {
                    // InternalBSharp.g:3052:4: (lv_wrapped_0_0= ruleWrappedInfix )
                    // InternalBSharp.g:3053:5: lv_wrapped_0_0= ruleWrappedInfix
                    {

                    					newCompositeNode(grammarAccess.getFunctionCallAccess().getWrappedWrappedInfixParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_wrapped_0_0=ruleWrappedInfix();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFunctionCallRule());
                    					}
                    					set(
                    						current,
                    						"wrapped",
                    						lv_wrapped_0_0,
                    						"ac.soton.bsharp.BSharp.WrappedInfix");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalBSharp.g:3071:3: ( ( ( (otherlv_1= RULE_ID ) ) | ( (lv_classVarDecl_2_0= ruleClassVarDecl ) ) ) ( ( (lv_context_3_0= ruleTypeDeclContext ) )? otherlv_4= '(' ( (lv_arguments_5_0= ruleRootExpression ) )? (otherlv_6= ',' ( (lv_arguments_7_0= ruleRootExpression ) ) )* otherlv_8= ')' )? )
                    {
                    // InternalBSharp.g:3071:3: ( ( ( (otherlv_1= RULE_ID ) ) | ( (lv_classVarDecl_2_0= ruleClassVarDecl ) ) ) ( ( (lv_context_3_0= ruleTypeDeclContext ) )? otherlv_4= '(' ( (lv_arguments_5_0= ruleRootExpression ) )? (otherlv_6= ',' ( (lv_arguments_7_0= ruleRootExpression ) ) )* otherlv_8= ')' )? )
                    // InternalBSharp.g:3072:4: ( ( (otherlv_1= RULE_ID ) ) | ( (lv_classVarDecl_2_0= ruleClassVarDecl ) ) ) ( ( (lv_context_3_0= ruleTypeDeclContext ) )? otherlv_4= '(' ( (lv_arguments_5_0= ruleRootExpression ) )? (otherlv_6= ',' ( (lv_arguments_7_0= ruleRootExpression ) ) )* otherlv_8= ')' )?
                    {
                    // InternalBSharp.g:3072:4: ( ( (otherlv_1= RULE_ID ) ) | ( (lv_classVarDecl_2_0= ruleClassVarDecl ) ) )
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==RULE_ID) ) {
                        int LA49_1 = input.LA(2);

                        if ( (LA49_1==13) ) {
                            alt49=2;
                        }
                        else if ( (LA49_1==EOF||LA49_1==RULE_ID||(LA49_1>=20 && LA49_1<=23)||LA49_1==25||LA49_1==39||(LA49_1>=41 && LA49_1<=42)||LA49_1==45||(LA49_1>=51 && LA49_1<=57)) ) {
                            alt49=1;
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
                            // InternalBSharp.g:3073:5: ( (otherlv_1= RULE_ID ) )
                            {
                            // InternalBSharp.g:3073:5: ( (otherlv_1= RULE_ID ) )
                            // InternalBSharp.g:3074:6: (otherlv_1= RULE_ID )
                            {
                            // InternalBSharp.g:3074:6: (otherlv_1= RULE_ID )
                            // InternalBSharp.g:3075:7: otherlv_1= RULE_ID
                            {

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getFunctionCallRule());
                            							}
                            						
                            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_49); 

                            							newLeafNode(otherlv_1, grammarAccess.getFunctionCallAccess().getTypeInstExpressionVariableCrossReference_1_0_0_0());
                            						

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalBSharp.g:3087:5: ( (lv_classVarDecl_2_0= ruleClassVarDecl ) )
                            {
                            // InternalBSharp.g:3087:5: ( (lv_classVarDecl_2_0= ruleClassVarDecl ) )
                            // InternalBSharp.g:3088:6: (lv_classVarDecl_2_0= ruleClassVarDecl )
                            {
                            // InternalBSharp.g:3088:6: (lv_classVarDecl_2_0= ruleClassVarDecl )
                            // InternalBSharp.g:3089:7: lv_classVarDecl_2_0= ruleClassVarDecl
                            {

                            							newCompositeNode(grammarAccess.getFunctionCallAccess().getClassVarDeclClassVarDeclParserRuleCall_1_0_1_0());
                            						
                            pushFollow(FOLLOW_49);
                            lv_classVarDecl_2_0=ruleClassVarDecl();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getFunctionCallRule());
                            							}
                            							set(
                            								current,
                            								"classVarDecl",
                            								lv_classVarDecl_2_0,
                            								"ac.soton.bsharp.BSharp.ClassVarDecl");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }

                    // InternalBSharp.g:3107:4: ( ( (lv_context_3_0= ruleTypeDeclContext ) )? otherlv_4= '(' ( (lv_arguments_5_0= ruleRootExpression ) )? (otherlv_6= ',' ( (lv_arguments_7_0= ruleRootExpression ) ) )* otherlv_8= ')' )?
                    int alt53=2;
                    int LA53_0 = input.LA(1);

                    if ( (LA53_0==20||LA53_0==23) ) {
                        alt53=1;
                    }
                    switch (alt53) {
                        case 1 :
                            // InternalBSharp.g:3108:5: ( (lv_context_3_0= ruleTypeDeclContext ) )? otherlv_4= '(' ( (lv_arguments_5_0= ruleRootExpression ) )? (otherlv_6= ',' ( (lv_arguments_7_0= ruleRootExpression ) ) )* otherlv_8= ')'
                            {
                            // InternalBSharp.g:3108:5: ( (lv_context_3_0= ruleTypeDeclContext ) )?
                            int alt50=2;
                            int LA50_0 = input.LA(1);

                            if ( (LA50_0==23) ) {
                                alt50=1;
                            }
                            switch (alt50) {
                                case 1 :
                                    // InternalBSharp.g:3109:6: (lv_context_3_0= ruleTypeDeclContext )
                                    {
                                    // InternalBSharp.g:3109:6: (lv_context_3_0= ruleTypeDeclContext )
                                    // InternalBSharp.g:3110:7: lv_context_3_0= ruleTypeDeclContext
                                    {

                                    							newCompositeNode(grammarAccess.getFunctionCallAccess().getContextTypeDeclContextParserRuleCall_1_1_0_0());
                                    						
                                    pushFollow(FOLLOW_24);
                                    lv_context_3_0=ruleTypeDeclContext();

                                    state._fsp--;


                                    							if (current==null) {
                                    								current = createModelElementForParent(grammarAccess.getFunctionCallRule());
                                    							}
                                    							set(
                                    								current,
                                    								"context",
                                    								lv_context_3_0,
                                    								"ac.soton.bsharp.BSharp.TypeDeclContext");
                                    							afterParserOrEnumRuleCall();
                                    						

                                    }


                                    }
                                    break;

                            }

                            otherlv_4=(Token)match(input,20,FOLLOW_50); 

                            					newLeafNode(otherlv_4, grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_1_1_1());
                            				
                            // InternalBSharp.g:3131:5: ( (lv_arguments_5_0= ruleRootExpression ) )?
                            int alt51=2;
                            int LA51_0 = input.LA(1);

                            if ( (LA51_0==RULE_ID||LA51_0==18||LA51_0==20||LA51_0==44||(LA51_0>=46 && LA51_0<=48)||LA51_0==50) ) {
                                alt51=1;
                            }
                            switch (alt51) {
                                case 1 :
                                    // InternalBSharp.g:3132:6: (lv_arguments_5_0= ruleRootExpression )
                                    {
                                    // InternalBSharp.g:3132:6: (lv_arguments_5_0= ruleRootExpression )
                                    // InternalBSharp.g:3133:7: lv_arguments_5_0= ruleRootExpression
                                    {

                                    							newCompositeNode(grammarAccess.getFunctionCallAccess().getArgumentsRootExpressionParserRuleCall_1_1_2_0());
                                    						
                                    pushFollow(FOLLOW_41);
                                    lv_arguments_5_0=ruleRootExpression();

                                    state._fsp--;


                                    							if (current==null) {
                                    								current = createModelElementForParent(grammarAccess.getFunctionCallRule());
                                    							}
                                    							add(
                                    								current,
                                    								"arguments",
                                    								lv_arguments_5_0,
                                    								"ac.soton.bsharp.BSharp.RootExpression");
                                    							afterParserOrEnumRuleCall();
                                    						

                                    }


                                    }
                                    break;

                            }

                            // InternalBSharp.g:3150:5: (otherlv_6= ',' ( (lv_arguments_7_0= ruleRootExpression ) ) )*
                            loop52:
                            do {
                                int alt52=2;
                                int LA52_0 = input.LA(1);

                                if ( (LA52_0==25) ) {
                                    alt52=1;
                                }


                                switch (alt52) {
                            	case 1 :
                            	    // InternalBSharp.g:3151:6: otherlv_6= ',' ( (lv_arguments_7_0= ruleRootExpression ) )
                            	    {
                            	    otherlv_6=(Token)match(input,25,FOLLOW_26); 

                            	    						newLeafNode(otherlv_6, grammarAccess.getFunctionCallAccess().getCommaKeyword_1_1_3_0());
                            	    					
                            	    // InternalBSharp.g:3155:6: ( (lv_arguments_7_0= ruleRootExpression ) )
                            	    // InternalBSharp.g:3156:7: (lv_arguments_7_0= ruleRootExpression )
                            	    {
                            	    // InternalBSharp.g:3156:7: (lv_arguments_7_0= ruleRootExpression )
                            	    // InternalBSharp.g:3157:8: lv_arguments_7_0= ruleRootExpression
                            	    {

                            	    								newCompositeNode(grammarAccess.getFunctionCallAccess().getArgumentsRootExpressionParserRuleCall_1_1_3_1_0());
                            	    							
                            	    pushFollow(FOLLOW_41);
                            	    lv_arguments_7_0=ruleRootExpression();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getFunctionCallRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"arguments",
                            	    									lv_arguments_7_0,
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

                            otherlv_8=(Token)match(input,21,FOLLOW_2); 

                            					newLeafNode(otherlv_8, grammarAccess.getFunctionCallAccess().getRightParenthesisKeyword_1_1_4());
                            				

                            }
                            break;

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
    // $ANTLR end "ruleFunctionCall"


    // $ANTLR start "entryRuleClassVarDecl"
    // InternalBSharp.g:3185:1: entryRuleClassVarDecl returns [EObject current=null] : iv_ruleClassVarDecl= ruleClassVarDecl EOF ;
    public final EObject entryRuleClassVarDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassVarDecl = null;


        try {
            // InternalBSharp.g:3185:53: (iv_ruleClassVarDecl= ruleClassVarDecl EOF )
            // InternalBSharp.g:3186:2: iv_ruleClassVarDecl= ruleClassVarDecl EOF
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
    // InternalBSharp.g:3192:1: ruleClassVarDecl returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleClassVarDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalBSharp.g:3198:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalBSharp.g:3199:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalBSharp.g:3199:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) )
            // InternalBSharp.g:3200:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) )
            {
            // InternalBSharp.g:3200:3: ( (otherlv_0= RULE_ID ) )
            // InternalBSharp.g:3201:4: (otherlv_0= RULE_ID )
            {
            // InternalBSharp.g:3201:4: (otherlv_0= RULE_ID )
            // InternalBSharp.g:3202:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getClassVarDeclRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_51); 

            					newLeafNode(otherlv_0, grammarAccess.getClassVarDeclAccess().getOwnerTypeGenNameCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getClassVarDeclAccess().getFullStopKeyword_1());
            		
            // InternalBSharp.g:3217:3: ( (otherlv_2= RULE_ID ) )
            // InternalBSharp.g:3218:4: (otherlv_2= RULE_ID )
            {
            // InternalBSharp.g:3218:4: (otherlv_2= RULE_ID )
            // InternalBSharp.g:3219:5: otherlv_2= RULE_ID
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
    // InternalBSharp.g:3234:1: entryRuleInbuiltInfix returns [String current=null] : iv_ruleInbuiltInfix= ruleInbuiltInfix EOF ;
    public final String entryRuleInbuiltInfix() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInbuiltInfix = null;


        try {
            // InternalBSharp.g:3234:52: (iv_ruleInbuiltInfix= ruleInbuiltInfix EOF )
            // InternalBSharp.g:3235:2: iv_ruleInbuiltInfix= ruleInbuiltInfix EOF
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
    // InternalBSharp.g:3241:1: ruleInbuiltInfix returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '\\u21D4' | kw= '\\u21D2' | kw= '=' | kw= '\\u2260' | kw= '\\u2227' | kw= '\\u2228' ) ;
    public final AntlrDatatypeRuleToken ruleInbuiltInfix() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalBSharp.g:3247:2: ( (kw= '\\u21D4' | kw= '\\u21D2' | kw= '=' | kw= '\\u2260' | kw= '\\u2227' | kw= '\\u2228' ) )
            // InternalBSharp.g:3248:2: (kw= '\\u21D4' | kw= '\\u21D2' | kw= '=' | kw= '\\u2260' | kw= '\\u2227' | kw= '\\u2228' )
            {
            // InternalBSharp.g:3248:2: (kw= '\\u21D4' | kw= '\\u21D2' | kw= '=' | kw= '\\u2260' | kw= '\\u2227' | kw= '\\u2228' )
            int alt55=6;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt55=1;
                }
                break;
            case 52:
                {
                alt55=2;
                }
                break;
            case 53:
                {
                alt55=3;
                }
                break;
            case 54:
                {
                alt55=4;
                }
                break;
            case 55:
                {
                alt55=5;
                }
                break;
            case 56:
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
                    // InternalBSharp.g:3249:3: kw= '\\u21D4'
                    {
                    kw=(Token)match(input,51,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getInbuiltInfixAccess().getLeftRightDoubleArrowKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalBSharp.g:3255:3: kw= '\\u21D2'
                    {
                    kw=(Token)match(input,52,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getInbuiltInfixAccess().getRightwardsDoubleArrowKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalBSharp.g:3261:3: kw= '='
                    {
                    kw=(Token)match(input,53,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getInbuiltInfixAccess().getEqualsSignKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalBSharp.g:3267:3: kw= '\\u2260'
                    {
                    kw=(Token)match(input,54,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getInbuiltInfixAccess().getNotEqualToKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalBSharp.g:3273:3: kw= '\\u2227'
                    {
                    kw=(Token)match(input,55,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getInbuiltInfixAccess().getLogicalAndKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalBSharp.g:3279:3: kw= '\\u2228'
                    {
                    kw=(Token)match(input,56,FOLLOW_2); 

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


    // $ANTLR start "entryRuleWrappedInfix"
    // InternalBSharp.g:3288:1: entryRuleWrappedInfix returns [EObject current=null] : iv_ruleWrappedInfix= ruleWrappedInfix EOF ;
    public final EObject entryRuleWrappedInfix() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWrappedInfix = null;


        try {
            // InternalBSharp.g:3288:53: (iv_ruleWrappedInfix= ruleWrappedInfix EOF )
            // InternalBSharp.g:3289:2: iv_ruleWrappedInfix= ruleWrappedInfix EOF
            {
             newCompositeNode(grammarAccess.getWrappedInfixRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWrappedInfix=ruleWrappedInfix();

            state._fsp--;

             current =iv_ruleWrappedInfix; 
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
    // $ANTLR end "entryRuleWrappedInfix"


    // $ANTLR start "ruleWrappedInfix"
    // InternalBSharp.g:3295:1: ruleWrappedInfix returns [EObject current=null] : (otherlv_0= '[' ( ( (lv_inbuilt_1_0= ruleInbuiltInfix ) ) | ( (otherlv_2= RULE_ID ) ) ) otherlv_3= ']' ) ;
    public final EObject ruleWrappedInfix() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_inbuilt_1_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:3301:2: ( (otherlv_0= '[' ( ( (lv_inbuilt_1_0= ruleInbuiltInfix ) ) | ( (otherlv_2= RULE_ID ) ) ) otherlv_3= ']' ) )
            // InternalBSharp.g:3302:2: (otherlv_0= '[' ( ( (lv_inbuilt_1_0= ruleInbuiltInfix ) ) | ( (otherlv_2= RULE_ID ) ) ) otherlv_3= ']' )
            {
            // InternalBSharp.g:3302:2: (otherlv_0= '[' ( ( (lv_inbuilt_1_0= ruleInbuiltInfix ) ) | ( (otherlv_2= RULE_ID ) ) ) otherlv_3= ']' )
            // InternalBSharp.g:3303:3: otherlv_0= '[' ( ( (lv_inbuilt_1_0= ruleInbuiltInfix ) ) | ( (otherlv_2= RULE_ID ) ) ) otherlv_3= ']'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_52); 

            			newLeafNode(otherlv_0, grammarAccess.getWrappedInfixAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalBSharp.g:3307:3: ( ( (lv_inbuilt_1_0= ruleInbuiltInfix ) ) | ( (otherlv_2= RULE_ID ) ) )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( ((LA56_0>=51 && LA56_0<=56)) ) {
                alt56=1;
            }
            else if ( (LA56_0==RULE_ID) ) {
                alt56=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // InternalBSharp.g:3308:4: ( (lv_inbuilt_1_0= ruleInbuiltInfix ) )
                    {
                    // InternalBSharp.g:3308:4: ( (lv_inbuilt_1_0= ruleInbuiltInfix ) )
                    // InternalBSharp.g:3309:5: (lv_inbuilt_1_0= ruleInbuiltInfix )
                    {
                    // InternalBSharp.g:3309:5: (lv_inbuilt_1_0= ruleInbuiltInfix )
                    // InternalBSharp.g:3310:6: lv_inbuilt_1_0= ruleInbuiltInfix
                    {

                    						newCompositeNode(grammarAccess.getWrappedInfixAccess().getInbuiltInbuiltInfixParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_inbuilt_1_0=ruleInbuiltInfix();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getWrappedInfixRule());
                    						}
                    						set(
                    							current,
                    							"inbuilt",
                    							lv_inbuilt_1_0,
                    							"ac.soton.bsharp.BSharp.InbuiltInfix");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalBSharp.g:3328:4: ( (otherlv_2= RULE_ID ) )
                    {
                    // InternalBSharp.g:3328:4: ( (otherlv_2= RULE_ID ) )
                    // InternalBSharp.g:3329:5: (otherlv_2= RULE_ID )
                    {
                    // InternalBSharp.g:3329:5: (otherlv_2= RULE_ID )
                    // InternalBSharp.g:3330:6: otherlv_2= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getWrappedInfixRule());
                    						}
                    					
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_15); 

                    						newLeafNode(otherlv_2, grammarAccess.getWrappedInfixAccess().getFuncNameExpressionVariableCrossReference_1_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getWrappedInfixAccess().getRightSquareBracketKeyword_2());
            		

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
    // $ANTLR end "ruleWrappedInfix"


    // $ANTLR start "entryRuleInstance"
    // InternalBSharp.g:3350:1: entryRuleInstance returns [EObject current=null] : iv_ruleInstance= ruleInstance EOF ;
    public final EObject entryRuleInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstance = null;


        try {
            // InternalBSharp.g:3350:49: (iv_ruleInstance= ruleInstance EOF )
            // InternalBSharp.g:3351:2: iv_ruleInstance= ruleInstance EOF
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
    // InternalBSharp.g:3357:1: ruleInstance returns [EObject current=null] : (otherlv_0= 'Instance' ( ( ruleQualifiedName ) ) otherlv_2= '<' ( (otherlv_3= RULE_ID ) ) otherlv_4= '>' otherlv_5= '(' ( (lv_arguments_6_0= ruleRootExpression ) )? (otherlv_7= ',' ( (lv_arguments_8_0= ruleRootExpression ) ) )* otherlv_9= ')' ( (lv_name_10_0= RULE_ID ) )? ) ;
    public final EObject ruleInstance() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token lv_name_10_0=null;
        EObject lv_arguments_6_0 = null;

        EObject lv_arguments_8_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:3363:2: ( (otherlv_0= 'Instance' ( ( ruleQualifiedName ) ) otherlv_2= '<' ( (otherlv_3= RULE_ID ) ) otherlv_4= '>' otherlv_5= '(' ( (lv_arguments_6_0= ruleRootExpression ) )? (otherlv_7= ',' ( (lv_arguments_8_0= ruleRootExpression ) ) )* otherlv_9= ')' ( (lv_name_10_0= RULE_ID ) )? ) )
            // InternalBSharp.g:3364:2: (otherlv_0= 'Instance' ( ( ruleQualifiedName ) ) otherlv_2= '<' ( (otherlv_3= RULE_ID ) ) otherlv_4= '>' otherlv_5= '(' ( (lv_arguments_6_0= ruleRootExpression ) )? (otherlv_7= ',' ( (lv_arguments_8_0= ruleRootExpression ) ) )* otherlv_9= ')' ( (lv_name_10_0= RULE_ID ) )? )
            {
            // InternalBSharp.g:3364:2: (otherlv_0= 'Instance' ( ( ruleQualifiedName ) ) otherlv_2= '<' ( (otherlv_3= RULE_ID ) ) otherlv_4= '>' otherlv_5= '(' ( (lv_arguments_6_0= ruleRootExpression ) )? (otherlv_7= ',' ( (lv_arguments_8_0= ruleRootExpression ) ) )* otherlv_9= ')' ( (lv_name_10_0= RULE_ID ) )? )
            // InternalBSharp.g:3365:3: otherlv_0= 'Instance' ( ( ruleQualifiedName ) ) otherlv_2= '<' ( (otherlv_3= RULE_ID ) ) otherlv_4= '>' otherlv_5= '(' ( (lv_arguments_6_0= ruleRootExpression ) )? (otherlv_7= ',' ( (lv_arguments_8_0= ruleRootExpression ) ) )* otherlv_9= ')' ( (lv_name_10_0= RULE_ID ) )?
            {
            otherlv_0=(Token)match(input,57,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getInstanceAccess().getInstanceKeyword_0());
            		
            // InternalBSharp.g:3369:3: ( ( ruleQualifiedName ) )
            // InternalBSharp.g:3370:4: ( ruleQualifiedName )
            {
            // InternalBSharp.g:3370:4: ( ruleQualifiedName )
            // InternalBSharp.g:3371:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInstanceRule());
            					}
            				

            					newCompositeNode(grammarAccess.getInstanceAccess().getClassNameBSClassCrossReference_1_0());
            				
            pushFollow(FOLLOW_53);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getInstanceAccess().getLessThanSignKeyword_2());
            		
            // InternalBSharp.g:3389:3: ( (otherlv_3= RULE_ID ) )
            // InternalBSharp.g:3390:4: (otherlv_3= RULE_ID )
            {
            // InternalBSharp.g:3390:4: (otherlv_3= RULE_ID )
            // InternalBSharp.g:3391:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInstanceRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_54); 

            					newLeafNode(otherlv_3, grammarAccess.getInstanceAccess().getContextIClassInstanceCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,24,FOLLOW_24); 

            			newLeafNode(otherlv_4, grammarAccess.getInstanceAccess().getGreaterThanSignKeyword_4());
            		
            otherlv_5=(Token)match(input,20,FOLLOW_50); 

            			newLeafNode(otherlv_5, grammarAccess.getInstanceAccess().getLeftParenthesisKeyword_5());
            		
            // InternalBSharp.g:3410:3: ( (lv_arguments_6_0= ruleRootExpression ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==RULE_ID||LA57_0==18||LA57_0==20||LA57_0==44||(LA57_0>=46 && LA57_0<=48)||LA57_0==50) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalBSharp.g:3411:4: (lv_arguments_6_0= ruleRootExpression )
                    {
                    // InternalBSharp.g:3411:4: (lv_arguments_6_0= ruleRootExpression )
                    // InternalBSharp.g:3412:5: lv_arguments_6_0= ruleRootExpression
                    {

                    					newCompositeNode(grammarAccess.getInstanceAccess().getArgumentsRootExpressionParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_41);
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
                    break;

            }

            // InternalBSharp.g:3429:3: (otherlv_7= ',' ( (lv_arguments_8_0= ruleRootExpression ) ) )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==25) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // InternalBSharp.g:3430:4: otherlv_7= ',' ( (lv_arguments_8_0= ruleRootExpression ) )
            	    {
            	    otherlv_7=(Token)match(input,25,FOLLOW_26); 

            	    				newLeafNode(otherlv_7, grammarAccess.getInstanceAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalBSharp.g:3434:4: ( (lv_arguments_8_0= ruleRootExpression ) )
            	    // InternalBSharp.g:3435:5: (lv_arguments_8_0= ruleRootExpression )
            	    {
            	    // InternalBSharp.g:3435:5: (lv_arguments_8_0= ruleRootExpression )
            	    // InternalBSharp.g:3436:6: lv_arguments_8_0= ruleRootExpression
            	    {

            	    						newCompositeNode(grammarAccess.getInstanceAccess().getArgumentsRootExpressionParserRuleCall_7_1_0());
            	    					
            	    pushFollow(FOLLOW_41);
            	    lv_arguments_8_0=ruleRootExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getInstanceRule());
            	    						}
            	    						add(
            	    							current,
            	    							"arguments",
            	    							lv_arguments_8_0,
            	    							"ac.soton.bsharp.BSharp.RootExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop58;
                }
            } while (true);

            otherlv_9=(Token)match(input,21,FOLLOW_11); 

            			newLeafNode(otherlv_9, grammarAccess.getInstanceAccess().getRightParenthesisKeyword_8());
            		
            // InternalBSharp.g:3458:3: ( (lv_name_10_0= RULE_ID ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==RULE_ID) ) {
                int LA59_1 = input.LA(2);

                if ( (LA59_1==EOF||LA59_1==RULE_ID||LA59_1==42||LA59_1==45||LA59_1==57) ) {
                    alt59=1;
                }
            }
            switch (alt59) {
                case 1 :
                    // InternalBSharp.g:3459:4: (lv_name_10_0= RULE_ID )
                    {
                    // InternalBSharp.g:3459:4: (lv_name_10_0= RULE_ID )
                    // InternalBSharp.g:3460:5: lv_name_10_0= RULE_ID
                    {
                    lv_name_10_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(lv_name_10_0, grammarAccess.getInstanceAccess().getNameIDTerminalRuleCall_9_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getInstanceRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_10_0,
                    						"ac.soton.bsharp.BSharp.ID");
                    				

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
    // $ANTLR end "ruleInstance"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000001400002C000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001070L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000001400002C002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000014000020002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000010020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000840000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000022000501000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000001000100020L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000FFC000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0005D00000140020L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000008000800000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x000002A000501000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0200240000000020L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000900000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000200020L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0005D80000140030L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0005D00000140030L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000048000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000101000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000002200000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000040000001070L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000002001000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000800020L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0004000000140020L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x01F8000000000022L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000900002L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0005D00002340020L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x01F8000000000020L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000001000000L});

}